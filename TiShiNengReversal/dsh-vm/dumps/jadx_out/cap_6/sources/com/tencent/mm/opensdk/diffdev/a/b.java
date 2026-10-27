package com.tencent.mm.opensdk.diffdev.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b extends android.os.AsyncTask<java.lang.Void, java.lang.Void, com.tencent.mm.opensdk.diffdev.a.b.a> {
    private java.lang.String a;
    private java.lang.String b;
    private java.lang.String c;
    private java.lang.String d;
    private java.lang.String e;
    private com.tencent.mm.opensdk.diffdev.OAuthListener f;
    private com.tencent.mm.opensdk.diffdev.a.c g;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a {
        public com.tencent.mm.opensdk.diffdev.OAuthErrCode a;
        public java.lang.String b;
        public java.lang.String c;
        public java.lang.String d;
        public byte[] e;

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public static com.tencent.mm.opensdk.diffdev.a.b.a a(byte[] r8) {
                com.tencent.mm.opensdk.diffdev.a.b$a r0 = new com.tencent.mm.opensdk.diffdev.a.b$a
                r0.<init>()
                java.lang.String r1 = "MicroMsg.SDK.GetQRCodeResult"
                if (r8 == 0) goto Lca
                int r2 = r8.length
                if (r2 != 0) goto Le
                goto Lca
            Le:
                r2 = 1
                r3 = 0
                java.lang.String r4 = new java.lang.String     // Catch: java.lang.Exception -> Lba
                java.lang.String r5 = "utf-8"
                r4.<init>(r8, r5)     // Catch: java.lang.Exception -> Lba
                org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Exception -> L3f
                r8.<init>(r4)     // Catch: java.lang.Exception -> L3f
                java.lang.String r4 = "errcode"
                int r4 = r8.getInt(r4)     // Catch: java.lang.Exception -> L3f
                if (r4 == 0) goto L41
                java.lang.String r5 = "resp errcode = %d"
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L3f
                java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L3f
                r6[r3] = r4     // Catch: java.lang.Exception -> L3f
                java.lang.String r4 = java.lang.String.format(r5, r6)     // Catch: java.lang.Exception -> L3f
                com.tencent.mm.opensdk.utils.Log.e(r1, r4)     // Catch: java.lang.Exception -> L3f
                com.tencent.mm.opensdk.diffdev.OAuthErrCode r4 = com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_NormalErr     // Catch: java.lang.Exception -> L3f
                r0.a = r4     // Catch: java.lang.Exception -> L3f
                java.lang.String r4 = "errmsg"
                r8.optString(r4)     // Catch: java.lang.Exception -> L3f
                return r0
            L3f:
                r8 = move-exception
                goto La4
            L41:
                java.lang.String r4 = "qrcode"
                org.json.JSONObject r4 = r8.getJSONObject(r4)     // Catch: java.lang.Exception -> L3f
                java.lang.String r5 = "qrcodebase64"
                java.lang.String r4 = r4.getString(r5)     // Catch: java.lang.Exception -> L3f
                if (r4 == 0) goto L9c
                int r5 = r4.length()     // Catch: java.lang.Exception -> L3f
                if (r5 != 0) goto L56
                goto L9c
            L56:
                byte[] r4 = android.util.Base64.decode(r4, r3)     // Catch: java.lang.Exception -> L3f
                if (r4 == 0) goto L93
                int r5 = r4.length     // Catch: java.lang.Exception -> L3f
                if (r5 != 0) goto L60
                goto L93
            L60:
                com.tencent.mm.opensdk.diffdev.OAuthErrCode r5 = com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_OK     // Catch: java.lang.Exception -> L3f
                r0.a = r5     // Catch: java.lang.Exception -> L3f
                r0.e = r4     // Catch: java.lang.Exception -> L3f
                java.lang.String r4 = "uuid"
                java.lang.String r4 = r8.getString(r4)     // Catch: java.lang.Exception -> L3f
                r0.b = r4     // Catch: java.lang.Exception -> L3f
                java.lang.String r4 = "appname"
                java.lang.String r8 = r8.getString(r4)     // Catch: java.lang.Exception -> L3f
                r0.c = r8     // Catch: java.lang.Exception -> L3f
                java.lang.String r4 = "parse succ, save in memory, uuid = %s, appname = %s, imgBufLength = %d"
                java.lang.String r5 = r0.b     // Catch: java.lang.Exception -> L3f
                byte[] r6 = r0.e     // Catch: java.lang.Exception -> L3f
                int r6 = r6.length     // Catch: java.lang.Exception -> L3f
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L3f
                r7 = 3
                java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> L3f
                r7[r3] = r5     // Catch: java.lang.Exception -> L3f
                r7[r2] = r8     // Catch: java.lang.Exception -> L3f
                r8 = 2
                r7[r8] = r6     // Catch: java.lang.Exception -> L3f
                java.lang.String r8 = java.lang.String.format(r4, r7)     // Catch: java.lang.Exception -> L3f
                com.tencent.mm.opensdk.utils.Log.d(r1, r8)     // Catch: java.lang.Exception -> L3f
                return r0
            L93:
                java.lang.String r8 = "parse fail, qrcodeBuf is null"
                com.tencent.mm.opensdk.utils.Log.e(r1, r8)     // Catch: java.lang.Exception -> L3f
                goto La1
            L99:
                r0.a = r8     // Catch: java.lang.Exception -> L3f
                return r0
            L9c:
                java.lang.String r8 = "parse fail, qrcodeBase64 is null"
                com.tencent.mm.opensdk.utils.Log.e(r1, r8)     // Catch: java.lang.Exception -> L3f
            La1:
                com.tencent.mm.opensdk.diffdev.OAuthErrCode r8 = com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_JsonDecodeErr     // Catch: java.lang.Exception -> L3f
                goto L99
            La4:
                java.lang.String r8 = r8.getMessage()
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r3] = r8
                java.lang.String r8 = "parse json fail, ex = %s"
                java.lang.String r8 = java.lang.String.format(r8, r2)
            Lb2:
                com.tencent.mm.opensdk.utils.Log.e(r1, r8)
                com.tencent.mm.opensdk.diffdev.OAuthErrCode r8 = com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_NormalErr
            Lb7:
                r0.a = r8
                return r0
            Lba:
                r8 = move-exception
                java.lang.String r8 = r8.getMessage()
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r3] = r8
                java.lang.String r8 = "parse fail, build String fail, ex = %s"
                java.lang.String r8 = java.lang.String.format(r8, r2)
                goto Lb2
            Lca:
                java.lang.String r8 = "parse fail, buf is null"
                com.tencent.mm.opensdk.utils.Log.e(r1, r8)
                com.tencent.mm.opensdk.diffdev.OAuthErrCode r8 = com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_NetworkErr
                goto Lb7
        }
    }

    public b(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, com.tencent.mm.opensdk.diffdev.OAuthListener r6) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            return
    }

    public boolean a() {
            r2 = this;
            java.lang.String r0 = "MicroMsg.SDK.GetQRCodeTask"
            java.lang.String r1 = "cancelTask"
            com.tencent.mm.opensdk.utils.Log.i(r0, r1)
            com.tencent.mm.opensdk.diffdev.a.c r0 = r2.g
            r1 = 1
            if (r0 != 0) goto L11
            boolean r0 = r2.cancel(r1)
            return r0
        L11:
            boolean r0 = r0.cancel(r1)
            return r0
    }

    @Override // android.os.AsyncTask
    protected com.tencent.mm.opensdk.diffdev.a.b.a doInBackground(java.lang.Void[] r10) {
            r9 = this;
            java.lang.Void[] r10 = (java.lang.Void[]) r10
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            java.lang.String r0 = "OpenSdkGetQRCodeTask"
            r10.setName(r0)
            java.lang.String r10 = "doInBackground"
            java.lang.String r0 = "MicroMsg.SDK.GetQRCodeTask"
            com.tencent.mm.opensdk.utils.Log.i(r0, r10)
            java.lang.String r10 = r9.a
            java.lang.String r1 = r9.c
            java.lang.String r2 = r9.d
            java.lang.String r3 = r9.b
            java.lang.String r4 = r9.e
            r5 = 5
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            r5[r6] = r10
            r10 = 1
            r5[r10] = r1
            r1 = 2
            r5[r1] = r2
            r2 = 3
            r5[r2] = r3
            r2 = 4
            r5[r2] = r4
            java.lang.String r2 = "https://open.weixin.qq.com/connect/sdk/qrconnect?appid=%s&noncestr=%s&timestamp=%s&scope=%s&signature=%s"
            java.lang.String r2 = java.lang.String.format(r2, r5)
            long r3 = java.lang.System.currentTimeMillis()
            r5 = 60000(0xea60, float:8.4078E-41)
            byte[] r5 = com.tencent.mm.opensdk.channel.a.a.a(r2, r5)
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r3
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r6] = r2
            r1[r10] = r3
            java.lang.String r10 = "doInBackground, url = %s, time consumed = %d(ms)"
            java.lang.String r10 = java.lang.String.format(r10, r1)
            com.tencent.mm.opensdk.utils.Log.d(r0, r10)
            com.tencent.mm.opensdk.diffdev.a.b$a r10 = com.tencent.mm.opensdk.diffdev.a.b.a.a(r5)
            return r10
    }

    @Override // android.os.AsyncTask
    protected void onPostExecute(com.tencent.mm.opensdk.diffdev.a.b.a r5) {
            r4 = this;
            com.tencent.mm.opensdk.diffdev.a.b$a r5 = (com.tencent.mm.opensdk.diffdev.a.b.a) r5
            com.tencent.mm.opensdk.diffdev.OAuthErrCode r0 = r5.a
            com.tencent.mm.opensdk.diffdev.OAuthErrCode r1 = com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_OK
            r2 = 0
            java.lang.String r3 = "MicroMsg.SDK.GetQRCodeTask"
            if (r0 != r1) goto L3e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onPostExecute, get qrcode success imgBufSize = "
            r0.append(r1)
            byte[] r1 = r5.e
            int r1 = r1.length
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.mm.opensdk.utils.Log.d(r3, r0)
            com.tencent.mm.opensdk.diffdev.OAuthListener r0 = r4.f
            java.lang.String r1 = r5.d
            byte[] r3 = r5.e
            r0.onAuthGotQrcode(r1, r3)
            com.tencent.mm.opensdk.diffdev.a.c r0 = new com.tencent.mm.opensdk.diffdev.a.c
            java.lang.String r5 = r5.b
            com.tencent.mm.opensdk.diffdev.OAuthListener r1 = r4.f
            r0.<init>(r5, r1)
            r4.g = r0
            java.util.concurrent.Executor r5 = android.os.AsyncTask.THREAD_POOL_EXECUTOR
            java.lang.Void[] r1 = new java.lang.Void[r2]
            r0.executeOnExecutor(r5, r1)
            return
        L3e:
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r0
            java.lang.String r0 = "onPostExecute, get qrcode fail, OAuthErrCode = %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            com.tencent.mm.opensdk.utils.Log.e(r3, r0)
            com.tencent.mm.opensdk.diffdev.OAuthListener r0 = r4.f
            com.tencent.mm.opensdk.diffdev.OAuthErrCode r5 = r5.a
            r1 = 0
            r0.onAuthFinish(r5, r1)
            return
    }
}
