package com.bytedance.adsdk.lottie.model.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class mi implements com.bytedance.adsdk.lottie.model.xt.cw {
    private final com.bytedance.adsdk.lottie.model.j.xt cw;
    private final java.lang.String j;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f1869m;

    /* renamed from: r, reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.model.j.xt f1870r;
    private final com.bytedance.adsdk.lottie.model.j.xt up;
    private final com.bytedance.adsdk.lottie.model.xt.mi.j xt;

    public enum j extends java.lang.Enum<com.bytedance.adsdk.lottie.model.xt.mi.j> {
        private static final /* synthetic */ com.bytedance.adsdk.lottie.model.xt.mi.j[] cw = null;
        public static final com.bytedance.adsdk.lottie.model.xt.mi.j j = null;
        public static final com.bytedance.adsdk.lottie.model.xt.mi.j xt = null;

        static {
                com.bytedance.adsdk.lottie.model.xt.mi$j r0 = new com.bytedance.adsdk.lottie.model.xt.mi$j
                java.lang.String r1 = "SIMULTANEOUSLY"
                r2 = 0
                r0.<init>(r1, r2)
                com.bytedance.adsdk.lottie.model.xt.mi.j.j = r0
                com.bytedance.adsdk.lottie.model.xt.mi$j r1 = new com.bytedance.adsdk.lottie.model.xt.mi$j
                java.lang.String r3 = "INDIVIDUALLY"
                r4 = 1
                r1.<init>(r3, r4)
                com.bytedance.adsdk.lottie.model.xt.mi.j.xt = r1
                r3 = 2
                com.bytedance.adsdk.lottie.model.xt.mi$j[] r3 = new com.bytedance.adsdk.lottie.model.xt.mi.j[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.bytedance.adsdk.lottie.model.xt.mi.j.cw = r3
                return
        }

        j(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.bytedance.adsdk.lottie.model.xt.mi.j j(int r2) {
                r0 = 1
                if (r2 == r0) goto L19
                r0 = 2
                if (r2 != r0) goto L9
                com.bytedance.adsdk.lottie.model.xt.mi$j r2 = com.bytedance.adsdk.lottie.model.xt.mi.j.xt
                return r2
            L9:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Unknown trim path type "
                java.lang.String r2 = java.lang.String.valueOf(r2)
                java.lang.String r2 = r1.concat(r2)
                r0.<init>(r2)
                throw r0
            L19:
                com.bytedance.adsdk.lottie.model.xt.mi$j r2 = com.bytedance.adsdk.lottie.model.xt.mi.j.j
                return r2
        }

        public static com.bytedance.adsdk.lottie.model.xt.mi.j valueOf(java.lang.String r1) {
                java.lang.Class<com.bytedance.adsdk.lottie.model.xt.mi$j> r0 = com.bytedance.adsdk.lottie.model.xt.mi.j.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.bytedance.adsdk.lottie.model.xt.mi$j r1 = (com.bytedance.adsdk.lottie.model.xt.mi.j) r1
                return r1
        }

        public static com.bytedance.adsdk.lottie.model.xt.mi.j[] values() {
                com.bytedance.adsdk.lottie.model.xt.mi$j[] r0 = com.bytedance.adsdk.lottie.model.xt.mi.j.cw
                java.lang.Object r0 = r0.clone()
                com.bytedance.adsdk.lottie.model.xt.mi$j[] r0 = (com.bytedance.adsdk.lottie.model.xt.mi.j[]) r0
                return r0
        }
    }

    public mi(java.lang.String r1, com.bytedance.adsdk.lottie.model.xt.mi.j r2, com.bytedance.adsdk.lottie.model.j.xt r3, com.bytedance.adsdk.lottie.model.j.xt r4, com.bytedance.adsdk.lottie.model.j.xt r5, boolean r6) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            r0.xt = r2
            r0.cw = r3
            r0.f1870r = r4
            r0.up = r5
            r0.f1869m = r6
            return
    }

    public com.bytedance.adsdk.lottie.model.j.xt cw() {
            r1 = this;
            com.bytedance.adsdk.lottie.model.j.xt r0 = r1.cw
            return r0
    }

    public com.bytedance.adsdk.lottie.model.xt.mi.j getType() {
            r1 = this;
            com.bytedance.adsdk.lottie.model.xt.mi$j r0 = r1.xt
            return r0
    }

    @Override // com.bytedance.adsdk.lottie.model.xt.cw
    public com.bytedance.adsdk.lottie.j.j.cw j(com.bytedance.adsdk.lottie.tl r1, com.bytedance.adsdk.lottie.m r2, com.bytedance.adsdk.lottie.model.layer.cw r3) {
            r0 = this;
            com.bytedance.adsdk.lottie.j.j.tj r1 = new com.bytedance.adsdk.lottie.j.j.tj
            r1.<init>(r3, r0)
            return r1
    }

    public java.lang.String j() {
            r1 = this;
            java.lang.String r0 = r1.j
            return r0
    }

    public com.bytedance.adsdk.lottie.model.j.xt r() {
            r1 = this;
            com.bytedance.adsdk.lottie.model.j.xt r0 = r1.up
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Trim Path: {start: "
            r0.<init>(r1)
            com.bytedance.adsdk.lottie.model.j.xt r1 = r2.cw
            r0.append(r1)
            java.lang.String r1 = ", end: "
            r0.append(r1)
            com.bytedance.adsdk.lottie.model.j.xt r1 = r2.f1870r
            r0.append(r1)
            java.lang.String r1 = ", offset: "
            r0.append(r1)
            com.bytedance.adsdk.lottie.model.j.xt r1 = r2.up
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public boolean up() {
            r1 = this;
            boolean r0 = r1.f1869m
            return r0
    }

    public com.bytedance.adsdk.lottie.model.j.xt xt() {
            r1 = this;
            com.bytedance.adsdk.lottie.model.j.xt r0 = r1.f1870r
            return r0
    }
}
