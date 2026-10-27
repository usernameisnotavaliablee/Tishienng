package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class z4<T> implements rx.i.t<T> {
    final rx.i.t<T> a;
    final rx.b b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T> extends rx.k<T> implements rx.d {
        final rx.k<? super T> b;
        final java.util.concurrent.atomic.AtomicBoolean c;

        a(rx.k<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.b = r1
                java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
                r1.<init>()
                r0.c = r1
                return
        }

        public void a(rx.m r1) {
                r0 = this;
                r0.b(r1)
                return
        }

        public void d(T r4) {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.c
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L12
                r3.unsubscribe()
                rx.k<? super T> r0 = r3.b
                r0.d(r4)
            L12:
                return
        }

        public void onCompleted() {
                r2 = this;
                java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
                java.lang.String r1 = "Single::takeUntil(Completable) - Stream was canceled before emitting a terminal event."
                r0.<init>(r1)
                r2.onError(r0)
                return
        }

        public void onError(java.lang.Throwable r4) {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.c
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L13
                r3.unsubscribe()
                rx.k<? super T> r0 = r3.b
                r0.onError(r4)
                return
            L13:
                rx.plugins.c.I(r4)
                return
        }
    }

    public z4(rx.i.t<T> r1, rx.b r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.k r1 = (rx.k) r1
            r0.call(r1)
            return
    }

    public void call(rx.k<? super T> r2) {
            r1 = this;
            rx.internal.operators.z4$a r0 = new rx.internal.operators.z4$a
            r0.<init>(r2)
            r2.b(r0)
            rx.b r2 = r1.b
            r2.q0(r0)
            rx.i$t<T> r2 = r1.a
            r2.call(r0)
            return
    }
}
