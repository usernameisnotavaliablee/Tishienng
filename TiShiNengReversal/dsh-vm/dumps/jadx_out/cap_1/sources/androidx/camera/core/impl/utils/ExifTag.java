package androidx.camera.core.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class ExifTag {
    public final java.lang.String name;
    public final int number;
    public final int primaryFormat;
    public final int secondaryFormat;

    ExifTag(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.name = r1
            r0.number = r2
            r0.primaryFormat = r3
            r1 = -1
            r0.secondaryFormat = r1
            return
    }

    ExifTag(java.lang.String r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.name = r1
            r0.number = r2
            r0.primaryFormat = r3
            r0.secondaryFormat = r4
            return
    }

    boolean isFormatCompatible(int r5) {
            r4 = this;
            int r0 = r4.primaryFormat
            r1 = 1
            r2 = 7
            if (r0 == r2) goto L31
            if (r5 != r2) goto L9
            goto L31
        L9:
            if (r0 == r5) goto L31
            int r2 = r4.secondaryFormat
            if (r2 != r5) goto L10
            goto L31
        L10:
            r3 = 4
            if (r0 == r3) goto L15
            if (r2 != r3) goto L19
        L15:
            r3 = 3
            if (r5 != r3) goto L19
            return r1
        L19:
            r3 = 9
            if (r0 == r3) goto L1f
            if (r2 != r3) goto L24
        L1f:
            r3 = 8
            if (r5 != r3) goto L24
            return r1
        L24:
            r3 = 12
            if (r0 == r3) goto L2a
            if (r2 != r3) goto L2f
        L2a:
            r0 = 11
            if (r5 != r0) goto L2f
            return r1
        L2f:
            r5 = 0
            return r5
        L31:
            return r1
    }
}
