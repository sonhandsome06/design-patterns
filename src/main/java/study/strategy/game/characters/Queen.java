package study.strategy.game.characters;

import study.strategy.game.behaviors.WeaponBehavior;

public class Queen extends Character {
    public void fight() {
        this.weaponBehavior.useWeapon();
    }

    public void addBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
