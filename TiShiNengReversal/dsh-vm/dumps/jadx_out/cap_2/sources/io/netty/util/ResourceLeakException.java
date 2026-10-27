package io.netty.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class ResourceLeakException extends java.lang.RuntimeException {
    private static final long serialVersionUID = 7186453858343358280L;
    private final java.lang.StackTraceElement[] cachedStackTrace;

    public ResourceLeakException() {
            r1 = this;
            r1.<init>()
            java.lang.StackTraceElement[] r0 = r1.getStackTrace()
            r1.cachedStackTrace = r0
            return
    }

    public ResourceLeakException(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            java.lang.StackTraceElement[] r1 = r0.getStackTrace()
            r0.cachedStackTrace = r1
            return
    }

    public ResourceLeakException(java.lang.String r1, java.lang.Throwable r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.lang.StackTraceElement[] r1 = r0.getStackTrace()
            r0.cachedStackTrace = r1
            return
    }

    public ResourceLeakException(java.lang.Throwable r1) {
            r0 = this;
            r0.<init>(r1)
            java.lang.StackTraceElement[] r1 = r0.getStackTrace()
            r0.cachedStackTrace = r1
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof io.netty.util.ResourceLeakException
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            if (r2 != r1) goto La
            r2 = 1
            return r2
        La:
            java.lang.StackTraceElement[] r0 = r1.cachedStackTrace
            io.netty.util.ResourceLeakException r2 = (io.netty.util.ResourceLeakException) r2
            java.lang.StackTraceElement[] r2 = r2.cachedStackTrace
            boolean r2 = java.util.Arrays.equals(r0, r2)
            return r2
    }

    public int hashCode() {
            r5 = this;
            java.lang.StackTraceElement[] r0 = r5.cachedStackTrace
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L5:
            if (r2 >= r1) goto L13
            r4 = r0[r2]
            int r3 = r3 * 31
            int r4 = r4.hashCode()
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L5
        L13:
            return r3
    }
}
