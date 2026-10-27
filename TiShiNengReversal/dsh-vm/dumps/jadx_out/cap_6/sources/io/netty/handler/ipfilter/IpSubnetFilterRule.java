package io.netty.handler.ipfilter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class IpSubnetFilterRule implements io.netty.handler.ipfilter.IpFilterRule {
    private final io.netty.handler.ipfilter.IpFilterRule filterRule;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.ipfilter.IpSubnetFilterRule$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class Ip4SubnetFilterRule implements io.netty.handler.ipfilter.IpFilterRule {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final int networkAddress;
        private final io.netty.handler.ipfilter.IpFilterRuleType ruleType;
        private final int subnetMask;

        static {
                return
        }

        private Ip4SubnetFilterRule(java.net.Inet4Address r2, int r3, io.netty.handler.ipfilter.IpFilterRuleType r4) {
                r1 = this;
                r1.<init>()
                if (r3 < 0) goto L19
                r0 = 32
                if (r3 > r0) goto L19
                int r3 = prefixToSubnetMask(r3)
                r1.subnetMask = r3
                int r2 = ipToInt(r2)
                r2 = r2 & r3
                r1.networkAddress = r2
                r1.ruleType = r4
                return
            L19:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r4 = 1
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r0 = 0
                r4[r0] = r3
                java.lang.String r3 = "IPv4 requires the subnet prefix to be in range of [0,32]. The prefix was: %d"
                java.lang.String r3 = java.lang.String.format(r3, r4)
                r2.<init>(r3)
                throw r2
        }

        /* synthetic */ Ip4SubnetFilterRule(java.net.Inet4Address r1, int r2, io.netty.handler.ipfilter.IpFilterRuleType r3, io.netty.handler.ipfilter.IpSubnetFilterRule.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        private static int ipToInt(java.net.Inet4Address r2) {
                byte[] r2 = r2.getAddress()
                r0 = 0
                r0 = r2[r0]
                r0 = r0 & 255(0xff, float:3.57E-43)
                int r0 = r0 << 24
                r1 = 1
                r1 = r2[r1]
                r1 = r1 & 255(0xff, float:3.57E-43)
                int r1 = r1 << 16
                r0 = r0 | r1
                r1 = 2
                r1 = r2[r1]
                r1 = r1 & 255(0xff, float:3.57E-43)
                int r1 = r1 << 8
                r0 = r0 | r1
                r1 = 3
                r2 = r2[r1]
                r2 = r2 & 255(0xff, float:3.57E-43)
                r2 = r2 | r0
                return r2
        }

        private static int prefixToSubnetMask(int r2) {
                int r2 = 32 - r2
                r0 = -1
                long r0 = r0 << r2
                int r2 = (int) r0
                return r2
        }

        @Override // io.netty.handler.ipfilter.IpFilterRule
        public boolean matches(java.net.InetSocketAddress r3) {
                r2 = this;
                java.net.InetAddress r3 = r3.getAddress()
                boolean r0 = r3 instanceof java.net.Inet4Address
                r1 = 0
                if (r0 == 0) goto L18
                java.net.Inet4Address r3 = (java.net.Inet4Address) r3
                int r3 = ipToInt(r3)
                int r0 = r2.subnetMask
                r3 = r3 & r0
                int r0 = r2.networkAddress
                if (r3 != r0) goto L18
                r3 = 1
                return r3
            L18:
                return r1
        }

        @Override // io.netty.handler.ipfilter.IpFilterRule
        public io.netty.handler.ipfilter.IpFilterRuleType ruleType() {
                r1 = this;
                io.netty.handler.ipfilter.IpFilterRuleType r0 = r1.ruleType
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class Ip6SubnetFilterRule implements io.netty.handler.ipfilter.IpFilterRule {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private static final java.math.BigInteger MINUS_ONE = null;
        private final java.math.BigInteger networkAddress;
        private final io.netty.handler.ipfilter.IpFilterRuleType ruleType;
        private final java.math.BigInteger subnetMask;

        static {
                r0 = -1
                java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
                io.netty.handler.ipfilter.IpSubnetFilterRule.Ip6SubnetFilterRule.MINUS_ONE = r0
                return
        }

        private Ip6SubnetFilterRule(java.net.Inet6Address r2, int r3, io.netty.handler.ipfilter.IpFilterRuleType r4) {
                r1 = this;
                r1.<init>()
                if (r3 < 0) goto L1c
                r0 = 128(0x80, float:1.8E-43)
                if (r3 > r0) goto L1c
                java.math.BigInteger r3 = prefixToSubnetMask(r3)
                r1.subnetMask = r3
                java.math.BigInteger r2 = ipToInt(r2)
                java.math.BigInteger r2 = r2.and(r3)
                r1.networkAddress = r2
                r1.ruleType = r4
                return
            L1c:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r4 = 1
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r0 = 0
                r4[r0] = r3
                java.lang.String r3 = "IPv6 requires the subnet prefix to be in range of [0,128]. The prefix was: %d"
                java.lang.String r3 = java.lang.String.format(r3, r4)
                r2.<init>(r3)
                throw r2
        }

        /* synthetic */ Ip6SubnetFilterRule(java.net.Inet6Address r1, int r2, io.netty.handler.ipfilter.IpFilterRuleType r3, io.netty.handler.ipfilter.IpSubnetFilterRule.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        private static java.math.BigInteger ipToInt(java.net.Inet6Address r1) {
                byte[] r1 = r1.getAddress()
                java.math.BigInteger r0 = new java.math.BigInteger
                r0.<init>(r1)
                return r0
        }

        private static java.math.BigInteger prefixToSubnetMask(int r1) {
                java.math.BigInteger r0 = io.netty.handler.ipfilter.IpSubnetFilterRule.Ip6SubnetFilterRule.MINUS_ONE
                int r1 = 128 - r1
                java.math.BigInteger r1 = r0.shiftLeft(r1)
                return r1
        }

        @Override // io.netty.handler.ipfilter.IpFilterRule
        public boolean matches(java.net.InetSocketAddress r2) {
                r1 = this;
                java.net.InetAddress r2 = r2.getAddress()
                boolean r0 = r2 instanceof java.net.Inet6Address
                if (r0 == 0) goto L1b
                java.net.Inet6Address r2 = (java.net.Inet6Address) r2
                java.math.BigInteger r2 = ipToInt(r2)
                java.math.BigInteger r0 = r1.subnetMask
                java.math.BigInteger r2 = r2.and(r0)
                java.math.BigInteger r0 = r1.networkAddress
                boolean r2 = r2.equals(r0)
                return r2
            L1b:
                r2 = 0
                return r2
        }

        @Override // io.netty.handler.ipfilter.IpFilterRule
        public io.netty.handler.ipfilter.IpFilterRuleType ruleType() {
                r1 = this;
                io.netty.handler.ipfilter.IpFilterRuleType r0 = r1.ruleType
                return r0
        }
    }

    public IpSubnetFilterRule(java.lang.String r1, int r2, io.netty.handler.ipfilter.IpFilterRuleType r3) {
            r0 = this;
            r0.<init>()
            java.net.InetAddress r1 = io.netty.util.internal.SocketUtils.addressByName(r1)     // Catch: java.net.UnknownHostException -> Le
            io.netty.handler.ipfilter.IpFilterRule r1 = selectFilterRule(r1, r2, r3)     // Catch: java.net.UnknownHostException -> Le
            r0.filterRule = r1     // Catch: java.net.UnknownHostException -> Le
            return
        Le:
            r1 = move-exception
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "ipAddress"
            r2.<init>(r3, r1)
            throw r2
    }

    public IpSubnetFilterRule(java.net.InetAddress r1, int r2, io.netty.handler.ipfilter.IpFilterRuleType r3) {
            r0 = this;
            r0.<init>()
            io.netty.handler.ipfilter.IpFilterRule r1 = selectFilterRule(r1, r2, r3)
            r0.filterRule = r1
            return
    }

    private static io.netty.handler.ipfilter.IpFilterRule selectFilterRule(java.net.InetAddress r2, int r3, io.netty.handler.ipfilter.IpFilterRuleType r4) {
            if (r2 == 0) goto L2d
            if (r4 == 0) goto L25
            boolean r0 = r2 instanceof java.net.Inet4Address
            r1 = 0
            if (r0 == 0) goto L11
            io.netty.handler.ipfilter.IpSubnetFilterRule$Ip4SubnetFilterRule r0 = new io.netty.handler.ipfilter.IpSubnetFilterRule$Ip4SubnetFilterRule
            java.net.Inet4Address r2 = (java.net.Inet4Address) r2
            r0.<init>(r2, r3, r4, r1)
            return r0
        L11:
            boolean r0 = r2 instanceof java.net.Inet6Address
            if (r0 == 0) goto L1d
            io.netty.handler.ipfilter.IpSubnetFilterRule$Ip6SubnetFilterRule r0 = new io.netty.handler.ipfilter.IpSubnetFilterRule$Ip6SubnetFilterRule
            java.net.Inet6Address r2 = (java.net.Inet6Address) r2
            r0.<init>(r2, r3, r4, r1)
            return r0
        L1d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Only IPv4 and IPv6 addresses are supported"
            r2.<init>(r3)
            throw r2
        L25:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "ruleType"
            r2.<init>(r3)
            throw r2
        L2d:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "ipAddress"
            r2.<init>(r3)
            throw r2
    }

    @Override // io.netty.handler.ipfilter.IpFilterRule
    public boolean matches(java.net.InetSocketAddress r2) {
            r1 = this;
            io.netty.handler.ipfilter.IpFilterRule r0 = r1.filterRule
            boolean r2 = r0.matches(r2)
            return r2
    }

    @Override // io.netty.handler.ipfilter.IpFilterRule
    public io.netty.handler.ipfilter.IpFilterRuleType ruleType() {
            r1 = this;
            io.netty.handler.ipfilter.IpFilterRule r0 = r1.filterRule
            io.netty.handler.ipfilter.IpFilterRuleType r0 = r0.ruleType()
            return r0
    }
}
