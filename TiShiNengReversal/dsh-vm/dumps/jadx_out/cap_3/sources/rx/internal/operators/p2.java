package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class p2<T, R> extends rx.observables.c<R> {
    final rx.e<? extends T> b;
    final java.lang.Object c;
    final rx.functions.o<? extends rx.subjects.f<? super T, ? extends R>> d;
    final java.util.concurrent.atomic.AtomicReference<rx.subjects.f<? super T, ? extends R>> e;
    final java.util.List<rx.l<? super R>> f;
    rx.l<T> g;
    rx.m h;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements rx.e.a<R> {
        final /* synthetic */ java.lang.Object a;
        final /* synthetic */ java.util.concurrent.atomic.AtomicReference b;
        final /* synthetic */ java.util.List c;

        a(java.lang.Object r1, java.util.concurrent.atomic.AtomicReference r2, java.util.List r3) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
                r0 = this;
                rx.l r1 = (rx.l) r1
                r0.call(r1)
                return
        }

        public void call(rx.l<? super R> r3) {
                r2 = this;
                java.lang.Object r0 = r2.a
                monitor-enter(r0)
                java.util.concurrent.atomic.AtomicReference r1 = r2.b     // Catch: java.lang.Throwable -> L11
                java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L11
                if (r1 != 0) goto L13
                java.util.List r1 = r2.c     // Catch: java.lang.Throwable -> L11
                r1.add(r3)     // Catch: java.lang.Throwable -> L11
                goto L1e
            L11:
                r3 = move-exception
                goto L20
            L13:
                java.util.concurrent.atomic.AtomicReference r1 = r2.b     // Catch: java.lang.Throwable -> L11
                java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L11
                rx.subjects.f r1 = (rx.subjects.f) r1     // Catch: java.lang.Throwable -> L11
                r1.J6(r3)     // Catch: java.lang.Throwable -> L11
            L1e:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
                return
            L20:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
                throw r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements rx.functions.a {
        final /* synthetic */ java.util.concurrent.atomic.AtomicReference a;
        final /* synthetic */ rx.internal.operators.p2 b;

        b(rx.internal.operators.p2 r1, java.util.concurrent.atomic.AtomicReference r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void call() {
                r4 = this;
                rx.internal.operators.p2 r0 = r4.b
                java.lang.Object r0 = r0.c
                monitor-enter(r0)
                rx.internal.operators.p2 r1 = r4.b     // Catch: java.lang.Throwable -> L26
                rx.m r1 = r1.h     // Catch: java.lang.Throwable -> L26
                java.util.concurrent.atomic.AtomicReference r2 = r4.a     // Catch: java.lang.Throwable -> L26
                java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L26
                if (r1 != r2) goto L28
                rx.internal.operators.p2 r1 = r4.b     // Catch: java.lang.Throwable -> L26
                rx.l<T> r2 = r1.g     // Catch: java.lang.Throwable -> L26
                r3 = 0
                r1.g = r3     // Catch: java.lang.Throwable -> L26
                r1.h = r3     // Catch: java.lang.Throwable -> L26
                java.util.concurrent.atomic.AtomicReference<rx.subjects.f<? super T, ? extends R>> r1 = r1.e     // Catch: java.lang.Throwable -> L26
                r1.set(r3)     // Catch: java.lang.Throwable -> L26
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
                if (r2 == 0) goto L25
                r2.unsubscribe()
            L25:
                return
            L26:
                r1 = move-exception
                goto L2a
            L28:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
                return
            L2a:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
                throw r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends rx.l<R> {
        final /* synthetic */ rx.l a;
        final /* synthetic */ rx.internal.operators.p2 b;

        c(rx.internal.operators.p2 r1, rx.l r2, rx.l r3) {
                r0 = this;
                r0.b = r1
                r0.a = r3
                r0.<init>(r2)
                return
        }

        public void onCompleted() {
                r1 = this;
                rx.l r0 = r1.a
                r0.onCompleted()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.l r0 = r1.a
                r0.onError(r2)
                return
        }

        public void onNext(R r2) {
                r1 = this;
                rx.l r0 = r1.a
                r0.onNext(r2)
                return
        }
    }

    private p2(java.lang.Object r2, java.util.concurrent.atomic.AtomicReference<rx.subjects.f<? super T, ? extends R>> r3, java.util.List<rx.l<? super R>> r4, rx.e<? extends T> r5, rx.functions.o<? extends rx.subjects.f<? super T, ? extends R>> r6) {
            r1 = this;
            rx.internal.operators.p2$a r0 = new rx.internal.operators.p2$a
            r0.<init>(r2, r3, r4)
            r1.<init>(r0)
            r1.c = r2
            r1.e = r3
            r1.f = r4
            r1.b = r5
            r1.d = r6
            return
    }

    public p2(rx.e<? extends T> r7, rx.functions.o<? extends rx.subjects.f<? super T, ? extends R>> r8) {
            r6 = this;
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0 = r6
            r4 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // rx.observables.c
    public void A7(rx.functions.b<? super rx.m> r6) {
            r5 = this;
            java.lang.Object r0 = r5.c
            monitor-enter(r0)
            rx.l<T> r1 = r5.g     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L10
            rx.m r1 = r5.h     // Catch: java.lang.Throwable -> Le
            r6.call(r1)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r6 = move-exception
            goto L73
        L10:
            rx.functions.o<? extends rx.subjects.f<? super T, ? extends R>> r1 = r5.d     // Catch: java.lang.Throwable -> Le
            java.lang.Object r1 = r1.call()     // Catch: java.lang.Throwable -> Le
            rx.subjects.f r1 = (rx.subjects.f) r1     // Catch: java.lang.Throwable -> Le
            rx.l r2 = rx.observers.h.e(r1)     // Catch: java.lang.Throwable -> Le
            r5.g = r2     // Catch: java.lang.Throwable -> Le
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference     // Catch: java.lang.Throwable -> Le
            r2.<init>()     // Catch: java.lang.Throwable -> Le
            rx.internal.operators.p2$b r3 = new rx.internal.operators.p2$b     // Catch: java.lang.Throwable -> Le
            r3.<init>(r5, r2)     // Catch: java.lang.Throwable -> Le
            rx.m r3 = rx.subscriptions.f.a(r3)     // Catch: java.lang.Throwable -> Le
            r2.set(r3)     // Catch: java.lang.Throwable -> Le
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> Le
            rx.m r2 = (rx.m) r2     // Catch: java.lang.Throwable -> Le
            r5.h = r2     // Catch: java.lang.Throwable -> Le
            java.util.List<rx.l<? super R>> r2 = r5.f     // Catch: java.lang.Throwable -> Le
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Le
        L3d:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Le
            if (r3 == 0) goto L52
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Le
            rx.l r3 = (rx.l) r3     // Catch: java.lang.Throwable -> Le
            rx.internal.operators.p2$c r4 = new rx.internal.operators.p2$c     // Catch: java.lang.Throwable -> Le
            r4.<init>(r5, r3, r3)     // Catch: java.lang.Throwable -> Le
            r1.J6(r4)     // Catch: java.lang.Throwable -> Le
            goto L3d
        L52:
            java.util.List<rx.l<? super R>> r2 = r5.f     // Catch: java.lang.Throwable -> Le
            r2.clear()     // Catch: java.lang.Throwable -> Le
            java.util.concurrent.atomic.AtomicReference<rx.subjects.f<? super T, ? extends R>> r2 = r5.e     // Catch: java.lang.Throwable -> Le
            r2.set(r1)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            rx.m r0 = r5.h
            r6.call(r0)
            java.lang.Object r6 = r5.c
            monitor-enter(r6)
            rx.l<T> r0 = r5.g     // Catch: java.lang.Throwable -> L70
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L6f
            rx.e<? extends T> r6 = r5.b
            r6.r5(r0)
        L6f:
            return
        L70:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L70
            throw r0
        L73:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r6
    }
}
