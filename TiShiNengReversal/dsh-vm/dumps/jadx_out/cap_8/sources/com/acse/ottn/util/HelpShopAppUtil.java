package com.acse.ottn.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class HelpShopAppUtil {
    private static char[] hexCode;
    private static com.acse.ottn.util.HelpShopAppUtil instance;
    private static android.content.Context mContext;

    static {
            java.lang.String r0 = "0123456789ABCDEF"
            char[] r0 = r0.toCharArray()
            com.acse.ottn.util.HelpShopAppUtil.hexCode = r0
            return
    }

    private HelpShopAppUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String getAppIdFromMainfest(java.lang.String r4) {
            r0 = 0
            android.content.Context r1 = com.acse.ottn.util.HelpShopAppUtil.mContext     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L24
            if (r1 != 0) goto L8
            java.lang.String r4 = "S1_fa3451ccdb42c4383ce5dcd9ad74d919"
            return r4
        L8:
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L24
            android.content.Context r2 = com.acse.ottn.util.HelpShopAppUtil.mContext     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L24
            java.lang.String r2 = r2.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L24
            r3 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L24
            if (r1 == 0) goto L24
            android.os.Bundle r1 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L24
            if (r1 != 0) goto L1f
            goto L24
        L1f:
            java.lang.String r4 = r1.getString(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L24
            return r4
        L24:
            return r0
    }

    public static android.content.Context getContext() {
            android.content.Context r0 = com.acse.ottn.util.HelpShopAppUtil.mContext
            return r0
    }

    public static java.lang.String getHmKey() {
            java.lang.String r0 = "S1_fa3451ccdb42c4383ce5dcd9ad74d919"
            java.lang.String r1 = "APP_KEY"
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> L3d
            if (r2 != 0) goto Lb
            return r0
        Lb:
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> L3d
            java.lang.String r2 = r2.e(r1)     // Catch: java.lang.Exception -> L3d
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L3d
            if (r3 != 0) goto L1b
            if (r2 != 0) goto L26
        L1b:
            java.lang.String r2 = getAppIdFromMainfest(r1)     // Catch: java.lang.Exception -> L3d
            com.acse.ottn.n3 r3 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> L3d
            r3.b(r1, r2)     // Catch: java.lang.Exception -> L3d
        L26:
            java.lang.String r1 = "HelpShopAppUtil"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3d
            r3.<init>()     // Catch: java.lang.Exception -> L3d
            java.lang.String r4 = "APP_KEY ="
            r3.append(r4)     // Catch: java.lang.Exception -> L3d
            r3.append(r2)     // Catch: java.lang.Exception -> L3d
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L3d
            com.acse.ottn.h2.a(r1, r3)     // Catch: java.lang.Exception -> L3d
            return r2
        L3d:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            java.lang.String r2 = "TAG"
            com.acse.ottn.h2.a(r2, r1)
            return r0
    }

    public static com.acse.ottn.util.HelpShopAppUtil getInstance() {
            com.acse.ottn.util.HelpShopAppUtil r0 = com.acse.ottn.util.HelpShopAppUtil.instance
            if (r0 != 0) goto L19
            java.lang.Class<com.acse.ottn.util.HelpShopAppUtil> r0 = com.acse.ottn.util.HelpShopAppUtil.class
            monitor-enter(r0)
            com.acse.ottn.util.HelpShopAppUtil r1 = com.acse.ottn.util.HelpShopAppUtil.instance     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.acse.ottn.util.HelpShopAppUtil r1 = new com.acse.ottn.util.HelpShopAppUtil     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.acse.ottn.util.HelpShopAppUtil.instance = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.acse.ottn.util.HelpShopAppUtil r0 = com.acse.ottn.util.HelpShopAppUtil.instance
            return r0
    }

    private static java.lang.String getSessionId(java.lang.String r2) {
            r0 = 0
            byte[] r0 = new byte[r0]
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.security.NoSuchAlgorithmException -> L11
            byte[] r2 = r2.getBytes()     // Catch: java.security.NoSuchAlgorithmException -> L11
            byte[] r0 = r1.digest(r2)     // Catch: java.security.NoSuchAlgorithmException -> L11
        L11:
            java.lang.String r2 = printHexBinary(r0)
            return r2
    }

    private static void getWindowInfo() {
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            android.content.Context r1 = com.acse.ottn.util.HelpShopAppUtil.mContext
            java.lang.String r2 = "window"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            android.view.Display r1 = r1.getDefaultDisplay()
            r1.getMetrics(r0)
            int r1 = r0.widthPixels
            int r0 = r0.heightPixels
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            if (r2 == 0) goto L32
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            java.lang.String r3 = "screenWidth"
            r2.a(r3, r1)
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            java.lang.String r2 = "screenHight"
            r1.a(r2, r0)
        L32:
            return
    }

    public static void init(android.content.Context r0) {
            com.acse.ottn.util.HelpShopAppUtil.mContext = r0
            com.tencent.mmkv.MMKV.initialize(r0)
            getWindowInfo()
            getHmKey()
            return
    }

    public static void playVideo(android.content.Context r1) {
            int r0 = com.acse.ottn.R.raw.lucky_money
            android.media.MediaPlayer r1 = android.media.MediaPlayer.create(r1, r0)
            r0 = 1050253722(0x3e99999a, float:0.3)
            r1.setVolume(r0, r0)
            r1.start()
            return
    }

    private static java.lang.String printHexBinary(byte[] r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r6.length
            int r1 = r1 * 2
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
        La:
            if (r2 >= r1) goto L25
            r3 = r6[r2]
            char[] r4 = com.acse.ottn.util.HelpShopAppUtil.hexCode
            int r5 = r3 >> 4
            r5 = r5 & 15
            char r4 = r4[r5]
            r0.append(r4)
            char[] r4 = com.acse.ottn.util.HelpShopAppUtil.hexCode
            r3 = r3 & 15
            char r3 = r4[r3]
            r0.append(r3)
            int r2 = r2 + 1
            goto La
        L25:
            java.lang.String r6 = r0.toString()
            return r6
    }

    public static java.lang.String randomSessionExID() {
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = ""
            if (r0 != 0) goto L9
            return r1
        L9:
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r2 = "sessionID"
            java.lang.String r0 = r0.e(r2)
            if (r0 == 0) goto L1d
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L1c
            goto L1d
        L1c:
            return r0
        L1d:
            double r0 = java.lang.Math.random()
            r3 = 4726483295817170944(0x4197d783fc000000, double:9.9999999E7)
            double r0 = r0 * r3
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 + r3
            int r0 = (int) r0
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = com.acse.ottn.i3.c(r0)
            r1 = 16
            r3 = 0
            java.lang.String r0 = r0.substring(r3, r1)
            java.lang.Long r1 = new java.lang.Long
            long r4 = java.lang.System.currentTimeMillis()
            r1.<init>(r4)
            long r4 = r1.longValue()
            java.lang.String r1 = java.lang.Long.toHexString(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "0"
            r4.append(r5)
            r4.append(r1)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r0
            java.lang.String r0 = "%32s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r1 = 32
            r3 = 102(0x66, float:1.43E-43)
            java.lang.String r0 = r0.replace(r1, r3)
            com.acse.ottn.n3 r1 = com.acse.ottn.n3.a()
            r1.b(r2, r0)
            return r0
    }

    public static java.lang.String randomSessionNewID() {
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = ""
            if (r0 != 0) goto L9
            return r1
        L9:
            com.acse.ottn.n1 r0 = com.acse.ottn.n1.a()
            java.lang.String r2 = "sessionID"
            java.lang.String r0 = r0.d(r2)
            if (r0 == 0) goto L1d
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L1c
            goto L1d
        L1c:
            return r0
        L1d:
            double r0 = java.lang.Math.random()
            r3 = 4726483295817170944(0x4197d783fc000000, double:9.9999999E7)
            double r0 = r0 * r3
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 + r3
            int r0 = (int) r0
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = com.acse.ottn.i3.c(r0)
            r1 = 16
            r3 = 0
            java.lang.String r0 = r0.substring(r3, r1)
            java.lang.Long r1 = new java.lang.Long
            long r4 = java.lang.System.currentTimeMillis()
            r1.<init>(r4)
            long r4 = r1.longValue()
            java.lang.String r1 = java.lang.Long.toHexString(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "0"
            r4.append(r5)
            r4.append(r1)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r0
            java.lang.String r0 = "%32s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r1 = 32
            r3 = 102(0x66, float:1.43E-43)
            java.lang.String r0 = r0.replace(r1, r3)
            com.acse.ottn.n1 r1 = com.acse.ottn.n1.a()
            r1.b(r2, r0)
            return r0
    }

    private java.lang.Object readResolve() throws java.io.ObjectStreamException {
            r1 = this;
            com.acse.ottn.util.HelpShopAppUtil r0 = com.acse.ottn.util.HelpShopAppUtil.instance
            return r0
    }

    public static java.lang.String sessionExID() {
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = ""
            if (r0 == 0) goto L41
            com.acse.ottn.n1 r0 = com.acse.ottn.n1.a()
            if (r0 != 0) goto Lf
            goto L41
        Lf:
            com.acse.ottn.n1 r0 = com.acse.ottn.n1.a()
            java.lang.String r2 = "sessionID"
            java.lang.String r0 = r0.d(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L2e
            com.acse.ottn.n3 r3 = com.acse.ottn.n3.a()
            r3.b(r2, r0)
            com.acse.ottn.n1 r3 = com.acse.ottn.n1.a()
            r3.b(r2, r1)
            return r0
        L2e:
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r0 = r0.e(r2)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L40
            java.lang.String r0 = randomSessionExID()
        L40:
            return r0
        L41:
            return r1
    }

    public static java.lang.String sessionID() {
            com.acse.ottn.n1 r0 = com.acse.ottn.n1.a()
            java.lang.String r1 = "sessionID"
            java.lang.String r0 = r0.d(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L14
            java.lang.String r0 = randomSessionNewID()
        L14:
            return r0
    }

    public java.lang.Long createRandomNumber() {
            r6 = this;
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            if (r0 != 0) goto Ld
            r0 = 14400(0x3840, double:7.1145E-320)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        Ld:
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            java.lang.String r1 = "random_num"
            long r2 = r0.d(r1)
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L32
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r2 = 7200(0x1c20, float:1.009E-41)
            int r0 = r0.nextInt(r2)
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            int r0 = r0 + 10800
            long r3 = (long) r0
            r2.a(r1, r3)
        L32:
            com.acse.ottn.n3 r0 = com.acse.ottn.n3.a()
            long r0 = r0.d(r1)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
    }

    public java.lang.String getAppName() {
            r1 = this;
            com.acse.ottn.o1 r0 = com.acse.ottn.o1.c()
            java.lang.String r0 = r0.b()
            return r0
    }
}
