package io.netty.channel;

import java.net.SocketAddress;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface AddressedEnvelope<M, A extends java.net.SocketAddress> extends io.netty.util.ReferenceCounted {
    M content();

    A recipient();

    /* renamed from: retain */
    io.netty.channel.AddressedEnvelope<M, A> mo179retain();

    /* renamed from: retain */
    io.netty.channel.AddressedEnvelope<M, A> mo180retain(int r1);

    A sender();

    /* renamed from: touch */
    io.netty.channel.AddressedEnvelope<M, A> mo181touch();

    /* renamed from: touch */
    io.netty.channel.AddressedEnvelope<M, A> mo182touch(java.lang.Object r1);
}
