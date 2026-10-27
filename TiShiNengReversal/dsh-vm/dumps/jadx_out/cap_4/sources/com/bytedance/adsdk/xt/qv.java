package com.bytedance.adsdk.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class qv {
    public qv() {
            r1 = this;
            r1.<init>()
            return
    }

    public static com.bytedance.adsdk.xt.tl j(java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            r3.getClass()
            int r0 = r3.hashCode()
            r2 = -1
            switch(r0) {
                case -652088201: goto L62;
                case 3143097: goto L57;
                case 94642797: goto L4c;
                case 96955127: goto L41;
                case 515198113: goto L36;
                case 1052832078: goto L2b;
                case 1508134777: goto L20;
                case 2056988195: goto L15;
                default: goto L13;
            }
        L13:
            goto L6c
        L15:
            java.lang.String r0 = "isDigit"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L1e
            goto L6c
        L1e:
            r2 = 7
            goto L6c
        L20:
            java.lang.String r0 = "encodeUrl"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L29
            goto L6c
        L29:
            r2 = 6
            goto L6c
        L2b:
            java.lang.String r0 = "translate"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L34
            goto L6c
        L34:
            r2 = 5
            goto L6c
        L36:
            java.lang.String r0 = "decodeUrl"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L3f
            goto L6c
        L3f:
            r2 = 4
            goto L6c
        L41:
            java.lang.String r0 = "exist"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L4a
            goto L6c
        L4a:
            r2 = 3
            goto L6c
        L4c:
            java.lang.String r0 = "chunk"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L55
            goto L6c
        L55:
            r2 = 2
            goto L6c
        L57:
            java.lang.String r0 = "find"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L60
            goto L6c
        L60:
            r2 = 1
            goto L6c
        L62:
            java.lang.String r0 = "modArray"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L6b
            goto L6c
        L6b:
            r2 = 0
        L6c:
            switch(r2) {
                case 0: goto L9a;
                case 1: goto L94;
                case 2: goto L8e;
                case 3: goto L88;
                case 4: goto L82;
                case 5: goto L7c;
                case 6: goto L76;
                case 7: goto L70;
                default: goto L6f;
            }
        L6f:
            return r1
        L70:
            com.bytedance.adsdk.xt.ae r3 = new com.bytedance.adsdk.xt.ae
            r3.<init>()
            return r3
        L76:
            com.bytedance.adsdk.xt.r r3 = new com.bytedance.adsdk.xt.r
            r3.<init>()
            return r3
        L7c:
            com.bytedance.adsdk.xt.oq r3 = new com.bytedance.adsdk.xt.oq
            r3.<init>()
            return r3
        L82:
            com.bytedance.adsdk.xt.xt r3 = new com.bytedance.adsdk.xt.xt
            r3.<init>()
            return r3
        L88:
            com.bytedance.adsdk.xt.up r3 = new com.bytedance.adsdk.xt.up
            r3.<init>()
            return r3
        L8e:
            com.bytedance.adsdk.xt.j r3 = new com.bytedance.adsdk.xt.j
            r3.<init>()
            return r3
        L94:
            com.bytedance.adsdk.xt.m r3 = new com.bytedance.adsdk.xt.m
            r3.<init>()
            return r3
        L9a:
            com.bytedance.adsdk.xt.g r3 = new com.bytedance.adsdk.xt.g
            r3.<init>()
            return r3
    }

    public static java.lang.Object j(com.bytedance.adsdk.xt.xt.j.j r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r2.j()
            com.bytedance.adsdk.xt.tl r1 = j(r1)
            if (r1 != 0) goto Lf
            return r0
        Lf:
            java.lang.Object[] r2 = r2.xt()
            java.lang.Object r2 = r1.j(r0, r2)
            return r2
    }
}
