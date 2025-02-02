import basicgraphics.BasicFrame;
import basicgraphics.Card;
import basicgraphics.images.BackgroundPainter;
import basicgraphics.images.Picture;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;

public class SplashScreen {
    private final Card card;

    public SplashScreen(BasicFrame frame) {
        card = frame.getCard();
        initializeUI();
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
    }

    public void setStartAction(ActionListener action) {
        JButton btn = (JButton) card.getComponent(1);
        btn.addActionListener(action);
    }
}