package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class r4<T> implements rx.i.t<T> {
    final rx.i.t<T> a;
    final rx.h b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T> extends rx.k<T> implements rx.functions.a {
        final rx.k<? super T> b;
        final rx.h.a c;
        T d;
        java.lang.Throwable e;

        public a(rx.k<? super T> r1, rx.h.a r2) {
                r0 = this;
                r0.<init>()
                r0.b = r1
                r0.c = r2
                return
        }

        public void call() {
                r2 = this;
                java.lang.Throwable r0 = r2.e     // Catch: java.lang.Throwable -> Ld
                r1 = 0
                if (r0 == 0) goto Lf
                r2.e = r1     // Catch: java.lang.Throwable -> Ld
                rx.k<? super T> r1 = r2.b     // Catch: java.lang.Throwable -> Ld
                r1.onError(r0)     // Catch: java.lang.Throwable -> Ld
                goto L18
            Ld:
                r0 = move-exception
                goto L1e
            Lf:
                T r0 = r2.d     // Catch: java.lang.Throwable -> Ld
                r2.d = r1     // Catch: java.lang.Throwable -> Ld
                rx.k<? super T> r1 = r2.b     // Catch: java.lang.Throwable -> Ld
                r1.d(r0)     // Catch: java.lang.Throwable -> Ld
            L18:
                rx.h$a r0 = r2.c
                r0.unsubscribe()
                return
            L1e:
                rx.h$a r1 = r2.c
                r1.unsubscribe()
                throw r0
        }

        public void d(T r1) {
                r0 = this;
                r0.d = r1
                rx.h$a r1 = r0.c
                r1.d(r0)
                return
        }

        public void onError(java.lang.Throwable r1) {
                r0 = this;
                r0.e = r1
                rx.h$a r1 = r0.c
                r1.d(r0)
                return
        }
    }

    public r4(rx.i.t<T> r1, rx.h r2) {
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

    public void call(rx.k<? super T> r3) {
            r2 = this;
            rx.h r0 = r2.b
            rx.h$a r0 = r0.a()
            rx.internal.operators.r4$a r1 = new rx.internal.operators.r4$a
            r1.<init>(r3, r0)
            r3.b(r0)
            r3.b(r1)
            rx.i$t<T> r3 = r2.a
            r3.call(r1)
            return
    }
}
