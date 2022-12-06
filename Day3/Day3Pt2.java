import java.io.*;
import java.util.*;

public class Day3Pt2 {
    public static void main(String[] args)throws FileNotFoundException {
        Scanner s = new Scanner(new File("C:/Users/kehaw/Desktop/Stuff/VSProjects/AoC2022/Day3/Day3.dat"));
        int sum = 0;
        while (s.hasNextLine()){
            String line1 = s.nextLine();
            String line2 = s.nextLine();
            String line3 = s.nextLine();
            char let = 'A';
            int letASC = 0;
            int tempNum = 0;
            
            if (line1.length() > line2.length() || line1.length() > line3.length()){
                for (int i = 0; i < line1.length(); i++){
                    if (line2.contains(line1.substring(i, i+1)) && line3.contains(line1.substring(i, i+1))){
                        let = line1.charAt(i);
                    }
                }
            }
            if (line2.length() > line1.length() || line2.length() > line3.length()){
                for (int i = 0; i < line2.length(); i++){
                    if (line1.contains(line2.substring(i, i+1)) && line3.contains(line2.substring(i, i+1))){
                        let = line2.charAt(i);
                    }
                }
            }
            if (line3.length() > line1.length() || line3.length() > line2.length()){
                for (int i = 0; i < line3.length(); i++){
                    if (line1.contains(line3.substring(i, i+1)) && line2.contains(line3.substring(i, i+1))){
                        let = line3.charAt(i);
                    }
                }
            }
            letASC = (int)let;

            if (letASC <= 90){
                tempNum = letASC - 38;
            } else tempNum = letASC - 96;
            sum += tempNum;
        }
        System.out.println(sum);
    }
}
