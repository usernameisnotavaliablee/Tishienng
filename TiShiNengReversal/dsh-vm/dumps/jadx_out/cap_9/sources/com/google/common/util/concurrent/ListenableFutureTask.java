package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ListenableFutureTask<V> extends java.util.concurrent.FutureTask<V> implements com.google.common.util.concurrent.ListenableFuture<V> {
    private final com.google.common.util.concurrent.ExecutionList executionList;

    ListenableFutureTask(java.lang.Runnable r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r2) {
            r0 = this;
            r0.<init>(r1, r2)
            com.google.common.util.concurrent.ExecutionList r1 = new com.google.common.util.concurrent.ExecutionList
            r1.<init>()
            r0.executionList = r1
            return
    }

    ListenableFutureTask(java.util.concurrent.Callable<V> r1) {
            r0 = this;
            r0.<init>(r1)
            com.google.common.util.concurrent.ExecutionList r1 = new com.google.common.util.concurrent.ExecutionList
            r1.<init>()
            r0.executionList = r1
            return
    }

    public static <V> com.google.common.util.concurrent.ListenableFutureTask<V> create(java.lang.Runnable r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r2) {
            com.google.common.util.concurrent.ListenableFutureTask r0 = new com.google.common.util.concurrent.ListenableFutureTask
            r0.<init>(r1, r2)
            return r0
    }

    public static <V> com.google.common.util.concurrent.ListenableFutureTask<V> create(java.util.concurrent.Callable<V> r1) {
            com.google.common.util.concurrent.ListenableFutureTask r0 = new com.google.common.util.concurrent.ListenableFutureTask
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(java.lang.Runnable r2, java.util.concurrent.Executor r3) {
            r1 = this;
            com.google.common.util.concurrent.ExecutionList r0 = r1.executionList
            r0.add(r2, r3)
            return
    }

    @Override // java.util.concurrent.FutureTask
    protected void done() {
            r1 = this;
            com.google.common.util.concurrent.ExecutionList r0 = r1.executionList
            r0.execute()
            return
    }
}
