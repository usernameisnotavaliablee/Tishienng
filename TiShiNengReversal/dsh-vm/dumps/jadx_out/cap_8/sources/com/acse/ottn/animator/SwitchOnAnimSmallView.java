package com.acse.ottn.animator;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class SwitchOnAnimSmallView extends android.widget.FrameLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final int f2126g = 300;

    /* renamed from: h, reason: collision with root package name */
    public static final int f2127h = 500;
    public android.os.Handler a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ImageView f2128b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.ImageView f2129c;

    /* renamed from: d, reason: collision with root package name */
    public float f2130d;

    /* renamed from: e, reason: collision with root package name */
    public float f2131e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2132f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a extends com.acse.ottn.b0 {
        public final /* synthetic */ com.acse.ottn.animator.SwitchOnAnimSmallView a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.acse.ottn.animator.SwitchOnAnimSmallView$a$a, reason: collision with other inner class name */
        public class RunnableC0061a implements java.lang.Runnable {
            public final /* synthetic */ com.acse.ottn.animator.SwitchOnAnimSmallView.a a;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            /* renamed from: com.acse.ottn.animator.SwitchOnAnimSmallView$a$a$a, reason: collision with other inner class name */
            public class RunnableC0062a implements java.lang.Runnable {
                public final /* synthetic */ com.acse.ottn.animator.SwitchOnAnimSmallView.a.RunnableC0061a a;

                public RunnableC0062a(com.acse.ottn.animator.SwitchOnAnimSmallView.a.RunnableC0061a r1) {
                        r0 = this;
                        r0.a = r1
                        r0.<init>()
                        return
                }

                @Override // java.lang.Runnable
                public void run() {
                        r2 = this;
                        com.acse.ottn.animator.SwitchOnAnimSmallView$a$a r0 = r2.a
                        com.acse.ottn.animator.SwitchOnAnimSmallView$a r0 = r0.a
                        com.acse.ottn.animator.SwitchOnAnimSmallView r0 = r0.a
                        android.widget.ImageView r0 = com.acse.ottn.animator.SwitchOnAnimSmallView.a(r0)
                        if (r0 == 0) goto L1b
                        com.acse.ottn.animator.SwitchOnAnimSmallView$a$a r0 = r2.a
                        com.acse.ottn.animator.SwitchOnAnimSmallView$a r0 = r0.a
                        com.acse.ottn.animator.SwitchOnAnimSmallView r0 = r0.a
                        android.widget.ImageView r0 = com.acse.ottn.animator.SwitchOnAnimSmallView.a(r0)
                        int r1 = com.acse.ottn.R.mipmap.finger_normal
                        r0.setBackgroundResource(r1)
                    L1b:
                        com.acse.ottn.animator.SwitchOnAnimSmallView$a$a r0 = r2.a
                        com.acse.ottn.animator.SwitchOnAnimSmallView$a r0 = r0.a
                        com.acse.ottn.animator.SwitchOnAnimSmallView r0 = r0.a
                        com.acse.ottn.animator.SwitchOnAnimSmallView.e(r0)
                        return
                }
            }

            public RunnableC0061a(com.acse.ottn.animator.SwitchOnAnimSmallView.a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r4 = this;
                    com.acse.ottn.animator.SwitchOnAnimSmallView$a r0 = r4.a
                    com.acse.ottn.animator.SwitchOnAnimSmallView r0 = r0.a
                    android.widget.ImageView r0 = com.acse.ottn.animator.SwitchOnAnimSmallView.c(r0)
                    if (r0 == 0) goto L3b
                    com.acse.ottn.animator.SwitchOnAnimSmallView$a r0 = r4.a
                    com.acse.ottn.animator.SwitchOnAnimSmallView r0 = r0.a
                    android.os.Handler r0 = com.acse.ottn.animator.SwitchOnAnimSmallView.b(r0)
                    if (r0 != 0) goto L15
                    goto L3b
                L15:
                    com.acse.ottn.animator.SwitchOnAnimSmallView$a r0 = r4.a
                    com.acse.ottn.animator.SwitchOnAnimSmallView r0 = r0.a
                    android.widget.ImageView r0 = com.acse.ottn.animator.SwitchOnAnimSmallView.c(r0)
                    int r1 = com.acse.ottn.R.mipmap.switch_on_circle_point
                    r0.setBackgroundResource(r1)
                    com.acse.ottn.animator.SwitchOnAnimSmallView$a r0 = r4.a
                    com.acse.ottn.animator.SwitchOnAnimSmallView r0 = r0.a
                    com.acse.ottn.animator.SwitchOnAnimSmallView.d(r0)
                    com.acse.ottn.animator.SwitchOnAnimSmallView$a r0 = r4.a
                    com.acse.ottn.animator.SwitchOnAnimSmallView r0 = r0.a
                    android.os.Handler r0 = com.acse.ottn.animator.SwitchOnAnimSmallView.b(r0)
                    com.acse.ottn.animator.SwitchOnAnimSmallView$a$a$a r1 = new com.acse.ottn.animator.SwitchOnAnimSmallView$a$a$a
                    r1.<init>(r4)
                    r2 = 100
                    r0.postDelayed(r1, r2)
                L3b:
                    return
            }
        }

        public a(com.acse.ottn.animator.SwitchOnAnimSmallView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.b0, com.acse.ottn.j.a
        public void b(com.acse.ottn.j r4) {
                r3 = this;
                com.acse.ottn.animator.SwitchOnAnimSmallView r4 = r3.a
                android.widget.ImageView r4 = com.acse.ottn.animator.SwitchOnAnimSmallView.a(r4)
                if (r4 == 0) goto L2c
                com.acse.ottn.animator.SwitchOnAnimSmallView r4 = r3.a
                android.os.Handler r4 = com.acse.ottn.animator.SwitchOnAnimSmallView.b(r4)
                if (r4 != 0) goto L11
                goto L2c
            L11:
                com.acse.ottn.animator.SwitchOnAnimSmallView r4 = r3.a
                android.widget.ImageView r4 = com.acse.ottn.animator.SwitchOnAnimSmallView.a(r4)
                int r0 = com.acse.ottn.R.mipmap.finger_click
                r4.setBackgroundResource(r0)
                com.acse.ottn.animator.SwitchOnAnimSmallView r4 = r3.a
                android.os.Handler r4 = com.acse.ottn.animator.SwitchOnAnimSmallView.b(r4)
                com.acse.ottn.animator.SwitchOnAnimSmallView$a$a r0 = new com.acse.ottn.animator.SwitchOnAnimSmallView$a$a
                r0.<init>(r3)
                r1 = 200(0xc8, double:9.9E-322)
                r4.postDelayed(r0, r1)
            L2c:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b extends com.acse.ottn.b0 {
        public final /* synthetic */ com.acse.ottn.animator.SwitchOnAnimSmallView a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public class a implements java.lang.Runnable {
            public final /* synthetic */ com.acse.ottn.animator.SwitchOnAnimSmallView.b a;

            public a(com.acse.ottn.animator.SwitchOnAnimSmallView.b r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r1 = this;
                    com.acse.ottn.animator.SwitchOnAnimSmallView$b r0 = r1.a
                    com.acse.ottn.animator.SwitchOnAnimSmallView r0 = r0.a
                    boolean r0 = com.acse.ottn.animator.SwitchOnAnimSmallView.f(r0)
                    if (r0 == 0) goto Lb
                    return
                Lb:
                    com.acse.ottn.animator.SwitchOnAnimSmallView$b r0 = r1.a
                    com.acse.ottn.animator.SwitchOnAnimSmallView r0 = r0.a
                    r0.b()
                    return
            }
        }

        public b(com.acse.ottn.animator.SwitchOnAnimSmallView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.b0, com.acse.ottn.j.a
        public void b(com.acse.ottn.j r4) {
                r3 = this;
                com.acse.ottn.animator.SwitchOnAnimSmallView r4 = r3.a
                android.os.Handler r4 = com.acse.ottn.animator.SwitchOnAnimSmallView.b(r4)
                com.acse.ottn.animator.SwitchOnAnimSmallView$b$a r0 = new com.acse.ottn.animator.SwitchOnAnimSmallView$b$a
                r0.<init>(r3)
                r1 = 1000(0x3e8, double:4.94E-321)
                r4.postDelayed(r0, r1)
                return
        }
    }

    public SwitchOnAnimSmallView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SwitchOnAnimSmallView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            android.os.Handler r3 = new android.os.Handler
            r3.<init>()
            r1.a = r3
            r3 = 0
            r1.f2132f = r3
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            int r3 = com.acse.ottn.R.layout.finger_switch_on_guide_small_layout
            r0 = 1
            r2.inflate(r3, r1, r0)
            r1.a()
            return
    }

    public static /* synthetic */ android.widget.ImageView a(com.acse.ottn.animator.SwitchOnAnimSmallView r0) {
            android.widget.ImageView r0 = r0.f2129c
            return r0
    }

    public static /* synthetic */ android.os.Handler b(com.acse.ottn.animator.SwitchOnAnimSmallView r0) {
            android.os.Handler r0 = r0.a
            return r0
    }

    public static /* synthetic */ android.widget.ImageView c(com.acse.ottn.animator.SwitchOnAnimSmallView r0) {
            android.widget.ImageView r0 = r0.f2128b
            return r0
    }

    public static /* synthetic */ void d(com.acse.ottn.animator.SwitchOnAnimSmallView r0) {
            r0.c()
            return
    }

    public static /* synthetic */ void e(com.acse.ottn.animator.SwitchOnAnimSmallView r0) {
            r0.d()
            return
    }

    public static /* synthetic */ boolean f(com.acse.ottn.animator.SwitchOnAnimSmallView r0) {
            boolean r0 = r0.f2132f
            return r0
    }

    public final void a() {
            r2 = this;
            int r0 = com.acse.ottn.R.id.switch_anim_circle_point
            android.view.View r0 = r2.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.f2128b = r0
            int r0 = com.acse.ottn.R.id.finger_switch
            android.view.View r0 = r2.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.f2129c = r0
            android.content.Context r0 = r2.getContext()
            r1 = 1090519040(0x41000000, float:8.0)
            float r0 = com.acse.ottn.y4.a(r0, r1)
            r2.f2130d = r0
            android.content.Context r0 = r2.getContext()
            r1 = 1084227584(0x40a00000, float:5.0)
            float r0 = com.acse.ottn.y4.a(r0, r1)
            r2.f2131e = r0
            return
    }

    public void b() {
            r2 = this;
            r0 = 0
            r2.f2132f = r0
            android.widget.ImageView r0 = r2.f2128b
            r1 = 0
            com.acse.ottn.t4.i(r0, r1)
            android.widget.ImageView r0 = r2.f2128b
            int r1 = com.acse.ottn.R.mipmap.switch_off_circle_point
            r0.setBackgroundResource(r1)
            android.widget.ImageView r0 = r2.f2129c
            int r1 = com.acse.ottn.R.mipmap.finger_normal
            r0.setBackgroundResource(r1)
            r2.e()
            return
    }

    public final void c() {
            r5 = this;
            android.widget.ImageView r0 = r5.f2128b
            if (r0 != 0) goto L5
            return
        L5:
            float r1 = r5.f2131e
            r2 = 2
            float[] r2 = new float[r2]
            r3 = 0
            r4 = 0
            r2[r4] = r3
            r3 = 1
            r2[r3] = r1
            java.lang.String r1 = "translationX"
            com.acse.ottn.z2 r0 = com.acse.ottn.z2.a(r0, r1, r2)
            r1 = 500(0x1f4, double:2.47E-321)
            r0.h(r1)
            r0.k()
            return
    }

    public final void d() {
            r4 = this;
            android.widget.ImageView r0 = r4.f2129c
            if (r0 != 0) goto L5
            return
        L5:
            float r1 = r4.f2130d
            float r1 = -r1
            r2 = 2
            float[] r2 = new float[r2]
            r3 = 0
            r2[r3] = r1
            r1 = 0
            r3 = 1
            r2[r3] = r1
            java.lang.String r1 = "translationY"
            com.acse.ottn.z2 r0 = com.acse.ottn.z2.a(r0, r1, r2)
            r1 = 300(0x12c, double:1.48E-321)
            r0.h(r1)
            com.acse.ottn.animator.SwitchOnAnimSmallView$b r1 = new com.acse.ottn.animator.SwitchOnAnimSmallView$b
            r1.<init>(r4)
            r0.a(r1)
            r0.k()
            return
    }

    public final void e() {
            r5 = this;
            android.widget.ImageView r0 = r5.f2129c
            float r1 = r5.f2130d
            float r1 = -r1
            r2 = 2
            float[] r2 = new float[r2]
            r3 = 0
            r4 = 0
            r2[r4] = r3
            r3 = 1
            r2[r3] = r1
            java.lang.String r1 = "translationY"
            com.acse.ottn.z2 r0 = com.acse.ottn.z2.a(r0, r1, r2)
            r1 = 300(0x12c, double:1.48E-321)
            r0.h(r1)
            com.acse.ottn.animator.SwitchOnAnimSmallView$a r1 = new com.acse.ottn.animator.SwitchOnAnimSmallView$a
            r1.<init>(r5)
            r0.a(r1)
            r0.k()
            return
    }

    public void f() {
            r1 = this;
            r0 = 1
            r1.f2132f = r0
            return
    }

    public void setFingerVisible(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L9
            android.widget.ImageView r2 = r1.f2129c
            r0 = 0
            r2.setVisibility(r0)
            return
        L9:
            android.widget.ImageView r2 = r1.f2129c
            r0 = 8
            r2.setVisibility(r0)
            return
    }
}
