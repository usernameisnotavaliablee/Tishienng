package com.acse.ottn.service;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f2698c = "ViewUtil";

    /* renamed from: d, reason: collision with root package name */
    public static com.acse.ottn.service.a f2699d;

    /* renamed from: e, reason: collision with root package name */
    public static java.util.TimerTask f2700e;
    public float a;

    /* renamed from: b, reason: collision with root package name */
    public float f2701b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.acse.ottn.service.a$a, reason: collision with other inner class name */
    public class C0082a implements com.acse.ottn.n0.d {
        public final /* synthetic */ com.acse.ottn.service.a.u0 a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.acse.ottn.service.a$a$a, reason: collision with other inner class name */
        public class RunnableC0083a implements java.lang.Runnable {
            public final /* synthetic */ com.acse.ottn.service.a.C0082a a;

            public RunnableC0083a(com.acse.ottn.service.a.C0082a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r1 = this;
                    boolean r0 = com.acse.ottn.l0.f2434e
                    boolean r0 = com.acse.ottn.l0.f2434e
                    if (r0 != 0) goto L17
                    java.util.TimerTask r0 = com.acse.ottn.service.a.f2700e
                    if (r0 == 0) goto L10
                    r0.cancel()
                    r0 = 0
                    com.acse.ottn.service.a.f2700e = r0
                L10:
                    com.acse.ottn.service.a$a r0 = r1.a
                    com.acse.ottn.service.a$u0 r0 = r0.a
                    com.acse.ottn.service.a.a(r0)
                L17:
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.acse.ottn.service.a$a$b */
        public class b implements java.lang.Runnable {
            public final /* synthetic */ com.acse.ottn.service.a.C0082a a;

            public b(com.acse.ottn.service.a.C0082a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r1 = this;
                    com.acse.ottn.service.a$a r0 = r1.a
                    com.acse.ottn.service.a$u0 r0 = r0.a
                    com.acse.ottn.service.a.a(r0)
                    return
            }
        }

        public C0082a(com.acse.ottn.service.a.u0 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a() {
                r4 = this;
                java.lang.String r0 = com.acse.ottn.service.a.a()
                java.lang.String r1 = "结束了"
                com.acse.ottn.h2.a(r0, r1)
                android.os.Handler r0 = new android.os.Handler
                android.os.Looper r1 = android.os.Looper.getMainLooper()
                r0.<init>(r1)
                com.acse.ottn.service.a$a$b r1 = new com.acse.ottn.service.a$a$b
                r1.<init>(r4)
                r2 = 0
                r0.postDelayed(r1, r2)
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a(long r3) {
                r2 = this;
                android.os.Handler r3 = new android.os.Handler
                android.os.Looper r4 = android.os.Looper.getMainLooper()
                r3.<init>(r4)
                com.acse.ottn.service.a$a$a r4 = new com.acse.ottn.service.a$a$a
                r4.<init>(r2)
                r0 = 0
                r3.postDelayed(r4, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a0 implements android.view.View.OnClickListener {
        public final /* synthetic */ com.acse.ottn.service.a.u0 a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2702b;

        public a0(com.acse.ottn.service.a r1, com.acse.ottn.service.a.u0 r2) {
                r0 = this;
                r0.f2702b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.acse.ottn.service.a$u0 r1 = r0.a
                com.acse.ottn.service.a.a(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b implements android.view.View.OnClickListener {
        public final /* synthetic */ com.acse.ottn.service.a.u0 a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2703b;

        public b(com.acse.ottn.service.a r1, com.acse.ottn.service.a.u0 r2) {
                r0 = this;
                r0.f2703b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.acse.ottn.service.a$u0 r1 = r0.a
                com.acse.ottn.service.a.a(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b0 implements android.view.View.OnClickListener {
        public final /* synthetic */ android.content.Context a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.model.AccessiblityModel f2704b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a.u0 f2705c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2706d;

        public b0(com.acse.ottn.service.a r1, android.content.Context r2, com.acse.ottn.model.AccessiblityModel r3, com.acse.ottn.service.a.u0 r4) {
                r0 = this;
                r0.f2706d = r1
                r0.a = r2
                r0.f2704b = r3
                r0.f2705c = r4
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r4) {
                r3 = this;
                com.acse.ottn.service.a r4 = r3.f2706d
                android.content.Context r0 = r3.a
                com.acse.ottn.model.AccessiblityModel r1 = r3.f2704b
                com.acse.ottn.service.a$u0 r2 = r3.f2705c
                r4.a(r0, r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class c implements android.view.View.OnClickListener {
        public final /* synthetic */ android.content.Context a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.model.AccessiblityModel f2707b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a.u0 f2708c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2709d;

        public c(com.acse.ottn.service.a r1, android.content.Context r2, com.acse.ottn.model.AccessiblityModel r3, com.acse.ottn.service.a.u0 r4) {
                r0 = this;
                r0.f2709d = r1
                r0.a = r2
                r0.f2707b = r3
                r0.f2708c = r4
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r4) {
                r3 = this;
                com.acse.ottn.service.a r4 = r3.f2709d
                android.content.Context r0 = r3.a
                com.acse.ottn.model.AccessiblityModel r1 = r3.f2707b
                com.acse.ottn.service.a$u0 r2 = r3.f2708c
                r4.a(r0, r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class c0 implements android.view.View.OnClickListener {
        public final /* synthetic */ com.acse.ottn.service.a.u0 a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2710b;

        public c0(com.acse.ottn.service.a r1, com.acse.ottn.service.a.u0 r2) {
                r0 = this;
                r0.f2710b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.acse.ottn.service.a$u0 r1 = r0.a
                com.acse.ottn.service.a.a(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class d implements android.view.View.OnClickListener {
        public final /* synthetic */ com.acse.ottn.service.a.u0 a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2711b;

        public d(com.acse.ottn.service.a r1, com.acse.ottn.service.a.u0 r2) {
                r0 = this;
                r0.f2711b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.acse.ottn.service.a$u0 r1 = r0.a
                com.acse.ottn.service.a.a(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class d0 implements android.view.View.OnClickListener {
        public final /* synthetic */ android.content.Context a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.model.AccessiblityModel f2712b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a.u0 f2713c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2714d;

        public d0(com.acse.ottn.service.a r1, android.content.Context r2, com.acse.ottn.model.AccessiblityModel r3, com.acse.ottn.service.a.u0 r4) {
                r0 = this;
                r0.f2714d = r1
                r0.a = r2
                r0.f2712b = r3
                r0.f2713c = r4
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r4) {
                r3 = this;
                com.acse.ottn.service.a r4 = r3.f2714d
                android.content.Context r0 = r3.a
                com.acse.ottn.model.AccessiblityModel r1 = r3.f2712b
                com.acse.ottn.service.a$u0 r2 = r3.f2713c
                r4.a(r0, r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class e implements android.view.View.OnClickListener {
        public final /* synthetic */ android.content.Context a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.model.AccessiblityModel f2715b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a.u0 f2716c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2717d;

        public e(com.acse.ottn.service.a r1, android.content.Context r2, com.acse.ottn.model.AccessiblityModel r3, com.acse.ottn.service.a.u0 r4) {
                r0 = this;
                r0.f2717d = r1
                r0.a = r2
                r0.f2715b = r3
                r0.f2716c = r4
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r4) {
                r3 = this;
                com.acse.ottn.service.a r4 = r3.f2717d
                android.content.Context r0 = r3.a
                com.acse.ottn.model.AccessiblityModel r1 = r3.f2715b
                com.acse.ottn.service.a$u0 r2 = r3.f2716c
                r4.a(r0, r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class e0 implements android.view.View.OnClickListener {
        public final /* synthetic */ com.acse.ottn.service.a.u0 a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f2718b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f2719c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2720d;

        public e0(com.acse.ottn.service.a r1, com.acse.ottn.service.a.u0 r2, java.lang.String r3, boolean r4) {
                r0 = this;
                r0.f2720d = r1
                r0.a = r2
                r0.f2718b = r3
                r0.f2719c = r4
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                com.acse.ottn.service.a$u0 r3 = r2.a
                if (r3 == 0) goto L12
                com.acse.ottn.service.a r3 = r2.f2720d
                java.lang.String r0 = r2.f2718b
                boolean r1 = r2.f2719c
                com.acse.ottn.service.a.a(r3, r0, r1)
                com.acse.ottn.service.a$u0 r3 = r2.a
                com.acse.ottn.service.a.a(r3)
            L12:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class f implements android.view.View.OnClickListener {
        public final /* synthetic */ com.acse.ottn.service.a.u0 a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2721b;

        public f(com.acse.ottn.service.a r1, com.acse.ottn.service.a.u0 r2) {
                r0 = this;
                r0.f2721b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.acse.ottn.service.a$u0 r1 = r0.a
                com.acse.ottn.service.a.a(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class f0 implements android.view.View.OnClickListener {
        public final /* synthetic */ com.acse.ottn.service.a.u0 a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2722b;

        public f0(com.acse.ottn.service.a r1, com.acse.ottn.service.a.u0 r2) {
                r0 = this;
                r0.f2722b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.acse.ottn.service.a$u0 r1 = r0.a
                com.acse.ottn.service.a.a(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class g implements android.view.View.OnClickListener {
        public final /* synthetic */ android.content.Context a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.model.AccessiblityModel f2723b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a.u0 f2724c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2725d;

        public g(com.acse.ottn.service.a r1, android.content.Context r2, com.acse.ottn.model.AccessiblityModel r3, com.acse.ottn.service.a.u0 r4) {
                r0 = this;
                r0.f2725d = r1
                r0.a = r2
                r0.f2723b = r3
                r0.f2724c = r4
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r4) {
                r3 = this;
                com.acse.ottn.service.a r4 = r3.f2725d
                android.content.Context r0 = r3.a
                com.acse.ottn.model.AccessiblityModel r1 = r3.f2723b
                com.acse.ottn.service.a$u0 r2 = r3.f2724c
                r4.a(r0, r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class g0 implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.Throwable> {
        public final /* synthetic */ com.acse.ottn.service.a.u0 a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2726b;

        public g0(com.acse.ottn.service.a r1, com.acse.ottn.service.a.u0 r2) {
                r0 = this;
                r0.f2726b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void a(java.lang.Throwable r4) throws java.lang.Exception {
                r3 = this;
                java.lang.String r0 = com.acse.ottn.service.a.a()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "报错了="
                r1.append(r2)
                java.lang.String r4 = r4.getMessage()
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                com.acse.ottn.h2.b(r0, r4)
                com.acse.ottn.service.a$u0 r4 = r3.a
                com.acse.ottn.service.a.a(r4)
                return
        }

        @Override // com.acse.ottn.io.reactivex.functions.Consumer
        public /* bridge */ /* synthetic */ void accept(java.lang.Throwable r1) throws java.lang.Exception {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.a(r1)
                return
        }

        @Override // com.acse.ottn.io.reactivex.functions.Consumer
        public /* synthetic */ void call(java.lang.Throwable r1) {
                r0 = this;
                com.acse.ottn.io.reactivex.functions.c.a(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class h implements android.view.View.OnClickListener {
        public final /* synthetic */ com.acse.ottn.service.a.u0 a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2727b;

        public h(com.acse.ottn.service.a r1, com.acse.ottn.service.a.u0 r2) {
                r0 = this;
                r0.f2727b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.acse.ottn.service.a$u0 r1 = r0.a
                com.acse.ottn.service.a.a(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class h0 implements android.view.View.OnClickListener {
        public final /* synthetic */ com.acse.ottn.service.a.u0 a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2728b;

        public h0(com.acse.ottn.service.a r1, com.acse.ottn.service.a.u0 r2) {
                r0 = this;
                r0.f2728b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.acse.ottn.service.a$u0 r1 = r0.a
                com.acse.ottn.service.a.a(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class i implements android.view.View.OnClickListener {
        public final /* synthetic */ android.content.Context a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.model.AccessiblityModel f2729b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a.u0 f2730c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2731d;

        public i(com.acse.ottn.service.a r1, android.content.Context r2, com.acse.ottn.model.AccessiblityModel r3, com.acse.ottn.service.a.u0 r4) {
                r0 = this;
                r0.f2731d = r1
                r0.a = r2
                r0.f2729b = r3
                r0.f2730c = r4
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r4) {
                r3 = this;
                com.acse.ottn.service.a r4 = r3.f2731d
                android.content.Context r0 = r3.a
                com.acse.ottn.model.AccessiblityModel r1 = r3.f2729b
                com.acse.ottn.service.a$u0 r2 = r3.f2730c
                r4.a(r0, r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class i0 implements android.view.View.OnClickListener {
        public final /* synthetic */ android.content.Context a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.model.AccessiblityModel f2732b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a.u0 f2733c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2734d;

        public i0(com.acse.ottn.service.a r1, android.content.Context r2, com.acse.ottn.model.AccessiblityModel r3, com.acse.ottn.service.a.u0 r4) {
                r0 = this;
                r0.f2734d = r1
                r0.a = r2
                r0.f2732b = r3
                r0.f2733c = r4
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r4) {
                r3 = this;
                com.acse.ottn.service.a r4 = r3.f2734d
                android.content.Context r0 = r3.a
                com.acse.ottn.model.AccessiblityModel r1 = r3.f2732b
                com.acse.ottn.service.a$u0 r2 = r3.f2733c
                r4.a(r0, r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class j implements android.view.View.OnClickListener {
        public final /* synthetic */ com.acse.ottn.service.a.u0 a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2735b;

        public j(com.acse.ottn.service.a r1, com.acse.ottn.service.a.u0 r2) {
                r0 = this;
                r0.f2735b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.acse.ottn.service.a$u0 r1 = r0.a
                com.acse.ottn.service.a.a(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class j0 implements android.view.View.OnTouchListener {
        public final /* synthetic */ android.widget.RelativeLayout a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f2736b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f2737c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a.u0 f2738d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.model.AccessiblityModel f2739e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ android.content.Context f2740f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2741g;

        public j0(com.acse.ottn.service.a r1, android.widget.RelativeLayout r2, float r3, float r4, com.acse.ottn.service.a.u0 r5, com.acse.ottn.model.AccessiblityModel r6, android.content.Context r7) {
                r0 = this;
                r0.f2741g = r1
                r0.a = r2
                r0.f2736b = r3
                r0.f2737c = r4
                r0.f2738d = r5
                r0.f2739e = r6
                r0.f2740f = r7
                r0.<init>()
                return
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
                r6 = this;
                com.acse.ottn.service.a.d()
                int r7 = r8.getAction()
                r0 = 1
                if (r7 == 0) goto L127
                r1 = 0
                if (r7 == r0) goto L79
                r2 = 2
                if (r7 == r2) goto L12
                goto L137
            L12:
                float r7 = r8.getX()
                com.acse.ottn.service.a r2 = r6.f2741g
                float r2 = r2.a
                float r7 = r7 - r2
                float r7 = java.lang.Math.abs(r7)
                float r2 = r8.getY()
                com.acse.ottn.service.a r3 = r6.f2741g
                float r3 = r3.f2701b
                float r2 = r2 - r3
                float r2 = java.lang.Math.abs(r2)
                r3 = 0
                int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                if (r7 <= 0) goto L55
                float r7 = r8.getX()
                com.acse.ottn.service.a r2 = r6.f2741g
                float r2 = r2.a
                float r7 = r7 - r2
                int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r7 >= 0) goto L3f
                return r1
            L3f:
                android.widget.RelativeLayout r7 = r6.a
                float r8 = r8.getX()
                com.acse.ottn.service.a r1 = r6.f2741g
                float r1 = r1.a
                float r8 = r8 - r1
                int r8 = (int) r8
                int r8 = -r8
                float r1 = r6.f2736b
                int r1 = (int) r1
                int r1 = -r1
                r7.scrollTo(r8, r1)
                goto L137
            L55:
                float r7 = r8.getY()
                com.acse.ottn.service.a r2 = r6.f2741g
                float r2 = r2.f2701b
                float r7 = r7 - r2
                int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r7 <= 0) goto L63
                return r1
            L63:
                android.widget.RelativeLayout r7 = r6.a
                float r1 = r6.f2737c
                int r1 = (int) r1
                int r1 = -r1
                float r8 = r8.getY()
                com.acse.ottn.service.a r2 = r6.f2741g
                float r2 = r2.f2701b
                float r8 = r8 - r2
                int r8 = (int) r8
                int r8 = -r8
                r7.scrollTo(r1, r8)
                goto L137
            L79:
                com.acse.ottn.service.a$u0 r7 = r6.f2738d
                r2 = 4000(0xfa0, float:5.605E-42)
                com.acse.ottn.service.a.a(r2, r7)
                com.acse.ottn.service.a r7 = r6.f2741g
                float r7 = r7.f2701b
                float r2 = r8.getY()
                float r7 = r7 - r2
                java.lang.String r2 = "close_coupon_window"
                r3 = 1120403456(0x42c80000, float:100.0)
                int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r7 <= 0) goto Laa
                android.widget.RelativeLayout r7 = r6.a
                float r8 = r6.f2737c
                int r8 = (int) r8
                int r8 = -r8
                r1 = 300(0x12c, float:4.2E-43)
                r7.scrollTo(r8, r1)
                com.acse.ottn.q2 r7 = com.acse.ottn.q2.b()
                r7.a(r2)
                com.acse.ottn.service.a$u0 r7 = r6.f2738d
                com.acse.ottn.service.a.a(r7)
                goto L137
            Laa:
                float r7 = r8.getX()
                com.acse.ottn.service.a r4 = r6.f2741g
                float r4 = r4.a
                float r7 = r7 - r4
                com.acse.ottn.n3 r4 = com.acse.ottn.n3.a()
                java.lang.String r5 = "screenWidth"
                int r4 = r4.c(r5)
                int r4 = r4 / 3
                float r4 = (float) r4
                int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                if (r7 <= 0) goto Le1
                android.widget.RelativeLayout r7 = r6.a
                com.acse.ottn.n3 r8 = com.acse.ottn.n3.a()
                int r8 = r8.c(r5)
                float r1 = r6.f2736b
                int r1 = (int) r1
                r7.scrollTo(r8, r1)
                com.acse.ottn.q2 r7 = com.acse.ottn.q2.b()
                r7.a(r2)
                com.acse.ottn.service.a$u0 r7 = r6.f2738d
                com.acse.ottn.service.a.a(r7)
                goto L137
            Le1:
                android.widget.RelativeLayout r7 = r6.a
                r7.scrollTo(r1, r1)
                com.acse.ottn.service.a r7 = r6.f2741g
                float r7 = r7.f2701b
                float r0 = r8.getY()
                float r7 = r7 - r0
                float r7 = java.lang.Math.abs(r7)
                int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r7 >= 0) goto L126
                com.acse.ottn.service.a r7 = r6.f2741g
                float r7 = r7.a
                float r8 = r8.getX()
                float r7 = r7 - r8
                float r7 = java.lang.Math.abs(r7)
                int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r7 >= 0) goto L126
                java.lang.String r7 = com.acse.ottn.service.a.a()
                java.lang.String r8 = "点击了"
                com.acse.ottn.h2.c(r7, r8)
                com.acse.ottn.model.AccessiblityModel r7 = r6.f2739e
                if (r7 != 0) goto L116
                return r1
            L116:
                com.acse.ottn.service.a$u0 r7 = r6.f2738d
                com.acse.ottn.service.a.a(r7)
                com.acse.ottn.service.a r7 = r6.f2741g
                android.content.Context r8 = r6.f2740f
                com.acse.ottn.model.AccessiblityModel r0 = r6.f2739e
                com.acse.ottn.service.a$u0 r2 = r6.f2738d
                r7.a(r8, r0, r2)
            L126:
                return r1
            L127:
                com.acse.ottn.service.a r7 = r6.f2741g
                float r1 = r8.getX()
                r7.a = r1
                com.acse.ottn.service.a r7 = r6.f2741g
                float r8 = r8.getY()
                r7.f2701b = r8
            L137:
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class k implements android.view.View.OnClickListener {
        public final /* synthetic */ android.content.Context a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.model.AccessiblityModel f2742b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a.u0 f2743c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2744d;

        public k(com.acse.ottn.service.a r1, android.content.Context r2, com.acse.ottn.model.AccessiblityModel r3, com.acse.ottn.service.a.u0 r4) {
                r0 = this;
                r0.f2744d = r1
                r0.a = r2
                r0.f2742b = r3
                r0.f2743c = r4
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r4) {
                r3 = this;
                com.acse.ottn.service.a r4 = r3.f2744d
                android.content.Context r0 = r3.a
                com.acse.ottn.model.AccessiblityModel r1 = r3.f2742b
                com.acse.ottn.service.a$u0 r2 = r3.f2743c
                r4.a(r0, r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class k0 implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.String> {
        public final /* synthetic */ com.acse.ottn.service.a a;

        public k0(com.acse.ottn.service.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(java.lang.String r3) throws java.lang.Exception {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "cutdown="
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.lang.String r0 = "ShopHelperService"
                com.acse.ottn.h2.b(r0, r3)
                return
        }

        @Override // com.acse.ottn.io.reactivex.functions.Consumer
        public /* bridge */ /* synthetic */ void accept(java.lang.String r1) throws java.lang.Exception {
                r0 = this;
                java.lang.String r1 = (java.lang.String) r1
                r0.a(r1)
                return
        }

        @Override // com.acse.ottn.io.reactivex.functions.Consumer
        public /* synthetic */ void call(java.lang.String r1) {
                r0 = this;
                com.acse.ottn.io.reactivex.functions.c.a(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class l implements android.view.View.OnClickListener {
        public final /* synthetic */ com.acse.ottn.service.a.u0 a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2745b;

        public l(com.acse.ottn.service.a r1, com.acse.ottn.service.a.u0 r2) {
                r0 = this;
                r0.f2745b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.acse.ottn.service.a$u0 r1 = r0.a
                com.acse.ottn.service.a.a(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class l0 implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.Throwable> {
        public final /* synthetic */ com.acse.ottn.service.a a;

        public l0(com.acse.ottn.service.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(java.lang.Throwable r1) throws java.lang.Exception {
                r0 = this;
                return
        }

        @Override // com.acse.ottn.io.reactivex.functions.Consumer
        public /* bridge */ /* synthetic */ void accept(java.lang.Throwable r1) throws java.lang.Exception {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.a(r1)
                return
        }

        @Override // com.acse.ottn.io.reactivex.functions.Consumer
        public /* synthetic */ void call(java.lang.Throwable r1) {
                r0 = this;
                com.acse.ottn.io.reactivex.functions.c.a(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class m implements android.view.View.OnClickListener {
        public final /* synthetic */ android.content.Context a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.model.AccessiblityModel f2746b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a.u0 f2747c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2748d;

        public m(com.acse.ottn.service.a r1, android.content.Context r2, com.acse.ottn.model.AccessiblityModel r3, com.acse.ottn.service.a.u0 r4) {
                r0 = this;
                r0.f2748d = r1
                r0.a = r2
                r0.f2746b = r3
                r0.f2747c = r4
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r4) {
                r3 = this;
                com.acse.ottn.service.a r4 = r3.f2748d
                android.content.Context r0 = r3.a
                com.acse.ottn.model.AccessiblityModel r1 = r3.f2746b
                com.acse.ottn.service.a$u0 r2 = r3.f2747c
                r4.a(r0, r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class m0 implements android.view.View.OnClickListener {
        public final /* synthetic */ com.acse.ottn.service.a.u0 a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2749b;

        public m0(com.acse.ottn.service.a r1, com.acse.ottn.service.a.u0 r2) {
                r0 = this;
                r0.f2749b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.acse.ottn.service.a$u0 r1 = r0.a
                com.acse.ottn.service.a.a(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class n implements android.view.View.OnClickListener {
        public final /* synthetic */ com.acse.ottn.service.a.u0 a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2750b;

        public n(com.acse.ottn.service.a r1, com.acse.ottn.service.a.u0 r2) {
                r0 = this;
                r0.f2750b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.acse.ottn.service.a$u0 r1 = r0.a
                com.acse.ottn.service.a.a(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class n0 implements android.view.View.OnClickListener {
        public final /* synthetic */ android.content.Context a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.model.AccessiblityModel f2751b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a.u0 f2752c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2753d;

        public n0(com.acse.ottn.service.a r1, android.content.Context r2, com.acse.ottn.model.AccessiblityModel r3, com.acse.ottn.service.a.u0 r4) {
                r0 = this;
                r0.f2753d = r1
                r0.a = r2
                r0.f2751b = r3
                r0.f2752c = r4
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r4) {
                r3 = this;
                com.acse.ottn.service.a r4 = r3.f2753d
                android.content.Context r0 = r3.a
                com.acse.ottn.model.AccessiblityModel r1 = r3.f2751b
                com.acse.ottn.service.a$u0 r2 = r3.f2752c
                r4.a(r0, r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class o implements android.view.View.OnClickListener {
        public final /* synthetic */ android.content.Context a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.model.AccessiblityModel f2754b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a.u0 f2755c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2756d;

        public o(com.acse.ottn.service.a r1, android.content.Context r2, com.acse.ottn.model.AccessiblityModel r3, com.acse.ottn.service.a.u0 r4) {
                r0 = this;
                r0.f2756d = r1
                r0.a = r2
                r0.f2754b = r3
                r0.f2755c = r4
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r4) {
                r3 = this;
                com.acse.ottn.service.a r4 = r3.f2756d
                android.content.Context r0 = r3.a
                com.acse.ottn.model.AccessiblityModel r1 = r3.f2754b
                com.acse.ottn.service.a$u0 r2 = r3.f2755c
                r4.a(r0, r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class o0 implements android.view.View.OnClickListener {
        public final /* synthetic */ com.acse.ottn.service.a.u0 a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2757b;

        public o0(com.acse.ottn.service.a r1, com.acse.ottn.service.a.u0 r2) {
                r0 = this;
                r0.f2757b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.acse.ottn.service.a$u0 r1 = r0.a
                com.acse.ottn.service.a.a(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class p implements android.view.View.OnClickListener {
        public final /* synthetic */ com.acse.ottn.service.a.u0 a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2758b;

        public p(com.acse.ottn.service.a r1, com.acse.ottn.service.a.u0 r2) {
                r0 = this;
                r0.f2758b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.acse.ottn.service.a$u0 r1 = r0.a
                com.acse.ottn.service.a.a(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class p0 implements android.view.View.OnClickListener {
        public final /* synthetic */ android.content.Context a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.model.AccessiblityModel f2759b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a.u0 f2760c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2761d;

        public p0(com.acse.ottn.service.a r1, android.content.Context r2, com.acse.ottn.model.AccessiblityModel r3, com.acse.ottn.service.a.u0 r4) {
                r0 = this;
                r0.f2761d = r1
                r0.a = r2
                r0.f2759b = r3
                r0.f2760c = r4
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r4) {
                r3 = this;
                com.acse.ottn.service.a r4 = r3.f2761d
                android.content.Context r0 = r3.a
                com.acse.ottn.model.AccessiblityModel r1 = r3.f2759b
                com.acse.ottn.service.a$u0 r2 = r3.f2760c
                r4.a(r0, r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class q implements android.view.View.OnClickListener {
        public final /* synthetic */ android.content.Context a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.model.AccessiblityModel f2762b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a.u0 f2763c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2764d;

        public q(com.acse.ottn.service.a r1, android.content.Context r2, com.acse.ottn.model.AccessiblityModel r3, com.acse.ottn.service.a.u0 r4) {
                r0 = this;
                r0.f2764d = r1
                r0.a = r2
                r0.f2762b = r3
                r0.f2763c = r4
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r4) {
                r3 = this;
                com.acse.ottn.service.a r4 = r3.f2764d
                android.content.Context r0 = r3.a
                com.acse.ottn.model.AccessiblityModel r1 = r3.f2762b
                com.acse.ottn.service.a$u0 r2 = r3.f2763c
                r4.a(r0, r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class q0 implements android.view.View.OnClickListener {
        public final /* synthetic */ com.acse.ottn.service.a.u0 a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2765b;

        public q0(com.acse.ottn.service.a r1, com.acse.ottn.service.a.u0 r2) {
                r0 = this;
                r0.f2765b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.acse.ottn.service.a$u0 r1 = r0.a
                com.acse.ottn.service.a.a(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class r implements android.view.View.OnClickListener {
        public final /* synthetic */ com.acse.ottn.service.a.u0 a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2766b;

        public r(com.acse.ottn.service.a r1, com.acse.ottn.service.a.u0 r2) {
                r0 = this;
                r0.f2766b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.acse.ottn.service.a$u0 r1 = r0.a
                com.acse.ottn.service.a.a(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class r0 implements android.view.View.OnClickListener {
        public final /* synthetic */ android.content.Context a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.model.AccessiblityModel f2767b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a.u0 f2768c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2769d;

        public r0(com.acse.ottn.service.a r1, android.content.Context r2, com.acse.ottn.model.AccessiblityModel r3, com.acse.ottn.service.a.u0 r4) {
                r0 = this;
                r0.f2769d = r1
                r0.a = r2
                r0.f2767b = r3
                r0.f2768c = r4
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r4) {
                r3 = this;
                com.acse.ottn.service.a r4 = r3.f2769d
                android.content.Context r0 = r3.a
                com.acse.ottn.model.AccessiblityModel r1 = r3.f2767b
                com.acse.ottn.service.a$u0 r2 = r3.f2768c
                r4.a(r0, r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class s implements android.view.View.OnClickListener {
        public final /* synthetic */ android.content.Context a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.model.AccessiblityModel f2770b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a.u0 f2771c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2772d;

        public s(com.acse.ottn.service.a r1, android.content.Context r2, com.acse.ottn.model.AccessiblityModel r3, com.acse.ottn.service.a.u0 r4) {
                r0 = this;
                r0.f2772d = r1
                r0.a = r2
                r0.f2770b = r3
                r0.f2771c = r4
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r4) {
                r3 = this;
                com.acse.ottn.service.a r4 = r3.f2772d
                android.content.Context r0 = r3.a
                com.acse.ottn.model.AccessiblityModel r1 = r3.f2770b
                com.acse.ottn.service.a$u0 r2 = r3.f2771c
                r4.a(r0, r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class s0 implements android.view.View.OnClickListener {
        public final /* synthetic */ com.acse.ottn.service.a.u0 a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2773b;

        public s0(com.acse.ottn.service.a r1, com.acse.ottn.service.a.u0 r2) {
                r0 = this;
                r0.f2773b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.acse.ottn.service.a$u0 r1 = r0.a
                com.acse.ottn.service.a.a(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class t implements android.view.View.OnClickListener {
        public final /* synthetic */ com.acse.ottn.service.a.u0 a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2774b;

        public t(com.acse.ottn.service.a r1, com.acse.ottn.service.a.u0 r2) {
                r0 = this;
                r0.f2774b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.acse.ottn.service.a$u0 r1 = r0.a
                com.acse.ottn.service.a.a(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class t0 implements android.view.View.OnClickListener {
        public final /* synthetic */ android.content.Context a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.model.AccessiblityModel f2775b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a.u0 f2776c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2777d;

        public t0(com.acse.ottn.service.a r1, android.content.Context r2, com.acse.ottn.model.AccessiblityModel r3, com.acse.ottn.service.a.u0 r4) {
                r0 = this;
                r0.f2777d = r1
                r0.a = r2
                r0.f2775b = r3
                r0.f2776c = r4
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r4) {
                r3 = this;
                com.acse.ottn.service.a r4 = r3.f2777d
                android.content.Context r0 = r3.a
                com.acse.ottn.model.AccessiblityModel r1 = r3.f2775b
                com.acse.ottn.service.a$u0 r2 = r3.f2776c
                r4.a(r0, r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class u implements android.view.View.OnClickListener {
        public final /* synthetic */ android.content.Context a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.model.AccessiblityModel f2778b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a.u0 f2779c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2780d;

        public u(com.acse.ottn.service.a r1, android.content.Context r2, com.acse.ottn.model.AccessiblityModel r3, com.acse.ottn.service.a.u0 r4) {
                r0 = this;
                r0.f2780d = r1
                r0.a = r2
                r0.f2778b = r3
                r0.f2779c = r4
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r4) {
                r3 = this;
                com.acse.ottn.service.a r4 = r3.f2780d
                android.content.Context r0 = r3.a
                com.acse.ottn.model.AccessiblityModel r1 = r3.f2778b
                com.acse.ottn.service.a$u0 r2 = r3.f2779c
                r4.a(r0, r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface u0 {
        void a();

        void a(java.lang.String r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class v implements com.acse.ottn.io.reactivex.functions.Consumer<java.lang.String> {
        public final /* synthetic */ com.acse.ottn.service.a.u0 a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.model.AccessiblityModel f2781b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ android.content.Context f2782c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2783d;

        public v(com.acse.ottn.service.a r1, com.acse.ottn.service.a.u0 r2, com.acse.ottn.model.AccessiblityModel r3, android.content.Context r4) {
                r0 = this;
                r0.f2783d = r1
                r0.a = r2
                r0.f2781b = r3
                r0.f2782c = r4
                r0.<init>()
                return
        }

        public void a(java.lang.String r3) throws java.lang.Exception {
                r2 = this;
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>(r3)
                java.lang.String r3 = "r"
                int r3 = r0.getInt(r3)
                if (r3 != 0) goto L13
                com.acse.ottn.service.a$u0 r3 = r2.a
                com.acse.ottn.service.a.a(r3)
                return
            L13:
                java.lang.String r3 = "gwc_link"
                java.lang.String r3 = r0.getString(r3)
                java.lang.String r1 = "gwc_deeplink"
                java.lang.String r0 = r0.getString(r1)
                com.acse.ottn.model.AccessiblityModel r1 = r2.f2781b
                com.acse.ottn.model.AccessiblityModel$DataBean r1 = r1.getData()
                r1.setSpop_deeplink(r0)
                com.acse.ottn.model.AccessiblityModel r0 = r2.f2781b
                com.acse.ottn.model.AccessiblityModel$DataBean r0 = r0.getData()
                r0.setSpop_link(r3)
                com.acse.ottn.l4 r3 = com.acse.ottn.l4.c()
                android.content.Context r0 = r2.f2782c
                com.acse.ottn.model.AccessiblityModel r1 = r2.f2781b
                r3.b(r0, r1)
                com.acse.ottn.service.a$u0 r3 = r2.a
                com.acse.ottn.service.a.a(r3)
                return
        }

        @Override // com.acse.ottn.io.reactivex.functions.Consumer
        public /* bridge */ /* synthetic */ void accept(java.lang.String r1) throws java.lang.Exception {
                r0 = this;
                java.lang.String r1 = (java.lang.String) r1
                r0.a(r1)
                return
        }

        @Override // com.acse.ottn.io.reactivex.functions.Consumer
        public /* synthetic */ void call(java.lang.String r1) {
                r0 = this;
                com.acse.ottn.io.reactivex.functions.c.a(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class w implements android.view.View.OnClickListener {
        public final /* synthetic */ com.acse.ottn.service.a.u0 a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2784b;

        public w(com.acse.ottn.service.a r1, com.acse.ottn.service.a.u0 r2) {
                r0 = this;
                r0.f2784b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r1) {
                r0 = this;
                com.acse.ottn.service.a$u0 r1 = r0.a
                com.acse.ottn.service.a.a(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class x implements android.view.View.OnClickListener {
        public final /* synthetic */ android.content.Context a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.model.AccessiblityModel f2785b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a.u0 f2786c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2787d;

        public x(com.acse.ottn.service.a r1, android.content.Context r2, com.acse.ottn.model.AccessiblityModel r3, com.acse.ottn.service.a.u0 r4) {
                r0 = this;
                r0.f2787d = r1
                r0.a = r2
                r0.f2785b = r3
                r0.f2786c = r4
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r4) {
                r3 = this;
                com.acse.ottn.service.a r4 = r3.f2787d
                android.content.Context r0 = r3.a
                com.acse.ottn.model.AccessiblityModel r1 = r3.f2785b
                com.acse.ottn.service.a$u0 r2 = r3.f2786c
                r4.a(r0, r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class y implements android.view.View.OnClickListener {
        public final /* synthetic */ com.acse.ottn.service.a.u0 a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2788b;

        public y(com.acse.ottn.service.a r1, com.acse.ottn.service.a.u0 r2) {
                r0 = this;
                r0.f2788b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                com.acse.ottn.q2 r2 = com.acse.ottn.q2.b()
                java.lang.String r0 = "close_coupon_window"
                r2.a(r0)
                com.acse.ottn.service.a$u0 r2 = r1.a
                com.acse.ottn.service.a.a(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class z implements android.view.View.OnClickListener {
        public final /* synthetic */ java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a.u0 f2789b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.a f2790c;

        public z(com.acse.ottn.service.a r1, java.lang.String r2, com.acse.ottn.service.a.u0 r3) {
                r0 = this;
                r0.f2790c = r1
                r0.a = r2
                r0.f2789b = r3
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                java.lang.String r2 = r1.a
                com.acse.ottn.service.a$u0 r0 = r1.f2789b
                com.acse.ottn.service.a.a(r2, r0)
                return
        }
    }

    static {
            return
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.lang.String a() {
            java.lang.String r0 = com.acse.ottn.service.a.f2698c
            return r0
    }

    public static /* synthetic */ void a(int r0, com.acse.ottn.service.a.u0 r1) {
            b(r0, r1)
            return
    }

    public static void a(com.acse.ottn.service.a.u0 r1) {
            java.util.TimerTask r0 = com.acse.ottn.service.a.f2700e
            if (r0 == 0) goto La
            r0.cancel()
            r0 = 0
            com.acse.ottn.service.a.f2700e = r0
        La:
            if (r1 == 0) goto Lf
            r1.a()
        Lf:
            return
    }

    public static /* synthetic */ void a(com.acse.ottn.service.a r0, java.lang.String r1, boolean r2) {
            r0.a(r1, r2)
            return
    }

    public static void a(java.lang.String r0, com.acse.ottn.service.a.u0 r1) {
            d()
            if (r1 == 0) goto L8
            r1.a(r0)
        L8:
            return
    }

    public static com.acse.ottn.service.a b() {
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.f2699d
            if (r0 != 0) goto L19
            java.lang.Class<com.acse.ottn.service.a> r0 = com.acse.ottn.service.a.class
            monitor-enter(r0)
            com.acse.ottn.service.a r1 = com.acse.ottn.service.a.f2699d     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.acse.ottn.service.a r1 = new com.acse.ottn.service.a     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.acse.ottn.service.a.f2699d = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.f2699d
            return r0
    }

    public static void b(int r2, com.acse.ottn.service.a.u0 r3) {
            com.acse.ottn.n0 r0 = com.acse.ottn.n0.a()
            com.acse.ottn.service.a$a r1 = new com.acse.ottn.service.a$a
            r1.<init>(r3)
            r3 = 100
            java.util.TimerTask r2 = r0.b(r2, r3, r1)
            com.acse.ottn.service.a.f2700e = r2
            return
    }

    public static void d() {
            java.util.TimerTask r0 = com.acse.ottn.service.a.f2700e     // Catch: java.lang.Exception -> L14
            if (r0 == 0) goto L13
            java.lang.String r0 = com.acse.ottn.service.a.f2698c     // Catch: java.lang.Exception -> L14
            java.lang.String r1 = "timer is not null"
            com.acse.ottn.h2.a(r0, r1)     // Catch: java.lang.Exception -> L14
            java.util.TimerTask r0 = com.acse.ottn.service.a.f2700e     // Catch: java.lang.Exception -> L14
            r0.cancel()     // Catch: java.lang.Exception -> L14
            r0 = 0
            com.acse.ottn.service.a.f2700e = r0     // Catch: java.lang.Exception -> L14
        L13:
            return
        L14:
            java.lang.String r0 = com.acse.ottn.service.a.f2698c
            java.lang.String r1 = "current window is Destroy"
            com.acse.ottn.h2.a(r0, r1)
            return
    }

    public void A(android.content.Context r4, android.view.View r5, com.acse.ottn.model.AccessiblityModel r6, com.acse.ottn.service.a.u0 r7) {
            r3 = this;
            int r0 = com.acse.ottn.R.id.iv_tb_big_recommend_icon
            android.view.View r0 = r5.findViewById(r0)
            com.acse.ottn.widget.RoundRectImageView r0 = (com.acse.ottn.widget.RoundRectImageView) r0
            com.acse.ottn.model.AccessiblityModel$DataBean r1 = r6.getData()
            java.lang.String r1 = r1.getSpop_pic()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L29
            com.bumptech.glide.i r1 = com.bumptech.glide.b.D(r4)
            com.acse.ottn.model.AccessiblityModel$DataBean r2 = r6.getData()
            java.lang.String r2 = r2.getSpop_pic()
            com.bumptech.glide.h r1 = r1.M(r2)
            r1.m1(r0)
        L29:
            int r0 = com.acse.ottn.R.id.tb_content
            android.view.View r0 = r5.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            int r1 = com.acse.ottn.R.id.tb_small
            android.view.View r1 = r5.findViewById(r1)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            int r2 = com.acse.ottn.R.id.iv_smill_close
            android.view.View r2 = r5.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r3.a(r2, r7)
            int r2 = com.acse.ottn.R.id.iv_setting
            android.view.View r5 = r5.findViewById(r2)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            com.acse.ottn.model.AccessiblityModel$DataBean r2 = r6.getData()
            java.lang.String r2 = r2.getPackage_name()
            boolean r2 = r3.a(r2)
            if (r2 != 0) goto L87
            com.acse.ottn.model.AccessiblityModel$DataBean r2 = r6.getData()
            java.lang.String r2 = r2.getNew_time_remaining()
            boolean r2 = r3.a(r2)
            if (r2 == 0) goto L69
            goto L87
        L69:
            com.acse.ottn.model.AccessiblityModel$DataBean r2 = r6.getData()
            java.lang.String r2 = r2.getPackage_name()
            r3.a(r5, r2, r7)
            r3.a(r4, r1, r6, r7)
            com.acse.ottn.model.AccessiblityModel$DataBean r4 = r6.getData()
            java.lang.String r4 = r4.getSpop_title()
            r0.setText(r4)
            r4 = 8000(0x1f40, float:1.121E-41)
            b(r4, r7)
        L87:
            return
    }

    public void B(android.content.Context r3, android.view.View r4, com.acse.ottn.model.AccessiblityModel r5, com.acse.ottn.service.a.u0 r6) {
            r2 = this;
            int r0 = com.acse.ottn.R.id.jd_lijin_close
            android.view.View r0 = r4.findViewById(r0)
            com.acse.ottn.service.a$n r1 = new com.acse.ottn.service.a$n
            r1.<init>(r2, r6)
            r0.setOnClickListener(r1)
            int r0 = com.acse.ottn.R.id.jd_lijin_big
            android.view.View r0 = r4.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            com.acse.ottn.service.a$o r1 = new com.acse.ottn.service.a$o
            r1.<init>(r2, r3, r5, r6)
            r0.setOnClickListener(r1)
            int r3 = com.acse.ottn.R.id.jd_lijin_coupon_price
            android.view.View r3 = r4.findViewById(r3)
            pl.droidsonroids.gif.GifImageView r3 = (pl.droidsonroids.gif.GifImageView) r3
            int r4 = com.acse.ottn.R.drawable.zkj_suiji
            r3.setImageResource(r4)
            r3 = 8000(0x1f40, float:1.121E-41)
            b(r3, r6)
            return
    }

    public void C(android.content.Context r5, android.view.View r6, com.acse.ottn.model.AccessiblityModel r7, com.acse.ottn.service.a.u0 r8) {
            r4 = this;
            int r0 = com.acse.ottn.R.id.iv_tb_big_recommend_icon
            android.view.View r0 = r6.findViewById(r0)
            com.acse.ottn.widget.RoundRectImageView r0 = (com.acse.ottn.widget.RoundRectImageView) r0
            com.acse.ottn.model.AccessiblityModel$DataBean r1 = r7.getData()
            java.lang.String r1 = r1.getSpop_pic()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L29
            com.bumptech.glide.i r1 = com.bumptech.glide.b.D(r5)
            com.acse.ottn.model.AccessiblityModel$DataBean r2 = r7.getData()
            java.lang.String r2 = r2.getSpop_pic()
            com.bumptech.glide.h r1 = r1.M(r2)
            r1.m1(r0)
        L29:
            int r0 = com.acse.ottn.R.id.tb_content_info
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            int r1 = com.acse.ottn.R.id.tb_content
            android.view.View r1 = r6.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r2 = com.acse.ottn.R.id.tb_small
            android.view.View r2 = r6.findViewById(r2)
            android.widget.RelativeLayout r2 = (android.widget.RelativeLayout) r2
            int r3 = com.acse.ottn.R.id.iv_smill_close
            android.view.View r3 = r6.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r4.a(r3, r8)
            int r3 = com.acse.ottn.R.id.iv_setting
            android.view.View r6 = r6.findViewById(r3)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            com.acse.ottn.model.AccessiblityModel$DataBean r3 = r7.getData()
            java.lang.String r3 = r3.getPackage_name()
            boolean r3 = r4.a(r3)
            if (r3 != 0) goto L9a
            com.acse.ottn.model.AccessiblityModel$DataBean r3 = r7.getData()
            java.lang.String r3 = r3.getNew_time_remaining()
            boolean r3 = r4.a(r3)
            if (r3 == 0) goto L71
            goto L9a
        L71:
            com.acse.ottn.model.AccessiblityModel$DataBean r3 = r7.getData()
            java.lang.String r3 = r3.getPackage_name()
            r4.a(r6, r3, r8)
            r4.a(r5, r2, r7, r8)
            com.acse.ottn.model.AccessiblityModel$DataBean r5 = r7.getData()
            java.lang.String r5 = r5.getSpop_title()
            r1.setText(r5)
            com.acse.ottn.model.AccessiblityModel$DataBean r5 = r7.getData()
            java.lang.String r5 = r5.getNew_time_remaining()
            r0.setText(r5)
            r5 = 8000(0x1f40, float:1.121E-41)
            b(r5, r8)
        L9a:
            return
    }

    public void D(android.content.Context r3, android.view.View r4, com.acse.ottn.model.AccessiblityModel r5, com.acse.ottn.service.a.u0 r6) {
            r2 = this;
            int r0 = com.acse.ottn.R.id.xbk_close
            android.view.View r0 = r4.findViewById(r0)
            com.acse.ottn.service.a$c0 r1 = new com.acse.ottn.service.a$c0
            r1.<init>(r2, r6)
            r0.setOnClickListener(r1)
            com.acse.ottn.service.a$d0 r0 = new com.acse.ottn.service.a$d0
            r0.<init>(r2, r3, r5, r6)
            r4.setOnClickListener(r0)
            r3 = 8000(0x1f40, float:1.121E-41)
            b(r3, r6)
            return
    }

    public void E(android.content.Context r3, android.view.View r4, com.acse.ottn.model.AccessiblityModel r5, com.acse.ottn.service.a.u0 r6) {
            r2 = this;
            int r0 = com.acse.ottn.R.id.eleme_close
            android.view.View r0 = r4.findViewById(r0)
            com.acse.ottn.service.a$p r1 = new com.acse.ottn.service.a$p
            r1.<init>(r2, r6)
            r0.setOnClickListener(r1)
            com.acse.ottn.service.a$q r0 = new com.acse.ottn.service.a$q
            r0.<init>(r2, r3, r5, r6)
            r4.setOnClickListener(r0)
            com.acse.ottn.model.AccessiblityModel$DataBean r3 = r5.getData()
            java.lang.String r3 = r3.getSpop_coupon_price()
            boolean r3 = r2.a(r3)
            if (r3 == 0) goto L25
            return
        L25:
            int r3 = com.acse.ottn.R.id.eleme_coupon_price
            android.view.View r3 = r4.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "¥"
            r4.append(r0)
            com.acse.ottn.model.AccessiblityModel$DataBean r5 = r5.getData()
            java.lang.String r5 = r5.getSpop_coupon_price()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.setText(r4)
            r3 = 8000(0x1f40, float:1.121E-41)
            b(r3, r6)
            return
    }

    public void F(android.content.Context r5, android.view.View r6, com.acse.ottn.model.AccessiblityModel r7, com.acse.ottn.service.a.u0 r8) {
            r4 = this;
            int r0 = com.acse.ottn.R.id.eleme_content_info
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            int r1 = com.acse.ottn.R.id.eleme_content
            android.view.View r1 = r6.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r2 = com.acse.ottn.R.id.eleme_small_layout
            android.view.View r2 = r6.findViewById(r2)
            android.widget.RelativeLayout r2 = (android.widget.RelativeLayout) r2
            int r3 = com.acse.ottn.R.id.iv_eleme_smile_close
            android.view.View r3 = r6.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r4.a(r3, r8)
            com.acse.ottn.model.AccessiblityModel$DataBean r3 = r7.getData()
            java.lang.String r3 = r3.getPackage_name()
            boolean r3 = r4.a(r3)
            if (r3 != 0) goto L71
            com.acse.ottn.model.AccessiblityModel$DataBean r3 = r7.getData()
            java.lang.String r3 = r3.getNew_time_remaining()
            boolean r3 = r4.a(r3)
            if (r3 == 0) goto L40
            goto L71
        L40:
            int r3 = com.acse.ottn.R.id.iv_eleme_smile_setting
            android.view.View r6 = r6.findViewById(r3)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            com.acse.ottn.model.AccessiblityModel$DataBean r3 = r7.getData()
            java.lang.String r3 = r3.getPackage_name()
            r4.a(r6, r3, r8)
            r4.a(r5, r2, r7, r8)
            com.acse.ottn.model.AccessiblityModel$DataBean r5 = r7.getData()
            java.lang.String r5 = r5.getSpop_title()
            r1.setText(r5)
            com.acse.ottn.model.AccessiblityModel$DataBean r5 = r7.getData()
            java.lang.String r5 = r5.getNew_time_remaining()
            r0.setText(r5)
            r5 = 8000(0x1f40, float:1.121E-41)
            b(r5, r8)
        L71:
            return
    }

    public void G(android.content.Context r3, android.view.View r4, com.acse.ottn.model.AccessiblityModel r5, com.acse.ottn.service.a.u0 r6) {
            r2 = this;
            int r0 = com.acse.ottn.R.id.eleme_small_layout
            android.view.View r0 = r4.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            int r1 = com.acse.ottn.R.id.iv_eleme_smile_close
            android.view.View r1 = r4.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r2.a(r1, r6)
            int r1 = com.acse.ottn.R.id.iv_fz_smile_setting
            android.view.View r4 = r4.findViewById(r1)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            com.acse.ottn.model.AccessiblityModel$DataBean r1 = r5.getData()
            java.lang.String r1 = r1.getPackage_name()
            r2.a(r4, r1, r6)
            r2.a(r3, r0, r5, r6)
            r3 = 8000(0x1f40, float:1.121E-41)
            b(r3, r6)
            return
    }

    public void H(android.content.Context r3, android.view.View r4, com.acse.ottn.model.AccessiblityModel r5, com.acse.ottn.service.a.u0 r6) {
            r2 = this;
            int r0 = com.acse.ottn.R.id.hxz_close
            android.view.View r0 = r4.findViewById(r0)
            com.acse.ottn.service.a$h r1 = new com.acse.ottn.service.a$h
            r1.<init>(r2, r6)
            r0.setOnClickListener(r1)
            int r0 = com.acse.ottn.R.id.hxz_big
            android.view.View r0 = r4.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            com.acse.ottn.service.a$i r1 = new com.acse.ottn.service.a$i
            r1.<init>(r2, r3, r5, r6)
            r0.setOnClickListener(r1)
            com.acse.ottn.model.AccessiblityModel$DataBean r3 = r5.getData()
            java.lang.String r3 = r3.getNew_time_remaining()
            boolean r3 = r2.a(r3)
            if (r3 != 0) goto L53
            com.acse.ottn.model.AccessiblityModel$DataBean r3 = r5.getData()
            java.lang.String r3 = r3.getSpop_coupon_title()
            boolean r3 = r2.a(r3)
            if (r3 == 0) goto L3b
            goto L53
        L3b:
            int r3 = com.acse.ottn.R.id.hxz_content_info
            android.view.View r3 = r4.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            com.acse.ottn.model.AccessiblityModel$DataBean r4 = r5.getData()
            java.lang.String r4 = r4.getNew_time_remaining()
            r3.setText(r4)
            r3 = 8000(0x1f40, float:1.121E-41)
            b(r3, r6)
        L53:
            return
    }

    public void I(android.content.Context r3, android.view.View r4, com.acse.ottn.model.AccessiblityModel r5, com.acse.ottn.service.a.u0 r6) {
            r2 = this;
            int r0 = com.acse.ottn.R.id.jd_close
            android.view.View r0 = r4.findViewById(r0)
            com.acse.ottn.service.a$j r1 = new com.acse.ottn.service.a$j
            r1.<init>(r2, r6)
            r0.setOnClickListener(r1)
            int r0 = com.acse.ottn.R.id.jd_big
            android.view.View r0 = r4.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            com.acse.ottn.service.a$k r1 = new com.acse.ottn.service.a$k
            r1.<init>(r2, r3, r5, r6)
            r0.setOnClickListener(r1)
            r3 = 0
            r0.setVisibility(r3)
            com.acse.ottn.model.AccessiblityModel$DataBean r3 = r5.getData()
            java.lang.String r3 = r3.getSpop_coupon_price()
            boolean r3 = r2.a(r3)
            if (r3 != 0) goto L7b
            com.acse.ottn.model.AccessiblityModel$DataBean r3 = r5.getData()
            java.lang.String r3 = r3.getNew_time_remaining()
            boolean r3 = r2.a(r3)
            if (r3 == 0) goto L3f
            goto L7b
        L3f:
            int r3 = com.acse.ottn.R.id.jd_coupon_price
            android.view.View r3 = r4.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "¥"
            r0.append(r1)
            com.acse.ottn.model.AccessiblityModel$DataBean r1 = r5.getData()
            java.lang.String r1 = r1.getSpop_coupon_price()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.setText(r0)
            int r3 = com.acse.ottn.R.id.jd_action_time
            android.view.View r3 = r4.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            com.acse.ottn.model.AccessiblityModel$DataBean r4 = r5.getData()
            java.lang.String r4 = r4.getNew_time_remaining()
            r3.setText(r4)
            r3 = 8000(0x1f40, float:1.121E-41)
            b(r3, r6)
        L7b:
            return
    }

    public void J(android.content.Context r3, android.view.View r4, com.acse.ottn.model.AccessiblityModel r5, com.acse.ottn.service.a.u0 r6) {
            r2 = this;
            int r0 = com.acse.ottn.R.id.jd_lijin_close
            android.view.View r0 = r4.findViewById(r0)
            com.acse.ottn.service.a$l r1 = new com.acse.ottn.service.a$l
            r1.<init>(r2, r6)
            r0.setOnClickListener(r1)
            int r0 = com.acse.ottn.R.id.jd_lijin_big
            android.view.View r0 = r4.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            com.acse.ottn.service.a$m r1 = new com.acse.ottn.service.a$m
            r1.<init>(r2, r3, r5, r6)
            r0.setOnClickListener(r1)
            int r3 = com.acse.ottn.R.id.jd_lijin_coupon_price
            android.view.View r3 = r4.findViewById(r3)
            pl.droidsonroids.gif.GifImageView r3 = (pl.droidsonroids.gif.GifImageView) r3
            int r4 = com.acse.ottn.R.drawable.zkj_suiji
            r3.setImageResource(r4)
            r3 = 8000(0x1f40, float:1.121E-41)
            b(r3, r6)
            return
    }

    public void K(android.content.Context r6, android.view.View r7, com.acse.ottn.model.AccessiblityModel r8, com.acse.ottn.service.a.u0 r9) {
            r5 = this;
            int r0 = com.acse.ottn.R.id.iv_jd_recommend_icon
            android.view.View r0 = r7.findViewById(r0)
            com.acse.ottn.widget.RoundRectImageView r0 = (com.acse.ottn.widget.RoundRectImageView) r0
            int r1 = com.acse.ottn.R.id.jd_content_info
            android.view.View r1 = r7.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r2 = com.acse.ottn.R.id.jd_content
            android.view.View r2 = r7.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            int r3 = com.acse.ottn.R.id.jd_small
            android.view.View r3 = r7.findViewById(r3)
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3
            int r4 = com.acse.ottn.R.id.iv_jd_smill_close
            android.view.View r4 = r7.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r5.a(r4, r9)
            com.acse.ottn.model.AccessiblityModel$DataBean r4 = r8.getData()
            java.lang.String r4 = r4.getPackage_name()
            boolean r4 = r5.a(r4)
            if (r4 != 0) goto L9e
            com.acse.ottn.model.AccessiblityModel$DataBean r4 = r8.getData()
            java.lang.String r4 = r4.getSpop_pic()
            boolean r4 = r5.a(r4)
            if (r4 != 0) goto L9e
            com.acse.ottn.model.AccessiblityModel$DataBean r4 = r8.getData()
            java.lang.String r4 = r4.getNew_time_remaining()
            boolean r4 = r5.a(r4)
            if (r4 == 0) goto L56
            goto L9e
        L56:
            int r4 = com.acse.ottn.R.id.iv_jd_smill_setting
            android.view.View r7 = r7.findViewById(r4)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            com.acse.ottn.model.AccessiblityModel$DataBean r4 = r8.getData()
            java.lang.String r4 = r4.getPackage_name()
            r5.a(r7, r4, r9)
            r7 = 0
            r3.setVisibility(r7)
            r5.a(r6, r3, r8, r9)
            com.bumptech.glide.i r6 = com.bumptech.glide.b.D(r6)
            com.acse.ottn.model.AccessiblityModel$DataBean r7 = r8.getData()
            java.lang.String r7 = r7.getSpop_pic()
            com.bumptech.glide.h r6 = r6.M(r7)
            r6.m1(r0)
            com.acse.ottn.model.AccessiblityModel$DataBean r6 = r8.getData()
            java.lang.String r6 = r6.getSpop_title()
            r2.setText(r6)
            com.acse.ottn.model.AccessiblityModel$DataBean r6 = r8.getData()
            java.lang.String r6 = r6.getNew_time_remaining()
            r1.setText(r6)
            r6 = 8000(0x1f40, float:1.121E-41)
            b(r6, r9)
        L9e:
            return
    }

    public void a(android.content.Context r3, android.view.View r4, com.acse.ottn.model.AccessiblityModel r5, com.acse.ottn.service.a.u0 r6) {
            r2 = this;
            int r0 = com.acse.ottn.R.id.baidu_wp_close
            android.view.View r0 = r4.findViewById(r0)
            com.acse.ottn.service.a$q0 r1 = new com.acse.ottn.service.a$q0
            r1.<init>(r2, r6)
            r0.setOnClickListener(r1)
            int r0 = com.acse.ottn.R.id.baidu_wp
            android.view.View r0 = r4.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            com.acse.ottn.service.a$r0 r1 = new com.acse.ottn.service.a$r0
            r1.<init>(r2, r3, r5, r6)
            r0.setOnClickListener(r1)
            r3 = 0
            r0.setVisibility(r3)
            com.acse.ottn.model.AccessiblityModel$DataBean r3 = r5.getData()
            java.lang.String r3 = r3.getSpop_coupon_price()
            boolean r3 = r2.a(r3)
            if (r3 != 0) goto L6a
            com.acse.ottn.model.AccessiblityModel$DataBean r3 = r5.getData()
            java.lang.String r3 = r3.getNew_time_remaining()
            boolean r3 = r2.a(r3)
            if (r3 == 0) goto L3f
            goto L6a
        L3f:
            int r3 = com.acse.ottn.R.id.baidu_wp_price
            android.view.View r3 = r4.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r5.getData()
            java.lang.String r0 = r0.getSpop_coupon_price()
            r3.setText(r0)
            int r3 = com.acse.ottn.R.id.baidu_wp_surplus_time
            android.view.View r3 = r4.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            com.acse.ottn.model.AccessiblityModel$DataBean r4 = r5.getData()
            java.lang.String r4 = r4.getNew_time_remaining()
            r3.setText(r4)
            r3 = 10000(0x2710, float:1.4013E-41)
            b(r3, r6)
        L6a:
            return
    }

    public final void a(android.content.Context r9, android.widget.RelativeLayout r10, com.acse.ottn.model.AccessiblityModel r11, com.acse.ottn.service.a.u0 r12) {
            r8 = this;
            float r4 = r10.getX()
            float r3 = r10.getY()
            com.acse.ottn.service.a$j0 r0 = new com.acse.ottn.service.a$j0
            r1 = r8
            r7 = r9
            r2 = r10
            r6 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r2.setOnTouchListener(r0)
            return
    }

    public void a(android.content.Context r5, com.acse.ottn.model.AccessiblityModel r6, com.acse.ottn.service.a.u0 r7) {
            r4 = this;
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r6.getData()
            java.lang.String r0 = r0.getTkl_url()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L45
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r6.getData()
            java.lang.String r0 = r0.getTkl_url()
            java.lang.String r1 = "https"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L36
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.acse.ottn.service.DemoService> r1 = com.acse.ottn.service.DemoService.class
            r0.<init>(r5, r1)
            com.acse.ottn.model.AccessiblityModel$DataBean r1 = r6.getData()
            java.lang.String r1 = r1.getTkl_url()
            java.lang.String r2 = "tkl_url"
            r0.putExtra(r2, r1)
            r5.startService(r0)
            goto L45
        L36:
            com.acse.ottn.o r0 = com.acse.ottn.o.c()
            com.acse.ottn.model.AccessiblityModel$DataBean r1 = r6.getData()
            java.lang.String r1 = r1.getTkl_url()
            r0.a(r5, r1)
        L45:
            java.lang.String r0 = com.acse.ottn.service.a.f2698c
            java.lang.String r1 = "开始点击"
            com.acse.ottn.h2.c(r0, r1)
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r6.getData()
            java.lang.String r0 = r0.getSpop_link()
            boolean r0 = r4.a(r0)
            if (r0 != 0) goto L105
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r6.getData()
            java.lang.String r0 = r0.getSpop_deeplink()
            boolean r0 = r4.a(r0)
            if (r0 == 0) goto L6a
            goto L105
        L6a:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r6.getData()
            java.lang.String r0 = r0.getPic_type()
            java.lang.String r1 = "1"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L94
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r6.getData()
            java.lang.String r0 = r0.getShort_link()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L89
            goto L94
        L89:
            com.acse.ottn.l4 r0 = com.acse.ottn.l4.c()
            r0.b(r5, r6)
            a(r7)
            return
        L94:
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.lang.String r1 = com.acse.ottn.util.HelpShopAppUtil.getHmKey()
            java.lang.String r2 = "ak"
            r0.put(r2, r1)
            com.acse.ottn.util.HelpShopAppUtil.getInstance()
            java.lang.String r1 = com.acse.ottn.util.HelpShopAppUtil.sessionExID()
            java.lang.String r2 = "sessionid"
            r0.put(r2, r1)
            com.acse.ottn.model.AccessiblityModel$DataBean r1 = r6.getData()
            java.lang.String r1 = r1.getSpop_coupon_price()
            java.lang.String r2 = "spop_coupon_price"
            r0.put(r2, r1)
            com.acse.ottn.model.AccessiblityModel$DataBean r1 = r6.getData()
            java.lang.String r1 = r1.getPackage_name()
            java.lang.String r2 = "app"
            r0.put(r2, r1)
            com.acse.ottn.model.AccessiblityModel$DataBean r1 = r6.getData()
            java.lang.String r1 = r1.getSpop_link()
            java.lang.String r2 = "spop_link"
            r0.put(r2, r1)
            com.acse.ottn.l1 r1 = new com.acse.ottn.l1
            r1.<init>()
            com.acse.ottn.t0 r2 = com.acse.ottn.t0.b()
            java.lang.String r3 = ""
            okhttp3.RequestBody r0 = r2.a(r0, r3)
            rx.e r0 = r1.f(r0)
            rx.h r1 = com.acse.ottn.io.reactivex.schedulers.Schedulers.newThread()
            rx.e r0 = r0.w5(r1)
            rx.h r1 = com.acse.ottn.i.a()
            rx.e r0 = r0.I3(r1)
            com.acse.ottn.service.a$v r1 = new com.acse.ottn.service.a$v
            r1.<init>(r4, r7, r6, r5)
            com.acse.ottn.service.a$g0 r5 = new com.acse.ottn.service.a$g0
            r5.<init>(r4, r7)
            r0.u5(r1, r5)
        L105:
            return
    }

    public void a(android.view.View r3, java.lang.String r4, boolean r5, com.acse.ottn.service.a.u0 r6) {
            r2 = this;
            int r0 = com.acse.ottn.R.id.tv_close
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            com.acse.ottn.service.a$e0 r1 = new com.acse.ottn.service.a$e0
            r1.<init>(r2, r6, r4, r5)
            r0.setOnClickListener(r1)
            int r4 = com.acse.ottn.R.id.iv_no_show_smill_close
            android.view.View r3 = r3.findViewById(r4)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            com.acse.ottn.service.a$f0 r4 = new com.acse.ottn.service.a$f0
            r4.<init>(r2, r6)
            r3.setOnClickListener(r4)
            r3 = 4000(0xfa0, float:5.605E-42)
            b(r3, r6)
            return
    }

    public final void a(android.widget.ImageView r2, com.acse.ottn.service.a.u0 r3) {
            r1 = this;
            com.acse.ottn.service.a$y r0 = new com.acse.ottn.service.a$y
            r0.<init>(r1, r3)
            r2.setOnClickListener(r0)
            return
    }

    public final void a(android.widget.ImageView r2, java.lang.String r3, com.acse.ottn.service.a.u0 r4) {
            r1 = this;
            com.acse.ottn.service.a$z r0 = new com.acse.ottn.service.a$z
            r0.<init>(r1, r3, r4)
            r2.setOnClickListener(r0)
            return
    }

    public final void a(java.lang.String r4, boolean r5) {
            r3 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.lang.String r1 = com.acse.ottn.util.HelpShopAppUtil.getHmKey()
            java.lang.String r2 = "ak"
            r0.put(r2, r1)
            com.acse.ottn.util.HelpShopAppUtil.getInstance()
            java.lang.String r1 = com.acse.ottn.util.HelpShopAppUtil.sessionExID()
            java.lang.String r2 = "sessionid"
            r0.put(r2, r1)
            if (r5 == 0) goto L1f
            java.lang.String r5 = "coupon"
            goto L21
        L1f:
            java.lang.String r5 = "lj"
        L21:
            java.lang.String r1 = "limitType"
            r0.put(r1, r5)
            java.lang.String r5 = "is_snt"
            java.lang.String r1 = "0"
            r0.put(r5, r1)
            java.lang.String r5 = "package_name"
            r0.put(r5, r4)
            com.acse.ottn.g0 r4 = new com.acse.ottn.g0
            r4.<init>()
            com.acse.ottn.t0 r5 = com.acse.ottn.t0.b()
            java.lang.String r1 = ""
            okhttp3.RequestBody r5 = r5.a(r0, r1)
            rx.e r4 = r4.r(r5)
            rx.h r5 = com.acse.ottn.io.reactivex.schedulers.Schedulers.newThread()
            rx.e r4 = r4.w5(r5)
            rx.h r5 = com.acse.ottn.i.a()
            rx.e r4 = r4.I3(r5)
            com.acse.ottn.service.a$k0 r5 = new com.acse.ottn.service.a$k0
            r5.<init>(r3)
            com.acse.ottn.service.a$l0 r0 = new com.acse.ottn.service.a$l0
            r0.<init>(r3)
            r4.u5(r5, r0)
            return
    }

    public final boolean a(java.lang.String r1) {
            r0 = this;
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            return r1
    }

    public void b(android.content.Context r3, android.view.View r4, com.acse.ottn.model.AccessiblityModel r5, com.acse.ottn.service.a.u0 r6) {
            r2 = this;
            int r0 = com.acse.ottn.R.id.taobao_close
            android.view.View r0 = r4.findViewById(r0)
            com.acse.ottn.service.a$h0 r1 = new com.acse.ottn.service.a$h0
            r1.<init>(r2, r6)
            r0.setOnClickListener(r1)
            int r0 = com.acse.ottn.R.id.video_taobao_man
            android.view.View r0 = r4.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            int r1 = com.acse.ottn.R.id.taobao_main_box
            android.view.View r4 = r4.findViewById(r1)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            com.acse.ottn.service.a$i0 r1 = new com.acse.ottn.service.a$i0
            r1.<init>(r2, r3, r5, r6)
            r4.setOnClickListener(r1)
            com.acse.ottn.model.AccessiblityModel$DataBean r1 = r5.getData()
            java.lang.String r1 = r1.getSpop_pic()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L35
            return
        L35:
            com.bumptech.glide.i r3 = com.bumptech.glide.b.D(r3)
            com.acse.ottn.model.AccessiblityModel$DataBean r5 = r5.getData()
            java.lang.String r5 = r5.getSpop_pic()
            com.bumptech.glide.h r3 = r3.M(r5)
            r3.m1(r4)
            r3 = 0
            r0.setVisibility(r3)
            r3 = 10000(0x2710, float:1.4013E-41)
            b(r3, r6)
            return
    }

    public final java.lang.Object c() throws java.io.ObjectStreamException {
            r1 = this;
            com.acse.ottn.service.a r0 = com.acse.ottn.service.a.f2699d
            return r0
    }

    public void c(android.content.Context r5, android.view.View r6, com.acse.ottn.model.AccessiblityModel r7, com.acse.ottn.service.a.u0 r8) {
            r4 = this;
            int r0 = com.acse.ottn.R.id.custom_small_layout
            android.view.View r0 = r6.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            int r1 = com.acse.ottn.R.id.iv_custom_smile_close
            android.view.View r1 = r6.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            int r2 = com.acse.ottn.R.id.iv_custom
            android.view.View r2 = r6.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            int r3 = com.acse.ottn.R.id.iv_custom_smile_setting
            android.view.View r6 = r6.findViewById(r3)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            com.acse.ottn.model.AccessiblityModel$DataBean r3 = r7.getData()
            java.lang.String r3 = r3.getPackage_name()
            r4.a(r6, r3, r8)
            r4.a(r1, r8)
            com.acse.ottn.model.AccessiblityModel$DataBean r6 = r7.getData()
            java.lang.String r6 = r6.getSpop_pic()
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L3d
            return
        L3d:
            com.bumptech.glide.i r6 = com.bumptech.glide.b.D(r5)
            com.acse.ottn.model.AccessiblityModel$DataBean r1 = r7.getData()
            java.lang.String r1 = r1.getSpop_pic()
            com.bumptech.glide.h r6 = r6.M(r1)
            r6.m1(r2)
            r4.a(r5, r0, r7, r8)
            r5 = 8000(0x1f40, float:1.121E-41)
            b(r5, r8)
            return
    }

    public void d(android.content.Context r4, android.view.View r5, com.acse.ottn.model.AccessiblityModel r6, com.acse.ottn.service.a.u0 r7) {
            r3 = this;
            int r0 = com.acse.ottn.R.id.idlefish_small_layout
            android.view.View r0 = r5.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            int r1 = com.acse.ottn.R.id.iv_idlefish_smile_close
            android.view.View r1 = r5.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            int r2 = com.acse.ottn.R.id.iv_idlefish_smile_setting
            android.view.View r5 = r5.findViewById(r2)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            com.acse.ottn.model.AccessiblityModel$DataBean r2 = r6.getData()
            java.lang.String r2 = r2.getPackage_name()
            r3.a(r5, r2, r7)
            r3.a(r1, r7)
            r3.a(r4, r0, r6, r7)
            r4 = 8000(0x1f40, float:1.121E-41)
            b(r4, r7)
            return
    }

    public void e(android.content.Context r4, android.view.View r5, com.acse.ottn.model.AccessiblityModel r6, com.acse.ottn.service.a.u0 r7) {
            r3 = this;
            int r0 = com.acse.ottn.R.id.jd_home_small_layout
            android.view.View r0 = r5.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            int r1 = com.acse.ottn.R.id.iv_jd_home_smile_close
            android.view.View r1 = r5.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            int r2 = com.acse.ottn.R.id.iv_jd_home_smile_setting
            android.view.View r5 = r5.findViewById(r2)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            com.acse.ottn.model.AccessiblityModel$DataBean r2 = r6.getData()
            java.lang.String r2 = r2.getPackage_name()
            r3.a(r5, r2, r7)
            r3.a(r1, r7)
            r3.a(r4, r0, r6, r7)
            r4 = 8000(0x1f40, float:1.121E-41)
            b(r4, r7)
            return
    }

    public void f(android.content.Context r3, android.view.View r4, com.acse.ottn.model.AccessiblityModel r5, com.acse.ottn.service.a.u0 r6) {
            r2 = this;
            int r0 = com.acse.ottn.R.id.kfc_wp_close
            android.view.View r0 = r4.findViewById(r0)
            com.acse.ottn.service.a$s0 r1 = new com.acse.ottn.service.a$s0
            r1.<init>(r2, r6)
            r0.setOnClickListener(r1)
            int r0 = com.acse.ottn.R.id.kfc_wp
            android.view.View r4 = r4.findViewById(r0)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            com.acse.ottn.service.a$t0 r0 = new com.acse.ottn.service.a$t0
            r0.<init>(r2, r3, r5, r6)
            r4.setOnClickListener(r0)
            r3 = 0
            r4.setVisibility(r3)
            r3 = 10000(0x2710, float:1.4013E-41)
            b(r3, r6)
            return
    }

    public void g(android.content.Context r4, android.view.View r5, com.acse.ottn.model.AccessiblityModel r6, com.acse.ottn.service.a.u0 r7) {
            r3 = this;
            int r0 = com.acse.ottn.R.id.ks_small_layout
            android.view.View r0 = r5.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            int r1 = com.acse.ottn.R.id.iv_ks_smile_close
            android.view.View r1 = r5.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            int r2 = com.acse.ottn.R.id.iv_ks_smile_setting
            android.view.View r5 = r5.findViewById(r2)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            com.acse.ottn.model.AccessiblityModel$DataBean r2 = r6.getData()
            java.lang.String r2 = r2.getPackage_name()
            r3.a(r5, r2, r7)
            r3.a(r1, r7)
            r3.a(r4, r0, r6, r7)
            r4 = 8000(0x1f40, float:1.121E-41)
            b(r4, r7)
            return
    }

    public void h(android.content.Context r4, android.view.View r5, com.acse.ottn.model.AccessiblityModel r6, com.acse.ottn.service.a.u0 r7) {
            r3 = this;
            int r0 = com.acse.ottn.R.id.shangou_small_layout
            android.view.View r0 = r5.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            int r1 = com.acse.ottn.R.id.iv_shangou_smile_close
            android.view.View r1 = r5.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            int r2 = com.acse.ottn.R.id.iv_shangou_smile_setting
            android.view.View r5 = r5.findViewById(r2)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            com.acse.ottn.model.AccessiblityModel$DataBean r2 = r6.getData()
            java.lang.String r2 = r2.getPackage_name()
            r3.a(r5, r2, r7)
            r3.a(r1, r7)
            r3.a(r4, r0, r6, r7)
            r4 = 8000(0x1f40, float:1.121E-41)
            b(r4, r7)
            return
    }

    public void i(android.content.Context r4, android.view.View r5, com.acse.ottn.model.AccessiblityModel r6, com.acse.ottn.service.a.u0 r7) {
            r3 = this;
            int r0 = com.acse.ottn.R.id.tb_home_small_layout
            android.view.View r0 = r5.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            int r1 = com.acse.ottn.R.id.iv_tb_home_smile_close
            android.view.View r1 = r5.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            int r2 = com.acse.ottn.R.id.iv_tb_home_smile_setting
            android.view.View r5 = r5.findViewById(r2)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            com.acse.ottn.model.AccessiblityModel$DataBean r2 = r6.getData()
            java.lang.String r2 = r2.getPackage_name()
            r3.a(r5, r2, r7)
            r3.a(r1, r7)
            r3.a(r4, r0, r6, r7)
            r4 = 8000(0x1f40, float:1.121E-41)
            b(r4, r7)
            return
    }

    public void j(android.content.Context r3, android.view.View r4, com.acse.ottn.model.AccessiblityModel r5, com.acse.ottn.service.a.u0 r6) {
            r2 = this;
            int r0 = com.acse.ottn.R.id.tencent_close
            android.view.View r0 = r4.findViewById(r0)
            com.acse.ottn.service.a$b r1 = new com.acse.ottn.service.a$b
            r1.<init>(r2, r6)
            r0.setOnClickListener(r1)
            int r0 = com.acse.ottn.R.id.tencent_wp
            android.view.View r0 = r4.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            com.acse.ottn.service.a$c r1 = new com.acse.ottn.service.a$c
            r1.<init>(r2, r3, r5, r6)
            r0.setOnClickListener(r1)
            r3 = 0
            r0.setVisibility(r3)
            com.acse.ottn.model.AccessiblityModel$DataBean r3 = r5.getData()
            java.lang.String r3 = r3.getSpop_coupon_price()
            boolean r3 = r2.a(r3)
            if (r3 != 0) goto L6a
            com.acse.ottn.model.AccessiblityModel$DataBean r3 = r5.getData()
            java.lang.String r3 = r3.getNew_time_remaining()
            boolean r3 = r2.a(r3)
            if (r3 == 0) goto L3f
            goto L6a
        L3f:
            int r3 = com.acse.ottn.R.id.tencent_price
            android.view.View r3 = r4.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r5.getData()
            java.lang.String r0 = r0.getSpop_coupon_price()
            r3.setText(r0)
            int r3 = com.acse.ottn.R.id.tencent_surplus_time
            android.view.View r3 = r4.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            com.acse.ottn.model.AccessiblityModel$DataBean r4 = r5.getData()
            java.lang.String r4 = r4.getNew_time_remaining()
            r3.setText(r4)
            r3 = 10000(0x2710, float:1.4013E-41)
            b(r3, r6)
        L6a:
            return
    }

    public void k(android.content.Context r3, android.view.View r4, com.acse.ottn.model.AccessiblityModel r5, com.acse.ottn.service.a.u0 r6) {
            r2 = this;
            int r0 = com.acse.ottn.R.id.aiqiyi_close
            android.view.View r0 = r4.findViewById(r0)
            com.acse.ottn.service.a$o0 r1 = new com.acse.ottn.service.a$o0
            r1.<init>(r2, r6)
            r0.setOnClickListener(r1)
            int r0 = com.acse.ottn.R.id.video_aiqiyi
            android.view.View r0 = r4.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            com.acse.ottn.service.a$p0 r1 = new com.acse.ottn.service.a$p0
            r1.<init>(r2, r3, r5, r6)
            r0.setOnClickListener(r1)
            r3 = 0
            r0.setVisibility(r3)
            com.acse.ottn.model.AccessiblityModel$DataBean r3 = r5.getData()
            java.lang.String r3 = r3.getNew_time_remaining()
            boolean r3 = r2.a(r3)
            if (r3 != 0) goto L94
            com.acse.ottn.model.AccessiblityModel$DataBean r3 = r5.getData()
            java.lang.String r3 = r3.getSpop_coupon_price()
            boolean r3 = r2.a(r3)
            if (r3 != 0) goto L94
            com.acse.ottn.model.AccessiblityModel$DataBean r3 = r5.getData()
            java.lang.String r3 = r3.getOriginal_price()
            boolean r3 = r2.a(r3)
            if (r3 == 0) goto L4d
            goto L94
        L4d:
            int r3 = com.acse.ottn.R.id.aiqiyi_monery
            android.view.View r3 = r4.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r5.getData()
            java.lang.String r0 = r0.getSpop_coupon_price()
            r3.setText(r0)
            int r3 = com.acse.ottn.R.id.aiqiyi_all_monery
            android.view.View r3 = r4.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r5.getData()
            java.lang.String r0 = r0.getOriginal_price()
            r3.setText(r0)
            android.text.TextPaint r3 = r3.getPaint()
            r0 = 16
            r3.setFlags(r0)
            int r3 = com.acse.ottn.R.id.aiqiyi_surplus_time
            android.view.View r3 = r4.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            com.acse.ottn.model.AccessiblityModel$DataBean r4 = r5.getData()
            java.lang.String r4 = r4.getNew_time_remaining()
            r3.setText(r4)
            r3 = 10000(0x2710, float:1.4013E-41)
            b(r3, r6)
        L94:
            return
    }

    public void l(android.content.Context r4, android.view.View r5, com.acse.ottn.model.AccessiblityModel r6, com.acse.ottn.service.a.u0 r7) {
            r3 = this;
            int r0 = com.acse.ottn.R.id.wph_small_layout
            android.view.View r0 = r5.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            int r1 = com.acse.ottn.R.id.iv_wph_smile_close
            android.view.View r1 = r5.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            int r2 = com.acse.ottn.R.id.iv_wph_smile_setting
            android.view.View r5 = r5.findViewById(r2)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            com.acse.ottn.model.AccessiblityModel$DataBean r2 = r6.getData()
            java.lang.String r2 = r2.getPackage_name()
            r3.a(r5, r2, r7)
            r3.a(r1, r7)
            r3.a(r4, r0, r6, r7)
            r4 = 8000(0x1f40, float:1.121E-41)
            b(r4, r7)
            return
    }

    public void m(android.content.Context r3, android.view.View r4, com.acse.ottn.model.AccessiblityModel r5, com.acse.ottn.service.a.u0 r6) {
            r2 = this;
            int r0 = com.acse.ottn.R.id.taobao_close
            android.view.View r0 = r4.findViewById(r0)
            com.acse.ottn.service.a$m0 r1 = new com.acse.ottn.service.a$m0
            r1.<init>(r2, r6)
            r0.setOnClickListener(r1)
            int r0 = com.acse.ottn.R.id.taobao_main_box
            android.view.View r4 = r4.findViewById(r0)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            com.acse.ottn.service.a$n0 r0 = new com.acse.ottn.service.a$n0
            r0.<init>(r2, r3, r5, r6)
            r4.setOnClickListener(r0)
            com.acse.ottn.model.AccessiblityModel$DataBean r3 = r5.getData()
            java.lang.String r3 = r3.getSpop_pic()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L2d
            return
        L2d:
            r3 = 10000(0x2710, float:1.4013E-41)
            b(r3, r6)
            return
    }

    public void n(android.content.Context r3, android.view.View r4, com.acse.ottn.model.AccessiblityModel r5, com.acse.ottn.service.a.u0 r6) {
            r2 = this;
            int r0 = com.acse.ottn.R.id.youku_close
            android.view.View r0 = r4.findViewById(r0)
            com.acse.ottn.service.a$d r1 = new com.acse.ottn.service.a$d
            r1.<init>(r2, r6)
            r0.setOnClickListener(r1)
            int r0 = com.acse.ottn.R.id.youku_wp
            android.view.View r0 = r4.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            com.acse.ottn.service.a$e r1 = new com.acse.ottn.service.a$e
            r1.<init>(r2, r3, r5, r6)
            r0.setOnClickListener(r1)
            r3 = 0
            r0.setVisibility(r3)
            com.acse.ottn.model.AccessiblityModel$DataBean r3 = r5.getData()
            java.lang.String r3 = r3.getSpop_coupon_price()
            boolean r3 = r2.a(r3)
            if (r3 != 0) goto L6a
            com.acse.ottn.model.AccessiblityModel$DataBean r3 = r5.getData()
            java.lang.String r3 = r3.getNew_time_remaining()
            boolean r3 = r2.a(r3)
            if (r3 == 0) goto L3f
            goto L6a
        L3f:
            int r3 = com.acse.ottn.R.id.youku_price
            android.view.View r3 = r4.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r5.getData()
            java.lang.String r0 = r0.getSpop_coupon_price()
            r3.setText(r0)
            int r3 = com.acse.ottn.R.id.youku_surplus_time
            android.view.View r3 = r4.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            com.acse.ottn.model.AccessiblityModel$DataBean r4 = r5.getData()
            java.lang.String r4 = r4.getNew_time_remaining()
            r3.setText(r4)
            r3 = 10000(0x2710, float:1.4013E-41)
            b(r3, r6)
        L6a:
            return
    }

    public void o(android.content.Context r4, android.view.View r5, com.acse.ottn.model.AccessiblityModel r6, com.acse.ottn.service.a.u0 r7) {
            r3 = this;
            int r0 = com.acse.ottn.R.id.mt_xh_small_layout
            android.view.View r0 = r5.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            int r1 = com.acse.ottn.R.id.iv_mt_xh_smile_close
            android.view.View r1 = r5.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            int r2 = com.acse.ottn.R.id.iv_mt_xh_smile_setting
            android.view.View r5 = r5.findViewById(r2)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            com.acse.ottn.model.AccessiblityModel$DataBean r2 = r6.getData()
            java.lang.String r2 = r2.getPackage_name()
            r3.a(r5, r2, r7)
            r3.a(r1, r7)
            r3.a(r4, r0, r6, r7)
            r4 = 8000(0x1f40, float:1.121E-41)
            b(r4, r7)
            return
    }

    public void p(android.content.Context r4, android.view.View r5, com.acse.ottn.model.AccessiblityModel r6, com.acse.ottn.service.a.u0 r7) {
            r3 = this;
            int r0 = com.acse.ottn.R.id.mt_hotel_small_layout
            android.view.View r0 = r5.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            int r1 = com.acse.ottn.R.id.iv_mt_hotel_smile_close
            android.view.View r1 = r5.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            int r2 = com.acse.ottn.R.id.iv_mt_hotel_smile_setting
            android.view.View r5 = r5.findViewById(r2)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            com.acse.ottn.model.AccessiblityModel$DataBean r2 = r6.getData()
            java.lang.String r2 = r2.getPackage_name()
            r3.a(r5, r2, r7)
            r3.a(r1, r7)
            r3.a(r4, r0, r6, r7)
            r4 = 8000(0x1f40, float:1.121E-41)
            b(r4, r7)
            return
    }

    public void q(android.content.Context r4, android.view.View r5, com.acse.ottn.model.AccessiblityModel r6, com.acse.ottn.service.a.u0 r7) {
            r3 = this;
            int r0 = com.acse.ottn.R.id.mt_yy_small_layout
            android.view.View r0 = r5.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            int r1 = com.acse.ottn.R.id.iv_mt_yy_smile_close
            android.view.View r1 = r5.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            int r2 = com.acse.ottn.R.id.iv_mt_yy_smile_setting
            android.view.View r5 = r5.findViewById(r2)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            com.acse.ottn.model.AccessiblityModel$DataBean r2 = r6.getData()
            java.lang.String r2 = r2.getPackage_name()
            r3.a(r5, r2, r7)
            r3.a(r1, r7)
            r3.a(r4, r0, r6, r7)
            r4 = 8000(0x1f40, float:1.121E-41)
            b(r4, r7)
            return
    }

    public void r(android.content.Context r4, android.view.View r5, com.acse.ottn.model.AccessiblityModel r6, com.acse.ottn.service.a.u0 r7) {
            r3 = this;
            int r0 = com.acse.ottn.R.id.mt_shop_small_layout
            android.view.View r0 = r5.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            int r1 = com.acse.ottn.R.id.iv_mt_shop_smile_close
            android.view.View r1 = r5.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            int r2 = com.acse.ottn.R.id.iv_mt_shop_smile_setting
            android.view.View r5 = r5.findViewById(r2)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            com.acse.ottn.model.AccessiblityModel$DataBean r2 = r6.getData()
            java.lang.String r2 = r2.getPackage_name()
            r3.a(r5, r2, r7)
            r3.a(r1, r7)
            r3.a(r4, r0, r6, r7)
            r4 = 8000(0x1f40, float:1.121E-41)
            b(r4, r7)
            return
    }

    public void s(android.content.Context r3, android.view.View r4, com.acse.ottn.model.AccessiblityModel r5, com.acse.ottn.service.a.u0 r6) {
            r2 = this;
            int r0 = com.acse.ottn.R.id.didi_close
            android.view.View r0 = r4.findViewById(r0)
            com.acse.ottn.service.a$w r1 = new com.acse.ottn.service.a$w
            r1.<init>(r2, r6)
            r0.setOnClickListener(r1)
            int r0 = com.acse.ottn.R.id.didi_big
            android.view.View r4 = r4.findViewById(r0)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            com.acse.ottn.service.a$x r0 = new com.acse.ottn.service.a$x
            r0.<init>(r2, r3, r5, r6)
            r4.setOnClickListener(r0)
            r3 = 8000(0x1f40, float:1.121E-41)
            b(r3, r6)
            return
    }

    public void t(android.content.Context r5, android.view.View r6, com.acse.ottn.model.AccessiblityModel r7, com.acse.ottn.service.a.u0 r8) {
            r4 = this;
            int r0 = com.acse.ottn.R.id.didi_content_info
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            int r1 = com.acse.ottn.R.id.didi_small_content
            android.view.View r1 = r6.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r2 = com.acse.ottn.R.id.didi_small
            android.view.View r2 = r6.findViewById(r2)
            android.widget.RelativeLayout r2 = (android.widget.RelativeLayout) r2
            int r3 = com.acse.ottn.R.id.iv_didi_close
            android.view.View r3 = r6.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r4.a(r3, r8)
            com.acse.ottn.model.AccessiblityModel$DataBean r3 = r7.getData()
            java.lang.String r3 = r3.getPackage_name()
            boolean r3 = r4.a(r3)
            if (r3 != 0) goto L75
            com.acse.ottn.model.AccessiblityModel$DataBean r3 = r7.getData()
            java.lang.String r3 = r3.getSpop_title()
            boolean r3 = r4.a(r3)
            if (r3 == 0) goto L40
            goto L75
        L40:
            int r3 = com.acse.ottn.R.id.iv_didi_setting
            android.view.View r6 = r6.findViewById(r3)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            com.acse.ottn.model.AccessiblityModel$DataBean r3 = r7.getData()
            java.lang.String r3 = r3.getPackage_name()
            r4.a(r6, r3, r8)
            r6 = 0
            r2.setVisibility(r6)
            r4.a(r5, r2, r7, r8)
            com.acse.ottn.model.AccessiblityModel$DataBean r5 = r7.getData()
            java.lang.String r5 = r5.getSpop_title()
            r1.setText(r5)
            com.acse.ottn.model.AccessiblityModel$DataBean r5 = r7.getData()
            java.lang.String r5 = r5.getNew_time_remaining()
            r0.setText(r5)
            r5 = 8000(0x1f40, float:1.121E-41)
            b(r5, r8)
        L75:
            return
    }

    public void u(android.content.Context r3, android.view.View r4, com.acse.ottn.model.AccessiblityModel r5, com.acse.ottn.service.a.u0 r6) {
            r2 = this;
            int r0 = com.acse.ottn.R.id.fz_close
            android.view.View r0 = r4.findViewById(r0)
            com.acse.ottn.service.a$t r1 = new com.acse.ottn.service.a$t
            r1.<init>(r2, r6)
            r0.setOnClickListener(r1)
            com.acse.ottn.service.a$u r0 = new com.acse.ottn.service.a$u
            r0.<init>(r2, r3, r5, r6)
            r4.setOnClickListener(r0)
            com.acse.ottn.model.AccessiblityModel$DataBean r3 = r5.getData()
            java.lang.String r3 = r3.getSpop_coupon_price()
            boolean r3 = r2.a(r3)
            if (r3 == 0) goto L25
            return
        L25:
            r3 = 8000(0x1f40, float:1.121E-41)
            b(r3, r6)
            return
    }

    public void v(android.content.Context r3, android.view.View r4, com.acse.ottn.model.AccessiblityModel r5, com.acse.ottn.service.a.u0 r6) {
            r2 = this;
            int r0 = com.acse.ottn.R.id.jdwm_close
            android.view.View r0 = r4.findViewById(r0)
            com.acse.ottn.service.a$r r1 = new com.acse.ottn.service.a$r
            r1.<init>(r2, r6)
            r0.setOnClickListener(r1)
            com.acse.ottn.service.a$s r0 = new com.acse.ottn.service.a$s
            r0.<init>(r2, r3, r5, r6)
            r4.setOnClickListener(r0)
            com.acse.ottn.model.AccessiblityModel$DataBean r3 = r5.getData()
            java.lang.String r3 = r3.getSpop_coupon_price()
            boolean r3 = r2.a(r3)
            if (r3 == 0) goto L25
            return
        L25:
            int r3 = com.acse.ottn.R.id.jdwm_coupon_price
            android.view.View r3 = r4.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            com.acse.ottn.model.AccessiblityModel$DataBean r4 = r5.getData()
            java.lang.String r4 = r4.getSpop_coupon_price()
            r3.setText(r4)
            r3 = 8000(0x1f40, float:1.121E-41)
            b(r3, r6)
            return
    }

    public void w(android.content.Context r5, android.view.View r6, com.acse.ottn.model.AccessiblityModel r7, com.acse.ottn.service.a.u0 r8) {
            r4 = this;
            int r0 = com.acse.ottn.R.id.jdwm_content_info
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            int r1 = com.acse.ottn.R.id.jdwm_content
            android.view.View r1 = r6.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r2 = com.acse.ottn.R.id.jdwm_small_layout
            android.view.View r2 = r6.findViewById(r2)
            android.widget.RelativeLayout r2 = (android.widget.RelativeLayout) r2
            int r3 = com.acse.ottn.R.id.iv_jdwm_smile_close
            android.view.View r3 = r6.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r4.a(r3, r8)
            com.acse.ottn.model.AccessiblityModel$DataBean r3 = r7.getData()
            java.lang.String r3 = r3.getPackage_name()
            boolean r3 = r4.a(r3)
            if (r3 != 0) goto L71
            com.acse.ottn.model.AccessiblityModel$DataBean r3 = r7.getData()
            java.lang.String r3 = r3.getNew_time_remaining()
            boolean r3 = r4.a(r3)
            if (r3 == 0) goto L40
            goto L71
        L40:
            int r3 = com.acse.ottn.R.id.iv_jdwm_smile_setting
            android.view.View r6 = r6.findViewById(r3)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            com.acse.ottn.model.AccessiblityModel$DataBean r3 = r7.getData()
            java.lang.String r3 = r3.getPackage_name()
            r4.a(r6, r3, r8)
            r4.a(r5, r2, r7, r8)
            com.acse.ottn.model.AccessiblityModel$DataBean r5 = r7.getData()
            java.lang.String r5 = r5.getSpop_title()
            r1.setText(r5)
            com.acse.ottn.model.AccessiblityModel$DataBean r5 = r7.getData()
            java.lang.String r5 = r5.getNew_time_remaining()
            r0.setText(r5)
            r5 = 8000(0x1f40, float:1.121E-41)
            b(r5, r8)
        L71:
            return
    }

    public void x(android.content.Context r5, android.view.View r6, com.acse.ottn.model.AccessiblityModel r7, com.acse.ottn.service.a.u0 r8) {
            r4 = this;
            int r0 = com.acse.ottn.R.id.meituan_content_info
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            int r1 = com.acse.ottn.R.id.meituan_content
            android.view.View r1 = r6.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r2 = com.acse.ottn.R.id.meituan_small_layout
            android.view.View r2 = r6.findViewById(r2)
            android.widget.RelativeLayout r2 = (android.widget.RelativeLayout) r2
            int r3 = com.acse.ottn.R.id.iv_meituan_smile_close
            android.view.View r3 = r6.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r4.a(r3, r8)
            com.acse.ottn.model.AccessiblityModel$DataBean r3 = r7.getData()
            java.lang.String r3 = r3.getPackage_name()
            boolean r3 = r4.a(r3)
            if (r3 != 0) goto L75
            com.acse.ottn.model.AccessiblityModel$DataBean r3 = r7.getData()
            java.lang.String r3 = r3.getSpop_title()
            boolean r3 = r4.a(r3)
            if (r3 == 0) goto L40
            goto L75
        L40:
            int r3 = com.acse.ottn.R.id.iv_meituan_smile_setting
            android.view.View r6 = r6.findViewById(r3)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            com.acse.ottn.model.AccessiblityModel$DataBean r3 = r7.getData()
            java.lang.String r3 = r3.getPackage_name()
            r4.a(r6, r3, r8)
            r6 = 0
            r2.setVisibility(r6)
            r4.a(r5, r2, r7, r8)
            com.acse.ottn.model.AccessiblityModel$DataBean r5 = r7.getData()
            java.lang.String r5 = r5.getSpop_title()
            r1.setText(r5)
            com.acse.ottn.model.AccessiblityModel$DataBean r5 = r7.getData()
            java.lang.String r5 = r5.getNew_time_remaining()
            r0.setText(r5)
            r5 = 8000(0x1f40, float:1.121E-41)
            b(r5, r8)
        L75:
            return
    }

    public void y(android.content.Context r3, android.view.View r4, com.acse.ottn.model.AccessiblityModel r5, com.acse.ottn.service.a.u0 r6) {
            r2 = this;
            int r0 = com.acse.ottn.R.id.meituan_close
            android.view.View r0 = r4.findViewById(r0)
            com.acse.ottn.service.a$a0 r1 = new com.acse.ottn.service.a$a0
            r1.<init>(r2, r6)
            r0.setOnClickListener(r1)
            com.acse.ottn.service.a$b0 r0 = new com.acse.ottn.service.a$b0
            r0.<init>(r2, r3, r5, r6)
            r4.setOnClickListener(r0)
            r3 = 8000(0x1f40, float:1.121E-41)
            b(r3, r6)
            return
    }

    public void z(android.content.Context r3, android.view.View r4, com.acse.ottn.model.AccessiblityModel r5, com.acse.ottn.service.a.u0 r6) {
            r2 = this;
            int r0 = com.acse.ottn.R.id.iv_close
            android.view.View r0 = r4.findViewById(r0)
            com.acse.ottn.service.a$f r1 = new com.acse.ottn.service.a$f
            r1.<init>(r2, r6)
            r0.setOnClickListener(r1)
            int r0 = com.acse.ottn.R.id.taobao_treasure_box
            android.view.View r0 = r4.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            com.acse.ottn.service.a$g r1 = new com.acse.ottn.service.a$g
            r1.<init>(r2, r3, r5, r6)
            r0.setOnClickListener(r1)
            com.acse.ottn.model.AccessiblityModel$DataBean r3 = r5.getData()
            java.lang.String r3 = r3.getSpop_coupon_price()
            boolean r3 = r2.a(r3)
            if (r3 != 0) goto L77
            com.acse.ottn.model.AccessiblityModel$DataBean r3 = r5.getData()
            java.lang.String r3 = r3.getSpop_coupon_title()
            boolean r3 = r2.a(r3)
            if (r3 == 0) goto L3b
            goto L77
        L3b:
            int r3 = com.acse.ottn.R.id.tb_coupon_price
            android.view.View r3 = r4.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "¥"
            r0.append(r1)
            com.acse.ottn.model.AccessiblityModel$DataBean r1 = r5.getData()
            java.lang.String r1 = r1.getSpop_coupon_price()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.setText(r0)
            int r3 = com.acse.ottn.R.id.tb_textview
            android.view.View r3 = r4.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            com.acse.ottn.model.AccessiblityModel$DataBean r4 = r5.getData()
            java.lang.String r4 = r4.getSpop_coupon_title()
            r3.setText(r4)
            r3 = 8000(0x1f40, float:1.121E-41)
            b(r3, r6)
        L77:
            return
    }
}
