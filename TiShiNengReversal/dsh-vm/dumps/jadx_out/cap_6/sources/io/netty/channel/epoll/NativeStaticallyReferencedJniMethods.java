package io.netty.channel.epoll;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class NativeStaticallyReferencedJniMethods {
    private NativeStaticallyReferencedJniMethods() {
            r0 = this;
            r0.<init>()
            return
    }

    static native int epollerr();

    static native int epollet();

    static native int epollin();

    static native int epollout();

    static native int epollrdhup();

    static native int iovMax();

    static native boolean isSupportingSendmmsg();

    static native boolean isSupportingTcpFastopen();

    static native java.lang.String kernelVersion();

    static native long ssizeMax();

    static native int tcpMd5SigMaxKeyLen();

    static native int uioMaxIov();
}
