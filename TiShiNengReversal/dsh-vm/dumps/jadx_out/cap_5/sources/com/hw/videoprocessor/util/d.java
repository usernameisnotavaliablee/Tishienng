package com.hw.videoprocessor.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class d {
    private int a;
    private int b;
    private boolean c;
    private int d;
    private int e;

    public d(int r3, int r4) {
            r2 = this;
            r2.<init>()
            r2.a = r3
            r2.b = r4
            if (r3 > r4) goto L30
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "原始帧率:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "小于目标帧率:"
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = "，不支持补帧"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.hw.videoprocessor.util.c.f(r3, r4)
            r3 = 1
            r2.c = r3
        L30:
            return
    }

    public boolean a(int r7) {
            r6 = this;
            boolean r0 = r6.c
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 1
            if (r7 != 0) goto Lf
            int r7 = r6.e
            int r7 = r7 + r0
            r6.e = r7
            return r1
        Lf:
            int r7 = r6.a
            int r2 = r6.b
            int r2 = r7 - r2
            float r2 = (float) r2
            float r7 = (float) r7
            float r2 = r2 / r7
            int r7 = r6.d
            int r3 = r7 + 1
            float r3 = (float) r3
            int r4 = r6.e
            int r5 = r7 + r4
            float r5 = (float) r5
            float r3 = r3 / r5
            float r5 = (float) r7
            int r7 = r7 + r4
            int r7 = r7 + r0
            float r7 = (float) r7
            float r5 = r5 / r7
            float r3 = r3 - r2
            float r7 = java.lang.Math.abs(r3)
            float r5 = r5 - r2
            float r2 = java.lang.Math.abs(r5)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 >= 0) goto L37
            r1 = 1
        L37:
            if (r1 == 0) goto L3f
            int r7 = r6.d
            int r7 = r7 + r0
            r6.d = r7
            return r1
        L3f:
            int r7 = r6.e
            int r7 = r7 + r0
            r6.e = r7
            return r1
    }

    public void b() {
            r6 = this;
            boolean r0 = r6.c
            if (r0 == 0) goto L5
            return
        L5:
            int r0 = r6.d
            int r1 = r6.e
            int r0 = r0 + r1
            float r0 = (float) r0
            int r2 = r6.a
            float r3 = (float) r2
            float r0 = r0 / r3
            float r1 = (float) r1
            float r1 = r1 / r0
            int r0 = r6.b
            int r0 = r2 - r0
            float r0 = (float) r0
            float r2 = (float) r2
            float r0 = r0 / r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "最终帧率为:"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.hw.videoprocessor.util.c.k(r1, r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "实际丢帧率:"
            r1.append(r3)
            int r3 = r6.d
            float r4 = (float) r3
            int r5 = r6.e
            int r3 = r3 + r5
            float r3 = (float) r3
            float r4 = r4 / r3
            r1.append(r4)
            java.lang.String r3 = " 目标丢帧率:"
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.hw.videoprocessor.util.c.k(r0, r1)
            return
    }
}
