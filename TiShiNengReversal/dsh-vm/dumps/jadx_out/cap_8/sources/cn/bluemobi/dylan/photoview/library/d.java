package cn.bluemobi.dylan.photoview.library;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d implements cn.bluemobi.dylan.photoview.library.c, android.view.View.OnTouchListener, cn.bluemobi.dylan.photoview.library.gestures.e, android.view.ViewTreeObserver.OnGlobalLayoutListener {
    private static final java.lang.String B = "PhotoViewAttacher";
    private static final boolean C = false;
    static final android.view.animation.Interpolator D = null;
    static final int E = -1;
    static final int F = 0;
    static final int G = 1;
    static final int H = 2;
    private android.widget.ImageView.ScaleType A;
    int a;

    /* renamed from: b, reason: collision with root package name */
    private float f164b;

    /* renamed from: c, reason: collision with root package name */
    private float f165c;

    /* renamed from: d, reason: collision with root package name */
    private float f166d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f167e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f168f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.ref.WeakReference<android.widget.ImageView> f169g;

    /* renamed from: h, reason: collision with root package name */
    private android.view.GestureDetector f170h;

    /* renamed from: i, reason: collision with root package name */
    private cn.bluemobi.dylan.photoview.library.gestures.d f171i;

    /* renamed from: j, reason: collision with root package name */
    private final android.graphics.Matrix f172j;

    /* renamed from: k, reason: collision with root package name */
    private final android.graphics.Matrix f173k;
    private final android.graphics.Matrix l;
    private final android.graphics.RectF m;
    private final float[] n;
    private cn.bluemobi.dylan.photoview.library.d.e o;
    private cn.bluemobi.dylan.photoview.library.d.f p;
    private cn.bluemobi.dylan.photoview.library.d.h q;
    private android.view.View.OnLongClickListener r;
    private cn.bluemobi.dylan.photoview.library.d.g s;
    private int t;
    private int u;
    private int v;
    private int w;
    private cn.bluemobi.dylan.photoview.library.d.RunnableC0003d x;
    private int y;
    private boolean z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends android.view.GestureDetector.SimpleOnGestureListener {
        final /* synthetic */ cn.bluemobi.dylan.photoview.library.d a;

        a(cn.bluemobi.dylan.photoview.library.d r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(android.view.MotionEvent r2) {
                r1 = this;
                cn.bluemobi.dylan.photoview.library.d r2 = r1.a
                android.view.View$OnLongClickListener r2 = cn.bluemobi.dylan.photoview.library.d.i(r2)
                if (r2 == 0) goto L17
                cn.bluemobi.dylan.photoview.library.d r2 = r1.a
                android.view.View$OnLongClickListener r2 = cn.bluemobi.dylan.photoview.library.d.i(r2)
                cn.bluemobi.dylan.photoview.library.d r0 = r1.a
                android.widget.ImageView r0 = r0.u()
                r2.onLongClick(r0)
            L17:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class b {
        static final /* synthetic */ int[] a = null;

        static {
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                cn.bluemobi.dylan.photoview.library.d.b.a = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = cn.bluemobi.dylan.photoview.library.d.b.a     // Catch: java.lang.NoSuchFieldError -> L1d
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = cn.bluemobi.dylan.photoview.library.d.b.a     // Catch: java.lang.NoSuchFieldError -> L28
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = cn.bluemobi.dylan.photoview.library.d.b.a     // Catch: java.lang.NoSuchFieldError -> L33
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = cn.bluemobi.dylan.photoview.library.d.b.a     // Catch: java.lang.NoSuchFieldError -> L3e
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class c implements java.lang.Runnable {
        private final float a;

        /* renamed from: b, reason: collision with root package name */
        private final float f174b;

        /* renamed from: c, reason: collision with root package name */
        private final long f175c;

        /* renamed from: d, reason: collision with root package name */
        private final float f176d;

        /* renamed from: e, reason: collision with root package name */
        private final float f177e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ cn.bluemobi.dylan.photoview.library.d f178f;

        public c(cn.bluemobi.dylan.photoview.library.d r1, float r2, float r3, float r4, float r5) {
                r0 = this;
                r0.f178f = r1
                r0.<init>()
                r0.a = r4
                r0.f174b = r5
                long r4 = java.lang.System.currentTimeMillis()
                r0.f175c = r4
                r0.f176d = r2
                r0.f177e = r3
                return
        }

        private float a() {
                r4 = this;
                long r0 = java.lang.System.currentTimeMillis()
                long r2 = r4.f175c
                long r0 = r0 - r2
                float r0 = (float) r0
                r1 = 1065353216(0x3f800000, float:1.0)
                float r0 = r0 * r1
                cn.bluemobi.dylan.photoview.library.d r2 = r4.f178f
                int r2 = r2.a
                float r2 = (float) r2
                float r0 = r0 / r2
                float r0 = java.lang.Math.min(r1, r0)
                android.view.animation.Interpolator r1 = cn.bluemobi.dylan.photoview.library.d.D
                float r0 = r1.getInterpolation(r0)
                return r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r6 = this;
                cn.bluemobi.dylan.photoview.library.d r0 = r6.f178f
                android.widget.ImageView r0 = r0.u()
                if (r0 != 0) goto L9
                goto L2e
            L9:
                float r1 = r6.a()
                float r2 = r6.f176d
                float r3 = r6.f177e
                float r3 = r3 - r2
                float r3 = r3 * r1
                float r2 = r2 + r3
                cn.bluemobi.dylan.photoview.library.d r3 = r6.f178f
                float r3 = r3.getScale()
                float r2 = r2 / r3
                cn.bluemobi.dylan.photoview.library.d r3 = r6.f178f
                float r4 = r6.a
                float r5 = r6.f174b
                r3.f(r2, r4, r5)
                r2 = 1065353216(0x3f800000, float:1.0)
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 >= 0) goto L2e
                cn.bluemobi.dylan.photoview.library.a.d(r0, r6)
            L2e:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: cn.bluemobi.dylan.photoview.library.d$d, reason: collision with other inner class name */
    private class RunnableC0003d implements java.lang.Runnable {
        private final cn.bluemobi.dylan.photoview.library.scrollerproxy.d a;

        /* renamed from: b, reason: collision with root package name */
        private int f179b;

        /* renamed from: c, reason: collision with root package name */
        private int f180c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ cn.bluemobi.dylan.photoview.library.d f181d;

        public RunnableC0003d(cn.bluemobi.dylan.photoview.library.d r1, android.content.Context r2) {
                r0 = this;
                r0.f181d = r1
                r0.<init>()
                cn.bluemobi.dylan.photoview.library.scrollerproxy.d r1 = cn.bluemobi.dylan.photoview.library.scrollerproxy.d.f(r2)
                r0.a = r1
                return
        }

        public void a() {
                r3 = this;
                boolean r0 = cn.bluemobi.dylan.photoview.library.d.j()
                if (r0 == 0) goto L11
                i.b r0 = i.a.a()
                java.lang.String r1 = "PhotoViewAttacher"
                java.lang.String r2 = "Cancel Fling"
                r0.d(r1, r2)
            L11:
                cn.bluemobi.dylan.photoview.library.scrollerproxy.d r0 = r3.a
                r1 = 1
                r0.c(r1)
                return
        }

        public void b(int r14, int r15, int r16, int r17) {
                r13 = this;
                cn.bluemobi.dylan.photoview.library.d r0 = r13.f181d
                android.graphics.RectF r0 = r0.getDisplayRect()
                if (r0 != 0) goto La
                goto L88
            La:
                float r1 = r0.left
                float r1 = -r1
                int r3 = java.lang.Math.round(r1)
                float r14 = (float) r14
                float r1 = r0.width()
                r2 = 0
                int r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
                if (r1 >= 0) goto L27
                float r1 = r0.width()
                float r1 = r1 - r14
                int r14 = java.lang.Math.round(r1)
                r8 = r14
                r7 = 0
                goto L29
            L27:
                r7 = r3
                r8 = r7
            L29:
                float r14 = r0.top
                float r14 = -r14
                int r4 = java.lang.Math.round(r14)
                float r14 = (float) r15
                float r15 = r0.height()
                int r15 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
                if (r15 >= 0) goto L45
                float r15 = r0.height()
                float r15 = r15 - r14
                int r14 = java.lang.Math.round(r15)
                r10 = r14
                r9 = 0
                goto L47
            L45:
                r9 = r4
                r10 = r9
            L47:
                r13.f179b = r3
                r13.f180c = r4
                boolean r14 = cn.bluemobi.dylan.photoview.library.d.j()
                if (r14 == 0) goto L83
                i.b r14 = i.a.a()
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                java.lang.String r0 = "fling. StartX:"
                r15.append(r0)
                r15.append(r3)
                java.lang.String r0 = " StartY:"
                r15.append(r0)
                r15.append(r4)
                java.lang.String r0 = " MaxX:"
                r15.append(r0)
                r15.append(r8)
                java.lang.String r0 = " MaxY:"
                r15.append(r0)
                r15.append(r10)
                java.lang.String r15 = r15.toString()
                java.lang.String r0 = "PhotoViewAttacher"
                r14.d(r0, r15)
            L83:
                if (r3 != r8) goto L89
                if (r4 == r10) goto L88
                goto L89
            L88:
                return
            L89:
                cn.bluemobi.dylan.photoview.library.scrollerproxy.d r2 = r13.a
                r11 = 0
                r12 = 0
                r5 = r16
                r6 = r17
                r2.b(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r6 = this;
                cn.bluemobi.dylan.photoview.library.scrollerproxy.d r0 = r6.a
                boolean r0 = r0.g()
                if (r0 == 0) goto L9
                goto L82
            L9:
                cn.bluemobi.dylan.photoview.library.d r0 = r6.f181d
                android.widget.ImageView r0 = r0.u()
                if (r0 == 0) goto L82
                cn.bluemobi.dylan.photoview.library.scrollerproxy.d r1 = r6.a
                boolean r1 = r1.a()
                if (r1 == 0) goto L82
                cn.bluemobi.dylan.photoview.library.scrollerproxy.d r1 = r6.a
                int r1 = r1.d()
                cn.bluemobi.dylan.photoview.library.scrollerproxy.d r2 = r6.a
                int r2 = r2.e()
                boolean r3 = cn.bluemobi.dylan.photoview.library.d.j()
                if (r3 == 0) goto L61
                i.b r3 = i.a.a()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "fling run(). CurrentX:"
                r4.append(r5)
                int r5 = r6.f179b
                r4.append(r5)
                java.lang.String r5 = " CurrentY:"
                r4.append(r5)
                int r5 = r6.f180c
                r4.append(r5)
                java.lang.String r5 = " NewX:"
                r4.append(r5)
                r4.append(r1)
                java.lang.String r5 = " NewY:"
                r4.append(r5)
                r4.append(r2)
                java.lang.String r4 = r4.toString()
                java.lang.String r5 = "PhotoViewAttacher"
                r3.d(r5, r4)
            L61:
                cn.bluemobi.dylan.photoview.library.d r3 = r6.f181d
                android.graphics.Matrix r3 = cn.bluemobi.dylan.photoview.library.d.k(r3)
                int r4 = r6.f179b
                int r4 = r4 - r1
                float r4 = (float) r4
                int r5 = r6.f180c
                int r5 = r5 - r2
                float r5 = (float) r5
                r3.postTranslate(r4, r5)
                cn.bluemobi.dylan.photoview.library.d r3 = r6.f181d
                android.graphics.Matrix r4 = r3.t()
                cn.bluemobi.dylan.photoview.library.d.l(r3, r4)
                r6.f179b = r1
                r6.f180c = r2
                cn.bluemobi.dylan.photoview.library.a.d(r0, r6)
            L82:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface e {
        void a(android.graphics.RectF r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface f {
        void a(android.view.View r1, float r2, float r3);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface g {
        void a(float r1, float r2, float r3);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface h {
        void a(android.view.View r1, float r2, float r3);
    }

    static {
            java.lang.String r0 = "PhotoViewAttacher"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            cn.bluemobi.dylan.photoview.library.d.C = r0
            android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator
            r0.<init>()
            cn.bluemobi.dylan.photoview.library.d.D = r0
            return
    }

    public d(android.widget.ImageView r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    public d(android.widget.ImageView r3, boolean r4) {
            r2 = this;
            r2.<init>()
            r0 = 200(0xc8, float:2.8E-43)
            r2.a = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.f164b = r0
            r0 = 1071644672(0x3fe00000, float:1.75)
            r2.f165c = r0
            r0 = 1077936128(0x40400000, float:3.0)
            r2.f166d = r0
            r0 = 1
            r2.f167e = r0
            r1 = 0
            r2.f168f = r1
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r2.f172j = r1
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r2.f173k = r1
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r2.l = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r2.m = r1
            r1 = 9
            float[] r1 = new float[r1]
            r2.n = r1
            r1 = 2
            r2.y = r1
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER
            r2.A = r1
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r3)
            r2.f169g = r1
            r3.setDrawingCacheEnabled(r0)
            r3.setOnTouchListener(r2)
            android.view.ViewTreeObserver r0 = r3.getViewTreeObserver()
            if (r0 == 0) goto L58
            r0.addOnGlobalLayoutListener(r2)
        L58:
            C(r3)
            boolean r0 = r3.isInEditMode()
            if (r0 == 0) goto L62
            return
        L62:
            android.content.Context r0 = r3.getContext()
            cn.bluemobi.dylan.photoview.library.gestures.d r0 = cn.bluemobi.dylan.photoview.library.gestures.f.a(r0, r2)
            r2.f171i = r0
            android.view.GestureDetector r0 = new android.view.GestureDetector
            android.content.Context r3 = r3.getContext()
            cn.bluemobi.dylan.photoview.library.d$a r1 = new cn.bluemobi.dylan.photoview.library.d$a
            r1.<init>(r2)
            r0.<init>(r3, r1)
            r2.f170h = r0
            cn.bluemobi.dylan.photoview.library.b r3 = new cn.bluemobi.dylan.photoview.library.b
            r3.<init>(r2)
            r0.setOnDoubleTapListener(r3)
            r2.setZoomable(r4)
            return
    }

    private void A() {
            r1 = this;
            android.graphics.Matrix r0 = r1.l
            r0.reset()
            android.graphics.Matrix r0 = r1.t()
            r1.B(r0)
            r1.p()
            return
    }

    private void B(android.graphics.Matrix r2) {
            r1 = this;
            android.widget.ImageView r0 = r1.u()
            if (r0 == 0) goto L1b
            r1.o()
            r0.setImageMatrix(r2)
            cn.bluemobi.dylan.photoview.library.d$e r0 = r1.o
            if (r0 == 0) goto L1b
            android.graphics.RectF r2 = r1.s(r2)
            if (r2 == 0) goto L1b
            cn.bluemobi.dylan.photoview.library.d$e r0 = r1.o
            r0.a(r2)
        L1b:
            return
    }

    private static void C(android.widget.ImageView r2) {
            if (r2 == 0) goto L15
            boolean r0 = r2 instanceof cn.bluemobi.dylan.photoview.library.c
            if (r0 != 0) goto L15
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.MATRIX
            android.widget.ImageView$ScaleType r1 = r2.getScaleType()
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L15
            r2.setScaleType(r0)
        L15:
            return
    }

    private void D(android.graphics.drawable.Drawable r9) {
            r8 = this;
            android.widget.ImageView r0 = r8.u()
            if (r0 == 0) goto Lba
            if (r9 != 0) goto La
            goto Lba
        La:
            int r1 = r8.w(r0)
            float r1 = (float) r1
            int r0 = r8.v(r0)
            float r0 = (float) r0
            int r2 = r9.getIntrinsicWidth()
            int r9 = r9.getIntrinsicHeight()
            android.graphics.Matrix r3 = r8.f172j
            r3.reset()
            float r2 = (float) r2
            float r3 = r1 / r2
            float r9 = (float) r9
            float r4 = r0 / r9
            android.widget.ImageView$ScaleType r5 = r8.A
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.CENTER
            r7 = 1073741824(0x40000000, float:2.0)
            if (r5 != r6) goto L3a
            android.graphics.Matrix r3 = r8.f172j
            float r1 = r1 - r2
            float r1 = r1 / r7
            float r0 = r0 - r9
            float r0 = r0 / r7
            r3.postTranslate(r1, r0)
            goto Lb7
        L3a:
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.CENTER_CROP
            if (r5 != r6) goto L55
            float r3 = java.lang.Math.max(r3, r4)
            android.graphics.Matrix r4 = r8.f172j
            r4.postScale(r3, r3)
            android.graphics.Matrix r4 = r8.f172j
            float r2 = r2 * r3
            float r1 = r1 - r2
            float r1 = r1 / r7
            float r9 = r9 * r3
            float r0 = r0 - r9
            float r0 = r0 / r7
            r4.postTranslate(r1, r0)
            goto Lb7
        L55:
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            if (r5 != r6) goto L76
            r5 = 1065353216(0x3f800000, float:1.0)
            float r3 = java.lang.Math.min(r3, r4)
            float r3 = java.lang.Math.min(r5, r3)
            android.graphics.Matrix r4 = r8.f172j
            r4.postScale(r3, r3)
            android.graphics.Matrix r4 = r8.f172j
            float r2 = r2 * r3
            float r1 = r1 - r2
            float r1 = r1 / r7
            float r9 = r9 * r3
            float r0 = r0 - r9
            float r0 = r0 / r7
            r4.postTranslate(r1, r0)
            goto Lb7
        L76:
            android.graphics.RectF r3 = new android.graphics.RectF
            r4 = 0
            r3.<init>(r4, r4, r2, r9)
            android.graphics.RectF r9 = new android.graphics.RectF
            r9.<init>(r4, r4, r1, r0)
            int[] r0 = cn.bluemobi.dylan.photoview.library.d.b.a
            android.widget.ImageView$ScaleType r1 = r8.A
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            if (r0 == r1) goto Lb0
            r1 = 3
            if (r0 == r1) goto La8
            r1 = 4
            if (r0 == r1) goto La0
            r1 = 5
            if (r0 == r1) goto L98
            goto Lb7
        L98:
            android.graphics.Matrix r0 = r8.f172j
            android.graphics.Matrix$ScaleToFit r1 = android.graphics.Matrix.ScaleToFit.FILL
            r0.setRectToRect(r3, r9, r1)
            goto Lb7
        La0:
            android.graphics.Matrix r0 = r8.f172j
            android.graphics.Matrix$ScaleToFit r1 = android.graphics.Matrix.ScaleToFit.CENTER
            r0.setRectToRect(r3, r9, r1)
            goto Lb7
        La8:
            android.graphics.Matrix r0 = r8.f172j
            android.graphics.Matrix$ScaleToFit r1 = android.graphics.Matrix.ScaleToFit.END
            r0.setRectToRect(r3, r9, r1)
            goto Lb7
        Lb0:
            android.graphics.Matrix r0 = r8.f172j
            android.graphics.Matrix$ScaleToFit r1 = android.graphics.Matrix.ScaleToFit.START
            r0.setRectToRect(r3, r9, r1)
        Lb7:
            r8.A()
        Lba:
            return
    }

    static /* synthetic */ android.view.View.OnLongClickListener i(cn.bluemobi.dylan.photoview.library.d r0) {
            android.view.View$OnLongClickListener r0 = r0.r
            return r0
    }

    static /* synthetic */ boolean j() {
            boolean r0 = cn.bluemobi.dylan.photoview.library.d.C
            return r0
    }

    static /* synthetic */ android.graphics.Matrix k(cn.bluemobi.dylan.photoview.library.d r0) {
            android.graphics.Matrix r0 = r0.l
            return r0
    }

    static /* synthetic */ void l(cn.bluemobi.dylan.photoview.library.d r0, android.graphics.Matrix r1) {
            r0.B(r1)
            return
    }

    private void m() {
            r1 = this;
            cn.bluemobi.dylan.photoview.library.d$d r0 = r1.x
            if (r0 == 0) goto La
            r0.a()
            r0 = 0
            r1.x = r0
        La:
            return
    }

    private void n() {
            r1 = this;
            boolean r0 = r1.p()
            if (r0 == 0) goto Ld
            android.graphics.Matrix r0 = r1.t()
            r1.B(r0)
        Ld:
            return
    }

    private void o() {
            r2 = this;
            android.widget.ImageView r0 = r2.u()
            if (r0 == 0) goto L1f
            boolean r1 = r0 instanceof cn.bluemobi.dylan.photoview.library.c
            if (r1 != 0) goto L1f
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX
            android.widget.ImageView$ScaleType r0 = r0.getScaleType()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L17
            goto L1f
        L17:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The ImageView's ScaleType has been changed since attaching a PhotoViewAttacher"
            r0.<init>(r1)
            throw r0
        L1f:
            return
    }

    private boolean p() {
            r12 = this;
            android.widget.ImageView r0 = r12.u()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            android.graphics.Matrix r2 = r12.t()
            android.graphics.RectF r2 = r12.s(r2)
            if (r2 != 0) goto L13
            return r1
        L13:
            float r3 = r2.height()
            float r4 = r2.width()
            int r5 = r12.v(r0)
            float r5 = (float) r5
            r6 = 1073741824(0x40000000, float:2.0)
            r7 = 3
            r8 = 2
            r9 = 0
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r10 > 0) goto L45
            int[] r10 = cn.bluemobi.dylan.photoview.library.d.b.a
            android.widget.ImageView$ScaleType r11 = r12.A
            int r11 = r11.ordinal()
            r10 = r10[r11]
            if (r10 == r8) goto L41
            if (r10 == r7) goto L3d
            float r5 = r5 - r3
            float r5 = r5 / r6
            float r3 = r2.top
        L3b:
            float r5 = r5 - r3
            goto L54
        L3d:
            float r5 = r5 - r3
            float r3 = r2.top
            goto L3b
        L41:
            float r3 = r2.top
        L43:
            float r5 = -r3
            goto L54
        L45:
            float r3 = r2.top
            int r10 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r10 <= 0) goto L4c
            goto L43
        L4c:
            float r3 = r2.bottom
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r10 >= 0) goto L53
            goto L3b
        L53:
            r5 = 0
        L54:
            int r0 = r12.w(r0)
            float r0 = (float) r0
            r3 = 1
            int r10 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r10 > 0) goto L7e
            int[] r1 = cn.bluemobi.dylan.photoview.library.d.b.a
            android.widget.ImageView$ScaleType r9 = r12.A
            int r9 = r9.ordinal()
            r1 = r1[r9]
            if (r1 == r8) goto L77
            if (r1 == r7) goto L73
            float r0 = r0 - r4
            float r0 = r0 / r6
            float r1 = r2.left
        L70:
            float r0 = r0 - r1
        L71:
            r9 = r0
            goto L7b
        L73:
            float r0 = r0 - r4
            float r1 = r2.left
            goto L70
        L77:
            float r0 = r2.left
            float r0 = -r0
            goto L71
        L7b:
            r12.y = r8
            goto L96
        L7e:
            float r4 = r2.left
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 <= 0) goto L88
            r12.y = r1
            float r9 = -r4
            goto L96
        L88:
            float r1 = r2.right
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 >= 0) goto L93
            float r9 = r0 - r1
            r12.y = r3
            goto L96
        L93:
            r0 = -1
            r12.y = r0
        L96:
            android.graphics.Matrix r0 = r12.l
            r0.postTranslate(r9, r5)
            return r3
    }

    private static void q(float r0, float r1, float r2) {
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L11
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L9
            return
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "MidZoom has to be less than MaxZoom"
            r0.<init>(r1)
            throw r0
        L11:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "MinZoom has to be less than MidZoom"
            r0.<init>(r1)
            throw r0
    }

    private android.graphics.RectF s(android.graphics.Matrix r5) {
            r4 = this;
            android.widget.ImageView r0 = r4.u()
            if (r0 == 0) goto L24
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto L24
            android.graphics.RectF r1 = r4.m
            int r2 = r0.getIntrinsicWidth()
            float r2 = (float) r2
            int r0 = r0.getIntrinsicHeight()
            float r0 = (float) r0
            r3 = 0
            r1.set(r3, r3, r2, r0)
            android.graphics.RectF r0 = r4.m
            r5.mapRect(r0)
            android.graphics.RectF r5 = r4.m
            return r5
        L24:
            r5 = 0
            return r5
    }

    private int v(android.widget.ImageView r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r3.getHeight()
            int r1 = r3.getPaddingTop()
            int r0 = r0 - r1
            int r3 = r3.getPaddingBottom()
            int r0 = r0 - r3
            return r0
    }

    private int w(android.widget.ImageView r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r3.getWidth()
            int r1 = r3.getPaddingLeft()
            int r0 = r0 - r1
            int r3 = r3.getPaddingRight()
            int r0 = r0 - r3
            return r0
    }

    private float x(android.graphics.Matrix r2, int r3) {
            r1 = this;
            float[] r0 = r1.n
            r2.getValues(r0)
            float[] r2 = r1.n
            r2 = r2[r3]
            return r2
    }

    private static boolean y(android.widget.ImageView r0) {
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    private static boolean z(android.widget.ImageView.ScaleType r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            int[] r0 = cn.bluemobi.dylan.photoview.library.d.b.a
            int r1 = r2.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L10
            return r1
        L10:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.name()
            r1.append(r2)
            java.lang.String r2 = " is not supported in PhotoView"
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public void a(float r9, float r10, float r11, boolean r12) {
            r8 = this;
            android.widget.ImageView r0 = r8.u()
            if (r0 == 0) goto L40
            float r1 = r8.f164b
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 < 0) goto L12
            float r1 = r8.f166d
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 <= 0) goto L14
        L12:
            r3 = r8
            goto L34
        L14:
            if (r12 == 0) goto L27
            cn.bluemobi.dylan.photoview.library.d$c r2 = new cn.bluemobi.dylan.photoview.library.d$c
            float r4 = r8.getScale()
            r3 = r8
            r5 = r9
            r6 = r10
            r7 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            r0.post(r2)
            return
        L27:
            r3 = r8
            r5 = r9
            r6 = r10
            r7 = r11
            android.graphics.Matrix r9 = r3.l
            r9.setScale(r5, r5, r6, r7)
            r8.n()
            return
        L34:
            i.b r9 = i.a.a()
            java.lang.String r10 = "PhotoViewAttacher"
            java.lang.String r11 = "Scale must be within the range of minScale and maxScale"
            r9.i(r10, r11)
            return
        L40:
            r3 = r8
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public void b(float r3, boolean r4) {
            r2 = this;
            android.widget.ImageView r0 = r2.u()
            if (r0 == 0) goto L17
            int r1 = r0.getRight()
            int r1 = r1 / 2
            float r1 = (float) r1
            int r0 = r0.getBottom()
            int r0 = r0 / 2
            float r0 = (float) r0
            r2.a(r3, r1, r0, r4)
        L17:
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.gestures.e
    public void c(float r4, float r5, float r6, float r7) {
            r3 = this;
            boolean r0 = cn.bluemobi.dylan.photoview.library.d.C
            if (r0 == 0) goto L36
            i.b r0 = i.a.a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onFling. sX: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " sY: "
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = " Vx: "
            r1.append(r4)
            r1.append(r6)
            java.lang.String r4 = " Vy: "
            r1.append(r4)
            r1.append(r7)
            java.lang.String r4 = r1.toString()
            java.lang.String r5 = "PhotoViewAttacher"
            r0.d(r5, r4)
        L36:
            android.widget.ImageView r4 = r3.u()
            cn.bluemobi.dylan.photoview.library.d$d r5 = new cn.bluemobi.dylan.photoview.library.d$d
            android.content.Context r0 = r4.getContext()
            r5.<init>(r3, r0)
            r3.x = r5
            int r0 = r3.w(r4)
            int r1 = r3.v(r4)
            int r6 = (int) r6
            int r7 = (int) r7
            r5.b(r0, r1, r6, r7)
            cn.bluemobi.dylan.photoview.library.d$d r5 = r3.x
            r4.post(r5)
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public boolean d() {
            r1 = this;
            boolean r0 = r1.z
            return r0
    }

    @Override // cn.bluemobi.dylan.photoview.library.gestures.e
    public void e(float r8, float r9) {
            r7 = this;
            cn.bluemobi.dylan.photoview.library.gestures.d r0 = r7.f171i
            boolean r0 = r0.c()
            if (r0 == 0) goto L9
            goto L6c
        L9:
            boolean r0 = cn.bluemobi.dylan.photoview.library.d.C
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L2d
            i.b r0 = i.a.a()
            java.lang.Float r4 = java.lang.Float.valueOf(r8)
            java.lang.Float r5 = java.lang.Float.valueOf(r9)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r1] = r4
            r6[r3] = r5
            java.lang.String r4 = "onDrag: dx: %.2f. dy: %.2f"
            java.lang.String r4 = java.lang.String.format(r4, r6)
            java.lang.String r5 = "PhotoViewAttacher"
            r0.d(r5, r4)
        L2d:
            android.widget.ImageView r0 = r7.u()
            android.graphics.Matrix r4 = r7.l
            r4.postTranslate(r8, r9)
            r7.n()
            android.view.ViewParent r9 = r0.getParent()
            boolean r0 = r7.f167e
            if (r0 == 0) goto L67
            cn.bluemobi.dylan.photoview.library.gestures.d r0 = r7.f171i
            boolean r0 = r0.c()
            if (r0 != 0) goto L67
            boolean r0 = r7.f168f
            if (r0 != 0) goto L67
            int r0 = r7.y
            if (r0 == r2) goto L61
            if (r0 != 0) goto L59
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 >= 0) goto L61
        L59:
            if (r0 != r3) goto L6c
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 > 0) goto L6c
        L61:
            if (r9 == 0) goto L6c
            r9.requestDisallowInterceptTouchEvent(r1)
            return
        L67:
            if (r9 == 0) goto L6c
            r9.requestDisallowInterceptTouchEvent(r3)
        L6c:
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.gestures.e
    public void f(float r7, float r8, float r9) {
            r6 = this;
            boolean r0 = cn.bluemobi.dylan.photoview.library.d.C
            if (r0 == 0) goto L2b
            i.b r0 = i.a.a()
            java.lang.Float r1 = java.lang.Float.valueOf(r7)
            java.lang.Float r2 = java.lang.Float.valueOf(r8)
            java.lang.Float r3 = java.lang.Float.valueOf(r9)
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r1
            r1 = 1
            r4[r1] = r2
            r1 = 2
            r4[r1] = r3
            java.lang.String r1 = "onScale: scale: %.2f. fX: %.2f. fY: %.2f"
            java.lang.String r1 = java.lang.String.format(r1, r4)
            java.lang.String r2 = "PhotoViewAttacher"
            r0.d(r2, r1)
        L2b:
            float r0 = r6.getScale()
            float r1 = r6.f166d
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L3d
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 >= 0) goto L3c
            goto L3d
        L3c:
            return
        L3d:
            cn.bluemobi.dylan.photoview.library.d$g r0 = r6.s
            if (r0 == 0) goto L44
            r0.a(r7, r8, r9)
        L44:
            android.graphics.Matrix r0 = r6.l
            r0.postScale(r7, r7, r8, r9)
            r6.n()
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public boolean g(android.graphics.Matrix r3) {
            r2 = this;
            if (r3 == 0) goto L22
            android.widget.ImageView r0 = r2.u()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 != 0) goto L11
            return r1
        L11:
            android.graphics.Matrix r0 = r2.l
            r0.set(r3)
            android.graphics.Matrix r3 = r2.t()
            r2.B(r3)
            r2.p()
            r3 = 1
            return r3
        L22:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Matrix cannot be null"
            r3.<init>(r0)
            throw r3
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public android.graphics.Matrix getDisplayMatrix() {
            r2 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            android.graphics.Matrix r1 = r2.t()
            r0.<init>(r1)
            return r0
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public android.graphics.RectF getDisplayRect() {
            r1 = this;
            r1.p()
            android.graphics.Matrix r0 = r1.t()
            android.graphics.RectF r0 = r1.s(r0)
            return r0
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public cn.bluemobi.dylan.photoview.library.c getIPhotoViewImplementation() {
            r0 = this;
            return r0
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    @java.lang.Deprecated
    public float getMaxScale() {
            r1 = this;
            float r0 = r1.getMaximumScale()
            return r0
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public float getMaximumScale() {
            r1 = this;
            float r0 = r1.f166d
            return r0
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public float getMediumScale() {
            r1 = this;
            float r0 = r1.f165c
            return r0
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    @java.lang.Deprecated
    public float getMidScale() {
            r1 = this;
            float r0 = r1.getMediumScale()
            return r0
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    @java.lang.Deprecated
    public float getMinScale() {
            r1 = this;
            float r0 = r1.getMinimumScale()
            return r0
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public float getMinimumScale() {
            r1 = this;
            float r0 = r1.f164b
            return r0
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public cn.bluemobi.dylan.photoview.library.d.f getOnPhotoTapListener() {
            r1 = this;
            cn.bluemobi.dylan.photoview.library.d$f r0 = r1.p
            return r0
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public cn.bluemobi.dylan.photoview.library.d.h getOnViewTapListener() {
            r1 = this;
            cn.bluemobi.dylan.photoview.library.d$h r0 = r1.q
            return r0
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public float getScale() {
            r6 = this;
            android.graphics.Matrix r0 = r6.l
            r1 = 0
            float r0 = r6.x(r0, r1)
            double r0 = (double) r0
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.pow(r0, r2)
            float r0 = (float) r0
            android.graphics.Matrix r1 = r6.l
            r4 = 3
            float r1 = r6.x(r1, r4)
            double r4 = (double) r1
            double r1 = java.lang.Math.pow(r4, r2)
            float r1 = (float) r1
            float r0 = r0 + r1
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            float r0 = (float) r0
            return r0
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public android.widget.ImageView.ScaleType getScaleType() {
            r1 = this;
            android.widget.ImageView$ScaleType r0 = r1.A
            return r0
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public android.graphics.Bitmap getVisibleRectangleBitmap() {
            r1 = this;
            android.widget.ImageView r0 = r1.u()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            android.graphics.Bitmap r0 = r0.getDrawingCache()
            return r0
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public void h(float r1, float r2, float r3) {
            r0 = this;
            q(r1, r2, r3)
            r0.f164b = r1
            r0.f165c = r2
            r0.f166d = r3
            return
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
            r6 = this;
            android.widget.ImageView r0 = r6.u()
            if (r0 == 0) goto L41
            boolean r1 = r6.z
            if (r1 == 0) goto L3a
            int r1 = r0.getTop()
            int r2 = r0.getRight()
            int r3 = r0.getBottom()
            int r4 = r0.getLeft()
            int r5 = r6.t
            if (r1 != r5) goto L2a
            int r5 = r6.v
            if (r3 != r5) goto L2a
            int r5 = r6.w
            if (r4 != r5) goto L2a
            int r5 = r6.u
            if (r2 == r5) goto L41
        L2a:
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            r6.D(r0)
            r6.t = r1
            r6.u = r2
            r6.v = r3
            r6.w = r4
            return
        L3a:
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            r6.D(r0)
        L41:
            return
    }

    @Override // android.view.View.OnTouchListener
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
            r10 = this;
            boolean r0 = r10.z
            r1 = 0
            if (r0 == 0) goto La1
            r0 = r11
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            boolean r0 = y(r0)
            if (r0 == 0) goto La1
            android.view.ViewParent r0 = r11.getParent()
            int r2 = r12.getAction()
            r3 = 1
            if (r2 == 0) goto L49
            if (r2 == r3) goto L20
            r0 = 3
            if (r2 == r0) goto L20
        L1e:
            r5 = r10
            goto L5e
        L20:
            float r0 = r10.getScale()
            float r2 = r10.f164b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L1e
            android.graphics.RectF r0 = r10.getDisplayRect()
            if (r0 == 0) goto L1e
            cn.bluemobi.dylan.photoview.library.d$c r4 = new cn.bluemobi.dylan.photoview.library.d$c
            float r6 = r10.getScale()
            float r7 = r10.f164b
            float r8 = r0.centerX()
            float r9 = r0.centerY()
            r5 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r11.post(r4)
            r11 = 1
            goto L5f
        L49:
            r5 = r10
            if (r0 == 0) goto L50
            r0.requestDisallowInterceptTouchEvent(r3)
            goto L5b
        L50:
            i.b r11 = i.a.a()
            java.lang.String r0 = "PhotoViewAttacher"
            java.lang.String r2 = "onTouch getParent() returned null"
            r11.i(r0, r2)
        L5b:
            r10.m()
        L5e:
            r11 = 0
        L5f:
            cn.bluemobi.dylan.photoview.library.gestures.d r0 = r5.f171i
            if (r0 == 0) goto L95
            boolean r11 = r0.c()
            cn.bluemobi.dylan.photoview.library.gestures.d r0 = r5.f171i
            boolean r0 = r0.b()
            cn.bluemobi.dylan.photoview.library.gestures.d r2 = r5.f171i
            boolean r2 = r2.onTouchEvent(r12)
            if (r11 != 0) goto L7f
            cn.bluemobi.dylan.photoview.library.gestures.d r11 = r5.f171i
            boolean r11 = r11.c()
            if (r11 != 0) goto L7f
            r11 = 1
            goto L80
        L7f:
            r11 = 0
        L80:
            if (r0 != 0) goto L8c
            cn.bluemobi.dylan.photoview.library.gestures.d r0 = r5.f171i
            boolean r0 = r0.b()
            if (r0 != 0) goto L8c
            r0 = 1
            goto L8d
        L8c:
            r0 = 0
        L8d:
            if (r11 == 0) goto L92
            if (r0 == 0) goto L92
            r1 = 1
        L92:
            r5.f168f = r1
            r11 = r2
        L95:
            android.view.GestureDetector r0 = r5.f170h
            if (r0 == 0) goto La0
            boolean r12 = r0.onTouchEvent(r12)
            if (r12 == 0) goto La0
            return r3
        La0:
            return r11
        La1:
            r5 = r10
            return r1
    }

    public void r() {
            r4 = this;
            java.lang.ref.WeakReference<android.widget.ImageView> r0 = r4.f169g
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.Object r0 = r0.get()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1 = 0
            if (r0 == 0) goto L23
            android.view.ViewTreeObserver r2 = r0.getViewTreeObserver()
            if (r2 == 0) goto L1d
            boolean r3 = r2.isAlive()
            if (r3 == 0) goto L1d
            r2.removeGlobalOnLayoutListener(r4)
        L1d:
            r0.setOnTouchListener(r1)
            r4.m()
        L23:
            android.view.GestureDetector r0 = r4.f170h
            if (r0 == 0) goto L2a
            r0.setOnDoubleTapListener(r1)
        L2a:
            r4.o = r1
            r4.p = r1
            r4.q = r1
            r4.f169g = r1
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public void setAllowParentInterceptOnEdge(boolean r1) {
            r0 = this;
            r0.f167e = r1
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    @java.lang.Deprecated
    public void setMaxScale(float r1) {
            r0 = this;
            r0.setMaximumScale(r1)
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public void setMaximumScale(float r3) {
            r2 = this;
            float r0 = r2.f164b
            float r1 = r2.f165c
            q(r0, r1, r3)
            r2.f166d = r3
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public void setMediumScale(float r3) {
            r2 = this;
            float r0 = r2.f164b
            float r1 = r2.f166d
            q(r0, r3, r1)
            r2.f165c = r3
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    @java.lang.Deprecated
    public void setMidScale(float r1) {
            r0 = this;
            r0.setMediumScale(r1)
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    @java.lang.Deprecated
    public void setMinScale(float r1) {
            r0 = this;
            r0.setMinimumScale(r1)
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public void setMinimumScale(float r3) {
            r2 = this;
            float r0 = r2.f165c
            float r1 = r2.f166d
            q(r3, r0, r1)
            r2.f164b = r3
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener r2) {
            r1 = this;
            if (r2 == 0) goto L8
            android.view.GestureDetector r0 = r1.f170h
            r0.setOnDoubleTapListener(r2)
            return
        L8:
            android.view.GestureDetector r2 = r1.f170h
            cn.bluemobi.dylan.photoview.library.b r0 = new cn.bluemobi.dylan.photoview.library.b
            r0.<init>(r1)
            r2.setOnDoubleTapListener(r0)
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public void setOnLongClickListener(android.view.View.OnLongClickListener r1) {
            r0 = this;
            r0.r = r1
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public void setOnMatrixChangeListener(cn.bluemobi.dylan.photoview.library.d.e r1) {
            r0 = this;
            r0.o = r1
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public void setOnPhotoTapListener(cn.bluemobi.dylan.photoview.library.d.f r1) {
            r0 = this;
            r0.p = r1
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public void setOnScaleChangeListener(cn.bluemobi.dylan.photoview.library.d.g r1) {
            r0 = this;
            r0.s = r1
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public void setOnViewTapListener(cn.bluemobi.dylan.photoview.library.d.h r1) {
            r0 = this;
            r0.q = r1
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public void setPhotoViewRotation(float r3) {
            r2 = this;
            android.graphics.Matrix r0 = r2.l
            r1 = 1135869952(0x43b40000, float:360.0)
            float r3 = r3 % r1
            r0.setRotate(r3)
            r2.n()
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public void setRotationBy(float r3) {
            r2 = this;
            android.graphics.Matrix r0 = r2.l
            r1 = 1135869952(0x43b40000, float:360.0)
            float r3 = r3 % r1
            r0.postRotate(r3)
            r2.n()
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public void setRotationTo(float r3) {
            r2 = this;
            android.graphics.Matrix r0 = r2.l
            r1 = 1135869952(0x43b40000, float:360.0)
            float r3 = r3 % r1
            r0.setRotate(r3)
            r2.n()
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public void setScale(float r2) {
            r1 = this;
            r0 = 0
            r1.b(r2, r0)
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public void setScaleType(android.widget.ImageView.ScaleType r2) {
            r1 = this;
            boolean r0 = z(r2)
            if (r0 == 0) goto Lf
            android.widget.ImageView$ScaleType r0 = r1.A
            if (r2 == r0) goto Lf
            r1.A = r2
            r1.update()
        Lf:
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public void setZoomTransitionDuration(int r1) {
            r0 = this;
            if (r1 >= 0) goto L4
            r1 = 200(0xc8, float:2.8E-43)
        L4:
            r0.a = r1
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public void setZoomable(boolean r1) {
            r0 = this;
            r0.z = r1
            r0.update()
            return
    }

    public android.graphics.Matrix t() {
            r2 = this;
            android.graphics.Matrix r0 = r2.f173k
            android.graphics.Matrix r1 = r2.f172j
            r0.set(r1)
            android.graphics.Matrix r0 = r2.f173k
            android.graphics.Matrix r1 = r2.l
            r0.postConcat(r1)
            android.graphics.Matrix r0 = r2.f173k
            return r0
    }

    public android.widget.ImageView u() {
            r4 = this;
            java.lang.ref.WeakReference<android.widget.ImageView> r0 = r4.f169g
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.get()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 != 0) goto L1c
            r4.r()
            i.b r1 = i.a.a()
            java.lang.String r2 = "PhotoViewAttacher"
            java.lang.String r3 = "ImageView no longer exists. You should not use this PhotoViewAttacher any more."
            r1.i(r2, r3)
        L1c:
            return r0
    }

    public void update() {
            r2 = this;
            android.widget.ImageView r0 = r2.u()
            if (r0 == 0) goto L18
            boolean r1 = r2.z
            if (r1 == 0) goto L15
            C(r0)
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            r2.D(r0)
            return
        L15:
            r2.A()
        L18:
            return
    }
}
