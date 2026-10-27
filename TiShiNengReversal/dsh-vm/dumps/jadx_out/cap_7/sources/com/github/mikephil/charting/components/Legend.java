package com.github.mikephil.charting.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class Legend extends com.github.mikephil.charting.components.ComponentBase {
    private java.util.List<java.lang.Boolean> mCalculatedLabelBreakPoints;
    private java.util.List<com.github.mikephil.charting.utils.FSize> mCalculatedLabelSizes;
    private java.util.List<com.github.mikephil.charting.utils.FSize> mCalculatedLineSizes;
    private com.github.mikephil.charting.components.Legend.LegendDirection mDirection;
    private boolean mDrawInside;
    private com.github.mikephil.charting.components.LegendEntry[] mEntries;
    private com.github.mikephil.charting.components.LegendEntry[] mExtraEntries;
    private android.graphics.DashPathEffect mFormLineDashEffect;
    private float mFormLineWidth;
    private float mFormSize;
    private float mFormToTextSpace;
    private com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment mHorizontalAlignment;
    private boolean mIsLegendCustom;
    private float mMaxSizePercent;
    public float mNeededHeight;
    public float mNeededWidth;
    private com.github.mikephil.charting.components.Legend.LegendOrientation mOrientation;
    private com.github.mikephil.charting.components.Legend.LegendForm mShape;
    private float mStackSpace;
    public float mTextHeightMax;
    public float mTextWidthMax;
    private com.github.mikephil.charting.components.Legend.LegendVerticalAlignment mVerticalAlignment;
    private boolean mWordWrapEnabled;
    private float mXEntrySpace;
    private float mYEntrySpace;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.github.mikephil.charting.components.Legend$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation = null;

        static {
                com.github.mikephil.charting.components.Legend$LegendOrientation[] r0 = com.github.mikephil.charting.components.Legend.LegendOrientation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.github.mikephil.charting.components.Legend.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation = r0
                com.github.mikephil.charting.components.Legend$LegendOrientation r1 = com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.github.mikephil.charting.components.Legend.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation     // Catch: java.lang.NoSuchFieldError -> L1d
                com.github.mikephil.charting.components.Legend$LegendOrientation r1 = com.github.mikephil.charting.components.Legend.LegendOrientation.HORIZONTAL     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum LegendDirection extends java.lang.Enum<com.github.mikephil.charting.components.Legend.LegendDirection> {
        private static final /* synthetic */ com.github.mikephil.charting.components.Legend.LegendDirection[] $VALUES = null;
        public static final com.github.mikephil.charting.components.Legend.LegendDirection LEFT_TO_RIGHT = null;
        public static final com.github.mikephil.charting.components.Legend.LegendDirection RIGHT_TO_LEFT = null;

        static {
                com.github.mikephil.charting.components.Legend$LegendDirection r0 = new com.github.mikephil.charting.components.Legend$LegendDirection
                java.lang.String r1 = "LEFT_TO_RIGHT"
                r2 = 0
                r0.<init>(r1, r2)
                com.github.mikephil.charting.components.Legend.LegendDirection.LEFT_TO_RIGHT = r0
                com.github.mikephil.charting.components.Legend$LegendDirection r1 = new com.github.mikephil.charting.components.Legend$LegendDirection
                java.lang.String r3 = "RIGHT_TO_LEFT"
                r4 = 1
                r1.<init>(r3, r4)
                com.github.mikephil.charting.components.Legend.LegendDirection.RIGHT_TO_LEFT = r1
                r3 = 2
                com.github.mikephil.charting.components.Legend$LegendDirection[] r3 = new com.github.mikephil.charting.components.Legend.LegendDirection[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.github.mikephil.charting.components.Legend.LegendDirection.$VALUES = r3
                return
        }

        LegendDirection(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.github.mikephil.charting.components.Legend.LegendDirection valueOf(java.lang.String r1) {
                java.lang.Class<com.github.mikephil.charting.components.Legend$LegendDirection> r0 = com.github.mikephil.charting.components.Legend.LegendDirection.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.github.mikephil.charting.components.Legend$LegendDirection r1 = (com.github.mikephil.charting.components.Legend.LegendDirection) r1
                return r1
        }

        public static com.github.mikephil.charting.components.Legend.LegendDirection[] values() {
                com.github.mikephil.charting.components.Legend$LegendDirection[] r0 = com.github.mikephil.charting.components.Legend.LegendDirection.$VALUES
                java.lang.Object r0 = r0.clone()
                com.github.mikephil.charting.components.Legend$LegendDirection[] r0 = (com.github.mikephil.charting.components.Legend.LegendDirection[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum LegendForm extends java.lang.Enum<com.github.mikephil.charting.components.Legend.LegendForm> {
        private static final /* synthetic */ com.github.mikephil.charting.components.Legend.LegendForm[] $VALUES = null;
        public static final com.github.mikephil.charting.components.Legend.LegendForm CIRCLE = null;
        public static final com.github.mikephil.charting.components.Legend.LegendForm DEFAULT = null;
        public static final com.github.mikephil.charting.components.Legend.LegendForm EMPTY = null;
        public static final com.github.mikephil.charting.components.Legend.LegendForm LINE = null;
        public static final com.github.mikephil.charting.components.Legend.LegendForm NONE = null;
        public static final com.github.mikephil.charting.components.Legend.LegendForm SQUARE = null;

        static {
                com.github.mikephil.charting.components.Legend$LegendForm r0 = new com.github.mikephil.charting.components.Legend$LegendForm
                java.lang.String r1 = "NONE"
                r2 = 0
                r0.<init>(r1, r2)
                com.github.mikephil.charting.components.Legend.LegendForm.NONE = r0
                com.github.mikephil.charting.components.Legend$LegendForm r1 = new com.github.mikephil.charting.components.Legend$LegendForm
                java.lang.String r3 = "EMPTY"
                r4 = 1
                r1.<init>(r3, r4)
                com.github.mikephil.charting.components.Legend.LegendForm.EMPTY = r1
                com.github.mikephil.charting.components.Legend$LegendForm r3 = new com.github.mikephil.charting.components.Legend$LegendForm
                java.lang.String r5 = "DEFAULT"
                r6 = 2
                r3.<init>(r5, r6)
                com.github.mikephil.charting.components.Legend.LegendForm.DEFAULT = r3
                com.github.mikephil.charting.components.Legend$LegendForm r5 = new com.github.mikephil.charting.components.Legend$LegendForm
                java.lang.String r7 = "SQUARE"
                r8 = 3
                r5.<init>(r7, r8)
                com.github.mikephil.charting.components.Legend.LegendForm.SQUARE = r5
                com.github.mikephil.charting.components.Legend$LegendForm r7 = new com.github.mikephil.charting.components.Legend$LegendForm
                java.lang.String r9 = "CIRCLE"
                r10 = 4
                r7.<init>(r9, r10)
                com.github.mikephil.charting.components.Legend.LegendForm.CIRCLE = r7
                com.github.mikephil.charting.components.Legend$LegendForm r9 = new com.github.mikephil.charting.components.Legend$LegendForm
                java.lang.String r11 = "LINE"
                r12 = 5
                r9.<init>(r11, r12)
                com.github.mikephil.charting.components.Legend.LegendForm.LINE = r9
                r11 = 6
                com.github.mikephil.charting.components.Legend$LegendForm[] r11 = new com.github.mikephil.charting.components.Legend.LegendForm[r11]
                r11[r2] = r0
                r11[r4] = r1
                r11[r6] = r3
                r11[r8] = r5
                r11[r10] = r7
                r11[r12] = r9
                com.github.mikephil.charting.components.Legend.LegendForm.$VALUES = r11
                return
        }

        LegendForm(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.github.mikephil.charting.components.Legend.LegendForm valueOf(java.lang.String r1) {
                java.lang.Class<com.github.mikephil.charting.components.Legend$LegendForm> r0 = com.github.mikephil.charting.components.Legend.LegendForm.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.github.mikephil.charting.components.Legend$LegendForm r1 = (com.github.mikephil.charting.components.Legend.LegendForm) r1
                return r1
        }

        public static com.github.mikephil.charting.components.Legend.LegendForm[] values() {
                com.github.mikephil.charting.components.Legend$LegendForm[] r0 = com.github.mikephil.charting.components.Legend.LegendForm.$VALUES
                java.lang.Object r0 = r0.clone()
                com.github.mikephil.charting.components.Legend$LegendForm[] r0 = (com.github.mikephil.charting.components.Legend.LegendForm[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum LegendHorizontalAlignment extends java.lang.Enum<com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment> {
        private static final /* synthetic */ com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment[] $VALUES = null;
        public static final com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment CENTER = null;
        public static final com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment LEFT = null;
        public static final com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment RIGHT = null;

        static {
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r0 = new com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment
                java.lang.String r1 = "LEFT"
                r2 = 0
                r0.<init>(r1, r2)
                com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.LEFT = r0
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r1 = new com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment
                java.lang.String r3 = "CENTER"
                r4 = 1
                r1.<init>(r3, r4)
                com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.CENTER = r1
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r3 = new com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment
                java.lang.String r5 = "RIGHT"
                r6 = 2
                r3.<init>(r5, r6)
                com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.RIGHT = r3
                r5 = 3
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment[] r5 = new com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.$VALUES = r5
                return
        }

        LegendHorizontalAlignment(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment valueOf(java.lang.String r1) {
                java.lang.Class<com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment> r0 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r1 = (com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment) r1
                return r1
        }

        public static com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment[] values() {
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment[] r0 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.$VALUES
                java.lang.Object r0 = r0.clone()
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment[] r0 = (com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum LegendOrientation extends java.lang.Enum<com.github.mikephil.charting.components.Legend.LegendOrientation> {
        private static final /* synthetic */ com.github.mikephil.charting.components.Legend.LegendOrientation[] $VALUES = null;
        public static final com.github.mikephil.charting.components.Legend.LegendOrientation HORIZONTAL = null;
        public static final com.github.mikephil.charting.components.Legend.LegendOrientation VERTICAL = null;

        static {
                com.github.mikephil.charting.components.Legend$LegendOrientation r0 = new com.github.mikephil.charting.components.Legend$LegendOrientation
                java.lang.String r1 = "HORIZONTAL"
                r2 = 0
                r0.<init>(r1, r2)
                com.github.mikephil.charting.components.Legend.LegendOrientation.HORIZONTAL = r0
                com.github.mikephil.charting.components.Legend$LegendOrientation r1 = new com.github.mikephil.charting.components.Legend$LegendOrientation
                java.lang.String r3 = "VERTICAL"
                r4 = 1
                r1.<init>(r3, r4)
                com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL = r1
                r3 = 2
                com.github.mikephil.charting.components.Legend$LegendOrientation[] r3 = new com.github.mikephil.charting.components.Legend.LegendOrientation[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.github.mikephil.charting.components.Legend.LegendOrientation.$VALUES = r3
                return
        }

        LegendOrientation(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.github.mikephil.charting.components.Legend.LegendOrientation valueOf(java.lang.String r1) {
                java.lang.Class<com.github.mikephil.charting.components.Legend$LegendOrientation> r0 = com.github.mikephil.charting.components.Legend.LegendOrientation.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.github.mikephil.charting.components.Legend$LegendOrientation r1 = (com.github.mikephil.charting.components.Legend.LegendOrientation) r1
                return r1
        }

        public static com.github.mikephil.charting.components.Legend.LegendOrientation[] values() {
                com.github.mikephil.charting.components.Legend$LegendOrientation[] r0 = com.github.mikephil.charting.components.Legend.LegendOrientation.$VALUES
                java.lang.Object r0 = r0.clone()
                com.github.mikephil.charting.components.Legend$LegendOrientation[] r0 = (com.github.mikephil.charting.components.Legend.LegendOrientation[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum LegendVerticalAlignment extends java.lang.Enum<com.github.mikephil.charting.components.Legend.LegendVerticalAlignment> {
        private static final /* synthetic */ com.github.mikephil.charting.components.Legend.LegendVerticalAlignment[] $VALUES = null;
        public static final com.github.mikephil.charting.components.Legend.LegendVerticalAlignment BOTTOM = null;
        public static final com.github.mikephil.charting.components.Legend.LegendVerticalAlignment CENTER = null;
        public static final com.github.mikephil.charting.components.Legend.LegendVerticalAlignment TOP = null;

        static {
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r0 = new com.github.mikephil.charting.components.Legend$LegendVerticalAlignment
                java.lang.String r1 = "TOP"
                r2 = 0
                r0.<init>(r1, r2)
                com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.TOP = r0
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r1 = new com.github.mikephil.charting.components.Legend$LegendVerticalAlignment
                java.lang.String r3 = "CENTER"
                r4 = 1
                r1.<init>(r3, r4)
                com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.CENTER = r1
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r3 = new com.github.mikephil.charting.components.Legend$LegendVerticalAlignment
                java.lang.String r5 = "BOTTOM"
                r6 = 2
                r3.<init>(r5, r6)
                com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.BOTTOM = r3
                r5 = 3
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment[] r5 = new com.github.mikephil.charting.components.Legend.LegendVerticalAlignment[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.$VALUES = r5
                return
        }

        LegendVerticalAlignment(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.github.mikephil.charting.components.Legend.LegendVerticalAlignment valueOf(java.lang.String r1) {
                java.lang.Class<com.github.mikephil.charting.components.Legend$LegendVerticalAlignment> r0 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r1 = (com.github.mikephil.charting.components.Legend.LegendVerticalAlignment) r1
                return r1
        }

        public static com.github.mikephil.charting.components.Legend.LegendVerticalAlignment[] values() {
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment[] r0 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.$VALUES
                java.lang.Object r0 = r0.clone()
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment[] r0 = (com.github.mikephil.charting.components.Legend.LegendVerticalAlignment[]) r0
                return r0
        }
    }

    public Legend() {
            r5 = this;
            r5.<init>()
            r0 = 0
            com.github.mikephil.charting.components.LegendEntry[] r1 = new com.github.mikephil.charting.components.LegendEntry[r0]
            r5.mEntries = r1
            r5.mIsLegendCustom = r0
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r1 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.LEFT
            r5.mHorizontalAlignment = r1
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r1 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.BOTTOM
            r5.mVerticalAlignment = r1
            com.github.mikephil.charting.components.Legend$LegendOrientation r1 = com.github.mikephil.charting.components.Legend.LegendOrientation.HORIZONTAL
            r5.mOrientation = r1
            r5.mDrawInside = r0
            com.github.mikephil.charting.components.Legend$LegendDirection r1 = com.github.mikephil.charting.components.Legend.LegendDirection.LEFT_TO_RIGHT
            r5.mDirection = r1
            com.github.mikephil.charting.components.Legend$LegendForm r1 = com.github.mikephil.charting.components.Legend.LegendForm.SQUARE
            r5.mShape = r1
            r1 = 1090519040(0x41000000, float:8.0)
            r5.mFormSize = r1
            r1 = 1077936128(0x40400000, float:3.0)
            r5.mFormLineWidth = r1
            r2 = 0
            r5.mFormLineDashEffect = r2
            r2 = 1086324736(0x40c00000, float:6.0)
            r5.mXEntrySpace = r2
            r2 = 0
            r5.mYEntrySpace = r2
            r3 = 1084227584(0x40a00000, float:5.0)
            r5.mFormToTextSpace = r3
            r5.mStackSpace = r1
            r4 = 1064514355(0x3f733333, float:0.95)
            r5.mMaxSizePercent = r4
            r5.mNeededWidth = r2
            r5.mNeededHeight = r2
            r5.mTextHeightMax = r2
            r5.mTextWidthMax = r2
            r5.mWordWrapEnabled = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r2 = 16
            r0.<init>(r2)
            r5.mCalculatedLabelSizes = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r5.mCalculatedLabelBreakPoints = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r5.mCalculatedLineSizes = r0
            r0 = 1092616192(0x41200000, float:10.0)
            float r0 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r0)
            r5.mTextSize = r0
            float r0 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r3)
            r5.mXOffset = r0
            float r0 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r1)
            r5.mYOffset = r0
            return
    }

    public Legend(com.github.mikephil.charting.components.LegendEntry[] r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.mEntries = r2
            return
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "entries array is NULL"
            r2.<init>(r0)
            throw r2
    }

    public void calculateDimensions(android.graphics.Paint r27, com.github.mikephil.charting.utils.ViewPortHandler r28) {
            r26 = this;
            r0 = r26
            r1 = r27
            float r2 = r0.mFormSize
            float r2 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r2)
            float r3 = r0.mStackSpace
            float r3 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r3)
            float r4 = r0.mFormToTextSpace
            float r4 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r4)
            float r5 = r0.mXEntrySpace
            float r5 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r5)
            float r6 = r0.mYEntrySpace
            float r6 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r6)
            boolean r7 = r0.mWordWrapEnabled
            com.github.mikephil.charting.components.LegendEntry[] r8 = r0.mEntries
            int r9 = r8.length
            float r10 = r26.getMaximumEntryWidth(r27)
            r0.mTextWidthMax = r10
            float r10 = r26.getMaximumEntryHeight(r27)
            r0.mTextHeightMax = r10
            int[] r10 = com.github.mikephil.charting.components.Legend.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation
            com.github.mikephil.charting.components.Legend$LegendOrientation r11 = r0.mOrientation
            int r11 = r11.ordinal()
            r10 = r10[r11]
            r13 = 1
            if (r10 == r13) goto L16f
            r14 = 2
            if (r10 == r14) goto L45
            goto L1ef
        L45:
            float r10 = com.github.mikephil.charting.utils.Utils.getLineHeight(r1)
            float r14 = com.github.mikephil.charting.utils.Utils.getLineSpacing(r1)
            float r14 = r14 + r6
            float r6 = r28.contentWidth()
            float r15 = r0.mMaxSizePercent
            float r6 = r6 * r15
            java.util.List<java.lang.Boolean> r15 = r0.mCalculatedLabelBreakPoints
            r15.clear()
            java.util.List<com.github.mikephil.charting.utils.FSize> r15 = r0.mCalculatedLabelSizes
            r15.clear()
            java.util.List<com.github.mikephil.charting.utils.FSize> r15 = r0.mCalculatedLineSizes
            r15.clear()
            r11 = 0
            r12 = -1
            r13 = 0
            r16 = 1
            r18 = 0
            r19 = 0
        L6e:
            if (r11 >= r9) goto L14a
            r15 = r8[r11]
            r20 = r2
            com.github.mikephil.charting.components.Legend$LegendForm r2 = r15.form
            r21 = r3
            com.github.mikephil.charting.components.Legend$LegendForm r3 = com.github.mikephil.charting.components.Legend.LegendForm.NONE
            if (r2 == r3) goto L7e
            r2 = 1
            goto L7f
        L7e:
            r2 = 0
        L7f:
            float r3 = r15.formSize
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 == 0) goto L8a
            r3 = r20
            goto L90
        L8a:
            float r3 = r15.formSize
            float r3 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r3)
        L90:
            java.lang.String r15 = r15.label
            r22 = r2
            java.util.List<java.lang.Boolean> r2 = r0.mCalculatedLabelBreakPoints
            r23 = r3
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r2.add(r3)
            r2 = -1
            if (r12 != r2) goto La2
            r2 = 0
            goto La4
        La2:
            float r2 = r18 + r21
        La4:
            if (r15 == 0) goto Lc9
            java.util.List<com.github.mikephil.charting.utils.FSize> r3 = r0.mCalculatedLabelSizes
            r18 = r2
            com.github.mikephil.charting.utils.FSize r2 = com.github.mikephil.charting.utils.Utils.calcTextSize(r1, r15)
            r3.add(r2)
            if (r22 == 0) goto Lb6
            float r2 = r4 + r23
            goto Lb7
        Lb6:
            r2 = 0
        Lb7:
            float r2 = r18 + r2
            java.util.List<com.github.mikephil.charting.utils.FSize> r3 = r0.mCalculatedLabelSizes
            java.lang.Object r3 = r3.get(r11)
            com.github.mikephil.charting.utils.FSize r3 = (com.github.mikephil.charting.utils.FSize) r3
            float r3 = r3.width
            float r2 = r2 + r3
            r18 = r2
            r24 = r4
            goto Le5
        Lc9:
            r18 = r2
            java.util.List<com.github.mikephil.charting.utils.FSize> r2 = r0.mCalculatedLabelSizes
            r24 = r4
            r3 = 0
            com.github.mikephil.charting.utils.FSize r4 = com.github.mikephil.charting.utils.FSize.getInstance(r3, r3)
            r2.add(r4)
            if (r22 == 0) goto Ldc
            r3 = r23
            goto Ldd
        Ldc:
            r3 = 0
        Ldd:
            float r2 = r18 + r3
            r3 = -1
            r18 = r2
            if (r12 != r3) goto Le5
            r12 = r11
        Le5:
            if (r15 != 0) goto Leb
            int r2 = r9 + (-1)
            if (r11 != r2) goto Lf0
        Leb:
            r2 = r19
            r17 = 0
            goto Lf3
        Lf0:
            r17 = 0
            goto L13d
        Lf3:
            int r3 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r3 != 0) goto Lf9
            r4 = 0
            goto Lfa
        Lf9:
            r4 = r5
        Lfa:
            if (r7 == 0) goto L124
            if (r3 == 0) goto L124
            float r3 = r6 - r2
            float r19 = r4 + r18
            int r3 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r3 < 0) goto L107
            goto L124
        L107:
            java.util.List<com.github.mikephil.charting.utils.FSize> r3 = r0.mCalculatedLineSizes
            com.github.mikephil.charting.utils.FSize r4 = com.github.mikephil.charting.utils.FSize.getInstance(r2, r10)
            r3.add(r4)
            float r13 = java.lang.Math.max(r13, r2)
            java.util.List<java.lang.Boolean> r2 = r0.mCalculatedLabelBreakPoints
            r3 = -1
            if (r12 <= r3) goto L11b
            r4 = r12
            goto L11c
        L11b:
            r4 = r11
        L11c:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r2.set(r4, r3)
            r2 = r18
            goto L12a
        L124:
            float r4 = r4 + r18
            float r19 = r2 + r4
            r2 = r19
        L12a:
            int r3 = r9 + (-1)
            if (r11 != r3) goto L13b
            java.util.List<com.github.mikephil.charting.utils.FSize> r3 = r0.mCalculatedLineSizes
            com.github.mikephil.charting.utils.FSize r4 = com.github.mikephil.charting.utils.FSize.getInstance(r2, r10)
            r3.add(r4)
            float r13 = java.lang.Math.max(r13, r2)
        L13b:
            r19 = r2
        L13d:
            if (r15 == 0) goto L140
            r12 = -1
        L140:
            int r11 = r11 + 1
            r2 = r20
            r3 = r21
            r4 = r24
            goto L6e
        L14a:
            r0.mNeededWidth = r13
            java.util.List<com.github.mikephil.charting.utils.FSize> r1 = r0.mCalculatedLineSizes
            int r1 = r1.size()
            float r1 = (float) r1
            float r10 = r10 * r1
            java.util.List<com.github.mikephil.charting.utils.FSize> r1 = r0.mCalculatedLineSizes
            int r1 = r1.size()
            if (r1 != 0) goto L15f
            r11 = 0
            goto L167
        L15f:
            java.util.List<com.github.mikephil.charting.utils.FSize> r1 = r0.mCalculatedLineSizes
            int r1 = r1.size()
            int r11 = r1 + (-1)
        L167:
            float r1 = (float) r11
            float r14 = r14 * r1
            float r10 = r10 + r14
            r0.mNeededHeight = r10
            goto L1ef
        L16f:
            r20 = r2
            r21 = r3
            r24 = r4
            r16 = 1
            r17 = 0
            float r2 = com.github.mikephil.charting.utils.Utils.getLineHeight(r1)
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r10 = 0
        L182:
            if (r7 >= r9) goto L1eb
            r11 = r8[r7]
            com.github.mikephil.charting.components.Legend$LegendForm r12 = r11.form
            com.github.mikephil.charting.components.Legend$LegendForm r13 = com.github.mikephil.charting.components.Legend.LegendForm.NONE
            if (r12 == r13) goto L18e
            r12 = 1
            goto L18f
        L18e:
            r12 = 0
        L18f:
            float r13 = r11.formSize
            boolean r13 = java.lang.Float.isNaN(r13)
            if (r13 == 0) goto L19a
            r13 = r20
            goto L1a0
        L19a:
            float r13 = r11.formSize
            float r13 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r13)
        L1a0:
            java.lang.String r11 = r11.label
            if (r10 != 0) goto L1a5
            r5 = 0
        L1a5:
            if (r12 == 0) goto L1ac
            if (r10 == 0) goto L1ab
            float r5 = r5 + r21
        L1ab:
            float r5 = r5 + r13
        L1ac:
            if (r11 == 0) goto L1dc
            if (r12 == 0) goto L1bb
            if (r10 != 0) goto L1bb
            float r5 = r5 + r24
        L1b4:
            r25 = r4
            r4 = r3
            r3 = r5
            r5 = r25
            goto L1c8
        L1bb:
            if (r10 == 0) goto L1b4
            float r3 = java.lang.Math.max(r3, r5)
            float r5 = r2 + r6
            float r4 = r4 + r5
            r5 = r4
            r10 = 0
            r4 = r3
            r3 = 0
        L1c8:
            int r11 = com.github.mikephil.charting.utils.Utils.calcTextWidth(r1, r11)
            float r11 = (float) r11
            float r3 = r3 + r11
            int r11 = r9 + (-1)
            if (r7 >= r11) goto L1d5
            float r11 = r2 + r6
            float r5 = r5 + r11
        L1d5:
            r25 = r5
            r5 = r3
            r3 = r4
            r4 = r25
            goto L1e4
        L1dc:
            float r5 = r5 + r13
            int r10 = r9 + (-1)
            if (r7 >= r10) goto L1e3
            float r5 = r5 + r21
        L1e3:
            r10 = 1
        L1e4:
            float r3 = java.lang.Math.max(r3, r5)
            int r7 = r7 + 1
            goto L182
        L1eb:
            r0.mNeededWidth = r3
            r0.mNeededHeight = r4
        L1ef:
            float r1 = r0.mNeededHeight
            float r2 = r0.mYOffset
            float r1 = r1 + r2
            r0.mNeededHeight = r1
            float r1 = r0.mNeededWidth
            float r2 = r0.mXOffset
            float r1 = r1 + r2
            r0.mNeededWidth = r1
            return
    }

    public java.util.List<java.lang.Boolean> getCalculatedLabelBreakPoints() {
            r1 = this;
            java.util.List<java.lang.Boolean> r0 = r1.mCalculatedLabelBreakPoints
            return r0
    }

    public java.util.List<com.github.mikephil.charting.utils.FSize> getCalculatedLabelSizes() {
            r1 = this;
            java.util.List<com.github.mikephil.charting.utils.FSize> r0 = r1.mCalculatedLabelSizes
            return r0
    }

    public java.util.List<com.github.mikephil.charting.utils.FSize> getCalculatedLineSizes() {
            r1 = this;
            java.util.List<com.github.mikephil.charting.utils.FSize> r0 = r1.mCalculatedLineSizes
            return r0
    }

    public com.github.mikephil.charting.components.Legend.LegendDirection getDirection() {
            r1 = this;
            com.github.mikephil.charting.components.Legend$LegendDirection r0 = r1.mDirection
            return r0
    }

    public com.github.mikephil.charting.components.LegendEntry[] getEntries() {
            r1 = this;
            com.github.mikephil.charting.components.LegendEntry[] r0 = r1.mEntries
            return r0
    }

    public com.github.mikephil.charting.components.LegendEntry[] getExtraEntries() {
            r1 = this;
            com.github.mikephil.charting.components.LegendEntry[] r0 = r1.mExtraEntries
            return r0
    }

    public com.github.mikephil.charting.components.Legend.LegendForm getForm() {
            r1 = this;
            com.github.mikephil.charting.components.Legend$LegendForm r0 = r1.mShape
            return r0
    }

    public android.graphics.DashPathEffect getFormLineDashEffect() {
            r1 = this;
            android.graphics.DashPathEffect r0 = r1.mFormLineDashEffect
            return r0
    }

    public float getFormLineWidth() {
            r1 = this;
            float r0 = r1.mFormLineWidth
            return r0
    }

    public float getFormSize() {
            r1 = this;
            float r0 = r1.mFormSize
            return r0
    }

    public float getFormToTextSpace() {
            r1 = this;
            float r0 = r1.mFormToTextSpace
            return r0
    }

    public com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment getHorizontalAlignment() {
            r1 = this;
            com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r0 = r1.mHorizontalAlignment
            return r0
    }

    public float getMaxSizePercent() {
            r1 = this;
            float r0 = r1.mMaxSizePercent
            return r0
    }

    public float getMaximumEntryHeight(android.graphics.Paint r7) {
            r6 = this;
            com.github.mikephil.charting.components.LegendEntry[] r0 = r6.mEntries
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L5:
            if (r3 >= r1) goto L1b
            r4 = r0[r3]
            java.lang.String r4 = r4.label
            if (r4 != 0) goto Le
            goto L18
        Le:
            int r4 = com.github.mikephil.charting.utils.Utils.calcTextHeight(r7, r4)
            float r4 = (float) r4
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L18
            r2 = r4
        L18:
            int r3 = r3 + 1
            goto L5
        L1b:
            return r2
    }

    public float getMaximumEntryWidth(android.graphics.Paint r10) {
            r9 = this;
            float r0 = r9.mFormToTextSpace
            float r0 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r0)
            com.github.mikephil.charting.components.LegendEntry[] r1 = r9.mEntries
            int r2 = r1.length
            r3 = 0
            r4 = 0
            r4 = 0
            r5 = 0
        Ld:
            if (r5 >= r2) goto L39
            r6 = r1[r5]
            float r7 = r6.formSize
            boolean r7 = java.lang.Float.isNaN(r7)
            if (r7 == 0) goto L1c
            float r7 = r9.mFormSize
            goto L1e
        L1c:
            float r7 = r6.formSize
        L1e:
            float r7 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(r7)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 <= 0) goto L27
            r4 = r7
        L27:
            java.lang.String r6 = r6.label
            if (r6 != 0) goto L2c
            goto L36
        L2c:
            int r6 = com.github.mikephil.charting.utils.Utils.calcTextWidth(r10, r6)
            float r6 = (float) r6
            int r7 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r7 <= 0) goto L36
            r3 = r6
        L36:
            int r5 = r5 + 1
            goto Ld
        L39:
            float r3 = r3 + r4
            float r3 = r3 + r0
            return r3
    }

    public com.github.mikephil.charting.components.Legend.LegendOrientation getOrientation() {
            r1 = this;
            com.github.mikephil.charting.components.Legend$LegendOrientation r0 = r1.mOrientation
            return r0
    }

    public float getStackSpace() {
            r1 = this;
            float r0 = r1.mStackSpace
            return r0
    }

    public com.github.mikephil.charting.components.Legend.LegendVerticalAlignment getVerticalAlignment() {
            r1 = this;
            com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r0 = r1.mVerticalAlignment
            return r0
    }

    public float getXEntrySpace() {
            r1 = this;
            float r0 = r1.mXEntrySpace
            return r0
    }

    public float getYEntrySpace() {
            r1 = this;
            float r0 = r1.mYEntrySpace
            return r0
    }

    public boolean isDrawInsideEnabled() {
            r1 = this;
            boolean r0 = r1.mDrawInside
            return r0
    }

    public boolean isLegendCustom() {
            r1 = this;
            boolean r0 = r1.mIsLegendCustom
            return r0
    }

    public boolean isWordWrapEnabled() {
            r1 = this;
            boolean r0 = r1.mWordWrapEnabled
            return r0
    }

    public void resetCustom() {
            r1 = this;
            r0 = 0
            r1.mIsLegendCustom = r0
            return
    }

    public void setCustom(java.util.List<com.github.mikephil.charting.components.LegendEntry> r2) {
            r1 = this;
            int r0 = r2.size()
            com.github.mikephil.charting.components.LegendEntry[] r0 = new com.github.mikephil.charting.components.LegendEntry[r0]
            java.lang.Object[] r2 = r2.toArray(r0)
            com.github.mikephil.charting.components.LegendEntry[] r2 = (com.github.mikephil.charting.components.LegendEntry[]) r2
            r1.mEntries = r2
            r2 = 1
            r1.mIsLegendCustom = r2
            return
    }

    public void setCustom(com.github.mikephil.charting.components.LegendEntry[] r1) {
            r0 = this;
            r0.mEntries = r1
            r1 = 1
            r0.mIsLegendCustom = r1
            return
    }

    public void setDirection(com.github.mikephil.charting.components.Legend.LegendDirection r1) {
            r0 = this;
            r0.mDirection = r1
            return
    }

    public void setDrawInside(boolean r1) {
            r0 = this;
            r0.mDrawInside = r1
            return
    }

    public void setEntries(java.util.List<com.github.mikephil.charting.components.LegendEntry> r2) {
            r1 = this;
            int r0 = r2.size()
            com.github.mikephil.charting.components.LegendEntry[] r0 = new com.github.mikephil.charting.components.LegendEntry[r0]
            java.lang.Object[] r2 = r2.toArray(r0)
            com.github.mikephil.charting.components.LegendEntry[] r2 = (com.github.mikephil.charting.components.LegendEntry[]) r2
            r1.mEntries = r2
            return
    }

    public void setExtra(java.util.List<com.github.mikephil.charting.components.LegendEntry> r2) {
            r1 = this;
            int r0 = r2.size()
            com.github.mikephil.charting.components.LegendEntry[] r0 = new com.github.mikephil.charting.components.LegendEntry[r0]
            java.lang.Object[] r2 = r2.toArray(r0)
            com.github.mikephil.charting.components.LegendEntry[] r2 = (com.github.mikephil.charting.components.LegendEntry[]) r2
            r1.mExtraEntries = r2
            return
    }

    public void setExtra(int[] r6, java.lang.String[] r7) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r6.length
            int r3 = r7.length
            int r2 = java.lang.Math.min(r2, r3)
            if (r1 >= r2) goto L37
            com.github.mikephil.charting.components.LegendEntry r2 = new com.github.mikephil.charting.components.LegendEntry
            r2.<init>()
            r3 = r6[r1]
            r2.formColor = r3
            r4 = r7[r1]
            r2.label = r4
            r4 = 1122868(0x112234, float:1.573473E-39)
            if (r3 == r4) goto L2d
            if (r3 != 0) goto L23
            goto L2d
        L23:
            r4 = 1122867(0x112233, float:1.573472E-39)
            if (r3 != r4) goto L31
            com.github.mikephil.charting.components.Legend$LegendForm r3 = com.github.mikephil.charting.components.Legend.LegendForm.EMPTY
            r2.form = r3
            goto L31
        L2d:
            com.github.mikephil.charting.components.Legend$LegendForm r3 = com.github.mikephil.charting.components.Legend.LegendForm.NONE
            r2.form = r3
        L31:
            r0.add(r2)
            int r1 = r1 + 1
            goto L6
        L37:
            int r6 = r0.size()
            com.github.mikephil.charting.components.LegendEntry[] r6 = new com.github.mikephil.charting.components.LegendEntry[r6]
            java.lang.Object[] r6 = r0.toArray(r6)
            com.github.mikephil.charting.components.LegendEntry[] r6 = (com.github.mikephil.charting.components.LegendEntry[]) r6
            r5.mExtraEntries = r6
            return
    }

    public void setExtra(com.github.mikephil.charting.components.LegendEntry[] r1) {
            r0 = this;
            if (r1 != 0) goto L5
            r1 = 0
            com.github.mikephil.charting.components.LegendEntry[] r1 = new com.github.mikephil.charting.components.LegendEntry[r1]
        L5:
            r0.mExtraEntries = r1
            return
    }

    public void setForm(com.github.mikephil.charting.components.Legend.LegendForm r1) {
            r0 = this;
            r0.mShape = r1
            return
    }

    public void setFormLineDashEffect(android.graphics.DashPathEffect r1) {
            r0 = this;
            r0.mFormLineDashEffect = r1
            return
    }

    public void setFormLineWidth(float r1) {
            r0 = this;
            r0.mFormLineWidth = r1
            return
    }

    public void setFormSize(float r1) {
            r0 = this;
            r0.mFormSize = r1
            return
    }

    public void setFormToTextSpace(float r1) {
            r0 = this;
            r0.mFormToTextSpace = r1
            return
    }

    public void setHorizontalAlignment(com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment r1) {
            r0 = this;
            r0.mHorizontalAlignment = r1
            return
    }

    public void setMaxSizePercent(float r1) {
            r0 = this;
            r0.mMaxSizePercent = r1
            return
    }

    public void setOrientation(com.github.mikephil.charting.components.Legend.LegendOrientation r1) {
            r0 = this;
            r0.mOrientation = r1
            return
    }

    public void setStackSpace(float r1) {
            r0 = this;
            r0.mStackSpace = r1
            return
    }

    public void setVerticalAlignment(com.github.mikephil.charting.components.Legend.LegendVerticalAlignment r1) {
            r0 = this;
            r0.mVerticalAlignment = r1
            return
    }

    public void setWordWrapEnabled(boolean r1) {
            r0 = this;
            r0.mWordWrapEnabled = r1
            return
    }

    public void setXEntrySpace(float r1) {
            r0 = this;
            r0.mXEntrySpace = r1
            return
    }

    public void setYEntrySpace(float r1) {
            r0 = this;
            r0.mYEntrySpace = r1
            return
    }
}
