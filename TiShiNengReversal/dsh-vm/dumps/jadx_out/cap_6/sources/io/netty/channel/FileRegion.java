package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface FileRegion extends io.netty.util.ReferenceCounted {
    long count();

    long position();

    io.netty.channel.FileRegion retain();

    io.netty.channel.FileRegion retain(int r1);

    io.netty.channel.FileRegion touch();

    io.netty.channel.FileRegion touch(java.lang.Object r1);

    long transferTo(java.nio.channels.WritableByteChannel r1, long r2) throws java.io.IOException;

    @java.lang.Deprecated
    long transfered();

    long transferred();
}
