package com.ss.android.downloadlib.r;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a {
    private static volatile com.ss.android.downloadlib.r.a b;
    private android.database.sqlite.SQLiteDatabase a;

    private a() {
            r3 = this;
            r3.<init>()
            com.ss.android.downloadlib.r.c r0 = new com.ss.android.downloadlib.r.c
            android.content.Context r1 = com.ss.android.downloadlib.addownload.m.getContext()
            r0.<init>(r1)
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch: java.lang.Throwable -> L13
            r3.a = r0     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r0 = move-exception
            com.ss.android.downloadlib.up.a r1 = com.ss.android.downloadlib.up.a.a()
            java.lang.String r2 = "ClickEventHelper"
            r1.j(r0, r2)
            return
    }

    private void a(long r6, java.lang.String r8) {
            r5 = this;
            android.database.sqlite.SQLiteDatabase r0 = r5.a
            if (r0 == 0) goto L4c
            boolean r0 = r0.isOpen()
            if (r0 != 0) goto Lb
            goto L4c
        Lb:
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 <= 0) goto L4c
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L18
            goto L4c
        L18:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L48
            r0.<init>(r8)     // Catch: java.lang.Exception -> L48
            java.lang.String r8 = "req_id"
            java.lang.String r8 = r0.optString(r8)     // Catch: java.lang.Exception -> L48
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Exception -> L48
            if (r0 == 0) goto L2a
            goto L4c
        L2a:
            java.lang.String r0 = "time < ? AND ad_id = ? AND req_id = ?"
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L48
            r3 = 1209600000(0x48190800, double:5.97621805E-315)
            long r1 = r1 - r3
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> L48
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Exception -> L48
            java.lang.String[] r6 = new java.lang.String[]{r1, r6, r8}     // Catch: java.lang.Exception -> L48
            android.database.sqlite.SQLiteDatabase r7 = r5.a     // Catch: java.lang.Exception -> L48
            java.lang.String r8 = "click_event"
            r7.delete(r8, r0, r6)     // Catch: java.lang.Exception -> L48
            return
        L48:
            r6 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r6)
        L4c:
            return
    }

    public static com.ss.android.downloadlib.r.a c() {
            com.ss.android.downloadlib.r.a r0 = com.ss.android.downloadlib.r.a.b
            if (r0 != 0) goto L19
            java.lang.Class<com.ss.android.downloadlib.r.a> r0 = com.ss.android.downloadlib.r.a.class
            monitor-enter(r0)
            com.ss.android.downloadlib.r.a r1 = com.ss.android.downloadlib.r.a.b     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.ss.android.downloadlib.r.a r1 = new com.ss.android.downloadlib.r.a     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.ss.android.downloadlib.r.a.b = r1     // Catch: java.lang.Throwable -> L13
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
            com.ss.android.downloadlib.r.a r0 = com.ss.android.downloadlib.r.a.b
            return r0
    }

    public boolean b() {
            r3 = this;
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.cw()
            java.lang.String r1 = "click_event_switch"
            r2 = 0
            int r0 = r0.j(r1, r2)
            r1 = 2
            if (r0 != r1) goto L10
            r0 = 1
            return r0
        L10:
            return r2
    }

    public void d(long r6, java.lang.String r8) {
            r5 = this;
            java.lang.String r0 = "req_id"
            android.database.sqlite.SQLiteDatabase r1 = r5.a
            if (r1 == 0) goto L58
            boolean r1 = r1.isOpen()
            if (r1 != 0) goto Ld
            goto L58
        Ld:
            r1 = 0
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 <= 0) goto L58
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 == 0) goto L1a
            goto L58
        L1a:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L51
            r1.<init>(r8)     // Catch: java.lang.Exception -> L51
            java.lang.String r1 = r1.optString(r0)     // Catch: java.lang.Exception -> L51
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L51
            if (r2 == 0) goto L2a
            goto L58
        L2a:
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch: java.lang.Exception -> L51
            r2.<init>()     // Catch: java.lang.Exception -> L51
            java.lang.String r3 = "ad_id"
            java.lang.Long r4 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Exception -> L51
            r2.put(r3, r4)     // Catch: java.lang.Exception -> L51
            r2.put(r0, r1)     // Catch: java.lang.Exception -> L51
            java.lang.String r0 = "time"
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L51
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Exception -> L51
            r2.put(r0, r1)     // Catch: java.lang.Exception -> L51
            android.database.sqlite.SQLiteDatabase r0 = r5.a     // Catch: java.lang.Exception -> L51
            java.lang.String r1 = "click_event"
            r3 = 0
            r0.insert(r1, r3, r2)     // Catch: java.lang.Exception -> L51
            goto L55
        L51:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        L55:
            r5.a(r6, r8)
        L58:
            return
    }

    public boolean e() {
            r3 = this;
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.cw()
            java.lang.String r1 = "click_event_switch"
            r2 = 0
            int r0 = r0.j(r1, r2)
            r1 = 1
            if (r0 != r1) goto Lf
            return r1
        Lf:
            return r2
    }

    public boolean f(long r13, java.lang.String r15) {
            r12 = this;
            android.database.sqlite.SQLiteDatabase r0 = r12.a
            r1 = 0
            if (r0 == 0) goto L6f
            boolean r0 = r0.isOpen()
            if (r0 != 0) goto Lc
            goto L6f
        Lc:
            r2 = 0
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 <= 0) goto L6f
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 == 0) goto L19
            goto L6f
        L19:
            r2 = 0
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5e
            r0.<init>(r15)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5e
            java.lang.String r15 = "req_id"
            java.lang.String r15 = r0.optString(r15)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5e
            boolean r0 = android.text.TextUtils.isEmpty(r15)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5e
            if (r0 == 0) goto L2c
            return r1
        L2c:
            java.lang.String r6 = "time > ? AND ad_id = ? AND req_id = ?"
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5e
            r7 = 1209600000(0x48190800, double:5.97621805E-315)
            long r3 = r3 - r7
            java.lang.String r0 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5e
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5e
            java.lang.String[] r7 = new java.lang.String[]{r0, r13, r15}     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5e
            android.database.sqlite.SQLiteDatabase r3 = r12.a     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5e
            java.lang.String r4 = "click_event"
            java.lang.String[] r5 = com.ss.android.downloadlib.r.c.a     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5e
            r10 = 0
            r11 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5e
            int r13 = r2.getCount()     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5e
            if (r13 <= 0) goto L57
            r1 = 1
        L57:
            r2.close()
            return r1
        L5b:
            r0 = move-exception
            r13 = r0
            goto L69
        L5e:
            r0 = move-exception
            r13 = r0
            com.bytedance.sdk.component.utils.vl.j(r13)     // Catch: java.lang.Throwable -> L5b
            if (r2 == 0) goto L68
            r2.close()
        L68:
            return r1
        L69:
            if (r2 == 0) goto L6e
            r2.close()
        L6e:
            throw r13
        L6f:
            return r1
    }
}
