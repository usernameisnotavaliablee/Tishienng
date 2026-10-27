package com.bytedance.msdk.m.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public abstract class oq extends com.bytedance.msdk.m.j.r {
    protected java.lang.String j;

    public oq() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            com.bytedance.msdk.core.oq.j r0 = r1.ae()
            if (r0 == 0) goto L10
            java.lang.String r0 = r0.j()
            r1.j = r0
        L10:
            java.lang.String r0 = r1.j
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L22
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            java.lang.String r0 = r0.vl()
            r1.j = r0
        L22:
            return
    }

    public oq(com.bytedance.msdk.api.r.qv r1) {
            r0 = this;
            r0.<init>(r1)
            if (r1 == 0) goto Lb
            java.lang.String r1 = r1.cw()
            r0.j = r1
        Lb:
            return
    }

    public static com.bytedance.msdk.m.j.oq g() {
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            boolean r0 = r0.uf()
            if (r0 == 0) goto L10
            com.bytedance.msdk.m.j.qv r0 = new com.bytedance.msdk.m.j.qv
            r0.<init>()
            return r0
        L10:
            com.bytedance.msdk.m.j.g r0 = new com.bytedance.msdk.m.j.g
            r0.<init>()
            return r0
    }

    public static com.bytedance.msdk.m.j.oq xt(com.bytedance.msdk.api.r.qv r1) {
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            boolean r0 = r0.uf()
            if (r0 == 0) goto L10
            com.bytedance.msdk.m.j.qv r0 = new com.bytedance.msdk.m.j.qv
            r0.<init>(r1)
            return r0
        L10:
            com.bytedance.msdk.m.j.g r0 = new com.bytedance.msdk.m.j.g
            r0.<init>(r1)
            return r0
    }

    @Override // com.bytedance.msdk.m.j.cw
    protected java.lang.String cw() {
            r1 = this;
            java.lang.String r0 = r1.j
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1f
            com.bytedance.msdk.core.oq.j r0 = r1.ae()
            if (r0 == 0) goto L14
            java.lang.String r0 = r0.j()
            r1.j = r0
        L14:
            java.lang.String r0 = r1.j
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1f
            java.lang.String r0 = "appId为空"
            return r0
        L1f:
            java.lang.String r0 = ""
            return r0
    }

    @Override // com.bytedance.msdk.m.j.cw
    protected java.util.Map<java.lang.String, java.lang.Object> j() {
            r3 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "app_id"
            java.lang.String r2 = r3.j
            r0.put(r1, r2)
            com.bytedance.msdk.core.j r1 = com.bytedance.msdk.core.j.qv()
            java.lang.String r1 = r1.tj()
            java.lang.String r2 = "pangle_app_name"
            r0.put(r2, r1)
            com.bytedance.msdk.core.j r1 = com.bytedance.msdk.core.j.qv()
            boolean r1 = r1.az()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "pangle_is_pangle_paid"
            r0.put(r2, r1)
            com.bytedance.msdk.core.j r1 = com.bytedance.msdk.core.j.qv()
            int r1 = r1.f()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "pangle_title_bar_theme"
            r0.put(r2, r1)
            com.bytedance.msdk.core.j r1 = com.bytedance.msdk.core.j.qv()
            boolean r1 = r1.ws()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "pangle_is_pangle_allow_show_notify"
            r0.put(r2, r1)
            com.bytedance.msdk.core.j r1 = com.bytedance.msdk.core.j.qv()
            boolean r1 = r1.kt()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "pangle_is_pangle_allow_show_page_when_screen_lock"
            r0.put(r2, r1)
            com.bytedance.msdk.core.j r1 = com.bytedance.msdk.core.j.qv()
            int[] r1 = r1.mi()
            java.lang.String r2 = "pangle_direct_download_networktype"
            r0.put(r2, r1)
            com.bytedance.msdk.core.j r1 = com.bytedance.msdk.core.j.qv()
            java.lang.String[] r1 = r1.v()
            java.lang.String r2 = "pangle_need_clear_task_reset"
            r0.put(r2, r1)
            com.bytedance.msdk.core.j r1 = com.bytedance.msdk.core.j.qv()
            java.lang.String r1 = r1.a()
            java.lang.String r2 = "pangle_keywords"
            r0.put(r2, r1)
            com.bytedance.msdk.core.j r1 = com.bytedance.msdk.core.j.qv()
            boolean r1 = r1.jy()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "pangle_support_multi_process"
            r0.put(r2, r1)
            return r0
    }
}
