package ThingsToKnowJava;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks: ");
		int marks = sc.nextInt();
		if(marks >= 90){
            System.out.println("Grade A");
        }else if (marks >= 70){
            System.out.println("Grade B");
        }else if (marks >= 50){
            System.out.println("Grade C");
        }else if (marks >= 35){
            System.out.println("Grade D");
        }else{
            System.out.println("Fail");
        }
		System.out.println("Mark: "+ marks);
		sc.close();
	}

}
