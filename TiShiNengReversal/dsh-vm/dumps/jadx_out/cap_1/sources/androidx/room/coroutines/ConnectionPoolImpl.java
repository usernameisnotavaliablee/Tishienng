package androidx.room.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nConnectionPoolImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionPoolImpl.kt\nandroidx/room/coroutines/ConnectionPoolImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,556:1\n1#2:557\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ConnectionPoolImpl implements androidx.room.coroutines.ConnectionPool {

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.atomic.AtomicBoolean _isClosed;

    @org.jetbrains.annotations.NotNull
    private final androidx.sqlite.SQLiteDriver driver;

    @org.jetbrains.annotations.NotNull
    private final androidx.room.coroutines.Pool readers;

    @org.jetbrains.annotations.NotNull
    private final java.lang.ThreadLocal<androidx.room.coroutines.PooledConnectionImpl> threadLocal;
    private boolean throwOnTimeout;
    private long timeout;

    @org.jetbrains.annotations.NotNull
    private final androidx.room.coroutines.Pool writers;

    public ConnectionPoolImpl(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteDriver r3, @org.jetbrains.annotations.NotNull java.lang.String r4) {
            r2 = this;
            java.lang.String r0 = "driver"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "fileName"
            kotlin.jvm.internal.g0.p(r4, r0)
            r2.<init>()
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.threadLocal = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2._isClosed = r0
            kotlin.time.h$a r0 = kotlin.time.h.b
            r0 = 30
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.SECONDS
            long r0 = kotlin.time.j.w(r0, r1)
            r2.timeout = r0
            r2.driver = r3
            androidx.room.coroutines.Pool r0 = new androidx.room.coroutines.Pool
            androidx.room.coroutines.d r1 = new androidx.room.coroutines.d
            r1.<init>(r3, r4)
            r3 = 1
            r0.<init>(r3, r1)
            r2.readers = r0
            r2.writers = r0
            return
    }

    public ConnectionPoolImpl(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteDriver r3, @org.jetbrains.annotations.NotNull java.lang.String r4, int r5, int r6) {
            r2 = this;
            java.lang.String r0 = "driver"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "fileName"
            kotlin.jvm.internal.g0.p(r4, r0)
            r2.<init>()
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.threadLocal = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2._isClosed = r0
            kotlin.time.h$a r0 = kotlin.time.h.b
            r0 = 30
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.SECONDS
            long r0 = kotlin.time.j.w(r0, r1)
            r2.timeout = r0
            if (r5 <= 0) goto L4f
            if (r6 <= 0) goto L47
            r2.driver = r3
            androidx.room.coroutines.Pool r0 = new androidx.room.coroutines.Pool
            androidx.room.coroutines.b r1 = new androidx.room.coroutines.b
            r1.<init>(r3, r4)
            r0.<init>(r5, r1)
            r2.readers = r0
            androidx.room.coroutines.Pool r5 = new androidx.room.coroutines.Pool
            androidx.room.coroutines.c r0 = new androidx.room.coroutines.c
            r0.<init>(r3, r4)
            r5.<init>(r6, r0)
            r2.writers = r5
            return
        L47:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Maximum number of writers must be greater than 0"
            r3.<init>(r4)
            throw r3
        L4f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Maximum number of readers must be greater than 0"
            r3.<init>(r4)
            throw r3
    }

    private static final androidx.sqlite.SQLiteConnection _init_$lambda$0(androidx.sqlite.SQLiteDriver r0, java.lang.String r1) {
            androidx.sqlite.SQLiteConnection r0 = r0.open(r1)
            return r0
    }

    private static final androidx.sqlite.SQLiteConnection _init_$lambda$4(androidx.sqlite.SQLiteDriver r0, java.lang.String r1) {
            androidx.sqlite.SQLiteConnection r0 = r0.open(r1)
            java.lang.String r1 = "PRAGMA query_only = 1"
            androidx.sqlite.SQLite.execSQL(r0, r1)
            return r0
    }

    private static final androidx.sqlite.SQLiteConnection _init_$lambda$5(androidx.sqlite.SQLiteDriver r0, java.lang.String r1) {
            androidx.sqlite.SQLiteConnection r0 = r0.open(r1)
            return r0
    }

    public static /* synthetic */ kotlin.n1 a(androidx.room.coroutines.ConnectionPoolImpl r0, boolean r1) {
            kotlin.n1 r0 = useConnection$lambda$6(r0, r1)
            return r0
    }

    public static /* synthetic */ androidx.sqlite.SQLiteConnection b(androidx.sqlite.SQLiteDriver r0, java.lang.String r1) {
            androidx.sqlite.SQLiteConnection r0 = _init_$lambda$4(r0, r1)
            return r0
    }

    public static /* synthetic */ androidx.sqlite.SQLiteConnection c(androidx.sqlite.SQLiteDriver r0, java.lang.String r1) {
            androidx.sqlite.SQLiteConnection r0 = _init_$lambda$5(r0, r1)
            return r0
    }

    private final kotlin.coroutines.i createConnectionContext(androidx.room.coroutines.PooledConnectionImpl r3) {
            r2 = this;
            androidx.room.coroutines.ConnectionElement r0 = new androidx.room.coroutines.ConnectionElement
            r0.<init>(r3)
            java.lang.ThreadLocal<androidx.room.coroutines.PooledConnectionImpl> r1 = r2.threadLocal
            kotlin.coroutines.i$b r3 = androidx.room.concurrent.ThreadLocal_jvmAndroidKt.asContextElement(r1, r3)
            kotlin.coroutines.i r3 = r0.plus(r3)
            return r3
    }

    public static /* synthetic */ androidx.sqlite.SQLiteConnection d(androidx.sqlite.SQLiteDriver r0, java.lang.String r1) {
            androidx.sqlite.SQLiteConnection r0 = _init_$lambda$0(r0, r1)
            return r0
    }

    private final boolean isClosed() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1._isClosed
            boolean r0 = r0.get()
            return r0
    }

    private final void onTimeout(boolean r4) {
            r3 = this;
            if (r4 == 0) goto L5
            java.lang.String r4 = "reader"
            goto L8
        L5:
            java.lang.String r4 = "writer"
        L8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Timed out attempting to acquire a "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " connection."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.append(r4)
            r4 = 10
            r0.append(r4)
            r0.append(r4)
            java.lang.String r1 = "Writer pool:"
            r0.append(r1)
            r0.append(r4)
            androidx.room.coroutines.Pool r1 = r3.writers
            r1.dump(r0)
            java.lang.String r1 = "Reader pool:"
            r0.append(r1)
            r0.append(r4)
            androidx.room.coroutines.Pool r4 = r3.readers
            r4.dump(r0)
            java.lang.String r4 = r0.toString()
            r0 = 5
            androidx.sqlite.SQLite.throwSQLiteException(r0, r4)     // Catch: android.database.SQLException -> L56
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException     // Catch: android.database.SQLException -> L56
            r4.<init>()     // Catch: android.database.SQLException -> L56
            throw r4     // Catch: android.database.SQLException -> L56
        L56:
            r4 = move-exception
            boolean r0 = r3.throwOnTimeout
            if (r0 != 0) goto L5c
            return
        L5c:
            throw r4
    }

    private static final kotlin.n1 useConnection$lambda$6(androidx.room.coroutines.ConnectionPoolImpl r0, boolean r1) {
            r0.onTimeout(r1)
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    @Override // androidx.room.coroutines.ConnectionPool, java.lang.AutoCloseable
    public void close() {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3._isClosed
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L14
            androidx.room.coroutines.Pool r0 = r3.readers
            r0.close()
            androidx.room.coroutines.Pool r0 = r3.writers
            r0.close()
        L14:
            return
    }

    public final boolean getThrowOnTimeout$room_runtime_release() {
            r1 = this;
            boolean r0 = r1.throwOnTimeout
            return r0
    }

    /* renamed from: getTimeout-UwyO8pc$room_runtime_release, reason: not valid java name */
    public final long m81getTimeoutUwyO8pc$room_runtime_release() {
            r2 = this;
            long r0 = r2.timeout
            return r0
    }

    public final void setThrowOnTimeout$room_runtime_release(boolean r1) {
            r0 = this;
            r0.throwOnTimeout = r1
            return
    }

    /* renamed from: setTimeout-LRDsOJo$room_runtime_release, reason: not valid java name */
    public final void m82setTimeoutLRDsOJo$room_runtime_release(long r1) {
            r0 = this;
            r0.timeout = r1
            return
    }

    @Override // androidx.room.coroutines.ConnectionPool
    @org.jetbrains.annotations.Nullable
    public <R> java.lang.Object useConnection(boolean r13, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.room.Transactor, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r14, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r15) {
            r12 = this;
            boolean r0 = r15 instanceof androidx.room.coroutines.ConnectionPoolImpl$useConnection$1
            if (r0 == 0) goto L13
            r0 = r15
            androidx.room.coroutines.ConnectionPoolImpl$useConnection$1 r0 = (androidx.room.coroutines.ConnectionPoolImpl$useConnection$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.coroutines.ConnectionPoolImpl$useConnection$1 r0 = new androidx.room.coroutines.ConnectionPoolImpl$useConnection$1
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L78
            if (r2 == r6) goto L74
            if (r2 == r5) goto L70
            if (r2 == r4) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r13 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r13 = (kotlin.jvm.internal.Ref.ObjectRef) r13
            java.lang.Object r14 = r0.L$0
            androidx.room.coroutines.Pool r14 = (androidx.room.coroutines.Pool) r14
            kotlin.g0.n(r15)     // Catch: java.lang.Throwable -> L3c
            goto L14f
        L3c:
            r15 = move-exception
            goto L174
        L3f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L47:
            boolean r13 = r0.Z$0
            java.lang.Object r14 = r0.L$5
            kotlin.jvm.internal.Ref$ObjectRef r14 = (kotlin.jvm.internal.Ref.ObjectRef) r14
            java.lang.Object r2 = r0.L$4
            kotlin.coroutines.i r2 = (kotlin.coroutines.i) r2
            java.lang.Object r4 = r0.L$3
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
            java.lang.Object r5 = r0.L$2
            androidx.room.coroutines.Pool r5 = (androidx.room.coroutines.Pool) r5
            java.lang.Object r8 = r0.L$1
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            java.lang.Object r9 = r0.L$0
            androidx.room.coroutines.ConnectionPoolImpl r9 = (androidx.room.coroutines.ConnectionPoolImpl) r9
            kotlin.g0.n(r15)     // Catch: java.lang.Throwable -> L6b
            r11 = r4
            r4 = r15
            r15 = r5
            r5 = r2
            r2 = r11
            goto L111
        L6b:
            r15 = move-exception
            r13 = r4
            r14 = r5
            goto L174
        L70:
            kotlin.g0.n(r15)
            return r15
        L74:
            kotlin.g0.n(r15)
            return r15
        L78:
            kotlin.g0.n(r15)
            boolean r15 = r12.isClosed()
            if (r15 != 0) goto L193
            java.lang.ThreadLocal<androidx.room.coroutines.PooledConnectionImpl> r15 = r12.threadLocal
            java.lang.Object r15 = r15.get()
            androidx.room.coroutines.PooledConnectionImpl r15 = (androidx.room.coroutines.PooledConnectionImpl) r15
            if (r15 != 0) goto L9f
            kotlin.coroutines.i r15 = r0.getContext()
            androidx.room.coroutines.ConnectionElement$Key r2 = androidx.room.coroutines.ConnectionElement.Key
            kotlin.coroutines.i$b r15 = r15.get(r2)
            androidx.room.coroutines.ConnectionElement r15 = (androidx.room.coroutines.ConnectionElement) r15
            if (r15 == 0) goto L9e
            androidx.room.coroutines.PooledConnectionImpl r15 = r15.getConnectionWrapper()
            goto L9f
        L9e:
            r15 = r7
        L9f:
            if (r15 == 0) goto Le0
            if (r13 != 0) goto Lb5
            boolean r13 = r15.isReadOnly()
            if (r13 != 0) goto Laa
            goto Lb5
        Laa:
            java.lang.String r13 = "Cannot upgrade connection from reader to writer"
            androidx.sqlite.SQLite.throwSQLiteException(r6, r13)
            kotlin.KotlinNothingValueException r13 = new kotlin.KotlinNothingValueException
            r13.<init>()
            throw r13
        Lb5:
            kotlin.coroutines.i r13 = r0.getContext()
            androidx.room.coroutines.ConnectionElement$Key r2 = androidx.room.coroutines.ConnectionElement.Key
            kotlin.coroutines.i$b r13 = r13.get(r2)
            if (r13 != 0) goto Ld5
            kotlin.coroutines.i r13 = r12.createConnectionContext(r15)
            androidx.room.coroutines.ConnectionPoolImpl$useConnection$2 r2 = new androidx.room.coroutines.ConnectionPoolImpl$useConnection$2
            r2.<init>(r14, r15, r7)
            r0.label = r6
            java.lang.Object r13 = kotlinx.coroutines.i.h(r13, r2, r0)
            if (r13 != r1) goto Ld4
            goto L14b
        Ld4:
            return r13
        Ld5:
            r0.label = r5
            java.lang.Object r13 = r14.invoke(r15, r0)
            if (r13 != r1) goto Ldf
            goto L14b
        Ldf:
            return r13
        Le0:
            if (r13 == 0) goto Le5
            androidx.room.coroutines.Pool r15 = r12.readers
            goto Le7
        Le5:
            androidx.room.coroutines.Pool r15 = r12.writers
        Le7:
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            kotlin.coroutines.i r5 = r0.getContext()     // Catch: java.lang.Throwable -> L167
            long r8 = r12.timeout     // Catch: java.lang.Throwable -> L167
            androidx.room.coroutines.e r10 = new androidx.room.coroutines.e     // Catch: java.lang.Throwable -> L167
            r10.<init>(r12, r13)     // Catch: java.lang.Throwable -> L167
            r0.L$0 = r12     // Catch: java.lang.Throwable -> L167
            r0.L$1 = r14     // Catch: java.lang.Throwable -> L167
            r0.L$2 = r15     // Catch: java.lang.Throwable -> L167
            r0.L$3 = r2     // Catch: java.lang.Throwable -> L167
            r0.L$4 = r5     // Catch: java.lang.Throwable -> L167
            r0.L$5 = r2     // Catch: java.lang.Throwable -> L167
            r0.Z$0 = r13     // Catch: java.lang.Throwable -> L167
            r0.label = r4     // Catch: java.lang.Throwable -> L167
            java.lang.Object r4 = r15.m83acquireWithTimeoutKLykuaI(r8, r10, r0)     // Catch: java.lang.Throwable -> L167
            if (r4 != r1) goto L10e
            goto L14b
        L10e:
            r9 = r12
            r8 = r14
            r14 = r2
        L111:
            androidx.room.coroutines.ConnectionWithLock r4 = (androidx.room.coroutines.ConnectionWithLock) r4     // Catch: java.lang.Throwable -> L167
            androidx.room.coroutines.ConnectionWithLock r4 = r4.markAcquired(r5)     // Catch: java.lang.Throwable -> L167
            androidx.room.coroutines.Pool r5 = r9.readers     // Catch: java.lang.Throwable -> L167
            androidx.room.coroutines.Pool r10 = r9.writers     // Catch: java.lang.Throwable -> L167
            if (r5 == r10) goto L120
            if (r13 == 0) goto L120
            goto L121
        L120:
            r6 = 0
        L121:
            androidx.room.coroutines.PooledConnectionImpl r13 = new androidx.room.coroutines.PooledConnectionImpl     // Catch: java.lang.Throwable -> L167
            r13.<init>(r4, r6)     // Catch: java.lang.Throwable -> L167
            r14.element = r13     // Catch: java.lang.Throwable -> L167
            java.lang.Object r13 = r2.element     // Catch: java.lang.Throwable -> L167
            if (r13 == 0) goto L16c
            androidx.room.coroutines.PooledConnectionImpl r13 = (androidx.room.coroutines.PooledConnectionImpl) r13     // Catch: java.lang.Throwable -> L167
            kotlin.coroutines.i r13 = r9.createConnectionContext(r13)     // Catch: java.lang.Throwable -> L167
            androidx.room.coroutines.ConnectionPoolImpl$useConnection$4 r14 = new androidx.room.coroutines.ConnectionPoolImpl$useConnection$4     // Catch: java.lang.Throwable -> L167
            r14.<init>(r8, r2, r7)     // Catch: java.lang.Throwable -> L167
            r0.L$0 = r15     // Catch: java.lang.Throwable -> L167
            r0.L$1 = r2     // Catch: java.lang.Throwable -> L167
            r0.L$2 = r7     // Catch: java.lang.Throwable -> L167
            r0.L$3 = r7     // Catch: java.lang.Throwable -> L167
            r0.L$4 = r7     // Catch: java.lang.Throwable -> L167
            r0.L$5 = r7     // Catch: java.lang.Throwable -> L167
            r0.label = r3     // Catch: java.lang.Throwable -> L167
            java.lang.Object r13 = kotlinx.coroutines.i.h(r13, r14, r0)     // Catch: java.lang.Throwable -> L167
            if (r13 != r1) goto L14c
        L14b:
            return r1
        L14c:
            r14 = r15
            r15 = r13
            r13 = r2
        L14f:
            java.lang.Object r13 = r13.element     // Catch: java.lang.Throwable -> L166
            androidx.room.coroutines.PooledConnectionImpl r13 = (androidx.room.coroutines.PooledConnectionImpl) r13     // Catch: java.lang.Throwable -> L166
            if (r13 == 0) goto L166
            r13.markRecycled()     // Catch: java.lang.Throwable -> L166
            androidx.room.coroutines.ConnectionWithLock r0 = r13.getDelegate()     // Catch: java.lang.Throwable -> L166
            r0.markReleased()     // Catch: java.lang.Throwable -> L166
            androidx.room.coroutines.ConnectionWithLock r13 = r13.getDelegate()     // Catch: java.lang.Throwable -> L166
            r14.recycle(r13)     // Catch: java.lang.Throwable -> L166
        L166:
            return r15
        L167:
            r13 = move-exception
            r14 = r15
            r15 = r13
            r13 = r2
            goto L174
        L16c:
            java.lang.String r13 = "Required value was null."
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L167
            r14.<init>(r13)     // Catch: java.lang.Throwable -> L167
            throw r14     // Catch: java.lang.Throwable -> L167
        L174:
            throw r15     // Catch: java.lang.Throwable -> L175
        L175:
            r0 = move-exception
            java.lang.Object r13 = r13.element     // Catch: java.lang.Throwable -> L18e
            androidx.room.coroutines.PooledConnectionImpl r13 = (androidx.room.coroutines.PooledConnectionImpl) r13     // Catch: java.lang.Throwable -> L18e
            if (r13 == 0) goto L192
            r13.markRecycled()     // Catch: java.lang.Throwable -> L18e
            androidx.room.coroutines.ConnectionWithLock r1 = r13.getDelegate()     // Catch: java.lang.Throwable -> L18e
            r1.markReleased()     // Catch: java.lang.Throwable -> L18e
            androidx.room.coroutines.ConnectionWithLock r13 = r13.getDelegate()     // Catch: java.lang.Throwable -> L18e
            r14.recycle(r13)     // Catch: java.lang.Throwable -> L18e
            goto L192
        L18e:
            r13 = move-exception
            kotlin.l.a(r15, r13)
        L192:
            throw r0
        L193:
            r13 = 21
            java.lang.String r14 = "Connection pool is closed"
            androidx.sqlite.SQLite.throwSQLiteException(r13, r14)
            kotlin.KotlinNothingValueException r13 = new kotlin.KotlinNothingValueException
            r13.<init>()
            throw r13
    }
}
