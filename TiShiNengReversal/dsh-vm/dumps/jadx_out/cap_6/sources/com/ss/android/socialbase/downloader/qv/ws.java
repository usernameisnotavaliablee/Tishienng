package com.ss.android.socialbase.downloader.qv;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ws {
    private final org.json.JSONObject j;
    private int xt;

    private ws(org.json.JSONObject r1) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            return
    }

    private int av() {
            r3 = this;
            org.json.JSONObject r0 = r3.j
            java.lang.String r1 = "url_balance"
            r2 = 2
            int r0 = r0.optInt(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public static com.ss.android.socialbase.downloader.qv.ws j(@androidx.annotation.NonNull org.json.JSONObject r1) {
            com.ss.android.socialbase.downloader.qv.ws r0 = new com.ss.android.socialbase.downloader.qv.ws
            r0.<init>(r1)
            return r0
    }

    private int xt(int r4) {
            r3 = this;
            org.json.JSONObject r0 = r3.j
            java.lang.String r1 = "thread_count"
            r2 = 4
            int r0 = r0.optInt(r1, r2)
            r1 = 16
            if (r0 <= r1) goto Lf
            r0 = 16
        Lf:
            r1 = 1
            if (r0 > 0) goto L1a
            int r0 = r3.av()
            if (r0 <= 0) goto L19
            return r4
        L19:
            return r1
        L1a:
            int r2 = r3.av()
            if (r2 != r1) goto L25
            int r4 = java.lang.Math.min(r0, r4)
            return r4
        L25:
            return r0
    }

    public long ae() {
            r5 = this;
            org.json.JSONObject r0 = r5.j
            java.lang.String r1 = "segment_min_kb"
            r2 = 512(0x200, float:7.17E-43)
            int r0 = r0.optInt(r1, r2)
            long r0 = (long) r0
            r2 = 1024(0x400, double:5.06E-321)
            long r0 = r0 * r2
            r2 = 65536(0x10000, double:3.2379E-319)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L17
            return r2
        L17:
            return r0
    }

    public float az() {
            r4 = this;
            org.json.JSONObject r0 = r4.j
            java.lang.String r1 = "poor_speed_ratio"
            r2 = 0
            double r0 = r0.optDouble(r1, r2)
            float r0 = (float) r0
            r1 = 0
            float r0 = java.lang.Math.max(r1, r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.min(r0, r1)
            return r0
    }

    public boolean cw() {
            r2 = this;
            int r0 = r2.av()
            r1 = 1
            if (r0 != r1) goto L8
            return r1
        L8:
            r0 = 0
            return r0
    }

    public long g() {
            r5 = this;
            org.json.JSONObject r0 = r5.j
            java.lang.String r1 = "segment_max_kb"
            r2 = 0
            int r0 = r0.optInt(r1, r2)
            long r0 = (long) r0
            r2 = 1048576(0x100000, double:5.180654E-318)
            long r0 = r0 * r2
            long r2 = r5.ae()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L19
            r0 = -1
        L19:
            return r0
    }

    public int j() {
            r1 = this;
            int r0 = r1.xt
            return r0
    }

    public void j(int r1) {
            r0 = this;
            int r1 = r0.xt(r1)
            r0.xt = r1
            return
    }

    public float jy() {
            r4 = this;
            org.json.JSONObject r0 = r4.j
            java.lang.String r1 = "main_ratio"
            r2 = 0
            double r0 = r0.optDouble(r1, r2)
            float r0 = (float) r0
            return r0
    }

    public boolean m() {
            r3 = this;
            org.json.JSONObject r0 = r3.j
            java.lang.String r1 = "segment_mode"
            r2 = 1
            int r0 = r0.optInt(r1, r2)
            if (r0 != 0) goto Lc
            return r2
        Lc:
            r0 = 0
            return r0
    }

    public long oq() {
            r5 = this;
            org.json.JSONObject r0 = r5.j
            java.lang.String r1 = "connect_timeout"
            r2 = -1
            int r0 = r0.optInt(r1, r2)
            long r0 = (long) r0
            r2 = 2000(0x7d0, double:9.88E-321)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L11
            return r0
        L11:
            r0 = -1
            return r0
    }

    public long qv() {
            r5 = this;
            org.json.JSONObject r0 = r5.j
            java.lang.String r1 = "read_timeout"
            r2 = -1
            int r0 = r0.optInt(r1, r2)
            long r0 = (long) r0
            r2 = 4000(0xfa0, double:1.9763E-320)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L11
            return r0
        L11:
            r0 = -1
            return r0
    }

    public int r() {
            r3 = this;
            org.json.JSONObject r0 = r3.j
            java.lang.String r1 = "buffer_count"
            r2 = 512(0x200, float:7.17E-43)
            int r0 = r0.optInt(r1, r2)
            return r0
    }

    public long tl() {
            r5 = this;
            org.json.JSONObject r0 = r5.j
            java.lang.String r1 = "segment_min_init_mb"
            r2 = 10
            int r0 = r0.optInt(r1, r2)
            long r0 = (long) r0
            r2 = 1048576(0x100000, double:5.180654E-318)
            long r0 = r0 * r2
            r2 = 5242880(0x500000, double:2.590327E-317)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L18
            return r2
        L18:
            return r0
    }

    public int up() {
            r3 = this;
            org.json.JSONObject r0 = r3.j
            java.lang.String r1 = "buffer_size"
            r2 = 8192(0x2000, float:1.148E-41)
            int r0 = r0.optInt(r1, r2)
            return r0
    }

    public int vl() {
            r3 = this;
            org.json.JSONObject r0 = r3.j
            java.lang.String r1 = "ip_strategy"
            r2 = 0
            int r0 = r0.optInt(r1, r2)
            return r0
    }

    public int ws() {
            r3 = this;
            org.json.JSONObject r0 = r3.j
            java.lang.String r1 = "ratio_segment"
            r2 = 0
            int r0 = r0.optInt(r1, r2)
            return r0
    }

    public boolean xt() {
            r1 = this;
            int r0 = r1.av()
            if (r0 <= 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }
}
