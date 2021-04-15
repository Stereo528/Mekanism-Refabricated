package io.github.stereo528.mekanism_refabricated.Base;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static io.github.stereo528.mekanism_refabricated.Mekanism_refabricated.MOD_ID;
import static net.minecraft.block.Blocks.IRON_BLOCK;

public class Blocks {

    //Metal Blocks
    public static final Block BLOCK_BRONZE = register("block_bronze", Metal());
    public static final Block BLOCK_COPPER = register("block_copper", Metal());
    public static final Block BLOCK_LEAD = register("block_lead", Metal());
    public static final Block BLOCK_OSMIUM = register("block_osmium", Metal());
    public static final Block BLOCK_STEEL = register("block_steel", Metal());
    public static final Block BLOCK_TIN = register("block_tin", Metal());
    public static final Block BLOCK_URANIUM = register("block_uranium", Metal());



    private static Block Metal() {
        return new Block(FabricBlockSettings.copy(IRON_BLOCK));
    }

    private static Block register(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(MOD_ID, name), block);
    }

    public static void init() {

    }
}
