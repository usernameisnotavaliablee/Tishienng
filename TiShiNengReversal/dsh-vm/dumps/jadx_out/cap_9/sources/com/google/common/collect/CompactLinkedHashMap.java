package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class CompactLinkedHashMap<K, V> extends com.google.common.collect.CompactHashMap<K, V> {
    private static final int ENDPOINT = -2;
    private final boolean accessOrder;
    private transient int firstEntry;
    private transient int lastEntry;

    @com.google.common.annotations.VisibleForTesting
    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    transient long[] links;

    CompactLinkedHashMap() {
            r1 = this;
            r0 = 3
            r1.<init>(r0)
            return
    }

    CompactLinkedHashMap(int r3) {
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            r2.<init>(r3, r0, r1)
            return
    }

    CompactLinkedHashMap(int r1, float r2, boolean r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.accessOrder = r3
            return
    }

    public static <K, V> com.google.common.collect.CompactLinkedHashMap<K, V> create() {
            com.google.common.collect.CompactLinkedHashMap r0 = new com.google.common.collect.CompactLinkedHashMap
            r0.<init>()
            return r0
    }

    public static <K, V> com.google.common.collect.CompactLinkedHashMap<K, V> createWithExpectedSize(int r1) {
            com.google.common.collect.CompactLinkedHashMap r0 = new com.google.common.collect.CompactLinkedHashMap
            r0.<init>(r1)
            return r0
    }

    private int getPredecessor(int r4) {
            r3 = this;
            long[] r0 = r3.links
            r1 = r0[r4]
            r4 = 32
            long r0 = r1 >>> r4
            int r4 = (int) r0
            return r4
    }

    private void setPredecessor(int r6, int r7) {
            r5 = this;
            long[] r0 = r5.links
            r1 = r0[r6]
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            long r3 = (long) r7
            r7 = 32
            long r3 = r3 << r7
            long r1 = r1 | r3
            r0[r6] = r1
            return
    }

    private void setSucceeds(int r2, int r3) {
            r1 = this;
            r0 = -2
            if (r2 != r0) goto L6
            r1.firstEntry = r3
            goto L9
        L6:
            r1.setSuccessor(r2, r3)
        L9:
            if (r3 != r0) goto Le
            r1.lastEntry = r2
            return
        Le:
            r1.setPredecessor(r3, r2)
            return
    }

    private void setSuccessor(int r8, int r9) {
            r7 = this;
            long[] r0 = r7.links
            r1 = r0[r8]
            r3 = -4294967296(0xffffffff00000000, double:NaN)
            long r1 = r1 & r3
            long r3 = (long) r9
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            long r1 = r1 | r3
            r0[r8] = r1
            return
    }

    @Override // com.google.common.collect.CompactHashMap
    void accessEntry(int r3) {
            r2 = this;
            boolean r0 = r2.accessOrder
            if (r0 == 0) goto L1e
            int r0 = r2.getPredecessor(r3)
            int r1 = r2.getSuccessor(r3)
            r2.setSucceeds(r0, r1)
            int r0 = r2.lastEntry
            r2.setSucceeds(r0, r3)
            r0 = -2
            r2.setSucceeds(r3, r0)
            int r3 = r2.modCount
            int r3 = r3 + 1
            r2.modCount = r3
        L1e:
            return
    }

    @Override // com.google.common.collect.CompactHashMap
    int adjustAfterRemove(int r2, int r3) {
            r1 = this;
            int r0 = r1.size()
            if (r2 < r0) goto L7
            return r3
        L7:
            return r2
    }

    @Override // com.google.common.collect.CompactHashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
            r1 = this;
            super.clear()
            r0 = -2
            r1.firstEntry = r0
            r1.lastEntry = r0
            return
    }

    @Override // com.google.common.collect.CompactHashMap
    int firstEntryIndex() {
            r1 = this;
            int r0 = r1.firstEntry
            return r0
    }

    @Override // com.google.common.collect.CompactHashMap
    int getSuccessor(int r4) {
            r3 = this;
            long[] r0 = r3.links
            r1 = r0[r4]
            int r4 = (int) r1
            return r4
    }

    @Override // com.google.common.collect.CompactHashMap
    void init(int r3, float r4) {
            r2 = this;
            super.init(r3, r4)
            r4 = -2
            r2.firstEntry = r4
            r2.lastEntry = r4
            long[] r3 = new long[r3]
            r2.links = r3
            r0 = -1
            java.util.Arrays.fill(r3, r0)
            return
    }

    @Override // com.google.common.collect.CompactHashMap
    void insertEntry(int r1, K r2, V r3, int r4) {
            r0 = this;
            super.insertEntry(r1, r2, r3, r4)
            int r2 = r0.lastEntry
            r0.setSucceeds(r2, r1)
            r2 = -2
            r0.setSucceeds(r1, r2)
            return
    }

    @Override // com.google.common.collect.CompactHashMap
    void moveLastEntry(int r4) {
            r3 = this;
            int r0 = r3.size()
            int r0 = r0 + (-1)
            int r1 = r3.getPredecessor(r4)
            int r2 = r3.getSuccessor(r4)
            r3.setSucceeds(r1, r2)
            if (r4 >= r0) goto L21
            int r1 = r3.getPredecessor(r0)
            r3.setSucceeds(r1, r4)
            int r0 = r3.getSuccessor(r0)
            r3.setSucceeds(r4, r0)
        L21:
            super.moveLastEntry(r4)
            return
    }

    @Override // com.google.common.collect.CompactHashMap
    void resizeEntries(int r2) {
            r1 = this;
            super.resizeEntries(r2)
            long[] r0 = r1.links
            long[] r2 = java.util.Arrays.copyOf(r0, r2)
            r1.links = r2
            return
    }
}
