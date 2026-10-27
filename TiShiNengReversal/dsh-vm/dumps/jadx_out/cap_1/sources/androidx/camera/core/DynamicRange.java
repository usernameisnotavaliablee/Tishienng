package androidx.camera.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class DynamicRange {
    public static final int BIT_DEPTH_10_BIT = 10;
    public static final int BIT_DEPTH_8_BIT = 8;
    public static final int BIT_DEPTH_UNSPECIFIED = 0;

    @androidx.annotation.NonNull
    public static final androidx.camera.core.DynamicRange DOLBY_VISION_10_BIT = null;

    @androidx.annotation.NonNull
    public static final androidx.camera.core.DynamicRange DOLBY_VISION_8_BIT = null;
    public static final int ENCODING_DOLBY_VISION = 6;
    public static final int ENCODING_HDR10 = 4;
    public static final int ENCODING_HDR10_PLUS = 5;
    public static final int ENCODING_HDR_UNSPECIFIED = 2;
    public static final int ENCODING_HLG = 3;
    public static final int ENCODING_SDR = 1;
    public static final int ENCODING_UNSPECIFIED = 0;

    @androidx.annotation.NonNull
    public static final androidx.camera.core.DynamicRange HDR10_10_BIT = null;

    @androidx.annotation.NonNull
    public static final androidx.camera.core.DynamicRange HDR10_PLUS_10_BIT = null;

    @androidx.annotation.NonNull
    public static final androidx.camera.core.DynamicRange HDR_UNSPECIFIED_10_BIT = null;

    @androidx.annotation.NonNull
    public static final androidx.camera.core.DynamicRange HLG_10_BIT = null;

    @androidx.annotation.NonNull
    public static final androidx.camera.core.DynamicRange SDR = null;

    @androidx.annotation.NonNull
    public static final androidx.camera.core.DynamicRange UNSPECIFIED = null;
    private final int mBitDepth;
    private final int mEncoding;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public @interface BitDepth {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public @interface DynamicRangeEncoding {
    }

    static {
            androidx.camera.core.DynamicRange r0 = new androidx.camera.core.DynamicRange
            r1 = 0
            r0.<init>(r1, r1)
            androidx.camera.core.DynamicRange.UNSPECIFIED = r0
            androidx.camera.core.DynamicRange r0 = new androidx.camera.core.DynamicRange
            r1 = 1
            r2 = 8
            r0.<init>(r1, r2)
            androidx.camera.core.DynamicRange.SDR = r0
            androidx.camera.core.DynamicRange r0 = new androidx.camera.core.DynamicRange
            r1 = 2
            r3 = 10
            r0.<init>(r1, r3)
            androidx.camera.core.DynamicRange.HDR_UNSPECIFIED_10_BIT = r0
            androidx.camera.core.DynamicRange r0 = new androidx.camera.core.DynamicRange
            r1 = 3
            r0.<init>(r1, r3)
            androidx.camera.core.DynamicRange.HLG_10_BIT = r0
            androidx.camera.core.DynamicRange r0 = new androidx.camera.core.DynamicRange
            r1 = 4
            r0.<init>(r1, r3)
            androidx.camera.core.DynamicRange.HDR10_10_BIT = r0
            androidx.camera.core.DynamicRange r0 = new androidx.camera.core.DynamicRange
            r1 = 5
            r0.<init>(r1, r3)
            androidx.camera.core.DynamicRange.HDR10_PLUS_10_BIT = r0
            androidx.camera.core.DynamicRange r0 = new androidx.camera.core.DynamicRange
            r1 = 6
            r0.<init>(r1, r3)
            androidx.camera.core.DynamicRange.DOLBY_VISION_10_BIT = r0
            androidx.camera.core.DynamicRange r0 = new androidx.camera.core.DynamicRange
            r0.<init>(r1, r2)
            androidx.camera.core.DynamicRange.DOLBY_VISION_8_BIT = r0
            return
    }

    public DynamicRange(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.mEncoding = r1
            r0.mBitDepth = r2
            return
    }

    @androidx.annotation.NonNull
    private static java.lang.String getEncodingLabel(int r0) {
            switch(r0) {
                case 0: goto L18;
                case 1: goto L15;
                case 2: goto L12;
                case 3: goto Lf;
                case 4: goto Lc;
                case 5: goto L9;
                case 6: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = "<Unknown>"
            return r0
        L6:
            java.lang.String r0 = "DOLBY_VISION"
            return r0
        L9:
            java.lang.String r0 = "HDR10_PLUS"
            return r0
        Lc:
            java.lang.String r0 = "HDR10"
            return r0
        Lf:
            java.lang.String r0 = "HLG"
            return r0
        L12:
            java.lang.String r0 = "HDR_UNSPECIFIED"
            return r0
        L15:
            java.lang.String r0 = "SDR"
            return r0
        L18:
            java.lang.String r0 = "UNSPECIFIED"
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.camera.core.DynamicRange
            r2 = 0
            if (r1 == 0) goto L1c
            androidx.camera.core.DynamicRange r5 = (androidx.camera.core.DynamicRange) r5
            int r1 = r4.mEncoding
            int r3 = r5.getEncoding()
            if (r1 != r3) goto L1c
            int r1 = r4.mBitDepth
            int r5 = r5.getBitDepth()
            if (r1 != r5) goto L1c
            return r0
        L1c:
            return r2
    }

    public int getBitDepth() {
            r1 = this;
            int r0 = r1.mBitDepth
            return r0
    }

    public int getEncoding() {
            r1 = this;
            int r0 = r1.mEncoding
            return r0
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.mEncoding
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            int r1 = r2.mBitDepth
            r0 = r0 ^ r1
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public boolean is10BitHdr() {
            r3 = this;
            boolean r0 = r3.isFullySpecified()
            if (r0 == 0) goto L16
            int r0 = r3.getEncoding()
            r1 = 1
            if (r0 == r1) goto L16
            int r0 = r3.getBitDepth()
            r2 = 10
            if (r0 != r2) goto L16
            return r1
        L16:
            r0 = 0
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isFullySpecified() {
            r2 = this;
            int r0 = r2.getEncoding()
            if (r0 == 0) goto L15
            int r0 = r2.getEncoding()
            r1 = 2
            if (r0 == r1) goto L15
            int r0 = r2.getBitDepth()
            if (r0 == 0) goto L15
            r0 = 1
            return r0
        L15:
            r0 = 0
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DynamicRange@"
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "{encoding="
            r0.append(r1)
            int r1 = r2.mEncoding
            java.lang.String r1 = getEncodingLabel(r1)
            r0.append(r1)
            java.lang.String r1 = ", bitDepth="
            r0.append(r1)
            int r1 = r2.mBitDepth
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
