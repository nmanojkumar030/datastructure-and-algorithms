package pattern.recognizingpatterns;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestCoinGame {

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
}