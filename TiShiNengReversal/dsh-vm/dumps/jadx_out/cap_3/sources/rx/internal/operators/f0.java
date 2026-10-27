package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class f0<T> implements rx.e.a<T> {
    final rx.e<T> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T> implements rx.g, rx.m {
        final rx.internal.operators.f0.b<T> a;

        public a(rx.internal.operators.f0.b<T> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public boolean isUnsubscribed() {
                r1 = this;
                rx.internal.operators.f0$b<T> r0 = r1.a
                boolean r0 = r0.isUnsubscribed()
                return r0
        }

        public void request(long r2) {
                r1 = this;
                rx.internal.operators.f0$b<T> r0 = r1.a
                r0.g(r2)
                return
        }

        public void unsubscribe() {
                r1 = this;
                rx.internal.operators.f0$b<T> r0 = r1.a
                r0.j()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b<T> extends rx.l<T> {
        final java.util.concurrent.atomic.AtomicReference<rx.l<? super T>> a;
        final java.util.concurrent.atomic.AtomicReference<rx.g> b;
        final java.util.concurrent.atomic.AtomicLong c;

        public b(rx.l<? super T> r2) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>(r2)
                r1.a = r0
                java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
                r2.<init>()
                r1.b = r2
                java.util.concurrent.atomic.AtomicLong r2 = new java.util.concurrent.atomic.AtomicLong
                r2.<init>()
                r1.c = r2
                return
        }

        void g(long r4) {
                r3 = this;
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 < 0) goto L31
                java.util.concurrent.atomic.AtomicReference<rx.g> r2 = r3.b
                java.lang.Object r2 = r2.get()
                rx.g r2 = (rx.g) r2
                if (r2 == 0) goto L14
                r2.request(r4)
                return
            L14:
                java.util.concurrent.atomic.AtomicLong r2 = r3.c
                rx.internal.operators.a.b(r2, r4)
                java.util.concurrent.atomic.AtomicReference<rx.g> r4 = r3.b
                java.lang.Object r4 = r4.get()
                rx.g r4 = (rx.g) r4
                if (r4 == 0) goto L30
                rx.internal.operators.f0$c r5 = rx.internal.operators.f0.c.a
                if (r4 == r5) goto L30
                java.util.concurrent.atomic.AtomicLong r5 = r3.c
                long r0 = r5.getAndSet(r0)
                r4.request(r0)
            L30:
                return
            L31:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "n >= 0 required but it was "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        void j() {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<rx.g> r0 = r2.b
                rx.internal.operators.f0$c r1 = rx.internal.operators.f0.c.a
                r0.lazySet(r1)
                java.util.concurrent.atomic.AtomicReference<rx.l<? super T>> r0 = r2.a
                r1 = 0
                r0.lazySet(r1)
                r2.unsubscribe()
                return
        }

        public void onCompleted() {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<rx.g> r0 = r2.b
                rx.internal.operators.f0$c r1 = rx.internal.operators.f0.c.a
                r0.lazySet(r1)
                java.util.concurrent.atomic.AtomicReference<rx.l<? super T>> r0 = r2.a
                r1 = 0
                java.lang.Object r0 = r0.getAndSet(r1)
                rx.l r0 = (rx.l) r0
                if (r0 == 0) goto L15
                r0.onCompleted()
            L15:
                return
        }

        public void onError(java.lang.Throwable r3) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<rx.g> r0 = r2.b
                rx.internal.operators.f0$c r1 = rx.internal.operators.f0.c.a
                r0.lazySet(r1)
                java.util.concurrent.atomic.AtomicReference<rx.l<? super T>> r0 = r2.a
                r1 = 0
                java.lang.Object r0 = r0.getAndSet(r1)
                rx.l r0 = (rx.l) r0
                if (r0 == 0) goto L16
                r0.onError(r3)
                return
            L16:
                rx.plugins.c.I(r3)
                return
        }

        public void onNext(T r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<rx.l<? super T>> r0 = r1.a
                java.lang.Object r0 = r0.get()
                rx.l r0 = (rx.l) r0
                if (r0 == 0) goto Ld
                r0.onNext(r2)
            Ld:
                return
        }

        public void setProducer(rx.g r4) {
                r3 = this;
                java.util.concurrent.atomic.AtomicReference<rx.g> r0 = r3.b
                r1 = 0
                boolean r0 = androidx.camera.view.p.a(r0, r1, r4)
                if (r0 == 0) goto L15
                java.util.concurrent.atomic.AtomicLong r0 = r3.c
                r1 = 0
                long r0 = r0.getAndSet(r1)
                r4.request(r0)
                return
            L15:
                java.util.concurrent.atomic.AtomicReference<rx.g> r4 = r3.b
                java.lang.Object r4 = r4.get()
                rx.internal.operators.f0$c r0 = rx.internal.operators.f0.c.a
                if (r4 != r0) goto L20
                return
            L20:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "Producer already set!"
                r4.<init>(r0)
                throw r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum c extends java.lang.Enum<rx.internal.operators.f0.c> implements rx.g {
        public static final rx.internal.operators.f0.c a = null;
        private static final /* synthetic */ rx.internal.operators.f0.c[] b = null;

        static {
                rx.internal.operators.f0$c r0 = new rx.internal.operators.f0$c
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                rx.internal.operators.f0.c.a = r0
                r1 = 1
                rx.internal.operators.f0$c[] r1 = new rx.internal.operators.f0.c[r1]
                r1[r2] = r0
                rx.internal.operators.f0.c.b = r1
                return
        }

        c(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static rx.internal.operators.f0.c valueOf(java.lang.String r1) {
                java.lang.Class<rx.internal.operators.f0$c> r0 = rx.internal.operators.f0.c.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                rx.internal.operators.f0$c r1 = (rx.internal.operators.f0.c) r1
                return r1
        }

        public static rx.internal.operators.f0.c[] values() {
                rx.internal.operators.f0$c[] r0 = rx.internal.operators.f0.c.b
                java.lang.Object r0 = r0.clone()
                rx.internal.operators.f0$c[] r0 = (rx.internal.operators.f0.c[]) r0
                return r0
        }

        public void request(long r1) {
                r0 = this;
                return
        }
    }

    public f0(rx.e<T> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            r0.call(r1)
            return
    }

    public void call(rx.l<? super T> r3) {
            r2 = this;
            rx.internal.operators.f0$b r0 = new rx.internal.operators.f0$b
            r0.<init>(r3)
            rx.internal.operators.f0$a r1 = new rx.internal.operators.f0$a
            r1.<init>(r0)
            r3.add(r1)
            r3.setProducer(r1)
            rx.e<T> r3 = r2.a
            r3.J6(r0)
            return
    }
}
