package com.bytedance.adsdk.lottie.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class n {
    public n() {
            r1 = this;
            r1.<init>()
            return
    }

    static com.bytedance.adsdk.lottie.model.xt.mi j(android.util.JsonReader r10, com.bytedance.adsdk.lottie.m r11) throws java.io.IOException {
            r0 = 0
            r1 = 0
            r3 = r0
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = 0
        L8:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L88
            java.lang.String r0 = r10.nextName()
            r0.getClass()
            int r2 = r0.hashCode()
            r9 = -1
            switch(r2) {
                case 101: goto L55;
                case 109: goto L4a;
                case 111: goto L3f;
                case 115: goto L34;
                case 3324: goto L29;
                case 3519: goto L1e;
                default: goto L1d;
            }
        L1d:
            goto L5f
        L1e:
            java.lang.String r2 = "nm"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L27
            goto L5f
        L27:
            r9 = 5
            goto L5f
        L29:
            java.lang.String r2 = "hd"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L32
            goto L5f
        L32:
            r9 = 4
            goto L5f
        L34:
            java.lang.String r2 = "s"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L3d
            goto L5f
        L3d:
            r9 = 3
            goto L5f
        L3f:
            java.lang.String r2 = "o"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L48
            goto L5f
        L48:
            r9 = 2
            goto L5f
        L4a:
            java.lang.String r2 = "m"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L53
            goto L5f
        L53:
            r9 = 1
            goto L5f
        L55:
            java.lang.String r2 = "e"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L5e
            goto L5f
        L5e:
            r9 = 0
        L5f:
            switch(r9) {
                case 0: goto L83;
                case 1: goto L7a;
                case 2: goto L75;
                case 3: goto L70;
                case 4: goto L6b;
                case 5: goto L66;
                default: goto L62;
            }
        L62:
            r10.skipValue()
            goto L8
        L66:
            java.lang.String r3 = r10.nextString()
            goto L8
        L6b:
            boolean r8 = r10.nextBoolean()
            goto L8
        L70:
            com.bytedance.adsdk.lottie.model.j.xt r5 = com.bytedance.adsdk.lottie.r.r.j(r10, r11, r1)
            goto L8
        L75:
            com.bytedance.adsdk.lottie.model.j.xt r7 = com.bytedance.adsdk.lottie.r.r.j(r10, r11, r1)
            goto L8
        L7a:
            int r0 = r10.nextInt()
            com.bytedance.adsdk.lottie.model.xt.mi$j r4 = com.bytedance.adsdk.lottie.model.xt.mi.j.j(r0)
            goto L8
        L83:
            com.bytedance.adsdk.lottie.model.j.xt r6 = com.bytedance.adsdk.lottie.r.r.j(r10, r11, r1)
            goto L8
        L88:
            com.bytedance.adsdk.lottie.model.xt.mi r2 = new com.bytedance.adsdk.lottie.model.xt.mi
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r2
    }
}
