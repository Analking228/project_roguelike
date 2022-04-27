package Model.HeroClasses;

import Model.Artifacts.Artifact;

public interface    HeroClass {

    public int      attack();
    public void     takeDamage();
    public void     equipArtifact(Artifact artifact);
    public void     takeXP(int xp);
    public String   getClassDesc();
}
