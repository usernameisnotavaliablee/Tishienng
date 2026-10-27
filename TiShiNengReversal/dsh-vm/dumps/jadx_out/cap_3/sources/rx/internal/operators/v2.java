package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class v2<T> extends rx.observables.c<T> {
    final rx.e<? extends T> b;
    final java.util.concurrent.atomic.AtomicReference<rx.internal.operators.v2.d<T>> c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements rx.e.a<T> {
        final /* synthetic */ java.util.concurrent.atomic.AtomicReference a;

        a(java.util.concurrent.atomic.AtomicReference r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
                r0 = this;
                rx.l r1 = (rx.l) r1
                r0.call(r1)
                return
        }

        public void call(rx.l<? super T> r4) {
                r3 = this;
            L0:
                java.util.concurrent.atomic.AtomicReference r0 = r3.a
                java.lang.Object r0 = r0.get()
                rx.internal.operators.v2$d r0 = (rx.internal.operators.v2.d) r0
                if (r0 == 0) goto L10
                boolean r1 = r0.isUnsubscribed()
                if (r1 == 0) goto L24
            L10:
                rx.internal.operators.v2$d r1 = new rx.internal.operators.v2$d
                java.util.concurrent.atomic.AtomicReference r2 = r3.a
                r1.<init>(r2)
                r1.A()
                java.util.concurrent.atomic.AtomicReference r2 = r3.a
                boolean r0 = androidx.camera.view.p.a(r2, r0, r1)
                if (r0 != 0) goto L23
                goto L0
            L23:
                r0 = r1
            L24:
                rx.internal.operators.v2$c r1 = new rx.internal.operators.v2$c
                r1.<init>(r0, r4)
                boolean r0 = r0.g(r1)
                if (r0 == 0) goto L0
                r4.add(r1)
                r4.setProducer(r1)
                return
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b<R> implements rx.e.a<R> {
        final /* synthetic */ boolean a;
        final /* synthetic */ rx.functions.p b;
        final /* synthetic */ rx.e c;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a extends rx.l<R> {
            final /* synthetic */ rx.l a;
            final /* synthetic */ rx.internal.operators.OnSubscribePublishMulticast b;
            final /* synthetic */ rx.internal.operators.v2.b c;

            a(rx.internal.operators.v2.b r1, rx.l r2, rx.internal.operators.OnSubscribePublishMulticast r3) {
                    r0 = this;
                    r0.c = r1
                    r0.a = r2
                    r0.b = r3
                    r0.<init>()
                    return
            }

            public void onCompleted() {
                    r1 = this;
                    rx.internal.operators.OnSubscribePublishMulticast r0 = r1.b
                    r0.unsubscribe()
                    rx.l r0 = r1.a
                    r0.onCompleted()
                    return
            }

            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    rx.internal.operators.OnSubscribePublishMulticast r0 = r1.b
                    r0.unsubscribe()
                    rx.l r0 = r1.a
                    r0.onError(r2)
                    return
            }

            public void onNext(R r2) {
                    r1 = this;
                    rx.l r0 = r1.a
                    r0.onNext(r2)
                    return
            }

            public void setProducer(rx.g r2) {
                    r1 = this;
                    rx.l r0 = r1.a
                    r0.setProducer(r2)
                    return
            }
        }

        b(boolean r1, rx.functions.p r2, rx.e r3) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
                r0 = this;
                rx.l r1 = (rx.l) r1
                r0.call(r1)
                return
        }

        public void call(rx.l<? super R> r4) {
                r3 = this;
                rx.internal.operators.OnSubscribePublishMulticast r0 = new rx.internal.operators.OnSubscribePublishMulticast
                int r1 = rx.internal.util.j.d
                boolean r2 = r3.a
                r0.<init>(r1, r2)
                rx.internal.operators.v2$b$a r1 = new rx.internal.operators.v2$b$a
                r1.<init>(r3, r4, r0)
                r4.add(r0)
                r4.add(r1)
                rx.functions.p r4 = r3.b
                rx.e r2 = rx.e.I6(r0)
                java.lang.Object r4 = r4.call(r2)
                rx.e r4 = (rx.e) r4
                r4.J6(r1)
                rx.e r4 = r3.c
                rx.l r0 = r0.subscriber()
                r4.J6(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class c<T> extends java.util.concurrent.atomic.AtomicLong implements rx.g, rx.m {
        static final long c = Long.MIN_VALUE;
        static final long d = -4611686018427387904L;
        private static final long serialVersionUID = -4453897557930727610L;
        final rx.internal.operators.v2.d<T> a;
        final rx.l<? super T> b;

        public c(rx.internal.operators.v2.d<T> r1, rx.l<? super T> r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r1 = -4611686018427387904(0xc000000000000000, double:-2.0)
                r0.lazySet(r1)
                return
        }

        public long a(long r8) {
                r7 = this;
                r0 = 0
                int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r2 <= 0) goto L50
            L6:
                long r2 = r7.get()
                r4 = -4611686018427387904(0xc000000000000000, double:-2.0)
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 == 0) goto L48
                r4 = -9223372036854775808
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L17
                return r4
            L17:
                long r4 = r2 - r8
                int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r6 < 0) goto L24
                boolean r2 = r7.compareAndSet(r2, r4)
                if (r2 == 0) goto L6
                return r4
            L24:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "More produced ("
                r1.append(r4)
                r1.append(r8)
                java.lang.String r8 = ") than requested ("
                r1.append(r8)
                r1.append(r2)
                java.lang.String r8 = ")"
                r1.append(r8)
                java.lang.String r8 = r1.toString()
                r0.<init>(r8)
                throw r0
            L48:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "Produced without request"
                r8.<init>(r9)
                throw r8
            L50:
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.String r9 = "Cant produce zero or less"
                r8.<init>(r9)
                throw r8
        }

        public boolean isUnsubscribed() {
                r5 = this;
                long r0 = r5.get()
                r2 = -9223372036854775808
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto Lc
                r0 = 1
                return r0
            Lc:
                r0 = 0
                return r0
        }

        public void request(long r9) {
                r8 = this;
                r0 = 0
                int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r2 >= 0) goto L7
                goto L18
            L7:
                long r3 = r8.get()
                r5 = -9223372036854775808
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 != 0) goto L12
                goto L18
            L12:
                int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r5 < 0) goto L19
                if (r2 != 0) goto L19
            L18:
                return
            L19:
                r5 = -4611686018427387904(0xc000000000000000, double:-2.0)
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 != 0) goto L21
                r5 = r9
                goto L2c
            L21:
                long r5 = r3 + r9
                int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r7 >= 0) goto L2c
                r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            L2c:
                boolean r3 = r8.compareAndSet(r3, r5)
                if (r3 == 0) goto L7
                rx.internal.operators.v2$d<T> r9 = r8.a
                r9.s()
                return
        }

        public void unsubscribe() {
                r5 = this;
                long r0 = r5.get()
                r2 = -9223372036854775808
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L1c
                long r0 = r5.getAndSet(r2)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L1c
                rx.internal.operators.v2$d<T> r0 = r5.a
                r0.B(r5)
                rx.internal.operators.v2$d<T> r0 = r5.a
                r0.s()
            L1c:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class d<T> extends rx.l<T> implements rx.m {
        static final rx.internal.operators.v2.c[] h = null;
        static final rx.internal.operators.v2.c[] i = null;
        final java.util.Queue<java.lang.Object> a;
        final java.util.concurrent.atomic.AtomicReference<rx.internal.operators.v2.d<T>> b;
        volatile java.lang.Object c;
        final java.util.concurrent.atomic.AtomicReference<rx.internal.operators.v2.c[]> d;
        final java.util.concurrent.atomic.AtomicBoolean e;
        boolean f;
        boolean g;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements rx.functions.a {
            final /* synthetic */ rx.internal.operators.v2.d a;

            a(rx.internal.operators.v2.d r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            public void call() {
                    r3 = this;
                    rx.internal.operators.v2$d r0 = r3.a
                    java.util.concurrent.atomic.AtomicReference<rx.internal.operators.v2$c[]> r0 = r0.d
                    rx.internal.operators.v2$c[] r1 = rx.internal.operators.v2.d.i
                    r0.getAndSet(r1)
                    rx.internal.operators.v2$d r0 = r3.a
                    java.util.concurrent.atomic.AtomicReference<rx.internal.operators.v2$d<T>> r1 = r0.b
                    r2 = 0
                    androidx.camera.view.p.a(r1, r0, r2)
                    return
            }
        }

        static {
                r0 = 0
                rx.internal.operators.v2$c[] r1 = new rx.internal.operators.v2.c[r0]
                rx.internal.operators.v2.d.h = r1
                rx.internal.operators.v2$c[] r0 = new rx.internal.operators.v2.c[r0]
                rx.internal.operators.v2.d.i = r0
                return
        }

        public d(java.util.concurrent.atomic.AtomicReference<rx.internal.operators.v2.d<T>> r3) {
                r2 = this;
                r2.<init>()
                boolean r0 = rx.internal.util.unsafe.n0.f()
                if (r0 == 0) goto L11
                rx.internal.util.unsafe.z r0 = new rx.internal.util.unsafe.z
                int r1 = rx.internal.util.j.d
                r0.<init>(r1)
                goto L18
            L11:
                rx.internal.util.atomic.d r0 = new rx.internal.util.atomic.d
                int r1 = rx.internal.util.j.d
                r0.<init>(r1)
            L18:
                r2.a = r0
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                rx.internal.operators.v2$c[] r1 = rx.internal.operators.v2.d.h
                r0.<init>(r1)
                r2.d = r0
                r2.b = r3
                java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
                r3.<init>()
                r2.e = r3
                return
        }

        void A() {
                r1 = this;
                rx.internal.operators.v2$d$a r0 = new rx.internal.operators.v2$d$a
                r0.<init>(r1)
                rx.m r0 = rx.subscriptions.f.a(r0)
                r1.add(r0)
                return
        }

        void B(rx.internal.operators.v2.c<T> r7) {
                r6 = this;
            L0:
                java.util.concurrent.atomic.AtomicReference<rx.internal.operators.v2$c[]> r0 = r6.d
                java.lang.Object r0 = r0.get()
                rx.internal.operators.v2$c[] r0 = (rx.internal.operators.v2.c[]) r0
                rx.internal.operators.v2$c[] r1 = rx.internal.operators.v2.d.h
                if (r0 == r1) goto L43
                rx.internal.operators.v2$c[] r1 = rx.internal.operators.v2.d.i
                if (r0 != r1) goto L11
                goto L43
            L11:
                int r1 = r0.length
                r2 = 0
                r3 = 0
            L14:
                if (r3 >= r1) goto L22
                r4 = r0[r3]
                boolean r4 = r4.equals(r7)
                if (r4 == 0) goto L1f
                goto L23
            L1f:
                int r3 = r3 + 1
                goto L14
            L22:
                r3 = -1
            L23:
                if (r3 >= 0) goto L26
                goto L43
            L26:
                r4 = 1
                if (r1 != r4) goto L2c
                rx.internal.operators.v2$c[] r1 = rx.internal.operators.v2.d.h
                goto L3b
            L2c:
                int r5 = r1 + (-1)
                rx.internal.operators.v2$c[] r5 = new rx.internal.operators.v2.c[r5]
                java.lang.System.arraycopy(r0, r2, r5, r2, r3)
                int r2 = r3 + 1
                int r1 = r1 - r3
                int r1 = r1 - r4
                java.lang.System.arraycopy(r0, r2, r5, r3, r1)
                r1 = r5
            L3b:
                java.util.concurrent.atomic.AtomicReference<rx.internal.operators.v2$c[]> r2 = r6.d
                boolean r0 = androidx.camera.view.p.a(r2, r0, r1)
                if (r0 == 0) goto L0
            L43:
                return
        }

        boolean g(rx.internal.operators.v2.c<T> r5) {
                r4 = this;
                r5.getClass()
            L3:
                java.util.concurrent.atomic.AtomicReference<rx.internal.operators.v2$c[]> r0 = r4.d
                java.lang.Object r0 = r0.get()
                rx.internal.operators.v2$c[] r0 = (rx.internal.operators.v2.c[]) r0
                rx.internal.operators.v2$c[] r1 = rx.internal.operators.v2.d.i
                r2 = 0
                if (r0 != r1) goto L11
                return r2
            L11:
                int r1 = r0.length
                int r3 = r1 + 1
                rx.internal.operators.v2$c[] r3 = new rx.internal.operators.v2.c[r3]
                java.lang.System.arraycopy(r0, r2, r3, r2, r1)
                r3[r1] = r5
                java.util.concurrent.atomic.AtomicReference<rx.internal.operators.v2$c[]> r1 = r4.d
                boolean r0 = androidx.camera.view.p.a(r1, r0, r3)
                if (r0 == 0) goto L3
                r5 = 1
                return r5
        }

        boolean j(java.lang.Object r5, boolean r6) {
                r4 = this;
                r0 = 0
                if (r5 == 0) goto L5d
                boolean r1 = rx.internal.operators.v.f(r5)
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L33
                if (r6 == 0) goto L5d
                java.util.concurrent.atomic.AtomicReference<rx.internal.operators.v2$d<T>> r5 = r4.b
                androidx.camera.view.p.a(r5, r4, r2)
                java.util.concurrent.atomic.AtomicReference<rx.internal.operators.v2$c[]> r5 = r4.d     // Catch: java.lang.Throwable -> L29
                rx.internal.operators.v2$c[] r6 = rx.internal.operators.v2.d.i     // Catch: java.lang.Throwable -> L29
                java.lang.Object r5 = r5.getAndSet(r6)     // Catch: java.lang.Throwable -> L29
                rx.internal.operators.v2$c[] r5 = (rx.internal.operators.v2.c[]) r5     // Catch: java.lang.Throwable -> L29
                int r6 = r5.length     // Catch: java.lang.Throwable -> L29
            L1d:
                if (r0 >= r6) goto L2b
                r1 = r5[r0]     // Catch: java.lang.Throwable -> L29
                rx.l<? super T> r1 = r1.b     // Catch: java.lang.Throwable -> L29
                r1.onCompleted()     // Catch: java.lang.Throwable -> L29
                int r0 = r0 + 1
                goto L1d
            L29:
                r5 = move-exception
                goto L2f
            L2b:
                r4.unsubscribe()
                return r3
            L2f:
                r4.unsubscribe()
                throw r5
            L33:
                java.lang.Throwable r5 = rx.internal.operators.v.d(r5)
                java.util.concurrent.atomic.AtomicReference<rx.internal.operators.v2$d<T>> r6 = r4.b
                androidx.camera.view.p.a(r6, r4, r2)
                java.util.concurrent.atomic.AtomicReference<rx.internal.operators.v2$c[]> r6 = r4.d     // Catch: java.lang.Throwable -> L53
                rx.internal.operators.v2$c[] r1 = rx.internal.operators.v2.d.i     // Catch: java.lang.Throwable -> L53
                java.lang.Object r6 = r6.getAndSet(r1)     // Catch: java.lang.Throwable -> L53
                rx.internal.operators.v2$c[] r6 = (rx.internal.operators.v2.c[]) r6     // Catch: java.lang.Throwable -> L53
                int r1 = r6.length     // Catch: java.lang.Throwable -> L53
            L47:
                if (r0 >= r1) goto L55
                r2 = r6[r0]     // Catch: java.lang.Throwable -> L53
                rx.l<? super T> r2 = r2.b     // Catch: java.lang.Throwable -> L53
                r2.onError(r5)     // Catch: java.lang.Throwable -> L53
                int r0 = r0 + 1
                goto L47
            L53:
                r5 = move-exception
                goto L59
            L55:
                r4.unsubscribe()
                return r3
            L59:
                r4.unsubscribe()
                throw r5
            L5d:
                return r0
        }

        public void onCompleted() {
                r1 = this;
                java.lang.Object r0 = r1.c
                if (r0 != 0) goto Ld
                java.lang.Object r0 = rx.internal.operators.v.b()
                r1.c = r0
                r1.s()
            Ld:
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                java.lang.Object r0 = r1.c
                if (r0 != 0) goto Ld
                java.lang.Object r2 = rx.internal.operators.v.c(r2)
                r1.c = r2
                r1.s()
            Ld:
                return
        }

        public void onNext(T r2) {
                r1 = this;
                java.util.Queue<java.lang.Object> r0 = r1.a
                java.lang.Object r2 = rx.internal.operators.v.j(r2)
                boolean r2 = r0.offer(r2)
                if (r2 != 0) goto L15
                rx.exceptions.MissingBackpressureException r2 = new rx.exceptions.MissingBackpressureException
                r2.<init>()
                r1.onError(r2)
                return
            L15:
                r1.s()
                return
        }

        public void onStart() {
                r2 = this;
                int r0 = rx.internal.util.j.d
                long r0 = (long) r0
                r2.request(r0)
                return
        }

        void s() {
                r18 = this;
                r1 = r18
                monitor-enter(r18)
                boolean r0 = r1.f     // Catch: java.lang.Throwable -> Lc
                r2 = 1
                if (r0 == 0) goto Lf
                r1.g = r2     // Catch: java.lang.Throwable -> Lc
                monitor-exit(r18)     // Catch: java.lang.Throwable -> Lc
                return
            Lc:
                r0 = move-exception
                goto Lf3
            Lf:
                r1.f = r2     // Catch: java.lang.Throwable -> Lc
                r3 = 0
                r1.g = r3     // Catch: java.lang.Throwable -> Lc
                monitor-exit(r18)     // Catch: java.lang.Throwable -> Lc
            L15:
                java.lang.Object r0 = r1.c     // Catch: java.lang.Throwable -> L4b
                java.util.Queue<java.lang.Object> r4 = r1.a     // Catch: java.lang.Throwable -> L4b
                boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L4b
                boolean r0 = r1.j(r0, r4)     // Catch: java.lang.Throwable -> L4b
                if (r0 == 0) goto L24
                return
            L24:
                if (r4 != 0) goto Lcf
                java.util.concurrent.atomic.AtomicReference<rx.internal.operators.v2$c[]> r0 = r1.d     // Catch: java.lang.Throwable -> L4b
                java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L4b
                r5 = r0
                rx.internal.operators.v2$c[] r5 = (rx.internal.operators.v2.c[]) r5     // Catch: java.lang.Throwable -> L4b
                int r0 = r5.length     // Catch: java.lang.Throwable -> L4b
                int r6 = r5.length     // Catch: java.lang.Throwable -> L4b
                r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r9 = 0
                r10 = 0
            L38:
                r11 = 0
                if (r9 >= r6) goto L5a
                r13 = r5[r9]     // Catch: java.lang.Throwable -> L4b
                long r13 = r13.get()     // Catch: java.lang.Throwable -> L4b
                int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r15 < 0) goto L4f
                long r7 = java.lang.Math.min(r7, r13)     // Catch: java.lang.Throwable -> L4b
                goto L57
            L4b:
                r0 = move-exception
                r2 = 0
                goto Le8
            L4f:
                r11 = -9223372036854775808
                int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r15 != 0) goto L57
                int r10 = r10 + 1
            L57:
                int r9 = r9 + 1
                goto L38
            L5a:
                r13 = 1
                if (r0 != r10) goto L76
                java.lang.Object r0 = r1.c     // Catch: java.lang.Throwable -> L4b
                java.util.Queue<java.lang.Object> r4 = r1.a     // Catch: java.lang.Throwable -> L4b
                java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L4b
                if (r4 != 0) goto L6a
                r4 = 1
                goto L6b
            L6a:
                r4 = 0
            L6b:
                boolean r0 = r1.j(r0, r4)     // Catch: java.lang.Throwable -> L4b
                if (r0 == 0) goto L72
                return
            L72:
                r1.request(r13)     // Catch: java.lang.Throwable -> L4b
                goto L15
            L76:
                r6 = 0
            L77:
                long r9 = (long) r6     // Catch: java.lang.Throwable -> L4b
                int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r0 >= 0) goto Lc1
                java.lang.Object r0 = r1.c     // Catch: java.lang.Throwable -> L4b
                java.util.Queue<java.lang.Object> r4 = r1.a     // Catch: java.lang.Throwable -> L4b
                java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L4b
                if (r4 != 0) goto L88
                r15 = 1
                goto L89
            L88:
                r15 = 0
            L89:
                boolean r0 = r1.j(r0, r15)     // Catch: java.lang.Throwable -> L4b
                if (r0 == 0) goto L90
                return
            L90:
                if (r15 == 0) goto L94
                r4 = r15
                goto Lc1
            L94:
                java.lang.Object r4 = rx.internal.operators.v.e(r4)     // Catch: java.lang.Throwable -> L4b
                int r9 = r5.length     // Catch: java.lang.Throwable -> L4b
                r10 = 0
            L9a:
                if (r10 >= r9) goto Lbc
                r2 = r5[r10]     // Catch: java.lang.Throwable -> L4b
                long r16 = r2.get()     // Catch: java.lang.Throwable -> L4b
                int r0 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
                if (r0 <= 0) goto Lb8
                rx.l<? super T> r0 = r2.b     // Catch: java.lang.Throwable -> Laf
                r0.onNext(r4)     // Catch: java.lang.Throwable -> Laf
                r2.a(r13)     // Catch: java.lang.Throwable -> L4b
                goto Lb8
            Laf:
                r0 = move-exception
                r2.unsubscribe()     // Catch: java.lang.Throwable -> L4b
                rx.l<? super T> r2 = r2.b     // Catch: java.lang.Throwable -> L4b
                rx.exceptions.a.g(r0, r2, r4)     // Catch: java.lang.Throwable -> L4b
            Lb8:
                int r10 = r10 + 1
                r2 = 1
                goto L9a
            Lbc:
                int r6 = r6 + 1
                r4 = r15
                r2 = 1
                goto L77
            Lc1:
                if (r6 <= 0) goto Lc6
                r1.request(r9)     // Catch: java.lang.Throwable -> L4b
            Lc6:
                int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
                if (r0 == 0) goto Lcf
                if (r4 != 0) goto Lcf
            Lcc:
                r2 = 1
                goto L15
            Lcf:
                monitor-enter(r18)     // Catch: java.lang.Throwable -> L4b
                boolean r0 = r1.g     // Catch: java.lang.Throwable -> Ldb
                if (r0 != 0) goto Lde
                r1.f = r3     // Catch: java.lang.Throwable -> Ldb
                monitor-exit(r18)     // Catch: java.lang.Throwable -> Ld8
                return
            Ld8:
                r0 = move-exception
                r2 = 1
                goto Le2
            Ldb:
                r0 = move-exception
                r2 = 0
                goto Le2
            Lde:
                r1.g = r3     // Catch: java.lang.Throwable -> Ldb
                monitor-exit(r18)     // Catch: java.lang.Throwable -> Ldb
                goto Lcc
            Le2:
                monitor-exit(r18)     // Catch: java.lang.Throwable -> Le6
                throw r0     // Catch: java.lang.Throwable -> Le4
            Le4:
                r0 = move-exception
                goto Le8
            Le6:
                r0 = move-exception
                goto Le2
            Le8:
                if (r2 != 0) goto Lf2
                monitor-enter(r18)
                r1.f = r3     // Catch: java.lang.Throwable -> Lef
                monitor-exit(r18)     // Catch: java.lang.Throwable -> Lef
                goto Lf2
            Lef:
                r0 = move-exception
                monitor-exit(r18)     // Catch: java.lang.Throwable -> Lef
                throw r0
            Lf2:
                throw r0
            Lf3:
                monitor-exit(r18)     // Catch: java.lang.Throwable -> Lc
                throw r0
        }
    }

    private v2(rx.e.a<T> r1, rx.e<? extends T> r2, java.util.concurrent.atomic.AtomicReference<rx.internal.operators.v2.d<T>> r3) {
            r0 = this;
            r0.<init>(r1)
            r0.b = r2
            r0.c = r3
            return
    }

    public static <T, R> rx.e<R> C7(rx.e<? extends T> r1, rx.functions.p<? super rx.e<T>, ? extends rx.e<R>> r2) {
            r0 = 0
            rx.e r1 = D7(r1, r2, r0)
            return r1
    }

    public static <T, R> rx.e<R> D7(rx.e<? extends T> r1, rx.functions.p<? super rx.e<T>, ? extends rx.e<R>> r2, boolean r3) {
            rx.internal.operators.v2$b r0 = new rx.internal.operators.v2$b
            r0.<init>(r3, r2, r1)
            rx.e r1 = rx.e.I6(r0)
            return r1
    }

    public static <T> rx.observables.c<T> E7(rx.e<? extends T> r3) {
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            rx.internal.operators.v2$a r1 = new rx.internal.operators.v2$a
            r1.<init>(r0)
            rx.internal.operators.v2 r2 = new rx.internal.operators.v2
            r2.<init>(r1, r3, r0)
            return r2
    }

    @Override // rx.observables.c
    public void A7(rx.functions.b<? super rx.m> r5) {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<rx.internal.operators.v2$d<T>> r0 = r4.c
            java.lang.Object r0 = r0.get()
            rx.internal.operators.v2$d r0 = (rx.internal.operators.v2.d) r0
            if (r0 == 0) goto L10
            boolean r1 = r0.isUnsubscribed()
            if (r1 == 0) goto L24
        L10:
            rx.internal.operators.v2$d r1 = new rx.internal.operators.v2$d
            java.util.concurrent.atomic.AtomicReference<rx.internal.operators.v2$d<T>> r2 = r4.c
            r1.<init>(r2)
            r1.A()
            java.util.concurrent.atomic.AtomicReference<rx.internal.operators.v2$d<T>> r2 = r4.c
            boolean r0 = androidx.camera.view.p.a(r2, r0, r1)
            if (r0 != 0) goto L23
            goto L0
        L23:
            r0 = r1
        L24:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.e
            boolean r1 = r1.get()
            r2 = 0
            if (r1 != 0) goto L37
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.e
            r3 = 1
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 == 0) goto L37
            r2 = 1
        L37:
            r5.call(r0)
            if (r2 == 0) goto L41
            rx.e<? extends T> r5 = r4.b
            r5.J6(r0)
        L41:
            return
    }
}
