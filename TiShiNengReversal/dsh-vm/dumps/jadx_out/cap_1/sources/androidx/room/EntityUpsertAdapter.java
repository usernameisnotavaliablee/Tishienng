package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nEntityUpsertAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntityUpsertAdapter.kt\nandroidx/room/EntityUpsertAdapter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,238:1\n13402#2,2:239\n13402#2,2:243\n1863#3,2:241\n1863#3,2:245\n*S KotlinDebug\n*F\n+ 1 EntityUpsertAdapter.kt\nandroidx/room/EntityUpsertAdapter\n*L\n61#1:239,2\n139#1:243,2\n73#1:241,2\n157#1:245,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class EntityUpsertAdapter<T> {

    @org.jetbrains.annotations.NotNull
    public static final androidx.room.EntityUpsertAdapter.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String ErrorMsg = "unique";

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SQLITE_CONSTRAINT_PRIMARYKEY = "1555";

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SQLITE_CONSTRAINT_UNIQUE = "2067";

    @org.jetbrains.annotations.NotNull
    private final androidx.room.EntityInsertAdapter<T> entityInsertAdapter;

    @org.jetbrains.annotations.NotNull
    private final androidx.room.EntityDeleteOrUpdateAdapter<T> updateAdapter;

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

    static {
            androidx.room.EntityUpsertAdapter$Companion r0 = new androidx.room.EntityUpsertAdapter$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.room.EntityUpsertAdapter.Companion = r0
            return
    }

    public EntityUpsertAdapter(@org.jetbrains.annotations.NotNull androidx.room.EntityInsertAdapter<T> r2, @org.jetbrains.annotations.NotNull androidx.room.EntityDeleteOrUpdateAdapter<T> r3) {
            r1 = this;
            java.lang.String r0 = "entityInsertAdapter"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "updateAdapter"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.entityInsertAdapter = r2
            r1.updateAdapter = r3
            return
    }

    private final void checkUniquenessException(android.database.SQLException r6) {
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

    public final void upsert(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r3, @org.jetbrains.annotations.Nullable java.lang.Iterable<? extends T> r4) {
            r2 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r3, r0)
            if (r4 != 0) goto L8
            goto L26
        L8:
            java.util.Iterator r4 = r4.iterator()
        Lc:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r4.next()
            androidx.room.EntityInsertAdapter<T> r1 = r2.entityInsertAdapter     // Catch: android.database.SQLException -> L1c
            r1.insert(r3, r0)     // Catch: android.database.SQLException -> L1c
            goto Lc
        L1c:
            r1 = move-exception
            r2.checkUniquenessException(r1)
            androidx.room.EntityDeleteOrUpdateAdapter<T> r1 = r2.updateAdapter
            r1.handle(r3, r0)
            goto Lc
        L26:
            return
    }

    public final void upsert(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r2, @org.jetbrains.annotations.Nullable T r3) {
            r1 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.room.EntityInsertAdapter<T> r0 = r1.entityInsertAdapter     // Catch: android.database.SQLException -> Lb
            r0.insert(r2, r3)     // Catch: android.database.SQLException -> Lb
            return
        Lb:
            r0 = move-exception
            r1.checkUniquenessException(r0)
            androidx.room.EntityDeleteOrUpdateAdapter<T> r0 = r1.updateAdapter
            r0.handle(r2, r3)
            return
    }

    public final void upsert(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r5, @org.jetbrains.annotations.Nullable T[] r6) {
            r4 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r5, r0)
            if (r6 != 0) goto L8
            goto L20
        L8:
            int r0 = r6.length
            r1 = 0
        La:
            if (r1 >= r0) goto L20
            r2 = r6[r1]
            androidx.room.EntityInsertAdapter<T> r3 = r4.entityInsertAdapter     // Catch: android.database.SQLException -> L14
            r3.insert(r5, r2)     // Catch: android.database.SQLException -> L14
            goto L1d
        L14:
            r3 = move-exception
            r4.checkUniquenessException(r3)
            androidx.room.EntityDeleteOrUpdateAdapter<T> r3 = r4.updateAdapter
            r3.handle(r5, r2)
        L1d:
            int r1 = r1 + 1
            goto La
        L20:
            return
    }

    public final long upsertAndReturnId(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r2, @org.jetbrains.annotations.Nullable T r3) {
            r1 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.room.EntityInsertAdapter<T> r0 = r1.entityInsertAdapter     // Catch: android.database.SQLException -> Lc
            long r2 = r0.insertAndReturnId(r2, r3)     // Catch: android.database.SQLException -> Lc
            return r2
        Lc:
            r0 = move-exception
            r1.checkUniquenessException(r0)
            androidx.room.EntityDeleteOrUpdateAdapter<T> r0 = r1.updateAdapter
            r0.handle(r2, r3)
            r2 = -1
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final long[] upsertAndReturnIdsArray(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r6, @org.jetbrains.annotations.Nullable java.util.Collection<? extends T> r7) {
            r5 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r6, r0)
            r0 = 0
            if (r7 != 0) goto Lb
            long[] r6 = new long[r0]
            return r6
        Lb:
            int r1 = r7.size()
            long[] r2 = new long[r1]
        L11:
            if (r0 >= r1) goto L38
            androidx.room.EntityInsertAdapter<T> r3 = r5.entityInsertAdapter     // Catch: android.database.SQLException -> L21
            r4 = r7
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch: android.database.SQLException -> L21
            java.lang.Object r4 = kotlin.collections.f0.k2(r4, r0)     // Catch: android.database.SQLException -> L21
            long r3 = r3.insertAndReturnId(r6, r4)     // Catch: android.database.SQLException -> L21
            goto L33
        L21:
            r3 = move-exception
            r5.checkUniquenessException(r3)
            androidx.room.EntityDeleteOrUpdateAdapter<T> r3 = r5.updateAdapter
            r4 = r7
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.lang.Object r4 = kotlin.collections.f0.k2(r4, r0)
            r3.handle(r6, r4)
            r3 = -1
        L33:
            r2[r0] = r3
            int r0 = r0 + 1
            goto L11
        L38:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final long[] upsertAndReturnIdsArray(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r6, @org.jetbrains.annotations.Nullable T[] r7) {
            r5 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r6, r0)
            r0 = 0
            if (r7 != 0) goto Lb
            long[] r6 = new long[r0]
            return r6
        Lb:
            int r1 = r7.length
            long[] r2 = new long[r1]
        Le:
            if (r0 >= r1) goto L2b
            androidx.room.EntityInsertAdapter<T> r3 = r5.entityInsertAdapter     // Catch: android.database.SQLException -> L19
            r4 = r7[r0]     // Catch: android.database.SQLException -> L19
            long r3 = r3.insertAndReturnId(r6, r4)     // Catch: android.database.SQLException -> L19
            goto L26
        L19:
            r3 = move-exception
            r5.checkUniquenessException(r3)
            androidx.room.EntityDeleteOrUpdateAdapter<T> r3 = r5.updateAdapter
            r4 = r7[r0]
            r3.handle(r6, r4)
            r3 = -1
        L26:
            r2[r0] = r3
            int r0 = r0 + 1
            goto Le
        L2b:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.Long[] upsertAndReturnIdsArrayBox(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r6, @org.jetbrains.annotations.Nullable java.util.Collection<? extends T> r7) {
            r5 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r6, r0)
            r0 = 0
            if (r7 != 0) goto Lb
            java.lang.Long[] r6 = new java.lang.Long[r0]
            return r6
        Lb:
            int r1 = r7.size()
            java.lang.Long[] r2 = new java.lang.Long[r1]
        L11:
            if (r0 >= r1) goto L3c
            androidx.room.EntityInsertAdapter<T> r3 = r5.entityInsertAdapter     // Catch: android.database.SQLException -> L21
            r4 = r7
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch: android.database.SQLException -> L21
            java.lang.Object r4 = kotlin.collections.f0.k2(r4, r0)     // Catch: android.database.SQLException -> L21
            long r3 = r3.insertAndReturnId(r6, r4)     // Catch: android.database.SQLException -> L21
            goto L33
        L21:
            r3 = move-exception
            r5.checkUniquenessException(r3)
            androidx.room.EntityDeleteOrUpdateAdapter<T> r3 = r5.updateAdapter
            r4 = r7
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.lang.Object r4 = kotlin.collections.f0.k2(r4, r0)
            r3.handle(r6, r4)
            r3 = -1
        L33:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2[r0] = r3
            int r0 = r0 + 1
            goto L11
        L3c:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.Long[] upsertAndReturnIdsArrayBox(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r6, @org.jetbrains.annotations.Nullable T[] r7) {
            r5 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r6, r0)
            r0 = 0
            if (r7 != 0) goto Lb
            java.lang.Long[] r6 = new java.lang.Long[r0]
            return r6
        Lb:
            int r1 = r7.length
            java.lang.Long[] r2 = new java.lang.Long[r1]
        Le:
            if (r0 >= r1) goto L2f
            androidx.room.EntityInsertAdapter<T> r3 = r5.entityInsertAdapter     // Catch: android.database.SQLException -> L19
            r4 = r7[r0]     // Catch: android.database.SQLException -> L19
            long r3 = r3.insertAndReturnId(r6, r4)     // Catch: android.database.SQLException -> L19
            goto L26
        L19:
            r3 = move-exception
            r5.checkUniquenessException(r3)
            androidx.room.EntityDeleteOrUpdateAdapter<T> r3 = r5.updateAdapter
            r4 = r7[r0]
            r3.handle(r6, r4)
            r3 = -1
        L26:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2[r0] = r3
            int r0 = r0 + 1
            goto Le
        L2f:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Long> upsertAndReturnIdsList(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r5, @org.jetbrains.annotations.Nullable java.util.Collection<? extends T> r6) {
            r4 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r5, r0)
            if (r6 != 0) goto Lc
            java.util.List r5 = kotlin.collections.f0.J()
            return r5
        Lc:
            java.util.List r0 = kotlin.collections.f0.j()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L16:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r6.next()
            androidx.room.EntityInsertAdapter<T> r2 = r4.entityInsertAdapter     // Catch: android.database.SQLException -> L2e
            long r2 = r2.insertAndReturnId(r5, r1)     // Catch: android.database.SQLException -> L2e
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: android.database.SQLException -> L2e
            r0.add(r2)     // Catch: android.database.SQLException -> L2e
            goto L16
        L2e:
            r2 = move-exception
            r4.checkUniquenessException(r2)
            androidx.room.EntityDeleteOrUpdateAdapter<T> r2 = r4.updateAdapter
            r2.handle(r5, r1)
            r1 = -1
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.add(r1)
            goto L16
        L41:
            java.util.List r5 = kotlin.collections.f0.b(r0)
            return r5
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Long> upsertAndReturnIdsList(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r7, @org.jetbrains.annotations.Nullable T[] r8) {
            r6 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r7, r0)
            if (r8 != 0) goto Lc
            java.util.List r7 = kotlin.collections.f0.J()
            return r7
        Lc:
            java.util.List r0 = kotlin.collections.f0.j()
            int r1 = r8.length
            r2 = 0
        L12:
            if (r2 >= r1) goto L39
            r3 = r8[r2]
            androidx.room.EntityInsertAdapter<T> r4 = r6.entityInsertAdapter     // Catch: android.database.SQLException -> L24
            long r4 = r4.insertAndReturnId(r7, r3)     // Catch: android.database.SQLException -> L24
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: android.database.SQLException -> L24
            r0.add(r4)     // Catch: android.database.SQLException -> L24
            goto L36
        L24:
            r4 = move-exception
            r6.checkUniquenessException(r4)
            androidx.room.EntityDeleteOrUpdateAdapter<T> r4 = r6.updateAdapter
            r4.handle(r7, r3)
            r3 = -1
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.add(r3)
        L36:
            int r2 = r2 + 1
            goto L12
        L39:
            java.util.List r7 = kotlin.collections.f0.b(r0)
            return r7
    }
}
