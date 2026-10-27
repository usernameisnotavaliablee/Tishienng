package androidx.sqlite.db;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSupportSQLiteQueryBuilder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportSQLiteQueryBuilder.android.kt\nandroidx/sqlite/db/SupportSQLiteQueryBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,169:1\n1#2:170\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SupportSQLiteQueryBuilder {

    @org.jetbrains.annotations.NotNull
    public static final androidx.sqlite.db.SupportSQLiteQueryBuilder.Companion Companion = null;
    private static final java.util.regex.Pattern limitPattern = null;

    @org.jetbrains.annotations.Nullable
    private java.lang.Object[] bindArgs;

    @org.jetbrains.annotations.Nullable
    private java.lang.String[] columns;
    private boolean distinct;

    @org.jetbrains.annotations.Nullable
    private java.lang.String groupBy;

    @org.jetbrains.annotations.Nullable
    private java.lang.String having;

    @org.jetbrains.annotations.Nullable
    private java.lang.String limit;

    @org.jetbrains.annotations.Nullable
    private java.lang.String orderBy;

    @org.jetbrains.annotations.Nullable
    private java.lang.String selection;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String table;

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
        public final androidx.sqlite.db.SupportSQLiteQueryBuilder builder(@org.jetbrains.annotations.NotNull java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "tableName"
                kotlin.jvm.internal.g0.p(r3, r0)
                androidx.sqlite.db.SupportSQLiteQueryBuilder r0 = new androidx.sqlite.db.SupportSQLiteQueryBuilder
                r1 = 0
                r0.<init>(r3, r1)
                return r0
        }
    }

    static {
            androidx.sqlite.db.SupportSQLiteQueryBuilder$Companion r0 = new androidx.sqlite.db.SupportSQLiteQueryBuilder$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.sqlite.db.SupportSQLiteQueryBuilder.Companion = r0
            java.lang.String r0 = "\\s*\\d+\\s*(,\\s*\\d+\\s*)?"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            androidx.sqlite.db.SupportSQLiteQueryBuilder.limitPattern = r0
            return
    }

    private SupportSQLiteQueryBuilder(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.table = r1
            return
    }

    public /* synthetic */ SupportSQLiteQueryBuilder(java.lang.String r1, kotlin.jvm.internal.v r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private final void appendClause(java.lang.StringBuilder r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            if (r4 == 0) goto Lf
            int r0 = r4.length()
            if (r0 != 0) goto L9
            goto Lf
        L9:
            r2.append(r3)
            r2.append(r4)
        Lf:
            return
    }

    private final void appendColumns(java.lang.StringBuilder r5, java.lang.String[] r6) {
            r4 = this;
            int r0 = r6.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L13
            r2 = r6[r1]
            if (r1 <= 0) goto Ld
            java.lang.String r3 = ", "
            r5.append(r3)
        Ld:
            r5.append(r2)
            int r1 = r1 + 1
            goto L2
        L13:
            r6 = 32
            r5.append(r6)
            return
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final androidx.sqlite.db.SupportSQLiteQueryBuilder builder(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            androidx.sqlite.db.SupportSQLiteQueryBuilder$Companion r0 = androidx.sqlite.db.SupportSQLiteQueryBuilder.Companion
            androidx.sqlite.db.SupportSQLiteQueryBuilder r1 = r0.builder(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.sqlite.db.SupportSQLiteQueryBuilder columns(@org.jetbrains.annotations.Nullable java.lang.String[] r1) {
            r0 = this;
            r0.columns = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.sqlite.db.SupportSQLiteQuery create() {
            r3 = this;
            java.lang.String r0 = r3.groupBy
            if (r0 == 0) goto La
            int r0 = r0.length()
            if (r0 != 0) goto L1d
        La:
            java.lang.String r0 = r3.having
            if (r0 == 0) goto L1d
            int r0 = r0.length()
            if (r0 != 0) goto L15
            goto L1d
        L15:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "HAVING clauses are only permitted when using a groupBy clause"
            r0.<init>(r1)
            throw r0
        L1d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 120(0x78, float:1.68E-43)
            r0.<init>(r1)
            java.lang.String r1 = "SELECT "
            r0.append(r1)
            boolean r1 = r3.distinct
            if (r1 == 0) goto L32
            java.lang.String r1 = "DISTINCT "
            r0.append(r1)
        L32:
            java.lang.String[] r1 = r3.columns
            if (r1 == 0) goto L41
            int r2 = r1.length
            if (r2 != 0) goto L3a
            goto L41
        L3a:
            kotlin.jvm.internal.g0.m(r1)
            r3.appendColumns(r0, r1)
            goto L46
        L41:
            java.lang.String r1 = "* "
            r0.append(r1)
        L46:
            java.lang.String r1 = "FROM "
            r0.append(r1)
            java.lang.String r1 = r3.table
            r0.append(r1)
            java.lang.String r1 = " WHERE "
            java.lang.String r2 = r3.selection
            r3.appendClause(r0, r1, r2)
            java.lang.String r1 = " GROUP BY "
            java.lang.String r2 = r3.groupBy
            r3.appendClause(r0, r1, r2)
            java.lang.String r1 = " HAVING "
            java.lang.String r2 = r3.having
            r3.appendClause(r0, r1, r2)
            java.lang.String r1 = " ORDER BY "
            java.lang.String r2 = r3.orderBy
            r3.appendClause(r0, r1, r2)
            java.lang.String r1 = " LIMIT "
            java.lang.String r2 = r3.limit
            r3.appendClause(r0, r1, r2)
            java.lang.String r0 = r0.toString()
            androidx.sqlite.db.SimpleSQLiteQuery r1 = new androidx.sqlite.db.SimpleSQLiteQuery
            java.lang.Object[] r2 = r3.bindArgs
            r1.<init>(r0, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.sqlite.db.SupportSQLiteQueryBuilder distinct() {
            r1 = this;
            r0 = 1
            r1.distinct = r0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.sqlite.db.SupportSQLiteQueryBuilder groupBy(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.groupBy = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.sqlite.db.SupportSQLiteQueryBuilder having(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.having = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.sqlite.db.SupportSQLiteQueryBuilder limit(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "limit"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.regex.Pattern r0 = androidx.sqlite.db.SupportSQLiteQueryBuilder.limitPattern
            java.util.regex.Matcher r0 = r0.matcher(r3)
            boolean r0 = r0.matches()
            int r1 = r3.length()
            if (r1 != 0) goto L16
            goto L18
        L16:
            if (r0 == 0) goto L1b
        L18:
            r2.limit = r3
            return r2
        L1b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "invalid LIMIT clauses:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.sqlite.db.SupportSQLiteQueryBuilder orderBy(@org.jetbrains.annotations.Nullable java.lang.String r1) {
            r0 = this;
            r0.orderBy = r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.sqlite.db.SupportSQLiteQueryBuilder selection(@org.jetbrains.annotations.Nullable java.lang.String r1, @org.jetbrains.annotations.Nullable java.lang.Object[] r2) {
            r0 = this;
            r0.selection = r1
            r0.bindArgs = r2
            return r0
    }
}
