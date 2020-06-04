package com.hrznstudio.escapade.entity.monster.illager.summoner;

import com.hrznstudio.escapade.Escapade;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.IllagerRenderer;
import net.minecraft.client.renderer.entity.layers.HeldItemLayer;
import net.minecraft.client.renderer.entity.model.IllagerModel;
import net.minecraft.util.ResourceLocation;

public class SummonerRenderer extends IllagerRenderer<SummonerEntity> {

    private static final ResourceLocation SUMMONER_TEXTURE = new ResourceLocation(Escapade.MODID, "textures/entity/illager/vindicator.png");

    protected SummonerRenderer(EntityRendererManager manager, IllagerModel<SummonerEntity> entityModel, float shadowSize) {
        super(manager, entityModel, shadowSize);
        this.addLayer(new HeldItemLayer<>(this));
    }

    @Override
    public ResourceLocation getEntityTexture(SummonerEntity entity) {
        return SUMMONER_TEXTURE;
    }
}
