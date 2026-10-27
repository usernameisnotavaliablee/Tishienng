package cn.jiguang.commons.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    private android.content.Context a;

    public a(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public java.lang.String a(int r12, java.lang.String r13) {
            r11 = this;
            java.lang.String r1 = "close cursor error: "
            java.lang.String r2 = "VivoDB"
            r3 = 0
            if (r12 == 0) goto L3d
            r0 = 1
            if (r12 == r0) goto L2e
            r0 = 2
            if (r12 == r0) goto Lf
            r5 = r3
            goto L48
        Lf:
            java.lang.String r12 = "HDjJBOCwNx0aZi+Z7p83oR6X29bt13JSzReihhERik1FXRr9EgPkoDQnyVgIu2tARnCHNUAAn6DU1ZkzxwPHKA=="
            java.lang.String r12 = cn.jiguang.commons.L.ad.d(r12)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29
            r0.<init>()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29
            r0.append(r12)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29
        L1d:
            r0.append(r13)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29
            java.lang.String r12 = r0.toString()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29
            goto L43
        L25:
            r0 = move-exception
            r12 = r0
            goto Lc3
        L29:
            r0 = move-exception
            r12 = r0
            r13 = r3
            goto L99
        L2e:
            java.lang.String r12 = "HDjJBOCwNx0aZi+Z7p83oR6X29bt13JSzReihhERik1mRRRjMzvkebo9eb3zqoVhCi2GjcOItUY/+C68T3lxGg=="
            java.lang.String r12 = cn.jiguang.commons.L.ad.d(r12)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29
            r0.<init>()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29
            r0.append(r12)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29
            goto L1d
        L3d:
            java.lang.String r12 = "HDjJBOCwNx0aZi+Z7p83oR6X29bt13JSzReihhERik1zTqeaHqknpahXd0Fww8QTTjy7MHX7/1f2JKNuxQ9omA=="
            java.lang.String r12 = cn.jiguang.commons.L.ad.d(r12)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29
        L43:
            android.net.Uri r12 = android.net.Uri.parse(r12)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29
            r5 = r12
        L48:
            android.content.Context r12 = r11.a     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29
            android.content.ContentResolver r4 = r12.getContentResolver()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29
            r8 = 0
            r9 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r12 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29
            if (r12 == 0) goto L75
            boolean r13 = r12.moveToNext()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6f
            if (r13 == 0) goto L7a
            java.lang.String r13 = "value"
            int r13 = r12.getColumnIndex(r13)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6f
            java.lang.String r3 = r12.getString(r13)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6f
            goto L7a
        L6a:
            r0 = move-exception
            r13 = r0
            r3 = r12
            r12 = r13
            goto Lc3
        L6f:
            r0 = move-exception
            r13 = r0
            r10 = r13
            r13 = r12
            r12 = r10
            goto L99
        L75:
            java.lang.String r13 = "return cursor is null,return"
            cn.jiguang.commons.w.a.a(r2, r13)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6f
        L7a:
            if (r12 == 0) goto Lbf
            r12.close()     // Catch: java.lang.Exception -> L80
            goto Lbf
        L80:
            r0 = move-exception
            r12 = r0
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
        L87:
            r13.append(r1)
            java.lang.String r12 = r12.getMessage()
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            cn.jiguang.commons.w.a.a(r2, r12)
            goto Lbf
        L99:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc0
            r0.<init>()     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r4 = "get id error: "
            r0.append(r4)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r12 = r12.getMessage()     // Catch: java.lang.Throwable -> Lc0
            r0.append(r12)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r12 = r0.toString()     // Catch: java.lang.Throwable -> Lc0
            cn.jiguang.commons.w.a.f(r2, r12)     // Catch: java.lang.Throwable -> Lc0
            if (r13 == 0) goto Lbf
            r13.close()     // Catch: java.lang.Exception -> Lb7
            goto Lbf
        Lb7:
            r0 = move-exception
            r12 = r0
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            goto L87
        Lbf:
            return r3
        Lc0:
            r0 = move-exception
            r12 = r0
            r3 = r13
        Lc3:
            if (r3 == 0) goto Le1
            r3.close()     // Catch: java.lang.Exception -> Lc9
            goto Le1
        Lc9:
            r0 = move-exception
            r13 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r13 = r13.getMessage()
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            cn.jiguang.commons.w.a.a(r2, r13)
        Le1:
            throw r12
    }
}
