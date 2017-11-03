/**
 * Created by User on 171103.
 */
public class NewGame {
    Logic logic = new Logic();
    int cout = 0;
    int pointsTowin = 3;

    public void start_game() {

        for (int i = 0; i < 4; i++) {
            logic.random_chose(logic.mas);
            logic.chek_win(logic.mas, 2, pointsTowin);
            cout++;
        }
        System.out.println(cout);
    }

}
