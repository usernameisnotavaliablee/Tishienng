package cn.jiguang.commons.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class m {
    private static java.util.LinkedHashSet<cn.jiguang.commons.j.c> bs;

    /* renamed from: c, reason: collision with root package name */
    static cn.jiguang.commons.v.a f1161c;

    static {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            cn.jiguang.commons.j.m.bs = r0
            cn.jiguang.commons.v.c r0 = new cn.jiguang.commons.v.c
            r0.<init>()
            cn.jiguang.commons.j.m.f1161c = r0
            return
    }

    public m() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(cn.jiguang.commons.j.c r1) {
            java.util.LinkedHashSet<cn.jiguang.commons.j.c> r0 = cn.jiguang.commons.j.m.bs
            r0.add(r1)
            return
    }

    public static void b(android.os.Bundle r2) {
            java.util.LinkedHashSet<cn.jiguang.commons.j.c> r0 = cn.jiguang.commons.j.m.bs
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            cn.jiguang.commons.j.c r1 = (cn.jiguang.commons.j.c) r1
            if (r1 == 0) goto L6
            r1.c(r2)
            goto L6
        L18:
            return
    }

    public static java.lang.Object e(int r6, java.lang.String r7, android.os.Bundle r8, java.lang.Object... r9) {
            cn.jiguang.commons.v.a r0 = cn.jiguang.commons.j.m.f1161c
            r1 = 0
            r2 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            java.lang.Object r6 = r0.a(r1, r2, r3, r4, r5)
            return r6
    }

    public static java.lang.Object e(android.content.Context r6, int r7, java.lang.String r8, android.os.Bundle r9, java.lang.Object... r10) {
            cn.jiguang.commons.v.a r0 = cn.jiguang.commons.j.m.f1161c
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            java.lang.Object r6 = r0.a(r1, r2, r3, r4, r5)
            return r6
    }

    public static void e(org.json.JSONObject r2) {
            java.util.LinkedHashSet<cn.jiguang.commons.j.c> r0 = cn.jiguang.commons.j.m.bs     // Catch: java.lang.Exception -> L18
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L18
        L6:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> L18
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> L18
            cn.jiguang.commons.j.c r1 = (cn.jiguang.commons.j.c) r1     // Catch: java.lang.Exception -> L18
            if (r1 == 0) goto L6
            r1.r(r2)     // Catch: java.lang.Exception -> L18
            goto L6
        L18:
            return
    }
}
