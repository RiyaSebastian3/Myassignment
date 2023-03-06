package week1.day1;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=13;
		String ans="prime";
		for(int i =2; i<n ;i++)
		{
			if(n%i==0)
			{
				ans =  "notprime";
				break;
			}
		}
        System.out.println(ans);
	}

}
