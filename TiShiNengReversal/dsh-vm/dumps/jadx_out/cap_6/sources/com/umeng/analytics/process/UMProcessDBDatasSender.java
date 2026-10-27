package com.umeng.analytics.process;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UMProcessDBDatasSender implements com.umeng.commonsdk.framework.UMLogDataProtocol {
    public static final int UM_PROCESS_CONSTRUCTMESSAGE = 36946;
    public static final int UM_PROCESS_EVENT_KEY = 36945;
    private static java.util.concurrent.ScheduledThreadPoolExecutor executor;
    private static com.umeng.analytics.process.UMProcessDBDatasSender mInstance;
    private android.content.Context mContext;
    private java.util.List<java.lang.Integer> mGeneralBodyIds;
    private com.umeng.commonsdk.utils.FileLockUtil mLockUtil;
    private com.umeng.analytics.pro.o.c mPolicySelector;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class ConstructMessageCallback implements com.umeng.commonsdk.utils.FileLockCallback {
        final /* synthetic */ com.umeng.analytics.process.UMProcessDBDatasSender a;

        private ConstructMessageCallback(com.umeng.analytics.process.UMProcessDBDatasSender r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ ConstructMessageCallback(com.umeng.analytics.process.UMProcessDBDatasSender r1, com.umeng.analytics.process.UMProcessDBDatasSender.AnonymousClass1 r2) {
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
        public boolean onFileLock(java.lang.String r4) {
                r3 = this;
                com.umeng.analytics.process.UMProcessDBDatasSender r4 = r3.a
                android.content.Context r0 = com.umeng.analytics.process.UMProcessDBDatasSender.access$000(r4)
                long r0 = com.umeng.commonsdk.framework.UMEnvelopeBuild.maxDataSpace(r0)
                org.json.JSONObject r4 = r4.setupReportData(r0)
                r0 = 1
                if (r4 == 0) goto L45
                int r1 = r4.length()
                if (r1 >= r0) goto L18
                goto L45
            L18:
                java.lang.String r1 = "header"
                java.lang.Object r1 = r4.opt(r1)
                org.json.JSONObject r1 = (org.json.JSONObject) r1
                java.lang.String r2 = "content"
                java.lang.Object r4 = r4.opt(r2)
                org.json.JSONObject r4 = (org.json.JSONObject) r4
                com.umeng.analytics.process.UMProcessDBDatasSender r2 = r3.a
                android.content.Context r2 = com.umeng.analytics.process.UMProcessDBDatasSender.access$000(r2)
                if (r2 == 0) goto L45
                if (r1 == 0) goto L45
                if (r4 == 0) goto L45
                com.umeng.analytics.process.UMProcessDBDatasSender r2 = r3.a
                android.content.Context r2 = com.umeng.analytics.process.UMProcessDBDatasSender.access$000(r2)
                org.json.JSONObject r4 = com.umeng.commonsdk.framework.UMEnvelopeBuild.buildEnvelopeWithExtHeader(r2, r1, r4)
                if (r4 == 0) goto L45
                com.umeng.analytics.process.UMProcessDBDatasSender r1 = r3.a
                r1.removeCacheData(r4)
            L45:
                return r0
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(java.lang.String r1, java.lang.Object r2) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class ReplaceCallback implements com.umeng.commonsdk.utils.FileLockCallback {
        final /* synthetic */ com.umeng.analytics.process.UMProcessDBDatasSender a;

        private ReplaceCallback(com.umeng.analytics.process.UMProcessDBDatasSender r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ ReplaceCallback(com.umeng.analytics.process.UMProcessDBDatasSender r1, com.umeng.analytics.process.UMProcessDBDatasSender.AnonymousClass1 r2) {
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
                com.umeng.analytics.process.UMProcessDBDatasSender r0 = r4.a
                android.content.Context r0 = com.umeng.analytics.process.UMProcessDBDatasSender.access$000(r0)
                com.umeng.analytics.process.UMProcessDBHelper r0 = com.umeng.analytics.process.UMProcessDBHelper.getInstance(r0)
                r2 = 0
                r0.deleteEventDatas(r5, r2, r2)
                return r1
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(java.lang.String r1, java.lang.Object r2) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    static {
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = new java.util.concurrent.ScheduledThreadPoolExecutor
            r1 = 1
            r0.<init>(r1)
            com.umeng.analytics.process.UMProcessDBDatasSender.executor = r0
            return
    }

    private UMProcessDBDatasSender() {
            r1 = this;
            r1.<init>()
            com.umeng.commonsdk.utils.FileLockUtil r0 = new com.umeng.commonsdk.utils.FileLockUtil
            r0.<init>()
            r1.mLockUtil = r0
            return
    }

    static /* synthetic */ android.content.Context access$000(com.umeng.analytics.process.UMProcessDBDatasSender r0) {
            android.content.Context r0 = r0.mContext
            return r0
    }

    private void constructMessage() {
            r4 = this;
            int r0 = r4.defconProcesserHandler()
            if (r0 == 0) goto L7
            return
        L7:
            com.umeng.commonsdk.utils.FileLockUtil r0 = r4.mLockUtil
            android.content.Context r1 = r4.mContext
            java.lang.String r2 = ""
            java.lang.String r1 = com.umeng.analytics.process.b.b(r1, r2)
            com.umeng.analytics.process.UMProcessDBDatasSender$ConstructMessageCallback r2 = new com.umeng.analytics.process.UMProcessDBDatasSender$ConstructMessageCallback
            r3 = 0
            r2.<init>(r4, r3)
            r0.doFileOperateion(r1, r2)
            return
    }

    private int defconProcesserHandler() {
            r4 = this;
            com.umeng.analytics.pro.r r0 = com.umeng.analytics.pro.r.a()
            android.content.Context r1 = r4.mContext
            int r0 = r0.a(r1)
            if (r0 == 0) goto L26
            r1 = 0
            android.content.Context r2 = r4.mContext     // Catch: java.lang.Exception -> L1b
            java.lang.String r2 = com.umeng.analytics.process.b.a(r2)     // Catch: java.lang.Exception -> L1b
            com.umeng.analytics.process.UMProcessDBDatasSender$ReplaceCallback r3 = new com.umeng.analytics.process.UMProcessDBDatasSender$ReplaceCallback     // Catch: java.lang.Exception -> L1b
            r3.<init>(r4, r1)     // Catch: java.lang.Exception -> L1b
            com.umeng.analytics.process.DBFileTraversalUtil.traverseDBFiles(r2, r3, r1)     // Catch: java.lang.Exception -> L1b
        L1b:
            android.content.Context r2 = r4.mContext
            com.umeng.analytics.process.UMProcessDBHelper r2 = com.umeng.analytics.process.UMProcessDBHelper.getInstance(r2)
            java.lang.String r3 = "_main_"
            r2.deleteEventDatas(r3, r1, r1)
        L26:
            return r0
    }

    private org.json.JSONObject generalBody() {
            r7 = this;
            java.lang.String r0 = "userlevel"
            r1 = 0
            java.util.List<java.lang.Integer> r2 = r7.mGeneralBodyIds     // Catch: java.lang.Throwable -> L9f
            if (r2 != 0) goto Le
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9f
            r2.<init>()     // Catch: java.lang.Throwable -> L9f
            r7.mGeneralBodyIds = r2     // Catch: java.lang.Throwable -> L9f
        Le:
            android.content.Context r2 = r7.mContext     // Catch: java.lang.Throwable -> L9f
            com.umeng.analytics.process.UMProcessDBHelper r2 = com.umeng.analytics.process.UMProcessDBHelper.getInstance(r2)     // Catch: java.lang.Throwable -> L9f
            android.content.Context r3 = r7.mContext     // Catch: java.lang.Throwable -> L9f
            long r3 = com.umeng.commonsdk.framework.UMEnvelopeBuild.maxDataSpace(r3)     // Catch: java.lang.Throwable -> L9f
            r5 = 2000(0x7d0, double:9.88E-321)
            long r3 = r3 - r5
            java.util.List<java.lang.Integer> r5 = r7.mGeneralBodyIds     // Catch: java.lang.Throwable -> L9f
            org.json.JSONObject r1 = r2.readMainEvents(r3, r5)     // Catch: java.lang.Throwable -> L9f
            android.content.Context r2 = r7.mContext     // Catch: java.lang.Throwable -> L9f
            android.content.SharedPreferences r2 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r2)     // Catch: java.lang.Throwable -> L9f
            if (r2 == 0) goto L3a
            java.lang.String r3 = ""
            java.lang.String r2 = r2.getString(r0, r3)     // Catch: java.lang.Throwable -> L9f
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L9f
            if (r3 != 0) goto L3a
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L9f
        L3a:
            android.content.Context r0 = r7.mContext     // Catch: java.lang.Throwable -> L9f
            java.lang.String[] r0 = com.umeng.analytics.c.a(r0)     // Catch: java.lang.Throwable -> L9f
            if (r0 == 0) goto L72
            r2 = 0
            r3 = r0[r2]     // Catch: java.lang.Throwable -> L9f
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L9f
            if (r3 != 0) goto L72
            r3 = 1
            r4 = r0[r3]     // Catch: java.lang.Throwable -> L9f
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L9f
            if (r4 != 0) goto L72
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L9f
            r4.<init>()     // Catch: java.lang.Throwable -> L9f
            java.lang.String r5 = "provider"
            r2 = r0[r2]     // Catch: java.lang.Throwable -> L9f
            r4.put(r5, r2)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r2 = "puid"
            r0 = r0[r3]     // Catch: java.lang.Throwable -> L9f
            r4.put(r2, r0)     // Catch: java.lang.Throwable -> L9f
            int r0 = r4.length()     // Catch: java.lang.Throwable -> L9f
            if (r0 <= 0) goto L72
            java.lang.String r0 = "active_user"
            r1.put(r0, r4)     // Catch: java.lang.Throwable -> L9f
        L72:
            android.content.Context r0 = r7.mContext     // Catch: java.lang.Throwable -> L9f
            com.umeng.commonsdk.statistics.noise.ABTest r0 = com.umeng.commonsdk.statistics.noise.ABTest.getService(r0)     // Catch: java.lang.Throwable -> L9f
            boolean r0 = r0.isInTest()     // Catch: java.lang.Throwable -> L9f
            if (r0 == 0) goto L9f
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L9f
            r0.<init>()     // Catch: java.lang.Throwable -> L9f
            android.content.Context r2 = r7.mContext     // Catch: java.lang.Throwable -> L9f
            com.umeng.commonsdk.statistics.noise.ABTest r2 = com.umeng.commonsdk.statistics.noise.ABTest.getService(r2)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r2 = r2.getTestName()     // Catch: java.lang.Throwable -> L9f
            android.content.Context r3 = r7.mContext     // Catch: java.lang.Throwable -> L9f
            com.umeng.commonsdk.statistics.noise.ABTest r3 = com.umeng.commonsdk.statistics.noise.ABTest.getService(r3)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r3 = r3.getGroupInfo()     // Catch: java.lang.Throwable -> L9f
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r2 = "group_info"
            r1.put(r2, r0)     // Catch: java.lang.Throwable -> L9f
        L9f:
            return r1
    }

    private org.json.JSONObject generalHeader() {
            r8 = this;
            java.lang.String r0 = "$ud_da"
            java.lang.String r1 = "$pr_ve"
            java.lang.String r2 = "pr_ve"
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = com.umeng.analytics.AnalyticsConfig.mWrapperType     // Catch: java.lang.Throwable -> L112
            if (r4 == 0) goto L1f
            java.lang.String r4 = com.umeng.analytics.AnalyticsConfig.mWrapperVersion     // Catch: java.lang.Throwable -> L112
            if (r4 == 0) goto L1f
            java.lang.String r5 = "wrapper_version"
            r3.put(r5, r4)     // Catch: java.lang.Throwable -> L112
            java.lang.String r4 = "wrapper_type"
            java.lang.String r5 = com.umeng.analytics.AnalyticsConfig.mWrapperType     // Catch: java.lang.Throwable -> L112
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L112
        L1f:
            android.content.Context r4 = r8.mContext     // Catch: java.lang.Throwable -> L112
            int r4 = com.umeng.analytics.AnalyticsConfig.getVerticalType(r4)     // Catch: java.lang.Throwable -> L112
            java.lang.String r5 = "vertical_type"
            r3.put(r5, r4)     // Catch: java.lang.Throwable -> L112
            android.content.Context r4 = r8.mContext     // Catch: java.lang.Throwable -> L112
            int r4 = com.umeng.analytics.AnalyticsConfig.getVerticalType(r4)     // Catch: java.lang.Throwable -> L112
            r5 = 1
            java.lang.String r6 = "sdk_version"
            java.lang.String r7 = "9.6.5"
            if (r4 != r5) goto L49
            android.content.Context r4 = r8.mContext     // Catch: java.lang.Throwable -> L112
            java.lang.String r4 = com.umeng.analytics.AnalyticsConfig.getGameSdkVersion(r4)     // Catch: java.lang.Throwable -> L112
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L112
            if (r5 == 0) goto L44
            goto L45
        L44:
            r7 = r4
        L45:
            r3.put(r6, r7)     // Catch: java.lang.Throwable -> L112
            goto L4c
        L49:
            r3.put(r6, r7)     // Catch: java.lang.Throwable -> L112
        L4c:
            java.util.List<java.lang.Integer> r4 = r8.mGeneralBodyIds     // Catch: java.lang.Throwable -> L112
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L112
            if (r4 <= 0) goto L76
            android.content.Context r4 = r8.mContext     // Catch: java.lang.Throwable -> L112
            com.umeng.analytics.process.UMProcessDBHelper r4 = com.umeng.analytics.process.UMProcessDBHelper.getInstance(r4)     // Catch: java.lang.Throwable -> L112
            java.util.List<java.lang.Integer> r5 = r8.mGeneralBodyIds     // Catch: java.lang.Throwable -> L112
            r6 = 0
            java.lang.Object r5 = r5.get(r6)     // Catch: java.lang.Throwable -> L112
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L112
            org.json.JSONObject r4 = r4.readVersionInfoFromColumId(r5)     // Catch: java.lang.Throwable -> L112
            if (r4 == 0) goto L76
            java.lang.String r5 = "__av"
            java.lang.String r5 = r4.optString(r5)     // Catch: java.lang.Throwable -> L112
            java.lang.String r6 = "__vc"
            java.lang.String r4 = r4.optString(r6)     // Catch: java.lang.Throwable -> L112
            goto L79
        L76:
            java.lang.String r5 = ""
            r4 = r5
        L79:
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L112
            java.lang.String r7 = "app_version"
            if (r6 == 0) goto L8b
            android.content.Context r5 = r8.mContext     // Catch: java.lang.Throwable -> L112
            java.lang.String r5 = com.umeng.commonsdk.utils.UMUtils.getAppVersionName(r5)     // Catch: java.lang.Throwable -> L112
            r3.put(r7, r5)     // Catch: java.lang.Throwable -> L112
            goto L8e
        L8b:
            r3.put(r7, r5)     // Catch: java.lang.Throwable -> L112
        L8e:
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L112
            java.lang.String r6 = "version_code"
            if (r5 == 0) goto La0
            android.content.Context r4 = r8.mContext     // Catch: java.lang.Throwable -> L112
            java.lang.String r4 = com.umeng.commonsdk.utils.UMUtils.getAppVersionCode(r4)     // Catch: java.lang.Throwable -> L112
            r3.put(r6, r4)     // Catch: java.lang.Throwable -> L112
            goto La3
        La0:
            r3.put(r6, r4)     // Catch: java.lang.Throwable -> L112
        La3:
            android.content.Context r4 = r8.mContext     // Catch: java.lang.Throwable -> L112
            java.lang.String r4 = com.umeng.analytics.AnalyticsConfig.getSecretKey(r4)     // Catch: java.lang.Throwable -> L112
            java.lang.String r4 = com.umeng.commonsdk.statistics.common.HelperUtils.MD5(r4)     // Catch: java.lang.Throwable -> L112
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L112
            if (r5 != 0) goto Lb8
            java.lang.String r5 = "secret"
            r3.put(r5, r4)     // Catch: java.lang.Throwable -> L112
        Lb8:
            android.content.Context r4 = r8.mContext     // Catch: java.lang.Throwable -> L112
            r5 = 0
            java.lang.String r4 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r4, r2, r5)     // Catch: java.lang.Throwable -> L112
            android.content.Context r6 = r8.mContext     // Catch: java.lang.Throwable -> L112
            android.content.SharedPreferences r6 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r6)     // Catch: java.lang.Throwable -> L112
            android.content.Context r7 = r8.mContext     // Catch: java.lang.Throwable -> L112
            java.lang.String r2 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r7, r2, r5)     // Catch: java.lang.Throwable -> L112
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L112
            android.content.Context r2 = r8.mContext     // Catch: java.lang.Throwable -> L112
            java.lang.String r7 = "ud_da"
            java.lang.String r2 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r2, r7, r5)     // Catch: java.lang.Throwable -> L112
            r3.put(r0, r2)     // Catch: java.lang.Throwable -> L112
            java.lang.String r2 = "pro_ver"
            java.lang.String r5 = "1.0.0"
            r3.put(r2, r5)     // Catch: java.lang.Throwable -> L112
            boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L112
            if (r2 == 0) goto L112
            java.lang.String r2 = "vers_pre_version"
            java.lang.String r4 = "0"
            java.lang.String r2 = r6.getString(r2, r4)     // Catch: java.lang.Throwable -> L112
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L112
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L112
            java.lang.String r2 = "yyyy-MM-dd"
            java.util.Locale r4 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L112
            r1.<init>(r2, r4)     // Catch: java.lang.Throwable -> L112
            java.util.Date r2 = new java.util.Date     // Catch: java.lang.Throwable -> L112
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L112
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L112
            java.lang.String r1 = r1.format(r2)     // Catch: java.lang.Throwable -> L112
            java.lang.String r2 = "vers_date"
            java.lang.String r1 = r6.getString(r2, r1)     // Catch: java.lang.Throwable -> L112
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> L112
        L112:
            return r3
    }

    public static com.umeng.analytics.process.UMProcessDBDatasSender getInstance(android.content.Context r2) {
            com.umeng.analytics.process.UMProcessDBDatasSender r0 = com.umeng.analytics.process.UMProcessDBDatasSender.mInstance
            if (r0 != 0) goto L19
            java.lang.Class<com.umeng.analytics.process.UMProcessDBDatasSender> r0 = com.umeng.analytics.process.UMProcessDBDatasSender.class
            monitor-enter(r0)
            com.umeng.analytics.process.UMProcessDBDatasSender r1 = com.umeng.analytics.process.UMProcessDBDatasSender.mInstance     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.umeng.analytics.process.UMProcessDBDatasSender r1 = new com.umeng.analytics.process.UMProcessDBDatasSender     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.umeng.analytics.process.UMProcessDBDatasSender.mInstance = r1     // Catch: java.lang.Throwable -> L13
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
            com.umeng.analytics.process.UMProcessDBDatasSender r0 = com.umeng.analytics.process.UMProcessDBDatasSender.mInstance
            r0.mContext = r2
            return r0
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void removeCacheData(java.lang.Object r3) {
            r2 = this;
            if (r3 == 0) goto L43
            java.util.List<java.lang.Integer> r0 = r2.mGeneralBodyIds
            if (r0 == 0) goto L43
            int r0 = r0.size()
            if (r0 != 0) goto Ld
            goto L43
        Ld:
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            java.lang.String r0 = "analytics"
            java.lang.String r1 = com.umeng.commonsdk.statistics.b.a(r0)
            boolean r1 = r3.has(r1)
            if (r1 == 0) goto L43
            java.lang.String r0 = com.umeng.commonsdk.statistics.b.a(r0)
            org.json.JSONObject r3 = r3.optJSONObject(r0)
            if (r3 == 0) goto L43
            int r0 = r3.length()
            if (r0 <= 0) goto L43
            java.lang.String r0 = "ekv"
            boolean r3 = r3.has(r0)
            if (r3 == 0) goto L43
            android.content.Context r3 = r2.mContext
            com.umeng.analytics.process.UMProcessDBHelper r3 = com.umeng.analytics.process.UMProcessDBHelper.getInstance(r3)
            java.util.List<java.lang.Integer> r0 = r2.mGeneralBodyIds
            r3.deleteMainProcessEventDatasByIds(r0)
            java.util.List<java.lang.Integer> r3 = r2.mGeneralBodyIds
            r3.clear()
        L43:
            return
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public org.json.JSONObject setupReportData(long r7) {
            r6 = this;
            com.umeng.analytics.pro.r r7 = com.umeng.analytics.pro.r.a()
            android.content.Context r8 = r6.mContext
            int r7 = r7.a(r8)
            org.json.JSONObject r8 = r6.generalBody()
            int r0 = r8.length()
            r1 = 0
            if (r0 > 0) goto L16
            return r1
        L16:
            org.json.JSONObject r0 = r6.generalHeader()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L92
            r3.<init>()     // Catch: java.lang.Throwable -> L92
            r4 = 3
            java.lang.String r5 = "analytics"
            if (r7 != r4) goto L32
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L92
            r7.<init>()     // Catch: java.lang.Throwable -> L92
            r3.put(r5, r7)     // Catch: java.lang.Throwable -> L92
            goto L3b
        L32:
            int r7 = r8.length()     // Catch: java.lang.Throwable -> L92
            if (r7 <= 0) goto L3b
            r3.put(r5, r8)     // Catch: java.lang.Throwable -> L92
        L3b:
            if (r0 == 0) goto L48
            int r7 = r0.length()     // Catch: java.lang.Throwable -> L92
            if (r7 <= 0) goto L48
            java.lang.String r7 = "header"
            r2.put(r7, r0)     // Catch: java.lang.Throwable -> L92
        L48:
            int r7 = r3.length()     // Catch: java.lang.Throwable -> L92
            if (r7 <= 0) goto L92
            boolean r7 = r3.has(r5)     // Catch: java.lang.Throwable -> L92
            if (r7 == 0) goto L8d
            org.json.JSONObject r7 = r3.optJSONObject(r5)     // Catch: java.lang.Throwable -> L92
            int r8 = r7.length()     // Catch: java.lang.Throwable -> L92
            r0 = 1
            java.lang.String r4 = "userlevel"
            java.lang.String r5 = "active_user"
            if (r8 != r0) goto L75
            org.json.JSONObject r8 = r7.optJSONObject(r5)     // Catch: java.lang.Throwable -> L92
            if (r8 == 0) goto L6a
            return r1
        L6a:
            java.lang.String r8 = r7.optString(r4)     // Catch: java.lang.Throwable -> L92
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L92
            if (r8 != 0) goto L75
            return r1
        L75:
            int r8 = r7.length()     // Catch: java.lang.Throwable -> L92
            r0 = 2
            if (r8 != r0) goto L8d
            org.json.JSONObject r8 = r7.optJSONObject(r5)     // Catch: java.lang.Throwable -> L92
            if (r8 == 0) goto L8d
            java.lang.String r7 = r7.optString(r4)     // Catch: java.lang.Throwable -> L92
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L92
            if (r7 != 0) goto L8d
            return r1
        L8d:
            java.lang.String r7 = "content"
            r2.put(r7, r3)     // Catch: java.lang.Throwable -> L92
        L92:
            return r2
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void workEvent(java.lang.Object r4, int r5) {
            r3 = this;
            android.content.Context r4 = r3.mContext
            boolean r4 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r4)
            if (r4 != 0) goto L9
            goto L13
        L9:
            boolean r4 = com.umeng.commonsdk.utils.c.a()
            if (r4 == 0) goto L10
            goto L13
        L10:
            switch(r5) {
                case 36945: goto L1f;
                case 36946: goto L14;
                default: goto L13;
            }
        L13:
            return
        L14:
            java.lang.String r4 = "MobclickRT"
            java.lang.String r5 = "--->>> recv UM_PROCESS_CONSTRUCTMESSAGE msg."
            com.umeng.commonsdk.debug.UMRTLog.i(r4, r5)
            r3.constructMessage()
            return
        L1f:
            java.util.concurrent.ScheduledThreadPoolExecutor r4 = com.umeng.analytics.process.UMProcessDBDatasSender.executor
            com.umeng.analytics.process.UMProcessDBDatasSender$1 r5 = new com.umeng.analytics.process.UMProcessDBDatasSender$1
            r5.<init>(r3)
            r0 = 5
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            r4.schedule(r5, r0, r2)
            return
    }
}
