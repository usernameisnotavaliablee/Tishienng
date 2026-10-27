package com.bxkj.base.chat;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ChatInfoActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private androidx.recyclerview.widget.RecyclerView Y;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> Z;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> a0;
    private java.lang.String b0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.base.chat.ChatInfoActivity k;

        a(com.bxkj.base.chat.ChatInfoActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.k = r1
                r0.<init>(r2, r3, r4)
                return
        }

        public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.m(r1, r2)
                return
        }

        public void m(cn.bluemobi.dylan.base.adapter.common.ViewHolder r3, java.util.Map<java.lang.String, java.lang.Object> r4) {
                r2 = this;
                int r0 = com.bxkj.base.R.id.iv_head
                java.lang.String r1 = "photo"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r3.s(r0, r1)
                int r0 = com.bxkj.base.R.id.tv_name
                java.lang.String r1 = "name"
                java.lang.String r4 = cn.bluemobi.dylan.http.JsonParse.getString(r4, r1)
                r3.J(r0, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.base.chat.ChatInfoActivity a;

        b(com.bxkj.base.chat.ChatInfoActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                java.lang.String r0 = "data"
                java.util.List r2 = cn.bluemobi.dylan.http.JsonParse.getList(r2, r0)
                com.bxkj.base.chat.ChatInfoActivity r0 = r1.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r0 = com.bxkj.base.chat.ChatInfoActivity.i0(r0)
                r0.g(r2)
                return
        }
    }

    public ChatInfoActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.Z = r0
            return
    }

    public static /* synthetic */ void g0(com.bxkj.base.chat.ChatInfoActivity r0, android.view.ViewGroup r1, android.view.View r2, java.lang.Object r3, int r4) {
            r0.k0(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void h0(com.bxkj.base.chat.ChatInfoActivity r0, android.view.View r1) {
            r0.l0(r1)
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter i0(com.bxkj.base.chat.ChatInfoActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.a0
            return r0
    }

    private void j0() {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<w.a> r1 = w.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.a r1 = (w.a) r1
            java.lang.String r2 = r3.b0
            rx.e r1 = r1.f(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.base.chat.ChatInfoActivity$b r1 = new com.bxkj.base.chat.ChatInfoActivity$b
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    private /* synthetic */ void k0(android.view.ViewGroup r2, android.view.View r3, java.lang.Object r4, int r5) {
            r1 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r2 = r1.a0
            java.lang.Object r2 = r2.getItem(r5)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "id"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r3.getUserId()
            boolean r3 = r3.equalsIgnoreCase(r2)
            if (r3 != 0) goto L4d
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            int r3 = r3.getUserType()
            r4 = 2
            if (r3 != r4) goto L4d
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r4 = r1.V
            java.lang.Class<com.bxkj.base.chat.ChatUserInfoActivity> r0 = com.bxkj.base.chat.ChatUserInfoActivity.class
            r3.<init>(r4, r0)
            java.lang.String r4 = "userId"
            android.content.Intent r2 = r3.putExtra(r4, r2)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r3 = r1.a0
            java.lang.Object r3 = r3.getItem(r5)
            java.util.Map r3 = (java.util.Map) r3
            java.lang.String r4 = "name"
            java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r4)
            java.lang.String r4 = "userName"
            android.content.Intent r2 = r2.putExtra(r4, r3)
            r1.startActivity(r2)
        L4d:
            return
    }

    private /* synthetic */ void l0(android.view.View r3) {
            r2 = this;
            android.content.Intent r3 = r2.getIntent()
            android.content.Context r0 = r2.V
            java.lang.Class<com.bxkj.base.chat.ReportChatActivity> r1 = com.bxkj.base.chat.ReportChatActivity.class
            android.content.Intent r3 = r3.setClass(r0, r1)
            r2.startActivity(r3)
            return
    }

    public void L() {
            r2 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.a0
            com.bxkj.base.chat.g r1 = new com.bxkj.base.chat.g
            r1.<init>(r2)
            r0.k(r1)
            int r0 = com.bxkj.base.R.id.bt_report
            android.view.View r0 = r2.findViewById(r0)
            com.bxkj.base.chat.h r1 = new com.bxkj.base.chat.h
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            int r0 = com.bxkj.base.R.layout.ac_chat_info
            return r0
    }

    public void R() {
            r4 = this;
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "groupId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L16
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r4.b0 = r0
        L16:
            androidx.recyclerview.widget.RecyclerView r0 = r4.Y
            androidx.recyclerview.widget.GridLayoutManager r1 = new androidx.recyclerview.widget.GridLayoutManager
            android.content.Context r2 = r4.V
            r3 = 5
            r1.<init>(r2, r3)
            r0.setLayoutManager(r1)
            com.bxkj.base.chat.ChatInfoActivity$a r0 = new com.bxkj.base.chat.ChatInfoActivity$a
            android.content.Context r1 = r4.V
            int r2 = com.bxkj.base.R.layout.item_for_menmber
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.Z
            r0.<init>(r4, r1, r2, r3)
            r4.a0 = r0
            androidx.recyclerview.widget.RecyclerView r1 = r4.Y
            r1.setAdapter(r0)
            r4.j0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "聊天信息"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            int r1 = com.bxkj.base.R.id.rv_user
            android.view.View r1 = r0.findViewById(r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r0.Y = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
