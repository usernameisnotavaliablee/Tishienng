package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class x0<T> implements rx.e.a<T> {
    final rx.e<T> a;
    final rx.functions.q<T, T, T> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements rx.g {
        final /* synthetic */ rx.internal.operators.x0.b a;
        final /* synthetic */ rx.internal.operators.x0 b;

        a(rx.internal.operators.x0 r1, rx.internal.operators.x0.b r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void request(long r2) {
                r1 = this;
                rx.internal.operators.x0$b r0 = r1.a
                r0.g(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b<T> extends rx.l<T> {
        static final java.lang.Object e = null;
        final rx.l<? super T> a;
        final rx.functions.q<T, T, T> b;
        T c;
        boolean d;

        static {
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                rx.internal.operators.x0.b.e = r0
                return
        }

        public b(rx.l<? super T> r1, rx.functions.q<T, T, T> r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                java.lang.Object r1 = rx.internal.operators.x0.b.e
                r0.c = r1
                r1 = 0
                r0.request(r1)
                return
        }

        void g(long r4) {
                r3 = this;
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 < 0) goto L11
                if (r2 == 0) goto L10
                r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r4)
            L10:
                return
            L11:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "n >= 0 required but it was "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        public void onCompleted() {
                r2 = this;
                boolean r0 = r2.d
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r2.d = r0
                T r0 = r2.c
                java.lang.Object r1 = rx.internal.operators.x0.b.e
                if (r0 == r1) goto L19
                rx.l<? super T> r1 = r2.a
                r1.onNext(r0)
                rx.l<? super T> r0 = r2.a
                r0.onCompleted()
                return
            L19:
                rx.l<? super T> r0 = r2.a
                java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
                r1.<init>()
                r0.onError(r1)
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.d
                if (r0 != 0) goto Ld
                r0 = 1
                r1.d = r0
                rx.l<? super T> r0 = r1.a
                r0.onError(r2)
                return
            Ld:
                rx.plugins.c.I(r2)
                return
        }

        public void onNext(T r3) {
                r2 = this;
                boolean r0 = r2.d
                if (r0 == 0) goto L5
                return
            L5:
                T r0 = r2.c
                java.lang.Object r1 = rx.internal.operators.x0.b.e
                if (r0 != r1) goto Le
                r2.c = r3
                return
            Le:
                rx.functions.q<T, T, T> r1 = r2.b     // Catch: java.lang.Throwable -> L17
                java.lang.Object r3 = r1.call(r0, r3)     // Catch: java.lang.Throwable -> L17
                r2.c = r3     // Catch: java.lang.Throwable -> L17
                return
            L17:
                r3 = move-exception
                rx.exceptions.a.e(r3)
                r2.unsubscribe()
                r2.onError(r3)
                return
        }
    }

    public x0(rx.e<T> r1, rx.functions.q<T, T, T> r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            r0.call(r1)
            return
    }

    public void call(rx.l<? super T> r3) {
            r2 = this;
            rx.internal.operators.x0$b r0 = new rx.internal.operators.x0$b
            rx.functions.q<T, T, T> r1 = r2.b
            r0.<init>(r3, r1)
            r3.add(r0)
            rx.internal.operators.x0$a r1 = new rx.internal.operators.x0$a
            r1.<init>(r2, r0)
            r3.setProducer(r1)
            rx.e<T> r3 = r2.a
            r3.J6(r0)
            return
    }
}
