//Project on the World's one of the most popular 'time-pass' game-->Tic Tac Toe! (:D) in CUI !!!
// #MadeByDipanshu
//iamawesomedkm
//game version-a0.3(alpha)

import java.io.*;

public class tictactoe {
    static int won, lost, total;
    static int p1p = 0, p2p = 0;
    static String p1, p2;
    static int gm = 0;
    static int wa = 0;
    static int overtime = 0;
    static String name_sp;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean a, ab = false;
        int aa = 1;
        int baa = 0;
        for (a = true; a != false; a = ab) /* Main Menu*/ {
            if (aa == 1) /* option*/ {
                System.out.println("Please read the TERMS & CONDITIONS before making any changes to this game.\nType any one, from the following menu: \n  1- Play game\n  2- How to Play?(recommended for new players)\n  3- About\n ");
                aa++;
            } else //option-1
                System.out.println("Type any one, from the following menu: \n  1- Play game\n  2- How to Play?\n  3- About this game\n  4- Quit\n ");
            System.out.print("Your choice? ");
            String in = br.readLine();
            if (in.equals("1") || in.equals("2") || in.equals("3") || in.equals("4")) /* Enter from user*/ {
                if (in.equals("1")) {
                    boolean aaa, abb = false;
                    for (aaa = true; aaa != false; aaa = abb) {
                        System.out.println("   Select any one: \n     1- Single Player\n     2- Multi Player(2v2)\n     3- go back\n     4- Exit the game\n     99-Display table of locations"); // Subpart
                        System.out.print("Your choice: ");
                        String inp = br.readLine();
                        int ch = 0;
                        if (inp.equals("1")) {
                            boolean bb, as = false;
                            for (bb = true; bb != false; bb = as) /*2v2 pre-game options*/ {
                                System.out.print("Enter the limit of the game(0 for unlimited):  ");
                                String g_l = br.readLine();
                                System.out.print("Enter the limit of the total no. of wins(0 for unlimited): ");
                                String w_l = br.readLine();
                                int gl = g_l.length();
                                int wl = w_l.length();
                                int d1 = 0;
                                boolean d = false;
                                if (gl > wl) {
                                    for (int i = 0; i < wl; i++) {
                                        if (Character.isLetter(g_l.charAt(i)) == true || Character.isLetterOrDigit(w_l.charAt(i)) == true) {
                                            d = true;
                                            d1 = 0;
                                            break;
                                        } else {
                                            d = false;
                                            d1 = 1;
                                        }
                                    }
                                    for (int i = wl; i < gl; i++) {

                                        if (d1 != 0) {
                                            if (Character.isLetter(g_l.charAt(i)) == true) {
                                                d = true;
                                                break;
                                            } else
                                                d = false;
                                        } else
                                            break;
                                    }
                                }
                                if (gl == wl) {
                                    for (int i = 0; i < gl; i++) {
                                        if (Character.isLetter(g_l.charAt(i)) == true || Character.isLetter(w_l.charAt(i)) == true) {
                                            d = true;
                                            break;
                                        } else
                                            d = false;
                                    }
                                }
                                if (gl < wl)
                                    d = true;
                                if (gl < 0 || wl < 0)
                                    d = true;
                                if (d == true) {
                                    as = true;
                                    System.out.print("\nPlease enter ONLY numbers, NOT alphabets! \n");
                                } else {
                                    double g1 = Double.parseDouble(g_l);
                                    double w1 = Double.parseDouble(w_l);
                                    int d2;
                                    if (w1 > g1) {
                                        System.out.println("\nError! Game limit is lesser than win limit\n");
                                        d2 = 0;
                                    } else
                                        d2 = 1;
                                    if (d2 != 0) {
                                        if (g1 < 0 || w1 < 0) {
                                            System.out.println("Please note that the game limit and the win limit cannot be less than zero");
                                            d2 = 0;
                                        } else
                                            d2 = 1;
                                    }
                                    if (d2 == 1) {
                                        sp(g1, w1);
                                        as = false;
                                    } else
                                        as = true;
                                }
                            }
                            ch = 1;
                        }
                        if (inp.equals("2")) {
                            boolean bb, as = false;
                            for (bb = true; bb != false; bb = as) /*2v2 pre-game options*/ {
                                System.out.print("Enter the limit of the game(0 for unlimited):  ");
                                String g_l = br.readLine();
                                System.out.print("Enter the limit of the total no. of wins(0 for unlimited): ");
                                String w_l = br.readLine();
                                int gl = g_l.length();
                                int wl = w_l.length();
                                int d1 = 0;
                                boolean d = false;
                                if (gl > wl) {
                                    for (int i = 0; i < wl; i++) {
                                        if (Character.isLetterOrDigit(g_l.charAt(i)) == true || Character.isWhitespace(g_l.charAt(i)) == true || Character.isLetterOrDigit(w_l.charAt(i)) == true || Character.isWhitespace(w_l.charAt(i)) == true) {
                                            if (Character.isLetter(g_l.charAt(i)) == true || Character.isLetter(w_l.charAt(i)) == true) {
                                                d = true;
                                                break;
                                            }
                                            if (Character.isWhitespace(g_l.charAt(i)) == true || Character.isWhitespace(g_l.charAt(i)) == true) {
                                                d = true;
                                                break;
                                            }
                                        } else {
                                            d = true;
                                            break;
                                        }
                                    }
                                    for (int i = gl; i < gl - wl; i++) {
                                        if (Character.isLetterOrDigit(g_l.charAt(i)) == true || Character.isWhitespace(g_l.charAt(i)) == true) {
                                            if (Character.isLetter(g_l.charAt(i)) == true) {
                                                d = true;
                                                break;
                                            }
                                            if (Character.isWhitespace(g_l.charAt(i)) == true) {
                                                d = true;
                                                break;
                                            }
                                        } else {
                                            d = true;
                                            break;
                                        }
                                    }
                                }
                                if (g_l.equals("") || w_l.equals("")) {
                                    d = true;
                                }
                                if (gl == wl) {
                                    for (int i = 0; i < gl; i++) {
                                        if (Character.isLetterOrDigit(g_l.charAt(i)) == true || Character.isWhitespace(g_l.charAt(i)) == true || Character.isLetterOrDigit(w_l.charAt(i)) == true || Character.isWhitespace(w_l.charAt(i)) == true) {
                                            if (Character.isLetter(g_l.charAt(i)) == true || Character.isLetter(w_l.charAt(i)) == true) {
                                                d = true;
                                                break;
                                            }
                                            if (Character.isWhitespace(g_l.charAt(i)) == true || Character.isWhitespace(g_l.charAt(i)) == true) {
                                                d = true;
                                                break;
                                            }
                                        } else {
                                            d = true;
                                            break;
                                        }
                                    }
                                }
                                if (gl < wl)
                                    d = true;
                                if (gl < 0 || wl < 0)
                                    d = true;
                                if (d == true) {
                                    as = true;
                                    System.out.println("\nOops! An error is caused!\n" +
                                            "\nThis is caused because of:" +
                                            "\n  1) You have entered a number which is lesser than zero" +
                                            "\n  2) You have entered the value of win limit more than the game limit" +
                                            "\n  3) You have entered nothing or used any type of characters or use of spaces\n" +
                                            "Please try avoiding these errors and enter the values again\n");
                                }
                                if (d == false) {
                                    double g1 = Double.parseDouble(g_l);
                                    double w1 = Double.parseDouble(w_l);
                                    int d2;
                                    if (w1 > g1) {
                                        System.out.println("\nError! Game limit is lesser than win limit\n");
                                        d2 = 0;
                                    } else
                                        d2 = 1;
                                    if (d2 != 0) {
                                        if (g1 < 0.0 || w1 < 0.0) {
                                            System.out.println("Please note that the game limit and the win limit cannot be less than zero");
                                            d2 = 0;
                                        } else
                                            d2 = 1;
                                    }
                                    if (d2 == 1)
                                        as = mp2v2(g1, w1);
                                    else
                                        as = true;
                                }
                            }
                            ch = 1;
                        }
                        if (inp.equals("3")) {
                            abb = false;
                            ch = 1;
                        }
                        if (inp.equals("4")) {
                            baa = 1;
                            ch = 1;
                            abb = false;
                        }
                        if (inp.equals("99")) {
                            table();
                            abb = true;
                            ch = 1;
                        }
                        if (ch == 0) {
                            System.out.println("Bad Number entered. Try again\n");
                            abb = true;
                        }
                    }
                    ab = true;
                }
                if (in.equals("2")) {
                    intro();
                    ab = true;
                }
                if (in.equals("3")) {
                    about();
                    ab = true;
                }
                if (in.equals("4")) {
                    ab = false;
                    break;
                }
                if (baa == 1)
                    break;
            } else {
                System.out.println("Illegal character taken. Please try again.\n\n");
                ab = true;
            }
        }
    }

    private static void table() {
        System.out.println("Table set and the location of each of its square:\n");
        System.out.println(" <1> | <2> | <3>");
        System.out.println("-----|-----|----");
        System.out.println(" <4> | <5> | <6>");
        System.out.println("-----|-----|----");
        System.out.println(" <7> | <8> | <9>");
        System.out.println("\nIf you want to exit the game during the match, you can enter quit/bye/exit/abandon and get out." +
                "\nWARNING: In Single Player mode, exiting the game without completing will result in the accumulation of lost matches.\n");
    }

    private static boolean mp2v2(double gaa, double waa) throws IOException {
        System.out.println("\nPre- Match instructions:\nIf there is a tie between the 1st and the 2nd player" +
                ", \nthe game will automatically increase its limit to a number which can be decided by you.\n" +
                "However, if you do not wish to complete the game, you can always abandon the match by typing (quit/bye/exit/abandon)." +
                "\nYou can even quit the game during a match by typing those words mentioned above.|\n|\n|\n|\n|\n");
        BufferedReader abc = new BufferedReader(new InputStreamReader(System.in));
        boolean i, ii = false;
        long g = 0, w = 0;
        int chaa = 0;
        if (gaa >= 999999999 || gaa == 0) {
            g = 999999999;
            chaa = 1;
        }
        if (waa >= 999999999 || waa == 0) {
            w = 99999999;
            chaa = 1;
        }
        if (chaa != 1) {
            g = (long) gaa;
            w = (long) waa;
        }
        int cho;
        int k = 1;
        if (overtime != 1) {
            p1p = 0;
            p2p = 0;
        }
        boolean dec = false;
        int che = 0;
        int de = 0;
        if (overtime != 1) {
            System.out.println("X-Player 1: ");
            p1 = abc.readLine();
            System.out.println("O-Player 2: ");
            p2 = abc.readLine();
        }
        gm += g;
        wa += w;
        int q = 0;
        for (k = 1; k <= g; k++) {
            char arr1[][] = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
            if (de == 0) {
                System.out.print("User instructions.(to be followed strictly)");
                table();
                de = 1;
            }
            if (overtime != 1)
                System.out.println("------------------- Round " + k + " -------------------\n\n");
            else
                System.out.println("------------------- Overtime Round " + k + " -------------------\n\n");
            int wlp1 = 0, wlp2 = 0;
            for (int game = 1; game <= 9; game++) {
                if (game % 2 != 0)
                    System.out.println("\n" + p1 + "'s turn as X\n");
                else
                    System.out.println("\n" + p2 + "'s turn as O\n");
                boolean bb, ass = false;
                for (bb = true; bb != false; bb = ass) {
                    cho = 0;
                    System.out.print("Enter the location(99 for table if you have forgotten): ");
                    String location = abc.readLine();
                    if (location.equals("quit") || location.equals("bye") || location.equals("exit") || location.equals("abandon") || location.equals("QUIT") || location.equals("BYE") || location.equals("ABANDON") || location.equals("EXIT")) {
                        q = 1;
                        overtime = 0;
                        wa = 0;
                        gm = 0;
                    }
                    if (q == 1)
                        break;
                    for (int ch = 0; ch < location.length(); ch++) {
                        if (Character.isLetterOrDigit(location.charAt(ch)) == true || Character.isWhitespace(location.charAt(ch)) == true) {
                            if (Character.isLetter(location.charAt(ch)) == true) {
                                cho = 1;
                                break;
                            }
                            if (location.equals("")) {
                                cho = 1;
                                break;
                            }
                            if (Character.isWhitespace(location.charAt(ch)) == true) {
                                cho = 1;
                                break;
                            }
                        } else {
                            cho = 1;
                            break;
                        }
                    }
                    if (location.equals("")) {
                        cho = 1;
                    }
                    int no = 0;
                    if (cho != 1) {
                        if (q == 1)
                            break;
                        double qw = Double.parseDouble(location);
                        if (qw >= 9999.0)
                            no = 999;
                        else
                            no = Integer.parseInt(location);
                        switch (no) {
                            case 1:
                                if (arr1[0][0] == ' ') {
                                    if (game % 2 != 0)
                                        arr1[0][0] = 'X';
                                    else
                                        arr1[0][0] = 'O';
                                    ass = false;
                                } else {
                                    System.out.println("Please do not enter the same number again and again");
                                    ass = true;
                                }
                                break;
                            case 2:
                                if (arr1[1][0] == ' ') {
                                    if (game % 2 != 0)
                                        arr1[1][0] = 'X';
                                    else
                                        arr1[1][0] = 'O';
                                    ass = false;
                                } else {
                                    System.out.println("Please do not enter the same number again and again");
                                    ass = true;
                                }
                                break;
                            case 3:
                                if (arr1[2][0] == ' ') {
                                    if (game % 2 != 0)
                                        arr1[2][0] = 'X';
                                    else
                                        arr1[2][0] = 'O';
                                    ass = false;
                                } else {
                                    System.out.println("Please do not enter the same number again and again");
                                    ass = true;
                                }
                                break;
                            case 4:
                                if (arr1[0][1] == ' ') {
                                    if (game % 2 != 0)
                                        arr1[0][1] = 'X';
                                    else
                                        arr1[0][1] = 'O';
                                    ass = false;
                                } else {
                                    System.out.println("Please do not enter the same number again and again");
                                    ass = true;
                                }
                                break;
                            case 5:
                                if (arr1[1][1] == ' ') {
                                    if (game % 2 != 0)
                                        arr1[1][1] = 'X';
                                    else
                                        arr1[1][1] = 'O';
                                    ass = false;
                                } else {
                                    System.out.println("Please do not enter the same number again and again");
                                    ass = true;
                                }
                                break;
                            case 6:
                                if (arr1[2][1] == ' ') {
                                    if (game % 2 != 0)
                                        arr1[2][1] = 'X';
                                    else
                                        arr1[2][1] = 'O';
                                    ass = false;
                                } else {
                                    System.out.println("Please do not enter the same number again and again");
                                    ass = true;
                                }
                                break;
                            case 7:
                                if (arr1[0][2] == ' ') {
                                    if (game % 2 != 0)
                                        arr1[0][2] = 'X';
                                    else
                                        arr1[0][2] = 'O';
                                    ass = false;
                                } else {
                                    System.out.println("Please do not enter the same number again and again");
                                    ass = true;
                                }
                                break;
                            case 8:
                                if (arr1[1][2] == ' ') {
                                    if (game % 2 != 0)
                                        arr1[1][2] = 'X';
                                    else
                                        arr1[1][2] = 'O';
                                    ass = false;
                                } else {
                                    System.out.println("Please do not enter the same number again and again");
                                    ass = true;
                                }
                                break;
                            case 9:
                                if (arr1[2][2] == ' ') {
                                    if (game % 2 != 0)
                                        arr1[2][2] = 'X';
                                    else
                                        arr1[2][2] = 'O';
                                    ass = false;
                                } else {
                                    System.out.println("Please do not enter the same number again and again");
                                    ass = true;
                                }
                                break;
                            case 99:
                                table();
                                ass = false;
                                game -= 1;
                                break;
                            default:
                                System.out.println("Please try entering the location within a range of 1 and 9");
                                ass = true;
                        }
                    } else {
                        if (q == 1)
                            break;
                        System.out.println("Please do not enter any random value. Try again and enter the location again");
                        ass = true;
                    }
                    if (no != 99 && no >= 1 && no <= 9) {
                        System.out.println("\n-------------");
                        System.out.println(" " + arr1[0][0] + " | " + arr1[1][0] + " | " + arr1[2][0]);
                        System.out.println("---|---|---");
                        System.out.println(" " + arr1[0][1] + " | " + arr1[1][1] + " | " + arr1[2][1]);
                        System.out.println("---|---|---");
                        System.out.println(" " + arr1[0][2] + " | " + arr1[1][2] + " | " + arr1[2][2]);
                        System.out.println("-------------\n");
                        if (arr1[0][0] == 'X' && arr1[0][1] == 'X' && arr1[0][2] == 'X') {
                            System.out.println("Congratulations!!! " + p1 + "\'s team wins this game\nGood try " + p2 + "'s Team!!!");
                            wlp1 = 1;
                            p1p += 1;
                            if (p1p == wa)
                                overtime = 0;
                            if (wlp1 == 1)
                                break;
                        }
                        if (arr1[0][0] == 'O' && arr1[0][1] == 'O' && arr1[0][2] == 'O') {
                            System.out.println("Congratulations!!! " + p2 + "\'s team wins this game\nGood try " + p1 + "'s Team!!!");
                            wlp2 = 1;
                            if (p2p == wa)
                                overtime = 0;
                            p2p += 1;
                            if (wlp2 == 1)
                                break;
                        }
                        if (arr1[1][0] == 'X' && arr1[1][1] == 'X' && arr1[1][2] == 'X') {
                            System.out.println("Congratulations!!! " + p1 + "\'s team wins this game\nGood try " + p2 + "'s Team!!!");
                            wlp1 = 1;
                            p1p += 1;
                            if (p1p == wa)
                                overtime = 0;
                            if (wlp1 == 1)
                                break;
                        }
                        if (arr1[1][0] == 'O' && arr1[1][1] == 'O' && arr1[1][2] == 'O') {
                            System.out.println("Congratulations!!! " + p2 + "\'s team wins this game\nGood try " + p1 + "'s Team!!!");
                            wlp2 = 1;
                            p2p += 1;
                            if (p2p == wa)
                                overtime = 0;
                            if (wlp2 == 1)
                                break;
                        }
                        if (arr1[2][0] == 'X' && arr1[2][1] == 'X' && arr1[2][2] == 'X') {
                            System.out.println("Congratulations!!! " + p1 + "\'s team wins this game\nGood try " + p2 + "'s Team!!!");
                            wlp1 = 1;
                            p1p += 1;
                            if (p1p == wa)
                                overtime = 0;
                            if (wlp1 == 1)
                                break;
                        }
                        if (arr1[2][0] == 'O' && arr1[2][1] == 'O' && arr1[2][2] == 'O') {
                            System.out.println("Congratulations!!! " + p2 + "\'s team wins this game\nGood try " + p1 + "'s Team!!!");
                            wlp2 = 1;
                            p2p += 1;
                            if (p2p == wa)
                                overtime = 0;
                            if (wlp2 == 1)
                                break;
                        }
                        if (arr1[0][0] == 'X' && arr1[1][0] == 'X' && arr1[2][0] == 'X') {
                            System.out.println("Congratulations!!! " + p1 + "\'s team wins this game\nGood try " + p2 + "'s Team!!!");
                            wlp1 = 1;
                            p1p += 1;
                            if (p1p == wa)
                                overtime = 0;
                            if (wlp1 == 1)
                                break;
                        }
                        if (arr1[0][0] == 'O' && arr1[1][0] == 'O' && arr1[2][0] == 'O') {
                            System.out.println("Congratulations!!! " + p2 + "\'s team wins this game\nGood try " + p1 + "'s Team!!!");
                            wlp2 = 1;
                            p2p += 1;
                            if (p2p == wa)
                                overtime = 0;
                            if (wlp2 == 1)
                                break;
                        }
                        if (arr1[0][1] == 'X' && arr1[1][1] == 'X' && arr1[2][1] == 'X') {
                            System.out.println("Congratulations!!! " + p1 + "\'s team wins this game\nGood try " + p2 + "'s Team!!!");
                            wlp1 = 1;
                            p1p += 1;
                            if (p1p == wa)
                                overtime = 0;
                            if (wlp1 == 1)
                                break;
                        }
                        if (arr1[0][1] == 'O' && arr1[1][1] == 'O' && arr1[2][1] == 'O') {
                            System.out.println("Congratulations!!! " + p2 + "\'s team wins this game\nGood try " + p1 + "'s Team!!!");
                            wlp2 = 1;
                            p2p += 1;
                            if (p2p == wa)
                                overtime = 0;
                            if (wlp2 == 1)
                                break;
                        }
                        if (arr1[0][2] == 'X' && arr1[1][2] == 'X' && arr1[2][2] == 'X') {
                            System.out.println("Congratulations!!! " + p1 + "\'s team wins this game\nGood try " + p2 + "'s Team!!!");
                            wlp1 = 1;
                            p1p += 1;
                            if (p1p == wa)
                                overtime = 0;
                            if (wlp1 == 1)
                                break;
                        }
                        if (arr1[0][2] == 'O' && arr1[1][2] == 'O' && arr1[2][2] == 'O') {
                            System.out.println("Congratulations!!! " + p2 + "\'s team wins this game\nGood try " + p1 + "'s Team!!!");
                            wlp2 = 1;
                            p2p += 1;
                            if (p2p == wa)
                                overtime = 0;
                            if (wlp2 == 1)
                                break;
                        }
                        if (arr1[0][0] == 'X' && arr1[1][1] == 'X' && arr1[2][2] == 'X') {
                            System.out.println("Congratulations!!! " + p1 + "\'s team wins this game\nGood try " + p2 + "'s Team!!!");
                            wlp1 = 1;
                            p1p += 1;
                            if (p1p == wa)
                                overtime = 0;
                            if (wlp1 == 1)
                                break;
                        }
                        if (arr1[0][0] == 'O' && arr1[1][1] == 'O' && arr1[2][2] == 'O') {
                            System.out.println("Congratulations!!! " + p2 + "\'s team wins this game\nGood try " + p1 + "'s Team!!!");
                            wlp2 = 1;
                            p2p += 1;
                            if (p2p == wa)
                                overtime = 0;
                            if (wlp2 == 1)
                                break;
                        }
                        if (arr1[2][0] == 'X' && arr1[1][1] == 'X' && arr1[0][2] == 'X') {
                            System.out.println("Congratulations!!! " + p1 + "\'s team wins this game\nGood try " + p2 + "'s Team!!!");
                            wlp1 = 1;
                            p1p += 1;
                            if (p1p == wa)
                                overtime = 0;
                            if (wlp1 == 1)
                                break;
                        }
                        if (arr1[2][0] == 'O' && arr1[1][1] == 'O' && arr1[0][2] == 'O') {
                            System.out.println("Congratulations!!! " + p2 + "\'s team wins this game\nGood try " + p1 + "'s Team!!!");
                            wlp2 = 1;
                            p2p += 1;
                            if (p2p == wa)
                                overtime = 0;
                            if (wlp2 == 1)
                                break;
                        }
                    }
                    if (p2p == wa || p1p == wa)
                        break;
                    if (wlp2 == 1 || wlp1 == 1)
                        break;

                    if (q == 1)
                        break;
                }
                if (wlp2 == 1 || wlp1 == 1)
                    break;
                if (p2p == wa || p1p == wa)
                    break;
                if (q == 1)
                    break;
            }
            System.out.println("\nScore of " + p1 + "'s team to " + p2 + "'s team is: " + p1p + " to " + p2p + "\n");
            if (p1p == wa || p2p == wa)
                break;
            if (q == 1)
                break;
        }
        k -= 1;
        if (overtime != 1) {
            if (p1p == p2p && (p1p + p2p) == gm) {
                overtime = 1;
            }
            if (p1p == p2p && k == gm) {
                overtime = 1;
            }
        } else {
            if (p1p == p2p && (p1p + p2p) == gm) {
                overtime = 1;
            }
            if (p1p == p2p && k == gm) {
                overtime = 1;
            }
        }
        for (i = true; i != false; i = ii) {
            if (q == 1)
                break;
            String qa;
            if (overtime != 1) {
                System.out.print("Do you want to play Multi-Player mode again?(y/n) ");
                qa = abc.readLine();
            } else {
                System.out.println("Overtime match");
                qa = "Y";
            }
            if (qa.equals("Y") || qa.equals("y")) {
                dec = true;
                ii = false;
                che = 1;
            }
            if (qa.equals("N") || qa.equals("n")) {
                dec = false;
                ii = false;
                che = 1;
            }
            if (che != 1) {
                System.out.println("Wrong character entered. Try again.");
                ii = true;
            }
        }
        return dec;
    }

    private static boolean sp(double g, double w) {
        System.out.println("Under Construction");
        return false;
    }

    private static void about() {
        System.out.println("\n----------------------------------------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("\t\t\t\t\tTic Tac Toe!\n\nGame Version- a0.3(alpha)\n");
        System.out.println("Game sponsored by: Kushagra Prasad");
        System.out.println("Catch him LIVE on SOCIAL MEDIA: ");
        System.out.println("               Facebook  : https://www.facebook.com/profile.php?id=100012095773529/");
        System.out.println("               Instagram : https://www.instagram.com/kushagra.prasad17/");
        System.out.println("               Twitter   : https://www.twitter.com/prasad_kushagra/");
        System.out.println("               Youtube   : https://www.youtube.com/channel/UCtKLew6p6-RiRNir81YPmg\n                           Channel Name: Kushagra Prasad");
        System.out.println("About this game: ");
        System.out.println("Get stirred in the immense pleasure of joy and happiness, remembering the olden days coming back again to your life in a new and advanced way.\n This game brings about a variety of vintage cahnges like, the use of Character User Interface (aka CUI)\n \"Getting Bored? Or Nobody to play this game with!\", this game uses AI module(in its primitive form)  to get your smile back in your face, happiness ushering in your lips. \n This game also saves trees: So say no to paper! :D");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("\nAbout the update: 1) Now, you can play with your friends in the new 2v2 module");
        System.out.println("                  2) Fixed few grammatical errors in the project");
        System.out.println("                  3) Fixed a major bug which crashed the game.");
        System.out.println("                  4) Made the game more stable and efficient.");
        System.out.println("Credits:  ");
        System.out.println("\tDeveloper and Project Manager- Dipanshu Kumar Mahato.\n\tDebugger and Project tester - Ayush Keshri");
        System.out.println("This game is an open source game. Distribute it as much as you can. NO trademark, NO copyright!!! :D");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("Have you found any bug? Do contact me at my e-mail, which is provided below: ");
        System.out.println("            dipanshumahato@gmail.com\n\tFeedback is heartily invited!");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("\n\nThis is my first game and if you liked this one, do follow me on Social Media:");
        System.out.println("               GitHub   : https://www.github.com/iamawesomedkm/");
        System.out.println("               Facebook : https://www.facebook.com/profile.php?i.am.awesome.dkm/");
        System.out.println("               Twitter  : https://www.twitter.com/iamawesomedkm/");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------------------------------------\n\n");
    }

    private static void intro
            () /* This method only consists of print statements showing the interacting user how to play the game */ {
        System.out.println("\n----------------------------------------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("How to Play this Game?");
        System.out.println("--------------------Instruction 1------------------------");
        System.out.println("Example screen of the game:\n\n");
        System.out.println(" (O/X) | (O/X) | (O/X)");
        System.out.println("-------|-------|------");
        System.out.println(" (O/X) | (O/X) | (O/X)");
        System.out.println("-------|-------|------");
        System.out.println(" (O/X) | (O/X) | (O/X)");
        System.out.println("\n\n");
        System.out.println("--------------------Instruction 2------------------------");
        System.out.print("The location of the values to enter is as follows.");
        System.out.println("Please pay careful ATTENTION on the space alloted to each one of the playable squares!\n\n");
        table();
        System.out.println("\n\n");
        System.out.println("--------------------Instruction 3------------------------");
        System.out.println("In case you forget the location, TYPE \"99\" and see this table back again :D (Phew!)");
        System.out.println("\n\n");
        System.out.println("--------------------Instruction 4------------------------");
        System.out.println("Example: ");
        System.out.println("              ||::::O's turn::::");
        System.out.println("              ||Enter the location: 6");
        System.out.println("\n");
        System.out.println("           X |   | O ");
        System.out.println("          ---|---|---");
        System.out.println("             |   | O ");
        System.out.println("          ---|---|---");
        System.out.println("             |   |   ");
        System.out.println("\n");
        System.out.println("              ||::::X's turn::::");
        System.out.println("              ||Enter the location: 5");
        System.out.println("\n");
        System.out.println("           X |   | O ");
        System.out.println("          ---|---|---");
        System.out.println("             | X | O ");
        System.out.println("          ---|---|---");
        System.out.println("             |   |   ");
        System.out.println("\n");
        System.out.println("..(following the same process again and again)..\n");
        System.out.println(".......(After a game, the screen somewhat looks like this): ");
        System.out.println("\n");
        System.out.println("       X | O | O ");
        System.out.println("      ---|---|---");
        System.out.println("       X | X | O ");
        System.out.println("      ---|---|---");
        System.out.println("         |   | O ");
        System.out.println("\nCongratulations!!! <player1>'s team wins this game\nGood try <player2>'s Team!!!");
        System.out.print("\nThat's it of the Tutorial course!You've learnt everything about this game.");
        System.out.print("Now, you may proceed to the game");
        System.out.println(" :D\n");
        System.out.println("\n\t\t\t\tPS:Please scroll up to view the full instruction(s) again");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------------------------------------\n\n");
    }
}
//read the terms before editing the game
