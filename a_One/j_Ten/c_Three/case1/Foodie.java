package a_One.j_Ten.c_Three.case1;

public class Foodie extends Thread {
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
            synchronized (Desk.lock){
                if(Desk.count == 0){
                    break;
                }else{
                    if(Desk.flag){
                        //��
                        System.out.println("�Ի��ڳԺ�����");
                        Desk.flag = false;
                        Desk.lock.notifyAll();
                        Desk.count--;
                    }else{
                        //û�о͵ȴ�
                        //ʹ��ʲô��������,��ô�ͱ������������ȥ���õȴ��ͻ��ѵķ���.
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

