package rx.internal.producers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class QueuedProducer<T> extends java.util.concurrent.atomic.AtomicLong implements rx.g, rx.f<T> {
    static final java.lang.Object NULL_SENTINEL = null;
    private static final long serialVersionUID = 7277121710709137047L;
    final rx.l<? super T> child;
    volatile boolean done;
    java.lang.Throwable error;
    final java.util.Queue<java.lang.Object> queue;
    final java.util.concurrent.atomic.AtomicInteger wip;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            rx.internal.producers.QueuedProducer.NULL_SENTINEL = r0
            return
    }

    public QueuedProducer(rx.l<? super T> r2) {
            r1 = this;
            boolean r0 = rx.internal.util.unsafe.n0.f()
            if (r0 == 0) goto Lc
            rx.internal.util.unsafe.g0 r0 = new rx.internal.util.unsafe.g0
            r0.<init>()
            goto L11
        Lc:
            rx.internal.util.atomic.f r0 = new rx.internal.util.atomic.f
            r0.<init>()
        L11:
            r1.<init>(r2, r0)
            return
    }

    public QueuedProducer(rx.l<? super T> r1, java.util.Queue<java.lang.Object> r2) {
            r0 = this;
            r0.<init>()
            r0.child = r1
            r0.queue = r2
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r1.<init>()
            r0.wip = r1
            return
    }

    private boolean checkTerminated(boolean r3, boolean r4) {
            r2 = this;
            rx.l<? super T> r0 = r2.child
            boolean r0 = r0.isUnsubscribed()
            r1 = 1
            if (r0 == 0) goto La
            return r1
        La:
            if (r3 == 0) goto L23
            java.lang.Throwable r3 = r2.error
            if (r3 == 0) goto L1b
            java.util.Queue<java.lang.Object> r4 = r2.queue
            r4.clear()
            rx.l<? super T> r4 = r2.child
            r4.onError(r3)
            return r1
        L1b:
            if (r4 == 0) goto L23
            rx.l<? super T> r3 = r2.child
            r3.onCompleted()
            return r1
        L23:
            r3 = 0
            return r3
    }

    private void drain() {
            r12 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r12.wip
            int r0 = r0.getAndIncrement()
            if (r0 != 0) goto L79
            rx.l<? super T> r0 = r12.child
            java.util.Queue<java.lang.Object> r1 = r12.queue
        Lc:
            boolean r2 = r12.done
            boolean r3 = r1.isEmpty()
            boolean r2 = r12.checkTerminated(r2, r3)
            if (r2 == 0) goto L19
            goto L79
        L19:
            java.util.concurrent.atomic.AtomicInteger r2 = r12.wip
            r3 = 1
            r2.lazySet(r3)
            long r4 = r12.get()
            r6 = 0
            r8 = r6
        L26:
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L5c
            boolean r2 = r12.done
            java.lang.Object r10 = r1.poll()
            if (r10 != 0) goto L34
            r11 = 1
            goto L35
        L34:
            r11 = 0
        L35:
            boolean r2 = r12.checkTerminated(r2, r11)
            if (r2 == 0) goto L3c
            goto L79
        L3c:
            if (r10 != 0) goto L3f
            goto L5c
        L3f:
            r2 = 0
            java.lang.Object r11 = rx.internal.producers.QueuedProducer.NULL_SENTINEL     // Catch: java.lang.Throwable -> L48
            if (r10 != r11) goto L4a
            r0.onNext(r2)     // Catch: java.lang.Throwable -> L48
            goto L4d
        L48:
            r1 = move-exception
            goto L52
        L4a:
            r0.onNext(r10)     // Catch: java.lang.Throwable -> L48
        L4d:
            r10 = 1
            long r4 = r4 - r10
            long r8 = r8 + r10
            goto L26
        L52:
            java.lang.Object r3 = rx.internal.producers.QueuedProducer.NULL_SENTINEL
            if (r10 == r3) goto L57
            goto L58
        L57:
            r10 = r2
        L58:
            rx.exceptions.a.g(r1, r0, r10)
            return
        L5c:
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 == 0) goto L71
            long r2 = r12.get()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L71
            long r2 = -r8
            r12.addAndGet(r2)
        L71:
            java.util.concurrent.atomic.AtomicInteger r2 = r12.wip
            int r2 = r2.decrementAndGet()
            if (r2 != 0) goto Lc
        L79:
            return
    }

    public boolean offer(T r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto Le
            java.util.Queue<java.lang.Object> r3 = r2.queue
            java.lang.Object r1 = rx.internal.producers.QueuedProducer.NULL_SENTINEL
            boolean r3 = r3.offer(r1)
            if (r3 != 0) goto L17
            return r0
        Le:
            java.util.Queue<java.lang.Object> r1 = r2.queue
            boolean r3 = r1.offer(r3)
            if (r3 != 0) goto L17
            return r0
        L17:
            r2.drain()
            r3 = 1
            return r3
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

    public void onNext(T r1) {
            r0 = this;
            boolean r1 = r0.offer(r1)
            if (r1 != 0) goto Le
            rx.exceptions.MissingBackpressureException r1 = new rx.exceptions.MissingBackpressureException
            r1.<init>()
            r0.onError(r1)
        Le:
            return
    }

    public void request(long r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto Lf
            if (r2 <= 0) goto Le
            rx.internal.operators.a.b(r3, r4)
            r3.drain()
        Le:
            return
        Lf:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "n >= 0 required"
            r4.<init>(r5)
            throw r4
    }
}
