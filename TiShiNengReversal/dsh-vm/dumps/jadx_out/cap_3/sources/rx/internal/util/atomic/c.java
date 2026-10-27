package rx.internal.util.atomic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class c<E> extends rx.internal.util.atomic.b<E> {
    public c() {
            r1 = this;
            r1.<init>()
            rx.internal.util.atomic.LinkedQueueNode r0 = new rx.internal.util.atomic.LinkedQueueNode
            r0.<init>()
            r1.g(r0)
            r1.m(r0)
            return
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
            rx.internal.util.atomic.LinkedQueueNode r0 = r2.a()
            rx.internal.util.atomic.LinkedQueueNode r1 = r0.lvNext()
            if (r1 == 0) goto Lf
            java.lang.Object r0 = r1.lpValue()
            return r0
        Lf:
            rx.internal.util.atomic.LinkedQueueNode r1 = r2.f()
            if (r0 == r1) goto L21
        L15:
            rx.internal.util.atomic.LinkedQueueNode r1 = r0.lvNext()
            if (r1 != 0) goto L1c
            goto L15
        L1c:
            java.lang.Object r0 = r1.lpValue()
            return r0
        L21:
            r0 = 0
            return r0
    }

    @Override // java.util.Queue
    public E poll() {
            r2 = this;
            rx.internal.util.atomic.LinkedQueueNode r0 = r2.a()
            rx.internal.util.atomic.LinkedQueueNode r1 = r0.lvNext()
            if (r1 == 0) goto L12
            java.lang.Object r0 = r1.getAndNullValue()
            r2.g(r1)
            return r0
        L12:
            rx.internal.util.atomic.LinkedQueueNode r1 = r2.f()
            if (r0 == r1) goto L27
        L18:
            rx.internal.util.atomic.LinkedQueueNode r1 = r0.lvNext()
            if (r1 != 0) goto L1f
            goto L18
        L1f:
            java.lang.Object r0 = r1.getAndNullValue()
            r2.g(r1)
            return r0
        L27:
            r0 = 0
            return r0
    }
}
