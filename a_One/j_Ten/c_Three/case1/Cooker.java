package a_One.j_Ten.c_Three.case1;

public class Cooker extends Thread {
    //    �����߲��裺
    //            1���ж��������Ƿ��к�����
    //    ����о͵ȴ������û�в�������
    //            2���Ѻ��������������ϡ�
    //            3�����ѵȴ��������߿��ԡ�
    @Override
    public void run() {
        while(true){
            synchronized (Desk.lock){
                if(Desk.count == 0){
                    break;
                }else{
                    if(!Desk.flag){
                        //����
                        System.out.println("��ʦ��������������");
                        Desk.flag = true;
                        Desk.lock.notifyAll();
                    }else{
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
    }