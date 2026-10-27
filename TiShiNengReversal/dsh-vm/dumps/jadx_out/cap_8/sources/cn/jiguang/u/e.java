package cn.jiguang.u;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class e {
    public static final java.lang.String a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f1457b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f1458c = null;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f1459d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f1460e = null;

    /* renamed from: f, reason: collision with root package name */
    private static android.content.SharedPreferences f1461f;

    static {
            r0 = 10
            byte[] r0 = new byte[r0]
            r0 = {x003e: FILL_ARRAY_DATA , data: [63, 85, 88, 109, 75, 121, 127, 86, 73, 126} // fill-array
            java.lang.String r0 = cn.jiguang.s.a.b(r0)
            cn.jiguang.u.e.a = r0
            r0 = 4
            byte[] r0 = new byte[r0]
            r0 = {x0048: FILL_ARRAY_DATA , data: [116, 72, 84, 52} // fill-array
            java.lang.String r0 = cn.jiguang.s.a.b(r0)
            cn.jiguang.u.e.f1457b = r0
            r0 = 16
            byte[] r1 = new byte[r0]
            r1 = {x004e: FILL_ARRAY_DATA , data: [32, 2, 69, 45, 61, 32, 38, 87, 25, 40, 99, 37, 37, 66, 22, 46} // fill-array
            java.lang.String r1 = cn.jiguang.s.a.b(r1)
            cn.jiguang.u.e.f1458c = r1
            byte[] r1 = new byte[r0]
            r1 = {x005a: FILL_ARRAY_DATA , data: [33, 1, 16, 43, 56, 37, 33, 4, 16, 44, 56, 32, 33, 7, 16, 33} // fill-array
            java.lang.String r1 = cn.jiguang.s.a.b(r1)
            cn.jiguang.u.e.f1459d = r1
            byte[] r0 = new byte[r0]
            r0 = {x0066: FILL_ARRAY_DATA , data: [85, 118, 97, 33, 60, 84, 32, 0, 98, 46, 73, 85, 85, 116, 18, 44} // fill-array
            java.lang.String r0 = cn.jiguang.s.a.b(r0)
            cn.jiguang.u.e.f1460e = r0
            return
    }

    public e() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r2, int r3, java.lang.String r4) {
            android.content.SharedPreferences r0 = cn.jiguang.u.e.f1461f
            if (r0 != 0) goto Ld
            java.lang.String r0 = cn.jiguang.u.e.a
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            cn.jiguang.u.e.f1461f = r2
        Ld:
            android.content.SharedPreferences r2 = cn.jiguang.u.e.f1461f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = cn.jiguang.u.e.f1457b
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = "-"
            r0.append(r4)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r4 = ""
            java.lang.String r2 = r2.getString(r3, r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "g1:"
            r3.append(r0)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "JC"
            cn.jiguang.t.b.b(r0, r3)
            boolean r3 = r4.equals(r2)
            if (r3 != 0) goto L5e
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Exception -> L59
            java.lang.String r4 = cn.jiguang.u.e.f1458c     // Catch: java.lang.Exception -> L59
            java.lang.String r1 = cn.jiguang.u.e.f1459d     // Catch: java.lang.Exception -> L59
            byte[] r4 = cn.jiguang.u.i.a(r2, r4, r1)     // Catch: java.lang.Exception -> L59
            r3.<init>(r4)     // Catch: java.lang.Exception -> L59
            r2 = r3
            goto L5e
        L59:
            java.lang.String r3 = "decrypt plugin failed"
            cn.jiguang.t.b.b(r0, r3)
        L5e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "g2:"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            cn.jiguang.t.b.b(r0, r3)
            return r2
    }

    public static void a(android.content.Context r9, int r10, java.lang.String r11, java.lang.String r12, boolean r13) {
            java.lang.String r7 = "JC"
            if (r13 == 0) goto L1a
            cn.jiguang.q.c r0 = cn.jiguang.q.c.a()
            int r3 = r0.a(r9, r10)
            cn.jiguang.dy.c r0 = cn.jiguang.dy.c.a()
            cn.jiguang.r.a r4 = cn.jiguang.r.a.f1434j
            r5 = 0
            r6 = 0
            r1 = r9
            r2 = r10
            r0.a(r1, r2, r3, r4, r5, r6)
            goto L1b
        L1a:
            r3 = -1
        L1b:
            android.content.SharedPreferences r0 = cn.jiguang.u.e.f1461f
            if (r0 != 0) goto L28
            java.lang.String r0 = cn.jiguang.u.e.a
            r2 = 0
            android.content.SharedPreferences r0 = r9.getSharedPreferences(r0, r2)
            cn.jiguang.u.e.f1461f = r0
        L28:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61
            r0.<init>()     // Catch: java.lang.Throwable -> L61
            java.lang.String r2 = "s1:"
            r0.append(r2)     // Catch: java.lang.Throwable -> L61
            r0.append(r12)     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L61
            cn.jiguang.t.b.b(r7, r0)     // Catch: java.lang.Throwable -> L61
            byte[] r0 = r12.getBytes()     // Catch: java.lang.Throwable -> L61
            java.lang.String r4 = cn.jiguang.u.e.f1458c     // Catch: java.lang.Throwable -> L61
            java.lang.String r5 = cn.jiguang.u.e.f1459d     // Catch: java.lang.Throwable -> L61
            java.lang.String r2 = cn.jiguang.u.i.a(r0, r4, r5)     // Catch: java.lang.Throwable -> L61
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e
            r0.<init>()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = "s2:"
            r0.append(r4)     // Catch: java.lang.Throwable -> L5e
            r0.append(r2)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L5e
            cn.jiguang.t.b.b(r7, r0)     // Catch: java.lang.Throwable -> L5e
            r8 = r2
            goto L8e
        L5e:
            r0 = move-exception
            r8 = r2
            goto L63
        L61:
            r0 = move-exception
            r8 = r12
        L63:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "aesEncrypt error , msg :"
            r2.append(r4)
            java.lang.String r4 = r0.getMessage()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            cn.jiguang.t.b.g(r7, r2)
            if (r13 == 0) goto L8e
            r2 = r0
            cn.jiguang.dy.c r0 = cn.jiguang.dy.c.a()
            cn.jiguang.r.a r4 = cn.jiguang.r.a.f1434j
            r5 = 2
            java.lang.String r6 = r2.getMessage()
            r1 = r9
            r2 = r10
            r0.a(r1, r2, r3, r4, r5, r6)
        L8e:
            android.content.SharedPreferences r0 = cn.jiguang.u.e.f1461f
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = cn.jiguang.u.e.f1457b
            r1.append(r4)
            r1.append(r11)
            java.lang.String r4 = "-"
            r1.append(r4)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r0.putString(r1, r8)
            r0.commit()
            if (r13 == 0) goto Lcb
            cn.jiguang.dy.c r0 = cn.jiguang.dy.c.a()
            cn.jiguang.r.a r4 = cn.jiguang.r.a.f1434j
            r5 = 1
            r6 = 0
            r1 = r9
            r2 = r10
            r0.a(r1, r2, r3, r4, r5, r6)
            cn.jiguang.dy.c r0 = cn.jiguang.dy.c.a()
            cn.jiguang.r.a r4 = cn.jiguang.r.a.f1430f
            r0.a(r1, r2, r3, r4, r5, r6)
        Lcb:
            return
    }
}
