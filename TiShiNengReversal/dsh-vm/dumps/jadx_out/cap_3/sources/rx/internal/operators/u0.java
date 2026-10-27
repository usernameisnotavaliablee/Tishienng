package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class u0<T> implements rx.i.t<T> {
    public static volatile boolean c;
    final rx.i.t<T> a;
    final java.lang.String b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T> extends rx.k<T> {
        final rx.k<? super T> b;
        final java.lang.String c;

        public a(rx.k<? super T> r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.b = r1
                r0.c = r2
                r1.b(r0)
                return
        }

        public void d(T r2) {
                r1 = this;
                rx.k<? super T> r0 = r1.b
                r0.d(r2)
                return
        }

        public void onError(java.lang.Throwable r3) {
                r2 = this;
                rx.exceptions.AssemblyStackTraceException r0 = new rx.exceptions.AssemblyStackTraceException
                java.lang.String r1 = r2.c
                r0.<init>(r1)
                r0.attachTo(r3)
                rx.k<? super T> r0 = r2.b
                r0.onError(r3)
                return
        }
    }

    public u0(rx.i.t<T> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            java.lang.String r1 = rx.internal.operators.s0.a()
            r0.b = r1
            return
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.k r1 = (rx.k) r1
            r0.call(r1)
            return
    }

    public void call(rx.k<? super T> r4) {
            r3 = this;
            rx.i$t<T> r0 = r3.a
            rx.internal.operators.u0$a r1 = new rx.internal.operators.u0$a
            java.lang.String r2 = r3.b
            r1.<init>(r4, r2)
            r0.call(r1)
            return
    }
}
