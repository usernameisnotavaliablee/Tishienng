package androidx.camera.core.internal.compat.workaround;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class JpegMetadataCorrector {
    private final androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk mQuirk;

    public JpegMetadataCorrector(@androidx.annotation.NonNull androidx.camera.core.impl.Quirks r2) {
            r1 = this;
            r1.<init>()
            java.lang.Class<androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk> r0 = androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk.class
            androidx.camera.core.impl.Quirk r2 = r2.get(r0)
            androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk r2 = (androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk) r2
            r1.mQuirk = r2
            return
    }

    @androidx.annotation.NonNull
    public byte[] jpegImageToJpegByteArray(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r2) {
            r1 = this;
            androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk r0 = r1.mQuirk
            if (r0 != 0) goto L1c
            androidx.camera.core.ImageProxy$PlaneProxy[] r2 = r2.getPlanes()
            r0 = 0
            r2 = r2[r0]
            java.nio.ByteBuffer r2 = r2.getBuffer()
            int r0 = r2.capacity()
            byte[] r0 = new byte[r0]
            r2.rewind()
            r2.get(r0)
            return r0
        L1c:
            byte[] r2 = r0.jpegImageToJpegByteArray(r2)
            return r2
    }

    public boolean needCorrectJpegMetadata() {
            r1 = this;
            androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk r0 = r1.mQuirk
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }
}
