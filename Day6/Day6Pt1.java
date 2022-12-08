import java.util.*;
import java.io.*;

public class Day6Pt1 {
    public static void main(String[] args)throws FileNotFoundException {
        Scanner s = new Scanner(new File("C:/Users/kehaw/Desktop/Stuff/VSProjects/AoC2022/Day6/Day6.dat"));
        String sI = s.nextLine(); //Scanner Input (scannerInput)
        int num = 0;
        boolean con = true;
        for (int i = 4; i < sI.length()-5; i++){
            if (con){
            if (!(sI.substring(i-4, i-3).equals(sI.substring(i-3, i-2)) || sI.substring(i-4, i-3).equals(sI.substring(i-2, i-1)) || sI.substring(i-4, i-3).equals(sI.substring(i-1, i))) && !(sI.substring(i-3, i-2).equals(sI.substring(i-4, i-3)) || sI.substring(i-3, i-2).equals(sI.substring(i-2, i-1)) || sI.substring(i-3, i-2).equals(sI.substring(i-1, i))) && !(sI.substring(i-2, i-1).equals(sI.substring(i-3, i-2)) || sI.substring(i-2, i-1).equals(sI.substring(i-4, i-3)) || sI.substring(i-2, i-1).equals(sI.substring(i-1, i))) && !(sI.substring(i-1, i).equals(sI.substring(i-3, i-2)) || sI.substring(i-1, i).equals(sI.substring(i-2, i-1)) || sI.substring(i-1, i).equals(sI.substring(i-4, i-3)))){
                num = i;
                break;
                }
            }
        }
        System.out.println(num);
    }
}