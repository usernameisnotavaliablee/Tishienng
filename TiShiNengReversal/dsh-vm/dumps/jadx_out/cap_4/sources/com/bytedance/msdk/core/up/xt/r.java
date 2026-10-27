package com.bytedance.msdk.core.up.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class r extends com.bytedance.msdk.core.up.j {
    private static volatile com.bytedance.msdk.core.up.xt.r j;
    private final java.util.Map<java.lang.String, java.lang.Boolean> ae;
    private final java.util.Map<java.lang.String, java.lang.Long> cw;
    private boolean g;
    private int jy;

    /* renamed from: m, reason: collision with root package name */
    private final java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.bytedance.msdk.api.j>> f2274m;
    private int oq;
    private java.util.List<java.lang.String> qv;

    /* renamed from: r, reason: collision with root package name */
    private final java.util.Map<java.lang.String, com.bytedance.msdk.api.j.xt> f2275r;
    private final java.util.Map<java.lang.String, com.bytedance.msdk.core.up.xt.xt> tl;
    private final java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<com.bytedance.msdk.core.up.xt.ae>>> up;
    private int vl;
    private final java.util.Map<java.lang.String, java.lang.Integer> xt;




    public interface cw {
        void j(java.lang.String r1, boolean r2, int r3, java.util.List<com.bytedance.msdk.xt.cw> r4);
    }

    private class j {
        private int ae;
        private final int cw;
        final /* synthetic */ com.bytedance.msdk.core.up.xt.r j;

        /* renamed from: m, reason: collision with root package name */
        private final com.bytedance.msdk.core.up.xt.r.xt f2279m;

        /* renamed from: r, reason: collision with root package name */
        private final int f2280r;
        private int tl;
        private final java.util.List<com.bytedance.msdk.api.r.jy> up;
        private final android.app.Activity xt;



        j(com.bytedance.msdk.core.up.xt.r r1, android.app.Activity r2, java.util.List<com.bytedance.msdk.api.r.jy> r3, int r4, int r5, com.bytedance.msdk.core.up.xt.r.xt r6) {
                r0 = this;
                r0.j = r1
                r0.<init>()
                r0.xt = r2
                r0.up = r3
                r0.cw = r4
                r0.f2280r = r5
                r0.f2279m = r6
                int r1 = r3.size()
                r0.ae = r1
                int r1 = r3.size()
                r0.tl = r1
                return
        }

        static /* synthetic */ int cw(com.bytedance.msdk.core.up.xt.r.j r2) {
                int r0 = r2.tl
                int r1 = r0 + (-1)
                r2.tl = r1
                return r0
        }

        private void j() {
                r10 = this;
                r0 = 0
                r1 = 0
            L2:
                int r2 = r10.cw
                if (r1 >= r2) goto Lb4
                java.util.List<com.bytedance.msdk.api.r.jy> r2 = r10.up
                int r2 = r2.size()
                if (r2 <= 0) goto Lb0
                java.util.List<com.bytedance.msdk.api.r.jy> r2 = r10.up
                java.lang.Object r2 = r2.remove(r0)
                com.bytedance.msdk.api.r.jy r2 = (com.bytedance.msdk.api.r.jy) r2
                if (r2 == 0) goto Lb0
                com.bytedance.msdk.api.j.xt r3 = r2.j()
                java.util.List r2 = r2.xt()
                java.lang.Object r2 = r2.get(r0)
                r6 = r2
                java.lang.String r6 = (java.lang.String) r6
                java.lang.String r2 = "TTMediationSDK"
                if (r3 == 0) goto La3
                int r4 = r3.f()
                r5 = 1
                if (r4 != r5) goto L40
                java.lang.String r3 = "预加载preload传入的GMAdSlotBase为banner类型，不支持该类型预加载，广告位: "
                java.lang.String r4 = java.lang.String.valueOf(r6)
                java.lang.String r3 = r3.concat(r4)
                com.bytedance.msdk.j.up.cw.j(r2, r3)
                goto Lb0
            L40:
                int r4 = r3.f()
                r5 = 2
                if (r4 != r5) goto L55
                java.lang.String r3 = "预加载preload传入的GMAdSlotBase为插屏类型，不支持该类型预加载，广告位: "
                java.lang.String r4 = java.lang.String.valueOf(r6)
                java.lang.String r3 = r3.concat(r4)
                com.bytedance.msdk.j.up.cw.j(r2, r3)
                goto Lb0
            L55:
                int r4 = r3.f()
                r5 = 9
                if (r4 != r5) goto L6b
                java.lang.String r3 = "预加载preload传入的GMAdSlotBase为Draw类型，不支持该类型预加载，广告位: "
                java.lang.String r4 = java.lang.String.valueOf(r6)
                java.lang.String r3 = r3.concat(r4)
                com.bytedance.msdk.j.up.cw.j(r2, r3)
                goto Lb0
            L6b:
                com.bytedance.msdk.core.up.xt.r r2 = r10.j
                r2.j(r6, r3)
                r3.r(r6)
                com.bytedance.msdk.ae.j.cw r2 = com.bytedance.msdk.ae.j.cw.j()
                r4 = 101(0x65, float:1.42E-43)
                com.bytedance.msdk.core.oq.xt r2 = r2.j(r6, r0, r4)
                if (r2 == 0) goto L87
                int r2 = r2.wq()
                r3.g(r2)
                goto L94
            L87:
                int r2 = r3.f()
                r4 = 8
                if (r2 != r4) goto L94
                r2 = 10
                r3.g(r2)
            L94:
                com.bytedance.msdk.core.up.xt.r r4 = r10.j
                android.app.Activity r5 = r10.xt
                com.bytedance.msdk.core.up.xt.r$j$1 r9 = new com.bytedance.msdk.core.up.xt.r$j$1
                r9.<init>(r10)
                r7 = 5
                r8 = 0
                com.bytedance.msdk.core.up.xt.r.j(r4, r5, r6, r7, r8, r9)
                goto Lb0
            La3:
                java.lang.String r3 = "预加载preload传入的GMAdSlotBase为空，广告位："
                java.lang.String r4 = java.lang.String.valueOf(r6)
                java.lang.String r3 = r3.concat(r4)
                com.bytedance.msdk.j.up.cw.j(r2, r3)
            Lb0:
                int r1 = r1 + 1
                goto L2
            Lb4:
                java.util.List<com.bytedance.msdk.api.r.jy> r0 = r10.up
                int r0 = r0.size()
                if (r0 <= 0) goto Lcb
                com.bytedance.msdk.core.up.xt.r$j$2 r0 = new com.bytedance.msdk.core.up.xt.r$j$2
                r0.<init>(r10)
                int r1 = r10.f2280r
                long r1 = (long) r1
                r3 = 1000(0x3e8, double:4.94E-321)
                long r1 = r1 * r3
                com.bytedance.msdk.j.up.m.j(r0, r1)
            Lcb:
                return
        }

        static /* synthetic */ void j(com.bytedance.msdk.core.up.xt.r.j r0) {
                r0.j()
                return
        }

        static /* synthetic */ int m(com.bytedance.msdk.core.up.xt.r.j r0) {
                int r0 = r0.tl
                return r0
        }

        static /* synthetic */ int r(com.bytedance.msdk.core.up.xt.r.j r0) {
                int r0 = r0.ae
                return r0
        }

        static /* synthetic */ com.bytedance.msdk.core.up.xt.r.xt up(com.bytedance.msdk.core.up.xt.r.j r0) {
                com.bytedance.msdk.core.up.xt.r$xt r0 = r0.f2279m
                return r0
        }

        static /* synthetic */ int xt(com.bytedance.msdk.core.up.xt.r.j r2) {
                int r0 = r2.ae
                int r1 = r0 + (-1)
                r2.ae = r1
                return r0
        }
    }

    public interface xt {
        void j(boolean r1);
    }

    private r() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.xt = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.cw = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f2275r = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.up = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f2274m = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.ae = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.tl = r0
            r0 = 0
            r1.g = r0
            r0 = 20
            r1.oq = r0
            return
    }

    static /* synthetic */ java.util.Map cw(com.bytedance.msdk.core.up.xt.r r0) {
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<com.bytedance.msdk.core.up.xt.ae>>> r0 = r0.up
            return r0
    }

    private void cw(java.lang.String r6, com.bytedance.msdk.api.j.xt r7) {
            r5 = this;
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<com.bytedance.msdk.core.up.xt.ae>>> r0 = r5.up
            java.lang.Object r6 = r0.get(r6)
            java.util.Map r6 = (java.util.Map) r6
            if (r6 == 0) goto L4a
            java.util.Set r0 = r6.keySet()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r6.get(r1)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L12
            int r3 = r2.size()
            if (r3 <= 0) goto L12
            r3 = 0
            java.lang.Object r4 = r2.get(r3)
            if (r4 == 0) goto L12
            java.lang.Object r2 = r2.get(r3)
            com.bytedance.msdk.core.up.xt.ae r2 = (com.bytedance.msdk.core.up.xt.ae) r2
            com.bytedance.msdk.api.j.xt r3 = r2.r()
            java.lang.String r4 = "聚合预缓存"
            int r2 = r5.j(r2, r3, r7, r4)
            r3 = -1
            if (r2 == r3) goto L12
            r6.remove(r1)
            goto L12
        L4a:
            return
    }

    static /* synthetic */ int j(com.bytedance.msdk.core.up.xt.r r0, int r1) {
            r0.vl = r1
            return r1
    }

    public static com.bytedance.msdk.core.up.xt.r j() {
            com.bytedance.msdk.core.up.xt.r r0 = com.bytedance.msdk.core.up.xt.r.j
            if (r0 != 0) goto L19
            java.lang.Class<com.bytedance.msdk.core.up.xt.r> r0 = com.bytedance.msdk.core.up.xt.r.class
            monitor-enter(r0)
            com.bytedance.msdk.core.up.xt.r r1 = com.bytedance.msdk.core.up.xt.r.j     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bytedance.msdk.core.up.xt.r r1 = new com.bytedance.msdk.core.up.xt.r     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bytedance.msdk.core.up.xt.r.j = r1     // Catch: java.lang.Throwable -> L13
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
            com.bytedance.msdk.core.up.xt.r r0 = com.bytedance.msdk.core.up.xt.r.j
            return r0
    }

    private java.lang.String j(java.util.List<com.bytedance.msdk.core.oq.oq> r11, java.lang.String r12, com.bytedance.msdk.api.j.xt r13, com.bytedance.msdk.core.up.xt.xt r14, boolean[] r15) {
            r10 = this;
            int r0 = r11.size()
            r1 = 0
            if (r0 > 0) goto L8
            return r1
        L8:
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<com.bytedance.msdk.core.up.xt.ae>>> r0 = r10.up
            java.lang.Object r0 = r0.get(r12)
            r5 = r0
            java.util.Map r5 = (java.util.Map) r5
            java.lang.String r9 = "TTMediationSDK"
            r0 = 0
            if (r5 == 0) goto L85
            java.lang.Object r2 = r11.get(r0)
            com.bytedance.msdk.core.oq.oq r2 = (com.bytedance.msdk.core.oq.oq) r2
            java.lang.String r2 = r2.w()
            java.lang.Object r2 = r5.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L85
            int r3 = r2.size()
            if (r3 <= 0) goto L85
            java.lang.Object r3 = r2.get(r0)
            if (r3 == 0) goto L85
            java.lang.Object r2 = r2.get(r0)
            com.bytedance.msdk.core.up.xt.ae r2 = (com.bytedance.msdk.core.up.xt.ae) r2
            com.bytedance.msdk.api.j.xt r3 = r2.r()
            java.lang.String r4 = "聚合预请求"
            int r3 = r10.j(r2, r3, r13, r4)
            r4 = -1
            if (r3 != r4) goto L85
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = com.bytedance.msdk.j.up.up.j(r12)
            r11.append(r12)
            java.lang.String r12 = "--==-- 命中最优广告： "
            r11.append(r12)
            com.bytedance.msdk.xt.cw r12 = r2.j
            java.lang.String r12 = r12.ff()
            r11.append(r12)
            java.lang.String r12 = ", loadSort: "
            r11.append(r12)
            com.bytedance.msdk.xt.cw r12 = r2.j
            int r12 = r12.wi()
            r11.append(r12)
            java.lang.String r12 = ", showSort: "
            r11.append(r12)
            com.bytedance.msdk.xt.cw r12 = r2.j
            int r12 = r12.d()
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.bytedance.msdk.j.up.cw.j(r9, r11)
            return r1
        L85:
            r2 = r10
            r3 = r11
            r4 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            java.util.List r11 = r2.j(r3, r4, r5, r6, r7, r8)
            int r12 = r11.size()
            if (r12 <= 0) goto L10f
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "["
            r12.<init>(r13)
        L9c:
            int r13 = r11.size()
            if (r0 >= r13) goto Lc5
            java.lang.Object r13 = r11.get(r0)
            com.bytedance.msdk.core.up.xt.j r13 = (com.bytedance.msdk.core.up.xt.j) r13
            java.lang.String r13 = r13.j()
            r12.append(r13)
            int r13 = r11.size()
            int r13 = r13 + (-1)
            if (r0 != r13) goto Lbd
            java.lang.String r13 = "]"
            r12.append(r13)
            goto Lc2
        Lbd:
            java.lang.String r13 = ","
            r12.append(r13)
        Lc2:
            int r0 = r0 + 1
            goto L9c
        Lc5:
            org.json.JSONArray r11 = new org.json.JSONArray     // Catch: org.json.JSONException -> Lee
            java.lang.String r12 = r12.toString()     // Catch: org.json.JSONException -> Lee
            r11.<init>(r12)     // Catch: org.json.JSONException -> Lee
            java.lang.String r11 = r11.toString()     // Catch: org.json.JSONException -> Lee
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> Lee
            r12.<init>()     // Catch: org.json.JSONException -> Lee
            java.lang.String r13 = com.bytedance.msdk.j.up.up.j(r4)     // Catch: org.json.JSONException -> Lee
            r12.append(r13)     // Catch: org.json.JSONException -> Lee
            java.lang.String r13 = "adCannotUseInfo: "
            r12.append(r13)     // Catch: org.json.JSONException -> Lee
            r12.append(r11)     // Catch: org.json.JSONException -> Lee
            java.lang.String r12 = r12.toString()     // Catch: org.json.JSONException -> Lee
            com.bytedance.msdk.j.up.cw.j(r9, r12)     // Catch: org.json.JSONException -> Lee
            return r11
        Lee:
            r0 = move-exception
            r11 = r0
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = com.bytedance.msdk.j.up.up.j(r4)
            r12.append(r13)
            java.lang.String r13 = "adCannotUseInfo json err: "
            r12.append(r13)
            java.lang.String r11 = r11.getMessage()
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            com.bytedance.msdk.j.up.cw.j(r9, r11)
        L10f:
            return r1
    }

    static /* synthetic */ java.util.List j(com.bytedance.msdk.core.up.xt.r r0, java.util.List r1) {
            r0.qv = r1
            return r1
    }

    private java.util.List<com.bytedance.msdk.api.r.jy> j(java.util.List<com.bytedance.msdk.api.r.jy> r9) {
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r8.oq
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.Iterator r9 = r9.iterator()
        L10:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L69
            java.lang.Object r3 = r9.next()
            com.bytedance.msdk.api.r.jy r3 = (com.bytedance.msdk.api.r.jy) r3
            int r4 = r0.size()
            if (r4 >= r1) goto L69
            if (r3 == 0) goto L10
            java.util.List r4 = r3.xt()
            if (r4 == 0) goto L10
            java.util.List r4 = r3.xt()
            java.util.Iterator r4 = r4.iterator()
        L32:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L10
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            int r6 = r0.size()
            if (r6 >= r1) goto L10
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L32
            boolean r6 = r2.contains(r5)
            if (r6 != 0) goto L32
            r2.add(r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 1
            r6.<init>(r7)
            r6.add(r5)
            com.bytedance.msdk.api.r.jy r5 = new com.bytedance.msdk.api.r.jy
            com.bytedance.msdk.api.j.xt r7 = r3.j()
            r5.<init>(r7, r6)
            r0.add(r5)
            goto L32
        L69:
            return r0
    }

    private java.util.List<com.bytedance.msdk.core.up.xt.j> j(java.util.List<com.bytedance.msdk.core.oq.oq> r9, java.lang.String r10, java.util.Map<java.lang.String, java.util.List<com.bytedance.msdk.core.up.xt.ae>> r11, com.bytedance.msdk.api.j.xt r12, com.bytedance.msdk.core.up.xt.xt r13, boolean[] r14) {
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r13 = r13.e_()
            r1 = 0
            r2 = 0
        Lb:
            int r3 = r9.size()
            if (r2 >= r3) goto Lad
            if (r2 >= r13) goto Lad
            java.lang.Object r3 = r9.get(r2)
            com.bytedance.msdk.core.oq.oq r3 = (com.bytedance.msdk.core.oq.oq) r3
            java.lang.String r3 = r3.w()
            com.bytedance.msdk.core.up.xt.j r4 = new com.bytedance.msdk.core.up.xt.j
            r4.<init>()
            r4.xt(r3)
            java.lang.Object r5 = r9.get(r2)
            com.bytedance.msdk.core.oq.oq r5 = (com.bytedance.msdk.core.oq.oq) r5
            int r5 = r5.ch()
            r4.up(r5)
            java.lang.Object r5 = r9.get(r2)
            com.bytedance.msdk.core.oq.oq r5 = (com.bytedance.msdk.core.oq.oq) r5
            int r5 = r5.x()
            r4.r(r5)
            r5 = 0
            if (r11 == 0) goto L57
            java.lang.Object r6 = r11.get(r3)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L57
            int r7 = r6.size()
            if (r7 <= 0) goto L57
            java.lang.Object r6 = r6.get(r1)
            com.bytedance.msdk.core.up.xt.ae r6 = (com.bytedance.msdk.core.up.xt.ae) r6
            goto L58
        L57:
            r6 = r5
        L58:
            if (r6 == 0) goto L80
            com.bytedance.msdk.xt.cw r7 = r6.j
            if (r7 != 0) goto L5f
            goto L80
        L5f:
            boolean r3 = r7.qb()
            r4.j(r3)
            r14[r1] = r1
            java.util.Map<java.lang.String, com.bytedance.msdk.api.j.xt> r3 = r8.f2275r
            java.lang.Object r3 = r3.get(r10)
            com.bytedance.msdk.api.j.xt r3 = (com.bytedance.msdk.api.j.xt) r3
            java.lang.String r5 = "预缓存"
            int r3 = r8.j(r6, r3, r12, r5)
            r5 = -1
            if (r3 == r5) goto La9
            r4.xt(r3)
            r0.add(r4)
            goto La9
        L80:
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.bytedance.msdk.api.j>> r6 = r8.f2274m
            java.lang.Object r6 = r6.get(r10)
            java.util.Map r6 = (java.util.Map) r6
            if (r6 == 0) goto L91
            java.lang.Object r3 = r6.get(r3)
            r5 = r3
            com.bytedance.msdk.api.j r5 = (com.bytedance.msdk.api.j) r5
        L91:
            if (r5 == 0) goto La2
            r3 = 3
            r4.xt(r3)
            int r3 = r5.cw
            r4.cw(r3)
            java.lang.String r3 = r5.f2149r
            r4.j(r3)
            goto La6
        La2:
            r3 = 4
            r4.xt(r3)
        La6:
            r0.add(r4)
        La9:
            int r2 = r2 + 1
            goto Lb
        Lad:
            return r0
    }

    private void j(android.content.Context r5, java.lang.String r6, int r7, int r8, com.bytedance.msdk.core.up.xt.r.cw r9) {
            r4 = this;
            int r0 = r4.xt(r6, r8)
            boolean r8 = r4.cw(r6, r8)
            r1 = 0
            r2 = 0
            java.lang.String r3 = "TTMediationSDK"
            if (r8 != 0) goto L2f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = com.bytedance.msdk.j.up.up.j(r6)
            r5.append(r7)
            java.lang.String r7 = "--==-- 配置未开启预加载缓存，req_type: "
            r5.append(r7)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            com.bytedance.msdk.j.up.cw.j(r3, r5)
            if (r9 == 0) goto L5d
            r9.j(r6, r2, r2, r1)
            return
        L2f:
            java.util.Map<java.lang.String, java.lang.Boolean> r8 = r4.ae
            java.lang.Object r8 = r8.get(r6)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            if (r8 == 0) goto L5e
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L5e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = com.bytedance.msdk.j.up.up.j(r6)
            r5.append(r7)
            java.lang.String r7 = "--==-- 已发起过预缓存，还未使用掉，此次不发起"
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            com.bytedance.msdk.j.up.cw.j(r3, r5)
            if (r9 == 0) goto L5d
            r5 = 1
            r9.j(r6, r5, r2, r1)
        L5d:
            return
        L5e:
            java.util.Map<java.lang.String, com.bytedance.msdk.api.j.xt> r8 = r4.f2275r
            java.lang.Object r8 = r8.get(r6)
            com.bytedance.msdk.api.j.xt r8 = (com.bytedance.msdk.api.j.xt) r8
            if (r8 != 0) goto L84
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = com.bytedance.msdk.j.up.up.j(r6)
            r5.append(r7)
            java.lang.String r7 = "--==-- 预缓存取消，adslot为null，rit："
            r5.append(r7)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.bytedance.msdk.j.up.cw.j(r3, r5)
            return
        L84:
            com.bytedance.msdk.api.j.xt r1 = new com.bytedance.msdk.api.j.xt
            r1.<init>(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r2 = com.bytedance.msdk.j.up.up.j(r6)
            r8.append(r2)
            java.lang.String r2 = "--==-- 预缓存开始请求, req_type: "
            r8.append(r2)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            com.bytedance.msdk.j.up.cw.j(r3, r8)
            int r8 = r1.f()
            com.bytedance.msdk.core.up.xt.xt r8 = com.bytedance.msdk.core.up.xt.up.j(r5, r6, r8)
            java.util.Map<java.lang.String, com.bytedance.msdk.core.up.xt.xt> r0 = r4.tl
            r0.put(r6, r8)
            java.util.Map<java.lang.String, java.lang.Boolean> r0 = r4.ae
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.put(r6, r2)
            r1.r(r6)
            r1.xt(r7)
            r7 = 3
            r1.m(r7)
            r8.j(r5, r1, r9)
            m(r6)
            return
    }

    static /* synthetic */ void j(com.bytedance.msdk.core.up.xt.r r0, android.content.Context r1, java.lang.String r2, int r3, int r4, com.bytedance.msdk.core.up.xt.r.cw r5) {
            r0.j(r1, r2, r3, r4, r5)
            return
    }

    static /* synthetic */ boolean j(com.bytedance.msdk.core.up.xt.r r0) {
            boolean r0 = r0.g
            return r0
    }

    static /* synthetic */ boolean j(com.bytedance.msdk.core.up.xt.r r0, boolean r1) {
            r0.g = r1
            return r1
    }

    private static void m(java.lang.String r5) {
            r0 = 0
            android.content.Context r1 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.tl.l.j(r0, r1)
            java.lang.String r1 = "preload_rit_ts"
            java.lang.String r2 = r0.xt(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L1b
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L30
            r2.<init>()     // Catch: java.lang.Throwable -> L30
            goto L21
        L1b:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L30
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L30
            r2 = r3
        L21:
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L30
            r2.put(r5, r3)     // Catch: java.lang.Throwable -> L30
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L30
            r0.j(r1, r5)     // Catch: java.lang.Throwable -> L30
            return
        L30:
            r5 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r5)
            return
    }

    public static long up(java.lang.String r4) {
            r0 = 0
            android.content.Context r1 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.tl.l.j(r0, r1)
            java.lang.String r1 = "preload_rit_ts"
            java.lang.String r0 = r0.xt(r1)
            r1 = -1
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L21
            if (r3 != 0) goto L25
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L21
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L21
            long r0 = r3.optLong(r4, r1)     // Catch: java.lang.Throwable -> L21
            return r0
        L21:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
        L25:
            return r1
    }

    static /* synthetic */ int xt(com.bytedance.msdk.core.up.xt.r r0, int r1) {
            r0.jy = r1
            return r1
    }

    static /* synthetic */ java.util.List xt(com.bytedance.msdk.core.up.xt.r r0) {
            java.util.List<java.lang.String> r0 = r0.qv
            return r0
    }

    static /* synthetic */ java.util.List xt(com.bytedance.msdk.core.up.xt.r r0, java.util.List r1) {
            java.util.List r0 = r0.j(r1)
            return r0
    }

    public int cw() {
            r1 = this;
            int r0 = r1.vl
            return r0
    }

    public com.bytedance.msdk.core.up.xt.xt cw(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, com.bytedance.msdk.core.up.xt.xt> r0 = r1.tl
            java.lang.Object r2 = r0.get(r2)
            com.bytedance.msdk.core.up.xt.xt r2 = (com.bytedance.msdk.core.up.xt.xt) r2
            return r2
    }

    public boolean cw(java.lang.String r1, int r2) {
            r0 = this;
            int r1 = r0.xt(r1, r2)
            r2 = 2
            if (r1 == r2) goto L10
            r2 = 3
            if (r1 == r2) goto L10
            r2 = 4
            if (r1 != r2) goto Le
            goto L10
        Le:
            r1 = 0
            return r1
        L10:
            r1 = 1
            return r1
    }

    public java.lang.Long j(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Long> r0 = r1.cw
            java.lang.Object r2 = r0.get(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            return r2
    }

    public void j(int r1) {
            r0 = this;
            r0.oq = r1
            return
    }

    public void j(android.app.Activity r7, java.util.List<com.bytedance.msdk.api.r.jy> r8, int r9, int r10) {
            r6 = this;
            com.bytedance.msdk.core.up.xt.r$3 r0 = new com.bytedance.msdk.core.up.xt.r$3
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            com.bytedance.msdk.j.up.m.j(r0)
            return
    }

    public void j(android.content.Context r2, java.lang.String r3, int r4) {
            r1 = this;
            com.bytedance.msdk.core.up.xt.r$1 r0 = new com.bytedance.msdk.core.up.xt.r$1
            r0.<init>(r1, r2, r3, r4)
            com.bytedance.msdk.j.up.m.j(r0)
            return
    }

    public void j(android.content.Context r2, java.lang.String r3, int r4, com.bytedance.msdk.api.j.xt r5, com.bytedance.msdk.xt.cw r6, com.bytedance.msdk.core.up.xt.r.cw r7) {
            r1 = this;
            if (r5 != 0) goto L4
            r0 = 0
            goto L8
        L4:
            int r0 = r5.f()
        L8:
            com.bytedance.msdk.core.up.xt.cw r2 = com.bytedance.msdk.core.up.xt.m.j(r4, r2, r3, r0)
            if (r2 == 0) goto L24
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "--==-- 预缓存补充请求发起 reqType: "
            r3.<init>(r0)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "TTMediationSDK"
            com.bytedance.msdk.j.up.cw.j(r4, r3)
            r2.j(r5, r6, r7)
        L24:
            return
    }

    public void j(java.lang.String r2, int r3) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r1.xt
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r2, r3)
            return
    }

    public void j(java.lang.String r2, long r3) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Lf
            java.util.Map<java.lang.String, java.lang.Long> r0 = r1.cw
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.put(r2, r3)
        Lf:
            return
    }

    public void j(java.lang.String r2, com.bytedance.msdk.api.j.xt r3) {
            r1 = this;
            if (r3 == 0) goto Ld
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Ld
            java.util.Map<java.lang.String, com.bytedance.msdk.api.j.xt> r0 = r1.f2275r
            r0.put(r2, r3)
        Ld:
            return
    }

    public void j(java.lang.String r6, com.bytedance.msdk.core.up.xt.ae r7) {
            r5 = this;
            java.lang.Long r0 = r5.j(r6)
            if (r0 == 0) goto L17
            java.lang.Long r0 = r5.j(r6)
            long r0 = r0.longValue()
            long r2 = r7.j()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L17
            goto L2b
        L17:
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<com.bytedance.msdk.core.up.xt.ae>>> r0 = r5.up
            java.lang.Object r0 = r0.get(r6)
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            com.bytedance.msdk.xt.cw r1 = r7.j
            java.lang.String r1 = r1.qa()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L2c
        L2b:
            return
        L2c:
            if (r0 != 0) goto L44
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r0.add(r7)
            java.util.concurrent.ConcurrentHashMap r7 = new java.util.concurrent.ConcurrentHashMap
            r7.<init>()
            r7.put(r1, r0)
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<com.bytedance.msdk.core.up.xt.ae>>> r0 = r5.up
            r0.put(r6, r7)
            return
        L44:
            java.lang.Object r6 = r0.get(r1)
            java.util.List r6 = (java.util.List) r6
            if (r6 != 0) goto L58
            java.util.concurrent.CopyOnWriteArrayList r6 = new java.util.concurrent.CopyOnWriteArrayList
            r6.<init>()
            r6.add(r7)
            r0.put(r1, r6)
            return
        L58:
            r6.add(r7)
            return
    }

    public boolean j(java.lang.String r9, com.bytedance.msdk.api.j.xt r10, java.lang.String r11) {
            r8 = this;
            java.util.Map<java.lang.String, java.lang.Boolean> r11 = r8.ae
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r11.put(r9, r0)
            java.util.Map<java.lang.String, com.bytedance.msdk.core.up.xt.xt> r11 = r8.tl
            java.lang.Object r11 = r11.get(r9)
            r4 = r11
            com.bytedance.msdk.core.up.xt.xt r4 = (com.bytedance.msdk.core.up.xt.xt) r4
            r11 = 0
            if (r4 == 0) goto Ld0
            java.util.List r1 = r4.xt()
            boolean r0 = com.bytedance.msdk.j.up.cw.xt()
            if (r0 == 0) goto L73
            java.util.Iterator r0 = r1.iterator()
        L21:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L73
            java.lang.Object r2 = r0.next()
            com.bytedance.msdk.core.oq.oq r2 = (com.bytedance.msdk.core.oq.oq) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = com.bytedance.msdk.j.up.up.j(r9)
            r3.append(r5)
            java.lang.String r5 = "waterfall: "
            r3.append(r5)
            java.lang.String r5 = r2.az()
            r3.append(r5)
            java.lang.String r5 = ", loadSort: "
            r3.append(r5)
            int r5 = r2.x()
            r3.append(r5)
            java.lang.String r5 = ", showSort: "
            r3.append(r5)
            int r5 = r2.ch()
            r3.append(r5)
            java.lang.String r5 = ", eCpm: "
            r3.append(r5)
            double r5 = r2.v()
            r3.append(r5)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "TTMediationSDK"
            com.bytedance.msdk.j.up.cw.j(r3, r2)
            goto L21
        L73:
            r6 = 1
            boolean[] r5 = new boolean[r6]
            r5[r11] = r6
            r0 = r8
            r2 = r9
            r3 = r10
            java.lang.String r9 = r0.j(r1, r2, r3, r4, r5)
            r8.cw(r2, r3)
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<com.bytedance.msdk.core.up.xt.ae>>> r10 = r0.up
            java.lang.Object r10 = r10.get(r2)
            java.util.Map r10 = (java.util.Map) r10
            if (r10 == 0) goto Lb0
            r4 = 0
        L8d:
            int r7 = r1.size()
            if (r4 >= r7) goto Lb0
            java.lang.Object r7 = r1.get(r4)
            com.bytedance.msdk.core.oq.oq r7 = (com.bytedance.msdk.core.oq.oq) r7
            java.lang.String r7 = r7.w()
            java.lang.Object r7 = r10.get(r7)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto Lad
            int r7 = r7.size()
            if (r7 <= 0) goto Lad
            r10 = 1
            goto Lb1
        Lad:
            int r4 = r4 + 1
            goto L8d
        Lb0:
            r10 = 0
        Lb1:
            if (r9 == 0) goto Lcf
            if (r10 == 0) goto Lc1
            java.util.Map<java.lang.String, com.bytedance.msdk.api.j.xt> r11 = r0.f2275r
            java.lang.Object r11 = r11.get(r2)
            com.bytedance.msdk.api.j.xt r11 = (com.bytedance.msdk.api.j.xt) r11
            com.bytedance.msdk.up.m.j(r11, r9)
            return r10
        Lc1:
            r1 = 3
            r3.xt(r1)
            boolean r11 = r5[r11]
            if (r11 == 0) goto Lcc
            r3.xt(r6)
        Lcc:
            com.bytedance.msdk.up.m.j(r3, r9)
        Lcf:
            return r10
        Ld0:
            r0 = r8
            return r11
    }

    public int r() {
            r1 = this;
            int r0 = r1.jy
            return r0
    }

    public java.util.List<com.bytedance.msdk.core.up.xt.ae> r(java.lang.String r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<com.bytedance.msdk.core.up.xt.ae>>> r1 = r5.up
            java.lang.Object r1 = r1.get(r6)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L35
            java.util.Set r2 = r1.keySet()
            java.util.Iterator r2 = r2.iterator()
        L17:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L35
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r3 = r1.get(r3)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L17
            int r4 = r3.size()
            if (r4 <= 0) goto L17
            r0.addAll(r3)
            goto L17
        L35:
            if (r1 == 0) goto L3a
            r1.clear()
        L3a:
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.bytedance.msdk.api.j>> r1 = r5.f2274m
            java.lang.Object r6 = r1.get(r6)
            java.util.Map r6 = (java.util.Map) r6
            if (r6 == 0) goto L47
            r6.clear()
        L47:
            return r0
    }

    public double xt(java.lang.String r9, com.bytedance.msdk.api.j.xt r10) {
            r8 = this;
            java.util.Map<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<com.bytedance.msdk.core.up.xt.ae>>> r0 = r8.up
            java.lang.Object r9 = r0.get(r9)
            java.util.Map r9 = (java.util.Map) r9
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            if (r9 == 0) goto L6e
            int r2 = r9.size()
            if (r2 <= 0) goto L6e
            java.util.Set r2 = r9.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L1a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L6e
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            if (r3 == 0) goto L1a
            java.lang.Object r3 = r3.getKey()
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L1a
            java.lang.Object r3 = r9.get(r3)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L1a
            int r4 = r3.size()
            if (r4 <= 0) goto L1a
            java.util.Iterator r3 = r3.iterator()
        L42:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L1a
            java.lang.Object r4 = r3.next()
            com.bytedance.msdk.core.up.xt.ae r4 = (com.bytedance.msdk.core.up.xt.ae) r4
            if (r4 == 0) goto L42
            com.bytedance.msdk.api.j.xt r5 = r4.r()
            java.lang.String r6 = "聚合预缓存-ra"
            int r5 = r8.j(r4, r5, r10, r6)
            r6 = -1
            if (r5 != r6) goto L42
            com.bytedance.msdk.xt.cw r5 = r4.j
            double r5 = r5.t()
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 <= 0) goto L42
            com.bytedance.msdk.xt.cw r0 = r4.j
            double r0 = r0.t()
            goto L42
        L6e:
            return r0
    }

    public int xt(java.lang.String r3, int r4) {
            r2 = this;
            r0 = 2
            r1 = 0
            if (r4 != r0) goto L5
            return r1
        L5:
            java.util.Map<java.lang.String, java.lang.Integer> r4 = r2.xt
            java.lang.Object r3 = r4.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L14
            int r3 = r3.intValue()
            return r3
        L14:
            return r1
    }

    public com.bytedance.msdk.api.j.xt xt(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L8
            r2 = 0
            return r2
        L8:
            java.util.Map<java.lang.String, com.bytedance.msdk.api.j.xt> r0 = r1.f2275r
            java.lang.Object r2 = r0.get(r2)
            com.bytedance.msdk.api.j.xt r2 = (com.bytedance.msdk.api.j.xt) r2
            return r2
    }

    public java.util.List<java.lang.String> xt() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.qv
            return r0
    }

    public void xt(android.content.Context r2, java.lang.String r3, int r4) {
            r1 = this;
            com.bytedance.msdk.core.up.xt.r$2 r0 = new com.bytedance.msdk.core.up.xt.r$2
            r0.<init>(r1, r2, r3, r4)
            com.bytedance.msdk.j.up.m.j(r0)
            return
    }
}
