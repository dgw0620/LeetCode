import java.util.*;

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int check = image[sr][sc];
        boolean[][] visited = new boolean[image.length][image[0].length];
 
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{sr, sc});

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            image[now[0]][now[1]] = color;

            for (int i = 0; i < 4; i++) {
                int newR = now[0] + dy[i];
                int newC = now[1] + dx[i];

                if (newR >= 0 && newR < image.length && newC >= 0 && newC < image[0].length) {
                    if(image[newR][newC] == check && !visited[newR][newC]) {
                        queue.add(new int[]{newR, newC});
                        visited[newR][newC] = true;
                    }
                }
            }
        }
        
        
        

        return image;
    }
}