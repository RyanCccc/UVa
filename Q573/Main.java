import java.util.*;
public class Main{
    public static void solve(){
    
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            int totalH = in.nextInt();
            if(totalH<=0)
                break;
            int up = in.nextInt();
            int down = in.nextInt();
            int fatigue = in.nextInt();
            double fRate = fatigue/100.0;
            double f = up*fRate;
            double height = 0;
            double cur_up = up;
            boolean suc = false;
            int day=0;
            while(height<totalH){
                day++;
                height+=cur_up;
                if(height>totalH){
                    suc = true;
                    break;
                }else{
                    height-=down;
                    if(height<0)
                        break;
                    cur_up-=f;
                    if(cur_up<0)
                        cur_up=0;
                }
            }
            if(suc)
                System.out.format("success on day %d\n", day);
            else
                System.out.format("failure on day %d\n", day);
        }
    }

}

