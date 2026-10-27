package retrofit2.adapter.rxjava;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class f<T> implements rx.e.a<retrofit2.adapter.rxjava.e<T>> {
    private final rx.e.a<retrofit2.c0<T>> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a<R> extends rx.l<retrofit2.c0<R>> {
        private final rx.l<? super retrofit2.adapter.rxjava.e<R>> a;

        a(rx.l<? super retrofit2.adapter.rxjava.e<R>> r1) {
                r0 = this;
                r0.<init>(r1)
                r0.a = r1
                return
        }

        @Override // rx.f
        public void onCompleted() {
                r1 = this;
                rx.l<? super retrofit2.adapter.rxjava.e<R>> r0 = r1.a
                r0.onCompleted()
                return
        }

        @Override // rx.f
        public void onError(java.lang.Throwable r5) {
                r4 = this;
                rx.l<? super retrofit2.adapter.rxjava.e<R>> r0 = r4.a     // Catch: java.lang.Throwable -> Lf
                retrofit2.adapter.rxjava.e r5 = retrofit2.adapter.rxjava.e.b(r5)     // Catch: java.lang.Throwable -> Lf
                r0.onNext(r5)     // Catch: java.lang.Throwable -> Lf
                rx.l<? super retrofit2.adapter.rxjava.e<R>> r5 = r4.a
                r5.onCompleted()
                return
            Lf:
                r5 = move-exception
                rx.l<? super retrofit2.adapter.rxjava.e<R>> r0 = r4.a     // Catch: java.lang.Throwable -> L16 rx.exceptions.OnErrorNotImplementedException -> L18 rx.exceptions.OnErrorFailedException -> L1a rx.exceptions.OnCompletedFailedException -> L1c
                r0.onError(r5)     // Catch: java.lang.Throwable -> L16 rx.exceptions.OnErrorNotImplementedException -> L18 rx.exceptions.OnErrorFailedException -> L1a rx.exceptions.OnCompletedFailedException -> L1c
                goto L46
            L16:
                r0 = move-exception
                goto L1e
            L18:
                r5 = move-exception
                goto L3b
            L1a:
                r5 = move-exception
                goto L3b
            L1c:
                r5 = move-exception
                goto L3b
            L1e:
                rx.exceptions.a.e(r0)
                rx.exceptions.CompositeException r1 = new rx.exceptions.CompositeException
                r2 = 2
                java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
                r3 = 0
                r2[r3] = r5
                r5 = 1
                r2[r5] = r0
                r1.<init>(r2)
                rx.plugins.f r5 = rx.plugins.f.c()
                rx.plugins.b r5 = r5.b()
                r5.a(r1)
                goto L46
            L3b:
                rx.plugins.f r0 = rx.plugins.f.c()
                rx.plugins.b r0 = r0.b()
                r0.a(r5)
            L46:
                return
        }

        @Override // rx.f
        public /* bridge */ /* synthetic */ void onNext(java.lang.Object r1) {
                r0 = this;
                retrofit2.c0 r1 = (retrofit2.c0) r1
                r0.onNext(r1)
                return
        }

        public void onNext(retrofit2.c0<R> r2) {
                r1 = this;
                rx.l<? super retrofit2.adapter.rxjava.e<R>> r0 = r1.a
                retrofit2.adapter.rxjava.e r2 = retrofit2.adapter.rxjava.e.e(r2)
                r0.onNext(r2)
                return
        }
    }

    f(rx.e.a<retrofit2.c0<T>> r1) {
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

    public void call(rx.l<? super retrofit2.adapter.rxjava.e<T>> r3) {
            r2 = this;
            rx.e$a<retrofit2.c0<T>> r0 = r2.a
            retrofit2.adapter.rxjava.f$a r1 = new retrofit2.adapter.rxjava.f$a
            r1.<init>(r3)
            r0.call(r1)
            return
    }
}
