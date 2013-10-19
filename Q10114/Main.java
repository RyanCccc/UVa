import java.util.*;
public class Main{
    public static void solve(int month, double down, double loan, double[] rates){
        double per = loan/month;
        double val = (loan+down);
        for(int i=0; i<=month; i++){
            double owe = loan-i*per;
            val=val*(1-rates[i]);
            if(owe<val){
                System.out.format("%d month",i);
                if(i!=1)
                    System.out.format("s");
                System.out.format("\n");
                return;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            int month = in.nextInt();
            if(month<0)
                break;
            double down = in.nextDouble();
            double loan = in.nextDouble();
            int caseNum = in.nextInt();
            double[] rates = new double[101];
            for(int i = 0; i<caseNum; i++){
                int num = in.nextInt();
                double rate = in.nextDouble();
                for(int j=num; j<101; j++){
                    rates[j] = rate;
                }
            }
            solve(month, down, loan, rates);
        }
    }

}

