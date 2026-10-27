package rx.internal.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class l<T> extends rx.i<T> {
    final T b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements rx.i.t<T> {
        final /* synthetic */ java.lang.Object a;

        a(java.lang.Object r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
                r0 = this;
                rx.k r1 = (rx.k) r1
                r0.call(r1)
                return
        }

        public void call(rx.k<? super T> r2) {
                r1 = this;
                java.lang.Object r0 = r1.a
                r2.d(r0)
                return
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b<R> implements rx.i.t<R> {
        final /* synthetic */ rx.functions.p a;
        final /* synthetic */ rx.internal.util.l b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a extends rx.k<R> {
            final /* synthetic */ rx.k b;
            final /* synthetic */ rx.internal.util.l.b c;

            a(rx.internal.util.l.b r1, rx.k r2) {
                    r0 = this;
                    r0.c = r1
                    r0.b = r2
                    r0.<init>()
                    return
            }

            public void d(R r2) {
                    r1 = this;
                    rx.k r0 = r1.b
                    r0.d(r2)
                    return
            }

            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    rx.k r0 = r1.b
                    r0.onError(r2)
                    return
            }
        }

        b(rx.internal.util.l r1, rx.functions.p r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
                r0 = this;
                rx.k r1 = (rx.k) r1
                r0.call(r1)
                return
        }

        public void call(rx.k<? super R> r3) {
                r2 = this;
                rx.functions.p r0 = r2.a
                rx.internal.util.l r1 = r2.b
                T r1 = r1.b
                java.lang.Object r0 = r0.call(r1)
                rx.i r0 = (rx.i) r0
                boolean r1 = r0 instanceof rx.internal.util.l
                if (r1 == 0) goto L18
                rx.internal.util.l r0 = (rx.internal.util.l) r0
                T r0 = r0.b
                r3.d(r0)
                return
            L18:
                rx.internal.util.l$b$a r1 = new rx.internal.util.l$b$a
                r1.<init>(r2, r3)
                r3.b(r1)
                r0.j0(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class c<T> implements rx.i.t<T> {
        private final rx.internal.schedulers.b a;
        private final T b;

        c(rx.internal.schedulers.b r1, T r2) {
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

        public void call(rx.k<? super T> r4) {
                r3 = this;
                rx.internal.schedulers.b r0 = r3.a
                rx.internal.util.l$e r1 = new rx.internal.util.l$e
                T r2 = r3.b
                r1.<init>(r4, r2)
                rx.m r0 = r0.e(r1)
                r4.b(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class d<T> implements rx.i.t<T> {
        private final rx.h a;
        private final T b;

        d(rx.h r1, T r2) {
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

        public void call(rx.k<? super T> r4) {
                r3 = this;
                rx.h r0 = r3.a
                rx.h$a r0 = r0.a()
                r4.b(r0)
                rx.internal.util.l$e r1 = new rx.internal.util.l$e
                T r2 = r3.b
                r1.<init>(r4, r2)
                r0.d(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class e<T> implements rx.functions.a {
        private final rx.k<? super T> a;
        private final T b;

        e(rx.k<? super T> r1, T r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        public void call() {
                r2 = this;
                rx.k<? super T> r0 = r2.a     // Catch: java.lang.Throwable -> L8
                T r1 = r2.b     // Catch: java.lang.Throwable -> L8
                r0.d(r1)     // Catch: java.lang.Throwable -> L8
                return
            L8:
                r0 = move-exception
                rx.k<? super T> r1 = r2.a
                r1.onError(r0)
                return
        }
    }

    protected l(T r2) {
            r1 = this;
            rx.internal.util.l$a r0 = new rx.internal.util.l$a
            r0.<init>(r2)
            r1.<init>(r0)
            r1.b = r2
            return
    }

    public static <T> rx.internal.util.l<T> P0(T r1) {
            rx.internal.util.l r0 = new rx.internal.util.l
            r0.<init>(r1)
            return r0
    }

    public T Q0() {
            r1 = this;
            T r0 = r1.b
            return r0
    }

    public <R> rx.i<R> R0(rx.functions.p<? super T, ? extends rx.i<? extends R>> r2) {
            r1 = this;
            rx.internal.util.l$b r0 = new rx.internal.util.l$b
            r0.<init>(r1, r2)
            rx.i r2 = rx.i.n(r0)
            return r2
    }

    public rx.i<T> S0(rx.h r3) {
            r2 = this;
            boolean r0 = r3 instanceof rx.internal.schedulers.b
            if (r0 == 0) goto L12
            rx.internal.schedulers.b r3 = (rx.internal.schedulers.b) r3
            rx.internal.util.l$c r0 = new rx.internal.util.l$c
            T r1 = r2.b
            r0.<init>(r3, r1)
            rx.i r3 = rx.i.n(r0)
            return r3
        L12:
            rx.internal.util.l$d r0 = new rx.internal.util.l$d
            T r1 = r2.b
            r0.<init>(r3, r1)
            rx.i r3 = rx.i.n(r0)
            return r3
    }
}
