package rx.observers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class f<T> implements rx.f<T> {
    private final rx.f<? super T> a;
    private boolean b;
    private volatile boolean c;
    private rx.observers.f.a d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a {
        java.lang.Object[] a;
        int b;

        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public void a(java.lang.Object r5) {
                r4 = this;
                int r0 = r4.b
                java.lang.Object[] r1 = r4.a
                if (r1 != 0) goto Ld
                r1 = 16
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r4.a = r1
                goto L1c
            Ld:
                int r2 = r1.length
                if (r0 != r2) goto L1c
                int r2 = r0 >> 2
                int r2 = r2 + r0
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                java.lang.System.arraycopy(r1, r3, r2, r3, r0)
                r4.a = r2
                r1 = r2
            L1c:
                r1[r0] = r5
                int r0 = r0 + 1
                r4.b = r0
                return
        }
    }

    public f(rx.f<? super T> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public void onCompleted() {
            r2 = this;
            boolean r0 = r2.c
            if (r0 == 0) goto L5
            return
        L5:
            monitor-enter(r2)
            boolean r0 = r2.c     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Le
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r0 = move-exception
            goto L32
        Le:
            r0 = 1
            r2.c = r0     // Catch: java.lang.Throwable -> Lc
            boolean r1 = r2.b     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto L29
            rx.observers.f$a r0 = r2.d     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto L20
            rx.observers.f$a r0 = new rx.observers.f$a     // Catch: java.lang.Throwable -> Lc
            r0.<init>()     // Catch: java.lang.Throwable -> Lc
            r2.d = r0     // Catch: java.lang.Throwable -> Lc
        L20:
            java.lang.Object r1 = rx.internal.operators.v.b()     // Catch: java.lang.Throwable -> Lc
            r0.a(r1)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            return
        L29:
            r2.b = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            rx.f<? super T> r0 = r2.a
            r0.onCompleted()
            return
        L32:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    public void onError(java.lang.Throwable r3) {
            r2 = this;
            rx.exceptions.a.e(r3)
            boolean r0 = r2.c
            if (r0 == 0) goto L8
            return
        L8:
            monitor-enter(r2)
            boolean r0 = r2.c     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L11
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r3 = move-exception
            goto L35
        L11:
            r0 = 1
            r2.c = r0     // Catch: java.lang.Throwable -> Lf
            boolean r1 = r2.b     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L2c
            rx.observers.f$a r0 = r2.d     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L23
            rx.observers.f$a r0 = new rx.observers.f$a     // Catch: java.lang.Throwable -> Lf
            r0.<init>()     // Catch: java.lang.Throwable -> Lf
            r2.d = r0     // Catch: java.lang.Throwable -> Lf
        L23:
            java.lang.Object r3 = rx.internal.operators.v.c(r3)     // Catch: java.lang.Throwable -> Lf
            r0.a(r3)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            return
        L2c:
            r2.b = r0     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            rx.f<? super T> r0 = r2.a
            r0.onError(r3)
            return
        L35:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            throw r3
    }

    public void onNext(T r7) {
            r6 = this;
            boolean r0 = r6.c
            if (r0 == 0) goto L5
            return
        L5:
            monitor-enter(r6)
            boolean r0 = r6.c     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Le
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r7 = move-exception
            goto L73
        Le:
            boolean r0 = r6.b     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto L26
            rx.observers.f$a r0 = r6.d     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto L1d
            rx.observers.f$a r0 = new rx.observers.f$a     // Catch: java.lang.Throwable -> Lc
            r0.<init>()     // Catch: java.lang.Throwable -> Lc
            r6.d = r0     // Catch: java.lang.Throwable -> Lc
        L1d:
            java.lang.Object r7 = rx.internal.operators.v.j(r7)     // Catch: java.lang.Throwable -> Lc
            r0.a(r7)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lc
            return
        L26:
            r0 = 1
            r6.b = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lc
            rx.f<? super T> r1 = r6.a     // Catch: java.lang.Throwable -> L6a
            r1.onNext(r7)     // Catch: java.lang.Throwable -> L6a
        L2f:
            monitor-enter(r6)
            rx.observers.f$a r1 = r6.d     // Catch: java.lang.Throwable -> L39
            r2 = 0
            if (r1 != 0) goto L3b
            r6.b = r2     // Catch: java.lang.Throwable -> L39
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L39
            return
        L39:
            r7 = move-exception
            goto L68
        L3b:
            r3 = 0
            r6.d = r3     // Catch: java.lang.Throwable -> L39
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L39
            java.lang.Object[] r1 = r1.a
            int r3 = r1.length
        L42:
            if (r2 >= r3) goto L2f
            r4 = r1[r2]
            if (r4 != 0) goto L49
            goto L2f
        L49:
            rx.f<? super T> r5 = r6.a     // Catch: java.lang.Throwable -> L54
            boolean r4 = rx.internal.operators.v.a(r5, r4)     // Catch: java.lang.Throwable -> L54
            if (r4 == 0) goto L56
            r6.c = r0     // Catch: java.lang.Throwable -> L54
            return
        L54:
            r1 = move-exception
            goto L59
        L56:
            int r2 = r2 + 1
            goto L42
        L59:
            r6.c = r0
            rx.exceptions.a.e(r1)
            rx.f<? super T> r0 = r6.a
            java.lang.Throwable r7 = rx.exceptions.OnErrorThrowable.addValueAsLastCause(r1, r7)
            r0.onError(r7)
            return
        L68:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L39
            throw r7
        L6a:
            r1 = move-exception
            r6.c = r0
            rx.f<? super T> r0 = r6.a
            rx.exceptions.a.g(r1, r0, r7)
            return
        L73:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lc
            throw r7
    }
}
