package junit.extensions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class a extends junit.framework.k {
    private volatile int c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: junit.extensions.a$a, reason: collision with other inner class name */
    class C0011a extends java.lang.Thread {
        final /* synthetic */ junit.framework.f a;
        final /* synthetic */ junit.framework.j b;
        final /* synthetic */ junit.extensions.a c;

        C0011a(junit.extensions.a r1, junit.framework.f r2, junit.framework.j r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r2 = this;
                junit.framework.f r0 = r2.a     // Catch: java.lang.Throwable -> Ld
                junit.framework.j r1 = r2.b     // Catch: java.lang.Throwable -> Ld
                r0.a(r1)     // Catch: java.lang.Throwable -> Ld
                junit.extensions.a r0 = r2.c
                r0.t()
                return
            Ld:
                r0 = move-exception
                junit.extensions.a r1 = r2.c
                r1.t()
                throw r0
        }
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public a(java.lang.Class<? extends junit.framework.g> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public a(java.lang.Class<? extends junit.framework.g> r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public a(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // junit.framework.k, junit.framework.f
    public void a(junit.framework.j r2) {
            r1 = this;
            r0 = 0
            r1.c = r0
            super.a(r2)
            r1.u()
            return
    }

    @Override // junit.framework.k
    public void m(junit.framework.f r2, junit.framework.j r3) {
            r1 = this;
            junit.extensions.a$a r0 = new junit.extensions.a$a
            r0.<init>(r1, r2, r3)
            r0.start()
            return
    }

    public synchronized void t() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.c     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + 1
            r1.c = r0     // Catch: java.lang.Throwable -> Lc
            r1.notifyAll()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        Lc:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    synchronized void u() {
            r2 = this;
            monitor-enter(r2)
        L1:
            int r0 = r2.c     // Catch: java.lang.Throwable -> Ld
            int r1 = r2.q()     // Catch: java.lang.Throwable -> Ld
            if (r0 >= r1) goto L11
            r2.wait()     // Catch: java.lang.Throwable -> Ld java.lang.InterruptedException -> Lf
            goto L1
        Ld:
            r0 = move-exception
            goto L13
        Lf:
            monitor-exit(r2)
            return
        L11:
            monitor-exit(r2)
            return
        L13:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r0
    }
}
