package week1.day2;

public class MyCalculator {
	
	public static void main(String[] args) {
         Calculator calc = new Calculator();
         int totalSum = calc.add(32,43,65);
         System.out.println(totalSum);
         
         int mul = calc.mul(34, 2);
         System.out.println(mul);
         
	}    
         
}
