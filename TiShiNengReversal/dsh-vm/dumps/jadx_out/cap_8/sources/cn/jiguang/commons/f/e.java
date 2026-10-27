package cn.jiguang.commons.f;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class e {
    private java.lang.String a;

    /* renamed from: c, reason: collision with root package name */
    protected final java.util.concurrent.CopyOnWriteArrayList f1097c;

    /* renamed from: d, reason: collision with root package name */
    protected final java.util.concurrent.atomic.AtomicReference f1098d;

    /* renamed from: e, reason: collision with root package name */
    protected final java.util.concurrent.atomic.AtomicBoolean f1099e;

    /* renamed from: f, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f1100f;

    /* renamed from: g, reason: collision with root package name */
    protected final java.util.concurrent.atomic.AtomicLong f1101g;

    /* renamed from: h, reason: collision with root package name */
    private final java.util.concurrent.ConcurrentLinkedQueue f1102h;

    /* renamed from: i, reason: collision with root package name */
    protected final java.lang.String f1103i;

    /* renamed from: j, reason: collision with root package name */
    protected final long f1104j;

    /* renamed from: k, reason: collision with root package name */
    protected final java.lang.String f1105k;

    class a implements java.lang.Runnable {
        final /* synthetic */ cn.jiguang.commons.f.f a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ cn.jiguang.commons.f.e f1106b;

        /* renamed from: cn.jiguang.commons.f.e$a$a, reason: collision with other inner class name */
        class RunnableC0034a implements java.lang.Runnable {
            final /* synthetic */ cn.jiguang.commons.f.e.a a;

            RunnableC0034a(cn.jiguang.commons.f.e.a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    cn.jiguang.commons.f.e$a r0 = r2.a
                    cn.jiguang.commons.f.e r1 = r0.f1106b
                    cn.jiguang.commons.f.f r0 = r0.a
                    cn.jiguang.commons.f.e.a(r1, r0)
                    return
            }
        }

        a(cn.jiguang.commons.f.e r1, cn.jiguang.commons.f.f r2) {
                r0 = this;
                r0.f1106b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r7 = this;
                cn.jiguang.commons.f.e r0 = r7.f1106b
                java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.commons.f.e.a(r0)
                boolean r0 = r0.get()
                if (r0 == 0) goto L1e
                cn.jiguang.commons.f.e r0 = r7.f1106b
                java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.commons.f.e.a(r0)
                r1 = 0
                r0.set(r1)
            L16:
                cn.jiguang.commons.f.e r0 = r7.f1106b
                cn.jiguang.commons.f.f r1 = r7.a
                cn.jiguang.commons.f.e.a(r0, r1)
                return
            L1e:
                cn.jiguang.commons.f.e r0 = r7.f1106b
                java.util.concurrent.atomic.AtomicReference r0 = r0.f1098d
                java.lang.Object r0 = r0.get()
                if (r0 != 0) goto L35
                cn.jiguang.commons.f.e r0 = r7.f1106b
                r0.f()
                cn.jiguang.commons.f.e r0 = r7.f1106b
                java.util.concurrent.atomic.AtomicReference r0 = r0.f1098d
                java.lang.Object r0 = r0.get()
            L35:
                if (r0 == 0) goto L73
                cn.jiguang.commons.f.f r1 = r7.a
                r1.a(r0)
                cn.jiguang.commons.f.e r0 = r7.f1106b
                java.lang.String r0 = cn.jiguang.commons.f.e.c(r0)
                cn.jiguang.commons.f.e r1 = r7.f1106b
                java.util.concurrent.atomic.AtomicLong r1 = r1.f1101g
                long r1 = r1.get()
                cn.jiguang.commons.f.e r3 = r7.f1106b
                long r3 = r3.f1104j
                boolean r0 = cn.jiguang.commons.y.a.a(r0, r1, r3)
                if (r0 != 0) goto L55
                goto L72
            L55:
                cn.jiguang.commons.f.e r0 = r7.f1106b
                java.lang.String r1 = cn.jiguang.commons.f.e.c(r0)
                cn.jiguang.commons.f.e r0 = r7.f1106b
                java.util.concurrent.atomic.AtomicLong r0 = r0.f1101g
                long r2 = r0.get()
                cn.jiguang.commons.f.e r0 = r7.f1106b
                long r4 = r0.f1104j
                cn.jiguang.commons.f.e$a$a r6 = new cn.jiguang.commons.f.e$a$a
                r6.<init>(r7)
                boolean r0 = cn.jiguang.commons.y.a.a(r1, r2, r4, r6)
                if (r0 == 0) goto L16
            L72:
                return
            L73:
                cn.jiguang.commons.f.e r0 = r7.f1106b
                java.lang.String r0 = cn.jiguang.commons.f.e.c(r0)
                java.lang.String r1 = "no cached config, loading from network"
                cn.jiguang.commons.w.a.a(r0, r1)
                goto L16
        }
    }

    protected e(java.lang.String r4, java.lang.String r5, long r6, java.lang.String r8) {
            r3 = this;
            r3.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r3.f1097c = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r3.f1098d = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r3.f1099e = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            r3.f1100f = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            r3.f1101g = r0
            java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
            r0.<init>()
            r3.f1102h = r0
            r3.f1103i = r5
            r3.f1104j = r6
            r3.f1105k = r8
            r3.a = r4
            r3.d()
            r3.e()
            return
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicBoolean a(cn.jiguang.commons.f.e r0) {
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f1100f
            return r0
    }

    private void a(long r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.f1105k
            r0.append(r1)
            java.lang.String r1 = "config_last_request_time"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            cn.jiguang.commons.L.ac r1 = cn.jiguang.commons.L.ac.a()
            r1.c(r0, r4)
            java.util.concurrent.atomic.AtomicLong r0 = r3.f1101g
            r0.set(r4)
            java.lang.String r0 = r3.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "saved last request time:"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            cn.jiguang.commons.w.a.a(r0, r4)
            return
    }

    static /* synthetic */ void a(cn.jiguang.commons.f.e r0, cn.jiguang.commons.f.f r1) {
            r0.d(r1)
            return
    }

    private void a(cn.jiguang.commons.f.f r1, java.lang.Object r2) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.a(r2)
        L5:
            return
    }

    static /* synthetic */ java.lang.String c(cn.jiguang.commons.f.e r0) {
            java.lang.String r0 = r0.a
            return r0
    }

    private java.lang.String c(java.lang.String r7, org.json.JSONObject r8) {
            r6 = this;
            java.lang.String r0 = ":"
            r1 = 0
            cn.jiguang.commons.x.c r8 = r6.a(r7, r8)     // Catch: java.lang.Exception -> L86
            cn.jiguang.commons.x.d r8 = cn.jiguang.commons.x.e.e(r8)     // Catch: java.lang.Exception -> L86
            int r2 = r8.d()     // Catch: java.lang.Exception -> L86
            java.lang.String r3 = r6.a     // Catch: java.lang.Exception -> L86
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L86
            r4.<init>()     // Catch: java.lang.Exception -> L86
            java.lang.String r5 = "response code from "
            r4.append(r5)     // Catch: java.lang.Exception -> L86
            r4.append(r7)     // Catch: java.lang.Exception -> L86
            r4.append(r0)     // Catch: java.lang.Exception -> L86
            r4.append(r2)     // Catch: java.lang.Exception -> L86
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L86
            cn.jiguang.commons.w.a.a(r3, r4)     // Catch: java.lang.Exception -> L86
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 != r3) goto L9c
            java.lang.String r8 = r8.a()     // Catch: java.lang.Exception -> L86
            java.lang.String r2 = r6.a     // Catch: java.lang.Exception -> L86
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L86
            r3.<init>()     // Catch: java.lang.Exception -> L86
            java.lang.String r4 = "ori response="
            r3.append(r4)     // Catch: java.lang.Exception -> L86
            r3.append(r8)     // Catch: java.lang.Exception -> L86
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L86
            cn.jiguang.commons.w.a.a(r2, r3)     // Catch: java.lang.Exception -> L86
            boolean r2 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Exception -> L86
            if (r2 != 0) goto L88
            java.lang.Object r2 = r6.a(r8)     // Catch: java.lang.Exception -> L64
            boolean r3 = r6.a(r2)     // Catch: java.lang.Exception -> L64
            if (r3 == 0) goto Lba
            java.lang.String r3 = r6.f1103i     // Catch: java.lang.Exception -> L64
            cn.jiguang.commons.L.m.c(r3, r8)     // Catch: java.lang.Exception -> L64
            java.util.concurrent.atomic.AtomicReference r3 = r6.f1098d     // Catch: java.lang.Exception -> L64
            r3.set(r2)     // Catch: java.lang.Exception -> L64
            return r8
        L64:
            r8 = move-exception
            java.lang.String r2 = r6.a     // Catch: java.lang.Exception -> L86
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L86
            r3.<init>()     // Catch: java.lang.Exception -> L86
            java.lang.String r4 = "error parsing config from "
            r3.append(r4)     // Catch: java.lang.Exception -> L86
            r3.append(r7)     // Catch: java.lang.Exception -> L86
            r3.append(r0)     // Catch: java.lang.Exception -> L86
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Exception -> L86
            r3.append(r8)     // Catch: java.lang.Exception -> L86
            java.lang.String r8 = r3.toString()     // Catch: java.lang.Exception -> L86
            cn.jiguang.commons.w.a.c(r2, r8)     // Catch: java.lang.Exception -> L86
            return r1
        L86:
            r8 = move-exception
            goto Lbb
        L88:
            java.lang.String r8 = r6.a     // Catch: java.lang.Exception -> L86
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L86
            r2.<init>()     // Catch: java.lang.Exception -> L86
            java.lang.String r3 = "response body is empty from "
            r2.append(r3)     // Catch: java.lang.Exception -> L86
            r2.append(r7)     // Catch: java.lang.Exception -> L86
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L86
            goto Lb7
        L9c:
            java.lang.String r8 = r6.a     // Catch: java.lang.Exception -> L86
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L86
            r3.<init>()     // Catch: java.lang.Exception -> L86
            java.lang.String r4 = "response code is not 200 from "
            r3.append(r4)     // Catch: java.lang.Exception -> L86
            r3.append(r7)     // Catch: java.lang.Exception -> L86
            java.lang.String r4 = ": "
            r3.append(r4)     // Catch: java.lang.Exception -> L86
            r3.append(r2)     // Catch: java.lang.Exception -> L86
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Exception -> L86
        Lb7:
            cn.jiguang.commons.w.a.f(r8, r2)     // Catch: java.lang.Exception -> L86
        Lba:
            return r1
        Lbb:
            java.lang.String r2 = r6.a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "error sending request to "
            r3.append(r4)
            r3.append(r7)
            r3.append(r0)
            java.lang.String r7 = r8.getMessage()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            cn.jiguang.commons.w.a.c(r2, r7)
            return r1
    }

    private void d(cn.jiguang.commons.f.f r4) {
            r3 = this;
            r0 = 0
            boolean r1 = cn.jiguang.commons.L.g.d()     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb3
            if (r1 != 0) goto L36
            java.lang.String r1 = r3.a     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb3
            java.lang.String r2 = "network not available, using cached/default config"
            cn.jiguang.commons.w.a.f(r1, r2)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb3
            java.lang.Object r1 = r3.c()     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb3
            java.util.concurrent.atomic.AtomicReference r2 = r3.f1098d     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb3
            r2.set(r1)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb3
            r3.a(r4, r1)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb3
            java.util.concurrent.atomic.AtomicBoolean r4 = r3.f1099e
            r4.set(r0)
        L1f:
            java.util.concurrent.ConcurrentLinkedQueue r4 = r3.f1102h
            java.lang.Object r4 = r4.poll()
            cn.jiguang.commons.f.f r4 = (cn.jiguang.commons.f.f) r4
            if (r4 == 0) goto Ld0
            java.util.concurrent.atomic.AtomicReference r0 = r3.f1098d
            java.lang.Object r0 = r0.get()
            r4.a(r0)
            goto L1f
        L33:
            r4 = move-exception
            goto Ld1
        L36:
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.f1099e     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb3
            r2 = 1
            boolean r1 = r1.compareAndSet(r0, r2)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb3
            if (r1 != 0) goto L66
            java.lang.String r1 = r3.a     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb3
            java.lang.String r2 = "request already in progress, adding callback to queue"
            cn.jiguang.commons.w.a.a(r1, r2)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb3
            if (r4 == 0) goto L4d
            java.util.concurrent.ConcurrentLinkedQueue r1 = r3.f1102h     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb3
            r1.offer(r4)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb3
        L4d:
            java.util.concurrent.atomic.AtomicBoolean r4 = r3.f1099e
            r4.set(r0)
        L52:
            java.util.concurrent.ConcurrentLinkedQueue r4 = r3.f1102h
            java.lang.Object r4 = r4.poll()
            cn.jiguang.commons.f.f r4 = (cn.jiguang.commons.f.f) r4
            if (r4 == 0) goto Ld0
            java.util.concurrent.atomic.AtomicReference r0 = r3.f1098d
            java.lang.Object r0 = r0.get()
            r4.a(r0)
            goto L52
        L66:
            java.lang.String r1 = r3.a     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb3
            java.lang.String r2 = "requesting config from network"
            cn.jiguang.commons.w.a.a(r1, r2)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb3
            java.lang.String r1 = r3.g()     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb3
            if (r1 == 0) goto L86
            java.lang.String r1 = r3.a     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb3
            java.lang.String r2 = "network config request successful"
            cn.jiguang.commons.w.a.a(r1, r2)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb3
            java.lang.String r1 = r3.a     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb3
            cn.jiguang.commons.y.a.c(r1)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb3
            java.util.concurrent.atomic.AtomicReference r1 = r3.f1098d     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb3
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb3
            goto L97
        L86:
            java.util.concurrent.atomic.AtomicReference r1 = r3.f1098d     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb3
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb3
            if (r1 != 0) goto L97
            java.lang.Object r1 = r3.c()     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb3
            java.util.concurrent.atomic.AtomicReference r2 = r3.f1098d     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb3
            r2.set(r1)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb3
        L97:
            r3.a(r4, r1)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> Lb3
            java.util.concurrent.atomic.AtomicBoolean r4 = r3.f1099e
            r4.set(r0)
        L9f:
            java.util.concurrent.ConcurrentLinkedQueue r4 = r3.f1102h
            java.lang.Object r4 = r4.poll()
            cn.jiguang.commons.f.f r4 = (cn.jiguang.commons.f.f) r4
            if (r4 == 0) goto Ld0
            java.util.concurrent.atomic.AtomicReference r0 = r3.f1098d
            java.lang.Object r0 = r0.get()
            r4.a(r0)
            goto L9f
        Lb3:
            r1 = 0
            r3.a(r4, r1)     // Catch: java.lang.Throwable -> L33
            java.util.concurrent.atomic.AtomicBoolean r4 = r3.f1099e
            r4.set(r0)
        Lbc:
            java.util.concurrent.ConcurrentLinkedQueue r4 = r3.f1102h
            java.lang.Object r4 = r4.poll()
            cn.jiguang.commons.f.f r4 = (cn.jiguang.commons.f.f) r4
            if (r4 == 0) goto Ld0
            java.util.concurrent.atomic.AtomicReference r0 = r3.f1098d
            java.lang.Object r0 = r0.get()
            r4.a(r0)
            goto Lbc
        Ld0:
            return
        Ld1:
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.f1099e
            r1.set(r0)
        Ld6:
            java.util.concurrent.ConcurrentLinkedQueue r0 = r3.f1102h
            java.lang.Object r0 = r0.poll()
            cn.jiguang.commons.f.f r0 = (cn.jiguang.commons.f.f) r0
            if (r0 == 0) goto Lea
            java.util.concurrent.atomic.AtomicReference r1 = r3.f1098d
            java.lang.Object r1 = r1.get()
            r0.a(r1)
            goto Ld6
        Lea:
            throw r4
    }

    private void e() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r5.f1105k
            r0.append(r1)
            java.lang.String r1 = "config_last_request_time"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            cn.jiguang.commons.L.ac r1 = cn.jiguang.commons.L.ac.a()
            r2 = 0
            long r0 = r1.a(r0, r2)
            java.util.concurrent.atomic.AtomicLong r2 = r5.f1101g
            r2.set(r0)
            java.lang.String r2 = r5.a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "loaded last request time:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            cn.jiguang.commons.w.a.a(r2, r0)
            return
    }

    protected abstract cn.jiguang.commons.x.c a(java.lang.String r1, org.json.JSONObject r2);

    protected abstract java.lang.Object a(java.lang.String r1);

    protected abstract org.json.JSONObject a();

    public void a(cn.jiguang.commons.f.f r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f1100f
            r1 = 1
            r0.set(r1)
            r2.c(r3)
            return
    }

    protected abstract boolean a(java.lang.Object r1);

    protected abstract java.lang.Object c();

    public void c(cn.jiguang.commons.f.f r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            cn.jiguang.commons.C.a r0 = cn.jiguang.commons.C.a.c()
            cn.jiguang.commons.f.e$a r1 = new cn.jiguang.commons.f.e$a
            r1.<init>(r2, r3)
            cn.jiguang.commons.C.a$g r3 = cn.jiguang.commons.C.a.g.f771d
            r0.a(r1, r3)
            return
    }

    protected abstract void d();

    protected void f() {
            r4 = this;
            java.lang.String r0 = r4.f1103i     // Catch: java.lang.Exception -> L3b
            java.lang.String r0 = cn.jiguang.commons.L.m.j(r0)     // Catch: java.lang.Exception -> L3b
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L3b
            if (r1 != 0) goto L49
            java.lang.String r1 = r4.a     // Catch: java.lang.Exception -> L3b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3b
            r2.<init>()     // Catch: java.lang.Exception -> L3b
            java.lang.String r3 = "recovering config from cache:"
            r2.append(r3)     // Catch: java.lang.Exception -> L3b
            java.lang.String r3 = r4.f1103i     // Catch: java.lang.Exception -> L3b
            r2.append(r3)     // Catch: java.lang.Exception -> L3b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L3b
            cn.jiguang.commons.w.a.a(r1, r2)     // Catch: java.lang.Exception -> L3b
            java.lang.Object r0 = r4.a(r0)     // Catch: java.lang.Exception -> L3b
            boolean r1 = r4.a(r0)     // Catch: java.lang.Exception -> L3b
            if (r1 == 0) goto L3d
            java.util.concurrent.atomic.AtomicReference r1 = r4.f1098d     // Catch: java.lang.Exception -> L3b
            r1.set(r0)     // Catch: java.lang.Exception -> L3b
            java.lang.String r0 = r4.a     // Catch: java.lang.Exception -> L3b
            java.lang.String r1 = "config recovered from cache successfully"
            cn.jiguang.commons.w.a.a(r0, r1)     // Catch: java.lang.Exception -> L3b
            return
        L3b:
            r0 = move-exception
            goto L4a
        L3d:
            java.lang.String r0 = r4.f1103i     // Catch: java.lang.Exception -> L3b
            cn.jiguang.commons.L.m.d(r0)     // Catch: java.lang.Exception -> L3b
            java.lang.String r0 = r4.a     // Catch: java.lang.Exception -> L3b
            java.lang.String r1 = "invalid config recovered from cache"
            cn.jiguang.commons.w.a.f(r0, r1)     // Catch: java.lang.Exception -> L3b
        L49:
            return
        L4a:
            java.lang.String r1 = r4.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "error recovering config from cache:"
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            cn.jiguang.commons.w.a.c(r1, r0)
            return
    }

    protected java.lang.String g() {
            r5 = this;
            r0 = 0
            boolean r1 = cn.jiguang.commons.L.g.d()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L18
            if (r1 != 0) goto L1a
            java.lang.String r1 = r5.a     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L18
            java.lang.String r2 = "network not available, skipping config request"
        Lb:
            cn.jiguang.commons.w.a.f(r1, r2)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L18
        Le:
            long r1 = java.lang.System.currentTimeMillis()
            r5.a(r1)
            return r0
        L16:
            r0 = move-exception
            goto L7a
        L18:
            r1 = move-exception
            goto L5f
        L1a:
            org.json.JSONObject r1 = r5.a()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L18
            if (r1 != 0) goto L25
            java.lang.String r1 = r5.a     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L18
            java.lang.String r2 = "failed to build request parameters"
            goto Lb
        L25:
            java.lang.String r2 = r5.a     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L18
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L18
            r3.<init>()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L18
            java.lang.String r4 = "requesting config with params:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L18
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L18
            r3.append(r4)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L18
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L18
            cn.jiguang.commons.w.a.a(r2, r3)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L18
            java.util.concurrent.CopyOnWriteArrayList r2 = r5.f1097c     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L18
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L18
        L45:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L18
            if (r3 == 0) goto Le
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L18
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L18
            java.lang.String r3 = r5.c(r3, r1)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L18
            if (r3 == 0) goto L45
            long r0 = java.lang.System.currentTimeMillis()
            r5.a(r0)
            return r3
        L5f:
            java.lang.String r2 = r5.a     // Catch: java.lang.Throwable -> L16
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16
            r3.<init>()     // Catch: java.lang.Throwable -> L16
            java.lang.String r4 = "request config failed:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L16
            r3.append(r1)     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L16
            cn.jiguang.commons.w.a.c(r2, r1)     // Catch: java.lang.Throwable -> L16
            goto Le
        L7a:
            long r1 = java.lang.System.currentTimeMillis()
            r5.a(r1)
            throw r0
    }
}
