package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class u extends com.amap.api.col.p0003l.s {
    private static final android.graphics.PointF o = null;

    /* renamed from: j, reason: collision with root package name */
    private final com.amap.api.col.3l.u.a f3998j;

    /* renamed from: k, reason: collision with root package name */
    private android.graphics.PointF f3999k;
    private android.graphics.PointF l;
    private android.graphics.PointF m;
    private android.graphics.PointF n;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        boolean a(com.amap.api.col.p0003l.u r1);

        void b(com.amap.api.col.p0003l.u r1);

        boolean c(com.amap.api.col.p0003l.u r1);
    }

    static {
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            com.amap.api.col.p0003l.u.o = r0
            return
    }

    public u(android.content.Context r1, com.amap.api.col.3l.u.a r2) {
            r0 = this;
            r0.<init>(r1)
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>()
            r0.m = r1
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>()
            r0.n = r1
            r0.f3998j = r2
            return
    }

    @Override // com.amap.api.col.p0003l.s
    protected final void c(int r3, android.view.MotionEvent r4) {
            r2 = this;
            r0 = 1
            if (r3 == r0) goto L34
            r1 = 2
            if (r3 == r1) goto La
            r4 = 3
            if (r3 == r4) goto L34
            goto L33
        La:
            r2.e(r4)
            float r3 = r2.f3934e
            float r1 = r2.f3935f
            float r3 = r3 / r1
            r1 = 1059816735(0x3f2b851f, float:0.67)
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 <= 0) goto L33
            int r3 = r4.getPointerCount()
            if (r3 <= r0) goto L20
            goto L33
        L20:
            com.amap.api.col.3l.u$a r3 = r2.f3998j
            boolean r3 = r3.c(r2)
            if (r3 == 0) goto L33
            android.view.MotionEvent r3 = r2.f3932c
            r3.recycle()
            android.view.MotionEvent r3 = android.view.MotionEvent.obtain(r4)
            r2.f3932c = r3
        L33:
            return
        L34:
            com.amap.api.col.3l.u$a r3 = r2.f3998j
            r3.b(r2)
            r2.a()
            return
    }

    @Override // com.amap.api.col.p0003l.s
    protected final void d(int r1, android.view.MotionEvent r2, int r3, int r4) {
            r0 = this;
            if (r1 == 0) goto L23
            r3 = 2
            if (r1 == r3) goto L1a
            r3 = 5
            if (r1 == r3) goto L9
            return
        L9:
            android.view.MotionEvent r1 = r0.f3932c
            if (r1 == 0) goto L10
            r1.recycle()
        L10:
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r2)
            r0.f3932c = r1
            r0.e(r2)
            return
        L1a:
            com.amap.api.col.3l.u$a r1 = r0.f3998j
            boolean r1 = r1.a(r0)
            r0.f3931b = r1
            return
        L23:
            r0.a()
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r2)
            r0.f3932c = r1
            r3 = 0
            r0.f3936g = r3
            r0.e(r2)
            return
    }

    @Override // com.amap.api.col.p0003l.s
    protected final void e(android.view.MotionEvent r7) {
            r6 = this;
            super.e(r7)
            android.view.MotionEvent r0 = r6.f3932c
            android.graphics.PointF r1 = com.amap.api.col.p0003l.s.g(r7)
            r6.f3999k = r1
            android.graphics.PointF r0 = com.amap.api.col.p0003l.s.g(r0)
            r6.l = r0
            android.view.MotionEvent r0 = r6.f3932c
            int r0 = r0.getPointerCount()
            int r1 = r7.getPointerCount()
            if (r0 == r1) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            if (r0 == 0) goto L25
            android.graphics.PointF r1 = com.amap.api.col.p0003l.u.o
            goto L38
        L25:
            android.graphics.PointF r1 = new android.graphics.PointF
            android.graphics.PointF r2 = r6.f3999k
            float r3 = r2.x
            android.graphics.PointF r4 = r6.l
            float r5 = r4.x
            float r3 = r3 - r5
            float r2 = r2.y
            float r4 = r4.y
            float r2 = r2 - r4
            r1.<init>(r3, r2)
        L38:
            r6.n = r1
            if (r0 == 0) goto L47
            android.view.MotionEvent r0 = r6.f3932c
            r0.recycle()
            android.view.MotionEvent r7 = android.view.MotionEvent.obtain(r7)
            r6.f3932c = r7
        L47:
            android.graphics.PointF r7 = r6.m
            float r0 = r7.x
            android.graphics.PointF r1 = r6.n
            float r2 = r1.x
            float r0 = r0 + r2
            r7.x = r0
            float r0 = r7.y
            float r1 = r1.y
            float r0 = r0 + r1
            r7.y = r0
            return
    }

    public final android.graphics.PointF j() {
            r1 = this;
            android.graphics.PointF r0 = r1.n
            return r0
    }
}
