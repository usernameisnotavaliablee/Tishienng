package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class s0 {
    public s0() {
            r1 = this;
            r1.<init>()
            return
    }

    public static xyz.adscope.ad.w2 a(java.lang.String r5, int r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 != 0) goto L74
            r5.getClass()
            int r0 = r5.hashCode()
            r2 = 2
            r3 = 1
            r4 = -1
            switch(r0) {
                case -599449367: goto L36;
                case 94756344: goto L2b;
                case 859400934: goto L20;
                case 1108745558: goto L15;
                default: goto L14;
            }
        L14:
            goto L40
        L15:
            java.lang.String r0 = "downloadInfo"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L1e
            goto L40
        L1e:
            r4 = 3
            goto L40
        L20:
            java.lang.String r0 = "voiceswitch"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L29
            goto L40
        L29:
            r4 = 2
            goto L40
        L2b:
            java.lang.String r0 = "close"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L34
            goto L40
        L34:
            r4 = 1
            goto L40
        L36:
            java.lang.String r0 = "complain"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L3f
            goto L40
        L3f:
            r4 = 0
        L40:
            switch(r4) {
                case 0: goto L6e;
                case 1: goto L68;
                case 2: goto L62;
                case 3: goto L5c;
                default: goto L43;
            }
        L43:
            if (r6 != 0) goto L4b
            xyz.adscope.ad.t0 r5 = new xyz.adscope.ad.t0
            r5.<init>()
            return r5
        L4b:
            if (r6 != r3) goto L53
            xyz.adscope.ad.v0 r5 = new xyz.adscope.ad.v0
            r5.<init>()
            return r5
        L53:
            if (r6 != r2) goto L5b
            xyz.adscope.ad.w0 r5 = new xyz.adscope.ad.w0
            r5.<init>()
            return r5
        L5b:
            return r1
        L5c:
            xyz.adscope.ad.u0 r5 = new xyz.adscope.ad.u0
            r5.<init>()
            return r5
        L62:
            xyz.adscope.ad.x0 r5 = new xyz.adscope.ad.x0
            r5.<init>()
            return r5
        L68:
            xyz.adscope.ad.q0 r5 = new xyz.adscope.ad.q0
            r5.<init>()
            return r5
        L6e:
            xyz.adscope.ad.r0 r5 = new xyz.adscope.ad.r0
            r5.<init>()
            return r5
        L74:
            return r1
    }
}
