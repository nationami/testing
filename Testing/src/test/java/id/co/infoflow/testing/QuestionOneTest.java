package id.co.infoflow.testing;

import java.io.IOException;
import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;



public class QuestionOneTest {
	
	@Test
	public void loadTest(){
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		String testing = "key1=value1;\nkey2=value2;\nkey3=value3;\n";
		QuestionOne test = new QuestionOne();
		HashMap<String,String> result = test.load(testing);
		Assert.assertEquals(map, result);
	}
	
	@Test
	public void storeTest(){
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		String testing = "key1=value1;\nkey2=value2;\nkey3=value3;\n";
		QuestionOne test = new QuestionOne();
		String result = test.store(map);
		Assert.assertEquals(testing, result);
	}
	
	@Test
	public void testMain() throws IOException {
	    String[] args = null;
	    QuestionOne.main(args);
	}

}
