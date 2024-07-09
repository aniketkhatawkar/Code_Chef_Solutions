import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            // your code goes here
        
            String str="Alice";
            int a=0, b=0;
            
            for(int i=0; i<s.length(); i++){
                if(str.equals("Alice")  && s.charAt(i)=='A'){
                    a++;
                }
                else if(str.equals("Bob")  && s.charAt(i)=='B'){
                    b++;
                }
                else if(str.equals("Alice")  && s.charAt(i)=='B') {
                    str="Bob";
                }
                else if(str.equals("Bob")  && s.charAt(i)=='A') {
                    str="Alice";
                }
            }
            System.out.println(a+" "+b);
        }
    }
}
