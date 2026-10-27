package com.amap.api.services.geocoder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class GeocodeResult {
    private com.amap.api.services.geocoder.GeocodeQuery a;

    /* renamed from: b, reason: collision with root package name */
    private java.util.List<com.amap.api.services.geocoder.GeocodeAddress> f5203b;

    public GeocodeResult(com.amap.api.services.geocoder.GeocodeQuery r2, java.util.List<com.amap.api.services.geocoder.GeocodeAddress> r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r2
            r1.f5203b = r3
            return
    }

    public java.util.List<com.amap.api.services.geocoder.GeocodeAddress> getGeocodeAddressList() {
            r1 = this;
            java.util.List<com.amap.api.services.geocoder.GeocodeAddress> r0 = r1.f5203b
            return r0
    }

    public com.amap.api.services.geocoder.GeocodeQuery getGeocodeQuery() {
            r1 = this;
            com.amap.api.services.geocoder.GeocodeQuery r0 = r1.a
            return r0
    }

    public void setGeocodeAddressList(java.util.List<com.amap.api.services.geocoder.GeocodeAddress> r1) {
            r0 = this;
            r0.f5203b = r1
            return
    }

    public void setGeocodeQuery(com.amap.api.services.geocoder.GeocodeQuery r1) {
            r0 = this;
            r0.a = r1
            return
    }
}
