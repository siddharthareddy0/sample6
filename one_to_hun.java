import java.util.*;
public class one_to_hun{
    public static void main(String[] args) {
        int count;
          List<Integer> li=new ArrayList<>();
          for(int i=2;i<=100;i++)
          {
            count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0){
                    count++;
                }
            }
            if(count<=2){
                li.add(i);
            }
          }
          for(int i=0;i<li.size()-10;i++){
            System.out.print(li.get(i)+" ");
          }
    }
}