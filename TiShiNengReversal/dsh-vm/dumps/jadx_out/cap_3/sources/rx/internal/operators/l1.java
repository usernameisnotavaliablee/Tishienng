package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class l1 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a<T> implements rx.e.a<T> {
        final java.util.concurrent.Future<? extends T> a;
        private final long b;
        private final java.util.concurrent.TimeUnit c;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: rx.internal.operators.l1$a$a, reason: collision with other inner class name */
        class C0016a implements rx.functions.a {
            final /* synthetic */ rx.internal.operators.l1.a a;

            C0016a(rx.internal.operators.l1.a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void call() {
                    r2 = this;
                    rx.internal.operators.l1$a r0 = r2.a
                    java.util.concurrent.Future<? extends T> r0 = r0.a
                    r1 = 1
                    r0.cancel(r1)
                    return
            }
        }

        public a(java.util.concurrent.Future<? extends T> r3) {
                r2 = this;
                r2.<init>()
                r2.a = r3
                r0 = 0
                r2.b = r0
                r3 = 0
                r2.c = r3
                return
        }

        public a(java.util.concurrent.Future<? extends T> r1, long r2, java.util.concurrent.TimeUnit r4) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r4
                return
        }

        public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
                r0 = this;
                rx.l r1 = (rx.l) r1
                r0.call(r1)
                return
        }

        public void call(rx.l<? super T> r5) {
                r4 = this;
                rx.internal.operators.l1$a$a r0 = new rx.internal.operators.l1$a$a
                r0.<init>(r4)
                rx.m r0 = rx.subscriptions.f.a(r0)
                r5.add(r0)
                boolean r0 = r5.isUnsubscribed()     // Catch: java.lang.Throwable -> L1e
                if (r0 == 0) goto L13
                goto L37
            L13:
                java.util.concurrent.TimeUnit r0 = r4.c     // Catch: java.lang.Throwable -> L1e
                if (r0 != 0) goto L20
                java.util.concurrent.Future<? extends T> r0 = r4.a     // Catch: java.lang.Throwable -> L1e
                java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L1e
                goto L28
            L1e:
                r0 = move-exception
                goto L31
            L20:
                java.util.concurrent.Future<? extends T> r1 = r4.a     // Catch: java.lang.Throwable -> L1e
                long r2 = r4.b     // Catch: java.lang.Throwable -> L1e
                java.lang.Object r0 = r1.get(r2, r0)     // Catch: java.lang.Throwable -> L1e
            L28:
                rx.internal.producers.SingleProducer r1 = new rx.internal.producers.SingleProducer     // Catch: java.lang.Throwable -> L1e
                r1.<init>(r5, r0)     // Catch: java.lang.Throwable -> L1e
                r5.setProducer(r1)     // Catch: java.lang.Throwable -> L1e
                return
            L31:
                boolean r1 = r5.isUnsubscribed()
                if (r1 == 0) goto L38
            L37:
                return
            L38:
                rx.exceptions.a.f(r0, r5)
                return
        }
    }

    private l1() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static <T> rx.e.a<T> a(java.util.concurrent.Future<? extends T> r1) {
            rx.internal.operators.l1$a r0 = new rx.internal.operators.l1$a
            r0.<init>(r1)
            return r0
    }

    public static <T> rx.e.a<T> b(java.util.concurrent.Future<? extends T> r1, long r2, java.util.concurrent.TimeUnit r4) {
            rx.internal.operators.l1$a r0 = new rx.internal.operators.l1$a
            r0.<init>(r1, r2, r4)
            return r0
    }
}
