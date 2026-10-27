package com.bytedance.msdk.core.oq;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j {
    private com.bytedance.msdk.api.r.j.xt.cw.xt cw;
    private java.lang.String j;
    private java.lang.String xt;

    public j(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            r0.xt = r2
            com.bytedance.msdk.api.r.j.xt.cw.xt r1 = new com.bytedance.msdk.api.r.j.xt.cw.xt
            r1.<init>()
            r0.cw = r1
            return
    }

    public j(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25) {
            r13 = this;
            r13.<init>()
            r13.j = r15
            r3 = r16
            r13.xt = r3
            com.bytedance.msdk.api.r.j.xt.cw.xt r0 = new com.bytedance.msdk.api.r.j.xt.cw.xt
            r1 = r14
            r2 = r15
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r12 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.cw = r0
            return
    }

    public static com.bytedance.msdk.core.oq.j j(java.lang.String r14, org.json.JSONObject r15) {
            if (r15 == 0) goto L59
            java.lang.String r0 = "app_id"
            java.lang.String r3 = r15.optString(r0)
            java.lang.String r0 = "app_key"
            java.lang.String r4 = r15.optString(r0)
            java.lang.String r0 = "custom_type"
            java.lang.String r13 = r15.optString(r0)
            java.lang.String r0 = "1"
            boolean r0 = android.text.TextUtils.equals(r13, r0)
            if (r0 != 0) goto L22
            com.bytedance.msdk.core.oq.j r14 = new com.bytedance.msdk.core.oq.j
            r14.<init>(r3, r4)
            return r14
        L22:
            java.lang.String r0 = "init_class_name"
            java.lang.String r5 = r15.optString(r0)
            java.lang.String r0 = "banner_class_name"
            java.lang.String r6 = r15.optString(r0)
            java.lang.String r0 = "interstitial_class_name"
            java.lang.String r7 = r15.optString(r0)
            java.lang.String r0 = "reward_class_name"
            java.lang.String r8 = r15.optString(r0)
            java.lang.String r0 = "full_video_class_name"
            java.lang.String r9 = r15.optString(r0)
            java.lang.String r0 = "splash_class_name"
            java.lang.String r10 = r15.optString(r0)
            java.lang.String r0 = "feed_class_name"
            java.lang.String r11 = r15.optString(r0)
            java.lang.String r0 = "draw_class_name"
            java.lang.String r12 = r15.optString(r0)
            com.bytedance.msdk.core.oq.j r1 = new com.bytedance.msdk.core.oq.j
            r2 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r1
        L59:
            r14 = 0
            return r14
    }

    public com.bytedance.msdk.api.r.j.xt.cw.xt cw() {
            r1 = this;
            com.bytedance.msdk.api.r.j.xt.cw.xt r0 = r1.cw
            return r0
    }

    public java.lang.String j() {
            r1 = this;
            java.lang.String r0 = r1.j
            return r0
    }

    public boolean r() {
            r1 = this;
            com.bytedance.msdk.api.r.j.xt.cw.xt r0 = r1.cw
            if (r0 == 0) goto Lc
            boolean r0 = r0.r()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AdNetworkConfValue{mAppId='"
            r0.<init>(r1)
            java.lang.String r1 = r3.j
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", mAppKey='"
            r0.append(r2)
            java.lang.String r2 = r3.xt
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ", mGMCustomConfig="
            r0.append(r1)
            com.bytedance.msdk.api.r.j.xt.cw.xt r1 = r3.cw
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String up() {
            r1 = this;
            com.bytedance.msdk.api.r.j.xt.cw.xt r0 = r1.cw
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.xt()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public java.lang.String xt() {
            r1 = this;
            java.lang.String r0 = r1.xt
            return r0
    }
}
