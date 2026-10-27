package io.netty.handler.ipfilter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@io.netty.channel.ChannelHandler.Sharable
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class RuleBasedIpFilter extends io.netty.handler.ipfilter.AbstractRemoteAddressFilter<java.net.InetSocketAddress> {
    private final io.netty.handler.ipfilter.IpFilterRule[] rules;

    public RuleBasedIpFilter(io.netty.handler.ipfilter.IpFilterRule... r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.rules = r2
            return
        L8:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "rules"
            r2.<init>(r0)
            throw r2
    }

    /* renamed from: accept, reason: avoid collision after fix types in other method */
    protected boolean accept2(io.netty.channel.ChannelHandlerContext r7, java.net.InetSocketAddress r8) throws java.lang.Exception {
            r6 = this;
            io.netty.handler.ipfilter.IpFilterRule[] r7 = r6.rules
            int r0 = r7.length
            r1 = 0
            r2 = 0
        L5:
            r3 = 1
            if (r2 >= r0) goto L20
            r4 = r7[r2]
            if (r4 != 0) goto Ld
            goto L20
        Ld:
            boolean r5 = r4.matches(r8)
            if (r5 == 0) goto L1d
            io.netty.handler.ipfilter.IpFilterRuleType r7 = r4.ruleType()
            io.netty.handler.ipfilter.IpFilterRuleType r8 = io.netty.handler.ipfilter.IpFilterRuleType.ACCEPT
            if (r7 != r8) goto L1c
            return r3
        L1c:
            return r1
        L1d:
            int r2 = r2 + 1
            goto L5
        L20:
            return r3
    }

    @Override // io.netty.handler.ipfilter.AbstractRemoteAddressFilter
    protected /* bridge */ /* synthetic */ boolean accept(io.netty.channel.ChannelHandlerContext r1, java.net.InetSocketAddress r2) throws java.lang.Exception {
            r0 = this;
            java.net.InetSocketAddress r2 = (java.net.InetSocketAddress) r2
            boolean r1 = r0.accept2(r1, r2)
            return r1
    }
}
