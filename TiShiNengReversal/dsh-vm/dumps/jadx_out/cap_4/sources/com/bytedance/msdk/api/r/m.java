package com.bytedance.msdk.api.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class m {
    private java.lang.String ae;
    private java.lang.String cw;
    public final java.lang.String j;

    /* renamed from: m, reason: collision with root package name */
    private java.lang.String f2170m;

    /* renamed from: r, reason: collision with root package name */
    private java.lang.String f2171r;
    private java.util.Map<java.lang.String, java.lang.String> tl;
    private int up;
    private java.lang.String xt;

    public m() {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "TTMediationSDK"
            r2.j = r0
            java.lang.String r0 = ""
            r2.xt = r0
            r2.cw = r0
            r2.f2171r = r0
            r1 = 0
            r2.up = r1
            r2.f2170m = r0
            r2.ae = r0
            return
    }

    public static boolean m(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.String r0 = "[A-Za-z0-9-_]{1,100}"
            boolean r1 = r1.matches(r0)
            return r1
    }

    @androidx.annotation.Nullable
    public java.lang.String ae() {
            r1 = this;
            java.lang.String r0 = r1.ae
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.String cw() {
            r1 = this;
            java.lang.String r0 = r1.cw
            return r0
    }

    public void cw(java.lang.String r2) {
            r1 = this;
            boolean r0 = m(r2)
            if (r0 == 0) goto L9
            r1.f2171r = r2
            return
        L9:
            java.lang.String r2 = "TTMediationSDK"
            java.lang.String r0 = "流量分组sub_channer字段存在不合法输入"
            com.bytedance.sdk.component.utils.vl.r(r2, r0)
            return
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto Lba
            java.lang.Class r2 = r6.getClass()
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L13
            goto Lba
        L13:
            com.bytedance.msdk.api.r.m r7 = (com.bytedance.msdk.api.r.m) r7
            int r2 = r6.up()
            int r3 = r7.up()
            if (r2 != r3) goto L67
            java.lang.String r2 = r6.ae()
            java.lang.String r3 = r7.ae()
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L67
            java.lang.String r2 = r6.xt()
            java.lang.String r3 = r7.xt()
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L67
            java.lang.String r2 = r6.cw()
            java.lang.String r3 = r7.cw()
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L67
            java.lang.String r2 = r6.r()
            java.lang.String r3 = r7.r()
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L67
            java.lang.String r2 = r6.m()
            java.lang.String r3 = r7.m()
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L67
            r2 = 1
            goto L68
        L67:
            r2 = 0
        L68:
            java.util.Map r7 = r7.j()
            java.util.Map<java.lang.String, java.lang.String> r3 = r6.tl
            if (r3 == 0) goto Laf
            if (r7 == 0) goto Laf
            int r3 = r3.size()
            int r4 = r7.size()
            if (r3 != r4) goto Lb4
            java.util.Map<java.lang.String, java.lang.String> r3 = r6.tl
            java.util.Set r3 = r3.keySet()
            java.util.Iterator r3 = r3.iterator()
        L86:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lad
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L86
            java.util.Map<java.lang.String, java.lang.String> r5 = r6.tl
            java.lang.Object r5 = r5.get(r4)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.lang.Object r4 = r7.get(r4)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.equals(r5, r4)
            if (r4 == 0) goto Lb4
            goto L86
        Lad:
            r7 = 1
            goto Lb5
        Laf:
            if (r3 != 0) goto Lb4
            if (r7 != 0) goto Lb4
            goto Lad
        Lb4:
            r7 = 0
        Lb5:
            if (r2 == 0) goto Lba
            if (r7 == 0) goto Lba
            return r0
        Lba:
            return r1
    }

    @androidx.annotation.Nullable
    public java.util.Map<java.lang.String, java.lang.String> j() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.tl
            return r0
    }

    public void j(int r1) {
            r0 = this;
            r0.up = r1
            return
    }

    public void j(java.lang.String r2) {
            r1 = this;
            boolean r0 = m(r2)
            if (r0 == 0) goto L9
            r1.xt = r2
            return
        L9:
            java.lang.String r2 = "TTMediationSDK"
            java.lang.String r0 = "流量分组user_id字段存在不合法输入"
            com.bytedance.sdk.component.utils.vl.r(r2, r0)
            return
    }

    public void j(java.util.Map<java.lang.String, java.lang.String> r5) {
            r4 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.tl = r0
            if (r5 == 0) goto L93
            int r0 = r5.size()
            if (r0 <= 0) goto L93
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L17:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L93
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            if (r0 == 0) goto L17
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = m(r1)
            java.lang.String r2 = "流量分组"
            java.lang.String r3 = "TTMediationSDK"
            if (r1 != 0) goto L50
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            java.lang.Object r0 = r0.getKey()
            java.lang.String r0 = (java.lang.String) r0
            r1.append(r0)
            java.lang.String r0 = "字段存在不合法输入"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.bytedance.sdk.component.utils.vl.r(r3, r0)
            goto L17
        L50:
            java.lang.Object r1 = r0.getValue()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = m(r1)
            if (r1 != 0) goto L85
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            java.lang.Object r2 = r0.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r1.append(r2)
            java.lang.String r2 = "字段的值"
            r1.append(r2)
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r1.append(r0)
            java.lang.String r0 = "存在不合法输入"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.bytedance.sdk.component.utils.vl.r(r3, r0)
            goto L17
        L85:
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.tl
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r1.put(r2, r0)
            goto L17
        L93:
            return
    }

    @androidx.annotation.Nullable
    public java.lang.String m() {
            r1 = this;
            java.lang.String r0 = r1.f2170m
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.String r() {
            r1 = this;
            java.lang.String r0 = r1.f2171r
            return r0
    }

    public void r(java.lang.String r2) {
            r1 = this;
            boolean r0 = m(r2)
            if (r0 == 0) goto L9
            r1.f2170m = r2
            return
        L9:
            java.lang.String r2 = "TTMediationSDK"
            java.lang.String r0 = "流量分组gender字段存在不合法输入"
            com.bytedance.sdk.component.utils.vl.r(r2, r0)
            return
    }

    public int up() {
            r1 = this;
            int r0 = r1.up
            return r0
    }

    public void up(java.lang.String r2) {
            r1 = this;
            boolean r0 = m(r2)
            if (r0 == 0) goto L9
            r1.ae = r2
            return
        L9:
            java.lang.String r2 = "TTMediationSDK"
            java.lang.String r0 = "流量分组user_value_group字段存在不合法输入"
            com.bytedance.sdk.component.utils.vl.r(r2, r0)
            return
    }

    @androidx.annotation.Nullable
    public java.lang.String xt() {
            r1 = this;
            java.lang.String r0 = r1.xt
            return r0
    }

    public void xt(java.lang.String r2) {
            r1 = this;
            boolean r0 = m(r2)
            if (r0 == 0) goto L9
            r1.cw = r2
            return
        L9:
            java.lang.String r2 = "TTMediationSDK"
            java.lang.String r0 = "流量分组channer字段存在不合法输入"
            com.bytedance.sdk.component.utils.vl.r(r2, r0)
            return
    }
}
