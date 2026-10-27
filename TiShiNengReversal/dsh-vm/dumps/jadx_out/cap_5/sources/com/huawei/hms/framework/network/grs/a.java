package com.huawei.hms.framework.network.grs;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a {
    private static final java.lang.String e = "a";
    private final com.huawei.hms.framework.network.grs.GrsBaseInfo a;
    private n1.a b;
    private com.huawei.hms.framework.network.grs.g.g c;
    private n1.c d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.huawei.hms.framework.network.grs.a$a, reason: collision with other inner class name */
    private static class C0000a implements com.huawei.hms.framework.network.grs.b {
        java.lang.String a;
        java.util.Map<java.lang.String, java.lang.String> b;
        com.huawei.hms.framework.network.grs.IQueryUrlsCallBack c;
        android.content.Context d;
        com.huawei.hms.framework.network.grs.GrsBaseInfo e;
        n1.a f;

        C0000a(java.lang.String r1, java.util.Map<java.lang.String, java.lang.String> r2, com.huawei.hms.framework.network.grs.IQueryUrlsCallBack r3, android.content.Context r4, com.huawei.hms.framework.network.grs.GrsBaseInfo r5, n1.a r6) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                r0.e = r5
                r0.f = r6
                return
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a() {
                r11 = this;
                java.util.Map<java.lang.String, java.lang.String> r0 = r11.b
                r1 = 2
                r2 = 1
                r3 = 0
                java.lang.String r4 = "GrsClientManager.ayncGetGrsUrls: Return [%s] Urls: %s"
                if (r0 == 0) goto L35
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L35
                java.lang.String r0 = com.huawei.hms.framework.network.grs.a.b()
                java.lang.String r5 = r11.a
                org.json.JSONObject r6 = new org.json.JSONObject
                java.util.Map<java.lang.String, java.lang.String> r7 = r11.b
                r6.<init>(r7)
                java.lang.String r6 = r6.toString()
                java.lang.String r6 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r6)
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r3] = r5
                r1[r2] = r6
                com.huawei.hms.framework.common.Logger.i(r0, r4, r1)
                com.huawei.hms.framework.network.grs.IQueryUrlsCallBack r0 = r11.c
                java.util.Map<java.lang.String, java.lang.String> r1 = r11.b
                r0.onCallBackSuccess(r1)
                return
            L35:
                java.util.Map<java.lang.String, java.lang.String> r0 = r11.b
                if (r0 != 0) goto L9a
                java.lang.String r0 = com.huawei.hms.framework.network.grs.a.b()
                java.lang.String r5 = "GrsClientManager.ayncGetGrsUrls: Get URL from Local JSON File"
                com.huawei.hms.framework.common.Logger.i(r0, r5)
                android.content.Context r0 = r11.d
                java.lang.String r0 = r0.getPackageName()
                com.huawei.hms.framework.network.grs.f.b r5 = com.huawei.hms.framework.network.grs.f.b.a(r0)
                android.content.Context r6 = r11.d
                n1.a r7 = r11.f
                com.huawei.hms.framework.network.grs.GrsBaseInfo r8 = r11.e
                java.lang.String r9 = r11.a
                r10 = 1
                java.util.Map r0 = r5.c(r6, r7, r8, r9, r10)
                if (r0 == 0) goto L61
                boolean r5 = r0.isEmpty()
                if (r5 == 0) goto L70
            L61:
                java.lang.String r5 = com.huawei.hms.framework.network.grs.a.b()
                java.lang.String r6 = r11.a
                java.lang.Object[] r7 = new java.lang.Object[r2]
                r7[r3] = r6
                java.lang.String r6 = "The serviceName[%s] is not configured in the JSON configuration files to reveal all the details"
                com.huawei.hms.framework.common.Logger.e(r5, r6, r7)
            L70:
                if (r0 == 0) goto L73
                goto L78
            L73:
                java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
                r0.<init>()
            L78:
                java.lang.String r5 = com.huawei.hms.framework.network.grs.a.b()
                java.lang.String r6 = r11.a
                org.json.JSONObject r7 = new org.json.JSONObject
                r7.<init>(r0)
                java.lang.String r7 = r7.toString()
                java.lang.String r7 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r7)
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r3] = r6
                r1[r2] = r7
                com.huawei.hms.framework.common.Logger.i(r5, r4, r1)
                com.huawei.hms.framework.network.grs.IQueryUrlsCallBack r1 = r11.c
                r1.onCallBackSuccess(r0)
                return
            L9a:
                java.lang.String r0 = com.huawei.hms.framework.network.grs.a.b()
                java.lang.String r1 = r11.a
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r3] = r1
                java.lang.String r1 = "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls is Empty"
                com.huawei.hms.framework.common.Logger.i(r0, r1, r2)
                com.huawei.hms.framework.network.grs.IQueryUrlsCallBack r0 = r11.c
                r1 = -3
                r0.onCallBackFail(r1)
                return
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a(com.huawei.hms.framework.network.grs.g.d r12) {
                r11 = this;
                java.lang.String r12 = r12.y()
                java.lang.String r0 = r11.a
                java.util.Map r0 = com.huawei.hms.framework.network.grs.a.g(r12, r0)
                boolean r1 = r0.isEmpty()
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 != 0) goto L37
                java.lang.String r12 = com.huawei.hms.framework.network.grs.a.b()
                java.lang.String r1 = r11.a
                org.json.JSONObject r5 = new org.json.JSONObject
                r5.<init>(r0)
                java.lang.String r5 = r5.toString()
                java.lang.String r5 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r5)
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r4] = r1
                r2[r3] = r5
                java.lang.String r1 = "GrsClientManager.ayncGetGrsUrls: Get URL from Current Called GRS Server Return [%s] Urls: %s"
                com.huawei.hms.framework.common.Logger.i(r12, r1, r2)
                com.huawei.hms.framework.network.grs.IQueryUrlsCallBack r12 = r11.c
                r12.onCallBackSuccess(r0)
                return
            L37:
                java.util.Map<java.lang.String, java.lang.String> r0 = r11.b
                if (r0 == 0) goto L69
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L69
                java.lang.String r12 = com.huawei.hms.framework.network.grs.a.b()
                java.lang.String r0 = r11.a
                org.json.JSONObject r1 = new org.json.JSONObject
                java.util.Map<java.lang.String, java.lang.String> r5 = r11.b
                r1.<init>(r5)
                java.lang.String r1 = r1.toString()
                java.lang.String r1 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r1)
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r4] = r0
                r2[r3] = r1
                java.lang.String r0 = "GrsClientManager.ayncGetGrsUrls: Return [%s][%s] Url: %s"
                com.huawei.hms.framework.common.Logger.i(r12, r0, r2)
                com.huawei.hms.framework.network.grs.IQueryUrlsCallBack r12 = r11.c
                java.util.Map<java.lang.String, java.lang.String> r0 = r11.b
                r12.onCallBackSuccess(r0)
                return
            L69:
                java.util.Map<java.lang.String, java.lang.String> r0 = r11.b
                if (r0 != 0) goto Le5
                boolean r12 = android.text.TextUtils.isEmpty(r12)
                if (r12 != 0) goto L82
                java.lang.String r12 = com.huawei.hms.framework.network.grs.a.b()
                java.lang.String r0 = r11.a
                java.lang.Object[] r1 = new java.lang.Object[r3]
                r1[r4] = r0
                java.lang.String r0 = "The serviceName[%s] is not configured on the GRS server."
                com.huawei.hms.framework.common.Logger.e(r12, r0, r1)
            L82:
                java.lang.String r12 = com.huawei.hms.framework.network.grs.a.b()
                java.lang.String r0 = "GrsClientManager.ayncGetGrsUrls: Get URL from Local JSON File"
                com.huawei.hms.framework.common.Logger.i(r12, r0)
                android.content.Context r12 = r11.d
                java.lang.String r12 = r12.getPackageName()
                com.huawei.hms.framework.network.grs.f.b r5 = com.huawei.hms.framework.network.grs.f.b.a(r12)
                android.content.Context r6 = r11.d
                n1.a r7 = r11.f
                com.huawei.hms.framework.network.grs.GrsBaseInfo r8 = r11.e
                java.lang.String r9 = r11.a
                r10 = 1
                java.util.Map r12 = r5.c(r6, r7, r8, r9, r10)
                if (r12 == 0) goto Laa
                boolean r0 = r12.isEmpty()
                if (r0 == 0) goto Lb9
            Laa:
                java.lang.String r0 = com.huawei.hms.framework.network.grs.a.b()
                java.lang.String r1 = r11.a
                java.lang.Object[] r5 = new java.lang.Object[r3]
                r5[r4] = r1
                java.lang.String r1 = "The serviceName[%s] is not configured in the JSON configuration files to reveal all the details"
                com.huawei.hms.framework.common.Logger.e(r0, r1, r5)
            Lb9:
                if (r12 == 0) goto Lbc
                goto Lc1
            Lbc:
                java.util.concurrent.ConcurrentHashMap r12 = new java.util.concurrent.ConcurrentHashMap
                r12.<init>()
            Lc1:
                java.lang.String r0 = com.huawei.hms.framework.network.grs.a.b()
                java.lang.String r1 = r11.a
                org.json.JSONObject r5 = new org.json.JSONObject
                r5.<init>(r12)
                java.lang.String r5 = r5.toString()
                java.lang.String r5 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r5)
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r4] = r1
                r2[r3] = r5
                java.lang.String r1 = "GrsClientManager.ayncGetGrsUrls: Return [%s] Urls: %s"
                com.huawei.hms.framework.common.Logger.i(r0, r1, r2)
                com.huawei.hms.framework.network.grs.IQueryUrlsCallBack r0 = r11.c
                r0.onCallBackSuccess(r12)
                return
            Le5:
                java.lang.String r12 = com.huawei.hms.framework.network.grs.a.b()
                java.lang.String r0 = r11.a
                java.lang.Object[] r1 = new java.lang.Object[r3]
                r1[r4] = r0
                java.lang.String r0 = "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls is Empty"
                com.huawei.hms.framework.common.Logger.i(r12, r0, r1)
                com.huawei.hms.framework.network.grs.IQueryUrlsCallBack r12 = r11.c
                r0 = -5
                r12.onCallBackFail(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b implements com.huawei.hms.framework.network.grs.b {
        java.lang.String a;
        java.lang.String b;
        com.huawei.hms.framework.network.grs.IQueryUrlCallBack c;
        java.lang.String d;
        android.content.Context e;
        com.huawei.hms.framework.network.grs.GrsBaseInfo f;
        n1.a g;

        b(java.lang.String r1, java.lang.String r2, com.huawei.hms.framework.network.grs.IQueryUrlCallBack r3, java.lang.String r4, android.content.Context r5, com.huawei.hms.framework.network.grs.GrsBaseInfo r6, n1.a r7) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                r0.e = r5
                r0.f = r6
                r0.g = r7
                return
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a() {
                r13 = this;
                java.lang.String r0 = r13.d
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                r1 = 3
                r2 = 2
                r3 = 1
                r4 = 0
                java.lang.String r5 = "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s"
                if (r0 != 0) goto L2f
                java.lang.String r0 = com.huawei.hms.framework.network.grs.a.b()
                java.lang.String r6 = r13.a
                java.lang.String r7 = r13.b
                java.lang.String r8 = r13.d
                java.lang.String r8 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r8)
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r4] = r6
                r1[r3] = r7
                r1[r2] = r8
                com.huawei.hms.framework.common.Logger.i(r0, r5, r1)
                com.huawei.hms.framework.network.grs.IQueryUrlCallBack r0 = r13.c
                java.lang.String r1 = r13.d
                r0.onCallBackSuccess(r1)
                return
            L2f:
                java.lang.String r0 = r13.d
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L91
                java.lang.String r0 = com.huawei.hms.framework.network.grs.a.b()
                java.lang.String r6 = "GrsClientManager.ayncGetGrsUrl: Get URL from Local JSON File"
                com.huawei.hms.framework.common.Logger.i(r0, r6)
                android.content.Context r0 = r13.e
                java.lang.String r0 = r0.getPackageName()
                com.huawei.hms.framework.network.grs.f.b r6 = com.huawei.hms.framework.network.grs.f.b.a(r0)
                android.content.Context r7 = r13.e
                n1.a r8 = r13.g
                com.huawei.hms.framework.network.grs.GrsBaseInfo r9 = r13.f
                java.lang.String r10 = r13.a
                java.lang.String r11 = r13.b
                r12 = 1
                java.lang.String r0 = r6.b(r7, r8, r9, r10, r11, r12)
                if (r0 == 0) goto L61
                boolean r6 = r0.isEmpty()
                if (r6 == 0) goto L74
            L61:
                java.lang.String r6 = com.huawei.hms.framework.network.grs.a.b()
                java.lang.String r7 = r13.a
                java.lang.String r8 = r13.b
                java.lang.Object[] r9 = new java.lang.Object[r2]
                r9[r4] = r7
                r9[r3] = r8
                java.lang.String r7 = "The serviceName[%s][%s] is not configured in the JSON configuration files to reveal all the details"
                com.huawei.hms.framework.common.Logger.e(r6, r7, r9)
            L74:
                java.lang.String r6 = com.huawei.hms.framework.network.grs.a.b()
                java.lang.String r7 = r13.a
                java.lang.String r8 = r13.b
                java.lang.String r9 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r0)
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r4] = r7
                r1[r3] = r8
                r1[r2] = r9
                com.huawei.hms.framework.common.Logger.i(r6, r5, r1)
                com.huawei.hms.framework.network.grs.IQueryUrlCallBack r1 = r13.c
                r1.onCallBackSuccess(r0)
                return
            L91:
                java.lang.String r0 = com.huawei.hms.framework.network.grs.a.b()
                java.lang.String r1 = r13.a
                java.lang.String r5 = r13.b
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r4] = r1
                r2[r3] = r5
                java.lang.String r1 = "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url is Empty"
                com.huawei.hms.framework.common.Logger.i(r0, r1, r2)
                com.huawei.hms.framework.network.grs.IQueryUrlCallBack r0 = r13.c
                r1 = -3
                r0.onCallBackFail(r1)
                return
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a(com.huawei.hms.framework.network.grs.g.d r15) {
                r14 = this;
                java.lang.String r15 = r15.y()
                java.lang.String r0 = r14.a
                java.util.Map r0 = com.huawei.hms.framework.network.grs.a.g(r15, r0)
                java.lang.String r1 = r14.b
                boolean r1 = r0.containsKey(r1)
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L43
                java.lang.String r15 = com.huawei.hms.framework.network.grs.a.b()
                java.lang.String r1 = r14.a
                java.lang.String r6 = r14.b
                java.lang.Object r7 = r0.get(r6)
                java.lang.String r7 = (java.lang.String) r7
                java.lang.String r7 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r7)
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r5] = r1
                r2[r4] = r6
                r2[r3] = r7
                java.lang.String r1 = "GrsClientManager.ayncGetGrsUrl: Get URL from Current Called GRS Server, Return [%s][%s] Url: %s"
                com.huawei.hms.framework.common.Logger.i(r15, r1, r2)
                com.huawei.hms.framework.network.grs.IQueryUrlCallBack r15 = r14.c
                java.lang.String r1 = r14.b
                java.lang.Object r0 = r0.get(r1)
                java.lang.String r0 = (java.lang.String) r0
                r15.onCallBackSuccess(r0)
                return
            L43:
                java.lang.String r1 = r14.d
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                java.lang.String r6 = "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s"
                if (r1 != 0) goto L72
                java.lang.String r15 = com.huawei.hms.framework.network.grs.a.b()
                java.lang.String r1 = r14.a
                java.lang.String r7 = r14.b
                java.lang.Object r0 = r0.get(r7)
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r0 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r0)
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r5] = r1
                r2[r4] = r7
                r2[r3] = r0
                com.huawei.hms.framework.common.Logger.i(r15, r6, r2)
                com.huawei.hms.framework.network.grs.IQueryUrlCallBack r15 = r14.c
                java.lang.String r0 = r14.d
                r15.onCallBackSuccess(r0)
                return
            L72:
                java.lang.String r0 = r14.d
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto Led
                boolean r15 = android.text.TextUtils.isEmpty(r15)
                if (r15 != 0) goto L93
                java.lang.String r15 = com.huawei.hms.framework.network.grs.a.b()
                java.lang.String r0 = r14.a
                java.lang.String r1 = r14.b
                java.lang.Object[] r7 = new java.lang.Object[r3]
                r7[r5] = r0
                r7[r4] = r1
                java.lang.String r0 = "The serviceName[%s][%s] is not configured on the GRS server."
                com.huawei.hms.framework.common.Logger.e(r15, r0, r7)
            L93:
                java.lang.String r15 = com.huawei.hms.framework.network.grs.a.b()
                java.lang.String r0 = "GrsClientManager.ayncGetGrsUrl: Get URL from Local JSON File"
                com.huawei.hms.framework.common.Logger.i(r15, r0)
                android.content.Context r15 = r14.e
                java.lang.String r15 = r15.getPackageName()
                com.huawei.hms.framework.network.grs.f.b r7 = com.huawei.hms.framework.network.grs.f.b.a(r15)
                android.content.Context r8 = r14.e
                n1.a r9 = r14.g
                com.huawei.hms.framework.network.grs.GrsBaseInfo r10 = r14.f
                java.lang.String r11 = r14.a
                java.lang.String r12 = r14.b
                r13 = 1
                java.lang.String r15 = r7.b(r8, r9, r10, r11, r12, r13)
                if (r15 == 0) goto Lbd
                boolean r0 = r15.isEmpty()
                if (r0 == 0) goto Ld0
            Lbd:
                java.lang.String r0 = com.huawei.hms.framework.network.grs.a.b()
                java.lang.String r1 = r14.a
                java.lang.String r7 = r14.b
                java.lang.Object[] r8 = new java.lang.Object[r3]
                r8[r5] = r1
                r8[r4] = r7
                java.lang.String r1 = "The serviceName[%s][%s] is not configured in the JSON configuration files to reveal all the details"
                com.huawei.hms.framework.common.Logger.e(r0, r1, r8)
            Ld0:
                java.lang.String r0 = com.huawei.hms.framework.network.grs.a.b()
                java.lang.String r1 = r14.a
                java.lang.String r7 = r14.b
                java.lang.String r8 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r15)
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r5] = r1
                r2[r4] = r7
                r2[r3] = r8
                com.huawei.hms.framework.common.Logger.i(r0, r6, r2)
                com.huawei.hms.framework.network.grs.IQueryUrlCallBack r0 = r14.c
                r0.onCallBackSuccess(r15)
                return
            Led:
                java.lang.String r15 = com.huawei.hms.framework.network.grs.a.b()
                java.lang.String r0 = r14.a
                java.lang.String r1 = r14.b
                java.lang.Object[] r2 = new java.lang.Object[r3]
                r2[r5] = r0
                r2[r4] = r1
                java.lang.String r0 = "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url is Empty"
                com.huawei.hms.framework.common.Logger.i(r15, r0, r2)
                com.huawei.hms.framework.network.grs.IQueryUrlCallBack r15 = r14.c
                r0 = -5
                r15.onCallBackFail(r0)
                return
        }
    }

    public a(com.huawei.hms.framework.network.grs.GrsBaseInfo r1, n1.a r2, com.huawei.hms.framework.network.grs.g.g r3, n1.c r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    public static com.huawei.hms.framework.network.grs.local.model.CountryCodeBean a(android.content.Context r1, boolean r2) {
            com.huawei.hms.framework.network.grs.local.model.CountryCodeBean r0 = new com.huawei.hms.framework.network.grs.local.model.CountryCodeBean
            r0.<init>(r1, r2)
            return r0
    }

    static /* synthetic */ java.lang.String b() {
            java.lang.String r0 = com.huawei.hms.framework.network.grs.a.e
            return r0
    }

    public static java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> e(java.lang.String r5) {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = 16
            r0.<init>(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto L15
            java.lang.String r5 = com.huawei.hms.framework.network.grs.a.e
            java.lang.String r1 = "isSpExpire jsonValue is null."
            com.huawei.hms.framework.common.Logger.v(r5, r1)
            return r0
        L15:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3c
            r1.<init>(r5)     // Catch: org.json.JSONException -> L3c
            java.util.Iterator r5 = r1.keys()     // Catch: org.json.JSONException -> L3c
        L1e:
            boolean r2 = r5.hasNext()     // Catch: org.json.JSONException -> L3c
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r5.next()     // Catch: org.json.JSONException -> L3c
            java.lang.String r2 = (java.lang.String) r2     // Catch: org.json.JSONException -> L3c
            org.json.JSONObject r3 = r1.getJSONObject(r2)     // Catch: org.json.JSONException -> L3c
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: org.json.JSONException -> L3c
            if (r4 != 0) goto L1e
            java.util.Map r3 = i(r3)     // Catch: org.json.JSONException -> L3c
            r0.put(r2, r3)     // Catch: org.json.JSONException -> L3c
            goto L1e
        L3c:
            r5 = move-exception
            goto L3f
        L3e:
            return r0
        L3f:
            java.lang.String r1 = com.huawei.hms.framework.network.grs.a.e
            java.lang.String r5 = r5.getMessage()
            java.lang.String r5 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r5)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            java.lang.String r5 = "getServicesUrlsMap occur a JSONException: %s"
            com.huawei.hms.framework.common.Logger.w(r1, r5, r2)
            return r0
    }

    public static java.util.Map<java.lang.String, java.lang.String> g(java.lang.String r5, java.lang.String r6) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto L13
            java.lang.String r5 = com.huawei.hms.framework.network.grs.a.e
            java.lang.String r6 = "isSpExpire jsonValue from server is null."
            com.huawei.hms.framework.common.Logger.w(r5, r6)
            return r0
        L13:
            r1 = 0
            r2 = 1
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L25
            r3.<init>(r5)     // Catch: org.json.JSONException -> L25
            boolean r5 = r3.has(r6)     // Catch: org.json.JSONException -> L25
            if (r5 == 0) goto L27
            org.json.JSONObject r5 = r3.getJSONObject(r6)     // Catch: org.json.JSONException -> L25
            goto L28
        L25:
            r5 = move-exception
            goto L53
        L27:
            r5 = 0
        L28:
            if (r5 != 0) goto L36
            java.lang.String r5 = com.huawei.hms.framework.network.grs.a.e     // Catch: org.json.JSONException -> L25
            java.lang.String r3 = "getServiceNameUrls: paser null from server json data by {%s}."
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: org.json.JSONException -> L25
            r4[r1] = r6     // Catch: org.json.JSONException -> L25
            com.huawei.hms.framework.common.Logger.w(r5, r3, r4)     // Catch: org.json.JSONException -> L25
            return r0
        L36:
            java.util.Iterator r6 = r5.keys()     // Catch: org.json.JSONException -> L25
        L3a:
            boolean r3 = r6.hasNext()     // Catch: org.json.JSONException -> L25
            if (r3 == 0) goto L52
            java.lang.Object r3 = r6.next()     // Catch: org.json.JSONException -> L25
            java.lang.String r3 = (java.lang.String) r3     // Catch: org.json.JSONException -> L25
            java.lang.Object r4 = r5.get(r3)     // Catch: org.json.JSONException -> L25
            java.lang.String r4 = r4.toString()     // Catch: org.json.JSONException -> L25
            r0.put(r3, r4)     // Catch: org.json.JSONException -> L25
            goto L3a
        L52:
            return r0
        L53:
            java.lang.String r6 = com.huawei.hms.framework.network.grs.a.e
            java.lang.String r5 = r5.getMessage()
            java.lang.String r5 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r5)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            java.lang.String r5 = "Method{getServiceNameUrls} query url from SP occur an JSONException: %s"
            com.huawei.hms.framework.common.Logger.w(r6, r5, r2)
            return r0
    }

    private java.util.Map<java.lang.String, java.lang.String> h(java.lang.String r7, n1.b r8, android.content.Context r9) {
            r6 = this;
            n1.a r0 = r6.b
            com.huawei.hms.framework.network.grs.GrsBaseInfo r1 = r6.a
            java.util.Map r8 = r0.a(r1, r7, r8, r9)
            if (r8 == 0) goto L18
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L18
            java.lang.String r7 = com.huawei.hms.framework.network.grs.a.e
            java.lang.String r9 = "GrsClientManager.getUrlsLocal: Get URL from GRS Server Cache"
            com.huawei.hms.framework.common.Logger.i(r7, r9)
            return r8
        L18:
            java.lang.String r8 = r9.getPackageName()
            com.huawei.hms.framework.network.grs.f.b r0 = com.huawei.hms.framework.network.grs.f.b.a(r8)
            n1.a r2 = r6.b
            com.huawei.hms.framework.network.grs.GrsBaseInfo r3 = r6.a
            r5 = 0
            r4 = r7
            r1 = r9
            java.util.Map r7 = r0.c(r1, r2, r3, r4, r5)
            java.lang.String r8 = com.huawei.hms.framework.network.grs.a.e
            java.lang.String r9 = "GrsClientManager.getUrlsLocal: Get URL from Local JSON File"
            com.huawei.hms.framework.common.Logger.i(r8, r9)
            if (r7 == 0) goto L35
            return r7
        L35:
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            return r7
    }

    public static java.util.Map<java.lang.String, java.lang.String> i(org.json.JSONObject r5) {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = 16
            r0.<init>(r1)
            java.util.Iterator r1 = r5.keys()     // Catch: org.json.JSONException -> L2f
        Lb:
            boolean r2 = r1.hasNext()     // Catch: org.json.JSONException -> L2f
            if (r2 == 0) goto L31
            java.lang.Object r2 = r1.next()     // Catch: org.json.JSONException -> L2f
            java.lang.String r2 = (java.lang.String) r2     // Catch: org.json.JSONException -> L2f
            java.lang.Object r3 = r5.get(r2)     // Catch: org.json.JSONException -> L2f
            java.lang.String r3 = r3.toString()     // Catch: org.json.JSONException -> L2f
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: org.json.JSONException -> L2f
            if (r4 != 0) goto Lb
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: org.json.JSONException -> L2f
            if (r4 != 0) goto Lb
            r0.put(r2, r3)     // Catch: org.json.JSONException -> L2f
            goto Lb
        L2f:
            r5 = move-exception
            goto L32
        L31:
            return r0
        L32:
            java.lang.String r1 = com.huawei.hms.framework.network.grs.a.e
            java.lang.String r5 = r5.getMessage()
            java.lang.String r5 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r5)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            java.lang.String r5 = "getServiceUrls occur a JSONException: %s"
            com.huawei.hms.framework.common.Logger.w(r1, r5, r2)
            return r0
    }

    public java.lang.String c(android.content.Context r4, java.lang.String r5, int r6) {
            r3 = this;
            com.huawei.hms.framework.network.grs.g.g r0 = r3.c
            p1.c r1 = new p1.c
            com.huawei.hms.framework.network.grs.GrsBaseInfo r2 = r3.a
            r1.<init>(r2, r4)
            n1.c r2 = r3.d
            com.huawei.hms.framework.network.grs.g.d r5 = r0.a(r1, r5, r2, r6)
            java.lang.String r6 = ""
            if (r5 != 0) goto L14
            return r6
        L14:
            boolean r0 = r5.B()
            if (r0 == 0) goto L2c
            n1.a r5 = r3.b
            n1.c r5 = r5.b()
            com.huawei.hms.framework.network.grs.GrsBaseInfo r0 = r3.a
            r1 = 1
            java.lang.String r4 = r0.getGrsParasKey(r1, r1, r4)
            java.lang.String r4 = r5.a(r4, r6)
            return r4
        L2c:
            java.lang.String r4 = r5.y()
            return r4
    }

    public java.lang.String d(java.lang.String r14, java.lang.String r15, android.content.Context r16, int r17) {
            r13 = this;
            r1 = r16
            n1.b r0 = new n1.b
            r0.<init>()
            java.util.Map r2 = r13.h(r14, r0, r1)
            java.lang.Object r2 = r2.get(r15)
            java.lang.String r2 = (java.lang.String) r2
            boolean r0 = r0.b()
            r7 = 3
            r8 = 2
            r9 = 1
            r10 = 0
            java.lang.String r11 = "GrsClientManager.synGetGrsUrl: Return [%s][%s] Url: %s"
            if (r0 == 0) goto L35
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L35
            java.lang.String r0 = com.huawei.hms.framework.network.grs.a.e
            java.lang.String r1 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r2)
            java.lang.Object[] r3 = new java.lang.Object[r7]
            r3[r10] = r14
            r3[r9] = r15
            r3[r8] = r1
            com.huawei.hms.framework.common.Logger.i(r0, r11, r3)
            return r2
        L35:
            r0 = r17
            java.lang.String r0 = r13.c(r1, r14, r0)
            java.util.Map r3 = g(r0, r14)
            java.lang.Object r3 = r3.get(r15)
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L5f
            java.lang.String r0 = com.huawei.hms.framework.network.grs.a.e
            java.lang.String r1 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r3)
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r2[r10] = r14
            r2[r9] = r15
            r2[r8] = r1
            java.lang.String r14 = "GrsClientManager.synGetGrsUrl: Get URL from Current Called GRS Server, Return [%s][%s] Url: %s"
            com.huawei.hms.framework.common.Logger.i(r0, r14, r2)
            return r3
        L5f:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto La5
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L78
            java.lang.String r0 = com.huawei.hms.framework.network.grs.a.e
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r2[r10] = r14
            r2[r9] = r15
            java.lang.String r3 = "The serviceName[%s][%s] is not configured on the GRS server."
            com.huawei.hms.framework.common.Logger.e(r0, r3, r2)
        L78:
            java.lang.String r12 = com.huawei.hms.framework.network.grs.a.e
            java.lang.String r0 = "GrsClientManager.synGetGrsUrl: Get URL from Local JSON File."
            com.huawei.hms.framework.common.Logger.i(r12, r0)
            java.lang.String r0 = r1.getPackageName()
            com.huawei.hms.framework.network.grs.f.b r0 = com.huawei.hms.framework.network.grs.f.b.a(r0)
            n1.a r2 = r13.b
            com.huawei.hms.framework.network.grs.GrsBaseInfo r3 = r13.a
            r6 = 1
            r4 = r14
            r5 = r15
            java.lang.String r2 = r0.b(r1, r2, r3, r4, r5, r6)
            if (r2 == 0) goto L9a
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto La5
        L9a:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r10] = r14
            r0[r9] = r15
            java.lang.String r1 = "The serviceName[%s][%s] is not configured in the JSON configuration files to reveal all the details"
            com.huawei.hms.framework.common.Logger.e(r12, r1, r0)
        La5:
            java.lang.String r0 = com.huawei.hms.framework.network.grs.a.e
            java.lang.String r1 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r2)
            java.lang.Object[] r3 = new java.lang.Object[r7]
            r3[r10] = r14
            r3[r9] = r15
            r3[r8] = r1
            com.huawei.hms.framework.common.Logger.i(r0, r11, r3)
            return r2
    }

    public java.util.Map<java.lang.String, java.lang.String> f(java.lang.String r12, android.content.Context r13, int r14) {
            r11 = this;
            n1.b r0 = new n1.b
            r0.<init>()
            java.util.Map r1 = r11.h(r12, r0, r13)
            boolean r0 = r0.b()
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L33
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L33
            java.lang.String r13 = com.huawei.hms.framework.network.grs.a.e
            org.json.JSONObject r14 = new org.json.JSONObject
            r14.<init>(r1)
            java.lang.String r14 = r14.toString()
            java.lang.String r14 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r14)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r4] = r12
            r0[r3] = r14
            java.lang.String r12 = "Return [%s] Urls: %s"
            com.huawei.hms.framework.common.Logger.i(r13, r12, r0)
            return r1
        L33:
            java.lang.String r14 = r11.c(r13, r12, r14)
            java.util.Map r0 = g(r14, r12)
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L5c
            java.lang.String r13 = com.huawei.hms.framework.network.grs.a.e
            org.json.JSONObject r14 = new org.json.JSONObject
            r14.<init>(r0)
            java.lang.String r14 = r14.toString()
            java.lang.String r14 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r14)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r4] = r12
            r1[r3] = r14
            java.lang.String r12 = "GrsClientManager.synGetGrsUrls: Get URL from Current Called GRS Server Return [%s] Urls: %s"
            com.huawei.hms.framework.common.Logger.i(r13, r12, r1)
            return r0
        L5c:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L9f
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 != 0) goto L73
            java.lang.String r14 = com.huawei.hms.framework.network.grs.a.e
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r4] = r12
            java.lang.String r1 = "The serviceName[%s] is not configured on the GRS server."
            com.huawei.hms.framework.common.Logger.e(r14, r1, r0)
        L73:
            java.lang.String r14 = com.huawei.hms.framework.network.grs.a.e
            java.lang.String r0 = "GrsClientManager.synGetGrsUrls: Get URL from Local JSON File."
            com.huawei.hms.framework.common.Logger.i(r14, r0)
            java.lang.String r0 = r13.getPackageName()
            com.huawei.hms.framework.network.grs.f.b r5 = com.huawei.hms.framework.network.grs.f.b.a(r0)
            n1.a r7 = r11.b
            com.huawei.hms.framework.network.grs.GrsBaseInfo r8 = r11.a
            r10 = 1
            r9 = r12
            r6 = r13
            java.util.Map r1 = r5.c(r6, r7, r8, r9, r10)
            if (r1 == 0) goto L95
            boolean r12 = r1.isEmpty()
            if (r12 == 0) goto La0
        L95:
            java.lang.Object[] r12 = new java.lang.Object[r3]
            r12[r4] = r9
            java.lang.String r13 = "The serviceName[%s] is not configured in the JSON configuration files to reveal all the details"
            com.huawei.hms.framework.common.Logger.e(r14, r13, r12)
            goto La0
        L9f:
            r9 = r12
        La0:
            java.lang.String r12 = com.huawei.hms.framework.network.grs.a.e
            if (r1 == 0) goto Lae
            org.json.JSONObject r13 = new org.json.JSONObject
            r13.<init>(r1)
            java.lang.String r13 = r13.toString()
            goto Lb0
        Lae:
            java.lang.String r13 = ""
        Lb0:
            java.lang.String r13 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r13)
            java.lang.Object[] r14 = new java.lang.Object[r2]
            r14[r4] = r9
            r14[r3] = r13
            java.lang.String r13 = "GrsClientManager.synGetGrsUrls: Return [%s] Urls: %s"
            com.huawei.hms.framework.common.Logger.i(r12, r13, r14)
            return r1
    }

    public void j(java.lang.String r11, com.huawei.hms.framework.network.grs.IQueryUrlsCallBack r12, android.content.Context r13, int r14) {
            r10 = this;
            n1.b r0 = new n1.b
            r0.<init>()
            java.util.Map r3 = r10.h(r11, r0, r13)
            boolean r0 = r0.b()
            if (r0 == 0) goto L5c
            boolean r13 = r3.isEmpty()
            r14 = 0
            r0 = 1
            if (r13 == 0) goto L27
            java.lang.String r13 = com.huawei.hms.framework.network.grs.a.e
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r14] = r11
            java.lang.String r11 = "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls is Empty"
            com.huawei.hms.framework.common.Logger.i(r13, r11, r0)
            r11 = -5
            r12.onCallBackFail(r11)
            return
        L27:
            java.lang.String r13 = com.huawei.hms.framework.network.grs.a.e
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r1)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r14] = r11
            r2[r0] = r1
            java.lang.String r11 = "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls: %s"
            com.huawei.hms.framework.common.Logger.i(r13, r11, r2)
            org.json.JSONObject r11 = new org.json.JSONObject
            r11.<init>(r3)
            java.lang.String r11 = r11.toString()
            java.lang.String r11 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r11)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r14] = r11
            java.lang.String r11 = "ayncGetGrsUrls: %s"
            com.huawei.hms.framework.common.Logger.i(r13, r11, r0)
            r12.onCallBackSuccess(r3)
            return
        L5c:
            p1.c r0 = new p1.c
            com.huawei.hms.framework.network.grs.GrsBaseInfo r1 = r10.a
            r0.<init>(r1, r13)
            com.huawei.hms.framework.network.grs.g.g r8 = r10.c
            com.huawei.hms.framework.network.grs.a$a r1 = new com.huawei.hms.framework.network.grs.a$a
            com.huawei.hms.framework.network.grs.GrsBaseInfo r6 = r10.a
            n1.a r7 = r10.b
            r2 = r11
            r4 = r12
            r5 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r4 = r8
            n1.c r8 = r10.d
            r9 = r14
            r5 = r0
            r6 = r1
            r7 = r2
            r4.h(r5, r6, r7, r8, r9)
            return
    }

    public void k(java.lang.String r11, java.lang.String r12, com.huawei.hms.framework.network.grs.IQueryUrlCallBack r13, android.content.Context r14, int r15) {
            r10 = this;
            n1.b r0 = new n1.b
            r0.<init>()
            java.util.Map r4 = r10.h(r11, r0, r14)
            java.lang.Object r4 = r4.get(r12)
            java.lang.String r4 = (java.lang.String) r4
            boolean r0 = r0.b()
            if (r0 == 0) goto L48
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r5 = 1
            r6 = 0
            r7 = 2
            if (r0 == 0) goto L30
            java.lang.String r0 = com.huawei.hms.framework.network.grs.a.e
            java.lang.Object[] r4 = new java.lang.Object[r7]
            r4[r6] = r11
            r4[r5] = r12
            java.lang.String r1 = "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url is Empty"
            com.huawei.hms.framework.common.Logger.i(r0, r1, r4)
            r0 = -5
            r13.onCallBackFail(r0)
            return
        L30:
            java.lang.String r0 = com.huawei.hms.framework.network.grs.a.e
            java.lang.String r8 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r4)
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r6] = r11
            r9[r5] = r12
            r9[r7] = r8
            java.lang.String r1 = "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url: %s"
            com.huawei.hms.framework.common.Logger.i(r0, r1, r9)
            r13.onCallBackSuccess(r4)
            return
        L48:
            p1.c r8 = new p1.c
            com.huawei.hms.framework.network.grs.GrsBaseInfo r0 = r10.a
            r8.<init>(r0, r14)
            com.huawei.hms.framework.network.grs.g.g r9 = r10.c
            com.huawei.hms.framework.network.grs.a$b r0 = new com.huawei.hms.framework.network.grs.a$b
            com.huawei.hms.framework.network.grs.GrsBaseInfo r6 = r10.a
            n1.a r7 = r10.b
            r1 = r11
            r2 = r12
            r3 = r13
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            n1.c r4 = r10.d
            r3 = r11
            r5 = r15
            r2 = r0
            r1 = r8
            r0 = r9
            r0.h(r1, r2, r3, r4, r5)
            return
    }
}
