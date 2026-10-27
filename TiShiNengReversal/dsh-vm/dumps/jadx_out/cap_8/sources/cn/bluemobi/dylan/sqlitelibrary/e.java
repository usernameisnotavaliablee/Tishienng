package cn.bluemobi.dylan.sqlitelibrary;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class e {
    public e() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(java.io.File r5, java.io.File r6, java.lang.String r7) {
            r0 = 0
            net.sqlcipher.database.SQLiteDatabase r5 = net.sqlcipher.database.SQLiteDatabase.openOrCreateDatabase(r5, r7, r0)     // Catch: java.lang.Exception -> L86
            java.lang.String r7 = r6.getName()     // Catch: java.lang.Exception -> L86
            java.lang.String r1 = r6.getName()     // Catch: java.lang.Exception -> L86
            java.lang.String r2 = "."
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Exception -> L86
            r2 = 0
            if (r1 == 0) goto L22
            java.lang.String r7 = r6.getName()     // Catch: java.lang.Exception -> L86
            java.lang.String r1 = "\\."
            java.lang.String[] r7 = r7.split(r1)     // Catch: java.lang.Exception -> L86
            r7 = r7[r2]     // Catch: java.lang.Exception -> L86
        L22:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L86
            r1.<init>()     // Catch: java.lang.Exception -> L86
            java.lang.String r3 = "ATTACH DATABASE '%s' as "
            r1.append(r3)     // Catch: java.lang.Exception -> L86
            r1.append(r7)     // Catch: java.lang.Exception -> L86
            java.lang.String r3 = " KEY '';"
            r1.append(r3)     // Catch: java.lang.Exception -> L86
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L86
            java.lang.String r3 = r6.getAbsolutePath()     // Catch: java.lang.Exception -> L86
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L86
            r4[r2] = r3     // Catch: java.lang.Exception -> L86
            java.lang.String r1 = java.lang.String.format(r1, r4)     // Catch: java.lang.Exception -> L86
            r5.rawExecSQL(r1)     // Catch: java.lang.Exception -> L86
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L86
            r1.<init>()     // Catch: java.lang.Exception -> L86
            java.lang.String r2 = "SELECT sqlcipher_export('"
            r1.append(r2)     // Catch: java.lang.Exception -> L86
            r1.append(r7)     // Catch: java.lang.Exception -> L86
            java.lang.String r2 = "');"
            r1.append(r2)     // Catch: java.lang.Exception -> L86
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L86
            r5.rawExecSQL(r1)     // Catch: java.lang.Exception -> L86
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L86
            r1.<init>()     // Catch: java.lang.Exception -> L86
            java.lang.String r2 = "DETACH DATABASE "
            r1.append(r2)     // Catch: java.lang.Exception -> L86
            r1.append(r7)     // Catch: java.lang.Exception -> L86
            java.lang.String r7 = ";"
            r1.append(r7)     // Catch: java.lang.Exception -> L86
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Exception -> L86
            r5.rawExecSQL(r7)     // Catch: java.lang.Exception -> L86
            java.lang.String r7 = ""
            net.sqlcipher.database.SQLiteDatabase r6 = net.sqlcipher.database.SQLiteDatabase.openOrCreateDatabase(r6, r7, r0)     // Catch: java.lang.Exception -> L86
            r6.close()     // Catch: java.lang.Exception -> L86
            r5.close()     // Catch: java.lang.Exception -> L86
        L86:
            return
    }

    public static void b(java.io.File r6, java.io.File r7, java.lang.String r8) {
            java.lang.String r0 = ""
            r1 = 0
            net.sqlcipher.database.SQLiteDatabase r7 = net.sqlcipher.database.SQLiteDatabase.openOrCreateDatabase(r7, r0, r1)     // Catch: java.lang.Exception -> L91
            java.lang.String r0 = r6.getName()     // Catch: java.lang.Exception -> L91
            java.lang.String r2 = "."
            boolean r2 = r0.contains(r2)     // Catch: java.lang.Exception -> L91
            r3 = 0
            if (r2 == 0) goto L20
            java.lang.String r0 = r6.getName()     // Catch: java.lang.Exception -> L91
            java.lang.String r2 = "\\."
            java.lang.String[] r0 = r0.split(r2)     // Catch: java.lang.Exception -> L91
            r0 = r0[r3]     // Catch: java.lang.Exception -> L91
        L20:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L91
            r2.<init>()     // Catch: java.lang.Exception -> L91
            java.lang.String r4 = "ATTACH DATABASE '%s' as "
            r2.append(r4)     // Catch: java.lang.Exception -> L91
            r2.append(r0)     // Catch: java.lang.Exception -> L91
            java.lang.String r4 = " KEY '"
            r2.append(r4)     // Catch: java.lang.Exception -> L91
            r2.append(r8)     // Catch: java.lang.Exception -> L91
            java.lang.String r4 = "';"
            r2.append(r4)     // Catch: java.lang.Exception -> L91
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L91
            java.lang.String r4 = r6.getAbsolutePath()     // Catch: java.lang.Exception -> L91
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L91
            r5[r3] = r4     // Catch: java.lang.Exception -> L91
            java.lang.String r2 = java.lang.String.format(r2, r5)     // Catch: java.lang.Exception -> L91
            r7.rawExecSQL(r2)     // Catch: java.lang.Exception -> L91
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L91
            r2.<init>()     // Catch: java.lang.Exception -> L91
            java.lang.String r3 = "SELECT sqlcipher_export('"
            r2.append(r3)     // Catch: java.lang.Exception -> L91
            r2.append(r0)     // Catch: java.lang.Exception -> L91
            java.lang.String r3 = "');"
            r2.append(r3)     // Catch: java.lang.Exception -> L91
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L91
            r7.rawExecSQL(r2)     // Catch: java.lang.Exception -> L91
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L91
            r2.<init>()     // Catch: java.lang.Exception -> L91
            java.lang.String r3 = "DETACH DATABASE "
            r2.append(r3)     // Catch: java.lang.Exception -> L91
            r2.append(r0)     // Catch: java.lang.Exception -> L91
            java.lang.String r0 = ";"
            r2.append(r0)     // Catch: java.lang.Exception -> L91
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> L91
            r7.rawExecSQL(r0)     // Catch: java.lang.Exception -> L91
            net.sqlcipher.database.SQLiteDatabase r6 = net.sqlcipher.database.SQLiteDatabase.openOrCreateDatabase(r6, r8, r1)     // Catch: java.lang.Exception -> L91
            int r8 = r7.getVersion()     // Catch: java.lang.Exception -> L91
            r6.setVersion(r8)     // Catch: java.lang.Exception -> L91
            r6.close()     // Catch: java.lang.Exception -> L91
            r7.close()     // Catch: java.lang.Exception -> L91
        L91:
            return
    }

    public static java.io.File c(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L20
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "/data/data/"
            r2.append(r0)
            java.lang.String r1 = r1.getPackageName()
            r2.append(r1)
            java.lang.String r1 = "/databases/"
            r2.append(r1)
            java.lang.String r2 = r2.toString()
        L20:
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto L28
            java.lang.String r3 = "mydb.db"
        L28:
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r3)
            java.io.File r2 = r1.getParentFile()
            boolean r2 = r2.exists()
            if (r2 != 0) goto L3a
            r1.mkdirs()
        L3a:
            return r1
    }

    public static void d(android.content.Context r0, java.io.File r1, java.io.File r2, java.lang.String r3) {
            boolean r0 = r1.exists()
            if (r0 == 0) goto Lc
            b(r2, r1, r3)
            r1.delete()
        Lc:
            return
    }
}
