
	import java.util.Scanner;

	public class Student {
	    public static void main(String[] args) {


	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the marks for Student 1 ");
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();
	        int x = a + b + c;

	        System.out.println("Enter the marks for Student 2 ");
	        int d = sc.nextInt();
	        int e = sc.nextInt();
	        int f = sc.nextInt();
	        int y = d + e + f;

	        System.out.println("Enter the marks for Student 3");
	        int g = sc.nextInt();
	        int h = sc.nextInt();
	        int i = sc.nextInt();
	        int z = g + h + i;

	        int total_marks = a + b + c + d + e + f + g + h + i;
	        System.out.println("Total marks of all the students in all subjects : " + total_marks);

	        float avg_marks = (x + y + z) / 3;
	        System.out.println("Average marks of all the students in all subjects : " + avg_marks);

	        float sub_A = a + d + g;
	        System.out.println("Total marks scored by students in subject A : " + sub_A);
	        System.out.println(" Average marks scored by students in subject A : " + (sub_A) / 3);

	        int sub_B = b + e + h;
	        System.out.println("Total marks scored by students in subject B : " + sub_B);
	        System.out.println(" Average marks scored by students in subject B : " + (sub_B) / 3);

	        int sub_C = c + f + i;
	        System.out.println("Total marks scored by students in subject C : " + sub_C);
	        System.out.println(" Average marks scored by students in subject C : " + (sub_C) / 3);
	    }
	}

