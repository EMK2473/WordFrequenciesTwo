package WordFrequenciesTwo;

import java.util.Scanner; 

public class WordFrequenciesTwo {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      String input = scnr.nextLine();
      String[] stringArray = input.split(" ");

      for(int i = 1; i < stringArray.length; ++i) {
        String searchWord = stringArray[i];

        int frequency = 0;

        for(int j = 0; j < stringArray.length; ++j){
            if(stringArray[j].equals(searchWord)) {
                frequency++;
            }
        }
        System.out.println(searchWord + " - " + frequency);
      }
      scnr.close();
   }
}
