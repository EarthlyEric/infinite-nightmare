package dev.destinysoul.infinitenightmare.sounds;

import dev.destinysoul.infinitenightmare.InfiniteNightmare;
import net.minecraft.registry.Registries;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;

public class BlockSounds {
    public static SoundEvent UNDEFINED_BLOCK_SOUND = registerSoundEvent("undefined_block_sound");

    private static SoundEvent registerSoundEvent(String name){
        Identifier id = new Identifier(InfiniteNightmare.ModID,name);
        return Registry.register(Registries.SOUND_EVENT,id,SoundEvent.of(id));
    }
    public static void registerBlockSounds(){
        InfiniteNightmare.LOGGER.info("Registering BlockSounds for " + InfiniteNightmare.ModID);
    }

}
