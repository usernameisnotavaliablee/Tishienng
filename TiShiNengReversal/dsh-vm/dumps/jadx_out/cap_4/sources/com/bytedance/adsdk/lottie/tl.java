package com.bytedance.adsdk.lottie;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class tl extends android.graphics.drawable.Drawable implements android.graphics.drawable.Animatable, android.graphics.drawable.Drawable.Callback {
    private final android.graphics.Matrix a;
    private boolean ae;
    private java.util.Map<java.lang.String, android.graphics.Typeface> av;
    private com.bytedance.adsdk.lottie.xt.j az;
    private android.graphics.Matrix c;
    private com.bytedance.adsdk.lottie.mi ch;
    com.bytedance.adsdk.lottie.kt cw;
    private android.graphics.RectF ed;
    private boolean f;
    private com.bytedance.adsdk.lottie.tl.xt g;
    private android.graphics.Paint gq;
    private android.graphics.Matrix gx;
    private android.graphics.Rect h;
    private boolean i;
    java.lang.String j;
    private java.lang.String jy;
    private com.bytedance.adsdk.lottie.model.layer.r kt;

    /* renamed from: l, reason: collision with root package name */
    private android.graphics.Bitmap f1887l;
    private android.graphics.RectF la;

    /* renamed from: m, reason: collision with root package name */
    private boolean f1888m;
    private boolean mi;

    /* renamed from: n, reason: collision with root package name */
    private com.bytedance.adsdk.lottie.tj f1889n;
    private com.bytedance.adsdk.lottie.LottieAnimationView nd;
    private final java.util.ArrayList<com.bytedance.adsdk.lottie.tl.j> oq;

    /* renamed from: p, reason: collision with root package name */
    private android.graphics.Canvas f1890p;
    private final android.animation.ValueAnimator.AnimatorUpdateListener qv;

    /* renamed from: r, reason: collision with root package name */
    private com.bytedance.adsdk.lottie.m f1891r;
    private boolean rh;
    private android.graphics.Rect rn;

    /* renamed from: s, reason: collision with root package name */
    private boolean f1892s;
    private int tj;
    private boolean tl;
    private android.graphics.RectF uf;
    private final com.bytedance.adsdk.lottie.up.m up;

    /* renamed from: v, reason: collision with root package name */
    private boolean f1893v;
    private com.bytedance.adsdk.lottie.xt.xt vl;

    /* renamed from: w, reason: collision with root package name */
    private boolean f1894w;
    private android.graphics.Rect wq;
    private com.bytedance.adsdk.lottie.r ws;

    /* renamed from: x, reason: collision with root package name */
    private boolean f1895x;
    com.bytedance.adsdk.lottie.cw xt;














    private interface j {
        void j(com.bytedance.adsdk.lottie.m r1);
    }

    private enum xt extends java.lang.Enum<com.bytedance.adsdk.lottie.tl.xt> {
        public static final com.bytedance.adsdk.lottie.tl.xt cw = null;
        public static final com.bytedance.adsdk.lottie.tl.xt j = null;

        /* renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ com.bytedance.adsdk.lottie.tl.xt[] f1896r = null;
        public static final com.bytedance.adsdk.lottie.tl.xt xt = null;

        static {
                com.bytedance.adsdk.lottie.tl$xt r0 = new com.bytedance.adsdk.lottie.tl$xt
                java.lang.String r1 = "NONE"
                r2 = 0
                r0.<init>(r1, r2)
                com.bytedance.adsdk.lottie.tl.xt.j = r0
                com.bytedance.adsdk.lottie.tl$xt r1 = new com.bytedance.adsdk.lottie.tl$xt
                java.lang.String r3 = "PLAY"
                r4 = 1
                r1.<init>(r3, r4)
                com.bytedance.adsdk.lottie.tl.xt.xt = r1
                com.bytedance.adsdk.lottie.tl$xt r3 = new com.bytedance.adsdk.lottie.tl$xt
                java.lang.String r5 = "RESUME"
                r6 = 2
                r3.<init>(r5, r6)
                com.bytedance.adsdk.lottie.tl.xt.cw = r3
                r5 = 3
                com.bytedance.adsdk.lottie.tl$xt[] r5 = new com.bytedance.adsdk.lottie.tl.xt[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.bytedance.adsdk.lottie.tl.xt.f1896r = r5
                return
        }

        xt(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.bytedance.adsdk.lottie.tl.xt valueOf(java.lang.String r1) {
                java.lang.Class<com.bytedance.adsdk.lottie.tl$xt> r0 = com.bytedance.adsdk.lottie.tl.xt.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.bytedance.adsdk.lottie.tl$xt r1 = (com.bytedance.adsdk.lottie.tl.xt) r1
                return r1
        }

        public static com.bytedance.adsdk.lottie.tl.xt[] values() {
                com.bytedance.adsdk.lottie.tl$xt[] r0 = com.bytedance.adsdk.lottie.tl.xt.f1896r
                java.lang.Object r0 = r0.clone()
                com.bytedance.adsdk.lottie.tl$xt[] r0 = (com.bytedance.adsdk.lottie.tl.xt[]) r0
                return r0
        }
    }

    public tl(com.bytedance.adsdk.lottie.LottieAnimationView r5) {
            r4 = this;
            r4.<init>()
            com.bytedance.adsdk.lottie.up.m r0 = new com.bytedance.adsdk.lottie.up.m
            r0.<init>()
            r4.up = r0
            r1 = 1
            r4.f1888m = r1
            r2 = 0
            r4.ae = r2
            r4.tl = r2
            com.bytedance.adsdk.lottie.tl$xt r3 = com.bytedance.adsdk.lottie.tl.xt.j
            r4.g = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4.oq = r3
            com.bytedance.adsdk.lottie.tl$1 r3 = new com.bytedance.adsdk.lottie.tl$1
            r3.<init>(r4)
            r4.qv = r3
            r4.f1894w = r2
            r4.mi = r1
            r1 = 255(0xff, float:3.57E-43)
            r4.tj = r1
            com.bytedance.adsdk.lottie.mi r1 = com.bytedance.adsdk.lottie.mi.j
            r4.ch = r1
            r4.f1892s = r2
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r4.a = r1
            r4.rh = r2
            r4.nd = r5
            r0.addUpdateListener(r3)
            return
    }

    private boolean c() {
            r3 = this;
            android.graphics.drawable.Drawable$Callback r0 = r3.getCallback()
            boolean r1 = r0 instanceof android.view.View
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            android.view.View r0 = (android.view.View) r0
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L1e
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            boolean r0 = r0.getClipChildren()
            if (r0 != 0) goto L1e
            r0 = 1
            return r0
        L1e:
            return r2
    }

    private void ed() {
            r1 = this;
            android.graphics.Canvas r0 = r1.f1890p
            if (r0 == 0) goto L5
            return
        L5:
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>()
            r1.f1890p = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1.ed = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1.c = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1.gx = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.h = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1.la = r0
            com.bytedance.adsdk.lottie.j.j r0 = new com.bytedance.adsdk.lottie.j.j
            r0.<init>()
            r1.gq = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.rn = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.wq = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1.uf = r0
            return
    }

    private android.content.Context getContext() {
            r3 = this;
            android.graphics.drawable.Drawable$Callback r0 = r3.getCallback()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L13
            android.view.View r0 = (android.view.View) r0
            android.content.Context r0 = r0.getContext()
            return r0
        L13:
            return r1
    }

    private void gq() {
            r4 = this;
            com.bytedance.adsdk.lottie.m r0 = r4.f1891r
            if (r0 != 0) goto L5
            return
        L5:
            com.bytedance.adsdk.lottie.mi r1 = r4.ch
            int r2 = android.os.Build.VERSION.SDK_INT
            boolean r3 = r0.j()
            int r0 = r0.xt()
            boolean r0 = r1.j(r2, r3, r0)
            r4.f1892s = r0
            return
    }

    static /* synthetic */ com.bytedance.adsdk.lottie.model.layer.r j(com.bytedance.adsdk.lottie.tl r0) {
            com.bytedance.adsdk.lottie.model.layer.r r0 = r0.kt
            return r0
    }

    private void j(android.content.Context r7) {
            r6 = this;
            com.bytedance.adsdk.lottie.m r4 = r6.f1891r
            if (r4 != 0) goto L5
            return
        L5:
            com.bytedance.adsdk.lottie.model.layer.r r0 = r6.kt
            if (r0 == 0) goto Lc
            r6.j(r0)
        Lc:
            com.bytedance.adsdk.lottie.model.layer.r r0 = new com.bytedance.adsdk.lottie.model.layer.r
            com.bytedance.adsdk.lottie.model.layer.tl r2 = com.bytedance.adsdk.lottie.r.f.j(r4)
            java.util.List r3 = r4.ws()
            r1 = r6
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r1.kt = r0
            boolean r7 = r1.f1893v
            if (r7 == 0) goto L25
            r7 = 1
            r0.j(r7)
        L25:
            com.bytedance.adsdk.lottie.model.layer.r r7 = r1.kt
            boolean r0 = r1.mi
            r7.xt(r0)
            return
    }

    private void j(android.graphics.Canvas r6) {
            r5 = this;
            com.bytedance.adsdk.lottie.model.layer.r r0 = r5.kt
            com.bytedance.adsdk.lottie.m r1 = r5.f1891r
            if (r0 == 0) goto L4d
            if (r1 != 0) goto L9
            goto L4d
        L9:
            android.graphics.Matrix r2 = r5.a
            r2.reset()
            android.graphics.Rect r2 = r5.getBounds()
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L46
            int r3 = r2.width()
            float r3 = (float) r3
            android.graphics.Rect r4 = r1.r()
            int r4 = r4.width()
            float r4 = (float) r4
            float r3 = r3 / r4
            int r4 = r2.height()
            float r4 = (float) r4
            android.graphics.Rect r1 = r1.r()
            int r1 = r1.height()
            float r1 = (float) r1
            float r4 = r4 / r1
            android.graphics.Matrix r1 = r5.a
            r1.preScale(r3, r4)
            android.graphics.Matrix r1 = r5.a
            int r3 = r2.left
            float r3 = (float) r3
            int r2 = r2.top
            float r2 = (float) r2
            r1.preTranslate(r3, r2)
        L46:
            android.graphics.Matrix r1 = r5.a
            int r2 = r5.tj
            r0.j(r6, r1, r2)
        L4d:
            return
    }

    private void j(android.graphics.Canvas r9, com.bytedance.adsdk.lottie.model.layer.r r10) {
            r8 = this;
            com.bytedance.adsdk.lottie.m r0 = r8.f1891r
            if (r0 == 0) goto Lf7
            if (r10 != 0) goto L8
            goto Lf7
        L8:
            r8.ed()
            android.graphics.Matrix r0 = r8.c
            r9.getMatrix(r0)
            android.graphics.Rect r0 = r8.h
            r9.getClipBounds(r0)
            android.graphics.Rect r0 = r8.h
            android.graphics.RectF r1 = r8.la
            r8.j(r0, r1)
            android.graphics.Matrix r0 = r8.c
            android.graphics.RectF r1 = r8.la
            r0.mapRect(r1)
            android.graphics.RectF r0 = r8.la
            android.graphics.Rect r1 = r8.h
            r8.j(r0, r1)
            boolean r0 = r8.mi
            r1 = 0
            if (r0 == 0) goto L40
            android.graphics.RectF r0 = r8.ed
            int r2 = r8.getIntrinsicWidth()
            float r2 = (float) r2
            int r3 = r8.getIntrinsicHeight()
            float r3 = (float) r3
            r4 = 0
            r0.set(r4, r4, r2, r3)
            goto L46
        L40:
            android.graphics.RectF r0 = r8.ed
            r2 = 0
            r10.j(r0, r2, r1)
        L46:
            android.graphics.Matrix r0 = r8.c
            android.graphics.RectF r2 = r8.ed
            r0.mapRect(r2)
            android.graphics.Rect r0 = r8.getBounds()
            int r2 = r0.width()
            float r2 = (float) r2
            int r3 = r8.getIntrinsicWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            int r0 = r0.height()
            float r0 = (float) r0
            int r3 = r8.getIntrinsicHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            android.graphics.RectF r3 = r8.ed
            r8.j(r3, r2, r0)
            boolean r3 = r8.c()
            if (r3 != 0) goto L85
            android.graphics.RectF r3 = r8.ed
            android.graphics.Rect r4 = r8.h
            int r5 = r4.left
            float r5 = (float) r5
            int r6 = r4.top
            float r6 = (float) r6
            int r7 = r4.right
            float r7 = (float) r7
            int r4 = r4.bottom
            float r4 = (float) r4
            r3.intersect(r5, r6, r7, r4)
        L85:
            android.graphics.RectF r3 = r8.ed
            float r3 = r3.width()
            double r3 = (double) r3
            double r3 = java.lang.Math.ceil(r3)
            int r3 = (int) r3
            android.graphics.RectF r4 = r8.ed
            float r4 = r4.height()
            double r4 = (double) r4
            double r4 = java.lang.Math.ceil(r4)
            int r4 = (int) r4
            if (r3 == 0) goto Lf7
            if (r4 != 0) goto La2
            goto Lf7
        La2:
            r8.xt(r3, r4)
            boolean r5 = r8.rh
            if (r5 == 0) goto Le7
            android.graphics.Matrix r5 = r8.a
            android.graphics.Matrix r6 = r8.c
            r5.set(r6)
            android.graphics.Matrix r5 = r8.a
            r5.preScale(r2, r0)
            android.graphics.Matrix r0 = r8.a
            android.graphics.RectF r2 = r8.ed
            float r5 = r2.left
            float r5 = -r5
            float r2 = r2.top
            float r2 = -r2
            r0.postTranslate(r5, r2)
            android.graphics.Bitmap r0 = r8.f1887l
            r0.eraseColor(r1)
            android.graphics.Canvas r0 = r8.f1890p
            android.graphics.Matrix r2 = r8.a
            int r5 = r8.tj
            r10.j(r0, r2, r5)
            android.graphics.Matrix r10 = r8.c
            android.graphics.Matrix r0 = r8.gx
            r10.invert(r0)
            android.graphics.Matrix r10 = r8.gx
            android.graphics.RectF r0 = r8.uf
            android.graphics.RectF r2 = r8.ed
            r10.mapRect(r0, r2)
            android.graphics.RectF r10 = r8.uf
            android.graphics.Rect r0 = r8.wq
            r8.j(r10, r0)
        Le7:
            android.graphics.Rect r10 = r8.rn
            r10.set(r1, r1, r3, r4)
            android.graphics.Bitmap r10 = r8.f1887l
            android.graphics.Rect r0 = r8.rn
            android.graphics.Rect r1 = r8.wq
            android.graphics.Paint r2 = r8.gq
            r9.drawBitmap(r10, r0, r1, r2)
        Lf7:
            return
    }

    private void j(android.graphics.Rect r4, android.graphics.RectF r5) {
            r3 = this;
            int r0 = r4.left
            float r0 = (float) r0
            int r1 = r4.top
            float r1 = (float) r1
            int r2 = r4.right
            float r2 = (float) r2
            int r4 = r4.bottom
            float r4 = (float) r4
            r5.set(r0, r1, r2, r4)
            return
    }

    private void j(android.graphics.RectF r4, float r5, float r6) {
            r3 = this;
            float r0 = r4.left
            float r0 = r0 * r5
            float r1 = r4.top
            float r1 = r1 * r6
            float r2 = r4.right
            float r2 = r2 * r5
            float r5 = r4.bottom
            float r5 = r5 * r6
            r4.set(r0, r1, r2, r5)
            return
    }

    private void j(android.graphics.RectF r6, android.graphics.Rect r7) {
            r5 = this;
            float r0 = r6.left
            double r0 = (double) r0
            double r0 = java.lang.Math.floor(r0)
            int r0 = (int) r0
            float r1 = r6.top
            double r1 = (double) r1
            double r1 = java.lang.Math.floor(r1)
            int r1 = (int) r1
            float r2 = r6.right
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            float r6 = r6.bottom
            double r3 = (double) r6
            double r3 = java.lang.Math.ceil(r3)
            int r6 = (int) r3
            r7.set(r0, r1, r2, r6)
            return
    }

    private void j(com.bytedance.adsdk.lottie.model.layer.r r3) {
            r2 = this;
            if (r3 == 0) goto L2b
            r3.cw()
            java.util.List r3 = r3.ws()
            if (r3 == 0) goto L2b
            java.util.Iterator r3 = r3.iterator()
        Lf:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r3.next()
            com.bytedance.adsdk.lottie.model.layer.cw r0 = (com.bytedance.adsdk.lottie.model.layer.cw) r0
            boolean r1 = r0 instanceof com.bytedance.adsdk.lottie.model.layer.r
            if (r1 == 0) goto L25
            com.bytedance.adsdk.lottie.model.layer.r r0 = (com.bytedance.adsdk.lottie.model.layer.r) r0
            r2.j(r0)
            goto Lf
        L25:
            if (r0 == 0) goto Lf
            r0.cw()
            goto Lf
        L2b:
            return
    }

    private boolean rn() {
            r1 = this;
            boolean r0 = r1.f1888m
            if (r0 != 0) goto Lb
            boolean r0 = r1.ae
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }

    private com.bytedance.adsdk.lottie.xt.j uf() {
            r3 = this;
            android.graphics.drawable.Drawable$Callback r0 = r3.getCallback()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            com.bytedance.adsdk.lottie.xt.j r0 = r3.az
            if (r0 != 0) goto L20
            com.bytedance.adsdk.lottie.xt.j r0 = new com.bytedance.adsdk.lottie.xt.j
            android.graphics.drawable.Drawable$Callback r1 = r3.getCallback()
            com.bytedance.adsdk.lottie.cw r2 = r3.xt
            r0.<init>(r1, r2)
            r3.az = r0
            java.lang.String r1 = r3.j
            if (r1 == 0) goto L20
            r0.j(r1)
        L20:
            com.bytedance.adsdk.lottie.xt.j r0 = r3.az
            return r0
    }

    private com.bytedance.adsdk.lottie.xt.xt wq() {
            r5 = this;
            com.bytedance.adsdk.lottie.xt.xt r0 = r5.vl
            if (r0 == 0) goto L11
            android.content.Context r1 = r5.getContext()
            boolean r0 = r0.j(r1)
            if (r0 != 0) goto L11
            r0 = 0
            r5.vl = r0
        L11:
            com.bytedance.adsdk.lottie.xt.xt r0 = r5.vl
            if (r0 != 0) goto L2a
            com.bytedance.adsdk.lottie.xt.xt r0 = new com.bytedance.adsdk.lottie.xt.xt
            android.graphics.drawable.Drawable$Callback r1 = r5.getCallback()
            java.lang.String r2 = r5.jy
            com.bytedance.adsdk.lottie.r r3 = r5.ws
            com.bytedance.adsdk.lottie.m r4 = r5.f1891r
            java.util.Map r4 = r4.i()
            r0.<init>(r1, r2, r3, r4)
            r5.vl = r0
        L2a:
            com.bytedance.adsdk.lottie.xt.xt r0 = r5.vl
            return r0
    }

    static /* synthetic */ com.bytedance.adsdk.lottie.up.m xt(com.bytedance.adsdk.lottie.tl r0) {
            com.bytedance.adsdk.lottie.up.m r0 = r0.up
            return r0
    }

    private void xt(int r4, int r5) {
            r3 = this;
            android.graphics.Bitmap r0 = r3.f1887l
            r1 = 1
            if (r0 == 0) goto L37
            int r0 = r0.getWidth()
            if (r0 < r4) goto L37
            android.graphics.Bitmap r0 = r3.f1887l
            int r0 = r0.getHeight()
            if (r0 >= r5) goto L14
            goto L37
        L14:
            android.graphics.Bitmap r0 = r3.f1887l
            int r0 = r0.getWidth()
            if (r0 > r4) goto L26
            android.graphics.Bitmap r0 = r3.f1887l
            int r0 = r0.getHeight()
            if (r0 <= r5) goto L25
            goto L26
        L25:
            return
        L26:
            android.graphics.Bitmap r0 = r3.f1887l
            r2 = 0
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r0, r2, r2, r4, r5)
            r3.f1887l = r4
            android.graphics.Canvas r5 = r3.f1890p
            r5.setBitmap(r4)
            r3.rh = r1
            return
        L37:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r0)
            r3.f1887l = r4
            android.graphics.Canvas r5 = r3.f1890p
            r5.setBitmap(r4)
            r3.rh = r1
            return
    }

    public com.bytedance.adsdk.lottie.m a() {
            r1 = this;
            com.bytedance.adsdk.lottie.m r0 = r1.f1891r
            return r0
    }

    public com.bytedance.adsdk.lottie.mi ae() {
            r1 = this;
            boolean r0 = r1.f1892s
            if (r0 == 0) goto L7
            com.bytedance.adsdk.lottie.mi r0 = com.bytedance.adsdk.lottie.mi.cw
            return r0
        L7:
            com.bytedance.adsdk.lottie.mi r0 = com.bytedance.adsdk.lottie.mi.xt
            return r0
    }

    public void ae(java.lang.String r2) {
            r1 = this;
            r1.j = r2
            com.bytedance.adsdk.lottie.xt.j r0 = r1.uf()
            if (r0 == 0) goto Lb
            r0.j(r2)
        Lb:
            return
    }

    public void ae(boolean r1) {
            r0 = this;
            r0.ae = r1
            return
    }

    public float av() {
            r1 = this;
            com.bytedance.adsdk.lottie.up.m r0 = r1.up
            float r0 = r0.av()
            return r0
    }

    public float az() {
            r1 = this;
            com.bytedance.adsdk.lottie.up.m r0 = r1.up
            float r0 = r0.az()
            return r0
    }

    public com.bytedance.adsdk.lottie.kt ch() {
            r1 = this;
            com.bytedance.adsdk.lottie.kt r0 = r1.cw
            return r0
    }

    public com.bytedance.adsdk.lottie.model.layer.r cw() {
            r1 = this;
            com.bytedance.adsdk.lottie.model.layer.r r0 = r1.kt
            return r0
    }

    public void cw(float r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.up.m r0 = r1.up
            r0.cw(r2)
            return
    }

    public void cw(int r3) {
            r2 = this;
            com.bytedance.adsdk.lottie.m r0 = r2.f1891r
            if (r0 != 0) goto Lf
            java.util.ArrayList<com.bytedance.adsdk.lottie.tl$j> r0 = r2.oq
            com.bytedance.adsdk.lottie.tl$4 r1 = new com.bytedance.adsdk.lottie.tl$4
            r1.<init>(r2, r3)
            r0.add(r1)
            return
        Lf:
            com.bytedance.adsdk.lottie.up.m r0 = r2.up
            float r3 = (float) r3
            r0.j(r3)
            return
    }

    public void cw(java.lang.String r4) {
            r3 = this;
            com.bytedance.adsdk.lottie.m r0 = r3.f1891r
            if (r0 != 0) goto Lf
            java.util.ArrayList<com.bytedance.adsdk.lottie.tl$j> r0 = r3.oq
            com.bytedance.adsdk.lottie.tl$13 r1 = new com.bytedance.adsdk.lottie.tl$13
            r1.<init>(r3, r4)
            r0.add(r1)
            return
        Lf:
            com.bytedance.adsdk.lottie.model.m r0 = r0.cw(r4)
            if (r0 == 0) goto L1f
            float r4 = r0.j
            float r0 = r0.xt
            float r4 = r4 + r0
            int r4 = (int) r4
            r3.xt(r4)
            return
        L1f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot find marker with name "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = "."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public void cw(boolean r2) {
            r1 = this;
            r1.f = r2
            com.bytedance.adsdk.lottie.m r0 = r1.f1891r
            if (r0 == 0) goto L9
            r0.xt(r2)
        L9:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r3) {
            r2 = this;
            java.lang.String r0 = "Drawable#draw"
            com.bytedance.adsdk.lottie.up.j(r0)
            boolean r1 = r2.f1892s     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L11
            com.bytedance.adsdk.lottie.model.layer.r r1 = r2.kt     // Catch: java.lang.Throwable -> Lf
            r2.j(r3, r1)     // Catch: java.lang.Throwable -> Lf
            goto L1a
        Lf:
            r3 = move-exception
            goto L15
        L11:
            r2.j(r3)     // Catch: java.lang.Throwable -> Lf
            goto L1a
        L15:
            java.lang.String r1 = "Lottie crashed in draw!"
            com.bytedance.adsdk.lottie.up.up.xt(r1, r3)
        L1a:
            r3 = 0
            r2.rh = r3
            com.bytedance.adsdk.lottie.up.xt(r0)
            return
    }

    public int f() {
            r1 = this;
            com.bytedance.adsdk.lottie.up.m r0 = r1.up
            int r0 = r0.getRepeatCount()
            return r0
    }

    public com.bytedance.adsdk.lottie.w g() {
            r1 = this;
            com.bytedance.adsdk.lottie.m r0 = r1.f1891r
            if (r0 == 0) goto L9
            com.bytedance.adsdk.lottie.w r0 = r0.cw()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
            r1 = this;
            int r0 = r1.tj
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            com.bytedance.adsdk.lottie.m r0 = r1.f1891r
            if (r0 != 0) goto L6
            r0 = -1
            return r0
        L6:
            android.graphics.Rect r0 = r0.r()
            int r0 = r0.height()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            com.bytedance.adsdk.lottie.m r0 = r1.f1891r
            if (r0 != 0) goto L6
            r0 = -1
            return r0
        L6:
            android.graphics.Rect r0 = r0.r()
            int r0 = r0.width()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    @com.bytedance.component.sdk.annotation.FloatRange(from = 0.0d, to = 1.0d)
    public float h() {
            r1 = this;
            com.bytedance.adsdk.lottie.up.m r0 = r1.up
            float r0 = r0.m()
            return r0
    }

    public float i() {
            r1 = this;
            com.bytedance.adsdk.lottie.up.m r0 = r1.up
            float r0 = r0.oq()
            return r0
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            android.graphics.drawable.Drawable$Callback r1 = r0.getCallback()
            if (r1 != 0) goto L7
            return
        L7:
            r1.invalidateDrawable(r0)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
            r1 = this;
            boolean r0 = r1.rh
            if (r0 == 0) goto L5
            goto L11
        L5:
            r0 = 1
            r1.rh = r0
            android.graphics.drawable.Drawable$Callback r0 = r1.getCallback()
            if (r0 == 0) goto L11
            r0.invalidateDrawable(r1)
        L11:
            return
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
            r1 = this;
            boolean r0 = r1.v()
            return r0
    }

    public android.graphics.Bitmap j(java.lang.String r2, android.graphics.Bitmap r3) {
            r1 = this;
            com.bytedance.adsdk.lottie.xt.xt r0 = r1.wq()
            if (r0 != 0) goto Ld
            java.lang.String r2 = "Cannot update bitmap. Most likely the drawable is not added to a View which prevents Lottie from getting a Context."
            com.bytedance.adsdk.lottie.up.up.xt(r2)
            r2 = 0
            return r2
        Ld:
            android.graphics.Bitmap r2 = r0.j(r2, r3)
            r1.invalidateSelf()
            return r2
    }

    @com.bytedance.component.sdk.annotation.RestrictTo({com.bytedance.component.sdk.annotation.RestrictTo.Scope.LIBRARY})
    public android.graphics.Typeface j(com.bytedance.adsdk.lottie.model.cw r4) {
            r3 = this;
            java.util.Map<java.lang.String, android.graphics.Typeface> r0 = r3.av
            if (r0 == 0) goto L4f
            java.lang.String r1 = r4.j()
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L15
            java.lang.Object r4 = r0.get(r1)
            android.graphics.Typeface r4 = (android.graphics.Typeface) r4
            return r4
        L15:
            java.lang.String r1 = r4.xt()
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L26
            java.lang.Object r4 = r0.get(r1)
            android.graphics.Typeface r4 = (android.graphics.Typeface) r4
            return r4
        L26:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r4.j()
            r1.append(r2)
            java.lang.String r2 = "-"
            r1.append(r2)
            java.lang.String r2 = r4.cw()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L4f
            java.lang.Object r4 = r0.get(r1)
            android.graphics.Typeface r4 = (android.graphics.Typeface) r4
            return r4
        L4f:
            com.bytedance.adsdk.lottie.xt.j r0 = r3.uf()
            if (r0 == 0) goto L5a
            android.graphics.Typeface r4 = r0.j(r4)
            return r4
        L5a:
            r4 = 0
            return r4
    }

    public com.bytedance.adsdk.lottie.tj j() {
            r1 = this;
            com.bytedance.adsdk.lottie.tj r0 = r1.f1889n
            return r0
    }

    public void j(float r3) {
            r2 = this;
            com.bytedance.adsdk.lottie.m r0 = r2.f1891r
            if (r0 != 0) goto Lf
            java.util.ArrayList<com.bytedance.adsdk.lottie.tl$j> r0 = r2.oq
            com.bytedance.adsdk.lottie.tl$9 r1 = new com.bytedance.adsdk.lottie.tl$9
            r1.<init>(r2, r3)
            r0.add(r1)
            return
        Lf:
            float r0 = r0.m()
            com.bytedance.adsdk.lottie.m r1 = r2.f1891r
            float r1 = r1.ae()
            float r3 = com.bytedance.adsdk.lottie.up.tl.j(r0, r1, r3)
            int r3 = (int) r3
            r2.j(r3)
            return
    }

    public void j(int r3) {
            r2 = this;
            com.bytedance.adsdk.lottie.m r0 = r2.f1891r
            if (r0 != 0) goto Lf
            java.util.ArrayList<com.bytedance.adsdk.lottie.tl$j> r0 = r2.oq
            com.bytedance.adsdk.lottie.tl$8 r1 = new com.bytedance.adsdk.lottie.tl$8
            r1.<init>(r2, r3)
            r0.add(r1)
            return
        Lf:
            com.bytedance.adsdk.lottie.up.m r0 = r2.up
            r0.j(r3)
            return
    }

    public void j(int r3, int r4) {
            r2 = this;
            com.bytedance.adsdk.lottie.m r0 = r2.f1891r
            if (r0 != 0) goto Lf
            java.util.ArrayList<com.bytedance.adsdk.lottie.tl$j> r0 = r2.oq
            com.bytedance.adsdk.lottie.tl$3 r1 = new com.bytedance.adsdk.lottie.tl$3
            r1.<init>(r2, r3, r4)
            r0.add(r1)
            return
        Lf:
            com.bytedance.adsdk.lottie.up.m r0 = r2.up
            float r3 = (float) r3
            float r4 = (float) r4
            r1 = 1065185444(0x3f7d70a4, float:0.99)
            float r4 = r4 + r1
            r0.j(r3, r4)
            return
    }

    public void j(android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.up.m r0 = r1.up
            r0.addListener(r2)
            return
    }

    public void j(android.animation.ValueAnimator.AnimatorUpdateListener r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.up.m r0 = r1.up
            r0.addUpdateListener(r2)
            return
    }

    public void j(com.bytedance.adsdk.lottie.cw r2) {
            r1 = this;
            r1.xt = r2
            com.bytedance.adsdk.lottie.xt.j r0 = r1.az
            if (r0 == 0) goto L9
            r0.j(r2)
        L9:
            return
    }

    public void j(com.bytedance.adsdk.lottie.kt r1) {
            r0 = this;
            r0.cw = r1
            return
    }

    public void j(com.bytedance.adsdk.lottie.mi r1) {
            r0 = this;
            r0.ch = r1
            r0.gq()
            return
    }

    public void j(com.bytedance.adsdk.lottie.r r2) {
            r1 = this;
            r1.ws = r2
            com.bytedance.adsdk.lottie.xt.xt r0 = r1.vl
            if (r0 == 0) goto L9
            r0.j(r2)
        L9:
            return
    }

    public void j(com.bytedance.adsdk.lottie.tj r1) {
            r0 = this;
            r0.f1889n = r1
            return
    }

    public void j(java.lang.Boolean r1) {
            r0 = this;
            boolean r1 = r1.booleanValue()
            r0.f1888m = r1
            return
    }

    public void j(java.lang.String r1) {
            r0 = this;
            r0.jy = r1
            return
    }

    public void j(java.util.Map<java.lang.String, android.graphics.Typeface> r2) {
            r1 = this;
            java.util.Map<java.lang.String, android.graphics.Typeface> r0 = r1.av
            if (r2 != r0) goto L5
            return
        L5:
            r1.av = r2
            r1.invalidateSelf()
            return
    }

    public void j(boolean r2) {
            r1 = this;
            boolean r0 = r1.mi
            if (r2 == r0) goto L10
            r1.mi = r2
            com.bytedance.adsdk.lottie.model.layer.r r0 = r1.kt
            if (r0 == 0) goto Ld
            r0.xt(r2)
        Ld:
            r1.invalidateSelf()
        L10:
            return
    }

    public void j(boolean r2, android.content.Context r3) {
            r1 = this;
            boolean r0 = r1.i
            if (r0 != r2) goto L5
            goto Le
        L5:
            r1.i = r2
            com.bytedance.adsdk.lottie.m r2 = r1.f1891r
            if (r2 == 0) goto Le
            r1.j(r3)
        Le:
            return
    }

    public boolean j(com.bytedance.adsdk.lottie.m r3, android.content.Context r4) {
            r2 = this;
            com.bytedance.adsdk.lottie.m r0 = r2.f1891r
            if (r0 != r3) goto L6
            r3 = 0
            return r3
        L6:
            r0 = 1
            r2.rh = r0
            r2.qv()
            r2.f1891r = r3
            r2.j(r4)
            com.bytedance.adsdk.lottie.up.m r4 = r2.up
            r4.j(r3)
            com.bytedance.adsdk.lottie.up.m r4 = r2.up
            float r4 = r4.getAnimatedFraction()
            r2.r(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.ArrayList<com.bytedance.adsdk.lottie.tl$j> r1 = r2.oq
            r4.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        L2a:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r4.next()
            com.bytedance.adsdk.lottie.tl$j r1 = (com.bytedance.adsdk.lottie.tl.j) r1
            if (r1 == 0) goto L3b
            r1.j(r3)
        L3b:
            r4.remove()
            goto L2a
        L3f:
            java.util.ArrayList<com.bytedance.adsdk.lottie.tl$j> r4 = r2.oq
            r4.clear()
            boolean r4 = r2.f
            r3.xt(r4)
            r2.gq()
            android.graphics.drawable.Drawable$Callback r3 = r2.getCallback()
            boolean r4 = r3 instanceof android.widget.ImageView
            if (r4 == 0) goto L5d
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r4 = 0
            r3.setImageDrawable(r4)
            r3.setImageDrawable(r2)
        L5d:
            return r0
    }

    @com.bytedance.component.sdk.annotation.MainThread
    public void jy() {
            r1 = this;
            java.util.ArrayList<com.bytedance.adsdk.lottie.tl$j> r0 = r1.oq
            r0.clear()
            com.bytedance.adsdk.lottie.up.m r0 = r1.up
            r0.vl()
            boolean r0 = r1.isVisible()
            if (r0 != 0) goto L14
            com.bytedance.adsdk.lottie.tl$xt r0 = com.bytedance.adsdk.lottie.tl.xt.j
            r1.g = r0
        L14:
            return
    }

    public int kt() {
            r1 = this;
            com.bytedance.adsdk.lottie.up.m r0 = r1.up
            float r0 = r0.ae()
            int r0 = (int) r0
            return r0
    }

    public void l() {
            r1 = this;
            java.util.ArrayList<com.bytedance.adsdk.lottie.tl$j> r0 = r1.oq
            r0.clear()
            com.bytedance.adsdk.lottie.up.m r0 = r1.up
            r0.cancel()
            boolean r0 = r1.isVisible()
            if (r0 != 0) goto L14
            com.bytedance.adsdk.lottie.tl$xt r0 = com.bytedance.adsdk.lottie.tl.xt.j
            r1.g = r0
        L14:
            return
    }

    public android.graphics.RectF la() {
            r1 = this;
            android.graphics.RectF r0 = r1.ed
            return r0
    }

    public com.bytedance.adsdk.lottie.g m(java.lang.String r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.m r0 = r1.f1891r
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.util.Map r0 = r0.i()
            java.lang.Object r2 = r0.get(r2)
            com.bytedance.adsdk.lottie.g r2 = (com.bytedance.adsdk.lottie.g) r2
            return r2
    }

    public void m(boolean r1) {
            r0 = this;
            r0.tl = r1
            return
    }

    public boolean m() {
            r1 = this;
            boolean r0 = r1.f1894w
            return r0
    }

    public void mi() {
            r1 = this;
            com.bytedance.adsdk.lottie.up.m r0 = r1.up
            r0.removeAllListeners()
            return
    }

    public boolean oq() {
            r1 = this;
            boolean r0 = r1.f1895x
            return r0
    }

    public void p() {
            r1 = this;
            java.util.ArrayList<com.bytedance.adsdk.lottie.tl$j> r0 = r1.oq
            r0.clear()
            com.bytedance.adsdk.lottie.up.m r0 = r1.up
            r0.jy()
            boolean r0 = r1.isVisible()
            if (r0 != 0) goto L14
            com.bytedance.adsdk.lottie.tl$xt r0 = com.bytedance.adsdk.lottie.tl.xt.j
            r1.g = r0
        L14:
            return
    }

    public void qv() {
            r2 = this;
            com.bytedance.adsdk.lottie.up.m r0 = r2.up
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L17
            com.bytedance.adsdk.lottie.up.m r0 = r2.up
            r0.cancel()
            boolean r0 = r2.isVisible()
            if (r0 != 0) goto L17
            com.bytedance.adsdk.lottie.tl$xt r0 = com.bytedance.adsdk.lottie.tl.xt.j
            r2.g = r0
        L17:
            r0 = 0
            r2.f1891r = r0
            com.bytedance.adsdk.lottie.model.layer.r r1 = r2.kt
            if (r1 == 0) goto L21
            r2.j(r1)
        L21:
            r2.kt = r0
            r2.vl = r0
            com.bytedance.adsdk.lottie.up.m r0 = r2.up
            r0.tl()
            r2.invalidateSelf()
            return
    }

    public void r(@com.bytedance.component.sdk.annotation.FloatRange(from = 0.0d, to = 1.0d) float r4) {
            r3 = this;
            com.bytedance.adsdk.lottie.m r0 = r3.f1891r
            if (r0 != 0) goto Lf
            java.util.ArrayList<com.bytedance.adsdk.lottie.tl$j> r0 = r3.oq
            com.bytedance.adsdk.lottie.tl$5 r1 = new com.bytedance.adsdk.lottie.tl$5
            r1.<init>(r3, r4)
            r0.add(r1)
            return
        Lf:
            java.lang.String r0 = "Drawable#setProgress"
            com.bytedance.adsdk.lottie.up.j(r0)
            com.bytedance.adsdk.lottie.up.m r1 = r3.up
            com.bytedance.adsdk.lottie.m r2 = r3.f1891r
            float r4 = r2.j(r4)
            r1.j(r4)
            com.bytedance.adsdk.lottie.up.xt(r0)
            return
    }

    public void r(int r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.up.m r0 = r1.up
            r0.setRepeatMode(r2)
            return
    }

    public void r(java.lang.String r4) {
            r3 = this;
            com.bytedance.adsdk.lottie.m r0 = r3.f1891r
            if (r0 != 0) goto Lf
            java.util.ArrayList<com.bytedance.adsdk.lottie.tl$j> r0 = r3.oq
            com.bytedance.adsdk.lottie.tl$2 r1 = new com.bytedance.adsdk.lottie.tl$2
            r1.<init>(r3, r4)
            r0.add(r1)
            return
        Lf:
            com.bytedance.adsdk.lottie.model.m r0 = r0.cw(r4)
            if (r0 == 0) goto L20
            float r4 = r0.j
            int r4 = (int) r4
            float r0 = r0.xt
            int r0 = (int) r0
            int r0 = r0 + r4
            r3.j(r4, r0)
            return
        L20:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot find marker with name "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = "."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public void r(boolean r2) {
            r1 = this;
            boolean r0 = r1.f1893v
            if (r0 != r2) goto L5
            goto Le
        L5:
            r1.f1893v = r2
            com.bytedance.adsdk.lottie.model.layer.r r0 = r1.kt
            if (r0 == 0) goto Le
            r0.j(r2)
        Le:
            return
    }

    public boolean r() {
            r1 = this;
            boolean r0 = r1.mi
            return r0
    }

    public boolean s() {
            r1 = this;
            java.util.Map<java.lang.String, android.graphics.Typeface> r0 = r1.av
            if (r0 != 0) goto L16
            com.bytedance.adsdk.lottie.kt r0 = r1.cw
            if (r0 != 0) goto L16
            com.bytedance.adsdk.lottie.m r0 = r1.f1891r
            android.util.SparseArray r0 = r0.az()
            int r0 = r0.size()
            if (r0 <= 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2, long r3) {
            r0 = this;
            android.graphics.drawable.Drawable$Callback r1 = r0.getCallback()
            if (r1 != 0) goto L7
            return
        L7:
            r1.scheduleDrawable(r0, r2, r3)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@com.bytedance.component.sdk.annotation.IntRange(from = 0, to = 255) int r1) {
            r0 = this;
            r0.tj = r1
            r0.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r1) {
            r0 = this;
            java.lang.String r1 = "Use addColorFilter instead."
            com.bytedance.adsdk.lottie.up.up.xt(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean r2, boolean r3) {
            r1 = this;
            boolean r0 = r1.isVisible()
            boolean r3 = super.setVisible(r2, r3)
            if (r2 == 0) goto L1c
            com.bytedance.adsdk.lottie.tl$xt r2 = r1.g
            com.bytedance.adsdk.lottie.tl$xt r0 = com.bytedance.adsdk.lottie.tl.xt.xt
            if (r2 != r0) goto L14
            r1.vl()
            return r3
        L14:
            com.bytedance.adsdk.lottie.tl$xt r0 = com.bytedance.adsdk.lottie.tl.xt.cw
            if (r2 != r0) goto L32
            r1.ws()
            return r3
        L1c:
            com.bytedance.adsdk.lottie.up.m r2 = r1.up
            boolean r2 = r2.isRunning()
            if (r2 == 0) goto L2c
            r1.p()
            com.bytedance.adsdk.lottie.tl$xt r2 = com.bytedance.adsdk.lottie.tl.xt.cw
            r1.g = r2
            return r3
        L2c:
            if (r0 == 0) goto L32
            com.bytedance.adsdk.lottie.tl$xt r2 = com.bytedance.adsdk.lottie.tl.xt.j
            r1.g = r2
        L32:
            return r3
    }

    @Override // android.graphics.drawable.Animatable
    @com.bytedance.component.sdk.annotation.MainThread
    public void start() {
            r2 = this;
            android.graphics.drawable.Drawable$Callback r0 = r2.getCallback()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L11
            android.view.View r0 = (android.view.View) r0
            boolean r0 = r0.isInEditMode()
            if (r0 == 0) goto L11
            return
        L11:
            r2.vl()
            return
    }

    @Override // android.graphics.drawable.Animatable
    @com.bytedance.component.sdk.annotation.MainThread
    public void stop() {
            r0 = this;
            r0.jy()
            return
    }

    @android.annotation.SuppressLint({"WrongConstant"})
    public int tj() {
            r1 = this;
            com.bytedance.adsdk.lottie.up.m r0 = r1.up
            int r0 = r0.getRepeatMode()
            return r0
    }

    public void tl(boolean r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.up.m r0 = r1.up
            r0.cw(r2)
            return
    }

    public boolean tl() {
            r1 = this;
            boolean r0 = r1.f1892s
            return r0
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2) {
            r0 = this;
            android.graphics.drawable.Drawable$Callback r1 = r0.getCallback()
            if (r1 != 0) goto L7
            return
        L7:
            r1.unscheduleDrawable(r0, r2)
            return
    }

    public android.graphics.Bitmap up(java.lang.String r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.xt.xt r0 = r1.wq()
            if (r0 == 0) goto Lb
            android.graphics.Bitmap r2 = r0.j(r2)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public java.lang.String up() {
            r1 = this;
            java.lang.String r0 = r1.jy
            return r0
    }

    public void up(int r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.up.m r0 = r1.up
            r0.setRepeatCount(r2)
            return
    }

    public void up(boolean r1) {
            r0 = this;
            r0.f1895x = r1
            return
    }

    public boolean v() {
            r1 = this;
            com.bytedance.adsdk.lottie.up.m r0 = r1.up
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            boolean r0 = r0.isRunning()
            return r0
    }

    @com.bytedance.component.sdk.annotation.MainThread
    public void vl() {
            r2 = this;
            com.bytedance.adsdk.lottie.model.layer.r r0 = r2.kt
            if (r0 != 0) goto Lf
            java.util.ArrayList<com.bytedance.adsdk.lottie.tl$j> r0 = r2.oq
            com.bytedance.adsdk.lottie.tl$6 r1 = new com.bytedance.adsdk.lottie.tl$6
            r1.<init>(r2)
            r0.add(r1)
            return
        Lf:
            r2.gq()
            boolean r0 = r2.rn()
            if (r0 != 0) goto L1e
            int r0 = r2.f()
            if (r0 != 0) goto L32
        L1e:
            boolean r0 = r2.isVisible()
            if (r0 == 0) goto L2e
            com.bytedance.adsdk.lottie.up.m r0 = r2.up
            r0.qv()
            com.bytedance.adsdk.lottie.tl$xt r0 = com.bytedance.adsdk.lottie.tl.xt.j
            r2.g = r0
            goto L32
        L2e:
            com.bytedance.adsdk.lottie.tl$xt r0 = com.bytedance.adsdk.lottie.tl.xt.xt
            r2.g = r0
        L32:
            boolean r0 = r2.rn()
            if (r0 != 0) goto L5d
            float r0 = r2.i()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L46
            float r0 = r2.az()
            goto L4a
        L46:
            float r0 = r2.av()
        L4a:
            int r0 = (int) r0
            r2.cw(r0)
            com.bytedance.adsdk.lottie.up.m r0 = r2.up
            r0.vl()
            boolean r0 = r2.isVisible()
            if (r0 != 0) goto L5d
            com.bytedance.adsdk.lottie.tl$xt r0 = com.bytedance.adsdk.lottie.tl.xt.j
            r2.g = r0
        L5d:
            return
    }

    public void w() {
            r2 = this;
            com.bytedance.adsdk.lottie.up.m r0 = r2.up
            r0.removeAllUpdateListeners()
            com.bytedance.adsdk.lottie.up.m r0 = r2.up
            android.animation.ValueAnimator$AnimatorUpdateListener r1 = r2.qv
            r0.addUpdateListener(r1)
            return
    }

    @com.bytedance.component.sdk.annotation.MainThread
    public void ws() {
            r2 = this;
            com.bytedance.adsdk.lottie.model.layer.r r0 = r2.kt
            if (r0 != 0) goto Lf
            java.util.ArrayList<com.bytedance.adsdk.lottie.tl$j> r0 = r2.oq
            com.bytedance.adsdk.lottie.tl$7 r1 = new com.bytedance.adsdk.lottie.tl$7
            r1.<init>(r2)
            r0.add(r1)
            return
        Lf:
            r2.gq()
            boolean r0 = r2.rn()
            if (r0 != 0) goto L1e
            int r0 = r2.f()
            if (r0 != 0) goto L32
        L1e:
            boolean r0 = r2.isVisible()
            if (r0 == 0) goto L2e
            com.bytedance.adsdk.lottie.up.m r0 = r2.up
            r0.ws()
            com.bytedance.adsdk.lottie.tl$xt r0 = com.bytedance.adsdk.lottie.tl.xt.j
            r2.g = r0
            goto L32
        L2e:
            com.bytedance.adsdk.lottie.tl$xt r0 = com.bytedance.adsdk.lottie.tl.xt.cw
            r2.g = r0
        L32:
            boolean r0 = r2.rn()
            if (r0 != 0) goto L5d
            float r0 = r2.i()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L46
            float r0 = r2.az()
            goto L4a
        L46:
            float r0 = r2.av()
        L4a:
            int r0 = (int) r0
            r2.cw(r0)
            com.bytedance.adsdk.lottie.up.m r0 = r2.up
            r0.vl()
            boolean r0 = r2.isVisible()
            if (r0 != 0) goto L5d
            com.bytedance.adsdk.lottie.tl$xt r0 = com.bytedance.adsdk.lottie.tl.xt.j
            r2.g = r0
        L5d:
            return
    }

    boolean x() {
            r2 = this;
            boolean r0 = r2.isVisible()
            if (r0 == 0) goto Ld
            com.bytedance.adsdk.lottie.up.m r0 = r2.up
            boolean r0 = r0.isRunning()
            return r0
        Ld:
            com.bytedance.adsdk.lottie.tl$xt r0 = r2.g
            com.bytedance.adsdk.lottie.tl$xt r1 = com.bytedance.adsdk.lottie.tl.xt.xt
            if (r0 == r1) goto L1a
            com.bytedance.adsdk.lottie.tl$xt r1 = com.bytedance.adsdk.lottie.tl.xt.cw
            if (r0 != r1) goto L18
            goto L1a
        L18:
            r0 = 0
            return r0
        L1a:
            r0 = 1
            return r0
    }

    public com.bytedance.adsdk.lottie.LottieAnimationView xt() {
            r1 = this;
            com.bytedance.adsdk.lottie.LottieAnimationView r0 = r1.nd
            return r0
    }

    public void xt(@com.bytedance.component.sdk.annotation.FloatRange(from = 0.0d, to = 1.0d) float r4) {
            r3 = this;
            com.bytedance.adsdk.lottie.m r0 = r3.f1891r
            if (r0 != 0) goto Lf
            java.util.ArrayList<com.bytedance.adsdk.lottie.tl$j> r0 = r3.oq
            com.bytedance.adsdk.lottie.tl$11 r1 = new com.bytedance.adsdk.lottie.tl$11
            r1.<init>(r3, r4)
            r0.add(r1)
            return
        Lf:
            com.bytedance.adsdk.lottie.up.m r1 = r3.up
            float r0 = r0.m()
            com.bytedance.adsdk.lottie.m r2 = r3.f1891r
            float r2 = r2.ae()
            float r4 = com.bytedance.adsdk.lottie.up.tl.j(r0, r2, r4)
            r1.xt(r4)
            return
    }

    public void xt(int r3) {
            r2 = this;
            com.bytedance.adsdk.lottie.m r0 = r2.f1891r
            if (r0 != 0) goto Lf
            java.util.ArrayList<com.bytedance.adsdk.lottie.tl$j> r0 = r2.oq
            com.bytedance.adsdk.lottie.tl$10 r1 = new com.bytedance.adsdk.lottie.tl$10
            r1.<init>(r2, r3)
            r0.add(r1)
            return
        Lf:
            com.bytedance.adsdk.lottie.up.m r0 = r2.up
            float r3 = (float) r3
            r1 = 1065185444(0x3f7d70a4, float:0.99)
            float r3 = r3 + r1
            r0.xt(r3)
            return
    }

    public void xt(android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.up.m r0 = r1.up
            r0.removeListener(r2)
            return
    }

    public void xt(android.animation.ValueAnimator.AnimatorUpdateListener r2) {
            r1 = this;
            com.bytedance.adsdk.lottie.up.m r0 = r1.up
            r0.removeUpdateListener(r2)
            return
    }

    public void xt(java.lang.String r4) {
            r3 = this;
            com.bytedance.adsdk.lottie.m r0 = r3.f1891r
            if (r0 != 0) goto Lf
            java.util.ArrayList<com.bytedance.adsdk.lottie.tl$j> r0 = r3.oq
            com.bytedance.adsdk.lottie.tl$12 r1 = new com.bytedance.adsdk.lottie.tl$12
            r1.<init>(r3, r4)
            r0.add(r1)
            return
        Lf:
            com.bytedance.adsdk.lottie.model.m r0 = r0.cw(r4)
            if (r0 == 0) goto L1c
            float r4 = r0.j
            int r4 = (int) r4
            r3.j(r4)
            return
        L1c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot find marker with name "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = "."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public void xt(boolean r1) {
            r0 = this;
            r0.f1894w = r1
            return
    }
}
