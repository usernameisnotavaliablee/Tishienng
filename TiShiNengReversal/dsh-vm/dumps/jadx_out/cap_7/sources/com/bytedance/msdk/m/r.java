package com.bytedance.msdk.m;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class r {
    private static volatile com.bytedance.msdk.m.r.j cw;
    private static android.content.Context j;
    private static volatile com.bytedance.msdk.m.r.j xt;







    private static class j {
        private final org.json.JSONObject ae;
        private final java.lang.String cw;
        private int g;
        private final android.os.Handler j;
        private final int m;
        private java.util.Map<java.lang.String, java.lang.Object> oq;
        private final long r;
        private final long tl;
        private final int up;
        private volatile boolean xt;


        public j(java.lang.String r4, long r5, long r7, int r9, int r10, org.json.JSONObject r11, java.util.Map<java.lang.String, java.lang.Object> r12) {
                r3 = this;
                r3.<init>()
                r0 = 0
                r3.xt = r0
                r3.g = r0
                r0 = -1
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 == 0) goto Lf
                goto L13
            Lf:
                long r5 = java.lang.System.currentTimeMillis()
            L13:
                r3.tl = r5
                r3.cw = r4
                r3.r = r7
                r3.up = r9
                r3.m = r10
                r3.ae = r11
                r3.oq = r12
                android.os.Handler r4 = new android.os.Handler
                android.os.Looper r5 = android.os.Looper.getMainLooper()
                r4.<init>(r5)
                r3.j = r4
                return
        }

        static /* synthetic */ int cw(com.bytedance.msdk.m.r.j r0) {
                int r0 = r0.g
                return r0
        }

        private void j() {
                r4 = this;
                android.os.Handler r0 = r4.j
                com.bytedance.msdk.m.r$j$1 r1 = new com.bytedance.msdk.m.r$j$1
                r1.<init>(r4)
                r2 = 500(0x1f4, double:2.47E-321)
                r0.postDelayed(r1, r2)
                return
        }

        private synchronized void j(int r9) {
                r8 = this;
                monitor-enter(r8)
                android.os.Handler r0 = r8.j     // Catch: java.lang.Throwable -> L3e
                r1 = 0
                r0.removeCallbacksAndMessages(r1)     // Catch: java.lang.Throwable -> L3e
                boolean r0 = r8.xt     // Catch: java.lang.Throwable -> L3e
                if (r0 == 0) goto Ld
                monitor-exit(r8)
                return
            Ld:
                r0 = 1
                r8.xt = r0     // Catch: java.lang.Throwable -> L3e
                if (r9 != r0) goto L41
                java.lang.String r9 = "TMe"
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
                java.lang.String r1 = "--==-- 最终上报：eventType:"
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L3e
                java.lang.String r1 = r8.cw     // Catch: java.lang.Throwable -> L3e
                r0.append(r1)     // Catch: java.lang.Throwable -> L3e
                java.lang.String r1 = ", 重试次数："
                r0.append(r1)     // Catch: java.lang.Throwable -> L3e
                int r1 = r8.g     // Catch: java.lang.Throwable -> L3e
                r0.append(r1)     // Catch: java.lang.Throwable -> L3e
                java.lang.String r1 = ", did: "
                r0.append(r1)     // Catch: java.lang.Throwable -> L3e
                java.lang.String r1 = com.bytedance.msdk.m.r.r()     // Catch: java.lang.Throwable -> L3e
                r0.append(r1)     // Catch: java.lang.Throwable -> L3e
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L3e
                com.bytedance.msdk.j.up.cw.j(r9, r0)     // Catch: java.lang.Throwable -> L3e
                goto L65
            L3e:
                r0 = move-exception
                r9 = r0
                goto L9e
            L41:
                r0 = 2
                if (r9 != r0) goto L65
                java.lang.String r9 = "TMe"
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
                java.lang.String r1 = "--==-- 最终上报：eventType:"
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L3e
                java.lang.String r1 = r8.cw     // Catch: java.lang.Throwable -> L3e
                r0.append(r1)     // Catch: java.lang.Throwable -> L3e
                java.lang.String r1 = ", 从applog回调中上报, did: "
                r0.append(r1)     // Catch: java.lang.Throwable -> L3e
                java.lang.String r1 = com.bytedance.msdk.m.r.r()     // Catch: java.lang.Throwable -> L3e
                r0.append(r1)     // Catch: java.lang.Throwable -> L3e
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L3e
                com.bytedance.msdk.j.up.cw.j(r9, r0)     // Catch: java.lang.Throwable -> L3e
            L65:
                java.lang.String r9 = r8.cw     // Catch: java.lang.Throwable -> L3e
                int r0 = r9.hashCode()     // Catch: java.lang.Throwable -> L3e
                r1 = -834688111(0xffffffffce3fab91, float:-8.03923E8)
                if (r0 == r1) goto L85
                r1 = 270071285(0x1018f5f5, float:3.0166193E-29)
                if (r0 == r1) goto L76
                goto L9c
            L76:
                java.lang.String r0 = "sdk_init"
                boolean r9 = r9.equals(r0)     // Catch: java.lang.Throwable -> L3e
                if (r9 == 0) goto L9c
                long r0 = r8.tl     // Catch: java.lang.Throwable -> L3e
                com.bytedance.msdk.m.r.xt(r0)     // Catch: java.lang.Throwable -> L3e
                monitor-exit(r8)
                return
            L85:
                java.lang.String r0 = "sdk_init_end"
                boolean r9 = r9.equals(r0)     // Catch: java.lang.Throwable -> L3e
                if (r9 == 0) goto L9c
                long r0 = r8.r     // Catch: java.lang.Throwable -> L3e
                int r2 = r8.up     // Catch: java.lang.Throwable -> L3e
                int r3 = r8.m     // Catch: java.lang.Throwable -> L3e
                long r4 = r8.tl     // Catch: java.lang.Throwable -> L3e
                org.json.JSONObject r6 = r8.ae     // Catch: java.lang.Throwable -> L3e
                java.util.Map<java.lang.String, java.lang.Object> r7 = r8.oq     // Catch: java.lang.Throwable -> L3e
                com.bytedance.msdk.m.r.j(r0, r2, r3, r4, r6, r7)     // Catch: java.lang.Throwable -> L3e
            L9c:
                monitor-exit(r8)
                return
            L9e:
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L3e
                throw r9
        }

        static /* synthetic */ void j(com.bytedance.msdk.m.r.j r0) {
                r0.j()
                return
        }

        static /* synthetic */ void j(com.bytedance.msdk.m.r.j r0, int r1) {
                r0.j(r1)
                return
        }

        static /* synthetic */ java.lang.String r(com.bytedance.msdk.m.r.j r0) {
                java.lang.String r0 = r0.cw
                return r0
        }

        static /* synthetic */ int xt(com.bytedance.msdk.m.r.j r2) {
                int r0 = r2.g
                int r1 = r0 + 1
                r2.g = r1
                return r0
        }
    }

    public r() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void cw() {
            com.bytedance.sdk.openadsdk.core.r.xt r0 = new com.bytedance.sdk.openadsdk.core.r.xt
            java.lang.String r1 = "track_mediation_sdk_init"
            r0.<init>(r1)
            com.bytedance.msdk.m.r$2 r1 = new com.bytedance.msdk.m.r$2
            r1.<init>()
            r0.xt(r1)
            return
    }

    public static void j(int r13, int r14, long r15, boolean r17, boolean r18, org.json.JSONObject r19, long r20, org.json.JSONObject r22) {
            com.bytedance.sdk.openadsdk.core.r.xt r0 = new com.bytedance.sdk.openadsdk.core.r.xt
            java.lang.String r1 = "track_get_config_final"
            r0.<init>(r1)
            com.bytedance.msdk.m.r$6 r2 = new com.bytedance.msdk.m.r$6
            r3 = r13
            r4 = r14
            r5 = r15
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r12 = r22
            r2.<init>(r3, r4, r5, r7, r8, r9, r10, r12)
            r0.xt(r2)
            return
    }

    public static void j(long r10) {
            com.bytedance.msdk.m.r$j r0 = new com.bytedance.msdk.m.r$j
            r8 = 0
            r9 = 0
            java.lang.String r1 = "sdk_init"
            r4 = 0
            r6 = 0
            r7 = 0
            r2 = r10
            r0.<init>(r1, r2, r4, r6, r7, r8, r9)
            com.bytedance.msdk.m.r.xt = r0
            com.bytedance.msdk.m.r.j.j(r0)
            return
    }

    public static void j(long r11, int r13, int r14, long r15, org.json.JSONObject r17, java.util.Map<java.lang.String, java.lang.Object> r18) {
            com.bytedance.sdk.openadsdk.core.r.xt r0 = new com.bytedance.sdk.openadsdk.core.r.xt
            java.lang.String r1 = "track_sdk_init_end"
            r0.<init>(r1)
            com.bytedance.msdk.m.r$4 r2 = new com.bytedance.msdk.m.r$4
            r3 = r11
            r5 = r13
            r6 = r14
            r7 = r15
            r9 = r17
            r10 = r18
            r2.<init>(r3, r5, r6, r7, r9, r10)
            r0.xt(r2)
            return
    }

    public static void j(long r10, int r12, int r13, org.json.JSONObject r14, java.util.Map<java.lang.String, java.lang.Object> r15) {
            com.bytedance.msdk.m.r$j r0 = new com.bytedance.msdk.m.r$j
            java.lang.String r1 = "sdk_init_end"
            r2 = -1
            r4 = r10
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r15
            r0.<init>(r1, r2, r4, r6, r7, r8, r9)
            com.bytedance.msdk.m.r.cw = r0
            com.bytedance.msdk.m.r.j.j(r0)
            return
    }

    public static void j(android.content.Context r0) {
            com.bytedance.msdk.m.r.j = r0
            return
    }

    public static void j(boolean r2) {
            com.bytedance.sdk.openadsdk.core.r.xt r0 = new com.bytedance.sdk.openadsdk.core.r.xt
            java.lang.String r1 = "track_get_config_start"
            r0.<init>(r1)
            com.bytedance.msdk.m.r$5 r1 = new com.bytedance.msdk.m.r$5
            r1.<init>(r2)
            r0.xt(r1)
            return
    }

    public static boolean j() {
            java.lang.String r0 = com.bytedance.msdk.tl.x.j()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    static /* synthetic */ java.lang.String r() {
            java.lang.String r0 = up()
            return r0
    }

    private static java.lang.String up() {
            java.lang.String r0 = com.bytedance.msdk.tl.x.j()
            return r0
    }

    public static void xt() {
            com.bytedance.sdk.openadsdk.core.r.xt r0 = new com.bytedance.sdk.openadsdk.core.r.xt
            java.lang.String r1 = "track_start_up"
            r0.<init>(r1)
            com.bytedance.msdk.m.r$1 r1 = new com.bytedance.msdk.m.r$1
            r1.<init>()
            r0.xt(r1)
            return
    }

    public static void xt(long r2) {
            com.bytedance.sdk.openadsdk.core.r.xt r0 = new com.bytedance.sdk.openadsdk.core.r.xt
            java.lang.String r1 = "track_sdk_init"
            r0.<init>(r1)
            com.bytedance.msdk.m.r$3 r1 = new com.bytedance.msdk.m.r$3
            r1.<init>(r2)
            r0.xt(r1)
            return
    }
}
