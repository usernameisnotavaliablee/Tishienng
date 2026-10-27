package androidx.core.text.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class LocalePreferences {
    private static final java.lang.String TAG = "LocalePreferences";
    private static final java.lang.String[] WEATHER_FAHRENHEIT_COUNTRIES = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.core.text.util.LocalePreferences$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$android$icu$text$DateFormat$HourCycle = null;

        static {
                android.icu.text.DateFormat$HourCycle[] r0 = androidx.core.text.util.b.a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.core.text.util.LocalePreferences.AnonymousClass1.$SwitchMap$android$icu$text$DateFormat$HourCycle = r0
                android.icu.text.DateFormat$HourCycle r1 = androidx.core.text.util.c.a()     // Catch: java.lang.NoSuchFieldError -> L14
                int r1 = androidx.core.text.util.d.a(r1)     // Catch: java.lang.NoSuchFieldError -> L14
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L14
            L14:
                int[] r0 = androidx.core.text.util.LocalePreferences.AnonymousClass1.$SwitchMap$android$icu$text$DateFormat$HourCycle     // Catch: java.lang.NoSuchFieldError -> L21
                android.icu.text.DateFormat$HourCycle r1 = androidx.core.text.util.e.a()     // Catch: java.lang.NoSuchFieldError -> L21
                int r1 = androidx.core.text.util.d.a(r1)     // Catch: java.lang.NoSuchFieldError -> L21
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L21
            L21:
                int[] r0 = androidx.core.text.util.LocalePreferences.AnonymousClass1.$SwitchMap$android$icu$text$DateFormat$HourCycle     // Catch: java.lang.NoSuchFieldError -> L2e
                android.icu.text.DateFormat$HourCycle r1 = androidx.core.text.util.f.a()     // Catch: java.lang.NoSuchFieldError -> L2e
                int r1 = androidx.core.text.util.d.a(r1)     // Catch: java.lang.NoSuchFieldError -> L2e
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2e
            L2e:
                int[] r0 = androidx.core.text.util.LocalePreferences.AnonymousClass1.$SwitchMap$android$icu$text$DateFormat$HourCycle     // Catch: java.lang.NoSuchFieldError -> L3b
                android.icu.text.DateFormat$HourCycle r1 = androidx.core.text.util.g.a()     // Catch: java.lang.NoSuchFieldError -> L3b
                int r1 = androidx.core.text.util.d.a(r1)     // Catch: java.lang.NoSuchFieldError -> L3b
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3b
            L3b:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(24)
    private static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static java.lang.String getCalendarType(@androidx.annotation.NonNull java.util.Locale r0) {
                android.icu.util.Calendar r0 = android.icu.util.Calendar.getInstance(r0)
                java.lang.String r0 = r0.getType()
                return r0
        }

        @androidx.annotation.DoNotInline
        static java.util.Locale getDefaultLocale() {
                java.util.Locale$Category r0 = java.util.Locale.Category.FORMAT
                java.util.Locale r0 = java.util.Locale.getDefault(r0)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(33)
    private static class Api33Impl {
        private Api33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static java.lang.String getHourCycle(@androidx.annotation.NonNull java.util.Locale r0) {
                android.icu.text.DateTimePatternGenerator r0 = android.icu.text.DateTimePatternGenerator.getInstance(r0)
                android.icu.text.DateFormat$HourCycle r0 = r0.getDefaultHourCycle()
                java.lang.String r0 = getHourCycleType(r0)
                return r0
        }

        private static java.lang.String getHourCycleType(android.icu.text.DateFormat.HourCycle r1) {
                int[] r0 = androidx.core.text.util.LocalePreferences.AnonymousClass1.$SwitchMap$android$icu$text$DateFormat$HourCycle
                int r1 = r1.ordinal()
                r1 = r0[r1]
                r0 = 1
                if (r1 == r0) goto L20
                r0 = 2
                if (r1 == r0) goto L1d
                r0 = 3
                if (r1 == r0) goto L1a
                r0 = 4
                if (r1 == r0) goto L17
                java.lang.String r1 = ""
                return r1
            L17:
                java.lang.String r1 = "h24"
                return r1
            L1a:
                java.lang.String r1 = "h23"
                return r1
            L1d:
                java.lang.String r1 = "h12"
                return r1
            L20:
                java.lang.String r1 = "h11"
                return r1
        }

        @androidx.annotation.DoNotInline
        static java.lang.String getResolvedTemperatureUnit(@androidx.annotation.NonNull java.util.Locale r2) {
                android.icu.number.UnlocalizedNumberFormatter r0 = android.icu.number.NumberFormatter.with()
                java.lang.String r1 = "weather"
                android.icu.number.NumberFormatterSettings r0 = r0.usage(r1)
                android.icu.number.UnlocalizedNumberFormatter r0 = (android.icu.number.UnlocalizedNumberFormatter) r0
                android.icu.util.MeasureUnit r1 = android.icu.util.MeasureUnit.CELSIUS
                android.icu.number.NumberFormatterSettings r0 = r0.unit(r1)
                android.icu.number.UnlocalizedNumberFormatter r0 = (android.icu.number.UnlocalizedNumberFormatter) r0
                android.icu.number.LocalizedNumberFormatter r2 = r0.locale(r2)
                r0 = 1
                android.icu.number.FormattedNumber r2 = r2.format(r0)
                android.icu.util.MeasureUnit r2 = r2.getOutputUnit()
                java.lang.String r2 = r2.getIdentifier()
                java.lang.String r0 = "fahrenhe"
                boolean r1 = r2.startsWith(r0)
                if (r1 == 0) goto L30
                return r0
            L30:
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class CalendarType {
        public static final java.lang.String CHINESE = "chinese";
        public static final java.lang.String DANGI = "dangi";
        public static final java.lang.String DEFAULT = "";
        public static final java.lang.String GREGORIAN = "gregorian";
        public static final java.lang.String HEBREW = "hebrew";
        public static final java.lang.String INDIAN = "indian";
        public static final java.lang.String ISLAMIC = "islamic";
        public static final java.lang.String ISLAMIC_CIVIL = "islamic-civil";
        public static final java.lang.String ISLAMIC_RGSA = "islamic-rgsa";
        public static final java.lang.String ISLAMIC_TBLA = "islamic-tbla";
        public static final java.lang.String ISLAMIC_UMALQURA = "islamic-umalqura";
        public static final java.lang.String PERSIAN = "persian";
        private static final java.lang.String U_EXTENSION_TAG = "ca";

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
        public @interface CalendarTypes {
        }

        private CalendarType() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class FirstDayOfWeek {
        public static final java.lang.String DEFAULT = "";
        public static final java.lang.String FRIDAY = "fri";
        public static final java.lang.String MONDAY = "mon";
        public static final java.lang.String SATURDAY = "sat";
        public static final java.lang.String SUNDAY = "sun";
        public static final java.lang.String THURSDAY = "thu";
        public static final java.lang.String TUESDAY = "tue";
        private static final java.lang.String U_EXTENSION_TAG = "fw";
        public static final java.lang.String WEDNESDAY = "wed";

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
        public @interface Days {
        }

        private FirstDayOfWeek() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class HourCycle {
        public static final java.lang.String DEFAULT = "";
        public static final java.lang.String H11 = "h11";
        public static final java.lang.String H12 = "h12";
        public static final java.lang.String H23 = "h23";
        public static final java.lang.String H24 = "h24";
        private static final java.lang.String U_EXTENSION_TAG = "hc";

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
        public @interface HourCycleTypes {
        }

        private HourCycle() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class TemperatureUnit {
        public static final java.lang.String CELSIUS = "celsius";
        public static final java.lang.String DEFAULT = "";
        public static final java.lang.String FAHRENHEIT = "fahrenhe";
        public static final java.lang.String KELVIN = "kelvin";
        private static final java.lang.String U_EXTENSION_TAG = "mu";

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
        public @interface TemperatureUnits {
        }

        private TemperatureUnit() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            java.lang.String r4 = "PW"
            java.lang.String r5 = "US"
            java.lang.String r0 = "BS"
            java.lang.String r1 = "BZ"
            java.lang.String r2 = "KY"
            java.lang.String r3 = "PR"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5}
            androidx.core.text.util.LocalePreferences.WEATHER_FAHRENHEIT_COUNTRIES = r0
            return
    }

    private LocalePreferences() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String getBaseFirstDayOfWeek(@androidx.annotation.NonNull java.util.Locale r0) {
            java.util.Calendar r0 = java.util.Calendar.getInstance(r0)
            int r0 = r0.getFirstDayOfWeek()
            java.lang.String r0 = getStringOfFirstDayOfWeek(r0)
            return r0
    }

    private static java.lang.String getBaseHourCycle(@androidx.annotation.NonNull java.util.Locale r1) {
            java.lang.String r0 = "jm"
            java.lang.String r1 = android.text.format.DateFormat.getBestDateTimePattern(r1, r0)
            java.lang.String r0 = "H"
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L11
            java.lang.String r1 = "h23"
            return r1
        L11:
            java.lang.String r1 = "h12"
            return r1
    }

    @androidx.annotation.NonNull
    public static java.lang.String getCalendarType() {
            r0 = 1
            java.lang.String r0 = getCalendarType(r0)
            return r0
    }

    @androidx.annotation.NonNull
    public static java.lang.String getCalendarType(@androidx.annotation.NonNull java.util.Locale r1) {
            r0 = 1
            java.lang.String r1 = getCalendarType(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static java.lang.String getCalendarType(@androidx.annotation.NonNull java.util.Locale r3, boolean r4) {
            java.lang.String r0 = "ca"
            java.lang.String r1 = ""
            java.lang.String r0 = getUnicodeLocaleType(r0, r1, r3, r4)
            if (r0 == 0) goto Lb
            return r0
        Lb:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            if (r0 < r2) goto L16
            java.lang.String r3 = androidx.core.text.util.LocalePreferences.Api24Impl.getCalendarType(r3)
            return r3
        L16:
            if (r4 == 0) goto L1b
            java.lang.String r3 = "gregorian"
            return r3
        L1b:
            return r1
    }

    @androidx.annotation.NonNull
    public static java.lang.String getCalendarType(boolean r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lb
            java.util.Locale r0 = androidx.core.text.util.LocalePreferences.Api24Impl.getDefaultLocale()
            goto Lf
        Lb:
            java.util.Locale r0 = getDefaultLocale()
        Lf:
            java.lang.String r2 = getCalendarType(r0, r2)
            return r2
    }

    private static java.util.Locale getDefaultLocale() {
            java.util.Locale r0 = java.util.Locale.getDefault()
            return r0
    }

    @androidx.annotation.NonNull
    public static java.lang.String getFirstDayOfWeek() {
            r0 = 1
            java.lang.String r0 = getFirstDayOfWeek(r0)
            return r0
    }

    @androidx.annotation.NonNull
    public static java.lang.String getFirstDayOfWeek(@androidx.annotation.NonNull java.util.Locale r1) {
            r0 = 1
            java.lang.String r1 = getFirstDayOfWeek(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static java.lang.String getFirstDayOfWeek(@androidx.annotation.NonNull java.util.Locale r2, boolean r3) {
            java.lang.String r0 = "fw"
            java.lang.String r1 = ""
            java.lang.String r3 = getUnicodeLocaleType(r0, r1, r2, r3)
            if (r3 == 0) goto Lb
            return r3
        Lb:
            java.lang.String r2 = getBaseFirstDayOfWeek(r2)
            return r2
    }

    @androidx.annotation.NonNull
    public static java.lang.String getFirstDayOfWeek(boolean r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lb
            java.util.Locale r0 = androidx.core.text.util.LocalePreferences.Api24Impl.getDefaultLocale()
            goto Lf
        Lb:
            java.util.Locale r0 = getDefaultLocale()
        Lf:
            java.lang.String r2 = getFirstDayOfWeek(r0, r2)
            return r2
    }

    @androidx.annotation.NonNull
    public static java.lang.String getHourCycle() {
            r0 = 1
            java.lang.String r0 = getHourCycle(r0)
            return r0
    }

    @androidx.annotation.NonNull
    public static java.lang.String getHourCycle(@androidx.annotation.NonNull java.util.Locale r1) {
            r0 = 1
            java.lang.String r1 = getHourCycle(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static java.lang.String getHourCycle(@androidx.annotation.NonNull java.util.Locale r2, boolean r3) {
            java.lang.String r0 = "hc"
            java.lang.String r1 = ""
            java.lang.String r3 = getUnicodeLocaleType(r0, r1, r2, r3)
            if (r3 == 0) goto Lb
            return r3
        Lb:
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r3 < r0) goto L16
            java.lang.String r2 = androidx.core.text.util.LocalePreferences.Api33Impl.getHourCycle(r2)
            return r2
        L16:
            java.lang.String r2 = getBaseHourCycle(r2)
            return r2
    }

    @androidx.annotation.NonNull
    public static java.lang.String getHourCycle(boolean r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lb
            java.util.Locale r0 = androidx.core.text.util.LocalePreferences.Api24Impl.getDefaultLocale()
            goto Lf
        Lb:
            java.util.Locale r0 = getDefaultLocale()
        Lf:
            java.lang.String r2 = getHourCycle(r0, r2)
            return r2
    }

    private static java.lang.String getStringOfFirstDayOfWeek(int r7) {
            java.lang.String r5 = "fri"
            java.lang.String r6 = "sat"
            java.lang.String r0 = "sun"
            java.lang.String r1 = "mon"
            java.lang.String r2 = "tue"
            java.lang.String r3 = "wed"
            java.lang.String r4 = "thu"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6}
            r1 = 1
            if (r7 < r1) goto L1d
            r2 = 7
            if (r7 > r2) goto L1d
            int r7 = r7 - r1
            r7 = r0[r7]
            return r7
        L1d:
            java.lang.String r7 = ""
            return r7
    }

    private static java.lang.String getTemperatureHardCoded(java.util.Locale r1) {
            java.lang.String[] r0 = androidx.core.text.util.LocalePreferences.WEATHER_FAHRENHEIT_COUNTRIES
            java.lang.String r1 = r1.getCountry()
            int r1 = java.util.Arrays.binarySearch(r0, r1)
            if (r1 < 0) goto Lf
            java.lang.String r1 = "fahrenhe"
            return r1
        Lf:
            java.lang.String r1 = "celsius"
            return r1
    }

    @androidx.annotation.NonNull
    public static java.lang.String getTemperatureUnit() {
            r0 = 1
            java.lang.String r0 = getTemperatureUnit(r0)
            return r0
    }

    @androidx.annotation.NonNull
    public static java.lang.String getTemperatureUnit(@androidx.annotation.NonNull java.util.Locale r1) {
            r0 = 1
            java.lang.String r1 = getTemperatureUnit(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static java.lang.String getTemperatureUnit(@androidx.annotation.NonNull java.util.Locale r2, boolean r3) {
            java.lang.String r0 = "mu"
            java.lang.String r1 = ""
            java.lang.String r3 = getUnicodeLocaleType(r0, r1, r2, r3)
            if (r3 == 0) goto Lb
            return r3
        Lb:
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r3 < r0) goto L16
            java.lang.String r2 = androidx.core.text.util.LocalePreferences.Api33Impl.getResolvedTemperatureUnit(r2)
            return r2
        L16:
            java.lang.String r2 = getTemperatureHardCoded(r2)
            return r2
    }

    @androidx.annotation.NonNull
    public static java.lang.String getTemperatureUnit(boolean r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lb
            java.util.Locale r0 = androidx.core.text.util.LocalePreferences.Api24Impl.getDefaultLocale()
            goto Lf
        Lb:
            java.util.Locale r0 = getDefaultLocale()
        Lf:
            java.lang.String r2 = getTemperatureUnit(r0, r2)
            return r2
    }

    private static java.lang.String getUnicodeLocaleType(java.lang.String r0, java.lang.String r1, java.util.Locale r2, boolean r3) {
            java.lang.String r0 = r2.getUnicodeLocaleType(r0)
            if (r0 == 0) goto L7
            return r0
        L7:
            if (r3 != 0) goto La
            return r1
        La:
            r0 = 0
            return r0
    }
}
