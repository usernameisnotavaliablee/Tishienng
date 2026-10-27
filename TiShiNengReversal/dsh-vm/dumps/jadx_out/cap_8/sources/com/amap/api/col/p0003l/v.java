package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class v {
    private int A;
    private final android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    private final com.amap.api.col.3l.v.a f4037b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4038c;

    /* renamed from: d, reason: collision with root package name */
    private android.view.MotionEvent f4039d;

    /* renamed from: e, reason: collision with root package name */
    private android.view.MotionEvent f4040e;

    /* renamed from: f, reason: collision with root package name */
    private float f4041f;

    /* renamed from: g, reason: collision with root package name */
    private float f4042g;

    /* renamed from: h, reason: collision with root package name */
    private float f4043h;

    /* renamed from: i, reason: collision with root package name */
    private float f4044i;

    /* renamed from: j, reason: collision with root package name */
    private float f4045j;

    /* renamed from: k, reason: collision with root package name */
    private float f4046k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;
    private long q;
    private final float r;
    private float s;
    private float t;
    private boolean u;
    private boolean v;
    private int w;
    private int x;
    private boolean y;
    private int z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a(com.amap.api.col.p0003l.v r1);

        boolean b(com.amap.api.col.p0003l.v r1);

        boolean c(com.amap.api.col.p0003l.v r1);
    }

    public v(android.content.Context r2, com.amap.api.col.3l.v.a r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.z = r0
            r1.A = r0
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r2)
            r1.a = r2
            r1.f4037b = r3
            int r2 = r0.getScaledEdgeSlop()
            float r2 = (float) r2
            r1.r = r2
            return
    }

    private static float a(android.view.MotionEvent r2, int r3) {
            if (r3 >= 0) goto L4
            r2 = 1
            return r2
        L4:
            if (r3 != 0) goto Lb
            float r2 = r2.getRawX()
            return r2
        Lb:
            float r0 = r2.getRawX()
            float r1 = r2.getX()
            float r0 = r0 - r1
            float r2 = r2.getX(r3)
            float r2 = r2 + r0
            return r2
    }

    private int b(android.view.MotionEvent r9, int r10, int r11) {
            r8 = this;
            int r0 = r9.getPointerCount()
            int r10 = r9.findPointerIndex(r10)
            r1 = 0
        L9:
            if (r1 >= r0) goto L31
            if (r1 == r11) goto L2e
            if (r1 == r10) goto L2e
            float r2 = r8.r
            float r3 = r8.s
            float r4 = r8.t
            float r5 = a(r9, r1)
            float r6 = g(r9, r1)
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 < 0) goto L2e
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 < 0) goto L2e
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 > 0) goto L2e
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 > 0) goto L2e
            return r1
        L2e:
            int r1 = r1 + 1
            goto L9
        L31:
            r9 = -1
            return r9
    }

    private static float g(android.view.MotionEvent r2, int r3) {
            if (r3 >= 0) goto L4
            r2 = 1
            return r2
        L4:
            if (r3 != 0) goto Lb
            float r2 = r2.getRawY()
            return r2
        Lb:
            float r0 = r2.getRawY()
            float r1 = r2.getY()
            float r0 = r0 - r1
            float r2 = r2.getY(r3)
            float r2 = r2 + r0
            return r2
    }

    private void h(android.view.MotionEvent r14) {
            r13 = this;
            android.view.MotionEvent r0 = r13.f4040e
            if (r0 == 0) goto L7
            r0.recycle()
        L7:
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r14)
            r13.f4040e = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r13.l = r0
            r13.m = r0
            r13.n = r0
            android.view.MotionEvent r0 = r13.f4039d
            int r1 = r13.w
            int r1 = r0.findPointerIndex(r1)
            int r2 = r13.x
            int r2 = r0.findPointerIndex(r2)
            int r3 = r13.w
            int r3 = r14.findPointerIndex(r3)
            int r4 = r13.x
            int r4 = r14.findPointerIndex(r4)
            if (r1 < 0) goto L92
            if (r2 < 0) goto L92
            if (r3 < 0) goto L92
            if (r4 >= 0) goto L38
            goto L92
        L38:
            float r5 = r0.getX(r1)
            float r6 = r0.getY(r1)
            float r7 = r0.getX(r2)
            float r8 = r0.getY(r2)
            float r9 = r14.getX(r3)
            float r10 = r14.getY(r3)
            float r11 = r14.getX(r4)
            float r12 = r14.getY(r4)
            float r7 = r7 - r5
            float r8 = r8 - r6
            float r11 = r11 - r9
            float r12 = r12 - r10
            r13.f4043h = r7
            r13.f4044i = r8
            r13.f4045j = r11
            r13.f4046k = r12
            r5 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11 * r5
            float r9 = r9 + r11
            r13.f4041f = r9
            float r12 = r12 * r5
            float r10 = r10 + r12
            r13.f4042g = r10
            long r5 = r14.getEventTime()
            long r7 = r0.getEventTime()
            long r5 = r5 - r7
            r13.q = r5
            float r3 = r14.getPressure(r3)
            float r14 = r14.getPressure(r4)
            float r3 = r3 + r14
            r13.o = r3
            float r14 = r0.getPressure(r1)
            float r0 = r0.getPressure(r2)
            float r14 = r14 + r0
            r13.p = r14
            return
        L92:
            r14 = 1
            r13.v = r14
            boolean r14 = r13.f4038c
            if (r14 == 0) goto L9e
            com.amap.api.col.3l.v$a r14 = r13.f4037b
            r14.a(r13)
        L9e:
            return
    }

    private void p() {
            r2 = this;
            android.view.MotionEvent r0 = r2.f4039d
            r1 = 0
            if (r0 == 0) goto La
            r0.recycle()
            r2.f4039d = r1
        La:
            android.view.MotionEvent r0 = r2.f4040e
            if (r0 == 0) goto L13
            r0.recycle()
            r2.f4040e = r1
        L13:
            r0 = 0
            r2.u = r0
            r2.f4038c = r0
            r1 = -1
            r2.w = r1
            r2.x = r1
            r2.v = r0
            return
    }

    private float q() {
            r2 = this;
            float r0 = r2.l
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L19
            float r0 = r2.f4045j
            float r1 = r2.f4046k
            float r0 = r0 * r0
            float r1 = r1 * r1
            float r0 = r0 + r1
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            float r0 = (float) r0
            r2.l = r0
        L19:
            float r0 = r2.l
            return r0
    }

    private float r() {
            r2 = this;
            float r0 = r2.m
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L19
            float r0 = r2.f4043h
            float r1 = r2.f4044i
            float r0 = r0 * r0
            float r1 = r1 * r1
            float r0 = r0 + r1
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            float r0 = (float) r0
            r2.m = r0
        L19:
            float r0 = r2.m
            return r0
    }

    public final android.view.MotionEvent c() {
            r1 = this;
            android.view.MotionEvent r0 = r1.f4040e
            return r0
    }

    public final void d(int r1, int r2) {
            r0 = this;
            r0.z = r1
            r0.A = r2
            return
    }

    public final boolean e(android.view.MotionEvent r14) {
            r13 = this;
            int r0 = r14.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 != 0) goto Lb
            r13.p()
        Lb:
            boolean r1 = r13.v
            r2 = 0
            if (r1 == 0) goto L11
            return r2
        L11:
            boolean r1 = r13.f4038c
            r3 = 6
            r4 = 5
            r5 = -1
            r6 = 2
            r7 = 1
            if (r1 != 0) goto L224
            if (r0 == 0) goto L21b
            if (r0 == r7) goto L217
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 == r6) goto L167
            if (r0 == r4) goto L8d
            if (r0 == r3) goto L28
            goto L349
        L28:
            boolean r0 = r13.u
            if (r0 == 0) goto L349
            int r0 = r14.getPointerCount()
            int r1 = r14.getActionIndex()
            int r3 = r14.getPointerId(r1)
            if (r0 <= r6) goto L5e
            int r0 = r13.w
            if (r3 != r0) goto L4d
            int r0 = r13.x
            int r0 = r13.b(r14, r0, r1)
            if (r0 < 0) goto L349
            int r14 = r14.getPointerId(r0)
            r13.w = r14
            return r7
        L4d:
            int r2 = r13.x
            if (r3 != r2) goto L349
            int r0 = r13.b(r14, r0, r1)
            if (r0 < 0) goto L349
            int r14 = r14.getPointerId(r0)
            r13.x = r14
            return r7
        L5e:
            int r0 = r13.w
            if (r3 != r0) goto L64
            int r0 = r13.x
        L64:
            int r0 = r14.findPointerIndex(r0)
            if (r0 >= 0) goto L76
            r13.v = r7
            boolean r14 = r13.f4038c
            if (r14 == 0) goto L75
            com.amap.api.col.3l.v$a r14 = r13.f4037b
            r14.a(r13)
        L75:
            return r2
        L76:
            int r1 = r14.getPointerId(r0)
            r13.w = r1
            r13.y = r7
            r13.x = r5
            float r1 = r14.getX(r0)
            r13.f4041f = r1
            float r14 = r14.getY(r0)
            r13.f4042g = r14
            return r7
        L8d:
            int r0 = r13.z
            if (r0 == 0) goto La1
            int r3 = r13.A
            if (r3 != 0) goto L96
            goto La1
        L96:
            float r0 = (float) r0
            float r4 = r13.r
            float r0 = r0 - r4
            r13.s = r0
            float r0 = (float) r3
            float r0 = r0 - r4
            r13.t = r0
            goto Lb9
        La1:
            android.content.Context r0 = r13.a
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r3 = r0.widthPixels
            float r3 = (float) r3
            float r4 = r13.r
            float r3 = r3 - r4
            r13.s = r3
            int r0 = r0.heightPixels
            float r0 = (float) r0
            float r0 = r0 - r4
            r13.t = r0
        Lb9:
            android.view.MotionEvent r0 = r13.f4039d
            if (r0 == 0) goto Lc0
            r0.recycle()
        Lc0:
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r14)
            r13.f4039d = r0
            r3 = 0
            r13.q = r3
            int r0 = r14.getActionIndex()
            int r3 = r13.w
            int r3 = r14.findPointerIndex(r3)
            int r4 = r14.getPointerId(r0)
            r13.x = r4
            if (r3 < 0) goto Lde
            if (r3 != r0) goto Lec
        Lde:
            if (r3 != r0) goto Le1
            goto Le2
        Le1:
            r5 = r4
        Le2:
            int r3 = r13.b(r14, r5, r3)
            int r4 = r14.getPointerId(r3)
            r13.w = r4
        Lec:
            r13.y = r2
            r13.h(r14)
            float r4 = r13.r
            float r5 = r13.s
            float r6 = r13.t
            float r8 = a(r14, r3)
            float r9 = g(r14, r3)
            float r10 = a(r14, r0)
            float r11 = g(r14, r0)
            int r12 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r12 < 0) goto L11a
            int r12 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r12 < 0) goto L11a
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 > 0) goto L11a
            int r8 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r8 <= 0) goto L118
            goto L11a
        L118:
            r8 = 0
            goto L11b
        L11a:
            r8 = 1
        L11b:
            int r9 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r9 < 0) goto L12e
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 < 0) goto L12e
            int r4 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r4 > 0) goto L12e
            int r4 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r4 <= 0) goto L12c
            goto L12e
        L12c:
            r4 = 0
            goto L12f
        L12e:
            r4 = 1
        L12f:
            if (r8 == 0) goto L13a
            if (r4 == 0) goto L13a
            r13.f4041f = r1
            r13.f4042g = r1
            r13.u = r7
            return r7
        L13a:
            if (r8 == 0) goto L14b
            float r1 = r14.getX(r0)
            r13.f4041f = r1
            float r14 = r14.getY(r0)
            r13.f4042g = r14
            r13.u = r7
            return r7
        L14b:
            if (r4 == 0) goto L15c
            float r0 = r14.getX(r3)
            r13.f4041f = r0
            float r14 = r14.getY(r3)
            r13.f4042g = r14
            r13.u = r7
            return r7
        L15c:
            r13.u = r2
            com.amap.api.col.3l.v$a r14 = r13.f4037b
            boolean r14 = r14.c(r13)
            r13.f4038c = r14
            return r7
        L167:
            boolean r0 = r13.u
            if (r0 == 0) goto L349
            float r0 = r13.r
            float r3 = r13.s
            float r4 = r13.t
            int r5 = r13.w
            int r5 = r14.findPointerIndex(r5)
            int r6 = r13.x
            int r6 = r14.findPointerIndex(r6)
            float r8 = a(r14, r5)
            float r9 = g(r14, r5)
            float r10 = a(r14, r6)
            float r11 = g(r14, r6)
            int r12 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r12 < 0) goto L1a0
            int r12 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r12 < 0) goto L1a0
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 > 0) goto L1a0
            int r8 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r8 <= 0) goto L19e
            goto L1a0
        L19e:
            r8 = 0
            goto L1a1
        L1a0:
            r8 = 1
        L1a1:
            int r9 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r9 < 0) goto L1b4
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 < 0) goto L1b4
            int r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r0 > 0) goto L1b4
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 <= 0) goto L1b2
            goto L1b4
        L1b2:
            r0 = 0
            goto L1b5
        L1b4:
            r0 = 1
        L1b5:
            if (r8 == 0) goto L1cd
            int r3 = r13.x
            int r3 = r13.b(r14, r3, r5)
            if (r3 < 0) goto L1cd
            int r4 = r14.getPointerId(r3)
            r13.w = r4
            a(r14, r3)
            g(r14, r3)
            r5 = r3
            r8 = 0
        L1cd:
            if (r0 == 0) goto L1e5
            int r3 = r13.w
            int r3 = r13.b(r14, r3, r6)
            if (r3 < 0) goto L1e5
            int r0 = r14.getPointerId(r3)
            r13.x = r0
            a(r14, r3)
            g(r14, r3)
            r6 = r3
            r0 = 0
        L1e5:
            if (r8 == 0) goto L1ee
            if (r0 == 0) goto L1ee
            r13.f4041f = r1
            r13.f4042g = r1
            return r7
        L1ee:
            if (r8 == 0) goto L1fd
            float r0 = r14.getX(r6)
            r13.f4041f = r0
            float r14 = r14.getY(r6)
            r13.f4042g = r14
            return r7
        L1fd:
            if (r0 == 0) goto L20c
            float r0 = r14.getX(r5)
            r13.f4041f = r0
            float r14 = r14.getY(r5)
            r13.f4042g = r14
            return r7
        L20c:
            r13.u = r2
            com.amap.api.col.3l.v$a r14 = r13.f4037b
            boolean r14 = r14.c(r13)
            r13.f4038c = r14
            return r7
        L217:
            r13.p()
            return r7
        L21b:
            int r14 = r14.getPointerId(r2)
            r13.w = r14
            r13.y = r7
            return r7
        L224:
            if (r0 == r7) goto L34a
            if (r0 == r6) goto L327
            r1 = 3
            if (r0 == r1) goto L31e
            if (r0 == r4) goto L2cc
            if (r0 == r3) goto L231
            goto L349
        L231:
            int r0 = r14.getPointerCount()
            int r1 = r14.getActionIndex()
            int r3 = r14.getPointerId(r1)
            if (r0 <= r6) goto L2a3
            int r0 = r13.w
            if (r3 != r0) goto L26c
            int r0 = r13.x
            int r0 = r13.b(r14, r0, r1)
            if (r0 < 0) goto L26a
            com.amap.api.col.3l.v$a r1 = r13.f4037b
            r1.a(r13)
            int r0 = r14.getPointerId(r0)
            r13.w = r0
            r13.y = r7
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r14)
            r13.f4039d = r0
            r13.h(r14)
            com.amap.api.col.3l.v$a r0 = r13.f4037b
            boolean r0 = r0.c(r13)
            r13.f4038c = r0
            goto L294
        L26a:
            r2 = 1
            goto L294
        L26c:
            int r4 = r13.x
            if (r3 != r4) goto L294
            int r0 = r13.b(r14, r0, r1)
            if (r0 < 0) goto L26a
            com.amap.api.col.3l.v$a r1 = r13.f4037b
            r1.a(r13)
            int r0 = r14.getPointerId(r0)
            r13.x = r0
            r13.y = r2
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r14)
            r13.f4039d = r0
            r13.h(r14)
            com.amap.api.col.3l.v$a r0 = r13.f4037b
            boolean r0 = r0.c(r13)
            r13.f4038c = r0
        L294:
            android.view.MotionEvent r0 = r13.f4039d
            r0.recycle()
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r14)
            r13.f4039d = r0
            r13.h(r14)
            goto L2a4
        L2a3:
            r2 = 1
        L2a4:
            if (r2 == 0) goto L349
            r13.h(r14)
            int r0 = r13.w
            if (r3 != r0) goto L2af
            int r0 = r13.x
        L2af:
            int r1 = r14.findPointerIndex(r0)
            float r2 = r14.getX(r1)
            r13.f4041f = r2
            float r14 = r14.getY(r1)
            r13.f4042g = r14
            com.amap.api.col.3l.v$a r14 = r13.f4037b
            r14.a(r13)
            r13.p()
            r13.w = r0
            r13.y = r7
            return r7
        L2cc:
            com.amap.api.col.3l.v$a r0 = r13.f4037b
            r0.a(r13)
            int r0 = r13.w
            int r1 = r13.x
            r13.p()
            android.view.MotionEvent r3 = android.view.MotionEvent.obtain(r14)
            r13.f4039d = r3
            boolean r3 = r13.y
            if (r3 == 0) goto L2e3
            goto L2e4
        L2e3:
            r0 = r1
        L2e4:
            r13.w = r0
            int r0 = r14.getActionIndex()
            int r0 = r14.getPointerId(r0)
            r13.x = r0
            r13.y = r2
            int r0 = r13.w
            int r0 = r14.findPointerIndex(r0)
            if (r0 < 0) goto L300
            int r1 = r13.w
            int r2 = r13.x
            if (r1 != r2) goto L312
        L300:
            int r1 = r13.w
            int r2 = r13.x
            if (r1 != r2) goto L307
            goto L308
        L307:
            r5 = r2
        L308:
            int r0 = r13.b(r14, r5, r0)
            int r0 = r14.getPointerId(r0)
            r13.w = r0
        L312:
            r13.h(r14)
            com.amap.api.col.3l.v$a r14 = r13.f4037b
            boolean r14 = r14.c(r13)
            r13.f4038c = r14
            return r7
        L31e:
            com.amap.api.col.3l.v$a r14 = r13.f4037b
            r14.a(r13)
            r13.p()
            return r7
        L327:
            r13.h(r14)
            float r0 = r13.o
            float r1 = r13.p
            float r0 = r0 / r1
            r1 = 1059816735(0x3f2b851f, float:0.67)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L349
            com.amap.api.col.3l.v$a r0 = r13.f4037b
            boolean r0 = r0.b(r13)
            if (r0 == 0) goto L349
            android.view.MotionEvent r0 = r13.f4039d
            r0.recycle()
            android.view.MotionEvent r14 = android.view.MotionEvent.obtain(r14)
            r13.f4039d = r14
        L349:
            return r7
        L34a:
            r13.p()
            return r7
    }

    public final float f() {
            r1 = this;
            float r0 = r1.f4041f
            return r0
    }

    public final float i() {
            r1 = this;
            float r0 = r1.f4042g
            return r0
    }

    public final float j() {
            r1 = this;
            float r0 = r1.f4045j
            return r0
    }

    public final float k() {
            r1 = this;
            float r0 = r1.f4046k
            return r0
    }

    public final float l() {
            r1 = this;
            float r0 = r1.f4043h
            return r0
    }

    public final float m() {
            r1 = this;
            float r0 = r1.f4044i
            return r0
    }

    public final float n() {
            r2 = this;
            float r0 = r2.n
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L13
            float r0 = r2.q()
            float r1 = r2.r()
            float r0 = r0 / r1
            r2.n = r0
        L13:
            float r0 = r2.n
            return r0
    }

    public final long o() {
            r2 = this;
            long r0 = r2.q
            return r0
    }
}
