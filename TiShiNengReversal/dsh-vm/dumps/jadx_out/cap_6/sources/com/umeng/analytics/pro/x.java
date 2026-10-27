package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class x implements com.umeng.analytics.pro.w {
    private long a;

    x() {
            r2 = this;
            r2.<init>()
            long r0 = com.umeng.analytics.AnalyticsConfig.kContinueSessionMillis
            r2.a = r0
            return
    }

    @Override // com.umeng.analytics.pro.w
    public long a() {
            r2 = this;
            long r0 = r2.a
            return r0
    }

    @Override // com.umeng.analytics.pro.w
    public java.lang.String a(android.content.Context r4) {
            r3 = this;
            java.lang.String r4 = com.umeng.commonsdk.utils.UMUtils.getAppkey(r4)
            long r0 = java.lang.System.currentTimeMillis()
            if (r4 == 0) goto L23
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r4)
            java.lang.String r4 = "02:00:00:00:00:00"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            java.lang.String r4 = com.umeng.commonsdk.utils.UMUtils.MD5(r4)
            return r4
        L23:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r0 = "Appkey is null or empty, Please check!"
            r4.<init>(r0)
            throw r4
    }

    @Override // com.umeng.analytics.pro.w
    public void a(long r1) {
            r0 = this;
            r0.a = r1
            return
    }

    @Override // com.umeng.analytics.pro.w
    public void a(android.content.Context r5, java.lang.String r6) {
            r4 = this;
            long r0 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r5 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r5)     // Catch: java.lang.Exception -> L25
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch: java.lang.Exception -> L25
            java.lang.String r2 = "session_id"
            r5.putString(r2, r6)     // Catch: java.lang.Exception -> L25
            java.lang.String r6 = "session_end_time"
            r2 = 0
            r5.putLong(r6, r2)     // Catch: java.lang.Exception -> L25
            java.lang.String r6 = "a_start_time"
            r5.putLong(r6, r0)     // Catch: java.lang.Exception -> L25
            java.lang.String r6 = "a_end_time"
            r5.putLong(r6, r2)     // Catch: java.lang.Exception -> L25
            r5.commit()     // Catch: java.lang.Exception -> L25
        L25:
            return
    }

    @Override // com.umeng.analytics.pro.w
    public boolean a(long r9, long r11) {
            r8 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 0
            r3 = 0
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 == 0) goto L14
            long r9 = r0 - r9
            long r5 = r8.a
            int r7 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r7 >= 0) goto L14
            return r2
        L14:
            int r9 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r9 <= 0) goto L21
            long r0 = r0 - r11
            long r9 = r8.a
            int r11 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r11 <= 0) goto L21
            r9 = 1
            return r9
        L21:
            return r2
    }
}
