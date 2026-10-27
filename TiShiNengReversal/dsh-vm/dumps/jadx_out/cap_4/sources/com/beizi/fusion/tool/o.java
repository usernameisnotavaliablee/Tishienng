package com.beizi.fusion.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class o {
    public o() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.util.List<android.util.Pair<java.lang.String, java.lang.Integer>> a(java.util.List<com.beizi.fusion.model.AdSpacesBean.DpLinkUrlListBean> r4) {
            if (r4 == 0) goto L34
            int r0 = r4.size()
            if (r0 != 0) goto L9
            goto L34
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L12:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r4.next()
            com.beizi.fusion.model.AdSpacesBean$DpLinkUrlListBean r1 = (com.beizi.fusion.model.AdSpacesBean.DpLinkUrlListBean) r1
            android.util.Pair r2 = new android.util.Pair
            java.lang.String r3 = r1.getDpLinkUrL()
            int r1 = r1.getOptimizePercent()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.<init>(r3, r1)
            r0.add(r2)
            goto L12
        L33:
            return r0
        L34:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            return r4
    }
}
