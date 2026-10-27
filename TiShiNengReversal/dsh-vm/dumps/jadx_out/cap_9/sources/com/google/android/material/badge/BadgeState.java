package com.google.android.material.badge;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class BadgeState {
    private static final java.lang.String BADGE_RESOURCE_TAG = "badge";
    final float badgeHeight;
    final float badgeRadius;
    final float badgeWidth;
    final float badgeWithTextHeight;
    final float badgeWithTextRadius;
    final float badgeWithTextWidth;
    private final com.google.android.material.badge.BadgeState.State currentState;
    final int horizontalInset;
    final int horizontalInsetWithText;
    int offsetAlignmentMode;
    private final com.google.android.material.badge.BadgeState.State overridingState;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class State implements android.os.Parcelable {
        private static final int BADGE_NUMBER_NONE = -1;
        public static final android.os.Parcelable.Creator<com.google.android.material.badge.BadgeState.State> CREATOR = null;
        private static final int NOT_SET = -2;

        @androidx.annotation.Dimension(unit = 1)
        private java.lang.Integer additionalHorizontalOffset;

        @androidx.annotation.Dimension(unit = 1)
        private java.lang.Integer additionalVerticalOffset;
        private int alpha;
        private java.lang.Boolean autoAdjustToWithinGrandparentBounds;

        @androidx.annotation.ColorInt
        private java.lang.Integer backgroundColor;
        private java.lang.Integer badgeGravity;

        @androidx.annotation.Px
        private java.lang.Integer badgeHorizontalPadding;

        @androidx.annotation.XmlRes
        private int badgeResId;

        @androidx.annotation.StyleRes
        private java.lang.Integer badgeShapeAppearanceOverlayResId;

        @androidx.annotation.StyleRes
        private java.lang.Integer badgeShapeAppearanceResId;

        @androidx.annotation.StyleRes
        private java.lang.Integer badgeTextAppearanceResId;

        @androidx.annotation.ColorInt
        private java.lang.Integer badgeTextColor;

        @androidx.annotation.Px
        private java.lang.Integer badgeVerticalPadding;

        @androidx.annotation.StyleRes
        private java.lang.Integer badgeWithTextShapeAppearanceOverlayResId;

        @androidx.annotation.StyleRes
        private java.lang.Integer badgeWithTextShapeAppearanceResId;

        @androidx.annotation.StringRes
        private int contentDescriptionExceedsMaxBadgeNumberRes;

        @androidx.annotation.Nullable
        private java.lang.CharSequence contentDescriptionForText;

        @androidx.annotation.Nullable
        private java.lang.CharSequence contentDescriptionNumberless;

        @androidx.annotation.PluralsRes
        private int contentDescriptionQuantityStrings;

        @androidx.annotation.Dimension(unit = 1)
        private java.lang.Integer horizontalOffsetWithText;

        @androidx.annotation.Dimension(unit = 1)
        private java.lang.Integer horizontalOffsetWithoutText;
        private java.lang.Boolean isVisible;

        @androidx.annotation.Dimension(unit = 1)
        private java.lang.Integer largeFontVerticalOffsetAdjustment;
        private int maxCharacterCount;
        private int maxNumber;
        private int number;
        private java.util.Locale numberLocale;

        @androidx.annotation.Nullable
        private java.lang.String text;

        @androidx.annotation.Dimension(unit = 1)
        private java.lang.Integer verticalOffsetWithText;

        @androidx.annotation.Dimension(unit = 1)
        private java.lang.Integer verticalOffsetWithoutText;


        static {
                com.google.android.material.badge.BadgeState$State$1 r0 = new com.google.android.material.badge.BadgeState$State$1
                r0.<init>()
                com.google.android.material.badge.BadgeState.State.CREATOR = r0
                return
        }

        public State() {
                r1 = this;
                r1.<init>()
                r0 = 255(0xff, float:3.57E-43)
                r1.alpha = r0
                r0 = -2
                r1.number = r0
                r1.maxCharacterCount = r0
                r1.maxNumber = r0
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                r1.isVisible = r0
                return
        }

        State(@androidx.annotation.NonNull android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                r0 = 255(0xff, float:3.57E-43)
                r1.alpha = r0
                r0 = -2
                r1.number = r0
                r1.maxCharacterCount = r0
                r1.maxNumber = r0
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                r1.isVisible = r0
                int r0 = r2.readInt()
                r1.badgeResId = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.backgroundColor = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.badgeTextColor = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.badgeTextAppearanceResId = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.badgeShapeAppearanceResId = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.badgeShapeAppearanceOverlayResId = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.badgeWithTextShapeAppearanceResId = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.badgeWithTextShapeAppearanceOverlayResId = r0
                int r0 = r2.readInt()
                r1.alpha = r0
                java.lang.String r0 = r2.readString()
                r1.text = r0
                int r0 = r2.readInt()
                r1.number = r0
                int r0 = r2.readInt()
                r1.maxCharacterCount = r0
                int r0 = r2.readInt()
                r1.maxNumber = r0
                java.lang.String r0 = r2.readString()
                r1.contentDescriptionForText = r0
                java.lang.String r0 = r2.readString()
                r1.contentDescriptionNumberless = r0
                int r0 = r2.readInt()
                r1.contentDescriptionQuantityStrings = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.badgeGravity = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.badgeHorizontalPadding = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.badgeVerticalPadding = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.horizontalOffsetWithoutText = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.verticalOffsetWithoutText = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.horizontalOffsetWithText = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.verticalOffsetWithText = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.largeFontVerticalOffsetAdjustment = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.additionalHorizontalOffset = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.additionalVerticalOffset = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                r1.isVisible = r0
                java.io.Serializable r0 = r2.readSerializable()
                java.util.Locale r0 = (java.util.Locale) r0
                r1.numberLocale = r0
                java.io.Serializable r2 = r2.readSerializable()
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                r1.autoAdjustToWithinGrandparentBounds = r2
                return
        }

        static /* synthetic */ int access$000(com.google.android.material.badge.BadgeState.State r0) {
                int r0 = r0.badgeResId
                return r0
        }

        static /* synthetic */ int access$002(com.google.android.material.badge.BadgeState.State r0, int r1) {
                r0.badgeResId = r1
                return r1
        }

        static /* synthetic */ int access$100(com.google.android.material.badge.BadgeState.State r0) {
                int r0 = r0.alpha
                return r0
        }

        static /* synthetic */ int access$1000(com.google.android.material.badge.BadgeState.State r0) {
                int r0 = r0.maxNumber
                return r0
        }

        static /* synthetic */ int access$1002(com.google.android.material.badge.BadgeState.State r0, int r1) {
                r0.maxNumber = r1
                return r1
        }

        static /* synthetic */ int access$102(com.google.android.material.badge.BadgeState.State r0, int r1) {
                r0.alpha = r1
                return r1
        }

        static /* synthetic */ java.lang.Integer access$1100(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.badgeShapeAppearanceResId
                return r0
        }

        static /* synthetic */ java.lang.Integer access$1102(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.badgeShapeAppearanceResId = r1
                return r1
        }

        static /* synthetic */ java.lang.Integer access$1200(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.badgeShapeAppearanceOverlayResId
                return r0
        }

        static /* synthetic */ java.lang.Integer access$1202(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.badgeShapeAppearanceOverlayResId = r1
                return r1
        }

        static /* synthetic */ java.lang.Integer access$1300(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.badgeWithTextShapeAppearanceResId
                return r0
        }

        static /* synthetic */ java.lang.Integer access$1302(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.badgeWithTextShapeAppearanceResId = r1
                return r1
        }

        static /* synthetic */ java.lang.Integer access$1400(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.badgeWithTextShapeAppearanceOverlayResId
                return r0
        }

        static /* synthetic */ java.lang.Integer access$1402(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.badgeWithTextShapeAppearanceOverlayResId = r1
                return r1
        }

        static /* synthetic */ java.lang.Integer access$1500(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.backgroundColor
                return r0
        }

        static /* synthetic */ java.lang.Integer access$1502(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.backgroundColor = r1
                return r1
        }

        static /* synthetic */ java.lang.Integer access$1600(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.badgeTextAppearanceResId
                return r0
        }

        static /* synthetic */ java.lang.Integer access$1602(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.badgeTextAppearanceResId = r1
                return r1
        }

        static /* synthetic */ java.lang.Integer access$1700(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.badgeTextColor
                return r0
        }

        static /* synthetic */ java.lang.Integer access$1702(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.badgeTextColor = r1
                return r1
        }

        static /* synthetic */ java.lang.Integer access$1800(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.badgeGravity
                return r0
        }

        static /* synthetic */ java.lang.Integer access$1802(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.badgeGravity = r1
                return r1
        }

        static /* synthetic */ java.lang.Integer access$1900(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.badgeHorizontalPadding
                return r0
        }

        static /* synthetic */ java.lang.Integer access$1902(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.badgeHorizontalPadding = r1
                return r1
        }

        static /* synthetic */ int access$200(com.google.android.material.badge.BadgeState.State r0) {
                int r0 = r0.number
                return r0
        }

        static /* synthetic */ java.lang.Integer access$2000(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.badgeVerticalPadding
                return r0
        }

        static /* synthetic */ java.lang.Integer access$2002(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.badgeVerticalPadding = r1
                return r1
        }

        static /* synthetic */ int access$202(com.google.android.material.badge.BadgeState.State r0, int r1) {
                r0.number = r1
                return r1
        }

        static /* synthetic */ java.lang.Integer access$2100(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.horizontalOffsetWithoutText
                return r0
        }

        static /* synthetic */ java.lang.Integer access$2102(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.horizontalOffsetWithoutText = r1
                return r1
        }

        static /* synthetic */ java.lang.Integer access$2200(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.verticalOffsetWithoutText
                return r0
        }

        static /* synthetic */ java.lang.Integer access$2202(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.verticalOffsetWithoutText = r1
                return r1
        }

        static /* synthetic */ java.lang.Integer access$2300(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.horizontalOffsetWithText
                return r0
        }

        static /* synthetic */ java.lang.Integer access$2302(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.horizontalOffsetWithText = r1
                return r1
        }

        static /* synthetic */ java.lang.Integer access$2400(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.verticalOffsetWithText
                return r0
        }

        static /* synthetic */ java.lang.Integer access$2402(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.verticalOffsetWithText = r1
                return r1
        }

        static /* synthetic */ java.lang.Integer access$2500(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.largeFontVerticalOffsetAdjustment
                return r0
        }

        static /* synthetic */ java.lang.Integer access$2502(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.largeFontVerticalOffsetAdjustment = r1
                return r1
        }

        static /* synthetic */ java.lang.Integer access$2600(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.additionalHorizontalOffset
                return r0
        }

        static /* synthetic */ java.lang.Integer access$2602(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.additionalHorizontalOffset = r1
                return r1
        }

        static /* synthetic */ java.lang.Integer access$2700(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Integer r0 = r0.additionalVerticalOffset
                return r0
        }

        static /* synthetic */ java.lang.Integer access$2702(com.google.android.material.badge.BadgeState.State r0, java.lang.Integer r1) {
                r0.additionalVerticalOffset = r1
                return r1
        }

        static /* synthetic */ java.lang.Boolean access$2800(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Boolean r0 = r0.autoAdjustToWithinGrandparentBounds
                return r0
        }

        static /* synthetic */ java.lang.Boolean access$2802(com.google.android.material.badge.BadgeState.State r0, java.lang.Boolean r1) {
                r0.autoAdjustToWithinGrandparentBounds = r1
                return r1
        }

        static /* synthetic */ java.util.Locale access$2900(com.google.android.material.badge.BadgeState.State r0) {
                java.util.Locale r0 = r0.numberLocale
                return r0
        }

        static /* synthetic */ java.util.Locale access$2902(com.google.android.material.badge.BadgeState.State r0, java.util.Locale r1) {
                r0.numberLocale = r1
                return r1
        }

        static /* synthetic */ java.lang.String access$300(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.String r0 = r0.text
                return r0
        }

        static /* synthetic */ java.lang.String access$302(com.google.android.material.badge.BadgeState.State r0, java.lang.String r1) {
                r0.text = r1
                return r1
        }

        static /* synthetic */ java.lang.CharSequence access$400(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.CharSequence r0 = r0.contentDescriptionForText
                return r0
        }

        static /* synthetic */ java.lang.CharSequence access$402(com.google.android.material.badge.BadgeState.State r0, java.lang.CharSequence r1) {
                r0.contentDescriptionForText = r1
                return r1
        }

        static /* synthetic */ java.lang.CharSequence access$500(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.CharSequence r0 = r0.contentDescriptionNumberless
                return r0
        }

        static /* synthetic */ java.lang.CharSequence access$502(com.google.android.material.badge.BadgeState.State r0, java.lang.CharSequence r1) {
                r0.contentDescriptionNumberless = r1
                return r1
        }

        static /* synthetic */ int access$600(com.google.android.material.badge.BadgeState.State r0) {
                int r0 = r0.contentDescriptionQuantityStrings
                return r0
        }

        static /* synthetic */ int access$602(com.google.android.material.badge.BadgeState.State r0, int r1) {
                r0.contentDescriptionQuantityStrings = r1
                return r1
        }

        static /* synthetic */ int access$700(com.google.android.material.badge.BadgeState.State r0) {
                int r0 = r0.contentDescriptionExceedsMaxBadgeNumberRes
                return r0
        }

        static /* synthetic */ int access$702(com.google.android.material.badge.BadgeState.State r0, int r1) {
                r0.contentDescriptionExceedsMaxBadgeNumberRes = r1
                return r1
        }

        static /* synthetic */ java.lang.Boolean access$800(com.google.android.material.badge.BadgeState.State r0) {
                java.lang.Boolean r0 = r0.isVisible
                return r0
        }

        static /* synthetic */ java.lang.Boolean access$802(com.google.android.material.badge.BadgeState.State r0, java.lang.Boolean r1) {
                r0.isVisible = r1
                return r1
        }

        static /* synthetic */ int access$900(com.google.android.material.badge.BadgeState.State r0) {
                int r0 = r0.maxCharacterCount
                return r0
        }

        static /* synthetic */ int access$902(com.google.android.material.badge.BadgeState.State r0, int r1) {
                r0.maxCharacterCount = r1
                return r1
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r2, int r3) {
                r1 = this;
                int r3 = r1.badgeResId
                r2.writeInt(r3)
                java.lang.Integer r3 = r1.backgroundColor
                r2.writeSerializable(r3)
                java.lang.Integer r3 = r1.badgeTextColor
                r2.writeSerializable(r3)
                java.lang.Integer r3 = r1.badgeTextAppearanceResId
                r2.writeSerializable(r3)
                java.lang.Integer r3 = r1.badgeShapeAppearanceResId
                r2.writeSerializable(r3)
                java.lang.Integer r3 = r1.badgeShapeAppearanceOverlayResId
                r2.writeSerializable(r3)
                java.lang.Integer r3 = r1.badgeWithTextShapeAppearanceResId
                r2.writeSerializable(r3)
                java.lang.Integer r3 = r1.badgeWithTextShapeAppearanceOverlayResId
                r2.writeSerializable(r3)
                int r3 = r1.alpha
                r2.writeInt(r3)
                java.lang.String r3 = r1.text
                r2.writeString(r3)
                int r3 = r1.number
                r2.writeInt(r3)
                int r3 = r1.maxCharacterCount
                r2.writeInt(r3)
                int r3 = r1.maxNumber
                r2.writeInt(r3)
                java.lang.CharSequence r3 = r1.contentDescriptionForText
                r0 = 0
                if (r3 == 0) goto L4b
                java.lang.String r3 = r3.toString()
                goto L4c
            L4b:
                r3 = r0
            L4c:
                r2.writeString(r3)
                java.lang.CharSequence r3 = r1.contentDescriptionNumberless
                if (r3 == 0) goto L57
                java.lang.String r0 = r3.toString()
            L57:
                r2.writeString(r0)
                int r3 = r1.contentDescriptionQuantityStrings
                r2.writeInt(r3)
                java.lang.Integer r3 = r1.badgeGravity
                r2.writeSerializable(r3)
                java.lang.Integer r3 = r1.badgeHorizontalPadding
                r2.writeSerializable(r3)
                java.lang.Integer r3 = r1.badgeVerticalPadding
                r2.writeSerializable(r3)
                java.lang.Integer r3 = r1.horizontalOffsetWithoutText
                r2.writeSerializable(r3)
                java.lang.Integer r3 = r1.verticalOffsetWithoutText
                r2.writeSerializable(r3)
                java.lang.Integer r3 = r1.horizontalOffsetWithText
                r2.writeSerializable(r3)
                java.lang.Integer r3 = r1.verticalOffsetWithText
                r2.writeSerializable(r3)
                java.lang.Integer r3 = r1.largeFontVerticalOffsetAdjustment
                r2.writeSerializable(r3)
                java.lang.Integer r3 = r1.additionalHorizontalOffset
                r2.writeSerializable(r3)
                java.lang.Integer r3 = r1.additionalVerticalOffset
                r2.writeSerializable(r3)
                java.lang.Boolean r3 = r1.isVisible
                r2.writeSerializable(r3)
                java.util.Locale r3 = r1.numberLocale
                r2.writeSerializable(r3)
                java.lang.Boolean r3 = r1.autoAdjustToWithinGrandparentBounds
                r2.writeSerializable(r3)
                return
        }
    }

    BadgeState(android.content.Context r7, @androidx.annotation.XmlRes int r8, @androidx.annotation.AttrRes int r9, @androidx.annotation.StyleRes int r10, @androidx.annotation.Nullable com.google.android.material.badge.BadgeState.State r11) {
            r6 = this;
            r6.<init>()
            com.google.android.material.badge.BadgeState$State r0 = new com.google.android.material.badge.BadgeState$State
            r0.<init>()
            r6.currentState = r0
            if (r11 != 0) goto L11
            com.google.android.material.badge.BadgeState$State r11 = new com.google.android.material.badge.BadgeState$State
            r11.<init>()
        L11:
            if (r8 == 0) goto L16
            com.google.android.material.badge.BadgeState.State.access$002(r11, r8)
        L16:
            int r8 = com.google.android.material.badge.BadgeState.State.access$000(r11)
            android.content.res.TypedArray r8 = r6.generateTypedArray(r7, r8, r9, r10)
            android.content.res.Resources r9 = r7.getResources()
            int r10 = com.google.android.material.R.styleable.Badge_badgeRadius
            r1 = -1
            int r10 = r8.getDimensionPixelSize(r10, r1)
            float r10 = (float) r10
            r6.badgeRadius = r10
            android.content.res.Resources r10 = r7.getResources()
            int r2 = com.google.android.material.R.dimen.mtrl_badge_horizontal_edge_offset
            int r10 = r10.getDimensionPixelSize(r2)
            r6.horizontalInset = r10
            android.content.res.Resources r10 = r7.getResources()
            int r2 = com.google.android.material.R.dimen.mtrl_badge_text_horizontal_edge_offset
            int r10 = r10.getDimensionPixelSize(r2)
            r6.horizontalInsetWithText = r10
            int r10 = com.google.android.material.R.styleable.Badge_badgeWithTextRadius
            int r10 = r8.getDimensionPixelSize(r10, r1)
            float r10 = (float) r10
            r6.badgeWithTextRadius = r10
            int r10 = com.google.android.material.R.styleable.Badge_badgeWidth
            int r2 = com.google.android.material.R.dimen.m3_badge_size
            float r3 = r9.getDimension(r2)
            float r10 = r8.getDimension(r10, r3)
            r6.badgeWidth = r10
            int r10 = com.google.android.material.R.styleable.Badge_badgeWithTextWidth
            int r3 = com.google.android.material.R.dimen.m3_badge_with_text_size
            float r4 = r9.getDimension(r3)
            float r10 = r8.getDimension(r10, r4)
            r6.badgeWithTextWidth = r10
            int r10 = com.google.android.material.R.styleable.Badge_badgeHeight
            float r2 = r9.getDimension(r2)
            float r10 = r8.getDimension(r10, r2)
            r6.badgeHeight = r10
            int r10 = com.google.android.material.R.styleable.Badge_badgeWithTextHeight
            float r2 = r9.getDimension(r3)
            float r10 = r8.getDimension(r10, r2)
            r6.badgeWithTextHeight = r10
            int r10 = com.google.android.material.R.styleable.Badge_offsetAlignmentMode
            r2 = 1
            int r10 = r8.getInt(r10, r2)
            r6.offsetAlignmentMode = r10
            int r10 = com.google.android.material.badge.BadgeState.State.access$100(r11)
            r3 = -2
            if (r10 != r3) goto L94
            r10 = 255(0xff, float:3.57E-43)
            goto L98
        L94:
            int r10 = com.google.android.material.badge.BadgeState.State.access$100(r11)
        L98:
            com.google.android.material.badge.BadgeState.State.access$102(r0, r10)
            int r10 = com.google.android.material.badge.BadgeState.State.access$200(r11)
            r4 = 0
            if (r10 == r3) goto Laa
            int r10 = com.google.android.material.badge.BadgeState.State.access$200(r11)
            com.google.android.material.badge.BadgeState.State.access$202(r0, r10)
            goto Lbd
        Laa:
            int r10 = com.google.android.material.R.styleable.Badge_number
            boolean r5 = r8.hasValue(r10)
            if (r5 == 0) goto Lba
            int r10 = r8.getInt(r10, r4)
            com.google.android.material.badge.BadgeState.State.access$202(r0, r10)
            goto Lbd
        Lba:
            com.google.android.material.badge.BadgeState.State.access$202(r0, r1)
        Lbd:
            java.lang.String r10 = com.google.android.material.badge.BadgeState.State.access$300(r11)
            if (r10 == 0) goto Lcb
            java.lang.String r10 = com.google.android.material.badge.BadgeState.State.access$300(r11)
            com.google.android.material.badge.BadgeState.State.access$302(r0, r10)
            goto Lda
        Lcb:
            int r10 = com.google.android.material.R.styleable.Badge_badgeText
            boolean r1 = r8.hasValue(r10)
            if (r1 == 0) goto Lda
            java.lang.String r10 = r8.getString(r10)
            com.google.android.material.badge.BadgeState.State.access$302(r0, r10)
        Lda:
            java.lang.CharSequence r10 = com.google.android.material.badge.BadgeState.State.access$400(r11)
            com.google.android.material.badge.BadgeState.State.access$402(r0, r10)
            java.lang.CharSequence r10 = com.google.android.material.badge.BadgeState.State.access$500(r11)
            if (r10 != 0) goto Lee
            int r10 = com.google.android.material.R.string.mtrl_badge_numberless_content_description
            java.lang.String r10 = r7.getString(r10)
            goto Lf2
        Lee:
            java.lang.CharSequence r10 = com.google.android.material.badge.BadgeState.State.access$500(r11)
        Lf2:
            com.google.android.material.badge.BadgeState.State.access$502(r0, r10)
            int r10 = com.google.android.material.badge.BadgeState.State.access$600(r11)
            if (r10 != 0) goto Lfe
            int r10 = com.google.android.material.R.plurals.mtrl_badge_content_description
            goto L102
        Lfe:
            int r10 = com.google.android.material.badge.BadgeState.State.access$600(r11)
        L102:
            com.google.android.material.badge.BadgeState.State.access$602(r0, r10)
            int r10 = com.google.android.material.badge.BadgeState.State.access$700(r11)
            if (r10 != 0) goto L10e
            int r10 = com.google.android.material.R.string.mtrl_exceed_max_badge_number_content_description
            goto L112
        L10e:
            int r10 = com.google.android.material.badge.BadgeState.State.access$700(r11)
        L112:
            com.google.android.material.badge.BadgeState.State.access$702(r0, r10)
            java.lang.Boolean r10 = com.google.android.material.badge.BadgeState.State.access$800(r11)
            if (r10 == 0) goto L127
            java.lang.Boolean r10 = com.google.android.material.badge.BadgeState.State.access$800(r11)
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L126
            goto L127
        L126:
            r2 = 0
        L127:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r2)
            com.google.android.material.badge.BadgeState.State.access$802(r0, r10)
            int r10 = com.google.android.material.badge.BadgeState.State.access$900(r11)
            if (r10 != r3) goto L13b
            int r10 = com.google.android.material.R.styleable.Badge_maxCharacterCount
            int r10 = r8.getInt(r10, r3)
            goto L13f
        L13b:
            int r10 = com.google.android.material.badge.BadgeState.State.access$900(r11)
        L13f:
            com.google.android.material.badge.BadgeState.State.access$902(r0, r10)
            int r10 = com.google.android.material.badge.BadgeState.State.access$1000(r11)
            if (r10 != r3) goto L14f
            int r10 = com.google.android.material.R.styleable.Badge_maxNumber
            int r10 = r8.getInt(r10, r3)
            goto L153
        L14f:
            int r10 = com.google.android.material.badge.BadgeState.State.access$1000(r11)
        L153:
            com.google.android.material.badge.BadgeState.State.access$1002(r0, r10)
            java.lang.Integer r10 = com.google.android.material.badge.BadgeState.State.access$1100(r11)
            if (r10 != 0) goto L165
            int r10 = com.google.android.material.R.styleable.Badge_badgeShapeAppearance
            int r1 = com.google.android.material.R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full
            int r10 = r8.getResourceId(r10, r1)
            goto L16d
        L165:
            java.lang.Integer r10 = com.google.android.material.badge.BadgeState.State.access$1100(r11)
            int r10 = r10.intValue()
        L16d:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            com.google.android.material.badge.BadgeState.State.access$1102(r0, r10)
            java.lang.Integer r10 = com.google.android.material.badge.BadgeState.State.access$1200(r11)
            if (r10 != 0) goto L181
            int r10 = com.google.android.material.R.styleable.Badge_badgeShapeAppearanceOverlay
            int r10 = r8.getResourceId(r10, r4)
            goto L189
        L181:
            java.lang.Integer r10 = com.google.android.material.badge.BadgeState.State.access$1200(r11)
            int r10 = r10.intValue()
        L189:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            com.google.android.material.badge.BadgeState.State.access$1202(r0, r10)
            java.lang.Integer r10 = com.google.android.material.badge.BadgeState.State.access$1300(r11)
            if (r10 != 0) goto L19f
            int r10 = com.google.android.material.R.styleable.Badge_badgeWithTextShapeAppearance
            int r1 = com.google.android.material.R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full
            int r10 = r8.getResourceId(r10, r1)
            goto L1a7
        L19f:
            java.lang.Integer r10 = com.google.android.material.badge.BadgeState.State.access$1300(r11)
            int r10 = r10.intValue()
        L1a7:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            com.google.android.material.badge.BadgeState.State.access$1302(r0, r10)
            java.lang.Integer r10 = com.google.android.material.badge.BadgeState.State.access$1400(r11)
            if (r10 != 0) goto L1bb
            int r10 = com.google.android.material.R.styleable.Badge_badgeWithTextShapeAppearanceOverlay
            int r10 = r8.getResourceId(r10, r4)
            goto L1c3
        L1bb:
            java.lang.Integer r10 = com.google.android.material.badge.BadgeState.State.access$1400(r11)
            int r10 = r10.intValue()
        L1c3:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            com.google.android.material.badge.BadgeState.State.access$1402(r0, r10)
            java.lang.Integer r10 = com.google.android.material.badge.BadgeState.State.access$1500(r11)
            if (r10 != 0) goto L1d7
            int r10 = com.google.android.material.R.styleable.Badge_backgroundColor
            int r10 = readColorFromAttributes(r7, r8, r10)
            goto L1df
        L1d7:
            java.lang.Integer r10 = com.google.android.material.badge.BadgeState.State.access$1500(r11)
            int r10 = r10.intValue()
        L1df:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            com.google.android.material.badge.BadgeState.State.access$1502(r0, r10)
            java.lang.Integer r10 = com.google.android.material.badge.BadgeState.State.access$1600(r11)
            if (r10 != 0) goto L1f5
            int r10 = com.google.android.material.R.styleable.Badge_badgeTextAppearance
            int r1 = com.google.android.material.R.style.TextAppearance_MaterialComponents_Badge
            int r10 = r8.getResourceId(r10, r1)
            goto L1fd
        L1f5:
            java.lang.Integer r10 = com.google.android.material.badge.BadgeState.State.access$1600(r11)
            int r10 = r10.intValue()
        L1fd:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            com.google.android.material.badge.BadgeState.State.access$1602(r0, r10)
            java.lang.Integer r10 = com.google.android.material.badge.BadgeState.State.access$1700(r11)
            if (r10 == 0) goto L212
            java.lang.Integer r7 = com.google.android.material.badge.BadgeState.State.access$1700(r11)
            com.google.android.material.badge.BadgeState.State.access$1702(r0, r7)
            goto L242
        L212:
            int r10 = com.google.android.material.R.styleable.Badge_badgeTextColor
            boolean r1 = r8.hasValue(r10)
            if (r1 == 0) goto L226
            int r7 = readColorFromAttributes(r7, r8, r10)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            com.google.android.material.badge.BadgeState.State.access$1702(r0, r7)
            goto L242
        L226:
            com.google.android.material.resources.TextAppearance r10 = new com.google.android.material.resources.TextAppearance
            java.lang.Integer r1 = com.google.android.material.badge.BadgeState.State.access$1600(r0)
            int r1 = r1.intValue()
            r10.<init>(r7, r1)
            android.content.res.ColorStateList r7 = r10.getTextColor()
            int r7 = r7.getDefaultColor()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            com.google.android.material.badge.BadgeState.State.access$1702(r0, r7)
        L242:
            java.lang.Integer r7 = com.google.android.material.badge.BadgeState.State.access$1800(r11)
            if (r7 != 0) goto L252
            int r7 = com.google.android.material.R.styleable.Badge_badgeGravity
            r10 = 8388661(0x800035, float:1.1755018E-38)
            int r7 = r8.getInt(r7, r10)
            goto L25a
        L252:
            java.lang.Integer r7 = com.google.android.material.badge.BadgeState.State.access$1800(r11)
            int r7 = r7.intValue()
        L25a:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            com.google.android.material.badge.BadgeState.State.access$1802(r0, r7)
            java.lang.Integer r7 = com.google.android.material.badge.BadgeState.State.access$1900(r11)
            if (r7 != 0) goto L274
            int r7 = com.google.android.material.R.styleable.Badge_badgeWidePadding
            int r10 = com.google.android.material.R.dimen.mtrl_badge_long_text_horizontal_padding
            int r10 = r9.getDimensionPixelSize(r10)
            int r7 = r8.getDimensionPixelSize(r7, r10)
            goto L27c
        L274:
            java.lang.Integer r7 = com.google.android.material.badge.BadgeState.State.access$1900(r11)
            int r7 = r7.intValue()
        L27c:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            com.google.android.material.badge.BadgeState.State.access$1902(r0, r7)
            java.lang.Integer r7 = com.google.android.material.badge.BadgeState.State.access$2000(r11)
            if (r7 != 0) goto L296
            int r7 = com.google.android.material.R.styleable.Badge_badgeVerticalPadding
            int r10 = com.google.android.material.R.dimen.m3_badge_with_text_vertical_padding
            int r9 = r9.getDimensionPixelSize(r10)
            int r7 = r8.getDimensionPixelSize(r7, r9)
            goto L29e
        L296:
            java.lang.Integer r7 = com.google.android.material.badge.BadgeState.State.access$2000(r11)
            int r7 = r7.intValue()
        L29e:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            com.google.android.material.badge.BadgeState.State.access$2002(r0, r7)
            java.lang.Integer r7 = com.google.android.material.badge.BadgeState.State.access$2100(r11)
            if (r7 != 0) goto L2b2
            int r7 = com.google.android.material.R.styleable.Badge_horizontalOffset
            int r7 = r8.getDimensionPixelOffset(r7, r4)
            goto L2ba
        L2b2:
            java.lang.Integer r7 = com.google.android.material.badge.BadgeState.State.access$2100(r11)
            int r7 = r7.intValue()
        L2ba:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            com.google.android.material.badge.BadgeState.State.access$2102(r0, r7)
            java.lang.Integer r7 = com.google.android.material.badge.BadgeState.State.access$2200(r11)
            if (r7 != 0) goto L2ce
            int r7 = com.google.android.material.R.styleable.Badge_verticalOffset
            int r7 = r8.getDimensionPixelOffset(r7, r4)
            goto L2d6
        L2ce:
            java.lang.Integer r7 = com.google.android.material.badge.BadgeState.State.access$2200(r11)
            int r7 = r7.intValue()
        L2d6:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            com.google.android.material.badge.BadgeState.State.access$2202(r0, r7)
            java.lang.Integer r7 = com.google.android.material.badge.BadgeState.State.access$2300(r11)
            if (r7 != 0) goto L2f2
            int r7 = com.google.android.material.R.styleable.Badge_horizontalOffsetWithText
            java.lang.Integer r9 = com.google.android.material.badge.BadgeState.State.access$2100(r0)
            int r9 = r9.intValue()
            int r7 = r8.getDimensionPixelOffset(r7, r9)
            goto L2fa
        L2f2:
            java.lang.Integer r7 = com.google.android.material.badge.BadgeState.State.access$2300(r11)
            int r7 = r7.intValue()
        L2fa:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            com.google.android.material.badge.BadgeState.State.access$2302(r0, r7)
            java.lang.Integer r7 = com.google.android.material.badge.BadgeState.State.access$2400(r11)
            if (r7 != 0) goto L316
            int r7 = com.google.android.material.R.styleable.Badge_verticalOffsetWithText
            java.lang.Integer r9 = com.google.android.material.badge.BadgeState.State.access$2200(r0)
            int r9 = r9.intValue()
            int r7 = r8.getDimensionPixelOffset(r7, r9)
            goto L31e
        L316:
            java.lang.Integer r7 = com.google.android.material.badge.BadgeState.State.access$2400(r11)
            int r7 = r7.intValue()
        L31e:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            com.google.android.material.badge.BadgeState.State.access$2402(r0, r7)
            java.lang.Integer r7 = com.google.android.material.badge.BadgeState.State.access$2500(r11)
            if (r7 != 0) goto L332
            int r7 = com.google.android.material.R.styleable.Badge_largeFontVerticalOffsetAdjustment
            int r7 = r8.getDimensionPixelOffset(r7, r4)
            goto L33a
        L332:
            java.lang.Integer r7 = com.google.android.material.badge.BadgeState.State.access$2500(r11)
            int r7 = r7.intValue()
        L33a:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            com.google.android.material.badge.BadgeState.State.access$2502(r0, r7)
            java.lang.Integer r7 = com.google.android.material.badge.BadgeState.State.access$2600(r11)
            if (r7 != 0) goto L349
            r7 = 0
            goto L351
        L349:
            java.lang.Integer r7 = com.google.android.material.badge.BadgeState.State.access$2600(r11)
            int r7 = r7.intValue()
        L351:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            com.google.android.material.badge.BadgeState.State.access$2602(r0, r7)
            java.lang.Integer r7 = com.google.android.material.badge.BadgeState.State.access$2700(r11)
            if (r7 != 0) goto L360
            r7 = 0
            goto L368
        L360:
            java.lang.Integer r7 = com.google.android.material.badge.BadgeState.State.access$2700(r11)
            int r7 = r7.intValue()
        L368:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            com.google.android.material.badge.BadgeState.State.access$2702(r0, r7)
            java.lang.Boolean r7 = com.google.android.material.badge.BadgeState.State.access$2800(r11)
            if (r7 != 0) goto L37c
            int r7 = com.google.android.material.R.styleable.Badge_autoAdjustToWithinGrandparentBounds
            boolean r7 = r8.getBoolean(r7, r4)
            goto L384
        L37c:
            java.lang.Boolean r7 = com.google.android.material.badge.BadgeState.State.access$2800(r11)
            boolean r7 = r7.booleanValue()
        L384:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            com.google.android.material.badge.BadgeState.State.access$2802(r0, r7)
            r8.recycle()
            java.util.Locale r7 = com.google.android.material.badge.BadgeState.State.access$2900(r11)
            if (r7 != 0) goto L3ab
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 24
            if (r7 < r8) goto L3a3
            java.util.Locale$Category r7 = com.google.android.material.badge.a.a()
            java.util.Locale r7 = com.google.android.material.badge.b.a(r7)
            goto L3a7
        L3a3:
            java.util.Locale r7 = java.util.Locale.getDefault()
        L3a7:
            com.google.android.material.badge.BadgeState.State.access$2902(r0, r7)
            goto L3b2
        L3ab:
            java.util.Locale r7 = com.google.android.material.badge.BadgeState.State.access$2900(r11)
            com.google.android.material.badge.BadgeState.State.access$2902(r0, r7)
        L3b2:
            r6.overridingState = r11
            return
    }

    private android.content.res.TypedArray generateTypedArray(android.content.Context r8, @androidx.annotation.XmlRes int r9, @androidx.annotation.AttrRes int r10, @androidx.annotation.StyleRes int r11) {
            r7 = this;
            r0 = 0
            if (r9 == 0) goto Lf
            java.lang.String r1 = "badge"
            android.util.AttributeSet r9 = com.google.android.material.drawable.DrawableUtils.parseDrawableXml(r8, r9, r1)
            int r1 = r9.getStyleAttribute()
        Ld:
            r2 = r9
            goto L12
        Lf:
            r9 = 0
            r1 = 0
            goto Ld
        L12:
            if (r1 != 0) goto L16
            r5 = r11
            goto L17
        L16:
            r5 = r1
        L17:
            int[] r3 = com.google.android.material.R.styleable.Badge
            int[] r6 = new int[r0]
            r1 = r8
            r4 = r10
            android.content.res.TypedArray r8 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r1, r2, r3, r4, r5, r6)
            return r8
    }

    private static int readColorFromAttributes(android.content.Context r0, @androidx.annotation.NonNull android.content.res.TypedArray r1, @androidx.annotation.StyleableRes int r2) {
            android.content.res.ColorStateList r0 = com.google.android.material.resources.MaterialResources.getColorStateList(r0, r1, r2)
            int r0 = r0.getDefaultColor()
            return r0
    }

    void clearNumber() {
            r1 = this;
            r0 = -1
            r1.setNumber(r0)
            return
    }

    void clearText() {
            r1 = this;
            r0 = 0
            r1.setText(r0)
            return
    }

    @androidx.annotation.Dimension(unit = 1)
    int getAdditionalHorizontalOffset() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$2600(r0)
            int r0 = r0.intValue()
            return r0
    }

    @androidx.annotation.Dimension(unit = 1)
    int getAdditionalVerticalOffset() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$2700(r0)
            int r0 = r0.intValue()
            return r0
    }

    int getAlpha() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            int r0 = com.google.android.material.badge.BadgeState.State.access$100(r0)
            return r0
    }

    @androidx.annotation.ColorInt
    int getBackgroundColor() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$1500(r0)
            int r0 = r0.intValue()
            return r0
    }

    int getBadgeGravity() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$1800(r0)
            int r0 = r0.intValue()
            return r0
    }

    @androidx.annotation.Px
    int getBadgeHorizontalPadding() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$1900(r0)
            int r0 = r0.intValue()
            return r0
    }

    int getBadgeShapeAppearanceOverlayResId() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$1200(r0)
            int r0 = r0.intValue()
            return r0
    }

    int getBadgeShapeAppearanceResId() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$1100(r0)
            int r0 = r0.intValue()
            return r0
    }

    @androidx.annotation.ColorInt
    int getBadgeTextColor() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$1700(r0)
            int r0 = r0.intValue()
            return r0
    }

    @androidx.annotation.Px
    int getBadgeVerticalPadding() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$2000(r0)
            int r0 = r0.intValue()
            return r0
    }

    int getBadgeWithTextShapeAppearanceOverlayResId() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$1400(r0)
            int r0 = r0.intValue()
            return r0
    }

    int getBadgeWithTextShapeAppearanceResId() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$1300(r0)
            int r0 = r0.intValue()
            return r0
    }

    @androidx.annotation.StringRes
    int getContentDescriptionExceedsMaxBadgeNumberStringResource() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            int r0 = com.google.android.material.badge.BadgeState.State.access$700(r0)
            return r0
    }

    java.lang.CharSequence getContentDescriptionForText() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.CharSequence r0 = com.google.android.material.badge.BadgeState.State.access$400(r0)
            return r0
    }

    java.lang.CharSequence getContentDescriptionNumberless() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.CharSequence r0 = com.google.android.material.badge.BadgeState.State.access$500(r0)
            return r0
    }

    @androidx.annotation.PluralsRes
    int getContentDescriptionQuantityStrings() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            int r0 = com.google.android.material.badge.BadgeState.State.access$600(r0)
            return r0
    }

    @androidx.annotation.Dimension(unit = 1)
    int getHorizontalOffsetWithText() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$2300(r0)
            int r0 = r0.intValue()
            return r0
    }

    @androidx.annotation.Dimension(unit = 1)
    int getHorizontalOffsetWithoutText() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$2100(r0)
            int r0 = r0.intValue()
            return r0
    }

    @androidx.annotation.Dimension(unit = 1)
    int getLargeFontVerticalOffsetAdjustment() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$2500(r0)
            int r0 = r0.intValue()
            return r0
    }

    int getMaxCharacterCount() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            int r0 = com.google.android.material.badge.BadgeState.State.access$900(r0)
            return r0
    }

    int getMaxNumber() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            int r0 = com.google.android.material.badge.BadgeState.State.access$1000(r0)
            return r0
    }

    int getNumber() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            int r0 = com.google.android.material.badge.BadgeState.State.access$200(r0)
            return r0
    }

    java.util.Locale getNumberLocale() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.util.Locale r0 = com.google.android.material.badge.BadgeState.State.access$2900(r0)
            return r0
    }

    com.google.android.material.badge.BadgeState.State getOverridingState() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.overridingState
            return r0
    }

    java.lang.String getText() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.String r0 = com.google.android.material.badge.BadgeState.State.access$300(r0)
            return r0
    }

    @androidx.annotation.StyleRes
    int getTextAppearanceResId() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$1600(r0)
            int r0 = r0.intValue()
            return r0
    }

    @androidx.annotation.Dimension(unit = 1)
    int getVerticalOffsetWithText() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$2400(r0)
            int r0 = r0.intValue()
            return r0
    }

    @androidx.annotation.Dimension(unit = 1)
    int getVerticalOffsetWithoutText() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Integer r0 = com.google.android.material.badge.BadgeState.State.access$2200(r0)
            int r0 = r0.intValue()
            return r0
    }

    boolean hasNumber() {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            int r0 = com.google.android.material.badge.BadgeState.State.access$200(r0)
            r1 = -1
            if (r0 == r1) goto Lb
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    boolean hasText() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.String r0 = com.google.android.material.badge.BadgeState.State.access$300(r0)
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    boolean isAutoAdjustedToGrandparentBounds() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Boolean r0 = com.google.android.material.badge.BadgeState.State.access$2800(r0)
            boolean r0 = r0.booleanValue()
            return r0
    }

    boolean isVisible() {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            java.lang.Boolean r0 = com.google.android.material.badge.BadgeState.State.access$800(r0)
            boolean r0 = r0.booleanValue()
            return r0
    }

    void setAdditionalHorizontalOffset(@androidx.annotation.Dimension(unit = 1) int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$2602(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$2602(r0, r3)
            return
    }

    void setAdditionalVerticalOffset(@androidx.annotation.Dimension(unit = 1) int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$2702(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$2702(r0, r3)
            return
    }

    void setAlpha(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.overridingState
            com.google.android.material.badge.BadgeState.State.access$102(r0, r2)
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            com.google.android.material.badge.BadgeState.State.access$102(r0, r2)
            return
    }

    void setAutoAdjustToGrandparentBounds(boolean r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$2802(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$2802(r0, r3)
            return
    }

    void setBackgroundColor(@androidx.annotation.ColorInt int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1502(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1502(r0, r3)
            return
    }

    void setBadgeGravity(int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1802(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1802(r0, r3)
            return
    }

    void setBadgeHorizontalPadding(@androidx.annotation.Px int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1902(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1902(r0, r3)
            return
    }

    void setBadgeShapeAppearanceOverlayResId(int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1202(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1202(r0, r3)
            return
    }

    void setBadgeShapeAppearanceResId(int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1102(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1102(r0, r3)
            return
    }

    void setBadgeTextColor(@androidx.annotation.ColorInt int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1702(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1702(r0, r3)
            return
    }

    void setBadgeVerticalPadding(@androidx.annotation.Px int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$2002(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$2002(r0, r3)
            return
    }

    void setBadgeWithTextShapeAppearanceOverlayResId(int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1402(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1402(r0, r3)
            return
    }

    void setBadgeWithTextShapeAppearanceResId(int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1302(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1302(r0, r3)
            return
    }

    void setContentDescriptionExceedsMaxBadgeNumberStringResource(@androidx.annotation.StringRes int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.overridingState
            com.google.android.material.badge.BadgeState.State.access$702(r0, r2)
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            com.google.android.material.badge.BadgeState.State.access$702(r0, r2)
            return
    }

    void setContentDescriptionForText(java.lang.CharSequence r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.overridingState
            com.google.android.material.badge.BadgeState.State.access$402(r0, r2)
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            com.google.android.material.badge.BadgeState.State.access$402(r0, r2)
            return
    }

    void setContentDescriptionNumberless(java.lang.CharSequence r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.overridingState
            com.google.android.material.badge.BadgeState.State.access$502(r0, r2)
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            com.google.android.material.badge.BadgeState.State.access$502(r0, r2)
            return
    }

    void setContentDescriptionQuantityStringsResource(@androidx.annotation.PluralsRes int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.overridingState
            com.google.android.material.badge.BadgeState.State.access$602(r0, r2)
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            com.google.android.material.badge.BadgeState.State.access$602(r0, r2)
            return
    }

    void setHorizontalOffsetWithText(@androidx.annotation.Dimension(unit = 1) int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$2302(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$2302(r0, r3)
            return
    }

    void setHorizontalOffsetWithoutText(@androidx.annotation.Dimension(unit = 1) int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$2102(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$2102(r0, r3)
            return
    }

    void setLargeFontVerticalOffsetAdjustment(@androidx.annotation.Dimension(unit = 1) int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$2502(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$2502(r0, r3)
            return
    }

    void setMaxCharacterCount(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.overridingState
            com.google.android.material.badge.BadgeState.State.access$902(r0, r2)
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            com.google.android.material.badge.BadgeState.State.access$902(r0, r2)
            return
    }

    void setMaxNumber(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.overridingState
            com.google.android.material.badge.BadgeState.State.access$1002(r0, r2)
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            com.google.android.material.badge.BadgeState.State.access$1002(r0, r2)
            return
    }

    void setNumber(int r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.overridingState
            com.google.android.material.badge.BadgeState.State.access$202(r0, r2)
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            com.google.android.material.badge.BadgeState.State.access$202(r0, r2)
            return
    }

    void setNumberLocale(java.util.Locale r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.overridingState
            com.google.android.material.badge.BadgeState.State.access$2902(r0, r2)
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            com.google.android.material.badge.BadgeState.State.access$2902(r0, r2)
            return
    }

    void setText(java.lang.String r2) {
            r1 = this;
            com.google.android.material.badge.BadgeState$State r0 = r1.overridingState
            com.google.android.material.badge.BadgeState.State.access$302(r0, r2)
            com.google.android.material.badge.BadgeState$State r0 = r1.currentState
            com.google.android.material.badge.BadgeState.State.access$302(r0, r2)
            return
    }

    void setTextAppearanceResId(@androidx.annotation.StyleRes int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1602(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$1602(r0, r3)
            return
    }

    void setVerticalOffsetWithText(@androidx.annotation.Dimension(unit = 1) int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$2402(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$2402(r0, r3)
            return
    }

    void setVerticalOffsetWithoutText(@androidx.annotation.Dimension(unit = 1) int r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$2202(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$2202(r0, r3)
            return
    }

    void setVisible(boolean r3) {
            r2 = this;
            com.google.android.material.badge.BadgeState$State r0 = r2.overridingState
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$802(r0, r1)
            com.google.android.material.badge.BadgeState$State r0 = r2.currentState
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            com.google.android.material.badge.BadgeState.State.access$802(r0, r3)
            return
    }
}
