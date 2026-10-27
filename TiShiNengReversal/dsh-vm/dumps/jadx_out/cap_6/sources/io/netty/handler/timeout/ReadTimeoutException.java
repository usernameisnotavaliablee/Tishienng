package io.netty.handler.timeout;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class ReadTimeoutException extends io.netty.handler.timeout.TimeoutException {
    public static final io.netty.handler.timeout.ReadTimeoutException INSTANCE = null;
    private static final long serialVersionUID = 169287984113283421L;

    static {
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            r1 = 7
            if (r0 < r1) goto Le
            io.netty.handler.timeout.ReadTimeoutException r0 = new io.netty.handler.timeout.ReadTimeoutException
            r1 = 1
            r0.<init>(r1)
            goto L13
        Le:
            io.netty.handler.timeout.ReadTimeoutException r0 = new io.netty.handler.timeout.ReadTimeoutException
            r0.<init>()
        L13:
            io.netty.handler.timeout.ReadTimeoutException.INSTANCE = r0
            return
    }

    ReadTimeoutException() {
            r0 = this;
            r0.<init>()
            return
    }

    private ReadTimeoutException(boolean r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }
}
