package net.m508.testmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.m508.testmod.TestMod;
import net.m508.testmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

//Adding Creative mode Groups
public class ModItemGroups {
    public static final ItemGroup TEST_MOD_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TestMod.MOD_ID, "test_mod_items"),
            FabricItemGroup.builder().icon(()-> new ItemStack(ModItems.WOODEN_HILT))
                    .displayName(Text.translatable("itemgroup.testmod.test_mod_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.WOODEN_BLADE);
                        entries.add(ModItems.WOODEN_HILT);


                    }).build());

    public static final ItemGroup TEST_MOD_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TestMod.MOD_ID, "test_mod_blocks"),
            FabricItemGroup.builder().icon(()-> new ItemStack(ModBlocks.TOOL_BENCH))
                    .displayName(Text.translatable("itemgroup.testmod.test_mod_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.TOOL_BENCH);


                    }).build());



    public static void registerItemGroups(){
        TestMod.LOGGER.info("Registering Item Groups for " + TestMod.MOD_ID);
    }
}
