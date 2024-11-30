public class LinearSearch {
    static boolean search(int[] arr, int key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==key) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr ={12,43,87, 0,90, 76 };
        //return whether 0 is present or not?
        System.out.println(search(arr, 1));
    }
}