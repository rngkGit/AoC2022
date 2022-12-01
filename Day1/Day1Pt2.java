import java.util.*;
import java.io.*;

public class Day1Pt2 {
    public static void main(String[] args)throws FileNotFoundException{
        Scanner s = new Scanner(new File("C:/Users/kehaw/Desktop/Stuff/VSProjects/AoC2022/Day1/Day1.dat"));
        int largest1 = 0;
        int largest2 = 0;
        int largest3 = 0;
        while (s.hasNextLine()){
            String temp = s.nextLine();
            int largestTemp = 0;
            while (!temp.equals("")){
                largestTemp += Integer.parseInt(temp);
                if (s.hasNextLine()){
                    temp = s.nextLine();
                } else break;
            }
            if (largestTemp > largest1){
                largest3 = largest2;
                largest2 = largest1;
                largest1 = largestTemp;
            } else if (largestTemp > largest2){
                largest3 = largest2;
                largest2 = largestTemp;
            } else if (largestTemp > largest3){
                largest3 = largestTemp;
            }
        }
        System.out.println(largest1+largest2+largest3);
    }
}
