package com.tencent.open.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class m {
    private static java.lang.String a = "";
    private static java.lang.String b = "";
    private static java.lang.String c = "";
    private static java.lang.String d = "";
    private static int e = -1;
    private static java.lang.String f = "0123456789ABCDEF";

    static {
            return
    }

    public m() {
            r1 = this;
            r1.<init>()
            return
    }

    private static char a(int r1) {
            r1 = r1 & 15
            r0 = 10
            if (r1 >= r0) goto La
            int r1 = r1 + 48
        L8:
            char r1 = (char) r1
            return r1
        La:
            int r1 = r1 + 87
            goto L8
    }

    public static long a(android.content.Context r9, android.net.Uri r10) {
            java.lang.String r1 = "cursor exception"
            java.lang.String r2 = "openSDK_LOG.Util"
            android.content.ContentResolver r3 = r9.getContentResolver()
            java.lang.String r9 = "_size"
            java.lang.String[] r5 = new java.lang.String[]{r9}
            r7 = 0
            r8 = 0
            r6 = 0
            r4 = r10
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)
            r3 = 0
            if (r10 == 0) goto L4f
            int r0 = r10.getCount()
            if (r0 != 0) goto L21
            goto L4f
        L21:
            int r9 = r10.getColumnIndexOrThrow(r9)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
            boolean r0 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
            if (r0 == 0) goto L36
            long r3 = r10.getLong(r9)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
            goto L36
        L30:
            r0 = move-exception
            r9 = r0
            goto L45
        L33:
            r0 = move-exception
            r9 = r0
            goto L40
        L36:
            r10.close()     // Catch: java.lang.Exception -> L3a
            goto L44
        L3a:
            r0 = move-exception
            r9 = r0
            com.tencent.open.log.SLog.e(r2, r1, r9)
            goto L44
        L40:
            com.tencent.open.log.SLog.e(r2, r1, r9)     // Catch: java.lang.Throwable -> L30
            goto L36
        L44:
            return r3
        L45:
            r10.close()     // Catch: java.lang.Exception -> L49
            goto L4e
        L49:
            r0 = move-exception
            r10 = r0
            com.tencent.open.log.SLog.e(r2, r1, r10)
        L4e:
            throw r9
        L4f:
            return r3
    }

    public static android.graphics.drawable.Drawable a(java.lang.String r5, android.content.Context r6) {
            java.lang.String r0 = "inputStream close exception: "
            r1 = 0
            java.lang.String r2 = "openSDK_LOG.Util"
            if (r6 != 0) goto Ld
            java.lang.String r5 = "context null!"
            com.tencent.open.log.SLog.e(r2, r5)
            return r1
        Ld:
            android.content.res.AssetManager r6 = r6.getAssets()
            java.io.InputStream r6 = r6.open(r5)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            android.graphics.drawable.Drawable r1 = android.graphics.drawable.Drawable.createFromStream(r6, r5)     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L38
            r6.close()     // Catch: java.lang.Exception -> L1d
            goto L61
        L1d:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
        L23:
            r6.append(r0)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.tencent.open.log.SLog.e(r2, r5)
            goto L61
        L35:
            r5 = move-exception
            r1 = r6
            goto L62
        L38:
            r5 = move-exception
            goto L3e
        L3a:
            r5 = move-exception
            goto L62
        L3c:
            r5 = move-exception
            r6 = r1
        L3e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r3.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = "getDrawable exception: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L35
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L35
            r3.append(r5)     // Catch: java.lang.Throwable -> L35
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L35
            com.tencent.open.log.SLog.e(r2, r5)     // Catch: java.lang.Throwable -> L35
            r6.close()     // Catch: java.lang.Exception -> L5a
            goto L61
        L5a:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            goto L23
        L61:
            return r1
        L62:
            r1.close()     // Catch: java.lang.Exception -> L66
            goto L7d
        L66:
            r6 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r6 = r6.getMessage()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            com.tencent.open.log.SLog.e(r2, r6)
        L7d:
            throw r5
    }

    public static android.net.Uri a(android.app.Activity r3, java.lang.String r4, java.lang.String r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r1 = "openSDK_LOG.Util"
            r2 = 0
            if (r0 == 0) goto Lf
            java.lang.String r3 = "grantUriPermissionToAllQQVersion -- stringForFileUri is empty"
            com.tencent.open.log.SLog.e(r1, r3)
            return r2
        Lf:
            java.lang.String r4 = com.tencent.tauth.Tencent.getAuthorities(r4)     // Catch: java.lang.Exception -> L39
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L39
            if (r0 == 0) goto L1a
            return r2
        L1a:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L39
            r0.<init>(r5)     // Catch: java.lang.Exception -> L39
            android.net.Uri r4 = androidx.core.content.FileProvider.getUriForFile(r3, r4, r0)     // Catch: java.lang.Exception -> L39
            java.lang.String r5 = "com.tencent.mobileqq"
            r0 = 3
            r3.grantUriPermission(r5, r4, r0)     // Catch: java.lang.Exception -> L39
            java.lang.String r5 = "com.tencent.tim"
            r3.grantUriPermission(r5, r4, r0)     // Catch: java.lang.Exception -> L39
            java.lang.String r5 = "com.tencent.minihd.qq"
            r3.grantUriPermission(r5, r4, r0)     // Catch: java.lang.Exception -> L39
            java.lang.String r5 = "com.tencent.qqlite"
            r3.grantUriPermission(r5, r4, r0)     // Catch: java.lang.Exception -> L39
            return r4
        L39:
            r3 = move-exception
            java.lang.String r4 = "grantUriPermissionToAllQQVersion exception:"
            com.tencent.open.log.SLog.e(r1, r4, r3)
            return r2
    }

    public static android.os.Bundle a(android.os.Bundle r1, java.lang.String r2) {
            if (r1 != 0) goto L7
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
        L7:
            java.lang.String r0 = "result"
            r1.putString(r0, r2)
            return r1
    }

    public static android.os.Bundle a(java.lang.String r7) {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            if (r7 == 0) goto L33
            java.lang.String r1 = "&"
            java.lang.String[] r7 = r7.split(r1)     // Catch: java.lang.Exception -> L31
            int r1 = r7.length     // Catch: java.lang.Exception -> L31
            r2 = 0
            r3 = 0
        L10:
            if (r3 >= r1) goto L33
            r4 = r7[r3]     // Catch: java.lang.Exception -> L31
            java.lang.String r5 = "="
            java.lang.String[] r4 = a(r4, r5)     // Catch: java.lang.Exception -> L31
            int r5 = r4.length     // Catch: java.lang.Exception -> L31
            r6 = 2
            if (r5 != r6) goto L2e
            r5 = r4[r2]     // Catch: java.lang.Exception -> L31
            java.lang.String r5 = java.net.URLDecoder.decode(r5)     // Catch: java.lang.Exception -> L31
            r6 = 1
            r4 = r4[r6]     // Catch: java.lang.Exception -> L31
            java.lang.String r4 = java.net.URLDecoder.decode(r4)     // Catch: java.lang.Exception -> L31
            r0.putString(r5, r4)     // Catch: java.lang.Exception -> L31
        L2e:
            int r3 = r3 + 1
            goto L10
        L31:
            r7 = 0
            return r7
        L33:
            return r0
    }

    public static android.os.Bundle a(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
            java.lang.String r9 = ""
            java.lang.String r10 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = ""
            java.lang.String r8 = ""
            r0 = r11
            r3 = r12
            r1 = r13
            r2 = r14
            r4 = r15
            android.os.Bundle r11 = a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
    }

    public static android.os.Bundle a(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17) {
            java.lang.String r10 = ""
            java.lang.String r11 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = ""
            java.lang.String r8 = ""
            java.lang.String r9 = ""
            r0 = r12
            r3 = r13
            r1 = r14
            r2 = r15
            r4 = r16
            r5 = r17
            android.os.Bundle r12 = a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r12
    }

    public static android.os.Bundle a(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "openid"
            r0.putString(r1, r2)
            java.lang.String r2 = "report_type"
            r0.putString(r2, r3)
            java.lang.String r2 = "act_type"
            r0.putString(r2, r4)
            java.lang.String r2 = "via"
            r0.putString(r2, r5)
            java.lang.String r2 = "app_id"
            r0.putString(r2, r6)
            java.lang.String r2 = "type"
            r0.putString(r2, r7)
            java.lang.String r2 = "login_status"
            r0.putString(r2, r8)
            java.lang.String r2 = "need_user_auth"
            r0.putString(r2, r9)
            java.lang.String r2 = "to_uin"
            r0.putString(r2, r10)
            java.lang.String r2 = "call_source"
            r0.putString(r2, r11)
            java.lang.String r2 = "to_type"
            r0.putString(r2, r12)
            java.lang.String r2 = "platform"
            java.lang.String r3 = "1"
            r0.putString(r2, r3)
            return r0
    }

    public static android.os.Bundle a(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            android.os.Bundle r11 = a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r12 = r16
            android.os.Bundle r11 = a(r11, r12)
            return r11
    }

    public static final java.lang.String a(android.content.Context r1) {
            if (r1 == 0) goto L15
            android.content.pm.PackageManager r0 = r1.getPackageManager()
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()
            java.lang.CharSequence r1 = r0.getApplicationLabel(r1)
            if (r1 == 0) goto L15
            java.lang.String r1 = r1.toString()
            return r1
        L15:
            r1 = 0
            return r1
    }

    public static java.lang.String a(java.lang.String r1, int r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L2c
            java.lang.String r0 = "UTF-8"
            byte[] r1 = r1.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L11
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r2)     // Catch: java.io.UnsupportedEncodingException -> L11
            return r1
        L11:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "convert2Base64String exception: "
            r2.append(r0)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "openSDK_LOG.Util"
            com.tencent.open.log.SLog.e(r2, r1)
        L2c:
            java.lang.String r1 = ""
            return r1
    }

    public static final java.lang.String a(java.lang.String r5, int r6, java.lang.String r7, java.lang.String r8) {
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L9
            java.lang.String r5 = ""
            return r5
        L9:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L10
            goto L12
        L10:
            java.lang.String r7 = "UTF-8"
        L12:
            byte[] r0 = r5.getBytes(r7)     // Catch: java.lang.Exception -> L4b
            int r0 = r0.length     // Catch: java.lang.Exception -> L4b
            if (r0 > r6) goto L1a
            goto L50
        L1a:
            r0 = 0
            r1 = 0
            r2 = 0
        L1d:
            int r3 = r5.length()     // Catch: java.lang.Exception -> L4b
            if (r1 >= r3) goto L50
            int r3 = r1 + 1
            java.lang.String r4 = r5.substring(r1, r3)     // Catch: java.lang.Exception -> L4b
            byte[] r4 = r4.getBytes(r7)     // Catch: java.lang.Exception -> L4b
            int r4 = r4.length     // Catch: java.lang.Exception -> L4b
            int r2 = r2 + r4
            if (r2 <= r6) goto L4e
            java.lang.String r5 = r5.substring(r0, r1)     // Catch: java.lang.Exception -> L4b
            boolean r6 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Exception -> L4b
            if (r6 != 0) goto L4d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4b
            r6.<init>()     // Catch: java.lang.Exception -> L4b
            r6.append(r5)     // Catch: java.lang.Exception -> L4b
            r6.append(r8)     // Catch: java.lang.Exception -> L4b
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Exception -> L4b
            return r5
        L4b:
            r6 = move-exception
            goto L51
        L4d:
            return r5
        L4e:
            r1 = r3
            goto L1d
        L50:
            return r5
        L51:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Util.subString has exception: "
            r7.append(r8)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "openSDK_LOG.Util"
            com.tencent.open.log.SLog.e(r7, r6)
            return r5
    }

    public static java.lang.String a(java.lang.String r5, android.app.Activity r6, java.lang.String r7, com.tencent.tauth.IUiListener r8) {
            java.lang.String r8 = "openSDK_LOG.Util"
            r0 = 0
            boolean r1 = m(r7)     // Catch: java.lang.Exception -> L4e
            boolean r2 = c()     // Catch: java.lang.Exception -> L4e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4e
            r3.<init>()     // Catch: java.lang.Exception -> L4e
            java.lang.String r4 = "doPublishMood() check file: isAppSpecificDir="
            r3.append(r4)     // Catch: java.lang.Exception -> L4e
            r3.append(r1)     // Catch: java.lang.Exception -> L4e
            java.lang.String r4 = ",hasSDPermission="
            r3.append(r4)     // Catch: java.lang.Exception -> L4e
            r3.append(r2)     // Catch: java.lang.Exception -> L4e
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Exception -> L4e
            com.tencent.open.log.SLog.i(r8, r2)     // Catch: java.lang.Exception -> L4e
            if (r1 == 0) goto L2b
            goto La4
        L2b:
            java.lang.String r1 = "Images"
            java.io.File r1 = com.tencent.open.utils.g.a(r1)     // Catch: java.lang.Exception -> L4e
            if (r1 == 0) goto L50
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4e
            r2.<init>()     // Catch: java.lang.Exception -> L4e
            java.lang.String r1 = r1.getAbsolutePath()     // Catch: java.lang.Exception -> L4e
            r2.append(r1)     // Catch: java.lang.Exception -> L4e
            java.lang.String r1 = java.io.File.separator     // Catch: java.lang.Exception -> L4e
            r2.append(r1)     // Catch: java.lang.Exception -> L4e
            java.lang.String r1 = com.tencent.connect.common.Constants.QQ_SHARE_TEMP_DIR     // Catch: java.lang.Exception -> L4e
            r2.append(r1)     // Catch: java.lang.Exception -> L4e
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L4e
            goto L7a
        L4e:
            r5 = move-exception
            goto Lb0
        L50:
            android.content.Context r1 = com.tencent.open.utils.g.a()     // Catch: java.lang.Exception -> L4e
            java.io.File r1 = r1.getCacheDir()     // Catch: java.lang.Exception -> L4e
            if (r1 != 0) goto L60
            java.lang.String r5 = "getMediaFileUri error, cacheDir is null"
            com.tencent.open.log.SLog.e(r8, r5)     // Catch: java.lang.Exception -> L4e
            return r0
        L60:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4e
            r2.<init>()     // Catch: java.lang.Exception -> L4e
            java.lang.String r1 = r1.getAbsolutePath()     // Catch: java.lang.Exception -> L4e
            r2.append(r1)     // Catch: java.lang.Exception -> L4e
            java.lang.String r1 = java.io.File.separator     // Catch: java.lang.Exception -> L4e
            r2.append(r1)     // Catch: java.lang.Exception -> L4e
            java.lang.String r1 = com.tencent.connect.common.Constants.QQ_SHARE_TEMP_DIR     // Catch: java.lang.Exception -> L4e
            r2.append(r1)     // Catch: java.lang.Exception -> L4e
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L4e
        L7a:
            java.io.File r2 = new java.io.File     // Catch: java.lang.Exception -> L4e
            r2.<init>(r7)     // Catch: java.lang.Exception -> L4e
            java.lang.String r7 = r2.getAbsolutePath()     // Catch: java.lang.Exception -> L4e
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Exception -> L4e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4e
            r3.<init>()     // Catch: java.lang.Exception -> L4e
            r3.append(r1)     // Catch: java.lang.Exception -> L4e
            java.lang.String r1 = java.io.File.separator     // Catch: java.lang.Exception -> L4e
            r3.append(r1)     // Catch: java.lang.Exception -> L4e
            r3.append(r2)     // Catch: java.lang.Exception -> L4e
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Exception -> L4e
            boolean r7 = b(r7, r1)     // Catch: java.lang.Exception -> L4e
            if (r7 == 0) goto La3
            r7 = r1
            goto La4
        La3:
            r7 = r0
        La4:
            android.net.Uri r5 = a(r6, r5, r7)     // Catch: java.lang.Exception -> L4e
            if (r5 != 0) goto Lab
            return r0
        Lab:
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L4e
            return r5
        Lb0:
            java.lang.String r6 = "getMediaFileUri error"
            com.tencent.open.log.SLog.e(r8, r6, r5)
            return r0
    }

    public static java.lang.String a(java.util.Map<java.lang.String, java.lang.Object> r2, java.lang.String r3, java.lang.String r4) {
            java.lang.String r0 = "openSDK_LOG.Util"
            if (r2 != 0) goto La
            java.lang.String r2 = "getString error, params==null"
            com.tencent.open.log.SLog.e(r0, r2)
            return r4
        La:
            boolean r1 = r2.containsKey(r3)
            if (r1 != 0) goto L25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "getString error, not comtain : "
            r2.append(r1)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.open.log.SLog.e(r0, r2)
            return r4
        L25:
            java.lang.Object r2 = r2.get(r3)
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L30
            java.lang.String r2 = (java.lang.String) r2
            return r2
        L30:
            return r4
    }

    public static java.lang.String a(byte[] r5) {
            if (r5 != 0) goto L4
            r5 = 0
            return r5
        L4:
            int r0 = r5.length
            int r0 = r0 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = 0
        Ld:
            int r2 = r5.length
            if (r0 >= r2) goto L38
            r2 = r5[r0]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 16
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            int r3 = r2.length()
            r4 = 1
            if (r3 != r4) goto L32
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "0"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
        L32:
            r1.append(r2)
            int r0 = r0 + 1
            goto Ld
        L38:
            java.lang.String r5 = r1.toString()
            return r5
    }

    public static org.json.JSONObject a(org.json.JSONObject r6, java.lang.String r7) {
            if (r6 != 0) goto L7
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
        L7:
            if (r7 == 0) goto L57
            java.lang.String r0 = "&"
            java.lang.String[] r7 = r7.split(r0)
            int r0 = r7.length
            r1 = 0
            r2 = 0
        L12:
            if (r2 >= r0) goto L57
            r3 = r7[r2]
            java.lang.String r4 = "="
            java.lang.String[] r3 = r3.split(r4)
            int r4 = r3.length
            r5 = 2
            if (r4 != r5) goto L54
            r4 = 1
            r5 = r3[r1]     // Catch: java.lang.Exception -> L31
            java.lang.String r5 = java.net.URLDecoder.decode(r5)     // Catch: java.lang.Exception -> L31
            r3[r1] = r5     // Catch: java.lang.Exception -> L31
            r5 = r3[r4]     // Catch: java.lang.Exception -> L31
            java.lang.String r5 = java.net.URLDecoder.decode(r5)     // Catch: java.lang.Exception -> L31
            r3[r4] = r5     // Catch: java.lang.Exception -> L31
        L31:
            r5 = r3[r1]     // Catch: org.json.JSONException -> L39
            r3 = r3[r4]     // Catch: org.json.JSONException -> L39
            r6.put(r5, r3)     // Catch: org.json.JSONException -> L39
            goto L54
        L39:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "decodeUrlToJson has exception: "
            r4.append(r5)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "openSDK_LOG.Util"
            com.tencent.open.log.SLog.e(r4, r3)
        L54:
            int r2 = r2 + 1
            goto L12
        L57:
            return r6
    }

    private static void a(android.content.Context r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            android.content.ComponentName r1 = new android.content.ComponentName
            r1.<init>(r3, r4)
            r0.setComponent(r1)
            java.lang.String r3 = "android.intent.action.VIEW"
            r0.setAction(r3)
            r3 = 1073741824(0x40000000, float:2.0)
            r0.addFlags(r3)
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r3)
            android.net.Uri r3 = android.net.Uri.parse(r5)
            r0.setData(r3)
            r2.startActivity(r0)
            return
    }

    public static boolean a() {
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            java.lang.String r1 = "mounted"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L11
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    public static boolean a(android.content.Context r7, java.lang.String r8) {
            java.lang.String r0 = "com.android.browser"
            java.lang.String r1 = "com.android.browser.BrowserActivity"
            r2 = 0
            boolean r3 = g(r7)     // Catch: java.lang.Exception -> L19
            if (r3 == 0) goto L15
            java.lang.String r4 = "com.tencent.mtt"
            java.lang.String r5 = "com.tencent.mtt.MainActivity"
            a(r7, r4, r5, r8)     // Catch: java.lang.Exception -> L13
            goto L37
        L13:
            goto L1b
        L15:
            a(r7, r0, r1, r8)     // Catch: java.lang.Exception -> L13
            goto L37
        L19:
            r3 = 0
        L1b:
            java.lang.String r4 = "com.google.android.apps.chrome.Main"
            java.lang.String r5 = "com.android.chrome"
            java.lang.String r6 = "com.google.android.browser"
            if (r3 == 0) goto L30
            a(r7, r0, r1, r8)     // Catch: java.lang.Exception -> L27
            goto L37
        L27:
            a(r7, r6, r1, r8)     // Catch: java.lang.Exception -> L2b
            goto L37
        L2b:
            a(r7, r5, r4, r8)     // Catch: java.lang.Exception -> L2f
            goto L37
        L2f:
            return r2
        L30:
            a(r7, r6, r1, r8)     // Catch: java.lang.Exception -> L34
            goto L37
        L34:
            a(r7, r5, r4, r8)     // Catch: java.lang.Exception -> L39
        L37:
            r7 = 1
            return r7
        L39:
            return r2
    }

    public static boolean a(android.content.Context r0, java.lang.String r1, java.lang.String r2) {
            boolean r0 = b(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "copyFileByCheckPermission() copy success:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "openSDK_LOG.Util"
            com.tencent.open.log.SLog.i(r2, r1)
            return r0
    }

    public static boolean a(android.content.Context r1, boolean r2) {
            boolean r2 = c(r1)
            r0 = 1
            if (r2 == 0) goto L10
            java.lang.String r2 = "com.tencent.minihd.qq"
            java.lang.String r2 = com.tencent.open.utils.k.a(r1, r2)
            if (r2 == 0) goto L10
            return r0
        L10:
            java.lang.String r2 = "4.1"
            int r2 = com.tencent.open.utils.k.c(r1, r2)
            if (r2 >= 0) goto L22
            java.lang.String r2 = "com.tencent.tim"
            java.lang.String r1 = com.tencent.open.utils.k.a(r1, r2)
            if (r1 != 0) goto L22
            r1 = 0
            return r1
        L22:
            return r0
    }

    public static boolean a(java.io.File r6, java.io.File r7) {
            java.lang.String r0 = "copyFile error, "
            java.lang.String r1 = "openSDK_LOG.Util"
            r2 = 0
            r3 = 0
            boolean r4 = r7.exists()     // Catch: java.lang.Throwable -> L10 java.lang.OutOfMemoryError -> L14 java.io.IOException -> L18
            if (r4 == 0) goto L1c
            r7.delete()     // Catch: java.lang.Throwable -> L10 java.lang.OutOfMemoryError -> L14 java.io.IOException -> L18
            goto L1c
        L10:
            r6 = move-exception
            r7 = r2
            goto La4
        L14:
            r6 = move-exception
            r7 = r2
            goto L79
        L18:
            r6 = move-exception
            r7 = r2
            goto L93
        L1c:
            java.io.File r4 = r7.getParentFile()     // Catch: java.lang.Throwable -> L10 java.lang.OutOfMemoryError -> L14 java.io.IOException -> L18
            if (r4 == 0) goto L33
            java.io.File r4 = r7.getParentFile()     // Catch: java.lang.Throwable -> L10 java.lang.OutOfMemoryError -> L14 java.io.IOException -> L18
            boolean r4 = r4.exists()     // Catch: java.lang.Throwable -> L10 java.lang.OutOfMemoryError -> L14 java.io.IOException -> L18
            if (r4 != 0) goto L33
            java.io.File r4 = r7.getParentFile()     // Catch: java.lang.Throwable -> L10 java.lang.OutOfMemoryError -> L14 java.io.IOException -> L18
            r4.mkdirs()     // Catch: java.lang.Throwable -> L10 java.lang.OutOfMemoryError -> L14 java.io.IOException -> L18
        L33:
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L10 java.lang.OutOfMemoryError -> L14 java.io.IOException -> L18
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L10 java.lang.OutOfMemoryError -> L14 java.io.IOException -> L18
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L70 java.lang.OutOfMemoryError -> L73 java.io.IOException -> L76
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L70 java.lang.OutOfMemoryError -> L73 java.io.IOException -> L76
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L70 java.lang.OutOfMemoryError -> L73 java.io.IOException -> L76
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L70 java.lang.OutOfMemoryError -> L73 java.io.IOException -> L76
            r6 = 102400(0x19000, float:1.43493E-40)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L55 java.lang.OutOfMemoryError -> L58 java.io.IOException -> L5b
        L47:
            int r2 = r7.read(r6)     // Catch: java.lang.Throwable -> L55 java.lang.OutOfMemoryError -> L58 java.io.IOException -> L5b
            r5 = -1
            if (r2 == r5) goto L5e
            r4.write(r6, r3, r2)     // Catch: java.lang.Throwable -> L55 java.lang.OutOfMemoryError -> L58 java.io.IOException -> L5b
            r4.flush()     // Catch: java.lang.Throwable -> L55 java.lang.OutOfMemoryError -> L58 java.io.IOException -> L5b
            goto L47
        L55:
            r6 = move-exception
        L56:
            r2 = r4
            goto La4
        L58:
            r6 = move-exception
        L59:
            r2 = r4
            goto L79
        L5b:
            r6 = move-exception
        L5c:
            r2 = r4
            goto L93
        L5e:
            r4.close()     // Catch: java.io.IOException -> L62
            goto L66
        L62:
            r6 = move-exception
            com.tencent.open.log.SLog.e(r1, r0, r6)
        L66:
            r7.close()     // Catch: java.io.IOException -> L6a
            goto L6e
        L6a:
            r6 = move-exception
            com.tencent.open.log.SLog.e(r1, r0, r6)
        L6e:
            r3 = 1
            goto La3
        L70:
            r6 = move-exception
            r7 = r2
            goto L56
        L73:
            r6 = move-exception
            r7 = r2
            goto L59
        L76:
            r6 = move-exception
            r7 = r2
            goto L5c
        L79:
            com.tencent.open.log.SLog.e(r1, r0, r6)     // Catch: java.lang.Throwable -> L91
            if (r2 == 0) goto L86
            r2.close()     // Catch: java.io.IOException -> L82
            goto L86
        L82:
            r6 = move-exception
            com.tencent.open.log.SLog.e(r1, r0, r6)
        L86:
            if (r7 == 0) goto La3
        L88:
            r7.close()     // Catch: java.io.IOException -> L8c
            goto La3
        L8c:
            r6 = move-exception
            com.tencent.open.log.SLog.e(r1, r0, r6)
            goto La3
        L91:
            r6 = move-exception
            goto La4
        L93:
            com.tencent.open.log.SLog.e(r1, r0, r6)     // Catch: java.lang.Throwable -> L91
            if (r2 == 0) goto La0
            r2.close()     // Catch: java.io.IOException -> L9c
            goto La0
        L9c:
            r6 = move-exception
            com.tencent.open.log.SLog.e(r1, r0, r6)
        La0:
            if (r7 == 0) goto La3
            goto L88
        La3:
            return r3
        La4:
            if (r2 == 0) goto Lae
            r2.close()     // Catch: java.io.IOException -> Laa
            goto Lae
        Laa:
            r2 = move-exception
            com.tencent.open.log.SLog.e(r1, r0, r2)
        Lae:
            if (r7 == 0) goto Lb8
            r7.close()     // Catch: java.io.IOException -> Lb4
            goto Lb8
        Lb4:
            r7 = move-exception
            com.tencent.open.log.SLog.e(r1, r0, r7)
        Lb8:
            throw r6
    }

    public static boolean a(java.util.Map<java.lang.String, java.lang.Object> r2, java.lang.String r3, boolean r4) {
            java.lang.String r0 = "openSDK_LOG.Util"
            if (r2 != 0) goto La
            java.lang.String r2 = "getBoolean error, params==null"
            com.tencent.open.log.SLog.e(r0, r2)
            return r4
        La:
            boolean r1 = r2.containsKey(r3)
            if (r1 != 0) goto L25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "getBoolean error, not comtain : "
            r2.append(r1)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.open.log.SLog.e(r0, r2)
            return r4
        L25:
            java.lang.Object r2 = r2.get(r3)
            boolean r3 = r2 instanceof java.lang.Boolean
            if (r3 == 0) goto L34
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            return r2
        L34:
            return r4
    }

    public static java.lang.String[] a(java.lang.String r2, java.lang.String r3) {
            int r0 = r2.indexOf(r3)
            r1 = -1
            if (r0 != r1) goto Lc
            java.lang.String[] r2 = new java.lang.String[]{r2}
            return r2
        Lc:
            r1 = 0
            java.lang.String r1 = r2.substring(r1, r0)
            int r3 = r3.length()
            int r0 = r0 + r3
            java.lang.String r2 = r2.substring(r0)
            java.lang.String[] r2 = new java.lang.String[]{r1, r2}
            return r2
    }

    public static android.os.Bundle b(java.lang.String r2) {
            java.lang.String r0 = "auth://"
            java.lang.String r1 = "http://"
            java.lang.String r2 = r2.replace(r0, r1)
            java.net.URL r0 = new java.net.URL     // Catch: java.net.MalformedURLException -> L21
            r0.<init>(r2)     // Catch: java.net.MalformedURLException -> L21
            java.lang.String r2 = r0.getQuery()     // Catch: java.net.MalformedURLException -> L21
            android.os.Bundle r2 = a(r2)     // Catch: java.net.MalformedURLException -> L21
            java.lang.String r0 = r0.getRef()     // Catch: java.net.MalformedURLException -> L21
            android.os.Bundle r0 = a(r0)     // Catch: java.net.MalformedURLException -> L21
            r2.putAll(r0)     // Catch: java.net.MalformedURLException -> L21
            return r2
        L21:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            return r2
    }

    public static java.lang.String b() {
            java.io.File r0 = com.tencent.open.utils.g.e()
            if (r0 == 0) goto L14
            boolean r1 = r0.exists()
            if (r1 != 0) goto Lf
            r0.mkdirs()
        Lf:
            java.lang.String r0 = r0.toString()
            return r0
        L14:
            r0 = 0
            return r0
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static java.lang.String b(android.content.Context r6, android.net.Uri r7) {
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            boolean r1 = android.provider.DocumentsContract.isDocumentUri(r6, r7)
            if (r1 == 0) goto Lc2
            java.lang.String r1 = r7.getAuthority()
            java.lang.String r2 = "com.android.externalstorage.documents"
            boolean r2 = r2.equals(r1)
            r3 = 0
            java.lang.String r4 = ":"
            r5 = 1
            if (r2 == 0) goto L52
            java.lang.String r6 = android.provider.DocumentsContract.getDocumentId(r7)
            java.lang.String[] r6 = r6.split(r4)
            r7 = r6[r3]
            java.lang.String r0 = "primary"
            boolean r0 = r0.equals(r7)
            java.lang.String r1 = "/"
            if (r0 == 0) goto L41
            java.io.File r7 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r7 = r7.getAbsolutePath()
            java.lang.String r7 = r7.concat(r1)
            r6 = r6[r5]
            java.lang.String r6 = r7.concat(r6)
            return r6
        L41:
            java.lang.String r0 = "/storage/"
            java.lang.String r7 = r0.concat(r7)
            java.lang.String r7 = r7.concat(r1)
            r6 = r6[r5]
            java.lang.String r6 = r7.concat(r6)
            return r6
        L52:
            java.lang.String r2 = "com.android.providers.downloads.documents"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L80
            java.lang.String r7 = android.provider.DocumentsContract.getDocumentId(r7)
            java.lang.String r0 = "raw:"
            boolean r1 = r7.startsWith(r0)
            if (r1 == 0) goto L6d
            java.lang.String r6 = ""
            java.lang.String r6 = r7.replaceFirst(r0, r6)
            return r6
        L6d:
            java.lang.String r0 = "content://downloads/public_downloads"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            long r1 = java.lang.Long.parseLong(r7)
            android.net.Uri r7 = android.content.ContentUris.withAppendedId(r0, r1)
            java.lang.String r6 = c(r6, r7)
            return r6
        L80:
            java.lang.String r2 = "com.android.providers.media.documents"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto Lc1
            java.lang.String r7 = android.provider.DocumentsContract.getDocumentId(r7)
            java.lang.String[] r7 = r7.split(r4)
            r1 = r7[r3]
            java.lang.String r2 = "image"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L9d
            android.net.Uri r0 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            goto Lb2
        L9d:
            java.lang.String r2 = "video"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto La8
            android.net.Uri r0 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            goto Lb2
        La8:
            java.lang.String r2 = "audio"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto Lc1
            android.net.Uri r0 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
        Lb2:
            r7 = r7[r5]
            long r1 = java.lang.Long.parseLong(r7)
            android.net.Uri r7 = android.content.ContentUris.withAppendedId(r0, r1)
            java.lang.String r6 = c(r6, r7)
            return r6
        Lc1:
            return r0
        Lc2:
            java.lang.String r1 = r7.getScheme()
            java.lang.String r2 = "content"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto Ld3
            java.lang.String r6 = c(r6, r7)
            return r6
        Ld3:
            java.lang.String r6 = "file"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto Le0
            java.lang.String r6 = r7.getPath()
            return r6
        Le0:
            return r0
    }

    public static void b(android.content.Context r5, java.lang.String r6) {
            java.lang.String r0 = "getPackageInfo has exception: "
            java.lang.String r1 = "openSDK_LOG.Util"
            if (r5 != 0) goto L7
            goto L6a
        L7:
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.lang.Exception -> L39 android.content.pm.PackageManager.NameNotFoundException -> L3b
            r2 = 0
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r6, r2)     // Catch: java.lang.Exception -> L39 android.content.pm.PackageManager.NameNotFoundException -> L3b
            java.lang.String r6 = r5.versionName     // Catch: java.lang.Exception -> L39 android.content.pm.PackageManager.NameNotFoundException -> L3b
            com.tencent.open.utils.m.b = r6     // Catch: java.lang.Exception -> L39 android.content.pm.PackageManager.NameNotFoundException -> L3b
            r3 = 46
            int r4 = r6.lastIndexOf(r3)     // Catch: java.lang.Exception -> L39 android.content.pm.PackageManager.NameNotFoundException -> L3b
            java.lang.String r6 = r6.substring(r2, r4)     // Catch: java.lang.Exception -> L39 android.content.pm.PackageManager.NameNotFoundException -> L3b
            com.tencent.open.utils.m.a = r6     // Catch: java.lang.Exception -> L39 android.content.pm.PackageManager.NameNotFoundException -> L3b
            java.lang.String r6 = com.tencent.open.utils.m.b     // Catch: java.lang.Exception -> L39 android.content.pm.PackageManager.NameNotFoundException -> L3b
            int r2 = r6.lastIndexOf(r3)     // Catch: java.lang.Exception -> L39 android.content.pm.PackageManager.NameNotFoundException -> L3b
            int r2 = r2 + 1
            java.lang.String r3 = com.tencent.open.utils.m.b     // Catch: java.lang.Exception -> L39 android.content.pm.PackageManager.NameNotFoundException -> L3b
            int r3 = r3.length()     // Catch: java.lang.Exception -> L39 android.content.pm.PackageManager.NameNotFoundException -> L3b
            java.lang.String r6 = r6.substring(r2, r3)     // Catch: java.lang.Exception -> L39 android.content.pm.PackageManager.NameNotFoundException -> L3b
            com.tencent.open.utils.m.d = r6     // Catch: java.lang.Exception -> L39 android.content.pm.PackageManager.NameNotFoundException -> L3b
            int r5 = r5.versionCode     // Catch: java.lang.Exception -> L39 android.content.pm.PackageManager.NameNotFoundException -> L3b
            com.tencent.open.utils.m.e = r5     // Catch: java.lang.Exception -> L39 android.content.pm.PackageManager.NameNotFoundException -> L3b
            return
        L39:
            r5 = move-exception
            goto L3d
        L3b:
            r5 = move-exception
            goto L54
        L3d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.tencent.open.log.SLog.e(r1, r5)
            goto L6a
        L54:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.tencent.open.log.SLog.e(r1, r5)
        L6a:
            return
    }

    public static boolean b(android.content.Context r5) {
            r0 = 1
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = i(r5, r1)
            if (r1 == 0) goto Ld
            return r0
        Ld:
            java.lang.String r1 = "connectivity"
            java.lang.Object r5 = r5.getSystemService(r1)
            android.net.ConnectivityManager r5 = (android.net.ConnectivityManager) r5
            if (r5 != 0) goto L18
            return r0
        L18:
            android.net.NetworkInfo[] r5 = r5.getAllNetworkInfo()     // Catch: java.lang.Exception -> L1d
            goto L26
        L1d:
            r5 = move-exception
            java.lang.String r1 = "openSDK_LOG.Util"
            java.lang.String r2 = "Util.isNetWorkAvailable has exception: "
            com.tencent.open.log.SLog.e(r1, r2, r5)
            r5 = 0
        L26:
            r1 = 0
            if (r5 == 0) goto L3d
            int r2 = r5.length
            if (r2 != 0) goto L2d
            goto L3d
        L2d:
            int r2 = r5.length
            r3 = 0
        L2f:
            if (r3 >= r2) goto L3d
            r4 = r5[r3]
            boolean r4 = r4.isConnectedOrConnecting()
            if (r4 == 0) goto L3a
            return r0
        L3a:
            int r3 = r3 + 1
            goto L2f
        L3d:
            return r1
    }

    public static boolean b(java.lang.String r3, java.lang.String r4) {
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L38
            java.io.File r1 = l(r4)     // Catch: java.io.IOException -> L14
            boolean r3 = a(r0, r1)     // Catch: java.io.IOException -> L14
            return r3
        L14:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "copy fail from "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " to "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = " "
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r4 = "openSDK_LOG.Util"
            com.tencent.open.log.SLog.d(r4, r3, r0)
        L38:
            r3 = 0
            return r3
    }

    public static java.lang.String c(android.content.Context r11, android.net.Uri r12) {
            java.lang.String r1 = "close fileOutputStream error"
            java.lang.String r2 = "close ParcelFileDescriptor error"
            java.lang.String r3 = "close fileIuputStream error"
            java.lang.String r0 = "_data"
            java.lang.String[] r6 = new java.lang.String[]{r0}
            r10 = 0
            android.content.ContentResolver r4 = r11.getContentResolver()     // Catch: java.lang.Exception -> L2f
            r8 = 0
            r9 = 0
            r7 = 0
            r5 = r12
            android.database.Cursor r12 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L2c
            if (r12 == 0) goto L1d8
            boolean r4 = r12.moveToFirst()     // Catch: java.lang.Exception -> L2a
            if (r4 == 0) goto L1d8
            int r0 = r12.getColumnIndexOrThrow(r0)     // Catch: java.lang.Exception -> L2a
            java.lang.String r11 = r12.getString(r0)     // Catch: java.lang.Exception -> L2a
            return r11
        L2a:
            r0 = move-exception
            goto L32
        L2c:
            r0 = move-exception
        L2d:
            r12 = r10
            goto L32
        L2f:
            r0 = move-exception
            r5 = r12
            goto L2d
        L32:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "queryAbsolutePath error : "
            r4.append(r6)
            java.lang.String r0 = r0.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.String r4 = "openSDK_LOG.Util"
            com.tencent.open.log.SLog.e(r4, r0)
            if (r12 == 0) goto L51
            r12.close()
        L51:
            android.content.ContentResolver r12 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L15b java.lang.Exception -> L161
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r12 = r12.openFileDescriptor(r5, r0)     // Catch: java.lang.Throwable -> L15b java.lang.Exception -> L161
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L14f java.lang.Exception -> L155
            java.io.FileDescriptor r0 = r12.getFileDescriptor()     // Catch: java.lang.Throwable -> L14f java.lang.Exception -> L155
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L14f java.lang.Exception -> L155
            java.lang.String r0 = "Images"
            java.io.File r11 = h(r11, r0)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lb1
            if (r11 != 0) goto Lb7
            java.lang.String r11 = "getExternalFilesDir return null"
            com.tencent.open.log.SLog.e(r4, r11)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lb1
            r6.close()     // Catch: java.io.IOException -> L75
            goto L8d
        L75:
            r0 = move-exception
            r11 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r11 = r11.getMessage()
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            com.tencent.open.log.SLog.e(r4, r11)
        L8d:
            r12.close()     // Catch: java.io.IOException -> L91
            goto La9
        L91:
            r0 = move-exception
            r11 = r0
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r2)
            java.lang.String r11 = r11.getMessage()
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            com.tencent.open.log.SLog.e(r4, r11)
        La9:
            return r10
        Laa:
            r0 = move-exception
            r11 = r0
            r5 = r12
            r12 = r10
        Lae:
            r10 = r6
            goto L1dd
        Lb1:
            r0 = move-exception
            r11 = r0
            r5 = r12
            r12 = r10
            goto L166
        Lb7:
            boolean r0 = r11.exists()     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lb1
            if (r0 != 0) goto Lc0
            r11.mkdirs()     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lb1
        Lc0:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lb1
            java.lang.String r5 = r5.getLastPathSegment()     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lb1
            r0.<init>(r11, r5)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lb1
            boolean r11 = r0.exists()     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lb1
            if (r11 != 0) goto Ld2
            r0.createNewFile()     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lb1
        Ld2:
            java.io.FileOutputStream r11 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lb1
            r11.<init>(r0)     // Catch: java.lang.Throwable -> Laa java.lang.Exception -> Lb1
            r5 = 2048(0x800, float:2.87E-42)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> Le7 java.lang.Exception -> Lee
        Ldb:
            int r7 = r6.read(r5)     // Catch: java.lang.Throwable -> Le7 java.lang.Exception -> Lee
            r8 = -1
            if (r7 == r8) goto Lf4
            r8 = 0
            r11.write(r5, r8, r7)     // Catch: java.lang.Throwable -> Le7 java.lang.Exception -> Lee
            goto Ldb
        Le7:
            r0 = move-exception
            r5 = r12
            r10 = r6
            r12 = r11
            r11 = r0
            goto L1dd
        Lee:
            r0 = move-exception
            r5 = r12
            r12 = r11
            r11 = r0
            goto L166
        Lf4:
            r11.flush()     // Catch: java.lang.Throwable -> Le7 java.lang.Exception -> Lee
            java.lang.String r5 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> Le7 java.lang.Exception -> Lee
            r6.close()     // Catch: java.io.IOException -> Lff
            goto L116
        Lff:
            r0 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.String r0 = r0.getMessage()
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.tencent.open.log.SLog.e(r4, r0)
        L116:
            r11.close()     // Catch: java.io.IOException -> L11a
            goto L132
        L11a:
            r0 = move-exception
            r11 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r11 = r11.getMessage()
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            com.tencent.open.log.SLog.e(r4, r11)
        L132:
            r12.close()     // Catch: java.io.IOException -> L136
            goto L14e
        L136:
            r0 = move-exception
            r11 = r0
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r2)
            java.lang.String r11 = r11.getMessage()
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            com.tencent.open.log.SLog.e(r4, r11)
        L14e:
            return r5
        L14f:
            r0 = move-exception
            r11 = r0
            r5 = r12
            r12 = r10
            goto L1dd
        L155:
            r0 = move-exception
            r11 = r0
            r5 = r12
            r12 = r10
            r6 = r12
            goto L166
        L15b:
            r0 = move-exception
            r11 = r0
            r12 = r10
            r5 = r12
            goto L1dd
        L161:
            r0 = move-exception
            r11 = r0
            r12 = r10
            r5 = r12
            r6 = r5
        L166:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d9
            r0.<init>()     // Catch: java.lang.Throwable -> L1d9
            java.lang.String r7 = "copy file from uri error : "
            r0.append(r7)     // Catch: java.lang.Throwable -> L1d9
            java.lang.String r11 = r11.getMessage()     // Catch: java.lang.Throwable -> L1d9
            r0.append(r11)     // Catch: java.lang.Throwable -> L1d9
            java.lang.String r11 = r0.toString()     // Catch: java.lang.Throwable -> L1d9
            com.tencent.open.log.SLog.e(r4, r11)     // Catch: java.lang.Throwable -> L1d9
            if (r6 == 0) goto L19c
            r6.close()     // Catch: java.io.IOException -> L184
            goto L19c
        L184:
            r0 = move-exception
            r11 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r11 = r11.getMessage()
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            com.tencent.open.log.SLog.e(r4, r11)
        L19c:
            if (r12 == 0) goto L1ba
            r12.close()     // Catch: java.io.IOException -> L1a2
            goto L1ba
        L1a2:
            r0 = move-exception
            r11 = r0
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r1)
            java.lang.String r11 = r11.getMessage()
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            com.tencent.open.log.SLog.e(r4, r11)
        L1ba:
            if (r5 == 0) goto L1d8
            r5.close()     // Catch: java.io.IOException -> L1c0
            goto L1d8
        L1c0:
            r0 = move-exception
            r11 = r0
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r2)
            java.lang.String r11 = r11.getMessage()
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            com.tencent.open.log.SLog.e(r4, r11)
        L1d8:
            return r10
        L1d9:
            r0 = move-exception
            r11 = r0
            goto Lae
        L1dd:
            if (r10 == 0) goto L1fa
            r10.close()     // Catch: java.io.IOException -> L1e3
            goto L1fa
        L1e3:
            r0 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.String r0 = r0.getMessage()
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.tencent.open.log.SLog.e(r4, r0)
        L1fa:
            if (r12 == 0) goto L218
            r12.close()     // Catch: java.io.IOException -> L200
            goto L218
        L200:
            r0 = move-exception
            r12 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r12 = r12.getMessage()
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            com.tencent.open.log.SLog.e(r4, r12)
        L218:
            if (r5 == 0) goto L236
            r5.close()     // Catch: java.io.IOException -> L21e
            goto L236
        L21e:
            r0 = move-exception
            r12 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r12 = r12.getMessage()
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            com.tencent.open.log.SLog.e(r4, r12)
        L236:
            throw r11
    }

    public static java.lang.String c(android.content.Context r0, java.lang.String r1) {
            if (r0 != 0) goto L5
            java.lang.String r0 = ""
            return r0
        L5:
            b(r0, r1)
            java.lang.String r0 = com.tencent.open.utils.m.b
            return r0
    }

    public static org.json.JSONObject c(java.lang.String r2) {
            java.lang.String r0 = "auth://"
            java.lang.String r1 = "http://"
            java.lang.String r2 = r2.replace(r0, r1)
            java.net.URL r0 = new java.net.URL     // Catch: java.net.MalformedURLException -> L1e
            r0.<init>(r2)     // Catch: java.net.MalformedURLException -> L1e
            java.lang.String r2 = r0.getQuery()     // Catch: java.net.MalformedURLException -> L1e
            r1 = 0
            org.json.JSONObject r2 = a(r1, r2)     // Catch: java.net.MalformedURLException -> L1e
            java.lang.String r0 = r0.getRef()     // Catch: java.net.MalformedURLException -> L1e
            a(r2, r0)     // Catch: java.net.MalformedURLException -> L1e
            return r2
        L1e:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            return r2
    }

    public static boolean c() {
            android.content.Context r0 = com.tencent.open.utils.g.a()
            r1 = 0
            if (r0 == 0) goto L19
            android.content.pm.PackageManager r2 = r0.getPackageManager()
            java.lang.String r3 = "android.permission.WRITE_EXTERNAL_STORAGE"
            java.lang.String r0 = r0.getPackageName()
            int r0 = r2.checkPermission(r3, r0)
            if (r0 != 0) goto L19
            r0 = 1
            return r0
        L19:
            return r1
    }

    public static boolean c(android.content.Context r6) {
            android.content.res.Resources r6 = r6.getResources()     // Catch: java.lang.Throwable -> L26
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()     // Catch: java.lang.Throwable -> L26
            int r0 = r6.widthPixels     // Catch: java.lang.Throwable -> L26
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L26
            float r1 = r6.xdpi     // Catch: java.lang.Throwable -> L26
            float r0 = r0 / r1
            int r1 = r6.heightPixels     // Catch: java.lang.Throwable -> L26
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L26
            float r6 = r6.ydpi     // Catch: java.lang.Throwable -> L26
            float r1 = r1 / r6
            double r2 = (double) r0     // Catch: java.lang.Throwable -> L26
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = java.lang.Math.pow(r2, r4)     // Catch: java.lang.Throwable -> L26
            double r0 = (double) r1     // Catch: java.lang.Throwable -> L26
            double r0 = java.lang.Math.pow(r0, r4)     // Catch: java.lang.Throwable -> L26
            double r2 = r2 + r0
            double r0 = java.lang.Math.sqrt(r2)     // Catch: java.lang.Throwable -> L26
            goto L28
        L26:
            r0 = 0
        L28:
            r2 = 4619004367821864960(0x401a000000000000, double:6.5)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L30
            r6 = 1
            return r6
        L30:
            r6 = 0
            return r6
    }

    public static java.lang.String d(android.content.Context r0, java.lang.String r1) {
            if (r0 != 0) goto L5
            java.lang.String r0 = ""
            return r0
        L5:
            b(r0, r1)
            java.lang.String r0 = com.tencent.open.utils.m.a
            return r0
    }

    public static org.json.JSONObject d(java.lang.String r2) throws org.json.JSONException {
            java.lang.String r0 = "false"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto La
            java.lang.String r2 = "{value : false}"
        La:
            java.lang.String r0 = "true"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L14
            java.lang.String r2 = "{value : true}"
        L14:
            java.lang.String r0 = "allback("
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L28
            java.lang.String r0 = "[\\s\\S]*allback\\(([\\s\\S]*)\\);[^\\)]*\\z"
            java.lang.String r1 = "$1"
            java.lang.String r2 = r2.replaceFirst(r0, r1)
            java.lang.String r2 = r2.trim()
        L28:
            java.lang.String r0 = "online[0]="
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L50
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "{online:"
            r0.append(r1)
            int r1 = r2.length()
            int r1 = r1 + (-2)
            char r2 = r2.charAt(r1)
            r0.append(r2)
            java.lang.String r2 = "}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
        L50:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r2)
            return r0
    }

    public static boolean d(android.content.Context r1) {
            java.lang.String r0 = "8.1.5"
            int r1 = com.tencent.open.utils.k.c(r1, r0)
            if (r1 < 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    public static java.lang.String e(android.content.Context r0, java.lang.String r1) {
            if (r0 != 0) goto L5
            java.lang.String r0 = ""
            return r0
        L5:
            java.lang.String r0 = d(r0, r1)
            com.tencent.open.utils.m.c = r0
            return r0
    }

    public static boolean e(android.content.Context r1) {
            java.lang.String r0 = "8.1.8"
            int r1 = com.tencent.open.utils.k.c(r1, r0)
            if (r1 < 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    public static boolean e(java.lang.String r0) {
            if (r0 == 0) goto Lb
            int r0 = r0.length()
            if (r0 != 0) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }

    public static java.lang.String f(java.lang.String r2) {
            java.lang.String r0 = "UTF-8"
            java.lang.String r2 = java.net.URLEncoder.encode(r2, r0)     // Catch: java.io.UnsupportedEncodingException -> L7
            return r2
        L7:
            r2 = move-exception
            java.lang.String r0 = "openSDK_LOG.Util"
            java.lang.String r1 = "urlEncode: UnsupportedEncodingException"
            com.tencent.open.log.SLog.e(r0, r1, r2)
            java.lang.String r2 = ""
            return r2
    }

    public static boolean f(android.content.Context r1) {
            java.lang.String r0 = "5.9.5"
            int r1 = com.tencent.open.utils.k.c(r1, r0)
            if (r1 >= 0) goto La
            r1 = 0
            return r1
        La:
            r1 = 1
            return r1
    }

    public static boolean f(android.content.Context r4, java.lang.String r5) {
            boolean r0 = c(r4)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L12
            java.lang.String r0 = "com.tencent.minihd.qq"
            java.lang.String r0 = com.tencent.open.utils.k.a(r4, r0)
            if (r0 == 0) goto L12
            r0 = 0
            goto L13
        L12:
            r0 = 1
        L13:
            if (r0 == 0) goto L1e
            java.lang.String r3 = "com.tencent.tim"
            java.lang.String r3 = com.tencent.open.utils.k.a(r4, r3)
            if (r3 == 0) goto L1e
            r0 = 0
        L1e:
            if (r0 == 0) goto L28
            int r4 = com.tencent.open.utils.k.c(r4, r5)
            if (r4 >= 0) goto L27
            return r2
        L27:
            return r1
        L28:
            return r0
    }

    public static java.lang.String g(java.lang.String r6) {
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L31
            byte[] r1 = j(r6)     // Catch: java.security.NoSuchAlgorithmException -> L31
            r0.update(r1)     // Catch: java.security.NoSuchAlgorithmException -> L31
            byte[] r0 = r0.digest()     // Catch: java.security.NoSuchAlgorithmException -> L31
            if (r0 == 0) goto L37
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.security.NoSuchAlgorithmException -> L31
            r1.<init>()     // Catch: java.security.NoSuchAlgorithmException -> L31
            int r2 = r0.length     // Catch: java.security.NoSuchAlgorithmException -> L31
            r3 = 0
        L1a:
            if (r3 >= r2) goto L33
            r4 = r0[r3]     // Catch: java.security.NoSuchAlgorithmException -> L31
            int r5 = r4 >>> 4
            char r5 = a(r5)     // Catch: java.security.NoSuchAlgorithmException -> L31
            r1.append(r5)     // Catch: java.security.NoSuchAlgorithmException -> L31
            char r4 = a(r4)     // Catch: java.security.NoSuchAlgorithmException -> L31
            r1.append(r4)     // Catch: java.security.NoSuchAlgorithmException -> L31
            int r3 = r3 + 1
            goto L1a
        L31:
            r0 = move-exception
            goto L38
        L33:
            java.lang.String r6 = r1.toString()     // Catch: java.security.NoSuchAlgorithmException -> L31
        L37:
            return r6
        L38:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "encrypt has exception: "
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "openSDK_LOG.Util"
            com.tencent.open.log.SLog.e(r1, r0)
            return r6
    }

    private static boolean g(android.content.Context r4) {
            r0 = 0
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: java.lang.Exception -> L62
            java.lang.String r1 = "com.tencent.mtt"
            r2 = 64
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r1, r2)     // Catch: java.lang.Exception -> L62
            java.lang.String r1 = r4.versionName     // Catch: java.lang.Exception -> L62
            java.lang.String r2 = "4.3"
            int r2 = com.tencent.open.utils.k.a(r1, r2)     // Catch: java.lang.Exception -> L62
            if (r2 < 0) goto L62
            java.lang.String r2 = "4.4"
            boolean r1 = r1.startsWith(r2)     // Catch: java.lang.Exception -> L62
            if (r1 != 0) goto L62
            android.content.pm.Signature[] r4 = r4.signatures     // Catch: java.lang.Exception -> L62
            if (r4 == 0) goto L62
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.security.NoSuchAlgorithmException -> L47 java.lang.Exception -> L62
            r4 = r4[r0]     // Catch: java.security.NoSuchAlgorithmException -> L47 java.lang.Exception -> L62
            byte[] r4 = r4.toByteArray()     // Catch: java.security.NoSuchAlgorithmException -> L47 java.lang.Exception -> L62
            r1.update(r4)     // Catch: java.security.NoSuchAlgorithmException -> L47 java.lang.Exception -> L62
            byte[] r4 = r1.digest()     // Catch: java.security.NoSuchAlgorithmException -> L47 java.lang.Exception -> L62
            java.lang.String r4 = a(r4)     // Catch: java.security.NoSuchAlgorithmException -> L47 java.lang.Exception -> L62
            r1.reset()     // Catch: java.security.NoSuchAlgorithmException -> L47 java.lang.Exception -> L62
            java.lang.String r1 = "d8391a394d4a179e6fe7bdb8a301258b"
            boolean r4 = r4.equals(r1)     // Catch: java.security.NoSuchAlgorithmException -> L47 java.lang.Exception -> L62
            if (r4 == 0) goto L62
            r4 = 1
            return r4
        L47:
            r4 = move-exception
            java.lang.String r1 = "openSDK_LOG.Util"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L62
            r2.<init>()     // Catch: java.lang.Exception -> L62
            java.lang.String r3 = "isQQBrowerAvailable has exception: "
            r2.append(r3)     // Catch: java.lang.Exception -> L62
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Exception -> L62
            r2.append(r4)     // Catch: java.lang.Exception -> L62
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Exception -> L62
            com.tencent.open.log.SLog.e(r1, r4)     // Catch: java.lang.Exception -> L62
        L62:
            return r0
    }

    public static boolean g(android.content.Context r3, java.lang.String r4) {
            boolean r0 = c(r3)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L12
            java.lang.String r0 = "com.tencent.minihd.qq"
            java.lang.String r0 = com.tencent.open.utils.k.a(r3, r0)
            if (r0 == 0) goto L12
            r0 = 0
            goto L13
        L12:
            r0 = 1
        L13:
            if (r0 == 0) goto L1d
            int r3 = com.tencent.open.utils.k.c(r3, r4)
            if (r3 >= 0) goto L1c
            return r2
        L1c:
            return r1
        L1d:
            return r0
    }

    public static java.io.File h(android.content.Context r1, java.lang.String r2) {
            r0 = 0
            if (r1 != 0) goto L4
            return r0
        L4:
            java.io.File[] r1 = r1.getExternalFilesDirs(r2)
            if (r1 == 0) goto L11
            int r2 = r1.length
            if (r2 <= 0) goto L11
            r2 = 0
            r1 = r1[r2]
            return r1
        L11:
            return r0
    }

    public static final boolean h(java.lang.String r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "http://"
            boolean r1 = r2.startsWith(r1)
            if (r1 != 0) goto L16
            java.lang.String r1 = "https://"
            boolean r2 = r2.startsWith(r1)
            if (r2 == 0) goto L15
            goto L16
        L15:
            return r0
        L16:
            r2 = 1
            return r2
    }

    private static boolean i(android.content.Context r2, java.lang.String r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L16
            int r2 = androidx.core.app.q.a(r2, r3)     // Catch: java.lang.Exception -> Le
            if (r2 == 0) goto L16
            r2 = 1
            return r2
        Le:
            r2 = move-exception
            java.lang.String r3 = "openSDK_LOG.Util"
            java.lang.String r0 = "checkSelfPermission exception"
            com.tencent.open.log.SLog.e(r3, r0, r2)
        L16:
            r2 = 0
            return r2
    }

    public static boolean i(java.lang.String r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.io.File r1 = new java.io.File
            r1.<init>(r2)
            boolean r2 = r1.exists()
            if (r2 == 0) goto L11
            r2 = 1
            return r2
        L11:
            return r0
    }

    public static byte[] j(java.lang.String r2) {
            java.lang.String r0 = "UTF-8"
            byte[] r2 = r2.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L7
            return r2
        L7:
            r2 = move-exception
            java.lang.String r0 = "openSDK_LOG.Util"
            java.lang.String r1 = "getBytesUTF8: UnsupportedEncodingException"
            com.tencent.open.log.SLog.e(r0, r1, r2)
            r2 = 0
            byte[] r2 = new byte[r2]
            return r2
    }

    public static java.lang.String k(java.lang.String r1) {
            r0 = 2
            java.lang.String r1 = a(r1, r0)
            return r1
    }

    public static java.io.File l(java.lang.String r3) throws java.io.IOException {
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L43
            java.io.File r1 = r0.getParentFile()
            if (r1 == 0) goto L40
            java.io.File r1 = r0.getParentFile()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L40
            java.io.File r1 = r0.getParentFile()
            boolean r1 = r1.mkdirs()
            if (r1 == 0) goto L29
            r0.createNewFile()
            return r0
        L29:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "createFile failed"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = "openSDK_LOG.Util"
            com.tencent.open.log.SLog.d(r1, r3)
            return r0
        L40:
            r0.createNewFile()
        L43:
            return r0
    }

    public static boolean m(java.lang.String r2) {
            java.lang.String r0 = b()
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L18
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L18
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L18
            r2 = 1
            return r2
        L18:
            r2 = 0
            return r2
    }
}
