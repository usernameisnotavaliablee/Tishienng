package com.hp.hpl.sparta.xpath;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class u extends com.hp.hpl.sparta.xpath.k {
    private final java.lang.String a;

    u(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    protected java.lang.String c(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[text()"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "'"
            r0.append(r3)
            java.lang.String r3 = r2.a
            r0.append(r3)
            java.lang.String r3 = "']"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
