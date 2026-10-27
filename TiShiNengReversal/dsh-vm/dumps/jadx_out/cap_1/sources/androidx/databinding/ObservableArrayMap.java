package androidx.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ObservableArrayMap<K, V> extends androidx.collection.ArrayMap<K, V> implements androidx.databinding.ObservableMap<K, V> {
    private transient androidx.databinding.MapChangeRegistry mListeners;

    public ObservableArrayMap() {
            r0 = this;
            r0.<init>()
            return
    }

    private void notifyChange(java.lang.Object r3) {
            r2 = this;
            androidx.databinding.MapChangeRegistry r0 = r2.mListeners
            if (r0 == 0) goto L8
            r1 = 0
            r0.notifyCallbacks(r2, r1, r3)
        L8:
            return
    }

    @Override // androidx.databinding.ObservableMap
    public void addOnMapChangedCallback(androidx.databinding.ObservableMap.OnMapChangedCallback<? extends androidx.databinding.ObservableMap<K, V>, K, V> r2) {
            r1 = this;
            androidx.databinding.MapChangeRegistry r0 = r1.mListeners
            if (r0 != 0) goto Lb
            androidx.databinding.MapChangeRegistry r0 = new androidx.databinding.MapChangeRegistry
            r0.<init>()
            r1.mListeners = r0
        Lb:
            androidx.databinding.MapChangeRegistry r0 = r1.mListeners
            r0.add(r2)
            return
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public void clear() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Ld
            super.clear()
            r0 = 0
            r1.notifyChange(r0)
        Ld:
            return
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public V put(K r1, V r2) {
            r0 = this;
            super.put(r1, r2)
            r0.notifyChange(r1)
            return r2
    }

    @Override // androidx.collection.ArrayMap
    public boolean removeAll(java.util.Collection<?> r3) {
            r2 = this;
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L5:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r3.next()
            int r1 = r2.indexOfKey(r1)
            if (r1 < 0) goto L5
            r2.removeAt(r1)
            r0 = 1
            goto L5
        L1a:
            return r0
    }

    @Override // androidx.collection.SimpleArrayMap
    public V removeAt(int r2) {
            r1 = this;
            java.lang.Object r0 = r1.keyAt(r2)
            java.lang.Object r2 = super.removeAt(r2)
            if (r2 == 0) goto Ld
            r1.notifyChange(r0)
        Ld:
            return r2
    }

    @Override // androidx.databinding.ObservableMap
    public void removeOnMapChangedCallback(androidx.databinding.ObservableMap.OnMapChangedCallback<? extends androidx.databinding.ObservableMap<K, V>, K, V> r2) {
            r1 = this;
            androidx.databinding.MapChangeRegistry r0 = r1.mListeners
            if (r0 == 0) goto L7
            r0.remove(r2)
        L7:
            return
    }

    @Override // androidx.collection.ArrayMap
    public boolean retainAll(java.util.Collection<?> r5) {
            r4 = this;
            int r0 = r4.size()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
        L7:
            if (r0 < 0) goto L1a
            java.lang.Object r3 = r4.keyAt(r0)
            boolean r3 = r5.contains(r3)
            if (r3 != 0) goto L17
            r4.removeAt(r0)
            r2 = 1
        L17:
            int r0 = r0 + (-1)
            goto L7
        L1a:
            return r2
    }

    @Override // androidx.collection.SimpleArrayMap
    public V setValueAt(int r2, V r3) {
            r1 = this;
            java.lang.Object r0 = r1.keyAt(r2)
            java.lang.Object r2 = super.setValueAt(r2, r3)
            r1.notifyChange(r0)
            return r2
    }
}
