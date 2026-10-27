package cn.jpush.android.api;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class SystemAlertHelper {
    private static int a = 400;

    /* renamed from: b, reason: collision with root package name */
    private static int f1712b = 600;

    /* renamed from: c, reason: collision with root package name */
    private static android.widget.ImageButton f1713c;

    /* renamed from: d, reason: collision with root package name */
    private static android.view.WindowManager f1714d;

    /* renamed from: e, reason: collision with root package name */
    private static android.webkit.WebView f1715e;


    static {
            return
    }

    public SystemAlertHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.util.DisplayMetrics a(android.content.Context r3) {
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            if (r3 == 0) goto L94
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "width : "
            r0.append(r1)
            int r1 = r3.widthPixels
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "SystemAlertHelper"
            cn.jpush.android.helper.Logger.d(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "height : "
            r0.append(r2)
            int r2 = r3.heightPixels
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            cn.jpush.android.helper.Logger.d(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "density : "
            r0.append(r2)
            float r2 = r3.density
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            cn.jpush.android.helper.Logger.d(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "densityDpi : "
            r0.append(r2)
            int r2 = r3.densityDpi
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            cn.jpush.android.helper.Logger.d(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "xdpi : "
            r0.append(r2)
            float r2 = r3.xdpi
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            cn.jpush.android.helper.Logger.d(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "ydpi : "
            r0.append(r2)
            float r2 = r3.ydpi
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            cn.jpush.android.helper.Logger.d(r1, r0)
            return r3
        L94:
            r3 = 0
            return r3
    }

    static /* synthetic */ android.view.WindowManager a() {
            android.view.WindowManager r0 = cn.jpush.android.api.SystemAlertHelper.f1714d
            return r0
    }

    static /* synthetic */ android.view.WindowManager a(android.view.WindowManager r0) {
            cn.jpush.android.api.SystemAlertHelper.f1714d = r0
            return r0
    }

    static /* synthetic */ android.webkit.WebView a(android.webkit.WebView r0) {
            cn.jpush.android.api.SystemAlertHelper.f1715e = r0
            return r0
    }

    static /* synthetic */ android.widget.ImageButton a(android.widget.ImageButton r0) {
            cn.jpush.android.api.SystemAlertHelper.f1713c = r0
            return r0
    }

    static /* synthetic */ void a(android.content.Context r0, android.view.WindowManager r1, android.webkit.WebView r2, android.widget.ImageButton r3) {
            b(r0, r1, r2, r3)
            return
    }

    static /* synthetic */ android.webkit.WebView b() {
            android.webkit.WebView r0 = cn.jpush.android.api.SystemAlertHelper.f1715e
            return r0
    }

    private static void b(android.content.Context r6, android.view.WindowManager r7, android.webkit.WebView r8, android.widget.ImageButton r9) {
            android.util.DisplayMetrics r0 = a(r6)
            if (r0 == 0) goto L1a
            int r1 = r0.widthPixels
            int r1 = r1 * 3
            int r1 = r1 / 4
            cn.jpush.android.api.SystemAlertHelper.a = r1
            int r0 = r0.heightPixels
            int r0 = r0 / 2
            cn.jpush.android.api.SystemAlertHelper.f1712b = r0
            int r1 = r1 / 2
            int r0 = r0 / 2
            int r0 = -r0
            goto L1e
        L1a:
            r1 = 200(0xc8, float:2.8E-43)
            r0 = -300(0xfffffffffffffed4, float:NaN)
        L1e:
            android.view.WindowManager$LayoutParams r2 = new android.view.WindowManager$LayoutParams
            r2.<init>()
            r3 = 1
            r2.format = r3
            r3 = 17
            r2.gravity = r3
            r3 = 2003(0x7d3, float:2.807E-42)
            r2.type = r3
            int r3 = r2.flags
            r3 = r3 | 552(0x228, float:7.74E-43)
            r2.flags = r3
            int r3 = cn.jpush.android.api.SystemAlertHelper.a
            r2.width = r3
            int r3 = cn.jpush.android.api.SystemAlertHelper.f1712b
            r2.height = r3
            r3 = -1
            r2.x = r3
            r2.y = r3
            r7.addView(r8, r2)
            android.content.res.Resources r8 = r6.getResources()
            r3 = 17170445(0x106000d, float:2.461195E-38)
            int r8 = r8.getColor(r3)
            r9.setBackgroundColor(r8)
            android.content.res.Resources r8 = r6.getResources()
            java.lang.String r3 = "drawable"
            java.lang.String r4 = r6.getPackageName()
            java.lang.String r5 = "jpush_close"
            int r8 = r8.getIdentifier(r5, r3, r4)
            android.content.res.Resources r6 = r6.getResources()
            android.graphics.drawable.Drawable r6 = r6.getDrawable(r8)
            r9.setImageDrawable(r6)
            r6 = -2
            r2.width = r6
            r2.height = r6
            r2.y = r0
            r2.x = r1
            r7.addView(r9, r2)
            return
    }

    static /* synthetic */ android.widget.ImageButton c() {
            android.widget.ImageButton r0 = cn.jpush.android.api.SystemAlertHelper.f1713c
            return r0
    }

    public static void close() {
            android.view.WindowManager r0 = cn.jpush.android.api.SystemAlertHelper.f1714d
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 0
            android.webkit.WebView r2 = cn.jpush.android.api.SystemAlertHelper.f1715e     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto Ld
            r0.removeView(r2)     // Catch: java.lang.Throwable -> L16
        Ld:
            android.widget.ImageButton r0 = cn.jpush.android.api.SystemAlertHelper.f1713c     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L16
            android.view.WindowManager r2 = cn.jpush.android.api.SystemAlertHelper.f1714d     // Catch: java.lang.Throwable -> L16
            r2.removeView(r0)     // Catch: java.lang.Throwable -> L16
        L16:
            cn.jpush.android.api.SystemAlertHelper.f1714d = r1
            cn.jpush.android.api.SystemAlertHelper.f1715e = r1
            cn.jpush.android.api.SystemAlertHelper.f1713c = r1
            return
    }

    public static android.graphics.Bitmap getImageFromAssetsFile(android.content.Context r1, java.lang.String r2) {
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.AssetManager r1 = r1.getAssets()
            r0 = 0
            java.io.InputStream r1 = r1.open(r2)     // Catch: java.io.IOException -> L14
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch: java.io.IOException -> L14
            r1.close()     // Catch: java.io.IOException -> L14
        L14:
            return r0
    }

    public static int getWindowHeight() {
            int r0 = cn.jpush.android.api.SystemAlertHelper.f1712b
            return r0
    }

    public static int getWindowWidth() {
            int r0 = cn.jpush.android.api.SystemAlertHelper.a
            return r0
    }

    public static void startActivityByName(android.webkit.WebView r2, java.lang.String r3, java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "action --- startActivityByName--------activityName : "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = "----- params : "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "SystemAlertHelper"
            cn.jpush.android.helper.Logger.d(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L29
            java.lang.String r0 = "The activity name is null or empty, Give up.."
            cn.jpush.android.helper.Logger.ee(r1, r0)
        L29:
            if (r2 != 0) goto L2c
            goto L36
        L2c:
            android.content.Context r0 = r2.getContext()
            android.content.Context r0 = cn.jpush.android.local.JPushConstants.getAppContext(r0)
            if (r0 != 0) goto L37
        L36:
            return
        L37:
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Exception -> L55
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r2 = r2.getContext()
            r1.<init>(r2, r3)
            java.lang.String r2 = "cn.jpush.android.ACTIVITY_PARAM"
            r1.putExtra(r2, r4)
            r2 = 268435456(0x10000000, float:2.524355E-29)
            r1.setFlags(r2)
            r0.startActivity(r1)
            close()
            return
        L55:
            java.lang.String r2 = "The activity name is invalid, Give up.."
            cn.jpush.android.helper.Logger.ee(r1, r2)
            return
    }

    public static void systemAlert() {
            return
    }

    public static void systemAlert(android.content.Context r3, cn.jpush.android.d.d r4) {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            cn.jpush.android.api.SystemAlertHelper$1 r1 = new cn.jpush.android.api.SystemAlertHelper$1
            java.lang.String r2 = "SystemAlertHelper#systemAlert"
            r1.<init>(r2, r4, r3)
            r0.post(r1)
            return
    }
}
