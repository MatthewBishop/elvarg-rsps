package com.elvarg.game.model;

public class OldProjectile {
	public final int projectileId;
	public final int delay;
	public final int speed;
	public final int startHeight;
	public final int endHeight;

	public OldProjectile(int projectileId, int delay, int speed, int startHeight, int endHeight) {
		this.projectileId = projectileId;
		this.delay = delay;
		this.speed = speed;
		this.startHeight = startHeight;
		this.endHeight = endHeight;
	}
}