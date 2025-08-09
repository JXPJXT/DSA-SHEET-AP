//Ques-10
//Platform: LeetCode 215 Medium 
//Companies:  Amazon Microsoft Walmart Adobe
import java.util.*;
public class KthLargestElementInArrQ10{
    public static void main(String[] args){
        int[] arr={3,2,1,5,6,4};
        int k=2;
        System.out.println(KthLargest(arr,k));
    }
    static int KthLargest(int[] arr,int k){
        if(arr.length<k||arr.length==0){
            return -1;
        }
        Arrays.sort(arr);
        int n=arr.length;
        return arr[n-k];
    }
}