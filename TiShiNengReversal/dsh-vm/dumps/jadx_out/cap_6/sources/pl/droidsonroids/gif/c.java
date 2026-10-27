package pl.droidsonroids.gif;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class c {
    private volatile boolean a;

    c() {
            r0 = this;
            r0.<init>()
            return
    }

    synchronized void a() throws java.lang.InterruptedException {
            r1 = this;
            monitor-enter(r1)
        L1:
            boolean r0 = r1.a     // Catch: java.lang.Throwable -> L9
            if (r0 != 0) goto Lb
            r1.wait()     // Catch: java.lang.Throwable -> L9
            goto L1
        L9:
            r0 = move-exception
            goto Ld
        Lb:
            monitor-exit(r1)
            return
        Ld:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    synchronized void b() {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.a = r0     // Catch: java.lang.Throwable -> L6
            monitor-exit(r1)
            return
        L6:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
            throw r0
    }

    synchronized void c() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.a     // Catch: java.lang.Throwable -> Lc
            r1 = 1
            r2.a = r1     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto Le
            r2.notify()     // Catch: java.lang.Throwable -> Lc
            goto Le
        Lc:
            r0 = move-exception
            goto L10
        Le:
            monitor-exit(r2)
            return
        L10:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    synchronized void d(boolean r1) {
            r0 = this;
            monitor-enter(r0)
            if (r1 == 0) goto L9
            r0.c()     // Catch: java.lang.Throwable -> L7
            goto Lc
        L7:
            r1 = move-exception
            goto Le
        L9:
            r0.b()     // Catch: java.lang.Throwable -> L7
        Lc:
            monitor-exit(r0)
            return
        Le:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }
}
