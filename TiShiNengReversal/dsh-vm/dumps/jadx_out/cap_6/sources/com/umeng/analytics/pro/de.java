package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class de {
    public de() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract int a(byte[] r1, int r2, int r3) throws com.umeng.analytics.pro.df;

    public void a(int r1) {
            r0 = this;
            return
    }

    public abstract boolean a();

    public abstract void b() throws com.umeng.analytics.pro.df;

    public void b(byte[] r3) throws com.umeng.analytics.pro.df {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            r2.b(r3, r0, r1)
            return
    }

    public abstract void b(byte[] r1, int r2, int r3) throws com.umeng.analytics.pro.df;

    public abstract void c();

    public int d(byte[] r4, int r5, int r6) throws com.umeng.analytics.pro.df {
            r3 = this;
            r0 = 0
        L1:
            if (r0 >= r6) goto L33
            int r1 = r5 + r0
            int r2 = r6 - r0
            int r1 = r3.a(r4, r1, r2)
            if (r1 <= 0) goto Lf
            int r0 = r0 + r1
            goto L1
        Lf:
            com.umeng.analytics.pro.df r4 = new com.umeng.analytics.pro.df
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "Cannot read. Remote side has closed. Tried to read "
            r5.append(r1)
            r5.append(r6)
            java.lang.String r6 = " bytes, but only got "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r6 = " bytes. (This is often indicative of an internal error on the server side. Please check your server logs.)"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L33:
            return r0
    }

    public void d() throws com.umeng.analytics.pro.df {
            r0 = this;
            return
    }

    public byte[] f() {
            r1 = this;
            r0 = 0
            return r0
    }

    public int g() {
            r1 = this;
            r0 = 0
            return r0
    }

    public int h() {
            r1 = this;
            r0 = -1
            return r0
    }

    public boolean i() {
            r1 = this;
            boolean r0 = r1.a()
            return r0
    }
}
