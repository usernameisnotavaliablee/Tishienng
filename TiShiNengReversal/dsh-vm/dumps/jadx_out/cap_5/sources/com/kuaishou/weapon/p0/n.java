package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class n {
    private static volatile com.kuaishou.weapon.p0.n a = null;
    private static int b = 3;
    private static int c = 6;
    private static java.util.concurrent.ThreadPoolExecutor d;



    static {
            return
    }

    private n() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.kuaishou.weapon.p0.n a() {
            com.kuaishou.weapon.p0.n r0 = com.kuaishou.weapon.p0.n.a
            if (r0 != 0) goto L3c
            java.lang.Class<com.kuaishou.weapon.p0.n> r1 = com.kuaishou.weapon.p0.n.class
            monitor-enter(r1)
            com.kuaishou.weapon.p0.n r0 = com.kuaishou.weapon.p0.n.a     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L15
            com.kuaishou.weapon.p0.n r0 = new com.kuaishou.weapon.p0.n     // Catch: java.lang.Throwable -> L13
            r0.<init>()     // Catch: java.lang.Throwable -> L13
            com.kuaishou.weapon.p0.n.a = r0     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r0 = move-exception
            goto L3a
        L15:
            java.util.concurrent.ThreadPoolExecutor r0 = com.kuaishou.weapon.p0.n.d     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L38
            java.util.concurrent.ThreadPoolExecutor r2 = new java.util.concurrent.ThreadPoolExecutor     // Catch: java.lang.Throwable -> L13
            int r3 = com.kuaishou.weapon.p0.n.b     // Catch: java.lang.Throwable -> L13
            int r4 = com.kuaishou.weapon.p0.n.c     // Catch: java.lang.Throwable -> L13
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L13
            java.util.concurrent.LinkedBlockingQueue r8 = new java.util.concurrent.LinkedBlockingQueue     // Catch: java.lang.Throwable -> L13
            r0 = 50
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L13
            com.kuaishou.weapon.p0.n$1 r9 = new com.kuaishou.weapon.p0.n$1     // Catch: java.lang.Throwable -> L13
            r9.<init>()     // Catch: java.lang.Throwable -> L13
            r5 = 60
            r2.<init>(r3, r4, r5, r7, r8, r9)     // Catch: java.lang.Throwable -> L13
            com.kuaishou.weapon.p0.n.d = r2     // Catch: java.lang.Throwable -> L13
            r0 = 1
            r2.allowCoreThreadTimeOut(r0)     // Catch: java.lang.Throwable -> L13
        L38:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            goto L3c
        L3a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r0
        L3c:
            com.kuaishou.weapon.p0.n r0 = com.kuaishou.weapon.p0.n.a
            return r0
    }

    public static com.kuaishou.weapon.p0.n a(int r10, int r11) {
            com.kuaishou.weapon.p0.n r0 = com.kuaishou.weapon.p0.n.a
            if (r0 != 0) goto L41
            java.lang.Class<com.kuaishou.weapon.p0.n> r1 = com.kuaishou.weapon.p0.n.class
            monitor-enter(r1)
            com.kuaishou.weapon.p0.n r0 = com.kuaishou.weapon.p0.n.a     // Catch: java.lang.Throwable -> L3a
            if (r0 != 0) goto L3d
            com.kuaishou.weapon.p0.n.b = r10     // Catch: java.lang.Throwable -> L3a
            com.kuaishou.weapon.p0.n.c = r11     // Catch: java.lang.Throwable -> L3a
            com.kuaishou.weapon.p0.n r10 = new com.kuaishou.weapon.p0.n     // Catch: java.lang.Throwable -> L3a
            r10.<init>()     // Catch: java.lang.Throwable -> L3a
            com.kuaishou.weapon.p0.n.a = r10     // Catch: java.lang.Throwable -> L3a
            java.util.concurrent.ThreadPoolExecutor r10 = com.kuaishou.weapon.p0.n.d     // Catch: java.lang.Throwable -> L3a
            if (r10 != 0) goto L3d
            java.util.concurrent.ThreadPoolExecutor r2 = new java.util.concurrent.ThreadPoolExecutor     // Catch: java.lang.Throwable -> L3a
            int r3 = com.kuaishou.weapon.p0.n.b     // Catch: java.lang.Throwable -> L3a
            int r4 = com.kuaishou.weapon.p0.n.c     // Catch: java.lang.Throwable -> L3a
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L3a
            java.util.concurrent.LinkedBlockingQueue r8 = new java.util.concurrent.LinkedBlockingQueue     // Catch: java.lang.Throwable -> L3a
            r10 = 50
            r8.<init>(r10)     // Catch: java.lang.Throwable -> L3a
            com.kuaishou.weapon.p0.n$2 r9 = new com.kuaishou.weapon.p0.n$2     // Catch: java.lang.Throwable -> L3a
            r9.<init>()     // Catch: java.lang.Throwable -> L3a
            r5 = 60
            r2.<init>(r3, r4, r5, r7, r8, r9)     // Catch: java.lang.Throwable -> L3a
            com.kuaishou.weapon.p0.n.d = r2     // Catch: java.lang.Throwable -> L3a
            r10 = 1
            r2.allowCoreThreadTimeOut(r10)     // Catch: java.lang.Throwable -> L3a
            goto L3d
        L3a:
            r0 = move-exception
            r10 = r0
            goto L3f
        L3d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3a
            goto L41
        L3f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3a
            throw r10
        L41:
            com.kuaishou.weapon.p0.n r10 = com.kuaishou.weapon.p0.n.a
            return r10
    }

    public void a(java.lang.Runnable r2) {
            r1 = this;
            if (r2 == 0) goto L7
            java.util.concurrent.ThreadPoolExecutor r0 = com.kuaishou.weapon.p0.n.d     // Catch: java.lang.Exception -> L7
            r0.execute(r2)     // Catch: java.lang.Exception -> L7
        L7:
            return
    }
}
