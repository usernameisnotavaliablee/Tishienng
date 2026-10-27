package com.tsn.chat.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class c {
    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.Object a(com.tsn.chat.model.RequestMessage r1) {
            io.netty.channel.group.ChannelGroup r0 = com.tsn.chat.utils.b.a
            r0.writeAndFlush(r1)
            java.lang.String r1 = "response time out!"
            return r1
    }
}
