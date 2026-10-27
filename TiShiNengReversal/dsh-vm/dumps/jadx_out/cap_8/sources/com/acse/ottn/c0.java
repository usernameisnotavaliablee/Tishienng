package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c0 extends android.view.View implements com.acse.ottn.u1 {
    public com.acse.ottn.v1 a;

    /* renamed from: b, reason: collision with root package name */
    public android.graphics.Paint f2203b;

    /* renamed from: c, reason: collision with root package name */
    public float f2204c;

    public c0(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public c0(android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public c0(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            com.acse.ottn.v1 r1 = new com.acse.ottn.v1
            r1.<init>()
            r0.a = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r0.f2203b = r1
            r2 = 1
            r1.setAntiAlias(r2)
            android.graphics.Paint r1 = r0.f2203b
            com.acse.ottn.v1 r2 = r0.a
            int r2 = r2.g()
            r1.setColor(r2)
            return
    }

    @Override // com.acse.ottn.u1
    public void a(int r2, int r3) {
            r1 = this;
            com.acse.ottn.v1 r0 = r1.a
            r0.d(r2)
            com.acse.ottn.v1 r2 = r1.a
            r2.a(r3)
            r1.requestLayout()
            return
    }

    @Override // com.acse.ottn.u1
    public com.acse.ottn.v1 getIndicatorConfig() {
            r1 = this;
            com.acse.ottn.v1 r0 = r1.a
            return r0
    }

    @Override // com.acse.ottn.u1
    @androidx.annotation.NonNull
    public android.view.View getIndicatorView() {
            r3 = this;
            com.acse.ottn.v1 r0 = r3.a
            boolean r0 = r0.l()
            if (r0 == 0) goto L58
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            com.acse.ottn.v1 r1 = r3.a
            int r1 = r1.b()
            if (r1 == 0) goto L28
            r2 = 1
            if (r1 == r2) goto L23
            r2 = 2
            if (r1 == r2) goto L1d
            goto L2d
        L1d:
            r1 = 8388693(0x800055, float:1.1755063E-38)
            r0.gravity = r1
            goto L2d
        L23:
            r1 = 81
            r0.gravity = r1
            goto L2d
        L28:
            r1 = 8388691(0x800053, float:1.175506E-38)
            r0.gravity = r1
        L2d:
            com.acse.ottn.v1 r1 = r3.a
            com.acse.ottn.v1$b r1 = r1.f()
            int r1 = r1.a
            r0.leftMargin = r1
            com.acse.ottn.v1 r1 = r3.a
            com.acse.ottn.v1$b r1 = r1.f()
            int r1 = r1.f2831c
            r0.rightMargin = r1
            com.acse.ottn.v1 r1 = r3.a
            com.acse.ottn.v1$b r1 = r1.f()
            int r1 = r1.f2830b
            r0.topMargin = r1
            com.acse.ottn.v1 r1 = r3.a
            com.acse.ottn.v1$b r1 = r1.f()
            int r1 = r1.f2832d
            r0.bottomMargin = r1
            r3.setLayoutParams(r0)
        L58:
            return r3
    }

    @Override // com.acse.ottn.c3
    public void onPageScrollStateChanged(int r1) {
            r0 = this;
            return
    }

    @Override // com.acse.ottn.c3
    public void onPageScrolled(int r1, float r2, int r3) {
            r0 = this;
            r0.f2204c = r2
            r0.invalidate()
            return
    }

    @Override // com.acse.ottn.c3
    public void onPageSelected(int r2) {
            r1 = this;
            com.acse.ottn.v1 r0 = r1.a
            r0.a(r2)
            r1.invalidate()
            return
    }
}
