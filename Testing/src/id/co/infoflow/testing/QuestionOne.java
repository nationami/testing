package id.co.infoflow.testing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class QuestionOne {
	
	public String store(HashMap<String,String> a){
		String result = null;
		for (HashMap.Entry<String, String> entry : a.entrySet()) {
	        String key = entry.getKey();
	        String value = entry.getValue();
	        result = key+"="+value+";\n";
	    }
		return result;
	}

	public HashMap<String,String> load(String text){
		HashMap<String,String> result= null;
		String[] commaSeparatedArr = text.split(";\n");
	    List<String> process = Arrays.stream(commaSeparatedArr).collect(Collectors.toList());
		for(String data : process){
			String[] splitData = data.split("=");
			result.put(splitData[0], splitData[1]);
		}
		return result;
	}
}
