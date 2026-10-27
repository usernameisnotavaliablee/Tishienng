package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class y0 extends com.acse.ottn.d0 {

    /* renamed from: c, reason: collision with root package name */
    public static final float f2901c = 0.75f;

    /* renamed from: b, reason: collision with root package name */
    public float f2902b;

    public y0() {
            r1 = this;
            r1.<init>()
            r0 = 1061158912(0x3f400000, float:0.75)
            r1.f2902b = r0
            return
    }

    public y0(float r1) {
            r0 = this;
            r0.<init>()
            r0.f2902b = r1
            return
    }

    public void transformPage(android.view.View r5, float r6) {
            r4 = this;
            int r0 = r5.getWidth()
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = 0
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 >= 0) goto Lf
            r5.setAlpha(r2)
            return
        Lf:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r3 > 0) goto L22
            r5.setAlpha(r1)
            r5.setTranslationX(r2)
            r5.setScaleX(r1)
            r5.setScaleY(r1)
            return
        L22:
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 > 0) goto L52
            r2 = 0
            r5.setVisibility(r2)
            float r2 = r1 - r6
            r5.setAlpha(r2)
            float r0 = (float) r0
            float r2 = -r6
            float r0 = r0 * r2
            r5.setTranslationX(r0)
            float r0 = r4.f2902b
            float r2 = r1 - r0
            float r3 = java.lang.Math.abs(r6)
            float r3 = r1 - r3
            float r2 = r2 * r3
            float r0 = r0 + r2
            r5.setScaleX(r0)
            r5.setScaleY(r0)
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 != 0) goto L51
            r6 = 4
            r5.setVisibility(r6)
        L51:
            return
        L52:
            r5.setAlpha(r2)
            return
    }
}
