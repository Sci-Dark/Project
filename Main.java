import java.util.Scanner;

class Main {
  static void main(String[ ] args) {
    Scanner input = new Scanner(System.in);
    person Me = new person();
    person Big = new person();
    Me.name = input.nextLine();
    Big.name = input.nextLine();
    System.out.println(Big.name);
    System.out.println(Me.name);
  }
}