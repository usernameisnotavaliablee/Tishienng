package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class z2<T> implements rx.e.b<T, T> {
    final long a;
    final java.util.concurrent.TimeUnit b;
    final rx.h c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T> extends rx.l<T> implements rx.functions.a {
        private static final java.lang.Object c = null;
        private final rx.l<? super T> a;
        final java.util.concurrent.atomic.AtomicReference<java.lang.Object> b;

        static {
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                rx.internal.operators.z2.a.c = r0
                return
        }

        public a(rx.l<? super T> r3) {
                r2 = this;
                r2.<init>()
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                java.lang.Object r1 = rx.internal.operators.z2.a.c
                r0.<init>(r1)
                r2.b = r0
                r2.a = r3
                return
        }

        private void g() {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r2.b
                java.lang.Object r1 = rx.internal.operators.z2.a.c
                java.lang.Object r0 = r0.getAndSet(r1)
                if (r0 == r1) goto L14
                rx.l<? super T> r1 = r2.a     // Catch: java.lang.Throwable -> L10
                r1.onNext(r0)     // Catch: java.lang.Throwable -> L10
                return
            L10:
                r0 = move-exception
                rx.exceptions.a.f(r0, r2)
            L14:
                return
        }

        public void call() {
                r0 = this;
                r0.g()
                return
        }

        public void onCompleted() {
                r1 = this;
                r1.g()
                rx.l<? super T> r0 = r1.a
                r0.onCompleted()
                r1.unsubscribe()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.l<? super T> r0 = r1.a
                r0.onError(r2)
                r1.unsubscribe()
                return
        }

        public void onNext(T r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r1.b
                r0.set(r2)
                return
        }

        public void onStart() {
                r2 = this;
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r2.request(r0)
                return
        }
    }

    public z2(long r1, java.util.concurrent.TimeUnit r3, rx.h r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r4
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            rx.l r1 = r0.call(r1)
            return r1
    }

    public rx.l<? super T> call(rx.l<? super T> r10) {
            r9 = this;
            rx.observers.g r0 = new rx.observers.g
            r0.<init>(r10)
            rx.h r1 = r9.c
            rx.h$a r2 = r1.a()
            r10.add(r2)
            rx.internal.operators.z2$a r3 = new rx.internal.operators.z2$a
            r3.<init>(r0)
            r10.add(r3)
            long r4 = r9.a
            java.util.concurrent.TimeUnit r8 = r9.b
            r6 = r4
            r2.f(r3, r4, r6, r8)
            return r3
    }
}
