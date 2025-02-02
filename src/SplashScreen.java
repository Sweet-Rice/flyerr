import basicgraphics.BasicFrame;
import basicgraphics.Card;
import basicgraphics.ClockWorker;
import basicgraphics.images.BackgroundPainter;
import basicgraphics.images.Picture;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SplashScreen {
    public final Card card;
    private GameScreen gs;

    public SplashScreen(BasicFrame frame, GameScreen gs) {
        card = frame.getCard();
        initializeUI();
        this.gs = gs;
    }

    private void initializeUI() {
        card.setPainter(new BackgroundPainter(new Picture("freespace.png")));

        String[][] layout = {{"Title"}, {"Button"}};
        card.setStringLayout(layout);

        JLabel title = new JLabel("Flyer Game");
        title.setForeground(java.awt.Color.WHITE);
        card.add("Title", title);

        JButton startButton = new JButton("Start");
        card.add("Button", startButton);
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                gs.show();
                ClockWorker.initialize(7);
            }
        });
    }


}