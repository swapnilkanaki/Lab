package comPack.labWork20_4;
import java.util.*;

public class CommonElements {
	public static void CheckEle(int size,int[] arr1,int[] arr2,int[] arr3) {
		for(int i=0;i<size;i++){
			boolean b1,b2;
			int target=arr1[i];
			// It Check If Target Elemelt Present in Array
			b1=Arrays.stream(arr2).anyMatch(ele -> ele == target);
			b2=Arrays.stream(arr3).anyMatch(ele-> ele == target);
			if(b1 && b2){
				System.out.println(arr1[i]);
			}
		}
	}
    public static void main(String[] args) 
	{		
            int[] a1 = {1, 2, 3, 4, 5};
            int[] a2 = {2, 5, 4, 8};
            int[] a3 = {3, 4};

			int s1=a1.length,s2=a2.length,s3=a3.length; // It get Length of Arrays 

			// Call Method with Samll array for loop
			if(s1<s2 && s1<s3){
				CheckEle(s1,a1,a2,a3);
			}else if(s2 < s3){
				CheckEle(s2,a2,a1,a3);
			}else{
				CheckEle(s3,a3,a1,a2);
			}
			
		}
}
