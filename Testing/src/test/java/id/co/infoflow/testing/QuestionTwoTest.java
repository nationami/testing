package id.co.infoflow.testing;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

public class QuestionTwoTest {

	@Test
	public void testMain() throws IOException {
		QuestionTwo two = new QuestionTwo();
		String input = "3\n";
		String input2 = "A\n";
		String input3 = "2\n";
		String input4 = "B\n";
		String input5 = "3\n";
		String input6 = "C\n";
		String input7 = "5\n";
		String lastInput = input.concat(input2).concat(input3).concat(input4).concat(input5).concat(input6).concat(input7);
	    InputStream in = new ByteArrayInputStream(lastInput.getBytes());
	    System.setIn(in);
	    String[] args = null;
	    two.main(args);
	}
	
	@Test
	public void testMainNegative() throws IOException {
		String input0 = "X\n";
		String input1 = "3\n";
		String input2 = "A\n";
		String input3 = "2\n";
		String input4 = "B\n";
		String input5 = "3\n";
		String input6 = "C\n";
		String input7 = "5\n";
		String lastInput = input0.concat(input1).concat(input2).concat(input3).concat(input4).concat(input5).concat(input6).concat(input7);
	    InputStream in = new ByteArrayInputStream(lastInput.getBytes());
	    System.setIn(in);
	    String[] args = null;
	    QuestionTwo.main(args);
	}
	
	@Test
	public void testMainNegative2() throws IOException {
		String input0 = "X\n";
		String input1 = "3\n";
		String input2 = "A\n";
		String input3 = "2\n";
		String input4 = "A\n";
		String input5 = "B\n";
		String input6 = "3\n";
		String input7 = "C\n";
		String input8 = "U\n";
		String input9 = "5\n";
		String lastInput = input0.concat(input1).concat(input2).concat(input3).concat(input4).concat(input5).concat(input6).concat(input7).concat(input8).concat(input9);
	    InputStream in = new ByteArrayInputStream(lastInput.getBytes());
	    System.setIn(in);
	    String[] args = null;
	    QuestionTwo.main(args);
	}
}
