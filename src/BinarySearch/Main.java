package BinarySearch;

public class Main {
    public static void main(String[] args) {
        int[] arr ={5,7,8,9,10};
        int start = 0,target = 9;

        int end = arr.length-1;

        while(start < end)
        {
            int mid = start + end / 2;
            if(arr[mid] == target)
            {
                System.out.println(mid);
                break;
            }
            if(target < arr[mid])
            {
                end = mid-1;
            }
            if(target > arr[mid])
            {
                start = mid + 1;
            }
        }
        System.out.println(-1); 
    }
}
