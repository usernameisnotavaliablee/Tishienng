package com.amap.api.maps.model.particle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class SinglePointParticleShape extends com.amap.api.maps.model.particle.ParticleShapeModule {
    private float[] point_3;

    public SinglePointParticleShape(float r2, float r3, float r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public SinglePointParticleShape(float r3, float r4, float r5, boolean r6) {
            r2 = this;
            r2.<init>()
            r0 = 3
            float[] r0 = new float[r0]
            r2.point_3 = r0
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            r3 = 2
            r0[r3] = r5
            r2.isUseRatio = r6
            r2.type = r1
            return
    }

    @Override // com.amap.api.maps.model.particle.ParticleShapeModule
    public float[] getPoint() {
            r1 = this;
            float[] r0 = r1.point_3
            return r0
    }
}
