package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class o3<T> implements rx.e.b<T, T> {
    final long a;
    final java.util.concurrent.TimeUnit b;
    final rx.h c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T> extends rx.l<T> implements rx.functions.a {
        final rx.l<? super T> a;

        public a(rx.l<? super T> r1) {
                r0 = this;
                r0.<init>(r1)
                r0.a = r1
                return
        }

        public void call() {
                r0 = this;
                r0.onCompleted()
                return
        }

        public void onCompleted() {
                r1 = this;
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
                rx.l<? super T> r0 = r1.a
                r0.onNext(r2)
                return
        }
    }

    public o3(long r1, java.util.concurrent.TimeUnit r3, rx.h r4) {
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

    public rx.l<? super T> call(rx.l<? super T> r5) {
            r4 = this;
            rx.h r0 = r4.c
            rx.h$a r0 = r0.a()
            r5.add(r0)
            rx.internal.operators.o3$a r1 = new rx.internal.operators.o3$a
            rx.observers.g r2 = new rx.observers.g
            r2.<init>(r5)
            r1.<init>(r2)
            long r2 = r4.a
            java.util.concurrent.TimeUnit r5 = r4.b
            r0.e(r1, r2, r5)
            return r1
    }
}
