package a_One.j_Ten.b_Two;
/* 
## �߳�ͬ��
2.1��Ʊ��Ӧ�á�

- ��������
  ĳ��ӰԺĿǰ������ӳ������Ƭ������100��Ʊ��������3��������Ʊ�������һ������ģ��õ�ӰԺ��Ʊ

- ʵ�ֲ���
  - ����һ����SellTicketʵ��Runnable�ӿڣ����涨��һ����Ա������private int tickets = 100;
  - ��SellTicket������дrun()����ʵ����Ʊ�����벽������
  - �ж�Ʊ������0������Ʊ������֪���ĸ���������
  - ����Ʊ֮����Ʊ��Ҫ��1
  - Ʊ��û�ˣ��߳�ֹͣ
  - ����һ��������SellTicketDemo��������main���������벽������
  - ����SellTicket��Ķ���
  - ��������Thread��Ķ��󣬰�SellTicket������Ϊ���췽���Ĳ�������������Ӧ�Ĵ�������
  - �����߳� */
public class SellTicketDemo {
    public static void main(String[] args) {
        //����SellTicket��Ķ���
        SellTicket st = new SellTicket();
        
        //��������Thread��Ķ��󣬰�SellTicket������Ϊ���췽���Ĳ�������������Ӧ�Ĵ�������
        Thread t1 = new Thread(st,"����1");
        Thread t2 = new Thread(st,"����2");
        Thread t3 = new Thread(st,"����3");

        //�����߳�
        t1.start();
        t2.start();
        t3.start();
    }
}
