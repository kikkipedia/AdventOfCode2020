import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

// Day 1


public class Day1 {

	public static void main(String[] args) throws java.io.IOException {
		
		Scanner scanner = new Scanner(new File("resources/input.txt"));
		ArrayList<Integer> inputs = new ArrayList<>();
		while(scanner.hasNext()) {
            if(scanner.hasNextInt()) {
                inputs.add(scanner.nextInt());
            } else {
                scanner.next();
            }
        }
        scanner.close();
        System.out.println(partOne(inputs));
        System.out.println(partTwo(inputs));
	}
	
	 public static int partOne(ArrayList<Integer> inputs) {
	        for(Integer entry1 : inputs) {
	            for(Integer entry2 : inputs) {
	                if(entry1 + entry2 == 2020) {
	                    return entry1 * entry2;
	                }
	            }
	        }
	        return 0;
	    }
	 
	 public static int partTwo(ArrayList<Integer> inputs) {
		 for(Integer entry1: inputs) {
			 for(Integer entry2: inputs) {
				 for(Integer entry3: inputs) {
					 if(entry1 + entry2 + entry3 == 2020) {
						 return entry1 * entry2 * entry3;
					 }
				 }
			 }
		 }
		 return 0;
	 }

}
