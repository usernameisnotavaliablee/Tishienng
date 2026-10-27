package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class n4<T> implements rx.i.t<T> {
    final rx.functions.b<rx.j<T>> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T> extends java.util.concurrent.atomic.AtomicBoolean implements rx.j<T>, rx.m {
        private static final long serialVersionUID = 8082834163465882809L;
        final rx.k<? super T> a;
        final rx.internal.subscriptions.SequentialSubscription b;

        a(rx.k<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                rx.internal.subscriptions.SequentialSubscription r1 = new rx.internal.subscriptions.SequentialSubscription
                r1.<init>()
                r0.b = r1
                return
        }

        public void a(rx.functions.n r2) {
                r1 = this;
                rx.internal.subscriptions.CancellableSubscription r0 = new rx.internal.subscriptions.CancellableSubscription
                r0.<init>(r2)
                r1.b(r0)
                return
        }

        public void b(rx.m r2) {
                r1 = this;
                rx.internal.subscriptions.SequentialSubscription r0 = r1.b
                r0.update(r2)
                return
        }

        public boolean isUnsubscribed() {
                r1 = this;
                boolean r0 = r1.get()
                return r0
        }

        public void onError(java.lang.Throwable r3) {
                r2 = this;
                if (r3 != 0) goto L7
                java.lang.NullPointerException r3 = new java.lang.NullPointerException
                r3.<init>()
            L7:
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto L21
                rx.k<? super T> r0 = r2.a     // Catch: java.lang.Throwable -> L1a
                r0.onError(r3)     // Catch: java.lang.Throwable -> L1a
                rx.internal.subscriptions.SequentialSubscription r3 = r2.b
                r3.unsubscribe()
                return
            L1a:
                r3 = move-exception
                rx.internal.subscriptions.SequentialSubscription r0 = r2.b
                r0.unsubscribe()
                throw r3
            L21:
                rx.plugins.c.I(r3)
                return
        }

        public void onSuccess(T r3) {
                r2 = this;
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto L1a
                rx.k<? super T> r0 = r2.a     // Catch: java.lang.Throwable -> L13
                r0.d(r3)     // Catch: java.lang.Throwable -> L13
                rx.internal.subscriptions.SequentialSubscription r3 = r2.b
                r3.unsubscribe()
                return
            L13:
                r3 = move-exception
                rx.internal.subscriptions.SequentialSubscription r0 = r2.b
                r0.unsubscribe()
                throw r3
            L1a:
                return
        }

        public void unsubscribe() {
                r2 = this;
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto Ld
                rx.internal.subscriptions.SequentialSubscription r0 = r2.b
                r0.unsubscribe()
            Ld:
                return
        }
    }

    public n4(rx.functions.b<rx.j<T>> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
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
            rx.internal.operators.n4$a r0 = new rx.internal.operators.n4$a
            r0.<init>(r2)
            r2.b(r0)
            rx.functions.b<rx.j<T>> r2 = r1.a     // Catch: java.lang.Throwable -> Le
            r2.call(r0)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r2 = move-exception
            rx.exceptions.a.e(r2)
            r0.onError(r2)
            return
    }
}
