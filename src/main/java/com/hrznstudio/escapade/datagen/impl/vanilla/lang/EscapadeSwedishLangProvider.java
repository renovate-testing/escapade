package com.hrznstudio.escapade.datagen.impl.vanilla.lang;

import com.hrznstudio.escapade.datagen.impl.vanilla.lang.base.EscapadeBaseLangProvider;
import com.hrznstudio.escapade.registry.EscapadeEntityRegistration;
import net.minecraft.data.DataGenerator;

public class EscapadeSwedishLangProvider extends EscapadeBaseLangProvider {

    public EscapadeSwedishLangProvider(DataGenerator gen) {
        super(gen, "sv_se");
    }

    @Override
    protected void addTranslations() {
        addEntities();
    }

    private void addEntities() {
        add(EscapadeEntityRegistration.TREASURE_PIG.get(), "Klenod Grisen");
    }
}
