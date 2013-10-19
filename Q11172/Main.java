import java.util.*;
public class Main {
    public static void solve(int a, int b){
        if(a<b)
            System.out.println("<");
        else if(a>b)
            System.out.println(">");
        else
            System.out.println("=");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int caseNum = in.nextInt();
        for(int i = 0; i<caseNum; i++){
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            solve(num1,num2);
        }
    }

}
