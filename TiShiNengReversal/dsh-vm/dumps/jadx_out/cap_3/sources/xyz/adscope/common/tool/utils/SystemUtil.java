package xyz.adscope.common.tool.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class SystemUtil {
    public SystemUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean checkAppInstalled(android.content.Context r2, java.lang.String r3) {
            r0 = 0
            if (r2 == 0) goto L19
            if (r3 == 0) goto L19
            boolean r1 = r3.isEmpty()     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto Lc
            goto L19
        Lc:
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L15 java.lang.Throwable -> L19
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L15 java.lang.Throwable -> L19
            goto L16
        L15:
            r2 = 0
        L16:
            if (r2 == 0) goto L19
            r0 = 1
        L19:
            return r0
    }

    public static java.lang.ref.WeakReference<android.content.Context> findActivityContext(android.view.View r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            android.content.Context r1 = r4.getContext()     // Catch: java.lang.Throwable -> L49
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L49
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L49
        Ld:
            java.lang.Object r4 = r2.get()     // Catch: java.lang.Throwable -> L49
            if (r4 == 0) goto L2b
            java.lang.Object r4 = r2.get()     // Catch: java.lang.Throwable -> L49
            android.view.View r4 = (android.view.View) r4     // Catch: java.lang.Throwable -> L49
            android.view.ViewParent r4 = r4.getParent()     // Catch: java.lang.Throwable -> L49
            if (r4 == 0) goto L2b
            boolean r3 = r4 instanceof android.view.View     // Catch: java.lang.Throwable -> L49
            if (r3 == 0) goto L2b
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L49
            android.view.View r4 = (android.view.View) r4     // Catch: java.lang.Throwable -> L49
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L49
            goto Ld
        L2b:
            java.lang.Object r4 = r2.get()     // Catch: java.lang.Throwable -> L49
            android.view.View r4 = (android.view.View) r4     // Catch: java.lang.Throwable -> L49
            if (r4 == 0) goto L43
            android.content.Context r1 = r4.getContext()     // Catch: java.lang.Throwable -> L49
            boolean r4 = r1 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L49
            if (r4 == 0) goto L43
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L49
            android.app.Activity r1 = (android.app.Activity) r1     // Catch: java.lang.Throwable -> L49
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L49
            return r4
        L43:
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L49
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L49
            return r4
        L49:
            return r0
    }

    public static boolean hasSdk(java.lang.String r1) {
            r0 = 1
            java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L5
            return r0
        L5:
            r1 = 0
            return r1
    }

    public static boolean isDarkUiMode(android.content.Context r2) {
            r0 = 0
            android.content.res.Resources r2 = r2.getResources()     // Catch: java.lang.Throwable -> L15
            android.content.res.Configuration r2 = r2.getConfiguration()     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L15
            int r2 = r2.uiMode     // Catch: java.lang.Throwable -> L15
            r2 = r2 & 48
            r1 = 32
            if (r2 != r1) goto L15
            r2 = 1
            return r2
        L15:
            return r0
    }
}
