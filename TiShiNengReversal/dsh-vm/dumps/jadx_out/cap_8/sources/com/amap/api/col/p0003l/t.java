package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class t extends com.amap.api.col.p0003l.r {
    private static final android.graphics.PointF C = null;
    private android.graphics.PointF A;
    private android.graphics.PointF B;
    private final com.amap.api.col.3l.t.a w;
    private boolean x;
    private android.graphics.PointF y;
    private android.graphics.PointF z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a(com.amap.api.col.p0003l.t r1);

        boolean b(com.amap.api.col.p0003l.t r1);

        boolean c(com.amap.api.col.p0003l.t r1);
    }

    static {
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            com.amap.api.col.p0003l.t.C = r0
            return
    }

    public t(android.content.Context r1, com.amap.api.col.3l.t.a r2) {
            r0 = this;
            r0.<init>(r1)
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>()
            r0.A = r1
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>()
            r0.B = r1
            r0.w = r2
            return
    }

    @Override // com.amap.api.col.p0003l.s
    protected final void a() {
            r1 = this;
            super.a()
            r0 = 0
            r1.x = r0
            return
    }

    @Override // com.amap.api.col.p0003l.s
    protected final void c(int r2, android.view.MotionEvent r3) {
            r1 = this;
            r0 = 2
            if (r2 == r0) goto L27
            r0 = 3
            if (r2 == r0) goto L1a
            r0 = 6
            if (r2 == r0) goto La
            goto L49
        La:
            r1.e(r3)
            boolean r2 = r1.x
            if (r2 != 0) goto L16
            com.amap.api.col.3l.t$a r2 = r1.w
            r2.a(r1)
        L16:
            r1.a()
            return
        L1a:
            boolean r2 = r1.x
            if (r2 != 0) goto L23
            com.amap.api.col.3l.t$a r2 = r1.w
            r2.a(r1)
        L23:
            r1.a()
            return
        L27:
            r1.e(r3)
            float r2 = r1.f3934e
            float r0 = r1.f3935f
            float r2 = r2 / r0
            r0 = 1059816735(0x3f2b851f, float:0.67)
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 <= 0) goto L49
            com.amap.api.col.3l.t$a r2 = r1.w
            boolean r2 = r2.b(r1)
            if (r2 == 0) goto L49
            android.view.MotionEvent r2 = r1.f3932c
            r2.recycle()
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r3)
            r1.f3932c = r2
        L49:
            return
    }

    @Override // com.amap.api.col.p0003l.s
    protected final void d(int r3, android.view.MotionEvent r4, int r5, int r6) {
            r2 = this;
            r0 = 2
            if (r3 == r0) goto L28
            r0 = 5
            if (r3 == r0) goto L7
            goto L3c
        L7:
            r2.a()
            android.view.MotionEvent r3 = android.view.MotionEvent.obtain(r4)
            r2.f3932c = r3
            r0 = 0
            r2.f3936g = r0
            r2.e(r4)
            boolean r3 = r2.l(r4, r5, r6)
            r2.x = r3
            if (r3 != 0) goto L3c
            com.amap.api.col.3l.t$a r3 = r2.w
            boolean r3 = r3.c(r2)
            r2.f3931b = r3
            return
        L28:
            boolean r3 = r2.x
            if (r3 == 0) goto L3c
            boolean r3 = r2.l(r4, r5, r6)
            r2.x = r3
            if (r3 != 0) goto L3c
            com.amap.api.col.3l.t$a r3 = r2.w
            boolean r3 = r3.c(r2)
            r2.f3931b = r3
        L3c:
            return
    }

    @Override // com.amap.api.col.p0003l.r, com.amap.api.col.p0003l.s
    protected final void e(android.view.MotionEvent r5) {
            r4 = this;
            super.e(r5)
            android.view.MotionEvent r0 = r4.f3932c
            android.graphics.PointF r1 = com.amap.api.col.p0003l.s.g(r5)
            r4.y = r1
            android.graphics.PointF r0 = com.amap.api.col.p0003l.s.g(r0)
            r4.z = r0
            android.view.MotionEvent r0 = r4.f3932c
            int r0 = r0.getPointerCount()
            int r5 = r5.getPointerCount()
            if (r0 == r5) goto L20
            android.graphics.PointF r5 = com.amap.api.col.p0003l.t.C
            goto L33
        L20:
            android.graphics.PointF r5 = new android.graphics.PointF
            android.graphics.PointF r0 = r4.y
            float r1 = r0.x
            android.graphics.PointF r2 = r4.z
            float r3 = r2.x
            float r1 = r1 - r3
            float r0 = r0.y
            float r2 = r2.y
            float r0 = r0 - r2
            r5.<init>(r1, r0)
        L33:
            r4.B = r5
            android.graphics.PointF r0 = r4.A
            float r1 = r0.x
            float r2 = r5.x
            float r1 = r1 + r2
            r0.x = r1
            float r1 = r0.y
            float r5 = r5.y
            float r1 = r1 + r5
            r0.y = r1
            return
    }

    public final android.graphics.PointF n() {
            r1 = this;
            android.graphics.PointF r0 = r1.B
            return r0
    }
}
