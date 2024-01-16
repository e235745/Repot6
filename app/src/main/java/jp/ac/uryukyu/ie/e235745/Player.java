package jp.ac.uryukyu.ie.e235745;

public class Player {
    Card[] hand;
    public Player(int _playerNummber){
        System.out.println("この処理がコンストラクタの処理です");
        double handnummber = Math.ceil(52 / _playerNummber);
        hand = new Card[(int) handnummber];
    }
    public void draw(Card drawcard){
        //Card drawcard = new Card("spade", 1);
        this.hand[0] = drawcard;

    }
    
}
