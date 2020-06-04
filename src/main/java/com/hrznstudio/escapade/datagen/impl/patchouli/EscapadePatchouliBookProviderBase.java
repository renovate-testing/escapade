package com.hrznstudio.escapade.datagen.impl.patchouli;

import com.hrznstudio.escapade.Escapade;
import net.minecraft.data.DataGenerator;
import xyz.brassgoggledcoders.patchouliprovider.PatchouliBookProvider;

public abstract class EscapadePatchouliBookProviderBase extends PatchouliBookProvider {

    public EscapadePatchouliBookProviderBase(DataGenerator gen, String locale) {
        super(gen, Escapade.MODID, locale);
    }

}
