package org.mob.backpack_allthemodium_upgrade.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.p3pp3rf1y.sophisticatedbackpacks.init.ModItems;
import org.jetbrains.annotations.Nullable;
import org.mob.backpack_allthemodium_upgrade.Backpack_allthemodium_upgrade;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, Backpack_allthemodium_upgrade.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ModItems.BACKPACK_UPGRADE_TAG)
                .add(org.mob.backpack_allthemodium_upgrade.Item.ModItems.STACK_UPGRADE_TIER_5.get(),
                        org.mob.backpack_allthemodium_upgrade.Item.ModItems.STACK_UPGRADE_TIER_6.get(),
                        org.mob.backpack_allthemodium_upgrade.Item.ModItems.STACK_UPGRADE_TIER_7.get()

                );

    }
}
