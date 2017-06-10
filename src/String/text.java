package String;

/**
 * 测试可变字符串序列。stringBuidler(线程不安全 高速)，stringBuffer(线程安全 低速)
 * String不可变字符序列
 * Created by lenovo on 2017/5/7.
 */
public class text {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder(32);
        StringBuilder sb2=new StringBuilder("asd");
        sb2.append("sdf");
        sb2.append(true);
        sb2.append(false).append(321).append("ss");
        System.out.println(sb2);
        StringBuilder gh=new StringBuilder("A");
        for (int i = 0; i <10; i++) {
            gh.append(i);
            System.out.println(gh);
        }
    }

}
