package androidx.media;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class VolumeProviderCompat {
    public static final int VOLUME_CONTROL_ABSOLUTE = 2;
    public static final int VOLUME_CONTROL_FIXED = 0;
    public static final int VOLUME_CONTROL_RELATIVE = 1;
    private androidx.media.VolumeProviderCompat.Callback mCallback;
    private final int mControlType;
    private int mCurrentVolume;
    private final int mMaxVolume;
    private java.lang.Object mVolumeProviderObj;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class Callback {
        public Callback() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract void onVolumeChanged(androidx.media.VolumeProviderCompat r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ControlType {
    }

    public VolumeProviderCompat(int r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.mControlType = r1
            r0.mMaxVolume = r2
            r0.mCurrentVolume = r3
            return
    }

    public final int getCurrentVolume() {
            r1 = this;
            int r0 = r1.mCurrentVolume
            return r0
    }

    public final int getMaxVolume() {
            r1 = this;
            int r0 = r1.mMaxVolume
            return r0
    }

    public final int getVolumeControl() {
            r1 = this;
            int r0 = r1.mControlType
            return r0
    }

    public java.lang.Object getVolumeProvider() {
            r4 = this;
            java.lang.Object r0 = r4.mVolumeProviderObj
            if (r0 != 0) goto L15
            int r0 = r4.mControlType
            int r1 = r4.mMaxVolume
            int r2 = r4.mCurrentVolume
            androidx.media.VolumeProviderCompat$1 r3 = new androidx.media.VolumeProviderCompat$1
            r3.<init>(r4)
            java.lang.Object r0 = androidx.media.VolumeProviderCompatApi21.createVolumeProvider(r0, r1, r2, r3)
            r4.mVolumeProviderObj = r0
        L15:
            java.lang.Object r0 = r4.mVolumeProviderObj
            return r0
    }

    public void onAdjustVolume(int r1) {
            r0 = this;
            return
    }

    public void onSetVolumeTo(int r1) {
            r0 = this;
            return
    }

    public void setCallback(androidx.media.VolumeProviderCompat.Callback r1) {
            r0 = this;
            r0.mCallback = r1
            return
    }

    public final void setCurrentVolume(int r2) {
            r1 = this;
            r1.mCurrentVolume = r2
            java.lang.Object r0 = r1.getVolumeProvider()
            if (r0 == 0) goto Lb
            androidx.media.VolumeProviderCompatApi21.setCurrentVolume(r0, r2)
        Lb:
            androidx.media.VolumeProviderCompat$Callback r2 = r1.mCallback
            if (r2 == 0) goto L12
            r2.onVolumeChanged(r1)
        L12:
            return
    }
}
