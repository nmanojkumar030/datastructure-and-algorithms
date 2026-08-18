package pattern.recognizingpatterns;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CoinGameTest {

    @Test
    public void testGameWinner_zeroCoin_currentPlayerYou() {
        CoinGame coinGame = new CoinGame();
        int numberOfCoins = 0;
        String currentPlayer = "you";
        String gameWinner = coinGame.gameWinner(numberOfCoins, currentPlayer);
        assertEquals("you", gameWinner);
    }

    @Test
    public void testGameWinner_zeroCoin_currentPlayerThem() {
        CoinGame coinGame = new CoinGame();
        int numberOfCoins = 0;
        String currentPlayer = "them";
        String gameWinner = coinGame.gameWinner(numberOfCoins, currentPlayer);
        assertEquals("them", gameWinner);
    }

    @Test
    public void testGameWinner_oneCoin_currentPlayerYou() {
        CoinGame coinGame = new CoinGame();
        int numberOfCoins = 1;
        String currentPlayer = "you";
        String gameWinner = coinGame.gameWinner(numberOfCoins, currentPlayer);
        assertEquals("them", gameWinner);
    }

    @Test
    public void testGameWinner_oneCoin_currentPlayerThem() {
        CoinGame coinGame = new CoinGame();
        int numberOfCoins = 1;
        String currentPlayer = "them";
        String gameWinner = coinGame.gameWinner(numberOfCoins, currentPlayer);
        assertEquals("you", gameWinner);
    }

    @Test
    public void testGameWinner_twoCoin_currentPlayerYou() {
        CoinGame coinGame = new CoinGame();
        int numberOfCoins = 2;
        String currentPlayer = "you";
        String gameWinner = coinGame.gameWinner(numberOfCoins, currentPlayer);
        assertEquals("you", gameWinner);
    }

    @Test
    public void testGameWinner_twoCoin_currentPlayerThem() {
        CoinGame coinGame = new CoinGame();
        int numberOfCoins = 2;
        String currentPlayer = "them";
        String gameWinner = coinGame.gameWinner(numberOfCoins, currentPlayer);
        assertEquals("you", gameWinner);
    }

    @Test
    public void testGameWinner_threeCoins_currentPlayerYou() {
        CoinGame coinGame = new CoinGame();
        String gameWinner = coinGame.gameWinner(3, "you");
        assertEquals("you", gameWinner);
    }

    @Test
    public void testGameWinner_threeCoins_currentPlayerThem() {
        CoinGame coinGame = new CoinGame();
        String gameWinner = coinGame.gameWinner(3, "them");
        assertEquals("you", gameWinner);
    }

    @Test
    public void testGameWinner_throwsForUnknownPlayer() {
        CoinGame coinGame = new CoinGame();
        assertThrows(IllegalArgumentException.class, () -> coinGame.gameWinner(3, "someone"));
    }
}