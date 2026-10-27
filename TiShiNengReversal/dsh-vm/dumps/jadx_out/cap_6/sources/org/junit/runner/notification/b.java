package org.junit.runner.notification;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@org.junit.runner.notification.RunListener.ThreadSafe
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class b extends org.junit.runner.notification.RunListener {
    private final org.junit.runner.notification.RunListener a;
    private final java.lang.Object b;

    b(org.junit.runner.notification.RunListener r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // org.junit.runner.notification.RunListener
    public void a(org.junit.runner.notification.Failure r3) {
            r2 = this;
            java.lang.Object r0 = r2.b
            monitor-enter(r0)
            org.junit.runner.notification.RunListener r1 = r2.a     // Catch: java.lang.Throwable -> La
            r1.a(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    @Override // org.junit.runner.notification.RunListener
    public void b(org.junit.runner.notification.Failure r3) throws java.lang.Exception {
            r2 = this;
            java.lang.Object r0 = r2.b
            monitor-enter(r0)
            org.junit.runner.notification.RunListener r1 = r2.a     // Catch: java.lang.Throwable -> La
            r1.b(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    @Override // org.junit.runner.notification.RunListener
    public void c(org.junit.runner.Description r3) throws java.lang.Exception {
            r2 = this;
            java.lang.Object r0 = r2.b
            monitor-enter(r0)
            org.junit.runner.notification.RunListener r1 = r2.a     // Catch: java.lang.Throwable -> La
            r1.c(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    @Override // org.junit.runner.notification.RunListener
    public void d(org.junit.runner.Description r3) throws java.lang.Exception {
            r2 = this;
            java.lang.Object r0 = r2.b
            monitor-enter(r0)
            org.junit.runner.notification.RunListener r1 = r2.a     // Catch: java.lang.Throwable -> La
            r1.d(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    @Override // org.junit.runner.notification.RunListener
    public void e(org.junit.runner.Result r3) throws java.lang.Exception {
            r2 = this;
            java.lang.Object r0 = r2.b
            monitor-enter(r0)
            org.junit.runner.notification.RunListener r1 = r2.a     // Catch: java.lang.Throwable -> La
            r1.e(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof org.junit.runner.notification.b
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            org.junit.runner.notification.b r2 = (org.junit.runner.notification.b) r2
            org.junit.runner.notification.RunListener r0 = r1.a
            org.junit.runner.notification.RunListener r2 = r2.a
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // org.junit.runner.notification.RunListener
    public void f(org.junit.runner.Description r3) throws java.lang.Exception {
            r2 = this;
            java.lang.Object r0 = r2.b
            monitor-enter(r0)
            org.junit.runner.notification.RunListener r1 = r2.a     // Catch: java.lang.Throwable -> La
            r1.f(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    @Override // org.junit.runner.notification.RunListener
    public void g(org.junit.runner.Description r3) throws java.lang.Exception {
            r2 = this;
            java.lang.Object r0 = r2.b
            monitor-enter(r0)
            org.junit.runner.notification.RunListener r1 = r2.a     // Catch: java.lang.Throwable -> La
            r1.g(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    public int hashCode() {
            r1 = this;
            org.junit.runner.notification.RunListener r0 = r1.a
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            org.junit.runner.notification.RunListener r1 = r2.a
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = " (with synchronization wrapper)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
