package Model.HeroClasses;

import Model.Artifacts.Artifact;

abstract public class   HeroClass {

    public static int   WARRIOR = 0;
    public static int   ROGUE = 1;
    public static int   MAGE = 2;
    protected Artifact  hand;
    protected Artifact  armour;
    protected Artifact  helmet;
    protected int       level, xp, hp;
    protected int       attack, defense;

    public int          attack(){
        return attack;
    }
    public void         takeDamage(int damage){
        hp -= damage - defense;
    }
    public void         equipArtifact(Artifact artifact) {
        armour = artifact;
    }
    public void         takeXP(int xp){
        this.xp += xp;
    }
    public static String   getClassDesc(int type) {
        if (type == WARRIOR)
            return "Veeeeeeeeery\nVeeeeeeeeery\nVeeeeeeeeery\nVeeeeeeeeery\nLong and boring description of warrior";
        return "is it real?";
    }
}
