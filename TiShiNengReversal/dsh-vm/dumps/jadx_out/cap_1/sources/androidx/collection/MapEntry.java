package androidx.collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class MapEntry<K, V> implements java.util.Map.Entry<K, V>, l3.a {
    private final K key;
    private final V value;

    public MapEntry(K r1, V r2) {
            r0 = this;
            r0.<init>()
            r0.key = r1
            r0.value = r2
            return
    }

    @Override // java.util.Map.Entry
    public K getKey() {
            r1 = this;
            K r0 = r1.key
            return r0
    }

    @Override // java.util.Map.Entry
    public V getValue() {
            r1 = this;
            V r0 = r1.value
            return r0
    }

    @Override // java.util.Map.Entry
    public V setValue(V r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }
}
