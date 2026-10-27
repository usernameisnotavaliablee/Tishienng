package com.bxkj.base.feedback;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class FeedBackActivity extends cn.bluemobi.dylan.base.BaseActivity {
    private android.widget.EditText Y;
    private android.widget.EditText Z;
    private cn.bluemobi.dylan.base.view.MyGridView a0;
    private android.widget.Button b0;
    private java.util.List<java.lang.String> c0;

    /* renamed from: k0, reason: collision with root package name */
    private cn.bluemobi.dylan.base.adapter.c f570k0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends cn.bluemobi.dylan.http.HttpCallBack {
        final /* synthetic */ com.bxkj.base.feedback.FeedBackActivity a;

        a(com.bxkj.base.feedback.FeedBackActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void netOnSuccess(java.util.Map<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                com.bxkj.base.feedback.FeedBackActivity r2 = r1.a
                java.lang.String r0 = "反馈成功"
                r2.f0(r0)
                com.bxkj.base.feedback.FeedBackActivity r2 = r1.a
                r2.finish()
                return
        }
    }

    public FeedBackActivity() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.c0 = r0
            return
    }

    public static /* synthetic */ void g0(com.bxkj.base.feedback.FeedBackActivity r0, android.view.View r1) {
            r0.m0(r1)
            return
    }

    public static /* synthetic */ kotlin.n1 h0(com.bxkj.base.feedback.FeedBackActivity r0, java.io.File r1) {
            kotlin.n1 r0 = r0.k0(r1)
            return r0
    }

    public static /* synthetic */ void i0(com.bxkj.base.feedback.FeedBackActivity r0, android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0.l0(r1, r2, r3, r4)
            return
    }

    private void j0() {
            r12 = this;
            android.widget.EditText r0 = r12.Y
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = r0.trim()
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L1a
            java.lang.String r0 = "申请理由不能为空"
            r12.f0(r0)
            return
        L1a:
            java.util.List<java.lang.String> r0 = r12.c0
            int r0 = r0.size()
            if (r0 != 0) goto L28
            java.lang.String r0 = "至少上传一张图片"
            r12.f0(r0)
            return
        L28:
            android.widget.EditText r0 = r12.Z
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r7 = r0.trim()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.List<java.lang.String> r2 = r12.c0
            java.util.Iterator r2 = r2.iterator()
        L46:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L90
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.io.File r4 = new java.io.File
            r4.<init>(r3)
            java.lang.String r3 = r0.toString()
            boolean r3 = r3.isEmpty()
            java.lang.String r6 = ","
            java.lang.String r8 = ""
            if (r3 == 0) goto L67
            r3 = r8
            goto L68
        L67:
            r3 = r6
        L68:
            r0.append(r3)
            java.lang.String r3 = r4.getName()
            r0.append(r3)
            java.lang.String r3 = r1.toString()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L7d
            r6 = r8
        L7d:
            r1.append(r6)
            java.lang.String r3 = r4.getPath()
            byte[] r3 = n0(r3)
            java.lang.String r3 = cn.bluemobi.dylan.base.utils.b.b(r3)
            r1.append(r3)
            goto L46
        L90:
            android.content.Context r2 = r12.V
            cn.bluemobi.dylan.http.HttpRequest r11 = cn.bluemobi.dylan.http.Http.with(r2)
            java.lang.Class<w.f> r2 = w.f.class
            java.lang.Object r2 = cn.bluemobi.dylan.http.Http.getApiService(r2)
            w.f r2 = (w.f) r2
            android.content.Context r3 = r12.V
            java.lang.String r3 = com.bxkj.base.util.b0.h(r3)
            com.bxkj.base.user.LoginUser r4 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r4 = r4.getSchoolId()
            com.bxkj.base.user.LoginUser r6 = com.bxkj.base.user.LoginUser.getLoginUser()
            java.lang.String r6 = r6.getUserId()
            java.lang.String r8 = r0.toString()
            java.lang.String r9 = r1.toString()
            java.lang.String r10 = "0"
            r1 = r2
            r2 = r3
            java.lang.String r3 = "Android"
            rx.e r0 = r1.j(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            cn.bluemobi.dylan.http.HttpRequest r0 = r11.setObservable(r0)
            com.bxkj.base.feedback.FeedBackActivity$a r1 = new com.bxkj.base.feedback.FeedBackActivity$a
            r1.<init>(r12)
            r0.setDataListener(r1)
            return
    }

    private /* synthetic */ kotlin.n1 k0(java.io.File r2) {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.c0
            java.lang.String r2 = r2.getPath()
            r0.add(r2)
            cn.bluemobi.dylan.base.adapter.c r2 = r1.f570k0
            java.util.List<java.lang.String> r0 = r1.c0
            r2.c(r0)
            r2 = 0
            return r2
    }

    private /* synthetic */ void l0(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            java.util.List<java.lang.String> r1 = r0.c0
            int r1 = r1.size()
            if (r3 != r1) goto L15
            com.bxkj.base.v2.common.utils.w r1 = com.bxkj.base.v2.common.utils.w.a
            androidx.fragment.app.FragmentActivity r2 = r0.W
            com.bxkj.base.feedback.c r3 = new com.bxkj.base.feedback.c
            r3.<init>(r0)
            r1.q(r2, r3)
            return
        L15:
            android.content.Context r1 = r0.V
            java.util.List<java.lang.String> r2 = r0.c0
            com.bxkj.base.util.n.c(r1, r2, r3)
            return
    }

    private /* synthetic */ void m0(android.view.View r1) {
            r0 = this;
            r0.j0()
            return
    }

    public static byte[] n0(java.lang.String r9) {
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

    public void L() {
            r2 = this;
            cn.bluemobi.dylan.base.view.MyGridView r0 = r2.a0
            com.bxkj.base.feedback.a r1 = new com.bxkj.base.feedback.a
            r1.<init>(r2)
            r0.setOnItemClickListener(r1)
            android.widget.Button r0 = r2.b0
            com.bxkj.base.feedback.b r1 = new com.bxkj.base.feedback.b
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return
    }

    protected int N() {
            r1 = this;
            int r0 = com.bxkj.base.R.layout.ac_feedback
            return r0
    }

    public void R() {
            r5 = this;
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "imagePath"
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L19
            java.util.List<java.lang.String> r0 = r5.c0
            android.content.Intent r2 = r5.getIntent()
            java.lang.String r1 = r2.getStringExtra(r1)
            r0.add(r1)
        L19:
            cn.bluemobi.dylan.base.adapter.c r0 = new cn.bluemobi.dylan.base.adapter.c
            java.util.List<java.lang.String> r1 = r5.c0
            android.content.Context r2 = r5.V
            r3 = 1092616192(0x41200000, float:10.0)
            int r3 = cn.bluemobi.dylan.base.utils.u.a(r3, r2)
            r4 = 4
            r0.<init>(r1, r2, r4, r3)
            r5.f570k0 = r0
            r0.e(r4)
            cn.bluemobi.dylan.base.view.MyGridView r0 = r5.a0
            cn.bluemobi.dylan.base.adapter.c r1 = r5.f570k0
            r0.setAdapter(r1)
            return
    }

    public void S() {
            r1 = this;
            java.lang.String r0 = "反馈求助"
            r1.setTitle(r0)
            return
    }

    public void T(android.os.Bundle r1) {
            r0 = this;
            int r1 = com.bxkj.base.R.id.et_content
            android.view.View r1 = r0.findViewById(r1)
            android.widget.EditText r1 = (android.widget.EditText) r1
            r0.Y = r1
            int r1 = com.bxkj.base.R.id.et_phone
            android.view.View r1 = r0.findViewById(r1)
            android.widget.EditText r1 = (android.widget.EditText) r1
            r0.Z = r1
            int r1 = com.bxkj.base.R.id.gv_images
            android.view.View r1 = r0.findViewById(r1)
            cn.bluemobi.dylan.base.view.MyGridView r1 = (cn.bluemobi.dylan.base.view.MyGridView) r1
            r0.a0 = r1
            int r1 = com.bxkj.base.R.id.bt_commit
            android.view.View r1 = r0.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r0.b0 = r1
            return
    }

    public void onClick(android.view.View r1) {
            r0 = this;
            return
    }
}
