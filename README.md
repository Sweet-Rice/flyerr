Simple implementation of classes from Brandt's "flyer" game.



Falcon.java, Plasma.java
  
  Essentially, whenever creating sprites, you should be making a separate class.
  Basic syntax:

  public class [name] extends Sprite {
    public Picture initialPic; //Picture of the sprite
    public SpriteComponent sc; //Sprite component that holds it

    public Falcon(Scene sc, SpriteComponent scw){
      super(sc);

      intiailPic = new Picture("name.png");
      [here you probably want to set the x and y location]
      //i havent done any exploring with scale yet.

      this.sc = scw;

    }
    Take care of Overrides here, e.g. SpriteCollision events.
  }



Flyer.java

Main method. Shouldn't do much of the game handling anyway.
Syntax:
public class [name]{
  public static void main(String[] args){
    BasicFrame frame = new BasicFrame("frame"); //Without this, you can't do anything else
    GameManager gameManager = new GameManager(frame);   //this ends up being one of the controlling classes 
                                                        //that allow for modularity
    bf.show(); //Don't really need to call this anywhere else, once is enough.

  }



GameManager.java

Class that controls cards. I found that the best way to control cards is by making classes that are dedicated to cards.

public class GameManager {
  private final BasicFrame frame;
  private final [card class name] cardClass;

  public GameManager(Basicframe frame){
    this.frame = frame;

    this.[card class] = new //you get the idea
    [card class].card.showCard();

  }

}
This isn't optimized by any means. Still in the works, but I will not be updating this. 
The gist is that GameManager is the place where all the cards live, so any kind of high-level card
manipulation should happen in this class.

GameScreen.java, SplashScreen.java

Card classes.

not really a set syntax. See the files themselves for examples. 
Only thing is making sure the card and sprite component are initialized

A show() method for showing the card might be helpful as well.

InputHandler.java

You seriously don't need this class. Just make an anonymous inner class that handles input.
Only reason to use this is if your input logic is complex and long and you want to make your Card class more readable.


Things to note: 
This entire project was made to figure out how to manage cards through classes to introduce modularity in that aspect.
You can still make more modularity by making a SpriteComponent class, but I haven't done/figured that out yet.

BasicGraphics is ordered in a hierarchy, so a class should be able to manage each one if you need to. 

BasicFrame (main window)  
│  
├── Card (e.g., "menu", "overworld")  
│   │  
│   └── SpriteComponent (renders sprites)  
│       │  
│       └── Scene (container for sprites)  
│           │  
│           └── Sprite (your button)  


  
