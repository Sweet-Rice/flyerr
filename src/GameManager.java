import basicgraphics.BasicFrame;
import basicgraphics.Card;
import basicgraphics.ClockWorker;
import basicgraphics.SpriteComponent;

public class GameManager {
    private final BasicFrame frame;
    private final SplashScreen splashScreen;
    private final GameScreen gameScreen;

    public GameManager(BasicFrame frame) {
        this.frame = frame;
        this.splashScreen = new SplashScreen(frame);
        this.gameScreen = new GameScreen(frame);

        initializeGame();
    }

    private void initializeGame() {
        splashScreen.setStartAction(( d) -> {
            gameScreen.show();
            ClockWorker.initialize(7);


        });


    }
}