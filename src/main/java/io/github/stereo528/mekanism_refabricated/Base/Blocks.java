package io.github.stereo528.mekanism_refabricated.Base;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static io.github.stereo528.mekanism_refabricated.Mekanism_refabricated.MEKANISM_BLOCKS;
import static io.github.stereo528.mekanism_refabricated.Mekanism_refabricated.MOD_ID;
import static net.minecraft.block.Blocks.*;

public class Blocks {
    public static Logger LOGGER = LogManager.getLogger();

    //Metal Blocks
    public static final Block BLOCK_BRONZE = register("block_bronze", Metal("iron"));
    public static final Block BLOCK_COPPER = register("block_copper", Metal("iron"));
    public static final Block BLOCK_LEAD = register("block_lead", Metal("iron"));
    public static final Block BLOCK_OSMIUM = register("block_osmium", Metal("iron"));
    public static final Block BLOCK_STEEL = register("block_steel", Metal("diamond"));
    public static final Block BLOCK_TIN = register("block_tin", Metal("iron"));
    public static final Block BLOCK_URANIUM = register("block_uranium", Metal("diamond"));
    //Ores
    public static final Block ORE_COPPER = register("copper_ore", Ore("iron"));
    public static final Block ORE_LEAD = register("lead_ore", Ore("iron"));
    public static final Block ORE_OSMIUM = register("osmium_ore", Ore("iron"));
    public static final Block ORE_TIN = register("tin_ore", Ore("iron"));
    public static final Block ORE_URANIUM = register("uranium_ore", Ore("diamond"));
    //Materials
    public static final Block SALT_BLOCK = register("block_salt", new Block(FabricBlockSettings.copy(CLAY)));




    private static Block Metal(String type) {
        if(type == "iron") {
            return new Block(FabricBlockSettings.copy(IRON_BLOCK));
        }
        if(type == "diamond") {
            return new Block(FabricBlockSettings.copy(DIAMOND_BLOCK));
        }
        return null;
    }
    private static Block Ore(String type) {
        if(type == "iron") {
            return new Block(FabricBlockSettings.copy(IRON_ORE));
        }
        if(type == "diamond") {
            return new Block(FabricBlockSettings.copy(DIAMOND_ORE));
        }
        return null;
    }

    private static Block register(String name, Block block) {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), new BlockItem(block, new Item.Settings().group(MEKANISM_BLOCKS)));
        return Registry.register(Registry.BLOCK, new Identifier(MOD_ID, name), block);
    }

    public static void init() {

    }
    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_ID+"] " + message);
    }
}
