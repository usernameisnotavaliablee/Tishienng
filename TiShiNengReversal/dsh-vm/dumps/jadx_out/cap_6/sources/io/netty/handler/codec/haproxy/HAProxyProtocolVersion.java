package io.netty.handler.codec.haproxy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum HAProxyProtocolVersion extends java.lang.Enum<io.netty.handler.codec.haproxy.HAProxyProtocolVersion> {
    private static final /* synthetic */ io.netty.handler.codec.haproxy.HAProxyProtocolVersion[] $VALUES = null;
    public static final io.netty.handler.codec.haproxy.HAProxyProtocolVersion V1 = null;
    public static final io.netty.handler.codec.haproxy.HAProxyProtocolVersion V2 = null;
    private static final byte VERSION_MASK = -16;
    private final byte byteValue;

    static {
            io.netty.handler.codec.haproxy.HAProxyProtocolVersion r0 = new io.netty.handler.codec.haproxy.HAProxyProtocolVersion
            r1 = 16
            java.lang.String r2 = "V1"
            r3 = 0
            r0.<init>(r2, r3, r1)
            io.netty.handler.codec.haproxy.HAProxyProtocolVersion.V1 = r0
            io.netty.handler.codec.haproxy.HAProxyProtocolVersion r1 = new io.netty.handler.codec.haproxy.HAProxyProtocolVersion
            r2 = 32
            java.lang.String r4 = "V2"
            r5 = 1
            r1.<init>(r4, r5, r2)
            io.netty.handler.codec.haproxy.HAProxyProtocolVersion.V2 = r1
            r2 = 2
            io.netty.handler.codec.haproxy.HAProxyProtocolVersion[] r2 = new io.netty.handler.codec.haproxy.HAProxyProtocolVersion[r2]
            r2[r3] = r0
            r2[r5] = r1
            io.netty.handler.codec.haproxy.HAProxyProtocolVersion.$VALUES = r2
            return
    }

    HAProxyProtocolVersion(java.lang.String r1, int r2, byte r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.byteValue = r3
            return
    }

    public static io.netty.handler.codec.haproxy.HAProxyProtocolVersion valueOf(byte r3) {
            r3 = r3 & (-16)
            byte r0 = (byte) r3
            r1 = 16
            if (r0 == r1) goto L25
            r1 = 32
            if (r0 != r1) goto Le
            io.netty.handler.codec.haproxy.HAProxyProtocolVersion r3 = io.netty.handler.codec.haproxy.HAProxyProtocolVersion.V2
            return r3
        Le:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unknown version: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L25:
            io.netty.handler.codec.haproxy.HAProxyProtocolVersion r3 = io.netty.handler.codec.haproxy.HAProxyProtocolVersion.V1
            return r3
    }

    public static io.netty.handler.codec.haproxy.HAProxyProtocolVersion valueOf(java.lang.String r1) {
            java.lang.Class<io.netty.handler.codec.haproxy.HAProxyProtocolVersion> r0 = io.netty.handler.codec.haproxy.HAProxyProtocolVersion.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.netty.handler.codec.haproxy.HAProxyProtocolVersion r1 = (io.netty.handler.codec.haproxy.HAProxyProtocolVersion) r1
            return r1
    }

    public static io.netty.handler.codec.haproxy.HAProxyProtocolVersion[] values() {
            io.netty.handler.codec.haproxy.HAProxyProtocolVersion[] r0 = io.netty.handler.codec.haproxy.HAProxyProtocolVersion.$VALUES
            java.lang.Object r0 = r0.clone()
            io.netty.handler.codec.haproxy.HAProxyProtocolVersion[] r0 = (io.netty.handler.codec.haproxy.HAProxyProtocolVersion[]) r0
            return r0
    }

    public byte byteValue() {
            r1 = this;
            byte r0 = r1.byteValue
            return r0
    }
}
