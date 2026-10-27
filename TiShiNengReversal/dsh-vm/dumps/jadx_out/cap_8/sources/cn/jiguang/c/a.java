package cn.jiguang.c;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a extends cn.jiguang.api.JDispatchAction {
    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    private static org.json.JSONObject a(java.nio.ByteBuffer r4) {
            java.lang.String r0 = "JCoreDispatchAction"
            r1 = 0
            if (r4 != 0) goto L6
            return r1
        L6:
            byte[] r4 = r4.array()     // Catch: java.lang.Exception -> L3b
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4)     // Catch: java.lang.Exception -> L3b
            r4.getLong()     // Catch: java.lang.Exception -> L3b
            short r2 = r4.getShort()     // Catch: java.lang.Exception -> L3b
            byte[] r2 = new byte[r2]     // Catch: java.lang.Exception -> L3b
            r4.get(r2)     // Catch: java.lang.Exception -> L3b
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Exception -> L3b
            java.lang.String r3 = "UTF-8"
            r4.<init>(r2, r3)     // Catch: java.lang.Exception -> L3b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3b
            r2.<init>()     // Catch: java.lang.Exception -> L3b
            java.lang.String r3 = "parseBundle2Json content: "
            r2.append(r3)     // Catch: java.lang.Exception -> L3b
            r2.append(r4)     // Catch: java.lang.Exception -> L3b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L3b
            cn.jiguang.w.f.c(r0, r2)     // Catch: java.lang.Exception -> L3b
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L3b
            r2.<init>(r4)     // Catch: java.lang.Exception -> L3b
            return r2
        L3b:
            r4 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "parseBundle2Json exception:"
            r2.append(r3)
            java.lang.String r4 = r4.getMessage()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            cn.jiguang.w.f.i(r0, r4)
            return r1
    }

    private void a(android.content.Context r2, long r3, int r5, java.nio.ByteBuffer r6) {
            r1 = this;
            r0 = 19
            if (r5 == r0) goto L31
            r0 = 41
            if (r5 == r0) goto L2d
            r0 = 25
            if (r5 == r0) goto L29
            r0 = 26
            if (r5 == r0) goto L11
            goto L28
        L11:
            if (r6 == 0) goto L28
            short r5 = r6.getShort()
            if (r5 != 0) goto L21
            cn.jiguang.ad.j r5 = cn.jiguang.ad.j.a()
            r5.a(r2, r3)
            return
        L21:
            cn.jiguang.ad.j r6 = cn.jiguang.ad.j.a()
            r6.a(r2, r3, r5)
        L28:
            return
        L29:
            r1.a(r2, r6)
            return
        L2d:
            r1.b(r2, r6)
            return
        L31:
            cn.jiguang.ad.g r3 = cn.jiguang.ad.g.a()
            java.lang.String r4 = "tcp_a18"
            r5 = 0
            r3.a(r2, r4, r5)
            return
    }

    private void a(android.content.Context r5, android.os.Bundle r6) {
            r4 = this;
            java.lang.String r0 = "e_l"
            java.lang.String r1 = "JCoreDispatchAction"
            if (r6 == 0) goto L62
            java.lang.String r2 = "aes"
            java.lang.String r6 = r6.getString(r2)     // Catch: java.lang.Throwable -> L62
            java.lang.String r2 = cn.jiguang.a.a.f243j     // Catch: java.lang.Throwable -> L62
            java.lang.String r6 = cn.jiguang.av.t.b(r6, r2)     // Catch: java.lang.Throwable -> L62
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L62
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L62
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
            r6.<init>()     // Catch: java.lang.Throwable -> L62
            java.lang.String r3 = "jsonObject="
            r6.append(r3)     // Catch: java.lang.Throwable -> L62
            r6.append(r2)     // Catch: java.lang.Throwable -> L62
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L62
            cn.jiguang.w.f.c(r1, r6)     // Catch: java.lang.Throwable -> L62
            cn.jiguang.d.a.a(r5, r2)     // Catch: java.lang.Throwable -> L62
            java.lang.String r6 = "u_l"
            boolean r6 = r2.has(r6)     // Catch: java.lang.Throwable -> L62
            if (r6 == 0) goto L3e
            java.lang.String r6 = "startUpload"
            cn.jiguang.w.f.c(r1, r6)     // Catch: java.lang.Throwable -> L62
            cn.jiguang.w.b.b(r5)     // Catch: java.lang.Throwable -> L62
        L3e:
            boolean r6 = r2.has(r0)     // Catch: java.lang.Throwable -> L62
            if (r6 == 0) goto L62
            java.lang.String r6 = "set e_l"
            cn.jiguang.w.f.c(r1, r6)     // Catch: java.lang.Throwable -> L62
            cn.jiguang.e.a r6 = cn.jiguang.e.a.ay()     // Catch: java.lang.Throwable -> L62
            boolean r0 = r2.optBoolean(r0)     // Catch: java.lang.Throwable -> L62
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L62
            cn.jiguang.e.a r6 = r6.a(r0)     // Catch: java.lang.Throwable -> L62
            r0 = 1
            cn.jiguang.e.a[] r0 = new cn.jiguang.e.a[r0]     // Catch: java.lang.Throwable -> L62
            r1 = 0
            r0[r1] = r6     // Catch: java.lang.Throwable -> L62
            cn.jiguang.e.b.a(r5, r0)     // Catch: java.lang.Throwable -> L62
        L62:
            return
    }

    private void a(android.content.Context r8, java.nio.ByteBuffer r9) {
            r7 = this;
            java.lang.String r0 = "JCoreDispatchAction"
            java.lang.String r1 = "cmd"
            org.json.JSONObject r2 = a(r9)
            if (r2 != 0) goto Lb
            return
        Lb:
            int r3 = r2.optInt(r1)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = "content"
            org.json.JSONObject r2 = r2.optJSONObject(r4)     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L1e
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L1c
            goto L20
        L1c:
            r8 = move-exception
            goto L62
        L1e:
            java.lang.String r4 = ""
        L20:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
            r5.<init>()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r6 = "deal command, cmd: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L1c
            r5.append(r3)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r6 = ", content: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L1c
            r5.append(r4)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L1c
            cn.jiguang.w.f.c(r0, r4)     // Catch: java.lang.Throwable -> L1c
            r4 = 75
            if (r3 == r4) goto L49
            r4 = 84
            if (r3 == r4) goto L45
            goto L50
        L45:
            cn.jiguang.v.l.a(r8, r2)     // Catch: java.lang.Throwable -> L1c
            goto L50
        L49:
            cn.jiguang.ad.g r3 = cn.jiguang.ad.g.a()     // Catch: java.lang.Throwable -> L1c
            r3.a(r2)     // Catch: java.lang.Throwable -> L1c
        L50:
            android.os.Bundle r2 = new android.os.Bundle     // Catch: java.lang.Throwable -> L1c
            r2.<init>()     // Catch: java.lang.Throwable -> L1c
            byte[] r9 = r9.array()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r3 = "RESPONSE_BODY"
            r2.putByteArray(r3, r9)     // Catch: java.lang.Throwable -> L1c
            cn.jiguang.i.a.a(r8, r1, r2)     // Catch: java.lang.Throwable -> L1c
            return
        L62:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = "deal command failed, "
            r9.append(r1)
            java.lang.String r8 = r8.getMessage()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            cn.jiguang.w.f.i(r0, r8)
            return
    }

    private void b(android.content.Context r4, java.nio.ByteBuffer r5) {
            r3 = this;
            java.lang.String r0 = "JCoreDispatchAction"
            if (r5 == 0) goto L21
            short r5 = r5.getShort()     // Catch: java.lang.Throwable -> L1f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f
            r1.<init>()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = "setCountry code:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L1f
            r1.append(r5)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1f
            cn.jiguang.w.f.d(r0, r1)     // Catch: java.lang.Throwable -> L1f
            if (r5 != 0) goto L2c
            return
        L1f:
            r5 = move-exception
            goto L27
        L21:
            java.lang.String r5 = "setCountry body null"
            cn.jiguang.w.f.d(r0, r5)     // Catch: java.lang.Throwable -> L1f
            goto L2c
        L27:
            java.lang.String r1 = "setCountry fail:"
            cn.jiguang.w.f.d(r0, r1, r5)
        L2c:
            cn.jiguang.ad.g r5 = cn.jiguang.ad.g.a()
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "tcp_a25"
            r5.a(r4, r1, r0)
            return
    }

    @Override // cn.jiguang.api.JDispatchAction
    public void dispatchMessage(android.content.Context r2, java.lang.String r3, int r4, int r5, long r6, long r8, java.nio.ByteBuffer r10) {
            r1 = this;
            r3 = r2
            r6 = r4
            r4 = r8
            r7 = r10
            r2 = r1
            r2.a(r3, r4, r6, r7)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r0 = move-exception
            r2 = r0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "dispatchMessage failed:"
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "JCoreDispatchAction"
            cn.jiguang.w.f.i(r3, r2)
            return
    }

    @Override // cn.jiguang.api.JDispatchAction
    public short getLogPriority(java.lang.String r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // cn.jiguang.api.JDispatchAction
    public short getLoginFlag(java.lang.String r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // cn.jiguang.api.JDispatchAction
    public short getRegFlag(java.lang.String r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // cn.jiguang.api.JDispatchAction
    public short getRegPriority(java.lang.String r1) {
            r0 = this;
            r1 = 3
            return r1
    }

    @Override // cn.jiguang.api.JDispatchAction
    public java.lang.String getReportVersionKey(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = "core_sdk_ver"
            return r1
    }

    @Override // cn.jiguang.api.JDispatchAction
    public java.lang.String getSdkVersion(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = cn.jiguang.a.a.f236c
            return r1
    }

    @Override // cn.jiguang.api.JDispatchAction
    public short getUserCtrlProperty(java.lang.String r1) {
            r0 = this;
            r1 = 6
            return r1
    }

    @Override // cn.jiguang.api.JDispatchAction
    public void handleMessage(android.content.Context r1, java.lang.String r2, java.lang.Object r3) {
            r0 = this;
            return
    }

    @Override // cn.jiguang.api.JDispatchAction
    public boolean isSupportedCMD(java.lang.String r2, int r3) {
            r1 = this;
            r2 = 1
            if (r3 == 0) goto L1b
            if (r3 == r2) goto L1b
            r0 = 19
            if (r3 == r0) goto L1b
            r0 = 25
            if (r3 == r0) goto L1b
            r0 = 26
            if (r3 == r0) goto L1b
            r0 = 30
            if (r3 == r0) goto L1b
            r0 = 32
            if (r3 != r0) goto L1a
            goto L1b
        L1a:
            r2 = 0
        L1b:
            return r2
    }

    @Override // cn.jiguang.api.JDispatchAction
    public void onActionRun(android.content.Context r10, java.lang.String r11, java.lang.String r12, android.os.Bundle r13) {
            r9 = this;
            java.lang.String r11 = "country"
            java.lang.String r0 = "onActionRun failed:"
            java.lang.String r1 = "JCoreDispatchAction"
            if (r13 == 0) goto L132
            boolean r2 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Throwable -> L4a
            if (r2 != 0) goto L132
            cn.jiguang.f.b.a(r12, r13)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r2 = "asm"
            boolean r2 = r12.equals(r2)     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L1b
            goto L132
        L1b:
            java.lang.String r2 = "asmr"
            boolean r2 = r12.equals(r2)     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L25
            goto L132
        L25:
            java.lang.String r2 = "lbsenable"
            boolean r2 = r12.equals(r2)     // Catch: java.lang.Throwable -> L4a
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L4d
            java.lang.String r11 = "enable"
            boolean r11 = r13.getBoolean(r11)     // Catch: java.lang.Throwable -> L4a
            cn.jiguang.e.a r12 = cn.jiguang.e.a.ap()     // Catch: java.lang.Throwable -> L4a
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch: java.lang.Throwable -> L4a
            cn.jiguang.e.a r11 = r12.a(r11)     // Catch: java.lang.Throwable -> L4a
            cn.jiguang.e.a[] r12 = new cn.jiguang.e.a[r4]     // Catch: java.lang.Throwable -> L4a
            r12[r3] = r11     // Catch: java.lang.Throwable -> L4a
            cn.jiguang.e.b.a(r10, r12)     // Catch: java.lang.Throwable -> L4a
            goto L132
        L4a:
            r10 = move-exception
            goto L11c
        L4d:
            java.lang.String r2 = "lbsforenry"
            boolean r2 = r12.equals(r2)     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto Lcb
            java.lang.String r11 = "forenry"
            long r11 = r13.getLong(r11)     // Catch: java.lang.Throwable -> L9b
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9b
            r13.<init>()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = "setLbsPermissionDialogShieldDelay="
            r13.append(r2)     // Catch: java.lang.Throwable -> L9b
            r13.append(r11)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L9b
            cn.jiguang.w.f.c(r1, r13)     // Catch: java.lang.Throwable -> L9b
            cn.jiguang.e.a r13 = cn.jiguang.e.a.am()     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r13 = cn.jiguang.e.b.a(r10, r13)     // Catch: java.lang.Throwable -> L9b
            java.lang.Long r13 = (java.lang.Long) r13     // Catch: java.lang.Throwable -> L9b
            long r5 = r13.longValue()     // Catch: java.lang.Throwable -> L9b
            r7 = 0
            int r13 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r13 > 0) goto L9d
            cn.jiguang.e.a r13 = cn.jiguang.e.a.am()     // Catch: java.lang.Throwable -> L9b
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L9b
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L9b
            cn.jiguang.e.a r13 = r13.a(r2)     // Catch: java.lang.Throwable -> L9b
            cn.jiguang.e.a[] r2 = new cn.jiguang.e.a[r4]     // Catch: java.lang.Throwable -> L9b
            r2[r3] = r13     // Catch: java.lang.Throwable -> L9b
            cn.jiguang.e.b.a(r10, r2)     // Catch: java.lang.Throwable -> L9b
            goto L9d
        L9b:
            r10 = move-exception
            goto Lb8
        L9d:
            cn.jiguang.e.a r13 = cn.jiguang.e.a.ao()     // Catch: java.lang.Throwable -> L9b
            int r2 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r2 <= 0) goto Laa
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L9b
            goto Lab
        Laa:
            r11 = 0
        Lab:
            cn.jiguang.e.a r11 = r13.a(r11)     // Catch: java.lang.Throwable -> L9b
            cn.jiguang.e.a[] r12 = new cn.jiguang.e.a[r4]     // Catch: java.lang.Throwable -> L9b
            r12[r3] = r11     // Catch: java.lang.Throwable -> L9b
            cn.jiguang.e.b.a(r10, r12)     // Catch: java.lang.Throwable -> L9b
            goto L132
        Lb8:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a
            r11.<init>()     // Catch: java.lang.Throwable -> L4a
            r11.append(r0)     // Catch: java.lang.Throwable -> L4a
            r11.append(r10)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r10 = r11.toString()     // Catch: java.lang.Throwable -> L4a
            cn.jiguang.w.f.l(r1, r10)     // Catch: java.lang.Throwable -> L4a
            goto L132
        Lcb:
            java.lang.String r2 = "notification_state"
            boolean r2 = r12.equals(r2)     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto Ld7
        Ld3:
            cn.jiguang.i.a.a(r10, r12, r13)     // Catch: java.lang.Throwable -> L4a
            goto L132
        Ld7:
            java.lang.String r2 = "old_cmd"
            boolean r2 = r12.equals(r2)     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto Le0
        Ldf:
            goto Ld3
        Le0:
            java.lang.String r2 = "user_present"
            boolean r2 = r12.equals(r2)     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto Lea
            goto L132
        Lea:
            java.lang.String r2 = "set_wake_enable"
            boolean r2 = r12.equals(r2)     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto Lf3
            goto Ldf
        Lf3:
            java.lang.String r2 = "open_log"
            boolean r2 = r12.equals(r2)     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto Lff
            r9.a(r10, r13)     // Catch: java.lang.Throwable -> L4a
            goto L132
        Lff:
            boolean r10 = r11.equals(r12)     // Catch: java.lang.Throwable -> L4a
            if (r10 == 0) goto L10c
            java.lang.String r10 = r13.getString(r11)     // Catch: java.lang.Throwable -> L4a
            cn.jiguang.internal.JConstants.testCountry = r10     // Catch: java.lang.Throwable -> L4a
            goto L132
        L10c:
            java.lang.String r10 = "save_exception_data"
            boolean r10 = r10.equals(r12)     // Catch: java.lang.Throwable -> L4a
            if (r10 == 0) goto L132
            cn.jiguang.as.a r10 = cn.jiguang.as.a.a()     // Catch: java.lang.Throwable -> L4a
            r10.a(r13)     // Catch: java.lang.Throwable -> L4a
            goto L132
        L11c:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r0)
            java.lang.String r10 = r10.getMessage()
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            cn.jiguang.w.f.i(r1, r10)
        L132:
            return
    }
}
