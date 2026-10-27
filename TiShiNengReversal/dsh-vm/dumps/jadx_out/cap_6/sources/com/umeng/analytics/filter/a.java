package com.umeng.analytics.filter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a extends com.umeng.analytics.filter.EventList {
    private com.umeng.analytics.filter.d a;
    private java.lang.Object b;

    public a(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.b = r1
            return
    }

    @Override // com.umeng.analytics.filter.EventList
    protected void eventListChange() {
            r4 = this;
            java.lang.String r0 = r4.mEventList
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1d
            java.lang.Object r0 = r4.b
            monitor-enter(r0)
            r1 = 0
            r4.a = r1     // Catch: java.lang.Throwable -> L1a
            com.umeng.analytics.filter.d r1 = new com.umeng.analytics.filter.d     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = r4.mEventList     // Catch: java.lang.Throwable -> L1a
            r3 = 0
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L1a
            r4.a = r1     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return
        L1a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r1
        L1d:
            return
    }

    @Override // com.umeng.analytics.filter.EventList
    public boolean matchHit(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = r4.mEventList
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 != 0) goto L26
            java.lang.Object r0 = r4.b
            monitor-enter(r0)
            com.umeng.analytics.filter.d r2 = r4.a     // Catch: java.lang.Throwable -> L1a
            if (r2 != 0) goto L1c
            com.umeng.analytics.filter.d r2 = new com.umeng.analytics.filter.d     // Catch: java.lang.Throwable -> L1a
            java.lang.String r3 = r4.mEventList     // Catch: java.lang.Throwable -> L1a
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L1a
            r4.a = r2     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r5 = move-exception
            goto L24
        L1c:
            com.umeng.analytics.filter.d r1 = r4.a     // Catch: java.lang.Throwable -> L1a
            boolean r5 = r1.a(r5)     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return r5
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r5
        L26:
            return r1
    }

    @Override // com.umeng.analytics.filter.EventList
    public void setMD5ClearFlag(boolean r1) {
            r0 = this;
            com.umeng.analytics.AnalyticsConfig.CLEAR_EKV_BL = r1
            return
    }
}
