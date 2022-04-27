package Model.HeroClasses;

import Model.Artifacts.Artifact;

public interface    HeroClass {

    int             WARRIOR = 0;

    public int      attack();
    public void     takeDamage();
    public void     equipArtifact(Artifact artifact);
    public void     takeXP(int xp);
    static String   getClassDesc(int type) {
        if (type == WARRIOR)
            return "Veeeeeeeeery\nVeeeeeeeeery\nVeeeeeeeeery\nVeeeeeeeeery\nLong and boring description of warrior";
        return "is it real?";
    }
}
