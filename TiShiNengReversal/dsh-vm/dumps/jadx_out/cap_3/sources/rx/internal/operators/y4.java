package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class y4 {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a<R> implements rx.i.t<R> {
        final /* synthetic */ rx.i[] a;
        final /* synthetic */ rx.functions.y b;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: rx.internal.operators.y4$a$a, reason: collision with other inner class name */
        class C0034a<T> extends rx.k<T> {
            final /* synthetic */ java.lang.Object[] b;
            final /* synthetic */ int c;
            final /* synthetic */ java.util.concurrent.atomic.AtomicInteger d;
            final /* synthetic */ rx.k e;
            final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f;
            final /* synthetic */ rx.internal.operators.y4.a g;

            C0034a(rx.internal.operators.y4.a r1, java.lang.Object[] r2, int r3, java.util.concurrent.atomic.AtomicInteger r4, rx.k r5, java.util.concurrent.atomic.AtomicBoolean r6) {
                    r0 = this;
                    r0.g = r1
                    r0.b = r2
                    r0.c = r3
                    r0.d = r4
                    r0.e = r5
                    r0.f = r6
                    r0.<init>()
                    return
            }

            public void d(T r3) {
                    r2 = this;
                    java.lang.Object[] r0 = r2.b
                    int r1 = r2.c
                    r0[r1] = r3
                    java.util.concurrent.atomic.AtomicInteger r3 = r2.d
                    int r3 = r3.decrementAndGet()
                    if (r3 != 0) goto L25
                    rx.internal.operators.y4$a r3 = r2.g     // Catch: java.lang.Throwable -> L1e
                    rx.functions.y r3 = r3.b     // Catch: java.lang.Throwable -> L1e
                    java.lang.Object[] r0 = r2.b     // Catch: java.lang.Throwable -> L1e
                    java.lang.Object r3 = r3.call(r0)     // Catch: java.lang.Throwable -> L1e
                    rx.k r0 = r2.e
                    r0.d(r3)
                    return
                L1e:
                    r3 = move-exception
                    rx.exceptions.a.e(r3)
                    r2.onError(r3)
                L25:
                    return
            }

            public void onError(java.lang.Throwable r4) {
                    r3 = this;
                    java.util.concurrent.atomic.AtomicBoolean r0 = r3.f
                    r1 = 0
                    r2 = 1
                    boolean r0 = r0.compareAndSet(r1, r2)
                    if (r0 == 0) goto L10
                    rx.k r0 = r3.e
                    r0.onError(r4)
                    return
                L10:
                    rx.plugins.c.I(r4)
                    return
            }
        }

        a(rx.i[] r1, rx.functions.y r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
                r0 = this;
                rx.k r1 = (rx.k) r1
                r0.call(r1)
                return
        }

        public void call(rx.k<? super R> r10) {
                r9 = this;
                rx.i[] r0 = r9.a
                int r0 = r0.length
                if (r0 != 0) goto L10
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                java.lang.String r1 = "Can't zip 0 Singles."
                r0.<init>(r1)
                r10.onError(r0)
                return
            L10:
                java.util.concurrent.atomic.AtomicInteger r6 = new java.util.concurrent.atomic.AtomicInteger
                rx.i[] r0 = r9.a
                int r0 = r0.length
                r6.<init>(r0)
                java.util.concurrent.atomic.AtomicBoolean r8 = new java.util.concurrent.atomic.AtomicBoolean
                r8.<init>()
                rx.i[] r0 = r9.a
                int r0 = r0.length
                java.lang.Object[] r4 = new java.lang.Object[r0]
                rx.subscriptions.b r0 = new rx.subscriptions.b
                r0.<init>()
                r10.b(r0)
                r1 = 0
                r5 = 0
            L2c:
                rx.i[] r1 = r9.a
                int r1 = r1.length
                if (r5 >= r1) goto L3d
                boolean r1 = r0.isUnsubscribed()
                if (r1 != 0) goto L3d
                boolean r1 = r8.get()
                if (r1 == 0) goto L3f
            L3d:
                r3 = r9
                goto L61
            L3f:
                rx.internal.operators.y4$a$a r2 = new rx.internal.operators.y4$a$a
                r3 = r9
                r7 = r10
                r2.<init>(r3, r4, r5, r6, r7, r8)
                r0.a(r2)
                boolean r10 = r0.isUnsubscribed()
                if (r10 != 0) goto L61
                boolean r10 = r8.get()
                if (r10 == 0) goto L56
                goto L61
            L56:
                rx.i[] r10 = r3.a
                r10 = r10[r5]
                r10.j0(r2)
                int r5 = r5 + 1
                r10 = r7
                goto L2c
            L61:
                return
        }
    }

    private y4() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static <T, R> rx.i<R> a(rx.i<? extends T>[] r1, rx.functions.y<? extends R> r2) {
            rx.internal.operators.y4$a r0 = new rx.internal.operators.y4$a
            r0.<init>(r1, r2)
            rx.i r1 = rx.i.n(r0)
            return r1
    }
}
