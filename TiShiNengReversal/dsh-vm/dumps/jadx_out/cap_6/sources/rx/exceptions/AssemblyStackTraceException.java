package rx.exceptions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class AssemblyStackTraceException extends java.lang.RuntimeException {
    private static final long serialVersionUID = 2038859767182585852L;

    public AssemblyStackTraceException(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static rx.exceptions.AssemblyStackTraceException find(java.lang.Throwable r3) {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
        L5:
            boolean r1 = r3 instanceof rx.exceptions.AssemblyStackTraceException
            if (r1 == 0) goto Lc
            rx.exceptions.AssemblyStackTraceException r3 = (rx.exceptions.AssemblyStackTraceException) r3
            return r3
        Lc:
            r1 = 0
            if (r3 == 0) goto L20
            java.lang.Throwable r2 = r3.getCause()
            if (r2 != 0) goto L16
            goto L20
        L16:
            java.lang.Throwable r3 = r3.getCause()
            boolean r2 = r0.add(r3)
            if (r2 != 0) goto L5
        L20:
            return r1
    }

    public void attachTo(java.lang.Throwable r3) {
            r2 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
        L5:
            java.lang.Throwable r1 = r3.getCause()
            if (r1 != 0) goto L1a
            r3.initCause(r2)     // Catch: java.lang.IllegalStateException -> Lf
            return
        Lf:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Received an exception with a cause set to null, instead of being unset. To fix this, look down the chain of causes. The last exception had a cause explicitly set to null. It should be unset instead."
            r0.<init>(r1, r3)
            rx.plugins.c.I(r0)
            return
        L1a:
            java.lang.Throwable r3 = r3.getCause()
            boolean r1 = r0.add(r3)
            if (r1 != 0) goto L5
            rx.plugins.c.I(r2)
            return
    }

    @Override // java.lang.Throwable
    public synchronized java.lang.Throwable fillInStackTrace() {
            r0 = this;
            monitor-enter(r0)
            monitor-exit(r0)
            return r0
    }
}
