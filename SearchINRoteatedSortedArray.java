import java.util.*;

public class SearchINRoteatedSortedArray {

    public static int Search(int arr[], int tar, int si, int ei){
        // Base Case
        if(si > ei){
            return -1;
        }

        // Kaam
        int mid = si + (ei - si)/2; // (si+ei)/2

        // case FOUND
        if(arr[mid] == tar){
            return mid;
        }

        //mid on L1
        if(arr[si] <= arr[mid]){
            // case a = left
            if(arr[si] <= tar && tar <= arr[mid]) {
                return Search(arr, tar, si, mid-1);
            }else{
                // case b: right
                return Search(arr, tar, mid+1, ei);
            }
        }
        //mid on l2
        else {
            // Case c : right
            if(arr[mid] <= tar && tar <= arr[ei]) {
                return Search(arr, tar, mid+1, ei);
            }else{
                // Case d : left
                return Search(arr, tar, si, mid-1);
            }

        } 
    }
    public static void main(String[] args) {
        
        int arr[] = {4,5,6,7,0,1,2};
        int target = 6; // output -> 4
        int TarIdx =  Search(arr, target,0, arr.length-1);
        System.out.println(TarIdx);

    }
}
