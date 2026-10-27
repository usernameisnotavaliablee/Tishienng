package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class s implements com.acse.ottn.q4 {
    public s() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.acse.ottn.q4
    public java.lang.Object evaluate(float r7, java.lang.Object r8, java.lang.Object r9) {
            r6 = this;
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            int r0 = r8 >> 24
            int r1 = r8 >> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r2 = r8 >> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            r8 = r8 & 255(0xff, float:3.57E-43)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            int r3 = r9 >> 24
            int r4 = r9 >> 16
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r5 = r9 >> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r3 = r3 - r0
            float r3 = (float) r3
            float r3 = r3 * r7
            int r3 = (int) r3
            int r0 = r0 + r3
            int r0 = r0 << 24
            int r4 = r4 - r1
            float r3 = (float) r4
            float r3 = r3 * r7
            int r3 = (int) r3
            int r1 = r1 + r3
            int r1 = r1 << 16
            r0 = r0 | r1
            int r5 = r5 - r2
            float r1 = (float) r5
            float r1 = r1 * r7
            int r1 = (int) r1
            int r2 = r2 + r1
            int r1 = r2 << 8
            r0 = r0 | r1
            int r9 = r9 - r8
            float r9 = (float) r9
            float r7 = r7 * r9
            int r7 = (int) r7
            int r8 = r8 + r7
            r7 = r0 | r8
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            return r7
    }
}
