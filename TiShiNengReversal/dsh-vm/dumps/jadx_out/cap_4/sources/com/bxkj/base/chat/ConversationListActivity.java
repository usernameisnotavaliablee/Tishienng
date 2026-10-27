package com.bxkj.base.chat;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ConversationListActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.content.BroadcastReceiver F0;
    private com.scwang.smartrefresh.layout.SmartRefreshLayout Y;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView Z;
    private android.widget.TextView a0;
    private android.widget.LinearLayout b0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> c0;

    /* renamed from: k0, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> f566k0;

    /* renamed from: p0, reason: collision with root package name */
    private com.bxkj.base.chat.heart.b f567p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends android.content.BroadcastReceiver {
        final /* synthetic */ com.bxkj.base.chat.ConversationListActivity a;

        a(com.bxkj.base.chat.ConversationListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r1, android.content.Intent r2) {
                r0 = this;
                com.bxkj.base.chat.ConversationListActivity r1 = r0.a
                com.bxkj.base.chat.ConversationListActivity.o0(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.base.chat.ConversationListActivity k;

        b(com.bxkj.base.chat.ConversationListActivity r1, android.content.Context r2, int r3, java.util.List r4) {
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

        public void m(cn.bluemobi.dylan.base.adapter.common.ViewHolder r5, java.util.Map<java.lang.String, java.lang.Object> r6) {
                r4 = this;
                java.lang.String r0 = "type"
                int r0 = cn.bluemobi.dylan.http.JsonParse.getInt(r6, r0)
                r1 = 1
                if (r0 != r1) goto Lc
                int r0 = com.bxkj.base.R.mipmap.ease_default_avatar
                goto Le
            Lc:
                int r0 = com.bxkj.base.R.mipmap.ease_group_icon
            Le:
                int r2 = com.bxkj.base.R.id.avatar
                java.lang.String r3 = "photo"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r3)
                r5.t(r2, r3, r0, r0)
                int r0 = com.bxkj.base.R.id.name
                java.lang.String r2 = "userName"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
                r5.J(r0, r2)
                int r0 = com.bxkj.base.R.id.message
                java.lang.String r2 = "lastMsg"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
                r5.J(r0, r2)
                int r0 = com.bxkj.base.R.id.time
                java.lang.String r2 = "createTime"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r2)
                r5.J(r0, r2)
                int r0 = com.bxkj.base.R.id.msg_status
                java.lang.String r2 = "local"
                boolean r2 = cn.bluemobi.dylan.http.JsonParse.getBoolean(r6, r2)
                r5.N(r0, r2)
                int r0 = com.bxkj.base.R.id.unread_msg_number
                java.lang.String r2 = "status"
                int r6 = cn.bluemobi.dylan.http.JsonParse.getInt(r6, r2)
                if (r6 != 0) goto L50
                goto L51
            L50:
                r1 = 0
            L51:
                r5.N(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.base.chat.ConversationListActivity a;

        c(com.bxkj.base.chat.ConversationListActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnFinish() {
                r1 = this;
                super.netOnFinish()
                com.bxkj.base.chat.ConversationListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.base.chat.ConversationListActivity.m0(r0)
                if (r0 == 0) goto L20
                com.bxkj.base.chat.ConversationListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.base.chat.ConversationListActivity.m0(r0)
                boolean r0 = r0.w()
                if (r0 == 0) goto L20
                com.bxkj.base.chat.ConversationListActivity r0 = r1.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.base.chat.ConversationListActivity.m0(r0)
                r0.w0()
            L20:
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r11) {
                r10 = this;
                com.bxkj.base.chat.ConversationListActivity r0 = r10.a
                java.lang.String r1 = "data"
                java.util.List r11 = cn.bluemobi.dylan.http.JsonParse.getList(r11, r1)
                com.bxkj.base.chat.ConversationListActivity.n0(r0, r11)
                r11 = 0
            Lc:
                com.bxkj.base.chat.ConversationListActivity r0 = r10.a
                java.util.List r0 = com.bxkj.base.chat.ConversationListActivity.l0(r0)
                int r0 = r0.size()
                if (r11 >= r0) goto L70
                com.bxkj.base.chat.ConversationListActivity r0 = r10.a
                java.util.List r0 = com.bxkj.base.chat.ConversationListActivity.l0(r0)
                java.lang.Object r0 = r0.get(r11)
                java.util.Map r0 = (java.util.Map) r0
                java.lang.String r1 = "createTime"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
                java.lang.String r4 = com.tsn.chat.utils.a.c()
                java.lang.String r1 = "type"
                int r5 = cn.bluemobi.dylan.http.JsonParse.getInt(r0, r1)
                java.lang.String r1 = "userId"
                java.lang.String r6 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
                java.lang.String r1 = "groupId"
                java.lang.String r7 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
                java.lang.String r1 = "userName"
                java.lang.String r8 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
                java.lang.String r1 = "photo"
                java.lang.String r9 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r1)
                com.bxkj.base.chat.ConversationListActivity r2 = r10.a
                java.util.List r0 = com.bxkj.base.chat.ConversationListActivity.p0(r2, r3, r4, r5, r6, r7, r8, r9)
                int r1 = r0.size()
                if (r1 <= 0) goto L6d
                com.bxkj.base.chat.ConversationListActivity r1 = r10.a
                java.util.List r1 = com.bxkj.base.chat.ConversationListActivity.l0(r1)
                int r2 = r0.size()
                int r2 = r2 + (-1)
                java.lang.Object r0 = r0.get(r2)
                java.util.Map r0 = (java.util.Map) r0
                r1.set(r11, r0)
            L6d:
                int r11 = r11 + 1
                goto Lc
            L70:
                com.bxkj.base.chat.ConversationListActivity r11 = r10.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter r11 = com.bxkj.base.chat.ConversationListActivity.k0(r11)
                com.bxkj.base.chat.ConversationListActivity r0 = r10.a
                java.util.List r0 = com.bxkj.base.chat.ConversationListActivity.l0(r0)
                r11.g(r0)
                return
        }
    }

    public ConversationListActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.c0 = r0
            com.bxkj.base.chat.ConversationListActivity$a r0 = new com.bxkj.base.chat.ConversationListActivity$a
            r0.<init>(r1)
            r1.F0 = r0
            return
    }

    public static /* synthetic */ void g0(com.bxkj.base.chat.ConversationListActivity r0, boolean r1) {
            r0.v0(r1)
            return
    }

    public static /* synthetic */ void h0(com.bxkj.base.chat.ConversationListActivity r0) {
            r0.x0()
            return
    }

    public static /* synthetic */ void i0(com.bxkj.base.chat.ConversationListActivity r0, android.view.ViewGroup r1, android.view.View r2, java.lang.Object r3, int r4) {
            r0.u0(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void j0(com.bxkj.base.chat.ConversationListActivity r0, l2.h r1) {
            r0.w0(r1)
            return
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter k0(com.bxkj.base.chat.ConversationListActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.f566k0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List l0(com.bxkj.base.chat.ConversationListActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout m0(com.bxkj.base.chat.ConversationListActivity r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ void n0(com.bxkj.base.chat.ConversationListActivity r0, java.util.List r1) {
            r0.c0 = r1
            return
    }

    static /* bridge */ /* synthetic */ void o0(com.bxkj.base.chat.ConversationListActivity r0) {
            r0.r0()
            return
    }

    static /* bridge */ /* synthetic */ java.util.List p0(com.bxkj.base.chat.ConversationListActivity r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            java.util.List r0 = r0.s0(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    private void q0() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.a r0 = cn.bluemobi.dylan.base.utils.a.n()
            java.lang.Class<com.bxkj.base.chat.ChatActivity> r1 = com.bxkj.base.chat.ChatActivity.class
            android.app.Activity r0 = r0.getActivity(r1)
            if (r0 == 0) goto Ld
            goto L41
        Ld:
            com.bxkj.base.chat.heart.b r0 = r3.f567p0
            if (r0 == 0) goto L14
            r0.a()
        L14:
            a3.b r0 = a3.a.a()
            android.content.Context r1 = r3.V
            r0.g(r1)
            a3.b r0 = a3.a.a()
            r0.l()
            android.content.Context r0 = r3.V
            java.lang.Class<com.bxkj.base.chat.heart.AlarmChatService> r1 = com.bxkj.base.chat.heart.AlarmChatService.class
            java.lang.String r2 = r1.getName()
            boolean r0 = com.bxkj.base.util.a0.a(r0, r2)
            if (r0 == 0) goto L41
            java.lang.String r0 = "AlarmChatService----------isServiceRunning"
            com.orhanobut.logger.j.c(r0)
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r2 = r3.V
            r0.<init>(r2, r1)
            r3.stopService(r0)
        L41:
            return
    }

    private void r0() {
            r2 = this;
            android.content.Context r0 = r2.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            java.lang.Class<w.a> r1 = w.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.a r1 = (w.a) r1
            rx.e r1 = r1.c()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.base.chat.ConversationListActivity$c r1 = new com.bxkj.base.chat.ConversationListActivity$c
            r1.<init>(r2)
            r0.setDataListener(r1)
            return
    }

    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> s0(java.lang.String r6, java.lang.String r7, int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "查询开始时间="
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = "结束时间="
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = "的离线消息"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.orhanobut.logger.j.c(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "fromUserId = ? and "
            r1.<init>(r2)
            r2 = 4
            java.lang.String[] r2 = new java.lang.String[r2]
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r3.getUserId()
            r4 = 0
            r2[r4] = r3
            r3 = 1
            if (r8 != r3) goto L46
            java.lang.String r4 = "toUserId = ?"
            r1.append(r4)
            r2[r3] = r9
            goto L4d
        L46:
            java.lang.String r4 = "groupId = ?"
            r1.append(r4)
            r2[r3] = r10
        L4d:
            java.lang.String r3 = " and createTime >= ? and createTime < ?"
            r1.append(r3)
            r3 = 2
            r2[r3] = r6
            r6 = 3
            r2[r6] = r7
            cn.bluemobi.dylan.sqlitelibrary.c r6 = cn.bluemobi.dylan.sqlitelibrary.c.h()
            java.lang.Class<com.bxkj.base.chat.db.ChatMessageDb> r7 = com.bxkj.base.chat.db.ChatMessageDb.class
            java.lang.String r1 = r1.toString()
            java.util.List r6 = r6.query(r7, r1, r2)
            if (r6 == 0) goto Lc6
            int r7 = r6.size()
            if (r7 <= 0) goto Lc6
            java.util.Iterator r6 = r6.iterator()
        L72:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lc6
            java.lang.Object r7 = r6.next()
            com.bxkj.base.chat.db.ChatMessageDb r7 = (com.bxkj.base.chat.db.ChatMessageDb) r7
            java.lang.String r1 = r7.getMessageId()
            java.lang.String r2 = r7.getMsg()
            java.lang.String r7 = r7.getCreateTime()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r4 = "messageId"
            r3.put(r4, r1)
            java.lang.String r1 = "userId"
            r3.put(r1, r9)
            java.lang.String r1 = "groupId"
            r3.put(r1, r10)
            java.lang.String r1 = "userName"
            r3.put(r1, r11)
            java.lang.String r1 = "type"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r3.put(r1, r4)
            java.lang.String r1 = "photo"
            r3.put(r1, r12)
            java.lang.String r1 = "createTime"
            r3.put(r1, r7)
            java.lang.String r7 = "lastMsg"
            r3.put(r7, r2)
            java.lang.String r7 = "local"
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r3.put(r7, r1)
            r0.add(r3)
            goto L72
        Lc6:
            return r0
    }

    private void t0() {
            r4 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r4.Y
            r1 = 0
            r0.S0(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.Z
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r2 = r4.V
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            com.bxkj.base.chat.ConversationListActivity$b r0 = new com.bxkj.base.chat.ConversationListActivity$b
            android.content.Context r1 = r4.V
            int r2 = com.bxkj.base.R.layout.item_for_conversation_list
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.c0
            r0.<init>(r4, r1, r2, r3)
            r4.f566k0 = r0
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r1 = r4.Z
            r1.setAdapter(r0)
            android.widget.TextView r0 = r4.a0
            java.lang.String r1 = "暂无消息,你可以点击右上角联系人按钮发起互动聊天消息"
            r0.setText(r1)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r0 = r4.Z
            android.widget.TextView r1 = r4.a0
            r0.setEmptyView(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r4.Y
            com.bxkj.base.chat.n r1 = new com.bxkj.base.chat.n
            r1.<init>(r4)
            r0.l1(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r4.Y
            r0.D()
            return
    }

    private /* synthetic */ void u0(android.view.ViewGroup r1, android.view.View r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.r0()
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r0.V
            java.lang.Class<com.bxkj.base.chat.ChatActivity> r3 = com.bxkj.base.chat.ChatActivity.class
            r1.<init>(r2, r3)
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            android.content.Intent r1 = r1.setFlags(r2)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r2 = r0.f566k0
            java.lang.Object r2 = r2.getItem(r4)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "userName"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
            java.lang.String r3 = "chatName"
            android.content.Intent r1 = r1.putExtra(r3, r2)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r2 = r0.f566k0
            java.lang.Object r2 = r2.getItem(r4)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "type"
            int r2 = cn.bluemobi.dylan.http.JsonParse.getInt(r2, r3)
            java.lang.String r3 = "chatType"
            android.content.Intent r1 = r1.putExtra(r3, r2)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r2 = r0.f566k0
            java.lang.Object r2 = r2.getItem(r4)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "groupId"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
            android.content.Intent r1 = r1.putExtra(r3, r2)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r2 = r0.f566k0
            java.lang.Object r2 = r2.getItem(r4)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "userId"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
            android.content.Intent r1 = r1.putExtra(r3, r2)
            r0.startActivity(r1)
            return
    }

    private /* synthetic */ void v0(boolean r2) {
            r1 = this;
            android.widget.LinearLayout r0 = r1.b0
            if (r2 == 0) goto L7
            r2 = 8
            goto L8
        L7:
            r2 = 0
        L8:
            r0.setVisibility(r2)
            return
    }

    private /* synthetic */ void w0(l2.h r1) {
            r0 = this;
            r0.r0()
            return
    }

    private /* synthetic */ void x0() {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.V
            java.lang.Class<com.bxkj.base.chat.ContactListActivity> r2 = com.bxkj.base.chat.ContactListActivity.class
            r0.<init>(r1, r2)
            r3.startActivity(r0)
            return
    }

    public void L() {
            r2 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.CommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.f566k0
            com.bxkj.base.chat.k r1 = new com.bxkj.base.chat.k
            r1.<init>(r2)
            r0.k(r1)
            com.bxkj.base.user.LoginUser r0 = com.bxkj.base.user.LoginUser.getLoginUser()
            com.bxkj.base.chat.l r1 = new com.bxkj.base.chat.l
            r1.<init>(r2)
            r0.addChatConnectListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            int r0 = com.bxkj.base.R.layout.ac_conversation_list
            return r0
    }

    public void R() {
            r3 = this;
            android.widget.LinearLayout r0 = r3.b0
            com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
            boolean r1 = r1.isChatConnectStatus()
            if (r1 == 0) goto Lf
            r1 = 8
            goto L10
        Lf:
            r1 = 0
        L10:
            r0.setVisibility(r1)
            r3.t0()
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.String r1 = "NOTIFY_SEND_MESSAGE_CALLBACK_SUCCESS"
            r0.addAction(r1)
            java.lang.String r1 = "NOTIFY_RECEIVER_MESSAGE"
            r0.addAction(r1)
            androidx.localbroadcastmanager.content.LocalBroadcastManager r1 = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(r3)
            android.content.BroadcastReceiver r2 = r3.F0
            r1.registerReceiver(r2, r0)
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "会话列表"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r2) {
            r1 = this;
            int r2 = com.bxkj.base.R.id.refresh
            android.view.View r2 = r1.findViewById(r2)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r2 = (com.scwang.smartrefresh.layout.SmartRefreshLayout) r2
            r1.Y = r2
            int r2 = com.bxkj.base.R.id.recyclerView
            android.view.View r2 = r1.findViewById(r2)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView r2 = (cn.bluemobi.dylan.base.adapter.common.recyclerview.EmptyRecyclerView) r2
            r1.Z = r2
            int r2 = com.bxkj.base.R.id.tv_emptyView
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.a0 = r2
            int r2 = com.bxkj.base.R.id.ll_status
            android.view.View r0 = r1.findViewById(r2)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r1.b0 = r0
            android.view.View r2 = r1.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r1.b0 = r2
            int r2 = com.bxkj.base.R.mipmap.my_write
            com.bxkj.base.chat.m r0 = new com.bxkj.base.chat.m
            r0.<init>(r1)
            r1.Z(r2, r0)
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }

    protected void onDestroy() {
            r2 = this;
            android.content.BroadcastReceiver r0 = r2.F0
            if (r0 == 0) goto Ld
            androidx.localbroadcastmanager.content.LocalBroadcastManager r0 = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(r2)
            android.content.BroadcastReceiver r1 = r2.F0
            r0.unregisterReceiver(r1)
        Ld:
            r2.q0()
            super.onDestroy()
            return
    }

    protected void onResume() {
            r5 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onResume()
            android.content.Context r0 = r5.V
            java.lang.Class<com.bxkj.base.chat.heart.AlarmChatService> r1 = com.bxkj.base.chat.heart.AlarmChatService.class
            java.lang.String r1 = r1.getName()
            boolean r0 = com.bxkj.base.util.a0.a(r0, r1)
            if (r0 != 0) goto L23
            java.lang.String r0 = "AlarmChatService----------isServiceStop"
            com.orhanobut.logger.j.c(r0)
            com.bxkj.base.chat.heart.b r0 = new com.bxkj.base.chat.heart.b
            android.content.Context r1 = r5.V
            r0.<init>(r1)
            r5.f567p0 = r0
            r0.b()
            return
        L23:
            long r0 = java.lang.System.currentTimeMillis()
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            long r2 = r2.getLastHeartCallBackTime()
            long r0 = r0 - r2
            r2 = 10000(0x2710, double:4.9407E-320)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L48
            java.lang.String r0 = "AlarmChatService----------timeout"
            com.orhanobut.logger.j.c(r0)
            com.bxkj.base.chat.heart.b r0 = new com.bxkj.base.chat.heart.b
            android.content.Context r1 = r5.V
            r0.<init>(r1)
            r5.f567p0 = r0
            r0.b()
            return
        L48:
            java.lang.String r0 = "AlarmChatService----------isServiceRunning"
            com.orhanobut.logger.j.c(r0)
            return
    }
}
