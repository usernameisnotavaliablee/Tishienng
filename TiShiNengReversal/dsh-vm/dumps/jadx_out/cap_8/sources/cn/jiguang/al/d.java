package cn.jiguang.al;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d {
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, cn.jiguang.am.a> a;

    /* renamed from: b, reason: collision with root package name */
    private java.util.concurrent.atomic.AtomicBoolean f582b;

    /* renamed from: c, reason: collision with root package name */
    private android.content.Context f583c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f584d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f585e;



    private static final class a {
        private static final cn.jiguang.al.d a = null;

        static {
                cn.jiguang.al.d r0 = new cn.jiguang.al.d
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.al.d.a.a = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.al.d a() {
                cn.jiguang.al.d r0 = cn.jiguang.al.d.a.a
                return r0
        }
    }

    private d() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.f582b = r0
            java.lang.String r0 = "netmt.catch"
            r2.f585e = r0
            return
    }

    /* synthetic */ d(cn.jiguang.al.d.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static cn.jiguang.al.d a() {
            cn.jiguang.al.d r0 = cn.jiguang.al.d.a.a()
            return r0
    }

    static /* synthetic */ java.lang.String a(cn.jiguang.al.d r0) {
            java.lang.String r0 = r0.f585e
            return r0
    }

    private void a(cn.jiguang.am.a r2) {
            r1 = this;
            cn.jiguang.al.d$1 r0 = new cn.jiguang.al.d$1
            r0.<init>(r1, r2)
            java.lang.String r2 = "FUTURE_TASK"
            cn.jiguang.au.d.a(r2, r0)
            return
    }

    static /* synthetic */ android.content.Context b(cn.jiguang.al.d r0) {
            android.content.Context r0 = r0.f583c
            return r0
    }

    private boolean b(android.content.Context r1) {
            r0 = this;
            r0.a(r1)
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f582b
            boolean r1 = r1.get()
            return r1
    }

    public java.lang.String a(android.content.Context r3, cn.jiguang.net.HttpRequest r4, boolean r5) {
            r2 = this;
            java.lang.String r0 = ""
            boolean r3 = r2.b(r3)     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L1e
            cn.jiguang.ap.j r3 = new cn.jiguang.ap.j     // Catch: java.lang.Throwable -> L1c
            android.content.Context r1 = r2.f583c     // Catch: java.lang.Throwable -> L1c
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L1c
            r3.a(r4, r5)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r0 = r3.c()     // Catch: java.lang.Throwable -> L1c
            java.util.concurrent.ConcurrentHashMap<java.lang.String, cn.jiguang.am.a> r4 = r2.a     // Catch: java.lang.Throwable -> L1c
            r4.put(r0, r3)     // Catch: java.lang.Throwable -> L1c
            return r0
        L1c:
            r3 = move-exception
            goto L1f
        L1e:
            return r0
        L1f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "httpStart wrong:"
            r4.append(r5)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "NetMoniterManager"
            cn.jiguang.w.f.c(r4, r3)
            return r0
    }

    public java.lang.String a(java.lang.String r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f582b
            boolean r0 = r0.get()
            java.lang.String r1 = ""
            if (r0 == 0) goto L39
            cn.jiguang.ap.a r0 = new cn.jiguang.ap.a     // Catch: java.lang.Throwable -> L1e
            android.content.Context r2 = r3.f583c     // Catch: java.lang.Throwable -> L1e
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L1e
            r0.a(r4)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = r0.c()     // Catch: java.lang.Throwable -> L1e
            java.util.concurrent.ConcurrentHashMap<java.lang.String, cn.jiguang.am.a> r4 = r3.a     // Catch: java.lang.Throwable -> L1e
            r4.put(r1, r0)     // Catch: java.lang.Throwable -> L1e
            return r1
        L1e:
            r4 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "dnsStart wrong:"
            r0.append(r2)
            java.lang.String r4 = r4.getMessage()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "NetMoniterManager"
            cn.jiguang.w.f.c(r0, r4)
        L39:
            return r1
    }

    public java.lang.String a(java.lang.String r4, int r5, int r6) {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f582b
            boolean r0 = r0.get()
            java.lang.String r1 = ""
            if (r0 == 0) goto L48
            cn.jiguang.ap.d r0 = new cn.jiguang.ap.d     // Catch: java.lang.Throwable -> L2d
            android.content.Context r2 = r3.f583c     // Catch: java.lang.Throwable -> L2d
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L2d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
            r2.<init>()     // Catch: java.lang.Throwable -> L2d
            r2.append(r6)     // Catch: java.lang.Throwable -> L2d
            r2.append(r1)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> L2d
            r0.a(r4, r5, r6)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = r0.c()     // Catch: java.lang.Throwable -> L2d
            java.util.concurrent.ConcurrentHashMap<java.lang.String, cn.jiguang.am.a> r4 = r3.a     // Catch: java.lang.Throwable -> L2d
            r4.put(r1, r0)     // Catch: java.lang.Throwable -> L2d
            return r1
        L2d:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "tcpConnStart wrong:"
            r5.append(r6)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "NetMoniterManager"
            cn.jiguang.w.f.c(r5, r4)
        L48:
            return r1
    }

    public java.lang.String a(java.lang.String r4, int r5, int r6, int r7) {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f582b
            boolean r0 = r0.get()
            java.lang.String r1 = ""
            if (r0 == 0) goto L42
            cn.jiguang.ap.e r0 = new cn.jiguang.ap.e     // Catch: java.lang.Throwable -> L27
            android.content.Context r2 = r3.f583c     // Catch: java.lang.Throwable -> L27
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L27
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            r2.<init>()     // Catch: java.lang.Throwable -> L27
            r2.append(r6)     // Catch: java.lang.Throwable -> L27
            r2.append(r1)     // Catch: java.lang.Throwable -> L27
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> L27
            r0.a(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L27
            r3.a(r0)     // Catch: java.lang.Throwable -> L27
            return r1
        L27:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "tcpDisconnect wrong:"
            r5.append(r6)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "NetMoniterManager"
            cn.jiguang.w.f.c(r5, r4)
        L42:
            return r1
    }

    public void a(android.content.Context r4) {
            r3 = this;
            boolean r0 = r3.f584d
            if (r0 == 0) goto L5
            return
        L5:
            android.content.Context r0 = r4.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            r3.f583c = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f582b
            cn.jiguang.e.a r1 = cn.jiguang.e.a.aR()
            java.lang.Object r4 = cn.jiguang.e.b.a(r4, r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0.set(r4)
            r4 = 1
            android.content.Context r0 = r3.f583c     // Catch: java.lang.Throwable -> L48
            java.lang.String r0 = cn.jiguang.av.a.a(r0)     // Catch: java.lang.Throwable -> L48
            android.content.Context r1 = r3.f583c     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Throwable -> L48
            java.lang.String r2 = ""
            java.lang.String r0 = r0.replace(r1, r2)     // Catch: java.lang.Throwable -> L48
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L65
            java.lang.String r1 = ":"
            boolean r1 = r0.startsWith(r1)     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L4a
            java.lang.String r0 = r0.substring(r4)     // Catch: java.lang.Throwable -> L48
            goto L4a
        L48:
            goto L65
        L4a:
            java.lang.String r1 = r3.f585e     // Catch: java.lang.Throwable -> L48
            boolean r1 = r1.contains(r0)     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L65
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48
            r1.<init>()     // Catch: java.lang.Throwable -> L48
            java.lang.String r2 = "netmt."
            r1.append(r2)     // Catch: java.lang.Throwable -> L48
            r1.append(r0)     // Catch: java.lang.Throwable -> L48
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L48
            r3.f585e = r0     // Catch: java.lang.Throwable -> L48
        L65:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "init DATAPATH :"
            r0.append(r1)
            java.lang.String r1 = r3.f585e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "NetMoniterManager"
            cn.jiguang.w.f.c(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "init state :"
            r0.append(r2)
            java.util.concurrent.atomic.AtomicBoolean r2 = r3.f582b
            boolean r2 = r2.get()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            cn.jiguang.w.f.c(r1, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f582b
            boolean r0 = r0.get()
            if (r0 == 0) goto La7
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r3.a = r0
            goto Lac
        La7:
            java.lang.String r0 = r3.f585e
            cn.jiguang.av.i.d(r0)
        Lac:
            r3.f584d = r4
            return
    }

    public void a(android.content.Context r1, java.lang.String r2, cn.jiguang.net.HttpResponse r3) {
            r0 = this;
            boolean r1 = r0.b(r1)     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L26
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L24
            if (r1 != 0) goto L26
            java.util.concurrent.ConcurrentHashMap<java.lang.String, cn.jiguang.am.a> r1 = r0.a     // Catch: java.lang.Throwable -> L24
            java.lang.Object r1 = r1.remove(r2)     // Catch: java.lang.Throwable -> L24
            cn.jiguang.am.a r1 = (cn.jiguang.am.a) r1     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L26
            boolean r2 = r1 instanceof cn.jiguang.ap.j     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L26
            r2 = r1
            cn.jiguang.ap.j r2 = (cn.jiguang.ap.j) r2     // Catch: java.lang.Throwable -> L24
            r2.a(r3)     // Catch: java.lang.Throwable -> L24
            r0.a(r1)     // Catch: java.lang.Throwable -> L24
            return
        L24:
            r1 = move-exception
            goto L27
        L26:
            return
        L27:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "httpEnd wrong:"
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "NetMoniterManager"
            cn.jiguang.w.f.c(r2, r1)
            return
    }

    public void a(android.content.Context r4, boolean r5) {
            r3 = this;
            r3.a(r4)
            java.lang.Class<cn.jiguang.al.d> r4 = cn.jiguang.al.d.class
            monitor-enter(r4)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f582b     // Catch: java.lang.Throwable -> L56
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L56
            if (r0 == r5) goto L5b
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f582b     // Catch: java.lang.Throwable -> L56
            r0.set(r5)     // Catch: java.lang.Throwable -> L56
            android.content.Context r0 = r3.f583c     // Catch: java.lang.Throwable -> L56
            cn.jiguang.e.a r1 = cn.jiguang.e.a.aR()     // Catch: java.lang.Throwable -> L56
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L56
            cn.jiguang.e.a r5 = r1.a(r5)     // Catch: java.lang.Throwable -> L56
            r1 = 1
            cn.jiguang.e.a[] r1 = new cn.jiguang.e.a[r1]     // Catch: java.lang.Throwable -> L56
            r2 = 0
            r1[r2] = r5     // Catch: java.lang.Throwable -> L56
            cn.jiguang.e.b.a(r0, r1)     // Catch: java.lang.Throwable -> L56
            java.lang.String r5 = "NetMoniterManager"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56
            r0.<init>()     // Catch: java.lang.Throwable -> L56
            java.lang.String r1 = "change state :"
            r0.append(r1)     // Catch: java.lang.Throwable -> L56
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.f582b     // Catch: java.lang.Throwable -> L56
            boolean r1 = r1.get()     // Catch: java.lang.Throwable -> L56
            r0.append(r1)     // Catch: java.lang.Throwable -> L56
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L56
            cn.jiguang.w.f.c(r5, r0)     // Catch: java.lang.Throwable -> L56
            java.util.concurrent.atomic.AtomicBoolean r5 = r3.f582b     // Catch: java.lang.Throwable -> L56
            boolean r5 = r5.get()     // Catch: java.lang.Throwable -> L56
            if (r5 == 0) goto L58
            java.util.concurrent.ConcurrentHashMap r5 = new java.util.concurrent.ConcurrentHashMap     // Catch: java.lang.Throwable -> L56
            r5.<init>()     // Catch: java.lang.Throwable -> L56
            r3.a = r5     // Catch: java.lang.Throwable -> L56
            goto L5b
        L56:
            r5 = move-exception
            goto L5d
        L58:
            r5 = 0
            r3.a = r5     // Catch: java.lang.Throwable -> L56
        L5b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L56
            return
        L5d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L56
            throw r5
    }

    public void a(java.lang.String r2, int r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f582b
            boolean r0 = r0.get()
            if (r0 == 0) goto L41
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L41
            java.util.concurrent.ConcurrentHashMap<java.lang.String, cn.jiguang.am.a> r0 = r1.a     // Catch: java.lang.Throwable -> L26
            java.lang.Object r2 = r0.remove(r2)     // Catch: java.lang.Throwable -> L26
            cn.jiguang.am.a r2 = (cn.jiguang.am.a) r2     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L41
            boolean r0 = r2 instanceof cn.jiguang.ap.a     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L41
            r0 = r2
            cn.jiguang.ap.a r0 = (cn.jiguang.ap.a) r0     // Catch: java.lang.Throwable -> L26
            r0.a(r3)     // Catch: java.lang.Throwable -> L26
            r1.a(r2)     // Catch: java.lang.Throwable -> L26
            return
        L26:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "dnsEnd wrong:"
            r3.append(r0)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "NetMoniterManager"
            cn.jiguang.w.f.c(r3, r2)
        L41:
            return
    }

    public java.lang.String b(java.lang.String r4, int r5) {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f582b
            boolean r0 = r0.get()
            java.lang.String r1 = ""
            if (r0 == 0) goto L39
            cn.jiguang.ap.c r0 = new cn.jiguang.ap.c     // Catch: java.lang.Throwable -> L1e
            android.content.Context r2 = r3.f583c     // Catch: java.lang.Throwable -> L1e
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L1e
            r0.a(r4, r5)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = r0.c()     // Catch: java.lang.Throwable -> L1e
            java.util.concurrent.ConcurrentHashMap<java.lang.String, cn.jiguang.am.a> r4 = r3.a     // Catch: java.lang.Throwable -> L1e
            r4.put(r1, r0)     // Catch: java.lang.Throwable -> L1e
            return r1
        L1e:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "sisStart wrong:"
            r5.append(r0)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "NetMoniterManager"
            cn.jiguang.w.f.c(r5, r4)
        L39:
            return r1
    }

    public java.lang.String b(java.lang.String r4, int r5, int r6) {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f582b
            boolean r0 = r0.get()
            java.lang.String r1 = ""
            if (r0 == 0) goto L48
            cn.jiguang.ap.g r0 = new cn.jiguang.ap.g     // Catch: java.lang.Throwable -> L2d
            android.content.Context r2 = r3.f583c     // Catch: java.lang.Throwable -> L2d
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L2d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
            r2.<init>()     // Catch: java.lang.Throwable -> L2d
            r2.append(r6)     // Catch: java.lang.Throwable -> L2d
            r2.append(r1)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> L2d
            r0.a(r4, r5, r6)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = r0.c()     // Catch: java.lang.Throwable -> L2d
            java.util.concurrent.ConcurrentHashMap<java.lang.String, cn.jiguang.am.a> r4 = r3.a     // Catch: java.lang.Throwable -> L2d
            r4.put(r1, r0)     // Catch: java.lang.Throwable -> L2d
            return r1
        L2d:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "tcpRegisterStart wrong:"
            r5.append(r6)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "NetMoniterManager"
            cn.jiguang.w.f.c(r5, r4)
        L48:
            return r1
    }

    public void b() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f582b
            boolean r0 = r0.get()
            if (r0 != 0) goto L9
            return
        L9:
            cn.jiguang.al.d$2 r0 = new cn.jiguang.al.d$2
            r0.<init>(r2)
            java.lang.String r1 = "FUTURE_TASK"
            cn.jiguang.au.d.a(r1, r0)
            return
    }

    public java.lang.String c(java.lang.String r4, int r5, int r6) {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f582b
            boolean r0 = r0.get()
            java.lang.String r1 = ""
            if (r0 == 0) goto L48
            cn.jiguang.ap.f r0 = new cn.jiguang.ap.f     // Catch: java.lang.Throwable -> L2d
            android.content.Context r2 = r3.f583c     // Catch: java.lang.Throwable -> L2d
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L2d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
            r2.<init>()     // Catch: java.lang.Throwable -> L2d
            r2.append(r6)     // Catch: java.lang.Throwable -> L2d
            r2.append(r1)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> L2d
            r0.a(r4, r5, r6)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = r0.c()     // Catch: java.lang.Throwable -> L2d
            java.util.concurrent.ConcurrentHashMap<java.lang.String, cn.jiguang.am.a> r4 = r3.a     // Catch: java.lang.Throwable -> L2d
            r4.put(r1, r0)     // Catch: java.lang.Throwable -> L2d
            return r1
        L2d:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "tcpLoginStart wrong:"
            r5.append(r6)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "NetMoniterManager"
            cn.jiguang.w.f.c(r5, r4)
        L48:
            return r1
    }

    public void c(java.lang.String r2, int r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f582b
            boolean r0 = r0.get()
            if (r0 == 0) goto L41
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L41
            java.util.concurrent.ConcurrentHashMap<java.lang.String, cn.jiguang.am.a> r0 = r1.a     // Catch: java.lang.Throwable -> L26
            java.lang.Object r2 = r0.remove(r2)     // Catch: java.lang.Throwable -> L26
            cn.jiguang.am.a r2 = (cn.jiguang.am.a) r2     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L41
            boolean r0 = r2 instanceof cn.jiguang.ap.c     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L41
            r0 = r2
            cn.jiguang.ap.c r0 = (cn.jiguang.ap.c) r0     // Catch: java.lang.Throwable -> L26
            r0.a(r3)     // Catch: java.lang.Throwable -> L26
            r1.a(r2)     // Catch: java.lang.Throwable -> L26
            return
        L26:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "sisEnd wrong:"
            r3.append(r0)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "NetMoniterManager"
            cn.jiguang.w.f.c(r3, r2)
        L41:
            return
    }

    public java.lang.String d(java.lang.String r4, int r5, int r6) {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f582b
            boolean r0 = r0.get()
            java.lang.String r1 = ""
            if (r0 == 0) goto L48
            cn.jiguang.ap.h r0 = new cn.jiguang.ap.h     // Catch: java.lang.Throwable -> L2d
            android.content.Context r2 = r3.f583c     // Catch: java.lang.Throwable -> L2d
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L2d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
            r2.<init>()     // Catch: java.lang.Throwable -> L2d
            r2.append(r6)     // Catch: java.lang.Throwable -> L2d
            r2.append(r1)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> L2d
            r0.a(r4, r5, r6)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = r0.c()     // Catch: java.lang.Throwable -> L2d
            java.util.concurrent.ConcurrentHashMap<java.lang.String, cn.jiguang.am.a> r4 = r3.a     // Catch: java.lang.Throwable -> L2d
            r4.put(r1, r0)     // Catch: java.lang.Throwable -> L2d
            return r1
        L2d:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "tcpReportStart wrong:"
            r5.append(r6)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "NetMoniterManager"
            cn.jiguang.w.f.c(r5, r4)
        L48:
            return r1
    }

    public void d(java.lang.String r2, int r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f582b
            boolean r0 = r0.get()
            if (r0 == 0) goto L41
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L41
            java.util.concurrent.ConcurrentHashMap<java.lang.String, cn.jiguang.am.a> r0 = r1.a     // Catch: java.lang.Throwable -> L26
            java.lang.Object r2 = r0.remove(r2)     // Catch: java.lang.Throwable -> L26
            cn.jiguang.am.a r2 = (cn.jiguang.am.a) r2     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L41
            boolean r0 = r2 instanceof cn.jiguang.ap.d     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L41
            r0 = r2
            cn.jiguang.ap.d r0 = (cn.jiguang.ap.d) r0     // Catch: java.lang.Throwable -> L26
            r0.a(r3)     // Catch: java.lang.Throwable -> L26
            r1.a(r2)     // Catch: java.lang.Throwable -> L26
            return
        L26:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "tcpConnEnd wrong:"
            r3.append(r0)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "NetMoniterManager"
            cn.jiguang.w.f.c(r3, r2)
        L41:
            return
    }

    public void e(java.lang.String r2, int r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f582b
            boolean r0 = r0.get()
            if (r0 == 0) goto L41
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L41
            java.util.concurrent.ConcurrentHashMap<java.lang.String, cn.jiguang.am.a> r0 = r1.a     // Catch: java.lang.Throwable -> L26
            java.lang.Object r2 = r0.remove(r2)     // Catch: java.lang.Throwable -> L26
            cn.jiguang.am.a r2 = (cn.jiguang.am.a) r2     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L41
            boolean r0 = r2 instanceof cn.jiguang.ap.g     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L41
            r0 = r2
            cn.jiguang.ap.g r0 = (cn.jiguang.ap.g) r0     // Catch: java.lang.Throwable -> L26
            r0.a(r3)     // Catch: java.lang.Throwable -> L26
            r1.a(r2)     // Catch: java.lang.Throwable -> L26
            return
        L26:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "tcpRegisterEnd wrong:"
            r3.append(r0)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "NetMoniterManager"
            cn.jiguang.w.f.c(r3, r2)
        L41:
            return
    }

    public void f(java.lang.String r2, int r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f582b
            boolean r0 = r0.get()
            if (r0 == 0) goto L41
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L41
            java.util.concurrent.ConcurrentHashMap<java.lang.String, cn.jiguang.am.a> r0 = r1.a     // Catch: java.lang.Throwable -> L26
            java.lang.Object r2 = r0.remove(r2)     // Catch: java.lang.Throwable -> L26
            cn.jiguang.am.a r2 = (cn.jiguang.am.a) r2     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L41
            boolean r0 = r2 instanceof cn.jiguang.ap.f     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L41
            r0 = r2
            cn.jiguang.ap.f r0 = (cn.jiguang.ap.f) r0     // Catch: java.lang.Throwable -> L26
            r0.a(r3)     // Catch: java.lang.Throwable -> L26
            r1.a(r2)     // Catch: java.lang.Throwable -> L26
            return
        L26:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "tcpLoginEnd wrong:"
            r3.append(r0)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "NetMoniterManager"
            cn.jiguang.w.f.c(r3, r2)
        L41:
            return
    }

    public void g(java.lang.String r2, int r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f582b
            boolean r0 = r0.get()
            if (r0 == 0) goto L41
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L41
            java.util.concurrent.ConcurrentHashMap<java.lang.String, cn.jiguang.am.a> r0 = r1.a     // Catch: java.lang.Throwable -> L26
            java.lang.Object r2 = r0.remove(r2)     // Catch: java.lang.Throwable -> L26
            cn.jiguang.am.a r2 = (cn.jiguang.am.a) r2     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L41
            boolean r0 = r2 instanceof cn.jiguang.ap.h     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L41
            r0 = r2
            cn.jiguang.ap.h r0 = (cn.jiguang.ap.h) r0     // Catch: java.lang.Throwable -> L26
            r0.a(r3)     // Catch: java.lang.Throwable -> L26
            r1.a(r2)     // Catch: java.lang.Throwable -> L26
            return
        L26:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "tcpReportEnd wrong:"
            r3.append(r0)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "NetMoniterManager"
            cn.jiguang.w.f.c(r3, r2)
        L41:
            return
    }
}
