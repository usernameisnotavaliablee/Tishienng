package com.scwang.smartrefresh.header.waveswipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b implements android.view.animation.Interpolator {
    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public b(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float r8) {
            r7 = this;
            r0 = 1048576000(0x3e800000, float:0.25)
            r1 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 >= 0) goto L1b
            double r3 = (double) r8
            r5 = 4593671619917905920(0x3fc0000000000000, double:0.125)
            double r3 = r3 - r5
            double r0 = java.lang.Math.pow(r3, r1)
            float r8 = (float) r0
            r0 = -1038509670(0xffffffffc219999a, float:-38.4)
            float r8 = r8 * r0
            r0 = 1058642330(0x3f19999a, float:0.6)
        L19:
            float r8 = r8 + r0
            return r8
        L1b:
            double r3 = (double) r8
            r5 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 < 0) goto L39
            r5 = 4604930618986332160(0x3fe8000000000000, double:0.75)
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 >= 0) goto L39
            r5 = 4603804719079489536(0x3fe4000000000000, double:0.625)
            double r3 = r3 - r5
            double r0 = java.lang.Math.pow(r3, r1)
            float r8 = (float) r0
            r0 = -1046898278(0xffffffffc199999a, float:-19.2)
            float r8 = r8 * r0
            r0 = 1050253722(0x3e99999a, float:0.3)
            goto L19
        L39:
            r8 = 0
            return r8
    }
}
