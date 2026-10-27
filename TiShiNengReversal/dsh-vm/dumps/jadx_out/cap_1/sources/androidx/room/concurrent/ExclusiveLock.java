package androidx.room.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ExclusiveLock {

    @org.jetbrains.annotations.NotNull
    public static final androidx.room.concurrent.ExclusiveLock.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Map<java.lang.String, java.util.concurrent.locks.ReentrantLock> threadLocksMap = null;

    @org.jetbrains.annotations.Nullable
    private final androidx.room.concurrent.FileLock fileLock;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.locks.ReentrantLock threadLock;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nExclusiveLock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExclusiveLock.kt\nandroidx/room/concurrent/ExclusiveLock$Companion\n+ 2 Synchronized.jvmAndroid.kt\nandroidx/room/concurrent/Synchronized_jvmAndroidKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,77:1\n22#2:78\n381#3,7:79\n*S KotlinDebug\n*F\n+ 1 ExclusiveLock.kt\nandroidx/room/concurrent/ExclusiveLock$Companion\n*L\n70#1:78\n71#1:79,7\n*E\n"})
    public static final class Companion {
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

        public static final /* synthetic */ androidx.room.concurrent.FileLock access$getFileLock(androidx.room.concurrent.ExclusiveLock.Companion r0, java.lang.String r1) {
                androidx.room.concurrent.FileLock r0 = r0.getFileLock(r1)
                return r0
        }

        public static final /* synthetic */ java.util.concurrent.locks.ReentrantLock access$getThreadLock(androidx.room.concurrent.ExclusiveLock.Companion r0, java.lang.String r1) {
                java.util.concurrent.locks.ReentrantLock r0 = r0.getThreadLock(r1)
                return r0
        }

        private final androidx.room.concurrent.FileLock getFileLock(java.lang.String r2) {
                r1 = this;
                androidx.room.concurrent.FileLock r0 = new androidx.room.concurrent.FileLock
                r0.<init>(r2)
                return r0
        }

        private final java.util.concurrent.locks.ReentrantLock getThreadLock(java.lang.String r3) {
                r2 = this;
                monitor-enter(r2)
                java.util.Map r0 = androidx.room.concurrent.ExclusiveLock.access$getThreadLocksMap$cp()     // Catch: java.lang.Throwable -> L14
                java.lang.Object r1 = r0.get(r3)     // Catch: java.lang.Throwable -> L14
                if (r1 != 0) goto L16
                java.util.concurrent.locks.ReentrantLock r1 = new java.util.concurrent.locks.ReentrantLock     // Catch: java.lang.Throwable -> L14
                r1.<init>()     // Catch: java.lang.Throwable -> L14
                r0.put(r3, r1)     // Catch: java.lang.Throwable -> L14
                goto L16
            L14:
                r3 = move-exception
                goto L1a
            L16:
                java.util.concurrent.locks.ReentrantLock r1 = (java.util.concurrent.locks.ReentrantLock) r1     // Catch: java.lang.Throwable -> L14
                monitor-exit(r2)
                return r1
            L1a:
                monitor-exit(r2)
                throw r3
        }
    }

    static {
            androidx.room.concurrent.ExclusiveLock$Companion r0 = new androidx.room.concurrent.ExclusiveLock$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.room.concurrent.ExclusiveLock.Companion = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            androidx.room.concurrent.ExclusiveLock.threadLocksMap = r0
            return
    }

    public ExclusiveLock(@org.jetbrains.annotations.NotNull java.lang.String r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "filename"
            kotlin.jvm.internal.g0.p(r3, r0)
            r2.<init>()
            androidx.room.concurrent.ExclusiveLock$Companion r0 = androidx.room.concurrent.ExclusiveLock.Companion
            java.util.concurrent.locks.ReentrantLock r1 = androidx.room.concurrent.ExclusiveLock.Companion.access$getThreadLock(r0, r3)
            r2.threadLock = r1
            if (r4 == 0) goto L17
            androidx.room.concurrent.FileLock r3 = androidx.room.concurrent.ExclusiveLock.Companion.access$getFileLock(r0, r3)
            goto L18
        L17:
            r3 = 0
        L18:
            r2.fileLock = r3
            return
    }

    public static final /* synthetic */ java.util.Map access$getThreadLocksMap$cp() {
            java.util.Map<java.lang.String, java.util.concurrent.locks.ReentrantLock> r0 = androidx.room.concurrent.ExclusiveLock.threadLocksMap
            return r0
    }

    public final <T> T withLock(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1 r4) {
            r2 = this;
            java.lang.String r0 = "onLocked"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "onLockError"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.concurrent.locks.ReentrantLock r0 = r2.threadLock
            r0.lock()
            r0 = 0
            androidx.room.concurrent.FileLock r1 = r2.fileLock     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1a
            r1.lock()     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r3 = move-exception
            goto L35
        L1a:
            r0 = 1
            java.lang.Object r3 = r3.invoke()     // Catch: java.lang.Throwable -> L2c
            androidx.room.concurrent.FileLock r1 = r2.fileLock     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L26
            r1.unlock()     // Catch: java.lang.Throwable -> L18
        L26:
            java.util.concurrent.locks.ReentrantLock r4 = r2.threadLock
            r4.unlock()
            return r3
        L2c:
            r3 = move-exception
            androidx.room.concurrent.FileLock r1 = r2.fileLock     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L34
            r1.unlock()     // Catch: java.lang.Throwable -> L18
        L34:
            throw r3     // Catch: java.lang.Throwable -> L18
        L35:
            if (r0 == 0) goto L3a
            throw r3     // Catch: java.lang.Throwable -> L38
        L38:
            r3 = move-exception
            goto L43
        L3a:
            r4.invoke(r3)     // Catch: java.lang.Throwable -> L38
            kotlin.KotlinNothingValueException r3 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L38
            r3.<init>()     // Catch: java.lang.Throwable -> L38
            throw r3     // Catch: java.lang.Throwable -> L38
        L43:
            java.util.concurrent.locks.ReentrantLock r4 = r2.threadLock
            r4.unlock()
            throw r3
    }
}
