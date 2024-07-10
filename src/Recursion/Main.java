package Recursion;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,36,4};

        System.out.println(sortarray(arr,0));
    }

    static boolean sortarray(int[] arr,int index)
    {
        if(index == arr.length - 1)
        {
            return true;
        }

        return arr[index] < arr[index+1] && sortarray(arr,index+1);

    }
}
