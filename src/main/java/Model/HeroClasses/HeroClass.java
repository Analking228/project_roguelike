package Model.HeroClasses;

import Model.Artifacts.Artifact;

public interface    HeroClass {

    public void     attack(Artifact ...artifacts);
    public void     takeDamage(Artifact ...artifacts);
    public void     equipArtifact(Artifact artifact);
    public void     takeXP(int xp);
}
