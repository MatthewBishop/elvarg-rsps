package com.elvarg.game.content.combat.magic;

/**
 * 
 * @author Advocatus | https://www.rune-server.ee/members/119929-advocatus/
 *
 */
public class NewProjectile {

	private final int graphicsId;
	private final int startHeight;
	private final int endHeight;
	private final int delay;
	private final int angle;
	private final int duration;

	private final int distanceOffset;
	private final int multiplier;

	public NewProjectile(final int graphicsId, final int startHeight, final int endHeight, final int delay,
			final int angle, final int duration, final int distanceOffset, final int multiplier) {
		this.graphicsId = graphicsId;
		this.startHeight = startHeight;
		this.endHeight = endHeight;
		this.delay = delay;
		this.angle = angle;
		this.duration = duration;
		this.distanceOffset = distanceOffset;
		this.multiplier = multiplier;
	}
	
	public int getGraphicsId() {
		return graphicsId;
	}

	public int getStartHeight() {
		return startHeight;
	}

	public int getEndHeight() {
		return endHeight;
	}

	public int getDelay() {
		return delay;
	}

	public int getAngle() {
		return angle;
	}

	public int getDuration() {
		return duration;
	}

	public int getDistanceOffset() {
		return distanceOffset;
	}

	public int getMultiplier() {
		return multiplier;
	}
}
