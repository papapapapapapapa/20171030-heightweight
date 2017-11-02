import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in=new Scanner(System.in);
        float x,y;
        x=in.nextFloat();
        y=in.nextFloat();
        if(y==1)
            System.out.printf("%.1f\n",(x-80)*0.7);
        else
            System.out.printf("%.1f\n",(x-70)*0.6);

    }
}
