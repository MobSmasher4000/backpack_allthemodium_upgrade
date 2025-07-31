package org.mob.backpack_allthemodium_upgrade.datagen;

import com.thevortex.allthemodium.registry.ItemRegistry;
import com.thevortex.allthemodium.registry.ModRegistry;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.p3pp3rf1y.sophisticatedbackpacks.SophisticatedBackpacks;
import net.p3pp3rf1y.sophisticatedcore.crafting.ShapeBasedRecipeBuilder;
import org.mob.backpack_allthemodium_upgrade.Item.ModItems;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput p_248933_) {
        super(p_248933_);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STACK_UPGRADE_TIER_5.get())
                .pattern("AAA")
                .pattern("ASA")
                .pattern("AAA")
                .define('A', ModRegistry.ALLTHEMODIUM_BLOCK.get())
                .define('S', net.p3pp3rf1y.sophisticatedbackpacks.init.ModItems.STACK_UPGRADE_TIER_4.get())
                .unlockedBy("has_allthemodium_block", has(ModRegistry.ALLTHEMODIUM_BLOCK.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STACK_UPGRADE_TIER_6.get())
                .pattern("VVV")
                .pattern("VSV")
                .pattern("VVV")
                .define('V', ModRegistry.VIBRANIUM_BLOCK.get())
                .define('S', ModItems.STACK_UPGRADE_TIER_5.get())
                .unlockedBy("has_vibranium_block", has(ModRegistry.VIBRANIUM_BLOCK.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STACK_UPGRADE_TIER_7.get())
                .pattern("UUU")
                .pattern("USU")
                .pattern("UUU")
                .define('U', ModRegistry.UNOBTAINIUM_BLOCK.get())
                .define('S', ModItems.STACK_UPGRADE_TIER_6.get())
                .unlockedBy("has_unobtainium_block",has(ModRegistry.UNOBTAINIUM_BLOCK.get()))
                .save(consumer);

        ShapeBasedRecipeBuilder.shaped(net.p3pp3rf1y.sophisticatedbackpacks.init.ModItems.STACK_UPGRADE_OMEGA_TIER.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.STACK_UPGRADE_TIER_7.get())
                .unlockedBy("has_stack_upgrade_tier_7", has(ModItems.STACK_UPGRADE_TIER_7.get()))
                .save(consumer, SophisticatedBackpacks.getRL("stack_upgrade_omega_tier"));
    }
}
