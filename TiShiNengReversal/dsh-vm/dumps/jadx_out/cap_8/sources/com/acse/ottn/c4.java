package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c4 extends android.widget.ScrollView {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f2210b;

    /* renamed from: c, reason: collision with root package name */
    public int f2211c;

    /* renamed from: d, reason: collision with root package name */
    public com.acse.ottn.c4.a f2212d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2213e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a(int r1);
    }

    public c4(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public c4(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public c4(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r2 = 0
            r0.f2213e = r2
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r1)
            int r1 = r1.getScaledTouchSlop()
            r0.f2211c = r1
            return
    }

    @android.annotation.TargetApi(21)
    public c4(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r2 = 0
            r0.f2213e = r2
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r1)
            int r1 = r1.getScaledTouchSlop()
            r0.f2211c = r1
            return
    }

    @Override // android.widget.ScrollView, android.view.View
    public void computeScroll() {
            r2 = this;
            super.computeScroll()
            int r0 = r2.getScrollY()
            r1 = 300(0x12c, float:4.2E-43)
            if (r0 <= r1) goto Lf
            r0 = 1
            r2.f2213e = r0
            return
        Lf:
            r0 = 0
            r2.f2213e = r0
            return
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r3) {
            r2 = this;
            int r0 = r3.getAction()
            if (r0 == 0) goto L1e
            r1 = 2
            if (r0 == r1) goto La
            goto L2c
        La:
            float r3 = r3.getRawY()
            int r3 = (int) r3
            int r0 = r2.f2210b
            int r3 = r3 - r0
            int r3 = java.lang.Math.abs(r3)
            r0 = 10
            if (r3 < r0) goto L1c
            r3 = 0
            return r3
        L1c:
            r3 = 1
            return r3
        L1e:
            float r0 = r3.getRawX()
            int r0 = (int) r0
            r2.a = r0
            float r0 = r3.getRawY()
            int r0 = (int) r0
            r2.f2210b = r0
        L2c:
            boolean r3 = super.onInterceptTouchEvent(r3)
            return r3
    }

    public void setOnScrollListener(com.acse.ottn.c4.a r1) {
            r0 = this;
            r0.f2212d = r1
            return
    }
}
