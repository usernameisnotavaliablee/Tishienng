package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.Deprecated(message = "No longer used by generated code.", replaceWith = @kotlin.ReplaceWith(expression = "EntityDeleteOrUpdateAdapter", imports = {}))
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nEntityDeletionOrUpdateAdapter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntityDeletionOrUpdateAdapter.android.kt\nandroidx/room/EntityDeletionOrUpdateAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,105:1\n1863#2,2:106\n13402#3,2:108\n*S KotlinDebug\n*F\n+ 1 EntityDeletionOrUpdateAdapter.android.kt\nandroidx/room/EntityDeletionOrUpdateAdapter\n*L\n75#1:106,2\n95#1:108,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class EntityDeletionOrUpdateAdapter<T> extends androidx.room.SharedSQLiteStatement {
    public EntityDeletionOrUpdateAdapter(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r2) {
            r1 = this;
            java.lang.String r0 = "database"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>(r2)
            return
    }

    protected abstract void bind(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteStatement r1, T r2);

    @Override // androidx.room.SharedSQLiteStatement
    @org.jetbrains.annotations.NotNull
    protected abstract java.lang.String createQuery();

    public final int handle(T r2) {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteStatement r0 = r1.acquire()
            r1.bind(r0, r2)     // Catch: java.lang.Throwable -> Lf
            int r2 = r0.executeUpdateDelete()     // Catch: java.lang.Throwable -> Lf
            r1.release(r0)
            return r2
        Lf:
            r2 = move-exception
            r1.release(r0)
            throw r2
    }

    public final int handleMultiple(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends T> r4) {
            r3 = this;
            java.lang.String r0 = "entities"
            kotlin.jvm.internal.g0.p(r4, r0)
            androidx.sqlite.db.SupportSQLiteStatement r0 = r3.acquire()
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L21
            r1 = 0
        Le:
            boolean r2 = r4.hasNext()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L23
            java.lang.Object r2 = r4.next()     // Catch: java.lang.Throwable -> L21
            r3.bind(r0, r2)     // Catch: java.lang.Throwable -> L21
            int r2 = r0.executeUpdateDelete()     // Catch: java.lang.Throwable -> L21
            int r1 = r1 + r2
            goto Le
        L21:
            r4 = move-exception
            goto L27
        L23:
            r3.release(r0)
            return r1
        L27:
            r3.release(r0)
            throw r4
    }

    public final int handleMultiple(@org.jetbrains.annotations.NotNull T[] r6) {
            r5 = this;
            java.lang.String r0 = "entities"
            kotlin.jvm.internal.g0.p(r6, r0)
            androidx.sqlite.db.SupportSQLiteStatement r0 = r5.acquire()
            int r1 = r6.length     // Catch: java.lang.Throwable -> L1b
            r2 = 0
            r3 = 0
        Lc:
            if (r2 >= r1) goto L1d
            r4 = r6[r2]     // Catch: java.lang.Throwable -> L1b
            r5.bind(r0, r4)     // Catch: java.lang.Throwable -> L1b
            int r4 = r0.executeUpdateDelete()     // Catch: java.lang.Throwable -> L1b
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto Lc
        L1b:
            r6 = move-exception
            goto L21
        L1d:
            r5.release(r0)
            return r3
        L21:
            r5.release(r0)
            throw r6
    }
}
