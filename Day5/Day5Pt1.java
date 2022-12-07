import java.io.*;
import java.util.*;

public class Day5Pt1 {
    public static void main(String[] args)throws FileNotFoundException {
        /*
         * 
         * 
         * 
         * 
         * 
         * 
         * THIS CODE IS NOT PART ONE, I SCREWED THIS UP :(
         * 
         * ALL INPUT IS MANUAL AND WILL NOT WORK WITH YOUR INPUT
         * 
         * 
         * 
         * 
         * 
         */
        Scanner s = new Scanner(new File("C:/Users/kehaw/Desktop/Stuff/VSProjects/AoC2022/Day5/Day5.dat"));
        Stack<String> row1 = new Stack<String>();
        Stack<String> row2 = new Stack<String>();
        Stack<String> row3 = new Stack<String>();
        Stack<String> row4 = new Stack<String>();
        Stack<String> row5 = new Stack<String>();
        Stack<String> row6 = new Stack<String>();
        Stack<String> row7 = new Stack<String>();
        Stack<String> row8 = new Stack<String>();
        Stack<String> row9 = new Stack<String>();
        String temp = "";
        String finalString = "";

        //Manually Entered Input
        Scanner manual = new Scanner(new File("C:/Users/kehaw/Desktop/Stuff/VSProjects/AoC2022/Day5/Day5Manual.dat"));
        int n = 0;
        int i = 0;

        //Row1
        n = Integer.parseInt(manual.nextLine());
        i = 0;
        temp = manual.nextLine();
        while (i < n){
            row1.push(temp.substring(i, i+1));
            i++;
        }

        //Row2
        n = Integer.parseInt(manual.nextLine());
        i = 0;
        temp = manual.nextLine();
        while (i < n){
            row2.push(temp.substring(i, i+1));
            i++;
        }

        //Row3
        n = Integer.parseInt(manual.nextLine());
        i = 0;
        temp = manual.nextLine();
        while (i < n){
            row3.push(temp.substring(i, i+1));
            i++;
        }

        //Row4
        n = Integer.parseInt(manual.nextLine());
        i = 0;
        temp = manual.nextLine();
        while (i < n){
            row4.push(temp.substring(i, i+1));
            i++;
        }

        //Row5
        n = Integer.parseInt(manual.nextLine());
        i = 0;
        temp = manual.nextLine();
        while (i < n){
            row5.push(temp.substring(i, i+1));
            i++;
        }

        //Row6
        n = Integer.parseInt(manual.nextLine());
        i = 0;
        temp = manual.nextLine();
        while (i < n){
            row6.push(temp.substring(i, i+1));
            i++;
        }

        //Row7
        n = Integer.parseInt(manual.nextLine());
        i = 0;
        temp = manual.nextLine();
        while (i < n){
            row7.push(temp.substring(i, i+1));
            i++;
        }

        //Row8
        n = Integer.parseInt(manual.nextLine());
        i = 0;
        temp = manual.nextLine();
        while (i < n){
            row8.push(temp.substring(i, i+1));
            i++;
        }

        //Row9
        n = Integer.parseInt(manual.nextLine());
        i = 0;
        temp = manual.nextLine();
        while (i < n){
            row9.push(temp.substring(i, i+1));
            i++;
        }


        /*
         * LOGISTIC CODE
         * 
         */

        while (s.hasNextLine()){
            s.next();
            int move = s.nextInt();
            s.next();
            int from = s.nextInt();
            s.next();
            int to = s.nextInt();

            if (from == 1){
                for (int x = move; x > 0; x--){
                    if (to == 2){
                        row2.push(row1.get(row1.size()-x));
                        row1.remove(row1.size()-x);
                    }
                    if (to == 3){
                        row3.push(row1.get(row1.size()-x));
                        row1.remove(row1.size()-x);
                    }
                    if (to == 4){
                        row4.push(row1.get(row1.size()-x));
                        row1.remove(row1.size()-x);
                    }
                    if (to == 5){
                        row5.push(row1.get(row1.size()-x));
                        row1.remove(row1.size()-x);
                    }
                    if (to == 6){
                        row6.push(row1.get(row1.size()-x));
                        row1.remove(row1.size()-x);
                    }
                    if (to == 7){
                        row7.push(row1.get(row1.size()-x));
                        row1.remove(row1.size()-x);
                    }
                    if (to == 8){
                        row8.push(row1.get(row1.size()-x));
                        row1.remove(row1.size()-x);
                    }
                    if (to == 9){
                        row9.push(row1.get(row1.size()-x));
                        row1.remove(row1.size()-x);
                    }
                }
            }

            if (from == 2){
                for (int x = move; x > 0; x--){
                    if (to == 1){
                        row1.push(row2.get(row2.size()-x));
                        row2.remove(row2.size()-x);
                    }
                    if (to == 3){
                        row3.push(row2.get(row2.size()-x));
                        row2.remove(row2.size()-x);
                    }
                    if (to == 4){
                        row4.push(row2.get(row2.size()-x));
                        row2.remove(row2.size()-x);
                    }
                    if (to == 5){
                        row5.push(row2.get(row2.size()-x));
                        row2.remove(row2.size()-x);
                    }
                    if (to == 6){
                        row6.push(row2.get(row2.size()-x));
                        row2.remove(row2.size()-x);
                    }
                    if (to == 7){
                        row7.push(row2.get(row2.size()-x));
                        row2.remove(row2.size()-x);
                    }
                    if (to == 8){
                        row8.push(row2.get(row2.size()-x));
                        row2.remove(row2.size()-x);
                    }
                    if (to == 9){
                        row9.push(row2.get(row2.size()-x));
                        row2.remove(row2.size()-x);
                    }
                }
            }

            if (from == 3){
                for (int x = move; x > 0; x--){
                    if (to == 2){
                        row2.push(row3.get(row3.size()-x));
                        row3.remove(row3.size()-x);
                    }
                    if (to == 1){
                        row1.push(row3.get(row3.size()-x));
                        row3.remove(row3.size()-x);
                    }
                    if (to == 4){
                        row4.push(row3.get(row3.size()-x));
                        row3.remove(row3.size()-x);
                    }
                    if (to == 5){
                        row5.push(row3.get(row3.size()-x));
                        row3.remove(row3.size()-x);
                    }
                    if (to == 6){
                        row6.push(row3.get(row3.size()-x));
                        row3.remove(row3.size()-x);
                    }
                    if (to == 7){
                        row7.push(row3.get(row3.size()-x));
                        row3.remove(row3.size()-x);
                    }
                    if (to == 8){
                        row8.push(row3.get(row3.size()-x));
                        row3.remove(row3.size()-x);
                    }
                    if (to == 9){
                        row9.push(row3.get(row3.size()-x));
                        row3.remove(row3.size()-x);
                    }
                }
            }

            if (from == 4){
                for (int x = move; x > 0; x--){
                    if (to == 2){
                        row2.push(row4.get(row4.size()-x));
                        row4.remove(row4.size()-x);
                    }
                    if (to == 1){
                        row1.push(row4.get(row4.size()-x));
                        row4.remove(row4.size()-x);
                    }
                    if (to == 3){
                        row3.push(row4.get(row4.size()-x));
                        row4.remove(row4.size()-x);
                    }
                    if (to == 5){
                        row5.push(row4.get(row4.size()-x));
                        row4.remove(row4.size()-x);
                    }
                    if (to == 6){
                        row6.push(row4.get(row4.size()-x));
                        row4.remove(row4.size()-x);
                    }
                    if (to == 7){
                        row7.push(row4.get(row4.size()-x));
                        row4.remove(row4.size()-x);
                    }
                    if (to == 8){
                        row8.push(row4.get(row4.size()-x));
                        row4.remove(row4.size()-x);
                    }
                    if (to == 9){
                        row9.push(row4.get(row4.size()-x));
                        row4.remove(row4.size()-x);
                    }
                }
            }

            if (from == 5){
                for (int x = move; x > 0; x--){
                    if (to == 2){
                        row2.push(row5.get(row5.size()-x));
                        row5.remove(row5.size()-x);
                    }
                    if (to == 1){
                        row1.push(row5.get(row5.size()-x));
                        row5.remove(row5.size()-x);
                    }
                    if (to == 3){
                        row3.push(row5.get(row5.size()-x));
                        row5.remove(row5.size()-x);
                    }
                    if (to == 4){
                        row4.push(row5.get(row5.size()-x));
                        row5.remove(row5.size()-x);
                    }
                    if (to == 6){
                        row6.push(row5.get(row5.size()-x));
                        row5.remove(row5.size()-x);
                    }
                    if (to == 7){
                        row7.push(row5.get(row5.size()-x));
                        row5.remove(row5.size()-x);
                    }
                        if (to == 8){
                        row8.push(row5.get(row5.size()-x));
                        row5.remove(row5.size()-x);
                    }
                    if (to == 9){
                        row9.push(row5.get(row5.size()-x));
                        row5.remove(row5.size()-x);
                    }
                }
            }

            if (from == 6){
                for (int x = move; x > 0; x--){
                    if (to == 2){
                        row2.push(row6.get(row6.size()-x));
                        row6.remove(row6.size()-x);
                    }
                    if (to == 1){
                        row1.push(row6.get(row6.size()-x));
                        row6.remove(row6.size()-x);
                    }
                    if (to == 3){
                        row3.push(row6.get(row6.size()-x));
                        row6.remove(row6.size()-x);
                    }
                    if (to == 4){
                        row4.push(row6.get(row6.size()-x));
                        row6.remove(row6.size()-x);
                    }
                    if (to == 5){
                        row5.push(row6.get(row6.size()-x));
                        row6.remove(row6.size()-x);
                    }
                    if (to == 7){
                        row7.push(row6.get(row6.size()-x));
                        row6.remove(row6.size()-x);
                    }
                    if (to == 8){
                        row8.push(row6.get(row6.size()-x));
                        row6.remove(row6.size()-x);
                    }
                    if (to == 9){
                        row9.push(row6.get(row6.size()-x));
                        row6.remove(row6.size()-x);
                    }
                }
            }

            if (from == 7){
                for (int x = move; x > 0; x--){
                    if (to == 2){
                        row2.push(row7.get(row7.size()-x));
                        row7.remove(row7.size()-x);
                    }
                    if (to == 1){
                        row1.push(row7.get(row7.size()-x));
                        row7.remove(row7.size()-x);
                    }
                    if (to == 3){
                        row3.push(row7.get(row7.size()-x));
                        row7.remove(row7.size()-x);
                    }
                    if (to == 4){
                        row4.push(row7.get(row7.size()-x));
                        row7.remove(row7.size()-x);
                    }
                    if (to == 5){
                        row5.push(row7.get(row7.size()-x));
                        row7.remove(row7.size()-x);
                    }
                    if (to == 6){
                        row6.push(row7.get(row7.size()-x));
                        row7.remove(row7.size()-x);
                    }
                    if (to == 8){
                        row8.push(row7.get(row7.size()-x));
                        row7.remove(row7.size()-x);
                    }
                    if (to == 9){
                        row9.push(row7.get(row7.size()-x));
                        row7.remove(row7.size()-x);
                    }
                }
            }

            if (from == 8){
                for (int x = move; x > 0; x--){
                    if (to == 2){
                        row2.push(row8.get(row8.size()-x));
                        row8.remove(row8.size()-x);
                    }
                    if (to == 1){
                        row1.push(row8.get(row8.size()-x));
                        row8.remove(row8.size()-x);
                    }
                    if (to == 3){
                        row3.push(row8.get(row8.size()-x));
                        row8.remove(row8.size()-x);
                    }
                    if (to == 4){
                        row4.push(row8.get(row8.size()-x));
                        row8.remove(row8.size()-x);
                    }
                    if (to == 5){
                        row5.push(row8.get(row8.size()-x));
                        row8.remove(row8.size()-x);
                    }
                    if (to == 6){
                        row6.push(row8.get(row8.size()-x));
                        row8.remove(row8.size()-x);
                    }
                    if (to == 7){
                        row7.push(row8.get(row8.size()-x));
                        row8.remove(row8.size()-x);
                    }
                    if (to == 9){
                        row9.push(row8.get(row8.size()-x));
                        row8.remove(row8.size()-x);
                    }
                }
            }

            if (from == 9){
                for (int x = move; x > 0; x--){
                    if (to == 2){
                        row2.push(row9.get(row9.size()-x));
                        row9.remove(row9.size()-x);
                    }
                    if (to == 1){
                        row1.push(row9.get(row9.size()-x));
                        row9.remove(row9.size()-x);
                    }
                    if (to == 3){
                        row3.push(row9.get(row9.size()-x));
                        row9.remove(row9.size()-x);
                    }
                    if (to == 4){
                        row4.push(row9.get(row9.size()-x));
                        row9.remove(row9.size()-x);
                    }
                    if (to == 5){
                        row5.push(row9.get(row9.size()-x));
                        row9.remove(row9.size()-x);
                    }
                    if (to == 6){
                        row6.push(row9.get(row9.size()-x));
                        row9.remove(row9.size()-x);
                    }
                    if (to == 7){
                        row7.push(row9.get(row9.size()-x));
                        row9.remove(row9.size()-x);
                    }
                    if (to == 8){
                        row8.push(row9.get(row9.size()-x));
                        row9.remove(row9.size()-x);
                    }
                }
            }

        }

        finalString += row1.peek();
        finalString += row2.peek();
        finalString += row3.peek();
        finalString += row4.peek();
        finalString += row5.peek();
        finalString += row6.peek();
        finalString += row7.peek();
        finalString += row8.peek();
        finalString += row9.peek();

        System.out.println(finalString);
    }
}