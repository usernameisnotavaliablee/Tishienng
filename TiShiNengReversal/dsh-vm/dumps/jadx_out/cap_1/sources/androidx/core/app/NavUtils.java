package androidx.core.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class NavUtils {
    public static final java.lang.String PARENT_ACTIVITY = "android.support.PARENT_ACTIVITY";
    private static final java.lang.String TAG = "NavUtils";

    private NavUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static android.content.Intent getParentActivityIntent(@androidx.annotation.NonNull android.app.Activity r3) {
            android.content.Intent r0 = r3.getParentActivityIntent()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.String r0 = getParentActivityName(r3)
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            android.content.ComponentName r2 = new android.content.ComponentName
            r2.<init>(r3, r0)
            java.lang.String r3 = getParentActivityName(r3, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            if (r3 != 0) goto L1f
            android.content.Intent r3 = android.content.Intent.makeMainActivity(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            return r3
        L1f:
            android.content.Intent r3 = new android.content.Intent     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            r3.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            android.content.Intent r3 = r3.setComponent(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            return r3
        L29:
            return r1
    }

    @androidx.annotation.Nullable
    public static android.content.Intent getParentActivityIntent(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull android.content.ComponentName r3) throws android.content.pm.PackageManager.NameNotFoundException {
            java.lang.String r0 = getParentActivityName(r2, r3)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r3 = r3.getPackageName()
            r1.<init>(r3, r0)
            java.lang.String r2 = getParentActivityName(r2, r1)
            if (r2 != 0) goto L1c
            android.content.Intent r2 = android.content.Intent.makeMainActivity(r1)
            return r2
        L1c:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            android.content.Intent r2 = r2.setComponent(r1)
            return r2
    }

    @androidx.annotation.Nullable
    public static android.content.Intent getParentActivityIntent(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull java.lang.Class<?> r2) throws android.content.pm.PackageManager.NameNotFoundException {
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r1, r2)
            java.lang.String r2 = getParentActivityName(r1, r0)
            if (r2 != 0) goto Ld
            r1 = 0
            return r1
        Ld:
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r1, r2)
            java.lang.String r1 = getParentActivityName(r1, r0)
            if (r1 != 0) goto L1d
            android.content.Intent r1 = android.content.Intent.makeMainActivity(r0)
            return r1
        L1d:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            android.content.Intent r1 = r1.setComponent(r0)
            return r1
    }

    @androidx.annotation.Nullable
    public static java.lang.String getParentActivityName(@androidx.annotation.NonNull android.app.Activity r1) {
            android.content.ComponentName r0 = r1.getComponentName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9
            java.lang.String r1 = getParentActivityName(r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9
            return r1
        L9:
            r1 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.Nullable
    public static java.lang.String getParentActivityName(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull android.content.ComponentName r4) throws android.content.pm.PackageManager.NameNotFoundException {
            android.content.pm.PackageManager r0 = r3.getPackageManager()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto Le
            r1 = 269222528(0x100c0280, float:2.7612058E-29)
            goto L18
        Le:
            r2 = 24
            if (r1 < r2) goto L16
            r1 = 787072(0xc0280, float:1.102923E-39)
            goto L18
        L16:
            r1 = 640(0x280, float:8.97E-43)
        L18:
            android.content.pm.ActivityInfo r4 = r0.getActivityInfo(r4, r1)
            java.lang.String r0 = r4.parentActivityName
            if (r0 == 0) goto L21
            return r0
        L21:
            android.os.Bundle r4 = r4.metaData
            r0 = 0
            if (r4 != 0) goto L27
            return r0
        L27:
            java.lang.String r1 = "android.support.PARENT_ACTIVITY"
            java.lang.String r4 = r4.getString(r1)
            if (r4 != 0) goto L30
            return r0
        L30:
            r0 = 0
            char r0 = r4.charAt(r0)
            r1 = 46
            if (r0 != r1) goto L4d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = r3.getPackageName()
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            return r3
        L4d:
            return r4
    }

    public static void navigateUpFromSameTask(@androidx.annotation.NonNull android.app.Activity r3) {
            android.content.Intent r0 = getParentActivityIntent(r3)
            if (r0 == 0) goto La
            navigateUpTo(r3, r0)
            return
        La:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Activity "
            r1.append(r2)
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r1.append(r3)
            java.lang.String r3 = " does not have a parent activity name specified. (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data>  element in your manifest?)"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static void navigateUpTo(@androidx.annotation.NonNull android.app.Activity r0, @androidx.annotation.NonNull android.content.Intent r1) {
            r0.navigateUpTo(r1)
            return
    }

    public static boolean shouldUpRecreateTask(@androidx.annotation.NonNull android.app.Activity r0, @androidx.annotation.NonNull android.content.Intent r1) {
            boolean r0 = r0.shouldUpRecreateTask(r1)
            return r0
    }
}
