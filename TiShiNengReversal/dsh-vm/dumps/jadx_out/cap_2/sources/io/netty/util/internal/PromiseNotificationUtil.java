package io.netty.util.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class PromiseNotificationUtil {
    private PromiseNotificationUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void tryCancel(io.netty.util.concurrent.Promise<?> r2, io.netty.util.internal.logging.InternalLogger r3) {
            r0 = 0
            boolean r0 = r2.cancel(r0)
            if (r0 != 0) goto L1a
            if (r3 == 0) goto L1a
            java.lang.Throwable r0 = r2.cause()
            if (r0 != 0) goto L15
            java.lang.String r0 = "Failed to cancel promise because it has succeeded already: {}"
            r3.warn(r0, r2)
            return
        L15:
            java.lang.String r1 = "Failed to cancel promise because it has failed already: {}, unnotified cause:"
            r3.warn(r1, r2, r0)
        L1a:
            return
    }

    public static void tryFailure(io.netty.util.concurrent.Promise<?> r3, java.lang.Throwable r4, io.netty.util.internal.logging.InternalLogger r5) {
            boolean r0 = r3.tryFailure(r4)
            if (r0 != 0) goto L29
            if (r5 == 0) goto L29
            java.lang.Throwable r0 = r3.cause()
            if (r0 != 0) goto L14
            java.lang.String r0 = "Failed to mark a promise as failure because it has succeeded already: {}"
            r5.warn(r0, r3, r4)
            return
        L14:
            java.lang.String r0 = io.netty.util.internal.ThrowableUtil.stackTraceToString(r0)
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r0
            r3 = 2
            r1[r3] = r4
            java.lang.String r3 = "Failed to mark a promise as failure because it has failed already: {}, unnotified cause: {}"
            r5.warn(r3, r1)
        L29:
            return
    }

    public static <V> void trySuccess(io.netty.util.concurrent.Promise<? super V> r1, V r2, io.netty.util.internal.logging.InternalLogger r3) {
            boolean r2 = r1.trySuccess(r2)
            if (r2 != 0) goto L19
            if (r3 == 0) goto L19
            java.lang.Throwable r2 = r1.cause()
            if (r2 != 0) goto L14
            java.lang.String r2 = "Failed to mark a promise as success because it has succeeded already: {}"
            r3.warn(r2, r1)
            return
        L14:
            java.lang.String r0 = "Failed to mark a promise as success because it has failed already: {}, unnotified cause:"
            r3.warn(r0, r1, r2)
        L19:
            return
    }
}
