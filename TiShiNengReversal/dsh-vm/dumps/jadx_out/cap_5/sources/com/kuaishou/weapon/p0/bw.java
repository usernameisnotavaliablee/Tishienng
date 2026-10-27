package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class bw {
    private static final byte[] d = null;
    private android.content.Context a;
    private boolean b;
    private int c;

    static {
            r0 = 0
            byte[] r0 = new byte[r0]
            com.kuaishou.weapon.p0.bw.d = r0
            return
    }

    public bw(android.content.Context r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r2
            return
    }

    public java.lang.String a(java.lang.String r5) {
            r4 = this;
            r0 = 0
            byte[] r1 = com.kuaishou.weapon.p0.bw.d     // Catch: java.lang.Throwable -> L2c
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L2c
            com.kuaishou.weapon.p0.cm r2 = new com.kuaishou.weapon.p0.cm     // Catch: java.lang.Throwable -> L15
            java.lang.String r3 = com.kuaishou.weapon.p0.ck.l     // Catch: java.lang.Throwable -> L15
            r2.<init>(r5, r3)     // Catch: java.lang.Throwable -> L15
            android.content.Context r5 = r4.a     // Catch: java.lang.Throwable -> L15
            org.json.JSONObject r5 = r2.a(r5)     // Catch: java.lang.Throwable -> L15
            if (r5 != 0) goto L17
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            return r0
        L15:
            r5 = move-exception
            goto L2a
        L17:
            org.json.JSONObject r2 = r4.a()     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L1f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            return r0
        L1f:
            java.lang.String r3 = "module_section"
            r5.put(r3, r2)     // Catch: java.lang.Throwable -> L15
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L15
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            return r5
        L2a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            throw r5     // Catch: java.lang.Throwable -> L2c
        L2c:
            return r0
    }

    public org.json.JSONObject a() {
            r17 = this;
            r0 = r17
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L50
            r2.<init>()     // Catch: java.lang.Throwable -> L50
            android.content.Context r3 = r0.a     // Catch: java.lang.Throwable -> L50
            java.lang.String r4 = "re_po_rt"
            com.kuaishou.weapon.p0.h r3 = com.kuaishou.weapon.p0.h.a(r3, r4)     // Catch: java.lang.Throwable -> L50
            java.lang.String r4 = "a1_p_s_p_s"
            boolean r4 = r3.e(r4)     // Catch: java.lang.Throwable -> L50
            java.lang.String r5 = "a1_p_s_p_s_c_b"
            boolean r5 = r3.e(r5)     // Catch: java.lang.Throwable -> L50
            java.lang.String r6 = "11006"
            r2.put(r6, r4)     // Catch: java.lang.Throwable -> L50
            java.lang.String r6 = "11029"
            r2.put(r6, r5)     // Catch: java.lang.Throwable -> L50
            java.lang.String r6 = "plc001_c_ccl_ie"
            r7 = 1
            int r6 = r3.b(r6, r7)     // Catch: java.lang.Throwable -> L50
            java.lang.String r8 = "RISK"
            if (r6 != r7) goto L9e
            if (r4 != 0) goto L34
            if (r5 == 0) goto L9e
        L34:
            android.content.Context r6 = r0.a     // Catch: java.lang.Throwable -> L50
            java.lang.String r6 = com.kuaishou.weapon.p0.bh.a(r6)     // Catch: java.lang.Throwable -> L50
            boolean r9 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L50
            if (r9 != 0) goto L54
            boolean r9 = r6.startsWith(r8)     // Catch: java.lang.Throwable -> L50
            if (r9 != 0) goto L54
            java.lang.String r9 = "01001"
            java.lang.String r6 = com.kuaishou.weapon.p0.f.a(r6)     // Catch: java.lang.Throwable -> L50
            r2.put(r9, r6)     // Catch: java.lang.Throwable -> L50
            goto L54
        L50:
            r16 = 0
            goto L57d
        L54:
            android.content.Context r6 = r0.a     // Catch: java.lang.Throwable -> L50
            java.lang.String r6 = com.kuaishou.weapon.p0.bh.c(r6)     // Catch: java.lang.Throwable -> L50
            boolean r9 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L50
            if (r9 != 0) goto L6b
            boolean r9 = r6.startsWith(r8)     // Catch: java.lang.Throwable -> L50
            if (r9 != 0) goto L6b
            java.lang.String r9 = "01003"
            r2.put(r9, r6)     // Catch: java.lang.Throwable -> L50
        L6b:
            android.content.Context r6 = r0.a     // Catch: java.lang.Throwable -> L50
            r9 = 0
            java.lang.String r6 = com.kuaishou.weapon.p0.bh.b(r6, r9)     // Catch: java.lang.Throwable -> L50
            boolean r9 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L50
            if (r9 != 0) goto L83
            boolean r9 = r6.startsWith(r8)     // Catch: java.lang.Throwable -> L50
            if (r9 != 0) goto L83
            java.lang.String r9 = "01019"
            r2.put(r9, r6)     // Catch: java.lang.Throwable -> L50
        L83:
            android.content.Context r6 = r0.a     // Catch: java.lang.Throwable -> L50
            java.lang.String r6 = com.kuaishou.weapon.p0.bh.b(r6, r7)     // Catch: java.lang.Throwable -> L50
            boolean r9 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L50
            if (r9 != 0) goto L9e
            boolean r9 = r6.startsWith(r8)     // Catch: java.lang.Throwable -> L50
            if (r9 != 0) goto L9e
            java.lang.String r9 = "01004"
            java.lang.String r6 = com.kuaishou.weapon.p0.f.a(r6)     // Catch: java.lang.Throwable -> L50
            r2.put(r9, r6)     // Catch: java.lang.Throwable -> L50
        L9e:
            java.lang.String r6 = "plc001_c_ccl_d"
            int r6 = r3.b(r6, r7)     // Catch: java.lang.Throwable -> L50
            if (r6 != r7) goto Lc1
            if (r4 != 0) goto Laa
            if (r5 == 0) goto Lc1
        Laa:
            android.content.Context r9 = r0.a     // Catch: java.lang.Throwable -> L50
            java.lang.String r9 = com.kuaishou.weapon.p0.bh.f(r9)     // Catch: java.lang.Throwable -> L50
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L50
            if (r10 != 0) goto Lc1
            boolean r10 = r9.startsWith(r8)     // Catch: java.lang.Throwable -> L50
            if (r10 != 0) goto Lc1
            java.lang.String r10 = "01013"
            r2.put(r10, r9)     // Catch: java.lang.Throwable -> L50
        Lc1:
            java.lang.String r9 = "plc001_c_ccl_is"
            int r9 = r3.b(r9, r7)     // Catch: java.lang.Throwable -> L50
            if (r9 != r7) goto Le4
            if (r4 != 0) goto Lcd
            if (r5 == 0) goto Le4
        Lcd:
            android.content.Context r9 = r0.a     // Catch: java.lang.Throwable -> L50
            java.lang.String r9 = com.kuaishou.weapon.p0.bh.d(r9)     // Catch: java.lang.Throwable -> L50
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L50
            if (r10 != 0) goto Le4
            boolean r10 = r9.startsWith(r8)     // Catch: java.lang.Throwable -> L50
            if (r10 != 0) goto Le4
            java.lang.String r10 = "01007"
            r2.put(r10, r9)     // Catch: java.lang.Throwable -> L50
        Le4:
            java.lang.String r9 = "plc001_c_ccl_ic"
            int r9 = r3.b(r9, r7)     // Catch: java.lang.Throwable -> L50
            if (r9 != r7) goto Lfb
            if (r4 != 0) goto Lf0
            if (r5 == 0) goto Lfb
        Lf0:
            java.lang.String r9 = "01011"
            android.content.Context r10 = r0.a     // Catch: java.lang.Throwable -> L50
            java.lang.String r10 = com.kuaishou.weapon.p0.bh.e(r10)     // Catch: java.lang.Throwable -> L50
            r2.put(r9, r10)     // Catch: java.lang.Throwable -> L50
        Lfb:
            java.lang.String r9 = ""
            if (r4 != 0) goto L101
            if (r5 == 0) goto L129
        L101:
            java.lang.String r10 = com.kuaishou.weapon.p0.bh.h()     // Catch: java.lang.Throwable -> L50
            boolean r11 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> L50
            java.lang.String r12 = "07005"
            if (r11 != 0) goto L117
            boolean r11 = r10.startsWith(r8)     // Catch: java.lang.Throwable -> L50
            if (r11 != 0) goto L117
            r2.put(r12, r10)     // Catch: java.lang.Throwable -> L50
            goto L120
        L117:
            if (r10 != 0) goto L11d
            r2.put(r12, r9)     // Catch: java.lang.Throwable -> L50
            goto L120
        L11d:
            r2.put(r12, r10)     // Catch: java.lang.Throwable -> L50
        L120:
            java.lang.String r10 = "07006"
            java.lang.String r11 = com.kuaishou.weapon.p0.bh.g()     // Catch: java.lang.Throwable -> L50
            r2.put(r10, r11)     // Catch: java.lang.Throwable -> L50
        L129:
            java.lang.String r10 = "plc001_c_ccl_btm"
            int r3 = r3.b(r10, r7)     // Catch: java.lang.Throwable -> L50
            if (r3 != r7) goto L14c
            if (r4 != 0) goto L135
            if (r5 == 0) goto L14c
        L135:
            android.content.Context r3 = r0.a     // Catch: java.lang.Throwable -> L50
            java.lang.String r3 = com.kuaishou.weapon.p0.bh.p(r3)     // Catch: java.lang.Throwable -> L50
            boolean r10 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L50
            if (r10 != 0) goto L14c
            boolean r8 = r3.startsWith(r8)     // Catch: java.lang.Throwable -> L50
            if (r8 != 0) goto L14c
            java.lang.String r8 = "01016"
            r2.put(r8, r3)     // Catch: java.lang.Throwable -> L50
        L14c:
            if (r4 != 0) goto L150
            if (r5 == 0) goto L184
        L150:
            double r3 = com.kuaishou.weapon.p0.bh.b()     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L184
            r10 = 0
            int r5 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r5 <= 0) goto L16b
            java.lang.String r5 = "09002"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L184
            r8.<init>()     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L184
            r8.append(r3)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L184
            java.lang.String r3 = r8.toString()     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L184
            r2.put(r5, r3)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L184
        L16b:
            double r3 = com.kuaishou.weapon.p0.bh.c()     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L184
            int r5 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r5 <= 0) goto L184
            java.lang.String r5 = "09003"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L184
            r8.<init>()     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L184
            r8.append(r3)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L184
            java.lang.String r3 = r8.toString()     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L184
            r2.put(r5, r3)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L184
        L184:
            java.lang.String r3 = "11013"
            android.content.Context r4 = r0.a     // Catch: java.lang.Throwable -> L50
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L50
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)     // Catch: java.lang.Throwable -> L50
            java.lang.String r4 = com.kuaishou.weapon.p0.bx.a(r4)     // Catch: java.lang.Throwable -> L50
            r5 = 2
            int r4 = java.lang.Integer.parseInt(r4, r5)     // Catch: java.lang.Throwable -> L50
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L50
            java.lang.String r3 = "11012"
            android.content.Context r4 = r0.a     // Catch: java.lang.Throwable -> L50
            java.lang.String r4 = com.kuaishou.weapon.p0.bx.b(r4)     // Catch: java.lang.Throwable -> L50
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L50
            java.lang.String r3 = "11202"
            com.kwad.sdk.e.b r4 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L371
            java.lang.String r4 = r4.Md()     // Catch: java.lang.Throwable -> L371
            int r4 = com.kuaishou.weapon.p0.bh.b(r4)     // Catch: java.lang.Throwable -> L371
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L371
            java.lang.String r3 = "11204"
            com.kwad.sdk.e.b r4 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L371
            java.lang.String r4 = r4.Mk()     // Catch: java.lang.Throwable -> L371
            int r4 = com.kuaishou.weapon.p0.bh.b(r4)     // Catch: java.lang.Throwable -> L371
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L371
            java.lang.String r3 = "11205"
            com.kwad.sdk.e.b r4 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L371
            java.lang.String r4 = r4.getDeviceId()     // Catch: java.lang.Throwable -> L371
            int r4 = com.kuaishou.weapon.p0.bh.b(r4)     // Catch: java.lang.Throwable -> L371
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L371
            java.lang.String r3 = "11206"
            com.kwad.sdk.e.b r4 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L371
            java.lang.String r4 = r4.getIccId()     // Catch: java.lang.Throwable -> L371
            int r4 = com.kuaishou.weapon.p0.bh.b(r4)     // Catch: java.lang.Throwable -> L371
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L371
            java.lang.String r3 = "11207"
            com.kwad.sdk.e.b r4 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L371
            java.lang.String r4 = r4.Mc()     // Catch: java.lang.Throwable -> L371
            int r4 = com.kuaishou.weapon.p0.bh.b(r4)     // Catch: java.lang.Throwable -> L371
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L371
            java.lang.String r3 = "11208"
            com.kwad.sdk.e.b r4 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L371
            java.lang.String r4 = r4.Mf()     // Catch: java.lang.Throwable -> L371
            int r4 = com.kuaishou.weapon.p0.bh.b(r4)     // Catch: java.lang.Throwable -> L371
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L371
            java.lang.String r3 = "11209"
            com.kwad.sdk.e.b r4 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L371
            java.lang.String r4 = r4.Mg()     // Catch: java.lang.Throwable -> L371
            int r4 = com.kuaishou.weapon.p0.bh.b(r4)     // Catch: java.lang.Throwable -> L371
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L371
            java.lang.String r3 = "11210"
            com.kwad.sdk.e.b r4 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L371
            java.lang.String r4 = r4.Mh()     // Catch: java.lang.Throwable -> L371
            int r4 = com.kuaishou.weapon.p0.bh.b(r4)     // Catch: java.lang.Throwable -> L371
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L371
            java.lang.String r3 = "11211"
            com.kwad.sdk.e.b r4 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L371
            java.lang.String r4 = r4.getIp()     // Catch: java.lang.Throwable -> L371
            int r4 = com.kuaishou.weapon.p0.bh.b(r4)     // Catch: java.lang.Throwable -> L371
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L371
            java.lang.String r3 = "11212"
            com.kwad.sdk.e.b r4 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L371
            java.lang.String r4 = r4.getLocation()     // Catch: java.lang.Throwable -> L371
            int r4 = com.kuaishou.weapon.p0.bh.b(r4)     // Catch: java.lang.Throwable -> L371
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L371
            java.lang.String r3 = "11213"
            com.kwad.sdk.e.b r4 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L371
            java.lang.String r4 = r4.getOaid()     // Catch: java.lang.Throwable -> L371
            int r4 = com.kuaishou.weapon.p0.bh.b(r4)     // Catch: java.lang.Throwable -> L371
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L371
            java.lang.String r3 = "11214"
            com.kwad.sdk.e.b r4 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L371
            java.lang.String r4 = r4.Me()     // Catch: java.lang.Throwable -> L371
            int r4 = com.kuaishou.weapon.p0.bh.b(r4)     // Catch: java.lang.Throwable -> L371
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L371
            java.lang.String r3 = "11215"
            com.kwad.sdk.e.b r4 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L371
            java.lang.String r4 = r4.Mj()     // Catch: java.lang.Throwable -> L371
            int r4 = com.kuaishou.weapon.p0.bh.b(r4)     // Catch: java.lang.Throwable -> L371
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L371
            java.lang.String r3 = "11216"
            com.kwad.sdk.e.b r4 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L371
            java.lang.String r4 = r4.Mi()     // Catch: java.lang.Throwable -> L371
            int r4 = com.kuaishou.weapon.p0.bh.b(r4)     // Catch: java.lang.Throwable -> L371
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L371
            java.lang.String r3 = "11301"
            com.kwad.sdk.e.b r4 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L371
            java.lang.String r4 = r4.Mn()     // Catch: java.lang.Throwable -> L371
            java.lang.String r4 = com.kuaishou.weapon.p0.bh.c(r4)     // Catch: java.lang.Throwable -> L371
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L371
            java.lang.String r3 = "11302"
            com.kwad.sdk.e.b r4 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L371
            java.lang.String r4 = r4.getSdkVersion()     // Catch: java.lang.Throwable -> L371
            java.lang.String r4 = com.kuaishou.weapon.p0.bh.c(r4)     // Catch: java.lang.Throwable -> L371
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L371
            java.lang.String r3 = "11303"
            com.kwad.sdk.e.b r4 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L371
            java.lang.String r4 = r4.getAppId()     // Catch: java.lang.Throwable -> L371
            java.lang.String r4 = com.kuaishou.weapon.p0.bh.c(r4)     // Catch: java.lang.Throwable -> L371
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L371
            java.lang.String r3 = "11104"
            com.kwad.sdk.e.b r4 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L371
            java.lang.String r4 = r4.Mk()     // Catch: java.lang.Throwable -> L371
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L371
            java.lang.String r3 = "11105"
            com.kwad.sdk.e.b r4 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L371
            java.lang.String r4 = r4.getDeviceId()     // Catch: java.lang.Throwable -> L371
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L371
            java.lang.String r3 = "11106"
            com.kwad.sdk.e.b r4 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L371
            java.lang.String r4 = r4.getIccId()     // Catch: java.lang.Throwable -> L371
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L371
            java.lang.String r3 = "11107"
            com.kwad.sdk.e.b r4 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L371
            java.lang.String r4 = r4.Mc()     // Catch: java.lang.Throwable -> L371
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L371
            java.lang.String r3 = "11108"
            com.kwad.sdk.e.b r4 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L371
            java.lang.String r4 = r4.Mf()     // Catch: java.lang.Throwable -> L371
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L371
            java.lang.String r3 = "11109"
            com.kwad.sdk.e.b r4 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L371
            java.lang.String r4 = r4.Mg()     // Catch: java.lang.Throwable -> L371
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L371
            java.lang.String r3 = "11110"
            com.kwad.sdk.e.b r4 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L371
            java.lang.String r4 = r4.Mh()     // Catch: java.lang.Throwable -> L371
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L371
            java.lang.String r3 = "11111"
            com.kwad.sdk.e.b r4 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L371
            java.lang.String r4 = r4.getIp()     // Catch: java.lang.Throwable -> L371
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L371
            java.lang.String r3 = "11112"
            com.kwad.sdk.e.b r4 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L371
            java.lang.String r4 = r4.getLocation()     // Catch: java.lang.Throwable -> L371
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L371
            java.lang.String r3 = "11113"
            com.kwad.sdk.e.b r4 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L371
            java.lang.String r4 = r4.getOaid()     // Catch: java.lang.Throwable -> L371
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L371
            java.lang.String r3 = "11114"
            com.kwad.sdk.e.b r4 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L371
            java.lang.String r4 = r4.Me()     // Catch: java.lang.Throwable -> L371
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L371
            java.lang.String r3 = "11115"
            com.kwad.sdk.e.b r4 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L371
            java.lang.String r4 = r4.Mj()     // Catch: java.lang.Throwable -> L371
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L371
            java.lang.String r3 = "11116"
            com.kwad.sdk.e.b r4 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L371
            java.lang.String r4 = r4.Mi()     // Catch: java.lang.Throwable -> L371
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L371
        L371:
            android.content.Context r3 = r0.a     // Catch: java.lang.Throwable -> L50
            java.lang.String r3 = com.kuaishou.weapon.p0.bh.w(r3)     // Catch: java.lang.Throwable -> L50
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L50
            if (r4 != 0) goto L382
            java.lang.String r4 = "01026"
            r2.put(r4, r3)     // Catch: java.lang.Throwable -> L50
        L382:
            if (r6 != r7) goto L556
            android.content.Context r3 = r0.a     // Catch: java.lang.Throwable -> L392
            org.json.JSONObject r3 = com.kuaishou.weapon.p0.ai.a(r3)     // Catch: java.lang.Throwable -> L392
            if (r3 == 0) goto L396
            java.lang.String r4 = "11015"
            r2.put(r4, r3)     // Catch: java.lang.Throwable -> L392
            goto L396
        L392:
            r16 = 0
            goto L555
        L396:
            boolean r3 = com.kuaishou.weapon.p0.jni.Engine.loadSuccess     // Catch: java.lang.Throwable -> L392
            java.lang.String r4 = "02016"
            java.lang.String r5 = "02013"
            java.lang.String r6 = "02018"
            java.lang.String r8 = "02005"
            java.lang.String r10 = "02004"
            java.lang.String r11 = "02006"
            java.lang.String r12 = "02007"
            java.lang.String r13 = "02003"
            java.lang.String r14 = "02002"
            java.lang.String r15 = "02001"
            if (r3 == 0) goto L46c
            com.kuaishou.weapon.p0.ce r3 = new com.kuaishou.weapon.p0.ce     // Catch: java.lang.Throwable -> L392
            r16 = 0
            android.content.Context r1 = r0.a     // Catch: java.lang.Throwable -> L555
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L555
            java.lang.String r1 = r3.a(r15)     // Catch: java.lang.Throwable -> L555
            if (r1 == 0) goto L3c2
            java.lang.String r1 = r3.a(r15)     // Catch: java.lang.Throwable -> L555
            goto L3c6
        L3c2:
            java.lang.String r1 = com.kuaishou.weapon.p0.bl.a()     // Catch: java.lang.Throwable -> L555
        L3c6:
            r2.put(r15, r1)     // Catch: java.lang.Throwable -> L555
            java.lang.String r1 = r3.a(r14)     // Catch: java.lang.Throwable -> L555
            if (r1 == 0) goto L3d4
            java.lang.String r1 = r3.a(r14)     // Catch: java.lang.Throwable -> L555
            goto L3d8
        L3d4:
            java.lang.String r1 = com.kuaishou.weapon.p0.bl.b()     // Catch: java.lang.Throwable -> L555
        L3d8:
            r2.put(r14, r1)     // Catch: java.lang.Throwable -> L555
            java.lang.String r1 = r3.a(r13)     // Catch: java.lang.Throwable -> L555
            if (r1 == 0) goto L3e6
            java.lang.String r1 = r3.a(r13)     // Catch: java.lang.Throwable -> L555
            goto L3ea
        L3e6:
            java.lang.String r1 = com.kuaishou.weapon.p0.bl.c()     // Catch: java.lang.Throwable -> L555
        L3ea:
            r2.put(r13, r1)     // Catch: java.lang.Throwable -> L555
            java.lang.String r1 = r3.a(r12)     // Catch: java.lang.Throwable -> L555
            if (r1 == 0) goto L3f8
            java.lang.String r1 = r3.a(r12)     // Catch: java.lang.Throwable -> L555
            goto L3fc
        L3f8:
            java.lang.String r1 = com.kuaishou.weapon.p0.bl.g()     // Catch: java.lang.Throwable -> L555
        L3fc:
            r2.put(r12, r1)     // Catch: java.lang.Throwable -> L555
            java.lang.String r1 = r3.a(r11)     // Catch: java.lang.Throwable -> L555
            if (r1 == 0) goto L40a
            java.lang.String r1 = r3.a(r11)     // Catch: java.lang.Throwable -> L555
            goto L40e
        L40a:
            java.lang.String r1 = com.kuaishou.weapon.p0.bl.f()     // Catch: java.lang.Throwable -> L555
        L40e:
            r2.put(r11, r1)     // Catch: java.lang.Throwable -> L555
            java.lang.String r1 = r3.a(r10)     // Catch: java.lang.Throwable -> L555
            if (r1 == 0) goto L41c
            java.lang.String r1 = r3.a(r10)     // Catch: java.lang.Throwable -> L555
            goto L420
        L41c:
            java.lang.String r1 = com.kuaishou.weapon.p0.bl.d()     // Catch: java.lang.Throwable -> L555
        L420:
            r2.put(r10, r1)     // Catch: java.lang.Throwable -> L555
            java.lang.String r1 = r3.a(r8)     // Catch: java.lang.Throwable -> L555
            if (r1 == 0) goto L42e
            java.lang.String r1 = r3.a(r8)     // Catch: java.lang.Throwable -> L555
            goto L432
        L42e:
            java.lang.String r1 = com.kuaishou.weapon.p0.bl.e()     // Catch: java.lang.Throwable -> L555
        L432:
            r2.put(r8, r1)     // Catch: java.lang.Throwable -> L555
            java.lang.String r1 = r3.a(r6)     // Catch: java.lang.Throwable -> L555
            if (r1 == 0) goto L440
            java.lang.String r1 = r3.a(r6)     // Catch: java.lang.Throwable -> L555
            goto L444
        L440:
            java.lang.String r1 = com.kuaishou.weapon.p0.bl.s()     // Catch: java.lang.Throwable -> L555
        L444:
            r2.put(r6, r1)     // Catch: java.lang.Throwable -> L555
            java.lang.String r1 = r3.a(r5)     // Catch: java.lang.Throwable -> L555
            if (r1 == 0) goto L452
            java.lang.String r1 = r3.a(r5)     // Catch: java.lang.Throwable -> L555
            goto L456
        L452:
            java.lang.String r1 = com.kuaishou.weapon.p0.bl.m()     // Catch: java.lang.Throwable -> L555
        L456:
            r2.put(r5, r1)     // Catch: java.lang.Throwable -> L555
            java.lang.String r1 = r3.a(r4)     // Catch: java.lang.Throwable -> L555
            if (r1 == 0) goto L464
            java.lang.String r1 = r3.a(r4)     // Catch: java.lang.Throwable -> L555
            goto L468
        L464:
            java.lang.String r1 = com.kuaishou.weapon.p0.bl.q()     // Catch: java.lang.Throwable -> L555
        L468:
            r2.put(r4, r1)     // Catch: java.lang.Throwable -> L555
            goto L4b4
        L46c:
            r16 = 0
            java.lang.String r1 = com.kuaishou.weapon.p0.bl.a()     // Catch: java.lang.Throwable -> L555
            r2.put(r15, r1)     // Catch: java.lang.Throwable -> L555
            java.lang.String r1 = com.kuaishou.weapon.p0.bl.b()     // Catch: java.lang.Throwable -> L555
            r2.put(r14, r1)     // Catch: java.lang.Throwable -> L555
            java.lang.String r1 = com.kuaishou.weapon.p0.bl.c()     // Catch: java.lang.Throwable -> L555
            r2.put(r13, r1)     // Catch: java.lang.Throwable -> L555
            java.lang.String r1 = com.kuaishou.weapon.p0.bl.d()     // Catch: java.lang.Throwable -> L555
            r2.put(r10, r1)     // Catch: java.lang.Throwable -> L555
            java.lang.String r1 = com.kuaishou.weapon.p0.bl.e()     // Catch: java.lang.Throwable -> L555
            r2.put(r8, r1)     // Catch: java.lang.Throwable -> L555
            java.lang.String r1 = com.kuaishou.weapon.p0.bl.f()     // Catch: java.lang.Throwable -> L555
            r2.put(r11, r1)     // Catch: java.lang.Throwable -> L555
            java.lang.String r1 = com.kuaishou.weapon.p0.bl.g()     // Catch: java.lang.Throwable -> L555
            r2.put(r12, r1)     // Catch: java.lang.Throwable -> L555
            java.lang.String r1 = com.kuaishou.weapon.p0.bl.s()     // Catch: java.lang.Throwable -> L555
            r2.put(r6, r1)     // Catch: java.lang.Throwable -> L555
            java.lang.String r1 = com.kuaishou.weapon.p0.bl.m()     // Catch: java.lang.Throwable -> L555
            r2.put(r5, r1)     // Catch: java.lang.Throwable -> L555
            java.lang.String r1 = com.kuaishou.weapon.p0.bl.q()     // Catch: java.lang.Throwable -> L555
            r2.put(r4, r1)     // Catch: java.lang.Throwable -> L555
        L4b4:
            java.lang.String r1 = "02021"
            android.content.Context r3 = r0.a     // Catch: java.lang.Throwable -> L555
            java.lang.String r3 = com.kuaishou.weapon.p0.bl.d(r3)     // Catch: java.lang.Throwable -> L555
            r2.put(r1, r3)     // Catch: java.lang.Throwable -> L555
            java.lang.String r1 = "02022"
            android.content.Context r3 = r0.a     // Catch: java.lang.Throwable -> L555
            java.lang.String r3 = com.kuaishou.weapon.p0.bl.c(r3)     // Catch: java.lang.Throwable -> L555
            r2.put(r1, r3)     // Catch: java.lang.Throwable -> L555
            java.lang.String r1 = "02044"
            java.lang.String r3 = com.kuaishou.weapon.p0.bl.t()     // Catch: java.lang.Throwable -> L555
            r2.put(r1, r3)     // Catch: java.lang.Throwable -> L555
            java.lang.String r1 = "11009"
            android.content.Context r3 = r0.a     // Catch: java.lang.Throwable -> L555
            android.content.Context r3 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L555
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)     // Catch: java.lang.Throwable -> L555
            java.lang.String r3 = com.kuaishou.weapon.p0.bs.a(r3)     // Catch: java.lang.Throwable -> L555
            r2.put(r1, r3)     // Catch: java.lang.Throwable -> L555
            boolean r1 = com.kuaishou.weapon.p0.jni.Engine.loadSuccess     // Catch: java.lang.Throwable -> L555
            java.lang.String r3 = "04004"
            java.lang.String r4 = "04003"
            java.lang.String r5 = "04002"
            java.lang.String r6 = "04001"
            if (r1 == 0) goto L534
            com.kuaishou.weapon.p0.bz r1 = new com.kuaishou.weapon.p0.bz     // Catch: java.lang.Throwable -> L555
            android.content.Context r8 = r0.a     // Catch: java.lang.Throwable -> L555
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L555
            java.lang.String r8 = r1.a(r6)     // Catch: java.lang.Throwable -> L555
            if (r8 == 0) goto L504
            java.lang.String r8 = r1.a(r6)     // Catch: java.lang.Throwable -> L555
            goto L505
        L504:
            r8 = r9
        L505:
            r2.put(r6, r8)     // Catch: java.lang.Throwable -> L555
            java.lang.String r6 = r1.a(r5)     // Catch: java.lang.Throwable -> L555
            if (r6 == 0) goto L513
            java.lang.String r6 = r1.a(r5)     // Catch: java.lang.Throwable -> L555
            goto L514
        L513:
            r6 = r9
        L514:
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L555
            java.lang.String r5 = r1.a(r4)     // Catch: java.lang.Throwable -> L555
            if (r5 == 0) goto L522
            java.lang.String r5 = r1.a(r4)     // Catch: java.lang.Throwable -> L555
            goto L523
        L522:
            r5 = r9
        L523:
            r2.put(r4, r5)     // Catch: java.lang.Throwable -> L555
            java.lang.String r4 = r1.a(r3)     // Catch: java.lang.Throwable -> L555
            if (r4 == 0) goto L530
            java.lang.String r9 = r1.a(r3)     // Catch: java.lang.Throwable -> L555
        L530:
            r2.put(r3, r9)     // Catch: java.lang.Throwable -> L555
            goto L558
        L534:
            com.kuaishou.weapon.p0.bj r1 = com.kuaishou.weapon.p0.bk.b()     // Catch: java.lang.Throwable -> L555 java.lang.Exception -> L558
            java.lang.String r8 = com.kuaishou.weapon.p0.bk.a()     // Catch: java.lang.Throwable -> L555 java.lang.Exception -> L558
            r2.put(r6, r8)     // Catch: java.lang.Throwable -> L555 java.lang.Exception -> L558
            java.lang.String r6 = r1.b()     // Catch: java.lang.Throwable -> L555 java.lang.Exception -> L558
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L555 java.lang.Exception -> L558
            java.lang.String r5 = r1.c()     // Catch: java.lang.Throwable -> L555 java.lang.Exception -> L558
            r2.put(r4, r5)     // Catch: java.lang.Throwable -> L555 java.lang.Exception -> L558
            int r1 = r1.a()     // Catch: java.lang.Throwable -> L555 java.lang.Exception -> L558
            r2.put(r3, r1)     // Catch: java.lang.Throwable -> L555 java.lang.Exception -> L558
            goto L558
        L555:
            return r16
        L556:
            r16 = 0
        L558:
            boolean r1 = r0.b     // Catch: java.lang.Throwable -> L57d
            if (r1 == 0) goto L561
            java.lang.String r1 = "20004"
            r2.put(r1, r7)     // Catch: java.lang.Throwable -> L57d
        L561:
            java.lang.String r1 = "11017"
            java.lang.String r3 = r2.toString()     // Catch: java.lang.Throwable -> L57d
            int r3 = r3.length()     // Catch: java.lang.Throwable -> L57d
            r2.put(r1, r3)     // Catch: java.lang.Throwable -> L57d
            java.lang.String r1 = "20000"
            int r3 = r0.c     // Catch: java.lang.Throwable -> L57d
            r2.put(r1, r3)     // Catch: java.lang.Throwable -> L57d
            java.lang.String r1 = "11028"
            java.lang.String r3 = com.kuaishou.weapon.p0.WeaponHI.sKSSdkver     // Catch: java.lang.Throwable -> L57d
            r2.put(r1, r3)     // Catch: java.lang.Throwable -> L57d
            return r2
        L57d:
            return r16
    }
}
