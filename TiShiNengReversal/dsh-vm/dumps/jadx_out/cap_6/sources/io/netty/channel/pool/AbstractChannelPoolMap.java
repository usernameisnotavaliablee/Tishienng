package io.netty.channel.pool;

import io.netty.channel.pool.ChannelPool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class AbstractChannelPoolMap<K, P extends io.netty.channel.pool.ChannelPool> implements io.netty.channel.pool.ChannelPoolMap<K, P>, java.lang.Iterable<java.util.Map.Entry<K, P>>, java.io.Closeable {
    private final java.util.concurrent.ConcurrentMap<K, P> map;

    public AbstractChannelPoolMap() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentMap r0 = io.netty.util.internal.PlatformDependent.newConcurrentHashMap()
            r1.map = r0
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r2 = this;
            java.util.concurrent.ConcurrentMap<K, P extends io.netty.channel.pool.ChannelPool> r0 = r2.map
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            r2.remove(r1)
            goto La
        L18:
            return
    }

    @Override // io.netty.channel.pool.ChannelPoolMap
    public final boolean contains(K r3) {
            r2 = this;
            java.util.concurrent.ConcurrentMap<K, P extends io.netty.channel.pool.ChannelPool> r0 = r2.map
            java.lang.String r1 = "key"
            java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r1)
            boolean r3 = r0.containsKey(r3)
            return r3
    }

    @Override // io.netty.channel.pool.ChannelPoolMap
    public final P get(K r3) {
            r2 = this;
            java.util.concurrent.ConcurrentMap<K, P extends io.netty.channel.pool.ChannelPool> r0 = r2.map
            java.lang.String r1 = "key"
            java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r1)
            java.lang.Object r0 = r0.get(r1)
            io.netty.channel.pool.ChannelPool r0 = (io.netty.channel.pool.ChannelPool) r0
            if (r0 != 0) goto L22
            io.netty.channel.pool.ChannelPool r0 = r2.newPool(r3)
            java.util.concurrent.ConcurrentMap<K, P extends io.netty.channel.pool.ChannelPool> r1 = r2.map
            java.lang.Object r3 = r1.putIfAbsent(r3, r0)
            io.netty.channel.pool.ChannelPool r3 = (io.netty.channel.pool.ChannelPool) r3
            if (r3 == 0) goto L22
            r0.close()
            return r3
        L22:
            return r0
    }

    public final boolean isEmpty() {
            r1 = this;
            java.util.concurrent.ConcurrentMap<K, P extends io.netty.channel.pool.ChannelPool> r0 = r1.map
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<java.util.Map.Entry<K, P>> iterator() {
            r2 = this;
            io.netty.util.internal.ReadOnlyIterator r0 = new io.netty.util.internal.ReadOnlyIterator
            java.util.concurrent.ConcurrentMap<K, P extends io.netty.channel.pool.ChannelPool> r1 = r2.map
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r0.<init>(r1)
            return r0
    }

    protected abstract P newPool(K r1);

    public final boolean remove(K r3) {
            r2 = this;
            java.util.concurrent.ConcurrentMap<K, P extends io.netty.channel.pool.ChannelPool> r0 = r2.map
            java.lang.String r1 = "key"
            java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r1)
            java.lang.Object r3 = r0.remove(r3)
            io.netty.channel.pool.ChannelPool r3 = (io.netty.channel.pool.ChannelPool) r3
            if (r3 == 0) goto L15
            r3.close()
            r3 = 1
            return r3
        L15:
            r3 = 0
            return r3
    }

    public final int size() {
            r1 = this;
            java.util.concurrent.ConcurrentMap<K, P extends io.netty.channel.pool.ChannelPool> r0 = r1.map
            int r0 = r0.size()
            return r0
    }
}
