package xyz.adscope.ad.download.service;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class DownloadService extends android.app.Service implements xyz.adscope.ad.download.service.a {
    private xyz.adscope.ad.download.service.DownloadService.b a;
    private xyz.adscope.ad.download.service.DownloadService.d b;
    private xyz.adscope.ad.download.service.DownloadService.c c;
    private java.util.Map<java.lang.String, java.lang.Long> d;
    private java.util.Map<java.lang.Long, xyz.adscope.ad.download.service.a.C0060a> e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements xyz.adscope.ad.download.service.a.b {
        final /* synthetic */ xyz.adscope.ad.download.service.DownloadService a;

        a(xyz.adscope.ad.download.service.DownloadService r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // xyz.adscope.ad.download.service.a.b
        public void a(xyz.adscope.ad.download.service.a.C0060a r3) {
                r2 = this;
                xyz.adscope.ad.download.service.DownloadService r0 = r2.a
                xyz.adscope.ad.y1$a r1 = xyz.adscope.ad.y1.a.h
                xyz.adscope.ad.download.service.DownloadService.a(r0, r3, r1)
                return
        }

        @Override // xyz.adscope.ad.download.service.a.b
        public void b(xyz.adscope.ad.download.service.a.C0060a r3) {
                r2 = this;
                xyz.adscope.ad.download.service.DownloadService r0 = r2.a
                xyz.adscope.ad.y1$a r1 = xyz.adscope.ad.y1.a.f
                xyz.adscope.ad.download.service.DownloadService.a(r0, r3, r1)
                return
        }

        @Override // xyz.adscope.ad.download.service.a.b
        public void c(xyz.adscope.ad.download.service.a.C0060a r3) {
                r2 = this;
                xyz.adscope.ad.download.service.DownloadService r0 = r2.a
                xyz.adscope.ad.y1$a r1 = xyz.adscope.ad.y1.a.e
                xyz.adscope.ad.download.service.DownloadService.a(r0, r3, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b extends android.os.Binder {
        final /* synthetic */ xyz.adscope.ad.download.service.DownloadService a;

        public b(xyz.adscope.ad.download.service.DownloadService r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public xyz.adscope.ad.download.service.a a() {
                r1 = this;
                xyz.adscope.ad.download.service.DownloadService r0 = r1.a
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class c extends android.database.ContentObserver {
        final /* synthetic */ xyz.adscope.ad.download.service.DownloadService a;

        public c(xyz.adscope.ad.download.service.DownloadService r1, android.os.Handler r2) {
                r0 = this;
                r0.a = r1
                r0.<init>(r2)
                return
        }

        private long[] a(java.util.Map<java.lang.Long, xyz.adscope.ad.download.service.a.C0060a> r5) {
                r4 = this;
                if (r5 == 0) goto L2d
                boolean r0 = r5.isEmpty()
                if (r0 != 0) goto L2d
                java.util.Set r5 = r5.keySet()
                int r0 = r5.size()
                long[] r0 = new long[r0]
                java.util.Iterator r5 = r5.iterator()
                r1 = 0
            L17:
                boolean r2 = r5.hasNext()
                if (r2 == 0) goto L2c
                java.lang.Object r2 = r5.next()
                java.lang.Long r2 = (java.lang.Long) r2
                long r2 = r2.longValue()
                r0[r1] = r2
                int r1 = r1 + 1
                goto L17
            L2c:
                return r0
            L2d:
                r5 = 0
                return r5
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean r6) {
                r5 = this;
                super.onChange(r6)
                xyz.adscope.ad.download.service.DownloadService r6 = r5.a
                android.content.Context r6 = r6.getApplicationContext()
                android.content.Context r6 = com.stub.StubApp.getOrigApplicationContext(r6)
                java.lang.String r0 = "download"
                java.lang.Object r6 = r6.getSystemService(r0)
                android.app.DownloadManager r6 = (android.app.DownloadManager) r6
                r0 = 0
                xyz.adscope.ad.download.service.DownloadService r1 = r5.a     // Catch: java.lang.Throwable -> L79 java.lang.IllegalArgumentException -> L7b
                java.util.Map r1 = xyz.adscope.ad.download.service.DownloadService.a(r1)     // Catch: java.lang.Throwable -> L79 java.lang.IllegalArgumentException -> L7b
                long[] r1 = r5.a(r1)     // Catch: java.lang.Throwable -> L79 java.lang.IllegalArgumentException -> L7b
                if (r1 == 0) goto L7d
                int r2 = r1.length     // Catch: java.lang.Throwable -> L79 java.lang.IllegalArgumentException -> L7b
                if (r2 <= 0) goto L7d
                android.app.DownloadManager$Query r2 = new android.app.DownloadManager$Query     // Catch: java.lang.Throwable -> L79 java.lang.IllegalArgumentException -> L7b
                r2.<init>()     // Catch: java.lang.Throwable -> L79 java.lang.IllegalArgumentException -> L7b
                r2.setFilterById(r1)     // Catch: java.lang.Throwable -> L79 java.lang.IllegalArgumentException -> L7b
                android.database.Cursor r0 = r6.query(r2)     // Catch: java.lang.Throwable -> L79 java.lang.IllegalArgumentException -> L7b
            L31:
                boolean r6 = r0.moveToNext()     // Catch: java.lang.Throwable -> L79 java.lang.IllegalArgumentException -> L7b
                if (r6 == 0) goto L7d
                java.lang.String r6 = "_id"
                int r6 = r0.getColumnIndexOrThrow(r6)     // Catch: java.lang.Throwable -> L79 java.lang.IllegalArgumentException -> L7b
                long r1 = r0.getLong(r6)     // Catch: java.lang.Throwable -> L79 java.lang.IllegalArgumentException -> L7b
                java.lang.String r6 = "status"
                int r6 = r0.getColumnIndexOrThrow(r6)     // Catch: java.lang.Throwable -> L79 java.lang.IllegalArgumentException -> L7b
                int r6 = r0.getInt(r6)     // Catch: java.lang.Throwable -> L79 java.lang.IllegalArgumentException -> L7b
                xyz.adscope.ad.download.service.DownloadService r3 = r5.a     // Catch: java.lang.Throwable -> L79 java.lang.IllegalArgumentException -> L7b
                java.util.Map r3 = xyz.adscope.ad.download.service.DownloadService.a(r3)     // Catch: java.lang.Throwable -> L79 java.lang.IllegalArgumentException -> L7b
                if (r3 == 0) goto L31
                xyz.adscope.ad.download.service.DownloadService r3 = r5.a     // Catch: java.lang.Throwable -> L79 java.lang.IllegalArgumentException -> L7b
                java.util.Map r3 = xyz.adscope.ad.download.service.DownloadService.a(r3)     // Catch: java.lang.Throwable -> L79 java.lang.IllegalArgumentException -> L7b
                java.lang.Long r4 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L79 java.lang.IllegalArgumentException -> L7b
                boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L79 java.lang.IllegalArgumentException -> L7b
                if (r3 == 0) goto L31
                xyz.adscope.ad.download.service.DownloadService r3 = r5.a     // Catch: java.lang.Throwable -> L79 java.lang.IllegalArgumentException -> L7b
                java.util.Map r3 = xyz.adscope.ad.download.service.DownloadService.a(r3)     // Catch: java.lang.Throwable -> L79 java.lang.IllegalArgumentException -> L7b
                java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L79 java.lang.IllegalArgumentException -> L7b
                java.lang.Object r1 = r3.get(r1)     // Catch: java.lang.Throwable -> L79 java.lang.IllegalArgumentException -> L7b
                xyz.adscope.ad.download.service.a$a r1 = (xyz.adscope.ad.download.service.a.C0060a) r1     // Catch: java.lang.Throwable -> L79 java.lang.IllegalArgumentException -> L7b
                if (r1 == 0) goto L31
                r1.a(r6)     // Catch: java.lang.Throwable -> L79 java.lang.IllegalArgumentException -> L7b
                goto L31
            L79:
                r6 = move-exception
                goto L80
            L7b:
                goto L86
            L7d:
                if (r0 == 0) goto L8b
                goto L88
            L80:
                if (r0 == 0) goto L85
                r0.close()
            L85:
                throw r6
            L86:
                if (r0 == 0) goto L8b
            L88:
                r0.close()
            L8b:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class d extends android.content.BroadcastReceiver {
        final /* synthetic */ xyz.adscope.ad.download.service.DownloadService a;

        private d(xyz.adscope.ad.download.service.DownloadService r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ d(xyz.adscope.ad.download.service.DownloadService r1, xyz.adscope.ad.download.service.DownloadService.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private android.net.Uri a(android.app.DownloadManager r4, long r5) {
                r3 = this;
                android.app.DownloadManager$Query r0 = new android.app.DownloadManager$Query
                r0.<init>()
                r1 = 1
                long[] r1 = new long[r1]
                r2 = 0
                r1[r2] = r5
                r0.setFilterById(r1)
                r5 = 8
                r0.setFilterByStatus(r5)
                android.database.Cursor r4 = r4.query(r0)     // Catch: java.lang.IllegalArgumentException -> L48
                if (r4 == 0) goto L43
                boolean r5 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L39
                if (r5 == 0) goto L43
                java.lang.String r5 = "local_uri"
                int r5 = r4.getColumnIndexOrThrow(r5)     // Catch: java.lang.Throwable -> L39
                if (r5 < 0) goto L43
                java.lang.String r5 = r4.getString(r5)     // Catch: java.lang.Throwable -> L39
                boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L39
                if (r6 != 0) goto L43
                android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch: java.lang.Throwable -> L39
                r4.close()     // Catch: java.lang.IllegalArgumentException -> L48
                return r5
            L39:
                r5 = move-exception
                r4.close()     // Catch: java.lang.Throwable -> L3e
                goto L42
            L3e:
                r4 = move-exception
                r5.addSuppressed(r4)     // Catch: java.lang.IllegalArgumentException -> L48
            L42:
                throw r5     // Catch: java.lang.IllegalArgumentException -> L48
            L43:
                if (r4 == 0) goto L48
                r4.close()     // Catch: java.lang.IllegalArgumentException -> L48
            L48:
                r4 = 0
                return r4
        }

        private android.net.Uri a(android.content.Context r4, long r5, xyz.adscope.ad.download.service.a.C0060a r7) {
                r3 = this;
                java.lang.String r0 = "download"
                java.lang.Object r0 = r4.getSystemService(r0)
                android.app.DownloadManager r0 = (android.app.DownloadManager) r0
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 23
                if (r1 >= r2) goto L13
                android.net.Uri r4 = r0.getUriForDownloadedFile(r5)
                return r4
            L13:
                r2 = 24
                if (r1 >= r2) goto L1c
                android.net.Uri r4 = r3.a(r0, r5)
                return r4
            L1c:
                if (r7 == 0) goto L56
                java.lang.String r5 = r7.b()
                java.lang.String r5 = xyz.adscope.common.v2.tool.str.StringUtil.getFileNameFromURL(r5)
                java.io.File r6 = new java.io.File
                java.lang.String r0 = android.os.Environment.DIRECTORY_DOWNLOADS
                java.io.File r0 = r4.getExternalFilesDir(r0)
                r6.<init>(r0, r5)
                java.lang.String r5 = r7.a()
                boolean r7 = r6.exists()
                if (r7 == 0) goto L56
                boolean r5 = r3.a(r6, r5)
                if (r5 == 0) goto L56
                java.lang.String r5 = "%s.fileprovider"
                java.lang.String r7 = r4.getPackageName()     // Catch: java.lang.IllegalArgumentException -> L56
                r0 = 1
                java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.IllegalArgumentException -> L56
                r1 = 0
                r0[r1] = r7     // Catch: java.lang.IllegalArgumentException -> L56
                java.lang.String r5 = java.lang.String.format(r5, r0)     // Catch: java.lang.IllegalArgumentException -> L56
                android.net.Uri r4 = androidx.core.content.FileProvider.getUriForFile(r4, r5, r6)     // Catch: java.lang.IllegalArgumentException -> L56
                return r4
            L56:
                r4 = 0
                return r4
        }

        private xyz.adscope.ad.download.service.a.C0060a a(long r3) {
                r2 = this;
                xyz.adscope.ad.download.service.DownloadService r0 = r2.a
                java.util.Map r0 = xyz.adscope.ad.download.service.DownloadService.a(r0)
                if (r0 == 0) goto L29
                xyz.adscope.ad.download.service.DownloadService r0 = r2.a
                java.util.Map r0 = xyz.adscope.ad.download.service.DownloadService.a(r0)
                java.lang.Long r1 = java.lang.Long.valueOf(r3)
                boolean r0 = r0.containsKey(r1)
                if (r0 == 0) goto L29
                xyz.adscope.ad.download.service.DownloadService r0 = r2.a
                java.util.Map r0 = xyz.adscope.ad.download.service.DownloadService.a(r0)
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                java.lang.Object r3 = r0.get(r3)
                xyz.adscope.ad.download.service.a$a r3 = (xyz.adscope.ad.download.service.a.C0060a) r3
                return r3
            L29:
                r3 = 0
                return r3
        }

        private boolean a(android.content.Context r3, android.net.Uri r4) {
                r2 = this;
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r1 = "android.intent.action.VIEW"
                r0.<init>(r1)
                r1 = 268435456(0x10000000, float:2.524355E-29)
                r0.setFlags(r1)
                r1 = 1
                r0.addFlags(r1)
                java.lang.String r1 = "application/vnd.android.package-archive"
                r0.setDataAndType(r4, r1)
                boolean r3 = xyz.adscope.ad.n4.c(r3, r0)
                return r3
        }

        private boolean a(java.io.File r3, java.lang.String r4) {
                r2 = this;
                r0 = 0
                if (r3 == 0) goto L17
                java.lang.String r3 = xyz.adscope.common.v2.tool.io.FileVerify.getFileMD5(r3)
                boolean r1 = android.text.TextUtils.isEmpty(r4)
                if (r1 != 0) goto L15
                boolean r3 = r4.equalsIgnoreCase(r3)
                if (r3 == 0) goto L14
                goto L15
            L14:
                return r0
            L15:
                r3 = 1
                return r3
            L17:
                return r0
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r5, android.content.Intent r6) {
                r4 = this;
                if (r6 == 0) goto L2e
                java.lang.String r0 = "extra_download_id"
                r1 = -1
                long r0 = r6.getLongExtra(r0, r1)
                r2 = 0
                int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r6 <= 0) goto L2e
                xyz.adscope.ad.download.service.a$a r6 = r4.a(r0)
                android.net.Uri r0 = r4.a(r5, r0, r6)
                if (r0 == 0) goto L2e
                xyz.adscope.ad.download.service.DownloadService r1 = r4.a
                xyz.adscope.ad.y1$a r2 = xyz.adscope.ad.y1.a.g
                xyz.adscope.ad.download.service.DownloadService.a(r1, r6, r2)
                boolean r5 = r4.a(r5, r0)
                if (r5 == 0) goto L2e
                xyz.adscope.ad.download.service.DownloadService r5 = r4.a
                xyz.adscope.ad.y1$a r0 = xyz.adscope.ad.y1.a.i
                xyz.adscope.ad.download.service.DownloadService.a(r5, r6, r0)
            L2e:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class e extends android.os.Handler {
        private e(android.os.Looper r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        /* synthetic */ e(android.os.Looper r1, xyz.adscope.ad.download.service.DownloadService.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.os.Handler
        public void handleMessage(@androidx.annotation.NonNull android.os.Message r1) {
                r0 = this;
                super.handleMessage(r1)
                return
        }
    }

    public DownloadService() {
            r0 = this;
            r0.<init>()
            return
    }

    private long a(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            android.content.Context r0 = r3.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            java.lang.String r1 = "download"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.DownloadManager r0 = (android.app.DownloadManager) r0
            android.app.DownloadManager$Request r1 = new android.app.DownloadManager$Request
            android.net.Uri r2 = android.net.Uri.parse(r4)
            r1.<init>(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 != 0) goto L20
            goto L24
        L20:
            java.lang.String r5 = xyz.adscope.common.v2.tool.str.StringUtil.getFileNameFromURL(r4)
        L24:
            r1.setTitle(r5)
            r5 = 1
            r1.setVisibleInDownloadsUi(r5)
            r1.allowScanningByMediaScanner()
            r1.setNotificationVisibility(r5)
            android.content.Context r5 = r3.getApplicationContext()
            android.content.Context r5 = com.stub.StubApp.getOrigApplicationContext(r5)
            java.lang.String r2 = android.os.Environment.DIRECTORY_DOWNLOADS
            java.lang.String r4 = xyz.adscope.common.v2.tool.str.StringUtil.getFileNameFromURL(r4)
            r1.setDestinationInExternalFilesDir(r5, r2, r4)
            long r4 = r0.enqueue(r1)
            return r4
    }

    static /* synthetic */ java.util.Map a(xyz.adscope.ad.download.service.DownloadService r0) {
            java.util.Map<java.lang.Long, xyz.adscope.ad.download.service.a$a> r0 = r0.e
            return r0
    }

    private void a() {
            r5 = this;
            xyz.adscope.ad.download.service.DownloadService$d r0 = new xyz.adscope.ad.download.service.DownloadService$d
            r1 = 0
            r0.<init>(r5, r1)
            r5.b = r0
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.String r2 = "android.intent.action.DOWNLOAD_COMPLETE"
            r0.addAction(r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 32
            if (r2 <= r3) goto L27
            android.content.Context r2 = r5.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            xyz.adscope.ad.download.service.DownloadService$d r3 = r5.b
            r4 = 4
            cn.jiguang.commons.L.j1.a(r2, r3, r0, r4)
            goto L34
        L27:
            android.content.Context r2 = r5.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            xyz.adscope.ad.download.service.DownloadService$d r3 = r5.b
            r2.registerReceiver(r3, r0)
        L34:
            xyz.adscope.ad.download.service.DownloadService$c r0 = new xyz.adscope.ad.download.service.DownloadService$c
            xyz.adscope.ad.download.service.DownloadService$e r2 = new xyz.adscope.ad.download.service.DownloadService$e
            android.os.Looper r3 = r5.getMainLooper()
            r2.<init>(r3, r1)
            r0.<init>(r5, r2)
            r5.c = r0
            android.content.Context r0 = r5.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            android.content.ContentResolver r0 = r0.getContentResolver()
            if (r0 == 0) goto L5e
            java.lang.String r1 = "content://downloads/my_downloads"
            android.net.Uri r1 = android.net.Uri.parse(r1)
            xyz.adscope.ad.download.service.DownloadService$c r2 = r5.c
            r3 = 1
            r0.registerContentObserver(r1, r3, r2)
        L5e:
            return
    }

    static /* synthetic */ void a(xyz.adscope.ad.download.service.DownloadService r0, xyz.adscope.ad.download.service.a.C0060a r1, xyz.adscope.ad.y1.a r2) {
            r0.a(r1, r2)
            return
    }

    private void a(xyz.adscope.ad.download.service.a.C0060a r3, xyz.adscope.ad.y1.a r4) {
            r2 = this;
            if (r3 == 0) goto L1f
            xyz.adscope.ad.c0 r0 = xyz.adscope.ad.c0.a()
            android.content.Context r1 = r2.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            java.lang.Object r0 = r0.getOrCreateImplement(r1)
            xyz.adscope.ad.v1 r0 = (xyz.adscope.ad.v1) r0
            xyz.adscope.ad.b1 r1 = r3.d()
            java.lang.String r3 = r3.e()
            r0.a(r4, r1, r3)
        L1f:
            return
    }

    private boolean a(java.lang.String r7) {
            r6 = this;
            java.lang.String r7 = xyz.adscope.common.v2.encrypt.impl.MD5Util.md5(r7)
            java.util.Map<java.lang.String, java.lang.Long> r0 = r6.d
            boolean r0 = r0.containsKey(r7)
            r1 = 0
            if (r0 == 0) goto L23
            java.util.Map<java.lang.String, java.lang.Long> r0 = r6.d
            java.lang.Object r7 = r0.get(r7)
            java.lang.Long r7 = (java.lang.Long) r7
            if (r7 == 0) goto L23
            long r2 = r7.longValue()
            r4 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto L23
            r7 = 1
            return r7
        L23:
            return r1
    }

    private void b() {
            r2 = this;
            xyz.adscope.ad.download.service.DownloadService$d r0 = r2.b
            if (r0 == 0) goto L11
            android.content.Context r0 = r2.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            xyz.adscope.ad.download.service.DownloadService$d r1 = r2.b
            r0.unregisterReceiver(r1)
        L11:
            xyz.adscope.ad.download.service.DownloadService$c r0 = r2.c
            if (r0 == 0) goto L28
            android.content.Context r0 = r2.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            android.content.ContentResolver r0 = r0.getContentResolver()
            if (r0 == 0) goto L28
            xyz.adscope.ad.download.service.DownloadService$c r1 = r2.c
            r0.unregisterContentObserver(r1)
        L28:
            return
    }

    @Override // xyz.adscope.ad.download.service.a
    public void a(xyz.adscope.ad.download.service.a.C0060a r6) {
            r5 = this;
            if (r6 == 0) goto L48
            java.lang.String r0 = r6.b()
            boolean r0 = r5.a(r0)
            if (r0 != 0) goto L48
            xyz.adscope.ad.download.service.DownloadService$a r0 = new xyz.adscope.ad.download.service.DownloadService$a
            r0.<init>(r5)
            r6.a(r0)
            java.lang.String r0 = r6.b()
            java.lang.String r1 = r6.c()
            long r0 = r5.a(r0, r1)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L48
            xyz.adscope.ad.y1$a r2 = xyz.adscope.ad.y1.a.d
            r5.a(r6, r2)
            r6.a(r0)
            java.lang.String r2 = r6.b()
            java.lang.String r2 = xyz.adscope.common.v2.encrypt.impl.MD5Util.md5(r2)
            java.util.Map<java.lang.String, java.lang.Long> r3 = r5.d
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            r3.put(r2, r4)
            java.util.Map<java.lang.Long, xyz.adscope.ad.download.service.a$a> r2 = r5.e
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.put(r0, r6)
        L48:
            return
    }

    @Override // android.app.Service
    @androidx.annotation.Nullable
    public android.os.IBinder onBind(android.content.Intent r1) {
            r0 = this;
            xyz.adscope.ad.download.service.DownloadService$b r1 = r0.a
            return r1
    }

    @Override // android.app.Service
    public void onCreate() {
            r1 = this;
            super.onCreate()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.d = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.e = r0
            xyz.adscope.ad.download.service.DownloadService$b r0 = new xyz.adscope.ad.download.service.DownloadService$b
            r0.<init>(r1)
            r1.a = r0
            r1.a()
            return
    }

    @Override // android.app.Service
    public void onDestroy() {
            r0 = this;
            super.onDestroy()
            r0.b()
            return
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent r1, int r2, int r3) {
            r0 = this;
            r1 = 2
            return r1
    }
}
