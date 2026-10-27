package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class m2<T, U, R> implements rx.e.b<rx.e<? extends R>, T> {
    final rx.functions.p<? super T, ? extends rx.e<? extends U>> a;
    final rx.functions.q<? super T, ? super U, ? extends R> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements rx.functions.p<T, rx.e<U>> {
        final /* synthetic */ rx.functions.p a;

        a(rx.functions.p r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
                r0 = this;
                rx.e r1 = r0.m20call(r1)
                return r1
        }

        /* renamed from: call, reason: collision with other method in class */
        public rx.e<U> m20call(T r2) {
                r1 = this;
                rx.functions.p r0 = r1.a
                java.lang.Object r2 = r0.call(r2)
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                rx.e r2 = rx.e.u2(r2)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b<T, U, R> extends rx.l<T> {
        final rx.l<? super rx.e<? extends R>> a;
        final rx.functions.p<? super T, ? extends rx.e<? extends U>> b;
        final rx.functions.q<? super T, ? super U, ? extends R> c;
        boolean d;

        public b(rx.l<? super rx.e<? extends R>> r1, rx.functions.p<? super T, ? extends rx.e<? extends U>> r2, rx.functions.q<? super T, ? super U, ? extends R> r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                return
        }

        public void onCompleted() {
                r1 = this;
                boolean r0 = r1.d
                if (r0 == 0) goto L5
                return
            L5:
                rx.l<? super rx.e<? extends R>> r0 = r1.a
                r0.onCompleted()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.d
                if (r0 == 0) goto L8
                rx.plugins.c.I(r2)
                return
            L8:
                r0 = 1
                r1.d = r0
                rx.l<? super rx.e<? extends R>> r0 = r1.a
                r0.onError(r2)
                return
        }

        public void onNext(T r5) {
                r4 = this;
                rx.functions.p<? super T, ? extends rx.e<? extends U>> r0 = r4.b     // Catch: java.lang.Throwable -> L19
                java.lang.Object r0 = r0.call(r5)     // Catch: java.lang.Throwable -> L19
                rx.e r0 = (rx.e) r0     // Catch: java.lang.Throwable -> L19
                rx.l<? super rx.e<? extends R>> r1 = r4.a
                rx.internal.operators.m2$c r2 = new rx.internal.operators.m2$c
                rx.functions.q<? super T, ? super U, ? extends R> r3 = r4.c
                r2.<init>(r5, r3)
                rx.e r5 = r0.c3(r2)
                r1.onNext(r5)
                return
            L19:
                r0 = move-exception
                rx.exceptions.a.e(r0)
                r4.unsubscribe()
                java.lang.Throwable r5 = rx.exceptions.OnErrorThrowable.addValueAsLastCause(r0, r5)
                r4.onError(r5)
                return
        }

        public void setProducer(rx.g r2) {
                r1 = this;
                rx.l<? super rx.e<? extends R>> r0 = r1.a
                r0.setProducer(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class c<T, U, R> implements rx.functions.p<U, R> {
        final T a;
        final rx.functions.q<? super T, ? super U, ? extends R> b;

        public c(T r1, rx.functions.q<? super T, ? super U, ? extends R> r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        public R call(U r3) {
                r2 = this;
                rx.functions.q<? super T, ? super U, ? extends R> r0 = r2.b
                T r1 = r2.a
                java.lang.Object r3 = r0.call(r1, r3)
                return r3
        }
    }

    public m2(rx.functions.p<? super T, ? extends rx.e<? extends U>> r1, rx.functions.q<? super T, ? super U, ? extends R> r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public static <T, U> rx.functions.p<T, rx.e<U>> a(rx.functions.p<? super T, ? extends java.lang.Iterable<? extends U>> r1) {
            rx.internal.operators.m2$a r0 = new rx.internal.operators.m2$a
            r0.<init>(r1)
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            rx.l r1 = r0.call(r1)
            return r1
    }

    public rx.l<? super T> call(rx.l<? super rx.e<? extends R>> r4) {
            r3 = this;
            rx.internal.operators.m2$b r0 = new rx.internal.operators.m2$b
            rx.functions.p<? super T, ? extends rx.e<? extends U>> r1 = r3.a
            rx.functions.q<? super T, ? super U, ? extends R> r2 = r3.b
            r0.<init>(r4, r1, r2)
            r4.add(r0)
            return r0
    }
}
