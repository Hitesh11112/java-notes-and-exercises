public class Card1{
  private final int rank;
  private final int suit;
  public Card1(int currSuit,int currRank){
    //check condition
    assert isValidRank(currRank) : "InvalidRank";
    assert isValidSuit(currSuit) : "InvalidSuit";
    this.rank = currRank;
    this.suit = currSuit;
  }
  public int getRank(){
    return rank;
  }
  public int getSuit(){
    return suit;
  }
  public static boolean isValidRank(int currRank){
    return 1 <= currRank && currRank <= 13; 
  }
  public static boolean isValidSuit(int currSuit){
    return 1 <= currSuit && currSuit <= 4; 
  }
  
  public static String rankToString(int currRank){
    switch(currRank) {
      case 1: 
        return "ACE";
      case 2: 
        return "Two";
      case 3: 
        return "Three";
      case 4: 
        return "Four";
      case 5: 
        return "Five";
      case 6: 
        return "Six";
      case 7: 
        return "Seven";
      case 8: 
        return "Eight";
      case 9: 
        return "Nine";
      case 10: 
        return "Ten";
      case 11: 
        return "Jack";
      case 12: 
        return "Queen";
      case 13: 
        return "King";
      default:
        return null; 
    }
  }

  public static String suitToString(int currSuit){
    switch(currSuit){
      case 1:
        return "Diamonds"; 
      case 2:
        return "Clubs";
      case 3:
        return "Hearts";
      case 4:
        return "Spades";
      default :
        return null;
    }
  }
  public static void main(String[] arg){
    Card1 a = new Card1(3,10); 
    System.out.println(suitToString(a.getSuit()) + " of " + rankToString(a.getRank()));
  }
}