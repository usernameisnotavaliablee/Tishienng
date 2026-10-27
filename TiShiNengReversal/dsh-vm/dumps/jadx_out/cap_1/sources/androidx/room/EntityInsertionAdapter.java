package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.Deprecated(message = "No longer used by generated code.", replaceWith = @kotlin.ReplaceWith(expression = "EntityInsertAdapter", imports = {}))
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nEntityInsertionAdapter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntityInsertionAdapter.android.kt\nandroidx/room/EntityInsertionAdapter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,231:1\n13402#2,2:232\n13467#2,3:239\n13402#2,2:242\n1863#3,2:234\n1872#3,3:236\n1863#3,2:244\n*S KotlinDebug\n*F\n+ 1 EntityInsertionAdapter.android.kt\nandroidx/room/EntityInsertionAdapter\n*L\n65#1:232,2\n137#1:239,3\n201#1:242,2\n82#1:234,2\n117#1:236,3\n221#1:244,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class EntityInsertionAdapter<T> extends androidx.room.SharedSQLiteStatement {
    public EntityInsertionAdapter(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r2) {
            r1 = this;
            java.lang.String r0 = "database"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>(r2)
            return
    }

    protected abstract void bind(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteStatement r1, T r2);

    public final void insert(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3) {
            r2 = this;
            java.lang.String r0 = "entities"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.sqlite.db.SupportSQLiteStatement r0 = r2.acquire()
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L1e
        Ld:
            boolean r1 = r3.hasNext()     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L20
            java.lang.Object r1 = r3.next()     // Catch: java.lang.Throwable -> L1e
            r2.bind(r0, r1)     // Catch: java.lang.Throwable -> L1e
            r0.executeInsert()     // Catch: java.lang.Throwable -> L1e
            goto Ld
        L1e:
            r3 = move-exception
            goto L24
        L20:
            r2.release(r0)
            return
        L24:
            r2.release(r0)
            throw r3
    }

    public final void insert(T r2) {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteStatement r0 = r1.acquire()
            r1.bind(r0, r2)     // Catch: java.lang.Throwable -> Le
            r0.executeInsert()     // Catch: java.lang.Throwable -> Le
            r1.release(r0)
            return
        Le:
            r2 = move-exception
            r1.release(r0)
            throw r2
    }

    public final void insert(@org.jetbrains.annotations.NotNull T[] r5) {
            r4 = this;
            java.lang.String r0 = "entities"
            kotlin.jvm.internal.g0.p(r5, r0)
            androidx.sqlite.db.SupportSQLiteStatement r0 = r4.acquire()
            int r1 = r5.length     // Catch: java.lang.Throwable -> L18
            r2 = 0
        Lb:
            if (r2 >= r1) goto L1a
            r3 = r5[r2]     // Catch: java.lang.Throwable -> L18
            r4.bind(r0, r3)     // Catch: java.lang.Throwable -> L18
            r0.executeInsert()     // Catch: java.lang.Throwable -> L18
            int r2 = r2 + 1
            goto Lb
        L18:
            r5 = move-exception
            goto L1e
        L1a:
            r4.release(r0)
            return
        L1e:
            r4.release(r0)
            throw r5
    }

    public final long insertAndReturnId(T r4) {
            r3 = this;
            androidx.sqlite.db.SupportSQLiteStatement r0 = r3.acquire()
            r3.bind(r0, r4)     // Catch: java.lang.Throwable -> Lf
            long r1 = r0.executeInsert()     // Catch: java.lang.Throwable -> Lf
            r3.release(r0)
            return r1
        Lf:
            r4 = move-exception
            r3.release(r0)
            throw r4
    }

    @org.jetbrains.annotations.NotNull
    public final long[] insertAndReturnIdsArray(@org.jetbrains.annotations.NotNull java.util.Collection<? extends T> r8) {
            r7 = this;
            java.lang.String r0 = "entities"
            kotlin.jvm.internal.g0.p(r8, r0)
            androidx.sqlite.db.SupportSQLiteStatement r0 = r7.acquire()
            int r1 = r8.size()     // Catch: java.lang.Throwable -> L28
            long[] r1 = new long[r1]     // Catch: java.lang.Throwable -> L28
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: java.lang.Throwable -> L28
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L28
            r2 = 0
        L16:
            boolean r3 = r8.hasNext()     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L35
            java.lang.Object r3 = r8.next()     // Catch: java.lang.Throwable -> L28
            int r4 = r2 + 1
            if (r2 >= 0) goto L2a
            kotlin.collections.f0.b0()     // Catch: java.lang.Throwable -> L28
            goto L2a
        L28:
            r8 = move-exception
            goto L39
        L2a:
            r7.bind(r0, r3)     // Catch: java.lang.Throwable -> L28
            long r5 = r0.executeInsert()     // Catch: java.lang.Throwable -> L28
            r1[r2] = r5     // Catch: java.lang.Throwable -> L28
            r2 = r4
            goto L16
        L35:
            r7.release(r0)
            return r1
        L39:
            r7.release(r0)
            throw r8
    }

    @org.jetbrains.annotations.NotNull
    public final long[] insertAndReturnIdsArray(@org.jetbrains.annotations.NotNull T[] r10) {
            r9 = this;
            java.lang.String r0 = "entities"
            kotlin.jvm.internal.g0.p(r10, r0)
            androidx.sqlite.db.SupportSQLiteStatement r0 = r9.acquire()
            int r1 = r10.length     // Catch: java.lang.Throwable -> L22
            long[] r1 = new long[r1]     // Catch: java.lang.Throwable -> L22
            int r2 = r10.length     // Catch: java.lang.Throwable -> L22
            r3 = 0
            r4 = 0
        Lf:
            if (r3 >= r2) goto L24
            r5 = r10[r3]     // Catch: java.lang.Throwable -> L22
            int r6 = r4 + 1
            r9.bind(r0, r5)     // Catch: java.lang.Throwable -> L22
            long r7 = r0.executeInsert()     // Catch: java.lang.Throwable -> L22
            r1[r4] = r7     // Catch: java.lang.Throwable -> L22
            int r3 = r3 + 1
            r4 = r6
            goto Lf
        L22:
            r10 = move-exception
            goto L28
        L24:
            r9.release(r0)
            return r1
        L28:
            r9.release(r0)
            throw r10
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.Long[] insertAndReturnIdsArrayBox(@org.jetbrains.annotations.NotNull java.util.Collection<? extends T> r7) {
            r6 = this;
            java.lang.String r0 = "entities"
            kotlin.jvm.internal.g0.p(r7, r0)
            androidx.sqlite.db.SupportSQLiteStatement r0 = r6.acquire()
            java.util.Iterator r1 = r7.iterator()
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L2a
            java.lang.Long[] r2 = new java.lang.Long[r7]     // Catch: java.lang.Throwable -> L2a
            r3 = 0
        L14:
            if (r3 >= r7) goto L2c
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L2a
            r6.bind(r0, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r0.executeInsert()     // Catch: java.lang.Throwable -> L2a
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L2a
            r2[r3] = r4     // Catch: java.lang.Throwable -> L2a
            int r3 = r3 + 1
            goto L14
        L2a:
            r7 = move-exception
            goto L30
        L2c:
            r6.release(r0)
            return r2
        L30:
            r6.release(r0)
            throw r7
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.Long[] insertAndReturnIdsArrayBox(@org.jetbrains.annotations.NotNull T[] r7) {
            r6 = this;
            java.lang.String r0 = "entities"
            kotlin.jvm.internal.g0.p(r7, r0)
            androidx.sqlite.db.SupportSQLiteStatement r0 = r6.acquire()
            java.util.Iterator r1 = kotlin.jvm.internal.h.a(r7)
            int r7 = r7.length     // Catch: java.lang.Throwable -> L27
            java.lang.Long[] r2 = new java.lang.Long[r7]     // Catch: java.lang.Throwable -> L27
            r3 = 0
        L11:
            if (r3 >= r7) goto L29
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L27
            r6.bind(r0, r4)     // Catch: java.lang.Throwable -> L27
            long r4 = r0.executeInsert()     // Catch: java.lang.Throwable -> L27
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L27
            r2[r3] = r4     // Catch: java.lang.Throwable -> L27
            int r3 = r3 + 1
            goto L11
        L27:
            r7 = move-exception
            goto L2d
        L29:
            r6.release(r0)
            return r2
        L2d:
            r6.release(r0)
            throw r7
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Long> insertAndReturnIdsList(@org.jetbrains.annotations.NotNull java.util.Collection<? extends T> r5) {
            r4 = this;
            java.lang.String r0 = "entities"
            kotlin.jvm.internal.g0.p(r5, r0)
            androidx.sqlite.db.SupportSQLiteStatement r0 = r4.acquire()
            java.util.List r1 = kotlin.collections.f0.j()     // Catch: java.lang.Throwable -> L2c
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch: java.lang.Throwable -> L2c
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L2c
        L13:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Throwable -> L2c
            r4.bind(r0, r2)     // Catch: java.lang.Throwable -> L2c
            long r2 = r0.executeInsert()     // Catch: java.lang.Throwable -> L2c
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L2c
            r1.add(r2)     // Catch: java.lang.Throwable -> L2c
            goto L13
        L2c:
            r5 = move-exception
            goto L36
        L2e:
            java.util.List r5 = kotlin.collections.f0.b(r1)     // Catch: java.lang.Throwable -> L2c
            r4.release(r0)
            return r5
        L36:
            r4.release(r0)
            throw r5
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Long> insertAndReturnIdsList(@org.jetbrains.annotations.NotNull T[] r7) {
            r6 = this;
            java.lang.String r0 = "entities"
            kotlin.jvm.internal.g0.p(r7, r0)
            androidx.sqlite.db.SupportSQLiteStatement r0 = r6.acquire()
            java.util.List r1 = kotlin.collections.f0.j()     // Catch: java.lang.Throwable -> L24
            int r2 = r7.length     // Catch: java.lang.Throwable -> L24
            r3 = 0
        Lf:
            if (r3 >= r2) goto L26
            r4 = r7[r3]     // Catch: java.lang.Throwable -> L24
            r6.bind(r0, r4)     // Catch: java.lang.Throwable -> L24
            long r4 = r0.executeInsert()     // Catch: java.lang.Throwable -> L24
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L24
            r1.add(r4)     // Catch: java.lang.Throwable -> L24
            int r3 = r3 + 1
            goto Lf
        L24:
            r7 = move-exception
            goto L2e
        L26:
            java.util.List r7 = kotlin.collections.f0.b(r1)     // Catch: java.lang.Throwable -> L24
            r6.release(r0)
            return r7
        L2e:
            r6.release(r0)
            throw r7
    }
}
