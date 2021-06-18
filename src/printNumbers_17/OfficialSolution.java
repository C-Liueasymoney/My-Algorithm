package printNumbers_17;

import org.junit.Test;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/18 12:24 上午
 */
public class OfficialSolution {
    StringBuilder res;  //存放结果字符串
    int count = 0, nine = 0, start, n; // 把输入n变成一个成员变量
    //start用来限制num的字符串左边界，以便去除多余的0
    char[] num, loop = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public String printNumbersWay(int n){
        this.n = n;
        res = new StringBuilder();
        num = new char[n];  //创建n长度的char数组，代表在全排列中的每一种情况
        start = n - 1;  //初始时需要去掉前面多余的n-1位0
        dfs(0);
        res.deleteCharAt(res.length() - 1);

        return res.toString();
    }

    private void dfs(int x){
        if (x == n){    //结束条件，x已经超过n位数
            String s = String.valueOf(num).substring(start);
            if (!s.equals("0")) res.append(s + ",");    // 不打印数字0
            if (n - start == nine) start--;
            return;
        }
        for (char i : loop){
            if (i == '9') nine++;
            num[x] = i; //通过递归的方式形成0到n位数最大值的全排列
            dfs(x + 1);
        }
        nine--;
    }

    @Test
    public void test(){
        System.out.println(printNumbersWay(3));
    }
}

