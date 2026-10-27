package com.bxkj.base.chat;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ChatActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.os.Handler F0;
    private java.lang.Runnable G0;
    private java.lang.String H0;
    private java.lang.String I0;
    private com.bxkj.base.chat.heart.b J0;
    private androidx.recyclerview.widget.RecyclerView K0;
    private com.scwang.smartrefresh.layout.SmartRefreshLayout L0;
    private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> M0;
    private android.content.BroadcastReceiver N0;
    protected int O0;
    protected int P0;
    protected int Q0;
    private android.widget.EditText Y;
    private android.widget.Button Z;
    private android.widget.ImageView a0;
    private cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> b0;
    private int c0;

    /* renamed from: k0, reason: collision with root package name */
    private java.lang.String f561k0;

    /* renamed from: p0, reason: collision with root package name */
    private java.lang.String f562p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements cn.bluemobi.dylan.base.adapter.common.recyclerview.a<java.util.Map<java.lang.String, java.lang.Object>> {
        final /* synthetic */ com.bxkj.base.chat.ChatActivity a;

        a(com.bxkj.base.chat.ChatActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public /* bridge */ /* synthetic */ int a(int r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                int r1 = r0.c(r1, r2)
                return r1
        }

        public int b(int r2) {
                r1 = this;
                r0 = 1
                if (r2 != r0) goto L6
                int r2 = com.bxkj.base.R.layout.item_for_send_message
                return r2
            L6:
                int r2 = com.bxkj.base.R.layout.item_for_receive_message
                return r2
        }

        public int c(int r2, java.util.Map<java.lang.String, java.lang.Object> r3) {
                r1 = this;
                com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r2 = r2.getUserId()
                java.lang.String r0 = "userId"
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r0)
                boolean r2 = r2.equals(r3)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> {

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ com.bxkj.base.chat.ChatActivity f563l;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements android.view.View.OnClickListener {
            final /* synthetic */ com.bxkj.base.chat.db.ChatMessageDb a;
            final /* synthetic */ com.bxkj.base.chat.ChatActivity.b b;

            a(com.bxkj.base.chat.ChatActivity.b r1, com.bxkj.base.chat.db.ChatMessageDb r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            public static /* synthetic */ void a(com.bxkj.base.chat.ChatActivity.b.a r0) {
                    r0.b()
                    return
            }

            private /* synthetic */ void b() {
                    r1 = this;
                    com.bxkj.base.chat.ChatActivity$b r0 = r1.b
                    com.bxkj.base.chat.ChatActivity r0 = r0.f563l
                    cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter r0 = com.bxkj.base.chat.ChatActivity.n0(r0)
                    r0.notifyDataSetChanged()
                    return
            }

            private void c() {
                    r8 = this;
                    com.tsn.chat.model.ChatModel r0 = new com.tsn.chat.model.ChatModel
                    r0.<init>()
                    com.bxkj.base.chat.db.ChatMessageDb r1 = r8.a
                    java.lang.String r1 = r1.getMessageId()
                    java.lang.String r2 = com.tsn.chat.utils.a.c()
                    com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
                    java.lang.String r3 = r3.getUserId()
                    com.bxkj.base.user.LoginUser r4 = com.bxkj.base.user.LoginUser.getLoginUser()
                    java.lang.String r4 = r4.getRealName()
                    com.bxkj.base.user.LoginUser r5 = com.bxkj.base.user.LoginUser.getLoginUser()
                    java.lang.String r5 = r5.getHeadImageUrl()
                    com.bxkj.base.chat.ChatActivity$b r6 = r8.b
                    com.bxkj.base.chat.ChatActivity r6 = r6.f563l
                    int r6 = com.bxkj.base.chat.ChatActivity.k0(r6)
                    java.lang.String r6 = java.lang.String.valueOf(r6)
                    com.bxkj.base.user.LoginUser r7 = com.bxkj.base.user.LoginUser.getLoginUser()
                    java.lang.String r7 = r7.getSchoolCode()
                    r0.setMessageId(r1)
                    r0.setCreateTime(r2)
                    r0.setFromUserId(r3)
                    r0.setFromUserName(r4)
                    r0.setPhoto(r5)
                    r0.setType(r6)
                    com.bxkj.base.chat.ChatActivity$b r3 = r8.b
                    com.bxkj.base.chat.ChatActivity r3 = r3.f563l
                    java.lang.String r3 = com.bxkj.base.chat.ChatActivity.q0(r3)
                    r0.setToUserId(r3)
                    com.bxkj.base.chat.ChatActivity$b r3 = r8.b
                    com.bxkj.base.chat.ChatActivity r3 = r3.f563l
                    java.lang.String r3 = com.bxkj.base.chat.ChatActivity.j0(r3)
                    r0.setToUserName(r3)
                    r0.setSchoolId(r7)
                    com.bxkj.base.chat.db.ChatMessageDb r3 = r8.a
                    java.lang.String r3 = r3.getMsg()
                    r0.setMsg(r3)
                    com.bxkj.base.chat.ChatActivity$b r3 = r8.b
                    com.bxkj.base.chat.ChatActivity r3 = r3.f563l
                    java.lang.String r3 = com.bxkj.base.chat.ChatActivity.m0(r3)
                    r0.setGroupId(r3)
                    com.bxkj.base.chat.ChatActivity$b r3 = r8.b
                    com.bxkj.base.chat.ChatActivity r3 = r3.f563l
                    int r3 = com.bxkj.base.chat.ChatActivity.k0(r3)
                    r4 = 1
                    if (r3 != r4) goto L8d
                    a3.b r3 = a3.a.a()
                    r3.i(r0)
                    goto L94
                L8d:
                    a3.b r3 = a3.a.a()
                    r3.h(r0)
                L94:
                    com.bxkj.base.chat.db.ChatMessageDb r0 = r8.a
                    r0.setCreateTime(r2)
                    cn.bluemobi.dylan.sqlitelibrary.c r0 = cn.bluemobi.dylan.sqlitelibrary.c.h()
                    com.bxkj.base.chat.db.ChatMessageDb r2 = r8.a
                    java.lang.String r3 = "messageId=?"
                    java.lang.String[] r1 = new java.lang.String[]{r1}
                    r0.update(r2, r3, r1)
                    com.bxkj.base.chat.ChatActivity$b r0 = r8.b
                    r0.notifyDataSetChanged()
                    android.os.Handler r0 = new android.os.Handler
                    r0.<init>()
                    com.bxkj.base.chat.e r1 = new com.bxkj.base.chat.e
                    r1.<init>(r8)
                    r2 = 60000(0xea60, double:2.9644E-319)
                    r0.postDelayed(r1, r2)
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r1) {
                    r0 = this;
                    r0.c()
                    return
            }
        }

        b(com.bxkj.base.chat.ChatActivity r1, android.content.Context r2, java.util.List r3, cn.bluemobi.dylan.base.adapter.common.recyclerview.a r4) {
                r0 = this;
                r0.f563l = r1
                r0.<init>(r2, r3, r4)
                return
        }

        public static /* synthetic */ void m(com.bxkj.base.chat.ChatActivity.b r0, java.util.Map r1, android.view.View r2) {
                r0.o(r1, r2)
                return
        }

        private /* synthetic */ void o(java.util.Map r6, android.view.View r7) {
                r5 = this;
                java.lang.String r7 = "userId"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r7)
                com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r1 = r1.getUserId()
                boolean r1 = r1.equalsIgnoreCase(r0)
                if (r1 != 0) goto L3b
                com.bxkj.base.user.LoginUser r1 = com.bxkj.base.user.LoginUser.getLoginUser()
                int r1 = r1.getUserType()
                r2 = 2
                if (r1 != r2) goto L3b
                com.bxkj.base.chat.ChatActivity r1 = r5.f563l
                android.content.Intent r2 = new android.content.Intent
                android.content.Context r3 = r5.e
                java.lang.Class<com.bxkj.base.chat.ChatUserInfoActivity> r4 = com.bxkj.base.chat.ChatUserInfoActivity.class
                r2.<init>(r3, r4)
                android.content.Intent r7 = r2.putExtra(r7, r0)
                java.lang.String r0 = "userName"
                java.lang.String r6 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r0)
                android.content.Intent r6 = r7.putExtra(r0, r6)
                r1.startActivity(r6)
            L3b:
                return
        }

        public /* bridge */ /* synthetic */ void c(cn.bluemobi.dylan.base.adapter.common.ViewHolder r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.n(r1, r2)
                return
        }

        public void n(cn.bluemobi.dylan.base.adapter.common.ViewHolder r9, java.util.Map<java.lang.String, java.lang.Object> r10) {
                r8 = this;
                int r0 = com.bxkj.base.R.id.iv_head
                java.lang.String r1 = "photo"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r10, r1)
                r9.s(r0, r1)
                int r0 = com.bxkj.base.R.id.tv_msg
                java.lang.String r1 = "msg"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r10, r1)
                r9.J(r0, r1)
                int r0 = r9.f()
                int r0 = r8.getItemViewType(r0)
                r1 = 1
                if (r0 != r1) goto L98
                java.lang.String r0 = "messageId"
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r10, r0)
                cn.bluemobi.dylan.sqlitelibrary.c r2 = cn.bluemobi.dylan.sqlitelibrary.c.h()
                java.lang.String r3 = "messageId=?"
                java.lang.String[] r0 = new java.lang.String[]{r0}
                java.lang.Class<com.bxkj.base.chat.db.ChatMessageDb> r4 = com.bxkj.base.chat.db.ChatMessageDb.class
                java.util.List r0 = r2.query(r4, r3, r0)
                r2 = 0
                if (r0 == 0) goto L8e
                int r3 = r0.size()
                if (r3 <= 0) goto L8e
                java.lang.Object r0 = r0.get(r2)
                com.bxkj.base.chat.db.ChatMessageDb r0 = (com.bxkj.base.chat.db.ChatMessageDb) r0
                java.lang.String r3 = r0.getCreateTime()
                java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat
                java.lang.String r5 = "yyyy-MM-dd HH:mm:ss"
                r4.<init>(r5)
                java.util.Date r3 = r4.parse(r3)     // Catch: java.text.ParseException -> L83
                long r4 = java.lang.System.currentTimeMillis()     // Catch: java.text.ParseException -> L83
                long r6 = r3.getTime()     // Catch: java.text.ParseException -> L83
                long r4 = r4 - r6
                r6 = 60000(0xea60, double:2.9644E-319)
                int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r3 <= 0) goto L78
                int r3 = com.bxkj.base.R.id.msg_status     // Catch: java.text.ParseException -> L83
                r9.N(r3, r1)     // Catch: java.text.ParseException -> L83
                int r4 = com.bxkj.base.R.id.progress_bar     // Catch: java.text.ParseException -> L83
                r9.N(r4, r2)     // Catch: java.text.ParseException -> L83
                com.bxkj.base.chat.ChatActivity$b$a r4 = new com.bxkj.base.chat.ChatActivity$b$a     // Catch: java.text.ParseException -> L83
                r4.<init>(r8, r0)     // Catch: java.text.ParseException -> L83
                r9.w(r3, r4)     // Catch: java.text.ParseException -> L83
                goto L98
            L78:
                int r0 = com.bxkj.base.R.id.msg_status     // Catch: java.text.ParseException -> L83
                r9.N(r0, r2)     // Catch: java.text.ParseException -> L83
                int r0 = com.bxkj.base.R.id.progress_bar     // Catch: java.text.ParseException -> L83
                r9.N(r0, r1)     // Catch: java.text.ParseException -> L83
                goto L98
            L83:
                int r0 = com.bxkj.base.R.id.msg_status
                r9.N(r0, r1)
                int r0 = com.bxkj.base.R.id.progress_bar
                r9.N(r0, r2)
                goto L98
            L8e:
                int r0 = com.bxkj.base.R.id.progress_bar
                r9.N(r0, r2)
                int r0 = com.bxkj.base.R.id.msg_status
                r9.N(r0, r2)
            L98:
                int r0 = com.bxkj.base.R.id.tv_user
                java.lang.String r1 = "userName"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r10, r1)
                r9.J(r0, r1)
                int r0 = com.bxkj.base.R.id.tv_date
                java.lang.String r1 = "createTime"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r10, r1)
                r9.J(r0, r1)
                int r0 = com.bxkj.base.R.id.ll_user
                com.bxkj.base.chat.d r1 = new com.bxkj.base.chat.d
                r1.<init>(r8, r10)
                r9.w(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ com.bxkj.base.chat.ChatActivity a;

        c(com.bxkj.base.chat.ChatActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
                r4 = this;
                com.bxkj.base.chat.ChatActivity r0 = r4.a
                androidx.recyclerview.widget.RecyclerView r0 = com.bxkj.base.chat.ChatActivity.o0(r0)
                int r0 = r0.computeVerticalScrollRange()
                com.bxkj.base.chat.ChatActivity r1 = r4.a
                androidx.recyclerview.widget.RecyclerView r1 = com.bxkj.base.chat.ChatActivity.o0(r1)
                int r1 = r1.computeVerticalScrollExtent()
                r2 = 0
                r3 = 1
                if (r0 <= r1) goto L1a
                r0 = 1
                goto L1b
            L1a:
                r0 = 0
            L1b:
                if (r0 == 0) goto L3f
                com.bxkj.base.chat.ChatActivity r1 = r4.a
                androidx.recyclerview.widget.RecyclerView r1 = com.bxkj.base.chat.ChatActivity.o0(r1)
                androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r1.getLayoutManager()
                androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
                boolean r1 = r1.getStackFromEnd()
                if (r1 != 0) goto L3f
                com.bxkj.base.chat.ChatActivity r0 = r4.a
                androidx.recyclerview.widget.RecyclerView r0 = com.bxkj.base.chat.ChatActivity.o0(r0)
                androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
                androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
                r0.setStackFromEnd(r3)
                return
            L3f:
                if (r0 != 0) goto L62
                com.bxkj.base.chat.ChatActivity r0 = r4.a
                androidx.recyclerview.widget.RecyclerView r0 = com.bxkj.base.chat.ChatActivity.o0(r0)
                androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
                androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
                boolean r0 = r0.getStackFromEnd()
                if (r0 == 0) goto L62
                com.bxkj.base.chat.ChatActivity r0 = r4.a
                androidx.recyclerview.widget.RecyclerView r0 = com.bxkj.base.chat.ChatActivity.o0(r0)
                androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
                androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
                r0.setStackFromEnd(r2)
            L62:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.base.chat.ChatActivity a;

        d(com.bxkj.base.chat.ChatActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e extends android.content.BroadcastReceiver {
        final /* synthetic */ com.bxkj.base.chat.ChatActivity a;

        e(com.bxkj.base.chat.ChatActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r13, android.content.Intent r14) {
                r12 = this;
                java.lang.String r13 = r14.getAction()
                java.lang.String r0 = "NOTIFY_SEND_MESSAGE_CALLBACK_SUCCESS"
                boolean r13 = r13.equalsIgnoreCase(r0)
                r0 = 1
                if (r13 == 0) goto L29
                java.lang.String r13 = "messageId"
                boolean r14 = r14.hasExtra(r13)
                if (r14 == 0) goto L10a
                com.bxkj.base.chat.ChatActivity r14 = r12.a
                android.content.Intent r14 = r14.getIntent()
                r14.getStringExtra(r13)
                com.bxkj.base.chat.ChatActivity r13 = r12.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter r13 = com.bxkj.base.chat.ChatActivity.n0(r13)
                r13.notifyDataSetChanged()
                goto L10a
            L29:
                java.lang.String r13 = r14.getAction()
                java.lang.String r1 = "NOTIFY_RECEIVER_MESSAGE"
                boolean r13 = r13.equalsIgnoreCase(r1)
                if (r13 == 0) goto L10a
                java.lang.String r13 = "chatType"
                boolean r1 = r14.hasExtra(r13)
                if (r1 == 0) goto L10a
                int r13 = r14.getIntExtra(r13, r0)
                java.lang.String r1 = "userId"
                java.lang.String r2 = r14.getStringExtra(r1)
                java.lang.String r3 = "userName"
                java.lang.String r4 = r14.getStringExtra(r3)
                java.lang.String r5 = "photo"
                java.lang.String r6 = r14.getStringExtra(r5)
                java.lang.String r7 = "toUserName"
                r14.getStringExtra(r7)
                java.lang.String r7 = "createTime"
                java.lang.String r8 = r14.getStringExtra(r7)
                java.lang.String r9 = "msg"
                java.lang.String r10 = r14.getStringExtra(r9)
                java.lang.String r11 = "groupId"
                java.lang.String r14 = r14.getStringExtra(r11)
                com.bxkj.base.chat.ChatActivity r11 = r12.a
                int r11 = com.bxkj.base.chat.ChatActivity.k0(r11)
                if (r13 != r11) goto Lb3
                com.bxkj.base.chat.ChatActivity r11 = r12.a
                int r11 = com.bxkj.base.chat.ChatActivity.k0(r11)
                if (r11 != r0) goto Lb3
                com.bxkj.base.chat.ChatActivity r11 = r12.a
                java.lang.String r11 = com.bxkj.base.chat.ChatActivity.q0(r11)
                boolean r11 = r11.equalsIgnoreCase(r2)
                if (r11 == 0) goto Lb3
                java.util.HashMap r13 = new java.util.HashMap
                r13.<init>()
                r13.put(r1, r2)
                r13.put(r3, r4)
                r13.put(r5, r6)
                r13.put(r7, r8)
                r13.put(r9, r10)
                com.bxkj.base.chat.ChatActivity r14 = r12.a
                java.util.List r14 = com.bxkj.base.chat.ChatActivity.l0(r14)
                r14.add(r13)
                com.bxkj.base.chat.ChatActivity r13 = r12.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter r13 = com.bxkj.base.chat.ChatActivity.n0(r13)
                com.bxkj.base.chat.ChatActivity r14 = r12.a
                java.util.List r14 = com.bxkj.base.chat.ChatActivity.l0(r14)
                r13.g(r14)
                goto L10a
            Lb3:
                com.bxkj.base.chat.ChatActivity r11 = r12.a
                int r11 = com.bxkj.base.chat.ChatActivity.k0(r11)
                if (r13 != r11) goto L10a
                com.bxkj.base.chat.ChatActivity r13 = r12.a
                int r13 = com.bxkj.base.chat.ChatActivity.k0(r13)
                r11 = 2
                if (r13 != r11) goto L10a
                com.bxkj.base.chat.ChatActivity r13 = r12.a
                java.lang.String r13 = com.bxkj.base.chat.ChatActivity.m0(r13)
                boolean r13 = r13.equalsIgnoreCase(r14)
                if (r13 == 0) goto L10a
                com.bxkj.base.user.LoginUser r13 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r13 = r13.getUserId()
                boolean r13 = r13.equalsIgnoreCase(r2)
                if (r13 != 0) goto L10a
                java.util.HashMap r13 = new java.util.HashMap
                r13.<init>()
                r13.put(r1, r2)
                r13.put(r3, r4)
                r13.put(r5, r6)
                r13.put(r7, r8)
                r13.put(r9, r10)
                com.bxkj.base.chat.ChatActivity r14 = r12.a
                java.util.List r14 = com.bxkj.base.chat.ChatActivity.l0(r14)
                r14.add(r13)
                com.bxkj.base.chat.ChatActivity r13 = r12.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter r13 = com.bxkj.base.chat.ChatActivity.n0(r13)
                com.bxkj.base.chat.ChatActivity r14 = r12.a
                java.util.List r14 = com.bxkj.base.chat.ChatActivity.l0(r14)
                r13.g(r14)
            L10a:
                com.bxkj.base.chat.ChatActivity r13 = r12.a
                androidx.recyclerview.widget.RecyclerView r13 = com.bxkj.base.chat.ChatActivity.o0(r13)
                androidx.recyclerview.widget.RecyclerView$LayoutManager r13 = r13.getLayoutManager()
                androidx.recyclerview.widget.LinearLayoutManager r13 = (androidx.recyclerview.widget.LinearLayoutManager) r13
                com.bxkj.base.chat.ChatActivity r14 = r12.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter r14 = com.bxkj.base.chat.ChatActivity.n0(r14)
                int r14 = r14.getItemCount()
                int r14 = r14 - r0
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r13.scrollToPositionWithOffset(r14, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f implements m2.e {
        final /* synthetic */ com.bxkj.base.chat.ChatActivity a;

        f(com.bxkj.base.chat.ChatActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void m(l2.h r1) {
                r0 = this;
                com.bxkj.base.chat.ChatActivity r1 = r0.a
                r1.A0()
                return
        }

        public void n(l2.h r5) {
                r4 = this;
                com.bxkj.base.chat.ChatActivity r5 = r4.a
                int r0 = r5.Q0
                int r1 = r5.O0
                int r2 = r0 / r1
                int r3 = r5.P0
                int r0 = r0 % r1
                if (r0 != 0) goto Le
                goto L10
            Le:
                int r2 = r2 + 1
            L10:
                if (r3 < r2) goto L2a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r5 = com.bxkj.base.chat.ChatActivity.p0(r5)
                r5.w0()
                com.bxkj.base.chat.ChatActivity r5 = r4.a
                android.content.Context r5 = com.bxkj.base.chat.ChatActivity.s0(r5)
                java.lang.String r0 = "已全部加载完毕"
                r1 = 0
                android.widget.Toast r5 = android.widget.Toast.makeText(r5, r0, r1)
                r5.show()
                return
            L2a:
                int r3 = r3 + 1
                r5.P0 = r3
                r5.u0()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class g extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.base.chat.ChatActivity a;

        g(com.bxkj.base.chat.ChatActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public static /* synthetic */ int a(java.util.Map r2, java.util.Map r3) {
                java.lang.String r0 = "yyyy-MM-dd HH:mm:ss"
                java.lang.String r1 = "createTime"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r1)
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r3, r1)
                java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch: java.text.ParseException -> L28
                r1.<init>(r0)     // Catch: java.text.ParseException -> L28
                java.util.Date r2 = r1.parse(r2)     // Catch: java.text.ParseException -> L28
                java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch: java.text.ParseException -> L28
                r1.<init>(r0)     // Catch: java.text.ParseException -> L28
                java.util.Date r3 = r1.parse(r3)     // Catch: java.text.ParseException -> L28
                boolean r2 = r2.after(r3)     // Catch: java.text.ParseException -> L28
                if (r2 == 0) goto L26
                r2 = 1
                return r2
            L26:
                r2 = -1
                return r2
            L28:
                r2 = 0
                return r2
        }

        private java.util.List<java.util.Map<java.lang.String, java.lang.Object>> b(java.lang.String r9, java.lang.String r10) {
                r8 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "查询开始时间="
                r0.append(r1)
                r0.append(r9)
                java.lang.String r1 = "结束时间="
                r0.append(r1)
                r0.append(r10)
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
                com.bxkj.base.chat.ChatActivity r3 = r8.a
                int r3 = com.bxkj.base.chat.ChatActivity.k0(r3)
                r4 = 1
                if (r3 != r4) goto L52
                java.lang.String r3 = "toUserId = ?"
                r1.append(r3)
                com.bxkj.base.chat.ChatActivity r3 = r8.a
                java.lang.String r3 = com.bxkj.base.chat.ChatActivity.q0(r3)
                r2[r4] = r3
                goto L5f
            L52:
                java.lang.String r3 = "groupId = ?"
                r1.append(r3)
                com.bxkj.base.chat.ChatActivity r3 = r8.a
                java.lang.String r3 = com.bxkj.base.chat.ChatActivity.m0(r3)
                r2[r4] = r3
            L5f:
                java.lang.String r3 = " and createTime >= ? and createTime < ?"
                r1.append(r3)
                r3 = 2
                r2[r3] = r9
                r9 = 3
                r2[r9] = r10
                cn.bluemobi.dylan.sqlitelibrary.c r9 = cn.bluemobi.dylan.sqlitelibrary.c.h()
                java.lang.Class<com.bxkj.base.chat.db.ChatMessageDb> r10 = com.bxkj.base.chat.db.ChatMessageDb.class
                java.lang.String r1 = r1.toString()
                java.util.List r9 = r9.query(r10, r1, r2)
                if (r9 == 0) goto Ldb
                int r10 = r9.size()
                if (r10 <= 0) goto Ldb
                java.util.Iterator r9 = r9.iterator()
            L84:
                boolean r10 = r9.hasNext()
                if (r10 == 0) goto Ldb
                java.lang.Object r10 = r9.next()
                com.bxkj.base.chat.db.ChatMessageDb r10 = (com.bxkj.base.chat.db.ChatMessageDb) r10
                java.lang.String r1 = r10.getMessageId()
                java.lang.String r2 = r10.getMsg()
                java.lang.String r10 = r10.getCreateTime()
                com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r3 = r3.getUserId()
                com.bxkj.base.user.LoginUser r4 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r4 = r4.getRealName()
                com.bxkj.base.user.LoginUser r5 = com.bxkj.base.user.LoginUser.getLoginUser()
                java.lang.String r5 = r5.getHeadImageUrl()
                java.util.HashMap r6 = new java.util.HashMap
                r6.<init>()
                java.lang.String r7 = "messageId"
                r6.put(r7, r1)
                java.lang.String r1 = "userId"
                r6.put(r1, r3)
                java.lang.String r1 = "userName"
                r6.put(r1, r4)
                java.lang.String r1 = "photo"
                r6.put(r1, r5)
                java.lang.String r1 = "createTime"
                r6.put(r1, r10)
                java.lang.String r10 = "msg"
                r6.put(r10, r2)
                r0.add(r6)
                goto L84
            Ldb:
                return r0
        }

        private void c(java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2) {
                r1 = this;
                com.bxkj.base.chat.f r0 = new com.bxkj.base.chat.f
                r0.<init>()
                java.util.Collections.sort(r2, r0)
                return
        }

        public void netOnFinish() {
                r2 = this;
                super.netOnFinish()
                com.bxkj.base.chat.ChatActivity r0 = r2.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.base.chat.ChatActivity.p0(r0)
                r1 = 0
                r0.x0(r1)
                com.bxkj.base.chat.ChatActivity r0 = r2.a
                com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = com.bxkj.base.chat.ChatActivity.p0(r0)
                r0.q0()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r6) {
                r5 = this;
                com.bxkj.base.chat.ChatActivity r0 = r5.a
                java.lang.String r1 = "userIds"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r6, r1)
                com.bxkj.base.chat.ChatActivity.r0(r0, r1)
                java.lang.String r0 = "messages"
                java.util.Map r6 = cn.bluemobi.dylan.http.JsonParse.getMap(r6, r0)
                com.bxkj.base.chat.ChatActivity r0 = r5.a
                java.lang.String r1 = "total"
                java.lang.String r1 = cn.bluemobi.dylan.base.utils.u.O(r6, r1)
                int r1 = java.lang.Integer.parseInt(r1)
                r0.Q0 = r1
                java.lang.String r0 = "data"
                java.util.List r6 = cn.bluemobi.dylan.http.JsonParse.getList(r6, r0)
                java.lang.String r0 = com.tsn.chat.utils.a.c()
                com.bxkj.base.chat.ChatActivity r1 = r5.a
                int r1 = r1.P0
                java.lang.String r2 = "createTime"
                java.lang.String r3 = "0"
                r4 = 1
                if (r1 != r4) goto L58
                java.lang.String r0 = com.tsn.chat.utils.a.c()
                int r1 = r6.size()
                if (r1 != 0) goto L3f
                goto L4e
            L3f:
                int r1 = r6.size()
                int r1 = r1 - r4
                java.lang.Object r1 = r6.get(r1)
                java.util.Map r1 = (java.util.Map) r1
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r1, r2)
            L4e:
                com.bxkj.base.chat.ChatActivity r1 = r5.a
                java.util.List r1 = com.bxkj.base.chat.ChatActivity.l0(r1)
                r1.clear()
                goto L88
            L58:
                int r1 = r6.size()
                if (r1 <= 0) goto L88
                int r0 = r6.size()
                int r0 = r0 - r4
                java.lang.Object r0 = r6.get(r0)
                java.util.Map r0 = (java.util.Map) r0
                java.lang.String r3 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r2)
                com.bxkj.base.chat.ChatActivity r0 = r5.a
                java.util.List r0 = com.bxkj.base.chat.ChatActivity.l0(r0)
                com.bxkj.base.chat.ChatActivity r1 = r5.a
                java.util.List r1 = com.bxkj.base.chat.ChatActivity.l0(r1)
                int r1 = r1.size()
                int r1 = r1 - r4
                java.lang.Object r0 = r0.get(r1)
                java.util.Map r0 = (java.util.Map) r0
                java.lang.String r0 = cn.bluemobi.dylan.http.JsonParse.getString(r0, r2)
            L88:
                java.util.List r0 = r5.b(r3, r0)
                r6.addAll(r0)
                r5.c(r6)
                com.bxkj.base.chat.ChatActivity r0 = r5.a
                java.util.List r0 = com.bxkj.base.chat.ChatActivity.l0(r0)
                r1 = 0
                r0.addAll(r1, r6)
                com.bxkj.base.chat.ChatActivity r0 = r5.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter r0 = com.bxkj.base.chat.ChatActivity.n0(r0)
                com.bxkj.base.chat.ChatActivity r2 = r5.a
                java.util.List r2 = com.bxkj.base.chat.ChatActivity.l0(r2)
                r0.g(r2)
                com.bxkj.base.chat.ChatActivity r0 = r5.a
                int r2 = r0.P0
                if (r2 != r4) goto Lcc
                androidx.recyclerview.widget.RecyclerView r6 = com.bxkj.base.chat.ChatActivity.o0(r0)
                androidx.recyclerview.widget.RecyclerView$LayoutManager r6 = r6.getLayoutManager()
                androidx.recyclerview.widget.LinearLayoutManager r6 = (androidx.recyclerview.widget.LinearLayoutManager) r6
                com.bxkj.base.chat.ChatActivity r0 = r5.a
                cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter r0 = com.bxkj.base.chat.ChatActivity.n0(r0)
                int r0 = r0.getItemCount()
                int r0 = r0 - r4
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r6.scrollToPositionWithOffset(r0, r1)
                return
            Lcc:
                androidx.recyclerview.widget.RecyclerView r0 = com.bxkj.base.chat.ChatActivity.o0(r0)
                androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
                androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
                int r6 = r6.size()
                r0.scrollToPositionWithOffset(r6, r1)
                return
        }
    }

    public ChatActivity() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.c0 = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.M0 = r1
            com.bxkj.base.chat.ChatActivity$e r1 = new com.bxkj.base.chat.ChatActivity$e
            r1.<init>(r2)
            r2.N0 = r1
            r1 = 20
            r2.O0 = r1
            r2.P0 = r0
            r2.Q0 = r0
            return
    }

    private void B0(java.io.File r10) {
            r9 = this;
            if (r10 == 0) goto L16
            boolean r0 = r10.exists()
            if (r0 != 0) goto L9
            goto L16
        L9:
            java.lang.String r10 = r10.getPath()
            byte[] r10 = D0(r10)
            java.lang.String r10 = cn.bluemobi.dylan.base.utils.b.b(r10)
            goto L30
        L16:
            android.widget.EditText r10 = r9.Y
            android.text.Editable r10 = r10.getText()
            java.lang.String r10 = r10.toString()
            java.lang.String r10 = r10.trim()
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L30
            java.lang.String r10 = "内容不能为空"
            r9.f0(r10)
            return
        L30:
            com.tsn.chat.model.ChatModel r0 = new com.tsn.chat.model.ChatModel
            r0.<init>()
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = com.tsn.chat.utils.a.c()
            com.bxkj.base.user.LoginUser r3 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r3 = r3.getUserId()
            com.bxkj.base.user.LoginUser r4 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r4 = r4.getRealName()
            com.bxkj.base.user.LoginUser r5 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r5 = r5.getHeadImageUrl()
            int r6 = r9.c0
            java.lang.String r6 = java.lang.String.valueOf(r6)
            com.bxkj.base.user.LoginUser r7 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r7 = r7.getSchoolCode()
            r0.setMessageId(r1)
            r0.setCreateTime(r2)
            r0.setFromUserId(r3)
            r0.setFromUserName(r4)
            r0.setPhoto(r5)
            r0.setType(r6)
            java.lang.String r8 = r9.f562p0
            r0.setToUserId(r8)
            java.lang.String r8 = r9.I0
            r0.setToUserName(r8)
            r0.setSchoolId(r7)
            r0.setMsg(r10)
            java.lang.String r7 = r9.f561k0
            r0.setGroupId(r7)
            int r7 = r9.c0
            r8 = 1
            if (r7 != r8) goto L9b
            a3.b r7 = a3.a.a()
            r7.i(r0)
            goto La2
        L9b:
            a3.b r7 = a3.a.a()
            r7.h(r0)
        La2:
            com.bxkj.base.chat.db.ChatMessageDb r0 = new com.bxkj.base.chat.db.ChatMessageDb
            r0.<init>()
            r0.setFromUserId(r3)
            r0.setFromUserName(r4)
            java.lang.String r7 = r9.f562p0
            r0.setToUserId(r7)
            java.lang.String r7 = r9.I0
            r0.setToUserName(r7)
            r0.setCreateTime(r2)
            java.lang.String r7 = r9.f561k0
            r0.setGroupId(r7)
            r0.setMessageId(r1)
            r0.setMsg(r10)
            r0.setPhoto(r5)
            r0.setType(r6)
            cn.bluemobi.dylan.sqlitelibrary.c r6 = cn.bluemobi.dylan.sqlitelibrary.c.h()
            r6.insert(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r6 = "messageId"
            r0.put(r6, r1)
            java.lang.String r1 = "userId"
            r0.put(r1, r3)
            java.lang.String r1 = "userName"
            r0.put(r1, r4)
            java.lang.String r1 = "createTime"
            r0.put(r1, r2)
            java.lang.String r1 = "photo"
            r0.put(r1, r5)
            java.lang.String r1 = "msg"
            r0.put(r1, r10)
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r10 = r9.M0
            r10.add(r0)
            cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r10 = r9.b0
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r9.M0
            r10.g(r0)
            android.widget.EditText r10 = r9.Y
            java.lang.String r0 = ""
            r10.setText(r0)
            androidx.recyclerview.widget.RecyclerView r10 = r9.K0
            androidx.recyclerview.widget.RecyclerView$LayoutManager r10 = r10.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r10 = (androidx.recyclerview.widget.LinearLayoutManager) r10
            cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r9.b0
            int r0 = r0.getItemCount()
            int r0 = r0 - r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r10.scrollToPositionWithOffset(r0, r1)
            android.os.Handler r10 = r9.F0
            if (r10 == 0) goto L127
            java.lang.Runnable r0 = r9.G0
            if (r0 == 0) goto L127
            r10.removeCallbacks(r0)
        L127:
            android.os.Handler r10 = new android.os.Handler
            r10.<init>()
            r9.F0 = r10
            com.bxkj.base.chat.a r10 = new com.bxkj.base.chat.a
            r10.<init>(r9)
            r9.G0 = r10
            android.os.Handler r0 = r9.F0
            r1 = 60000(0xea60, double:2.9644E-319)
            r0.postDelayed(r10, r1)
            return
    }

    private void C0() {
            r5 = this;
            android.content.Context r0 = r5.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideOtherStatusMessage()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideSuccessMessage()
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideFailMessage()
            java.lang.Class<w.a> r1 = w.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.a r1 = (w.a) r1
            int r2 = r5.c0
            java.lang.String r3 = r5.f562p0
            java.lang.String r4 = r5.f561k0
            rx.e r1 = r1.a(r2, r3, r4)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.base.chat.ChatActivity$d r1 = new com.bxkj.base.chat.ChatActivity$d
            r1.<init>(r5)
            r0.setDataListener(r1)
            return
    }

    public static byte[] D0(java.lang.String r9) {
            r1 = 0
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L48
            java.lang.String r2 = "r"
            r0.<init>(r9, r2)     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L48
            java.nio.channels.FileChannel r3 = r0.getChannel()     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L48
            java.nio.channels.FileChannel$MapMode r4 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            long r7 = r3.size()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            r5 = 0
            java.nio.MappedByteBuffer r9 = r3.map(r4, r5, r7)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            java.nio.MappedByteBuffer r9 = r9.load()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            boolean r0 = r9.isLoaded()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            com.orhanobut.logger.j.c(r0)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            long r4 = r3.size()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            int r0 = (int) r4     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            int r2 = r9.remaining()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            if (r2 <= 0) goto L41
            int r2 = r9.remaining()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            r4 = 0
            r9.get(r0, r4, r2)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L4e
            goto L41
        L3d:
            r0 = move-exception
            r9 = r0
            r1 = r3
            goto L4a
        L41:
            r3.close()     // Catch: java.io.IOException -> L44
        L44:
            return r0
        L45:
            r0 = move-exception
            r9 = r0
            goto L4a
        L48:
            r3 = r1
            goto L4e
        L4a:
            r1.close()     // Catch: java.io.IOException -> L4d
        L4d:
            throw r9
        L4e:
            r3.close()     // Catch: java.io.IOException -> L51
        L51:
            return r1
    }

    public static /* synthetic */ kotlin.n1 g0(com.bxkj.base.chat.ChatActivity r0, java.io.File r1) {
            kotlin.n1 r0 = r0.x0(r1)
            return r0
    }

    public static /* synthetic */ void h0(com.bxkj.base.chat.ChatActivity r0) {
            r0.y0()
            return
    }

    public static /* synthetic */ void i0(com.bxkj.base.chat.ChatActivity r0) {
            r0.w0()
            return
    }

    static /* bridge */ /* synthetic */ java.lang.String j0(com.bxkj.base.chat.ChatActivity r0) {
            java.lang.String r0 = r0.I0
            return r0
    }

    static /* bridge */ /* synthetic */ int k0(com.bxkj.base.chat.ChatActivity r0) {
            int r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.List l0(com.bxkj.base.chat.ChatActivity r0) {
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.M0
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String m0(com.bxkj.base.chat.ChatActivity r0) {
            java.lang.String r0 = r0.f561k0
            return r0
    }

    static /* bridge */ /* synthetic */ cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter n0(com.bxkj.base.chat.ChatActivity r0) {
            cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView o0(com.bxkj.base.chat.ChatActivity r0) {
            androidx.recyclerview.widget.RecyclerView r0 = r0.K0
            return r0
    }

    static /* bridge */ /* synthetic */ com.scwang.smartrefresh.layout.SmartRefreshLayout p0(com.bxkj.base.chat.ChatActivity r0) {
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r0.L0
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String q0(com.bxkj.base.chat.ChatActivity r0) {
            java.lang.String r0 = r0.f562p0
            return r0
    }

    static /* bridge */ /* synthetic */ void r0(com.bxkj.base.chat.ChatActivity r0, java.lang.String r1) {
            r0.f562p0 = r1
            return
    }

    static /* synthetic */ android.content.Context s0(com.bxkj.base.chat.ChatActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void t0() {
            r3 = this;
            cn.bluemobi.dylan.base.utils.a r0 = cn.bluemobi.dylan.base.utils.a.n()
            java.lang.Class<com.bxkj.base.chat.ConversationListActivity> r1 = com.bxkj.base.chat.ConversationListActivity.class
            android.app.Activity r0 = r0.getActivity(r1)
            if (r0 == 0) goto Ld
            goto L41
        Ld:
            com.bxkj.base.chat.heart.b r0 = r3.J0
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

    private /* synthetic */ void w0() {
            r3 = this;
            android.content.Intent r0 = r3.getIntent()
            android.content.Context r1 = r3.V
            java.lang.Class<com.bxkj.base.chat.ChatInfoActivity> r2 = com.bxkj.base.chat.ChatInfoActivity.class
            android.content.Intent r0 = r0.setClass(r1, r2)
            java.lang.String r1 = "groupId"
            java.lang.String r2 = r3.f561k0
            android.content.Intent r0 = r0.putExtra(r1, r2)
            r3.startActivity(r0)
            return
    }

    private /* synthetic */ kotlin.n1 x0(java.io.File r1) {
            r0 = this;
            r0.B0(r1)
            r1 = 0
            return r1
    }

    private /* synthetic */ void y0() {
            r3 = this;
            cn.bluemobi.dylan.base.adapter.common.recyclerview.MultiItemCommonAdapter<java.util.Map<java.lang.String, java.lang.Object>> r0 = r3.b0
            r0.notifyDataSetChanged()
            android.content.Context r0 = r3.V
            androidx.localbroadcastmanager.content.LocalBroadcastManager r0 = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(r0)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "NOTIFY_SEND_MESSAGE_CALLBACK_SUCCESS"
            r1.<init>(r2)
            r0.sendBroadcast(r1)
            return
    }

    private void z0(java.lang.String r5) {
            r4 = this;
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r0 = r4.M0
            if (r0 != 0) goto L5
            return
        L5:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        Lb:
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r4.M0
            int r2 = r2.size()
            if (r1 >= r2) goto L3d
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r4.M0
            java.lang.Object r2 = r2.get(r1)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "isImg"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
            java.lang.String r3 = "1"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L3a
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r2 = r4.M0
            java.lang.Object r2 = r2.get(r1)
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "content"
            java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r2, r3)
            r0.add(r2)
        L3a:
            int r1 = r1 + 1
            goto Lb
        L3d:
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r4.V
            java.lang.Class<cn.bluemobi.dylan.photoview.ImagePagerActivity> r3 = cn.bluemobi.dylan.photoview.ImagePagerActivity.class
            r1.<init>(r2, r3)
            int r2 = r0.size()
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r2 = r0.toArray(r2)
            java.lang.String[] r2 = (java.lang.String[]) r2
            java.lang.String r3 = "image_urls"
            r1.putExtra(r3, r2)
            java.lang.String r2 = "image_index"
            int r5 = r0.indexOf(r5)
            r1.putExtra(r2, r5)
            r4.startActivity(r1)
            int r5 = com.bxkj.base.R.anim.zoom_ente
            int r0 = com.bxkj.base.R.anim.zoom_exit
            r4.overridePendingTransition(r5, r0)
            return
    }

    public void A0() {
            r1 = this;
            r0 = 1
            r1.P0 = r0
            r1.u0()
            return
    }

    public void L() {
            r1 = this;
            android.widget.Button r0 = r1.Z
            r0.setOnClickListener(r1)
            android.widget.ImageView r0 = r1.a0
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            int r0 = com.bxkj.base.R.layout.ac_chat
            return r0
    }

    public void R() {
            r4 = this;
            java.lang.String r0 = com.tsn.chat.utils.a.c()
            r4.H0 = r0
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.String r1 = "NOTIFY_SEND_MESSAGE_CALLBACK_SUCCESS"
            r0.addAction(r1)
            java.lang.String r1 = "NOTIFY_RECEIVER_MESSAGE"
            r0.addAction(r1)
            androidx.localbroadcastmanager.content.LocalBroadcastManager r1 = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(r4)
            android.content.BroadcastReceiver r2 = r4.N0
            r1.registerReceiver(r2, r0)
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r1 = r4.V
            r0.<init>(r1)
            r1 = 1
            r0.setStackFromEnd(r1)
            androidx.recyclerview.widget.RecyclerView r2 = r4.K0
            r2.setLayoutManager(r0)
            android.view.animation.LayoutAnimationController r0 = new android.view.animation.LayoutAnimationController
            int r2 = com.bxkj.base.R.anim.zoom_in
            android.view.animation.Animation r2 = android.view.animation.AnimationUtils.loadAnimation(r4, r2)
            r0.<init>(r2)
            r0.setOrder(r1)
            androidx.recyclerview.widget.RecyclerView r1 = r4.K0
            r1.setLayoutAnimation(r0)
            com.bxkj.base.chat.ChatActivity$a r0 = new com.bxkj.base.chat.ChatActivity$a
            r0.<init>(r4)
            com.bxkj.base.chat.ChatActivity$b r1 = new com.bxkj.base.chat.ChatActivity$b
            android.content.Context r2 = r4.V
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.M0
            r1.<init>(r4, r2, r3, r0)
            r4.b0 = r1
            androidx.recyclerview.widget.RecyclerView r0 = r4.K0
            r0.setAdapter(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r4.K0
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            com.bxkj.base.chat.ChatActivity$c r1 = new com.bxkj.base.chat.ChatActivity$c
            r1.<init>(r4)
            r0.addOnGlobalLayoutListener(r1)
            r4.v0()
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r4.L0
            r0.Q()
            r4.C0()
            return
    }

    public void S() {
            r3 = this;
            java.lang.String r0 = "师生互动"
            r3.setTitle(r0)
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "chatName"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L1e
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r3.I0 = r0
            r3.setTitle(r0)
        L1e:
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "chatType"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L35
            android.content.Intent r0 = r3.getIntent()
            r2 = 1
            int r0 = r0.getIntExtra(r1, r2)
            r3.c0 = r0
        L35:
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "groupId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L4b
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r3.f561k0 = r0
        L4b:
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "userId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L61
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r3.f562p0 = r0
        L61:
            int r0 = r3.c0
            r1 = 2
            if (r0 != r1) goto L70
            int r0 = com.bxkj.base.R.mipmap.setting_white
            com.bxkj.base.chat.c r1 = new com.bxkj.base.chat.c
            r1.<init>(r3)
            r3.Z(r0, r1)
        L70:
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            int r1 = com.bxkj.base.R.id.recyclerView
            android.view.View r1 = r0.findViewById(r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r0.K0 = r1
            int r1 = com.bxkj.base.R.id.refresh
            android.view.View r1 = r0.findViewById(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r1 = (com.scwang.smartrefresh.layout.SmartRefreshLayout) r1
            r0.L0 = r1
            int r1 = com.bxkj.base.R.id.et_reply
            android.view.View r1 = r0.findViewById(r1)
            android.widget.EditText r1 = (android.widget.EditText) r1
            r0.Y = r1
            int r1 = com.bxkj.base.R.id.bt_ok
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r0.Z = r1
            int r1 = com.bxkj.base.R.id.bt_add
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.a0 = r1
            return
    }

    public void onClick(android.view.View r3) {
            r2 = this;
            int r3 = r3.getId()
            int r0 = com.bxkj.base.R.id.bt_ok
            if (r3 != r0) goto Ld
            r3 = 0
            r2.B0(r3)
            return
        Ld:
            int r0 = com.bxkj.base.R.id.bt_add
            if (r3 != r0) goto L1d
            com.bxkj.base.v2.common.utils.w r3 = com.bxkj.base.v2.common.utils.w.a
            androidx.fragment.app.FragmentActivity r0 = r2.W
            com.bxkj.base.chat.b r1 = new com.bxkj.base.chat.b
            r1.<init>(r2)
            r3.q(r0, r1)
        L1d:
            return
    }

    protected void onDestroy() {
            r2 = this;
            android.os.Handler r0 = r2.F0
            if (r0 == 0) goto Lb
            java.lang.Runnable r1 = r2.G0
            if (r1 == 0) goto Lb
            r0.removeCallbacks(r1)
        Lb:
            android.content.BroadcastReceiver r0 = r2.N0
            if (r0 == 0) goto L18
            androidx.localbroadcastmanager.content.LocalBroadcastManager r0 = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(r2)
            android.content.BroadcastReceiver r1 = r2.N0
            r0.unregisterReceiver(r1)
        L18:
            r2.t0()
            super.onDestroy()
            return
    }

    protected void onPause() {
            r1 = this;
            super.onPause()
            r0 = 1
            com.bxkj.base.BaseApp.h(r0)
            return
    }

    protected void onResume() {
            r5 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onResume()
            r0 = 0
            com.bxkj.base.BaseApp.h(r0)
            android.content.Context r0 = r5.V
            java.lang.Class<com.bxkj.base.chat.heart.AlarmChatService> r1 = com.bxkj.base.chat.heart.AlarmChatService.class
            java.lang.String r1 = r1.getName()
            boolean r0 = com.bxkj.base.util.a0.a(r0, r1)
            if (r0 != 0) goto L27
            java.lang.String r0 = "AlarmChatService----------isServiceStop"
            com.orhanobut.logger.j.c(r0)
            com.bxkj.base.chat.heart.b r0 = new com.bxkj.base.chat.heart.b
            android.content.Context r1 = r5.V
            r0.<init>(r1)
            r5.J0 = r0
            r0.b()
            return
        L27:
            long r0 = java.lang.System.currentTimeMillis()
            com.bxkj.base.user.LoginUser r2 = com.bxkj.base.user.LoginUser.getLoginUser()
            long r2 = r2.getLastHeartCallBackTime()
            long r0 = r0 - r2
            r2 = 10000(0x2710, double:4.9407E-320)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L4c
            java.lang.String r0 = "AlarmChatService----------timeout"
            com.orhanobut.logger.j.c(r0)
            com.bxkj.base.chat.heart.b r0 = new com.bxkj.base.chat.heart.b
            android.content.Context r1 = r5.V
            r0.<init>(r1)
            r5.J0 = r0
            r0.b()
            return
        L4c:
            java.lang.String r0 = "AlarmChatService----------isServiceRunning"
            com.orhanobut.logger.j.c(r0)
            return
    }

    public void u0() {
            r10 = this;
            android.content.Context r0 = r10.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.hideLoadingDialog()
            java.lang.Class<w.a> r1 = w.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            r2 = r1
            w.a r2 = (w.a) r2
            int r3 = r10.c0
            r1 = 0
            r4 = 1
            if (r3 != r4) goto L1c
            java.lang.String r5 = r10.f562p0
            goto L1d
        L1c:
            r5 = r1
        L1d:
            r6 = 2
            if (r3 != r6) goto L23
            java.lang.String r6 = r10.f561k0
            goto L24
        L23:
            r6 = r1
        L24:
            int r7 = r10.O0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            int r8 = r10.P0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            int r9 = r10.P0
            if (r9 != r4) goto L3a
        L34:
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r1
            goto L3d
        L3a:
            java.lang.String r1 = r10.H0
            goto L34
        L3d:
            rx.e r1 = r2.e(r3, r4, r5, r6, r7, r8)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.base.chat.ChatActivity$g r1 = new com.bxkj.base.chat.ChatActivity$g
            r1.<init>(r10)
            r0.setDataListener(r1)
            return
    }

    public void v0() {
            r3 = this;
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r3.L0
            r1 = 1073741824(0x40000000, float:2.0)
            r0.g1(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r3.L0
            r1 = 1112014848(0x42480000, float:50.0)
            android.content.Context r2 = r3.V
            int r1 = cn.bluemobi.dylan.base.utils.u.a(r1, r2)
            float r1 = (float) r1
            r0.e1(r1)
            com.scwang.smartrefresh.layout.SmartRefreshLayout r0 = r3.L0
            com.bxkj.base.chat.ChatActivity$f r1 = new com.bxkj.base.chat.ChatActivity$f
            r1.<init>(r3)
            r0.m1(r1)
            return
    }
}
