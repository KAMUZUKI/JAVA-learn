package a_One.j_Ten.a_One.threadDemo4;

/*���úͻ�ȡ�߳����ơ�Ӧ�á���������

  | ������                     | ˵��                               |
  | -------------------------- | ---------------------------------- |
  | void  setName(String name) | �����̵߳����Ƹ���Ϊ���ڲ���name   |
  | String  getName()          | ���ش��̵߳�����                   |
  | Thread  currentThread()    | ���ضԵ�ǰ����ִ�е��̶߳�������� | */
public class myThreadDemo {
    public static void main(String[] args) throws InterruptedException{

		System.out.println("˯��ǰ");
		Thread.sleep(3000);
		System.out.println("˯����");
		myThread mt1 = new myThread();
		myThread mt2 = new myThread();

    	//void setName(String name)�������̵߳����Ƹ���Ϊ���ڲ��� name
		mt1.setName("����");
   		mt2.setName("�ɻ�");   

		//Thread(String name)
		// myThread mt1 = new myThread("����");
		// myThread mt2 = new myThread("�ɻ�");	
		mt1.start();
		mt2.start();

		//static Thread currentThread() ���ضԵ�ǰ����ִ�е��̶߳��������
		System.out.println(Thread.currentThread().getName());
	}

}
