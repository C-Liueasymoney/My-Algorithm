package exist_12;


import com.sun.source.tree.InstanceOfTree;
import org.junit.Test;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/14 9:48 上午
 */
public class MySolution {

    @Test
    public void test(){
        char[][] board = {{'a'}};
        String word = "ab";
        System.out.println(existWay(board, word));
    }

    public boolean existWay(char[][] board, String word){
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if (dfs(i, j, board, words, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int i, int j, char[][] board, char[] words, int point){
        if (i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != words[point]) return false;
        if (point == words.length - 1) return true;
        board[i][j] = '\0';
        boolean res = dfs(i, j + 1, board, words, point + 1) || dfs(i + 1, j, board, words, point + 1) ||
                dfs(i - 1, j, board, words, point + 1) || dfs(i, j - 1, board, words, point + 1);
        board[i][j] = words[point];
        return res;
    }
}
