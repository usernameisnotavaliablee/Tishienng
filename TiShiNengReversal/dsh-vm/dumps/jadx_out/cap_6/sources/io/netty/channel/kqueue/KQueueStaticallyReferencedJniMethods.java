package io.netty.channel.kqueue;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class KQueueStaticallyReferencedJniMethods {
    private KQueueStaticallyReferencedJniMethods() {
            r0 = this;
            r0.<init>()
            return
    }

    static native short evAdd();

    static native short evClear();

    static native short evDelete();

    static native short evDisable();

    static native short evEOF();

    static native short evEnable();

    static native short evError();

    static native short evfiltRead();

    static native short evfiltSock();

    static native short evfiltUser();

    static native short evfiltWrite();

    static native short noteConnReset();

    static native short noteDisconnected();

    static native short noteReadClosed();
}
