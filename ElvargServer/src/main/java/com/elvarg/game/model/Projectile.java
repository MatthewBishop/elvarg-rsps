package com.elvarg.game.model;

import com.elvarg.game.World;
import com.elvarg.game.entity.impl.Mobile;
import com.elvarg.game.entity.impl.player.Player;
import com.elvarg.game.model.areas.impl.PrivateArea;

public class Projectile {
	
	private final int projectileId;
	private final int startHeight;
	private final int endHeight;
	private final int delay;
	private final int speed;
	
	/**
	 * 	Constructs a new Projectile with the specified parameters.
	 * 
	 * 	@param projectileId the ID of the projectile
	 * 	@param startHeight the starting height of the projectile
	 * 	@param endHeight the ending height of the projectile
	 * 	@param delay the delay before the projectile is sent
	 * 	@param speed the speed at which the projectile travels
	 */
	public Projectile(int projectileId, int startHeight, int endHeight, int delay, int speed) {
		this.projectileId = projectileId;
		this.startHeight = startHeight;
		this.endHeight = endHeight;
		this.delay = delay;
		this.speed = speed;
	}
	
	public int getDelay() {
		return delay;
	}
	
	public int getProjectileId() {
		return projectileId;
	}
	
	public static void sendProjectile(Mobile source, Mobile victim, ComplexProjectile p) {
		//int speed = data.speed != Integer.MIN_VALUE ? data.speed : data.getProjectileDuration(this.start, this.end);
		final Location start = source.getLocation();
	    final Location end = victim.getLocation();
	    final int speed = p.getSpeed(start, end);
	    Projectile.sendProjectile(start, end, victim, p, source.getPrivateArea(), speed, p.getAngle(), p.getDistanceOffset());
	}

	public static void sendProjectile(Mobile source, Mobile victim, Projectile p) {
		Projectile.sendProjectile(source.getLocation(), victim.getLocation(), victim, p, source.getPrivateArea(), p.speed, 16, 64);
	}

	public static void sendProjectile(Location start, Location end, Projectile p) {
		Projectile.sendProjectile(start, end, null, p, null, p.speed, 16, 64);
	}

	public static void sendProjectile(Mobile source, Location end, Projectile p) {
		Projectile.sendProjectile(source.getLocation(), end, null, p, source.getPrivateArea(), p.speed, 16, 64);
	}
	
	private static void sendProjectile(Location start, Location end, Mobile lockon, Projectile p, PrivateArea privateArea, int speed, int angle, int distanceOffset) {
		//int speed = data.speed != Integer.MIN_VALUE ? data.speed : data.getProjectileDuration(this.start, this.end);
	    for (Player player : World.getPlayers()) {
	        if (player == null) {
	            continue;
	        }
	        if (player.getPrivateArea() != privateArea) {
	            continue;
	        }
	        if (!start.isViewableFrom(player.getLocation())) {
	            continue;
	        }
	        player.getPacketSender().sendProjectile(start, end, 0, speed, p.getProjectileId(), p.startHeight, p.endHeight, lockon, p.delay, angle, distanceOffset);
	    }
	}
}