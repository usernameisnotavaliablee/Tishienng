package com.bytedance.adsdk.lottie.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class wq implements com.bytedance.adsdk.lottie.r.nd<com.bytedance.adsdk.lottie.model.xt.ws> {
    public static final com.bytedance.adsdk.lottie.r.wq j = null;

    static {
            com.bytedance.adsdk.lottie.r.wq r0 = new com.bytedance.adsdk.lottie.r.wq
            r0.<init>()
            com.bytedance.adsdk.lottie.r.wq.j = r0
            return
    }

    private wq() {
            r0 = this;
            r0.<init>()
            return
    }

    public com.bytedance.adsdk.lottie.model.xt.ws j(android.util.JsonReader r13, float r14) throws java.io.IOException {
            r12 = this;
            android.util.JsonToken r0 = r13.peek()
            android.util.JsonToken r1 = android.util.JsonToken.BEGIN_ARRAY
            if (r0 != r1) goto Lb
            r13.beginArray()
        Lb:
            r13.beginObject()
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r2
            r4 = 0
        L13:
            boolean r5 = r13.hasNext()
            r6 = 1
            if (r5 == 0) goto L6f
            java.lang.String r5 = r13.nextName()
            r5.getClass()
            int r7 = r5.hashCode()
            r8 = -1
            switch(r7) {
                case 99: goto L4a;
                case 105: goto L41;
                case 111: goto L36;
                case 118: goto L2b;
                default: goto L29;
            }
        L29:
            r6 = -1
            goto L54
        L2b:
            java.lang.String r6 = "v"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L34
            goto L29
        L34:
            r6 = 3
            goto L54
        L36:
            java.lang.String r6 = "o"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L3f
            goto L29
        L3f:
            r6 = 2
            goto L54
        L41:
            java.lang.String r7 = "i"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L54
            goto L29
        L4a:
            java.lang.String r6 = "c"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L53
            goto L29
        L53:
            r6 = 0
        L54:
            switch(r6) {
                case 0: goto L6a;
                case 1: goto L65;
                case 2: goto L60;
                case 3: goto L5b;
                default: goto L57;
            }
        L57:
            r13.skipValue()
            goto L13
        L5b:
            java.util.List r0 = com.bytedance.adsdk.lottie.r.mi.j(r13, r14)
            goto L13
        L60:
            java.util.List r3 = com.bytedance.adsdk.lottie.r.mi.j(r13, r14)
            goto L13
        L65:
            java.util.List r2 = com.bytedance.adsdk.lottie.r.mi.j(r13, r14)
            goto L13
        L6a:
            boolean r4 = r13.nextBoolean()
            goto L13
        L6f:
            r13.endObject()
            android.util.JsonToken r14 = r13.peek()
            android.util.JsonToken r5 = android.util.JsonToken.END_ARRAY
            if (r14 != r5) goto L7d
            r13.endArray()
        L7d:
            if (r0 == 0) goto L106
            if (r2 == 0) goto L106
            if (r3 == 0) goto L106
            boolean r13 = r0.isEmpty()
            if (r13 == 0) goto L96
            com.bytedance.adsdk.lottie.model.xt.ws r13 = new com.bytedance.adsdk.lottie.model.xt.ws
            android.graphics.PointF r14 = new android.graphics.PointF
            r14.<init>()
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            r13.<init>(r14, r1, r0)
            return r13
        L96:
            int r13 = r0.size()
            java.lang.Object r14 = r0.get(r1)
            android.graphics.PointF r14 = (android.graphics.PointF) r14
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r13)
            r7 = 1
        La6:
            if (r7 >= r13) goto Ld5
            java.lang.Object r8 = r0.get(r7)
            android.graphics.PointF r8 = (android.graphics.PointF) r8
            int r9 = r7 + (-1)
            java.lang.Object r10 = r0.get(r9)
            android.graphics.PointF r10 = (android.graphics.PointF) r10
            java.lang.Object r9 = r3.get(r9)
            android.graphics.PointF r9 = (android.graphics.PointF) r9
            java.lang.Object r11 = r2.get(r7)
            android.graphics.PointF r11 = (android.graphics.PointF) r11
            android.graphics.PointF r9 = com.bytedance.adsdk.lottie.up.tl.j(r10, r9)
            android.graphics.PointF r10 = com.bytedance.adsdk.lottie.up.tl.j(r8, r11)
            com.bytedance.adsdk.lottie.model.j r11 = new com.bytedance.adsdk.lottie.model.j
            r11.<init>(r9, r10, r8)
            r5.add(r11)
            int r7 = r7 + 1
            goto La6
        Ld5:
            if (r4 == 0) goto L100
            java.lang.Object r7 = r0.get(r1)
            android.graphics.PointF r7 = (android.graphics.PointF) r7
            int r13 = r13 - r6
            java.lang.Object r0 = r0.get(r13)
            android.graphics.PointF r0 = (android.graphics.PointF) r0
            java.lang.Object r13 = r3.get(r13)
            android.graphics.PointF r13 = (android.graphics.PointF) r13
            java.lang.Object r1 = r2.get(r1)
            android.graphics.PointF r1 = (android.graphics.PointF) r1
            android.graphics.PointF r13 = com.bytedance.adsdk.lottie.up.tl.j(r0, r13)
            android.graphics.PointF r0 = com.bytedance.adsdk.lottie.up.tl.j(r7, r1)
            com.bytedance.adsdk.lottie.model.j r1 = new com.bytedance.adsdk.lottie.model.j
            r1.<init>(r13, r0, r7)
            r5.add(r1)
        L100:
            com.bytedance.adsdk.lottie.model.xt.ws r13 = new com.bytedance.adsdk.lottie.model.xt.ws
            r13.<init>(r14, r4, r5)
            return r13
        L106:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Shape data was missing information."
            r13.<init>(r14)
            throw r13
    }

    @Override // com.bytedance.adsdk.lottie.r.nd
    public /* synthetic */ com.bytedance.adsdk.lottie.model.xt.ws xt(android.util.JsonReader r1, float r2) throws java.io.IOException {
            r0 = this;
            com.bytedance.adsdk.lottie.model.xt.ws r1 = r0.j(r1, r2)
            return r1
    }
}
