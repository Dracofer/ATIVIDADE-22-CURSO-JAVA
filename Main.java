import java.util.Scanner;
import java.util.Locale;

public class Main {
  public static void main(String[] args) {  
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int x = 1;
    
    for(int i = 1 ; i<=n ; i=i+1){
    x=x*i;
 
    }
    System.out.printf("%d %n",x);
    sc.close();
  }
}
