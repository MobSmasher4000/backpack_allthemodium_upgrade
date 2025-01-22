package org.zombie.backpack_allthemodium_upgrade.datagen;

import com.thevortex.allthemodium.registry.ModRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;
import org.zombie.backpack_allthemodium_upgrade.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STACK_UPGRADE_TIER_5.get())
                .pattern("AAA")
                .pattern("ASA")
                .pattern("AAA")
                .define('A', ModRegistry.ALLTHEMODIUM_BLOCK.get())
                .define('S', net.p3pp3rf1y.sophisticatedbackpacks.init.ModItems.STACK_UPGRADE_TIER_4.get())
                .unlockedBy("has_allthemodium_block",has((ItemLike) ModRegistry.ALLTHEMODIUM_BLOCK))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STACK_UPGRADE_TIER_6.get())
                .pattern("VVV")
                .pattern("VSV")
                .pattern("VVV")
                .define('V', ModRegistry.VIBRANIUM_BLOCK.get())
                .define('S', ModItems.STACK_UPGRADE_TIER_5.get())
                .unlockedBy("has_vibranium_block",has((ItemLike) ModRegistry.VIBRANIUM_BLOCK))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STACK_UPGRADE_TIER_7.get())
                .pattern("UUU")
                .pattern("USU")
                .pattern("UUU")
                .define('U', ModRegistry.UNOBTAINIUM_BLOCK.get())
                .define('S', ModItems.STACK_UPGRADE_TIER_6.get())
                .unlockedBy("has_unobtainium_block",has((ItemLike) ModRegistry.UNOBTAINIUM_BLOCK))
                .save(recipeOutput);
    }
}
