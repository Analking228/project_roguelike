package Model.HeroClasses;

import Model.Artifacts.Artifact;

public class        Warrior implements HeroClass {

    private Artifact    rightHand;
    private Artifact    leftHand;
    private Artifact    armour;
    private Artifact    helmet;
    private int         level, xp, hp;
    private int         attack, defense;

    public          Warrior() {
        this.level = 0;
        this.xp = 0;
        this.hp = 100;
        this.defense = 5;
        this.attack = 5;
    }

    @Override
    public int attack() {
        return this.attack;
    }

    @Override
    public void takeDamage() {

    }

    @Override
    public void equipArtifact(Artifact artifact) {

    }

    @Override
    public void takeXP(int xp) {

    }
}
