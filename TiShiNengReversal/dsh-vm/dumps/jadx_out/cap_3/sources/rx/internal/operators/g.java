package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class g<T> extends rx.subjects.f<T, T> {
    static final rx.f d = null;
    final rx.internal.operators.g.c<T> b;
    private boolean c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements rx.f {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onCompleted() {
                r0 = this;
                return
        }

        public void onError(java.lang.Throwable r1) {
                r0 = this;
                return
        }

        public void onNext(java.lang.Object r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b<T> implements rx.e.a<T> {
        final rx.internal.operators.g.c<T> a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements rx.functions.a {
            final /* synthetic */ rx.internal.operators.g.b a;

            a(rx.internal.operators.g.b r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void call() {
                    r2 = this;
                    rx.internal.operators.g$b r0 = r2.a
                    rx.internal.operators.g$c<T> r0 = r0.a
                    rx.f r1 = rx.internal.operators.g.d
                    r0.set(r1)
                    return
            }
        }

        public b(rx.internal.operators.g.c<T> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
                r0 = this;
                rx.l r1 = (rx.l) r1
                r0.call(r1)
                return
        }

        public void call(rx.l<? super T> r4) {
                r3 = this;
                rx.internal.operators.g$c<T> r0 = r3.a
                r1 = 0
                boolean r0 = r0.a(r1, r4)
                if (r0 == 0) goto L5f
                rx.internal.operators.g$b$a r0 = new rx.internal.operators.g$b$a
                r0.<init>(r3)
                rx.m r0 = rx.subscriptions.f.a(r0)
                r4.add(r0)
                rx.internal.operators.g$c<T> r4 = r3.a
                java.lang.Object r0 = r4.a
                monitor-enter(r0)
                rx.internal.operators.g$c<T> r4 = r3.a     // Catch: java.lang.Throwable -> L25
                boolean r1 = r4.b     // Catch: java.lang.Throwable -> L25
                r2 = 0
                if (r1 != 0) goto L27
                r1 = 1
                r4.b = r1     // Catch: java.lang.Throwable -> L25
                goto L28
            L25:
                r4 = move-exception
                goto L5d
            L27:
                r1 = 0
            L28:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
                if (r1 == 0) goto L5c
            L2b:
                rx.internal.operators.g$c<T> r4 = r3.a
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.Object> r4 = r4.c
                java.lang.Object r4 = r4.poll()
                if (r4 == 0) goto L41
                rx.internal.operators.g$c<T> r0 = r3.a
                java.lang.Object r0 = r0.get()
                rx.f r0 = (rx.f) r0
                rx.internal.operators.v.a(r0, r4)
                goto L2b
            L41:
                rx.internal.operators.g$c<T> r4 = r3.a
                java.lang.Object r4 = r4.a
                monitor-enter(r4)
                rx.internal.operators.g$c<T> r0 = r3.a     // Catch: java.lang.Throwable -> L56
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.Object> r0 = r0.c     // Catch: java.lang.Throwable -> L56
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L56
                if (r0 == 0) goto L58
                rx.internal.operators.g$c<T> r0 = r3.a     // Catch: java.lang.Throwable -> L56
                r0.b = r2     // Catch: java.lang.Throwable -> L56
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L56
                return
            L56:
                r0 = move-exception
                goto L5a
            L58:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L56
                goto L2b
            L5a:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L56
                throw r0
            L5c:
                return
            L5d:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
                throw r4
            L5f:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Only one subscriber allowed!"
                r0.<init>(r1)
                r4.onError(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class c<T> extends java.util.concurrent.atomic.AtomicReference<rx.f<? super T>> {
        private static final long serialVersionUID = 8026705089538090368L;
        final java.lang.Object a;
        boolean b;
        final java.util.concurrent.ConcurrentLinkedQueue<java.lang.Object> c;

        c() {
                r1 = this;
                r1.<init>()
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                r1.a = r0
                java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
                r0.<init>()
                r1.c = r0
                return
        }

        boolean a(rx.f<? super T> r1, rx.f<? super T> r2) {
                r0 = this;
                boolean r1 = r0.compareAndSet(r1, r2)
                return r1
        }
    }

    static {
            rx.internal.operators.g$a r0 = new rx.internal.operators.g$a
            r0.<init>()
            rx.internal.operators.g.d = r0
            return
    }

    private g(rx.internal.operators.g.c<T> r2) {
            r1 = this;
            rx.internal.operators.g$b r0 = new rx.internal.operators.g$b
            r0.<init>(r2)
            r1.<init>(r0)
            r1.b = r2
            return
    }

    public static <T> rx.internal.operators.g<T> y7() {
            rx.internal.operators.g$c r0 = new rx.internal.operators.g$c
            r0.<init>()
            rx.internal.operators.g r1 = new rx.internal.operators.g
            r1.<init>(r0)
            return r1
    }

    private void z7(java.lang.Object r3) {
            r2 = this;
            rx.internal.operators.g$c<T> r0 = r2.b
            java.lang.Object r0 = r0.a
            monitor-enter(r0)
            rx.internal.operators.g$c<T> r1 = r2.b     // Catch: java.lang.Throwable -> L20
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Object> r1 = r1.c     // Catch: java.lang.Throwable -> L20
            r1.add(r3)     // Catch: java.lang.Throwable -> L20
            rx.internal.operators.g$c<T> r3 = r2.b     // Catch: java.lang.Throwable -> L20
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L20
            if (r3 == 0) goto L22
            rx.internal.operators.g$c<T> r3 = r2.b     // Catch: java.lang.Throwable -> L20
            boolean r1 = r3.b     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L22
            r1 = 1
            r2.c = r1     // Catch: java.lang.Throwable -> L20
            r3.b = r1     // Catch: java.lang.Throwable -> L20
            goto L22
        L20:
            r3 = move-exception
            goto L3e
        L22:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            boolean r3 = r2.c
            if (r3 == 0) goto L3d
        L27:
            rx.internal.operators.g$c<T> r3 = r2.b
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Object> r3 = r3.c
            java.lang.Object r3 = r3.poll()
            if (r3 == 0) goto L3d
            rx.internal.operators.g$c<T> r0 = r2.b
            java.lang.Object r0 = r0.get()
            rx.f r0 = (rx.f) r0
            rx.internal.operators.v.a(r0, r3)
            goto L27
        L3d:
            return
        L3e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r3
    }

    public void onCompleted() {
            r1 = this;
            boolean r0 = r1.c
            if (r0 == 0) goto L10
            rx.internal.operators.g$c<T> r0 = r1.b
            java.lang.Object r0 = r0.get()
            rx.f r0 = (rx.f) r0
            r0.onCompleted()
            return
        L10:
            java.lang.Object r0 = rx.internal.operators.v.b()
            r1.z7(r0)
            return
    }

    public void onError(java.lang.Throwable r2) {
            r1 = this;
            boolean r0 = r1.c
            if (r0 == 0) goto L10
            rx.internal.operators.g$c<T> r0 = r1.b
            java.lang.Object r0 = r0.get()
            rx.f r0 = (rx.f) r0
            r0.onError(r2)
            return
        L10:
            java.lang.Object r2 = rx.internal.operators.v.c(r2)
            r1.z7(r2)
            return
    }

    public void onNext(T r2) {
            r1 = this;
            boolean r0 = r1.c
            if (r0 == 0) goto L10
            rx.internal.operators.g$c<T> r0 = r1.b
            java.lang.Object r0 = r0.get()
            rx.f r0 = (rx.f) r0
            r0.onNext(r2)
            return
        L10:
            java.lang.Object r2 = rx.internal.operators.v.j(r2)
            r1.z7(r2)
            return
    }

    @Override // rx.subjects.f
    public boolean w7() {
            r2 = this;
            rx.internal.operators.g$c<T> r0 = r2.b
            java.lang.Object r0 = r0.a
            monitor-enter(r0)
            rx.internal.operators.g$c<T> r1 = r2.b     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = 0
        L10:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return r1
        L12:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
    }
}
