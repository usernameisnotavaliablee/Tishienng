package com.amap.api.services.nearby;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class UploadInfo {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f5249b;

    /* renamed from: c, reason: collision with root package name */
    private com.amap.api.services.core.LatLonPoint f5250c;

    public UploadInfo() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.a = r0
            return
    }

    public int getCoordType() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public com.amap.api.services.core.LatLonPoint getPoint() {
            r1 = this;
            com.amap.api.services.core.LatLonPoint r0 = r1.f5250c
            return r0
    }

    public java.lang.String getUserID() {
            r1 = this;
            java.lang.String r0 = r1.f5249b
            return r0
    }

    public void setCoordType(int r2) {
            r1 = this;
            if (r2 == 0) goto L8
            r0 = 1
            if (r2 == r0) goto L8
            r1.a = r0
            return
        L8:
            r1.a = r2
            return
    }

    public void setPoint(com.amap.api.services.core.LatLonPoint r1) {
            r0 = this;
            r0.f5250c = r1
            return
    }

    public void setUserID(java.lang.String r1) {
            r0 = this;
            r0.f5249b = r1
            return
    }
}
