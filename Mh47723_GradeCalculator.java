public class Mh47723_GradeCalculator{
  private int exam1, exam2, exam3;
  private int hw;
  private int quiz;

  public void calculateGrade(){
    double grade = 0.25 * this.exam1 + 0.25 * this.exam2 + 0.25 * this.exam3 + 0.1 * this.hw + 0.15 * this.quiz;
    if(grade < 100 & grade > 90){
      System.out.println("A");
    }else if(grade > 80){
      System.out.println("B");
    }else if(grade > 70){
      System.out.println("C");
    }else if(grade > 60){
      System.out.println("D");
    }else if(grade > 0){
      System.out.println("F");
    }else{
      System.out.println("Error");
    }
  }

  public Mh47723_GradeCalculator(int exam1, int exam2, int exam3, int hw, int quiz){
    if(exam1 >= 0 && exam1 <= 100){
      this.exam1 = exam1;
    }

    if(exam2 >= 0 && exam2 <= 100){
      this.exam2 = exam2;
    }

    if(exam3 >= 0 && exam3 <= 100){
      this.exam3 = exam3;
    }

    if(hw >= 0 && hw <= 100){
      this.hw = hw;
    }

    if(quiz >= 0 && quiz <= 100){
      this.quiz = quiz;
    }
  }
}
