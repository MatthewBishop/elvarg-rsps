package com.elvarg.game.model;

import com.elvarg.game.World;
import com.elvarg.game.entity.impl.Mobile;
import com.elvarg.game.entity.impl.player.Player;
import com.elvarg.game.model.areas.impl.PrivateArea;
import com.elvarg.net.packet.PacketBuilder;
import com.elvarg.net.packet.PacketSender;
import com.elvarg.net.packet.ValueType;

public final class Projectile {

    private final Location start;
    private final Location end;
    private final int speed;
    private final int projectileId;
    private final int startHeight;
    private final int endHeight;
    private final Mobile lockon;
    private final int delay;
    private final PrivateArea privateArea;

    public Projectile(Mobile source, Location end, int projectileId) {
        this(source.getLocation(), end, null, projectileId, 40, 80, 31, 43, source.getPrivateArea());
    }
    
    public Projectile(Location start, Location end, Mobile lockon, int projectileId, int delay, int speed,
            int startHeight, int endHeight, PrivateArea privateArea) {
        this.start = start;
        this.lockon = lockon;
        this.end = end;
        this.projectileId = projectileId;
        this.delay = delay;
        this.speed = speed;
        this.startHeight = startHeight;
        this.endHeight = endHeight;
        this.privateArea = privateArea;
    }

    public Projectile(Mobile source, Mobile victim, int projectileId) {
        this(source.getLocation(), victim.getLocation(), victim, projectileId, 0, 20, 43, 31, source.getPrivateArea());
    }
    
    public Projectile(Mobile source, Mobile victim, int projectileId, int delay, int speed, int startHeight,
            int endHeight) {
        this(source.getLocation(), victim.getLocation(), victim, projectileId, delay, speed, startHeight, endHeight, source.getPrivateArea());
    }

    /**
     * Sends one projectiles using the values set when the {@link Projectile} was
     * constructed.
     */
    public void sendProjectile() {
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
            sendProjectile(player, start, end, 0, speed, projectileId, startHeight, endHeight, lockon, delay);
        }
    }
    
    private static void sendPosition(Player player, final Location position) {
		final Location other = player.getLastKnownRegion();
		PacketBuilder out = new PacketBuilder(85);
		out.put(position.getY() - 8 * other.getRegionY(), ValueType.C);
		out.put(position.getX() - 8 * other.getRegionX(), ValueType.C);
		player.getSession().write(out);
	}
	
	private static void sendProjectile(Player player, Location start, Location end, int offset, int speed, int projectileId,
			int startHeight, int endHeight, Mobile lockon, int delay) {
		sendPosition(player, start);
		PacketBuilder out = new PacketBuilder(117);
		out.put(offset);
		out.put((end.getX() - start.getX()));
		out.put((end.getY() - start.getY()));		
        if (lockon != null) {
            out.putShort(lockon.isPlayer() ? -(lockon.getIndex() + 1) : lockon.getIndex() + 1);
        } else {
            out.putShort(0);
        }
        out.putShort(projectileId);
		out.put(startHeight);
		out.put(endHeight);
		out.putShort(delay);
		out.putShort(speed);
		out.put(16); // Angle
		out.put(64);
		player.getSession().write(out);
	}
}
