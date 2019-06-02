/**
 * @ClassName ch2_221_run
 * @Description TODO
 * @Author wll
 * @Date 2019/5/4 7:43
 * @Version 1.0
 **/
public class ch2_221_run {

    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("Hello,I'am a thread!");
            }
        };
        thread.start();
    }

}

class CreateThread implements Runnable {

    public static void main(String[] args) {
        Thread thread = new Thread(new CreateThread());
        thread.start();
    }

    public void run() {
        System.out.println("Hello,I'am an runable");
    }
}
