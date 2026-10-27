package rx.internal.operators;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class OnSubscribePublishMulticast<T> extends java.util.concurrent.atomic.AtomicInteger implements rx.e.a<T>, rx.f<T>, rx.m {
    static final rx.internal.operators.OnSubscribePublishMulticast.b<?>[] EMPTY = null;
    static final rx.internal.operators.OnSubscribePublishMulticast.b<?>[] TERMINATED = null;
    private static final long serialVersionUID = -3741892510772238743L;
    final boolean delayError;
    volatile boolean done;
    java.lang.Throwable error;
    final rx.internal.operators.OnSubscribePublishMulticast.a<T> parent;
    final int prefetch;
    volatile rx.g producer;
    final java.util.Queue<T> queue;
    volatile rx.internal.operators.OnSubscribePublishMulticast.b<T>[] subscribers;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a<T> extends rx.l<T> {
        final rx.internal.operators.OnSubscribePublishMulticast<T> a;

        public a(rx.internal.operators.OnSubscribePublishMulticast<T> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public void onCompleted() {
                r1 = this;
                rx.internal.operators.OnSubscribePublishMulticast<T> r0 = r1.a
                r0.onCompleted()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                rx.internal.operators.OnSubscribePublishMulticast<T> r0 = r1.a
                r0.onError(r2)
                return
        }

        public void onNext(T r2) {
                r1 = this;
                rx.internal.operators.OnSubscribePublishMulticast<T> r0 = r1.a
                r0.onNext(r2)
                return
        }

        public void setProducer(rx.g r2) {
                r1 = this;
                rx.internal.operators.OnSubscribePublishMulticast<T> r0 = r1.a
                r0.setProducer(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b<T> extends java.util.concurrent.atomic.AtomicLong implements rx.g, rx.m {
        private static final long serialVersionUID = 960704844171597367L;
        final rx.l<? super T> a;
        final rx.internal.operators.OnSubscribePublishMulticast<T> b;
        final java.util.concurrent.atomic.AtomicBoolean c;

        public b(rx.l<? super T> r1, rx.internal.operators.OnSubscribePublishMulticast<T> r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
                r1.<init>()
                r0.c = r1
                return
        }

        public boolean isUnsubscribed() {
                r1 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r1.c
                boolean r0 = r0.get()
                return r0
        }

        public void request(long r4) {
                r3 = this;
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 < 0) goto L11
                if (r2 == 0) goto L10
                rx.internal.operators.a.b(r3, r4)
                rx.internal.operators.OnSubscribePublishMulticast<T> r4 = r3.b
                r4.drain()
            L10:
                return
            L11:
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

        public void unsubscribe() {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.c
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto Lf
                rx.internal.operators.OnSubscribePublishMulticast<T> r0 = r3.b
                r0.remove(r3)
            Lf:
                return
        }
    }

    static {
            r0 = 0
            rx.internal.operators.OnSubscribePublishMulticast$b[] r1 = new rx.internal.operators.OnSubscribePublishMulticast.b[r0]
            rx.internal.operators.OnSubscribePublishMulticast.EMPTY = r1
            rx.internal.operators.OnSubscribePublishMulticast$b[] r0 = new rx.internal.operators.OnSubscribePublishMulticast.b[r0]
            rx.internal.operators.OnSubscribePublishMulticast.TERMINATED = r0
            return
    }

    public OnSubscribePublishMulticast(int r3, boolean r4) {
            r2 = this;
            r2.<init>()
            if (r3 <= 0) goto L2a
            r2.prefetch = r3
            r2.delayError = r4
            boolean r4 = rx.internal.util.unsafe.n0.f()
            if (r4 == 0) goto L17
            rx.internal.util.unsafe.z r4 = new rx.internal.util.unsafe.z
            r4.<init>(r3)
            r2.queue = r4
            goto L1e
        L17:
            rx.internal.util.atomic.d r4 = new rx.internal.util.atomic.d
            r4.<init>(r3)
            r2.queue = r4
        L1e:
            rx.internal.operators.OnSubscribePublishMulticast$b<?>[] r3 = rx.internal.operators.OnSubscribePublishMulticast.EMPTY
            r2.subscribers = r3
            rx.internal.operators.OnSubscribePublishMulticast$a r3 = new rx.internal.operators.OnSubscribePublishMulticast$a
            r3.<init>(r2)
            r2.parent = r3
            return
        L2a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "prefetch > 0 required but it was "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    boolean add(rx.internal.operators.OnSubscribePublishMulticast.b<T> r5) {
            r4 = this;
            rx.internal.operators.OnSubscribePublishMulticast$b<T>[] r0 = r4.subscribers
            rx.internal.operators.OnSubscribePublishMulticast$b<?>[] r1 = rx.internal.operators.OnSubscribePublishMulticast.TERMINATED
            r2 = 0
            if (r0 != r1) goto L8
            return r2
        L8:
            monitor-enter(r4)
            rx.internal.operators.OnSubscribePublishMulticast$b<T>[] r0 = r4.subscribers     // Catch: java.lang.Throwable -> Lf
            if (r0 != r1) goto L11
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lf
            return r2
        Lf:
            r5 = move-exception
            goto L20
        L11:
            int r1 = r0.length     // Catch: java.lang.Throwable -> Lf
            int r3 = r1 + 1
            rx.internal.operators.OnSubscribePublishMulticast$b[] r3 = new rx.internal.operators.OnSubscribePublishMulticast.b[r3]     // Catch: java.lang.Throwable -> Lf
            java.lang.System.arraycopy(r0, r2, r3, r2, r1)     // Catch: java.lang.Throwable -> Lf
            r3[r1] = r5     // Catch: java.lang.Throwable -> Lf
            r4.subscribers = r3     // Catch: java.lang.Throwable -> Lf
            r5 = 1
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lf
            return r5
        L20:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lf
            throw r5
    }

    public /* bridge */ /* synthetic */ void call(java.lang.Object r1) {
            r0 = this;
            rx.l r1 = (rx.l) r1
            r0.call(r1)
            return
    }

    public void call(rx.l<? super T> r3) {
            r2 = this;
            rx.internal.operators.OnSubscribePublishMulticast$b r0 = new rx.internal.operators.OnSubscribePublishMulticast$b
            r0.<init>(r3, r2)
            r3.add(r0)
            r3.setProducer(r0)
            boolean r1 = r2.add(r0)
            if (r1 == 0) goto L1f
            boolean r3 = r0.isUnsubscribed()
            if (r3 == 0) goto L1b
            r2.remove(r0)
            return
        L1b:
            r2.drain()
            return
        L1f:
            java.lang.Throwable r0 = r2.error
            if (r0 == 0) goto L27
            r3.onError(r0)
            return
        L27:
            r3.onCompleted()
            return
    }

    boolean checkTerminated(boolean r5, boolean r6) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L5c
            boolean r5 = r4.delayError
            r1 = 1
            if (r5 == 0) goto L2d
            if (r6 == 0) goto L5c
            rx.internal.operators.OnSubscribePublishMulticast$b[] r5 = r4.terminate()
            java.lang.Throwable r6 = r4.error
            if (r6 == 0) goto L1f
            int r2 = r5.length
        L13:
            if (r0 >= r2) goto L2c
            r3 = r5[r0]
            rx.l<? super T> r3 = r3.a
            r3.onError(r6)
            int r0 = r0 + 1
            goto L13
        L1f:
            int r6 = r5.length
        L20:
            if (r0 >= r6) goto L2c
            r2 = r5[r0]
            rx.l<? super T> r2 = r2.a
            r2.onCompleted()
            int r0 = r0 + 1
            goto L20
        L2c:
            return r1
        L2d:
            java.lang.Throwable r5 = r4.error
            if (r5 == 0) goto L48
            java.util.Queue<T> r6 = r4.queue
            r6.clear()
            rx.internal.operators.OnSubscribePublishMulticast$b[] r6 = r4.terminate()
            int r2 = r6.length
        L3b:
            if (r0 >= r2) goto L47
            r3 = r6[r0]
            rx.l<? super T> r3 = r3.a
            r3.onError(r5)
            int r0 = r0 + 1
            goto L3b
        L47:
            return r1
        L48:
            if (r6 == 0) goto L5c
            rx.internal.operators.OnSubscribePublishMulticast$b[] r5 = r4.terminate()
            int r6 = r5.length
        L4f:
            if (r0 >= r6) goto L5b
            r2 = r5[r0]
            rx.l<? super T> r2 = r2.a
            r2.onCompleted()
            int r0 = r0 + 1
            goto L4f
        L5b:
            return r1
        L5c:
            return r0
    }

    void drain() {
            r14 = this;
            int r0 = r14.getAndIncrement()
            if (r0 == 0) goto L8
            goto L82
        L8:
            java.util.Queue<T> r0 = r14.queue
            r1 = 0
            r2 = 0
        Lc:
            rx.internal.operators.OnSubscribePublishMulticast$b<T>[] r3 = r14.subscribers
            int r4 = r3.length
            int r5 = r3.length
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r8 = 0
        L16:
            if (r8 >= r5) goto L25
            r9 = r3[r8]
            long r9 = r9.get()
            long r6 = java.lang.Math.min(r6, r9)
            int r8 = r8 + 1
            goto L16
        L25:
            if (r4 == 0) goto L7b
            r4 = 0
            r8 = r4
        L2a:
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 == 0) goto L55
            boolean r11 = r14.done
            java.lang.Object r12 = r0.poll()
            if (r12 != 0) goto L38
            r13 = 1
            goto L39
        L38:
            r13 = 0
        L39:
            boolean r11 = r14.checkTerminated(r11, r13)
            if (r11 == 0) goto L40
            goto L82
        L40:
            if (r13 == 0) goto L43
            goto L55
        L43:
            int r10 = r3.length
            r11 = 0
        L45:
            if (r11 >= r10) goto L51
            r13 = r3[r11]
            rx.l<? super T> r13 = r13.a
            r13.onNext(r12)
            int r11 = r11 + 1
            goto L45
        L51:
            r10 = 1
            long r8 = r8 + r10
            goto L2a
        L55:
            if (r10 != 0) goto L64
            boolean r6 = r14.done
            boolean r7 = r0.isEmpty()
            boolean r6 = r14.checkTerminated(r6, r7)
            if (r6 == 0) goto L64
            goto L82
        L64:
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 == 0) goto L7b
            rx.g r4 = r14.producer
            if (r4 == 0) goto L6f
            r4.request(r8)
        L6f:
            int r4 = r3.length
            r5 = 0
        L71:
            if (r5 >= r4) goto L7b
            r6 = r3[r5]
            rx.internal.operators.a.i(r6, r8)
            int r5 = r5 + 1
            goto L71
        L7b:
            int r2 = -r2
            int r2 = r14.addAndGet(r2)
            if (r2 != 0) goto Lc
        L82:
            return
    }

    public boolean isUnsubscribed() {
            r1 = this;
            rx.internal.operators.OnSubscribePublishMulticast$a<T> r0 = r1.parent
            boolean r0 = r0.isUnsubscribed()
            return r0
    }

    public void onCompleted() {
            r1 = this;
            r0 = 1
            r1.done = r0
            r1.drain()
            return
    }

    public void onError(java.lang.Throwable r1) {
            r0 = this;
            r0.error = r1
            r1 = 1
            r0.done = r1
            r0.drain()
            return
    }

    public void onNext(T r2) {
            r1 = this;
            java.util.Queue<T> r0 = r1.queue
            boolean r2 = r0.offer(r2)
            if (r2 != 0) goto L19
            rx.internal.operators.OnSubscribePublishMulticast$a<T> r2 = r1.parent
            r2.unsubscribe()
            rx.exceptions.MissingBackpressureException r2 = new rx.exceptions.MissingBackpressureException
            java.lang.String r0 = "Queue full?!"
            r2.<init>(r0)
            r1.error = r2
            r2 = 1
            r1.done = r2
        L19:
            r1.drain()
            return
    }

    void remove(rx.internal.operators.OnSubscribePublishMulticast.b<T> r6) {
            r5 = this;
            rx.internal.operators.OnSubscribePublishMulticast$b<T>[] r0 = r5.subscribers
            rx.internal.operators.OnSubscribePublishMulticast$b<?>[] r1 = rx.internal.operators.OnSubscribePublishMulticast.TERMINATED
            if (r0 == r1) goto L44
            rx.internal.operators.OnSubscribePublishMulticast$b<?>[] r2 = rx.internal.operators.OnSubscribePublishMulticast.EMPTY
            if (r0 != r2) goto Lb
            goto L44
        Lb:
            monitor-enter(r5)
            rx.internal.operators.OnSubscribePublishMulticast$b<T>[] r0 = r5.subscribers     // Catch: java.lang.Throwable -> L20
            if (r0 == r1) goto L40
            if (r0 != r2) goto L13
            goto L40
        L13:
            int r1 = r0.length     // Catch: java.lang.Throwable -> L20
            r2 = 0
            r3 = 0
        L16:
            if (r3 >= r1) goto L22
            r4 = r0[r3]     // Catch: java.lang.Throwable -> L20
            if (r4 != r6) goto L1d
            goto L23
        L1d:
            int r3 = r3 + 1
            goto L16
        L20:
            r6 = move-exception
            goto L42
        L22:
            r3 = -1
        L23:
            if (r3 >= 0) goto L27
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L20
            return
        L27:
            r6 = 1
            if (r1 != r6) goto L2d
            rx.internal.operators.OnSubscribePublishMulticast$b<?>[] r6 = rx.internal.operators.OnSubscribePublishMulticast.EMPTY     // Catch: java.lang.Throwable -> L20
            goto L3c
        L2d:
            int r4 = r1 + (-1)
            rx.internal.operators.OnSubscribePublishMulticast$b[] r4 = new rx.internal.operators.OnSubscribePublishMulticast.b[r4]     // Catch: java.lang.Throwable -> L20
            java.lang.System.arraycopy(r0, r2, r4, r2, r3)     // Catch: java.lang.Throwable -> L20
            int r2 = r3 + 1
            int r1 = r1 - r3
            int r1 = r1 - r6
            java.lang.System.arraycopy(r0, r2, r4, r3, r1)     // Catch: java.lang.Throwable -> L20
            r6 = r4
        L3c:
            r5.subscribers = r6     // Catch: java.lang.Throwable -> L20
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L20
            return
        L40:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L20
            return
        L42:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L20
            throw r6
        L44:
            return
    }

    void setProducer(rx.g r3) {
            r2 = this;
            r2.producer = r3
            int r0 = r2.prefetch
            long r0 = (long) r0
            r3.request(r0)
            return
    }

    public rx.l<T> subscriber() {
            r1 = this;
            rx.internal.operators.OnSubscribePublishMulticast$a<T> r0 = r1.parent
            return r0
    }

    rx.internal.operators.OnSubscribePublishMulticast.b<T>[] terminate() {
            r2 = this;
            rx.internal.operators.OnSubscribePublishMulticast$b<T>[] r0 = r2.subscribers
            rx.internal.operators.OnSubscribePublishMulticast$b<?>[] r1 = rx.internal.operators.OnSubscribePublishMulticast.TERMINATED
            if (r0 == r1) goto L14
            monitor-enter(r2)
            rx.internal.operators.OnSubscribePublishMulticast$b<T>[] r0 = r2.subscribers     // Catch: java.lang.Throwable -> Le
            if (r0 == r1) goto L10
            r2.subscribers = r1     // Catch: java.lang.Throwable -> Le
            goto L10
        Le:
            r0 = move-exception
            goto L12
        L10:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            return r0
        L12:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            throw r0
        L14:
            return r0
    }

    public void unsubscribe() {
            r1 = this;
            rx.internal.operators.OnSubscribePublishMulticast$a<T> r0 = r1.parent
            r0.unsubscribe()
            return
    }
}
