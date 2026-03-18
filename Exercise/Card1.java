public class Card1{
  private int rank;
  private int suit;
  public Card1(int currRank, int currSuit){
    //check condition
    assert isValidRank(currRank) : "InvalidRank";
    assert isValidSuit(currSuit) : "InvalidSuit";
    this.rank = currRank;
    this.suit = currSuit;
  }
  public static boolean isValidRank(int currRank){
    if(1 <= currRank && currRank <= 13) return true;
    return false;
  }
  public static boolean isValidSuit(int currSuit){
    if(1 <= currSuit && currSuit <= 4) return true;
    return false;
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
    Card1 a = new Card1(9,1);
  }
}