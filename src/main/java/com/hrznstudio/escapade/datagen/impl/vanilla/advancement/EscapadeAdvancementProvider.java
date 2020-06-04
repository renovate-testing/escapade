package com.hrznstudio.escapade.datagen.impl.vanilla.advancement;

import com.hrznstudio.escapade.datagen.ExtendableAdvancementProvider;
import net.minecraft.data.DataGenerator;

public class EscapadeAdvancementProvider extends ExtendableAdvancementProvider {

    public EscapadeAdvancementProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    public String getName() {
        return "Escapade Advancement Provider";
    }
}
