package com.tencent.connect.auth;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class AuthAgent extends com.tencent.connect.common.BaseApi {
    public static final java.lang.String KEY_FORCE_QR_LOGIN = "KEY_FORCE_QR_LOGIN";
    public static final java.lang.String SECURE_LIB_ARM64_FILE_NAME = "libwbsafeedit_64";
    public static final java.lang.String SECURE_LIB_ARM_FILE_NAME = "libwbsafeedit";
    public static java.lang.String SECURE_LIB_FILE_NAME = "libwbsafeedit";
    public static java.lang.String SECURE_LIB_NAME = null;
    public static final int SECURE_LIB_VERSION = 5;
    public static final java.lang.String SECURE_LIB_X86_64_FILE_NAME = "libwbsafeedit_x86_64";
    public static final java.lang.String SECURE_LIB_X86_FILE_NAME = "libwbsafeedit_x86";
    private com.tencent.tauth.IUiListener a;
    private java.lang.String d;
    private java.lang.ref.WeakReference<android.app.Activity> e;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class a extends com.tencent.tauth.DefaultUiListener {
        com.tencent.tauth.IUiListener a;
        final /* synthetic */ com.tencent.connect.auth.AuthAgent b;

        public a(com.tencent.connect.auth.AuthAgent r1, com.tencent.tauth.IUiListener r2) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                r0.a = r2
                return
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onCancel() {
                r1 = this;
                com.tencent.tauth.IUiListener r0 = r1.a
                if (r0 == 0) goto L7
                r0.onCancel()
            L7:
                return
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onComplete(java.lang.Object r7) {
                r6 = this;
                java.lang.String r0 = "ret"
                java.lang.String r1 = "openSDK_LOG.AuthAgent"
                if (r7 != 0) goto Lc
                java.lang.String r7 = "CheckLoginListener response data is null"
                com.tencent.open.log.SLog.e(r1, r7)
                return
            Lc:
                org.json.JSONObject r7 = (org.json.JSONObject) r7
                int r2 = r7.getInt(r0)     // Catch: org.json.JSONException -> L32
                java.lang.String r3 = "msg"
                if (r2 != 0) goto L19
                java.lang.String r7 = "success"
                goto L1d
            L19:
                java.lang.String r7 = r7.getString(r3)     // Catch: org.json.JSONException -> L32
            L1d:
                com.tencent.tauth.IUiListener r4 = r6.a     // Catch: org.json.JSONException -> L32
                if (r4 == 0) goto L31
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L32
                r5.<init>()     // Catch: org.json.JSONException -> L32
                org.json.JSONObject r0 = r5.put(r0, r2)     // Catch: org.json.JSONException -> L32
                org.json.JSONObject r7 = r0.put(r3, r7)     // Catch: org.json.JSONException -> L32
                r4.onComplete(r7)     // Catch: org.json.JSONException -> L32
            L31:
                return
            L32:
                java.lang.String r7 = "CheckLoginListener response data format error"
                com.tencent.open.log.SLog.e(r1, r7)
                return
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onError(com.tencent.tauth.UiError r2) {
                r1 = this;
                com.tencent.tauth.IUiListener r0 = r1.a
                if (r0 == 0) goto L7
                r0.onError(r2)
            L7:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class b extends com.tencent.tauth.DefaultUiListener {
        java.lang.ref.WeakReference<com.tencent.tauth.IUiListener> a;
        final /* synthetic */ com.tencent.connect.auth.AuthAgent b;
        private final java.lang.String c;
        private final java.lang.String d;
        private final java.lang.String e;




        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private abstract class a implements android.view.View.OnClickListener {
            android.app.Dialog d;
            final /* synthetic */ com.tencent.connect.auth.AuthAgent.b e;

            a(com.tencent.connect.auth.AuthAgent.b r1, android.app.Dialog r2) {
                    r0 = this;
                    r0.e = r1
                    r0.<init>()
                    r0.d = r2
                    return
            }
        }

        public b(com.tencent.connect.auth.AuthAgent r1, com.tencent.tauth.IUiListener r2) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                java.lang.String r1 = "sendinstall"
                r0.c = r1
                java.lang.String r1 = "installwording"
                r0.d = r1
                java.lang.String r1 = "https://appsupport.qq.com/cgi-bin/qzapps/mapp_addapp.cgi"
                r0.e = r1
                java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
                r1.<init>(r2)
                r0.a = r1
                return
        }

        private android.graphics.drawable.Drawable a(java.lang.String r4, android.content.Context r5) {
                r3 = this;
                android.content.Context r5 = r5.getApplicationContext()
                android.content.Context r5 = com.stub.StubApp.getOrigApplicationContext(r5)
                android.content.res.AssetManager r5 = r5.getAssets()
                r0 = 0
                java.io.InputStream r5 = r5.open(r4)     // Catch: java.io.IOException -> L3f
                if (r5 != 0) goto L14
                return r0
            L14:
                java.lang.String r1 = ".9.png"
                boolean r1 = r4.endsWith(r1)     // Catch: java.io.IOException -> L3f
                if (r1 == 0) goto L38
                android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r5)     // Catch: java.lang.OutOfMemoryError -> L21 java.io.IOException -> L3f
                goto L23
            L21:
                r4 = r0
            L23:
                if (r4 == 0) goto L37
                byte[] r5 = r4.getNinePatchChunk()     // Catch: java.io.IOException -> L3f
                android.graphics.NinePatch.isNinePatchChunk(r5)     // Catch: java.io.IOException -> L3f
                android.graphics.drawable.NinePatchDrawable r1 = new android.graphics.drawable.NinePatchDrawable     // Catch: java.io.IOException -> L3f
                android.graphics.Rect r2 = new android.graphics.Rect     // Catch: java.io.IOException -> L3f
                r2.<init>()     // Catch: java.io.IOException -> L3f
                r1.<init>(r4, r5, r2, r0)     // Catch: java.io.IOException -> L3f
                goto L40
            L37:
                return r0
            L38:
                android.graphics.drawable.Drawable r0 = android.graphics.drawable.Drawable.createFromStream(r5, r4)     // Catch: java.io.IOException -> L3f
                r5.close()     // Catch: java.io.IOException -> L3f
            L3f:
                r1 = r0
            L40:
                return r1
        }

        private android.view.View a(android.content.Context r17, android.graphics.drawable.Drawable r18, java.lang.String r19, android.view.View.OnClickListener r20, android.view.View.OnClickListener r21) {
                r16 = this;
                r0 = r16
                r1 = r17
                android.util.DisplayMetrics r2 = new android.util.DisplayMetrics
                r2.<init>()
                java.lang.String r3 = "window"
                java.lang.Object r3 = r1.getSystemService(r3)
                android.view.WindowManager r3 = (android.view.WindowManager) r3
                android.view.Display r3 = r3.getDefaultDisplay()
                r3.getMetrics(r2)
                float r2 = r2.density
                android.widget.RelativeLayout r3 = new android.widget.RelativeLayout
                r3.<init>(r1)
                android.widget.ImageView r4 = new android.widget.ImageView
                r4.<init>(r1)
                r5 = r18
                r4.setImageDrawable(r5)
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.FIT_XY
                r4.setScaleType(r5)
                r5 = 1
                r4.setId(r5)
                r6 = 1114636288(0x42700000, float:60.0)
                float r6 = r6 * r2
                int r6 = (int) r6
                r7 = 1096810496(0x41600000, float:14.0)
                float r8 = r2 * r7
                int r8 = (int) r8
                r9 = 1099956224(0x41900000, float:18.0)
                float r9 = r9 * r2
                int r9 = (int) r9
                r10 = 1086324736(0x40c00000, float:6.0)
                float r10 = r10 * r2
                int r10 = (int) r10
                android.widget.RelativeLayout$LayoutParams r11 = new android.widget.RelativeLayout$LayoutParams
                r11.<init>(r6, r6)
                r6 = 9
                r11.addRule(r6)
                r6 = 0
                r11.setMargins(r6, r9, r10, r9)
                r3.addView(r4, r11)
                android.widget.TextView r4 = new android.widget.TextView
                r4.<init>(r1)
                r9 = r19
                r4.setText(r9)
                r4.setTextSize(r7)
                r7 = 3
                r4.setGravity(r7)
                r4.setIncludeFontPadding(r6)
                r4.setPadding(r6, r6, r6, r6)
                r9 = 2
                r4.setLines(r9)
                r10 = 5
                r4.setId(r10)
                r11 = 1127809024(0x43390000, float:185.0)
                float r11 = r11 * r2
                int r11 = (int) r11
                r4.setMinWidth(r11)
                android.widget.RelativeLayout$LayoutParams r11 = new android.widget.RelativeLayout$LayoutParams
                r12 = -2
                r11.<init>(r12, r12)
                r11.addRule(r5, r5)
                r13 = 6
                r11.addRule(r13, r5)
                r13 = 1084227584(0x40a00000, float:5.0)
                float r13 = r13 * r2
                int r14 = (int) r13
                r11.setMargins(r6, r6, r14, r6)
                r3.addView(r4, r11)
                android.view.View r4 = new android.view.View
                r4.<init>(r1)
                r11 = 214(0xd6, float:3.0E-43)
                int r11 = android.graphics.Color.rgb(r11, r11, r11)
                r4.setBackgroundColor(r11)
                r4.setId(r7)
                android.widget.RelativeLayout$LayoutParams r11 = new android.widget.RelativeLayout$LayoutParams
                r11.<init>(r12, r9)
                r11.addRule(r7, r5)
                r11.addRule(r10, r5)
                r9 = 7
                r11.addRule(r9, r10)
                r14 = 1094713344(0x41400000, float:12.0)
                float r14 = r14 * r2
                int r14 = (int) r14
                r11.setMargins(r6, r6, r6, r14)
                r3.addView(r4, r11)
                android.widget.LinearLayout r4 = new android.widget.LinearLayout
                r4.<init>(r1)
                android.widget.RelativeLayout$LayoutParams r11 = new android.widget.RelativeLayout$LayoutParams
                r11.<init>(r12, r12)
                r11.addRule(r10, r5)
                r11.addRule(r9, r10)
                r11.addRule(r7, r7)
                android.widget.Button r5 = new android.widget.Button
                r5.<init>(r1)
                java.lang.String r7 = "跳过"
                r5.setText(r7)
                java.lang.String r7 = "buttonNegt.png"
                android.graphics.drawable.Drawable r7 = r0.a(r7, r1)
                r5.setBackgroundDrawable(r7)
                r7 = 97
                r9 = 131(0x83, float:1.84E-43)
                r10 = 36
                int r7 = android.graphics.Color.rgb(r10, r7, r9)
                r5.setTextColor(r7)
                r7 = 1101004800(0x41a00000, float:20.0)
                r5.setTextSize(r7)
                r9 = r21
                r5.setOnClickListener(r9)
                r9 = 4
                r5.setId(r9)
                android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
                r10 = 1110704128(0x42340000, float:45.0)
                float r10 = r10 * r2
                int r10 = (int) r10
                r9.<init>(r6, r10)
                r9.rightMargin = r8
                r12 = 1082130432(0x40800000, float:4.0)
                float r12 = r12 * r2
                int r12 = (int) r12
                r9.leftMargin = r12
                r15 = 1065353216(0x3f800000, float:1.0)
                r9.weight = r15
                r4.addView(r5, r9)
                android.widget.Button r5 = new android.widget.Button
                r5.<init>(r1)
                java.lang.String r9 = "确定"
                r5.setText(r9)
                r5.setTextSize(r7)
                r7 = 255(0xff, float:3.57E-43)
                int r7 = android.graphics.Color.rgb(r7, r7, r7)
                r5.setTextColor(r7)
                java.lang.String r7 = "buttonPost.png"
                android.graphics.drawable.Drawable r1 = r0.a(r7, r1)
                r5.setBackgroundDrawable(r1)
                r1 = r20
                r5.setOnClickListener(r1)
                android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
                r1.<init>(r6, r10)
                r1.weight = r15
                r1.rightMargin = r12
                r4.addView(r5, r1)
                r3.addView(r4, r11)
                r1 = 1133215744(0x438b8000, float:279.0)
                float r1 = r1 * r2
                int r1 = (int) r1
                r4 = 1126367232(0x43230000, float:163.0)
                float r2 = r2 * r4
                int r2 = (int) r2
                android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
                r4.<init>(r1, r2)
                r3.setPadding(r8, r6, r14, r14)
                r3.setLayoutParams(r4)
                r1 = 247(0xf7, float:3.46E-43)
                r2 = 251(0xfb, float:3.52E-43)
                int r4 = android.graphics.Color.rgb(r1, r2, r1)
                r3.setBackgroundColor(r4)
                android.graphics.drawable.PaintDrawable r4 = new android.graphics.drawable.PaintDrawable
                int r1 = android.graphics.Color.rgb(r1, r2, r1)
                r4.<init>(r1)
                r4.setCornerRadius(r13)
                r3.setBackgroundDrawable(r4)
                return r3
        }

        private void a(java.lang.String r10, com.tencent.tauth.IUiListener r11, java.lang.Object r12) {
                r9 = this;
                com.tencent.connect.auth.AuthAgent r0 = r9.b
                java.lang.ref.WeakReference r0 = com.tencent.connect.auth.AuthAgent.e(r0)
                java.lang.String r1 = "openSDK_LOG.AuthAgent"
                if (r0 != 0) goto L10
                java.lang.String r10 = "showFeedConfrimDialog mActivity null and return"
                com.tencent.open.log.SLog.i(r1, r10)
                return
            L10:
                com.tencent.connect.auth.AuthAgent r0 = r9.b
                java.lang.ref.WeakReference r0 = com.tencent.connect.auth.AuthAgent.e(r0)
                java.lang.Object r0 = r0.get()
                r3 = r0
                android.app.Activity r3 = (android.app.Activity) r3
                if (r3 != 0) goto L25
                java.lang.String r10 = "showFeedConfrimDialog mActivity.get() null and return"
                com.tencent.open.log.SLog.i(r1, r10)
                return
            L25:
                android.app.Dialog r8 = new android.app.Dialog
                r8.<init>(r3)
                r0 = 1
                r8.requestWindowFeature(r0)
                android.content.pm.PackageManager r2 = r3.getPackageManager()
                r4 = 0
                r5 = 0
                java.lang.String r0 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
                android.content.pm.PackageInfo r0 = r2.getPackageInfo(r0, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
                goto L5b
            L3d:
                r0 = move-exception
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "showFeedConfrimDialog exception:"
                r6.append(r7)
                java.lang.StackTraceElement[] r0 = r0.getStackTrace()
                java.lang.String r0 = r0.toString()
                r6.append(r0)
                java.lang.String r0 = r6.toString()
                com.tencent.open.log.SLog.e(r1, r0)
                r0 = r5
            L5b:
                if (r0 == 0) goto L63
                android.content.pm.ApplicationInfo r0 = r0.applicationInfo
                android.graphics.drawable.Drawable r5 = r0.loadIcon(r2)
            L63:
                com.tencent.connect.auth.AuthAgent$b$1 r6 = new com.tencent.connect.auth.AuthAgent$b$1
                r6.<init>(r9, r8, r11, r12)
                com.tencent.connect.auth.AuthAgent$b$2 r7 = new com.tencent.connect.auth.AuthAgent$b$2
                r7.<init>(r9, r8, r11, r12)
                android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
                r0.<init>()
                r0.setAlpha(r4)
                android.view.Window r1 = r8.getWindow()
                r1.setBackgroundDrawable(r0)
                r2 = r9
                r4 = r5
                r5 = r10
                android.view.View r10 = r2.a(r3, r4, r5, r6, r7)
                r8.setContentView(r10)
                com.tencent.connect.auth.AuthAgent$b$3 r10 = new com.tencent.connect.auth.AuthAgent$b$3
                r10.<init>(r9, r11, r12)
                r8.setOnCancelListener(r10)
                boolean r10 = r3.isFinishing()
                if (r10 != 0) goto L97
                r8.show()
            L97:
                return
        }

        protected void a() {
                r7 = this;
                com.tencent.connect.auth.AuthAgent r0 = r7.b
                android.os.Bundle r4 = com.tencent.connect.auth.AuthAgent.j(r0)
                com.tencent.connect.auth.AuthAgent r0 = r7.b
                java.lang.ref.WeakReference r0 = com.tencent.connect.auth.AuthAgent.e(r0)
                if (r0 != 0) goto Lf
                goto L2c
            Lf:
                com.tencent.connect.auth.AuthAgent r0 = r7.b
                java.lang.ref.WeakReference r0 = com.tencent.connect.auth.AuthAgent.e(r0)
                java.lang.Object r0 = r0.get()
                r2 = r0
                android.app.Activity r2 = (android.app.Activity) r2
                if (r2 == 0) goto L2c
                com.tencent.connect.auth.AuthAgent r0 = r7.b
                com.tencent.connect.auth.QQToken r1 = com.tencent.connect.auth.AuthAgent.k(r0)
                java.lang.String r5 = "POST"
                r6 = 0
                java.lang.String r3 = "https://appsupport.qq.com/cgi-bin/qzapps/mapp_addapp.cgi"
                com.tencent.open.utils.HttpUtils.requestAsync(r1, r2, r3, r4, r5, r6)
            L2c:
                return
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onCancel() {
                r1 = this;
                java.lang.ref.WeakReference<com.tencent.tauth.IUiListener> r0 = r1.a
                java.lang.Object r0 = r0.get()
                if (r0 == 0) goto L13
                java.lang.ref.WeakReference<com.tencent.tauth.IUiListener> r0 = r1.a
                java.lang.Object r0 = r0.get()
                com.tencent.tauth.IUiListener r0 = (com.tencent.tauth.IUiListener) r0
                r0.onCancel()
            L13:
                return
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onComplete(java.lang.Object r8) {
                r7 = this;
                java.lang.String r0 = "openSDK_LOG.AuthAgent"
                if (r8 == 0) goto La3
                r1 = r8
                org.json.JSONObject r1 = (org.json.JSONObject) r1
                r2 = 0
                java.lang.String r3 = "sendinstall"
                int r3 = r1.getInt(r3)     // Catch: org.json.JSONException -> L1a
                r4 = 1
                if (r3 != r4) goto L12
                goto L13
            L12:
                r4 = 0
            L13:
                java.lang.String r3 = "installwording"
                java.lang.String r3 = r1.getString(r3)     // Catch: org.json.JSONException -> L1b
                goto L22
            L1a:
                r4 = 0
            L1b:
                java.lang.String r3 = "FeedConfirmListener onComplete There is no value for sendinstall."
                com.tencent.open.log.SLog.w(r0, r3)
                java.lang.String r3 = ""
            L22:
                java.lang.String r3 = java.net.URLDecoder.decode(r3)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = " WORDING = "
                r5.append(r6)
                r5.append(r3)
                java.lang.String r6 = "xx,showConfirmDialog="
                r5.append(r6)
                r5.append(r4)
                java.lang.String r5 = r5.toString()
                com.tencent.open.log.SLog.i(r0, r5)
                if (r4 == 0) goto L5b
                boolean r4 = android.text.TextUtils.isEmpty(r3)
                if (r4 != 0) goto L5b
                java.lang.ref.WeakReference<com.tencent.tauth.IUiListener> r1 = r7.a
                java.lang.Object r1 = r1.get()
                com.tencent.tauth.IUiListener r1 = (com.tencent.tauth.IUiListener) r1
                r7.a(r3, r1, r8)
                java.lang.String r8 = " WORDING is not empty and return"
                com.tencent.open.log.SLog.i(r0, r8)
                return
            L5b:
                java.lang.ref.WeakReference<com.tencent.tauth.IUiListener> r3 = r7.a
                java.lang.Object r3 = r3.get()
                com.tencent.tauth.IUiListener r3 = (com.tencent.tauth.IUiListener) r3
                if (r3 == 0) goto L9e
                com.tencent.connect.auth.AuthAgent r4 = r7.b
                com.tencent.connect.auth.QQToken r4 = com.tencent.connect.auth.AuthAgent.h(r4)
                if (r4 == 0) goto L8b
                com.tencent.connect.auth.AuthAgent r2 = r7.b
                com.tencent.connect.auth.QQToken r2 = com.tencent.connect.auth.AuthAgent.i(r2)
                boolean r2 = r2.saveSession(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = " saveSession saveSuccess="
                r1.append(r4)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.open.log.SLog.i(r0, r1)
            L8b:
                if (r2 == 0) goto L91
                r3.onComplete(r8)
                goto La3
            L91:
                com.tencent.tauth.UiError r8 = new com.tencent.tauth.UiError
                java.lang.String r0 = "持久化失败!"
                r1 = 0
                r2 = -6
                r8.<init>(r2, r0, r1)
                r3.onError(r8)
                goto La3
            L9e:
                java.lang.String r8 = " userListener is null"
                com.tencent.open.log.SLog.i(r0, r8)
            La3:
                return
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onError(com.tencent.tauth.UiError r2) {
                r1 = this;
                java.lang.ref.WeakReference<com.tencent.tauth.IUiListener> r0 = r1.a
                java.lang.Object r0 = r0.get()
                if (r0 == 0) goto L13
                java.lang.ref.WeakReference<com.tencent.tauth.IUiListener> r0 = r1.a
                java.lang.Object r0 = r0.get()
                com.tencent.tauth.IUiListener r0 = (com.tencent.tauth.IUiListener) r0
                r0.onError(r2)
            L13:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class c extends com.tencent.tauth.DefaultUiListener {
        final /* synthetic */ com.tencent.connect.auth.AuthAgent a;
        private final com.tencent.tauth.IUiListener b;
        private final boolean c;
        private final android.content.Context d;

        public c(com.tencent.connect.auth.AuthAgent r1, android.content.Context r2, com.tencent.tauth.IUiListener r3, boolean r4, boolean r5) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                r0.d = r2
                r0.b = r3
                r0.c = r4
                java.lang.String r1 = "openSDK_LOG.AuthAgent"
                java.lang.String r2 = "OpenUi, TokenListener()"
                com.tencent.open.log.SLog.d(r1, r2)
                return
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onCancel() {
                r2 = this;
                java.lang.String r0 = "openSDK_LOG.AuthAgent"
                java.lang.String r1 = "OpenUi, TokenListener() onCancel"
                com.tencent.open.log.SLog.d(r0, r1)
                com.tencent.tauth.IUiListener r0 = r2.b
                r0.onCancel()
                com.tencent.open.log.SLog.release()
                return
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onComplete(java.lang.Object r8) {
                r7 = this;
                java.lang.String r0 = "OpenUi, TokenListener() onComplete error"
                java.lang.String r1 = "pf"
                java.lang.String r2 = "OpenUi, TokenListener() onComplete"
                java.lang.String r3 = "openSDK_LOG.AuthAgent"
                com.tencent.open.log.SLog.d(r3, r2)
                org.json.JSONObject r8 = (org.json.JSONObject) r8
                java.lang.String r2 = "access_token"
                java.lang.String r2 = r8.getString(r2)     // Catch: org.json.JSONException -> L49
                java.lang.String r4 = "expires_in"
                java.lang.String r4 = r8.getString(r4)     // Catch: org.json.JSONException -> L49
                java.lang.String r5 = "openid"
                java.lang.String r5 = r8.getString(r5)     // Catch: org.json.JSONException -> L49
                if (r2 == 0) goto L4b
                com.tencent.connect.auth.AuthAgent r6 = r7.a     // Catch: org.json.JSONException -> L49
                com.tencent.connect.auth.QQToken r6 = com.tencent.connect.auth.AuthAgent.a(r6)     // Catch: org.json.JSONException -> L49
                if (r6 == 0) goto L4b
                if (r5 == 0) goto L4b
                com.tencent.connect.auth.AuthAgent r6 = r7.a     // Catch: org.json.JSONException -> L49
                com.tencent.connect.auth.QQToken r6 = com.tencent.connect.auth.AuthAgent.b(r6)     // Catch: org.json.JSONException -> L49
                r6.setAccessToken(r2, r4)     // Catch: org.json.JSONException -> L49
                com.tencent.connect.auth.AuthAgent r2 = r7.a     // Catch: org.json.JSONException -> L49
                com.tencent.connect.auth.QQToken r2 = com.tencent.connect.auth.AuthAgent.c(r2)     // Catch: org.json.JSONException -> L49
                r2.setOpenId(r5)     // Catch: org.json.JSONException -> L49
                android.content.Context r2 = r7.d     // Catch: org.json.JSONException -> L49
                com.tencent.connect.auth.AuthAgent r4 = r7.a     // Catch: org.json.JSONException -> L49
                com.tencent.connect.auth.QQToken r4 = com.tencent.connect.auth.AuthAgent.d(r4)     // Catch: org.json.JSONException -> L49
                com.tencent.connect.a.a.d(r2, r4)     // Catch: org.json.JSONException -> L49
                goto L4b
            L49:
                r1 = move-exception
                goto L76
            L4b:
                java.lang.String r2 = r8.getString(r1)     // Catch: org.json.JSONException -> L49
                if (r2 == 0) goto L6a
                android.content.Context r4 = r7.d     // Catch: java.lang.Exception -> L66
                java.lang.String r5 = "pfStore"
                r6 = 0
                android.content.SharedPreferences r4 = r4.getSharedPreferences(r5, r6)     // Catch: java.lang.Exception -> L66
                android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch: java.lang.Exception -> L66
                android.content.SharedPreferences$Editor r1 = r4.putString(r1, r2)     // Catch: java.lang.Exception -> L66
                r1.commit()     // Catch: java.lang.Exception -> L66
                goto L6a
            L66:
                r1 = move-exception
                com.tencent.open.log.SLog.e(r3, r0, r1)     // Catch: org.json.JSONException -> L49
            L6a:
                boolean r1 = r7.c     // Catch: org.json.JSONException -> L49
                if (r1 == 0) goto L79
                android.webkit.CookieSyncManager r1 = android.webkit.CookieSyncManager.getInstance()     // Catch: org.json.JSONException -> L49
                r1.sync()     // Catch: org.json.JSONException -> L49
                goto L79
            L76:
                com.tencent.open.log.SLog.e(r3, r0, r1)
            L79:
                com.tencent.tauth.IUiListener r0 = r7.b
                r0.onComplete(r8)
                com.tencent.connect.auth.AuthAgent r8 = r7.a
                r8.releaseResource()
                com.tencent.open.log.SLog.release()
                return
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onError(com.tencent.tauth.UiError r3) {
                r2 = this;
                java.lang.String r0 = "openSDK_LOG.AuthAgent"
                java.lang.String r1 = "OpenUi, TokenListener() onError"
                com.tencent.open.log.SLog.d(r0, r1)
                com.tencent.tauth.IUiListener r0 = r2.b
                r0.onError(r3)
                com.tencent.open.log.SLog.release()
                return
        }
    }

    static {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.tencent.connect.auth.AuthAgent.SECURE_LIB_FILE_NAME
            r0.append(r1)
            java.lang.String r1 = ".so"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.connect.auth.AuthAgent.SECURE_LIB_NAME = r0
            java.lang.String r0 = android.os.Build.CPU_ABI
            java.lang.String r2 = "is arm(default) architecture"
            java.lang.String r3 = "libwbsafeedit"
            java.lang.String r4 = "openSDK_LOG.AuthAgent"
            if (r0 == 0) goto Laf
            java.lang.String r5 = ""
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto Laf
            java.lang.String r5 = "arm64-v8a"
            boolean r5 = r0.equalsIgnoreCase(r5)
            if (r5 == 0) goto L4c
            java.lang.String r0 = "libwbsafeedit_64"
            com.tencent.connect.auth.AuthAgent.SECURE_LIB_FILE_NAME = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = com.tencent.connect.auth.AuthAgent.SECURE_LIB_FILE_NAME
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.connect.auth.AuthAgent.SECURE_LIB_NAME = r0
            java.lang.String r0 = "is arm64-v8a architecture"
            com.tencent.open.log.SLog.i(r4, r0)
            return
        L4c:
            java.lang.String r5 = "x86"
            boolean r5 = r0.equalsIgnoreCase(r5)
            if (r5 == 0) goto L71
            java.lang.String r0 = "libwbsafeedit_x86"
            com.tencent.connect.auth.AuthAgent.SECURE_LIB_FILE_NAME = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = com.tencent.connect.auth.AuthAgent.SECURE_LIB_FILE_NAME
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.connect.auth.AuthAgent.SECURE_LIB_NAME = r0
            java.lang.String r0 = "is x86 architecture"
            com.tencent.open.log.SLog.i(r4, r0)
            return
        L71:
            java.lang.String r5 = "x86_64"
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 == 0) goto L96
            java.lang.String r0 = "libwbsafeedit_x86_64"
            com.tencent.connect.auth.AuthAgent.SECURE_LIB_FILE_NAME = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = com.tencent.connect.auth.AuthAgent.SECURE_LIB_FILE_NAME
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.connect.auth.AuthAgent.SECURE_LIB_NAME = r0
            java.lang.String r0 = "is x86_64 architecture"
            com.tencent.open.log.SLog.i(r4, r0)
            return
        L96:
            com.tencent.connect.auth.AuthAgent.SECURE_LIB_FILE_NAME = r3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = com.tencent.connect.auth.AuthAgent.SECURE_LIB_FILE_NAME
            r0.append(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.connect.auth.AuthAgent.SECURE_LIB_NAME = r0
            com.tencent.open.log.SLog.i(r4, r2)
            return
        Laf:
            com.tencent.connect.auth.AuthAgent.SECURE_LIB_FILE_NAME = r3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = com.tencent.connect.auth.AuthAgent.SECURE_LIB_FILE_NAME
            r0.append(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.connect.auth.AuthAgent.SECURE_LIB_NAME = r0
            com.tencent.open.log.SLog.i(r4, r2)
            return
    }

    public AuthAgent(com.tencent.connect.auth.QQToken r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private int a(boolean r7, com.tencent.tauth.IUiListener r8, boolean r9, java.util.Map<java.lang.String, java.lang.Object> r10) {
            r6 = this;
            android.content.Context r0 = com.tencent.open.utils.g.a()
            android.webkit.CookieSyncManager.createInstance(r0)
            android.os.Bundle r0 = r6.a()
            java.lang.String r1 = "1"
            if (r7 == 0) goto L14
            java.lang.String r7 = "isadd"
            r0.putString(r7, r1)
        L14:
            java.lang.String r7 = "scope"
            java.lang.String r2 = r6.d
            r0.putString(r7, r2)
            com.tencent.connect.auth.QQToken r7 = r6.c
            java.lang.String r7 = r7.getAppId()
            java.lang.String r2 = "client_id"
            r0.putString(r2, r7)
            boolean r7 = com.tencent.connect.common.BaseApi.isOEM
            java.lang.String r2 = "pf"
            if (r7 == 0) goto L5d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r3 = "desktop_m_qq-"
            r7.append(r3)
            java.lang.String r3 = com.tencent.connect.common.BaseApi.installChannel
            r7.append(r3)
            java.lang.String r3 = "-"
            r7.append(r3)
            java.lang.String r4 = "android"
            r7.append(r4)
            r7.append(r3)
            java.lang.String r4 = com.tencent.connect.common.BaseApi.registerChannel
            r7.append(r4)
            r7.append(r3)
            java.lang.String r3 = com.tencent.connect.common.BaseApi.businessId
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            r0.putString(r2, r7)
            goto L62
        L5d:
            java.lang.String r7 = "openmobile_android"
            r0.putString(r2, r7)
        L62:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            long r2 = java.lang.System.currentTimeMillis()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            r7.append(r2)
            java.lang.String r2 = ""
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            android.content.Context r2 = com.tencent.open.utils.g.a()
            java.lang.String r2 = com.tencent.open.utils.k.b(r2, r7)
            java.lang.String r3 = "sign"
            r0.putString(r3, r2)
            java.lang.String r2 = "time"
            r0.putString(r2, r7)
            java.lang.String r7 = "display"
            java.lang.String r2 = "mobile"
            r0.putString(r7, r2)
            java.lang.String r7 = "response_type"
            java.lang.String r2 = "token"
            r0.putString(r7, r2)
            java.lang.String r7 = "redirect_uri"
            java.lang.String r2 = "auth://tauth.qq.com/"
            r0.putString(r7, r2)
            java.lang.String r7 = "cancel_display"
            r0.putString(r7, r1)
            java.lang.String r7 = "switch"
            r0.putString(r7, r1)
            java.lang.String r7 = "compat_v"
            r0.putString(r7, r1)
            if (r9 == 0) goto Lb9
            java.lang.String r7 = "style"
            java.lang.String r9 = "qr"
            r0.putString(r7, r9)
        Lb9:
            boolean r7 = r6.a(r10)
            java.lang.String r9 = "show_download_ui"
            java.lang.String r10 = java.lang.Boolean.toString(r7)
            r0.putString(r9, r10)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "OpenUi, showDialog -- start, isShowDownloadUi="
            r9.append(r10)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            java.lang.String r9 = "openSDK_LOG.AuthAgent"
            com.tencent.open.log.SLog.i(r9, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            com.tencent.open.utils.j r10 = com.tencent.open.utils.j.a()
            android.content.Context r1 = com.tencent.open.utils.g.a()
            java.lang.String r2 = "https://openmobile.qq.com/oauth2.0/m_authorize?"
            java.lang.String r10 = r10.a(r1, r2)
            r7.append(r10)
            java.lang.String r10 = com.tencent.open.utils.HttpUtils.encodeUrl(r0)
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            com.tencent.connect.auth.AuthAgent$c r0 = new com.tencent.connect.auth.AuthAgent$c
            android.content.Context r2 = com.tencent.open.utils.g.a()
            r4 = 1
            r5 = 0
            r1 = r6
            r3 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.String r8 = "OpenUi, showDialog TDialog"
            com.tencent.open.log.SLog.d(r9, r8)
            com.tencent.connect.auth.AuthAgent$1 r8 = new com.tencent.connect.auth.AuthAgent$1
            r8.<init>(r6, r7, r0)
            com.tencent.open.utils.l.b(r8)
            java.lang.String r7 = "OpenUi, showDialog -- end"
            com.tencent.open.log.SLog.i(r9, r7)
            r7 = 2
            return r7
    }

    static /* synthetic */ com.tencent.connect.auth.QQToken a(com.tencent.connect.auth.AuthAgent r0) {
            com.tencent.connect.auth.QQToken r0 = r0.c
            return r0
    }

    private java.lang.String a(android.os.Bundle r9) {
            r8 = this;
            java.lang.String r0 = "status_os"
            java.lang.String r0 = r9.getString(r0)
            java.lang.String r1 = "status_machine"
            java.lang.String r1 = r9.getString(r1)
            java.lang.String r2 = "status_version"
            java.lang.String r2 = r9.getString(r2)
            java.lang.String r3 = "sdkv"
            java.lang.String r3 = r9.getString(r3)
            java.lang.String r4 = "client_id"
            java.lang.String r4 = r9.getString(r4)
            java.lang.String r5 = "need_pay"
            java.lang.String r5 = r9.getString(r5)
            java.lang.String r6 = "pf"
            java.lang.String r9 = r9.getString(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "os="
            r6.append(r7)
            r6.append(r0)
            java.lang.String r7 = ", machine="
            r6.append(r7)
            r6.append(r1)
            java.lang.String r7 = ", version="
            r6.append(r7)
            r6.append(r2)
            java.lang.String r7 = ", sdkv="
            r6.append(r7)
            r6.append(r3)
            java.lang.String r7 = ", appId="
            r6.append(r7)
            r6.append(r4)
            java.lang.String r7 = ", needPay="
            r6.append(r7)
            r6.append(r5)
            java.lang.String r7 = ", pf="
            r6.append(r7)
            r6.append(r9)
            java.lang.String r7 = "openSDK_LOG.AuthAgent"
            java.lang.String r6 = r6.toString()
            com.tencent.open.log.SLog.d(r7, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = ""
            if (r0 != 0) goto L7a
            r0 = r7
        L7a:
            r6.append(r0)
            if (r1 != 0) goto L80
            r1 = r7
        L80:
            r6.append(r1)
            if (r2 != 0) goto L86
            r2 = r7
        L86:
            r6.append(r2)
            if (r3 != 0) goto L8c
            r3 = r7
        L8c:
            r6.append(r3)
            if (r4 != 0) goto L92
            r4 = r7
        L92:
            r6.append(r4)
            if (r5 != 0) goto L98
            r5 = r7
        L98:
            r6.append(r5)
            if (r9 != 0) goto L9e
            r9 = r7
        L9e:
            r6.append(r9)
            java.lang.String r9 = r6.toString()
            return r9
    }

    static /* synthetic */ java.lang.String a(com.tencent.connect.auth.AuthAgent r0, java.lang.String r1) {
            java.lang.String r0 = r0.a(r1)
            return r0
    }

    private void a(android.os.Bundle r1, java.util.Map<java.lang.String, java.lang.Object> r2) {
            r0 = this;
            return
    }

    private boolean a(android.app.Activity r18, androidx.fragment.app.Fragment r19, java.util.Map<java.lang.String, java.lang.Object> r20, boolean r21, java.lang.Object[] r22) {
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            r3 = r20
            java.lang.String r4 = "startActionActivity() -- start"
            java.lang.String r5 = "openSDK_LOG.AuthAgent"
            com.tencent.open.log.SLog.i(r5, r4)
            android.content.Intent r4 = r1.c()
            r6 = 0
            if (r4 == 0) goto L109
            android.os.Bundle r7 = r1.a()
            java.lang.String r8 = "1"
            if (r21 == 0) goto L23
            java.lang.String r9 = "isadd"
            r7.putString(r9, r8)
        L23:
            java.lang.String r9 = "scope"
            java.lang.String r10 = r1.d
            r7.putString(r9, r10)
            com.tencent.connect.auth.QQToken r9 = r1.c
            java.lang.String r9 = r9.getAppId()
            java.lang.String r10 = "client_id"
            r7.putString(r10, r9)
            boolean r9 = com.tencent.connect.common.BaseApi.isOEM
            java.lang.String r10 = "pf"
            if (r9 == 0) goto L6c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "desktop_m_qq-"
            r9.append(r11)
            java.lang.String r11 = com.tencent.connect.common.BaseApi.installChannel
            r9.append(r11)
            java.lang.String r11 = "-"
            r9.append(r11)
            java.lang.String r12 = "android"
            r9.append(r12)
            r9.append(r11)
            java.lang.String r12 = com.tencent.connect.common.BaseApi.registerChannel
            r9.append(r12)
            r9.append(r11)
            java.lang.String r11 = com.tencent.connect.common.BaseApi.businessId
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            r7.putString(r10, r9)
            goto L71
        L6c:
            java.lang.String r9 = "openmobile_android"
            r7.putString(r10, r9)
        L71:
            java.lang.String r9 = "need_pay"
            r7.putString(r9, r8)
            r1.a(r7, r3)
            android.content.Context r8 = com.tencent.open.utils.g.a()
            java.lang.String r8 = com.tencent.open.utils.k.a(r8)
            java.lang.String r9 = "oauth_app_name"
            r7.putString(r9, r8)
            java.lang.String r8 = "key_action"
            java.lang.String r9 = "action_login"
            r4.putExtra(r8, r9)
            java.lang.String r8 = "key_params"
            r4.putExtra(r8, r7)
            com.tencent.connect.auth.QQToken r8 = r1.c
            java.lang.String r8 = r8.getAppId()
            java.lang.String r9 = "appid"
            r4.putExtra(r9, r8)
            java.lang.String r8 = r1.a(r7)
            java.lang.String r8 = com.tencent.open.utils.k.a(r0, r8)
            java.lang.String r9 = "ppsts"
            r7.putString(r9, r8)
            com.tencent.connect.auth.AuthAgent$b r7 = new com.tencent.connect.auth.AuthAgent$b     // Catch: java.lang.Exception -> Lc9
            com.tencent.tauth.IUiListener r8 = r1.a     // Catch: java.lang.Exception -> Lc9
            r7.<init>(r1, r8)     // Catch: java.lang.Exception -> Lc9
            r1.a = r7     // Catch: java.lang.Exception -> Lc9
            com.tencent.connect.common.UIListenerManager r7 = com.tencent.connect.common.UIListenerManager.getInstance()     // Catch: java.lang.Exception -> Lc9
            com.tencent.tauth.IUiListener r8 = r1.a     // Catch: java.lang.Exception -> Lc9
            r9 = 11101(0x2b5d, float:1.5556E-41)
            r7.setListenerWithRequestcode(r9, r8)     // Catch: java.lang.Exception -> Lc9
            if (r2 == 0) goto Lcb
            java.lang.String r0 = "startAssitActivity fragment"
            com.tencent.open.log.SLog.d(r5, r0)     // Catch: java.lang.Exception -> Lc9
            r1.a(r2, r4, r9, r3)     // Catch: java.lang.Exception -> Lc9
            goto Ld3
        Lc9:
            r0 = move-exception
            goto L104
        Lcb:
            java.lang.String r2 = "startAssitActivity activity"
            com.tencent.open.log.SLog.d(r5, r2)     // Catch: java.lang.Exception -> Lc9
            r1.a(r0, r4, r9, r3)     // Catch: java.lang.Exception -> Lc9
        Ld3:
            java.lang.String r0 = "startActionActivity() -- end, found activity for loginIntent"
            com.tencent.open.log.SLog.i(r5, r0)     // Catch: java.lang.Exception -> Lc9
            com.tencent.open.b.e r7 = com.tencent.open.b.e.a()     // Catch: java.lang.Exception -> Lc9
            java.lang.String r9 = "LOGIN_CHECK_SDK"
            java.lang.String r10 = "1000"
            com.tencent.connect.auth.QQToken r0 = r1.c     // Catch: java.lang.Exception -> Lc9
            java.lang.String r11 = r0.getAppId()     // Catch: java.lang.Exception -> Lc9
            java.lang.String r12 = ""
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Exception -> Lc9
            java.lang.Long r13 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> Lc9
            java.lang.String r16 = ""
            r8 = 0
            r14 = 0
            r15 = 1
            r7.a(r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Exception -> Lc9
            java.lang.String r0 = "0"
            r22[r6] = r0     // Catch: java.lang.Exception -> Lc9
            r0 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> Lc9
            r22[r0] = r2     // Catch: java.lang.Exception -> Lc9
            return r0
        L104:
            java.lang.String r2 = "startActionActivity() exception"
            com.tencent.open.log.SLog.e(r5, r2, r0)
        L109:
            com.tencent.open.b.e r7 = com.tencent.open.b.e.a()
            com.tencent.connect.auth.QQToken r0 = r1.c
            java.lang.String r11 = r0.getAppId()
            long r2 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r13 = java.lang.Long.valueOf(r2)
            r15 = 1
            java.lang.String r16 = "startActionActivity fail"
            r8 = 1
            java.lang.String r9 = "LOGIN_CHECK_SDK"
            java.lang.String r10 = "1000"
            java.lang.String r12 = ""
            r14 = 0
            r7.a(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = "startActionActivity() -- end, no target activity for loginIntent"
            com.tencent.open.log.SLog.i(r5, r0)
            return r6
    }

    private boolean a(java.util.Map<java.lang.String, java.lang.Object> r3) {
            r2 = this;
            r0 = 1
            if (r3 == 0) goto L1b
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto La
            goto L1b
        La:
            java.lang.String r1 = com.tencent.connect.common.Constants.KEY_ENABLE_SHOW_DOWNLOAD_URL
            java.lang.Object r3 = r3.get(r1)
            boolean r1 = r3 instanceof java.lang.Boolean
            if (r1 == 0) goto L1b
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            return r3
        L1b:
            return r0
    }

    static /* synthetic */ com.tencent.connect.auth.QQToken b(com.tencent.connect.auth.AuthAgent r0) {
            com.tencent.connect.auth.QQToken r0 = r0.c
            return r0
    }

    static /* synthetic */ com.tencent.connect.auth.QQToken c(com.tencent.connect.auth.AuthAgent r0) {
            com.tencent.connect.auth.QQToken r0 = r0.c
            return r0
    }

    static /* synthetic */ com.tencent.connect.auth.QQToken d(com.tencent.connect.auth.AuthAgent r0) {
            com.tencent.connect.auth.QQToken r0 = r0.c
            return r0
    }

    static /* synthetic */ java.lang.ref.WeakReference e(com.tencent.connect.auth.AuthAgent r0) {
            java.lang.ref.WeakReference<android.app.Activity> r0 = r0.e
            return r0
    }

    static /* synthetic */ com.tencent.connect.auth.QQToken f(com.tencent.connect.auth.AuthAgent r0) {
            com.tencent.connect.auth.QQToken r0 = r0.c
            return r0
    }

    static /* synthetic */ com.tencent.connect.auth.QQToken g(com.tencent.connect.auth.AuthAgent r0) {
            com.tencent.connect.auth.QQToken r0 = r0.c
            return r0
    }

    static /* synthetic */ com.tencent.connect.auth.QQToken h(com.tencent.connect.auth.AuthAgent r0) {
            com.tencent.connect.auth.QQToken r0 = r0.c
            return r0
    }

    static /* synthetic */ com.tencent.connect.auth.QQToken i(com.tencent.connect.auth.AuthAgent r0) {
            com.tencent.connect.auth.QQToken r0 = r0.c
            return r0
    }

    static /* synthetic */ android.os.Bundle j(com.tencent.connect.auth.AuthAgent r0) {
            android.os.Bundle r0 = r0.b()
            return r0
    }

    static /* synthetic */ com.tencent.connect.auth.QQToken k(com.tencent.connect.auth.AuthAgent r0) {
            com.tencent.connect.auth.QQToken r0 = r0.c
            return r0
    }

    int a(android.app.Activity r9, java.lang.String r10, com.tencent.tauth.IUiListener r11, boolean r12, androidx.fragment.app.Fragment r13, boolean r14) {
            r8 = this;
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            int r9 = r0.doLogin(r1, r2, r3, r4, r5, r6, r7)
            return r9
    }

    protected void a(com.tencent.tauth.IUiListener r8) {
            r7 = this;
            java.lang.String r8 = "reportDAU() -- start"
            java.lang.String r0 = "openSDK_LOG.AuthAgent"
            com.tencent.open.log.SLog.i(r0, r8)
            com.tencent.connect.auth.QQToken r8 = r7.c
            java.lang.String r8 = r8.getAccessToken()
            com.tencent.connect.auth.QQToken r1 = r7.c
            java.lang.String r1 = r1.getOpenId()
            com.tencent.connect.auth.QQToken r2 = r7.c
            java.lang.String r2 = r2.getAppId()
            boolean r3 = android.text.TextUtils.isEmpty(r8)
            if (r3 != 0) goto L4c
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L4c
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L4c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "tencent&sdk&qazxc***14969%%"
            r3.append(r4)
            r3.append(r8)
            r3.append(r2)
            r3.append(r1)
            java.lang.String r8 = "qzone3.4"
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            java.lang.String r8 = com.tencent.open.utils.m.g(r8)
            goto L4e
        L4c:
            java.lang.String r8 = ""
        L4e:
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 == 0) goto L5a
            java.lang.String r8 = "reportDAU -- encrytoken is null"
            com.tencent.open.log.SLog.e(r0, r8)
            return
        L5a:
            android.os.Bundle r4 = r7.a()
            java.lang.String r1 = "encrytoken"
            r4.putString(r1, r8)
            com.tencent.connect.auth.QQToken r1 = r7.c
            android.content.Context r2 = com.tencent.open.utils.g.a()
            java.lang.String r5 = "POST"
            r6 = 0
            java.lang.String r3 = "https://openmobile.qq.com/user/user_login_statis"
            com.tencent.open.utils.HttpUtils.requestAsync(r1, r2, r3, r4, r5, r6)
            java.lang.String r8 = "reportDAU() -- end"
            com.tencent.open.log.SLog.i(r0, r8)
            return
    }

    protected void b(com.tencent.tauth.IUiListener r7) {
            r6 = this;
            android.os.Bundle r3 = r6.a()
            java.lang.String r0 = "reqType"
            java.lang.String r1 = "checkLogin"
            r3.putString(r0, r1)
            com.tencent.connect.common.BaseApi$TempRequestListener r5 = new com.tencent.connect.common.BaseApi$TempRequestListener
            com.tencent.connect.auth.AuthAgent$a r0 = new com.tencent.connect.auth.AuthAgent$a
            r0.<init>(r6, r7)
            r5.<init>(r6, r0)
            com.tencent.connect.auth.QQToken r0 = r6.c
            android.content.Context r1 = com.tencent.open.utils.g.a()
            java.lang.String r4 = "GET"
            java.lang.String r2 = "https://openmobile.qq.com/v3/user/get_info"
            com.tencent.open.utils.HttpUtils.requestAsync(r0, r1, r2, r3, r4, r5)
            return
    }

    public int doLogin(android.app.Activity r18, java.lang.String r19, com.tencent.tauth.IUiListener r20, boolean r21, androidx.fragment.app.Fragment r22, boolean r23, java.util.Map<java.lang.String, java.lang.Object> r24) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r20
            java.lang.String r6 = "openSDK_LOG.AuthAgent"
            boolean r3 = com.tencent.connect.a.a(r6, r2)
            if (r3 == 0) goto L10
            r1 = -1
            return r1
        L10:
            r3 = r19
            r0.d = r3
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r1)
            r0.e = r3
            r0.a = r2
            r2 = 2
            java.lang.Object[] r5 = new java.lang.Object[r2]
            android.content.Intent r2 = r1.getIntent()
            java.lang.String r3 = "KEY_FORCE_QR_LOGIN"
            r7 = 0
            boolean r2 = r2.getBooleanExtra(r3, r7)
            com.tencent.connect.auth.QQToken r3 = r0.c
            java.lang.String r3 = r3.getAppId()
            com.tencent.open.utils.i r3 = com.tencent.open.utils.i.a(r1, r3)
            java.lang.String r4 = "C_LoginWeb"
            boolean r3 = r3.b(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "doLogin needForceQrLogin="
            r4.append(r8)
            r4.append(r2)
            java.lang.String r8 = ", toWebLogin="
            r4.append(r8)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            com.tencent.open.log.SLog.i(r6, r4)
            if (r2 != 0) goto L98
            if (r3 != 0) goto L98
            r4 = r21
            r2 = r22
            r3 = r24
            boolean r1 = r0.a(r1, r2, r3, r4, r5)
            if (r1 == 0) goto L98
            java.lang.String r1 = "OpenUi, showUi, return Constants.UI_ACTIVITY"
            com.tencent.open.log.SLog.i(r6, r1)
            com.tencent.open.b.e r8 = com.tencent.open.b.e.a()
            com.tencent.connect.auth.QQToken r1 = r0.c
            java.lang.String r9 = r1.getOpenId()
            com.tencent.connect.auth.QQToken r1 = r0.c
            java.lang.String r10 = r1.getAppId()
            r1 = r5[r7]
            r14 = r1
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r15 = "0"
            java.lang.String r16 = "0"
            java.lang.String r11 = "2"
            java.lang.String r12 = "1"
            java.lang.String r13 = "5"
            r8.a(r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = 1
            r1 = r5[r1]
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            return r1
        L98:
            com.tencent.open.b.e r7 = com.tencent.open.b.e.a()
            com.tencent.connect.auth.QQToken r1 = r0.c
            java.lang.String r8 = r1.getOpenId()
            com.tencent.connect.auth.QQToken r1 = r0.c
            java.lang.String r9 = r1.getAppId()
            java.lang.String r14 = "0"
            java.lang.String r15 = "0"
            java.lang.String r10 = "2"
            java.lang.String r11 = "1"
            java.lang.String r12 = "5"
            java.lang.String r13 = "1"
            r7.a(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r1 = "doLogin startActivity fail show dialog."
            com.tencent.open.log.SLog.w(r6, r1)
            com.tencent.connect.auth.AuthAgent$b r1 = new com.tencent.connect.auth.AuthAgent$b
            com.tencent.tauth.IUiListener r2 = r0.a
            r1.<init>(r0, r2)
            r0.a = r1
            r4 = r21
            r2 = r23
            r3 = r24
            int r1 = r0.a(r4, r1, r2, r3)
            return r1
    }

    @Override // com.tencent.connect.common.BaseApi
    public void releaseResource() {
            r1 = this;
            r0 = 0
            r1.a = r0
            return
    }
}
