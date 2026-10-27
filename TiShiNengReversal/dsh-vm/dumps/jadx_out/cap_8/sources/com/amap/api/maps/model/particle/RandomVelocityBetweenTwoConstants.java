package com.amap.api.maps.model.particle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class RandomVelocityBetweenTwoConstants extends com.amap.api.maps.model.particle.VelocityGenerate {

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private java.util.Random random;
    private float x1;
    private float x2;
    private float y1;
    private float y2;
    private float z1;
    private float z2;

    public RandomVelocityBetweenTwoConstants(float r1, float r2, float r3, float r4, float r5, float r6) {
            r0 = this;
            r0.<init>()
            r0.x1 = r1
            r0.y1 = r2
            r0.z1 = r3
            r0.x2 = r4
            r0.y2 = r5
            r0.z2 = r6
            java.util.Random r1 = new java.util.Random
            r1.<init>()
            r0.random = r1
            r1 = 0
            r0.type = r1
            return
    }

    @Override // com.amap.api.maps.model.particle.VelocityGenerate
    public float getX() {
            r3 = this;
            java.util.Random r0 = r3.random
            float r0 = r0.nextFloat()
            float r1 = r3.x2
            float r2 = r3.x1
            float r1 = r1 - r2
            float r0 = r0 * r1
            float r0 = r0 + r2
            return r0
    }

    @Override // com.amap.api.maps.model.particle.VelocityGenerate
    public float getY() {
            r3 = this;
            java.util.Random r0 = r3.random
            float r0 = r0.nextFloat()
            float r1 = r3.y2
            float r2 = r3.y1
            float r1 = r1 - r2
            float r0 = r0 * r1
            float r0 = r0 + r2
            return r0
    }

    @Override // com.amap.api.maps.model.particle.VelocityGenerate
    public float getZ() {
            r3 = this;
            java.util.Random r0 = r3.random
            float r0 = r0.nextFloat()
            float r1 = r3.z2
            float r2 = r3.z1
            float r1 = r1 - r2
            float r0 = r0 * r1
            float r0 = r0 + r2
            return r0
    }
}
