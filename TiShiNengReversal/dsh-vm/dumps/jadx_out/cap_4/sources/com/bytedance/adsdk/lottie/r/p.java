package com.bytedance.adsdk.lottie.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class p {
    public p() {
            r1 = this;
            r1.<init>()
            return
    }

    static com.bytedance.adsdk.lottie.model.xt.oq j(android.util.JsonReader r19, com.bytedance.adsdk.lottie.m r20, int r21) throws java.io.IOException {
            r0 = r19
            r1 = r20
            r2 = 1
            r3 = 0
            r4 = 3
            r5 = r21
            if (r5 != r4) goto Ld
            r5 = 1
            goto Le
        Ld:
            r5 = 0
        Le:
            r6 = 0
            r18 = r5
            r8 = r6
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = 0
        L1d:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L10b
            java.lang.String r5 = r0.nextName()
            r5.getClass()
            int r6 = r5.hashCode()
            r7 = -1
            switch(r6) {
                case 100: goto Lab;
                case 112: goto La0;
                case 114: goto L95;
                case 3324: goto L8a;
                case 3369: goto L7f;
                case 3370: goto L74;
                case 3519: goto L69;
                case 3555: goto L5e;
                case 3556: goto L50;
                case 3588: goto L42;
                case 3686: goto L34;
                default: goto L32;
            }
        L32:
            goto Lb5
        L34:
            java.lang.String r6 = "sy"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L3e
            goto Lb5
        L3e:
            r7 = 10
            goto Lb5
        L42:
            java.lang.String r6 = "pt"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L4c
            goto Lb5
        L4c:
            r7 = 9
            goto Lb5
        L50:
            java.lang.String r6 = "os"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L5a
            goto Lb5
        L5a:
            r7 = 8
            goto Lb5
        L5e:
            java.lang.String r6 = "or"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L67
            goto Lb5
        L67:
            r7 = 7
            goto Lb5
        L69:
            java.lang.String r6 = "nm"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L72
            goto Lb5
        L72:
            r7 = 6
            goto Lb5
        L74:
            java.lang.String r6 = "is"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L7d
            goto Lb5
        L7d:
            r7 = 5
            goto Lb5
        L7f:
            java.lang.String r6 = "ir"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L88
            goto Lb5
        L88:
            r7 = 4
            goto Lb5
        L8a:
            java.lang.String r6 = "hd"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L93
            goto Lb5
        L93:
            r7 = 3
            goto Lb5
        L95:
            java.lang.String r6 = "r"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L9e
            goto Lb5
        L9e:
            r7 = 2
            goto Lb5
        La0:
            java.lang.String r6 = "p"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto La9
            goto Lb5
        La9:
            r7 = 1
            goto Lb5
        Lab:
            java.lang.String r6 = "d"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto Lb4
            goto Lb5
        Lb4:
            r7 = 0
        Lb5:
            switch(r7) {
                case 0: goto Lfd;
                case 1: goto Lf7;
                case 2: goto Lf1;
                case 3: goto Leb;
                case 4: goto Le5;
                case 5: goto Ldf;
                case 6: goto Ld9;
                case 7: goto Ld3;
                case 8: goto Lcd;
                case 9: goto Lc7;
                case 10: goto Lbd;
                default: goto Lb8;
            }
        Lb8:
            r0.skipValue()
            goto L1d
        Lbd:
            int r5 = r0.nextInt()
            com.bytedance.adsdk.lottie.model.xt.oq$j r9 = com.bytedance.adsdk.lottie.model.xt.oq.j.j(r5)
            goto L1d
        Lc7:
            com.bytedance.adsdk.lottie.model.j.xt r10 = com.bytedance.adsdk.lottie.r.r.j(r0, r1, r3)
            goto L1d
        Lcd:
            com.bytedance.adsdk.lottie.model.j.xt r16 = com.bytedance.adsdk.lottie.r.r.j(r0, r1, r3)
            goto L1d
        Ld3:
            com.bytedance.adsdk.lottie.model.j.xt r14 = com.bytedance.adsdk.lottie.r.r.j(r19, r20)
            goto L1d
        Ld9:
            java.lang.String r8 = r0.nextString()
            goto L1d
        Ldf:
            com.bytedance.adsdk.lottie.model.j.xt r15 = com.bytedance.adsdk.lottie.r.r.j(r0, r1, r3)
            goto L1d
        Le5:
            com.bytedance.adsdk.lottie.model.j.xt r13 = com.bytedance.adsdk.lottie.r.r.j(r19, r20)
            goto L1d
        Leb:
            boolean r17 = r0.nextBoolean()
            goto L1d
        Lf1:
            com.bytedance.adsdk.lottie.model.j.xt r12 = com.bytedance.adsdk.lottie.r.r.j(r0, r1, r3)
            goto L1d
        Lf7:
            com.bytedance.adsdk.lottie.model.j.jy r11 = com.bytedance.adsdk.lottie.r.j.xt(r19, r20)
            goto L1d
        Lfd:
            int r5 = r0.nextInt()
            if (r5 != r4) goto L107
            r18 = 1
            goto L1d
        L107:
            r18 = 0
            goto L1d
        L10b:
            com.bytedance.adsdk.lottie.model.xt.oq r7 = new com.bytedance.adsdk.lottie.model.xt.oq
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r7
    }
}
