import java.security.PublicKey;
import java.util.*;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/18 10:34 上午
 */
public class test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int n = in.nextInt();
        int result = 0;

        for (int i = 0; i < n; i++){
            int num = in.nextInt();
            list.add(num);
        }

        set.addAll(list);
        while (!set.isEmpty()){
            result++;
            for (Integer integer : set) {
                list.remove(integer);
            }
            set.clear();
            set.addAll(list);
        }

        System.out.println(result);

    }
}
