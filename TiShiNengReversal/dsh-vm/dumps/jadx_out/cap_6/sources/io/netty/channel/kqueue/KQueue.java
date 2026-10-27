package io.netty.channel.kqueue;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class KQueue {
    private static final java.lang.Throwable UNAVAILABILITY_CAUSE = null;

    static {
            java.lang.String r0 = "io.netty.transport.noNative"
            r1 = 0
            boolean r0 = io.netty.util.internal.SystemPropertyUtil.getBoolean(r0, r1)
            if (r0 == 0) goto L11
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Native transport was explicit disabled with -Dio.netty.transport.noNative=true"
            r0.<init>(r1)
            goto L1d
        L11:
            io.netty.channel.unix.FileDescriptor r0 = io.netty.channel.kqueue.Native.newKQueue()     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1a
            r0.close()     // Catch: java.lang.Exception -> L1a
        L1a:
            r0 = 0
            goto L1d
        L1c:
            r0 = move-exception
        L1d:
            io.netty.channel.kqueue.KQueue.UNAVAILABILITY_CAUSE = r0
            return
    }

    private KQueue() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void ensureAvailability() {
            java.lang.Throwable r0 = io.netty.channel.kqueue.KQueue.UNAVAILABILITY_CAUSE
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
            java.lang.Throwable r0 = io.netty.channel.kqueue.KQueue.UNAVAILABILITY_CAUSE
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public static java.lang.Throwable unavailabilityCause() {
            java.lang.Throwable r0 = io.netty.channel.kqueue.KQueue.UNAVAILABILITY_CAUSE
            return r0
    }
}
