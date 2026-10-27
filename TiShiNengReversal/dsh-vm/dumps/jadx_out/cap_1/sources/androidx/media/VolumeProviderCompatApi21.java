package androidx.media;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class VolumeProviderCompatApi21 {


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Delegate {
        void onAdjustVolume(int r1);

        void onSetVolumeTo(int r1);
    }

    private VolumeProviderCompatApi21() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.Object createVolumeProvider(int r1, int r2, int r3, androidx.media.VolumeProviderCompatApi21.Delegate r4) {
            androidx.media.VolumeProviderCompatApi21$1 r0 = new androidx.media.VolumeProviderCompatApi21$1
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public static void setCurrentVolume(java.lang.Object r0, int r1) {
            android.media.VolumeProvider r0 = (android.media.VolumeProvider) r0
            r0.setCurrentVolume(r1)
            return
    }
}
