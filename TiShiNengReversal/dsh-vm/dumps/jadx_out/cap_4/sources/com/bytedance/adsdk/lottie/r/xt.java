package com.bytedance.adsdk.lottie.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt {
    public xt() {
            r1 = this;
            r1.<init>()
            return
    }

    public static com.bytedance.adsdk.lottie.model.j.qv j(android.util.JsonReader r4, com.bytedance.adsdk.lottie.m r5) throws java.io.IOException {
            r4.beginObject()
            r0 = 0
            r1 = r0
        L5:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L23
            java.lang.String r2 = r4.nextName()
            r2.getClass()
            java.lang.String r3 = "a"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1e
            r4.skipValue()
            goto L5
        L1e:
            com.bytedance.adsdk.lottie.model.j.qv r1 = xt(r4, r5)
            goto L5
        L23:
            r4.endObject()
            if (r1 != 0) goto L2e
            com.bytedance.adsdk.lottie.model.j.qv r4 = new com.bytedance.adsdk.lottie.model.j.qv
            r4.<init>(r0, r0, r0, r0)
            return r4
        L2e:
            return r1
    }

    private static com.bytedance.adsdk.lottie.model.j.qv xt(android.util.JsonReader r7, com.bytedance.adsdk.lottie.m r8) throws java.io.IOException {
            r7.beginObject()
            r0 = 0
            r1 = r0
            r2 = r1
            r3 = r2
        L7:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L63
            java.lang.String r4 = r7.nextName()
            r4.getClass()
            int r5 = r4.hashCode()
            r6 = -1
            switch(r5) {
                case 116: goto L3e;
                case 3261: goto L33;
                case 3664: goto L28;
                case 3684: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L48
        L1d:
            java.lang.String r5 = "sw"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L26
            goto L48
        L26:
            r6 = 3
            goto L48
        L28:
            java.lang.String r5 = "sc"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L31
            goto L48
        L31:
            r6 = 2
            goto L48
        L33:
            java.lang.String r5 = "fc"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L3c
            goto L48
        L3c:
            r6 = 1
            goto L48
        L3e:
            java.lang.String r5 = "t"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L47
            goto L48
        L47:
            r6 = 0
        L48:
            switch(r6) {
                case 0: goto L5e;
                case 1: goto L59;
                case 2: goto L54;
                case 3: goto L4f;
                default: goto L4b;
            }
        L4b:
            r7.skipValue()
            goto L7
        L4f:
            com.bytedance.adsdk.lottie.model.j.xt r2 = com.bytedance.adsdk.lottie.r.r.j(r7, r8)
            goto L7
        L54:
            com.bytedance.adsdk.lottie.model.j.j r1 = com.bytedance.adsdk.lottie.r.r.ae(r7, r8)
            goto L7
        L59:
            com.bytedance.adsdk.lottie.model.j.j r0 = com.bytedance.adsdk.lottie.r.r.ae(r7, r8)
            goto L7
        L5e:
            com.bytedance.adsdk.lottie.model.j.xt r3 = com.bytedance.adsdk.lottie.r.r.j(r7, r8)
            goto L7
        L63:
            r7.endObject()
            com.bytedance.adsdk.lottie.model.j.qv r7 = new com.bytedance.adsdk.lottie.model.j.qv
            r7.<init>(r0, r1, r2, r3)
            return r7
    }
}
