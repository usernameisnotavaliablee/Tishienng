package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class v3 extends com.huawei.hms.scankit.p.u3 {
    private static java.lang.String o = "AiDetect";
    private static java.lang.String p = "defaultDetect";
    private int h;
    protected java.lang.String i;
    protected java.lang.String j;
    protected long k;
    protected long l;
    protected long m;
    protected boolean n;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends java.text.SimpleDateFormat {
        final /* synthetic */ com.huawei.hms.scankit.p.v3 a;

        a(com.huawei.hms.scankit.p.v3 r1, java.lang.String r2) {
                r0 = this;
                r0.a = r1
                r0.<init>(r2)
                java.lang.String r1 = "UTC"
                java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)
                r0.setTimeZone(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends java.util.LinkedHashMap<java.lang.String, java.lang.String> {
        final /* synthetic */ com.huawei.hms.scankit.p.v3 a;

        b(com.huawei.hms.scankit.p.v3 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                r1.g()
                java.util.LinkedHashMap<java.lang.String, java.lang.String> r1 = r1.b
                r0.putAll(r1)
                return
        }
    }

    static {
            return
    }

    public v3(android.os.Bundle r4, java.lang.String r5) {
            r3 = this;
            android.content.Context r0 = com.huawei.hms.feature.DynamicModuleInitializer.getContext()
            android.content.Context r0 = r0.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            r3.<init>(r4, r0)
            r4 = -1001(0xfffffffffffffc17, float:NaN)
            r3.h = r4
            java.lang.String r4 = com.huawei.hms.scankit.p.u3.d
            r3.i = r4
            java.lang.String r4 = com.huawei.hms.scankit.p.u3.e
            r3.j = r4
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r4 = r3.b
            com.huawei.hms.scankit.p.v3$a r0 = new com.huawei.hms.scankit.p.v3$a
            java.lang.String r1 = "yyyyMMddHHmmss.SSS"
            r0.<init>(r3, r1)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r0 = r0.format(r1)
            java.lang.String r1 = "callTime"
            r4.put(r1, r0)
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r4 = r3.b
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "transId"
            r4.put(r1, r0)
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r4 = r3.b
            java.lang.String r0 = "apiName"
            r4.put(r0, r5)
            return
    }

    private void j() {
            r1 = this;
            r0 = -1001(0xfffffffffffffc17, float:NaN)
            r1.h = r0
            java.lang.String r0 = com.huawei.hms.scankit.p.u3.d
            r1.i = r0
            java.lang.String r0 = com.huawei.hms.scankit.p.u3.e
            r1.j = r0
            return
    }

    public void a(long r1) {
            r0 = this;
            r0.k = r1
            return
    }

    public void a(long r1, long r3, boolean r5) {
            r0 = this;
            r0.l = r1
            r0.m = r3
            r0.n = r5
            return
    }

    public void a(com.huawei.hms.ml.scan.HmsScan[] r5) {
            r4 = this;
            if (r5 == 0) goto L1e
            int r0 = r5.length
            r4.h = r0
            int r0 = r5.length
            r1 = 0
        L7:
            if (r1 >= r0) goto L1e
            r2 = r5[r1]
            int r3 = r2.scanType
            java.lang.String r3 = com.huawei.hms.scankit.p.u3.a(r3)
            r4.i = r3
            int r2 = r2.scanTypeForm
            java.lang.String r2 = com.huawei.hms.scankit.p.u3.b(r2)
            r4.j = r2
            int r1 = r1 + 1
            goto L7
        L1e:
            return
    }

    public void c(int r1) {
            r0 = this;
            r0.h = r1
            return
    }

    public void h() {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2.c = r0
            return
    }

    public void i() {
            r8 = this;
            java.lang.String r0 = "HaLog60000"
            boolean r1 = r8.a()     // Catch: java.lang.Exception -> L98 java.lang.NullPointerException -> L9e
            if (r1 == 0) goto La3
            com.huawei.hms.scankit.p.v3$b r1 = new com.huawei.hms.scankit.p.v3$b     // Catch: java.lang.Exception -> L98 java.lang.NullPointerException -> L9e
            r1.<init>(r8)     // Catch: java.lang.Exception -> L98 java.lang.NullPointerException -> L9e
            java.lang.String r2 = "result"
            int r3 = r8.h     // Catch: java.lang.Exception -> L98 java.lang.NullPointerException -> L9e
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Exception -> L98 java.lang.NullPointerException -> L9e
            r1.put(r2, r3)     // Catch: java.lang.Exception -> L98 java.lang.NullPointerException -> L9e
            java.lang.String r2 = "costTime"
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L98 java.lang.NullPointerException -> L9e
            long r5 = r8.c     // Catch: java.lang.Exception -> L98 java.lang.NullPointerException -> L9e
            long r3 = r3 - r5
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Exception -> L98 java.lang.NullPointerException -> L9e
            r1.put(r2, r3)     // Catch: java.lang.Exception -> L98 java.lang.NullPointerException -> L9e
            java.lang.String r2 = "scanType"
            java.lang.String r3 = r8.i     // Catch: java.lang.Exception -> L98 java.lang.NullPointerException -> L9e
            r1.put(r2, r3)     // Catch: java.lang.Exception -> L98 java.lang.NullPointerException -> L9e
            java.lang.String r2 = "sceneType"
            java.lang.String r3 = r8.j     // Catch: java.lang.Exception -> L98 java.lang.NullPointerException -> L9e
            r1.put(r2, r3)     // Catch: java.lang.Exception -> L98 java.lang.NullPointerException -> L9e
            long r2 = r8.l     // Catch: java.lang.Exception -> L98 java.lang.NullPointerException -> L9e
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L8b
            long r2 = r8.m     // Catch: java.lang.Exception -> L98 java.lang.NullPointerException -> L9e
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L8b
            boolean r2 = r8.n     // Catch: java.lang.Exception -> L98 java.lang.NullPointerException -> L9e
            java.lang.String r3 = "defaultDetectTime"
            java.lang.String r4 = "recognizeMode"
            if (r2 == 0) goto L6c
            java.lang.String r2 = com.huawei.hms.scankit.p.v3.o     // Catch: java.lang.Exception -> L98 java.lang.NullPointerException -> L9e
            r1.put(r4, r2)     // Catch: java.lang.Exception -> L98 java.lang.NullPointerException -> L9e
            long r4 = r8.l     // Catch: java.lang.Exception -> L98 java.lang.NullPointerException -> L9e
            long r6 = r8.k     // Catch: java.lang.Exception -> L98 java.lang.NullPointerException -> L9e
            long r4 = r4 - r6
            java.lang.String r2 = java.lang.String.valueOf(r4)     // Catch: java.lang.Exception -> L98 java.lang.NullPointerException -> L9e
            r1.put(r3, r2)     // Catch: java.lang.Exception -> L98 java.lang.NullPointerException -> L9e
            java.lang.String r2 = "aiDetectTime"
            long r3 = r8.m     // Catch: java.lang.Exception -> L98 java.lang.NullPointerException -> L9e
            long r5 = r8.l     // Catch: java.lang.Exception -> L98 java.lang.NullPointerException -> L9e
            long r3 = r3 - r5
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Exception -> L98 java.lang.NullPointerException -> L9e
            r1.put(r2, r3)     // Catch: java.lang.Exception -> L98 java.lang.NullPointerException -> L9e
            goto L7d
        L6c:
            java.lang.String r2 = com.huawei.hms.scankit.p.v3.p     // Catch: java.lang.Exception -> L98 java.lang.NullPointerException -> L9e
            r1.put(r4, r2)     // Catch: java.lang.Exception -> L98 java.lang.NullPointerException -> L9e
            long r4 = r8.l     // Catch: java.lang.Exception -> L98 java.lang.NullPointerException -> L9e
            long r6 = r8.k     // Catch: java.lang.Exception -> L98 java.lang.NullPointerException -> L9e
            long r4 = r4 - r6
            java.lang.String r2 = java.lang.String.valueOf(r4)     // Catch: java.lang.Exception -> L98 java.lang.NullPointerException -> L9e
            r1.put(r3, r2)     // Catch: java.lang.Exception -> L98 java.lang.NullPointerException -> L9e
        L7d:
            java.lang.String r2 = "recognizeSuccessTime"
            long r3 = r8.m     // Catch: java.lang.Exception -> L98 java.lang.NullPointerException -> L9e
            long r5 = r8.k     // Catch: java.lang.Exception -> L98 java.lang.NullPointerException -> L9e
            long r3 = r3 - r5
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Exception -> L98 java.lang.NullPointerException -> L9e
            r1.put(r2, r3)     // Catch: java.lang.Exception -> L98 java.lang.NullPointerException -> L9e
        L8b:
            com.huawei.hms.scankit.p.a4 r2 = com.huawei.hms.scankit.p.a4.b()     // Catch: java.lang.Exception -> L98 java.lang.NullPointerException -> L9e
            java.lang.String r3 = "60000"
            r2.b(r3, r1)     // Catch: java.lang.Exception -> L98 java.lang.NullPointerException -> L9e
            r8.j()     // Catch: java.lang.Exception -> L98 java.lang.NullPointerException -> L9e
            return
        L98:
            java.lang.String r1 = "logEnd Exception"
            com.huawei.hms.scankit.p.o4.b(r0, r1)
            goto La3
        L9e:
            java.lang.String r1 = "nullPoint"
            com.huawei.hms.scankit.p.o4.b(r0, r1)
        La3:
            return
    }
}
