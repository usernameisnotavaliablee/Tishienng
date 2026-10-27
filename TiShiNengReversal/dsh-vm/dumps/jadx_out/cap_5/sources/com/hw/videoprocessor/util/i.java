package com.hw.videoprocessor.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class i implements com.hw.videoprocessor.util.k {
    private float[] a;
    private int b;
    private com.hw.videoprocessor.util.k c;
    private float d;

    public i(float[] r1, com.hw.videoprocessor.util.k r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.c = r2
            return
    }

    @Override // com.hw.videoprocessor.util.k
    public void a(float r4) {
            r3 = this;
            com.hw.videoprocessor.util.k r0 = r3.c
            if (r0 == 0) goto L12
            float[] r1 = r3.a
            int r2 = r3.b
            r1 = r1[r2]
            float r4 = r4 * r1
            float r1 = r3.d
            float r4 = r4 + r1
            r0.a(r4)
        L12:
            return
    }

    public void b(int r4) {
            r3 = this;
            r3.b = r4
            r0 = 0
            r3.d = r0
            r0 = 0
        L6:
            if (r0 >= r4) goto L14
            float r1 = r3.d
            float[] r2 = r3.a
            r2 = r2[r0]
            float r1 = r1 + r2
            r3.d = r1
            int r0 = r0 + 1
            goto L6
        L14:
            return
    }

    public void c(com.hw.videoprocessor.util.k r1) {
            r0 = this;
            r0.c = r1
            return
    }
}
