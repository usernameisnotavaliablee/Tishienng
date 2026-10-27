package com.bytedance.msdk.core;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class cw {
    private static java.lang.String j;
    private static java.lang.String xt;

    static {
            return
    }

    public cw() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String cw() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = up()
            r0.append(r1)
            java.lang.String r1 = "/api/ad/union/mediation/exchange/"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = com.bytedance.msdk.tl.gq.j(r0)
            return r0
    }

    public static java.lang.String j() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = up()
            r0.append(r1)
            java.lang.String r1 = "/api/ad/union/mediation/config/"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = com.bytedance.msdk.tl.gq.j(r0)
            return r0
    }

    private static java.lang.String m() {
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.ae.j.j()
            java.lang.String r1 = "server_dist_host"
            java.lang.String r0 = r0.xt(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 == 0) goto L12
            return r2
        L12:
            java.lang.String r1 = com.bytedance.msdk.core.cw.j
            boolean r1 = android.text.TextUtils.equals(r0, r1)
            if (r1 == 0) goto L25
            java.lang.String r1 = com.bytedance.msdk.core.cw.xt
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L25
            java.lang.String r0 = com.bytedance.msdk.core.cw.xt
            return r0
        L25:
            com.bytedance.msdk.core.cw.j = r0
            com.bytedance.msdk.core.cw.xt = r2
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L3b
            java.lang.String r0 = com.bytedance.msdk.core.cw.j
            java.lang.String r1 = com.bytedance.msdk.tl.xt.j()
            java.lang.String r0 = com.bytedance.msdk.tl.j.xt(r0, r1)
            com.bytedance.msdk.core.cw.xt = r0
        L3b:
            java.lang.String r0 = com.bytedance.msdk.core.cw.xt
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L44
            return r2
        L44:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "https://"
            r0.<init>(r1)
            java.lang.String r1 = com.bytedance.msdk.core.cw.xt
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.core.cw.xt = r0
            return r0
    }

    public static java.lang.String r() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = up()
            r0.append(r1)
            java.lang.String r1 = "/api/ad/union/mediation/reward_video/reward/"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = com.bytedance.msdk.tl.gq.j(r0)
            return r0
    }

    private static java.lang.String up() {
            java.lang.String r0 = m()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto Lb
            return r0
        Lb:
            java.lang.String r0 = "https://gromore.pangolin-sdk-toutiao.com"
            return r0
    }

    public static java.lang.String xt() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "https://"
            r0.<init>(r1)
            com.bytedance.msdk.core.ws.cw r1 = com.bytedance.msdk.core.xt.xt()
            java.lang.String r1 = r1.qv()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = com.bytedance.msdk.tl.gq.j(r0)
            return r0
    }
}
