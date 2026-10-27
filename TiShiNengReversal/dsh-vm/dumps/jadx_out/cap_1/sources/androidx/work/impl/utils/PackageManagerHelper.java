package androidx.work.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class PackageManagerHelper {
    private static final java.lang.String TAG = null;

    static {
            java.lang.String r0 = "PackageManagerHelper"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.utils.PackageManagerHelper.TAG = r0
            return
    }

    private PackageManagerHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isComponentExplicitlyEnabled(android.content.Context r0, java.lang.Class<?> r1) {
            java.lang.String r1 = r1.getName()
            boolean r0 = isComponentExplicitlyEnabled(r0, r1)
            return r0
    }

    public static boolean isComponentExplicitlyEnabled(android.content.Context r2, java.lang.String r3) {
            android.content.pm.PackageManager r0 = r2.getPackageManager()
            android.content.ComponentName r1 = new android.content.ComponentName
            r1.<init>(r2, r3)
            int r2 = r0.getComponentEnabledSetting(r1)
            r3 = 1
            if (r2 != r3) goto L11
            return r3
        L11:
            r2 = 0
            return r2
    }

    public static void setComponentEnabled(@androidx.annotation.NonNull android.content.Context r10, @androidx.annotation.NonNull java.lang.Class<?> r11, boolean r12) {
            java.lang.String r0 = "disabled"
            java.lang.String r1 = "enabled"
            r2 = 2
            r3 = 0
            r4 = 1
            android.content.pm.PackageManager r5 = r10.getPackageManager()     // Catch: java.lang.Exception -> L3d
            android.content.ComponentName r6 = new android.content.ComponentName     // Catch: java.lang.Exception -> L3d
            java.lang.String r7 = r11.getName()     // Catch: java.lang.Exception -> L3d
            r6.<init>(r10, r7)     // Catch: java.lang.Exception -> L3d
            if (r12 == 0) goto L18
            r10 = 1
            goto L19
        L18:
            r10 = 2
        L19:
            r5.setComponentEnabledSetting(r6, r10, r4)     // Catch: java.lang.Exception -> L3d
            androidx.work.Logger r10 = androidx.work.Logger.get()     // Catch: java.lang.Exception -> L3d
            java.lang.String r5 = androidx.work.impl.utils.PackageManagerHelper.TAG     // Catch: java.lang.Exception -> L3d
            java.lang.String r6 = "%s %s"
            java.lang.String r7 = r11.getName()     // Catch: java.lang.Exception -> L3d
            if (r12 == 0) goto L2c
            r8 = r1
            goto L2d
        L2c:
            r8 = r0
        L2d:
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L3d
            r9[r3] = r7     // Catch: java.lang.Exception -> L3d
            r9[r4] = r8     // Catch: java.lang.Exception -> L3d
            java.lang.String r6 = java.lang.String.format(r6, r9)     // Catch: java.lang.Exception -> L3d
            java.lang.Throwable[] r7 = new java.lang.Throwable[r3]     // Catch: java.lang.Exception -> L3d
            r10.debug(r5, r6, r7)     // Catch: java.lang.Exception -> L3d
            return
        L3d:
            r10 = move-exception
            androidx.work.Logger r5 = androidx.work.Logger.get()
            java.lang.String r6 = androidx.work.impl.utils.PackageManagerHelper.TAG
            java.lang.String r11 = r11.getName()
            if (r12 == 0) goto L4b
            r0 = r1
        L4b:
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r3] = r11
            r12[r4] = r0
            java.lang.String r11 = "%s could not be %s"
            java.lang.String r11 = java.lang.String.format(r11, r12)
            java.lang.Throwable[] r12 = new java.lang.Throwable[r4]
            r12[r3] = r10
            r5.debug(r6, r11, r12)
            return
    }
}
