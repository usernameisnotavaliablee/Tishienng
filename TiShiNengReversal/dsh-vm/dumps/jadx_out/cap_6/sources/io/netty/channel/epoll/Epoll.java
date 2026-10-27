package io.netty.channel.epoll;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class Epoll {
    private static final java.lang.Throwable UNAVAILABILITY_CAUSE = null;

    static {
            java.lang.String r0 = "io.netty.transport.noNative"
            r1 = 0
            boolean r0 = io.netty.util.internal.SystemPropertyUtil.getBoolean(r0, r1)
            if (r0 == 0) goto L11
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Native transport was explicit disabled with -Dio.netty.transport.noNative=true"
            r0.<init>(r1)
            goto L32
        L11:
            r0 = 0
            io.netty.channel.unix.FileDescriptor r1 = io.netty.channel.epoll.Native.newEpollCreate()     // Catch: java.lang.Throwable -> L29
            io.netty.channel.unix.FileDescriptor r2 = io.netty.channel.epoll.Native.newEventFd()     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L21
            r1.close()     // Catch: java.lang.Exception -> L20
            goto L21
        L20:
        L21:
            if (r2 == 0) goto L32
            r2.close()     // Catch: java.lang.Exception -> L32
            goto L32
        L27:
            r0 = move-exception
            goto L2d
        L29:
            r1 = move-exception
            r3 = r1
            r1 = r0
            r0 = r3
        L2d:
            if (r1 == 0) goto L32
            r1.close()     // Catch: java.lang.Exception -> L32
        L32:
            io.netty.channel.epoll.Epoll.UNAVAILABILITY_CAUSE = r0
            return
    }

    private Epoll() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void ensureAvailability() {
            java.lang.Throwable r0 = io.netty.channel.epoll.Epoll.UNAVAILABILITY_CAUSE
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.UnsatisfiedLinkError r1 = new java.lang.UnsatisfiedLinkError
            java.lang.String r2 = "failed to load the required native library"
            r1.<init>(r2)
            java.lang.Throwable r0 = r1.initCause(r0)
            java.lang.Error r0 = (java.lang.Error) r0
            throw r0
    }

    public static boolean isAvailable() {
            java.lang.Throwable r0 = io.netty.channel.epoll.Epoll.UNAVAILABILITY_CAUSE
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public static java.lang.Throwable unavailabilityCause() {
            java.lang.Throwable r0 = io.netty.channel.epoll.Epoll.UNAVAILABILITY_CAUSE
            return r0
    }
}
