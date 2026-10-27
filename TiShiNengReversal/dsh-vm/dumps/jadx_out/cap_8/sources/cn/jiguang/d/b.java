package cn.jiguang.d;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    private static volatile java.lang.Long a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile java.lang.Long f1249b;

    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static long a(android.content.Context r2, long r3) {
            long r0 = c(r2)
            long r3 = r3 + r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r0
            return r3
    }

    public static boolean a(android.content.Context r7) {
            cn.jiguang.e.a r0 = cn.jiguang.e.a.M()
            java.lang.Object r0 = cn.jiguang.e.b.a(r7, r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r2 = 0
            r4 = 0
            java.lang.String r5 = "SpHelper"
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 > 0) goto L1d
            java.lang.String r7 = "isValidRegistered uid <= 0"
        L19:
            cn.jiguang.w.f.a(r5, r7)
            return r4
        L1d:
            cn.jiguang.e.a r0 = cn.jiguang.e.a.N()
            java.lang.Object r7 = cn.jiguang.e.b.a(r7, r0)
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L30
            java.lang.String r7 = "isValidRegistered regId is empty"
            goto L19
        L30:
            r7 = 1
            return r7
    }

    public static long b(android.content.Context r2) {
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = a(r2, r0)
            return r0
    }

    public static void b(android.content.Context r3, long r4) {
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L3a
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            cn.jiguang.d.b.a = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            cn.jiguang.d.b.f1249b = r2
            cn.jiguang.e.a r2 = cn.jiguang.e.a.T()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            cn.jiguang.e.a r4 = r2.a(r4)
            cn.jiguang.e.a r5 = cn.jiguang.e.a.S()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            cn.jiguang.e.a r5 = r5.a(r0)
            r0 = 2
            cn.jiguang.e.a[] r0 = new cn.jiguang.e.a[r0]
            r1 = 0
            r0[r1] = r4
            r4 = 1
            r0[r4] = r5
            cn.jiguang.e.b.a(r3, r0)
        L3a:
            return
    }

    public static long c(android.content.Context r8) {
            java.lang.Long r0 = cn.jiguang.d.b.a
            if (r0 == 0) goto L16
            java.lang.Long r0 = cn.jiguang.d.b.f1249b
            if (r0 == 0) goto L16
            java.lang.Long r8 = cn.jiguang.d.b.a
            long r0 = r8.longValue()
            java.lang.Long r8 = cn.jiguang.d.b.f1249b
            long r2 = r8.longValue()
            long r0 = r0 - r2
            return r0
        L16:
            cn.jiguang.e.a r0 = cn.jiguang.e.a.S()
            java.lang.Object r0 = cn.jiguang.e.b.a(r8, r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r1 = r0.longValue()
            cn.jiguang.e.a r3 = cn.jiguang.e.a.T()
            java.lang.Object r8 = cn.jiguang.e.b.a(r8, r3)
            java.lang.Long r8 = (java.lang.Long) r8
            long r3 = r8.longValue()
            r5 = 0
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L43
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L3d
            goto L43
        L3d:
            cn.jiguang.d.b.a = r8
            cn.jiguang.d.b.f1249b = r0
            long r3 = r3 - r1
            return r3
        L43:
            return r5
    }
}
