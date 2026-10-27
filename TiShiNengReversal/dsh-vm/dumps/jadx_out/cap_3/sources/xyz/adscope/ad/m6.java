package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class m6 {
    public m6() {
            r1 = this;
            r1.<init>()
            return
    }

    public static xyz.adscope.ad.b4 a(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r2 = r2.toLowerCase(r0)
            int r0 = r2.hashCode()
            switch(r0) {
                case -934795532: goto Lf1;
                case -905948230: goto Le3;
                case -793319857: goto Ld5;
                case 114586: goto Lc7;
                case 117588: goto Lad;
                case 3327403: goto L9f;
                case 3556653: goto L85;
                case 3619493: goto L7d;
                case 100313435: goto L63;
                case 109399814: goto L55;
                case 109526449: goto L47;
                case 112202875: goto L39;
                case 112386354: goto L2b;
                case 1091550823: goto L1d;
                case 1547952107: goto Lf;
                default: goto Ld;
            }
        Ld:
            goto Lff
        Lf:
            java.lang.String r0 = "capsuleclose"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto Lff
            xyz.adscope.ad.ad.nativead.render.view.asnp.interaction.b r2 = new xyz.adscope.ad.ad.nativead.render.view.asnp.interaction.b
            r2.<init>(r1)
            return r2
        L1d:
            java.lang.String r0 = "countdownclose"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto Lff
            xyz.adscope.ad.ad.nativead.render.view.asnp.interaction.a r2 = new xyz.adscope.ad.ad.nativead.render.view.asnp.interaction.a
            r2.<init>(r1)
            return r2
        L2b:
            java.lang.String r0 = "voice"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto Lff
            xyz.adscope.ad.d6 r2 = new xyz.adscope.ad.d6
            r2.<init>(r1)
            return r2
        L39:
            java.lang.String r0 = "video"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto Lff
            xyz.adscope.ad.l6 r2 = new xyz.adscope.ad.l6
            r2.<init>(r1)
            return r2
        L47:
            java.lang.String r0 = "slide"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto Lff
            xyz.adscope.ad.g6 r2 = new xyz.adscope.ad.g6
            r2.<init>(r1)
            return r2
        L55:
            java.lang.String r0 = "shake"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto Lff
            xyz.adscope.ad.f6 r2 = new xyz.adscope.ad.f6
            r2.<init>(r1)
            return r2
        L63:
            java.lang.String r0 = "image"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto Lff
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L77
            xyz.adscope.ad.y5 r2 = new xyz.adscope.ad.y5
            r2.<init>(r1)
            return r2
        L77:
            xyz.adscope.ad.x5 r2 = new xyz.adscope.ad.x5
            r2.<init>(r1)
            return r2
        L7d:
            java.lang.String r0 = "view"
            boolean r2 = r2.equals(r0)
            goto Lff
        L85:
            java.lang.String r0 = "text"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto Lff
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L99
            xyz.adscope.ad.ad.nativead.render.view.asnp.interaction.c r2 = new xyz.adscope.ad.ad.nativead.render.view.asnp.interaction.c
            r2.<init>(r1)
            return r2
        L99:
            xyz.adscope.ad.i6 r2 = new xyz.adscope.ad.i6
            r2.<init>(r1)
            return r2
        L9f:
            java.lang.String r0 = "logo"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto Lff
            xyz.adscope.ad.c6 r2 = new xyz.adscope.ad.c6
            r2.<init>(r1)
            return r2
        Lad:
            java.lang.String r0 = "web"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto Lff
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto Lc1
            xyz.adscope.ad.b6 r2 = new xyz.adscope.ad.b6
            r2.<init>(r1)
            return r2
        Lc1:
            xyz.adscope.ad.o6 r2 = new xyz.adscope.ad.o6
            r2.<init>(r1)
            return r2
        Lc7:
            java.lang.String r0 = "tag"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto Lff
            xyz.adscope.ad.z5 r2 = new xyz.adscope.ad.z5
            r2.<init>(r1)
            return r2
        Ld5:
            java.lang.String r0 = "appinfo"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto Lff
            xyz.adscope.ad.u5 r2 = new xyz.adscope.ad.u5
            r2.<init>(r1)
            return r2
        Le3:
            java.lang.String r0 = "sensor"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto Lff
            xyz.adscope.ad.w5 r2 = new xyz.adscope.ad.w5
            r2.<init>(r1)
            return r2
        Lf1:
            java.lang.String r0 = "region"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto Lff
            xyz.adscope.ad.e6 r2 = new xyz.adscope.ad.e6
            r2.<init>(r1)
            return r2
        Lff:
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L10b
            xyz.adscope.ad.a6 r2 = new xyz.adscope.ad.a6
            r2.<init>(r1)
            return r2
        L10b:
            xyz.adscope.ad.n6 r2 = new xyz.adscope.ad.n6
            r2.<init>(r1)
            return r2
    }
}
