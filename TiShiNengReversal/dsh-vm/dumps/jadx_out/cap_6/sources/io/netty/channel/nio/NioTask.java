package io.netty.channel.nio;

import java.nio.channels.SelectableChannel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface NioTask<C extends java.nio.channels.SelectableChannel> {
    void channelReady(C r1, java.nio.channels.SelectionKey r2) throws java.lang.Exception;

    void channelUnregistered(C r1, java.lang.Throwable r2) throws java.lang.Exception;
}
