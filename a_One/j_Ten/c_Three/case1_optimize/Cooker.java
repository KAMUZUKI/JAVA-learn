package a_One.j_Ten.c_Three.case1_optimize;

public class Cooker extends Thread {
    private Desk desk;

    public Cooker(Desk desk) {
        this.desk = desk;
    }
//    �����߲��裺
//            1���ж��������Ƿ��к�����
//    ����о͵ȴ������û�в�������
//            2���Ѻ��������������ϡ�
//            3�����ѵȴ��������߿��ԡ�

    @Override
    public void run() {
        while(true){
            synchronized (desk.getLock()){
                if(desk.getCount() == 0){
                    break;
                }else{
                    //System.out.println("��֤һ���Ƿ�ִ����");
                    if(!desk.isFlag()){
                        //����
                        System.out.println("��ʦ��������������");
                        desk.setFlag(true);
                        desk.getLock().notifyAll();
                    }else{
                        try {
                            desk.getLock().wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}