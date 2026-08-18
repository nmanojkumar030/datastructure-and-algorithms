package pattern.recognizingpatterns;

public class CoinGame {

    public String gameWinner(int numberOfCoins, String currentPlayer) {
        if (numberOfCoins <= 0) {
            return currentPlayer;
        }

        String nextPlayer = switchPlayersTurn(currentPlayer);

        if (gameWinner(numberOfCoins - 1, nextPlayer).equalsIgnoreCase("you")
                || gameWinner(numberOfCoins - 2, nextPlayer).equalsIgnoreCase("you")) {
            return "you";
        } else {
            return "them";
        }
    }

    private String switchPlayersTurn(String currentPlayer) {
        if (currentPlayer.equalsIgnoreCase("you")) {
            return "them";
        } else if (currentPlayer.equalsIgnoreCase("them")) {
            return "you";
        }
        throw new IllegalArgumentException("Unknown player: " + currentPlayer);
    }
}
