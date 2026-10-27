package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a4 extends com.acse.ottn.d0 {

    /* renamed from: c, reason: collision with root package name */
    public static final float f2070c = 0.85f;

    /* renamed from: b, reason: collision with root package name */
    public float f2071b;

    public a4() {
            r1 = this;
            r1.<init>()
            r0 = 1062836634(0x3f59999a, float:0.85)
            r1.f2071b = r0
            return
    }

    public a4(float r1) {
            r0 = this;
            r0.<init>()
            r0.f2071b = r1
            return
    }

    public void transformPage(@androidx.annotation.NonNull android.view.View r6, float r7) {
            r5 = this;
            int r0 = r6.getWidth()
            int r1 = r6.getHeight()
            int r1 = r1 / 2
            float r1 = (float) r1
            r6.setPivotY(r1)
            int r1 = r0 / 2
            float r1 = (float) r1
            r6.setPivotX(r1)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 >= 0) goto L29
            float r7 = r5.f2071b
            r6.setScaleX(r7)
            float r7 = r5.f2071b
            r6.setScaleY(r7)
            float r7 = (float) r0
            r6.setPivotX(r7)
            return
        L29:
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r3 > 0) goto L66
            r3 = 1056964608(0x3f000000, float:0.5)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 >= 0) goto L4f
            float r1 = r7 + r2
            float r4 = r5.f2071b
            float r2 = r2 - r4
            float r1 = r1 * r2
            float r1 = r1 + r4
            r6.setScaleX(r1)
            r6.setScaleY(r1)
            float r0 = (float) r0
            float r7 = -r7
            float r7 = r7 * r3
            float r7 = r7 + r3
            float r0 = r0 * r7
            r6.setPivotX(r0)
            return
        L4f:
            float r7 = r2 - r7
            float r1 = r5.f2071b
            float r2 = r2 - r1
            float r2 = r2 * r7
            float r2 = r2 + r1
            r6.setScaleX(r2)
            r6.setScaleY(r2)
            float r0 = (float) r0
            float r7 = r7 * r3
            float r0 = r0 * r7
            r6.setPivotX(r0)
            return
        L66:
            r6.setPivotX(r1)
            float r7 = r5.f2071b
            r6.setScaleX(r7)
            float r7 = r5.f2071b
            r6.setScaleY(r7)
            return
    }
}
