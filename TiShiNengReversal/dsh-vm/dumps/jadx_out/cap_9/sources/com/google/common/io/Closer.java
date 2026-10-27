package com.google.common.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class Closer implements java.io.Closeable {
    private static final com.google.common.io.Closer.Suppressor SUPPRESSOR = null;
    private final java.util.Deque<java.io.Closeable> stack;

    @com.google.common.annotations.VisibleForTesting
    final com.google.common.io.Closer.Suppressor suppressor;

    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    private java.lang.Throwable thrown;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.VisibleForTesting
    static final class LoggingSuppressor implements com.google.common.io.Closer.Suppressor {
        static final com.google.common.io.Closer.LoggingSuppressor INSTANCE = null;

        static {
                com.google.common.io.Closer$LoggingSuppressor r0 = new com.google.common.io.Closer$LoggingSuppressor
                r0.<init>()
                com.google.common.io.Closer.LoggingSuppressor.INSTANCE = r0
                return
        }

        LoggingSuppressor() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.io.Closer.Suppressor
        public void suppress(java.io.Closeable r4, java.lang.Throwable r5, java.lang.Throwable r6) {
                r3 = this;
                java.util.logging.Logger r5 = com.google.common.io.Closeables.logger
                java.util.logging.Level r0 = java.util.logging.Level.WARNING
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Suppressing exception thrown when closing "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r5.log(r0, r4, r6)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.VisibleForTesting
    static final class SuppressingSuppressor implements com.google.common.io.Closer.Suppressor {
        static final com.google.common.io.Closer.SuppressingSuppressor INSTANCE = null;
        static final java.lang.reflect.Method addSuppressed = null;

        static {
                com.google.common.io.Closer$SuppressingSuppressor r0 = new com.google.common.io.Closer$SuppressingSuppressor
                r0.<init>()
                com.google.common.io.Closer.SuppressingSuppressor.INSTANCE = r0
                java.lang.reflect.Method r0 = getAddSuppressed()
                com.google.common.io.Closer.SuppressingSuppressor.addSuppressed = r0
                return
        }

        SuppressingSuppressor() {
                r0 = this;
                r0.<init>()
                return
        }

        private static java.lang.reflect.Method getAddSuppressed() {
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.String r1 = "addSuppressed"
                r2 = 1
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> Lf
                r3 = 0
                r2[r3] = r0     // Catch: java.lang.Throwable -> Lf
                java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> Lf
                return r0
            Lf:
                r0 = 0
                return r0
        }

        static boolean isAvailable() {
                java.lang.reflect.Method r0 = com.google.common.io.Closer.SuppressingSuppressor.addSuppressed
                if (r0 == 0) goto L6
                r0 = 1
                return r0
            L6:
                r0 = 0
                return r0
        }

        @Override // com.google.common.io.Closer.Suppressor
        public void suppress(java.io.Closeable r4, java.lang.Throwable r5, java.lang.Throwable r6) {
                r3 = this;
                if (r5 != r6) goto L3
                return
            L3:
                java.lang.reflect.Method r0 = com.google.common.io.Closer.SuppressingSuppressor.addSuppressed     // Catch: java.lang.Throwable -> Lf
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Lf
                r2 = 0
                r1[r2] = r6     // Catch: java.lang.Throwable -> Lf
                r0.invoke(r5, r1)     // Catch: java.lang.Throwable -> Lf
                return
            Lf:
                com.google.common.io.Closer$LoggingSuppressor r0 = com.google.common.io.Closer.LoggingSuppressor.INSTANCE
                r0.suppress(r4, r5, r6)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.VisibleForTesting
    interface Suppressor {
        void suppress(java.io.Closeable r1, java.lang.Throwable r2, java.lang.Throwable r3);
    }

    static {
            boolean r0 = com.google.common.io.Closer.SuppressingSuppressor.isAvailable()
            if (r0 == 0) goto L9
            com.google.common.io.Closer$SuppressingSuppressor r0 = com.google.common.io.Closer.SuppressingSuppressor.INSTANCE
            goto Lb
        L9:
            com.google.common.io.Closer$LoggingSuppressor r0 = com.google.common.io.Closer.LoggingSuppressor.INSTANCE
        Lb:
            com.google.common.io.Closer.SUPPRESSOR = r0
            return
    }

    @com.google.common.annotations.VisibleForTesting
    Closer(com.google.common.io.Closer.Suppressor r3) {
            r2 = this;
            r2.<init>()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r1 = 4
            r0.<init>(r1)
            r2.stack = r0
            java.lang.Object r3 = com.google.common.base.Preconditions.checkNotNull(r3)
            com.google.common.io.Closer$Suppressor r3 = (com.google.common.io.Closer.Suppressor) r3
            r2.suppressor = r3
            return
    }

    public static com.google.common.io.Closer create() {
            com.google.common.io.Closer r0 = new com.google.common.io.Closer
            com.google.common.io.Closer$Suppressor r1 = com.google.common.io.Closer.SUPPRESSOR
            r0.<init>(r1)
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r4 = this;
            java.lang.Throwable r0 = r4.thrown
        L2:
            java.util.Deque<java.io.Closeable> r1 = r4.stack
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L21
            java.util.Deque<java.io.Closeable> r1 = r4.stack
            java.lang.Object r1 = r1.removeFirst()
            java.io.Closeable r1 = (java.io.Closeable) r1
            r1.close()     // Catch: java.lang.Throwable -> L16
            goto L2
        L16:
            r2 = move-exception
            if (r0 != 0) goto L1b
            r0 = r2
            goto L2
        L1b:
            com.google.common.io.Closer$Suppressor r3 = r4.suppressor
            r3.suppress(r1, r0, r2)
            goto L2
        L21:
            java.lang.Throwable r1 = r4.thrown
            if (r1 != 0) goto L33
            if (r0 != 0) goto L28
            goto L33
        L28:
            java.lang.Class<java.io.IOException> r1 = java.io.IOException.class
            com.google.common.base.Throwables.propagateIfPossible(r0, r1)
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
        L33:
            return
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public <C extends java.io.Closeable> C register(@org.checkerframework.checker.nullness.compatqual.NullableDecl C r2) {
            r1 = this;
            if (r2 == 0) goto L7
            java.util.Deque<java.io.Closeable> r0 = r1.stack
            r0.addFirst(r2)
        L7:
            return r2
    }

    public java.lang.RuntimeException rethrow(java.lang.Throwable r2) throws java.io.IOException {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            r1.thrown = r2
            java.lang.Class<java.io.IOException> r0 = java.io.IOException.class
            com.google.common.base.Throwables.propagateIfPossible(r2, r0)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r2)
            throw r0
    }

    public <X extends java.lang.Exception> java.lang.RuntimeException rethrow(java.lang.Throwable r2, java.lang.Class<X> r3) throws java.io.IOException, java.lang.Exception {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            r1.thrown = r2
            java.lang.Class<java.io.IOException> r0 = java.io.IOException.class
            com.google.common.base.Throwables.propagateIfPossible(r2, r0)
            com.google.common.base.Throwables.propagateIfPossible(r2, r3)
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
    }

    public <X1 extends java.lang.Exception, X2 extends java.lang.Exception> java.lang.RuntimeException rethrow(java.lang.Throwable r2, java.lang.Class<X1> r3, java.lang.Class<X2> r4) throws java.io.IOException, java.lang.Exception, java.lang.Exception {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            r1.thrown = r2
            java.lang.Class<java.io.IOException> r0 = java.io.IOException.class
            com.google.common.base.Throwables.propagateIfPossible(r2, r0)
            com.google.common.base.Throwables.propagateIfPossible(r2, r3, r4)
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
    }
}
