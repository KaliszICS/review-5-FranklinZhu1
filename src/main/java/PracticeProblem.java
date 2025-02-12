import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		q9();
		q10();
		q11();
		q12();
	}

	public static void q1() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		double d = in.nextDouble();
		in.nextLine();
		System.out.println(Math.abs(d));
	}

	public static void q2() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		double d = in.nextDouble();
		in.nextLine();
		System.out.print("Input another number: ");
		double e = in.nextDouble();
		in.nextLine();
		System.out.printf("%.1f\n%.1f\n", Math.floor(d/e), Math.ceil(d/e));
	}

	public static void q3() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		double d = in.nextDouble();
		in.nextLine();
		System.out.println(Math.round(Math.sqrt(d)));
	}

	public static void q4() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		double d = in.nextDouble();
		in.nextLine();
		System.out.print("Input another number: ");
		double e = in.nextDouble();
		in.nextLine();
		System.out.println(Math.pow(d, e));
	}

	public static void q5() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		double d = in.nextDouble();
		in.nextLine();
		System.out.print("Input another number: ");
		double e = in.nextDouble();
		in.nextLine();
		System.out.print("Input one more number: ");
		double f = in.nextDouble();
		in.nextLine();
		System.out.printf("%.1f\n%.1f\n", Math.max(Math.max(d, e), f), Math.min(Math.min(d, e), f));
	}
	public static void q6() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String s = in.nextLine();
		System.out.println(s.contains("on"));
	}
	public static void q7() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input the word mango: ");
		String s = in.nextLine();
		System.out.println(s.equalsIgnoreCase("mango"));		
	}
	public static void q8() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a word: ");
		String s = in.nextLine();
		System.out.print("Input a letter: ");
		String t = in.nextLine();
		System.out.printf("%s\n%s\n", s.indexOf(t), s.lastIndexOf(t));
	}

	public static void q9() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String s = in.nextLine();
		System.out.printf("Your sentence is %d characters long\n", s.length());
	}
	public static void q10() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String s = in.nextLine();
		System.out.print("Input a word to replace: ");
		String t = in.nextLine();
		System.out.print("What word would you like to replace it with: ");
		String u = in.nextLine();
		System.out.println(s.replaceAll(t, u));
	}

	public static void q11() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String s = in.nextLine().trim(), t;
		s = s.toUpperCase();
		t = s.toLowerCase();
		System.out.printf("%s\n%s\n", s, t);
	}

	public static void q12() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a word: ");
		String s = in.nextLine();
		System.out.printf("%s\n%s\n", s.substring(0, 4), s.substring(s.length() - 4));
	}
	

}
