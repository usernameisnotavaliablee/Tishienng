package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class aj implements com.umeng.analytics.pro.aa {
    private java.util.Set<java.lang.Integer> a;

    public aj(java.util.Set<java.lang.Integer> r2) {
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
            java.util.Calendar r0 = java.util.Calendar.getInstance()     // Catch: java.lang.Throwable -> L6c
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L6c
            r0.setTimeInMillis(r1)     // Catch: java.lang.Throwable -> L6c
            r1 = 7
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L6c
            r2 = 1
            int r0 = r0 - r2
            if (r0 != 0) goto L15
            goto L16
        L15:
            r1 = r0
        L16:
            java.util.Set<java.lang.Integer> r0 = r5.a     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L25
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L6c
            boolean r0 = r0.contains(r3)     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L25
            return r2
        L25:
            java.lang.String r0 = ""
            java.util.Set<java.lang.Integer> r2 = r5.a     // Catch: java.lang.Throwable -> L6c
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L6c
        L2d:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L6c
            if (r3 == 0) goto L4e
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L6c
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L6c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r4.<init>()     // Catch: java.lang.Throwable -> L6c
            r4.append(r0)     // Catch: java.lang.Throwable -> L6c
            r4.append(r3)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = ","
            r4.append(r0)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L6c
            goto L2d
        L4e:
            java.lang.String r2 = "MobclickRT"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r3.<init>()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r4 = "WeekOn skipped. day of week: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L6c
            r3.append(r1)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = "; config: "
            r3.append(r1)     // Catch: java.lang.Throwable -> L6c
            r3.append(r0)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L6c
            com.umeng.commonsdk.debug.UMRTLog.i(r2, r0)     // Catch: java.lang.Throwable -> L6c
        L6c:
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
