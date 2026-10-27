package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class t3 extends com.acse.ottn.d0 {

    /* renamed from: c, reason: collision with root package name */
    public static final float f2799c = 15.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f2800b;

    public t3() {
            r1 = this;
            r1.<init>()
            r0 = 1097859072(0x41700000, float:15.0)
            r1.f2800b = r0
            return
    }

    public t3(float r1) {
            r0 = this;
            r0.<init>()
            r0.f2800b = r1
            return
    }

    public void transformPage(@androidx.annotation.NonNull android.view.View r5, float r6) {
            r4 = this;
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto L18
            float r6 = r4.f2800b
            r5.setRotation(r6)
            int r6 = r5.getWidth()
            float r6 = (float) r6
            r5.setPivotX(r6)
            r5.setPivotY(r1)
            return
        L18:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 > 0) goto L57
            r2 = 1056964608(0x3f000000, float:0.5)
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 >= 0) goto L3e
            int r0 = r5.getWidth()
            float r0 = (float) r0
            float r3 = -r6
            float r3 = r3 * r2
            float r3 = r3 + r2
            float r0 = r0 * r3
            r5.setPivotX(r0)
            r5.setPivotY(r1)
            float r0 = r4.f2800b
            float r0 = -r0
            float r0 = r0 * r6
            r5.setRotation(r0)
            return
        L3e:
            int r3 = r5.getWidth()
            float r3 = (float) r3
            float r3 = r3 * r2
            float r0 = r0 - r6
            float r3 = r3 * r0
            r5.setPivotX(r3)
            r5.setPivotY(r1)
            float r0 = r4.f2800b
            float r0 = -r0
            float r0 = r0 * r6
            r5.setRotation(r0)
            return
        L57:
            float r6 = r4.f2800b
            float r6 = -r6
            r5.setRotation(r6)
            r5.setPivotX(r1)
            r5.setPivotY(r1)
            return
    }
}
