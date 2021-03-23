package tictactoe.core.score;

import java.io.IOException;

import tictactoe.core.Player;

public interface ScoreManager {

	public Integer getScore(Player player);
	
	
	public void saveScore(Player player) throws IOException;
	
	
	
}
