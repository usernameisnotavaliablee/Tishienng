package androidx.core.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ActivityCompat extends androidx.core.content.ContextCompat {
    private static androidx.core.app.ActivityCompat.PermissionCompatDelegate sDelegate;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static void finishAfterTransition(android.app.Activity r0) {
                r0.finishAfterTransition()
                return
        }

        @androidx.annotation.DoNotInline
        static void postponeEnterTransition(android.app.Activity r0) {
                r0.postponeEnterTransition()
                return
        }

        @androidx.annotation.DoNotInline
        static void setEnterSharedElementCallback(android.app.Activity r0, android.app.SharedElementCallback r1) {
                r0.setEnterSharedElementCallback(r1)
                return
        }

        @androidx.annotation.DoNotInline
        static void setExitSharedElementCallback(android.app.Activity r0, android.app.SharedElementCallback r1) {
                r0.setExitSharedElementCallback(r1)
                return
        }

        @androidx.annotation.DoNotInline
        static void startPostponedEnterTransition(android.app.Activity r0) {
                r0.startPostponedEnterTransition()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(22)
    static class Api22Impl {
        private Api22Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.net.Uri getReferrer(android.app.Activity r0) {
                android.net.Uri r0 = r0.getReferrer()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(23)
    static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static void onSharedElementsReady(java.lang.Object r0) {
                android.app.SharedElementCallback$OnSharedElementsReadyListener r0 = (android.app.SharedElementCallback.OnSharedElementsReadyListener) r0
                r0.onSharedElementsReady()
                return
        }

        @androidx.annotation.DoNotInline
        static void requestPermissions(android.app.Activity r0, java.lang.String[] r1, int r2) {
                r0.requestPermissions(r1, r2)
                return
        }

        @androidx.annotation.DoNotInline
        static boolean shouldShowRequestPermissionRationale(android.app.Activity r0, java.lang.String r1) {
                boolean r0 = r0.shouldShowRequestPermissionRationale(r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(28)
    static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static <T> T requireViewById(android.app.Activity r0, int r1) {
                android.view.View r0 = r0.requireViewById(r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(30)
    static class Api30Impl {
        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.view.Display getDisplay(android.content.ContextWrapper r0) {
                android.view.Display r0 = r0.getDisplay()
                return r0
        }

        @androidx.annotation.DoNotInline
        static void setLocusContext(@androidx.annotation.NonNull android.app.Activity r0, @androidx.annotation.Nullable androidx.core.content.LocusIdCompat r1, @androidx.annotation.Nullable android.os.Bundle r2) {
                if (r1 != 0) goto L4
                r1 = 0
                goto L8
            L4:
                android.content.LocusId r1 = r1.toLocusId()
            L8:
                r0.setLocusContext(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(31)
    static class Api31Impl {
        private Api31Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static boolean isLaunchedFromBubble(@androidx.annotation.NonNull android.app.Activity r0) {
                boolean r0 = r0.isLaunchedFromBubble()
                return r0
        }

        @androidx.annotation.DoNotInline
        @android.annotation.SuppressLint({"BanUncheckedReflection"})
        static boolean shouldShowRequestPermissionRationale(android.app.Activity r7, java.lang.String r8) {
                android.app.Application r0 = r7.getApplication()     // Catch: java.lang.Throwable -> L27
                android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L27
                java.lang.Class<android.content.pm.PackageManager> r1 = android.content.pm.PackageManager.class
                java.lang.String r2 = "shouldShowRequestPermissionRationale"
                r3 = 1
                java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L27
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r6 = 0
                r4[r6] = r5     // Catch: java.lang.Throwable -> L27
                java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch: java.lang.Throwable -> L27
                java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L27
                r2[r6] = r8     // Catch: java.lang.Throwable -> L27
                java.lang.Object r0 = r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L27
                java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L27
                boolean r7 = r0.booleanValue()     // Catch: java.lang.Throwable -> L27
                return r7
            L27:
                boolean r7 = r7.shouldShowRequestPermissionRationale(r8)
                return r7
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(32)
    static class Api32Impl {
        private Api32Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static boolean shouldShowRequestPermissionRationale(android.app.Activity r0, java.lang.String r1) {
                boolean r0 = r0.shouldShowRequestPermissionRationale(r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnRequestPermissionsResultCallback {
        void onRequestPermissionsResult(int r1, @androidx.annotation.NonNull java.lang.String[] r2, @androidx.annotation.NonNull int[] r3);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface PermissionCompatDelegate {
        boolean onActivityResult(@androidx.annotation.NonNull android.app.Activity r1, @androidx.annotation.IntRange(from = 0) int r2, int r3, @androidx.annotation.Nullable android.content.Intent r4);

        boolean requestPermissions(@androidx.annotation.NonNull android.app.Activity r1, @androidx.annotation.NonNull java.lang.String[] r2, @androidx.annotation.IntRange(from = 0) int r3);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface RequestPermissionsRequestCodeValidator {
        void validateRequestPermissionsRequestCode(int r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(21)
    static class SharedElementCallback21Impl extends android.app.SharedElementCallback {
        private final androidx.core.app.SharedElementCallback mCallback;

        SharedElementCallback21Impl(androidx.core.app.SharedElementCallback r1) {
                r0 = this;
                r0.<init>()
                r0.mCallback = r1
                return
        }

        public static /* synthetic */ void a(android.app.SharedElementCallback.OnSharedElementsReadyListener r0) {
                androidx.core.app.ActivityCompat.Api23Impl.onSharedElementsReady(r0)
                return
        }

        @Override // android.app.SharedElementCallback
        public android.os.Parcelable onCaptureSharedElementSnapshot(android.view.View r2, android.graphics.Matrix r3, android.graphics.RectF r4) {
                r1 = this;
                androidx.core.app.SharedElementCallback r0 = r1.mCallback
                android.os.Parcelable r2 = r0.onCaptureSharedElementSnapshot(r2, r3, r4)
                return r2
        }

        @Override // android.app.SharedElementCallback
        public android.view.View onCreateSnapshotView(android.content.Context r2, android.os.Parcelable r3) {
                r1 = this;
                androidx.core.app.SharedElementCallback r0 = r1.mCallback
                android.view.View r2 = r0.onCreateSnapshotView(r2, r3)
                return r2
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(java.util.List<java.lang.String> r2, java.util.Map<java.lang.String, android.view.View> r3) {
                r1 = this;
                androidx.core.app.SharedElementCallback r0 = r1.mCallback
                r0.onMapSharedElements(r2, r3)
                return
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(java.util.List<android.view.View> r2) {
                r1 = this;
                androidx.core.app.SharedElementCallback r0 = r1.mCallback
                r0.onRejectSharedElements(r2)
                return
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(java.util.List<java.lang.String> r2, java.util.List<android.view.View> r3, java.util.List<android.view.View> r4) {
                r1 = this;
                androidx.core.app.SharedElementCallback r0 = r1.mCallback
                r0.onSharedElementEnd(r2, r3, r4)
                return
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(java.util.List<java.lang.String> r2, java.util.List<android.view.View> r3, java.util.List<android.view.View> r4) {
                r1 = this;
                androidx.core.app.SharedElementCallback r0 = r1.mCallback
                r0.onSharedElementStart(r2, r3, r4)
                return
        }

        @Override // android.app.SharedElementCallback
        @androidx.annotation.RequiresApi(23)
        public void onSharedElementsArrived(java.util.List<java.lang.String> r3, java.util.List<android.view.View> r4, android.app.SharedElementCallback.OnSharedElementsReadyListener r5) {
                r2 = this;
                androidx.core.app.SharedElementCallback r0 = r2.mCallback
                androidx.core.app.b r1 = new androidx.core.app.b
                r1.<init>(r5)
                r0.onSharedElementsArrived(r3, r4, r1)
                return
        }
    }

    protected ActivityCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void a(android.app.Activity r1) {
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto Lf
            boolean r0 = androidx.core.app.ActivityRecreator.recreate(r1)
            if (r0 != 0) goto Lf
            r1.recreate()
        Lf:
            return
    }

    public static void finishAffinity(@androidx.annotation.NonNull android.app.Activity r0) {
            r0.finishAffinity()
            return
    }

    public static void finishAfterTransition(@androidx.annotation.NonNull android.app.Activity r0) {
            androidx.core.app.ActivityCompat.Api21Impl.finishAfterTransition(r0)
            return
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static androidx.core.app.ActivityCompat.PermissionCompatDelegate getPermissionCompatDelegate() {
            androidx.core.app.ActivityCompat$PermissionCompatDelegate r0 = androidx.core.app.ActivityCompat.sDelegate
            return r0
    }

    @androidx.annotation.Nullable
    public static android.net.Uri getReferrer(@androidx.annotation.NonNull android.app.Activity r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 22
            if (r0 < r1) goto Lb
            android.net.Uri r2 = androidx.core.app.ActivityCompat.Api22Impl.getReferrer(r2)
            return r2
        Lb:
            android.content.Intent r2 = r2.getIntent()
            java.lang.String r0 = "android.intent.extra.REFERRER"
            android.os.Parcelable r0 = r2.getParcelableExtra(r0)
            android.net.Uri r0 = (android.net.Uri) r0
            if (r0 == 0) goto L1a
            return r0
        L1a:
            java.lang.String r0 = "android.intent.extra.REFERRER_NAME"
            java.lang.String r2 = r2.getStringExtra(r0)
            if (r2 == 0) goto L27
            android.net.Uri r2 = android.net.Uri.parse(r2)
            return r2
        L27:
            r2 = 0
            return r2
    }

    @java.lang.Deprecated
    public static boolean invalidateOptionsMenu(android.app.Activity r0) {
            r0.invalidateOptionsMenu()
            r0 = 1
            return r0
    }

    public static boolean isLaunchedFromBubble(@androidx.annotation.NonNull android.app.Activity r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lb
            boolean r4 = androidx.core.app.ActivityCompat.Api31Impl.isLaunchedFromBubble(r4)
            return r4
        Lb:
            r1 = 30
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L23
            android.view.Display r0 = androidx.core.app.ActivityCompat.Api30Impl.getDisplay(r4)
            if (r0 == 0) goto L22
            android.view.Display r4 = androidx.core.app.ActivityCompat.Api30Impl.getDisplay(r4)
            int r4 = r4.getDisplayId()
            if (r4 == 0) goto L22
            return r2
        L22:
            return r3
        L23:
            r1 = 29
            if (r0 != r1) goto L40
            android.view.WindowManager r0 = r4.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            if (r0 == 0) goto L40
            android.view.WindowManager r4 = r4.getWindowManager()
            android.view.Display r4 = r4.getDefaultDisplay()
            int r4 = r4.getDisplayId()
            if (r4 == 0) goto L40
            return r2
        L40:
            return r3
    }

    public static void postponeEnterTransition(@androidx.annotation.NonNull android.app.Activity r0) {
            androidx.core.app.ActivityCompat.Api21Impl.postponeEnterTransition(r0)
            return
    }

    public static void recreate(@androidx.annotation.NonNull android.app.Activity r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto La
            r2.recreate()
            return
        La:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = r2.getMainLooper()
            r0.<init>(r1)
            androidx.core.app.a r1 = new androidx.core.app.a
            r1.<init>(r2)
            r0.post(r1)
            return
    }

    @androidx.annotation.Nullable
    public static androidx.core.view.DragAndDropPermissionsCompat requestDragAndDropPermissions(@androidx.annotation.NonNull android.app.Activity r0, @androidx.annotation.NonNull android.view.DragEvent r1) {
            androidx.core.view.DragAndDropPermissionsCompat r0 = androidx.core.view.DragAndDropPermissionsCompat.request(r0, r1)
            return r0
    }

    public static void requestPermissions(@androidx.annotation.NonNull android.app.Activity r6, @androidx.annotation.NonNull java.lang.String[] r7, @androidx.annotation.IntRange(from = 0) int r8) {
            com.stub.StubApp.interface24(r6, r7, r8)
            androidx.core.app.ActivityCompat$PermissionCompatDelegate r0 = androidx.core.app.ActivityCompat.sDelegate
            if (r0 == 0) goto Lf
            boolean r0 = r0.requestPermissions(r6, r7, r8)
            if (r0 == 0) goto Lf
            goto Lae
        Lf:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1 = 0
            r2 = 0
        L16:
            int r3 = r7.length
            if (r2 >= r3) goto L5b
            r3 = r7[r2]
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L3b
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 33
            if (r3 >= r4) goto L38
            r3 = r7[r2]
            java.lang.String r4 = "android.permission.POST_NOTIFICATIONS"
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 == 0) goto L38
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.add(r3)
        L38:
            int r2 = r2 + 1
            goto L16
        L3b:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Permission request for permissions "
            r8.append(r0)
            java.lang.String r7 = java.util.Arrays.toString(r7)
            r8.append(r7)
            java.lang.String r7 = " must not contain null or empty values"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r6.<init>(r7)
            throw r6
        L5b:
            int r2 = r0.size()
            if (r2 <= 0) goto L66
            int r3 = r7.length
            int r3 = r3 - r2
            java.lang.String[] r3 = new java.lang.String[r3]
            goto L67
        L66:
            r3 = r7
        L67:
            if (r2 <= 0) goto L85
            int r4 = r7.length
            if (r2 != r4) goto L6d
            goto Lae
        L6d:
            r2 = 0
        L6e:
            int r4 = r7.length
            if (r1 >= r4) goto L85
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            boolean r4 = r0.contains(r4)
            if (r4 != 0) goto L82
            int r4 = r2 + 1
            r5 = r7[r1]
            r3[r2] = r5
            r2 = r4
        L82:
            int r1 = r1 + 1
            goto L6e
        L85:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L99
            boolean r0 = r6 instanceof androidx.core.app.ActivityCompat.RequestPermissionsRequestCodeValidator
            if (r0 == 0) goto L95
            r0 = r6
            androidx.core.app.ActivityCompat$RequestPermissionsRequestCodeValidator r0 = (androidx.core.app.ActivityCompat.RequestPermissionsRequestCodeValidator) r0
            r0.validateRequestPermissionsRequestCode(r8)
        L95:
            androidx.core.app.ActivityCompat.Api23Impl.requestPermissions(r6, r7, r8)
            return
        L99:
            boolean r7 = r6 instanceof androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
            if (r7 == 0) goto Lae
            android.os.Handler r7 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r7.<init>(r0)
            androidx.core.app.ActivityCompat$1 r0 = new androidx.core.app.ActivityCompat$1
            r0.<init>(r3, r6, r8)
            r7.post(r0)
        Lae:
            return
    }

    @androidx.annotation.NonNull
    public static <T extends android.view.View> T requireViewById(@androidx.annotation.NonNull android.app.Activity r2, @androidx.annotation.IdRes int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            java.lang.Object r2 = androidx.core.app.ActivityCompat.Api28Impl.requireViewById(r2, r3)
            android.view.View r2 = (android.view.View) r2
            return r2
        Ld:
            android.view.View r2 = r2.findViewById(r3)
            if (r2 == 0) goto L14
            return r2
        L14:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "ID does not reference a View inside this Activity"
            r2.<init>(r3)
            throw r2
    }

    public static void setEnterSharedElementCallback(@androidx.annotation.NonNull android.app.Activity r1, @androidx.annotation.Nullable androidx.core.app.SharedElementCallback r2) {
            if (r2 == 0) goto L8
            androidx.core.app.ActivityCompat$SharedElementCallback21Impl r0 = new androidx.core.app.ActivityCompat$SharedElementCallback21Impl
            r0.<init>(r2)
            goto L9
        L8:
            r0 = 0
        L9:
            androidx.core.app.ActivityCompat.Api21Impl.setEnterSharedElementCallback(r1, r0)
            return
    }

    public static void setExitSharedElementCallback(@androidx.annotation.NonNull android.app.Activity r1, @androidx.annotation.Nullable androidx.core.app.SharedElementCallback r2) {
            if (r2 == 0) goto L8
            androidx.core.app.ActivityCompat$SharedElementCallback21Impl r0 = new androidx.core.app.ActivityCompat$SharedElementCallback21Impl
            r0.<init>(r2)
            goto L9
        L8:
            r0 = 0
        L9:
            androidx.core.app.ActivityCompat.Api21Impl.setExitSharedElementCallback(r1, r0)
            return
    }

    public static void setLocusContext(@androidx.annotation.NonNull android.app.Activity r2, @androidx.annotation.Nullable androidx.core.content.LocusIdCompat r3, @androidx.annotation.Nullable android.os.Bundle r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L9
            androidx.core.app.ActivityCompat.Api30Impl.setLocusContext(r2, r3, r4)
        L9:
            return
    }

    public static void setPermissionCompatDelegate(@androidx.annotation.Nullable androidx.core.app.ActivityCompat.PermissionCompatDelegate r0) {
            androidx.core.app.ActivityCompat.sDelegate = r0
            return
    }

    public static boolean shouldShowRequestPermissionRationale(@androidx.annotation.NonNull android.app.Activity r3, @androidx.annotation.NonNull java.lang.String r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            r2 = 0
            if (r0 >= r1) goto L10
            java.lang.String r1 = "android.permission.POST_NOTIFICATIONS"
            boolean r1 = android.text.TextUtils.equals(r1, r4)
            if (r1 == 0) goto L10
            return r2
        L10:
            r1 = 32
            if (r0 < r1) goto L19
            boolean r3 = androidx.core.app.ActivityCompat.Api32Impl.shouldShowRequestPermissionRationale(r3, r4)
            return r3
        L19:
            r1 = 31
            if (r0 != r1) goto L22
            boolean r3 = androidx.core.app.ActivityCompat.Api31Impl.shouldShowRequestPermissionRationale(r3, r4)
            return r3
        L22:
            r1 = 23
            if (r0 < r1) goto L2b
            boolean r3 = androidx.core.app.ActivityCompat.Api23Impl.shouldShowRequestPermissionRationale(r3, r4)
            return r3
        L2b:
            return r2
    }

    public static void startActivityForResult(@androidx.annotation.NonNull android.app.Activity r0, @androidx.annotation.NonNull android.content.Intent r1, int r2, @androidx.annotation.Nullable android.os.Bundle r3) {
            r0.startActivityForResult(r1, r2, r3)
            return
    }

    public static void startIntentSenderForResult(@androidx.annotation.NonNull android.app.Activity r0, @androidx.annotation.NonNull android.content.IntentSender r1, int r2, @androidx.annotation.Nullable android.content.Intent r3, int r4, int r5, int r6, @androidx.annotation.Nullable android.os.Bundle r7) throws android.content.IntentSender.SendIntentException {
            r0.startIntentSenderForResult(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void startPostponedEnterTransition(@androidx.annotation.NonNull android.app.Activity r0) {
            androidx.core.app.ActivityCompat.Api21Impl.startPostponedEnterTransition(r0)
            return
    }
}
