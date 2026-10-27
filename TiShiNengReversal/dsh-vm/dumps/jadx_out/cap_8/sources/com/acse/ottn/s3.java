package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class s3 extends com.acse.ottn.d0 {

    /* renamed from: c, reason: collision with root package name */
    public static final float f2653c = 15.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f2654b;

    public s3() {
            r1 = this;
            r1.<init>()
            r0 = 1097859072(0x41700000, float:15.0)
            r1.f2654b = r0
            return
    }

    public s3(float r1) {
            r0 = this;
            r0.<init>()
            r0.f2654b = r1
            return
    }

    public void transformPage(@androidx.annotation.NonNull android.view.View r4, float r5) {
            r3 = this;
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 >= 0) goto L1e
            float r5 = r3.f2654b
            float r5 = r5 * r0
            r4.setRotation(r5)
            int r5 = r4.getWidth()
            float r5 = (float) r5
            r4.setPivotX(r5)
            int r5 = r4.getHeight()
            float r5 = (float) r5
            r4.setPivotY(r5)
            return
        L1e:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 > 0) goto L66
            r1 = 0
            r2 = 1056964608(0x3f000000, float:0.5)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 >= 0) goto L49
            int r0 = r4.getWidth()
            float r0 = (float) r0
            float r1 = -r5
            float r1 = r1 * r2
            float r1 = r1 + r2
            float r0 = r0 * r1
            r4.setPivotX(r0)
            int r0 = r4.getHeight()
            float r0 = (float) r0
            r4.setPivotY(r0)
            float r0 = r3.f2654b
            float r0 = r0 * r5
            r4.setRotation(r0)
            return
        L49:
            int r1 = r4.getWidth()
            float r1 = (float) r1
            float r1 = r1 * r2
            float r0 = r0 - r5
            float r1 = r1 * r0
            r4.setPivotX(r1)
            int r0 = r4.getHeight()
            float r0 = (float) r0
            r4.setPivotY(r0)
            float r0 = r3.f2654b
            float r0 = r0 * r5
            r4.setRotation(r0)
            return
        L66:
            float r5 = r3.f2654b
            r4.setRotation(r5)
            r4.getWidth()
            r5 = 0
            float r5 = (float) r5
            r4.setPivotX(r5)
            int r5 = r4.getHeight()
            float r5 = (float) r5
            r4.setPivotY(r5)
            return
    }
}
