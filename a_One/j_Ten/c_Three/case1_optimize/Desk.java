package a_One.j_Ten.c_Three.case1_optimize;

public class Desk {

    //����һ�����
    //true �ͱ�ʾ�������к�������,��ʱ����Ի�ִ��
    //false �ͱ�ʾ������û�к�������,��ʱ�����ʦִ��
    //public static boolean flag = false;
    private boolean flag;

    //��������������
    //public static int count = 10;
    //�Ժ�������ʹ�����ֱ�����Ĭ��ֵ�ı���
   // private int count = 10;
    private int count;

    //������
    //public static final Object lock = new Object();
    private final Object lock = new Object();

    public Desk() {
        this(false,10); // �ڿղ��ڲ����ô���,�Գ�Ա�������и�ֵ,֮��Ϳ���ֱ��ʹ�ó�Ա������
    }

    public Desk(boolean flag, int count) {
        this.flag = flag;
        this.count = count;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Object getLock() {
        return lock;
    }

    @Override
    public String toString() {
        return "Desk{" +
                "flag=" + flag +
                ", count=" + count +
                ", lock=" + lock +
                '}';
    }
}
