package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class f6 {

    /* renamed from: d, reason: collision with root package name */
    private static java.util.Map<java.lang.Class<? extends com.amap.api.col.p0003l.e6>, com.amap.api.col.p0003l.e6> f3292d;
    private com.amap.api.col.p0003l.g6 a;

    /* renamed from: b, reason: collision with root package name */
    private android.database.sqlite.SQLiteDatabase f3293b;

    /* renamed from: c, reason: collision with root package name */
    private com.amap.api.col.p0003l.e6 f3294c;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.amap.api.col.p0003l.f6.f3292d = r0
            return
    }

    public f6(android.content.Context r4, com.amap.api.col.p0003l.e6 r5) {
            r3 = this;
            r3.<init>()
            com.amap.api.col.3l.g6 r0 = new com.amap.api.col.3l.g6     // Catch: java.lang.Throwable -> L1a
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L1a
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = r5.b()     // Catch: java.lang.Throwable -> L1a
            int r2 = r5.c()     // Catch: java.lang.Throwable -> L1a
            r0.<init>(r4, r1, r2, r5)     // Catch: java.lang.Throwable -> L1a
            r3.a = r0     // Catch: java.lang.Throwable -> L1a
        L1a:
            r3.f3294c = r5
            return
    }

    private static android.content.ContentValues a(java.lang.Object r5, com.amap.api.col.p0003l.hk r6) {
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.Class r1 = r5.getClass()
            boolean r6 = r6.b()
            java.lang.reflect.Field[] r6 = m(r1, r6)
            int r1 = r6.length
            r2 = 0
        L13:
            if (r2 >= r1) goto L21
            r3 = r6[r2]
            r4 = 1
            r3.setAccessible(r4)
            i(r5, r3, r0)
            int r2 = r2 + 1
            goto L13
        L21:
            return r0
    }

    private android.database.sqlite.SQLiteDatabase b() {
            r3 = this;
            android.database.sqlite.SQLiteDatabase r0 = r3.f3293b     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto L15
            com.amap.api.col.3l.g6 r0 = r3.a     // Catch: java.lang.Throwable -> Ld
            android.database.sqlite.SQLiteDatabase r0 = r0.getReadableDatabase()     // Catch: java.lang.Throwable -> Ld
            r3.f3293b = r0     // Catch: java.lang.Throwable -> Ld
            goto L15
        Ld:
            r0 = move-exception
            java.lang.String r1 = "dbs"
            java.lang.String r2 = "grd"
            com.amap.api.col.p0003l.r5.e(r0, r1, r2)
        L15:
            android.database.sqlite.SQLiteDatabase r0 = r3.f3293b
            return r0
    }

    public static synchronized com.amap.api.col.p0003l.e6 c(java.lang.Class<? extends com.amap.api.col.p0003l.e6> r3) throws java.lang.IllegalAccessException, java.lang.InstantiationException {
            java.lang.Class<com.amap.api.col.3l.f6> r0 = com.amap.api.col.p0003l.f6.class
            monitor-enter(r0)
            java.util.Map<java.lang.Class<? extends com.amap.api.col.3l.e6>, com.amap.api.col.3l.e6> r1 = com.amap.api.col.p0003l.f6.f3292d     // Catch: java.lang.Throwable -> L15
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L17
            java.util.Map<java.lang.Class<? extends com.amap.api.col.3l.e6>, com.amap.api.col.3l.e6> r1 = com.amap.api.col.p0003l.f6.f3292d     // Catch: java.lang.Throwable -> L15
            java.lang.Object r2 = r3.newInstance()     // Catch: java.lang.Throwable -> L15
            r1.put(r3, r2)     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r3 = move-exception
            goto L21
        L17:
            java.util.Map<java.lang.Class<? extends com.amap.api.col.3l.e6>, com.amap.api.col.3l.e6> r1 = com.amap.api.col.p0003l.f6.f3292d     // Catch: java.lang.Throwable -> L15
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L15
            com.amap.api.col.3l.e6 r3 = (com.amap.api.col.p0003l.e6) r3     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)
            return r3
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r3
    }

    private static <T> T d(android.database.Cursor r6, java.lang.Class<T> r7, com.amap.api.col.p0003l.hk r8) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
            boolean r8 = r8.b()
            java.lang.reflect.Field[] r8 = m(r7, r8)
            r0 = 0
            java.lang.reflect.Constructor r7 = r7.getDeclaredConstructor(r0)
            r1 = 1
            r7.setAccessible(r1)
            java.lang.Object r7 = r7.newInstance(r0)
            int r0 = r8.length
            r2 = 0
        L17:
            if (r2 >= r0) goto L86
            r3 = r8[r2]
            r3.setAccessible(r1)
            java.lang.Class<com.amap.api.col.3l.hl> r4 = com.amap.api.col.p0003l.hl.class
            java.lang.annotation.Annotation r4 = r3.getAnnotation(r4)
            if (r4 == 0) goto L83
            com.amap.api.col.3l.hl r4 = (com.amap.api.col.p0003l.hl) r4
            int r5 = r4.b()
            java.lang.String r4 = r4.a()
            int r4 = r6.getColumnIndex(r4)
            switch(r5) {
                case 1: goto L78;
                case 2: goto L6c;
                case 3: goto L60;
                case 4: goto L54;
                case 5: goto L48;
                case 6: goto L40;
                case 7: goto L38;
                default: goto L37;
            }
        L37:
            goto L83
        L38:
            byte[] r4 = r6.getBlob(r4)
            r3.set(r7, r4)
            goto L83
        L40:
            java.lang.String r4 = r6.getString(r4)
            r3.set(r7, r4)
            goto L83
        L48:
            long r4 = r6.getLong(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3.set(r7, r4)
            goto L83
        L54:
            double r4 = r6.getDouble(r4)
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            r3.set(r7, r4)
            goto L83
        L60:
            float r4 = r6.getFloat(r4)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r3.set(r7, r4)
            goto L83
        L6c:
            int r4 = r6.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.set(r7, r4)
            goto L83
        L78:
            short r4 = r6.getShort(r4)
            java.lang.Short r4 = java.lang.Short.valueOf(r4)
            r3.set(r7, r4)
        L83:
            int r2 = r2 + 1
            goto L17
        L86:
            return r7
    }

    private static <T> java.lang.String e(com.amap.api.col.p0003l.hk r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.lang.String r0 = r0.a()
            return r0
    }

    private static <T> void f(android.database.sqlite.SQLiteDatabase r3, T r4) {
            java.lang.Class r0 = r4.getClass()
            com.amap.api.col.3l.hk r0 = o(r0)
            java.lang.String r1 = e(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L13
            goto L15
        L13:
            if (r3 != 0) goto L16
        L15:
            return
        L16:
            android.content.ContentValues r4 = a(r4, r0)
            r0 = 0
            r3.insert(r1, r0, r4)
            return
    }

    private <T> void g(T r1) {
            r0 = this;
            r0.q(r1)
            return
    }

    private static void i(java.lang.Object r2, java.lang.reflect.Field r3, android.content.ContentValues r4) {
            java.lang.Class<com.amap.api.col.3l.hl> r0 = com.amap.api.col.p0003l.hl.class
            java.lang.annotation.Annotation r0 = r3.getAnnotation(r0)
            if (r0 != 0) goto L9
            goto L7e
        L9:
            com.amap.api.col.3l.hl r0 = (com.amap.api.col.p0003l.hl) r0
            int r1 = r0.b()
            switch(r1) {
                case 1: goto L6f;
                case 2: goto L5f;
                case 3: goto L4f;
                case 4: goto L3f;
                case 5: goto L2f;
                case 6: goto L21;
                case 7: goto L13;
                default: goto L12;
            }
        L12:
            goto L7e
        L13:
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.IllegalAccessException -> L7e
            byte[] r2 = (byte[]) r2     // Catch: java.lang.IllegalAccessException -> L7e
            java.lang.String r3 = r0.a()     // Catch: java.lang.IllegalAccessException -> L7e
            r4.put(r3, r2)     // Catch: java.lang.IllegalAccessException -> L7e
            return
        L21:
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.IllegalAccessException -> L7e
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.IllegalAccessException -> L7e
            java.lang.String r3 = r0.a()     // Catch: java.lang.IllegalAccessException -> L7e
            r4.put(r3, r2)     // Catch: java.lang.IllegalAccessException -> L7e
            return
        L2f:
            long r2 = r3.getLong(r2)     // Catch: java.lang.IllegalAccessException -> L7e
            java.lang.String r0 = r0.a()     // Catch: java.lang.IllegalAccessException -> L7e
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.IllegalAccessException -> L7e
            r4.put(r0, r2)     // Catch: java.lang.IllegalAccessException -> L7e
            return
        L3f:
            double r2 = r3.getDouble(r2)     // Catch: java.lang.IllegalAccessException -> L7e
            java.lang.String r0 = r0.a()     // Catch: java.lang.IllegalAccessException -> L7e
            java.lang.Double r2 = java.lang.Double.valueOf(r2)     // Catch: java.lang.IllegalAccessException -> L7e
            r4.put(r0, r2)     // Catch: java.lang.IllegalAccessException -> L7e
            return
        L4f:
            float r2 = r3.getFloat(r2)     // Catch: java.lang.IllegalAccessException -> L7e
            java.lang.String r3 = r0.a()     // Catch: java.lang.IllegalAccessException -> L7e
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch: java.lang.IllegalAccessException -> L7e
            r4.put(r3, r2)     // Catch: java.lang.IllegalAccessException -> L7e
            return
        L5f:
            int r2 = r3.getInt(r2)     // Catch: java.lang.IllegalAccessException -> L7e
            java.lang.String r3 = r0.a()     // Catch: java.lang.IllegalAccessException -> L7e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.IllegalAccessException -> L7e
            r4.put(r3, r2)     // Catch: java.lang.IllegalAccessException -> L7e
            return
        L6f:
            short r2 = r3.getShort(r2)     // Catch: java.lang.IllegalAccessException -> L7e
            java.lang.String r3 = r0.a()     // Catch: java.lang.IllegalAccessException -> L7e
            java.lang.Short r2 = java.lang.Short.valueOf(r2)     // Catch: java.lang.IllegalAccessException -> L7e
            r4.put(r3, r2)     // Catch: java.lang.IllegalAccessException -> L7e
        L7e:
            return
    }

    private <T> void k(java.lang.String r5, java.lang.Object r6) {
            r4 = this;
            com.amap.api.col.3l.e6 r0 = r4.f3294c
            monitor-enter(r0)
            if (r6 != 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r5 = move-exception
            goto L54
        L9:
            java.lang.Class r1 = r6.getClass()     // Catch: java.lang.Throwable -> L7
            com.amap.api.col.3l.hk r1 = o(r1)     // Catch: java.lang.Throwable -> L7
            java.lang.String r2 = e(r1)     // Catch: java.lang.Throwable -> L7
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L7
            if (r3 == 0) goto L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L1d:
            android.content.ContentValues r6 = a(r6, r1)     // Catch: java.lang.Throwable -> L7
            android.database.sqlite.SQLiteDatabase r1 = r4.n()     // Catch: java.lang.Throwable -> L7
            r4.f3293b = r1     // Catch: java.lang.Throwable -> L7
            if (r1 != 0) goto L2b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L2b:
            r3 = 0
            r1.update(r2, r6, r5, r3)     // Catch: java.lang.Throwable -> L37
            android.database.sqlite.SQLiteDatabase r5 = r4.f3293b     // Catch: java.lang.Throwable -> L7
            if (r5 == 0) goto L47
            goto L43
        L34:
            r4.f3293b = r3     // Catch: java.lang.Throwable -> L7
            goto L47
        L37:
            r5 = move-exception
            java.lang.String r6 = "dbs"
            java.lang.String r1 = "udd"
            com.amap.api.col.p0003l.r5.e(r5, r6, r1)     // Catch: java.lang.Throwable -> L49
            android.database.sqlite.SQLiteDatabase r5 = r4.f3293b     // Catch: java.lang.Throwable -> L7
            if (r5 == 0) goto L47
        L43:
            r5.close()     // Catch: java.lang.Throwable -> L7
            goto L34
        L47:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L49:
            r5 = move-exception
            android.database.sqlite.SQLiteDatabase r6 = r4.f3293b     // Catch: java.lang.Throwable -> L7
            if (r6 == 0) goto L53
            r6.close()     // Catch: java.lang.Throwable -> L7
            r4.f3293b = r3     // Catch: java.lang.Throwable -> L7
        L53:
            throw r5     // Catch: java.lang.Throwable -> L7
        L54:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r5
    }

    private static java.lang.reflect.Field[] m(java.lang.Class<?> r0, boolean r1) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            if (r1 == 0) goto Lf
            java.lang.Class r0 = r0.getSuperclass()
            java.lang.reflect.Field[] r0 = r0.getDeclaredFields()
            return r0
        Lf:
            java.lang.reflect.Field[] r0 = r0.getDeclaredFields()
            return r0
    }

    private android.database.sqlite.SQLiteDatabase n() {
            r3 = this;
            android.database.sqlite.SQLiteDatabase r0 = r3.f3293b     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto Ld
            boolean r0 = r0.isReadOnly()     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L24
            goto Ld
        Lb:
            r0 = move-exception
            goto L1d
        Ld:
            android.database.sqlite.SQLiteDatabase r0 = r3.f3293b     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L14
            r0.close()     // Catch: java.lang.Throwable -> Lb
        L14:
            com.amap.api.col.3l.g6 r0 = r3.a     // Catch: java.lang.Throwable -> Lb
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch: java.lang.Throwable -> Lb
            r3.f3293b = r0     // Catch: java.lang.Throwable -> Lb
            goto L24
        L1d:
            java.lang.String r1 = "dbs"
            java.lang.String r2 = "gwd"
            com.amap.api.col.p0003l.r5.e(r0, r1, r2)
        L24:
            android.database.sqlite.SQLiteDatabase r0 = r3.f3293b
            return r0
    }

    private static <T> com.amap.api.col.p0003l.hk o(java.lang.Class<T> r1) {
            java.lang.Class<com.amap.api.col.3l.hk> r0 = com.amap.api.col.p0003l.hk.class
            java.lang.annotation.Annotation r1 = r1.getAnnotation(r0)
            if (r1 == 0) goto Lb
            com.amap.api.col.3l.hk r1 = (com.amap.api.col.p0003l.hk) r1
            return r1
        Lb:
            r1 = 0
            return r1
    }

    private <T> void q(T r5) {
            r4 = this;
            com.amap.api.col.3l.e6 r0 = r4.f3294c
            monitor-enter(r0)
            android.database.sqlite.SQLiteDatabase r1 = r4.n()     // Catch: java.lang.Throwable -> Ld
            r4.f3293b = r1     // Catch: java.lang.Throwable -> Ld
            if (r1 != 0) goto Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r5 = move-exception
            goto L38
        Lf:
            r2 = 0
            f(r1, r5)     // Catch: java.lang.Throwable -> L1b
            android.database.sqlite.SQLiteDatabase r5 = r4.f3293b     // Catch: java.lang.Throwable -> Ld
            if (r5 == 0) goto L2b
            goto L27
        L18:
            r4.f3293b = r2     // Catch: java.lang.Throwable -> Ld
            goto L2b
        L1b:
            r5 = move-exception
            java.lang.String r1 = "dbs"
            java.lang.String r3 = "itd"
            com.amap.api.col.p0003l.r5.e(r5, r1, r3)     // Catch: java.lang.Throwable -> L2d
            android.database.sqlite.SQLiteDatabase r5 = r4.f3293b     // Catch: java.lang.Throwable -> Ld
            if (r5 == 0) goto L2b
        L27:
            r5.close()     // Catch: java.lang.Throwable -> Ld
            goto L18
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        L2d:
            r5 = move-exception
            android.database.sqlite.SQLiteDatabase r1 = r4.f3293b     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto L37
            r1.close()     // Catch: java.lang.Throwable -> Ld
            r4.f3293b = r2     // Catch: java.lang.Throwable -> Ld
        L37:
            throw r5     // Catch: java.lang.Throwable -> Ld
        L38:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r5
    }

    private <T> void r(java.lang.String r1, java.lang.Object r2) {
            r0 = this;
            r0.k(r1, r2)
            return
    }

    private <T> java.util.List<T> s(java.lang.String r13, java.lang.Class<T> r14) {
            r12 = this;
            com.amap.api.col.3l.e6 r1 = r12.f3294c
            monitor-enter(r1)
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1b
            r2.<init>()     // Catch: java.lang.Throwable -> L1b
            com.amap.api.col.3l.hk r0 = o(r14)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r4 = e(r0)     // Catch: java.lang.Throwable -> L1b
            android.database.sqlite.SQLiteDatabase r3 = r12.f3293b     // Catch: java.lang.Throwable -> L1b
            if (r3 != 0) goto L1f
            android.database.sqlite.SQLiteDatabase r3 = r12.b()     // Catch: java.lang.Throwable -> L1b
            r12.f3293b = r3     // Catch: java.lang.Throwable -> L1b
            goto L1f
        L1b:
            r0 = move-exception
            r13 = r0
            goto Leb
        L1f:
            android.database.sqlite.SQLiteDatabase r3 = r12.f3293b     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto Le9
            boolean r3 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L1b
            if (r3 != 0) goto Le9
            if (r13 != 0) goto L2d
            goto Le9
        L2d:
            r11 = 0
            android.database.sqlite.SQLiteDatabase r3 = r12.f3293b     // Catch: java.lang.Throwable -> L9a
            r9 = 0
            r10 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r6 = r13
            android.database.Cursor r13 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L9a
            if (r13 != 0) goto L6b
            android.database.sqlite.SQLiteDatabase r14 = r12.f3293b     // Catch: java.lang.Throwable -> L68
            r14.close()     // Catch: java.lang.Throwable -> L68
            r12.f3293b = r11     // Catch: java.lang.Throwable -> L68
            if (r13 == 0) goto L52
            r13.close()     // Catch: java.lang.Throwable -> L49
            goto L52
        L49:
            r0 = move-exception
            r13 = r0
            java.lang.String r14 = "dbs"
            java.lang.String r0 = "sld"
            com.amap.api.col.p0003l.r5.e(r13, r14, r0)     // Catch: java.lang.Throwable -> L1b
        L52:
            android.database.sqlite.SQLiteDatabase r13 = r12.f3293b     // Catch: java.lang.Throwable -> L5c
            if (r13 == 0) goto L65
            r13.close()     // Catch: java.lang.Throwable -> L5c
            r12.f3293b = r11     // Catch: java.lang.Throwable -> L5c
            goto L65
        L5c:
            r0 = move-exception
            r13 = r0
            java.lang.String r14 = "dbs"
            java.lang.String r0 = "sld"
            com.amap.api.col.p0003l.r5.e(r13, r14, r0)     // Catch: java.lang.Throwable -> L1b
        L65:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            goto Lc3
        L68:
            r0 = move-exception
            r14 = r0
            goto L9d
        L6b:
            boolean r3 = r13.moveToNext()     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto L79
            java.lang.Object r3 = d(r13, r14, r0)     // Catch: java.lang.Throwable -> L68
            r2.add(r3)     // Catch: java.lang.Throwable -> L68
            goto L6b
        L79:
            r13.close()     // Catch: java.lang.Throwable -> L7d
            goto L86
        L7d:
            r0 = move-exception
            r13 = r0
            java.lang.String r14 = "dbs"
            java.lang.String r0 = "sld"
            com.amap.api.col.p0003l.r5.e(r13, r14, r0)     // Catch: java.lang.Throwable -> L1b
        L86:
            android.database.sqlite.SQLiteDatabase r13 = r12.f3293b     // Catch: java.lang.Throwable -> L90
            if (r13 == 0) goto Lc2
            r13.close()     // Catch: java.lang.Throwable -> L90
            r12.f3293b = r11     // Catch: java.lang.Throwable -> L90
            goto Lc2
        L90:
            r0 = move-exception
            r13 = r0
            java.lang.String r14 = "dbs"
        L94:
            java.lang.String r0 = "sld"
            com.amap.api.col.p0003l.r5.e(r13, r14, r0)     // Catch: java.lang.Throwable -> L1b
            goto Lc2
        L9a:
            r0 = move-exception
            r14 = r0
            r13 = r11
        L9d:
            java.lang.String r0 = "dbs"
            java.lang.String r3 = "sld"
            com.amap.api.col.p0003l.r5.e(r14, r0, r3)     // Catch: java.lang.Throwable -> Lc4
            if (r13 == 0) goto Lb3
            r13.close()     // Catch: java.lang.Throwable -> Laa
            goto Lb3
        Laa:
            r0 = move-exception
            r13 = r0
            java.lang.String r14 = "dbs"
            java.lang.String r0 = "sld"
            com.amap.api.col.p0003l.r5.e(r13, r14, r0)     // Catch: java.lang.Throwable -> L1b
        Lb3:
            android.database.sqlite.SQLiteDatabase r13 = r12.f3293b     // Catch: java.lang.Throwable -> Lbd
            if (r13 == 0) goto Lc2
            r13.close()     // Catch: java.lang.Throwable -> Lbd
            r12.f3293b = r11     // Catch: java.lang.Throwable -> Lbd
            goto Lc2
        Lbd:
            r0 = move-exception
            r13 = r0
            java.lang.String r14 = "dbs"
            goto L94
        Lc2:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
        Lc3:
            return r2
        Lc4:
            r0 = move-exception
            r14 = r0
            if (r13 == 0) goto Ld5
            r13.close()     // Catch: java.lang.Throwable -> Lcc
            goto Ld5
        Lcc:
            r0 = move-exception
            r13 = r0
            java.lang.String r0 = "dbs"
            java.lang.String r2 = "sld"
            com.amap.api.col.p0003l.r5.e(r13, r0, r2)     // Catch: java.lang.Throwable -> L1b
        Ld5:
            android.database.sqlite.SQLiteDatabase r13 = r12.f3293b     // Catch: java.lang.Throwable -> Ldf
            if (r13 == 0) goto Le8
            r13.close()     // Catch: java.lang.Throwable -> Ldf
            r12.f3293b = r11     // Catch: java.lang.Throwable -> Ldf
            goto Le8
        Ldf:
            r0 = move-exception
            r13 = r0
            java.lang.String r0 = "dbs"
            java.lang.String r2 = "sld"
            com.amap.api.col.p0003l.r5.e(r13, r0, r2)     // Catch: java.lang.Throwable -> L1b
        Le8:
            throw r14     // Catch: java.lang.Throwable -> L1b
        Le9:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            return r2
        Leb:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            throw r13
    }

    public final void h(java.lang.Object r3, java.lang.String r4) {
            r2 = this;
            com.amap.api.col.3l.e6 r0 = r2.f3294c
            monitor-enter(r0)
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L18
            java.util.List r1 = r2.p(r4, r1)     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1a
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L14
            goto L1a
        L14:
            r2.r(r4, r3)     // Catch: java.lang.Throwable -> L18
            goto L1d
        L18:
            r3 = move-exception
            goto L1f
        L1a:
            r2.g(r3)     // Catch: java.lang.Throwable -> L18
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r3
    }

    public final <T> void j(java.lang.String r4, java.lang.Class<T> r5) {
            r3 = this;
            com.amap.api.col.3l.e6 r0 = r3.f3294c
            monitor-enter(r0)
            com.amap.api.col.3l.hk r5 = o(r5)     // Catch: java.lang.Throwable -> L13
            java.lang.String r5 = e(r5)     // Catch: java.lang.Throwable -> L13
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r4 = move-exception
            goto L47
        L15:
            android.database.sqlite.SQLiteDatabase r1 = r3.n()     // Catch: java.lang.Throwable -> L13
            r3.f3293b = r1     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L1f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return
        L1f:
            r2 = 0
            r1.delete(r5, r4, r2)     // Catch: java.lang.Throwable -> L2b
            android.database.sqlite.SQLiteDatabase r4 = r3.f3293b     // Catch: java.lang.Throwable -> L13
            if (r4 == 0) goto L3a
        L27:
            r4.close()     // Catch: java.lang.Throwable -> L13
            goto L38
        L2b:
            r4 = move-exception
            java.lang.String r5 = "dbs"
            java.lang.String r1 = "dld"
            com.amap.api.col.p0003l.r5.e(r4, r5, r1)     // Catch: java.lang.Throwable -> L3c
            android.database.sqlite.SQLiteDatabase r4 = r3.f3293b     // Catch: java.lang.Throwable -> L13
            if (r4 == 0) goto L3a
            goto L27
        L38:
            r3.f3293b = r2     // Catch: java.lang.Throwable -> L13
        L3a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return
        L3c:
            r4 = move-exception
            android.database.sqlite.SQLiteDatabase r5 = r3.f3293b     // Catch: java.lang.Throwable -> L13
            if (r5 == 0) goto L46
            r5.close()     // Catch: java.lang.Throwable -> L13
            r3.f3293b = r2     // Catch: java.lang.Throwable -> L13
        L46:
            throw r4     // Catch: java.lang.Throwable -> L13
        L47:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r4
    }

    public final <T> void l(java.util.List<T> r6) {
            r5 = this;
            com.amap.api.col.3l.e6 r0 = r5.f3294c
            monitor-enter(r0)
            int r1 = r6.size()     // Catch: java.lang.Throwable -> Lb
            if (r1 != 0) goto Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r6 = move-exception
            goto Lb1
        Le:
            android.database.sqlite.SQLiteDatabase r1 = r5.n()     // Catch: java.lang.Throwable -> Lb
            r5.f3293b = r1     // Catch: java.lang.Throwable -> Lb
            if (r1 != 0) goto L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        L18:
            r2 = 0
            r1.beginTransaction()     // Catch: java.lang.Throwable -> L30
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L30
        L20:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L32
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Throwable -> L30
            android.database.sqlite.SQLiteDatabase r3 = r5.f3293b     // Catch: java.lang.Throwable -> L30
            f(r3, r1)     // Catch: java.lang.Throwable -> L30
            goto L20
        L30:
            r6 = move-exception
            goto L5b
        L32:
            android.database.sqlite.SQLiteDatabase r6 = r5.f3293b     // Catch: java.lang.Throwable -> L30
            r6.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L30
            android.database.sqlite.SQLiteDatabase r6 = r5.f3293b     // Catch: java.lang.Throwable -> L45
            boolean r6 = r6.inTransaction()     // Catch: java.lang.Throwable -> L45
            if (r6 == 0) goto L4d
            android.database.sqlite.SQLiteDatabase r6 = r5.f3293b     // Catch: java.lang.Throwable -> L45
            r6.endTransaction()     // Catch: java.lang.Throwable -> L45
            goto L4d
        L45:
            r6 = move-exception
            java.lang.String r1 = "dbs"
            java.lang.String r3 = "ild"
            com.amap.api.col.p0003l.r5.e(r6, r1, r3)     // Catch: java.lang.Throwable -> Lb
        L4d:
            android.database.sqlite.SQLiteDatabase r6 = r5.f3293b     // Catch: java.lang.Throwable -> L55
            r6.close()     // Catch: java.lang.Throwable -> L55
            r5.f3293b = r2     // Catch: java.lang.Throwable -> L55
            goto L87
        L55:
            r6 = move-exception
            java.lang.String r1 = "dbs"
        L58:
            java.lang.String r2 = "ild"
            goto L84
        L5b:
            java.lang.String r1 = "dbs"
            java.lang.String r3 = "ild"
            com.amap.api.col.p0003l.r5.e(r6, r1, r3)     // Catch: java.lang.Throwable -> L89
            android.database.sqlite.SQLiteDatabase r6 = r5.f3293b     // Catch: java.lang.Throwable -> L70
            boolean r6 = r6.inTransaction()     // Catch: java.lang.Throwable -> L70
            if (r6 == 0) goto L78
            android.database.sqlite.SQLiteDatabase r6 = r5.f3293b     // Catch: java.lang.Throwable -> L70
            r6.endTransaction()     // Catch: java.lang.Throwable -> L70
            goto L78
        L70:
            r6 = move-exception
            java.lang.String r1 = "dbs"
            java.lang.String r3 = "ild"
            com.amap.api.col.p0003l.r5.e(r6, r1, r3)     // Catch: java.lang.Throwable -> Lb
        L78:
            android.database.sqlite.SQLiteDatabase r6 = r5.f3293b     // Catch: java.lang.Throwable -> L80
            r6.close()     // Catch: java.lang.Throwable -> L80
            r5.f3293b = r2     // Catch: java.lang.Throwable -> L80
            goto L87
        L80:
            r6 = move-exception
            java.lang.String r1 = "dbs"
            goto L58
        L84:
            com.amap.api.col.p0003l.r5.e(r6, r1, r2)     // Catch: java.lang.Throwable -> Lb
        L87:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        L89:
            r6 = move-exception
            android.database.sqlite.SQLiteDatabase r1 = r5.f3293b     // Catch: java.lang.Throwable -> L98
            boolean r1 = r1.inTransaction()     // Catch: java.lang.Throwable -> L98
            if (r1 == 0) goto La0
            android.database.sqlite.SQLiteDatabase r1 = r5.f3293b     // Catch: java.lang.Throwable -> L98
            r1.endTransaction()     // Catch: java.lang.Throwable -> L98
            goto La0
        L98:
            r1 = move-exception
            java.lang.String r3 = "dbs"
            java.lang.String r4 = "ild"
            com.amap.api.col.p0003l.r5.e(r1, r3, r4)     // Catch: java.lang.Throwable -> Lb
        La0:
            android.database.sqlite.SQLiteDatabase r1 = r5.f3293b     // Catch: java.lang.Throwable -> La8
            r1.close()     // Catch: java.lang.Throwable -> La8
            r5.f3293b = r2     // Catch: java.lang.Throwable -> La8
            goto Lb0
        La8:
            r1 = move-exception
            java.lang.String r2 = "dbs"
            java.lang.String r3 = "ild"
            com.amap.api.col.p0003l.r5.e(r1, r2, r3)     // Catch: java.lang.Throwable -> Lb
        Lb0:
            throw r6     // Catch: java.lang.Throwable -> Lb
        Lb1:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r6
    }

    public final <T> java.util.List<T> p(java.lang.String r1, java.lang.Class<T> r2) {
            r0 = this;
            java.util.List r1 = r0.s(r1, r2)
            return r1
    }
}
