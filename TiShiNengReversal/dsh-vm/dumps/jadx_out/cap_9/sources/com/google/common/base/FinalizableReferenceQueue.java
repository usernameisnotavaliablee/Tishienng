package com.google.common.base;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class FinalizableReferenceQueue implements java.io.Closeable {
    private static final java.lang.String FINALIZER_CLASS_NAME = "com.google.common.base.internal.Finalizer";
    private static final java.util.logging.Logger logger = null;
    private static final java.lang.reflect.Method startFinalizer = null;
    final java.lang.ref.PhantomReference<java.lang.Object> frqRef;
    final java.lang.ref.ReferenceQueue<java.lang.Object> queue;
    final boolean threadStarted;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class DecoupledLoader implements com.google.common.base.FinalizableReferenceQueue.FinalizerLoader {
        private static final java.lang.String LOADING_ERROR = "Could not load Finalizer in its own class loader. Loading Finalizer in the current class loader instead. As a result, you will not be able to garbage collect this class loader. To support reclaiming this class loader, either resolve the underlying issue, or move Guava to your system class path.";

        DecoupledLoader() {
                r0 = this;
                r0.<init>()
                return
        }

        java.net.URL getBaseUrl() throws java.io.IOException {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = 46
                r2 = 47
                java.lang.String r3 = "com.google.common.base.internal.Finalizer"
                java.lang.String r1 = r3.replace(r1, r2)
                r0.append(r1)
                java.lang.String r1 = ".class"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.Class r1 = r4.getClass()
                java.lang.ClassLoader r1 = r1.getClassLoader()
                java.net.URL r1 = r1.getResource(r0)
                if (r1 == 0) goto L5e
                java.lang.String r2 = r1.toString()
                boolean r3 = r2.endsWith(r0)
                if (r3 == 0) goto L47
                int r3 = r2.length()
                int r0 = r0.length()
                int r3 = r3 - r0
                r0 = 0
                java.lang.String r0 = r2.substring(r0, r3)
                java.net.URL r2 = new java.net.URL
                r2.<init>(r1, r0)
                return r2
            L47:
                java.io.IOException r0 = new java.io.IOException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Unsupported path style: "
                r1.append(r3)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L5e:
                java.io.FileNotFoundException r1 = new java.io.FileNotFoundException
                r1.<init>(r0)
                throw r1
        }

        @Override // com.google.common.base.FinalizableReferenceQueue.FinalizerLoader
        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        public java.lang.Class<?> loadFinalizer() {
                r4 = this;
                java.net.URL r0 = r4.getBaseUrl()     // Catch: java.lang.Exception -> Lf
                java.net.URLClassLoader r0 = r4.newLoader(r0)     // Catch: java.lang.Exception -> Lf
                java.lang.String r1 = "com.google.common.base.internal.Finalizer"
                java.lang.Class r0 = r0.loadClass(r1)     // Catch: java.lang.Exception -> Lf
                return r0
            Lf:
                r0 = move-exception
                java.util.logging.Logger r1 = com.google.common.base.FinalizableReferenceQueue.access$000()
                java.util.logging.Level r2 = java.util.logging.Level.WARNING
                java.lang.String r3 = "Could not load Finalizer in its own class loader. Loading Finalizer in the current class loader instead. As a result, you will not be able to garbage collect this class loader. To support reclaiming this class loader, either resolve the underlying issue, or move Guava to your system class path."
                r1.log(r2, r3, r0)
                r0 = 0
                return r0
        }

        java.net.URLClassLoader newLoader(java.net.URL r4) {
                r3 = this;
                java.net.URLClassLoader r0 = new java.net.URLClassLoader
                r1 = 1
                java.net.URL[] r1 = new java.net.URL[r1]
                r2 = 0
                r1[r2] = r4
                r4 = 0
                r0.<init>(r1, r4)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class DirectLoader implements com.google.common.base.FinalizableReferenceQueue.FinalizerLoader {
        DirectLoader() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.base.FinalizableReferenceQueue.FinalizerLoader
        public java.lang.Class<?> loadFinalizer() {
                r2 = this;
                java.lang.String r0 = "com.google.common.base.internal.Finalizer"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L7
                return r0
            L7:
                r0 = move-exception
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>(r0)
                throw r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface FinalizerLoader {
        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        java.lang.Class<?> loadFinalizer();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class SystemLoader implements com.google.common.base.FinalizableReferenceQueue.FinalizerLoader {

        @com.google.common.annotations.VisibleForTesting
        static boolean disabled;

        SystemLoader() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.base.FinalizableReferenceQueue.FinalizerLoader
        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        public java.lang.Class<?> loadFinalizer() {
                r3 = this;
                boolean r0 = com.google.common.base.FinalizableReferenceQueue.SystemLoader.disabled
                r1 = 0
                if (r0 == 0) goto L6
                return r1
            L6:
                java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.SecurityException -> L14
                if (r0 == 0) goto L13
                java.lang.String r2 = "com.google.common.base.internal.Finalizer"
                java.lang.Class r0 = r0.loadClass(r2)     // Catch: java.lang.ClassNotFoundException -> L13
                return r0
            L13:
                return r1
            L14:
                java.util.logging.Logger r0 = com.google.common.base.FinalizableReferenceQueue.access$000()
                java.lang.String r2 = "Not allowed to access system class loader."
                r0.info(r2)
                return r1
        }
    }

    static {
            java.lang.Class<com.google.common.base.FinalizableReferenceQueue> r0 = com.google.common.base.FinalizableReferenceQueue.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.common.base.FinalizableReferenceQueue.logger = r0
            com.google.common.base.FinalizableReferenceQueue$SystemLoader r0 = new com.google.common.base.FinalizableReferenceQueue$SystemLoader
            r0.<init>()
            com.google.common.base.FinalizableReferenceQueue$DecoupledLoader r1 = new com.google.common.base.FinalizableReferenceQueue$DecoupledLoader
            r1.<init>()
            com.google.common.base.FinalizableReferenceQueue$DirectLoader r2 = new com.google.common.base.FinalizableReferenceQueue$DirectLoader
            r2.<init>()
            r3 = 3
            com.google.common.base.FinalizableReferenceQueue$FinalizerLoader[] r3 = new com.google.common.base.FinalizableReferenceQueue.FinalizerLoader[r3]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r0 = 2
            r3[r0] = r2
            java.lang.Class r0 = loadFinalizer(r3)
            java.lang.reflect.Method r0 = getStartFinalizer(r0)
            com.google.common.base.FinalizableReferenceQueue.startFinalizer = r0
            return
    }

    public FinalizableReferenceQueue() {
            r6 = this;
            r6.<init>()
            java.lang.ref.ReferenceQueue r0 = new java.lang.ref.ReferenceQueue
            r0.<init>()
            r6.queue = r0
            java.lang.ref.PhantomReference r1 = new java.lang.ref.PhantomReference
            r1.<init>(r6, r0)
            r6.frqRef = r1
            r2 = 0
            java.lang.reflect.Method r3 = com.google.common.base.FinalizableReferenceQueue.startFinalizer     // Catch: java.lang.Throwable -> L27 java.lang.IllegalAccessException -> L29
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L27 java.lang.IllegalAccessException -> L29
            java.lang.Class<com.google.common.base.FinalizableReference> r5 = com.google.common.base.FinalizableReference.class
            r4[r2] = r5     // Catch: java.lang.Throwable -> L27 java.lang.IllegalAccessException -> L29
            r5 = 1
            r4[r5] = r0     // Catch: java.lang.Throwable -> L27 java.lang.IllegalAccessException -> L29
            r0 = 2
            r4[r0] = r1     // Catch: java.lang.Throwable -> L27 java.lang.IllegalAccessException -> L29
            r0 = 0
            r3.invoke(r0, r4)     // Catch: java.lang.Throwable -> L27 java.lang.IllegalAccessException -> L29
            r2 = 1
            goto L34
        L27:
            r0 = move-exception
            goto L2b
        L29:
            r0 = move-exception
            goto L37
        L2b:
            java.util.logging.Logger r1 = com.google.common.base.FinalizableReferenceQueue.logger
            java.util.logging.Level r3 = java.util.logging.Level.INFO
            java.lang.String r4 = "Failed to start reference finalizer thread. Reference cleanup will only occur when new references are created."
            r1.log(r3, r4, r0)
        L34:
            r6.threadStarted = r2
            return
        L37:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
    }

    static /* synthetic */ java.util.logging.Logger access$000() {
            java.util.logging.Logger r0 = com.google.common.base.FinalizableReferenceQueue.logger
            return r0
    }

    static java.lang.reflect.Method getStartFinalizer(java.lang.Class<?> r4) {
            java.lang.String r0 = "startFinalizer"
            r1 = 3
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L19
            java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
            r3 = 0
            r1[r3] = r2     // Catch: java.lang.NoSuchMethodException -> L19
            java.lang.Class<java.lang.ref.ReferenceQueue> r2 = java.lang.ref.ReferenceQueue.class
            r3 = 1
            r1[r3] = r2     // Catch: java.lang.NoSuchMethodException -> L19
            java.lang.Class<java.lang.ref.PhantomReference> r2 = java.lang.ref.PhantomReference.class
            r3 = 2
            r1[r3] = r2     // Catch: java.lang.NoSuchMethodException -> L19
            java.lang.reflect.Method r4 = r4.getMethod(r0, r1)     // Catch: java.lang.NoSuchMethodException -> L19
            return r4
        L19:
            r4 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r4)
            throw r0
    }

    private static java.lang.Class<?> loadFinalizer(com.google.common.base.FinalizableReferenceQueue.FinalizerLoader... r3) {
            int r0 = r3.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L10
            r2 = r3[r1]
            java.lang.Class r2 = r2.loadFinalizer()
            if (r2 == 0) goto Ld
            return r2
        Ld:
            int r1 = r1 + 1
            goto L2
        L10:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
    }

    void cleanUp() {
            r4 = this;
            boolean r0 = r4.threadStarted
            if (r0 == 0) goto L5
            goto L21
        L5:
            java.lang.ref.ReferenceQueue<java.lang.Object> r0 = r4.queue
            java.lang.ref.Reference r0 = r0.poll()
            if (r0 == 0) goto L21
            r0.clear()
            com.google.common.base.FinalizableReference r0 = (com.google.common.base.FinalizableReference) r0     // Catch: java.lang.Throwable -> L16
            r0.finalizeReferent()     // Catch: java.lang.Throwable -> L16
            goto L5
        L16:
            r0 = move-exception
            java.util.logging.Logger r1 = com.google.common.base.FinalizableReferenceQueue.logger
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "Error cleaning up after reference."
            r1.log(r2, r3, r0)
            goto L5
        L21:
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            java.lang.ref.PhantomReference<java.lang.Object> r0 = r1.frqRef
            r0.enqueue()
            r1.cleanUp()
            return
    }
}
