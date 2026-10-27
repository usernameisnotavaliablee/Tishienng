package cn.jiguang.m;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d extends cn.jiguang.h.a {
    private android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    private cn.jiguang.n.a f1330b;

    /* renamed from: cn.jiguang.m.d$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static final class a {
        private static final cn.jiguang.m.d a = null;

        static {
                cn.jiguang.m.d r0 = new cn.jiguang.m.d
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.m.d.a.a = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.m.d a() {
                cn.jiguang.m.d r0 = cn.jiguang.m.d.a.a
                return r0
        }
    }

    private d() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ d(cn.jiguang.m.d.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static cn.jiguang.m.d d() {
            cn.jiguang.m.d r0 = cn.jiguang.m.d.a.a()
            return r0
    }

    @Override // cn.jiguang.h.a
    protected java.lang.String b(android.content.Context r1) {
            r0 = this;
            r0.a = r1
            r1 = 1
            cn.jiguang.p.g.a = r1
            java.lang.String r1 = "JWakeReport"
            return r1
    }

    @Override // cn.jiguang.h.a
    protected boolean b(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // cn.jiguang.h.a
    protected boolean c(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            boolean r1 = cn.jiguang.h.b.a(r1, r2)
            return r1
    }

    @Override // cn.jiguang.h.a
    protected void d(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            cn.jiguang.n.a r0 = cn.jiguang.p.b.b(r2)
            r1.f1330b = r0
            super.d(r2, r3)
            return
    }

    @Override // cn.jiguang.h.a
    protected void e(android.content.Context r6, java.lang.String r7) {
            r5 = this;
            cn.jiguang.n.a r0 = r5.f1330b
            boolean r0 = r0.w
            r1 = 1
            java.lang.String r2 = "JWakeReport"
            if (r0 == 0) goto L3d
            org.json.JSONArray r0 = cn.jiguang.p.c.b(r6)
            if (r0 == 0) goto L37
            int r3 = r0.length()
            if (r3 != 0) goto L16
            goto L37
        L16:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "report wakeData:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            cn.jiguang.w.f.c(r2, r3)
            cn.jiguang.y.g.a(r6, r0)
            cn.jiguang.p.c.c(r6)
            cn.jiguang.h.b.b(r6, r1)
            super.e(r6, r7)
            goto L42
        L37:
            java.lang.String r0 = "no report wakeData"
            cn.jiguang.w.f.c(r2, r0)
            goto L42
        L3d:
            java.lang.String r0 = "server set do not report wake data."
            cn.jiguang.w.f.i(r2, r0)
        L42:
            cn.jiguang.n.a r0 = r5.f1330b
            boolean r0 = r0.x
            if (r0 == 0) goto L7c
            org.json.JSONArray r0 = cn.jiguang.p.g.a(r6)
            if (r0 == 0) goto L76
            int r3 = r0.length()
            if (r3 != 0) goto L55
            goto L76
        L55:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "report wakedData:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            cn.jiguang.w.f.c(r2, r3)
            cn.jiguang.y.g.a(r6, r0)
            cn.jiguang.p.g.b(r6)
            cn.jiguang.h.b.b(r6, r1)
            super.e(r6, r7)
            return
        L76:
            java.lang.String r6 = "no report wakedData"
            cn.jiguang.w.f.c(r2, r6)
            return
        L7c:
            java.lang.String r6 = "server set do not report waked data."
            cn.jiguang.w.f.i(r2, r6)
            return
    }
}
