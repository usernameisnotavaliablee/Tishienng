package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class AtomicLongMap<K> implements java.io.Serializable {

    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    private transient java.util.Map<K, java.lang.Long> asMap;
    private final java.util.concurrent.ConcurrentHashMap<K, java.util.concurrent.atomic.AtomicLong> map;


    private AtomicLongMap(java.util.concurrent.ConcurrentHashMap<K, java.util.concurrent.atomic.AtomicLong> r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            r0.map = r1
            return
    }

    public static <K> com.google.common.util.concurrent.AtomicLongMap<K> create() {
            com.google.common.util.concurrent.AtomicLongMap r0 = new com.google.common.util.concurrent.AtomicLongMap
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.<init>(r1)
            return r0
    }

    public static <K> com.google.common.util.concurrent.AtomicLongMap<K> create(java.util.Map<? extends K, ? extends java.lang.Long> r1) {
            com.google.common.util.concurrent.AtomicLongMap r0 = create()
            r0.putAll(r1)
            return r0
    }

    private java.util.Map<K, java.lang.Long> createAsMap() {
            r2 = this;
            java.util.concurrent.ConcurrentHashMap<K, java.util.concurrent.atomic.AtomicLong> r0 = r2.map
            com.google.common.util.concurrent.AtomicLongMap$1 r1 = new com.google.common.util.concurrent.AtomicLongMap$1
            r1.<init>(r2)
            java.util.Map r0 = com.google.common.collect.Maps.transformValues(r0, r1)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public long addAndGet(K r7, long r8) {
            r6 = this;
        L0:
            java.util.concurrent.ConcurrentHashMap<K, java.util.concurrent.atomic.AtomicLong> r0 = r6.map
            java.lang.Object r0 = r0.get(r7)
            java.util.concurrent.atomic.AtomicLong r0 = (java.util.concurrent.atomic.AtomicLong) r0
            if (r0 != 0) goto L1a
            java.util.concurrent.ConcurrentHashMap<K, java.util.concurrent.atomic.AtomicLong> r0 = r6.map
            java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
            r1.<init>(r8)
            java.lang.Object r0 = r0.putIfAbsent(r7, r1)
            java.util.concurrent.atomic.AtomicLong r0 = (java.util.concurrent.atomic.AtomicLong) r0
            if (r0 != 0) goto L1a
            goto L31
        L1a:
            long r1 = r0.get()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L32
            java.util.concurrent.ConcurrentHashMap<K, java.util.concurrent.atomic.AtomicLong> r1 = r6.map
            java.util.concurrent.atomic.AtomicLong r2 = new java.util.concurrent.atomic.AtomicLong
            r2.<init>(r8)
            boolean r0 = r1.replace(r7, r0, r2)
            if (r0 == 0) goto L0
        L31:
            return r8
        L32:
            long r3 = r1 + r8
            boolean r1 = r0.compareAndSet(r1, r3)
            if (r1 == 0) goto L1a
            return r3
    }

    public java.util.Map<K, java.lang.Long> asMap() {
            r1 = this;
            java.util.Map<K, java.lang.Long> r0 = r1.asMap
            if (r0 != 0) goto La
            java.util.Map r0 = r1.createAsMap()
            r1.asMap = r0
        La:
            return r0
    }

    public void clear() {
            r1 = this;
            java.util.concurrent.ConcurrentHashMap<K, java.util.concurrent.atomic.AtomicLong> r0 = r1.map
            r0.clear()
            return
    }

    public boolean containsKey(java.lang.Object r2) {
            r1 = this;
            java.util.concurrent.ConcurrentHashMap<K, java.util.concurrent.atomic.AtomicLong> r0 = r1.map
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public long decrementAndGet(K r3) {
            r2 = this;
            r0 = -1
            long r0 = r2.addAndGet(r3, r0)
            return r0
    }

    public long get(K r3) {
            r2 = this;
            java.util.concurrent.ConcurrentHashMap<K, java.util.concurrent.atomic.AtomicLong> r0 = r2.map
            java.lang.Object r3 = r0.get(r3)
            java.util.concurrent.atomic.AtomicLong r3 = (java.util.concurrent.atomic.AtomicLong) r3
            if (r3 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            long r0 = r3.get()
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public long getAndAdd(K r8, long r9) {
            r7 = this;
        L0:
            java.util.concurrent.ConcurrentHashMap<K, java.util.concurrent.atomic.AtomicLong> r0 = r7.map
            java.lang.Object r0 = r0.get(r8)
            java.util.concurrent.atomic.AtomicLong r0 = (java.util.concurrent.atomic.AtomicLong) r0
            r1 = 0
            if (r0 != 0) goto L1c
            java.util.concurrent.ConcurrentHashMap<K, java.util.concurrent.atomic.AtomicLong> r0 = r7.map
            java.util.concurrent.atomic.AtomicLong r3 = new java.util.concurrent.atomic.AtomicLong
            r3.<init>(r9)
            java.lang.Object r0 = r0.putIfAbsent(r8, r3)
            java.util.concurrent.atomic.AtomicLong r0 = (java.util.concurrent.atomic.AtomicLong) r0
            if (r0 != 0) goto L1c
            return r1
        L1c:
            long r3 = r0.get()
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto L32
            java.util.concurrent.ConcurrentHashMap<K, java.util.concurrent.atomic.AtomicLong> r3 = r7.map
            java.util.concurrent.atomic.AtomicLong r4 = new java.util.concurrent.atomic.AtomicLong
            r4.<init>(r9)
            boolean r0 = r3.replace(r8, r0, r4)
            if (r0 == 0) goto L0
            return r1
        L32:
            long r5 = r3 + r9
            boolean r5 = r0.compareAndSet(r3, r5)
            if (r5 == 0) goto L1c
            return r3
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public long getAndDecrement(K r3) {
            r2 = this;
            r0 = -1
            long r0 = r2.getAndAdd(r3, r0)
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public long getAndIncrement(K r3) {
            r2 = this;
            r0 = 1
            long r0 = r2.getAndAdd(r3, r0)
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public long incrementAndGet(K r3) {
            r2 = this;
            r0 = 1
            long r0 = r2.addAndGet(r3, r0)
            return r0
    }

    public boolean isEmpty() {
            r1 = this;
            java.util.concurrent.ConcurrentHashMap<K, java.util.concurrent.atomic.AtomicLong> r0 = r1.map
            boolean r0 = r0.isEmpty()
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public long put(K r7, long r8) {
            r6 = this;
        L0:
            java.util.concurrent.ConcurrentHashMap<K, java.util.concurrent.atomic.AtomicLong> r0 = r6.map
            java.lang.Object r0 = r0.get(r7)
            java.util.concurrent.atomic.AtomicLong r0 = (java.util.concurrent.atomic.AtomicLong) r0
            r1 = 0
            if (r0 != 0) goto L1c
            java.util.concurrent.ConcurrentHashMap<K, java.util.concurrent.atomic.AtomicLong> r0 = r6.map
            java.util.concurrent.atomic.AtomicLong r3 = new java.util.concurrent.atomic.AtomicLong
            r3.<init>(r8)
            java.lang.Object r0 = r0.putIfAbsent(r7, r3)
            java.util.concurrent.atomic.AtomicLong r0 = (java.util.concurrent.atomic.AtomicLong) r0
            if (r0 != 0) goto L1c
            return r1
        L1c:
            long r3 = r0.get()
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto L32
            java.util.concurrent.ConcurrentHashMap<K, java.util.concurrent.atomic.AtomicLong> r3 = r6.map
            java.util.concurrent.atomic.AtomicLong r4 = new java.util.concurrent.atomic.AtomicLong
            r4.<init>(r8)
            boolean r0 = r3.replace(r7, r0, r4)
            if (r0 == 0) goto L0
            return r1
        L32:
            boolean r5 = r0.compareAndSet(r3, r8)
            if (r5 == 0) goto L1c
            return r3
    }

    public void putAll(java.util.Map<? extends K, ? extends java.lang.Long> r5) {
            r4 = this;
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L8:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            r4.put(r1, r2)
            goto L8
        L26:
            return
    }

    long putIfAbsent(K r7, long r8) {
            r6 = this;
        L0:
            java.util.concurrent.ConcurrentHashMap<K, java.util.concurrent.atomic.AtomicLong> r0 = r6.map
            java.lang.Object r0 = r0.get(r7)
            java.util.concurrent.atomic.AtomicLong r0 = (java.util.concurrent.atomic.AtomicLong) r0
            r1 = 0
            if (r0 != 0) goto L1c
            java.util.concurrent.ConcurrentHashMap<K, java.util.concurrent.atomic.AtomicLong> r0 = r6.map
            java.util.concurrent.atomic.AtomicLong r3 = new java.util.concurrent.atomic.AtomicLong
            r3.<init>(r8)
            java.lang.Object r0 = r0.putIfAbsent(r7, r3)
            java.util.concurrent.atomic.AtomicLong r0 = (java.util.concurrent.atomic.AtomicLong) r0
            if (r0 != 0) goto L1c
            return r1
        L1c:
            long r3 = r0.get()
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto L32
            java.util.concurrent.ConcurrentHashMap<K, java.util.concurrent.atomic.AtomicLong> r3 = r6.map
            java.util.concurrent.atomic.AtomicLong r4 = new java.util.concurrent.atomic.AtomicLong
            r4.<init>(r8)
            boolean r0 = r3.replace(r7, r0, r4)
            if (r0 == 0) goto L0
            return r1
        L32:
            return r3
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public long remove(K r7) {
            r6 = this;
            java.util.concurrent.ConcurrentHashMap<K, java.util.concurrent.atomic.AtomicLong> r0 = r6.map
            java.lang.Object r0 = r0.get(r7)
            java.util.concurrent.atomic.AtomicLong r0 = (java.util.concurrent.atomic.AtomicLong) r0
            r1 = 0
            if (r0 != 0) goto Ld
            return r1
        Ld:
            long r3 = r0.get()
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 == 0) goto L1b
            boolean r5 = r0.compareAndSet(r3, r1)
            if (r5 == 0) goto Ld
        L1b:
            java.util.concurrent.ConcurrentHashMap<K, java.util.concurrent.atomic.AtomicLong> r1 = r6.map
            r1.remove(r7, r0)
            return r3
    }

    boolean remove(K r6, long r7) {
            r5 = this;
            java.util.concurrent.ConcurrentHashMap<K, java.util.concurrent.atomic.AtomicLong> r0 = r5.map
            java.lang.Object r0 = r0.get(r6)
            java.util.concurrent.atomic.AtomicLong r0 = (java.util.concurrent.atomic.AtomicLong) r0
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            long r2 = r0.get()
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 == 0) goto L15
            return r1
        L15:
            r7 = 0
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 == 0) goto L23
            boolean r7 = r0.compareAndSet(r2, r7)
            if (r7 == 0) goto L22
            goto L23
        L22:
            return r1
        L23:
            java.util.concurrent.ConcurrentHashMap<K, java.util.concurrent.atomic.AtomicLong> r7 = r5.map
            r7.remove(r6, r0)
            r6 = 1
            return r6
    }

    public void removeAllZeros() {
            r6 = this;
            java.util.concurrent.ConcurrentHashMap<K, java.util.concurrent.atomic.AtomicLong> r0 = r6.map
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            java.util.concurrent.atomic.AtomicLong r1 = (java.util.concurrent.atomic.AtomicLong) r1
            if (r1 == 0) goto La
            long r1 = r1.get()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto La
            r0.remove()
            goto La
        L2c:
            return
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.common.annotations.Beta
    public boolean removeIfZero(K r3) {
            r2 = this;
            r0 = 0
            boolean r3 = r2.remove(r3, r0)
            return r3
    }

    boolean replace(K r5, long r6, long r8) {
            r4 = this;
            r0 = 0
            r1 = 0
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 != 0) goto L12
            long r5 = r4.putIfAbsent(r5, r8)
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 != 0) goto L11
            r5 = 1
            return r5
        L11:
            return r0
        L12:
            java.util.concurrent.ConcurrentHashMap<K, java.util.concurrent.atomic.AtomicLong> r1 = r4.map
            java.lang.Object r5 = r1.get(r5)
            java.util.concurrent.atomic.AtomicLong r5 = (java.util.concurrent.atomic.AtomicLong) r5
            if (r5 != 0) goto L1d
            return r0
        L1d:
            boolean r5 = r5.compareAndSet(r6, r8)
            return r5
    }

    public int size() {
            r1 = this;
            java.util.concurrent.ConcurrentHashMap<K, java.util.concurrent.atomic.AtomicLong> r0 = r1.map
            int r0 = r0.size()
            return r0
    }

    public long sum() {
            r5 = this;
            java.util.concurrent.ConcurrentHashMap<K, java.util.concurrent.atomic.AtomicLong> r0 = r5.map
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        Lc:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L1e
            java.lang.Object r3 = r0.next()
            java.util.concurrent.atomic.AtomicLong r3 = (java.util.concurrent.atomic.AtomicLong) r3
            long r3 = r3.get()
            long r1 = r1 + r3
            goto Lc
        L1e:
            return r1
    }

    public java.lang.String toString() {
            r1 = this;
            java.util.concurrent.ConcurrentHashMap<K, java.util.concurrent.atomic.AtomicLong> r0 = r1.map
            java.lang.String r0 = r0.toString()
            return r0
    }
}
