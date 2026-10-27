package cn.jiguang.w;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {
    private static java.lang.String a;

    public c() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(java.lang.String r3) {
            java.lang.String r0 = cn.jiguang.w.c.a
            if (r0 != 0) goto L2b
            android.content.Context r0 = cn.jiguang.internal.JConstants.getAppContext()
            java.lang.String r1 = cn.jiguang.av.a.a(r0)
            if (r0 == 0) goto L13
            java.lang.String r0 = r0.getPackageName()
            goto L14
        L13:
            r0 = 0
        L14:
            java.lang.String r0 = a(r1, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "-"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            cn.jiguang.w.c.a = r0
        L2b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = cn.jiguang.w.c.a
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    private static java.lang.String a(java.lang.String r2, java.lang.String r3) {
            if (r2 == 0) goto L2b
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L9
            goto L2b
        L9:
            r0 = 58
            int r0 = r2.indexOf(r0)
            if (r0 < 0) goto L20
            int r1 = r2.length()
            int r1 = r1 + (-1)
            if (r0 >= r1) goto L20
            int r0 = r0 + 1
            java.lang.String r2 = r2.substring(r0)
            return r2
        L20:
            if (r3 == 0) goto L2a
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L2a
            java.lang.String r2 = "main"
        L2a:
            return r2
        L2b:
            java.lang.String r2 = ""
            return r2
    }

    public static void a(java.lang.String r5, java.lang.String r6, boolean r7, int r8, java.lang.String r9, java.lang.Throwable r10) {
            java.lang.String r6 = a(r6)     // Catch: java.lang.Throwable -> L7c
            boolean r10 = cn.jiguang.a.a.f241h     // Catch: java.lang.Throwable -> L7c
            r0 = 6
            r1 = 5
            if (r10 == 0) goto L67
            r10 = 2
            r2 = 0
            java.lang.String r3 = "JIGUANG-"
            if (r8 == r10) goto L53
            r10 = 3
            if (r8 == r10) goto L45
            r10 = 4
            if (r8 == r10) goto L37
            if (r8 == r1) goto L29
            if (r8 == r0) goto L1b
            goto L67
        L1b:
            java.lang.String r10 = "E"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            r4.<init>()     // Catch: java.lang.Throwable -> L7c
            r4.append(r3)     // Catch: java.lang.Throwable -> L7c
            r4.append(r5)     // Catch: java.lang.Throwable -> L7c
            goto L60
        L29:
            java.lang.String r10 = "W"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            r4.<init>()     // Catch: java.lang.Throwable -> L7c
            r4.append(r3)     // Catch: java.lang.Throwable -> L7c
            r4.append(r5)     // Catch: java.lang.Throwable -> L7c
            goto L60
        L37:
            java.lang.String r10 = "I"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            r4.<init>()     // Catch: java.lang.Throwable -> L7c
            r4.append(r3)     // Catch: java.lang.Throwable -> L7c
            r4.append(r5)     // Catch: java.lang.Throwable -> L7c
            goto L60
        L45:
            java.lang.String r10 = "D"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            r4.<init>()     // Catch: java.lang.Throwable -> L7c
            r4.append(r3)     // Catch: java.lang.Throwable -> L7c
            r4.append(r5)     // Catch: java.lang.Throwable -> L7c
            goto L60
        L53:
            java.lang.String r10 = "T"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            r4.<init>()     // Catch: java.lang.Throwable -> L7c
            r4.append(r3)     // Catch: java.lang.Throwable -> L7c
            r4.append(r5)     // Catch: java.lang.Throwable -> L7c
        L60:
            java.lang.String r5 = r4.toString()     // Catch: java.lang.Throwable -> L7c
            cn.jiguang.w.e.a(r10, r5, r6, r9, r2)     // Catch: java.lang.Throwable -> L7c
        L67:
            boolean r5 = cn.jiguang.internal.JConstants.CMD_TO_PRINT_ALL_LOG     // Catch: java.lang.Throwable -> L6a
            goto L6b
        L6a:
            r5 = 0
        L6b:
            if (r5 != 0) goto L7c
            boolean r5 = cn.jiguang.internal.JConstants.DEBUG_MODE     // Catch: java.lang.Throwable -> L7c
            if (r5 != 0) goto L74
            if (r8 >= r1) goto L74
            goto L7c
        L74:
            if (r7 == 0) goto L79
            if (r8 >= r0) goto L79
            goto L7c
        L79:
            a(r8)     // Catch: java.lang.Throwable -> L7c
        L7c:
            return
    }

    private static boolean a(int r1) {
            r0 = 2
            if (r1 < r0) goto L5
            r1 = 1
            return r1
        L5:
            r1 = 0
            return r1
    }
}
