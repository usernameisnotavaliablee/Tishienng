package kotlinx.coroutines.scheduling;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class b extends kotlinx.coroutines.t1 implements java.util.concurrent.Executor {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.scheduling.b b = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.m0 c = null;

    static {
            kotlinx.coroutines.scheduling.b r0 = new kotlinx.coroutines.scheduling.b
            r0.<init>()
            kotlinx.coroutines.scheduling.b.b = r0
            kotlinx.coroutines.scheduling.o r0 = kotlinx.coroutines.scheduling.o.a
            r1 = 64
            int r2 = kotlinx.coroutines.internal.v0.a()
            int r4 = kotlin.ranges.t.u(r1, r2)
            r7 = 12
            r8 = 0
            java.lang.String r3 = "kotlinx.coroutines.io.parallelism"
            r5 = 0
            r6 = 0
            int r1 = kotlinx.coroutines.internal.v0.g(r3, r4, r5, r6, r7, r8)
            kotlinx.coroutines.m0 r0 = r0.limitedParallelism(r1)
            kotlinx.coroutines.scheduling.b.c = r0
            return
    }

    private b() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.t1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot be invoked on Dispatchers.IO"
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlinx.coroutines.m0
    public void dispatch(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r2, @org.jetbrains.annotations.NotNull java.lang.Runnable r3) {
            r1 = this;
            kotlinx.coroutines.m0 r0 = kotlinx.coroutines.scheduling.b.c
            r0.dispatch(r2, r3)
            return
    }

    @Override // kotlinx.coroutines.m0
    @kotlinx.coroutines.InternalCoroutinesApi
    public void dispatchYield(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r2, @org.jetbrains.annotations.NotNull java.lang.Runnable r3) {
            r1 = this;
            kotlinx.coroutines.m0 r0 = kotlinx.coroutines.scheduling.b.c
            r0.dispatchYield(r2, r3)
            return
    }

    @Override // java.util.concurrent.Executor
    public void execute(@org.jetbrains.annotations.NotNull java.lang.Runnable r2) {
            r1 = this;
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            r1.dispatch(r0, r2)
            return
    }

    @Override // kotlinx.coroutines.m0
    @kotlinx.coroutines.ExperimentalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.m0 limitedParallelism(int r2) {
            r1 = this;
            kotlinx.coroutines.scheduling.o r0 = kotlinx.coroutines.scheduling.o.a
            kotlinx.coroutines.m0 r2 = r0.limitedParallelism(r2)
            return r2
    }

    @Override // kotlinx.coroutines.t1
    @org.jetbrains.annotations.NotNull
    public java.util.concurrent.Executor t() {
            r0 = this;
            return r0
    }

    @Override // kotlinx.coroutines.m0
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "Dispatchers.IO"
            return r0
    }
}
