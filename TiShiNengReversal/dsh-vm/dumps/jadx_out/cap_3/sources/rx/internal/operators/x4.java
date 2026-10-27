package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class x4<T> implements rx.i.t<T> {
    private final rx.i<? extends T> a;
    final rx.functions.p<java.lang.Throwable, ? extends rx.i<? extends T>> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements rx.functions.p<java.lang.Throwable, rx.i<? extends T>> {
        final /* synthetic */ rx.i a;

        a(rx.i r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                rx.i r1 = r0.call(r1)
                return r1
        }

        public rx.i<? extends T> call(java.lang.Throwable r1) {
                r0 = this;
                rx.i r1 = r0.a
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends rx.k<T> {
        final /* synthetic */ rx.k b;
        final /* synthetic */ rx.internal.operators.x4 c;

        b(rx.internal.operators.x4 r1, rx.k r2) {
                r0 = this;
                r0.c = r1
                r0.b = r2
                r0.<init>()
                return
        }

        public void d(T r2) {
                r1 = this;
                rx.k r0 = r1.b
                r0.d(r2)
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.internal.operators.x4 r0 = r1.c     // Catch: java.lang.Throwable -> L10
                rx.functions.p<java.lang.Throwable, ? extends rx.i<? extends T>> r0 = r0.b     // Catch: java.lang.Throwable -> L10
                java.lang.Object r2 = r0.call(r2)     // Catch: java.lang.Throwable -> L10
                rx.i r2 = (rx.i) r2     // Catch: java.lang.Throwable -> L10
                rx.k r0 = r1.b     // Catch: java.lang.Throwable -> L10
                r2.j0(r0)     // Catch: java.lang.Throwable -> L10
                return
            L10:
                r2 = move-exception
                rx.k r0 = r1.b
                rx.exceptions.a.h(r2, r0)
                return
        }
    }

    private x4(rx.i<? extends T> r1, rx.functions.p<java.lang.Throwable, ? extends rx.i<? extends T>> r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L14
            if (r2 == 0) goto Lc
            r0.a = r1
            r0.b = r2
            return
        Lc:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "resumeFunctionInCaseOfError must not be null"
            r1.<init>(r2)
            throw r1
        L14:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "originalSingle must not be null"
            r1.<init>(r2)
            throw r1
    }

    public static <T> rx.internal.operators.x4<T> a(rx.i<? extends T> r1, rx.functions.p<java.lang.Throwable, ? extends rx.i<? extends T>> r2) {
            rx.internal.operators.x4 r0 = new rx.internal.operators.x4
            r0.<init>(r1, r2)
            return r0
    }

    public static <T> rx.internal.operators.x4<T> b(rx.i<? extends T> r2, rx.i<? extends T> r3) {
            if (r3 == 0) goto Ld
            rx.internal.operators.x4 r0 = new rx.internal.operators.x4
            rx.internal.operators.x4$a r1 = new rx.internal.operators.x4$a
            r1.<init>(r3)
            r0.<init>(r2, r1)
            return r0
        Ld:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "resumeSingleInCaseOfError must not be null"
            r2.<init>(r3)
            throw r2
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.k r1 = (rx.k) r1
            r0.call(r1)
            return
    }

    public void call(rx.k<? super T> r2) {
            r1 = this;
            rx.internal.operators.x4$b r0 = new rx.internal.operators.x4$b
            r0.<init>(r1, r2)
            r2.b(r0)
            rx.i<? extends T> r2 = r1.a
            r2.j0(r0)
            return
    }
}
