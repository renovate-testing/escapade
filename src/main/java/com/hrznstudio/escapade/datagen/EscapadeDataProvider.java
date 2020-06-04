package com.hrznstudio.escapade.datagen;

import com.hrznstudio.escapade.Escapade;
import com.hrznstudio.escapade.datagen.impl.vanilla.advancement.EscapadeAdvancementProvider;
import com.hrznstudio.escapade.datagen.impl.vanilla.lang.EscapadeEnglishLangProvider;
import com.hrznstudio.escapade.datagen.impl.vanilla.lang.EscapadeSwedishLangProvider;
import com.hrznstudio.escapade.datagen.impl.vanilla.loottable.EscapadeBlockLootTableProvider;
import com.hrznstudio.escapade.datagen.impl.vanilla.loottable.EscapadeEntityLootTableProvider;
import com.hrznstudio.escapade.datagen.impl.vanilla.recipe.EscapadeShapedRecipeProvider;
import com.hrznstudio.escapade.datagen.impl.vanilla.recipe.EscapadeShapelessRecipeProvider;
import com.hrznstudio.escapade.datagen.impl.vanilla.tags.EscapadeBlockTagProvider;
import com.hrznstudio.escapade.datagen.impl.vanilla.tags.EscapadeEntityTagProvider;
import com.hrznstudio.escapade.datagen.impl.vanilla.tags.EscapadeItemTagProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@EventBusSubscriber(modid = Escapade.MODID, bus = Bus.MOD)
public class EscapadeDataProvider {

    @SubscribeEvent
    public static void gatherDataProviders(GatherDataEvent event) {
        final DataGenerator generator = event.getGenerator();

        if (event.includeClient()) {
            generator.addProvider(new EscapadeEnglishLangProvider(generator));
            generator.addProvider(new EscapadeSwedishLangProvider(generator));
        }

        if (event.includeServer()) {
            // Advancements
            generator.addProvider(new EscapadeAdvancementProvider(generator));

            // Loot Tables
            generator.addProvider(new EscapadeBlockLootTableProvider(generator));
            generator.addProvider(new EscapadeEntityLootTableProvider(generator));

            // Recipe
            generator.addProvider(new EscapadeShapedRecipeProvider(generator));
            generator.addProvider(new EscapadeShapelessRecipeProvider(generator));

            // Tags
            generator.addProvider(new EscapadeBlockTagProvider(generator));
            generator.addProvider(new EscapadeEntityTagProvider(generator));
            generator.addProvider(new EscapadeItemTagProvider(generator));
        }
    }

}
