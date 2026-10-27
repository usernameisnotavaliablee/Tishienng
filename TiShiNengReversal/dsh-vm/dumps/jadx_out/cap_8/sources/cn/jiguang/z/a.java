package cn.jiguang.z;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    private static boolean a;

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    private static void a() {
            boolean r0 = cn.jiguang.z.a.a
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            cn.jiguang.z.a.a = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "init jcore impl ,version:"
            r0.append(r1)
            java.lang.String r1 = cn.jiguang.a.a.f236c
            r0.append(r1)
            java.lang.String r1 = ",local version:"
            r0.append(r1)
            int r1 = cn.jiguang.internal.JConstants.SDK_VERSION_INT
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "JCoreActionImpl"
            cn.jiguang.w.f.c(r1, r0)
            android.content.Context r0 = cn.jiguang.av.c.a()
            cn.jiguang.ad.c.a(r0)
            return
    }

    public static synchronized void a(android.content.Context r6) {
            java.lang.Class<cn.jiguang.z.a> r0 = cn.jiguang.z.a.class
            monitor-enter(r0)
            int r1 = cn.jiguang.l.a.d()     // Catch: java.lang.Throwable -> L38
            int r2 = cn.jiguang.l.a.e()     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = "JCoreActionImpl"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r4.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r5 = "custom:"
            r4.append(r5)     // Catch: java.lang.Throwable -> L38
            r4.append(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.String r5 = ",dynamic:"
            r4.append(r5)     // Catch: java.lang.Throwable -> L38
            r4.append(r2)     // Catch: java.lang.Throwable -> L38
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L38
            cn.jiguang.w.f.c(r3, r4)     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = "core"
            int r4 = cn.jiguang.a.a.f237d     // Catch: java.lang.Throwable -> L38
            cn.jiguang.c.b.a(r6, r3, r1, r2, r4)     // Catch: java.lang.Throwable -> L38
            android.content.Context r6 = cn.jiguang.av.c.a()     // Catch: java.lang.Throwable -> L38
            cn.jiguang.ad.c.b(r6)     // Catch: java.lang.Throwable -> L38
            goto L53
        L38:
            r6 = move-exception
            java.lang.String r1 = "JCoreActionImpl"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r2.<init>()     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = "sdk type call failed:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L55
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> L55
            r2.append(r6)     // Catch: java.lang.Throwable -> L55
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> L55
            cn.jiguang.w.f.j(r1, r6)     // Catch: java.lang.Throwable -> L55
        L53:
            monitor-exit(r0)
            return
        L55:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L55
            throw r6
    }

    public static void a(android.content.Context r6, java.lang.String r7, android.os.Bundle r8) {
            a()
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            java.lang.String r1 = "JCoreActionImpl"
            if (r0 == 0) goto L11
            java.lang.String r6 = "handleAction Failed,action is empty"
            cn.jiguang.w.f.j(r1, r6)
            return
        L11:
            java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.internal.JConstants.isCallInit
            boolean r0 = r0.get()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = " isCallInit="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            cn.jiguang.w.f.c(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "handleAction action:"
            r2.append(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            cn.jiguang.w.f.c(r1, r2)
            if (r8 == 0) goto L48
            java.lang.String r2 = "sdk_type"
            java.lang.String r2 = r8.getString(r2)
            goto L4a
        L48:
            java.lang.String r2 = ""
        L4a:
            java.lang.String r3 = "a1"
            boolean r3 = r7.equals(r3)
            java.lang.String r4 = "report failed:"
            r5 = 0
            if (r3 == 0) goto L7b
            if (r8 == 0) goto L60
            java.lang.String r7 = "report_data"
            java.lang.String r5 = r8.getString(r7)     // Catch: java.lang.Throwable -> L5e
            goto L60
        L5e:
            r6 = move-exception
            goto L64
        L60:
            cn.jiguang.z.b.a(r6, r5)     // Catch: java.lang.Throwable -> L5e
            return
        L64:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
        L69:
            r7.append(r4)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            cn.jiguang.w.f.i(r1, r6)
            goto Lde
        L7b:
            java.lang.String r3 = "a12"
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L9c
            if (r8 == 0) goto L8e
            java.lang.String r6 = "save_data"
            java.lang.String r5 = r8.getString(r6)     // Catch: java.lang.Throwable -> L8c
            goto L8e
        L8c:
            r6 = move-exception
            goto L96
        L8e:
            cn.jiguang.al.c r6 = cn.jiguang.al.c.a()     // Catch: java.lang.Throwable -> L8c
            r6.a(r5)     // Catch: java.lang.Throwable -> L8c
            return
        L96:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            goto L69
        L9c:
            java.lang.String r1 = "tcp_"
            boolean r1 = r7.startsWith(r1)
            if (r1 == 0) goto Laf
            if (r0 != 0) goto La7
            goto Lde
        La7:
            cn.jiguang.ad.g r0 = cn.jiguang.ad.g.a()
            r0.a(r6, r7, r8)
            return
        Laf:
            java.lang.String r1 = "a2"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto Lc3
            if (r0 != 0) goto Lba
            goto Lde
        Lba:
            cn.jiguang.ad.f r7 = cn.jiguang.ad.f.a()
            r8 = 1
            r7.a(r6, r8)
            return
        Lc3:
            java.lang.String r0 = "a3"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto Ld3
            cn.jiguang.ad.b r7 = cn.jiguang.ad.b.a()
            r7.a(r6, r2, r8)
            return
        Ld3:
            java.lang.String r0 = "a4"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto Lde
            cn.jiguang.z.b.a(r6, r8)
        Lde:
            return
    }
}
