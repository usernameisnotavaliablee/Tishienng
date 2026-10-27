package androidx.core.os;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ConfigurationCompat {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(24)
    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.os.LocaleList getLocales(android.content.res.Configuration r0) {
                android.os.LocaleList r0 = r0.getLocales()
                return r0
        }

        @androidx.annotation.DoNotInline
        static void setLocales(@androidx.annotation.NonNull android.content.res.Configuration r0, @androidx.annotation.NonNull androidx.core.os.LocaleListCompat r1) {
                java.lang.Object r1 = r1.unwrap()
                android.os.LocaleList r1 = (android.os.LocaleList) r1
                r0.setLocales(r1)
                return
        }
    }

    private ConfigurationCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static androidx.core.os.LocaleListCompat getLocales(@androidx.annotation.NonNull android.content.res.Configuration r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lf
            android.os.LocaleList r2 = androidx.core.os.ConfigurationCompat.Api24Impl.getLocales(r2)
            androidx.core.os.LocaleListCompat r2 = androidx.core.os.LocaleListCompat.wrap(r2)
            return r2
        Lf:
            java.util.Locale r2 = r2.locale
            r0 = 1
            java.util.Locale[] r0 = new java.util.Locale[r0]
            r1 = 0
            r0[r1] = r2
            androidx.core.os.LocaleListCompat r2 = androidx.core.os.LocaleListCompat.create(r0)
            return r2
    }

    public static void setLocales(@androidx.annotation.NonNull android.content.res.Configuration r2, @androidx.annotation.NonNull androidx.core.os.LocaleListCompat r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto La
            androidx.core.os.ConfigurationCompat.Api24Impl.setLocales(r2, r3)
            return
        La:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L18
            r0 = 0
            java.util.Locale r3 = r3.get(r0)
            r2.setLocale(r3)
        L18:
            return
    }
}
