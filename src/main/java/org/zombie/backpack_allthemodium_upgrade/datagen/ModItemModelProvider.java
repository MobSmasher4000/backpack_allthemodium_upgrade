package org.zombie.backpack_allthemodium_upgrade.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.zombie.backpack_allthemodium_upgrade.Backpack_allthemodium_upgrade;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Backpack_allthemodium_upgrade.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

    }
}
