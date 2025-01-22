package org.zombie.backpack_allthemodium_upgrade.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import org.zombie.backpack_allthemodium_upgrade.Backpack_allthemodium_upgrade;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Backpack_allthemodium_upgrade.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {


    }

    private void blockWithItem(DeferredBlock<?> deferredBlock){
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
