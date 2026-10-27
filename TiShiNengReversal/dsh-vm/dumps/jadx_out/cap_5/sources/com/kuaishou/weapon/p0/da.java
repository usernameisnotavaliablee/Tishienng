package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class da {
    private static volatile com.kuaishou.weapon.p0.da b;
    private android.content.Context a;
    private android.app.Application.ActivityLifecycleCallbacks c;
    private boolean d;



    private da(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    static /* synthetic */ android.content.Context a(com.kuaishou.weapon.p0.da r0) {
            android.content.Context r0 = r0.a
            return r0
    }

    public static com.kuaishou.weapon.p0.da a(android.content.Context r2) {
            com.kuaishou.weapon.p0.da r0 = com.kuaishou.weapon.p0.da.b
            if (r0 != 0) goto L19
            java.lang.Class<com.kuaishou.weapon.p0.da> r0 = com.kuaishou.weapon.p0.da.class
            monitor-enter(r0)
            com.kuaishou.weapon.p0.da r1 = com.kuaishou.weapon.p0.da.b     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.kuaishou.weapon.p0.da r1 = new com.kuaishou.weapon.p0.da     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            com.kuaishou.weapon.p0.da.b = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
        L19:
            com.kuaishou.weapon.p0.da r2 = com.kuaishou.weapon.p0.da.b
            return r2
    }

    static /* synthetic */ boolean a(com.kuaishou.weapon.p0.da r0, boolean r1) {
            r0.d = r1
            return r1
    }

    private void b() {
            r4 = this;
            android.content.Context r0 = r4.a     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L5
            goto L38
        L5:
            java.lang.String r1 = "re_po_rt"
            com.kuaishou.weapon.p0.h r0 = com.kuaishou.weapon.p0.h.a(r0, r1)     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = "plc001_f_act"
            r2 = 0
            int r1 = r0.b(r1, r2)     // Catch: java.lang.Throwable -> L38
            if (r1 != 0) goto L15
            goto L38
        L15:
            int[] r1 = new int[]{r2}     // Catch: java.lang.Throwable -> L38
            java.lang.String r2 = "plc001_blpc"
            r3 = 1
            int r0 = r0.b(r2, r3)     // Catch: java.lang.Throwable -> L38
            int[] r0 = new int[]{r0}     // Catch: java.lang.Throwable -> L38
            android.content.Context r2 = r4.a     // Catch: java.lang.Throwable -> L38
            boolean r2 = r2 instanceof android.app.Application     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L38
            com.kuaishou.weapon.p0.da$2 r2 = new com.kuaishou.weapon.p0.da$2     // Catch: java.lang.Throwable -> L38
            r2.<init>(r4, r1, r0)     // Catch: java.lang.Throwable -> L38
            r4.c = r2     // Catch: java.lang.Throwable -> L38
            android.content.Context r0 = r4.a     // Catch: java.lang.Throwable -> L38
            android.app.Application r0 = (android.app.Application) r0     // Catch: java.lang.Throwable -> L38
            r0.registerActivityLifecycleCallbacks(r2)     // Catch: java.lang.Throwable -> L38
        L38:
            return
    }

    static /* synthetic */ boolean b(com.kuaishou.weapon.p0.da r0) {
            boolean r0 = r0.d
            return r0
    }

    static /* synthetic */ void c(com.kuaishou.weapon.p0.da r0) {
            r0.b()
            return
    }

    static /* synthetic */ android.app.Application.ActivityLifecycleCallbacks d(com.kuaishou.weapon.p0.da r0) {
            android.app.Application$ActivityLifecycleCallbacks r0 = r0.c
            return r0
    }

    public void a() {
            r2 = this;
            com.kuaishou.weapon.p0.n r0 = com.kuaishou.weapon.p0.n.a()     // Catch: java.lang.Throwable -> Lc
            com.kuaishou.weapon.p0.da$1 r1 = new com.kuaishou.weapon.p0.da$1     // Catch: java.lang.Throwable -> Lc
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc
            r0.a(r1)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }
}
