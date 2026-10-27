package io.netty.handler.codec.haproxy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum HAProxyCommand extends java.lang.Enum<io.netty.handler.codec.haproxy.HAProxyCommand> {
    private static final /* synthetic */ io.netty.handler.codec.haproxy.HAProxyCommand[] $VALUES = null;
    private static final byte COMMAND_MASK = 15;
    public static final io.netty.handler.codec.haproxy.HAProxyCommand LOCAL = null;
    public static final io.netty.handler.codec.haproxy.HAProxyCommand PROXY = null;
    private final byte byteValue;

    static {
            io.netty.handler.codec.haproxy.HAProxyCommand r0 = new io.netty.handler.codec.haproxy.HAProxyCommand
            java.lang.String r1 = "LOCAL"
            r2 = 0
            r0.<init>(r1, r2, r2)
            io.netty.handler.codec.haproxy.HAProxyCommand.LOCAL = r0
            io.netty.handler.codec.haproxy.HAProxyCommand r1 = new io.netty.handler.codec.haproxy.HAProxyCommand
            java.lang.String r3 = "PROXY"
            r4 = 1
            r1.<init>(r3, r4, r4)
            io.netty.handler.codec.haproxy.HAProxyCommand.PROXY = r1
            r3 = 2
            io.netty.handler.codec.haproxy.HAProxyCommand[] r3 = new io.netty.handler.codec.haproxy.HAProxyCommand[r3]
            r3[r2] = r0
            r3[r4] = r1
            io.netty.handler.codec.haproxy.HAProxyCommand.$VALUES = r3
            return
    }

    HAProxyCommand(java.lang.String r1, int r2, byte r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.byteValue = r3
            return
    }

    public static io.netty.handler.codec.haproxy.HAProxyCommand valueOf(byte r3) {
            r3 = r3 & 15
            byte r0 = (byte) r3
            if (r0 == 0) goto L22
            r1 = 1
            if (r0 != r1) goto Lb
            io.netty.handler.codec.haproxy.HAProxyCommand r3 = io.netty.handler.codec.haproxy.HAProxyCommand.PROXY
            return r3
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unknown command: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L22:
            io.netty.handler.codec.haproxy.HAProxyCommand r3 = io.netty.handler.codec.haproxy.HAProxyCommand.LOCAL
            return r3
    }

    public static io.netty.handler.codec.haproxy.HAProxyCommand valueOf(java.lang.String r1) {
            java.lang.Class<io.netty.handler.codec.haproxy.HAProxyCommand> r0 = io.netty.handler.codec.haproxy.HAProxyCommand.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.netty.handler.codec.haproxy.HAProxyCommand r1 = (io.netty.handler.codec.haproxy.HAProxyCommand) r1
            return r1
    }

    public static io.netty.handler.codec.haproxy.HAProxyCommand[] values() {
            io.netty.handler.codec.haproxy.HAProxyCommand[] r0 = io.netty.handler.codec.haproxy.HAProxyCommand.$VALUES
            java.lang.Object r0 = r0.clone()
            io.netty.handler.codec.haproxy.HAProxyCommand[] r0 = (io.netty.handler.codec.haproxy.HAProxyCommand[]) r0
            return r0
    }

    public byte byteValue() {
            r1 = this;
            byte r0 = r1.byteValue
            return r0
    }
}
