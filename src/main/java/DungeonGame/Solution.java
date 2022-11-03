package DungeonGame;


import java.util.LinkedList;
import java.util.List;

public class Solution {

    LinkedList<Integer> ways = new LinkedList<>();
    int height;
    int width;
    public static void main(String[] args) {

    }

    public int calculateMinimumHP(int[][] dungeon) {
        width = dungeon.length;;
        height = dungeon[0].length;
        for (int i = 0; i < width; ++i) {
            for(int j = 0; j < height; ++j) {
                ways(dungeon[i][j], dungeon[i+1][j], dungeon[i][j+1]);
            }
        }
        return 0;
    }

    public static void ways(int temp, int next_i, int next_j) {

    }

}
