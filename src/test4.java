import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/5/8 9:20 下午
 */
public class test4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        String num = in.next();
        String[] split = num.split(",");
        for (int i = 0; i < split.length; i++){
            int n = Integer.parseInt(split[i]);
            list.add(n);
        }

        double result = maxArea(list);
        System.out.println(result);
    }

    public static double maxArea(List<Integer> height){
        double maxArea = 0;
        int length = height.size();

        for (int i = 0; i < length; i++){
            for (int j = i + 1; j < length; j++){
                int left = height.get(i);
                int right = height.get(j);
                double area = 0;

                if (left == 0 || right == 0)
                    continue;
                if (left > right){
                    area = ((j - i) * right) + ((double) ((j - i) * (left - right))) / 2;
                }else if (left < right){
                    area = ((j - i) * left) + ((double) ((j - i) * (right - left))) / 2;
                }else {
                    area = (j - i) * left;
                }

                if (area > maxArea)
                    maxArea = area;
            }
        }
        return maxArea;
    }
}
