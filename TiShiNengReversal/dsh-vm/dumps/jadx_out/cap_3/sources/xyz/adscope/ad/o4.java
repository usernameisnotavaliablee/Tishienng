package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class o4 {
    public o4() {
            r1 = this;
            r1.<init>()
            return
    }

    public static xyz.adscope.ad.i3 a(android.content.Context r2, java.lang.String r3, java.lang.String r4, boolean r5) {
            r4.getClass()
            int r0 = r4.hashCode()
            r1 = -1
            switch(r0) {
                case -905948230: goto L4e;
                case 110259: goto L43;
                case 3418144: goto L38;
                case 3418145: goto L2d;
                case 94750088: goto L22;
                case 109399814: goto L17;
                case 109526449: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L58
        Lc:
            java.lang.String r0 = "slide"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L15
            goto L58
        L15:
            r1 = 6
            goto L58
        L17:
            java.lang.String r0 = "shake"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L20
            goto L58
        L20:
            r1 = 5
            goto L58
        L22:
            java.lang.String r0 = "click"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L2b
            goto L58
        L2b:
            r1 = 4
            goto L58
        L2d:
            java.lang.String r0 = "optt"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L36
            goto L58
        L36:
            r1 = 3
            goto L58
        L38:
            java.lang.String r0 = "opts"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L41
            goto L58
        L41:
            r1 = 2
            goto L58
        L43:
            java.lang.String r0 = "opt"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L4c
            goto L58
        L4c:
            r1 = 1
            goto L58
        L4e:
            java.lang.String r0 = "sensor"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L57
            goto L58
        L57:
            r1 = 0
        L58:
            r4 = 0
            switch(r1) {
                case 0: goto L83;
                case 1: goto L7d;
                case 2: goto L77;
                case 3: goto L71;
                case 4: goto L6b;
                case 5: goto L63;
                case 6: goto L5d;
                default: goto L5c;
            }
        L5c:
            return r4
        L5d:
            xyz.adscope.ad.p1 r4 = new xyz.adscope.ad.p1
            r4.<init>(r2, r3)
            return r4
        L63:
            if (r5 == 0) goto L6a
            xyz.adscope.ad.p0 r4 = new xyz.adscope.ad.p0
            r4.<init>(r2, r3)
        L6a:
            return r4
        L6b:
            xyz.adscope.ad.r6 r4 = new xyz.adscope.ad.r6
            r4.<init>(r2, r3)
            return r4
        L71:
            xyz.adscope.ad.a7 r4 = new xyz.adscope.ad.a7
            r4.<init>(r2, r3)
            return r4
        L77:
            xyz.adscope.ad.t6 r4 = new xyz.adscope.ad.t6
            r4.<init>(r2, r3)
            return r4
        L7d:
            xyz.adscope.ad.x4 r4 = new xyz.adscope.ad.x4
            r4.<init>(r2, r3)
            return r4
        L83:
            if (r5 == 0) goto L8a
            xyz.adscope.ad.q1 r4 = new xyz.adscope.ad.q1
            r4.<init>(r2, r3)
        L8a:
            return r4
    }
}
