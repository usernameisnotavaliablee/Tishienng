package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class l2<T, R> implements rx.e.b<R, T> {
    final rx.functions.p<? super T, ? extends R> a;
    final rx.functions.p<? super java.lang.Throwable, ? extends R> b;
    final rx.functions.o<? extends R> c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements rx.g {
        final /* synthetic */ rx.internal.operators.l2.b a;
        final /* synthetic */ rx.internal.operators.l2 b;

        a(rx.internal.operators.l2 r1, rx.internal.operators.l2.b r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void request(long r2) {
                r1 = this;
                rx.internal.operators.l2$b r0 = r1.a
                r0.j(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b<T, R> extends rx.l<T> {
        static final long j = Long.MIN_VALUE;
        static final long k = Long.MAX_VALUE;
        final rx.l<? super R> a;
        final rx.functions.p<? super T, ? extends R> b;
        final rx.functions.p<? super java.lang.Throwable, ? extends R> c;
        final rx.functions.o<? extends R> d;
        final java.util.concurrent.atomic.AtomicLong e;
        final java.util.concurrent.atomic.AtomicLong f;
        final java.util.concurrent.atomic.AtomicReference<rx.g> g;
        long h;
        R i;

        public b(rx.l<? super R> r1, rx.functions.p<? super T, ? extends R> r2, rx.functions.p<? super java.lang.Throwable, ? extends R> r3, rx.functions.o<? extends R> r4) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.e = r1
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.f = r1
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.g = r1
                return
        }

        void g() {
                r5 = this;
                long r0 = r5.h
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L15
                java.util.concurrent.atomic.AtomicReference<rx.g> r2 = r5.g
                java.lang.Object r2 = r2.get()
                if (r2 == 0) goto L15
                java.util.concurrent.atomic.AtomicLong r2 = r5.e
                rx.internal.operators.a.i(r2, r0)
            L15:
                return
        }

        void j(long r11) {
                r10 = this;
                r0 = 0
                int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
                if (r2 < 0) goto L81
                if (r2 != 0) goto La
                goto L80
            La:
                java.util.concurrent.atomic.AtomicLong r2 = r10.e
                long r2 = r2.get()
                r4 = -9223372036854775808
                long r6 = r2 & r4
                int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r8 == 0) goto L4c
                r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                long r6 = r6 & r2
                long r8 = rx.internal.operators.a.a(r6, r11)
                long r4 = r4 | r8
                java.util.concurrent.atomic.AtomicLong r8 = r10.e
                boolean r2 = r8.compareAndSet(r2, r4)
                if (r2 == 0) goto La
                int r11 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r11 != 0) goto L80
                rx.l<? super R> r11 = r10.a
                boolean r11 = r11.isUnsubscribed()
                if (r11 != 0) goto L3e
                rx.l<? super R> r11 = r10.a
                R r12 = r10.i
                r11.onNext(r12)
            L3e:
                rx.l<? super R> r11 = r10.a
                boolean r11 = r11.isUnsubscribed()
                if (r11 != 0) goto L80
                rx.l<? super R> r11 = r10.a
                r11.onCompleted()
                return
            L4c:
                long r4 = rx.internal.operators.a.a(r2, r11)
                java.util.concurrent.atomic.AtomicLong r6 = r10.e
                boolean r2 = r6.compareAndSet(r2, r4)
                if (r2 == 0) goto La
                java.util.concurrent.atomic.AtomicReference<rx.g> r2 = r10.g
                java.lang.Object r3 = r2.get()
                rx.g r3 = (rx.g) r3
                if (r3 == 0) goto L66
                r3.request(r11)
                return
            L66:
                java.util.concurrent.atomic.AtomicLong r3 = r10.f
                rx.internal.operators.a.b(r3, r11)
                java.lang.Object r11 = r2.get()
                rx.g r11 = (rx.g) r11
                if (r11 == 0) goto L80
                java.util.concurrent.atomic.AtomicLong r12 = r10.f
                long r2 = r12.getAndSet(r0)
                int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r12 == 0) goto L80
                r11.request(r2)
            L80:
                return
            L81:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "n >= 0 required but it was "
                r1.append(r2)
                r1.append(r11)
                java.lang.String r11 = r1.toString()
                r0.<init>(r11)
                throw r0
        }

        public void onCompleted() {
                r2 = this;
                r2.g()
                rx.functions.o<? extends R> r0 = r2.d     // Catch: java.lang.Throwable -> Lc
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> Lc
                r2.i = r0     // Catch: java.lang.Throwable -> Lc
                goto L12
            Lc:
                r0 = move-exception
                rx.l<? super R> r1 = r2.a
                rx.exceptions.a.f(r0, r1)
            L12:
                r2.s()
                return
        }

        public void onError(java.lang.Throwable r3) {
                r2 = this;
                r2.g()
                rx.functions.p<? super java.lang.Throwable, ? extends R> r0 = r2.c     // Catch: java.lang.Throwable -> Lc
                java.lang.Object r0 = r0.call(r3)     // Catch: java.lang.Throwable -> Lc
                r2.i = r0     // Catch: java.lang.Throwable -> Lc
                goto L12
            Lc:
                r0 = move-exception
                rx.l<? super R> r1 = r2.a
                rx.exceptions.a.g(r0, r1, r3)
            L12:
                r2.s()
                return
        }

        public void onNext(T r5) {
                r4 = this;
                long r0 = r4.h     // Catch: java.lang.Throwable -> L13
                r2 = 1
                long r0 = r0 + r2
                r4.h = r0     // Catch: java.lang.Throwable -> L13
                rx.l<? super R> r0 = r4.a     // Catch: java.lang.Throwable -> L13
                rx.functions.p<? super T, ? extends R> r1 = r4.b     // Catch: java.lang.Throwable -> L13
                java.lang.Object r1 = r1.call(r5)     // Catch: java.lang.Throwable -> L13
                r0.onNext(r1)     // Catch: java.lang.Throwable -> L13
                return
            L13:
                r0 = move-exception
                rx.l<? super R> r1 = r4.a
                rx.exceptions.a.g(r0, r1, r5)
                return
        }

        void s() {
                r9 = this;
            L0:
                java.util.concurrent.atomic.AtomicLong r0 = r9.e
                long r0 = r0.get()
                r2 = -9223372036854775808
                long r4 = r0 & r2
                r6 = 0
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 == 0) goto L11
                goto L42
            L11:
                java.util.concurrent.atomic.AtomicLong r4 = r9.e
                long r2 = r2 | r0
                boolean r2 = r4.compareAndSet(r0, r2)
                if (r2 == 0) goto L0
                int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r2 != 0) goto L26
                java.util.concurrent.atomic.AtomicReference<rx.g> r0 = r9.g
                java.lang.Object r0 = r0.get()
                if (r0 != 0) goto L42
            L26:
                rx.l<? super R> r0 = r9.a
                boolean r0 = r0.isUnsubscribed()
                if (r0 != 0) goto L35
                rx.l<? super R> r0 = r9.a
                R r1 = r9.i
                r0.onNext(r1)
            L35:
                rx.l<? super R> r0 = r9.a
                boolean r0 = r0.isUnsubscribed()
                if (r0 != 0) goto L42
                rx.l<? super R> r0 = r9.a
                r0.onCompleted()
            L42:
                return
        }

        public void setProducer(rx.g r6) {
                r5 = this;
                java.util.concurrent.atomic.AtomicReference<rx.g> r0 = r5.g
                r1 = 0
                boolean r0 = androidx.camera.view.p.a(r0, r1, r6)
                if (r0 == 0) goto L19
                java.util.concurrent.atomic.AtomicLong r0 = r5.f
                r1 = 0
                long r3 = r0.getAndSet(r1)
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 == 0) goto L18
                r6.request(r3)
            L18:
                return
            L19:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Producer already set!"
                r6.<init>(r0)
                throw r6
        }
    }

    public l2(rx.functions.p<? super T, ? extends R> r1, rx.functions.p<? super java.lang.Throwable, ? extends R> r2, rx.functions.o<? extends R> r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            rx.l r1 = r0.call(r1)
            return r1
    }

    public rx.l<? super T> call(rx.l<? super R> r5) {
            r4 = this;
            rx.internal.operators.l2$b r0 = new rx.internal.operators.l2$b
            rx.functions.p<? super T, ? extends R> r1 = r4.a
            rx.functions.p<? super java.lang.Throwable, ? extends R> r2 = r4.b
            rx.functions.o<? extends R> r3 = r4.c
            r0.<init>(r5, r1, r2, r3)
            r5.add(r0)
            rx.internal.operators.l2$a r1 = new rx.internal.operators.l2$a
            r1.<init>(r4, r0)
            r5.setProducer(r1)
            return r0
    }
}
