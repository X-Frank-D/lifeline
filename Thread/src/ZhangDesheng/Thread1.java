package ZhangDesheng;
import java.lang.Thread;


/**
 * Created by Administrator on 2015/11/21.
 */

public class Thread1 extends Thread{
    public void run(){
        for (int a = 0; a<520 ; a++)
        {
            System.out.println(currentThread().getName()+", I Love You the"+a+"times");
            try{
                sleep(100);
            }catch (InterruptedException e){throw new RuntimeException(e);}
        }

    }


    public static void main (String args[]){
        Thread1 a = new Thread1();
        Thread1 b = new Thread1();
        a.setName("Lingxiaoxuejie");
        b.setName("Zixixuezhang");
        a.start();
        b.start();
    }
}

