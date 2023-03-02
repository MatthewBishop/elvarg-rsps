package com.elvarg.game.model;

import com.elvarg.game.World;
import com.elvarg.game.content.combat.magic.NewProjectile;
import com.elvarg.game.entity.impl.Mobile;
import com.elvarg.game.entity.impl.player.Player;
import com.elvarg.game.model.areas.impl.PrivateArea;

public final class Projectile {

    /*
     * Used by Chaos Fanatic, Crazy Archaeologist, and Vetion
     */
    public static void createProjectile(Mobile source, Location end, OldProjectile p) {
		new Projectile(source.getLocation(), end, null, p, source.getPrivateArea()).sendProjectile();
	}



	public static void createProjectile(Location start, Location end, Mobile lockon, OldProjectile p, PrivateArea privateArea) {
		new Projectile(start, end, lockon, p, privateArea).sendProjectile();
	}



	public static void createProjectile(Mobile source, Mobile victim, OldProjectile p) {
		new Projectile(source.getLocation(), victim.getLocation(), victim, p, source.getPrivateArea()).sendProjectile();
	}



	public static void createProjectile(Mobile source, Mobile victim, NewProjectile p) {
		new Projectile(source, victim, p).sendProjectile();
	}

	private final Location start;
    private final Location end;
    private final int speed;
    private final int projectileId;
    private final int startHeight;
    private final int endHeight;
    private final Mobile lockon;
    private final int delay;
    private final PrivateArea privateArea;
    private final int angle;
    private final int distanceOffset;
        
    //internal method+catapult
    private Projectile(Location start, Location end, Mobile lockon, OldProjectile parameterObject, PrivateArea privateArea) {
        this.start = start;
        this.lockon = lockon;
        this.end = end;
        this.projectileId = parameterObject.projectileId;
        this.delay = parameterObject.delay;
        this.speed = parameterObject.speed;
        this.startHeight = parameterObject.startHeight;
        this.endHeight = parameterObject.endHeight;
        this.privateArea = privateArea;
        this.angle = 16;
        this.distanceOffset = 64;
    }
    
    private Projectile(Mobile source, Mobile victim, NewProjectile p) {//spells
        this.start = source.getLocation();
        this.lockon = victim;
        this.end = victim.getLocation();
        this.projectileId = p.getGraphicsId();
        this.delay = p.getDelay();
        this.speed = p.getProjectileDuration(this.start, this.end);
        this.startHeight = p.getStartHeight();
        this.endHeight = p.getEndHeight();
        this.privateArea = source.getPrivateArea();
        this.angle = p.getAngle();
        this.distanceOffset = p.getDistanceOffset();
    }
        


    /**
     * Sends one projectiles using the values set when the {@link Projectile} was
     * constructed.
     */
    private void sendProjectile() {
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
            player.getPacketSender().sendProjectile(start, end, 0, speed, projectileId, startHeight, endHeight, lockon, delay, angle, distanceOffset);
        }
    }
}
