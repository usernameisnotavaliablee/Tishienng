package com.bytedance.msdk.up;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class m {
    private static int cw;
    private static int j;
    private static int xt;























    static {
            return
    }

    public m() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void cw(com.bytedance.msdk.api.j.xt r2, int r3) {
            com.bytedance.msdk.up.r r0 = com.bytedance.msdk.up.r.xt()
            java.lang.String r1 = "mt_ra_c"
            com.bytedance.msdk.up.r r1 = r0.j(r1)
            r1.xt(r3)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r1 = 0
            j(r0, r2, r1, r1, r3)
            android.content.Context r2 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.up.cw.j(r2, r0, r3)
            return
    }

    public static void j() {
            com.bytedance.msdk.up.r r0 = com.bytedance.msdk.up.r.xt()
            java.lang.String r1 = "mediation_sdk_init"
            r0.j(r1)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            long r2 = com.bytedance.sdk.gromore.init.up.j
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "call_init_time"
            r1.put(r3, r2)
            long r2 = com.bytedance.sdk.gromore.init.up.xt
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "call_init_csj_start_time"
            r1.put(r3, r2)
            long r2 = com.bytedance.sdk.gromore.init.up.cw
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "call_init_csj_end_time"
            r1.put(r3, r2)
            long r2 = com.bytedance.sdk.gromore.init.up.xt
            long r4 = com.bytedance.sdk.gromore.init.up.j
            long r2 = r2 - r4
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "call_init_csj_duration"
            r1.put(r3, r2)
            long r2 = com.bytedance.sdk.gromore.init.up.cw
            long r4 = com.bytedance.sdk.gromore.init.up.xt
            long r2 = r2 - r4
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "init_csj_duration"
            r1.put(r3, r2)
            long r2 = com.bytedance.sdk.gromore.init.up.r
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "call_init_gromore_start_time"
            r1.put(r3, r2)
            long r2 = com.bytedance.sdk.gromore.init.up.up
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "call_init_gromore_end_time"
            r1.put(r3, r2)
            long r2 = com.bytedance.sdk.gromore.init.up.r
            long r4 = com.bytedance.sdk.gromore.init.up.j
            long r2 = r2 - r4
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "call_init_gromore_duration"
            r1.put(r3, r2)
            long r2 = com.bytedance.sdk.gromore.init.up.up
            long r4 = com.bytedance.sdk.gromore.init.up.r
            long r2 = r2 - r4
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "init_gromore_duration"
            r1.put(r3, r2)
            long r2 = com.bytedance.sdk.gromore.init.up.up
            long r4 = com.bytedance.sdk.gromore.init.up.j
            long r2 = r2 - r4
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "init_total_duration"
            r1.put(r3, r2)
            r2 = 0
            j(r0, r2, r2, r2, r1)     // Catch: java.lang.Throwable -> L97
            android.content.Context r2 = com.bytedance.msdk.core.xt.getContext()     // Catch: java.lang.Throwable -> L97
            com.bytedance.msdk.up.cw.j(r2, r0, r1)     // Catch: java.lang.Throwable -> L97
            return
        L97:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
            return
    }

    public static void j(int r8, int r9, long r10, java.lang.String r12, java.lang.String r13) {
            com.bytedance.msdk.up.r r1 = com.bytedance.msdk.up.r.cw()
            com.bytedance.msdk.up.m$1 r0 = new com.bytedance.msdk.up.m$1
            r5 = r8
            r2 = r9
            r3 = r10
            r6 = r12
            r7 = r13
            r0.<init>(r1, r2, r3, r5, r6, r7)
            com.bytedance.msdk.j.up.m.r(r0)
            return
    }

    public static void j(int r3, int r4, long r5, boolean r7, boolean r8, org.json.JSONObject r9, long r10, org.json.JSONObject r12) {
            com.bytedance.msdk.up.r r0 = com.bytedance.msdk.up.r.xt()
            com.bytedance.msdk.tl.l r1 = com.bytedance.msdk.ae.j.j()
            java.lang.String r2 = "is_config_from_assert"
            boolean r1 = r1.up(r2)
            r2 = 1
            if (r3 != r2) goto L12
            goto L1c
        L12:
            if (r7 != 0) goto L1b
            if (r3 != 0) goto L19
            if (r1 == 0) goto L19
            goto L1b
        L19:
            r3 = 0
            goto L1c
        L1b:
            r3 = 2
        L1c:
            com.bytedance.msdk.up.r r3 = r0.setResult(r3)
            com.bytedance.msdk.up.r r3 = r3.j(r5)
            java.lang.String r5 = "get_config_final"
            com.bytedance.msdk.up.r r3 = r3.j(r5)
            com.bytedance.msdk.up.r r3 = r3.m(r4)
            com.bytedance.msdk.up.r r3 = r3.xt(r4)
            com.bytedance.msdk.core.ws.cw r4 = com.bytedance.msdk.core.xt.xt()
            java.lang.String r4 = r4.g()
            java.lang.String r5 = "transparent_params"
            r3.j(r5, r4)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            com.bytedance.msdk.core.g.r.j(r8, r0, r9, r3)
            if (r12 == 0) goto L4e
            java.lang.String r4 = "cfg_handle_time"
            r3.put(r4, r12)
        L4e:
            java.lang.String r4 = "config_size"
            java.lang.Long r5 = java.lang.Long.valueOf(r10)
            r3.put(r4, r5)
            android.content.Context r4 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.up.cw.j(r4, r0, r3)
            return
    }

    public static void j(long r9) {
            com.bytedance.msdk.up.r r0 = com.bytedance.msdk.up.r.xt()
            java.lang.String r1 = "sdk_init"
            com.bytedance.msdk.up.r r1 = r0.j(r1)
            r1.cw(r9)
            com.bytedance.msdk.tl.l r9 = com.bytedance.msdk.ae.j.m()
            java.lang.String r10 = "check_unity3d"
            boolean r1 = r9.up(r10)
            java.lang.String r2 = "check_unity3d_time"
            long r3 = r9.r(r2)
            long r5 = java.lang.System.currentTimeMillis()
            if (r1 == 0) goto L4e
            long r3 = r5 - r3
            r7 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 <= 0) goto L4e
            java.lang.String r1 = "com.unity3d.player.UnityPlayer"
            java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = "unity_pure"
            java.lang.String r3 = "com.bytedance.android.NativeAdManager"
            java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = "unity"
            goto L40
        L3d:
            goto L40
        L3f:
            r1 = 0
        L40:
            if (r1 == 0) goto L47
            java.lang.String r3 = "develop_type"
            r0.j(r3, r1)
        L47:
            r1 = 1
            r9.j(r10, r1)
            r9.j(r2, r5)
        L4e:
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            com.bytedance.msdk.ae.xt.j r10 = com.bytedance.msdk.ae.xt.j.j()
            int r10 = r10.r()
            if (r10 <= 0) goto L6d
            com.bytedance.msdk.ae.xt.j r1 = com.bytedance.msdk.ae.xt.j.j()
            r1.up()
            java.lang.String r1 = "discard_num"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9.put(r1, r10)
        L6d:
            java.lang.String r10 = "csj_plugin_version"
            java.lang.String r1 = com.bytedance.msdk.m.cw.cw()
            r9.put(r10, r1)
            org.json.JSONObject r10 = com.bytedance.msdk.tl.l.up()
            if (r10 == 0) goto L81
            java.lang.String r1 = "init_time"
            r9.put(r1, r10)
        L81:
            com.bytedance.msdk.tl.l.j(r9)
            com.bytedance.msdk.tl.l.xt(r9)
            android.content.Context r10 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.up.cw.j(r10, r0, r9)
            return
    }

    public static void j(long r2, int r4, int r5, long r6, org.json.JSONObject r8, java.util.Map<java.lang.String, java.lang.Object> r9) {
            com.bytedance.msdk.up.r r0 = com.bytedance.msdk.up.r.xt()
            java.lang.String r1 = "sdk_init_end"
            r0.j(r1)
            r0.j(r2)
            r0.cw(r6)
            java.lang.String r2 = "adn_count"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r0.j(r2, r3)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            if (r9 == 0) goto L28
            int r3 = r9.size()
            if (r3 <= 0) goto L28
            r2.putAll(r9)
        L28:
            java.lang.String r3 = "is_from_local_config"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r2.put(r3, r4)
            java.lang.String r3 = "adapter_version_list"
            org.json.JSONObject r4 = com.bytedance.msdk.tl.ae.j()
            r2.put(r3, r4)
            if (r8 == 0) goto L41
            java.lang.String r3 = "local_init_time"
            r2.put(r3, r8)
        L41:
            android.content.Context r3 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.up.cw.j(r3, r0, r2)
            return
    }

    public static void j(com.bytedance.msdk.api.j.xt r3) {
            com.bytedance.msdk.up.r r0 = com.bytedance.msdk.up.r.xt()
            java.lang.String r1 = "media_will_show"
            r0.j(r1)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = 0
            j(r0, r3, r2, r2, r1)
            android.content.Context r3 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.up.cw.j(r3, r0, r1)
            return
    }

    public static void j(com.bytedance.msdk.api.j.xt r2, int r3) {
            com.bytedance.msdk.up.r r0 = com.bytedance.msdk.up.r.xt()
            java.lang.String r1 = "media_carousel_fail"
            com.bytedance.msdk.up.r r1 = r0.j(r1)
            com.bytedance.msdk.up.r r1 = r1.xt(r3)
            java.lang.String r3 = com.bytedance.msdk.api.j.j(r3)
            r1.oq(r3)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r1 = 0
            j(r0, r2, r1, r1, r3)
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r1 = "is_video_cache_success"
            r0.j(r1, r2)
            android.content.Context r2 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.up.cw.j(r2, r0, r3)
            return
    }

    public static void j(com.bytedance.msdk.api.j.xt r2, int r3, int r4) {
            com.bytedance.msdk.up.r r0 = com.bytedance.msdk.up.r.xt()
            java.lang.String r1 = "mt_ra_s"
            com.bytedance.msdk.up.r r1 = r0.j(r1)
            r1.xt(r3)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r1 = "pre_req"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.put(r1, r4)
            r4 = 0
            j(r0, r2, r4, r4, r3)
            android.content.Context r2 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.up.cw.j(r2, r0, r3)
            return
    }

    public static void j(@androidx.annotation.Nullable com.bytedance.msdk.api.j.xt r2, com.bytedance.msdk.api.j r3, java.lang.String r4) {
            com.bytedance.msdk.up.r r0 = com.bytedance.msdk.up.r.cw()
            com.bytedance.msdk.up.m$19 r1 = new com.bytedance.msdk.up.m$19
            r1.<init>(r0, r2, r3, r4)
            com.bytedance.msdk.j.up.m.r(r1)
            return
    }

    public static void j(com.bytedance.msdk.api.j.xt r2, com.bytedance.msdk.core.r.xt r3, int r4) {
            com.bytedance.msdk.up.r r0 = com.bytedance.msdk.up.r.cw()
            com.bytedance.msdk.up.m$10 r1 = new com.bytedance.msdk.up.m$10
            r1.<init>(r0, r2, r3, r4)
            com.bytedance.msdk.j.up.m.r(r1)
            return
    }

    public static void j(com.bytedance.msdk.api.j.xt r6, com.bytedance.msdk.xt.cw r7, long r8) {
            com.bytedance.msdk.up.r r1 = com.bytedance.msdk.up.r.cw()
            com.bytedance.msdk.up.m$2 r0 = new com.bytedance.msdk.up.m$2
            r2 = r6
            r3 = r7
            r4 = r8
            r0.<init>(r1, r2, r3, r4)
            com.bytedance.msdk.j.up.m.r(r0)
            return
    }

    public static void j(com.bytedance.msdk.api.j.xt r2, com.bytedance.msdk.xt.cw r3, com.bytedance.msdk.core.oq.oq r4) {
            com.bytedance.msdk.up.r r0 = com.bytedance.msdk.up.r.cw()
            com.bytedance.msdk.up.m$3 r1 = new com.bytedance.msdk.up.m$3
            r1.<init>(r0, r2, r3, r4)
            com.bytedance.msdk.j.up.m.r(r1)
            return
    }

    public static void j(com.bytedance.msdk.api.j.xt r3, com.bytedance.msdk.xt.cw r4, java.lang.String r5) {
            com.bytedance.msdk.up.r r0 = com.bytedance.msdk.up.r.xt()
            java.lang.String r1 = "rit_cache_cannot_use"
            com.bytedance.msdk.up.r r1 = r0.j(r1)
            java.lang.String r2 = "cache_invalid_info"
            r1.j(r2, r5)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r1 = 0
            j(r0, r3, r1, r4, r5)
            r3 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "mediationrit_req_type"
            r0.j(r4, r3)
            android.content.Context r3 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.up.cw.j(r3, r0, r5)
            return
    }

    public static void j(com.bytedance.msdk.api.j.xt r3, java.lang.String r4) {
            com.bytedance.msdk.up.r r0 = com.bytedance.msdk.up.r.xt()
            java.lang.String r1 = "cache_cannot_use"
            com.bytedance.msdk.up.r r1 = r0.j(r1)
            java.lang.String r2 = "cache_invalid_info"
            r1.j(r2, r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r1 = 0
            j(r0, r3, r1, r1, r4)
            android.content.Context r3 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.up.cw.j(r3, r0, r4)
            return
    }

    public static void j(com.bytedance.msdk.api.j.xt r13, java.lang.String r14, boolean r15, java.lang.String r16, int r17, java.util.Map<java.lang.String, java.lang.Object> r18) {
            if (r13 == 0) goto Lf
            com.bytedance.sdk.gromore.xt.j r0 = com.bytedance.sdk.gromore.xt.j.j()
            java.lang.String r1 = r13.j()
            java.lang.String r2 = com.bytedance.msdk.up.j.cw
            r0.j(r1, r2)
        Lf:
            com.bytedance.msdk.up.r r4 = com.bytedance.msdk.up.r.cw()
            long r5 = java.lang.System.currentTimeMillis()
            com.bytedance.msdk.up.m$21 r3 = new com.bytedance.msdk.up.m$21
            r7 = r13
            r8 = r14
            r9 = r15
            r10 = r16
            r11 = r17
            r12 = r18
            r3.<init>(r4, r5, r7, r8, r9, r10, r11, r12)
            com.bytedance.msdk.j.up.m.r(r3)
            return
    }

    public static void j(com.bytedance.msdk.api.j.xt r2, org.json.JSONObject r3) {
            com.bytedance.msdk.up.r r0 = com.bytedance.msdk.up.r.cw()
            com.bytedance.msdk.up.m$9 r1 = new com.bytedance.msdk.up.m$9
            r1.<init>(r0, r2, r3)
            com.bytedance.msdk.j.up.m.r(r1)
            return
    }

    public static void j(com.bytedance.msdk.api.j r2, com.bytedance.msdk.api.j.xt r3, com.bytedance.msdk.core.oq.oq r4, int r5, int r6, int r7, java.lang.String r8, long r9) {
            com.bytedance.msdk.up.r r0 = com.bytedance.msdk.up.r.xt()
            java.lang.String r1 = "bidding_adm_load_fail"
            com.bytedance.msdk.up.r r1 = r0.j(r1)
            com.bytedance.msdk.up.r r9 = r1.j(r9)
            com.bytedance.msdk.up.r r8 = r9.m(r8)
            if (r2 == 0) goto L17
            int r9 = r2.cw
            goto L18
        L17:
            r9 = -1
        L18:
            com.bytedance.msdk.up.r r8 = r8.xt(r9)
            if (r2 == 0) goto L21
            java.lang.String r9 = r2.r
            goto L23
        L21:
            java.lang.String r9 = "unknown error"
        L23:
            com.bytedance.msdk.up.r r8 = r8.oq(r9)
            java.lang.String r9 = "adn_count"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            com.bytedance.msdk.up.r r5 = r8.j(r9, r5)
            r8 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "adn_preload"
            com.bytedance.msdk.up.r r5 = r5.j(r9, r8)
            java.lang.String r8 = "mediationrit_req_type"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.bytedance.msdk.up.r r5 = r5.j(r8, r6)
            java.lang.String r6 = "mediationrit_req_type_src"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r5.j(r6, r7)
            boolean r5 = r2 instanceof com.bytedance.msdk.api.xt.j
            if (r5 == 0) goto L5b
            int r5 = r2.j
            r0.ws = r5
            java.lang.String r2 = r2.xt
            r0.qv = r2
        L5b:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r5 = 0
            j(r0, r3, r4, r5, r2)
            android.content.Context r3 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.up.cw.j(r3, r0, r2)
            return
    }

    public static void j(com.bytedance.msdk.api.j r16, com.bytedance.msdk.api.j.xt r17, com.bytedance.msdk.core.oq.oq r18, int r19, int r20, int r21, java.lang.String r22, long r23, java.lang.String r25, java.lang.String r26, java.lang.String r27, long r28) {
            com.bytedance.msdk.up.r r1 = com.bytedance.msdk.up.r.cw()
            com.bytedance.msdk.up.m$18 r0 = new com.bytedance.msdk.up.m$18
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r11 = r25
            r12 = r26
            r13 = r27
            r14 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r13, r14)
            com.bytedance.msdk.j.up.m.r(r0)
            return
    }

    public static void j(com.bytedance.msdk.core.oq.oq r6, com.bytedance.msdk.api.j.xt r7, int r8, int r9) {
            com.bytedance.msdk.up.r r1 = com.bytedance.msdk.up.r.cw()
            com.bytedance.msdk.up.m$20 r0 = new com.bytedance.msdk.up.m$20
            r2 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            com.bytedance.msdk.j.up.m.r(r0)
            return
    }

    public static void j(com.bytedance.msdk.core.oq.oq r2, com.bytedance.msdk.api.j.xt r3, com.bytedance.msdk.xt.cw r4, int r5, java.lang.String r6) {
            com.bytedance.msdk.up.r r0 = com.bytedance.msdk.up.r.xt()
            java.lang.String r1 = "bidding_info_invalid"
            com.bytedance.msdk.up.r r1 = r0.j(r1)
            com.bytedance.msdk.up.r r5 = r1.xt(r5)
            com.bytedance.msdk.up.r r5 = r5.oq(r6)
            if (r3 == 0) goto L19
            int r6 = r3.a()
            goto L1a
        L19:
            r6 = 0
        L1a:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r1 = "ad_count"
            com.bytedance.msdk.up.r r5 = r5.j(r1, r6)
            com.bytedance.msdk.core.ws.cw r6 = com.bytedance.msdk.core.xt.xt()
            com.bytedance.msdk.core.ws.xt.j(r6)
            org.json.JSONObject r6 = com.bytedance.msdk.core.ws.xt.xt()
            java.lang.String r1 = "grouping_params"
            com.bytedance.msdk.up.r r5 = r5.j(r1, r6)
            r6 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r1 = "log_source"
            r5.j(r1, r6)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            j(r0, r3, r2, r4, r5)
            android.content.Context r2 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.up.cw.j(r2, r0, r5)
            return
    }

    public static void j(com.bytedance.msdk.core.oq.oq r2, com.bytedance.msdk.api.j.xt r3, java.lang.String r4) {
            com.bytedance.msdk.up.r r0 = com.bytedance.msdk.up.r.cw()
            com.bytedance.msdk.up.m$13 r1 = new com.bytedance.msdk.up.m$13
            r1.<init>(r0, r2, r3, r4)
            com.bytedance.msdk.j.up.m.r(r1)
            return
    }

    public static void j(com.bytedance.msdk.core.oq.oq r15, com.bytedance.msdk.api.j.xt r16, java.lang.String r17, boolean r18, int r19, int r20, int r21, int r22, com.bytedance.msdk.api.j r23, long r24, boolean r26, boolean r27) {
            com.bytedance.msdk.up.r r1 = com.bytedance.msdk.up.r.cw()
            com.bytedance.msdk.up.m$12 r0 = new com.bytedance.msdk.up.m$12
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r13 = r26
            r14 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14)
            com.bytedance.msdk.j.up.m.r(r0)
            return
    }

    public static void j(com.bytedance.msdk.core.oq.oq r16, com.bytedance.msdk.api.j.xt r17, java.lang.String r18, boolean r19, int r20, int r21, int r22, int r23, com.bytedance.msdk.api.j r24, long r25, boolean r27, boolean r28, java.lang.String r29) {
            com.bytedance.msdk.up.r r1 = com.bytedance.msdk.up.r.cw()
            com.bytedance.msdk.up.m$16 r0 = new com.bytedance.msdk.up.m$16
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r13 = r27
            r14 = r28
            r15 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15)
            com.bytedance.msdk.j.up.m.r(r0)
            return
    }

    public static void j(com.bytedance.msdk.up.r r16, com.bytedance.msdk.api.j.xt r17, com.bytedance.msdk.core.oq.oq r18, com.bytedance.msdk.xt.cw r19, java.util.Map<java.lang.String, java.lang.Object> r20) {
            r1 = r16
            r2 = r19
            r3 = r20
            r4 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            if (r1 == 0) goto L511
            r6 = 0
            r7 = 0
            if (r17 == 0) goto L19f
            java.lang.String r0 = r17.v()
            com.bytedance.msdk.up.r r0 = r1.xt(r0)
            java.lang.String r8 = r17.j()
            com.bytedance.msdk.up.r r0 = r0.r(r8)
            java.lang.String r8 = r17.hh()
            com.bytedance.msdk.up.r r0 = r0.cw(r8)
            long r8 = r17.ol()
            com.bytedance.msdk.up.r r0 = r0.xt(r8)
            int r8 = r17.f()
            com.bytedance.msdk.up.r r0 = r0.up(r8)
            com.bytedance.msdk.core.qv.j r8 = com.bytedance.msdk.core.qv.j.j()
            java.lang.String r9 = r17.e()
            java.lang.String r8 = r8.cw(r9)
            java.lang.String r9 = "waterfall_abtest"
            com.bytedance.msdk.up.r r0 = r0.j(r9, r8)
            int r8 = r17.up()
            if (r8 == r4) goto L53
            r8 = 0
            goto L57
        L53:
            int r8 = r17.up()
        L57:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "if_test"
            com.bytedance.msdk.up.r r0 = r0.j(r9, r8)
            int r8 = r17.q()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "segment_id"
            com.bytedance.msdk.up.r r0 = r0.j(r9, r8)
            java.lang.String r8 = "segment_version"
            java.lang.String r9 = r17.qb()
            com.bytedance.msdk.up.r r0 = r0.j(r8, r9)
            java.lang.String r8 = "waterfall_extra"
            java.lang.String r9 = r17.ya()
            com.bytedance.msdk.up.r r0 = r0.j(r8, r9)
            java.lang.String r8 = "transparent_params"
            java.lang.String r9 = r17.m()
            com.bytedance.msdk.up.r r0 = r0.j(r8, r9)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            int r9 = r17.cw()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "primerit_req_type"
            com.bytedance.msdk.up.r r0 = r0.j(r9, r8)
            int r8 = r17.r()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "req_type"
            com.bytedance.msdk.up.r r0 = r0.j(r9, r8)
            int r8 = r17.hl()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "parallel_type"
            com.bytedance.msdk.up.r r0 = r0.j(r9, r8)
            int r8 = r17.b()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "req_parallel_num"
            r0.j(r9, r8)
            double r8 = r17.z()
            r10 = 0
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 <= 0) goto Le3
            double r8 = r17.z()
            java.lang.Double r0 = java.lang.Double.valueOf(r8)
            java.lang.String r8 = "waterfall_bidfloor"
            r1.j(r8, r0)
        Le3:
            java.lang.String r0 = r17.x()
            if (r0 == 0) goto Lf2
            java.lang.String r0 = "scenario_id"
            java.lang.String r8 = r17.x()
            r1.j(r0, r8)
        Lf2:
            java.util.Map r0 = r17.c()
            if (r0 == 0) goto L126
            java.lang.String r8 = "pangle_vid"
            java.lang.Object r0 = r0.get(r8)     // Catch: java.lang.Throwable -> L105
            boolean r8 = r0 instanceof int[]     // Catch: java.lang.Throwable -> L105
            if (r8 == 0) goto L108
            int[] r0 = (int[]) r0     // Catch: java.lang.Throwable -> L105
            goto L127
        L105:
            r0 = move-exception
            r8 = r6
            goto L121
        L108:
            boolean r8 = r0 instanceof java.lang.Integer[]     // Catch: java.lang.Throwable -> L105
            if (r8 == 0) goto L126
            java.lang.Integer[] r0 = (java.lang.Integer[]) r0     // Catch: java.lang.Throwable -> L105
            int r8 = r0.length     // Catch: java.lang.Throwable -> L105
            int[] r8 = new int[r8]     // Catch: java.lang.Throwable -> L105
            r9 = 0
        L112:
            int r10 = r0.length     // Catch: java.lang.Throwable -> L120
            if (r9 >= r10) goto L124
            r10 = r0[r9]     // Catch: java.lang.Throwable -> L120
            int r10 = r10.intValue()     // Catch: java.lang.Throwable -> L120
            r8[r9] = r10     // Catch: java.lang.Throwable -> L120
            int r9 = r9 + 1
            goto L112
        L120:
            r0 = move-exception
        L121:
            com.bytedance.sdk.component.utils.vl.j(r0)
        L124:
            r0 = r8
            goto L127
        L126:
            r0 = r6
        L127:
            if (r0 == 0) goto L13d
            int r8 = r0.length
            if (r8 <= 0) goto L13d
            if (r3 == 0) goto L13d
            java.lang.String r0 = com.bytedance.msdk.tl.w.j(r0)
            boolean r8 = android.text.TextUtils.isEmpty(r0)
            if (r8 != 0) goto L13d
            java.lang.String r8 = "external_vid"
            r3.put(r8, r0)
        L13d:
            if (r3 != 0) goto L145
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            goto L146
        L145:
            r0 = r3
        L146:
            int r3 = r17.tl()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r8 = "is_ra"
            r0.put(r8, r3)
            boolean r3 = r17.ae()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r8 = "ad_req_optmize"
            r0.put(r8, r3)
            java.lang.String r3 = r17.nd()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L16f
            java.lang.String r3 = "mediation_map_request"
            r0.put(r3, r5)
        L16f:
            boolean r3 = r17.sm()
            if (r3 == 0) goto L17a
            java.lang.String r3 = "share_cache"
            r1.j(r3, r5)
        L17a:
            boolean r3 = r17.xq()
            if (r3 == 0) goto L1a0
            java.lang.String r3 = r1.j
            java.lang.String r8 = "mediation_request"
            boolean r3 = android.text.TextUtils.equals(r3, r8)
            if (r3 == 0) goto L1a0
            java.lang.String r3 = "width_equal"
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r0.put(r3, r8)
            int r3 = r17.ch()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r8 = "accepted_width"
            r0.put(r8, r3)
            goto L1a0
        L19f:
            r0 = r3
        L1a0:
            java.lang.String r3 = "if_reuse"
            java.lang.String r8 = "ad_extra"
            java.lang.String r9 = "m_aid"
            java.lang.String r10 = "pricing_type"
            java.lang.String r11 = "sub_adtype"
            java.lang.String r12 = "origin_type"
            if (r18 == 0) goto L256
            java.lang.String r13 = r18.az()
            com.bytedance.msdk.up.r r13 = r1.up(r13)
            java.lang.String r14 = r18.w()
            com.bytedance.msdk.up.r r13 = r13.tl(r14)
            int r14 = r18.x()
            com.bytedance.msdk.up.r r13 = r13.cw(r14)
            int r14 = r18.ch()
            com.bytedance.msdk.up.r r13 = r13.r(r14)
            int r14 = r18.mi()
            com.bytedance.msdk.up.r r13 = r13.j(r14)
            double r14 = r18.v()
            java.lang.String r14 = java.lang.String.valueOf(r14)
            com.bytedance.msdk.up.r r13 = r13.g(r14)
            java.lang.String r14 = r18.ws()
            com.bytedance.msdk.up.r r13 = r13.qv(r14)
            java.lang.String r14 = "server_bidding_extra"
            java.lang.String r15 = r18.a()
            com.bytedance.msdk.up.r r13 = r13.j(r14, r15)
            int r14 = r18.oq()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            com.bytedance.msdk.up.r r13 = r13.j(r12, r14)
            int r14 = r18.m()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r13.j(r11, r14)
            com.bytedance.msdk.core.oq.tl r13 = r18.l()
            if (r13 == 0) goto L244
            com.bytedance.msdk.core.oq.tl r13 = r18.l()
            java.lang.String r13 = r13.cw()
            com.bytedance.msdk.core.oq.tl r14 = r18.l()
            java.lang.String r14 = r14.r()
            com.bytedance.msdk.core.oq.tl r15 = r18.l()
            int r15 = r15.j()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r1.j(r10, r15)
            boolean r15 = android.text.TextUtils.isEmpty(r13)
            if (r15 != 0) goto L239
            r1.j(r9, r13)
        L239:
            boolean r13 = android.text.TextUtils.isEmpty(r14)
            if (r13 != 0) goto L244
            if (r0 == 0) goto L244
            r0.put(r8, r14)
        L244:
            if (r0 != 0) goto L24b
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
        L24b:
            int r13 = r18.g()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r0.put(r3, r13)
        L256:
            if (r2 == 0) goto L3c6
            java.lang.String r13 = r2.ff()
            com.bytedance.msdk.up.r r13 = r1.up(r13)
            java.lang.String r14 = r2.qa()
            com.bytedance.msdk.up.r r13 = r13.tl(r14)
            int r14 = r2.om()
            com.bytedance.msdk.up.r r13 = r13.up(r14)
            int r14 = r2.xw()
            com.bytedance.msdk.up.r r13 = r13.j(r14)
            java.lang.String r14 = r2.k()
            com.bytedance.msdk.up.r r13 = r13.qv(r14)
            java.lang.String r14 = r2.o()
            com.bytedance.msdk.up.r r13 = r13.ae(r14)
            java.lang.String r14 = r2.kc()
            com.bytedance.msdk.up.r r13 = r13.m(r14)
            int r14 = r2.wi()
            com.bytedance.msdk.up.r r13 = r13.cw(r14)
            int r14 = r2.d()
            com.bytedance.msdk.up.r r13 = r13.r(r14)
            double r14 = r2.t()
            java.lang.String r14 = java.lang.String.valueOf(r14)
            com.bytedance.msdk.up.r r13 = r13.g(r14)
            java.util.Map r14 = r2.xq()
            com.bytedance.msdk.up.r r13 = r13.j(r14)
            if (r17 == 0) goto L2bb
            java.lang.String r14 = r17.j()
            goto L2bc
        L2bb:
            r14 = r6
        L2bc:
            int r14 = r2.tl(r14)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.String r15 = "mediationrit_req_type"
            com.bytedance.msdk.up.r r13 = r13.j(r15, r14)
            if (r17 == 0) goto L2d0
            java.lang.String r6 = r17.j()
        L2d0:
            int r6 = r2.g(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r14 = "mediationrit_req_type_src"
            com.bytedance.msdk.up.r r6 = r13.j(r14, r6)
            int r13 = r2.ol()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            com.bytedance.msdk.up.r r6 = r6.j(r12, r13)
            int r12 = r2.rh()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r6.j(r11, r12)
            int r6 = r2.om()
            r11 = 8
            if (r6 == r11) goto L304
            int r6 = r2.om()
            r11 = 7
            if (r6 != r11) goto L320
        L304:
            boolean r6 = r2.fp()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r11 = "is_video_cache_success"
            com.bytedance.msdk.up.r r6 = r1.j(r11, r6)
            boolean r11 = r2.lx()
            r4 = r4 ^ r11
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r11 = "is_mock_video_cache_api"
            r6.j(r11, r4)
        L320:
            java.lang.String r4 = r2.q()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L333
            java.lang.String r4 = "level_tag"
            java.lang.String r6 = r2.q()
            r1.j(r4, r6)
        L333:
            java.lang.String r4 = r2.gx()
            java.lang.String r6 = r2.n()
            boolean r11 = android.text.TextUtils.isEmpty(r4)
            if (r11 != 0) goto L34e
            java.lang.String r11 = r1.j
            java.lang.String r12 = "media_show_fail"
            boolean r11 = android.text.TextUtils.equals(r11, r12)
            if (r11 != 0) goto L34e
            r1.j(r9, r4)
        L34e:
            boolean r4 = android.text.TextUtils.isEmpty(r6)
            if (r4 != 0) goto L359
            if (r0 == 0) goto L359
            r0.put(r8, r6)
        L359:
            java.lang.String r4 = r1.j
            java.lang.String r6 = "bidding_win_event"
            boolean r4 = android.text.TextUtils.equals(r4, r6)
            if (r4 == 0) goto L389
            java.lang.String r4 = r2.ed()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L376
            java.lang.String r4 = "win_callback"
            java.lang.String r6 = r2.ed()
            r1.j(r4, r6)
        L376:
            java.lang.String r4 = r2.c()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L389
            java.lang.String r4 = "fail_callback"
            java.lang.String r6 = r2.c()
            r1.j(r4, r6)
        L389:
            boolean r4 = r2.qo()
            if (r4 == 0) goto L39a
            int r4 = r2.wq()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.j(r10, r4)
        L39a:
            if (r0 != 0) goto L3a1
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
        L3a1:
            int r4 = r2.s()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r3, r4)
            boolean r3 = r2.l()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "timeout_req"
            r0.put(r4, r3)
            boolean r3 = r2.a()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "is_callback"
            r0.put(r4, r3)
        L3c6:
            if (r17 == 0) goto L3f6
            boolean r3 = r17.sm()
            if (r3 == 0) goto L3f6
            if (r2 == 0) goto L3e3
            java.lang.String r3 = r2.v()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L3e3
            java.lang.String r3 = "origin_link_id"
            java.lang.String r4 = r2.v()
            r0.put(r3, r4)
        L3e3:
            java.lang.String r3 = r17.vl()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L3f6
            java.lang.String r3 = "cur_prime_rit"
            java.lang.String r4 = r17.vl()
            r0.put(r3, r4)
        L3f6:
            if (r17 == 0) goto L411
            boolean r3 = r17.sm()
            if (r3 == 0) goto L411
            if (r2 == 0) goto L411
            java.lang.String r3 = r2.tj()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L411
            java.lang.String r3 = r2.tj()
            r1.xt(r3)
        L411:
            if (r17 == 0) goto L45b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r17.j()
            r3.append(r4)
            java.lang.String r4 = "_"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "client_req_id"
            if (r18 == 0) goto L443
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.lang.String r3 = r18.w()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.j(r4, r2)
            goto L45b
        L443:
            if (r2 == 0) goto L45b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.String r2 = r2.qa()
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r1.j(r4, r2)
        L45b:
            java.lang.String r2 = r1.cw
            java.lang.String r3 = "pangle"
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L476
            com.bytedance.msdk.core.j r2 = com.bytedance.msdk.core.j.qv()
            boolean r2 = r2.uf()
            if (r2 == 0) goto L476
            java.lang.String r2 = "sub_adn_name"
            java.lang.String r3 = "pangleoppo"
            r1.j(r2, r3)
        L476:
            java.lang.String r2 = r1.cw
            java.lang.String r3 = "gdt"
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L4e6
            int r2 = com.bytedance.sdk.gromore.init.j.j()
            r3 = 6300(0x189c, float:8.828E-42)
            if (r2 < r3) goto L4e6
            int r2 = com.bytedance.msdk.core.j.j.up.xt()
            r3 = -1
            if (r2 == r3) goto L4e6
            java.lang.String r2 = r1.j
            java.lang.String r3 = "media_request"
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            java.lang.String r3 = "adapter_plugin_loader"
            if (r2 == 0) goto L4a6
            int r2 = com.bytedance.msdk.core.j.j.up.xt()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r3, r2)
        L4a6:
            java.lang.String r2 = r1.j
            java.lang.String r4 = "media_fill"
            boolean r2 = android.text.TextUtils.equals(r2, r4)
            if (r2 != 0) goto L4ce
            java.lang.String r2 = r1.j
            java.lang.String r4 = "media_fill_fail"
            boolean r2 = android.text.TextUtils.equals(r2, r4)
            if (r2 != 0) goto L4ce
            java.lang.String r2 = r1.j
            java.lang.String r4 = "media_show"
            boolean r2 = android.text.TextUtils.equals(r2, r4)
            if (r2 != 0) goto L4ce
            java.lang.String r2 = r1.j
            java.lang.String r4 = "media_show_listen"
            boolean r2 = android.text.TextUtils.equals(r2, r4)
            if (r2 == 0) goto L4e6
        L4ce:
            int r2 = com.bytedance.msdk.core.j.j.up.xt()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r3, r2)
            int r2 = com.bytedance.msdk.core.j.j.up.cw(r17)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "adapter_plugin_status"
            r0.put(r3, r2)
        L4e6:
            java.lang.String r2 = r1.cw
            boolean r2 = com.bytedance.msdk.core.j.j.up.j(r2)
            java.lang.String r3 = "is_dex_adapter"
            if (r2 == 0) goto L503
            r0.put(r3, r5)
            java.lang.String r2 = "com.byted.mixed"
            int r2 = com.bytedance.sdk.openadsdk.l.qv.cw(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "dex_adapter_version"
            r0.put(r3, r2)
            goto L50a
        L503:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r0.put(r3, r2)
        L50a:
            java.lang.String r0 = "isFusion"
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.j(r0, r2)
        L511:
            return
    }

    public static void j(com.bytedance.msdk.xt.cw r16, int r17, java.lang.String r18, long r19, com.bytedance.msdk.api.j.xt r21, int r22, int r23, int r24, java.lang.String r25, long r26, long r28) {
            com.bytedance.msdk.up.r r1 = com.bytedance.msdk.up.r.cw()
            com.bytedance.msdk.up.m$17 r0 = new com.bytedance.msdk.up.m$17
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r12 = r26
            r14 = r28
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12, r14)
            com.bytedance.msdk.j.up.m.r(r0)
            return
    }

    public static void j(com.bytedance.msdk.xt.cw r2, com.bytedance.msdk.api.j.xt r3, int r4, int r5, int r6, java.lang.String r7) {
            com.bytedance.msdk.up.r r0 = com.bytedance.msdk.up.r.xt()
            com.bytedance.msdk.up.r r5 = r0.setResult(r5)
            java.lang.String r1 = "media_show_after"
            com.bytedance.msdk.up.r r5 = r5.j(r1)
            java.lang.String r1 = "play_again"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            com.bytedance.msdk.up.r r5 = r5.j(r1, r6)
            java.lang.String r6 = "reason"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5.j(r6, r4)
            boolean r4 = android.text.TextUtils.isEmpty(r7)
            if (r4 != 0) goto L2c
            java.lang.String r4 = "callstack_message"
            r0.j(r4, r7)
        L2c:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r5 = 0
            j(r0, r3, r5, r2, r4)
            android.content.Context r2 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.up.cw.j(r2, r0, r4)
            return
    }

    public static void j(com.bytedance.msdk.xt.cw r6, com.bytedance.msdk.api.j.xt r7, int r8, java.lang.String r9, long r10, int r12, int r13, java.lang.String r14) {
            com.bytedance.msdk.up.r r0 = com.bytedance.msdk.up.r.xt()
            r1 = 0
            r2 = 1
            if (r6 == 0) goto L10
            boolean r3 = r6.nd()
            if (r3 == 0) goto L10
            r3 = 1
            goto L11
        L10:
            r3 = 0
        L11:
            java.lang.String r4 = "media_reward_verify"
            com.bytedance.msdk.up.r r4 = r0.j(r4)
            java.lang.String r5 = "adn_preload"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.bytedance.msdk.up.r r3 = r4.j(r5, r3)
            java.lang.String r4 = "reason"
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            com.bytedance.msdk.up.r r12 = r3.j(r4, r12)
            java.lang.String r3 = "play_again"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r12.j(r3, r8)
            if (r13 == 0) goto L41
            r8 = 20000(0x4e20, float:2.8026E-41)
            if (r13 == r8) goto L41
            com.bytedance.msdk.up.r r8 = r0.xt(r13)
            r8.oq(r14)
        L41:
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            r12 = 0
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 < 0) goto L4d
            r1 = 1
        L4d:
            if (r6 == 0) goto L76
            boolean r12 = r6.dj()
            if (r12 == 0) goto L76
            double r12 = com.bytedance.msdk.tl.mi.cw()
            java.lang.Double r12 = java.lang.Double.valueOf(r12)
            java.lang.String r13 = "custom_adn_sample_ratio"
            r8.put(r13, r12)
            java.lang.String r12 = "custom_adn_sample_ratio_result"
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r1)
            r8.put(r12, r13)
            if (r1 == 0) goto L76
            java.lang.String r12 = "custom_adn_rec_time"
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r8.put(r12, r10)
        L76:
            if (r7 == 0) goto La8
            com.bytedance.msdk.core.ws.cw r10 = com.bytedance.msdk.core.xt.xt()
            if (r10 == 0) goto La8
            java.lang.String r11 = r7.v()
            int r12 = r7.f()
            r13 = 101(0x65, float:1.42E-43)
            com.bytedance.msdk.core.oq.xt r10 = r10.j(r11, r12, r13)
            if (r10 == 0) goto La8
            int r11 = r10.nd()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r12 = "reward_callback_type"
            r8.put(r12, r11)
            int r10 = r10.n()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.String r11 = "reward_start_time"
            r8.put(r11, r10)
        La8:
            if (r9 == 0) goto Laf
            java.lang.String r10 = "sub_adn_name"
            r0.j(r10, r9)
        Laf:
            r9 = 0
            j(r0, r7, r9, r6, r8)
            android.content.Context r6 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.up.cw.j(r6, r0, r8)
            return
    }

    public static void j(com.bytedance.msdk.xt.cw r6, com.bytedance.msdk.api.j.xt r7, int r8, java.lang.String r9, long r10, java.lang.String r12, boolean r13) {
            com.bytedance.msdk.up.r r0 = com.bytedance.msdk.up.r.xt()
            r1 = 0
            r2 = 1
            if (r6 == 0) goto L10
            boolean r3 = r6.nd()
            if (r3 == 0) goto L10
            r3 = 1
            goto L11
        L10:
            r3 = 0
        L11:
            java.lang.String r4 = "media_show_listen"
            com.bytedance.msdk.up.r r4 = r0.j(r4)
            java.lang.String r5 = "adn_preload"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.bytedance.msdk.up.r r3 = r4.j(r5, r3)
            java.lang.String r4 = "play_again"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            com.bytedance.msdk.up.r r8 = r3.j(r4, r8)
            java.lang.String r3 = "is_repeat"
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r8.j(r3, r13)
            if (r9 == 0) goto L3b
            java.lang.String r8 = "sub_adn_name"
            r0.j(r8, r9)
        L3b:
            boolean r8 = android.text.TextUtils.isEmpty(r12)
            if (r8 != 0) goto L46
            java.lang.String r8 = "callstack_message"
            r0.j(r8, r12)
        L46:
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            com.bytedance.msdk.core.ws.cw r9 = com.bytedance.msdk.core.xt.xt()
            boolean r9 = r9.uf()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r12 = "enable_label_return"
            r8.put(r12, r9)
            com.bytedance.msdk.core.j r9 = com.bytedance.msdk.core.j.qv()
            boolean r9 = r9.j()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r12 = "if_labelapi_call"
            r8.put(r12, r9)
            com.bytedance.msdk.core.xt.cw.j(r6, r7, r8)
            r12 = 0
            int r9 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r9 < 0) goto L77
            r1 = 1
        L77:
            if (r6 == 0) goto La0
            boolean r9 = r6.dj()
            if (r9 == 0) goto La0
            double r12 = com.bytedance.msdk.tl.mi.cw()
            java.lang.Double r9 = java.lang.Double.valueOf(r12)
            java.lang.String r12 = "custom_adn_sample_ratio"
            r8.put(r12, r9)
            java.lang.String r9 = "custom_adn_sample_ratio_result"
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r1)
            r8.put(r9, r12)
            if (r1 == 0) goto La0
            java.lang.String r9 = "custom_adn_rec_time"
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r8.put(r9, r10)
        La0:
            r9 = 0
            j(r0, r7, r9, r6, r8)
            android.content.Context r6 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.up.cw.j(r6, r0, r8)
            return
    }

    public static void j(com.bytedance.msdk.xt.cw r8, com.bytedance.msdk.api.j.xt r9, int r10, java.lang.String r11, long r12, boolean r14) {
            r6 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r7 = r14
            j(r0, r1, r2, r3, r4, r6, r7)
            return
    }

    public static void j(com.bytedance.msdk.xt.cw r9, com.bytedance.msdk.api.j.xt r10, com.bytedance.msdk.api.j r11, int r12, int r13, java.lang.String r14, long r15) {
            r8 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            j(r0, r1, r2, r3, r4, r5, r6, r8)
            return
    }

    public static void j(com.bytedance.msdk.xt.cw r3, com.bytedance.msdk.api.j.xt r4, com.bytedance.msdk.api.j r5, int r6, int r7, java.lang.String r8, long r9, java.lang.String r11) {
            com.bytedance.msdk.up.r r0 = com.bytedance.msdk.up.r.xt()
            com.bytedance.msdk.up.r r6 = r0.setResult(r6)
            r1 = 0
            if (r5 == 0) goto Le
            int r2 = r5.cw
            goto Lf
        Le:
            r2 = 0
        Lf:
            com.bytedance.msdk.up.r r6 = r6.xt(r2)
            r2 = 0
            if (r5 == 0) goto L19
            java.lang.String r5 = r5.r
            goto L1a
        L19:
            r5 = r2
        L1a:
            com.bytedance.msdk.up.r r5 = r6.oq(r5)
            java.lang.String r6 = "media_show_fail_listen"
            com.bytedance.msdk.up.r r5 = r5.j(r6)
            java.lang.String r6 = "play_again"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r5.j(r6, r7)
            if (r8 == 0) goto L34
            java.lang.String r5 = "sub_adn_name"
            r0.j(r5, r8)
        L34:
            boolean r5 = android.text.TextUtils.isEmpty(r11)
            if (r5 != 0) goto L3f
            java.lang.String r5 = "callstack_message"
            r0.j(r5, r11)
        L3f:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r6 = 0
            int r8 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r8 < 0) goto L4b
            r1 = 1
        L4b:
            if (r3 == 0) goto L74
            boolean r6 = r3.dj()
            if (r6 == 0) goto L74
            double r6 = com.bytedance.msdk.tl.mi.cw()
            java.lang.Double r6 = java.lang.Double.valueOf(r6)
            java.lang.String r7 = "custom_adn_sample_ratio"
            r5.put(r7, r6)
            java.lang.String r6 = "custom_adn_sample_ratio_result"
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
            r5.put(r6, r7)
            if (r1 == 0) goto L74
            java.lang.String r6 = "custom_adn_rec_time"
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
            r5.put(r6, r7)
        L74:
            j(r0, r4, r2, r3, r5)
            android.content.Context r3 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.up.cw.j(r3, r0, r5)
            return
    }

    public static void j(com.bytedance.msdk.xt.cw r2, com.bytedance.msdk.api.j.xt r3, com.bytedance.msdk.core.oq.oq r4) {
            com.bytedance.msdk.up.r r0 = com.bytedance.msdk.up.r.cw()
            com.bytedance.msdk.up.m$15 r1 = new com.bytedance.msdk.up.m$15
            r1.<init>(r0, r2, r3, r4)
            com.bytedance.msdk.j.up.m.r(r1)
            return
    }

    public static void j(com.bytedance.msdk.xt.cw r7, com.bytedance.msdk.api.j.xt r8, com.bytedance.msdk.core.oq.oq r9, long r10) {
            com.bytedance.msdk.up.r r1 = com.bytedance.msdk.up.r.cw()
            com.bytedance.msdk.up.m$14 r0 = new com.bytedance.msdk.up.m$14
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            com.bytedance.msdk.j.up.m.r(r0)
            return
    }

    public static void j(com.bytedance.msdk.xt.cw r12, com.bytedance.msdk.api.j.xt r13, com.bytedance.msdk.core.oq.xt r14, long r15, java.lang.String r17, boolean r18, int r19, boolean r20, boolean r21) {
            com.bytedance.msdk.up.r r1 = com.bytedance.msdk.up.r.cw()
            com.bytedance.msdk.up.m$4 r0 = new com.bytedance.msdk.up.m$4
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11)
            com.bytedance.msdk.j.up.m.r(r0)
            return
    }

    public static void j(com.bytedance.msdk.xt.cw r2, com.bytedance.msdk.api.j.xt r3, java.lang.String r4) {
            com.bytedance.msdk.up.r r0 = com.bytedance.msdk.up.r.xt()
            java.lang.String r1 = "media_show_dislike"
            com.bytedance.msdk.up.r r1 = r0.j(r1)
            r1.oq(r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r1 = 0
            j(r0, r3, r1, r2, r4)
            android.content.Context r2 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.up.cw.j(r2, r0, r4)
            return
    }

    public static void j(com.bytedance.msdk.xt.cw r7, com.bytedance.msdk.api.j.xt r8, java.lang.String r9, int r10) {
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L7
            return
        L7:
            com.bytedance.msdk.up.r r2 = com.bytedance.msdk.up.r.cw()
            com.bytedance.msdk.up.m$8 r1 = new com.bytedance.msdk.up.m$8
            r6 = r7
            r5 = r8
            r3 = r9
            r4 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            com.bytedance.msdk.j.up.m.r(r1)
            return
    }

    public static void j(com.bytedance.msdk.xt.cw r6, com.bytedance.msdk.api.j.xt r7, java.util.List<com.bytedance.msdk.xt.cw> r8, java.util.List<com.bytedance.msdk.xt.cw> r9) {
            com.bytedance.msdk.up.r r1 = com.bytedance.msdk.up.r.cw()
            com.bytedance.msdk.up.m$11 r0 = new com.bytedance.msdk.up.m$11
            r2 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            com.bytedance.msdk.j.up.m.r(r0)
            return
    }

    public static void j(com.bytedance.msdk.xt.cw r1, com.bytedance.msdk.api.j.xt r2, boolean r3, int r4) {
            r0 = 0
            j(r1, r2, r3, r4, r0)
            return
    }

    public static void j(com.bytedance.msdk.xt.cw r4, com.bytedance.msdk.api.j.xt r5, boolean r6, int r7, java.util.Map<java.lang.String, java.lang.Object> r8) {
            com.bytedance.msdk.up.r r0 = com.bytedance.msdk.up.r.xt()
            if (r4 == 0) goto Le
            boolean r1 = r4.nd()
            if (r1 == 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            java.lang.String r2 = "media_show"
            com.bytedance.msdk.up.r r2 = r0.j(r2)
            java.lang.String r3 = "adn_preload"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.bytedance.msdk.up.r r1 = r2.j(r3, r1)
            java.lang.String r2 = "play_again"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            com.bytedance.msdk.up.r r7 = r1.j(r2, r7)
            java.lang.String r1 = "is_repeat"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.j(r1, r6)
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            if (r8 == 0) goto L42
            boolean r7 = r8.isEmpty()
            if (r7 != 0) goto L42
            r6.putAll(r8)
        L42:
            r7 = 0
            j(r0, r5, r7, r4, r6)
            android.content.Context r4 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.up.cw.j(r4, r0, r6)
            return
    }

    public static void j(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L7
            return
        L7:
            com.bytedance.msdk.up.r r0 = com.bytedance.msdk.up.r.cw()
            com.bytedance.msdk.up.m$7 r1 = new com.bytedance.msdk.up.m$7
            r1.<init>(r0, r2)
            com.bytedance.msdk.j.up.m.r(r1)
            return
    }

    public static void j(java.lang.String r2, com.bytedance.msdk.xt.cw r3, com.bytedance.msdk.api.j.xt r4, com.bytedance.msdk.core.oq.oq r5, com.bytedance.msdk.api.j r6) {
            com.bytedance.msdk.up.r r0 = com.bytedance.msdk.up.r.xt()
            if (r6 == 0) goto L9
            int r1 = r6.j
            goto La
        L9:
            r1 = 0
        La:
            com.bytedance.msdk.up.r r1 = r0.xt(r1)
            if (r6 == 0) goto L13
            java.lang.String r6 = r6.xt
            goto L14
        L13:
            r6 = 0
        L14:
            com.bytedance.msdk.up.r r6 = r1.oq(r6)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 == 0) goto L20
            java.lang.String r2 = ""
        L20:
            com.bytedance.msdk.up.r r2 = r6.up(r2)
            java.lang.String r6 = "custom_adn_init_fail"
            r2.j(r6)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            j(r0, r4, r5, r3, r2)
            android.content.Context r3 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.up.cw.j(r3, r0, r2)
            return
    }

    public static void j(java.util.List<com.bytedance.msdk.xt.cw> r9, com.bytedance.msdk.api.j.xt r10, int r11) {
            r0 = 0
            r1 = 0
            if (r9 == 0) goto L11
            int r2 = r9.size()
            if (r2 <= 0) goto L11
            java.lang.Object r2 = r9.get(r0)
            com.bytedance.msdk.xt.cw r2 = (com.bytedance.msdk.xt.cw) r2
            goto L12
        L11:
            r2 = r1
        L12:
            com.bytedance.msdk.up.r r3 = com.bytedance.msdk.up.r.xt()
            java.lang.String r4 = "media_show_fail"
            r3.j(r4)
            if (r11 != 0) goto La1
            r11 = 40052(0x9c74, float:5.6125E-41)
            r3.xt(r11)
            if (r2 == 0) goto Lab
            org.json.JSONArray r11 = new org.json.JSONArray     // Catch: org.json.JSONException -> L86
            r11.<init>()     // Catch: org.json.JSONException -> L86
            java.util.Iterator r9 = r9.iterator()     // Catch: org.json.JSONException -> L86
        L2e:
            boolean r4 = r9.hasNext()     // Catch: org.json.JSONException -> L86
            if (r4 == 0) goto L95
            java.lang.Object r4 = r9.next()     // Catch: org.json.JSONException -> L86
            com.bytedance.msdk.xt.cw r4 = (com.bytedance.msdk.xt.cw) r4     // Catch: org.json.JSONException -> L86
            if (r4 == 0) goto L2e
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L86
            r5.<init>()     // Catch: org.json.JSONException -> L86
            java.lang.String r6 = "adn"
            java.lang.String r7 = r4.ff()     // Catch: org.json.JSONException -> L86
            r5.put(r6, r7)     // Catch: org.json.JSONException -> L86
            java.lang.String r6 = "type"
            int r7 = r4.om()     // Catch: org.json.JSONException -> L86
            int r8 = r4.rh()     // Catch: org.json.JSONException -> L86
            java.lang.String r7 = com.bytedance.msdk.xt.j.j(r7, r8)     // Catch: org.json.JSONException -> L86
            r5.put(r6, r7)     // Catch: org.json.JSONException -> L86
            java.lang.String r6 = "adnSlotId"
            java.lang.String r7 = r4.qa()     // Catch: org.json.JSONException -> L86
            r5.put(r6, r7)     // Catch: org.json.JSONException -> L86
            java.lang.String r6 = "loadSort"
            int r7 = r4.wi()     // Catch: org.json.JSONException -> L86
            r5.put(r6, r7)     // Catch: org.json.JSONException -> L86
            java.lang.String r6 = "showSort"
            int r7 = r4.d()     // Catch: org.json.JSONException -> L86
            r5.put(r6, r7)     // Catch: org.json.JSONException -> L86
            if (r10 == 0) goto L88
            java.lang.String r6 = "isReady"
            java.lang.String r7 = r10.v()     // Catch: org.json.JSONException -> L86
            boolean r7 = r4.wq(r7)     // Catch: org.json.JSONException -> L86
            r5.put(r6, r7)     // Catch: org.json.JSONException -> L86
            goto L88
        L86:
            r9 = move-exception
            goto L9d
        L88:
            java.lang.String r6 = "hasShown"
            boolean r4 = r4.qb()     // Catch: org.json.JSONException -> L86
            r5.put(r6, r4)     // Catch: org.json.JSONException -> L86
            r11.put(r5)     // Catch: org.json.JSONException -> L86
            goto L2e
        L95:
            java.lang.String r9 = r11.toString()     // Catch: org.json.JSONException -> L86
            r3.oq(r9)     // Catch: org.json.JSONException -> L86
            goto Lab
        L9d:
            com.bytedance.sdk.component.utils.vl.j(r9)
            goto Lab
        La1:
            r3.xt(r11)
            java.lang.String r9 = com.bytedance.msdk.api.j.j(r11)
            r3.oq(r9)
        Lab:
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            j(r3, r10, r1, r2, r9)
            java.lang.String r10 = "is_video_cache_success"
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            r3.j(r10, r11)
            android.content.Context r10 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.up.cw.j(r10, r3, r9)
            return
    }

    public static void j(java.util.List<com.bytedance.msdk.xt.cw> r8, java.util.List<com.bytedance.msdk.xt.cw> r9, java.util.List<com.bytedance.msdk.xt.cw> r10, com.bytedance.msdk.api.j.xt r11, int r12) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r8 == 0) goto L10
            int r1 = r8.size()
            if (r1 <= 0) goto L10
            r0.addAll(r8)
        L10:
            if (r9 == 0) goto L1b
            int r8 = r9.size()
            if (r8 <= 0) goto L1b
            r0.addAll(r9)
        L1b:
            if (r10 == 0) goto L26
            int r8 = r10.size()
            if (r8 <= 0) goto L26
            r0.addAll(r10)
        L26:
            int r8 = r0.size()
            r9 = 0
            r10 = 0
            if (r8 <= 0) goto L35
            java.lang.Object r8 = r0.get(r9)
            com.bytedance.msdk.xt.cw r8 = (com.bytedance.msdk.xt.cw) r8
            goto L36
        L35:
            r8 = r10
        L36:
            com.bytedance.msdk.up.r r1 = com.bytedance.msdk.up.r.xt()
            java.lang.String r2 = "media_show_is_ready"
            r1.j(r2)
            if (r12 != 0) goto L11e
            org.json.JSONArray r12 = new org.json.JSONArray     // Catch: org.json.JSONException -> La3
            r12.<init>()     // Catch: org.json.JSONException -> La3
            java.util.Iterator r0 = r0.iterator()     // Catch: org.json.JSONException -> La3
        L4a:
            r2 = 0
        L4b:
            boolean r3 = r0.hasNext()     // Catch: org.json.JSONException -> La3
            if (r3 == 0) goto L10b
            java.lang.Object r3 = r0.next()     // Catch: org.json.JSONException -> La3
            com.bytedance.msdk.xt.cw r3 = (com.bytedance.msdk.xt.cw) r3     // Catch: org.json.JSONException -> La3
            if (r3 == 0) goto L4b
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> La3
            r4.<init>()     // Catch: org.json.JSONException -> La3
            java.lang.String r5 = "adn"
            java.lang.String r6 = r3.ff()     // Catch: org.json.JSONException -> La3
            r4.put(r5, r6)     // Catch: org.json.JSONException -> La3
            java.lang.String r5 = "type"
            int r6 = r3.om()     // Catch: org.json.JSONException -> La3
            int r7 = r3.rh()     // Catch: org.json.JSONException -> La3
            java.lang.String r6 = com.bytedance.msdk.xt.j.j(r6, r7)     // Catch: org.json.JSONException -> La3
            r4.put(r5, r6)     // Catch: org.json.JSONException -> La3
            java.lang.String r5 = "adnSlotId"
            java.lang.String r6 = r3.qa()     // Catch: org.json.JSONException -> La3
            r4.put(r5, r6)     // Catch: org.json.JSONException -> La3
            java.lang.String r5 = "loadSort"
            int r6 = r3.wi()     // Catch: org.json.JSONException -> La3
            r4.put(r5, r6)     // Catch: org.json.JSONException -> La3
            java.lang.String r5 = "showSort"
            int r6 = r3.d()     // Catch: org.json.JSONException -> La3
            r4.put(r5, r6)     // Catch: org.json.JSONException -> La3
            if (r11 == 0) goto La6
            java.lang.String r5 = "isReady"
            java.lang.String r6 = r11.v()     // Catch: org.json.JSONException -> La3
            boolean r6 = r3.wq(r6)     // Catch: org.json.JSONException -> La3
            r4.put(r5, r6)     // Catch: org.json.JSONException -> La3
            goto La6
        La3:
            r9 = move-exception
            goto L11a
        La6:
            java.lang.String r5 = "hasShown"
            boolean r6 = r3.qb()     // Catch: org.json.JSONException -> La3
            r4.put(r5, r6)     // Catch: org.json.JSONException -> La3
            boolean r5 = r3.lx()     // Catch: org.json.JSONException -> La3
            if (r5 == 0) goto Lbe
            java.lang.String r5 = "is_video_cache_success"
            boolean r6 = r3.fp()     // Catch: org.json.JSONException -> La3
            r4.put(r5, r6)     // Catch: org.json.JSONException -> La3
        Lbe:
            java.lang.String r5 = "mediationrit_req_type"
            if (r11 == 0) goto Lc7
            java.lang.String r6 = r11.j()     // Catch: org.json.JSONException -> La3
            goto Lc8
        Lc7:
            r6 = r10
        Lc8:
            int r6 = r3.tl(r6)     // Catch: org.json.JSONException -> La3
            r4.put(r5, r6)     // Catch: org.json.JSONException -> La3
            java.lang.String r5 = "mediationrit_req_type_src"
            if (r11 == 0) goto Ld8
            java.lang.String r6 = r11.j()     // Catch: org.json.JSONException -> La3
            goto Ld9
        Ld8:
            r6 = r10
        Ld9:
            int r6 = r3.g(r6)     // Catch: org.json.JSONException -> La3
            r4.put(r5, r6)     // Catch: org.json.JSONException -> La3
            r12.put(r4)     // Catch: org.json.JSONException -> La3
            if (r2 != 0) goto L4b
            if (r11 == 0) goto L4b
            int r2 = r11.f()     // Catch: org.json.JSONException -> La3
            r4 = 5
            if (r2 != r4) goto Lf8
            java.lang.String r2 = r11.v()     // Catch: org.json.JSONException -> La3
            boolean r2 = r3.wq(r2)     // Catch: org.json.JSONException -> La3
            goto L4b
        Lf8:
            java.lang.String r2 = r11.v()     // Catch: org.json.JSONException -> La3
            boolean r2 = r3.wq(r2)     // Catch: org.json.JSONException -> La3
            if (r2 == 0) goto L4a
            boolean r2 = r3.qb()     // Catch: org.json.JSONException -> La3
            if (r2 != 0) goto L4a
            r2 = 1
            goto L4b
        L10b:
            if (r2 == 0) goto L10e
            goto L10f
        L10e:
            r9 = -1
        L10f:
            r1.xt(r9)     // Catch: org.json.JSONException -> La3
            java.lang.String r9 = r12.toString()     // Catch: org.json.JSONException -> La3
            r1.oq(r9)     // Catch: org.json.JSONException -> La3
            goto L129
        L11a:
            com.bytedance.sdk.component.utils.vl.j(r9)
            goto L129
        L11e:
            r9 = 2
            r1.xt(r9)
            java.lang.String r9 = com.bytedance.msdk.api.j.j(r12)
            r1.oq(r9)
        L129:
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            j(r1, r11, r10, r8, r9)
            android.content.Context r8 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.up.cw.j(r8, r1, r9)
            return
    }

    public static void j(java.util.Map<java.lang.String, java.lang.Object> r21, com.bytedance.msdk.api.j.xt r22, com.bytedance.msdk.xt.cw r23, long r24, int r26, int r27, int r28, java.lang.String r29, int r30, int r31, com.bytedance.msdk.core.oq.xt r32) {
            r0 = r21
            java.lang.String r1 = "rule_id"
            java.lang.String r2 = "serverBidding_timeout"
            java.lang.String r3 = "has_serverBidding"
            java.lang.String r4 = "rule_in_use"
            java.lang.String r5 = "price_from"
            java.lang.String r6 = "price_source"
            com.bytedance.msdk.up.r r8 = com.bytedance.msdk.up.r.cw()
            if (r0 == 0) goto Le7
            java.lang.String r7 = "group_type"
            java.lang.Object r9 = r0.get(r7)
            boolean r9 = r9 instanceof java.lang.Integer
            if (r9 == 0) goto L29
            java.lang.Object r7 = r0.get(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            goto L2a
        L29:
            r7 = 0
        L2a:
            java.lang.String r9 = "ecpm"
            java.lang.Object r11 = r0.get(r9)
            boolean r11 = r11 instanceof java.lang.Double
            r12 = 0
            if (r11 == 0) goto L41
            java.lang.Object r9 = r0.get(r9)
            java.lang.Double r9 = (java.lang.Double) r9
            double r14 = r9.doubleValue()
            goto L42
        L41:
            r14 = r12
        L42:
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            java.lang.Object r11 = r0.get(r5)     // Catch: org.json.JSONException -> Le4
            r9.put(r5, r11)     // Catch: org.json.JSONException -> Le4
            java.lang.String r5 = "grout_type"
            r9.put(r5, r7)     // Catch: org.json.JSONException -> Le4
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> Le4
            r5.<init>()     // Catch: org.json.JSONException -> Le4
            java.lang.String r11 = "target_ecpm_origin"
            r5.put(r11, r14)     // Catch: org.json.JSONException -> Le4
            java.lang.String r11 = "target_ecpm_upper"
            java.lang.String r10 = "upper_cpm_x"
            java.lang.Object r10 = r0.get(r10)     // Catch: org.json.JSONException -> Le4
            r5.put(r11, r10)     // Catch: org.json.JSONException -> Le4
            java.lang.String r10 = "price"
            r9.put(r10, r5)     // Catch: org.json.JSONException -> Le4
            java.lang.Object r5 = r0.get(r6)     // Catch: org.json.JSONException -> Le4
            if (r5 == 0) goto L7a
            java.lang.Object r5 = r0.get(r6)     // Catch: org.json.JSONException -> Le4
            r9.put(r6, r5)     // Catch: org.json.JSONException -> Le4
        L7a:
            java.lang.Object r5 = r0.get(r4)     // Catch: org.json.JSONException -> Le4
            boolean r5 = r5 instanceof java.lang.Integer     // Catch: org.json.JSONException -> Le4
            if (r5 == 0) goto L8d
            java.lang.Object r4 = r0.get(r4)     // Catch: org.json.JSONException -> Le4
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: org.json.JSONException -> Le4
            int r4 = r4.intValue()     // Catch: org.json.JSONException -> Le4
            goto L8e
        L8d:
            r4 = 0
        L8e:
            java.lang.Object r5 = r0.get(r3)     // Catch: org.json.JSONException -> Le4
            boolean r5 = r5 instanceof java.lang.Boolean     // Catch: org.json.JSONException -> Le4
            if (r5 == 0) goto La1
            java.lang.Object r3 = r0.get(r3)     // Catch: org.json.JSONException -> Le4
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: org.json.JSONException -> Le4
            boolean r3 = r3.booleanValue()     // Catch: org.json.JSONException -> Le4
            goto La2
        La1:
            r3 = 0
        La2:
            r5 = 3
            r6 = 4
            if (r7 == r5) goto Laa
            if (r7 == r6) goto Laa
            r10 = 0
            goto Ld3
        Laa:
            if (r3 != 0) goto Lae
            r10 = 1
            goto Ld3
        Lae:
            int r3 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r3 != 0) goto Lb4
            r10 = 2
            goto Ld3
        Lb4:
            if (r4 != 0) goto Lb8
            r10 = 5
            goto Ld3
        Lb8:
            java.lang.Object r3 = r0.get(r2)     // Catch: org.json.JSONException -> Le4
            boolean r3 = r3 instanceof java.lang.Boolean     // Catch: org.json.JSONException -> Le4
            if (r3 == 0) goto Lcb
            java.lang.Object r2 = r0.get(r2)     // Catch: org.json.JSONException -> Le4
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: org.json.JSONException -> Le4
            boolean r10 = r2.booleanValue()     // Catch: org.json.JSONException -> Le4
            goto Lcc
        Lcb:
            r10 = 0
        Lcc:
            if (r7 != r6) goto Ld2
            if (r10 != 0) goto Ld2
            r10 = 3
            goto Ld3
        Ld2:
            r10 = 4
        Ld3:
            java.lang.String r2 = "pos_state"
            r9.put(r2, r10)     // Catch: org.json.JSONException -> Le4
            java.lang.Object r0 = r0.get(r1)     // Catch: org.json.JSONException -> Le4
            r9.put(r1, r0)     // Catch: org.json.JSONException -> Le4
            java.lang.String r0 = "rule_inuse"
            r9.put(r0, r4)     // Catch: org.json.JSONException -> Le4
        Le4:
            r20 = r9
            goto Le9
        Le7:
            r9 = 0
            goto Le4
        Le9:
            com.bytedance.msdk.up.m$22 r7 = new com.bytedance.msdk.up.m$22
            r9 = r22
            r10 = r23
            r11 = r24
            r13 = r26
            r14 = r27
            r15 = r28
            r16 = r29
            r17 = r30
            r18 = r31
            r19 = r32
            r7.<init>(r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20)
            com.bytedance.msdk.j.up.m.r(r7)
            return
    }

    public static void j(boolean r2) {
            com.bytedance.msdk.up.r r0 = com.bytedance.msdk.up.r.cw()
            com.bytedance.msdk.up.m$6 r1 = new com.bytedance.msdk.up.m$6
            r1.<init>(r2, r0)
            com.bytedance.msdk.j.up.m.r(r1)
            return
    }

    public static void xt() {
            com.bytedance.msdk.up.r r0 = com.bytedance.msdk.up.r.xt()
            java.lang.String r1 = "start_up"
            r0.j(r1)
            android.content.Context r1 = com.bytedance.msdk.core.xt.getContext()
            r2 = 0
            com.bytedance.msdk.up.cw.j(r1, r0, r2)
            return
    }

    public static void xt(long r6) {
            com.bytedance.msdk.up.r r0 = com.bytedance.msdk.up.r.xt()
            java.lang.String r1 = "sdk_backstage"
            com.bytedance.msdk.up.r r1 = r0.j(r1)
            r1.j(r6)
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            com.bytedance.msdk.ae.xt.j r7 = com.bytedance.msdk.ae.xt.j.j()
            boolean r7 = r7.qv()
            java.lang.String r1 = "call_init_method_duration"
            if (r7 == 0) goto L45
            com.bytedance.msdk.ae.xt.j r7 = com.bytedance.msdk.ae.xt.j.j()
            long r2 = r7.tl()
            r4 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto L5e
            com.bytedance.msdk.ae.xt.j r7 = com.bytedance.msdk.ae.xt.j.j()
            java.lang.String r2 = com.bytedance.msdk.up.j.cw
            r7.j(r2)
            com.bytedance.msdk.ae.xt.j r7 = com.bytedance.msdk.ae.xt.j.j()
            long r2 = r7.tl()
            java.lang.Long r7 = java.lang.Long.valueOf(r2)
            r6.put(r1, r7)
            goto L5e
        L45:
            com.bytedance.msdk.ae.xt.j r7 = com.bytedance.msdk.ae.xt.j.j()
            boolean r7 = r7.vl()
            if (r7 == 0) goto L5e
            com.bytedance.msdk.ae.xt.j r7 = com.bytedance.msdk.ae.xt.j.j()
            long r2 = r7.tl()
            java.lang.Long r7 = java.lang.Long.valueOf(r2)
            r6.put(r1, r7)
        L5e:
            java.lang.String r7 = "v3"
            org.json.JSONObject r1 = com.bytedance.msdk.tl.l.ae(r7)
            r6.put(r7, r1)
            java.lang.String r7 = "v1"
            org.json.JSONObject r1 = com.bytedance.msdk.tl.l.ae(r7)
            r6.put(r7, r1)
            java.lang.String r7 = "v2Enc_config"
            org.json.JSONObject r1 = com.bytedance.msdk.tl.l.ae(r7)
            r6.put(r7, r1)
            java.lang.String r7 = "v4Enc_config"
            org.json.JSONObject r1 = com.bytedance.msdk.tl.l.ae(r7)
            r6.put(r7, r1)
            java.lang.String r7 = "v2Enc_exchange"
            org.json.JSONObject r1 = com.bytedance.msdk.tl.l.ae(r7)
            r6.put(r7, r1)
            java.lang.String r7 = "v4Enc_exchange"
            org.json.JSONObject r1 = com.bytedance.msdk.tl.l.ae(r7)
            r6.put(r7, r1)
            java.lang.String r7 = "v2Enc_reward"
            org.json.JSONObject r1 = com.bytedance.msdk.tl.l.ae(r7)
            r6.put(r7, r1)
            java.lang.String r7 = "v4Enc_reward"
            org.json.JSONObject r1 = com.bytedance.msdk.tl.l.ae(r7)
            r6.put(r7, r1)
            com.bytedance.msdk.core.ws.cw r7 = com.bytedance.msdk.core.xt.xt()
            boolean r7 = r7.uf()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r1 = "enable_label_return"
            r6.put(r1, r7)
            com.bytedance.msdk.core.j r7 = com.bytedance.msdk.core.j.qv()
            boolean r7 = r7.j()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r1 = "if_labelapi_call"
            r6.put(r1, r7)
            org.json.JSONObject r7 = com.bytedance.msdk.m.xt.up.xt()
            java.lang.String r1 = "adn_init_duration"
            r6.put(r1, r7)
            com.bytedance.msdk.core.j.j.up.j(r6)
            org.json.JSONArray r7 = com.bytedance.msdk.tl.l.r()
            if (r7 == 0) goto Le2
            r7.length()
            java.lang.String r1 = "sp_v3_bug"
            r6.put(r1, r7)
        Le2:
            android.content.Context r7 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.up.cw.j(r7, r0, r6)
            return
    }

    public static void xt(com.bytedance.msdk.api.j.xt r3) {
            com.bytedance.msdk.up.r r0 = com.bytedance.msdk.up.r.xt()
            java.lang.String r1 = "mt_ra_cc"
            r0.j(r1)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = 0
            j(r0, r3, r2, r2, r1)
            android.content.Context r3 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.up.cw.j(r3, r0, r1)
            return
    }

    public static void xt(com.bytedance.msdk.api.j.xt r2, int r3) {
            com.bytedance.msdk.up.r r0 = com.bytedance.msdk.up.r.cw()
            com.bytedance.msdk.up.m$5 r1 = new com.bytedance.msdk.up.m$5
            r1.<init>(r0, r2, r3)
            com.bytedance.msdk.j.up.m.r(r1)
            return
    }

    public static void xt(com.bytedance.msdk.xt.cw r6, com.bytedance.msdk.api.j.xt r7, int r8, java.lang.String r9, long r10, java.lang.String r12, boolean r13) {
            com.bytedance.msdk.up.r r0 = com.bytedance.msdk.up.r.xt()
            r1 = 0
            r2 = 1
            if (r6 == 0) goto L10
            boolean r3 = r6.nd()
            if (r3 == 0) goto L10
            r3 = 1
            goto L11
        L10:
            r3 = 0
        L11:
            java.lang.String r4 = "media_click_listen"
            com.bytedance.msdk.up.r r4 = r0.j(r4)
            java.lang.String r5 = "adn_preload"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.bytedance.msdk.up.r r3 = r4.j(r5, r3)
            java.lang.String r4 = "play_again"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            com.bytedance.msdk.up.r r8 = r3.j(r4, r8)
            java.lang.String r3 = "is_repeat"
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r8.j(r3, r13)
            if (r9 == 0) goto L3b
            java.lang.String r8 = "sub_adn_name"
            r0.j(r8, r9)
        L3b:
            boolean r8 = android.text.TextUtils.isEmpty(r12)
            if (r8 != 0) goto L46
            java.lang.String r8 = "callstack_message"
            r0.j(r8, r12)
        L46:
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            r12 = 0
            int r9 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r9 < 0) goto L52
            r1 = 1
        L52:
            if (r6 == 0) goto L7b
            boolean r9 = r6.dj()
            if (r9 == 0) goto L7b
            double r12 = com.bytedance.msdk.tl.mi.cw()
            java.lang.Double r9 = java.lang.Double.valueOf(r12)
            java.lang.String r12 = "custom_adn_sample_ratio"
            r8.put(r12, r9)
            java.lang.String r9 = "custom_adn_sample_ratio_result"
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r1)
            r8.put(r9, r12)
            if (r1 == 0) goto L7b
            java.lang.String r9 = "custom_adn_rec_time"
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r8.put(r9, r10)
        L7b:
            r9 = 0
            j(r0, r7, r9, r6, r8)
            android.content.Context r6 = com.bytedance.msdk.core.xt.getContext()
            com.bytedance.msdk.up.cw.j(r6, r0, r8)
            return
    }

    public static void xt(com.bytedance.msdk.xt.cw r8, com.bytedance.msdk.api.j.xt r9, int r10, java.lang.String r11, long r12, boolean r14) {
            r6 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r7 = r14
            xt(r0, r1, r2, r3, r4, r6, r7)
            return
    }
}
