import java.util.Arrays;

public class Mh47723_LotteryWinner{
  private int[] winningLotteryNumbers = new int[5];

  public void checkWinnings(int[] input){
    Arrays.sort(input);
    //System.out.println(Arrays.toString(input));

    int res = 0;
    for(int i = 0; i < 5; i++){
      if(input[i] == this.winningLotteryNumbers[i]){
        res++;
      }
    }

    int amount;
    switch(res){
      case 1:
        amount = 10;
        break;
      case 2:
        amount = 25;
        break;
      case 3:
        amount = 50;
        break;
      case 4:
        amount = 1000;
        break;
      case 5:
        amount = 10000;
        break;
      default:
        amount = 0;
        break;
    }
    System.out.println("There were " + res + " matches for a prize of $" + amount);
  }

  public Mh47723_LotteryWinner(){
    //this.winningLotteryNumbers = new int [] {10, 20, 30, 40, 50};
    this.winningLotteryNumbers[0] = 10;
    this.winningLotteryNumbers[1] = 20;
    this.winningLotteryNumbers[2] = 30;
    this.winningLotteryNumbers[3] = 40;
    this.winningLotteryNumbers[4] = 50;
  }
}
