package com.bytedance.adsdk.lottie.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class jy {
    public jy() {
            r1 = this;
            r1.<init>()
            return
    }

    static com.bytedance.adsdk.lottie.model.r j(android.util.JsonReader r12, com.bytedance.adsdk.lottie.m r13) throws java.io.IOException {
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r12.beginObject()
            r0 = 0
            r2 = 0
            r4 = 0
            r5 = r2
            r7 = r4
            r8 = r7
            r3 = r5
            r2 = 0
        L11:
            boolean r9 = r12.hasNext()
            if (r9 == 0) goto Lc4
            java.lang.String r9 = r12.nextName()
            r9.getClass()
            int r10 = r9.hashCode()
            r11 = -1
            switch(r10) {
                case -1866931350: goto L5e;
                case 119: goto L53;
                case 3173: goto L48;
                case 3076010: goto L3d;
                case 3530753: goto L32;
                case 109780401: goto L27;
                default: goto L26;
            }
        L26:
            goto L68
        L27:
            java.lang.String r10 = "style"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L30
            goto L68
        L30:
            r11 = 5
            goto L68
        L32:
            java.lang.String r10 = "size"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L3b
            goto L68
        L3b:
            r11 = 4
            goto L68
        L3d:
            java.lang.String r10 = "data"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L46
            goto L68
        L46:
            r11 = 3
            goto L68
        L48:
            java.lang.String r10 = "ch"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L51
            goto L68
        L51:
            r11 = 2
            goto L68
        L53:
            java.lang.String r10 = "w"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L5c
            goto L68
        L5c:
            r11 = 1
            goto L68
        L5e:
            java.lang.String r10 = "fFamily"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L67
            goto L68
        L67:
            r11 = 0
        L68:
            switch(r11) {
                case 0: goto Lbe;
                case 1: goto Lb8;
                case 2: goto Lae;
                case 3: goto L79;
                case 4: goto L74;
                case 5: goto L6f;
                default: goto L6b;
            }
        L6b:
            r12.skipValue()
            goto L11
        L6f:
            java.lang.String r7 = r12.nextString()
            goto L11
        L74:
            double r3 = r12.nextDouble()
            goto L11
        L79:
            r12.beginObject()
        L7c:
            boolean r9 = r12.hasNext()
            if (r9 == 0) goto La9
            java.lang.String r9 = "shapes"
            java.lang.String r10 = r12.nextName()
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto La5
            r12.beginArray()
        L91:
            boolean r9 = r12.hasNext()
            if (r9 == 0) goto La1
            com.bytedance.adsdk.lottie.model.xt.cw r9 = com.bytedance.adsdk.lottie.r.tl.j(r12, r13)
            com.bytedance.adsdk.lottie.model.xt.av r9 = (com.bytedance.adsdk.lottie.model.xt.av) r9
            r1.add(r9)
            goto L91
        La1:
            r12.endArray()
            goto L7c
        La5:
            r12.skipValue()
            goto L7c
        La9:
            r12.endObject()
            goto L11
        Lae:
            java.lang.String r2 = r12.nextString()
            char r2 = r2.charAt(r0)
            goto L11
        Lb8:
            double r5 = r12.nextDouble()
            goto L11
        Lbe:
            java.lang.String r8 = r12.nextString()
            goto L11
        Lc4:
            r12.endObject()
            com.bytedance.adsdk.lottie.model.r r0 = new com.bytedance.adsdk.lottie.model.r
            r0.<init>(r1, r2, r3, r5, r7, r8)
            return r0
    }
}
