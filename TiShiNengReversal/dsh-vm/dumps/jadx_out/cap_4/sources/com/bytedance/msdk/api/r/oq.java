package com.bytedance.msdk.api.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class oq {
    private static long cw = -1;
    private static android.content.Context j = null;

    /* renamed from: r, reason: collision with root package name */
    private static long f2172r = -1;
    private static com.bytedance.msdk.api.r.j xt;


    static {
            return
    }

    public oq() {
            r1 = this;
            r1.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static java.lang.String ae() {
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            java.lang.String r0 = r0.av()
            return r0
    }

    public static long cw() {
            long r0 = com.bytedance.msdk.api.r.oq.f2172r
            return r0
    }

    @androidx.annotation.Nullable
    public static java.lang.String cw(java.lang.String r2) {
            r2.getClass()
            int r0 = r2.hashCode()
            r1 = -1
            switch(r0) {
                case -1841217171: goto L22;
                case -1114711305: goto L17;
                case 112517891: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L2c
        Lc:
            java.lang.String r0 = "tt_pangle_preview_ad_id"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L15
            goto L2c
        L15:
            r1 = 2
            goto L2c
        L17:
            java.lang.String r0 = "tt_pangle_preview_creative_id"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L20
            goto L2c
        L20:
            r1 = 1
            goto L2c
        L22:
            java.lang.String r0 = "tt_pangle_preview_ext"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L2b
            goto L2c
        L2b:
            r1 = 0
        L2c:
            switch(r1) {
                case 0: goto L3b;
                case 1: goto L36;
                case 2: goto L31;
                default: goto L2f;
            }
        L2f:
            r2 = 0
            return r2
        L31:
            java.lang.String r2 = com.bytedance.msdk.tl.r.r.j()
            return r2
        L36:
            java.lang.String r2 = com.bytedance.msdk.tl.r.r.xt()
            return r2
        L3b:
            java.lang.String r2 = com.bytedance.msdk.tl.r.r.cw()
            return r2
    }

    public static boolean g() {
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            boolean r0 = r0.ch()
            return r0
    }

    public static int j(com.bytedance.msdk.api.r.cw r2) {
            com.bytedance.msdk.m.xt.xt r0 = com.bytedance.msdk.m.xt.xt.j()
            java.lang.String r1 = "gdt"
            com.bytedance.msdk.j.j.r r0 = r0.j(r1)
            if (r0 != 0) goto Le
            r2 = 0
            return r2
        Le:
            int r2 = r0.j(r2)
            return r2
    }

    public static void j(int r2) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = com.bytedance.msdk.j.j.j.up
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            com.bytedance.msdk.m.xt.xt r2 = com.bytedance.msdk.m.xt.xt.j()
            java.util.Map r2 = r2.xt()
            if (r2 == 0) goto L3d
            int r2 = r2.size()
            if (r2 != 0) goto L1f
            goto L3d
        L1f:
            com.bytedance.msdk.m.xt.xt r2 = com.bytedance.msdk.m.xt.xt.j()
            java.util.Collection r2 = r2.cw()
            java.util.Iterator r2 = r2.iterator()
        L2b:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r2.next()
            com.bytedance.msdk.j.j.r r1 = (com.bytedance.msdk.j.j.r) r1
            if (r1 == 0) goto L2b
            r1.j(r0)
            goto L2b
        L3d:
            return
    }

    public static void j(android.app.Activity r1, java.util.List<com.bytedance.msdk.api.r.jy> r2, int r3, int r4) {
            com.bytedance.msdk.api.r.oq$1 r0 = new com.bytedance.msdk.api.r.oq$1
            r0.<init>(r1, r2, r3, r4)
            j(r0)
            return
    }

    public static void j(android.content.Context r3) {
            if (r3 != 0) goto L3
            return
        L3:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.bytedance.msdk.api.activity.TTDelegateActivity> r1 = com.bytedance.msdk.api.activity.TTDelegateActivity.class
            r0.<init>(r3, r1)
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r1)
            java.lang.String r1 = "type"
            r2 = 3
            r0.putExtra(r1, r2)
            r1 = 0
            com.bytedance.msdk.tl.r.j(r3, r0, r1)
            return
    }

    public static void j(@androidx.annotation.NonNull android.content.Context r5, @androidx.annotation.NonNull com.bytedance.msdk.api.r.j r6) {
            long r0 = com.bytedance.msdk.api.r.oq.cw
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L35
            long r0 = java.lang.System.currentTimeMillis()
            com.bytedance.msdk.api.r.oq.cw = r0
            if (r6 == 0) goto L1c
            boolean r0 = r6.cw()
            if (r0 == 0) goto L1c
            com.bytedance.msdk.j.up.cw.j()
            com.bytedance.sdk.component.g.j.j()
        L1c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "call init time "
            r0.<init>(r1)
            long r1 = com.bytedance.msdk.api.r.oq.cw
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TMe"
            com.bytedance.msdk.j.up.cw.xt(r1, r0)
            com.bytedance.msdk.api.r.oq.j = r5
            com.bytedance.msdk.api.r.oq.xt = r6
        L35:
            return
    }

    public static void j(android.content.Context r3, int[] r4) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.bytedance.msdk.api.activity.TTDelegateActivity> r1 = com.bytedance.msdk.api.activity.TTDelegateActivity.class
            r0.<init>(r3, r1)
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r1)
            java.lang.String r1 = "type"
            r2 = 1
            r0.putExtra(r1, r2)
            java.lang.String r1 = "permissions"
            r0.putExtra(r1, r4)
            if (r3 == 0) goto L1d
            r4 = 0
            com.bytedance.msdk.tl.r.j(r3, r0, r4)
        L1d:
            return
    }

    public static void j(com.bytedance.msdk.api.r.av r1) {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            r0.j(r1)
            return
    }

    public static void j(com.bytedance.msdk.api.r.j.g.j r1) {
            boolean r0 = com.bytedance.msdk.m.cw.xt()
            if (r0 == 0) goto Lc
            if (r1 == 0) goto Lb
            r1.j()
        Lb:
            return
        Lc:
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            r0.j(r1)
            return
    }

    public static void j(com.bytedance.msdk.api.r.m r2) {
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            r1 = 0
            r0.j(r2, r1)
            return
    }

    public static void j(com.bytedance.sdk.openadsdk.i.cw.cw.r r2) {
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            com.bytedance.msdk.j.cw.cw r0 = r0.xt()
            android.util.SparseArray r1 = com.bytedance.msdk.m.xt.up.j(r2)
            r0.xt(r1)
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            r0.h()
            android.util.SparseArray r2 = com.bytedance.msdk.m.xt.up.j(r2)
            com.bytedance.msdk.m.cw.j(r2)
            return
    }

    public static void j(java.lang.String r2) {
            java.lang.String r0 = "app运行中setPulisherDid: "
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "TTMediationSDK"
            com.bytedance.msdk.j.up.cw.j(r1, r0)
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            r0.r(r2)
            return
    }

    public static boolean j() {
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            java.lang.String r0 = r0.vl()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L10
            r0 = 0
            return r0
        L10:
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.p()
            return r0
    }

    public static boolean j(java.lang.String r0, java.lang.String r1) {
            boolean r0 = com.bytedance.msdk.m.j.j(r0, r1)
            return r0
    }

    @androidx.annotation.Nullable
    public static java.util.Map<java.lang.String, java.lang.Object> jy() {
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            java.util.Map r0 = r0.rh()
            return r0
    }

    @androidx.annotation.Nullable
    @java.lang.Deprecated
    public static com.bytedance.msdk.j.j.r m(java.lang.String r1) {
            com.bytedance.msdk.m.xt.xt r0 = com.bytedance.msdk.m.xt.xt.j()
            com.bytedance.msdk.j.j.r r1 = r0.j(r1)
            return r1
    }

    public static boolean m() {
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            boolean r0 = r0.az()
            return r0
    }

    @androidx.annotation.Nullable
    public static java.lang.String oq() {
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            java.lang.String r0 = r0.tj()
            return r0
    }

    @androidx.annotation.Nullable
    public static java.lang.String qv() {
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            java.lang.String r0 = r0.vl()
            return r0
    }

    public static void r() {
            android.content.Context r0 = com.bytedance.msdk.api.r.oq.j
            if (r0 != 0) goto L5
            goto L9
        L5:
            com.bytedance.msdk.api.r.j r0 = com.bytedance.msdk.api.r.oq.xt
            if (r0 != 0) goto La
        L9:
            return
        La:
            long r0 = com.bytedance.msdk.api.r.oq.f2172r
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L2d
            long r0 = java.lang.System.currentTimeMillis()
            com.bytedance.msdk.api.r.oq.f2172r = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "call start up time "
            r0.<init>(r1)
            long r1 = com.bytedance.msdk.api.r.oq.f2172r
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TMe"
            com.bytedance.msdk.j.up.cw.xt(r1, r0)
        L2d:
            android.content.Context r0 = com.bytedance.msdk.api.r.oq.j
            com.bytedance.msdk.api.r.j r1 = com.bytedance.msdk.api.r.oq.xt
            xt(r0, r1)
            com.bytedance.msdk.m.r.xt()
            return
    }

    @java.lang.Deprecated
    public static boolean r(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            java.lang.String r0 = r0.vl()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L17
            return r1
        L17:
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r2 = r0.cw(r2)
            return r2
    }

    @androidx.annotation.Nullable
    public static java.util.Map<java.lang.String, java.lang.String> tl() {
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            java.util.Map r0 = r0.i()
            return r0
    }

    @androidx.annotation.Nullable
    @java.lang.Deprecated
    public static com.bytedance.msdk.api.r.j.xt.m.j up(java.lang.String r0) {
            com.bytedance.msdk.api.r.j.xt.m.j r0 = com.bytedance.msdk.m.xt.j.j(r0)
            return r0
    }

    public static java.lang.String up() {
            java.lang.String r0 = com.bytedance.msdk.xt.xt.xt()
            return r0
    }

    @java.lang.Deprecated
    public static void vl() {
            com.bytedance.msdk.tl.l r0 = com.bytedance.msdk.ae.j.j()
            java.lang.String r1 = "if_test"
            int r0 = r0.cw(r1)
            com.bytedance.msdk.core.ws.cw r1 = com.bytedance.msdk.core.xt.xt()
            r1.cw(r0)
            return
    }

    public static long xt() {
            long r0 = com.bytedance.msdk.api.r.oq.cw
            return r0
    }

    @androidx.annotation.Nullable
    public static java.lang.String xt(android.content.Context r0) {
            java.lang.String r0 = com.bytedance.msdk.tl.x.xt()
            return r0
    }

    @java.lang.Deprecated
    public static void xt(int r1) {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            r0.cw(r1)
            return
    }

    private static void xt(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull com.bytedance.msdk.api.r.j r3) {
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            java.lang.String r1 = r3.j()
            r0.cw(r1)
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            boolean r1 = r3.av()
            r0.cw(r1)
            com.bytedance.msdk.ae.xt.j r0 = com.bytedance.msdk.ae.xt.j.j()
            r0.m()
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            com.bytedance.msdk.m.cw.j(r3, r2)
            com.bytedance.msdk.ae.xt.j r2 = com.bytedance.msdk.ae.xt.j.j()
            r2.ae()
            return
    }

    public static void xt(java.lang.String r1) {
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            r0.up(r1)
            return
    }

    public static boolean xt(java.lang.String r0, java.lang.String r1) {
            boolean r0 = com.bytedance.msdk.m.j.xt(r0, r1)
            return r0
    }
}
