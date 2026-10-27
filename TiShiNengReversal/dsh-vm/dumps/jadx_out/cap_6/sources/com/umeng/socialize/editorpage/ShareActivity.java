package com.umeng.socialize.editorpage;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ShareActivity extends android.app.Activity implements android.view.View.OnClickListener {
    private static final java.lang.String c = "ShareActivity";
    private static int d = 140;
    protected android.widget.ImageView a;
    android.text.TextWatcher b;
    private java.lang.String e;
    private java.lang.String f;
    private java.lang.String g;
    private java.lang.String h;
    private com.umeng.socialize.common.ResContainer i;
    private android.widget.EditText j;
    private android.widget.TextView k;
    private android.content.Context l;
    private boolean m;
    private com.umeng.socialize.bean.SHARE_MEDIA n;
    private boolean o;
    private android.widget.ImageView p;

    /* renamed from: q, reason: collision with root package name */
    private android.widget.TextView f40q;



    static {
            return
    }

    public ShareActivity() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "7.3.2"
            r1.e = r0
            r0 = 0
            r1.o = r0
            com.umeng.socialize.editorpage.ShareActivity$1 r0 = new com.umeng.socialize.editorpage.ShareActivity$1
            r0.<init>(r1)
            r1.b = r0
            return
    }

    private com.umeng.socialize.bean.SHARE_MEDIA a(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "DOUBAN"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lb
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.DOUBAN
            return r2
        Lb:
            java.lang.String r0 = "TWITTER"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L16
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.TWITTER
            return r2
        L16:
            java.lang.String r0 = "LINKEDIN"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L21
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.LINKEDIN
            return r2
        L21:
            com.umeng.socialize.bean.SHARE_MEDIA r2 = com.umeng.socialize.bean.SHARE_MEDIA.SINA
            return r2
    }

    static /* synthetic */ boolean a(com.umeng.socialize.editorpage.ShareActivity r0) {
            boolean r0 = r0.e()
            return r0
    }

    static /* synthetic */ boolean a(com.umeng.socialize.editorpage.ShareActivity r0, boolean r1) {
            r0.m = r1
            return r1
    }

    private java.lang.String b(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "TENCENT"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L19
            android.content.res.Resources r3 = r2.getResources()
            com.umeng.socialize.common.ResContainer r0 = r2.i
            java.lang.String r1 = "umeng_socialize_sharetotencent"
            int r0 = r0.string(r1)
            java.lang.String r3 = r3.getString(r0)
            return r3
        L19:
            java.lang.String r0 = "RENREN"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L32
            android.content.res.Resources r3 = r2.getResources()
            com.umeng.socialize.common.ResContainer r0 = r2.i
            java.lang.String r1 = "umeng_socialize_sharetorenren"
            int r0 = r0.string(r1)
            java.lang.String r3 = r3.getString(r0)
            return r3
        L32:
            java.lang.String r0 = "DOUBAN"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L4b
            android.content.res.Resources r3 = r2.getResources()
            com.umeng.socialize.common.ResContainer r0 = r2.i
            java.lang.String r1 = "umeng_socialize_sharetodouban"
            int r0 = r0.string(r1)
            java.lang.String r3 = r3.getString(r0)
            return r3
        L4b:
            java.lang.String r0 = "TWITTER"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L64
            android.content.res.Resources r3 = r2.getResources()
            com.umeng.socialize.common.ResContainer r0 = r2.i
            java.lang.String r1 = "umeng_socialize_sharetotwitter"
            int r0 = r0.string(r1)
            java.lang.String r3 = r3.getString(r0)
            return r3
        L64:
            java.lang.String r0 = "LINKEDIN"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L7d
            android.content.res.Resources r3 = r2.getResources()
            com.umeng.socialize.common.ResContainer r0 = r2.i
            java.lang.String r1 = "umeng_socialize_sharetolinkin"
            int r0 = r0.string(r1)
            java.lang.String r3 = r3.getString(r0)
            return r3
        L7d:
            android.content.res.Resources r3 = r2.getResources()
            com.umeng.socialize.common.ResContainer r0 = r2.i
            java.lang.String r1 = "umeng_socialize_sharetosina"
            int r0 = r0.string(r1)
            java.lang.String r3 = r3.getString(r0)
            return r3
    }

    private void b() {
            r6 = this;
            com.umeng.socialize.common.ResContainer r0 = r6.i
            java.lang.String r1 = "umeng_socialize_share_edittext"
            int r0 = r0.id(r1)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r6.j = r0
            java.lang.String r0 = r6.f
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2a
            android.widget.EditText r0 = r6.j
            java.lang.String r1 = r6.f
            r0.setText(r1)
            android.widget.EditText r0 = r6.j
            java.lang.String r1 = r6.f
            int r1 = r1.length()
            r0.setSelection(r1)
        L2a:
            com.umeng.socialize.common.ResContainer r0 = r6.i
            java.lang.String r1 = "umeng_web_title"
            int r0 = r0.id(r1)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.f40q = r0
            com.umeng.socialize.common.ResContainer r0 = r6.i
            java.lang.String r1 = "umeng_share_icon"
            int r0 = r0.id(r1)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r6.a = r0
            java.lang.String r0 = r6.h
            java.lang.String r2 = "umeng_socialize_share_web"
            java.lang.String r3 = "drawable"
            r4 = 0
            if (r0 == 0) goto Lee
            com.umeng.socialize.common.ResContainer r0 = r6.i
            java.lang.String r5 = "umeng_socialize_share_bottom_area"
            int r0 = r0.id(r5)
            android.view.View r0 = r6.findViewById(r0)
            r0.setVisibility(r4)
            com.umeng.socialize.common.ResContainer r0 = r6.i
            int r0 = r0.id(r1)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r6.a = r0
            r0.setVisibility(r4)
            java.lang.String r0 = r6.h
            java.lang.String r1 = "video"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L8b
            android.widget.ImageView r0 = r6.a
            android.content.Context r1 = r6.l
            java.lang.String r2 = "umeng_socialize_share_video"
            int r1 = com.umeng.socialize.common.ResContainer.getResourceId(r1, r3, r2)
            r0.setImageResource(r1)
            goto Lc9
        L8b:
            java.lang.String r0 = r6.h
            java.lang.String r1 = "music"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto La3
            android.widget.ImageView r0 = r6.a
            android.content.Context r1 = r6.l
            java.lang.String r2 = "umeng_socialize_share_music"
            int r1 = com.umeng.socialize.common.ResContainer.getResourceId(r1, r3, r2)
            r0.setImageResource(r1)
            goto Lc9
        La3:
            java.lang.String r0 = r6.h
            java.lang.String r1 = "web"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb9
            android.widget.ImageView r0 = r6.a
            android.content.Context r1 = r6.l
            int r1 = com.umeng.socialize.common.ResContainer.getResourceId(r1, r3, r2)
            r0.setImageResource(r1)
            goto Lc9
        Lb9:
            android.widget.ImageView r0 = r6.a
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r6.h
            r1.<init>(r2)
            android.net.Uri r1 = android.net.Uri.fromFile(r1)
            r0.setImageURI(r1)
        Lc9:
            java.lang.String r0 = r6.g
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Ldd
            android.widget.TextView r0 = r6.f40q
            r0.setVisibility(r4)
            android.widget.TextView r0 = r6.f40q
            java.lang.String r1 = r6.g
            r0.setText(r1)
        Ldd:
            com.umeng.socialize.common.ResContainer r0 = r6.i
            java.lang.String r1 = "root"
            int r0 = r0.id(r1)
            android.view.View r0 = r6.findViewById(r0)
            r1 = -1
            r0.setBackgroundColor(r1)
            return
        Lee:
            java.lang.String r0 = r6.g
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L10d
            android.widget.ImageView r0 = r6.a
            android.content.Context r1 = r6.l
            int r1 = com.umeng.socialize.common.ResContainer.getResourceId(r1, r3, r2)
            r0.setImageResource(r1)
            android.widget.TextView r0 = r6.f40q
            r0.setVisibility(r4)
            android.widget.TextView r0 = r6.f40q
            java.lang.String r1 = r6.g
            r0.setText(r1)
        L10d:
            return
    }

    private void c() {
            r4 = this;
            android.widget.EditText r0 = r4.j
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r0.trim()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = 0
            if (r1 == 0) goto L4d
            com.umeng.socialize.bean.SHARE_MEDIA r1 = r4.n
            com.umeng.socialize.bean.SHARE_MEDIA r3 = com.umeng.socialize.bean.SHARE_MEDIA.SINA
            if (r1 != r3) goto L4d
            java.lang.String r1 = r4.h
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L41
            java.lang.String r1 = r4.h
            java.lang.String r3 = "web"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L41
            java.lang.String r1 = r4.h
            java.lang.String r3 = "video"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L41
            java.lang.String r1 = r4.h
            java.lang.String r3 = "music"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L4d
        L41:
            android.content.Context r0 = r4.l
            java.lang.String r1 = com.umeng.socialize.utils.UmengText.SHARE.CONTEXT_EMPTY
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
            return
        L4d:
            int r1 = com.umeng.socialize.utils.SocializeUtils.countContentLength(r0)
            int r3 = com.umeng.socialize.editorpage.ShareActivity.d
            if (r1 <= r3) goto L60
            com.umeng.socialize.bean.SHARE_MEDIA r1 = r4.n
            com.umeng.socialize.bean.SHARE_MEDIA r3 = com.umeng.socialize.bean.SHARE_MEDIA.TWITTER
            if (r1 == r3) goto L60
            com.umeng.socialize.bean.SHARE_MEDIA r3 = com.umeng.socialize.bean.SHARE_MEDIA.LINKEDIN
            if (r1 == r3) goto L60
            return
        L60:
            boolean r1 = r4.m
            if (r1 == 0) goto L76
            com.umeng.socialize.bean.SHARE_MEDIA r1 = r4.n
            com.umeng.socialize.bean.SHARE_MEDIA r3 = com.umeng.socialize.bean.SHARE_MEDIA.TWITTER
            if (r1 == r3) goto L76
            android.content.Context r0 = r4.l
            java.lang.String r1 = com.umeng.socialize.utils.UmengText.SHARE.CONTEXT_LONG
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
            return
        L76:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "txt"
            r2.putString(r3, r0)
            java.lang.String r0 = "pic"
            java.lang.String r3 = r4.h
            r2.putString(r0, r3)
            r1.putExtras(r2)
            r0 = -1
            r4.setResult(r0, r1)
            r4.a()
            return
    }

    private void d() {
            r2 = this;
            r0 = 0
            r2.h = r0
            com.umeng.socialize.common.ResContainer r0 = r2.i
            java.lang.String r1 = "root"
            int r0 = r0.id(r1)
            android.view.View r0 = r2.findViewById(r0)
            java.lang.String r1 = "#D4E0E5"
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setBackgroundColor(r1)
            com.umeng.socialize.common.ResContainer r0 = r2.i
            java.lang.String r1 = "umeng_socialize_share_bottom_area"
            int r0 = r0.id(r1)
            android.view.View r0 = r2.findViewById(r0)
            r1 = 8
            r0.setVisibility(r1)
            return
    }

    private boolean e() {
            r4 = this;
            int r0 = com.umeng.socialize.editorpage.ShareActivity.d
            android.widget.EditText r1 = r4.j
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            int r1 = com.umeng.socialize.utils.SocializeUtils.countContentLength(r1)
            int r0 = r0 - r1
            android.widget.TextView r1 = r4.k
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.widget.EditText r3 = r4.j
            android.text.Editable r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            int r3 = com.umeng.socialize.utils.SocializeUtils.countContentLength(r3)
            r2.append(r3)
            java.lang.String r3 = "/"
            r2.append(r3)
            int r3 = com.umeng.socialize.editorpage.ShareActivity.d
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.setText(r2)
            if (r0 < 0) goto L3e
            r0 = 0
            return r0
        L3e:
            r0 = 1
            return r0
    }

    protected void a() {
            r0 = this;
            r0.finish()
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r4) {
            r3 = this;
            boolean r0 = com.umeng.socialize.common.SocializeConstants.BACKKEY_COMPLETE_CLOSE
            if (r0 == 0) goto L1c
            int r0 = r4.getKeyCode()
            r1 = 4
            if (r0 != r1) goto L1c
            android.os.Handler r4 = new android.os.Handler
            r4.<init>()
            com.umeng.socialize.editorpage.ShareActivity$2 r0 = new com.umeng.socialize.editorpage.ShareActivity$2
            r0.<init>(r3)
            r1 = 400(0x190, double:1.976E-321)
            r4.postDelayed(r0, r1)
            r4 = 1
            return r4
        L1c:
            boolean r4 = super.dispatchKeyEvent(r4)
            return r4
    }

    public void onCancel(android.view.View r1) {
            r0 = this;
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.setResult(r1)
            r0.a()
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r4) {
            r3 = this;
            int r0 = r4.getId()
            com.umeng.socialize.common.ResContainer r1 = r3.i
            java.lang.String r2 = "umeng_back"
            int r1 = r1.id(r2)
            if (r0 != r1) goto L12
            r3.onCancel(r4)
            return
        L12:
            com.umeng.socialize.common.ResContainer r4 = r3.i
            java.lang.String r1 = "umeng_share_btn"
            int r4 = r4.id(r1)
            if (r0 != r4) goto L20
            r3.c()
            return
        L20:
            com.umeng.socialize.common.ResContainer r4 = r3.i
            java.lang.String r1 = "umeng_del"
            int r4 = r4.id(r1)
            if (r0 != r4) goto L2d
            r3.d()
        L2d:
            return
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle r4) {
            r3 = this;
            com.umeng.socialize.common.ResContainer r0 = com.umeng.socialize.common.ResContainer.get(r3)
            r3.i = r0
            boolean r0 = com.umeng.socialize.utils.SocializeUtils.isFloatWindowStyle(r3)
            r3.o = r0
            super.onCreate(r4)
            r3.l = r3
            com.umeng.socialize.common.ResContainer r4 = r3.i
            java.lang.String r0 = "umeng_socialize_share"
            int r4 = r4.layout(r0)
            r3.setContentView(r4)
            android.view.Window r4 = r3.getWindow()
            android.view.WindowManager$LayoutParams r4 = r4.getAttributes()
            r0 = 32
            r4.softInputMode = r0
            boolean r0 = r3.o
            if (r0 == 0) goto L3c
            android.content.Context r0 = r3.l
            int[] r0 = com.umeng.socialize.utils.SocializeUtils.getFloatWindowSize(r0)
            r1 = 0
            r1 = r0[r1]
            r4.width = r1
            r1 = 1
            r0 = r0[r1]
            r4.height = r0
        L3c:
            android.view.Window r0 = r3.getWindow()
            r0.setAttributes(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.SHARE.SHAREVIEWV
            r4.append(r0)
            java.lang.String r0 = r3.e
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.umeng.socialize.utils.SLog.E(r4)
            android.content.Intent r4 = r3.getIntent()
            android.os.Bundle r4 = r4.getExtras()
            java.lang.String r0 = "media"
            java.lang.String r1 = r4.getString(r0)
            com.umeng.socialize.bean.SHARE_MEDIA r1 = r3.a(r1)
            r3.n = r1
            r1 = 140(0x8c, float:1.96E-43)
            com.umeng.socialize.editorpage.ShareActivity.d = r1
            java.lang.String r1 = "txt"
            java.lang.String r1 = r4.getString(r1)
            r3.f = r1
            java.lang.String r1 = "pic"
            java.lang.String r1 = r4.getString(r1)
            r3.h = r1
            java.lang.String r1 = "title"
            java.lang.String r1 = r4.getString(r1)
            r3.g = r1
            r3.b()
            com.umeng.socialize.common.ResContainer r1 = r3.i
            java.lang.String r2 = "umeng_del"
            int r1 = r1.id(r2)
            android.view.View r1 = r3.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r3.p = r1
            android.widget.EditText r1 = r3.j
            android.text.TextWatcher r2 = r3.b
            r1.addTextChangedListener(r2)
            com.umeng.socialize.common.ResContainer r1 = r3.i
            java.lang.String r2 = "umeng_title"
            int r1 = r1.id(r2)
            android.view.View r1 = r3.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r4 = r4.getString(r0)
            java.lang.String r4 = r3.b(r4)
            r1.setText(r4)
            com.umeng.socialize.common.ResContainer r4 = r3.i
            java.lang.String r0 = "umeng_back"
            int r4 = r4.id(r0)
            android.view.View r4 = r3.findViewById(r4)
            r4.setOnClickListener(r3)
            com.umeng.socialize.common.ResContainer r4 = r3.i
            java.lang.String r0 = "umeng_share_btn"
            int r4 = r4.id(r0)
            android.view.View r4 = r3.findViewById(r4)
            r4.setOnClickListener(r3)
            android.widget.ImageView r4 = r3.p
            r4.setOnClickListener(r3)
            com.umeng.socialize.common.ResContainer r4 = r3.i
            java.lang.String r0 = "umeng_socialize_share_word_num"
            int r4 = r4.id(r0)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.k = r4
            boolean r4 = r3.e()
            r3.m = r4
            return
    }

    @Override // android.app.Activity
    protected void onDestroy() {
            r0 = this;
            super.onDestroy()
            return
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r2, android.view.KeyEvent r3) {
            r1 = this;
            r0 = 4
            if (r2 != r0) goto Le
            int r0 = r3.getRepeatCount()
            if (r0 != 0) goto Le
            r0 = 1000(0x3e8, float:1.401E-42)
            r1.setResult(r0)
        Le:
            boolean r2 = super.onKeyDown(r2, r3)
            return r2
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int r1, android.view.KeyEvent r2) {
            r0 = this;
            boolean r1 = super.onKeyUp(r1, r2)
            return r1
    }

    @Override // android.app.Activity
    protected void onResume() {
            r1 = this;
            android.widget.EditText r0 = r1.j
            r0.requestFocus()
            super.onResume()
            return
    }

    @Override // android.app.Activity
    protected void onStop() {
            r0 = this;
            super.onStop()
            return
    }
}
