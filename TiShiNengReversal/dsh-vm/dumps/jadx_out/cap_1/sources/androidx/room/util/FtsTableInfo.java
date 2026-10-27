package androidx.room.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class FtsTableInfo {

    @org.jetbrains.annotations.NotNull
    public static final androidx.room.util.FtsTableInfo.Companion Companion = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final java.util.Set<java.lang.String> columns;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final java.lang.String name;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final java.util.Set<java.lang.String> options;

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

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final androidx.room.util.FtsTableInfo read(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r3, @org.jetbrains.annotations.NotNull java.lang.String r4) {
                r2 = this;
                java.lang.String r0 = "connection"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "tableName"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.util.Set r0 = androidx.room.util.SchemaInfoUtilKt.readFtsColumns(r3, r4)
                java.util.Set r3 = androidx.room.util.SchemaInfoUtilKt.readFtsOptions(r3, r4)
                androidx.room.util.FtsTableInfo r1 = new androidx.room.util.FtsTableInfo
                r1.<init>(r4, r0, r3)
                return r1
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final androidx.room.util.FtsTableInfo read(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "database"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "tableName"
                kotlin.jvm.internal.g0.p(r3, r0)
                androidx.room.driver.SupportSQLiteConnection r0 = new androidx.room.driver.SupportSQLiteConnection
                r0.<init>(r2)
                androidx.room.util.FtsTableInfo r2 = r1.read(r0, r3)
                return r2
        }
    }

    static {
            androidx.room.util.FtsTableInfo$Companion r0 = new androidx.room.util.FtsTableInfo$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.room.util.FtsTableInfo.Companion = r0
            return
    }

    public FtsTableInfo(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.util.Set<java.lang.String> r3, @org.jetbrains.annotations.NotNull java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "columns"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "createSql"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Set r4 = androidx.room.util.SchemaInfoUtilKt.parseFtsOptions(r4)
            r1.<init>(r2, r3, r4)
            return
    }

    public FtsTableInfo(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.util.Set<java.lang.String> r3, @org.jetbrains.annotations.NotNull java.util.Set<java.lang.String> r4) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "columns"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>()
            r1.name = r2
            r1.columns = r3
            r1.options = r4
            return
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final androidx.room.util.FtsTableInfo read(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
            androidx.room.util.FtsTableInfo$Companion r0 = androidx.room.util.FtsTableInfo.Companion
            androidx.room.util.FtsTableInfo r1 = r0.read(r1, r2)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final androidx.room.util.FtsTableInfo read(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
            androidx.room.util.FtsTableInfo$Companion r0 = androidx.room.util.FtsTableInfo.Companion
            androidx.room.util.FtsTableInfo r1 = r0.read(r1, r2)
            return r1
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
            r0 = this;
            boolean r1 = androidx.room.util.FtsTableInfoKt.equalsCommon(r0, r1)
            return r1
    }

    public int hashCode() {
            r1 = this;
            int r0 = androidx.room.util.FtsTableInfoKt.hashCodeCommon(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = androidx.room.util.FtsTableInfoKt.toStringCommon(r1)
            return r0
    }
}
