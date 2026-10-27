package androidx.camera.core.internal.compat.workaround;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class InvalidJpegDataParser {
    private final boolean mHasQuirk;

    public InvalidJpegDataParser() {
            r1 = this;
            r1.<init>()
            java.lang.Class<androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk> r0 = androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk.class
            androidx.camera.core.impl.Quirk r0 = androidx.camera.core.internal.compat.quirk.DeviceQuirks.get(r0)
            if (r0 == 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            r1.mHasQuirk = r0
            return
    }

    public int getValidDataLength(@androidx.annotation.NonNull byte[] r8) {
            r7 = this;
            boolean r0 = r7.mHasQuirk
            if (r0 != 0) goto L6
            int r8 = r8.length
            return r8
        L6:
            r0 = 2
            r1 = 2
        L8:
            int r2 = r1 + 4
            int r3 = r8.length
            if (r2 > r3) goto L46
            r2 = r8[r1]
            r3 = -1
            if (r2 == r3) goto L13
            goto L46
        L13:
            int r4 = r1 + 2
            r5 = r8[r4]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 8
            int r6 = r1 + 3
            r6 = r8[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r5 = r5 | r6
            if (r2 != r3) goto L43
            int r2 = r1 + 1
            r2 = r8[r2]
            r6 = -38
            if (r2 != r6) goto L43
        L2c:
            int r0 = r4 + 2
            int r1 = r8.length
            if (r0 <= r1) goto L33
            int r8 = r8.length
            return r8
        L33:
            r1 = r8[r4]
            if (r1 != r3) goto L40
            int r1 = r4 + 1
            r1 = r8[r1]
            r2 = -39
            if (r1 != r2) goto L40
            return r0
        L40:
            int r4 = r4 + 1
            goto L2c
        L43:
            int r5 = r5 + r0
            int r1 = r1 + r5
            goto L8
        L46:
            int r8 = r8.length
            return r8
    }
}
