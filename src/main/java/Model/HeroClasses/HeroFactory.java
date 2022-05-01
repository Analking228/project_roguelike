package Model.HeroClasses;


import org.jetbrains.annotations.NotNull;

public class HeroFactory {

    private static HeroFactory instance;

    public static HeroFactory getInstance() {
        if (instance == null)
            instance = new HeroFactory();
        return instance;
    }

    public static @NotNull HeroClass newHero(String name, String title, String type){
        HeroClass hero = new Warrior();
        hero.setName(name);
        hero.setTitle(title);
        return hero;
    }
}
