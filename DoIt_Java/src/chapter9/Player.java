package chapter9;

public class Player {
	
	private PlayerLevel level;
	
	public final int HEIGHT = 1250;
	public static int EWQ = 124;
	public static final int HEIGHQ = 13;
	
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}

}
