package com.bytedance.adsdk.lottie.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class gq {
    public gq() {
            r1 = this;
            r1.<init>()
            return
    }

    static com.bytedance.adsdk.lottie.model.xt.jy j(android.util.JsonReader r9, com.bytedance.adsdk.lottie.m r10) throws java.io.IOException {
            r0 = 0
            r1 = 0
            r3 = r0
            r4 = r3
            r2 = 0
        L5:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L52
            java.lang.String r5 = r9.nextName()
            r5.getClass()
            int r6 = r5.hashCode()
            r7 = 1
            r8 = -1
            switch(r6) {
                case 114: goto L32;
                case 3324: goto L27;
                case 3519: goto L1c;
                default: goto L1b;
            }
        L1b:
            goto L3c
        L1c:
            java.lang.String r6 = "nm"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L25
            goto L3c
        L25:
            r8 = 2
            goto L3c
        L27:
            java.lang.String r6 = "hd"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L30
            goto L3c
        L30:
            r8 = 1
            goto L3c
        L32:
            java.lang.String r6 = "r"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L3b
            goto L3c
        L3b:
            r8 = 0
        L3c:
            switch(r8) {
                case 0: goto L4d;
                case 1: goto L48;
                case 2: goto L43;
                default: goto L3f;
            }
        L3f:
            r9.skipValue()
            goto L5
        L43:
            java.lang.String r3 = r9.nextString()
            goto L5
        L48:
            boolean r2 = r9.nextBoolean()
            goto L5
        L4d:
            com.bytedance.adsdk.lottie.model.j.xt r4 = com.bytedance.adsdk.lottie.r.r.j(r9, r10, r7)
            goto L5
        L52:
            if (r2 == 0) goto L55
            return r0
        L55:
            com.bytedance.adsdk.lottie.model.xt.jy r9 = new com.bytedance.adsdk.lottie.model.xt.jy
            r9.<init>(r3, r4)
            return r9
    }
}
