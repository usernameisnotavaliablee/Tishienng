package com.huawei.hms.ml.scan;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class HmsBuildBitmapOption {
    public static final java.lang.String TYPE_BUILD_BITMAP_BACKCOLOR = "BitmapBackColor";
    public static final java.lang.String TYPE_BUILD_BITMAP_COLOR = "BitmapColor";
    public static final java.lang.String TYPE_BUILD_BITMAP_CONTENT = "BitmapContent";
    public static final java.lang.String TYPE_BUILD_BITMAP_FOTMAT = "BitmapFormat";
    public static final java.lang.String TYPE_BUILD_BITMAP_HEIGHT = "BitmapHeight";
    public static final java.lang.String TYPE_BUILD_BITMAP_MARGIN = "BitmapMargin";
    public static final java.lang.String TYPE_BUILD_BITMAP_WIDTH = "BitmapWidth";
    public final com.huawei.hms.ml.scan.HmsBuildBitmapOption.ErrorCorrectionLevel QRErrorCorrection;
    public final int bimapColor;
    public final int bitmapBackgroundColor;
    public final android.graphics.Bitmap logoBitmap;
    public final int margin;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.huawei.hms.ml.scan.HmsBuildBitmapOption$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Creator {
        private com.huawei.hms.ml.scan.HmsBuildBitmapOption.ErrorCorrectionLevel QRErrorCorrection;
        private int bimapBackgroundColor;
        private int bimapColor;
        private android.graphics.Bitmap logobitmap;
        private int margin;

        public Creator() {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.margin = r0
                r0 = -1
                r1.bimapBackgroundColor = r0
                r1.bimapColor = r0
                com.huawei.hms.ml.scan.HmsBuildBitmapOption$ErrorCorrectionLevel r0 = com.huawei.hms.ml.scan.HmsBuildBitmapOption.ErrorCorrectionLevel.L
                r1.QRErrorCorrection = r0
                return
        }

        public com.huawei.hms.ml.scan.HmsBuildBitmapOption create() {
                r7 = this;
                com.huawei.hms.ml.scan.HmsBuildBitmapOption r0 = new com.huawei.hms.ml.scan.HmsBuildBitmapOption
                int r1 = r7.margin
                int r2 = r7.bimapColor
                int r3 = r7.bimapBackgroundColor
                com.huawei.hms.ml.scan.HmsBuildBitmapOption$ErrorCorrectionLevel r4 = r7.QRErrorCorrection
                android.graphics.Bitmap r5 = r7.logobitmap
                r6 = 0
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r0
        }

        public com.huawei.hms.ml.scan.HmsBuildBitmapOption.Creator setBitmapBackgroundColor(int r1) {
                r0 = this;
                r0.bimapBackgroundColor = r1
                return r0
        }

        public com.huawei.hms.ml.scan.HmsBuildBitmapOption.Creator setBitmapColor(int r1) {
                r0 = this;
                r0.bimapColor = r1
                return r0
        }

        public com.huawei.hms.ml.scan.HmsBuildBitmapOption.Creator setBitmapMargin(int r1) {
                r0 = this;
                r0.margin = r1
                return r0
        }

        public com.huawei.hms.ml.scan.HmsBuildBitmapOption.Creator setQRErrorCorrection(com.huawei.hms.ml.scan.HmsBuildBitmapOption.ErrorCorrectionLevel r1) {
                r0 = this;
                r0.QRErrorCorrection = r1
                return r0
        }

        public com.huawei.hms.ml.scan.HmsBuildBitmapOption.Creator setQRLogoBitmap(android.graphics.Bitmap r1) {
                r0 = this;
                r0.logobitmap = r1
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum ErrorCorrectionLevel extends java.lang.Enum<com.huawei.hms.ml.scan.HmsBuildBitmapOption.ErrorCorrectionLevel> {
        private static final /* synthetic */ com.huawei.hms.ml.scan.HmsBuildBitmapOption.ErrorCorrectionLevel[] $VALUES = null;
        public static final com.huawei.hms.ml.scan.HmsBuildBitmapOption.ErrorCorrectionLevel H = null;
        public static final com.huawei.hms.ml.scan.HmsBuildBitmapOption.ErrorCorrectionLevel L = null;
        public static final com.huawei.hms.ml.scan.HmsBuildBitmapOption.ErrorCorrectionLevel M = null;
        public static final com.huawei.hms.ml.scan.HmsBuildBitmapOption.ErrorCorrectionLevel Q = null;
        public final java.lang.String value;

        static {
                com.huawei.hms.ml.scan.HmsBuildBitmapOption$ErrorCorrectionLevel r0 = new com.huawei.hms.ml.scan.HmsBuildBitmapOption$ErrorCorrectionLevel
                java.lang.String r1 = "L"
                r2 = 0
                r0.<init>(r1, r2, r1)
                com.huawei.hms.ml.scan.HmsBuildBitmapOption.ErrorCorrectionLevel.L = r0
                com.huawei.hms.ml.scan.HmsBuildBitmapOption$ErrorCorrectionLevel r1 = new com.huawei.hms.ml.scan.HmsBuildBitmapOption$ErrorCorrectionLevel
                java.lang.String r3 = "M"
                r4 = 1
                r1.<init>(r3, r4, r3)
                com.huawei.hms.ml.scan.HmsBuildBitmapOption.ErrorCorrectionLevel.M = r1
                com.huawei.hms.ml.scan.HmsBuildBitmapOption$ErrorCorrectionLevel r3 = new com.huawei.hms.ml.scan.HmsBuildBitmapOption$ErrorCorrectionLevel
                java.lang.String r5 = "Q"
                r6 = 2
                r3.<init>(r5, r6, r5)
                com.huawei.hms.ml.scan.HmsBuildBitmapOption.ErrorCorrectionLevel.Q = r3
                com.huawei.hms.ml.scan.HmsBuildBitmapOption$ErrorCorrectionLevel r5 = new com.huawei.hms.ml.scan.HmsBuildBitmapOption$ErrorCorrectionLevel
                java.lang.String r7 = "H"
                r8 = 3
                r5.<init>(r7, r8, r7)
                com.huawei.hms.ml.scan.HmsBuildBitmapOption.ErrorCorrectionLevel.H = r5
                r7 = 4
                com.huawei.hms.ml.scan.HmsBuildBitmapOption$ErrorCorrectionLevel[] r7 = new com.huawei.hms.ml.scan.HmsBuildBitmapOption.ErrorCorrectionLevel[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                com.huawei.hms.ml.scan.HmsBuildBitmapOption.ErrorCorrectionLevel.$VALUES = r7
                return
        }

        ErrorCorrectionLevel(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.value = r3
                return
        }

        public static com.huawei.hms.ml.scan.HmsBuildBitmapOption.ErrorCorrectionLevel valueOf(java.lang.String r1) {
                java.lang.Class<com.huawei.hms.ml.scan.HmsBuildBitmapOption$ErrorCorrectionLevel> r0 = com.huawei.hms.ml.scan.HmsBuildBitmapOption.ErrorCorrectionLevel.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.huawei.hms.ml.scan.HmsBuildBitmapOption$ErrorCorrectionLevel r1 = (com.huawei.hms.ml.scan.HmsBuildBitmapOption.ErrorCorrectionLevel) r1
                return r1
        }

        public static com.huawei.hms.ml.scan.HmsBuildBitmapOption.ErrorCorrectionLevel[] values() {
                com.huawei.hms.ml.scan.HmsBuildBitmapOption$ErrorCorrectionLevel[] r0 = com.huawei.hms.ml.scan.HmsBuildBitmapOption.ErrorCorrectionLevel.$VALUES
                java.lang.Object r0 = r0.clone()
                com.huawei.hms.ml.scan.HmsBuildBitmapOption$ErrorCorrectionLevel[] r0 = (com.huawei.hms.ml.scan.HmsBuildBitmapOption.ErrorCorrectionLevel[]) r0
                return r0
        }
    }

    private HmsBuildBitmapOption(int r1, int r2, int r3, com.huawei.hms.ml.scan.HmsBuildBitmapOption.ErrorCorrectionLevel r4, android.graphics.Bitmap r5) {
            r0 = this;
            r0.<init>()
            r0.margin = r1
            r0.bitmapBackgroundColor = r3
            r0.bimapColor = r2
            r0.QRErrorCorrection = r4
            r0.logoBitmap = r5
            return
    }

    /* synthetic */ HmsBuildBitmapOption(int r1, int r2, int r3, com.huawei.hms.ml.scan.HmsBuildBitmapOption.ErrorCorrectionLevel r4, android.graphics.Bitmap r5, com.huawei.hms.ml.scan.HmsBuildBitmapOption.AnonymousClass1 r6) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "{"
            r0.append(r1)
            java.lang.String r1 = "margin:"
            r0.append(r1)
            int r1 = r3.margin
            r0.append(r1)
            java.lang.String r1 = ";"
            r0.append(r1)
            java.lang.String r2 = "bitmapBackgroundColor:"
            r0.append(r2)
            int r2 = r3.bitmapBackgroundColor
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "bimapColor:"
            r0.append(r1)
            int r1 = r3.bimapColor
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
