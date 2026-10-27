package rx.internal.util.unsafe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@rx.internal.util.SuppressAnimalSniffer
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
abstract class a<E> extends rx.internal.util.unsafe.b<E> {
    long I;
    long J;
    long K;
    long L;
    long M;
    long N;
    long O;
    long P;
    long Q;
    long R;
    long S;
    long T;
    long U;
    long V;
    long W;
    long X;

    a() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
            r2 = this;
            rx.internal.util.atomic.LinkedQueueNode r0 = r2.g()
            rx.internal.util.atomic.LinkedQueueNode r1 = r2.d()
            if (r0 != r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<E> iterator() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
            r4 = this;
            rx.internal.util.atomic.LinkedQueueNode r0 = r4.g()
            rx.internal.util.atomic.LinkedQueueNode r1 = r4.d()
            r2 = 0
        L9:
            if (r0 == r1) goto L1b
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 >= r3) goto L1b
        L10:
            rx.internal.util.atomic.LinkedQueueNode r3 = r0.lvNext()
            if (r3 != 0) goto L17
            goto L10
        L17:
            int r2 = r2 + 1
            r0 = r3
            goto L9
        L1b:
            return r2
    }
}
