import java.util.Random;




public class Test {
    public static void main(String[] args) {
        Demo demo = new Demo();
        int cout = 0;


        for (int i = 0; i < 5; i++) {
            demo.random_chose(demo.mas);
            demo.chek_win(demo.mas);
            cout++;
        }
        System.out.println(cout);
    }


}
