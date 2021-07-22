package a_One.j_Ten.b_Two;

public class MyRunnable implements Runnable {
    private static int ticketCount = 100;

    @Override
    public void run() {
        while(true){
            if("����һ".equals(Thread.currentThread().getName())){
                //ͬ������
                boolean result = synchronizedMthod();
                if(result){
                    break;
                }
            }

            if("���ڶ�".equals(Thread.currentThread().getName())){
                //ͬ�������
                synchronized (MyRunnable.class){
                    if(ticketCount == 0){
                       break;
                    }else{
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        ticketCount--;
                        System.out.println(Thread.currentThread().getName() + "����Ʊ,��ʣ��" + ticketCount + "��Ʊ");
                    }
                }
            }

        }
    }

    private static synchronized boolean synchronizedMthod() {
        if(ticketCount == 0){
            return true;
        }else{
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticketCount--;
            System.out.println(Thread.currentThread().getName() + "����Ʊ,��ʣ��" + ticketCount + "��Ʊ");
            return false;
        }
    }
}
