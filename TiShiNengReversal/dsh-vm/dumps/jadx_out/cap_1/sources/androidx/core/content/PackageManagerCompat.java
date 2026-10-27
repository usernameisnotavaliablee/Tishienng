package androidx.core.content;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class PackageManagerCompat {

    @android.annotation.SuppressLint({"ActionValue"})
    public static final java.lang.String ACTION_PERMISSION_REVOCATION_SETTINGS = "android.intent.action.AUTO_REVOKE_PERMISSIONS";

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final java.lang.String LOG_TAG = "PackageManagerCompat";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(30)
    private static class Api30Impl {
        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean areUnusedAppRestrictionsEnabled(@androidx.annotation.NonNull android.content.Context r0) {
                android.content.pm.PackageManager r0 = r0.getPackageManager()
                boolean r0 = r0.isAutoRevokeWhitelisted()
                r0 = r0 ^ 1
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public @interface UnusedAppRestrictionsStatus {
    }

    private PackageManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static boolean areUnusedAppRestrictionsAvailable(@androidx.annotation.NonNull android.content.pm.PackageManager r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 1
            r3 = 30
            if (r0 < r3) goto La
            r4 = 1
            goto Lb
        La:
            r4 = 0
        Lb:
            r5 = 23
            if (r0 < r5) goto L13
            if (r0 >= r3) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            java.lang.String r6 = getPermissionRevocationVerifierApp(r6)
            if (r6 == 0) goto L1c
            r6 = 1
            goto L1d
        L1c:
            r6 = 0
        L1d:
            if (r4 != 0) goto L25
            if (r0 == 0) goto L24
            if (r6 == 0) goto L24
            goto L25
        L24:
            return r1
        L25:
            return r2
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static java.lang.String getPermissionRevocationVerifierApp(@androidx.annotation.NonNull android.content.pm.PackageManager r4) {
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.AUTO_REVOKE_PERMISSIONS"
            r0.<init>(r1)
            java.lang.String r1 = "package"
            java.lang.String r2 = "com.example"
            r3 = 0
            android.net.Uri r1 = android.net.Uri.fromParts(r1, r2, r3)
            android.content.Intent r0 = r0.setData(r1)
            r1 = 0
            java.util.List r0 = r4.queryIntentActivities(r0, r1)
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r0.next()
            android.content.pm.ResolveInfo r1 = (android.content.pm.ResolveInfo) r1
            android.content.pm.ActivityInfo r1 = r1.activityInfo
            java.lang.String r1 = r1.packageName
            java.lang.String r2 = "android.permission.PACKAGE_VERIFICATION_AGENT"
            int r2 = r4.checkPermission(r2, r1)
            if (r2 == 0) goto L36
            goto L1d
        L36:
            if (r3 == 0) goto L39
            return r3
        L39:
            r3 = r1
            goto L1d
        L3b:
            return r3
    }

    @androidx.annotation.NonNull
    public static com.google.common.util.concurrent.ListenableFuture<java.lang.Integer> getUnusedAppRestrictionsStatus(@androidx.annotation.NonNull android.content.Context r7) {
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            androidx.concurrent.futures.ResolvableFuture r1 = androidx.concurrent.futures.ResolvableFuture.create()
            boolean r2 = androidx.core.os.UserManagerCompat.isUserUnlocked(r7)
            if (r2 != 0) goto L13
            r1.set(r0)
            return r1
        L13:
            android.content.pm.PackageManager r2 = r7.getPackageManager()
            boolean r2 = areUnusedAppRestrictionsAvailable(r2)
            if (r2 != 0) goto L26
            r7 = 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r1.set(r7)
            return r1
        L26:
            android.content.pm.ApplicationInfo r2 = r7.getApplicationInfo()
            int r2 = r2.targetSdkVersion
            r3 = 30
            if (r2 >= r3) goto L34
            r1.set(r0)
            return r1
        L34:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 2
            r5 = 4
            r6 = 31
            if (r0 < r6) goto L55
            boolean r7 = androidx.core.content.PackageManagerCompat.Api30Impl.areUnusedAppRestrictionsEnabled(r7)
            if (r7 == 0) goto L4d
            if (r2 < r6) goto L45
            r5 = 5
        L45:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r1.set(r7)
            return r1
        L4d:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r1.set(r7)
            return r1
        L55:
            if (r0 != r3) goto L66
            boolean r7 = androidx.core.content.PackageManagerCompat.Api30Impl.areUnusedAppRestrictionsEnabled(r7)
            if (r7 == 0) goto L5e
            r4 = 4
        L5e:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r1.set(r7)
            return r1
        L66:
            androidx.core.content.UnusedAppRestrictionsBackportServiceConnection r0 = new androidx.core.content.UnusedAppRestrictionsBackportServiceConnection
            r0.<init>(r7)
            androidx.core.content.w r7 = new androidx.core.content.w
            r7.<init>(r0)
            java.util.concurrent.ExecutorService r2 = java.util.concurrent.Executors.newSingleThreadExecutor()
            r1.addListener(r7, r2)
            r0.connectAndFetchResult(r1)
            return r1
    }
}
