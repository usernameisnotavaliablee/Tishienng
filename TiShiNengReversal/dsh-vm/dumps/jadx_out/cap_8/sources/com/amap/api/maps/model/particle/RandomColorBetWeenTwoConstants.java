package com.amap.api.maps.model.particle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class RandomColorBetWeenTwoConstants extends com.amap.api.maps.model.particle.ColorGenerate {
    private float a;
    private float a1;

    /* renamed from: b, reason: collision with root package name */
    private float f5015b;
    private float b1;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private float[] color;

    /* renamed from: g, reason: collision with root package name */
    private float f5016g;
    private float g1;
    private float r;
    private float r1;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    private java.util.Random random;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    public RandomColorBetWeenTwoConstants(float r2, float r3, float r4, float r5, float r6, float r7, float r8, float r9) {
            r1 = this;
            r1.<init>()
            r0 = 4
            float[] r0 = new float[r0]
            r0 = {x0030: FILL_ARRAY_DATA , data: [1065353216, 1065353216, 1065353216, 1065353216} // fill-array
            r1.color = r0
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r1.random = r0
            r0 = 1132396544(0x437f0000, float:255.0)
            float r2 = r2 / r0
            r1.r = r2
            float r3 = r3 / r0
            r1.f5016g = r3
            float r4 = r4 / r0
            r1.f5015b = r4
            float r5 = r5 / r0
            r1.a = r5
            float r6 = r6 / r0
            r1.r1 = r6
            float r7 = r7 / r0
            r1.g1 = r7
            float r8 = r8 / r0
            r1.b1 = r8
            float r9 = r9 / r0
            r1.a1 = r9
            r2 = 0
            r1.type = r2
            return
    }

    @Override // com.amap.api.maps.model.particle.ColorGenerate
    public float[] getColor() {
            r4 = this;
            float[] r0 = r4.color
            java.util.Random r1 = r4.random
            float r1 = r1.nextFloat()
            float r2 = r4.r1
            float r3 = r4.r
            float r2 = r2 - r3
            float r1 = r1 * r2
            float r1 = r1 + r3
            r2 = 0
            r0[r2] = r1
            float[] r0 = r4.color
            java.util.Random r1 = r4.random
            float r1 = r1.nextFloat()
            float r2 = r4.g1
            float r3 = r4.f5016g
            float r2 = r2 - r3
            float r1 = r1 * r2
            float r1 = r1 + r3
            r2 = 1
            r0[r2] = r1
            float[] r0 = r4.color
            java.util.Random r1 = r4.random
            float r1 = r1.nextFloat()
            float r2 = r4.b1
            float r3 = r4.f5015b
            float r2 = r2 - r3
            float r1 = r1 * r2
            float r1 = r1 + r3
            r2 = 2
            r0[r2] = r1
            float[] r0 = r4.color
            java.util.Random r1 = r4.random
            float r1 = r1.nextFloat()
            float r2 = r4.a1
            float r3 = r4.a
            float r2 = r2 - r3
            float r1 = r1 * r2
            float r1 = r1 + r3
            r2 = 3
            r0[r2] = r1
            float[] r0 = r4.color
            return r0
    }
}
