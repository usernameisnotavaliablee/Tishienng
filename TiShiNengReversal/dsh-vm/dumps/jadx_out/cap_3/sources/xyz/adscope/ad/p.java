package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
final class p {
    public p() {
            r1 = this;
            r1.<init>()
            return
    }

    static java.lang.String a(xyz.adscope.ad.publish.ASNPInitConfig r0, java.lang.String r1) {
            if (r0 == 0) goto L13
            java.util.Map r0 = r0.getExtConfig()
            if (r0 == 0) goto L13
            java.lang.Object r0 = r0.get(r1)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L13
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L13:
            java.lang.String r0 = ""
            return r0
    }

    static boolean a(xyz.adscope.ad.publish.ASNPInitConfig r0, java.lang.String r1, boolean r2) {
            if (r0 == 0) goto L17
            java.util.Map r0 = r0.getExtConfig()
            if (r0 == 0) goto L17
            java.lang.Object r0 = r0.get(r1)
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 == 0) goto L17
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L17:
            return r2
    }
}
