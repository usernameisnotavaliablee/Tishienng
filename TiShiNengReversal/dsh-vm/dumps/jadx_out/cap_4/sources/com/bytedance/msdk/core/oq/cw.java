package com.bytedance.msdk.core.oq;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class cw {
    private double ae;
    private java.lang.String cw;
    private java.lang.String j;

    /* renamed from: m, reason: collision with root package name */
    private double f2221m;

    /* renamed from: r, reason: collision with root package name */
    private int f2222r;
    private java.lang.String up;
    private java.lang.String xt;

    public cw(java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4, java.lang.String r5, double r6, double r8) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            r0.xt = r2
            r0.cw = r3
            r0.f2222r = r4
            r0.up = r5
            r0.f2221m = r6
            r0.ae = r8
            return
    }

    public static com.bytedance.msdk.core.oq.cw j(java.lang.String r11, org.json.JSONObject r12) {
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L34
            if (r12 != 0) goto L9
            goto L34
        L9:
            com.bytedance.msdk.core.oq.cw r1 = new com.bytedance.msdk.core.oq.cw
            java.lang.String r0 = "label_name"
            java.lang.String r3 = r12.optString(r0)
            java.lang.String r0 = "timestamp"
            java.lang.String r4 = r12.optString(r0)
            java.lang.String r0 = "label_id"
            int r5 = r12.optInt(r0)
            java.lang.String r0 = "label_version"
            java.lang.String r6 = r12.optString(r0)
            java.lang.String r0 = "upper_bound"
            double r7 = r12.optDouble(r0)
            java.lang.String r0 = "lower_bound"
            double r9 = r12.optDouble(r0)
            r2 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r9)
            return r1
        L34:
            r11 = 0
            return r11
    }

    public int cw() {
            r1 = this;
            int r0 = r1.f2222r
            return r0
    }

    public java.lang.String j() {
            r1 = this;
            java.lang.String r0 = r1.xt
            return r0
    }

    public double m() {
            r2 = this;
            double r0 = r2.ae
            return r0
    }

    public java.lang.String r() {
            r1 = this;
            java.lang.String r0 = r1.up
            return r0
    }

    public double up() {
            r2 = this;
            double r0 = r2.f2221m
            return r0
    }

    public java.lang.String xt() {
            r1 = this;
            java.lang.String r0 = r1.cw
            return r0
    }
}
