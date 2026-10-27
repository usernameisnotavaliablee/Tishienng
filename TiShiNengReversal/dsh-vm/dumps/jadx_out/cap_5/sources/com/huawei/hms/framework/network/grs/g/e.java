package com.huawei.hms.framework.network.grs.g;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class e {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements java.lang.Runnable {
        final /* synthetic */ long a;
        final /* synthetic */ java.util.ArrayList b;
        final /* synthetic */ org.json.JSONArray c;

        a(long r1, java.util.ArrayList r3, org.json.JSONArray r4) {
                r0 = this;
                r0.a = r1
                r0.b = r3
                r0.c = r4
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                p1.a r0 = new p1.a
                r0.<init>()
                long r1 = r5.a
                java.lang.String r3 = "total_time"
                r0.put(r3, r1)
                java.util.ArrayList r1 = r5.b
                java.util.Iterator r1 = r1.iterator()
            L12:
                boolean r2 = r1.hasNext()
                r3 = 1
                if (r2 == 0) goto L36
                java.lang.Object r2 = r1.next()
                com.huawei.hms.framework.network.grs.g.d r2 = (com.huawei.hms.framework.network.grs.g.d) r2
                boolean r4 = r2.D()
                if (r4 != 0) goto L2b
                boolean r4 = r2.B()
                if (r4 == 0) goto L12
            L2b:
                java.util.LinkedHashMap r2 = com.huawei.hms.framework.network.grs.g.e.a(r2)
                r0.put(r2)
                r1.remove()
                goto L57
            L36:
                java.util.ArrayList r1 = r5.b
                int r1 = r1.size()
                if (r1 <= 0) goto L57
                java.util.ArrayList r1 = r5.b
                int r2 = r1.size()
                int r2 = r2 - r3
                java.lang.Object r1 = r1.get(r2)
                com.huawei.hms.framework.network.grs.g.d r1 = (com.huawei.hms.framework.network.grs.g.d) r1
                java.util.LinkedHashMap r2 = com.huawei.hms.framework.network.grs.g.e.a(r1)
                r0.put(r2)
                java.util.ArrayList r2 = r5.b
                r2.remove(r1)
            L57:
                java.util.ArrayList r1 = r5.b
                int r1 = r1.size()
                if (r1 <= 0) goto L80
                java.util.ArrayList r1 = r5.b
                java.util.Iterator r1 = r1.iterator()
            L65:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L80
                java.lang.Object r2 = r1.next()
                com.huawei.hms.framework.network.grs.g.d r2 = (com.huawei.hms.framework.network.grs.g.d) r2
                org.json.JSONObject r4 = new org.json.JSONObject
                java.util.LinkedHashMap r2 = com.huawei.hms.framework.network.grs.g.e.a(r2)
                r4.<init>(r2)
                org.json.JSONArray r2 = r5.c
                r2.put(r4)
                goto L65
            L80:
                org.json.JSONArray r1 = r5.c
                int r1 = r1.length()
                if (r1 <= 0) goto L93
                org.json.JSONArray r1 = r5.c
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "failed_info"
                r0.put(r2, r1)
            L93:
                org.json.JSONObject r1 = new org.json.JSONObject
                java.util.LinkedHashMap r2 = r0.get()
                r1.<init>(r2)
                java.lang.Object[] r2 = new java.lang.Object[r3]
                r3 = 0
                r2[r3] = r1
                java.lang.String r1 = "HaReportHelper"
                java.lang.String r3 = "grssdk report data to aiops is: %s"
                com.huawei.hms.framework.common.Logger.d(r1, r3, r2)
                com.huawei.hms.framework.common.hianalytics.HianalyticsHelper r1 = com.huawei.hms.framework.common.hianalytics.HianalyticsHelper.getInstance()
                java.util.LinkedHashMap r0 = r0.get()
                java.lang.String r2 = "grs_request"
                r1.onEvent(r0, r2)
                return
        }
    }

    public e() {
            r1 = this;
            r1.<init>()
            return
    }

    static /* synthetic */ java.util.LinkedHashMap a(com.huawei.hms.framework.network.grs.g.d r0) {
            java.util.LinkedHashMap r0 = c(r0)
            return r0
    }

    public static void b(java.util.ArrayList<com.huawei.hms.framework.network.grs.g.d> r1, long r2, org.json.JSONArray r4, android.content.Context r5) {
            if (r5 == 0) goto L24
            if (r1 == 0) goto L24
            int r0 = r1.size()
            if (r0 <= 0) goto L24
            com.huawei.hms.framework.common.hianalytics.HianalyticsHelper r0 = com.huawei.hms.framework.common.hianalytics.HianalyticsHelper.getInstance()
            boolean r5 = r0.isEnableReport(r5)
            if (r5 == 0) goto L24
            com.huawei.hms.framework.common.hianalytics.HianalyticsHelper r5 = com.huawei.hms.framework.common.hianalytics.HianalyticsHelper.getInstance()
            java.util.concurrent.ExecutorService r5 = r5.getReportExecutor()
            com.huawei.hms.framework.network.grs.g.e$a r0 = new com.huawei.hms.framework.network.grs.g.e$a
            r0.<init>(r2, r1, r4)
            r5.submit(r0)
        L24:
            return
    }

    private static java.util.LinkedHashMap<java.lang.String, java.lang.String> c(com.huawei.hms.framework.network.grs.g.d r6) {
            com.huawei.hms.framework.common.hianalytics.LinkedHashMapPack r0 = new com.huawei.hms.framework.common.hianalytics.LinkedHashMapPack
            r0.<init>()
            java.lang.Exception r1 = r6.p()
            java.lang.String r2 = "exception_name"
            java.lang.String r3 = "error_code"
            if (r1 == 0) goto L30
            int r4 = com.huawei.hms.framework.common.ExceptionCode.getErrorCodeFromException(r1)
            long r4 = (long) r4
            r0.put(r3, r4)
            java.lang.Class r3 = r1.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r0.put(r2, r3)
            java.lang.String r1 = r1.getMessage()
            java.lang.String r1 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r1)
            java.lang.String r2 = "message"
            r0.put(r2, r1)
            goto L40
        L30:
            int r1 = r6.f()
            long r4 = (long) r1
            r0.put(r3, r4)
            int r1 = r6.k()
            long r3 = (long) r1
            r0.put(r2, r3)
        L40:
            java.lang.String r1 = "domain"
            java.net.URL r2 = new java.net.URL     // Catch: java.net.MalformedURLException -> L53
            java.lang.String r3 = r6.A()     // Catch: java.net.MalformedURLException -> L53
            r2.<init>(r3)     // Catch: java.net.MalformedURLException -> L53
            java.lang.String r2 = r2.getHost()     // Catch: java.net.MalformedURLException -> L53
            r0.put(r1, r2)     // Catch: java.net.MalformedURLException -> L53
            goto L5b
        L53:
            r1 = move-exception
            java.lang.String r2 = "HaReportHelper"
            java.lang.String r3 = "report host MalformedURLException"
            com.huawei.hms.framework.common.Logger.w(r2, r3, r1)
        L5b:
            long r1 = r6.w()
            java.lang.String r3 = "req_start_time"
            r0.put(r3, r1)
            long r1 = r6.v()
            java.lang.String r3 = "req_end_time"
            r0.put(r3, r1)
            long r1 = r6.x()
            java.lang.String r6 = "req_total_time"
            r0.put(r6, r1)
            java.util.LinkedHashMap r6 = r0.getAll()
            return r6
    }
}
