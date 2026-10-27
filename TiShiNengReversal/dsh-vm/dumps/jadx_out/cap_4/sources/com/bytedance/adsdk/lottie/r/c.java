package com.bytedance.adsdk.lottie.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class c {
    public c() {
            r1 = this;
            r1.<init>()
            return
    }

    static com.bytedance.adsdk.lottie.model.xt.i j(android.util.JsonReader r8, com.bytedance.adsdk.lottie.m r9) throws java.io.IOException {
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = 0
            r4 = 0
        L5:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L61
            java.lang.String r5 = r8.nextName()
            r5.getClass()
            int r6 = r5.hashCode()
            r7 = -1
            switch(r6) {
                case 3324: goto L3c;
                case 3432: goto L31;
                case 3519: goto L26;
                case 104415: goto L1b;
                default: goto L1a;
            }
        L1a:
            goto L46
        L1b:
            java.lang.String r6 = "ind"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L24
            goto L46
        L24:
            r7 = 3
            goto L46
        L26:
            java.lang.String r6 = "nm"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L2f
            goto L46
        L2f:
            r7 = 2
            goto L46
        L31:
            java.lang.String r6 = "ks"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L3a
            goto L46
        L3a:
            r7 = 1
            goto L46
        L3c:
            java.lang.String r6 = "hd"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L45
            goto L46
        L45:
            r7 = 0
        L46:
            switch(r7) {
                case 0: goto L5c;
                case 1: goto L57;
                case 2: goto L52;
                case 3: goto L4d;
                default: goto L49;
            }
        L49:
            r8.skipValue()
            goto L5
        L4d:
            int r3 = r8.nextInt()
            goto L5
        L52:
            java.lang.String r0 = r8.nextString()
            goto L5
        L57:
            com.bytedance.adsdk.lottie.model.j.tl r2 = com.bytedance.adsdk.lottie.r.r.up(r8, r9)
            goto L5
        L5c:
            boolean r4 = r8.nextBoolean()
            goto L5
        L61:
            com.bytedance.adsdk.lottie.model.xt.i r8 = new com.bytedance.adsdk.lottie.model.xt.i
            r8.<init>(r0, r3, r2, r4)
            return r8
    }
}
