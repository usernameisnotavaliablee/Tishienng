package com.amap.api.services.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class SuggestionCity {
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f5167b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f5168c;

    /* renamed from: d, reason: collision with root package name */
    private int f5169d;

    protected SuggestionCity() {
            r0 = this;
            r0.<init>()
            return
    }

    public SuggestionCity(java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.f5167b = r2
            r0.f5168c = r3
            r0.f5169d = r4
            return
    }

    public java.lang.String getAdCode() {
            r1 = this;
            java.lang.String r0 = r1.f5168c
            return r0
    }

    public java.lang.String getCityCode() {
            r1 = this;
            java.lang.String r0 = r1.f5167b
            return r0
    }

    public java.lang.String getCityName() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public int getSuggestionNum() {
            r1 = this;
            int r0 = r1.f5169d
            return r0
    }

    public void setAdCode(java.lang.String r1) {
            r0 = this;
            r0.f5168c = r1
            return
    }

    public void setCityCode(java.lang.String r1) {
            r0 = this;
            r0.f5167b = r1
            return
    }

    public void setCityName(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setSuggestionNum(int r1) {
            r0 = this;
            r0.f5169d = r1
            return
    }
}
