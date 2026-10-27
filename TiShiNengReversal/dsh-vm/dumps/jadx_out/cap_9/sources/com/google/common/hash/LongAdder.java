package com.google.common.hash;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class LongAdder extends com.google.common.hash.Striped64 implements java.io.Serializable, com.google.common.hash.LongAddable {
    private static final long serialVersionUID = 7249069246863182397L;

    public LongAdder() {
            r0 = this;
            r0.<init>()
            return
    }

    private void readObject(java.io.ObjectInputStream r3) throws java.io.IOException, java.lang.ClassNotFoundException {
            r2 = this;
            r3.defaultReadObject()
            r0 = 0
            r2.busy = r0
            r0 = 0
            r2.cells = r0
            long r0 = r3.readLong()
            r2.base = r0
            return
    }

    private void writeObject(java.io.ObjectOutputStream r3) throws java.io.IOException {
            r2 = this;
            r3.defaultWriteObject()
            long r0 = r2.sum()
            r3.writeLong(r0)
            return
    }

    @Override // com.google.common.hash.LongAddable
    public void add(long r7) {
            r6 = this;
            com.google.common.hash.Striped64$Cell[] r0 = r6.cells
            if (r0 != 0) goto Le
            long r1 = r6.base
            long r3 = r1 + r7
            boolean r1 = r6.casBase(r1, r3)
            if (r1 != 0) goto L32
        Le:
            java.lang.ThreadLocal<int[]> r1 = com.google.common.hash.Striped64.threadHashCode
            java.lang.Object r1 = r1.get()
            int[] r1 = (int[]) r1
            r2 = 1
            if (r1 == 0) goto L33
            if (r0 == 0) goto L33
            int r3 = r0.length
            if (r3 < r2) goto L33
            int r3 = r3 - r2
            r4 = 0
            r4 = r1[r4]
            r3 = r3 & r4
            r0 = r0[r3]
            if (r0 == 0) goto L33
            long r2 = r0.value
            long r4 = r2 + r7
            boolean r2 = r0.cas(r2, r4)
            if (r2 != 0) goto L32
            goto L33
        L32:
            return
        L33:
            r6.retryUpdate(r7, r1, r2)
            return
    }

    public void decrement() {
            r2 = this;
            r0 = -1
            r2.add(r0)
            return
    }

    @Override // java.lang.Number
    public double doubleValue() {
            r2 = this;
            long r0 = r2.sum()
            double r0 = (double) r0
            return r0
    }

    @Override // java.lang.Number
    public float floatValue() {
            r2 = this;
            long r0 = r2.sum()
            float r0 = (float) r0
            return r0
    }

    @Override // com.google.common.hash.Striped64
    final long fn(long r1, long r3) {
            r0 = this;
            long r1 = r1 + r3
            return r1
    }

    @Override // com.google.common.hash.LongAddable
    public void increment() {
            r2 = this;
            r0 = 1
            r2.add(r0)
            return
    }

    @Override // java.lang.Number
    public int intValue() {
            r2 = this;
            long r0 = r2.sum()
            int r1 = (int) r0
            return r1
    }

    @Override // java.lang.Number
    public long longValue() {
            r2 = this;
            long r0 = r2.sum()
            return r0
    }

    public void reset() {
            r2 = this;
            r0 = 0
            r2.internalReset(r0)
            return
    }

    @Override // com.google.common.hash.LongAddable
    public long sum() {
            r7 = this;
            long r0 = r7.base
            com.google.common.hash.Striped64$Cell[] r2 = r7.cells
            if (r2 == 0) goto L14
            int r3 = r2.length
            r4 = 0
        L8:
            if (r4 >= r3) goto L14
            r5 = r2[r4]
            if (r5 == 0) goto L11
            long r5 = r5.value
            long r0 = r0 + r5
        L11:
            int r4 = r4 + 1
            goto L8
        L14:
            return r0
    }

    public long sumThenReset() {
            r10 = this;
            long r0 = r10.base
            com.google.common.hash.Striped64$Cell[] r2 = r10.cells
            r3 = 0
            r10.base = r3
            if (r2 == 0) goto L1a
            int r5 = r2.length
            r6 = 0
        Lc:
            if (r6 >= r5) goto L1a
            r7 = r2[r6]
            if (r7 == 0) goto L17
            long r8 = r7.value
            long r0 = r0 + r8
            r7.value = r3
        L17:
            int r6 = r6 + 1
            goto Lc
        L1a:
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            long r0 = r2.sum()
            java.lang.String r0 = java.lang.Long.toString(r0)
            return r0
    }
}
