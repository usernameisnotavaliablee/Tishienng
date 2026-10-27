package androidx.core.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class LocaleManagerCompat {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static java.lang.String toLanguageTag(java.util.Locale r0) {
                java.lang.String r0 = r0.toLanguageTag()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(24)
    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static androidx.core.os.LocaleListCompat getLocales(android.content.res.Configuration r0) {
                android.os.LocaleList r0 = r0.getLocales()
                java.lang.String r0 = r0.toLanguageTags()
                androidx.core.os.LocaleListCompat r0 = androidx.core.os.LocaleListCompat.forLanguageTags(r0)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(33)
    static class Api33Impl {
        private Api33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.os.LocaleList localeManagerGetApplicationLocales(java.lang.Object r0) {
                android.app.LocaleManager r0 = (android.app.LocaleManager) r0
                android.os.LocaleList r0 = r0.getApplicationLocales()
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.os.LocaleList localeManagerGetSystemLocales(java.lang.Object r0) {
                android.app.LocaleManager r0 = (android.app.LocaleManager) r0
                android.os.LocaleList r0 = r0.getSystemLocales()
                return r0
        }
    }

    private LocaleManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.AnyThread
    public static androidx.core.os.LocaleListCompat getApplicationLocales(@androidx.annotation.NonNull android.content.Context r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L1a
            java.lang.Object r2 = getLocaleManagerForApplication(r2)
            if (r2 == 0) goto L15
            android.os.LocaleList r2 = androidx.core.app.LocaleManagerCompat.Api33Impl.localeManagerGetApplicationLocales(r2)
            androidx.core.os.LocaleListCompat r2 = androidx.core.os.LocaleListCompat.wrap(r2)
            return r2
        L15:
            androidx.core.os.LocaleListCompat r2 = androidx.core.os.LocaleListCompat.getEmptyLocaleList()
            return r2
        L1a:
            java.lang.String r2 = androidx.core.app.AppLocalesStorageHelper.readLocales(r2)
            androidx.core.os.LocaleListCompat r2 = androidx.core.os.LocaleListCompat.forLanguageTags(r2)
            return r2
    }

    @androidx.annotation.VisibleForTesting
    static androidx.core.os.LocaleListCompat getConfigurationLocales(android.content.res.Configuration r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lb
            androidx.core.os.LocaleListCompat r2 = androidx.core.app.LocaleManagerCompat.Api24Impl.getLocales(r2)
            return r2
        Lb:
            java.util.Locale r2 = r2.locale
            java.lang.String r2 = androidx.core.app.LocaleManagerCompat.Api21Impl.toLanguageTag(r2)
            androidx.core.os.LocaleListCompat r2 = androidx.core.os.LocaleListCompat.forLanguageTags(r2)
            return r2
    }

    @androidx.annotation.RequiresApi(33)
    private static java.lang.Object getLocaleManagerForApplication(android.content.Context r1) {
            java.lang.String r0 = "locale"
            java.lang.Object r1 = r1.getSystemService(r0)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.AnyThread
    public static androidx.core.os.LocaleListCompat getSystemLocales(@androidx.annotation.NonNull android.content.Context r3) {
            androidx.core.os.LocaleListCompat r0 = androidx.core.os.LocaleListCompat.getEmptyLocaleList()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L1a
            java.lang.Object r3 = getLocaleManagerForApplication(r3)
            if (r3 == 0) goto L19
            android.os.LocaleList r3 = androidx.core.app.LocaleManagerCompat.Api33Impl.localeManagerGetSystemLocales(r3)
            androidx.core.os.LocaleListCompat r3 = androidx.core.os.LocaleListCompat.wrap(r3)
            return r3
        L19:
            return r0
        L1a:
            android.content.res.Resources r3 = android.content.res.Resources.getSystem()
            android.content.res.Configuration r3 = r3.getConfiguration()
            androidx.core.os.LocaleListCompat r3 = getConfigurationLocales(r3)
            return r3
    }
}
