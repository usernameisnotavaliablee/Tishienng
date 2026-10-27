package androidx.sqlite.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nProcessLock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessLock.android.kt\nandroidx/sqlite/util/ProcessLock\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,97:1\n1#2:98\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ProcessLock {

    @org.jetbrains.annotations.NotNull
    private static final androidx.sqlite.util.ProcessLock.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TAG = "SupportSQLiteLock";

    @org.jetbrains.annotations.NotNull
    private static final java.util.Map<java.lang.String, java.util.concurrent.locks.Lock> threadLocksMap = null;

    @org.jetbrains.annotations.Nullable
    private java.nio.channels.FileChannel lockChannel;

    @org.jetbrains.annotations.Nullable
    private final java.io.File lockFile;
    private final boolean processLock;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.locks.Lock threadLock;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nProcessLock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessLock.android.kt\nandroidx/sqlite/util/ProcessLock$Companion\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,97:1\n381#2,7:98\n*S KotlinDebug\n*F\n+ 1 ProcessLock.android.kt\nandroidx/sqlite/util/ProcessLock$Companion\n*L\n93#1:98,7\n*E\n"})
    private static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static final /* synthetic */ java.util.concurrent.locks.Lock access$getThreadLock(androidx.sqlite.util.ProcessLock.Companion r0, java.lang.String r1) {
                java.util.concurrent.locks.Lock r0 = r0.getThreadLock(r1)
                return r0
        }

        private final java.util.concurrent.locks.Lock getThreadLock(java.lang.String r4) {
                r3 = this;
                java.util.Map r0 = androidx.sqlite.util.ProcessLock.access$getThreadLocksMap$cp()
                monitor-enter(r0)
                java.util.Map r1 = androidx.sqlite.util.ProcessLock.access$getThreadLocksMap$cp()     // Catch: java.lang.Throwable -> L18
                java.lang.Object r2 = r1.get(r4)     // Catch: java.lang.Throwable -> L18
                if (r2 != 0) goto L1a
                java.util.concurrent.locks.ReentrantLock r2 = new java.util.concurrent.locks.ReentrantLock     // Catch: java.lang.Throwable -> L18
                r2.<init>()     // Catch: java.lang.Throwable -> L18
                r1.put(r4, r2)     // Catch: java.lang.Throwable -> L18
                goto L1a
            L18:
                r4 = move-exception
                goto L1e
            L1a:
                java.util.concurrent.locks.Lock r2 = (java.util.concurrent.locks.Lock) r2     // Catch: java.lang.Throwable -> L18
                monitor-exit(r0)
                return r2
            L1e:
                monitor-exit(r0)
                throw r4
        }
    }

    static {
            androidx.sqlite.util.ProcessLock$Companion r0 = new androidx.sqlite.util.ProcessLock$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.sqlite.util.ProcessLock.Companion = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.sqlite.util.ProcessLock.threadLocksMap = r0
            return
    }

    public ProcessLock(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.Nullable java.io.File r4, boolean r5) {
            r2 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r3, r0)
            r2.<init>()
            r2.processLock = r5
            if (r4 == 0) goto L23
            java.io.File r5 = new java.io.File
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r1 = ".lck"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r4, r0)
            goto L24
        L23:
            r5 = 0
        L24:
            r2.lockFile = r5
            androidx.sqlite.util.ProcessLock$Companion r4 = androidx.sqlite.util.ProcessLock.Companion
            java.util.concurrent.locks.Lock r3 = androidx.sqlite.util.ProcessLock.Companion.access$getThreadLock(r4, r3)
            r2.threadLock = r3
            return
    }

    public static final /* synthetic */ java.util.Map access$getThreadLocksMap$cp() {
            java.util.Map<java.lang.String, java.util.concurrent.locks.Lock> r0 = androidx.sqlite.util.ProcessLock.threadLocksMap
            return r0
    }

    public static /* synthetic */ void lock$default(androidx.sqlite.util.ProcessLock r0, boolean r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            boolean r1 = r0.processLock
        L6:
            r0.lock(r1)
            return
    }

    public final void lock(boolean r2) {
            r1 = this;
            java.util.concurrent.locks.Lock r0 = r1.threadLock
            r0.lock()
            if (r2 == 0) goto L30
            java.io.File r2 = r1.lockFile     // Catch: java.io.IOException -> L2d
            if (r2 == 0) goto L25
            java.io.File r2 = r2.getParentFile()     // Catch: java.io.IOException -> L2d
            if (r2 == 0) goto L14
            r2.mkdirs()     // Catch: java.io.IOException -> L2d
        L14:
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L2d
            java.io.File r0 = r1.lockFile     // Catch: java.io.IOException -> L2d
            r2.<init>(r0)     // Catch: java.io.IOException -> L2d
            java.nio.channels.FileChannel r2 = r2.getChannel()     // Catch: java.io.IOException -> L2d
            r2.lock()     // Catch: java.io.IOException -> L2d
            r1.lockChannel = r2     // Catch: java.io.IOException -> L2d
            return
        L25:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.io.IOException -> L2d
            java.lang.String r0 = "No lock directory was provided."
            r2.<init>(r0)     // Catch: java.io.IOException -> L2d
            throw r2     // Catch: java.io.IOException -> L2d
        L2d:
            r2 = 0
            r1.lockChannel = r2
        L30:
            return
    }

    public final void unlock() {
            r1 = this;
            java.nio.channels.FileChannel r0 = r1.lockChannel     // Catch: java.io.IOException -> L7
            if (r0 == 0) goto L7
            r0.close()     // Catch: java.io.IOException -> L7
        L7:
            java.util.concurrent.locks.Lock r0 = r1.threadLock
            r0.unlock()
            return
    }
}
