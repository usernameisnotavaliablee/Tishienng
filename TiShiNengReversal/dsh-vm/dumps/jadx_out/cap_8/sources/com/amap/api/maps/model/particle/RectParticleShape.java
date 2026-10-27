package com.amap.api.maps.model.particle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class RectParticleShape extends com.amap.api.maps.model.particle.ParticleShapeModule {
    private final float bottom;
    private final float left;
    private final float right;
    private final float top;

    public RectParticleShape(float r1, float r2, float r3, float r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.left = r1
            r0.top = r2
            r0.right = r3
            r0.bottom = r4
            r0.isUseRatio = r5
            r1 = 1
            r0.type = r1
            return
    }

    @Override // com.amap.api.maps.model.particle.ParticleShapeModule
    public float[] getPoint() {
            r1 = this;
            r0 = 0
            return r0
    }
}
