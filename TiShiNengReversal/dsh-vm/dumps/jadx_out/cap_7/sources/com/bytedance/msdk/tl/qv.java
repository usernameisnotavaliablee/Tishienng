package com.bytedance.msdk.tl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class qv {
    private static boolean j;
    private static boolean xt;

    static {
            return
    }

    public qv() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.util.List<java.lang.String> j() {
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            boolean r0 = r0.ch()
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            java.lang.Class<com.bytedance.msdk.core.oq.xt> r0 = com.bytedance.msdk.core.oq.xt.class
            java.lang.reflect.Field[] r0 = r0.getDeclaredFields()
            if (r0 == 0) goto L6e
            int r2 = r0.length
            if (r2 != 0) goto L18
            goto L6e
        L18:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.length
            r3 = 0
        L1f:
            if (r3 >= r2) goto L41
            r4 = r0[r3]
            java.lang.String r5 = r4.getName()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L3e
            int r5 = r4.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isFinal(r5)
            if (r5 != 0) goto L3e
            java.lang.String r4 = r4.getName()
            r1.add(r4)
        L3e:
            int r3 = r3 + 1
            goto L1f
        L41:
            java.lang.String r0 = "mTotalWaterFallCount"
            r1.remove(r0)
            java.lang.String r0 = "mWaterFallConfigList"
            r1.remove(r0)
            java.lang.String r0 = "mWaterFallConfMap"
            r1.remove(r0)
            java.lang.String r0 = "mTotalLoadLevelCount"
            r1.remove(r0)
            java.lang.String r0 = "mCurrentCommonAdMaxCpm"
            r1.remove(r0)
            java.lang.String r0 = "mLoadSortLevelList"
            r1.remove(r0)
            java.lang.String r0 = "hasServerBidding"
            r1.remove(r0)
            java.lang.String r0 = "hasClientOrMultiLevel"
            r1.remove(r0)
            java.lang.String r0 = "mRitInfoJson"
            r1.remove(r0)
        L6e:
            return r1
    }

    public static void j(java.util.List<java.lang.String> r1, java.lang.String r2) {
            if (r1 != 0) goto L3
            goto L9
        L3:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto La
        L9:
            return
        La:
            r1.remove(r2)
            return
    }

    public static java.util.List<java.lang.String> xt() {
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            boolean r0 = r0.ch()
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            java.lang.Class<com.bytedance.msdk.core.oq.oq> r0 = com.bytedance.msdk.core.oq.oq.class
            java.lang.reflect.Field[] r0 = r0.getDeclaredFields()
            if (r0 == 0) goto L46
            int r2 = r0.length
            if (r2 != 0) goto L18
            goto L46
        L18:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.length
            r3 = 0
        L1f:
            if (r3 >= r2) goto L41
            r4 = r0[r3]
            java.lang.String r5 = r4.getName()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L3e
            int r5 = r4.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isFinal(r5)
            if (r5 != 0) goto L3e
            java.lang.String r4 = r4.getName()
            r1.add(r4)
        L3e:
            int r3 = r3 + 1
            goto L1f
        L41:
            java.lang.String r0 = "mServerBiddingWinner"
            r1.remove(r0)
        L46:
            return r1
    }

    public static void xt(java.util.List<java.lang.String> r0, java.lang.String r1) {
            return
    }
}
