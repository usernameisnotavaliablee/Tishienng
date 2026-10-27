package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class v4<T, Resource> implements rx.i.t<T> {
    final rx.functions.o<Resource> a;
    final rx.functions.p<? super Resource, ? extends rx.i<? extends T>> b;
    final rx.functions.b<? super Resource> c;
    final boolean d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends rx.k<T> {
        final /* synthetic */ java.lang.Object b;
        final /* synthetic */ rx.k c;
        final /* synthetic */ rx.internal.operators.v4 d;

        a(rx.internal.operators.v4 r1, java.lang.Object r2, rx.k r3) {
                r0 = this;
                r0.d = r1
                r0.b = r2
                r0.c = r3
                r0.<init>()
                return
        }

        public void d(T r3) {
                r2 = this;
                rx.internal.operators.v4 r0 = r2.d
                boolean r1 = r0.d
                if (r1 == 0) goto L18
                rx.functions.b<? super Resource> r0 = r0.c     // Catch: java.lang.Throwable -> Le
                java.lang.Object r1 = r2.b     // Catch: java.lang.Throwable -> Le
                r0.call(r1)     // Catch: java.lang.Throwable -> Le
                goto L18
            Le:
                r3 = move-exception
                rx.exceptions.a.e(r3)
                rx.k r0 = r2.c
                r0.onError(r3)
                return
            L18:
                rx.k r0 = r2.c
                r0.d(r3)
                rx.internal.operators.v4 r3 = r2.d
                boolean r0 = r3.d
                if (r0 != 0) goto L32
                rx.functions.b<? super Resource> r3 = r3.c     // Catch: java.lang.Throwable -> L2b
                java.lang.Object r0 = r2.b     // Catch: java.lang.Throwable -> L2b
                r3.call(r0)     // Catch: java.lang.Throwable -> L2b
                return
            L2b:
                r3 = move-exception
                rx.exceptions.a.e(r3)
                rx.plugins.c.I(r3)
            L32:
                return
        }

        public void onError(java.lang.Throwable r4) {
                r3 = this;
                rx.internal.operators.v4 r0 = r3.d
                rx.k r1 = r3.c
                java.lang.Object r2 = r3.b
                r0.a(r1, r2, r4)
                return
        }
    }

    public v4(rx.functions.o<Resource> r1, rx.functions.p<? super Resource, ? extends rx.i<? extends T>> r2, rx.functions.b<? super Resource> r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    void a(rx.k<? super T> r5, Resource r6, java.lang.Throwable r7) {
            r4 = this;
            rx.exceptions.a.e(r7)
            boolean r0 = r4.d
            if (r0 == 0) goto L24
            rx.functions.b<? super Resource> r0 = r4.c     // Catch: java.lang.Throwable -> Ld
            r0.call(r6)     // Catch: java.lang.Throwable -> Ld
            goto L24
        Ld:
            r0 = move-exception
            rx.exceptions.a.e(r0)
            rx.exceptions.CompositeException r1 = new rx.exceptions.CompositeException
            r2 = 2
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r3 = 0
            r2[r3] = r7
            r7 = 1
            r2[r7] = r0
            java.util.List r7 = java.util.Arrays.asList(r2)
            r1.<init>(r7)
            r7 = r1
        L24:
            r5.onError(r7)
            boolean r5 = r4.d
            if (r5 != 0) goto L38
            rx.functions.b<? super Resource> r5 = r4.c     // Catch: java.lang.Throwable -> L31
            r5.call(r6)     // Catch: java.lang.Throwable -> L31
            goto L38
        L31:
            r5 = move-exception
            rx.exceptions.a.e(r5)
            rx.plugins.c.I(r5)
        L38:
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
            rx.functions.o<Resource> r0 = r3.a     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L2c
            rx.functions.p<? super Resource, ? extends rx.i<? extends T>> r1 = r3.b     // Catch: java.lang.Throwable -> L27
            java.lang.Object r1 = r1.call(r0)     // Catch: java.lang.Throwable -> L27
            rx.i r1 = (rx.i) r1     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L1b
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "The single"
            r1.<init>(r2)
            r3.a(r4, r0, r1)
            return
        L1b:
            rx.internal.operators.v4$a r2 = new rx.internal.operators.v4$a
            r2.<init>(r3, r0, r4)
            r4.b(r2)
            r1.j0(r2)
            return
        L27:
            r1 = move-exception
            r3.a(r4, r0, r1)
            return
        L2c:
            r0 = move-exception
            rx.exceptions.a.e(r0)
            r4.onError(r0)
            return
    }
}
