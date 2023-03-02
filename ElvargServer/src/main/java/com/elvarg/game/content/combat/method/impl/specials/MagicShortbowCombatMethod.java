package com.elvarg.game.content.combat.method.impl.specials;

import com.elvarg.game.content.combat.CombatFactory;
import com.elvarg.game.content.combat.CombatSpecial;
import com.elvarg.game.content.combat.hit.PendingHit;
import com.elvarg.game.content.combat.method.impl.RangedCombatMethod;
import com.elvarg.game.content.combat.ranged.RangedData.RangedWeapon;
import com.elvarg.game.entity.impl.Mobile;
import com.elvarg.game.entity.impl.player.Player;
import com.elvarg.game.model.Animation;
import com.elvarg.game.model.Graphic;
import com.elvarg.game.model.GraphicHeight;
import com.elvarg.game.model.OldProjectile;
import com.elvarg.game.model.Priority;
import com.elvarg.game.model.Projectile;

public class MagicShortbowCombatMethod extends RangedCombatMethod {

    private static final Animation ANIMATION = new Animation(1074, Priority.HIGH);
    private static final Graphic GRAPHIC = new Graphic(250, GraphicHeight.HIGH, Priority.HIGH);
	private static final OldProjectile PROJECTILE1 = new OldProjectile(249, 40, 57, 43, 31);
	private static final OldProjectile PROJECTILE2 = new OldProjectile(249, 33, 57, 48, 31);

    @Override
    public PendingHit[] hits(Mobile character, Mobile target) {
        return new PendingHit[]{new PendingHit(character, target, this, true, 3), new PendingHit(character, target, this, true, 2)};
    }

    @Override
    public boolean canAttack(Mobile character, Mobile target) {
        Player player = character.getAsPlayer();
        if (player.getCombat().getRangedWeapon() != RangedWeapon.MAGIC_SHORTBOW) {
            return false;
        }        
        if (!CombatFactory.checkAmmo(player, 2)) {
            return false;
        }
        return true;
    }

    @Override
    public void start(Mobile character, Mobile target) {
        final Player player = character.getAsPlayer();
        CombatSpecial.drain(player, CombatSpecial.MAGIC_SHORTBOW.getDrainAmount());
        player.performAnimation(ANIMATION);
        player.performGraphic(GRAPHIC);
        Projectile.createProjectile(player, target, PROJECTILE1);
        Projectile.createProjectile(character, target, PROJECTILE2);
        CombatFactory.decrementAmmo(player, target.getLocation(), 2);
    }

    @Override
    public int attackSpeed(Mobile character) {
        return super.attackSpeed(character) + 1;
    }
}