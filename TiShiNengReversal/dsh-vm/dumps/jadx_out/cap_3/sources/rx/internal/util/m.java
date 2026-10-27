package rx.internal.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class m implements rx.m {
    private java.util.List<rx.m> a;
    private volatile boolean b;

    public m() {
            r0 = this;
            r0.<init>()
            return
    }

    public m(rx.m r2) {
            r1 = this;
            r1.<init>()
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.a = r0
            r0.add(r2)
            return
    }

    public m(rx.m... r2) {
            r1 = this;
            r1.<init>()
            java.util.LinkedList r0 = new java.util.LinkedList
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.<init>(r2)
            r1.a = r0
            return
    }

    private static void f(java.util.Collection<rx.m> r2) {
            if (r2 != 0) goto L3
            return
        L3:
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        L8:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r2.next()
            rx.m r1 = (rx.m) r1
            r1.unsubscribe()     // Catch: java.lang.Throwable -> L18
            goto L8
        L18:
            r1 = move-exception
            if (r0 != 0) goto L20
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L20:
            r0.add(r1)
            goto L8
        L24:
            rx.exceptions.a.d(r0)
            return
    }

    public void a(rx.m r2) {
            r1 = this;
            boolean r0 = r2.isUnsubscribed()
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = r1.b
            if (r0 != 0) goto L27
            monitor-enter(r1)
            boolean r0 = r1.b     // Catch: java.lang.Throwable -> L1c
            if (r0 != 0) goto L23
            java.util.List<rx.m> r0 = r1.a     // Catch: java.lang.Throwable -> L1c
            if (r0 != 0) goto L1e
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch: java.lang.Throwable -> L1c
            r0.<init>()     // Catch: java.lang.Throwable -> L1c
            r1.a = r0     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r2 = move-exception
            goto L25
        L1e:
            r0.add(r2)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
            return
        L23:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
            goto L27
        L25:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
            throw r2
        L27:
            r2.unsubscribe()
            return
    }

    public void b() {
            r2 = this;
            boolean r0 = r2.b
            if (r0 != 0) goto L12
            monitor-enter(r2)
            java.util.List<rx.m> r0 = r2.a     // Catch: java.lang.Throwable -> Lf
            r1 = 0
            r2.a = r1     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            f(r0)
            return
        Lf:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            throw r0
        L12:
            return
    }

    public boolean d() {
            r2 = this;
            boolean r0 = r2.b
            r1 = 0
            if (r0 != 0) goto L1c
            monitor-enter(r2)
            boolean r0 = r2.b     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L18
            java.util.List<rx.m> r0 = r2.a     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L18
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L18
            r1 = 1
            goto L18
        L16:
            r0 = move-exception
            goto L1a
        L18:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            return r1
        L1a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            throw r0
        L1c:
            return r1
    }

    public void e(rx.m r3) {
            r2 = this;
            boolean r0 = r2.b
            if (r0 != 0) goto L1f
            monitor-enter(r2)
            java.util.List<rx.m> r0 = r2.a     // Catch: java.lang.Throwable -> L19
            boolean r1 = r2.b     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L1b
            if (r0 != 0) goto Le
            goto L1b
        Le:
            boolean r0 = r0.remove(r3)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1f
            r3.unsubscribe()
            return
        L19:
            r3 = move-exception
            goto L1d
        L1b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            return
        L1d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            throw r3
        L1f:
            return
    }

    public boolean isUnsubscribed() {
            r1 = this;
            boolean r0 = r1.b
            return r0
    }

    public void unsubscribe() {
            r2 = this;
            boolean r0 = r2.b
            if (r0 != 0) goto L1c
            monitor-enter(r2)
            boolean r0 = r2.b     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto Ld
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r0 = move-exception
            goto L1a
        Ld:
            r0 = 1
            r2.b = r0     // Catch: java.lang.Throwable -> Lb
            java.util.List<rx.m> r0 = r2.a     // Catch: java.lang.Throwable -> Lb
            r1 = 0
            r2.a = r1     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
            f(r0)
            return
        L1a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
            throw r0
        L1c:
            return
    }
}
