package net.sqlcipher.database;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class SQLiteQueryBuilder {
    private static final java.lang.String TAG = "SQLiteQueryBuilder";
    private static final java.util.regex.Pattern sLimitPattern = null;
    private boolean mDistinct;
    private net.sqlcipher.database.SQLiteDatabase.CursorFactory mFactory;
    private java.util.Map<java.lang.String, java.lang.String> mProjectionMap;
    private boolean mStrictProjectionMap;
    private java.lang.String mTables;
    private java.lang.StringBuilder mWhereClause;

    static {
            java.lang.String r0 = "\\s*\\d+\\s*(,\\s*\\d+\\s*)?"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            net.sqlcipher.database.SQLiteQueryBuilder.sLimitPattern = r0
            return
    }

    public SQLiteQueryBuilder() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mProjectionMap = r0
            java.lang.String r1 = ""
            r2.mTables = r1
            r2.mWhereClause = r0
            r1 = 0
            r2.mDistinct = r1
            r2.mFactory = r0
            return
    }

    private static void appendClause(java.lang.StringBuilder r1, java.lang.String r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto Lc
            r1.append(r2)
            r1.append(r3)
        Lc:
            return
    }

    private static void appendClauseEscapeClause(java.lang.StringBuilder r1, java.lang.String r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto Lc
            r1.append(r2)
            net.sqlcipher.DatabaseUtils.appendEscapedSQLString(r1, r3)
        Lc:
            return
    }

    public static void appendColumns(java.lang.StringBuilder r4, java.lang.String[] r5) {
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L15
            r2 = r5[r1]
            if (r2 == 0) goto L12
            if (r1 <= 0) goto Lf
            java.lang.String r3 = ", "
            r4.append(r3)
        Lf:
            r4.append(r2)
        L12:
            int r1 = r1 + 1
            goto L2
        L15:
            r5 = 32
            r4.append(r5)
            return
    }

    public static java.lang.String buildQueryString(boolean r2, java.lang.String r3, java.lang.String[] r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L15
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto Ld
            goto L15
        Ld:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "HAVING clauses are only permitted when using a groupBy clause"
            r2.<init>(r3)
            throw r2
        L15:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L3f
            java.util.regex.Pattern r0 = net.sqlcipher.database.SQLiteQueryBuilder.sLimitPattern
            java.util.regex.Matcher r0 = r0.matcher(r9)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L28
            goto L3f
        L28:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "invalid LIMIT clauses:"
            r3.append(r4)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L3f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 120(0x78, float:1.68E-43)
            r0.<init>(r1)
            java.lang.String r1 = "SELECT "
            r0.append(r1)
            if (r2 == 0) goto L52
            java.lang.String r2 = "DISTINCT "
            r0.append(r2)
        L52:
            if (r4 == 0) goto L5b
            int r2 = r4.length
            if (r2 == 0) goto L5b
            appendColumns(r0, r4)
            goto L60
        L5b:
            java.lang.String r2 = "* "
            r0.append(r2)
        L60:
            java.lang.String r2 = "FROM "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = " WHERE "
            appendClause(r0, r2, r5)
            java.lang.String r2 = " GROUP BY "
            appendClause(r0, r2, r6)
            java.lang.String r2 = " HAVING "
            appendClause(r0, r2, r7)
            java.lang.String r2 = " ORDER BY "
            appendClause(r0, r2, r8)
            java.lang.String r2 = " LIMIT "
            appendClause(r0, r2, r9)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private java.lang.String[] computeProjection(java.lang.String[] r6) {
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L53
            int r1 = r6.length
            if (r1 <= 0) goto L53
            java.util.Map<java.lang.String, java.lang.String> r1 = r5.mProjectionMap
            if (r1 == 0) goto L52
            int r1 = r6.length
            java.lang.String[] r1 = new java.lang.String[r1]
            int r2 = r6.length
        Le:
            if (r0 >= r2) goto L51
            r3 = r6[r0]
            java.util.Map<java.lang.String, java.lang.String> r4 = r5.mProjectionMap
            java.lang.Object r4 = r4.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L1f
            r1[r0] = r4
            goto L35
        L1f:
            boolean r4 = r5.mStrictProjectionMap
            if (r4 != 0) goto L38
            java.lang.String r4 = " AS "
            boolean r4 = r3.contains(r4)
            if (r4 != 0) goto L33
            java.lang.String r4 = " as "
            boolean r4 = r3.contains(r4)
            if (r4 == 0) goto L38
        L33:
            r1[r0] = r3
        L35:
            int r0 = r0 + 1
            goto Le
        L38:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid column "
            r2.append(r3)
            r6 = r6[r0]
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r1.<init>(r6)
            throw r1
        L51:
            return r1
        L52:
            return r6
        L53:
            java.util.Map<java.lang.String, java.lang.String> r6 = r5.mProjectionMap
            if (r6 == 0) goto L8d
            java.util.Set r6 = r6.entrySet()
            int r1 = r6.size()
            java.lang.String[] r1 = new java.lang.String[r1]
            java.util.Iterator r6 = r6.iterator()
        L65:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L8c
            java.lang.Object r2 = r6.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "_count"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L80
            goto L65
        L80:
            int r3 = r0 + 1
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r1[r0] = r2
            r0 = r3
            goto L65
        L8c:
            return r1
        L8d:
            r6 = 0
            return r6
    }

    public void appendWhere(java.lang.CharSequence r3) {
            r2 = this;
            java.lang.StringBuilder r0 = r2.mWhereClause
            if (r0 != 0) goto L11
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r3.length()
            int r1 = r1 + 16
            r0.<init>(r1)
            r2.mWhereClause = r0
        L11:
            java.lang.StringBuilder r0 = r2.mWhereClause
            int r0 = r0.length()
            if (r0 != 0) goto L20
            java.lang.StringBuilder r0 = r2.mWhereClause
            r1 = 40
            r0.append(r1)
        L20:
            java.lang.StringBuilder r0 = r2.mWhereClause
            r0.append(r3)
            return
    }

    public void appendWhereEscapeString(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = r2.mWhereClause
            if (r0 != 0) goto L11
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r3.length()
            int r1 = r1 + 16
            r0.<init>(r1)
            r2.mWhereClause = r0
        L11:
            java.lang.StringBuilder r0 = r2.mWhereClause
            int r0 = r0.length()
            if (r0 != 0) goto L20
            java.lang.StringBuilder r0 = r2.mWhereClause
            r1 = 40
            r0.append(r1)
        L20:
            java.lang.StringBuilder r0 = r2.mWhereClause
            net.sqlcipher.DatabaseUtils.appendEscapedSQLString(r0, r3)
            return
    }

    public java.lang.String buildQuery(java.lang.String[] r9, java.lang.String r10, java.lang.String[] r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
            r8 = this;
            java.lang.String[] r2 = r8.computeProjection(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.StringBuilder r11 = r8.mWhereClause
            if (r11 == 0) goto L15
            int r11 = r11.length()
            if (r11 <= 0) goto L15
            r11 = 1
            goto L16
        L15:
            r11 = 0
        L16:
            r0 = 41
            if (r11 == 0) goto L26
            java.lang.StringBuilder r1 = r8.mWhereClause
            java.lang.String r1 = r1.toString()
            r9.append(r1)
            r9.append(r0)
        L26:
            if (r10 == 0) goto L40
            int r1 = r10.length()
            if (r1 <= 0) goto L40
            if (r11 == 0) goto L35
            java.lang.String r11 = " AND "
            r9.append(r11)
        L35:
            r11 = 40
            r9.append(r11)
            r9.append(r10)
            r9.append(r0)
        L40:
            boolean r0 = r8.mDistinct
            java.lang.String r1 = r8.mTables
            java.lang.String r3 = r9.toString()
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            java.lang.String r9 = buildQueryString(r0, r1, r2, r3, r4, r5, r6, r7)
            return r9
    }

    public java.lang.String buildUnionQuery(java.lang.String[] r6, java.lang.String r7, java.lang.String r8) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            int r1 = r6.length
            boolean r2 = r5.mDistinct
            if (r2 == 0) goto Lf
            java.lang.String r2 = " UNION "
            goto L11
        Lf:
            java.lang.String r2 = " UNION ALL "
        L11:
            r3 = 0
        L12:
            if (r3 >= r1) goto L21
            if (r3 <= 0) goto L19
            r0.append(r2)
        L19:
            r4 = r6[r3]
            r0.append(r4)
            int r3 = r3 + 1
            goto L12
        L21:
            java.lang.String r6 = " ORDER BY "
            appendClause(r0, r6, r7)
            java.lang.String r6 = " LIMIT "
            appendClause(r0, r6, r8)
            java.lang.String r6 = r0.toString()
            return r6
    }

    public java.lang.String buildUnionSubQuery(java.lang.String r7, java.lang.String[] r8, java.util.Set<java.lang.String> r9, int r10, java.lang.String r11, java.lang.String r12, java.lang.String[] r13, java.lang.String r14, java.lang.String r15) {
            r6 = this;
            int r0 = r8.length
            r1 = r8
            java.lang.String[] r8 = new java.lang.String[r0]
            r2 = 0
        L5:
            if (r2 >= r0) goto L4d
            r3 = r1[r2]
            boolean r4 = r3.equals(r7)
            if (r4 == 0) goto L2b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "'"
            r3.append(r4)
            r3.append(r11)
            java.lang.String r4 = "' AS "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            r8[r2] = r3
            goto L4a
        L2b:
            if (r2 <= r10) goto L48
            boolean r4 = r9.contains(r3)
            if (r4 == 0) goto L34
            goto L48
        L34:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "NULL AS "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r8[r2] = r3
            goto L4a
        L48:
            r8[r2] = r3
        L4a:
            int r2 = r2 + 1
            goto L5
        L4d:
            r7 = 0
            r11 = r14
            r14 = 0
            r9 = r12
            r10 = r13
            r12 = r15
            r13 = r7
            r7 = r6
            java.lang.String r8 = r7.buildQuery(r8, r9, r10, r11, r12, r13, r14)
            return r8
    }

    public java.lang.String getTables() {
            r1 = this;
            java.lang.String r0 = r1.mTables
            return r0
    }

    public net.sqlcipher.Cursor query(net.sqlcipher.database.SQLiteDatabase r10, java.lang.String[] r11, java.lang.String r12, java.lang.String[] r13, java.lang.String r14, java.lang.String r15, java.lang.String r16) {
            r9 = this;
            r8 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            net.sqlcipher.Cursor r10 = r0.query(r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
    }

    public net.sqlcipher.Cursor query(net.sqlcipher.database.SQLiteDatabase r9, java.lang.String[] r10, java.lang.String r11, java.lang.String[] r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16) {
            r8 = this;
            java.lang.String r0 = r8.mTables
            if (r0 != 0) goto L6
            r9 = 0
            return r9
        L6:
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            java.lang.String r10 = r0.buildQuery(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r11 = "SQLiteQueryBuilder"
            r13 = 3
            android.util.Log.isLoggable(r11, r13)
            net.sqlcipher.database.SQLiteDatabase$CursorFactory r11 = r8.mFactory
            java.lang.String r13 = r8.mTables
            java.lang.String r13 = net.sqlcipher.database.SQLiteDatabase.findEditTable(r13)
            net.sqlcipher.Cursor r9 = r9.rawQueryWithFactory(r11, r10, r12, r13)
            return r9
    }

    public void setCursorFactory(net.sqlcipher.database.SQLiteDatabase.CursorFactory r1) {
            r0 = this;
            r0.mFactory = r1
            return
    }

    public void setDistinct(boolean r1) {
            r0 = this;
            r0.mDistinct = r1
            return
    }

    public void setProjectionMap(java.util.Map<java.lang.String, java.lang.String> r1) {
            r0 = this;
            r0.mProjectionMap = r1
            return
    }

    public void setStrictProjectionMap(boolean r1) {
            r0 = this;
            r0.mStrictProjectionMap = r1
            return
    }

    public void setTables(java.lang.String r1) {
            r0 = this;
            r0.mTables = r1
            return
    }
}
