import java.io.*;
import java.util.*;

public class Day3Pt1 {
    public static void main(String[] args)throws FileNotFoundException {
        Scanner s = new Scanner(new File("C:/Users/kehaw/Desktop/Stuff/VSProjects/AoC2022/Day3/Day3.dat"));
        int sum = 0;
        while (s.hasNextLine()){
            String temp = s.nextLine();
            String beg = temp.substring(0, temp.length()/2);
            String end = temp.substring(temp.length()/2);
            char let = 'A';
            int letASC = 0;
            int tempNum = 0;

            for (int i = 0; i < beg.length(); i++){
                if (beg.contains(end.substring(i, i+1))){
                    let = end.charAt(i);
                    letASC = (int)let;
                }
            }
            if (letASC <= 90){
                tempNum = letASC - 38;
            } else tempNum = letASC - 96;
            sum += tempNum;
        }
        System.out.println(sum);
    }
}
