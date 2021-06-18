import org.junit.Test;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/5/31 11:01 下午
 */
public class test6 {
    @Test
    public void test(){
        Integer a = 100;
        Integer b = new Integer(100);
        Integer c = Integer.valueOf(100);
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(b.equals(c));

        System.out.println(a == c);
        System.out.println(b == c);

        Integer d = Integer.valueOf(200);
        Integer e = 200;
        System.out.println(d.equals(e));
        System.out.println(d == e);
    }
}
