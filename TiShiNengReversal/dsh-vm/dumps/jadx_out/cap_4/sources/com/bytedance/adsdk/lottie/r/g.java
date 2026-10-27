package com.bytedance.adsdk.lottie.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class g implements com.bytedance.adsdk.lottie.r.nd<com.bytedance.adsdk.lottie.model.xt> {
    public static final com.bytedance.adsdk.lottie.r.g j = null;

    static {
            com.bytedance.adsdk.lottie.r.g r0 = new com.bytedance.adsdk.lottie.r.g
            r0.<init>()
            com.bytedance.adsdk.lottie.r.g.j = r0
            return
    }

    private g() {
            r0 = this;
            r0.<init>()
            return
    }

    public com.bytedance.adsdk.lottie.model.xt j(android.util.JsonReader r20, float r21) throws java.io.IOException {
            r19 = this;
            com.bytedance.adsdk.lottie.model.xt$j r0 = com.bytedance.adsdk.lottie.model.xt.j.cw
            r20.beginObject()
            r1 = 0
            r2 = 0
            r9 = r0
            r6 = r1
            r7 = r6
            r17 = r7
            r18 = r17
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 1
        L17:
            boolean r0 = r20.hasNext()
            if (r0 == 0) goto L165
            java.lang.String r0 = r20.nextName()
            r0.getClass()
            int r1 = r0.hashCode()
            r2 = -1
            switch(r1) {
                case 102: goto Lc1;
                case 106: goto Lb6;
                case 115: goto Lab;
                case 116: goto La0;
                case 3261: goto L95;
                case 3452: goto L8a;
                case 3463: goto L7f;
                case 3543: goto L74;
                case 3587: goto L66;
                case 3664: goto L58;
                case 3684: goto L4a;
                case 3687: goto L3c;
                case 3710: goto L2e;
                default: goto L2c;
            }
        L2c:
            goto Lcb
        L2e:
            java.lang.String r1 = "tr"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L38
            goto Lcb
        L38:
            r2 = 12
            goto Lcb
        L3c:
            java.lang.String r1 = "sz"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L46
            goto Lcb
        L46:
            r2 = 11
            goto Lcb
        L4a:
            java.lang.String r1 = "sw"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L54
            goto Lcb
        L54:
            r2 = 10
            goto Lcb
        L58:
            java.lang.String r1 = "sc"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L62
            goto Lcb
        L62:
            r2 = 9
            goto Lcb
        L66:
            java.lang.String r1 = "ps"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L70
            goto Lcb
        L70:
            r2 = 8
            goto Lcb
        L74:
            java.lang.String r1 = "of"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7d
            goto Lcb
        L7d:
            r2 = 7
            goto Lcb
        L7f:
            java.lang.String r1 = "ls"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L88
            goto Lcb
        L88:
            r2 = 6
            goto Lcb
        L8a:
            java.lang.String r1 = "lh"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L93
            goto Lcb
        L93:
            r2 = 5
            goto Lcb
        L95:
            java.lang.String r1 = "fc"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L9e
            goto Lcb
        L9e:
            r2 = 4
            goto Lcb
        La0:
            java.lang.String r1 = "t"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto La9
            goto Lcb
        La9:
            r2 = 3
            goto Lcb
        Lab:
            java.lang.String r1 = "s"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lb4
            goto Lcb
        Lb4:
            r2 = 2
            goto Lcb
        Lb6:
            java.lang.String r1 = "j"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lbf
            goto Lcb
        Lbf:
            r2 = 1
            goto Lcb
        Lc1:
            java.lang.String r1 = "f"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lca
            goto Lcb
        Lca:
            r2 = 0
        Lcb:
            switch(r2) {
                case 0: goto L15f;
                case 1: goto L147;
                case 2: goto L140;
                case 3: goto L13a;
                case 4: goto L134;
                case 5: goto L12d;
                case 6: goto L126;
                case 7: goto L120;
                case 8: goto L103;
                case 9: goto Lfd;
                case 10: goto Lf6;
                case 11: goto Ld9;
                case 12: goto Ld3;
                default: goto Lce;
            }
        Lce:
            r20.skipValue()
            goto L17
        Ld3:
            int r10 = r20.nextInt()
            goto L17
        Ld9:
            r20.beginArray()
            android.graphics.PointF r0 = new android.graphics.PointF
            double r1 = r20.nextDouble()
            float r1 = (float) r1
            float r1 = r1 * r21
            double r3 = r20.nextDouble()
            float r3 = (float) r3
            float r3 = r3 * r21
            r0.<init>(r1, r3)
            r20.endArray()
            r18 = r0
            goto L17
        Lf6:
            double r0 = r20.nextDouble()
            float r15 = (float) r0
            goto L17
        Lfd:
            int r14 = com.bytedance.adsdk.lottie.r.mi.j(r20)
            goto L17
        L103:
            r20.beginArray()
            android.graphics.PointF r0 = new android.graphics.PointF
            double r3 = r20.nextDouble()
            float r1 = (float) r3
            float r1 = r1 * r21
            double r3 = r20.nextDouble()
            float r3 = (float) r3
            float r3 = r3 * r21
            r0.<init>(r1, r3)
            r20.endArray()
            r17 = r0
            goto L17
        L120:
            boolean r16 = r20.nextBoolean()
            goto L17
        L126:
            double r0 = r20.nextDouble()
            float r12 = (float) r0
            goto L17
        L12d:
            double r0 = r20.nextDouble()
            float r11 = (float) r0
            goto L17
        L134:
            int r13 = com.bytedance.adsdk.lottie.r.mi.j(r20)
            goto L17
        L13a:
            java.lang.String r6 = r20.nextString()
            goto L17
        L140:
            double r0 = r20.nextDouble()
            float r8 = (float) r0
            goto L17
        L147:
            int r0 = r20.nextInt()
            com.bytedance.adsdk.lottie.model.xt$j r9 = com.bytedance.adsdk.lottie.model.xt.j.cw
            int r1 = r9.ordinal()
            if (r0 > r1) goto L17
            if (r0 >= 0) goto L157
            goto L17
        L157:
            com.bytedance.adsdk.lottie.model.xt$j[] r1 = com.bytedance.adsdk.lottie.model.xt.j.values()
            r9 = r1[r0]
            goto L17
        L15f:
            java.lang.String r7 = r20.nextString()
            goto L17
        L165:
            r20.endObject()
            com.bytedance.adsdk.lottie.model.xt r5 = new com.bytedance.adsdk.lottie.model.xt
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r5
    }

    @Override // com.bytedance.adsdk.lottie.r.nd
    public /* synthetic */ com.bytedance.adsdk.lottie.model.xt xt(android.util.JsonReader r1, float r2) throws java.io.IOException {
            r0 = this;
            com.bytedance.adsdk.lottie.model.xt r1 = r0.j(r1, r2)
            return r1
    }
}
