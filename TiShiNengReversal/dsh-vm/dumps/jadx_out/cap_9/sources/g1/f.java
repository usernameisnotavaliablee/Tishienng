package g1;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class f {
    public f() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int a(android.content.Context r1, float r2) {
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            r0 = 1
            float r1 = android.util.TypedValue.applyDimension(r0, r2, r1)
            int r1 = (int) r1
            return r1
    }

    public static androidx.appcompat.app.AppCompatActivity b(android.content.Context r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            boolean r1 = r2 instanceof androidx.appcompat.app.AppCompatActivity
            if (r1 == 0) goto Lb
            androidx.appcompat.app.AppCompatActivity r2 = (androidx.appcompat.app.AppCompatActivity) r2
            return r2
        Lb:
            boolean r1 = r2 instanceof androidx.appcompat.view.ContextThemeWrapper
            if (r1 == 0) goto L1a
            androidx.appcompat.view.ContextThemeWrapper r2 = (androidx.appcompat.view.ContextThemeWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            androidx.appcompat.app.AppCompatActivity r2 = b(r2)
            return r2
        L1a:
            return r0
    }

    public static int c(android.content.Context r3) {
            boolean r0 = h(r3)
            if (r0 != 0) goto L8
            r3 = 0
            return r3
        L8:
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r0 = "dimen"
            java.lang.String r1 = "android"
            java.lang.String r2 = "navigation_bar_height"
            int r0 = r3.getIdentifier(r2, r0, r1)
            int r3 = r3.getDimensionPixelSize(r0)
            return r3
    }

    public static int d(android.content.Context r0, boolean r1) {
            if (r1 == 0) goto L12
            android.content.res.Resources r1 = r0.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.heightPixels
            int r0 = c(r0)
            int r1 = r1 + r0
            return r1
        L12:
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.heightPixels
            return r0
    }

    public static int e(android.content.Context r0) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            return r0
    }

    public static double f(android.content.Context r2) {
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r0 = 1103626240(0x41c80000, float:25.0)
            float r2 = r2 * r0
            double r0 = (double) r2
            double r0 = java.lang.Math.ceil(r0)
            return r0
    }

    public static android.view.WindowManager g(android.content.Context r1) {
            java.lang.String r0 = "window"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            return r1
    }

    public static boolean h(android.content.Context r3) {
            android.view.WindowManager r3 = g(r3)
            android.view.Display r3 = r3.getDefaultDisplay()
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            r3.getSize(r0)
            r3.getRealSize(r1)
            int r3 = r1.x
            int r2 = r0.x
            if (r3 != r2) goto L27
            int r3 = r1.y
            int r0 = r0.y
            if (r3 == r0) goto L25
            goto L27
        L25:
            r3 = 0
            return r3
        L27:
            r3 = 1
            return r3
    }

    public static void i(android.content.Context r1) {
            android.app.Activity r1 = l(r1)
            android.view.Window r1 = r1.getWindow()
            android.view.View r1 = r1.getDecorView()
            r0 = 4098(0x1002, float:5.743E-42)
            r1.setSystemUiVisibility(r0)
            return
    }

    public static void j(android.content.Context r1) {
            android.app.Activity r1 = l(r1)
            android.view.Window r1 = r1.getWindow()
            r0 = 1024(0x400, float:1.435E-42)
            r1.addFlags(r0)
            return
    }

    public static void k(android.content.Context r1, boolean r2, boolean r3) {
            if (r2 == 0) goto L15
            androidx.appcompat.app.AppCompatActivity r2 = b(r1)
            if (r2 == 0) goto L15
            androidx.appcompat.app.ActionBar r2 = r2.getSupportActionBar()
            if (r2 == 0) goto L15
            r0 = 0
            r2.setShowHideAnimationEnabled(r0)
            r2.hide()
        L15:
            if (r3 == 0) goto L46
            boolean r2 = r1 instanceof androidx.fragment.app.FragmentActivity
            r3 = 512(0x200, float:7.17E-43)
            r0 = 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L30
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            android.view.Window r2 = r1.getWindow()
            r2.addFlags(r0)
            android.view.Window r1 = r1.getWindow()
            r1.addFlags(r3)
            return
        L30:
            android.app.Activity r2 = l(r1)
            android.view.Window r2 = r2.getWindow()
            r2.addFlags(r0)
            android.app.Activity r1 = l(r1)
            android.view.Window r1 = r1.getWindow()
            r1.addFlags(r3)
        L46:
            return
    }

    public static android.app.Activity l(android.content.Context r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto Lb
            android.app.Activity r2 = (android.app.Activity) r2
            return r2
        Lb:
            boolean r1 = r2 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L1a
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            android.app.Activity r2 = l(r2)
            return r2
        L1a:
            return r0
    }

    public static void m(android.content.Context r1) {
            android.app.Activity r1 = l(r1)
            android.view.Window r1 = r1.getWindow()
            android.view.View r1 = r1.getDecorView()
            r0 = 0
            r1.setSystemUiVisibility(r0)
            return
    }

    public static void n(android.content.Context r1) {
            android.app.Activity r1 = l(r1)
            android.view.Window r1 = r1.getWindow()
            r0 = 1024(0x400, float:1.435E-42)
            r1.clearFlags(r0)
            return
    }

    public static void o(android.content.Context r1, boolean r2, boolean r3) {
            if (r2 == 0) goto L15
            androidx.appcompat.app.AppCompatActivity r2 = b(r1)
            if (r2 == 0) goto L15
            androidx.appcompat.app.ActionBar r2 = r2.getSupportActionBar()
            if (r2 == 0) goto L15
            r0 = 0
            r2.setShowHideAnimationEnabled(r0)
            r2.show()
        L15:
            if (r3 == 0) goto L46
            boolean r2 = r1 instanceof androidx.fragment.app.FragmentActivity
            r3 = 512(0x200, float:7.17E-43)
            r0 = 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L30
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            android.view.Window r2 = r1.getWindow()
            r2.clearFlags(r0)
            android.view.Window r1 = r1.getWindow()
            r1.clearFlags(r3)
            return
        L30:
            android.app.Activity r2 = l(r1)
            android.view.Window r2 = r2.getWindow()
            r2.clearFlags(r0)
            android.app.Activity r1 = l(r1)
            android.view.Window r1 = r1.getWindow()
            r1.clearFlags(r3)
        L46:
            return
    }

    public static int p(android.content.Context r1, float r2) {
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            r0 = 2
            float r1 = android.util.TypedValue.applyDimension(r0, r2, r1)
            int r1 = (int) r1
            return r1
    }
}
