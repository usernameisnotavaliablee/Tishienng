package com.bytedance.msdk.core.admanager.reward;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j {
    private com.bytedance.msdk.api.cw.j ae;
    private java.lang.String av;
    private long az;
    private int cw;
    private boolean g;
    private com.bytedance.msdk.core.admanager.reward.j.xt i;
    java.util.concurrent.atomic.AtomicInteger j;
    private com.bytedance.msdk.api.j.xt jy;

    /* renamed from: m, reason: collision with root package name */
    private long f2186m;
    private boolean oq;
    private int qv;

    /* renamed from: r, reason: collision with root package name */
    private boolean f2187r;
    private boolean tl;
    private boolean up;
    private java.lang.String vl;
    private com.bytedance.msdk.xt.cw ws;
    private int xt;



    /* renamed from: com.bytedance.msdk.core.admanager.reward.j$3, reason: invalid class name */
    class AnonymousClass3 implements java.lang.Runnable {
        final /* synthetic */ com.bytedance.msdk.core.admanager.reward.j j;


        AnonymousClass3(com.bytedance.msdk.core.admanager.reward.j r1) {
                r0 = this;
                r0.j = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r7 = this;
                com.bytedance.msdk.core.admanager.reward.j r0 = r7.j
                boolean r0 = com.bytedance.msdk.core.admanager.reward.j.j(r0)
                java.lang.String r1 = "GROMORE_SS_REWARD_VERIFY"
                if (r0 == 0) goto L10
                java.lang.String r0 = "--==-- verify回调进来，已经destroy, 直接return"
                com.bytedance.msdk.j.up.cw.j(r1, r0)
                return
            L10:
                com.bytedance.msdk.core.admanager.reward.j r0 = r7.j
                r2 = 1
                com.bytedance.msdk.core.admanager.reward.j.cw(r0, r2)
                com.bytedance.msdk.core.admanager.reward.j r0 = r7.j
                com.bytedance.msdk.api.cw.j r0 = com.bytedance.msdk.core.admanager.reward.j.xt(r0)
                if (r0 == 0) goto L48
                com.bytedance.msdk.core.admanager.reward.j r0 = r7.j
                com.bytedance.msdk.core.admanager.reward.j$xt r0 = com.bytedance.msdk.core.admanager.reward.j.cw(r0)
                if (r0 == 0) goto L47
                com.bytedance.msdk.core.admanager.reward.j r0 = r7.j
                boolean r0 = com.bytedance.msdk.core.admanager.reward.j.r(r0)
                if (r0 != 0) goto L47
                java.lang.String r0 = "--==-- verify回调进来，已经有结果，直接给开发者回调"
                com.bytedance.msdk.j.up.cw.j(r1, r0)
                com.bytedance.msdk.core.admanager.reward.j r0 = r7.j
                com.bytedance.msdk.core.admanager.reward.j.r(r0, r2)
                com.bytedance.msdk.core.admanager.reward.j r0 = r7.j
                com.bytedance.msdk.core.admanager.reward.j$xt r0 = com.bytedance.msdk.core.admanager.reward.j.cw(r0)
                com.bytedance.msdk.core.admanager.reward.j r1 = r7.j
                com.bytedance.msdk.api.cw.j r1 = com.bytedance.msdk.core.admanager.reward.j.xt(r1)
                r0.j(r1)
            L47:
                return
            L48:
                com.bytedance.msdk.core.admanager.reward.j r0 = r7.j
                long r2 = com.bytedance.msdk.core.admanager.reward.j.up(r0)
                r4 = -1
                java.lang.String r0 = "--==-- verify回调进来准备请求，但是不能重试"
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L76
                java.lang.String r2 = "--==-- verify回调进来，先进来发起请求"
                com.bytedance.msdk.j.up.cw.j(r1, r2)
                com.bytedance.msdk.core.admanager.reward.j r2 = r7.j
                long r3 = android.os.SystemClock.elapsedRealtime()
                com.bytedance.msdk.core.admanager.reward.j.j(r2, r3)
                com.bytedance.msdk.core.admanager.reward.j r2 = r7.j
                boolean r2 = com.bytedance.msdk.core.admanager.reward.j.m(r2)
                if (r2 == 0) goto L72
                com.bytedance.msdk.core.admanager.reward.j r0 = r7.j
                com.bytedance.msdk.core.admanager.reward.j.ae(r0)
                goto L9d
            L72:
                com.bytedance.msdk.j.up.cw.j(r1, r0)
                goto L9d
            L76:
                long r2 = android.os.SystemClock.elapsedRealtime()
                com.bytedance.msdk.core.admanager.reward.j r4 = r7.j
                long r4 = com.bytedance.msdk.core.admanager.reward.j.up(r4)
                long r2 = r2 - r4
                r4 = 2000(0x7d0, double:9.88E-321)
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 <= 0) goto L9d
                java.lang.String r2 = "--==-- verify回调进来，后进来但大于2s，发起请求"
                com.bytedance.msdk.j.up.cw.j(r1, r2)
                com.bytedance.msdk.core.admanager.reward.j r2 = r7.j
                boolean r2 = com.bytedance.msdk.core.admanager.reward.j.m(r2)
                if (r2 == 0) goto L9a
                com.bytedance.msdk.core.admanager.reward.j r0 = r7.j
                com.bytedance.msdk.core.admanager.reward.j.ae(r0)
                goto L9d
            L9a:
                com.bytedance.msdk.j.up.cw.j(r1, r0)
            L9d:
                com.bytedance.msdk.core.admanager.reward.j$3$1 r0 = new com.bytedance.msdk.core.admanager.reward.j$3$1
                r0.<init>(r7)
                r1 = 3000(0xbb8, double:1.482E-320)
                com.bytedance.msdk.j.up.m.j(r0, r1)
                return
        }
    }





    /* renamed from: com.bytedance.msdk.core.admanager.reward.j$j, reason: collision with other inner class name */
    private class RunnableC0219j implements java.lang.Runnable {
        final /* synthetic */ com.bytedance.msdk.core.admanager.reward.j j;
        private final int xt;

        RunnableC0219j(com.bytedance.msdk.core.admanager.reward.j r1, int r2) {
                r0 = this;
                r0.j = r1
                r0.<init>()
                r0.xt = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                com.bytedance.msdk.core.admanager.reward.j r0 = r2.j
                com.bytedance.msdk.api.cw.j r0 = com.bytedance.msdk.core.admanager.reward.j.xt(r0)
                if (r0 != 0) goto L47
                com.bytedance.msdk.core.admanager.reward.j r0 = r2.j
                boolean r0 = com.bytedance.msdk.core.admanager.reward.j.r(r0)
                if (r0 != 0) goto L47
                com.bytedance.msdk.core.admanager.reward.j r0 = r2.j
                boolean r0 = com.bytedance.msdk.core.admanager.reward.j.m(r0)
                if (r0 == 0) goto L47
                com.bytedance.msdk.core.admanager.reward.j r0 = r2.j
                boolean r0 = com.bytedance.msdk.core.admanager.reward.j.j(r0)
                if (r0 != 0) goto L47
                com.bytedance.msdk.core.admanager.reward.j r0 = r2.j
                boolean r0 = com.bytedance.msdk.core.admanager.reward.j.jy(r0)
                if (r0 != 0) goto L47
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "--==-- ServerSide reward verify 进行第"
                r0.<init>(r1)
                int r1 = r2.xt
                r0.append(r1)
                java.lang.String r1 = "次重试请求"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "GROMORE_SS_REWARD_VERIFY"
                com.bytedance.msdk.j.up.cw.j(r1, r0)
                com.bytedance.msdk.core.admanager.reward.j r0 = r2.j
                com.bytedance.msdk.core.admanager.reward.j.ae(r0)
            L47:
                return
        }
    }

    public interface xt {
        void j(com.bytedance.msdk.api.cw.j r1);
    }

    public j(java.lang.String r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f2187r = r0
            r3.up = r0
            r1 = -1
            r3.f2186m = r1
            r3.tl = r0
            r3.g = r0
            r0 = 1
            r3.oq = r0
            r1 = -1
            r3.qv = r1
            java.lang.String r1 = ""
            r3.vl = r1
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r1.<init>(r0)
            r3.j = r1
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            if (r0 == 0) goto L3c
            r1 = 7
            r2 = 101(0x65, float:1.42E-43)
            com.bytedance.msdk.core.oq.xt r4 = r0.j(r4, r1, r2)
            if (r4 == 0) goto L3c
            int r0 = r4.n()
            r3.xt = r0
            int r4 = r4.nd()
            r3.cw = r4
        L3c:
            int r4 = r3.xt
            if (r4 >= 0) goto L44
            r4 = 15000(0x3a98, float:2.102E-41)
            r3.xt = r4
        L44:
            return
    }

    @com.bytedance.component.sdk.annotation.DungeonFlag
    private void ae() {
            r6 = this;
            com.bytedance.msdk.r.xt r0 = com.bytedance.msdk.r.xt.j()
            com.bytedance.sdk.component.g.j r0 = r0.xt()
            com.bytedance.sdk.component.g.xt.up r0 = r0.xt()
            java.lang.String r1 = com.bytedance.msdk.core.cw.r()
            r0.j(r1)
            long r1 = java.lang.System.currentTimeMillis()
            com.bytedance.msdk.core.j r3 = com.bytedance.msdk.core.j.qv()
            java.lang.String r3 = r3.tl()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L31
            java.lang.String r4 = "X-Tt-Env"
            r0.xt(r4, r3)
            java.lang.String r3 = "x-use-ppe"
            java.lang.String r4 = "1"
            r0.xt(r3, r4)
        L31:
            java.lang.String r3 = "User-Agent"
            java.lang.String r4 = com.bytedance.msdk.xt.xt.j
            r0.xt(r3, r4)
            com.bytedance.msdk.core.ws.cw r3 = com.bytedance.msdk.core.xt.xt()
            boolean r3 = r3.cw()
            r4 = r3 ^ 1
            if (r3 != 0) goto L5a
            java.lang.String r3 = "x-pglcypher"
            java.lang.String r5 = "4"
            r0.xt(r3, r5)
            r3 = 1
            java.lang.String r3 = r6.j(r3)
            byte[] r3 = com.bytedance.msdk.tl.rn.xt(r3)
            java.lang.String r5 = "application/octet-stream"
            r0.j(r5, r3)
            goto L62
        L5a:
            r3 = 0
            java.lang.String r3 = r6.j(r3)
            r0.cw(r3)
        L62:
            com.bytedance.msdk.core.admanager.reward.j$7 r3 = new com.bytedance.msdk.core.admanager.reward.j$7
            r3.<init>(r6, r4, r1)
            r0.j(r3)
            return
    }

    static /* synthetic */ void ae(com.bytedance.msdk.core.admanager.reward.j r0) {
            r0.ae()
            return
    }

    static /* synthetic */ com.bytedance.msdk.core.admanager.reward.j.xt cw(com.bytedance.msdk.core.admanager.reward.j r0) {
            com.bytedance.msdk.core.admanager.reward.j$xt r0 = r0.i
            return r0
    }

    static /* synthetic */ boolean cw(com.bytedance.msdk.core.admanager.reward.j r0, boolean r1) {
            r0.tl = r1
            return r1
    }

    static /* synthetic */ java.lang.String g(com.bytedance.msdk.core.admanager.reward.j r0) {
            java.lang.String r0 = r0.av
            return r0
    }

    static /* synthetic */ long j(com.bytedance.msdk.core.admanager.reward.j r0, long r1) {
            r0.f2186m = r1
            return r1
    }

    @com.bytedance.component.sdk.annotation.DungeonFlag
    private java.lang.String j(boolean r6) {
            r5 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "sdk_version"
            java.lang.String r2 = com.bytedance.msdk.xt.xt.xt()     // Catch: org.json.JSONException -> L4f
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L4f
            java.lang.String r1 = "plugin_version"
            java.lang.String r2 = com.bytedance.msdk.xt.xt.r()     // Catch: org.json.JSONException -> L4f
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L4f
            java.lang.String r1 = "user_agent"
            java.lang.String r2 = com.bytedance.msdk.xt.xt.j     // Catch: org.json.JSONException -> L4f
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L4f
            java.lang.String r1 = "try_value"
            java.util.concurrent.atomic.AtomicInteger r2 = r5.j     // Catch: org.json.JSONException -> L4f
            int r2 = r2.getAndIncrement()     // Catch: org.json.JSONException -> L4f
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L4f
            java.lang.String r1 = "network"
            int r2 = com.bytedance.msdk.tl.x.up()     // Catch: org.json.JSONException -> L4f
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L4f
            java.lang.String r1 = "play_start_ts"
            long r2 = r5.az     // Catch: org.json.JSONException -> L4f
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L4f
            java.lang.String r1 = "play_end_ts"
            long r2 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L4f
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L4f
            java.lang.String r1 = "user_id"
            com.bytedance.msdk.api.j.xt r2 = r5.jy     // Catch: org.json.JSONException -> L4f
            java.lang.String r3 = ""
            if (r2 == 0) goto L52
            java.lang.String r2 = r2.gq()     // Catch: org.json.JSONException -> L4f
            goto L53
        L4f:
            r1 = move-exception
            goto L10f
        L52:
            r2 = r3
        L53:
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L4f
            java.lang.String r1 = "trans_id"
            java.lang.String r2 = r5.av     // Catch: org.json.JSONException -> L4f
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: org.json.JSONException -> L4f
            if (r2 == 0) goto L6b
            java.util.UUID r2 = java.util.UUID.randomUUID()     // Catch: org.json.JSONException -> L4f
            java.lang.String r2 = r2.toString()     // Catch: org.json.JSONException -> L4f
            r5.av = r2     // Catch: org.json.JSONException -> L4f
            goto L6d
        L6b:
            java.lang.String r2 = r5.av     // Catch: org.json.JSONException -> L4f
        L6d:
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L4f
            java.lang.String r1 = "link_id"
            com.bytedance.msdk.api.j.xt r2 = r5.jy     // Catch: org.json.JSONException -> L4f
            if (r2 == 0) goto L7b
            java.lang.String r2 = r2.j()     // Catch: org.json.JSONException -> L4f
            goto L7c
        L7b:
            r2 = r3
        L7c:
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L4f
            java.lang.String r1 = "prime_rit"
            com.bytedance.msdk.api.j.xt r2 = r5.jy     // Catch: org.json.JSONException -> L4f
            if (r2 == 0) goto L8a
            java.lang.String r2 = r2.v()     // Catch: org.json.JSONException -> L4f
            goto L8b
        L8a:
            r2 = r3
        L8b:
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L4f
            java.lang.String r1 = "adn_rit"
            com.bytedance.msdk.xt.cw r2 = r5.ws     // Catch: org.json.JSONException -> L4f
            if (r2 == 0) goto L99
            java.lang.String r2 = r2.qa()     // Catch: org.json.JSONException -> L4f
            goto L9a
        L99:
            r2 = r3
        L9a:
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L4f
            java.lang.String r1 = "reward_name"
            com.bytedance.msdk.api.j.xt r2 = r5.jy     // Catch: org.json.JSONException -> L4f
            if (r2 == 0) goto La8
            java.lang.String r2 = r2.p()     // Catch: org.json.JSONException -> L4f
            goto La9
        La8:
            r2 = r3
        La9:
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L4f
            java.lang.String r1 = "reward_amount"
            com.bytedance.msdk.api.j.xt r2 = r5.jy     // Catch: org.json.JSONException -> L4f
            if (r2 == 0) goto Lb7
            int r2 = r2.h()     // Catch: org.json.JSONException -> L4f
            goto Lb8
        Lb7:
            r2 = 0
        Lb8:
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L4f
            java.lang.String r1 = "media_extra"
            com.bytedance.msdk.api.j.xt r2 = r5.jy     // Catch: org.json.JSONException -> L4f
            if (r2 == 0) goto Ld4
            java.util.Map r2 = r2.c()     // Catch: org.json.JSONException -> L4f
            if (r2 == 0) goto Ld4
            com.bytedance.msdk.api.j.xt r2 = r5.jy     // Catch: org.json.JSONException -> L4f
            java.util.Map r2 = r2.c()     // Catch: org.json.JSONException -> L4f
            java.lang.String r4 = "gromoreExtra"
            java.lang.Object r2 = r2.get(r4)     // Catch: org.json.JSONException -> L4f
            goto Ld5
        Ld4:
            r2 = r3
        Ld5:
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L4f
            com.bytedance.msdk.api.j.xt r1 = r5.jy     // Catch: org.json.JSONException -> L4f
            if (r1 == 0) goto Led
            java.lang.String r1 = r1.x()     // Catch: org.json.JSONException -> L4f
            if (r1 == 0) goto Led
            java.lang.String r1 = "scenario_id"
            com.bytedance.msdk.api.j.xt r2 = r5.jy     // Catch: org.json.JSONException -> L4f
            java.lang.String r2 = r2.x()     // Catch: org.json.JSONException -> L4f
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L4f
        Led:
            com.bytedance.msdk.api.j.xt r1 = r5.jy     // Catch: org.json.JSONException -> L4f
            com.bytedance.msdk.xt.cw r2 = r5.ws     // Catch: org.json.JSONException -> L4f
            r4 = 1
            com.bytedance.msdk.api.cw r1 = com.bytedance.msdk.tl.ws.j(r1, r2, r4)     // Catch: org.json.JSONException -> L4f
            java.lang.String r2 = "adn_name"
            if (r1 == 0) goto Lff
            java.lang.String r4 = r1.vl()     // Catch: org.json.JSONException -> L4f
            goto L100
        Lff:
            r4 = r3
        L100:
            r0.put(r2, r4)     // Catch: org.json.JSONException -> L4f
            java.lang.String r2 = "ecpm"
            if (r1 == 0) goto L10b
            java.lang.String r3 = r1.jy()     // Catch: org.json.JSONException -> L4f
        L10b:
            r0.put(r2, r3)     // Catch: org.json.JSONException -> L4f
            goto L112
        L10f:
            com.bytedance.sdk.component.utils.vl.j(r1)
        L112:
            if (r6 == 0) goto L119
            java.lang.String r6 = r0.toString()
            return r6
        L119:
            org.json.JSONObject r6 = com.bytedance.msdk.tl.rn.j(r0)
            java.lang.String r6 = r6.toString()
            return r6
    }

    private void j(int r3, java.lang.String r4, boolean r5) {
            r2 = this;
            if (r5 == 0) goto L5
            java.lang.String r5 = "v4Enc_reward"
            goto L7
        L5:
            java.lang.String r5 = "v2Enc_reward"
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "code = "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = "，msg = "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            r4 = 0
            r0 = 0
            com.bytedance.msdk.tl.l.j(r5, r4, r0, r3)
            return
    }

    static /* synthetic */ void j(com.bytedance.msdk.core.admanager.reward.j r0, int r1, java.lang.String r2, boolean r3) {
            r0.j(r1, r2, r3)
            return
    }

    static /* synthetic */ void j(com.bytedance.msdk.core.admanager.reward.j r0, com.bytedance.sdk.component.g.xt r1, boolean r2, long r3) {
            r0.j(r1, r2, r3)
            return
    }

    @com.bytedance.component.sdk.annotation.DungeonFlag
    private void j(com.bytedance.sdk.component.g.xt r9, boolean r10, long r11) {
            r8 = this;
            boolean r0 = r8.f2187r
            if (r0 == 0) goto L5
            return
        L5:
            r0 = -1
            java.lang.String r1 = "GROMORE_SS_REWARD_VERIFY"
            if (r9 != 0) goto L15
            java.lang.String r9 = "--==-- ServerSide verify netResponse is null"
            com.bytedance.msdk.j.up.cw.j(r1, r9)
            java.lang.String r9 = "response is null"
            r8.j(r0, r9, r10)
            return
        L15:
            int r2 = r9.j()
            boolean r3 = com.bytedance.msdk.tl.rn.j(r9)
            r4 = 20000(0x4e20, float:2.8026E-41)
            r5 = 1
            if (r3 == 0) goto L54
            byte[] r9 = r9.oq()
            java.lang.String r9 = com.bytedance.msdk.tl.rn.j(r9)
            boolean r3 = android.text.TextUtils.isEmpty(r9)
            if (r3 != 0) goto L49
            r8.qv = r4     // Catch: java.lang.Throwable -> L3b
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3b
            r1.<init>(r9)     // Catch: java.lang.Throwable -> L3b
            r8.j(r1, r10, r11)     // Catch: java.lang.Throwable -> L3b
            return
        L3b:
            r9 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r9)
            r8.qv = r5
            java.lang.String r9 = r9.getMessage()
            r8.j(r0, r9, r10)
            return
        L49:
            java.lang.String r9 = "--==-- ServerSide verify data v4 is null"
            com.bytedance.msdk.j.up.cw.j(r1, r9)
            java.lang.String r9 = "data is empty"
            r8.j(r2, r9, r10)
            return
        L54:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L8f
            java.lang.String r9 = r9.r()     // Catch: java.lang.Throwable -> L8f
            r3.<init>(r9)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r9 = "cypher"
            int r9 = r3.optInt(r9, r0)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r6 = "message"
            java.lang.String r6 = r3.optString(r6)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r7 = "code"
            int r7 = r3.optInt(r7)     // Catch: java.lang.Throwable -> L8f
            r8.qv = r7     // Catch: java.lang.Throwable -> L8f
            java.lang.String r7 = "desc"
            java.lang.String r3 = r3.optString(r7)     // Catch: java.lang.Throwable -> L8f
            r8.vl = r3     // Catch: java.lang.Throwable -> L8f
            int r3 = r8.qv     // Catch: java.lang.Throwable -> L8f
            r7 = 50001(0xc351, float:7.0066E-41)
            if (r3 != r7) goto L92
            r8.oq = r5     // Catch: java.lang.Throwable -> L8f
            java.lang.String r9 = "--==-- ServerSide verify code: 50001，请求媒体服务端失败，需要重试"
            com.bytedance.msdk.j.up.cw.j(r1, r9)     // Catch: java.lang.Throwable -> L8f
            int r9 = r8.qv     // Catch: java.lang.Throwable -> L8f
            java.lang.String r11 = r8.vl     // Catch: java.lang.Throwable -> L8f
            r8.j(r9, r11, r10)     // Catch: java.lang.Throwable -> L8f
            return
        L8f:
            r9 = move-exception
            goto L10b
        L92:
            if (r3 == 0) goto Lc3
            if (r3 == r4) goto Lc3
            r9 = 0
            r8.oq = r9     // Catch: java.lang.Throwable -> L8f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8f
            java.lang.String r11 = "--==-- ServerSide verify code: "
            r9.<init>(r11)     // Catch: java.lang.Throwable -> L8f
            int r11 = r8.qv     // Catch: java.lang.Throwable -> L8f
            r9.append(r11)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r11 = ", msg: "
            r9.append(r11)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r11 = r8.vl     // Catch: java.lang.Throwable -> L8f
            r9.append(r11)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r11 = "，不能再重试"
            r9.append(r11)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L8f
            com.bytedance.msdk.j.up.cw.j(r1, r9)     // Catch: java.lang.Throwable -> L8f
            int r9 = r8.qv     // Catch: java.lang.Throwable -> L8f
            java.lang.String r11 = r8.vl     // Catch: java.lang.Throwable -> L8f
            r8.j(r9, r11, r10)     // Catch: java.lang.Throwable -> L8f
            return
        Lc3:
            if (r9 < 0) goto L100
            boolean r3 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L8f
            if (r3 != 0) goto L100
            r1 = 2
            r2 = 0
            if (r9 != r1) goto Ldf
            java.lang.String r9 = com.bytedance.msdk.tl.rn.j(r6)     // Catch: java.lang.Throwable -> L8f
            boolean r1 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L8f
            if (r1 != 0) goto Lfc
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L8f
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L8f
            goto Lfc
        Ldf:
            if (r9 != r5) goto Lf5
            java.lang.String r9 = com.bytedance.msdk.tl.xt.j()     // Catch: java.lang.Throwable -> L8f
            java.lang.String r9 = com.bytedance.msdk.tl.j.xt(r6, r9)     // Catch: java.lang.Throwable -> L8f
            boolean r1 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L8f
            if (r1 != 0) goto Lfc
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L8f
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L8f
            goto Lfc
        Lf5:
            if (r9 != 0) goto Lfc
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L8f
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L8f
        Lfc:
            r8.j(r2, r10, r11)     // Catch: java.lang.Throwable -> L8f
            return
        L100:
            java.lang.String r9 = "--==-- ServerSide verify cypher error or message is null"
            com.bytedance.msdk.j.up.cw.j(r1, r9)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r9 = "message is null"
            r8.j(r2, r9, r10)     // Catch: java.lang.Throwable -> L8f
            return
        L10b:
            java.lang.String r9 = r9.getMessage()
            r8.j(r0, r9, r10)
            return
    }

    @com.bytedance.component.sdk.annotation.DungeonFlag
    private void j(org.json.JSONObject r9, boolean r10, long r11) {
            r8 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r11
            java.lang.String r11 = "GROMORE_SS_REWARD_VERIFY"
            if (r9 == 0) goto L5d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r2 = "--==-- data: "
            r12.<init>(r2)
            java.lang.String r2 = r9.toString()
            r12.append(r2)
            java.lang.String r12 = r12.toString()
            com.bytedance.msdk.j.up.cw.j(r11, r12)
            java.lang.String r12 = "is_verify"
            boolean r4 = r9.optBoolean(r12)
            java.lang.String r12 = "reason"
            int r7 = r9.optInt(r12)
            java.lang.String r12 = "reward_name"
            java.lang.String r6 = r9.optString(r12)
            java.lang.String r12 = "reward_amount"
            int r5 = r9.optInt(r12)
            com.bytedance.msdk.core.admanager.reward.j$5 r2 = new com.bytedance.msdk.core.admanager.reward.j$5
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            r3.ae = r2
            boolean r9 = r3.tl
            if (r9 == 0) goto L59
            com.bytedance.msdk.core.admanager.reward.j$xt r9 = r3.i
            if (r9 == 0) goto L59
            boolean r9 = r3.g
            if (r9 != 0) goto L59
            java.lang.String r9 = "--==-- verify接口请求回来，给开发者verify回调"
            com.bytedance.msdk.j.up.cw.j(r11, r9)
            r9 = 1
            r3.g = r9
            com.bytedance.msdk.core.admanager.reward.j$xt r9 = r3.i
            com.bytedance.msdk.api.cw.j r11 = r3.ae
            r9.j(r11)
        L59:
            r8.j(r10, r0)
            return
        L5d:
            r3 = r8
            java.lang.String r9 = "--==-- ServerSide verify data is null"
            com.bytedance.msdk.j.up.cw.j(r11, r9)
            r9 = -1
            java.lang.String r11 = "data is null"
            r8.j(r9, r11, r10)
            return
    }

    private void j(boolean r3, long r4) {
            r2 = this;
            if (r3 == 0) goto L5
            java.lang.String r3 = "v4Enc_reward"
            goto L7
        L5:
            java.lang.String r3 = "v2Enc_reward"
        L7:
            r0 = 1
            java.lang.String r1 = ""
            com.bytedance.msdk.tl.l.j(r3, r0, r4, r1)
            return
    }

    static /* synthetic */ boolean j(com.bytedance.msdk.core.admanager.reward.j r0) {
            boolean r0 = r0.f2187r
            return r0
    }

    static /* synthetic */ boolean j(com.bytedance.msdk.core.admanager.reward.j r0, boolean r1) {
            r0.up = r1
            return r1
    }

    static /* synthetic */ boolean jy(com.bytedance.msdk.core.admanager.reward.j r0) {
            boolean r0 = r0.up
            return r0
    }

    private void m() {
            r3 = this;
            java.lang.String r0 = "GROMORE_SS_REWARD_VERIFY"
            java.lang.String r1 = "--==-- showListen回调进来，开始计时"
            com.bytedance.msdk.j.up.cw.j(r0, r1)
            com.bytedance.msdk.core.admanager.reward.j$6 r0 = new com.bytedance.msdk.core.admanager.reward.j$6
            r0.<init>(r3)
            int r1 = r3.xt
            long r1 = (long) r1
            com.bytedance.msdk.j.up.m.j(r0, r1)
            return
    }

    static /* synthetic */ boolean m(com.bytedance.msdk.core.admanager.reward.j r0) {
            boolean r0 = r0.oq
            return r0
    }

    static /* synthetic */ int oq(com.bytedance.msdk.core.admanager.reward.j r0) {
            int r0 = r0.qv
            return r0
    }

    static /* synthetic */ java.lang.String qv(com.bytedance.msdk.core.admanager.reward.j r0) {
            java.lang.String r0 = r0.vl
            return r0
    }

    static /* synthetic */ boolean r(com.bytedance.msdk.core.admanager.reward.j r0) {
            boolean r0 = r0.g
            return r0
    }

    static /* synthetic */ boolean r(com.bytedance.msdk.core.admanager.reward.j r0, boolean r1) {
            r0.g = r1
            return r1
    }

    static /* synthetic */ com.bytedance.msdk.api.j.xt tl(com.bytedance.msdk.core.admanager.reward.j r0) {
            com.bytedance.msdk.api.j.xt r0 = r0.jy
            return r0
    }

    static /* synthetic */ long up(com.bytedance.msdk.core.admanager.reward.j r2) {
            long r0 = r2.f2186m
            return r0
    }

    static /* synthetic */ com.bytedance.msdk.xt.cw vl(com.bytedance.msdk.core.admanager.reward.j r0) {
            com.bytedance.msdk.xt.cw r0 = r0.ws
            return r0
    }

    static /* synthetic */ com.bytedance.msdk.api.cw.j xt(com.bytedance.msdk.core.admanager.reward.j r0) {
            com.bytedance.msdk.api.cw.j r0 = r0.ae
            return r0
    }

    static /* synthetic */ boolean xt(com.bytedance.msdk.core.admanager.reward.j r0, boolean r1) {
            r0.f2187r = r1
            return r1
    }

    public void cw() {
            r1 = this;
            com.bytedance.msdk.core.admanager.reward.j$2 r0 = new com.bytedance.msdk.core.admanager.reward.j$2
            r0.<init>(r1)
            com.bytedance.msdk.j.up.m.j(r0)
            return
    }

    public void j(com.bytedance.msdk.api.j.xt r3, com.bytedance.msdk.xt.cw r4) {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2.az = r0
            r2.jy = r3
            r2.ws = r4
            r2.m()
            return
    }

    public void j(com.bytedance.msdk.core.admanager.reward.j.xt r1) {
            r0 = this;
            r0.i = r1
            return
    }

    public boolean j() {
            r3 = this;
            int r0 = r3.cw
            r1 = 1
            if (r0 != r1) goto L6
            goto L7
        L6:
            r1 = 0
        L7:
            java.lang.String r0 = "--==-- 判断是否开启了M服务端激励验证： "
            java.lang.String r2 = java.lang.String.valueOf(r1)
            java.lang.String r0 = r0.concat(r2)
            java.lang.String r2 = "GROMORE_SS_REWARD_VERIFY"
            com.bytedance.msdk.j.up.cw.j(r2, r0)
            return r1
    }

    public void r() {
            r1 = this;
            com.bytedance.msdk.core.admanager.reward.j$3 r0 = new com.bytedance.msdk.core.admanager.reward.j$3
            r0.<init>(r1)
            com.bytedance.msdk.j.up.m.j(r0)
            return
    }

    public void up() {
            r1 = this;
            com.bytedance.msdk.core.admanager.reward.j$4 r0 = new com.bytedance.msdk.core.admanager.reward.j$4
            r0.<init>(r1)
            com.bytedance.msdk.j.up.m.j(r0)
            return
    }

    public void xt() {
            r1 = this;
            com.bytedance.msdk.core.admanager.reward.j$1 r0 = new com.bytedance.msdk.core.admanager.reward.j$1
            r0.<init>(r1)
            com.bytedance.msdk.j.up.m.j(r0)
            return
    }
}
