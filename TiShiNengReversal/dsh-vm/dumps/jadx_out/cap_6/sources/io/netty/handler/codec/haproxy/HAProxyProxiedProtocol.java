package io.netty.handler.codec.haproxy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum HAProxyProxiedProtocol extends java.lang.Enum<io.netty.handler.codec.haproxy.HAProxyProxiedProtocol> {
    private static final /* synthetic */ io.netty.handler.codec.haproxy.HAProxyProxiedProtocol[] $VALUES = null;
    public static final io.netty.handler.codec.haproxy.HAProxyProxiedProtocol TCP4 = null;
    public static final io.netty.handler.codec.haproxy.HAProxyProxiedProtocol TCP6 = null;
    public static final io.netty.handler.codec.haproxy.HAProxyProxiedProtocol UDP4 = null;
    public static final io.netty.handler.codec.haproxy.HAProxyProxiedProtocol UDP6 = null;
    public static final io.netty.handler.codec.haproxy.HAProxyProxiedProtocol UNIX_DGRAM = null;
    public static final io.netty.handler.codec.haproxy.HAProxyProxiedProtocol UNIX_STREAM = null;
    public static final io.netty.handler.codec.haproxy.HAProxyProxiedProtocol UNKNOWN = null;
    private final io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.AddressFamily addressFamily;
    private final byte byteValue;
    private final io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.TransportProtocol transportProtocol;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum AddressFamily extends java.lang.Enum<io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.AddressFamily> {
        private static final /* synthetic */ io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.AddressFamily[] $VALUES = null;
        public static final io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.AddressFamily AF_IPv4 = null;
        public static final io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.AddressFamily AF_IPv6 = null;
        public static final io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.AddressFamily AF_UNIX = null;
        public static final io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.AddressFamily AF_UNSPEC = null;
        private static final byte FAMILY_MASK = -16;
        private final byte byteValue;

        static {
                io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$AddressFamily r0 = new io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$AddressFamily
                java.lang.String r1 = "AF_UNSPEC"
                r2 = 0
                r0.<init>(r1, r2, r2)
                io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.AddressFamily.AF_UNSPEC = r0
                io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$AddressFamily r1 = new io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$AddressFamily
                r3 = 16
                java.lang.String r4 = "AF_IPv4"
                r5 = 1
                r1.<init>(r4, r5, r3)
                io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.AddressFamily.AF_IPv4 = r1
                io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$AddressFamily r3 = new io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$AddressFamily
                r4 = 32
                java.lang.String r6 = "AF_IPv6"
                r7 = 2
                r3.<init>(r6, r7, r4)
                io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.AddressFamily.AF_IPv6 = r3
                io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$AddressFamily r4 = new io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$AddressFamily
                r6 = 48
                java.lang.String r8 = "AF_UNIX"
                r9 = 3
                r4.<init>(r8, r9, r6)
                io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.AddressFamily.AF_UNIX = r4
                r6 = 4
                io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$AddressFamily[] r6 = new io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.AddressFamily[r6]
                r6[r2] = r0
                r6[r5] = r1
                r6[r7] = r3
                r6[r9] = r4
                io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.AddressFamily.$VALUES = r6
                return
        }

        AddressFamily(java.lang.String r1, int r2, byte r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.byteValue = r3
                return
        }

        public static io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.AddressFamily valueOf(byte r3) {
                r3 = r3 & (-16)
                byte r0 = (byte) r3
                if (r0 == 0) goto L31
                r1 = 16
                if (r0 == r1) goto L2e
                r1 = 32
                if (r0 == r1) goto L2b
                r1 = 48
                if (r0 != r1) goto L14
                io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$AddressFamily r3 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.AddressFamily.AF_UNIX
                return r3
            L14:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "unknown address family: "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
            L2b:
                io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$AddressFamily r3 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.AddressFamily.AF_IPv6
                return r3
            L2e:
                io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$AddressFamily r3 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.AddressFamily.AF_IPv4
                return r3
            L31:
                io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$AddressFamily r3 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.AddressFamily.AF_UNSPEC
                return r3
        }

        public static io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.AddressFamily valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$AddressFamily> r0 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.AddressFamily.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$AddressFamily r1 = (io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.AddressFamily) r1
                return r1
        }

        public static io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.AddressFamily[] values() {
                io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$AddressFamily[] r0 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.AddressFamily.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$AddressFamily[] r0 = (io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.AddressFamily[]) r0
                return r0
        }

        public byte byteValue() {
                r1 = this;
                byte r0 = r1.byteValue
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum TransportProtocol extends java.lang.Enum<io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.TransportProtocol> {
        private static final /* synthetic */ io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.TransportProtocol[] $VALUES = null;
        public static final io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.TransportProtocol DGRAM = null;
        public static final io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.TransportProtocol STREAM = null;
        private static final byte TRANSPORT_MASK = 15;
        public static final io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.TransportProtocol UNSPEC = null;
        private final byte transportByte;

        static {
                io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$TransportProtocol r0 = new io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$TransportProtocol
                java.lang.String r1 = "UNSPEC"
                r2 = 0
                r0.<init>(r1, r2, r2)
                io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.TransportProtocol.UNSPEC = r0
                io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$TransportProtocol r1 = new io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$TransportProtocol
                java.lang.String r3 = "STREAM"
                r4 = 1
                r1.<init>(r3, r4, r4)
                io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.TransportProtocol.STREAM = r1
                io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$TransportProtocol r3 = new io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$TransportProtocol
                java.lang.String r5 = "DGRAM"
                r6 = 2
                r3.<init>(r5, r6, r6)
                io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.TransportProtocol.DGRAM = r3
                r5 = 3
                io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$TransportProtocol[] r5 = new io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.TransportProtocol[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.TransportProtocol.$VALUES = r5
                return
        }

        TransportProtocol(java.lang.String r1, int r2, byte r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.transportByte = r3
                return
        }

        public static io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.TransportProtocol valueOf(byte r3) {
                r3 = r3 & 15
                byte r0 = (byte) r3
                if (r0 == 0) goto L28
                r1 = 1
                if (r0 == r1) goto L25
                r1 = 2
                if (r0 != r1) goto Le
                io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$TransportProtocol r3 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.TransportProtocol.DGRAM
                return r3
            Le:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "unknown transport protocol: "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
            L25:
                io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$TransportProtocol r3 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.TransportProtocol.STREAM
                return r3
            L28:
                io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$TransportProtocol r3 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.TransportProtocol.UNSPEC
                return r3
        }

        public static io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.TransportProtocol valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$TransportProtocol> r0 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.TransportProtocol.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$TransportProtocol r1 = (io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.TransportProtocol) r1
                return r1
        }

        public static io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.TransportProtocol[] values() {
                io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$TransportProtocol[] r0 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.TransportProtocol.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$TransportProtocol[] r0 = (io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.TransportProtocol[]) r0
                return r0
        }

        public byte byteValue() {
                r1 = this;
                byte r0 = r1.transportByte
                return r0
        }
    }

    static {
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol r0 = new io.netty.handler.codec.haproxy.HAProxyProxiedProtocol
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$AddressFamily r4 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.AddressFamily.AF_UNSPEC
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$TransportProtocol r5 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.TransportProtocol.UNSPEC
            java.lang.String r1 = "UNKNOWN"
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.UNKNOWN = r0
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol r1 = new io.netty.handler.codec.haproxy.HAProxyProxiedProtocol
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$AddressFamily r5 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.AddressFamily.AF_IPv4
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$TransportProtocol r11 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.TransportProtocol.STREAM
            java.lang.String r2 = "TCP4"
            r3 = 1
            r4 = 17
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.TCP4 = r1
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol r6 = new io.netty.handler.codec.haproxy.HAProxyProxiedProtocol
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$AddressFamily r16 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.AddressFamily.AF_IPv6
            java.lang.String r7 = "TCP6"
            r8 = 2
            r9 = 33
            r10 = r16
            r6.<init>(r7, r8, r9, r10, r11)
            r18 = r6
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.TCP6 = r18
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol r2 = new io.netty.handler.codec.haproxy.HAProxyProxiedProtocol
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$TransportProtocol r17 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.TransportProtocol.DGRAM
            java.lang.String r3 = "UDP4"
            r4 = 3
            r6 = r5
            r5 = 18
            r7 = r17
            r2.<init>(r3, r4, r5, r6, r7)
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.UDP4 = r2
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol r12 = new io.netty.handler.codec.haproxy.HAProxyProxiedProtocol
            r14 = 4
            r15 = 34
            java.lang.String r13 = "UDP6"
            r12.<init>(r13, r14, r15, r16, r17)
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.UDP6 = r12
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol r6 = new io.netty.handler.codec.haproxy.HAProxyProxiedProtocol
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$AddressFamily r23 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.AddressFamily.AF_UNIX
            java.lang.String r7 = "UNIX_STREAM"
            r8 = 5
            r9 = 49
            r10 = r23
            r6.<init>(r7, r8, r9, r10, r11)
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.UNIX_STREAM = r6
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol r19 = new io.netty.handler.codec.haproxy.HAProxyProxiedProtocol
            r21 = 6
            r22 = 50
            java.lang.String r20 = "UNIX_DGRAM"
            r24 = r17
            r19.<init>(r20, r21, r22, r23, r24)
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.UNIX_DGRAM = r19
            r3 = 7
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol[] r3 = new io.netty.handler.codec.haproxy.HAProxyProxiedProtocol[r3]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r0 = 2
            r3[r0] = r18
            r0 = 3
            r3[r0] = r2
            r0 = 4
            r3[r0] = r12
            r0 = 5
            r3[r0] = r6
            r0 = 6
            r3[r0] = r19
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.$VALUES = r3
            return
    }

    HAProxyProxiedProtocol(java.lang.String r1, int r2, byte r3, io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.AddressFamily r4, io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.TransportProtocol r5) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.byteValue = r3
            r0.addressFamily = r4
            r0.transportProtocol = r5
            return
    }

    public static io.netty.handler.codec.haproxy.HAProxyProxiedProtocol valueOf(byte r3) {
            if (r3 == 0) goto L45
            r0 = 17
            if (r3 == r0) goto L42
            r0 = 18
            if (r3 == r0) goto L3f
            r0 = 33
            if (r3 == r0) goto L3c
            r0 = 34
            if (r3 == r0) goto L39
            r0 = 49
            if (r3 == r0) goto L36
            r0 = 50
            if (r3 != r0) goto L1d
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol r3 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.UNIX_DGRAM
            return r3
        L1d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unknown transport protocol + address family: "
            r1.append(r2)
            r3 = r3 & 255(0xff, float:3.57E-43)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L36:
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol r3 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.UNIX_STREAM
            return r3
        L39:
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol r3 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.UDP6
            return r3
        L3c:
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol r3 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.TCP6
            return r3
        L3f:
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol r3 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.UDP4
            return r3
        L42:
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol r3 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.TCP4
            return r3
        L45:
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol r3 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.UNKNOWN
            return r3
    }

    public static io.netty.handler.codec.haproxy.HAProxyProxiedProtocol valueOf(java.lang.String r1) {
            java.lang.Class<io.netty.handler.codec.haproxy.HAProxyProxiedProtocol> r0 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol r1 = (io.netty.handler.codec.haproxy.HAProxyProxiedProtocol) r1
            return r1
    }

    public static io.netty.handler.codec.haproxy.HAProxyProxiedProtocol[] values() {
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol[] r0 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.$VALUES
            java.lang.Object r0 = r0.clone()
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol[] r0 = (io.netty.handler.codec.haproxy.HAProxyProxiedProtocol[]) r0
            return r0
    }

    public io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.AddressFamily addressFamily() {
            r1 = this;
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$AddressFamily r0 = r1.addressFamily
            return r0
    }

    public byte byteValue() {
            r1 = this;
            byte r0 = r1.byteValue
            return r0
    }

    public io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.TransportProtocol transportProtocol() {
            r1 = this;
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$TransportProtocol r0 = r1.transportProtocol
            return r0
    }
}
