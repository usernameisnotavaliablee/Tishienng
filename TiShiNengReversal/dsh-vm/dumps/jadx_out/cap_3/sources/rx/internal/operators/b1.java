package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class b1<T> implements rx.e.a<T> {
    final long a;
    final java.util.concurrent.TimeUnit b;
    final rx.h c;
    final rx.e<T> d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T> extends rx.l<T> implements rx.functions.a {
        final rx.l<? super T> a;
        volatile boolean b;

        a(rx.l<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public void call() {
                r1 = this;
                r0 = 1
                r1.b = r0
                return
        }

        public void onCompleted() {
                r1 = this;
                rx.l<? super T> r0 = r1.a     // Catch: java.lang.Throwable -> L9
                r0.onCompleted()     // Catch: java.lang.Throwable -> L9
                r1.unsubscribe()
                return
            L9:
                r0 = move-exception
                r1.unsubscribe()
                throw r0
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.l<? super T> r0 = r1.a     // Catch: java.lang.Throwable -> L9
                r0.onError(r2)     // Catch: java.lang.Throwable -> L9
                r1.unsubscribe()
                return
            L9:
                r2 = move-exception
                r1.unsubscribe()
                throw r2
        }

        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.b
                if (r0 == 0) goto L9
                rx.l<? super T> r0 = r1.a
                r0.onNext(r2)
            L9:
                return
        }
    }

    public b1(rx.e<T> r1, long r2, java.util.concurrent.TimeUnit r4, rx.h r5) {
            r0 = this;
            r0.<init>()
            r0.d = r1
            r0.a = r2
            r0.b = r4
            r0.c = r5
            return
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            r0.call(r1)
            return
    }

    public void call(rx.l<? super T> r5) {
            r4 = this;
            rx.h r0 = r4.c
            rx.h$a r0 = r0.a()
            rx.internal.operators.b1$a r1 = new rx.internal.operators.b1$a
            r1.<init>(r5)
            r1.add(r0)
            r5.add(r1)
            long r2 = r4.a
            java.util.concurrent.TimeUnit r5 = r4.b
            r0.e(r1, r2, r5)
            rx.e<T> r5 = r4.d
            r5.J6(r1)
            return
    }
}
