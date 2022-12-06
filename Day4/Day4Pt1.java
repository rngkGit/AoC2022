import java.util.*;
import java.io.*;

public class Day4Pt1 {
    public static void main(String[] args)throws FileNotFoundException {
        Scanner s = new Scanner(new File("C:/Users/kehaw/Desktop/Stuff/VSProjects/AoC2022/Day4/Day4.dat"));

        int sum = 0;

        while (s.hasNextLine()){
            Scanner s2 = new Scanner(s.nextLine().replace("-", " ").replace(",", " "));
            int elf1b = s2.nextInt();
            int elf1e = s2.nextInt();
            int elf2b = s2.nextInt();
            int elf2e = s2.nextInt();

            if (((elf1b >= elf2b) && (elf1e <= elf2e)) || ((elf2b >= elf1b) && (elf2e <= elf1e))){
                sum++;
            }
        }
        System.out.println(sum);
    }
}