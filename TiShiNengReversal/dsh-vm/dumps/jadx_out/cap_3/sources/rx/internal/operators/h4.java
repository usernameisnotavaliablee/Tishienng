package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class h4<T> implements rx.i.t<T> {
    final rx.i.t<T> a;
    final long b;
    final java.util.concurrent.TimeUnit c;
    final rx.h d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T> extends rx.k<T> implements rx.functions.a {
        final rx.k<? super T> b;
        final rx.h.a c;
        final long d;
        final java.util.concurrent.TimeUnit e;
        T f;
        java.lang.Throwable g;

        public a(rx.k<? super T> r1, rx.h.a r2, long r3, java.util.concurrent.TimeUnit r5) {
                r0 = this;
                r0.<init>()
                r0.b = r1
                r0.c = r2
                r0.d = r3
                r0.e = r5
                return
        }

        public void call() {
                r2 = this;
                java.lang.Throwable r0 = r2.g     // Catch: java.lang.Throwable -> Ld
                r1 = 0
                if (r0 == 0) goto Lf
                r2.g = r1     // Catch: java.lang.Throwable -> Ld
                rx.k<? super T> r1 = r2.b     // Catch: java.lang.Throwable -> Ld
                r1.onError(r0)     // Catch: java.lang.Throwable -> Ld
                goto L18
            Ld:
                r0 = move-exception
                goto L1e
            Lf:
                T r0 = r2.f     // Catch: java.lang.Throwable -> Ld
                r2.f = r1     // Catch: java.lang.Throwable -> Ld
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

        public void d(T r4) {
                r3 = this;
                r3.f = r4
                rx.h$a r4 = r3.c
                long r0 = r3.d
                java.util.concurrent.TimeUnit r2 = r3.e
                r4.e(r3, r0, r2)
                return
        }

        public void onError(java.lang.Throwable r4) {
                r3 = this;
                r3.g = r4
                rx.h$a r4 = r3.c
                long r0 = r3.d
                java.util.concurrent.TimeUnit r2 = r3.e
                r4.e(r3, r0, r2)
                return
        }
    }

    public h4(rx.i.t<T> r1, long r2, java.util.concurrent.TimeUnit r4, rx.h r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.d = r5
            r0.b = r2
            r0.c = r4
            return
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.k r1 = (rx.k) r1
            r0.call(r1)
            return
    }

    public void call(rx.k<? super T> r8) {
            r7 = this;
            rx.h r0 = r7.d
            rx.h$a r3 = r0.a()
            rx.internal.operators.h4$a r1 = new rx.internal.operators.h4$a
            long r4 = r7.b
            java.util.concurrent.TimeUnit r6 = r7.c
            r2 = r8
            r1.<init>(r2, r3, r4, r6)
            r2.b(r3)
            r2.b(r1)
            rx.i$t<T> r8 = r7.a
            r8.call(r1)
            return
    }
}
