public class ReverseArray {
    static int[] reverse(int[] arr){
        int n=arr.length;
        int start=0;
        int end=n-1;
        while (end>start) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr={9,3,7,2,0};
        arr=reverse(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
