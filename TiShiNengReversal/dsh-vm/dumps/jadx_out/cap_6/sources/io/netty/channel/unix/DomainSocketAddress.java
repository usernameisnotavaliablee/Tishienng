package io.netty.channel.unix;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class DomainSocketAddress extends java.net.SocketAddress {
    private static final long serialVersionUID = -6934618000832236893L;
    private final java.lang.String socketPath;

    public DomainSocketAddress(java.io.File r1) {
            r0 = this;
            java.lang.String r1 = r1.getPath()
            r0.<init>(r1)
            return
    }

    public DomainSocketAddress(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.socketPath = r2
            return
        L8:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "socketPath"
            r2.<init>(r0)
            throw r2
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof io.netty.channel.unix.DomainSocketAddress
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            io.netty.channel.unix.DomainSocketAddress r2 = (io.netty.channel.unix.DomainSocketAddress) r2
            java.lang.String r2 = r2.socketPath
            java.lang.String r0 = r1.socketPath
            boolean r2 = r2.equals(r0)
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.socketPath
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String path() {
            r1 = this;
            java.lang.String r0 = r1.socketPath
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.path()
            return r0
    }
}
