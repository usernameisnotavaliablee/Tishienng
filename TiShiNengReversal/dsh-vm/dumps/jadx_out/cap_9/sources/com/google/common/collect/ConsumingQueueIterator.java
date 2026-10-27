package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class ConsumingQueueIterator<T> extends com.google.common.collect.AbstractIterator<T> {
    private final java.util.Queue<T> queue;

    ConsumingQueueIterator(java.util.Queue<T> r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.util.Queue r1 = (java.util.Queue) r1
            r0.queue = r1
            return
    }

    ConsumingQueueIterator(T... r3) {
            r2 = this;
            r2.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            int r1 = r3.length
            r0.<init>(r1)
            r2.queue = r0
            java.util.Collections.addAll(r0, r3)
            return
    }

    @Override // com.google.common.collect.AbstractIterator
    public T computeNext() {
            r1 = this;
            java.util.Queue<T> r0 = r1.queue
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            java.lang.Object r0 = r1.endOfData()
            return r0
        Ld:
            java.util.Queue<T> r0 = r1.queue
            java.lang.Object r0 = r0.remove()
            return r0
    }
}
