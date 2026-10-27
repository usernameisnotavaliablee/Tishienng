package androidx.core.text;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ICUCompat {
    private static final java.lang.String TAG = "ICUCompat";
    private static java.lang.reflect.Method sAddLikelySubtagsMethod;
    private static java.lang.reflect.Method sGetScriptMethod;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static java.lang.String getScript(java.util.Locale r0) {
                java.lang.String r0 = r0.getScript()
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
        static android.icu.util.ULocale addLikelySubtags(java.lang.Object r0) {
                android.icu.util.ULocale r0 = (android.icu.util.ULocale) r0
                android.icu.util.ULocale r0 = android.icu.util.ULocale.addLikelySubtags(r0)
                return r0
        }

        @androidx.annotation.DoNotInline
        static android.icu.util.ULocale forLocale(java.util.Locale r0) {
                android.icu.util.ULocale r0 = android.icu.util.ULocale.forLocale(r0)
                return r0
        }

        @androidx.annotation.DoNotInline
        static java.lang.String getScript(java.lang.Object r0) {
                android.icu.util.ULocale r0 = (android.icu.util.ULocale) r0
                java.lang.String r0 = r0.getScript()
                return r0
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 >= r1) goto L24
            java.lang.String r0 = "libcore.icu.ICU"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L1d
            java.lang.String r1 = "addLikelySubtags"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L1d
            java.lang.Class<java.util.Locale> r3 = java.util.Locale.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Exception -> L1d
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Exception -> L1d
            androidx.core.text.ICUCompat.sAddLikelySubtagsMethod = r0     // Catch: java.lang.Exception -> L1d
            return
        L1d:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L24:
            return
    }

    private ICUCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @android.annotation.SuppressLint({"BanUncheckedReflection"})
    private static java.lang.String addLikelySubtagsBelowApi21(java.util.Locale r3) {
            java.lang.String r3 = r3.toString()
            java.lang.reflect.Method r0 = androidx.core.text.ICUCompat.sAddLikelySubtagsMethod     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L16
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L16
            r2 = 0
            r1[r2] = r3     // Catch: java.lang.Throwable -> L16
            r2 = 0
            java.lang.Object r0 = r0.invoke(r2, r1)     // Catch: java.lang.Throwable -> L16
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L16
            return r0
        L16:
            return r3
    }

    @android.annotation.SuppressLint({"BanUncheckedReflection"})
    private static java.lang.String getScriptBelowApi21(java.lang.String r4) {
            r0 = 0
            java.lang.reflect.Method r1 = androidx.core.text.ICUCompat.sGetScriptMethod     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L12
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L12
            r3 = 0
            r2[r3] = r4     // Catch: java.lang.Throwable -> L12
            java.lang.Object r4 = r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L12
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L12
            return r4
        L12:
            return r0
    }

    @androidx.annotation.Nullable
    public static java.lang.String maximizeAndGetScript(@androidx.annotation.NonNull java.util.Locale r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L13
            android.icu.util.ULocale r3 = androidx.core.text.ICUCompat.Api24Impl.forLocale(r3)
            android.icu.util.ULocale r3 = androidx.core.text.ICUCompat.Api24Impl.addLikelySubtags(r3)
            java.lang.String r3 = androidx.core.text.ICUCompat.Api24Impl.getScript(r3)
            return r3
        L13:
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L27
            r1 = 0
            r0[r1] = r3     // Catch: java.lang.Throwable -> L27
            java.lang.reflect.Method r1 = androidx.core.text.ICUCompat.sAddLikelySubtagsMethod     // Catch: java.lang.Throwable -> L27
            r2 = 0
            java.lang.Object r0 = r1.invoke(r2, r0)     // Catch: java.lang.Throwable -> L27
            java.util.Locale r0 = (java.util.Locale) r0     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = androidx.core.text.ICUCompat.Api21Impl.getScript(r0)     // Catch: java.lang.Throwable -> L27
            return r3
        L27:
            java.lang.String r3 = androidx.core.text.ICUCompat.Api21Impl.getScript(r3)
            return r3
    }
}
