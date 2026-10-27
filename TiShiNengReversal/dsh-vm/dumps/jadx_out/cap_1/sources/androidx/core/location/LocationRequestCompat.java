package androidx.core.location;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class LocationRequestCompat {
    private static final long IMPLICIT_MIN_UPDATE_INTERVAL = -1;
    public static final long PASSIVE_INTERVAL = Long.MAX_VALUE;
    public static final int QUALITY_BALANCED_POWER_ACCURACY = 102;
    public static final int QUALITY_HIGH_ACCURACY = 100;
    public static final int QUALITY_LOW_POWER = 104;
    final long mDurationMillis;
    final long mIntervalMillis;
    final long mMaxUpdateDelayMillis;
    final int mMaxUpdates;
    final float mMinUpdateDistanceMeters;
    final long mMinUpdateIntervalMillis;
    final int mQuality;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class Api19Impl {
        private static java.lang.reflect.Method sCreateFromDeprecatedProviderMethod;
        private static java.lang.Class<?> sLocationRequestClass;
        private static java.lang.reflect.Method sSetExpireInMethod;
        private static java.lang.reflect.Method sSetFastestIntervalMethod;
        private static java.lang.reflect.Method sSetNumUpdatesMethod;
        private static java.lang.reflect.Method sSetQualityMethod;

        private Api19Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @android.annotation.SuppressLint({"BanUncheckedReflection"})
        public static java.lang.Object toLocationRequest(androidx.core.location.LocationRequestCompat r11, java.lang.String r12) {
                r0 = 0
                java.lang.Class<?> r1 = androidx.core.location.LocationRequestCompat.Api19Impl.sLocationRequestClass     // Catch: java.lang.Throwable -> L10b
                if (r1 != 0) goto Ld
                java.lang.String r1 = "android.location.LocationRequest"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L10b
                androidx.core.location.LocationRequestCompat.Api19Impl.sLocationRequestClass = r1     // Catch: java.lang.Throwable -> L10b
            Ld:
                java.lang.reflect.Method r1 = androidx.core.location.LocationRequestCompat.Api19Impl.sCreateFromDeprecatedProviderMethod     // Catch: java.lang.Throwable -> L10b
                r2 = 3
                r3 = 2
                r4 = 4
                r5 = 0
                java.lang.Class r6 = java.lang.Long.TYPE
                r7 = 1
                if (r1 != 0) goto L35
                java.lang.Class<?> r1 = androidx.core.location.LocationRequestCompat.Api19Impl.sLocationRequestClass     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                java.lang.String r8 = "createFromDeprecatedProvider"
                java.lang.Class[] r9 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                java.lang.Class<java.lang.String> r10 = java.lang.String.class
                r9[r5] = r10     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                r9[r7] = r6     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                java.lang.Class r10 = java.lang.Float.TYPE     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                r9[r3] = r10     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                java.lang.Class r10 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                r9[r2] = r10     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                java.lang.reflect.Method r1 = r1.getDeclaredMethod(r8, r9)     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                androidx.core.location.LocationRequestCompat.Api19Impl.sCreateFromDeprecatedProviderMethod = r1     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                r1.setAccessible(r7)     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
            L35:
                java.lang.reflect.Method r1 = androidx.core.location.LocationRequestCompat.Api19Impl.sCreateFromDeprecatedProviderMethod     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                long r8 = r11.getIntervalMillis()     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                float r9 = r11.getMinUpdateDistanceMeters()     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                java.lang.Float r9 = java.lang.Float.valueOf(r9)     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                r4[r5] = r12     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                r4[r7] = r8     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                r4[r3] = r9     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                java.lang.Boolean r12 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                r4[r2] = r12     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                java.lang.Object r12 = r1.invoke(r0, r4)     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                if (r12 != 0) goto L5a
                return r0
            L5a:
                java.lang.reflect.Method r1 = androidx.core.location.LocationRequestCompat.Api19Impl.sSetQualityMethod     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                java.lang.Class r2 = java.lang.Integer.TYPE
                if (r1 != 0) goto L71
                java.lang.Class<?> r1 = androidx.core.location.LocationRequestCompat.Api19Impl.sLocationRequestClass     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                java.lang.String r3 = "setQuality"
                java.lang.Class[] r4 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                r4[r5] = r2     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                java.lang.reflect.Method r1 = r1.getDeclaredMethod(r3, r4)     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                androidx.core.location.LocationRequestCompat.Api19Impl.sSetQualityMethod = r1     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                r1.setAccessible(r7)     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
            L71:
                java.lang.reflect.Method r1 = androidx.core.location.LocationRequestCompat.Api19Impl.sSetQualityMethod     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                int r3 = r11.getQuality()     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                r4[r5] = r3     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                r1.invoke(r12, r4)     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                java.lang.reflect.Method r1 = androidx.core.location.LocationRequestCompat.Api19Impl.sSetFastestIntervalMethod     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                if (r1 != 0) goto L97
                java.lang.Class<?> r1 = androidx.core.location.LocationRequestCompat.Api19Impl.sLocationRequestClass     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                java.lang.String r3 = "setFastestInterval"
                java.lang.Class[] r4 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                r4[r5] = r6     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                java.lang.reflect.Method r1 = r1.getDeclaredMethod(r3, r4)     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                androidx.core.location.LocationRequestCompat.Api19Impl.sSetFastestIntervalMethod = r1     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                r1.setAccessible(r7)     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
            L97:
                java.lang.reflect.Method r1 = androidx.core.location.LocationRequestCompat.Api19Impl.sSetFastestIntervalMethod     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                long r3 = r11.getMinUpdateIntervalMillis()     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                r4[r5] = r3     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                r1.invoke(r12, r4)     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                int r1 = r11.getMaxUpdates()     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                r3 = 2147483647(0x7fffffff, float:NaN)
                if (r1 >= r3) goto Ld7
                java.lang.reflect.Method r1 = androidx.core.location.LocationRequestCompat.Api19Impl.sSetNumUpdatesMethod     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                if (r1 != 0) goto Lc6
                java.lang.Class<?> r1 = androidx.core.location.LocationRequestCompat.Api19Impl.sLocationRequestClass     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                java.lang.String r3 = "setNumUpdates"
                java.lang.Class[] r4 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                r4[r5] = r2     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                java.lang.reflect.Method r1 = r1.getDeclaredMethod(r3, r4)     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                androidx.core.location.LocationRequestCompat.Api19Impl.sSetNumUpdatesMethod = r1     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                r1.setAccessible(r7)     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
            Lc6:
                java.lang.reflect.Method r1 = androidx.core.location.LocationRequestCompat.Api19Impl.sSetNumUpdatesMethod     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                int r2 = r11.getMaxUpdates()     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                r3[r5] = r2     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                r1.invoke(r12, r3)     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
            Ld7:
                long r1 = r11.getDurationMillis()     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r8 >= 0) goto L10a
                java.lang.reflect.Method r1 = androidx.core.location.LocationRequestCompat.Api19Impl.sSetExpireInMethod     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                if (r1 != 0) goto Lf9
                java.lang.Class<?> r1 = androidx.core.location.LocationRequestCompat.Api19Impl.sLocationRequestClass     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                java.lang.String r2 = "setExpireIn"
                java.lang.Class[] r3 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                r3[r5] = r6     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                androidx.core.location.LocationRequestCompat.Api19Impl.sSetExpireInMethod = r1     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                r1.setAccessible(r7)     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
            Lf9:
                java.lang.reflect.Method r1 = androidx.core.location.LocationRequestCompat.Api19Impl.sSetExpireInMethod     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                long r2 = r11.getDurationMillis()     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                java.lang.Long r11 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                java.lang.Object[] r2 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                r2[r5] = r11     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
                r1.invoke(r12, r2)     // Catch: java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b java.lang.Throwable -> L10b
            L10a:
                return r12
            L10b:
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(31)
    private static class Api31Impl {
        private Api31Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.location.LocationRequest toLocationRequest(androidx.core.location.LocationRequestCompat r3) {
                android.location.LocationRequest$Builder r0 = new android.location.LocationRequest$Builder
                long r1 = r3.getIntervalMillis()
                r0.<init>(r1)
                int r1 = r3.getQuality()
                android.location.LocationRequest$Builder r0 = r0.setQuality(r1)
                long r1 = r3.getMinUpdateIntervalMillis()
                android.location.LocationRequest$Builder r0 = r0.setMinUpdateIntervalMillis(r1)
                long r1 = r3.getDurationMillis()
                android.location.LocationRequest$Builder r0 = r0.setDurationMillis(r1)
                int r1 = r3.getMaxUpdates()
                android.location.LocationRequest$Builder r0 = r0.setMaxUpdates(r1)
                float r1 = r3.getMinUpdateDistanceMeters()
                android.location.LocationRequest$Builder r0 = r0.setMinUpdateDistanceMeters(r1)
                long r1 = r3.getMaxUpdateDelayMillis()
                android.location.LocationRequest$Builder r3 = r0.setMaxUpdateDelayMillis(r1)
                android.location.LocationRequest r3 = r3.build()
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder {
        private long mDurationMillis;
        private long mIntervalMillis;
        private long mMaxUpdateDelayMillis;
        private int mMaxUpdates;
        private float mMinUpdateDistanceMeters;
        private long mMinUpdateIntervalMillis;
        private int mQuality;

        public Builder(long r1) {
                r0 = this;
                r0.<init>()
                r0.setIntervalMillis(r1)
                r1 = 102(0x66, float:1.43E-43)
                r0.mQuality = r1
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r0.mDurationMillis = r1
                r1 = 2147483647(0x7fffffff, float:NaN)
                r0.mMaxUpdates = r1
                r1 = -1
                r0.mMinUpdateIntervalMillis = r1
                r1 = 0
                r0.mMinUpdateDistanceMeters = r1
                r1 = 0
                r0.mMaxUpdateDelayMillis = r1
                return
        }

        public Builder(@androidx.annotation.NonNull androidx.core.location.LocationRequestCompat r3) {
                r2 = this;
                r2.<init>()
                long r0 = r3.mIntervalMillis
                r2.mIntervalMillis = r0
                int r0 = r3.mQuality
                r2.mQuality = r0
                long r0 = r3.mDurationMillis
                r2.mDurationMillis = r0
                int r0 = r3.mMaxUpdates
                r2.mMaxUpdates = r0
                long r0 = r3.mMinUpdateIntervalMillis
                r2.mMinUpdateIntervalMillis = r0
                float r0 = r3.mMinUpdateDistanceMeters
                r2.mMinUpdateDistanceMeters = r0
                long r0 = r3.mMaxUpdateDelayMillis
                r2.mMaxUpdateDelayMillis = r0
                return
        }

        @androidx.annotation.NonNull
        public androidx.core.location.LocationRequestCompat build() {
                r14 = this;
                long r0 = r14.mIntervalMillis
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L16
                long r0 = r14.mMinUpdateIntervalMillis
                r2 = -1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto L14
                goto L16
            L14:
                r0 = 0
                goto L17
            L16:
                r0 = 1
            L17:
                java.lang.String r1 = "passive location requests must have an explicit minimum update interval"
                androidx.core.util.Preconditions.checkState(r0, r1)
                androidx.core.location.LocationRequestCompat r2 = new androidx.core.location.LocationRequestCompat
                long r3 = r14.mIntervalMillis
                int r5 = r14.mQuality
                long r6 = r14.mDurationMillis
                int r8 = r14.mMaxUpdates
                long r0 = r14.mMinUpdateIntervalMillis
                long r9 = java.lang.Math.min(r0, r3)
                float r11 = r14.mMinUpdateDistanceMeters
                long r12 = r14.mMaxUpdateDelayMillis
                r2.<init>(r3, r5, r6, r8, r9, r11, r12)
                return r2
        }

        @androidx.annotation.NonNull
        public androidx.core.location.LocationRequestCompat.Builder clearMinUpdateIntervalMillis() {
                r2 = this;
                r0 = -1
                r2.mMinUpdateIntervalMillis = r0
                return r2
        }

        @androidx.annotation.NonNull
        public androidx.core.location.LocationRequestCompat.Builder setDurationMillis(@androidx.annotation.IntRange(from = 1) long r8) {
                r7 = this;
                r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                java.lang.String r6 = "durationMillis"
                r2 = 1
                r0 = r8
                long r8 = androidx.core.util.Preconditions.checkArgumentInRange(r0, r2, r4, r6)
                r7.mDurationMillis = r8
                return r7
        }

        @androidx.annotation.NonNull
        public androidx.core.location.LocationRequestCompat.Builder setIntervalMillis(@androidx.annotation.IntRange(from = 0) long r8) {
                r7 = this;
                r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                java.lang.String r6 = "intervalMillis"
                r2 = 0
                r0 = r8
                long r8 = androidx.core.util.Preconditions.checkArgumentInRange(r0, r2, r4, r6)
                r7.mIntervalMillis = r8
                return r7
        }

        @androidx.annotation.NonNull
        public androidx.core.location.LocationRequestCompat.Builder setMaxUpdateDelayMillis(@androidx.annotation.IntRange(from = 0) long r8) {
                r7 = this;
                r7.mMaxUpdateDelayMillis = r8
                r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                java.lang.String r6 = "maxUpdateDelayMillis"
                r2 = 0
                r0 = r8
                long r8 = androidx.core.util.Preconditions.checkArgumentInRange(r0, r2, r4, r6)
                r7.mMaxUpdateDelayMillis = r8
                return r7
        }

        @androidx.annotation.NonNull
        public androidx.core.location.LocationRequestCompat.Builder setMaxUpdates(@androidx.annotation.IntRange(from = 1, to = 2147483647L) int r4) {
                r3 = this;
                r0 = 2147483647(0x7fffffff, float:NaN)
                java.lang.String r1 = "maxUpdates"
                r2 = 1
                int r4 = androidx.core.util.Preconditions.checkArgumentInRange(r4, r2, r0, r1)
                r3.mMaxUpdates = r4
                return r3
        }

        @androidx.annotation.NonNull
        public androidx.core.location.LocationRequestCompat.Builder setMinUpdateDistanceMeters(@androidx.annotation.FloatRange(from = 0.0d, to = 3.4028234663852886E38d) float r4) {
                r3 = this;
                r3.mMinUpdateDistanceMeters = r4
                r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
                java.lang.String r1 = "minUpdateDistanceMeters"
                r2 = 0
                float r4 = androidx.core.util.Preconditions.checkArgumentInRange(r4, r2, r0, r1)
                r3.mMinUpdateDistanceMeters = r4
                return r3
        }

        @androidx.annotation.NonNull
        public androidx.core.location.LocationRequestCompat.Builder setMinUpdateIntervalMillis(@androidx.annotation.IntRange(from = 0) long r8) {
                r7 = this;
                r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                java.lang.String r6 = "minUpdateIntervalMillis"
                r2 = 0
                r0 = r8
                long r8 = androidx.core.util.Preconditions.checkArgumentInRange(r0, r2, r4, r6)
                r7.mMinUpdateIntervalMillis = r8
                return r7
        }

        @androidx.annotation.NonNull
        public androidx.core.location.LocationRequestCompat.Builder setQuality(int r5) {
                r4 = this;
                r0 = 104(0x68, float:1.46E-43)
                r1 = 1
                r2 = 0
                if (r5 == r0) goto L11
                r0 = 102(0x66, float:1.43E-43)
                if (r5 == r0) goto L11
                r0 = 100
                if (r5 != r0) goto Lf
                goto L11
            Lf:
                r0 = 0
                goto L12
            L11:
                r0 = 1
            L12:
                java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r2] = r3
                java.lang.String r2 = "quality must be a defined QUALITY constant, not %d"
                androidx.core.util.Preconditions.checkArgument(r0, r2, r1)
                r4.mQuality = r5
                return r4
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public @interface Quality {
    }

    LocationRequestCompat(long r1, int r3, long r4, int r6, long r7, float r9, long r10) {
            r0 = this;
            r0.<init>()
            r0.mIntervalMillis = r1
            r0.mQuality = r3
            r0.mMinUpdateIntervalMillis = r7
            r0.mDurationMillis = r4
            r0.mMaxUpdates = r6
            r0.mMinUpdateDistanceMeters = r9
            r0.mMaxUpdateDelayMillis = r10
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof androidx.core.location.LocationRequestCompat
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            androidx.core.location.LocationRequestCompat r8 = (androidx.core.location.LocationRequestCompat) r8
            int r1 = r7.mQuality
            int r3 = r8.mQuality
            if (r1 != r3) goto L43
            long r3 = r7.mIntervalMillis
            long r5 = r8.mIntervalMillis
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L43
            long r3 = r7.mMinUpdateIntervalMillis
            long r5 = r8.mMinUpdateIntervalMillis
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L43
            long r3 = r7.mDurationMillis
            long r5 = r8.mDurationMillis
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L43
            int r1 = r7.mMaxUpdates
            int r3 = r8.mMaxUpdates
            if (r1 != r3) goto L43
            float r1 = r8.mMinUpdateDistanceMeters
            float r3 = r7.mMinUpdateDistanceMeters
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 != 0) goto L43
            long r3 = r7.mMaxUpdateDelayMillis
            long r5 = r8.mMaxUpdateDelayMillis
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L43
            return r0
        L43:
            return r2
    }

    @androidx.annotation.IntRange(from = 1)
    public long getDurationMillis() {
            r2 = this;
            long r0 = r2.mDurationMillis
            return r0
    }

    @androidx.annotation.IntRange(from = 0)
    public long getIntervalMillis() {
            r2 = this;
            long r0 = r2.mIntervalMillis
            return r0
    }

    @androidx.annotation.IntRange(from = 0)
    public long getMaxUpdateDelayMillis() {
            r2 = this;
            long r0 = r2.mMaxUpdateDelayMillis
            return r0
    }

    @androidx.annotation.IntRange(from = 1, to = 2147483647L)
    public int getMaxUpdates() {
            r1 = this;
            int r0 = r1.mMaxUpdates
            return r0
    }

    @androidx.annotation.FloatRange(from = 0.0d, to = 3.4028234663852886E38d)
    public float getMinUpdateDistanceMeters() {
            r1 = this;
            float r0 = r1.mMinUpdateDistanceMeters
            return r0
    }

    @androidx.annotation.IntRange(from = 0)
    public long getMinUpdateIntervalMillis() {
            r5 = this;
            long r0 = r5.mMinUpdateIntervalMillis
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            long r0 = r5.mIntervalMillis
        La:
            return r0
    }

    public int getQuality() {
            r1 = this;
            int r0 = r1.mQuality
            return r0
    }

    public int hashCode() {
            r6 = this;
            int r0 = r6.mQuality
            int r0 = r0 * 31
            long r1 = r6.mIntervalMillis
            r3 = 32
            long r4 = r1 >>> r3
            long r1 = r1 ^ r4
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            long r1 = r6.mMinUpdateIntervalMillis
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(31)
    public android.location.LocationRequest toLocationRequest() {
            r1 = this;
            android.location.LocationRequest r0 = androidx.core.location.LocationRequestCompat.Api31Impl.toLocationRequest(r1)
            return r0
    }

    @androidx.annotation.Nullable
    @android.annotation.SuppressLint({"NewApi"})
    public android.location.LocationRequest toLocationRequest(@androidx.annotation.NonNull java.lang.String r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lb
            android.location.LocationRequest r3 = r2.toLocationRequest()
            return r3
        Lb:
            java.lang.Object r3 = androidx.core.location.LocationRequestCompat.Api19Impl.toLocationRequest(r2, r3)
            android.location.LocationRequest r3 = androidx.core.location.n0.a(r3)
            return r3
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Request["
            r0.append(r1)
            long r1 = r6.mIntervalMillis
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L40
            java.lang.String r1 = "@"
            r0.append(r1)
            long r1 = r6.mIntervalMillis
            androidx.core.util.TimeUtils.formatDuration(r1, r0)
            int r1 = r6.mQuality
            r2 = 100
            if (r1 == r2) goto L3a
            r2 = 102(0x66, float:1.43E-43)
            if (r1 == r2) goto L34
            r2 = 104(0x68, float:1.46E-43)
            if (r1 == r2) goto L2e
            goto L45
        L2e:
            java.lang.String r1 = " LOW_POWER"
            r0.append(r1)
            goto L45
        L34:
            java.lang.String r1 = " BALANCED"
            r0.append(r1)
            goto L45
        L3a:
            java.lang.String r1 = " HIGH_ACCURACY"
            r0.append(r1)
            goto L45
        L40:
            java.lang.String r1 = "PASSIVE"
            r0.append(r1)
        L45:
            long r1 = r6.mDurationMillis
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L55
            java.lang.String r1 = ", duration="
            r0.append(r1)
            long r1 = r6.mDurationMillis
            androidx.core.util.TimeUtils.formatDuration(r1, r0)
        L55:
            int r1 = r6.mMaxUpdates
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r2) goto L66
            java.lang.String r1 = ", maxUpdates="
            r0.append(r1)
            int r1 = r6.mMaxUpdates
            r0.append(r1)
        L66:
            long r1 = r6.mMinUpdateIntervalMillis
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L7e
            long r3 = r6.mIntervalMillis
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L7e
            java.lang.String r1 = ", minUpdateInterval="
            r0.append(r1)
            long r1 = r6.mMinUpdateIntervalMillis
            androidx.core.util.TimeUtils.formatDuration(r1, r0)
        L7e:
            float r1 = r6.mMinUpdateDistanceMeters
            double r1 = (double) r1
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L91
            java.lang.String r1 = ", minUpdateDistance="
            r0.append(r1)
            float r1 = r6.mMinUpdateDistanceMeters
            r0.append(r1)
        L91:
            long r1 = r6.mMaxUpdateDelayMillis
            r3 = 2
            long r1 = r1 / r3
            long r3 = r6.mIntervalMillis
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto La6
            java.lang.String r1 = ", maxUpdateDelay="
            r0.append(r1)
            long r1 = r6.mMaxUpdateDelayMillis
            androidx.core.util.TimeUtils.formatDuration(r1, r0)
        La6:
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
