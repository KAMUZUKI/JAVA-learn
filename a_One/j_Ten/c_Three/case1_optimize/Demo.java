package a_One.j_Ten.c_Three.case1_optimize;

public class Demo {
    public static void main(String[] args) {
        /*�����߲��裺
        1���ж��������Ƿ��к�������
        2�����û�о͵ȴ���
        3������оͿ���
        4������֮�������ϵĺ�������û����
                ���ѵȴ��������߼�������
        ����������������һ*/

        /*�����߲��裺
        1���ж��������Ƿ��к�����
        ����о͵ȴ������û�в�������
        2���Ѻ��������������ϡ�
        3�����ѵȴ��������߿��ԡ�*/

        Desk desk = new Desk();

        Foodie f = new Foodie(desk);
        Cooker c = new Cooker(desk);

        f.start();
        c.start();

    }
}
