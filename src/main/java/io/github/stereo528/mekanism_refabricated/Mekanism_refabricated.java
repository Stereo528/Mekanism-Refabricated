package io.github.stereo528.mekanism_refabricated;

import io.github.stereo528.mekanism_refabricated.Base.Blocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Mekanism_refabricated implements ModInitializer {
    public static Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "mekanism";

    public static final net.minecraft.item.ItemGroup MEKANISM_BLOCKS = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "meka_blocks"), () -> new ItemStack(Blocks.BLOCK_OSMIUM));
    public static Item.Settings meka_blocks() {
        return new Item.Settings().group(MEKANISM_BLOCKS);
    }


    @Override
    public final void onInitialize() {

        Blocks.init();

        log(Level.INFO, "Mekanism Refabricated!");
    }
    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_ID+"] " + message);
    }

}
