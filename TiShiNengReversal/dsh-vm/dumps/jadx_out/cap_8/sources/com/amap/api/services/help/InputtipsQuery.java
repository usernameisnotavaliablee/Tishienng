package com.amap.api.services.help;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class InputtipsQuery implements java.lang.Cloneable {
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f5228b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f5229c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f5230d;

    /* renamed from: e, reason: collision with root package name */
    private com.amap.api.services.core.LatLonPoint f5231e;

    public InputtipsQuery(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f5229c = r0
            r0 = 0
            r1.f5230d = r0
            r1.a = r2
            r1.f5228b = r3
            return
    }

    public java.lang.String getCity() {
            r1 = this;
            java.lang.String r0 = r1.f5228b
            return r0
    }

    public boolean getCityLimit() {
            r1 = this;
            boolean r0 = r1.f5229c
            return r0
    }

    public java.lang.String getKeyword() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public com.amap.api.services.core.LatLonPoint getLocation() {
            r1 = this;
            com.amap.api.services.core.LatLonPoint r0 = r1.f5231e
            return r0
    }

    public java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = r1.f5230d
            return r0
    }

    public void setCityLimit(boolean r1) {
            r0 = this;
            r0.f5229c = r1
            return
    }

    public void setLocation(com.amap.api.services.core.LatLonPoint r1) {
            r0 = this;
            r0.f5231e = r1
            return
    }

    public void setType(java.lang.String r1) {
            r0 = this;
            r0.f5230d = r1
            return
    }
}
