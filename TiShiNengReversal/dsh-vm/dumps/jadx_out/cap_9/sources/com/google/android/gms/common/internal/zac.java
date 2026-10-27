package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zac {

    @com.google.errorprone.annotations.concurrent.GuardedBy("cache")
    private static final androidx.collection.SimpleArrayMap zaa = null;

    @androidx.annotation.Nullable
    @com.google.errorprone.annotations.concurrent.GuardedBy("cache")
    private static java.util.Locale zab;

    static {
            androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
            r0.<init>()
            com.google.android.gms.common.internal.zac.zaa = r0
            return
    }

    public zac() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String zaa(android.content.Context r2) {
            java.lang.String r0 = r2.getPackageName()
            com.google.android.gms.common.wrappers.PackageManagerWrapper r1 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r2)     // Catch: java.lang.Throwable -> L11
            java.lang.CharSequence r1 = r1.getApplicationLabel(r0)     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = r1.toString()     // Catch: java.lang.Throwable -> L11
            return r2
        L11:
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            java.lang.String r2 = r2.name
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 == 0) goto L1f
            return r0
        L1f:
            return r2
    }

    @androidx.annotation.NonNull
    public static java.lang.String zab(android.content.Context r1, int r2) {
            android.content.res.Resources r1 = r1.getResources()
            r0 = 1
            if (r2 == r0) goto L23
            r0 = 2
            if (r2 == r0) goto L1c
            r0 = 3
            if (r2 == r0) goto L15
            r2 = 17039370(0x104000a, float:2.42446E-38)
            java.lang.String r1 = r1.getString(r2)
            return r1
        L15:
            int r2 = com.bjtsn.pose_detection.R.string.common_google_play_services_enable_button
            java.lang.String r1 = r1.getString(r2)
            return r1
        L1c:
            int r2 = com.bjtsn.pose_detection.R.string.common_google_play_services_update_button
            java.lang.String r1 = r1.getString(r2)
            return r1
        L23:
            int r2 = com.bjtsn.pose_detection.R.string.common_google_play_services_install_button
            java.lang.String r1 = r1.getString(r2)
            return r1
    }

    @androidx.annotation.NonNull
    public static java.lang.String zac(android.content.Context r5, int r6) {
            android.content.res.Resources r0 = r5.getResources()
            java.lang.String r1 = zaa(r5)
            r2 = 0
            r3 = 1
            if (r6 == r3) goto L8a
            r4 = 2
            if (r6 == r4) goto L72
            r4 = 3
            if (r6 == r4) goto L67
            r4 = 5
            if (r6 == r4) goto L60
            r4 = 7
            if (r6 == r4) goto L59
            r4 = 9
            if (r6 == r4) goto L4e
            r4 = 20
            if (r6 == r4) goto L47
            switch(r6) {
                case 16: goto L40;
                case 17: goto L39;
                case 18: goto L2e;
                default: goto L23;
            }
        L23:
            int r5 = com.bjtsn.pose_detection.R.string.common_google_play_services_unknown_issue
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r2] = r1
            java.lang.String r5 = r0.getString(r5, r6)
            return r5
        L2e:
            int r5 = com.bjtsn.pose_detection.R.string.common_google_play_services_updating_text
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r2] = r1
            java.lang.String r5 = r0.getString(r5, r6)
            return r5
        L39:
            java.lang.String r6 = "common_google_play_services_sign_in_failed_text"
            java.lang.String r5 = zag(r5, r6, r1)
            return r5
        L40:
            java.lang.String r6 = "common_google_play_services_api_unavailable_text"
            java.lang.String r5 = zag(r5, r6, r1)
            return r5
        L47:
            java.lang.String r6 = "common_google_play_services_restricted_profile_text"
            java.lang.String r5 = zag(r5, r6, r1)
            return r5
        L4e:
            int r5 = com.bjtsn.pose_detection.R.string.common_google_play_services_unsupported_text
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r2] = r1
            java.lang.String r5 = r0.getString(r5, r6)
            return r5
        L59:
            java.lang.String r6 = "common_google_play_services_network_error_text"
            java.lang.String r5 = zag(r5, r6, r1)
            return r5
        L60:
            java.lang.String r6 = "common_google_play_services_invalid_account_text"
            java.lang.String r5 = zag(r5, r6, r1)
            return r5
        L67:
            int r5 = com.bjtsn.pose_detection.R.string.common_google_play_services_enable_text
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r2] = r1
            java.lang.String r5 = r0.getString(r5, r6)
            return r5
        L72:
            boolean r5 = com.google.android.gms.common.util.DeviceProperties.isWearableWithoutPlayStore(r5)
            if (r5 == 0) goto L7f
            int r5 = com.bjtsn.pose_detection.R.string.common_google_play_services_wear_update_text
            java.lang.String r5 = r0.getString(r5)
            return r5
        L7f:
            int r5 = com.bjtsn.pose_detection.R.string.common_google_play_services_update_text
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r2] = r1
            java.lang.String r5 = r0.getString(r5, r6)
            return r5
        L8a:
            int r5 = com.bjtsn.pose_detection.R.string.common_google_play_services_install_text
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r2] = r1
            java.lang.String r5 = r0.getString(r5, r6)
            return r5
    }

    @androidx.annotation.NonNull
    public static java.lang.String zad(android.content.Context r1, int r2) {
            r0 = 6
            if (r2 == r0) goto Ld
            r0 = 19
            if (r2 != r0) goto L8
            goto Ld
        L8:
            java.lang.String r1 = zac(r1, r2)
            return r1
        Ld:
            java.lang.String r2 = zaa(r1)
            java.lang.String r0 = "common_google_play_services_resolution_required_text"
            java.lang.String r1 = zag(r1, r0, r2)
            return r1
    }

    @androidx.annotation.NonNull
    public static java.lang.String zae(android.content.Context r1, int r2) {
            r0 = 6
            if (r2 != r0) goto La
            java.lang.String r2 = "common_google_play_services_resolution_required_title"
            java.lang.String r2 = zah(r1, r2)
            goto Le
        La:
            java.lang.String r2 = zaf(r1, r2)
        Le:
            if (r2 != 0) goto L1b
            android.content.res.Resources r1 = r1.getResources()
            int r2 = com.bjtsn.pose_detection.R.string.common_google_play_services_notification_ticker
            java.lang.String r1 = r1.getString(r2)
            return r1
        L1b:
            return r2
    }

    @androidx.annotation.Nullable
    public static java.lang.String zaf(android.content.Context r2, int r3) {
            android.content.res.Resources r0 = r2.getResources()
            r1 = 0
            switch(r3) {
                case 1: goto L35;
                case 2: goto L2e;
                case 3: goto L27;
                case 4: goto L26;
                case 5: goto L1f;
                case 6: goto L26;
                case 7: goto L18;
                case 8: goto L17;
                case 9: goto L17;
                case 10: goto L17;
                case 11: goto L17;
                case 12: goto L8;
                case 13: goto L8;
                case 14: goto L8;
                case 15: goto L8;
                case 16: goto L17;
                case 17: goto L10;
                case 18: goto L26;
                case 19: goto L8;
                case 20: goto L9;
                default: goto L8;
            }
        L8:
            return r1
        L9:
            java.lang.String r3 = "common_google_play_services_restricted_profile_title"
            java.lang.String r2 = zah(r2, r3)
            return r2
        L10:
            java.lang.String r3 = "common_google_play_services_sign_in_failed_title"
            java.lang.String r2 = zah(r2, r3)
            return r2
        L17:
            return r1
        L18:
            java.lang.String r3 = "common_google_play_services_network_error_title"
            java.lang.String r2 = zah(r2, r3)
            return r2
        L1f:
            java.lang.String r3 = "common_google_play_services_invalid_account_title"
            java.lang.String r2 = zah(r2, r3)
            return r2
        L26:
            return r1
        L27:
            int r2 = com.bjtsn.pose_detection.R.string.common_google_play_services_enable_title
            java.lang.String r2 = r0.getString(r2)
            return r2
        L2e:
            int r2 = com.bjtsn.pose_detection.R.string.common_google_play_services_update_title
            java.lang.String r2 = r0.getString(r2)
            return r2
        L35:
            int r2 = com.bjtsn.pose_detection.R.string.common_google_play_services_install_title
            java.lang.String r2 = r0.getString(r2)
            return r2
    }

    private static java.lang.String zag(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            android.content.res.Resources r0 = r2.getResources()
            java.lang.String r2 = zah(r2, r3)
            if (r2 != 0) goto L10
            int r2 = com.bjtsn.pose_detection.R.string.common_google_play_services_unknown_issue
            java.lang.String r2 = r0.getString(r2)
        L10:
            android.content.res.Configuration r3 = r0.getConfiguration()
            java.util.Locale r3 = r3.locale
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            java.lang.String r2 = java.lang.String.format(r3, r2, r0)
            return r2
    }

    @androidx.annotation.Nullable
    private static java.lang.String zah(android.content.Context r4, java.lang.String r5) {
            androidx.collection.SimpleArrayMap r0 = com.google.android.gms.common.internal.zac.zaa
            monitor-enter(r0)
            android.content.res.Resources r1 = r4.getResources()     // Catch: java.lang.Throwable -> L22
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.Throwable -> L22
            androidx.core.os.LocaleListCompat r1 = androidx.core.os.ConfigurationCompat.getLocales(r1)     // Catch: java.lang.Throwable -> L22
            r2 = 0
            java.util.Locale r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L22
            java.util.Locale r2 = com.google.android.gms.common.internal.zac.zab     // Catch: java.lang.Throwable -> L22
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Throwable -> L22
            if (r2 != 0) goto L24
            r0.clear()     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.common.internal.zac.zab = r1     // Catch: java.lang.Throwable -> L22
            goto L24
        L22:
            r4 = move-exception
            goto L54
        L24:
            java.lang.Object r1 = r0.get(r5)     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L2e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            return r1
        L2e:
            android.content.res.Resources r4 = com.google.android.gms.common.GooglePlayServicesUtil.getRemoteResource(r4)     // Catch: java.lang.Throwable -> L22
            r1 = 0
            if (r4 != 0) goto L37
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            return r1
        L37:
            java.lang.String r2 = "string"
            java.lang.String r3 = "com.google.android.gms"
            int r2 = r4.getIdentifier(r5, r2, r3)     // Catch: java.lang.Throwable -> L22
            if (r2 != 0) goto L43
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            return r1
        L43:
            java.lang.String r4 = r4.getString(r2)     // Catch: java.lang.Throwable -> L22
            boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L4f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            return r1
        L4f:
            r0.put(r5, r4)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            return r4
        L54:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r4
    }
}
