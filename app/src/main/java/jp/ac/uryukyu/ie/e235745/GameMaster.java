package jp.ac.uryukyu.ie.e235745;

public class GameMaster {
    Card[][] field_cards;
    Card[] deck = new Card[52];
    int playerNummber;
    public GameMaster(int _playerNummber){
        System.out.println("参加人数は" + String.valueOf(_playerNummber) + "人です。");
        this.playerNummber = _playerNummber;
        for(int i = 0; i < 13;  i ++ ){
            deck[i] = new Card("Heart", i + 1);
        }
        for(int i= 0; i < 13; i ++ ){
            deck[i] = new Card("Spade", i + 1);
        }
        for(int i= 0; i < 13; i ++ ){
            deck[i] = new Card("Clober", i + 1);
        }
        for(int i= 0; i < 13; i ++ ){
            deck[i] = new Card("Daiya", i + 1);
        }
        
    }

    
}
