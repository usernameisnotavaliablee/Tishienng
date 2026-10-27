package cn.jiguang.ae;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {
    private static int a;

    /* renamed from: b, reason: collision with root package name */
    private final java.util.Map<java.lang.String, java.lang.Integer> f426b;

    /* renamed from: cn.jiguang.ae.c$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static final class a {
        private static final cn.jiguang.ae.c a = null;

        static {
                cn.jiguang.ae.c r0 = new cn.jiguang.ae.c
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.ae.c.a.a = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.ae.c a() {
                cn.jiguang.ae.c r0 = cn.jiguang.ae.c.a.a
                return r0
        }
    }

    static {
            return
    }

    private c() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f426b = r0
            return
    }

    /* synthetic */ c(cn.jiguang.ae.c.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static cn.jiguang.ae.c a() {
            cn.jiguang.ae.c r0 = cn.jiguang.ae.c.a.a()
            return r0
    }

    public static void a(int r1) {
            r0 = 3
            if (r1 > r0) goto L7
            if (r1 < 0) goto L7
            cn.jiguang.ae.c.a = r1
        L7:
            return
    }

    public void a(android.content.Context r7, int r8) {
            r6 = this;
            java.lang.String r0 = cn.jiguang.av.n.a(r7)
            java.lang.String r1 = "wifi"
            boolean r1 = r1.equals(r0)
            r2 = 0
            if (r1 == 0) goto L17
            cn.jiguang.av.a r3 = cn.jiguang.av.a.a()
            java.lang.String r3 = r3.b(r7, r2)
            goto L19
        L17:
            java.lang.String r3 = ""
        L19:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto L21
            if (r4 != 0) goto L39
        L21:
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r6.f426b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r5.append(r3)
            java.lang.String r0 = r5.toString()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r1.put(r0, r5)
        L39:
            if (r4 != 0) goto L4f
            cn.jiguang.e.a r0 = cn.jiguang.e.a.h(r3)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            cn.jiguang.e.a r8 = r0.a(r8)
            r0 = 1
            cn.jiguang.e.a[] r0 = new cn.jiguang.e.a[r0]
            r0[r2] = r8
            cn.jiguang.e.b.a(r7, r0)
        L4f:
            return
    }

    public int b(int r4) {
            r3 = this;
            int r0 = cn.jiguang.ae.c.a
            r1 = 2
            if (r0 == r1) goto L10
            r2 = 1
            if (r0 != r2) goto L9
            goto L10
        L9:
            if (r4 == r2) goto Lf
            if (r4 == r1) goto Le
            goto L10
        Le:
            return r1
        Lf:
            return r2
        L10:
            return r0
    }
}
