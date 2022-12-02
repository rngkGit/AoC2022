import java.util.*;
import java.io.*;

public class Day2Pt2{
    public static void main(String[] args)throws FileNotFoundException{
        Scanner s = new Scanner(new File("C:/Users/kehaw/Desktop/Stuff/VSProjects/AoC2022/Day2/Day2.dat"));

        /*
         * RULES IN CODE:
         * 
         * A/1 = Rock
         * B/2 = Paper
         * C/3 = Scissors
         * 
         * X = Lose
         * Y = Draw
         * Z = Win
         * 
         */
        
        int youScore = 0;
        while (s.hasNextLine()){
            String oppo = s.next();
            String you = s.next();

            if (you.equals("X")){
                if (oppo.equals("A")){
                    youScore += 3 + 0;
                } else {
                    if (oppo.equals("B")){
                        youScore += 1 + 0;
                    } else youScore += 2 + 0;
                }
            }
            if (you.equals("Y")){
                if (oppo.equals("A")){
                    youScore += 1 + 3;
                } else {
                    if (oppo.equals("B")){
                        youScore += 2 + 3;
                    } else youScore += 3 + 3;
                }
            }
            if (you.equals("Z")){
                if (oppo.equals("A")){
                    youScore += 2 + 6;
                } else {
                    if (oppo.equals("B")){
                        youScore += 3 + 6;
                    } else youScore += 1 + 6;
                }
            }
        }

        System.out.println("Your new calculated score using strategy 2: " + youScore);
    }
}