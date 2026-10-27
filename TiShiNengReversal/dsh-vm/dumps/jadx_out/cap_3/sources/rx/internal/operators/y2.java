package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class y2<T, U> implements rx.e.b<T, T> {
    static final java.lang.Object b = null;
    final rx.e<U> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends rx.l<U> {
        final /* synthetic */ java.util.concurrent.atomic.AtomicReference a;
        final /* synthetic */ rx.observers.g b;
        final /* synthetic */ java.util.concurrent.atomic.AtomicReference c;
        final /* synthetic */ rx.internal.operators.y2 d;

        a(rx.internal.operators.y2 r1, java.util.concurrent.atomic.AtomicReference r2, rx.observers.g r3, java.util.concurrent.atomic.AtomicReference r4) {
                r0 = this;
                r0.d = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.<init>()
                return
        }

        public void onCompleted() {
                r1 = this;
                r0 = 0
                r1.onNext(r0)
                rx.observers.g r0 = r1.b
                r0.onCompleted()
                java.util.concurrent.atomic.AtomicReference r0 = r1.c
                java.lang.Object r0 = r0.get()
                rx.m r0 = (rx.m) r0
                r0.unsubscribe()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.observers.g r0 = r1.b
                r0.onError(r2)
                java.util.concurrent.atomic.AtomicReference r2 = r1.c
                java.lang.Object r2 = r2.get()
                rx.m r2 = (rx.m) r2
                r2.unsubscribe()
                return
        }

        public void onNext(U r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference r2 = r1.a
                java.lang.Object r0 = rx.internal.operators.y2.b
                java.lang.Object r2 = r2.getAndSet(r0)
                if (r2 == r0) goto Lf
                rx.observers.g r0 = r1.b
                r0.onNext(r2)
            Lf:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends rx.l<T> {
        final /* synthetic */ java.util.concurrent.atomic.AtomicReference a;
        final /* synthetic */ rx.observers.g b;
        final /* synthetic */ rx.l c;
        final /* synthetic */ rx.internal.operators.y2 d;

        b(rx.internal.operators.y2 r1, java.util.concurrent.atomic.AtomicReference r2, rx.observers.g r3, rx.l r4) {
                r0 = this;
                r0.d = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.<init>()
                return
        }

        public void onCompleted() {
                r2 = this;
                rx.l r0 = r2.c
                r1 = 0
                r0.onNext(r1)
                rx.observers.g r0 = r2.b
                r0.onCompleted()
                rx.l r0 = r2.c
                r0.unsubscribe()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.observers.g r0 = r1.b
                r0.onError(r2)
                rx.l r2 = r1.c
                r2.unsubscribe()
                return
        }

        public void onNext(T r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference r0 = r1.a
                r0.set(r2)
                return
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            rx.internal.operators.y2.b = r0
            return
    }

    public y2(rx.e<U> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            rx.l r1 = r0.call(r1)
            return r1
    }

    public rx.l<? super T> call(rx.l<? super T> r6) {
            r5 = this;
            rx.observers.g r0 = new rx.observers.g
            r0.<init>(r6)
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            java.lang.Object r2 = rx.internal.operators.y2.b
            r1.<init>(r2)
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            rx.internal.operators.y2$a r3 = new rx.internal.operators.y2$a
            r3.<init>(r5, r1, r0, r2)
            rx.internal.operators.y2$b r4 = new rx.internal.operators.y2$b
            r4.<init>(r5, r1, r0, r3)
            r2.lazySet(r4)
            r6.add(r4)
            r6.add(r3)
            rx.e<U> r6 = r5.a
            r6.J6(r3)
            return r4
    }
}
