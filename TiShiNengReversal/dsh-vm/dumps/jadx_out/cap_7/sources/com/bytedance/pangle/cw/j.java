package com.bytedance.pangle.cw;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class j {
    private java.lang.String ae;
    private org.json.JSONObject cw;
    private java.lang.String j;
    private org.json.JSONObject m;
    private java.util.List<java.io.File> r;
    private java.io.File up;
    private java.lang.String xt;

    public j() {
            r0 = this;
            r0.<init>()
            return
    }

    private boolean g() {
            r10 = this;
            java.util.List<java.io.File> r0 = r10.r
            r1 = 0
            java.lang.String r2 = "DexPluginConfig check md5 fail, packageName="
            java.lang.String r3 = "Zeus/install_pangle"
            if (r0 == 0) goto Lae
            int r0 = r0.size()
            if (r0 == 0) goto Lae
            org.json.JSONObject r0 = r10.cw
            if (r0 == 0) goto Lae
            int r0 = r0.length()
            if (r0 == 0) goto Lae
            java.util.List<java.io.File> r0 = r10.r
            int r0 = r0.size()
            org.json.JSONObject r4 = r10.cw
            int r4 = r4.length()
            java.util.List<java.io.File> r5 = r10.r
            java.util.Iterator r5 = r5.iterator()
        L2b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L76
            java.lang.Object r6 = r5.next()
            java.io.File r6 = (java.io.File) r6
            java.lang.String r7 = com.bytedance.pangle.util.m.j(r6)
            if (r7 == 0) goto L41
            java.lang.String r7 = r7.toLowerCase()
        L41:
            java.lang.String r6 = r6.getName()
            java.lang.String r6 = r10.j(r6)
            boolean r8 = android.text.TextUtils.equals(r6, r7)
            if (r8 == 0) goto L54
            int r0 = r0 + (-1)
            int r4 = r4 + (-1)
            goto L2b
        L54:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r2)
            java.lang.String r9 = r10.xt
            r8.append(r9)
            java.lang.String r9 = "downloadFileMd5="
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = " configMd5="
            r8.append(r7)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            com.bytedance.pangle.log.ZeusLogger.i(r3, r6)
            goto L2b
        L76:
            if (r0 != 0) goto L7b
            if (r4 != 0) goto L7b
            r1 = 1
        L7b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "DexPluginConfig check md5 "
            r2.<init>(r5)
            if (r1 == 0) goto L87
            java.lang.String r5 = "success"
            goto L89
        L87:
            java.lang.String r5 = "fail"
        L89:
            r2.append(r5)
            java.lang.String r5 = ", packageName="
            r2.append(r5)
            java.lang.String r5 = r10.xt
            r2.append(r5)
            java.lang.String r5 = " fileSize="
            r2.append(r5)
            r2.append(r0)
            java.lang.String r0 = " configFileSize="
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = r2.toString()
            com.bytedance.pangle.log.ZeusLogger.i(r3, r0)
            return r1
        Lae:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            java.lang.String r2 = r10.xt
            r0.append(r2)
            java.lang.String r2 = " dexlist is "
            r0.append(r2)
            java.util.List<java.io.File> r2 = r10.r
            r0.append(r2)
            java.lang.String r2 = " dexlist size is "
            r0.append(r2)
            java.util.List<java.io.File> r2 = r10.r
            if (r2 != 0) goto Lcd
            r2 = -1
            goto Ld1
        Lcd:
            int r2 = r2.size()
        Ld1:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.bytedance.pangle.log.ZeusLogger.w(r3, r0)
            return r1
    }

    public static com.bytedance.pangle.cw.j j(org.json.JSONObject r2, java.io.File r3, java.util.List<java.io.File> r4) {
            com.bytedance.pangle.cw.j r0 = new com.bytedance.pangle.cw.j
            r0.<init>()
            java.lang.String r1 = "version"
            java.lang.String r1 = r2.optString(r1)
            r0.j = r1
            java.lang.String r1 = "package_name"
            java.lang.String r1 = r2.optString(r1)
            r0.xt = r1
            java.lang.String r1 = "adn_adapter_md5"
            org.json.JSONObject r1 = r2.optJSONObject(r1)
            r0.cw = r1
            java.lang.String r1 = "alias_package_name"
            java.lang.String r1 = r2.optString(r1)
            r0.ae = r1
            r0.r = r4
            r0.up = r3
            r0.m = r2
            return r0
    }

    private boolean tl() {
            r5 = this;
            com.bytedance.pangle.oq r0 = com.bytedance.pangle.oq.j()
            java.util.Map r0 = r0.up()
            java.lang.String r1 = "Zeus/install_pangle"
            if (r0 == 0) goto L45
            int r2 = r0.size()
            if (r2 <= 0) goto L45
            java.lang.String r2 = r5.xt
            java.lang.Object r2 = r0.get(r2)
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            if (r2 == 0) goto L45
            java.lang.String r3 = "packageName"
            boolean r4 = r2.has(r3)
            if (r4 == 0) goto L45
            java.lang.String r2 = r2.optString(r3)
            java.lang.String r3 = r5.xt
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L45
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "DexPluginConfig check packageName success , packageName="
            r0.<init>(r2)
            java.lang.String r2 = r5.xt
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.bytedance.pangle.log.ZeusLogger.i(r1, r0)
            r0 = 1
            return r0
        L45:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "DexPluginConfig check packageName fail, packageName="
            r2.<init>(r3)
            java.lang.String r3 = r5.xt
            r2.append(r3)
            java.lang.String r3 = ", packageManager="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.bytedance.pangle.log.ZeusLogger.w(r1, r0)
            r0 = 0
            return r0
    }

    public java.lang.String ae() {
            r1 = this;
            java.lang.String r0 = r1.ae
            return r0
    }

    public int cw() {
            r3 = this;
            java.lang.String r0 = r3.j
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L21
            java.lang.String r0 = r3.j
            java.lang.String r1 = "."
            java.lang.String r2 = ""
            java.lang.String r0 = r0.replace(r1, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L21
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L21
            int r0 = r0.intValue()     // Catch: java.lang.NumberFormatException -> L21
            return r0
        L21:
            r0 = -1
            return r0
    }

    public java.lang.String j(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L17
            org.json.JSONObject r0 = r1.cw
            if (r0 == 0) goto L17
            boolean r0 = r0.has(r2)
            if (r0 == 0) goto L17
            org.json.JSONObject r0 = r1.cw
            java.lang.String r2 = r0.optString(r2)
            return r2
        L17:
            java.lang.String r2 = ""
            return r2
    }

    public boolean j() {
            r1 = this;
            boolean r0 = r1.tl()
            if (r0 == 0) goto Le
            boolean r0 = r1.g()
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public org.json.JSONObject m() {
            r1 = this;
            org.json.JSONObject r0 = r1.m
            return r0
    }

    public java.util.List<java.io.File> r() {
            r1 = this;
            java.util.List<java.io.File> r0 = r1.r
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DexPluginConfig{mVersion='"
            r0.<init>(r1)
            java.lang.String r1 = r3.j
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", mPackageName='"
            r0.append(r2)
            java.lang.String r2 = r3.xt
            r0.append(r2)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.io.File up() {
            r1 = this;
            java.io.File r0 = r1.up
            return r0
    }

    public java.lang.String xt() {
            r1 = this;
            java.lang.String r0 = r1.xt
            return r0
    }
}
