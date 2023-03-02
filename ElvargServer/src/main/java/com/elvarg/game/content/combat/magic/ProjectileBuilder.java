package com.elvarg.game.content.combat.magic;

/**
 * 
 * @author Advocatus | https://www.rune-server.ee/members/119929-advocatus/
 *
 */
public class ProjectileBuilder {
    private int graphicsId = -1;
    private int startHeight = 43;
    private int endHeight = 31;
    private int delay = 51;
    private int angle = 16;
    private int duration = -5;
    private int distanceOffset = 64;
    private int multiplier = 10;

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

    public ProjectileBuilder setMultiplier(int multiplier) {
        this.multiplier = multiplier;
        return this;
    }

    public NewProjectile createProjectile() {
        return new NewProjectile(graphicsId, startHeight, endHeight, delay, angle, duration, distanceOffset, multiplier);
    }
}