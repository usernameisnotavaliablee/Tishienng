package com.amap.api.maps.model.particle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class ParticleShapeModule {

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    protected final int TYPE_DEFAULT;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    protected final int TYPE_RECT;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    protected final int TYPE_SINGLEPOINT;
    protected boolean isUseRatio;
    protected int type;

    public ParticleShapeModule() {
            r3 = this;
            r3.<init>()
            r0 = -1
            r3.TYPE_DEFAULT = r0
            r1 = 0
            r3.TYPE_SINGLEPOINT = r1
            r2 = 1
            r3.TYPE_RECT = r2
            r3.type = r0
            r3.isUseRatio = r1
            return
    }

    public abstract float[] getPoint();

    public boolean isUseRatio() {
            r1 = this;
            boolean r0 = r1.isUseRatio
            return r0
    }
}
