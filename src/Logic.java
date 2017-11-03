import java.util.Random;

public class Logic {
    public static int size = 3;     // size of field


    //        public static int mas[][] = {{0,0,0,0}, {0,0,1,0},{0,1,0,0},{1,0,0,0}};
    public static int mas[][] = newArray();

    // chek if game is over
    public void chek_win(int[][] masiv, int number_to_chek, int chek_win) {
        for (int i = 0; i < masiv.length; i++) {
            for (int j = 0; j < masiv.length; j++) {

                if (masiv[i][j] == number_to_chek) {
                    chek_rigth(i, j, number_to_chek, chek_win);
                    chek_down(i, j, number_to_chek, chek_win);
                    chek_diagonal_right(i, j, number_to_chek, chek_win);
                    chek_diagonal_left(i, j, number_to_chek, chek_win);
                }
            }
        }
    }

    // check matching horizontaly
    private boolean chek_rigth(int i, int j, int number_chek, int chek_win) {
        if (((j + chek_win) > size)) {
            return false;
        }
        int temp = chek_win - 1;
        while (temp > 0) {
            if (mas[i][j + temp] == number_chek) {
                temp--;
            } else break;

        }
        if (temp == 0) {
            System.out.println("совпадение по горизонтали");
            return true;
        }
        return false;
    }


    // check matching vertically
    private boolean chek_down(int i, int j, int number_chek, int chek_win) {
        if (((i + size - 1) >= size)) {
            return false;
        }
        int temp = chek_win - 1;
        while (temp > 0) {
            if (mas[i + temp][j] == number_chek) {
                temp--;
            } else break;

        }
        if (temp == 0) {
            System.out.println("совпадение по вертикали");
            return true;
        }
        return false;

    }

    // check matching diagonal on the right
    private boolean chek_diagonal_right(int i, int j, int number_chek, int chek_win) {
        int temp = chek_win - 1;

        if (((j + size - 1) >= size)) {
            return false;
        }

        if (((i + size - 1) >= size)) {
            return false;
        }


        while (temp > 0) {
            if (mas[i + temp][j + temp] == number_chek) {
                temp--;
            } else break;

        }
        if (temp == 0) {
            System.out.println("совпадение по диагонали в право");
        }

        return false;
    }

    // check matching diagonal on the left
    private boolean chek_diagonal_left(int i, int j, int number_chek, int chek_win) {
        int temp = chek_win - 1;
// check left border
        if (j + 1 - chek_win < 0)
            return false;
//    check down border
        if (((i + size - 1) >= size)) {
            return false;
        }
        while (temp > 0) {
            if (mas[i + temp][j - temp] == number_chek) {
                temp--;
            } else break;

        }
        if (temp == 0) {
            System.out.println("совпадение по диагонали в лево");
        }
        return false;
    }

    // make new array with size
    private static int[][] newArray() {
        int mas[][] = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                mas[i][j] = 0;
                System.out.print(mas[i][j]);
            }
            System.out.println();
        }
        return mas;
    }

    // put in Array a random one 1
    public void random_chose(int[][] masiv) {
        System.out.println("------------------------------------");
        ;
        boolean chek = false;

        while (chek != true) {
            int random_numberI = new Random().nextInt(masiv.length);
            int random_numberJ = new Random().nextInt(masiv.length);
            if (mas[random_numberI][random_numberJ] == 0) {
                mas[random_numberI][random_numberJ] = 1;
                chek = true;
            }
        }
        printArray(mas);
        System.out.println("------------------------------------");

    }

    // print Array
    public void printArray(int masiv[][]) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(masiv[i][j] + " ");
            }
            System.out.println();
        }
    }



}
