package kotlinx.coroutines.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class e {

    @org.jetbrains.annotations.Nullable
    private static final java.lang.reflect.Method a = null;

    static {
            java.lang.Class<java.util.concurrent.ScheduledThreadPoolExecutor> r0 = java.util.concurrent.ScheduledThreadPoolExecutor.class
            java.lang.String r1 = "setRemoveOnCancelPolicy"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L11
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L11
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Throwable -> L11
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L11
            goto L12
        L11:
            r0 = 0
        L12:
            kotlinx.coroutines.internal.e.a = r0
            return
    }

    public static /* synthetic */ void a() {
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <E> java.util.Set<E> b(int r1) {
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r0.<init>(r1)
            java.util.Set r1 = java.util.Collections.newSetFromMap(r0)
            return r1
    }

    public static final boolean c(@org.jetbrains.annotations.NotNull java.util.concurrent.Executor r5) {
            r0 = 0
            boolean r1 = r5 instanceof java.util.concurrent.ScheduledThreadPoolExecutor     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L8
            java.util.concurrent.ScheduledThreadPoolExecutor r5 = (java.util.concurrent.ScheduledThreadPoolExecutor) r5     // Catch: java.lang.Throwable -> L1c
            goto L9
        L8:
            r5 = 0
        L9:
            if (r5 != 0) goto Lc
            return r0
        Lc:
            java.lang.reflect.Method r1 = kotlinx.coroutines.internal.e.a     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L11
            return r0
        L11:
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1c
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1c
            r3[r0] = r4     // Catch: java.lang.Throwable -> L1c
            r1.invoke(r5, r3)     // Catch: java.lang.Throwable -> L1c
            return r2
        L1c:
            return r0
    }

    public static final <T> T d(@org.jetbrains.annotations.NotNull java.util.concurrent.locks.ReentrantLock r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r2) {
            r1.lock()
            r0 = 1
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> L12
            kotlin.jvm.internal.d0.d(r0)
            r1.unlock()
            kotlin.jvm.internal.d0.c(r0)
            return r2
        L12:
            r2 = move-exception
            kotlin.jvm.internal.d0.d(r0)
            r1.unlock()
            kotlin.jvm.internal.d0.c(r0)
            throw r2
    }
}
