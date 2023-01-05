package Warframe;

public class Warframe {
    private String name;
    private String rank;
    private String abilities;

    public Warframe (String name, String rank, String abilities){
        this.name = name;
        this.rank = rank;
        this.abilities = abilities;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getAbilities() {
        return abilities;
    }

    public void setAbilities(String abilities) {
        this.abilities = abilities;
    }
}
