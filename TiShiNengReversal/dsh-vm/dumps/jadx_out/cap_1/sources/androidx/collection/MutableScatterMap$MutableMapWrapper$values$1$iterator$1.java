package androidx.collection;

/* JADX INFO: Add missing generic type declarations: [V] */
/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class MutableScatterMap$MutableMapWrapper$values$1$iterator$1<V> implements java.util.Iterator<V>, l3.d {
    private int current;

    @org.jetbrains.annotations.NotNull
    private final java.util.Iterator<java.lang.Integer> iterator;
    final /* synthetic */ androidx.collection.MutableScatterMap<K, V> this$0;

    MutableScatterMap$MutableMapWrapper$values$1$iterator$1(androidx.collection.MutableScatterMap<K, V> r3) {
            r2 = this;
            r2.this$0 = r3
            r2.<init>()
            androidx.collection.MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1 r0 = new androidx.collection.MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1
            r1 = 0
            r0.<init>(r3, r1)
            java.util.Iterator r3 = kotlin.sequences.p.a(r0)
            r2.iterator = r3
            r3 = -1
            r2.current = r3
            return
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r1 = this;
            java.util.Iterator<java.lang.Integer> r0 = r1.iterator
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.Iterator
    public V next() {
            r2 = this;
            java.util.Iterator<java.lang.Integer> r0 = r2.iterator
            java.lang.Object r0 = r0.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r2.current = r0
            androidx.collection.MutableScatterMap<K, V> r1 = r2.this$0
            java.lang.Object[] r1 = r1.values
            r0 = r1[r0]
            return r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r2 = this;
            int r0 = r2.current
            if (r0 < 0) goto Lc
            androidx.collection.MutableScatterMap<K, V> r1 = r2.this$0
            r1.removeValueAt(r0)
            r0 = -1
            r2.current = r0
        Lc:
            return
    }
}
