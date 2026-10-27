package com.google.android.gms.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class GooglePlayServicesUtilLight {

    @com.google.android.gms.common.annotation.KeepForSdk
    static final int GMS_AVAILABILITY_NOTIFICATION_ID = 10436;

    @com.google.android.gms.common.annotation.KeepForSdk
    static final int GMS_GENERAL_ERROR_NOTIFICATION_ID = 39789;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final java.lang.String GOOGLE_PLAY_GAMES_PACKAGE = "com.google.android.play.games";

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public static final java.lang.String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 12451000;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final java.lang.String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    static final java.util.concurrent.atomic.AtomicBoolean sCanceledAvailabilityNotification = null;

    @androidx.annotation.VisibleForTesting
    static boolean zza;
    private static boolean zzb;
    private static final java.util.concurrent.atomic.AtomicBoolean zzc = null;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            com.google.android.gms.common.GooglePlayServicesUtilLight.sCanceledAvailabilityNotification = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            com.google.android.gms.common.GooglePlayServicesUtilLight.zzc = r0
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    GooglePlayServicesUtilLight() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public static void cancelAvailabilityErrorNotifications(@androidx.annotation.NonNull android.content.Context r2) {
            java.util.concurrent.atomic.AtomicBoolean r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.sCanceledAvailabilityNotification
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto La
            goto L19
        La:
            java.lang.String r0 = "notification"
            java.lang.Object r2 = r2.getSystemService(r0)     // Catch: java.lang.SecurityException -> L19
            android.app.NotificationManager r2 = (android.app.NotificationManager) r2     // Catch: java.lang.SecurityException -> L19
            if (r2 == 0) goto L19
            r0 = 10436(0x28c4, float:1.4624E-41)
            r2.cancel(r0)     // Catch: java.lang.SecurityException -> L19
        L19:
            return
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public static void enableUsingApkIndependentContext() {
            java.util.concurrent.atomic.AtomicBoolean r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.zzc
            r1 = 1
            r0.set(r1)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public static void ensurePlayServicesAvailable(@androidx.annotation.NonNull android.content.Context r2, int r3) throws com.google.android.gms.common.GooglePlayServicesRepairableException, com.google.android.gms.common.GooglePlayServicesNotAvailableException {
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()
            int r3 = r0.isGooglePlayServicesAvailable(r2, r3)
            if (r3 == 0) goto L24
            java.lang.String r0 = "e"
            com.google.android.gms.common.GoogleApiAvailabilityLight r1 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()
            android.content.Intent r2 = r1.getErrorResolutionIntent(r2, r3, r0)
            if (r2 != 0) goto L1c
            com.google.android.gms.common.GooglePlayServicesNotAvailableException r2 = new com.google.android.gms.common.GooglePlayServicesNotAvailableException
            r2.<init>(r3)
            throw r2
        L1c:
            com.google.android.gms.common.GooglePlayServicesRepairableException r0 = new com.google.android.gms.common.GooglePlayServicesRepairableException
            java.lang.String r1 = "Google Play Services not available"
            r0.<init>(r3, r1, r2)
            throw r0
        L24:
            return
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public static int getApkVersion(@androidx.annotation.NonNull android.content.Context r2) {
            r0 = 0
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le
            java.lang.String r1 = "com.google.android.gms"
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le
            int r2 = r2.versionCode
            return r2
        Le:
            return r0
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public static int getClientVersion(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = 1
            com.google.android.gms.common.internal.Preconditions.checkState(r0)
            java.lang.String r0 = r1.getPackageName()
            int r1 = com.google.android.gms.common.util.ClientLibraryUtils.getClientVersion(r1, r0)
            return r1
    }

    @java.lang.Deprecated
    @androidx.annotation.Nullable
    @com.google.errorprone.annotations.InlineMe(imports = {"com.google.android.gms.common.GoogleApiAvailabilityLight"}, replacement = "GoogleApiAvailabilityLight.getInstance().getErrorResolutionPendingIntent(context, errorCode, requestCode)")
    @com.google.android.gms.common.annotation.KeepForSdk
    public static android.app.PendingIntent getErrorPendingIntent(int r1, @androidx.annotation.NonNull android.content.Context r2, int r3) {
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()
            android.app.PendingIntent r1 = r0.getErrorResolutionPendingIntent(r2, r1, r3)
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public static java.lang.String getErrorString(int r0) {
            java.lang.String r0 = com.google.android.gms.common.ConnectionResult.zza(r0)
            return r0
    }

    @java.lang.Deprecated
    @androidx.annotation.Nullable
    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.errorprone.annotations.InlineMe(imports = {"com.google.android.gms.common.GoogleApiAvailabilityLight"}, replacement = "GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent(null, errorCode, null)")
    @com.google.android.gms.common.annotation.KeepForSdk
    public static android.content.Intent getGooglePlayServicesAvailabilityRecoveryIntent(int r2) {
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()
            r1 = 0
            android.content.Intent r2 = r0.getErrorResolutionIntent(r1, r2, r1)
            return r2
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public static android.content.Context getRemoteContext(@androidx.annotation.NonNull android.content.Context r2) {
            java.lang.String r0 = "com.google.android.gms"
            r1 = 3
            android.content.Context r2 = r2.createPackageContext(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8
            return r2
        L8:
            r2 = 0
            return r2
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public static android.content.res.Resources getRemoteResource(@androidx.annotation.NonNull android.content.Context r1) {
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb
            java.lang.String r0 = "com.google.android.gms"
            android.content.res.Resources r1 = r1.getResourcesForApplication(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb
            return r1
        Lb:
            r1 = 0
            return r1
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean honorsDebugCertificates(@androidx.annotation.NonNull android.content.Context r5) {
            boolean r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.zza
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L32
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r5)     // Catch: java.lang.Throwable -> L26 android.content.pm.PackageManager.NameNotFoundException -> L30
            java.lang.String r3 = "com.google.android.gms"
            r4 = 64
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r3, r4)     // Catch: java.lang.Throwable -> L26 android.content.pm.PackageManager.NameNotFoundException -> L30
            com.google.android.gms.common.GoogleSignatureVerifier.getInstance(r5)     // Catch: java.lang.Throwable -> L26 android.content.pm.PackageManager.NameNotFoundException -> L30
            if (r0 == 0) goto L28
            boolean r5 = com.google.android.gms.common.GoogleSignatureVerifier.zzb(r0, r1)     // Catch: java.lang.Throwable -> L26 android.content.pm.PackageManager.NameNotFoundException -> L30
            if (r5 != 0) goto L28
            boolean r5 = com.google.android.gms.common.GoogleSignatureVerifier.zzb(r0, r2)     // Catch: java.lang.Throwable -> L26 android.content.pm.PackageManager.NameNotFoundException -> L30
            if (r5 == 0) goto L28
            com.google.android.gms.common.GooglePlayServicesUtilLight.zzb = r2     // Catch: java.lang.Throwable -> L26 android.content.pm.PackageManager.NameNotFoundException -> L30
            goto L2a
        L26:
            r5 = move-exception
            goto L2d
        L28:
            com.google.android.gms.common.GooglePlayServicesUtilLight.zzb = r1     // Catch: java.lang.Throwable -> L26 android.content.pm.PackageManager.NameNotFoundException -> L30
        L2a:
            com.google.android.gms.common.GooglePlayServicesUtilLight.zza = r2
            goto L32
        L2d:
            com.google.android.gms.common.GooglePlayServicesUtilLight.zza = r2
            throw r5
        L30:
            com.google.android.gms.common.GooglePlayServicesUtilLight.zza = r2
        L32:
            boolean r5 = com.google.android.gms.common.GooglePlayServicesUtilLight.zzb
            if (r5 != 0) goto L3e
            boolean r5 = com.google.android.gms.common.util.DeviceProperties.isUserBuild()
            if (r5 != 0) goto L3d
            goto L3e
        L3d:
            return r1
        L3e:
            return r2
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    @java.lang.Deprecated
    @com.google.android.gms.common.internal.HideFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public static int isGooglePlayServicesAvailable(@androidx.annotation.NonNull android.content.Context r1) {
            int r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE
            int r1 = isGooglePlayServicesAvailable(r1, r0)
            return r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public static int isGooglePlayServicesAvailable(@androidx.annotation.NonNull android.content.Context r9, int r10) {
            android.content.res.Resources r0 = r9.getResources()     // Catch: java.lang.Throwable -> La
            int r1 = com.bjtsn.pose_detection.R.string.common_google_play_services_unknown_issue     // Catch: java.lang.Throwable -> La
            r0.getString(r1)     // Catch: java.lang.Throwable -> La
            goto Lb
        La:
        Lb:
            java.lang.String r0 = r9.getPackageName()
            java.lang.String r1 = "com.google.android.gms"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L37
            java.util.concurrent.atomic.AtomicBoolean r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.zzc
            boolean r0 = r0.get()
            if (r0 == 0) goto L20
            goto L37
        L20:
            int r0 = com.google.android.gms.common.internal.zzah.zza(r9)
            if (r0 == 0) goto L31
            int r2 = com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE
            if (r0 != r2) goto L2b
            goto L37
        L2b:
            com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException r9 = new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException
            r9.<init>(r0)
            throw r9
        L31:
            com.google.android.gms.common.GooglePlayServicesMissingManifestValueException r9 = new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException
            r9.<init>()
            throw r9
        L37:
            boolean r0 = com.google.android.gms.common.util.DeviceProperties.isWearableWithoutPlayStore(r9)
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L47
            boolean r0 = com.google.android.gms.common.util.DeviceProperties.zzb(r9)
            if (r0 != 0) goto L47
            r0 = 1
            goto L48
        L47:
            r0 = 0
        L48:
            if (r10 < 0) goto L4c
            r4 = 1
            goto L4d
        L4c:
            r4 = 0
        L4d:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r4)
            java.lang.String r4 = r9.getPackageName()
            android.content.pm.PackageManager r5 = r9.getPackageManager()
            r6 = 9
            if (r0 == 0) goto L72
            java.lang.String r7 = "com.android.vending"
            r8 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r7 = r5.getPackageInfo(r7, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L65
            goto L73
        L65:
            java.lang.String r9 = java.lang.String.valueOf(r4)
            java.lang.String r10 = " requires the Google Play Store, but it is missing."
            r9.concat(r10)
        L6e:
            r2 = 9
            goto Lee
        L72:
            r7 = 0
        L73:
            r8 = 64
            android.content.pm.PackageInfo r8 = r5.getPackageInfo(r1, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le5
            com.google.android.gms.common.GoogleSignatureVerifier.getInstance(r9)
            boolean r9 = com.google.android.gms.common.GoogleSignatureVerifier.zzb(r8, r2)
            if (r9 != 0) goto L8c
            java.lang.String r9 = java.lang.String.valueOf(r4)
            java.lang.String r10 = " requires Google Play services, but their signature is invalid."
            r9.concat(r10)
            goto L6e
        L8c:
            if (r0 == 0) goto La1
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)
            boolean r9 = com.google.android.gms.common.GoogleSignatureVerifier.zzb(r7, r2)
            if (r9 != 0) goto La1
            java.lang.String r9 = java.lang.String.valueOf(r4)
            java.lang.String r10 = " requires Google Play Store, but its signature is invalid."
            r9.concat(r10)
            goto L6e
        La1:
            if (r0 == 0) goto Lbd
            if (r7 == 0) goto Lbd
            android.content.pm.Signature[] r9 = r7.signatures
            r9 = r9[r3]
            android.content.pm.Signature[] r0 = r8.signatures
            r0 = r0[r3]
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto Lbd
            java.lang.String r9 = java.lang.String.valueOf(r4)
            java.lang.String r10 = " requires Google Play Store, but its signature doesn't match that of Google Play services."
            r9.concat(r10)
            goto L6e
        Lbd:
            int r9 = r8.versionCode
            int r9 = com.google.android.gms.common.util.zza.zza(r9)
            int r10 = com.google.android.gms.common.util.zza.zza(r10)
            if (r9 >= r10) goto Lcb
            r2 = 2
            goto Lee
        Lcb:
            android.content.pm.ApplicationInfo r9 = r8.applicationInfo
            if (r9 != 0) goto Lde
            android.content.pm.ApplicationInfo r9 = r5.getApplicationInfo(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Ld4
            goto Lde
        Ld4:
            java.lang.String r9 = java.lang.String.valueOf(r4)
            java.lang.String r10 = " requires Google Play services, but they're missing when getting application info."
            r9.concat(r10)
            goto Lee
        Lde:
            boolean r9 = r9.enabled
            if (r9 != 0) goto Le4
            r2 = 3
            goto Lee
        Le4:
            return r3
        Le5:
            java.lang.String r9 = java.lang.String.valueOf(r4)
            java.lang.String r10 = " requires Google Play services, but they are missing."
            r9.concat(r10)
        Lee:
            return r2
    }

    @com.google.errorprone.annotations.InlineMe(imports = {"com.google.android.gms.common.util.UidVerifier"}, replacement = "UidVerifier.isGooglePlayServicesUid(context, uid)")
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public static boolean isGooglePlayServicesUid(@androidx.annotation.NonNull android.content.Context r0, int r1) {
            boolean r0 = com.google.android.gms.common.util.UidVerifier.isGooglePlayServicesUid(r0, r1)
            return r0
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public static boolean isPlayServicesPossiblyUpdating(@androidx.annotation.NonNull android.content.Context r2, int r3) {
            r0 = 18
            r1 = 1
            if (r3 != r0) goto L6
            return r1
        L6:
            if (r3 != r1) goto Lf
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = zza(r2, r3)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public static boolean isPlayStorePossiblyUpdating(@androidx.annotation.NonNull android.content.Context r1, int r2) {
            r0 = 9
            if (r2 != r0) goto Lb
            java.lang.String r2 = "com.android.vending"
            boolean r1 = zza(r1, r2)
            return r1
        Lb:
            r1 = 0
            return r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @android.annotation.TargetApi(18)
    public static boolean isRestrictedUserProfile(@androidx.annotation.NonNull android.content.Context r2) {
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR2()
            if (r0 == 0) goto L2b
            java.lang.String r0 = "user"
            java.lang.Object r0 = r2.getSystemService(r0)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            android.os.UserManager r0 = (android.os.UserManager) r0
            java.lang.String r2 = r2.getPackageName()
            android.os.Bundle r2 = r0.getApplicationRestrictions(r2)
            if (r2 == 0) goto L2b
            java.lang.String r0 = "true"
            java.lang.String r1 = "restricted_profile"
            java.lang.String r2 = r2.getString(r1)
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L2b
            r2 = 1
            return r2
        L2b:
            r2 = 0
            return r2
    }

    @java.lang.Deprecated
    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.errorprone.annotations.InlineMe(imports = {"com.google.android.gms.common.util.DeviceProperties"}, replacement = "DeviceProperties.isSidewinder(context)")
    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isSidewinderDevice(@androidx.annotation.NonNull android.content.Context r0) {
            boolean r0 = com.google.android.gms.common.util.DeviceProperties.isSidewinder(r0)
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public static boolean isUserRecoverableError(int r2) {
            r0 = 1
            if (r2 == r0) goto Lf
            r1 = 2
            if (r2 == r1) goto Lf
            r1 = 3
            if (r2 == r1) goto Lf
            r1 = 9
            if (r2 == r1) goto Lf
            r2 = 0
            return r2
        Lf:
            return r0
    }

    @java.lang.Deprecated
    @com.google.errorprone.annotations.InlineMe(imports = {"com.google.android.gms.common.util.UidVerifier"}, replacement = "UidVerifier.uidHasPackageName(context, uid, packageName)")
    @com.google.android.gms.common.annotation.KeepForSdk
    @android.annotation.TargetApi(19)
    public static boolean uidHasPackageName(@androidx.annotation.NonNull android.content.Context r0, int r1, @androidx.annotation.NonNull java.lang.String r2) {
            boolean r0 = com.google.android.gms.common.util.UidVerifier.uidHasPackageName(r0, r1, r2)
            return r0
    }

    @android.annotation.TargetApi(21)
    static boolean zza(android.content.Context r5, java.lang.String r6) {
            java.lang.String r0 = "com.google.android.gms"
            boolean r0 = r6.equals(r0)
            boolean r1 = com.google.android.gms.common.util.PlatformVersion.isAtLeastLollipop()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L36
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch: java.lang.Exception -> L35
            android.content.pm.PackageInstaller r1 = r1.getPackageInstaller()     // Catch: java.lang.Exception -> L35
            java.util.List r1 = r1.getAllSessions()     // Catch: java.lang.Exception -> L35
            java.util.Iterator r1 = r1.iterator()
        L1e:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L36
            java.lang.Object r4 = r1.next()
            android.content.pm.PackageInstaller$SessionInfo r4 = (android.content.pm.PackageInstaller.SessionInfo) r4
            java.lang.String r4 = r4.getAppPackageName()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L1e
            return r2
        L35:
            return r3
        L36:
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            r4 = 8192(0x2000, float:1.148E-41)
            android.content.pm.ApplicationInfo r6 = r1.getApplicationInfo(r6, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            if (r0 == 0) goto L45
            boolean r5 = r6.enabled     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            return r5
        L45:
            boolean r6 = r6.enabled     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            if (r6 == 0) goto L50
            boolean r5 = isRestrictedUserProfile(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            if (r5 != 0) goto L50
            return r2
        L50:
            return r3
    }
}
