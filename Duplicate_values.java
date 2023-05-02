package comPack.labWork20_4;

public class Duplicate_values {
    public static void main(String[] args) 
	{
		int[] a = {1,2,8,5,2,8}; 
		
		System.out.println("Duplicate nos are: ");
		 for(int i = 0; i < a.length; i++) 
		 {  
	            for(int j = i + 1; j < a.length; j++) 
	            {  
	                if(a[i] == a[j]) 
	                    System.out.println(a[j]);  
	            }  
	        }  
	}
}
