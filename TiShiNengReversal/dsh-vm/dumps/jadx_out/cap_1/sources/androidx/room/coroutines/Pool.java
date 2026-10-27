package androidx.room.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nConnectionPoolImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionPoolImpl.kt\nandroidx/room/coroutines/Pool\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ReentrantLock.kt\nandroidx/room/concurrent/ReentrantLockKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,556:1\n1#2:557\n28#3,5:558\n28#3,5:563\n28#3,3:568\n32#3:573\n28#3,3:574\n32#3:580\n13402#4,2:571\n13467#4,3:577\n*S KotlinDebug\n*F\n+ 1 ConnectionPoolImpl.kt\nandroidx/room/coroutines/Pool\n*L\n233#1:558,5\n259#1:563,5\n264#1:568,3\n264#1:573\n272#1:574,3\n272#1:580\n266#1:571,2\n285#1:577,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class Pool {

    @org.jetbrains.annotations.NotNull
    private final androidx.collection.CircularArray<androidx.room.coroutines.ConnectionWithLock> availableConnections;
    private final int capacity;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function0<androidx.sqlite.SQLiteConnection> connectionFactory;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.sync.d connectionPermits;

    @org.jetbrains.annotations.NotNull
    private final androidx.room.coroutines.ConnectionWithLock[] connections;
    private boolean isClosed;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.locks.ReentrantLock lock;
    private int size;

    public Pool(int r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends androidx.sqlite.SQLiteConnection> r4) {
            r2 = this;
            java.lang.String r0 = "connectionFactory"
            kotlin.jvm.internal.g0.p(r4, r0)
            r2.<init>()
            r2.capacity = r3
            r2.connectionFactory = r4
            java.util.concurrent.locks.ReentrantLock r4 = new java.util.concurrent.locks.ReentrantLock
            r4.<init>()
            r2.lock = r4
            androidx.room.coroutines.ConnectionWithLock[] r4 = new androidx.room.coroutines.ConnectionWithLock[r3]
            r2.connections = r4
            r4 = 2
            r0 = 0
            r1 = 0
            kotlinx.coroutines.sync.d r4 = kotlinx.coroutines.sync.f.b(r3, r1, r4, r0)
            r2.connectionPermits = r4
            androidx.collection.CircularArray r4 = new androidx.collection.CircularArray
            r4.<init>(r3)
            r2.availableConnections = r4
            return
    }

    private final void tryOpenNewConnectionLocked() {
            r4 = this;
            int r0 = r4.size
            int r1 = r4.capacity
            if (r0 < r1) goto L7
            return
        L7:
            androidx.room.coroutines.ConnectionWithLock r0 = new androidx.room.coroutines.ConnectionWithLock
            kotlin.jvm.functions.Function0<androidx.sqlite.SQLiteConnection> r1 = r4.connectionFactory
            java.lang.Object r1 = r1.invoke()
            androidx.sqlite.SQLiteConnection r1 = (androidx.sqlite.SQLiteConnection) r1
            r2 = 2
            r3 = 0
            r0.<init>(r1, r3, r2, r3)
            androidx.room.coroutines.ConnectionWithLock[] r1 = r4.connections
            int r2 = r4.size
            int r3 = r2 + 1
            r4.size = r3
            r1[r2] = r0
            androidx.collection.CircularArray<androidx.room.coroutines.ConnectionWithLock> r1 = r4.availableConnections
            r1.addLast(r0)
            return
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object acquire(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super androidx.room.coroutines.ConnectionWithLock> r5) {
            r4 = this;
            boolean r0 = r5 instanceof androidx.room.coroutines.Pool$acquire$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.room.coroutines.Pool$acquire$1 r0 = (androidx.room.coroutines.Pool$acquire$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.coroutines.Pool$acquire$1 r0 = new androidx.room.coroutines.Pool$acquire$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            androidx.room.coroutines.Pool r0 = (androidx.room.coroutines.Pool) r0
            kotlin.g0.n(r5)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.g0.n(r5)
            kotlinx.coroutines.sync.d r5 = r4.connectionPermits
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.c(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            java.util.concurrent.locks.ReentrantLock r5 = r0.lock     // Catch: java.lang.Throwable -> L69
            r5.lock()     // Catch: java.lang.Throwable -> L69
            boolean r1 = r0.isClosed     // Catch: java.lang.Throwable -> L5b
            if (r1 != 0) goto L6b
            androidx.collection.CircularArray<androidx.room.coroutines.ConnectionWithLock> r1 = r0.availableConnections     // Catch: java.lang.Throwable -> L5b
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L5d
            r0.tryOpenNewConnectionLocked()     // Catch: java.lang.Throwable -> L5b
            goto L5d
        L5b:
            r1 = move-exception
            goto L78
        L5d:
            androidx.collection.CircularArray<androidx.room.coroutines.ConnectionWithLock> r1 = r0.availableConnections     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r1 = r1.popFirst()     // Catch: java.lang.Throwable -> L5b
            androidx.room.coroutines.ConnectionWithLock r1 = (androidx.room.coroutines.ConnectionWithLock) r1     // Catch: java.lang.Throwable -> L5b
            r5.unlock()     // Catch: java.lang.Throwable -> L69
            return r1
        L69:
            r5 = move-exception
            goto L7c
        L6b:
            java.lang.String r1 = "Connection pool is closed"
            r2 = 21
            androidx.sqlite.SQLite.throwSQLiteException(r2, r1)     // Catch: java.lang.Throwable -> L5b
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L5b
            r1.<init>()     // Catch: java.lang.Throwable -> L5b
            throw r1     // Catch: java.lang.Throwable -> L5b
        L78:
            r5.unlock()     // Catch: java.lang.Throwable -> L69
            throw r1     // Catch: java.lang.Throwable -> L69
        L7c:
            kotlinx.coroutines.sync.d r0 = r0.connectionPermits
            r0.release()
            throw r5
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: acquireWithTimeout-KLykuaI, reason: not valid java name */
    public final java.lang.Object m83acquireWithTimeoutKLykuaI(long r9, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.n1> r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super androidx.room.coroutines.ConnectionWithLock> r12) {
            r8 = this;
            boolean r0 = r12 instanceof androidx.room.coroutines.Pool$acquireWithTimeout$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.room.coroutines.Pool$acquireWithTimeout$1 r0 = (androidx.room.coroutines.Pool$acquireWithTimeout$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.coroutines.Pool$acquireWithTimeout$1 r0 = new androidx.room.coroutines.Pool$acquireWithTimeout$1
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            long r9 = r0.J$0
            java.lang.Object r11 = r0.L$2
            kotlin.jvm.internal.Ref$ObjectRef r11 = (kotlin.jvm.internal.Ref.ObjectRef) r11
            java.lang.Object r2 = r0.L$1
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            java.lang.Object r5 = r0.L$0
            androidx.room.coroutines.Pool r5 = (androidx.room.coroutines.Pool) r5
            kotlin.g0.n(r12)     // Catch: java.lang.Throwable -> L38
            goto L63
        L38:
            r12 = move-exception
            goto L6d
        L3a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L42:
            kotlin.g0.n(r12)
            r5 = r8
        L46:
            kotlin.jvm.internal.Ref$ObjectRef r12 = new kotlin.jvm.internal.Ref$ObjectRef
            r12.<init>()
            androidx.room.coroutines.Pool$acquireWithTimeout$2 r2 = new androidx.room.coroutines.Pool$acquireWithTimeout$2     // Catch: java.lang.Throwable -> L68
            r2.<init>(r12, r5, r4)     // Catch: java.lang.Throwable -> L68
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L68
            r0.L$1 = r11     // Catch: java.lang.Throwable -> L68
            r0.L$2 = r12     // Catch: java.lang.Throwable -> L68
            r0.J$0 = r9     // Catch: java.lang.Throwable -> L68
            r0.label = r3     // Catch: java.lang.Throwable -> L68
            java.lang.Object r2 = kotlinx.coroutines.n3.d(r9, r2, r0)     // Catch: java.lang.Throwable -> L68
            if (r2 != r1) goto L61
            return r1
        L61:
            r2 = r11
            r11 = r12
        L63:
            r12 = r11
            r11 = r2
            r2 = r0
            r0 = r4
            goto L72
        L68:
            r2 = move-exception
            r7 = r2
            r2 = r11
            r11 = r12
            r12 = r7
        L6d:
            r7 = r12
            r12 = r11
            r11 = r2
            r2 = r0
            r0 = r7
        L72:
            boolean r6 = r0 instanceof kotlinx.coroutines.TimeoutCancellationException     // Catch: java.lang.Throwable -> L7a
            if (r6 == 0) goto L7c
            r11.invoke()     // Catch: java.lang.Throwable -> L7a
            goto L83
        L7a:
            r9 = move-exception
            goto L86
        L7c:
            if (r0 != 0) goto L85
            java.lang.Object r12 = r12.element     // Catch: java.lang.Throwable -> L7a
            if (r12 == 0) goto L83
            return r12
        L83:
            r0 = r2
            goto L46
        L85:
            throw r0     // Catch: java.lang.Throwable -> L7a
        L86:
            java.lang.Object r10 = r12.element
            androidx.room.coroutines.ConnectionWithLock r10 = (androidx.room.coroutines.ConnectionWithLock) r10
            if (r10 == 0) goto L8f
            r5.recycle(r10)
        L8f:
            throw r9
    }

    public final void close() {
            r5 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r5.lock
            r0.lock()
            r1 = 1
            r5.isClosed = r1     // Catch: java.lang.Throwable -> L16
            androidx.room.coroutines.ConnectionWithLock[] r1 = r5.connections     // Catch: java.lang.Throwable -> L16
            int r2 = r1.length     // Catch: java.lang.Throwable -> L16
            r3 = 0
        Lc:
            if (r3 >= r2) goto L1b
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L16
            if (r4 == 0) goto L18
            r4.close()     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r1 = move-exception
            goto L21
        L18:
            int r3 = r3 + 1
            goto Lc
        L1b:
            kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L16
            r0.unlock()
            return
        L21:
            r0.unlock()
            throw r1
    }

    public final void dump(@org.jetbrains.annotations.NotNull java.lang.StringBuilder r15) {
            r14 = this;
            java.lang.String r0 = ", "
            java.lang.String r1 = "builder"
            kotlin.jvm.internal.g0.p(r15, r1)
            java.util.concurrent.locks.ReentrantLock r1 = r14.lock
            r1.lock()
            java.util.List r2 = kotlin.collections.f0.j()     // Catch: java.lang.Throwable -> L26
            androidx.collection.CircularArray<androidx.room.coroutines.ConnectionWithLock> r3 = r14.availableConnections     // Catch: java.lang.Throwable -> L26
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L26
            r4 = 0
            r5 = 0
        L18:
            if (r5 >= r3) goto L2a
            androidx.collection.CircularArray<androidx.room.coroutines.ConnectionWithLock> r6 = r14.availableConnections     // Catch: java.lang.Throwable -> L26
            java.lang.Object r6 = r6.get(r5)     // Catch: java.lang.Throwable -> L26
            r2.add(r6)     // Catch: java.lang.Throwable -> L26
            int r5 = r5 + 1
            goto L18
        L26:
            r0 = move-exception
            r15 = r0
            goto Lff
        L2a:
            java.util.List r2 = kotlin.collections.f0.b(r2)     // Catch: java.lang.Throwable -> L26
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26
            r3.<init>()     // Catch: java.lang.Throwable -> L26
            r5 = 9
            r3.append(r5)     // Catch: java.lang.Throwable -> L26
            java.lang.String r5 = super.toString()     // Catch: java.lang.Throwable -> L26
            r3.append(r5)     // Catch: java.lang.Throwable -> L26
            java.lang.String r5 = " ("
            r3.append(r5)     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L26
            r15.append(r3)     // Catch: java.lang.Throwable -> L26
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26
            r3.<init>()     // Catch: java.lang.Throwable -> L26
            java.lang.String r5 = "capacity="
            r3.append(r5)     // Catch: java.lang.Throwable -> L26
            int r5 = r14.capacity     // Catch: java.lang.Throwable -> L26
            r3.append(r5)     // Catch: java.lang.Throwable -> L26
            r3.append(r0)     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L26
            r15.append(r3)     // Catch: java.lang.Throwable -> L26
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26
            r3.<init>()     // Catch: java.lang.Throwable -> L26
            java.lang.String r5 = "permits="
            r3.append(r5)     // Catch: java.lang.Throwable -> L26
            kotlinx.coroutines.sync.d r5 = r14.connectionPermits     // Catch: java.lang.Throwable -> L26
            int r5 = r5.b()     // Catch: java.lang.Throwable -> L26
            r3.append(r5)     // Catch: java.lang.Throwable -> L26
            r3.append(r0)     // Catch: java.lang.Throwable -> L26
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L26
            r15.append(r0)     // Catch: java.lang.Throwable -> L26
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26
            r0.<init>()     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = "queue=(size="
            r0.append(r3)     // Catch: java.lang.Throwable -> L26
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L26
            r0.append(r3)     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = ")["
            r0.append(r3)     // Catch: java.lang.Throwable -> L26
            r5 = r2
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch: java.lang.Throwable -> L26
            r12 = 63
            r13 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            java.lang.String r2 = kotlin.collections.f0.r3(r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L26
            r0.append(r2)     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = "], "
            r0.append(r2)     // Catch: java.lang.Throwable -> L26
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L26
            r15.append(r0)     // Catch: java.lang.Throwable -> L26
            java.lang.String r0 = ")"
            r15.append(r0)     // Catch: java.lang.Throwable -> L26
            r0 = 10
            r15.append(r0)     // Catch: java.lang.Throwable -> L26
            androidx.room.coroutines.ConnectionWithLock[] r2 = r14.connections     // Catch: java.lang.Throwable -> L26
            int r3 = r2.length     // Catch: java.lang.Throwable -> L26
            r5 = 0
        Lc4:
            if (r4 >= r3) goto Lf9
            r6 = r2[r4]     // Catch: java.lang.Throwable -> L26
            int r5 = r5 + 1
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26
            r7.<init>()     // Catch: java.lang.Throwable -> L26
            java.lang.String r8 = "\t\t["
            r7.append(r8)     // Catch: java.lang.Throwable -> L26
            r7.append(r5)     // Catch: java.lang.Throwable -> L26
            java.lang.String r8 = "] - "
            r7.append(r8)     // Catch: java.lang.Throwable -> L26
            if (r6 == 0) goto Le3
            java.lang.String r8 = r6.toString()     // Catch: java.lang.Throwable -> L26
            goto Le4
        Le3:
            r8 = 0
        Le4:
            r7.append(r8)     // Catch: java.lang.Throwable -> L26
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L26
            r15.append(r7)     // Catch: java.lang.Throwable -> L26
            r15.append(r0)     // Catch: java.lang.Throwable -> L26
            if (r6 == 0) goto Lf6
            r6.dump(r15)     // Catch: java.lang.Throwable -> L26
        Lf6:
            int r4 = r4 + 1
            goto Lc4
        Lf9:
            kotlin.n1 r15 = kotlin.n1.a     // Catch: java.lang.Throwable -> L26
            r1.unlock()
            return
        Lff:
            r1.unlock()
            throw r15
    }

    public final int getCapacity() {
            r1 = this;
            int r0 = r1.capacity
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function0<androidx.sqlite.SQLiteConnection> getConnectionFactory() {
            r1 = this;
            kotlin.jvm.functions.Function0<androidx.sqlite.SQLiteConnection> r0 = r1.connectionFactory
            return r0
    }

    public final void recycle(@org.jetbrains.annotations.NotNull androidx.room.coroutines.ConnectionWithLock r3) {
            r2 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            r0.lock()
            androidx.collection.CircularArray<androidx.room.coroutines.ConnectionWithLock> r1 = r2.availableConnections     // Catch: java.lang.Throwable -> L1a
            r1.addLast(r3)     // Catch: java.lang.Throwable -> L1a
            kotlin.n1 r3 = kotlin.n1.a     // Catch: java.lang.Throwable -> L1a
            r0.unlock()
            kotlinx.coroutines.sync.d r3 = r2.connectionPermits
            r3.release()
            return
        L1a:
            r3 = move-exception
            r0.unlock()
            throw r3
    }
}
