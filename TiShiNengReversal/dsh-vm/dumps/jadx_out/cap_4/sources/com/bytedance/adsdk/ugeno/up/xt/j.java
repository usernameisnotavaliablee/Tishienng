package com.bytedance.adsdk.ugeno.up.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class j {
    public static final java.util.HashSet<java.lang.String> j = null;
    protected java.lang.String ae;
    protected com.bytedance.adsdk.ugeno.xt.cw cw;

    /* renamed from: m, reason: collision with root package name */
    protected java.util.Map<java.lang.String, java.lang.String> f1991m;

    /* renamed from: r, reason: collision with root package name */
    protected java.lang.String f1992r;
    protected java.lang.String tl;
    protected java.lang.String up;
    protected com.bytedance.adsdk.ugeno.up.m.j xt;

    /* renamed from: com.bytedance.adsdk.ugeno.up.xt.j$j, reason: collision with other inner class name */
    public static class C0192j {
        public C0192j() {
                r1 = this;
                r1.<init>()
                return
        }

        public static com.bytedance.adsdk.ugeno.up.xt.j j(com.bytedance.adsdk.ugeno.xt.cw r1, java.lang.String r2, com.bytedance.adsdk.ugeno.up.m.j r3) {
                if (r3 != 0) goto L4
                r1 = 0
                return r1
            L4:
                java.lang.String r0 = r3.xt()
                com.bytedance.adsdk.ugeno.up.xt r0 = com.bytedance.adsdk.ugeno.up.r.j(r0)
                if (r0 != 0) goto L14
                com.bytedance.adsdk.ugeno.up.xt.cw r0 = new com.bytedance.adsdk.ugeno.up.xt.cw
                r0.<init>(r1, r2, r3)
                return r0
            L14:
                com.bytedance.adsdk.ugeno.up.xt.j r0 = r0.j(r1, r2, r3)
                if (r0 != 0) goto L1f
                com.bytedance.adsdk.ugeno.up.xt.cw r0 = new com.bytedance.adsdk.ugeno.up.xt.cw
                r0.<init>(r1, r2, r3)
            L1f:
                return r0
        }
    }

    static {
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r12 = "muteVideo"
            java.lang.String r13 = "preventEvent"
            java.lang.String r1 = "convert"
            java.lang.String r2 = "dislike"
            java.lang.String r3 = "openAppPermission"
            java.lang.String r4 = "openAppPolicy"
            java.lang.String r5 = "openPrivacy"
            java.lang.String r6 = "openAppFunction"
            java.lang.String r7 = "close"
            java.lang.String r8 = "skip"
            java.lang.String r9 = "videoControl"
            java.lang.String r10 = "pauseVideo"
            java.lang.String r11 = "resumeVideo"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            com.bytedance.adsdk.ugeno.up.xt.j.j = r0
            return
    }

    public j(com.bytedance.adsdk.ugeno.xt.cw r1, java.lang.String r2, com.bytedance.adsdk.ugeno.up.m.j r3) {
            r0 = this;
            r0.<init>()
            r0.cw = r1
            r0.xt = r3
            r0.ae = r2
            r0.up()
            return
    }

    private void up() {
            r2 = this;
            com.bytedance.adsdk.ugeno.up.m$j r0 = r2.xt
            if (r0 != 0) goto L5
            goto L37
        L5:
            java.lang.String r0 = r0.j()
            r2.f1992r = r0
            com.bytedance.adsdk.ugeno.up.m$j r0 = r2.xt
            java.lang.String r0 = r0.xt()
            r2.up = r0
            com.bytedance.adsdk.ugeno.up.m$j r0 = r2.xt
            java.util.Map r0 = r0.cw()
            r2.f1991m = r0
            if (r0 == 0) goto L37
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L37
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.f1991m
            java.lang.String r1 = "emitCustomEvent"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L37
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.f1991m
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r2.tl = r0
        L37:
            return
    }

    public void cw() {
            r4 = this;
            boolean r0 = r4.r()
            if (r0 == 0) goto L30
            com.bytedance.adsdk.ugeno.up.m$j r0 = new com.bytedance.adsdk.ugeno.up.m$j
            r0.<init>()
            java.lang.String r1 = "custom"
            r0.j(r1)
            java.lang.String r1 = "emit"
            r0.xt(r1)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r2 = "name"
            java.lang.String r3 = r4.tl
            r1.put(r2, r3)
            r0.j(r1)
            com.bytedance.adsdk.ugeno.up.xt.xt r1 = new com.bytedance.adsdk.ugeno.up.xt.xt
            com.bytedance.adsdk.ugeno.xt.cw r2 = r4.cw
            java.lang.String r3 = r4.up
            r1.<init>(r2, r3, r0)
            r1.j()
        L30:
            return
    }

    public abstract void j();

    public boolean r() {
            r1 = this;
            java.lang.String r0 = r1.tl
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public void xt() {
            r0 = this;
            r0.cw()
            return
    }
}
