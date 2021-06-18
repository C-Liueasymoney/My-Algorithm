package permutation_38;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;


/**
 * @Description:
 * @Author: chong
 * @Data: 2021/5/11 9:03 下午
 */
public class MySolution {
    List<String> res = new LinkedList<>();
    char[] c;
    public String[] permutation(String s){
        c = s.toCharArray();
        dfs(0);
        return res.toArray(new String[c.length]);
    }

    public void dfs(int n){
        if (n == c.length - 1){
            res.add(String.valueOf(c));
            return;
        }

        HashSet<Character> set = new HashSet<>();

        for (int i = n; i < c.length; i++){
            if (set.contains(c[i])) continue;
            set.add(c[i]);
            swap(i, n);
            dfs(n + 1);
            swap(i, n);
        }
    }

    public void swap(int a, int b){
        char temp = c[a];
        c[a] = c[b];
        c[b] = temp;
    }


    @Test
    public void test(){
        String[] abcds = permutation("abc");
        System.out.println(Arrays.asList(abcds));
    }
}
