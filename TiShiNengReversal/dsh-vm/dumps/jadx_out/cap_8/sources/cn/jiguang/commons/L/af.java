package cn.jiguang.commons.L;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class af {
    public af() {
            r1 = this;
            r1.<init>()
            return
    }

    private static long a(java.util.List r5, java.lang.String r6) {
            r0 = 0
            if (r5 == 0) goto L36
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto Lb
            goto L36
        Lb:
            java.util.Iterator r5 = r5.iterator()
        Lf:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r5.next()
            cn.jiguang.commons.c.l r2 = (cn.jiguang.commons.c.l) r2
            java.lang.String r3 = r2.f1060e     // Catch: java.lang.Throwable -> L34
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L34
            if (r3 == 0) goto L24
            goto Lf
        L24:
            java.lang.String r3 = r2.f1060e     // Catch: java.lang.Throwable -> L34
            boolean r3 = r3.contains(r6)     // Catch: java.lang.Throwable -> L34
            if (r3 == 0) goto Lf
            long r2 = r2.f1063h     // Catch: java.lang.Throwable -> L34
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto Lf
            r0 = r2
            goto Lf
        L34:
            goto Lf
        L36:
            return r0
    }

    public static java.util.HashMap a() {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            cn.jiguang.commons.g.n r1 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Throwable -> Lc7
            r2 = 1100(0x44c, float:1.541E-42)
            r3 = 0
            java.util.List r1 = r1.c(r2, r3)     // Catch: java.lang.Throwable -> Lc7
            if (r1 == 0) goto Lc7
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> Lc7
            if (r2 == 0) goto L1a
            goto Lc7
        L1a:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lc7
            r4 = 24
            if (r2 < r4) goto L22
            goto Lc7
        L22:
            java.util.List r1 = a(r1)     // Catch: java.lang.Throwable -> Lc7
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> Lc7
            if (r2 == 0) goto L2e
            goto Lc7
        L2e:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lc7
        L32:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Lc7
            if (r2 == 0) goto Lc7
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Lc7
            cn.jiguang.commons.c.o r2 = (cn.jiguang.commons.c.o) r2     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r4 = r2.f1078d     // Catch: java.lang.Throwable -> Lc7
            boolean r4 = r0.containsKey(r4)     // Catch: java.lang.Throwable -> Lc7
            if (r4 == 0) goto L6b
            java.lang.String r4 = r2.f1078d     // Catch: java.lang.Throwable -> Lc7
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.Throwable -> Lc7
            cn.jiguang.commons.c.d r4 = (cn.jiguang.commons.c.d) r4     // Catch: java.lang.Throwable -> Lc7
            if (r4 == 0) goto L6b
            java.util.List r5 = r4.f1004f     // Catch: java.lang.Throwable -> Lc7
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> Lc7
            if (r5 != 0) goto L6b
            java.util.List r4 = r4.f1004f     // Catch: java.lang.Throwable -> Lc7
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> Lc7
            java.lang.Long r4 = (java.lang.Long) r4     // Catch: java.lang.Throwable -> Lc7
            long r4 = r4.longValue()     // Catch: java.lang.Throwable -> Lc7
            long r6 = r2.f1081g     // Catch: java.lang.Throwable -> Lc7
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L6b
            goto L32
        L6b:
            long r4 = r2.f1079e     // Catch: java.lang.Throwable -> Lc7
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 > 0) goto L7f
            long r4 = r2.f1080f     // Catch: java.lang.Throwable -> Lc7
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 > 0) goto L7f
            long r4 = r2.f1081g     // Catch: java.lang.Throwable -> Lc7
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L32
        L7f:
            cn.jiguang.commons.c.d r4 = new cn.jiguang.commons.c.d     // Catch: java.lang.Throwable -> Lc7
            r4.<init>()     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r5 = r2.f1078d     // Catch: java.lang.Throwable -> Lc7
            r4.a = r5     // Catch: java.lang.Throwable -> Lc7
            java.util.List r5 = r4.f1006h     // Catch: java.lang.Throwable -> Lc7
            long r8 = r2.f1079e     // Catch: java.lang.Throwable -> Lc7
            long r10 = r2.f1080f     // Catch: java.lang.Throwable -> Lc7
            long r8 = r8 + r10
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> Lc7
            r5.add(r8)     // Catch: java.lang.Throwable -> Lc7
            java.util.List r5 = r4.f1004f     // Catch: java.lang.Throwable -> Lc7
            long r8 = r2.f1081g     // Catch: java.lang.Throwable -> Lc7
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> Lc7
            r5.add(r8)     // Catch: java.lang.Throwable -> Lc7
            long r8 = r2.f1079e     // Catch: java.lang.Throwable -> Lc7
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 > 0) goto Lb6
            long r8 = r2.f1080f     // Catch: java.lang.Throwable -> Lc7
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 <= 0) goto Lae
            goto Lb6
        Lae:
            java.util.List r5 = r4.f1003e     // Catch: java.lang.Throwable -> Lc7
            r6 = 4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Lc7
            goto Lbd
        Lb6:
            java.util.List r5 = r4.f1003e     // Catch: java.lang.Throwable -> Lc7
            r6 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Lc7
        Lbd:
            r5.add(r6)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r2 = r2.f1078d     // Catch: java.lang.Throwable -> Lc7
            r0.put(r2, r4)     // Catch: java.lang.Throwable -> Lc7
            goto L32
        Lc7:
            return r0
    }

    private static java.util.List a(java.util.List r8) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            cn.jiguang.commons.g.n r1 = cn.jiguang.commons.g.n.a()
            r2 = 1102(0x44e, float:1.544E-42)
            r3 = 0
            java.util.List r1 = r1.c(r2, r3)
            java.util.Iterator r8 = r8.iterator()
        L14:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L46
            java.lang.Object r2 = r8.next()
            cn.jiguang.commons.c.e r2 = (cn.jiguang.commons.c.e) r2
            if (r2 == 0) goto L14
            java.lang.String r3 = r2.f1007c
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L2b
            goto L14
        L2b:
            java.lang.String r3 = r2.f1007c
            long r3 = a(r1, r3)
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L14
            cn.jiguang.commons.c.o r5 = new cn.jiguang.commons.c.o
            r5.<init>()
            java.lang.String r2 = r2.f1007c
            r5.f1078d = r2
            r5.f1081g = r3
            r0.add(r5)
            goto L14
        L46:
            return r0
    }
}
