import java.io.*;
import java.util.*;
public class Findingword {
   public static void main(String args[]) throws FileNotFoundException {
// long startTime = System.currentTimeMillis();
      int count =0;
      
      //Reading the contents of the file
      Scanner sc=new Scanner (new FileInputStream("C:\\Users\\hi\\Desktop\\exter\\find_words.txt"));
      Scanner sc2 = new Scanner(new FileInputStream("C:\\Users\\hi\\Desktop\\exter\\t8.shakespeare.txt"));
      Scanner replace=new Scanner (new FileInputStream("C:\\Users\\hi\\Desktop\\exter\\french_dictionary.csv"));
      
     while(sc.hasNextLine()) {
           String word = sc.nextLine();//to find the word to be replaced
     while(sc2.hasNextLine()) {
         String line = sc2.nextLine();//assigns the current word to the variable, line
         if(line.indexOf(word)!=-1) { //if the given word is present in the line
          replace.useDelimiter(",");
        while (replace.hasNext()) {
           String rplc= replace.next();
           line = line.replaceAll(word,rplc);
           System.out.println(line);
           count=count+1;
             }
           }
      
         }
         System.out.println("the count for " + word +"is:" +count);
         count=0;
       }
// long endTime = System.currentTimeMillis();
       // System.out.println("It took " + (endTime - startTime) + "milliseconds");
  }
}

