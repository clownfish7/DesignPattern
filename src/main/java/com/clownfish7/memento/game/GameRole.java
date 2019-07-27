package com.clownfish7.memento.game;

/**
 * @author You
 * @create 2019-07-27 20:17
 */
public class GameRole {
    private String name;
    private int vit;
    private int def;

    public GameRole(String name, int vit, int def) {
        this.name = name;
        this.vit = vit;
        this.def = def;
    }

    @Override
    public String toString() {
        return "GameRole{" +
                "name='" + name + '\'' +
                ", vit=" + vit +
                ", def=" + def +
                '}';
    }

    public Memento save() {
        return new Memento(vit, def);
    }

    public void getFromMemento(Memento memento) {
        vit = memento.getVit();
        def = memento.getDef();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
