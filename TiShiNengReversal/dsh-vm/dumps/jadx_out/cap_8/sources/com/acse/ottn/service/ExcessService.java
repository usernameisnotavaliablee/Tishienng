package com.acse.ottn.service;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ExcessService extends android.app.Service {

    /* renamed from: e, reason: collision with root package name */
    public static android.view.View f2661e = null;

    /* renamed from: f, reason: collision with root package name */
    public static android.view.WindowManager f2662f = null;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f2663g = "MainService";
    public android.view.WindowManager.LayoutParams a;

    /* renamed from: b, reason: collision with root package name */
    public com.acse.ottn.model.AccessiblityModel f2664b;

    /* renamed from: c, reason: collision with root package name */
    public int f2665c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2666d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements java.lang.Runnable {
        public final /* synthetic */ java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f2667b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f2668c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f2669d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f2670e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f2671f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f2672g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f2673h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.service.ExcessService f2674i;

        public a(com.acse.ottn.service.ExcessService r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5, java.lang.String r6, java.lang.String r7, int r8, java.lang.String r9) {
                r0 = this;
                r0.f2674i = r1
                r0.a = r2
                r0.f2667b = r3
                r0.f2668c = r4
                r0.f2669d = r5
                r0.f2670e = r6
                r0.f2671f = r7
                r0.f2672g = r8
                r0.f2673h = r9
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                android.content.Intent r0 = new android.content.Intent
                com.acse.ottn.service.ExcessService r1 = r3.f2674i
                java.lang.Class<com.acse.ottn.activity.ExcessActivity> r2 = com.acse.ottn.activity.ExcessActivity.class
                r0.<init>(r1, r2)
                java.lang.String r1 = r3.a
                java.lang.String r2 = "password"
                r0.putExtra(r2, r1)
                java.lang.String r1 = r3.f2667b
                java.lang.String r2 = "deeplink"
                r0.putExtra(r2, r1)
                java.lang.String r1 = r3.f2668c
                java.lang.String r2 = "link"
                r0.putExtra(r2, r1)
                int r1 = r3.f2669d
                java.lang.String r2 = "time"
                r0.putExtra(r2, r1)
                java.lang.String r1 = r3.f2670e
                java.lang.String r2 = "name"
                r0.putExtra(r2, r1)
                java.lang.String r1 = r3.f2671f
                java.lang.String r2 = "origin_url"
                r0.putExtra(r2, r1)
                int r1 = r3.f2672g
                java.lang.String r2 = "dissmiss_time"
                r0.putExtra(r2, r1)
                java.lang.String r1 = r3.f2673h
                java.lang.String r2 = "jump_type"
                r0.putExtra(r2, r1)
                r1 = 268435456(0x10000000, float:2.524355E-29)
                r0.addFlags(r1)
                com.acse.ottn.service.ExcessService r1 = r3.f2674i
                r1.startActivity(r0)
                com.acse.ottn.service.ExcessService r0 = r3.f2674i
                r0.b()
                return
        }
    }

    static {
            r0 = 10046(0x273e, float:1.4077E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public ExcessService() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f2665c = r0
            r0 = 0
            r1.f2666d = r0
            return
    }

    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    public final void a() {
            r2 = this;
            android.view.WindowManager$LayoutParams r0 = new android.view.WindowManager$LayoutParams
            r0.<init>()
            r2.a = r0
            android.app.Application r0 = r2.getApplication()
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            com.acse.ottn.service.ExcessService.f2662f = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L22
            android.view.WindowManager$LayoutParams r0 = r2.a
            r1 = 2038(0x7f6, float:2.856E-42)
            r0.type = r1
            goto L28
        L22:
            android.view.WindowManager$LayoutParams r0 = r2.a
            r1 = 2002(0x7d2, float:2.805E-42)
            r0.type = r1
        L28:
            android.view.WindowManager$LayoutParams r0 = r2.a
            r1 = 1
            r0.format = r1
            r1 = 8
            r0.flags = r1
            r1 = 16973827(0x1030003, float:2.4060908E-38)
            r0.windowAnimations = r1
            r1 = 51
            r0.gravity = r1
            r1 = 0
            r0.x = r1
            r0.y = r1
            r1 = -2
            r0.width = r1
            r0.height = r1
            return
    }

    public final void a(int r4) {
            r3 = this;
            android.app.Application r0 = r3.getApplication()     // Catch: java.lang.Exception -> L14
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)     // Catch: java.lang.Exception -> L14
            r1 = 0
            android.view.View r4 = r0.inflate(r4, r1)     // Catch: java.lang.Exception -> L14
            com.acse.ottn.service.ExcessService.f2661e = r4     // Catch: java.lang.Exception -> L14
            r0 = 0
            r4.measure(r0, r0)     // Catch: java.lang.Exception -> L14
            return
        L14:
            r4 = move-exception
            java.lang.String r0 = com.acse.ottn.service.ExcessService.f2663g
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "setLayoutView e = "
            r1.append(r2)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            com.acse.ottn.h2.a(r0, r4)
            return
    }

    public final void a(android.content.Intent r12) {
            r11 = this;
            if (r12 != 0) goto L4
            goto L91
        L4:
            int r0 = com.acse.ottn.R.layout.excess_view
            r11.a(r0)
            java.lang.String r0 = "password"
            java.lang.String r3 = r12.getStringExtra(r0)     // Catch: java.lang.Exception -> L75
            java.lang.String r0 = "deeplink"
            java.lang.String r4 = r12.getStringExtra(r0)     // Catch: java.lang.Exception -> L75
            java.lang.String r0 = "link"
            java.lang.String r5 = r12.getStringExtra(r0)     // Catch: java.lang.Exception -> L75
            java.lang.String r0 = "origin_url"
            java.lang.String r8 = r12.getStringExtra(r0)     // Catch: java.lang.Exception -> L75
            java.lang.String r0 = "name"
            java.lang.String r7 = r12.getStringExtra(r0)     // Catch: java.lang.Exception -> L75
            java.lang.String r0 = "time"
            r1 = 100
            int r6 = r12.getIntExtra(r0, r1)     // Catch: java.lang.Exception -> L75
            java.lang.String r0 = "dissmiss_time"
            r1 = 0
            int r9 = r12.getIntExtra(r0, r1)     // Catch: java.lang.Exception -> L75
            java.lang.String r0 = "jump_type"
            java.lang.String r10 = r12.getStringExtra(r0)     // Catch: java.lang.Exception -> L75
            android.view.WindowManager r12 = com.acse.ottn.service.ExcessService.f2662f     // Catch: java.lang.Exception -> L48
            if (r12 == 0) goto L64
            android.view.View r0 = com.acse.ottn.service.ExcessService.f2661e     // Catch: java.lang.Exception -> L48
            android.view.WindowManager$LayoutParams r1 = r11.a     // Catch: java.lang.Exception -> L48
            r12.addView(r0, r1)     // Catch: java.lang.Exception -> L48
            goto L64
        L48:
            r0 = move-exception
            r12 = r0
            java.lang.String r0 = com.acse.ottn.service.ExcessService.f2663g     // Catch: java.lang.Exception -> L75
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L75
            r1.<init>()     // Catch: java.lang.Exception -> L75
            java.lang.String r2 = "添加失败 e="
            r1.append(r2)     // Catch: java.lang.Exception -> L75
            java.lang.String r12 = r12.getMessage()     // Catch: java.lang.Exception -> L75
            r1.append(r12)     // Catch: java.lang.Exception -> L75
            java.lang.String r12 = r1.toString()     // Catch: java.lang.Exception -> L75
            com.acse.ottn.h2.a(r0, r12)     // Catch: java.lang.Exception -> L75
        L64:
            android.os.Handler r12 = new android.os.Handler     // Catch: java.lang.Exception -> L75
            r12.<init>()     // Catch: java.lang.Exception -> L75
            com.acse.ottn.service.ExcessService$a r1 = new com.acse.ottn.service.ExcessService$a     // Catch: java.lang.Exception -> L75
            r2 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L75
            r2 = 0
            r12.postDelayed(r1, r2)     // Catch: java.lang.Exception -> L75
            goto L91
        L75:
            r0 = move-exception
            r12 = r0
            java.lang.String r0 = com.acse.ottn.service.ExcessService.f2663g
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "startExcessActivity e="
            r1.append(r2)
            java.lang.String r12 = r12.getMessage()
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            com.acse.ottn.h2.a(r0, r12)
        L91:
            return
    }

    public void b() {
            r2 = this;
            android.view.View r0 = com.acse.ottn.service.ExcessService.f2661e     // Catch: java.lang.Exception -> Lf
            r1 = 8
            r0.setVisibility(r1)     // Catch: java.lang.Exception -> Lf
            android.view.WindowManager r0 = com.acse.ottn.service.ExcessService.f2662f     // Catch: java.lang.Exception -> Lf
            android.view.View r1 = com.acse.ottn.service.ExcessService.f2661e     // Catch: java.lang.Exception -> Lf
            r0.removeView(r1)     // Catch: java.lang.Exception -> Lf
            return
        Lf:
            r0 = move-exception
            java.lang.String r1 = com.acse.ottn.service.ExcessService.f2663g
            java.lang.String r0 = r0.getMessage()
            com.acse.ottn.h2.a(r1, r0)
            return
    }

    @Override // android.app.Service
    @androidx.annotation.Nullable
    public android.os.IBinder onBind(android.content.Intent r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.app.Service
    public void onCreate() {
            r2 = this;
            super.onCreate()
            java.lang.String r0 = com.acse.ottn.service.ExcessService.f2663g
            java.lang.String r1 = "MainService Created"
            com.acse.ottn.h2.c(r0, r1)
            r2.a()
            return
    }

    @Override // android.app.Service
    public void onDestroy() {
            r4 = this;
            com.acse.ottn.service.a.b()     // Catch: java.lang.Exception -> L10
            com.acse.ottn.service.a.d()     // Catch: java.lang.Exception -> L10
            android.view.View r0 = com.acse.ottn.service.ExcessService.f2661e     // Catch: java.lang.Exception -> L10
            if (r0 == 0) goto L2b
            android.view.WindowManager r1 = com.acse.ottn.service.ExcessService.f2662f     // Catch: java.lang.Exception -> L10
            r1.removeView(r0)     // Catch: java.lang.Exception -> L10
            goto L2b
        L10:
            r0 = move-exception
            java.lang.String r1 = com.acse.ottn.service.ExcessService.f2663g
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "e="
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.acse.ottn.h2.c(r1, r0)
        L2b:
            super.onDestroy()
            return
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent r2, int r3, int r4) {
            r1 = this;
            r1.a(r2)     // Catch: java.lang.Exception -> L4
            goto L1f
        L4:
            r2 = move-exception
            java.lang.String r3 = com.acse.ottn.service.ExcessService.f2663g
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "onStartCommand e="
            r4.append(r0)
            java.lang.String r2 = r2.getMessage()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.acse.ottn.h2.c(r3, r2)
        L1f:
            r2 = 2
            return r2
    }
}
