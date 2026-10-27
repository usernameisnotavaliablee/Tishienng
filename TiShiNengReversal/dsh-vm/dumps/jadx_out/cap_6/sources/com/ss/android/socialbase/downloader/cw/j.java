package com.ss.android.socialbase.downloader.cw;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class j extends android.database.sqlite.SQLiteOpenHelper {
    private static volatile com.ss.android.socialbase.downloader.cw.j j;
    private boolean xt;

    private j() {
            r4 = this;
            com.bytedance.sdk.openadsdk.api.plugin.j r0 = new com.bytedance.sdk.openadsdk.api.plugin.j
            android.content.Context r1 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            r0.<init>(r1)
            r1 = 0
            r2 = 15
            java.lang.String r3 = "downloader.db"
            r4.<init>(r0, r3, r1, r2)
            r0 = 0
            r4.xt = r0
            return
    }

    public static com.ss.android.socialbase.downloader.cw.j j() {
            com.ss.android.socialbase.downloader.cw.j r0 = com.ss.android.socialbase.downloader.cw.j.j
            if (r0 != 0) goto L19
            java.lang.Class<com.ss.android.socialbase.downloader.cw.j> r0 = com.ss.android.socialbase.downloader.cw.j.class
            monitor-enter(r0)
            com.ss.android.socialbase.downloader.cw.j r1 = com.ss.android.socialbase.downloader.cw.j.j     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.ss.android.socialbase.downloader.cw.j r1 = new com.ss.android.socialbase.downloader.cw.j     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.ss.android.socialbase.downloader.cw.j.j = r1     // Catch: java.lang.Throwable -> L13
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
            com.ss.android.socialbase.downloader.cw.j r0 = com.ss.android.socialbase.downloader.cw.j.j
            return r0
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public android.database.sqlite.SQLiteDatabase getReadableDatabase() {
            r3 = this;
            android.content.Context r0 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            boolean r1 = r3.xt
            if (r1 != 0) goto L47
            if (r0 == 0) goto L47
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L30
            java.lang.String r2 = "/data/data/"
            r1.<init>(r2)     // Catch: java.lang.Exception -> L30
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Exception -> L30
            r1.append(r0)     // Catch: java.lang.Exception -> L30
            java.lang.String r0 = "/database/main/"
            r1.append(r0)     // Catch: java.lang.Exception -> L30
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> L30
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L30
            r1.<init>(r0)     // Catch: java.lang.Exception -> L30
            boolean r0 = r1.exists()     // Catch: java.lang.Exception -> L30
            if (r0 != 0) goto L32
            r1.mkdir()     // Catch: java.lang.Exception -> L30
            goto L32
        L30:
            r0 = move-exception
            goto L3f
        L32:
            android.database.sqlite.SQLiteDatabase r0 = super.getReadableDatabase()     // Catch: java.lang.Exception -> L30
            java.lang.String r1 = "PRAGMA temp_store_directory = tempDir"
            r0.execSQL(r1)     // Catch: java.lang.Exception -> L30
            r0 = 1
            r3.xt = r0     // Catch: java.lang.Exception -> L30
            goto L42
        L3f:
            com.bytedance.sdk.component.utils.vl.j(r0)
        L42:
            android.database.sqlite.SQLiteDatabase r0 = super.getReadableDatabase()
            return r0
        L47:
            android.database.sqlite.SQLiteDatabase r0 = super.getReadableDatabase()
            return r0
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(android.database.sqlite.SQLiteDatabase r3) {
            r2 = this;
            super.onConfigure(r3)
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.cw()
            java.lang.String r1 = "disable_sqlite_wal"
            int r0 = r0.xt(r1)
            if (r0 <= 0) goto L18
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 != r1) goto L18
            r3.disableWriteAheadLogging()
        L18:
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS downloader( _id INTEGER PRIMARY KEY, url TEXT, savePath TEXT, tempPath TEXT, name TEXT, chunkCount INTEGER, status INTEGER, curBytes INTEGER, totalBytes INTEGER, eTag TEXT, onlyWifi INTEGER, force INTEGER, retryCount INTEGER, extra TEXT, mimeType TEXT, title TEXT, notificationEnable INTEGER, notificationVisibility INTEGER, isFirstDownload INTEGER, isFirstSuccess INTEGER, needHttpsToHttpRetry INTEGER, downloadTime INTEGER, packageName TEXT, md5 TEXT, retryDelay INTEGER, curRetryTime INTEGER, retryDelayStatus INTEGER, defaultHttpServiceBackUp INTEGER, chunkRunnableReuse INTEGER, retryDelayTimeArray TEXT, chunkDowngradeRetry INTEGER, backUpUrlsStr TEXT, backUpUrlRetryCount INTEGER, realDownloadTime INTEGER, retryScheduleMinutes INTEGER, independentProcess INTEGER, auxiliaryJsonobjectString TEXT, iconUrl TEXT, appVersionCode INTEGER, taskId TEXT)"
            r2.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS downloadChunk( _id INTEGER, chunkIndex INTEGER, startOffset INTEGER, curOffset INTEGER, endOffset INTEGER, chunkContentLen INTEGER, hostChunkIndex INTEGER )"
            r2.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS segments( _id INTEGER PRIMARY KEY,info TEXT )"
            r2.execSQL(r0)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            r0 = this;
            boolean r1 = com.ss.android.socialbase.downloader.m.j.j()
            if (r1 == 0) goto Lb
            java.lang.String r1 = "onDowngrade"
            com.ss.android.socialbase.downloader.m.j.j(r1)
        Lb:
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            r0 = this;
            switch(r2) {
                case 1: goto L4;
                case 2: goto L18;
                case 3: goto L1d;
                case 4: goto L22;
                case 5: goto L2c;
                case 6: goto L36;
                case 7: goto L4a;
                case 8: goto L54;
                case 9: goto L59;
                case 10: goto L5e;
                case 11: goto L7c;
                case 12: goto L81;
                case 13: goto L8b;
                case 14: goto L90;
                default: goto L3;
            }
        L3:
            return
        L4:
            java.lang.String r2 = "ALTER TABLE downloader ADD mimeType TEXT"
            r1.execSQL(r2)
            java.lang.String r2 = "ALTER TABLE downloader ADD title TEXT"
            r1.execSQL(r2)
            java.lang.String r2 = "ALTER TABLE downloader ADD notificationEnable INTEGER"
            r1.execSQL(r2)
            java.lang.String r2 = "ALTER TABLE downloader ADD notificationVisibility INTEGER"
            r1.execSQL(r2)
        L18:
            java.lang.String r2 = "ALTER TABLE downloader ADD isFirstDownload INTEGER"
            r1.execSQL(r2)
        L1d:
            java.lang.String r2 = "ALTER TABLE downloader ADD isFirstSuccess INTEGER"
            r1.execSQL(r2)
        L22:
            java.lang.String r2 = "ALTER TABLE downloader ADD needHttpsToHttpRetry INTEGER"
            r1.execSQL(r2)
            java.lang.String r2 = "ALTER TABLE downloader ADD downloadTime INTEGER"
            r1.execSQL(r2)
        L2c:
            java.lang.String r2 = "ALTER TABLE downloader ADD packageName TEXT"
            r1.execSQL(r2)
            java.lang.String r2 = "ALTER TABLE downloader ADD md5 TEXT"
            r1.execSQL(r2)
        L36:
            java.lang.String r2 = "ALTER TABLE downloader ADD retryDelay INTEGER"
            r1.execSQL(r2)
            java.lang.String r2 = "ALTER TABLE downloader ADD curRetryTime INTEGER"
            r1.execSQL(r2)
            java.lang.String r2 = "ALTER TABLE downloader ADD retryDelayStatus INTEGER"
            r1.execSQL(r2)
            java.lang.String r2 = "ALTER TABLE downloader ADD defaultHttpServiceBackUp INTEGER"
            r1.execSQL(r2)
        L4a:
            java.lang.String r2 = "ALTER TABLE downloadChunk ADD chunkContentLen INTEGER"
            r1.execSQL(r2)
            java.lang.String r2 = "ALTER TABLE downloadChunk ADD hostChunkIndex INTEGER"
            r1.execSQL(r2)
        L54:
            java.lang.String r2 = "ALTER TABLE downloader ADD chunkRunnableReuse INTEGER"
            r1.execSQL(r2)
        L59:
            java.lang.String r2 = "ALTER TABLE downloader ADD retryDelayTimeArray TEXT"
            r1.execSQL(r2)
        L5e:
            java.lang.String r2 = "ALTER TABLE downloader ADD chunkDowngradeRetry INTEGER"
            r1.execSQL(r2)
            java.lang.String r2 = "ALTER TABLE downloader ADD backUpUrlsStr TEXT"
            r1.execSQL(r2)
            java.lang.String r2 = "ALTER TABLE downloader ADD backUpUrlRetryCount INTEGER"
            r1.execSQL(r2)
            java.lang.String r2 = "ALTER TABLE downloader ADD realDownloadTime INTEGER"
            r1.execSQL(r2)
            java.lang.String r2 = "ALTER TABLE downloader ADD retryScheduleMinutes INTEGER"
            r1.execSQL(r2)
            java.lang.String r2 = "ALTER TABLE downloader ADD independentProcess INTEGER"
            r1.execSQL(r2)
        L7c:
            java.lang.String r2 = "ALTER TABLE downloader ADD auxiliaryJsonobjectString TEXT"
            r1.execSQL(r2)
        L81:
            java.lang.String r2 = "ALTER TABLE downloader ADD iconUrl TEXT"
            r1.execSQL(r2)
            java.lang.String r2 = "ALTER TABLE downloader ADD appVersionCode INTEGER"
            r1.execSQL(r2)
        L8b:
            java.lang.String r2 = "CREATE TABLE IF NOT EXISTS segments( _id INTEGER PRIMARY KEY,info TEXT )"
            r1.execSQL(r2)
        L90:
            java.lang.String r2 = "ALTER TABLE downloader ADD taskId TEXT"
            r1.execSQL(r2)
            return
    }
}
