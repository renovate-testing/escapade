package com.hrznstudio.escapade;

import com.hrznstudio.escapade.registry.EscapadeEntityRegistration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("escapade")
public class Escapade {
    public static final String MODID = "escapade";
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public Escapade() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        runDeferredRegistries(eventBus);
    }

    private void runDeferredRegistries(IEventBus bus) {
        EscapadeEntityRegistration.register(bus);
    }

    private void setup(final FMLCommonSetupEvent event) {}

    private void doClientStuff(final FMLClientSetupEvent event) {}

}
