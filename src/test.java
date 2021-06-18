import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/17 11:48 下午
 */
public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();  // 商品种类数
        int m = in.nextInt();  // 订单数量
        int result = 0;

        HashMap<String, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++){
            String name = in.next();
            int price = in.nextInt();
            int number = in.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            list.add(price);
            list.add(number);

            map.put(name, list);
        }

        for (int i = 0; i < m; i++){
            String orderName = in.next();
            int orderNum = in.nextInt();

            List<Integer> orderList = map.get(orderName);
            if (orderList.get(1) < orderNum){
                result = -(i + 1);
                break;
            }else {
                result += orderList.get(0) * orderNum;

                orderList.set(1, orderList.get(1) - orderNum);
                map.put(orderName, orderList);
            }
        }

        System.out.println(result);
    }

}
