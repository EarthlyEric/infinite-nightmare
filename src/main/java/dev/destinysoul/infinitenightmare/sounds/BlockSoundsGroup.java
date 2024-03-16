package dev.destinysoul.infinitenightmare.sounds;

import dev.destinysoul.infinitenightmare.InfiniteNightmare;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class BlockSoundsGroup {
    public static final BlockSoundGroup UNDEFINED_BLOCK_SOUNDS = new BlockSoundGroup(3f, 1f,
            BlockSounds.UNDEFINED_BLOCK_SOUND,
            SoundEvents.BLOCK_STEM_STEP,
            BlockSounds.UNDEFINED_BLOCK_SOUND,
            BlockSounds.UNDEFINED_BLOCK_SOUND,
            BlockSounds.UNDEFINED_BLOCK_SOUND
            );
    public static void registerBlockSoundsGroup() {
        InfiniteNightmare.LOGGER.info("Registering BlockSoundsGroup for " + InfiniteNightmare.ModID);
    }
}
