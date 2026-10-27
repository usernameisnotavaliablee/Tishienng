package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class k2 extends com.acse.ottn.d0 {

    /* renamed from: c, reason: collision with root package name */
    public static final float f2428c = 0.85f;

    /* renamed from: b, reason: collision with root package name */
    public float f2429b;

    public k2() {
            r1 = this;
            r1.<init>()
            r0 = 1062836634(0x3f59999a, float:0.85)
            r1.f2429b = r0
            return
    }

    public k2(float r1) {
            r0 = this;
            r0.<init>()
            r0.f2429b = r1
            return
    }

    public final androidx.viewpager2.widget.ViewPager2 a(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            android.view.ViewParent r2 = r2.getParent()
            android.view.ViewParent r0 = r2.getParent()
            boolean r2 = r2 instanceof androidx.recyclerview.widget.RecyclerView
            if (r2 == 0) goto L13
            boolean r2 = r0 instanceof androidx.viewpager2.widget.ViewPager2
            if (r2 == 0) goto L13
            androidx.viewpager2.widget.ViewPager2 r0 = (androidx.viewpager2.widget.ViewPager2) r0
            return r0
        L13:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Expected the page view to be managed by a ViewPager2 instance."
            r2.<init>(r0)
            throw r2
    }

    public void transformPage(@androidx.annotation.NonNull android.view.View r10, float r11) {
            r9 = this;
            androidx.viewpager2.widget.ViewPager2 r0 = r9.a(r10)
            int r1 = r0.getPaddingLeft()
            float r1 = (float) r1
            int r2 = r0.getPaddingRight()
            float r2 = (float) r2
            int r0 = r0.getMeasuredWidth()
            float r0 = (float) r0
            float r0 = r0 - r1
            float r0 = r0 - r2
            float r1 = r1 / r0
            float r11 = r11 - r1
            int r0 = r10.getWidth()
            float r0 = (float) r0
            float r1 = r9.f2429b
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = r2 - r1
            float r0 = r0 * r3
            r4 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r4
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 > 0) goto L3b
            r10.setTranslationX(r0)
            float r11 = r9.f2429b
            r10.setScaleX(r11)
            float r11 = r9.f2429b
            r10.setScaleY(r11)
            return
        L3b:
            double r4 = (double) r11
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 > 0) goto L95
            float r1 = java.lang.Math.abs(r11)
            float r2 = r2 - r1
            float r1 = java.lang.Math.abs(r2)
            float r3 = r3 * r1
            float r0 = -r0
            float r0 = r0 * r11
            r1 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            r6 = 1056964608(0x3f000000, float:0.5)
            int r7 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r7 > 0) goto L67
            float r11 = java.lang.Math.abs(r11)
            float r11 = r11 - r6
            float r11 = java.lang.Math.abs(r11)
            float r11 = r11 / r6
            float r0 = r0 + r11
            r10.setTranslationX(r0)
            goto L88
        L67:
            r1 = 0
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 > 0) goto L70
            r10.setTranslationX(r0)
            goto L88
        L70:
            r1 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r7 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r7 < 0) goto L85
            float r11 = java.lang.Math.abs(r11)
            float r11 = r11 - r6
            float r11 = java.lang.Math.abs(r11)
            float r11 = r11 / r6
            float r0 = r0 - r11
            r10.setTranslationX(r0)
            goto L88
        L85:
            r10.setTranslationX(r0)
        L88:
            float r11 = r9.f2429b
            float r11 = r11 + r3
            r10.setScaleX(r11)
            float r11 = r9.f2429b
            float r3 = r3 + r11
            r10.setScaleY(r3)
            return
        L95:
            r10.setScaleX(r1)
            float r11 = r9.f2429b
            r10.setScaleY(r11)
            float r11 = -r0
            r10.setTranslationX(r11)
            return
    }
}
