package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class s4 {
    public s4() {
            r1 = this;
            r1.<init>()
            return
    }

    public static float a(float r0, float r1, float r2, float r3) {
            float r0 = r0 - r2
            float r1 = r1 - r3
            float r0 = r0 * r0
            float r1 = r1 * r1
            float r0 = r0 + r1
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            float r0 = (float) r0
            return r0
    }

    public static float a(int r0, int r1, int r2, int r3) {
            int r0 = r0 - r2
            int r1 = r1 - r3
            int r0 = r0 * r0
            int r1 = r1 * r1
            int r0 = r0 + r1
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            float r0 = (float) r0
            return r0
    }

    public static int a(float r1) {
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L8
            r0 = -1090519040(0xffffffffbf000000, float:-0.5)
            goto La
        L8:
            r0 = 1056964608(0x3f000000, float:0.5)
        La:
            float r1 = r1 + r0
            int r1 = (int) r1
            return r1
    }

    public static int a(int[] r4) {
            int r0 = r4.length
            r1 = 0
            r2 = 0
        L3:
            if (r1 >= r0) goto Lb
            r3 = r4[r1]
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L3
        Lb:
            return r2
    }
}
