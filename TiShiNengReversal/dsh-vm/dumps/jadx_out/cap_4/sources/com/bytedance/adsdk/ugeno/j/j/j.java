package com.bytedance.adsdk.ugeno.j.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class j {
    private java.lang.String cw;
    protected org.json.JSONObject j;
    protected com.bytedance.adsdk.ugeno.xt.cw xt;

    /* renamed from: com.bytedance.adsdk.ugeno.j.j.j$j, reason: collision with other inner class name */
    public static class C0189j {
        public C0189j() {
                r1 = this;
                r1.<init>()
                return
        }

        public static com.bytedance.adsdk.ugeno.j.j.j j(com.bytedance.adsdk.ugeno.xt.cw r4, org.json.JSONObject r5) {
                r0 = 0
                if (r4 == 0) goto L5e
                if (r5 != 0) goto L6
                goto L5e
            L6:
                java.lang.String r1 = "type"
                java.lang.String r1 = r5.optString(r1)
                r1.getClass()
                int r2 = r1.hashCode()
                r3 = -1
                switch(r2) {
                    case -1881872635: goto L39;
                    case -930826704: goto L2e;
                    case -920177947: goto L23;
                    case 109407595: goto L18;
                    default: goto L17;
                }
            L17:
                goto L43
            L18:
                java.lang.String r2 = "shine"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L21
                goto L43
            L21:
                r3 = 3
                goto L43
            L23:
                java.lang.String r2 = "rub_in"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L2c
                goto L43
            L2c:
                r3 = 2
                goto L43
            L2e:
                java.lang.String r2 = "ripple"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L37
                goto L43
            L37:
                r3 = 1
                goto L43
            L39:
                java.lang.String r2 = "stretch"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L42
                goto L43
            L42:
                r3 = 0
            L43:
                switch(r3) {
                    case 0: goto L59;
                    case 1: goto L53;
                    case 2: goto L4d;
                    case 3: goto L47;
                    default: goto L46;
                }
            L46:
                return r0
            L47:
                com.bytedance.adsdk.ugeno.j.j.r r0 = new com.bytedance.adsdk.ugeno.j.j.r
                r0.<init>(r4, r5)
                return r0
            L4d:
                com.bytedance.adsdk.ugeno.j.j.cw r0 = new com.bytedance.adsdk.ugeno.j.j.cw
                r0.<init>(r4, r5)
                return r0
            L53:
                com.bytedance.adsdk.ugeno.j.j.xt r0 = new com.bytedance.adsdk.ugeno.j.j.xt
                r0.<init>(r4, r5)
                return r0
            L59:
                com.bytedance.adsdk.ugeno.j.j.up r0 = new com.bytedance.adsdk.ugeno.j.j.up
                r0.<init>(r4, r5)
            L5e:
                return r0
        }
    }

    public j(com.bytedance.adsdk.ugeno.xt.cw r1, org.json.JSONObject r2) {
            r0 = this;
            r0.<init>()
            r0.j = r2
            r0.xt = r1
            r0.j()
            return
    }

    public abstract java.util.List<android.animation.PropertyValuesHolder> cw();

    public void j() {
            r2 = this;
            org.json.JSONObject r0 = r2.j
            java.lang.String r1 = "type"
            java.lang.String r0 = r0.optString(r1)
            r2.cw = r0
            r2.xt()
            return
    }

    public abstract void j(int r1, int r2);

    public abstract void j(android.graphics.Canvas r1);

    public java.lang.String r() {
            r1 = this;
            java.lang.String r0 = r1.cw
            return r0
    }

    public abstract void xt();
}
