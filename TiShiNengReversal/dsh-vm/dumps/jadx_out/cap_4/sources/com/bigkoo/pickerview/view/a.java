package com.bigkoo.pickerview.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a {
    private final android.widget.FrameLayout.LayoutParams a;
    private android.content.Context b;
    protected android.view.ViewGroup c;
    private android.view.ViewGroup d;
    private android.view.ViewGroup e;
    private android.view.ViewGroup f;
    protected int g;
    protected int h;
    protected int i;
    protected int j;
    protected int k;

    /* renamed from: l, reason: collision with root package name */
    private o.b f287l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f288m;

    /* renamed from: n, reason: collision with root package name */
    private android.view.animation.Animation f289n;

    /* renamed from: o, reason: collision with root package name */
    private android.view.animation.Animation f290o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f291p;

    /* renamed from: q, reason: collision with root package name */
    private int f292q;

    /* renamed from: r, reason: collision with root package name */
    private android.app.Dialog f293r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f294s;

    /* renamed from: t, reason: collision with root package name */
    protected android.view.View f295t;

    /* renamed from: u, reason: collision with root package name */
    private android.view.View.OnKeyListener f296u;

    /* renamed from: v, reason: collision with root package name */
    private final android.view.View.OnTouchListener f297v;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.bigkoo.pickerview.view.a$a, reason: collision with other inner class name */
    class ViewOnClickListenerC0009a implements android.view.View.OnClickListener {
        final /* synthetic */ com.bigkoo.pickerview.view.a a;

        ViewOnClickListenerC0009a(com.bigkoo.pickerview.view.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.bigkoo.pickerview.view.a r1 = r0.a
                r1.d()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements android.view.animation.Animation.AnimationListener {
        final /* synthetic */ com.bigkoo.pickerview.view.a a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bigkoo.pickerview.view.a$b$a, reason: collision with other inner class name */
        class RunnableC0010a implements java.lang.Runnable {
            final /* synthetic */ com.bigkoo.pickerview.view.a.b a;

            RunnableC0010a(com.bigkoo.pickerview.view.a.b r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r1 = this;
                    com.bigkoo.pickerview.view.a$b r0 = r1.a
                    com.bigkoo.pickerview.view.a r0 = r0.a
                    r0.f()
                    return
            }
        }

        b(com.bigkoo.pickerview.view.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(android.view.animation.Animation r2) {
                r1 = this;
                com.bigkoo.pickerview.view.a r2 = r1.a
                android.view.ViewGroup r2 = com.bigkoo.pickerview.view.a.a(r2)
                com.bigkoo.pickerview.view.a$b$a r0 = new com.bigkoo.pickerview.view.a$b$a
                r0.<init>(r1)
                r2.post(r0)
                return
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(android.view.animation.Animation r1) {
                r0 = this;
                return
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(android.view.animation.Animation r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements android.view.View.OnKeyListener {
        final /* synthetic */ com.bigkoo.pickerview.view.a a;

        c(com.bigkoo.pickerview.view.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(android.view.View r1, int r2, android.view.KeyEvent r3) {
                r0 = this;
                r1 = 4
                if (r2 != r1) goto L18
                int r1 = r3.getAction()
                if (r1 != 0) goto L18
                com.bigkoo.pickerview.view.a r1 = r0.a
                boolean r1 = r1.n()
                if (r1 == 0) goto L18
                com.bigkoo.pickerview.view.a r1 = r0.a
                r1.d()
                r1 = 1
                return r1
            L18:
                r1 = 0
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements android.view.View.OnTouchListener {
        final /* synthetic */ com.bigkoo.pickerview.view.a a;

        d(com.bigkoo.pickerview.view.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(android.view.View r1, android.view.MotionEvent r2) {
                r0 = this;
                int r1 = r2.getAction()
                if (r1 != 0) goto Lb
                com.bigkoo.pickerview.view.a r1 = r0.a
                r1.d()
            Lb:
                r1 = 0
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e implements android.content.DialogInterface.OnDismissListener {
        final /* synthetic */ com.bigkoo.pickerview.view.a a;

        e(com.bigkoo.pickerview.view.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(android.content.DialogInterface r2) {
                r1 = this;
                com.bigkoo.pickerview.view.a r2 = r1.a
                o.b r2 = com.bigkoo.pickerview.view.a.b(r2)
                if (r2 == 0) goto L13
                com.bigkoo.pickerview.view.a r2 = r1.a
                o.b r2 = com.bigkoo.pickerview.view.a.b(r2)
                com.bigkoo.pickerview.view.a r0 = r1.a
                r2.a(r0)
            L13:
                return
        }
    }

    public a(android.content.Context r5) {
            r4 = this;
            r4.<init>()
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -1
            r2 = -2
            r3 = 80
            r0.<init>(r1, r2, r3)
            r4.a = r0
            r0 = -16417281(0xffffffffff057dff, float:-1.7744153E38)
            r4.g = r0
            r0 = -4007179(0xffffffffffc2daf5, float:NaN)
            r4.h = r0
            r0 = -657931(0xfffffffffff5f5f5, float:NaN)
            r4.i = r0
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r4.j = r0
            r4.k = r1
            r4.f292q = r3
            com.bigkoo.pickerview.view.a$c r0 = new com.bigkoo.pickerview.view.a$c
            r0.<init>(r4)
            r4.f296u = r0
            com.bigkoo.pickerview.view.a$d r0 = new com.bigkoo.pickerview.view.a$d
            r0.<init>(r4)
            r4.f297v = r0
            r4.b = r5
            return
    }

    static /* synthetic */ android.view.ViewGroup a(com.bigkoo.pickerview.view.a r0) {
            android.view.ViewGroup r0 = r0.d
            return r0
    }

    static /* synthetic */ o.b b(com.bigkoo.pickerview.view.a r0) {
            o.b r0 = r0.f287l
            return r0
    }

    private void o(android.view.View r2) {
            r1 = this;
            android.view.ViewGroup r0 = r1.d
            r0.addView(r2)
            android.view.ViewGroup r2 = r1.c
            android.view.animation.Animation r0 = r1.f290o
            r2.startAnimation(r0)
            return
    }

    public void c() {
            r3 = this;
            android.view.ViewGroup r0 = r3.f
            if (r0 == 0) goto L25
            android.app.Dialog r0 = new android.app.Dialog
            android.content.Context r1 = r3.b
            int r2 = com.bigkoo.pickerview.R.style.custom_dialog2
            r0.<init>(r1, r2)
            r3.f293r = r0
            boolean r1 = r3.f294s
            r0.setCancelable(r1)
            android.app.Dialog r0 = r3.f293r
            android.view.ViewGroup r1 = r3.f
            r0.setContentView(r1)
            android.app.Dialog r0 = r3.f293r
            com.bigkoo.pickerview.view.a$e r1 = new com.bigkoo.pickerview.view.a$e
            r1.<init>(r3)
            r0.setOnDismissListener(r1)
        L25:
            return
    }

    public void d() {
            r2 = this;
            boolean r0 = r2.m()
            if (r0 == 0) goto La
            r2.e()
            return
        La:
            boolean r0 = r2.f288m
            if (r0 == 0) goto Lf
            return
        Lf:
            r0 = 1
            r2.f288m = r0
            android.view.animation.Animation r0 = r2.f289n
            com.bigkoo.pickerview.view.a$b r1 = new com.bigkoo.pickerview.view.a$b
            r1.<init>(r2)
            r0.setAnimationListener(r1)
            android.view.ViewGroup r0 = r2.c
            android.view.animation.Animation r1 = r2.f289n
            r0.startAnimation(r1)
            return
    }

    public void e() {
            r1 = this;
            android.app.Dialog r0 = r1.f293r
            if (r0 == 0) goto L7
            r0.dismiss()
        L7:
            return
    }

    public void f() {
            r2 = this;
            android.view.ViewGroup r0 = r2.d
            android.view.ViewGroup r1 = r2.e
            r0.removeView(r1)
            r0 = 0
            r2.f291p = r0
            r2.f288m = r0
            o.b r0 = r2.f287l
            if (r0 == 0) goto L13
            r0.a(r2)
        L13:
            return
    }

    public android.view.View g(int r2) {
            r1 = this;
            android.view.ViewGroup r0 = r1.c
            android.view.View r2 = r0.findViewById(r2)
            return r2
    }

    public android.view.animation.Animation h() {
            r2 = this;
            int r0 = r2.f292q
            r1 = 1
            int r0 = q.a.a(r0, r1)
            android.content.Context r1 = r2.b
            android.view.animation.Animation r0 = android.view.animation.AnimationUtils.loadAnimation(r1, r0)
            return r0
    }

    public android.view.animation.Animation i() {
            r2 = this;
            int r0 = r2.f292q
            r1 = 0
            int r0 = q.a.a(r0, r1)
            android.content.Context r1 = r2.b
            android.view.animation.Animation r0 = android.view.animation.AnimationUtils.loadAnimation(r1, r0)
            return r0
    }

    protected void j() {
            r1 = this;
            android.view.animation.Animation r0 = r1.h()
            r1.f290o = r0
            android.view.animation.Animation r0 = r1.i()
            r1.f289n = r0
            return
    }

    protected void k() {
            r0 = this;
            return
    }

    protected void l() {
            r4 = this;
            android.content.Context r0 = r4.b
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            boolean r1 = r4.m()
            r2 = 0
            if (r1 == 0) goto L40
            int r1 = com.bigkoo.pickerview.R.layout.layout_basepickerview
            r3 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r4.f = r0
            r0.setBackgroundColor(r2)
            android.view.ViewGroup r0 = r4.f
            int r1 = com.bigkoo.pickerview.R.id.content_container
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r4.c = r0
            android.widget.FrameLayout$LayoutParams r1 = r4.a
            r2 = 30
            r1.leftMargin = r2
            r1.rightMargin = r2
            r0.setLayoutParams(r1)
            r4.c()
            android.view.ViewGroup r0 = r4.f
            com.bigkoo.pickerview.view.a$a r1 = new com.bigkoo.pickerview.view.a$a
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            goto L7b
        L40:
            android.content.Context r1 = r4.b
            android.app.Activity r1 = (android.app.Activity) r1
            android.view.Window r1 = r1.getWindow()
            android.view.View r1 = r1.getDecorView()
            r3 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r1.findViewById(r3)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r4.d = r1
            int r3 = com.bigkoo.pickerview.R.layout.layout_basepickerview
            android.view.View r0 = r0.inflate(r3, r1, r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r4.e = r0
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = -1
            r1.<init>(r2, r2)
            r0.setLayoutParams(r1)
            android.view.ViewGroup r0 = r4.e
            int r1 = com.bigkoo.pickerview.R.id.content_container
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r4.c = r0
            android.widget.FrameLayout$LayoutParams r1 = r4.a
            r0.setLayoutParams(r1)
        L7b:
            r0 = 1
            r4.q(r0)
            return
    }

    public boolean m() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean n() {
            r2 = this;
            boolean r0 = r2.m()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            android.view.ViewGroup r0 = r2.e
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L16
            boolean r0 = r2.f291p
            if (r0 == 0) goto L15
            goto L16
        L15:
            return r1
        L16:
            r0 = 1
            return r0
    }

    public void p(boolean r1) {
            r0 = this;
            r0.f294s = r1
            return
    }

    public com.bigkoo.pickerview.view.a q(boolean r2) {
            r1 = this;
            boolean r0 = r1.m()
            if (r0 == 0) goto L9
            android.view.ViewGroup r0 = r1.f
            goto Lb
        L9:
            android.view.ViewGroup r0 = r1.e
        Lb:
            r0.setFocusable(r2)
            r0.setFocusableInTouchMode(r2)
            if (r2 == 0) goto L19
            android.view.View$OnKeyListener r2 = r1.f296u
            r0.setOnKeyListener(r2)
            return r1
        L19:
            r2 = 0
            r0.setOnKeyListener(r2)
            return r1
    }

    public com.bigkoo.pickerview.view.a r(o.b r1) {
            r0 = this;
            r0.f287l = r1
            return r0
    }

    protected com.bigkoo.pickerview.view.a s(boolean r3) {
            r2 = this;
            android.view.ViewGroup r0 = r2.e
            if (r0 == 0) goto L16
            int r1 = com.bigkoo.pickerview.R.id.outmost_container
            android.view.View r0 = r0.findViewById(r1)
            if (r3 == 0) goto L12
            android.view.View$OnTouchListener r3 = r2.f297v
            r0.setOnTouchListener(r3)
            return r2
        L12:
            r3 = 0
            r0.setOnTouchListener(r3)
        L16:
            return r2
    }

    public void t() {
            r1 = this;
            boolean r0 = r1.m()
            if (r0 == 0) goto La
            r1.v()
            return
        La:
            boolean r0 = r1.n()
            if (r0 == 0) goto L11
            return
        L11:
            r0 = 1
            r1.f291p = r0
            android.view.ViewGroup r0 = r1.e
            r1.o(r0)
            android.view.ViewGroup r0 = r1.e
            r0.requestFocus()
            return
    }

    public void u(android.view.View r1) {
            r0 = this;
            r0.f295t = r1
            r0.t()
            return
    }

    public void v() {
            r1 = this;
            android.app.Dialog r0 = r1.f293r
            if (r0 == 0) goto L7
            r0.show()
        L7:
            return
    }
}
