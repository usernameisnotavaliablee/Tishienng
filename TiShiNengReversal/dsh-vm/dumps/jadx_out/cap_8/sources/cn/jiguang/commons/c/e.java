package cn.jiguang.commons.c;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class e {
    public java.lang.String a;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f1007c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f1008d;

    /* renamed from: e, reason: collision with root package name */
    public int f1009e;

    /* renamed from: f, reason: collision with root package name */
    public int f1010f;

    /* renamed from: g, reason: collision with root package name */
    public int f1011g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f1012h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f1013i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f1014j;

    /* renamed from: k, reason: collision with root package name */
    public long f1015k;
    public long l;
    public java.lang.String[] m;
    public java.lang.String[] n;

    public e() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.CharSequence a(java.lang.CharSequence r1, int r2) {
            if (r2 < 0) goto Ld
            int r0 = r1.length()
            if (r2 >= r0) goto Ld
            r0 = 0
            java.lang.CharSequence r1 = r1.subSequence(r0, r2)
        Ld:
            return r1
    }

    public org.json.JSONObject a(int r4) {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3a
            r0.<init>()     // Catch: org.json.JSONException -> L3a
            java.lang.String r1 = "pkg"
            java.lang.String r2 = r3.f1007c     // Catch: org.json.JSONException -> L3a
            java.lang.CharSequence r4 = a(r2, r4)     // Catch: org.json.JSONException -> L3a
            org.json.JSONObject r4 = r0.put(r1, r4)     // Catch: org.json.JSONException -> L3a
            java.lang.String r0 = "install_time"
            long r1 = r3.f1015k     // Catch: org.json.JSONException -> L3a
            org.json.JSONObject r4 = r4.put(r0, r1)     // Catch: org.json.JSONException -> L3a
            java.lang.String r0 = "update_time"
            long r1 = r3.l     // Catch: org.json.JSONException -> L3a
            org.json.JSONObject r4 = r4.put(r0, r1)     // Catch: org.json.JSONException -> L3a
            java.lang.String r0 = "sign_md5"
            java.lang.String r1 = r3.f1012h     // Catch: org.json.JSONException -> L3a
            org.json.JSONObject r4 = r4.put(r0, r1)     // Catch: org.json.JSONException -> L3a
            java.lang.String r0 = "sign_sha1"
            java.lang.String r1 = r3.f1013i     // Catch: org.json.JSONException -> L3a
            org.json.JSONObject r4 = r4.put(r0, r1)     // Catch: org.json.JSONException -> L3a
            java.lang.String r0 = "sign_sha256"
            java.lang.String r1 = r3.f1014j     // Catch: org.json.JSONException -> L3a
            org.json.JSONObject r4 = r4.put(r0, r1)     // Catch: org.json.JSONException -> L3a
            return r4
        L3a:
            r4 = 0
            return r4
    }

    public org.json.JSONObject c(int r4) {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L38
            r0.<init>()     // Catch: org.json.JSONException -> L38
            java.lang.String r1 = "name"
            java.lang.String r2 = r3.a     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L38
            java.lang.String r1 = "pkg"
            java.lang.String r2 = r3.f1007c     // Catch: org.json.JSONException -> L38
            java.lang.CharSequence r4 = a(r2, r4)     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r4 = r0.put(r1, r4)     // Catch: org.json.JSONException -> L38
            java.lang.String r0 = "ver_name"
            java.lang.String r1 = r3.f1008d     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r4 = r4.put(r0, r1)     // Catch: org.json.JSONException -> L38
            java.lang.String r0 = "ver_code"
            int r1 = r3.f1009e     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r4 = r4.put(r0, r1)     // Catch: org.json.JSONException -> L38
            java.lang.String r0 = "pers"
            java.lang.String[] r1 = r3.m     // Catch: org.json.JSONException -> L38
            java.lang.String r1 = java.util.Arrays.toString(r1)     // Catch: org.json.JSONException -> L38
            org.json.JSONObject r4 = r4.put(r0, r1)     // Catch: org.json.JSONException -> L38
            return r4
        L38:
            r4 = 0
            return r4
    }

    public org.json.JSONObject d(int r4) {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L5c
            r0.<init>()     // Catch: org.json.JSONException -> L5c
            java.lang.String r1 = "n"
            java.lang.String r2 = r3.a     // Catch: org.json.JSONException -> L5c
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L5c
            java.lang.String r1 = "p"
            java.lang.String r2 = r3.f1007c     // Catch: org.json.JSONException -> L5c
            java.lang.CharSequence r4 = a(r2, r4)     // Catch: org.json.JSONException -> L5c
            org.json.JSONObject r4 = r0.put(r1, r4)     // Catch: org.json.JSONException -> L5c
            java.lang.String r0 = "vn"
            java.lang.String r1 = r3.f1008d     // Catch: org.json.JSONException -> L5c
            org.json.JSONObject r4 = r4.put(r0, r1)     // Catch: org.json.JSONException -> L5c
            java.lang.String r0 = "c"
            int r1 = r3.f1009e     // Catch: org.json.JSONException -> L5c
            org.json.JSONObject r4 = r4.put(r0, r1)     // Catch: org.json.JSONException -> L5c
            java.lang.String r0 = "t"
            int r1 = r3.f1010f     // Catch: org.json.JSONException -> L5c
            org.json.JSONObject r4 = r4.put(r0, r1)     // Catch: org.json.JSONException -> L5c
            java.lang.String r0 = "it"
            long r1 = r3.f1015k     // Catch: org.json.JSONException -> L5c
            org.json.JSONObject r4 = r4.put(r0, r1)     // Catch: org.json.JSONException -> L5c
            java.lang.String r0 = "ut"
            long r1 = r3.l     // Catch: org.json.JSONException -> L5c
            org.json.JSONObject r4 = r4.put(r0, r1)     // Catch: org.json.JSONException -> L5c
            java.lang.String r0 = "sm"
            java.lang.String r1 = r3.f1012h     // Catch: org.json.JSONException -> L5c
            org.json.JSONObject r4 = r4.put(r0, r1)     // Catch: org.json.JSONException -> L5c
            java.lang.String r0 = "ss"
            java.lang.String r1 = r3.f1013i     // Catch: org.json.JSONException -> L5c
            org.json.JSONObject r4 = r4.put(r0, r1)     // Catch: org.json.JSONException -> L5c
            java.lang.String r0 = "sa"
            java.lang.String r1 = r3.f1014j     // Catch: org.json.JSONException -> L5c
            org.json.JSONObject r4 = r4.put(r0, r1)     // Catch: org.json.JSONException -> L5c
            return r4
        L5c:
            r4 = 0
            return r4
    }

    public org.json.JSONObject e(int r4) {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L44
            r0.<init>()     // Catch: org.json.JSONException -> L44
            java.lang.String r1 = "name"
            java.lang.String r2 = r3.a     // Catch: org.json.JSONException -> L44
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L44
            java.lang.String r1 = "pkg"
            java.lang.String r2 = r3.f1007c     // Catch: org.json.JSONException -> L44
            java.lang.CharSequence r4 = a(r2, r4)     // Catch: org.json.JSONException -> L44
            org.json.JSONObject r4 = r0.put(r1, r4)     // Catch: org.json.JSONException -> L44
            java.lang.String r0 = "ver_name"
            java.lang.String r1 = r3.f1008d     // Catch: org.json.JSONException -> L44
            org.json.JSONObject r4 = r4.put(r0, r1)     // Catch: org.json.JSONException -> L44
            java.lang.String r0 = "ver_code"
            int r1 = r3.f1009e     // Catch: org.json.JSONException -> L44
            org.json.JSONObject r4 = r4.put(r0, r1)     // Catch: org.json.JSONException -> L44
            java.lang.String r0 = "install_type"
            int r1 = r3.f1010f     // Catch: org.json.JSONException -> L44
            org.json.JSONObject r4 = r4.put(r0, r1)     // Catch: org.json.JSONException -> L44
            java.lang.String r0 = "install_time"
            long r1 = r3.f1015k     // Catch: org.json.JSONException -> L44
            org.json.JSONObject r4 = r4.put(r0, r1)     // Catch: org.json.JSONException -> L44
            java.lang.String r0 = "update_time"
            long r1 = r3.l     // Catch: org.json.JSONException -> L44
            org.json.JSONObject r4 = r4.put(r0, r1)     // Catch: org.json.JSONException -> L44
            return r4
        L44:
            r4 = 0
            return r4
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L29
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L29
        L12:
            cn.jiguang.commons.c.e r5 = (cn.jiguang.commons.c.e) r5
            int r2 = r4.f1009e
            int r3 = r5.f1009e
            if (r2 == r3) goto L1b
            return r1
        L1b:
            java.lang.String r2 = r4.f1007c
            java.lang.String r5 = r5.f1007c
            if (r2 == 0) goto L26
            boolean r5 = r2.equals(r5)
            return r5
        L26:
            if (r5 != 0) goto L29
            return r0
        L29:
            return r1
    }

    public org.json.JSONObject f(int r4) {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L23
            r0.<init>()     // Catch: org.json.JSONException -> L23
            java.lang.String r1 = "pkg"
            java.lang.String r2 = r3.f1007c     // Catch: org.json.JSONException -> L23
            java.lang.CharSequence r4 = a(r2, r4)     // Catch: org.json.JSONException -> L23
            org.json.JSONObject r4 = r0.put(r1, r4)     // Catch: org.json.JSONException -> L23
            java.lang.String r0 = "ver_name"
            java.lang.String r1 = r3.f1008d     // Catch: org.json.JSONException -> L23
            org.json.JSONObject r4 = r4.put(r0, r1)     // Catch: org.json.JSONException -> L23
            java.lang.String r0 = "third_sdk"
            int r1 = r3.f1011g     // Catch: org.json.JSONException -> L23
            org.json.JSONObject r4 = r4.put(r0, r1)     // Catch: org.json.JSONException -> L23
            return r4
        L23:
            r4 = 0
            return r4
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "JAppInfo{appName='"
            r0.append(r1)
            java.lang.String r1 = r3.a
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", packageName='"
            r0.append(r2)
            java.lang.String r2 = r3.f1007c
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", versionName='"
            r0.append(r2)
            java.lang.String r2 = r3.f1008d
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", versionCode="
            r0.append(r2)
            int r2 = r3.f1009e
            r0.append(r2)
            java.lang.String r2 = ", installType="
            r0.append(r2)
            int r2 = r3.f1010f
            r0.append(r2)
            java.lang.String r2 = ", thirdSdkType="
            r0.append(r2)
            int r2 = r3.f1011g
            r0.append(r2)
            java.lang.String r2 = ", signMd5='"
            r0.append(r2)
            java.lang.String r2 = r3.f1012h
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", signSha1='"
            r0.append(r2)
            java.lang.String r2 = r3.f1013i
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", signSha256='"
            r0.append(r2)
            java.lang.String r2 = r3.f1014j
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ", firstInstallTime="
            r0.append(r1)
            long r1 = r3.f1015k
            r0.append(r1)
            java.lang.String r1 = ", lastUpdateTime="
            r0.append(r1)
            long r1 = r3.l
            r0.append(r1)
            java.lang.String r1 = ", requestedPermissions="
            r0.append(r1)
            java.lang.String[] r1 = r3.m
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
