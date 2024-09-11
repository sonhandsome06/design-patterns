package study.strategy.game;

import study.strategy.game.behaviors.KnifeBehavior;
import study.strategy.game.behaviors.SwordBehavior;
import study.strategy.game.behaviors.WeaponBehavior;
import study.strategy.game.characters.King;
import study.strategy.game.characters.Queen;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        WeaponBehavior weaponSword = new SwordBehavior();
        WeaponBehavior weaponKnife = new KnifeBehavior();

        Supplier<WeaponBehavior> weaponBehaviorFunction = SwordBehavior::new;
        weaponBehaviorFunction.get().useWeapon();


        Queen characterQueen = new Queen();
        King characterKing = new King();

        characterQueen.addBehavior(weaponSword);
        characterQueen.fight();

        characterKing.addBehavior(weaponKnife);
        characterKing.fight();
    }
}
