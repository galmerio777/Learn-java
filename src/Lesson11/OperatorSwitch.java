package Lesson11;

public class OperatorSwitch {

	public static final int FIRST = 1;
	public static final int SECOND = 4;
	public static final int THIRD = 3;

	public void foo(int value) {
		switch (value) {
			case OperatorSwitch.FIRST -> System.out.println("ferstValue");
			case OperatorSwitch.SECOND -> System.out.println("secondvalue");
			case OperatorSwitch.THIRD -> System.out.println("thirdValue");
			default -> System.out.println("Default");
		}
	}
}


