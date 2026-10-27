package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class CollectionFuture<V, C> extends com.google.common.util.concurrent.AggregateFuture<V, C> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    abstract class CollectionFutureRunningState extends com.google.common.util.concurrent.AggregateFuture<V, C>.RunningState {
        final /* synthetic */ com.google.common.util.concurrent.CollectionFuture this$0;
        private java.util.List<com.google.common.base.Optional<V>> values;

        CollectionFutureRunningState(com.google.common.util.concurrent.CollectionFuture r2, com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> r3, boolean r4) {
                r1 = this;
                r1.this$0 = r2
                r0 = 1
                r1.<init>(r2, r3, r4, r0)
                boolean r2 = r3.isEmpty()
                if (r2 == 0) goto L11
                com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of()
                goto L19
            L11:
                int r2 = r3.size()
                java.util.ArrayList r2 = com.google.common.collect.Lists.newArrayListWithCapacity(r2)
            L19:
                r1.values = r2
                r2 = 0
            L1c:
                int r4 = r3.size()
                if (r2 >= r4) goto L2b
                java.util.List<com.google.common.base.Optional<V>> r4 = r1.values
                r0 = 0
                r4.add(r0)
                int r2 = r2 + 1
                goto L1c
            L2b:
                return
        }

        @Override // com.google.common.util.concurrent.AggregateFuture.RunningState
        final void collectOneValue(boolean r2, int r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl V r4) {
                r1 = this;
                java.util.List<com.google.common.base.Optional<V>> r0 = r1.values
                if (r0 == 0) goto Lc
                com.google.common.base.Optional r2 = com.google.common.base.Optional.fromNullable(r4)
                r0.set(r3, r2)
                return
            Lc:
                if (r2 != 0) goto L19
                com.google.common.util.concurrent.CollectionFuture r2 = r1.this$0
                boolean r2 = r2.isCancelled()
                if (r2 == 0) goto L17
                goto L19
            L17:
                r2 = 0
                goto L1a
            L19:
                r2 = 1
            L1a:
                java.lang.String r3 = "Future was done before all dependencies completed"
                com.google.common.base.Preconditions.checkState(r2, r3)
                return
        }

        abstract C combine(java.util.List<com.google.common.base.Optional<V>> r1);

        @Override // com.google.common.util.concurrent.AggregateFuture.RunningState
        final void handleAllCompleted() {
                r2 = this;
                java.util.List<com.google.common.base.Optional<V>> r0 = r2.values
                if (r0 == 0) goto Le
                com.google.common.util.concurrent.CollectionFuture r1 = r2.this$0
                java.lang.Object r0 = r2.combine(r0)
                r1.set(r0)
                return
            Le:
                com.google.common.util.concurrent.CollectionFuture r0 = r2.this$0
                boolean r0 = r0.isDone()
                com.google.common.base.Preconditions.checkState(r0)
                return
        }

        @Override // com.google.common.util.concurrent.AggregateFuture.RunningState
        void releaseResourcesAfterFailure() {
                r1 = this;
                super.releaseResourcesAfterFailure()
                r0 = 0
                r1.values = r0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class ListFuture<V> extends com.google.common.util.concurrent.CollectionFuture<V, java.util.List<V>> {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private final class ListFutureRunningState extends com.google.common.util.concurrent.CollectionFuture<V, java.util.List<V>>.CollectionFutureRunningState {
            final /* synthetic */ com.google.common.util.concurrent.CollectionFuture.ListFuture this$0;

            ListFutureRunningState(com.google.common.util.concurrent.CollectionFuture.ListFuture r1, com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> r2, boolean r3) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>(r1, r2, r3)
                    return
            }

            @Override // com.google.common.util.concurrent.CollectionFuture.CollectionFutureRunningState
            public /* bridge */ /* synthetic */ java.lang.Object combine(java.util.List r1) {
                    r0 = this;
                    java.util.List r1 = r0.combine(r1)
                    return r1
            }

            @Override // com.google.common.util.concurrent.CollectionFuture.CollectionFutureRunningState
            public java.util.List<V> combine(java.util.List<com.google.common.base.Optional<V>> r3) {
                    r2 = this;
                    int r0 = r3.size()
                    java.util.ArrayList r0 = com.google.common.collect.Lists.newArrayListWithCapacity(r0)
                    java.util.Iterator r3 = r3.iterator()
                Lc:
                    boolean r1 = r3.hasNext()
                    if (r1 == 0) goto L24
                    java.lang.Object r1 = r3.next()
                    com.google.common.base.Optional r1 = (com.google.common.base.Optional) r1
                    if (r1 == 0) goto L1f
                    java.lang.Object r1 = r1.orNull()
                    goto L20
                L1f:
                    r1 = 0
                L20:
                    r0.add(r1)
                    goto Lc
                L24:
                    java.util.List r3 = java.util.Collections.unmodifiableList(r0)
                    return r3
            }
        }

        ListFuture(com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> r2, boolean r3) {
                r1 = this;
                r1.<init>()
                com.google.common.util.concurrent.CollectionFuture$ListFuture$ListFutureRunningState r0 = new com.google.common.util.concurrent.CollectionFuture$ListFuture$ListFutureRunningState
                r0.<init>(r1, r2, r3)
                r1.init(r0)
                return
        }
    }

    CollectionFuture() {
            r0 = this;
            r0.<init>()
            return
    }
}
