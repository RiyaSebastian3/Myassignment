package week1.day2;

public class RemoveDuplicates {
	public static void main(String args[]) {
	
		
        String str = "We learn java basics as part of java sessions in java week1";
        String[] arrOfStr = str.split(" ", 12);
  
        for (String a : arrOfStr) {
           // System.out.println(a);
        	int n;
        	if(n ==0 || n==1) {
        		return n;
        		
        	}
        	int j = 0;
        	for (int i =0;i<n-1;i++) {
        		if (a[i]!= a[i + 1]) {
        			a[j++] = a[i];
        		}
        		
        	}
        }
    }
	
	
}


	
	
 
	    // public static void main(String[] args) {  
	      //  String string1 = "Great responsibility";  
	        //int count;  
	          
	        //Converts given string into character array  
	        //char string[] = string1.toCharArray();  
	          
	        //System.out.println("Duplicate characters in a given string: ");  
	        //Counts each character present in the string  
	        //for(int i = 0; i <string.length; i++) {  
	          //  count = 1;  
	            //for(int j = i+1; j <string.length; j++) {  
	              //  if(string[i] == string[j] && string[i] != ' ') {  
	                //    count++;  
	                    //Set string[j] to 0 to avoid printing visited character  
	                  //  string[j] = '0';  
	          //      }  
	            //}  
	            //A character is considered as duplicate if count is greater than 1  
	          //  if(count > 1 && string[i] != '0')  
	            //    System.out.println(string[i]);  
	        //}  
	    
	 
	     //}
//}

		
		/*
		 * Pseudo code 
		 
		 * a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";		
		 * b) Initialize an integer variable as count	  
		 * c) Split the String into array and iterate over it 
		 * d) Initialize another loop to check whether the word is there in the array
		 * e) if it is available then increase and count by 1. 
		 * f) if the count > 1 then replace the word as "" 
		 
		 * g) Displaying the String without duplicate words	
		 */



