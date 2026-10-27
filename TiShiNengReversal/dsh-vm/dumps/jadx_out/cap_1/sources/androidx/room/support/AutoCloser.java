package androidx.room.support;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAutoCloser.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoCloser.android.kt\nandroidx/room/support/AutoCloser\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,221:1\n1#2:222\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class AutoCloser {

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String BUG_LINK = "https://issuetracker.google.com/issues/new?component=413107&template=1096568";

    @org.jetbrains.annotations.NotNull
    public static final androidx.room.support.AutoCloser.Companion Companion = null;

    @org.jetbrains.annotations.Nullable
    private kotlinx.coroutines.e2 autoCloseJob;
    private final long autoCloseTimeoutInMs;
    private kotlinx.coroutines.r0 coroutineScope;

    @androidx.annotation.GuardedBy("lock")
    @org.jetbrains.annotations.Nullable
    private androidx.sqlite.db.SupportSQLiteDatabase delegateDatabase;
    private androidx.sqlite.db.SupportSQLiteOpenHelper delegateOpenHelper;

    @org.jetbrains.annotations.NotNull
    private java.util.concurrent.atomic.AtomicLong lastDecrementRefCountTimeStamp;

    @org.jetbrains.annotations.NotNull
    private final java.lang.Object lock;
    private boolean manuallyClosed;

    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function0<kotlin.n1> onAutoCloseCallback;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.atomic.AtomicInteger referenceCount;

    @org.jetbrains.annotations.NotNull
    private final androidx.room.support.AutoCloser.Watch watch;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
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
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Watch {
        long getMillis();
    }

    static {
            androidx.room.support.AutoCloser$Companion r0 = new androidx.room.support.AutoCloser$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.room.support.AutoCloser.Companion = r0
            return
    }

    public AutoCloser(long r2, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r4, @org.jetbrains.annotations.NotNull androidx.room.support.AutoCloser.Watch r5) {
            r1 = this;
            java.lang.String r0 = "timeUnit"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "watch"
            kotlin.jvm.internal.g0.p(r5, r0)
            r1.<init>()
            r1.watch = r5
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.lock = r0
            long r2 = r4.toMillis(r2)
            r1.autoCloseTimeoutInMs = r2
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r3 = 0
            r2.<init>(r3)
            r1.referenceCount = r2
            java.util.concurrent.atomic.AtomicLong r2 = new java.util.concurrent.atomic.AtomicLong
            long r3 = r5.getMillis()
            r2.<init>(r3)
            r1.lastDecrementRefCountTimeStamp = r2
            return
    }

    public /* synthetic */ AutoCloser(long r1, java.util.concurrent.TimeUnit r3, androidx.room.support.AutoCloser.Watch r4, int r5, kotlin.jvm.internal.v r6) {
            r0 = this;
            r5 = r5 & 4
            if (r5 == 0) goto L9
            androidx.room.support.a r4 = new androidx.room.support.a
            r4.<init>()
        L9:
            r0.<init>(r1, r3, r4)
            return
    }

    private static final long _init_$lambda$0() {
            long r0 = android.os.SystemClock.uptimeMillis()
            return r0
    }

    public static /* synthetic */ long a() {
            long r0 = _init_$lambda$0()
            return r0
    }

    public static final /* synthetic */ void access$autoCloseDatabase(androidx.room.support.AutoCloser r0) {
            r0.autoCloseDatabase()
            return
    }

    public static final /* synthetic */ long access$getAutoCloseTimeoutInMs$p(androidx.room.support.AutoCloser r2) {
            long r0 = r2.autoCloseTimeoutInMs
            return r0
    }

    private final void autoCloseDatabase() {
            r6 = this;
            java.lang.Object r0 = r6.lock
            monitor-enter(r0)
            androidx.room.support.AutoCloser$Watch r1 = r6.watch     // Catch: java.lang.Throwable -> L37
            long r1 = r1.getMillis()     // Catch: java.lang.Throwable -> L37
            java.util.concurrent.atomic.AtomicLong r3 = r6.lastDecrementRefCountTimeStamp     // Catch: java.lang.Throwable -> L37
            long r3 = r3.get()     // Catch: java.lang.Throwable -> L37
            long r1 = r1 - r3
            long r3 = r6.autoCloseTimeoutInMs     // Catch: java.lang.Throwable -> L37
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L18
            monitor-exit(r0)
            return
        L18:
            java.util.concurrent.atomic.AtomicInteger r1 = r6.referenceCount     // Catch: java.lang.Throwable -> L37
            int r1 = r1.get()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L22
            monitor-exit(r0)
            return
        L22:
            kotlin.jvm.functions.Function0<kotlin.n1> r1 = r6.onAutoCloseCallback     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L40
            r1.invoke()     // Catch: java.lang.Throwable -> L37
            androidx.sqlite.db.SupportSQLiteDatabase r1 = r6.delegateDatabase     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L39
            boolean r2 = r1.isOpen()     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto L39
            r1.close()     // Catch: java.lang.Throwable -> L37
            goto L39
        L37:
            r1 = move-exception
            goto L48
        L39:
            r1 = 0
            r6.delegateDatabase = r1     // Catch: java.lang.Throwable -> L37
            kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L37
            monitor-exit(r0)
            return
        L40:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L37
            java.lang.String r2 = "onAutoCloseCallback is null but it should  have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L37
            throw r1     // Catch: java.lang.Throwable -> L37
        L48:
            monitor-exit(r0)
            throw r1
    }

    public final void closeDatabaseIfOpen() {
            r4 = this;
            java.lang.Object r0 = r4.lock
            monitor-enter(r0)
            r1 = 1
            r4.manuallyClosed = r1     // Catch: java.lang.Throwable -> Lf
            kotlinx.coroutines.e2 r2 = r4.autoCloseJob     // Catch: java.lang.Throwable -> Lf
            r3 = 0
            if (r2 == 0) goto L11
            kotlinx.coroutines.e2.a.b(r2, r3, r1, r3)     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r1 = move-exception
            goto L20
        L11:
            r4.autoCloseJob = r3     // Catch: java.lang.Throwable -> Lf
            androidx.sqlite.db.SupportSQLiteDatabase r1 = r4.delegateDatabase     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L1a
            r1.close()     // Catch: java.lang.Throwable -> Lf
        L1a:
            r4.delegateDatabase = r3     // Catch: java.lang.Throwable -> Lf
            kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return
        L20:
            monitor-exit(r0)
            throw r1
    }

    public final void decrementCountAndScheduleClose() {
            r8 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r8.referenceCount
            int r0 = r0.decrementAndGet()
            if (r0 < 0) goto L32
            java.util.concurrent.atomic.AtomicLong r1 = r8.lastDecrementRefCountTimeStamp
            androidx.room.support.AutoCloser$Watch r2 = r8.watch
            long r2 = r2.getMillis()
            r1.set(r2)
            if (r0 != 0) goto L31
            kotlinx.coroutines.r0 r0 = r8.coroutineScope
            r1 = 0
            if (r0 != 0) goto L21
            java.lang.String r0 = "coroutineScope"
            kotlin.jvm.internal.g0.S(r0)
            r2 = r1
            goto L22
        L21:
            r2 = r0
        L22:
            androidx.room.support.AutoCloser$decrementCountAndScheduleClose$2 r5 = new androidx.room.support.AutoCloser$decrementCountAndScheduleClose$2
            r5.<init>(r8, r1)
            r6 = 3
            r7 = 0
            r3 = 0
            r4 = 0
            kotlinx.coroutines.e2 r0 = kotlinx.coroutines.i.e(r2, r3, r4, r5, r6, r7)
            r8.autoCloseJob = r0
        L31:
            return
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unbalanced reference count."
            r0.<init>(r1)
            throw r0
    }

    public final <V> V executeRefCountingFunction(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.sqlite.db.SupportSQLiteDatabase, ? extends V> r2) {
            r1 = this;
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r1.incrementCountAndEnsureDbIsOpen()     // Catch: java.lang.Throwable -> L11
            java.lang.Object r2 = r2.invoke(r0)     // Catch: java.lang.Throwable -> L11
            r1.decrementCountAndScheduleClose()
            return r2
        L11:
            r2 = move-exception
            r1.decrementCountAndScheduleClose()
            throw r2
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function0<kotlin.n1> getAutoCloseCallbackForTest$room_runtime_release() {
            r1 = this;
            kotlin.jvm.functions.Function0<kotlin.n1> r0 = r1.onAutoCloseCallback
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final androidx.sqlite.db.SupportSQLiteDatabase getDelegateDatabase$room_runtime_release() {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r1.delegateDatabase
            return r0
    }

    public final int getRefCountForTest$room_runtime_release() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.referenceCount
            int r0 = r0.get()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.sqlite.db.SupportSQLiteDatabase incrementCountAndEnsureDbIsOpen() {
            r4 = this;
            kotlinx.coroutines.e2 r0 = r4.autoCloseJob
            r1 = 0
            if (r0 == 0) goto L9
            r2 = 1
            kotlinx.coroutines.e2.a.b(r0, r1, r2, r1)
        L9:
            r4.autoCloseJob = r1
            java.util.concurrent.atomic.AtomicInteger r0 = r4.referenceCount
            r0.incrementAndGet()
            boolean r0 = r4.manuallyClosed
            if (r0 != 0) goto L3a
            java.lang.Object r0 = r4.lock
            monitor-enter(r0)
            androidx.sqlite.db.SupportSQLiteDatabase r2 = r4.delegateDatabase     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto L25
            boolean r3 = r2.isOpen()     // Catch: java.lang.Throwable -> L23
            if (r3 == 0) goto L25
            monitor-exit(r0)
            return r2
        L23:
            r1 = move-exception
            goto L38
        L25:
            androidx.sqlite.db.SupportSQLiteOpenHelper r2 = r4.delegateOpenHelper     // Catch: java.lang.Throwable -> L23
            if (r2 != 0) goto L2f
            java.lang.String r2 = "delegateOpenHelper"
            kotlin.jvm.internal.g0.S(r2)     // Catch: java.lang.Throwable -> L23
            goto L30
        L2f:
            r1 = r2
        L30:
            androidx.sqlite.db.SupportSQLiteDatabase r1 = r1.getWritableDatabase()     // Catch: java.lang.Throwable -> L23
            r4.delegateDatabase = r1     // Catch: java.lang.Throwable -> L23
            monitor-exit(r0)
            return r1
        L38:
            monitor-exit(r0)
            throw r1
        L3a:
            java.lang.String r0 = "Attempting to open already closed database."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
    }

    public final void initCoroutineScope(@org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r2) {
            r1 = this;
            java.lang.String r0 = "coroutineScope"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.coroutineScope = r2
            return
    }

    public final void initOpenHelper(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteOpenHelper r2) {
            r1 = this;
            java.lang.String r0 = "delegateOpenHelper"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r2 instanceof androidx.room.support.AutoClosingRoomOpenHelper
            if (r0 != 0) goto Lc
            r1.delegateOpenHelper = r2
            return
        Lc:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            r2.<init>(r0)
            throw r2
    }

    public final boolean isActive() {
            r1 = this;
            boolean r0 = r1.manuallyClosed
            r0 = r0 ^ 1
            return r0
    }

    public final void setAutoCloseCallback(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.n1> r2) {
            r1 = this;
            java.lang.String r0 = "onAutoClose"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.onAutoCloseCallback = r2
            return
    }

    public final void setDelegateDatabase$room_runtime_release(@org.jetbrains.annotations.Nullable androidx.sqlite.db.SupportSQLiteDatabase r1) {
            r0 = this;
            r0.delegateDatabase = r1
            return
    }
}
