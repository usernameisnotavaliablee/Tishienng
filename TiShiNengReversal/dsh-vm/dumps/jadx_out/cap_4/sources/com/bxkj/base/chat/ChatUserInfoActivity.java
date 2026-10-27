package com.bxkj.base.chat;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ChatUserInfoActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.TextView F0;
    private android.widget.Button G0;
    private java.lang.String H0;
    private java.lang.String I0;
    private android.widget.ImageView Y;
    private android.widget.TextView Z;
    private android.widget.TextView a0;
    private android.widget.TextView b0;
    private android.widget.TextView c0;

    /* renamed from: k0, reason: collision with root package name */
    private android.widget.TextView f564k0;

    /* renamed from: p0, reason: collision with root package name */
    private android.widget.TextView f565p0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.base.chat.ChatUserInfoActivity a;

        a(com.bxkj.base.chat.ChatUserInfoActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r5) {
                r4 = this;
                com.bxkj.base.chat.ChatUserInfoActivity r0 = r4.a
                android.widget.FrameLayout r0 = r0.P()
                r1 = 0
                r0.setVisibility(r1)
                com.bxkj.base.chat.ChatUserInfoActivity r0 = r4.a
                android.content.Context r0 = com.bxkj.base.chat.ChatUserInfoActivity.p0(r0)
                com.bumptech.glide.i r0 = com.bumptech.glide.b.D(r0)
                java.lang.String r1 = "collectPhoto"
                java.lang.String r1 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r1)
                com.bumptech.glide.h r0 = r0.M(r1)
                com.bxkj.base.chat.ChatUserInfoActivity r1 = r4.a
                android.widget.ImageView r1 = com.bxkj.base.chat.ChatUserInfoActivity.h0(r1)
                r0.m1(r1)
                com.bxkj.base.chat.ChatUserInfoActivity r0 = r4.a
                android.widget.TextView r0 = com.bxkj.base.chat.ChatUserInfoActivity.l0(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "姓名："
                r1.append(r2)
                java.lang.String r2 = "name"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.setText(r1)
                com.bxkj.base.chat.ChatUserInfoActivity r0 = r4.a
                android.widget.TextView r0 = com.bxkj.base.chat.ChatUserInfoActivity.o0(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "性别："
                r1.append(r2)
                java.lang.String r2 = "sex"
                int r2 = cn.bluemobi.dylan.http.JsonParse.getInt(r5, r2)
                r3 = 1
                if (r2 != r3) goto L63
                java.lang.String r2 = "男"
                goto L65
            L63:
                java.lang.String r2 = "女"
            L65:
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.setText(r1)
                com.bxkj.base.chat.ChatUserInfoActivity r0 = r4.a
                android.widget.TextView r0 = com.bxkj.base.chat.ChatUserInfoActivity.m0(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "学号："
                r1.append(r2)
                java.lang.String r2 = "userNum"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.setText(r1)
                com.bxkj.base.chat.ChatUserInfoActivity r0 = r4.a
                android.widget.TextView r0 = com.bxkj.base.chat.ChatUserInfoActivity.k0(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "年级："
                r1.append(r2)
                java.lang.String r2 = "grade"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.setText(r1)
                com.bxkj.base.chat.ChatUserInfoActivity r0 = r4.a
                android.widget.TextView r0 = com.bxkj.base.chat.ChatUserInfoActivity.j0(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "院系："
                r1.append(r2)
                java.lang.String r2 = "faculty"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.setText(r1)
                com.bxkj.base.chat.ChatUserInfoActivity r0 = r4.a
                android.widget.TextView r0 = com.bxkj.base.chat.ChatUserInfoActivity.n0(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "专业："
                r1.append(r2)
                java.lang.String r2 = "profession"
                java.lang.String r2 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r2)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.setText(r1)
                com.bxkj.base.chat.ChatUserInfoActivity r0 = r4.a
                android.widget.TextView r0 = com.bxkj.base.chat.ChatUserInfoActivity.i0(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "班级："
                r1.append(r2)
                java.lang.String r2 = "class"
                java.lang.String r5 = cn.bluemobi.dylan.http.JsonParse.getString(r5, r2)
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.setText(r5)
                return
        }
    }

    public ChatUserInfoActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void g0(com.bxkj.base.chat.ChatUserInfoActivity r0, android.view.View r1) {
            r0.r0(r1)
            return
    }

    static /* bridge */ /* synthetic */ android.widget.ImageView h0(com.bxkj.base.chat.ChatUserInfoActivity r0) {
            android.widget.ImageView r0 = r0.Y
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView i0(com.bxkj.base.chat.ChatUserInfoActivity r0) {
            android.widget.TextView r0 = r0.F0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView j0(com.bxkj.base.chat.ChatUserInfoActivity r0) {
            android.widget.TextView r0 = r0.f564k0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView k0(com.bxkj.base.chat.ChatUserInfoActivity r0) {
            android.widget.TextView r0 = r0.c0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView l0(com.bxkj.base.chat.ChatUserInfoActivity r0) {
            android.widget.TextView r0 = r0.Z
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView m0(com.bxkj.base.chat.ChatUserInfoActivity r0) {
            android.widget.TextView r0 = r0.b0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView n0(com.bxkj.base.chat.ChatUserInfoActivity r0) {
            android.widget.TextView r0 = r0.f565p0
            return r0
    }

    static /* bridge */ /* synthetic */ android.widget.TextView o0(com.bxkj.base.chat.ChatUserInfoActivity r0) {
            android.widget.TextView r0 = r0.a0
            return r0
    }

    static /* synthetic */ android.content.Context p0(com.bxkj.base.chat.ChatUserInfoActivity r0) {
            android.content.Context r0 = r0.V
            return r0
    }

    private void q0() {
            r3 = this;
            android.content.Context r0 = r3.V
            cn.bluemobi.dylan.http.HttpRequest r0 = cn.bluemobi.dylan.http.Http.with(r0)
            java.lang.Class<w.a> r1 = w.a.class
            java.lang.Object r1 = cn.bluemobi.dylan.http.Http.getApiService(r1)
            w.a r1 = (w.a) r1
            java.lang.String r2 = r3.H0
            rx.e r1 = r1.b(r2)
            cn.bluemobi.dylan.http.HttpRequest r0 = r0.setObservable(r1)
            com.bxkj.base.chat.ChatUserInfoActivity$a r1 = new com.bxkj.base.chat.ChatUserInfoActivity$a
            r1.<init>(r3)
            r0.setDataListener(r1)
            return
    }

    private /* synthetic */ void r0(android.view.View r3) {
            r2 = this;
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r0 = r2.V
            java.lang.Class<com.bxkj.base.chat.ChatActivity> r1 = com.bxkj.base.chat.ChatActivity.class
            r3.<init>(r0, r1)
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            android.content.Intent r3 = r3.setFlags(r0)
            java.lang.String r0 = "chatName"
            java.lang.String r1 = r2.I0
            android.content.Intent r3 = r3.putExtra(r0, r1)
            java.lang.String r0 = "chatType"
            r1 = 1
            android.content.Intent r3 = r3.putExtra(r0, r1)
            java.lang.String r0 = "userId"
            java.lang.String r1 = r2.H0
            android.content.Intent r3 = r3.putExtra(r0, r1)
            r2.startActivity(r3)
            return
    }

    public void L() {
            r2 = this;
            android.widget.Button r0 = r2.G0
            com.bxkj.base.chat.i r1 = new com.bxkj.base.chat.i
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            int r0 = com.bxkj.base.R.layout.ac_chat_user_info
            return r0
    }

    public void R() {
            r2 = this;
            android.widget.FrameLayout r0 = r2.P()
            r1 = 8
            r0.setVisibility(r1)
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "userId"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L1f
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r2.H0 = r0
        L1f:
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "userName"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L3a
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            r2.I0 = r0
            android.widget.TextView r1 = r2.Z
            r1.setText(r0)
        L3a:
            r2.q0()
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "用户信息"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            int r1 = com.bxkj.base.R.id.iv_head
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.Y = r1
            int r1 = com.bxkj.base.R.id.tv_name
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.Z = r1
            int r1 = com.bxkj.base.R.id.tv_sex
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.a0 = r1
            int r1 = com.bxkj.base.R.id.tv_number
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.b0 = r1
            int r1 = com.bxkj.base.R.id.tv_grade
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.c0 = r1
            int r1 = com.bxkj.base.R.id.tv_compus
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f564k0 = r1
            int r1 = com.bxkj.base.R.id.tv_post
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f565p0 = r1
            int r1 = com.bxkj.base.R.id.tv_class
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.F0 = r1
            int r1 = com.bxkj.base.R.id.bt_chat
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r0.G0 = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
