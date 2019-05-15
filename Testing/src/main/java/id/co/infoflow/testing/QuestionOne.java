package id.co.infoflow.testing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class QuestionOne {
	
	public String store(HashMap<String,String> a){
		String result = "";
		for (HashMap.Entry<String, String> entry : a.entrySet()) {
	        String key = entry.getKey();
	        String value = entry.getValue();
	        result = result.concat(key).concat("=").concat(value).concat(";\n");
	    }
		return result;
	}

	public HashMap<String,String> load(String text){
		HashMap<String,String> result= new HashMap<String,String>();
		String[] commaSeparatedArr = text.split(";\n");
	    List<String> process = Arrays.stream(commaSeparatedArr).collect(Collectors.toList());
		for(String data : process){
			String[] splitData = data.split("=");
			result.put(splitData[0], splitData[1]);
		}
		return result;
	}
	
	public static void main(String[] args) {
		String testing = "key1=value1;\nkey2=value2;\nkey3=value3;\n";
		QuestionOne test = new QuestionOne();
		System.out.println(test.load(testing));
		HashMap<String,String> map = test.load(testing);
		System.out.println(test.store(map));
	}
}
