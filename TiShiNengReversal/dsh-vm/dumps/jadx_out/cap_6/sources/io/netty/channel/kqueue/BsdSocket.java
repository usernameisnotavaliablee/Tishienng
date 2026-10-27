package io.netty.channel.kqueue;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class BsdSocket extends io.netty.channel.unix.Socket {
    private static final int APPLE_SND_LOW_AT_MAX = 131072;
    static final int BSD_SND_LOW_AT_MAX = 0;
    private static final int FREEBSD_SND_LOW_AT_MAX = 32768;

    static {
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = 32768(0x8000, float:4.5918E-41)
            int r0 = java.lang.Math.min(r0, r1)
            io.netty.channel.kqueue.BsdSocket.BSD_SND_LOW_AT_MAX = r0
            return
    }

    BsdSocket(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private static native java.lang.String[] getAcceptFilter(int r0) throws java.io.IOException;

    private static native io.netty.channel.unix.PeerCredentials getPeerCredentials(int r0) throws java.io.IOException;

    private static native int getSndLowAt(int r0) throws java.io.IOException;

    private static native int getTcpNoPush(int r0) throws java.io.IOException;

    public static io.netty.channel.kqueue.BsdSocket newSocketDgram() {
            io.netty.channel.kqueue.BsdSocket r0 = new io.netty.channel.kqueue.BsdSocket
            int r1 = io.netty.channel.unix.Socket.newSocketDgram0()
            r0.<init>(r1)
            return r0
    }

    public static io.netty.channel.kqueue.BsdSocket newSocketDomain() {
            io.netty.channel.kqueue.BsdSocket r0 = new io.netty.channel.kqueue.BsdSocket
            int r1 = io.netty.channel.unix.Socket.newSocketDomain0()
            r0.<init>(r1)
            return r0
    }

    public static io.netty.channel.kqueue.BsdSocket newSocketStream() {
            io.netty.channel.kqueue.BsdSocket r0 = new io.netty.channel.kqueue.BsdSocket
            int r1 = io.netty.channel.unix.Socket.newSocketStream0()
            r0.<init>(r1)
            return r0
    }

    private static native long sendFile(int r0, io.netty.channel.DefaultFileRegion r1, long r2, long r4, long r6) throws java.io.IOException;

    private static native void setAcceptFilter(int r0, java.lang.String r1, java.lang.String r2) throws java.io.IOException;

    private static native void setSndLowAt(int r0, int r1) throws java.io.IOException;

    private static native void setTcpNoPush(int r0, int r1) throws java.io.IOException;

    io.netty.channel.kqueue.AcceptFilter getAcceptFilter() throws java.io.IOException {
            r4 = this;
            int r0 = r4.intValue()
            java.lang.String[] r0 = getAcceptFilter(r0)
            if (r0 != 0) goto Ld
            io.netty.channel.kqueue.AcceptFilter r0 = io.netty.channel.kqueue.AcceptFilter.PLATFORM_UNSUPPORTED
            return r0
        Ld:
            io.netty.channel.kqueue.AcceptFilter r1 = new io.netty.channel.kqueue.AcceptFilter
            r2 = 0
            r2 = r0[r2]
            r3 = 1
            r0 = r0[r3]
            r1.<init>(r2, r0)
            return r1
    }

    io.netty.channel.unix.PeerCredentials getPeerCredentials() throws java.io.IOException {
            r1 = this;
            int r0 = r1.intValue()
            io.netty.channel.unix.PeerCredentials r0 = getPeerCredentials(r0)
            return r0
    }

    int getSndLowAt() throws java.io.IOException {
            r1 = this;
            int r0 = r1.intValue()
            int r0 = getSndLowAt(r0)
            return r0
    }

    boolean isTcpNoPush() throws java.io.IOException {
            r1 = this;
            int r0 = r1.intValue()
            int r0 = getTcpNoPush(r0)
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    long sendFile(io.netty.channel.DefaultFileRegion r9, long r10, long r12, long r14) throws java.io.IOException {
            r8 = this;
            r9.open()
            int r0 = r8.intValue()
            r1 = r9
            r2 = r10
            r4 = r12
            r6 = r14
            long r9 = sendFile(r0, r1, r2, r4, r6)
            r11 = 0
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 < 0) goto L16
            return r9
        L16:
            java.lang.String r11 = "sendfile"
            int r10 = (int) r9
            int r9 = io.netty.channel.unix.Errors.ioResult(r11, r10)
            long r9 = (long) r9
            return r9
    }

    void setAcceptFilter(io.netty.channel.kqueue.AcceptFilter r3) throws java.io.IOException {
            r2 = this;
            int r0 = r2.intValue()
            java.lang.String r1 = r3.filterName()
            java.lang.String r3 = r3.filterArgs()
            setAcceptFilter(r0, r1, r3)
            return
    }

    void setSndLowAt(int r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.intValue()
            setSndLowAt(r0, r2)
            return
    }

    void setTcpNoPush(boolean r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.intValue()
            setTcpNoPush(r0, r2)
            return
    }
}
