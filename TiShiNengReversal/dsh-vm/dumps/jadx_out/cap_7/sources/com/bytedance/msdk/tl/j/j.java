package com.bytedance.msdk.tl.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class j extends android.database.sqlite.SQLiteOpenHelper {
    public static java.lang.String j = "j";

    static {
            return
    }

    public j(@androidx.annotation.Nullable android.content.Context r4) {
            r3 = this;
            com.bytedance.sdk.openadsdk.api.plugin.j r0 = new com.bytedance.sdk.openadsdk.api.plugin.j
            r0.<init>(r4)
            r4 = 0
            r1 = 1
            java.lang.String r2 = "mediation_behavior.db"
            r3.<init>(r0, r2, r4, r1)
            return
    }

    private void j(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS gromore_prime_rit_adn_perform (id INTEGER PRIMARY KEY AUTOINCREMENT, adn_name TEXT NOT NULL , prime_rit TEXT NOT NULL , adn_rit TEXT NOT NULL ,ad_action TEXT NOT NULL ,time_stamp LONG DEFAULT 0)"
            r2.execSQL(r0)
            return
    }

    private void xt(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            java.lang.String r0 = "DROP TABLE IF EXISTS gromore_prime_rit_adn_perform ;"
            r2.execSQL(r0)
            return
    }

    public android.database.Cursor j(java.lang.String r9, java.lang.String[] r10) {
            r8 = this;
            android.database.sqlite.SQLiteDatabase r0 = r8.getReadableDatabase()
            r6 = 0
            r7 = 0
            java.lang.String r1 = "gromore_prime_rit_adn_perform"
            r2 = 0
            r5 = 0
            r3 = r9
            r4 = r10
            android.database.Cursor r9 = r0.query(r1, r2, r3, r4, r5, r6, r7)
            return r9
    }

    public void j(android.content.ContentValues r12) {
            r11 = this;
            if (r12 == 0) goto L4c
            java.lang.String r0 = "adn_name"
            java.lang.String r1 = r12.getAsString(r0)
            java.lang.String r2 = "prime_rit"
            java.lang.String r3 = r12.getAsString(r2)
            java.lang.String r4 = "adn_rit"
            java.lang.String r5 = r12.getAsString(r4)
            java.lang.String r6 = "ad_action"
            java.lang.String r7 = r12.getAsString(r6)
            java.lang.String r8 = "time_stamp"
            java.lang.Long r12 = r12.getAsLong(r8)
            r12.longValue()
            android.database.sqlite.SQLiteDatabase r9 = r11.getWritableDatabase()
            android.content.ContentValues r10 = new android.content.ContentValues
            r10.<init>()
            r10.put(r0, r1)
            r10.put(r2, r3)
            r10.put(r4, r5)
            r10.put(r6, r7)
            r10.put(r8, r12)
            if (r9 == 0) goto L4c
            boolean r12 = r9.isOpen()     // Catch: java.lang.IllegalStateException -> L4c
            if (r12 == 0) goto L4c
            java.lang.String r12 = "gromore_prime_rit_adn_perform"
            r0 = 0
            r9.insert(r12, r0, r10)     // Catch: java.lang.IllegalStateException -> L4c
            r9.close()     // Catch: java.lang.IllegalStateException -> L4c
        L4c:
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase r1) {
            r0 = this;
            r0.j(r1)     // Catch: java.lang.Throwable -> L3
        L3:
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r4, int r5, int r6) {
            r3 = this;
            java.lang.String r0 = com.bytedance.msdk.tl.j.j.j     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "onUpgrade....Database version upgrade.....old:"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2e
            r1.append(r5)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = ",new:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L2e
            r1.append(r6)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2e
            com.bytedance.msdk.j.up.cw.j(r0, r1)     // Catch: java.lang.Throwable -> L2e
            if (r5 <= r6) goto L2b
            r3.xt(r4)     // Catch: java.lang.Throwable -> L2e
            r3.j(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = com.bytedance.msdk.tl.j.j.j     // Catch: java.lang.Throwable -> L2e
            java.lang.String r5 = "onUpgrade...Reverse installation Database reset - create table....."
            com.bytedance.msdk.j.up.cw.j(r4, r5)     // Catch: java.lang.Throwable -> L2e
            return
        L2b:
            r3.j(r4)     // Catch: java.lang.Throwable -> L2e
        L2e:
            return
    }

    public void xt(java.lang.String r3, java.lang.String[] r4) {
            r2 = this;
            android.database.sqlite.SQLiteDatabase r0 = r2.getWritableDatabase()
            java.lang.String r1 = "gromore_prime_rit_adn_perform"
            r0.delete(r1, r3, r4)
            r0.close()
            return
    }
}
