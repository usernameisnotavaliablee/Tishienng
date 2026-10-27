package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class h3<T, U> implements rx.e.b<T, T> {
    final rx.e<U> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends rx.l<U> {
        final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean a;
        final /* synthetic */ rx.observers.g b;
        final /* synthetic */ rx.internal.operators.h3 c;

        a(rx.internal.operators.h3 r1, java.util.concurrent.atomic.AtomicBoolean r2, rx.observers.g r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        public void onCompleted() {
                r0 = this;
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

        public void onNext(U r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicBoolean r2 = r1.a
                r0 = 1
                r2.set(r0)
                r1.unsubscribe()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends rx.l<T> {
        final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean a;
        final /* synthetic */ rx.observers.g b;
        final /* synthetic */ rx.internal.operators.h3 c;

        b(rx.internal.operators.h3 r1, rx.l r2, java.util.concurrent.atomic.AtomicBoolean r3, rx.observers.g r4) {
                r0 = this;
                r0.c = r1
                r0.a = r3
                r0.b = r4
                r0.<init>(r2)
                return
        }

        public void onCompleted() {
                r1 = this;
                rx.observers.g r0 = r1.b
                r0.onCompleted()
                r1.unsubscribe()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.observers.g r0 = r1.b
                r0.onError(r2)
                r1.unsubscribe()
                return
        }

        public void onNext(T r3) {
                r2 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r2.a
                boolean r0 = r0.get()
                if (r0 == 0) goto Le
                rx.observers.g r0 = r2.b
                r0.onNext(r3)
                return
            Le:
                r0 = 1
                r2.request(r0)
                return
        }
    }

    public h3(rx.e<U> r1) {
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

    public rx.l<? super T> call(rx.l<? super T> r5) {
            r4 = this;
            rx.observers.g r0 = new rx.observers.g
            r0.<init>(r5)
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r1.<init>()
            rx.internal.operators.h3$a r2 = new rx.internal.operators.h3$a
            r2.<init>(r4, r1, r0)
            r5.add(r2)
            rx.e<U> r3 = r4.a
            r3.J6(r2)
            rx.internal.operators.h3$b r2 = new rx.internal.operators.h3$b
            r2.<init>(r4, r5, r1, r0)
            return r2
    }
}
