package androidx.camera.core.internal.compat.quirk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class IncorrectJpegMetadataQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.util.Set<java.lang.String> SAMSUNG_DEVICES = null;

    static {
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r1 = "A24"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk.SAMSUNG_DEVICES = r0
            return
    }

    public IncorrectJpegMetadataQuirk() {
            r0 = this;
            r0.<init>()
            return
    }

    private boolean canParseSosMarker(@androidx.annotation.NonNull byte[] r5) {
            r4 = this;
            r0 = 2
            r1 = 2
        L2:
            int r2 = r1 + 4
            int r3 = r5.length
            if (r2 > r3) goto L2b
            r2 = r5[r1]
            r3 = -1
            if (r2 == r3) goto Ld
            goto L2b
        Ld:
            if (r2 != r3) goto L19
            int r2 = r1 + 1
            r2 = r5[r2]
            r3 = -38
            if (r2 != r3) goto L19
            r5 = 1
            return r5
        L19:
            int r2 = r1 + 2
            r2 = r5[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            int r3 = r1 + 3
            r3 = r5[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r2 = r2 | r3
            int r2 = r2 + r0
            int r1 = r1 + r2
            goto L2
        L2b:
            r5 = 0
            return r5
    }

    private int findSecondFfd8Position(@androidx.annotation.NonNull byte[] r5) {
            r4 = this;
            r0 = 2
        L1:
            int r1 = r0 + 1
            int r2 = r5.length
            r3 = -1
            if (r1 <= r2) goto L8
            return r3
        L8:
            r2 = r5[r0]
            if (r2 != r3) goto L13
            r2 = r5[r1]
            r3 = -40
            if (r2 != r3) goto L13
            return r0
        L13:
            r0 = r1
            goto L1
    }

    private static boolean isSamsungProblematicDevice() {
            java.lang.String r0 = "Samsung"
            java.lang.String r1 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L1c
            java.util.Set<java.lang.String> r0 = androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk.SAMSUNG_DEVICES
            java.lang.String r1 = android.os.Build.DEVICE
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r1 = r1.toUpperCase(r2)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L1c
            r0 = 1
            return r0
        L1c:
            r0 = 0
            return r0
    }

    static boolean load() {
            boolean r0 = isSamsungProblematicDevice()
            return r0
    }

    @androidx.annotation.NonNull
    public byte[] jpegImageToJpegByteArray(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r4) {
            r3 = this;
            androidx.camera.core.ImageProxy$PlaneProxy[] r4 = r4.getPlanes()
            r0 = 0
            r4 = r4[r0]
            java.nio.ByteBuffer r4 = r4.getBuffer()
            int r1 = r4.capacity()
            byte[] r1 = new byte[r1]
            r4.rewind()
            r4.get(r1)
            boolean r2 = r3.canParseSosMarker(r1)
            if (r2 != 0) goto L26
            int r0 = r3.findSecondFfd8Position(r1)
            r2 = -1
            if (r0 == r2) goto L25
            goto L26
        L25:
            return r1
        L26:
            int r4 = r4.limit()
            byte[] r4 = java.util.Arrays.copyOfRange(r1, r0, r4)
            return r4
    }
}
