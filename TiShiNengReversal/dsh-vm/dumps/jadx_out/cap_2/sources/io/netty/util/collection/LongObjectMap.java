package io.netty.util.collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface LongObjectMap<V> extends java.util.Map<java.lang.Long, V> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface PrimitiveEntry<V> {
        long key();

        void setValue(V r1);

        V value();
    }

    boolean containsKey(long r1);

    java.lang.Iterable<io.netty.util.collection.LongObjectMap.PrimitiveEntry<V>> entries();

    V get(long r1);

    V put(long r1, V r3);

    V remove(long r1);
}
