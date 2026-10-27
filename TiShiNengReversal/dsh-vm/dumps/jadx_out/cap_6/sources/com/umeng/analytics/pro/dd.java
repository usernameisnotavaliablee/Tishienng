package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class dd extends com.umeng.analytics.pro.de {
    private byte[] a;
    private int b;
    private int c;

    public dd() {
            r0 = this;
            r0.<init>()
            return
    }

    public dd(byte[] r1) {
            r0 = this;
            r0.<init>()
            r0.a(r1)
            return
    }

    public dd(byte[] r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.c(r1, r2, r3)
            return
    }

    @Override // com.umeng.analytics.pro.de
    public int a(byte[] r3, int r4, int r5) throws com.umeng.analytics.pro.df {
            r2 = this;
            int r0 = r2.h()
            if (r5 <= r0) goto L7
            r5 = r0
        L7:
            if (r5 <= 0) goto L13
            byte[] r0 = r2.a
            int r1 = r2.b
            java.lang.System.arraycopy(r0, r1, r3, r4, r5)
            r2.a(r5)
        L13:
            return r5
    }

    @Override // com.umeng.analytics.pro.de
    public void a(int r2) {
            r1 = this;
            int r0 = r1.b
            int r0 = r0 + r2
            r1.b = r0
            return
    }

    public void a(byte[] r3) {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            r2.c(r3, r0, r1)
            return
    }

    @Override // com.umeng.analytics.pro.de
    public boolean a() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.umeng.analytics.pro.de
    public void b() throws com.umeng.analytics.pro.df {
            r0 = this;
            return
    }

    @Override // com.umeng.analytics.pro.de
    public void b(byte[] r1, int r2, int r3) throws com.umeng.analytics.pro.df {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "No writing allowed!"
            r1.<init>(r2)
            throw r1
    }

    @Override // com.umeng.analytics.pro.de
    public void c() {
            r0 = this;
            return
    }

    public void c(byte[] r1, int r2, int r3) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            int r2 = r2 + r3
            r0.c = r2
            return
    }

    public void e() {
            r1 = this;
            r0 = 0
            r1.a = r0
            return
    }

    @Override // com.umeng.analytics.pro.de
    public byte[] f() {
            r1 = this;
            byte[] r0 = r1.a
            return r0
    }

    @Override // com.umeng.analytics.pro.de
    public int g() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    @Override // com.umeng.analytics.pro.de
    public int h() {
            r2 = this;
            int r0 = r2.c
            int r1 = r2.b
            int r0 = r0 - r1
            return r0
    }
}
