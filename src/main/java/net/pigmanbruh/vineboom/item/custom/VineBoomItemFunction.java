package net.pigmanbruh.vineboom.item.custom;

import net.pigmanbruh.vineboom.item.Moditems;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.minecraft.util.Hand;
import net.minecraft.entity.player.ItemCooldownManager;

public class VineBoomItemFunction extends Item {
    public VineBoomItemFunction(Settings settings) {
        super(settings);
    }
    
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient() && hand == Hand.MAIN_HAND) {
            user.playSound(Moditems.VINE_BOOM_SOUND_EVENT, 1.0f, 1.0f);
            user.getItemCooldownManager().set(this, 20);
        }
        return super.use(world, user, hand);
    }
}