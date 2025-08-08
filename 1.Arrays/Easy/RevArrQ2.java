// Ques-2
//Platform GFG
//Companies: Infosys Moonfrog Labs
public class RevArrQ2 {
    public static void main(String args[]){
    int[] arr = {1, 2, 3, 4, 5};
    reverseArray(arr);
    for (int num : arr) {
        System.out.print(num + " ");
    }
    }
    static void reverseArray(int arr[]) {
        int l=0;
        int r=arr.length-1;
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
}