import java.util.*;
public class Main{
    public static void solve(int x, int y, int a, int b){
        if(a>x&&b>y)
            System.out.println("NE");
        else if(a>x && b<y)
            System.out.println("SE");
        else if(a<x && b<y)
            System.out.println("SO");
        else if(a<x && b>y)
            System.out.println("NO");
        else
            System.out.println("divisa");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            int caseNum = in.nextInt();
            if(caseNum==0)
                return;
            int x = in.nextInt();
            int y = in.nextInt();
            for(int i = 0; i<caseNum; i++){
                int a = in.nextInt();
                int b = in.nextInt();
                solve(x,y,a,b);
            }
        }
    }

}
