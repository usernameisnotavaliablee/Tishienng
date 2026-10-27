package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ad implements com.umeng.analytics.pro.aa {
    private java.util.Set<java.lang.Integer> a;

    public ad(java.util.Set<java.lang.Integer> r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r2)
            r1.a = r0
            return
    }

    @Override // com.umeng.analytics.pro.aa
    public boolean a() {
            r5 = this;
            java.util.Calendar r0 = java.util.Calendar.getInstance()     // Catch: java.lang.Throwable -> L61
            r1 = 11
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L61
            java.util.Set<java.lang.Integer> r1 = r5.a     // Catch: java.lang.Throwable -> L61
            if (r1 == 0) goto L1a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L61
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L61
            if (r1 == 0) goto L1a
            r0 = 1
            return r0
        L1a:
            java.lang.String r1 = ""
            java.util.Set<java.lang.Integer> r2 = r5.a     // Catch: java.lang.Throwable -> L61
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L61
        L22:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L61
            if (r3 == 0) goto L43
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L61
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L61
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61
            r4.<init>()     // Catch: java.lang.Throwable -> L61
            r4.append(r1)     // Catch: java.lang.Throwable -> L61
            r4.append(r3)     // Catch: java.lang.Throwable -> L61
            java.lang.String r1 = ","
            r4.append(r1)     // Catch: java.lang.Throwable -> L61
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L61
            goto L22
        L43:
            java.lang.String r2 = "MobclickRT"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61
            r3.<init>()     // Catch: java.lang.Throwable -> L61
            java.lang.String r4 = "HourOn skipped. hour of day: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L61
            r3.append(r0)     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = "; config: "
            r3.append(r0)     // Catch: java.lang.Throwable -> L61
            r3.append(r1)     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L61
            com.umeng.commonsdk.debug.UMRTLog.i(r2, r0)     // Catch: java.lang.Throwable -> L61
        L61:
            r0 = 0
            return r0
    }

    @Override // com.umeng.analytics.pro.aa
    public boolean b() {
            r1 = this;
            boolean r0 = r1.a()
            r0 = r0 ^ 1
            return r0
    }

    @Override // com.umeng.analytics.pro.aa
    public long c() {
            r2 = this;
            r0 = 0
            return r0
    }
}
