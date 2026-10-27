package com.bytedance.adsdk.lottie.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class h {
    public h() {
            r1 = this;
            r1.<init>()
            return
    }

    static com.bytedance.adsdk.lottie.model.xt.qv j(android.util.JsonReader r9, com.bytedance.adsdk.lottie.m r10) throws java.io.IOException {
            r0 = 0
            r1 = 0
            r3 = r0
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = 0
        L7:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L73
            java.lang.String r0 = r9.nextName()
            r0.getClass()
            int r2 = r0.hashCode()
            r8 = -1
            switch(r2) {
                case 112: goto L49;
                case 114: goto L3e;
                case 115: goto L33;
                case 3324: goto L28;
                case 3519: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L53
        L1d:
            java.lang.String r2 = "nm"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L26
            goto L53
        L26:
            r8 = 4
            goto L53
        L28:
            java.lang.String r2 = "hd"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L31
            goto L53
        L31:
            r8 = 3
            goto L53
        L33:
            java.lang.String r2 = "s"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L3c
            goto L53
        L3c:
            r8 = 2
            goto L53
        L3e:
            java.lang.String r2 = "r"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L47
            goto L53
        L47:
            r8 = 1
            goto L53
        L49:
            java.lang.String r2 = "p"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L52
            goto L53
        L52:
            r8 = 0
        L53:
            switch(r8) {
                case 0: goto L6e;
                case 1: goto L69;
                case 2: goto L64;
                case 3: goto L5f;
                case 4: goto L5a;
                default: goto L56;
            }
        L56:
            r9.skipValue()
            goto L7
        L5a:
            java.lang.String r3 = r9.nextString()
            goto L7
        L5f:
            boolean r7 = r9.nextBoolean()
            goto L7
        L64:
            com.bytedance.adsdk.lottie.model.j.m r5 = com.bytedance.adsdk.lottie.r.r.cw(r9, r10)
            goto L7
        L69:
            com.bytedance.adsdk.lottie.model.j.xt r6 = com.bytedance.adsdk.lottie.r.r.j(r9, r10)
            goto L7
        L6e:
            com.bytedance.adsdk.lottie.model.j.jy r4 = com.bytedance.adsdk.lottie.r.j.xt(r9, r10)
            goto L7
        L73:
            com.bytedance.adsdk.lottie.model.xt.qv r2 = new com.bytedance.adsdk.lottie.model.xt.qv
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
    }
}
