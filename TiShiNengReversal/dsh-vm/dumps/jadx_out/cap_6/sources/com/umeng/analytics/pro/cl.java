package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class cl {
    public final java.lang.String a;
    public final byte b;
    public final short c;

    public cl() {
            r2 = this;
            java.lang.String r0 = ""
            r1 = 0
            r2.<init>(r0, r1, r1)
            return
    }

    public cl(java.lang.String r1, byte r2, short r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public boolean a(com.umeng.analytics.pro.cl r3) {
            r2 = this;
            byte r0 = r2.b
            byte r1 = r3.b
            if (r0 != r1) goto Le
            short r0 = r2.c
            short r3 = r3.c
            if (r0 != r3) goto Le
            r3 = 1
            return r3
        Le:
            r3 = 0
            return r3
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "<TField name:'"
            r0.append(r1)
            java.lang.String r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = "' type:"
            r0.append(r1)
            byte r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = " field-id:"
            r0.append(r1)
            short r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ">"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
