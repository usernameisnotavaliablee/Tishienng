package androidx.camera.camera2.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class Camera2EncoderProfilesProvider implements androidx.camera.core.impl.EncoderProfilesProvider {
    private static final java.lang.String TAG = "Camera2EncoderProfilesProvider";
    private final java.lang.String mCameraId;
    private final java.util.Map<java.lang.Integer, androidx.camera.core.impl.EncoderProfilesProxy> mEncoderProfilesCache;
    private final boolean mHasValidCameraId;
    private final int mIntCameraId;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(31)
    static class Api31Impl {
        private Api31Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static android.media.EncoderProfiles getAll(java.lang.String r0, int r1) {
                android.media.EncoderProfiles r0 = android.media.CamcorderProfile.getAll(r0, r1)
                return r0
        }
    }

    public Camera2EncoderProfilesProvider(@androidx.annotation.NonNull java.lang.String r3) {
            r2 = this;
            r2.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.mEncoderProfilesCache = r0
            r2.mCameraId = r3
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L12
            r0 = 1
            goto L2f
        L12:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Camera id is not an integer: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = ", unable to create Camera2EncoderProfilesProvider"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "Camera2EncoderProfilesProvider"
            androidx.camera.core.Logger.w(r0, r3)
            r0 = 0
            r3 = -1
        L2f:
            r2.mHasValidCameraId = r0
            r2.mIntCameraId = r3
            return
    }

    @androidx.annotation.Nullable
    private androidx.camera.core.impl.EncoderProfilesProxy createProfilesFromCamcorderProfile(int r5) {
            r4 = this;
            r0 = 0
            int r1 = r4.mIntCameraId     // Catch: java.lang.RuntimeException -> L8
            android.media.CamcorderProfile r5 = android.media.CamcorderProfile.get(r1, r5)     // Catch: java.lang.RuntimeException -> L8
            goto L20
        L8:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unable to get CamcorderProfile by quality: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            java.lang.String r2 = "Camera2EncoderProfilesProvider"
            androidx.camera.core.Logger.w(r2, r5, r1)
            r5 = r0
        L20:
            if (r5 == 0) goto L26
            androidx.camera.core.impl.EncoderProfilesProxy r0 = androidx.camera.core.impl.compat.EncoderProfilesProxyCompat.from(r5)
        L26:
            return r0
    }

    @androidx.annotation.Nullable
    private androidx.camera.core.impl.EncoderProfilesProxy getProfilesInternal(int r4) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L2b
            java.lang.String r0 = r3.mCameraId
            android.media.EncoderProfiles r0 = androidx.camera.camera2.internal.Camera2EncoderProfilesProvider.Api31Impl.getAll(r0, r4)
            if (r0 != 0) goto L10
            r4 = 0
            return r4
        L10:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk> r1 = androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk.class
            androidx.camera.core.impl.Quirk r1 = androidx.camera.camera2.internal.compat.quirk.DeviceQuirks.get(r1)
            java.lang.String r2 = "Camera2EncoderProfilesProvider"
            if (r1 == 0) goto L20
            java.lang.String r0 = "EncoderProfiles contains invalid video profiles, use CamcorderProfile to create EncoderProfilesProxy."
            androidx.camera.core.Logger.d(r2, r0)
            goto L2b
        L20:
            androidx.camera.core.impl.EncoderProfilesProxy r4 = androidx.camera.core.impl.compat.EncoderProfilesProxyCompat.from(r0)     // Catch: java.lang.NullPointerException -> L25
            return r4
        L25:
            r0 = move-exception
            java.lang.String r1 = "Failed to create EncoderProfilesProxy, EncoderProfiles might  contain invalid video profiles. Use CamcorderProfile instead."
            androidx.camera.core.Logger.w(r2, r1, r0)
        L2b:
            androidx.camera.core.impl.EncoderProfilesProxy r4 = r3.createProfilesFromCamcorderProfile(r4)
            return r4
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    @androidx.annotation.Nullable
    public androidx.camera.core.impl.EncoderProfilesProxy getAll(int r3) {
            r2 = this;
            boolean r0 = r2.mHasValidCameraId
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r2.mIntCameraId
            boolean r0 = android.media.CamcorderProfile.hasProfile(r0, r3)
            if (r0 != 0) goto Lf
            return r1
        Lf:
            java.util.Map<java.lang.Integer, androidx.camera.core.impl.EncoderProfilesProxy> r0 = r2.mEncoderProfilesCache
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L28
            java.util.Map<java.lang.Integer, androidx.camera.core.impl.EncoderProfilesProxy> r0 = r2.mEncoderProfilesCache
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r0.get(r3)
            androidx.camera.core.impl.EncoderProfilesProxy r3 = (androidx.camera.core.impl.EncoderProfilesProxy) r3
            return r3
        L28:
            androidx.camera.core.impl.EncoderProfilesProxy r0 = r2.getProfilesInternal(r3)
            java.util.Map<java.lang.Integer, androidx.camera.core.impl.EncoderProfilesProxy> r1 = r2.mEncoderProfilesCache
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.put(r3, r0)
            return r0
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int r2) {
            r1 = this;
            boolean r0 = r1.mHasValidCameraId
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            int r0 = r1.mIntCameraId
            boolean r2 = android.media.CamcorderProfile.hasProfile(r0, r2)
            return r2
    }
}
