package sum_number;

public class sum{
    public static void main(String[] args) {
     int n=12345;
     int sum=0;
     while(n>0){
      int digit=n % 10;
// sum of numbers 
sum=sum+digit;

     n=n/10;
     }
     System.out.println(sum);
    }
}
