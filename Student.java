package anil_questions;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num_of_students, sum=0, avg=0;
		//String name; 
		
		
		System.out.println("Enter the number of students: ");
		Scanner s = new Scanner(System.in);
		
		num_of_students = s.nextInt();
		
		int marks[] = new int[num_of_students];
		
		for(int i=0; i< num_of_students; i++){
			marks[i] = s.nextInt();
			sum = sum + marks[i];
		}
		
		int temp = 0;
		int largest_number=0;
		for(int j=0; j < num_of_students; j++){
			if (marks[j] > temp){
				temp = marks[j];
			} else{
				temp = temp;
			}
			largest_number = temp;
		}
		
		System.out.println("total marks = "+ sum);
		System.out.println("the maximum score in the class is " + largest_number);

//		Student[] arr = new Student[10];
		
		
		
	}		
	
	
}
