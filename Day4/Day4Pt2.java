import java.util.*;
import java.io.*;

public class Day4Pt2 {
    public static void main(String[] args)throws FileNotFoundException {
        Scanner s = new Scanner(new File("C:/Users/kehaw/Desktop/Stuff/VSProjects/AoC2022/Day4/Day4.dat"));

        int sum = 0;

        while (s.hasNextLine()){
            Scanner s2 = new Scanner(s.nextLine().replace("-", " ").replace(",", " "));
            int elf1b = s2.nextInt();
            int elf1e = s2.nextInt();
            int elf2b = s2.nextInt();
            int elf2e = s2.nextInt();
            ArrayList<Integer> elf1 = new ArrayList<Integer>();
            ArrayList<Integer> elf2 = new ArrayList<Integer>();

            for (int i = elf1b; i <= elf1e; i++){
                elf1.add(i);
            }
            for (int i = elf2b; i <= elf2e; i++){
                elf2.add(i);
            }

            if (elf1.size() > elf2.size()){
                for (int i = 0; i < elf1.size(); i++){
                    if (elf2.contains(elf1.get(i))){
                        sum++;
                        break;
                    }
                }
            } else {
                for (int i = 0; i < elf2.size(); i++){
                    if (elf1.contains(elf2.get(i))){
                        sum++;
                        break;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
