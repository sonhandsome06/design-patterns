package study.strategy.game.characters;

import study.strategy.game.behaviors.WeaponBehavior;

public abstract class Character {
    WeaponBehavior weaponBehavior;

    public abstract void fight();
}
