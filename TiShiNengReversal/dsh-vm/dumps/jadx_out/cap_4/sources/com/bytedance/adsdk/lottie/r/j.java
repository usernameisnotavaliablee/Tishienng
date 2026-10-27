package com.bytedance.adsdk.lottie.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j {
    public j() {
            r1 = this;
            r1.<init>()
            return
    }

    public static com.bytedance.adsdk.lottie.model.j.up j(android.util.JsonReader r3, com.bytedance.adsdk.lottie.m r4) throws java.io.IOException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.util.JsonToken r1 = r3.peek()
            android.util.JsonToken r2 = android.util.JsonToken.BEGIN_ARRAY
            if (r1 != r2) goto L25
            r3.beginArray()
        L10:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L1e
            com.bytedance.adsdk.lottie.j.xt.g r1 = com.bytedance.adsdk.lottie.r.s.j(r3, r4)
            r0.add(r1)
            goto L10
        L1e:
            r3.endArray()
            com.bytedance.adsdk.lottie.r.tj.j(r0)
            goto L35
        L25:
            com.bytedance.adsdk.lottie.m.j r4 = new com.bytedance.adsdk.lottie.m.j
            float r1 = com.bytedance.adsdk.lottie.up.g.j()
            android.graphics.PointF r3 = com.bytedance.adsdk.lottie.r.mi.xt(r3, r1)
            r4.<init>(r3)
            r0.add(r4)
        L35:
            com.bytedance.adsdk.lottie.model.j.up r3 = new com.bytedance.adsdk.lottie.model.j.up
            r3.<init>(r0)
            return r3
    }

    static com.bytedance.adsdk.lottie.model.j.jy<android.graphics.PointF, android.graphics.PointF> xt(android.util.JsonReader r9, com.bytedance.adsdk.lottie.m r10) throws java.io.IOException {
            r9.beginObject()
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r2
            r4 = 0
        L8:
            android.util.JsonToken r5 = r9.peek()
            android.util.JsonToken r6 = android.util.JsonToken.END_OBJECT
            if (r5 == r6) goto L6b
            java.lang.String r5 = r9.nextName()
            r5.getClass()
            int r6 = r5.hashCode()
            r7 = 1
            r8 = -1
            switch(r6) {
                case 107: goto L37;
                case 120: goto L2c;
                case 121: goto L21;
                default: goto L20;
            }
        L20:
            goto L41
        L21:
            java.lang.String r6 = "y"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L2a
            goto L41
        L2a:
            r8 = 2
            goto L41
        L2c:
            java.lang.String r6 = "x"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L35
            goto L41
        L35:
            r8 = 1
            goto L41
        L37:
            java.lang.String r6 = "k"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L40
            goto L41
        L40:
            r8 = 0
        L41:
            switch(r8) {
                case 0: goto L66;
                case 1: goto L54;
                case 2: goto L45;
                default: goto L44;
            }
        L44:
            goto L5d
        L45:
            android.util.JsonToken r5 = r9.peek()
            android.util.JsonToken r6 = android.util.JsonToken.STRING
            if (r5 != r6) goto L4f
        L4d:
            r4 = 1
            goto L5d
        L4f:
            com.bytedance.adsdk.lottie.model.j.xt r3 = com.bytedance.adsdk.lottie.r.r.j(r9, r10)
            goto L8
        L54:
            android.util.JsonToken r5 = r9.peek()
            android.util.JsonToken r6 = android.util.JsonToken.STRING
            if (r5 != r6) goto L61
            goto L4d
        L5d:
            r9.skipValue()
            goto L8
        L61:
            com.bytedance.adsdk.lottie.model.j.xt r2 = com.bytedance.adsdk.lottie.r.r.j(r9, r10)
            goto L8
        L66:
            com.bytedance.adsdk.lottie.model.j.up r0 = j(r9, r10)
            goto L8
        L6b:
            r9.endObject()
            if (r4 == 0) goto L75
            java.lang.String r9 = "Lottie doesn't support expressions."
            r10.j(r9)
        L75:
            if (r0 == 0) goto L78
            return r0
        L78:
            com.bytedance.adsdk.lottie.model.j.g r9 = new com.bytedance.adsdk.lottie.model.j.g
            r9.<init>(r2, r3)
            return r9
    }
}
