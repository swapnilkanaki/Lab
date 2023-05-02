package comPack.labWork20_4;
import java.util.Arrays;
/**
 * Find_all_pairs
 */
public class Find_all_pairs {

    public static void main(String args[])
    {
        int[] arr = {4, 2,6,7,5,4 };
        int sum = 8;
        getPairsCount(arr, sum);
    }
 
    public static void getPairsCount(int[] arr, int sum)
    { 
        int count = 0;  
        int temp[]=new int[arr.length];
        temp[0]=sum-arr[0];

        for(int i=1;i<arr.length;i++){
            int target=arr[i];
            if(Arrays.stream(temp).anyMatch(element -> element == target)){
                System.out.print(arr[i]+" , ");
                System.out.println(sum-target);
            }else{
                temp[i]=sum-target;
            }

        }
        // for (int i = 0; i < arr.length; i++)
        //     for (int j = i + 1; j < arr.length; j++)
        //         if ((arr[i] + arr[j]) == sum)
        //             count++;
 
        System.out.printf("Count of pairs is %d", count);
    }
    
}
