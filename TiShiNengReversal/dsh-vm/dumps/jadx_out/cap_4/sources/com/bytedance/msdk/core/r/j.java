package com.bytedance.msdk.core.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j {
    public static java.util.Map<java.lang.String, com.bytedance.msdk.core.r.j.C0228j> j;

    /* renamed from: com.bytedance.msdk.core.r.j$j, reason: collision with other inner class name */
    static class C0228j {
        double cw;
        java.lang.String j;

        /* renamed from: r, reason: collision with root package name */
        java.util.Map<java.lang.String, java.lang.String> f2252r;
        java.lang.String xt;

        public C0228j(java.lang.String r1, java.lang.String r2, double r3, java.util.Map<java.lang.String, java.lang.String> r5) {
                r0 = this;
                r0.<init>()
                r0.j = r2
                r0.cw = r3
                r0.f2252r = r5
                r0.xt = r1
                return
        }
    }

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.bytedance.msdk.core.r.j.j = r0
            return
    }

    public j() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void j(com.bytedance.msdk.api.j.xt r2, com.bytedance.msdk.core.oq.oq r3, java.util.Map<java.lang.String, java.lang.Object> r4) {
            if (r2 != 0) goto L3
            goto L5f
        L3:
            if (r3 != 0) goto L6
            goto L5f
        L6:
            if (r4 != 0) goto L9
            goto L5f
        L9:
            boolean r0 = r3.la()
            if (r0 != 0) goto L10
            goto L5f
        L10:
            java.lang.String r0 = "baidu"
            java.lang.String r3 = r3.az()
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L1d
            goto L5f
        L1d:
            java.util.Map<java.lang.String, com.bytedance.msdk.core.r.j$j> r3 = com.bytedance.msdk.core.r.j.j
            java.lang.String r2 = r2.v()
            java.lang.Object r2 = r3.get(r2)
            com.bytedance.msdk.core.r.j$j r2 = (com.bytedance.msdk.core.r.j.C0228j) r2
            if (r2 != 0) goto L2c
            goto L5f
        L2c:
            java.lang.String r3 = "bidding_win_adn"
            java.lang.String r0 = r2.j
            r4.put(r3, r0)
            double r0 = r2.cw
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "bidding_win_price"
            r4.put(r0, r3)
            com.bytedance.msdk.core.ws.cw r3 = com.bytedance.msdk.core.xt.xt()
            boolean r3 = r3.xq()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            java.lang.String r1 = "bidding_is_open_ecpm"
            r4.put(r1, r0)
            if (r3 == 0) goto L5f
            java.lang.String r3 = "bidding_request_id_map"
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.f2252r
            r4.put(r3, r0)
            java.lang.String r3 = "bidding_win_adn_id"
            java.lang.String r2 = r2.xt
            r4.put(r3, r2)
        L5f:
            return
    }

    public static void j(com.bytedance.msdk.api.j.xt r8, com.bytedance.msdk.core.oq.xt r9, java.util.List<com.bytedance.msdk.xt.cw> r10, java.util.List<com.bytedance.msdk.xt.cw> r11) {
            if (r8 == 0) goto L99
            if (r9 == 0) goto L99
            if (r10 == 0) goto L99
            int r0 = r10.size()
            if (r0 != 0) goto Le
            goto L99
        Le:
            boolean r8 = r8.ed()
            if (r8 != 0) goto L16
            goto L99
        L16:
            boolean r8 = j(r9)
            if (r8 != 0) goto L1e
            goto L99
        L1e:
            java.util.Iterator r8 = r10.iterator()
        L22:
            boolean r0 = r8.hasNext()
            r1 = 0
            if (r0 == 0) goto L3e
            java.lang.Object r0 = r8.next()
            com.bytedance.msdk.xt.cw r0 = (com.bytedance.msdk.xt.cw) r0
            if (r0 == 0) goto L22
            java.lang.String r2 = "baidu"
            java.lang.String r3 = r0.ff()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L22
            goto L3f
        L3e:
            r0 = r1
        L3f:
            if (r0 != 0) goto L49
            r8 = 0
            java.lang.Object r8 = r10.get(r8)
            r0 = r8
            com.bytedance.msdk.xt.cw r0 = (com.bytedance.msdk.xt.cw) r0
        L49:
            if (r0 == 0) goto L99
            com.bytedance.msdk.core.ws.cw r8 = com.bytedance.msdk.core.xt.xt()
            boolean r8 = r8.xq()
            if (r8 == 0) goto L7e
            if (r11 != 0) goto L5d
            int r8 = r11.size()
            if (r8 == 0) goto L7e
        L5d:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Iterator r8 = r11.iterator()
        L66:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L7e
            java.lang.Object r10 = r8.next()
            com.bytedance.msdk.xt.cw r10 = (com.bytedance.msdk.xt.cw) r10
            java.lang.String r11 = r10.qa()
            java.lang.String r10 = r10.o()
            r1.put(r11, r10)
            goto L66
        L7e:
            r7 = r1
            java.util.Map<java.lang.String, com.bytedance.msdk.core.r.j$j> r8 = com.bytedance.msdk.core.r.j.j
            java.lang.String r9 = r9.rn()
            com.bytedance.msdk.core.r.j$j r2 = new com.bytedance.msdk.core.r.j$j
            java.lang.String r3 = r0.qa()
            java.lang.String r4 = r0.ff()
            double r5 = r0.t()
            r2.<init>(r3, r4, r5, r7)
            r8.put(r9, r2)
        L99:
            return
    }

    private static boolean j(com.bytedance.msdk.core.oq.xt r3) {
            if (r3 == 0) goto L2a
            java.util.List r3 = r3.ol()
            java.util.Iterator r3 = r3.iterator()
        La:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r3.next()
            com.bytedance.msdk.core.oq.oq r0 = (com.bytedance.msdk.core.oq.oq) r0
            java.lang.String r1 = r0.az()
            java.lang.String r2 = "baidu"
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 == 0) goto La
            boolean r0 = r0.la()
            if (r0 == 0) goto La
            r3 = 1
            return r3
        L2a:
            r3 = 0
            return r3
    }
}
