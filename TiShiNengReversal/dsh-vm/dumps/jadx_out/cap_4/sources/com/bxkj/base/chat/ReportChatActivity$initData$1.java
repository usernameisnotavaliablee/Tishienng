package com.bxkj.base.chat;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class ReportChatActivity$initData$1 extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
    ReportChatActivity$initData$1(android.content.Context r1, int r2, java.util.List<? extends java.util.Map<java.lang.String, java.lang.Object>> r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public static /* synthetic */ void m(java.util.Map r0, android.widget.CompoundButton r1, boolean r2) {
            o(r0, r1, r2)
            return
    }

    private static final void o(java.util.Map r0, android.widget.CompoundButton r1, boolean r2) {
            if (r0 == 0) goto Lb
            java.lang.String r1 = "isChecked"
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.put(r1, r2)
        Lb:
            return
    }

    public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
            r0 = this;
            java.util.Map r2 = (java.util.Map) r2
            r0.n(r1, r2)
            return
    }

    public void n(cn.bluemobi.dylan.base.adapter.common.ViewHolder r3, java.util.Map<java.lang.String, java.lang.Object> r4) {
            r2 = this;
            if (r3 == 0) goto Ld
            int r0 = com.bxkj.base.R.id.iv_head
            java.lang.String r1 = "photo"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
            r3.s(r0, r1)
        Ld:
            if (r3 == 0) goto L1a
            int r0 = com.bxkj.base.R.id.tv_msg
            java.lang.String r1 = "msg"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
            r3.J(r0, r1)
        L1a:
            if (r3 == 0) goto L27
            int r0 = com.bxkj.base.R.id.tv_user
            java.lang.String r1 = "userName"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
            r3.J(r0, r1)
        L27:
            if (r3 == 0) goto L34
            int r0 = com.bxkj.base.R.id.tv_date
            java.lang.String r1 = "createTime"
            java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
            r3.J(r0, r1)
        L34:
            if (r3 == 0) goto L48
            int r0 = com.bxkj.base.R.id.cb
            android.view.View r3 = r3.h(r0)
            android.widget.CheckBox r3 = (android.widget.CheckBox) r3
            if (r3 == 0) goto L48
            com.bxkj.base.chat.p r0 = new com.bxkj.base.chat.p
            r0.<init>(r4)
            r3.setOnCheckedChangeListener(r0)
        L48:
            return
    }
}
