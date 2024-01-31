public class MergeSortCode {

    public static void printArr(int arr[]) {
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void MergeSort(int arr[], int si,int ei) {
        // Base Case
        if(si >= ei){
            return;
        }
        // Kaam
        int mid = si + (ei - si)/2; // (si+ei)/2
        MergeSort(arr,si,mid); // Left part
        MergeSort(arr, mid + 1, ei); // Right part
        Merge(arr, si, mid, ei);
    }
    public static void Merge(int arr[],int si,int mid,int ei){
        // left (0,3)=4 right(4,6)=3 -> 6-0+1
        int temp[] = new int[ei-si+1];
        int i = si;  // Iterator for left part
        int j = mid+1;  // Iterator for Right part
        int k = 0;   // Iterator for temp arr

        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++; 
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Left Part 
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        // Right part
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        // Copy temp to original arr
        for(k = 0, i= si; k<temp.length; k++,i++){
            arr[i] = temp[k];
        }
    }


    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        MergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
