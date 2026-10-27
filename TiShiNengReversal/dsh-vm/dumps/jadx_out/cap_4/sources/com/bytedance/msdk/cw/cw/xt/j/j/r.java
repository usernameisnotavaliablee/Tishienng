package com.bytedance.msdk.cw.cw.xt.j.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class r extends com.bytedance.msdk.cw.cw.xt.j.j.xt {
    public r(java.lang.String r1, com.bytedance.msdk.cw.j.xt r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public boolean cw() {
            r3 = this;
            com.bytedance.msdk.api.r.j.xt.cw.cw r0 = r3.xt
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r0.xt()
            r2 = 1
            if (r0 != r2) goto Le
            return r2
        Le:
            return r1
    }

    @Override // com.bytedance.msdk.cw.cw.xt.j.j.xt
    public <T> T j(int r3, com.bykv.vk.openvk.api.proto.PluginValueSet r4, java.lang.Class<T> r5) {
            r2 = this;
            r5 = 8222(0x201e, float:1.1521E-41)
            java.lang.String r0 = "TTMediationSDK"
            if (r3 != r5) goto L20
            boolean r3 = r2.cw()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Adn custom feed loader : isExpressRender: "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            com.bytedance.msdk.j.up.cw.xt(r0, r4)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        L20:
            r5 = 8223(0x201f, float:1.1523E-41)
            if (r3 != r5) goto L3e
            boolean r3 = r2.r()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Adn custom feed loader : isNativeAd: "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            com.bytedance.msdk.j.up.cw.xt(r0, r4)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        L3e:
            r5 = 8123(0x1fbb, float:1.1383E-41)
            if (r3 != r5) goto L6b
            r3 = 8014(0x1f4e, float:1.123E-41)
            int r3 = r4.intValue(r3)
            r5 = 8015(0x1f4f, float:1.1231E-41)
            java.lang.String r4 = r4.stringValue(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "Adn custom feed loader : callLoaderFail  code:"
            r5.<init>(r1)
            r5.append(r3)
            java.lang.String r1 = " msg:"
            r5.append(r1)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            com.bytedance.msdk.j.up.cw.xt(r0, r5)
            r2.j(r3, r4)
            goto L95
        L6b:
            r5 = 8107(0x1fab, float:1.136E-41)
            if (r3 != r5) goto L95
            r3 = 8303(0x206f, float:1.1635E-41)
            java.lang.Class<java.util.List> r5 = java.util.List.class
            java.lang.Object r3 = r4.objectValue(r3, r5)
            java.util.List r3 = (java.util.List) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Adn custom feed loader : callLoadSucceed  list size:"
            r4.<init>(r5)
            if (r3 == 0) goto L87
            int r5 = r3.size()
            goto L88
        L87:
            r5 = 0
        L88:
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.bytedance.msdk.j.up.cw.xt(r0, r4)
            r2.xt(r3)
        L95:
            r3 = 0
            return r3
    }

    public void j(com.bytedance.msdk.api.r.j.xt.j r5) {
            r4 = this;
            boolean r0 = r4.j()
            if (r0 != 0) goto L27
            com.bytedance.msdk.api.j r0 = new com.bytedance.msdk.api.j
            r1 = 49010(0xbf72, float:6.8678E-41)
            java.lang.String r2 = com.bytedance.msdk.api.j.j(r1)
            if (r5 != 0) goto L13
            r3 = -1
            goto L17
        L13:
            int r3 = r5.j()
        L17:
            if (r5 != 0) goto L1c
            java.lang.String r5 = ""
            goto L20
        L1c:
            java.lang.String r5 = r5.xt()
        L20:
            r0.<init>(r1, r2, r3, r5)
            r4.j(r0)
            return
        L27:
            java.lang.String r5 = "TTMediationSDK"
            java.lang.String r0 = "自定义Adapter 加载成功或者失败回调只能调用一次"
            com.bytedance.msdk.j.up.cw.r(r5, r0)
            return
    }

    public boolean r() {
            r3 = this;
            com.bytedance.msdk.api.r.j.xt.cw.cw r0 = r3.xt
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r0.xt()
            r2 = 2
            if (r0 != r2) goto Lf
            r0 = 1
            return r0
        Lf:
            return r1
    }

    public void xt(java.util.List<java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object>> r4) {
            r3 = this;
            if (r4 == 0) goto L38
            boolean r0 = r3.xt()
            if (r0 != 0) goto L30
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        L15:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r4.next()
            java.util.function.Function r1 = z0.b.a(r1)
            com.bytedance.msdk.cw.j.j.up r2 = new com.bytedance.msdk.cw.j.j.up
            r2.<init>(r3, r1)
            r0.add(r2)
            goto L15
        L2c:
            r3.j(r0)
            return
        L30:
            java.lang.String r4 = "TTMediationSDK"
            java.lang.String r0 = "自定义Adapter 加载成功或者失败回调只能调用一次"
            com.bytedance.msdk.j.up.cw.r(r4, r0)
            return
        L38:
            com.bytedance.msdk.api.r.j.xt.j r4 = new com.bytedance.msdk.api.r.j.xt.j
            r0 = 49010(0xbf72, float:6.8678E-41)
            java.lang.String r1 = "list is null"
            r4.<init>(r0, r1)
            r3.j(r4)
            return
    }
}
