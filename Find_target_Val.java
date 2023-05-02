package comPack.labWork20_4;

public class Find_target_Val {
    public static boolean isElementPresent(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int arr[] = new int[] {0 , 1, 2, 3, 4, 5, 6, 7, 8, 9};

         int n = 6;

                n = arr[arr[n] / 2];

         System.out.println(arr[n] / 2);

        // int[] arr = {1, 2, 3, 4, 5};
        // int target = 3;
        // if (isElementPresent(arr, target)) {
        //     System.out.println("Target element is present in the array");
        // } else {
        //     System.out.println("Target element is not present in the array");
        // }
    }
}
