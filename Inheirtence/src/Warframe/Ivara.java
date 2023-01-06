package Warframe;

public class Ivara extends Warframe {
    public Ivara(String name, String rank, String abilities) {
        super(name, rank, abilities);
        this.setName("Ivara");
        this.setRank("10");
        this.setAbilities("Artemis Bow, Prowl, Navigator, Quiver");
    }

    @Override
    public void frame() {
        System.out.println("Hi I'm " + getName() + " it is nice to see you ordis");
    }

    @Override
    public void frame(int rank) {
        super.frame(rank);
        System.out.println("Rank: " + getRank());
    }
}
