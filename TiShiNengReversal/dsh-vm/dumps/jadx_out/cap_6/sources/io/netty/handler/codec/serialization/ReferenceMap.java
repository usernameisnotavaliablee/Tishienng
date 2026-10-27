package io.netty.handler.codec.serialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
abstract class ReferenceMap<K, V> implements java.util.Map<K, V> {
    private final java.util.Map<K, java.lang.ref.Reference<V>> delegate;

    protected ReferenceMap(java.util.Map<K, java.lang.ref.Reference<V>> r1) {
            r0 = this;
            r0.<init>()
            r0.delegate = r1
            return
    }

    private V unfold(java.lang.ref.Reference<V> r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            java.lang.Object r1 = r1.get()
            return r1
    }

    @Override // java.util.Map
    public void clear() {
            r1 = this;
            java.util.Map<K, java.lang.ref.Reference<V>> r0 = r1.delegate
            r0.clear()
            return
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object r2) {
            r1 = this;
            java.util.Map<K, java.lang.ref.Reference<V>> r0 = r1.delegate
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    abstract java.lang.ref.Reference<V> fold(V r1);

    @Override // java.util.Map
    public V get(java.lang.Object r2) {
            r1 = this;
            java.util.Map<K, java.lang.ref.Reference<V>> r0 = r1.delegate
            java.lang.Object r2 = r0.get(r2)
            java.lang.ref.Reference r2 = (java.lang.ref.Reference) r2
            java.lang.Object r2 = r1.unfold(r2)
            return r2
    }

    @Override // java.util.Map
    public boolean isEmpty() {
            r1 = this;
            java.util.Map<K, java.lang.ref.Reference<V>> r0 = r1.delegate
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.Map
    public java.util.Set<K> keySet() {
            r1 = this;
            java.util.Map<K, java.lang.ref.Reference<V>> r0 = r1.delegate
            java.util.Set r0 = r0.keySet()
            return r0
    }

    @Override // java.util.Map
    public V put(K r2, V r3) {
            r1 = this;
            java.util.Map<K, java.lang.ref.Reference<V>> r0 = r1.delegate
            java.lang.ref.Reference r3 = r1.fold(r3)
            java.lang.Object r2 = r0.put(r2, r3)
            java.lang.ref.Reference r2 = (java.lang.ref.Reference) r2
            java.lang.Object r2 = r1.unfold(r2)
            return r2
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> r4) {
            r3 = this;
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L8:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.util.Map<K, java.lang.ref.Reference<V>> r1 = r3.delegate
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.lang.ref.Reference r0 = r3.fold(r0)
            r1.put(r2, r0)
            goto L8
        L26:
            return
    }

    @Override // java.util.Map
    public V remove(java.lang.Object r2) {
            r1 = this;
            java.util.Map<K, java.lang.ref.Reference<V>> r0 = r1.delegate
            java.lang.Object r2 = r0.remove(r2)
            java.lang.ref.Reference r2 = (java.lang.ref.Reference) r2
            java.lang.Object r2 = r1.unfold(r2)
            return r2
    }

    @Override // java.util.Map
    public int size() {
            r1 = this;
            java.util.Map<K, java.lang.ref.Reference<V>> r0 = r1.delegate
            int r0 = r0.size()
            return r0
    }

    @Override // java.util.Map
    public java.util.Collection<V> values() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }
}
