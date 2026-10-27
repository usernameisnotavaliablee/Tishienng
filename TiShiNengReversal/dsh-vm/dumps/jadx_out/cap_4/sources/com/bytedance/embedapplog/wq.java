package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class wq {

    /* renamed from: m, reason: collision with root package name */
    private static final java.lang.String[] f2119m = null;
    private final android.content.SharedPreferences ae;
    private final com.bytedance.embedapplog.rn cw;
    private boolean j;

    /* renamed from: r, reason: collision with root package name */
    @androidx.annotation.NonNull
    private org.json.JSONObject f2120r;
    private int tl;
    private final java.util.ArrayList<com.bytedance.embedapplog.l> up;
    private final android.content.Context xt;

    static {
            java.lang.String r0 = "package"
            java.lang.String r1 = "app_version"
            java.lang.String r2 = "channel"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            com.bytedance.embedapplog.wq.f2119m = r0
            return
    }

    public wq(android.content.Context r3, com.bytedance.embedapplog.rn r4) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 32
            r0.<init>(r1)
            r2.up = r0
            r0 = 0
            r2.tl = r0
            r2.xt = r3
            r2.cw = r4
            android.content.SharedPreferences r4 = r4.r()
            r2.ae = r4
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            r2.f2120r = r4
            boolean r4 = com.bytedance.embedapplog.j.xt
            if (r4 == 0) goto L27
            com.bytedance.embedapplog.wo.j(r3)
        L27:
            return
    }

    private java.lang.String j(java.util.Set<java.lang.String> r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L9
            java.lang.String r1 = ","
            r0.append(r1)
            goto L9
        L24:
            java.lang.String r3 = r0.toString()
            return r3
    }

    static void j(org.json.JSONObject r1, java.lang.String r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L9
            r1.put(r2, r3)
        L9:
            return
    }

    private boolean j(com.bytedance.embedapplog.l r4) {
            r3 = this;
            com.bytedance.embedapplog.rn r0 = r3.cw
            boolean r0 = r0.i()
            if (r0 != 0) goto Le
            boolean r0 = r4.f2086r
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            boolean r1 = com.bytedance.embedapplog.uc.xt
            if (r1 == 0) goto L2d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "needSyncFromSub "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = " "
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            r1 = 0
            com.bytedance.embedapplog.uc.j(r4, r1)
        L2d:
            return r0
    }

    static boolean j(java.lang.String r5) {
            r0 = 0
            if (r5 == 0) goto L8
            int r1 = r5.length()
            goto L9
        L8:
            r1 = 0
        L9:
            r2 = 13
            if (r1 < r2) goto L3b
            r2 = 128(0x80, float:1.8E-43)
            if (r1 <= r2) goto L12
            goto L3b
        L12:
            r2 = 0
        L13:
            if (r2 >= r1) goto L39
            char r3 = r5.charAt(r2)
            r4 = 48
            if (r3 < r4) goto L21
            r4 = 57
            if (r3 <= r4) goto L36
        L21:
            r4 = 97
            if (r3 < r4) goto L29
            r4 = 102(0x66, float:1.43E-43)
            if (r3 <= r4) goto L36
        L29:
            r4 = 65
            if (r3 < r4) goto L31
            r4 = 70
            if (r3 <= r4) goto L36
        L31:
            r4 = 45
            if (r3 == r4) goto L36
            return r0
        L36:
            int r2 = r2 + 1
            goto L13
        L39:
            r5 = 1
            return r5
        L3b:
            return r0
    }

    @androidx.annotation.NonNull
    private org.json.JSONObject ws() {
            r1 = this;
            org.json.JSONObject r0 = r1.f2120r
            return r0
    }

    private synchronized void xt(org.json.JSONObject r7) {
            r6 = this;
            monitor-enter(r6)
            if (r7 != 0) goto Ld
            java.lang.String r7 = "null abconfig"
            r0 = 0
            com.bytedance.embedapplog.uc.xt(r7, r0)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r6)
            return
        Lb:
            r7 = move-exception
            goto L7a
        Ld:
            org.json.JSONObject r0 = r6.ws()     // Catch: java.lang.Throwable -> Lb
            java.lang.String r1 = "ab_version"
            java.lang.String r0 = r0.optString(r1)     // Catch: java.lang.Throwable -> Lb
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lb
            if (r1 != 0) goto L78
            java.lang.String r1 = ","
            java.lang.String[] r0 = r0.split(r1)     // Catch: java.lang.Throwable -> Lb
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Throwable -> Lb
            r1.<init>()     // Catch: java.lang.Throwable -> Lb
            int r2 = r0.length     // Catch: java.lang.Throwable -> Lb
            r3 = 0
        L2a:
            if (r3 >= r2) goto L3a
            r4 = r0[r3]     // Catch: java.lang.Throwable -> Lb
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> Lb
            if (r5 != 0) goto L37
            r1.add(r4)     // Catch: java.lang.Throwable -> Lb
        L37:
            int r3 = r3 + 1
            goto L2a
        L3a:
            java.util.Iterator r0 = r7.keys()     // Catch: java.lang.Throwable -> Lb
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> Lb
            r2.<init>()     // Catch: java.lang.Throwable -> Lb
        L43:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> Lb
            if (r3 == 0) goto L6c
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> Lb
            boolean r4 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> Lb
            if (r4 == 0) goto L43
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> Lb
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> Lb
            if (r4 != 0) goto L43
            org.json.JSONObject r3 = r7.getJSONObject(r3)     // Catch: java.lang.Throwable -> Lb org.json.JSONException -> L67
            java.lang.String r4 = "vid"
            java.lang.String r3 = r3.optString(r4)     // Catch: java.lang.Throwable -> Lb org.json.JSONException -> L67
            r2.add(r3)     // Catch: java.lang.Throwable -> Lb org.json.JSONException -> L67
            goto L43
        L67:
            r3 = move-exception
            com.bytedance.embedapplog.uc.xt(r3)     // Catch: java.lang.Throwable -> Lb
            goto L43
        L6c:
            r1.retainAll(r2)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r7 = "ab_version"
            java.lang.String r0 = r6.j(r1)     // Catch: java.lang.Throwable -> Lb
            r6.xt(r7, r0)     // Catch: java.lang.Throwable -> Lb
        L78:
            monitor-exit(r6)
            return
        L7a:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lb
            throw r7
    }

    public static boolean xt(java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 != 0) goto L2b
            java.lang.String r0 = "unknown"
            boolean r0 = r0.equalsIgnoreCase(r4)
            if (r0 != 0) goto L2b
            java.lang.String r0 = "Null"
            boolean r0 = r0.equalsIgnoreCase(r4)
            if (r0 != 0) goto L2b
            r0 = 0
        L18:
            int r2 = r4.length()
            if (r0 >= r2) goto L2b
            char r2 = r4.charAt(r0)
            r3 = 48
            if (r2 == r3) goto L28
            r4 = 1
            return r4
        L28:
            int r0 = r0 + 1
            goto L18
        L2b:
            return r1
    }

    private boolean xt(java.lang.String r5, java.lang.Object r6) {
            r4 = this;
            org.json.JSONObject r0 = r4.ws()
            java.lang.Object r0 = r0.opt(r5)
            if (r6 == 0) goto L10
            boolean r1 = r6.equals(r0)
            if (r1 == 0) goto L14
        L10:
            if (r6 != 0) goto L30
            if (r0 == 0) goto L30
        L14:
            monitor-enter(r4)
            org.json.JSONObject r1 = r4.f2120r     // Catch: java.lang.Throwable -> L25 org.json.JSONException -> L27
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L25 org.json.JSONException -> L27
            r2.<init>()     // Catch: java.lang.Throwable -> L25 org.json.JSONException -> L27
            com.bytedance.embedapplog.ri.xt(r2, r1)     // Catch: java.lang.Throwable -> L25 org.json.JSONException -> L27
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L25 org.json.JSONException -> L27
            r4.f2120r = r2     // Catch: java.lang.Throwable -> L25 org.json.JSONException -> L27
            goto L2b
        L25:
            r5 = move-exception
            goto L2e
        L27:
            r1 = move-exception
            com.bytedance.embedapplog.uc.xt(r1)     // Catch: java.lang.Throwable -> L25
        L2b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L25
            r1 = 1
            goto L31
        L2e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L25
            throw r5
        L30:
            r1 = 0
        L31:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "updateHeader, "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r5 = ", "
            r2.append(r5)
            r2.append(r0)
            java.lang.String r5 = ", "
            r2.append(r5)
            r2.append(r6)
            java.lang.String r5 = r2.toString()
            r6 = 0
            com.bytedance.embedapplog.uc.j(r5, r6)
            return r1
    }

    public java.lang.String ae() {
            r3 = this;
            org.json.JSONObject r0 = r3.ws()
            java.lang.String r1 = "device_id"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.optString(r1, r2)
            return r0
    }

    public java.lang.String cw() {
            r5 = this;
            boolean r0 = r5.j
            java.lang.String r1 = "app_version"
            r2 = 0
            if (r0 == 0) goto L10
            org.json.JSONObject r0 = r5.ws()
            java.lang.String r0 = r0.optString(r1, r2)
            goto L11
        L10:
            r0 = r2
        L11:
            r3 = 0
        L12:
            r4 = 3
            if (r3 >= r4) goto L2b
            if (r0 != 0) goto L2b
            r5.m()
            boolean r0 = r5.j
            if (r0 == 0) goto L27
            org.json.JSONObject r0 = r5.ws()
            java.lang.String r0 = r0.optString(r1, r2)
            goto L28
        L27:
            r0 = r2
        L28:
            int r3 = r3 + 1
            goto L12
        L2b:
            return r0
    }

    public java.lang.String g() {
            r3 = this;
            org.json.JSONObject r0 = r3.ws()
            java.lang.String r1 = "ssid"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.optString(r1, r2)
            return r0
    }

    @androidx.annotation.Nullable
    public <T> T j(java.lang.String r2, T r3) {
            r1 = this;
            org.json.JSONObject r0 = r1.ws()
            if (r0 == 0) goto Ld
            java.lang.Object r2 = r0.opt(r2)
            if (r2 == 0) goto Ld
            goto Le
        Ld:
            r2 = 0
        Le:
            if (r2 != 0) goto L11
            return r3
        L11:
            return r2
    }

    @androidx.annotation.Nullable
    public org.json.JSONObject j() {
            r1 = this;
            boolean r0 = r1.j
            if (r0 == 0) goto L9
            org.json.JSONObject r0 = r1.ws()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public void j(java.util.HashMap<java.lang.String, java.lang.Object> r5) {
            r4 = this;
            java.lang.String r0 = "custom"
            r1 = 0
            if (r5 == 0) goto L4f
            boolean r2 = r5.isEmpty()
            if (r2 != 0) goto L4f
            org.json.JSONObject r2 = r4.ws()     // Catch: org.json.JSONException -> L1c
            org.json.JSONObject r1 = r2.optJSONObject(r0)     // Catch: org.json.JSONException -> L1c
            if (r1 != 0) goto L1e
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1c
            r2.<init>()     // Catch: org.json.JSONException -> L1c
            r1 = r2
            goto L1e
        L1c:
            r5 = move-exception
            goto L4c
        L1e:
            java.util.Set r5 = r5.entrySet()     // Catch: org.json.JSONException -> L1c
            java.util.Iterator r5 = r5.iterator()     // Catch: org.json.JSONException -> L1c
        L26:
            boolean r2 = r5.hasNext()     // Catch: org.json.JSONException -> L1c
            if (r2 == 0) goto L4f
            java.lang.Object r2 = r5.next()     // Catch: org.json.JSONException -> L1c
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: org.json.JSONException -> L1c
            java.lang.Object r3 = r2.getKey()     // Catch: org.json.JSONException -> L1c
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch: org.json.JSONException -> L1c
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: org.json.JSONException -> L1c
            if (r3 != 0) goto L26
            java.lang.Object r3 = r2.getKey()     // Catch: org.json.JSONException -> L1c
            java.lang.String r3 = (java.lang.String) r3     // Catch: org.json.JSONException -> L1c
            java.lang.Object r2 = r2.getValue()     // Catch: org.json.JSONException -> L1c
            r1.put(r3, r2)     // Catch: org.json.JSONException -> L1c
            goto L26
        L4c:
            com.bytedance.embedapplog.uc.xt(r5)
        L4f:
            boolean r5 = r4.xt(r0, r1)
            if (r5 == 0) goto L5a
            com.bytedance.embedapplog.rn r5 = r4.cw
            r5.xt(r1)
        L5a:
            return
    }

    public void j(org.json.JSONObject r2) {
            r1 = this;
            com.bytedance.embedapplog.rn r0 = r1.cw
            r0.cw(r2)
            r1.xt(r2)
            return
    }

    public boolean j(org.json.JSONObject r20, java.lang.String r21, java.lang.String r22, java.lang.String r23) {
            r19 = this;
            r1 = r19
            r0 = r20
            r5 = r21
            r7 = r22
            r9 = r23
            java.lang.String r2 = "register_time"
            java.lang.String r3 = "ssid"
            java.lang.String r4 = "install_id"
            java.lang.String r6 = ""
            java.lang.String r8 = "device_id"
            java.lang.String r10 = "version_code"
            boolean r11 = com.bytedance.embedapplog.uc.xt
            if (r11 == 0) goto L40
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "saveRegisterInfo, "
            r11.<init>(r12)
            r11.append(r5)
            java.lang.String r12 = ", "
            r11.append(r12)
            r11.append(r7)
            r11.append(r12)
            r11.append(r9)
            r11.append(r12)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r12 = 0
            com.bytedance.embedapplog.uc.j(r11, r12)
        L40:
            boolean r11 = xt(r5)
            boolean r12 = xt(r7)
            r14 = 0
            boolean r15 = xt(r9)     // Catch: org.json.JSONException -> Le8
            r16 = 1
            android.content.SharedPreferences r13 = r1.ae     // Catch: org.json.JSONException -> Le4
            int r13 = r13.getInt(r10, r14)     // Catch: org.json.JSONException -> Le4
            r17 = r11
            org.json.JSONObject r11 = r1.ws()     // Catch: org.json.JSONException -> Le0
            int r11 = r11.optInt(r10, r14)     // Catch: org.json.JSONException -> Le0
            r18 = 0
            android.content.SharedPreferences r14 = r1.ae     // Catch: org.json.JSONException -> L6d
            android.content.SharedPreferences$Editor r14 = r14.edit()     // Catch: org.json.JSONException -> L6d
            if (r13 == r11) goto L70
            r14.putInt(r10, r11)     // Catch: org.json.JSONException -> L6d
            goto L70
        L6d:
            r0 = move-exception
            goto Lee
        L70:
            if (r17 == 0) goto L81
            long r10 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L6d
            r14.putLong(r2, r10)     // Catch: org.json.JSONException -> L6d
            java.lang.Long r0 = java.lang.Long.valueOf(r10)     // Catch: org.json.JSONException -> L6d
            r1.xt(r2, r0)     // Catch: org.json.JSONException -> L6d
            goto L92
        L81:
            if (r17 != 0) goto L92
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L6d
            r2.<init>()     // Catch: org.json.JSONException -> L6d
            java.lang.String r10 = "response"
            r2.put(r10, r0)     // Catch: org.json.JSONException -> L6d
            java.lang.String r0 = "tt_fetch_did_error"
            com.bytedance.embedapplog.j.j(r0, r2)     // Catch: org.json.JSONException -> L6d
        L92:
            org.json.JSONObject r0 = r1.ws()     // Catch: org.json.JSONException -> L6d
            java.lang.String r0 = r0.optString(r8, r6)     // Catch: org.json.JSONException -> L6d
            if (r17 == 0) goto La7
            boolean r2 = r1.xt(r8, r5)     // Catch: org.json.JSONException -> L6d
            if (r2 == 0) goto La7
            r14.putString(r8, r5)     // Catch: org.json.JSONException -> L6d
            r2 = 1
            goto La8
        La7:
            r2 = 0
        La8:
            org.json.JSONObject r8 = r1.ws()     // Catch: org.json.JSONException -> L6d
            java.lang.String r8 = r8.optString(r4, r6)     // Catch: org.json.JSONException -> L6d
            if (r12 == 0) goto Lbc
            boolean r10 = r1.xt(r4, r7)     // Catch: org.json.JSONException -> L6d
            if (r10 == 0) goto Lbc
            r14.putString(r4, r7)     // Catch: org.json.JSONException -> L6d
            r2 = 1
        Lbc:
            org.json.JSONObject r4 = r1.ws()     // Catch: org.json.JSONException -> L6d
            java.lang.String r4 = r4.optString(r3, r6)     // Catch: org.json.JSONException -> L6d
            if (r15 == 0) goto Ld1
            boolean r6 = r1.xt(r3, r9)     // Catch: org.json.JSONException -> L6d
            if (r6 == 0) goto Ld1
            r14.putString(r3, r9)     // Catch: org.json.JSONException -> L6d
            r3 = 1
            goto Ld2
        Ld1:
            r3 = r2
        Ld2:
            com.bytedance.embedapplog.cw r2 = com.bytedance.embedapplog.j.qv()     // Catch: org.json.JSONException -> L6d
            r6 = r8
            r8 = r4
            r4 = r0
            r2.j(r3, r4, r5, r6, r7, r8, r9)     // Catch: org.json.JSONException -> L6d
            r14.apply()     // Catch: org.json.JSONException -> L6d
            goto Lf1
        Le0:
            r0 = move-exception
        Le1:
            r18 = 0
            goto Lee
        Le4:
            r0 = move-exception
            r17 = r11
            goto Le1
        Le8:
            r0 = move-exception
            r17 = r11
            r16 = 1
            goto Le1
        Lee:
            com.bytedance.embedapplog.uc.xt(r0)
        Lf1:
            if (r17 == 0) goto Lf6
            if (r12 == 0) goto Lf6
            return r16
        Lf6:
            return r18
    }

    public java.lang.String jy() {
            r3 = this;
            org.json.JSONObject r0 = r3.ws()
            java.lang.String r1 = "ab_sdk_version"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.optString(r1, r2)
            return r0
    }

    public boolean m() {
            r12 = this;
            java.util.ArrayList<com.bytedance.embedapplog.l> r0 = r12.up
            monitor-enter(r0)
            java.util.ArrayList<com.bytedance.embedapplog.l> r1 = r12.up     // Catch: java.lang.Throwable -> Le8
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Le8
            if (r1 != 0) goto Leb
            java.util.ArrayList<com.bytedance.embedapplog.l> r1 = r12.up     // Catch: java.lang.Throwable -> Le8
            com.bytedance.embedapplog.p r2 = new com.bytedance.embedapplog.p     // Catch: java.lang.Throwable -> Le8
            android.content.Context r3 = r12.xt     // Catch: java.lang.Throwable -> Le8
            com.bytedance.embedapplog.rn r4 = r12.cw     // Catch: java.lang.Throwable -> Le8
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> Le8
            r1.add(r2)     // Catch: java.lang.Throwable -> Le8
            java.util.ArrayList<com.bytedance.embedapplog.l> r1 = r12.up     // Catch: java.lang.Throwable -> Le8
            com.bytedance.embedapplog.la r2 = new com.bytedance.embedapplog.la     // Catch: java.lang.Throwable -> Le8
            android.content.Context r3 = r12.xt     // Catch: java.lang.Throwable -> Le8
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Le8
            r1.add(r2)     // Catch: java.lang.Throwable -> Le8
            java.util.ArrayList<com.bytedance.embedapplog.l> r1 = r12.up     // Catch: java.lang.Throwable -> Le8
            com.bytedance.embedapplog.gq r2 = new com.bytedance.embedapplog.gq     // Catch: java.lang.Throwable -> Le8
            android.content.Context r3 = r12.xt     // Catch: java.lang.Throwable -> Le8
            com.bytedance.embedapplog.rn r4 = r12.cw     // Catch: java.lang.Throwable -> Le8
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> Le8
            r1.add(r2)     // Catch: java.lang.Throwable -> Le8
            java.util.ArrayList<com.bytedance.embedapplog.l> r1 = r12.up     // Catch: java.lang.Throwable -> Le8
            com.bytedance.embedapplog.uf r2 = new com.bytedance.embedapplog.uf     // Catch: java.lang.Throwable -> Le8
            android.content.Context r3 = r12.xt     // Catch: java.lang.Throwable -> Le8
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Le8
            r1.add(r2)     // Catch: java.lang.Throwable -> Le8
            java.util.ArrayList<com.bytedance.embedapplog.l> r1 = r12.up     // Catch: java.lang.Throwable -> Le8
            com.bytedance.embedapplog.c r2 = new com.bytedance.embedapplog.c     // Catch: java.lang.Throwable -> Le8
            android.content.Context r3 = r12.xt     // Catch: java.lang.Throwable -> Le8
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Le8
            r1.add(r2)     // Catch: java.lang.Throwable -> Le8
            java.util.ArrayList<com.bytedance.embedapplog.l> r1 = r12.up     // Catch: java.lang.Throwable -> Le8
            com.bytedance.embedapplog.gx r2 = new com.bytedance.embedapplog.gx     // Catch: java.lang.Throwable -> Le8
            android.content.Context r3 = r12.xt     // Catch: java.lang.Throwable -> Le8
            com.bytedance.embedapplog.rn r4 = r12.cw     // Catch: java.lang.Throwable -> Le8
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> Le8
            r1.add(r2)     // Catch: java.lang.Throwable -> Le8
            java.util.ArrayList<com.bytedance.embedapplog.l> r1 = r12.up     // Catch: java.lang.Throwable -> Le8
            com.bytedance.embedapplog.n r2 = new com.bytedance.embedapplog.n     // Catch: java.lang.Throwable -> Le8
            android.content.Context r3 = r12.xt     // Catch: java.lang.Throwable -> Le8
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Le8
            r1.add(r2)     // Catch: java.lang.Throwable -> Le8
            java.util.ArrayList<com.bytedance.embedapplog.l> r1 = r12.up     // Catch: java.lang.Throwable -> Le8
            com.bytedance.embedapplog.rh r2 = new com.bytedance.embedapplog.rh     // Catch: java.lang.Throwable -> Le8
            android.content.Context r3 = r12.xt     // Catch: java.lang.Throwable -> Le8
            com.bytedance.embedapplog.rn r4 = r12.cw     // Catch: java.lang.Throwable -> Le8
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> Le8
            r1.add(r2)     // Catch: java.lang.Throwable -> Le8
            java.util.ArrayList<com.bytedance.embedapplog.l> r1 = r12.up     // Catch: java.lang.Throwable -> Le8
            com.bytedance.embedapplog.ol r2 = new com.bytedance.embedapplog.ol     // Catch: java.lang.Throwable -> Le8
            android.content.Context r3 = r12.xt     // Catch: java.lang.Throwable -> Le8
            com.bytedance.embedapplog.rn r4 = r12.cw     // Catch: java.lang.Throwable -> Le8
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> Le8
            r1.add(r2)     // Catch: java.lang.Throwable -> Le8
            java.util.ArrayList<com.bytedance.embedapplog.l> r1 = r12.up     // Catch: java.lang.Throwable -> Le8
            com.bytedance.embedapplog.hh r2 = new com.bytedance.embedapplog.hh     // Catch: java.lang.Throwable -> Le8
            r2.<init>()     // Catch: java.lang.Throwable -> Le8
            r1.add(r2)     // Catch: java.lang.Throwable -> Le8
            java.util.ArrayList<com.bytedance.embedapplog.l> r1 = r12.up     // Catch: java.lang.Throwable -> Le8
            com.bytedance.embedapplog.z r2 = new com.bytedance.embedapplog.z     // Catch: java.lang.Throwable -> Le8
            com.bytedance.embedapplog.rn r3 = r12.cw     // Catch: java.lang.Throwable -> Le8
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Le8
            r1.add(r2)     // Catch: java.lang.Throwable -> Le8
            java.util.ArrayList<com.bytedance.embedapplog.l> r1 = r12.up     // Catch: java.lang.Throwable -> Le8
            com.bytedance.embedapplog.hl r2 = new com.bytedance.embedapplog.hl     // Catch: java.lang.Throwable -> Le8
            android.content.Context r3 = r12.xt     // Catch: java.lang.Throwable -> Le8
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Le8
            r1.add(r2)     // Catch: java.lang.Throwable -> Le8
            java.util.ArrayList<com.bytedance.embedapplog.l> r1 = r12.up     // Catch: java.lang.Throwable -> Le8
            com.bytedance.embedapplog.b r2 = new com.bytedance.embedapplog.b     // Catch: java.lang.Throwable -> Le8
            android.content.Context r3 = r12.xt     // Catch: java.lang.Throwable -> Le8
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Le8
            r1.add(r2)     // Catch: java.lang.Throwable -> Le8
            java.util.ArrayList<com.bytedance.embedapplog.l> r1 = r12.up     // Catch: java.lang.Throwable -> Le8
            com.bytedance.embedapplog.e r2 = new com.bytedance.embedapplog.e     // Catch: java.lang.Throwable -> Le8
            android.content.Context r3 = r12.xt     // Catch: java.lang.Throwable -> Le8
            com.bytedance.embedapplog.rn r4 = r12.cw     // Catch: java.lang.Throwable -> Le8
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> Le8
            r1.add(r2)     // Catch: java.lang.Throwable -> Le8
            java.util.ArrayList<com.bytedance.embedapplog.l> r1 = r12.up     // Catch: java.lang.Throwable -> Le8
            com.bytedance.embedapplog.s r2 = new com.bytedance.embedapplog.s     // Catch: java.lang.Throwable -> Le8
            android.content.Context r3 = r12.xt     // Catch: java.lang.Throwable -> Le8
            com.bytedance.embedapplog.rn r4 = r12.cw     // Catch: java.lang.Throwable -> Le8
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> Le8
            r1.add(r2)     // Catch: java.lang.Throwable -> Le8
            java.util.ArrayList<com.bytedance.embedapplog.l> r1 = r12.up     // Catch: java.lang.Throwable -> Le8
            com.bytedance.embedapplog.nd r2 = new com.bytedance.embedapplog.nd     // Catch: java.lang.Throwable -> Le8
            android.content.Context r3 = r12.xt     // Catch: java.lang.Throwable -> Le8
            com.bytedance.embedapplog.rn r4 = r12.cw     // Catch: java.lang.Throwable -> Le8
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> Le8
            r1.add(r2)     // Catch: java.lang.Throwable -> Le8
            java.util.ArrayList<com.bytedance.embedapplog.l> r1 = r12.up     // Catch: java.lang.Throwable -> Le8
            com.bytedance.embedapplog.h r2 = new com.bytedance.embedapplog.h     // Catch: java.lang.Throwable -> Le8
            android.content.Context r3 = r12.xt     // Catch: java.lang.Throwable -> Le8
            com.bytedance.embedapplog.rn r4 = r12.cw     // Catch: java.lang.Throwable -> Le8
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> Le8
            r1.add(r2)     // Catch: java.lang.Throwable -> Le8
            goto Leb
        Le8:
            r1 = move-exception
            goto L212
        Leb:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le8
            org.json.JSONObject r0 = r12.ws()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            com.bytedance.embedapplog.ri.xt(r1, r0)
            java.util.ArrayList<com.bytedance.embedapplog.l> r0 = r12.up
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = 1
            r4 = 1
            r5 = 0
            r6 = 0
        L103:
            boolean r7 = r0.hasNext()
            r8 = 10
            if (r7 == 0) goto L169
            java.lang.Object r7 = r0.next()
            com.bytedance.embedapplog.l r7 = (com.bytedance.embedapplog.l) r7
            boolean r9 = r7.j
            if (r9 == 0) goto L11f
            boolean r9 = r7.cw
            if (r9 != 0) goto L11f
            boolean r9 = r12.j(r7)
            if (r9 == 0) goto L15b
        L11f:
            boolean r9 = r7.j(r1)     // Catch: java.lang.SecurityException -> L126 org.json.JSONException -> L128
            r7.j = r9     // Catch: java.lang.SecurityException -> L126 org.json.JSONException -> L128
            goto L151
        L126:
            r9 = move-exception
            goto L12a
        L128:
            r8 = move-exception
            goto L14e
        L12a:
            boolean r10 = r7.xt
            if (r10 != 0) goto L151
            int r5 = r5 + 1
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "loadHeader, "
            r10.<init>(r11)
            int r11 = r12.tl
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.bytedance.embedapplog.uc.xt(r10, r9)
            boolean r9 = r7.j
            if (r9 != 0) goto L151
            int r9 = r12.tl
            if (r9 <= r8) goto L151
            r7.j = r3
            goto L151
        L14e:
            com.bytedance.embedapplog.uc.xt(r8)
        L151:
            boolean r8 = r7.j
            if (r8 != 0) goto L15b
            boolean r8 = r7.xt
            if (r8 != 0) goto L15b
            int r6 = r6 + 1
        L15b:
            boolean r8 = r7.j
            if (r8 != 0) goto L166
            boolean r7 = r7.xt
            if (r7 == 0) goto L164
            goto L166
        L164:
            r7 = 0
            goto L167
        L166:
            r7 = 1
        L167:
            r4 = r4 & r7
            goto L103
        L169:
            r0 = 0
            if (r4 == 0) goto L193
            java.lang.String[] r7 = com.bytedance.embedapplog.wq.f2119m
            int r9 = r7.length
        L16f:
            if (r2 >= r9) goto L180
            r10 = r7[r2]
            java.lang.String r10 = r1.optString(r10)
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            r10 = r10 ^ r3
            r4 = r4 & r10
            int r2 = r2 + 1
            goto L16f
        L180:
            java.lang.String r2 = "user_unique_id"
            java.lang.String r2 = r1.optString(r2, r0)
            boolean r7 = android.text.TextUtils.isEmpty(r2)
            if (r7 != 0) goto L193
            java.lang.String r7 = "user_unique_id"
            r1.put(r7, r2)     // Catch: org.json.JSONException -> L192
            goto L193
        L192:
        L193:
            r12.f2120r = r1
            r12.j = r4
            boolean r1 = com.bytedance.embedapplog.uc.xt
            if (r1 == 0) goto L1c7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "loadHeader, "
            r1.<init>(r2)
            boolean r2 = r12.j
            r1.append(r2)
            java.lang.String r2 = ", "
            r1.append(r2)
            int r2 = r12.tl
            r1.append(r2)
            java.lang.String r2 = ", "
            r1.append(r2)
            org.json.JSONObject r2 = r12.f2120r
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.bytedance.embedapplog.uc.j(r1, r0)
            goto L1e4
        L1c7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "loadHeader, "
            r1.<init>(r2)
            boolean r2 = r12.j
            r1.append(r2)
            java.lang.String r2 = ", "
            r1.append(r2)
            int r2 = r12.tl
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.bytedance.embedapplog.uc.r(r1, r0)
        L1e4:
            if (r5 <= 0) goto L1f8
            if (r5 != r6) goto L1f8
            int r0 = r12.tl
            int r0 = r0 + r3
            r12.tl = r0
            int r0 = r12.qv()
            if (r0 == 0) goto L1f8
            int r0 = r12.tl
            int r0 = r0 + r8
            r12.tl = r0
        L1f8:
            boolean r0 = r12.j
            if (r0 == 0) goto L20f
            com.bytedance.embedapplog.cw r0 = com.bytedance.embedapplog.j.qv()
            java.lang.String r1 = r12.ae()
            java.lang.String r2 = r12.tl()
            java.lang.String r3 = r12.g()
            r0.j(r1, r2, r3)
        L20f:
            boolean r0 = r12.j
            return r0
        L212:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le8
            throw r1
    }

    public java.lang.String oq() {
            r3 = this;
            org.json.JSONObject r0 = r3.ws()
            java.lang.String r1 = "user_unique_id"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.optString(r1, r2)
            return r0
    }

    public int qv() {
            r4 = this;
            org.json.JSONObject r0 = r4.ws()
            java.lang.String r1 = "device_id"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.optString(r1, r2)
            org.json.JSONObject r1 = r4.ws()
            java.lang.String r3 = "install_id"
            r1.optString(r3, r2)
            boolean r0 = xt(r0)
            r1 = 0
            if (r0 == 0) goto L33
            android.content.SharedPreferences r0 = r4.ae
            java.lang.String r2 = "version_code"
            int r0 = r0.getInt(r2, r1)
            org.json.JSONObject r1 = r4.ws()
            r3 = -1
            int r1 = r1.optInt(r2, r3)
            if (r0 != r1) goto L31
            r0 = 1
            return r0
        L31:
            r0 = 2
            return r0
        L33:
            return r1
    }

    public void r() {
            r1 = this;
            com.bytedance.embedapplog.f r0 = com.bytedance.embedapplog.f.m()
            r0.g()
            return
    }

    public java.lang.String tl() {
            r3 = this;
            org.json.JSONObject r0 = r3.ws()
            java.lang.String r1 = "install_id"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.optString(r1, r2)
            return r0
    }

    public void up() {
            r3 = this;
            com.bytedance.embedapplog.nd r0 = new com.bytedance.embedapplog.nd
            android.content.Context r1 = r3.xt
            com.bytedance.embedapplog.rn r2 = r3.cw
            r0.<init>(r1, r2)
            org.json.JSONObject r1 = r3.f2120r     // Catch: java.lang.Exception -> Lf
            r0.j(r1)     // Catch: java.lang.Exception -> Lf
            return
        Lf:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "e:"
            r1.<init>(r2)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "od"
            com.bytedance.sdk.component.utils.vl.cw(r2, r1, r0)
            return
    }

    public long vl() {
            r4 = this;
            org.json.JSONObject r0 = r4.ws()
            java.lang.String r1 = "register_time"
            r2 = 0
            long r0 = r0.optLong(r1, r2)
            return r0
    }

    public int xt() {
            r5 = this;
            boolean r0 = r5.j
            java.lang.String r1 = "version_code"
            r2 = -1
            if (r0 == 0) goto L10
            org.json.JSONObject r0 = r5.ws()
            int r0 = r0.optInt(r1, r2)
            goto L11
        L10:
            r0 = -1
        L11:
            r3 = 0
        L12:
            r4 = 3
            if (r3 >= r4) goto L2b
            if (r0 != r2) goto L2b
            r5.m()
            boolean r0 = r5.j
            if (r0 == 0) goto L27
            org.json.JSONObject r0 = r5.ws()
            int r0 = r0.optInt(r1, r2)
            goto L28
        L27:
            r0 = -1
        L28:
            int r3 = r3 + 1
            goto L12
        L2b:
            return r0
    }
}
