package Warframe;

import java.util.ArrayList;
import java.util.List;

public class WarframeService {
    private final List<Warframe> warframes;
    public WarframeService(){
        warframes = new ArrayList<>();
    }
    public void addWarframe(Warframe warframe){
        warframes.add(warframe);
    }
    public Warframe findWarframeByName(String name){
        for (Warframe warframe : warframes){
            if (warframe.getName().equals(name)){
                return warframe;
            }
        }
        return null;
    }
    public Warframe findWarframeByRank(String rank){
        for (Warframe warframe : warframes){
            if (warframe.getRank().equals(rank)){
                return warframe;
            }
        }
        return null;
    }
    public Warframe findWarframeByAbilities(String abilities){
        for (Warframe warframe : warframes){
            if (warframe.getAbilities().equals(abilities)){
                return warframe;
            }
        }
        return null;
    }
}
