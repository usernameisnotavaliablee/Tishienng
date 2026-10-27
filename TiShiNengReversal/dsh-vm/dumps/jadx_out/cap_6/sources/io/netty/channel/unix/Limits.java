package io.netty.channel.unix;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class Limits {
    public static final int IOV_MAX = 0;
    public static final int SIZEOF_JLONG = 0;
    public static final long SSIZE_MAX = 0;
    public static final int UIO_MAX_IOV = 0;

    static {
            int r0 = io.netty.channel.unix.LimitsStaticallyReferencedJniMethods.iovMax()
            io.netty.channel.unix.Limits.IOV_MAX = r0
            int r0 = io.netty.channel.unix.LimitsStaticallyReferencedJniMethods.uioMaxIov()
            io.netty.channel.unix.Limits.UIO_MAX_IOV = r0
            long r0 = io.netty.channel.unix.LimitsStaticallyReferencedJniMethods.ssizeMax()
            io.netty.channel.unix.Limits.SSIZE_MAX = r0
            int r0 = io.netty.channel.unix.LimitsStaticallyReferencedJniMethods.sizeOfjlong()
            io.netty.channel.unix.Limits.SIZEOF_JLONG = r0
            return
    }

    private Limits() {
            r0 = this;
            r0.<init>()
            return
    }
}
