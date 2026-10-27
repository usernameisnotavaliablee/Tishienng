package com.bxkj.base.v2.data.spp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class b {
    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.net.Uri a(android.content.Context r2, int r3, java.lang.String r4, java.lang.String r5, java.lang.Object r6) {
            java.lang.String r0 = com.bxkj.base.v2.data.spp.PreferencesProvider.k
            java.lang.String r1 = com.bxkj.base.v2.data.spp.PreferencesProvider.j
            java.lang.String r2 = com.bxkj.base.v2.data.spp.c.j(r2, r0, r1)
            java.lang.String r0 = "content://"
            java.lang.String r1 = "/"
            switch(r3) {
                case 100: goto Lec;
                case 101: goto Lc4;
                case 102: goto L9c;
                case 103: goto Lf;
                case 104: goto L74;
                case 105: goto L4c;
                case 106: goto L2a;
                case 107: goto L11;
                default: goto Lf;
            }
        Lf:
            r2 = 0
            return r2
        L11:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r2)
            java.lang.String r2 = "/puts"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            return r2
        L2a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r2)
            java.lang.String r2 = "/delete/"
            r3.append(r2)
            r3.append(r4)
            r3.append(r1)
            r3.append(r5)
            java.lang.String r2 = r3.toString()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            return r2
        L4c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r2)
            java.lang.String r2 = "/boolean/"
            r3.append(r2)
            r3.append(r4)
            r3.append(r1)
            r3.append(r5)
            r3.append(r1)
            r3.append(r6)
            java.lang.String r2 = r3.toString()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            return r2
        L74:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r2)
            java.lang.String r2 = "/float/"
            r3.append(r2)
            r3.append(r4)
            r3.append(r1)
            r3.append(r5)
            r3.append(r1)
            r3.append(r6)
            java.lang.String r2 = r3.toString()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            return r2
        L9c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r2)
            java.lang.String r2 = "/long/"
            r3.append(r2)
            r3.append(r4)
            r3.append(r1)
            r3.append(r5)
            r3.append(r1)
            r3.append(r6)
            java.lang.String r2 = r3.toString()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            return r2
        Lc4:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r2)
            java.lang.String r2 = "/integer/"
            r3.append(r2)
            r3.append(r4)
            r3.append(r1)
            r3.append(r5)
            r3.append(r1)
            r3.append(r6)
            java.lang.String r2 = r3.toString()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            return r2
        Lec:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r2)
            java.lang.String r2 = "/string/"
            r3.append(r2)
            r3.append(r4)
            r3.append(r1)
            r3.append(r5)
            r3.append(r1)
            r3.append(r6)
            java.lang.String r2 = r3.toString()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            return r2
    }

    public static boolean b(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            r0 = 0
            boolean r1 = c(r1, r2, r3, r0)
            return r1
    }

    public static boolean c(android.content.Context r8, java.lang.String r9, java.lang.String r10, boolean r11) {
            r0 = 105(0x69, float:1.47E-43)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r11)
            android.net.Uri r3 = a(r8, r0, r9, r10, r1)
            android.content.ContentResolver r2 = r8.getContentResolver()
            r6 = 0
            r7 = 0
            r4 = 0
            r5 = 0
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)
            if (r8 != 0) goto L19
            goto L32
        L19:
            boolean r9 = r8.moveToNext()
            if (r9 == 0) goto L32
            java.lang.String r9 = com.bxkj.base.v2.data.spp.PreferencesProvider.i
            int r9 = r8.getColumnIndex(r9)
            java.lang.String r8 = r8.getString(r9)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            boolean r8 = r8.booleanValue()
            return r8
        L32:
            return r11
    }

    public static float d(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r1 = e(r1, r2, r3, r0)
            return r1
    }

    public static float e(android.content.Context r8, java.lang.String r9, java.lang.String r10, float r11) {
            r0 = 104(0x68, float:1.46E-43)
            java.lang.Float r1 = java.lang.Float.valueOf(r11)
            android.net.Uri r3 = a(r8, r0, r9, r10, r1)
            android.content.ContentResolver r2 = r8.getContentResolver()
            r6 = 0
            r7 = 0
            r4 = 0
            r5 = 0
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)
            if (r8 != 0) goto L19
            goto L2a
        L19:
            boolean r9 = r8.moveToNext()
            if (r9 == 0) goto L2a
            java.lang.String r9 = com.bxkj.base.v2.data.spp.PreferencesProvider.i
            int r9 = r8.getColumnIndex(r9)
            float r8 = r8.getFloat(r9)
            return r8
        L2a:
            return r11
    }

    public static int f(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            r0 = -1
            int r1 = g(r1, r2, r3, r0)
            return r1
    }

    public static int g(android.content.Context r8, java.lang.String r9, java.lang.String r10, int r11) {
            r0 = 101(0x65, float:1.42E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            android.net.Uri r3 = a(r8, r0, r9, r10, r1)
            android.content.ContentResolver r2 = r8.getContentResolver()
            r6 = 0
            r7 = 0
            r4 = 0
            r5 = 0
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)
            if (r8 != 0) goto L19
            goto L2a
        L19:
            boolean r9 = r8.moveToNext()
            if (r9 == 0) goto L2a
            java.lang.String r9 = com.bxkj.base.v2.data.spp.PreferencesProvider.i
            int r9 = r8.getColumnIndex(r9)
            int r8 = r8.getInt(r9)
            return r8
        L2a:
            return r11
    }

    public static long h(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            r0 = -1
            long r2 = i(r2, r3, r4, r0)
            return r2
    }

    public static long i(android.content.Context r8, java.lang.String r9, java.lang.String r10, long r11) {
            r0 = 102(0x66, float:1.43E-43)
            java.lang.Long r1 = java.lang.Long.valueOf(r11)
            android.net.Uri r3 = a(r8, r0, r9, r10, r1)
            android.content.ContentResolver r2 = r8.getContentResolver()
            r6 = 0
            r7 = 0
            r4 = 0
            r5 = 0
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)
            if (r8 != 0) goto L19
            goto L2a
        L19:
            boolean r9 = r8.moveToNext()
            if (r9 == 0) goto L2a
            java.lang.String r9 = com.bxkj.base.v2.data.spp.PreferencesProvider.i
            int r9 = r8.getColumnIndex(r9)
            long r8 = r8.getLong(r9)
            return r8
        L2a:
            return r11
    }

    public static java.lang.String j(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            java.lang.String r0 = ""
            java.lang.String r1 = k(r1, r2, r3, r0)
            return r1
    }

    public static java.lang.String k(android.content.Context r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            r0 = 100
            android.net.Uri r2 = a(r7, r0, r8, r9, r10)
            android.content.ContentResolver r1 = r7.getContentResolver()
            r5 = 0
            r6 = 0
            r3 = 0
            r4 = 0
            android.database.Cursor r7 = r1.query(r2, r3, r4, r5, r6)
            if (r7 != 0) goto L15
            goto L26
        L15:
            boolean r8 = r7.moveToNext()
            if (r8 == 0) goto L26
            java.lang.String r8 = com.bxkj.base.v2.data.spp.PreferencesProvider.i
            int r8 = r7.getColumnIndex(r8)
            java.lang.String r7 = r7.getString(r8)
            return r7
        L26:
            return r10
    }

    public static boolean l(android.content.Context r2, java.lang.String r3, android.content.ContentValues r4) {
            r0 = 107(0x6b, float:1.5E-43)
            r1 = 0
            android.net.Uri r3 = a(r2, r0, r3, r1, r1)
            android.content.ContentResolver r2 = r2.getContentResolver()
            r2.insert(r3, r4)     // Catch: java.lang.Exception -> L10
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }

    public static boolean m(android.content.Context r2, java.lang.String r3, java.lang.String r4, boolean r5) {
            r0 = 105(0x69, float:1.47E-43)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            android.net.Uri r3 = a(r2, r0, r3, r4, r1)
            android.content.ContentResolver r2 = r2.getContentResolver()
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch: java.lang.Exception -> L1f
            r0.<init>()     // Catch: java.lang.Exception -> L1f
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Exception -> L1f
            r0.put(r4, r5)     // Catch: java.lang.Exception -> L1f
            r2.insert(r3, r0)     // Catch: java.lang.Exception -> L1f
            r2 = 1
            return r2
        L1f:
            r2 = 0
            return r2
    }

    public static boolean n(android.content.Context r2, java.lang.String r3, java.lang.String r4, float r5) {
            r0 = 104(0x68, float:1.46E-43)
            java.lang.Float r1 = java.lang.Float.valueOf(r5)
            android.net.Uri r3 = a(r2, r0, r3, r4, r1)
            android.content.ContentResolver r2 = r2.getContentResolver()
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch: java.lang.Exception -> L1f
            r0.<init>()     // Catch: java.lang.Exception -> L1f
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch: java.lang.Exception -> L1f
            r0.put(r4, r5)     // Catch: java.lang.Exception -> L1f
            r2.insert(r3, r0)     // Catch: java.lang.Exception -> L1f
            r2 = 1
            return r2
        L1f:
            r2 = 0
            return r2
    }

    public static boolean o(android.content.Context r2, java.lang.String r3, java.lang.String r4, int r5) {
            r0 = 101(0x65, float:1.42E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            android.net.Uri r3 = a(r2, r0, r3, r4, r1)
            android.content.ContentResolver r2 = r2.getContentResolver()
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch: java.lang.Exception -> L1f
            r0.<init>()     // Catch: java.lang.Exception -> L1f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L1f
            r0.put(r4, r5)     // Catch: java.lang.Exception -> L1f
            r2.insert(r3, r0)     // Catch: java.lang.Exception -> L1f
            r2 = 1
            return r2
        L1f:
            r2 = 0
            return r2
    }

    public static boolean p(android.content.Context r2, java.lang.String r3, java.lang.String r4, long r5) {
            r0 = 102(0x66, float:1.43E-43)
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            android.net.Uri r3 = a(r2, r0, r3, r4, r1)
            android.content.ContentResolver r2 = r2.getContentResolver()
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch: java.lang.Exception -> L1f
            r0.<init>()     // Catch: java.lang.Exception -> L1f
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Exception -> L1f
            r0.put(r4, r5)     // Catch: java.lang.Exception -> L1f
            r2.insert(r3, r0)     // Catch: java.lang.Exception -> L1f
            r2 = 1
            return r2
        L1f:
            r2 = 0
            return r2
    }

    public static boolean q(android.content.Context r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = 100
            android.net.Uri r2 = a(r1, r0, r2, r3, r4)
            android.content.ContentResolver r1 = r1.getContentResolver()
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch: java.lang.Exception -> L17
            r0.<init>()     // Catch: java.lang.Exception -> L17
            r0.put(r3, r4)     // Catch: java.lang.Exception -> L17
            r1.insert(r2, r0)     // Catch: java.lang.Exception -> L17
            r1 = 1
            return r1
        L17:
            r1 = 0
            return r1
    }

    public static boolean r(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            r0 = 106(0x6a, float:1.49E-43)
            r1 = 0
            android.net.Uri r3 = a(r2, r0, r3, r4, r1)     // Catch: java.lang.Exception -> L10
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Exception -> L10
            r2.delete(r3, r1, r1)     // Catch: java.lang.Exception -> L10
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }
}
