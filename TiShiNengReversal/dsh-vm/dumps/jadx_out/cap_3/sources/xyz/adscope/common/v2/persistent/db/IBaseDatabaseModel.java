package xyz.adscope.common.v2.persistent.db;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class IBaseDatabaseModel implements xyz.adscope.common.v2.model.IDatabaseModel {
    private java.lang.String[] columns;
    protected long primaryID;

    public IBaseDatabaseModel() {
            r0 = this;
            r0.<init>()
            return
    }

    private java.lang.String[] getAllColumns() {
            r8 = this;
            java.lang.Class r0 = r8.getClass()
            java.lang.reflect.Field[] r0 = r0.getDeclaredFields()
            int r1 = r0.length
            if (r1 <= 0) goto L44
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.length
            r3 = 0
            r4 = 0
        L13:
            if (r4 >= r2) goto L35
            r5 = r0[r4]
            java.lang.Class<xyz.adscope.common.v2.model.annotation.DataBaseNode> r6 = xyz.adscope.common.v2.model.annotation.DataBaseNode.class
            boolean r7 = r5.isAnnotationPresent(r6)
            if (r7 == 0) goto L32
            r7 = 1
            r5.setAccessible(r7)
            java.lang.annotation.Annotation r5 = r5.getAnnotation(r6)
            xyz.adscope.common.v2.model.annotation.DataBaseNode r5 = (xyz.adscope.common.v2.model.annotation.DataBaseNode) r5
            if (r5 == 0) goto L32
            java.lang.String r5 = r5.column()
            r1.add(r5)
        L32:
            int r4 = r4 + 1
            goto L13
        L35:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L44
            java.lang.String[] r0 = new java.lang.String[r3]
            java.lang.Object[] r0 = r1.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
        L44:
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.common.v2.model.IDatabaseModel
    public java.lang.String[] getColumns() {
            r1 = this;
            java.lang.String[] r0 = r1.columns
            if (r0 == 0) goto L7
            int r0 = r0.length
            if (r0 != 0) goto Ld
        L7:
            java.lang.String[] r0 = r1.getAllColumns()
            r1.columns = r0
        Ld:
            java.lang.String[] r0 = r1.columns
            return r0
    }

    @Override // xyz.adscope.common.v2.model.IDatabaseModel
    public android.content.ContentValues getContentValuesStruct() {
            r4 = this;
            java.util.Map r0 = r4.getMapStruct()
            if (r0 == 0) goto L38
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L38
            android.content.ContentValues r1 = new android.content.ContentValues
            r1.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L19
            r1.put(r3, r2)
            goto L19
        L37:
            return r1
        L38:
            r0 = 0
            return r0
    }

    @Override // xyz.adscope.common.v2.model.IDatabaseModel
    public java.util.Map<java.lang.String, java.lang.String> getMapStruct() {
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Class r1 = r5.getClass()
            java.util.List r1 = xyz.adscope.common.v2.tool.reflect.ReflectUtil.getAllFields(r1)
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L52
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L52
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            java.lang.Class<xyz.adscope.common.v2.model.annotation.DataBaseNode> r3 = xyz.adscope.common.v2.model.annotation.DataBaseNode.class
            boolean r4 = r2.isAnnotationPresent(r3)
            if (r4 == 0) goto L17
            r4 = 1
            r2.setAccessible(r4)
            java.lang.annotation.Annotation r3 = r2.getAnnotation(r3)
            xyz.adscope.common.v2.model.annotation.DataBaseNode r3 = (xyz.adscope.common.v2.model.annotation.DataBaseNode) r3
            if (r3 == 0) goto L17
            java.lang.String r3 = r3.column()
            java.lang.Object r2 = r2.get(r5)     // Catch: java.lang.IllegalAccessException -> L4d
            if (r2 == 0) goto L17
            java.lang.String r2 = r2.toString()     // Catch: java.lang.IllegalAccessException -> L4d
            java.lang.String r2 = xyz.adscope.common.v2.encrypt.impl.Base64Util.encodeToString(r2)     // Catch: java.lang.IllegalAccessException -> L4d
            r0.put(r3, r2)     // Catch: java.lang.IllegalAccessException -> L4d
            goto L17
        L4d:
            r2 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r2)
            goto L17
        L52:
            return r0
    }

    @Override // xyz.adscope.common.v2.model.IDatabaseModel
    public long getPrimaryID() {
            r2 = this;
            long r0 = r2.primaryID
            return r0
    }

    @Override // xyz.adscope.common.v2.model.IDatabaseModel
    public void parseFromDb(android.database.Cursor r8) {
            r7 = this;
            if (r8 == 0) goto L51
            java.lang.String r0 = "id"
            int r0 = r8.getColumnIndex(r0)
            r1 = -1
            if (r0 == r1) goto L12
            long r2 = r8.getLong(r0)
            r7.setPrimaryID(r2)
        L12:
            java.lang.Class r0 = r7.getClass()
            java.lang.reflect.Field[] r0 = r0.getDeclaredFields()
            int r2 = r0.length
            r3 = 0
        L1c:
            if (r3 >= r2) goto L51
            r4 = r0[r3]
            java.lang.Class<xyz.adscope.common.v2.model.annotation.DataBaseNode> r5 = xyz.adscope.common.v2.model.annotation.DataBaseNode.class
            boolean r6 = r4.isAnnotationPresent(r5)
            if (r6 == 0) goto L4e
            r6 = 1
            r4.setAccessible(r6)
            java.lang.annotation.Annotation r5 = r4.getAnnotation(r5)
            xyz.adscope.common.v2.model.annotation.DataBaseNode r5 = (xyz.adscope.common.v2.model.annotation.DataBaseNode) r5
            if (r5 == 0) goto L4e
            java.lang.String r5 = r5.column()
            int r5 = r8.getColumnIndex(r5)
            if (r5 == r1) goto L4e
            java.lang.String r5 = r8.getString(r5)     // Catch: java.lang.IllegalAccessException -> L4a
            java.lang.String r5 = xyz.adscope.common.v2.encrypt.impl.Base64Util.decodeToString(r5)     // Catch: java.lang.IllegalAccessException -> L4a
            r4.set(r7, r5)     // Catch: java.lang.IllegalAccessException -> L4a
            goto L4e
        L4a:
            r4 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r4)
        L4e:
            int r3 = r3 + 1
            goto L1c
        L51:
            return
    }

    @Override // xyz.adscope.common.v2.model.IDatabaseModel
    public void setPrimaryID(long r1) {
            r0 = this;
            r0.primaryID = r1
            return
    }
}
