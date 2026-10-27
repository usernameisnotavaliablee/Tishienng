package com.bytedance.adsdk.lottie.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class i {
    public i() {
            r1 = this;
            r1.<init>()
            return
    }

    static com.bytedance.adsdk.lottie.model.xt.m j(android.util.JsonReader r23, com.bytedance.adsdk.lottie.m r24) throws java.io.IOException {
            r0 = r24
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r1 = 0
            r2 = 0
            r2 = r1
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r12 = r9
            r13 = r12
            r15 = r13
            r10 = 0
            r14 = 0
        L15:
            boolean r16 = r23.hasNext()
            if (r16 == 0) goto L217
            java.lang.String r15 = r23.nextName()
            r15.getClass()
            int r17 = r15.hashCode()
            java.lang.String r3 = "o"
            r18 = r1
            java.lang.String r1 = "g"
            r19 = r2
            java.lang.String r2 = "d"
            r20 = -1
            r21 = r4
            switch(r17) {
                case 100: goto Ld3;
                case 101: goto Lc6;
                case 103: goto Lbb;
                case 111: goto Lb0;
                case 115: goto La3;
                case 116: goto L96;
                case 119: goto L89;
                case 3324: goto L7c;
                case 3447: goto L6c;
                case 3454: goto L5c;
                case 3487: goto L4c;
                case 3519: goto L3c;
                default: goto L37;
            }
        L37:
            r4 = -1
            r17 = 1
            goto Lde
        L3c:
            r17 = 1
            java.lang.String r4 = "nm"
            boolean r4 = r15.equals(r4)
            if (r4 != 0) goto L48
            goto Ldb
        L48:
            r4 = 11
            goto Lde
        L4c:
            r17 = 1
            java.lang.String r4 = "ml"
            boolean r4 = r15.equals(r4)
            if (r4 != 0) goto L58
            goto Ldb
        L58:
            r4 = 10
            goto Lde
        L5c:
            r17 = 1
            java.lang.String r4 = "lj"
            boolean r4 = r15.equals(r4)
            if (r4 != 0) goto L68
            goto Ldb
        L68:
            r4 = 9
            goto Lde
        L6c:
            r17 = 1
            java.lang.String r4 = "lc"
            boolean r4 = r15.equals(r4)
            if (r4 != 0) goto L78
            goto Ldb
        L78:
            r4 = 8
            goto Lde
        L7c:
            r17 = 1
            java.lang.String r4 = "hd"
            boolean r4 = r15.equals(r4)
            if (r4 != 0) goto L87
            goto Ldb
        L87:
            r4 = 7
            goto Lde
        L89:
            r17 = 1
            java.lang.String r4 = "w"
            boolean r4 = r15.equals(r4)
            if (r4 != 0) goto L94
            goto Ldb
        L94:
            r4 = 6
            goto Lde
        L96:
            r17 = 1
            java.lang.String r4 = "t"
            boolean r4 = r15.equals(r4)
            if (r4 != 0) goto La1
            goto Ldb
        La1:
            r4 = 5
            goto Lde
        La3:
            r17 = 1
            java.lang.String r4 = "s"
            boolean r4 = r15.equals(r4)
            if (r4 != 0) goto Lae
            goto Ldb
        Lae:
            r4 = 4
            goto Lde
        Lb0:
            r17 = 1
            boolean r4 = r15.equals(r3)
            if (r4 != 0) goto Lb9
            goto Ldb
        Lb9:
            r4 = 3
            goto Lde
        Lbb:
            r17 = 1
            boolean r4 = r15.equals(r1)
            if (r4 != 0) goto Lc4
            goto Ldb
        Lc4:
            r4 = 2
            goto Lde
        Lc6:
            r17 = 1
            java.lang.String r4 = "e"
            boolean r4 = r15.equals(r4)
            if (r4 != 0) goto Ld1
            goto Ldb
        Ld1:
            r4 = 1
            goto Lde
        Ld3:
            r17 = 1
            boolean r4 = r15.equals(r2)
            if (r4 != 0) goto Ldd
        Ldb:
            r4 = -1
            goto Lde
        Ldd:
            r4 = 0
        Lde:
            switch(r4) {
                case 0: goto L180;
                case 1: goto L178;
                case 2: goto L141;
                case 3: goto L13a;
                case 4: goto L135;
                case 5: goto L122;
                case 6: goto L11d;
                case 7: goto L118;
                case 8: goto L10b;
                case 9: goto Lfe;
                case 10: goto Lf6;
                case 11: goto Leb;
                default: goto Le1;
            }
        Le1:
            r23.skipValue()
            r20 = r5
            r22 = r6
        Le8:
            r1 = 0
            goto L20b
        Leb:
            java.lang.String r1 = r23.nextString()
        Lef:
            r2 = r19
        Lf1:
            r4 = r21
        Lf3:
            r15 = 0
            goto L15
        Lf6:
            double r1 = r23.nextDouble()
            float r10 = (float) r1
        Lfb:
            r1 = r18
            goto Lef
        Lfe:
            com.bytedance.adsdk.lottie.model.xt.w$xt[] r1 = com.bytedance.adsdk.lottie.model.xt.w.xt.values()
            int r2 = r23.nextInt()
            int r2 = r2 + (-1)
            r12 = r1[r2]
            goto Lfb
        L10b:
            com.bytedance.adsdk.lottie.model.xt.w$j[] r1 = com.bytedance.adsdk.lottie.model.xt.w.j.values()
            int r2 = r23.nextInt()
            int r2 = r2 + (-1)
            r9 = r1[r2]
            goto Lfb
        L118:
            boolean r14 = r23.nextBoolean()
            goto Lfb
        L11d:
            com.bytedance.adsdk.lottie.model.j.xt r8 = com.bytedance.adsdk.lottie.r.r.j(r23, r24)
            goto Lfb
        L122:
            int r1 = r23.nextInt()
            r2 = 1
            if (r1 != r2) goto L12d
            com.bytedance.adsdk.lottie.model.xt.ae r1 = com.bytedance.adsdk.lottie.model.xt.ae.j
        L12b:
            r4 = r1
            goto L130
        L12d:
            com.bytedance.adsdk.lottie.model.xt.ae r1 = com.bytedance.adsdk.lottie.model.xt.ae.xt
            goto L12b
        L130:
            r1 = r18
            r2 = r19
            goto Lf3
        L135:
            com.bytedance.adsdk.lottie.model.j.m r6 = com.bytedance.adsdk.lottie.r.r.cw(r23, r24)
            goto Lfb
        L13a:
            com.bytedance.adsdk.lottie.model.j.r r2 = com.bytedance.adsdk.lottie.r.r.xt(r23, r24)
            r1 = r18
            goto Lf1
        L141:
            r23.beginObject()
            r1 = -1
        L145:
            boolean r2 = r23.hasNext()
            if (r2 == 0) goto L172
            java.lang.String r2 = r23.nextName()
            r2.getClass()
            java.lang.String r3 = "k"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L16b
            java.lang.String r3 = "p"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L166
            r23.skipValue()
            goto L145
        L166:
            int r1 = r23.nextInt()
            goto L145
        L16b:
            r4 = r23
            com.bytedance.adsdk.lottie.model.j.cw r5 = com.bytedance.adsdk.lottie.r.r.j(r4, r0, r1)
            goto L145
        L172:
            r4 = r23
            r4.endObject()
            goto Lfb
        L178:
            r4 = r23
            com.bytedance.adsdk.lottie.model.j.m r7 = com.bytedance.adsdk.lottie.r.r.cw(r23, r24)
            goto Lfb
        L180:
            r4 = r23
            r4.beginArray()
        L185:
            boolean r15 = r4.hasNext()
            if (r15 == 0) goto L1f5
            r4.beginObject()
            r4 = 0
            r15 = 0
        L190:
            boolean r20 = r23.hasNext()
            if (r20 == 0) goto L1c3
            r20 = r5
            java.lang.String r5 = r23.nextName()
            r5.getClass()
            r22 = r6
            java.lang.String r6 = "n"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L1be
            java.lang.String r6 = "v"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L1b9
            r23.skipValue()
        L1b4:
            r5 = r20
            r6 = r22
            goto L190
        L1b9:
            com.bytedance.adsdk.lottie.model.j.xt r4 = com.bytedance.adsdk.lottie.r.r.j(r23, r24)
            goto L1b4
        L1be:
            java.lang.String r15 = r23.nextString()
            goto L1b4
        L1c3:
            r20 = r5
            r22 = r6
            r23.endObject()
            boolean r5 = r15.equals(r3)
            if (r5 == 0) goto L1d8
            r13 = r4
            r5 = r20
            r6 = r22
            r4 = r23
            goto L185
        L1d8:
            boolean r5 = r15.equals(r2)
            if (r5 != 0) goto L1e4
            boolean r5 = r15.equals(r1)
            if (r5 == 0) goto L1e6
        L1e4:
            r5 = 1
            goto L1e8
        L1e6:
            r5 = 1
            goto L1ee
        L1e8:
            r0.j(r5)
            r11.add(r4)
        L1ee:
            r4 = r23
            r5 = r20
            r6 = r22
            goto L185
        L1f5:
            r20 = r5
            r22 = r6
            r5 = 1
            r23.endArray()
            int r1 = r11.size()
            if (r1 != r5) goto Le8
            r1 = 0
            java.lang.Object r2 = r11.get(r1)
            r11.add(r2)
        L20b:
            r1 = r18
            r2 = r19
            r5 = r20
            r4 = r21
            r6 = r22
            goto Lf3
        L217:
            r18 = r1
            r19 = r2
            r21 = r4
            r20 = r5
            r22 = r6
            if (r19 != 0) goto L239
            com.bytedance.adsdk.lottie.model.j.r r2 = new com.bytedance.adsdk.lottie.model.j.r
            com.bytedance.adsdk.lottie.m.j r0 = new com.bytedance.adsdk.lottie.m.j
            r1 = 100
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.<init>(r1)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r2.<init>(r0)
            r4 = r2
            goto L23b
        L239:
            r4 = r19
        L23b:
            com.bytedance.adsdk.lottie.model.xt.m r0 = new com.bytedance.adsdk.lottie.model.xt.m
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r12
            r12 = r13
            r13 = r14
            r1 = r18
            r3 = r20
            r2 = r21
            r5 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
    }
}
