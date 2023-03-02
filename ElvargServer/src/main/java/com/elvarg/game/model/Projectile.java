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
	private final int distanceOffset;
	private final int angle;
	private final int duration;
	private final int span;

	/**
	 * Constructs a new Projectile with the specified parameters.
	 * 
	 * @param projectileId the ID of the projectile
	 * @param startHeight  the starting height of the projectile
	 * @param endHeight    the ending height of the projectile
	 * @param delay        the delay before the projectile is sent
	 * @param speed        the speed at which the projectile travels
	 */
	public Projectile(int projectileId, int startHeight, int endHeight, int delay, int speed) {
		this.projectileId = projectileId;
		this.startHeight = startHeight;
		this.endHeight = endHeight;
		this.delay = delay;
		this.speed = speed;
		this.angle = 16;
		this.distanceOffset = 64;
		this.duration = -1;
		this.span = -1;
	}

	public Projectile(final int projectileId, final int startHeight, final int endHeight, final int delay,
			final int angle, final int distanceOffset, final int duration, final int span) {
		this.projectileId = projectileId;
		this.startHeight = startHeight;
		this.endHeight = endHeight;
		this.delay = delay;
		this.speed = Integer.MIN_VALUE;
		this.angle = angle;
		this.distanceOffset = distanceOffset;
		this.duration = duration;
		this.span = span;
	}

	public int getSpeed(Location source, Location dest) {
		return delay + duration + (Math.max(Math.abs(source.getX() - dest.getX()), Math.abs(source.getY() - dest.getY())) * span);
	}

	public int getProjectileId() {
		return projectileId;
	}

	public static void sendProjectile(Mobile source, Mobile victim, Projectile p) {
		final Location start = source.getLocation();
		final Location end = victim.getLocation();
		final int speed = p.speed == Integer.MIN_VALUE ? p.getSpeed(start, end) : p.speed;
		Projectile.sendProjectile(start, end, victim, p, source.getPrivateArea(), p.speed);
	}

	public static void sendProjectile(Location start, Location end, Projectile p) {
		Projectile.sendProjectile(start, end, null, p, null, p.speed);
	}

	public static void sendProjectile(Mobile source, Location end, Projectile p) {
		Projectile.sendProjectile(source.getLocation(), end, null, p, source.getPrivateArea(), p.speed);
	}

	private static void sendProjectile(Location start, Location end, Mobile lockon, Projectile p,
			PrivateArea privateArea, int speed) {
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
			player.getPacketSender().sendProjectile(start, end, 0, speed, p.getProjectileId(), p.startHeight, p.endHeight, lockon, p.delay, p.angle, p.distanceOffset);
		}
	}

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

		public Projectile createProjectile() {
			return new Projectile(graphicsId, startHeight, endHeight, delay, angle, distanceOffset, duration, span);
		}
	}
}