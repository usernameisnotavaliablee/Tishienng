package com.google.common.base.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class Finalizer implements java.lang.Runnable {
    private static final java.lang.String FINALIZABLE_REFERENCE = "com.google.common.base.FinalizableReference";

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    private static final java.lang.reflect.Constructor<java.lang.Thread> bigThreadConstructor = null;

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    private static final java.lang.reflect.Field inheritableThreadLocals = null;
    private static final java.util.logging.Logger logger = null;
    private final java.lang.ref.WeakReference<java.lang.Class<?>> finalizableReferenceClassReference;
    private final java.lang.ref.PhantomReference<java.lang.Object> frqReference;
    private final java.lang.ref.ReferenceQueue<java.lang.Object> queue;

    static {
            java.lang.Class<com.google.common.base.internal.Finalizer> r0 = com.google.common.base.internal.Finalizer.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.common.base.internal.Finalizer.logger = r0
            java.lang.reflect.Constructor r0 = getBigThreadConstructor()
            com.google.common.base.internal.Finalizer.bigThreadConstructor = r0
            if (r0 != 0) goto L19
            java.lang.reflect.Field r0 = getInheritableThreadLocalsField()
            goto L1a
        L19:
            r0 = 0
        L1a:
            com.google.common.base.internal.Finalizer.inheritableThreadLocals = r0
            return
    }

    private Finalizer(java.lang.Class<?> r1, java.lang.ref.ReferenceQueue<java.lang.Object> r2, java.lang.ref.PhantomReference<java.lang.Object> r3) {
            r0 = this;
            r0.<init>()
            r0.queue = r2
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r0.finalizableReferenceClassReference = r2
            r0.frqReference = r3
            return
    }

    private boolean cleanUp(java.lang.ref.Reference<?> r6) {
            r5 = this;
            java.lang.reflect.Method r0 = r5.getFinalizeReferentMethod()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r6.clear()
            java.lang.ref.PhantomReference<java.lang.Object> r2 = r5.frqReference
            if (r6 != r2) goto L10
            return r1
        L10:
            r2 = 0
            r0.invoke(r6, r2)     // Catch: java.lang.Throwable -> L15
            goto L1f
        L15:
            r6 = move-exception
            java.util.logging.Logger r2 = com.google.common.base.internal.Finalizer.logger
            java.util.logging.Level r3 = java.util.logging.Level.SEVERE
            java.lang.String r4 = "Error cleaning up after reference."
            r2.log(r3, r4, r6)
        L1f:
            java.lang.ref.ReferenceQueue<java.lang.Object> r6 = r5.queue
            java.lang.ref.Reference r6 = r6.poll()
            if (r6 != 0) goto L8
            r6 = 1
            return r6
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    private static java.lang.reflect.Constructor<java.lang.Thread> getBigThreadConstructor() {
            java.lang.Class<java.lang.Thread> r0 = java.lang.Thread.class
            r1 = 5
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L23
            java.lang.Class<java.lang.ThreadGroup> r2 = java.lang.ThreadGroup.class
            r3 = 0
            r1[r3] = r2     // Catch: java.lang.Throwable -> L23
            java.lang.Class<java.lang.Runnable> r2 = java.lang.Runnable.class
            r3 = 1
            r1[r3] = r2     // Catch: java.lang.Throwable -> L23
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r3 = 2
            r1[r3] = r2     // Catch: java.lang.Throwable -> L23
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L23
            r3 = 3
            r1[r3] = r2     // Catch: java.lang.Throwable -> L23
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L23
            r3 = 4
            r1[r3] = r2     // Catch: java.lang.Throwable -> L23
            java.lang.reflect.Constructor r0 = r0.getConstructor(r1)     // Catch: java.lang.Throwable -> L23
            return r0
        L23:
            r0 = 0
            return r0
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    private java.lang.reflect.Method getFinalizeReferentMethod() {
            r3 = this;
            java.lang.ref.WeakReference<java.lang.Class<?>> r0 = r3.finalizableReferenceClassReference
            java.lang.Object r0 = r0.get()
            java.lang.Class r0 = (java.lang.Class) r0
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            java.lang.String r2 = "finalizeReferent"
            java.lang.reflect.Method r0 = r0.getMethod(r2, r1)     // Catch: java.lang.NoSuchMethodException -> L13
            return r0
        L13:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    private static java.lang.reflect.Field getInheritableThreadLocalsField() {
            java.lang.Class<java.lang.Thread> r0 = java.lang.Thread.class
            java.lang.String r1 = "inheritableThreadLocals"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> Ld
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> Ld
            return r0
        Ld:
            java.util.logging.Logger r0 = com.google.common.base.internal.Finalizer.logger
            java.util.logging.Level r1 = java.util.logging.Level.INFO
            java.lang.String r2 = "Couldn't access Thread.inheritableThreadLocals. Reference finalizer threads will inherit thread local values."
            r0.log(r1, r2)
            r0 = 0
            return r0
    }

    public static void startFinalizer(java.lang.Class<?> r5, java.lang.ref.ReferenceQueue<java.lang.Object> r6, java.lang.ref.PhantomReference<java.lang.Object> r7) {
            java.lang.String r0 = r5.getName()
            java.lang.String r1 = "com.google.common.base.FinalizableReference"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L68
            com.google.common.base.internal.Finalizer r0 = new com.google.common.base.internal.Finalizer
            r0.<init>(r5, r6, r7)
            java.lang.Class<com.google.common.base.internal.Finalizer> r5 = com.google.common.base.internal.Finalizer.class
            java.lang.String r5 = r5.getName()
            java.lang.reflect.Constructor<java.lang.Thread> r6 = com.google.common.base.internal.Finalizer.bigThreadConstructor
            r7 = 1
            r1 = 0
            if (r6 == 0) goto L47
            r2 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L3d
            r3 = 5
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L3d
            r4 = 0
            r3[r4] = r1     // Catch: java.lang.Throwable -> L3d
            r3[r7] = r0     // Catch: java.lang.Throwable -> L3d
            r4 = 2
            r3[r4] = r5     // Catch: java.lang.Throwable -> L3d
            r4 = 3
            r3[r4] = r2     // Catch: java.lang.Throwable -> L3d
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L3d
            r4 = 4
            r3[r4] = r2     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r6 = r6.newInstance(r3)     // Catch: java.lang.Throwable -> L3d
            java.lang.Thread r6 = (java.lang.Thread) r6     // Catch: java.lang.Throwable -> L3d
            goto L48
        L3d:
            r6 = move-exception
            java.util.logging.Logger r2 = com.google.common.base.internal.Finalizer.logger
            java.util.logging.Level r3 = java.util.logging.Level.INFO
            java.lang.String r4 = "Failed to create a thread without inherited thread-local values"
            r2.log(r3, r4, r6)
        L47:
            r6 = r1
        L48:
            if (r6 != 0) goto L4f
            java.lang.Thread r6 = new java.lang.Thread
            r6.<init>(r1, r0, r5)
        L4f:
            r6.setDaemon(r7)
            java.lang.reflect.Field r5 = com.google.common.base.internal.Finalizer.inheritableThreadLocals     // Catch: java.lang.Throwable -> L5a
            if (r5 == 0) goto L64
            r5.set(r6, r1)     // Catch: java.lang.Throwable -> L5a
            goto L64
        L5a:
            r5 = move-exception
            java.util.logging.Logger r7 = com.google.common.base.internal.Finalizer.logger
            java.util.logging.Level r0 = java.util.logging.Level.INFO
            java.lang.String r1 = "Failed to clear thread local values inherited by reference finalizer thread."
            r7.log(r0, r1, r5)
        L64:
            r6.start()
            return
        L68:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Expected com.google.common.base.FinalizableReference."
            r5.<init>(r6)
            throw r5
    }

    @Override // java.lang.Runnable
    public void run() {
            r1 = this;
        L0:
            java.lang.ref.ReferenceQueue<java.lang.Object> r0 = r1.queue     // Catch: java.lang.InterruptedException -> L0
            java.lang.ref.Reference r0 = r0.remove()     // Catch: java.lang.InterruptedException -> L0
            boolean r0 = r1.cleanUp(r0)     // Catch: java.lang.InterruptedException -> L0
            if (r0 != 0) goto L0
            return
    }
}
