package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class Room {

    @org.jetbrains.annotations.NotNull
    public static final androidx.room.Room INSTANCE = null;

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String LOG_TAG = "ROOM";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String MASTER_TABLE_NAME = "room_master_table";

    static {
            androidx.room.Room r0 = new androidx.room.Room
            r0.<init>()
            androidx.room.Room.INSTANCE = r0
            return
    }

    private Room() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final <T extends androidx.room.RoomDatabase> androidx.room.RoomDatabase.Builder<T> databaseBuilder(@org.jetbrains.annotations.NotNull android.content.Context r1, @org.jetbrains.annotations.NotNull java.lang.Class<T> r2, @org.jetbrains.annotations.Nullable java.lang.String r3) {
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "klass"
            kotlin.jvm.internal.g0.p(r2, r0)
            if (r3 == 0) goto L15
            boolean r0 = kotlin.text.u.M3(r3)
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = 0
            goto L16
        L15:
            r0 = 1
        L16:
            if (r0 != 0) goto L2e
            java.lang.String r0 = ":memory:"
            boolean r0 = kotlin.jvm.internal.g0.g(r3, r0)
            if (r0 != 0) goto L26
            androidx.room.RoomDatabase$Builder r0 = new androidx.room.RoomDatabase$Builder
            r0.<init>(r1, r2, r3)
            return r0
        L26:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder"
            r1.<init>(r2)
            throw r1
        L2e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder"
            r1.<init>(r2)
            throw r1
    }

    public static /* synthetic */ androidx.room.RoomDatabase.Builder databaseBuilder$default(androidx.room.Room r0, android.content.Context r1, java.lang.String r2, kotlin.jvm.functions.Function0 r3, int r4, java.lang.Object r5) {
            r0 = 4
            r4 = r4 & r0
            if (r4 == 0) goto L9
            kotlin.jvm.internal.g0.w()
            androidx.room.Room$databaseBuilder$3 r3 = androidx.room.Room$databaseBuilder$3.INSTANCE
        L9:
            java.lang.String r4 = "context"
            kotlin.jvm.internal.g0.p(r1, r4)
            java.lang.String r4 = "name"
            kotlin.jvm.internal.g0.p(r2, r4)
            java.lang.String r4 = "factory"
            kotlin.jvm.internal.g0.p(r3, r4)
            boolean r4 = kotlin.text.u.M3(r2)
            if (r4 != 0) goto L3f
            java.lang.String r4 = ":memory:"
            boolean r4 = kotlin.jvm.internal.g0.g(r2, r4)
            if (r4 != 0) goto L37
            androidx.room.RoomDatabase$Builder r4 = new androidx.room.RoomDatabase$Builder
            java.lang.String r5 = "T"
            kotlin.jvm.internal.g0.y(r0, r5)
            java.lang.Class<androidx.room.RoomDatabase> r0 = androidx.room.RoomDatabase.class
            kotlin.reflect.d r0 = kotlin.jvm.internal.o0.d(r0)
            r4.<init>(r0, r2, r3, r1)
            return r4
        L37:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder()."
            r0.<init>(r1)
            throw r0
        L3f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot build a database with empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder()."
            r0.<init>(r1)
            throw r0
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final <T extends androidx.room.RoomDatabase> androidx.room.RoomDatabase.Builder<T> inMemoryDatabaseBuilder(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.NotNull java.lang.Class<T> r3) {
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "klass"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.room.RoomDatabase$Builder r0 = new androidx.room.RoomDatabase$Builder
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static /* synthetic */ androidx.room.RoomDatabase.Builder inMemoryDatabaseBuilder$default(androidx.room.Room r0, android.content.Context r1, kotlin.jvm.functions.Function0 r2, int r3, java.lang.Object r4) {
            r0 = r3 & 2
            if (r0 == 0) goto L9
            kotlin.jvm.internal.g0.w()
            androidx.room.Room$inMemoryDatabaseBuilder$1 r2 = androidx.room.Room$inMemoryDatabaseBuilder$1.INSTANCE
        L9:
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "factory"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.room.RoomDatabase$Builder r0 = new androidx.room.RoomDatabase$Builder
            r3 = 4
            java.lang.String r4 = "T"
            kotlin.jvm.internal.g0.y(r3, r4)
            java.lang.Class<androidx.room.RoomDatabase> r3 = androidx.room.RoomDatabase.class
            kotlin.reflect.d r3 = kotlin.jvm.internal.o0.d(r3)
            r4 = 0
            r0.<init>(r3, r4, r2, r1)
            return r0
    }

    public final /* synthetic */ <T extends androidx.room.RoomDatabase> androidx.room.RoomDatabase.Builder<T> databaseBuilder(android.content.Context r4, java.lang.String r5, kotlin.jvm.functions.Function0<? extends T> r6) {
            r3 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "factory"
            kotlin.jvm.internal.g0.p(r6, r0)
            boolean r0 = kotlin.text.u.M3(r5)
            if (r0 != 0) goto L37
            java.lang.String r0 = ":memory:"
            boolean r0 = kotlin.jvm.internal.g0.g(r5, r0)
            if (r0 != 0) goto L2f
            androidx.room.RoomDatabase$Builder r0 = new androidx.room.RoomDatabase$Builder
            r1 = 4
            java.lang.String r2 = "T"
            kotlin.jvm.internal.g0.y(r1, r2)
            java.lang.Class<androidx.room.RoomDatabase> r1 = androidx.room.RoomDatabase.class
            kotlin.reflect.d r1 = kotlin.jvm.internal.o0.d(r1)
            r0.<init>(r1, r5, r6, r4)
            return r0
        L2f:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder()."
            r4.<init>(r5)
            throw r4
        L37:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Cannot build a database with empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder()."
            r4.<init>(r5)
            throw r4
    }

    public final /* synthetic */ <T extends androidx.room.RoomDatabase> androidx.room.RoomDatabase.Builder<T> inMemoryDatabaseBuilder(android.content.Context r4, kotlin.jvm.functions.Function0<? extends T> r5) {
            r3 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "factory"
            kotlin.jvm.internal.g0.p(r5, r0)
            androidx.room.RoomDatabase$Builder r0 = new androidx.room.RoomDatabase$Builder
            r1 = 4
            java.lang.String r2 = "T"
            kotlin.jvm.internal.g0.y(r1, r2)
            java.lang.Class<androidx.room.RoomDatabase> r1 = androidx.room.RoomDatabase.class
            kotlin.reflect.d r1 = kotlin.jvm.internal.o0.d(r1)
            r2 = 0
            r0.<init>(r1, r2, r5, r4)
            return r0
    }
}
