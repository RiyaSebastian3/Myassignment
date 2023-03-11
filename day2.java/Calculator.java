package week1.day2;

public class Calculator {
	
		
	  public int add(int a,int b,int c) {
		  int sum = a+b+c;
		  return(sum);
		  
	  }
	  
	  public int mul(int c, int d) {
		  return c*d;
		  
	  }
	  
	  public void Sub() {
	      System.out.println("no");
	  }

	  public static void main(String[] args) {
			// TODO Auto-generated method stub
		  Calculator obj = new Calculator();
			
			System.out.println(obj.add(3,5,8));
			System.out.println(obj.mul(3,5));
			

		}

	}
