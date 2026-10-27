package androidx.core.location;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class LocationCompat {
    public static final java.lang.String EXTRA_BEARING_ACCURACY = "bearingAccuracy";
    public static final java.lang.String EXTRA_IS_MOCK = "mockLocation";
    public static final java.lang.String EXTRA_MSL_ALTITUDE = "androidx.core.location.extra.MSL_ALTITUDE";
    public static final java.lang.String EXTRA_MSL_ALTITUDE_ACCURACY = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY";
    public static final java.lang.String EXTRA_SPEED_ACCURACY = "speedAccuracy";
    public static final java.lang.String EXTRA_VERTICAL_ACCURACY = "verticalAccuracy";

    @androidx.annotation.Nullable
    private static java.lang.reflect.Field sFieldsMaskField;

    @androidx.annotation.Nullable
    private static java.lang.Integer sHasBearingAccuracyMask;

    @androidx.annotation.Nullable
    private static java.lang.Integer sHasSpeedAccuracyMask;

    @androidx.annotation.Nullable
    private static java.lang.Integer sHasVerticalAccuracyMask;

    @androidx.annotation.Nullable
    private static java.lang.reflect.Method sSetIsFromMockProviderMethod;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(26)
    private static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static float getBearingAccuracyDegrees(android.location.Location r0) {
                float r0 = r0.getBearingAccuracyDegrees()
                return r0
        }

        @androidx.annotation.DoNotInline
        static float getSpeedAccuracyMetersPerSecond(android.location.Location r0) {
                float r0 = r0.getSpeedAccuracyMetersPerSecond()
                return r0
        }

        @androidx.annotation.DoNotInline
        static float getVerticalAccuracyMeters(android.location.Location r0) {
                float r0 = r0.getVerticalAccuracyMeters()
                return r0
        }

        @androidx.annotation.DoNotInline
        static boolean hasBearingAccuracy(android.location.Location r0) {
                boolean r0 = r0.hasBearingAccuracy()
                return r0
        }

        @androidx.annotation.DoNotInline
        static boolean hasSpeedAccuracy(android.location.Location r0) {
                boolean r0 = r0.hasSpeedAccuracy()
                return r0
        }

        @androidx.annotation.DoNotInline
        static boolean hasVerticalAccuracy(android.location.Location r0) {
                boolean r0 = r0.hasVerticalAccuracy()
                return r0
        }

        @androidx.annotation.DoNotInline
        static void removeBearingAccuracy(android.location.Location r2) {
                java.lang.reflect.Field r0 = androidx.core.location.LocationCompat.getFieldsMaskField()     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L21
                byte r0 = r0.getByte(r2)     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L21
                int r1 = androidx.core.location.LocationCompat.getHasBearingAccuracyMask()     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L21
                int r1 = ~r1     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L21
                r0 = r0 & r1
                byte r0 = (byte) r0     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L21
                java.lang.reflect.Field r1 = androidx.core.location.LocationCompat.getFieldsMaskField()     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L21
                r1.setByte(r2, r0)     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L21
                return
            L17:
                r2 = move-exception
                java.lang.IllegalAccessError r0 = new java.lang.IllegalAccessError
                r0.<init>()
                r0.initCause(r2)
                throw r0
            L21:
                r2 = move-exception
                java.lang.NoSuchFieldError r0 = new java.lang.NoSuchFieldError
                r0.<init>()
                r0.initCause(r2)
                throw r0
        }

        @androidx.annotation.DoNotInline
        static void removeSpeedAccuracy(android.location.Location r2) {
                java.lang.reflect.Field r0 = androidx.core.location.LocationCompat.getFieldsMaskField()     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L21
                byte r0 = r0.getByte(r2)     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L21
                int r1 = androidx.core.location.LocationCompat.getHasSpeedAccuracyMask()     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L21
                int r1 = ~r1     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L21
                r0 = r0 & r1
                byte r0 = (byte) r0     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L21
                java.lang.reflect.Field r1 = androidx.core.location.LocationCompat.getFieldsMaskField()     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L21
                r1.setByte(r2, r0)     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L21
                return
            L17:
                r2 = move-exception
                java.lang.IllegalAccessError r0 = new java.lang.IllegalAccessError
                r0.<init>()
                r0.initCause(r2)
                throw r0
            L21:
                r2 = move-exception
                java.lang.NoSuchFieldError r0 = new java.lang.NoSuchFieldError
                r0.<init>()
                r0.initCause(r2)
                throw r0
        }

        @androidx.annotation.DoNotInline
        static void removeVerticalAccuracy(android.location.Location r2) {
                java.lang.reflect.Field r0 = androidx.core.location.LocationCompat.getFieldsMaskField()     // Catch: java.lang.Throwable -> L17
                byte r0 = r0.getByte(r2)     // Catch: java.lang.Throwable -> L17
                int r1 = androidx.core.location.LocationCompat.getHasVerticalAccuracyMask()     // Catch: java.lang.Throwable -> L17
                int r1 = ~r1     // Catch: java.lang.Throwable -> L17
                r0 = r0 & r1
                byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L17
                java.lang.reflect.Field r1 = androidx.core.location.LocationCompat.getFieldsMaskField()     // Catch: java.lang.Throwable -> L17
                r1.setByte(r2, r0)     // Catch: java.lang.Throwable -> L17
                return
            L17:
                r2 = move-exception
                java.lang.IllegalAccessError r0 = new java.lang.IllegalAccessError
                r0.<init>()
                r0.initCause(r2)
                throw r0
        }

        @androidx.annotation.DoNotInline
        static void setBearingAccuracyDegrees(android.location.Location r0, float r1) {
                r0.setBearingAccuracyDegrees(r1)
                return
        }

        @androidx.annotation.DoNotInline
        static void setSpeedAccuracyMetersPerSecond(android.location.Location r0, float r1) {
                r0.setSpeedAccuracyMetersPerSecond(r1)
                return
        }

        @androidx.annotation.DoNotInline
        static void setVerticalAccuracyMeters(android.location.Location r0, float r1) {
                r0.setVerticalAccuracyMeters(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(28)
    private static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static void removeBearingAccuracy(android.location.Location r24) {
                r0 = r24
                boolean r1 = r0.hasBearingAccuracy()
                if (r1 != 0) goto La
                goto L95
            La:
                java.lang.String r1 = r0.getProvider()
                long r2 = r0.getTime()
                long r4 = r0.getElapsedRealtimeNanos()
                double r6 = r0.getLatitude()
                double r8 = r0.getLongitude()
                boolean r10 = r0.hasAltitude()
                double r11 = r0.getAltitude()
                boolean r13 = r0.hasSpeed()
                float r14 = r0.getSpeed()
                boolean r15 = r0.hasBearing()
                r16 = r10
                float r10 = r0.getBearing()
                boolean r17 = r0.hasAccuracy()
                r18 = r13
                float r13 = r0.getAccuracy()
                boolean r19 = r0.hasVerticalAccuracy()
                r20 = r15
                float r15 = r0.getVerticalAccuracyMeters()
                boolean r21 = r0.hasSpeedAccuracy()
                r22 = r15
                float r15 = r0.getSpeedAccuracyMetersPerSecond()
                r23 = r15
                android.os.Bundle r15 = r0.getExtras()
                r0.reset()
                r0.setProvider(r1)
                r0.setTime(r2)
                r0.setElapsedRealtimeNanos(r4)
                r0.setLatitude(r6)
                r0.setLongitude(r8)
                if (r16 == 0) goto L73
                r0.setAltitude(r11)
            L73:
                if (r18 == 0) goto L78
                r0.setSpeed(r14)
            L78:
                if (r20 == 0) goto L7d
                r0.setBearing(r10)
            L7d:
                if (r17 == 0) goto L82
                r0.setAccuracy(r13)
            L82:
                if (r19 == 0) goto L89
                r1 = r22
                r0.setVerticalAccuracyMeters(r1)
            L89:
                if (r21 == 0) goto L90
                r1 = r23
                r0.setBearingAccuracyDegrees(r1)
            L90:
                if (r15 == 0) goto L95
                r0.setExtras(r15)
            L95:
                return
        }

        @androidx.annotation.DoNotInline
        static void removeSpeedAccuracy(android.location.Location r24) {
                r0 = r24
                boolean r1 = r0.hasSpeedAccuracy()
                if (r1 != 0) goto La
                goto L95
            La:
                java.lang.String r1 = r0.getProvider()
                long r2 = r0.getTime()
                long r4 = r0.getElapsedRealtimeNanos()
                double r6 = r0.getLatitude()
                double r8 = r0.getLongitude()
                boolean r10 = r0.hasAltitude()
                double r11 = r0.getAltitude()
                boolean r13 = r0.hasSpeed()
                float r14 = r0.getSpeed()
                boolean r15 = r0.hasBearing()
                r16 = r10
                float r10 = r0.getBearing()
                boolean r17 = r0.hasAccuracy()
                r18 = r13
                float r13 = r0.getAccuracy()
                boolean r19 = r0.hasVerticalAccuracy()
                r20 = r15
                float r15 = r0.getVerticalAccuracyMeters()
                boolean r21 = r0.hasBearingAccuracy()
                r22 = r15
                float r15 = r0.getBearingAccuracyDegrees()
                r23 = r15
                android.os.Bundle r15 = r0.getExtras()
                r0.reset()
                r0.setProvider(r1)
                r0.setTime(r2)
                r0.setElapsedRealtimeNanos(r4)
                r0.setLatitude(r6)
                r0.setLongitude(r8)
                if (r16 == 0) goto L73
                r0.setAltitude(r11)
            L73:
                if (r18 == 0) goto L78
                r0.setSpeed(r14)
            L78:
                if (r20 == 0) goto L7d
                r0.setBearing(r10)
            L7d:
                if (r17 == 0) goto L82
                r0.setAccuracy(r13)
            L82:
                if (r19 == 0) goto L89
                r1 = r22
                r0.setVerticalAccuracyMeters(r1)
            L89:
                if (r21 == 0) goto L90
                r1 = r23
                r0.setBearingAccuracyDegrees(r1)
            L90:
                if (r15 == 0) goto L95
                r0.setExtras(r15)
            L95:
                return
        }

        @androidx.annotation.DoNotInline
        static void removeVerticalAccuracy(android.location.Location r24) {
                r0 = r24
                boolean r1 = r0.hasVerticalAccuracy()
                if (r1 != 0) goto La
                goto L95
            La:
                java.lang.String r1 = r0.getProvider()
                long r2 = r0.getTime()
                long r4 = r0.getElapsedRealtimeNanos()
                double r6 = r0.getLatitude()
                double r8 = r0.getLongitude()
                boolean r10 = r0.hasAltitude()
                double r11 = r0.getAltitude()
                boolean r13 = r0.hasSpeed()
                float r14 = r0.getSpeed()
                boolean r15 = r0.hasBearing()
                r16 = r10
                float r10 = r0.getBearing()
                boolean r17 = r0.hasAccuracy()
                r18 = r13
                float r13 = r0.getAccuracy()
                boolean r19 = r0.hasSpeedAccuracy()
                r20 = r15
                float r15 = r0.getSpeedAccuracyMetersPerSecond()
                boolean r21 = r0.hasBearingAccuracy()
                r22 = r15
                float r15 = r0.getBearingAccuracyDegrees()
                r23 = r15
                android.os.Bundle r15 = r0.getExtras()
                r0.reset()
                r0.setProvider(r1)
                r0.setTime(r2)
                r0.setElapsedRealtimeNanos(r4)
                r0.setLatitude(r6)
                r0.setLongitude(r8)
                if (r16 == 0) goto L73
                r0.setAltitude(r11)
            L73:
                if (r18 == 0) goto L78
                r0.setSpeed(r14)
            L78:
                if (r20 == 0) goto L7d
                r0.setBearing(r10)
            L7d:
                if (r17 == 0) goto L82
                r0.setAccuracy(r13)
            L82:
                if (r19 == 0) goto L89
                r1 = r22
                r0.setSpeedAccuracyMetersPerSecond(r1)
            L89:
                if (r21 == 0) goto L90
                r1 = r23
                r0.setBearingAccuracyDegrees(r1)
            L90:
                if (r15 == 0) goto L95
                r0.setExtras(r15)
            L95:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(29)
    private static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static void removeBearingAccuracy(android.location.Location r2) {
                boolean r0 = r2.hasBearingAccuracy()
                if (r0 != 0) goto L7
                return
            L7:
                double r0 = r2.getElapsedRealtimeUncertaintyNanos()
                androidx.core.location.LocationCompat.Api28Impl.removeBearingAccuracy(r2)
                r2.setElapsedRealtimeUncertaintyNanos(r0)
                return
        }

        @androidx.annotation.DoNotInline
        static void removeSpeedAccuracy(android.location.Location r2) {
                boolean r0 = r2.hasSpeedAccuracy()
                if (r0 != 0) goto L7
                return
            L7:
                double r0 = r2.getElapsedRealtimeUncertaintyNanos()
                androidx.core.location.LocationCompat.Api28Impl.removeSpeedAccuracy(r2)
                r2.setElapsedRealtimeUncertaintyNanos(r0)
                return
        }

        @androidx.annotation.DoNotInline
        static void removeVerticalAccuracy(android.location.Location r2) {
                boolean r0 = r2.hasVerticalAccuracy()
                if (r0 != 0) goto L7
                return
            L7:
                double r0 = r2.getElapsedRealtimeUncertaintyNanos()
                androidx.core.location.LocationCompat.Api28Impl.removeVerticalAccuracy(r2)
                r2.setElapsedRealtimeUncertaintyNanos(r0)
                return
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
        static void removeBearingAccuracy(android.location.Location r0) {
                r0.removeBearingAccuracy()
                return
        }

        @androidx.annotation.DoNotInline
        static void removeSpeedAccuracy(android.location.Location r0) {
                r0.removeSpeedAccuracy()
                return
        }

        @androidx.annotation.DoNotInline
        static void removeVerticalAccuracy(android.location.Location r0) {
                r0.removeVerticalAccuracy()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(34)
    private static class Api34Impl {
        private Api34Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static float getMslAltitudeAccuracyMeters(android.location.Location r0) {
                float r0 = r0.getMslAltitudeAccuracyMeters()
                return r0
        }

        @androidx.annotation.DoNotInline
        static double getMslAltitudeMeters(android.location.Location r2) {
                double r0 = r2.getMslAltitudeMeters()
                return r0
        }

        @androidx.annotation.DoNotInline
        static boolean hasMslAltitude(android.location.Location r0) {
                boolean r0 = r0.hasMslAltitude()
                return r0
        }

        @androidx.annotation.DoNotInline
        static boolean hasMslAltitudeAccuracy(android.location.Location r0) {
                boolean r0 = r0.hasMslAltitudeAccuracy()
                return r0
        }

        @androidx.annotation.DoNotInline
        static void removeMslAltitude(android.location.Location r0) {
                r0.removeMslAltitude()
                return
        }

        @androidx.annotation.DoNotInline
        static void removeMslAltitudeAccuracy(android.location.Location r0) {
                r0.removeMslAltitudeAccuracy()
                return
        }

        @androidx.annotation.DoNotInline
        static void setMslAltitudeAccuracyMeters(android.location.Location r0, float r1) {
                r0.setMslAltitudeAccuracyMeters(r1)
                return
        }

        @androidx.annotation.DoNotInline
        static void setMslAltitudeMeters(android.location.Location r0, double r1) {
                r0.setMslAltitudeMeters(r1)
                return
        }
    }

    private LocationCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean containsExtra(@androidx.annotation.NonNull android.location.Location r0, java.lang.String r1) {
            android.os.Bundle r0 = r0.getExtras()
            if (r0 == 0) goto Le
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public static float getBearingAccuracyDegrees(@androidx.annotation.NonNull android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            float r2 = androidx.core.location.LocationCompat.Api26Impl.getBearingAccuracyDegrees(r2)
            return r2
        Lb:
            android.os.Bundle r2 = r2.getExtras()
            r0 = 0
            if (r2 != 0) goto L13
            return r0
        L13:
            java.lang.String r1 = "bearingAccuracy"
            float r2 = r2.getFloat(r1, r0)
            return r2
    }

    public static long getElapsedRealtimeMillis(@androidx.annotation.NonNull android.location.Location r3) {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r1 = r3.getElapsedRealtimeNanos()
            long r0 = r0.toMillis(r1)
            return r0
    }

    public static long getElapsedRealtimeNanos(@androidx.annotation.NonNull android.location.Location r2) {
            long r0 = r2.getElapsedRealtimeNanos()
            return r0
    }

    @android.annotation.SuppressLint({"BlockedPrivateApi"})
    static java.lang.reflect.Field getFieldsMaskField() throws java.lang.NoSuchFieldException {
            java.lang.reflect.Field r0 = androidx.core.location.LocationCompat.sFieldsMaskField
            if (r0 != 0) goto L12
            java.lang.Class<android.location.Location> r0 = android.location.Location.class
            java.lang.String r1 = "mFieldsMask"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
            androidx.core.location.LocationCompat.sFieldsMaskField = r0
            r1 = 1
            r0.setAccessible(r1)
        L12:
            java.lang.reflect.Field r0 = androidx.core.location.LocationCompat.sFieldsMaskField
            return r0
    }

    @android.annotation.SuppressLint({"SoonBlockedPrivateApi"})
    static int getHasBearingAccuracyMask() throws java.lang.NoSuchFieldException, java.lang.IllegalAccessException {
            java.lang.Integer r0 = androidx.core.location.LocationCompat.sHasBearingAccuracyMask
            if (r0 != 0) goto L1b
            java.lang.Class<android.location.Location> r0 = android.location.Location.class
            java.lang.String r1 = "HAS_BEARING_ACCURACY_MASK"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
            r1 = 1
            r0.setAccessible(r1)
            r1 = 0
            int r0 = r0.getInt(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            androidx.core.location.LocationCompat.sHasBearingAccuracyMask = r0
        L1b:
            java.lang.Integer r0 = androidx.core.location.LocationCompat.sHasBearingAccuracyMask
            int r0 = r0.intValue()
            return r0
    }

    @android.annotation.SuppressLint({"SoonBlockedPrivateApi"})
    static int getHasSpeedAccuracyMask() throws java.lang.NoSuchFieldException, java.lang.IllegalAccessException {
            java.lang.Integer r0 = androidx.core.location.LocationCompat.sHasSpeedAccuracyMask
            if (r0 != 0) goto L1b
            java.lang.Class<android.location.Location> r0 = android.location.Location.class
            java.lang.String r1 = "HAS_SPEED_ACCURACY_MASK"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
            r1 = 1
            r0.setAccessible(r1)
            r1 = 0
            int r0 = r0.getInt(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            androidx.core.location.LocationCompat.sHasSpeedAccuracyMask = r0
        L1b:
            java.lang.Integer r0 = androidx.core.location.LocationCompat.sHasSpeedAccuracyMask
            int r0 = r0.intValue()
            return r0
    }

    @android.annotation.SuppressLint({"SoonBlockedPrivateApi"})
    static int getHasVerticalAccuracyMask() throws java.lang.NoSuchFieldException, java.lang.IllegalAccessException {
            java.lang.Integer r0 = androidx.core.location.LocationCompat.sHasVerticalAccuracyMask
            if (r0 != 0) goto L1b
            java.lang.Class<android.location.Location> r0 = android.location.Location.class
            java.lang.String r1 = "HAS_VERTICAL_ACCURACY_MASK"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
            r1 = 1
            r0.setAccessible(r1)
            r1 = 0
            int r0 = r0.getInt(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            androidx.core.location.LocationCompat.sHasVerticalAccuracyMask = r0
        L1b:
            java.lang.Integer r0 = androidx.core.location.LocationCompat.sHasVerticalAccuracyMask
            int r0 = r0.intValue()
            return r0
    }

    @androidx.annotation.FloatRange(from = 0.0d)
    public static float getMslAltitudeAccuracyMeters(@androidx.annotation.NonNull android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            float r2 = androidx.core.location.LocationCompat.Api34Impl.getMslAltitudeAccuracyMeters(r2)
            return r2
        Lb:
            android.os.Bundle r2 = getOrCreateExtras(r2)
            java.lang.String r0 = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY"
            float r2 = r2.getFloat(r0)
            return r2
    }

    public static double getMslAltitudeMeters(@androidx.annotation.NonNull android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            double r0 = androidx.core.location.LocationCompat.Api34Impl.getMslAltitudeMeters(r2)
            return r0
        Lb:
            android.os.Bundle r2 = getOrCreateExtras(r2)
            java.lang.String r0 = "androidx.core.location.extra.MSL_ALTITUDE"
            double r0 = r2.getDouble(r0)
            return r0
    }

    private static android.os.Bundle getOrCreateExtras(@androidx.annotation.NonNull android.location.Location r1) {
            android.os.Bundle r0 = r1.getExtras()
            if (r0 != 0) goto L13
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.setExtras(r0)
            android.os.Bundle r1 = r1.getExtras()
            return r1
        L13:
            return r0
    }

    private static java.lang.reflect.Method getSetIsFromMockProviderMethod() throws java.lang.NoSuchMethodException {
            java.lang.reflect.Method r0 = androidx.core.location.LocationCompat.sSetIsFromMockProviderMethod
            if (r0 != 0) goto L19
            r0 = 1
            java.lang.Class[] r1 = new java.lang.Class[r0]
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r3 = 0
            r1[r3] = r2
            java.lang.Class<android.location.Location> r2 = android.location.Location.class
            java.lang.String r3 = "setIsFromMockProvider"
            java.lang.reflect.Method r1 = r2.getDeclaredMethod(r3, r1)
            androidx.core.location.LocationCompat.sSetIsFromMockProviderMethod = r1
            r1.setAccessible(r0)
        L19:
            java.lang.reflect.Method r0 = androidx.core.location.LocationCompat.sSetIsFromMockProviderMethod
            return r0
    }

    public static float getSpeedAccuracyMetersPerSecond(@androidx.annotation.NonNull android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            float r2 = androidx.core.location.LocationCompat.Api26Impl.getSpeedAccuracyMetersPerSecond(r2)
            return r2
        Lb:
            android.os.Bundle r2 = r2.getExtras()
            r0 = 0
            if (r2 != 0) goto L13
            return r0
        L13:
            java.lang.String r1 = "speedAccuracy"
            float r2 = r2.getFloat(r1, r0)
            return r2
    }

    public static float getVerticalAccuracyMeters(@androidx.annotation.NonNull android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            float r2 = androidx.core.location.LocationCompat.Api26Impl.getVerticalAccuracyMeters(r2)
            return r2
        Lb:
            android.os.Bundle r2 = r2.getExtras()
            r0 = 0
            if (r2 != 0) goto L13
            return r0
        L13:
            java.lang.String r1 = "verticalAccuracy"
            float r2 = r2.getFloat(r1, r0)
            return r2
    }

    public static boolean hasBearingAccuracy(@androidx.annotation.NonNull android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.location.LocationCompat.Api26Impl.hasBearingAccuracy(r2)
            return r2
        Lb:
            java.lang.String r0 = "bearingAccuracy"
            boolean r2 = containsExtra(r2, r0)
            return r2
    }

    public static boolean hasMslAltitude(@androidx.annotation.NonNull android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.location.LocationCompat.Api34Impl.hasMslAltitude(r2)
            return r2
        Lb:
            java.lang.String r0 = "androidx.core.location.extra.MSL_ALTITUDE"
            boolean r2 = containsExtra(r2, r0)
            return r2
    }

    public static boolean hasMslAltitudeAccuracy(@androidx.annotation.NonNull android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.location.LocationCompat.Api34Impl.hasMslAltitudeAccuracy(r2)
            return r2
        Lb:
            java.lang.String r0 = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY"
            boolean r2 = containsExtra(r2, r0)
            return r2
    }

    public static boolean hasSpeedAccuracy(@androidx.annotation.NonNull android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.location.LocationCompat.Api26Impl.hasSpeedAccuracy(r2)
            return r2
        Lb:
            java.lang.String r0 = "speedAccuracy"
            boolean r2 = containsExtra(r2, r0)
            return r2
    }

    public static boolean hasVerticalAccuracy(@androidx.annotation.NonNull android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.location.LocationCompat.Api26Impl.hasVerticalAccuracy(r2)
            return r2
        Lb:
            java.lang.String r0 = "verticalAccuracy"
            boolean r2 = containsExtra(r2, r0)
            return r2
    }

    public static boolean isMock(@androidx.annotation.NonNull android.location.Location r0) {
            boolean r0 = r0.isFromMockProvider()
            return r0
    }

    public static void removeBearingAccuracy(@androidx.annotation.NonNull android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto La
            androidx.core.location.LocationCompat.Api33Impl.removeBearingAccuracy(r2)
            return
        La:
            r1 = 29
            if (r0 < r1) goto L12
            androidx.core.location.LocationCompat.Api29Impl.removeBearingAccuracy(r2)
            return
        L12:
            r1 = 28
            if (r0 < r1) goto L1a
            androidx.core.location.LocationCompat.Api28Impl.removeBearingAccuracy(r2)
            return
        L1a:
            r1 = 26
            if (r0 < r1) goto L22
            androidx.core.location.LocationCompat.Api26Impl.removeBearingAccuracy(r2)
            return
        L22:
            java.lang.String r0 = "bearingAccuracy"
            removeExtra(r2, r0)
            return
    }

    private static void removeExtra(@androidx.annotation.NonNull android.location.Location r1, java.lang.String r2) {
            android.os.Bundle r0 = r1.getExtras()
            if (r0 == 0) goto L13
            r0.remove(r2)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L13
            r2 = 0
            r1.setExtras(r2)
        L13:
            return
    }

    public static void removeMslAltitude(@androidx.annotation.NonNull android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto La
            androidx.core.location.LocationCompat.Api34Impl.removeMslAltitude(r2)
            return
        La:
            java.lang.String r0 = "androidx.core.location.extra.MSL_ALTITUDE"
            removeExtra(r2, r0)
            return
    }

    public static void removeMslAltitudeAccuracy(@androidx.annotation.NonNull android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto La
            androidx.core.location.LocationCompat.Api34Impl.removeMslAltitudeAccuracy(r2)
            return
        La:
            java.lang.String r0 = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY"
            removeExtra(r2, r0)
            return
    }

    public static void removeSpeedAccuracy(@androidx.annotation.NonNull android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto La
            androidx.core.location.LocationCompat.Api33Impl.removeSpeedAccuracy(r2)
            return
        La:
            r1 = 29
            if (r0 < r1) goto L12
            androidx.core.location.LocationCompat.Api29Impl.removeSpeedAccuracy(r2)
            return
        L12:
            r1 = 28
            if (r0 < r1) goto L1a
            androidx.core.location.LocationCompat.Api28Impl.removeSpeedAccuracy(r2)
            return
        L1a:
            r1 = 26
            if (r0 < r1) goto L22
            androidx.core.location.LocationCompat.Api26Impl.removeSpeedAccuracy(r2)
            return
        L22:
            java.lang.String r0 = "speedAccuracy"
            removeExtra(r2, r0)
            return
    }

    public static void removeVerticalAccuracy(@androidx.annotation.NonNull android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto La
            androidx.core.location.LocationCompat.Api33Impl.removeVerticalAccuracy(r2)
            return
        La:
            r1 = 29
            if (r0 < r1) goto L12
            androidx.core.location.LocationCompat.Api29Impl.removeVerticalAccuracy(r2)
            return
        L12:
            r1 = 28
            if (r0 < r1) goto L1a
            androidx.core.location.LocationCompat.Api28Impl.removeVerticalAccuracy(r2)
            return
        L1a:
            r1 = 26
            if (r0 < r1) goto L22
            androidx.core.location.LocationCompat.Api26Impl.removeVerticalAccuracy(r2)
            return
        L22:
            java.lang.String r0 = "verticalAccuracy"
            removeExtra(r2, r0)
            return
    }

    public static void setBearingAccuracyDegrees(@androidx.annotation.NonNull android.location.Location r2, float r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto La
            androidx.core.location.LocationCompat.Api26Impl.setBearingAccuracyDegrees(r2, r3)
            return
        La:
            android.os.Bundle r2 = getOrCreateExtras(r2)
            java.lang.String r0 = "bearingAccuracy"
            r2.putFloat(r0, r3)
            return
    }

    @android.annotation.SuppressLint({"BanUncheckedReflection"})
    public static void setMock(@androidx.annotation.NonNull android.location.Location r3, boolean r4) {
            java.lang.reflect.Method r0 = getSetIsFromMockProviderMethod()     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.IllegalAccessException -> L19 java.lang.NoSuchMethodException -> L23
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.IllegalAccessException -> L19 java.lang.NoSuchMethodException -> L23
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.IllegalAccessException -> L19 java.lang.NoSuchMethodException -> L23
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.IllegalAccessException -> L19 java.lang.NoSuchMethodException -> L23
            r0.invoke(r3, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.IllegalAccessException -> L19 java.lang.NoSuchMethodException -> L23
            return
        L12:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r3)
            throw r4
        L19:
            r3 = move-exception
            java.lang.IllegalAccessError r4 = new java.lang.IllegalAccessError
            r4.<init>()
            r4.initCause(r3)
            throw r4
        L23:
            r3 = move-exception
            java.lang.NoSuchMethodError r4 = new java.lang.NoSuchMethodError
            r4.<init>()
            r4.initCause(r3)
            throw r4
    }

    public static void setMslAltitudeAccuracyMeters(@androidx.annotation.NonNull android.location.Location r2, @androidx.annotation.FloatRange(from = 0.0d) float r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto La
            androidx.core.location.LocationCompat.Api34Impl.setMslAltitudeAccuracyMeters(r2, r3)
            return
        La:
            android.os.Bundle r2 = getOrCreateExtras(r2)
            java.lang.String r0 = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY"
            r2.putFloat(r0, r3)
            return
    }

    public static void setMslAltitudeMeters(@androidx.annotation.NonNull android.location.Location r2, double r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto La
            androidx.core.location.LocationCompat.Api34Impl.setMslAltitudeMeters(r2, r3)
            return
        La:
            android.os.Bundle r2 = getOrCreateExtras(r2)
            java.lang.String r0 = "androidx.core.location.extra.MSL_ALTITUDE"
            r2.putDouble(r0, r3)
            return
    }

    public static void setSpeedAccuracyMetersPerSecond(@androidx.annotation.NonNull android.location.Location r2, float r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto La
            androidx.core.location.LocationCompat.Api26Impl.setSpeedAccuracyMetersPerSecond(r2, r3)
            return
        La:
            android.os.Bundle r2 = getOrCreateExtras(r2)
            java.lang.String r0 = "speedAccuracy"
            r2.putFloat(r0, r3)
            return
    }

    public static void setVerticalAccuracyMeters(@androidx.annotation.NonNull android.location.Location r2, float r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto La
            androidx.core.location.LocationCompat.Api26Impl.setVerticalAccuracyMeters(r2, r3)
            return
        La:
            android.os.Bundle r2 = getOrCreateExtras(r2)
            java.lang.String r0 = "verticalAccuracy"
            r2.putFloat(r0, r3)
            return
    }
}
