import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/5/8 8:56 下午
 */
public class test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int result = 0;

        for (int i = 0; i < n; i++){
            int num = in.nextInt();
            list.add(num);
        }

        for (int i = 0; i < n; i++){
            for (int j = i + 1; j <= n; j++){
                List<Integer> subList = list.subList(i, j);
                int low = 0, high = 0;
                for (Integer subNum : subList){
                    if (subNum < k)
                        low++;
                    else if (subNum > k)
                        high++;
                }
                if (high > low && result < subList.size())
                    result = subList.size();
                if (result == list.size())
                    break;
            }
        }

        System.out.println(result);
    }
}
