package androidx.core.content;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class IntentCompat {

    @android.annotation.SuppressLint({"ActionValue"})
    public static final java.lang.String ACTION_CREATE_REMINDER = "android.intent.action.CREATE_REMINDER";
    public static final java.lang.String CATEGORY_LEANBACK_LAUNCHER = "android.intent.category.LEANBACK_LAUNCHER";
    public static final java.lang.String EXTRA_HTML_TEXT = "android.intent.extra.HTML_TEXT";
    public static final java.lang.String EXTRA_START_PLAYBACK = "android.intent.extra.START_PLAYBACK";

    @android.annotation.SuppressLint({"ActionValue"})
    public static final java.lang.String EXTRA_TIME = "android.intent.extra.TIME";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(33)
    static class Api33Impl {
        private Api33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static <T> T[] getParcelableArrayExtra(@androidx.annotation.NonNull android.content.Intent r0, @androidx.annotation.Nullable java.lang.String r1, @androidx.annotation.NonNull java.lang.Class<T> r2) {
                java.lang.Object[] r0 = r0.getParcelableArrayExtra(r1, r2)
                return r0
        }

        @androidx.annotation.DoNotInline
        static <T> java.util.ArrayList<T> getParcelableArrayListExtra(@androidx.annotation.NonNull android.content.Intent r0, @androidx.annotation.Nullable java.lang.String r1, @androidx.annotation.NonNull java.lang.Class<? extends T> r2) {
                java.util.ArrayList r0 = r0.getParcelableArrayListExtra(r1, r2)
                return r0
        }

        @androidx.annotation.DoNotInline
        static <T> T getParcelableExtra(@androidx.annotation.NonNull android.content.Intent r0, @androidx.annotation.Nullable java.lang.String r1, @androidx.annotation.NonNull java.lang.Class<T> r2) {
                java.lang.Object r0 = r0.getParcelableExtra(r1, r2)
                return r0
        }

        @androidx.annotation.DoNotInline
        static <T extends java.io.Serializable> T getSerializableExtra(@androidx.annotation.NonNull android.content.Intent r0, @androidx.annotation.Nullable java.lang.String r1, @androidx.annotation.NonNull java.lang.Class<T> r2) {
                java.io.Serializable r0 = r0.getSerializableExtra(r1, r2)
                return r0
        }
    }

    private IntentCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static android.content.Intent createManageUnusedAppRestrictionsIntent(@androidx.annotation.NonNull android.content.Context r5, @androidx.annotation.NonNull java.lang.String r6) {
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            boolean r0 = androidx.core.content.PackageManagerCompat.areUnusedAppRestrictionsAvailable(r0)
            if (r0 == 0) goto L4a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            r2 = 0
            java.lang.String r3 = "package"
            if (r0 < r1) goto L23
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r0 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r5.<init>(r0)
            android.net.Uri r6 = android.net.Uri.fromParts(r3, r6, r2)
            android.content.Intent r5 = r5.setData(r6)
            return r5
        L23:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r4 = "android.intent.action.AUTO_REVOKE_PERMISSIONS"
            r1.<init>(r4)
            android.net.Uri r6 = android.net.Uri.fromParts(r3, r6, r2)
            android.content.Intent r6 = r1.setData(r6)
            r1 = 30
            if (r0 < r1) goto L37
            return r6
        L37:
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            java.lang.String r5 = androidx.core.content.PackageManagerCompat.getPermissionRevocationVerifierApp(r5)
            java.lang.Object r5 = androidx.core.util.Preconditions.checkNotNull(r5)
            java.lang.String r5 = (java.lang.String) r5
            android.content.Intent r5 = r6.setPackage(r5)
            return r5
        L4a:
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            java.lang.String r6 = "Unused App Restriction features are not available on this device"
            r5.<init>(r6)
            throw r5
    }

    @androidx.annotation.Nullable
    @android.annotation.SuppressLint({"ArrayReturn", "NullableCollection"})
    public static android.os.Parcelable[] getParcelableArrayExtra(@androidx.annotation.NonNull android.content.Intent r2, @androidx.annotation.Nullable java.lang.String r3, @androidx.annotation.NonNull java.lang.Class<? extends android.os.Parcelable> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Ld
            java.lang.Object[] r2 = androidx.core.content.IntentCompat.Api33Impl.getParcelableArrayExtra(r2, r3, r4)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            return r2
        Ld:
            android.os.Parcelable[] r2 = r2.getParcelableArrayExtra(r3)
            return r2
    }

    @androidx.annotation.Nullable
    @android.annotation.SuppressLint({"ConcreteCollection", "NullableCollection"})
    public static <T> java.util.ArrayList<T> getParcelableArrayListExtra(@androidx.annotation.NonNull android.content.Intent r2, @androidx.annotation.Nullable java.lang.String r3, @androidx.annotation.NonNull java.lang.Class<? extends T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            java.util.ArrayList r2 = androidx.core.content.IntentCompat.Api33Impl.getParcelableArrayListExtra(r2, r3, r4)
            return r2
        Lb:
            java.util.ArrayList r2 = r2.getParcelableArrayListExtra(r3)
            return r2
    }

    @androidx.annotation.Nullable
    public static <T> T getParcelableExtra(@androidx.annotation.NonNull android.content.Intent r2, @androidx.annotation.Nullable java.lang.String r3, @androidx.annotation.NonNull java.lang.Class<T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            java.lang.Object r2 = androidx.core.content.IntentCompat.Api33Impl.getParcelableExtra(r2, r3, r4)
            return r2
        Lb:
            android.os.Parcelable r2 = r2.getParcelableExtra(r3)
            boolean r3 = r4.isInstance(r2)
            if (r3 == 0) goto L16
            return r2
        L16:
            r2 = 0
            return r2
    }

    @androidx.annotation.Nullable
    public static <T extends java.io.Serializable> T getSerializableExtra(@androidx.annotation.NonNull android.content.Intent r2, @androidx.annotation.Nullable java.lang.String r3, @androidx.annotation.NonNull java.lang.Class<T> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            java.io.Serializable r2 = androidx.core.content.IntentCompat.Api33Impl.getSerializableExtra(r2, r3, r4)
            return r2
        Lb:
            java.io.Serializable r2 = r2.getSerializableExtra(r3)
            boolean r3 = r4.isInstance(r2)
            if (r3 == 0) goto L16
            return r2
        L16:
            r2 = 0
            return r2
    }

    @androidx.annotation.NonNull
    public static android.content.Intent makeMainSelectorActivity(@androidx.annotation.NonNull java.lang.String r0, @androidx.annotation.NonNull java.lang.String r1) {
            android.content.Intent r0 = android.content.Intent.makeMainSelectorActivity(r0, r1)
            return r0
    }
}
