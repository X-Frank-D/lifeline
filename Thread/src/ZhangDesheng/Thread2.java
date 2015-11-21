package ZhangDesheng;
import java.lang.Runnable;
/**
 * Created by Administrator on 2015/11/21.
 */
public class Thread2 implements Runnable{
    private int a=0;
    public void run(){
        for (a=0; a<520 ; a++)
        {
            System.out.println(Thread.currentThread().getName()+", I Love You"+a+"times");
            try {
                Thread.sleep(100);
            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String args[]){
        Thread2 a = new Thread2();
        Thread2 b = new Thread2();
        Thread a1 = new Thread(a);
        Thread b1 = new Thread(b);
        a1.setName("Lingxiaoxuejie");
        b1.setName("Zixixuezhang");
        a1.start();
        b1.start();
    }
}
