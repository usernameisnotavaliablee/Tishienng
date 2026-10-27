package com.umeng.commonsdk.statistics.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class StatTracer implements com.umeng.commonsdk.statistics.internal.b {
    private static final java.lang.String KEY_CLIENT_REQUEST_FAILED = "failed_requests ";
    private static final java.lang.String KEY_CLIENT_REQUEST_LATENCY = "last_request_spent_ms";
    private static final java.lang.String KEY_CLIENT_REQUEST_SUCCESS = "successful_request";
    private static final java.lang.String KEY_CLIENT_REQUEST_TIME = "last_request_time";
    private static final java.lang.String KEY_FIRST_ACTIVATE_TIME = "first_activate_time";
    private static final java.lang.String KEY_LAST_REQ = "last_req";
    private static android.content.Context mContext;
    private final int MAX_REQUEST_LIMIT;
    private long firstActivateTime;
    private long lastRequestTime;
    public int mFailedRequest;
    private int mLastRequestLatency;
    public long mLastSuccessfulRequestTime;
    public int mSuccessfulRequest;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.commonsdk.statistics.internal.StatTracer$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a {
        public static final com.umeng.commonsdk.statistics.internal.StatTracer a = null;

        static {
                com.umeng.commonsdk.statistics.internal.StatTracer r0 = new com.umeng.commonsdk.statistics.internal.StatTracer
                r1 = 0
                r0.<init>(r1)
                com.umeng.commonsdk.statistics.internal.StatTracer.a.a = r0
                return
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            return
    }

    private StatTracer() {
            r2 = this;
            r2.<init>()
            r0 = 3600000(0x36ee80, float:5.044674E-39)
            r2.MAX_REQUEST_LIMIT = r0
            r0 = 0
            r2.lastRequestTime = r0
            r2.firstActivateTime = r0
            r2.init()
            return
    }

    /* synthetic */ StatTracer(com.umeng.commonsdk.statistics.internal.StatTracer.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.umeng.commonsdk.statistics.internal.StatTracer getInstance(android.content.Context r1) {
            android.content.Context r0 = com.umeng.commonsdk.statistics.internal.StatTracer.mContext
            if (r0 != 0) goto L16
            if (r1 == 0) goto L11
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            com.umeng.commonsdk.statistics.internal.StatTracer.mContext = r1
            goto L16
        L11:
            java.lang.String r1 = "inside StatTracer. please check context. context must not be null!"
            com.umeng.commonsdk.statistics.common.MLog.e(r1)
        L16:
            com.umeng.commonsdk.statistics.internal.StatTracer r1 = com.umeng.commonsdk.statistics.internal.StatTracer.a.a
            return r1
    }

    private void init() {
            r6 = this;
            android.content.Context r0 = com.umeng.commonsdk.statistics.internal.StatTracer.mContext
            android.content.SharedPreferences r0 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r0)
            java.lang.String r1 = "successful_request"
            r2 = 0
            int r1 = r0.getInt(r1, r2)
            r6.mSuccessfulRequest = r1
            java.lang.String r1 = "failed_requests "
            int r1 = r0.getInt(r1, r2)
            r6.mFailedRequest = r1
            java.lang.String r1 = "last_request_spent_ms"
            int r1 = r0.getInt(r1, r2)
            r6.mLastRequestLatency = r1
            java.lang.String r1 = "last_request_time"
            r2 = 0
            long r4 = r0.getLong(r1, r2)
            r6.mLastSuccessfulRequestTime = r4
            java.lang.String r1 = "last_req"
            long r0 = r0.getLong(r1, r2)
            r6.lastRequestTime = r0
            return
    }

    public long getFirstActivateTime() {
            r7 = this;
            android.content.Context r0 = com.umeng.commonsdk.statistics.internal.StatTracer.mContext
            android.content.SharedPreferences r0 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r0)
            android.content.Context r1 = com.umeng.commonsdk.statistics.internal.StatTracer.mContext
            android.content.SharedPreferences r1 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r1)
            java.lang.String r2 = "first_activate_time"
            r3 = 0
            long r5 = r1.getLong(r2, r3)
            r7.firstActivateTime = r5
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L2d
            long r3 = java.lang.System.currentTimeMillis()
            r7.firstActivateTime = r3
            android.content.SharedPreferences$Editor r0 = r0.edit()
            long r3 = r7.firstActivateTime
            android.content.SharedPreferences$Editor r0 = r0.putLong(r2, r3)
            r0.commit()
        L2d:
            long r0 = r7.firstActivateTime
            return r0
    }

    public long getLastReqTime() {
            r2 = this;
            long r0 = r2.lastRequestTime
            return r0
    }

    public int getLastRequestLatency() {
            r2 = this;
            int r0 = r2.mLastRequestLatency
            r1 = 3600000(0x36ee80, float:5.044674E-39)
            if (r0 <= r1) goto L8
            return r1
        L8:
            return r0
    }

    public boolean isFirstRequest() {
            r5 = this;
            long r0 = r5.mLastSuccessfulRequestTime
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public void logFailedRequest() {
            r1 = this;
            int r0 = r1.mFailedRequest
            int r0 = r0 + 1
            r1.mFailedRequest = r0
            return
    }

    public void logRequestEnd() {
            r4 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r4.lastRequestTime
            long r0 = r0 - r2
            int r1 = (int) r0
            r4.mLastRequestLatency = r1
            return
    }

    public void logRequestStart() {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2.lastRequestTime = r0
            return
    }

    public void logSuccessfulRequest(boolean r3) {
            r2 = this;
            int r0 = r2.mSuccessfulRequest
            int r0 = r0 + 1
            r2.mSuccessfulRequest = r0
            if (r3 == 0) goto Lc
            long r0 = r2.lastRequestTime
            r2.mLastSuccessfulRequestTime = r0
        Lc:
            return
    }

    @Override // com.umeng.commonsdk.statistics.internal.b
    public void onRequestEnd() {
            r0 = this;
            r0.logRequestEnd()
            return
    }

    @Override // com.umeng.commonsdk.statistics.internal.b
    public void onRequestFailed() {
            r0 = this;
            r0.logFailedRequest()
            return
    }

    @Override // com.umeng.commonsdk.statistics.internal.b
    public void onRequestStart() {
            r0 = this;
            r0.logRequestStart()
            return
    }

    @Override // com.umeng.commonsdk.statistics.internal.b
    public void onRequestSucceed(boolean r1) {
            r0 = this;
            r0.logSuccessfulRequest(r1)
            return
    }

    public void saveSate() {
            r4 = this;
            android.content.Context r0 = com.umeng.commonsdk.statistics.internal.StatTracer.mContext
            android.content.SharedPreferences r0 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r0)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "successful_request"
            int r2 = r4.mSuccessfulRequest
            android.content.SharedPreferences$Editor r0 = r0.putInt(r1, r2)
            java.lang.String r1 = "failed_requests "
            int r2 = r4.mFailedRequest
            android.content.SharedPreferences$Editor r0 = r0.putInt(r1, r2)
            java.lang.String r1 = "last_request_spent_ms"
            int r2 = r4.mLastRequestLatency
            android.content.SharedPreferences$Editor r0 = r0.putInt(r1, r2)
            java.lang.String r1 = "last_req"
            long r2 = r4.lastRequestTime
            android.content.SharedPreferences$Editor r0 = r0.putLong(r1, r2)
            java.lang.String r1 = "last_request_time"
            long r2 = r4.mLastSuccessfulRequestTime
            android.content.SharedPreferences$Editor r0 = r0.putLong(r1, r2)
            r0.commit()
            return
    }
}
