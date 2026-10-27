package com.tencent.mm.opensdk.diffdev.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class c extends android.os.AsyncTask<java.lang.Void, java.lang.Void, com.tencent.mm.opensdk.diffdev.a.c.a> {
    private java.lang.String a;
    private java.lang.String b;
    private com.tencent.mm.opensdk.diffdev.OAuthListener c;
    private int d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a {
        public com.tencent.mm.opensdk.diffdev.OAuthErrCode a;
        public java.lang.String b;
        public int c;

        a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public c(java.lang.String r2, com.tencent.mm.opensdk.diffdev.OAuthListener r3) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            r1.c = r3
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r0 = 0
            r3[r0] = r2
            java.lang.String r2 = "https://long.open.weixin.qq.com/connect/l/qrconnect?f=json&uuid=%s"
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r1.b = r2
            return
    }

    @Override // android.os.AsyncTask
    protected com.tencent.mm.opensdk.diffdev.a.c.a doInBackground(java.lang.Void[] r14) {
            r13 = this;
            java.lang.Void[] r14 = (java.lang.Void[]) r14
            java.lang.Thread r14 = java.lang.Thread.currentThread()
            java.lang.String r0 = "OpenSdkNoopingTask"
            r14.setName(r0)
            java.lang.String r14 = r13.a
            java.lang.String r0 = "MicroMsg.SDK.NoopingTask"
            if (r14 == 0) goto L195
            int r14 = r14.length()
            if (r14 != 0) goto L19
            goto L195
        L19:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r1 = "doInBackground start "
            r14.append(r1)
            boolean r1 = r13.isCancelled()
            r14.append(r1)
            java.lang.String r14 = r14.toString()
            com.tencent.mm.opensdk.utils.Log.i(r0, r14)
        L31:
            boolean r14 = r13.isCancelled()
            if (r14 != 0) goto L186
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r1 = r13.b
            r14.append(r1)
            int r1 = r13.d
            if (r1 != 0) goto L48
            java.lang.String r1 = ""
            goto L5b
        L48:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "&last="
            r1.append(r2)
            int r2 = r13.d
            r1.append(r2)
            java.lang.String r1 = r1.toString()
        L5b:
            r14.append(r1)
            java.lang.String r14 = r14.toString()
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 60000(0xea60, float:8.4078E-41)
            byte[] r3 = com.tencent.mm.opensdk.channel.a.a.a(r14, r3)
            long r4 = java.lang.System.currentTimeMillis()
            com.tencent.mm.opensdk.diffdev.a.c$a r6 = new com.tencent.mm.opensdk.diffdev.a.c$a
            r6.<init>()
            java.lang.String r7 = "star parse NoopingResult"
            java.lang.String r8 = "MicroMsg.SDK.NoopingResult"
            com.tencent.mm.opensdk.utils.Log.d(r8, r7)
            r7 = 0
            r9 = 1
            if (r3 == 0) goto Lfc
            int r10 = r3.length
            if (r10 != 0) goto L86
            goto Lfc
        L86:
            java.lang.String r10 = new java.lang.String     // Catch: java.lang.Exception -> Lec
            java.lang.String r11 = "utf-8"
            r10.<init>(r3, r11)     // Catch: java.lang.Exception -> Lec
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lc6
            r3.<init>(r10)     // Catch: java.lang.Exception -> Lc6
            java.lang.String r10 = "wx_errcode"
            int r10 = r3.getInt(r10)     // Catch: java.lang.Exception -> Lc6
            r6.c = r10     // Catch: java.lang.Exception -> Lc6
            java.lang.String r11 = "nooping uuidStatusCode = %d"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Exception -> Lc6
            java.lang.Object[] r12 = new java.lang.Object[r9]     // Catch: java.lang.Exception -> Lc6
            r12[r7] = r10     // Catch: java.lang.Exception -> Lc6
            java.lang.String r10 = java.lang.String.format(r11, r12)     // Catch: java.lang.Exception -> Lc6
            com.tencent.mm.opensdk.utils.Log.d(r8, r10)     // Catch: java.lang.Exception -> Lc6
            int r10 = r6.c     // Catch: java.lang.Exception -> Lc6
            r11 = 408(0x198, float:5.72E-43)
            if (r10 == r11) goto Ld1
            r11 = 500(0x1f4, float:7.0E-43)
            if (r10 == r11) goto Lce
            switch(r10) {
                case 402: goto Lcb;
                case 403: goto Lc8;
                case 404: goto Ld1;
                case 405: goto Lb9;
                default: goto Lb8;
            }     // Catch: java.lang.Exception -> Lc6
        Lb8:
            goto Lce
        Lb9:
            com.tencent.mm.opensdk.diffdev.OAuthErrCode r10 = com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_OK     // Catch: java.lang.Exception -> Lc6
            r6.a = r10     // Catch: java.lang.Exception -> Lc6
            java.lang.String r10 = "wx_code"
            java.lang.String r3 = r3.getString(r10)     // Catch: java.lang.Exception -> Lc6
            r6.b = r3     // Catch: java.lang.Exception -> Lc6
            goto L104
        Lc6:
            r3 = move-exception
            goto Ld6
        Lc8:
            com.tencent.mm.opensdk.diffdev.OAuthErrCode r3 = com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_Cancel     // Catch: java.lang.Exception -> Lc6
            goto Ld3
        Lcb:
            com.tencent.mm.opensdk.diffdev.OAuthErrCode r3 = com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_Timeout     // Catch: java.lang.Exception -> Lc6
            goto Ld3
        Lce:
            com.tencent.mm.opensdk.diffdev.OAuthErrCode r3 = com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_NormalErr     // Catch: java.lang.Exception -> Lc6
            goto Ld3
        Ld1:
            com.tencent.mm.opensdk.diffdev.OAuthErrCode r3 = com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_OK     // Catch: java.lang.Exception -> Lc6
        Ld3:
            r6.a = r3     // Catch: java.lang.Exception -> Lc6
            goto L104
        Ld6:
            java.lang.String r3 = r3.getMessage()
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r10[r7] = r3
            java.lang.String r3 = "parse json fail, ex = %s"
            java.lang.String r3 = java.lang.String.format(r3, r10)
        Le4:
            com.tencent.mm.opensdk.utils.Log.e(r8, r3)
            com.tencent.mm.opensdk.diffdev.OAuthErrCode r3 = com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_NormalErr
        Le9:
            r6.a = r3
            goto L104
        Lec:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r10[r7] = r3
            java.lang.String r3 = "parse fail, build String fail, ex = %s"
            java.lang.String r3 = java.lang.String.format(r3, r10)
            goto Le4
        Lfc:
            java.lang.String r3 = "parse fail, buf is null"
            com.tencent.mm.opensdk.utils.Log.e(r8, r3)
            com.tencent.mm.opensdk.diffdev.OAuthErrCode r3 = com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_NetworkErr
            goto Le9
        L104:
            com.tencent.mm.opensdk.diffdev.OAuthErrCode r3 = r6.a
            java.lang.String r3 = r3.toString()
            int r8 = r6.c
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            long r4 = r4 - r1
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r7] = r14
            r2[r9] = r3
            r14 = 2
            r2[r14] = r8
            r3 = 3
            r2[r3] = r1
            java.lang.String r1 = "nooping, url = %s, errCode = %s, uuidStatusCode = %d, time consumed = %d(ms)"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            com.tencent.mm.opensdk.utils.Log.d(r0, r1)
            com.tencent.mm.opensdk.diffdev.OAuthErrCode r1 = r6.a
            com.tencent.mm.opensdk.diffdev.OAuthErrCode r2 = com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_OK
            if (r1 != r2) goto L16c
            int r14 = r6.c
            r13.d = r14
            com.tencent.mm.opensdk.diffdev.a.d r1 = com.tencent.mm.opensdk.diffdev.a.d.d
            int r1 = r1.a()
            if (r14 != r1) goto L144
            com.tencent.mm.opensdk.diffdev.OAuthListener r14 = r13.c
            r14.onQrcodeScanned()
            goto L31
        L144:
            int r14 = r6.c
            com.tencent.mm.opensdk.diffdev.a.d r1 = com.tencent.mm.opensdk.diffdev.a.d.f
            int r1 = r1.a()
            if (r14 != r1) goto L150
            goto L31
        L150:
            int r14 = r6.c
            com.tencent.mm.opensdk.diffdev.a.d r1 = com.tencent.mm.opensdk.diffdev.a.d.e
            int r1 = r1.a()
            if (r14 != r1) goto L31
            java.lang.String r14 = r6.b
            if (r14 == 0) goto L164
            int r14 = r14.length()
            if (r14 != 0) goto L194
        L164:
            java.lang.String r14 = "nooping fail, confirm with an empty code!!!"
            com.tencent.mm.opensdk.utils.Log.e(r0, r14)
            com.tencent.mm.opensdk.diffdev.OAuthErrCode r14 = com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_NormalErr
            goto L192
        L16c:
            java.lang.String r1 = r1.toString()
            int r2 = r6.c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r14 = new java.lang.Object[r14]
            r14[r7] = r1
            r14[r9] = r2
            java.lang.String r1 = "nooping fail, errCode = %s, uuidStatusCode = %d"
            java.lang.String r14 = java.lang.String.format(r1, r14)
            com.tencent.mm.opensdk.utils.Log.e(r0, r14)
            goto L194
        L186:
            java.lang.String r14 = "IDiffDevOAuth.stopAuth / detach invoked"
            com.tencent.mm.opensdk.utils.Log.i(r0, r14)
            com.tencent.mm.opensdk.diffdev.a.c$a r6 = new com.tencent.mm.opensdk.diffdev.a.c$a
            r6.<init>()
            com.tencent.mm.opensdk.diffdev.OAuthErrCode r14 = com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_Auth_Stopped
        L192:
            r6.a = r14
        L194:
            return r6
        L195:
            java.lang.String r14 = "run fail, uuid is null"
            com.tencent.mm.opensdk.utils.Log.e(r0, r14)
            com.tencent.mm.opensdk.diffdev.a.c$a r14 = new com.tencent.mm.opensdk.diffdev.a.c$a
            r14.<init>()
            com.tencent.mm.opensdk.diffdev.OAuthErrCode r0 = com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_NormalErr
            r14.a = r0
            return r14
    }

    @Override // android.os.AsyncTask
    protected void onPostExecute(com.tencent.mm.opensdk.diffdev.a.c.a r3) {
            r2 = this;
            com.tencent.mm.opensdk.diffdev.a.c$a r3 = (com.tencent.mm.opensdk.diffdev.a.c.a) r3
            com.tencent.mm.opensdk.diffdev.OAuthListener r0 = r2.c
            com.tencent.mm.opensdk.diffdev.OAuthErrCode r1 = r3.a
            java.lang.String r3 = r3.b
            r0.onAuthFinish(r1, r3)
            return
    }
}
