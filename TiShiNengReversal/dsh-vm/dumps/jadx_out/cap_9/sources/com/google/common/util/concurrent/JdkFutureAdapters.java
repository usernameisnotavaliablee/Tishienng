package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class JdkFutureAdapters {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class ListenableFutureAdapter<V> extends com.google.common.util.concurrent.ForwardingFuture<V> implements com.google.common.util.concurrent.ListenableFuture<V> {
        private static final java.util.concurrent.Executor defaultAdapterExecutor = null;
        private static final java.util.concurrent.ThreadFactory threadFactory = null;
        private final java.util.concurrent.Executor adapterExecutor;
        private final java.util.concurrent.Future<V> delegate;
        private final com.google.common.util.concurrent.ExecutionList executionList;
        private final java.util.concurrent.atomic.AtomicBoolean hasListeners;


        static {
                com.google.common.util.concurrent.ThreadFactoryBuilder r0 = new com.google.common.util.concurrent.ThreadFactoryBuilder
                r0.<init>()
                r1 = 1
                com.google.common.util.concurrent.ThreadFactoryBuilder r0 = r0.setDaemon(r1)
                java.lang.String r1 = "ListenableFutureAdapter-thread-%d"
                com.google.common.util.concurrent.ThreadFactoryBuilder r0 = r0.setNameFormat(r1)
                java.util.concurrent.ThreadFactory r0 = r0.build()
                com.google.common.util.concurrent.JdkFutureAdapters.ListenableFutureAdapter.threadFactory = r0
                java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool(r0)
                com.google.common.util.concurrent.JdkFutureAdapters.ListenableFutureAdapter.defaultAdapterExecutor = r0
                return
        }

        ListenableFutureAdapter(java.util.concurrent.Future<V> r2) {
                r1 = this;
                java.util.concurrent.Executor r0 = com.google.common.util.concurrent.JdkFutureAdapters.ListenableFutureAdapter.defaultAdapterExecutor
                r1.<init>(r2, r0)
                return
        }

        ListenableFutureAdapter(java.util.concurrent.Future<V> r3, java.util.concurrent.Executor r4) {
                r2 = this;
                r2.<init>()
                com.google.common.util.concurrent.ExecutionList r0 = new com.google.common.util.concurrent.ExecutionList
                r0.<init>()
                r2.executionList = r0
                java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
                r1 = 0
                r0.<init>(r1)
                r2.hasListeners = r0
                java.lang.Object r3 = com.google.common.base.Preconditions.checkNotNull(r3)
                java.util.concurrent.Future r3 = (java.util.concurrent.Future) r3
                r2.delegate = r3
                java.lang.Object r3 = com.google.common.base.Preconditions.checkNotNull(r4)
                java.util.concurrent.Executor r3 = (java.util.concurrent.Executor) r3
                r2.adapterExecutor = r3
                return
        }

        static /* synthetic */ java.util.concurrent.Future access$000(com.google.common.util.concurrent.JdkFutureAdapters.ListenableFutureAdapter r0) {
                java.util.concurrent.Future<V> r0 = r0.delegate
                return r0
        }

        static /* synthetic */ com.google.common.util.concurrent.ExecutionList access$100(com.google.common.util.concurrent.JdkFutureAdapters.ListenableFutureAdapter r0) {
                com.google.common.util.concurrent.ExecutionList r0 = r0.executionList
                return r0
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public void addListener(java.lang.Runnable r2, java.util.concurrent.Executor r3) {
                r1 = this;
                com.google.common.util.concurrent.ExecutionList r0 = r1.executionList
                r0.add(r2, r3)
                java.util.concurrent.atomic.AtomicBoolean r2 = r1.hasListeners
                r3 = 0
                r0 = 1
                boolean r2 = r2.compareAndSet(r3, r0)
                if (r2 == 0) goto L27
                java.util.concurrent.Future<V> r2 = r1.delegate
                boolean r2 = r2.isDone()
                if (r2 == 0) goto L1d
                com.google.common.util.concurrent.ExecutionList r2 = r1.executionList
                r2.execute()
                return
            L1d:
                java.util.concurrent.Executor r2 = r1.adapterExecutor
                com.google.common.util.concurrent.JdkFutureAdapters$ListenableFutureAdapter$1 r3 = new com.google.common.util.concurrent.JdkFutureAdapters$ListenableFutureAdapter$1
                r3.<init>(r1)
                r2.execute(r3)
            L27:
                return
        }

        @Override // com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
        protected /* bridge */ /* synthetic */ java.lang.Object delegate() {
                r1 = this;
                java.util.concurrent.Future r0 = r1.delegate()
                return r0
        }

        @Override // com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
        protected java.util.concurrent.Future<V> delegate() {
                r1 = this;
                java.util.concurrent.Future<V> r0 = r1.delegate
                return r0
        }
    }

    private JdkFutureAdapters() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <V> com.google.common.util.concurrent.ListenableFuture<V> listenInPoolThread(java.util.concurrent.Future<V> r1) {
            boolean r0 = r1 instanceof com.google.common.util.concurrent.ListenableFuture
            if (r0 == 0) goto L7
            com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
            return r1
        L7:
            com.google.common.util.concurrent.JdkFutureAdapters$ListenableFutureAdapter r0 = new com.google.common.util.concurrent.JdkFutureAdapters$ListenableFutureAdapter
            r0.<init>(r1)
            return r0
    }

    public static <V> com.google.common.util.concurrent.ListenableFuture<V> listenInPoolThread(java.util.concurrent.Future<V> r1, java.util.concurrent.Executor r2) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            boolean r0 = r1 instanceof com.google.common.util.concurrent.ListenableFuture
            if (r0 == 0) goto La
            com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
            return r1
        La:
            com.google.common.util.concurrent.JdkFutureAdapters$ListenableFutureAdapter r0 = new com.google.common.util.concurrent.JdkFutureAdapters$ListenableFutureAdapter
            r0.<init>(r1, r2)
            return r0
    }
}
