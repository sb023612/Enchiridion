package joshie.enchiridion.library;

import net.minecraftforge.event.world.WorldEvent;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;

public class LibraryLoadEvent {
    public static LibraryDataServer data = null;

    @SubscribeEvent
    public void onLoad(WorldEvent.Load event) {
        if (FMLCommonHandler.instance().getEffectiveSide() == Side.SERVER) {
            LibraryDataServer.preloadBooks();
            data = (LibraryDataServer) event.world.loadItemData(LibraryDataServer.class, LibraryDataServer.DATA_NAME);
            if (data == null) {
                data = new LibraryDataServer(LibraryDataServer.DATA_NAME);
                event.world.setItemData(LibraryDataServer.DATA_NAME, data);
            }
        }
    }
}
