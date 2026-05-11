class Solution {
    public int numIslands(char[][] grid) {
        Queue<int[]> todo = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        int islands = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1' && !visited.contains(i + "," + j)) {
                    todo.add(new int[]{i, j});
                    visited.add(i + "," + j);
                    islands++;

                    while (!todo.isEmpty()) {
                        int[] temp = todo.remove();

                        // check left
                        if (temp[1] - 1 >= 0 && grid[temp[0]][temp[1] - 1] == '1'
                                && !visited.contains(temp[0] + "," + (temp[1] - 1))) {
                            todo.add(new int[]{temp[0], temp[1] - 1});
                            visited.add(temp[0] + "," + (temp[1] - 1));
                        }
                        // check right
                        if (temp[1] + 1 < grid[0].length && grid[temp[0]][temp[1] + 1] == '1'
                                && !visited.contains(temp[0] + "," + (temp[1] + 1))) {
                            todo.add(new int[]{temp[0], temp[1] + 1});
                            visited.add(temp[0] + "," + (temp[1] + 1));
                        }
                        // check above
                        if (temp[0] - 1 >= 0 && grid[temp[0] - 1][temp[1]] == '1'
                                && !visited.contains((temp[0] - 1) + "," + temp[1])) {
                            todo.add(new int[]{temp[0] - 1, temp[1]});
                            visited.add((temp[0] - 1) + "," + temp[1]);
                        }
                        // check below
                        if (temp[0] + 1 < grid.length && grid[temp[0] + 1][temp[1]] == '1'
                                && !visited.contains((temp[0] + 1) + "," + temp[1])) {
                            todo.add(new int[]{temp[0] + 1, temp[1]});
                            visited.add((temp[0] + 1) + "," + temp[1]);
                        }
                    }
                }
            }
        }

        return islands;
    }
}