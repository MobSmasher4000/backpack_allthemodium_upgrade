package org.mob.backpack_allthemodium_upgrade.item;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.mob.backpack_allthemodium_upgrade.Backpack_allthemodium_upgrade;
import net.p3pp3rf1y.sophisticatedbackpacks.Config;
import net.p3pp3rf1y.sophisticatedcore.upgrades.stack.StackUpgradeItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM,Backpack_allthemodium_upgrade.MODID);

    public static final DeferredHolder<Item, StackUpgradeItem> STACK_UPGRADE_TIER_5 = ITEMS.register("stack_upgrade_tier_5", () ->
            new StackUpgradeItem(32, Config.SERVER.maxUpgradesPerStorage));

    public static final DeferredHolder<Item, StackUpgradeItem> STACK_UPGRADE_TIER_6 = ITEMS.register("stack_upgrade_tier_6", () ->
            new StackUpgradeItem(48, Config.SERVER.maxUpgradesPerStorage));

    public static final DeferredHolder<Item, StackUpgradeItem> STACK_UPGRADE_TIER_7 = ITEMS.register("stack_upgrade_tier_7", () ->
            new StackUpgradeItem(64, Config.SERVER.maxUpgradesPerStorage));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
