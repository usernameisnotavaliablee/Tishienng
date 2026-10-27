package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nEntityInsertAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntityInsertAdapter.kt\nandroidx/room/EntityInsertAdapter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,264:1\n13402#2,2:265\n1863#3,2:267\n*S KotlinDebug\n*F\n+ 1 EntityInsertAdapter.kt\nandroidx/room/EntityInsertAdapter\n*L\n223#1:265,2\n250#1:267,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class EntityInsertAdapter<T> {
    public EntityInsertAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    protected abstract void bind(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteStatement r1, T r2);

    @org.jetbrains.annotations.NotNull
    protected abstract java.lang.String createQuery();

    public final void insert(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r2, @org.jetbrains.annotations.Nullable java.lang.Iterable<? extends T> r3) {
            r1 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r2, r0)
            if (r3 != 0) goto L8
            return
        L8:
            java.lang.String r0 = r1.createQuery()
            androidx.sqlite.SQLiteStatement r2 = r2.prepare(r0)
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L2a
        L14:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L14
            r1.bind(r2, r0)     // Catch: java.lang.Throwable -> L2a
            r2.step()     // Catch: java.lang.Throwable -> L2a
            r2.reset()     // Catch: java.lang.Throwable -> L2a
            goto L14
        L2a:
            r3 = move-exception
            goto L33
        L2c:
            kotlin.n1 r3 = kotlin.n1.a     // Catch: java.lang.Throwable -> L2a
            r3 = 0
            kotlin.jdk7.a.c(r2, r3)
            return
        L33:
            throw r3     // Catch: java.lang.Throwable -> L34
        L34:
            r0 = move-exception
            kotlin.jdk7.a.c(r2, r3)
            throw r0
    }

    public final void insert(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r2, @org.jetbrains.annotations.Nullable T r3) {
            r1 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r2, r0)
            if (r3 != 0) goto L8
            return
        L8:
            java.lang.String r0 = r1.createQuery()
            androidx.sqlite.SQLiteStatement r2 = r2.prepare(r0)
            r1.bind(r2, r3)     // Catch: java.lang.Throwable -> L1b
            r2.step()     // Catch: java.lang.Throwable -> L1b
            r3 = 0
            kotlin.jdk7.a.c(r2, r3)
            return
        L1b:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L1d
        L1d:
            r0 = move-exception
            kotlin.jdk7.a.c(r2, r3)
            throw r0
    }

    public final void insert(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r2, @org.jetbrains.annotations.Nullable T[] r3) {
            r1 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r2, r0)
            if (r3 != 0) goto L8
            return
        L8:
            java.lang.String r0 = r1.createQuery()
            androidx.sqlite.SQLiteStatement r2 = r2.prepare(r0)
            java.util.Iterator r3 = kotlin.jvm.internal.h.a(r3)     // Catch: java.lang.Throwable -> L2a
        L14:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L14
            r1.bind(r2, r0)     // Catch: java.lang.Throwable -> L2a
            r2.step()     // Catch: java.lang.Throwable -> L2a
            r2.reset()     // Catch: java.lang.Throwable -> L2a
            goto L14
        L2a:
            r3 = move-exception
            goto L33
        L2c:
            kotlin.n1 r3 = kotlin.n1.a     // Catch: java.lang.Throwable -> L2a
            r3 = 0
            kotlin.jdk7.a.c(r2, r3)
            return
        L33:
            throw r3     // Catch: java.lang.Throwable -> L34
        L34:
            r0 = move-exception
            kotlin.jdk7.a.c(r2, r3)
            throw r0
    }

    public final long insertAndReturnId(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r2, @org.jetbrains.annotations.Nullable T r3) {
            r1 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r2, r0)
            if (r3 != 0) goto La
            r2 = -1
            return r2
        La:
            java.lang.String r0 = r1.createQuery()
            androidx.sqlite.SQLiteStatement r0 = r2.prepare(r0)
            r1.bind(r0, r3)     // Catch: java.lang.Throwable -> L21
            r0.step()     // Catch: java.lang.Throwable -> L21
            r3 = 0
            kotlin.jdk7.a.c(r0, r3)
            long r2 = androidx.room.util.SQLiteConnectionUtil.getLastInsertedRowId(r2)
            return r2
        L21:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L23
        L23:
            r3 = move-exception
            kotlin.jdk7.a.c(r0, r2)
            throw r3
    }

    @org.jetbrains.annotations.NotNull
    public final long[] insertAndReturnIdsArray(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r7, @org.jetbrains.annotations.Nullable java.util.Collection<? extends T> r8) {
            r6 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r7, r0)
            r0 = 0
            if (r8 != 0) goto Lb
            long[] r7 = new long[r0]
            return r7
        Lb:
            java.lang.String r1 = r6.createQuery()
            androidx.sqlite.SQLiteStatement r1 = r7.prepare(r1)
            int r2 = r8.size()     // Catch: java.lang.Throwable -> L32
            long[] r3 = new long[r2]     // Catch: java.lang.Throwable -> L32
        L19:
            if (r0 >= r2) goto L3b
            r4 = r8
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = kotlin.collections.f0.k2(r4, r0)     // Catch: java.lang.Throwable -> L32
            if (r4 == 0) goto L34
            r6.bind(r1, r4)     // Catch: java.lang.Throwable -> L32
            r1.step()     // Catch: java.lang.Throwable -> L32
            r1.reset()     // Catch: java.lang.Throwable -> L32
            long r4 = androidx.room.util.SQLiteConnectionUtil.getLastInsertedRowId(r7)     // Catch: java.lang.Throwable -> L32
            goto L36
        L32:
            r7 = move-exception
            goto L40
        L34:
            r4 = -1
        L36:
            r3[r0] = r4     // Catch: java.lang.Throwable -> L32
            int r0 = r0 + 1
            goto L19
        L3b:
            r7 = 0
            kotlin.jdk7.a.c(r1, r7)
            return r3
        L40:
            throw r7     // Catch: java.lang.Throwable -> L41
        L41:
            r8 = move-exception
            kotlin.jdk7.a.c(r1, r7)
            throw r8
    }

    @org.jetbrains.annotations.NotNull
    public final long[] insertAndReturnIdsArray(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r7, @org.jetbrains.annotations.Nullable T[] r8) {
            r6 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r7, r0)
            r0 = 0
            if (r8 != 0) goto Lb
            long[] r7 = new long[r0]
            return r7
        Lb:
            java.lang.String r1 = r6.createQuery()
            androidx.sqlite.SQLiteStatement r1 = r7.prepare(r1)
            int r2 = r8.length     // Catch: java.lang.Throwable -> L2a
            long[] r3 = new long[r2]     // Catch: java.lang.Throwable -> L2a
        L16:
            if (r0 >= r2) goto L33
            r4 = r8[r0]     // Catch: java.lang.Throwable -> L2a
            if (r4 == 0) goto L2c
            r6.bind(r1, r4)     // Catch: java.lang.Throwable -> L2a
            r1.step()     // Catch: java.lang.Throwable -> L2a
            r1.reset()     // Catch: java.lang.Throwable -> L2a
            long r4 = androidx.room.util.SQLiteConnectionUtil.getLastInsertedRowId(r7)     // Catch: java.lang.Throwable -> L2a
            goto L2e
        L2a:
            r7 = move-exception
            goto L38
        L2c:
            r4 = -1
        L2e:
            r3[r0] = r4     // Catch: java.lang.Throwable -> L2a
            int r0 = r0 + 1
            goto L16
        L33:
            r7 = 0
            kotlin.jdk7.a.c(r1, r7)
            return r3
        L38:
            throw r7     // Catch: java.lang.Throwable -> L39
        L39:
            r8 = move-exception
            kotlin.jdk7.a.c(r1, r7)
            throw r8
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.Long[] insertAndReturnIdsArrayBox(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r7, @org.jetbrains.annotations.Nullable java.util.Collection<? extends T> r8) {
            r6 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r7, r0)
            r0 = 0
            if (r8 != 0) goto Lb
            java.lang.Long[] r7 = new java.lang.Long[r0]
            return r7
        Lb:
            java.lang.String r1 = r6.createQuery()
            androidx.sqlite.SQLiteStatement r1 = r7.prepare(r1)
            int r2 = r8.size()     // Catch: java.lang.Throwable -> L32
            java.lang.Long[] r3 = new java.lang.Long[r2]     // Catch: java.lang.Throwable -> L32
        L19:
            if (r0 >= r2) goto L3f
            r4 = r8
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = kotlin.collections.f0.k2(r4, r0)     // Catch: java.lang.Throwable -> L32
            if (r4 == 0) goto L34
            r6.bind(r1, r4)     // Catch: java.lang.Throwable -> L32
            r1.step()     // Catch: java.lang.Throwable -> L32
            r1.reset()     // Catch: java.lang.Throwable -> L32
            long r4 = androidx.room.util.SQLiteConnectionUtil.getLastInsertedRowId(r7)     // Catch: java.lang.Throwable -> L32
            goto L36
        L32:
            r7 = move-exception
            goto L44
        L34:
            r4 = -1
        L36:
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L32
            r3[r0] = r4     // Catch: java.lang.Throwable -> L32
            int r0 = r0 + 1
            goto L19
        L3f:
            r7 = 0
            kotlin.jdk7.a.c(r1, r7)
            return r3
        L44:
            throw r7     // Catch: java.lang.Throwable -> L45
        L45:
            r8 = move-exception
            kotlin.jdk7.a.c(r1, r7)
            throw r8
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.Long[] insertAndReturnIdsArrayBox(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r7, @org.jetbrains.annotations.Nullable T[] r8) {
            r6 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r7, r0)
            r0 = 0
            if (r8 != 0) goto Lb
            java.lang.Long[] r7 = new java.lang.Long[r0]
            return r7
        Lb:
            java.lang.String r1 = r6.createQuery()
            androidx.sqlite.SQLiteStatement r1 = r7.prepare(r1)
            int r2 = r8.length     // Catch: java.lang.Throwable -> L2a
            java.lang.Long[] r3 = new java.lang.Long[r2]     // Catch: java.lang.Throwable -> L2a
        L16:
            if (r0 >= r2) goto L37
            r4 = r8[r0]     // Catch: java.lang.Throwable -> L2a
            if (r4 == 0) goto L2c
            r6.bind(r1, r4)     // Catch: java.lang.Throwable -> L2a
            r1.step()     // Catch: java.lang.Throwable -> L2a
            r1.reset()     // Catch: java.lang.Throwable -> L2a
            long r4 = androidx.room.util.SQLiteConnectionUtil.getLastInsertedRowId(r7)     // Catch: java.lang.Throwable -> L2a
            goto L2e
        L2a:
            r7 = move-exception
            goto L3c
        L2c:
            r4 = -1
        L2e:
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L2a
            r3[r0] = r4     // Catch: java.lang.Throwable -> L2a
            int r0 = r0 + 1
            goto L16
        L37:
            r7 = 0
            kotlin.jdk7.a.c(r1, r7)
            return r3
        L3c:
            throw r7     // Catch: java.lang.Throwable -> L3d
        L3d:
            r8 = move-exception
            kotlin.jdk7.a.c(r1, r7)
            throw r8
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Long> insertAndReturnIdsList(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r5, @org.jetbrains.annotations.Nullable java.util.Collection<? extends T> r6) {
            r4 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r5, r0)
            if (r6 != 0) goto Lc
            java.util.List r5 = kotlin.collections.f0.J()
            return r5
        Lc:
            java.util.List r0 = kotlin.collections.f0.j()
            java.lang.String r1 = r4.createQuery()
            androidx.sqlite.SQLiteStatement r1 = r5.prepare(r1)
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch: java.lang.Throwable -> L3f
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L3f
        L1e:
            boolean r2 = r6.hasNext()     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L4b
            java.lang.Object r2 = r6.next()     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L41
            r4.bind(r1, r2)     // Catch: java.lang.Throwable -> L3f
            r1.step()     // Catch: java.lang.Throwable -> L3f
            r1.reset()     // Catch: java.lang.Throwable -> L3f
            long r2 = androidx.room.util.SQLiteConnectionUtil.getLastInsertedRowId(r5)     // Catch: java.lang.Throwable -> L3f
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L3f
            r0.add(r2)     // Catch: java.lang.Throwable -> L3f
            goto L1e
        L3f:
            r5 = move-exception
            goto L56
        L41:
            r2 = -1
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L3f
            r0.add(r2)     // Catch: java.lang.Throwable -> L3f
            goto L1e
        L4b:
            kotlin.n1 r5 = kotlin.n1.a     // Catch: java.lang.Throwable -> L3f
            r5 = 0
            kotlin.jdk7.a.c(r1, r5)
            java.util.List r5 = kotlin.collections.f0.b(r0)
            return r5
        L56:
            throw r5     // Catch: java.lang.Throwable -> L57
        L57:
            r6 = move-exception
            kotlin.jdk7.a.c(r1, r5)
            throw r6
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Long> insertAndReturnIdsList(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r7, @org.jetbrains.annotations.Nullable T[] r8) {
            r6 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r7, r0)
            if (r8 != 0) goto Lc
            java.util.List r7 = kotlin.collections.f0.J()
            return r7
        Lc:
            java.util.List r0 = kotlin.collections.f0.j()
            java.lang.String r1 = r6.createQuery()
            androidx.sqlite.SQLiteStatement r1 = r7.prepare(r1)
            int r2 = r8.length     // Catch: java.lang.Throwable -> L35
            r3 = 0
        L1a:
            if (r3 >= r2) goto L43
            r4 = r8[r3]     // Catch: java.lang.Throwable -> L35
            if (r4 == 0) goto L37
            r6.bind(r1, r4)     // Catch: java.lang.Throwable -> L35
            r1.step()     // Catch: java.lang.Throwable -> L35
            r1.reset()     // Catch: java.lang.Throwable -> L35
            long r4 = androidx.room.util.SQLiteConnectionUtil.getLastInsertedRowId(r7)     // Catch: java.lang.Throwable -> L35
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L35
            r0.add(r4)     // Catch: java.lang.Throwable -> L35
            goto L40
        L35:
            r7 = move-exception
            goto L4e
        L37:
            r4 = -1
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L35
            r0.add(r4)     // Catch: java.lang.Throwable -> L35
        L40:
            int r3 = r3 + 1
            goto L1a
        L43:
            kotlin.n1 r7 = kotlin.n1.a     // Catch: java.lang.Throwable -> L35
            r7 = 0
            kotlin.jdk7.a.c(r1, r7)
            java.util.List r7 = kotlin.collections.f0.b(r0)
            return r7
        L4e:
            throw r7     // Catch: java.lang.Throwable -> L4f
        L4f:
            r8 = move-exception
            kotlin.jdk7.a.c(r1, r7)
            throw r8
    }
}
