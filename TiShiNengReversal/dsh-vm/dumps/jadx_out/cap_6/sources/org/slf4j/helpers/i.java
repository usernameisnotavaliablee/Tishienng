package org.slf4j.helpers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class i implements org.slf4j.a {
    boolean a;
    final java.util.Map<java.lang.String, org.slf4j.helpers.h> b;
    final java.util.concurrent.LinkedBlockingQueue<org.slf4j.event.d> c;

    public i() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.b = r0
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            r1.c = r0
            return
    }

    @Override // org.slf4j.a
    public synchronized org.slf4j.c a(java.lang.String r4) {
            r3 = this;
            monitor-enter(r3)
            java.util.Map<java.lang.String, org.slf4j.helpers.h> r0 = r3.b     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L1a
            org.slf4j.helpers.h r0 = (org.slf4j.helpers.h) r0     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L1c
            org.slf4j.helpers.h r0 = new org.slf4j.helpers.h     // Catch: java.lang.Throwable -> L1a
            java.util.concurrent.LinkedBlockingQueue<org.slf4j.event.d> r1 = r3.c     // Catch: java.lang.Throwable -> L1a
            boolean r2 = r3.a     // Catch: java.lang.Throwable -> L1a
            r0.<init>(r4, r1, r2)     // Catch: java.lang.Throwable -> L1a
            java.util.Map<java.lang.String, org.slf4j.helpers.h> r1 = r3.b     // Catch: java.lang.Throwable -> L1a
            r1.put(r4, r0)     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r4 = move-exception
            goto L1e
        L1c:
            monitor-exit(r3)
            return r0
        L1e:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1a
            throw r4
    }

    public void b() {
            r1 = this;
            java.util.Map<java.lang.String, org.slf4j.helpers.h> r0 = r1.b
            r0.clear()
            java.util.concurrent.LinkedBlockingQueue<org.slf4j.event.d> r0 = r1.c
            r0.clear()
            return
    }

    public java.util.concurrent.LinkedBlockingQueue<org.slf4j.event.d> c() {
            r1 = this;
            java.util.concurrent.LinkedBlockingQueue<org.slf4j.event.d> r0 = r1.c
            return r0
    }

    public java.util.List<java.lang.String> d() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Map<java.lang.String, org.slf4j.helpers.h> r1 = r2.b
            java.util.Set r1 = r1.keySet()
            r0.<init>(r1)
            return r0
    }

    public java.util.List<org.slf4j.helpers.h> e() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Map<java.lang.String, org.slf4j.helpers.h> r1 = r2.b
            java.util.Collection r1 = r1.values()
            r0.<init>(r1)
            return r0
    }

    public void f() {
            r1 = this;
            r0 = 1
            r1.a = r0
            return
    }
}
