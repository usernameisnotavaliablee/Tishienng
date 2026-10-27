package com.bytedance.j.xt.xt.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class a<T> {
    protected final java.lang.String a;
    protected final java.lang.String b;

    protected a(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "_id"
            r1.a = r0
            r1.b = r2
            return
    }

    protected abstract android.content.ContentValues a(T r1);

    protected abstract java.util.HashMap<java.lang.String, java.lang.String> b();

    public void c(android.database.sqlite.SQLiteDatabase r6) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L45
            r0.<init>()     // Catch: java.lang.Exception -> L45
            java.lang.String r1 = "CREATE TABLE "
            r0.append(r1)     // Catch: java.lang.Exception -> L45
            java.lang.String r1 = r5.b     // Catch: java.lang.Exception -> L45
            r0.append(r1)     // Catch: java.lang.Exception -> L45
            java.lang.String r1 = " (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
            r0.append(r1)     // Catch: java.lang.Exception -> L45
            java.util.HashMap r1 = r5.b()     // Catch: java.lang.Exception -> L45
            if (r1 == 0) goto L60
            java.util.Set r2 = r1.keySet()     // Catch: java.lang.Exception -> L45
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> L45
        L22:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Exception -> L45
            if (r3 == 0) goto L47
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Exception -> L45
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L45
            r0.append(r3)     // Catch: java.lang.Exception -> L45
            java.lang.String r4 = " "
            r0.append(r4)     // Catch: java.lang.Exception -> L45
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Exception -> L45
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L45
            r0.append(r3)     // Catch: java.lang.Exception -> L45
            java.lang.String r3 = ","
            r0.append(r3)     // Catch: java.lang.Exception -> L45
            goto L22
        L45:
            r6 = move-exception
            goto L61
        L47:
            int r1 = r0.length()     // Catch: java.lang.Exception -> L45
            int r1 = r1 + (-1)
            int r2 = r0.length()     // Catch: java.lang.Exception -> L45
            r0.delete(r1, r2)     // Catch: java.lang.Exception -> L45
            java.lang.String r1 = ")"
            r0.append(r1)     // Catch: java.lang.Exception -> L45
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L45
            r6.execSQL(r0)     // Catch: java.lang.Exception -> L45
        L60:
            return
        L61:
            com.bytedance.sdk.component.utils.vl.j(r6)
            return
    }

    public void insert(android.database.sqlite.SQLiteDatabase r3, T r4) {
            r2 = this;
            if (r3 == 0) goto L13
            if (r4 == 0) goto L13
            java.lang.String r0 = r2.b     // Catch: java.lang.Exception -> Lf
            android.content.ContentValues r4 = r2.a(r4)     // Catch: java.lang.Exception -> Lf
            r1 = 0
            r3.insert(r0, r1, r4)     // Catch: java.lang.Exception -> Lf
            return
        Lf:
            r3 = move-exception
            com.bytedance.j.xt.tl.i.c(r3)
        L13:
            return
    }
}
