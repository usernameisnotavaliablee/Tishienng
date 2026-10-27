package com.bytedance.adsdk.lottie.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class m {
    public m() {
            r1 = this;
            r1.<init>()
            return
    }

    static com.bytedance.adsdk.lottie.model.xt.xt j(android.util.JsonReader r10, com.bytedance.adsdk.lottie.m r11, int r12) throws java.io.IOException {
            r0 = 1
            r1 = 0
            r2 = 3
            if (r12 != r2) goto L7
            r12 = 1
            goto L8
        L7:
            r12 = 0
        L8:
            r3 = 0
            r8 = r12
            r5 = r3
            r6 = r5
            r7 = r6
            r9 = 0
        Le:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L7f
            java.lang.String r12 = r10.nextName()
            r12.getClass()
            int r3 = r12.hashCode()
            r4 = -1
            switch(r3) {
                case 100: goto L50;
                case 112: goto L45;
                case 115: goto L3a;
                case 3324: goto L2f;
                case 3519: goto L24;
                default: goto L23;
            }
        L23:
            goto L5a
        L24:
            java.lang.String r3 = "nm"
            boolean r12 = r12.equals(r3)
            if (r12 != 0) goto L2d
            goto L5a
        L2d:
            r4 = 4
            goto L5a
        L2f:
            java.lang.String r3 = "hd"
            boolean r12 = r12.equals(r3)
            if (r12 != 0) goto L38
            goto L5a
        L38:
            r4 = 3
            goto L5a
        L3a:
            java.lang.String r3 = "s"
            boolean r12 = r12.equals(r3)
            if (r12 != 0) goto L43
            goto L5a
        L43:
            r4 = 2
            goto L5a
        L45:
            java.lang.String r3 = "p"
            boolean r12 = r12.equals(r3)
            if (r12 != 0) goto L4e
            goto L5a
        L4e:
            r4 = 1
            goto L5a
        L50:
            java.lang.String r3 = "d"
            boolean r12 = r12.equals(r3)
            if (r12 != 0) goto L59
            goto L5a
        L59:
            r4 = 0
        L5a:
            switch(r4) {
                case 0: goto L75;
                case 1: goto L70;
                case 2: goto L6b;
                case 3: goto L66;
                case 4: goto L61;
                default: goto L5d;
            }
        L5d:
            r10.skipValue()
            goto Le
        L61:
            java.lang.String r5 = r10.nextString()
            goto Le
        L66:
            boolean r9 = r10.nextBoolean()
            goto Le
        L6b:
            com.bytedance.adsdk.lottie.model.j.m r7 = com.bytedance.adsdk.lottie.r.r.cw(r10, r11)
            goto Le
        L70:
            com.bytedance.adsdk.lottie.model.j.jy r6 = com.bytedance.adsdk.lottie.r.j.xt(r10, r11)
            goto Le
        L75:
            int r12 = r10.nextInt()
            if (r12 != r2) goto L7d
            r8 = 1
            goto Le
        L7d:
            r8 = 0
            goto Le
        L7f:
            com.bytedance.adsdk.lottie.model.xt.xt r4 = new com.bytedance.adsdk.lottie.model.xt.xt
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
    }
}
