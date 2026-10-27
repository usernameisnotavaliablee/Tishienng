package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class Camera2CaptureRequestBuilder {
    private static final java.lang.String TAG = "Camera2CaptureRequestBuilder";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(23)
    static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.hardware.camera2.CaptureRequest.Builder createReprocessCaptureRequest(@androidx.annotation.NonNull android.hardware.camera2.CameraDevice r0, @androidx.annotation.NonNull android.hardware.camera2.TotalCaptureResult r1) throws android.hardware.camera2.CameraAccessException {
                android.hardware.camera2.CaptureRequest$Builder r0 = r0.createReprocessCaptureRequest(r1)
                return r0
        }
    }

    private Camera2CaptureRequestBuilder() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.OptIn(markerClass = {androidx.camera.camera2.interop.ExperimentalCamera2Interop.class})
    private static void applyAeFpsRange(@androidx.annotation.NonNull androidx.camera.core.impl.CaptureConfig r3, @androidx.annotation.NonNull android.hardware.camera2.CaptureRequest.Builder r4) {
            androidx.camera.core.impl.Config r0 = r3.getImplementationOptions()
            androidx.camera.camera2.interop.CaptureRequestOptions$Builder r0 = androidx.camera.camera2.interop.CaptureRequestOptions.Builder.from(r0)
            androidx.camera.camera2.interop.CaptureRequestOptions r0 = r0.build()
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE
            androidx.camera.core.impl.Config$Option r2 = androidx.camera.camera2.impl.Camera2ImplConfig.createCaptureRequestOption(r1)
            boolean r0 = r0.containsOption(r2)
            if (r0 != 0) goto L2b
            android.util.Range r0 = r3.getExpectedFrameRateRange()
            android.util.Range<java.lang.Integer> r2 = androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L2b
            android.util.Range r3 = r3.getExpectedFrameRateRange()
            r4.set(r1, r3)
        L2b:
            return
    }

    @androidx.annotation.OptIn(markerClass = {androidx.camera.camera2.interop.ExperimentalCamera2Interop.class})
    private static void applyImplementationOptionToCaptureBuilder(android.hardware.camera2.CaptureRequest.Builder r4, androidx.camera.core.impl.Config r5) {
            androidx.camera.camera2.interop.CaptureRequestOptions$Builder r5 = androidx.camera.camera2.interop.CaptureRequestOptions.Builder.from(r5)
            androidx.camera.camera2.interop.CaptureRequestOptions r5 = r5.build()
            java.util.Set r0 = r5.listOptions()
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r0.next()
            androidx.camera.core.impl.Config$Option r1 = (androidx.camera.core.impl.Config.Option) r1
            java.lang.Object r2 = r1.getToken()
            android.hardware.camera2.CaptureRequest$Key r2 = (android.hardware.camera2.CaptureRequest.Key) r2
            java.lang.Object r1 = r5.retrieveOption(r1)     // Catch: java.lang.IllegalArgumentException -> L2a
            r4.set(r2, r1)     // Catch: java.lang.IllegalArgumentException -> L2a
            goto L10
        L2a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "CaptureRequest.Key is not supported: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "Camera2CaptureRequestBuilder"
            androidx.camera.core.Logger.e(r2, r1)
            goto L10
        L41:
            return
    }

    @androidx.annotation.Nullable
    public static android.hardware.camera2.CaptureRequest build(@androidx.annotation.NonNull androidx.camera.core.impl.CaptureConfig r4, @androidx.annotation.Nullable android.hardware.camera2.CameraDevice r5, @androidx.annotation.NonNull java.util.Map<androidx.camera.core.impl.DeferrableSurface, android.view.Surface> r6) throws android.hardware.camera2.CameraAccessException {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.util.List r1 = r4.getSurfaces()
            java.util.List r6 = getConfiguredSurfaces(r1, r6)
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L13
            return r0
        L13:
            androidx.camera.core.impl.CameraCaptureResult r0 = r4.getCameraCaptureResult()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            java.lang.String r3 = "Camera2CaptureRequestBuilder"
            if (r1 < r2) goto L40
            int r1 = r4.getTemplateType()
            r2 = 5
            if (r1 != r2) goto L40
            if (r0 == 0) goto L40
            android.hardware.camera2.CaptureResult r1 = r0.getCaptureResult()
            boolean r1 = r1 instanceof android.hardware.camera2.TotalCaptureResult
            if (r1 == 0) goto L40
            java.lang.String r1 = "createReprocessCaptureRequest"
            androidx.camera.core.Logger.d(r3, r1)
            android.hardware.camera2.CaptureResult r0 = r0.getCaptureResult()
            android.hardware.camera2.TotalCaptureResult r0 = (android.hardware.camera2.TotalCaptureResult) r0
            android.hardware.camera2.CaptureRequest$Builder r5 = androidx.camera.camera2.internal.Camera2CaptureRequestBuilder.Api23Impl.createReprocessCaptureRequest(r5, r0)
            goto L4d
        L40:
            java.lang.String r0 = "createCaptureRequest"
            androidx.camera.core.Logger.d(r3, r0)
            int r0 = r4.getTemplateType()
            android.hardware.camera2.CaptureRequest$Builder r5 = r5.createCaptureRequest(r0)
        L4d:
            androidx.camera.core.impl.Config r0 = r4.getImplementationOptions()
            applyImplementationOptionToCaptureBuilder(r5, r0)
            applyAeFpsRange(r4, r5)
            androidx.camera.core.impl.Config r0 = r4.getImplementationOptions()
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r1 = androidx.camera.core.impl.CaptureConfig.OPTION_ROTATION
            boolean r0 = r0.containsOption(r1)
            if (r0 == 0) goto L72
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.JPEG_ORIENTATION
            androidx.camera.core.impl.Config r2 = r4.getImplementationOptions()
            java.lang.Object r1 = r2.retrieveOption(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r5.set(r0, r1)
        L72:
            androidx.camera.core.impl.Config r0 = r4.getImplementationOptions()
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r1 = androidx.camera.core.impl.CaptureConfig.OPTION_JPEG_QUALITY
            boolean r0 = r0.containsOption(r1)
            if (r0 == 0) goto L95
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.JPEG_QUALITY
            androidx.camera.core.impl.Config r2 = r4.getImplementationOptions()
            java.lang.Object r1 = r2.retrieveOption(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            byte r1 = r1.byteValue()
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            r5.set(r0, r1)
        L95:
            java.util.Iterator r6 = r6.iterator()
        L99:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto La9
            java.lang.Object r0 = r6.next()
            android.view.Surface r0 = (android.view.Surface) r0
            r5.addTarget(r0)
            goto L99
        La9:
            androidx.camera.core.impl.TagBundle r4 = r4.getTagBundle()
            r5.setTag(r4)
            android.hardware.camera2.CaptureRequest r4 = r5.build()
            return r4
    }

    @androidx.annotation.Nullable
    public static android.hardware.camera2.CaptureRequest buildWithoutTarget(@androidx.annotation.NonNull androidx.camera.core.impl.CaptureConfig r1, @androidx.annotation.Nullable android.hardware.camera2.CameraDevice r2) throws android.hardware.camera2.CameraAccessException {
            if (r2 != 0) goto L4
            r1 = 0
            return r1
        L4:
            int r0 = r1.getTemplateType()
            android.hardware.camera2.CaptureRequest$Builder r2 = r2.createCaptureRequest(r0)
            androidx.camera.core.impl.Config r1 = r1.getImplementationOptions()
            applyImplementationOptionToCaptureBuilder(r2, r1)
            android.hardware.camera2.CaptureRequest r1 = r2.build()
            return r1
    }

    @androidx.annotation.NonNull
    private static java.util.List<android.view.Surface> getConfiguredSurfaces(java.util.List<androidx.camera.core.impl.DeferrableSurface> r2, java.util.Map<androidx.camera.core.impl.DeferrableSurface, android.view.Surface> r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L9:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r2.next()
            androidx.camera.core.impl.DeferrableSurface r1 = (androidx.camera.core.impl.DeferrableSurface) r1
            java.lang.Object r1 = r3.get(r1)
            android.view.Surface r1 = (android.view.Surface) r1
            if (r1 == 0) goto L21
            r0.add(r1)
            goto L9
        L21:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "DeferrableSurface not in configuredSurfaceMap"
            r2.<init>(r3)
            throw r2
        L29:
            return r0
    }
}
