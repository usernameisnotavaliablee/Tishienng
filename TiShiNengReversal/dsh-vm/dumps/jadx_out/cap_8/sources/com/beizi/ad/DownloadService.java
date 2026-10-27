package com.beizi.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class DownloadService extends android.app.Service {

    /* renamed from: f, reason: collision with root package name */
    private static com.beizi.ad.internal.h.b.a f6434f;
    private long a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f6435b;

    /* renamed from: c, reason: collision with root package name */
    private android.app.DownloadManager f6436c;

    /* renamed from: d, reason: collision with root package name */
    private com.beizi.ad.DownloadService.a f6437d;

    /* renamed from: e, reason: collision with root package name */
    private com.beizi.ad.DownloadService.b f6438e;

    /* renamed from: g, reason: collision with root package name */
    private java.util.HashMap<java.lang.String, com.beizi.ad.lance.ApkBean> f6439g;

    /* renamed from: h, reason: collision with root package name */
    private java.util.HashMap<java.lang.String, java.lang.Boolean> f6440h;

    /* renamed from: i, reason: collision with root package name */
    private java.util.HashMap<java.lang.Long, java.lang.String> f6441i;

    /* renamed from: j, reason: collision with root package name */
    private com.beizi.ad.lance.ApkBean f6442j;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class a extends android.database.ContentObserver {
        final /* synthetic */ com.beizi.ad.DownloadService a;

        a(com.beizi.ad.DownloadService r1, android.os.Handler r2) {
                r0 = this;
                r0.a = r1
                r0.<init>(r2)
                return
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean r10) {
                r9 = this;
                java.lang.String r0 = "DownloadService"
                java.lang.String r1 = "status"
                super.onChange(r10)
                r10 = 3
                int[] r10 = new int[r10]
                r2 = 0
                r10[r2] = r2
                r3 = 1
                r10[r3] = r2
                r4 = 2
                r10[r4] = r2
                android.app.DownloadManager$Query r5 = new android.app.DownloadManager$Query
                r5.<init>()
                com.beizi.ad.DownloadService r6 = r9.a
                long r6 = com.beizi.ad.DownloadService.a(r6)
                long[] r8 = new long[r3]
                r8[r2] = r6
                android.app.DownloadManager$Query r5 = r5.setFilterById(r8)
                r6 = 0
                com.beizi.ad.DownloadService r7 = r9.a     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lab
                android.app.DownloadManager r7 = com.beizi.ad.DownloadService.b(r7)     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lab
                android.database.Cursor r6 = r7.query(r5)     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lab
                if (r6 == 0) goto Lad
                boolean r5 = r6.moveToFirst()     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lab
                if (r5 == 0) goto Lad
                int r5 = r6.getColumnIndex(r1)     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lab
                int r5 = r6.getInt(r5)     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lab
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lab
                r7.<init>()     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lab
                java.lang.String r8 = "onChange status："
                r7.append(r8)     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lab
                r7.append(r5)     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lab
                java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lab
                com.beizi.ad.lance.a.m.a(r0, r7)     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lab
                if (r5 == r3) goto L58
                goto L61
            L58:
                com.beizi.ad.DownloadService r5 = r9.a     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lab
                com.beizi.ad.lance.ApkBean r7 = com.beizi.ad.DownloadService.c(r5)     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lab
                com.beizi.ad.DownloadService.a(r5, r7)     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lab
            L61:
                java.lang.String r5 = "bytes_so_far"
                int r5 = r6.getColumnIndexOrThrow(r5)     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lab
                int r5 = r6.getInt(r5)     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lab
                r10[r2] = r5     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lab
                java.lang.String r5 = "total_size"
                int r5 = r6.getColumnIndexOrThrow(r5)     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lab
                int r5 = r6.getInt(r5)     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lab
                r10[r3] = r5     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lab
                int r1 = r6.getColumnIndex(r1)     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lab
                int r1 = r6.getInt(r1)     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lab
                r10[r4] = r1     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lab
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lab
                r1.<init>()     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lab
                java.lang.String r4 = "progress："
                r1.append(r4)     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lab
                r2 = r10[r2]     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lab
                r1.append(r2)     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lab
                java.lang.String r2 = "/"
                r1.append(r2)     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lab
                r10 = r10[r3]     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lab
                r1.append(r10)     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lab
                java.lang.String r10 = ""
                r1.append(r10)     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lab
                java.lang.String r10 = r1.toString()     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lab
                com.beizi.ad.lance.a.m.a(r0, r10)     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lab
                goto Lad
            La9:
                r10 = move-exception
                goto Lb3
            Lab:
                goto Lb9
            Lad:
                if (r6 == 0) goto Lbe
                r6.close()
                return
            Lb3:
                if (r6 == 0) goto Lb8
                r6.close()
            Lb8:
                throw r10
            Lb9:
                if (r6 == 0) goto Lbe
                r6.close()
            Lbe:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends android.content.BroadcastReceiver {
        final /* synthetic */ com.beizi.ad.DownloadService a;

        b(com.beizi.ad.DownloadService r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r5, android.content.Intent r6) {
                r4 = this;
                java.lang.String r0 = "DownloadService"
                java.lang.String r1 = "onReceived...download finish...begin install！"
                com.beizi.ad.lance.a.m.a(r0, r1)     // Catch: java.lang.Exception -> L8f
                java.lang.String r0 = "extra_download_id"
                r1 = -1
                long r0 = r6.getLongExtra(r0, r1)     // Catch: java.lang.Exception -> L8f
                com.beizi.ad.DownloadService r6 = r4.a     // Catch: java.lang.Exception -> L8f
                java.util.HashMap r6 = com.beizi.ad.DownloadService.d(r6)     // Catch: java.lang.Exception -> L8f
                if (r6 == 0) goto L8f
                com.beizi.ad.DownloadService r6 = r4.a     // Catch: java.lang.Exception -> L8f
                java.util.HashMap r6 = com.beizi.ad.DownloadService.e(r6)     // Catch: java.lang.Exception -> L8f
                if (r6 != 0) goto L20
                goto L8f
            L20:
                com.beizi.ad.DownloadService r6 = r4.a     // Catch: java.lang.Exception -> L8f
                java.util.HashMap r6 = com.beizi.ad.DownloadService.d(r6)     // Catch: java.lang.Exception -> L8f
                java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Exception -> L8f
                java.lang.Object r6 = r6.get(r2)     // Catch: java.lang.Exception -> L8f
                java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L8f
                com.beizi.ad.DownloadService r2 = r4.a     // Catch: java.lang.Exception -> L8f
                java.util.HashMap r2 = com.beizi.ad.DownloadService.f(r2)     // Catch: java.lang.Exception -> L8f
                if (r2 == 0) goto L43
                com.beizi.ad.DownloadService r2 = r4.a     // Catch: java.lang.Exception -> L8f
                java.util.HashMap r2 = com.beizi.ad.DownloadService.f(r2)     // Catch: java.lang.Exception -> L8f
                java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L8f
                r2.put(r6, r3)     // Catch: java.lang.Exception -> L8f
            L43:
                com.beizi.ad.DownloadService r2 = r4.a     // Catch: java.lang.Exception -> L8f
                java.util.HashMap r2 = com.beizi.ad.DownloadService.e(r2)     // Catch: java.lang.Exception -> L8f
                java.lang.Object r6 = r2.get(r6)     // Catch: java.lang.Exception -> L8f
                com.beizi.ad.lance.ApkBean r6 = (com.beizi.ad.lance.ApkBean) r6     // Catch: java.lang.Exception -> L8f
                if (r6 == 0) goto L8f
                com.beizi.ad.model.c$b$b r2 = r6.getmFollowTrackExt()     // Catch: java.lang.Exception -> L8f
                if (r2 == 0) goto L62
                com.beizi.ad.model.c$b$b r2 = r6.getmFollowTrackExt()     // Catch: java.lang.Exception -> L8f
                java.util.List r2 = r2.c()     // Catch: java.lang.Exception -> L8f
                com.beizi.ad.internal.h.l.a(r2)     // Catch: java.lang.Exception -> L8f
            L62:
                int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L8f
                r3 = 26
                if (r2 < r3) goto L86
                android.content.pm.PackageManager r2 = r5.getPackageManager()     // Catch: java.lang.Exception -> L8f
                boolean r2 = com.beizi.ad.n.a(r2)     // Catch: java.lang.Exception -> L8f
                if (r2 != 0) goto L7c
                com.beizi.ad.DownloadService r2 = r4.a     // Catch: java.lang.Exception -> L8f
                java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Exception -> L8f
                com.beizi.ad.DownloadService.a(r2, r5, r0, r6)     // Catch: java.lang.Exception -> L8f
                return
            L7c:
                com.beizi.ad.DownloadService r2 = r4.a     // Catch: java.lang.Exception -> L8f
                java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Exception -> L8f
                com.beizi.ad.DownloadService.a(r2, r5, r0, r6)     // Catch: java.lang.Exception -> L8f
                return
            L86:
                com.beizi.ad.DownloadService r2 = r4.a     // Catch: java.lang.Exception -> L8f
                java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Exception -> L8f
                com.beizi.ad.DownloadService.a(r2, r5, r0, r6)     // Catch: java.lang.Exception -> L8f
            L8f:
                return
        }
    }

    public DownloadService() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ long a(com.beizi.ad.DownloadService r2) {
            long r0 = r2.a
            return r0
    }

    private static java.io.File a(android.content.Context r4, long r5) {
            java.lang.String r0 = "download"
            java.lang.Object r4 = r4.getSystemService(r0)
            android.app.DownloadManager r4 = (android.app.DownloadManager) r4
            r0 = -1
            r2 = 0
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 == 0) goto L52
            android.app.DownloadManager$Query r0 = new android.app.DownloadManager$Query
            r0.<init>()
            r1 = 1
            long[] r1 = new long[r1]
            r3 = 0
            r1[r3] = r5
            r0.setFilterById(r1)
            r5 = 8
            r0.setFilterByStatus(r5)
            if (r4 == 0) goto L52
            android.database.Cursor r4 = r4.query(r0)
            if (r4 == 0) goto L52
            boolean r5 = r4.moveToFirst()
            if (r5 == 0) goto L4f
            java.lang.String r5 = "local_uri"
            int r5 = r4.getColumnIndex(r5)
            java.lang.String r5 = r4.getString(r5)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L4f
            android.net.Uri r5 = android.net.Uri.parse(r5)
            java.lang.String r5 = r5.getPath()
            if (r5 == 0) goto L4f
            java.io.File r2 = new java.io.File
            r2.<init>(r5)
        L4f:
            r4.close()
        L52:
            return r2
    }

    private void a() {
            r4 = this;
            android.content.ContentResolver r0 = r4.getContentResolver()
            java.lang.String r1 = "content://downloads/my_downloads"
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r2 = 1
            com.beizi.ad.DownloadService$a r3 = r4.f6437d
            r0.registerContentObserver(r1, r2, r3)
            com.beizi.ad.DownloadService$b r0 = r4.f6438e
            android.content.IntentFilter r1 = new android.content.IntentFilter
            java.lang.String r2 = "android.intent.action.DOWNLOAD_COMPLETE"
            r1.<init>(r2)
            r4.registerReceiver(r0, r1)
            return
    }

    private void a(android.content.Context r10, java.lang.Long r11, com.beizi.ad.lance.ApkBean r12) {
            r9 = this;
            java.lang.String r0 = ".zip"
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L10d
            java.lang.String r2 = r12.getDownloadPath()     // Catch: java.lang.Exception -> L10d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L10d
            r3.<init>()     // Catch: java.lang.Exception -> L10d
            java.lang.String r4 = r12.getPkgName()     // Catch: java.lang.Exception -> L10d
            r3.append(r4)     // Catch: java.lang.Exception -> L10d
            r3.append(r0)     // Catch: java.lang.Exception -> L10d
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L10d
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> L10d
            boolean r2 = r1.exists()     // Catch: java.lang.Exception -> L10d
            if (r2 != 0) goto L26
            goto L10d
        L26:
            java.lang.String r2 = r12.getFileMD5()     // Catch: java.lang.Exception -> L10d
            java.lang.String r3 = r1.getAbsolutePath()     // Catch: java.lang.Exception -> L10d
            java.lang.String r3 = com.beizi.ad.lance.a.i.a(r3)     // Catch: java.lang.Exception -> L10d
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L10d
            if (r4 != 0) goto L40
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> L10d
            if (r2 != 0) goto L40
            goto L10d
        L40:
            boolean r2 = r1.exists()     // Catch: java.lang.Exception -> L10d
            java.lang.String r3 = "DownloadService"
            if (r2 == 0) goto L70
            java.io.File r2 = new java.io.File     // Catch: java.lang.Exception -> L10d
            java.lang.String r4 = r12.getDownloadPath()     // Catch: java.lang.Exception -> L10d
            java.lang.String r5 = r12.getApkName()     // Catch: java.lang.Exception -> L10d
            r2.<init>(r4, r5)     // Catch: java.lang.Exception -> L10d
            r1.renameTo(r2)     // Catch: java.lang.Exception -> L10d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L10d
            r1.<init>()     // Catch: java.lang.Exception -> L10d
            java.lang.String r4 = "apkFile......raName:"
            r1.append(r4)     // Catch: java.lang.Exception -> L10d
            boolean r2 = r2.exists()     // Catch: java.lang.Exception -> L10d
            r1.append(r2)     // Catch: java.lang.Exception -> L10d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L10d
            com.beizi.ad.lance.a.m.a(r3, r1)     // Catch: java.lang.Exception -> L10d
        L70:
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Exception -> L10d
            r1.<init>()     // Catch: java.lang.Exception -> L10d
            r2 = 268435456(0x10000000, float:2.524355E-29)
            r1.addFlags(r2)     // Catch: java.lang.Exception -> L10d
            java.lang.String r2 = "android.intent.action.VIEW"
            r1.setAction(r2)     // Catch: java.lang.Exception -> L10d
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L10d
            r4 = 23
            java.lang.String r5 = "uri......"
            java.lang.String r6 = ".apk"
            if (r2 >= r4) goto Lb4
            android.app.DownloadManager r2 = r9.f6436c     // Catch: java.lang.Exception -> L10d
            long r7 = r11.longValue()     // Catch: java.lang.Exception -> L10d
            android.net.Uri r11 = r2.getUriForDownloadedFile(r7)     // Catch: java.lang.Exception -> L10d
            if (r11 == 0) goto L100
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Exception -> L10d
            java.lang.String r11 = r11.replace(r0, r6)     // Catch: java.lang.Exception -> L10d
            android.net.Uri r11 = android.net.Uri.parse(r11)     // Catch: java.lang.Exception -> L10d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L10d
            r0.<init>()     // Catch: java.lang.Exception -> L10d
            r0.append(r5)     // Catch: java.lang.Exception -> L10d
            r0.append(r11)     // Catch: java.lang.Exception -> L10d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L10d
            com.beizi.ad.lance.a.m.a(r3, r0)     // Catch: java.lang.Exception -> L10d
            goto L100
        Lb4:
            r4 = 24
            if (r2 >= r4) goto Le9
            long r7 = r11.longValue()     // Catch: java.lang.Exception -> L10d
            java.io.File r11 = a(r10, r7)     // Catch: java.lang.Exception -> L10d
            if (r11 == 0) goto Le7
            android.net.Uri r11 = android.net.Uri.fromFile(r11)     // Catch: java.lang.Exception -> L10d
            if (r11 == 0) goto L100
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Exception -> L10d
            java.lang.String r11 = r11.replace(r0, r6)     // Catch: java.lang.Exception -> L10d
            android.net.Uri r11 = android.net.Uri.parse(r11)     // Catch: java.lang.Exception -> L10d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L10d
            r0.<init>()     // Catch: java.lang.Exception -> L10d
            r0.append(r5)     // Catch: java.lang.Exception -> L10d
            r0.append(r11)     // Catch: java.lang.Exception -> L10d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L10d
            com.beizi.ad.lance.a.m.a(r3, r0)     // Catch: java.lang.Exception -> L10d
            goto L100
        Le7:
            r11 = 0
            goto L100
        Le9:
            java.lang.String r11 = r9.f6435b     // Catch: java.lang.Exception -> L10d
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L10d
            java.lang.String r2 = r12.getDownloadPath()     // Catch: java.lang.Exception -> L10d
            java.lang.String r3 = r12.getApkName()     // Catch: java.lang.Exception -> L10d
            r0.<init>(r2, r3)     // Catch: java.lang.Exception -> L10d
            android.net.Uri r11 = androidx.core.content.FileProvider.getUriForFile(r10, r11, r0)     // Catch: java.lang.Exception -> L10d
            r0 = 3
            r1.addFlags(r0)     // Catch: java.lang.Exception -> L10d
        L100:
            if (r11 == 0) goto L10d
            java.lang.String r0 = "application/vnd.android.package-archive"
            r1.setDataAndType(r11, r0)     // Catch: java.lang.Exception -> L10d
            r10.startActivity(r1)     // Catch: java.lang.Exception -> L10d
            r9.d(r12)     // Catch: java.lang.Exception -> L10d
        L10d:
            return
    }

    static /* synthetic */ void a(com.beizi.ad.DownloadService r0, android.content.Context r1, java.lang.Long r2, com.beizi.ad.lance.ApkBean r3) {
            r0.a(r1, r2, r3)
            return
    }

    static /* synthetic */ void a(com.beizi.ad.DownloadService r0, com.beizi.ad.lance.ApkBean r1) {
            r0.c(r1)
            return
    }

    private void a(com.beizi.ad.lance.ApkBean r4) {
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            java.util.HashMap<java.lang.String, com.beizi.ad.lance.ApkBean> r0 = r3.f6439g
            if (r0 == 0) goto Le
            java.lang.String r1 = r4.getPkgName()
            r0.put(r1, r4)
        Le:
            java.util.HashMap<java.lang.String, java.lang.Boolean> r0 = r3.f6440h
            if (r0 == 0) goto L2e
            java.lang.String r1 = r4.getPkgName()
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L2e
            java.lang.String r0 = "DownloadService"
            java.lang.String r1 = "not have package status..."
            com.beizi.ad.lance.a.m.a(r0, r1)
            java.util.HashMap<java.lang.String, java.lang.Boolean> r0 = r3.f6440h
            java.lang.String r1 = r4.getPkgName()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.put(r1, r2)
        L2e:
            java.lang.String r0 = r4.getAuthorities()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L50
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.getPackageName()
            r0.append(r1)
            java.lang.String r1 = ".fileprovider"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.f6435b = r0
            goto L56
        L50:
            java.lang.String r0 = r4.getAuthorities()
            r3.f6435b = r0
        L56:
            java.lang.String r0 = r4.getDownloadPath()
            com.beizi.ad.lance.a.h.a(r0)
            r3.b(r4)
            return
    }

    static /* synthetic */ android.app.DownloadManager b(com.beizi.ad.DownloadService r0) {
            android.app.DownloadManager r0 = r0.f6436c
            return r0
    }

    private void b() {
            r2 = this;
            android.content.ContentResolver r0 = r2.getContentResolver()
            com.beizi.ad.DownloadService$a r1 = r2.f6437d
            r0.unregisterContentObserver(r1)
            com.beizi.ad.DownloadService$b r0 = r2.f6438e
            r2.unregisterReceiver(r0)
            java.lang.String r0 = "DownloadService"
            java.lang.String r1 = "unregister()"
            com.beizi.ad.lance.a.m.a(r0, r1)
            return
    }

    private synchronized void b(com.beizi.ad.lance.ApkBean r8) {
            r7 = this;
            monitor-enter(r7)
            java.util.HashMap<java.lang.String, java.lang.Boolean> r0 = r7.f6440h     // Catch: java.lang.Throwable -> L4c
            r1 = 0
            if (r0 == 0) goto L4f
            java.lang.String r2 = r8.getPkgName()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L4f
            java.util.HashMap<java.lang.String, java.lang.Boolean> r0 = r7.f6440h     // Catch: java.lang.Throwable -> L4c
            java.lang.String r2 = r8.getPkgName()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L4f
            java.lang.String r0 = "DownloadService"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c
            r2.<init>()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r3 = "downloading..."
            r2.append(r3)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r8 = r8.getPkgName()     // Catch: java.lang.Throwable -> L4c
            r2.append(r8)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r8 = "...please not repeat click"
            r2.append(r8)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Throwable -> L4c
            com.beizi.ad.lance.a.m.a(r0, r8)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r8 = "正在下载…请勿重复点击"
            android.widget.Toast r8 = android.widget.Toast.makeText(r7, r8, r1)     // Catch: java.lang.Throwable -> L4c
            r8.show()     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r7)
            return
        L4c:
            r8 = move-exception
            goto L1b9
        L4f:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L4c
            java.lang.String r2 = r8.getDownloadPath()     // Catch: java.lang.Throwable -> L4c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c
            r3.<init>()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r4 = r8.getPkgName()     // Catch: java.lang.Throwable -> L4c
            r3.append(r4)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r4 = ".zip"
            r3.append(r4)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L4c
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L4c
            boolean r2 = r0.exists()     // Catch: java.lang.Throwable -> L4c
            if (r2 == 0) goto L90
            r0.delete()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r2 = "DownloadService"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c
            r3.<init>()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r4 = "apkCacheFile......remove:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L4c
            boolean r4 = r0.exists()     // Catch: java.lang.Throwable -> L4c
            r3.append(r4)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L4c
            com.beizi.ad.lance.a.m.a(r2, r3)     // Catch: java.lang.Throwable -> L4c
        L90:
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L4c
            java.lang.String r3 = r8.getDownloadPath()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r4 = r8.getApkName()     // Catch: java.lang.Throwable -> L4c
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L4c
            boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> L4c
            r4 = 268435456(0x10000000, float:2.524355E-29)
            if (r3 == 0) goto Le1
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> Lbf
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> Lbf
            r0.addFlags(r4)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> Lbf
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.setAction(r1)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> Lbf
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> Lbf
            r3 = 24
            if (r1 >= r3) goto Lc1
            android.net.Uri r1 = android.net.Uri.fromFile(r2)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> Lbf
            goto Lcd
        Lbf:
            r8 = move-exception
            goto Ldc
        Lc1:
            java.lang.String r1 = r8.getAuthorities()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> Lbf
            android.net.Uri r1 = androidx.core.content.FileProvider.getUriForFile(r7, r1, r2)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> Lbf
            r2 = 3
            r0.addFlags(r2)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> Lbf
        Lcd:
            if (r1 == 0) goto L1b7
            java.lang.String r2 = "application/vnd.android.package-archive"
            r0.setDataAndType(r1, r2)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> Lbf
            r7.startActivity(r0)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> Lbf
            r7.d(r8)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> Lbf
            goto L1b7
        Ldc:
            r8.toString()     // Catch: java.lang.Throwable -> L4c
            goto L1b7
        Le1:
            android.app.DownloadManager$Request r2 = new android.app.DownloadManager$Request     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L13e
            java.lang.String r3 = r8.getApkUrl()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L13e
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L13e
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L13e
            java.lang.String r3 = r8.getApkTittleName()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L13e
            r2.setTitle(r3)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L13e
            java.lang.String r3 = r8.getApkDesc()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L13e
            r2.setDescription(r3)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L13e
            r3 = 1
            r2.setNotificationVisibility(r3)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L13e
            android.net.Uri r0 = android.net.Uri.fromFile(r0)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L13e
            r2.setDestinationUri(r0)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L13e
            java.lang.String r0 = "application/vnd.android.package-archive"
            r2.setMimeType(r0)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L13e
            android.app.DownloadManager r0 = r7.f6436c     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L13e
            long r2 = r0.enqueue(r2)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L13e
            r7.a = r2     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L13e
            java.lang.String r0 = "DownloadService"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L13e
            r2.<init>()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L13e
            java.lang.String r3 = "mReqId:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L13e
            long r5 = r7.a     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L13e
            r2.append(r5)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L13e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L13e
            com.beizi.ad.lance.a.m.b(r0, r2)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L13e
            java.util.HashMap<java.lang.Long, java.lang.String> r0 = r7.f6441i     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L13e
            if (r0 == 0) goto L140
            long r2 = r7.a     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L13e
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L13e
            java.lang.String r3 = r8.getPkgName()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L13e
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L13e
            goto L140
        L13e:
            r0 = move-exception
            goto L16f
        L140:
            java.util.HashMap<java.lang.String, java.lang.Boolean> r0 = r7.f6440h     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L13e
            if (r0 == 0) goto L14d
            java.lang.String r2 = r8.getPkgName()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L13e
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L13e
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L13e
        L14d:
            java.lang.String r0 = "已开始下载…"
            android.widget.Toast r0 = android.widget.Toast.makeText(r7, r0, r1)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L13e
            r0.show()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L13e
            java.lang.String r0 = "DownloadService"
            java.lang.String r1 = "BEGIN_DOWNLOAD!"
            com.beizi.ad.lance.a.m.a(r0, r1)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L13e
            com.beizi.ad.model.c$b$b r0 = r8.getmFollowTrackExt()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L13e
            if (r0 == 0) goto L1b7
            com.beizi.ad.model.c$b$b r0 = r8.getmFollowTrackExt()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L13e
            java.util.List r0 = r0.b()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L13e
            com.beizi.ad.internal.h.l.a(r0)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L13e
            goto L1b7
        L16f:
            r0.toString()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = r8.getApkUrl()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L196
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L196
            if (r0 != 0) goto L1b7
            java.lang.String r0 = r8.getApkUrl()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L196
            java.lang.String r1 = "http"
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L196
            if (r0 == 0) goto L1b7
            java.util.HashMap<java.lang.String, java.lang.Boolean> r0 = r7.f6440h     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L196
            if (r0 == 0) goto L198
            java.lang.String r1 = r8.getPkgName()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L196
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L196
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L196
            goto L198
        L196:
            r8 = move-exception
            goto L1b4
        L198:
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L196
            r0.<init>()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L196
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.setAction(r1)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L196
            java.lang.String r8 = r8.getApkUrl()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L196
            android.net.Uri r8 = android.net.Uri.parse(r8)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L196
            r0.setData(r8)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L196
            r0.setFlags(r4)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L196
            r7.startActivity(r0)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L196
            goto L1b7
        L1b4:
            r8.toString()     // Catch: java.lang.Throwable -> L4c
        L1b7:
            monitor-exit(r7)
            return
        L1b9:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4c
            throw r8
    }

    static /* synthetic */ com.beizi.ad.lance.ApkBean c(com.beizi.ad.DownloadService r0) {
            com.beizi.ad.lance.ApkBean r0 = r0.f6442j
            return r0
    }

    private void c() {
            r2 = this;
            com.beizi.ad.internal.h.b$a r0 = com.beizi.ad.DownloadService.f6434f
            if (r0 == 0) goto L7
            r0.a()
        L7:
            java.util.HashMap<java.lang.String, java.lang.Boolean> r0 = r2.f6440h
            r1 = 0
            if (r0 == 0) goto Le
            r2.f6440h = r1
        Le:
            java.util.HashMap<java.lang.String, com.beizi.ad.lance.ApkBean> r0 = r2.f6439g
            if (r0 == 0) goto L14
            r2.f6439g = r1
        L14:
            java.util.HashMap<java.lang.Long, java.lang.String> r0 = r2.f6441i
            if (r0 == 0) goto L1a
            r2.f6441i = r1
        L1a:
            java.lang.String r0 = "DownloadService"
            java.lang.String r1 = "releaseResources()"
            com.beizi.ad.lance.a.m.a(r0, r1)
            return
    }

    private void c(com.beizi.ad.lance.ApkBean r5) {
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "DownloadService"
            java.lang.String r1 = "--appUpdate downloadApk start--"
            com.beizi.ad.lance.a.m.a(r0, r1)
            com.beizi.ad.internal.h.b$a r0 = com.beizi.ad.internal.h.b.a()
            com.beizi.ad.DownloadService.f6434f = r0
            com.beizi.ad.DownloadService$1 r1 = new com.beizi.ad.DownloadService$1
            r1.<init>(r4, r5)
            r0.a(r1)
            com.beizi.ad.internal.h.b$a r0 = com.beizi.ad.DownloadService.f6434f
            com.beizi.ad.internal.h.b$d r1 = new com.beizi.ad.internal.h.b$d
            java.lang.String r2 = r5.getApkUrl()
            java.lang.String r3 = r5.getDownloadPath()
            java.lang.String r5 = r5.getApkName()
            r1.<init>(r2, r3, r5)
            r0.a(r1)
            return
    }

    static /* synthetic */ java.util.HashMap d(com.beizi.ad.DownloadService r0) {
            java.util.HashMap<java.lang.Long, java.lang.String> r0 = r0.f6441i
            return r0
    }

    private void d(com.beizi.ad.lance.ApkBean r3) {
            r2 = this;
            java.lang.String r0 = "DownloadService"
            java.lang.String r1 = "BEGIN_INSTALL!"
            com.beizi.ad.lance.a.m.a(r0, r1)
            com.beizi.ad.model.c$b$b r0 = r3.getmFollowTrackExt()
            if (r0 == 0) goto L18
            com.beizi.ad.model.c$b$b r3 = r3.getmFollowTrackExt()
            java.util.List r3 = r3.d()
            com.beizi.ad.internal.h.l.a(r3)
        L18:
            return
    }

    static /* synthetic */ java.util.HashMap e(com.beizi.ad.DownloadService r0) {
            java.util.HashMap<java.lang.String, com.beizi.ad.lance.ApkBean> r0 = r0.f6439g
            return r0
    }

    static /* synthetic */ java.util.HashMap f(com.beizi.ad.DownloadService r0) {
            java.util.HashMap<java.lang.String, java.lang.Boolean> r0 = r0.f6440h
            return r0
    }

    @Override // android.app.Service
    @androidx.annotation.Nullable
    public android.os.IBinder onBind(android.content.Intent r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.app.Service
    public void onCreate() {
            r2 = this;
            super.onCreate()
            java.lang.String r0 = "DownloadService"
            java.lang.String r1 = "DownloadService onCreate()"
            com.beizi.ad.lance.a.m.a(r0, r1)
            java.lang.String r0 = "download"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.app.DownloadManager r0 = (android.app.DownloadManager) r0
            r2.f6436c = r0
            com.beizi.ad.DownloadService$a r0 = new com.beizi.ad.DownloadService$a
            android.os.Handler r1 = new android.os.Handler
            r1.<init>()
            r0.<init>(r2, r1)
            r2.f6437d = r0
            com.beizi.ad.DownloadService$b r0 = new com.beizi.ad.DownloadService$b
            r0.<init>(r2)
            r2.f6438e = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.f6439g = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.f6440h = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.f6441i = r0
            r2.a()
            return
    }

    @Override // android.app.Service
    public void onDestroy() {
            r2 = this;
            super.onDestroy()
            java.lang.String r0 = "DownloadService"
            java.lang.String r1 = "DownloadService onDestroy()"
            com.beizi.ad.lance.a.m.a(r0, r1)
            r2.b()
            r2.c()
            return
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent r3, int r4, int r5) {
            r2 = this;
            java.lang.String r4 = "apkBean"
            r5 = 2
            if (r3 != 0) goto L6
            return r5
        L6:
            java.lang.String r0 = "DownloadService"
            java.lang.String r1 = "DownloadService onStartCommand()"
            com.beizi.ad.lance.a.m.a(r0, r1)
            if (r3 == 0) goto L2b
            android.os.Bundle r0 = r3.getExtras()     // Catch: java.lang.Exception -> L30
            if (r0 == 0) goto L2b
            java.lang.String r0 = "data"
            android.os.Bundle r3 = r3.getBundleExtra(r0)     // Catch: java.lang.Exception -> L30
            if (r3 == 0) goto L2b
            boolean r0 = r3.containsKey(r4)     // Catch: java.lang.Exception -> L30
            if (r0 == 0) goto L2b
            java.io.Serializable r3 = r3.getSerializable(r4)     // Catch: java.lang.Exception -> L30
            com.beizi.ad.lance.ApkBean r3 = (com.beizi.ad.lance.ApkBean) r3     // Catch: java.lang.Exception -> L30
            r2.f6442j = r3     // Catch: java.lang.Exception -> L30
        L2b:
            com.beizi.ad.lance.ApkBean r3 = r2.f6442j     // Catch: java.lang.Exception -> L30
            r2.a(r3)     // Catch: java.lang.Exception -> L30
        L30:
            return r5
    }
}
