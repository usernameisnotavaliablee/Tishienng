package com.bytedance.adsdk.lottie.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class ed {
    public ed() {
            r1 = this;
            r1.<init>()
            return
    }

    static com.bytedance.adsdk.lottie.model.xt.av j(android.util.JsonReader r7, com.bytedance.adsdk.lottie.m r8) throws java.io.IOException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
            r3 = 0
        L8:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L66
            java.lang.String r4 = r7.nextName()
            r4.getClass()
            int r5 = r4.hashCode()
            r6 = -1
            switch(r5) {
                case 3324: goto L34;
                case 3371: goto L29;
                case 3519: goto L1e;
                default: goto L1d;
            }
        L1d:
            goto L3e
        L1e:
            java.lang.String r5 = "nm"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L27
            goto L3e
        L27:
            r6 = 2
            goto L3e
        L29:
            java.lang.String r5 = "it"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L32
            goto L3e
        L32:
            r6 = 1
            goto L3e
        L34:
            java.lang.String r5 = "hd"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L3d
            goto L3e
        L3d:
            r6 = 0
        L3e:
            switch(r6) {
                case 0: goto L61;
                case 1: goto L4a;
                case 2: goto L45;
                default: goto L41;
            }
        L41:
            r7.skipValue()
            goto L8
        L45:
            java.lang.String r1 = r7.nextString()
            goto L8
        L4a:
            r7.beginArray()
        L4d:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L5d
            com.bytedance.adsdk.lottie.model.xt.cw r4 = com.bytedance.adsdk.lottie.r.tl.j(r7, r8)
            if (r4 == 0) goto L4d
            r0.add(r4)
            goto L4d
        L5d:
            r7.endArray()
            goto L8
        L61:
            boolean r3 = r7.nextBoolean()
            goto L8
        L66:
            com.bytedance.adsdk.lottie.model.xt.av r7 = new com.bytedance.adsdk.lottie.model.xt.av
            r7.<init>(r1, r0, r3)
            return r7
    }
}
