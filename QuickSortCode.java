public class QuickSortCode {

    public static void partArr(int arr[]) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void QuickSort(int arr[], int si, int ei){

        if(si >= ei){
            return;
        }
        // last element
        int pidx = partiton(arr,si,ei);
        QuickSort(arr, si, pidx-1); // left
        QuickSort(arr , pidx+1, ei); // right

    }

    public static int partiton(int arr[],int si,int ei) {

        int pivot = arr[ei];
        int i = si-1; // to make place for els smaller than pivot

        for(int j = si; j < ei; j++){
            if(arr[j] <= pivot) {
                i++;
                // Swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        // Swap
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void main(String[] args) {
        
        int arr[] = {6,3,9,8,2,5};
        QuickSort(arr, 0, arr.length-1);
        partArr(arr);
    }
}
