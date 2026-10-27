package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class UncaughtExceptionHandlers {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.VisibleForTesting
    static final class Exiter implements java.lang.Thread.UncaughtExceptionHandler {
        private static final java.util.logging.Logger logger = null;
        private final java.lang.Runtime runtime;

        static {
                java.lang.Class<com.google.common.util.concurrent.UncaughtExceptionHandlers$Exiter> r0 = com.google.common.util.concurrent.UncaughtExceptionHandlers.Exiter.class
                java.lang.String r0 = r0.getName()
                java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
                com.google.common.util.concurrent.UncaughtExceptionHandlers.Exiter.logger = r0
                return
        }

        Exiter(java.lang.Runtime r1) {
                r0 = this;
                r0.<init>()
                r0.runtime = r1
                return
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(java.lang.Thread r8, java.lang.Throwable r9) {
                r7 = this;
                r0 = 1
                java.util.logging.Logger r1 = com.google.common.util.concurrent.UncaughtExceptionHandlers.Exiter.logger     // Catch: java.lang.Throwable -> L1b
                java.util.logging.Level r2 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L1b
                java.util.Locale r3 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L1b
                java.lang.String r4 = "Caught an exception in %s.  Shutting down."
                java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L1b
                r6 = 0
                r5[r6] = r8     // Catch: java.lang.Throwable -> L1b
                java.lang.String r8 = java.lang.String.format(r3, r4, r5)     // Catch: java.lang.Throwable -> L1b
                r1.log(r2, r8, r9)     // Catch: java.lang.Throwable -> L1b
            L15:
                java.lang.Runtime r8 = r7.runtime
                r8.exit(r0)
                return
            L1b:
                r8 = move-exception
                java.io.PrintStream r1 = java.lang.System.err     // Catch: java.lang.Throwable -> L2d
                r9.getMessage()     // Catch: java.lang.Throwable -> L2d
                r1.getClass()     // Catch: java.lang.Throwable -> L2d
                java.io.PrintStream r9 = java.lang.System.err     // Catch: java.lang.Throwable -> L2d
                r8.getMessage()     // Catch: java.lang.Throwable -> L2d
                r9.getClass()     // Catch: java.lang.Throwable -> L2d
                goto L15
            L2d:
                r8 = move-exception
                java.lang.Runtime r9 = r7.runtime
                r9.exit(r0)
                throw r8
        }
    }

    private UncaughtExceptionHandlers() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.Thread.UncaughtExceptionHandler systemExit() {
            com.google.common.util.concurrent.UncaughtExceptionHandlers$Exiter r0 = new com.google.common.util.concurrent.UncaughtExceptionHandlers$Exiter
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()
            r0.<init>(r1)
            return r0
    }
}
