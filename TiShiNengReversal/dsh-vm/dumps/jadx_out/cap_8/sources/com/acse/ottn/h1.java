package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class h1 implements com.acse.ottn.q4<java.lang.Number> {
    public h1() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.lang.Float a(float r1, java.lang.Number r2, java.lang.Number r3) {
            r0 = this;
            float r2 = r2.floatValue()
            float r3 = r3.floatValue()
            float r3 = r3 - r2
            float r1 = r1 * r3
            float r2 = r2 + r1
            java.lang.Float r1 = java.lang.Float.valueOf(r2)
            return r1
    }

    @Override // com.acse.ottn.q4
    public /* bridge */ /* synthetic */ java.lang.Number evaluate(float r1, java.lang.Number r2, java.lang.Number r3) {
            r0 = this;
            java.lang.Number r2 = (java.lang.Number) r2
            java.lang.Number r3 = (java.lang.Number) r3
            java.lang.Float r1 = r0.a(r1, r2, r3)
            return r1
    }
}
