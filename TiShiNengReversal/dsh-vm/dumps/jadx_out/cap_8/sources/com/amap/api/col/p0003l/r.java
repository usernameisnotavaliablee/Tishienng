package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class r extends com.amap.api.col.p0003l.s {

    /* renamed from: j, reason: collision with root package name */
    private final float f3837j;

    /* renamed from: k, reason: collision with root package name */
    private float f3838k;
    private float l;
    protected float m;
    protected float n;
    protected float o;
    protected float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private float u;
    private float v;

    public r(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.s = r0
            r1.t = r0
            r1.u = r0
            r1.v = r0
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r2)
            int r2 = r2.getScaledEdgeSlop()
            float r2 = (float) r2
            r1.f3837j = r2
            return
    }

    private static float j(android.view.MotionEvent r2, int r3) {
            float r3 = (float) r3
            float r0 = r2.getX()
            float r3 = r3 + r0
            float r0 = r2.getRawX()
            float r3 = r3 - r0
            int r0 = r2.getPointerCount()
            r1 = 1
            if (r1 >= r0) goto L18
            float r2 = r2.getX(r1)
            float r2 = r2 + r3
            return r2
        L18:
            r2 = 0
            return r2
    }

    private static float m(android.view.MotionEvent r2, int r3) {
            float r3 = (float) r3
            float r0 = r2.getY()
            float r3 = r3 + r0
            float r0 = r2.getRawY()
            float r3 = r3 - r0
            int r0 = r2.getPointerCount()
            r1 = 1
            if (r1 >= r0) goto L18
            float r2 = r2.getY(r1)
            float r2 = r2 + r3
            return r2
        L18:
            r2 = 0
            return r2
    }

    @Override // com.amap.api.col.p0003l.s
    protected void e(android.view.MotionEvent r10) {
            r9 = this;
            super.e(r10)
            android.view.MotionEvent r0 = r9.f3932c
            int r1 = r0.getPointerCount()
            int r2 = r10.getPointerCount()
            r3 = 2
            if (r2 != r3) goto L57
            if (r2 == r1) goto L13
            goto L57
        L13:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r9.q = r1
            r9.r = r1
            r1 = 0
            float r2 = r0.getX(r1)
            float r3 = r0.getY(r1)
            r4 = 1
            float r5 = r0.getX(r4)
            float r0 = r0.getY(r4)
            float r6 = r5 - r2
            float r7 = r0 - r3
            r9.m = r6
            r9.n = r7
            float r6 = r10.getX(r1)
            float r1 = r10.getY(r1)
            float r7 = r10.getX(r4)
            float r10 = r10.getY(r4)
            float r4 = r7 - r6
            float r8 = r10 - r1
            r9.o = r4
            r9.p = r8
            float r6 = r6 - r2
            r9.s = r6
            float r1 = r1 - r3
            r9.t = r1
            float r7 = r7 - r5
            r9.u = r7
            float r10 = r10 - r0
            r9.v = r10
        L57:
            return
    }

    public final android.graphics.PointF k(int r3) {
            r2 = this;
            if (r3 != 0) goto Lc
            android.graphics.PointF r3 = new android.graphics.PointF
            float r0 = r2.s
            float r1 = r2.t
            r3.<init>(r0, r1)
            return r3
        Lc:
            android.graphics.PointF r3 = new android.graphics.PointF
            float r0 = r2.u
            float r1 = r2.v
            r3.<init>(r0, r1)
            return r3
    }

    protected final boolean l(android.view.MotionEvent r8, int r9, int r10) {
            r7 = this;
            int r0 = r7.f3937h
            if (r0 == 0) goto L14
            int r1 = r7.f3938i
            if (r1 != 0) goto L9
            goto L14
        L9:
            float r0 = (float) r0
            float r2 = r7.f3837j
            float r0 = r0 - r2
            r7.f3838k = r0
            float r0 = (float) r1
            float r0 = r0 - r2
            r7.l = r0
            goto L2c
        L14:
            android.content.Context r0 = r7.a
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r1 = r0.widthPixels
            float r1 = (float) r1
            float r2 = r7.f3837j
            float r1 = r1 - r2
            r7.f3838k = r1
            int r0 = r0.heightPixels
            float r0 = (float) r0
            float r0 = r0 - r2
            r7.l = r0
        L2c:
            float r0 = r7.f3837j
            float r1 = r7.f3838k
            float r2 = r7.l
            float r3 = r8.getRawX()
            float r4 = r8.getRawY()
            float r9 = j(r8, r9)
            float r8 = m(r8, r10)
            r10 = 0
            r5 = 1
            int r6 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r6 < 0) goto L57
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 < 0) goto L57
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 > 0) goto L57
            int r3 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r3 <= 0) goto L55
            goto L57
        L55:
            r3 = 0
            goto L58
        L57:
            r3 = 1
        L58:
            int r4 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r4 < 0) goto L6b
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 < 0) goto L6b
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r9 > 0) goto L6b
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 <= 0) goto L69
            goto L6b
        L69:
            r8 = 0
            goto L6c
        L6b:
            r8 = 1
        L6c:
            if (r3 == 0) goto L71
            if (r8 == 0) goto L71
            return r5
        L71:
            if (r3 == 0) goto L74
            return r5
        L74:
            if (r8 == 0) goto L77
            return r5
        L77:
            return r10
    }
}
