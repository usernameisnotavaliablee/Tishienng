package io.netty.channel.unix;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class UnixChannelUtil {
    private UnixChannelUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.net.InetSocketAddress computeRemoteAddr(java.net.InetSocketAddress r2, java.net.InetSocketAddress r3) {
            if (r3 == 0) goto L24
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            r1 = 7
            if (r0 < r1) goto L23
            java.net.InetSocketAddress r0 = new java.net.InetSocketAddress     // Catch: java.net.UnknownHostException -> L23
            java.lang.String r2 = r2.getHostString()     // Catch: java.net.UnknownHostException -> L23
            java.net.InetAddress r1 = r3.getAddress()     // Catch: java.net.UnknownHostException -> L23
            byte[] r1 = r1.getAddress()     // Catch: java.net.UnknownHostException -> L23
            java.net.InetAddress r2 = java.net.InetAddress.getByAddress(r2, r1)     // Catch: java.net.UnknownHostException -> L23
            int r1 = r3.getPort()     // Catch: java.net.UnknownHostException -> L23
            r0.<init>(r2, r1)     // Catch: java.net.UnknownHostException -> L23
            return r0
        L23:
            return r3
        L24:
            return r2
    }

    public static boolean isBufferCopyNeededForWrite(io.netty.buffer.ByteBuf r1) {
            int r0 = io.netty.channel.unix.Limits.IOV_MAX
            boolean r1 = isBufferCopyNeededForWrite(r1, r0)
            return r1
    }

    static boolean isBufferCopyNeededForWrite(io.netty.buffer.ByteBuf r1, int r2) {
            boolean r0 = r1.hasMemoryAddress()
            if (r0 != 0) goto L14
            boolean r0 = r1.isDirect()
            if (r0 == 0) goto L12
            int r1 = r1.nioBufferCount()
            if (r1 <= r2) goto L14
        L12:
            r1 = 1
            return r1
        L14:
            r1 = 0
            return r1
    }
}
