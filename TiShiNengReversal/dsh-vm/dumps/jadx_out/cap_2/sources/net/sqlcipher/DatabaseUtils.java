package net.sqlcipher;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class DatabaseUtils {
    private static final boolean DEBUG = false;
    private static final char[] HEX_DIGITS_LOWER = null;
    private static final boolean LOCAL_LOGV = false;
    private static final java.lang.String TAG = "DatabaseUtils";
    private static final java.lang.String[] countProjection = null;
    private static java.text.Collator mColl;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class InsertHelper {
        public static final int TABLE_INFO_PRAGMA_COLUMNNAME_INDEX = 1;
        public static final int TABLE_INFO_PRAGMA_DEFAULT_INDEX = 4;
        private java.util.HashMap<java.lang.String, java.lang.Integer> mColumns;
        private final net.sqlcipher.database.SQLiteDatabase mDb;
        private java.lang.String mInsertSQL;
        private net.sqlcipher.database.SQLiteStatement mInsertStatement;
        private net.sqlcipher.database.SQLiteStatement mPreparedStatement;
        private net.sqlcipher.database.SQLiteStatement mReplaceStatement;
        private final java.lang.String mTableName;

        public InsertHelper(net.sqlcipher.database.SQLiteDatabase r2, java.lang.String r3) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mInsertSQL = r0
                r1.mInsertStatement = r0
                r1.mReplaceStatement = r0
                r1.mPreparedStatement = r0
                r1.mDb = r2
                r1.mTableName = r3
                return
        }

        private void buildSQL() throws net.sqlcipher.SQLException {
                r11 = this;
                java.lang.String r0 = "'"
                java.lang.String r1 = ")"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = 128(0x80, float:1.8E-43)
                r2.<init>(r3)
                java.lang.String r4 = "INSERT INTO "
                r2.append(r4)
                java.lang.String r4 = r11.mTableName
                r2.append(r4)
                java.lang.String r4 = " ("
                r2.append(r4)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>(r3)
                java.lang.String r3 = "VALUES ("
                r4.append(r3)
                r3 = 0
                net.sqlcipher.database.SQLiteDatabase r5 = r11.mDb     // Catch: java.lang.Throwable -> L77
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L77
                r6.<init>()     // Catch: java.lang.Throwable -> L77
                java.lang.String r7 = "PRAGMA table_info("
                r6.append(r7)     // Catch: java.lang.Throwable -> L77
                java.lang.String r7 = r11.mTableName     // Catch: java.lang.Throwable -> L77
                r6.append(r7)     // Catch: java.lang.Throwable -> L77
                r6.append(r1)     // Catch: java.lang.Throwable -> L77
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L77
                net.sqlcipher.Cursor r3 = r5.rawQuery(r6, r3)     // Catch: java.lang.Throwable -> L77
                java.util.HashMap r5 = new java.util.HashMap     // Catch: java.lang.Throwable -> L77
                int r6 = r3.getCount()     // Catch: java.lang.Throwable -> L77
                r5.<init>(r6)     // Catch: java.lang.Throwable -> L77
                r11.mColumns = r5     // Catch: java.lang.Throwable -> L77
                r5 = 1
                r6 = 1
            L4e:
                boolean r7 = r3.moveToNext()     // Catch: java.lang.Throwable -> L77
                if (r7 == 0) goto La1
                java.lang.String r7 = r3.getString(r5)     // Catch: java.lang.Throwable -> L77
                r8 = 4
                java.lang.String r8 = r3.getString(r8)     // Catch: java.lang.Throwable -> L77
                java.util.HashMap<java.lang.String, java.lang.Integer> r9 = r11.mColumns     // Catch: java.lang.Throwable -> L77
                java.lang.Integer r10 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L77
                r9.put(r7, r10)     // Catch: java.lang.Throwable -> L77
                r2.append(r0)     // Catch: java.lang.Throwable -> L77
                r2.append(r7)     // Catch: java.lang.Throwable -> L77
                r2.append(r0)     // Catch: java.lang.Throwable -> L77
                if (r8 != 0) goto L79
                java.lang.String r7 = "?"
                r4.append(r7)     // Catch: java.lang.Throwable -> L77
                goto L84
            L77:
                r0 = move-exception
                goto Lae
            L79:
                java.lang.String r7 = "COALESCE(?, "
                r4.append(r7)     // Catch: java.lang.Throwable -> L77
                r4.append(r8)     // Catch: java.lang.Throwable -> L77
                r4.append(r1)     // Catch: java.lang.Throwable -> L77
            L84:
                int r7 = r3.getCount()     // Catch: java.lang.Throwable -> L77
                java.lang.String r8 = ", "
                if (r6 != r7) goto L8f
                java.lang.String r7 = ") "
                goto L90
            L8f:
                r7 = r8
            L90:
                r2.append(r7)     // Catch: java.lang.Throwable -> L77
                int r7 = r3.getCount()     // Catch: java.lang.Throwable -> L77
                if (r6 != r7) goto L9b
                java.lang.String r8 = ");"
            L9b:
                r4.append(r8)     // Catch: java.lang.Throwable -> L77
                int r6 = r6 + 1
                goto L4e
            La1:
                r3.close()
                r2.append(r4)
                java.lang.String r0 = r2.toString()
                r11.mInsertSQL = r0
                return
            Lae:
                if (r3 == 0) goto Lb3
                r3.close()
            Lb3:
                throw r0
        }

        private net.sqlcipher.database.SQLiteStatement getStatement(boolean r3) throws net.sqlcipher.SQLException {
                r2 = this;
                if (r3 == 0) goto L30
                net.sqlcipher.database.SQLiteStatement r3 = r2.mReplaceStatement
                if (r3 != 0) goto L2d
                java.lang.String r3 = r2.mInsertSQL
                if (r3 != 0) goto Ld
                r2.buildSQL()
            Ld:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r0 = "INSERT OR REPLACE"
                r3.append(r0)
                java.lang.String r0 = r2.mInsertSQL
                r1 = 6
                java.lang.String r0 = r0.substring(r1)
                r3.append(r0)
                java.lang.String r3 = r3.toString()
                net.sqlcipher.database.SQLiteDatabase r0 = r2.mDb
                net.sqlcipher.database.SQLiteStatement r3 = r0.m39compileStatement(r3)
                r2.mReplaceStatement = r3
            L2d:
                net.sqlcipher.database.SQLiteStatement r3 = r2.mReplaceStatement
                return r3
            L30:
                net.sqlcipher.database.SQLiteStatement r3 = r2.mInsertStatement
                if (r3 != 0) goto L45
                java.lang.String r3 = r2.mInsertSQL
                if (r3 != 0) goto L3b
                r2.buildSQL()
            L3b:
                net.sqlcipher.database.SQLiteDatabase r3 = r2.mDb
                java.lang.String r0 = r2.mInsertSQL
                net.sqlcipher.database.SQLiteStatement r3 = r3.m39compileStatement(r0)
                r2.mInsertStatement = r3
            L45:
                net.sqlcipher.database.SQLiteStatement r3 = r2.mInsertStatement
                return r3
        }

        private synchronized long insertInternal(android.content.ContentValues r4, boolean r5) {
                r3 = this;
                monitor-enter(r3)
                net.sqlcipher.database.SQLiteStatement r5 = r3.getStatement(r5)     // Catch: java.lang.Throwable -> L2e net.sqlcipher.SQLException -> L36
                r5.clearBindings()     // Catch: java.lang.Throwable -> L2e net.sqlcipher.SQLException -> L36
                java.util.Set r0 = r4.valueSet()     // Catch: java.lang.Throwable -> L2e net.sqlcipher.SQLException -> L36
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2e net.sqlcipher.SQLException -> L36
            L10:
                boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L2e net.sqlcipher.SQLException -> L36
                if (r1 == 0) goto L30
                java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L2e net.sqlcipher.SQLException -> L36
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L2e net.sqlcipher.SQLException -> L36
                java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L2e net.sqlcipher.SQLException -> L36
                java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L2e net.sqlcipher.SQLException -> L36
                int r2 = r3.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L2e net.sqlcipher.SQLException -> L36
                java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L2e net.sqlcipher.SQLException -> L36
                net.sqlcipher.DatabaseUtils.bindObjectToProgram(r5, r2, r1)     // Catch: java.lang.Throwable -> L2e net.sqlcipher.SQLException -> L36
                goto L10
            L2e:
                r4 = move-exception
                goto L3d
            L30:
                long r4 = r5.executeInsert()     // Catch: java.lang.Throwable -> L2e net.sqlcipher.SQLException -> L36
                monitor-exit(r3)
                return r4
            L36:
                java.util.Objects.toString(r4)     // Catch: java.lang.Throwable -> L2e
                monitor-exit(r3)
                r4 = -1
                return r4
            L3d:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L2e
                throw r4
        }

        public void bind(int r2, double r3) {
                r1 = this;
                net.sqlcipher.database.SQLiteStatement r0 = r1.mPreparedStatement
                r0.bindDouble(r2, r3)
                return
        }

        public void bind(int r4, float r5) {
                r3 = this;
                net.sqlcipher.database.SQLiteStatement r0 = r3.mPreparedStatement
                double r1 = (double) r5
                r0.bindDouble(r4, r1)
                return
        }

        public void bind(int r4, int r5) {
                r3 = this;
                net.sqlcipher.database.SQLiteStatement r0 = r3.mPreparedStatement
                long r1 = (long) r5
                r0.bindLong(r4, r1)
                return
        }

        public void bind(int r2, long r3) {
                r1 = this;
                net.sqlcipher.database.SQLiteStatement r0 = r1.mPreparedStatement
                r0.bindLong(r2, r3)
                return
        }

        public void bind(int r2, java.lang.String r3) {
                r1 = this;
                if (r3 != 0) goto L8
                net.sqlcipher.database.SQLiteStatement r3 = r1.mPreparedStatement
                r3.bindNull(r2)
                return
            L8:
                net.sqlcipher.database.SQLiteStatement r0 = r1.mPreparedStatement
                r0.bindString(r2, r3)
                return
        }

        public void bind(int r4, boolean r5) {
                r3 = this;
                net.sqlcipher.database.SQLiteStatement r0 = r3.mPreparedStatement
                if (r5 == 0) goto L7
                r1 = 1
                goto L9
            L7:
                r1 = 0
            L9:
                r0.bindLong(r4, r1)
                return
        }

        public void bind(int r2, byte[] r3) {
                r1 = this;
                if (r3 != 0) goto L8
                net.sqlcipher.database.SQLiteStatement r3 = r1.mPreparedStatement
                r3.bindNull(r2)
                return
            L8:
                net.sqlcipher.database.SQLiteStatement r0 = r1.mPreparedStatement
                r0.bindBlob(r2, r3)
                return
        }

        public void bindNull(int r2) {
                r1 = this;
                net.sqlcipher.database.SQLiteStatement r0 = r1.mPreparedStatement
                r0.bindNull(r2)
                return
        }

        public void close() {
                r2 = this;
                net.sqlcipher.database.SQLiteStatement r0 = r2.mInsertStatement
                r1 = 0
                if (r0 == 0) goto La
                r0.close()
                r2.mInsertStatement = r1
            La:
                net.sqlcipher.database.SQLiteStatement r0 = r2.mReplaceStatement
                if (r0 == 0) goto L13
                r0.close()
                r2.mReplaceStatement = r1
            L13:
                r2.mInsertSQL = r1
                r2.mColumns = r1
                return
        }

        public long execute() {
                r4 = this;
                net.sqlcipher.database.SQLiteStatement r0 = r4.mPreparedStatement
                if (r0 == 0) goto L15
                r1 = 0
                long r2 = r0.executeInsert()     // Catch: java.lang.Throwable -> Lc net.sqlcipher.SQLException -> L10
                r4.mPreparedStatement = r1
                return r2
            Lc:
                r0 = move-exception
                r4.mPreparedStatement = r1
                throw r0
            L10:
                r4.mPreparedStatement = r1
                r0 = -1
                return r0
            L15:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "you must prepare this inserter before calling execute"
                r0.<init>(r1)
                throw r0
        }

        public int getColumnIndex(java.lang.String r4) {
                r3 = this;
                r0 = 0
                r3.getStatement(r0)
                java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r3.mColumns
                java.lang.Object r0 = r0.get(r4)
                java.lang.Integer r0 = (java.lang.Integer) r0
                if (r0 == 0) goto L13
                int r4 = r0.intValue()
                return r4
            L13:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "column '"
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = "' is invalid"
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        public long insert(android.content.ContentValues r3) {
                r2 = this;
                r0 = 0
                long r0 = r2.insertInternal(r3, r0)
                return r0
        }

        public void prepareForInsert() {
                r1 = this;
                r0 = 0
                net.sqlcipher.database.SQLiteStatement r0 = r1.getStatement(r0)
                r1.mPreparedStatement = r0
                r0.clearBindings()
                return
        }

        public void prepareForReplace() {
                r1 = this;
                r0 = 1
                net.sqlcipher.database.SQLiteStatement r0 = r1.getStatement(r0)
                r1.mPreparedStatement = r0
                r0.clearBindings()
                return
        }

        public long replace(android.content.ContentValues r3) {
                r2 = this;
                r0 = 1
                long r0 = r2.insertInternal(r3, r0)
                return r0
        }
    }

    static {
            java.lang.String r0 = "count(*)"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            net.sqlcipher.DatabaseUtils.countProjection = r0
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x0016: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            net.sqlcipher.DatabaseUtils.HEX_DIGITS_LOWER = r0
            r0 = 0
            net.sqlcipher.DatabaseUtils.mColl = r0
            return
    }

    public DatabaseUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void appendEscapedSQLString(java.lang.StringBuilder r4, java.lang.String r5) {
            r0 = 39
            r4.append(r0)
            int r1 = r5.indexOf(r0)
            r2 = -1
            if (r1 == r2) goto L22
            int r1 = r5.length()
            r2 = 0
        L11:
            if (r2 >= r1) goto L25
            char r3 = r5.charAt(r2)
            if (r3 != r0) goto L1c
            r4.append(r0)
        L1c:
            r4.append(r3)
            int r2 = r2 + 1
            goto L11
        L22:
            r4.append(r5)
        L25:
            r4.append(r0)
            return
    }

    public static final void appendValueToSql(java.lang.StringBuilder r1, java.lang.Object r2) {
            if (r2 != 0) goto L8
            java.lang.String r2 = "NULL"
            r1.append(r2)
            return
        L8:
            boolean r0 = r2 instanceof java.lang.Boolean
            if (r0 == 0) goto L20
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L1a
            r2 = 49
            r1.append(r2)
            return
        L1a:
            r2 = 48
            r1.append(r2)
            return
        L20:
            java.lang.String r2 = r2.toString()
            appendEscapedSQLString(r1, r2)
            return
    }

    public static void bindObjectToProgram(net.sqlcipher.database.SQLiteProgram r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto L6
            r2.bindNull(r3)
            return
        L6:
            boolean r0 = r4 instanceof java.lang.Double
            if (r0 != 0) goto L47
            boolean r0 = r4 instanceof java.lang.Float
            if (r0 == 0) goto Lf
            goto L47
        Lf:
            boolean r0 = r4 instanceof java.lang.Number
            if (r0 == 0) goto L1d
            java.lang.Number r4 = (java.lang.Number) r4
            long r0 = r4.longValue()
            r2.bindLong(r3, r0)
            return
        L1d:
            boolean r0 = r4 instanceof java.lang.Boolean
            if (r0 == 0) goto L35
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L2f
            r0 = 1
            r2.bindLong(r3, r0)
            return
        L2f:
            r0 = 0
            r2.bindLong(r3, r0)
            return
        L35:
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L3f
            byte[] r4 = (byte[]) r4
            r2.bindBlob(r3, r4)
            return
        L3f:
            java.lang.String r4 = r4.toString()
            r2.bindString(r3, r4)
            return
        L47:
            java.lang.Number r4 = (java.lang.Number) r4
            double r0 = r4.doubleValue()
            r2.bindDouble(r3, r0)
            return
    }

    public static java.lang.String concatenateWhere(java.lang.String r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L7
            return r3
        L7:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto Le
            return r2
        Le:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "("
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = ") AND ("
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static void cursorDoubleToContentValues(net.sqlcipher.Cursor r1, java.lang.String r2, android.content.ContentValues r3, java.lang.String r4) {
            int r2 = r1.getColumnIndex(r2)
            boolean r0 = r1.isNull(r2)
            if (r0 != 0) goto L16
            double r1 = r1.getDouble(r2)
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r3.put(r4, r1)
            return
        L16:
            r1 = 0
            r3.put(r4, r1)
            return
    }

    public static void cursorDoubleToContentValuesIfPresent(net.sqlcipher.Cursor r2, android.content.ContentValues r3, java.lang.String r4) {
            int r0 = r2.getColumnIndexOrThrow(r4)
            boolean r1 = r2.isNull(r0)
            if (r1 != 0) goto L15
            double r0 = r2.getDouble(r0)
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            r3.put(r4, r2)
        L15:
            return
    }

    public static void cursorDoubleToCursorValues(net.sqlcipher.Cursor r0, java.lang.String r1, android.content.ContentValues r2) {
            cursorDoubleToContentValues(r0, r1, r2, r1)
            return
    }

    public static void cursorFillWindow(net.sqlcipher.Cursor r5, int r6, android.database.CursorWindow r7) {
            if (r6 < 0) goto L84
            int r0 = r5.getCount()
            if (r6 < r0) goto La
            goto L84
        La:
            int r0 = r5.getPosition()
            int r1 = r5.getColumnCount()
            r7.clear()
            r7.setStartPosition(r6)
            r7.setNumColumns(r1)
            boolean r2 = r5.moveToPosition(r6)
            if (r2 == 0) goto L81
        L21:
            boolean r2 = r7.allocRow()
            if (r2 != 0) goto L28
            goto L81
        L28:
            r2 = 0
        L29:
            if (r2 >= r1) goto L79
            int r3 = r5.getType(r2)
            if (r3 == 0) goto L6c
            r4 = 1
            if (r3 == r4) goto L63
            r4 = 2
            if (r3 == r4) goto L5a
            r4 = 4
            if (r3 == r4) goto L4a
            java.lang.String r3 = r5.getString(r2)
            if (r3 == 0) goto L45
            boolean r3 = r7.putString(r3, r6, r2)
            goto L70
        L45:
            boolean r3 = r7.putNull(r6, r2)
            goto L70
        L4a:
            byte[] r3 = r5.getBlob(r2)
            if (r3 == 0) goto L55
            boolean r3 = r7.putBlob(r3, r6, r2)
            goto L70
        L55:
            boolean r3 = r7.putNull(r6, r2)
            goto L70
        L5a:
            double r3 = r5.getDouble(r2)
            boolean r3 = r7.putDouble(r3, r6, r2)
            goto L70
        L63:
            long r3 = r5.getLong(r2)
            boolean r3 = r7.putLong(r3, r6, r2)
            goto L70
        L6c:
            boolean r3 = r7.putNull(r6, r2)
        L70:
            if (r3 != 0) goto L76
            r7.freeLastRow()
            goto L79
        L76:
            int r2 = r2 + 1
            goto L29
        L79:
            int r6 = r6 + 1
            boolean r2 = r5.moveToNext()
            if (r2 != 0) goto L21
        L81:
            r5.moveToPosition(r0)
        L84:
            return
    }

    public static void cursorFloatToContentValuesIfPresent(net.sqlcipher.Cursor r2, android.content.ContentValues r3, java.lang.String r4) {
            int r0 = r2.getColumnIndexOrThrow(r4)
            boolean r1 = r2.isNull(r0)
            if (r1 != 0) goto L15
            float r2 = r2.getFloat(r0)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r3.put(r4, r2)
        L15:
            return
    }

    public static void cursorIntToContentValues(net.sqlcipher.Cursor r0, java.lang.String r1, android.content.ContentValues r2) {
            cursorIntToContentValues(r0, r1, r2, r1)
            return
    }

    public static void cursorIntToContentValues(net.sqlcipher.Cursor r1, java.lang.String r2, android.content.ContentValues r3, java.lang.String r4) {
            int r2 = r1.getColumnIndex(r2)
            boolean r0 = r1.isNull(r2)
            if (r0 != 0) goto L16
            int r1 = r1.getInt(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.put(r4, r1)
            return
        L16:
            r1 = 0
            r3.put(r4, r1)
            return
    }

    public static void cursorIntToContentValuesIfPresent(net.sqlcipher.Cursor r2, android.content.ContentValues r3, java.lang.String r4) {
            int r0 = r2.getColumnIndexOrThrow(r4)
            boolean r1 = r2.isNull(r0)
            if (r1 != 0) goto L15
            int r2 = r2.getInt(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.put(r4, r2)
        L15:
            return
    }

    public static void cursorLongToContentValues(net.sqlcipher.Cursor r0, java.lang.String r1, android.content.ContentValues r2) {
            cursorLongToContentValues(r0, r1, r2, r1)
            return
    }

    public static void cursorLongToContentValues(net.sqlcipher.Cursor r1, java.lang.String r2, android.content.ContentValues r3, java.lang.String r4) {
            int r2 = r1.getColumnIndex(r2)
            boolean r0 = r1.isNull(r2)
            if (r0 != 0) goto L16
            long r1 = r1.getLong(r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r3.put(r4, r1)
            return
        L16:
            r1 = 0
            r3.put(r4, r1)
            return
    }

    public static void cursorLongToContentValuesIfPresent(net.sqlcipher.Cursor r2, android.content.ContentValues r3, java.lang.String r4) {
            int r0 = r2.getColumnIndexOrThrow(r4)
            boolean r1 = r2.isNull(r0)
            if (r1 != 0) goto L15
            long r0 = r2.getLong(r0)
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            r3.put(r4, r2)
        L15:
            return
    }

    public static void cursorRowToContentValues(net.sqlcipher.Cursor r6, android.content.ContentValues r7) {
            boolean r0 = r6 instanceof net.sqlcipher.AbstractWindowedCursor
            if (r0 == 0) goto L8
            r0 = r6
            net.sqlcipher.AbstractWindowedCursor r0 = (net.sqlcipher.AbstractWindowedCursor) r0
            goto L9
        L8:
            r0 = 0
        L9:
            java.lang.String[] r1 = r6.getColumnNames()
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L2f
            if (r0 == 0) goto L23
            boolean r4 = r0.isBlob(r3)
            if (r4 == 0) goto L23
            r4 = r1[r3]
            byte[] r5 = r6.getBlob(r3)
            r7.put(r4, r5)
            goto L2c
        L23:
            r4 = r1[r3]
            java.lang.String r5 = r6.getString(r3)
            r7.put(r4, r5)
        L2c:
            int r3 = r3 + 1
            goto Lf
        L2f:
            return
    }

    public static void cursorShortToContentValuesIfPresent(net.sqlcipher.Cursor r2, android.content.ContentValues r3, java.lang.String r4) {
            int r0 = r2.getColumnIndexOrThrow(r4)
            boolean r1 = r2.isNull(r0)
            if (r1 != 0) goto L15
            short r2 = r2.getShort(r0)
            java.lang.Short r2 = java.lang.Short.valueOf(r2)
            r3.put(r4, r2)
        L15:
            return
    }

    public static void cursorStringToContentValues(net.sqlcipher.Cursor r0, java.lang.String r1, android.content.ContentValues r2) {
            cursorStringToContentValues(r0, r1, r2, r1)
            return
    }

    public static void cursorStringToContentValues(net.sqlcipher.Cursor r0, java.lang.String r1, android.content.ContentValues r2, java.lang.String r3) {
            int r1 = r0.getColumnIndexOrThrow(r1)
            java.lang.String r0 = r0.getString(r1)
            r2.put(r3, r0)
            return
    }

    public static void cursorStringToContentValuesIfPresent(net.sqlcipher.Cursor r2, android.content.ContentValues r3, java.lang.String r4) {
            int r0 = r2.getColumnIndexOrThrow(r4)
            boolean r1 = r2.isNull(r0)
            if (r1 != 0) goto L11
            java.lang.String r2 = r2.getString(r0)
            r3.put(r4, r2)
        L11:
            return
    }

    public static void cursorStringToInsertHelper(net.sqlcipher.Cursor r0, java.lang.String r1, net.sqlcipher.DatabaseUtils.InsertHelper r2, int r3) {
            int r1 = r0.getColumnIndexOrThrow(r1)
            java.lang.String r0 = r0.getString(r1)
            r2.bind(r3, r0)
            return
    }

    public static void dumpCurrentRow(net.sqlcipher.Cursor r1) {
            java.io.PrintStream r0 = java.lang.System.out
            dumpCurrentRow(r1, r0)
            return
    }

    public static void dumpCurrentRow(net.sqlcipher.Cursor r3, java.io.PrintStream r4) {
            java.lang.String[] r0 = r3.getColumnNames()
            r3.getPosition()
            r4.getClass()
            int r4 = r0.length
            r1 = 0
        Lc:
            if (r1 >= r4) goto L16
            r3.getString(r1)     // Catch: net.sqlcipher.database.SQLiteException -> L11
        L11:
            r2 = r0[r1]
            int r1 = r1 + 1
            goto Lc
        L16:
            return
    }

    public static void dumpCurrentRow(net.sqlcipher.Cursor r6, java.lang.StringBuilder r7) {
            java.lang.String[] r0 = r6.getColumnNames()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ""
            r1.append(r2)
            int r2 = r6.getPosition()
            r1.append(r2)
            java.lang.String r2 = " {\n"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r7.append(r1)
            int r1 = r0.length
            r2 = 0
        L23:
            if (r2 >= r1) goto L52
            java.lang.String r3 = r6.getString(r2)     // Catch: net.sqlcipher.database.SQLiteException -> L2a
            goto L2c
        L2a:
            java.lang.String r3 = "<unprintable>"
        L2c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "   "
            r4.append(r5)
            r5 = r0[r2]
            r4.append(r5)
            r5 = 61
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = "\n"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r7.append(r3)
            int r2 = r2 + 1
            goto L23
        L52:
            java.lang.String r6 = "}\n"
            r7.append(r6)
            return
    }

    public static java.lang.String dumpCurrentRowToString(net.sqlcipher.Cursor r1) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            dumpCurrentRow(r1, r0)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static void dumpCursor(net.sqlcipher.Cursor r1) {
            java.io.PrintStream r0 = java.lang.System.out
            dumpCursor(r1, r0)
            return
    }

    public static void dumpCursor(net.sqlcipher.Cursor r2, java.io.PrintStream r3) {
            java.util.Objects.toString(r2)
            r3.getClass()
            if (r2 == 0) goto L1d
            int r0 = r2.getPosition()
            r1 = -1
            r2.moveToPosition(r1)
        L10:
            boolean r1 = r2.moveToNext()
            if (r1 == 0) goto L1a
            dumpCurrentRow(r2, r3)
            goto L10
        L1a:
            r2.moveToPosition(r0)
        L1d:
            return
    }

    public static void dumpCursor(net.sqlcipher.Cursor r2, java.lang.StringBuilder r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ">>>>> Dumping cursor "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = "\n"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.append(r0)
            if (r2 == 0) goto L30
            int r0 = r2.getPosition()
            r1 = -1
            r2.moveToPosition(r1)
        L23:
            boolean r1 = r2.moveToNext()
            if (r1 == 0) goto L2d
            dumpCurrentRow(r2, r3)
            goto L23
        L2d:
            r2.moveToPosition(r0)
        L30:
            java.lang.String r2 = "<<<<<\n"
            r3.append(r2)
            return
    }

    public static java.lang.String dumpCursorToString(net.sqlcipher.Cursor r1) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            dumpCursor(r1, r0)
            java.lang.String r1 = r0.toString()
            return r1
    }

    private static char[] encodeHex(byte[] r7, char[] r8) {
            int r0 = r7.length
            int r1 = r0 << 1
            char[] r1 = new char[r1]
            r2 = 0
            r3 = 0
        L7:
            if (r2 >= r0) goto L20
            int r4 = r3 + 1
            r5 = r7[r2]
            r6 = r5 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >>> 4
            char r6 = r8[r6]
            r1[r3] = r6
            int r3 = r3 + 2
            r5 = r5 & 15
            char r5 = r8[r5]
            r1[r4] = r5
            int r2 = r2 + 1
            goto L7
        L20:
            return r1
    }

    public static java.lang.String getCollationKey(java.lang.String r4) {
            byte[] r4 = getCollationKeyInBytes(r4)
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Exception -> L11
            int r1 = getKeyLen(r4)     // Catch: java.lang.Exception -> L11
            java.lang.String r2 = "ISO8859_1"
            r3 = 0
            r0.<init>(r4, r3, r1, r2)     // Catch: java.lang.Exception -> L11
            return r0
        L11:
            java.lang.String r4 = ""
            return r4
    }

    private static byte[] getCollationKeyInBytes(java.lang.String r2) {
            java.text.Collator r0 = net.sqlcipher.DatabaseUtils.mColl
            if (r0 != 0) goto Le
            java.text.Collator r0 = java.text.Collator.getInstance()
            net.sqlcipher.DatabaseUtils.mColl = r0
            r1 = 0
            r0.setStrength(r1)
        Le:
            java.text.Collator r0 = net.sqlcipher.DatabaseUtils.mColl
            java.text.CollationKey r2 = r0.getCollationKey(r2)
            byte[] r2 = r2.toByteArray()
            return r2
    }

    public static java.lang.String getHexCollationKey(java.lang.String r3) {
            byte[] r3 = getCollationKeyInBytes(r3)
            char[] r0 = net.sqlcipher.DatabaseUtils.HEX_DIGITS_LOWER
            char[] r0 = encodeHex(r3, r0)
            java.lang.String r1 = new java.lang.String
            int r3 = getKeyLen(r3)
            int r3 = r3 * 2
            r2 = 0
            r1.<init>(r0, r2, r3)
            return r1
    }

    private static int getKeyLen(byte[] r1) {
            int r0 = r1.length
            int r0 = r0 + (-1)
            r0 = r1[r0]
            if (r0 == 0) goto L9
            int r1 = r1.length
            return r1
        L9:
            int r1 = r1.length
            int r1 = r1 + (-1)
            return r1
    }

    public static int getTypeOfObject(java.lang.Object r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            boolean r0 = r1 instanceof byte[]
            if (r0 == 0) goto La
            r1 = 4
            return r1
        La:
            boolean r0 = r1 instanceof java.lang.Float
            if (r0 != 0) goto L20
            boolean r0 = r1 instanceof java.lang.Double
            if (r0 == 0) goto L13
            goto L20
        L13:
            boolean r0 = r1 instanceof java.lang.Long
            if (r0 != 0) goto L1e
            boolean r1 = r1 instanceof java.lang.Integer
            if (r1 == 0) goto L1c
            goto L1e
        L1c:
            r1 = 3
            return r1
        L1e:
            r1 = 1
            return r1
        L20:
            r1 = 2
            return r1
    }

    public static long longForQuery(net.sqlcipher.database.SQLiteDatabase r0, java.lang.String r1, java.lang.String[] r2) {
            net.sqlcipher.database.SQLiteStatement r0 = r0.m39compileStatement(r1)
            long r1 = longForQuery(r0, r2)     // Catch: java.lang.Throwable -> Lc
            r0.close()
            return r1
        Lc:
            r1 = move-exception
            r0.close()
            throw r1
    }

    public static long longForQuery(net.sqlcipher.database.SQLiteStatement r3, java.lang.String[] r4) {
            if (r4 == 0) goto Lf
            int r0 = r4.length
            r1 = 0
        L4:
            if (r1 >= r0) goto Lf
            int r2 = r1 + 1
            r1 = r4[r1]
            bindObjectToProgram(r3, r2, r1)
            r1 = r2
            goto L4
        Lf:
            long r3 = r3.simpleQueryForLong()
            return r3
    }

    public static long queryNumEntries(net.sqlcipher.database.SQLiteDatabase r8, java.lang.String r9) {
            java.lang.String[] r2 = net.sqlcipher.DatabaseUtils.countProjection
            r6 = 0
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r8
            r1 = r9
            net.sqlcipher.Cursor r8 = r0.query(r1, r2, r3, r4, r5, r6, r7)
            r8.moveToFirst()     // Catch: java.lang.Throwable -> L19
            r9 = 0
            long r0 = r8.getLong(r9)     // Catch: java.lang.Throwable -> L19
            r8.close()
            return r0
        L19:
            r0 = move-exception
            r9 = r0
            r8.close()
            throw r9
    }

    public static final void readExceptionFromParcel(android.os.Parcel r2) {
            int r0 = r2.readInt()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r1 = r2.readString()
            readExceptionFromParcel(r2, r1, r0)
            return
    }

    private static final void readExceptionFromParcel(android.os.Parcel r0, java.lang.String r1, int r2) {
            switch(r2) {
                case 2: goto L31;
                case 3: goto L2b;
                case 4: goto L25;
                case 5: goto L1f;
                case 6: goto L19;
                case 7: goto L13;
                case 8: goto Ld;
                case 9: goto L7;
                default: goto L3;
            }
        L3:
            r0.readException(r2, r1)
            return
        L7:
            net.sqlcipher.database.SQLiteException r0 = new net.sqlcipher.database.SQLiteException
            r0.<init>(r1)
            throw r0
        Ld:
            net.sqlcipher.database.SQLiteDiskIOException r0 = new net.sqlcipher.database.SQLiteDiskIOException
            r0.<init>(r1)
            throw r0
        L13:
            net.sqlcipher.database.SQLiteFullException r0 = new net.sqlcipher.database.SQLiteFullException
            r0.<init>(r1)
            throw r0
        L19:
            net.sqlcipher.database.SQLiteDatabaseCorruptException r0 = new net.sqlcipher.database.SQLiteDatabaseCorruptException
            r0.<init>(r1)
            throw r0
        L1f:
            net.sqlcipher.database.SQLiteConstraintException r0 = new net.sqlcipher.database.SQLiteConstraintException
            r0.<init>(r1)
            throw r0
        L25:
            net.sqlcipher.database.SQLiteAbortException r0 = new net.sqlcipher.database.SQLiteAbortException
            r0.<init>(r1)
            throw r0
        L2b:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L31:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
    }

    public static void readExceptionWithFileNotFoundExceptionFromParcel(android.os.Parcel r3) throws java.io.FileNotFoundException {
            int r0 = r3.readInt()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r1 = r3.readString()
            r2 = 1
            if (r0 == r2) goto L12
            readExceptionFromParcel(r3, r1, r0)
            return
        L12:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException
            r3.<init>(r1)
            throw r3
    }

    public static void readExceptionWithOperationApplicationExceptionFromParcel(android.os.Parcel r3) throws android.content.OperationApplicationException {
            int r0 = r3.readInt()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r1 = r3.readString()
            r2 = 10
            if (r0 == r2) goto L13
            readExceptionFromParcel(r3, r1, r0)
            return
        L13:
            android.content.OperationApplicationException r3 = new android.content.OperationApplicationException
            r3.<init>(r1)
            throw r3
    }

    public static java.lang.String sqlEscapeString(java.lang.String r1) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            appendEscapedSQLString(r0, r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.String stringForQuery(net.sqlcipher.database.SQLiteDatabase r0, java.lang.String r1, java.lang.String[] r2) {
            net.sqlcipher.database.SQLiteStatement r0 = r0.m39compileStatement(r1)
            java.lang.String r1 = stringForQuery(r0, r2)     // Catch: java.lang.Throwable -> Lc
            r0.close()
            return r1
        Lc:
            r1 = move-exception
            r0.close()
            throw r1
    }

    public static java.lang.String stringForQuery(net.sqlcipher.database.SQLiteStatement r3, java.lang.String[] r4) {
            if (r4 == 0) goto Lf
            int r0 = r4.length
            r1 = 0
        L4:
            if (r1 >= r0) goto Lf
            int r2 = r1 + 1
            r1 = r4[r1]
            bindObjectToProgram(r3, r2, r1)
            r1 = r2
            goto L4
        Lf:
            java.lang.String r3 = r3.simpleQueryForString()
            return r3
    }

    public static final void writeExceptionToParcel(android.os.Parcel r1, java.lang.Exception r2) {
            boolean r0 = r2 instanceof java.io.FileNotFoundException
            if (r0 == 0) goto L6
            r0 = 1
            goto L3e
        L6:
            boolean r0 = r2 instanceof java.lang.IllegalArgumentException
            if (r0 == 0) goto Lc
            r0 = 2
            goto L3e
        Lc:
            boolean r0 = r2 instanceof java.lang.UnsupportedOperationException
            if (r0 == 0) goto L12
            r0 = 3
            goto L3e
        L12:
            boolean r0 = r2 instanceof net.sqlcipher.database.SQLiteAbortException
            if (r0 == 0) goto L18
            r0 = 4
            goto L3e
        L18:
            boolean r0 = r2 instanceof net.sqlcipher.database.SQLiteConstraintException
            if (r0 == 0) goto L1e
            r0 = 5
            goto L3e
        L1e:
            boolean r0 = r2 instanceof net.sqlcipher.database.SQLiteDatabaseCorruptException
            if (r0 == 0) goto L24
            r0 = 6
            goto L3e
        L24:
            boolean r0 = r2 instanceof net.sqlcipher.database.SQLiteFullException
            if (r0 == 0) goto L2a
            r0 = 7
            goto L3e
        L2a:
            boolean r0 = r2 instanceof net.sqlcipher.database.SQLiteDiskIOException
            if (r0 == 0) goto L31
            r0 = 8
            goto L3e
        L31:
            boolean r0 = r2 instanceof net.sqlcipher.database.SQLiteException
            if (r0 == 0) goto L38
            r0 = 9
            goto L3e
        L38:
            boolean r0 = r2 instanceof android.content.OperationApplicationException
            if (r0 == 0) goto L49
            r0 = 10
        L3e:
            r1.writeInt(r0)
            java.lang.String r2 = r2.getMessage()
            r1.writeString(r2)
            return
        L49:
            r1.writeException(r2)
            return
    }
}
