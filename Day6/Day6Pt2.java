import java.util.*;
import java.io.*;

public class Day6Pt2 {
    public static void main(String[] args)throws FileNotFoundException {
        Scanner s = new Scanner(new File("C:/Users/kehaw/Desktop/Stuff/VSProjects/AoC2022/Day6/Day6.dat"));
        String sI = s.nextLine(); //Scanner Input (scannerInput)
        int num = 0;
        int inpNum = 14; //The amount of characters the scanner reads plus one
        boolean con = true;
        for (int i = inpNum; i < sI.length(); i++){
            if (con){
                con = false;
                //Checks the first character and compares that character to the others
                for (int x = 0; x < inpNum; x++){
                    String sIWOL = sI.substring(i-inpNum, i-inpNum+x) + sI.substring(i-inpNum+x+1, i); //sI without letter
                    String sIJL = sI.substring(i-inpNum+x, i-inpNum+x+1); //sI just letter
                    System.out.println(sI.substring(i-inpNum, i));
                    System.out.println(sIWOL);
                    System.out.println(sIJL);
                    //This loop is the actaul process for checking the current x character
                    for (int z = 0; z < inpNum-1; z++){
                        if (sIWOL.contains(sIJL)){
                            con = true;
                            break;
                        }
                    }
                    if (con){
                        break;
                    }
                }
            } else {
                num = i-1;
                break;
            }
        }
        System.out.println(num);
    }
}