package a_One.j_Ten.c_Three.case1_optimize;

public class Foodie extends Thread {
    private Desk desk;

    public Foodie(Desk desk) {
        this.desk = desk;
    }

    @Override
    public void run() {
//        1���ж��������Ƿ��к�������
//        2�����û�о͵ȴ���
//        3������оͿ���
//        4������֮�������ϵĺ�������û����
//                ���ѵȴ��������߼�������
//        ����������������һ

        //��·:
            //1. while(true)��ѭ��
            //2. synchronized ��,������ҪΨһ
            //3. �ж�,���������Ƿ����. ����
            //4. �ж�,���������Ƿ����. û�н���
        while(true){
            synchronized (desk.getLock()){
                if(desk.getCount() == 0){
                    break;
                }else{
                    //System.out.println("��֤һ���Ƿ�ִ����");
                    if(desk.isFlag()){
                        //��
                        System.out.println("�Ի��ڳԺ�����");
                        desk.setFlag(false);
                        desk.getLock().notifyAll();
                        desk.setCount(desk.getCount() - 1);
                    }else{
                        //û�о͵ȴ�
                        //ʹ��ʲô��������,��ô�ͱ������������ȥ���õȴ��ͻ��ѵķ���.
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

