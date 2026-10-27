package androidx.room.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nConnectionPoolImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionPoolImpl.kt\nandroidx/room/coroutines/ConnectionWithLock\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,556:1\n1#2:557\n1863#3,2:558\n*S KotlinDebug\n*F\n+ 1 ConnectionPoolImpl.kt\nandroidx/room/coroutines/ConnectionWithLock\n*L\n317#1:558,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class ConnectionWithLock implements androidx.sqlite.SQLiteConnection, kotlinx.coroutines.sync.a {

    @org.jetbrains.annotations.Nullable
    private kotlin.coroutines.i acquireCoroutineContext;

    @org.jetbrains.annotations.Nullable
    private java.lang.Throwable acquireThrowable;

    @org.jetbrains.annotations.NotNull
    private final androidx.sqlite.SQLiteConnection delegate;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.sync.a lock;

    public ConnectionWithLock(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.sync.a r3) {
            r1 = this;
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "lock"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.delegate = r2
            r1.lock = r3
            return
    }

    public /* synthetic */ ConnectionWithLock(androidx.sqlite.SQLiteConnection r1, kotlinx.coroutines.sync.a r2, int r3, kotlin.jvm.internal.v r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto Lb
            r2 = 1
            r3 = 0
            r4 = 0
            kotlinx.coroutines.sync.a r2 = kotlinx.coroutines.sync.c.b(r4, r2, r3)
        Lb:
            r0.<init>(r1, r2)
            return
    }

    @Override // androidx.sqlite.SQLiteConnection, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            androidx.sqlite.SQLiteConnection r0 = r1.delegate
            r0.close()
            return
    }

    public final void dump(@org.jetbrains.annotations.NotNull java.lang.StringBuilder r6) {
            r5 = this;
            java.lang.String r0 = "builder"
            kotlin.jvm.internal.g0.p(r6, r0)
            kotlin.coroutines.i r0 = r5.acquireCoroutineContext
            r1 = 10
            if (r0 != 0) goto L19
            java.lang.Throwable r0 = r5.acquireThrowable
            if (r0 == 0) goto L10
            goto L19
        L10:
            java.lang.String r0 = "\t\tStatus: Free connection"
            r6.append(r0)
            r6.append(r1)
            return
        L19:
            java.lang.String r0 = "\t\tStatus: Acquired connection"
            r6.append(r0)
            r6.append(r1)
            kotlin.coroutines.i r0 = r5.acquireCoroutineContext
            if (r0 == 0) goto L3c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "\t\tCoroutine: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r6.append(r0)
            r6.append(r1)
        L3c:
            java.lang.Throwable r0 = r5.acquireThrowable
            if (r0 == 0) goto L81
            java.lang.String r2 = "\t\tAcquired:"
            r6.append(r2)
            r6.append(r1)
            java.lang.String r0 = kotlin.l.i(r0)
            java.util.List r0 = kotlin.text.u.c4(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r2 = 1
            java.util.List r0 = kotlin.collections.f0.g2(r0, r2)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L5d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L81
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "\t\t"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r6.append(r2)
            r6.append(r1)
            goto L5d
        L81:
            return
    }

    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.selects.i<java.lang.Object, kotlinx.coroutines.sync.a> getOnLock() {
            r1 = this;
            kotlinx.coroutines.sync.a r0 = r1.lock
            kotlinx.coroutines.selects.i r0 = r0.getOnLock()
            return r0
    }

    public boolean holdsLock(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
            r1 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlinx.coroutines.sync.a r0 = r1.lock
            boolean r2 = r0.holdsLock(r2)
            return r2
    }

    public boolean isLocked() {
            r1 = this;
            kotlinx.coroutines.sync.a r0 = r1.lock
            boolean r0 = r0.isLocked()
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Object lock(@org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3) {
            r1 = this;
            kotlinx.coroutines.sync.a r0 = r1.lock
            java.lang.Object r2 = r0.lock(r2, r3)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.room.coroutines.ConnectionWithLock markAcquired(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r2) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.acquireCoroutineContext = r2
            java.lang.Throwable r2 = new java.lang.Throwable
            r2.<init>()
            r1.acquireThrowable = r2
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.room.coroutines.ConnectionWithLock markReleased() {
            r1 = this;
            r0 = 0
            r1.acquireCoroutineContext = r0
            r1.acquireThrowable = r0
            return r1
    }

    @Override // androidx.sqlite.SQLiteConnection
    @org.jetbrains.annotations.NotNull
    public androidx.sqlite.SQLiteStatement prepare(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "sql"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.sqlite.SQLiteConnection r0 = r1.delegate
            androidx.sqlite.SQLiteStatement r2 = r0.prepare(r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            androidx.sqlite.SQLiteConnection r0 = r1.delegate
            java.lang.String r0 = r0.toString()
            return r0
    }

    public boolean tryLock(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            kotlinx.coroutines.sync.a r0 = r1.lock
            boolean r2 = r0.tryLock(r2)
            return r2
    }

    public void unlock(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            kotlinx.coroutines.sync.a r0 = r1.lock
            r0.unlock(r2)
            return
    }
}
