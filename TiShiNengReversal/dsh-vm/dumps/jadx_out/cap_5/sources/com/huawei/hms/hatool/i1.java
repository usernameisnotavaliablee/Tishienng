package com.huawei.hms.hatool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class i1 implements com.huawei.hms.hatool.v {
    private android.content.Context a;
    private java.lang.String b;
    private java.lang.String c;
    private java.lang.String d;

    public i1(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r1.<init>()
            android.content.Context r0 = com.huawei.hms.hatool.y0.q()
            r1.a = r0
            r1.b = r2
            r1.c = r3
            r1.d = r4
            return
    }

    private void a(java.lang.String r4, java.util.List<com.huawei.hms.hatool.f> r5) {
            r3 = this;
            android.util.Pair r4 = com.huawei.hms.hatool.q0.b(r4)
            java.lang.Object r0 = r4.first
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r4 = r4.second
            java.lang.String r4 = (java.lang.String) r4
            com.huawei.hms.hatool.h1 r1 = new com.huawei.hms.hatool.h1
            java.lang.String r2 = r3.d
            r1.<init>(r5, r0, r4, r2)
            r1.a()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r10 = this;
            java.lang.String r0 = "cached_v2_1"
            java.lang.String r1 = "stat_v2_1"
            java.lang.String r2 = "eventReportTask is running"
            java.lang.String r3 = "hmsSdk"
            com.huawei.hms.hatool.j1.h(r3, r2)
            android.content.Context r2 = r10.a
            boolean r2 = com.huawei.hms.hatool.h.a(r2)
            java.lang.String r4 = "alltype"
            if (r2 == 0) goto L1c
            java.lang.String r5 = "workKey is refresh,begin report all data"
            com.huawei.hms.hatool.j1.h(r3, r5)
            r10.c = r4
        L1c:
            r5 = 0
            android.content.Context r6 = r10.a     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L73 java.lang.IllegalArgumentException -> L75
            java.lang.String r7 = r10.b     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L73 java.lang.IllegalArgumentException -> L75
            java.lang.String r8 = r10.c     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L73 java.lang.IllegalArgumentException -> L75
            java.util.Map r6 = com.huawei.hms.hatool.i.b(r6, r7, r8)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L73 java.lang.IllegalArgumentException -> L75
            int r7 = r6.size()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L73 java.lang.IllegalArgumentException -> L75
            if (r7 != 0) goto L78
            java.lang.String r6 = "no have events to report: tag:%s : type:%s"
            java.lang.String r7 = r10.b     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L73 java.lang.IllegalArgumentException -> L75
            java.lang.String r8 = r10.c     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L73 java.lang.IllegalArgumentException -> L75
            r9 = 2
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L73 java.lang.IllegalArgumentException -> L75
            r9[r5] = r7     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L73 java.lang.IllegalArgumentException -> L75
            r7 = 1
            r9[r7] = r8     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L73 java.lang.IllegalArgumentException -> L75
            com.huawei.hms.hatool.j1.f(r3, r6, r9)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L73 java.lang.IllegalArgumentException -> L75
            java.lang.String r2 = r10.c
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L55
            android.content.Context r2 = r10.a
            java.lang.String[] r3 = new java.lang.String[r5]
            com.huawei.hms.hatool.l.d(r2, r1, r3)
            android.content.Context r1 = r10.a
            java.lang.String[] r2 = new java.lang.String[r5]
            com.huawei.hms.hatool.l.d(r1, r0, r2)
            return
        L55:
            java.lang.String r2 = r10.b
            java.lang.String r3 = r10.c
            java.lang.String r2 = com.huawei.hms.hatool.q0.d(r2, r3)
            android.content.Context r3 = r10.a
            java.lang.String[] r4 = new java.lang.String[]{r2}
            com.huawei.hms.hatool.l.d(r3, r1, r4)
            android.content.Context r1 = r10.a
            java.lang.String[] r2 = new java.lang.String[]{r2}
            com.huawei.hms.hatool.l.d(r1, r0, r2)
            return
        L70:
            r2 = move-exception
            goto L172
        L73:
            r6 = move-exception
            goto Ld0
        L75:
            r6 = move-exception
            goto L11a
        L78:
            java.util.Set r6 = r6.entrySet()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L73 java.lang.IllegalArgumentException -> L75
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L73 java.lang.IllegalArgumentException -> L75
        L80:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L73 java.lang.IllegalArgumentException -> L75
            if (r7 == 0) goto L9c
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L73 java.lang.IllegalArgumentException -> L75
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L73 java.lang.IllegalArgumentException -> L75
            java.lang.Object r8 = r7.getKey()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L73 java.lang.IllegalArgumentException -> L75
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L73 java.lang.IllegalArgumentException -> L75
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L73 java.lang.IllegalArgumentException -> L75
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L73 java.lang.IllegalArgumentException -> L75
            r10.a(r8, r7)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L73 java.lang.IllegalArgumentException -> L75
            goto L80
        L9c:
            java.lang.String r6 = r10.c
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto Lb4
            android.content.Context r4 = r10.a
            java.lang.String[] r6 = new java.lang.String[r5]
            com.huawei.hms.hatool.l.d(r4, r1, r6)
            android.content.Context r1 = r10.a
            java.lang.String[] r4 = new java.lang.String[r5]
            com.huawei.hms.hatool.l.d(r1, r0, r4)
            goto L163
        Lb4:
            java.lang.String r4 = r10.b
            java.lang.String r5 = r10.c
            java.lang.String r4 = com.huawei.hms.hatool.q0.d(r4, r5)
            android.content.Context r5 = r10.a
            java.lang.String[] r6 = new java.lang.String[]{r4}
            com.huawei.hms.hatool.l.d(r5, r1, r6)
            android.content.Context r1 = r10.a
            java.lang.String[] r4 = new java.lang.String[]{r4}
            com.huawei.hms.hatool.l.d(r1, r0, r4)
            goto L163
        Ld0:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L70
            r7.<init>()     // Catch: java.lang.Throwable -> L70
            java.lang.String r8 = "readEventRecords handData Exception:"
            r7.append(r8)     // Catch: java.lang.Throwable -> L70
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> L70
            r7.append(r6)     // Catch: java.lang.Throwable -> L70
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Throwable -> L70
            com.huawei.hms.hatool.j1.l(r3, r6)     // Catch: java.lang.Throwable -> L70
            java.lang.String r6 = r10.c
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto Lff
            android.content.Context r4 = r10.a
            java.lang.String[] r6 = new java.lang.String[r5]
            com.huawei.hms.hatool.l.d(r4, r1, r6)
            android.content.Context r1 = r10.a
            java.lang.String[] r4 = new java.lang.String[r5]
            com.huawei.hms.hatool.l.d(r1, r0, r4)
            goto L163
        Lff:
            java.lang.String r4 = r10.b
            java.lang.String r5 = r10.c
            java.lang.String r4 = com.huawei.hms.hatool.q0.d(r4, r5)
            android.content.Context r5 = r10.a
            java.lang.String[] r6 = new java.lang.String[]{r4}
            com.huawei.hms.hatool.l.d(r5, r1, r6)
            android.content.Context r1 = r10.a
            java.lang.String[] r4 = new java.lang.String[]{r4}
            com.huawei.hms.hatool.l.d(r1, r0, r4)
            goto L163
        L11a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L70
            r7.<init>()     // Catch: java.lang.Throwable -> L70
            java.lang.String r8 = "readEventRecords handData IllegalArgumentException:"
            r7.append(r8)     // Catch: java.lang.Throwable -> L70
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> L70
            r7.append(r6)     // Catch: java.lang.Throwable -> L70
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Throwable -> L70
            com.huawei.hms.hatool.j1.l(r3, r6)     // Catch: java.lang.Throwable -> L70
            java.lang.String r6 = r10.c
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L149
            android.content.Context r4 = r10.a
            java.lang.String[] r6 = new java.lang.String[r5]
            com.huawei.hms.hatool.l.d(r4, r1, r6)
            android.content.Context r1 = r10.a
            java.lang.String[] r4 = new java.lang.String[r5]
            com.huawei.hms.hatool.l.d(r1, r0, r4)
            goto L163
        L149:
            java.lang.String r4 = r10.b
            java.lang.String r5 = r10.c
            java.lang.String r4 = com.huawei.hms.hatool.q0.d(r4, r5)
            android.content.Context r5 = r10.a
            java.lang.String[] r6 = new java.lang.String[]{r4}
            com.huawei.hms.hatool.l.d(r5, r1, r6)
            android.content.Context r1 = r10.a
            java.lang.String[] r4 = new java.lang.String[]{r4}
            com.huawei.hms.hatool.l.d(r1, r0, r4)
        L163:
            if (r2 == 0) goto L171
            java.lang.String r0 = "refresh local key"
            com.huawei.hms.hatool.j1.h(r3, r0)
            com.huawei.hms.hatool.t0 r0 = com.huawei.hms.hatool.t0.g()
            r0.d()
        L171:
            return
        L172:
            java.lang.String r3 = r10.c
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L189
            android.content.Context r3 = r10.a
            java.lang.String[] r4 = new java.lang.String[r5]
            com.huawei.hms.hatool.l.d(r3, r1, r4)
            android.content.Context r1 = r10.a
            java.lang.String[] r3 = new java.lang.String[r5]
            com.huawei.hms.hatool.l.d(r1, r0, r3)
            goto L1a3
        L189:
            java.lang.String r3 = r10.b
            java.lang.String r4 = r10.c
            java.lang.String r3 = com.huawei.hms.hatool.q0.d(r3, r4)
            android.content.Context r4 = r10.a
            java.lang.String[] r5 = new java.lang.String[]{r3}
            com.huawei.hms.hatool.l.d(r4, r1, r5)
            android.content.Context r1 = r10.a
            java.lang.String[] r3 = new java.lang.String[]{r3}
            com.huawei.hms.hatool.l.d(r1, r0, r3)
        L1a3:
            throw r2
    }
}
