package com.bytedance.adsdk.ugeno.up;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class m {
    private com.bytedance.adsdk.ugeno.up.m.j j;
    private java.util.List<com.bytedance.adsdk.ugeno.up.m.j> xt;

    public static class j {
        private java.lang.String cw;
        private java.lang.String j;

        /* renamed from: m, reason: collision with root package name */
        private java.util.Map<java.lang.String, java.lang.Object> f1989m;

        /* renamed from: r, reason: collision with root package name */
        private java.lang.String f1990r;
        private java.util.Map<java.lang.String, java.lang.String> up;
        private java.lang.String xt;

        public j() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "global"
                r1.cw = r0
                return
        }

        public java.util.Map<java.lang.String, java.lang.String> cw() {
                r1 = this;
                java.util.Map<java.lang.String, java.lang.String> r0 = r1.up
                return r0
        }

        public void cw(java.lang.String r1) {
                r0 = this;
                r0.j = r1
                return
        }

        public java.lang.String j() {
                r1 = this;
                java.lang.String r0 = r1.cw
                return r0
        }

        public void j(java.lang.String r1) {
                r0 = this;
                r0.cw = r1
                return
        }

        public void j(java.util.Map<java.lang.String, java.lang.String> r1) {
                r0 = this;
                r0.up = r1
                return
        }

        public java.lang.String r() {
                r1 = this;
                java.lang.String r0 = r1.j
                return r0
        }

        public void r(java.lang.String r1) {
                r0 = this;
                r0.xt = r1
                return
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Action{scheme='"
                r0.<init>(r1)
                java.lang.String r1 = r3.cw
                r0.append(r1)
                r1 = 39
                r0.append(r1)
                java.lang.String r2 = ", name='"
                r0.append(r2)
                java.lang.String r2 = r3.f1990r
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", params="
                r0.append(r2)
                java.util.Map<java.lang.String, java.lang.String> r2 = r3.up
                r0.append(r2)
                java.lang.String r2 = ", host='"
                r0.append(r2)
                java.lang.String r2 = r3.xt
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", origin='"
                r0.append(r2)
                java.lang.String r2 = r3.j
                r0.append(r2)
                r0.append(r1)
                java.lang.String r1 = ", extra="
                r0.append(r1)
                java.util.Map<java.lang.String, java.lang.Object> r1 = r3.f1989m
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        public java.lang.String up() {
                r1 = this;
                java.lang.String r0 = r1.xt
                return r0
        }

        public java.lang.String xt() {
                r1 = this;
                java.lang.String r0 = r1.f1990r
                return r0
        }

        public void xt(java.lang.String r1) {
                r0 = this;
                r0.f1990r = r1
                return
        }
    }

    public m() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.bytedance.adsdk.ugeno.up.m j(org.json.JSONObject r4, org.json.JSONObject r5) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.bytedance.adsdk.ugeno.up.m r1 = new com.bytedance.adsdk.ugeno.up.m
            r1.<init>()
            java.lang.String r2 = "on"
            java.lang.String r2 = r4.optString(r2)
            java.lang.String r3 = "handlers"
            org.json.JSONArray r4 = r4.optJSONArray(r3)
            com.bytedance.adsdk.ugeno.up.m$j r2 = com.bytedance.adsdk.ugeno.up.vl.j(r2, r5)
            r1.j = r2
            if (r4 == 0) goto L43
            int r2 = r4.length()
            if (r2 > 0) goto L24
            goto L43
        L24:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2 = 0
        L2a:
            int r3 = r4.length()
            if (r2 >= r3) goto L40
            java.lang.String r3 = r4.optString(r2)
            com.bytedance.adsdk.ugeno.up.m$j r3 = com.bytedance.adsdk.ugeno.up.vl.j(r3, r5)
            if (r3 == 0) goto L3d
            r0.add(r3)
        L3d:
            int r2 = r2 + 1
            goto L2a
        L40:
            r1.xt = r0
            return r1
        L43:
            return r0
    }

    public com.bytedance.adsdk.ugeno.up.m.j j() {
            r1 = this;
            com.bytedance.adsdk.ugeno.up.m$j r0 = r1.j
            return r0
    }

    public java.util.List<com.bytedance.adsdk.ugeno.up.m.j> xt() {
            r1 = this;
            java.util.List<com.bytedance.adsdk.ugeno.up.m$j> r0 = r1.xt
            return r0
    }
}
