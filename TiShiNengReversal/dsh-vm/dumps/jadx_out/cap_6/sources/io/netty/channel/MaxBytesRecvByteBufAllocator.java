package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface MaxBytesRecvByteBufAllocator extends io.netty.channel.RecvByteBufAllocator {
    int maxBytesPerIndividualRead();

    io.netty.channel.MaxBytesRecvByteBufAllocator maxBytesPerIndividualRead(int r1);

    int maxBytesPerRead();

    io.netty.channel.MaxBytesRecvByteBufAllocator maxBytesPerRead(int r1);

    io.netty.channel.MaxBytesRecvByteBufAllocator maxBytesPerReadPair(int r1, int r2);

    java.util.Map.Entry<java.lang.Integer, java.lang.Integer> maxBytesPerReadPair();
}
