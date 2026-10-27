package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class q {
    public static final int a = 3;
    private static com.kuaishou.weapon.p0.q b = null;
    private static final java.lang.String g = "1";
    private volatile boolean c;
    private com.kuaishou.weapon.p0.dp d;
    private android.content.Context e;
    private com.kuaishou.weapon.p0.t f;


    private q(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.c = r0
            r1.e = r2
            com.kuaishou.weapon.p0.dp r0 = com.kuaishou.weapon.p0.dp.a(r2)
            r1.d = r0
            com.kuaishou.weapon.p0.t r2 = com.kuaishou.weapon.p0.t.a(r2)
            r1.f = r2
            return
    }

    static /* synthetic */ android.content.Context a(com.kuaishou.weapon.p0.q r0) {
            android.content.Context r0 = r0.e
            return r0
    }

    public static synchronized com.kuaishou.weapon.p0.q a(android.content.Context r2) {
            java.lang.Class<com.kuaishou.weapon.p0.q> r0 = com.kuaishou.weapon.p0.q.class
            monitor-enter(r0)
            com.kuaishou.weapon.p0.q r1 = com.kuaishou.weapon.p0.q.b     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L17
            if (r1 != 0) goto L11
            com.kuaishou.weapon.p0.q r1 = new com.kuaishou.weapon.p0.q     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L17
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L17
            com.kuaishou.weapon.p0.q.b = r1     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L17
            goto L11
        Lf:
            r2 = move-exception
            goto L15
        L11:
            com.kuaishou.weapon.p0.q r2 = com.kuaishou.weapon.p0.q.b     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L17
            monitor-exit(r0)
            return r2
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r2
        L17:
            monitor-exit(r0)
            r2 = 0
            return r2
    }

    private synchronized boolean a(int r4, java.lang.String r5, java.lang.String r6, boolean r7, android.content.pm.PackageInfo r8) {
            r3 = this;
            monitor-enter(r3)
            r5 = 0
            r6 = 1
            if (r7 == 0) goto L11
            com.kuaishou.weapon.p0.t r7 = r3.f     // Catch: java.lang.Throwable -> Lf
            int r7 = r7.c(r4)     // Catch: java.lang.Throwable -> Lf
            if (r7 == r6) goto L11
            monitor-exit(r3)
            return r5
        Lf:
            r4 = move-exception
            goto L6a
        L11:
            com.kuaishou.weapon.p0.t r7 = r3.f     // Catch: java.lang.Throwable -> Lf
            com.kuaishou.weapon.p0.s r7 = r7.a(r4)     // Catch: java.lang.Throwable -> Lf
            r0 = -1
            if (r7 != 0) goto L21
            com.kuaishou.weapon.p0.t r6 = r3.f     // Catch: java.lang.Throwable -> Lf
            r6.b(r4, r0)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r3)
            return r5
        L21:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> Lf
            java.lang.String r2 = r7.e     // Catch: java.lang.Throwable -> Lf
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lf
            boolean r1 = com.kuaishou.weapon.p0.dn.a(r1)     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L35
            com.kuaishou.weapon.p0.t r6 = r3.f     // Catch: java.lang.Throwable -> Lf
            r6.b(r4, r0)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r3)
            return r5
        L35:
            if (r8 == 0) goto L39
            r7.r = r8     // Catch: java.lang.Throwable -> Lf
        L39:
            android.content.Context r8 = r3.e     // Catch: java.lang.Throwable -> Lf
            android.content.Context r8 = r8.getApplicationContext()     // Catch: java.lang.Throwable -> Lf
            android.content.Context r8 = com.stub.StubApp.getOrigApplicationContext(r8)     // Catch: java.lang.Throwable -> Lf
            com.kuaishou.weapon.p0.r r8 = com.kuaishou.weapon.p0.r.a(r8, r6)     // Catch: java.lang.Throwable -> Lf
            boolean r1 = r8.a(r7, r5)     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L59
            com.kuaishou.weapon.p0.t r6 = r3.f     // Catch: java.lang.Throwable -> Lf
            r6.b(r4, r0)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r4 = r7.e     // Catch: java.lang.Throwable -> Lf
            r8.a(r4)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r3)
            return r5
        L59:
            java.lang.String r4 = r7.e     // Catch: java.lang.Throwable -> Lf
            com.kuaishou.weapon.p0.s r4 = r8.c(r4)     // Catch: java.lang.Throwable -> Lf
            r4.b = r6     // Catch: java.lang.Throwable -> Lf
            r4.p = r6     // Catch: java.lang.Throwable -> Lf
            com.kuaishou.weapon.p0.t r5 = r3.f     // Catch: java.lang.Throwable -> Lf
            r5.a(r4)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r3)
            return r6
        L6a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lf
            throw r4
    }

    static /* synthetic */ com.kuaishou.weapon.p0.t b(com.kuaishou.weapon.p0.q r0) {
            com.kuaishou.weapon.p0.t r0 = r0.f
            return r0
    }

    private static void d() {
            com.kuaishou.weapon.p0.dp r0 = com.kuaishou.weapon.p0.dp.a()     // Catch: java.lang.Exception -> Ld
            if (r0 == 0) goto Ld
            java.lang.String r1 = "W_S_V"
            java.lang.String r2 = "1"
            r0.b(r1, r2)     // Catch: java.lang.Exception -> Ld
        Ld:
            return
    }

    public void a() {
            r1 = this;
            d()
            boolean r0 = com.kuaishou.weapon.p0.WeaponHI.isLoad
            if (r0 == 0) goto Lb
            r1.b()
            return
        Lb:
            com.kuaishou.weapon.p0.WeaponHI.iD()
            return
    }

    public void a(java.lang.String r3) {
            r2 = this;
            com.kuaishou.weapon.p0.n r0 = com.kuaishou.weapon.p0.n.a()     // Catch: java.lang.Throwable -> Lc
            com.kuaishou.weapon.p0.q$1 r1 = new com.kuaishou.weapon.p0.q$1     // Catch: java.lang.Throwable -> Lc
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Lc
            r0.a(r1)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    public void a(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.kuaishou.weapon.p0.t r0 = r1.f
            r0.a(r2)
            java.io.File r2 = new java.io.File
            r2.<init>(r3)
            boolean r3 = r2.exists()
            if (r3 == 0) goto L13
            r2.delete()
        L13:
            return
    }

    public synchronized boolean a(int r8, java.lang.String r9, android.content.pm.PackageInfo r10) {
            r7 = this;
            monitor-enter(r7)
            r4 = 0
            r5 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r6 = r10
            boolean r8 = r1.a(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r7)
            return r8
        Ld:
            r0 = move-exception
            r8 = r0
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Ld
            throw r8
    }

    public boolean a(com.kuaishou.weapon.p0.s r10, java.lang.String r11, java.lang.String r12) {
            r9 = this;
            r11 = 0
            if (r10 != 0) goto L4
            return r11
        L4:
            java.io.File r12 = new java.io.File
            java.lang.String r0 = r10.e
            r12.<init>(r0)
            boolean r0 = com.kuaishou.weapon.p0.dn.a(r12)
            if (r0 != 0) goto L12
            return r11
        L12:
            r0 = 1
            com.kuaishou.weapon.p0.t r1 = r9.f     // Catch: java.lang.Throwable -> L23
            int r2 = r10.a     // Catch: java.lang.Throwable -> L23
            boolean r1 = r1.b(r2)     // Catch: java.lang.Throwable -> L23
            if (r1 != 0) goto L25
            com.kuaishou.weapon.p0.t r1 = r9.f     // Catch: java.lang.Throwable -> L23
            r1.a(r10)     // Catch: java.lang.Throwable -> L23
            goto L25
        L23:
            r3 = r9
            goto L6c
        L25:
            android.content.Context r1 = r9.e     // Catch: java.lang.Throwable -> L23
            android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L23
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: java.lang.Throwable -> L23
            com.kuaishou.weapon.p0.r r1 = com.kuaishou.weapon.p0.r.a(r1, r0)     // Catch: java.lang.Throwable -> L23
            com.kuaishou.weapon.p0.t r2 = r9.f     // Catch: java.lang.Throwable -> L23
            int r3 = r10.a     // Catch: java.lang.Throwable -> L23
            r2.a(r3, r0)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = r10.c     // Catch: java.lang.Throwable -> L23
            r9.b(r2)     // Catch: java.lang.Throwable -> L23
            boolean r2 = r1.a(r10, r0)     // Catch: java.lang.Throwable -> L23
            if (r2 != 0) goto L5b
            r12.delete()     // Catch: java.lang.Throwable -> L23
            int r4 = r10.a     // Catch: java.lang.Throwable -> L23
            java.lang.String r5 = r10.d     // Catch: java.lang.Throwable -> L23
            r7 = 1
            r8 = 0
            r6 = 0
            r3 = r9
            r3.a(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L6c
            com.kuaishou.weapon.p0.t r12 = r3.f     // Catch: java.lang.Throwable -> L6c
            int r1 = r10.a     // Catch: java.lang.Throwable -> L6c
            r12.a(r1, r11)     // Catch: java.lang.Throwable -> L6c
            return r11
        L5b:
            r3 = r9
            java.lang.String r12 = r10.e     // Catch: java.lang.Throwable -> L6c
            com.kuaishou.weapon.p0.s r10 = r1.c(r12)     // Catch: java.lang.Throwable -> L6c
            if (r10 != 0) goto L6c
            com.kuaishou.weapon.p0.t r12 = r3.f     // Catch: java.lang.Throwable -> L6c
            int r1 = r10.a     // Catch: java.lang.Throwable -> L6c
            r12.a(r1, r11)     // Catch: java.lang.Throwable -> L6c
            return r11
        L6c:
            com.kuaishou.weapon.p0.t r12 = r3.f     // Catch: java.lang.Throwable -> Lac
            int r1 = r10.a     // Catch: java.lang.Throwable -> Lac
            com.kuaishou.weapon.p0.s r12 = r12.a(r1)     // Catch: java.lang.Throwable -> Lac
            if (r12 == 0) goto L88
            java.lang.String r1 = r12.d     // Catch: java.lang.Throwable -> Lac
            java.lang.String r2 = r10.d     // Catch: java.lang.Throwable -> Lac
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> Lac
            if (r1 != 0) goto L88
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> Lac
            java.lang.String r12 = r12.e     // Catch: java.lang.Throwable -> Lac
            r1.<init>(r12)     // Catch: java.lang.Throwable -> Lac
            goto L89
        L88:
            r1 = 0
        L89:
            r10.b = r0     // Catch: java.lang.Throwable -> Lac
            r10.p = r0     // Catch: java.lang.Throwable -> Lac
            com.kuaishou.weapon.p0.t r12 = r3.f     // Catch: java.lang.Throwable -> Lac
            long r4 = r12.a(r10)     // Catch: java.lang.Throwable -> Lac
            r6 = 0
            int r12 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r12 <= 0) goto La4
            if (r1 == 0) goto La4
            boolean r12 = r1.exists()     // Catch: java.lang.Throwable -> Lac
            if (r12 == 0) goto La4
            r1.delete()     // Catch: java.lang.Throwable -> Lac
        La4:
            com.kuaishou.weapon.p0.t r12 = r3.f     // Catch: java.lang.Throwable -> Lac
            int r10 = r10.a     // Catch: java.lang.Throwable -> Lac
            r12.a(r10, r11)     // Catch: java.lang.Throwable -> Lac
            return r0
        Lac:
            return r11
    }

    public synchronized void b() {
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.c     // Catch: java.lang.Throwable -> L91
            if (r0 == 0) goto L7
            monitor-exit(r5)
            return
        L7:
            r0 = 1
            r5.c = r0     // Catch: java.lang.Throwable -> L91
            com.kuaishou.weapon.p0.t r1 = r5.f     // Catch: java.lang.Throwable -> L91
            java.util.List r1 = r1.a()     // Catch: java.lang.Throwable -> L91
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L91
        L14:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L91
            if (r2 == 0) goto L62
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L91
            com.kuaishou.weapon.p0.s r2 = (com.kuaishou.weapon.p0.s) r2     // Catch: java.lang.Throwable -> L91
            android.content.Context r3 = r5.e     // Catch: java.lang.Throwable -> L2b
            java.io.File r3 = r3.getFilesDir()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = r3.getCanonicalPath()     // Catch: java.lang.Throwable -> L2b
            goto L2c
        L2b:
            r3 = 0
        L2c:
            if (r3 == 0) goto L14
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L91
            r4.<init>()     // Catch: java.lang.Throwable -> L91
            r4.append(r3)     // Catch: java.lang.Throwable -> L91
            java.lang.String r3 = "/."
            r4.append(r3)     // Catch: java.lang.Throwable -> L91
            int r3 = r2.a     // Catch: java.lang.Throwable -> L91
            r4.append(r3)     // Catch: java.lang.Throwable -> L91
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L91
            r2.m = r3     // Catch: java.lang.Throwable -> L91
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L91
            r3.<init>()     // Catch: java.lang.Throwable -> L91
            java.lang.String r4 = r2.m     // Catch: java.lang.Throwable -> L91
            r3.append(r4)     // Catch: java.lang.Throwable -> L91
            java.lang.String r4 = "/lib"
            r3.append(r4)     // Catch: java.lang.Throwable -> L91
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L91
            com.kuaishou.weapon.p0.dn.c(r3)     // Catch: java.lang.Throwable -> L91
            java.lang.String r2 = r2.m     // Catch: java.lang.Throwable -> L91
            com.kuaishou.weapon.p0.dn.c(r2)     // Catch: java.lang.Throwable -> L91
            goto L14
        L62:
            com.kuaishou.weapon.p0.t r1 = r5.f     // Catch: java.lang.Throwable -> L91
            r1.b()     // Catch: java.lang.Throwable -> L91
            com.kuaishou.weapon.p0.dp r1 = r5.d     // Catch: java.lang.Throwable -> L91
            java.lang.String r2 = "wiipaot"
            boolean r1 = r1.b(r2)     // Catch: java.lang.Throwable -> L91
            if (r1 != 0) goto L7b
            com.kuaishou.weapon.p0.dp r1 = r5.d     // Catch: java.lang.Throwable -> L91
            java.lang.String r2 = "wiipaot"
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L91
            r1.a(r2, r3, r0)     // Catch: java.lang.Throwable -> L91
            goto L80
        L7b:
            com.kuaishou.weapon.p0.t r1 = r5.f     // Catch: java.lang.Throwable -> L91
            r1.c()     // Catch: java.lang.Throwable -> L91
        L80:
            com.kuaishou.weapon.p0.n r1 = com.kuaishou.weapon.p0.n.a()     // Catch: java.lang.Throwable -> L91
            com.kuaishou.weapon.p0.u r2 = new com.kuaishou.weapon.p0.u     // Catch: java.lang.Throwable -> L91
            android.content.Context r3 = r5.e     // Catch: java.lang.Throwable -> L91
            r4 = 0
            r2.<init>(r3, r0, r4)     // Catch: java.lang.Throwable -> L91
            r1.a(r2)     // Catch: java.lang.Throwable -> L91
            monitor-exit(r5)
            return
        L91:
            monitor-exit(r5)
            return
    }

    public void b(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L7
            goto L11
        L7:
            com.kuaishou.weapon.p0.r r0 = com.kuaishou.weapon.p0.r.a()     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto Le
            goto L11
        Le:
            r0.b(r2)     // Catch: java.lang.Throwable -> L11
        L11:
            return
    }

    public void c() {
            r5 = this;
            com.kuaishou.weapon.p0.t r0 = r5.f
            java.util.List r0 = r0.a()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r0.next()
            com.kuaishou.weapon.p0.s r1 = (com.kuaishou.weapon.p0.s) r1
            com.kuaishou.weapon.p0.r r2 = com.kuaishou.weapon.p0.r.a()
            r3 = 0
            if (r2 == 0) goto L24
            java.lang.String r4 = r1.c
            com.kuaishou.weapon.p0.s r2 = r2.d(r4)
            goto L25
        L24:
            r2 = r3
        L25:
            if (r2 != 0) goto La
            int r2 = r1.a
            java.lang.String r1 = r1.d
            r5.a(r2, r1, r3)
            goto La
        L2f:
            return
    }
}
