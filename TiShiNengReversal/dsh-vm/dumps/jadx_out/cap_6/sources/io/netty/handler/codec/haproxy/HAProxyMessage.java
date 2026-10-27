package io.netty.handler.codec.haproxy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class HAProxyMessage extends io.netty.util.AbstractReferenceCounted {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final io.netty.util.ResourceLeakDetector<io.netty.handler.codec.haproxy.HAProxyMessage> leakDetector = null;
    private final io.netty.handler.codec.haproxy.HAProxyCommand command;
    private final java.lang.String destinationAddress;
    private final int destinationPort;
    private final io.netty.util.ResourceLeakTracker<io.netty.handler.codec.haproxy.HAProxyMessage> leak;
    private final io.netty.handler.codec.haproxy.HAProxyProtocolVersion protocolVersion;
    private final io.netty.handler.codec.haproxy.HAProxyProxiedProtocol proxiedProtocol;
    private final java.lang.String sourceAddress;
    private final int sourcePort;
    private final java.util.List<io.netty.handler.codec.haproxy.HAProxyTLV> tlvs;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.haproxy.HAProxyMessage$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$haproxy$HAProxyProxiedProtocol$AddressFamily = null;
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$haproxy$HAProxyTLV$Type = null;

        static {
                io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$AddressFamily[] r0 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.AddressFamily.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.haproxy.HAProxyMessage.AnonymousClass1.$SwitchMap$io$netty$handler$codec$haproxy$HAProxyProxiedProtocol$AddressFamily = r0
                r1 = 1
                io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$AddressFamily r2 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.AddressFamily.AF_UNSPEC     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = io.netty.handler.codec.haproxy.HAProxyMessage.AnonymousClass1.$SwitchMap$io$netty$handler$codec$haproxy$HAProxyProxiedProtocol$AddressFamily     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$AddressFamily r3 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.AddressFamily.AF_UNIX     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = io.netty.handler.codec.haproxy.HAProxyMessage.AnonymousClass1.$SwitchMap$io$netty$handler$codec$haproxy$HAProxyProxiedProtocol$AddressFamily     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$AddressFamily r4 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.AddressFamily.AF_IPv4     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                r3 = 4
                int[] r4 = io.netty.handler.codec.haproxy.HAProxyMessage.AnonymousClass1.$SwitchMap$io$netty$handler$codec$haproxy$HAProxyProxiedProtocol$AddressFamily     // Catch: java.lang.NoSuchFieldError -> L33
                io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$AddressFamily r5 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.AddressFamily.AF_IPv6     // Catch: java.lang.NoSuchFieldError -> L33
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r4[r5] = r3     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                io.netty.handler.codec.haproxy.HAProxyTLV$Type[] r4 = io.netty.handler.codec.haproxy.HAProxyTLV.Type.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                io.netty.handler.codec.haproxy.HAProxyMessage.AnonymousClass1.$SwitchMap$io$netty$handler$codec$haproxy$HAProxyTLV$Type = r4
                io.netty.handler.codec.haproxy.HAProxyTLV$Type r5 = io.netty.handler.codec.haproxy.HAProxyTLV.Type.PP2_TYPE_SSL     // Catch: java.lang.NoSuchFieldError -> L44
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L44
                r4[r5] = r1     // Catch: java.lang.NoSuchFieldError -> L44
            L44:
                int[] r1 = io.netty.handler.codec.haproxy.HAProxyMessage.AnonymousClass1.$SwitchMap$io$netty$handler$codec$haproxy$HAProxyTLV$Type     // Catch: java.lang.NoSuchFieldError -> L4e
                io.netty.handler.codec.haproxy.HAProxyTLV$Type r4 = io.netty.handler.codec.haproxy.HAProxyTLV.Type.PP2_TYPE_ALPN     // Catch: java.lang.NoSuchFieldError -> L4e
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4e
                r1[r4] = r0     // Catch: java.lang.NoSuchFieldError -> L4e
            L4e:
                int[] r0 = io.netty.handler.codec.haproxy.HAProxyMessage.AnonymousClass1.$SwitchMap$io$netty$handler$codec$haproxy$HAProxyTLV$Type     // Catch: java.lang.NoSuchFieldError -> L58
                io.netty.handler.codec.haproxy.HAProxyTLV$Type r1 = io.netty.handler.codec.haproxy.HAProxyTLV.Type.PP2_TYPE_AUTHORITY     // Catch: java.lang.NoSuchFieldError -> L58
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L58
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L58
            L58:
                int[] r0 = io.netty.handler.codec.haproxy.HAProxyMessage.AnonymousClass1.$SwitchMap$io$netty$handler$codec$haproxy$HAProxyTLV$Type     // Catch: java.lang.NoSuchFieldError -> L62
                io.netty.handler.codec.haproxy.HAProxyTLV$Type r1 = io.netty.handler.codec.haproxy.HAProxyTLV.Type.PP2_TYPE_SSL_VERSION     // Catch: java.lang.NoSuchFieldError -> L62
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L62
                r0[r1] = r3     // Catch: java.lang.NoSuchFieldError -> L62
            L62:
                int[] r0 = io.netty.handler.codec.haproxy.HAProxyMessage.AnonymousClass1.$SwitchMap$io$netty$handler$codec$haproxy$HAProxyTLV$Type     // Catch: java.lang.NoSuchFieldError -> L6d
                io.netty.handler.codec.haproxy.HAProxyTLV$Type r1 = io.netty.handler.codec.haproxy.HAProxyTLV.Type.PP2_TYPE_SSL_CN     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L6d:
                int[] r0 = io.netty.handler.codec.haproxy.HAProxyMessage.AnonymousClass1.$SwitchMap$io$netty$handler$codec$haproxy$HAProxyTLV$Type     // Catch: java.lang.NoSuchFieldError -> L78
                io.netty.handler.codec.haproxy.HAProxyTLV$Type r1 = io.netty.handler.codec.haproxy.HAProxyTLV.Type.PP2_TYPE_NETNS     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r0 = io.netty.handler.codec.haproxy.HAProxyMessage.AnonymousClass1.$SwitchMap$io$netty$handler$codec$haproxy$HAProxyTLV$Type     // Catch: java.lang.NoSuchFieldError -> L83
                io.netty.handler.codec.haproxy.HAProxyTLV$Type r1 = io.netty.handler.codec.haproxy.HAProxyTLV.Type.OTHER     // Catch: java.lang.NoSuchFieldError -> L83
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L83
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L83
            L83:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static {
            io.netty.util.ResourceLeakDetectorFactory r0 = io.netty.util.ResourceLeakDetectorFactory.instance()
            java.lang.Class<io.netty.handler.codec.haproxy.HAProxyMessage> r1 = io.netty.handler.codec.haproxy.HAProxyMessage.class
            io.netty.util.ResourceLeakDetector r0 = r0.newResourceLeakDetector(r1)
            io.netty.handler.codec.haproxy.HAProxyMessage.leakDetector = r0
            return
    }

    private HAProxyMessage(io.netty.handler.codec.haproxy.HAProxyProtocolVersion r10, io.netty.handler.codec.haproxy.HAProxyCommand r11, io.netty.handler.codec.haproxy.HAProxyProxiedProtocol r12, java.lang.String r13, java.lang.String r14, int r15, int r16) {
            r9 = this;
            java.util.List r8 = java.util.Collections.EMPTY_LIST
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    private HAProxyMessage(io.netty.handler.codec.haproxy.HAProxyProtocolVersion r2, io.netty.handler.codec.haproxy.HAProxyCommand r3, io.netty.handler.codec.haproxy.HAProxyProxiedProtocol r4, java.lang.String r5, java.lang.String r6, int r7, int r8, java.util.List<io.netty.handler.codec.haproxy.HAProxyTLV> r9) {
            r1 = this;
            r1.<init>()
            if (r4 == 0) goto L32
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$AddressFamily r0 = r4.addressFamily()
            checkAddress(r5, r0)
            checkAddress(r6, r0)
            checkPort(r7)
            checkPort(r8)
            r1.protocolVersion = r2
            r1.command = r3
            r1.proxiedProtocol = r4
            r1.sourceAddress = r5
            r1.destinationAddress = r6
            r1.sourcePort = r7
            r1.destinationPort = r8
            java.util.List r2 = java.util.Collections.unmodifiableList(r9)
            r1.tlvs = r2
            io.netty.util.ResourceLeakDetector<io.netty.handler.codec.haproxy.HAProxyMessage> r2 = io.netty.handler.codec.haproxy.HAProxyMessage.leakDetector
            io.netty.util.ResourceLeakTracker r2 = r2.track(r1)
            r1.leak = r2
            return
        L32:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "proxiedProtocol"
            r2.<init>(r3)
            throw r2
    }

    private HAProxyMessage(io.netty.handler.codec.haproxy.HAProxyProtocolVersion r9, io.netty.handler.codec.haproxy.HAProxyCommand r10, io.netty.handler.codec.haproxy.HAProxyProxiedProtocol r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
            r8 = this;
            int r6 = portStringToInt(r14)
            int r7 = portStringToInt(r15)
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    private static void checkAddress(java.lang.String r3, io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.AddressFamily r4) {
            if (r4 == 0) goto L82
            int[] r0 = io.netty.handler.codec.haproxy.HAProxyMessage.AnonymousClass1.$SwitchMap$io$netty$handler$codec$haproxy$HAProxyProxiedProtocol$AddressFamily
            int r1 = r4.ordinal()
            r1 = r0[r1]
            r2 = 1
            if (r1 == r2) goto L68
            r2 = 2
            if (r1 == r2) goto L6a
            if (r3 == 0) goto L60
            int r4 = r4.ordinal()
            r4 = r0[r4]
            r0 = 3
            if (r4 == r0) goto L42
            r0 = 4
            if (r4 != r0) goto L3c
            boolean r4 = io.netty.util.NetUtil.isValidIpV6Address(r3)
            if (r4 == 0) goto L25
            goto L6a
        L25:
            io.netty.handler.codec.haproxy.HAProxyProtocolException r4 = new io.netty.handler.codec.haproxy.HAProxyProtocolException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "invalid IPv6 address: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L3c:
            java.lang.Error r3 = new java.lang.Error
            r3.<init>()
            throw r3
        L42:
            boolean r4 = io.netty.util.NetUtil.isValidIpV4Address(r3)
            if (r4 == 0) goto L49
            goto L6a
        L49:
            io.netty.handler.codec.haproxy.HAProxyProtocolException r4 = new io.netty.handler.codec.haproxy.HAProxyProtocolException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "invalid IPv4 address: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L60:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "address"
            r3.<init>(r4)
            throw r3
        L68:
            if (r3 != 0) goto L6b
        L6a:
            return
        L6b:
            io.netty.handler.codec.haproxy.HAProxyProtocolException r4 = new io.netty.handler.codec.haproxy.HAProxyProtocolException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "unable to validate an AF_UNSPEC address: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L82:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "addrFamily"
            r3.<init>(r4)
            throw r3
    }

    private static void checkPort(int r3) {
            if (r3 < 0) goto L8
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r3 > r0) goto L8
            return
        L8:
            io.netty.handler.codec.haproxy.HAProxyProtocolException r0 = new io.netty.handler.codec.haproxy.HAProxyProtocolException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "invalid port: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " (expected: 1 ~ 65535)"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    static io.netty.handler.codec.haproxy.HAProxyMessage decodeHeader(io.netty.buffer.ByteBuf r12) {
            if (r12 == 0) goto L197
            int r0 = r12.readableBytes()
            r1 = 16
            if (r0 < r1) goto L177
            r0 = 12
            r12.skipBytes(r0)
            byte r2 = r12.readByte()
            io.netty.handler.codec.haproxy.HAProxyProtocolVersion r4 = io.netty.handler.codec.haproxy.HAProxyProtocolVersion.valueOf(r2)     // Catch: java.lang.IllegalArgumentException -> L16f
            io.netty.handler.codec.haproxy.HAProxyProtocolVersion r3 = io.netty.handler.codec.haproxy.HAProxyProtocolVersion.V2
            if (r4 != r3) goto L154
            io.netty.handler.codec.haproxy.HAProxyCommand r5 = io.netty.handler.codec.haproxy.HAProxyCommand.valueOf(r2)     // Catch: java.lang.IllegalArgumentException -> L14c
            io.netty.handler.codec.haproxy.HAProxyCommand r2 = io.netty.handler.codec.haproxy.HAProxyCommand.LOCAL
            if (r5 != r2) goto L28
            io.netty.handler.codec.haproxy.HAProxyMessage r12 = unknownMsg(r3, r2)
            return r12
        L28:
            byte r2 = r12.readByte()     // Catch: java.lang.IllegalArgumentException -> L144
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol r6 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.valueOf(r2)     // Catch: java.lang.IllegalArgumentException -> L144
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol r2 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.UNKNOWN
            if (r6 != r2) goto L3b
            io.netty.handler.codec.haproxy.HAProxyCommand r12 = io.netty.handler.codec.haproxy.HAProxyCommand.PROXY
            io.netty.handler.codec.haproxy.HAProxyMessage r12 = unknownMsg(r3, r12)
            return r12
        L3b:
            int r2 = r12.readUnsignedShort()
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$AddressFamily r3 = r6.addressFamily()
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$AddressFamily r7 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.AddressFamily.AF_UNIX
            if (r3 != r7) goto La7
            r0 = 216(0xd8, float:3.03E-43)
            if (r2 < r0) goto L83
            int r1 = r12.readableBytes()
            if (r1 < r0) goto L83
            int r1 = r12.readerIndex()
            io.netty.util.ByteProcessor r2 = io.netty.util.ByteProcessor.FIND_NUL
            r3 = 108(0x6c, float:1.51E-43)
            int r7 = r12.forEachByte(r1, r3, r2)
            r8 = -1
            if (r7 != r8) goto L63
            r7 = 108(0x6c, float:1.51E-43)
            goto L64
        L63:
            int r7 = r7 - r1
        L64:
            java.nio.charset.Charset r9 = io.netty.util.CharsetUtil.US_ASCII
            java.lang.String r7 = r12.toString(r1, r7, r9)
            int r10 = r1 + 108
            int r2 = r12.forEachByte(r10, r3, r2)
            if (r2 != r8) goto L73
            goto L75
        L73:
            int r3 = r2 - r10
        L75:
            java.lang.String r2 = r12.toString(r10, r3, r9)
            int r1 = r1 + r0
            r12.readerIndex(r1)
            r0 = 0
            r9 = 0
            r10 = 0
        L80:
            r8 = r2
            goto Lfa
        L83:
            io.netty.handler.codec.haproxy.HAProxyProtocolException r0 = new io.netty.handler.codec.haproxy.HAProxyProtocolException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "incomplete UNIX socket address information: "
            r1.append(r3)
            int r12 = r12.readableBytes()
            int r12 = java.lang.Math.min(r2, r12)
            r1.append(r12)
            java.lang.String r12 = " bytes (expected: 216+ bytes)"
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r0.<init>(r12)
            throw r0
        La7:
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$AddressFamily r7 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.AddressFamily.AF_IPv4
            if (r3 != r7) goto Ld9
            if (r2 < r0) goto Lb5
            int r1 = r12.readableBytes()
            if (r1 < r0) goto Lb5
            r1 = 4
            goto Le7
        Lb5:
            io.netty.handler.codec.haproxy.HAProxyProtocolException r0 = new io.netty.handler.codec.haproxy.HAProxyProtocolException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "incomplete IPv4 address information: "
            r1.append(r3)
            int r12 = r12.readableBytes()
            int r12 = java.lang.Math.min(r2, r12)
            r1.append(r12)
            java.lang.String r12 = " bytes (expected: 12+ bytes)"
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r0.<init>(r12)
            throw r0
        Ld9:
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol$AddressFamily r0 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.AddressFamily.AF_IPv6
            if (r3 != r0) goto L128
            r0 = 36
            if (r2 < r0) goto L104
            int r3 = r12.readableBytes()
            if (r3 < r0) goto L104
        Le7:
            java.lang.String r7 = ipBytesToString(r12, r1)
            java.lang.String r2 = ipBytesToString(r12, r1)
            int r0 = r12.readUnsignedShort()
            int r1 = r12.readUnsignedShort()
            r9 = r0
            r10 = r1
            goto L80
        Lfa:
            java.util.List r11 = readTlvs(r12)
            io.netty.handler.codec.haproxy.HAProxyMessage r3 = new io.netty.handler.codec.haproxy.HAProxyMessage
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return r3
        L104:
            io.netty.handler.codec.haproxy.HAProxyProtocolException r0 = new io.netty.handler.codec.haproxy.HAProxyProtocolException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "incomplete IPv6 address information: "
            r1.append(r3)
            int r12 = r12.readableBytes()
            int r12 = java.lang.Math.min(r2, r12)
            r1.append(r12)
            java.lang.String r12 = " bytes (expected: 36+ bytes)"
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r0.<init>(r12)
            throw r0
        L128:
            io.netty.handler.codec.haproxy.HAProxyProtocolException r12 = new io.netty.handler.codec.haproxy.HAProxyProtocolException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "unable to parse address information (unknown address family: "
            r0.append(r1)
            r0.append(r3)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            throw r12
        L144:
            r0 = move-exception
            r12 = r0
            io.netty.handler.codec.haproxy.HAProxyProtocolException r0 = new io.netty.handler.codec.haproxy.HAProxyProtocolException
            r0.<init>(r12)
            throw r0
        L14c:
            r0 = move-exception
            r12 = r0
            io.netty.handler.codec.haproxy.HAProxyProtocolException r0 = new io.netty.handler.codec.haproxy.HAProxyProtocolException
            r0.<init>(r12)
            throw r0
        L154:
            io.netty.handler.codec.haproxy.HAProxyProtocolException r12 = new io.netty.handler.codec.haproxy.HAProxyProtocolException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "version 1 unsupported: 0x"
            r0.append(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            throw r12
        L16f:
            r0 = move-exception
            r12 = r0
            io.netty.handler.codec.haproxy.HAProxyProtocolException r0 = new io.netty.handler.codec.haproxy.HAProxyProtocolException
            r0.<init>(r12)
            throw r0
        L177:
            io.netty.handler.codec.haproxy.HAProxyProtocolException r0 = new io.netty.handler.codec.haproxy.HAProxyProtocolException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "incomplete header: "
            r1.append(r2)
            int r12 = r12.readableBytes()
            r1.append(r12)
            java.lang.String r12 = " bytes (expected: 16+ bytes)"
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r0.<init>(r12)
            throw r0
        L197:
            java.lang.NullPointerException r12 = new java.lang.NullPointerException
            java.lang.String r0 = "header"
            r12.<init>(r0)
            throw r12
    }

    static io.netty.handler.codec.haproxy.HAProxyMessage decodeHeader(java.lang.String r13) {
            if (r13 == 0) goto Lc2
            java.lang.String r0 = " "
            java.lang.String[] r0 = r13.split(r0)
            int r1 = r0.length
            r2 = 2
            if (r1 < r2) goto La6
            java.lang.String r3 = "PROXY"
            r4 = 0
            r5 = r0[r4]
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L8d
            r3 = 1
            r4 = r0[r3]     // Catch: java.lang.IllegalArgumentException -> L85
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol r8 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.valueOf(r4)     // Catch: java.lang.IllegalArgumentException -> L85
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol r4 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.TCP4
            if (r8 == r4) goto L44
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol r4 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.TCP6
            if (r8 == r4) goto L44
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol r4 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.UNKNOWN
            if (r8 != r4) goto L2b
            goto L44
        L2b:
            io.netty.handler.codec.haproxy.HAProxyProtocolException r13 = new io.netty.handler.codec.haproxy.HAProxyProtocolException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unsupported v1 proxied protocol: "
            r1.append(r2)
            r0 = r0[r3]
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r13.<init>(r0)
            throw r13
        L44:
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol r3 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.UNKNOWN
            if (r8 != r3) goto L51
            io.netty.handler.codec.haproxy.HAProxyProtocolVersion r13 = io.netty.handler.codec.haproxy.HAProxyProtocolVersion.V1
            io.netty.handler.codec.haproxy.HAProxyCommand r0 = io.netty.handler.codec.haproxy.HAProxyCommand.PROXY
            io.netty.handler.codec.haproxy.HAProxyMessage r13 = unknownMsg(r13, r0)
            return r13
        L51:
            r3 = 6
            if (r1 != r3) goto L69
            io.netty.handler.codec.haproxy.HAProxyMessage r5 = new io.netty.handler.codec.haproxy.HAProxyMessage
            io.netty.handler.codec.haproxy.HAProxyProtocolVersion r6 = io.netty.handler.codec.haproxy.HAProxyProtocolVersion.V1
            io.netty.handler.codec.haproxy.HAProxyCommand r7 = io.netty.handler.codec.haproxy.HAProxyCommand.PROXY
            r9 = r0[r2]
            r13 = 3
            r10 = r0[r13]
            r13 = 4
            r11 = r0[r13]
            r13 = 5
            r12 = r0[r13]
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            return r5
        L69:
            io.netty.handler.codec.haproxy.HAProxyProtocolException r0 = new io.netty.handler.codec.haproxy.HAProxyProtocolException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "invalid TCP4/6 header: "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r13 = " (expected: 6 parts)"
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r0.<init>(r13)
            throw r0
        L85:
            r0 = move-exception
            r13 = r0
            io.netty.handler.codec.haproxy.HAProxyProtocolException r0 = new io.netty.handler.codec.haproxy.HAProxyProtocolException
            r0.<init>(r13)
            throw r0
        L8d:
            io.netty.handler.codec.haproxy.HAProxyProtocolException r13 = new io.netty.handler.codec.haproxy.HAProxyProtocolException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unknown identifier: "
            r1.append(r2)
            r0 = r0[r4]
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r13.<init>(r0)
            throw r13
        La6:
            io.netty.handler.codec.haproxy.HAProxyProtocolException r0 = new io.netty.handler.codec.haproxy.HAProxyProtocolException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "invalid header: "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r13 = " (expected: 'PROXY' and proxied protocol values)"
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r0.<init>(r13)
            throw r0
        Lc2:
            io.netty.handler.codec.haproxy.HAProxyProtocolException r13 = new io.netty.handler.codec.haproxy.HAProxyProtocolException
            java.lang.String r0 = "header"
            r13.<init>(r0)
            throw r13
    }

    private static java.lang.String ipBytesToString(io.netty.buffer.ByteBuf r3, int r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = 4
            if (r4 != r2) goto L1c
        L9:
            if (r1 >= r2) goto L33
            byte r4 = r3.readByte()
            r4 = r4 & 255(0xff, float:3.57E-43)
            r0.append(r4)
            r4 = 46
            r0.append(r4)
            int r1 = r1 + 1
            goto L9
        L1c:
            r4 = 8
            if (r1 >= r4) goto L33
            int r4 = r3.readUnsignedShort()
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r0.append(r4)
            r4 = 58
            r0.append(r4)
            int r1 = r1 + 1
            goto L1c
        L33:
            int r3 = r0.length()
            int r3 = r3 + (-1)
            r0.setLength(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    private static int portStringToInt(java.lang.String r4) {
            java.lang.String r0 = "invalid port: "
            int r1 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L28
            if (r1 <= 0) goto Le
            r2 = 65535(0xffff, float:9.1834E-41)
            if (r1 > r2) goto Le
            return r1
        Le:
            io.netty.handler.codec.haproxy.HAProxyProtocolException r1 = new io.netty.handler.codec.haproxy.HAProxyProtocolException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r4)
            java.lang.String r4 = " (expected: 1 ~ 65535)"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            throw r1
        L28:
            r1 = move-exception
            io.netty.handler.codec.haproxy.HAProxyProtocolException r2 = new io.netty.handler.codec.haproxy.HAProxyProtocolException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r4)
            java.lang.String r4 = r3.toString()
            r2.<init>(r4, r1)
            throw r2
    }

    private static io.netty.handler.codec.haproxy.HAProxyTLV readNextTLV(io.netty.buffer.ByteBuf r7) {
            int r0 = r7.readableBytes()
            r1 = 0
            r2 = 4
            if (r0 >= r2) goto L9
            return r1
        L9:
            byte r0 = r7.readByte()
            io.netty.handler.codec.haproxy.HAProxyTLV$Type r3 = io.netty.handler.codec.haproxy.HAProxyTLV.Type.typeForByteValue(r0)
            int r4 = r7.readUnsignedShort()
            int[] r5 = io.netty.handler.codec.haproxy.HAProxyMessage.AnonymousClass1.$SwitchMap$io$netty$handler$codec$haproxy$HAProxyTLV$Type
            int r6 = r3.ordinal()
            r5 = r5[r6]
            switch(r5) {
                case 1: goto L2b;
                case 2: goto L21;
                case 3: goto L21;
                case 4: goto L21;
                case 5: goto L21;
                case 6: goto L21;
                case 7: goto L21;
                default: goto L20;
            }
        L20:
            return r1
        L21:
            io.netty.handler.codec.haproxy.HAProxyTLV r1 = new io.netty.handler.codec.haproxy.HAProxyTLV
            io.netty.buffer.ByteBuf r7 = r7.readRetainedSlice(r4)
            r1.<init>(r3, r0, r7)
            return r1
        L2b:
            int r0 = r7.readerIndex()
            io.netty.buffer.ByteBuf r0 = r7.retainedSlice(r0, r4)
            io.netty.buffer.ByteBuf r7 = r7.readSlice(r4)
            byte r1 = r7.readByte()
            int r3 = r7.readInt()
            int r4 = r7.readableBytes()
            if (r4 < r2) goto L60
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r2)
        L4a:
            io.netty.handler.codec.haproxy.HAProxyTLV r5 = readNextTLV(r7)
            if (r5 != 0) goto L51
            goto L5a
        L51:
            r4.add(r5)
            int r5 = r7.readableBytes()
            if (r5 >= r2) goto L4a
        L5a:
            io.netty.handler.codec.haproxy.HAProxySSLTLV r7 = new io.netty.handler.codec.haproxy.HAProxySSLTLV
            r7.<init>(r3, r1, r4, r0)
            return r7
        L60:
            io.netty.handler.codec.haproxy.HAProxySSLTLV r7 = new io.netty.handler.codec.haproxy.HAProxySSLTLV
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            r7.<init>(r3, r1, r2, r0)
            return r7
    }

    private static java.util.List<io.netty.handler.codec.haproxy.HAProxyTLV> readTlvs(io.netty.buffer.ByteBuf r3) {
            io.netty.handler.codec.haproxy.HAProxyTLV r0 = readNextTLV(r3)
            if (r0 != 0) goto L9
            java.util.List r3 = java.util.Collections.EMPTY_LIST
            return r3
        L9:
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 4
            r1.<init>(r2)
        Lf:
            r1.add(r0)
            boolean r2 = r0 instanceof io.netty.handler.codec.haproxy.HAProxySSLTLV
            if (r2 == 0) goto L1f
            io.netty.handler.codec.haproxy.HAProxySSLTLV r0 = (io.netty.handler.codec.haproxy.HAProxySSLTLV) r0
            java.util.List r0 = r0.encapsulatedTLVs()
            r1.addAll(r0)
        L1f:
            io.netty.handler.codec.haproxy.HAProxyTLV r0 = readNextTLV(r3)
            if (r0 != 0) goto Lf
            return r1
    }

    private void tryRecord() {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.handler.codec.haproxy.HAProxyMessage> r0 = r1.leak
            if (r0 == 0) goto L7
            r0.record()
        L7:
            return
    }

    private static io.netty.handler.codec.haproxy.HAProxyMessage unknownMsg(io.netty.handler.codec.haproxy.HAProxyProtocolVersion r8, io.netty.handler.codec.haproxy.HAProxyCommand r9) {
            io.netty.handler.codec.haproxy.HAProxyMessage r0 = new io.netty.handler.codec.haproxy.HAProxyMessage
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol r3 = io.netty.handler.codec.haproxy.HAProxyProxiedProtocol.UNKNOWN
            r6 = 0
            r7 = 0
            r4 = 0
            r5 = 0
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public io.netty.handler.codec.haproxy.HAProxyCommand command() {
            r1 = this;
            io.netty.handler.codec.haproxy.HAProxyCommand r0 = r1.command
            return r0
    }

    protected void deallocate() {
            r2 = this;
            java.util.List<io.netty.handler.codec.haproxy.HAProxyTLV> r0 = r2.tlvs     // Catch: java.lang.Throwable -> L16
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L16
        L6:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L16
            io.netty.handler.codec.haproxy.HAProxyTLV r1 = (io.netty.handler.codec.haproxy.HAProxyTLV) r1     // Catch: java.lang.Throwable -> L16
            r1.release()     // Catch: java.lang.Throwable -> L16
            goto L6
        L16:
            r0 = move-exception
            goto L20
        L18:
            io.netty.util.ResourceLeakTracker<io.netty.handler.codec.haproxy.HAProxyMessage> r0 = r2.leak
            if (r0 == 0) goto L1f
            r0.close(r2)
        L1f:
            return
        L20:
            io.netty.util.ResourceLeakTracker<io.netty.handler.codec.haproxy.HAProxyMessage> r1 = r2.leak
            if (r1 == 0) goto L27
            r1.close(r2)
        L27:
            throw r0
    }

    public java.lang.String destinationAddress() {
            r1 = this;
            java.lang.String r0 = r1.destinationAddress
            return r0
    }

    public int destinationPort() {
            r1 = this;
            int r0 = r1.destinationPort
            return r0
    }

    public io.netty.handler.codec.haproxy.HAProxyProtocolVersion protocolVersion() {
            r1 = this;
            io.netty.handler.codec.haproxy.HAProxyProtocolVersion r0 = r1.protocolVersion
            return r0
    }

    public io.netty.handler.codec.haproxy.HAProxyProxiedProtocol proxiedProtocol() {
            r1 = this;
            io.netty.handler.codec.haproxy.HAProxyProxiedProtocol r0 = r1.proxiedProtocol
            return r0
    }

    public boolean release() {
            r1 = this;
            r1.tryRecord()
            boolean r0 = super.release()
            return r0
    }

    public boolean release(int r1) {
            r0 = this;
            r0.tryRecord()
            boolean r1 = super.release(r1)
            return r1
    }

    public io.netty.handler.codec.haproxy.HAProxyMessage retain() {
            r1 = this;
            r1.tryRecord()
            io.netty.util.ReferenceCounted r0 = super.retain()
            io.netty.handler.codec.haproxy.HAProxyMessage r0 = (io.netty.handler.codec.haproxy.HAProxyMessage) r0
            return r0
    }

    public io.netty.handler.codec.haproxy.HAProxyMessage retain(int r1) {
            r0 = this;
            r0.tryRecord()
            io.netty.util.ReferenceCounted r1 = super.retain(r1)
            io.netty.handler.codec.haproxy.HAProxyMessage r1 = (io.netty.handler.codec.haproxy.HAProxyMessage) r1
            return r1
    }

    /* renamed from: retain, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted m183retain() {
            r1 = this;
            io.netty.handler.codec.haproxy.HAProxyMessage r0 = r1.retain()
            return r0
    }

    /* renamed from: retain, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted m184retain(int r1) {
            r0 = this;
            io.netty.handler.codec.haproxy.HAProxyMessage r1 = r0.retain(r1)
            return r1
    }

    public java.lang.String sourceAddress() {
            r1 = this;
            java.lang.String r0 = r1.sourceAddress
            return r0
    }

    public int sourcePort() {
            r1 = this;
            int r0 = r1.sourcePort
            return r0
    }

    public java.util.List<io.netty.handler.codec.haproxy.HAProxyTLV> tlvs() {
            r1 = this;
            java.util.List<io.netty.handler.codec.haproxy.HAProxyTLV> r0 = r1.tlvs
            return r0
    }

    public io.netty.handler.codec.haproxy.HAProxyMessage touch() {
            r1 = this;
            r1.tryRecord()
            io.netty.util.ReferenceCounted r0 = super.touch()
            io.netty.handler.codec.haproxy.HAProxyMessage r0 = (io.netty.handler.codec.haproxy.HAProxyMessage) r0
            return r0
    }

    public io.netty.handler.codec.haproxy.HAProxyMessage touch(java.lang.Object r2) {
            r1 = this;
            io.netty.util.ResourceLeakTracker<io.netty.handler.codec.haproxy.HAProxyMessage> r0 = r1.leak
            if (r0 == 0) goto L7
            r0.record(r2)
        L7:
            return r1
    }

    /* renamed from: touch, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted m185touch() {
            r1 = this;
            io.netty.handler.codec.haproxy.HAProxyMessage r0 = r1.touch()
            return r0
    }

    /* renamed from: touch, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted m186touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.haproxy.HAProxyMessage r1 = r0.touch(r1)
            return r1
    }
}
