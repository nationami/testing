package id.co.infoflow.testing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuestionTwo {
	
	public static void main(String[] args) {
		int vertices = 0;
		Map<String, Integer> result = new HashMap<String, Integer>();
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter vertices : ");

        while (!scanner.hasNextInt()) {
        	System.out.print("Please input number for vertices : ");
        	scanner.next();
        }
        
        vertices = scanner.nextInt();
        
        HashMap<String,Integer> edgesWeight = new HashMap<String,Integer>();
		
		for(int i=0;i<vertices;i++){
            System.out.println("Enter edges name : ");
            
            String edges = scanner.next();
            
            while(edgesWeight.containsKey(edges)){
            	System.out.println("Edges name already exists please input new name : ");
            	edges = scanner.next();
            }
            
            System.out.println("Enter edges weight : ");
            
            while (!scanner.hasNextInt()) {
            	System.out.println("Please input number weight : ");
            	scanner.next();
            }
            
            int weight = scanner.nextInt();
            edgesWeight.put(edges, weight);
		}
		
		result = edgesWeight
        		.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		
		System.out.println("Result : " + result);
    }

}
