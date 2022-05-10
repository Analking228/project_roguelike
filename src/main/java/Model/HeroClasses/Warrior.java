package Model.HeroClasses;

public class        Warrior extends HeroClass {

    public Warrior() {
        this.level = 1;
        this.xp = 0;
        this.hp = 100;
        this.attack = 5;
        this.defense = 5;
    }

    @Override
    public String battleCry() {
        return "Arrrrrght! WANNA DICKS";
    }
}
