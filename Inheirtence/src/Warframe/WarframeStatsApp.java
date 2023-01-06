package Warframe;

public class WarframeStatsApp {
    public static void main(String[] args) {
        System.out.println("Hello, operator. Ordis is happy to see you.");
        System.out.println("------------");
        WarframeService warframeService = new WarframeService();
        warframeService.addWarframe(new Warframe("Khora","max","WhipClaw, Ensnare, Venari, StrangleDome"));

        Warframe warframe = warframeService.findWarframeByName("Khora");
        System.out.println(warframe.getName());


        Warframe warframe1 = warframeService.findWarframeByRank("max");
        System.out.println(warframe1.getRank());

        Warframe warframe2 = warframeService.findWarframeByAbilities("WhipClaw, Ensnare, Venari, StrangleDome");
        System.out.println(warframe2.getAbilities());
        warframe.frame();
        System.out.println("--------------");

        Ivara ivara = new Ivara("Ivara", "10", "Artemis Bow, Prowl, Navigator, Quiver");
        System.out.println(ivara.getName());
        System.out.println(ivara.getRank());
        System.out.println(ivara.getAbilities());
        ivara.frame(16);
        System.out.println("----------------");

    }
}