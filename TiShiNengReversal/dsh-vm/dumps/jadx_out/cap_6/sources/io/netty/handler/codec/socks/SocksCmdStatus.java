package io.netty.handler.codec.socks;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum SocksCmdStatus extends java.lang.Enum<io.netty.handler.codec.socks.SocksCmdStatus> {
    private static final /* synthetic */ io.netty.handler.codec.socks.SocksCmdStatus[] $VALUES = null;
    public static final io.netty.handler.codec.socks.SocksCmdStatus ADDRESS_NOT_SUPPORTED = null;
    public static final io.netty.handler.codec.socks.SocksCmdStatus COMMAND_NOT_SUPPORTED = null;
    public static final io.netty.handler.codec.socks.SocksCmdStatus FAILURE = null;
    public static final io.netty.handler.codec.socks.SocksCmdStatus FORBIDDEN = null;
    public static final io.netty.handler.codec.socks.SocksCmdStatus HOST_UNREACHABLE = null;
    public static final io.netty.handler.codec.socks.SocksCmdStatus NETWORK_UNREACHABLE = null;
    public static final io.netty.handler.codec.socks.SocksCmdStatus REFUSED = null;
    public static final io.netty.handler.codec.socks.SocksCmdStatus SUCCESS = null;
    public static final io.netty.handler.codec.socks.SocksCmdStatus TTL_EXPIRED = null;
    public static final io.netty.handler.codec.socks.SocksCmdStatus UNASSIGNED = null;
    private final byte b;

    static {
            io.netty.handler.codec.socks.SocksCmdStatus r0 = new io.netty.handler.codec.socks.SocksCmdStatus
            java.lang.String r1 = "SUCCESS"
            r2 = 0
            r0.<init>(r1, r2, r2)
            io.netty.handler.codec.socks.SocksCmdStatus.SUCCESS = r0
            io.netty.handler.codec.socks.SocksCmdStatus r1 = new io.netty.handler.codec.socks.SocksCmdStatus
            java.lang.String r3 = "FAILURE"
            r4 = 1
            r1.<init>(r3, r4, r4)
            io.netty.handler.codec.socks.SocksCmdStatus.FAILURE = r1
            io.netty.handler.codec.socks.SocksCmdStatus r3 = new io.netty.handler.codec.socks.SocksCmdStatus
            java.lang.String r5 = "FORBIDDEN"
            r6 = 2
            r3.<init>(r5, r6, r6)
            io.netty.handler.codec.socks.SocksCmdStatus.FORBIDDEN = r3
            io.netty.handler.codec.socks.SocksCmdStatus r5 = new io.netty.handler.codec.socks.SocksCmdStatus
            java.lang.String r7 = "NETWORK_UNREACHABLE"
            r8 = 3
            r5.<init>(r7, r8, r8)
            io.netty.handler.codec.socks.SocksCmdStatus.NETWORK_UNREACHABLE = r5
            io.netty.handler.codec.socks.SocksCmdStatus r7 = new io.netty.handler.codec.socks.SocksCmdStatus
            java.lang.String r9 = "HOST_UNREACHABLE"
            r10 = 4
            r7.<init>(r9, r10, r10)
            io.netty.handler.codec.socks.SocksCmdStatus.HOST_UNREACHABLE = r7
            io.netty.handler.codec.socks.SocksCmdStatus r9 = new io.netty.handler.codec.socks.SocksCmdStatus
            java.lang.String r11 = "REFUSED"
            r12 = 5
            r9.<init>(r11, r12, r12)
            io.netty.handler.codec.socks.SocksCmdStatus.REFUSED = r9
            io.netty.handler.codec.socks.SocksCmdStatus r11 = new io.netty.handler.codec.socks.SocksCmdStatus
            java.lang.String r13 = "TTL_EXPIRED"
            r14 = 6
            r11.<init>(r13, r14, r14)
            io.netty.handler.codec.socks.SocksCmdStatus.TTL_EXPIRED = r11
            io.netty.handler.codec.socks.SocksCmdStatus r13 = new io.netty.handler.codec.socks.SocksCmdStatus
            java.lang.String r15 = "COMMAND_NOT_SUPPORTED"
            r16 = 0
            r2 = 7
            r13.<init>(r15, r2, r2)
            io.netty.handler.codec.socks.SocksCmdStatus.COMMAND_NOT_SUPPORTED = r13
            io.netty.handler.codec.socks.SocksCmdStatus r15 = new io.netty.handler.codec.socks.SocksCmdStatus
            r17 = 7
            java.lang.String r2 = "ADDRESS_NOT_SUPPORTED"
            r18 = 1
            r4 = 8
            r15.<init>(r2, r4, r4)
            io.netty.handler.codec.socks.SocksCmdStatus.ADDRESS_NOT_SUPPORTED = r15
            io.netty.handler.codec.socks.SocksCmdStatus r2 = new io.netty.handler.codec.socks.SocksCmdStatus
            r19 = 8
            r4 = -1
            r20 = 2
            java.lang.String r6 = "UNASSIGNED"
            r21 = 3
            r8 = 9
            r2.<init>(r6, r8, r4)
            io.netty.handler.codec.socks.SocksCmdStatus.UNASSIGNED = r2
            r4 = 10
            io.netty.handler.codec.socks.SocksCmdStatus[] r4 = new io.netty.handler.codec.socks.SocksCmdStatus[r4]
            r4[r16] = r0
            r4[r18] = r1
            r4[r20] = r3
            r4[r21] = r5
            r4[r10] = r7
            r4[r12] = r9
            r4[r14] = r11
            r4[r17] = r13
            r4[r19] = r15
            r4[r8] = r2
            io.netty.handler.codec.socks.SocksCmdStatus.$VALUES = r4
            return
    }

    SocksCmdStatus(java.lang.String r1, int r2, byte r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.b = r3
            return
    }

    @java.lang.Deprecated
    public static io.netty.handler.codec.socks.SocksCmdStatus fromByte(byte r0) {
            io.netty.handler.codec.socks.SocksCmdStatus r0 = valueOf(r0)
            return r0
    }

    public static io.netty.handler.codec.socks.SocksCmdStatus valueOf(byte r5) {
            io.netty.handler.codec.socks.SocksCmdStatus[] r0 = values()
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            byte r4 = r3.b
            if (r4 != r5) goto Lf
            return r3
        Lf:
            int r2 = r2 + 1
            goto L6
        L12:
            io.netty.handler.codec.socks.SocksCmdStatus r5 = io.netty.handler.codec.socks.SocksCmdStatus.UNASSIGNED
            return r5
    }

    public static io.netty.handler.codec.socks.SocksCmdStatus valueOf(java.lang.String r1) {
            java.lang.Class<io.netty.handler.codec.socks.SocksCmdStatus> r0 = io.netty.handler.codec.socks.SocksCmdStatus.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.netty.handler.codec.socks.SocksCmdStatus r1 = (io.netty.handler.codec.socks.SocksCmdStatus) r1
            return r1
    }

    public static io.netty.handler.codec.socks.SocksCmdStatus[] values() {
            io.netty.handler.codec.socks.SocksCmdStatus[] r0 = io.netty.handler.codec.socks.SocksCmdStatus.$VALUES
            java.lang.Object r0 = r0.clone()
            io.netty.handler.codec.socks.SocksCmdStatus[] r0 = (io.netty.handler.codec.socks.SocksCmdStatus[]) r0
            return r0
    }

    public byte byteValue() {
            r1 = this;
            byte r0 = r1.b
            return r0
    }
}
