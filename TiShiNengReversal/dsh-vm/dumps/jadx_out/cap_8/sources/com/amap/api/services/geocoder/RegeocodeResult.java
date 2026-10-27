package com.amap.api.services.geocoder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class RegeocodeResult {
    private com.amap.api.services.geocoder.RegeocodeQuery a;

    /* renamed from: b, reason: collision with root package name */
    private com.amap.api.services.geocoder.RegeocodeAddress f5219b;

    public RegeocodeResult(com.amap.api.services.geocoder.RegeocodeQuery r1, com.amap.api.services.geocoder.RegeocodeAddress r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.f5219b = r2
            return
    }

    public com.amap.api.services.geocoder.RegeocodeAddress getRegeocodeAddress() {
            r1 = this;
            com.amap.api.services.geocoder.RegeocodeAddress r0 = r1.f5219b
            return r0
    }

    public com.amap.api.services.geocoder.RegeocodeQuery getRegeocodeQuery() {
            r1 = this;
            com.amap.api.services.geocoder.RegeocodeQuery r0 = r1.a
            return r0
    }

    public void setRegeocodeAddress(com.amap.api.services.geocoder.RegeocodeAddress r1) {
            r0 = this;
            r0.f5219b = r1
            return
    }

    public void setRegeocodeQuery(com.amap.api.services.geocoder.RegeocodeQuery r1) {
            r0 = this;
            r0.a = r1
            return
    }
}
