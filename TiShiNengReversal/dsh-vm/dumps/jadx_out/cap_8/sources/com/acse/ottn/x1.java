package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class x1 implements com.acse.ottn.q4<java.lang.Integer> {
    public x1() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.lang.Integer a(float r2, java.lang.Integer r3, java.lang.Integer r4) {
            r1 = this;
            int r3 = r3.intValue()
            float r0 = (float) r3
            int r4 = r4.intValue()
            int r4 = r4 - r3
            float r3 = (float) r4
            float r2 = r2 * r3
            float r0 = r0 + r2
            int r2 = (int) r0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
    }

    @Override // com.acse.ottn.q4
    public /* bridge */ /* synthetic */ java.lang.Integer evaluate(float r1, java.lang.Integer r2, java.lang.Integer r3) {
            r0 = this;
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.Integer r1 = r0.a(r1, r2, r3)
            return r1
    }
}
