import java.util.*;
public class Main{
    public static void solve(){
    
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            int length = in.nextInt();
            if(length<=0)
                break;
            boolean pos = true;
            char dir = 'x';
            for(int i=0; i<(length-1); i++){
                String input = in.next();
                if(input.equals("No"))
                    continue;
                char cur_d = input.charAt(1);
                boolean cur_pos = input.charAt(0)=='+'?true:false;
                if(dir=='x'){
                    dir = cur_d;
                    pos = pos?cur_pos:!cur_pos;
                }else if(dir==cur_d){
                    dir = 'x';
                    pos = pos==cur_pos?false:true;
                }
            }
            System.out.print(pos?"+":"-");
            System.out.println(dir);
        }

    }

}

