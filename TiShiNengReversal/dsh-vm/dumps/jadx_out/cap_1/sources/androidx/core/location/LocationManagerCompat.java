package androidx.core.location;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class LocationManagerCompat {
    private static final long GET_CURRENT_LOCATION_TIMEOUT_MS = 30000;
    private static final long MAX_CURRENT_LOCATION_AGE_MS = 10000;
    private static final long PRE_N_LOOPER_TIMEOUT_S = 5;
    private static java.lang.reflect.Field sContextField;
    private static java.lang.reflect.Method sGnssRequestBuilderBuildMethod;
    private static java.lang.Class<?> sGnssRequestBuilderClass;

    @androidx.annotation.GuardedBy("sLocationListeners")
    static final java.util.WeakHashMap<androidx.core.location.LocationManagerCompat.LocationListenerKey, java.lang.ref.WeakReference<androidx.core.location.LocationManagerCompat.LocationListenerTransport>> sLocationListeners = null;
    private static java.lang.reflect.Method sRegisterGnssMeasurementsCallbackMethod;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class Api19Impl {
        private static java.lang.Class<?> sLocationRequestClass;
        private static java.lang.reflect.Method sRequestLocationUpdatesLooperMethod;

        private Api19Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        @android.annotation.SuppressLint({"BanUncheckedReflection"})
        static boolean tryRequestLocationUpdates(android.location.LocationManager r8, java.lang.String r9, androidx.core.location.LocationRequestCompat r10, androidx.core.location.LocationListenerCompat r11, android.os.Looper r12) {
                r0 = 0
                java.lang.Class<?> r1 = androidx.core.location.LocationManagerCompat.Api19Impl.sLocationRequestClass     // Catch: java.lang.Throwable -> L43
                if (r1 != 0) goto Ld
                java.lang.String r1 = "android.location.LocationRequest"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L43
                androidx.core.location.LocationManagerCompat.Api19Impl.sLocationRequestClass = r1     // Catch: java.lang.Throwable -> L43
            Ld:
                java.lang.reflect.Method r1 = androidx.core.location.LocationManagerCompat.Api19Impl.sRequestLocationUpdatesLooperMethod     // Catch: java.lang.Throwable -> L43
                r2 = 2
                r3 = 3
                r4 = 1
                if (r1 != 0) goto L2f
                java.lang.Class<android.location.LocationManager> r1 = android.location.LocationManager.class
                java.lang.String r5 = "requestLocationUpdates"
                java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L43
                java.lang.Class<?> r7 = androidx.core.location.LocationManagerCompat.Api19Impl.sLocationRequestClass     // Catch: java.lang.Throwable -> L43
                r6[r0] = r7     // Catch: java.lang.Throwable -> L43
                java.lang.Class<android.location.LocationListener> r7 = android.location.LocationListener.class
                r6[r4] = r7     // Catch: java.lang.Throwable -> L43
                java.lang.Class<android.os.Looper> r7 = android.os.Looper.class
                r6[r2] = r7     // Catch: java.lang.Throwable -> L43
                java.lang.reflect.Method r1 = r1.getDeclaredMethod(r5, r6)     // Catch: java.lang.Throwable -> L43
                androidx.core.location.LocationManagerCompat.Api19Impl.sRequestLocationUpdatesLooperMethod = r1     // Catch: java.lang.Throwable -> L43
                r1.setAccessible(r4)     // Catch: java.lang.Throwable -> L43
            L2f:
                android.location.LocationRequest r9 = r10.toLocationRequest(r9)     // Catch: java.lang.Throwable -> L43
                if (r9 == 0) goto L43
                java.lang.reflect.Method r10 = androidx.core.location.LocationManagerCompat.Api19Impl.sRequestLocationUpdatesLooperMethod     // Catch: java.lang.Throwable -> L43
                java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L43
                r1[r0] = r9     // Catch: java.lang.Throwable -> L43
                r1[r4] = r11     // Catch: java.lang.Throwable -> L43
                r1[r2] = r12     // Catch: java.lang.Throwable -> L43
                r10.invoke(r8, r1)     // Catch: java.lang.Throwable -> L43
                return r4
            L43:
                return r0
        }

        @androidx.annotation.RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @androidx.annotation.DoNotInline
        @android.annotation.SuppressLint({"BanUncheckedReflection"})
        static boolean tryRequestLocationUpdates(android.location.LocationManager r8, java.lang.String r9, androidx.core.location.LocationRequestCompat r10, androidx.core.location.LocationManagerCompat.LocationListenerTransport r11) {
                r0 = 0
                java.lang.Class<?> r1 = androidx.core.location.LocationManagerCompat.Api19Impl.sLocationRequestClass     // Catch: java.lang.Throwable -> L51
                if (r1 != 0) goto Ld
                java.lang.String r1 = "android.location.LocationRequest"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L51
                androidx.core.location.LocationManagerCompat.Api19Impl.sLocationRequestClass = r1     // Catch: java.lang.Throwable -> L51
            Ld:
                java.lang.reflect.Method r1 = androidx.core.location.LocationManagerCompat.Api19Impl.sRequestLocationUpdatesLooperMethod     // Catch: java.lang.Throwable -> L51
                r2 = 2
                r3 = 3
                r4 = 1
                if (r1 != 0) goto L2f
                java.lang.Class<android.location.LocationManager> r1 = android.location.LocationManager.class
                java.lang.String r5 = "requestLocationUpdates"
                java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L51
                java.lang.Class<?> r7 = androidx.core.location.LocationManagerCompat.Api19Impl.sLocationRequestClass     // Catch: java.lang.Throwable -> L51
                r6[r0] = r7     // Catch: java.lang.Throwable -> L51
                java.lang.Class<android.location.LocationListener> r7 = android.location.LocationListener.class
                r6[r4] = r7     // Catch: java.lang.Throwable -> L51
                java.lang.Class<android.os.Looper> r7 = android.os.Looper.class
                r6[r2] = r7     // Catch: java.lang.Throwable -> L51
                java.lang.reflect.Method r1 = r1.getDeclaredMethod(r5, r6)     // Catch: java.lang.Throwable -> L51
                androidx.core.location.LocationManagerCompat.Api19Impl.sRequestLocationUpdatesLooperMethod = r1     // Catch: java.lang.Throwable -> L51
                r1.setAccessible(r4)     // Catch: java.lang.Throwable -> L51
            L2f:
                android.location.LocationRequest r9 = r10.toLocationRequest(r9)     // Catch: java.lang.Throwable -> L51
                if (r9 == 0) goto L51
                java.util.WeakHashMap<androidx.core.location.LocationManagerCompat$LocationListenerKey, java.lang.ref.WeakReference<androidx.core.location.LocationManagerCompat$LocationListenerTransport>> r10 = androidx.core.location.LocationManagerCompat.sLocationListeners     // Catch: java.lang.Throwable -> L51
                monitor-enter(r10)     // Catch: java.lang.Throwable -> L51
                java.lang.reflect.Method r1 = androidx.core.location.LocationManagerCompat.Api19Impl.sRequestLocationUpdatesLooperMethod     // Catch: java.lang.Throwable -> L4e
                android.os.Looper r5 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L4e
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L4e
                r3[r0] = r9     // Catch: java.lang.Throwable -> L4e
                r3[r4] = r11     // Catch: java.lang.Throwable -> L4e
                r3[r2] = r5     // Catch: java.lang.Throwable -> L4e
                r1.invoke(r8, r3)     // Catch: java.lang.Throwable -> L4e
                androidx.core.location.LocationManagerCompat.registerLocationListenerTransport(r8, r11)     // Catch: java.lang.Throwable -> L4e
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4e
                return r4
            L4e:
                r8 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4e
                throw r8     // Catch: java.lang.Throwable -> L51 java.lang.Throwable -> L51 java.lang.Throwable -> L51 java.lang.Throwable -> L51 java.lang.Throwable -> L51
            L51:
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

        @androidx.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
        @androidx.annotation.DoNotInline
        static boolean registerGnssMeasurementsCallback(@androidx.annotation.NonNull android.location.LocationManager r0, @androidx.annotation.NonNull android.location.GnssMeasurementsEvent.Callback r1) {
                boolean r0 = r0.registerGnssMeasurementsCallback(r1)
                return r0
        }

        @androidx.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
        @androidx.annotation.DoNotInline
        static boolean registerGnssMeasurementsCallback(@androidx.annotation.NonNull android.location.LocationManager r0, @androidx.annotation.NonNull android.location.GnssMeasurementsEvent.Callback r1, @androidx.annotation.NonNull android.os.Handler r2) {
                boolean r0 = r0.registerGnssMeasurementsCallback(r1, r2)
                return r0
        }

        @androidx.annotation.RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @androidx.annotation.DoNotInline
        static boolean registerGnssStatusCallback(android.location.LocationManager r4, android.os.Handler r5, java.util.concurrent.Executor r6, androidx.core.location.GnssStatusCompat.Callback r7) {
                r0 = 0
                r1 = 1
                if (r5 == 0) goto L6
                r2 = 1
                goto L7
            L6:
                r2 = 0
            L7:
                androidx.core.util.Preconditions.checkArgument(r2)
                androidx.collection.SimpleArrayMap<java.lang.Object, java.lang.Object> r2 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners
                monitor-enter(r2)
                java.lang.Object r3 = r2.get(r7)     // Catch: java.lang.Throwable -> L1b
                androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport r3 = (androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport) r3     // Catch: java.lang.Throwable -> L1b
                if (r3 != 0) goto L1d
                androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport r3 = new androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport     // Catch: java.lang.Throwable -> L1b
                r3.<init>(r7)     // Catch: java.lang.Throwable -> L1b
                goto L20
            L1b:
                r4 = move-exception
                goto L30
            L1d:
                r3.unregister()     // Catch: java.lang.Throwable -> L1b
            L20:
                r3.register(r6)     // Catch: java.lang.Throwable -> L1b
                boolean r4 = r4.registerGnssStatusCallback(r3, r5)     // Catch: java.lang.Throwable -> L1b
                if (r4 == 0) goto L2e
                r2.put(r7, r3)     // Catch: java.lang.Throwable -> L1b
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
                return r1
            L2e:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
                return r0
            L30:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
                throw r4
        }

        @androidx.annotation.DoNotInline
        static void unregisterGnssMeasurementsCallback(@androidx.annotation.NonNull android.location.LocationManager r0, @androidx.annotation.NonNull android.location.GnssMeasurementsEvent.Callback r1) {
                r0.unregisterGnssMeasurementsCallback(r1)
                return
        }

        @androidx.annotation.DoNotInline
        static void unregisterGnssStatusCallback(android.location.LocationManager r1, java.lang.Object r2) {
                boolean r0 = r2 instanceof androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport
                if (r0 == 0) goto La
                r0 = r2
                androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport r0 = (androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport) r0
                r0.unregister()
            La:
                android.location.GnssStatus$Callback r2 = (android.location.GnssStatus.Callback) r2
                r1.unregisterGnssStatusCallback(r2)
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
        static java.lang.String getGnssHardwareModelName(android.location.LocationManager r0) {
                java.lang.String r0 = r0.getGnssHardwareModelName()
                return r0
        }

        @androidx.annotation.DoNotInline
        static int getGnssYearOfHardware(android.location.LocationManager r0) {
                int r0 = r0.getGnssYearOfHardware()
                return r0
        }

        @androidx.annotation.DoNotInline
        static boolean isLocationEnabled(android.location.LocationManager r0) {
                boolean r0 = r0.isLocationEnabled()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(30)
    private static class Api30Impl {
        private static java.lang.Class<?> sLocationRequestClass;
        private static java.lang.reflect.Method sRequestLocationUpdatesExecutorMethod;

        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @androidx.annotation.DoNotInline
        static void getCurrentLocation(android.location.LocationManager r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.Nullable android.os.CancellationSignal r3, @androidx.annotation.NonNull java.util.concurrent.Executor r4, @androidx.annotation.NonNull androidx.core.util.Consumer<android.location.Location> r5) {
                java.util.Objects.requireNonNull(r5)
                androidx.core.location.s r0 = new androidx.core.location.s
                r0.<init>(r5)
                r1.getCurrentLocation(r2, r3, r4, r0)
                return
        }

        @androidx.annotation.RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @androidx.annotation.DoNotInline
        public static boolean registerGnssStatusCallback(android.location.LocationManager r1, android.os.Handler r2, java.util.concurrent.Executor r3, androidx.core.location.GnssStatusCompat.Callback r4) {
                androidx.collection.SimpleArrayMap<java.lang.Object, java.lang.Object> r2 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners
                monitor-enter(r2)
                java.lang.Object r0 = r2.get(r4)     // Catch: java.lang.Throwable -> L11
                androidx.core.location.LocationManagerCompat$GnssStatusTransport r0 = (androidx.core.location.LocationManagerCompat.GnssStatusTransport) r0     // Catch: java.lang.Throwable -> L11
                if (r0 != 0) goto L13
                androidx.core.location.LocationManagerCompat$GnssStatusTransport r0 = new androidx.core.location.LocationManagerCompat$GnssStatusTransport     // Catch: java.lang.Throwable -> L11
                r0.<init>(r4)     // Catch: java.lang.Throwable -> L11
                goto L13
            L11:
                r1 = move-exception
                goto L22
            L13:
                boolean r1 = r1.registerGnssStatusCallback(r3, r0)     // Catch: java.lang.Throwable -> L11
                if (r1 == 0) goto L1f
                r2.put(r4, r0)     // Catch: java.lang.Throwable -> L11
                r1 = 1
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L11
                return r1
            L1f:
                r1 = 0
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L11
                return r1
            L22:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L11
                throw r1
        }

        @androidx.annotation.DoNotInline
        public static boolean tryRequestLocationUpdates(android.location.LocationManager r8, java.lang.String r9, androidx.core.location.LocationRequestCompat r10, java.util.concurrent.Executor r11, androidx.core.location.LocationListenerCompat r12) {
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 30
                r2 = 0
                if (r0 < r1) goto L49
                java.lang.Class<?> r0 = androidx.core.location.LocationManagerCompat.Api30Impl.sLocationRequestClass     // Catch: java.lang.Throwable -> L49
                if (r0 != 0) goto L13
                java.lang.String r0 = "android.location.LocationRequest"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L49
                androidx.core.location.LocationManagerCompat.Api30Impl.sLocationRequestClass = r0     // Catch: java.lang.Throwable -> L49
            L13:
                java.lang.reflect.Method r0 = androidx.core.location.LocationManagerCompat.Api30Impl.sRequestLocationUpdatesExecutorMethod     // Catch: java.lang.Throwable -> L49
                r1 = 2
                r3 = 3
                r4 = 1
                if (r0 != 0) goto L35
                java.lang.Class<android.location.LocationManager> r0 = android.location.LocationManager.class
                java.lang.String r5 = "requestLocationUpdates"
                java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L49
                java.lang.Class<?> r7 = androidx.core.location.LocationManagerCompat.Api30Impl.sLocationRequestClass     // Catch: java.lang.Throwable -> L49
                r6[r2] = r7     // Catch: java.lang.Throwable -> L49
                java.lang.Class<java.util.concurrent.Executor> r7 = java.util.concurrent.Executor.class
                r6[r4] = r7     // Catch: java.lang.Throwable -> L49
                java.lang.Class<android.location.LocationListener> r7 = android.location.LocationListener.class
                r6[r1] = r7     // Catch: java.lang.Throwable -> L49
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r5, r6)     // Catch: java.lang.Throwable -> L49
                androidx.core.location.LocationManagerCompat.Api30Impl.sRequestLocationUpdatesExecutorMethod = r0     // Catch: java.lang.Throwable -> L49
                r0.setAccessible(r4)     // Catch: java.lang.Throwable -> L49
            L35:
                android.location.LocationRequest r9 = r10.toLocationRequest(r9)     // Catch: java.lang.Throwable -> L49
                if (r9 == 0) goto L49
                java.lang.reflect.Method r10 = androidx.core.location.LocationManagerCompat.Api30Impl.sRequestLocationUpdatesExecutorMethod     // Catch: java.lang.Throwable -> L49
                java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L49
                r0[r2] = r9     // Catch: java.lang.Throwable -> L49
                r0[r4] = r11     // Catch: java.lang.Throwable -> L49
                r0[r1] = r12     // Catch: java.lang.Throwable -> L49
                r10.invoke(r8, r0)     // Catch: java.lang.Throwable -> L49
                return r4
            L49:
                return r2
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
        static boolean hasProvider(android.location.LocationManager r0, @androidx.annotation.NonNull java.lang.String r1) {
                boolean r0 = r0.hasProvider(r1)
                return r0
        }

        @androidx.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
        @androidx.annotation.DoNotInline
        static boolean registerGnssMeasurementsCallback(@androidx.annotation.NonNull android.location.LocationManager r0, @androidx.annotation.NonNull java.util.concurrent.Executor r1, @androidx.annotation.NonNull android.location.GnssMeasurementsEvent.Callback r2) {
                boolean r0 = r0.registerGnssMeasurementsCallback(r1, r2)
                return r0
        }

        @androidx.annotation.RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @androidx.annotation.DoNotInline
        static void requestLocationUpdates(android.location.LocationManager r0, @androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull android.location.LocationRequest r2, @androidx.annotation.NonNull java.util.concurrent.Executor r3, @androidx.annotation.NonNull android.location.LocationListener r4) {
                r0.requestLocationUpdates(r1, r2, r3, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class CancellableLocationListener implements android.location.LocationListener {
        private androidx.core.util.Consumer<android.location.Location> mConsumer;
        private final java.util.concurrent.Executor mExecutor;
        private final android.location.LocationManager mLocationManager;
        private final android.os.Handler mTimeoutHandler;

        @androidx.annotation.Nullable
        java.lang.Runnable mTimeoutRunnable;

        @androidx.annotation.GuardedBy("this")
        private boolean mTriggered;

        CancellableLocationListener(android.location.LocationManager r1, java.util.concurrent.Executor r2, androidx.core.util.Consumer<android.location.Location> r3) {
                r0 = this;
                r0.<init>()
                r0.mLocationManager = r1
                r0.mExecutor = r2
                android.os.Handler r1 = new android.os.Handler
                android.os.Looper r2 = android.os.Looper.getMainLooper()
                r1.<init>(r2)
                r0.mTimeoutHandler = r1
                r0.mConsumer = r3
                return
        }

        public static /* synthetic */ void a(androidx.core.location.LocationManagerCompat.CancellableLocationListener r1) {
                r0 = 0
                r1.mTimeoutRunnable = r0
                r1.onLocationChanged(r0)
                return
        }

        public static /* synthetic */ void b(androidx.core.util.Consumer r0, android.location.Location r1) {
                r0.accept(r1)
                return
        }

        @androidx.annotation.RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        private void cleanup() {
                r3 = this;
                r0 = 0
                r3.mConsumer = r0
                android.location.LocationManager r1 = r3.mLocationManager
                r1.removeUpdates(r3)
                java.lang.Runnable r1 = r3.mTimeoutRunnable
                if (r1 == 0) goto L13
                android.os.Handler r2 = r3.mTimeoutHandler
                r2.removeCallbacks(r1)
                r3.mTimeoutRunnable = r0
            L13:
                return
        }

        @androidx.annotation.RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void cancel() {
                r1 = this;
                monitor-enter(r1)
                boolean r0 = r1.mTriggered     // Catch: java.lang.Throwable -> L7
                if (r0 == 0) goto L9
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r0 = move-exception
                goto L11
            L9:
                r0 = 1
                r1.mTriggered = r0     // Catch: java.lang.Throwable -> L7
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
                r1.cleanup()
                return
            L11:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
                throw r0
        }

        @Override // android.location.LocationListener
        @androidx.annotation.RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void onLocationChanged(@androidx.annotation.Nullable android.location.Location r4) {
                r3 = this;
                monitor-enter(r3)
                boolean r0 = r3.mTriggered     // Catch: java.lang.Throwable -> L7
                if (r0 == 0) goto L9
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r4 = move-exception
                goto L1d
            L9:
                r0 = 1
                r3.mTriggered = r0     // Catch: java.lang.Throwable -> L7
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
                androidx.core.util.Consumer<android.location.Location> r0 = r3.mConsumer
                java.util.concurrent.Executor r1 = r3.mExecutor
                androidx.core.location.u r2 = new androidx.core.location.u
                r2.<init>(r0, r4)
                r1.execute(r2)
                r3.cleanup()
                return
            L1d:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
                throw r4
        }

        @Override // android.location.LocationListener
        @androidx.annotation.RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void onProviderDisabled(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                r1 = 0
                r0.onLocationChanged(r1)
                return
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                return
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(java.lang.String r1, int r2, android.os.Bundle r3) {
                r0 = this;
                return
        }

        @android.annotation.SuppressLint({"MissingPermission"})
        public void startTimeout(long r3) {
                r2 = this;
                monitor-enter(r2)
                boolean r0 = r2.mTriggered     // Catch: java.lang.Throwable -> L7
                if (r0 == 0) goto L9
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r3 = move-exception
                goto L17
            L9:
                androidx.core.location.t r0 = new androidx.core.location.t     // Catch: java.lang.Throwable -> L7
                r0.<init>(r2)     // Catch: java.lang.Throwable -> L7
                r2.mTimeoutRunnable = r0     // Catch: java.lang.Throwable -> L7
                android.os.Handler r1 = r2.mTimeoutHandler     // Catch: java.lang.Throwable -> L7
                r1.postDelayed(r0, r3)     // Catch: java.lang.Throwable -> L7
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7
                return
            L17:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7
                throw r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class GnssListenersHolder {

        @androidx.annotation.GuardedBy("sGnssMeasurementListeners")
        static final androidx.collection.SimpleArrayMap<android.location.GnssMeasurementsEvent.Callback, android.location.GnssMeasurementsEvent.Callback> sGnssMeasurementListeners = null;

        @androidx.annotation.GuardedBy("sGnssStatusListeners")
        static final androidx.collection.SimpleArrayMap<java.lang.Object, java.lang.Object> sGnssStatusListeners = null;

        static {
                androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
                r0.<init>()
                androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners = r0
                androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
                r0.<init>()
                androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssMeasurementListeners = r0
                return
        }

        private GnssListenersHolder() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(24)
    private static class GnssMeasurementsTransport extends android.location.GnssMeasurementsEvent.Callback {
        final android.location.GnssMeasurementsEvent.Callback mCallback;

        @androidx.annotation.Nullable
        volatile java.util.concurrent.Executor mExecutor;

        GnssMeasurementsTransport(@androidx.annotation.NonNull android.location.GnssMeasurementsEvent.Callback r1, @androidx.annotation.NonNull java.util.concurrent.Executor r2) {
                r0 = this;
                r0.<init>()
                r0.mCallback = r1
                r0.mExecutor = r2
                return
        }

        public static /* synthetic */ void a(androidx.core.location.LocationManagerCompat.GnssMeasurementsTransport r1, java.util.concurrent.Executor r2, android.location.GnssMeasurementsEvent r3) {
                java.util.concurrent.Executor r0 = r1.mExecutor
                if (r0 == r2) goto L5
                return
            L5:
                android.location.GnssMeasurementsEvent$Callback r1 = r1.mCallback
                androidx.core.location.v.a(r1, r3)
                return
        }

        public static /* synthetic */ void b(androidx.core.location.LocationManagerCompat.GnssMeasurementsTransport r1, java.util.concurrent.Executor r2, int r3) {
                java.util.concurrent.Executor r0 = r1.mExecutor
                if (r0 == r2) goto L5
                return
            L5:
                android.location.GnssMeasurementsEvent$Callback r1 = r1.mCallback
                androidx.core.location.w.a(r1, r3)
                return
        }

        @Override // android.location.GnssMeasurementsEvent.Callback
        public void onGnssMeasurementsReceived(android.location.GnssMeasurementsEvent r3) {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.mExecutor
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.x r1 = new androidx.core.location.x
                r1.<init>(r2, r0, r3)
                r0.execute(r1)
                return
        }

        @Override // android.location.GnssMeasurementsEvent.Callback
        public void onStatusChanged(int r3) {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.mExecutor
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.y r1 = new androidx.core.location.y
                r1.<init>(r2, r0, r3)
                r0.execute(r1)
                return
        }

        public void unregister() {
                r1 = this;
                r0 = 0
                r1.mExecutor = r0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(30)
    private static class GnssStatusTransport extends android.location.GnssStatus.Callback {
        final androidx.core.location.GnssStatusCompat.Callback mCallback;

        GnssStatusTransport(androidx.core.location.GnssStatusCompat.Callback r3) {
                r2 = this;
                r2.<init>()
                if (r3 == 0) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                java.lang.String r1 = "invalid null callback"
                androidx.core.util.Preconditions.checkArgument(r0, r1)
                r2.mCallback = r3
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int r2) {
                r1 = this;
                androidx.core.location.GnssStatusCompat$Callback r0 = r1.mCallback
                r0.onFirstFix(r2)
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(android.location.GnssStatus r2) {
                r1 = this;
                androidx.core.location.GnssStatusCompat$Callback r0 = r1.mCallback
                androidx.core.location.GnssStatusCompat r2 = androidx.core.location.GnssStatusCompat.wrap(r2)
                r0.onSatelliteStatusChanged(r2)
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
                r1 = this;
                androidx.core.location.GnssStatusCompat$Callback r0 = r1.mCallback
                r0.onStarted()
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
                r1 = this;
                androidx.core.location.GnssStatusCompat$Callback r0 = r1.mCallback
                r0.onStopped()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class GpsStatusTransport implements android.location.GpsStatus.Listener {
        final androidx.core.location.GnssStatusCompat.Callback mCallback;

        @androidx.annotation.Nullable
        volatile java.util.concurrent.Executor mExecutor;
        private final android.location.LocationManager mLocationManager;

        GpsStatusTransport(android.location.LocationManager r3, androidx.core.location.GnssStatusCompat.Callback r4) {
                r2 = this;
                r2.<init>()
                if (r4 == 0) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                java.lang.String r1 = "invalid null callback"
                androidx.core.util.Preconditions.checkArgument(r0, r1)
                r2.mLocationManager = r3
                r2.mCallback = r4
                return
        }

        public static /* synthetic */ void a(androidx.core.location.LocationManagerCompat.GpsStatusTransport r1, java.util.concurrent.Executor r2) {
                java.util.concurrent.Executor r0 = r1.mExecutor
                if (r0 == r2) goto L5
                return
            L5:
                androidx.core.location.GnssStatusCompat$Callback r1 = r1.mCallback
                r1.onStopped()
                return
        }

        public static /* synthetic */ void b(androidx.core.location.LocationManagerCompat.GpsStatusTransport r1, java.util.concurrent.Executor r2) {
                java.util.concurrent.Executor r0 = r1.mExecutor
                if (r0 == r2) goto L5
                return
            L5:
                androidx.core.location.GnssStatusCompat$Callback r1 = r1.mCallback
                r1.onStarted()
                return
        }

        public static /* synthetic */ void c(androidx.core.location.LocationManagerCompat.GpsStatusTransport r1, java.util.concurrent.Executor r2, int r3) {
                java.util.concurrent.Executor r0 = r1.mExecutor
                if (r0 == r2) goto L5
                return
            L5:
                androidx.core.location.GnssStatusCompat$Callback r1 = r1.mCallback
                r1.onFirstFix(r3)
                return
        }

        public static /* synthetic */ void d(androidx.core.location.LocationManagerCompat.GpsStatusTransport r1, java.util.concurrent.Executor r2, androidx.core.location.GnssStatusCompat r3) {
                java.util.concurrent.Executor r0 = r1.mExecutor
                if (r0 == r2) goto L5
                return
            L5:
                androidx.core.location.GnssStatusCompat$Callback r1 = r1.mCallback
                r1.onSatelliteStatusChanged(r3)
                return
        }

        @Override // android.location.GpsStatus.Listener
        @androidx.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
        public void onGpsStatusChanged(int r4) {
                r3 = this;
                java.util.concurrent.Executor r0 = r3.mExecutor
                if (r0 != 0) goto L5
                goto L3c
            L5:
                r1 = 1
                if (r4 == r1) goto L46
                r1 = 2
                if (r4 == r1) goto L3d
                r1 = 3
                r2 = 0
                if (r4 == r1) goto L28
                r1 = 4
                if (r4 == r1) goto L13
                goto L3c
            L13:
                android.location.LocationManager r4 = r3.mLocationManager
                android.location.GpsStatus r4 = r4.getGpsStatus(r2)
                if (r4 == 0) goto L3c
                androidx.core.location.GnssStatusCompat r4 = androidx.core.location.GnssStatusCompat.wrap(r4)
                androidx.core.location.c0 r1 = new androidx.core.location.c0
                r1.<init>(r3, r0, r4)
                r0.execute(r1)
                return
            L28:
                android.location.LocationManager r4 = r3.mLocationManager
                android.location.GpsStatus r4 = r4.getGpsStatus(r2)
                if (r4 == 0) goto L3c
                int r4 = r4.getTimeToFirstFix()
                androidx.core.location.b0 r1 = new androidx.core.location.b0
                r1.<init>(r3, r0, r4)
                r0.execute(r1)
            L3c:
                return
            L3d:
                androidx.core.location.a0 r4 = new androidx.core.location.a0
                r4.<init>(r3, r0)
                r0.execute(r4)
                return
            L46:
                androidx.core.location.z r4 = new androidx.core.location.z
                r4.<init>(r3, r0)
                r0.execute(r4)
                return
        }

        public void register(java.util.concurrent.Executor r2) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.mExecutor
                if (r0 != 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                androidx.core.util.Preconditions.checkState(r0)
                r1.mExecutor = r2
                return
        }

        public void unregister() {
                r1 = this;
                r0 = 0
                r1.mExecutor = r0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class InlineHandlerExecutor implements java.util.concurrent.Executor {
        private final android.os.Handler mHandler;

        InlineHandlerExecutor(@androidx.annotation.NonNull android.os.Handler r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r1)
                android.os.Handler r1 = (android.os.Handler) r1
                r0.mHandler = r1
                return
        }

        @Override // java.util.concurrent.Executor
        public void execute(@androidx.annotation.NonNull java.lang.Runnable r3) {
                r2 = this;
                android.os.Looper r0 = android.os.Looper.myLooper()
                android.os.Handler r1 = r2.mHandler
                android.os.Looper r1 = r1.getLooper()
                if (r0 != r1) goto L10
                r3.run()
                return
            L10:
                android.os.Handler r0 = r2.mHandler
                java.lang.Object r3 = androidx.core.util.Preconditions.checkNotNull(r3)
                java.lang.Runnable r3 = (java.lang.Runnable) r3
                boolean r3 = r0.post(r3)
                if (r3 == 0) goto L1f
                return
            L1f:
                java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                android.os.Handler r1 = r2.mHandler
                r0.append(r1)
                java.lang.String r1 = " is shutting down"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class LocationListenerKey {
        final androidx.core.location.LocationListenerCompat mListener;
        final java.lang.String mProvider;

        LocationListenerKey(java.lang.String r2, androidx.core.location.LocationListenerCompat r3) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "invalid null provider"
                java.lang.Object r2 = androidx.core.util.ObjectsCompat.requireNonNull(r2, r0)
                java.lang.String r2 = (java.lang.String) r2
                r1.mProvider = r2
                java.lang.String r2 = "invalid null listener"
                java.lang.Object r2 = androidx.core.util.ObjectsCompat.requireNonNull(r3, r2)
                androidx.core.location.LocationListenerCompat r2 = (androidx.core.location.LocationListenerCompat) r2
                r1.mListener = r2
                return
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof androidx.core.location.LocationManagerCompat.LocationListenerKey
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                androidx.core.location.LocationManagerCompat$LocationListenerKey r4 = (androidx.core.location.LocationManagerCompat.LocationListenerKey) r4
                java.lang.String r0 = r3.mProvider
                java.lang.String r2 = r4.mProvider
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L1e
                androidx.core.location.LocationListenerCompat r0 = r3.mListener
                androidx.core.location.LocationListenerCompat r4 = r4.mListener
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L1e
                r4 = 1
                return r4
            L1e:
                return r1
        }

        public int hashCode() {
                r4 = this;
                java.lang.String r0 = r4.mProvider
                androidx.core.location.LocationListenerCompat r1 = r4.mListener
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r2[r3] = r0
                r0 = 1
                r2[r0] = r1
                int r0 = androidx.core.util.ObjectsCompat.hash(r2)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class LocationListenerTransport implements android.location.LocationListener {
        final java.util.concurrent.Executor mExecutor;

        @androidx.annotation.Nullable
        volatile androidx.core.location.LocationManagerCompat.LocationListenerKey mKey;

        LocationListenerTransport(@androidx.annotation.Nullable androidx.core.location.LocationManagerCompat.LocationListenerKey r1, java.util.concurrent.Executor r2) {
                r0 = this;
                r0.<init>()
                r0.mKey = r1
                r0.mExecutor = r2
                return
        }

        public static /* synthetic */ void a(androidx.core.location.LocationManagerCompat.LocationListenerTransport r0, java.lang.String r1) {
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r0.mKey
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationListenerCompat r0 = r0.mListener
                r0.onProviderEnabled(r1)
                return
        }

        public static /* synthetic */ void b(androidx.core.location.LocationManagerCompat.LocationListenerTransport r0, java.lang.String r1, int r2, android.os.Bundle r3) {
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r0.mKey
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationListenerCompat r0 = r0.mListener
                r0.onStatusChanged(r1, r2, r3)
                return
        }

        public static /* synthetic */ void c(androidx.core.location.LocationManagerCompat.LocationListenerTransport r0, android.location.Location r1) {
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r0.mKey
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationListenerCompat r0 = r0.mListener
                r0.onLocationChanged(r1)
                return
        }

        public static /* synthetic */ void d(androidx.core.location.LocationManagerCompat.LocationListenerTransport r0, java.util.List r1) {
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r0.mKey
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationListenerCompat r0 = r0.mListener
                r0.onLocationChanged(r1)
                return
        }

        public static /* synthetic */ void e(androidx.core.location.LocationManagerCompat.LocationListenerTransport r0, java.lang.String r1) {
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r0.mKey
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationListenerCompat r0 = r0.mListener
                r0.onProviderDisabled(r1)
                return
        }

        public static /* synthetic */ void f(androidx.core.location.LocationManagerCompat.LocationListenerTransport r0, int r1) {
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r0.mKey
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationListenerCompat r0 = r0.mListener
                r0.onFlushComplete(r1)
                return
        }

        public androidx.core.location.LocationManagerCompat.LocationListenerKey getKey() {
                r1 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r1.mKey
                java.lang.Object r0 = androidx.core.util.ObjectsCompat.requireNonNull(r0)
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = (androidx.core.location.LocationManagerCompat.LocationListenerKey) r0
                return r0
        }

        @Override // android.location.LocationListener
        public void onFlushComplete(int r3) {
                r2 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r2.mKey
                if (r0 != 0) goto L5
                return
            L5:
                java.util.concurrent.Executor r0 = r2.mExecutor
                androidx.core.location.h0 r1 = new androidx.core.location.h0
                r1.<init>(r2, r3)
                r0.execute(r1)
                return
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(@androidx.annotation.NonNull android.location.Location r3) {
                r2 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r2.mKey
                if (r0 != 0) goto L5
                return
            L5:
                java.util.concurrent.Executor r0 = r2.mExecutor
                androidx.core.location.g0 r1 = new androidx.core.location.g0
                r1.<init>(r2, r3)
                r0.execute(r1)
                return
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(@androidx.annotation.NonNull java.util.List<android.location.Location> r3) {
                r2 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r2.mKey
                if (r0 != 0) goto L5
                return
            L5:
                java.util.concurrent.Executor r0 = r2.mExecutor
                androidx.core.location.f0 r1 = new androidx.core.location.f0
                r1.<init>(r2, r3)
                r0.execute(r1)
                return
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(@androidx.annotation.NonNull java.lang.String r3) {
                r2 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r2.mKey
                if (r0 != 0) goto L5
                return
            L5:
                java.util.concurrent.Executor r0 = r2.mExecutor
                androidx.core.location.e0 r1 = new androidx.core.location.e0
                r1.<init>(r2, r3)
                r0.execute(r1)
                return
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(@androidx.annotation.NonNull java.lang.String r3) {
                r2 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r2.mKey
                if (r0 != 0) goto L5
                return
            L5:
                java.util.concurrent.Executor r0 = r2.mExecutor
                androidx.core.location.d0 r1 = new androidx.core.location.d0
                r1.<init>(r2, r3)
                r0.execute(r1)
                return
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(java.lang.String r3, int r4, android.os.Bundle r5) {
                r2 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r2.mKey
                if (r0 != 0) goto L5
                return
            L5:
                java.util.concurrent.Executor r0 = r2.mExecutor
                androidx.core.location.i0 r1 = new androidx.core.location.i0
                r1.<init>(r2, r3, r4, r5)
                r0.execute(r1)
                return
        }

        public void unregister() {
                r1 = this;
                r0 = 0
                r1.mKey = r0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(24)
    private static class PreRGnssStatusTransport extends android.location.GnssStatus.Callback {
        final androidx.core.location.GnssStatusCompat.Callback mCallback;

        @androidx.annotation.Nullable
        volatile java.util.concurrent.Executor mExecutor;

        PreRGnssStatusTransport(androidx.core.location.GnssStatusCompat.Callback r3) {
                r2 = this;
                r2.<init>()
                if (r3 == 0) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                java.lang.String r1 = "invalid null callback"
                androidx.core.util.Preconditions.checkArgument(r0, r1)
                r2.mCallback = r3
                return
        }

        public static /* synthetic */ void a(androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport r1, java.util.concurrent.Executor r2) {
                java.util.concurrent.Executor r0 = r1.mExecutor
                if (r0 == r2) goto L5
                return
            L5:
                androidx.core.location.GnssStatusCompat$Callback r1 = r1.mCallback
                r1.onStopped()
                return
        }

        public static /* synthetic */ void b(androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport r1, java.util.concurrent.Executor r2, int r3) {
                java.util.concurrent.Executor r0 = r1.mExecutor
                if (r0 == r2) goto L5
                return
            L5:
                androidx.core.location.GnssStatusCompat$Callback r1 = r1.mCallback
                r1.onFirstFix(r3)
                return
        }

        public static /* synthetic */ void c(androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport r1, java.util.concurrent.Executor r2) {
                java.util.concurrent.Executor r0 = r1.mExecutor
                if (r0 == r2) goto L5
                return
            L5:
                androidx.core.location.GnssStatusCompat$Callback r1 = r1.mCallback
                r1.onStarted()
                return
        }

        public static /* synthetic */ void d(androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport r1, java.util.concurrent.Executor r2, android.location.GnssStatus r3) {
                java.util.concurrent.Executor r0 = r1.mExecutor
                if (r0 == r2) goto L5
                return
            L5:
                androidx.core.location.GnssStatusCompat$Callback r1 = r1.mCallback
                androidx.core.location.GnssStatusCompat r2 = androidx.core.location.GnssStatusCompat.wrap(r3)
                r1.onSatelliteStatusChanged(r2)
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int r3) {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.mExecutor
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.j0 r1 = new androidx.core.location.j0
                r1.<init>(r2, r0, r3)
                r0.execute(r1)
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(android.location.GnssStatus r3) {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.mExecutor
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.k0 r1 = new androidx.core.location.k0
                r1.<init>(r2, r0, r3)
                r0.execute(r1)
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.mExecutor
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.m0 r1 = new androidx.core.location.m0
                r1.<init>(r2, r0)
                r0.execute(r1)
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.mExecutor
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.l0 r1 = new androidx.core.location.l0
                r1.<init>(r2, r0)
                r0.execute(r1)
                return
        }

        public void register(java.util.concurrent.Executor r5) {
                r4 = this;
                r0 = 0
                r1 = 1
                if (r5 == 0) goto L6
                r2 = 1
                goto L7
            L6:
                r2 = 0
            L7:
                java.lang.String r3 = "invalid null executor"
                androidx.core.util.Preconditions.checkArgument(r2, r3)
                java.util.concurrent.Executor r2 = r4.mExecutor
                if (r2 != 0) goto L11
                r0 = 1
            L11:
                androidx.core.util.Preconditions.checkState(r0)
                r4.mExecutor = r5
                return
        }

        public void unregister() {
                r1 = this;
                r0 = 0
                r1.mExecutor = r0
                return
        }
    }

    static {
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            androidx.core.location.LocationManagerCompat.sLocationListeners = r0
            return
    }

    private LocationManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void a(androidx.core.util.Consumer r0, android.location.Location r1) {
            r0.accept(r1)
            return
    }

    public static /* synthetic */ java.lang.Boolean b(android.location.LocationManager r0, androidx.core.location.LocationManagerCompat.GpsStatusTransport r1) {
            boolean r0 = r0.addGpsStatusListener(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    @androidx.annotation.RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void getCurrentLocation(@androidx.annotation.NonNull android.location.LocationManager r8, @androidx.annotation.NonNull java.lang.String r9, @androidx.annotation.Nullable android.os.CancellationSignal r10, @androidx.annotation.NonNull java.util.concurrent.Executor r11, @androidx.annotation.NonNull androidx.core.util.Consumer<android.location.Location> r12) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto La
            androidx.core.location.LocationManagerCompat.Api30Impl.getCurrentLocation(r8, r9, r10, r11, r12)
            return
        La:
            if (r10 == 0) goto Lf
            r10.throwIfCanceled()
        Lf:
            android.location.Location r0 = r8.getLastKnownLocation(r9)
            if (r0 == 0) goto L2d
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = androidx.core.location.LocationCompat.getElapsedRealtimeMillis(r0)
            long r1 = r1 - r3
            r3 = 10000(0x2710, double:4.9407E-320)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L2d
            androidx.core.location.p r8 = new androidx.core.location.p
            r8.<init>(r12, r0)
            r11.execute(r8)
            return
        L2d:
            androidx.core.location.LocationManagerCompat$CancellableLocationListener r6 = new androidx.core.location.LocationManagerCompat$CancellableLocationListener
            r6.<init>(r8, r11, r12)
            r5 = 0
            android.os.Looper r7 = android.os.Looper.getMainLooper()
            r3 = 0
            r1 = r8
            r2 = r9
            r1.requestLocationUpdates(r2, r3, r5, r6, r7)
            if (r10 == 0) goto L48
            androidx.core.location.q r8 = new androidx.core.location.q
            r8.<init>(r6)
            r10.setOnCancelListener(r8)
        L48:
            r8 = 30000(0x7530, double:1.4822E-319)
            r6.startTimeout(r8)
            return
    }

    @androidx.annotation.RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @java.lang.Deprecated
    public static void getCurrentLocation(@androidx.annotation.NonNull android.location.LocationManager r0, @androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.Nullable androidx.core.os.CancellationSignal r2, @androidx.annotation.NonNull java.util.concurrent.Executor r3, @androidx.annotation.NonNull androidx.core.util.Consumer<android.location.Location> r4) {
            if (r2 == 0) goto L9
            java.lang.Object r2 = r2.getCancellationSignalObject()
            android.os.CancellationSignal r2 = (android.os.CancellationSignal) r2
            goto La
        L9:
            r2 = 0
        La:
            getCurrentLocation(r0, r1, r2, r3, r4)
            return
    }

    @androidx.annotation.Nullable
    public static java.lang.String getGnssHardwareModelName(@androidx.annotation.NonNull android.location.LocationManager r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            java.lang.String r2 = androidx.core.location.LocationManagerCompat.Api28Impl.getGnssHardwareModelName(r2)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public static int getGnssYearOfHardware(@androidx.annotation.NonNull android.location.LocationManager r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            int r2 = androidx.core.location.LocationManagerCompat.Api28Impl.getGnssYearOfHardware(r2)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public static boolean hasProvider(@androidx.annotation.NonNull android.location.LocationManager r2, @androidx.annotation.NonNull java.lang.String r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.location.LocationManagerCompat.Api31Impl.hasProvider(r2, r3)
            return r2
        Lb:
            java.util.List r0 = r2.getAllProviders()
            boolean r0 = r0.contains(r3)
            r1 = 1
            if (r0 == 0) goto L17
            return r1
        L17:
            r0 = 0
            android.location.LocationProvider r2 = r2.getProvider(r3)     // Catch: java.lang.SecurityException -> L1f
            if (r2 == 0) goto L1f
            return r1
        L1f:
            return r0
    }

    public static boolean isLocationEnabled(@androidx.annotation.NonNull android.location.LocationManager r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.location.LocationManagerCompat.Api28Impl.isLocationEnabled(r2)
            return r2
        Lb:
            java.lang.String r0 = "network"
            boolean r0 = r2.isProviderEnabled(r0)
            if (r0 != 0) goto L1e
            java.lang.String r0 = "gps"
            boolean r2 = r2.isProviderEnabled(r0)
            if (r2 == 0) goto L1c
            goto L1e
        L1c:
            r2 = 0
            return r2
        L1e:
            r2 = 1
            return r2
    }

    @androidx.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    @androidx.annotation.RequiresApi(24)
    public static boolean registerGnssMeasurementsCallback(@androidx.annotation.NonNull android.location.LocationManager r2, @androidx.annotation.NonNull android.location.GnssMeasurementsEvent.Callback r3, @androidx.annotation.NonNull android.os.Handler r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 <= r1) goto Lb
            boolean r2 = androidx.core.location.LocationManagerCompat.Api24Impl.registerGnssMeasurementsCallback(r2, r3, r4)
            return r2
        Lb:
            if (r0 != r1) goto L16
            java.util.concurrent.Executor r4 = androidx.core.os.ExecutorCompat.create(r4)
            boolean r2 = registerGnssMeasurementsCallbackOnR(r2, r4, r3)
            return r2
        L16:
            androidx.collection.SimpleArrayMap<android.location.GnssMeasurementsEvent$Callback, android.location.GnssMeasurementsEvent$Callback> r0 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssMeasurementListeners
            monitor-enter(r0)
            unregisterGnssMeasurementsCallback(r2, r3)     // Catch: java.lang.Throwable -> L28
            boolean r2 = androidx.core.location.LocationManagerCompat.Api24Impl.registerGnssMeasurementsCallback(r2, r3, r4)     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L2a
            r0.put(r3, r3)     // Catch: java.lang.Throwable -> L28
            r2 = 1
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            return r2
        L28:
            r2 = move-exception
            goto L2d
        L2a:
            r2 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            return r2
        L2d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            throw r2
    }

    @androidx.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    @androidx.annotation.RequiresApi(24)
    public static boolean registerGnssMeasurementsCallback(@androidx.annotation.NonNull android.location.LocationManager r2, @androidx.annotation.NonNull java.util.concurrent.Executor r3, @androidx.annotation.NonNull android.location.GnssMeasurementsEvent.Callback r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 <= r1) goto Lb
            boolean r2 = androidx.core.location.LocationManagerCompat.Api31Impl.registerGnssMeasurementsCallback(r2, r3, r4)
            return r2
        Lb:
            if (r0 != r1) goto L12
            boolean r2 = registerGnssMeasurementsCallbackOnR(r2, r3, r4)
            return r2
        L12:
            androidx.collection.SimpleArrayMap<android.location.GnssMeasurementsEvent$Callback, android.location.GnssMeasurementsEvent$Callback> r0 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssMeasurementListeners
            monitor-enter(r0)
            androidx.core.location.LocationManagerCompat$GnssMeasurementsTransport r1 = new androidx.core.location.LocationManagerCompat$GnssMeasurementsTransport     // Catch: java.lang.Throwable -> L29
            r1.<init>(r4, r3)     // Catch: java.lang.Throwable -> L29
            unregisterGnssMeasurementsCallback(r2, r4)     // Catch: java.lang.Throwable -> L29
            boolean r2 = androidx.core.location.LocationManagerCompat.Api24Impl.registerGnssMeasurementsCallback(r2, r1)     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L2b
            r0.put(r4, r1)     // Catch: java.lang.Throwable -> L29
            r2 = 1
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            return r2
        L29:
            r2 = move-exception
            goto L2e
        L2b:
            r2 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            return r2
        L2e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r2
    }

    @androidx.annotation.RequiresApi(30)
    private static boolean registerGnssMeasurementsCallbackOnR(@androidx.annotation.NonNull android.location.LocationManager r10, @androidx.annotation.NonNull java.util.concurrent.Executor r11, @androidx.annotation.NonNull android.location.GnssMeasurementsEvent.Callback r12) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 != r1) goto L77
            r0 = 0
            java.lang.Class<?> r1 = androidx.core.location.LocationManagerCompat.sGnssRequestBuilderClass     // Catch: java.lang.Throwable -> L76
            if (r1 != 0) goto L13
            java.lang.String r1 = "android.location.GnssRequest$Builder"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L76
            androidx.core.location.LocationManagerCompat.sGnssRequestBuilderClass = r1     // Catch: java.lang.Throwable -> L76
        L13:
            java.lang.reflect.Method r1 = androidx.core.location.LocationManagerCompat.sGnssRequestBuilderBuildMethod     // Catch: java.lang.Throwable -> L76
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L26
            java.lang.Class<?> r1 = androidx.core.location.LocationManagerCompat.sGnssRequestBuilderClass     // Catch: java.lang.Throwable -> L76
            java.lang.String r4 = "build"
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r4, r3)     // Catch: java.lang.Throwable -> L76
            androidx.core.location.LocationManagerCompat.sGnssRequestBuilderBuildMethod = r1     // Catch: java.lang.Throwable -> L76
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L76
        L26:
            java.lang.reflect.Method r1 = androidx.core.location.LocationManagerCompat.sRegisterGnssMeasurementsCallbackMethod     // Catch: java.lang.Throwable -> L76
            r4 = 2
            r5 = 3
            if (r1 != 0) goto L4d
            java.lang.Class<android.location.LocationManager> r1 = android.location.LocationManager.class
            java.lang.String r6 = "registerGnssMeasurementsCallback"
            java.lang.String r7 = "android.location.GnssRequest"
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch: java.lang.Throwable -> L76
            java.lang.Class r8 = androidx.core.location.o.a()     // Catch: java.lang.Throwable -> L76
            java.lang.Class[] r9 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L76
            r9[r0] = r7     // Catch: java.lang.Throwable -> L76
            java.lang.Class<java.util.concurrent.Executor> r7 = java.util.concurrent.Executor.class
            r9[r2] = r7     // Catch: java.lang.Throwable -> L76
            r9[r4] = r8     // Catch: java.lang.Throwable -> L76
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r6, r9)     // Catch: java.lang.Throwable -> L76
            androidx.core.location.LocationManagerCompat.sRegisterGnssMeasurementsCallbackMethod = r1     // Catch: java.lang.Throwable -> L76
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L76
        L4d:
            java.lang.reflect.Method r1 = androidx.core.location.LocationManagerCompat.sRegisterGnssMeasurementsCallbackMethod     // Catch: java.lang.Throwable -> L76
            java.lang.reflect.Method r6 = androidx.core.location.LocationManagerCompat.sGnssRequestBuilderBuildMethod     // Catch: java.lang.Throwable -> L76
            java.lang.Class<?> r7 = androidx.core.location.LocationManagerCompat.sGnssRequestBuilderClass     // Catch: java.lang.Throwable -> L76
            java.lang.reflect.Constructor r7 = r7.getDeclaredConstructor(r3)     // Catch: java.lang.Throwable -> L76
            java.lang.Object r7 = r7.newInstance(r3)     // Catch: java.lang.Throwable -> L76
            java.lang.Object r3 = r6.invoke(r7, r3)     // Catch: java.lang.Throwable -> L76
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L76
            r5[r0] = r3     // Catch: java.lang.Throwable -> L76
            r5[r2] = r11     // Catch: java.lang.Throwable -> L76
            r5[r4] = r12     // Catch: java.lang.Throwable -> L76
            java.lang.Object r10 = r1.invoke(r10, r5)     // Catch: java.lang.Throwable -> L76
            if (r10 == 0) goto L76
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L76
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L76
            if (r10 == 0) goto L76
            return r2
        L76:
            return r0
        L77:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
    }

    @androidx.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    private static boolean registerGnssStatusCallback(android.location.LocationManager r9, android.os.Handler r10, java.util.concurrent.Executor r11, androidx.core.location.GnssStatusCompat.Callback r12) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            boolean r9 = androidx.core.location.LocationManagerCompat.Api30Impl.registerGnssStatusCallback(r9, r10, r11, r12)
            return r9
        Lb:
            r1 = 24
            if (r0 < r1) goto L14
            boolean r9 = androidx.core.location.LocationManagerCompat.Api24Impl.registerGnssStatusCallback(r9, r10, r11, r12)
            return r9
        L14:
            r0 = 0
            r1 = 1
            if (r10 == 0) goto L1a
            r2 = 1
            goto L1b
        L1a:
            r2 = 0
        L1b:
            androidx.core.util.Preconditions.checkArgument(r2)
            androidx.collection.SimpleArrayMap<java.lang.Object, java.lang.Object> r2 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners
            monitor-enter(r2)
            java.lang.Object r3 = r2.get(r12)     // Catch: java.lang.Throwable -> L2f
            androidx.core.location.LocationManagerCompat$GpsStatusTransport r3 = (androidx.core.location.LocationManagerCompat.GpsStatusTransport) r3     // Catch: java.lang.Throwable -> L2f
            if (r3 != 0) goto L32
            androidx.core.location.LocationManagerCompat$GpsStatusTransport r3 = new androidx.core.location.LocationManagerCompat$GpsStatusTransport     // Catch: java.lang.Throwable -> L2f
            r3.<init>(r9, r12)     // Catch: java.lang.Throwable -> L2f
            goto L35
        L2f:
            r9 = move-exception
            goto L109
        L32:
            r3.unregister()     // Catch: java.lang.Throwable -> L2f
        L35:
            r3.register(r11)     // Catch: java.lang.Throwable -> L2f
            java.util.concurrent.FutureTask r11 = new java.util.concurrent.FutureTask     // Catch: java.lang.Throwable -> L2f
            androidx.core.location.r r4 = new androidx.core.location.r     // Catch: java.lang.Throwable -> L2f
            r4.<init>(r9, r3)     // Catch: java.lang.Throwable -> L2f
            r11.<init>(r4)     // Catch: java.lang.Throwable -> L2f
            android.os.Looper r9 = android.os.Looper.myLooper()     // Catch: java.lang.Throwable -> L2f
            android.os.Looper r4 = r10.getLooper()     // Catch: java.lang.Throwable -> L2f
            if (r9 != r4) goto L50
            r11.run()     // Catch: java.lang.Throwable -> L2f
            goto L56
        L50:
            boolean r9 = r10.post(r11)     // Catch: java.lang.Throwable -> L2f
            if (r9 == 0) goto Lf2
        L56:
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> La7 java.util.concurrent.TimeoutException -> La9 java.util.concurrent.ExecutionException -> Lab
            r4 = 5
            long r4 = r9.toNanos(r4)     // Catch: java.lang.Throwable -> La7 java.util.concurrent.TimeoutException -> La9 java.util.concurrent.ExecutionException -> Lab
            long r6 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> La7 java.util.concurrent.TimeoutException -> La9 java.util.concurrent.ExecutionException -> Lab
            long r6 = r6 + r4
            r9 = 0
        L64:
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L82 java.util.concurrent.TimeoutException -> L85 java.util.concurrent.ExecutionException -> L88 java.lang.InterruptedException -> L96
            java.lang.Object r4 = r11.get(r4, r8)     // Catch: java.lang.Throwable -> L82 java.util.concurrent.TimeoutException -> L85 java.util.concurrent.ExecutionException -> L88 java.lang.InterruptedException -> L96
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L82 java.util.concurrent.TimeoutException -> L85 java.util.concurrent.ExecutionException -> L88 java.lang.InterruptedException -> L96
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L82 java.util.concurrent.TimeoutException -> L85 java.util.concurrent.ExecutionException -> L88 java.lang.InterruptedException -> L96
            if (r4 == 0) goto L8b
            androidx.collection.SimpleArrayMap<java.lang.Object, java.lang.Object> r4 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners     // Catch: java.lang.Throwable -> L82 java.util.concurrent.TimeoutException -> L85 java.util.concurrent.ExecutionException -> L88 java.lang.InterruptedException -> L96
            r4.put(r12, r3)     // Catch: java.lang.Throwable -> L82 java.util.concurrent.TimeoutException -> L85 java.util.concurrent.ExecutionException -> L88 java.lang.InterruptedException -> L96
            if (r9 == 0) goto L80
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2f
            r9.interrupt()     // Catch: java.lang.Throwable -> L2f
        L80:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            return r1
        L82:
            r10 = move-exception
            r0 = r9
            goto Le8
        L85:
            r11 = move-exception
            r0 = r9
            goto Lad
        L88:
            r10 = move-exception
            r0 = r9
            goto Lc4
        L8b:
            if (r9 == 0) goto L94
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2f
            r9.interrupt()     // Catch: java.lang.Throwable -> L2f
        L94:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            return r0
        L96:
            long r4 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L9e java.util.concurrent.TimeoutException -> La1 java.util.concurrent.ExecutionException -> La4
            long r4 = r6 - r4
            r9 = 1
            goto L64
        L9e:
            r10 = move-exception
            r0 = 1
            goto Le8
        La1:
            r11 = move-exception
            r0 = 1
            goto Lad
        La4:
            r10 = move-exception
            r0 = 1
            goto Lc4
        La7:
            r10 = move-exception
            goto Le8
        La9:
            r11 = move-exception
            goto Lad
        Lab:
            r10 = move-exception
            goto Lc4
        Lad:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La7
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La7
            r12.<init>()     // Catch: java.lang.Throwable -> La7
            r12.append(r10)     // Catch: java.lang.Throwable -> La7
            java.lang.String r10 = " appears to be blocked, please run registerGnssStatusCallback() directly on a Looper thread or ensure the main Looper is not blocked by this thread"
            r12.append(r10)     // Catch: java.lang.Throwable -> La7
            java.lang.String r10 = r12.toString()     // Catch: java.lang.Throwable -> La7
            r9.<init>(r10, r11)     // Catch: java.lang.Throwable -> La7
            throw r9     // Catch: java.lang.Throwable -> La7
        Lc4:
            java.lang.Throwable r9 = r10.getCause()     // Catch: java.lang.Throwable -> La7
            boolean r9 = r9 instanceof java.lang.RuntimeException     // Catch: java.lang.Throwable -> La7
            if (r9 != 0) goto Le1
            java.lang.Throwable r9 = r10.getCause()     // Catch: java.lang.Throwable -> La7
            boolean r9 = r9 instanceof java.lang.Error     // Catch: java.lang.Throwable -> La7
            if (r9 == 0) goto Ldb
            java.lang.Throwable r9 = r10.getCause()     // Catch: java.lang.Throwable -> La7
            java.lang.Error r9 = (java.lang.Error) r9     // Catch: java.lang.Throwable -> La7
            throw r9     // Catch: java.lang.Throwable -> La7
        Ldb:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La7
            r9.<init>(r10)     // Catch: java.lang.Throwable -> La7
            throw r9     // Catch: java.lang.Throwable -> La7
        Le1:
            java.lang.Throwable r9 = r10.getCause()     // Catch: java.lang.Throwable -> La7
            java.lang.RuntimeException r9 = (java.lang.RuntimeException) r9     // Catch: java.lang.Throwable -> La7
            throw r9     // Catch: java.lang.Throwable -> La7
        Le8:
            if (r0 == 0) goto Lf1
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2f
            r9.interrupt()     // Catch: java.lang.Throwable -> L2f
        Lf1:
            throw r10     // Catch: java.lang.Throwable -> L2f
        Lf2:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2f
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r11.<init>()     // Catch: java.lang.Throwable -> L2f
            r11.append(r10)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r10 = " is shutting down"
            r11.append(r10)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r10 = r11.toString()     // Catch: java.lang.Throwable -> L2f
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2f
            throw r9     // Catch: java.lang.Throwable -> L2f
        L109:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            throw r9
    }

    @androidx.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public static boolean registerGnssStatusCallback(@androidx.annotation.NonNull android.location.LocationManager r2, @androidx.annotation.NonNull androidx.core.location.GnssStatusCompat.Callback r3, @androidx.annotation.NonNull android.os.Handler r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lf
            java.util.concurrent.Executor r4 = androidx.core.os.ExecutorCompat.create(r4)
            boolean r2 = registerGnssStatusCallback(r2, r4, r3)
            return r2
        Lf:
            androidx.core.location.LocationManagerCompat$InlineHandlerExecutor r0 = new androidx.core.location.LocationManagerCompat$InlineHandlerExecutor
            r0.<init>(r4)
            boolean r2 = registerGnssStatusCallback(r2, r0, r3)
            return r2
    }

    @androidx.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public static boolean registerGnssStatusCallback(@androidx.annotation.NonNull android.location.LocationManager r2, @androidx.annotation.NonNull java.util.concurrent.Executor r3, @androidx.annotation.NonNull androidx.core.location.GnssStatusCompat.Callback r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lc
            r0 = 0
            boolean r2 = registerGnssStatusCallback(r2, r0, r3, r4)
            return r2
        Lc:
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 != 0) goto L16
            android.os.Looper r0 = android.os.Looper.getMainLooper()
        L16:
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r0)
            boolean r2 = registerGnssStatusCallback(r2, r1, r3, r4)
            return r2
    }

    @androidx.annotation.RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @androidx.annotation.GuardedBy("sLocationListeners")
    static void registerLocationListenerTransport(android.location.LocationManager r3, androidx.core.location.LocationManagerCompat.LocationListenerTransport r4) {
            java.util.WeakHashMap<androidx.core.location.LocationManagerCompat$LocationListenerKey, java.lang.ref.WeakReference<androidx.core.location.LocationManagerCompat$LocationListenerTransport>> r0 = androidx.core.location.LocationManagerCompat.sLocationListeners
            androidx.core.location.LocationManagerCompat$LocationListenerKey r1 = r4.getKey()
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r4)
            java.lang.Object r4 = r0.put(r1, r2)
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            if (r4 == 0) goto L1a
            java.lang.Object r4 = r4.get()
            androidx.core.location.LocationManagerCompat$LocationListenerTransport r4 = (androidx.core.location.LocationManagerCompat.LocationListenerTransport) r4
            goto L1b
        L1a:
            r4 = 0
        L1b:
            if (r4 == 0) goto L23
            r4.unregister()
            r3.removeUpdates(r4)
        L23:
            return
    }

    @androidx.annotation.RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void removeUpdates(@androidx.annotation.NonNull android.location.LocationManager r6, @androidx.annotation.NonNull androidx.core.location.LocationListenerCompat r7) {
            java.util.WeakHashMap<androidx.core.location.LocationManagerCompat$LocationListenerKey, java.lang.ref.WeakReference<androidx.core.location.LocationManagerCompat$LocationListenerTransport>> r0 = androidx.core.location.LocationManagerCompat.sLocationListeners
            monitor-enter(r0)
            java.util.Collection r1 = r0.values()     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L31
            r2 = 0
        Lc:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r3 == 0) goto L3d
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L31
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch: java.lang.Throwable -> L31
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L31
            androidx.core.location.LocationManagerCompat$LocationListenerTransport r3 = (androidx.core.location.LocationManagerCompat.LocationListenerTransport) r3     // Catch: java.lang.Throwable -> L31
            if (r3 != 0) goto L21
            goto Lc
        L21:
            androidx.core.location.LocationManagerCompat$LocationListenerKey r4 = r3.getKey()     // Catch: java.lang.Throwable -> L31
            androidx.core.location.LocationListenerCompat r5 = r4.mListener     // Catch: java.lang.Throwable -> L31
            if (r5 != r7) goto Lc
            if (r2 != 0) goto L33
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L31
            r2.<init>()     // Catch: java.lang.Throwable -> L31
            goto L33
        L31:
            r6 = move-exception
            goto L5a
        L33:
            r2.add(r4)     // Catch: java.lang.Throwable -> L31
            r3.unregister()     // Catch: java.lang.Throwable -> L31
            r6.removeUpdates(r3)     // Catch: java.lang.Throwable -> L31
            goto Lc
        L3d:
            if (r2 == 0) goto L55
            java.util.Iterator r1 = r2.iterator()     // Catch: java.lang.Throwable -> L31
        L43:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L55
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L31
            androidx.core.location.LocationManagerCompat$LocationListenerKey r2 = (androidx.core.location.LocationManagerCompat.LocationListenerKey) r2     // Catch: java.lang.Throwable -> L31
            java.util.WeakHashMap<androidx.core.location.LocationManagerCompat$LocationListenerKey, java.lang.ref.WeakReference<androidx.core.location.LocationManagerCompat$LocationListenerTransport>> r3 = androidx.core.location.LocationManagerCompat.sLocationListeners     // Catch: java.lang.Throwable -> L31
            r3.remove(r2)     // Catch: java.lang.Throwable -> L31
            goto L43
        L55:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            r6.removeUpdates(r7)
            return
        L5a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            throw r6
    }

    @androidx.annotation.RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void requestLocationUpdates(@androidx.annotation.NonNull android.location.LocationManager r8, @androidx.annotation.NonNull java.lang.String r9, @androidx.annotation.NonNull androidx.core.location.LocationRequestCompat r10, @androidx.annotation.NonNull androidx.core.location.LocationListenerCompat r11, @androidx.annotation.NonNull android.os.Looper r12) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L17
            android.location.LocationRequest r10 = r10.toLocationRequest()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r12)
            java.util.concurrent.Executor r12 = androidx.core.os.ExecutorCompat.create(r0)
            androidx.core.location.LocationManagerCompat.Api31Impl.requestLocationUpdates(r8, r9, r10, r12, r11)
            return
        L17:
            boolean r0 = androidx.core.location.LocationManagerCompat.Api19Impl.tryRequestLocationUpdates(r8, r9, r10, r11, r12)
            if (r0 == 0) goto L1e
            return
        L1e:
            long r3 = r10.getIntervalMillis()
            float r5 = r10.getMinUpdateDistanceMeters()
            r1 = r8
            r2 = r9
            r6 = r11
            r7 = r12
            r1.requestLocationUpdates(r2, r3, r5, r6, r7)
            return
    }

    @androidx.annotation.RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void requestLocationUpdates(@androidx.annotation.NonNull android.location.LocationManager r8, @androidx.annotation.NonNull java.lang.String r9, @androidx.annotation.NonNull androidx.core.location.LocationRequestCompat r10, @androidx.annotation.NonNull java.util.concurrent.Executor r11, @androidx.annotation.NonNull androidx.core.location.LocationListenerCompat r12) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Le
            android.location.LocationRequest r10 = r10.toLocationRequest()
            androidx.core.location.LocationManagerCompat.Api31Impl.requestLocationUpdates(r8, r9, r10, r11, r12)
            return
        Le:
            r1 = 30
            if (r0 < r1) goto L19
            boolean r0 = androidx.core.location.LocationManagerCompat.Api30Impl.tryRequestLocationUpdates(r8, r9, r10, r11, r12)
            if (r0 == 0) goto L19
            goto L29
        L19:
            androidx.core.location.LocationManagerCompat$LocationListenerTransport r6 = new androidx.core.location.LocationManagerCompat$LocationListenerTransport
            androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = new androidx.core.location.LocationManagerCompat$LocationListenerKey
            r0.<init>(r9, r12)
            r6.<init>(r0, r11)
            boolean r11 = androidx.core.location.LocationManagerCompat.Api19Impl.tryRequestLocationUpdates(r8, r9, r10, r6)
            if (r11 == 0) goto L2a
        L29:
            return
        L2a:
            java.util.WeakHashMap<androidx.core.location.LocationManagerCompat$LocationListenerKey, java.lang.ref.WeakReference<androidx.core.location.LocationManagerCompat$LocationListenerTransport>> r11 = androidx.core.location.LocationManagerCompat.sLocationListeners
            monitor-enter(r11)
            long r3 = r10.getIntervalMillis()     // Catch: java.lang.Throwable -> L43
            float r5 = r10.getMinUpdateDistanceMeters()     // Catch: java.lang.Throwable -> L43
            android.os.Looper r7 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L43
            r1 = r8
            r2 = r9
            r1.requestLocationUpdates(r2, r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L43
            registerLocationListenerTransport(r1, r6)     // Catch: java.lang.Throwable -> L43
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L43
            return
        L43:
            r0 = move-exception
            r8 = r0
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L43
            throw r8
    }

    @androidx.annotation.RequiresApi(24)
    public static void unregisterGnssMeasurementsCallback(@androidx.annotation.NonNull android.location.LocationManager r2, @androidx.annotation.NonNull android.location.GnssMeasurementsEvent.Callback r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto La
            androidx.core.location.LocationManagerCompat.Api24Impl.unregisterGnssMeasurementsCallback(r2, r3)
            return
        La:
            androidx.collection.SimpleArrayMap<android.location.GnssMeasurementsEvent$Callback, android.location.GnssMeasurementsEvent$Callback> r0 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssMeasurementListeners
            monitor-enter(r0)
            java.lang.Object r3 = r0.remove(r3)     // Catch: java.lang.Throwable -> L22
            android.location.GnssMeasurementsEvent$Callback r3 = androidx.core.location.n.a(r3)     // Catch: java.lang.Throwable -> L22
            if (r3 == 0) goto L27
            boolean r1 = r3 instanceof androidx.core.location.LocationManagerCompat.GnssMeasurementsTransport     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L24
            r1 = r3
            androidx.core.location.LocationManagerCompat$GnssMeasurementsTransport r1 = (androidx.core.location.LocationManagerCompat.GnssMeasurementsTransport) r1     // Catch: java.lang.Throwable -> L22
            r1.unregister()     // Catch: java.lang.Throwable -> L22
            goto L24
        L22:
            r2 = move-exception
            goto L29
        L24:
            androidx.core.location.LocationManagerCompat.Api24Impl.unregisterGnssMeasurementsCallback(r2, r3)     // Catch: java.lang.Throwable -> L22
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            return
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r2
    }

    public static void unregisterGnssStatusCallback(@androidx.annotation.NonNull android.location.LocationManager r2, @androidx.annotation.NonNull androidx.core.location.GnssStatusCompat.Callback r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L19
            androidx.collection.SimpleArrayMap<java.lang.Object, java.lang.Object> r0 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners
            monitor-enter(r0)
            java.lang.Object r3 = r0.remove(r3)     // Catch: java.lang.Throwable -> L13
            if (r3 == 0) goto L15
            androidx.core.location.LocationManagerCompat.Api24Impl.unregisterGnssStatusCallback(r2, r3)     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
        L19:
            androidx.collection.SimpleArrayMap<java.lang.Object, java.lang.Object> r0 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners
            monitor-enter(r0)
            java.lang.Object r3 = r0.remove(r3)     // Catch: java.lang.Throwable -> L2b
            androidx.core.location.LocationManagerCompat$GpsStatusTransport r3 = (androidx.core.location.LocationManagerCompat.GpsStatusTransport) r3     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L2d
            r3.unregister()     // Catch: java.lang.Throwable -> L2b
            r2.removeGpsStatusListener(r3)     // Catch: java.lang.Throwable -> L2b
            goto L2d
        L2b:
            r2 = move-exception
            goto L2f
        L2d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            return
        L2f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r2
    }
}
