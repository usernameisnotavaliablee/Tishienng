package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d5 extends com.acse.ottn.d0 {

    /* renamed from: d, reason: collision with root package name */
    public static final float f2246d = 0.85f;

    /* renamed from: e, reason: collision with root package name */
    public static final float f2247e = 0.5f;

    /* renamed from: b, reason: collision with root package name */
    public float f2248b;

    /* renamed from: c, reason: collision with root package name */
    public float f2249c;

    public d5() {
            r1 = this;
            r1.<init>()
            r0 = 1062836634(0x3f59999a, float:0.85)
            r1.f2248b = r0
            r0 = 1056964608(0x3f000000, float:0.5)
            r1.f2249c = r0
            return
    }

    public d5(float r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.f2248b = r1
            r0.f2249c = r2
            return
    }

    public void transformPage(android.view.View r8, float r9) {
            r7 = this;
            int r0 = r8.getWidth()
            int r1 = r8.getHeight()
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = 0
            int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r2 >= 0) goto L13
            r8.setAlpha(r3)
            return
        L13:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r4 > 0) goto L57
            float r4 = r7.f2248b
            float r5 = java.lang.Math.abs(r9)
            float r5 = r2 - r5
            float r4 = java.lang.Math.max(r4, r5)
            float r1 = (float) r1
            float r5 = r2 - r4
            float r1 = r1 * r5
            r6 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r6
            float r0 = (float) r0
            float r0 = r0 * r5
            float r0 = r0 / r6
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 >= 0) goto L3b
            float r1 = r1 / r6
            float r0 = r0 - r1
            r8.setTranslationX(r0)
            goto L41
        L3b:
            float r9 = -r0
            float r1 = r1 / r6
            float r9 = r9 + r1
            r8.setTranslationX(r9)
        L41:
            r8.setScaleX(r4)
            r8.setScaleY(r4)
            float r9 = r7.f2249c
            float r0 = r7.f2248b
            float r4 = r4 - r0
            float r0 = r2 - r0
            float r4 = r4 / r0
            float r2 = r2 - r9
            float r4 = r4 * r2
            float r9 = r9 + r4
            r8.setAlpha(r9)
            return
        L57:
            r8.setAlpha(r3)
            return
    }
}
