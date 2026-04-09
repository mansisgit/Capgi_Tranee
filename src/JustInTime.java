import java.util.Arrays;

public class JustInTime {
    public static void main(String[] args) {
        int[] arr = {-5, -2, -8, -1};
        System.out.println(maximum(arr));
    }

    public static int maximum(int[] arr){
        if(arr==null || arr.length==0) {
            System.out.println("array is empty!");
            return -1;
        }

        int len = arr.length;

        if(len==1) return arr[0];

        int max = Integer.MIN_VALUE;

        for(int i=0;i<len;i++){
            max=Math.max(max,arr[i]);
        }

        return max;
    }

    public static int occurances (int[] arr,int target){
        int count =0;
        for(int ele : arr){
            if(ele==target)count++;
        }
        return count;
    }
}
