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

    public Artifact getRightHand() {
        return rightHand;
    }

    public void setRightHand(Artifact rightHand) {
        this.rightHand = rightHand;
    }

    public Artifact getLeftHand() {
        return leftHand;
    }

    public void setLeftHand(Artifact leftHand) {
        this.leftHand = leftHand;
    }

    public Artifact getArmour() {
        return armour;
    }

    public void setArmour(Artifact armour) {
        this.armour = armour;
    }

    public Artifact getHelmet() {
        return helmet;
    }

    public void setHelmet(Artifact helmet) {
        this.helmet = helmet;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }
}
