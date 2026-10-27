package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nTransactionExecutor.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionExecutor.android.kt\nandroidx/room/TransactionExecutor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class TransactionExecutor implements java.util.concurrent.Executor {

    @org.jetbrains.annotations.Nullable
    private java.lang.Runnable active;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.Executor executor;

    @org.jetbrains.annotations.NotNull
    private final java.lang.Object syncLock;

    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayDeque<java.lang.Runnable> tasks;

    public TransactionExecutor(@org.jetbrains.annotations.NotNull java.util.concurrent.Executor r2) {
            r1 = this;
            java.lang.String r0 = "executor"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.executor = r2
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            r1.tasks = r2
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r1.syncLock = r2
            return
    }

    public static /* synthetic */ void a(java.lang.Runnable r0, androidx.room.TransactionExecutor r1) {
            execute$lambda$1$lambda$0(r0, r1)
            return
    }

    private static final void execute$lambda$1$lambda$0(java.lang.Runnable r0, androidx.room.TransactionExecutor r1) {
            r0.run()     // Catch: java.lang.Throwable -> L7
            r1.scheduleNext()
            return
        L7:
            r0 = move-exception
            r1.scheduleNext()
            throw r0
    }

    @Override // java.util.concurrent.Executor
    public void execute(@org.jetbrains.annotations.NotNull java.lang.Runnable r4) {
            r3 = this;
            java.lang.String r0 = "command"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.Object r0 = r3.syncLock
            monitor-enter(r0)
            java.util.ArrayDeque<java.lang.Runnable> r1 = r3.tasks     // Catch: java.lang.Throwable -> L1a
            androidx.room.v r2 = new androidx.room.v     // Catch: java.lang.Throwable -> L1a
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L1a
            r1.offer(r2)     // Catch: java.lang.Throwable -> L1a
            java.lang.Runnable r4 = r3.active     // Catch: java.lang.Throwable -> L1a
            if (r4 != 0) goto L1c
            r3.scheduleNext()     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r4 = move-exception
            goto L20
        L1c:
            kotlin.n1 r4 = kotlin.n1.a     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)
            return
        L20:
            monitor-exit(r0)
            throw r4
    }

    public final void scheduleNext() {
            r3 = this;
            java.lang.Object r0 = r3.syncLock
            monitor-enter(r0)
            java.util.ArrayDeque<java.lang.Runnable> r1 = r3.tasks     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = r1.poll()     // Catch: java.lang.Throwable -> L16
            r2 = r1
            java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch: java.lang.Throwable -> L16
            r3.active = r2     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L18
            java.util.concurrent.Executor r1 = r3.executor     // Catch: java.lang.Throwable -> L16
            r1.execute(r2)     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r1 = move-exception
            goto L1c
        L18:
            kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            return
        L1c:
            monitor-exit(r0)
            throw r1
    }
}
