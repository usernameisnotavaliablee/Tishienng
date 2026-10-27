package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class j5 implements com.huawei.hms.scankit.p.f4 {
    private final int a;
    private final int b;
    private final long c;
    private final long d;
    private final float e;
    private final android.view.animation.Interpolator f;

    public j5(int r1, int r2, long r3, long r5, @androidx.annotation.NonNull android.view.animation.Interpolator r7) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r5
            long r5 = r5 - r3
            float r1 = (float) r5
            r0.e = r1
            r0.f = r7
            return
    }

    private int a(@androidx.annotation.NonNull com.huawei.hms.scankit.p.w5 r3) {
            r2 = this;
            int r0 = r2.b
            r1 = -1
            if (r0 != r1) goto La
            int r3 = r3.e()
            return r3
        La:
            return r0
    }

    private int b(@androidx.annotation.NonNull com.huawei.hms.scankit.p.w5 r3) {
            r2 = this;
            int r0 = r2.a
            r1 = -1
            if (r0 != r1) goto La
            int r3 = r3.a()
            return r3
        La:
            return r0
    }

    private int c(@androidx.annotation.NonNull com.huawei.hms.scankit.p.w5 r2) {
            r1 = this;
            int r0 = r1.a(r2)
            int r2 = r1.b(r2)
            int r0 = r0 - r2
            return r0
    }

    @Override // com.huawei.hms.scankit.p.f4
    public void a(@androidx.annotation.NonNull com.huawei.hms.scankit.p.w5 r4, long r5) {
            r3 = this;
            long r0 = r3.c
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto L33
            long r0 = r3.d
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 > 0) goto L33
            float r0 = r3.e
            r1 = 0
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L33
            android.view.animation.Interpolator r0 = r3.f
            long r1 = r3.c
            long r5 = r5 - r1
            float r5 = (float) r5
            float r6 = r3.e
            float r5 = r5 / r6
            float r5 = r0.getInterpolation(r5)
            int r6 = r3.b(r4)
            float r6 = (float) r6
            int r0 = r3.c(r4)
            float r0 = (float) r0
            float r0 = r0 * r5
            float r6 = r6 + r0
            int r5 = (int) r6
            r4.a(r5)
        L33:
            return
    }
}
