package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class n2<T> implements rx.e.b<rx.Notification<T>, T> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements rx.g {
        final /* synthetic */ rx.internal.operators.n2.c a;
        final /* synthetic */ rx.internal.operators.n2 b;

        a(rx.internal.operators.n2 r1, rx.internal.operators.n2.c r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void request(long r4) {
                r3 = this;
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 <= 0) goto Lb
                rx.internal.operators.n2$c r0 = r3.a
                r0.s(r4)
            Lb:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b {
        static final rx.internal.operators.n2<java.lang.Object> a = null;

        static {
                rx.internal.operators.n2 r0 = new rx.internal.operators.n2
                r0.<init>()
                rx.internal.operators.n2.b.a = r0
                return
        }

        b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class c<T> extends rx.l<T> {
        private final rx.l<? super rx.Notification<T>> a;
        private volatile rx.Notification<T> b;
        private boolean c;
        private boolean d;
        private final java.util.concurrent.atomic.AtomicLong e;

        c(rx.l<? super rx.Notification<T>> r2) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
                r0.<init>()
                r1.e = r0
                r1.a = r2
                return
        }

        private void g() {
                r6 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r6.e
            L2:
                long r1 = r0.get()
                r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 != 0) goto L10
                goto L1a
            L10:
                r3 = 1
                long r3 = r1 - r3
                boolean r1 = r0.compareAndSet(r1, r3)
                if (r1 == 0) goto L2
            L1a:
                return
        }

        private void j() {
                r7 = this;
                monitor-enter(r7)
                boolean r0 = r7.c     // Catch: java.lang.Throwable -> La
                r1 = 1
                if (r0 == 0) goto Lc
                r7.d = r1     // Catch: java.lang.Throwable -> La
                monitor-exit(r7)     // Catch: java.lang.Throwable -> La
                return
            La:
                r0 = move-exception
                goto L4e
            Lc:
                r7.c = r1     // Catch: java.lang.Throwable -> La
                monitor-exit(r7)     // Catch: java.lang.Throwable -> La
                java.util.concurrent.atomic.AtomicLong r0 = r7.e
            L11:
                rx.l<? super rx.Notification<T>> r1 = r7.a
                boolean r1 = r1.isUnsubscribed()
                if (r1 != 0) goto L4d
                rx.Notification<T> r1 = r7.b
                if (r1 == 0) goto L3d
                long r2 = r0.get()
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 <= 0) goto L3d
                r0 = 0
                r7.b = r0
                rx.l<? super rx.Notification<T>> r0 = r7.a
                r0.onNext(r1)
                rx.l<? super rx.Notification<T>> r0 = r7.a
                boolean r0 = r0.isUnsubscribed()
                if (r0 != 0) goto L4d
                rx.l<? super rx.Notification<T>> r0 = r7.a
                r0.onCompleted()
                return
            L3d:
                monitor-enter(r7)
                boolean r1 = r7.d     // Catch: java.lang.Throwable -> L47
                if (r1 != 0) goto L49
                r0 = 0
                r7.c = r0     // Catch: java.lang.Throwable -> L47
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L47
                return
            L47:
                r0 = move-exception
                goto L4b
            L49:
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L47
                goto L11
            L4b:
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L47
                throw r0
            L4d:
                return
            L4e:
                monitor-exit(r7)     // Catch: java.lang.Throwable -> La
                throw r0
        }

        public void onCompleted() {
                r1 = this;
                rx.Notification r0 = rx.Notification.b()
                r1.b = r0
                r1.j()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.Notification r0 = rx.Notification.d(r2)
                r1.b = r0
                rx.plugins.c.I(r2)
                r1.j()
                return
        }

        public void onNext(T r2) {
                r1 = this;
                rx.l<? super rx.Notification<T>> r0 = r1.a
                rx.Notification r2 = rx.Notification.e(r2)
                r0.onNext(r2)
                r1.g()
                return
        }

        public void onStart() {
                r2 = this;
                r0 = 0
                r2.request(r0)
                return
        }

        void s(long r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r1.e
                rx.internal.operators.a.b(r0, r2)
                r1.request(r2)
                r1.j()
                return
        }
    }

    n2() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> rx.internal.operators.n2<T> a() {
            rx.internal.operators.n2<java.lang.Object> r0 = rx.internal.operators.n2.b.a
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            rx.l r1 = r0.call(r1)
            return r1
    }

    public rx.l<? super T> call(rx.l<? super rx.Notification<T>> r3) {
            r2 = this;
            rx.internal.operators.n2$c r0 = new rx.internal.operators.n2$c
            r0.<init>(r3)
            r3.add(r0)
            rx.internal.operators.n2$a r1 = new rx.internal.operators.n2$a
            r1.<init>(r2, r0)
            r3.setProducer(r1)
            return r0
    }
}
