package io.netty.util.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ConcurrentSet<E> extends java.util.AbstractSet<E> implements java.io.Serializable {
    private static final long serialVersionUID = -6761513279741915432L;
    private final java.util.concurrent.ConcurrentMap<E, java.lang.Boolean> map;

    public ConcurrentSet() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentMap r0 = io.netty.util.internal.PlatformDependent.newConcurrentHashMap()
            r1.map = r0
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E r3) {
            r2 = this;
            java.util.concurrent.ConcurrentMap<E, java.lang.Boolean> r0 = r2.map
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Object r3 = r0.putIfAbsent(r3, r1)
            if (r3 != 0) goto Lc
            r3 = 1
            return r3
        Lc:
            r3 = 0
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
            r1 = this;
            java.util.concurrent.ConcurrentMap<E, java.lang.Boolean> r0 = r1.map
            r0.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object r2) {
            r1 = this;
            java.util.concurrent.ConcurrentMap<E, java.lang.Boolean> r0 = r1.map
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator<E> iterator() {
            r1 = this;
            java.util.concurrent.ConcurrentMap<E, java.lang.Boolean> r0 = r1.map
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object r2) {
            r1 = this;
            java.util.concurrent.ConcurrentMap<E, java.lang.Boolean> r0 = r1.map
            java.lang.Object r2 = r0.remove(r2)
            if (r2 == 0) goto La
            r2 = 1
            return r2
        La:
            r2 = 0
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
            r1 = this;
            java.util.concurrent.ConcurrentMap<E, java.lang.Boolean> r0 = r1.map
            int r0 = r0.size()
            return r0
    }
}
