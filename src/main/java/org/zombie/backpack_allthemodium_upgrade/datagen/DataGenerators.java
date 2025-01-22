package org.zombie.backpack_allthemodium_upgrade.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import org.zombie.backpack_allthemodium_upgrade.Backpack_allthemodium_upgrade;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = Backpack_allthemodium_upgrade.MODID, bus = EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

//        loot table provider
//        generator.addProvider(event.includeServer(), new LootTableProvider(packOutput, Collections.emptySet(),
//                List.of(new LootTableProvider.SubProviderEntry(ModBlockLootTableProvider::new, LootContextParamSets.BLOCK)),lookupProvider));

        // recipe provider
        generator.addProvider(event.includeServer(), new ModRecipeProvider(packOutput,lookupProvider));

        //block tag provider
        BlockTagsProvider blockTagsProvider = new ModBlockTagProvider(packOutput,lookupProvider,existingFileHelper);
        generator.addProvider(event.includeServer(), blockTagsProvider);

        //item tag provider
        generator.addProvider(event.includeServer(), new ModItemTagProvider(packOutput, lookupProvider, blockTagsProvider.contentsGetter(),existingFileHelper));

        //item model provider
        generator.addProvider(event.includeClient(), new ModItemModelProvider(packOutput,existingFileHelper));

        //blockstate provider
//        generator.addProvider(event.includeClient(), new ModBlockStateProvider(packOutput,existingFileHelper));
    }
}
