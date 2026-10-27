package io.netty.resolver.dns;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface DnsCnameCache {
    void cache(java.lang.String r1, java.lang.String r2, long r3, io.netty.channel.EventLoop r5);

    void clear();

    boolean clear(java.lang.String r1);

    java.lang.String get(java.lang.String r1);
}
