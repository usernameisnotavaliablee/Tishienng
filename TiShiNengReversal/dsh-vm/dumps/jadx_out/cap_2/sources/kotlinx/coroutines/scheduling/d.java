package kotlinx.coroutines.scheduling;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.PublishedApi
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/scheduling/ExperimentalCoroutineDispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,213:1\n1#2:214\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class d extends kotlinx.coroutines.t1 {
    private final int b;
    private final int c;
    private final long d;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String e;

    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.scheduling.CoroutineScheduler f;

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility for Ktor 1.0-beta")
    public /* synthetic */ d(int r9, int r10) {
            r8 = this;
            long r3 = kotlinx.coroutines.scheduling.n.e
            r6 = 8
            r7 = 0
            r5 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r0.<init>(r1, r2, r3, r5, r6, r7)
            return
    }

    public /* synthetic */ d(int r1, int r2, int r3, kotlin.jvm.internal.v r4) {
            r0 = this;
            r4 = r3 & 1
            if (r4 == 0) goto L6
            int r1 = kotlinx.coroutines.scheduling.n.c
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            int r2 = kotlinx.coroutines.scheduling.n.d
        Lc:
            r0.<init>(r1, r2)
            return
    }

    public d(int r1, int r2, long r3, @org.jetbrains.annotations.NotNull java.lang.String r5) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.c = r2
            r0.d = r3
            r0.e = r5
            kotlinx.coroutines.scheduling.CoroutineScheduler r1 = r0.w()
            r0.f = r1
            return
    }

    public /* synthetic */ d(int r7, int r8, long r9, java.lang.String r11, int r12, kotlin.jvm.internal.v r13) {
            r6 = this;
            r12 = r12 & 8
            if (r12 == 0) goto L6
            java.lang.String r11 = "CoroutineScheduler"
        L6:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            r0.<init>(r1, r2, r3, r5)
            return
    }

    public d(int r7, int r8, @org.jetbrains.annotations.NotNull java.lang.String r9) {
            r6 = this;
            long r3 = kotlinx.coroutines.scheduling.n.e
            r0 = r6
            r1 = r7
            r2 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r5)
            return
    }

    public /* synthetic */ d(int r1, int r2, java.lang.String r3, int r4, kotlin.jvm.internal.v r5) {
            r0 = this;
            r5 = r4 & 1
            if (r5 == 0) goto L6
            int r1 = kotlinx.coroutines.scheduling.n.c
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lc
            int r2 = kotlinx.coroutines.scheduling.n.d
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L12
            java.lang.String r3 = kotlinx.coroutines.scheduling.n.a
        L12:
            r0.<init>(r1, r2, r3)
            return
    }

    public static /* synthetic */ kotlinx.coroutines.m0 v(kotlinx.coroutines.scheduling.d r0, int r1, int r2, java.lang.Object r3) {
            if (r3 != 0) goto Ld
            r2 = r2 & 1
            if (r2 == 0) goto L8
            r1 = 16
        L8:
            kotlinx.coroutines.m0 r0 = r0.u(r1)
            return r0
        Ld:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: blocking"
            r0.<init>(r1)
            throw r0
    }

    private final kotlinx.coroutines.scheduling.CoroutineScheduler w() {
            r6 = this;
            kotlinx.coroutines.scheduling.CoroutineScheduler r0 = new kotlinx.coroutines.scheduling.CoroutineScheduler
            int r1 = r6.b
            int r2 = r6.c
            long r3 = r6.d
            java.lang.String r5 = r6.e
            r0.<init>(r1, r2, r3, r5)
            return r0
    }

    @Override // kotlinx.coroutines.t1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r1.f
            r0.close()
            return
    }

    @Override // kotlinx.coroutines.m0
    public void dispatch(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r7, @org.jetbrains.annotations.NotNull java.lang.Runnable r8) {
            r6 = this;
            kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r6.f     // Catch: java.util.concurrent.RejectedExecutionException -> Lb
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r1 = r8
            kotlinx.coroutines.scheduling.CoroutineScheduler.n(r0, r1, r2, r3, r4, r5)     // Catch: java.util.concurrent.RejectedExecutionException -> Lc
            return
        Lb:
            r1 = r8
        Lc:
            kotlinx.coroutines.v0 r8 = kotlinx.coroutines.v0.g
            r8.dispatch(r7, r1)
            return
    }

    @Override // kotlinx.coroutines.m0
    public void dispatchYield(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r7, @org.jetbrains.annotations.NotNull java.lang.Runnable r8) {
            r6 = this;
            kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r6.f     // Catch: java.util.concurrent.RejectedExecutionException -> Lb
            r4 = 2
            r5 = 0
            r2 = 0
            r3 = 1
            r1 = r8
            kotlinx.coroutines.scheduling.CoroutineScheduler.n(r0, r1, r2, r3, r4, r5)     // Catch: java.util.concurrent.RejectedExecutionException -> Lc
            return
        Lb:
            r1 = r8
        Lc:
            kotlinx.coroutines.v0 r8 = kotlinx.coroutines.v0.g
            r8.dispatchYield(r7, r1)
            return
    }

    @Override // kotlinx.coroutines.t1
    @org.jetbrains.annotations.NotNull
    public java.util.concurrent.Executor t() {
            r1 = this;
            kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r1.f
            return r0
    }

    @Override // kotlinx.coroutines.m0
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = "[scheduler = "
            r0.append(r1)
            kotlinx.coroutines.scheduling.CoroutineScheduler r1 = r2.f
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.m0 u(int r4) {
            r3 = this;
            if (r4 <= 0) goto La
            kotlinx.coroutines.scheduling.f r0 = new kotlinx.coroutines.scheduling.f
            r1 = 0
            r2 = 1
            r0.<init>(r3, r4, r1, r2)
            return r0
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected positive parallelism level, but have "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public final void x(@org.jetbrains.annotations.NotNull java.lang.Runnable r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.scheduling.k r3, boolean r4) {
            r1 = this;
            kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r1.f     // Catch: java.util.concurrent.RejectedExecutionException -> L6
            r0.m(r2, r3, r4)     // Catch: java.util.concurrent.RejectedExecutionException -> L6
            return
        L6:
            kotlinx.coroutines.v0 r4 = kotlinx.coroutines.v0.g
            kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r1.f
            kotlinx.coroutines.scheduling.j r2 = r0.f(r2, r3)
            r4.W(r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.m0 z(int r4) {
            r3 = this;
            if (r4 <= 0) goto L33
            int r0 = r3.b
            if (r4 > r0) goto Le
            kotlinx.coroutines.scheduling.f r0 = new kotlinx.coroutines.scheduling.f
            r1 = 0
            r2 = 0
            r0.<init>(r3, r4, r1, r2)
            return r0
        Le:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected parallelism level lesser than core pool size ("
            r0.append(r1)
            int r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = "), but have "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L33:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected positive parallelism level, but have "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }
}
