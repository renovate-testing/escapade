package com.hrznstudio.escapade.biome.fungal;

import net.minecraft.world.biome.Biome;

/**
 *
 */
public class FungalForestBiome extends Biome {

    public FungalForestBiome() {
        super(new Biome.Builder().waterColor(32767).waterFogColor(32767).precipitation(RainType.RAIN).downfall(0.75f).downfall(0.5f).temperature(0.175f));
    }

}
