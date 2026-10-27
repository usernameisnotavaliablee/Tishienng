package com.google.android.gms.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class GoogleApiAvailabilityLight {

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final java.lang.String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 0;

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final java.lang.String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    @com.google.android.gms.common.annotation.KeepForSdk
    static final java.lang.String TRACKING_SOURCE_DIALOG = "d";

    @com.google.android.gms.common.annotation.KeepForSdk
    static final java.lang.String TRACKING_SOURCE_NOTIFICATION = "n";
    private static final com.google.android.gms.common.GoogleApiAvailabilityLight zza = null;

    static {
            int r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE
            com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE = r0
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = new com.google.android.gms.common.GoogleApiAvailabilityLight
            r0.<init>()
            com.google.android.gms.common.GoogleApiAvailabilityLight.zza = r0
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    GoogleApiAvailabilityLight() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.common.GoogleApiAvailabilityLight getInstance() {
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.zza
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void cancelAvailabilityErrorNotifications(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            com.google.android.gms.common.GooglePlayServicesUtilLight.cancelAvailabilityErrorNotifications(r1)
            return
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public int getApkVersion(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            int r1 = com.google.android.gms.common.GooglePlayServicesUtilLight.getApkVersion(r1)
            return r1
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public int getClientVersion(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            int r1 = com.google.android.gms.common.GooglePlayServicesUtilLight.getClientVersion(r1)
            return r1
    }

    @java.lang.Deprecated
    @androidx.annotation.Nullable
    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.content.Intent getErrorResolutionIntent(int r2) {
            r1 = this;
            r0 = 0
            android.content.Intent r2 = r1.getErrorResolutionIntent(r0, r2, r0)
            return r2
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.content.Intent getErrorResolutionIntent(@androidx.annotation.Nullable android.content.Context r4, int r5, @androidx.annotation.Nullable java.lang.String r6) {
            r3 = this;
            r0 = 1
            java.lang.String r1 = "com.google.android.gms"
            if (r5 == r0) goto L1e
            r0 = 2
            if (r5 == r0) goto L1e
            r4 = 3
            r6 = 0
            if (r5 == r4) goto Ld
            return r6
        Ld:
            java.lang.String r4 = "package"
            android.net.Uri r4 = android.net.Uri.fromParts(r4, r1, r6)
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r6 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r5.<init>(r6)
            r5.setData(r4)
            return r5
        L1e:
            if (r4 == 0) goto L34
            boolean r5 = com.google.android.gms.common.util.DeviceProperties.isWearableWithoutPlayStore(r4)
            if (r5 != 0) goto L27
            goto L34
        L27:
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r5 = "com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION"
            r4.<init>(r5)
            java.lang.String r5 = "com.google.android.wearable.app"
            r4.setPackage(r5)
            return r4
        L34:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "gcore_"
            r5.append(r0)
            int r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE
            r5.append(r0)
            java.lang.String r0 = "-"
            r5.append(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 != 0) goto L51
            r5.append(r6)
        L51:
            r5.append(r0)
            if (r4 == 0) goto L5d
            java.lang.String r6 = r4.getPackageName()
            r5.append(r6)
        L5d:
            r5.append(r0)
            if (r4 == 0) goto L76
            com.google.android.gms.common.wrappers.PackageManagerWrapper r6 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            java.lang.String r4 = r4.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            r0 = 0
            android.content.pm.PackageInfo r4 = r6.getPackageInfo(r4, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            int r4 = r4.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            r5.append(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            goto L76
        L75:
        L76:
            java.lang.String r4 = r5.toString()
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r6 = "android.intent.action.VIEW"
            r5.<init>(r6)
            java.lang.String r6 = "market://details"
            android.net.Uri r6 = android.net.Uri.parse(r6)
            android.net.Uri$Builder r6 = r6.buildUpon()
            java.lang.String r0 = "id"
            android.net.Uri$Builder r6 = r6.appendQueryParameter(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L9c
            java.lang.String r0 = "pcampaignid"
            r6.appendQueryParameter(r0, r4)
        L9c:
            android.net.Uri r4 = r6.build()
            r5.setData(r4)
            java.lang.String r4 = "com.android.vending"
            r5.setPackage(r4)
            r4 = 524288(0x80000, float:7.34684E-40)
            r5.addFlags(r4)
            return r5
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.app.PendingIntent getErrorResolutionPendingIntent(@androidx.annotation.NonNull android.content.Context r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            android.app.PendingIntent r2 = r1.getErrorResolutionPendingIntent(r2, r3, r4, r0)
            return r2
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.app.PendingIntent getErrorResolutionPendingIntent(@androidx.annotation.NonNull android.content.Context r2, int r3, int r4, @androidx.annotation.Nullable java.lang.String r5) {
            r1 = this;
            android.content.Intent r3 = r1.getErrorResolutionIntent(r2, r3, r5)
            if (r3 != 0) goto L8
            r2 = 0
            return r2
        L8:
            int r5 = com.google.android.gms.internal.common.zzd.zza
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r5 = r5 | r0
            android.app.PendingIntent r2 = android.app.PendingIntent.getActivity(r2, r4, r3, r5)
            return r2
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.String getErrorString(int r1) {
            r0 = this;
            java.lang.String r1 = com.google.android.gms.common.GooglePlayServicesUtilLight.getErrorString(r1)
            return r1
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    @com.google.android.gms.common.internal.HideFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public int isGooglePlayServicesAvailable(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            int r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE
            int r2 = r1.isGooglePlayServicesAvailable(r2, r0)
            return r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public int isGooglePlayServicesAvailable(@androidx.annotation.NonNull android.content.Context r1, int r2) {
            r0 = this;
            int r2 = com.google.android.gms.common.GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(r1, r2)
            boolean r1 = com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(r1, r2)
            if (r1 == 0) goto Ld
            r1 = 18
            return r1
        Ld:
            return r2
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean isPlayServicesPossiblyUpdating(@androidx.annotation.NonNull android.content.Context r1, int r2) {
            r0 = this;
            boolean r1 = com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(r1, r2)
            return r1
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean isPlayStorePossiblyUpdating(@androidx.annotation.NonNull android.content.Context r1, int r2) {
            r0 = this;
            boolean r1 = com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(r1, r2)
            return r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean isUninstalledAppPossiblyUpdating(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull java.lang.String r2) {
            r0 = this;
            boolean r1 = com.google.android.gms.common.GooglePlayServicesUtilLight.zza(r1, r2)
            return r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean isUserResolvableError(int r1) {
            r0 = this;
            boolean r1 = com.google.android.gms.common.GooglePlayServicesUtilLight.isUserRecoverableError(r1)
            return r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void verifyGooglePlayServicesIsAvailable(@androidx.annotation.NonNull android.content.Context r1, int r2) throws com.google.android.gms.common.GooglePlayServicesRepairableException, com.google.android.gms.common.GooglePlayServicesNotAvailableException {
            r0 = this;
            com.google.android.gms.common.GooglePlayServicesUtilLight.ensurePlayServicesAvailable(r1, r2)
            return
    }
}
