package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class d4<T, U, R> implements rx.e.b<R, T> {
    static final java.lang.Object c = null;
    final rx.functions.q<? super T, ? super U, ? extends R> a;
    final rx.e<? extends U> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends rx.l<T> {
        final /* synthetic */ java.util.concurrent.atomic.AtomicReference a;
        final /* synthetic */ rx.observers.g b;
        final /* synthetic */ rx.internal.operators.d4 c;

        a(rx.internal.operators.d4 r1, rx.l r2, boolean r3, java.util.concurrent.atomic.AtomicReference r4, rx.observers.g r5) {
                r0 = this;
                r0.c = r1
                r0.a = r4
                r0.b = r5
                r0.<init>(r2, r3)
                return
        }

        public void onCompleted() {
                r1 = this;
                rx.observers.g r0 = r1.b
                r0.onCompleted()
                rx.observers.g r0 = r1.b
                r0.unsubscribe()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.observers.g r0 = r1.b
                r0.onError(r2)
                rx.observers.g r2 = r1.b
                r2.unsubscribe()
                return
        }

        public void onNext(T r3) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference r0 = r2.a
                java.lang.Object r0 = r0.get()
                java.lang.Object r1 = rx.internal.operators.d4.c
                if (r0 == r1) goto L1c
                rx.internal.operators.d4 r1 = r2.c     // Catch: java.lang.Throwable -> L18
                rx.functions.q<? super T, ? super U, ? extends R> r1 = r1.a     // Catch: java.lang.Throwable -> L18
                java.lang.Object r3 = r1.call(r3, r0)     // Catch: java.lang.Throwable -> L18
                rx.observers.g r0 = r2.b     // Catch: java.lang.Throwable -> L18
                r0.onNext(r3)     // Catch: java.lang.Throwable -> L18
                return
            L18:
                r3 = move-exception
                rx.exceptions.a.f(r3, r2)
            L1c:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends rx.l<U> {
        final /* synthetic */ java.util.concurrent.atomic.AtomicReference a;
        final /* synthetic */ rx.observers.g b;
        final /* synthetic */ rx.internal.operators.d4 c;

        b(rx.internal.operators.d4 r1, java.util.concurrent.atomic.AtomicReference r2, rx.observers.g r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        public void onCompleted() {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference r0 = r2.a
                java.lang.Object r0 = r0.get()
                java.lang.Object r1 = rx.internal.operators.d4.c
                if (r0 != r1) goto L14
                rx.observers.g r0 = r2.b
                r0.onCompleted()
                rx.observers.g r0 = r2.b
                r0.unsubscribe()
            L14:
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.observers.g r0 = r1.b
                r0.onError(r2)
                rx.observers.g r2 = r1.b
                r2.unsubscribe()
                return
        }

        public void onNext(U r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference r0 = r1.a
                r0.set(r2)
                return
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            rx.internal.operators.d4.c = r0
            return
    }

    public d4(rx.e<? extends U> r1, rx.functions.q<? super T, ? super U, ? extends R> r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.a = r2
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            rx.l r1 = r0.call(r1)
            return r1
    }

    public rx.l<? super T> call(rx.l<? super R> r7) {
            r6 = this;
            rx.observers.g r2 = new rx.observers.g
            r0 = 0
            r2.<init>(r7, r0)
            r7.add(r2)
            java.util.concurrent.atomic.AtomicReference r4 = new java.util.concurrent.atomic.AtomicReference
            java.lang.Object r7 = rx.internal.operators.d4.c
            r4.<init>(r7)
            rx.internal.operators.d4$a r0 = new rx.internal.operators.d4$a
            r3 = 1
            r5 = r2
            r1 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            rx.internal.operators.d4$b r7 = new rx.internal.operators.d4$b
            r7.<init>(r6, r4, r2)
            r2.add(r0)
            r2.add(r7)
            rx.e<? extends U> r2 = r1.b
            r2.J6(r7)
            return r0
    }
}
