package cn.jiguang.ad;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class f {
    private android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    private cn.jiguang.ah.a f387b;

    /* renamed from: c, reason: collision with root package name */
    private long f388c;


    private static final class a {
        private static final cn.jiguang.ad.f a = null;

        static {
                cn.jiguang.ad.f r0 = new cn.jiguang.ad.f
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.ad.f.a.a = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.ad.f a() {
                cn.jiguang.ad.f r0 = cn.jiguang.ad.f.a.a
                return r0
        }
    }

    private f() {
            r1 = this;
            r1.<init>()
            cn.jiguang.ad.f$1 r0 = new cn.jiguang.ad.f$1
            r0.<init>(r1)
            r1.f387b = r0
            android.content.Context r0 = cn.jiguang.av.c.a()
            r1.a = r0
            return
    }

    /* synthetic */ f(cn.jiguang.ad.f.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ android.content.Context a(cn.jiguang.ad.f r0) {
            android.content.Context r0 = r0.a
            return r0
    }

    public static cn.jiguang.ad.f a() {
            cn.jiguang.ad.f r0 = cn.jiguang.ad.f.a.a()
            return r0
    }

    static /* synthetic */ void a(cn.jiguang.ad.f r0, android.content.Context r1) {
            r0.c(r1)
            return
    }

    private void b(android.content.Context r3) {
            r2 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.f388c = r0
            cn.jiguang.e.a r0 = cn.jiguang.e.a.aq()
            java.lang.Object r0 = cn.jiguang.e.b.a(r3, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1a
            cn.jiguang.ad.a.a(r3)
            return
        L1a:
            cn.jiguang.ad.a.b(r3)
            return
    }

    private void c(android.content.Context r6) {
            r5 = this;
            java.lang.String r0 = "periodTask..."
            java.lang.String r1 = "PeriodWorker"
            cn.jiguang.w.f.c(r1, r0)
            boolean r0 = cn.jiguang.v.h.b()
            if (r0 == 0) goto L13
            java.lang.String r6 = "[key-step]Your sdk is disabled already, no receiver task can be handled."
            cn.jiguang.w.f.d(r1, r6)
            return
        L13:
            r5.b(r6)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "force"
            r2 = 0
            r0.putBoolean(r1, r2)
            java.lang.String r1 = "delay_time"
            r3 = 0
            r0.putLong(r1, r3)
            r5.a(r6, r2)
            cn.jiguang.ad.g r1 = cn.jiguang.ad.g.a()
            r1.a(r0)
            cn.jiguang.ad.b r0 = cn.jiguang.ad.b.a()
            r1 = 19
            java.lang.String r3 = "periodTask"
            r0.a(r6, r1, r2, r3)
            java.lang.String r0 = "periodtask"
            r1 = 0
            cn.jiguang.i.a.a(r6, r0, r1)
            return
    }

    public void a(android.content.Context r5) {
            r4 = this;
            android.content.Context r5 = cn.jiguang.av.c.a(r5)
            r4.a = r5
            cn.jiguang.ah.b r5 = cn.jiguang.ah.b.a()
            cn.jiguang.ad.g r0 = cn.jiguang.ad.g.a()
            int r0 = r0.f()
            int r0 = r0 * 1000
            long r0 = (long) r0
            cn.jiguang.ah.a r2 = r4.f387b
            r3 = 8000(0x1f40, float:1.121E-41)
            r5.a(r3, r0, r2)
            return
    }

    public void a(android.content.Context r9, boolean r10) {
            r8 = this;
            java.lang.String r0 = "PeriodWorker resume"
            java.lang.String r1 = "PeriodWorker"
            cn.jiguang.w.f.f(r1, r0)
            long r2 = r8.f388c
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L33
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r8.f388c
            cn.jiguang.ad.g r0 = cn.jiguang.ad.g.a()
            int r0 = r0.f()
            int r0 = r0 + 5
            int r0 = r0 * 1000
            long r6 = (long) r0
            long r4 = r4 + r6
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L33
            java.lang.String r10 = "schedule time is expired, execute now"
            cn.jiguang.w.f.f(r1, r10)
            r8.a(r9)
            r8.c(r9)
            return
        L33:
            if (r10 == 0) goto L3c
            r8.a(r9)
            r8.b(r9)
            return
        L3c:
            java.lang.String r9 = "need not change period task"
            cn.jiguang.w.f.c(r1, r9)
            return
    }

    public void b() {
            r5 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            r5.f388c = r0
            android.content.Context r0 = r5.a
            cn.jiguang.ad.a.a(r0)
            cn.jiguang.ah.b r0 = cn.jiguang.ah.b.a()
            cn.jiguang.ad.g r1 = cn.jiguang.ad.g.a()
            int r1 = r1.f()
            int r1 = r1 * 1000
            long r1 = (long) r1
            cn.jiguang.ah.a r3 = r5.f387b
            r4 = 8000(0x1f40, float:1.121E-41)
            r0.a(r4, r1, r3)
            return
    }
}
