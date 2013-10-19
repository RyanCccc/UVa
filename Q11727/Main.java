import java.util.*;
public class Main{
    public static void solve(int a,int b,int c,int n){
        int max=a<b?b:a;
        int min=a<b?a:b;
        if(c<min)
            System.out.format("Case %d: %d\n",n,min);
        else if(c>max)
            System.out.format("Case %d: %d\n",n,max);
        else
            System.out.format("Case %d: %d\n",n,c);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int caseNum = in.nextInt();
        for(int i = 0; i<caseNum; i++){
            int a= in.nextInt();
            int b= in.nextInt();
            int c= in.nextInt();
            solve(a,b,c,i+1);
        }
    }

}
