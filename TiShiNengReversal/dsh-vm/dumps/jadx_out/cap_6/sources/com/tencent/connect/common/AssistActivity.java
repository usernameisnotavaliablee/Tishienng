package com.tencent.connect.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class AssistActivity extends android.app.Activity {
    public static final java.lang.String EXTRA_INTENT = "openSDK_LOG.AssistActivity.ExtraIntent";
    protected boolean a;
    protected android.os.Handler b;
    private boolean c;
    private java.lang.String d;
    private com.tencent.connect.common.AssistActivity.QQStayReceiver e;
    private boolean f;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class QQStayReceiver extends android.content.BroadcastReceiver {
        final /* synthetic */ com.tencent.connect.common.AssistActivity a;

        private QQStayReceiver(com.tencent.connect.common.AssistActivity r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ QQStayReceiver(com.tencent.connect.common.AssistActivity r1, com.tencent.connect.common.AssistActivity.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r8, android.content.Intent r9) {
                r7 = this;
                java.lang.String r8 = "#"
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                java.lang.String r1 = "key_action"
                java.lang.String r2 = "action_share"
                r0.putExtra(r1, r2)
                java.lang.String r1 = "uriData"
                android.os.Parcelable r9 = r9.getParcelableExtra(r1)     // Catch: java.lang.Exception -> L4a
                android.net.Uri r9 = (android.net.Uri) r9     // Catch: java.lang.Exception -> L4a
                java.lang.String r1 = r9.toString()     // Catch: java.lang.Exception -> L4a
                boolean r2 = r1.contains(r8)     // Catch: java.lang.Exception -> L4a
                if (r2 == 0) goto L21
                goto L23
            L21:
                java.lang.String r8 = "?"
            L23:
                int r8 = r1.indexOf(r8)     // Catch: java.lang.Exception -> L4a
                r2 = 1
                int r8 = r8 + r2
                java.lang.String r8 = r1.substring(r8)     // Catch: java.lang.Exception -> L4a
                java.lang.String r1 = "&"
                java.lang.String[] r8 = r8.split(r1)     // Catch: java.lang.Exception -> L4a
                int r1 = r8.length     // Catch: java.lang.Exception -> L4a
                r3 = 0
                r4 = 0
            L36:
                if (r4 >= r1) goto L4c
                r5 = r8[r4]     // Catch: java.lang.Exception -> L4a
                java.lang.String r6 = "="
                java.lang.String[] r5 = r5.split(r6)     // Catch: java.lang.Exception -> L4a
                r6 = r5[r3]     // Catch: java.lang.Exception -> L4a
                r5 = r5[r2]     // Catch: java.lang.Exception -> L4a
                r0.putExtra(r6, r5)     // Catch: java.lang.Exception -> L4a
                int r4 = r4 + 1
                goto L36
            L4a:
                r8 = move-exception
                goto L50
            L4c:
                r0.setData(r9)     // Catch: java.lang.Exception -> L4a
                goto L78
            L50:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r1 = "QQStayReceiver parse uri error : "
                r9.append(r1)
                java.lang.String r8 = r8.getMessage()
                r9.append(r8)
                java.lang.String r8 = r9.toString()
                java.lang.String r9 = "openSDK_LOG.AssistActivity"
                com.tencent.open.log.SLog.i(r9, r8)
                java.lang.String r8 = "result"
                java.lang.String r9 = "error"
                r0.putExtra(r8, r9)
                java.lang.String r8 = "response"
                java.lang.String r9 = "parse error."
                r0.putExtra(r8, r9)
            L78:
                com.tencent.connect.common.AssistActivity r8 = r7.a
                r9 = -1
                r8.setResult(r9, r0)
                return
        }
    }

    static {
            r0 = 42376(0xa588, float:5.9381E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public AssistActivity() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.c = r0
            r1.a = r0
            com.tencent.connect.common.AssistActivity$1 r0 = new com.tencent.connect.common.AssistActivity$1
            r0.<init>(r1)
            r1.b = r0
            return
    }

    private void a(android.content.Intent r3, boolean r4) {
            r2 = this;
            if (r3 != 0) goto La
            java.lang.String r3 = "openSDK_LOG.AssistActivity"
            java.lang.String r4 = "reportStartActivitySuccess, but intent is null."
            com.tencent.open.log.SLog.d(r3, r4)
            return
        La:
            java.lang.String r0 = com.tencent.connect.common.Constants.KEY_PASS_REPORT_VIA_PARAM
            android.os.Bundle r0 = r3.getBundleExtra(r0)
            if (r0 == 0) goto L2c
            if (r4 == 0) goto L17
            java.lang.String r4 = "0"
            goto L19
        L17:
            java.lang.String r4 = "1"
        L19:
            com.tencent.open.utils.m.a(r0, r4)
            java.lang.String r4 = com.tencent.connect.common.Constants.KEY_PASS_REPORT_VIA_TIMELY
            r1 = 0
            boolean r3 = r3.getBooleanExtra(r4, r1)
            com.tencent.open.b.h r4 = com.tencent.open.b.h.a()
            java.lang.String r1 = r2.d
            r4.a(r0, r1, r3)
        L2c:
            return
    }

    private void a(android.os.Bundle r13) {
            r12 = this;
            java.lang.String r0 = "viaShareType"
            java.lang.String r8 = r13.getString(r0)
            java.lang.String r0 = "callbackAction"
            java.lang.String r0 = r13.getString(r0)
            java.lang.String r1 = "url"
            java.lang.String r1 = r13.getString(r1)
            java.lang.String r2 = "openId"
            java.lang.String r2 = r13.getString(r2)
            java.lang.String r3 = "appId"
            java.lang.String r3 = r13.getString(r3)
            java.lang.String r13 = "shareToQQ"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L2d
            java.lang.String r13 = "ANDROIDQQ.SHARETOQQ.XX"
            java.lang.String r4 = "10"
        L2a:
            r5 = r4
            r4 = r13
            goto L3e
        L2d:
            java.lang.String r13 = "shareToQzone"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L3a
            java.lang.String r13 = "ANDROIDQQ.SHARETOQZ.XX"
            java.lang.String r4 = "11"
            goto L2a
        L3a:
            java.lang.String r13 = ""
            r4 = r13
            r5 = r4
        L3e:
            boolean r13 = com.tencent.open.utils.m.a(r12, r1)
            if (r13 != 0) goto L6f
            com.tencent.connect.common.UIListenerManager r13 = com.tencent.connect.common.UIListenerManager.getInstance()
            com.tencent.tauth.IUiListener r13 = r13.getListnerWithAction(r0)
            if (r13 == 0) goto L5a
            com.tencent.tauth.UiError r0 = new com.tencent.tauth.UiError
            java.lang.String r1 = "打开浏览器失败!"
            r6 = 0
            r7 = -6
            r0.<init>(r7, r1, r6)
            r13.onError(r0)
        L5a:
            com.tencent.open.b.e r1 = com.tencent.open.b.e.a()
            java.lang.String r10 = "2"
            java.lang.String r11 = "0"
            java.lang.String r6 = "3"
            java.lang.String r7 = "1"
            java.lang.String r9 = "0"
            r1.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.finish()
            goto L80
        L6f:
            com.tencent.open.b.e r1 = com.tencent.open.b.e.a()
            java.lang.String r10 = "2"
            java.lang.String r11 = "0"
            java.lang.String r6 = "3"
            java.lang.String r7 = "0"
            java.lang.String r9 = "0"
            r1.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L80:
            android.content.Intent r13 = r12.getIntent()
            java.lang.String r0 = "shareH5"
            r13.removeExtra(r0)
            return
    }

    public static android.content.Intent getAssistActivityIntent(android.content.Context r2) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.tencent.connect.common.AssistActivity> r1 = com.tencent.connect.common.AssistActivity.class
            r0.<init>(r2, r1)
            return r0
    }

    @Override // android.app.Activity
    protected void onActivityResult(int r3, int r4, android.content.Intent r5) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "--onActivityResult--requestCode: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " | resultCode: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = "data = null ? "
            r0.append(r1)
            if (r5 != 0) goto L1e
            r1 = 1
            goto L1f
        L1e:
            r1 = 0
        L1f:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "openSDK_LOG.AssistActivity"
            com.tencent.open.log.SLog.i(r1, r0)
            super.onActivityResult(r3, r4, r5)
            if (r3 != 0) goto L31
            return
        L31:
            if (r5 == 0) goto L3a
            java.lang.String r4 = "key_action"
            java.lang.String r0 = "action_login"
            r5.putExtra(r4, r0)
        L3a:
            r2.setResultData(r3, r5)
            boolean r3 = r2.f
            if (r3 != 0) goto L4a
            java.lang.String r3 = "onActivityResult finish immediate"
            com.tencent.open.log.SLog.i(r1, r3)
            r2.finish()
            return
        L4a:
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r3.<init>(r4)
            com.tencent.connect.common.AssistActivity$2 r4 = new com.tencent.connect.common.AssistActivity$2
            r4.<init>(r2)
            r0 = 200(0xc8, double:9.9E-322)
            r3.postDelayed(r4, r0)
            return
    }

    @Override // android.app.Activity
    protected native void onCreate(android.os.Bundle r1);

    @Override // android.app.Activity
    protected void onDestroy() {
            r2 = this;
            java.lang.String r0 = "openSDK_LOG.AssistActivity"
            java.lang.String r1 = "-->onDestroy"
            com.tencent.open.log.SLog.i(r0, r1)
            super.onDestroy()
            com.tencent.connect.common.AssistActivity$QQStayReceiver r0 = r2.e
            if (r0 == 0) goto L11
            r2.unregisterReceiver(r0)
        L11:
            return
    }

    @Override // android.app.Activity
    protected void onNewIntent(android.content.Intent r9) {
            r8 = this;
            java.lang.String r0 = "--onNewIntent"
            java.lang.String r1 = "openSDK_LOG.AssistActivity"
            com.tencent.open.log.SLog.i(r1, r0)
            super.onNewIntent(r9)
            java.lang.String r0 = "key_request_code"
            r2 = -1
            int r0 = r9.getIntExtra(r0, r2)
            r3 = 10108(0x277c, float:1.4164E-41)
            r4 = 1
            r5 = 0
            java.lang.String r6 = "stay_back_stack"
            java.lang.String r7 = "key_action"
            if (r0 != r3) goto L36
            java.lang.String r0 = "action_request_avatar"
            r9.putExtra(r7, r0)
            boolean r0 = r9.getBooleanExtra(r6, r5)
            if (r0 == 0) goto L29
            r8.moveTaskToBack(r4)
        L29:
            r8.setResult(r2, r9)
            boolean r9 = r8.isFinishing()
            if (r9 != 0) goto L100
            r8.finish()
            return
        L36:
            r3 = 10109(0x277d, float:1.4166E-41)
            if (r0 != r3) goto L55
            java.lang.String r0 = "action_request_set_emotion"
            r9.putExtra(r7, r0)
            boolean r0 = r9.getBooleanExtra(r6, r5)
            if (r0 == 0) goto L48
            r8.moveTaskToBack(r4)
        L48:
            r8.setResult(r2, r9)
            boolean r9 = r8.isFinishing()
            if (r9 != 0) goto L100
            r8.finish()
            return
        L55:
            r3 = 10110(0x277e, float:1.4167E-41)
            if (r0 != r3) goto L74
            java.lang.String r0 = "action_request_dynamic_avatar"
            r9.putExtra(r7, r0)
            boolean r0 = r9.getBooleanExtra(r6, r5)
            if (r0 == 0) goto L67
            r8.moveTaskToBack(r4)
        L67:
            r8.setResult(r2, r9)
            boolean r9 = r8.isFinishing()
            if (r9 != 0) goto L100
            r8.finish()
            return
        L74:
            r3 = 10111(0x277f, float:1.4169E-41)
            if (r0 != r3) goto L93
            java.lang.String r0 = "joinGroup"
            r9.putExtra(r7, r0)
            boolean r0 = r9.getBooleanExtra(r6, r5)
            if (r0 == 0) goto L86
            r8.moveTaskToBack(r4)
        L86:
            r8.setResult(r2, r9)
            boolean r9 = r8.isFinishing()
            if (r9 != 0) goto L100
            r8.finish()
            return
        L93:
            r3 = 10112(0x2780, float:1.417E-41)
            if (r0 != r3) goto Lb2
            java.lang.String r0 = "bindGroup"
            r9.putExtra(r7, r0)
            boolean r0 = r9.getBooleanExtra(r6, r5)
            if (r0 == 0) goto La5
            r8.moveTaskToBack(r4)
        La5:
            r8.setResult(r2, r9)
            boolean r9 = r8.isFinishing()
            if (r9 != 0) goto L100
            r8.finish()
            return
        Lb2:
            r3 = 10113(0x2781, float:1.4171E-41)
            java.lang.String r4 = "action"
            java.lang.String r5 = "--onNewIntent--activity not finished, finish now"
            if (r0 != r3) goto Ld1
            java.lang.String r0 = r9.getStringExtra(r4)
            r9.putExtra(r7, r0)
            r8.setResult(r2, r9)
            boolean r9 = r8.isFinishing()
            if (r9 != 0) goto L100
            com.tencent.open.log.SLog.i(r1, r5)
            r8.finish()
            return
        Ld1:
            r3 = 10114(0x2782, float:1.4173E-41)
            if (r0 == r3) goto Lea
            java.lang.String r0 = "action_share"
            r9.putExtra(r7, r0)
            r8.setResult(r2, r9)
            boolean r9 = r8.isFinishing()
            if (r9 != 0) goto L100
            com.tencent.open.log.SLog.i(r1, r5)
            r8.finish()
            return
        Lea:
            java.lang.String r0 = r9.getStringExtra(r4)
            r9.putExtra(r7, r0)
            r8.setResult(r2, r9)
            boolean r9 = r8.isFinishing()
            if (r9 != 0) goto L100
            com.tencent.open.log.SLog.i(r1, r5)
            r8.finish()
        L100:
            return
    }

    @Override // android.app.Activity
    protected void onPause() {
            r2 = this;
            java.lang.String r0 = "openSDK_LOG.AssistActivity"
            java.lang.String r1 = "-->onPause"
            com.tencent.open.log.SLog.i(r0, r1)
            android.os.Handler r0 = r2.b
            r1 = 0
            r0.removeMessages(r1)
            super.onPause()
            return
    }

    @Override // android.app.Activity
    protected void onResume() {
            r3 = this;
            java.lang.String r0 = "openSDK_LOG.AssistActivity"
            java.lang.String r1 = "-->onResume"
            com.tencent.open.log.SLog.i(r0, r1)
            super.onResume()
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "is_login"
            r2 = 0
            boolean r1 = r0.getBooleanExtra(r1, r2)
            if (r1 == 0) goto L18
            return
        L18:
            java.lang.String r1 = "is_qq_mobile_share"
            boolean r0 = r0.getBooleanExtra(r1, r2)
            if (r0 != 0) goto L2d
            boolean r0 = r3.c
            if (r0 == 0) goto L2d
            boolean r0 = r3.isFinishing()
            if (r0 != 0) goto L2d
            r3.finish()
        L2d:
            boolean r0 = r3.a
            if (r0 == 0) goto L3d
            android.os.Handler r0 = r3.b
            android.os.Message r0 = r0.obtainMessage(r2)
            android.os.Handler r1 = r3.b
            r1.sendMessage(r0)
            return
        L3d:
            r0 = 1
            r3.a = r0
            return
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            java.lang.String r0 = "openSDK_LOG.AssistActivity"
            java.lang.String r1 = "--onSaveInstanceState--"
            com.tencent.open.log.SLog.i(r0, r1)
            java.lang.String r0 = "RESTART_FLAG"
            r1 = 1
            r3.putBoolean(r0, r1)
            java.lang.String r0 = "RESUME_FLAG"
            boolean r1 = r2.a
            r3.putBoolean(r0, r1)
            super.onSaveInstanceState(r3)
            return
    }

    @Override // android.app.Activity
    protected void onStart() {
            r2 = this;
            java.lang.String r0 = "openSDK_LOG.AssistActivity"
            java.lang.String r1 = "-->onStart"
            com.tencent.open.log.SLog.i(r0, r1)
            super.onStart()
            return
    }

    @Override // android.app.Activity
    protected void onStop() {
            r2 = this;
            java.lang.String r0 = "openSDK_LOG.AssistActivity"
            java.lang.String r1 = "-->onStop"
            com.tencent.open.log.SLog.i(r0, r1)
            super.onStop()
            return
    }

    public void setResultData(int r12, android.content.Intent r13) {
            r11 = this;
            r0 = 0
            java.lang.String r1 = "openSDK_LOG.AssistActivity"
            if (r13 != 0) goto L25
            java.lang.String r13 = "--setResultData--intent is null, setResult ACTIVITY_CANCEL"
            com.tencent.open.log.SLog.w(r1, r13)
            r11.setResult(r0)
            r13 = 11101(0x2b5d, float:1.5556E-41)
            if (r12 != r13) goto L24
            com.tencent.open.b.e r0 = com.tencent.open.b.e.a()
            java.lang.String r2 = r11.d
            java.lang.String r5 = "7"
            java.lang.String r6 = "2"
            java.lang.String r1 = ""
            java.lang.String r3 = "2"
            java.lang.String r4 = "1"
            r0.a(r1, r2, r3, r4, r5, r6)
        L24:
            return
        L25:
            java.lang.String r12 = "key_response"
            java.lang.String r12 = r13.getStringExtra(r12)     // Catch: java.lang.Exception -> Lb4
            java.lang.String r2 = "--setResultDataForLogin-- "
            com.tencent.open.log.SLog.d(r1, r2)     // Catch: java.lang.Exception -> Lb4
            boolean r2 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Exception -> Lb4
            r3 = -1
            if (r2 != 0) goto Lab
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lb4
            r2.<init>(r12)     // Catch: java.lang.Exception -> Lb4
            java.lang.String r12 = "openid"
            java.lang.String r5 = r2.optString(r12)     // Catch: java.lang.Exception -> Lb4
            java.lang.String r12 = "access_token"
            java.lang.String r12 = r2.optString(r12)     // Catch: java.lang.Exception -> Lb4
            java.lang.String r4 = "proxy_code"
            java.lang.String r4 = r2.optString(r4)     // Catch: java.lang.Exception -> Lb4
            java.lang.String r6 = "proxy_expires_in"
            long r6 = r2.optLong(r6)     // Catch: java.lang.Exception -> Lb4
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> Lb4
            if (r2 != 0) goto L7a
            boolean r12 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Exception -> Lb4
            if (r12 != 0) goto L7a
            java.lang.String r12 = "--setResultData--openid and token not empty, setResult ACTIVITY_OK"
            com.tencent.open.log.SLog.i(r1, r12)     // Catch: java.lang.Exception -> Lb4
            r11.setResult(r3, r13)     // Catch: java.lang.Exception -> Lb4
            com.tencent.open.b.e r4 = com.tencent.open.b.e.a()     // Catch: java.lang.Exception -> Lb4
            java.lang.String r6 = r11.d     // Catch: java.lang.Exception -> Lb4
            java.lang.String r7 = "2"
            java.lang.String r8 = "1"
            java.lang.String r9 = "7"
            java.lang.String r10 = "0"
            r4.a(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> Lb4
            return
        L7a:
            boolean r12 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> Lb4
            if (r12 != 0) goto L8f
            r4 = 0
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 == 0) goto L8f
            java.lang.String r12 = "--setResultData--proxy_code and proxy_expires_in are valid"
            com.tencent.open.log.SLog.i(r1, r12)     // Catch: java.lang.Exception -> Lb4
            r11.setResult(r3, r13)     // Catch: java.lang.Exception -> Lb4
            return
        L8f:
            java.lang.String r12 = "--setResultData--openid or token is empty, setResult ACTIVITY_CANCEL"
            com.tencent.open.log.SLog.w(r1, r12)     // Catch: java.lang.Exception -> Lb4
            r11.setResult(r0, r13)     // Catch: java.lang.Exception -> Lb4
            com.tencent.open.b.e r2 = com.tencent.open.b.e.a()     // Catch: java.lang.Exception -> Lb4
            java.lang.String r3 = ""
            java.lang.String r4 = r11.d     // Catch: java.lang.Exception -> Lb4
            java.lang.String r5 = "2"
            java.lang.String r6 = "1"
            java.lang.String r7 = "7"
            java.lang.String r8 = "1"
            r2.a(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> Lb4
            return
        Lab:
            java.lang.String r12 = "--setResultData--response is empty, setResult ACTIVITY_OK"
            com.tencent.open.log.SLog.w(r1, r12)     // Catch: java.lang.Exception -> Lb4
            r11.setResult(r3, r13)     // Catch: java.lang.Exception -> Lb4
            return
        Lb4:
            java.lang.String r12 = "--setResultData--parse response failed"
            com.tencent.open.log.SLog.e(r1, r12)
            return
    }
}
