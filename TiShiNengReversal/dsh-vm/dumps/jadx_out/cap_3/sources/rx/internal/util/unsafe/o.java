package rx.internal.util.unsafe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@rx.internal.util.SuppressAnimalSniffer
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class o<E> extends rx.internal.util.unsafe.a<E> {
    public o() {
            r1 = this;
            r1.<init>()
            rx.internal.util.atomic.LinkedQueueNode r0 = new rx.internal.util.atomic.LinkedQueueNode
            r0.<init>()
            r1.consumerNode = r0
            r1.m(r0)
            return
    }

    protected rx.internal.util.atomic.LinkedQueueNode<E> m(rx.internal.util.atomic.LinkedQueueNode<E> r7) {
            r6 = this;
        L0:
            rx.internal.util.atomic.LinkedQueueNode<E> r4 = r6.producerNode
            sun.misc.Unsafe r0 = rx.internal.util.unsafe.n0.a
            long r2 = rx.internal.util.unsafe.e.q
            r1 = r6
            r5 = r7
            boolean r7 = com.google.android.gms.internal.mlkit_acceleration.a.a(r0, r1, r2, r4, r5)
            if (r7 == 0) goto Lf
            return r4
        Lf:
            r7 = r5
            goto L0
    }

    @Override // java.util.Queue
    public boolean offer(E r2) {
            r1 = this;
            if (r2 == 0) goto L10
            rx.internal.util.atomic.LinkedQueueNode r0 = new rx.internal.util.atomic.LinkedQueueNode
            r0.<init>(r2)
            rx.internal.util.atomic.LinkedQueueNode r2 = r1.m(r0)
            r2.soNext(r0)
            r2 = 1
            return r2
        L10:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "null elements not allowed"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Queue
    public E peek() {
            r2 = this;
            rx.internal.util.atomic.LinkedQueueNode<E> r0 = r2.consumerNode
            rx.internal.util.atomic.LinkedQueueNode r1 = r0.lvNext()
            if (r1 == 0) goto Ld
            java.lang.Object r0 = r1.lpValue()
            return r0
        Ld:
            rx.internal.util.atomic.LinkedQueueNode r1 = r2.d()
            if (r0 == r1) goto L1f
        L13:
            rx.internal.util.atomic.LinkedQueueNode r1 = r0.lvNext()
            if (r1 != 0) goto L1a
            goto L13
        L1a:
            java.lang.Object r0 = r1.lpValue()
            return r0
        L1f:
            r0 = 0
            return r0
    }

    @Override // java.util.Queue
    public E poll() {
            r2 = this;
            rx.internal.util.atomic.LinkedQueueNode r0 = r2.f()
            rx.internal.util.atomic.LinkedQueueNode r1 = r0.lvNext()
            if (r1 == 0) goto L12
            java.lang.Object r0 = r1.getAndNullValue()
            r2.j(r1)
            return r0
        L12:
            rx.internal.util.atomic.LinkedQueueNode r1 = r2.d()
            if (r0 == r1) goto L26
        L18:
            rx.internal.util.atomic.LinkedQueueNode r1 = r0.lvNext()
            if (r1 != 0) goto L1f
            goto L18
        L1f:
            java.lang.Object r0 = r1.getAndNullValue()
            r2.consumerNode = r1
            return r0
        L26:
            r0 = 0
            return r0
    }
}
