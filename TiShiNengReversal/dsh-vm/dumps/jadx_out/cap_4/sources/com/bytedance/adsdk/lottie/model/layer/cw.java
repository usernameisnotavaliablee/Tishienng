package com.bytedance.adsdk.lottie.model.layer;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class cw implements com.bytedance.adsdk.lottie.j.j.up, com.bytedance.adsdk.lottie.j.xt.j.InterfaceC0184j {
    private java.util.List<com.bytedance.adsdk.lottie.model.layer.cw> a;
    private final android.os.Handler ae;
    private final android.graphics.Paint av;
    private final android.graphics.Paint az;
    private com.bytedance.adsdk.lottie.model.layer.cw ch;
    final com.bytedance.adsdk.lottie.model.layer.tl cw;
    private final java.lang.String f;
    private final android.graphics.Path g;
    private final android.graphics.Matrix gq;
    private boolean h;
    private final android.graphics.RectF i;
    final android.graphics.Matrix j;
    private final android.graphics.Paint jy;
    private final android.graphics.RectF kt;

    /* renamed from: l, reason: collision with root package name */
    private final java.util.List<com.bytedance.adsdk.lottie.j.xt.j<?, ?>> f1835l;
    private android.graphics.Paint la;

    /* renamed from: m, reason: collision with root package name */
    android.graphics.BlurMaskFilter f1836m;
    private final android.graphics.RectF mi;
    private final android.graphics.Matrix oq;

    /* renamed from: p, reason: collision with root package name */
    private boolean f1837p;
    private final android.graphics.Matrix qv;

    /* renamed from: r, reason: collision with root package name */
    final com.bytedance.adsdk.lottie.j.xt.av f1838r;
    private float rn;

    /* renamed from: s, reason: collision with root package name */
    private com.bytedance.adsdk.lottie.model.layer.cw f1839s;
    private final android.graphics.RectF tj;
    private boolean tl;
    float up;

    /* renamed from: v, reason: collision with root package name */
    private com.bytedance.adsdk.lottie.j.xt.tl f1840v;
    private final android.graphics.Paint vl;

    /* renamed from: w, reason: collision with root package name */
    private final android.graphics.RectF f1841w;
    private final android.graphics.Paint ws;

    /* renamed from: x, reason: collision with root package name */
    private com.bytedance.adsdk.lottie.j.xt.r f1842x;
    final com.bytedance.adsdk.lottie.tl xt;


    /* renamed from: com.bytedance.adsdk.lottie.model.layer.cw$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] j = null;
        static final /* synthetic */ int[] xt = null;

        static {
                com.bytedance.adsdk.lottie.model.xt.tl$j[] r0 = com.bytedance.adsdk.lottie.model.xt.tl.j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.adsdk.lottie.model.layer.cw.AnonymousClass2.xt = r0
                r1 = 1
                com.bytedance.adsdk.lottie.model.xt.tl$j r2 = com.bytedance.adsdk.lottie.model.xt.tl.j.f1876r     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = com.bytedance.adsdk.lottie.model.layer.cw.AnonymousClass2.xt     // Catch: java.lang.NoSuchFieldError -> L1d
                com.bytedance.adsdk.lottie.model.xt.tl$j r3 = com.bytedance.adsdk.lottie.model.xt.tl.j.xt     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = com.bytedance.adsdk.lottie.model.layer.cw.AnonymousClass2.xt     // Catch: java.lang.NoSuchFieldError -> L28
                com.bytedance.adsdk.lottie.model.xt.tl$j r4 = com.bytedance.adsdk.lottie.model.xt.tl.j.cw     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                r3 = 4
                int[] r4 = com.bytedance.adsdk.lottie.model.layer.cw.AnonymousClass2.xt     // Catch: java.lang.NoSuchFieldError -> L33
                com.bytedance.adsdk.lottie.model.xt.tl$j r5 = com.bytedance.adsdk.lottie.model.xt.tl.j.j     // Catch: java.lang.NoSuchFieldError -> L33
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r4[r5] = r3     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                com.bytedance.adsdk.lottie.model.layer.tl$j[] r4 = com.bytedance.adsdk.lottie.model.layer.tl.j.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                com.bytedance.adsdk.lottie.model.layer.cw.AnonymousClass2.j = r4
                com.bytedance.adsdk.lottie.model.layer.tl$j r5 = com.bytedance.adsdk.lottie.model.layer.tl.j.up     // Catch: java.lang.NoSuchFieldError -> L44
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L44
                r4[r5] = r1     // Catch: java.lang.NoSuchFieldError -> L44
            L44:
                int[] r1 = com.bytedance.adsdk.lottie.model.layer.cw.AnonymousClass2.j     // Catch: java.lang.NoSuchFieldError -> L4e
                com.bytedance.adsdk.lottie.model.layer.tl$j r4 = com.bytedance.adsdk.lottie.model.layer.tl.j.j     // Catch: java.lang.NoSuchFieldError -> L4e
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4e
                r1[r4] = r0     // Catch: java.lang.NoSuchFieldError -> L4e
            L4e:
                int[] r0 = com.bytedance.adsdk.lottie.model.layer.cw.AnonymousClass2.j     // Catch: java.lang.NoSuchFieldError -> L58
                com.bytedance.adsdk.lottie.model.layer.tl$j r1 = com.bytedance.adsdk.lottie.model.layer.tl.j.xt     // Catch: java.lang.NoSuchFieldError -> L58
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L58
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L58
            L58:
                int[] r0 = com.bytedance.adsdk.lottie.model.layer.cw.AnonymousClass2.j     // Catch: java.lang.NoSuchFieldError -> L62
                com.bytedance.adsdk.lottie.model.layer.tl$j r1 = com.bytedance.adsdk.lottie.model.layer.tl.j.cw     // Catch: java.lang.NoSuchFieldError -> L62
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L62
                r0[r1] = r3     // Catch: java.lang.NoSuchFieldError -> L62
            L62:
                int[] r0 = com.bytedance.adsdk.lottie.model.layer.cw.AnonymousClass2.j     // Catch: java.lang.NoSuchFieldError -> L6d
                com.bytedance.adsdk.lottie.model.layer.tl$j r1 = com.bytedance.adsdk.lottie.model.layer.tl.j.f1849r     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L6d:
                int[] r0 = com.bytedance.adsdk.lottie.model.layer.cw.AnonymousClass2.j     // Catch: java.lang.NoSuchFieldError -> L78
                com.bytedance.adsdk.lottie.model.layer.tl$j r1 = com.bytedance.adsdk.lottie.model.layer.tl.j.f1848m     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r0 = com.bytedance.adsdk.lottie.model.layer.cw.AnonymousClass2.j     // Catch: java.lang.NoSuchFieldError -> L83
                com.bytedance.adsdk.lottie.model.layer.tl$j r1 = com.bytedance.adsdk.lottie.model.layer.tl.j.ae     // Catch: java.lang.NoSuchFieldError -> L83
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L83
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L83
            L83:
                return
        }

        public AnonymousClass2() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    cw(com.bytedance.adsdk.lottie.tl r7, com.bytedance.adsdk.lottie.model.layer.tl r8) {
            r6 = this;
            r6.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r6.ae = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r6.g = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r6.oq = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r6.qv = r0
            com.bytedance.adsdk.lottie.j.j r0 = new com.bytedance.adsdk.lottie.j.j
            r1 = 1
            r0.<init>(r1)
            r6.vl = r0
            com.bytedance.adsdk.lottie.j.j r0 = new com.bytedance.adsdk.lottie.j.j
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.DST_IN
            r0.<init>(r1, r2)
            r6.jy = r0
            com.bytedance.adsdk.lottie.j.j r0 = new com.bytedance.adsdk.lottie.j.j
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.DST_OUT
            r0.<init>(r1, r3)
            r6.ws = r0
            com.bytedance.adsdk.lottie.j.j r0 = new com.bytedance.adsdk.lottie.j.j
            r0.<init>(r1)
            r6.az = r0
            com.bytedance.adsdk.lottie.j.j r4 = new com.bytedance.adsdk.lottie.j.j
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.CLEAR
            r4.<init>(r5)
            r6.av = r4
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>()
            r6.i = r4
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>()
            r6.f1841w = r4
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>()
            r6.mi = r4
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>()
            r6.kt = r4
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>()
            r6.tj = r4
            android.graphics.Matrix r4 = new android.graphics.Matrix
            r4.<init>()
            r6.j = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r6.f1835l = r4
            r6.f1837p = r1
            r1 = 0
            r6.up = r1
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r6.gq = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r6.rn = r1
            r6.xt = r7
            r6.cw = r8
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = r8.m()
            r7.append(r1)
            java.lang.String r1 = "#draw"
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            r6.f = r7
            com.bytedance.adsdk.lottie.model.layer.tl$xt r7 = r8.vl()
            com.bytedance.adsdk.lottie.model.layer.tl$xt r1 = com.bytedance.adsdk.lottie.model.layer.tl.xt.cw
            if (r7 != r1) goto Lba
            android.graphics.PorterDuffXfermode r7 = new android.graphics.PorterDuffXfermode
            r7.<init>(r3)
            r0.setXfermode(r7)
            goto Lc2
        Lba:
            android.graphics.PorterDuffXfermode r7 = new android.graphics.PorterDuffXfermode
            r7.<init>(r2)
            r0.setXfermode(r7)
        Lc2:
            com.bytedance.adsdk.lottie.model.j.vl r7 = r8.az()
            com.bytedance.adsdk.lottie.j.xt.av r7 = r7.oq()
            r6.f1838r = r7
            r7.j(r6)
            java.util.List r7 = r8.oq()
            if (r7 == 0) goto L11f
            java.util.List r7 = r8.oq()
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L11f
            com.bytedance.adsdk.lottie.j.xt.tl r7 = new com.bytedance.adsdk.lottie.j.xt.tl
            java.util.List r8 = r8.oq()
            r7.<init>(r8)
            r6.f1840v = r7
            java.util.List r7 = r7.xt()
            java.util.Iterator r7 = r7.iterator()
        Lf2:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L102
            java.lang.Object r8 = r7.next()
            com.bytedance.adsdk.lottie.j.xt.j r8 = (com.bytedance.adsdk.lottie.j.xt.j) r8
            r8.j(r6)
            goto Lf2
        L102:
            com.bytedance.adsdk.lottie.j.xt.tl r7 = r6.f1840v
            java.util.List r7 = r7.cw()
            java.util.Iterator r7 = r7.iterator()
        L10c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L11f
            java.lang.Object r8 = r7.next()
            com.bytedance.adsdk.lottie.j.xt.j r8 = (com.bytedance.adsdk.lottie.j.xt.j) r8
            r6.j(r8)
            r8.j(r6)
            goto L10c
        L11f:
            r6.ws()
            return
    }

    private boolean av() {
            r4 = this;
            com.bytedance.adsdk.lottie.j.xt.tl r0 = r4.f1840v
            java.util.List r0 = r0.xt()
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto Le
            return r1
        Le:
            r0 = 0
        Lf:
            com.bytedance.adsdk.lottie.j.xt.tl r2 = r4.f1840v
            java.util.List r2 = r2.j()
            int r2 = r2.size()
            if (r0 >= r2) goto L33
            com.bytedance.adsdk.lottie.j.xt.tl r2 = r4.f1840v
            java.util.List r2 = r2.j()
            java.lang.Object r2 = r2.get(r0)
            com.bytedance.adsdk.lottie.model.xt.tl r2 = (com.bytedance.adsdk.lottie.model.xt.tl) r2
            com.bytedance.adsdk.lottie.model.xt.tl$j r2 = r2.j()
            com.bytedance.adsdk.lottie.model.xt.tl$j r3 = com.bytedance.adsdk.lottie.model.xt.tl.j.f1876r
            if (r2 == r3) goto L30
            return r1
        L30:
            int r0 = r0 + 1
            goto Lf
        L33:
            r0 = 1
            return r0
    }

    private void az() {
            r1 = this;
            com.bytedance.adsdk.lottie.tl r0 = r1.xt
            r0.invalidateSelf()
            return
    }

    static /* synthetic */ com.bytedance.adsdk.lottie.j.xt.r cw(com.bytedance.adsdk.lottie.model.layer.cw r0) {
            com.bytedance.adsdk.lottie.j.xt.r r0 = r0.f1842x
            return r0
    }

    private void cw(float r3) {
            r2 = this;
            com.bytedance.adsdk.lottie.tl r0 = r2.xt
            com.bytedance.adsdk.lottie.m r0 = r0.a()
            com.bytedance.adsdk.lottie.w r0 = r0.cw()
            com.bytedance.adsdk.lottie.model.layer.tl r1 = r2.cw
            java.lang.String r1 = r1.m()
            r0.j(r1, r3)
            return
    }

    private void cw(android.graphics.Canvas r3, android.graphics.Matrix r4, com.bytedance.adsdk.lottie.j.xt.j<com.bytedance.adsdk.lottie.model.xt.ws, android.graphics.Path> r5, com.bytedance.adsdk.lottie.j.xt.j<java.lang.Integer, java.lang.Integer> r6) {
            r2 = this;
            android.graphics.RectF r0 = r2.i
            android.graphics.Paint r1 = r2.ws
            com.bytedance.adsdk.lottie.up.g.j(r3, r0, r1)
            android.graphics.RectF r0 = r2.i
            android.graphics.Paint r1 = r2.vl
            r3.drawRect(r0, r1)
            android.graphics.Paint r0 = r2.ws
            java.lang.Object r6 = r6.ae()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            float r6 = (float) r6
            r1 = 1076048691(0x40233333, float:2.55)
            float r6 = r6 * r1
            int r6 = (int) r6
            r0.setAlpha(r6)
            java.lang.Object r5 = r5.ae()
            android.graphics.Path r5 = (android.graphics.Path) r5
            android.graphics.Path r6 = r2.g
            r6.set(r5)
            android.graphics.Path r5 = r2.g
            r5.transform(r4)
            android.graphics.Path r4 = r2.g
            android.graphics.Paint r5 = r2.ws
            r3.drawPath(r4, r5)
            r3.restore()
            return
    }

    private void i() {
            r2 = this;
            java.util.List<com.bytedance.adsdk.lottie.model.layer.cw> r0 = r2.a
            if (r0 == 0) goto L5
            goto L21
        L5:
            com.bytedance.adsdk.lottie.model.layer.cw r0 = r2.f1839s
            if (r0 != 0) goto Le
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            r2.a = r0
            return
        Le:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.a = r0
            com.bytedance.adsdk.lottie.model.layer.cw r0 = r2.f1839s
        L17:
            if (r0 == 0) goto L21
            java.util.List<com.bytedance.adsdk.lottie.model.layer.cw> r1 = r2.a
            r1.add(r0)
            com.bytedance.adsdk.lottie.model.layer.cw r0 = r0.f1839s
            goto L17
        L21:
            return
    }

    private static com.bytedance.adsdk.lottie.g.j j(com.bytedance.adsdk.lottie.tl r1, com.bytedance.adsdk.lottie.model.layer.tl r2) {
            r0 = 0
            if (r1 == 0) goto L15
            if (r2 != 0) goto L6
            goto L15
        L6:
            java.lang.String r2 = r2.ae()
            com.bytedance.adsdk.lottie.g r1 = r1.m(r2)
            if (r1 == 0) goto L15
            com.bytedance.adsdk.lottie.g$j r1 = r1.oq()
            return r1
        L15:
            return r0
    }

    static com.bytedance.adsdk.lottie.model.layer.cw j(com.bytedance.adsdk.lottie.model.layer.r r6, com.bytedance.adsdk.lottie.model.layer.tl r7, com.bytedance.adsdk.lottie.tl r8, com.bytedance.adsdk.lottie.m r9, android.content.Context r10) {
            int[] r0 = com.bytedance.adsdk.lottie.model.layer.cw.AnonymousClass2.j
            com.bytedance.adsdk.lottie.model.layer.tl$j r1 = r7.qv()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto Laf;
                case 2: goto L9d;
                case 3: goto L97;
                case 4: goto L32;
                case 5: goto L2c;
                case 6: goto L26;
                default: goto Lf;
            }
        Lf:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "Unknown layer type "
            r6.<init>(r8)
            com.bytedance.adsdk.lottie.model.layer.tl$j r7 = r7.qv()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.bytedance.adsdk.lottie.up.up.xt(r6)
            r6 = 0
            return r6
        L26:
            com.bytedance.adsdk.lottie.model.layer.vl r6 = new com.bytedance.adsdk.lottie.model.layer.vl
            r6.<init>(r8, r7)
            return r6
        L2c:
            com.bytedance.adsdk.lottie.model.layer.g r6 = new com.bytedance.adsdk.lottie.model.layer.g
            r6.<init>(r8, r7)
            return r6
        L32:
            java.lang.String r6 = "text:"
            boolean r6 = j(r8, r7, r6)
            if (r6 == 0) goto L40
            com.bytedance.adsdk.lottie.model.layer.m r6 = new com.bytedance.adsdk.lottie.model.layer.m
            r6.<init>(r8, r7, r10)
            return r6
        L40:
            java.lang.String r6 = "videoview:"
            boolean r6 = j(r8, r7, r6)
            if (r6 == 0) goto L75
            com.bytedance.adsdk.lottie.g$j r6 = j(r8, r7)
            if (r6 == 0) goto L6f
            com.bytedance.adsdk.lottie.g$j$j r9 = r6.j
            if (r9 == 0) goto L5f
            float r0 = r9.j
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L5f
            com.bytedance.adsdk.lottie.model.layer.up r6 = new com.bytedance.adsdk.lottie.model.layer.up
            r6.<init>(r8, r7, r10, r9)
            return r6
        L5f:
            boolean r6 = r6.xt
            if (r6 == 0) goto L69
            com.bytedance.adsdk.lottie.model.layer.xt r6 = new com.bytedance.adsdk.lottie.model.layer.xt
            r6.<init>(r8, r7, r10)
            return r6
        L69:
            com.bytedance.adsdk.lottie.model.layer.ws r6 = new com.bytedance.adsdk.lottie.model.layer.ws
            r6.<init>(r8, r7, r10)
            return r6
        L6f:
            com.bytedance.adsdk.lottie.model.layer.ws r6 = new com.bytedance.adsdk.lottie.model.layer.ws
            r6.<init>(r8, r7, r10)
            return r6
        L75:
            java.lang.String r6 = "animview:"
            boolean r6 = j(r8, r7, r6)
            if (r6 == 0) goto L83
            com.bytedance.adsdk.lottie.model.layer.j r6 = new com.bytedance.adsdk.lottie.model.layer.j
            r6.<init>(r8, r7, r10)
            return r6
        L83:
            java.lang.String r6 = "view:"
            boolean r6 = j(r8, r7, r6)
            if (r6 == 0) goto L91
            com.bytedance.adsdk.lottie.model.layer.jy r6 = new com.bytedance.adsdk.lottie.model.layer.jy
            r6.<init>(r8, r7, r10)
            return r6
        L91:
            com.bytedance.adsdk.lottie.model.layer.ae r6 = new com.bytedance.adsdk.lottie.model.layer.ae
            r6.<init>(r8, r7)
            return r6
        L97:
            com.bytedance.adsdk.lottie.model.layer.qv r6 = new com.bytedance.adsdk.lottie.model.layer.qv
            r6.<init>(r8, r7)
            return r6
        L9d:
            com.bytedance.adsdk.lottie.model.layer.r r0 = new com.bytedance.adsdk.lottie.model.layer.r
            java.lang.String r6 = r7.ae()
            java.util.List r3 = r9.xt(r6)
            r2 = r7
            r1 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        Laf:
            r2 = r7
            r1 = r8
            r4 = r9
            com.bytedance.adsdk.lottie.model.layer.oq r7 = new com.bytedance.adsdk.lottie.model.layer.oq
            r7.<init>(r1, r2, r6, r4)
            return r7
    }

    private void j(android.graphics.Canvas r11) {
            r10 = this;
            java.lang.String r0 = "Layer#clearLayer"
            com.bytedance.adsdk.lottie.up.j(r0)
            android.graphics.RectF r1 = r10.i
            float r2 = r1.left
            r3 = 1065353216(0x3f800000, float:1.0)
            float r5 = r2 - r3
            float r2 = r1.top
            float r6 = r2 - r3
            float r2 = r1.right
            float r7 = r2 + r3
            float r1 = r1.bottom
            float r8 = r1 + r3
            android.graphics.Paint r9 = r10.av
            r4 = r11
            r4.drawRect(r5, r6, r7, r8, r9)
            com.bytedance.adsdk.lottie.up.xt(r0)
            return
    }

    private void j(android.graphics.Canvas r8, android.graphics.Matrix r9) {
            r7 = this;
            java.lang.String r0 = "Layer#saveLayer"
            com.bytedance.adsdk.lottie.up.j(r0)
            android.graphics.RectF r1 = r7.i
            android.graphics.Paint r2 = r7.jy
            r3 = 19
            com.bytedance.adsdk.lottie.up.g.j(r8, r1, r2, r3)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 >= r2) goto L17
            r7.j(r8)
        L17:
            com.bytedance.adsdk.lottie.up.xt(r0)
            r0 = 0
        L1b:
            com.bytedance.adsdk.lottie.j.xt.tl r1 = r7.f1840v
            java.util.List r1 = r1.j()
            int r1 = r1.size()
            if (r0 >= r1) goto Lbb
            com.bytedance.adsdk.lottie.j.xt.tl r1 = r7.f1840v
            java.util.List r1 = r1.j()
            java.lang.Object r1 = r1.get(r0)
            com.bytedance.adsdk.lottie.model.xt.tl r1 = (com.bytedance.adsdk.lottie.model.xt.tl) r1
            com.bytedance.adsdk.lottie.j.xt.tl r2 = r7.f1840v
            java.util.List r2 = r2.xt()
            java.lang.Object r2 = r2.get(r0)
            com.bytedance.adsdk.lottie.j.xt.j r2 = (com.bytedance.adsdk.lottie.j.xt.j) r2
            com.bytedance.adsdk.lottie.j.xt.tl r3 = r7.f1840v
            java.util.List r3 = r3.cw()
            java.lang.Object r3 = r3.get(r0)
            com.bytedance.adsdk.lottie.j.xt.j r3 = (com.bytedance.adsdk.lottie.j.xt.j) r3
            int[] r4 = com.bytedance.adsdk.lottie.model.layer.cw.AnonymousClass2.xt
            com.bytedance.adsdk.lottie.model.xt.tl$j r5 = r1.j()
            int r5 = r5.ordinal()
            r4 = r4[r5]
            r5 = 255(0xff, float:3.57E-43)
            r6 = 1
            if (r4 == r6) goto La5
            r6 = 2
            if (r4 == r6) goto L82
            r5 = 3
            if (r4 == r5) goto L74
            r5 = 4
            if (r4 == r5) goto L66
            goto Lb7
        L66:
            boolean r1 = r1.r()
            if (r1 == 0) goto L70
            r7.xt(r8, r9, r2, r3)
            goto Lb7
        L70:
            r7.j(r8, r9, r2, r3)
            goto Lb7
        L74:
            boolean r1 = r1.r()
            if (r1 == 0) goto L7e
            r7.up(r8, r9, r2, r3)
            goto Lb7
        L7e:
            r7.r(r8, r9, r2, r3)
            goto Lb7
        L82:
            if (r0 != 0) goto L97
            android.graphics.Paint r4 = r7.vl
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r4.setColor(r6)
            android.graphics.Paint r4 = r7.vl
            r4.setAlpha(r5)
            android.graphics.RectF r4 = r7.i
            android.graphics.Paint r5 = r7.vl
            r8.drawRect(r4, r5)
        L97:
            boolean r1 = r1.r()
            if (r1 == 0) goto La1
            r7.cw(r8, r9, r2, r3)
            goto Lb7
        La1:
            r7.j(r8, r9, r2)
            goto Lb7
        La5:
            boolean r1 = r7.av()
            if (r1 == 0) goto Lb7
            android.graphics.Paint r1 = r7.vl
            r1.setAlpha(r5)
            android.graphics.RectF r1 = r7.i
            android.graphics.Paint r2 = r7.vl
            r8.drawRect(r1, r2)
        Lb7:
            int r0 = r0 + 1
            goto L1b
        Lbb:
            java.lang.String r9 = "Layer#restoreLayer"
            com.bytedance.adsdk.lottie.up.j(r9)
            r8.restore()
            com.bytedance.adsdk.lottie.up.xt(r9)
            return
    }

    private void j(android.graphics.Canvas r2, android.graphics.Matrix r3, com.bytedance.adsdk.lottie.j.xt.j<com.bytedance.adsdk.lottie.model.xt.ws, android.graphics.Path> r4) {
            r1 = this;
            java.lang.Object r4 = r4.ae()
            android.graphics.Path r4 = (android.graphics.Path) r4
            android.graphics.Path r0 = r1.g
            r0.set(r4)
            android.graphics.Path r4 = r1.g
            r4.transform(r3)
            android.graphics.Path r3 = r1.g
            android.graphics.Paint r4 = r1.ws
            r2.drawPath(r3, r4)
            return
    }

    private void j(android.graphics.Canvas r2, android.graphics.Matrix r3, com.bytedance.adsdk.lottie.j.xt.j<com.bytedance.adsdk.lottie.model.xt.ws, android.graphics.Path> r4, com.bytedance.adsdk.lottie.j.xt.j<java.lang.Integer, java.lang.Integer> r5) {
            r1 = this;
            java.lang.Object r4 = r4.ae()
            android.graphics.Path r4 = (android.graphics.Path) r4
            android.graphics.Path r0 = r1.g
            r0.set(r4)
            android.graphics.Path r4 = r1.g
            r4.transform(r3)
            android.graphics.Paint r3 = r1.vl
            java.lang.Object r4 = r5.ae()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            float r4 = (float) r4
            r5 = 1076048691(0x40233333, float:2.55)
            float r4 = r4 * r5
            int r4 = (int) r4
            r3.setAlpha(r4)
            android.graphics.Path r3 = r1.g
            android.graphics.Paint r4 = r1.vl
            r2.drawPath(r3, r4)
            return
    }

    private void j(android.graphics.RectF r11, android.graphics.Matrix r12) {
            r10 = this;
            android.graphics.RectF r0 = r10.mi
            r1 = 0
            r0.set(r1, r1, r1, r1)
            boolean r0 = r10.g()
            if (r0 != 0) goto Le
            goto Lb9
        Le:
            com.bytedance.adsdk.lottie.j.xt.tl r0 = r10.f1840v
            java.util.List r0 = r0.j()
            int r0 = r0.size()
            r2 = 0
            r3 = 0
        L1a:
            if (r3 >= r0) goto Lae
            com.bytedance.adsdk.lottie.j.xt.tl r4 = r10.f1840v
            java.util.List r4 = r4.j()
            java.lang.Object r4 = r4.get(r3)
            com.bytedance.adsdk.lottie.model.xt.tl r4 = (com.bytedance.adsdk.lottie.model.xt.tl) r4
            com.bytedance.adsdk.lottie.j.xt.tl r5 = r10.f1840v
            java.util.List r5 = r5.xt()
            java.lang.Object r5 = r5.get(r3)
            com.bytedance.adsdk.lottie.j.xt.j r5 = (com.bytedance.adsdk.lottie.j.xt.j) r5
            java.lang.Object r5 = r5.ae()
            android.graphics.Path r5 = (android.graphics.Path) r5
            if (r5 == 0) goto Laa
            android.graphics.Path r6 = r10.g
            r6.set(r5)
            android.graphics.Path r5 = r10.g
            r5.transform(r12)
            int[] r5 = com.bytedance.adsdk.lottie.model.layer.cw.AnonymousClass2.xt
            com.bytedance.adsdk.lottie.model.xt.tl$j r6 = r4.j()
            int r6 = r6.ordinal()
            r5 = r5[r6]
            r6 = 1
            if (r5 == r6) goto Lb9
            r6 = 2
            if (r5 == r6) goto Lb9
            r6 = 3
            if (r5 == r6) goto L5f
            r6 = 4
            if (r5 == r6) goto L5f
            goto L66
        L5f:
            boolean r4 = r4.r()
            if (r4 == 0) goto L66
            goto Lb9
        L66:
            android.graphics.Path r4 = r10.g
            android.graphics.RectF r5 = r10.tj
            r4.computeBounds(r5, r2)
            if (r3 != 0) goto L77
            android.graphics.RectF r4 = r10.mi
            android.graphics.RectF r5 = r10.tj
            r4.set(r5)
            goto Laa
        L77:
            android.graphics.RectF r4 = r10.mi
            float r5 = r4.left
            android.graphics.RectF r6 = r10.tj
            float r6 = r6.left
            float r5 = java.lang.Math.min(r5, r6)
            android.graphics.RectF r6 = r10.mi
            float r6 = r6.top
            android.graphics.RectF r7 = r10.tj
            float r7 = r7.top
            float r6 = java.lang.Math.min(r6, r7)
            android.graphics.RectF r7 = r10.mi
            float r7 = r7.right
            android.graphics.RectF r8 = r10.tj
            float r8 = r8.right
            float r7 = java.lang.Math.max(r7, r8)
            android.graphics.RectF r8 = r10.mi
            float r8 = r8.bottom
            android.graphics.RectF r9 = r10.tj
            float r9 = r9.bottom
            float r8 = java.lang.Math.max(r8, r9)
            r4.set(r5, r6, r7, r8)
        Laa:
            int r3 = r3 + 1
            goto L1a
        Lae:
            android.graphics.RectF r12 = r10.mi
            boolean r12 = r11.intersect(r12)
            if (r12 != 0) goto Lb9
            r11.set(r1, r1, r1, r1)
        Lb9:
            return
    }

    static /* synthetic */ void j(com.bytedance.adsdk.lottie.model.layer.cw r0, boolean r1) {
            r0.xt(r1)
            return
    }

    private static boolean j(com.bytedance.adsdk.lottie.tl r1, com.bytedance.adsdk.lottie.model.layer.tl r2, java.lang.String r3) {
            r0 = 0
            if (r1 == 0) goto L1b
            if (r2 == 0) goto L1b
            if (r3 != 0) goto L8
            goto L1b
        L8:
            java.lang.String r2 = r2.ae()
            com.bytedance.adsdk.lottie.g r1 = r1.m(r2)
            if (r1 == 0) goto L1b
            java.lang.String r1 = r1.jy()
            boolean r1 = r3.equals(r1)
            return r1
        L1b:
            return r0
    }

    private void r(android.graphics.Canvas r3, android.graphics.Matrix r4, com.bytedance.adsdk.lottie.j.xt.j<com.bytedance.adsdk.lottie.model.xt.ws, android.graphics.Path> r5, com.bytedance.adsdk.lottie.j.xt.j<java.lang.Integer, java.lang.Integer> r6) {
            r2 = this;
            android.graphics.RectF r0 = r2.i
            android.graphics.Paint r1 = r2.jy
            com.bytedance.adsdk.lottie.up.g.j(r3, r0, r1)
            java.lang.Object r5 = r5.ae()
            android.graphics.Path r5 = (android.graphics.Path) r5
            android.graphics.Path r0 = r2.g
            r0.set(r5)
            android.graphics.Path r5 = r2.g
            r5.transform(r4)
            android.graphics.Paint r4 = r2.vl
            java.lang.Object r5 = r6.ae()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            float r5 = (float) r5
            r6 = 1076048691(0x40233333, float:2.55)
            float r5 = r5 * r6
            int r5 = (int) r5
            r4.setAlpha(r5)
            android.graphics.Path r4 = r2.g
            android.graphics.Paint r5 = r2.vl
            r3.drawPath(r4, r5)
            r3.restore()
            return
    }

    private void up(android.graphics.Canvas r3, android.graphics.Matrix r4, com.bytedance.adsdk.lottie.j.xt.j<com.bytedance.adsdk.lottie.model.xt.ws, android.graphics.Path> r5, com.bytedance.adsdk.lottie.j.xt.j<java.lang.Integer, java.lang.Integer> r6) {
            r2 = this;
            android.graphics.RectF r0 = r2.i
            android.graphics.Paint r1 = r2.jy
            com.bytedance.adsdk.lottie.up.g.j(r3, r0, r1)
            android.graphics.RectF r0 = r2.i
            android.graphics.Paint r1 = r2.vl
            r3.drawRect(r0, r1)
            android.graphics.Paint r0 = r2.ws
            java.lang.Object r6 = r6.ae()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            float r6 = (float) r6
            r1 = 1076048691(0x40233333, float:2.55)
            float r6 = r6 * r1
            int r6 = (int) r6
            r0.setAlpha(r6)
            java.lang.Object r5 = r5.ae()
            android.graphics.Path r5 = (android.graphics.Path) r5
            android.graphics.Path r6 = r2.g
            r6.set(r5)
            android.graphics.Path r5 = r2.g
            r5.transform(r4)
            android.graphics.Path r4 = r2.g
            android.graphics.Paint r5 = r2.ws
            r3.drawPath(r4, r5)
            r3.restore()
            return
    }

    private void ws() {
            r3 = this;
            com.bytedance.adsdk.lottie.model.layer.tl r0 = r3.cw
            java.util.List r0 = r0.r()
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 != 0) goto L44
            com.bytedance.adsdk.lottie.j.xt.r r0 = new com.bytedance.adsdk.lottie.j.xt.r
            com.bytedance.adsdk.lottie.model.layer.tl r2 = r3.cw
            java.util.List r2 = r2.r()
            r0.<init>(r2)
            r3.f1842x = r0
            r0.j()
            com.bytedance.adsdk.lottie.j.xt.r r0 = r3.f1842x
            com.bytedance.adsdk.lottie.model.layer.cw$1 r2 = new com.bytedance.adsdk.lottie.model.layer.cw$1
            r2.<init>(r3)
            r0.j(r2)
            com.bytedance.adsdk.lottie.j.xt.r r0 = r3.f1842x
            java.lang.Object r0 = r0.ae()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r2 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L3a
            goto L3b
        L3a:
            r1 = 0
        L3b:
            r3.xt(r1)
            com.bytedance.adsdk.lottie.j.xt.r r0 = r3.f1842x
            r3.j(r0)
            return
        L44:
            r3.xt(r1)
            return
    }

    private void xt(android.graphics.Canvas r3, android.graphics.Matrix r4, com.bytedance.adsdk.lottie.j.xt.j<com.bytedance.adsdk.lottie.model.xt.ws, android.graphics.Path> r5, com.bytedance.adsdk.lottie.j.xt.j<java.lang.Integer, java.lang.Integer> r6) {
            r2 = this;
            android.graphics.RectF r0 = r2.i
            android.graphics.Paint r1 = r2.vl
            com.bytedance.adsdk.lottie.up.g.j(r3, r0, r1)
            android.graphics.RectF r0 = r2.i
            android.graphics.Paint r1 = r2.vl
            r3.drawRect(r0, r1)
            java.lang.Object r5 = r5.ae()
            android.graphics.Path r5 = (android.graphics.Path) r5
            android.graphics.Path r0 = r2.g
            r0.set(r5)
            android.graphics.Path r5 = r2.g
            r5.transform(r4)
            android.graphics.Paint r4 = r2.vl
            java.lang.Object r5 = r6.ae()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            float r5 = (float) r5
            r6 = 1076048691(0x40233333, float:2.55)
            float r5 = r5 * r6
            int r5 = (int) r5
            r4.setAlpha(r5)
            android.graphics.Path r4 = r2.g
            android.graphics.Paint r5 = r2.ws
            r3.drawPath(r4, r5)
            r3.restore()
            return
    }

    private void xt(android.graphics.RectF r5, android.graphics.Matrix r6) {
            r4 = this;
            boolean r0 = r4.up()
            if (r0 != 0) goto L7
            goto L2b
        L7:
            com.bytedance.adsdk.lottie.model.layer.tl r0 = r4.cw
            com.bytedance.adsdk.lottie.model.layer.tl$xt r0 = r0.vl()
            com.bytedance.adsdk.lottie.model.layer.tl$xt r1 = com.bytedance.adsdk.lottie.model.layer.tl.xt.cw
            if (r0 != r1) goto L12
            goto L2b
        L12:
            android.graphics.RectF r0 = r4.kt
            r1 = 0
            r0.set(r1, r1, r1, r1)
            com.bytedance.adsdk.lottie.model.layer.cw r0 = r4.ch
            android.graphics.RectF r2 = r4.kt
            r3 = 1
            r0.j(r2, r6, r3)
            android.graphics.RectF r6 = r4.kt
            boolean r6 = r5.intersect(r6)
            if (r6 != 0) goto L2b
            r5.set(r1, r1, r1, r1)
        L2b:
            return
    }

    private void xt(boolean r2) {
            r1 = this;
            boolean r0 = r1.f1837p
            if (r2 == r0) goto L9
            r1.f1837p = r2
            r1.az()
        L9:
            return
    }

    public java.lang.String ae() {
            r1 = this;
            com.bytedance.adsdk.lottie.model.layer.tl r0 = r1.cw
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.ae()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public void cw() {
            r1 = this;
            r0 = 1
            r1.tl = r0
            return
    }

    boolean g() {
            r1 = this;
            com.bytedance.adsdk.lottie.j.xt.tl r0 = r1.f1840v
            if (r0 == 0) goto L10
            java.util.List r0 = r0.xt()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.adsdk.lottie.j.xt.j.InterfaceC0184j
    public void j() {
            r0 = this;
            r0.az()
            return
    }

    void j(@com.bytedance.component.sdk.annotation.FloatRange(from = 0.0d, to = 1.0d) float r4) {
            r3 = this;
            com.bytedance.adsdk.lottie.j.xt.av r0 = r3.f1838r
            r0.j(r4)
            com.bytedance.adsdk.lottie.j.xt.tl r0 = r3.f1840v
            r1 = 0
            if (r0 == 0) goto L29
            r0 = 0
        Lb:
            com.bytedance.adsdk.lottie.j.xt.tl r2 = r3.f1840v
            java.util.List r2 = r2.xt()
            int r2 = r2.size()
            if (r0 >= r2) goto L29
            com.bytedance.adsdk.lottie.j.xt.tl r2 = r3.f1840v
            java.util.List r2 = r2.xt()
            java.lang.Object r2 = r2.get(r0)
            com.bytedance.adsdk.lottie.j.xt.j r2 = (com.bytedance.adsdk.lottie.j.xt.j) r2
            r2.j(r4)
            int r0 = r0 + 1
            goto Lb
        L29:
            com.bytedance.adsdk.lottie.j.xt.r r0 = r3.f1842x
            if (r0 == 0) goto L30
            r0.j(r4)
        L30:
            com.bytedance.adsdk.lottie.model.layer.cw r0 = r3.ch
            if (r0 == 0) goto L37
            r0.j(r4)
        L37:
            java.util.List<com.bytedance.adsdk.lottie.j.xt.j<?, ?>> r0 = r3.f1835l
            int r0 = r0.size()
            if (r1 >= r0) goto L4d
            java.util.List<com.bytedance.adsdk.lottie.j.xt.j<?, ?>> r0 = r3.f1835l
            java.lang.Object r0 = r0.get(r1)
            com.bytedance.adsdk.lottie.j.xt.j r0 = (com.bytedance.adsdk.lottie.j.xt.j) r0
            r0.j(r4)
            int r1 = r1 + 1
            goto L37
        L4d:
            return
    }

    protected void j(int r3) {
            r2 = this;
            com.bytedance.adsdk.lottie.j.xt.av r0 = r2.f1838r
            com.bytedance.adsdk.lottie.j.xt.j r0 = r0.j()
            if (r0 == 0) goto L19
            com.bytedance.adsdk.lottie.j.xt.av r0 = r2.f1838r
            com.bytedance.adsdk.lottie.j.xt.j r0 = r0.j()
            java.lang.Object r0 = r0.ae()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L1b
        L19:
            r0 = 100
        L1b:
            float r0 = (float) r0
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r1
            float r3 = (float) r3
            r1 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 / r1
            float r0 = r0 * r3
            r2.rn = r0
            return
    }

    @Override // com.bytedance.adsdk.lottie.j.j.up
    public void j(android.graphics.Canvas r7, android.graphics.Matrix r8, int r9) {
            r6 = this;
            java.lang.String r0 = r6.f
            com.bytedance.adsdk.lottie.up.j(r0)
            boolean r0 = r6.f1837p
            if (r0 == 0) goto L1bf
            com.bytedance.adsdk.lottie.model.layer.tl r0 = r6.cw
            boolean r0 = r0.f()
            if (r0 == 0) goto L13
            goto L1bf
        L13:
            r6.i()
            java.lang.String r0 = "Layer#parentMatrix"
            com.bytedance.adsdk.lottie.up.j(r0)
            android.graphics.Matrix r1 = r6.gq
            r1.set(r8)
            android.graphics.Matrix r1 = r6.oq
            r1.reset()
            android.graphics.Matrix r1 = r6.oq
            r1.set(r8)
            java.util.List<com.bytedance.adsdk.lottie.model.layer.cw> r1 = r6.a
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L32:
            if (r1 < 0) goto L4a
            android.graphics.Matrix r2 = r6.oq
            java.util.List<com.bytedance.adsdk.lottie.model.layer.cw> r3 = r6.a
            java.lang.Object r3 = r3.get(r1)
            com.bytedance.adsdk.lottie.model.layer.cw r3 = (com.bytedance.adsdk.lottie.model.layer.cw) r3
            com.bytedance.adsdk.lottie.j.xt.av r3 = r3.f1838r
            android.graphics.Matrix r3 = r3.r()
            r2.preConcat(r3)
            int r1 = r1 + (-1)
            goto L32
        L4a:
            com.bytedance.adsdk.lottie.up.xt(r0)
            com.bytedance.adsdk.lottie.j.xt.av r0 = r6.f1838r
            com.bytedance.adsdk.lottie.j.xt.j r0 = r0.j()
            if (r0 == 0) goto L62
            java.lang.Object r0 = r0.ae()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L62
            int r0 = r0.intValue()
            goto L64
        L62:
            r0 = 100
        L64:
            float r9 = (float) r9
            r1 = 1132396544(0x437f0000, float:255.0)
            float r9 = r9 / r1
            float r0 = (float) r0
            float r9 = r9 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r9 = r9 / r0
            float r9 = r9 * r1
            int r9 = (int) r9
            boolean r0 = r6.up()
            java.lang.String r1 = "Layer#drawLayer"
            if (r0 != 0) goto L9f
            boolean r0 = r6.g()
            if (r0 != 0) goto L9f
            android.graphics.Matrix r8 = r6.oq
            com.bytedance.adsdk.lottie.j.xt.av r0 = r6.f1838r
            android.graphics.Matrix r0 = r0.r()
            r8.preConcat(r0)
            com.bytedance.adsdk.lottie.up.j(r1)
            android.graphics.Matrix r8 = r6.oq
            r6.xt(r7, r8, r9)
            com.bytedance.adsdk.lottie.up.xt(r1)
            java.lang.String r7 = r6.f
            float r7 = com.bytedance.adsdk.lottie.up.xt(r7)
            r6.cw(r7)
            return
        L9f:
            java.lang.String r0 = "Layer#computeBounds"
            com.bytedance.adsdk.lottie.up.j(r0)
            android.graphics.RectF r2 = r6.i
            android.graphics.Matrix r3 = r6.oq
            r4 = 0
            r6.j(r2, r3, r4)
            android.graphics.RectF r2 = r6.i
            r6.xt(r2, r8)
            android.graphics.Matrix r2 = r6.oq
            com.bytedance.adsdk.lottie.j.xt.av r3 = r6.f1838r
            android.graphics.Matrix r3 = r3.r()
            r2.preConcat(r3)
            android.graphics.RectF r2 = r6.i
            android.graphics.Matrix r3 = r6.oq
            r6.j(r2, r3)
            android.graphics.RectF r2 = r6.f1841w
            int r3 = r7.getWidth()
            float r3 = (float) r3
            int r4 = r7.getHeight()
            float r4 = (float) r4
            r5 = 0
            r2.set(r5, r5, r3, r4)
            android.graphics.Matrix r2 = r6.qv
            r7.getMatrix(r2)
            android.graphics.Matrix r2 = r6.qv
            boolean r2 = r2.isIdentity()
            if (r2 != 0) goto Lec
            android.graphics.Matrix r2 = r6.qv
            r2.invert(r2)
            android.graphics.Matrix r2 = r6.qv
            android.graphics.RectF r3 = r6.f1841w
            r2.mapRect(r3)
        Lec:
            android.graphics.RectF r2 = r6.i
            android.graphics.RectF r3 = r6.f1841w
            boolean r2 = r2.intersect(r3)
            if (r2 != 0) goto Lfb
            android.graphics.RectF r2 = r6.i
            r2.set(r5, r5, r5, r5)
        Lfb:
            com.bytedance.adsdk.lottie.up.xt(r0)
            android.graphics.RectF r0 = r6.i
            float r0 = r0.width()
            r2 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L17c
            android.graphics.RectF r0 = r6.i
            float r0 = r0.height()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L17c
            java.lang.String r0 = "Layer#saveLayer"
            com.bytedance.adsdk.lottie.up.j(r0)
            android.graphics.Paint r2 = r6.vl
            r3 = 255(0xff, float:3.57E-43)
            r2.setAlpha(r3)
            android.graphics.RectF r2 = r6.i
            android.graphics.Paint r3 = r6.vl
            com.bytedance.adsdk.lottie.up.g.j(r7, r2, r3)
            com.bytedance.adsdk.lottie.up.xt(r0)
            r6.j(r7)
            com.bytedance.adsdk.lottie.up.j(r1)
            android.graphics.Matrix r2 = r6.oq
            r6.xt(r7, r2, r9)
            com.bytedance.adsdk.lottie.up.xt(r1)
            boolean r1 = r6.g()
            if (r1 == 0) goto L143
            android.graphics.Matrix r1 = r6.oq
            r6.j(r7, r1)
        L143:
            boolean r1 = r6.up()
            java.lang.String r2 = "Layer#restoreLayer"
            if (r1 == 0) goto L173
            java.lang.String r1 = "Layer#drawMatte"
            com.bytedance.adsdk.lottie.up.j(r1)
            com.bytedance.adsdk.lottie.up.j(r0)
            android.graphics.RectF r3 = r6.i
            android.graphics.Paint r4 = r6.az
            r5 = 19
            com.bytedance.adsdk.lottie.up.g.j(r7, r3, r4, r5)
            com.bytedance.adsdk.lottie.up.xt(r0)
            r6.j(r7)
            com.bytedance.adsdk.lottie.model.layer.cw r0 = r6.ch
            r0.j(r7, r8, r9)
            com.bytedance.adsdk.lottie.up.j(r2)
            r7.restore()
            com.bytedance.adsdk.lottie.up.xt(r2)
            com.bytedance.adsdk.lottie.up.xt(r1)
        L173:
            com.bytedance.adsdk.lottie.up.j(r2)
            r7.restore()
            com.bytedance.adsdk.lottie.up.xt(r2)
        L17c:
            boolean r8 = r6.h
            if (r8 == 0) goto L1b5
            android.graphics.Paint r8 = r6.la
            if (r8 == 0) goto L1b5
            android.graphics.Paint$Style r9 = android.graphics.Paint.Style.STROKE
            r8.setStyle(r9)
            android.graphics.Paint r8 = r6.la
            r9 = -251901(0xfffffffffffc2803, float:NaN)
            r8.setColor(r9)
            android.graphics.Paint r8 = r6.la
            r9 = 1082130432(0x40800000, float:4.0)
            r8.setStrokeWidth(r9)
            android.graphics.RectF r8 = r6.i
            android.graphics.Paint r9 = r6.la
            r7.drawRect(r8, r9)
            android.graphics.Paint r8 = r6.la
            android.graphics.Paint$Style r9 = android.graphics.Paint.Style.FILL
            r8.setStyle(r9)
            android.graphics.Paint r8 = r6.la
            r9 = 1357638635(0x50ebebeb, float:3.1664855E10)
            r8.setColor(r9)
            android.graphics.RectF r8 = r6.i
            android.graphics.Paint r9 = r6.la
            r7.drawRect(r8, r9)
        L1b5:
            java.lang.String r7 = r6.f
            float r7 = com.bytedance.adsdk.lottie.up.xt(r7)
            r6.cw(r7)
            return
        L1bf:
            java.lang.String r7 = r6.f
            com.bytedance.adsdk.lottie.up.xt(r7)
            return
    }

    @Override // com.bytedance.adsdk.lottie.j.j.up
    public void j(android.graphics.RectF r2, android.graphics.Matrix r3, boolean r4) {
            r1 = this;
            android.graphics.RectF r2 = r1.i
            r0 = 0
            r2.set(r0, r0, r0, r0)
            r1.i()
            android.graphics.Matrix r2 = r1.j
            r2.set(r3)
            if (r4 == 0) goto L41
            java.util.List<com.bytedance.adsdk.lottie.model.layer.cw> r2 = r1.a
            if (r2 == 0) goto L32
            int r2 = r2.size()
            int r2 = r2 + (-1)
        L1a:
            if (r2 < 0) goto L41
            android.graphics.Matrix r3 = r1.j
            java.util.List<com.bytedance.adsdk.lottie.model.layer.cw> r4 = r1.a
            java.lang.Object r4 = r4.get(r2)
            com.bytedance.adsdk.lottie.model.layer.cw r4 = (com.bytedance.adsdk.lottie.model.layer.cw) r4
            com.bytedance.adsdk.lottie.j.xt.av r4 = r4.f1838r
            android.graphics.Matrix r4 = r4.r()
            r3.preConcat(r4)
            int r2 = r2 + (-1)
            goto L1a
        L32:
            com.bytedance.adsdk.lottie.model.layer.cw r2 = r1.f1839s
            if (r2 == 0) goto L41
            android.graphics.Matrix r3 = r1.j
            com.bytedance.adsdk.lottie.j.xt.av r2 = r2.f1838r
            android.graphics.Matrix r2 = r2.r()
            r3.preConcat(r2)
        L41:
            android.graphics.Matrix r2 = r1.j
            com.bytedance.adsdk.lottie.j.xt.av r3 = r1.f1838r
            android.graphics.Matrix r3 = r3.r()
            r2.preConcat(r3)
            return
    }

    public void j(com.bytedance.adsdk.lottie.j.xt.j<?, ?> r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            java.util.List<com.bytedance.adsdk.lottie.j.xt.j<?, ?>> r0 = r1.f1835l
            r0.add(r2)
            return
    }

    void j(com.bytedance.adsdk.lottie.model.layer.cw r1) {
            r0 = this;
            r0.ch = r1
            return
    }

    public void j(java.lang.Runnable r2) {
            r1 = this;
            android.os.Handler r0 = r1.ae
            r0.post(r2)
            return
    }

    @Override // com.bytedance.adsdk.lottie.j.j.cw
    public void j(java.util.List<com.bytedance.adsdk.lottie.j.j.cw> r1, java.util.List<com.bytedance.adsdk.lottie.j.j.cw> r2) {
            r0 = this;
            return
    }

    void j(boolean r2) {
            r1 = this;
            if (r2 == 0) goto Ld
            android.graphics.Paint r0 = r1.la
            if (r0 != 0) goto Ld
            com.bytedance.adsdk.lottie.j.j r0 = new com.bytedance.adsdk.lottie.j.j
            r0.<init>()
            r1.la = r0
        Ld:
            r1.h = r2
            return
    }

    public com.bytedance.adsdk.lottie.r.oq jy() {
            r1 = this;
            com.bytedance.adsdk.lottie.model.layer.tl r0 = r1.cw
            com.bytedance.adsdk.lottie.r.oq r0 = r0.x()
            return r0
    }

    public android.graphics.Matrix m() {
            r1 = this;
            android.graphics.Matrix r0 = r1.gq
            return r0
    }

    public boolean oq() {
            r1 = this;
            boolean r0 = r1.f1837p
            return r0
    }

    public java.lang.String qv() {
            r1 = this;
            com.bytedance.adsdk.lottie.model.layer.tl r0 = r1.cw
            java.lang.String r0 = r0.m()
            return r0
    }

    com.bytedance.adsdk.lottie.model.layer.tl r() {
            r1 = this;
            com.bytedance.adsdk.lottie.model.layer.tl r0 = r1.cw
            return r0
    }

    public float tl() {
            r1 = this;
            float r0 = r1.rn
            return r0
    }

    boolean up() {
            r1 = this;
            com.bytedance.adsdk.lottie.model.layer.cw r0 = r1.ch
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public com.bytedance.adsdk.lottie.model.xt.j vl() {
            r1 = this;
            com.bytedance.adsdk.lottie.model.layer.tl r0 = r1.cw
            com.bytedance.adsdk.lottie.model.xt.j r0 = r0.v()
            return r0
    }

    public android.graphics.BlurMaskFilter xt(float r4) {
            r3 = this;
            float r0 = r3.up
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L9
            android.graphics.BlurMaskFilter r4 = r3.f1836m
            return r4
        L9:
            android.graphics.BlurMaskFilter r0 = new android.graphics.BlurMaskFilter
            r1 = 1073741824(0x40000000, float:2.0)
            float r1 = r4 / r1
            android.graphics.BlurMaskFilter$Blur r2 = android.graphics.BlurMaskFilter.Blur.NORMAL
            r0.<init>(r1, r2)
            r3.f1836m = r0
            r3.up = r4
            return r0
    }

    public void xt(android.graphics.Canvas r1, android.graphics.Matrix r2, int r3) {
            r0 = this;
            r0.j(r3)
            return
    }

    void xt(com.bytedance.adsdk.lottie.model.layer.cw r1) {
            r0 = this;
            r0.f1839s = r1
            return
    }

    public boolean xt() {
            r1 = this;
            boolean r0 = r1.tl
            return r0
    }
}
