package com.beizi.fusion.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    public static java.lang.String a = null;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f7558b = "";

    /* renamed from: c, reason: collision with root package name */
    private static java.lang.String f7559c = "AdManager";

    /* renamed from: d, reason: collision with root package name */
    private static com.beizi.fusion.c.b f7560d;

    /* renamed from: e, reason: collision with root package name */
    private static java.lang.String f7561e;

    /* renamed from: j, reason: collision with root package name */
    private static java.lang.String f7562j;

    /* renamed from: k, reason: collision with root package name */
    private static java.lang.String f7563k;

    /* renamed from: f, reason: collision with root package name */
    private android.content.Context f7564f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f7565g;

    /* renamed from: h, reason: collision with root package name */
    private com.beizi.fusion.update.b f7566h;

    /* renamed from: i, reason: collision with root package name */
    private com.beizi.fusion.events.b f7567i;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private com.beizi.fusion.BeiZiInitCallBack q;
    private boolean r;





    static {
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f7565g = r0
            r1.l = r0
            r1.m = r0
            r1.n = r0
            r1.o = r0
            r1.p = r0
            return
    }

    public static com.beizi.fusion.c.b a() {
            com.beizi.fusion.c.b r0 = com.beizi.fusion.c.b.f7560d
            if (r0 != 0) goto L19
            java.lang.Class<com.beizi.fusion.c.b> r0 = com.beizi.fusion.c.b.class
            monitor-enter(r0)
            com.beizi.fusion.c.b r1 = com.beizi.fusion.c.b.f7560d     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.beizi.fusion.c.b r1 = new com.beizi.fusion.c.b     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.beizi.fusion.c.b.f7560d = r1     // Catch: java.lang.Throwable -> L13
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
            com.beizi.fusion.c.b r0 = com.beizi.fusion.c.b.f7560d
            return r0
    }

    static /* synthetic */ void a(com.beizi.fusion.c.b r0) {
            r0.r()
            return
    }

    static /* synthetic */ void b(com.beizi.fusion.c.b r0) {
            r0.u()
            return
    }

    static /* synthetic */ void c(com.beizi.fusion.c.b r0) {
            r0.t()
            return
    }

    static /* synthetic */ android.content.Context d(com.beizi.fusion.c.b r0) {
            android.content.Context r0 = r0.f7564f
            return r0
    }

    static /* synthetic */ void e(com.beizi.fusion.c.b r0) {
            r0.s()
            return
    }

    static /* synthetic */ java.lang.String q() {
            java.lang.String r0 = com.beizi.fusion.c.b.f7559c
            return r0
    }

    private void r() {
            r2 = this;
            boolean r0 = r2.o
            if (r0 != 0) goto Ld
            com.beizi.fusion.tool.n r0 = com.beizi.fusion.tool.n.a()
            android.content.Context r1 = r2.f7564f
            r0.a(r1)
        Ld:
            android.content.Context r0 = r2.f7564f
            com.beizi.fusion.model.ResponseInfo r0 = com.beizi.fusion.model.ResponseInfo.getInstance(r0)
            r0.init()
            boolean r0 = r2.m
            r1 = 1
            if (r0 != 0) goto L25
            com.beizi.fusion.events.b r0 = r2.f7567i
            com.beizi.fusion.events.a$i r0 = r0.a
            r0.a(r1)
            r2.l()
        L25:
            r2.g()
            boolean r0 = r2.m
            if (r0 != 0) goto L3e
            com.beizi.fusion.events.b r0 = r2.f7567i
            com.beizi.fusion.events.a$i r0 = r0.a
            int r0 = r0.a()
            if (r0 != r1) goto L3e
            com.beizi.fusion.events.b r0 = r2.f7567i
            com.beizi.fusion.events.a$i r0 = r0.a
            r1 = 2
            r0.a(r1)
        L3e:
            boolean r0 = com.beizi.fusion.BeiZis.isIsSyncInit()
            if (r0 != 0) goto L4b
            com.beizi.fusion.BeiZiInitCallBack r0 = r2.q
            if (r0 == 0) goto L4b
            r0.success()
        L4b:
            return
    }

    private void s() {
            r2 = this;
            com.beizi.fusion.d.a.b r0 = new com.beizi.fusion.d.a.b     // Catch: java.lang.Throwable -> Lc
            com.beizi.fusion.d.a.b$a r1 = com.beizi.fusion.tool.ad.b     // Catch: java.lang.Throwable -> Lc
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc
            android.content.Context r1 = r2.f7564f     // Catch: java.lang.Throwable -> Lc
            r0.a(r1)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    private void t() {
            r10 = this;
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "0"
            java.lang.String r2 = "SM_STATUS"
            android.content.Context r3 = r10.f7564f     // Catch: java.lang.Throwable -> Lad
            com.beizi.fusion.model.ResponseInfo r3 = com.beizi.fusion.model.ResponseInfo.getInstance(r3)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r3 = r3.getSmFlag()     // Catch: java.lang.Throwable -> Lad
            boolean r3 = r1.equals(r3)     // Catch: java.lang.Throwable -> Lad
            if (r3 == 0) goto Lad
            android.content.Context r3 = r10.f7564f     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r3 = com.beizi.fusion.tool.an.b(r3, r2, r0)     // Catch: java.lang.Throwable -> Lad
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> Lad
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> Lad
            java.lang.String r4 = "SM_STATUS_EXPIRE_TIME"
            r5 = 3
            r6 = 1
            if (r3 != r6) goto L42
            android.content.Context r3 = r10.f7564f     // Catch: java.lang.Throwable -> Lad
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> Lad
            com.beizi.fusion.tool.an.a(r3, r2, r7)     // Catch: java.lang.Throwable -> Lad
            android.content.Context r3 = r10.f7564f     // Catch: java.lang.Throwable -> Lad
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lad
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> Lad
            com.beizi.fusion.tool.an.a(r3, r4, r7)     // Catch: java.lang.Throwable -> Lad
            r3 = 3
        L42:
            r7 = 2
            if (r3 == 0) goto L4a
            if (r3 != r7) goto L48
            goto L4a
        L48:
            r6 = r3
            goto L53
        L4a:
            android.content.Context r3 = r10.f7564f     // Catch: java.lang.Throwable -> Lad
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Lad
            com.beizi.fusion.tool.an.a(r3, r2, r8)     // Catch: java.lang.Throwable -> Lad
        L53:
            if (r6 != r5) goto L92
            android.content.Context r3 = r10.f7564f     // Catch: java.lang.Throwable -> Lad
            long r5 = java.lang.Long.parseLong(r1)     // Catch: java.lang.Throwable -> Lad
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r3 = com.beizi.fusion.tool.an.b(r3, r4, r5)     // Catch: java.lang.Throwable -> Lad
            java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.Throwable -> Lad
            long r5 = r3.longValue()     // Catch: java.lang.Throwable -> Lad
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto Lad
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lad
            long r7 = r3.longValue()     // Catch: java.lang.Throwable -> Lad
            long r5 = r5 - r7
            r7 = 864000000(0x337f9800, double:4.26872718E-315)
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 <= 0) goto Lad
            android.content.Context r3 = r10.f7564f     // Catch: java.lang.Throwable -> Lad
            com.beizi.fusion.tool.an.a(r3, r2, r0)     // Catch: java.lang.Throwable -> Lad
            android.content.Context r0 = r10.f7564f     // Catch: java.lang.Throwable -> Lad
            long r1 = java.lang.Long.parseLong(r1)     // Catch: java.lang.Throwable -> Lad
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> Lad
            com.beizi.fusion.tool.an.a(r0, r4, r1)     // Catch: java.lang.Throwable -> Lad
            return
        L92:
            android.content.Context r0 = r10.f7564f     // Catch: java.lang.Throwable -> Lad
            boolean r0 = com.beizi.fusion.sm.b.a.a(r0)     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto La4
            android.content.Context r0 = r10.f7564f     // Catch: java.lang.Throwable -> Lad
            com.beizi.fusion.c.b$3 r1 = new com.beizi.fusion.c.b$3     // Catch: java.lang.Throwable -> Lad
            r1.<init>(r10)     // Catch: java.lang.Throwable -> Lad
            com.beizi.fusion.sm.b.a.a(r0, r1)     // Catch: java.lang.Throwable -> Lad
        La4:
            android.content.Context r0 = r10.f7564f     // Catch: java.lang.Throwable -> Lad
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> Lad
            com.beizi.fusion.tool.an.a(r0, r2, r1)     // Catch: java.lang.Throwable -> Lad
        Lad:
            return
    }

    private void u() {
            r3 = this;
            java.lang.String r0 = android.os.Build.BRAND     // Catch: java.lang.Exception -> L45
            java.lang.String r1 = "HONOR"
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Exception -> L45
            if (r0 == 0) goto L45
            android.content.Context r0 = r3.f7564f     // Catch: java.lang.Exception -> L45
            java.lang.String r1 = "__HONOROAID__"
            java.lang.String r2 = ""
            java.lang.Object r0 = com.beizi.fusion.tool.an.b(r0, r1, r2)     // Catch: java.lang.Exception -> L45
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L45
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L45
            if (r1 != 0) goto L35
            android.content.Context r1 = r3.f7564f     // Catch: java.lang.Exception -> L45
            com.beizi.fusion.model.RequestInfo r1 = com.beizi.fusion.model.RequestInfo.getInstance(r1)     // Catch: java.lang.Exception -> L45
            com.beizi.fusion.model.DevInfo r1 = r1.getDevInfo()     // Catch: java.lang.Exception -> L45
            if (r1 == 0) goto L35
            android.content.Context r1 = r3.f7564f     // Catch: java.lang.Exception -> L45
            com.beizi.fusion.model.RequestInfo r1 = com.beizi.fusion.model.RequestInfo.getInstance(r1)     // Catch: java.lang.Exception -> L45
            com.beizi.fusion.model.DevInfo r1 = r1.getDevInfo()     // Catch: java.lang.Exception -> L45
            r1.setHonorOaid(r0)     // Catch: java.lang.Exception -> L45
        L35:
            com.beizi.fusion.tool.e r0 = com.beizi.fusion.tool.e.b()     // Catch: java.lang.Exception -> L45
            java.util.concurrent.ExecutorService r0 = r0.c()     // Catch: java.lang.Exception -> L45
            com.beizi.fusion.c.b$4 r1 = new com.beizi.fusion.c.b$4     // Catch: java.lang.Exception -> L45
            r1.<init>(r3)     // Catch: java.lang.Exception -> L45
            r0.execute(r1)     // Catch: java.lang.Exception -> L45
        L45:
            return
    }

    private void v() {
            r2 = this;
            android.content.Context r0 = r2.f7564f     // Catch: java.lang.Exception -> La
            com.beizi.fusion.update.b r0 = com.beizi.fusion.update.b.a(r0)     // Catch: java.lang.Exception -> La
            r1 = 5
            r0.b(r1)     // Catch: java.lang.Exception -> La
        La:
            return
    }

    public com.beizi.fusion.c.b a(java.lang.String r1) {
            r0 = this;
            com.beizi.fusion.c.b.f7561e = r1
            com.beizi.fusion.c.b r1 = com.beizi.fusion.c.b.f7560d
            return r1
    }

    public void a(android.content.Context r13, java.lang.String r14, java.lang.String r15, java.lang.String r16) {
            r12 = this;
            java.lang.Class<com.beizi.fusion.c.b> r1 = com.beizi.fusion.c.b.class
            monitor-enter(r1)
            if (r13 == 0) goto La3
            boolean r0 = r12.f7565g     // Catch: java.lang.Throwable -> L7d
            if (r0 != 0) goto L94
            android.content.Context r13 = r13.getApplicationContext()     // Catch: java.lang.Throwable -> L7d
            android.content.Context r13 = com.stub.StubApp.getOrigApplicationContext(r13)     // Catch: java.lang.Throwable -> L7d
            r12.f7564f = r13     // Catch: java.lang.Throwable -> L7d
            java.lang.String r3 = com.beizi.fusion.tool.ao.a()     // Catch: java.lang.Throwable -> L7d
            com.beizi.fusion.c.b.f7558b = r3     // Catch: java.lang.Throwable -> L7d
            com.beizi.fusion.events.EventBean r2 = new com.beizi.fusion.events.EventBean     // Catch: java.lang.Throwable -> L7d
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r8 = ""
            java.lang.String r9 = ""
            long r10 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r11 = ""
            r7 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L7d
            com.beizi.fusion.events.b r13 = new com.beizi.fusion.events.b     // Catch: java.lang.Throwable -> L7d
            r13.<init>(r2)     // Catch: java.lang.Throwable -> L7d
            r12.f7567i = r13     // Catch: java.lang.Throwable -> L7d
            com.beizi.fusion.c.b.a = r14     // Catch: java.lang.Throwable -> L7d
            com.beizi.fusion.c.b.f7562j = r15     // Catch: java.lang.Throwable -> L7d
            com.beizi.fusion.c.b.f7563k = r16     // Catch: java.lang.Throwable -> L7d
            com.beizi.fusion.events.a$i r14 = r13.a     // Catch: java.lang.Throwable -> L7d
            r14.addObserver(r13)     // Catch: java.lang.Throwable -> L7d
            com.beizi.fusion.events.b r13 = r12.f7567i     // Catch: java.lang.Throwable -> L7d
            com.beizi.fusion.events.a r13 = r13.a()     // Catch: java.lang.Throwable -> L7d
            r13.a(r2)     // Catch: java.lang.Throwable -> L7d
            android.content.Context r13 = r12.f7564f     // Catch: java.lang.Throwable -> L7d
            com.beizi.fusion.model.AppEventId r13 = com.beizi.fusion.model.AppEventId.getInstance(r13)     // Catch: java.lang.Throwable -> L7d
            r13.setAppStart()     // Catch: java.lang.Throwable -> L7d
            android.content.Context r13 = r12.f7564f     // Catch: java.lang.Throwable -> L7d
            com.beizi.fusion.model.AppEventId r13 = com.beizi.fusion.model.AppEventId.getInstance(r13)     // Catch: java.lang.Throwable -> L7d
            r13.setAppSdkInit()     // Catch: java.lang.Throwable -> L7d
            com.beizi.fusion.tool.x r13 = com.beizi.fusion.tool.x.a()     // Catch: java.lang.Throwable -> L7d
            android.content.Context r14 = r12.f7564f     // Catch: java.lang.Throwable -> L7d
            r13.b(r14)     // Catch: java.lang.Throwable -> L7d
            com.beizi.fusion.events.b r13 = r12.f7567i     // Catch: java.lang.Throwable -> L7d
            com.beizi.fusion.events.a$i r13 = r13.a     // Catch: java.lang.Throwable -> L7d
            int r13 = r13.a()     // Catch: java.lang.Throwable -> L7d
            if (r13 != 0) goto La1
            boolean r13 = com.beizi.fusion.BeiZis.isIsSyncInit()     // Catch: java.lang.Throwable -> L7d
            if (r13 == 0) goto L80
            r12.r()     // Catch: java.lang.Throwable -> L7d
            goto L90
        L7d:
            r0 = move-exception
            r13 = r0
            goto Lab
        L80:
            com.beizi.fusion.tool.e r13 = com.beizi.fusion.tool.e.b()     // Catch: java.lang.Throwable -> L7d
            java.util.concurrent.ExecutorService r13 = r13.c()     // Catch: java.lang.Throwable -> L7d
            com.beizi.fusion.c.b$1 r14 = new com.beizi.fusion.c.b$1     // Catch: java.lang.Throwable -> L7d
            r14.<init>(r12)     // Catch: java.lang.Throwable -> L7d
            r13.execute(r14)     // Catch: java.lang.Throwable -> L7d
        L90:
            r13 = 1
            r12.f7565g = r13     // Catch: java.lang.Throwable -> L7d
            goto La1
        L94:
            boolean r13 = com.beizi.fusion.BeiZis.isIsSyncInit()     // Catch: java.lang.Throwable -> L7d
            if (r13 != 0) goto La1
            com.beizi.fusion.BeiZiInitCallBack r13 = r12.q     // Catch: java.lang.Throwable -> L7d
            if (r13 == 0) goto La1
            r13.success()     // Catch: java.lang.Throwable -> L7d
        La1:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7d
            return
        La3:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L7d
            java.lang.String r14 = "Context cannot be null."
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L7d
            throw r13     // Catch: java.lang.Throwable -> L7d
        Lab:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7d
            throw r13
    }

    public void a(com.beizi.fusion.BeiZiInitCallBack r1) {
            r0 = this;
            r0.q = r1
            return
    }

    public void a(java.util.Map<java.lang.String, java.lang.Object> r6) {
            r5 = this;
            java.lang.String r0 = "forbid_verify_window_focus"
            java.lang.String r1 = "forbid_collect_crash"
            java.lang.String r2 = "speed_first_strategy"
            java.lang.String r3 = "forbid_config_network"
            if (r6 != 0) goto Lb
            goto L63
        Lb:
            boolean r4 = r6.containsKey(r3)     // Catch: java.lang.Exception -> L63
            if (r4 == 0) goto L21
            java.lang.Object r3 = r6.get(r3)     // Catch: java.lang.Exception -> L63
            boolean r4 = r3 instanceof java.lang.Boolean     // Catch: java.lang.Exception -> L63
            if (r4 == 0) goto L21
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Exception -> L63
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Exception -> L63
            r5.m = r3     // Catch: java.lang.Exception -> L63
        L21:
            boolean r3 = r6.containsKey(r2)     // Catch: java.lang.Exception -> L63
            if (r3 == 0) goto L37
            java.lang.Object r2 = r6.get(r2)     // Catch: java.lang.Exception -> L63
            boolean r3 = r2 instanceof java.lang.Boolean     // Catch: java.lang.Exception -> L63
            if (r3 == 0) goto L37
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Exception -> L63
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Exception -> L63
            r5.n = r2     // Catch: java.lang.Exception -> L63
        L37:
            boolean r2 = r6.containsKey(r1)     // Catch: java.lang.Exception -> L63
            if (r2 == 0) goto L4d
            java.lang.Object r1 = r6.get(r1)     // Catch: java.lang.Exception -> L63
            boolean r2 = r1 instanceof java.lang.Boolean     // Catch: java.lang.Exception -> L63
            if (r2 == 0) goto L4d
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> L63
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Exception -> L63
            r5.o = r1     // Catch: java.lang.Exception -> L63
        L4d:
            boolean r1 = r6.containsKey(r0)     // Catch: java.lang.Exception -> L63
            if (r1 == 0) goto L63
            java.lang.Object r6 = r6.get(r0)     // Catch: java.lang.Exception -> L63
            boolean r0 = r6 instanceof java.lang.Boolean     // Catch: java.lang.Exception -> L63
            if (r0 == 0) goto L63
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Exception -> L63
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Exception -> L63
            r5.p = r6     // Catch: java.lang.Exception -> L63
        L63:
            return
    }

    public java.lang.String b() {
            r1 = this;
            java.lang.String r0 = com.beizi.fusion.c.b.a
            return r0
    }

    public java.lang.String b(java.lang.String r5) {
            r4 = this;
            r0 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L8a
            if (r1 == 0) goto L8
            return r0
        L8:
            android.content.Context r1 = r4.f7564f     // Catch: java.lang.Exception -> L8a
            if (r1 != 0) goto Ld
            return r0
        Ld:
            boolean r1 = r4.f7565g     // Catch: java.lang.Exception -> L8a
            if (r1 != 0) goto L12
            return r0
        L12:
            r4.h()     // Catch: java.lang.Exception -> L8a
            android.content.Context r1 = r4.f7564f     // Catch: java.lang.Exception -> L8a
            com.beizi.fusion.model.ResponseInfo r1 = com.beizi.fusion.model.ResponseInfo.getInstance(r1)     // Catch: java.lang.Exception -> L8a
            com.beizi.fusion.model.AdSpacesBean r5 = r1.getAdSpaceBean(r5)     // Catch: java.lang.Exception -> L8a
            if (r5 != 0) goto L2b
            r4.v()     // Catch: java.lang.Exception -> L8a
            android.content.Context r5 = r4.f7564f     // Catch: java.lang.Exception -> L8a
            java.lang.String r5 = com.beizi.fusion.c.l.a(r5, r0, r0)     // Catch: java.lang.Exception -> L8a
            return r5
        L2b:
            java.util.List r5 = r5.getBuyer()     // Catch: java.lang.Exception -> L8a
            if (r5 == 0) goto L80
            boolean r1 = r5.isEmpty()     // Catch: java.lang.Exception -> L8a
            if (r1 == 0) goto L38
            goto L80
        L38:
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Exception -> L8a
        L3c:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Exception -> L8a
            if (r1 == 0) goto L60
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Exception -> L8a
            com.beizi.fusion.model.AdSpacesBean$BuyerBean r1 = (com.beizi.fusion.model.AdSpacesBean.BuyerBean) r1     // Catch: java.lang.Exception -> L8a
            if (r1 != 0) goto L4b
            goto L3c
        L4b:
            java.lang.String r2 = "S2S"
            java.lang.String r3 = r1.getBidType()     // Catch: java.lang.Exception -> L8a
            boolean r2 = r2.equalsIgnoreCase(r3)     // Catch: java.lang.Exception -> L8a
            if (r2 == 0) goto L3c
            java.lang.String r5 = r1.getAppId()     // Catch: java.lang.Exception -> L8a
            java.lang.String r1 = r1.getSpaceId()     // Catch: java.lang.Exception -> L8a
            goto L62
        L60:
            r5 = r0
            r1 = r5
        L62:
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L8a
            if (r2 != 0) goto L76
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L8a
            if (r2 == 0) goto L6f
            goto L76
        L6f:
            android.content.Context r2 = r4.f7564f     // Catch: java.lang.Exception -> L8a
            java.lang.String r5 = com.beizi.fusion.c.l.a(r2, r5, r1)     // Catch: java.lang.Exception -> L8a
            return r5
        L76:
            r4.v()     // Catch: java.lang.Exception -> L8a
            android.content.Context r5 = r4.f7564f     // Catch: java.lang.Exception -> L8a
            java.lang.String r5 = com.beizi.fusion.c.l.a(r5, r0, r0)     // Catch: java.lang.Exception -> L8a
            return r5
        L80:
            r4.v()     // Catch: java.lang.Exception -> L8a
            android.content.Context r5 = r4.f7564f     // Catch: java.lang.Exception -> L8a
            java.lang.String r5 = com.beizi.fusion.c.l.a(r5, r0, r0)     // Catch: java.lang.Exception -> L8a
            return r5
        L8a:
            android.content.Context r5 = r4.f7564f
            java.lang.String r5 = com.beizi.fusion.c.l.a(r5, r0, r0)
            return r5
    }

    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = com.beizi.fusion.c.b.f7562j
            return r0
    }

    public java.lang.String d() {
            r1 = this;
            java.lang.String r0 = com.beizi.fusion.c.b.f7563k
            return r0
    }

    public android.content.Context e() {
            r1 = this;
            android.content.Context r0 = r1.f7564f
            return r0
    }

    public com.beizi.fusion.events.b f() {
            r1 = this;
            com.beizi.fusion.events.b r0 = r1.f7567i
            return r0
    }

    public void g() {
            r3 = this;
            boolean r0 = com.beizi.fusion.tool.ae.b()
            if (r0 == 0) goto L22
            boolean r0 = com.beizi.fusion.BeiZis.isLimitPersonalAds()
            if (r0 != 0) goto L4d
            com.beizi.fusion.BeiZiCustomController r0 = com.beizi.fusion.BeiZis.getCustomController()
            if (r0 == 0) goto L22
            com.beizi.fusion.BeiZiCustomController r0 = com.beizi.fusion.BeiZis.getCustomController()
            if (r0 == 0) goto L4d
            com.beizi.fusion.BeiZiCustomController r0 = com.beizi.fusion.BeiZis.getCustomController()
            boolean r0 = r0.isCanUseOaid()
            if (r0 == 0) goto L4d
        L22:
            android.content.Context r0 = r3.f7564f
            java.lang.String r1 = "__OAID__"
            java.lang.String r2 = ""
            java.lang.Object r0 = com.beizi.fusion.tool.an.b(r0, r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L4d
            android.content.Context r1 = r3.f7564f
            com.beizi.fusion.model.RequestInfo r1 = com.beizi.fusion.model.RequestInfo.getInstance(r1)
            com.beizi.fusion.model.DevInfo r1 = r1.getDevInfo()
            if (r1 == 0) goto L4d
            android.content.Context r1 = r3.f7564f
            com.beizi.fusion.model.RequestInfo r1 = com.beizi.fusion.model.RequestInfo.getInstance(r1)
            com.beizi.fusion.model.DevInfo r1 = r1.getDevInfo()
            r1.setOaid(r0)
        L4d:
            return
    }

    public void h() {
            r2 = this;
            boolean r0 = r2.r
            if (r0 == 0) goto L5
            goto L2b
        L5:
            r0 = 1
            r2.r = r0
            boolean r0 = com.beizi.fusion.tool.ae.b()
            if (r0 == 0) goto L2c
            boolean r0 = com.beizi.fusion.BeiZis.isLimitPersonalAds()
            if (r0 != 0) goto L2b
            com.beizi.fusion.BeiZiCustomController r0 = com.beizi.fusion.BeiZis.getCustomController()
            if (r0 == 0) goto L2c
            com.beizi.fusion.BeiZiCustomController r0 = com.beizi.fusion.BeiZis.getCustomController()
            if (r0 == 0) goto L2b
            com.beizi.fusion.BeiZiCustomController r0 = com.beizi.fusion.BeiZis.getCustomController()
            boolean r0 = r0.isCanUseOaid()
            if (r0 == 0) goto L2b
            goto L2c
        L2b:
            return
        L2c:
            com.beizi.fusion.tool.e r0 = com.beizi.fusion.tool.e.b()
            java.util.concurrent.ExecutorService r0 = r0.c()
            com.beizi.fusion.c.b$2 r1 = new com.beizi.fusion.c.b$2
            r1.<init>(r2)
            r0.execute(r1)
            return
    }

    public boolean i() {
            r1 = this;
            boolean r0 = r1.m
            return r0
    }

    public boolean j() {
            r1 = this;
            boolean r0 = r1.n
            return r0
    }

    public void k() {
            r2 = this;
            r2.h()
            boolean r0 = r2.m
            if (r0 != 0) goto L8
            goto L2c
        L8:
            boolean r0 = r2.f7565g
            if (r0 != 0) goto Ld
            goto L2c
        Ld:
            android.content.Context r0 = r2.f7564f
            if (r0 != 0) goto L12
            goto L2c
        L12:
            com.beizi.fusion.events.b r0 = r2.f7567i
            com.beizi.fusion.events.a$i r0 = r0.a
            int r0 = r0.a()
            if (r0 != 0) goto L2c
            com.beizi.fusion.events.b r0 = r2.f7567i
            com.beizi.fusion.events.a$i r0 = r0.a
            r1 = 1
            r0.a(r1)
            com.beizi.fusion.events.b r0 = r2.f7567i
            com.beizi.fusion.events.a$i r0 = r0.a
            r1 = 2
            r0.a(r1)
        L2c:
            return
    }

    public void l() {
            r11 = this;
            android.content.Context r0 = r11.f7564f
            if (r0 != 0) goto L6
            goto Ld1
        L6:
            com.beizi.fusion.update.b r1 = r11.f7566h
            if (r1 != 0) goto Ld1
            com.beizi.fusion.model.ResponseInfo r0 = com.beizi.fusion.model.ResponseInfo.getInstance(r0)
            boolean r0 = r0.isInit()
            if (r0 == 0) goto L6d
            android.content.Context r0 = r11.f7564f
            com.beizi.fusion.events.EventCar r0 = com.beizi.fusion.events.EventCar.getInstance(r0)
            com.beizi.fusion.events.EventBean r1 = new com.beizi.fusion.events.EventBean
            java.lang.String r2 = com.beizi.fusion.c.b.f7558b
            com.beizi.fusion.c.b r3 = a()
            java.lang.String r6 = r3.b()
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r9 = java.lang.String.valueOf(r3)
            java.lang.String r10 = ""
            java.lang.String r3 = ""
            java.lang.String r4 = "410.000"
            java.lang.String r5 = ""
            java.lang.String r7 = ""
            java.lang.String r8 = ""
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0.goRoad(r1)
            android.content.Context r0 = r11.f7564f
            com.beizi.fusion.events.EventCar r0 = com.beizi.fusion.events.EventCar.getInstance(r0)
            com.beizi.fusion.events.EventBean r1 = new com.beizi.fusion.events.EventBean
            java.lang.String r2 = com.beizi.fusion.c.b.f7558b
            com.beizi.fusion.c.b r3 = a()
            java.lang.String r6 = r3.b()
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r9 = java.lang.String.valueOf(r3)
            java.lang.String r10 = ""
            java.lang.String r3 = ""
            java.lang.String r4 = "410.200"
            java.lang.String r5 = ""
            java.lang.String r7 = ""
            java.lang.String r8 = ""
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0.goRoad(r1)
            goto Lc5
        L6d:
            android.content.Context r0 = r11.f7564f
            com.beizi.fusion.events.EventCar r0 = com.beizi.fusion.events.EventCar.getInstance(r0)
            com.beizi.fusion.events.EventBean r1 = new com.beizi.fusion.events.EventBean
            java.lang.String r2 = com.beizi.fusion.c.b.f7558b
            com.beizi.fusion.c.b r3 = a()
            java.lang.String r6 = r3.b()
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r9 = java.lang.String.valueOf(r3)
            java.lang.String r10 = ""
            java.lang.String r3 = ""
            java.lang.String r4 = "410.000"
            java.lang.String r5 = ""
            java.lang.String r7 = ""
            java.lang.String r8 = ""
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0.goRoad(r1)
            android.content.Context r0 = r11.f7564f
            com.beizi.fusion.events.EventCar r0 = com.beizi.fusion.events.EventCar.getInstance(r0)
            com.beizi.fusion.events.EventBean r1 = new com.beizi.fusion.events.EventBean
            java.lang.String r2 = com.beizi.fusion.c.b.f7558b
            com.beizi.fusion.c.b r3 = a()
            java.lang.String r6 = r3.b()
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r9 = java.lang.String.valueOf(r3)
            java.lang.String r10 = ""
            java.lang.String r3 = ""
            java.lang.String r4 = "410.500"
            java.lang.String r5 = ""
            java.lang.String r7 = ""
            java.lang.String r8 = ""
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0.goRoad(r1)
        Lc5:
            android.content.Context r0 = r11.f7564f
            com.beizi.fusion.update.b r0 = com.beizi.fusion.update.b.a(r0)
            r11.f7566h = r0
            r1 = 0
            r0.b(r1)
        Ld1:
            return
    }

    public boolean m() {
            r1 = this;
            boolean r0 = r1.p
            return r0
    }

    public boolean n() {
            r2 = this;
            com.beizi.fusion.BeiZiCustomController r0 = com.beizi.fusion.BeiZis.getCustomController()
            r1 = 0
            if (r0 == 0) goto L20
            com.beizi.fusion.BeiZiCustomController r0 = com.beizi.fusion.BeiZis.getCustomController()
            boolean r0 = r0.forbidSensor()
            if (r0 == 0) goto L20
            android.content.Context r0 = r2.f7564f
            com.beizi.fusion.model.ResponseInfo r0 = com.beizi.fusion.model.ResponseInfo.getInstance(r0)
            boolean r0 = r0.isOpenSensor()
            if (r0 == 0) goto L1e
            return r1
        L1e:
            r0 = 1
            return r0
        L20:
            return r1
    }

    public boolean o() {
            r2 = this;
            com.beizi.fusion.BeiZiCustomController r0 = com.beizi.fusion.BeiZis.getCustomController()
            r1 = 1
            if (r0 != 0) goto L8
            return r1
        L8:
            com.beizi.fusion.BeiZiCustomController r0 = com.beizi.fusion.BeiZis.getCustomController()
            boolean r0 = r0.isCanUseAndroidId()
            if (r0 == 0) goto L13
            return r1
        L13:
            r0 = 0
            return r0
    }

    public java.lang.String p() {
            r1 = this;
            com.beizi.fusion.BeiZiCustomController r0 = com.beizi.fusion.BeiZis.getCustomController()
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            return r0
        L9:
            com.beizi.fusion.BeiZiCustomController r0 = com.beizi.fusion.BeiZis.getCustomController()
            java.lang.String r0 = r0.getAndroidId()
            return r0
    }
}
