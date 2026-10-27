package rx.internal.producers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class QueuedValueProducer<T> extends java.util.concurrent.atomic.AtomicLong implements rx.g {
    static final java.lang.Object NULL_SENTINEL = null;
    private static final long serialVersionUID = 7277121710709137047L;
    final rx.l<? super T> child;
    final java.util.Queue<java.lang.Object> queue;
    final java.util.concurrent.atomic.AtomicInteger wip;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            rx.internal.producers.QueuedValueProducer.NULL_SENTINEL = r0
            return
    }

    public QueuedValueProducer(rx.l<? super T> r2) {
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

    public QueuedValueProducer(rx.l<? super T> r1, java.util.Queue<java.lang.Object> r2) {
            r0 = this;
            r0.<init>()
            r0.child = r1
            r0.queue = r2
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r1.<init>()
            r0.wip = r1
            return
    }

    private void drain() {
            r11 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r11.wip
            int r0 = r0.getAndIncrement()
            if (r0 != 0) goto L6b
            rx.l<? super T> r0 = r11.child
            java.util.Queue<java.lang.Object> r1 = r11.queue
        Lc:
            boolean r2 = r0.isUnsubscribed()
            if (r2 == 0) goto L13
            goto L6b
        L13:
            java.util.concurrent.atomic.AtomicInteger r2 = r11.wip
            r3 = 1
            r2.lazySet(r3)
            long r2 = r11.get()
            r4 = 0
            r6 = r4
        L20:
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 == 0) goto L4e
            java.lang.Object r8 = r1.poll()
            if (r8 == 0) goto L4e
            r9 = 0
            java.lang.Object r10 = rx.internal.producers.QueuedValueProducer.NULL_SENTINEL     // Catch: java.lang.Throwable -> L33
            if (r8 != r10) goto L35
            r0.onNext(r9)     // Catch: java.lang.Throwable -> L33
            goto L38
        L33:
            r1 = move-exception
            goto L44
        L35:
            r0.onNext(r8)     // Catch: java.lang.Throwable -> L33
        L38:
            boolean r8 = r0.isUnsubscribed()
            if (r8 == 0) goto L3f
            goto L6b
        L3f:
            r8 = 1
            long r2 = r2 - r8
            long r6 = r6 + r8
            goto L20
        L44:
            java.lang.Object r2 = rx.internal.producers.QueuedValueProducer.NULL_SENTINEL
            if (r8 == r2) goto L49
            goto L4a
        L49:
            r8 = r9
        L4a:
            rx.exceptions.a.g(r1, r0, r8)
            return
        L4e:
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 == 0) goto L63
            long r2 = r11.get()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 == 0) goto L63
            long r2 = -r6
            r11.addAndGet(r2)
        L63:
            java.util.concurrent.atomic.AtomicInteger r2 = r11.wip
            int r2 = r2.decrementAndGet()
            if (r2 != 0) goto Lc
        L6b:
            return
    }

    public boolean offer(T r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto Le
            java.util.Queue<java.lang.Object> r3 = r2.queue
            java.lang.Object r1 = rx.internal.producers.QueuedValueProducer.NULL_SENTINEL
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
