import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> rank = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            rank.put(players[i], i);
        }

        for (String calling : callings) {
            int currentIndex = rank.get(calling);
            String frontPlayer = players[currentIndex - 1];

            players[currentIndex - 1] = calling;
            players[currentIndex] = frontPlayer;

            rank.put(calling, currentIndex - 1);
            rank.put(frontPlayer, currentIndex);
        }

        return players;
    }
}