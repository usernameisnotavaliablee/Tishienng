package com.huawei.hms.ml.scan;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class HmsScanBase implements android.os.Parcelable {
    public static final int ALL_SCAN_TYPE = 8191;
    public static final int AZTEC_SCAN_TYPE = 0;
    public static final int CODABAR_SCAN_TYPE = 0;
    public static final int CODE128_SCAN_TYPE = 0;
    public static final int CODE39_SCAN_TYPE = 0;
    public static final int CODE93_SCAN_TYPE = 0;
    public static final int DATAMATRIX_SCAN_TYPE = 0;
    public static final int EAN13_SCAN_TYPE = 0;
    public static final int EAN8_SCAN_TYPE = 0;
    public static final int FORMAT_UNKNOWN = 0;
    public static final int ITF14_SCAN_TYPE = 0;
    public static final int MULTI_FUNCTIONAL_SCAN_TYPE = 0;
    public static final int OTHER_FORM = -1;
    public static final int PDF417_SCAN_TYPE = 0;
    public static final int QRCODE_SCAN_TYPE = 0;
    public static final java.lang.String SCAN_ERROR_CHECK_FLAG = "ScanErrorCheck";
    public static final java.lang.String SCAN_FORMAT_FLAG = "ScanFormatValue";
    public static final java.lang.String SCAN_GUIDE_FLAG = "ScanGuide";
    public static final java.lang.String SCAN_VIEW_FLAG = "ScanViewValue";
    public static final int UPCCODE_A_SCAN_TYPE = 0;
    public static final int UPCCODE_E_SCAN_TYPE = 0;
    public static final int WX_SCAN_TYPE = 0;
    private int HMS_SCAN_VERSION;
    public android.graphics.Point[] cornerPoints;
    public com.huawei.hms.ml.scan.HmsScanAnalyzerOptions options;
    public byte[] originValueByte;
    public android.graphics.Bitmap originalBitmap;
    public java.lang.String originalValue;
    public int scanType;
    public int scanTypeForm;
    public java.lang.String showResult;
    public double zoomValue;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum SCAN_TYPE extends java.lang.Enum<com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE> {
        private static final /* synthetic */ com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE[] $VALUES = null;
        public static final com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE ALL_SCAN_TYPE = null;
        public static final com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE AZTEC_SCAN_TYPE = null;
        public static final com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE CODABAR_SCAN_TYPE = null;
        public static final com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE CODE128_SCAN_TYPE = null;
        public static final com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE CODE39_SCAN_TYPE = null;
        public static final com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE CODE93_SCAN_TYPE = null;
        public static final com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE DATAMATRIX_SCAN_TYPE = null;
        public static final com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE EAN13_SCAN_TYPE = null;
        public static final com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE EAN8_SCAN_TYPE = null;
        public static final com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE FORMAT_UNKNOWN = null;
        public static final com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE ITF14_SCAN_TYPE = null;
        public static final com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE MULTI_FUNCTIONAL_SCAN_TYPE = null;
        public static final com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE PDF417_SCAN_TYPE = null;
        public static final com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE QRCODE_SCAN_TYPE = null;
        public static final com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE UPCCODE_A_SCAN_TYPE = null;
        public static final com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE UPCCODE_E_SCAN_TYPE = null;
        public static final com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE WX_SCAN_TYPE = null;
        private final int scanType;

        static {
                com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE r0 = new com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE
                r1 = -1
                java.lang.String r2 = "FORMAT_UNKNOWN"
                r3 = 0
                r0.<init>(r2, r3, r1)
                com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE.FORMAT_UNKNOWN = r0
                com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE r1 = new com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE
                java.lang.String r2 = "ALL_SCAN_TYPE"
                r4 = 1
                r1.<init>(r2, r4, r3)
                com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE.ALL_SCAN_TYPE = r1
                com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE r2 = new com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE
                java.lang.String r5 = "QRCODE_SCAN_TYPE"
                r6 = 2
                r2.<init>(r5, r6, r3)
                com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE.QRCODE_SCAN_TYPE = r2
                com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE r5 = new com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE
                java.lang.String r7 = "AZTEC_SCAN_TYPE"
                r8 = 3
                r5.<init>(r7, r8, r4)
                com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE.AZTEC_SCAN_TYPE = r5
                com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE r7 = new com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE
                java.lang.String r9 = "DATAMATRIX_SCAN_TYPE"
                r10 = 4
                r7.<init>(r9, r10, r6)
                com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE.DATAMATRIX_SCAN_TYPE = r7
                com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE r9 = new com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE
                java.lang.String r11 = "PDF417_SCAN_TYPE"
                r12 = 5
                r9.<init>(r11, r12, r8)
                com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE.PDF417_SCAN_TYPE = r9
                com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE r11 = new com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE
                java.lang.String r13 = "CODE39_SCAN_TYPE"
                r14 = 6
                r11.<init>(r13, r14, r10)
                com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE.CODE39_SCAN_TYPE = r11
                com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE r13 = new com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE
                java.lang.String r15 = "CODE93_SCAN_TYPE"
                r16 = 0
                r3 = 7
                r13.<init>(r15, r3, r12)
                com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE.CODE93_SCAN_TYPE = r13
                com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE r15 = new com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE
                r17 = 1
                java.lang.String r4 = "CODE128_SCAN_TYPE"
                r18 = 2
                r6 = 8
                r15.<init>(r4, r6, r14)
                com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE.CODE128_SCAN_TYPE = r15
                com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE r4 = new com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE
                r19 = 3
                java.lang.String r8 = "EAN13_SCAN_TYPE"
                r20 = 4
                r10 = 9
                r4.<init>(r8, r10, r3)
                com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE.EAN13_SCAN_TYPE = r4
                com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE r8 = new com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE
                r21 = 7
                java.lang.String r3 = "EAN8_SCAN_TYPE"
                r22 = 5
                r12 = 10
                r8.<init>(r3, r12, r6)
                com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE.EAN8_SCAN_TYPE = r8
                com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE r3 = new com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE
                r23 = 8
                java.lang.String r6 = "ITF14_SCAN_TYPE"
                r24 = 6
                r14 = 11
                r3.<init>(r6, r14, r10)
                com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE.ITF14_SCAN_TYPE = r3
                com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE r6 = new com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE
                r25 = 9
                java.lang.String r10 = "UPCCODE_A_SCAN_TYPE"
                r14 = 12
                r6.<init>(r10, r14, r12)
                com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE.UPCCODE_A_SCAN_TYPE = r6
                com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE r10 = new com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE
                r27 = 10
                java.lang.String r12 = "UPCCODE_E_SCAN_TYPE"
                r14 = 13
                r29 = r0
                r0 = 11
                r10.<init>(r12, r14, r0)
                com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE.UPCCODE_E_SCAN_TYPE = r10
                com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE r0 = new com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE
                java.lang.String r12 = "CODABAR_SCAN_TYPE"
                r14 = 14
                r31 = r1
                r1 = 12
                r0.<init>(r12, r14, r1)
                com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE.CODABAR_SCAN_TYPE = r0
                com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE r1 = new com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE
                java.lang.String r12 = "MULTI_FUNCTIONAL_SCAN_TYPE"
                r14 = 15
                r33 = r0
                r0 = 13
                r1.<init>(r12, r14, r0)
                com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE.MULTI_FUNCTIONAL_SCAN_TYPE = r1
                com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE r0 = new com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE
                java.lang.String r12 = "WX_SCAN_TYPE"
                r34 = 15
                r14 = 16
                r35 = r1
                r1 = 14
                r0.<init>(r12, r14, r1)
                com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE.WX_SCAN_TYPE = r0
                r1 = 17
                com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE[] r1 = new com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE[r1]
                r1[r16] = r29
                r1[r17] = r31
                r1[r18] = r2
                r1[r19] = r5
                r1[r20] = r7
                r1[r22] = r9
                r1[r24] = r11
                r1[r21] = r13
                r1[r23] = r15
                r1[r25] = r4
                r1[r27] = r8
                r26 = 11
                r1[r26] = r3
                r28 = 12
                r1[r28] = r6
                r30 = 13
                r1[r30] = r10
                r32 = 14
                r1[r32] = r33
                r1[r34] = r35
                r1[r14] = r0
                com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE.$VALUES = r1
                return
        }

        SCAN_TYPE(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.scanType = r3
                return
        }

        public static com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE valueOf(java.lang.String r1) {
                java.lang.Class<com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE> r0 = com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE r1 = (com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE) r1
                return r1
        }

        public static com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE[] values() {
                com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE[] r0 = com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE.$VALUES
                java.lang.Object r0 = r0.clone()
                com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE[] r0 = (com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE[]) r0
                return r0
        }

        int getScanType() {
                r2 = this;
                int r0 = r2.scanType
                r1 = 1
                int r0 = r1 << r0
                return r0
        }

        int getUnKnown() {
                r1 = this;
                int r0 = r1.scanType
                return r0
        }
    }

    static {
            com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE r0 = com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE.FORMAT_UNKNOWN
            int r0 = r0.getUnKnown()
            com.huawei.hms.ml.scan.HmsScanBase.FORMAT_UNKNOWN = r0
            com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE r0 = com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE.QRCODE_SCAN_TYPE
            int r0 = r0.getScanType()
            com.huawei.hms.ml.scan.HmsScanBase.QRCODE_SCAN_TYPE = r0
            com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE r0 = com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE.AZTEC_SCAN_TYPE
            int r0 = r0.getScanType()
            com.huawei.hms.ml.scan.HmsScanBase.AZTEC_SCAN_TYPE = r0
            com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE r0 = com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE.DATAMATRIX_SCAN_TYPE
            int r0 = r0.getScanType()
            com.huawei.hms.ml.scan.HmsScanBase.DATAMATRIX_SCAN_TYPE = r0
            com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE r0 = com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE.PDF417_SCAN_TYPE
            int r0 = r0.getScanType()
            com.huawei.hms.ml.scan.HmsScanBase.PDF417_SCAN_TYPE = r0
            com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE r0 = com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE.CODE39_SCAN_TYPE
            int r0 = r0.getScanType()
            com.huawei.hms.ml.scan.HmsScanBase.CODE39_SCAN_TYPE = r0
            com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE r0 = com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE.CODE93_SCAN_TYPE
            int r0 = r0.getScanType()
            com.huawei.hms.ml.scan.HmsScanBase.CODE93_SCAN_TYPE = r0
            com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE r0 = com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE.CODE128_SCAN_TYPE
            int r0 = r0.getScanType()
            com.huawei.hms.ml.scan.HmsScanBase.CODE128_SCAN_TYPE = r0
            com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE r0 = com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE.EAN13_SCAN_TYPE
            int r0 = r0.getScanType()
            com.huawei.hms.ml.scan.HmsScanBase.EAN13_SCAN_TYPE = r0
            com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE r0 = com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE.EAN8_SCAN_TYPE
            int r0 = r0.getScanType()
            com.huawei.hms.ml.scan.HmsScanBase.EAN8_SCAN_TYPE = r0
            com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE r0 = com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE.ITF14_SCAN_TYPE
            int r0 = r0.getScanType()
            com.huawei.hms.ml.scan.HmsScanBase.ITF14_SCAN_TYPE = r0
            com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE r0 = com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE.UPCCODE_A_SCAN_TYPE
            int r0 = r0.getScanType()
            com.huawei.hms.ml.scan.HmsScanBase.UPCCODE_A_SCAN_TYPE = r0
            com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE r0 = com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE.UPCCODE_E_SCAN_TYPE
            int r0 = r0.getScanType()
            com.huawei.hms.ml.scan.HmsScanBase.UPCCODE_E_SCAN_TYPE = r0
            com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE r0 = com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE.CODABAR_SCAN_TYPE
            int r0 = r0.getScanType()
            com.huawei.hms.ml.scan.HmsScanBase.CODABAR_SCAN_TYPE = r0
            com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE r0 = com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE.MULTI_FUNCTIONAL_SCAN_TYPE
            int r0 = r0.getScanType()
            com.huawei.hms.ml.scan.HmsScanBase.MULTI_FUNCTIONAL_SCAN_TYPE = r0
            com.huawei.hms.ml.scan.HmsScanBase$SCAN_TYPE r0 = com.huawei.hms.ml.scan.HmsScanBase.SCAN_TYPE.WX_SCAN_TYPE
            int r0 = r0.getScanType()
            com.huawei.hms.ml.scan.HmsScanBase.WX_SCAN_TYPE = r0
            return
    }

    public HmsScanBase() {
            r1 = this;
            r1.<init>()
            r0 = 3
            r1.HMS_SCAN_VERSION = r0
            return
    }

    protected HmsScanBase(android.os.Parcel r4) {
            r3 = this;
            r3.<init>()
            r0 = 3
            r3.HMS_SCAN_VERSION = r0
            int r1 = r4.readInt()
            r3.HMS_SCAN_VERSION = r1
            r2 = 1
            if (r1 < r2) goto L40
            int r1 = r4.readInt()
            r3.scanType = r1
            java.lang.String r1 = r4.readString()
            r3.originalValue = r1
            int r1 = r4.readInt()
            r3.scanTypeForm = r1
            java.lang.String r1 = r4.readString()
            r3.showResult = r1
            android.os.Parcelable$Creator r1 = android.graphics.Point.CREATOR
            java.lang.Object[] r1 = r4.createTypedArray(r1)
            android.graphics.Point[] r1 = (android.graphics.Point[]) r1
            r3.cornerPoints = r1
            double r1 = r4.readDouble()
            r3.zoomValue = r1
            byte[] r1 = r4.createByteArray()
            r3.originValueByte = r1
            r3.detailTrans(r4)
        L40:
            int r1 = r3.HMS_SCAN_VERSION
            if (r1 < r0) goto L52
            java.lang.Class<android.graphics.Bitmap> r0 = android.graphics.Bitmap.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r4 = r4.readParcelable(r0)
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            r3.originalBitmap = r4
        L52:
            return
    }

    public HmsScanBase(java.lang.String r2, int r3, java.lang.String r4, int r5, byte[] r6, android.graphics.Point[] r7, com.huawei.hms.ml.scan.HmsScanAnalyzerOptions r8) {
            r1 = this;
            r1.<init>()
            r0 = 3
            r1.HMS_SCAN_VERSION = r0
            r1.originalValue = r2
            r1.scanType = r3
            r1.showResult = r4
            r1.scanTypeForm = r5
            r1.originValueByte = r6
            r1.cornerPoints = r7
            r1.options = r8
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    protected abstract void detailTrans(android.os.Parcel r1);

    protected abstract void detailTransOut(android.os.Parcel r1, int r2);

    public android.graphics.Rect getBorderRect() {
            r7 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 0
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 0
        Le:
            android.graphics.Point[] r5 = r7.cornerPoints
            int r6 = r5.length
            if (r4 >= r6) goto L30
            r5 = r5[r4]
            int r6 = r5.x
            int r0 = java.lang.Math.min(r0, r6)
            int r6 = r5.y
            int r1 = java.lang.Math.min(r1, r6)
            int r6 = r5.x
            int r2 = java.lang.Math.max(r2, r6)
            int r5 = r5.y
            int r3 = java.lang.Math.max(r3, r5)
            int r4 = r4 + 1
            goto Le
        L30:
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>(r0, r1, r2, r3)
            return r4
    }

    public android.graphics.Point[] getCornerPoints() {
            r1 = this;
            android.graphics.Point[] r0 = r1.cornerPoints
            return r0
    }

    public byte[] getOriginValueByte() {
            r1 = this;
            byte[] r0 = r1.originValueByte
            return r0
    }

    public android.graphics.Bitmap getOriginalBitmap() {
            r1 = this;
            android.graphics.Bitmap r0 = r1.originalBitmap
            return r0
    }

    public java.lang.String getOriginalValue() {
            r1 = this;
            java.lang.String r0 = r1.originalValue
            return r0
    }

    public int getScanType() {
            r1 = this;
            int r0 = r1.scanType
            return r0
    }

    public int getScanTypeForm() {
            r1 = this;
            int r0 = r1.scanTypeForm
            return r0
    }

    public java.lang.String getShowResult() {
            r1 = this;
            java.lang.String r0 = r1.showResult
            return r0
    }

    public double getZoomValue() {
            r2 = this;
            double r0 = r2.zoomValue
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            int r0 = r2.HMS_SCAN_VERSION
            r3.writeInt(r0)
            int r0 = r2.scanType
            r3.writeInt(r0)
            java.lang.String r0 = r2.originalValue
            r3.writeString(r0)
            int r0 = r2.scanTypeForm
            r3.writeInt(r0)
            java.lang.String r0 = r2.showResult
            r3.writeString(r0)
            android.graphics.Point[] r0 = r2.cornerPoints
            r3.writeTypedArray(r0, r4)
            double r0 = r2.zoomValue
            r3.writeDouble(r0)
            byte[] r0 = r2.originValueByte
            r3.writeByteArray(r0)
            r2.detailTransOut(r3, r4)
            int r0 = com.huawei.hms.hmsscankit.DetailRect.HMSSCAN_SDK_VALUE
            r1 = 3
            if (r0 < r1) goto L35
            android.graphics.Bitmap r0 = r2.originalBitmap
            r3.writeParcelable(r0, r4)
        L35:
            return
    }
}
