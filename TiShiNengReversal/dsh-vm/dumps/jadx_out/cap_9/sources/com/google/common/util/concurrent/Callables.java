package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class Callables {





    private Callables() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ boolean access$000(java.lang.String r0, java.lang.Thread r1) {
            boolean r0 = trySetName(r0, r1)
            return r0
    }

    @com.google.common.annotations.Beta
    @com.google.common.annotations.GwtIncompatible
    public static <T> com.google.common.util.concurrent.AsyncCallable<T> asAsyncCallable(java.util.concurrent.Callable<T> r1, com.google.common.util.concurrent.ListeningExecutorService r2) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.util.concurrent.Callables$2 r0 = new com.google.common.util.concurrent.Callables$2
            r0.<init>(r2, r1)
            return r0
    }

    public static <T> java.util.concurrent.Callable<T> returning(@org.checkerframework.checker.nullness.compatqual.NullableDecl T r1) {
            com.google.common.util.concurrent.Callables$1 r0 = new com.google.common.util.concurrent.Callables$1
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    static java.lang.Runnable threadRenaming(java.lang.Runnable r1, com.google.common.base.Supplier<java.lang.String> r2) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.util.concurrent.Callables$4 r0 = new com.google.common.util.concurrent.Callables$4
            r0.<init>(r2, r1)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    static <T> java.util.concurrent.Callable<T> threadRenaming(java.util.concurrent.Callable<T> r1, com.google.common.base.Supplier<java.lang.String> r2) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.util.concurrent.Callables$3 r0 = new com.google.common.util.concurrent.Callables$3
            r0.<init>(r2, r1)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    private static boolean trySetName(java.lang.String r0, java.lang.Thread r1) {
            r1.setName(r0)     // Catch: java.lang.SecurityException -> L5
            r0 = 1
            return r0
        L5:
            r0 = 0
            return r0
    }
}
