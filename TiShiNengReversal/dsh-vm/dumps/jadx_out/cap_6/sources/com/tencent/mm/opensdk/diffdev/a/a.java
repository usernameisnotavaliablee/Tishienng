package com.tencent.mm.opensdk.diffdev.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a implements com.tencent.mm.opensdk.diffdev.IDiffDevOAuth {
    private android.os.Handler a;
    private java.util.List<com.tencent.mm.opensdk.diffdev.OAuthListener> b;
    private com.tencent.mm.opensdk.diffdev.a.b c;
    private com.tencent.mm.opensdk.diffdev.OAuthListener d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.tencent.mm.opensdk.diffdev.a.a$a, reason: collision with other inner class name */
    class C0033a implements com.tencent.mm.opensdk.diffdev.OAuthListener {
        final /* synthetic */ com.tencent.mm.opensdk.diffdev.a.a a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.tencent.mm.opensdk.diffdev.a.a$a$a, reason: collision with other inner class name */
        class RunnableC0034a implements java.lang.Runnable {
            final /* synthetic */ com.tencent.mm.opensdk.diffdev.a.a.C0033a a;

            RunnableC0034a(com.tencent.mm.opensdk.diffdev.a.a.C0033a r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    com.tencent.mm.opensdk.diffdev.a.a$a r1 = r2.a
                    com.tencent.mm.opensdk.diffdev.a.a r1 = r1.a
                    java.util.List r1 = com.tencent.mm.opensdk.diffdev.a.a.a(r1)
                    r0.addAll(r1)
                    java.util.Iterator r0 = r0.iterator()
                L14:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L24
                    java.lang.Object r1 = r0.next()
                    com.tencent.mm.opensdk.diffdev.OAuthListener r1 = (com.tencent.mm.opensdk.diffdev.OAuthListener) r1
                    r1.onQrcodeScanned()
                    goto L14
                L24:
                    return
            }
        }

        C0033a(com.tencent.mm.opensdk.diffdev.a.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.tencent.mm.opensdk.diffdev.OAuthListener
        public void onAuthFinish(com.tencent.mm.opensdk.diffdev.OAuthErrCode r4, java.lang.String r5) {
                r3 = this;
                java.lang.String r0 = r4.toString()
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r0
                r0 = 1
                r1[r0] = r5
                java.lang.String r0 = "onAuthFinish, errCode = %s, authCode = %s"
                java.lang.String r0 = java.lang.String.format(r0, r1)
                java.lang.String r1 = "MicroMsg.SDK.ListenerWrapper"
                com.tencent.mm.opensdk.utils.Log.d(r1, r0)
                com.tencent.mm.opensdk.diffdev.a.a r0 = r3.a
                r1 = 0
                com.tencent.mm.opensdk.diffdev.a.a.a(r0, r1)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                com.tencent.mm.opensdk.diffdev.a.a r1 = r3.a
                java.util.List r1 = com.tencent.mm.opensdk.diffdev.a.a.a(r1)
                r0.addAll(r1)
                java.util.Iterator r0 = r0.iterator()
            L30:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L40
                java.lang.Object r1 = r0.next()
                com.tencent.mm.opensdk.diffdev.OAuthListener r1 = (com.tencent.mm.opensdk.diffdev.OAuthListener) r1
                r1.onAuthFinish(r4, r5)
                goto L30
            L40:
                return
        }

        @Override // com.tencent.mm.opensdk.diffdev.OAuthListener
        public void onAuthGotQrcode(java.lang.String r3, byte[] r4) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "onAuthGotQrcode, qrcodeImgPath = "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "MicroMsg.SDK.ListenerWrapper"
                com.tencent.mm.opensdk.utils.Log.d(r1, r0)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                com.tencent.mm.opensdk.diffdev.a.a r1 = r2.a
                java.util.List r1 = com.tencent.mm.opensdk.diffdev.a.a.a(r1)
                r0.addAll(r1)
                java.util.Iterator r0 = r0.iterator()
            L28:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L38
                java.lang.Object r1 = r0.next()
                com.tencent.mm.opensdk.diffdev.OAuthListener r1 = (com.tencent.mm.opensdk.diffdev.OAuthListener) r1
                r1.onAuthGotQrcode(r3, r4)
                goto L28
            L38:
                return
        }

        @Override // com.tencent.mm.opensdk.diffdev.OAuthListener
        public void onQrcodeScanned() {
                r2 = this;
                java.lang.String r0 = "MicroMsg.SDK.ListenerWrapper"
                java.lang.String r1 = "onQrcodeScanned"
                com.tencent.mm.opensdk.utils.Log.d(r0, r1)
                com.tencent.mm.opensdk.diffdev.a.a r0 = r2.a
                android.os.Handler r0 = com.tencent.mm.opensdk.diffdev.a.a.b(r0)
                if (r0 == 0) goto L1d
                com.tencent.mm.opensdk.diffdev.a.a r0 = r2.a
                android.os.Handler r0 = com.tencent.mm.opensdk.diffdev.a.a.b(r0)
                com.tencent.mm.opensdk.diffdev.a.a$a$a r1 = new com.tencent.mm.opensdk.diffdev.a.a$a$a
                r1.<init>(r2)
                r0.post(r1)
            L1d:
                return
        }
    }

    public a() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.b = r0
            com.tencent.mm.opensdk.diffdev.a.a$a r0 = new com.tencent.mm.opensdk.diffdev.a.a$a
            r0.<init>(r1)
            r1.d = r0
            return
    }

    static /* synthetic */ com.tencent.mm.opensdk.diffdev.a.b a(com.tencent.mm.opensdk.diffdev.a.a r0, com.tencent.mm.opensdk.diffdev.a.b r1) {
            r0.c = r1
            return r1
    }

    static /* synthetic */ java.util.List a(com.tencent.mm.opensdk.diffdev.a.a r0) {
            java.util.List<com.tencent.mm.opensdk.diffdev.OAuthListener> r0 = r0.b
            return r0
    }

    static /* synthetic */ android.os.Handler b(com.tencent.mm.opensdk.diffdev.a.a r0) {
            android.os.Handler r0 = r0.a
            return r0
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public void addListener(com.tencent.mm.opensdk.diffdev.OAuthListener r2) {
            r1 = this;
            java.util.List<com.tencent.mm.opensdk.diffdev.OAuthListener> r0 = r1.b
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto Ld
            java.util.List<com.tencent.mm.opensdk.diffdev.OAuthListener> r0 = r1.b
            r0.add(r2)
        Ld:
            return
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public boolean auth(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, com.tencent.mm.opensdk.diffdev.OAuthListener r15) {
            r9 = this;
            r0 = r15
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "start auth, appId = "
            r2.append(r3)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.SDK.DiffDevOAuth"
            com.tencent.mm.opensdk.utils.Log.i(r3, r2)
            r7 = 0
            r8 = 1
            if (r10 == 0) goto L66
            int r2 = r10.length()
            if (r2 <= 0) goto L66
            if (r11 == 0) goto L66
            int r2 = r11.length()
            if (r2 > 0) goto L2a
            goto L66
        L2a:
            android.os.Handler r2 = r9.a
            if (r2 != 0) goto L39
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r2.<init>(r4)
            r9.a = r2
        L39:
            java.util.List<com.tencent.mm.opensdk.diffdev.OAuthListener> r2 = r9.b
            boolean r2 = r2.contains(r15)
            if (r2 != 0) goto L46
            java.util.List<com.tencent.mm.opensdk.diffdev.OAuthListener> r2 = r9.b
            r2.add(r15)
        L46:
            com.tencent.mm.opensdk.diffdev.a.b r0 = r9.c
            if (r0 == 0) goto L50
            java.lang.String r0 = "auth, already running, no need to start auth again"
            com.tencent.mm.opensdk.utils.Log.d(r3, r0)
            return r8
        L50:
            com.tencent.mm.opensdk.diffdev.a.b r0 = new com.tencent.mm.opensdk.diffdev.a.b
            com.tencent.mm.opensdk.diffdev.OAuthListener r6 = r9.d
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r9.c = r0
            java.util.concurrent.Executor r1 = android.os.AsyncTask.THREAD_POOL_EXECUTOR
            java.lang.Void[] r2 = new java.lang.Void[r7]
            r0.executeOnExecutor(r1, r2)
            return r8
        L66:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r7] = r10
            r0[r8] = r11
            java.lang.String r1 = "auth fail, invalid argument, appId = %s, scope = %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            com.tencent.mm.opensdk.utils.Log.d(r3, r0)
            return r7
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public void detach() {
            r2 = this;
            java.lang.String r0 = "MicroMsg.SDK.DiffDevOAuth"
            java.lang.String r1 = "detach"
            com.tencent.mm.opensdk.utils.Log.i(r0, r1)
            java.util.List<com.tencent.mm.opensdk.diffdev.OAuthListener> r0 = r2.b
            r0.clear()
            r2.stopAuth()
            return
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public void removeAllListeners() {
            r1 = this;
            java.util.List<com.tencent.mm.opensdk.diffdev.OAuthListener> r0 = r1.b
            r0.clear()
            return
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public void removeListener(com.tencent.mm.opensdk.diffdev.OAuthListener r2) {
            r1 = this;
            java.util.List<com.tencent.mm.opensdk.diffdev.OAuthListener> r0 = r1.b
            r0.remove(r2)
            return
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public boolean stopAuth() {
            r4 = this;
            java.lang.String r0 = "stopAuth"
            java.lang.String r1 = "MicroMsg.SDK.DiffDevOAuth"
            com.tencent.mm.opensdk.utils.Log.i(r1, r0)
            com.tencent.mm.opensdk.diffdev.a.b r0 = r4.c     // Catch: java.lang.Exception -> L12
            if (r0 != 0) goto Ld
            r0 = 1
            goto L2c
        Ld:
            boolean r0 = r0.a()     // Catch: java.lang.Exception -> L12
            goto L2c
        L12:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "stopAuth fail, ex = "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.mm.opensdk.utils.Log.w(r1, r0)
            r0 = 0
        L2c:
            r1 = 0
            r4.c = r1
            return r0
    }
}
