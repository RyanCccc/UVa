import java.util.*;
public class Main{
    public static void solve(){
    
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count=0;
        while(true){
            count++;
            int numReq = in.nextInt();
            if(numReq<=0)
                break;
            if(count>1)
                System.out.println();
            int numPro = in.nextInt();
            for(int i=-1; i<numReq; i++){
                in.nextLine();
            }
            String candidate = "";
            double can_price = Double.MAX_VALUE;
            int can_met = 0;
            for(int i=0; i<numPro; i++){
                String proName = in.nextLine();
                //System.out.println(proName);
                double price = in.nextDouble();
                int numMet = in.nextInt();
                if(numMet>can_met){
                    candidate = proName;
                    can_price = price;
                    can_met = numMet;
                }else if(numMet==can_met){
                    if(can_price>price){
                        candidate = proName;
                        can_price = price;
                        can_met = numMet;
                    }
                }
                for(int j=-1; j<numMet;j++){
                    in.nextLine();
                }
            }
            System.out.println("RFP #"+count);
            System.out.println(candidate);
        }
    }

}

