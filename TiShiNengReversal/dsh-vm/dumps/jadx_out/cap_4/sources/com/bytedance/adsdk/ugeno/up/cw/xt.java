package com.bytedance.adsdk.ugeno.up.cw;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class xt {
    protected java.lang.String ae;
    protected com.bytedance.adsdk.ugeno.up.m cw;
    protected java.lang.String g;
    protected com.bytedance.adsdk.ugeno.up.qv j;

    /* renamed from: m, reason: collision with root package name */
    protected java.lang.String f1985m;
    protected android.content.Context oq;

    /* renamed from: r, reason: collision with root package name */
    protected com.bytedance.adsdk.ugeno.up.m.j f1986r;
    protected java.lang.String tl;
    protected java.util.Map<java.lang.String, java.lang.String> up;
    protected com.bytedance.adsdk.ugeno.xt.cw xt;

    public static class j {
        public j() {
                r1 = this;
                r1.<init>()
                return
        }

        public static com.bytedance.adsdk.ugeno.up.cw.xt j(android.content.Context r3, com.bytedance.adsdk.ugeno.xt.cw r4, org.json.JSONObject r5, org.json.JSONObject r6) {
                r0 = 0
                if (r4 == 0) goto L60
                if (r5 != 0) goto L6
                goto L60
            L6:
                com.bytedance.adsdk.ugeno.up.m r5 = com.bytedance.adsdk.ugeno.up.m.j(r5, r6)
                if (r5 != 0) goto Ld
                return r0
            Ld:
                com.bytedance.adsdk.ugeno.up.m$j r6 = r5.j()
                if (r6 != 0) goto L14
                return r0
            L14:
                java.lang.String r1 = r6.j()
                java.lang.String r2 = "custom"
                boolean r2 = android.text.TextUtils.equals(r1, r2)
                if (r2 == 0) goto L2f
                com.bytedance.adsdk.ugeno.up.cw.cw r6 = new com.bytedance.adsdk.ugeno.up.cw.cw
                r6.<init>(r3)
                r6.j(r4)
                r6.j(r5)
                r6.m()
                return r6
            L2f:
                boolean r2 = android.text.TextUtils.isEmpty(r1)
                if (r2 != 0) goto L47
                java.lang.String r2 = "global"
                boolean r1 = android.text.TextUtils.equals(r1, r2)
                if (r1 == 0) goto L3e
                goto L47
            L3e:
                java.lang.String r6 = r6.up()
                com.bytedance.adsdk.ugeno.up.ae r6 = com.bytedance.adsdk.ugeno.up.oq.j(r6)
                goto L4f
            L47:
                java.lang.String r6 = r6.xt()
                com.bytedance.adsdk.ugeno.up.ae r6 = com.bytedance.adsdk.ugeno.up.oq.j(r6)
            L4f:
                if (r6 != 0) goto L52
                return r0
            L52:
                com.bytedance.adsdk.ugeno.up.cw.xt r3 = r6.j(r3)
                r3.j(r4)
                r3.j(r5)
                r3.m()
                return r3
            L60:
                return r0
        }
    }

    public xt(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.oq = r1
            return
    }

    public java.lang.String ae() {
            r1 = this;
            java.lang.String r0 = r1.f1985m
            return r0
    }

    public void j(com.bytedance.adsdk.ugeno.up.m r1) {
            r0 = this;
            r0.cw = r1
            return
    }

    public void j(com.bytedance.adsdk.ugeno.up.qv r1) {
            r0 = this;
            r0.j = r1
            return
    }

    public void j(com.bytedance.adsdk.ugeno.xt.cw r1) {
            r0 = this;
            r0.xt = r1
            return
    }

    public abstract boolean j(java.lang.Object... r1);

    public void m() {
            r1 = this;
            com.bytedance.adsdk.ugeno.up.m r0 = r1.cw
            com.bytedance.adsdk.ugeno.up.m$j r0 = r0.j()
            r1.f1986r = r0
            com.bytedance.adsdk.ugeno.up.m r0 = r1.cw
            if (r0 != 0) goto Ld
            goto L15
        Ld:
            com.bytedance.adsdk.ugeno.up.m$j r0 = r0.j()
            r1.f1986r = r0
            if (r0 != 0) goto L16
        L15:
            return
        L16:
            java.util.Map r0 = r0.cw()
            r1.up = r0
            com.bytedance.adsdk.ugeno.up.m$j r0 = r1.f1986r
            java.lang.String r0 = r0.xt()
            r1.f1985m = r0
            com.bytedance.adsdk.ugeno.up.m$j r0 = r1.f1986r
            java.lang.String r0 = r0.j()
            r1.ae = r0
            com.bytedance.adsdk.ugeno.up.m$j r0 = r1.f1986r
            java.lang.String r0 = r0.r()
            r1.tl = r0
            com.bytedance.adsdk.ugeno.up.m$j r0 = r1.f1986r
            java.lang.String r0 = r0.up()
            r1.g = r0
            return
    }

    public java.lang.String tl() {
            r1 = this;
            java.lang.String r0 = r1.tl
            return r0
    }
}
