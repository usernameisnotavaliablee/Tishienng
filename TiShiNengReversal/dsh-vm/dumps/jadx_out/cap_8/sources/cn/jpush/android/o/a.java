package cn.jpush.android.o;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a implements cn.jpush.android.u.b.a {
    private static volatile cn.jpush.android.o.a a;

    /* renamed from: b, reason: collision with root package name */
    private cn.jpush.android.u.b f1856b;

    /* renamed from: c, reason: collision with root package name */
    private cn.jpush.android.r.d f1857c;

    /* renamed from: d, reason: collision with root package name */
    private cn.jpush.android.s.c f1858d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f1859e;

    /* renamed from: f, reason: collision with root package name */
    private java.util.List<java.lang.String> f1860f;


    /* renamed from: cn.jpush.android.o.a$a, reason: collision with other inner class name */
    public static class C0052a extends cn.jpush.android.ad.f {
        android.content.Context a;

        /* renamed from: b, reason: collision with root package name */
        cn.jpush.android.d.d f1863b;

        public C0052a(android.content.Context r1, cn.jpush.android.d.d r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f1863b = r2
                return
        }

        @Override // cn.jpush.android.ad.f
        public void a() {
                r4 = this;
                android.content.Context r0 = r4.a     // Catch: java.lang.Throwable -> L18
                cn.jpush.android.d.d r1 = r4.f1863b     // Catch: java.lang.Throwable -> L18
                boolean r0 = cn.jpush.android.o.a.h(r0, r1)     // Catch: java.lang.Throwable -> L18
                if (r0 == 0) goto L1a
                cn.jpush.android.q.a r0 = cn.jpush.android.q.a.a()     // Catch: java.lang.Throwable -> L18
                android.content.Context r1 = r4.a     // Catch: java.lang.Throwable -> L18
                cn.jpush.android.d.d r2 = r4.f1863b     // Catch: java.lang.Throwable -> L18
                java.lang.String r3 = "cn.jpush.android.intent.NOTIFY_INAPP_MESSAGE_ARRIVED"
            L14:
                r0.b(r1, r2, r3)     // Catch: java.lang.Throwable -> L18
                return
            L18:
                r0 = move-exception
                goto L2f
            L1a:
                cn.jpush.android.q.a r0 = cn.jpush.android.q.a.a()     // Catch: java.lang.Throwable -> L18
                android.content.Context r1 = r4.a     // Catch: java.lang.Throwable -> L18
                r2 = 0
                r0.a(r1, r2)     // Catch: java.lang.Throwable -> L18
                cn.jpush.android.q.a r0 = cn.jpush.android.q.a.a()     // Catch: java.lang.Throwable -> L18
                android.content.Context r1 = r4.a     // Catch: java.lang.Throwable -> L18
                cn.jpush.android.d.d r2 = r4.f1863b     // Catch: java.lang.Throwable -> L18
                java.lang.String r3 = "handle_message_failed"
                goto L14
            L2f:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "notify inapp handle failed, "
                r1.append(r2)
                java.lang.String r0 = r0.getMessage()
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                java.lang.String r1 = "InAppManager"
                cn.jpush.android.helper.Logger.ww(r1, r0)
                return
        }
    }

    public a() {
            r1 = this;
            r1.<init>()
            cn.jpush.android.r.d r0 = new cn.jpush.android.r.d
            r0.<init>()
            r1.f1857c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f1860f = r0
            return
    }

    public static cn.jpush.android.o.a a() {
            cn.jpush.android.o.a r0 = cn.jpush.android.o.a.a
            if (r0 != 0) goto L19
            java.lang.Class<cn.jpush.android.o.a> r0 = cn.jpush.android.o.a.class
            monitor-enter(r0)
            cn.jpush.android.o.a r1 = cn.jpush.android.o.a.a     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            cn.jpush.android.o.a r1 = new cn.jpush.android.o.a     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            cn.jpush.android.o.a.a = r1     // Catch: java.lang.Throwable -> L13
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
            cn.jpush.android.o.a r0 = cn.jpush.android.o.a.a
            return r0
    }

    private void b(android.content.Context r5) {
            r4 = this;
            java.lang.String r0 = "InAppManager"
            if (r5 != 0) goto L1b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19
            r1.<init>()     // Catch: java.lang.Throwable -> L19
            java.lang.String r2 = "dealNextCacheMessage param is null, context: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L19
            r1.append(r5)     // Catch: java.lang.Throwable -> L19
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L19
            cn.jpush.android.helper.Logger.w(r0, r5)     // Catch: java.lang.Throwable -> L19
            return
        L19:
            r5 = move-exception
            goto L32
        L1b:
            boolean r1 = cn.jpush.android.ad.a.j(r5)     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L31
            boolean r1 = r4.c()     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L31
            cn.jpush.android.q.a r1 = cn.jpush.android.q.a.a()     // Catch: java.lang.Throwable -> L19
            java.lang.String r2 = "handle_cache_message"
            r3 = 0
            r1.a(r5, r3, r2)     // Catch: java.lang.Throwable -> L19
        L31:
            return
        L32:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "handleNextCacheMessage  throwable="
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            cn.jpush.android.helper.Logger.d(r0, r5)
            return
    }

    private void c(android.content.Context r4) {
            r3 = this;
            r3.d()     // Catch: java.lang.Throwable -> L15
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L15
            java.lang.Thread r0 = r0.getThread()     // Catch: java.lang.Throwable -> L15
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L15
            if (r0 != r1) goto L17
            r3.d(r4)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r4 = move-exception
            goto L27
        L17:
            cn.jpush.android.q.a r0 = cn.jpush.android.q.a.a()     // Catch: java.lang.Throwable -> L15
            cn.jpush.android.u.b r1 = r3.f1856b     // Catch: java.lang.Throwable -> L15
            cn.jpush.android.d.d r1 = r1.j()     // Catch: java.lang.Throwable -> L15
            r2 = 1003(0x3eb, float:1.406E-42)
            r0.b(r4, r1, r2)     // Catch: java.lang.Throwable -> L15
            return
        L27:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "notify inapp dismiss failed, "
            r0.append(r1)
            java.lang.String r4 = r4.getMessage()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "InAppManager"
            cn.jpush.android.helper.Logger.w(r0, r4)
            return
    }

    private void d() {
            r2 = this;
            cn.jpush.android.s.c r0 = r2.f1858d
            if (r0 == 0) goto L10
            java.lang.String r0 = "InAppManager"
            java.lang.String r1 = "cancel js load timer"
            cn.jpush.android.helper.Logger.d(r0, r1)
            cn.jpush.android.s.c r0 = r2.f1858d
            r0.a()
        L10:
            return
    }

    private void d(android.content.Context r5) {
            r4 = this;
            cn.jpush.android.r.d r0 = r4.f1857c
            java.lang.String r1 = "InAppManager"
            if (r0 == 0) goto L59
            cn.jpush.android.u.b r0 = r4.f1856b
            if (r0 != 0) goto Lb
            goto L59
        Lb:
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L29
            java.lang.Thread r0 = r0.getThread()     // Catch: java.lang.Throwable -> L29
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L29
            if (r0 != r2) goto L2b
            cn.jpush.android.r.d r0 = r4.f1857c     // Catch: java.lang.Throwable -> L29
            cn.jpush.android.u.b r2 = r4.f1856b     // Catch: java.lang.Throwable -> L29
            r0.b(r5, r2)     // Catch: java.lang.Throwable -> L29
            cn.jpush.android.u.b r5 = r4.f1856b     // Catch: java.lang.Throwable -> L29
            r0 = 0
            r5.a(r0)     // Catch: java.lang.Throwable -> L29
            r4.f1856b = r0     // Catch: java.lang.Throwable -> L29
            goto L3a
        L29:
            r5 = move-exception
            goto L40
        L2b:
            cn.jpush.android.q.a r0 = cn.jpush.android.q.a.a()     // Catch: java.lang.Throwable -> L29
            cn.jpush.android.u.b r2 = r4.f1856b     // Catch: java.lang.Throwable -> L29
            cn.jpush.android.d.d r2 = r2.j()     // Catch: java.lang.Throwable -> L29
            r3 = 1003(0x3eb, float:1.406E-42)
            r0.b(r5, r2, r3)     // Catch: java.lang.Throwable -> L29
        L3a:
            java.lang.String r5 = "notify inapp release completed"
            cn.jpush.android.helper.Logger.d(r1, r5)     // Catch: java.lang.Throwable -> L29
            return
        L40:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "notify inapp release failed, "
            r0.append(r2)
            java.lang.String r5 = r5.getMessage()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            cn.jpush.android.helper.Logger.w(r1, r5)
            return
        L59:
            java.lang.String r5 = "notify inapp destroy wm is null"
            cn.jpush.android.helper.Logger.d(r1, r5)
            return
    }

    static /* synthetic */ boolean h(android.content.Context r0, cn.jpush.android.d.d r1) {
            boolean r0 = o(r0, r1)
            return r0
    }

    private void i(android.content.Context r9, cn.jpush.android.d.d r10) {
            r8 = this;
            java.lang.String r0 = "InAppManager"
            java.lang.String r1 = "start h5 load timeout timer listener"
            cn.jpush.android.helper.Logger.d(r0, r1)
            r8.d()
            cn.jpush.android.s.c r2 = new cn.jpush.android.s.c
            r2.<init>()
            r8.f1858d = r2
            cn.jpush.android.o.a$1 r3 = new cn.jpush.android.o.a$1
            r3.<init>(r8, r9, r10)
            r4 = 10000(0x2710, double:4.9407E-320)
            r6 = 1000(0x3e8, double:4.94E-321)
            r2.a(r3, r4, r6)
            return
    }

    private void j(android.content.Context r5, cn.jpush.android.d.d r6) {
            r4 = this;
            java.lang.String r0 = "InAppManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26
            r1.<init>()     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = "handleCancelMessage  msgId="
            r1.append(r2)     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = r6.f1757d     // Catch: java.lang.Throwable -> L26
            r1.append(r2)     // Catch: java.lang.Throwable -> L26
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L26
            cn.jpush.android.helper.Logger.d(r0, r1)     // Catch: java.lang.Throwable -> L26
            int r1 = r6.bt     // Catch: java.lang.Throwable -> L26
            r2 = 40
            if (r2 != r1) goto L28
            java.lang.String r6 = r6.f1757d     // Catch: java.lang.Throwable -> L26
            r1 = 1602(0x642, double:7.915E-321)
            cn.jpush.android.helper.c.a(r6, r1, r5)     // Catch: java.lang.Throwable -> L26
            return
        L26:
            r5 = move-exception
            goto L31
        L28:
            java.lang.String r6 = r6.f1757d     // Catch: java.lang.Throwable -> L26
            r1 = 2000(0x7d0, double:9.88E-321)
            r3 = 4
            cn.jpush.android.helper.c.a(r5, r6, r1, r3)     // Catch: java.lang.Throwable -> L26
            return
        L31:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "handleCancelMessage  throwable="
            r6.append(r1)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            cn.jpush.android.helper.Logger.d(r0, r5)
            return
    }

    private void k(android.content.Context r4, cn.jpush.android.d.d r5) {
            r3 = this;
            java.lang.String r0 = "InAppManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r1.<init>()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = "handleShowSuccess  msgId="
            r1.append(r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = r5.f1757d     // Catch: java.lang.Throwable -> L3c
            r1.append(r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L3c
            cn.jpush.android.helper.Logger.d(r0, r1)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = "cn.jpush.android.intent.IN_APP_MSG_SHOW"
            r2 = 0
            cn.jpush.android.x.b.a(r4, r1, r5, r2)     // Catch: java.lang.Throwable -> L3c
            r3.n(r4, r5)     // Catch: java.lang.Throwable -> L3c
            int r1 = r5.bt     // Catch: java.lang.Throwable -> L3c
            r2 = 40
            if (r2 == r1) goto L3e
            cn.jpush.android.u.b r1 = r3.f1856b     // Catch: java.lang.Throwable -> L3c
            r1.d()     // Catch: java.lang.Throwable -> L3c
            int r1 = r5.bt     // Catch: java.lang.Throwable -> L3c
            r2 = 30
            if (r2 != r1) goto L3e
            cn.jpush.android.q.a r1 = cn.jpush.android.q.a.a()     // Catch: java.lang.Throwable -> L3c
            r2 = 1005(0x3ed, float:1.408E-42)
            r1.a(r4, r5, r2)     // Catch: java.lang.Throwable -> L3c
            goto L3e
        L3c:
            r4 = move-exception
            goto L53
        L3e:
            r3.l(r4, r5)     // Catch: java.lang.Throwable -> L3c
            java.util.List<java.lang.String> r1 = r3.f1860f     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = r5.f1757d     // Catch: java.lang.Throwable -> L3c
            r1.add(r2)     // Catch: java.lang.Throwable -> L3c
            r1 = 1
            r3.a(r4, r1)     // Catch: java.lang.Throwable -> L3c
            int r5 = r5.bb     // Catch: java.lang.Throwable -> L3c
            long r1 = (long) r5     // Catch: java.lang.Throwable -> L3c
            cn.jpush.android.r.b.a(r4, r1)     // Catch: java.lang.Throwable -> L3c
            return
        L53:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "handleCancelMessage  throwable="
            r5.append(r1)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            cn.jpush.android.helper.Logger.d(r0, r4)
            return
    }

    private void l(android.content.Context r4, cn.jpush.android.d.d r5) {
            r3 = this;
            r0 = 40
            int r1 = r5.bt
            java.lang.String r5 = r5.f1757d
            if (r0 != r1) goto Le
            r0 = 1600(0x640, double:7.905E-321)
            cn.jpush.android.helper.c.a(r5, r0, r4)
            return
        Le:
            r0 = 3000(0xbb8, double:1.482E-320)
            r2 = 4
            cn.jpush.android.helper.c.a(r4, r5, r0, r2)
            return
    }

    private void m(android.content.Context r4, cn.jpush.android.d.d r5) {
            r3 = this;
            r0 = 40
            int r1 = r5.bt
            java.lang.String r5 = r5.f1757d
            if (r0 != r1) goto Le
            r0 = 1604(0x644, double:7.925E-321)
            cn.jpush.android.helper.c.a(r5, r0, r4)
            return
        Le:
            r0 = 3012(0xbc4, double:1.488E-320)
            r2 = 4
            cn.jpush.android.helper.c.a(r4, r5, r0, r2)
            return
    }

    private void n(android.content.Context r4, cn.jpush.android.d.d r5) {
            r3 = this;
            java.lang.String r0 = "InAppManager"
            if (r4 == 0) goto L4a
            if (r5 != 0) goto L7
            goto L4a
        L7:
            int r1 = r5.az     // Catch: java.lang.Throwable -> L47
            r2 = 104(0x68, float:1.46E-43)
            if (r1 != r2) goto L49
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47
            r1.<init>()     // Catch: java.lang.Throwable -> L47
            java.lang.String r2 = "start process notify message, msgType: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L47
            int r2 = r5.az     // Catch: java.lang.Throwable -> L47
            r1.append(r2)     // Catch: java.lang.Throwable -> L47
            java.lang.String r2 = ", processName: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L47
            java.lang.String r2 = cn.jpush.android.ad.a.d(r4)     // Catch: java.lang.Throwable -> L47
            r1.append(r2)     // Catch: java.lang.Throwable -> L47
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L47
            cn.jpush.android.helper.Logger.d(r0, r1)     // Catch: java.lang.Throwable -> L47
            android.os.Bundle r1 = new android.os.Bundle     // Catch: java.lang.Throwable -> L47
            r1.<init>()     // Catch: java.lang.Throwable -> L47
            java.lang.String r2 = "content"
            java.lang.String r5 = r5.c()     // Catch: java.lang.Throwable -> L47
            r1.putString(r2, r5)     // Catch: java.lang.Throwable -> L47
            cn.jpush.android.q.a r5 = cn.jpush.android.q.a.a()     // Catch: java.lang.Throwable -> L47
            java.lang.String r2 = "handle_notify_inapp_message"
            r5.a(r4, r1, r2)     // Catch: java.lang.Throwable -> L47
            return
        L47:
            r4 = move-exception
            goto L5f
        L49:
            return
        L4a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47
            r5.<init>()     // Catch: java.lang.Throwable -> L47
            java.lang.String r1 = "checkIsNeedSeedToNotification  context: "
            r5.append(r1)     // Catch: java.lang.Throwable -> L47
            r5.append(r4)     // Catch: java.lang.Throwable -> L47
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L47
            cn.jpush.android.helper.Logger.w(r0, r4)     // Catch: java.lang.Throwable -> L47
            return
        L5f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "checkIsNeedSeedToNotification  throwable="
            r5.append(r1)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            cn.jpush.android.helper.Logger.d(r0, r4)
            return
    }

    private static boolean o(android.content.Context r4, cn.jpush.android.d.d r5) {
            r0 = 0
            java.lang.String r1 = "InAppManager"
            if (r4 == 0) goto L21
            if (r5 != 0) goto L8
            goto L21
        L8:
            r2 = 40
            int r3 = r5.bt
            if (r2 != r3) goto L13
            cn.jpush.android.d.d r4 = cn.jpush.android.r.c.a(r4, r5)
            goto L17
        L13:
            cn.jpush.android.d.d r4 = cn.jpush.android.r.c.b(r4, r5)
        L17:
            if (r4 != 0) goto L1f
            java.lang.String r4 = "notify inapp tpl dl failed"
            cn.jpush.android.helper.Logger.ww(r1, r4)
            return r0
        L1f:
            r4 = 1
            return r4
        L21:
            java.lang.String r4 = "notify inapp handle param is null"
            cn.jpush.android.helper.Logger.w(r1, r4)
            return r0
    }

    public void a(android.content.Context r2) {
            r1 = this;
            if (r2 == 0) goto L5
            r1.d(r2)
        L5:
            cn.jpush.android.q.a r2 = cn.jpush.android.q.a.a()
            r0 = 1005(0x3ed, float:1.408E-42)
            r2.a(r0)
            return
    }

    @Override // cn.jpush.android.u.b.a
    public void a(android.content.Context r1, android.view.View r2) {
            r0 = this;
            return
    }

    @Override // cn.jpush.android.u.b.a
    public void a(android.content.Context r1, android.view.View r2, java.lang.Object r3) {
            r0 = this;
            java.lang.String r2 = "InAppManager"
            java.lang.String r3 = "notify inapp dismiss"
            cn.jpush.android.helper.Logger.dd(r2, r3)
            cn.jpush.android.q.a r2 = cn.jpush.android.q.a.a()
            r3 = 1005(0x3ed, float:1.408E-42)
            r2.a(r3)
            long r2 = java.lang.System.currentTimeMillis()
            cn.jpush.android.p.a.a(r1, r2)
            r0.c(r1)
            r0.b(r1)
            return
    }

    public void a(android.content.Context r4, cn.jpush.android.d.d r5) {
            r3 = this;
            java.lang.String r0 = "notify inapp inflate start"
            java.lang.String r1 = "InAppManager"
            cn.jpush.android.helper.Logger.dd(r1, r0)
            if (r4 == 0) goto L8c
            if (r5 != 0) goto Ld
            goto L8c
        Ld:
            int r0 = r5.bt     // Catch: java.lang.Throwable -> L1e
            cn.jpush.android.r.b.a(r4, r5, r0)     // Catch: java.lang.Throwable -> L1e
            boolean r0 = r3.c()     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L20
            java.lang.String r0 = "notify inapp is showing now, return "
            cn.jpush.android.helper.Logger.d(r1, r0)     // Catch: java.lang.Throwable -> L1e
            return
        L1e:
            r0 = move-exception
            goto L70
        L20:
            int r0 = r5.bt     // Catch: java.lang.Throwable -> L1e
            cn.jpush.android.t.a r0 = cn.jpush.android.r.b.a(r4, r0)     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L31
            r3.f(r4, r5)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r0 = "notify inapp inflate failed, layout config is null"
            cn.jpush.android.helper.Logger.w(r1, r0)     // Catch: java.lang.Throwable -> L1e
            return
        L31:
            int r2 = r5.bt     // Catch: java.lang.Throwable -> L1e
            cn.jpush.android.u.b r0 = cn.jpush.android.u.b.a(r4, r0, r5, r2)     // Catch: java.lang.Throwable -> L1e
            r3.f1856b = r0     // Catch: java.lang.Throwable -> L1e
            boolean r0 = r0.f()     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L67
            cn.jpush.android.u.b r0 = r3.f1856b     // Catch: java.lang.Throwable -> L1e
            r0.a(r3)     // Catch: java.lang.Throwable -> L1e
            int r0 = r5.bt     // Catch: java.lang.Throwable -> L1e
            r2 = 40
            if (r2 == r0) goto L59
            java.lang.String r0 = "inapp start to show native"
            cn.jpush.android.helper.Logger.dd(r1, r0)     // Catch: java.lang.Throwable -> L1e
            cn.jpush.android.q.a r0 = cn.jpush.android.q.a.a()     // Catch: java.lang.Throwable -> L1e
            r2 = 1002(0x3ea, float:1.404E-42)
            r0.b(r4, r5, r2)     // Catch: java.lang.Throwable -> L1e
            goto L61
        L59:
            java.lang.String r0 = "inapp start to show js web"
            cn.jpush.android.helper.Logger.dd(r1, r0)     // Catch: java.lang.Throwable -> L1e
            r3.i(r4, r5)     // Catch: java.lang.Throwable -> L1e
        L61:
            java.lang.String r0 = "notify inapp inflate succeed"
            cn.jpush.android.helper.Logger.dd(r1, r0)     // Catch: java.lang.Throwable -> L1e
            return
        L67:
            r3.f(r4, r5)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r0 = "notify inapp inflate failed"
            cn.jpush.android.helper.Logger.ww(r1, r0)     // Catch: java.lang.Throwable -> L1e
            return
        L70:
            r3.f(r4, r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "inflateNotifyInApp failed, "
            r4.append(r5)
            java.lang.String r5 = r0.getMessage()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
        L88:
            cn.jpush.android.helper.Logger.w(r1, r4)
            return
        L8c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "notify inapp inflate failed, param is null, context: "
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            goto L88
    }

    public void a(android.content.Context r4, cn.jpush.android.d.d r5, boolean r6) {
            r3 = this;
            r3.d()
            java.lang.String r0 = "InAppManager"
            if (r4 == 0) goto L1b
            if (r5 == 0) goto L1b
            if (r6 != 0) goto Lc
            goto L1b
        Lc:
            java.lang.String r6 = "notify inapp tpl load success will display"
            cn.jpush.android.helper.Logger.dd(r0, r6)
            cn.jpush.android.q.a r6 = cn.jpush.android.q.a.a()
            r0 = 1002(0x3ea, float:1.404E-42)
            r6.b(r4, r5, r0)
            return
        L1b:
            r3.f(r4, r5)
            java.lang.String r1 = "notify inapp  load failed"
            cn.jpush.android.helper.Logger.w(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onLoadFail state, context: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ", isSuccess: "
            r1.append(r4)
            r1.append(r6)
            java.lang.String r4 = ", entity: "
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            cn.jpush.android.helper.Logger.d(r0, r4)
            return
    }

    public void a(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            if (r3 == 0) goto L34
            cn.jpush.android.r.d r0 = r2.f1857c
            if (r0 == 0) goto L34
            cn.jpush.android.u.b r1 = r2.f1856b
            if (r1 != 0) goto Lb
            goto L34
        Lb:
            boolean r0 = r0.a(r4)
            if (r0 == 0) goto L34
            cn.jpush.android.r.d r0 = r2.f1857c
            cn.jpush.android.u.b r1 = r2.f1856b
            boolean r0 = r0.a(r1)
            if (r0 == 0) goto L34
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[onActivityDestroy] dismiss showing notify inapp, activityName: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "InAppManager"
            cn.jpush.android.helper.Logger.d(r0, r4)
            r2.c(r3)
        L34:
            return
    }

    public void a(android.content.Context r3, boolean r4) {
            r2 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "result"
            r0.putBoolean(r1, r4)
            cn.jpush.android.q.a r4 = cn.jpush.android.q.a.a()
            java.lang.String r1 = "sync_view_show_success"
            r4.a(r3, r0, r1)
            return
    }

    public void a(android.content.Context r5, boolean r6, java.lang.String r7) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onForegroundStateChange isForeground="
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = " currentActivity="
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "InAppManager"
            cn.jpush.android.helper.Logger.d(r1, r0)
            java.util.List<java.lang.String> r0 = r4.f1860f
            r0.clear()
            r4.f1859e = r7
            r2 = -1
            cn.jpush.android.p.a.a(r5, r2)
            r4.a(r5)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            if (r2 != 0) goto L3d
            java.lang.String r2 = "targert"
            r0.putString(r2, r7)
        L3d:
            cn.jpush.android.q.a r7 = cn.jpush.android.q.a.a()
            java.lang.String r2 = "sync_target"
            r7.a(r5, r0, r2)
            if (r6 == 0) goto L57
            java.lang.String r6 = "change to foreground, deal cache notify inapp"
            cn.jpush.android.helper.Logger.d(r1, r6)
            cn.jpush.android.q.a r6 = cn.jpush.android.q.a.a()
            r7 = 0
            java.lang.String r0 = "handle_cache_message"
            r6.a(r5, r7, r0)
        L57:
            return
    }

    public void b(android.content.Context r5, cn.jpush.android.d.d r6) {
            r4 = this;
            java.lang.String r0 = "InAppManager"
            if (r5 == 0) goto L65
            if (r6 != 0) goto L7
            goto L65
        L7:
            boolean r1 = cn.jpush.android.ad.a.j(r5)     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            java.lang.String r1 = "notify inapp not display in background"
            cn.jpush.android.helper.Logger.ww(r0, r1)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r1 = move-exception
            goto L7d
        L15:
            java.lang.String r1 = r6.f1757d     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = ""
            int r3 = r6.a     // Catch: java.lang.Throwable -> L13
            boolean r1 = cn.jpush.android.x.d.a(r5, r1, r2, r3)     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L2a
            java.lang.String r1 = "notify inapp is canceled already, not to show"
            cn.jpush.android.helper.Logger.dd(r0, r1)     // Catch: java.lang.Throwable -> L13
            r4.j(r5, r6)     // Catch: java.lang.Throwable -> L13
            return
        L2a:
            android.app.Activity r1 = cn.jpush.android.s.a.a(r5)     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = r6.bS     // Catch: java.lang.Throwable -> L46
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L46
            if (r2 != 0) goto L47
            java.lang.String r2 = r6.bS     // Catch: java.lang.Throwable -> L46
            java.lang.String r3 = r4.f1859e     // Catch: java.lang.Throwable -> L46
            boolean r2 = android.text.TextUtils.equals(r2, r3)     // Catch: java.lang.Throwable -> L46
            if (r2 != 0) goto L47
            java.lang.String r2 = "notify inapp not target activity,not to show"
            cn.jpush.android.helper.Logger.dd(r0, r2)     // Catch: java.lang.Throwable -> L46
            return
        L46:
        L47:
            if (r1 == 0) goto L5c
            cn.jpush.android.r.d r2 = r4.f1857c     // Catch: java.lang.Throwable -> L13
            cn.jpush.android.u.b r3 = r4.f1856b     // Catch: java.lang.Throwable -> L13
            boolean r1 = r2.a(r1, r3)     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L5c
            java.lang.String r1 = "notify inapp message display success"
            cn.jpush.android.helper.Logger.dd(r0, r1)     // Catch: java.lang.Throwable -> L13
            r4.k(r5, r6)     // Catch: java.lang.Throwable -> L13
            goto L98
        L5c:
            java.lang.String r1 = "notify inapp message display failed"
            cn.jpush.android.helper.Logger.ww(r0, r1)     // Catch: java.lang.Throwable -> L13
            r4.f(r5, r6)     // Catch: java.lang.Throwable -> L13
            goto L98
        L65:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = "notify inapp not display, param is null, context: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L13
            r1.append(r5)     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L13
            cn.jpush.android.helper.Logger.w(r0, r1)     // Catch: java.lang.Throwable -> L13
            r4.f(r5, r6)     // Catch: java.lang.Throwable -> L13
            return
        L7d:
            r4.f(r5, r6)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "notify inapp show failed"
            r5.append(r6)
            java.lang.String r6 = r1.getMessage()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            cn.jpush.android.helper.Logger.ww(r0, r5)
        L98:
            return
    }

    public void b(android.content.Context r8, java.lang.String r9) {
            r7 = this;
            if (r8 == 0) goto L5b
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L9
            goto L5b
        L9:
            java.lang.String r0 = ","
            java.lang.String[] r9 = r9.split(r0)
            int r0 = r9.length
            r1 = 0
        L11:
            if (r1 >= r0) goto L5a
            r2 = r9[r1]
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L1c
            goto L57
        L1c:
            cn.jpush.android.p.b r3 = cn.jpush.android.p.b.a()
            cn.jpush.android.d.d r3 = r3.a(r2)
            cn.jpush.android.p.b r4 = cn.jpush.android.p.b.a()
            boolean r4 = r4.c(r2)
            if (r4 == 0) goto L4a
            int r4 = r9.length
            r5 = 2
            if (r4 != r5) goto L35
            r2 = 1
            r2 = r9[r2]
        L35:
            r4 = 1602(0x642, double:7.915E-321)
            if (r3 == 0) goto L3f
            r6 = 40
            int r3 = r3.bt
            if (r6 != r3) goto L43
        L3f:
            cn.jpush.android.helper.c.a(r2, r4, r8)
            goto L57
        L43:
            r3 = 4005(0xfa5, double:1.9787E-320)
            r5 = 4
            cn.jpush.android.helper.c.a(r8, r2, r3, r5)
            goto L57
        L4a:
            cn.jpush.android.d.d r3 = new cn.jpush.android.d.d
            r3.<init>()
            r3.f1757d = r2
            java.lang.String r2 = "cn.jpush.android.intent.NOTIFY_INAPP_MESSAGE_CANCEL"
            r4 = 0
            cn.jpush.android.x.b.a(r8, r2, r3, r4)
        L57:
            int r1 = r1 + 1
            goto L11
        L5a:
            return
        L5b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "[cancelNotifyInApp] unexpected param is null, cancelIds: "
            r8.append(r0)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "InAppManager"
            cn.jpush.android.helper.Logger.w(r9, r8)
            return
    }

    public boolean b() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "hadDeleteMessage size="
            r0.append(r1)
            java.util.List<java.lang.String> r1 = r4.f1860f
            int r1 = r1.size()
            r2 = 0
            r3 = 1
            if (r1 <= 0) goto L16
            r1 = 1
            goto L17
        L16:
            r1 = 0
        L17:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "InAppManager"
            cn.jpush.android.helper.Logger.d(r1, r0)
            java.util.List<java.lang.String> r0 = r4.f1860f
            int r0 = r0.size()
            if (r0 <= 0) goto L2c
            return r3
        L2c:
            return r2
    }

    public void c(android.content.Context r4, cn.jpush.android.d.d r5) {
            r3 = this;
            if (r4 == 0) goto L58
            if (r5 != 0) goto L5
            goto L58
        L5:
            java.lang.String r5 = r5.f1757d
            boolean r0 = r3.c()
            if (r0 == 0) goto L58
            cn.jpush.android.u.b r0 = r3.f1856b
            if (r0 == 0) goto L58
            cn.jpush.android.d.d r0 = r0.j()
            if (r0 != 0) goto L18
            goto L58
        L18:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "notify inapp cancel, cancel_messageId: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = ", msgId: "
            r1.append(r2)
            java.lang.String r2 = r0.f1757d
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "InAppManager"
            cn.jpush.android.helper.Logger.d(r2, r1)
            java.lang.String r1 = r0.f1757d
            boolean r1 = android.text.TextUtils.equals(r5, r1)
            if (r1 == 0) goto L58
            cn.jpush.android.q.a r1 = cn.jpush.android.q.a.a()
            r2 = 1003(0x3eb, float:1.406E-42)
            r1.b(r4, r0, r2)
            r0 = 1602(0x642, double:7.915E-321)
            cn.jpush.android.helper.c.a(r5, r0, r4)
            r3.b(r4)
            long r0 = java.lang.System.currentTimeMillis()
            cn.jpush.android.p.a.a(r4, r0)
        L58:
            return
    }

    public boolean c() {
            r2 = this;
            cn.jpush.android.r.d r0 = r2.f1857c
            if (r0 == 0) goto Le
            cn.jpush.android.u.b r1 = r2.f1856b
            boolean r0 = r0.b(r1)
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public void d(android.content.Context r3, cn.jpush.android.d.d r4) {
            r2 = this;
            java.lang.String r0 = "InAppManager"
            java.lang.String r1 = "notify inapp click"
            cn.jpush.android.helper.Logger.dd(r0, r1)
            if (r4 == 0) goto L10
            cn.jpush.android.ad.g r0 = cn.jpush.android.ad.g.a()
            r0.a(r3, r4)
        L10:
            long r0 = java.lang.System.currentTimeMillis()
            cn.jpush.android.p.a.a(r3, r0)
            r2.c(r3)
            r2.b(r3)
            return
    }

    public void e(android.content.Context r4, cn.jpush.android.d.d r5) {
            r3 = this;
            java.lang.String r0 = "InAppManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22
            r1.<init>()     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = "handleMessageFailed  msgId="
            r1.append(r2)     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = r5.f1757d     // Catch: java.lang.Throwable -> L22
            r1.append(r2)     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L22
            cn.jpush.android.helper.Logger.d(r0, r1)     // Catch: java.lang.Throwable -> L22
            r3.n(r4, r5)     // Catch: java.lang.Throwable -> L22
            r3.m(r4, r5)     // Catch: java.lang.Throwable -> L22
            r3.b(r4)     // Catch: java.lang.Throwable -> L22
            return
        L22:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "handleMessageFailed  throwable="
            r5.append(r1)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            cn.jpush.android.helper.Logger.d(r0, r4)
            return
    }

    public void f(android.content.Context r4, cn.jpush.android.d.d r5) {
            r3 = this;
            java.lang.String r0 = "InAppManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            r1.<init>()     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = "handleShowFailed  msgId="
            r1.append(r2)     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = r5.f1757d     // Catch: java.lang.Throwable -> L29
            r1.append(r2)     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L29
            cn.jpush.android.helper.Logger.d(r0, r1)     // Catch: java.lang.Throwable -> L29
            r1 = 0
            r3.a(r4, r1)     // Catch: java.lang.Throwable -> L29
            r3.n(r4, r5)     // Catch: java.lang.Throwable -> L29
            r3.c(r4)     // Catch: java.lang.Throwable -> L29
            r3.m(r4, r5)     // Catch: java.lang.Throwable -> L29
            r3.b(r4)     // Catch: java.lang.Throwable -> L29
            return
        L29:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "handleShowFailed  throwable="
            r5.append(r1)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            cn.jpush.android.helper.Logger.d(r0, r4)
            return
    }

    public void g(android.content.Context r3, cn.jpush.android.d.d r4) {
            r2 = this;
            cn.jpush.android.u.b r0 = r2.f1856b     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L13
            r0.g()     // Catch: java.lang.Throwable -> L11
            cn.jpush.android.q.a r0 = cn.jpush.android.q.a.a()     // Catch: java.lang.Throwable -> L11
            r1 = 1005(0x3ed, float:1.408E-42)
            r0.a(r3, r4, r1)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r3 = move-exception
            goto L14
        L13:
            return
        L14:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "handleCancelMessage  throwable="
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "InAppManager"
            cn.jpush.android.helper.Logger.d(r4, r3)
            return
    }
}
