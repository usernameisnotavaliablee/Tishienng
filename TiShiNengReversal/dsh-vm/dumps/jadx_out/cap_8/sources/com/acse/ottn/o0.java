package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class o0 {

    /* renamed from: j, reason: collision with root package name */
    public static com.acse.ottn.o0 f2540j = null;

    /* renamed from: k, reason: collision with root package name */
    public static android.view.View f2541k = null;
    public static android.view.WindowManager l = null;
    public static java.lang.String m = "CountdownService";
    public android.view.WindowManager.LayoutParams a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.RelativeLayout f2542b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.ImageView f2543c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f2544d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f2545e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f2546f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f2547g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.TimerTask f2548h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.TimerTask f2549i;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements android.view.View.OnClickListener {
        public final /* synthetic */ android.app.Service a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.model.AccessiblityModel f2550b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.o0 f2551c;

        public a(com.acse.ottn.o0 r1, android.app.Service r2, com.acse.ottn.model.AccessiblityModel r3) {
                r0 = this;
                r0.f2551c = r1
                r0.a = r2
                r0.f2550b = r3
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                com.acse.ottn.o0 r3 = r2.f2551c
                android.app.Service r0 = r2.a
                r3.b(r0)
                com.acse.ottn.l4 r3 = com.acse.ottn.l4.c()
                android.app.Service r0 = r2.a
                com.acse.ottn.model.AccessiblityModel r1 = r2.f2550b
                r3.b(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b implements android.view.View.OnClickListener {
        public final /* synthetic */ android.app.Service a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.o0 f2552b;

        public b(com.acse.ottn.o0 r1, android.app.Service r2) {
                r0 = this;
                r0.f2552b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                com.acse.ottn.o0 r2 = r1.f2552b
                android.app.Service r0 = r1.a
                r2.b(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class c implements com.acse.ottn.n0.d {
        public final /* synthetic */ android.app.Service a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.o0 f2553b;

        public c(com.acse.ottn.o0 r1, android.app.Service r2) {
                r0 = this;
                r0.f2553b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a() {
                r2 = this;
                com.acse.ottn.o0 r0 = r2.f2553b
                android.app.Service r1 = r2.a
                r0.b(r1)
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a(long r7) {
                r6 = this;
                com.acse.ottn.o0 r0 = r6.f2553b
                android.widget.TextView r0 = r0.f2544d
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r2 = 60000(0xea60, double:2.9644E-319)
                long r4 = r7 / r2
                r1.append(r4)
                java.lang.String r4 = ""
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                r0.setText(r1)
                com.acse.ottn.o0 r0 = r6.f2553b
                android.widget.TextView r0 = r0.f2545e
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                long r7 = r7 % r2
                r2 = 1000(0x3e8, double:4.94E-321)
                long r7 = r7 / r2
                r1.append(r7)
                r1.append(r4)
                java.lang.String r7 = r1.toString()
                r0.setText(r7)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class d implements com.acse.ottn.n0.d {
        public final /* synthetic */ android.app.Service a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.o0 f2554b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public class a implements java.lang.Runnable {
            public final /* synthetic */ com.acse.ottn.o0.d a;

            public a(com.acse.ottn.o0.d r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    boolean r0 = com.acse.ottn.l0.f2434e
                    if (r0 != 0) goto L18
                    com.acse.ottn.o0$d r0 = r2.a
                    com.acse.ottn.o0 r0 = r0.f2554b
                    java.util.TimerTask r0 = r0.f2548h
                    if (r0 == 0) goto Lf
                    r0.cancel()
                Lf:
                    com.acse.ottn.o0$d r0 = r2.a
                    com.acse.ottn.o0 r1 = r0.f2554b
                    android.app.Service r0 = r0.a
                    r1.b(r0)
                L18:
                    return
            }
        }

        public d(com.acse.ottn.o0 r1, android.app.Service r2) {
                r0 = this;
                r0.f2554b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a() {
                r2 = this;
                com.acse.ottn.o0 r0 = r2.f2554b
                android.app.Service r1 = r2.a
                r0.b(r1)
                return
        }

        @Override // com.acse.ottn.n0.d
        public void a(long r3) {
                r2 = this;
                android.os.Handler r3 = new android.os.Handler
                android.os.Looper r4 = android.os.Looper.getMainLooper()
                r3.<init>(r4)
                com.acse.ottn.o0$d$a r4 = new com.acse.ottn.o0$d$a
                r4.<init>(r2)
                r0 = 0
                r3.postDelayed(r4, r0)
                return
        }
    }

    static {
            return
    }

    public o0() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.acse.ottn.o0 a() {
            com.acse.ottn.o0 r0 = com.acse.ottn.o0.f2540j
            if (r0 != 0) goto L19
            java.lang.Class<com.acse.ottn.o0> r0 = com.acse.ottn.o0.class
            monitor-enter(r0)
            com.acse.ottn.o0 r1 = com.acse.ottn.o0.f2540j     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.acse.ottn.o0 r1 = new com.acse.ottn.o0     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.acse.ottn.o0.f2540j = r1     // Catch: java.lang.Throwable -> L13
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
            com.acse.ottn.o0 r0 = com.acse.ottn.o0.f2540j
            return r0
    }

    public void a(android.app.Service r3) {
            r2 = this;
            android.view.WindowManager$LayoutParams r0 = new android.view.WindowManager$LayoutParams
            r0.<init>()
            r2.a = r0
            com.acse.ottn.h4 r0 = com.acse.ottn.h4.a()
            boolean r0 = r0.a(r3)
            java.lang.String r1 = "window"
            if (r0 == 0) goto L39
            android.app.Application r0 = r3.getApplication()
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            com.acse.ottn.o0.l = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L2c
            android.view.WindowManager$LayoutParams r0 = r2.a
            r1 = 2038(0x7f6, float:2.856E-42)
            r0.type = r1
            goto L32
        L2c:
            android.view.WindowManager$LayoutParams r0 = r2.a
            r1 = 2002(0x7d2, float:2.805E-42)
            r0.type = r1
        L32:
            android.view.WindowManager$LayoutParams r0 = r2.a
            r1 = 8
            r0.flags = r1
            goto L4b
        L39:
            java.lang.Object r0 = r3.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            com.acse.ottn.o0.l = r0
            android.view.WindowManager$LayoutParams r0 = r2.a
            r1 = 2032(0x7f0, float:2.847E-42)
            r0.type = r1
            r1 = 800(0x320, float:1.121E-42)
            r0.flags = r1
        L4b:
            android.view.WindowManager$LayoutParams r0 = r2.a
            r1 = 1
            r0.format = r1
            r1 = 16973827(0x1030003, float:2.4060908E-38)
            r0.windowAnimations = r1
            r1 = 85
            r0.gravity = r1
            r1 = 30
            r0.x = r1
            r1 = 700(0x2bc, float:9.81E-43)
            r0.y = r1
            r1 = 1119485952(0x42ba0000, float:93.0)
            int r1 = com.acse.ottn.x0.a(r3, r1)
            r0.width = r1
            android.view.WindowManager$LayoutParams r0 = r2.a
            r1 = 1120403456(0x42c80000, float:100.0)
            int r3 = com.acse.ottn.x0.a(r3, r1)
            r0.height = r3
            return
    }

    public final void a(android.app.Service r2, int r3) {
            r1 = this;
            android.app.Application r2 = r2.getApplication()     // Catch: java.lang.Throwable -> L13
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)     // Catch: java.lang.Throwable -> L13
            r0 = 0
            android.view.View r2 = r2.inflate(r3, r0)     // Catch: java.lang.Throwable -> L13
            com.acse.ottn.o0.f2541k = r2     // Catch: java.lang.Throwable -> L13
            r3 = 0
            r2.measure(r3, r3)     // Catch: java.lang.Throwable -> L13
        L13:
            return
    }

    public final void a(android.app.Service r5, com.acse.ottn.model.AccessiblityModel r6) {
            r4 = this;
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r6.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.O
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2f8
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r6.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.R
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2a
            goto L2f8
        L2a:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r6.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.o
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2d8
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r6.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.p
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L54
            goto L2d8
        L54:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r6.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.D
            boolean r0 = r0.equals(r1)
            java.lang.String r1 = "#FFFFFF"
            if (r0 == 0) goto L89
            android.widget.ImageView r0 = r4.f2543c
            int r2 = com.acse.ottn.R.mipmap.smallfloat_mtchaoshi
            r0.setImageResource(r2)
            android.widget.TextView r0 = r4.f2546f
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setTextColor(r1)
            android.widget.TextView r0 = r4.f2546f
            com.acse.ottn.model.AccessiblityModel$DataBean r1 = r6.getData()
            java.lang.String r1 = r1.getOriginal_price()
            r0.setText(r1)
            goto L317
        L89:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r6.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r2 = com.acse.ottn.o.c()
            java.lang.String r2 = r2.B
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lbe
            android.widget.ImageView r0 = r4.f2543c
            int r1 = com.acse.ottn.R.mipmap.smallfloat_mtjiudian
            r0.setImageResource(r1)
            android.widget.TextView r0 = r4.f2546f
            java.lang.String r1 = "#FF0000"
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setTextColor(r1)
            android.widget.TextView r0 = r4.f2546f
            com.acse.ottn.model.AccessiblityModel$DataBean r1 = r6.getData()
            java.lang.String r1 = r1.getOriginal_price()
            r0.setText(r1)
            goto L317
        Lbe:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r6.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r2 = com.acse.ottn.o.c()
            java.lang.String r2 = r2.y
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lf3
            android.widget.ImageView r0 = r4.f2543c
            int r1 = com.acse.ottn.R.mipmap.smallfloat_mtxianhua
            r0.setImageResource(r1)
            android.widget.TextView r0 = r4.f2546f
            java.lang.String r1 = "#FFF344"
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setTextColor(r1)
            android.widget.TextView r0 = r4.f2546f
            com.acse.ottn.model.AccessiblityModel$DataBean r1 = r6.getData()
            java.lang.String r1 = r1.getOriginal_price()
            r0.setText(r1)
            goto L317
        Lf3:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r6.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r2 = com.acse.ottn.o.c()
            java.lang.String r2 = r2.A
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L128
            android.widget.ImageView r0 = r4.f2543c
            int r1 = com.acse.ottn.R.mipmap.smallfloat_mtyiyao
            r0.setImageResource(r1)
            android.widget.TextView r0 = r4.f2546f
            java.lang.String r1 = "#FC5702"
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setTextColor(r1)
            android.widget.TextView r0 = r4.f2546f
            com.acse.ottn.model.AccessiblityModel$DataBean r1 = r6.getData()
            java.lang.String r1 = r1.getOriginal_price()
            r0.setText(r1)
            goto L317
        L128:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r6.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r2 = com.acse.ottn.o.c()
            java.lang.String r2 = r2.G
            boolean r0 = r0.equals(r2)
            java.lang.String r2 = "#EB2A23"
            if (r0 == 0) goto L15d
            android.widget.ImageView r0 = r4.f2543c
            int r1 = com.acse.ottn.R.mipmap.smallfloat_shangou
            r0.setImageResource(r1)
            android.widget.TextView r0 = r4.f2546f
            int r1 = android.graphics.Color.parseColor(r2)
            r0.setTextColor(r1)
            android.widget.TextView r0 = r4.f2546f
            com.acse.ottn.model.AccessiblityModel$DataBean r1 = r6.getData()
            java.lang.String r1 = r1.getOriginal_price()
            r0.setText(r1)
            goto L317
        L15d:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r6.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r3 = com.acse.ottn.o.c()
            java.lang.String r3 = r3.P
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L190
            android.widget.ImageView r0 = r4.f2543c
            int r1 = com.acse.ottn.R.mipmap.smallfloat_taobaoeleme
            r0.setImageResource(r1)
            android.widget.TextView r0 = r4.f2546f
            int r1 = android.graphics.Color.parseColor(r2)
            r0.setTextColor(r1)
            android.widget.TextView r0 = r4.f2546f
            com.acse.ottn.model.AccessiblityModel$DataBean r1 = r6.getData()
            java.lang.String r1 = r1.getOriginal_price()
            r0.setText(r1)
            goto L317
        L190:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r6.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r2 = com.acse.ottn.o.c()
            java.lang.String r2 = r2.f2529b0
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1b8
            android.widget.TextView r0 = r4.f2546f
            java.lang.String r1 = "#FF0057"
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setTextColor(r1)
            android.widget.ImageView r0 = r4.f2543c
            int r1 = com.acse.ottn.R.mipmap.smallfloat_vipshop
            r0.setImageResource(r1)
            goto L317
        L1b8:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r6.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r2 = com.acse.ottn.o.c()
            java.lang.String r2 = r2.F
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1ed
            android.widget.ImageView r0 = r4.f2543c
            int r1 = com.acse.ottn.R.mipmap.smallfloat_xianyu
            r0.setImageResource(r1)
            android.widget.TextView r0 = r4.f2546f
            java.lang.String r1 = "#FF5031"
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setTextColor(r1)
            android.widget.TextView r0 = r4.f2546f
            com.acse.ottn.model.AccessiblityModel$DataBean r1 = r6.getData()
            java.lang.String r1 = r1.getOriginal_price()
            r0.setText(r1)
            goto L317
        L1ed:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r6.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r2 = com.acse.ottn.o.c()
            java.lang.String r2 = r2.f2527a0
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L220
            android.widget.TextView r0 = r4.f2546f
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setTextColor(r1)
            android.widget.ImageView r0 = r4.f2543c
            int r1 = com.acse.ottn.R.mipmap.smallfloat_yidong
            r0.setImageResource(r1)
            android.widget.TextView r0 = r4.f2546f
            com.acse.ottn.model.AccessiblityModel$DataBean r1 = r6.getData()
            java.lang.String r1 = r1.getOriginal_price()
            r0.setText(r1)
            goto L317
        L220:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r6.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r2 = com.acse.ottn.o.c()
            java.lang.String r2 = r2.E
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L253
            android.widget.TextView r0 = r4.f2546f
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setTextColor(r1)
            android.widget.ImageView r0 = r4.f2543c
            int r1 = com.acse.ottn.R.mipmap.smallfloat_mtguoshu
            r0.setImageResource(r1)
            android.widget.TextView r0 = r4.f2546f
            com.acse.ottn.model.AccessiblityModel$DataBean r1 = r6.getData()
            java.lang.String r1 = r1.getOriginal_price()
            r0.setText(r1)
            goto L317
        L253:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r6.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r2 = com.acse.ottn.o.c()
            java.lang.String r2 = r2.J
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L2ba
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r6.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r2 = com.acse.ottn.o.c()
            java.lang.String r2 = r2.N
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L2ba
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r6.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r2 = com.acse.ottn.o.c()
            java.lang.String r2 = r2.l
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L290
            goto L2ba
        L290:
            com.acse.ottn.model.AccessiblityModel$DataBean r0 = r6.getData()
            java.lang.String r0 = r0.getPackage_name()
            com.acse.ottn.o r1 = com.acse.ottn.o.c()
            java.lang.String r1 = r1.U
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L317
            com.bumptech.glide.i r0 = com.bumptech.glide.b.D(r5)
            com.acse.ottn.model.AccessiblityModel$DataBean r1 = r6.getData()
            java.lang.String r1 = r1.getSpop_pic()
            com.bumptech.glide.h r0 = r0.M(r1)
            android.widget.ImageView r1 = r4.f2543c
            r0.m1(r1)
            goto L317
        L2ba:
            android.widget.TextView r0 = r4.f2546f
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setTextColor(r1)
            android.widget.ImageView r0 = r4.f2543c
            int r1 = com.acse.ottn.R.mipmap.smallfloat_mt
            r0.setImageResource(r1)
            android.widget.TextView r0 = r4.f2546f
            com.acse.ottn.model.AccessiblityModel$DataBean r1 = r6.getData()
            java.lang.String r1 = r1.getOriginal_price()
            r0.setText(r1)
            goto L317
        L2d8:
            android.widget.ImageView r0 = r4.f2543c
            int r1 = com.acse.ottn.R.mipmap.smallfloat_kuaishou
            r0.setImageResource(r1)
            android.widget.TextView r0 = r4.f2546f
            java.lang.String r1 = "#FFFCC6"
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setTextColor(r1)
            android.widget.TextView r0 = r4.f2546f
            com.acse.ottn.model.AccessiblityModel$DataBean r1 = r6.getData()
            java.lang.String r1 = r1.getOriginal_price()
            r0.setText(r1)
            goto L317
        L2f8:
            android.widget.ImageView r0 = r4.f2543c
            int r1 = com.acse.ottn.R.mipmap.smallfloat_eleme
            r0.setImageResource(r1)
            android.widget.TextView r0 = r4.f2546f
            java.lang.String r1 = "#1A7BCF"
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setTextColor(r1)
            android.widget.TextView r0 = r4.f2546f
            com.acse.ottn.model.AccessiblityModel$DataBean r1 = r6.getData()
            java.lang.String r1 = r1.getOriginal_price()
            r0.setText(r1)
        L317:
            android.widget.RelativeLayout r0 = r4.f2542b
            com.acse.ottn.o0$a r1 = new com.acse.ottn.o0$a
            r1.<init>(r4, r5, r6)
            r0.setOnClickListener(r1)
            android.widget.ImageView r0 = r4.f2547g
            com.acse.ottn.o0$b r1 = new com.acse.ottn.o0$b
            r1.<init>(r4, r5)
            r0.setOnClickListener(r1)
            com.acse.ottn.n0 r0 = com.acse.ottn.n0.a()
            com.acse.ottn.model.AccessiblityModel$DataBean r1 = r6.getData()
            int r1 = r1.getSmallfloat_hour()
            r2 = 1000(0x3e8, float:1.401E-42)
            int r1 = r1 * 1000
            com.acse.ottn.o0$c r3 = new com.acse.ottn.o0$c
            r3.<init>(r4, r5)
            java.util.TimerTask r0 = r0.b(r1, r2, r3)
            r4.f2549i = r0
            com.acse.ottn.n0 r0 = com.acse.ottn.n0.a()
            com.acse.ottn.model.AccessiblityModel$DataBean r6 = r6.getData()
            int r6 = r6.getTime_four()
            com.acse.ottn.o0$d r1 = new com.acse.ottn.o0$d
            r1.<init>(r4, r5)
            r5 = 500(0x1f4, float:7.0E-43)
            java.util.TimerTask r5 = r0.b(r6, r5, r1)
            r4.f2548h = r5
            return
    }

    public final java.lang.Object b() throws java.io.ObjectStreamException {
            r1 = this;
            com.acse.ottn.o0 r0 = com.acse.ottn.o0.f2540j
            return r0
    }

    public void b(android.app.Service r3) {
            r2 = this;
            android.view.View r0 = com.acse.ottn.o0.f2541k     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L9
            r1 = 8
            r0.setVisibility(r1)     // Catch: java.lang.Throwable -> L2e
        L9:
            java.util.TimerTask r0 = r2.f2548h     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L10
            r0.cancel()     // Catch: java.lang.Throwable -> L2e
        L10:
            java.util.TimerTask r0 = r2.f2549i     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L17
            r0.cancel()     // Catch: java.lang.Throwable -> L2e
        L17:
            android.view.WindowManager r0 = com.acse.ottn.o0.l     // Catch: java.lang.Throwable -> L2e
            android.view.View r1 = com.acse.ottn.o0.f2541k     // Catch: java.lang.Throwable -> L2e
            r0.removeView(r1)     // Catch: java.lang.Throwable -> L2e
            com.acse.ottn.h4 r0 = com.acse.ottn.h4.a()     // Catch: java.lang.Throwable -> L2e
            boolean r0 = r0.a(r3)     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L29
            goto L2b
        L29:
            android.accessibilityservice.AccessibilityService r3 = (android.accessibilityservice.AccessibilityService) r3     // Catch: java.lang.Throwable -> L2e
        L2b:
            r3.stopSelf()     // Catch: java.lang.Throwable -> L2e
        L2e:
            return
    }

    public void b(android.app.Service r3, com.acse.ottn.model.AccessiblityModel r4) {
            r2 = this;
            int r0 = com.acse.ottn.R.layout.count_down_background
            r2.a(r3, r0)
            android.view.View r0 = com.acse.ottn.o0.f2541k
            int r1 = com.acse.ottn.R.id.beijing
            android.view.View r0 = r0.findViewById(r1)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r2.f2542b = r0
            android.view.View r0 = com.acse.ottn.o0.f2541k
            int r1 = com.acse.ottn.R.id.iv_image
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.f2543c = r0
            android.view.View r0 = com.acse.ottn.o0.f2541k
            int r1 = com.acse.ottn.R.id.tv_hour
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.f2544d = r0
            android.view.View r0 = com.acse.ottn.o0.f2541k
            int r1 = com.acse.ottn.R.id.tv_minute
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.f2545e = r0
            android.view.View r0 = com.acse.ottn.o0.f2541k
            int r1 = com.acse.ottn.R.id.iv_setting
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.f2547g = r0
            android.view.View r0 = com.acse.ottn.o0.f2541k
            int r1 = com.acse.ottn.R.id.tv_price
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.f2546f = r0
            r2.a(r3, r4)
            android.view.WindowManager r3 = com.acse.ottn.o0.l
            android.view.View r4 = com.acse.ottn.o0.f2541k
            android.view.WindowManager$LayoutParams r0 = r2.a
            r3.addView(r4, r0)
            return
    }
}
