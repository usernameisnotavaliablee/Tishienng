package com.amap.api.maps.model.particle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class ColorGenerate {

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    protected final int TYPE_DEFAULT;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingExclude
    protected final int TYPE_RANDOMCOLORBETWEENTWOCONSTANTS;
    protected int type;

    public ColorGenerate() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.TYPE_DEFAULT = r0
            r1 = 0
            r2.TYPE_RANDOMCOLORBETWEENTWOCONSTANTS = r1
            r2.type = r0
            return
    }

    public abstract float[] getColor();
}
