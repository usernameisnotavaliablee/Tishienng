package com.bxkj.student.home.teaching.learning;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class LearnHomeListAdapter extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
    public LearnHomeListAdapter(android.content.Context r2, java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3) {
            r1 = this;
            r0 = 2131493268(0x7f0c0194, float:1.8610011E38)
            r1.<init>(r2, r0, r3)
            return
    }

    public static /* synthetic */ void m(com.bxkj.student.home.teaching.learning.LearnHomeListAdapter r0, java.util.Map r1, android.view.View r2) {
            r0.o(r1, r2)
            return
    }

    private /* synthetic */ void o(java.util.Map r4, android.view.View r5) {
            r3 = this;
            android.content.Context r5 = r3.e
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.e
            java.lang.Class<com.bxkj.student.home.teaching.learning.detail.LearnDetailActivity> r2 = com.bxkj.student.home.teaching.learning.detail.LearnDetailActivity.class
            r0.<init>(r1, r2)
            java.lang.String r1 = "title"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
            android.content.Intent r0 = r0.putExtra(r1, r2)
            java.lang.String r1 = "id"
            java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
            android.content.Intent r4 = r0.putExtra(r1, r4)
            r5.startActivity(r4)
            return
    }

    public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
            r0 = this;
            java.util.Map r2 = (java.util.Map) r2
            r0.n(r1, r2)
            return
    }

    public void n(cn.bluemobi.dylan.base.adapter.common.ViewHolder r7, java.util.Map<java.lang.String, java.lang.Object> r8) {
            r6 = this;
            java.lang.String r0 = "title"
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r0)
            r1 = 2131298986(0x7f090aaa, float:1.821596E38)
            r7.J(r1, r0)
            java.lang.String r0 = "isOk"
            int r0 = cn.bluemobi.dylan.http.JsonParse.getInt(r8, r0)
            r2 = 1
            if (r0 != r2) goto L1f
            android.content.Context r0 = r6.e
            r3 = 2131100561(0x7f060391, float:1.7813507E38)
            int r0 = androidx.core.content.ContextCompat.getColor(r0, r3)
            goto L28
        L1f:
            android.content.Context r0 = r6.e
            r3 = 2131099731(0x7f060053, float:1.7811823E38)
            int r0 = androidx.core.content.ContextCompat.getColor(r0, r3)
        L28:
            r7.K(r1, r0)
            java.lang.String r0 = "pv"
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r0)
            r1 = 2131299042(0x7f090ae2, float:1.8216074E38)
            r7.J(r1, r0)
            java.lang.String r0 = "publishTime"
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r0)
            r1 = 2131299158(0x7f090b56, float:1.821631E38)
            r7.J(r1, r0)
            java.lang.String r0 = "type"
            int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r8, r0)
            r3 = 2
            if (r1 != r3) goto L50
            r1 = 2131231926(0x7f0804b6, float:1.8079947E38)
            goto L69
        L50:
            int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r8, r0)
            r4 = 3
            if (r1 != r4) goto L5b
            r1 = 2131689974(0x7f0f01f6, float:1.9008979E38)
            goto L69
        L5b:
            int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r8, r0)
            r4 = 4
            if (r1 != r4) goto L66
            r1 = 2131231925(0x7f0804b5, float:1.8079945E38)
            goto L69
        L66:
            r1 = 2131231184(0x7f0801d0, float:1.8078442E38)
        L69:
            java.lang.String r4 = "indexImg"
            java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r4)
            r5 = 2131297182(0x7f09039e, float:1.8212302E38)
            r7.t(r5, r4, r1, r1)
            int r1 = cn.bluemobi.dylan.http.JsonParse.getInt(r8, r0)
            r4 = 0
            if (r1 != r3) goto L7e
            r1 = 1
            goto L7f
        L7e:
            r1 = 0
        L7f:
            r5 = 2131297252(0x7f0903e4, float:1.8212444E38)
            r7.N(r5, r1)
            int r0 = cn.bluemobi.dylan.http.JsonParse.getInt(r8, r0)
            if (r0 != r3) goto L8c
            goto L8d
        L8c:
            r2 = 0
        L8d:
            r0 = 2131296828(0x7f09023c, float:1.8211584E38)
            r7.N(r0, r2)
            android.view.View r7 = r7.b()
            com.bxkj.student.home.teaching.learning.l r0 = new com.bxkj.student.home.teaching.learning.l
            r0.<init>(r6, r8)
            r7.setOnClickListener(r0)
            return
    }
}
