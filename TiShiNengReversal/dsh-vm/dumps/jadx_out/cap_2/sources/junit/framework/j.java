package junit.framework;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class j {
    protected java.util.List<junit.framework.h> a;
    protected java.util.List<junit.framework.h> b;
    protected java.util.List<junit.framework.i> c;
    protected int d;
    private boolean e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements junit.framework.e {
        final /* synthetic */ junit.framework.g a;
        final /* synthetic */ junit.framework.j b;

        a(junit.framework.j r1, junit.framework.g r2) throws java.lang.Throwable {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // junit.framework.e
        public void a() throws java.lang.Throwable {
                r1 = this;
                junit.framework.g r0 = r1.a
                r0.R()
                return
        }
    }

    public j() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.c = r0
            r0 = 0
            r1.d = r0
            r1.e = r0
            return
    }

    private synchronized java.util.List<junit.framework.i> d() {
            r2 = this;
            monitor-enter(r2)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld
            r0.<init>()     // Catch: java.lang.Throwable -> Ld
            java.util.List<junit.framework.i> r1 = r2.c     // Catch: java.lang.Throwable -> Ld
            r0.addAll(r1)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return r0
        Ld:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r0
    }

    public synchronized void a(junit.framework.f r3, java.lang.Throwable r4) {
            r2 = this;
            monitor-enter(r2)
            java.util.List<junit.framework.h> r0 = r2.b     // Catch: java.lang.Throwable -> L23
            junit.framework.h r1 = new junit.framework.h     // Catch: java.lang.Throwable -> L23
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L23
            r0.add(r1)     // Catch: java.lang.Throwable -> L23
            java.util.List r0 = r2.d()     // Catch: java.lang.Throwable -> L23
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L23
        L13:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L23
            junit.framework.i r1 = (junit.framework.i) r1     // Catch: java.lang.Throwable -> L23
            r1.a(r3, r4)     // Catch: java.lang.Throwable -> L23
            goto L13
        L23:
            r3 = move-exception
            goto L27
        L25:
            monitor-exit(r2)
            return
        L27:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L23
            throw r3
    }

    public synchronized void b(junit.framework.f r3, junit.framework.AssertionFailedError r4) {
            r2 = this;
            monitor-enter(r2)
            java.util.List<junit.framework.h> r0 = r2.a     // Catch: java.lang.Throwable -> L23
            junit.framework.h r1 = new junit.framework.h     // Catch: java.lang.Throwable -> L23
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L23
            r0.add(r1)     // Catch: java.lang.Throwable -> L23
            java.util.List r0 = r2.d()     // Catch: java.lang.Throwable -> L23
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L23
        L13:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L23
            junit.framework.i r1 = (junit.framework.i) r1     // Catch: java.lang.Throwable -> L23
            r1.b(r3, r4)     // Catch: java.lang.Throwable -> L23
            goto L13
        L23:
            r3 = move-exception
            goto L27
        L25:
            monitor-exit(r2)
            return
        L27:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L23
            throw r3
    }

    public synchronized void c(junit.framework.i r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.List<junit.framework.i> r0 = r1.c     // Catch: java.lang.Throwable -> L8
            r0.add(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    public void e(junit.framework.f r3) {
            r2 = this;
            java.util.List r0 = r2.d()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            junit.framework.i r1 = (junit.framework.i) r1
            r1.c(r3)
            goto L8
        L18:
            return
    }

    public synchronized int f() {
            r1 = this;
            monitor-enter(r1)
            java.util.List<junit.framework.h> r0 = r1.b     // Catch: java.lang.Throwable -> L9
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    public synchronized java.util.Enumeration<junit.framework.h> g() {
            r1 = this;
            monitor-enter(r1)
            java.util.List<junit.framework.h> r0 = r1.b     // Catch: java.lang.Throwable -> L9
            java.util.Enumeration r0 = java.util.Collections.enumeration(r0)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    public synchronized int h() {
            r1 = this;
            monitor-enter(r1)
            java.util.List<junit.framework.h> r0 = r1.a     // Catch: java.lang.Throwable -> L9
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    public synchronized java.util.Enumeration<junit.framework.h> i() {
            r1 = this;
            monitor-enter(r1)
            java.util.List<junit.framework.h> r0 = r1.a     // Catch: java.lang.Throwable -> L9
            java.util.Enumeration r0 = java.util.Collections.enumeration(r0)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    public synchronized void j(junit.framework.i r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.List<junit.framework.i> r0 = r1.c     // Catch: java.lang.Throwable -> L8
            r0.remove(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    protected void k(junit.framework.g r2) {
            r1 = this;
            r1.o(r2)
            junit.framework.j$a r0 = new junit.framework.j$a
            r0.<init>(r1, r2)
            r1.m(r2, r0)
            r1.e(r2)
            return
    }

    public synchronized int l() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.d     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public void m(junit.framework.f r1, junit.framework.e r2) {
            r0 = this;
            r2.a()     // Catch: java.lang.Throwable -> L4 java.lang.ThreadDeath -> L9 junit.framework.AssertionFailedError -> Lb
            return
        L4:
            r2 = move-exception
            r0.a(r1, r2)
            goto Lf
        L9:
            r1 = move-exception
            throw r1
        Lb:
            r2 = move-exception
            r0.b(r1, r2)
        Lf:
            return
    }

    public synchronized boolean n() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.e     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public void o(junit.framework.f r3) {
            r2 = this;
            int r0 = r3.c()
            monitor-enter(r2)
            int r1 = r2.d     // Catch: java.lang.Throwable -> L24
            int r1 = r1 + r0
            r2.d = r1     // Catch: java.lang.Throwable -> L24
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L24
            java.util.List r0 = r2.d()
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            junit.framework.i r1 = (junit.framework.i) r1
            r1.d(r3)
            goto L13
        L23:
            return
        L24:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L24
            throw r3
    }

    public synchronized void p() {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.e = r0     // Catch: java.lang.Throwable -> L6
            monitor-exit(r1)
            return
        L6:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
            throw r0
    }

    public synchronized boolean q() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.h()     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L11
            int r0 = r1.f()     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        Lf:
            r0 = move-exception
            goto L14
        L11:
            r0 = 0
        L12:
            monitor-exit(r1)
            return r0
        L14:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }
}
