public class Mh47723_LotteryTester{
  public static void main(String [] args){
    Mh47723_LotteryWinner lottery = new Mh47723_LotteryWinner();
    lottery.checkWinnings(new int[] {10, 20, 30, 100, 200});
    lottery.checkWinnings(new int[] {50, 20, 30, 40, 10});
    lottery.checkWinnings(new int[] {100, 500, 300, 400, 200});
  }
}
