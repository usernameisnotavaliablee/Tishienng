package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class ForwardingMap<K, V> extends com.google.common.collect.ForwardingObject implements java.util.Map<K, V> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.Beta
    protected abstract class StandardEntrySet extends com.google.common.collect.Maps.EntrySet<K, V> {
        final /* synthetic */ com.google.common.collect.ForwardingMap this$0;

        public StandardEntrySet(com.google.common.collect.ForwardingMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // com.google.common.collect.Maps.EntrySet
        java.util.Map<K, V> map() {
                r1 = this;
                com.google.common.collect.ForwardingMap r0 = r1.this$0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.Beta
    protected class StandardKeySet extends com.google.common.collect.Maps.KeySet<K, V> {
        final /* synthetic */ com.google.common.collect.ForwardingMap this$0;

        public StandardKeySet(com.google.common.collect.ForwardingMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.Beta
    protected class StandardValues extends com.google.common.collect.Maps.Values<K, V> {
        final /* synthetic */ com.google.common.collect.ForwardingMap this$0;

        public StandardValues(com.google.common.collect.ForwardingMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }
    }

    protected ForwardingMap() {
            r0 = this;
            r0.<init>()
            return
    }

    public void clear() {
            r1 = this;
            java.util.Map r0 = r1.delegate()
            r0.clear()
            return
    }

    @Override // java.util.Map
    public boolean containsKey(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.delegate()
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    public boolean containsValue(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.delegate()
            boolean r2 = r0.containsValue(r2)
            return r2
    }

    @Override // com.google.common.collect.ForwardingObject
    protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
            r1 = this;
            java.util.Map r0 = r1.delegate()
            return r0
    }

    @Override // com.google.common.collect.ForwardingObject
    protected abstract java.util.Map<K, V> delegate();

    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            java.util.Map r0 = r1.delegate()
            java.util.Set r0 = r0.entrySet()
            return r0
    }

    @Override // java.util.Map
    public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            if (r2 == r1) goto Lf
            java.util.Map r0 = r1.delegate()
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            return r2
        Lf:
            r2 = 1
            return r2
    }

    @Override // java.util.Map
    public V get(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.delegate()
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // java.util.Map
    public int hashCode() {
            r1 = this;
            java.util.Map r0 = r1.delegate()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.util.Map
    public boolean isEmpty() {
            r1 = this;
            java.util.Map r0 = r1.delegate()
            boolean r0 = r0.isEmpty()
            return r0
    }

    public java.util.Set<K> keySet() {
            r1 = this;
            java.util.Map r0 = r1.delegate()
            java.util.Set r0 = r0.keySet()
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public V put(K r2, V r3) {
            r1 = this;
            java.util.Map r0 = r1.delegate()
            java.lang.Object r2 = r0.put(r2, r3)
            return r2
    }

    public void putAll(java.util.Map<? extends K, ? extends V> r2) {
            r1 = this;
            java.util.Map r0 = r1.delegate()
            r0.putAll(r2)
            return
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public V remove(java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.delegate()
            java.lang.Object r2 = r0.remove(r2)
            return r2
    }

    @Override // java.util.Map
    public int size() {
            r1 = this;
            java.util.Map r0 = r1.delegate()
            int r0 = r0.size()
            return r0
    }

    protected void standardClear() {
            r1 = this;
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r0 = r0.iterator()
            com.google.common.collect.Iterators.clear(r0)
            return
    }

    @com.google.common.annotations.Beta
    protected boolean standardContainsKey(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
            r0 = this;
            boolean r1 = com.google.common.collect.Maps.containsKeyImpl(r0, r1)
            return r1
    }

    protected boolean standardContainsValue(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
            r0 = this;
            boolean r1 = com.google.common.collect.Maps.containsValueImpl(r0, r1)
            return r1
    }

    protected boolean standardEquals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
            r0 = this;
            boolean r1 = com.google.common.collect.Maps.equalsImpl(r0, r1)
            return r1
    }

    protected int standardHashCode() {
            r1 = this;
            java.util.Set r0 = r1.entrySet()
            int r0 = com.google.common.collect.Sets.hashCodeImpl(r0)
            return r0
    }

    protected boolean standardIsEmpty() {
            r1 = this;
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r0 = r0.iterator()
            boolean r0 = r0.hasNext()
            r0 = r0 ^ 1
            return r0
    }

    protected void standardPutAll(java.util.Map<? extends K, ? extends V> r1) {
            r0 = this;
            com.google.common.collect.Maps.putAllImpl(r0, r1)
            return
    }

    @com.google.common.annotations.Beta
    protected V standardRemove(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4) {
            r3 = this;
            java.util.Set r0 = r3.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            boolean r2 = com.google.common.base.Objects.equal(r2, r4)
            if (r2 == 0) goto L8
            java.lang.Object r4 = r1.getValue()
            r0.remove()
            return r4
        L26:
            r4 = 0
            return r4
    }

    protected java.lang.String standardToString() {
            r1 = this;
            java.lang.String r0 = com.google.common.collect.Maps.toStringImpl(r1)
            return r0
    }

    public java.util.Collection<V> values() {
            r1 = this;
            java.util.Map r0 = r1.delegate()
            java.util.Collection r0 = r0.values()
            return r0
    }
}
