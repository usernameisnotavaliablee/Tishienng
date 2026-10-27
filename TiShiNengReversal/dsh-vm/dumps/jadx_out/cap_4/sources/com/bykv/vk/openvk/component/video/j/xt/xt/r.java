package com.bykv.vk.openvk.component.video.j.xt.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class r extends android.database.sqlite.SQLiteOpenHelper {
    public r(android.content.Context r4) {
            r3 = this;
            com.bytedance.sdk.openadsdk.api.plugin.j r0 = new com.bytedance.sdk.openadsdk.api.plugin.j
            r0.<init>(r4)
            r4 = 0
            r1 = 3
            java.lang.String r2 = "tt_open_sdk_video.db"
            r3.<init>(r0, r2, r4, r1)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS video_http_header_t(_id INTEGER PRIMARY KEY AUTOINCREMENT,key TEXT,mime TEXT,contentLength INTEGER,flag INTEGER,extra TEXT)"
            r2.execSQL(r0)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r2, int r3, int r4) {
            r1 = this;
            r4 = 1
            java.lang.String r0 = "ALTER TABLE video_http_header_t ADD COLUMN extra TEXT DEFAULT ''"
            if (r3 != r4) goto Le
            java.lang.String r3 = "ALTER TABLE video_http_header_t ADD COLUMN flag INTEGER DEFAULT 0"
            r2.execSQL(r3)
            r2.execSQL(r0)
            return
        Le:
            r4 = 2
            if (r3 != r4) goto L15
            r2.execSQL(r0)
            return
        L15:
            java.lang.String r3 = "DROP TABLE IF EXISTS video_http_header_t"
            r2.execSQL(r3)
            r1.onCreate(r2)
            return
    }
}
