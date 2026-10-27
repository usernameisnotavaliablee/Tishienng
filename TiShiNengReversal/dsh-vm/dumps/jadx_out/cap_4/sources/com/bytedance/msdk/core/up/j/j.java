package com.bytedance.msdk.core.up.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j extends com.bytedance.msdk.core.up.j {
    private static volatile com.bytedance.msdk.core.up.j.j tl;
    private final java.util.Map<java.lang.String, java.lang.Integer> ae;
    private final java.util.Map<java.lang.String, java.lang.Integer> cw;
    private final java.util.Comparator<com.bytedance.msdk.core.up.xt.ae> g;
    private final java.lang.String[] j;

    /* renamed from: m, reason: collision with root package name */
    private final java.util.Map<java.lang.String, java.lang.String> f2263m;

    /* renamed from: r, reason: collision with root package name */
    private final java.util.Map<java.lang.String, java.util.concurrent.CopyOnWriteArrayList<com.bytedance.msdk.core.up.xt.ae>> f2264r;
    private final java.util.Map<java.lang.String, com.bytedance.msdk.core.oq.oq> up;
    private final java.util.Map<java.lang.String, java.lang.Integer> xt;





    /* renamed from: com.bytedance.msdk.core.up.j.j$j, reason: collision with other inner class name */
    private class C0229j implements com.bytedance.msdk.cw.j.xt {
        private long ae;
        private final com.bytedance.msdk.api.j.xt cw;
        int j;

        /* renamed from: m, reason: collision with root package name */
        private com.bytedance.msdk.core.oq.g f2269m;

        /* renamed from: r, reason: collision with root package name */
        private com.bytedance.msdk.core.oq.oq f2270r;
        private com.bytedance.msdk.cw.m.xt.xt up;
        final /* synthetic */ com.bytedance.msdk.core.up.j.j xt;

        C0229j(com.bytedance.msdk.core.up.j.j r1, com.bytedance.msdk.api.j.xt r2, com.bytedance.msdk.core.oq.oq r3, com.bytedance.msdk.cw.m.xt.xt r4, com.bytedance.msdk.core.oq.g r5, int r6) {
                r0 = this;
                r0.xt = r1
                r0.<init>()
                r0.cw = r2
                r0.f2270r = r3
                r0.up = r4
                r0.j = r6
                r0.f2269m = r5
                long r1 = java.lang.System.currentTimeMillis()
                r0.ae = r1
                return
        }

        public void j(com.bytedance.msdk.api.j r15) {
                r14 = this;
                r0 = r15
                if (r0 == 0) goto L58
                com.bytedance.msdk.core.oq.oq r1 = r14.f2270r
                if (r1 == 0) goto L58
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "--==-- 广告复用:show时预请求广告load失败 --- "
                r1.<init>(r2)
                com.bytedance.msdk.core.oq.oq r2 = r14.f2270r
                java.lang.String r2 = r2.i()
                r1.append(r2)
                java.lang.String r2 = ", "
                r1.append(r2)
                com.bytedance.msdk.core.oq.oq r3 = r14.f2270r
                java.lang.String r3 = r3.w()
                r1.append(r3)
                r1.append(r2)
                com.bytedance.msdk.core.oq.oq r2 = r14.f2270r
                int r2 = r2.jy()
                com.bytedance.msdk.core.oq.oq r3 = r14.f2270r
                int r3 = r3.m()
                java.lang.String r2 = com.bytedance.msdk.xt.j.j(r2, r3)
                r1.append(r2)
                java.lang.String r2 = ", errCode: "
                r1.append(r2)
                int r2 = r0.cw
                r1.append(r2)
                java.lang.String r2 = ",msg="
                r1.append(r2)
                java.lang.String r2 = r0.f2149r
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "TTMediationSDK"
                com.bytedance.msdk.j.up.cw.j(r2, r1)
            L58:
                com.bytedance.msdk.api.j.xt r1 = r14.cw
                com.bytedance.msdk.core.oq.oq r2 = r14.f2270r
                int r3 = r14.j
                com.bytedance.msdk.core.up.j.j r4 = com.bytedance.msdk.core.up.j.j.j()
                com.bytedance.msdk.core.oq.oq r5 = r14.f2270r
                java.lang.String r5 = r5.w()
                java.lang.String r6 = r4.j(r5)
                long r4 = java.lang.System.currentTimeMillis()
                long r7 = r14.ae
                long r7 = r4 - r7
                r11 = 0
                r12 = 0
                r4 = 4
                r5 = 1
                r9 = 0
                r10 = 0
                com.bytedance.msdk.up.m.j(r0, r1, r2, r3, r4, r5, r6, r7, r9, r10, r11, r12)
                return
        }

        public void j(com.bytedance.msdk.xt.cw r1, java.lang.String r2) {
                r0 = this;
                return
        }

        public void j(java.util.List<com.bytedance.msdk.xt.cw> r18) {
                r17 = this;
                r0 = r17
                r1 = r18
                if (r1 == 0) goto Ld0
                int r2 = r1.size()
                if (r2 <= 0) goto Ld0
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r3 = r1.iterator()
            L15:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L51
                java.lang.Object r4 = r3.next()
                com.bytedance.msdk.xt.cw r4 = (com.bytedance.msdk.xt.cw) r4
                if (r4 == 0) goto L15
                com.bytedance.msdk.core.oq.oq r5 = r0.f2270r
                if (r5 == 0) goto L32
                com.bytedance.msdk.core.up.j.j r6 = r0.xt
                java.lang.String r5 = r5.w()
                java.lang.String r5 = r6.j(r5)
                goto L34
            L32:
                java.lang.String r5 = ""
            L34:
                com.bytedance.msdk.api.j.xt r6 = r0.cw
                com.bytedance.msdk.cw.m.xt.xt r7 = r0.up
                com.bytedance.msdk.core.oq.g r8 = r0.f2269m
                com.bytedance.msdk.cw.tl.cw.j(r4, r6, r7, r8, r5)
                long r5 = android.os.SystemClock.elapsedRealtime()
                r4.j(r5)
                com.bytedance.msdk.core.up.xt.ae r5 = new com.bytedance.msdk.core.up.xt.ae
                r6 = 0
                com.bytedance.msdk.api.j.xt r8 = r0.cw
                r5.<init>(r4, r6, r8)
                r2.add(r5)
                goto L15
            L51:
                int r3 = r2.size()
                r4 = 0
                if (r3 <= 0) goto Lac
                java.lang.Object r3 = r2.get(r4)
                com.bytedance.msdk.core.up.xt.ae r3 = (com.bytedance.msdk.core.up.xt.ae) r3
                com.bytedance.msdk.xt.cw r3 = r3.j
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r6 = "--==-- 广告复用:show时预请求广告load成功 --- "
                r5.<init>(r6)
                java.lang.String r6 = r3.ff()
                r5.append(r6)
                java.lang.String r6 = ", adType: "
                r5.append(r6)
                int r6 = r3.om()
                int r7 = r3.rh()
                java.lang.String r6 = com.bytedance.msdk.xt.j.j(r6, r7)
                r5.append(r6)
                java.lang.String r6 = ", adnSlotId: "
                r5.append(r6)
                java.lang.String r6 = r3.qa()
                r5.append(r6)
                java.lang.String r6 = ", ad个数: "
                r5.append(r6)
                int r6 = r2.size()
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                java.lang.String r6 = "TTMediationSDK"
                com.bytedance.msdk.j.up.cw.j(r6, r5)
                com.bytedance.msdk.core.up.j.j r5 = r0.xt
                java.lang.String r3 = r3.qa()
                r5.j(r3, r2, r4)
            Lac:
                java.lang.Object r2 = r1.get(r4)
                r3 = r2
                com.bytedance.msdk.xt.cw r3 = (com.bytedance.msdk.xt.cw) r3
                long r4 = java.lang.System.currentTimeMillis()
                long r6 = r0.ae
                long r6 = r4 - r6
                com.bytedance.msdk.api.j.xt r8 = r0.cw
                int r9 = r0.j
                int r10 = r1.size()
                r13 = -1
                r15 = -1
                r4 = 20000(0x4e20, float:2.8026E-41)
                java.lang.String r5 = "load success"
                r11 = 0
                r12 = 0
                com.bytedance.msdk.up.m.j(r3, r4, r5, r6, r8, r9, r10, r11, r12, r13, r15)
            Ld0:
                return
        }

        public void j(java.util.List<com.bytedance.msdk.xt.cw> r6, com.bytedance.msdk.api.j r7) {
                r5 = this;
                if (r6 == 0) goto L8a
                int r7 = r6.size()
                if (r7 <= 0) goto L8a
                java.util.Iterator r7 = r6.iterator()
            Lc:
                boolean r0 = r7.hasNext()
                if (r0 == 0) goto L37
                java.lang.Object r0 = r7.next()
                com.bytedance.msdk.xt.cw r0 = (com.bytedance.msdk.xt.cw) r0
                com.bytedance.msdk.core.oq.oq r1 = r5.f2270r
                if (r1 == 0) goto L27
                com.bytedance.msdk.core.up.j.j r2 = r5.xt
                java.lang.String r1 = r1.w()
                java.lang.String r1 = r2.j(r1)
                goto L29
            L27:
                java.lang.String r1 = ""
            L29:
                com.bytedance.msdk.api.j.xt r2 = r5.cw
                com.bytedance.msdk.cw.m.xt.xt r3 = r5.up
                com.bytedance.msdk.core.oq.g r4 = r5.f2269m
                com.bytedance.msdk.cw.tl.cw.j(r0, r2, r3, r4, r1)
                r1 = 1
                r0.g(r1)
                goto Lc
            L37:
                r7 = 0
                java.lang.Object r7 = r6.get(r7)
                com.bytedance.msdk.xt.cw r7 = (com.bytedance.msdk.xt.cw) r7
                if (r7 == 0) goto L83
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "--==-- 广告复用:show时预请求广告cache成功 --- "
                r0.<init>(r1)
                java.lang.String r1 = r7.ff()
                r0.append(r1)
                java.lang.String r1 = ", adType: "
                r0.append(r1)
                int r1 = r7.om()
                int r2 = r7.rh()
                java.lang.String r1 = com.bytedance.msdk.xt.j.j(r1, r2)
                r0.append(r1)
                java.lang.String r1 = ", adnSlotId: "
                r0.append(r1)
                java.lang.String r1 = r7.qa()
                r0.append(r1)
                java.lang.String r1 = ", ad个数: "
                r0.append(r1)
                int r6 = r6.size()
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                java.lang.String r0 = "TTMediationSDK"
                com.bytedance.msdk.j.up.cw.j(r0, r6)
            L83:
                com.bytedance.msdk.api.j.xt r6 = r5.cw
                com.bytedance.msdk.core.oq.oq r0 = r5.f2270r
                com.bytedance.msdk.up.m.j(r6, r7, r0)
            L8a:
                return
        }
    }

    private j() {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "unity"
            java.lang.String r1 = "ks"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            r2.j = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.xt = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.cw = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r2.f2264r = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.up = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.f2263m = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.ae = r0
            com.bytedance.msdk.core.up.j.j$4 r0 = new com.bytedance.msdk.core.up.j.j$4
            r0.<init>(r2)
            r2.g = r0
            return
    }

    public static com.bytedance.msdk.core.up.j.j j() {
            com.bytedance.msdk.core.up.j.j r0 = com.bytedance.msdk.core.up.j.j.tl
            if (r0 != 0) goto L19
            java.lang.Class<com.bytedance.msdk.core.up.j.j> r0 = com.bytedance.msdk.core.up.j.j.class
            monitor-enter(r0)
            com.bytedance.msdk.core.up.j.j r1 = com.bytedance.msdk.core.up.j.j.tl     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bytedance.msdk.core.up.j.j r1 = new com.bytedance.msdk.core.up.j.j     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bytedance.msdk.core.up.j.j.tl = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.bytedance.msdk.core.up.j.j r0 = com.bytedance.msdk.core.up.j.j.tl
            return r0
    }

    private java.lang.String j(java.util.List<com.bytedance.msdk.core.up.xt.j> r4) {
            r3 = this;
            int r0 = r4.size()
            if (r0 <= 0) goto L5d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            r1 = 0
        Le:
            int r2 = r4.size()
            if (r1 >= r2) goto L37
            java.lang.Object r2 = r4.get(r1)
            com.bytedance.msdk.core.up.xt.j r2 = (com.bytedance.msdk.core.up.xt.j) r2
            java.lang.String r2 = r2.j()
            r0.append(r2)
            int r2 = r4.size()
            int r2 = r2 + (-1)
            if (r1 != r2) goto L2f
            java.lang.String r2 = "]"
            r0.append(r2)
            goto L34
        L2f:
            java.lang.String r2 = ","
            r0.append(r2)
        L34:
            int r1 = r1 + 1
            goto Le
        L37:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: org.json.JSONException -> L45
            java.lang.String r0 = r0.toString()     // Catch: org.json.JSONException -> L45
            r1.<init>(r0)     // Catch: org.json.JSONException -> L45
            java.lang.String r4 = r1.toString()     // Catch: org.json.JSONException -> L45
            return r4
        L45:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "--==-- 广告复用：adCannotUseInfo json err: "
            r1.<init>(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "TTMediationSDK"
            com.bytedance.msdk.j.up.cw.j(r1, r0)
        L5d:
            int r4 = r4.size()
            if (r4 <= 0) goto L66
            java.lang.String r4 = "json error"
            return r4
        L66:
            java.lang.String r4 = "[]"
            return r4
    }

    static /* synthetic */ java.util.Map j(com.bytedance.msdk.core.up.j.j r0) {
            java.util.Map<java.lang.String, java.util.concurrent.CopyOnWriteArrayList<com.bytedance.msdk.core.up.xt.ae>> r0 = r0.f2264r
            return r0
    }

    static /* synthetic */ java.util.Map j(com.bytedance.msdk.core.up.j.j r0, java.util.List r1, java.lang.String r2, com.bytedance.msdk.api.j.xt r3, int r4, com.bytedance.msdk.xt.cw r5) {
            java.util.Map r0 = r0.xt(r1, r2, r3, r4, r5)
            return r0
    }

    static /* synthetic */ void j(com.bytedance.msdk.core.up.j.j r0, java.lang.String r1, com.bytedance.msdk.api.j.xt r2, java.util.Map r3, android.content.Context r4, com.bytedance.msdk.api.r.qv r5, com.bytedance.msdk.core.oq.g r6) {
            r0.j(r1, r2, r3, r4, r5, r6)
            return
    }

    private void j(java.lang.String r22, com.bytedance.msdk.api.j.xt r23, java.util.Map<java.lang.String, java.lang.Object> r24, android.content.Context r25, com.bytedance.msdk.api.r.qv r26, com.bytedance.msdk.core.oq.g r27) {
            r21 = this;
            r1 = r21
            r7 = r22
            java.lang.String r8 = "TTMediationSDK"
            if (r23 != 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "--==-- 广告复用:show时预请求取消，adSlot为空 -------: "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.j(r8, r0)
            return
        L1a:
            if (r25 != 0) goto L2e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "--==-- 广告复用:show时预请求取消，context为null -------: "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.j(r8, r0)
            return
        L2e:
            java.lang.String r0 = r23.v()
            com.bytedance.msdk.core.oq.oq r2 = r1.up(r0, r7)
            r3 = 0
            if (r2 == 0) goto L5a
            java.lang.String r0 = r2.ae()     // Catch: java.lang.Throwable -> L56
            java.lang.String r4 = r2.az()     // Catch: java.lang.Throwable -> L56
            java.lang.String r4 = com.bytedance.msdk.core.ae.cw.j(r4)     // Catch: java.lang.Throwable -> L56
            int r5 = r2.jy()     // Catch: java.lang.Throwable -> L56
            int r6 = r2.m()     // Catch: java.lang.Throwable -> L56
            java.lang.String r5 = com.bytedance.msdk.xt.j.j(r5, r6)     // Catch: java.lang.Throwable -> L56
            java.lang.String r0 = com.bytedance.msdk.core.ae.cw.j(r0, r4, r5)     // Catch: java.lang.Throwable -> L56
            goto L5b
        L56:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        L5a:
            r0 = r3
        L5b:
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L69
            boolean r4 = com.bytedance.msdk.core.ae.cw.xt(r0)
            if (r4 == 0) goto L69
            if (r2 != 0) goto L6d
        L69:
            r1 = r2
            r2 = r8
            goto L1a2
        L6d:
            java.lang.String[] r0 = r1.j
            int r4 = r0.length
            r5 = 0
        L71:
            if (r5 >= r4) goto L9c
            r6 = r0[r5]
            java.lang.String r9 = r2.az()
            boolean r9 = android.text.TextUtils.equals(r6, r9)
            if (r9 == 0) goto L99
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "--==-- 广告复用:show时预请求取消，"
            r0.<init>(r2)
            r0.append(r6)
            java.lang.String r2 = "为单例模式 -------: "
            r0.append(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.j(r8, r0)
            return
        L99:
            int r5 = r5 + 1
            goto L71
        L9c:
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r1.ae
            java.lang.Object r0 = r0.get(r7)
            if (r0 == 0) goto Lb2
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r1.ae
            java.lang.Object r0 = r0.get(r7)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r6 = r0
            goto Lb4
        Lb2:
            r0 = -1
            r6 = -1
        Lb4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "--==-- 广告复用:show时预请求开始 -------: "
            r0.<init>(r4)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.j(r8, r0)
            com.bytedance.msdk.cw.m.xt.xt r4 = com.bytedance.msdk.cw.m.xt.xt.j(r2, r3)
            r9 = 4
            r4.cw(r9)
            r10 = 1
            r4.xt(r10)
            com.bytedance.msdk.core.up.j.j$j r0 = new com.bytedance.msdk.core.up.j.j$j
            r5 = r27
            r3 = r2
            r2 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r1 = r3
            com.bytedance.msdk.cw.j.j r0 = com.bytedance.msdk.cw.tl.cw.j(r4, r2, r0)
            if (r0 == 0) goto L19d
            com.bytedance.msdk.core.tl.qv r3 = com.bytedance.msdk.core.tl.qv.j()
            java.lang.String r5 = r2.v()
            java.lang.String r9 = r1.w()
            boolean r3 = r3.cw(r5, r9)
            if (r3 != 0) goto L157
            java.lang.String r0 = "TMe"
            java.lang.String r3 = "adn 代码位预请求触发次数拦截............"
            com.bytedance.msdk.j.up.cw.j(r0, r3)
            com.bytedance.msdk.core.tl.qv r0 = com.bytedance.msdk.core.tl.qv.j()
            java.lang.String r3 = r2.v()
            java.lang.String r4 = r1.w()
            android.util.Pair r0 = r0.j(r3, r4)
            if (r0 == 0) goto L156
            com.bytedance.msdk.api.xt.xt r9 = new com.bytedance.msdk.api.xt.xt
            r3 = 41041(0xa051, float:5.751E-41)
            java.lang.String r4 = com.bytedance.msdk.api.j.j(r3)
            java.lang.Object r5 = r0.second
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.first
            java.lang.String r0 = (java.lang.String) r0
            r9.<init>(r3, r4, r5, r0)
            com.bytedance.msdk.core.up.j.j r0 = j()
            java.lang.String r3 = r1.w()
            java.lang.String r3 = r0.j(r3)
            r12 = 0
            r13 = 0
            r4 = 1
            r5 = 2
            r7 = 4
            r8 = 1
            r10 = -1
            com.bytedance.msdk.up.m.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            com.bytedance.msdk.core.up.j.j r0 = j()
            java.lang.String r2 = r1.w()
            java.lang.String r0 = r0.j(r2)
            r11 = 0
            r12 = 0
            r4 = 4
            r5 = 1
            r7 = 0
            r3 = r6
            r6 = r0
            r0 = r9
            r9 = 0
            r10 = 0
            r2 = r1
            r1 = r23
            com.bytedance.msdk.up.m.j(r0, r1, r2, r3, r4, r5, r6, r7, r9, r10, r11, r12)
        L156:
            return
        L157:
            com.bytedance.msdk.core.up.j.j r2 = j()
            java.lang.String r3 = r1.w()
            java.lang.String r10 = r2.j(r3)
            boolean r11 = r4.up()
            int r13 = r4.cw()
            long r17 = r4.r()
            r19 = 0
            r20 = 0
            r12 = 3
            r14 = 4
            r15 = 1
            r16 = 0
            r9 = r23
            r2 = r8
            r8 = r1
            r1 = r25
            com.bytedance.msdk.up.m.j(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r20)
            r5 = r24
            r3 = r9
            java.util.Map r5 = com.bytedance.msdk.cw.tl.cw.j(r4, r3, r5)
            r0.j(r1, r4, r3, r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "--==-- 广告复用:show时预请求已发完 -------: "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.j(r2, r0)
            return
        L19d:
            r3 = r2
            com.bytedance.msdk.up.m.j(r1, r3, r9, r10)
            return
        L1a2:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "--==-- 广告复用:show时预请求取消，className或wfcBean为空, className: "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = ", wfcBean: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = ", adnSlotId: "
            r3.append(r0)
            r3.append(r7)
            java.lang.String r0 = r3.toString()
            com.bytedance.msdk.j.up.cw.j(r2, r0)
            return
    }

    private boolean j(java.util.List<com.bytedance.msdk.core.up.xt.ae> r3, com.bytedance.msdk.core.up.xt.ae r4) {
            r2 = this;
            java.util.Iterator r3 = r3.iterator()
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r3.next()
            com.bytedance.msdk.core.up.xt.ae r0 = (com.bytedance.msdk.core.up.xt.ae) r0
            if (r0 == 0) goto L4
            if (r4 == 0) goto L4
            com.bytedance.msdk.xt.cw r0 = r0.j
            com.bytedance.msdk.xt.cw r1 = r4.j
            if (r0 != r1) goto L4
            r3 = 1
            return r3
        L1c:
            r3 = 0
            return r3
    }

    private int xt(java.lang.String r17, com.bytedance.msdk.api.j.xt r18, boolean r19) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.util.Map<java.lang.String, java.util.concurrent.CopyOnWriteArrayList<com.bytedance.msdk.core.up.xt.ae>> r3 = r0.f2264r
            java.lang.Object r3 = r3.get(r1)
            java.util.List r3 = (java.util.List) r3
            r4 = 1
            java.lang.String r5 = "TTMediationSDK"
            if (r3 == 0) goto L10d
            int r6 = r3.size()
            if (r6 <= 0) goto L10d
            if (r2 == 0) goto L20
            java.lang.String r6 = r2.v()
            goto L22
        L20:
            java.lang.String r6 = ""
        L22:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r3.iterator()
            r9 = 0
            r10 = 0
            r11 = 0
        L2e:
            boolean r12 = r8.hasNext()
            r13 = 2
            if (r12 == 0) goto Lfb
            java.lang.Object r12 = r8.next()
            com.bytedance.msdk.core.up.xt.ae r12 = (com.bytedance.msdk.core.up.xt.ae) r12
            com.bytedance.msdk.xt.cw r14 = r12.j
            java.lang.Integer r14 = r14.m()
            if (r14 == 0) goto L48
            int r14 = r14.intValue()
            goto L49
        L48:
            r14 = 0
        L49:
            r15 = 4
            if (r14 != r15) goto L53
            com.bytedance.msdk.xt.cw r13 = r12.j
            boolean r13 = r0.j(r6, r13)
            goto L58
        L53:
            if (r14 == r13) goto L57
            r13 = 1
            goto L58
        L57:
            r13 = 0
        L58:
            java.lang.String r14 = ", adSlotId: "
            if (r13 != 0) goto La6
            com.bytedance.msdk.api.j.xt r13 = r12.r()
            com.bytedance.msdk.xt.cw r15 = r12.j
            boolean r13 = com.bytedance.msdk.core.up.j.j(r13, r2, r15)
            if (r13 == 0) goto L87
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r13 = "--==-- 广告复用:复用成功：--------"
            r11.<init>(r13)
            com.bytedance.msdk.xt.cw r12 = r12.j
            java.lang.String r12 = r12.ff()
            r11.append(r12)
            r11.append(r14)
            r11.append(r1)
            java.lang.String r11 = r11.toString()
            com.bytedance.msdk.j.up.cw.j(r5, r11)
            r11 = 1
            goto L2e
        L87:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r15 = "--==-- 广告复用:AdSlot不符合 -------: "
            r13.<init>(r15)
            com.bytedance.msdk.xt.cw r15 = r12.j
            java.lang.String r15 = r15.ff()
            r13.append(r15)
            r13.append(r14)
            r13.append(r1)
            java.lang.String r13 = r13.toString()
            com.bytedance.msdk.j.up.cw.j(r5, r13)
            r13 = 6
            goto Lc7
        La6:
            r3.remove(r12)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r15 = "--==-- 广告复用:广告过期了 -------: "
            r13.<init>(r15)
            com.bytedance.msdk.xt.cw r15 = r12.j
            java.lang.String r15 = r15.ff()
            r13.append(r15)
            r13.append(r14)
            r13.append(r1)
            java.lang.String r13 = r13.toString()
            com.bytedance.msdk.j.up.cw.j(r5, r13)
            r13 = 5
        Lc7:
            if (r10 != 0) goto Lca
            r10 = r12
        Lca:
            com.bytedance.msdk.core.up.xt.j r14 = new com.bytedance.msdk.core.up.xt.j
            r14.<init>()
            com.bytedance.msdk.xt.cw r15 = r12.j
            int r15 = r15.wi()
            r14.r(r15)
            com.bytedance.msdk.xt.cw r15 = r12.j
            int r15 = r15.d()
            r14.up(r15)
            com.bytedance.msdk.xt.cw r15 = r12.j
            java.lang.String r15 = r15.qa()
            r14.xt(r15)
            r14.xt(r13)
            com.bytedance.msdk.xt.cw r12 = r12.j
            boolean r12 = r12.qb()
            r14.j(r12)
            r7.add(r14)
            goto L2e
        Lfb:
            if (r11 == 0) goto Lff
            r1 = 3
            return r1
        Lff:
            if (r19 == 0) goto L10c
            if (r10 == 0) goto L10c
            com.bytedance.msdk.xt.cw r1 = r10.j
            java.lang.String r3 = r0.j(r7)
            com.bytedance.msdk.up.m.j(r2, r1, r3)
        L10c:
            return r13
        L10d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "--==-- 广告复用:当前没有广告缓存 -------adnSlotId: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.bytedance.msdk.j.up.cw.j(r5, r1)
            return r4
    }

    private java.util.Map<java.lang.String, java.util.List<com.bytedance.msdk.core.up.xt.ae>> xt(java.util.List<com.bytedance.msdk.xt.cw> r7, java.lang.String r8, com.bytedance.msdk.api.j.xt r9, int r10, com.bytedance.msdk.xt.cw r11) {
            r6 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L9:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L64
            java.lang.Object r1 = r7.next()
            com.bytedance.msdk.xt.cw r1 = (com.bytedance.msdk.xt.cw) r1
            if (r1 == 0) goto L1d
            if (r1 == r11) goto L1d
            r2 = 0
            r1.j(r2)
        L1d:
            if (r1 == 0) goto L9
            if (r1 == r11) goto L9
            java.lang.String r2 = r1.qa()
            int r2 = r6.up(r8, r2, r10)
            r3 = 2
            if (r2 != r3) goto L9
            boolean r2 = r1.wq(r8)
            if (r2 == 0) goto L9
            boolean r2 = r1.qb()
            if (r2 != 0) goto L9
            java.lang.String r2 = r1.qa()
            java.lang.Object r2 = r0.get(r2)
            java.util.List r2 = (java.util.List) r2
            r3 = 0
            if (r2 != 0) goto L5b
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.bytedance.msdk.core.up.xt.ae r5 = new com.bytedance.msdk.core.up.xt.ae
            r5.<init>(r1, r3, r9)
            r2.add(r5)
            java.lang.String r1 = r1.qa()
            r0.put(r1, r2)
            goto L9
        L5b:
            com.bytedance.msdk.core.up.xt.ae r5 = new com.bytedance.msdk.core.up.xt.ae
            r5.<init>(r1, r3, r9)
            r2.add(r5)
            goto L9
        L64:
            return r0
    }

    public void cw(java.lang.String r3, java.lang.String r4, int r5) {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r2.xt
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = "_"
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r0.put(r3, r4)
            return
    }

    public boolean cw(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r2.cw
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = "_"
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            java.lang.Object r3 = r0.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L26
            int r3 = r3.intValue()
            r4 = 1
            if (r3 != r4) goto L26
            return r4
        L26:
            r3 = 0
            return r3
    }

    public synchronized int j(java.lang.String r10, com.bytedance.msdk.api.j.xt r11, boolean r12) {
            r9 = this;
            monitor-enter(r9)
            if (r11 == 0) goto Lb
            java.lang.String r0 = r11.v()     // Catch: java.lang.Throwable -> L8
            goto Ld
        L8:
            r10 = move-exception
            goto Lb9
        Lb:
            java.lang.String r0 = ""
        Ld:
            int r0 = r9.xt(r0, r10)     // Catch: java.lang.Throwable -> L8
            if (r0 != 0) goto L19
            int r10 = r9.xt(r10, r11, r12)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r9)
            return r10
        L19:
            java.util.Map<java.lang.String, java.util.concurrent.CopyOnWriteArrayList<com.bytedance.msdk.core.up.xt.ae>> r0 = r9.f2264r     // Catch: java.lang.Throwable -> L8
            java.lang.Object r0 = r0.get(r10)     // Catch: java.lang.Throwable -> L8
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L8
            r1 = 1
            if (r0 == 0) goto La4
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L8
            if (r2 <= 0) goto La4
            r10 = 0
            if (r12 == 0) goto L33
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8
            r2.<init>()     // Catch: java.lang.Throwable -> L8
            goto L34
        L33:
            r2 = r10
        L34:
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L8
            r4 = 0
        L39:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L8
            if (r5 == 0) goto L8f
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> L8
            com.bytedance.msdk.core.up.xt.ae r5 = (com.bytedance.msdk.core.up.xt.ae) r5     // Catch: java.lang.Throwable -> L8
            com.bytedance.msdk.api.j.xt r6 = r5.r()     // Catch: java.lang.Throwable -> L8
            java.lang.String r7 = "广告复用"
            int r6 = r9.j(r5, r6, r11, r7)     // Catch: java.lang.Throwable -> L8
            r7 = -1
            if (r6 != r7) goto L54
            r4 = 1
            goto L39
        L54:
            r7 = 6
            if (r6 == r7) goto L5a
            r0.remove(r5)     // Catch: java.lang.Throwable -> L8
        L5a:
            if (r12 == 0) goto L39
            if (r10 != 0) goto L5f
            r10 = r5
        L5f:
            com.bytedance.msdk.core.up.xt.j r7 = new com.bytedance.msdk.core.up.xt.j     // Catch: java.lang.Throwable -> L8
            r7.<init>()     // Catch: java.lang.Throwable -> L8
            com.bytedance.msdk.xt.cw r8 = r5.j     // Catch: java.lang.Throwable -> L8
            int r8 = r8.wi()     // Catch: java.lang.Throwable -> L8
            r7.r(r8)     // Catch: java.lang.Throwable -> L8
            com.bytedance.msdk.xt.cw r8 = r5.j     // Catch: java.lang.Throwable -> L8
            int r8 = r8.d()     // Catch: java.lang.Throwable -> L8
            r7.up(r8)     // Catch: java.lang.Throwable -> L8
            com.bytedance.msdk.xt.cw r8 = r5.j     // Catch: java.lang.Throwable -> L8
            java.lang.String r8 = r8.qa()     // Catch: java.lang.Throwable -> L8
            r7.xt(r8)     // Catch: java.lang.Throwable -> L8
            r7.xt(r6)     // Catch: java.lang.Throwable -> L8
            com.bytedance.msdk.xt.cw r5 = r5.j     // Catch: java.lang.Throwable -> L8
            boolean r5 = r5.qb()     // Catch: java.lang.Throwable -> L8
            r7.j(r5)     // Catch: java.lang.Throwable -> L8
            r2.add(r7)     // Catch: java.lang.Throwable -> L8
            goto L39
        L8f:
            if (r4 == 0) goto L94
            monitor-exit(r9)
            r10 = 3
            return r10
        L94:
            if (r12 == 0) goto La1
            if (r10 == 0) goto La1
            com.bytedance.msdk.xt.cw r10 = r10.j     // Catch: java.lang.Throwable -> L8
            java.lang.String r12 = r9.j(r2)     // Catch: java.lang.Throwable -> L8
            com.bytedance.msdk.up.m.j(r11, r10, r12)     // Catch: java.lang.Throwable -> L8
        La1:
            monitor-exit(r9)
            r10 = 2
            return r10
        La4:
            java.lang.String r11 = "TTMediationSDK"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8
            java.lang.String r0 = "--==-- 广告复用:当前没有广告缓存 -------adnSlotId: "
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L8
            r12.append(r10)     // Catch: java.lang.Throwable -> L8
            java.lang.String r10 = r12.toString()     // Catch: java.lang.Throwable -> L8
            com.bytedance.msdk.j.up.cw.j(r11, r10)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r9)
            return r1
        Lb9:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L8
            throw r10
    }

    public java.lang.String j(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f2263m
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    public synchronized java.util.List<com.bytedance.msdk.core.up.xt.ae> j(java.lang.String r9, com.bytedance.msdk.api.j.xt r10, int r11) {
            r8 = this;
            monitor-enter(r8)
            java.util.Map<java.lang.String, java.util.concurrent.CopyOnWriteArrayList<com.bytedance.msdk.core.up.xt.ae>> r0 = r8.f2264r     // Catch: java.lang.Throwable -> L16
            java.lang.Object r0 = r0.get(r9)     // Catch: java.lang.Throwable -> L16
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto Le
            monitor-exit(r8)
            r9 = 0
            return r9
        Le:
            r1 = 1
            if (r10 == 0) goto L19
            int r2 = r10.a()     // Catch: java.lang.Throwable -> L16
            goto L1a
        L16:
            r9 = move-exception
            goto L181
        L19:
            r2 = 1
        L1a:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L16
            r3.<init>()     // Catch: java.lang.Throwable -> L16
            java.lang.String r4 = ""
            if (r10 == 0) goto L27
            java.lang.String r4 = r10.v()     // Catch: java.lang.Throwable -> L16
        L27:
            int r11 = r8.up(r4, r9, r11)     // Catch: java.lang.Throwable -> L16
            if (r11 != r1) goto Ld8
            r11 = 0
            r4 = 0
        L2f:
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L16
            if (r5 >= r2) goto L69
            int r5 = r0.size()     // Catch: java.lang.Throwable -> L16
            if (r4 >= r5) goto L69
            java.lang.Object r5 = r0.get(r4)     // Catch: java.lang.Throwable -> L16
            com.bytedance.msdk.core.up.xt.ae r5 = (com.bytedance.msdk.core.up.xt.ae) r5     // Catch: java.lang.Throwable -> L16
            boolean r5 = r5.cw()     // Catch: java.lang.Throwable -> L16
            if (r5 != 0) goto L66
            java.lang.Object r5 = r0.get(r4)     // Catch: java.lang.Throwable -> L16
            com.bytedance.msdk.core.up.xt.ae r5 = (com.bytedance.msdk.core.up.xt.ae) r5     // Catch: java.lang.Throwable -> L16
            com.bytedance.msdk.api.j.xt r5 = r5.r()     // Catch: java.lang.Throwable -> L16
            java.lang.Object r6 = r0.get(r4)     // Catch: java.lang.Throwable -> L16
            com.bytedance.msdk.core.up.xt.ae r6 = (com.bytedance.msdk.core.up.xt.ae) r6     // Catch: java.lang.Throwable -> L16
            com.bytedance.msdk.xt.cw r6 = r6.j     // Catch: java.lang.Throwable -> L16
            boolean r5 = com.bytedance.msdk.core.up.j.j(r5, r10, r6)     // Catch: java.lang.Throwable -> L16
            if (r5 == 0) goto L66
            java.lang.Object r5 = r0.get(r4)     // Catch: java.lang.Throwable -> L16
            r3.add(r5)     // Catch: java.lang.Throwable -> L16
        L66:
            int r4 = r4 + 1
            goto L2f
        L69:
            int r4 = r3.size()     // Catch: java.lang.Throwable -> L16
            if (r4 >= r2) goto La3
            int r4 = r0.size()     // Catch: java.lang.Throwable -> L16
            if (r11 >= r4) goto La3
            java.lang.Object r4 = r0.get(r11)     // Catch: java.lang.Throwable -> L16
            com.bytedance.msdk.core.up.xt.ae r4 = (com.bytedance.msdk.core.up.xt.ae) r4     // Catch: java.lang.Throwable -> L16
            boolean r4 = r4.cw()     // Catch: java.lang.Throwable -> L16
            if (r4 == 0) goto La0
            java.lang.Object r4 = r0.get(r11)     // Catch: java.lang.Throwable -> L16
            com.bytedance.msdk.core.up.xt.ae r4 = (com.bytedance.msdk.core.up.xt.ae) r4     // Catch: java.lang.Throwable -> L16
            com.bytedance.msdk.api.j.xt r4 = r4.r()     // Catch: java.lang.Throwable -> L16
            java.lang.Object r5 = r0.get(r11)     // Catch: java.lang.Throwable -> L16
            com.bytedance.msdk.core.up.xt.ae r5 = (com.bytedance.msdk.core.up.xt.ae) r5     // Catch: java.lang.Throwable -> L16
            com.bytedance.msdk.xt.cw r5 = r5.j     // Catch: java.lang.Throwable -> L16
            boolean r4 = com.bytedance.msdk.core.up.j.j(r4, r10, r5)     // Catch: java.lang.Throwable -> L16
            if (r4 == 0) goto La0
            java.lang.Object r4 = r0.get(r11)     // Catch: java.lang.Throwable -> L16
            r3.add(r4)     // Catch: java.lang.Throwable -> L16
        La0:
            int r11 = r11 + 1
            goto L69
        La3:
            java.util.Iterator r10 = r3.iterator()     // Catch: java.lang.Throwable -> L16
        La7:
            boolean r11 = r10.hasNext()     // Catch: java.lang.Throwable -> L16
            if (r11 == 0) goto Lb7
            java.lang.Object r11 = r10.next()     // Catch: java.lang.Throwable -> L16
            com.bytedance.msdk.core.up.xt.ae r11 = (com.bytedance.msdk.core.up.xt.ae) r11     // Catch: java.lang.Throwable -> L16
            r11.j(r1)     // Catch: java.lang.Throwable -> L16
            goto La7
        Lb7:
            java.lang.String r10 = "TTMediationSDK"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16
            java.lang.String r0 = "--==-- 复用模式1，不从复用池移除，获取缓存: "
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L16
            r11.append(r9)     // Catch: java.lang.Throwable -> L16
            java.lang.String r9 = ", "
            r11.append(r9)     // Catch: java.lang.Throwable -> L16
            int r9 = r3.size()     // Catch: java.lang.Throwable -> L16
            r11.append(r9)     // Catch: java.lang.Throwable -> L16
            java.lang.String r9 = r11.toString()     // Catch: java.lang.Throwable -> L16
            com.bytedance.msdk.j.up.cw.j(r10, r9)     // Catch: java.lang.Throwable -> L16
            goto L16b
        Ld8:
            r4 = 2
            if (r11 != r4) goto L16b
            java.util.Iterator r11 = r0.iterator()     // Catch: java.lang.Throwable -> L16
        Ldf:
            boolean r4 = r11.hasNext()     // Catch: java.lang.Throwable -> L16
            if (r4 == 0) goto L14c
            java.lang.Object r4 = r11.next()     // Catch: java.lang.Throwable -> L16
            com.bytedance.msdk.core.up.xt.ae r4 = (com.bytedance.msdk.core.up.xt.ae) r4     // Catch: java.lang.Throwable -> L16
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L16
            if (r5 >= r2) goto L14c
            boolean r5 = r4.ae()     // Catch: java.lang.Throwable -> L16
            if (r5 == 0) goto L133
            com.bytedance.msdk.xt.cw r5 = r4.j     // Catch: java.lang.Throwable -> L16
            if (r5 == 0) goto L133
            java.lang.String r5 = "TTMediationSDK"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16
            java.lang.String r7 = "--==-- 复用模式2，广告："
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L16
            java.lang.String r7 = r4.xt()     // Catch: java.lang.Throwable -> L16
            r6.append(r7)     // Catch: java.lang.Throwable -> L16
            java.lang.String r7 = "  adnName:"
            r6.append(r7)     // Catch: java.lang.Throwable -> L16
            com.bytedance.msdk.xt.cw r7 = r4.j     // Catch: java.lang.Throwable -> L16
            java.lang.String r7 = r7.zz()     // Catch: java.lang.Throwable -> L16
            r6.append(r7)     // Catch: java.lang.Throwable -> L16
            java.lang.String r7 = " showSort:"
            r6.append(r7)     // Catch: java.lang.Throwable -> L16
            com.bytedance.msdk.xt.cw r7 = r4.j     // Catch: java.lang.Throwable -> L16
            int r7 = r7.d()     // Catch: java.lang.Throwable -> L16
            r6.append(r7)     // Catch: java.lang.Throwable -> L16
            java.lang.String r7 = " 暂不可用， 已经被使用中..."
            r6.append(r7)     // Catch: java.lang.Throwable -> L16
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L16
            com.bytedance.msdk.j.up.cw.xt(r5, r6)     // Catch: java.lang.Throwable -> L16
        L133:
            com.bytedance.msdk.api.j.xt r5 = r4.r()     // Catch: java.lang.Throwable -> L16
            com.bytedance.msdk.xt.cw r6 = r4.j     // Catch: java.lang.Throwable -> L16
            boolean r5 = com.bytedance.msdk.core.up.j.j(r5, r10, r6)     // Catch: java.lang.Throwable -> L16
            if (r5 == 0) goto Ldf
            boolean r5 = r4.ae()     // Catch: java.lang.Throwable -> L16
            if (r5 != 0) goto Ldf
            r0.remove(r4)     // Catch: java.lang.Throwable -> L16
            r3.add(r4)     // Catch: java.lang.Throwable -> L16
            goto Ldf
        L14c:
            java.lang.String r10 = "TTMediationSDK"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16
            java.lang.String r0 = "--==-- 复用模式2，从复用池移除，获取缓存: "
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L16
            r11.append(r9)     // Catch: java.lang.Throwable -> L16
            java.lang.String r9 = ", "
            r11.append(r9)     // Catch: java.lang.Throwable -> L16
            int r9 = r3.size()     // Catch: java.lang.Throwable -> L16
            r11.append(r9)     // Catch: java.lang.Throwable -> L16
            java.lang.String r9 = r11.toString()     // Catch: java.lang.Throwable -> L16
            com.bytedance.msdk.j.up.cw.j(r10, r9)     // Catch: java.lang.Throwable -> L16
        L16b:
            java.util.Iterator r9 = r3.iterator()     // Catch: java.lang.Throwable -> L16
        L16f:
            boolean r10 = r9.hasNext()     // Catch: java.lang.Throwable -> L16
            if (r10 == 0) goto L17f
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> L16
            com.bytedance.msdk.core.up.xt.ae r10 = (com.bytedance.msdk.core.up.xt.ae) r10     // Catch: java.lang.Throwable -> L16
            r10.xt(r1)     // Catch: java.lang.Throwable -> L16
            goto L16f
        L17f:
            monitor-exit(r8)
            return r3
        L181:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L16
            throw r9
    }

    public void j(java.lang.String r10, com.bytedance.msdk.api.j.xt r11, java.util.Map<java.lang.String, java.lang.Object> r12, boolean r13, com.bytedance.msdk.api.r.qv r14, com.bytedance.msdk.core.oq.g r15, android.content.Context r16) {
            r9 = this;
            com.bytedance.msdk.core.up.j.j$2 r0 = new com.bytedance.msdk.core.up.j.j$2
            r1 = r9
            r2 = r10
            r3 = r11
            r5 = r12
            r4 = r13
            r7 = r14
            r8 = r15
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            com.bytedance.msdk.j.up.m.j(r0)
            return
    }

    public void j(java.lang.String r3, java.lang.String r4, com.bytedance.msdk.core.oq.oq r5, int r6) {
            r2 = this;
            if (r5 == 0) goto L1b
            java.util.Map<java.lang.String, com.bytedance.msdk.core.oq.oq> r0 = r2.up
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = "_"
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            r0.put(r3, r5)
        L1b:
            java.util.Map<java.lang.String, java.lang.Integer> r3 = r2.ae
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r3.put(r4, r5)
            return
    }

    public void j(java.lang.String r4, java.util.List<com.bytedance.msdk.core.up.xt.ae> r5, boolean r6) {
            r3 = this;
            if (r5 == 0) goto L46
            int r0 = r5.size()
            if (r0 > 0) goto L9
            goto L46
        L9:
            java.util.Map<java.lang.String, java.util.concurrent.CopyOnWriteArrayList<com.bytedance.msdk.core.up.xt.ae>> r0 = r3.f2264r
            java.lang.Object r0 = r0.get(r4)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L2d
            java.util.Iterator r5 = r5.iterator()
        L17:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r5.next()
            com.bytedance.msdk.core.up.xt.ae r1 = (com.bytedance.msdk.core.up.xt.ae) r1
            boolean r2 = r3.j(r0, r1)
            if (r2 != 0) goto L17
            r0.add(r1)
            goto L17
        L2d:
            java.util.Map<java.lang.String, java.util.concurrent.CopyOnWriteArrayList<com.bytedance.msdk.core.up.xt.ae>> r0 = r3.f2264r
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>(r5)
            r0.put(r4, r1)
        L37:
            if (r6 == 0) goto L46
            java.util.Map<java.lang.String, java.util.concurrent.CopyOnWriteArrayList<com.bytedance.msdk.core.up.xt.ae>> r5 = r3.f2264r
            java.lang.Object r4 = r5.get(r4)
            java.util.List r4 = (java.util.List) r4
            java.util.Comparator<com.bytedance.msdk.core.up.xt.ae> r5 = r3.g
            com.bytedance.msdk.tl.la.j(r4, r5)
        L46:
            return
    }

    public void j(java.util.List<com.bytedance.msdk.xt.cw> r9, java.lang.String r10, com.bytedance.msdk.api.j.xt r11, int r12, com.bytedance.msdk.xt.cw r13) {
            r8 = this;
            if (r9 == 0) goto L1f
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L1f
            if (r11 == 0) goto L1f
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L11
            goto L1f
        L11:
            com.bytedance.msdk.core.up.j.j$3 r1 = new com.bytedance.msdk.core.up.j.j$3
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7)
            com.bytedance.msdk.j.up.m.j(r1)
        L1f:
            return
    }

    public void m(java.lang.String r3, java.lang.String r4, int r5) {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r2.cw
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = "_"
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r0.put(r3, r4)
            return
    }

    public void r(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f2263m
            r0.put(r2, r3)
            return
    }

    public boolean r(java.lang.String r4, java.lang.String r5, int r6) {
            r3 = this;
            r0 = 0
            r1 = 2
            if (r6 != r1) goto L5
            return r0
        L5:
            java.util.Map<java.lang.String, java.lang.Integer> r6 = r3.xt
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.lang.String r4 = "_"
            r2.append(r4)
            r2.append(r5)
            java.lang.String r4 = r2.toString()
            java.lang.Object r4 = r6.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L31
            int r5 = r4.intValue()
            r6 = 1
            if (r5 == r6) goto L30
            int r4 = r4.intValue()
            if (r4 != r1) goto L31
        L30:
            return r6
        L31:
            return r0
    }

    public int up(java.lang.String r3, java.lang.String r4, int r5) {
            r2 = this;
            r0 = 2
            r1 = 0
            if (r5 != r0) goto L5
            return r1
        L5:
            java.util.Map<java.lang.String, java.lang.Integer> r5 = r2.xt
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = "_"
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            java.lang.Object r3 = r5.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L28
            int r3 = r3.intValue()
            return r3
        L28:
            return r1
    }

    public com.bytedance.msdk.core.oq.oq up(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.util.Map<java.lang.String, com.bytedance.msdk.core.oq.oq> r0 = r2.up
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = "_"
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            java.lang.Object r3 = r0.get(r3)
            com.bytedance.msdk.core.oq.oq r3 = (com.bytedance.msdk.core.oq.oq) r3
            return r3
    }

    public void xt() {
            r1 = this;
            com.bytedance.msdk.core.up.j.j$1 r0 = new com.bytedance.msdk.core.up.j.j$1
            r0.<init>(r1)
            com.bytedance.msdk.j.up.m.j(r0)
            return
    }
}
