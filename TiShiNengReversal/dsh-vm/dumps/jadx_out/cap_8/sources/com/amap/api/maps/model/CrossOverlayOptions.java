package com.amap.api.maps.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class CrossOverlayOptions {
    com.autonavi.base.ae.gmap.gloverlay.AVectorCrossAttr a;
    private android.graphics.Bitmap bitmapDescriptor;

    public CrossOverlayOptions() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r1.bitmapDescriptor = r0
            return
    }

    public com.autonavi.base.ae.gmap.gloverlay.AVectorCrossAttr getAttribute() {
            r1 = this;
            com.autonavi.base.ae.gmap.gloverlay.AVectorCrossAttr r0 = r1.a
            return r0
    }

    public android.graphics.Bitmap getRes() {
            r1 = this;
            android.graphics.Bitmap r0 = r1.bitmapDescriptor
            return r0
    }

    public com.amap.api.maps.model.CrossOverlayOptions setAttribute(com.autonavi.base.ae.gmap.gloverlay.AVectorCrossAttr r1) {
            r0 = this;
            r0.a = r1
            return r0
    }

    public com.amap.api.maps.model.CrossOverlayOptions setRes(android.graphics.Bitmap r1) {
            r0 = this;
            r0.bitmapDescriptor = r1
            return r0
    }
}
