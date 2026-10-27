package xyz.adscope.common.db;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class CommonDataBase {
    public CommonDataBase() {
            r0 = this;
            r0.<init>()
            return
    }

    private java.util.Map<java.lang.String, java.lang.String> a(java.lang.Class<?> r6) {
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.reflect.Field[] r6 = r6.getDeclaredFields()
            int r1 = r6.length
            r2 = 0
        Lb:
            if (r2 >= r1) goto L1b
            r3 = r6[r2]
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = "nvarchar"
            r0.put(r3, r4)
            int r2 = r2 + 1
            goto Lb
        L1b:
            return r0
    }

    private java.util.Map<java.lang.String, java.lang.Object> a(java.lang.Object r8) {
            r7 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Class r1 = r8.getClass()
            java.lang.reflect.Field[] r1 = r1.getDeclaredFields()
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L27
            r4 = r1[r3]
            java.lang.String r5 = r4.getName()
            r6 = 1
            r4.setAccessible(r6)     // Catch: java.lang.IllegalAccessException -> L24
            java.lang.Object r4 = r4.get(r8)     // Catch: java.lang.IllegalAccessException -> L24
            if (r4 == 0) goto L24
            r0.put(r5, r4)     // Catch: java.lang.IllegalAccessException -> L24
        L24:
            int r3 = r3 + 1
            goto Lf
        L27:
            return r0
    }

    private void a(java.util.Map<java.lang.String, java.lang.Object> r5, java.lang.StringBuilder r6, java.lang.String[] r7, java.lang.String r8) {
            r4 = this;
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
        L9:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L5c
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            if (r1 == 0) goto L36
            boolean r3 = r1 instanceof java.lang.String
            if (r3 == 0) goto L30
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r1 = xyz.adscope.common.tool.security.Base64Util.encode(r1)
            r7[r0] = r1
            goto L36
        L30:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r7[r0] = r1
        L36:
            if (r0 <= 0) goto L3d
            java.lang.String r1 = " and "
            r6.append(r1)
        L3d:
            r6.append(r2)
            r6.append(r8)
            int r0 = r0 + 1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "for循环执行了这个逻辑 + flag "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "common_log"
            xyz.adscope.common.tool.LogUtil.i(r2, r1)
            goto L9
        L5c:
            return
    }

    public synchronized <T> void createTable(android.database.sqlite.SQLiteDatabase r7, java.lang.String r8, java.lang.Class<T> r9, java.util.List<java.lang.String> r10) {
            r6 = this;
            monitor-enter(r6)
            if (r7 != 0) goto L14
            if (r7 == 0) goto L12
            boolean r8 = r7.inTransaction()     // Catch: java.lang.Throwable -> Lf
            if (r8 == 0) goto L12
            r7.endTransaction()     // Catch: java.lang.Throwable -> Lf
            goto L12
        Lf:
            r7 = move-exception
            goto L136
        L12:
            monitor-exit(r6)
            return
        L14:
            r7.beginTransaction()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            java.util.Map r9 = r6.a(r9)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            r1.<init>()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            java.lang.String r2 = "create table "
            r1.append(r2)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            r1.append(r8)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            java.lang.String r8 = "("
            r1.append(r8)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            java.lang.String r8 = "id"
            r1.append(r8)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            java.lang.String r8 = " integer primary key autoincrement,"
            r1.append(r8)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            java.util.Set r8 = r9.entrySet()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            r1 = 0
        L49:
            boolean r2 = r8.hasNext()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            if (r2 == 0) goto Lc5
            java.lang.Object r2 = r8.next()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            int r1 = r1 + 1
            if (r10 == 0) goto L72
            boolean r4 = r10.contains(r3)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            if (r4 != 0) goto L49
            goto L72
        L6c:
            r8 = move-exception
            goto L12c
        L6f:
            r8 = move-exception
            goto L10b
        L72:
            java.lang.String r4 = "id"
            boolean r4 = r3.equals(r4)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            if (r4 == 0) goto L7b
            goto L49
        L7b:
            int r4 = r9.size()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            if (r1 != r4) goto La3
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            r8.<init>()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            java.lang.String r9 = " "
            r8.append(r9)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            r8.append(r3)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            java.lang.String r9 = " "
            r8.append(r9)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            r8.append(r2)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            java.lang.String r9 = ")"
            r8.append(r9)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            r0.append(r8)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            goto Lc5
        La3:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            r4.<init>()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            java.lang.String r5 = " "
            r4.append(r5)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            r4.append(r3)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            java.lang.String r3 = " "
            r4.append(r3)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            r4.append(r2)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            java.lang.String r2 = ","
            r4.append(r2)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            r0.append(r2)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            goto L49
        Lc5:
            java.lang.String r8 = r0.toString()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            java.lang.String r9 = ","
            boolean r8 = r8.endsWith(r9)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            if (r8 == 0) goto Le0
            int r8 = r0.length()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            int r8 = r8 + (-1)
            int r9 = r0.length()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            java.lang.String r10 = ")"
            r0.replace(r8, r9, r10)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
        Le0:
            java.lang.String r8 = "common_log"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            r9.<init>()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            java.lang.String r10 = "stringBuilder : "
            r9.append(r10)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            java.lang.String r10 = r0.toString()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            r9.append(r10)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            xyz.adscope.common.tool.LogUtil.i(r8, r9)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            java.lang.String r8 = r0.toString()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            r7.execSQL(r8)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            r7.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            boolean r8 = r7.inTransaction()     // Catch: java.lang.Throwable -> Lf
            if (r8 == 0) goto L12a
            goto L127
        L10b:
            java.lang.String r9 = "common_log"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r10.<init>()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = "e : "
            r10.append(r0)     // Catch: java.lang.Throwable -> L6c
            r10.append(r8)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r8 = r10.toString()     // Catch: java.lang.Throwable -> L6c
            xyz.adscope.common.tool.LogUtil.e(r9, r8)     // Catch: java.lang.Throwable -> L6c
            boolean r8 = r7.inTransaction()     // Catch: java.lang.Throwable -> Lf
            if (r8 == 0) goto L12a
        L127:
            r7.endTransaction()     // Catch: java.lang.Throwable -> Lf
        L12a:
            monitor-exit(r6)
            return
        L12c:
            boolean r9 = r7.inTransaction()     // Catch: java.lang.Throwable -> Lf
            if (r9 == 0) goto L135
            r7.endTransaction()     // Catch: java.lang.Throwable -> Lf
        L135:
            throw r8     // Catch: java.lang.Throwable -> Lf
        L136:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lf
            throw r7
    }

    public <T> java.util.List<T> cursorToList(android.database.Cursor r10, java.lang.Class<T> r11) {
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String[] r1 = r10.getColumnNames()
        L9:
            boolean r2 = r10.moveToNext()
            if (r2 == 0) goto Lf5
            java.lang.Object r2 = r11.newInstance()     // Catch: java.lang.Exception -> L88
            int r3 = r1.length     // Catch: java.lang.Exception -> L88
            r4 = 0
        L15:
            if (r4 >= r3) goto Ld8
            r5 = r1[r4]     // Catch: java.lang.Exception -> L88
            int r6 = r10.getColumnIndex(r5)     // Catch: java.lang.Exception -> L88
            java.lang.String r7 = "id"
            boolean r7 = r7.equals(r5)     // Catch: java.lang.Exception -> L88
            if (r7 == 0) goto L27
            goto Ld4
        L27:
            java.lang.reflect.Field r5 = r11.getDeclaredField(r5)     // Catch: java.lang.Exception -> L88
            r7 = 1
            r5.setAccessible(r7)     // Catch: java.lang.Exception -> L88
            java.lang.Class r7 = r5.getType()     // Catch: java.lang.Exception -> L88
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L88
            if (r7 == r8) goto Lc9
            java.lang.Class r7 = r5.getType()     // Catch: java.lang.Exception -> L88
            java.lang.Class<java.lang.Integer> r8 = java.lang.Integer.class
            if (r7 != r8) goto L41
            goto Lc9
        L41:
            java.lang.Class r7 = r5.getType()     // Catch: java.lang.Exception -> L88
            java.lang.Class r8 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L88
            if (r7 == r8) goto Lbd
            java.lang.Class r7 = r5.getType()     // Catch: java.lang.Exception -> L88
            java.lang.Class<java.lang.Long> r8 = java.lang.Long.class
            if (r7 != r8) goto L52
            goto Lbd
        L52:
            java.lang.Class r7 = r5.getType()     // Catch: java.lang.Exception -> L88
            java.lang.Class r8 = java.lang.Float.TYPE     // Catch: java.lang.Exception -> L88
            if (r7 == r8) goto Lb1
            java.lang.Class r7 = r5.getType()     // Catch: java.lang.Exception -> L88
            java.lang.Class<java.lang.Float> r8 = java.lang.Float.class
            if (r7 != r8) goto L63
            goto Lb1
        L63:
            java.lang.Class r7 = r5.getType()     // Catch: java.lang.Exception -> L88
            java.lang.Class r8 = java.lang.Double.TYPE     // Catch: java.lang.Exception -> L88
            if (r7 == r8) goto La5
            java.lang.Class r7 = r5.getType()     // Catch: java.lang.Exception -> L88
            java.lang.Class<java.lang.Double> r8 = java.lang.Double.class
            if (r7 != r8) goto L74
            goto La5
        L74:
            java.lang.Class r7 = r5.getType()     // Catch: java.lang.Exception -> L88
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            if (r7 != r8) goto L8a
            java.lang.String r6 = r10.getString(r6)     // Catch: java.lang.Exception -> L88
            java.lang.String r6 = xyz.adscope.common.tool.security.Base64Util.decode(r6)     // Catch: java.lang.Exception -> L88
            r5.set(r2, r6)     // Catch: java.lang.Exception -> L88
            goto Ld4
        L88:
            r2 = move-exception
            goto Ldd
        L8a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Exception -> L88
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L88
            r3.<init>()     // Catch: java.lang.Exception -> L88
            java.lang.String r4 = "Unsupported field type: "
            r3.append(r4)     // Catch: java.lang.Exception -> L88
            java.lang.Class r4 = r5.getType()     // Catch: java.lang.Exception -> L88
            r3.append(r4)     // Catch: java.lang.Exception -> L88
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L88
            r2.<init>(r3)     // Catch: java.lang.Exception -> L88
            throw r2     // Catch: java.lang.Exception -> L88
        La5:
            double r6 = r10.getDouble(r6)     // Catch: java.lang.Exception -> L88
            java.lang.Double r6 = java.lang.Double.valueOf(r6)     // Catch: java.lang.Exception -> L88
            r5.set(r2, r6)     // Catch: java.lang.Exception -> L88
            goto Ld4
        Lb1:
            float r6 = r10.getFloat(r6)     // Catch: java.lang.Exception -> L88
            java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch: java.lang.Exception -> L88
            r5.set(r2, r6)     // Catch: java.lang.Exception -> L88
            goto Ld4
        Lbd:
            long r6 = r10.getLong(r6)     // Catch: java.lang.Exception -> L88
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Exception -> L88
            r5.set(r2, r6)     // Catch: java.lang.Exception -> L88
            goto Ld4
        Lc9:
            int r6 = r10.getInt(r6)     // Catch: java.lang.Exception -> L88
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L88
            r5.set(r2, r6)     // Catch: java.lang.Exception -> L88
        Ld4:
            int r4 = r4 + 1
            goto L15
        Ld8:
            r0.add(r2)     // Catch: java.lang.Exception -> L88
            goto L9
        Ldd:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "e : "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "common_log"
            xyz.adscope.common.tool.LogUtil.e(r3, r2)
            goto L9
        Lf5:
            return r0
    }

    public synchronized int deleteTable(android.database.sqlite.SQLiteDatabase r4, java.lang.String r5, java.lang.String r6, java.lang.Object r7) {
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            if (r4 != 0) goto L6
            monitor-exit(r3)
            return r0
        L6:
            boolean r1 = r7 instanceof java.util.Map     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> Lf
            if (r1 == 0) goto L11
            java.util.Map r7 = (java.util.Map) r7     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> Lf
            goto L15
        Ld:
            r4 = move-exception
            goto L5b
        Lf:
            r4 = move-exception
            goto L43
        L11:
            java.util.Map r7 = r3.a(r7)     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> Lf
        L15:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> Lf
            int r2 = r7.size()     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> Lf
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> Lf
            r3.a(r7, r1, r2, r6)     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> Lf
            java.lang.String r6 = r1.toString()     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> Lf
            int r4 = r4.delete(r5, r6, r2)     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> Lf
            java.lang.String r5 = "common_log"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> Lf
            r6.<init>()     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> Lf
            java.lang.String r7 = "deleteResult : "
            r6.append(r7)     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> Lf
            r6.append(r4)     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> Lf
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> Lf
            xyz.adscope.common.tool.LogUtil.i(r5, r6)     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> Lf
            monitor-exit(r3)
            return r4
        L43:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld
            r5.<init>()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r6 = "e : "
            r5.append(r6)     // Catch: java.lang.Throwable -> Ld
            r5.append(r4)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r5 = "common_log"
            xyz.adscope.common.tool.LogUtil.e(r5, r4)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r3)
            return r0
        L5b:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Ld
            throw r4
    }

    public synchronized long insertTable(android.database.sqlite.SQLiteDatabase r8, java.lang.String r9, java.lang.Object r10) {
            r7 = this;
            monitor-enter(r7)
            r0 = 0
            if (r8 != 0) goto L7
            monitor-exit(r7)
            return r0
        L7:
            boolean r2 = r10 instanceof java.util.Map     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            if (r2 == 0) goto L14
            java.util.Map r10 = (java.util.Map) r10     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            goto L18
        Le:
            r8 = move-exception
            goto Lff
        L11:
            r8 = move-exception
            goto Le7
        L14:
            java.util.Map r10 = r7.a(r10)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
        L18:
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            r2.<init>()     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            java.util.Set r10 = r10.entrySet()     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
        L25:
            boolean r3 = r10.hasNext()     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            if (r3 == 0) goto Lb4
            java.lang.Object r3 = r10.next()     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            if (r3 == 0) goto L25
            boolean r5 = r3 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            if (r5 == 0) goto L51
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            r2.put(r4, r3)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            goto L25
        L51:
            boolean r5 = r3 instanceof java.lang.Long     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            if (r5 == 0) goto L65
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            long r5 = java.lang.Long.parseLong(r3)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            r2.put(r4, r3)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            goto L25
        L65:
            boolean r5 = r3 instanceof java.lang.Float     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            if (r5 == 0) goto L79
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            float r3 = java.lang.Float.parseFloat(r3)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            r2.put(r4, r3)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            goto L25
        L79:
            boolean r5 = r3 instanceof java.lang.Double     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            if (r5 == 0) goto L8d
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            double r5 = java.lang.Double.parseDouble(r3)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            java.lang.Double r3 = java.lang.Double.valueOf(r5)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            r2.put(r4, r3)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            goto L25
        L8d:
            boolean r5 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            if (r5 == 0) goto L9d
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            java.lang.String r3 = xyz.adscope.common.tool.security.Base64Util.encode(r3)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            r2.put(r4, r3)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            goto L25
        L9d:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            r9.<init>()     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            java.lang.String r10 = "Unsupported value type: "
            r9.append(r10)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            r9.append(r3)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            throw r8     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
        Lb4:
            java.lang.String r10 = "common_log"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            r3.<init>()     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            java.lang.String r4 = "contentValues : "
            r3.append(r4)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            r3.append(r2)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            xyz.adscope.common.tool.LogUtil.i(r10, r3)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            r10 = 0
            long r8 = r8.insert(r9, r10, r2)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            java.lang.String r10 = "common_log"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            r2.<init>()     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            java.lang.String r3 = "insertResult : "
            r2.append(r3)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            r2.append(r8)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            xyz.adscope.common.tool.LogUtil.i(r10, r2)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L11
            monitor-exit(r7)
            return r8
        Le7:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le
            r9.<init>()     // Catch: java.lang.Throwable -> Le
            java.lang.String r10 = "e : "
            r9.append(r10)     // Catch: java.lang.Throwable -> Le
            r9.append(r8)     // Catch: java.lang.Throwable -> Le
            java.lang.String r8 = r9.toString()     // Catch: java.lang.Throwable -> Le
            java.lang.String r9 = "common_log"
            xyz.adscope.common.tool.LogUtil.e(r9, r8)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r7)
            return r0
        Lff:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Le
            throw r8
    }

    public boolean isTableExists(android.database.sqlite.SQLiteDatabase r11, java.lang.String r12) {
            r10 = this;
            r0 = 0
            if (r12 == 0) goto L34
            if (r11 == 0) goto L34
            boolean r1 = r11.isOpen()     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto Lc
            goto L34
        Lc:
            java.lang.String r1 = "table"
            java.lang.String[] r6 = new java.lang.String[]{r1, r12}     // Catch: java.lang.Throwable -> L34
            java.lang.String r3 = "sqlite_master"
            java.lang.String r12 = "name"
            java.lang.String[] r4 = new java.lang.String[]{r12}     // Catch: java.lang.Throwable -> L34
            java.lang.String r5 = "type = ? AND name = ?"
            r8 = 0
            r9 = 0
            r7 = 0
            r2 = r11
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L34
            if (r11 != 0) goto L27
            return r0
        L27:
            int r12 = r11.getCount()     // Catch: java.lang.Throwable -> L34
            if (r12 <= 0) goto L2f
            r12 = 1
            goto L30
        L2f:
            r12 = 0
        L30:
            r11.close()     // Catch: java.lang.Throwable -> L34
            return r12
        L34:
            return r0
    }

    public synchronized java.lang.String querySingleData(android.database.sqlite.SQLiteDatabase r14, java.lang.String r15, java.lang.Object r16, java.lang.String[] r17, java.lang.String r18, java.lang.String r19, java.lang.String r20) {
            r13 = this;
            r0 = r16
            monitor-enter(r13)
            r1 = 0
            if (r14 != 0) goto L8
            monitor-exit(r13)
            return r1
        L8:
            boolean r2 = r0 instanceof java.util.Map     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            if (r2 == 0) goto L17
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            goto L1b
        Lf:
            r0 = move-exception
            r14 = r0
            goto Lb8
        L13:
            r0 = move-exception
            r14 = r0
            goto La0
        L17:
            java.util.Map r0 = r13.a(r0)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            r2.<init>()     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            int r3 = r0.size()     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            java.lang.String[] r8 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            r3 = r18
            r13.a(r0, r2, r8, r3)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            java.lang.String r0 = "common_log"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            r3.<init>()     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            java.lang.String r4 = "selectionStr : "
            r3.append(r4)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            r3.append(r2)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            java.lang.String r4 = " , selectionArgs : "
            r3.append(r4)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            r3.append(r8)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            xyz.adscope.common.tool.LogUtil.i(r0, r3)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            r9 = 0
            r10 = 0
            r4 = r14
            r5 = r15
            r6 = r17
            r11 = r19
            r12 = r20
            android.database.Cursor r14 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            java.lang.String r15 = "common_log"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            r0.<init>()     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            java.lang.String r2 = "queryCursor : "
            r0.append(r2)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            r0.append(r14)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            xyz.adscope.common.tool.LogUtil.i(r15, r0)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            java.lang.String r15 = ""
            boolean r0 = r14.moveToFirst()     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            if (r0 == 0) goto L88
            r15 = 0
            r15 = r17[r15]     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            int r15 = r14.getColumnIndex(r15)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            java.lang.String r14 = r14.getString(r15)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            java.lang.String r15 = xyz.adscope.common.tool.security.Base64Util.decode(r14)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
        L88:
            java.lang.String r14 = "common_log"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            r0.<init>()     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            java.lang.String r2 = "result : "
            r0.append(r2)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            r0.append(r15)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            xyz.adscope.common.tool.LogUtil.i(r14, r0)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            monitor-exit(r13)
            return r15
        La0:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf
            r15.<init>()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r0 = "e : "
            r15.append(r0)     // Catch: java.lang.Throwable -> Lf
            r15.append(r14)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r14 = r15.toString()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r15 = "common_log"
            xyz.adscope.common.tool.LogUtil.e(r15, r14)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r13)
            return r1
        Lb8:
            monitor-exit(r13)     // Catch: java.lang.Throwable -> Lf
            throw r14
    }

    public synchronized <T> java.util.List<T> querySingleTable(android.database.sqlite.SQLiteDatabase r14, java.lang.String r15, java.lang.Class<T> r16, java.lang.Object r17, java.lang.String r18, java.lang.String r19, java.lang.String r20) {
            r13 = this;
            r0 = r17
            monitor-enter(r13)
            r1 = 0
            if (r14 != 0) goto L8
            monitor-exit(r13)
            return r1
        L8:
            boolean r2 = r0 instanceof java.util.Map     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            if (r2 == 0) goto L17
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            goto L1b
        Lf:
            r0 = move-exception
            r14 = r0
            goto La6
        L13:
            r0 = move-exception
            r14 = r0
            goto L8e
        L17:
            java.util.Map r0 = r13.a(r0)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            r2.<init>()     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            int r3 = r0.size()     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            java.lang.String[] r8 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            r3 = r18
            r13.a(r0, r2, r8, r3)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            java.lang.String r0 = "common_log"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            r3.<init>()     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            java.lang.String r4 = "selectionStr : "
            r3.append(r4)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            r3.append(r2)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            java.lang.String r4 = " , selectionArgs : "
            r3.append(r4)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            r3.append(r8)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            xyz.adscope.common.tool.LogUtil.i(r0, r3)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            r9 = 0
            r10 = 0
            r6 = 0
            r4 = r14
            r5 = r15
            r11 = r19
            r12 = r20
            android.database.Cursor r14 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            java.lang.String r15 = "common_log"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            r0.<init>()     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            java.lang.String r2 = "queryCursor : "
            r0.append(r2)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            r0.append(r14)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            xyz.adscope.common.tool.LogUtil.i(r15, r0)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            r15 = r16
            java.util.List r14 = r13.cursorToList(r14, r15)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            java.lang.String r15 = "common_log"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            r0.<init>()     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            java.lang.String r2 = "mapResult : "
            r0.append(r2)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            r0.append(r14)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            xyz.adscope.common.tool.LogUtil.i(r15, r0)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L13
            monitor-exit(r13)
            return r14
        L8e:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf
            r15.<init>()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r0 = "e : "
            r15.append(r0)     // Catch: java.lang.Throwable -> Lf
            r15.append(r14)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r14 = r15.toString()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r15 = "common_log"
            xyz.adscope.common.tool.LogUtil.e(r15, r14)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r13)
            return r1
        La6:
            monitor-exit(r13)     // Catch: java.lang.Throwable -> Lf
            throw r14
    }

    public synchronized <T> java.util.List<T> queryTable(android.database.sqlite.SQLiteDatabase r13, java.lang.String r14, java.lang.Class<T> r15, java.lang.Object r16, java.lang.String r17) {
            r12 = this;
            r0 = r16
            monitor-enter(r12)
            r1 = 0
            if (r13 != 0) goto L8
            monitor-exit(r12)
            return r1
        L8:
            if (r0 == 0) goto L5a
            boolean r2 = r0 instanceof java.util.Map     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L15
            if (r2 == 0) goto L19
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L15
            goto L1d
        L11:
            r0 = move-exception
            r13 = r0
            goto Lb0
        L15:
            r0 = move-exception
            r13 = r0
            goto L98
        L19:
            java.util.Map r0 = r12.a(r0)     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L15
        L1d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L15
            r2.<init>()     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L15
            int r3 = r0.size()     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L15
            java.lang.String[] r8 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L15
            r3 = r17
            r12.a(r0, r2, r8, r3)     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L15
            java.lang.String r0 = "common_log"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L15
            r3.<init>()     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L15
            java.lang.String r4 = "selectionStr : "
            r3.append(r4)     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L15
            r3.append(r2)     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L15
            java.lang.String r4 = " , selectionArgs : "
            r3.append(r4)     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L15
            r3.append(r8)     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L15
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L15
            xyz.adscope.common.tool.LogUtil.i(r0, r3)     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L15
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L15
            r10 = 0
            r11 = 0
            r6 = 0
            r9 = 0
            r4 = r13
            r5 = r14
            android.database.Cursor r13 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L15
            goto L66
        L5a:
            r8 = 0
            r9 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r13
            r3 = r14
            android.database.Cursor r13 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L15
        L66:
            java.lang.String r14 = "common_log"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L15
            r0.<init>()     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L15
            java.lang.String r2 = "queryCursor : "
            r0.append(r2)     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L15
            r0.append(r13)     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L15
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L15
            xyz.adscope.common.tool.LogUtil.i(r14, r0)     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L15
            java.util.List r13 = r12.cursorToList(r13, r15)     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L15
            java.lang.String r14 = "common_log"
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L15
            r15.<init>()     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L15
            java.lang.String r0 = "mapResult : "
            r15.append(r0)     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L15
            r15.append(r13)     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L15
            java.lang.String r15 = r15.toString()     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L15
            xyz.adscope.common.tool.LogUtil.i(r14, r15)     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L15
            monitor-exit(r12)
            return r13
        L98:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11
            r14.<init>()     // Catch: java.lang.Throwable -> L11
            java.lang.String r15 = "e : "
            r14.append(r15)     // Catch: java.lang.Throwable -> L11
            r14.append(r13)     // Catch: java.lang.Throwable -> L11
            java.lang.String r13 = r14.toString()     // Catch: java.lang.Throwable -> L11
            java.lang.String r14 = "common_log"
            xyz.adscope.common.tool.LogUtil.e(r14, r13)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r12)
            return r1
        Lb0:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L11
            throw r13
    }

    public synchronized <T> java.util.List<T> queryTable(android.database.sqlite.SQLiteDatabase r12, java.lang.String r13, java.lang.Class<T> r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18) {
            r11 = this;
            monitor-enter(r11)
            r1 = 0
            if (r12 != 0) goto L6
            monitor-exit(r11)
            return r1
        L6:
            r5 = 0
            r6 = 0
            r4 = 0
            r2 = r12
            r3 = r13
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            android.database.Cursor r12 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b
            java.lang.String r13 = "common_log"
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b
            r15.<init>()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b
            java.lang.String r0 = "queryCursor : "
            r15.append(r0)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b
            r15.append(r12)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b
            java.lang.String r15 = r15.toString()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b
            xyz.adscope.common.tool.LogUtil.i(r13, r15)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b
            java.util.List r12 = r11.cursorToList(r12, r14)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b
            java.lang.String r13 = "common_log"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b
            r14.<init>()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b
            java.lang.String r15 = "mapResult : "
            r14.append(r15)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b
            r14.append(r12)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b
            java.lang.String r14 = r14.toString()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b
            xyz.adscope.common.tool.LogUtil.i(r13, r14)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4b
            monitor-exit(r11)
            return r12
        L48:
            r0 = move-exception
            r12 = r0
            goto L65
        L4b:
            r0 = move-exception
            r12 = r0
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48
            r13.<init>()     // Catch: java.lang.Throwable -> L48
            java.lang.String r14 = "e : "
            r13.append(r14)     // Catch: java.lang.Throwable -> L48
            r13.append(r12)     // Catch: java.lang.Throwable -> L48
            java.lang.String r12 = r13.toString()     // Catch: java.lang.Throwable -> L48
            java.lang.String r13 = "common_log"
            xyz.adscope.common.tool.LogUtil.e(r13, r12)     // Catch: java.lang.Throwable -> L48
            monitor-exit(r11)
            return r1
        L65:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L48
            throw r12
    }

    public synchronized int updateTable(android.database.sqlite.SQLiteDatabase r4, java.lang.String r5, android.content.ContentValues r6, java.lang.String r7, java.lang.Object r8) {
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            if (r4 != 0) goto L6
            monitor-exit(r3)
            return r0
        L6:
            boolean r1 = r8 instanceof java.util.Map     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> Lf
            if (r1 == 0) goto L11
            java.util.Map r8 = (java.util.Map) r8     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> Lf
            goto L15
        Ld:
            r4 = move-exception
            goto L5b
        Lf:
            r4 = move-exception
            goto L43
        L11:
            java.util.Map r8 = r3.a(r8)     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> Lf
        L15:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> Lf
            int r2 = r8.size()     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> Lf
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> Lf
            r3.a(r8, r1, r2, r7)     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> Lf
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> Lf
            int r4 = r4.update(r5, r6, r7, r2)     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> Lf
            java.lang.String r5 = "common_log"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> Lf
            r6.<init>()     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> Lf
            java.lang.String r7 = "updateResult : "
            r6.append(r7)     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> Lf
            r6.append(r4)     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> Lf
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> Lf
            xyz.adscope.common.tool.LogUtil.i(r5, r6)     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> Lf
            monitor-exit(r3)
            return r4
        L43:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld
            r5.<init>()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r6 = "e : "
            r5.append(r6)     // Catch: java.lang.Throwable -> Ld
            r5.append(r4)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r5 = "common_log"
            xyz.adscope.common.tool.LogUtil.e(r5, r4)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r3)
            return r0
        L5b:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Ld
            throw r4
    }
}
