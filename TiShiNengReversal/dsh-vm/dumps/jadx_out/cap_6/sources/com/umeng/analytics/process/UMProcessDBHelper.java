package com.umeng.analytics.process;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UMProcessDBHelper {
    private static com.umeng.analytics.process.UMProcessDBHelper mInstance;
    private com.umeng.analytics.process.UMProcessDBHelper.InsertEventCallback ekvCallBack;
    private android.content.Context mContext;
    private com.umeng.commonsdk.utils.FileLockUtil mFileLock;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class InsertEventCallback implements com.umeng.commonsdk.utils.FileLockCallback {
        final /* synthetic */ com.umeng.analytics.process.UMProcessDBHelper a;

        private InsertEventCallback(com.umeng.analytics.process.UMProcessDBHelper r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ InsertEventCallback(com.umeng.analytics.process.UMProcessDBHelper r1, com.umeng.analytics.process.UMProcessDBHelper.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(java.io.File r1, int r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(java.lang.String r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(java.lang.String r5, java.lang.Object r6) {
                r4 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r5)
                r1 = 1
                if (r0 == 0) goto L8
                return r1
            L8:
                java.lang.String r0 = com.umeng.analytics.process.a.c
                boolean r2 = r5.startsWith(r0)
                java.lang.String r3 = ""
                if (r2 == 0) goto L16
                java.lang.String r5 = r5.replaceFirst(r0, r3)
            L16:
                java.lang.String r0 = ".db"
                java.lang.String r5 = r5.replace(r0, r3)
                com.umeng.analytics.process.UMProcessDBHelper r0 = r4.a
                org.json.JSONArray r6 = (org.json.JSONArray) r6
                r0.insertEvents(r5, r6)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class ProcessToMainCallback implements com.umeng.commonsdk.utils.FileLockCallback {
        final /* synthetic */ com.umeng.analytics.process.UMProcessDBHelper a;

        private ProcessToMainCallback(com.umeng.analytics.process.UMProcessDBHelper r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ ProcessToMainCallback(com.umeng.analytics.process.UMProcessDBHelper r1, com.umeng.analytics.process.UMProcessDBHelper.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(java.io.File r1, int r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(java.lang.String r5) {
                r4 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r5)
                r1 = 1
                if (r0 == 0) goto L8
                return r1
            L8:
                java.lang.String r0 = com.umeng.analytics.process.a.c
                boolean r2 = r5.startsWith(r0)
                java.lang.String r3 = ""
                if (r2 == 0) goto L16
                java.lang.String r5 = r5.replaceFirst(r0, r3)
            L16:
                java.lang.String r0 = ".db"
                java.lang.String r5 = r5.replace(r0, r3)
                com.umeng.analytics.process.UMProcessDBHelper r0 = r4.a
                com.umeng.analytics.process.UMProcessDBHelper.access$200(r0, r5)
                return r1
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(java.lang.String r1, java.lang.Object r2) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class a implements java.io.Serializable {
        int a;
        java.lang.String b;
        java.lang.String c;
        java.lang.String d;
        int e;
        java.lang.String f;
        java.lang.String g;
        java.lang.String h;
        final /* synthetic */ com.umeng.analytics.process.UMProcessDBHelper i;

        private a(com.umeng.analytics.process.UMProcessDBHelper r1) {
                r0 = this;
                r0.i = r1
                r0.<init>()
                return
        }

        /* synthetic */ a(com.umeng.analytics.process.UMProcessDBHelper r1, com.umeng.analytics.process.UMProcessDBHelper.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    private UMProcessDBHelper() {
            r2 = this;
            r2.<init>()
            com.umeng.commonsdk.utils.FileLockUtil r0 = new com.umeng.commonsdk.utils.FileLockUtil
            r0.<init>()
            r2.mFileLock = r0
            com.umeng.analytics.process.UMProcessDBHelper$InsertEventCallback r0 = new com.umeng.analytics.process.UMProcessDBHelper$InsertEventCallback
            r1 = 0
            r0.<init>(r2, r1)
            r2.ekvCallBack = r0
            return
    }

    private UMProcessDBHelper(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            com.umeng.commonsdk.utils.FileLockUtil r0 = new com.umeng.commonsdk.utils.FileLockUtil
            r0.<init>()
            r2.mFileLock = r0
            com.umeng.analytics.process.UMProcessDBHelper$InsertEventCallback r0 = new com.umeng.analytics.process.UMProcessDBHelper$InsertEventCallback
            r1 = 0
            r0.<init>(r2, r1)
            r2.ekvCallBack = r0
            com.umeng.common.a r0 = com.umeng.common.a.a()
            r0.a(r3)
            return
    }

    static /* synthetic */ void access$200(com.umeng.analytics.process.UMProcessDBHelper r0, java.lang.String r1) {
            r0.processToMain(r1)
            return
    }

    static /* synthetic */ android.content.Context access$400(com.umeng.analytics.process.UMProcessDBHelper r0) {
            android.content.Context r0 = r0.mContext
            return r0
    }

    private java.util.List<com.umeng.analytics.process.UMProcessDBHelper.a> datasAdapter(java.lang.String r10, org.json.JSONArray r11) {
            r9 = this;
            java.lang.String r0 = "__t"
            java.lang.String r1 = "__i"
            java.lang.String r2 = "ds"
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            boolean r4 = android.text.TextUtils.isEmpty(r10)
            if (r4 == 0) goto L12
            goto L76
        L12:
            r4 = 0
        L13:
            int r5 = r11.length()
            if (r4 >= r5) goto L76
            org.json.JSONObject r5 = r11.getJSONObject(r4)     // Catch: java.lang.Exception -> L73
            com.umeng.analytics.process.UMProcessDBHelper$a r6 = new com.umeng.analytics.process.UMProcessDBHelper$a     // Catch: java.lang.Exception -> L73
            r7 = 0
            r6.<init>(r9, r7)     // Catch: java.lang.Exception -> L73
            java.lang.String r7 = "id"
            java.lang.String r7 = r5.optString(r7)     // Catch: java.lang.Exception -> L73
            r6.c = r7     // Catch: java.lang.Exception -> L73
            android.content.Context r7 = r9.mContext     // Catch: java.lang.Exception -> L73
            java.lang.String r7 = com.umeng.commonsdk.utils.UMUtils.getAppVersionName(r7)     // Catch: java.lang.Exception -> L73
            r6.g = r7     // Catch: java.lang.Exception -> L73
            android.content.Context r7 = r9.mContext     // Catch: java.lang.Exception -> L73
            java.lang.String r7 = com.umeng.commonsdk.utils.UMUtils.getAppVersionCode(r7)     // Catch: java.lang.Exception -> L73
            r6.h = r7     // Catch: java.lang.Exception -> L73
            java.lang.String r7 = r5.optString(r1)     // Catch: java.lang.Exception -> L73
            r6.b = r7     // Catch: java.lang.Exception -> L73
            int r7 = r5.optInt(r0)     // Catch: java.lang.Exception -> L73
            r6.e = r7     // Catch: java.lang.Exception -> L73
            r6.f = r10     // Catch: java.lang.Exception -> L73
            boolean r7 = r5.has(r2)     // Catch: java.lang.Exception -> L73
            if (r7 == 0) goto L52
            r5.remove(r2)     // Catch: java.lang.Exception -> L73
        L52:
            int r7 = r9.getDataSource()     // Catch: java.lang.Exception -> L73
            r5.put(r2, r7)     // Catch: java.lang.Exception -> L73
            r5.remove(r1)     // Catch: java.lang.Exception -> L73
            r5.remove(r0)     // Catch: java.lang.Exception -> L73
            com.umeng.common.a r7 = com.umeng.common.a.a()     // Catch: java.lang.Exception -> L73
            java.lang.String r8 = r5.toString()     // Catch: java.lang.Exception -> L73
            java.lang.String r7 = r7.a(r8)     // Catch: java.lang.Exception -> L73
            r6.d = r7     // Catch: java.lang.Exception -> L73
            r5.remove(r2)     // Catch: java.lang.Exception -> L73
            r3.add(r6)     // Catch: java.lang.Exception -> L73
        L73:
            int r4 = r4 + 1
            goto L13
        L76:
            return r3
    }

    private boolean dbIsExists(java.lang.String r3) {
            r2 = this;
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L13
            android.content.Context r1 = r2.mContext     // Catch: java.lang.Throwable -> L13
            java.lang.String r3 = com.umeng.analytics.process.b.b(r1, r3)     // Catch: java.lang.Throwable -> L13
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L13
            boolean r3 = r0.exists()     // Catch: java.lang.Throwable -> L13
            if (r3 == 0) goto L13
            r3 = 1
            return r3
        L13:
            r3 = 0
            return r3
    }

    private int getDataSource() {
            r1 = this;
            r0 = 0
            return r0
    }

    public static com.umeng.analytics.process.UMProcessDBHelper getInstance(android.content.Context r2) {
            com.umeng.analytics.process.UMProcessDBHelper r0 = com.umeng.analytics.process.UMProcessDBHelper.mInstance
            if (r0 != 0) goto L19
            java.lang.Class<com.umeng.analytics.process.UMProcessDBHelper> r0 = com.umeng.analytics.process.UMProcessDBHelper.class
            monitor-enter(r0)
            com.umeng.analytics.process.UMProcessDBHelper r1 = com.umeng.analytics.process.UMProcessDBHelper.mInstance     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.umeng.analytics.process.UMProcessDBHelper r1 = new com.umeng.analytics.process.UMProcessDBHelper     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            com.umeng.analytics.process.UMProcessDBHelper.mInstance = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
        L19:
            com.umeng.analytics.process.UMProcessDBHelper r0 = com.umeng.analytics.process.UMProcessDBHelper.mInstance
            r0.mContext = r2
            return r0
    }

    private boolean insertEvents_(java.lang.String r8, java.util.List<com.umeng.analytics.process.UMProcessDBHelper.a> r9) {
            r7 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r1 = 1
            if (r0 != 0) goto La8
            if (r9 == 0) goto La8
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L11
            goto La8
        L11:
            r0 = 0
            android.content.Context r2 = r7.mContext     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            com.umeng.analytics.process.c r2 = com.umeng.analytics.process.c.a(r2)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            android.database.sqlite.SQLiteDatabase r2 = r2.a(r8)     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L87
            r2.beginTransaction()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L72
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L72
        L23:
            boolean r3 = r9.hasNext()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L72
            if (r3 == 0) goto L75
            java.lang.Object r3 = r9.next()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L72
            com.umeng.analytics.process.UMProcessDBHelper$a r3 = (com.umeng.analytics.process.UMProcessDBHelper.a) r3     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L72
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L6f
            r4.<init>()     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L6f
            java.lang.String r5 = "__i"
            java.lang.String r6 = r3.b     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L6f
            r4.put(r5, r6)     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L6f
            java.lang.String r5 = "__e"
            java.lang.String r6 = r3.c     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L6f
            r4.put(r5, r6)     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L6f
            java.lang.String r5 = "__t"
            int r6 = r3.e     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L6f
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L6f
            r4.put(r5, r6)     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L6f
            java.lang.String r5 = "__pn"
            java.lang.String r6 = r3.f     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L6f
            r4.put(r5, r6)     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L6f
            java.lang.String r5 = "__av"
            java.lang.String r6 = r3.g     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L6f
            r4.put(r5, r6)     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L6f
            java.lang.String r5 = "__vc"
            java.lang.String r6 = r3.h     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L6f
            r4.put(r5, r6)     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L6f
            java.lang.String r5 = "__s"
            java.lang.String r3 = r3.d     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L6f
            r4.put(r5, r3)     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L6f
            java.lang.String r3 = "__et_p"
            r2.insert(r3, r0, r4)     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L6f
            goto L23
        L6f:
            r9 = move-exception
            r0 = r2
            goto L89
        L72:
            r0 = r2
            goto L98
        L75:
            r2.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L72
            r2.endTransaction()     // Catch: java.lang.Throwable -> L7b
        L7b:
            android.content.Context r9 = r7.mContext
            com.umeng.analytics.process.c r9 = com.umeng.analytics.process.c.a(r9)
            r9.b(r8)
            return r1
        L85:
            r9 = move-exception
            goto L89
        L87:
            goto L98
        L89:
            if (r0 == 0) goto L8e
            r0.endTransaction()     // Catch: java.lang.Throwable -> L8e
        L8e:
            android.content.Context r0 = r7.mContext
            com.umeng.analytics.process.c r0 = com.umeng.analytics.process.c.a(r0)
            r0.b(r8)
            throw r9
        L98:
            if (r0 == 0) goto L9d
            r0.endTransaction()     // Catch: java.lang.Throwable -> L9d
        L9d:
            android.content.Context r9 = r7.mContext
            com.umeng.analytics.process.c r9 = com.umeng.analytics.process.c.a(r9)
            r9.b(r8)
            r8 = 0
            return r8
        La8:
            return r1
    }

    private boolean processIsService(android.content.Context r3) {
            r2 = this;
            android.content.ComponentName r0 = new android.content.ComponentName
            android.content.Context r1 = r2.mContext
            java.lang.Class r1 = r1.getClass()
            r0.<init>(r3, r1)
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            r1 = 0
            android.content.pm.ServiceInfo r3 = r3.getServiceInfo(r0, r1)     // Catch: java.lang.Exception -> L18
            if (r3 == 0) goto L18
            r3 = 1
            return r3
        L18:
            return r1
    }

    private void processToMain(java.lang.String r3) {
            r2 = this;
            boolean r0 = r2.dbIsExists(r3)
            if (r0 != 0) goto L7
            goto L1e
        L7:
            java.util.List r0 = r2.readEventByProcess(r3)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L12
            goto L1e
        L12:
            java.lang.String r1 = "_main_"
            boolean r1 = r2.insertEvents_(r1, r0)
            if (r1 == 0) goto L1e
            r1 = 0
            r2.deleteEventDatas(r3, r1, r0)
        L1e:
            return
    }

    private java.util.List<com.umeng.analytics.process.UMProcessDBHelper.a> readEventByProcess(java.lang.String r12) {
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.content.Context r2 = r11.mContext     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> Laa
            com.umeng.analytics.process.c r2 = com.umeng.analytics.process.c.a(r2)     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> Laa
            android.database.sqlite.SQLiteDatabase r3 = r2.a(r12)     // Catch: java.lang.Throwable -> La7 java.lang.Exception -> Laa
            r3.beginTransaction()     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La5
            java.lang.String r4 = "__et_p"
            r9 = 0
            r10 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La5
            if (r2 == 0) goto L91
        L21:
            boolean r4 = r2.moveToNext()     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            if (r4 == 0) goto L91
            com.umeng.analytics.process.UMProcessDBHelper$a r4 = new com.umeng.analytics.process.UMProcessDBHelper$a     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            r4.<init>(r11, r1)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            r5 = 0
            int r5 = r2.getInt(r5)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            r4.a = r5     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            java.lang.String r5 = "__i"
            int r5 = r2.getColumnIndex(r5)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            java.lang.String r5 = r2.getString(r5)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            r4.b = r5     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            java.lang.String r5 = "__e"
            int r5 = r2.getColumnIndex(r5)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            java.lang.String r5 = r2.getString(r5)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            r4.c = r5     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            java.lang.String r5 = "__s"
            int r5 = r2.getColumnIndex(r5)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            java.lang.String r5 = r2.getString(r5)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            r4.d = r5     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            java.lang.String r5 = "__t"
            int r5 = r2.getColumnIndex(r5)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            int r5 = r2.getInt(r5)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            r4.e = r5     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            java.lang.String r5 = "__pn"
            int r5 = r2.getColumnIndex(r5)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            java.lang.String r5 = r2.getString(r5)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            r4.f = r5     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            java.lang.String r5 = "__av"
            int r5 = r2.getColumnIndex(r5)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            java.lang.String r5 = r2.getString(r5)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            r4.g = r5     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            java.lang.String r5 = "__vc"
            int r5 = r2.getColumnIndex(r5)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            java.lang.String r5 = r2.getString(r5)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            r4.h = r5     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            r0.add(r4)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            goto L21
        L8b:
            r0 = move-exception
            r1 = r2
            goto Lad
        L8e:
            r1 = r2
            goto Lc1
        L91:
            if (r2 == 0) goto L96
            r2.close()     // Catch: java.lang.Exception -> L99
        L96:
            r3.endTransaction()     // Catch: java.lang.Exception -> L99
        L99:
            android.content.Context r1 = r11.mContext
            com.umeng.analytics.process.c r1 = com.umeng.analytics.process.c.a(r1)
            r1.b(r12)
            goto Lc9
        La3:
            r0 = move-exception
            goto Lad
        La5:
            goto Lc1
        La7:
            r0 = move-exception
            r3 = r1
            goto Lad
        Laa:
            r3 = r1
            goto Lc1
        Lad:
            if (r1 == 0) goto Lb2
            r1.close()     // Catch: java.lang.Exception -> Lb7
        Lb2:
            if (r3 == 0) goto Lb7
            r3.endTransaction()     // Catch: java.lang.Exception -> Lb7
        Lb7:
            android.content.Context r1 = r11.mContext
            com.umeng.analytics.process.c r1 = com.umeng.analytics.process.c.a(r1)
            r1.b(r12)
            throw r0
        Lc1:
            if (r1 == 0) goto Lc6
            r1.close()     // Catch: java.lang.Exception -> L99
        Lc6:
            if (r3 == 0) goto L99
            goto L96
        Lc9:
            return r0
    }

    public void createDBByProcess(java.lang.String r2) {
            r1 = this;
            android.content.Context r0 = r1.mContext     // Catch: java.lang.Exception -> L12
            com.umeng.analytics.process.c r0 = com.umeng.analytics.process.c.a(r0)     // Catch: java.lang.Exception -> L12
            r0.a(r2)     // Catch: java.lang.Exception -> L12
            android.content.Context r0 = r1.mContext     // Catch: java.lang.Exception -> L12
            com.umeng.analytics.process.c r0 = com.umeng.analytics.process.c.a(r0)     // Catch: java.lang.Exception -> L12
            r0.b(r2)     // Catch: java.lang.Exception -> L12
        L12:
            return
    }

    public void deleteEventDatas(java.lang.String r5, java.lang.String r6, java.util.List<com.umeng.analytics.process.UMProcessDBHelper.a> r7) {
            r4 = this;
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 == 0) goto L7
            return
        L7:
            r6 = 0
            android.content.Context r0 = r4.mContext     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5b
            com.umeng.analytics.process.c r0 = com.umeng.analytics.process.c.a(r0)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5b
            android.database.sqlite.SQLiteDatabase r0 = r0.a(r5)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5b
            r0.beginTransaction()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            int r1 = r7.size()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            if (r1 <= 0) goto L42
            r6 = 0
        L1c:
            if (r6 >= r1) goto L47
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            r2.<init>()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            java.lang.String r3 = "delete from __et_p where rowid="
            r2.append(r3)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            java.lang.Object r3 = r7.get(r6)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            com.umeng.analytics.process.UMProcessDBHelper$a r3 = (com.umeng.analytics.process.UMProcessDBHelper.a) r3     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            int r3 = r3.a     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            r2.append(r3)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            r0.execSQL(r2)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            int r6 = r6 + 1
            goto L1c
        L3d:
            r6 = move-exception
            goto L5d
        L3f:
            r6 = r0
            goto L6c
        L42:
            java.lang.String r7 = "__et_p"
            r0.delete(r7, r6, r6)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
        L47:
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            r0.endTransaction()
        L4d:
            android.content.Context r6 = r4.mContext
            com.umeng.analytics.process.c r6 = com.umeng.analytics.process.c.a(r6)
            r6.b(r5)
            return
        L57:
            r7 = move-exception
            r0 = r6
            r6 = r7
            goto L5d
        L5b:
            goto L6c
        L5d:
            if (r0 == 0) goto L62
            r0.endTransaction()
        L62:
            android.content.Context r7 = r4.mContext
            com.umeng.analytics.process.c r7 = com.umeng.analytics.process.c.a(r7)
            r7.b(r5)
            throw r6
        L6c:
            if (r6 == 0) goto L4d
            r6.endTransaction()
            goto L4d
    }

    public void deleteMainProcessEventDatasByIds(java.util.List<java.lang.Integer> r6) {
            r5 = this;
            java.lang.String r0 = "_main_"
            r1 = 0
            android.content.Context r2 = r5.mContext     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            com.umeng.analytics.process.c r2 = com.umeng.analytics.process.c.a(r2)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            android.database.sqlite.SQLiteDatabase r1 = r2.a(r0)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            r1.beginTransaction()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
        L14:
            boolean r2 = r6.hasNext()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            if (r2 == 0) goto L34
            java.lang.Object r2 = r6.next()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            java.lang.String r3 = "__et_p"
            java.lang.String r4 = "id=?"
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            r1.delete(r3, r4, r2)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            goto L14
        L30:
            r6 = move-exception
            goto L44
        L32:
            goto L53
        L34:
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
        L37:
            r1.endTransaction()
        L3a:
            android.content.Context r6 = r5.mContext
            com.umeng.analytics.process.c r6 = com.umeng.analytics.process.c.a(r6)
            r6.b(r0)
            return
        L44:
            if (r1 == 0) goto L49
            r1.endTransaction()
        L49:
            android.content.Context r1 = r5.mContext
            com.umeng.analytics.process.c r1 = com.umeng.analytics.process.c.a(r1)
            r1.b(r0)
            throw r6
        L53:
            if (r1 == 0) goto L3a
            goto L37
    }

    public void insertEvents(java.lang.String r2, org.json.JSONArray r3) {
            r1 = this;
            boolean r0 = com.umeng.commonsdk.statistics.AnalyticsConstants.SUB_PROCESS_EVENT
            if (r0 != 0) goto L5
            goto Lb
        L5:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Lc
        Lb:
            return
        Lc:
            java.util.List r3 = r1.datasAdapter(r2, r3)
            r1.insertEvents_(r2, r3)
            return
    }

    public void insertEventsInSubProcess(java.lang.String r3, org.json.JSONArray r4) {
            r2 = this;
            boolean r0 = com.umeng.commonsdk.statistics.AnalyticsConstants.SUB_PROCESS_EVENT
            if (r0 != 0) goto L5
            goto Lb
        L5:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto Lc
        Lb:
            return
        Lc:
            android.content.Context r0 = r2.mContext
            java.lang.String r0 = com.umeng.analytics.process.b.b(r0, r3)
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L25
            com.umeng.commonsdk.utils.FileLockUtil r3 = r2.mFileLock
            com.umeng.analytics.process.UMProcessDBHelper$InsertEventCallback r0 = r2.ekvCallBack
            r3.doFileOperateion(r1, r0, r4)
            return
        L25:
            r2.insertEvents(r3, r4)
            return
    }

    public void processDBToMain() {
            r3 = this;
            android.content.Context r0 = r3.mContext     // Catch: java.lang.Exception -> L14
            java.lang.String r0 = com.umeng.analytics.process.b.a(r0)     // Catch: java.lang.Exception -> L14
            com.umeng.analytics.process.UMProcessDBHelper$ProcessToMainCallback r1 = new com.umeng.analytics.process.UMProcessDBHelper$ProcessToMainCallback     // Catch: java.lang.Exception -> L14
            r2 = 0
            r1.<init>(r3, r2)     // Catch: java.lang.Exception -> L14
            com.umeng.analytics.process.UMProcessDBHelper$1 r2 = new com.umeng.analytics.process.UMProcessDBHelper$1     // Catch: java.lang.Exception -> L14
            r2.<init>(r3)     // Catch: java.lang.Exception -> L14
            com.umeng.analytics.process.DBFileTraversalUtil.traverseDBFiles(r0, r1, r2)     // Catch: java.lang.Exception -> L14
        L14:
            return
    }

    public org.json.JSONObject readMainEvents(long r19, java.util.List<java.lang.Integer> r21) {
            r18 = this;
            r1 = r18
            java.lang.String r0 = "pn"
            java.lang.String r2 = "_main_"
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            r4 = 0
            android.content.Context r5 = r1.mContext     // Catch: java.lang.Throwable -> L15d java.lang.Exception -> L160
            com.umeng.analytics.process.c r5 = com.umeng.analytics.process.c.a(r5)     // Catch: java.lang.Throwable -> L15d java.lang.Exception -> L160
            android.database.sqlite.SQLiteDatabase r6 = r5.a(r2)     // Catch: java.lang.Throwable -> L15d java.lang.Exception -> L160
            r6.beginTransaction()     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            java.lang.String r7 = "__et_p"
            r12 = 0
            r13 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r4 = r6.query(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            if (r4 == 0) goto L148
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            r5.<init>()     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            java.lang.String r7 = ""
        L2e:
            boolean r8 = r4.moveToNext()     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            if (r8 == 0) goto L107
            java.lang.String r8 = "id"
            int r8 = r4.getColumnIndex(r8)     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            int r8 = r4.getInt(r8)     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            java.lang.String r9 = "__t"
            int r9 = r4.getColumnIndex(r9)     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            int r9 = r4.getInt(r9)     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            java.lang.String r10 = "__i"
            int r10 = r4.getColumnIndex(r10)     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            java.lang.String r10 = r4.getString(r10)     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            java.lang.String r11 = "__s"
            int r11 = r4.getColumnIndex(r11)     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            java.lang.String r11 = r4.getString(r11)     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            java.lang.String r12 = "__pn"
            int r12 = r4.getColumnIndex(r12)     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            java.lang.String r12 = r4.getString(r12)     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            java.lang.String r13 = "__av"
            int r13 = r4.getColumnIndex(r13)     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            java.lang.String r13 = r4.getString(r13)     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            boolean r14 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            if (r14 == 0) goto L77
            goto L2e
        L77:
            boolean r14 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            if (r14 == 0) goto L7e
            r7 = r13
        L7e:
            boolean r14 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            if (r14 != 0) goto L103
            r14 = 2049(0x801, float:2.871E-42)
            if (r9 != r14) goto L103
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            com.umeng.common.a r14 = com.umeng.common.a.a()     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            java.lang.String r11 = r14.b(r11)     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            r9.<init>(r11)     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            java.lang.String r11 = r9.optString(r0)     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            boolean r14 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            if (r14 != 0) goto Laf
            java.lang.String r14 = "unknown"
            boolean r11 = r14.equals(r11)     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            if (r11 == 0) goto Lcc
            goto Laf
        La8:
            r0 = move-exception
            goto L17d
        Lab:
            r5 = r4
            r4 = r6
            goto L161
        Laf:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            r11.<init>()     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            android.content.Context r14 = r1.mContext     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            java.lang.String r14 = r14.getPackageName()     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            r11.append(r14)     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            java.lang.String r14 = ":"
            r11.append(r14)     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            r11.append(r12)     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            r9.put(r0, r11)     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
        Lcc:
            boolean r11 = r5.has(r10)     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            if (r11 == 0) goto Ld7
            org.json.JSONArray r11 = r5.optJSONArray(r10)     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            goto Ldc
        Ld7:
            org.json.JSONArray r11 = new org.json.JSONArray     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            r11.<init>()     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
        Ldc:
            long r14 = com.umeng.analytics.pro.q.a(r11)     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            long r16 = com.umeng.analytics.pro.q.a(r9)     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            long r16 = r16 + r14
            int r12 = (r16 > r19 ? 1 : (r16 == r19 ? 0 : -1))
            if (r12 <= 0) goto Leb
            goto L107
        Leb:
            boolean r12 = r7.equalsIgnoreCase(r13)     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            if (r12 != 0) goto Lf2
            goto L107
        Lf2:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            r12 = r21
            r12.add(r8)     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            r11.put(r9)     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            r5.put(r10, r11)     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            goto L2e
        L103:
            r12 = r21
            goto L2e
        L107:
            int r0 = r5.length()     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            if (r0 <= 0) goto L148
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            r0.<init>()     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            java.util.Iterator r7 = r5.keys()     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
        L116:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            if (r8 == 0) goto L13d
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            r8.<init>()     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            java.lang.String r10 = r5.optString(r9)     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            org.json.JSONArray r11 = new org.json.JSONArray     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            r11.<init>(r10)     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            r8.put(r9, r11)     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            int r9 = r8.length()     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            if (r9 <= 0) goto L116
            r0.put(r8)     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            goto L116
        L13d:
            int r5 = r0.length()     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            if (r5 <= 0) goto L148
            java.lang.String r5 = "ekv"
            r3.put(r5, r0)     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
        L148:
            r6.setTransactionSuccessful()     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
            if (r4 == 0) goto L150
            r4.close()
        L150:
            r6.endTransaction()     // Catch: java.lang.Throwable -> L153
        L153:
            android.content.Context r0 = r1.mContext
            com.umeng.analytics.process.c r0 = com.umeng.analytics.process.c.a(r0)
            r0.b(r2)
            goto L179
        L15d:
            r0 = move-exception
            r6 = r4
            goto L17d
        L160:
            r5 = r4
        L161:
            java.lang.String r0 = "MobclickRT"
            java.lang.String r6 = "--->>> 构建子进程事件数据异常，清除数据库数据。"
            com.umeng.commonsdk.debug.UMRTLog.e(r0, r6)     // Catch: java.lang.Throwable -> L17a
            java.lang.String r0 = "delete from __et_p"
            r4.execSQL(r0)     // Catch: java.lang.Throwable -> L17a
            r4.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L17a
            if (r5 == 0) goto L175
            r5.close()
        L175:
            r4.endTransaction()     // Catch: java.lang.Throwable -> L153
            goto L153
        L179:
            return r3
        L17a:
            r0 = move-exception
            r6 = r4
            r4 = r5
        L17d:
            if (r4 == 0) goto L182
            r4.close()
        L182:
            if (r6 == 0) goto L187
            r6.endTransaction()     // Catch: java.lang.Throwable -> L187
        L187:
            android.content.Context r3 = r1.mContext
            com.umeng.analytics.process.c r3 = com.umeng.analytics.process.c.a(r3)
            r3.b(r2)
            throw r0
    }

    public org.json.JSONObject readVersionInfoFromColumId(java.lang.Integer r14) {
            r13 = this;
            java.lang.String r0 = "__vc"
            java.lang.String r1 = "__av"
            java.lang.String r2 = "_main_"
            r3 = 0
            android.content.Context r4 = r13.mContext     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7d
            com.umeng.analytics.process.c r4 = com.umeng.analytics.process.c.a(r4)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7d
            android.database.sqlite.SQLiteDatabase r5 = r4.a(r2)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7d
            r5.beginTransaction()     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            java.lang.String r14 = java.lang.String.valueOf(r14)     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            java.lang.String r6 = "__et_p"
            java.lang.String r8 = "rowid=?"
            java.lang.String[] r9 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            r11 = 0
            r12 = 0
            r7 = 0
            r10 = 0
            android.database.Cursor r14 = r5.query(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L75 java.lang.Exception -> L77
            if (r14 == 0) goto L63
            boolean r4 = r14.moveToNext()     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L60
            if (r4 == 0) goto L63
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L60
            r4.<init>()     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L60
            int r3 = r14.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
            java.lang.String r3 = r14.getString(r3)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
            int r6 = r14.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
            java.lang.String r6 = r14.getString(r6)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
            boolean r7 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
            if (r7 != 0) goto L55
            r4.put(r1, r3)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
            goto L55
        L4f:
            r0 = move-exception
            r3 = r14
            goto L81
        L52:
        L53:
            r3 = r14
            goto L95
        L55:
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
            if (r1 != 0) goto L5e
            r4.put(r0, r6)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
        L5e:
            r3 = r4
            goto L63
        L60:
            r4 = r3
            goto L53
        L63:
            if (r14 == 0) goto L68
            r14.close()     // Catch: java.lang.Exception -> L6b
        L68:
            r5.endTransaction()     // Catch: java.lang.Exception -> L6b
        L6b:
            android.content.Context r14 = r13.mContext
            com.umeng.analytics.process.c r14 = com.umeng.analytics.process.c.a(r14)
            r14.b(r2)
            goto La9
        L75:
            r0 = move-exception
            goto L81
        L77:
            r4 = r3
            goto L95
        L7a:
            r0 = move-exception
            r5 = r3
            goto L81
        L7d:
            r4 = r3
            r5 = r4
            goto L95
        L81:
            if (r3 == 0) goto L86
            r3.close()     // Catch: java.lang.Exception -> L8b
        L86:
            if (r5 == 0) goto L8b
            r5.endTransaction()     // Catch: java.lang.Exception -> L8b
        L8b:
            android.content.Context r14 = r13.mContext
            com.umeng.analytics.process.c r14 = com.umeng.analytics.process.c.a(r14)
            r14.b(r2)
            throw r0
        L95:
            if (r3 == 0) goto L9a
            r3.close()     // Catch: java.lang.Exception -> L9f
        L9a:
            if (r5 == 0) goto L9f
            r5.endTransaction()     // Catch: java.lang.Exception -> L9f
        L9f:
            android.content.Context r14 = r13.mContext
            com.umeng.analytics.process.c r14 = com.umeng.analytics.process.c.a(r14)
            r14.b(r2)
            r3 = r4
        La9:
            return r3
    }
}
