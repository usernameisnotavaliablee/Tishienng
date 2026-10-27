package com.bytedance.msdk.cw.cw.xt.j.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class m extends com.bytedance.msdk.cw.cw.xt.j.j.xt {
    private com.bytedance.msdk.cw.j.j.cw g;






    public m(java.lang.String r1, com.bytedance.msdk.cw.j.xt r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    static /* synthetic */ com.bytedance.msdk.cw.j.j.cw j(com.bytedance.msdk.cw.cw.xt.j.j.m r0) {
            com.bytedance.msdk.cw.j.j.cw r0 = r0.g
            return r0
    }

    public void az() {
            r1 = this;
            com.bytedance.msdk.cw.j.j.cw r0 = r1.g
            if (r0 == 0) goto Lc
            com.bytedance.msdk.cw.cw.xt.j.j.m$5 r0 = new com.bytedance.msdk.cw.cw.xt.j.j.m$5
            r0.<init>(r1)
            r1.j(r0)
        Lc:
            return
    }

    public void cw() {
            r1 = this;
            com.bytedance.msdk.cw.j.j.cw r0 = r1.g
            if (r0 == 0) goto Lc
            com.bytedance.msdk.cw.cw.xt.j.j.m$1 r0 = new com.bytedance.msdk.cw.cw.xt.j.j.m$1
            r0.<init>(r1)
            r1.j(r0)
        Lc:
            return
    }

    @Override // com.bytedance.msdk.cw.cw.xt.j.j.xt
    public <T> T j(int r5, com.bykv.vk.openvk.api.proto.PluginValueSet r6, java.lang.Class<T> r7) {
            r4 = this;
            r7 = 8123(0x1fbb, float:1.1383E-41)
            r0 = 0
            java.lang.String r1 = "TTMediationSDK"
            if (r5 != r7) goto L31
            r5 = 8014(0x1f4e, float:1.123E-41)
            int r5 = r6.intValue(r5)
            r7 = 8015(0x1f4f, float:1.1231E-41)
            java.lang.String r6 = r6.stringValue(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = "Adn custom interstitial loader : callLoaderFail  code:"
            r7.<init>(r2)
            r7.append(r5)
            java.lang.String r2 = " msg:"
            r7.append(r2)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            com.bytedance.msdk.j.up.cw.xt(r1, r7)
            r4.j(r5, r6)
            goto La8
        L31:
            r7 = 8107(0x1fab, float:1.136E-41)
            if (r5 != r7) goto L68
            if (r6 == 0) goto L48
            r5 = 8409(0x20d9, float:1.1784E-41)
            double r2 = r6.doubleValue(r5)
            r5 = 8075(0x1f8b, float:1.1315E-41)
            java.lang.Class<java.util.Map> r7 = java.util.Map.class
            java.lang.Object r5 = r6.objectValue(r5, r7)
            java.util.Map r5 = (java.util.Map) r5
            goto L4b
        L48:
            r2 = 0
            r5 = r0
        L4b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Adn custom interstitial loader : callLoadSucceed price:"
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r7 = " mextraMsg:"
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            com.bytedance.msdk.j.up.cw.xt(r1, r6)
            r4.j(r2, r5)
            goto La8
        L68:
            r6 = 1008(0x3f0, float:1.413E-42)
            if (r5 != r6) goto L75
            java.lang.String r5 = "Adn custom interstitial loader : callInterstitialShow"
            com.bytedance.msdk.j.up.cw.xt(r1, r5)
            r4.cw()
            goto La8
        L75:
            r6 = 1009(0x3f1, float:1.414E-42)
            if (r5 != r6) goto L82
            java.lang.String r5 = "Adn custom interstitial loader : callInterstitialAdClick"
            com.bytedance.msdk.j.up.cw.xt(r1, r5)
            r4.r()
            goto La8
        L82:
            r6 = 1014(0x3f6, float:1.421E-42)
            if (r5 != r6) goto L8f
            java.lang.String r5 = "Adn custom interstitial loader : callInterstitialClosed"
            com.bytedance.msdk.j.up.cw.xt(r1, r5)
            r4.up()
            goto La8
        L8f:
            r6 = 1015(0x3f7, float:1.422E-42)
            if (r5 != r6) goto L9c
            java.lang.String r5 = "Adn custom interstitial loader : callInterstitialAdOpened"
            com.bytedance.msdk.j.up.cw.xt(r1, r5)
            r4.ws()
            goto La8
        L9c:
            r6 = 1016(0x3f8, float:1.424E-42)
            if (r5 != r6) goto La8
            java.lang.String r5 = "Adn custom interstitial loader : callInterstitialAdLeftApplication"
            com.bytedance.msdk.j.up.cw.xt(r1, r5)
            r4.az()
        La8:
            return r0
    }

    public void j(double r3, java.util.Map<java.lang.String, java.lang.Object> r5) {
            r2 = this;
            boolean r0 = r2.xt()
            java.lang.String r1 = "TTMediationSDK"
            if (r0 != 0) goto L1a
            java.lang.String r0 = "自定义Adapter callLoadSuccess"
            com.bytedance.msdk.j.up.cw.r(r1, r0)
            com.bytedance.msdk.cw.j.j.ae r0 = new com.bytedance.msdk.cw.j.j.ae
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r1 = r2.cw
            r0.<init>(r2, r1)
            r2.g = r0
            r2.j(r0, r3, r5)
            return
        L1a:
            java.lang.String r3 = "自定义Adapter 加载成功或者失败回调只能调用一次"
            com.bytedance.msdk.j.up.cw.r(r1, r3)
            return
    }

    public void r() {
            r1 = this;
            com.bytedance.msdk.cw.j.j.cw r0 = r1.g
            if (r0 == 0) goto Lc
            com.bytedance.msdk.cw.cw.xt.j.j.m$2 r0 = new com.bytedance.msdk.cw.cw.xt.j.j.m$2
            r0.<init>(r1)
            r1.j(r0)
        Lc:
            return
    }

    public void up() {
            r1 = this;
            com.bytedance.msdk.cw.j.j.cw r0 = r1.g
            if (r0 == 0) goto Lc
            com.bytedance.msdk.cw.cw.xt.j.j.m$3 r0 = new com.bytedance.msdk.cw.cw.xt.j.j.m$3
            r0.<init>(r1)
            r1.j(r0)
        Lc:
            return
    }

    public void ws() {
            r1 = this;
            com.bytedance.msdk.cw.j.j.cw r0 = r1.g
            if (r0 == 0) goto Lc
            com.bytedance.msdk.cw.cw.xt.j.j.m$4 r0 = new com.bytedance.msdk.cw.cw.xt.j.j.m$4
            r0.<init>(r1)
            r1.j(r0)
        Lc:
            return
    }
}
