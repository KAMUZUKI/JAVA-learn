package a_One.j_Ten.a_One.threadDemo3;

import java.util.concurrent.Callable;

public class myCallable implements Callable<String>{
    @Override
    public String call() throws Exception{
        for (int i = 0; i < 100; i++) {
            System.out.println("��Ů�����" + i + "��");
        }
        return "��Ӧ��";
    }
}
