package com.hp.hpl.sparta.xpath;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class j extends com.hp.hpl.sparta.xpath.o {
    private final java.lang.String a;

    j(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // com.hp.hpl.sparta.xpath.o
    public void a(com.hp.hpl.sparta.xpath.b0 r1) {
            r0 = this;
            r1.a(r0)
            return
    }

    @Override // com.hp.hpl.sparta.xpath.o
    public boolean b() {
            r1 = this;
            r0 = 1
            return r0
    }

    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "@"
            r0.append(r1)
            java.lang.String r1 = r2.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
