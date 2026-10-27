package androidx.core.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class Pools {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Pool<T> {
        @org.jetbrains.annotations.Nullable
        T acquire();

        boolean release(@org.jetbrains.annotations.NotNull T r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nPools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pools.kt\nandroidx/core/util/Pools$SimplePool\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
    public static class SimplePool<T> implements androidx.core.util.Pools.Pool<T> {

        @org.jetbrains.annotations.NotNull
        private final java.lang.Object[] pool;
        private int poolSize;

        public SimplePool(@androidx.annotation.IntRange(from = 1) int r2) {
                r1 = this;
                r1.<init>()
                if (r2 <= 0) goto La
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r1.pool = r2
                return
            La:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "The max pool size must be > 0"
                r2.<init>(r0)
                throw r2
        }

        private final boolean isInPool(T r5) {
                r4 = this;
                int r0 = r4.poolSize
                r1 = 0
                r2 = 0
            L4:
                if (r2 >= r0) goto L11
                java.lang.Object[] r3 = r4.pool
                r3 = r3[r2]
                if (r3 != r5) goto Le
                r5 = 1
                return r5
            Le:
                int r2 = r2 + 1
                goto L4
            L11:
                return r1
        }

        @Override // androidx.core.util.Pools.Pool
        @org.jetbrains.annotations.Nullable
        public T acquire() {
                r4 = this;
                int r0 = r4.poolSize
                r1 = 0
                if (r0 <= 0) goto L1b
                int r0 = r0 + (-1)
                java.lang.Object[] r2 = r4.pool
                r2 = r2[r0]
                java.lang.String r3 = "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool"
                kotlin.jvm.internal.g0.n(r2, r3)
                java.lang.Object[] r3 = r4.pool
                r3[r0] = r1
                int r0 = r4.poolSize
                int r0 = r0 + (-1)
                r4.poolSize = r0
                return r2
            L1b:
                return r1
        }

        @Override // androidx.core.util.Pools.Pool
        public boolean release(@org.jetbrains.annotations.NotNull T r4) {
                r3 = this;
                java.lang.String r0 = "instance"
                kotlin.jvm.internal.g0.p(r4, r0)
                boolean r0 = r3.isInPool(r4)
                if (r0 != 0) goto L1b
                int r0 = r3.poolSize
                java.lang.Object[] r1 = r3.pool
                int r2 = r1.length
                if (r0 >= r2) goto L19
                r1[r0] = r4
                r4 = 1
                int r0 = r0 + r4
                r3.poolSize = r0
                return r4
            L19:
                r4 = 0
                return r4
            L1b:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "Already in the pool!"
                r4.<init>(r0)
                throw r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nPools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pools.kt\nandroidx/core/util/Pools$SynchronizedPool\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
    public static class SynchronizedPool<T> extends androidx.core.util.Pools.SimplePool<T> {

        @org.jetbrains.annotations.NotNull
        private final java.lang.Object lock;

        public SynchronizedPool(int r1) {
                r0 = this;
                r0.<init>(r1)
                java.lang.Object r1 = new java.lang.Object
                r1.<init>()
                r0.lock = r1
                return
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        @org.jetbrains.annotations.Nullable
        public T acquire() {
                r2 = this;
                java.lang.Object r0 = r2.lock
                monitor-enter(r0)
                java.lang.Object r1 = super.acquire()     // Catch: java.lang.Throwable -> L9
                monitor-exit(r0)
                return r1
            L9:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public boolean release(@org.jetbrains.annotations.NotNull T r2) {
                r1 = this;
                java.lang.String r0 = "instance"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.Object r0 = r1.lock
                monitor-enter(r0)
                boolean r2 = super.release(r2)     // Catch: java.lang.Throwable -> Le
                monitor-exit(r0)
                return r2
            Le:
                r2 = move-exception
                monitor-exit(r0)
                throw r2
        }
    }

    private Pools() {
            r0 = this;
            r0.<init>()
            return
    }
}
