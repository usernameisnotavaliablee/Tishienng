package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRoomDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabase.kt\nandroidx/room/RoomDatabaseKt__RoomDatabaseKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,596:1\n1#2:597\n216#3,2:598\n*S KotlinDebug\n*F\n+ 1 RoomDatabase.kt\nandroidx/room/RoomDatabaseKt__RoomDatabaseKt\n*L\n565#1:598,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final /* synthetic */ class RoomDatabaseKt__RoomDatabaseKt {
    @org.jetbrains.annotations.Nullable
    public static final <R> java.lang.Object useReaderConnection(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.room.Transactor, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r5) {
            kotlinx.coroutines.r0 r0 = r3.getCoroutineScope()
            kotlin.coroutines.i r0 = r0.getCoroutineContext()
            androidx.room.RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$2 r1 = new androidx.room.RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$2
            r2 = 0
            r1.<init>(r3, r4, r2)
            java.lang.Object r3 = kotlinx.coroutines.i.h(r0, r1, r5)
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public static final <R> java.lang.Object useWriterConnection(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.room.Transactor, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r7) {
            boolean r0 = r7 instanceof androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1 r0 = (androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1 r0 = new androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            androidx.room.RoomDatabase r5 = (androidx.room.RoomDatabase) r5
            kotlin.g0.n(r7)
            goto L51
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.g0.n(r7)
            kotlinx.coroutines.r0 r7 = r5.getCoroutineScope()
            kotlin.coroutines.i r7 = r7.getCoroutineContext()
            androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2 r2 = new androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r7 = kotlinx.coroutines.i.h(r7, r2, r0)
            if (r7 != r1) goto L51
            return r1
        L51:
            androidx.room.InvalidationTracker r5 = r5.getInvalidationTracker()
            r5.refreshAsync()
            return r7
    }

    public static final void validateAutoMigrations(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r9, @org.jetbrains.annotations.NotNull androidx.room.DatabaseConfiguration r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "configuration"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r1 = r9.getRequiredAutoMigrationSpecClasses()
            java.util.List<androidx.room.migration.AutoMigrationSpec> r2 = r10.autoMigrationSpecs
            int r2 = r2.size()
            boolean[] r3 = new boolean[r2]
            java.util.Iterator r1 = r1.iterator()
        L1f:
            boolean r4 = r1.hasNext()
            r5 = -1
            if (r4 == 0) goto L7f
            java.lang.Object r4 = r1.next()
            kotlin.reflect.d r4 = (kotlin.reflect.d) r4
            java.util.List<androidx.room.migration.AutoMigrationSpec> r6 = r10.autoMigrationSpecs
            java.util.Collection r6 = (java.util.Collection) r6
            int r6 = r6.size()
            int r6 = r6 + r5
            if (r6 < 0) goto L4f
        L37:
            int r7 = r6 + (-1)
            java.util.List<androidx.room.migration.AutoMigrationSpec> r8 = r10.autoMigrationSpecs
            java.lang.Object r8 = r8.get(r6)
            boolean r8 = r4.C(r8)
            if (r8 == 0) goto L4a
            r5 = 1
            r3[r6] = r5
            r5 = r6
            goto L4f
        L4a:
            if (r7 >= 0) goto L4d
            goto L4f
        L4d:
            r6 = r7
            goto L37
        L4f:
            if (r5 < 0) goto L5b
            java.util.List<androidx.room.migration.AutoMigrationSpec> r6 = r10.autoMigrationSpecs
            java.lang.Object r5 = r6.get(r5)
            r0.put(r4, r5)
            goto L1f
        L5b:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "A required auto migration spec ("
            r9.append(r10)
            java.lang.String r10 = r4.x()
            r9.append(r10)
            java.lang.String r10 = ") is missing in the database configuration."
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L7f:
            java.util.List<androidx.room.migration.AutoMigrationSpec> r1 = r10.autoMigrationSpecs
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            int r1 = r1 + r5
            if (r1 < 0) goto L9f
        L8a:
            int r4 = r1 + (-1)
            if (r1 >= r2) goto L97
            boolean r1 = r3[r1]
            if (r1 == 0) goto L97
            if (r4 >= 0) goto L95
            goto L9f
        L95:
            r1 = r4
            goto L8a
        L97:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder."
            r9.<init>(r10)
            throw r9
        L9f:
            java.util.List r9 = r9.createAutoMigrations(r0)
            java.util.Iterator r9 = r9.iterator()
        La7:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lc5
            java.lang.Object r0 = r9.next()
            androidx.room.migration.Migration r0 = (androidx.room.migration.Migration) r0
            androidx.room.RoomDatabase$MigrationContainer r1 = r10.migrationContainer
            int r2 = r0.startVersion
            int r3 = r0.endVersion
            boolean r1 = r1.contains(r2, r3)
            if (r1 != 0) goto La7
            androidx.room.RoomDatabase$MigrationContainer r1 = r10.migrationContainer
            r1.addMigration(r0)
            goto La7
        Lc5:
            return
    }

    public static final void validateMigrationsNotRequired(@org.jetbrains.annotations.NotNull java.util.Set<java.lang.Integer> r2, @org.jetbrains.annotations.NotNull java.util.Set<java.lang.Integer> r3) {
            java.lang.String r0 = "migrationStartAndEndVersions"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "migrationsNotRequiredFrom"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L4a
            java.util.Iterator r2 = r2.iterator()
        L14:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r2.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            boolean r1 = r3.contains(r1)
            if (r1 != 0) goto L2f
            goto L14
        L2f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        L4a:
            return
    }

    public static final void validateTypeConverters(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase r9, @org.jetbrains.annotations.NotNull androidx.room.DatabaseConfiguration r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "configuration"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.util.Map r0 = r9.getRequiredTypeConverterClassesMap$room_runtime_release()
            java.util.List<java.lang.Object> r1 = r10.typeConverters
            int r1 = r1.size()
            boolean[] r1 = new boolean[r1]
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r2 = r0.hasNext()
            r3 = -1
            if (r2 == 0) goto La6
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getKey()
            kotlin.reflect.d r4 = (kotlin.reflect.d) r4
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r2 = r2.iterator()
        L3b:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L1e
            java.lang.Object r5 = r2.next()
            kotlin.reflect.d r5 = (kotlin.reflect.d) r5
            java.util.List<java.lang.Object> r6 = r10.typeConverters
            java.util.Collection r6 = (java.util.Collection) r6
            int r6 = r6.size()
            int r6 = r6 + r3
            if (r6 < 0) goto L69
        L52:
            int r7 = r6 + (-1)
            java.util.List<java.lang.Object> r8 = r10.typeConverters
            java.lang.Object r8 = r8.get(r6)
            boolean r8 = r5.C(r8)
            if (r8 == 0) goto L64
            r7 = 1
            r1[r6] = r7
            goto L6a
        L64:
            if (r7 >= 0) goto L67
            goto L69
        L67:
            r6 = r7
            goto L52
        L69:
            r6 = -1
        L6a:
            if (r6 < 0) goto L76
            java.util.List<java.lang.Object> r7 = r10.typeConverters
            java.lang.Object r6 = r7.get(r6)
            r9.addTypeConverter$room_runtime_release(r5, r6)
            goto L3b
        L76:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "A required type converter ("
            r9.append(r10)
            java.lang.String r10 = r5.x()
            r9.append(r10)
            java.lang.String r10 = ") for "
            r9.append(r10)
            java.lang.String r10 = r4.x()
            r9.append(r10)
            java.lang.String r10 = " is missing in the database configuration."
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        La6:
            java.util.List<java.lang.Object> r9 = r10.typeConverters
            java.util.Collection r9 = (java.util.Collection) r9
            int r9 = r9.size()
            int r9 = r9 + r3
            if (r9 < 0) goto Lde
        Lb1:
            int r0 = r9 + (-1)
            boolean r2 = r1[r9]
            if (r2 == 0) goto Lbc
            if (r0 >= 0) goto Lba
            goto Lde
        Lba:
            r9 = r0
            goto Lb1
        Lbc:
            java.util.List<java.lang.Object> r10 = r10.typeConverters
            java.lang.Object r9 = r10.get(r9)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected type converter "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder."
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r10.<init>(r9)
            throw r10
        Lde:
            return
    }
}
