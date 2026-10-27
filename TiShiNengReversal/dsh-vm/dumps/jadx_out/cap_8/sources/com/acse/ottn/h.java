package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class h extends com.acse.ottn.d0 {

    /* renamed from: c, reason: collision with root package name */
    public static final float f2344c = 0.5f;

    /* renamed from: b, reason: collision with root package name */
    public float f2345b;

    public h() {
            r1 = this;
            r1.<init>()
            r0 = 1056964608(0x3f000000, float:0.5)
            r1.f2345b = r0
            return
    }

    public h(float r1) {
            r0 = this;
            r0.<init>()
            r0.f2345b = r1
            return
    }

    public void transformPage(@androidx.annotation.NonNull android.view.View r4, float r5) {
            r3 = this;
            r0 = 1065336439(0x3f7fbe77, float:0.999)
            r4.setScaleX(r0)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L12
            float r5 = r3.f2345b
            r4.setAlpha(r5)
            return
        L12:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 > 0) goto L35
            r1 = 0
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 >= 0) goto L29
            float r1 = r3.f2345b
            float r2 = r0 - r1
            float r5 = r5 + r0
            float r2 = r2 * r5
            float r1 = r1 + r2
            r4.setAlpha(r1)
            return
        L29:
            float r1 = r3.f2345b
            float r2 = r0 - r1
            float r0 = r0 - r5
            float r2 = r2 * r0
            float r1 = r1 + r2
            r4.setAlpha(r1)
            return
        L35:
            float r5 = r3.f2345b
            r4.setAlpha(r5)
            return
    }
}
