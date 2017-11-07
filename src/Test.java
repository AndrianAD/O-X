
import java.util.Scanner;



public class Test {
    static int coordinata_i;
    static int coordinata_j;
    static boolean flag = false;
    public static void main(String[] args) {
        Demo demo = new Demo();
        int cout = 0;


//        for (int i = 0; i < 5; i++) {
//            demo.random_chose(demo.mas);
//            demo.chek_win(demo.mas);
//            cout++;
//        }
//        System.out.println(cout);
//    }

        int to_chek = 2, size_to_chek = 2;
        while (true) {
            player_play(demo);
            while (size_to_chek > 1) {
                if (demo.chek_win(Demo.mas, to_chek, size_to_chek)) {
                    System.out.println(" У игрока 2 икса, нужно заблокировать");
                    return;
                } else if (demo.chek_win(Demo.mas, to_chek - 1, size_to_chek)) {
                    System.out.println("Ставим третий и Победа Компьютера");
                    return;
                } else {
                    System.out.println("Совпадний нет, умешьшаю ряд, делает ход комп");
                    demo.random_chose(Demo.mas);
                    player_play(demo);
                }
            }
//            demo.random_chose(Demo.mas);
//            to_chek=2;
//            size_to_chek=2;


        }
    }

    private static void player_play(Demo demo) {
        System.out.println("Введите ваши коодинаты i,j:");
        System.out.println("Ряд: ");
        Scanner scanner = new Scanner(System.in);
        String string_i = scanner.nextLine();
        coordinata_i = Integer.parseInt(string_i);
        System.out.println("Столбец: ");
        String string_j = scanner.nextLine();
        coordinata_j = Integer.parseInt(string_j);
        Demo.mas[coordinata_i][coordinata_j] = 2;
        demo.printArray(Demo.mas);
    }


}
