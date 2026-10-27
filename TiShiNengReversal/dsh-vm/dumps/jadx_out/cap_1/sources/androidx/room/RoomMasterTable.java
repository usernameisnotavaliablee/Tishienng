package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class RoomMasterTable {

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String COLUMN_ID = "id";

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String COLUMN_IDENTITY_HASH = "identity_hash";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CREATE_QUERY = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DEFAULT_ID = "42";

    @org.jetbrains.annotations.NotNull
    public static final androidx.room.RoomMasterTable INSTANCE = null;

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String NAME = "room_master_table";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String READ_QUERY = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TABLE_NAME = "room_master_table";

    static {
            androidx.room.RoomMasterTable r0 = new androidx.room.RoomMasterTable
            r0.<init>()
            androidx.room.RoomMasterTable.INSTANCE = r0
            return
    }

    private RoomMasterTable() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String createInsertQuery(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            java.lang.String r0 = "hash"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = "')"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
