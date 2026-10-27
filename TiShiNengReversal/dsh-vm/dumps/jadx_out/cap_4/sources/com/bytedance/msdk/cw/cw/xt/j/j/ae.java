package com.bytedance.msdk.cw.cw.xt.j.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ae extends com.bytedance.msdk.cw.cw.xt.j.j.xt {
    private volatile com.bytedance.msdk.cw.j.j.cw g;









    public ae(java.lang.String r1, com.bytedance.msdk.cw.j.xt r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    static /* synthetic */ com.bytedance.msdk.cw.j.j.cw j(com.bytedance.msdk.cw.cw.xt.j.j.ae r0) {
            com.bytedance.msdk.cw.j.j.cw r0 = r0.g
            return r0
    }

    public final void av() {
            r1 = this;
            com.bytedance.msdk.cw.j.j.cw r0 = r1.g
            if (r0 == 0) goto Lc
            com.bytedance.msdk.cw.cw.xt.j.j.ae$5 r0 = new com.bytedance.msdk.cw.cw.xt.j.j.ae$5
            r0.<init>(r1)
            r1.j(r0)
        Lc:
            return
    }

    public final void az() {
            r1 = this;
            com.bytedance.msdk.cw.j.j.cw r0 = r1.g
            if (r0 == 0) goto Lc
            com.bytedance.msdk.cw.cw.xt.j.j.ae$4 r0 = new com.bytedance.msdk.cw.cw.xt.j.j.ae$4
            r0.<init>(r1)
            r1.j(r0)
        Lc:
            return
    }

    public void cw() {
            r2 = this;
            com.bytedance.msdk.cw.j.j.cw r0 = r2.g
            if (r0 != 0) goto Ld
            com.bytedance.msdk.cw.j.j.g r0 = new com.bytedance.msdk.cw.j.j.g
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r1 = r2.cw
            r0.<init>(r2, r1)
            r2.g = r0
        Ld:
            com.bytedance.msdk.cw.j.j.cw r0 = r2.g
            r1 = 0
            r2.j(r0, r1)
            return
    }

    public final void i() {
            r1 = this;
            com.bytedance.msdk.cw.j.j.cw r0 = r1.g
            if (r0 == 0) goto Lc
            com.bytedance.msdk.cw.cw.xt.j.j.ae$6 r0 = new com.bytedance.msdk.cw.cw.xt.j.j.ae$6
            r0.<init>(r1)
            r1.j(r0)
        Lc:
            return
    }

    @Override // com.bytedance.msdk.cw.cw.xt.j.j.xt
    public <T> T j(int r11, com.bykv.vk.openvk.api.proto.PluginValueSet r12, java.lang.Class<T> r13) {
            r10 = this;
            r13 = 8123(0x1fbb, float:1.1383E-41)
            r0 = 0
            java.lang.String r1 = "TTMediationSDK"
            if (r11 != r13) goto L32
            r11 = 8014(0x1f4e, float:1.123E-41)
            int r11 = r12.intValue(r11)
            r13 = 8015(0x1f4f, float:1.1231E-41)
            java.lang.String r12 = r12.stringValue(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r2 = "Adn custom reward loader : callLoaderFail  code:"
            r13.<init>(r2)
            r13.append(r11)
            java.lang.String r2 = " msg:"
            r13.append(r2)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            com.bytedance.msdk.j.up.cw.xt(r1, r13)
            r10.j(r11, r12)
        L2f:
            r5 = r10
            goto L117
        L32:
            r13 = 8107(0x1fab, float:1.136E-41)
            java.lang.Class<java.util.Map> r2 = java.util.Map.class
            r3 = 8075(0x1f8b, float:1.1315E-41)
            if (r11 != r13) goto L69
            if (r12 == 0) goto L49
            r11 = 8409(0x20d9, float:1.1784E-41)
            double r4 = r12.doubleValue(r11)
            java.lang.Object r11 = r12.objectValue(r3, r2)
            java.util.Map r11 = (java.util.Map) r11
            goto L4c
        L49:
            r4 = 0
            r11 = r0
        L4c:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Adn custom reward loader : callLoadSucceed price:"
            r12.<init>(r13)
            r12.append(r4)
            java.lang.String r13 = " mextraMsg:"
            r12.append(r13)
            r12.append(r11)
            java.lang.String r12 = r12.toString()
            com.bytedance.msdk.j.up.cw.xt(r1, r12)
            r10.j(r4, r11)
            goto L2f
        L69:
            r13 = 8112(0x1fb0, float:1.1367E-41)
            if (r11 != r13) goto L76
            java.lang.String r11 = "Adn custom reward loader : callAdVideoCache"
            com.bytedance.msdk.j.up.cw.xt(r1, r11)
            r10.cw()
            goto L2f
        L76:
            r13 = 1008(0x3f0, float:1.413E-42)
            if (r11 != r13) goto L83
            java.lang.String r11 = "Adn custom reward loader : callRewardedAdShow"
            com.bytedance.msdk.j.up.cw.xt(r1, r11)
            r10.r()
            goto L2f
        L83:
            r13 = 1009(0x3f1, float:1.414E-42)
            if (r11 != r13) goto L90
            java.lang.String r11 = "Adn custom reward loader : callRewardClick"
            com.bytedance.msdk.j.up.cw.xt(r1, r11)
            r10.up()
            goto L2f
        L90:
            r13 = 1014(0x3f6, float:1.421E-42)
            if (r11 != r13) goto L9d
            java.lang.String r11 = "Adn custom reward loader : callRewardedAdClosed"
            com.bytedance.msdk.j.up.cw.xt(r1, r11)
            r10.ws()
            goto L2f
        L9d:
            r13 = 1026(0x402, float:1.438E-42)
            if (r11 != r13) goto Laa
            java.lang.String r11 = "Adn custom reward loader : callRewardVideoComplete"
            com.bytedance.msdk.j.up.cw.xt(r1, r11)
            r10.az()
            goto L2f
        Laa:
            r13 = 1021(0x3fd, float:1.431E-42)
            if (r11 != r13) goto Lb8
            java.lang.String r11 = "Adn custom reward loader : callRewardVideoError"
            com.bytedance.msdk.j.up.cw.xt(r1, r11)
            r10.av()
            goto L2f
        Lb8:
            r13 = 1037(0x40d, float:1.453E-42)
            if (r11 != r13) goto Lc6
            java.lang.String r11 = "Adn custom reward loader : callRewardSkippedVideo"
            com.bytedance.msdk.j.up.cw.xt(r1, r11)
            r10.i()
            goto L2f
        Lc6:
            r13 = 1018(0x3fa, float:1.427E-42)
            if (r11 != r13) goto L2f
            if (r12 == 0) goto L2f
            r11 = 8017(0x1f51, float:1.1234E-41)
            boolean r6 = r12.booleanValue(r11)
            r11 = 8018(0x1f52, float:1.1236E-41)
            float r7 = r12.floatValue(r11)
            r11 = 8019(0x1f53, float:1.1237E-41)
            java.lang.String r8 = r12.stringValue(r11)
            java.lang.Object r11 = r12.objectValue(r3, r2)
            r9 = r11
            java.util.Map r9 = (java.util.Map) r9
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Adn custom reward loader : callRewardVerify rewardVerify:"
            r11.<init>(r12)
            r11.append(r6)
            java.lang.String r12 = " amount:"
            r11.append(r12)
            r11.append(r7)
            java.lang.String r12 = " name:"
            r11.append(r12)
            r11.append(r8)
            java.lang.String r12 = " map:"
            r11.append(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            com.bytedance.msdk.j.up.cw.xt(r1, r11)
            com.bytedance.msdk.cw.cw.xt.j.j.ae$8 r4 = new com.bytedance.msdk.cw.cw.xt.j.j.ae$8
            r5 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r10.j(r4)
        L117:
            return r0
    }

    public void j(double r3, java.util.Map<java.lang.String, java.lang.Object> r5) {
            r2 = this;
            boolean r0 = r2.xt()
            java.lang.String r1 = "TTMediationSDK"
            if (r0 != 0) goto L20
            java.lang.String r0 = "自定义Adapter callLoadSuccess"
            com.bytedance.msdk.j.up.cw.r(r1, r0)
            com.bytedance.msdk.cw.j.j.cw r0 = r2.g
            if (r0 != 0) goto L1a
            com.bytedance.msdk.cw.j.j.g r0 = new com.bytedance.msdk.cw.j.j.g
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r1 = r2.cw
            r0.<init>(r2, r1)
            r2.g = r0
        L1a:
            com.bytedance.msdk.cw.j.j.cw r0 = r2.g
            r2.j(r0, r3, r5)
            return
        L20:
            java.lang.String r3 = "自定义Adapter 加载成功或者失败回调只能调用一次"
            com.bytedance.msdk.j.up.cw.r(r1, r3)
            return
    }

    public final void j(com.bytedance.msdk.api.cw.j r2) {
            r1 = this;
            com.bytedance.msdk.cw.j.j.cw r0 = r1.g
            if (r0 == 0) goto Lc
            com.bytedance.msdk.cw.cw.xt.j.j.ae$7 r0 = new com.bytedance.msdk.cw.cw.xt.j.j.ae$7
            r0.<init>(r1, r2)
            r1.j(r0)
        Lc:
            return
    }

    public void r() {
            r1 = this;
            com.bytedance.msdk.cw.j.j.cw r0 = r1.g
            if (r0 == 0) goto Lc
            com.bytedance.msdk.cw.cw.xt.j.j.ae$1 r0 = new com.bytedance.msdk.cw.cw.xt.j.j.ae$1
            r0.<init>(r1)
            r1.j(r0)
        Lc:
            return
    }

    public final void up() {
            r1 = this;
            com.bytedance.msdk.cw.j.j.cw r0 = r1.g
            if (r0 == 0) goto Lc
            com.bytedance.msdk.cw.cw.xt.j.j.ae$2 r0 = new com.bytedance.msdk.cw.cw.xt.j.j.ae$2
            r0.<init>(r1)
            r1.j(r0)
        Lc:
            return
    }

    public final void ws() {
            r1 = this;
            com.bytedance.msdk.cw.j.j.cw r0 = r1.g
            if (r0 == 0) goto Lc
            com.bytedance.msdk.cw.cw.xt.j.j.ae$3 r0 = new com.bytedance.msdk.cw.cw.xt.j.j.ae$3
            r0.<init>(r1)
            r1.j(r0)
        Lc:
            return
    }
}
