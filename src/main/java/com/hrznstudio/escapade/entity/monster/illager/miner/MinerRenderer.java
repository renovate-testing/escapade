package com.hrznstudio.escapade.entity.monster.illager.miner;

import com.hrznstudio.escapade.Escapade;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.IllagerRenderer;
import net.minecraft.client.renderer.entity.layers.HeldItemLayer;
import net.minecraft.client.renderer.entity.model.IllagerModel;
import net.minecraft.util.ResourceLocation;

public class MinerRenderer extends IllagerRenderer<MinerEntity> {

    private static final ResourceLocation MINER_TEXTURE = new ResourceLocation(Escapade.MODID, "textures/entity/illager/vindicator.png");

    protected MinerRenderer(EntityRendererManager manager, IllagerModel<MinerEntity> entityModel, float shadowSize) {
        super(manager, entityModel, shadowSize);
        this.addLayer(new HeldItemLayer<>(this));
    }

    @Override
    public ResourceLocation getEntityTexture(MinerEntity entity) {
        return MINER_TEXTURE;
    }
}
