package com.bxkj.base.runtimepermissions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class c {
    private static final java.lang.String c = "c";
    private final java.util.Set<java.lang.String> a;
    private android.os.Looper b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements java.lang.Runnable {
        final /* synthetic */ com.bxkj.base.runtimepermissions.c a;

        a(com.bxkj.base.runtimepermissions.c r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                com.bxkj.base.runtimepermissions.c r0 = r1.a
                r0.b()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements java.lang.Runnable {
        final /* synthetic */ java.lang.String a;
        final /* synthetic */ com.bxkj.base.runtimepermissions.c b;

        b(com.bxkj.base.runtimepermissions.c r1, java.lang.String r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                com.bxkj.base.runtimepermissions.c r0 = r2.b
                java.lang.String r1 = r2.a
                r0.a(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.bxkj.base.runtimepermissions.c$c, reason: collision with other inner class name */
    class RunnableC0053c implements java.lang.Runnable {
        final /* synthetic */ com.bxkj.base.runtimepermissions.c a;

        RunnableC0053c(com.bxkj.base.runtimepermissions.c r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                com.bxkj.base.runtimepermissions.c r0 = r1.a
                r0.b()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements java.lang.Runnable {
        final /* synthetic */ java.lang.String a;
        final /* synthetic */ com.bxkj.base.runtimepermissions.c b;

        d(com.bxkj.base.runtimepermissions.c r1, java.lang.String r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                com.bxkj.base.runtimepermissions.c r0 = r2.b
                java.lang.String r1 = r2.a
                r0.a(r1)
                return
        }
    }

    static {
            return
    }

    public c() {
            r2 = this;
            r2.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r1 = 1
            r0.<init>(r1)
            r2.a = r0
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r2.b = r0
            return
    }

    public c(@androidx.annotation.NonNull android.os.Looper r3) {
            r2 = this;
            r2.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r1 = 1
            r0.<init>(r1)
            r2.a = r0
            android.os.Looper.getMainLooper()
            r2.b = r3
            return
    }

    public abstract void a(java.lang.String r1);

    public abstract void b();

    @androidx.annotation.CallSuper
    protected final synchronized boolean c(@androidx.annotation.NonNull java.lang.String r1, int r2) {
            r0 = this;
            monitor-enter(r0)
            if (r2 != 0) goto Ld
            com.bxkj.base.runtimepermissions.a r2 = com.bxkj.base.runtimepermissions.a.a     // Catch: java.lang.Throwable -> Lb
            boolean r1 = r0.d(r1, r2)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return r1
        Lb:
            r1 = move-exception
            goto L15
        Ld:
            com.bxkj.base.runtimepermissions.a r2 = com.bxkj.base.runtimepermissions.a.b     // Catch: java.lang.Throwable -> Lb
            boolean r1 = r0.d(r1, r2)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return r1
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @androidx.annotation.CallSuper
    protected final synchronized boolean d(@androidx.annotation.NonNull java.lang.String r3, com.bxkj.base.runtimepermissions.a r4) {
            r2 = this;
            monitor-enter(r2)
            java.util.Set<java.lang.String> r0 = r2.a     // Catch: java.lang.Throwable -> L24
            r0.remove(r3)     // Catch: java.lang.Throwable -> L24
            com.bxkj.base.runtimepermissions.a r0 = com.bxkj.base.runtimepermissions.a.a     // Catch: java.lang.Throwable -> L24
            r1 = 1
            if (r4 != r0) goto L26
            java.util.Set<java.lang.String> r3 = r2.a     // Catch: java.lang.Throwable -> L24
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L6f
            android.os.Handler r3 = new android.os.Handler     // Catch: java.lang.Throwable -> L24
            android.os.Looper r4 = r2.b     // Catch: java.lang.Throwable -> L24
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L24
            com.bxkj.base.runtimepermissions.c$a r4 = new com.bxkj.base.runtimepermissions.c$a     // Catch: java.lang.Throwable -> L24
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L24
            r3.post(r4)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r2)
            return r1
        L24:
            r3 = move-exception
            goto L72
        L26:
            com.bxkj.base.runtimepermissions.a r0 = com.bxkj.base.runtimepermissions.a.b     // Catch: java.lang.Throwable -> L24
            if (r4 != r0) goto L3b
            android.os.Handler r4 = new android.os.Handler     // Catch: java.lang.Throwable -> L24
            android.os.Looper r0 = r2.b     // Catch: java.lang.Throwable -> L24
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L24
            com.bxkj.base.runtimepermissions.c$b r0 = new com.bxkj.base.runtimepermissions.c$b     // Catch: java.lang.Throwable -> L24
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L24
            r4.post(r0)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r2)
            return r1
        L3b:
            com.bxkj.base.runtimepermissions.a r0 = com.bxkj.base.runtimepermissions.a.c     // Catch: java.lang.Throwable -> L24
            if (r4 != r0) goto L6f
            boolean r4 = r2.f(r3)     // Catch: java.lang.Throwable -> L24
            if (r4 == 0) goto L5e
            java.util.Set<java.lang.String> r3 = r2.a     // Catch: java.lang.Throwable -> L24
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L6f
            android.os.Handler r3 = new android.os.Handler     // Catch: java.lang.Throwable -> L24
            android.os.Looper r4 = r2.b     // Catch: java.lang.Throwable -> L24
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L24
            com.bxkj.base.runtimepermissions.c$c r4 = new com.bxkj.base.runtimepermissions.c$c     // Catch: java.lang.Throwable -> L24
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L24
            r3.post(r4)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r2)
            return r1
        L5e:
            android.os.Handler r4 = new android.os.Handler     // Catch: java.lang.Throwable -> L24
            android.os.Looper r0 = r2.b     // Catch: java.lang.Throwable -> L24
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L24
            com.bxkj.base.runtimepermissions.c$d r0 = new com.bxkj.base.runtimepermissions.c$d     // Catch: java.lang.Throwable -> L24
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L24
            r4.post(r0)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r2)
            return r1
        L6f:
            monitor-exit(r2)
            r3 = 0
            return r3
        L72:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L24
            throw r3
    }

    @androidx.annotation.CallSuper
    protected final synchronized void e(@androidx.annotation.NonNull java.lang.String[] r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Set<java.lang.String> r0 = r1.a     // Catch: java.lang.Throwable -> L8
            java.util.Collections.addAll(r0, r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    public synchronized boolean f(java.lang.String r1) {
            r0 = this;
            monitor-enter(r0)
            monitor-exit(r0)
            r1 = 1
            return r1
    }
}
