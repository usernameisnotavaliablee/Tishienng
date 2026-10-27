package retrofit2.adapter.rxjava;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class a<T> implements rx.e.a<T> {
    private final rx.e.a<retrofit2.c0<T>> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: retrofit2.adapter.rxjava.a$a, reason: collision with other inner class name */
    private static class C0096a<R> extends rx.l<retrofit2.c0<R>> {
        private final rx.l<? super R> a;
        private boolean b;

        C0096a(rx.l<? super R> r1) {
                r0 = this;
                r0.<init>(r1)
                r0.a = r1
                return
        }

        @Override // rx.f
        public void onCompleted() {
                r1 = this;
                boolean r0 = r1.b
                if (r0 != 0) goto L9
                rx.l<? super R> r0 = r1.a
                r0.onCompleted()
            L9:
                return
        }

        @Override // rx.f
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                boolean r0 = r2.b
                if (r0 != 0) goto La
                rx.l<? super R> r0 = r2.a
                r0.onError(r3)
                return
            La:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                java.lang.String r1 = "This should never happen! Report as a Retrofit bug with the full stacktrace."
                r0.<init>(r1)
                r0.initCause(r3)
                rx.plugins.f r3 = rx.plugins.f.c()
                rx.plugins.b r3 = r3.b()
                r3.a(r0)
                return
        }

        @Override // rx.f
        public /* bridge */ /* synthetic */ void onNext(java.lang.Object r1) {
                r0 = this;
                retrofit2.c0 r1 = (retrofit2.c0) r1
                r0.onNext(r1)
                return
        }

        public void onNext(retrofit2.c0<R> r6) {
                r5 = this;
                boolean r0 = r6.g()
                if (r0 == 0) goto L10
                rx.l<? super R> r0 = r5.a
                java.lang.Object r6 = r6.a()
                r0.onNext(r6)
                return
            L10:
                r0 = 1
                r5.b = r0
                retrofit2.adapter.rxjava.HttpException r1 = new retrofit2.adapter.rxjava.HttpException
                r1.<init>(r6)
                rx.l<? super R> r6 = r5.a     // Catch: java.lang.Throwable -> L1e rx.exceptions.OnErrorNotImplementedException -> L20 rx.exceptions.OnErrorFailedException -> L22 rx.exceptions.OnCompletedFailedException -> L24
                r6.onError(r1)     // Catch: java.lang.Throwable -> L1e rx.exceptions.OnErrorNotImplementedException -> L20 rx.exceptions.OnErrorFailedException -> L22 rx.exceptions.OnCompletedFailedException -> L24
                return
            L1e:
                r6 = move-exception
                goto L26
            L20:
                r6 = move-exception
                goto L42
            L22:
                r6 = move-exception
                goto L42
            L24:
                r6 = move-exception
                goto L42
            L26:
                rx.exceptions.a.e(r6)
                rx.exceptions.CompositeException r2 = new rx.exceptions.CompositeException
                r3 = 2
                java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
                r4 = 0
                r3[r4] = r1
                r3[r0] = r6
                r2.<init>(r3)
                rx.plugins.f r6 = rx.plugins.f.c()
                rx.plugins.b r6 = r6.b()
                r6.a(r2)
                goto L4d
            L42:
                rx.plugins.f r0 = rx.plugins.f.c()
                rx.plugins.b r0 = r0.b()
                r0.a(r6)
            L4d:
                return
        }
    }

    a(rx.e.a<retrofit2.c0<T>> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // rx.functions.b
    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            r0.call(r1)
            return
    }

    public void call(rx.l<? super T> r3) {
            r2 = this;
            rx.e$a<retrofit2.c0<T>> r0 = r2.a
            retrofit2.adapter.rxjava.a$a r1 = new retrofit2.adapter.rxjava.a$a
            r1.<init>(r3)
            r0.call(r1)
            return
    }
}
