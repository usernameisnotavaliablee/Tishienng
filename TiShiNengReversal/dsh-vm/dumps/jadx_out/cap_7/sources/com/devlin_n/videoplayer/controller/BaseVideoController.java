package com.devlin_n.videoplayer.controller;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public abstract class BaseVideoController extends android.widget.FrameLayout {
    protected android.view.View a;
    protected com.devlin_n.videoplayer.controller.BaseVideoController.d b;
    protected boolean c;
    protected com.devlin_n.videoplayer.widget.CenterView d;
    protected android.media.AudioManager e;
    protected boolean f;
    protected int g;
    private java.lang.StringBuilder h;
    private java.util.Formatter i;
    private android.view.GestureDetector j;
    protected boolean k;
    private float l;
    private float m;
    protected f1.a n;
    protected int o;
    protected java.lang.Runnable p;
    protected final java.lang.Runnable q;
    protected int r;
    protected float s;
    protected int t;
    protected boolean u;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.view.View.OnTouchListener {
        final /* synthetic */ com.devlin_n.videoplayer.controller.BaseVideoController a;

        a(com.devlin_n.videoplayer.controller.BaseVideoController r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(android.view.View r1, android.view.MotionEvent r2) {
                r0 = this;
                com.devlin_n.videoplayer.controller.BaseVideoController r1 = r0.a
                android.view.GestureDetector r1 = com.devlin_n.videoplayer.controller.BaseVideoController.a(r1)
                boolean r1 = r1.onTouchEvent(r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements java.lang.Runnable {
        final /* synthetic */ com.devlin_n.videoplayer.controller.BaseVideoController a;

        b(com.devlin_n.videoplayer.controller.BaseVideoController r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                com.devlin_n.videoplayer.controller.BaseVideoController r0 = r5.a
                int r0 = r0.f()
                com.devlin_n.videoplayer.controller.BaseVideoController r1 = r5.a
                com.devlin_n.videoplayer.controller.BaseVideoController$d r1 = r1.b
                boolean r1 = r1.isPlaying()
                if (r1 == 0) goto L1c
                com.devlin_n.videoplayer.controller.BaseVideoController r1 = r5.a
                java.lang.Runnable r2 = r1.p
                int r0 = r0 % 1000
                int r0 = 1000 - r0
                long r3 = (long) r0
                r1.postDelayed(r2, r3)
            L1c:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements java.lang.Runnable {
        final /* synthetic */ com.devlin_n.videoplayer.controller.BaseVideoController a;

        c(com.devlin_n.videoplayer.controller.BaseVideoController r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                com.devlin_n.videoplayer.controller.BaseVideoController r0 = r1.a
                r0.d()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface d {
        boolean a();

        void b();

        void c();

        void d();

        void e();

        com.devlin_n.videoplayer.controller.BaseVideoController.d f(int r1);

        void g();

        int getBufferPercentage();

        int getCurrentPosition();

        int getDuration();

        java.lang.String getTitle();

        void h();

        void i();

        boolean isMute();

        boolean isPlaying();

        void pause();

        void seekTo(int r1);

        void setLock(boolean r1);

        void start();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class e extends android.view.GestureDetector.SimpleOnGestureListener {
        private boolean a;
        private boolean b;
        private boolean c;
        private boolean d;
        final /* synthetic */ com.devlin_n.videoplayer.controller.BaseVideoController e;

        private e(com.devlin_n.videoplayer.controller.BaseVideoController r1) {
                r0 = this;
                r0.e = r1
                r0.<init>()
                return
        }

        /* synthetic */ e(com.devlin_n.videoplayer.controller.BaseVideoController r1, com.devlin_n.videoplayer.controller.BaseVideoController.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(android.view.MotionEvent r2) {
                r1 = this;
                com.devlin_n.videoplayer.controller.BaseVideoController r2 = r1.e
                boolean r0 = r2.f
                if (r0 != 0) goto L9
                r2.b()
            L9:
                r2 = 1
                return r2
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(android.view.MotionEvent r3) {
                r2 = this;
                com.devlin_n.videoplayer.controller.BaseVideoController r0 = r2.e
                boolean r1 = r0.k
                if (r1 != 0) goto Lb
                boolean r3 = super.onDown(r3)
                return r3
            Lb:
                android.media.AudioManager r3 = r0.e
                r1 = 3
                int r3 = r3.getStreamVolume(r1)
                r0.r = r3
                com.devlin_n.videoplayer.controller.BaseVideoController r3 = r2.e
                android.content.Context r0 = r3.getContext()
                android.app.Activity r0 = g1.f.l(r0)
                android.view.Window r0 = r0.getWindow()
                android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
                float r0 = r0.screenBrightness
                r3.s = r0
                r3 = 1
                r2.a = r3
                r0 = 0
                r2.b = r0
                r2.c = r0
                r2.d = r0
                return r3
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(android.view.MotionEvent r4, android.view.MotionEvent r5, float r6, float r7) {
                r3 = this;
                com.devlin_n.videoplayer.controller.BaseVideoController r0 = r3.e
                boolean r0 = r0.k
                if (r0 != 0) goto Lb
                boolean r4 = super.onScroll(r4, r5, r6, r7)
                return r4
            Lb:
                float r0 = r4.getX()
                float r1 = r5.getX()
                float r0 = r0 - r1
                float r4 = r4.getY()
                float r1 = r5.getY()
                float r4 = r4 - r1
                boolean r1 = r3.a
                r2 = 1
                if (r1 == 0) goto L4a
                float r6 = java.lang.Math.abs(r6)
                float r7 = java.lang.Math.abs(r7)
                r1 = 0
                int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                if (r6 < 0) goto L31
                r6 = 1
                goto L32
            L31:
                r6 = 0
            L32:
                r3.b = r6
                if (r6 != 0) goto L48
                float r5 = r5.getX()
                int r6 = g1.a.b
                int r6 = r6 / 2
                float r6 = (float) r6
                int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r5 <= 0) goto L46
                r3.c = r2
                goto L48
            L46:
                r3.d = r2
            L48:
                r3.a = r1
            L4a:
                boolean r5 = r3.b
                if (r5 == 0) goto L54
                com.devlin_n.videoplayer.controller.BaseVideoController r4 = r3.e
                r4.i(r0)
                goto L67
            L54:
                boolean r5 = r3.c
                if (r5 == 0) goto L5e
                com.devlin_n.videoplayer.controller.BaseVideoController r5 = r3.e
                r5.h(r4)
                goto L67
            L5e:
                boolean r5 = r3.d
                if (r5 == 0) goto L67
                com.devlin_n.videoplayer.controller.BaseVideoController r5 = r3.e
                r5.j(r4)
            L67:
                return r2
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(android.view.MotionEvent r2) {
                r1 = this;
                com.devlin_n.videoplayer.controller.BaseVideoController r2 = r1.e
                boolean r0 = r2.c
                if (r0 == 0) goto La
                r2.d()
                goto Ld
            La:
                r2.g()
            Ld:
                r2 = 1
                return r2
        }
    }

    public BaseVideoController(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public BaseVideoController(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public BaseVideoController(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, @androidx.annotation.AttrRes int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 3000(0xbb8, float:4.204E-42)
            r0.g = r1
            com.devlin_n.videoplayer.controller.BaseVideoController$b r1 = new com.devlin_n.videoplayer.controller.BaseVideoController$b
            r1.<init>(r0)
            r0.p = r1
            com.devlin_n.videoplayer.controller.BaseVideoController$c r1 = new com.devlin_n.videoplayer.controller.BaseVideoController$c
            r1.<init>(r0)
            r0.q = r1
            r0.e()
            return
    }

    static /* synthetic */ android.view.GestureDetector a(com.devlin_n.videoplayer.controller.BaseVideoController r0) {
            android.view.GestureDetector r0 = r0.j
            return r0
    }

    protected void b() {
            r2 = this;
            int r0 = r2.o
            r1 = 6
            if (r0 != r1) goto L6
            return
        L6:
            com.devlin_n.videoplayer.controller.BaseVideoController$d r0 = r2.b
            boolean r0 = r0.isPlaying()
            if (r0 == 0) goto L14
            com.devlin_n.videoplayer.controller.BaseVideoController$d r0 = r2.b
            r0.pause()
            return
        L14:
            com.devlin_n.videoplayer.controller.BaseVideoController$d r0 = r2.b
            r0.start()
            return
    }

    public void c() {
            r2 = this;
            com.devlin_n.videoplayer.controller.BaseVideoController$d r0 = r2.b
            boolean r0 = r0.a()
            if (r0 == 0) goto L1a
            android.content.Context r0 = r2.getContext()
            android.app.Activity r0 = g1.f.l(r0)
            r1 = 1
            r0.setRequestedOrientation(r1)
            com.devlin_n.videoplayer.controller.BaseVideoController$d r0 = r2.b
            r0.g()
            return
        L1a:
            android.content.Context r0 = r2.getContext()
            android.app.Activity r0 = g1.f.l(r0)
            r1 = 0
            r0.setRequestedOrientation(r1)
            com.devlin_n.videoplayer.controller.BaseVideoController$d r0 = r2.b
            r0.i()
            return
    }

    public void d() {
            r0 = this;
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getAction()
            if (r0 == 0) goto L4b
            r1 = 2
            if (r0 == r1) goto La
            goto L5f
        La:
            float r0 = r4.getX()
            float r1 = r3.l
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            float r1 = r4.getY()
            float r2 = r3.m
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            android.content.Context r2 = r3.getContext()
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r2)
            int r2 = r2.getScaledTouchSlop()
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L42
            android.content.Context r0 = r3.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L5f
        L42:
            android.view.ViewParent r0 = r3.getParent()
            r1 = 0
            r0.requestDisallowInterceptTouchEvent(r1)
            goto L5f
        L4b:
            float r0 = r4.getX()
            r3.l = r0
            float r0 = r4.getY()
            r3.m = r0
            android.view.ViewParent r0 = r3.getParent()
            r1 = 1
            r0.requestDisallowInterceptTouchEvent(r1)
        L5f:
            boolean r4 = super.dispatchTouchEvent(r4)
            return r4
    }

    protected void e() {
            r4 = this;
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r4.getLayoutId()
            android.view.View r0 = r0.inflate(r1, r4)
            r4.a = r0
            com.devlin_n.videoplayer.widget.CenterView r0 = new com.devlin_n.videoplayer.widget.CenterView
            android.content.Context r1 = r4.getContext()
            r0.<init>(r1)
            r4.d = r0
            r1 = 8
            r0.setVisibility(r1)
            com.devlin_n.videoplayer.widget.CenterView r0 = r4.d
            r4.addView(r0)
            android.content.Context r0 = r4.getContext()
            java.lang.String r1 = "audio"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            r4.e = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r4.h = r0
            java.util.Formatter r0 = new java.util.Formatter
            java.lang.StringBuilder r1 = r4.h
            java.util.Locale r2 = java.util.Locale.getDefault()
            r0.<init>(r1, r2)
            r4.i = r0
            r0 = 1
            r4.setClickable(r0)
            r4.setFocusable(r0)
            android.view.GestureDetector r0 = new android.view.GestureDetector
            android.content.Context r1 = r4.getContext()
            com.devlin_n.videoplayer.controller.BaseVideoController$e r2 = new com.devlin_n.videoplayer.controller.BaseVideoController$e
            r3 = 0
            r2.<init>(r4, r3)
            r0.<init>(r1, r2)
            r4.j = r0
            com.devlin_n.videoplayer.controller.BaseVideoController$a r0 = new com.devlin_n.videoplayer.controller.BaseVideoController$a
            r0.<init>(r4)
            r4.setOnTouchListener(r0)
            return
    }

    protected int f() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void g() {
            r0 = this;
            return
    }

    protected abstract int getLayoutId();

    protected void h(float r7) {
            r6 = this;
            com.devlin_n.videoplayer.widget.CenterView r0 = r6.d
            r1 = 0
            r0.setVisibility(r1)
            r6.d()
            com.devlin_n.videoplayer.widget.CenterView r0 = r6.d
            r0.setProVisibility(r1)
            android.content.Context r0 = r6.getContext()
            android.app.Activity r0 = g1.f.l(r0)
            android.view.Window r0 = r0.getWindow()
            android.view.WindowManager$LayoutParams r1 = r0.getAttributes()
            com.devlin_n.videoplayer.widget.CenterView r2 = r6.d
            int r3 = com.devlin_n.videoplayer.R.drawable.ic_action_brightness
            r2.setIcon(r3)
            int r2 = r6.getMeasuredHeight()
            float r3 = r6.s
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L35
            r3 = 1056964608(0x3f000000, float:0.5)
            r6.s = r3
        L35:
            r3 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 * r3
            float r2 = (float) r2
            float r7 = r7 / r2
            r2 = 1065353216(0x3f800000, float:1.0)
            float r7 = r7 * r2
            float r3 = r6.s
            float r7 = r7 + r3
            r3 = 0
            int r4 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r4 >= 0) goto L48
            r7 = 0
        L48:
            int r3 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r3 <= 0) goto L4d
            goto L4e
        L4d:
            r2 = r7
        L4e:
            r7 = 1120403456(0x42c80000, float:100.0)
            float r7 = r7 * r2
            int r7 = (int) r7
            com.devlin_n.videoplayer.widget.CenterView r3 = r6.d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            java.lang.String r5 = "%"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.setTextView(r4)
            com.devlin_n.videoplayer.widget.CenterView r3 = r6.d
            r3.setProPercent(r7)
            r1.screenBrightness = r2
            r0.setAttributes(r1)
            return
    }

    protected void i(float r5) {
            r4 = this;
            com.devlin_n.videoplayer.widget.CenterView r0 = r4.d
            r1 = 0
            r0.setVisibility(r1)
            r4.d()
            com.devlin_n.videoplayer.widget.CenterView r0 = r4.d
            r2 = 8
            r0.setProVisibility(r2)
            float r5 = -r5
            int r0 = r4.getMeasuredWidth()
            com.devlin_n.videoplayer.controller.BaseVideoController$d r2 = r4.b
            int r2 = r2.getDuration()
            com.devlin_n.videoplayer.controller.BaseVideoController$d r3 = r4.b
            int r3 = r3.getCurrentPosition()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r0 = (float) r2
            float r5 = r5 * r0
            float r0 = (float) r3
            float r5 = r5 + r0
            int r5 = (int) r5
            if (r5 <= r3) goto L33
            com.devlin_n.videoplayer.widget.CenterView r0 = r4.d
            int r3 = com.devlin_n.videoplayer.R.drawable.ic_action_fast_forward
            r0.setIcon(r3)
            goto L3a
        L33:
            com.devlin_n.videoplayer.widget.CenterView r0 = r4.d
            int r3 = com.devlin_n.videoplayer.R.drawable.ic_action_fast_rewind
            r0.setIcon(r3)
        L3a:
            if (r5 <= r2) goto L3d
            r5 = r2
        L3d:
            if (r5 >= 0) goto L40
            goto L41
        L40:
            r1 = r5
        L41:
            r4.t = r1
            com.devlin_n.videoplayer.widget.CenterView r5 = r4.d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r4.k(r1)
            r0.append(r1)
            java.lang.String r1 = "/"
            r0.append(r1)
            java.lang.String r1 = r4.k(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.setTextView(r0)
            r5 = 1
            r4.u = r5
            return
    }

    protected void j(float r7) {
            r6 = this;
            com.devlin_n.videoplayer.widget.CenterView r0 = r6.d
            r1 = 0
            r0.setVisibility(r1)
            r6.d()
            com.devlin_n.videoplayer.widget.CenterView r0 = r6.d
            r0.setProVisibility(r1)
            android.media.AudioManager r0 = r6.e
            r2 = 3
            int r0 = r0.getStreamMaxVolume(r2)
            int r3 = r6.getMeasuredHeight()
            r4 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 * r4
            float r3 = (float) r3
            float r7 = r7 / r3
            float r0 = (float) r0
            float r7 = r7 * r0
            int r3 = r6.r
            float r3 = (float) r3
            float r3 = r3 + r7
            int r7 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r7 <= 0) goto L2b
            r3 = r0
        L2b:
            r7 = 0
            int r4 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r4 >= 0) goto L39
            com.devlin_n.videoplayer.widget.CenterView r3 = r6.d
            int r4 = com.devlin_n.videoplayer.R.drawable.ic_action_volume_off
            r3.setIcon(r4)
            r3 = 0
            goto L40
        L39:
            com.devlin_n.videoplayer.widget.CenterView r7 = r6.d
            int r4 = com.devlin_n.videoplayer.R.drawable.ic_action_volume_up
            r7.setIcon(r4)
        L40:
            float r7 = r3 / r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r7 = r7 * r0
            int r7 = (int) r7
            com.devlin_n.videoplayer.widget.CenterView r0 = r6.d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            java.lang.String r5 = "%"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r0.setTextView(r4)
            com.devlin_n.videoplayer.widget.CenterView r0 = r6.d
            r0.setProPercent(r7)
            android.media.AudioManager r7 = r6.e
            int r0 = (int) r3
            r7.setStreamVolume(r2, r0, r1)
            return
    }

    protected java.lang.String k(int r8) {
            r7 = this;
            int r8 = r8 / 1000
            int r0 = r8 % 60
            int r1 = r8 / 60
            int r1 = r1 % 60
            int r8 = r8 / 3600
            java.lang.StringBuilder r2 = r7.h
            r3 = 0
            r2.setLength(r3)
            r2 = 2
            r4 = 1
            if (r8 <= 0) goto L36
            java.util.Formatter r5 = r7.i
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r3] = r8
            r6[r4] = r1
            r6[r2] = r0
            java.lang.String r8 = "%d:%02d:%02d"
            java.util.Formatter r8 = r5.format(r8, r6)
            java.lang.String r8 = r8.toString()
            return r8
        L36:
            java.util.Formatter r8 = r7.i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r3] = r1
            r2[r4] = r0
            java.lang.String r0 = "%02d:%02d"
            java.util.Formatter r8 = r8.format(r0, r2)
            java.lang.String r8 = r8.toString()
            return r8
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            java.lang.Runnable r0 = r1.p
            r1.post(r0)
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getAction()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L9
            goto La
        L9:
            r2 = 0
        La:
            android.view.GestureDetector r0 = r3.j
            boolean r0 = r0.onTouchEvent(r4)
            if (r0 != 0) goto L30
            if (r2 == 0) goto L30
            com.devlin_n.videoplayer.widget.CenterView r0 = r3.d
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L23
            com.devlin_n.videoplayer.widget.CenterView r0 = r3.d
            r2 = 8
            r0.setVisibility(r2)
        L23:
            boolean r0 = r3.u
            if (r0 == 0) goto L30
            com.devlin_n.videoplayer.controller.BaseVideoController$d r0 = r3.b
            int r2 = r3.t
            r0.seekTo(r2)
            r3.u = r1
        L30:
            boolean r4 = super.onTouchEvent(r4)
            return r4
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int r1) {
            r0 = this;
            super.onWindowVisibilityChanged(r1)
            if (r1 != 0) goto La
            java.lang.Runnable r1 = r0.p
            r0.post(r1)
        La:
            return
    }

    public void setControllerListener(f1.a r1) {
            r0 = this;
            r0.n = r1
            return
    }

    public void setMediaPlayer(com.devlin_n.videoplayer.controller.BaseVideoController.d r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public void setPlayState(int r1) {
            r0 = this;
            r0.o = r1
            return
    }

    public void setPlayerState(int r1) {
            r0 = this;
            return
    }
}
