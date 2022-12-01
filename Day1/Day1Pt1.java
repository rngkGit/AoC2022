import java.util.*;
import java.io.*;

public class Day1Pt1 {
    public static void main(String[] args)throws FileNotFoundException{
        Scanner s = new Scanner(new File("C:/Users/kehaw/Desktop/Stuff/VSProjects/AoC2022/Day1/Day1.dat"));
        int largest = 0;
        while (s.hasNextLine()){
            String temp = s.nextLine();
            int largestTemp = 0;
            while (!temp.equals("")){
                largestTemp += Integer.parseInt(temp);
                if (s.hasNextLine()){
                    temp = s.nextLine();
                } else break;
            }
            if (largestTemp > largest){
                largest = largestTemp;
            }
        }
        System.out.println(largest);
    }
}
