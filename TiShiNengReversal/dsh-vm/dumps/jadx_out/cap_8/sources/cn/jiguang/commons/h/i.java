package cn.jiguang.commons.h;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class i {
    private final java.util.concurrent.atomic.AtomicReference a;

    /* renamed from: c, reason: collision with root package name */
    private final cn.jiguang.commons.h.j f1137c;

    class a implements cn.jiguang.commons.h.j.k {
        final /* synthetic */ cn.jiguang.commons.h.i a;

        a(cn.jiguang.commons.h.i r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // cn.jiguang.commons.h.j.k
        public void a() {
                r1 = this;
                cn.jiguang.commons.h.i r0 = r1.a
                cn.jiguang.commons.h.i.d(r0)
                return
        }

        @Override // cn.jiguang.commons.h.j.k
        public void a(long r1) {
                r0 = this;
                cn.jiguang.commons.w.a.c()
                cn.jiguang.commons.h.i r1 = r0.a
                cn.jiguang.commons.h.i.a(r1)
                return
        }

        @Override // cn.jiguang.commons.h.j.k
        public void a(java.lang.String r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "data collection scheduler error:"
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.lang.String r0 = "DataCollectionScheduler"
                cn.jiguang.commons.w.a.c(r0, r3)
                return
        }

        @Override // cn.jiguang.commons.h.j.k
        public void c() {
                r1 = this;
                cn.jiguang.commons.h.i r0 = r1.a
                cn.jiguang.commons.h.i.c(r0)
                return
        }
    }

    class b implements cn.jiguang.commons.f.f {
        final /* synthetic */ cn.jiguang.commons.h.i a;

        b(cn.jiguang.commons.h.i r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(cn.jiguang.commons.c.n r4) {
                r3 = this;
                java.lang.String r4 = "config ready, executing data collection"
                java.lang.String r0 = "DataCollectionScheduler"
                cn.jiguang.commons.w.a.a(r0, r4)
                cn.jiguang.commons.D.a r4 = cn.jiguang.commons.D.a.c()     // Catch: java.lang.Exception -> Lf
                r4.a()     // Catch: java.lang.Exception -> Lf
                return
            Lf:
                r4 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "error executing topic after config completion:"
                r1.append(r2)
                java.lang.String r2 = r4.getMessage()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                cn.jiguang.commons.w.a.a(r0, r1, r4)
                return
        }

        @Override // cn.jiguang.commons.f.f
        public /* bridge */ /* synthetic */ void a(java.lang.Object r1) {
                r0 = this;
                cn.jiguang.commons.c.n r1 = (cn.jiguang.commons.c.n) r1
                r0.a(r1)
                return
        }
    }

    private static final class c {
        private static final cn.jiguang.commons.h.i a = null;

        static {
                cn.jiguang.commons.h.i r0 = new cn.jiguang.commons.h.i
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.commons.h.i.c.a = r0
                return
        }

        public c() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.commons.h.i a() {
                cn.jiguang.commons.h.i r0 = cn.jiguang.commons.h.i.c.a
                return r0
        }
    }

    public enum e extends java.lang.Enum {
        public static final cn.jiguang.commons.h.i.e a = null;

        /* renamed from: c, reason: collision with root package name */
        public static final cn.jiguang.commons.h.i.e f1138c = null;

        /* renamed from: d, reason: collision with root package name */
        public static final cn.jiguang.commons.h.i.e f1139d = null;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ cn.jiguang.commons.h.i.e[] f1140e = null;

        static {
                cn.jiguang.commons.h.i$e r0 = new cn.jiguang.commons.h.i$e
                java.lang.String r1 = "STOPPED"
                r2 = 0
                r0.<init>(r1, r2)
                cn.jiguang.commons.h.i.e.a = r0
                cn.jiguang.commons.h.i$e r0 = new cn.jiguang.commons.h.i$e
                java.lang.String r1 = "RUNNING"
                r2 = 1
                r0.<init>(r1, r2)
                cn.jiguang.commons.h.i.e.f1138c = r0
                cn.jiguang.commons.h.i$e r0 = new cn.jiguang.commons.h.i$e
                java.lang.String r1 = "ERROR"
                r2 = 2
                r0.<init>(r1, r2)
                cn.jiguang.commons.h.i.e.f1139d = r0
                cn.jiguang.commons.h.i$e[] r0 = a()
                cn.jiguang.commons.h.i.e.f1140e = r0
                return
        }

        e(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private static /* synthetic */ cn.jiguang.commons.h.i.e[] a() {
                r0 = 3
                cn.jiguang.commons.h.i$e[] r0 = new cn.jiguang.commons.h.i.e[r0]
                cn.jiguang.commons.h.i$e r1 = cn.jiguang.commons.h.i.e.a
                r2 = 0
                r0[r2] = r1
                cn.jiguang.commons.h.i$e r1 = cn.jiguang.commons.h.i.e.f1138c
                r2 = 1
                r0[r2] = r1
                cn.jiguang.commons.h.i$e r1 = cn.jiguang.commons.h.i.e.f1139d
                r2 = 2
                r0[r2] = r1
                return r0
        }

        public static cn.jiguang.commons.h.i.e valueOf(java.lang.String r1) {
                java.lang.Class<cn.jiguang.commons.h.i$e> r0 = cn.jiguang.commons.h.i.e.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                cn.jiguang.commons.h.i$e r1 = (cn.jiguang.commons.h.i.e) r1
                return r1
        }

        public static cn.jiguang.commons.h.i.e[] values() {
                cn.jiguang.commons.h.i$e[] r0 = cn.jiguang.commons.h.i.e.f1140e
                java.lang.Object r0 = r0.clone()
                cn.jiguang.commons.h.i$e[] r0 = (cn.jiguang.commons.h.i.e[]) r0
                return r0
        }
    }

    private i() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            cn.jiguang.commons.h.i$e r1 = cn.jiguang.commons.h.i.e.a
            r0.<init>(r1)
            r2.a = r0
            cn.jiguang.commons.h.j r0 = r2.a()
            r2.f1137c = r0
            r2.h()
            java.lang.String r0 = "DataCollectionScheduler"
            java.lang.String r1 = "datacollectionscheduler initialized:285000ms"
            cn.jiguang.commons.w.a.a(r0, r1)
            return
    }

    /* synthetic */ i(cn.jiguang.commons.h.i.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    private cn.jiguang.commons.h.j a() {
            r4 = this;
            cn.jiguang.commons.h.j r0 = new cn.jiguang.commons.h.j
            r1 = 285000(0x45948, double:1.408087E-318)
            r3 = 0
            r0.<init>(r1, r3)
            return r0
    }

    private void a(cn.jiguang.commons.h.i.e r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r3.a
            java.lang.Object r0 = r0.getAndSet(r4)
            cn.jiguang.commons.h.i$e r0 = (cn.jiguang.commons.h.i.e) r0
            if (r0 == r4) goto L28
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "scheduler state changed:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " to "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r0 = "DataCollectionScheduler"
            cn.jiguang.commons.w.a.a(r0, r4)
        L28:
            return
    }

    static /* synthetic */ void a(cn.jiguang.commons.h.i r0) {
            r0.g()
            return
    }

    public static cn.jiguang.commons.h.i c() {
            cn.jiguang.commons.h.i r0 = cn.jiguang.commons.h.i.c.a()
            return r0
    }

    static /* synthetic */ void c(cn.jiguang.commons.h.i r0) {
            r0.d()
            return
    }

    private void d() {
            r2 = this;
            java.lang.String r0 = "DataCollectionScheduler"
            java.lang.String r1 = "data collection scheduler started"
            cn.jiguang.commons.w.a.a(r0, r1)
            cn.jiguang.commons.h.i$e r0 = cn.jiguang.commons.h.i.e.f1138c
            r2.a(r0)
            return
    }

    static /* synthetic */ void d(cn.jiguang.commons.h.i r0) {
            r0.e()
            return
    }

    private void e() {
            r2 = this;
            java.lang.String r0 = "DataCollectionScheduler"
            java.lang.String r1 = "data collection scheduler stopped"
            cn.jiguang.commons.w.a.a(r0, r1)
            cn.jiguang.commons.h.i$e r0 = cn.jiguang.commons.h.i.e.a
            r2.a(r0)
            return
    }

    private void g() {
            r4 = this;
            java.lang.String r0 = "performing scheduled task"
            java.lang.String r1 = "DataCollectionScheduler"
            cn.jiguang.commons.w.a.a(r1, r0)
            cn.jiguang.commons.f.j r0 = cn.jiguang.commons.f.j.j()     // Catch: java.lang.Exception -> L14
            cn.jiguang.commons.h.i$b r2 = new cn.jiguang.commons.h.i$b     // Catch: java.lang.Exception -> L14
            r2.<init>(r4)     // Catch: java.lang.Exception -> L14
            r0.c(r2)     // Catch: java.lang.Exception -> L14
            return
        L14:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "error in scheduled task:"
            r2.append(r3)
            java.lang.String r3 = r0.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            cn.jiguang.commons.w.a.a(r1, r2, r0)
            return
    }

    private void h() {
            r2 = this;
            cn.jiguang.commons.h.j r0 = r2.f1137c
            cn.jiguang.commons.h.i$a r1 = new cn.jiguang.commons.h.i$a
            r1.<init>(r2)
            r0.a(r1)
            return
    }

    public boolean f() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.a
            java.lang.Object r0 = r0.get()
            cn.jiguang.commons.h.i$e r1 = cn.jiguang.commons.h.i.e.f1138c
            if (r0 != r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public void i() {
            r4 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r4.a
            java.lang.Object r0 = r0.get()
            cn.jiguang.commons.h.i$e r0 = (cn.jiguang.commons.h.i.e) r0
            cn.jiguang.commons.h.i$e r1 = cn.jiguang.commons.h.i.e.f1138c
            java.lang.String r2 = "DataCollectionScheduler"
            if (r0 != r1) goto L14
            java.lang.String r0 = "data collection scheduler already running"
            cn.jiguang.commons.w.a.a(r2, r0)
            return
        L14:
            java.util.concurrent.atomic.AtomicReference r3 = r4.a
            boolean r0 = androidx.camera.view.p.a(r3, r0, r1)
            if (r0 == 0) goto L27
            java.lang.String r0 = "starting data collection scheduler"
            cn.jiguang.commons.w.a.a(r2, r0)
            cn.jiguang.commons.h.j r0 = r4.f1137c
            r0.f()
            return
        L27:
            java.lang.String r0 = "failed to start scheduler, state changed"
            cn.jiguang.commons.w.a.a(r2, r0)
            return
    }

    public void j() {
            r4 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r4.a
            java.lang.Object r0 = r0.get()
            cn.jiguang.commons.h.i$e r0 = (cn.jiguang.commons.h.i.e) r0
            cn.jiguang.commons.h.i$e r1 = cn.jiguang.commons.h.i.e.a
            java.lang.String r2 = "DataCollectionScheduler"
            if (r0 != r1) goto L14
            java.lang.String r0 = "data collection scheduler already stopped"
            cn.jiguang.commons.w.a.a(r2, r0)
            return
        L14:
            java.util.concurrent.atomic.AtomicReference r3 = r4.a
            boolean r0 = androidx.camera.view.p.a(r3, r0, r1)
            if (r0 == 0) goto L27
            java.lang.String r0 = "stopping data collection scheduler"
            cn.jiguang.commons.w.a.a(r2, r0)
            cn.jiguang.commons.h.j r0 = r4.f1137c
            r0.h()
            return
        L27:
            java.lang.String r0 = "failed to stop scheduler, state changed"
            cn.jiguang.commons.w.a.a(r2, r0)
            return
    }
}
