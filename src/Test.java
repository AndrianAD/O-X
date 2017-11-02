import java.util.Random;




public class Test {
    public static int size = 4;
    public static int chek_win = 3;

//        public static int mas[][] = {{1,1,0,0}, {1,0,1,0},{0,1,0,1},{1,0,1,0}};
    public static int mas[][] = newArray();



    public static void main(String[] args) {
        Test test = new Test();

        test.random_chose(mas);
        test.chek_win(mas);
        test.random_chose(mas);
        test.chek_win(mas);
        test.random_chose(mas);
        test.chek_win(mas);
        test.random_chose(mas);
        test.chek_win(mas);
        test.random_chose(mas);
        test.chek_win(mas);

        test.random_chose(mas);
        test.chek_win(mas);

        test.random_chose(mas);
        test.chek_win(mas);
        test.random_chose(mas);
        test.chek_win(mas);

        test.random_chose(mas);
        test.chek_win(mas);

        test.random_chose(mas);
        test.chek_win(mas);














    }

    public void chek_win(int[][] masiv) {
        for (int i = 0; i < masiv.length; i++) {
            for (int j = 0; j < masiv.length; j++) {

                if(masiv[i][j]==1){
                    chek_rigth(i, j);
                    chek_down(i, j);
                    chek_diagonal_right(i, j);
                    chek_diagonal_left(i, j);


                }
            }

        }
    }

    private boolean chek_rigth(int i, int j) {

        if (((j + size - 1) >= size)) {
            return false;
        } else if (mas[i][j + 1] == 1 && mas[i][j + 2] == 1) {
            System.out.println("совпадение по горизонтали");
            return true;
        } else
            return false;

    }


    private boolean chek_down(int i, int j) {
        if (((i + size - 1) >= size)) {
            return false;
        }



        else if (mas[i+1][j]==1 && mas[i+2][j]==1)
        {
            System.out.println("совпадение по вертикали");
            return true;}

        else
            return false;

    }


    private boolean chek_diagonal_right(int i, int j) {
        int temp = chek_win - 1;

        if (((j + size - 1) > size)) {
            return false;
        }

        if (((i + size - 1) >= size)) {
            return false;
        }


        while (temp > 0) {
            if (mas[i + temp][j + temp] == 1) {
                temp--;
                System.out.println("temp--");
            } else break;

        }
        if (temp == 0) {
            System.out.println("совпадение по диагонали");
        }

        return false;
    }


    private boolean chek_diagonal_left(int i, int j) {
        int temp = chek_win- 1;

        if (((j - size - 1) <0)) {
            return false;
        }

        if (((i - size - 1) < 0)) {
            return false;
        }


        while (temp > 0) {
            if (mas[i + temp][j - temp] == 1) {
                temp--;
                System.out.println("temp--");
            } else break;

        }
        if (temp == 0) {
            System.out.println("совпадение по диагонали");
        }

        return false;
    }









    private static int[][] newArray () {
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


    public void random_chose(int[][] masiv) {
        System.out.println("------------------------------------");
        int temp = 0;
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


    public void printArray(int masiv[][]) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(mas[i][j]);
            }
            System.out.println();
        }
    }


}
