package cn.jiguang.commons.n;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    private android.content.Context a;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f1166c;

    public a(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.f1166c = r0
            r1.a = r2
            java.lang.String r2 = "SyfFpc71r1BITMlIo0m1Vt2cR3sdiPGnMd0WMSsF4yU8+J95KN/jHVtZShu2ONYO"
            java.lang.String r2 = cn.jiguang.commons.L.ad.d(r2)
            r1.f1166c = r2
            return
    }

    public java.lang.String a(java.lang.String r11) {
            r10 = this;
            java.lang.String r1 = "close cursor error: "
            java.lang.String r2 = "MeizuDB"
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 == 0) goto Ld
            java.lang.String r11 = ""
            return r11
        Ld:
            r3 = 0
            java.lang.String r0 = r10.f1166c     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            android.net.Uri r5 = android.net.Uri.parse(r0)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            android.content.Context r0 = r10.a     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            android.content.ContentResolver r4 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            java.lang.String[] r8 = new java.lang.String[]{r11}     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            r9 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r11 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            if (r11 == 0) goto L3f
            boolean r0 = r11.moveToNext()     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3d
            if (r0 == 0) goto L44
            java.lang.String r0 = "value"
            int r0 = r11.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3d
            java.lang.String r3 = r11.getString(r0)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3d
            goto L44
        L39:
            r0 = move-exception
            r3 = r11
        L3b:
            r11 = r0
            goto L8e
        L3d:
            r0 = move-exception
            goto L67
        L3f:
            java.lang.String r0 = "return cursor is null,return"
            cn.jiguang.commons.w.a.a(r2, r0)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3d
        L44:
            if (r11 == 0) goto L8d
            r11.close()     // Catch: java.lang.Exception -> L4a
            goto L8d
        L4a:
            r0 = move-exception
            r11 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L51:
            r0.append(r1)
            java.lang.String r11 = r11.getMessage()
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            cn.jiguang.commons.w.a.a(r2, r11)
            goto L8d
        L63:
            r0 = move-exception
            goto L3b
        L65:
            r0 = move-exception
            r11 = r3
        L67:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            r4.<init>()     // Catch: java.lang.Throwable -> L39
            java.lang.String r5 = "getId error: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L39
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L39
            r4.append(r0)     // Catch: java.lang.Throwable -> L39
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L39
            cn.jiguang.commons.w.a.f(r2, r0)     // Catch: java.lang.Throwable -> L39
            if (r11 == 0) goto L8d
            r11.close()     // Catch: java.lang.Exception -> L85
            goto L8d
        L85:
            r0 = move-exception
            r11 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            goto L51
        L8d:
            return r3
        L8e:
            if (r3 == 0) goto Lab
            r3.close()     // Catch: java.lang.Exception -> L94
            goto Lab
        L94:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            cn.jiguang.commons.w.a.a(r2, r0)
        Lab:
            throw r11
    }
}
