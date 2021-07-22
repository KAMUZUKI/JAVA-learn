package a_One.j_Ten.a_One.threadDemo4;

/*设置和获取线程名称【应用】方法介绍

  | 方法名                     | 说明                               |
  | -------------------------- | ---------------------------------- |
  | void  setName(String name) | 将此线程的名称更改为等于参数name   |
  | String  getName()          | 返回此线程的名称                   |
  | Thread  currentThread()    | 返回对当前正在执行的线程对象的引用 | */
public class myThreadDemo {
    public static void main(String[] args) throws InterruptedException{

		System.out.println("睡觉前");
		Thread.sleep(3000);
		System.out.println("睡醒了");
		myThread mt1 = new myThread();
		myThread mt2 = new myThread();

    	//void setName(String name)：将此线程的名称更改为等于参数 name
		mt1.setName("高铁");
   		mt2.setName("飞机");   

		//Thread(String name)
		// myThread mt1 = new myThread("高铁");
		// myThread mt2 = new myThread("飞机");	
		mt1.start();
		mt2.start();

		//static Thread currentThread() 返回对当前正在执行的线程对象的引用
		System.out.println(Thread.currentThread().getName());
	}

}
