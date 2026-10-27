package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class t extends androidx.viewpager.widget.ViewPager {

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f2791g = "AutoViewPager";

    /* renamed from: h, reason: collision with root package name */
    public static final int f2792h = 3000;
    public java.util.Timer a;

    /* renamed from: b, reason: collision with root package name */
    public com.acse.ottn.t.c f2793b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2794c;

    /* renamed from: d, reason: collision with root package name */
    public int f2795d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Runnable f2796e;

    /* renamed from: f, reason: collision with root package name */
    public com.acse.ottn.t.b f2797f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements java.lang.Runnable {
        public final /* synthetic */ com.acse.ottn.t a;

        public a(com.acse.ottn.t r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                com.acse.ottn.t r0 = r1.a
                com.acse.ottn.t.a(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b extends android.os.Handler {
        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ b(com.acse.ottn.t.a r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class c extends java.util.TimerTask {
        public final /* synthetic */ com.acse.ottn.t a;

        public c(com.acse.ottn.t r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public /* synthetic */ c(com.acse.ottn.t r1, com.acse.ottn.t.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
                r2 = this;
                com.acse.ottn.t r0 = r2.a
                com.acse.ottn.t$b r0 = com.acse.ottn.t.c(r0)
                com.acse.ottn.t r1 = r2.a
                java.lang.Runnable r1 = com.acse.ottn.t.b(r1)
                r0.post(r1)
                return
        }
    }

    public t(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public t(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            com.acse.ottn.t$a r1 = new com.acse.ottn.t$a
            r1.<init>(r0)
            r0.f2796e = r1
            com.acse.ottn.t$b r1 = new com.acse.ottn.t$b
            r2 = 0
            r1.<init>(r2)
            r0.f2797f = r1
            return
    }

    public static /* synthetic */ void a(com.acse.ottn.t r0) {
            r0.a()
            return
    }

    public static /* synthetic */ java.lang.Runnable b(com.acse.ottn.t r0) {
            java.lang.Runnable r0 = r0.f2796e
            return r0
    }

    public static /* synthetic */ com.acse.ottn.t.b c(com.acse.ottn.t r0) {
            com.acse.ottn.t$b r0 = r0.f2797f
            return r0
    }

    public final void a() {
            r2 = this;
            int r0 = r2.getCurrentItem()
            r2.f2795d = r0
            androidx.viewpager.widget.PagerAdapter r1 = r2.getAdapter()
            int r1 = r1.getCount()
            int r1 = r1 + (-1)
            if (r0 != r1) goto L16
            r0 = 0
            r2.f2795d = r0
            goto L1c
        L16:
            int r0 = r2.f2795d
            int r0 = r0 + 1
            r2.f2795d = r0
        L1c:
            int r0 = r2.f2795d
            r2.setCurrentItem(r0)
            int r0 = r2.f2795d
            androidx.viewpager.widget.PagerAdapter r1 = r2.getAdapter()
            com.acse.ottn.e0 r1 = (com.acse.ottn.e0) r1
            int r1 = r1.a()
            int r0 = r0 % r1
            r2.a(r0)
            return
    }

    public void a(int r2) {
            r1 = this;
            android.view.ViewParent r0 = r1.getParent()
            if (r0 != 0) goto L7
            goto L18
        L7:
            android.view.ViewParent r0 = r1.getParent()
            boolean r0 = r0 instanceof com.acse.ottn.adapter.AutoScrollViewPager
            if (r0 == 0) goto L18
            android.view.ViewParent r0 = r1.getParent()
            com.acse.ottn.adapter.AutoScrollViewPager r0 = (com.acse.ottn.adapter.AutoScrollViewPager) r0
            r0.b(r2)
        L18:
            return
    }

    public void a(int r2, int r3) {
            r1 = this;
            android.view.ViewParent r0 = r1.getParent()
            boolean r0 = r0 instanceof com.acse.ottn.adapter.AutoScrollViewPager
            if (r0 == 0) goto L11
            android.view.ViewParent r0 = r1.getParent()
            com.acse.ottn.adapter.AutoScrollViewPager r0 = (com.acse.ottn.adapter.AutoScrollViewPager) r0
            r0.a(r2, r3)
        L11:
            return
    }

    public void a(com.acse.ottn.t r1, com.acse.ottn.e0 r2) {
            r0 = this;
            r2.a(r1, r2)
            return
    }

    public final void b() {
            r7 = this;
            r0 = 1
            r7.f2794c = r0
            java.util.Timer r0 = r7.a
            if (r0 != 0) goto Le
            java.util.Timer r0 = new java.util.Timer
            r0.<init>()
            r7.a = r0
        Le:
            java.util.Timer r1 = r7.a
            com.acse.ottn.t$c r2 = new com.acse.ottn.t$c
            r0 = 0
            r2.<init>(r7, r0)
            r3 = 3000(0xbb8, double:1.482E-320)
            r5 = 3000(0xbb8, double:1.482E-320)
            r1.schedule(r2, r3, r5)
            return
    }

    public void b(int r2) {
            r1 = this;
            r0 = 0
            r1.a(r2, r0)
            return
    }

    public boolean c() {
            r1 = this;
            boolean r0 = r1.f2794c
            return r0
    }

    public void d() {
            r0 = this;
            r0.f()
            return
    }

    public void e() {
            r0 = this;
            r0.g()
            return
    }

    public void f() {
            r1 = this;
            r0 = 0
            r1.f2794c = r0
            java.util.Timer r0 = r1.a
            if (r0 == 0) goto Ld
            r0.cancel()
            r0 = 0
            r1.a = r0
        Ld:
            return
    }

    public void g() {
            r1 = this;
            androidx.viewpager.widget.PagerAdapter r0 = r1.getAdapter()
            com.acse.ottn.e0 r0 = (com.acse.ottn.e0) r0
            int r0 = r0.a()
            if (r0 != 0) goto Ld
            return
        Ld:
            r1.f()
            r1.b()
            return
    }

    public android.widget.TextView getSubTitle() {
            r1 = this;
            android.view.ViewParent r0 = r1.getParent()
            boolean r0 = r0 instanceof com.acse.ottn.adapter.AutoScrollViewPager
            if (r0 == 0) goto L13
            android.view.ViewParent r0 = r1.getParent()
            com.acse.ottn.adapter.AutoScrollViewPager r0 = (com.acse.ottn.adapter.AutoScrollViewPager) r0
            android.widget.TextView r0 = r0.getSubTitle()
            return r0
        L13:
            r0 = 0
            return r0
    }

    public boolean onInterceptTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            int r0 = r2.getAction()
            if (r0 == 0) goto L7
            goto La
        L7:
            r1.f()
        La:
            boolean r2 = super.onInterceptTouchEvent(r2)
            return r2
    }

    public boolean onTouchEvent(android.view.MotionEvent r3) {
            r2 = this;
            int r0 = r3.getAction()
            r1 = 1
            if (r0 == r1) goto L8
            goto Lb
        L8:
            r2.e()
        Lb:
            boolean r3 = super.onTouchEvent(r3)
            return r3
    }
}
