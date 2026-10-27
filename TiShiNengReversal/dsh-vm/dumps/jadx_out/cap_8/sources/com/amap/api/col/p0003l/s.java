package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class s {
    protected final android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f3931b;

    /* renamed from: c, reason: collision with root package name */
    protected android.view.MotionEvent f3932c;

    /* renamed from: d, reason: collision with root package name */
    protected android.view.MotionEvent f3933d;

    /* renamed from: e, reason: collision with root package name */
    protected float f3934e;

    /* renamed from: f, reason: collision with root package name */
    protected float f3935f;

    /* renamed from: g, reason: collision with root package name */
    protected long f3936g;

    /* renamed from: h, reason: collision with root package name */
    protected int f3937h;

    /* renamed from: i, reason: collision with root package name */
    protected int f3938i;

    public s(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f3937h = r0
            r1.f3938i = r0
            r1.a = r2
            return
    }

    public static android.graphics.PointF g(android.view.MotionEvent r5) {
            int r0 = r5.getPointerCount()
            r1 = 0
            r2 = 0
            r2 = 0
            r3 = 0
        L8:
            if (r3 >= r0) goto L17
            float r4 = r5.getX(r3)
            float r1 = r1 + r4
            float r4 = r5.getY(r3)
            float r2 = r2 + r4
            int r3 = r3 + 1
            goto L8
        L17:
            android.graphics.PointF r5 = new android.graphics.PointF
            float r0 = (float) r0
            float r1 = r1 / r0
            float r2 = r2 / r0
            r5.<init>(r1, r2)
            return r5
    }

    protected void a() {
            r2 = this;
            android.view.MotionEvent r0 = r2.f3932c
            r1 = 0
            if (r0 == 0) goto La
            r0.recycle()
            r2.f3932c = r1
        La:
            android.view.MotionEvent r0 = r2.f3933d
            if (r0 == 0) goto L13
            r0.recycle()
            r2.f3933d = r1
        L13:
            r0 = 0
            r2.f3931b = r0
            return
    }

    public final void b(int r1, int r2) {
            r0 = this;
            r0.f3937h = r1
            r0.f3938i = r2
            return
    }

    protected abstract void c(int r1, android.view.MotionEvent r2);

    protected abstract void d(int r1, android.view.MotionEvent r2, int r3, int r4);

    protected void e(android.view.MotionEvent r6) {
            r5 = this;
            android.view.MotionEvent r0 = r5.f3932c
            android.view.MotionEvent r1 = r5.f3933d
            if (r1 == 0) goto Lc
            r1.recycle()
            r1 = 0
            r5.f3933d = r1
        Lc:
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r6)
            r5.f3933d = r1
            long r1 = r6.getEventTime()
            long r3 = r0.getEventTime()
            long r1 = r1 - r3
            r5.f3936g = r1
            int r1 = r6.getActionIndex()
            float r6 = r6.getPressure(r1)
            r5.f3934e = r6
            int r6 = r0.getActionIndex()
            float r6 = r0.getPressure(r6)
            r5.f3935f = r6
            return
    }

    public final long f() {
            r2 = this;
            long r0 = r2.f3936g
            return r0
    }

    public final boolean h(android.view.MotionEvent r3, int r4, int r5) {
            r2 = this;
            int r0 = r3.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            boolean r1 = r2.f3931b
            if (r1 != 0) goto Le
            r2.d(r0, r3, r4, r5)
            goto L11
        Le:
            r2.c(r0, r3)
        L11:
            r3 = 1
            return r3
    }

    public final android.view.MotionEvent i() {
            r1 = this;
            android.view.MotionEvent r0 = r1.f3933d
            return r0
    }
}
