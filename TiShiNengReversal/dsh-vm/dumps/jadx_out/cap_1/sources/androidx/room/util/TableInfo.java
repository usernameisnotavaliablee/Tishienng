package androidx.room.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class TableInfo {
    public static final int CREATED_FROM_DATABASE = 2;
    public static final int CREATED_FROM_ENTITY = 1;
    public static final int CREATED_FROM_UNKNOWN = 0;

    @org.jetbrains.annotations.NotNull
    public static final androidx.room.util.TableInfo.Companion Companion = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, androidx.room.util.TableInfo.Column> columns;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final java.util.Set<androidx.room.util.TableInfo.ForeignKey> foreignKeys;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    public final java.util.Set<androidx.room.util.TableInfo.Index> indices;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final java.lang.String name;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final class Column {

        @org.jetbrains.annotations.NotNull
        public static final androidx.room.util.TableInfo.Column.Companion Companion = null;

        @kotlin.jvm.JvmField
        public final int affinity;

        @kotlin.jvm.JvmField
        public final int createdFrom;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.Nullable
        public final java.lang.String defaultValue;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final java.lang.String name;

        @kotlin.jvm.JvmField
        public final boolean notNull;

        @kotlin.jvm.JvmField
        public final int primaryKeyPosition;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final java.lang.String type;

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
            public final boolean defaultValueEquals(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.Nullable java.lang.String r3) {
                    r1 = this;
                    java.lang.String r0 = "current"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    boolean r2 = androidx.room.util.TableInfoKt.defaultValueEqualsCommon(r2, r3)
                    return r2
            }
        }

        static {
                androidx.room.util.TableInfo$Column$Companion r0 = new androidx.room.util.TableInfo$Column$Companion
                r1 = 0
                r0.<init>(r1)
                androidx.room.util.TableInfo.Column.Companion = r0
                return
        }

        @kotlin.Deprecated(message = "No longer used by generated code.")
        public Column(@org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull java.lang.String r10, boolean r11, int r12) {
                r8 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r9, r0)
                java.lang.String r0 = "type"
                kotlin.jvm.internal.g0.p(r10, r0)
                r6 = 0
                r7 = 0
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                r5 = r12
                r1.<init>(r2, r3, r4, r5, r6, r7)
                return
        }

        public Column(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3, boolean r4, int r5, @org.jetbrains.annotations.Nullable java.lang.String r6, int r7) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "type"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.<init>()
                r1.name = r2
                r1.type = r3
                r1.notNull = r4
                r1.primaryKeyPosition = r5
                r1.defaultValue = r6
                r1.createdFrom = r7
                int r2 = androidx.room.util.SchemaInfoUtilKt.findAffinity(r3)
                r1.affinity = r2
                return
        }

        @kotlin.jvm.JvmStatic
        public static final boolean defaultValueEquals(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.Nullable java.lang.String r2) {
                androidx.room.util.TableInfo$Column$Companion r0 = androidx.room.util.TableInfo.Column.Companion
                boolean r1 = r0.defaultValueEquals(r1, r2)
                return r1
        }

        @androidx.room.ColumnInfo.SQLiteTypeAffinity
        public static /* synthetic */ void getAffinity$annotations() {
                return
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
                r0 = this;
                boolean r1 = androidx.room.util.TableInfoKt.equalsCommon(r0, r1)
                return r1
        }

        public int hashCode() {
                r1 = this;
                int r0 = androidx.room.util.TableInfoKt.hashCodeCommon(r1)
                return r0
        }

        public final boolean isPrimaryKey() {
                r1 = this;
                int r0 = r1.primaryKeyPosition
                if (r0 <= 0) goto L6
                r0 = 1
                return r0
            L6:
                r0 = 0
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = androidx.room.util.TableInfoKt.toStringCommon(r1)
                return r0
        }
    }

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
        public final androidx.room.util.TableInfo read(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "connection"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "tableName"
                kotlin.jvm.internal.g0.p(r3, r0)
                androidx.room.util.TableInfo r2 = androidx.room.util.SchemaInfoUtilKt.readTableInfo(r2, r3)
                return r2
        }

        @kotlin.Deprecated(message = "No longer used by generated code.")
        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final androidx.room.util.TableInfo read(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "database"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "tableName"
                kotlin.jvm.internal.g0.p(r3, r0)
                androidx.room.driver.SupportSQLiteConnection r0 = new androidx.room.driver.SupportSQLiteConnection
                r0.<init>(r2)
                androidx.room.util.TableInfo r2 = r1.read(r0, r3)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
    public @interface CreatedFrom {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final class ForeignKey {

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.String> columnNames;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final java.lang.String onDelete;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final java.lang.String onUpdate;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.String> referenceColumnNames;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final java.lang.String referenceTable;

        public ForeignKey(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r5, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r6) {
                r1 = this;
                java.lang.String r0 = "referenceTable"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "onDelete"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "onUpdate"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.String r0 = "columnNames"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r0 = "referenceColumnNames"
                kotlin.jvm.internal.g0.p(r6, r0)
                r1.<init>()
                r1.referenceTable = r2
                r1.onDelete = r3
                r1.onUpdate = r4
                r1.columnNames = r5
                r1.referenceColumnNames = r6
                return
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
                r0 = this;
                boolean r1 = androidx.room.util.TableInfoKt.equalsCommon(r0, r1)
                return r1
        }

        public int hashCode() {
                r1 = this;
                int r0 = androidx.room.util.TableInfoKt.hashCodeCommon(r1)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = androidx.room.util.TableInfoKt.toStringCommon(r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nTableInfo.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TableInfo.android.kt\nandroidx/room/util/TableInfo$Index\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,209:1\n1#2:210\n*E\n"})
    public static final class Index {

        @org.jetbrains.annotations.NotNull
        public static final androidx.room.util.TableInfo.Index.Companion Companion = null;

        @org.jetbrains.annotations.NotNull
        public static final java.lang.String DEFAULT_PREFIX = "index_";

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.String> columns;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final java.lang.String name;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public java.util.List<java.lang.String> orders;

        @kotlin.jvm.JvmField
        public final boolean unique;

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
                androidx.room.util.TableInfo$Index$Companion r0 = new androidx.room.util.TableInfo$Index$Companion
                r1 = 0
                r0.<init>(r1)
                androidx.room.util.TableInfo.Index.Companion = r0
                return
        }

        @kotlin.Deprecated(message = "No longer used by generated code.")
        public Index(@org.jetbrains.annotations.NotNull java.lang.String r5, boolean r6, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r7) {
                r4 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r0 = "columns"
                kotlin.jvm.internal.g0.p(r7, r0)
                int r0 = r7.size()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r0)
                r2 = 0
            L14:
                if (r2 >= r0) goto L1e
                java.lang.String r3 = "ASC"
                r1.add(r3)
                int r2 = r2 + 1
                goto L14
            L1e:
                r4.<init>(r5, r6, r7, r1)
                return
        }

        public Index(@org.jetbrains.annotations.NotNull java.lang.String r2, boolean r3, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r4, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r5) {
                r1 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "columns"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.String r0 = "orders"
                kotlin.jvm.internal.g0.p(r5, r0)
                r1.<init>()
                r1.name = r2
                r1.unique = r3
                r1.columns = r4
                r1.orders = r5
                java.util.Collection r5 = (java.util.Collection) r5
                boolean r2 = r5.isEmpty()
                if (r2 == 0) goto L36
                int r2 = r4.size()
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r2)
                r3 = 0
            L2c:
                if (r3 >= r2) goto L36
                java.lang.String r4 = "ASC"
                r5.add(r4)
                int r3 = r3 + 1
                goto L2c
            L36:
                java.util.List r5 = (java.util.List) r5
                r1.orders = r5
                return
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
                r0 = this;
                boolean r1 = androidx.room.util.TableInfoKt.equalsCommon(r0, r1)
                return r1
        }

        public int hashCode() {
                r1 = this;
                int r0 = androidx.room.util.TableInfoKt.hashCodeCommon(r1)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = androidx.room.util.TableInfoKt.toStringCommon(r1)
                return r0
        }
    }

    static {
            androidx.room.util.TableInfo$Companion r0 = new androidx.room.util.TableInfo$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.room.util.TableInfo.Companion = r0
            return
    }

    @kotlin.Deprecated(message = "No longer used by generated code.")
    public TableInfo(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, androidx.room.util.TableInfo.Column> r3, @org.jetbrains.annotations.NotNull java.util.Set<androidx.room.util.TableInfo.ForeignKey> r4) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "columns"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "foreignKeys"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.Set r0 = kotlin.collections.u1.k()
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public TableInfo(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, androidx.room.util.TableInfo.Column> r3, @org.jetbrains.annotations.NotNull java.util.Set<androidx.room.util.TableInfo.ForeignKey> r4, @org.jetbrains.annotations.Nullable java.util.Set<androidx.room.util.TableInfo.Index> r5) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "columns"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "foreignKeys"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>()
            r1.name = r2
            r1.columns = r3
            r1.foreignKeys = r4
            r1.indices = r5
            return
    }

    public /* synthetic */ TableInfo(java.lang.String r1, java.util.Map r2, java.util.Set r3, java.util.Set r4, int r5, kotlin.jvm.internal.v r6) {
            r0 = this;
            r5 = r5 & 8
            if (r5 == 0) goto L5
            r4 = 0
        L5:
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final androidx.room.util.TableInfo read(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
            androidx.room.util.TableInfo$Companion r0 = androidx.room.util.TableInfo.Companion
            androidx.room.util.TableInfo r1 = r0.read(r1, r2)
            return r1
    }

    @kotlin.Deprecated(message = "No longer used by generated code.")
    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final androidx.room.util.TableInfo read(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
            androidx.room.util.TableInfo$Companion r0 = androidx.room.util.TableInfo.Companion
            androidx.room.util.TableInfo r1 = r0.read(r1, r2)
            return r1
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
            r0 = this;
            boolean r1 = androidx.room.util.TableInfoKt.equalsCommon(r0, r1)
            return r1
    }

    public int hashCode() {
            r1 = this;
            int r0 = androidx.room.util.TableInfoKt.hashCodeCommon(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = androidx.room.util.TableInfoKt.toStringCommon(r1)
            return r0
    }
}
