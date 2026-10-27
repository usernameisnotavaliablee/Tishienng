package com.bxkj.student.life.info;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class InfoAdapter extends cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements cn.bluemobi.dylan.base.adapter.common.recyclerview.b {
        final /* synthetic */ com.bxkj.student.life.info.InfoAdapter a;

        a(com.bxkj.student.life.info.InfoAdapter r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void a(android.view.ViewGroup r3, android.view.View r4, java.lang.Object r5, int r6) {
                r2 = this;
                com.bxkj.student.life.info.InfoAdapter r3 = r2.a
                java.lang.Object r3 = r3.getItem(r6)
                java.util.Map r3 = (java.util.Map) r3
                java.lang.String r4 = "titleImg"
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                java.util.List r3 = cn.bluemobi.dylan.http.JsonParse.getList(r3, r4, r5)
                if (r3 == 0) goto L20
                int r4 = r3.size()
                if (r4 <= 0) goto L20
                r4 = 0
                java.lang.Object r3 = r3.get(r4)
                java.lang.String r3 = (java.lang.String) r3
                goto L22
            L20:
                java.lang.String r3 = ""
            L22:
                com.bxkj.student.life.info.InfoAdapter r4 = r2.a
                android.content.Context r4 = com.bxkj.student.life.info.InfoAdapter.n(r4)
                android.content.Intent r5 = new android.content.Intent
                com.bxkj.student.life.info.InfoAdapter r0 = r2.a
                android.content.Context r0 = com.bxkj.student.life.info.InfoAdapter.m(r0)
                java.lang.Class<com.bxkj.student.life.info.InfoDetailActivity> r1 = com.bxkj.student.life.info.InfoDetailActivity.class
                r5.<init>(r0, r1)
                com.bxkj.student.life.info.InfoAdapter r0 = r2.a
                java.lang.Object r0 = r0.getItem(r6)
                java.util.Map r0 = (java.util.Map) r0
                java.lang.String r1 = "id"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
                java.lang.String r1 = "infoId"
                android.content.Intent r5 = r5.putExtra(r1, r0)
                com.bxkj.student.life.info.InfoAdapter r0 = r2.a
                java.lang.Object r6 = r0.getItem(r6)
                java.util.Map r6 = (java.util.Map) r6
                java.lang.String r0 = "inforTitle"
                java.lang.String r6 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
                android.content.Intent r5 = r5.putExtra(r0, r6)
                java.lang.String r6 = "imageUrl"
                android.content.Intent r3 = r5.putExtra(r6, r3)
                r4.startActivity(r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.base.adapter.common.abslistview.a<java.lang.String> {
        final /* synthetic */ com.bxkj.student.life.info.InfoAdapter e;

        b(com.bxkj.student.life.info.InfoAdapter r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.e = r1
                r0.<init>(r2, r3, r4)
                return
        }

        public /* bridge */ /* synthetic */ void a(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.lang.String r2 = (java.lang.String) r2
                r0.d(r1, r2)
                return
        }

        public void d(cn.bluemobi.dylan.base.adapter.common.ViewHolder r4, java.lang.String r5) {
                r3 = this;
                r0 = 2131689689(0x7f0f00d9, float:1.90084E38)
                r1 = 2131689819(0x7f0f015b, float:1.9008664E38)
                r2 = 2131297161(0x7f090389, float:1.821226E38)
                r4.t(r2, r5, r0, r1)
                return
        }
    }

    public InfoAdapter(android.content.Context r2, java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3) {
            r1 = this;
            com.bxkj.student.life.info.a r0 = new com.bxkj.student.life.info.a
            r0.<init>()
            r1.<init>(r2, r3, r0)
            com.bxkj.student.life.info.InfoAdapter$a r2 = new com.bxkj.student.life.info.InfoAdapter$a
            r2.<init>(r1)
            r1.k(r2)
            return
    }

    static /* synthetic */ android.content.Context m(com.bxkj.student.life.info.InfoAdapter r0) {
            android.content.Context r0 = r0.e
            return r0
    }

    static /* synthetic */ android.content.Context n(com.bxkj.student.life.info.InfoAdapter r0) {
            android.content.Context r0 = r0.e
            return r0
    }

    public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
            r0 = this;
            java.util.Map r2 = (java.util.Map) r2
            r0.o(r1, r2)
            return
    }

    public void o(cn.bluemobi.dylan.base.adapter.common.ViewHolder r7, java.util.Map<java.lang.String, java.lang.Object> r8) {
            r6 = this;
            java.lang.String r0 = "inforTitle"
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r0)
            r1 = 2131298946(0x7f090a82, float:1.821588E38)
            r7.J(r1, r0)
            java.lang.String r0 = "inforSource"
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r0)
            r1 = 2131299176(0x7f090b68, float:1.8216346E38)
            r7.J(r1, r0)
            java.lang.String r0 = "publishTime"
            java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r8, r0)
            r1 = 2131299158(0x7f090b56, float:1.821631E38)
            r7.J(r1, r0)
            java.lang.String r0 = "titleImg"
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.util.List r8 = cn.bluemobi.dylan.http.JsonParse.getList(r8, r0, r1)
            int r0 = r7.f()
            int r0 = r6.getItemViewType(r0)
            r1 = 2131689819(0x7f0f015b, float:1.9008664E38)
            r2 = 2131689689(0x7f0f00d9, float:1.90084E38)
            r3 = 0
            r4 = 1
            if (r0 != r4) goto L4b
            java.lang.Object r8 = r8.get(r3)
            java.lang.String r8 = (java.lang.String) r8
            r0 = 2131297091(0x7f090343, float:1.8212117E38)
            r7.t(r0, r8, r2, r1)
            return
        L4b:
            int r0 = r7.f()
            int r0 = r6.getItemViewType(r0)
            r5 = 2
            if (r0 != r5) goto L6f
            java.lang.Object r0 = r8.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            r3 = 2131297092(0x7f090344, float:1.821212E38)
            r7.t(r3, r0, r2, r1)
            java.lang.Object r8 = r8.get(r4)
            java.lang.String r8 = (java.lang.String) r8
            r0 = 2131297093(0x7f090345, float:1.8212121E38)
            r7.t(r0, r8, r2, r1)
            return
        L6f:
            int r0 = r8.size()
            r1 = 3
            if (r0 <= r1) goto L7a
            java.util.List r8 = r8.subList(r3, r1)
        L7a:
            r0 = 2131297031(0x7f090307, float:1.8211995E38)
            android.view.View r7 = r7.h(r0)
            android.widget.GridView r7 = (android.widget.GridView) r7
            if (r8 == 0) goto La6
            int r0 = r8.size()
            if (r0 != 0) goto L8c
            goto La6
        L8c:
            r7.setVisibility(r3)
            r7.setEnabled(r3)
            r7.setPressed(r3)
            r7.setClickable(r3)
            com.bxkj.student.life.info.InfoAdapter$b r0 = new com.bxkj.student.life.info.InfoAdapter$b
            android.content.Context r1 = r6.e
            r2 = 2131493280(0x7f0c01a0, float:1.8610036E38)
            r0.<init>(r6, r1, r2, r8)
            r7.setAdapter(r0)
            return
        La6:
            r8 = 8
            r7.setVisibility(r8)
            return
    }
}
