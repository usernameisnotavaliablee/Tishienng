package io.netty.channel.pool;

import io.netty.channel.pool.ChannelPool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface ChannelPoolMap<K, P extends io.netty.channel.pool.ChannelPool> {
    boolean contains(K r1);

    P get(K r1);
}
