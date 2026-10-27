package com.uyumao;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class h extends android.content.BroadcastReceiver {
    public long a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a implements java.lang.Runnable {
        public final /* synthetic */ android.content.Context a;
        public final /* synthetic */ org.json.JSONObject b;

        public a(com.uyumao.h r1, android.content.Context r2, org.json.JSONObject r3) {
                r0 = this;
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                java.io.File r0 = new java.io.File
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                android.content.Context r2 = r3.a
                java.io.File r2 = r2.getCacheDir()
                java.lang.String r2 = r2.getPath()
                r1.append(r2)
                java.lang.String r2 = java.io.File.separator
                r1.append(r2)
                java.lang.String r2 = "net_change"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                org.json.JSONObject r2 = r3.b
                java.lang.String r2 = r2.toString()
                r1.append(r2)
                java.lang.String r2 = "\n"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r2 = 1
                byte[] r1 = r1.getBytes()
                com.uyumao.e.a(r0, r1, r2)
                return
        }
    }

    public h() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.a = r0
            return
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context r12, android.content.Intent r13) {
            r11 = this;
            java.lang.String r0 = "android.net.conn.CONNECTIVITY_CHANGE"
            java.lang.String r13 = r13.getAction()     // Catch: java.lang.Throwable -> L112
            boolean r13 = r0.equals(r13)     // Catch: java.lang.Throwable -> L112
            if (r13 == 0) goto L112
            java.lang.String r13 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r13 = com.uyumao.e.a(r12, r13)     // Catch: java.lang.Throwable -> L112
            if (r13 != 0) goto L16
            goto L112
        L16:
            java.lang.String r13 = "connectivity"
            java.lang.Object r13 = r12.getSystemService(r13)     // Catch: java.lang.Throwable -> L112
            android.net.ConnectivityManager r13 = (android.net.ConnectivityManager) r13     // Catch: java.lang.Throwable -> L112
            r0 = 1
            android.net.NetworkInfo r1 = r13.getNetworkInfo(r0)     // Catch: java.lang.Throwable -> L112
            r2 = 0
            android.net.NetworkInfo r13 = r13.getNetworkInfo(r2)     // Catch: java.lang.Throwable -> L112
            boolean r3 = r1.isConnected()     // Catch: java.lang.Throwable -> L112
            r4 = 500(0x1f4, double:2.47E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L68
            boolean r3 = r13.isConnected()     // Catch: java.lang.Throwable -> L112
            if (r3 == 0) goto L68
            long r9 = r11.a     // Catch: java.lang.Throwable -> L112
            int r1 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r1 < 0) goto L4c
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L112
            long r9 = r11.a     // Catch: java.lang.Throwable -> L112
            long r6 = r6 - r9
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 > 0) goto L4c
            goto L112
        L4c:
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L112
            r11.a = r3     // Catch: java.lang.Throwable -> L112
            java.lang.String[] r1 = com.uyumao.e.g(r12)     // Catch: java.lang.Throwable -> L112
            r2 = r1[r2]     // Catch: java.lang.Throwable -> L112
            r0 = r1[r0]     // Catch: java.lang.Throwable -> L112
            java.lang.String r13 = com.uyumao.e.a(r13)     // Catch: java.lang.Throwable -> L112
            java.lang.String r1 = com.uyumao.e.d(r12)     // Catch: java.lang.Throwable -> L112
            r3 = 3
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = 3
            goto Lb6
        L68:
            boolean r3 = r1.isConnected()     // Catch: java.lang.Throwable -> L112
            if (r3 != 0) goto L81
            boolean r3 = r13.isConnected()     // Catch: java.lang.Throwable -> L112
            if (r3 == 0) goto L81
            java.lang.String r13 = com.uyumao.e.a(r13)     // Catch: java.lang.Throwable -> L112
            java.lang.String r1 = com.uyumao.e.d(r12)     // Catch: java.lang.Throwable -> L112
            r0 = 2
            r2 = r1
            r1 = r8
            r3 = r1
            goto Lb6
        L81:
            boolean r1 = r1.isConnected()     // Catch: java.lang.Throwable -> L112
            if (r1 == 0) goto Lb1
            boolean r13 = r13.isConnected()     // Catch: java.lang.Throwable -> L112
            if (r13 != 0) goto Lb1
            long r9 = r11.a     // Catch: java.lang.Throwable -> L112
            int r13 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r13 < 0) goto La0
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L112
            long r9 = r11.a     // Catch: java.lang.Throwable -> L112
            long r6 = r6 - r9
            int r13 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r13 > 0) goto La0
            goto L112
        La0:
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L112
            r11.a = r3     // Catch: java.lang.Throwable -> L112
            java.lang.String[] r13 = com.uyumao.e.g(r12)     // Catch: java.lang.Throwable -> L112
            r3 = r13[r2]     // Catch: java.lang.Throwable -> L112
            r1 = r13[r0]     // Catch: java.lang.Throwable -> L112
            r13 = r8
            r2 = r13
            goto Lb6
        Lb1:
            r13 = r8
            r1 = r13
            r2 = r1
            r3 = r2
            r0 = 0
        Lb6:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lfb
            r4.<init>()     // Catch: java.lang.Throwable -> Lfb
            java.lang.String r5 = "type"
            r4.put(r5, r0)     // Catch: java.lang.Throwable -> Ld7
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> Ld7
            if (r0 != 0) goto Ld9
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Ld7
            if (r0 != 0) goto Ld9
            java.lang.String r0 = "wifi_ssid"
            r4.put(r0, r3)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r0 = "wifi_bssid"
            r4.put(r0, r1)     // Catch: java.lang.Throwable -> Ld7
            goto Ld9
        Ld7:
            goto Lf9
        Ld9:
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Throwable -> Ld7
            if (r0 != 0) goto Lef
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Ld7
            if (r0 != 0) goto Lef
            java.lang.String r0 = "mobile_type"
            r4.put(r0, r13)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r13 = "mobile_carrier"
            r4.put(r13, r2)     // Catch: java.lang.Throwable -> Ld7
        Lef:
            java.lang.String r13 = "systemtime"
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Ld7
            r4.put(r13, r0)     // Catch: java.lang.Throwable -> Ld7
            goto Lfd
        Lf9:
            r8 = r4
            goto Lfc
        Lfb:
        Lfc:
            r4 = r8
        Lfd:
            if (r4 == 0) goto L112
            r4.toString()     // Catch: java.lang.Throwable -> L112
            com.uyumao.l r13 = com.uyumao.l.a()     // Catch: java.lang.Throwable -> L112
            java.util.concurrent.ExecutorService r13 = r13.b()     // Catch: java.lang.Throwable -> L112
            com.uyumao.h$a r0 = new com.uyumao.h$a     // Catch: java.lang.Throwable -> L112
            r0.<init>(r11, r12, r4)     // Catch: java.lang.Throwable -> L112
            r13.execute(r0)     // Catch: java.lang.Throwable -> L112
        L112:
            return
    }
}
