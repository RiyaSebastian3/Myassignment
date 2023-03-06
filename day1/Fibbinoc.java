package week1.day1;

public class Fibbinoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub   
			 int firstNum=0,secNum=1,sum=0,num =13;
			 
			 System.out.print(firstNum);
			 System.out.print(secNum);
		
			    for(int i=firstNum;i<=num;++i)  
			 {  
			    	if(sum<=num) {
			    		sum=firstNum+secNum;    
					      
						  firstNum=secNum;    
						  secNum=sum; 
						  System.out.print(sum);
			    		
			    	}
			  
			 }    
			  
			} 

	}


