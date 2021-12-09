package aam;

import arc.*;
import arc.func.*;
import arc.struct.*;
import arc.util.*;
import mindustry.*;
import mindustry.ctype.*;
import mindustry.game.EventType.*;
import mindustry.game.Team;
import mindustry.mod.*;
import mindustry.mod.Mods.*;
import aam.content.*;
import mindustry.net.*;
import mindustry.type.*;
import mindustry.ui.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import aam.content.*;

import static mindustry.Vars.*;

public class ArcaneAlloysMod extends Mod{
    
    public ArcaneAlloysMod(){
        Log.info("yes");
    }
    
    private final ContentList[] aamContent = {
            new AamLiquids(),
            new AamItems(),
            //new aamBullets(),
            //new aamUnits(),
            new AamBlocks()
            //new aamSectors(),
            //new aamPlanets(),
    }

    @Override
    public void loadContent() {
        for(ContentList list : aamContent){
            list.load();
        }
    }
}