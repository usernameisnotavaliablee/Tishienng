package com.umeng.socialize.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SocializeUtils {
    protected static final java.lang.String TAG = "SocializeUtils";
    public static java.util.Set<android.net.Uri> deleteUris;
    private static final char[] hexDigits = null;
    private static java.util.regex.Pattern mDoubleByte_Pattern;
    private static int smDip;

    static {
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x0018: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            com.umeng.socialize.utils.SocializeUtils.hexDigits = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            com.umeng.socialize.utils.SocializeUtils.deleteUris = r0
            r0 = 0
            com.umeng.socialize.utils.SocializeUtils.mDoubleByte_Pattern = r0
            r0 = 0
            com.umeng.socialize.utils.SocializeUtils.smDip = r0
            return
    }

    public SocializeUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static byte[] File2byte(java.io.File r4) {
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.io.IOException -> L25 java.io.FileNotFoundException -> L2a
            r0.<init>(r4)     // Catch: java.io.IOException -> L25 java.io.FileNotFoundException -> L2a
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L25 java.io.FileNotFoundException -> L2a
            r4.<init>()     // Catch: java.io.IOException -> L25 java.io.FileNotFoundException -> L2a
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]     // Catch: java.io.IOException -> L25 java.io.FileNotFoundException -> L2a
        Le:
            int r2 = r0.read(r1)     // Catch: java.io.IOException -> L25 java.io.FileNotFoundException -> L2a
            r3 = -1
            if (r2 == r3) goto L1a
            r3 = 0
            r4.write(r1, r3, r2)     // Catch: java.io.IOException -> L25 java.io.FileNotFoundException -> L2a
            goto Le
        L1a:
            r0.close()     // Catch: java.io.IOException -> L25 java.io.FileNotFoundException -> L2a
            r4.close()     // Catch: java.io.IOException -> L25 java.io.FileNotFoundException -> L2a
            byte[] r4 = r4.toByteArray()     // Catch: java.io.IOException -> L25 java.io.FileNotFoundException -> L2a
            return r4
        L25:
            r4 = move-exception
            com.umeng.socialize.utils.SLog.error(r4)
            goto L2e
        L2a:
            r4 = move-exception
            com.umeng.socialize.utils.SLog.error(r4)
        L2e:
            r4 = 0
            return r4
    }

    public static boolean assertBinaryInvalid(byte[] r0) {
            if (r0 == 0) goto L7
            int r0 = r0.length
            if (r0 <= 0) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public static java.util.Map<java.lang.String, java.lang.String> bundleTomap(android.os.Bundle r5) {
            if (r5 == 0) goto L3c
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L9
            goto L3c
        L9:
            java.util.Set r0 = r5.keySet()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "com.sina.weibo.intent.extra.USER_ICON"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L33
            java.lang.String r3 = "icon_url"
            java.lang.String r4 = r5.getString(r2)
            r1.put(r3, r4)
        L33:
            java.lang.String r3 = r5.getString(r2)
            r1.put(r2, r3)
            goto L16
        L3b:
            return r1
        L3c:
            r5 = 0
            return r5
    }

    public static int countContentLength(java.lang.String r3) {
            java.lang.String r3 = r3.trim()
            java.util.regex.Pattern r0 = getDoubleBytePattern()
            java.util.regex.Matcher r0 = r0.matcher(r3)
            r1 = 0
        Ld:
            boolean r2 = r0.find()
            if (r2 == 0) goto L16
            int r1 = r1 + 1
            goto Ld
        L16:
            int r3 = r3.length()
            int r3 = r3 - r1
            int r0 = r3 % 2
            if (r0 == 0) goto L25
            int r3 = r3 + 1
            int r3 = r3 / 2
        L23:
            int r1 = r1 + r3
            return r1
        L25:
            int r3 = r3 / 2
            goto L23
    }

    public static android.os.Bundle decodeUrl(java.lang.String r7) {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            if (r7 == 0) goto L2d
            java.lang.String r1 = "&"
            java.lang.String[] r7 = r7.split(r1)
            int r1 = r7.length
            r2 = 0
            r3 = 0
        L10:
            if (r3 >= r1) goto L2d
            r4 = r7[r3]
            java.lang.String r5 = "="
            java.lang.String[] r4 = r4.split(r5)
            r5 = r4[r2]
            java.lang.String r5 = java.net.URLDecoder.decode(r5)
            r6 = 1
            r4 = r4[r6]
            java.lang.String r4 = java.net.URLDecoder.decode(r4)
            r0.putString(r5, r4)
            int r3 = r3 + 1
            goto L10
        L2d:
            return r0
    }

    public static int dip2Px(android.content.Context r0, float r1) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            return r0
    }

    public static java.lang.String getAppkey(android.content.Context r3) {
            if (r3 != 0) goto L5
            java.lang.String r3 = ""
            return r3
        L5:
            java.lang.String r0 = com.umeng.socialize.common.SocializeConstants.APPKEY
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L30
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch: java.lang.Exception -> L2c
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Exception -> L2c
            r2 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r3 = r1.getApplicationInfo(r3, r2)     // Catch: java.lang.Exception -> L2c
            if (r3 == 0) goto L30
            android.os.Bundle r3 = r3.metaData     // Catch: java.lang.Exception -> L2c
            java.lang.String r1 = "UMENG_APPKEY"
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Exception -> L2c
            if (r3 == 0) goto L30
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L2c
            return r3
        L2c:
            r3 = move-exception
            com.umeng.socialize.utils.SLog.error(r3)
        L30:
            return r0
    }

    private static java.util.regex.Pattern getDoubleBytePattern() {
            java.util.regex.Pattern r0 = com.umeng.socialize.utils.SocializeUtils.mDoubleByte_Pattern
            if (r0 != 0) goto Lc
            java.lang.String r0 = "[^\\x00-\\xff]"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.umeng.socialize.utils.SocializeUtils.mDoubleByte_Pattern = r0
        Lc:
            java.util.regex.Pattern r0 = com.umeng.socialize.utils.SocializeUtils.mDoubleByte_Pattern
            return r0
    }

    public static int[] getFloatWindowSize(android.content.Context r1) {
            if (r1 != 0) goto L6
            r1 = 2
            int[] r1 = new int[r1]
            return r1
        L6:
            r1 = 580(0x244, float:8.13E-43)
            r0 = 350(0x15e, float:4.9E-43)
            int[] r1 = new int[]{r1, r0}
            return r1
    }

    public static java.lang.String hexdigest(java.lang.String r0) {
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Exception -> L9
            java.lang.String r0 = md5(r0)     // Catch: java.lang.Exception -> L9
            return r0
        L9:
            r0 = move-exception
            com.umeng.socialize.utils.SLog.error(r0)
            r0 = 0
            return r0
    }

    public static android.net.Uri insertImage(android.content.Context r3, java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 != 0) goto L55
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L13
            goto L55
        L13:
            android.content.ContentResolver r0 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "umeng_social_shareimg"
            java.lang.String r0 = android.provider.MediaStore.Images.Media.insertImage(r0, r4, r2, r1)     // Catch: java.lang.Throwable -> L28
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L28
            if (r2 != 0) goto L2c
            android.net.Uri r3 = android.net.Uri.parse(r0)     // Catch: java.lang.Throwable -> L28
            return r3
        L28:
            r0 = move-exception
            com.umeng.socialize.utils.SLog.error(r0)
        L2c:
            java.lang.String r0 = com.umeng.socialize.PlatformConfig.getFileProvider()     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L48
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L46
            r2 = 24
            if (r0 < r2) goto L48
            java.lang.String r0 = com.umeng.socialize.PlatformConfig.getFileProvider()     // Catch: java.lang.Throwable -> L46
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L46
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L46
            android.net.Uri r3 = androidx.core.content.FileProvider.getUriForFile(r3, r0, r2)     // Catch: java.lang.Throwable -> L46
            goto L51
        L46:
            r3 = move-exception
            goto L52
        L48:
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L46
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L46
            android.net.Uri r3 = android.net.Uri.fromFile(r3)     // Catch: java.lang.Throwable -> L46
        L51:
            return r3
        L52:
            com.umeng.socialize.utils.SLog.error(r3)
        L55:
            return r1
    }

    public static boolean isFloatWindowStyle(android.content.Context r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            boolean r1 = com.umeng.socialize.common.SocializeConstants.SUPPORT_PAD
            if (r1 == 0) goto L50
            int r1 = com.umeng.socialize.utils.SocializeUtils.smDip
            if (r1 != 0) goto L39
            java.lang.String r1 = "window"
            java.lang.Object r1 = r4.getSystemService(r1)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            android.view.Display r2 = r1.getDefaultDisplay()
            int r3 = r2.getWidth()
            int r2 = r2.getHeight()
            if (r3 <= r2) goto L23
            r3 = r2
        L23:
            android.util.DisplayMetrics r2 = new android.util.DisplayMetrics
            r2.<init>()
            android.view.Display r1 = r1.getDefaultDisplay()
            r1.getMetrics(r2)
            float r1 = (float) r3
            float r2 = r2.density
            float r1 = r1 / r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            com.umeng.socialize.utils.SocializeUtils.smDip = r1
        L39:
            android.content.res.Resources r4 = r4.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r4 = r4.screenLayout
            r4 = r4 & 15
            r1 = 3
            if (r4 < r1) goto L50
            int r4 = com.umeng.socialize.utils.SocializeUtils.smDip
            r1 = 550(0x226, float:7.71E-43)
            if (r4 < r1) goto L50
            r4 = 1
            return r4
        L50:
            return r0
    }

    public static boolean isHasDplusCache() {
            java.lang.String r0 = "s_e"
            java.io.File r0 = com.umeng.socialize.net.dplus.cache1.DplueCache.getFilePath(r0)
            java.lang.String r1 = "auth"
            java.io.File r1 = com.umeng.socialize.net.dplus.cache1.DplueCache.getFilePath(r1)
            java.lang.String r2 = "userinfo"
            java.io.File r2 = com.umeng.socialize.net.dplus.cache1.DplueCache.getFilePath(r2)
            java.lang.String r3 = "dau"
            java.io.File r3 = com.umeng.socialize.net.dplus.cache1.DplueCache.getFilePath(r3)
            java.lang.String r4 = "stats"
            java.io.File r4 = com.umeng.socialize.net.dplus.cache1.DplueCache.getFilePath(r4)
            if (r0 == 0) goto L2d
            java.io.File[] r5 = r0.listFiles()
            if (r5 == 0) goto L2d
            java.io.File[] r0 = r0.listFiles()
            int r0 = r0.length
            if (r0 > 0) goto L69
        L2d:
            if (r1 == 0) goto L3c
            java.io.File[] r0 = r1.listFiles()
            if (r0 == 0) goto L3c
            java.io.File[] r0 = r1.listFiles()
            int r0 = r0.length
            if (r0 > 0) goto L69
        L3c:
            if (r2 == 0) goto L4b
            java.io.File[] r0 = r2.listFiles()
            if (r0 == 0) goto L4b
            java.io.File[] r0 = r2.listFiles()
            int r0 = r0.length
            if (r0 > 0) goto L69
        L4b:
            if (r3 == 0) goto L5a
            java.io.File[] r0 = r3.listFiles()
            if (r0 == 0) goto L5a
            java.io.File[] r0 = r3.listFiles()
            int r0 = r0.length
            if (r0 > 0) goto L69
        L5a:
            if (r4 == 0) goto L6b
            java.io.File[] r0 = r4.listFiles()
            if (r0 == 0) goto L6b
            java.io.File[] r0 = r4.listFiles()
            int r0 = r0.length
            if (r0 <= 0) goto L6b
        L69:
            r0 = 1
            return r0
        L6b:
            r0 = 0
            return r0
    }

    public static boolean isToday(long r4) {
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            java.util.Date r1 = new java.util.Date
            long r2 = java.lang.System.currentTimeMillis()
            r1.<init>(r2)
            r0.setTime(r1)
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            java.util.Date r2 = new java.util.Date
            r2.<init>(r4)
            r1.setTime(r2)
            r4 = 1
            int r5 = r1.get(r4)
            int r2 = r0.get(r4)
            if (r5 != r2) goto L34
            r5 = 6
            int r1 = r1.get(r5)
            int r5 = r0.get(r5)
            int r1 = r1 - r5
            if (r1 != 0) goto L34
            return r4
        L34:
            r4 = 0
            return r4
    }

    public static org.json.JSONObject jsonObjectExt(java.lang.String r1) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lb
            r0.<init>(r1)     // Catch: java.lang.Exception -> Lb
            return r0
        Lb:
            r1 = move-exception
            com.umeng.socialize.utils.SLog.error(r1)
            r1 = 0
            return r1
    }

    public static java.util.Map<java.lang.String, java.lang.String> jsonToMap(java.lang.String r5) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L33
            r1.<init>(r5)     // Catch: java.lang.Exception -> L33
            java.util.Iterator r5 = r1.keys()     // Catch: java.lang.Exception -> L33
        Le:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Exception -> L33
            if (r2 == 0) goto L35
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Exception -> L33
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L33
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L33
            r3.<init>()     // Catch: java.lang.Exception -> L33
            java.lang.Object r4 = r1.get(r2)     // Catch: java.lang.Exception -> L33
            r3.append(r4)     // Catch: java.lang.Exception -> L33
            java.lang.String r4 = ""
            r3.append(r4)     // Catch: java.lang.Exception -> L33
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L33
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L33
            goto Le
        L33:
            r5 = move-exception
            goto L36
        L35:
            return r0
        L36:
            com.umeng.socialize.utils.SLog.error(r5)
            return r0
    }

    public static android.os.Bundle mapToBundle(java.util.Map<java.lang.String, java.lang.String> r4) {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.util.Set r1 = r4.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L23
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r4.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            r0.putString(r2, r3)
            goto Ld
        L23:
            return r0
    }

    public static java.lang.String md5(byte[] r7) {
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.lang.Exception -> L36
            r0.update(r7)     // Catch: java.lang.Exception -> L36
            byte[] r7 = r0.digest()     // Catch: java.lang.Exception -> L36
            r0 = 32
            char[] r0 = new char[r0]     // Catch: java.lang.Exception -> L36
            r1 = 0
            r2 = 0
        L13:
            r3 = 16
            if (r1 >= r3) goto L30
            r3 = r7[r1]     // Catch: java.lang.Exception -> L36
            int r4 = r2 + 1
            char[] r5 = com.umeng.socialize.utils.SocializeUtils.hexDigits     // Catch: java.lang.Exception -> L36
            int r6 = r3 >>> 4
            r6 = r6 & 15
            char r6 = r5[r6]     // Catch: java.lang.Exception -> L36
            r0[r2] = r6     // Catch: java.lang.Exception -> L36
            int r2 = r2 + 2
            r3 = r3 & 15
            char r3 = r5[r3]     // Catch: java.lang.Exception -> L36
            r0[r4] = r3     // Catch: java.lang.Exception -> L36
            int r1 = r1 + 1
            goto L13
        L30:
            java.lang.String r7 = new java.lang.String     // Catch: java.lang.Exception -> L36
            r7.<init>(r0)     // Catch: java.lang.Exception -> L36
            return r7
        L36:
            r7 = move-exception
            com.umeng.socialize.utils.SLog.error(r7)
            r7 = 0
            return r7
    }

    public static void openApplicationMarket(android.content.Context r2, java.lang.String r3) throws java.lang.Exception {
            boolean r0 = com.umeng.socialize.Config.isJumptoAppStore
            if (r0 == 0) goto L26
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "market://details?id="
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.<init>(r1)
            android.net.Uri r3 = android.net.Uri.parse(r3)
            r0.setData(r3)
            r2.startActivity(r0)
        L26:
            return
    }

    public static android.os.Bundle parseUrl(java.lang.String r1) {
            java.net.URL r0 = new java.net.URL     // Catch: java.net.MalformedURLException -> L19
            r0.<init>(r1)     // Catch: java.net.MalformedURLException -> L19
            java.lang.String r1 = r0.getQuery()     // Catch: java.net.MalformedURLException -> L19
            android.os.Bundle r1 = decodeUrl(r1)     // Catch: java.net.MalformedURLException -> L19
            java.lang.String r0 = r0.getRef()     // Catch: java.net.MalformedURLException -> L19
            android.os.Bundle r0 = decodeUrl(r0)     // Catch: java.net.MalformedURLException -> L19
            r1.putAll(r0)     // Catch: java.net.MalformedURLException -> L19
            return r1
        L19:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            return r1
    }

    public static void safeCloseDialog(android.app.Dialog r1) {
            if (r1 == 0) goto L10
            boolean r0 = r1.isShowing()     // Catch: java.lang.Exception -> Lc
            if (r0 == 0) goto L10
            r1.dismiss()     // Catch: java.lang.Exception -> Lc
            return
        Lc:
            r1 = move-exception
            com.umeng.socialize.utils.SLog.error(r1)
        L10:
            return
    }

    public static void safeShowDialog(android.app.Dialog r1) {
            if (r1 == 0) goto L10
            boolean r0 = r1.isShowing()     // Catch: java.lang.Exception -> Lc
            if (r0 != 0) goto L10
            r1.show()     // Catch: java.lang.Exception -> Lc
            return
        Lc:
            r1 = move-exception
            com.umeng.socialize.utils.SLog.error(r1)
        L10:
            return
    }
}
