package com.bytedance.adsdk.lottie.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class uf {
    public uf() {
            r1 = this;
            r1.<init>()
            return
    }

    static com.bytedance.adsdk.lottie.model.xt.az j(android.util.JsonReader r11, com.bytedance.adsdk.lottie.m r12) throws java.io.IOException {
            r0 = 0
            r1 = 0
            r2 = 1
            r4 = r0
            r7 = r4
            r3 = 1
            r5 = 0
            r9 = 0
        L8:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L84
            java.lang.String r6 = r11.nextName()
            r6.getClass()
            int r8 = r6.hashCode()
            r10 = -1
            switch(r8) {
                case -396065730: goto L55;
                case 99: goto L4a;
                case 111: goto L3f;
                case 114: goto L34;
                case 3324: goto L29;
                case 3519: goto L1e;
                default: goto L1d;
            }
        L1d:
            goto L5f
        L1e:
            java.lang.String r8 = "nm"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L27
            goto L5f
        L27:
            r10 = 5
            goto L5f
        L29:
            java.lang.String r8 = "hd"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L32
            goto L5f
        L32:
            r10 = 4
            goto L5f
        L34:
            java.lang.String r8 = "r"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L3d
            goto L5f
        L3d:
            r10 = 3
            goto L5f
        L3f:
            java.lang.String r8 = "o"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L48
            goto L5f
        L48:
            r10 = 2
            goto L5f
        L4a:
            java.lang.String r8 = "c"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L53
            goto L5f
        L53:
            r10 = 1
            goto L5f
        L55:
            java.lang.String r8 = "fillEnabled"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L5e
            goto L5f
        L5e:
            r10 = 0
        L5f:
            switch(r10) {
                case 0: goto L7f;
                case 1: goto L7a;
                case 2: goto L75;
                case 3: goto L70;
                case 4: goto L6b;
                case 5: goto L66;
                default: goto L62;
            }
        L62:
            r11.skipValue()
            goto L8
        L66:
            java.lang.String r4 = r11.nextString()
            goto L8
        L6b:
            boolean r9 = r11.nextBoolean()
            goto L8
        L70:
            int r3 = r11.nextInt()
            goto L8
        L75:
            com.bytedance.adsdk.lottie.model.j.r r0 = com.bytedance.adsdk.lottie.r.r.xt(r11, r12)
            goto L8
        L7a:
            com.bytedance.adsdk.lottie.model.j.j r7 = com.bytedance.adsdk.lottie.r.r.ae(r11, r12)
            goto L8
        L7f:
            boolean r5 = r11.nextBoolean()
            goto L8
        L84:
            if (r0 != 0) goto L9a
            com.bytedance.adsdk.lottie.model.j.r r0 = new com.bytedance.adsdk.lottie.model.j.r
            com.bytedance.adsdk.lottie.m.j r11 = new com.bytedance.adsdk.lottie.m.j
            r12 = 100
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11.<init>(r12)
            java.util.List r11 = java.util.Collections.singletonList(r11)
            r0.<init>(r11)
        L9a:
            r8 = r0
            if (r3 != r2) goto La1
            android.graphics.Path$FillType r11 = android.graphics.Path.FillType.WINDING
        L9f:
            r6 = r11
            goto La4
        La1:
            android.graphics.Path$FillType r11 = android.graphics.Path.FillType.EVEN_ODD
            goto L9f
        La4:
            com.bytedance.adsdk.lottie.model.xt.az r3 = new com.bytedance.adsdk.lottie.model.xt.az
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
    }
}
