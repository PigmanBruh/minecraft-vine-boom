package net.pigmanbruh.vineboom.item.custom;

import net.pigmanbruh.vineboom.sound.Sounds;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.minecraft.util.Hand;
import net.minecraft.entity.player.ItemCooldownManager;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;

public class VineBoomItemFunction extends Item {
    public VineBoomItemFunction(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient) {
            user.playSound(SoundEvents.VINE_BOOM_SOUND_EVENT, SoundCategory.PLAYERS, 1.0F, 1.0F);
            user.getItemCooldownManager().set(this, 5);
        }
        return super.use(world, user, hand);
    }
}
