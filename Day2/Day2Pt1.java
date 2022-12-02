import java.util.*;
import java.io.*;

public class Day2Pt1{
    public static void main(String[] args)throws FileNotFoundException{
        Scanner s = new Scanner(new File("C:/Users/kehaw/Desktop/Stuff/VSProjects/AoC2022/Day2/Day2.dat"));

        /*
         * RULES IN CODE:
         * 
         * A/X/1 = Rock
         * B/Y/2 = Paper
         * C/Z/3 = Scissors
         * 
         */
        
        int youScore = 0;
        while (s.hasNextLine()){
            String oppo = s.next();
            String you = s.next();

            if (you.equals("X")){
                if (oppo.equals("A")){
                    youScore += 1 + 3;
                } else {
                    if (oppo.equals("C")){
                        youScore += 1 + 6;
                    } else youScore += 1;
                }
            }
            if (you.equals("Y")){
                if (oppo.equals("A")){
                    youScore += 2 + 6;
                } else {
                    if (oppo.equals("B")){
                        youScore += 2 + 3;
                    } else youScore += 2;
                }
            }
            if (you.equals("Z")){
                if (oppo.equals("B")){
                    youScore += 3 + 6;
                } else {
                    if (oppo.equals("C")){
                        youScore += 3 + 3;
                    } else youScore += 3;
                }
            }
        }

        System.out.println("Your score: " + youScore);
    }
}