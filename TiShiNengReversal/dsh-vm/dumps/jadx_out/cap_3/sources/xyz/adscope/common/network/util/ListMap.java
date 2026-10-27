package xyz.adscope.common.network.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class ListMap<K, V> {
    private java.util.Map<K, java.util.List<V>> a;

    public ListMap(java.util.Map<K, java.util.List<V>> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public void add(K r3, V r4) {
            r2 = this;
            java.util.Map<K, java.util.List<V>> r0 = r2.a     // Catch: java.lang.Throwable -> L1f
            boolean r0 = r0.containsKey(r3)     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L12
            java.util.Map<K, java.util.List<V>> r0 = r2.a     // Catch: java.lang.Throwable -> L1f
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1f
            r1.<init>()     // Catch: java.lang.Throwable -> L1f
            r0.put(r3, r1)     // Catch: java.lang.Throwable -> L1f
        L12:
            java.util.Map<K, java.util.List<V>> r0 = r2.a     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L1f
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L1f
            if (r3 == 0) goto L1f
            r3.add(r4)     // Catch: java.lang.Throwable -> L1f
        L1f:
            return
    }

    public void add(K r2, java.util.List<V> r3) {
            r1 = this;
            java.util.Iterator r3 = r3.iterator()
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L12
            java.lang.Object r0 = r3.next()
            r1.add(r2, r0)
            goto L4
        L12:
            return
    }

    public void clear() {
            r1 = this;
            java.util.Map<K, java.util.List<V>> r0 = r1.a
            r0.clear()
            return
    }

    public boolean containsKey(K r2) {
            r1 = this;
            java.util.Map<K, java.util.List<V>> r0 = r1.a
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    public java.util.Set<java.util.Map.Entry<K, java.util.List<V>>> entrySet() {
            r1 = this;
            java.util.Map<K, java.util.List<V>> r0 = r1.a
            java.util.Set r0 = r0.entrySet()
            return r0
    }

    public java.util.List<V> get(K r2) {
            r1 = this;
            java.util.Map<K, java.util.List<V>> r0 = r1.a
            java.lang.Object r2 = r0.get(r2)
            java.util.List r2 = (java.util.List) r2
            return r2
    }

    public V getFirst(K r2) {
            r1 = this;
            java.util.Map<K, java.util.List<V>> r0 = r1.a
            java.lang.Object r2 = r0.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L16
            int r0 = r2.size()
            if (r0 <= 0) goto L16
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            return r2
        L16:
            r2 = 0
            return r2
    }

    public boolean isEmpty() {
            r1 = this;
            java.util.Map<K, java.util.List<V>> r0 = r1.a
            boolean r0 = r0.isEmpty()
            return r0
    }

    public java.util.Set<K> keySet() {
            r1 = this;
            java.util.Map<K, java.util.List<V>> r0 = r1.a
            java.util.Set r0 = r0.keySet()
            return r0
    }

    public java.util.List<V> remove(K r2) {
            r1 = this;
            java.util.Map<K, java.util.List<V>> r0 = r1.a
            java.lang.Object r2 = r0.remove(r2)
            java.util.List r2 = (java.util.List) r2
            return r2
    }

    public void set(K r2, V r3) {
            r1 = this;
            java.util.Map<K, java.util.List<V>> r0 = r1.a
            r0.remove(r2)
            r1.add(r2, r3)
            return
    }

    public void set(K r2, java.util.List<V> r3) {
            r1 = this;
            java.util.Map<K, java.util.List<V>> r0 = r1.a
            r0.put(r2, r3)
            return
    }

    public int size() {
            r1 = this;
            java.util.Map<K, java.util.List<V>> r0 = r1.a
            int r0 = r0.size()
            return r0
    }

    public java.util.Map<K, java.util.List<V>> toMap() {
            r1 = this;
            java.util.Map<K, java.util.List<V>> r0 = r1.a
            return r0
    }
}
