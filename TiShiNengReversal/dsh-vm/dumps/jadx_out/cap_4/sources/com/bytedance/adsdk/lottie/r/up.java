package com.bytedance.adsdk.lottie.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class up {
    public up() {
            r1 = this;
            r1.<init>()
            return
    }

    static com.bytedance.adsdk.lottie.model.xt.j j(android.util.JsonReader r3, com.bytedance.adsdk.lottie.m r4) throws java.io.IOException {
            r0 = 0
        L1:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2f
            java.lang.String r1 = r3.nextName()
            r1.getClass()
            java.lang.String r2 = "ef"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L1a
            r3.skipValue()
            goto L1
        L1a:
            r3.beginArray()
        L1d:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2b
            com.bytedance.adsdk.lottie.model.xt.j r1 = xt(r3, r4)
            if (r1 == 0) goto L1d
            r0 = r1
            goto L1d
        L2b:
            r3.endArray()
            goto L1
        L2f:
            return r0
    }

    private static com.bytedance.adsdk.lottie.model.xt.j xt(android.util.JsonReader r5, com.bytedance.adsdk.lottie.m r6) throws java.io.IOException {
            r5.beginObject()
            r0 = 0
            r1 = 0
        L5:
            r2 = 0
        L6:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L3f
            java.lang.String r3 = r5.nextName()
            r3.getClass()
            java.lang.String r4 = "v"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L2f
            java.lang.String r4 = "ty"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L27
            r5.skipValue()
            goto L6
        L27:
            int r2 = r5.nextInt()
            if (r2 != 0) goto L5
            r2 = 1
            goto L6
        L2f:
            if (r2 == 0) goto L3b
            com.bytedance.adsdk.lottie.model.xt.j r0 = new com.bytedance.adsdk.lottie.model.xt.j
            com.bytedance.adsdk.lottie.model.j.xt r3 = com.bytedance.adsdk.lottie.r.r.j(r5, r6)
            r0.<init>(r3)
            goto L6
        L3b:
            r5.skipValue()
            goto L6
        L3f:
            r5.endObject()
            return r0
    }
}
