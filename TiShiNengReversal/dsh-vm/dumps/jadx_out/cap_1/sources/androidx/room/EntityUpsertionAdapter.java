package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.Deprecated(message = "No longer used by generated code.", replaceWith = @kotlin.ReplaceWith(expression = "EntityUpsertAdapter", imports = {}))
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nEntityUpsertionAdapter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntityUpsertionAdapter.android.kt\nandroidx/room/EntityUpsertionAdapter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,217:1\n13402#2,2:218\n13402#2,2:222\n1863#3,2:220\n1863#3,2:224\n*S KotlinDebug\n*F\n+ 1 EntityUpsertionAdapter.android.kt\nandroidx/room/EntityUpsertionAdapter\n*L\n73#1:218,2\n145#1:222,2\n84#1:220,2\n159#1:224,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class EntityUpsertionAdapter<T> {

    @org.jetbrains.annotations.NotNull
    private final androidx.room.EntityInsertionAdapter<T> insertionAdapter;

    @org.jetbrains.annotations.NotNull
    private final androidx.room.EntityDeletionOrUpdateAdapter<T> updateAdapter;

    public EntityUpsertionAdapter(@org.jetbrains.annotations.NotNull androidx.room.EntityInsertionAdapter<T> r2, @org.jetbrains.annotations.NotNull androidx.room.EntityDeletionOrUpdateAdapter<T> r3) {
            r1 = this;
            java.lang.String r0 = "insertionAdapter"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "updateAdapter"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.insertionAdapter = r2
            r1.updateAdapter = r3
            return
    }

    private final void checkUniquenessException(android.database.sqlite.SQLiteConstraintException r6) {
            r5 = this;
            java.lang.String r0 = r6.getMessage()
            if (r0 == 0) goto L25
            java.lang.String r1 = "unique"
            r2 = 1
            boolean r1 = kotlin.text.u.i3(r0, r1, r2)
            if (r1 != 0) goto L24
            java.lang.String r1 = "2067"
            r2 = 0
            r3 = 2
            r4 = 0
            boolean r1 = kotlin.text.u.l3(r0, r1, r2, r3, r4)
            if (r1 != 0) goto L24
            java.lang.String r1 = "1555"
            boolean r0 = kotlin.text.u.l3(r0, r1, r2, r3, r4)
            if (r0 == 0) goto L23
            goto L24
        L23:
            throw r6
        L24:
            return
        L25:
            throw r6
    }

    public final void upsert(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r3) {
            r2 = this;
            java.lang.String r0 = "entities"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r3.next()
            androidx.room.EntityInsertionAdapter<T> r1 = r2.insertionAdapter     // Catch: android.database.sqlite.SQLiteConstraintException -> L19
            r1.insert(r0)     // Catch: android.database.sqlite.SQLiteConstraintException -> L19
            goto L9
        L19:
            r1 = move-exception
            r2.checkUniquenessException(r1)
            androidx.room.EntityDeletionOrUpdateAdapter<T> r1 = r2.updateAdapter
            r1.handle(r0)
            goto L9
        L23:
            return
    }

    public final void upsert(T r2) {
            r1 = this;
            androidx.room.EntityInsertionAdapter<T> r0 = r1.insertionAdapter     // Catch: android.database.sqlite.SQLiteConstraintException -> L6
            r0.insert(r2)     // Catch: android.database.sqlite.SQLiteConstraintException -> L6
            return
        L6:
            r0 = move-exception
            r1.checkUniquenessException(r0)
            androidx.room.EntityDeletionOrUpdateAdapter<T> r0 = r1.updateAdapter
            r0.handle(r2)
            return
    }

    public final void upsert(@org.jetbrains.annotations.NotNull T[] r5) {
            r4 = this;
            java.lang.String r0 = "entities"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r5.length
            r1 = 0
        L7:
            if (r1 >= r0) goto L1d
            r2 = r5[r1]
            androidx.room.EntityInsertionAdapter<T> r3 = r4.insertionAdapter     // Catch: android.database.sqlite.SQLiteConstraintException -> L11
            r3.insert(r2)     // Catch: android.database.sqlite.SQLiteConstraintException -> L11
            goto L1a
        L11:
            r3 = move-exception
            r4.checkUniquenessException(r3)
            androidx.room.EntityDeletionOrUpdateAdapter<T> r3 = r4.updateAdapter
            r3.handle(r2)
        L1a:
            int r1 = r1 + 1
            goto L7
        L1d:
            return
    }

    public final long upsertAndReturnId(T r3) {
            r2 = this;
            androidx.room.EntityInsertionAdapter<T> r0 = r2.insertionAdapter     // Catch: android.database.sqlite.SQLiteConstraintException -> L7
            long r0 = r0.insertAndReturnId(r3)     // Catch: android.database.sqlite.SQLiteConstraintException -> L7
            return r0
        L7:
            r0 = move-exception
            r2.checkUniquenessException(r0)
            androidx.room.EntityDeletionOrUpdateAdapter<T> r0 = r2.updateAdapter
            r0.handle(r3)
            r0 = -1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final long[] upsertAndReturnIdsArray(@org.jetbrains.annotations.NotNull java.util.Collection<? extends T> r6) {
            r5 = this;
            java.lang.String r0 = "entities"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.Iterator r0 = r6.iterator()
            int r6 = r6.size()
            long[] r1 = new long[r6]
            r2 = 0
        L10:
            if (r2 >= r6) goto L2d
            java.lang.Object r3 = r0.next()
            androidx.room.EntityInsertionAdapter<T> r4 = r5.insertionAdapter     // Catch: android.database.sqlite.SQLiteConstraintException -> L1d
            long r3 = r4.insertAndReturnId(r3)     // Catch: android.database.sqlite.SQLiteConstraintException -> L1d
            goto L28
        L1d:
            r4 = move-exception
            r5.checkUniquenessException(r4)
            androidx.room.EntityDeletionOrUpdateAdapter<T> r4 = r5.updateAdapter
            r4.handle(r3)
            r3 = -1
        L28:
            r1[r2] = r3
            int r2 = r2 + 1
            goto L10
        L2d:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final long[] upsertAndReturnIdsArray(@org.jetbrains.annotations.NotNull T[] r6) {
            r5 = this;
            java.lang.String r0 = "entities"
            kotlin.jvm.internal.g0.p(r6, r0)
            int r0 = r6.length
            long[] r1 = new long[r0]
            r2 = 0
        L9:
            if (r2 >= r0) goto L26
            androidx.room.EntityInsertionAdapter<T> r3 = r5.insertionAdapter     // Catch: android.database.sqlite.SQLiteConstraintException -> L14
            r4 = r6[r2]     // Catch: android.database.sqlite.SQLiteConstraintException -> L14
            long r3 = r3.insertAndReturnId(r4)     // Catch: android.database.sqlite.SQLiteConstraintException -> L14
            goto L21
        L14:
            r3 = move-exception
            r5.checkUniquenessException(r3)
            androidx.room.EntityDeletionOrUpdateAdapter<T> r3 = r5.updateAdapter
            r4 = r6[r2]
            r3.handle(r4)
            r3 = -1
        L21:
            r1[r2] = r3
            int r2 = r2 + 1
            goto L9
        L26:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.Long[] upsertAndReturnIdsArrayBox(@org.jetbrains.annotations.NotNull java.util.Collection<? extends T> r6) {
            r5 = this;
            java.lang.String r0 = "entities"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.Iterator r0 = r6.iterator()
            int r6 = r6.size()
            java.lang.Long[] r1 = new java.lang.Long[r6]
            r2 = 0
        L10:
            if (r2 >= r6) goto L31
            java.lang.Object r3 = r0.next()
            androidx.room.EntityInsertionAdapter<T> r4 = r5.insertionAdapter     // Catch: android.database.sqlite.SQLiteConstraintException -> L1d
            long r3 = r4.insertAndReturnId(r3)     // Catch: android.database.sqlite.SQLiteConstraintException -> L1d
            goto L28
        L1d:
            r4 = move-exception
            r5.checkUniquenessException(r4)
            androidx.room.EntityDeletionOrUpdateAdapter<T> r4 = r5.updateAdapter
            r4.handle(r3)
            r3 = -1
        L28:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L10
        L31:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.Long[] upsertAndReturnIdsArrayBox(@org.jetbrains.annotations.NotNull T[] r6) {
            r5 = this;
            java.lang.String r0 = "entities"
            kotlin.jvm.internal.g0.p(r6, r0)
            int r0 = r6.length
            java.lang.Long[] r1 = new java.lang.Long[r0]
            r2 = 0
        L9:
            if (r2 >= r0) goto L2a
            androidx.room.EntityInsertionAdapter<T> r3 = r5.insertionAdapter     // Catch: android.database.sqlite.SQLiteConstraintException -> L14
            r4 = r6[r2]     // Catch: android.database.sqlite.SQLiteConstraintException -> L14
            long r3 = r3.insertAndReturnId(r4)     // Catch: android.database.sqlite.SQLiteConstraintException -> L14
            goto L21
        L14:
            r3 = move-exception
            r5.checkUniquenessException(r3)
            androidx.room.EntityDeletionOrUpdateAdapter<T> r3 = r5.updateAdapter
            r4 = r6[r2]
            r3.handle(r4)
            r3 = -1
        L21:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L9
        L2a:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Long> upsertAndReturnIdsList(@org.jetbrains.annotations.NotNull java.util.Collection<? extends T> r5) {
            r4 = this;
            java.lang.String r0 = "entities"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.List r0 = kotlin.collections.f0.j()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        Lf:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r5.next()
            androidx.room.EntityInsertionAdapter<T> r2 = r4.insertionAdapter     // Catch: android.database.sqlite.SQLiteConstraintException -> L27
            long r2 = r2.insertAndReturnId(r1)     // Catch: android.database.sqlite.SQLiteConstraintException -> L27
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: android.database.sqlite.SQLiteConstraintException -> L27
            r0.add(r2)     // Catch: android.database.sqlite.SQLiteConstraintException -> L27
            goto Lf
        L27:
            r2 = move-exception
            r4.checkUniquenessException(r2)
            androidx.room.EntityDeletionOrUpdateAdapter<T> r2 = r4.updateAdapter
            r2.handle(r1)
            r1 = -1
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.add(r1)
            goto Lf
        L3a:
            java.util.List r5 = kotlin.collections.f0.b(r0)
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Long> upsertAndReturnIdsList(@org.jetbrains.annotations.NotNull T[] r7) {
            r6 = this;
            java.lang.String r0 = "entities"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.util.List r0 = kotlin.collections.f0.j()
            int r1 = r7.length
            r2 = 0
        Lb:
            if (r2 >= r1) goto L32
            r3 = r7[r2]
            androidx.room.EntityInsertionAdapter<T> r4 = r6.insertionAdapter     // Catch: android.database.sqlite.SQLiteConstraintException -> L1d
            long r4 = r4.insertAndReturnId(r3)     // Catch: android.database.sqlite.SQLiteConstraintException -> L1d
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: android.database.sqlite.SQLiteConstraintException -> L1d
            r0.add(r4)     // Catch: android.database.sqlite.SQLiteConstraintException -> L1d
            goto L2f
        L1d:
            r4 = move-exception
            r6.checkUniquenessException(r4)
            androidx.room.EntityDeletionOrUpdateAdapter<T> r4 = r6.updateAdapter
            r4.handle(r3)
            r3 = -1
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.add(r3)
        L2f:
            int r2 = r2 + 1
            goto Lb
        L32:
            java.util.List r7 = kotlin.collections.f0.b(r0)
            return r7
    }
}
