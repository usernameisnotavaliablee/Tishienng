package cn.bluemobi.dylan.sqlitelibrary;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d {

    /* renamed from: h, reason: collision with root package name */
    private static volatile cn.bluemobi.dylan.sqlitelibrary.d f216h;
    java.lang.String[] a;

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.String f217b;

    /* renamed from: c, reason: collision with root package name */
    private net.sqlcipher.database.SQLiteDatabase f218c;

    /* renamed from: d, reason: collision with root package name */
    private android.content.Context f219d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f220e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.String f221f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.String f222g;

    private d() {
            r19 = this;
            r0 = r19
            r0.<init>()
            java.lang.String r17 = "char"
            java.lang.String r18 = "float"
            java.lang.String r1 = "java.lang.Integer"
            java.lang.String r2 = "java.lang.Double"
            java.lang.String r3 = "java.lang.Float"
            java.lang.String r4 = "java.lang.Long"
            java.lang.String r5 = "java.lang.Short"
            java.lang.String r6 = "java.lang.Byte"
            java.lang.String r7 = "java.lang.Boolean"
            java.lang.String r8 = "java.lang.Character"
            java.lang.String r9 = "java.lang.String"
            java.lang.String r10 = "java.util.Date"
            java.lang.String r11 = "int"
            java.lang.String r12 = "double"
            java.lang.String r13 = "long"
            java.lang.String r14 = "short"
            java.lang.String r15 = "byte"
            java.lang.String r16 = "boolean"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18}
            r0.a = r1
            java.lang.String r1 = "SQLiteDbUtil"
            r0.f217b = r1
            return
    }

    private <T> android.content.ContentValues g(T r6) {
            r5 = this;
            java.util.List r6 = cn.bluemobi.dylan.sqlitelibrary.b.a(r6)
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            r1 = 0
        La:
            int r2 = r6.size()
            if (r1 >= r2) goto L3f
            java.lang.Object r2 = r6.get(r1)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "name"
            java.lang.Object r3 = r2.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "value"
            java.lang.Object r2 = r2.get(r4)
            if (r2 != 0) goto L2b
            r0.putNull(r3)
            goto L3c
        L2b:
            boolean r4 = r2 instanceof byte[]
            if (r4 == 0) goto L35
            byte[] r2 = (byte[]) r2
            r0.put(r3, r2)
            goto L3c
        L35:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.put(r3, r2)
        L3c:
            int r1 = r1 + 1
            goto La
        L3f:
            java.lang.String r6 = "id"
            r0.remove(r6)
            return r0
    }

    private java.lang.String getType(java.lang.Class r6) {
            r5 = this;
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r0 = r6.equals(r0)
            java.lang.String r1 = "TEXT"
            if (r0 == 0) goto Lb
            return r1
        Lb:
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto Lff
            java.lang.String r0 = r6.getName()
            java.lang.String r2 = "int"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L21
            goto Lff
        L21:
            java.lang.Class<java.lang.Character> r0 = java.lang.Character.class
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto Lfc
            java.lang.String r0 = r6.getName()
            java.lang.String r2 = "char"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L37
            goto Lfc
        L37:
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            boolean r0 = r6.equals(r0)
            java.lang.String r2 = "boolean"
            if (r0 != 0) goto Lfb
            java.lang.String r0 = r6.getName()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L4d
            goto Lfb
        L4d:
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto Lf8
            java.lang.String r0 = r6.getName()
            java.lang.String r2 = "float"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L63
            goto Lf8
        L63:
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto Lf5
            java.lang.String r0 = r6.getName()
            java.lang.String r2 = "double"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L79
            goto Lf5
        L79:
            java.lang.Class<java.lang.Byte> r0 = java.lang.Byte.class
            boolean r0 = r6.equals(r0)
            java.lang.String r2 = "Byte"
            if (r0 != 0) goto Lf4
            java.lang.String r0 = r6.getName()
            java.lang.String r3 = "byte"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L90
            goto Lf4
        L90:
            java.lang.Class<java.lang.Short> r0 = java.lang.Short.class
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto Lf1
            java.lang.String r0 = r6.getName()
            java.lang.String r4 = "short"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto La5
            goto Lf1
        La5:
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto Lee
            java.lang.String r0 = r6.getName()
            java.lang.String r4 = "long"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto Lba
            goto Lee
        Lba:
            java.lang.Class<java.util.Date> r0 = java.util.Date.class
            boolean r0 = r6.equals(r0)
            java.lang.String r4 = "Date"
            if (r0 == 0) goto Lc5
            return r4
        Lc5:
            java.lang.Class<java.sql.Date> r0 = java.sql.Date.class
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lce
            return r4
        Lce:
            boolean r0 = r6.isArray()
            if (r0 == 0) goto Led
            java.lang.Class r6 = r6.getComponentType()
            java.lang.String r6 = r6.getName()
            boolean r0 = r3.equals(r6)
            if (r0 != 0) goto Lea
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto Le9
            goto Lea
        Le9:
            return r1
        Lea:
            java.lang.String r6 = "Blob"
            return r6
        Led:
            return r1
        Lee:
            java.lang.String r6 = "Long"
            return r6
        Lf1:
            java.lang.String r6 = "Short"
            return r6
        Lf4:
            return r2
        Lf5:
            java.lang.String r6 = "Double"
            return r6
        Lf8:
            java.lang.String r6 = "Float"
            return r6
        Lfb:
            return r2
        Lfc:
            java.lang.String r6 = "Character"
            return r6
        Lff:
            java.lang.String r6 = "Integer"
            return r6
    }

    public static cn.bluemobi.dylan.sqlitelibrary.d h() {
            cn.bluemobi.dylan.sqlitelibrary.d r0 = cn.bluemobi.dylan.sqlitelibrary.d.f216h
            if (r0 != 0) goto L19
            java.lang.Class<cn.bluemobi.dylan.sqlitelibrary.d> r0 = cn.bluemobi.dylan.sqlitelibrary.d.class
            monitor-enter(r0)
            cn.bluemobi.dylan.sqlitelibrary.d r1 = cn.bluemobi.dylan.sqlitelibrary.d.f216h     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            cn.bluemobi.dylan.sqlitelibrary.d r1 = new cn.bluemobi.dylan.sqlitelibrary.d     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            cn.bluemobi.dylan.sqlitelibrary.d.f216h = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            cn.bluemobi.dylan.sqlitelibrary.d r0 = cn.bluemobi.dylan.sqlitelibrary.d.f216h
            return r0
    }

    private boolean k(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SELECT count(*) FROM sqlite_master WHERE type='table' AND name='"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "'"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.util.List r3 = r2.r(r3)
            r0 = 0
            if (r3 == 0) goto L3b
            int r1 = r3.size()
            if (r1 <= 0) goto L3b
            java.lang.Object r3 = r3.get(r0)
            java.util.Map r3 = (java.util.Map) r3
            java.lang.String r1 = "count(*)"
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r3 = r3.toString()
            int r3 = java.lang.Integer.parseInt(r3)
            if (r3 <= 0) goto L3b
            r3 = 1
            return r3
        L3b:
            return r0
    }

    private <T> T l(java.lang.Class<T> r13, net.sqlcipher.Cursor r14) {
            r12 = this;
            r0 = 0
            java.lang.reflect.Constructor r1 = r13.getConstructor(r0)     // Catch: java.lang.Throwable -> L1e2
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L1e2
            java.lang.Object r1 = r1.newInstance(r0)     // Catch: java.lang.Throwable -> L1e2
            java.lang.Class[] r3 = cn.bluemobi.dylan.sqlitelibrary.b.c(r13)     // Catch: java.lang.Throwable -> L1e2
            java.lang.String[] r4 = cn.bluemobi.dylan.sqlitelibrary.b.b(r13)     // Catch: java.lang.Throwable -> L1e2
            r5 = 0
            r6 = 0
        L17:
            int r7 = r3.length     // Catch: java.lang.Throwable -> L1e2
            if (r6 >= r7) goto L1e1
            r7 = r4[r6]     // Catch: java.lang.Throwable -> L1e2
            r8 = r3[r6]     // Catch: java.lang.Throwable -> L1e2
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e2
            r9.<init>()     // Catch: java.lang.Throwable -> L1e2
            java.lang.String r10 = "set"
            r9.append(r10)     // Catch: java.lang.Throwable -> L1e2
            java.lang.String r10 = r7.substring(r5, r2)     // Catch: java.lang.Throwable -> L1e2
            java.lang.String r10 = r10.toUpperCase()     // Catch: java.lang.Throwable -> L1e2
            r9.append(r10)     // Catch: java.lang.Throwable -> L1e2
            java.lang.String r10 = r7.substring(r2)     // Catch: java.lang.Throwable -> L1e2
            r9.append(r10)     // Catch: java.lang.Throwable -> L1e2
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L1e2
            java.lang.Class[] r10 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L1e2
            r10[r5] = r8     // Catch: java.lang.Throwable -> L1e2
            java.lang.reflect.Method r9 = r13.getMethod(r9, r10)     // Catch: java.lang.Throwable -> L1e2
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            boolean r10 = r8.equals(r10)     // Catch: java.lang.Throwable -> L1e2
            if (r10 == 0) goto L58
            int r7 = r14.getColumnIndex(r7)     // Catch: java.lang.Throwable -> L1e2
            java.lang.String r7 = r14.getString(r7)     // Catch: java.lang.Throwable -> L1e2
            goto L1d6
        L58:
            java.lang.Class<java.lang.Integer> r10 = java.lang.Integer.class
            boolean r10 = r8.equals(r10)     // Catch: java.lang.Throwable -> L1e2
            if (r10 != 0) goto L1ca
            java.lang.String r10 = r8.getName()     // Catch: java.lang.Throwable -> L1e2
            java.lang.String r11 = "int"
            boolean r10 = r10.equals(r11)     // Catch: java.lang.Throwable -> L1e2
            if (r10 == 0) goto L6e
            goto L1ca
        L6e:
            java.lang.Class<java.lang.Character> r10 = java.lang.Character.class
            boolean r10 = r8.equals(r10)     // Catch: java.lang.Throwable -> L1e2
            if (r10 != 0) goto L1b9
            java.lang.String r10 = r8.getName()     // Catch: java.lang.Throwable -> L1e2
            java.lang.String r11 = "char"
            boolean r10 = r10.equals(r11)     // Catch: java.lang.Throwable -> L1e2
            if (r10 == 0) goto L84
            goto L1b9
        L84:
            java.lang.Class<java.lang.Boolean> r10 = java.lang.Boolean.class
            boolean r10 = r8.equals(r10)     // Catch: java.lang.Throwable -> L1e2
            if (r10 != 0) goto L1a6
            java.lang.String r10 = r8.getName()     // Catch: java.lang.Throwable -> L1e2
            java.lang.String r11 = "boolean"
            boolean r10 = r10.equals(r11)     // Catch: java.lang.Throwable -> L1e2
            if (r10 == 0) goto L9a
            goto L1a6
        L9a:
            java.lang.Class<java.lang.Float> r10 = java.lang.Float.class
            boolean r10 = r8.equals(r10)     // Catch: java.lang.Throwable -> L1e2
            if (r10 != 0) goto L199
            java.lang.String r10 = r8.getName()     // Catch: java.lang.Throwable -> L1e2
            java.lang.String r11 = "float"
            boolean r10 = r10.equals(r11)     // Catch: java.lang.Throwable -> L1e2
            if (r10 == 0) goto Lb0
            goto L199
        Lb0:
            java.lang.Class<java.lang.Double> r10 = java.lang.Double.class
            boolean r10 = r8.equals(r10)     // Catch: java.lang.Throwable -> L1e2
            if (r10 != 0) goto L18c
            java.lang.String r10 = r8.getName()     // Catch: java.lang.Throwable -> L1e2
            java.lang.String r11 = "double"
            boolean r10 = r10.equals(r11)     // Catch: java.lang.Throwable -> L1e2
            if (r10 == 0) goto Lc6
            goto L18c
        Lc6:
            java.lang.Class<java.lang.Byte> r10 = java.lang.Byte.class
            boolean r10 = r8.equals(r10)     // Catch: java.lang.Throwable -> L1e2
            if (r10 != 0) goto L17f
            java.lang.String r10 = r8.getName()     // Catch: java.lang.Throwable -> L1e2
            java.lang.String r11 = "byte"
            boolean r10 = r10.equals(r11)     // Catch: java.lang.Throwable -> L1e2
            if (r10 == 0) goto Ldc
            goto L17f
        Ldc:
            java.lang.Class<java.lang.Short> r10 = java.lang.Short.class
            boolean r10 = r8.equals(r10)     // Catch: java.lang.Throwable -> L1e2
            if (r10 != 0) goto L172
            java.lang.String r10 = r8.getName()     // Catch: java.lang.Throwable -> L1e2
            java.lang.String r11 = "short"
            boolean r10 = r10.equals(r11)     // Catch: java.lang.Throwable -> L1e2
            if (r10 == 0) goto Lf2
            goto L172
        Lf2:
            java.lang.Class<java.lang.Long> r10 = java.lang.Long.class
            boolean r10 = r8.equals(r10)     // Catch: java.lang.Throwable -> L1e2
            if (r10 != 0) goto L165
            java.lang.String r10 = r8.getName()     // Catch: java.lang.Throwable -> L1e2
            java.lang.String r11 = "long"
            boolean r10 = r10.equals(r11)     // Catch: java.lang.Throwable -> L1e2
            if (r10 == 0) goto L107
            goto L165
        L107:
            boolean r10 = r8.isArray()     // Catch: java.lang.Throwable -> L1e2
            if (r10 == 0) goto L117
            int r7 = r14.getColumnIndex(r7)     // Catch: java.lang.Throwable -> L1e2
            byte[] r7 = r14.getBlob(r7)     // Catch: java.lang.Throwable -> L1e2
            goto L1d6
        L117:
            java.lang.Class<java.util.Date> r10 = java.util.Date.class
            boolean r10 = r8.equals(r10)     // Catch: java.lang.Throwable -> L1e2
            if (r10 == 0) goto L140
            int r8 = r14.getColumnIndex(r7)     // Catch: java.lang.Throwable -> L1e2
            java.lang.String r8 = r14.getString(r8)     // Catch: java.lang.Throwable -> L1e2
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L1e2
            if (r8 == 0) goto L130
        L12d:
            r7 = r0
            goto L1d6
        L130:
            java.util.Date r8 = new java.util.Date     // Catch: java.lang.Throwable -> L1e2
            int r7 = r14.getColumnIndex(r7)     // Catch: java.lang.Throwable -> L1e2
            java.lang.String r7 = r14.getString(r7)     // Catch: java.lang.Throwable -> L1e2
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L1e2
            r7 = r8
            goto L1d6
        L140:
            java.lang.Class<java.sql.Date> r10 = java.sql.Date.class
            boolean r8 = r8.equals(r10)     // Catch: java.lang.Throwable -> L1e2
            if (r8 == 0) goto L1dd
            int r8 = r14.getColumnIndex(r7)     // Catch: java.lang.Throwable -> L1e2
            java.lang.String r8 = r14.getString(r8)     // Catch: java.lang.Throwable -> L1e2
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L1e2
            if (r8 == 0) goto L157
            goto L12d
        L157:
            int r7 = r14.getColumnIndex(r7)     // Catch: java.lang.Throwable -> L1e2
            java.lang.String r7 = r14.getString(r7)     // Catch: java.lang.Throwable -> L1e2
            java.sql.Date r7 = java.sql.Date.valueOf(r7)     // Catch: java.lang.Throwable -> L1e2
            goto L1d6
        L165:
            int r7 = r14.getColumnIndex(r7)     // Catch: java.lang.Throwable -> L1e2
            long r7 = r14.getLong(r7)     // Catch: java.lang.Throwable -> L1e2
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L1e2
            goto L1d6
        L172:
            int r7 = r14.getColumnIndex(r7)     // Catch: java.lang.Throwable -> L1e2
            short r7 = r14.getShort(r7)     // Catch: java.lang.Throwable -> L1e2
            java.lang.Short r7 = java.lang.Short.valueOf(r7)     // Catch: java.lang.Throwable -> L1e2
            goto L1d6
        L17f:
            int r7 = r14.getColumnIndex(r7)     // Catch: java.lang.Throwable -> L1e2
            java.lang.String r7 = r14.getString(r7)     // Catch: java.lang.Throwable -> L1e2
            java.lang.Byte r7 = java.lang.Byte.valueOf(r7)     // Catch: java.lang.Throwable -> L1e2
            goto L1d6
        L18c:
            int r7 = r14.getColumnIndex(r7)     // Catch: java.lang.Throwable -> L1e2
            double r7 = r14.getDouble(r7)     // Catch: java.lang.Throwable -> L1e2
            java.lang.Double r7 = java.lang.Double.valueOf(r7)     // Catch: java.lang.Throwable -> L1e2
            goto L1d6
        L199:
            int r7 = r14.getColumnIndex(r7)     // Catch: java.lang.Throwable -> L1e2
            float r7 = r14.getFloat(r7)     // Catch: java.lang.Throwable -> L1e2
            java.lang.Float r7 = java.lang.Float.valueOf(r7)     // Catch: java.lang.Throwable -> L1e2
            goto L1d6
        L1a6:
            java.lang.String r8 = "true"
            int r7 = r14.getColumnIndex(r7)     // Catch: java.lang.Throwable -> L1e2
            java.lang.String r7 = r14.getString(r7)     // Catch: java.lang.Throwable -> L1e2
            boolean r7 = r8.equalsIgnoreCase(r7)     // Catch: java.lang.Throwable -> L1e2
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L1e2
            goto L1d6
        L1b9:
            int r7 = r14.getColumnIndex(r7)     // Catch: java.lang.Throwable -> L1e2
            java.lang.String r7 = r14.getString(r7)     // Catch: java.lang.Throwable -> L1e2
            char r7 = r7.charAt(r5)     // Catch: java.lang.Throwable -> L1e2
            java.lang.Character r7 = java.lang.Character.valueOf(r7)     // Catch: java.lang.Throwable -> L1e2
            goto L1d6
        L1ca:
            int r7 = r14.getColumnIndex(r7)     // Catch: java.lang.Throwable -> L1e2
            int r7 = r14.getInt(r7)     // Catch: java.lang.Throwable -> L1e2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L1e2
        L1d6:
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1e2
            r8[r5] = r7     // Catch: java.lang.Throwable -> L1e2
            r9.invoke(r1, r8)     // Catch: java.lang.Throwable -> L1e2
        L1dd:
            int r6 = r6 + 1
            goto L17
        L1e1:
            return r1
        L1e2:
            return r0
    }

    private void m() throws java.lang.Exception {
            r4 = this;
            net.sqlcipher.database.SQLiteDatabase r0 = r4.f218c
            if (r0 == 0) goto L10
            android.content.Context r0 = r4.f219d
            java.lang.String r1 = r4.f220e
            java.lang.String r2 = r4.f221f
            java.lang.String r3 = r4.f222g
            r4.q(r0, r1, r2, r3)
            return
        L10:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "未初始化数据库"
            r0.<init>(r1)
            throw r0
    }

    public void a() {
            r1 = this;
            net.sqlcipher.database.SQLiteDatabase r0 = r1.f218c
            if (r0 == 0) goto Lf
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto Lf
            net.sqlcipher.database.SQLiteDatabase r0 = r1.f218c
            r0.close()
        Lf:
            return
    }

    public <T> void b(java.lang.Class<T> r20) {
            r19 = this;
            r0 = r19
            java.lang.String r1 = cn.bluemobi.dylan.sqlitelibrary.b.d(r20)
            java.util.ArrayList r2 = new java.util.ArrayList
            java.lang.String[] r3 = cn.bluemobi.dylan.sqlitelibrary.b.b(r20)
            java.util.List r3 = java.util.Arrays.asList(r3)
            r2.<init>(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            java.lang.Class[] r4 = cn.bluemobi.dylan.sqlitelibrary.b.c(r20)
            java.util.List r4 = java.util.Arrays.asList(r4)
            r3.<init>(r4)
            java.lang.String r4 = "id"
            int r5 = r2.indexOf(r4)
            r6 = -1
            if (r5 == r6) goto L2f
            r2.remove(r5)
            r3.remove(r5)
        L2f:
            boolean r5 = r0.k(r1)
            java.lang.String r7 = ")"
            java.lang.String r8 = ","
            java.lang.String r9 = "id  Integer PRIMARY KEY AUTOINCREMENT,"
            java.lang.String r10 = "("
            java.lang.String r11 = "CREATE TABLE IF NOT EXISTS "
            java.lang.String r12 = " "
            r14 = 1
            if (r5 != 0) goto Ld5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r11)
            r4.append(r1)
            r4.append(r10)
            java.lang.String r1 = r4.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r9)
            java.lang.String r1 = r4.toString()
            r13 = 0
        L64:
            int r4 = r2.size()
            if (r13 >= r4) goto Lc2
            int r4 = r2.size()
            int r4 = r4 - r14
            if (r13 == r4) goto L9a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.Object r1 = r2.get(r13)
            java.lang.String r1 = (java.lang.String) r1
            r4.append(r1)
            r4.append(r12)
            java.lang.Object r1 = r3.get(r13)
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.String r1 = r0.getType(r1)
            r4.append(r1)
            r4.append(r8)
            java.lang.String r1 = r4.toString()
            goto Lbf
        L9a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.Object r1 = r2.get(r13)
            java.lang.String r1 = (java.lang.String) r1
            r4.append(r1)
            r4.append(r12)
            java.lang.Object r1 = r3.get(r13)
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.String r1 = r0.getType(r1)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
        Lbf:
            int r13 = r13 + 1
            goto L64
        Lc2:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r7)
            java.lang.String r1 = r2.toString()
            r0.f(r1)
            return
        Ld5:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r15 = "PRAGMA table_info(["
            r5.append(r15)
            r5.append(r1)
            java.lang.String r15 = "])"
            r5.append(r15)
            java.lang.String r5 = r5.toString()
            java.util.List r5 = r0.r(r5)
            java.util.Objects.toString(r5)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r14 = 0
            r16 = 1
        Lff:
            int r6 = r5.size()
            if (r14 >= r6) goto L136
            java.lang.Object r6 = r5.get(r14)
            java.util.Map r6 = (java.util.Map) r6
            r17 = r7
            java.lang.String r7 = "name"
            java.lang.Object r6 = r6.get(r7)
            java.lang.String r6 = r6.toString()
            java.lang.Object r7 = r5.get(r14)
            java.util.Map r7 = (java.util.Map) r7
            r18 = r5
            java.lang.String r5 = "type"
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = r5.toString()
            r15.add(r6)
            r13.add(r5)
            int r14 = r14 + 1
            r7 = r17
            r5 = r18
            goto Lff
        L136:
            r17 = r7
            int r4 = r15.indexOf(r4)
            r5 = -1
            if (r4 == r5) goto L145
            r15.remove(r4)
            r13.remove(r4)
        L145:
            r4 = 0
            r5 = 0
        L147:
            int r6 = r2.size()
            if (r4 >= r6) goto L1a2
            java.lang.Object r6 = r2.get(r4)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r3.get(r4)
            java.lang.Class r7 = (java.lang.Class) r7
            java.lang.String r7 = r0.getType(r7)
            boolean r14 = r15.contains(r6)
            if (r14 != 0) goto L189
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r18 = r4
            java.lang.String r4 = "ALTER TABLE "
            r14.append(r4)
            r14.append(r1)
            java.lang.String r4 = " ADD COLUMN "
            r14.append(r4)
            r14.append(r6)
            r14.append(r12)
            r14.append(r7)
            java.lang.String r4 = r14.toString()
            r0.f(r4)
            r6 = -1
            goto L19f
        L189:
            r18 = r4
            int r4 = r15.indexOf(r6)
            r6 = -1
            if (r4 == r6) goto L19f
            java.lang.Object r4 = r13.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r7.equals(r4)
            if (r4 != 0) goto L19f
            r5 = 1
        L19f:
            int r4 = r18 + 1
            goto L147
        L1a2:
            if (r5 == 0) goto L251
            cn.bluemobi.dylan.sqlitelibrary.d r4 = h()
            r5 = r20
            java.util.List r4 = r4.query(r5)
            cn.bluemobi.dylan.sqlitelibrary.d r5 = h()
            r5.e(r1)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r11)
            r5.append(r1)
            r5.append(r10)
            java.lang.String r1 = r5.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r5.append(r9)
            java.lang.String r1 = r5.toString()
            r13 = 0
        L1d7:
            int r5 = r2.size()
            if (r13 >= r5) goto L236
            int r5 = r2.size()
            int r5 = r5 + (-1)
            if (r13 == r5) goto L20e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            java.lang.Object r1 = r2.get(r13)
            java.lang.String r1 = (java.lang.String) r1
            r5.append(r1)
            r5.append(r12)
            java.lang.Object r1 = r3.get(r13)
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.String r1 = r0.getType(r1)
            r5.append(r1)
            r5.append(r8)
            java.lang.String r1 = r5.toString()
            goto L233
        L20e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            java.lang.Object r1 = r2.get(r13)
            java.lang.String r1 = (java.lang.String) r1
            r5.append(r1)
            r5.append(r12)
            java.lang.Object r1 = r3.get(r13)
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.String r1 = r0.getType(r1)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
        L233:
            int r13 = r13 + 1
            goto L1d7
        L236:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r1 = r17
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.f(r1)
            cn.bluemobi.dylan.sqlitelibrary.d r1 = h()
            r1.insert(r4)
        L251:
            return
    }

    public <T> int c(java.lang.Class<T> r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.String r4 = cn.bluemobi.dylan.sqlitelibrary.b.d(r4)
            r3.m()     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L1b
            net.sqlcipher.database.SQLiteDatabase r1 = r3.f218c     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L1b
            r2 = 0
            int r4 = r1.delete(r4, r2, r2)     // Catch: java.lang.Throwable -> L16 java.lang.Exception -> L1b
            r3.a()
            return r4
        L16:
            r4 = move-exception
            r3.a()
            throw r4
        L1b:
            r3.a()
            return r0
    }

    public <T> void d(java.lang.Class<T> r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            java.lang.String r3 = cn.bluemobi.dylan.sqlitelibrary.b.d(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DROP TABLE IF EXISTS "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.f(r3)
            return
    }

    public <T> int delete(java.lang.Class<T> r4, int r5) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.String r4 = cn.bluemobi.dylan.sqlitelibrary.b.d(r4)
            r3.m()     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L24
            net.sqlcipher.database.SQLiteDatabase r1 = r3.f218c     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L24
            java.lang.String r2 = "id=?"
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L24
            java.lang.String[] r5 = new java.lang.String[]{r5}     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L24
            int r4 = r1.delete(r4, r2, r5)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L24
            r3.a()
            return r4
        L1f:
            r4 = move-exception
            r3.a()
            throw r4
        L24:
            r3.a()
            return r0
    }

    public <T> int delete(java.lang.Class<T> r3, java.lang.String r4, java.lang.String[] r5) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r3 = cn.bluemobi.dylan.sqlitelibrary.b.d(r3)
            r2.m()     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L1a
            net.sqlcipher.database.SQLiteDatabase r1 = r2.f218c     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L1a
            int r3 = r1.delete(r3, r4, r5)     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L1a
            r2.a()
            return r3
        L15:
            r3 = move-exception
            r2.a()
            throw r3
        L1a:
            r2.a()
            return r0
    }

    public void e(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DROP TABLE IF EXISTS "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.f(r3)
            return
    }

    public void f(java.lang.String r2) {
            r1 = this;
            r1.m()     // Catch: java.lang.Throwable -> Lc java.lang.Throwable -> L11
            net.sqlcipher.database.SQLiteDatabase r0 = r1.f218c     // Catch: java.lang.Throwable -> Lc java.lang.Throwable -> L11
            r0.execSQL(r2)     // Catch: java.lang.Throwable -> Lc java.lang.Throwable -> L11
            r1.a()
            return
        Lc:
            r2 = move-exception
            r1.a()
            throw r2
        L11:
            r1.a()
            return
    }

    public net.sqlcipher.database.SQLiteDatabase i() {
            r1 = this;
            net.sqlcipher.database.SQLiteDatabase r0 = r1.f218c
            return r0
    }

    public <T> long insert(T r4) {
            r3 = this;
            if (r4 != 0) goto L5
            r0 = -1
            return r0
        L5:
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = cn.bluemobi.dylan.sqlitelibrary.b.d(r0)
            android.content.ContentValues r4 = r3.g(r4)
            r3.m()     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L24
            net.sqlcipher.database.SQLiteDatabase r1 = r3.f218c     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L24
            r2 = 0
            long r0 = r1.insert(r0, r2, r4)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L24
            r3.a()
            return r0
        L1f:
            r4 = move-exception
            r3.a()
            throw r4
        L24:
            r3.a()
            r0 = 0
            return r0
    }

    public <T> void insert(java.util.List<T> r5) {
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            r4.m()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L33
            net.sqlcipher.database.SQLiteDatabase r0 = r4.f218c     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L33
            r0.beginTransaction()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L33
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L33
        Lf:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L33
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r5.next()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L33
            java.lang.Class r1 = r0.getClass()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L33
            java.lang.String r1 = cn.bluemobi.dylan.sqlitelibrary.b.d(r1)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L33
            android.content.ContentValues r0 = r4.g(r0)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L33
            net.sqlcipher.database.SQLiteDatabase r2 = r4.f218c     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L33
            r3 = 0
            r2.insert(r1, r3, r0)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L33
            goto Lf
        L2c:
            r5 = move-exception
            goto L3c
        L2e:
            net.sqlcipher.database.SQLiteDatabase r5 = r4.f218c     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L33
            r5.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L33
        L33:
            net.sqlcipher.database.SQLiteDatabase r5 = r4.f218c
            r5.endTransaction()
            r4.a()
            return
        L3c:
            net.sqlcipher.database.SQLiteDatabase r0 = r4.f218c
            r0.endTransaction()
            r4.a()
            throw r5
    }

    public int j() {
            r1 = this;
            r1.m()     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> L12
            net.sqlcipher.database.SQLiteDatabase r0 = r1.f218c     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> L12
            int r0 = r0.getVersion()     // Catch: java.lang.Throwable -> Ld java.lang.Exception -> L12
            r1.a()
            return r0
        Ld:
            r0 = move-exception
            r1.a()
            throw r0
        L12:
            r1.a()
            r0 = -1
            return r0
    }

    public void n(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.p(r2, r0, r0)
            return
    }

    public void o(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            r0 = 0
            java.lang.String r1 = ""
            r2.q(r3, r0, r4, r1)
            return
    }

    public void p(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r0 = 0
            r1.q(r2, r0, r3, r4)
            return
    }

    public void q(android.content.Context r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.f219d = r1
            r0.f220e = r2
            r0.f221f = r3
            r0.f222g = r4
            java.io.File r1 = cn.bluemobi.dylan.sqlitelibrary.e.c(r1, r2, r3)     // Catch: java.lang.Exception -> L1f
            java.lang.String r1 = r1.getPath()     // Catch: java.lang.Exception -> L1f
            char[] r2 = r4.toCharArray()     // Catch: java.lang.Exception -> L1f
            byte[] r2 = net.sqlcipher.database.SQLiteDatabase.getBytes(r2)     // Catch: java.lang.Exception -> L1f
            r3 = 0
            net.sqlcipher.database.SQLiteDatabase r1 = net.sqlcipher.database.SQLiteDatabase.openOrCreateDatabase(r1, r2, r3, r3)     // Catch: java.lang.Exception -> L1f
            r0.f218c = r1     // Catch: java.lang.Exception -> L1f
        L1f:
            return
    }

    public <T> T query(java.lang.Class<T> r11, int r12) {
            r10 = this;
            r1 = 0
            if (r11 != 0) goto L4
            return r1
        L4:
            java.lang.String r3 = cn.bluemobi.dylan.sqlitelibrary.b.d(r11)
            r10.m()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
            net.sqlcipher.database.SQLiteDatabase r2 = r10.f218c     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
            java.lang.String r5 = "id=?"
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
            java.lang.String[] r6 = new java.lang.String[]{r12}     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
            r8 = 0
            r9 = 0
            r4 = 0
            r7 = 0
            net.sqlcipher.Cursor r12 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
            if (r12 != 0) goto L2a
            if (r12 == 0) goto L26
            r12.close()
        L26:
            r10.a()
            return r1
        L2a:
            boolean r0 = r12.moveToNext()     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3f
            if (r0 == 0) goto L41
            java.lang.Object r11 = r10.l(r11, r12)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3f
            r12.close()
            r10.a()
            return r11
        L3b:
            r0 = move-exception
            r11 = r0
            r1 = r12
            goto L51
        L3f:
            goto L5a
        L41:
            r12.close()     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3f
        L44:
            r12.close()
        L47:
            r10.a()
            goto L5d
        L4b:
            r0 = move-exception
            r11 = r0
            goto L51
        L4e:
            r12 = r1
            goto L5a
        L51:
            if (r1 == 0) goto L56
            r1.close()
        L56:
            r10.a()
            throw r11
        L5a:
            if (r12 == 0) goto L47
            goto L44
        L5d:
            return r1
    }

    public <T> java.util.List<T> query(java.lang.Class<T> r11) {
            r10 = this;
            r1 = 0
            if (r11 != 0) goto L7
            r10.a()
            return r1
        L7:
            r10.m()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            java.lang.String r3 = cn.bluemobi.dylan.sqlitelibrary.b.d(r11)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            net.sqlcipher.database.SQLiteDatabase r2 = r10.f218c     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            r8 = 0
            r9 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            net.sqlcipher.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            if (r2 != 0) goto L25
            if (r2 == 0) goto L21
            r2.close()
        L21:
            r10.a()
            return r1
        L25:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L46
            r0.<init>()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L46
        L2a:
            boolean r1 = r2.moveToNext()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3c
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r10.l(r11, r2)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3c
            r0.add(r1)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3c
            goto L2a
        L38:
            r0 = move-exception
            r11 = r0
            r1 = r2
            goto L4f
        L3c:
        L3d:
            r1 = r2
            goto L58
        L3f:
            r2.close()
            r10.a()
            return r0
        L46:
            r0 = r1
            goto L3d
        L49:
            r0 = move-exception
            r11 = r0
            goto L4f
        L4c:
            r0 = r1
            goto L58
        L4f:
            if (r1 == 0) goto L54
            r1.close()
        L54:
            r10.a()
            throw r11
        L58:
            if (r1 == 0) goto L5d
            r1.close()
        L5d:
            r10.a()
            return r0
    }

    public <T> java.util.List<T> query(java.lang.Class<T> r11, java.lang.String r12, java.lang.String[] r13) {
            r10 = this;
            r1 = 0
            if (r11 != 0) goto L4
            return r1
        L4:
            java.lang.String r3 = cn.bluemobi.dylan.sqlitelibrary.b.d(r11)
            r10.m()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            net.sqlcipher.database.SQLiteDatabase r2 = r10.f218c     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            r8 = 0
            r9 = 0
            r4 = 0
            r7 = 0
            r5 = r12
            r6 = r13
            net.sqlcipher.Cursor r12 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            if (r12 != 0) goto L22
            if (r12 == 0) goto L1e
            r12.close()
        L1e:
            r10.a()
            return r1
        L22:
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L46
            r13.<init>()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L46
        L27:
            boolean r0 = r12.moveToNext()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L39
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r10.l(r11, r12)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L39
            r13.add(r0)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L39
            goto L27
        L35:
            r0 = move-exception
            r11 = r0
            r1 = r12
            goto L4f
        L39:
        L3a:
            r1 = r12
            goto L58
        L3c:
            r12.close()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L39
            r12.close()
            r10.a()
            return r13
        L46:
            r13 = r1
            goto L3a
        L49:
            r0 = move-exception
            r11 = r0
            goto L4f
        L4c:
            r13 = r1
            goto L58
        L4f:
            if (r1 == 0) goto L54
            r1.close()
        L54:
            r10.a()
            throw r11
        L58:
            if (r1 == 0) goto L5d
            r1.close()
        L5d:
            r10.a()
            return r13
    }

    public <T> java.util.List<T> query(java.lang.Class<T> r12, java.lang.String[] r13, java.lang.String r14, java.lang.String[] r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19) {
            r11 = this;
            r1 = 0
            if (r12 != 0) goto L7
            r11.a()
            return r1
        L7:
            r11.m()     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            java.lang.String r3 = cn.bluemobi.dylan.sqlitelibrary.b.d(r12)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            net.sqlcipher.database.SQLiteDatabase r2 = r11.f218c     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            net.sqlcipher.Cursor r13 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            if (r13 != 0) goto L2a
            if (r13 == 0) goto L26
            r13.close()
        L26:
            r11.a()
            return r1
        L2a:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L4b
            r14.<init>()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L4b
        L2f:
            boolean r15 = r13.moveToNext()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L41
            if (r15 == 0) goto L44
            java.lang.Object r15 = r11.l(r12, r13)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L41
            r14.add(r15)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L41
            goto L2f
        L3d:
            r0 = move-exception
            r12 = r0
            r1 = r13
            goto L54
        L41:
        L42:
            r1 = r13
            goto L5d
        L44:
            r13.close()
            r11.a()
            return r14
        L4b:
            r14 = r1
            goto L42
        L4e:
            r0 = move-exception
            r12 = r0
            goto L54
        L51:
            r14 = r1
            goto L5d
        L54:
            if (r1 == 0) goto L59
            r1.close()
        L59:
            r11.a()
            throw r12
        L5d:
            if (r1 == 0) goto L62
            r1.close()
        L62:
            r11.a()
            return r14
    }

    @android.annotation.TargetApi(16)
    public java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r(java.lang.String r11) {
            r10 = this;
            r0 = 0
            r10.m()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L64
            net.sqlcipher.database.SQLiteDatabase r1 = r10.f218c     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L64
            net.sqlcipher.Cursor r11 = r1.rawQuery(r11, r0)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L64
            if (r11 != 0) goto L15
            if (r11 == 0) goto L11
            r11.close()
        L11:
            r10.a()
            return r0
        L15:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L5c
            r1.<init>()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L5c
        L1a:
            boolean r0 = r11.moveToNext()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            if (r0 == 0) goto L55
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r0.<init>()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String[] r2 = r11.getColumnNames()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            int r3 = r2.length     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r4 = 0
        L2b:
            if (r4 >= r3) goto L51
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            int r6 = r11.getColumnIndex(r5)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            int r7 = r11.getType(r6)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r8 = 4
            if (r7 != r8) goto L47
            byte[] r6 = r11.getBlob(r6)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r0.put(r5, r6)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            goto L4e
        L42:
            r0 = move-exception
            goto L67
        L44:
        L45:
            r0 = r11
            goto L70
        L47:
            java.lang.String r6 = r11.getString(r6)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r0.put(r5, r6)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
        L4e:
            int r4 = r4 + 1
            goto L2b
        L51:
            r1.add(r0)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            goto L1a
        L55:
            r11.close()
            r10.a()
            return r1
        L5c:
            r1 = r0
            goto L45
        L5f:
            r11 = move-exception
            r9 = r0
            r0 = r11
            r11 = r9
            goto L67
        L64:
            r1 = r0
            goto L70
        L67:
            if (r11 == 0) goto L6c
            r11.close()
        L6c:
            r10.a()
            throw r0
        L70:
            if (r0 == 0) goto L75
            r0.close()
        L75:
            r10.a()
            return r1
    }

    public <T> int update(T r5, int r6) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.Class r1 = r5.getClass()     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2c
            java.lang.String r1 = cn.bluemobi.dylan.sqlitelibrary.b.d(r1)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2c
            android.content.ContentValues r5 = r4.g(r5)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2c
            r4.m()     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2c
            net.sqlcipher.database.SQLiteDatabase r2 = r4.f218c     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2c
            java.lang.String r3 = "id=?"
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2c
            java.lang.String[] r6 = new java.lang.String[]{r6}     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2c
            int r5 = r2.update(r1, r5, r3, r6)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2c
            r4.a()
            return r5
        L27:
            r5 = move-exception
            r4.a()
            throw r5
        L2c:
            r4.a()
            return r0
    }

    public <T> int update(T r3, java.lang.String r4, java.lang.String[] r5) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = -1
            return r3
        L4:
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = cn.bluemobi.dylan.sqlitelibrary.b.d(r0)
            android.content.ContentValues r3 = r2.g(r3)
            r2.m()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L22
            net.sqlcipher.database.SQLiteDatabase r1 = r2.f218c     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L22
            int r3 = r1.update(r0, r3, r4, r5)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L22
            r2.a()
            return r3
        L1d:
            r3 = move-exception
            r2.a()
            throw r3
        L22:
            r2.a()
            r3 = 0
            return r3
    }
}
