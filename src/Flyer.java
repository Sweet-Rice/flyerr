

import basicgraphics.BasicFrame;
import basicgraphics.Card;

public class Flyer {
    public static void main(String[] args) {
        BasicFrame bf = new BasicFrame("Flyer");
        GameManager gameManager = new GameManager(bf);
        bf.show();
    }
}