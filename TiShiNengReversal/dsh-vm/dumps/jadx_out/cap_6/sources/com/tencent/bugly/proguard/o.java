package com.tencent.bugly.proguard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class o {
    public int id;
    public java.lang.String moduleName;
    public java.lang.String version;
    public java.lang.String versionKey;

    public o() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract java.lang.String[] getTables();

    public abstract void init(android.content.Context r1, boolean r2, com.tencent.bugly.BuglyStrategy r3);

    public void onDbCreate(android.database.sqlite.SQLiteDatabase r1) {
            r0 = this;
            return
    }

    public void onDbDowngrade(android.database.sqlite.SQLiteDatabase r4, int r5, int r6) {
            r3 = this;
            java.lang.String[] r5 = r3.getTables()     // Catch: java.lang.Throwable -> L21
            if (r5 != 0) goto L7
            return
        L7:
            java.lang.String[] r5 = r3.getTables()     // Catch: java.lang.Throwable -> L21
            int r6 = r5.length     // Catch: java.lang.Throwable -> L21
            r0 = 0
        Ld:
            if (r0 >= r6) goto L23
            r1 = r5[r0]     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = "DROP TABLE IF EXISTS "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = r2.concat(r1)     // Catch: java.lang.Throwable -> L21
            r4.execSQL(r1)     // Catch: java.lang.Throwable -> L21
            int r0 = r0 + 1
            goto Ld
        L21:
            r4 = move-exception
            goto L27
        L23:
            r3.onDbCreate(r4)     // Catch: java.lang.Throwable -> L21
            return
        L27:
            com.tencent.bugly.proguard.al.b(r4)
            return
    }

    public void onDbUpgrade(android.database.sqlite.SQLiteDatabase r4, int r5, int r6) {
            r3 = this;
            java.lang.String[] r5 = r3.getTables()     // Catch: java.lang.Throwable -> L21
            if (r5 != 0) goto L7
            return
        L7:
            java.lang.String[] r5 = r3.getTables()     // Catch: java.lang.Throwable -> L21
            int r6 = r5.length     // Catch: java.lang.Throwable -> L21
            r0 = 0
        Ld:
            if (r0 >= r6) goto L23
            r1 = r5[r0]     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = "DROP TABLE IF EXISTS "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = r2.concat(r1)     // Catch: java.lang.Throwable -> L21
            r4.execSQL(r1)     // Catch: java.lang.Throwable -> L21
            int r0 = r0 + 1
            goto Ld
        L21:
            r4 = move-exception
            goto L27
        L23:
            r3.onDbCreate(r4)     // Catch: java.lang.Throwable -> L21
            return
        L27:
            com.tencent.bugly.proguard.al.b(r4)
            return
    }

    public void onServerStrategyChanged(com.tencent.bugly.crashreport.common.strategy.StrategyBean r1) {
            r0 = this;
            return
    }
}
