package StringPractice;

import java.util.Scanner;

public class ReverseSentence {
	String sentence;

	public static void main(String[] args) {
		
		ReverseSentence obj1=new ReverseSentence();
		obj1.acceptinput();
		obj1.operation();
		
	}
	
	public void acceptinput()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a sentence");
		sentence=sc.next();
		sc.close();
		 
	}
	public void operation() {
		
		String rev="";
		for(int i=sentence.length()-1;i>=0;i--)
		{
			rev=rev+sentence.charAt(i);
			
		}
		System.out.print(rev);
		
	}

}
