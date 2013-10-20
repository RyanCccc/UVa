import java.util.*;
public class Main{
    public static void solve(){
    
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int people = in.nextInt();
            int budget = in.nextInt();
            int hotel = in.nextInt();
            int week = in.nextInt();
            boolean shouldStay=true;
            int cost = Integer.MAX_VALUE;
            for(int i = 0; i<hotel; i++){
                int price = in.nextInt();
                for(int j=0; j<week; j++){
                    int available = in.nextInt();
                    int cur_cost=people*price; 
                    if(!(available<people)&&!(cur_cost>budget)){
                        shouldStay=false;
                        cost = cost>cur_cost?cur_cost:cost;
                    }
                }
            }
            if(shouldStay)
                System.out.println("stay home");
            else
                System.out.println(cost);
        }
    }

}
