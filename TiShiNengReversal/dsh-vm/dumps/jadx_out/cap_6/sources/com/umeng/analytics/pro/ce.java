package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ce implements java.io.Serializable {
    private final boolean a;
    public final byte b;
    private final java.lang.String c;
    private final boolean d;

    public ce(byte r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ce(byte r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r1 = 1
            r0.a = r1
            r0.c = r2
            r1 = 0
            r0.d = r1
            return
    }

    public ce(byte r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r1 = 0
            r0.a = r1
            r1 = 0
            r0.c = r1
            r0.d = r2
            return
    }

    public boolean a() {
            r1 = this;
            boolean r0 = r1.a
            return r0
    }

    public java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    public boolean c() {
            r2 = this;
            byte r0 = r2.b
            r1 = 12
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public boolean d() {
            r2 = this;
            byte r0 = r2.b
            r1 = 15
            if (r0 == r1) goto L11
            r1 = 13
            if (r0 == r1) goto L11
            r1 = 14
            if (r0 != r1) goto Lf
            goto L11
        Lf:
            r0 = 0
            return r0
        L11:
            r0 = 1
            return r0
    }

    public boolean e() {
            r1 = this;
            boolean r0 = r1.d
            return r0
    }
}
