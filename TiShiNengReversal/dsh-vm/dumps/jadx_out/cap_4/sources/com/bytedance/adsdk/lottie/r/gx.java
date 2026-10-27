package com.bytedance.adsdk.lottie.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class gx {
    public gx() {
            r1 = this;
            r1.<init>()
            return
    }

    static com.bytedance.adsdk.lottie.model.xt.w j(android.util.JsonReader r18, com.bytedance.adsdk.lottie.m r19) throws java.io.IOException {
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1 = 0
            r1 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        Lf:
            boolean r12 = r18.hasNext()
            if (r12 == 0) goto L168
            java.lang.String r12 = r18.nextName()
            r12.getClass()
            int r13 = r12.hashCode()
            java.lang.String r15 = "o"
            java.lang.String r0 = "d"
            r16 = -1
            r14 = 1
            switch(r13) {
                case 99: goto L82;
                case 100: goto L79;
                case 111: goto L70;
                case 119: goto L65;
                case 3324: goto L5a;
                case 3447: goto L4f;
                case 3454: goto L44;
                case 3487: goto L39;
                case 3519: goto L2d;
                default: goto L2a;
            }
        L2a:
            r12 = -1
            goto L8c
        L2d:
            java.lang.String r13 = "nm"
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L36
            goto L2a
        L36:
            r12 = 8
            goto L8c
        L39:
            java.lang.String r13 = "ml"
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L42
            goto L2a
        L42:
            r12 = 7
            goto L8c
        L44:
            java.lang.String r13 = "lj"
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L4d
            goto L2a
        L4d:
            r12 = 6
            goto L8c
        L4f:
            java.lang.String r13 = "lc"
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L58
            goto L2a
        L58:
            r12 = 5
            goto L8c
        L5a:
            java.lang.String r13 = "hd"
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L63
            goto L2a
        L63:
            r12 = 4
            goto L8c
        L65:
            java.lang.String r13 = "w"
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L6e
            goto L2a
        L6e:
            r12 = 3
            goto L8c
        L70:
            boolean r12 = r12.equals(r15)
            if (r12 != 0) goto L77
            goto L2a
        L77:
            r12 = 2
            goto L8c
        L79:
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L80
            goto L2a
        L80:
            r12 = 1
            goto L8c
        L82:
            java.lang.String r13 = "c"
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L8b
            goto L2a
        L8b:
            r12 = 0
        L8c:
            switch(r12) {
                case 0: goto L15f;
                case 1: goto Ld0;
                case 2: goto Lca;
                case 3: goto Lc4;
                case 4: goto Lbe;
                case 5: goto Lb1;
                case 6: goto La4;
                case 7: goto L9d;
                case 8: goto L97;
                default: goto L8f;
            }
        L8f:
            r18.skipValue()
            r2 = r19
        L94:
            r0 = 0
            goto Lf
        L97:
            java.lang.String r4 = r18.nextString()
            goto Lf
        L9d:
            double r12 = r18.nextDouble()
            float r9 = (float) r12
            goto Lf
        La4:
            com.bytedance.adsdk.lottie.model.xt.w$xt[] r0 = com.bytedance.adsdk.lottie.model.xt.w.xt.values()
            int r10 = r18.nextInt()
            int r10 = r10 - r14
            r10 = r0[r10]
            goto Lf
        Lb1:
            com.bytedance.adsdk.lottie.model.xt.w$j[] r0 = com.bytedance.adsdk.lottie.model.xt.w.j.values()
            int r8 = r18.nextInt()
            int r8 = r8 - r14
            r8 = r0[r8]
            goto Lf
        Lbe:
            boolean r11 = r18.nextBoolean()
            goto Lf
        Lc4:
            com.bytedance.adsdk.lottie.model.j.xt r7 = com.bytedance.adsdk.lottie.r.r.j(r18, r19)
            goto Lf
        Lca:
            com.bytedance.adsdk.lottie.model.j.r r1 = com.bytedance.adsdk.lottie.r.r.xt(r18, r19)
            goto Lf
        Ld0:
            r18.beginArray()
        Ld3:
            boolean r12 = r18.hasNext()
            if (r12 == 0) goto L149
            r18.beginObject()
            r12 = 0
            r13 = 0
        Lde:
            boolean r17 = r18.hasNext()
            if (r17 == 0) goto L10a
            java.lang.String r2 = r18.nextName()
            r2.getClass()
            java.lang.String r14 = "n"
            boolean r14 = r2.equals(r14)
            if (r14 != 0) goto L105
            java.lang.String r14 = "v"
            boolean r2 = r2.equals(r14)
            if (r2 != 0) goto L100
            r18.skipValue()
        Lfe:
            r14 = 1
            goto Lde
        L100:
            com.bytedance.adsdk.lottie.model.j.xt r13 = com.bytedance.adsdk.lottie.r.r.j(r18, r19)
            goto Lfe
        L105:
            java.lang.String r12 = r18.nextString()
            goto Lfe
        L10a:
            r18.endObject()
            r12.getClass()
            int r2 = r12.hashCode()
            switch(r2) {
                case 100: goto L12d;
                case 103: goto L122;
                case 111: goto L119;
                default: goto L117;
            }
        L117:
            r2 = -1
            goto L135
        L119:
            boolean r2 = r12.equals(r15)
            if (r2 != 0) goto L120
            goto L117
        L120:
            r2 = 2
            goto L135
        L122:
            java.lang.String r2 = "g"
            boolean r2 = r12.equals(r2)
            if (r2 != 0) goto L12b
            goto L117
        L12b:
            r2 = 1
            goto L135
        L12d:
            boolean r2 = r12.equals(r0)
            if (r2 != 0) goto L134
            goto L117
        L134:
            r2 = 0
        L135:
            switch(r2) {
                case 0: goto L13f;
                case 1: goto L13f;
                case 2: goto L13c;
                default: goto L138;
            }
        L138:
            r2 = r19
            r12 = 1
            goto L13d
        L13c:
            r5 = r13
        L13d:
            r14 = 1
            goto Ld3
        L13f:
            r2 = r19
            r12 = 1
            r2.j(r12)
            r3.add(r13)
            goto L13d
        L149:
            r2 = r19
            r12 = 1
            r18.endArray()
            int r0 = r3.size()
            if (r0 != r12) goto L94
            r0 = 0
            java.lang.Object r12 = r3.get(r0)
            r3.add(r12)
            goto Lf
        L15f:
            r2 = r19
            r0 = 0
            com.bytedance.adsdk.lottie.model.j.j r6 = com.bytedance.adsdk.lottie.r.r.ae(r18, r19)
            goto Lf
        L168:
            if (r1 != 0) goto L17e
            com.bytedance.adsdk.lottie.model.j.r r1 = new com.bytedance.adsdk.lottie.model.j.r
            com.bytedance.adsdk.lottie.m.j r0 = new com.bytedance.adsdk.lottie.m.j
            r2 = 100
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.<init>(r2)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1.<init>(r0)
        L17e:
            com.bytedance.adsdk.lottie.model.xt.w r0 = new com.bytedance.adsdk.lottie.model.xt.w
            r2 = r5
            r5 = r1
            r1 = r4
            r4 = r6
            r6 = r7
            r7 = r8
            r8 = r10
            r10 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
    }
}
