package com.bytedance.adsdk.lottie.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class qv {
    private com.bytedance.adsdk.lottie.model.j.xt cw;
    private com.bytedance.adsdk.lottie.model.j.j j;

    /* renamed from: r, reason: collision with root package name */
    private com.bytedance.adsdk.lottie.model.j.xt f1886r;
    private com.bytedance.adsdk.lottie.model.j.xt up;
    private com.bytedance.adsdk.lottie.model.j.xt xt;

    public qv() {
            r0 = this;
            r0.<init>()
            return
    }

    private void xt(android.util.JsonReader r5, com.bytedance.adsdk.lottie.m r6) throws java.io.IOException {
            r4 = this;
            r5.beginObject()
            java.lang.String r0 = ""
        L5:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L9b
            java.lang.String r1 = r5.nextName()
            r1.getClass()
            java.lang.String r2 = "v"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L2b
            java.lang.String r2 = "nm"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L26
            r5.skipValue()
            goto L5
        L26:
            java.lang.String r0 = r5.nextString()
            goto L5
        L2b:
            r0.getClass()
            int r1 = r0.hashCode()
            r2 = 0
            r3 = -1
            switch(r1) {
                case 353103893: goto L64;
                case 397447147: goto L59;
                case 1041377119: goto L4e;
                case 1379387491: goto L43;
                case 1383710113: goto L38;
                default: goto L37;
            }
        L37:
            goto L6e
        L38:
            java.lang.String r1 = "Softness"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L41
            goto L6e
        L41:
            r3 = 4
            goto L6e
        L43:
            java.lang.String r1 = "Shadow Color"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L4c
            goto L6e
        L4c:
            r3 = 3
            goto L6e
        L4e:
            java.lang.String r1 = "Direction"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L57
            goto L6e
        L57:
            r3 = 2
            goto L6e
        L59:
            java.lang.String r1 = "Opacity"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L62
            goto L6e
        L62:
            r3 = 1
            goto L6e
        L64:
            java.lang.String r1 = "Distance"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L6d
            goto L6e
        L6d:
            r3 = 0
        L6e:
            switch(r3) {
                case 0: goto L93;
                case 1: goto L8b;
                case 2: goto L83;
                case 3: goto L7c;
                case 4: goto L75;
                default: goto L71;
            }
        L71:
            r5.skipValue()
            goto L5
        L75:
            com.bytedance.adsdk.lottie.model.j.xt r1 = com.bytedance.adsdk.lottie.r.r.j(r5, r6)
            r4.up = r1
            goto L5
        L7c:
            com.bytedance.adsdk.lottie.model.j.j r1 = com.bytedance.adsdk.lottie.r.r.ae(r5, r6)
            r4.j = r1
            goto L5
        L83:
            com.bytedance.adsdk.lottie.model.j.xt r1 = com.bytedance.adsdk.lottie.r.r.j(r5, r6, r2)
            r4.cw = r1
            goto L5
        L8b:
            com.bytedance.adsdk.lottie.model.j.xt r1 = com.bytedance.adsdk.lottie.r.r.j(r5, r6, r2)
            r4.xt = r1
            goto L5
        L93:
            com.bytedance.adsdk.lottie.model.j.xt r1 = com.bytedance.adsdk.lottie.r.r.j(r5, r6)
            r4.f1886r = r1
            goto L5
        L9b:
            r5.endObject()
            return
    }

    com.bytedance.adsdk.lottie.r.oq j(android.util.JsonReader r8, com.bytedance.adsdk.lottie.m r9) throws java.io.IOException {
            r7 = this;
        L0:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L2a
            java.lang.String r0 = r8.nextName()
            r0.getClass()
            java.lang.String r1 = "ef"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L19
            r8.skipValue()
            goto L0
        L19:
            r8.beginArray()
        L1c:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L26
            r7.xt(r8, r9)
            goto L1c
        L26:
            r8.endArray()
            goto L0
        L2a:
            com.bytedance.adsdk.lottie.model.j.j r2 = r7.j
            if (r2 == 0) goto L44
            com.bytedance.adsdk.lottie.model.j.xt r3 = r7.xt
            if (r3 == 0) goto L44
            com.bytedance.adsdk.lottie.model.j.xt r4 = r7.cw
            if (r4 == 0) goto L44
            com.bytedance.adsdk.lottie.model.j.xt r5 = r7.f1886r
            if (r5 == 0) goto L44
            com.bytedance.adsdk.lottie.model.j.xt r6 = r7.up
            if (r6 == 0) goto L44
            com.bytedance.adsdk.lottie.r.oq r1 = new com.bytedance.adsdk.lottie.r.oq
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L44:
            r8 = 0
            return r8
    }
}
