import org.junit.Test;

import java.util.Scanner;

/**
 * Created by pc on 2016/3/9.
 */
public class test {

    @Test
    public void test(){
        Scanner scanner =new Scanner (System.in );
        double F,p,i,n;
        System .out.printf("输入初始金额");
        p=scanner.nextDouble() ;
        System .out.printf("输入投资年限");
        n=scanner.nextDouble() ;
        System .out.printf("输入利率");
        i=scanner.nextDouble() ;
        F=p*Math .pow(1+i,n);
        System .out.print(F);
    }
}
