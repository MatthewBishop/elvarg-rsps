package com.elvarg.game.model;

/**
 * 
 * @author Advocatus | https://www.rune-server.ee/members/119929-advocatus/
 *
 */
public class ComplexProjectile extends Projectile {
	
	private final int angle;
	private final int duration;
	private final int distanceOffset;
	private final int span;

	public ComplexProjectile(final int projectileId, final int startHeight, final int endHeight, final int delay,
			final int angle, final int duration, final int distanceOffset, final int span) {
		super(projectileId, startHeight, endHeight, delay, Integer.MIN_VALUE);
		this.angle = angle;
		this.duration = duration;
		this.distanceOffset = distanceOffset;
		this.span = span;
	}
		
	public int getAngle() {
		return angle;
	}

	public int getDistanceOffset() {
		return distanceOffset;
	}
	
	public int getSpeed(Location source, Location dest) {
		return getDelay() + duration + (Math.max(Math.abs(source.getX() - dest.getX()), Math.abs(source.getY() - dest.getY())) * span);
	}
	
	/**
	 * Factory to allow the building of projectiles with default values being the most commonly used.
	 * 
	 */
	public static class ProjectileBuilder {
	    private int graphicsId = -1;
	    private int startHeight = 43;
	    private int endHeight = 31;
	    private int delay = 51;
	    private int angle = 16;
	    private int duration = -5;
	    private int distanceOffset = 64;
	    private int span = 10;

	    public ProjectileBuilder setGraphicsId(int graphicsId) {
	        this.graphicsId = graphicsId;
	        return this;
	    }

	    public ProjectileBuilder setStartHeight(int startHeight) {
	        this.startHeight = startHeight;
	        return this;
	    }

	    public ProjectileBuilder setEndHeight(int endHeight) {
	        this.endHeight = endHeight;
	        return this;
	    }

	    public ProjectileBuilder setDelay(int delay) {
	        this.delay = delay;
	        return this;
	    }

	    public ProjectileBuilder setAngle(int angle) {
	        this.angle = angle;
	        return this;
	    }

	    public ProjectileBuilder setDuration(int duration) {
	        this.duration = duration;
	        return this;
	    }

	    public ProjectileBuilder setDistanceOffset(int distanceOffset) {
	        this.distanceOffset = distanceOffset;
	        return this;
	    }

	    public ProjectileBuilder setSpan(int span) {
	        this.span = span;
	        return this;
	    }

	    public ComplexProjectile createProjectile() {
	        return new ComplexProjectile(graphicsId, startHeight, endHeight, delay, angle, duration, distanceOffset, span);
	    }
	}
}
