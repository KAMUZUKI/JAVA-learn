package a_One.j_Ten.b_Two;
/* 
### ��������⡿

+ ����
  �߳�������ָ�����������߶���̻߳�����жԷ�����Ҫ����Դ��������Щ�̴߳��ڵȴ�״̬���޷�ǰ��ִ��

+ ʲô����»��������
  1. ��Դ����
  2. ͬ��Ƕ�� */
public class foreverLock {
    public static void main(String[] args) {
        Object objA = new Object();
        Object objB = new Object();

        new Thread(()->{
            while(true){
                synchronized (objA){
                    //�߳�һ
                    synchronized (objB){
                        System.out.println("С��ͬѧ������·");
                    }
                }
            }
        }).start();

        new Thread(()->{
            while(true){
                synchronized (objB){
                    //�̶߳�
                    synchronized (objA){
                        System.out.println("Сޱͬѧ������·");
                    }
                }
            }
        }).start();
    }
}
