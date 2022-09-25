/**
 * 
 */
package Averagecalcu;
import java.util.*;
public class Averagecalcu {
	public static void main(String[] args) {
		average();
		/*
		Scanner input = new Scanner(System.in);
		float sumGrade, firstGrade, secondGrade, thirdGrade, fourthGrade, fifthGrade;
		
		System.out.print("Enter First Grade: ");
		firstGrade = input.nextFloat();
		System.out.print("Enter Second Grade: ");
		secondGrade = input.nextFloat();
		System.out.print("Enter Third Grade: ");
		thirdGrade = input.nextFloat();
		System.out.print("Enter Fourth Grade: ");
		fourthGrade = input.nextFloat();
		System.out.print("Enter Fifth Grade: ");
		fifthGrade = input.nextFloat();
		
		sumGrade = firstGrade + secondGrade + thirdGrade + fourthGrade + fifthGrade;
		System.out.print("Total Average is: " + sumGrade / 5);
		*/
	}
	
	public static Scanner input = new Scanner(System.in);
	public static void average() {	
		float sum = 0, grade;	
		for(int i = 1; i <= 5; i++) {
			System.out.print("ENTER " + i + " GRADE: ");
			grade = input.nextFloat();
			sum += grade;
				
	
		}
			System.out.print("TOTAL AVERAGE: " + sum / 5);
			
	}
	
}

