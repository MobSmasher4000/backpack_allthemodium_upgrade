package org.mob.backpack_allthemodium_upgrade.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;
import org.mob.backpack_allthemodium_upgrade.Backpack_allthemodium_upgrade;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Backpack_allthemodium_upgrade.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
//        tag(BlockTags.MINEABLE_WITH_PICKAXE)
//                .add(ModBlocks.PORTAL_BLOCK.get());
    }
}
