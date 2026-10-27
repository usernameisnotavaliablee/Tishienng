package com.hp.hpl.sparta.xpath;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class i extends com.hp.hpl.sparta.xpath.e {
    private final int b;

    i(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            r0.b = r2
            return
    }

    public double c() {
            r2 = this;
            int r0 = r2.b
            double r0 = (double) r0
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
            int r3 = r2.b
            r0.append(r3)
            java.lang.String r3 = "']"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
