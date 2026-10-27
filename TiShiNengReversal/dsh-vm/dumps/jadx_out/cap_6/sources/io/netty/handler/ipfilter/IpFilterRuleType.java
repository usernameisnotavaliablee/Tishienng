package io.netty.handler.ipfilter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum IpFilterRuleType extends java.lang.Enum<io.netty.handler.ipfilter.IpFilterRuleType> {
    private static final /* synthetic */ io.netty.handler.ipfilter.IpFilterRuleType[] $VALUES = null;
    public static final io.netty.handler.ipfilter.IpFilterRuleType ACCEPT = null;
    public static final io.netty.handler.ipfilter.IpFilterRuleType REJECT = null;

    static {
            io.netty.handler.ipfilter.IpFilterRuleType r0 = new io.netty.handler.ipfilter.IpFilterRuleType
            java.lang.String r1 = "ACCEPT"
            r2 = 0
            r0.<init>(r1, r2)
            io.netty.handler.ipfilter.IpFilterRuleType.ACCEPT = r0
            io.netty.handler.ipfilter.IpFilterRuleType r1 = new io.netty.handler.ipfilter.IpFilterRuleType
            java.lang.String r3 = "REJECT"
            r4 = 1
            r1.<init>(r3, r4)
            io.netty.handler.ipfilter.IpFilterRuleType.REJECT = r1
            r3 = 2
            io.netty.handler.ipfilter.IpFilterRuleType[] r3 = new io.netty.handler.ipfilter.IpFilterRuleType[r3]
            r3[r2] = r0
            r3[r4] = r1
            io.netty.handler.ipfilter.IpFilterRuleType.$VALUES = r3
            return
    }

    IpFilterRuleType(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static io.netty.handler.ipfilter.IpFilterRuleType valueOf(java.lang.String r1) {
            java.lang.Class<io.netty.handler.ipfilter.IpFilterRuleType> r0 = io.netty.handler.ipfilter.IpFilterRuleType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.netty.handler.ipfilter.IpFilterRuleType r1 = (io.netty.handler.ipfilter.IpFilterRuleType) r1
            return r1
    }

    public static io.netty.handler.ipfilter.IpFilterRuleType[] values() {
            io.netty.handler.ipfilter.IpFilterRuleType[] r0 = io.netty.handler.ipfilter.IpFilterRuleType.$VALUES
            java.lang.Object r0 = r0.clone()
            io.netty.handler.ipfilter.IpFilterRuleType[] r0 = (io.netty.handler.ipfilter.IpFilterRuleType[]) r0
            return r0
    }
}
