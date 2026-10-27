package com.google.common.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class Closeables {

    @com.google.common.annotations.VisibleForTesting
    static final java.util.logging.Logger logger = null;

    static {
            java.lang.Class<com.google.common.io.Closeables> r0 = com.google.common.io.Closeables.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.common.io.Closeables.logger = r0
            return
    }

    private Closeables() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void close(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.io.Closeable r2, boolean r3) throws java.io.IOException {
            if (r2 != 0) goto L3
            return
        L3:
            r2.close()     // Catch: java.io.IOException -> L7
            return
        L7:
            r2 = move-exception
            if (r3 == 0) goto L14
            java.util.logging.Logger r3 = com.google.common.io.Closeables.logger
            java.util.logging.Level r0 = java.util.logging.Level.WARNING
            java.lang.String r1 = "IOException thrown while closing Closeable."
            r3.log(r0, r1, r2)
            return
        L14:
            throw r2
    }

    public static void closeQuietly(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.io.InputStream r1) {
            r0 = 1
            close(r1, r0)     // Catch: java.io.IOException -> L5
            return
        L5:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
    }

    public static void closeQuietly(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.io.Reader r1) {
            r0 = 1
            close(r1, r0)     // Catch: java.io.IOException -> L5
            return
        L5:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
    }
}
