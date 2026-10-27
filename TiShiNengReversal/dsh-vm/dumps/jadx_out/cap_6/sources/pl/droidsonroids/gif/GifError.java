package pl.droidsonroids.gif;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum GifError extends java.lang.Enum<pl.droidsonroids.gif.GifError> {
    private static final /* synthetic */ pl.droidsonroids.gif.GifError[] $VALUES = null;
    public static final pl.droidsonroids.gif.GifError CLOSE_FAILED = null;
    public static final pl.droidsonroids.gif.GifError DATA_TOO_BIG = null;
    public static final pl.droidsonroids.gif.GifError EOF_TOO_SOON = null;
    public static final pl.droidsonroids.gif.GifError IMAGE_DEFECT = null;
    public static final pl.droidsonroids.gif.GifError IMG_NOT_CONFINED = null;
    public static final pl.droidsonroids.gif.GifError INVALID_BYTE_BUFFER = null;

    @java.lang.Deprecated
    public static final pl.droidsonroids.gif.GifError INVALID_IMG_DIMS = null;
    public static final pl.droidsonroids.gif.GifError INVALID_SCR_DIMS = null;
    public static final pl.droidsonroids.gif.GifError NOT_ENOUGH_MEM = null;
    public static final pl.droidsonroids.gif.GifError NOT_GIF_FILE = null;
    public static final pl.droidsonroids.gif.GifError NOT_READABLE = null;
    public static final pl.droidsonroids.gif.GifError NO_COLOR_MAP = null;
    public static final pl.droidsonroids.gif.GifError NO_ERROR = null;
    public static final pl.droidsonroids.gif.GifError NO_FRAMES = null;
    public static final pl.droidsonroids.gif.GifError NO_IMAG_DSCR = null;
    public static final pl.droidsonroids.gif.GifError NO_SCRN_DSCR = null;
    public static final pl.droidsonroids.gif.GifError OPEN_FAILED = null;
    public static final pl.droidsonroids.gif.GifError READ_FAILED = null;
    public static final pl.droidsonroids.gif.GifError REWIND_FAILED = null;
    public static final pl.droidsonroids.gif.GifError UNKNOWN = null;
    public static final pl.droidsonroids.gif.GifError WRONG_RECORD = null;

    @androidx.annotation.NonNull
    public final java.lang.String description;
    int errorCode;

    static {
            pl.droidsonroids.gif.GifError r0 = new pl.droidsonroids.gif.GifError
            java.lang.String r1 = "No error"
            java.lang.String r2 = "NO_ERROR"
            r3 = 0
            r0.<init>(r2, r3, r3, r1)
            pl.droidsonroids.gif.GifError.NO_ERROR = r0
            pl.droidsonroids.gif.GifError r1 = new pl.droidsonroids.gif.GifError
            r2 = 101(0x65, float:1.42E-43)
            java.lang.String r4 = "Failed to open given input"
            java.lang.String r5 = "OPEN_FAILED"
            r6 = 1
            r1.<init>(r5, r6, r2, r4)
            pl.droidsonroids.gif.GifError.OPEN_FAILED = r1
            pl.droidsonroids.gif.GifError r2 = new pl.droidsonroids.gif.GifError
            r4 = 102(0x66, float:1.43E-43)
            java.lang.String r5 = "Failed to read from given input"
            java.lang.String r7 = "READ_FAILED"
            r8 = 2
            r2.<init>(r7, r8, r4, r5)
            pl.droidsonroids.gif.GifError.READ_FAILED = r2
            pl.droidsonroids.gif.GifError r4 = new pl.droidsonroids.gif.GifError
            r5 = 103(0x67, float:1.44E-43)
            java.lang.String r7 = "Data is not in GIF format"
            java.lang.String r9 = "NOT_GIF_FILE"
            r10 = 3
            r4.<init>(r9, r10, r5, r7)
            pl.droidsonroids.gif.GifError.NOT_GIF_FILE = r4
            pl.droidsonroids.gif.GifError r5 = new pl.droidsonroids.gif.GifError
            r7 = 104(0x68, float:1.46E-43)
            java.lang.String r9 = "No screen descriptor detected"
            java.lang.String r11 = "NO_SCRN_DSCR"
            r12 = 4
            r5.<init>(r11, r12, r7, r9)
            pl.droidsonroids.gif.GifError.NO_SCRN_DSCR = r5
            pl.droidsonroids.gif.GifError r7 = new pl.droidsonroids.gif.GifError
            r9 = 105(0x69, float:1.47E-43)
            java.lang.String r11 = "No image descriptor detected"
            java.lang.String r13 = "NO_IMAG_DSCR"
            r14 = 5
            r7.<init>(r13, r14, r9, r11)
            pl.droidsonroids.gif.GifError.NO_IMAG_DSCR = r7
            pl.droidsonroids.gif.GifError r9 = new pl.droidsonroids.gif.GifError
            r11 = 106(0x6a, float:1.49E-43)
            java.lang.String r13 = "Neither global nor local color map found"
            java.lang.String r15 = "NO_COLOR_MAP"
            r16 = 0
            r3 = 6
            r9.<init>(r15, r3, r11, r13)
            pl.droidsonroids.gif.GifError.NO_COLOR_MAP = r9
            pl.droidsonroids.gif.GifError r11 = new pl.droidsonroids.gif.GifError
            r13 = 107(0x6b, float:1.5E-43)
            java.lang.String r15 = "Wrong record type detected"
            r17 = 6
            java.lang.String r3 = "WRONG_RECORD"
            r18 = 1
            r6 = 7
            r11.<init>(r3, r6, r13, r15)
            pl.droidsonroids.gif.GifError.WRONG_RECORD = r11
            pl.droidsonroids.gif.GifError r3 = new pl.droidsonroids.gif.GifError
            r13 = 108(0x6c, float:1.51E-43)
            java.lang.String r15 = "Number of pixels bigger than width * height"
            r19 = 7
            java.lang.String r6 = "DATA_TOO_BIG"
            r20 = 2
            r8 = 8
            r3.<init>(r6, r8, r13, r15)
            pl.droidsonroids.gif.GifError.DATA_TOO_BIG = r3
            pl.droidsonroids.gif.GifError r6 = new pl.droidsonroids.gif.GifError
            r13 = 109(0x6d, float:1.53E-43)
            java.lang.String r15 = "Failed to allocate required memory"
            r21 = 8
            java.lang.String r8 = "NOT_ENOUGH_MEM"
            r22 = 3
            r10 = 9
            r6.<init>(r8, r10, r13, r15)
            pl.droidsonroids.gif.GifError.NOT_ENOUGH_MEM = r6
            pl.droidsonroids.gif.GifError r8 = new pl.droidsonroids.gif.GifError
            r13 = 110(0x6e, float:1.54E-43)
            java.lang.String r15 = "Failed to close given input"
            r23 = 9
            java.lang.String r10 = "CLOSE_FAILED"
            r24 = 4
            r12 = 10
            r8.<init>(r10, r12, r13, r15)
            pl.droidsonroids.gif.GifError.CLOSE_FAILED = r8
            pl.droidsonroids.gif.GifError r10 = new pl.droidsonroids.gif.GifError
            r13 = 111(0x6f, float:1.56E-43)
            java.lang.String r15 = "Given file was not opened for read"
            r25 = 10
            java.lang.String r12 = "NOT_READABLE"
            r26 = 5
            r14 = 11
            r10.<init>(r12, r14, r13, r15)
            pl.droidsonroids.gif.GifError.NOT_READABLE = r10
            pl.droidsonroids.gif.GifError r12 = new pl.droidsonroids.gif.GifError
            r13 = 112(0x70, float:1.57E-43)
            java.lang.String r15 = "Image is defective, decoding aborted"
            r27 = 11
            java.lang.String r14 = "IMAGE_DEFECT"
            r28 = r0
            r0 = 12
            r12.<init>(r14, r0, r13, r15)
            pl.droidsonroids.gif.GifError.IMAGE_DEFECT = r12
            pl.droidsonroids.gif.GifError r13 = new pl.droidsonroids.gif.GifError
            r14 = 113(0x71, float:1.58E-43)
            java.lang.String r15 = "Image EOF detected before image complete"
            r29 = 12
            java.lang.String r0 = "EOF_TOO_SOON"
            r30 = r1
            r1 = 13
            r13.<init>(r0, r1, r14, r15)
            pl.droidsonroids.gif.GifError.EOF_TOO_SOON = r13
            pl.droidsonroids.gif.GifError r0 = new pl.droidsonroids.gif.GifError
            r14 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r15 = "No frames found, at least one frame required"
            r31 = 13
            java.lang.String r1 = "NO_FRAMES"
            r32 = r2
            r2 = 14
            r0.<init>(r1, r2, r14, r15)
            pl.droidsonroids.gif.GifError.NO_FRAMES = r0
            pl.droidsonroids.gif.GifError r1 = new pl.droidsonroids.gif.GifError
            r14 = 1001(0x3e9, float:1.403E-42)
            java.lang.String r15 = "Invalid screen size, dimensions must be positive"
            r33 = 14
            java.lang.String r2 = "INVALID_SCR_DIMS"
            r34 = r0
            r0 = 15
            r1.<init>(r2, r0, r14, r15)
            pl.droidsonroids.gif.GifError.INVALID_SCR_DIMS = r1
            pl.droidsonroids.gif.GifError r2 = new pl.droidsonroids.gif.GifError
            r14 = 1002(0x3ea, float:1.404E-42)
            java.lang.String r15 = "Invalid image size, dimensions must be positive"
            r35 = 15
            java.lang.String r0 = "INVALID_IMG_DIMS"
            r36 = r1
            r1 = 16
            r2.<init>(r0, r1, r14, r15)
            pl.droidsonroids.gif.GifError.INVALID_IMG_DIMS = r2
            pl.droidsonroids.gif.GifError r0 = new pl.droidsonroids.gif.GifError
            r14 = 1003(0x3eb, float:1.406E-42)
            java.lang.String r15 = "Image size exceeds screen size"
            r37 = 16
            java.lang.String r1 = "IMG_NOT_CONFINED"
            r38 = r2
            r2 = 17
            r0.<init>(r1, r2, r14, r15)
            pl.droidsonroids.gif.GifError.IMG_NOT_CONFINED = r0
            pl.droidsonroids.gif.GifError r1 = new pl.droidsonroids.gif.GifError
            r14 = 1004(0x3ec, float:1.407E-42)
            java.lang.String r15 = "Input source rewind failed, animation stopped"
            r39 = 17
            java.lang.String r2 = "REWIND_FAILED"
            r40 = r0
            r0 = 18
            r1.<init>(r2, r0, r14, r15)
            pl.droidsonroids.gif.GifError.REWIND_FAILED = r1
            pl.droidsonroids.gif.GifError r2 = new pl.droidsonroids.gif.GifError
            r14 = 1005(0x3ed, float:1.408E-42)
            java.lang.String r15 = "Invalid and/or indirect byte buffer specified"
            r41 = 18
            java.lang.String r0 = "INVALID_BYTE_BUFFER"
            r42 = r1
            r1 = 19
            r2.<init>(r0, r1, r14, r15)
            pl.droidsonroids.gif.GifError.INVALID_BYTE_BUFFER = r2
            pl.droidsonroids.gif.GifError r0 = new pl.droidsonroids.gif.GifError
            r14 = -1
            java.lang.String r15 = "Unknown error"
            r43 = 19
            java.lang.String r1 = "UNKNOWN"
            r44 = r2
            r2 = 20
            r0.<init>(r1, r2, r14, r15)
            pl.droidsonroids.gif.GifError.UNKNOWN = r0
            r1 = 21
            pl.droidsonroids.gif.GifError[] r1 = new pl.droidsonroids.gif.GifError[r1]
            r1[r16] = r28
            r1[r18] = r30
            r1[r20] = r32
            r1[r22] = r4
            r1[r24] = r5
            r1[r26] = r7
            r1[r17] = r9
            r1[r19] = r11
            r1[r21] = r3
            r1[r23] = r6
            r1[r25] = r8
            r1[r27] = r10
            r1[r29] = r12
            r1[r31] = r13
            r1[r33] = r34
            r1[r35] = r36
            r1[r37] = r38
            r1[r39] = r40
            r1[r41] = r42
            r1[r43] = r44
            r1[r2] = r0
            pl.droidsonroids.gif.GifError.$VALUES = r1
            return
    }

    GifError(java.lang.String r1, @androidx.annotation.NonNull int r2, int r3, java.lang.String r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.errorCode = r3
            r0.description = r4
            return
    }

    static pl.droidsonroids.gif.GifError fromCode(int r5) {
            pl.droidsonroids.gif.GifError[] r0 = values()
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            int r4 = r3.errorCode
            if (r4 != r5) goto Lf
            return r3
        Lf:
            int r2 = r2 + 1
            goto L6
        L12:
            pl.droidsonroids.gif.GifError r0 = pl.droidsonroids.gif.GifError.UNKNOWN
            r0.errorCode = r5
            return r0
    }

    public static pl.droidsonroids.gif.GifError valueOf(java.lang.String r1) {
            java.lang.Class<pl.droidsonroids.gif.GifError> r0 = pl.droidsonroids.gif.GifError.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            pl.droidsonroids.gif.GifError r1 = (pl.droidsonroids.gif.GifError) r1
            return r1
    }

    public static pl.droidsonroids.gif.GifError[] values() {
            pl.droidsonroids.gif.GifError[] r0 = pl.droidsonroids.gif.GifError.$VALUES
            java.lang.Object r0 = r0.clone()
            pl.droidsonroids.gif.GifError[] r0 = (pl.droidsonroids.gif.GifError[]) r0
            return r0
    }

    public int getErrorCode() {
            r1 = this;
            int r0 = r1.errorCode
            return r0
    }

    java.lang.String getFormattedDescription() {
            r5 = this;
            java.util.Locale r0 = java.util.Locale.ENGLISH
            int r1 = r5.errorCode
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = r5.description
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r1
            r1 = 1
            r3[r1] = r2
            java.lang.String r1 = "GifError %d: %s"
            java.lang.String r0 = java.lang.String.format(r0, r1, r3)
            return r0
    }
}
