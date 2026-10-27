package cn.jiguang.w;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d {
    public d() {
            r1 = this;
            r1.<init>()
            return
    }

    public static synchronized void a(android.content.Context r2) {
            java.lang.Class<cn.jiguang.w.d> r0 = cn.jiguang.w.d.class
            monitor-enter(r0)
            r1 = 1
            cn.jiguang.e.c.a(r2, r1)     // Catch: java.lang.Throwable -> L10
            java.lang.String r2 = "LogRefManager"
            java.lang.String r1 = "Log reference count increased to: 1"
            cn.jiguang.w.f.c(r2, r1)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)
            return
        L10:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r2
    }

    public static synchronized void b(android.content.Context r4) {
            java.lang.Class<cn.jiguang.w.d> r0 = cn.jiguang.w.d.class
            monitor-enter(r0)
            int r1 = cn.jiguang.e.c.c(r4)     // Catch: java.lang.Throwable -> L25
            if (r1 <= 0) goto L27
            int r1 = r1 + (-1)
            cn.jiguang.e.c.a(r4, r1)     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = "LogRefManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25
            r2.<init>()     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "Log reference count decreased to: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L25
            r2.append(r1)     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L25
            cn.jiguang.w.f.c(r4, r1)     // Catch: java.lang.Throwable -> L25
            goto L27
        L25:
            r4 = move-exception
            goto L29
        L27:
            monitor-exit(r0)
            return
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            throw r4
    }

    public static synchronized boolean c(android.content.Context r4) {
            java.lang.Class<cn.jiguang.w.d> r0 = cn.jiguang.w.d.class
            monitor-enter(r0)
            int r4 = cn.jiguang.e.c.c(r4)     // Catch: java.lang.Throwable -> L24
            if (r4 != 0) goto Lb
            r4 = 1
            goto Lc
        Lb:
            r4 = 0
        Lc:
            java.lang.String r1 = "LogRefManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            r2.<init>()     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = "Can clear log: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L24
            r2.append(r4)     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L24
            cn.jiguang.w.f.c(r1, r2)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r0)
            return r4
        L24:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r4
    }
}
