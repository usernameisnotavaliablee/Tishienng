package com.acse.ottn.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ContinueSlideScrollView extends android.widget.ScrollView {
    public boolean a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2872b;

    /* renamed from: c, reason: collision with root package name */
    public android.content.Context f2873c;

    /* renamed from: d, reason: collision with root package name */
    public com.acse.ottn.widget.ContinueSlideScrollView.a f2874d;

    /* renamed from: e, reason: collision with root package name */
    public float f2875e;

    /* renamed from: f, reason: collision with root package name */
    public float f2876f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2877g;

    /* renamed from: h, reason: collision with root package name */
    public int f2878h;

    /* renamed from: i, reason: collision with root package name */
    public com.acse.ottn.widget.ContinueSlideScrollView.b f2879i;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a();

        void b();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        void a();

        void b();
    }

    public ContinueSlideScrollView(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 1
            r1.a = r0
            r0 = 0
            r1.f2872b = r0
            r1.f2877g = r0
            r0 = 160(0xa0, float:2.24E-43)
            r1.f2878h = r0
            r1.f2873c = r2
            return
    }

    public ContinueSlideScrollView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r2 = 1
            r0.a = r2
            r2 = 0
            r0.f2872b = r2
            r0.f2877g = r2
            r2 = 160(0xa0, float:2.24E-43)
            r0.f2878h = r2
            r0.f2873c = r1
            return
    }

    public ContinueSlideScrollView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r2 = 1
            r0.a = r2
            r2 = 0
            r0.f2872b = r2
            r0.f2877g = r2
            r2 = 160(0xa0, float:2.24E-43)
            r0.f2878h = r2
            r0.f2873c = r1
            return
    }

    public static int a(android.content.Context r0, int r1) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = (float) r1
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            return r0
    }

    public boolean a() {
            r1 = this;
            boolean r0 = r1.f2872b
            return r0
    }

    public boolean b() {
            r1 = this;
            boolean r0 = r1.a
            return r0
    }

    public final void c() {
            r1 = this;
            boolean r0 = r1.a
            if (r0 == 0) goto Lc
            com.acse.ottn.widget.ContinueSlideScrollView$a r0 = r1.f2874d
            if (r0 == 0) goto L17
            r0.b()
            return
        Lc:
            boolean r0 = r1.f2872b
            if (r0 == 0) goto L17
            com.acse.ottn.widget.ContinueSlideScrollView$a r0 = r1.f2874d
            if (r0 == 0) goto L17
            r0.a()
        L17:
            return
    }

    @Override // android.widget.ScrollView, android.view.View
    public void onOverScrolled(int r1, int r2, boolean r3, boolean r4) {
            r0 = this;
            super.onOverScrolled(r1, r2, r3, r4)
            r1 = 0
            if (r2 != 0) goto Lb
            r0.a = r4
            r0.f2872b = r1
            goto Lf
        Lb:
            r0.a = r1
            r0.f2872b = r4
        Lf:
            r0.c()
            return
    }

    @Override // android.view.View
    public void onScrollChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onScrollChanged(r1, r2, r3, r4)
            return
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r5) {
            r4 = this;
            int r0 = r5.getAction()
            r1 = 1
            if (r0 == 0) goto L68
            if (r0 == r1) goto L60
            r1 = 2
            if (r0 == r1) goto Ld
            goto L70
        Ld:
            float r0 = r5.getY()
            r4.f2876f = r0
            boolean r0 = r4.f2877g
            r1 = 0
            if (r0 == 0) goto L39
            boolean r0 = r4.b()
            if (r0 == 0) goto L39
            float r0 = r4.f2876f
            float r2 = r4.f2875e
            float r0 = r0 - r2
            android.content.Context r2 = r4.f2873c
            int r3 = r4.f2878h
            int r2 = a(r2, r3)
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L39
            r4.f2877g = r1
            com.acse.ottn.widget.ContinueSlideScrollView$b r0 = r4.f2879i
            if (r0 == 0) goto L39
            r0.a()
        L39:
            boolean r0 = r4.f2877g
            if (r0 == 0) goto L70
            boolean r0 = r4.a()
            if (r0 == 0) goto L70
            float r0 = r4.f2876f
            float r2 = r4.f2875e
            float r0 = r0 - r2
            android.content.Context r2 = r4.f2873c
            int r3 = r4.f2878h
            int r2 = a(r2, r3)
            int r2 = -r2
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L70
            r4.f2877g = r1
            com.acse.ottn.widget.ContinueSlideScrollView$b r0 = r4.f2879i
            if (r0 == 0) goto L70
            r0.b()
            goto L70
        L60:
            r4.f2877g = r1
            r0 = 0
            r4.f2876f = r0
            r4.f2875e = r0
            goto L70
        L68:
            float r0 = r5.getY()
            r4.f2875e = r0
            r4.f2877g = r1
        L70:
            boolean r5 = super.onTouchEvent(r5)
            return r5
    }

    public void setScanScrollChangedListener(com.acse.ottn.widget.ContinueSlideScrollView.a r1) {
            r0 = this;
            r0.f2874d = r1
            return
    }

    public void setonContinueSlideListener(com.acse.ottn.widget.ContinueSlideScrollView.b r1) {
            r0 = this;
            r0.f2879i = r1
            return
    }
}
