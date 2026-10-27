package cn.jiguang.aj;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class g {
    private volatile cn.jiguang.ak.i a;

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.Object f503b;

    static final class a {
        private final cn.jiguang.ak.i a;

        /* renamed from: b, reason: collision with root package name */
        private final cn.jiguang.ak.i f504b;

        public a(cn.jiguang.ak.i r1, cn.jiguang.ak.i r2) {
                r0 = this;
                r0.<init>()
                r0.f504b = r1
                r0.a = r2
                return
        }
    }

    public g() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f503b = r0
            return
    }

    public cn.jiguang.ak.i a() {
            r2 = this;
            java.lang.Object r0 = r2.f503b
            monitor-enter(r0)
            cn.jiguang.ak.i r1 = r2.a     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L10
            cn.jiguang.ak.i r1 = r2.a     // Catch: java.lang.Throwable -> Le
            cn.jiguang.ak.i r1 = r1.j()     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            goto L13
        L10:
            r1 = 0
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    public cn.jiguang.aj.g.a b() {
            r4 = this;
            java.lang.Object r0 = r4.f503b
            monitor-enter(r0)
            cn.jiguang.ak.i r1 = r4.a     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto Lf
            cn.jiguang.ak.i r1 = r4.a     // Catch: java.lang.Throwable -> Ld
            r1.i()     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r1 = move-exception
            goto L2d
        Lf:
            cn.jiguang.ak.i r1 = r4.a     // Catch: java.lang.Throwable -> Ld
            cn.jiguang.ak.i r2 = new cn.jiguang.ak.i     // Catch: java.lang.Throwable -> Ld
            r2.<init>()     // Catch: java.lang.Throwable -> Ld
            r4.a = r2     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto L1f
            cn.jiguang.ak.i r1 = r1.j()     // Catch: java.lang.Throwable -> Ld
            goto L20
        L1f:
            r1 = 0
        L20:
            cn.jiguang.aj.g$a r2 = new cn.jiguang.aj.g$a     // Catch: java.lang.Throwable -> Ld
            cn.jiguang.ak.i r3 = r4.a     // Catch: java.lang.Throwable -> Ld
            cn.jiguang.ak.i r3 = r3.j()     // Catch: java.lang.Throwable -> Ld
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r2
        L2d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }
}
