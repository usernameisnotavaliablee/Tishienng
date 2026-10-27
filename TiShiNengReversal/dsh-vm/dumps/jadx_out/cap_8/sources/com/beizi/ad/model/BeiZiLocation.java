package com.beizi.ad.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class BeiZiLocation {
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f7267b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f7268c;

    /* renamed from: d, reason: collision with root package name */
    private long f7269d;

    public BeiZiLocation() {
            r0 = this;
            r0.<init>()
            return
    }

    public BeiZiLocation(java.lang.String r1, java.lang.String r2, java.lang.String r3, long r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.f7267b = r2
            r0.f7268c = r3
            r0.f7269d = r4
            return
    }

    public java.lang.String getLatitude() {
            r1 = this;
            java.lang.String r0 = r1.f7267b
            return r0
    }

    public java.lang.String getLongitude() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public long getTime() {
            r2 = this;
            long r0 = r2.f7269d
            return r0
    }

    public java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = r1.f7268c
            return r0
    }

    public void setLatitude(java.lang.String r1) {
            r0 = this;
            r0.f7267b = r1
            return
    }

    public void setLongitude(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setTime(long r1) {
            r0 = this;
            r0.f7269d = r1
            return
    }

    public void setType(java.lang.String r1) {
            r0 = this;
            r0.f7268c = r1
            return
    }
}
