package cn.jiguang.analytics.page;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class PushSA {
    public static final java.lang.String CACHE_PATH = "push_stat_cache.json";
    private static final java.lang.String KEY_SESSION_ID = "session_id";
    public static final java.lang.String REPORT_ACTIVE_LAUNCH = "active_launch";
    public static final java.lang.String REPORT_ACTIVE_TERMINATE = "active_terminate";
    private static final java.lang.String TAG = "PushSA";
    public static boolean isOnPauseInvoke;
    public static boolean isOnResumeInvoke;
    private boolean activitySwitch;
    private java.lang.String cur_activity;
    private final java.lang.Object cur_session_file_lock;
    private java.lang.String cur_session_id;
    private boolean firstResume;
    private org.json.JSONObject flow_cache;
    private long interval;
    private long latestPauseTime;
    private long latestResumeTime;
    private boolean stat_enable;
    private long tempTimelong;




    private static final class a {
        private static final cn.jiguang.analytics.page.PushSA a = null;

        static {
                cn.jiguang.analytics.page.PushSA r0 = new cn.jiguang.analytics.page.PushSA
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.analytics.page.PushSA.a.a = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.analytics.page.PushSA a() {
                cn.jiguang.analytics.page.PushSA r0 = cn.jiguang.analytics.page.PushSA.a.a
                return r0
        }
    }

    static class b extends cn.jiguang.au.b {
        boolean a;

        /* renamed from: b, reason: collision with root package name */
        android.content.Context f598b;

        /* renamed from: c, reason: collision with root package name */
        cn.jiguang.analytics.page.PushSA f599c;

        public b(boolean r1, android.content.Context r2, cn.jiguang.analytics.page.PushSA r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f598b = r2
                r0.f599c = r3
                java.lang.String r1 = "PushSA"
                r0.f668h = r1
                return
        }

        @Override // cn.jiguang.au.b
        public void a() {
                r2 = this;
                boolean r0 = r2.a     // Catch: java.lang.Throwable -> L13
                if (r0 == 0) goto Lc
                cn.jiguang.analytics.page.PushSA r0 = r2.f599c     // Catch: java.lang.Throwable -> L13
                android.content.Context r1 = r2.f598b     // Catch: java.lang.Throwable -> L13
                cn.jiguang.analytics.page.PushSA.access$000(r0, r1)     // Catch: java.lang.Throwable -> L13
                return
            Lc:
                cn.jiguang.analytics.page.PushSA r0 = r2.f599c     // Catch: java.lang.Throwable -> L13
                android.content.Context r1 = r2.f598b     // Catch: java.lang.Throwable -> L13
                cn.jiguang.analytics.page.PushSA.access$100(r0, r1)     // Catch: java.lang.Throwable -> L13
            L13:
                return
        }
    }

    static {
            return
    }

    private PushSA() {
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.cur_activity = r0
            r5.cur_session_id = r0
            r1 = 30
            r5.interval = r1
            r1 = 0
            r5.latestResumeTime = r1
            r5.latestPauseTime = r1
            r3 = 1
            r5.firstResume = r3
            r4 = 0
            r5.activitySwitch = r4
            r5.stat_enable = r3
            r5.tempTimelong = r1
            r5.flow_cache = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r5.cur_session_file_lock = r0
            return
    }

    /* synthetic */ PushSA(cn.jiguang.analytics.page.PushSA.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void access$000(cn.jiguang.analytics.page.PushSA r0, android.content.Context r1) {
            r0.sendLogRoutine(r1)
            return
    }

    static /* synthetic */ void access$100(cn.jiguang.analytics.page.PushSA r0, android.content.Context r1) {
            r0.saveLogRoutine(r1)
            return
    }

    private void clearCurrentLogFile(android.content.Context r1) {
            r0 = this;
            java.lang.String r1 = "push_stat_cache.json"
            cn.jiguang.av.i.d(r1)
            return
    }

    private org.json.JSONObject createNewSession(android.content.Context r3, long r4) {
            r2 = this;
            java.lang.String r4 = r2.generateSessionID(r3, r4)
            r2.cur_session_id = r4
            cn.jiguang.e.a r4 = cn.jiguang.e.a.ac()
            long r0 = r2.latestResumeTime
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            cn.jiguang.e.a r4 = r4.a(r5)
            cn.jiguang.e.a r5 = cn.jiguang.e.a.af()
            java.lang.String r0 = r2.cur_session_id
            cn.jiguang.e.a r5 = r5.a(r0)
            r0 = 2
            cn.jiguang.e.a[] r0 = new cn.jiguang.e.a[r0]
            r1 = 0
            r0[r1] = r4
            r4 = 1
            r0[r4] = r5
            cn.jiguang.e.b.a(r3, r0)
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            r2.wrapDate(r4)     // Catch: org.json.JSONException -> L3f
            java.lang.String r5 = "active_launch"
            cn.jiguang.d.a.a(r3, r4, r5)     // Catch: org.json.JSONException -> L3f
            java.lang.String r3 = "session_id"
            java.lang.String r5 = r2.cur_session_id     // Catch: org.json.JSONException -> L3f
            r4.put(r3, r5)     // Catch: org.json.JSONException -> L3f
            return r4
        L3f:
            r3 = 0
            return r3
    }

    private java.lang.String generateSessionID(android.content.Context r3, long r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = cn.jiguang.d.a.e(r3)
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L12
            r0.append(r3)
        L12:
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            java.lang.String r3 = cn.jiguang.av.v.d(r3)
            return r3
    }

    private org.json.JSONObject getFlowCache(android.content.Context r1) {
            r0 = this;
            org.json.JSONObject r1 = r0.flow_cache
            if (r1 != 0) goto Lc
            java.lang.String r1 = "push_stat_cache.json"
            org.json.JSONObject r1 = cn.jiguang.av.i.a(r1)
            r0.flow_cache = r1
        Lc:
            org.json.JSONObject r1 = r0.flow_cache
            return r1
    }

    public static cn.jiguang.analytics.page.PushSA getInstance() {
            cn.jiguang.analytics.page.PushSA r0 = cn.jiguang.analytics.page.PushSA.a.a()
            return r0
    }

    private boolean invokeCheck(android.content.Context r4, java.lang.String r5) {
            r3 = this;
            boolean r0 = r3.stat_enable
            r1 = 0
            java.lang.String r2 = "PushSA"
            if (r0 != 0) goto Ld
            java.lang.String r4 = "stat function has been disabled"
            cn.jiguang.w.f.f(r2, r4)
            return r1
        Ld:
            if (r4 != 0) goto L15
            java.lang.String r4 = "context is null"
            cn.jiguang.w.f.f(r2, r4)
            return r1
        L15:
            boolean r4 = r4 instanceof android.app.Application
            if (r4 == 0) goto L2e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Context should be an Activity on this method : "
            r4.append(r0)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            cn.jiguang.w.f.m(r2, r4)
            return r1
        L2e:
            r4 = 1
            return r4
    }

    private boolean isNewSession(android.content.Context r10) {
            r9 = this;
            boolean r0 = r9.firstResume
            r1 = 1000(0x3e8, double:4.94E-321)
            r3 = 0
            if (r0 == 0) goto L65
            r9.firstResume = r3
            java.lang.String r0 = "statistics start"
            java.lang.String r4 = "PushSA"
            cn.jiguang.w.f.c(r4, r0)
            cn.jiguang.e.a r0 = cn.jiguang.e.a.ae()
            java.lang.Object r10 = cn.jiguang.e.b.a(r10, r0)
            java.lang.Long r10 = (java.lang.Long) r10
            long r5 = r10.longValue()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "lastPause:"
            r10.append(r0)
            r10.append(r5)
            java.lang.String r0 = ",latestResumeTime:"
            r10.append(r0)
            long r7 = r9.latestResumeTime
            r10.append(r7)
            java.lang.String r0 = ",interval:"
            r10.append(r0)
            long r7 = r9.interval
            long r7 = r7 * r1
            r10.append(r7)
            java.lang.String r0 = ",a:"
            r10.append(r0)
            long r7 = r9.latestResumeTime
            long r7 = r7 - r5
            r10.append(r7)
            java.lang.String r10 = r10.toString()
            cn.jiguang.w.f.c(r4, r10)
            r7 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 <= 0) goto L73
            long r7 = r9.latestResumeTime
            long r7 = r7 - r5
            long r4 = r9.interval
            long r4 = r4 * r1
            int r10 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r10 > 0) goto L73
            return r3
        L65:
            long r4 = r9.latestResumeTime
            long r6 = r9.latestPauseTime
            long r4 = r4 - r6
            long r6 = r9.interval
            long r6 = r6 * r1
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 > 0) goto L73
            return r3
        L73:
            r10 = 1
            return r10
    }

    private void saveCurrentLog(android.content.Context r1, org.json.JSONObject r2) {
            r0 = this;
            java.lang.String r1 = "push_stat_cache.json"
            cn.jiguang.av.i.a(r1, r2)
            return
    }

    private void saveLogRoutine(android.content.Context r6) {
            r5 = this;
            if (r6 != 0) goto L3
            goto L4c
        L3:
            java.lang.Object r0 = r5.cur_session_file_lock
            monitor-enter(r0)
            cn.jiguang.e.a r1 = cn.jiguang.e.a.ae()     // Catch: java.lang.Throwable -> L40
            long r2 = r5.latestPauseTime     // Catch: java.lang.Throwable -> L40
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L40
            cn.jiguang.e.a r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L40
            cn.jiguang.e.a r2 = cn.jiguang.e.a.ad()     // Catch: java.lang.Throwable -> L40
            long r3 = r5.latestPauseTime     // Catch: java.lang.Throwable -> L40
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L40
            cn.jiguang.e.a r2 = r2.a(r3)     // Catch: java.lang.Throwable -> L40
            r3 = 2
            cn.jiguang.e.a[] r3 = new cn.jiguang.e.a[r3]     // Catch: java.lang.Throwable -> L40
            r4 = 0
            r3[r4] = r1     // Catch: java.lang.Throwable -> L40
            r1 = 1
            r3[r1] = r2     // Catch: java.lang.Throwable -> L40
            cn.jiguang.e.b.a(r6, r3)     // Catch: java.lang.Throwable -> L40
            boolean r1 = cn.jiguang.av.b.d(r6)     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L4b
            org.json.JSONObject r1 = r5.getFlowCache(r6)     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L42
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L40
            r1.<init>()     // Catch: java.lang.Throwable -> L40
            goto L42
        L40:
            r6 = move-exception
            goto L4d
        L42:
            r5.updateFlowInfo(r1, r6)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L45
        L45:
            r5.updateFlowCache(r1)     // Catch: java.lang.Throwable -> L40
            r5.saveCurrentLog(r6, r1)     // Catch: java.lang.Throwable -> L40
        L4b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
        L4c:
            return
        L4d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            throw r6
    }

    private void sendLogRoutine(android.content.Context r5) {
            r4 = this;
            boolean r0 = r4.isNewSession(r5)
            if (r0 == 0) goto L52
            java.lang.String r0 = "PushSA"
            java.lang.String r1 = "new statistics session"
            cn.jiguang.w.f.f(r0, r1)
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            long r1 = r4.latestResumeTime
            org.json.JSONObject r1 = r4.createNewSession(r5, r1)
            if (r1 == 0) goto L1d
            r0.put(r1)
        L1d:
            java.lang.Object r1 = r4.cur_session_file_lock
            monitor-enter(r1)
            org.json.JSONObject r2 = r4.getFlowCache(r5)     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L3a
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L32
            if (r3 <= 0) goto L3a
            java.lang.String r3 = "active_terminate"
            cn.jiguang.d.a.a(r5, r2, r3)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            goto L34
        L32:
            r5 = move-exception
            goto L50
        L34:
            r4.clearCurrentLogFile(r5)     // Catch: java.lang.Throwable -> L32
            r3 = 0
            r4.flow_cache = r3     // Catch: java.lang.Throwable -> L32
        L3a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L4c
            int r1 = r2.length()
            if (r1 <= 0) goto L4c
            boolean r1 = cn.jiguang.av.b.d(r5)
            if (r1 == 0) goto L4c
            r0.put(r2)
        L4c:
            cn.jiguang.d.a.a(r5, r0)
            return
        L50:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            throw r5
        L52:
            cn.jiguang.e.a r0 = cn.jiguang.e.a.af()
            java.lang.Object r5 = cn.jiguang.e.b.b(r5, r0)
            java.lang.String r5 = (java.lang.String) r5
            r4.cur_session_id = r5
            return
    }

    private void updateFlowCache(org.json.JSONObject r1) {
            r0 = this;
            r0.flow_cache = r1
            return
    }

    private void updateFlowInfo(org.json.JSONObject r9, android.content.Context r10) {
            r8 = this;
            cn.jiguang.e.a r0 = cn.jiguang.e.a.ac()
            java.lang.Object r0 = cn.jiguang.e.b.a(r10, r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r2 = 1000(0x3e8, double:4.94E-321)
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 > 0) goto L3b
            long r0 = r8.latestPauseTime
            long r6 = r8.tempTimelong
            long r0 = r0 - r6
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L21
            long r0 = r0 / r2
            goto L23
        L21:
            r0 = 10
        L23:
            cn.jiguang.e.a r4 = cn.jiguang.e.a.ac()
            long r5 = r8.tempTimelong
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            cn.jiguang.e.a r4 = r4.a(r5)
            r5 = 1
            cn.jiguang.e.a[] r5 = new cn.jiguang.e.a[r5]
            r6 = 0
            r5[r6] = r4
            cn.jiguang.e.b.a(r10, r5)
            goto L40
        L3b:
            long r4 = r8.latestPauseTime
            long r4 = r4 - r0
            long r0 = r4 / r2
        L40:
            java.lang.String r10 = "duration"
            r9.put(r10, r0)
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 / r2
            java.lang.String r10 = "itime"
            r9.put(r10, r0)
            java.lang.String r10 = "session_id"
            java.lang.String r0 = r8.cur_session_id
            r9.put(r10, r0)
            r8.wrapDate(r9)
            return
    }

    private void wrapDate(org.json.JSONObject r5) {
            r4 = this;
            java.lang.String r0 = cn.jiguang.av.e.b()
            java.lang.String r1 = "_"
            java.lang.String[] r2 = r0.split(r1)
            r3 = 0
            r2 = r2[r3]
            java.lang.String[] r0 = r0.split(r1)
            r1 = 1
            r0 = r0[r1]
            java.lang.String r1 = "date"
            r5.put(r1, r2)
            java.lang.String r1 = "time"
            r5.put(r1, r0)
            return
    }

    public long getInterval() {
            r2 = this;
            long r0 = r2.interval
            return r0
    }

    public boolean isStatEnable() {
            r1 = this;
            boolean r0 = r1.stat_enable
            return r0
    }

    public void onFragmentPause(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = r2.activitySwitch
            java.lang.String r1 = "PushSA"
            if (r0 != 0) goto Lc
            java.lang.String r3 = "JCoreInterface.onPause() must be called after called JCoreInterface.onResume() in this Activity or Fragment"
            cn.jiguang.w.f.c(r1, r3)
            return
        Lc:
            r0 = 0
            r2.activitySwitch = r0
            java.lang.String r0 = r2.cur_activity
            if (r0 == 0) goto L34
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L34
            long r0 = java.lang.System.currentTimeMillis()
            r2.latestPauseTime = r0
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            java.lang.String r4 = "SCHEDULE_TASK"
            cn.jiguang.analytics.page.PushSA$2 r0 = new cn.jiguang.analytics.page.PushSA$2     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = "PushSA#onFragmentPause"
            r0.<init>(r2, r1, r3)     // Catch: java.lang.Throwable -> L33
            cn.jiguang.au.d.a(r4, r0)     // Catch: java.lang.Throwable -> L33
        L33:
            return
        L34:
            java.lang.String r3 = "page name didn't match the last one passed by onResume"
            cn.jiguang.w.f.m(r1, r3)
            return
    }

    public void onFragmentResume(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = r2.activitySwitch
            if (r0 == 0) goto Lc
            java.lang.String r3 = "PushSA"
            java.lang.String r4 = "JCoreInterface.onResume() must be called after called JCoreInterface.onPause() in last Activity or Fragment"
            cn.jiguang.w.f.c(r3, r4)
            return
        Lc:
            r0 = 1
            r2.activitySwitch = r0
            r2.cur_activity = r4
            long r0 = java.lang.System.currentTimeMillis()
            r2.latestResumeTime = r0
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            java.lang.String r4 = "SCHEDULE_TASK"
            cn.jiguang.analytics.page.PushSA$1 r0 = new cn.jiguang.analytics.page.PushSA$1     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = "PushSA#onFragmentResume"
            r0.<init>(r2, r1, r3)     // Catch: java.lang.Throwable -> L2b
            cn.jiguang.au.d.a(r4, r0)     // Catch: java.lang.Throwable -> L2b
        L2b:
            return
    }

    public void onKillProcess(android.content.Context r4) {
            r3 = this;
            java.lang.String r0 = r3.cur_activity     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L22
            boolean r0 = r3.activitySwitch     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L22
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L22
            r3.latestPauseTime = r0     // Catch: java.lang.Throwable -> L22
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L22
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)     // Catch: java.lang.Throwable -> L22
            java.lang.String r0 = "SCHEDULE_TASK"
            cn.jiguang.analytics.page.PushSA$3 r1 = new cn.jiguang.analytics.page.PushSA$3
            java.lang.String r2 = "PushSA#onKillProcess"
            r1.<init>(r3, r2, r4)
            cn.jiguang.au.d.a(r0, r1)
        L22:
            return
    }

    public void onPause(android.content.Context r4) {
            r3 = this;
            java.lang.String r0 = "onPause"
            boolean r0 = r3.invokeCheck(r4, r0)
            if (r0 != 0) goto L9
            goto L51
        L9:
            r0 = 1
            cn.jiguang.analytics.page.PushSA.isOnPauseInvoke = r0
            r1 = r4
            android.app.TabActivity r1 = (android.app.TabActivity) r1     // Catch: java.lang.Throwable -> L12
            r3.activitySwitch = r0     // Catch: java.lang.Throwable -> L12
            goto L13
        L12:
        L13:
            boolean r0 = r3.activitySwitch
            if (r0 != 0) goto L18
            goto L51
        L18:
            r0 = 0
            r3.activitySwitch = r0
            java.lang.String r1 = r3.cur_activity
            if (r1 == 0) goto L4a
            java.lang.Class r2 = r4.getClass()
            java.lang.String r2 = r2.getName()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L4a
            long r1 = java.lang.System.currentTimeMillis()
            r3.latestPauseTime = r1
            long r1 = r3.latestResumeTime
            r3.tempTimelong = r1
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L51
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)     // Catch: java.lang.Throwable -> L51
            java.lang.String r1 = "SCHEDULE_TASK"
            cn.jiguang.analytics.page.PushSA$b r2 = new cn.jiguang.analytics.page.PushSA$b     // Catch: java.lang.Throwable -> L51
            r2.<init>(r0, r4, r3)     // Catch: java.lang.Throwable -> L51
            cn.jiguang.au.d.a(r1, r2)     // Catch: java.lang.Throwable -> L51
            goto L51
        L4a:
            java.lang.String r4 = "PushSA"
            java.lang.String r0 = "the activity pass by onPause didn't match last one passed by onResume"
            cn.jiguang.w.f.f(r4, r0)
        L51:
            return
    }

    public void onResume(android.content.Context r4) {
            r3 = this;
            java.lang.String r0 = "onResume"
            boolean r0 = r3.invokeCheck(r4, r0)
            if (r0 != 0) goto L9
            goto L3d
        L9:
            r0 = 1
            cn.jiguang.analytics.page.PushSA.isOnResumeInvoke = r0
            r1 = r4
            android.app.TabActivity r1 = (android.app.TabActivity) r1     // Catch: java.lang.Throwable -> L13
            r1 = 0
            r3.activitySwitch = r1     // Catch: java.lang.Throwable -> L13
            goto L14
        L13:
        L14:
            boolean r1 = r3.activitySwitch
            if (r1 == 0) goto L19
            goto L3d
        L19:
            r3.activitySwitch = r0
            long r1 = java.lang.System.currentTimeMillis()
            r3.latestResumeTime = r1
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getName()
            r3.cur_activity = r1
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L3d
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = "SCHEDULE_TASK"
            cn.jiguang.analytics.page.PushSA$b r2 = new cn.jiguang.analytics.page.PushSA$b     // Catch: java.lang.Throwable -> L3d
            r2.<init>(r0, r4, r3)     // Catch: java.lang.Throwable -> L3d
            cn.jiguang.au.d.a(r1, r2)     // Catch: java.lang.Throwable -> L3d
        L3d:
            return
    }

    public void setInterval(long r1) {
            r0 = this;
            r0.interval = r1
            return
    }

    public void setStatEnable(boolean r1) {
            r0 = this;
            r0.stat_enable = r1
            return
    }
}
