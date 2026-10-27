package com.bxkj.base.chat;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ContactListActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private androidx.recyclerview.widget.RecyclerView Y;
    private com.bxkj.base.view.SideBar Z;
    private java.util.List<x.b> a0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<x.b> b0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements com.bxkj.base.view.SideBar.a {
        final /* synthetic */ com.bxkj.base.chat.ContactListActivity a;

        a(com.bxkj.base.chat.ContactListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.bxkj.base.view.SideBar.a
        public void a(int r2, java.lang.String r3) {
                r1 = this;
                r2 = 0
            L1:
                com.bxkj.base.chat.ContactListActivity r0 = r1.a
                java.util.List r0 = com.bxkj.base.chat.ContactListActivity.i0(r0)
                int r0 = r0.size()
                if (r2 >= r0) goto L30
                com.bxkj.base.chat.ContactListActivity r0 = r1.a
                java.util.List r0 = com.bxkj.base.chat.ContactListActivity.i0(r0)
                java.lang.Object r0 = r0.get(r2)
                x.b r0 = (x.b) r0
                java.lang.String r0 = r0.b()
                boolean r0 = r3.equalsIgnoreCase(r0)
                if (r0 == 0) goto L2d
                com.bxkj.base.chat.ContactListActivity r3 = r1.a
                androidx.recyclerview.widget.RecyclerView r3 = com.bxkj.base.chat.ContactListActivity.j0(r3)
                r3.scrollToPosition(r2)
                return
            L2d:
                int r2 = r2 + 1
                goto L1
            L30:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<x.b> {
        final /* synthetic */ com.bxkj.base.chat.ContactListActivity k;

        b(com.bxkj.base.chat.ContactListActivity r1, android.content.Context r2, int r3, java.util.List r4) {
                r0 = this;
                r0.k = r1
                r0.<init>(r2, r3, r4)
                return
        }

        private int n(java.lang.String r3) {
                r2 = this;
                r0 = 0
            L1:
                int r1 = r2.getItemCount()
                if (r0 >= r1) goto L21
                com.bxkj.base.chat.ContactListActivity r1 = r2.k
                java.util.List r1 = com.bxkj.base.chat.ContactListActivity.i0(r1)
                java.lang.Object r1 = r1.get(r0)
                x.b r1 = (x.b) r1
                java.lang.String r1 = r1.b()
                boolean r1 = r3.equalsIgnoreCase(r1)
                if (r1 == 0) goto L1e
                return r0
            L1e:
                int r0 = r0 + 1
                goto L1
            L21:
                r3 = -1
                return r3
        }

        public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                x.b r2 = (x.b) r2
                r0.m(r1, r2)
                return
        }

        public void m(cn.bluemobi.dylan.base.adapter.common.ViewHolder r4, x.b r5) {
                r3 = this;
                java.lang.String r0 = r5.b()
                int r1 = r4.f()
                int r0 = r3.n(r0)
                r2 = 1
                if (r1 != r0) goto L20
                int r0 = com.bxkj.base.R.id.catalog
                r4.N(r0, r2)
                java.lang.String r1 = r5.b()
                java.lang.String r1 = r1.toUpperCase()
                r4.J(r0, r1)
                goto L26
            L20:
                int r0 = com.bxkj.base.R.id.catalog
                r1 = 0
                r4.N(r0, r1)
            L26:
                int r0 = com.bxkj.base.R.id.name
                java.lang.String r1 = r5.getName()
                r4.J(r0, r1)
                java.lang.String r0 = r5.getType()
                int r0 = java.lang.Integer.parseInt(r0)
                if (r0 != r2) goto L3c
                int r0 = com.bxkj.base.R.mipmap.ease_default_avatar
                goto L3e
            L3c:
                int r0 = com.bxkj.base.R.mipmap.ease_group_icon
            L3e:
                int r1 = com.bxkj.base.R.id.avatar
                java.lang.String r5 = r5.c()
                r4.t(r1, r5, r0, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.base.chat.ContactListActivity a;

        c(com.bxkj.base.chat.ContactListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r4) {
                r3 = this;
                java.lang.String r0 = "data"
                java.util.List r4 = cn.bluemobi.dylan.http.JsonParse.getList(r4, r0)
                com.bxkj.base.chat.ContactListActivity r0 = r3.a
                java.util.List r0 = com.bxkj.base.chat.ContactListActivity.i0(r0)
                r0.clear()
                java.util.Iterator r4 = r4.iterator()
            L13:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L52
                java.lang.Object r0 = r4.next()
                java.util.Map r0 = (java.util.Map) r0
                x.b r1 = new x.b
                r1.<init>()
                java.lang.String r2 = "id"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r2)
                r1.h(r2)
                java.lang.String r2 = "type"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r2)
                r1.k(r2)
                java.lang.String r2 = "name"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r2)
                r1.i(r2)
                java.lang.String r2 = "photo"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r2)
                r1.j(r0)
                com.bxkj.base.chat.ContactListActivity r0 = r3.a
                java.util.List r0 = com.bxkj.base.chat.ContactListActivity.i0(r0)
                r0.add(r1)
                goto L13
            L52:
                com.bxkj.base.chat.ContactListActivity r4 = r3.a
                java.util.List r4 = com.bxkj.base.chat.ContactListActivity.i0(r4)
                java.util.Collections.sort(r4)
                com.bxkj.base.chat.ContactListActivity r4 = r3.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r4 = com.bxkj.base.chat.ContactListActivity.h0(r4)
                com.bxkj.base.chat.ContactListActivity r0 = r3.a
                java.util.List r0 = com.bxkj.base.chat.ContactListActivity.i0(r0)
                r4.g(r0)
                return
        }
    }

    public ContactListActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a0 = r0
            return
    }

    public static /* synthetic */ void g0(com.bxkj.base.chat.ContactListActivity r0, android.view.ViewGroup r1, android.view.View r2, java.lang.Object r3, int r4) {
            r0.l0(r1, r2, r3, r4)
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter h0(com.bxkj.base.chat.ContactListActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<x.b> r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List i0(com.bxkj.base.chat.ContactListActivity r0) {
            java.util.List<x.b> r0 = r0.a0
            return r0
    }

    static /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView j0(com.bxkj.base.chat.ContactListActivity r0) {
            androidx.recyclerview.widget.RecyclerView r0 = r0.Y
            return r0
    }

    private void k0() {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<w.a> r1 = w.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.a r1 = (w.a) r1
            r2 = 0
            rx.e r1 = r1.f(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.base.chat.ContactListActivity$c r1 = new com.bxkj.base.chat.ContactListActivity$c
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    private /* synthetic */ void l0(android.view.ViewGroup r3, android.view.View r4, java.lang.Object r5, int r6) {
            r2 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<x.b> r3 = r2.b0
            java.lang.Object r3 = r3.getItem(r6)
            x.b r3 = (x.b) r3
            java.lang.String r4 = r3.getType()
            int r4 = java.lang.Integer.parseInt(r4)
            r5 = 1
            java.lang.String r6 = "userId"
            if (r4 != r5) goto L3f
            com.bxkj.base.user.LoginUser r5 = com.bxkj.base.user.LoginUser.getLoginUser()
            int r5 = r5.getUserType()
            r0 = 2
            if (r5 != r0) goto L3f
            android.content.Intent r4 = new android.content.Intent
            android.content.Context r5 = r2.V
            java.lang.Class<com.bxkj.base.chat.ChatUserInfoActivity> r0 = com.bxkj.base.chat.ChatUserInfoActivity.class
            r4.<init>(r5, r0)
            java.lang.String r5 = r3.getId()
            android.content.Intent r4 = r4.putExtra(r6, r5)
            java.lang.String r5 = "userName"
            java.lang.String r3 = r3.getName()
            android.content.Intent r3 = r4.putExtra(r5, r3)
            r2.startActivity(r3)
            return
        L3f:
            android.content.Intent r5 = new android.content.Intent
            android.content.Context r0 = r2.V
            java.lang.Class<com.bxkj.base.chat.ChatActivity> r1 = com.bxkj.base.chat.ChatActivity.class
            r5.<init>(r0, r1)
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            android.content.Intent r5 = r5.setFlags(r0)
            java.lang.String r0 = "chatName"
            java.lang.String r1 = r3.getName()
            android.content.Intent r5 = r5.putExtra(r0, r1)
            java.lang.String r0 = "chatType"
            android.content.Intent r4 = r5.putExtra(r0, r4)
            java.lang.String r5 = "groupId"
            java.lang.String r0 = r3.getId()
            android.content.Intent r4 = r4.putExtra(r5, r0)
            java.lang.String r3 = r3.getId()
            android.content.Intent r3 = r4.putExtra(r6, r3)
            r2.startActivity(r3)
            return
    }

    public void L() {
            r2 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<x.b> r0 = r2.b0
            com.bxkj.base.chat.j r1 = new com.bxkj.base.chat.j
            r1.<init>(r2)
            r0.k(r1)
            return
    }

    protected int N() {
            r1 = this;
            int r0 = com.bxkj.base.R.layout.ac_contact
            return r0
    }

    public void R() {
            r4 = this;
            com.bxkj.base.view.SideBar r0 = r4.Z
            com.bxkj.base.chat.ContactListActivity$a r1 = new com.bxkj.base.chat.ContactListActivity$a
            r1.<init>(r4)
            r0.setOnStrSelectCallBack(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r4.Y
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r4.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            com.bxkj.base.chat.ContactListActivity$b r0 = new com.bxkj.base.chat.ContactListActivity$b
            android.content.Context r1 = r4.V
            int r2 = com.bxkj.base.R.layout.item_for_contact_list
            java.util.List<x.b> r3 = r4.a0
            r0.<init>(r4, r1, r2, r3)
            r4.b0 = r0
            androidx.recyclerview.widget.RecyclerView r1 = r4.Y
            r1.setAdapter(r0)
            r4.k0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "联系人列表"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            int r1 = com.bxkj.base.R.id.recyclerView
            android.view.View r1 = r0.findViewById(r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r0.Y = r1
            int r1 = com.bxkj.base.R.id.side_bar
            android.view.View r1 = r0.findViewById(r1)
            com.bxkj.base.view.SideBar r1 = (com.bxkj.base.view.SideBar) r1
            r0.Z = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
