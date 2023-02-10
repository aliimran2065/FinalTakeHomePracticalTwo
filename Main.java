package FinalTakeHome;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	  
	doesFileExist(); 
	  
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a word: ");
    String word = sc.nextLine();

    try (BufferedReader reader = new BufferedReader(new FileReader("/Users/aliimran/eclipse-workspace/PracticalTwo/src/Data/Dictionary "))) {
      String line;
      while ((line = reader.readLine()) != null) {
        String[] parts = line.split(":");
        if (parts[0].equalsIgnoreCase(word)) {
          System.out.println("Meaning of '" + word + "': " + parts[1]);
          break;
        }
      }
    } catch (IOException e) {
      System.out.println("An error occurred while reading the file: " + e.getMessage());
    }
  }


	
	public static void doesFileExist() {
	File file = new File("/PracticalTwo/src/Data/Dictionary");
	
	Scanner sc = new Scanner(System.in);
    System.out.print("Please enter the name of the file you're looking for: ");
    String fileName = sc.nextLine();
    
    if(fileName.equalsIgnoreCase("Dictionary")) {
    	System.out.println("This file does exist");
    }else {
    	System.out.println("File does not exist");
    }
	
	}
}
