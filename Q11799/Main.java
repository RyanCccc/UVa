import java.util.*;
public class Main{
    public static void solve(){
    
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int caseNum = in.nextInt();
        for(int i = 0; i<caseNum; i++){
            int num = in.nextInt();
            int max = 0;
            for(int j=0; j<num; j++){
                int speed = in.nextInt();
                max = speed>max?speed:max;
            }
            System.out.format("Case %d: %d\n", i+1, max);
        }
    }

}

