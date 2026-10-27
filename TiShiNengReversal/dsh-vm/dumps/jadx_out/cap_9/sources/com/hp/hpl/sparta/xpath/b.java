package com.hp.hpl.sparta.xpath;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class b extends com.hp.hpl.sparta.xpath.e {
    private final java.lang.String b;

    b(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1)
            java.lang.String r1 = com.hp.hpl.sparta.q.a(r2)
            r0.b = r1
            return
    }

    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    protected java.lang.String d(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            java.lang.String r1 = super.toString()
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "'"
            r0.append(r3)
            java.lang.String r3 = r2.b
            r0.append(r3)
            java.lang.String r3 = "']"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
