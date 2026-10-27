package cn.jiguang.commons.H;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class h extends cn.jiguang.commons.a.c {
    private final java.util.concurrent.atomic.AtomicReference a;

    /* renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f812c;

    class a extends android.content.BroadcastReceiver {
        final /* synthetic */ cn.jiguang.commons.H.h a;

        /* renamed from: cn.jiguang.commons.H.h$a$a, reason: collision with other inner class name */
        class RunnableC0028a implements java.lang.Runnable {
            final /* synthetic */ java.lang.String a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ cn.jiguang.commons.H.h.a f813b;

            RunnableC0028a(cn.jiguang.commons.H.h.a r1, java.lang.String r2) {
                    r0 = this;
                    r0.f813b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    cn.jiguang.commons.H.h$a r0 = r2.f813b
                    cn.jiguang.commons.H.h r0 = r0.a
                    java.lang.String r1 = r2.a
                    cn.jiguang.commons.H.h.a(r0, r1)
                    return
            }
        }

        a(cn.jiguang.commons.H.h r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r2, android.content.Intent r3) {
                r1 = this;
                java.lang.String r2 = r3.getAction()
                if (r2 != 0) goto L7
                return
            L7:
                cn.jiguang.commons.C.a r3 = cn.jiguang.commons.C.a.c()
                cn.jiguang.commons.H.h$a$a r0 = new cn.jiguang.commons.H.h$a$a
                r0.<init>(r1, r2)
                cn.jiguang.commons.C.a$g r2 = cn.jiguang.commons.C.a.g.a
                r3.a(r0, r2)
                return
        }
    }

    private static final class b {
        private static final cn.jiguang.commons.H.h a = null;

        static {
                cn.jiguang.commons.H.h r0 = new cn.jiguang.commons.H.h
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.commons.H.h.b.a = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.commons.H.h a() {
                cn.jiguang.commons.H.h r0 = cn.jiguang.commons.H.h.b.a
                return r0
        }
    }

    private h() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r2.a = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.f812c = r0
            return
    }

    /* synthetic */ h(cn.jiguang.commons.H.h.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    private int a(boolean r1, boolean r2) {
            r0 = this;
            if (r1 == 0) goto L6
            if (r2 != 0) goto L6
            r1 = 1
            return r1
        L6:
            if (r1 == 0) goto Lc
            if (r2 == 0) goto Lc
            r1 = 2
            return r1
        Lc:
            r1 = 3
            return r1
    }

    private void a(android.content.BroadcastReceiver r2) {
            r1 = this;
            if (r2 == 0) goto L9
            android.content.Context r0 = cn.jiguang.commons.L.h.a()
            r0.unregisterReceiver(r2)
        L9:
            return
    }

    static /* synthetic */ void a(cn.jiguang.commons.H.h r0, java.lang.String r1) {
            r0.g(r1)
            return
    }

    private android.content.IntentFilter c() {
            r2 = this;
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.String r1 = "android.intent.action.SCREEN_ON"
            r0.addAction(r1)
            java.lang.String r1 = "android.intent.action.SCREEN_OFF"
            r0.addAction(r1)
            return r0
    }

    private android.content.BroadcastReceiver d() {
            r1 = this;
            cn.jiguang.commons.H.h$a r0 = new cn.jiguang.commons.H.h$a
            r0.<init>(r1)
            return r0
    }

    private void f(java.lang.String r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f812c     // Catch: java.lang.Exception -> L33
            boolean r0 = r0.get()     // Catch: java.lang.Exception -> L33
            if (r0 == 0) goto L9
            goto L35
        L9:
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L33
            if (r0 == 0) goto L10
            goto L35
        L10:
            java.lang.String r0 = "\\|"
            java.lang.String[] r3 = r3.split(r0)     // Catch: java.lang.Exception -> L33
            int r0 = r3.length     // Catch: java.lang.Exception -> L33
            r1 = 1
            if (r0 <= r1) goto L35
            r3 = r3[r1]     // Catch: java.lang.Exception -> L33
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L33
            if (r3 != 0) goto L35
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.f812c     // Catch: java.lang.Exception -> L33
            r0 = 0
            boolean r3 = r3.compareAndSet(r0, r1)     // Catch: java.lang.Exception -> L33
            if (r3 == 0) goto L35
            java.lang.String r3 = "JDevice"
            java.lang.String r0 = "dev_rpt_state|1900_v3=ok"
            cn.jiguang.commons.w.a.e(r3, r0)     // Catch: java.lang.Exception -> L33
            return
        L33:
            r3 = move-exception
            goto L36
        L35:
            return
        L36:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "check oa state error: "
            r0.append(r1)
            java.lang.String r3 = r3.getMessage()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "JDeviceScreen"
            cn.jiguang.commons.w.a.f(r0, r3)
            return
    }

    private java.lang.String g() {
            r7 = this;
            java.lang.String r0 = "|"
            java.lang.String r1 = ""
            cn.jiguang.commons.g.n r2 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Exception -> L37
            r3 = 2004(0x7d4, float:2.808E-42)
            r4 = 0
            java.lang.String r2 = r2.d(r3, r4)     // Catch: java.lang.Exception -> L37
            cn.jiguang.commons.g.n r3 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Exception -> L37
            r5 = 1900(0x76c, float:2.662E-42)
            java.lang.String r3 = r3.d(r5, r4)     // Catch: java.lang.Exception -> L37
            cn.jiguang.commons.g.n r5 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Exception -> L37
            r6 = 1901(0x76d, float:2.664E-42)
            java.lang.String r4 = r5.d(r6, r4)     // Catch: java.lang.Exception -> L37
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L37
            if (r5 == 0) goto L39
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L37
            if (r5 == 0) goto L39
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L37
            if (r5 == 0) goto L39
            return r1
        L37:
            r0 = move-exception
            goto L67
        L39:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L37
            r5.<init>()     // Catch: java.lang.Exception -> L37
            boolean r6 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L37
            if (r6 == 0) goto L45
            r2 = r1
        L45:
            r5.append(r2)     // Catch: java.lang.Exception -> L37
            r5.append(r0)     // Catch: java.lang.Exception -> L37
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L37
            if (r2 == 0) goto L52
            r3 = r1
        L52:
            r5.append(r3)     // Catch: java.lang.Exception -> L37
            r5.append(r0)     // Catch: java.lang.Exception -> L37
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L37
            if (r0 == 0) goto L5f
            r4 = r1
        L5f:
            r5.append(r4)     // Catch: java.lang.Exception -> L37
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Exception -> L37
            return r0
        L67:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "get device id error: "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "JDeviceScreen"
            cn.jiguang.commons.w.a.f(r2, r0)
            return r1
    }

    private void g(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "JDeviceScreen"
            cn.jiguang.commons.f.j r1 = cn.jiguang.commons.f.j.j()     // Catch: java.lang.Exception -> L1d
            r2 = 2900(0xb54, float:4.064E-42)
            cn.jiguang.commons.c.i r1 = r1.a(r2)     // Catch: java.lang.Exception -> L1d
            if (r1 == 0) goto L1f
            cn.jiguang.commons.g.l r2 = cn.jiguang.commons.g.l.a()     // Catch: java.lang.Exception -> L1d
            boolean r1 = r2.c(r1)     // Catch: java.lang.Exception -> L1d
            if (r1 == 0) goto L19
            goto L1f
        L19:
            r3.h(r4)     // Catch: java.lang.Exception -> L1d
            return
        L1d:
            r4 = move-exception
            goto L28
        L1f:
            java.lang.String r4 = "data collection disabled for screen events"
            cn.jiguang.commons.w.a.a(r0, r4)     // Catch: java.lang.Exception -> L1d
            r3.e()     // Catch: java.lang.Exception -> L1d
            return
        L28:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "process screen event error: "
            r1.append(r2)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            cn.jiguang.commons.w.a.c(r0, r4)
            return
    }

    public static cn.jiguang.commons.H.h h() {
            cn.jiguang.commons.H.h r0 = cn.jiguang.commons.H.h.b.a()
            return r0
    }

    private void h(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "JDeviceScreen"
            boolean r1 = r7.j()     // Catch: java.lang.Exception -> Le
            if (r1 != 0) goto L11
            java.lang.String r8 = "skip screen event report due to interval"
            cn.jiguang.commons.w.a.a(r0, r8)     // Catch: java.lang.Exception -> Le
            return
        Le:
            r8 = move-exception
            goto La6
        L11:
            cn.jiguang.commons.a.c.e(r0)     // Catch: java.lang.Exception -> Le
            android.content.Context r1 = cn.jiguang.commons.L.h.a()     // Catch: java.lang.Exception -> Le
            java.lang.String r2 = "power"
            java.lang.Object r2 = r1.getSystemService(r2)     // Catch: java.lang.Exception -> Le
            android.os.PowerManager r2 = (android.os.PowerManager) r2     // Catch: java.lang.Exception -> Le
            java.lang.String r3 = "keyguard"
            java.lang.Object r1 = r1.getSystemService(r3)     // Catch: java.lang.Exception -> Le
            android.app.KeyguardManager r1 = (android.app.KeyguardManager) r1     // Catch: java.lang.Exception -> Le
            boolean r2 = r2.isScreenOn()     // Catch: java.lang.Exception -> Le
            boolean r1 = r1.inKeyguardRestrictedInputMode()     // Catch: java.lang.Exception -> Le
            if (r2 == 0) goto L36
            if (r1 != 0) goto L36
            r3 = 1
            goto L37
        L36:
            r3 = 0
        L37:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Le
            r4.<init>()     // Catch: java.lang.Exception -> Le
            java.lang.String r5 = "screen state - on: "
            r4.append(r5)     // Catch: java.lang.Exception -> Le
            r4.append(r2)     // Catch: java.lang.Exception -> Le
            java.lang.String r5 = ", locked: "
            r4.append(r5)     // Catch: java.lang.Exception -> Le
            r4.append(r1)     // Catch: java.lang.Exception -> Le
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Le
            cn.jiguang.commons.w.a.a(r0, r4)     // Catch: java.lang.Exception -> Le
            java.lang.String r4 = r7.g()     // Catch: java.lang.Exception -> Le
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Exception -> Le
            r5.<init>()     // Catch: java.lang.Exception -> Le
            java.lang.String r6 = "status"
            r5.put(r6, r3)     // Catch: java.lang.Exception -> Le
            java.lang.String r6 = "state"
            int r1 = r7.a(r2, r1)     // Catch: java.lang.Exception -> Le
            r5.put(r6, r1)     // Catch: java.lang.Exception -> Le
            java.lang.String r1 = "dev_id"
            r5.put(r1, r4)     // Catch: java.lang.Exception -> Le
            java.lang.String r1 = "screen report success"
            cn.jiguang.commons.w.a.a(r0, r1)     // Catch: java.lang.Exception -> Le
            cn.jiguang.commons.g.p r1 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Exception -> Le
            java.lang.String r2 = "sc_status"
            r1.a(r5, r2)     // Catch: java.lang.Exception -> Le
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Le
            r1.<init>()     // Catch: java.lang.Exception -> Le
            java.lang.String r2 = "screen event reported: "
            r1.append(r2)     // Catch: java.lang.Exception -> Le
            r1.append(r8)     // Catch: java.lang.Exception -> Le
            java.lang.String r8 = ", status: "
            r1.append(r8)     // Catch: java.lang.Exception -> Le
            if (r3 == 0) goto L95
            java.lang.String r8 = "开"
            goto L98
        L95:
            java.lang.String r8 = "锁"
        L98:
            r1.append(r8)     // Catch: java.lang.Exception -> Le
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Exception -> Le
            cn.jiguang.commons.w.a.a(r0, r8)     // Catch: java.lang.Exception -> Le
            r7.f(r4)     // Catch: java.lang.Exception -> Le
            return
        La6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "screen err:"
            r1.append(r2)
            java.lang.String r8 = r8.getMessage()
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            cn.jiguang.commons.w.a.f(r0, r8)
            return
    }

    private boolean j() {
            r11 = this;
            java.lang.String r0 = "JDeviceScreen"
            r1 = 0
            cn.jiguang.commons.f.j r2 = cn.jiguang.commons.f.j.j()     // Catch: java.lang.Exception -> L53
            r3 = 2900(0xb54, float:4.064E-42)
            cn.jiguang.commons.c.i r2 = r2.a(r3)     // Catch: java.lang.Exception -> L53
            if (r2 != 0) goto L10
            return r1
        L10:
            long r3 = cn.jiguang.commons.a.c.c(r0)     // Catch: java.lang.Exception -> L53
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L53
            long r7 = r2.j()     // Catch: java.lang.Exception -> L53
            long r5 = r5 - r3
            long r2 = java.lang.Math.abs(r5)     // Catch: java.lang.Exception -> L53
            r4 = 1000(0x3e8, double:4.94E-321)
            long r9 = r2 / r4
            long r4 = r7 / r4
            int r6 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r6 < 0) goto L2d
            r2 = 1
            goto L2e
        L2d:
            r2 = 0
        L2e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L53
            r3.<init>()     // Catch: java.lang.Exception -> L53
            java.lang.String r6 = "report interval check: elapsed:"
            r3.append(r6)     // Catch: java.lang.Exception -> L53
            r3.append(r9)     // Catch: java.lang.Exception -> L53
            java.lang.String r6 = "s, limit:"
            r3.append(r6)     // Catch: java.lang.Exception -> L53
            r3.append(r4)     // Catch: java.lang.Exception -> L53
            java.lang.String r4 = "s, result:"
            r3.append(r4)     // Catch: java.lang.Exception -> L53
            r3.append(r2)     // Catch: java.lang.Exception -> L53
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L53
            cn.jiguang.commons.w.a.a(r0, r3)     // Catch: java.lang.Exception -> L53
            return r2
        L53:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "check report interval error: "
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            cn.jiguang.commons.w.a.f(r0, r2)
            return r1
    }

    @Override // cn.jiguang.commons.a.c
    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "JDeviceScreen"
            return r0
    }

    @Override // cn.jiguang.commons.a.c
    public void a(boolean r4) {
            r3 = this;
            java.lang.String r4 = "JDeviceScreen"
            java.lang.String r0 = "starting doBusiness"
            cn.jiguang.commons.w.a.a(r4, r0)     // Catch: java.lang.Exception -> L8
            return
        L8:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "doBusiness screen err:"
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            cn.jiguang.commons.w.a.f(r4, r0)
            return
    }

    public void e() {
            r2 = this;
            java.lang.String r0 = "JDeviceScreen"
            java.lang.String r1 = "screen monitoring disabled"
            cn.jiguang.commons.w.a.a(r0, r1)
            r2.k()
            return
    }

    public void f() {
            r2 = this;
            java.lang.String r0 = "JDeviceScreen"
            java.lang.String r1 = "screen monitoring enabled"
            cn.jiguang.commons.w.a.a(r0, r1)
            r2.i()
            return
    }

    public void i() {
            r9 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r9.a
            java.lang.Object r0 = r0.get()
            android.content.BroadcastReceiver r0 = (android.content.BroadcastReceiver) r0
            java.lang.String r1 = "JDeviceScreen"
            if (r0 == 0) goto L12
            java.lang.String r0 = "screen receiver already registered"
            cn.jiguang.commons.w.a.a(r1, r0)
            return
        L12:
            android.content.BroadcastReceiver r3 = r9.d()
            r8 = 0
            java.util.concurrent.atomic.AtomicReference r0 = r9.a     // Catch: java.lang.Exception -> L25
            boolean r0 = androidx.camera.view.p.a(r0, r8, r3)     // Catch: java.lang.Exception -> L25
            if (r0 != 0) goto L27
            java.lang.String r0 = "another thread handling registration"
        L21:
            cn.jiguang.commons.w.a.a(r1, r0)     // Catch: java.lang.Exception -> L25
            return
        L25:
            r0 = move-exception
            goto L50
        L27:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L25
            r0.<init>()     // Catch: java.lang.Exception -> L25
            android.content.Context r2 = cn.jiguang.commons.L.h.a()     // Catch: java.lang.Exception -> L25
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Exception -> L25
            r0.append(r2)     // Catch: java.lang.Exception -> L25
            java.lang.String r2 = ".permission.JPUSH_MESSAGE"
            r0.append(r2)     // Catch: java.lang.Exception -> L25
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Exception -> L25
            android.content.IntentFilter r4 = r9.c()     // Catch: java.lang.Exception -> L25
            android.content.Context r2 = cn.jiguang.commons.L.h.a()     // Catch: java.lang.Exception -> L25
            r6 = 0
            r7 = 0
            cn.jiguang.commons.L.w.a(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L25
            java.lang.String r0 = "screen receiver registered success"
            goto L21
        L50:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "register screen receiver error: "
            r2.append(r4)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            cn.jiguang.commons.w.a.c(r1, r0)
            java.util.concurrent.atomic.AtomicReference r0 = r9.a
            r0.set(r8)
            r9.a(r3)     // Catch: java.lang.Exception -> L70
        L70:
            return
    }

    public void k() {
            r4 = this;
            java.lang.String r0 = "JDeviceScreen"
            java.util.concurrent.atomic.AtomicReference r1 = r4.a     // Catch: java.lang.Exception -> L13
            r2 = 0
            java.lang.Object r1 = r1.getAndSet(r2)     // Catch: java.lang.Exception -> L13
            android.content.BroadcastReceiver r1 = (android.content.BroadcastReceiver) r1     // Catch: java.lang.Exception -> L13
            if (r1 != 0) goto L15
            java.lang.String r1 = "screen receiver not registered"
        Lf:
            cn.jiguang.commons.w.a.a(r0, r1)     // Catch: java.lang.Exception -> L13
            return
        L13:
            r1 = move-exception
            goto L1b
        L15:
            r4.a(r1)     // Catch: java.lang.Exception -> L13
            java.lang.String r1 = "screen receiver unregistered success"
            goto Lf
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "unregister screen receiver error: "
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            cn.jiguang.commons.w.a.c(r0, r1)
            return
    }
}
