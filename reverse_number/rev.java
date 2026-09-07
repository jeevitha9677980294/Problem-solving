package reverse_number;

public class rev {
  public static void main(String[] args) {
    int N = 12345;
    int reverse = 0;
    while (N > 0) {
      int digit = N % 10;
      // formula
      reverse = reverse * 10 + digit;
      N = N / 10;
    }
    System.out.println(reverse);
  }
}