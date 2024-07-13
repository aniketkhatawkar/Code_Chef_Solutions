import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }
            // Your code goes here
            
            int currmaxa=0;
            int currmaxb=0;
            int maxa=0;
            int maxb=0;
            
            for(int i=0; i<n; i++){
                if(a[i]!=0){
                    currmaxa++;
                }
                else{
                    currmaxa=0;
                }
                
                if(b[i]!=0){
                    currmaxb++;
                }
                else{
                    currmaxb=0;
                }
                maxa=Math.max(currmaxa, maxa);
                maxb=Math.max(currmaxb, maxb);
            }
            
            if(maxa>maxb){
                System.out.println("Om");
            }
            else if(maxa<maxb){
                System.out.println("Addy");
            }
            else {
                System.out.println("Draw");
            }
        }
    }
}
