package xyz.adscope.common.v2.persistent.db;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class IBaseDbHelper implements xyz.adscope.common.v2.persistent.db.IBaseDBOperator {
    protected static final java.lang.String CONDITION_EQUALS = " = ";
    protected static final java.lang.String CONDITION_GREATER_THEN = " > ";
    public static final java.lang.String CONDITION_IN = " IN ";
    protected static final java.lang.String CONDITION_LESS_THEN = " < ";
    private static final java.lang.String DB_SUFFIX = ".db";
    protected static final int DEFAULT_DB_VERSION = 1;
    public static final java.lang.String PLACE_HOLDER_TABLE_NAME = "TABLE_NAME";
    private static final java.lang.String TABLE_NAME_FORMAT = "t_%s_%s";
    private static final java.lang.String TAG = "IBaseDbHelper";
    private static final java.lang.String WHERE_CUSTOM_FORMAT = " %s %s ? ";
    private final java.util.List<java.lang.Class<? extends xyz.adscope.common.v2.model.IDatabaseModel>> mAcceptModel;
    private final java.lang.String mFinalDbName;
    private final xyz.adscope.common.v2.persistent.db.IBaseDbHelper.DbOpenHelper mOpenHelper;
    private final java.util.Map<java.lang.Class<? extends xyz.adscope.common.v2.model.IDatabaseModel>, java.lang.String> mTableNameMapping;
    private final android.database.sqlite.SQLiteDatabase mWriteAble;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.common.v2.persistent.db.IBaseDbHelper$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class DbOpenHelper extends android.database.sqlite.SQLiteOpenHelper {
        final /* synthetic */ xyz.adscope.common.v2.persistent.db.IBaseDbHelper this$0;

        private DbOpenHelper(xyz.adscope.common.v2.persistent.db.IBaseDbHelper r3, android.content.Context r4) {
                r2 = this;
                r2.this$0 = r3
                java.lang.String r0 = xyz.adscope.common.v2.persistent.db.IBaseDbHelper.access$100(r3)
                android.database.sqlite.SQLiteDatabase$CursorFactory r1 = r3.getFactory()
                int r3 = r3.getDbVersion()
                r2.<init>(r4, r0, r1, r3)
                return
        }

        /* synthetic */ DbOpenHelper(xyz.adscope.common.v2.persistent.db.IBaseDbHelper r1, android.content.Context r2, xyz.adscope.common.v2.persistent.db.IBaseDbHelper.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private void createTable(android.database.sqlite.SQLiteDatabase r4, java.util.Map<java.lang.Class<? extends xyz.adscope.common.v2.model.IDatabaseModel>, java.lang.String> r5) {
                r3 = this;
                if (r5 == 0) goto L5f
                boolean r0 = r5.isEmpty()
                if (r0 != 0) goto L5f
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "建表..."
                r0.append(r1)
                int r1 = r5.size()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "IBaseDbHelper"
                xyz.adscope.common.v2.log.SDKLog.d(r1, r0)
                java.util.Set r5 = r5.entrySet()
                java.util.Iterator r5 = r5.iterator()
            L2a:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L5f
                java.lang.Object r0 = r5.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                java.lang.Class r1 = (java.lang.Class) r1
                java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.InstantiationException -> L58 java.lang.IllegalAccessException -> L5a
                xyz.adscope.common.v2.model.IDatabaseModel r1 = (xyz.adscope.common.v2.model.IDatabaseModel) r1     // Catch: java.lang.InstantiationException -> L58 java.lang.IllegalAccessException -> L5a
                java.lang.String[] r2 = r1.getColumns()     // Catch: java.lang.InstantiationException -> L58 java.lang.IllegalAccessException -> L5a
                if (r2 == 0) goto L2a
                xyz.adscope.common.v2.persistent.db.IBaseDbHelper r2 = r3.this$0     // Catch: java.lang.InstantiationException -> L58 java.lang.IllegalAccessException -> L5a
                java.lang.Object r0 = r0.getValue()     // Catch: java.lang.InstantiationException -> L58 java.lang.IllegalAccessException -> L5a
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.InstantiationException -> L58 java.lang.IllegalAccessException -> L5a
                java.lang.String[] r1 = r1.getColumns()     // Catch: java.lang.InstantiationException -> L58 java.lang.IllegalAccessException -> L5a
                xyz.adscope.common.v2.persistent.db.IBaseDbHelper.access$300(r2, r4, r0, r1)     // Catch: java.lang.InstantiationException -> L58 java.lang.IllegalAccessException -> L5a
                goto L2a
            L58:
                r0 = move-exception
                goto L5b
            L5a:
                r0 = move-exception
            L5b:
                xyz.adscope.common.v2.log.SDKLog.stack(r0)
                goto L2a
            L5f:
                return
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(android.database.sqlite.SQLiteDatabase r3) {
                r2 = this;
                java.lang.String r0 = "IBaseDbHelper"
                java.lang.String r1 = "数据库创建..."
                xyz.adscope.common.v2.log.SDKLog.d(r0, r1)
                xyz.adscope.common.v2.persistent.db.IBaseDbHelper r0 = r2.this$0
                java.util.Map r0 = xyz.adscope.common.v2.persistent.db.IBaseDbHelper.access$200(r0)
                r2.createTable(r3, r0)
                return
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(android.database.sqlite.SQLiteDatabase r3, int r4, int r5) {
                r2 = this;
                xyz.adscope.common.v2.persistent.db.IBaseDbHelper r0 = r2.this$0
                r0.upgrade(r3, r4, r5)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "数据库更新... old "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r1 = " new "
                r0.append(r1)
                r0.append(r5)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "IBaseDbHelper"
                xyz.adscope.common.v2.log.SDKLog.d(r1, r0)
                if (r4 >= r5) goto L2e
                xyz.adscope.common.v2.persistent.db.IBaseDbHelper r4 = r2.this$0
                java.util.Map r4 = xyz.adscope.common.v2.persistent.db.IBaseDbHelper.access$200(r4)
                r2.createTable(r3, r4)
            L2e:
                return
        }
    }

    public IBaseDbHelper(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = r2.parseFinalDbName()
            r2.mFinalDbName = r0
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            java.util.List r0 = r2.acceptTable()
            r2.mAcceptModel = r0
            java.util.Map r0 = r2.createMappingByModel(r0)
            r2.mTableNameMapping = r0
            xyz.adscope.common.v2.persistent.db.IBaseDbHelper$DbOpenHelper r0 = new xyz.adscope.common.v2.persistent.db.IBaseDbHelper$DbOpenHelper
            r1 = 0
            r0.<init>(r2, r3, r1)
            r2.mOpenHelper = r0
            android.database.sqlite.SQLiteDatabase r3 = r0.getWritableDatabase()
            r2.mWriteAble = r3
            return
    }

    static /* synthetic */ java.lang.String access$100(xyz.adscope.common.v2.persistent.db.IBaseDbHelper r0) {
            java.lang.String r0 = r0.mFinalDbName
            return r0
    }

    static /* synthetic */ java.util.Map access$200(xyz.adscope.common.v2.persistent.db.IBaseDbHelper r0) {
            java.util.Map<java.lang.Class<? extends xyz.adscope.common.v2.model.IDatabaseModel>, java.lang.String> r0 = r0.mTableNameMapping
            return r0
    }

    static /* synthetic */ void access$300(xyz.adscope.common.v2.persistent.db.IBaseDbHelper r0, android.database.sqlite.SQLiteDatabase r1, java.lang.String r2, java.lang.String[] r3) {
            r0.createTableByModel(r1, r2, r3)
            return
    }

    private java.util.Map<java.lang.Class<? extends xyz.adscope.common.v2.model.IDatabaseModel>, java.lang.String> createMappingByModel(java.util.List<java.lang.Class<? extends xyz.adscope.common.v2.model.IDatabaseModel>> r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "创建数据库映射..."
            r0.append(r1)
            int r1 = r4.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "IBaseDbHelper"
            xyz.adscope.common.v2.log.SDKLog.d(r1, r0)
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L3e
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L29:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r4.next()
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.String r2 = r3.parseTableName(r1)
            r0.put(r1, r2)
            goto L29
        L3d:
            return r0
        L3e:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            return r4
    }

    private void createTableByModel(android.database.sqlite.SQLiteDatabase r5, java.lang.String r6, java.lang.String[] r7) {
            r4 = this;
            if (r5 == 0) goto L63
            if (r7 == 0) goto L63
            int r0 = r7.length
            if (r0 <= 0) goto L63
            r5.beginTransaction()     // Catch: java.lang.Throwable -> L3c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r0.<init>()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = "create table "
            r0.append(r1)     // Catch: java.lang.Throwable -> L3c
            r0.append(r6)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r6 = "("
            r0.append(r6)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r6 = "id"
            r0.append(r6)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r6 = " integer primary key autoincrement, "
            r0.append(r6)     // Catch: java.lang.Throwable -> L3c
            int r6 = r7.length     // Catch: java.lang.Throwable -> L3c
            r1 = 0
        L28:
            if (r1 >= r6) goto L3e
            r2 = r7[r1]     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = " "
            r0.append(r3)     // Catch: java.lang.Throwable -> L3c
            r0.append(r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = " nvarchar, "
            r0.append(r2)     // Catch: java.lang.Throwable -> L3c
            int r1 = r1 + 1
            goto L28
        L3c:
            r6 = move-exception
            goto L57
        L3e:
            java.lang.String r6 = ","
            int r6 = r0.lastIndexOf(r6)     // Catch: java.lang.Throwable -> L3c
            r7 = 41
            r0.setCharAt(r6, r7)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r6 = r0.toString()     // Catch: java.lang.Throwable -> L3c
            r5.execSQL(r6)     // Catch: java.lang.Throwable -> L3c
            r5.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L3c
            r5.endTransaction()
            return
        L57:
            xyz.adscope.common.v2.log.SDKLog.stack(r6)     // Catch: java.lang.Throwable -> L5e
            r5.endTransaction()
            return
        L5e:
            r6 = move-exception
            r5.endTransaction()
            throw r6
        L63:
            return
    }

    private boolean isAcceptModel(java.lang.Class<? extends xyz.adscope.common.v2.model.IDatabaseModel> r2) {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.mWriteAble
            if (r0 == 0) goto L10
            java.util.List<java.lang.Class<? extends xyz.adscope.common.v2.model.IDatabaseModel>> r0 = r1.mAcceptModel
            if (r0 == 0) goto L10
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L10
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }

    private boolean isAcceptModel(xyz.adscope.common.v2.model.IDatabaseModel r1) {
            r0 = this;
            if (r1 == 0) goto Lb
            java.lang.Class r1 = r1.getClass()
            boolean r1 = r0.isAcceptModel(r1)
            return r1
        Lb:
            r1 = 0
            return r1
    }

    private boolean isContentValuesValid(xyz.adscope.common.v2.model.IDatabaseModel r2) {
            r1 = this;
            if (r2 == 0) goto L14
            android.content.ContentValues r0 = r2.getContentValuesStruct()
            if (r0 == 0) goto L14
            android.content.ContentValues r2 = r2.getContentValuesStruct()
            int r2 = r2.size()
            if (r2 <= 0) goto L14
            r2 = 1
            return r2
        L14:
            r2 = 0
            return r2
    }

    private java.lang.String parseFinalDbName() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r4.createDBNameWithoutSuffix()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L21
            java.lang.String r2 = "."
            int r3 = r1.lastIndexOf(r2)
            if (r3 <= 0) goto L21
            int r2 = r1.lastIndexOf(r2)
            int r2 = r2 + 1
            java.lang.String r1 = r1.substring(r2)
        L21:
            java.lang.String r2 = "scope_"
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "_"
            r0.append(r1)
            java.lang.String r1 = ".db"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    private java.lang.String parseTableName(java.lang.Class<? extends xyz.adscope.common.v2.model.IDatabaseModel> r4) {
            r3 = this;
            java.lang.String r0 = r3.createDBNameWithoutSuffix()
            java.lang.String r4 = r4.getSimpleName()
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 1
            r1[r0] = r4
            java.lang.String r4 = "t_%s_%s"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            return r4
    }

    protected abstract java.util.List<java.lang.Class<? extends xyz.adscope.common.v2.model.IDatabaseModel>> acceptTable();

    protected abstract java.lang.String createDBNameWithoutSuffix();

    @Override // xyz.adscope.common.v2.persistent.db.IBaseDBOperator
    public synchronized int delete(java.lang.Class<? extends xyz.adscope.common.v2.model.IDatabaseModel> r3, java.lang.String r4, java.lang.String[] r5) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isAcceptModel(r3)     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L19
            android.database.sqlite.SQLiteDatabase r0 = r2.mWriteAble     // Catch: java.lang.Throwable -> L17
            java.util.Map<java.lang.Class<? extends xyz.adscope.common.v2.model.IDatabaseModel>, java.lang.String> r1 = r2.mTableNameMapping     // Catch: java.lang.Throwable -> L17
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L17
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L17
            int r3 = r0.delete(r3, r4, r5)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r2)
            return r3
        L17:
            r3 = move-exception
            goto L1c
        L19:
            monitor-exit(r2)
            r3 = -1
            return r3
        L1c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r3
    }

    @Override // xyz.adscope.common.v2.persistent.db.IBaseDBOperator
    public synchronized int deleteBetweenPrimaryKey(java.lang.Class<? extends xyz.adscope.common.v2.model.IDatabaseModel> r5, long[] r6) {
            r4 = this;
            monitor-enter(r4)
            if (r6 == 0) goto L34
            int r0 = r6.length     // Catch: java.lang.Throwable -> L2a
            r1 = 2
            if (r0 < r1) goto L2c
            java.util.Arrays.sort(r6)     // Catch: java.lang.Throwable -> L2a
            r0 = 0
            r0 = r6[r0]     // Catch: java.lang.Throwable -> L2a
            int r2 = r6.length     // Catch: java.lang.Throwable -> L2a
            int r2 = r2 + (-1)
            r2 = r6[r2]     // Catch: java.lang.Throwable -> L2a
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L2a
            java.lang.String[] r6 = new java.lang.String[]{r6, r0}     // Catch: java.lang.Throwable -> L2a
            java.lang.String r0 = "id"
            java.lang.String r0 = r4.whereBetweenAnd(r0)     // Catch: java.lang.Throwable -> L2a
            int r5 = r4.delete(r5, r0, r6)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r4)
            return r5
        L2a:
            r5 = move-exception
            goto L32
        L2c:
            int r5 = r4.deleteInPrimaryKey(r5, r6)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r4)
            return r5
        L32:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2a
            throw r5
        L34:
            monitor-exit(r4)
            r5 = -1
            return r5
    }

    @Override // xyz.adscope.common.v2.persistent.db.IBaseDBOperator
    public synchronized int deleteByPrimaryKey(java.lang.Class<? extends xyz.adscope.common.v2.model.IDatabaseModel> r2, long r3) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "id"
            java.lang.String r0 = r1.whereEquals(r0)     // Catch: java.lang.Throwable -> L15
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L15
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L15
            int r2 = r1.delete(r2, r0, r3)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r1)
            return r2
        L15:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            throw r2
    }

    @Override // xyz.adscope.common.v2.persistent.db.IBaseDBOperator
    public int deleteEqualWhere(java.lang.Class<? extends xyz.adscope.common.v2.model.IDatabaseModel> r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            boolean r0 = r2.isAcceptModel(r3)
            if (r0 == 0) goto L1d
            android.database.sqlite.SQLiteDatabase r0 = r2.mWriteAble
            java.util.Map<java.lang.Class<? extends xyz.adscope.common.v2.model.IDatabaseModel>, java.lang.String> r1 = r2.mTableNameMapping
            java.lang.Object r3 = r1.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = r2.whereEquals(r4)
            java.lang.String[] r5 = new java.lang.String[]{r5}
            int r3 = r0.delete(r3, r4, r5)
            return r3
        L1d:
            r3 = -1
            return r3
    }

    @Override // xyz.adscope.common.v2.persistent.db.IBaseDBOperator
    public int deleteGreaterThenWhere(java.lang.Class<? extends xyz.adscope.common.v2.model.IDatabaseModel> r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            boolean r0 = r2.isAcceptModel(r3)
            if (r0 == 0) goto L1d
            android.database.sqlite.SQLiteDatabase r0 = r2.mWriteAble
            java.util.Map<java.lang.Class<? extends xyz.adscope.common.v2.model.IDatabaseModel>, java.lang.String> r1 = r2.mTableNameMapping
            java.lang.Object r3 = r1.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = r2.whereGreaterThen(r4)
            java.lang.String[] r5 = new java.lang.String[]{r5}
            int r3 = r0.delete(r3, r4, r5)
            return r3
        L1d:
            r3 = -1
            return r3
    }

    @Override // xyz.adscope.common.v2.persistent.db.IBaseDBOperator
    public synchronized int deleteInPrimaryKey(java.lang.Class<? extends xyz.adscope.common.v2.model.IDatabaseModel> r5, long[] r6) {
            r4 = this;
            monitor-enter(r4)
            if (r6 == 0) goto L29
            int r0 = r6.length     // Catch: java.lang.Throwable -> L18
            if (r0 <= 0) goto L29
            int r0 = r6.length     // Catch: java.lang.Throwable -> L18
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L18
            r1 = 0
        La:
            int r2 = r6.length     // Catch: java.lang.Throwable -> L18
            if (r1 >= r2) goto L1a
            r2 = r6[r1]     // Catch: java.lang.Throwable -> L18
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L18
            r0[r1] = r2     // Catch: java.lang.Throwable -> L18
            int r1 = r1 + 1
            goto La
        L18:
            r5 = move-exception
            goto L27
        L1a:
            int r6 = r6.length     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "id"
            java.lang.String r6 = r4.whereIn(r1, r6)     // Catch: java.lang.Throwable -> L18
            int r5 = r4.delete(r5, r6, r0)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r4)
            return r5
        L27:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L18
            throw r5
        L29:
            monitor-exit(r4)
            r5 = -1
            return r5
    }

    @Override // xyz.adscope.common.v2.persistent.db.IBaseDBOperator
    public int deleteLessThenWhere(java.lang.Class<? extends xyz.adscope.common.v2.model.IDatabaseModel> r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            boolean r0 = r2.isAcceptModel(r3)
            if (r0 == 0) goto L1d
            android.database.sqlite.SQLiteDatabase r0 = r2.mWriteAble
            java.util.Map<java.lang.Class<? extends xyz.adscope.common.v2.model.IDatabaseModel>, java.lang.String> r1 = r2.mTableNameMapping
            java.lang.Object r3 = r1.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = r2.whereGreaterThen(r4)
            java.lang.String[] r5 = new java.lang.String[]{r5}
            int r3 = r0.delete(r3, r4, r5)
            return r3
        L1d:
            r3 = -1
            return r3
    }

    @Override // xyz.adscope.common.v2.persistent.db.IBaseDBOperator
    public synchronized boolean execSQL(java.lang.Class<? extends xyz.adscope.common.v2.model.IDatabaseModel> r2, java.lang.String r3) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L37
            android.database.sqlite.SQLiteDatabase r0 = r1.mWriteAble     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L37
            java.lang.String r0 = "TABLE_NAME"
            boolean r0 = r3.contains(r0)     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L37
            java.util.Map<java.lang.Class<? extends xyz.adscope.common.v2.model.IDatabaseModel>, java.lang.String> r0 = r1.mTableNameMapping     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L37
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L31
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L37
            java.lang.String r0 = "TABLE_NAME"
            java.lang.String r2 = r3.replaceAll(r0, r2)     // Catch: java.lang.Throwable -> L31
            android.database.sqlite.SQLiteDatabase r3 = r1.mWriteAble     // Catch: java.lang.Throwable -> L31 android.database.SQLException -> L33
            r3.execSQL(r2)     // Catch: java.lang.Throwable -> L31 android.database.SQLException -> L33
            monitor-exit(r1)
            r2 = 1
            return r2
        L31:
            r2 = move-exception
            goto L3a
        L33:
            r2 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r2)     // Catch: java.lang.Throwable -> L31
        L37:
            monitor-exit(r1)
            r2 = 0
            return r2
        L3a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L31
            throw r2
    }

    @Override // xyz.adscope.common.v2.persistent.db.IBaseDBOperator
    public synchronized boolean execSQL(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto L17
            android.database.sqlite.SQLiteDatabase r0 = r1.mWriteAble     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L17
            r0.execSQL(r2)     // Catch: java.lang.Throwable -> L11 android.database.SQLException -> L13
            monitor-exit(r1)
            r2 = 1
            return r2
        L11:
            r2 = move-exception
            goto L1a
        L13:
            r2 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r2)     // Catch: java.lang.Throwable -> L11
        L17:
            monitor-exit(r1)
            r2 = 0
            return r2
        L1a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            throw r2
    }

    protected int getDbVersion() {
            r1 = this;
            r0 = 2
            return r0
    }

    protected android.database.sqlite.SQLiteDatabase.CursorFactory getFactory() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.common.v2.persistent.db.IBaseDBOperator
    public java.lang.String getOrderByAsc(java.lang.String r2) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = " "
            r0.append(r2)
            java.lang.String r2 = "asc"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // xyz.adscope.common.v2.persistent.db.IBaseDBOperator
    public java.lang.String getOrderByDesc(java.lang.String r2) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = " "
            r0.append(r2)
            java.lang.String r2 = "desc"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // xyz.adscope.common.v2.persistent.db.IBaseDBOperator
    public synchronized long insert(xyz.adscope.common.v2.model.IDatabaseModel r4) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.isAcceptModel(r4)     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L28
            boolean r0 = r3.isContentValuesValid(r4)     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L28
            android.database.sqlite.SQLiteDatabase r0 = r3.mWriteAble     // Catch: java.lang.Throwable -> L26
            java.util.Map<java.lang.Class<? extends xyz.adscope.common.v2.model.IDatabaseModel>, java.lang.String> r1 = r3.mTableNameMapping     // Catch: java.lang.Throwable -> L26
            java.lang.Class r2 = r4.getClass()     // Catch: java.lang.Throwable -> L26
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L26
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L26
            android.content.ContentValues r4 = r4.getContentValuesStruct()     // Catch: java.lang.Throwable -> L26
            r2 = 0
            long r0 = r0.insert(r1, r2, r4)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r3)
            return r0
        L26:
            r4 = move-exception
            goto L2c
        L28:
            monitor-exit(r3)
            r0 = -1
            return r0
        L2c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L26
            throw r4
    }

    @Override // xyz.adscope.common.v2.persistent.db.IBaseDBOperator
    public synchronized <E extends xyz.adscope.common.v2.model.IDatabaseModel> java.util.List<E> query(java.lang.Class<E> r9, java.lang.String r10) {
            r8 = this;
            monitor-enter(r8)
            r5 = 0
            r7 = -1
            r3 = 0
            r4 = 0
            r1 = r8
            r2 = r9
            r6 = r10
            java.util.List r9 = r1.query(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r8)
            return r9
        Le:
            r0 = move-exception
            r9 = r0
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Le
            throw r9
    }

    @Override // xyz.adscope.common.v2.persistent.db.IBaseDBOperator
    public synchronized <E extends xyz.adscope.common.v2.model.IDatabaseModel> java.util.List<E> query(java.lang.Class<E> r9, java.lang.String r10, java.lang.String[] r11, java.lang.String r12, int r13) {
            r8 = this;
            monitor-enter(r8)
            r3 = 0
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            java.util.List r9 = r1.query(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r8)
            return r9
        Le:
            r0 = move-exception
            r9 = r0
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Le
            throw r9
    }

    @Override // xyz.adscope.common.v2.persistent.db.IBaseDBOperator
    public synchronized <E extends xyz.adscope.common.v2.model.IDatabaseModel> java.util.List<E> query(java.lang.Class<E> r11, java.lang.String[] r12, java.lang.String r13, java.lang.String[] r14, java.lang.String r15, int r16) {
            r10 = this;
            monitor-enter(r10)
            r6 = 0
            r8 = 0
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r7 = r15
            r9 = r16
            java.util.List r11 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r10)
            return r11
        L11:
            r0 = move-exception
            r11 = r0
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L11
            throw r11
    }

    @Override // xyz.adscope.common.v2.persistent.db.IBaseDBOperator
    public synchronized <E extends xyz.adscope.common.v2.model.IDatabaseModel> java.util.List<E> query(java.lang.Class<E> r12, java.lang.String[] r13, java.lang.String r14, java.lang.String[] r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, int r19) {
            r11 = this;
            monitor-enter(r11)
            boolean r0 = r11.isAcceptModel(r12)     // Catch: java.lang.Throwable -> L19
            r1 = 0
            if (r0 == 0) goto L64
            java.util.Map<java.lang.Class<? extends xyz.adscope.common.v2.model.IDatabaseModel>, java.lang.String> r0 = r11.mTableNameMapping     // Catch: java.lang.Throwable -> L19
            java.lang.Object r0 = r0.get(r12)     // Catch: java.lang.Throwable -> L19
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L19
            if (r19 <= 0) goto L1c
            java.lang.String r0 = java.lang.String.valueOf(r19)     // Catch: java.lang.Throwable -> L19
            r10 = r0
            goto L1d
        L19:
            r0 = move-exception
            r12 = r0
            goto L66
        L1c:
            r10 = r1
        L1d:
            android.database.sqlite.SQLiteDatabase r2 = r11.mWriteAble     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L64
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r9 = r17
            r8 = r18
            android.database.Cursor r13 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L64
            if (r13 == 0) goto L5f
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L46
            r14.<init>()     // Catch: java.lang.Throwable -> L46
        L33:
            boolean r0 = r13.moveToNext()     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L50
            java.lang.Object r0 = r12.newInstance()     // Catch: java.lang.Throwable -> L46 java.lang.InstantiationException -> L49 java.lang.IllegalAccessException -> L4b
            xyz.adscope.common.v2.model.IDatabaseModel r0 = (xyz.adscope.common.v2.model.IDatabaseModel) r0     // Catch: java.lang.Throwable -> L46 java.lang.InstantiationException -> L49 java.lang.IllegalAccessException -> L4b
            r0.parseFromDb(r13)     // Catch: java.lang.Throwable -> L46 java.lang.InstantiationException -> L49 java.lang.IllegalAccessException -> L4b
            r14.add(r0)     // Catch: java.lang.Throwable -> L46 java.lang.InstantiationException -> L49 java.lang.IllegalAccessException -> L4b
            goto L33
        L46:
            r0 = move-exception
            r12 = r0
            goto L55
        L49:
            r0 = move-exception
            goto L4c
        L4b:
            r0 = move-exception
        L4c:
            xyz.adscope.common.v2.log.SDKLog.stack(r0)     // Catch: java.lang.Throwable -> L46
            goto L33
        L50:
            r13.close()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L64
            monitor-exit(r11)
            return r14
        L55:
            r13.close()     // Catch: java.lang.Throwable -> L59
            goto L5e
        L59:
            r0 = move-exception
            r13 = r0
            r12.addSuppressed(r13)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L64
        L5e:
            throw r12     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L64
        L5f:
            if (r13 == 0) goto L64
            r13.close()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L64
        L64:
            monitor-exit(r11)
            return r1
        L66:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L19
            throw r12
    }

    @Override // xyz.adscope.common.v2.persistent.db.IBaseDBOperator
    public synchronized <E extends xyz.adscope.common.v2.model.IDatabaseModel> int queryNumEntries(java.lang.Class<E> r10) {
            r9 = this;
            monitor-enter(r9)
            boolean r0 = r9.isAcceptModel(r10)     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L41
            java.util.Map<java.lang.Class<? extends xyz.adscope.common.v2.model.IDatabaseModel>, java.lang.String> r0 = r9.mTableNameMapping     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r10 = r0.get(r10)     // Catch: java.lang.Throwable -> L2d
            r1 = r10
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L2d
            android.database.sqlite.SQLiteDatabase r0 = r9.mWriteAble     // Catch: java.lang.Throwable -> L2d android.database.SQLException -> L41
            java.lang.String r10 = "id"
            java.lang.String[] r2 = new java.lang.String[]{r10}     // Catch: java.lang.Throwable -> L2d android.database.SQLException -> L41
            r7 = 0
            r8 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r10 = r0.query(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L2d android.database.SQLException -> L41
            if (r10 == 0) goto L3c
            int r0 = r10.getCount()     // Catch: java.lang.Throwable -> L30
            r10.close()     // Catch: java.lang.Throwable -> L2d android.database.SQLException -> L41
            monitor-exit(r9)
            return r0
        L2d:
            r0 = move-exception
            r10 = r0
            goto L44
        L30:
            r0 = move-exception
            r1 = r0
            r10.close()     // Catch: java.lang.Throwable -> L36
            goto L3b
        L36:
            r0 = move-exception
            r10 = r0
            r1.addSuppressed(r10)     // Catch: java.lang.Throwable -> L2d android.database.SQLException -> L41
        L3b:
            throw r1     // Catch: java.lang.Throwable -> L2d android.database.SQLException -> L41
        L3c:
            if (r10 == 0) goto L41
            r10.close()     // Catch: java.lang.Throwable -> L2d android.database.SQLException -> L41
        L41:
            monitor-exit(r9)
            r10 = 0
            return r10
        L44:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L2d
            throw r10
    }

    @Override // xyz.adscope.common.v2.persistent.db.IBaseDBOperator
    public synchronized <E extends xyz.adscope.common.v2.model.IDatabaseModel> long[] queryPrimerByDeleteCount(java.lang.Class<E> r10, int r11) {
            r9 = this;
            monitor-enter(r9)
            boolean r0 = r9.isAcceptModel(r10)     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L59
            java.util.Map<java.lang.Class<? extends xyz.adscope.common.v2.model.IDatabaseModel>, java.lang.String> r0 = r9.mTableNameMapping     // Catch: java.lang.Throwable -> L47
            java.lang.Object r10 = r0.get(r10)     // Catch: java.lang.Throwable -> L47
            r1 = r10
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L47
            android.database.sqlite.SQLiteDatabase r0 = r9.mWriteAble     // Catch: java.lang.Throwable -> L47 android.database.SQLException -> L59
            java.lang.String r10 = "id"
            java.lang.String[] r2 = new java.lang.String[]{r10}     // Catch: java.lang.Throwable -> L47 android.database.SQLException -> L59
            java.lang.String r8 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L47 android.database.SQLException -> L59
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r10 = r0.query(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L47 android.database.SQLException -> L59
            if (r10 == 0) goto L54
            int r11 = r10.getCount()     // Catch: java.lang.Throwable -> L3f
            long[] r11 = new long[r11]     // Catch: java.lang.Throwable -> L3f
            r0 = 0
            r1 = 0
        L2f:
            boolean r2 = r10.moveToNext()     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L42
            int r2 = r1 + 1
            long r3 = r10.getLong(r0)     // Catch: java.lang.Throwable -> L3f
            r11[r1] = r3     // Catch: java.lang.Throwable -> L3f
            r1 = r2
            goto L2f
        L3f:
            r0 = move-exception
            r11 = r0
            goto L4a
        L42:
            r10.close()     // Catch: java.lang.Throwable -> L47 android.database.SQLException -> L59
            monitor-exit(r9)
            return r11
        L47:
            r0 = move-exception
            r10 = r0
            goto L5c
        L4a:
            r10.close()     // Catch: java.lang.Throwable -> L4e
            goto L53
        L4e:
            r0 = move-exception
            r10 = r0
            r11.addSuppressed(r10)     // Catch: java.lang.Throwable -> L47 android.database.SQLException -> L59
        L53:
            throw r11     // Catch: java.lang.Throwable -> L47 android.database.SQLException -> L59
        L54:
            if (r10 == 0) goto L59
            r10.close()     // Catch: java.lang.Throwable -> L47 android.database.SQLException -> L59
        L59:
            monitor-exit(r9)
            r10 = 0
            return r10
        L5c:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L47
            throw r10
    }

    @Override // xyz.adscope.common.v2.persistent.db.IBaseDBOperator
    public synchronized int update(xyz.adscope.common.v2.model.IDatabaseModel r4, java.lang.String r5, java.lang.String[] r6) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.isAcceptModel(r4)     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L27
            boolean r0 = r3.isContentValuesValid(r4)     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L27
            android.database.sqlite.SQLiteDatabase r0 = r3.mWriteAble     // Catch: java.lang.Throwable -> L25
            java.util.Map<java.lang.Class<? extends xyz.adscope.common.v2.model.IDatabaseModel>, java.lang.String> r1 = r3.mTableNameMapping     // Catch: java.lang.Throwable -> L25
            java.lang.Class r2 = r4.getClass()     // Catch: java.lang.Throwable -> L25
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L25
            android.content.ContentValues r4 = r4.getContentValuesStruct()     // Catch: java.lang.Throwable -> L25
            int r4 = r0.update(r1, r4, r5, r6)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r3)
            return r4
        L25:
            r4 = move-exception
            goto L2a
        L27:
            monitor-exit(r3)
            r4 = 0
            return r4
        L2a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
            throw r4
    }

    @Override // xyz.adscope.common.v2.persistent.db.IBaseDBOperator
    public synchronized int updateByPrimaryKey(xyz.adscope.common.v2.model.IDatabaseModel r2, long r3) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L13
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L13
            java.lang.String r4 = "id"
            java.lang.String r0 = " = "
            int r2 = r1.updateSignalCondition(r2, r4, r0, r3)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)
            return r2
        L13:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r2
    }

    @Override // xyz.adscope.common.v2.persistent.db.IBaseDBOperator
    public synchronized int updateSignalCondition(xyz.adscope.common.v2.model.IDatabaseModel r3, java.lang.String r4, java.lang.String r5, java.lang.String[] r6) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isAcceptModel(r3)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L85
            boolean r0 = r2.isContentValuesValid(r3)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L85
            android.content.ContentValues r0 = r3.getContentValuesStruct()     // Catch: java.lang.Throwable -> L24
            java.util.Set r0 = r0.keySet()     // Catch: java.lang.Throwable -> L24
            boolean r0 = r0.contains(r4)     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L26
            java.lang.String r0 = "id"
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L85
            goto L26
        L24:
            r3 = move-exception
            goto L88
        L26:
            r5.getClass()     // Catch: java.lang.Throwable -> L24
            int r0 = r5.hashCode()     // Catch: java.lang.Throwable -> L24
            r1 = 32644(0x7f84, float:4.5744E-41)
            if (r0 == r1) goto L6a
            r1 = 32675(0x7fa3, float:4.5787E-41)
            if (r0 == r1) goto L5c
            r1 = 32706(0x7fc2, float:4.5831E-41)
            if (r0 == r1) goto L4e
            r1 = 1025915(0xfa77b, float:1.437613E-39)
            if (r0 == r1) goto L3f
            goto L72
        L3f:
            java.lang.String r0 = " IN "
            boolean r5 = r5.equals(r0)     // Catch: java.lang.Throwable -> L24
            if (r5 != 0) goto L48
            goto L72
        L48:
            int r5 = r6.length     // Catch: java.lang.Throwable -> L24
            java.lang.String r4 = r2.whereIn(r4, r5)     // Catch: java.lang.Throwable -> L24
            goto L79
        L4e:
            java.lang.String r0 = " > "
            boolean r5 = r5.equals(r0)     // Catch: java.lang.Throwable -> L24
            if (r5 != 0) goto L57
            goto L72
        L57:
            java.lang.String r4 = r2.whereGreaterThen(r4)     // Catch: java.lang.Throwable -> L24
            goto L79
        L5c:
            java.lang.String r0 = " = "
            boolean r5 = r5.equals(r0)     // Catch: java.lang.Throwable -> L24
            if (r5 != 0) goto L65
            goto L72
        L65:
            java.lang.String r4 = r2.whereEquals(r4)     // Catch: java.lang.Throwable -> L24
            goto L79
        L6a:
            java.lang.String r0 = " < "
            boolean r5 = r5.equals(r0)     // Catch: java.lang.Throwable -> L24
            if (r5 != 0) goto L75
        L72:
            java.lang.String r4 = ""
            goto L79
        L75:
            java.lang.String r4 = r2.whereLessThan(r4)     // Catch: java.lang.Throwable -> L24
        L79:
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L24
            if (r5 != 0) goto L85
            int r3 = r2.update(r3, r4, r6)     // Catch: java.lang.Throwable -> L24
            monitor-exit(r2)
            return r3
        L85:
            monitor-exit(r2)
            r3 = 0
            return r3
        L88:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L24
            throw r3
    }

    protected void upgrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            r0 = this;
            return
    }

    public java.lang.String whereBetweenAnd(java.lang.String r3) {
            r2 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.String r3 = "%s BETWEEN ? AND ? "
            java.lang.String r3 = java.lang.String.format(r3, r0)
            return r3
    }

    @Override // xyz.adscope.common.v2.persistent.db.IBaseDBOperator
    public java.lang.String whereBuild(java.lang.String[] r7, java.lang.String[] r8) {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r7 == 0) goto L31
            if (r8 == 0) goto L31
            int r1 = r7.length
            int r2 = r8.length
            if (r1 != r2) goto L31
            r1 = 0
            r2 = 0
        Lf:
            int r3 = r7.length
            if (r2 >= r3) goto L31
            if (r2 <= 0) goto L19
            java.lang.String r3 = " and "
            r0.append(r3)
        L19:
            r3 = r7[r2]
            r4 = r8[r2]
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r1] = r3
            r3 = 1
            r5[r3] = r4
            java.lang.String r3 = " %s %s ? "
            java.lang.String r3 = java.lang.String.format(r3, r5)
            r0.append(r3)
            int r2 = r2 + 1
            goto Lf
        L31:
            java.lang.String r7 = r0.toString()
            return r7
    }

    public java.lang.String whereEquals(java.lang.String r3) {
            r2 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.String r3 = " = "
            r1 = 1
            r0[r1] = r3
            java.lang.String r3 = " %s %s ? "
            java.lang.String r3 = java.lang.String.format(r3, r0)
            return r3
    }

    public java.lang.String whereGreaterThen(java.lang.String r3) {
            r2 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.String r3 = " > "
            r1 = 1
            r0[r1] = r3
            java.lang.String r3 = " %s %s ? "
            java.lang.String r3 = java.lang.String.format(r3, r0)
            return r3
    }

    public java.lang.String whereIn(java.lang.String r3, int r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = " IN "
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            java.lang.String r3 = "("
            r0.append(r3)
            r3 = 0
        L1c:
            if (r3 >= r4) goto L2f
            java.lang.String r1 = "?"
            r0.append(r1)
            int r1 = r4 + (-1)
            if (r3 >= r1) goto L2c
            java.lang.String r1 = ","
            r0.append(r1)
        L2c:
            int r3 = r3 + 1
            goto L1c
        L2f:
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    public java.lang.String whereLessThan(java.lang.String r3) {
            r2 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.String r3 = " < "
            r1 = 1
            r0[r1] = r3
            java.lang.String r3 = " %s %s ? "
            java.lang.String r3 = java.lang.String.format(r3, r0)
            return r3
    }
}
