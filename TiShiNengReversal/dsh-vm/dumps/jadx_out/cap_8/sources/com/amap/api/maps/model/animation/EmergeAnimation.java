package com.amap.api.maps.model.animation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class EmergeAnimation extends com.amap.api.maps.model.animation.Animation {
    public EmergeAnimation(com.amap.api.maps.model.LatLng r2) {
            r1 = this;
            r1.<init>()
            com.autonavi.amap.mapcore.animation.GLEmergeAnimation r0 = new com.autonavi.amap.mapcore.animation.GLEmergeAnimation
            r0.<init>(r2)
            r1.glAnimation = r0
            return
    }

    @Override // com.amap.api.maps.model.animation.Animation
    protected java.lang.String getAnimationType() {
            r1 = this;
            java.lang.String r0 = "EmergeAnimation"
            return r0
    }
}
