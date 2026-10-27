package com.amap.api.services.route;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ElecConsumeInfo {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private int f5422b;

    /* renamed from: c, reason: collision with root package name */
    private com.amap.api.services.core.LatLonPoint f5423c;

    /* renamed from: d, reason: collision with root package name */
    private java.util.List<java.lang.Integer> f5424d;

    public ElecConsumeInfo() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5424d = r0
            return
    }

    public int getConsumeEnergy() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public java.util.List<java.lang.Integer> getLeftEnergy() {
            r1 = this;
            java.util.List<java.lang.Integer> r0 = r1.f5424d
            return r0
    }

    public com.amap.api.services.core.LatLonPoint getRunOutPoint() {
            r1 = this;
            com.amap.api.services.core.LatLonPoint r0 = r1.f5423c
            return r0
    }

    public int getRunOutStepIndex() {
            r1 = this;
            int r0 = r1.f5422b
            return r0
    }

    public void setConsumeEnergy(int r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setLeftEnergy(java.util.List<java.lang.Integer> r1) {
            r0 = this;
            r0.f5424d = r1
            return
    }

    public void setRunOutPoint(com.amap.api.services.core.LatLonPoint r1) {
            r0 = this;
            r0.f5423c = r1
            return
    }

    public void setRunOutStepIndex(int r1) {
            r0 = this;
            r0.f5422b = r1
            return
    }
}
