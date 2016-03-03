import java.util.Scanner;

public class SimpleStringReverser {
	private Scanner keyboard;
	private StringBuffer stringBuff;
	private static SimpleStringReverser program;

	public static void main(String[] args) {
		program = new SimpleStringReverser();
	}

	public SimpleStringReverser(){
		keyboard = new Scanner(System.in);
		System.out.println("Please enter a string to be reversed.");
		stringBuff = new StringBuffer(keyboard.nextLine());
		System.out.println(stringBuff.reverse().toString());
	}
}
