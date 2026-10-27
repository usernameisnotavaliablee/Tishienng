package com.bytedance.adsdk.lottie.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class ch {
    public ch() {
            r1 = this;
            r1.<init>()
            return
    }

    static com.bytedance.adsdk.lottie.model.xt.g j(android.util.JsonReader r7) throws java.io.IOException {
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = 0
        L4:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L54
            java.lang.String r4 = r7.nextName()
            r4.getClass()
            int r5 = r4.hashCode()
            r6 = -1
            switch(r5) {
                case 3324: goto L30;
                case 3488: goto L25;
                case 3519: goto L1a;
                default: goto L19;
            }
        L19:
            goto L3a
        L1a:
            java.lang.String r5 = "nm"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L23
            goto L3a
        L23:
            r6 = 2
            goto L3a
        L25:
            java.lang.String r5 = "mm"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L2e
            goto L3a
        L2e:
            r6 = 1
            goto L3a
        L30:
            java.lang.String r5 = "hd"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L39
            goto L3a
        L39:
            r6 = 0
        L3a:
            switch(r6) {
                case 0: goto L4f;
                case 1: goto L46;
                case 2: goto L41;
                default: goto L3d;
            }
        L3d:
            r7.skipValue()
            goto L4
        L41:
            java.lang.String r0 = r7.nextString()
            goto L4
        L46:
            int r2 = r7.nextInt()
            com.bytedance.adsdk.lottie.model.xt.g$j r2 = com.bytedance.adsdk.lottie.model.xt.g.j.j(r2)
            goto L4
        L4f:
            boolean r3 = r7.nextBoolean()
            goto L4
        L54:
            com.bytedance.adsdk.lottie.model.xt.g r7 = new com.bytedance.adsdk.lottie.model.xt.g
            r7.<init>(r0, r2, r3)
            return r7
    }
}
