package com.google.android.material.slider;

import com.google.android.material.slider.BaseOnChangeListener;
import com.google.android.material.slider.BaseOnSliderTouchListener;
import com.google.android.material.slider.BaseSlider;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class BaseSlider<S extends com.google.android.material.slider.BaseSlider<S, L, T>, L extends com.google.android.material.slider.BaseOnChangeListener<S>, T extends com.google.android.material.slider.BaseOnSliderTouchListener<S>> extends android.view.View {
    private static final int DEFAULT_LABEL_ANIMATION_ENTER_DURATION = 83;
    private static final int DEFAULT_LABEL_ANIMATION_EXIT_DURATION = 117;
    static final int DEF_STYLE_RES = 0;
    private static final java.lang.String EXCEPTION_ILLEGAL_DISCRETE_VALUE = "Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)";
    private static final java.lang.String EXCEPTION_ILLEGAL_MIN_SEPARATION = "minSeparation(%s) must be greater or equal to 0";
    private static final java.lang.String EXCEPTION_ILLEGAL_MIN_SEPARATION_STEP_SIZE = "minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)";
    private static final java.lang.String EXCEPTION_ILLEGAL_MIN_SEPARATION_STEP_SIZE_UNIT = "minSeparation(%s) cannot be set as a dimension when using stepSize(%s)";
    private static final java.lang.String EXCEPTION_ILLEGAL_STEP_SIZE = "The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range";
    private static final java.lang.String EXCEPTION_ILLEGAL_VALUE = "Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)";
    private static final java.lang.String EXCEPTION_ILLEGAL_VALUE_FROM = "valueFrom(%s) must be smaller than valueTo(%s)";
    private static final java.lang.String EXCEPTION_ILLEGAL_VALUE_TO = "valueTo(%s) must be greater than valueFrom(%s)";
    private static final int HALO_ALPHA = 63;
    private static final int LABEL_ANIMATION_ENTER_DURATION_ATTR = 0;
    private static final int LABEL_ANIMATION_ENTER_EASING_ATTR = 0;
    private static final int LABEL_ANIMATION_EXIT_DURATION_ATTR = 0;
    private static final int LABEL_ANIMATION_EXIT_EASING_ATTR = 0;

    @androidx.annotation.Dimension
    private static final int MIN_TOUCH_TARGET_DP = 48;
    private static final java.lang.String TAG = "BaseSlider";
    private static final double THRESHOLD = 1.0E-4d;
    private static final int TIMEOUT_SEND_ACCESSIBILITY_EVENT = 200;
    static final int UNIT_PX = 0;
    static final int UNIT_VALUE = 1;
    private static final java.lang.String WARNING_FLOATING_POINT_ERROR = "Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.";
    private com.google.android.material.slider.BaseSlider<S, L, T>.AccessibilityEventSender accessibilityEventSender;

    @androidx.annotation.NonNull
    private final com.google.android.material.slider.BaseSlider.AccessibilityHelper accessibilityHelper;
    private final android.view.accessibility.AccessibilityManager accessibilityManager;
    private int activeThumbIdx;

    @androidx.annotation.NonNull
    private final android.graphics.Paint activeTicksPaint;

    @androidx.annotation.NonNull
    private final android.graphics.Paint activeTrackPaint;

    @androidx.annotation.NonNull
    private final java.util.List<L> changeListeners;

    @androidx.annotation.Nullable
    private android.graphics.drawable.Drawable customThumbDrawable;

    @androidx.annotation.NonNull
    private java.util.List<android.graphics.drawable.Drawable> customThumbDrawablesForValues;

    @androidx.annotation.NonNull
    private final com.google.android.material.shape.MaterialShapeDrawable defaultThumbDrawable;
    private int defaultThumbRadius;
    private int defaultTickActiveRadius;
    private int defaultTickInactiveRadius;
    private int defaultTrackHeight;
    private boolean dirtyConfig;
    private int focusedThumbIdx;
    private boolean forceDrawCompatHalo;
    private com.google.android.material.slider.LabelFormatter formatter;

    @androidx.annotation.NonNull
    private android.content.res.ColorStateList haloColor;

    @androidx.annotation.NonNull
    private final android.graphics.Paint haloPaint;
    private int haloRadius;

    @androidx.annotation.NonNull
    private final android.graphics.Paint inactiveTicksPaint;

    @androidx.annotation.NonNull
    private final android.graphics.Paint inactiveTrackPaint;
    private boolean isLongPress;
    private int labelBehavior;
    private int labelPadding;
    private int labelStyle;

    @androidx.annotation.NonNull
    private final java.util.List<com.google.android.material.tooltip.TooltipDrawable> labels;
    private boolean labelsAreAnimatedIn;
    private android.animation.ValueAnimator labelsInAnimator;
    private android.animation.ValueAnimator labelsOutAnimator;
    private android.view.MotionEvent lastEvent;

    @androidx.annotation.Dimension(unit = 1)
    private int minTouchTargetSize;
    private int minTrackSidePadding;
    private int minWidgetHeight;
    private final int scaledTouchSlop;
    private int separationUnit;
    private float stepSize;
    private boolean thumbIsPressed;

    @androidx.annotation.NonNull
    private final android.graphics.Paint thumbPaint;
    private int thumbRadius;
    private int tickActiveRadius;

    @androidx.annotation.NonNull
    private android.content.res.ColorStateList tickColorActive;

    @androidx.annotation.NonNull
    private android.content.res.ColorStateList tickColorInactive;
    private int tickInactiveRadius;
    private boolean tickVisible;
    private float[] ticksCoordinates;
    private float touchDownX;

    @androidx.annotation.NonNull
    private final java.util.List<T> touchListeners;
    private float touchPosition;

    @androidx.annotation.NonNull
    private android.content.res.ColorStateList trackColorActive;

    @androidx.annotation.NonNull
    private android.content.res.ColorStateList trackColorInactive;
    private int trackHeight;
    private int trackSidePadding;
    private int trackWidth;
    private float valueFrom;
    private float valueTo;
    private java.util.ArrayList<java.lang.Float> values;
    private int widgetHeight;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class AccessibilityEventSender implements java.lang.Runnable {
        final /* synthetic */ com.google.android.material.slider.BaseSlider this$0;
        int virtualViewId;

        private AccessibilityEventSender(com.google.android.material.slider.BaseSlider r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = -1
                r0.virtualViewId = r1
                return
        }

        /* synthetic */ AccessibilityEventSender(com.google.android.material.slider.BaseSlider r1, com.google.android.material.slider.BaseSlider.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                com.google.android.material.slider.BaseSlider r0 = r3.this$0
                com.google.android.material.slider.BaseSlider$AccessibilityHelper r0 = com.google.android.material.slider.BaseSlider.access$200(r0)
                int r1 = r3.virtualViewId
                r2 = 4
                r0.sendEventForVirtualView(r1, r2)
                return
        }

        void setVirtualViewId(int r1) {
                r0 = this;
                r0.virtualViewId = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class AccessibilityHelper extends androidx.customview.widget.ExploreByTouchHelper {
        private final com.google.android.material.slider.BaseSlider<?, ?, ?> slider;
        final android.graphics.Rect virtualViewBounds;

        AccessibilityHelper(com.google.android.material.slider.BaseSlider<?, ?, ?> r2) {
                r1 = this;
                r1.<init>(r2)
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.virtualViewBounds = r0
                r1.slider = r2
                return
        }

        @androidx.annotation.NonNull
        private java.lang.String startOrEndDescription(int r2) {
                r1 = this;
                com.google.android.material.slider.BaseSlider<?, ?, ?> r0 = r1.slider
                java.util.List r0 = r0.getValues()
                int r0 = r0.size()
                int r0 = r0 + (-1)
                if (r2 != r0) goto L1b
                com.google.android.material.slider.BaseSlider<?, ?, ?> r2 = r1.slider
                android.content.Context r2 = r2.getContext()
                int r0 = com.google.android.material.R.string.material_slider_range_end
                java.lang.String r2 = r2.getString(r0)
                return r2
            L1b:
                if (r2 != 0) goto L2a
                com.google.android.material.slider.BaseSlider<?, ?, ?> r2 = r1.slider
                android.content.Context r2 = r2.getContext()
                int r0 = com.google.android.material.R.string.material_slider_range_start
                java.lang.String r2 = r2.getString(r0)
                return r2
            L2a:
                java.lang.String r2 = ""
                return r2
        }

        protected int getVirtualViewAt(float r5, float r6) {
                r4 = this;
                r0 = 0
            L1:
                com.google.android.material.slider.BaseSlider<?, ?, ?> r1 = r4.slider
                java.util.List r1 = r1.getValues()
                int r1 = r1.size()
                if (r0 >= r1) goto L22
                com.google.android.material.slider.BaseSlider<?, ?, ?> r1 = r4.slider
                android.graphics.Rect r2 = r4.virtualViewBounds
                r1.updateBoundsForVirtualViewId(r0, r2)
                android.graphics.Rect r1 = r4.virtualViewBounds
                int r2 = (int) r5
                int r3 = (int) r6
                boolean r1 = r1.contains(r2, r3)
                if (r1 == 0) goto L1f
                return r0
            L1f:
                int r0 = r0 + 1
                goto L1
            L22:
                r5 = -1
                return r5
        }

        protected void getVisibleVirtualViews(java.util.List<java.lang.Integer> r3) {
                r2 = this;
                r0 = 0
            L1:
                com.google.android.material.slider.BaseSlider<?, ?, ?> r1 = r2.slider
                java.util.List r1 = r1.getValues()
                int r1 = r1.size()
                if (r0 >= r1) goto L17
                java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                r3.add(r1)
                int r0 = r0 + 1
                goto L1
            L17:
                return
        }

        protected boolean onPerformActionForVirtualView(int r5, int r6, android.os.Bundle r7) {
                r4 = this;
                com.google.android.material.slider.BaseSlider<?, ?, ?> r0 = r4.slider
                boolean r0 = r0.isEnabled()
                r1 = 0
                if (r0 != 0) goto La
                return r1
            La:
                r0 = 4096(0x1000, float:5.74E-42)
                r2 = 1
                r3 = 8192(0x2000, float:1.148E-41)
                if (r6 == r0) goto L3f
                if (r6 == r3) goto L3f
                r0 = 16908349(0x102003d, float:2.38774E-38)
                if (r6 == r0) goto L19
                return r1
            L19:
                if (r7 == 0) goto L3e
                java.lang.String r6 = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"
                boolean r0 = r7.containsKey(r6)
                if (r0 != 0) goto L24
                goto L3e
            L24:
                float r6 = r7.getFloat(r6)
                com.google.android.material.slider.BaseSlider<?, ?, ?> r7 = r4.slider
                boolean r6 = com.google.android.material.slider.BaseSlider.access$500(r7, r5, r6)
                if (r6 == 0) goto L3e
                com.google.android.material.slider.BaseSlider<?, ?, ?> r6 = r4.slider
                com.google.android.material.slider.BaseSlider.access$600(r6)
                com.google.android.material.slider.BaseSlider<?, ?, ?> r6 = r4.slider
                r6.postInvalidate()
                r4.invalidateVirtualView(r5)
                return r2
            L3e:
                return r1
            L3f:
                com.google.android.material.slider.BaseSlider<?, ?, ?> r7 = r4.slider
                r0 = 20
                float r7 = com.google.android.material.slider.BaseSlider.access$700(r7, r0)
                if (r6 != r3) goto L4a
                float r7 = -r7
            L4a:
                com.google.android.material.slider.BaseSlider<?, ?, ?> r6 = r4.slider
                boolean r6 = r6.isRtl()
                if (r6 == 0) goto L53
                float r7 = -r7
            L53:
                com.google.android.material.slider.BaseSlider<?, ?, ?> r6 = r4.slider
                java.util.List r6 = r6.getValues()
                java.lang.Object r6 = r6.get(r5)
                java.lang.Float r6 = (java.lang.Float) r6
                float r6 = r6.floatValue()
                float r6 = r6 + r7
                com.google.android.material.slider.BaseSlider<?, ?, ?> r7 = r4.slider
                float r7 = r7.getValueFrom()
                com.google.android.material.slider.BaseSlider<?, ?, ?> r0 = r4.slider
                float r0 = r0.getValueTo()
                float r6 = androidx.core.math.MathUtils.clamp(r6, r7, r0)
                com.google.android.material.slider.BaseSlider<?, ?, ?> r7 = r4.slider
                boolean r6 = com.google.android.material.slider.BaseSlider.access$500(r7, r5, r6)
                if (r6 == 0) goto L8a
                com.google.android.material.slider.BaseSlider<?, ?, ?> r6 = r4.slider
                com.google.android.material.slider.BaseSlider.access$600(r6)
                com.google.android.material.slider.BaseSlider<?, ?, ?> r6 = r4.slider
                r6.postInvalidate()
                r4.invalidateVirtualView(r5)
                return r2
            L8a:
                return r1
        }

        protected void onPopulateNodeForVirtualView(int r8, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r9) {
                r7 = this;
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SET_PROGRESS
                r9.addAction(r0)
                com.google.android.material.slider.BaseSlider<?, ?, ?> r0 = r7.slider
                java.util.List r0 = r0.getValues()
                java.lang.Object r1 = r0.get(r8)
                java.lang.Float r1 = (java.lang.Float) r1
                float r1 = r1.floatValue()
                com.google.android.material.slider.BaseSlider<?, ?, ?> r2 = r7.slider
                float r2 = r2.getValueFrom()
                com.google.android.material.slider.BaseSlider<?, ?, ?> r3 = r7.slider
                float r3 = r3.getValueTo()
                com.google.android.material.slider.BaseSlider<?, ?, ?> r4 = r7.slider
                boolean r4 = r4.isEnabled()
                if (r4 == 0) goto L3b
                int r4 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r4 <= 0) goto L32
                r4 = 8192(0x2000, float:1.148E-41)
                r9.addAction(r4)
            L32:
                int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r4 >= 0) goto L3b
                r4 = 4096(0x1000, float:5.74E-42)
                r9.addAction(r4)
            L3b:
                r4 = 1
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$RangeInfoCompat r2 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(r4, r2, r3, r1)
                r9.setRangeInfo(r2)
                java.lang.Class<android.widget.SeekBar> r2 = android.widget.SeekBar.class
                java.lang.String r2 = r2.getName()
                r9.setClassName(r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                com.google.android.material.slider.BaseSlider<?, ?, ?> r3 = r7.slider
                java.lang.CharSequence r3 = r3.getContentDescription()
                if (r3 == 0) goto L67
                com.google.android.material.slider.BaseSlider<?, ?, ?> r3 = r7.slider
                java.lang.CharSequence r3 = r3.getContentDescription()
                r2.append(r3)
                java.lang.String r3 = ","
                r2.append(r3)
            L67:
                com.google.android.material.slider.BaseSlider<?, ?, ?> r3 = r7.slider
                java.lang.String r1 = com.google.android.material.slider.BaseSlider.access$400(r3, r1)
                com.google.android.material.slider.BaseSlider<?, ?, ?> r3 = r7.slider
                android.content.Context r3 = r3.getContext()
                int r5 = com.google.android.material.R.string.material_slider_value
                java.lang.String r3 = r3.getString(r5)
                int r0 = r0.size()
                if (r0 <= r4) goto L83
                java.lang.String r3 = r7.startOrEndDescription(r8)
            L83:
                java.util.Locale r0 = java.util.Locale.US
                r5 = 2
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r6 = 0
                r5[r6] = r3
                r5[r4] = r1
                java.lang.String r1 = "%s, %s"
                java.lang.String r0 = java.lang.String.format(r0, r1, r5)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r9.setContentDescription(r0)
                com.google.android.material.slider.BaseSlider<?, ?, ?> r0 = r7.slider
                android.graphics.Rect r1 = r7.virtualViewBounds
                r0.updateBoundsForVirtualViewId(r8, r1)
                android.graphics.Rect r8 = r7.virtualViewBounds
                r9.setBoundsInParent(r8)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class SliderState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.slider.BaseSlider.SliderState> CREATOR = null;
        boolean hasFocus;
        float stepSize;
        float valueFrom;
        float valueTo;
        java.util.ArrayList<java.lang.Float> values;


        static {
                com.google.android.material.slider.BaseSlider$SliderState$1 r0 = new com.google.android.material.slider.BaseSlider$SliderState$1
                r0.<init>()
                com.google.android.material.slider.BaseSlider.SliderState.CREATOR = r0
                return
        }

        private SliderState(@androidx.annotation.NonNull android.os.Parcel r3) {
                r2 = this;
                r2.<init>(r3)
                float r0 = r3.readFloat()
                r2.valueFrom = r0
                float r0 = r3.readFloat()
                r2.valueTo = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.values = r0
                java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
                java.lang.ClassLoader r1 = r1.getClassLoader()
                r3.readList(r0, r1)
                float r0 = r3.readFloat()
                r2.stepSize = r0
                boolean[] r3 = r3.createBooleanArray()
                r0 = 0
                boolean r3 = r3[r0]
                r2.hasFocus = r3
                return
        }

        /* synthetic */ SliderState(android.os.Parcel r1, com.google.android.material.slider.BaseSlider.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        SliderState(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r3, int r4) {
                r2 = this;
                super.writeToParcel(r3, r4)
                float r4 = r2.valueFrom
                r3.writeFloat(r4)
                float r4 = r2.valueTo
                r3.writeFloat(r4)
                java.util.ArrayList<java.lang.Float> r4 = r2.values
                r3.writeList(r4)
                float r4 = r2.stepSize
                r3.writeFloat(r4)
                boolean r4 = r2.hasFocus
                r0 = 1
                boolean[] r0 = new boolean[r0]
                r1 = 0
                r0[r1] = r4
                r3.writeBooleanArray(r0)
                return
        }
    }

    static {
            int r0 = com.google.android.material.R.style.Widget_MaterialComponents_Slider
            com.google.android.material.slider.BaseSlider.DEF_STYLE_RES = r0
            int r0 = com.google.android.material.R.attr.motionDurationMedium4
            com.google.android.material.slider.BaseSlider.LABEL_ANIMATION_ENTER_DURATION_ATTR = r0
            int r0 = com.google.android.material.R.attr.motionDurationShort3
            com.google.android.material.slider.BaseSlider.LABEL_ANIMATION_EXIT_DURATION_ATTR = r0
            int r0 = com.google.android.material.R.attr.motionEasingEmphasizedInterpolator
            com.google.android.material.slider.BaseSlider.LABEL_ANIMATION_ENTER_EASING_ATTR = r0
            int r0 = com.google.android.material.R.attr.motionEasingEmphasizedAccelerateInterpolator
            com.google.android.material.slider.BaseSlider.LABEL_ANIMATION_EXIT_EASING_ATTR = r0
            return
    }

    public BaseSlider(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public BaseSlider(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.sliderStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public BaseSlider(@androidx.annotation.NonNull android.content.Context r9, @androidx.annotation.Nullable android.util.AttributeSet r10, int r11) {
            r8 = this;
            int r0 = com.google.android.material.slider.BaseSlider.DEF_STYLE_RES
            android.content.Context r9 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r9, r10, r11, r0)
            r8.<init>(r9, r10, r11)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r8.labels = r9
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r8.changeListeners = r9
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r8.touchListeners = r9
            r9 = 0
            r8.labelsAreAnimatedIn = r9
            r8.thumbIsPressed = r9
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8.values = r0
            r0 = -1
            r8.activeThumbIdx = r0
            r8.focusedThumbIdx = r0
            r0 = 0
            r8.stepSize = r0
            r0 = 1
            r8.tickVisible = r0
            r8.isLongPress = r9
            com.google.android.material.shape.MaterialShapeDrawable r1 = new com.google.android.material.shape.MaterialShapeDrawable
            r1.<init>()
            r8.defaultThumbDrawable = r1
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            r8.customThumbDrawablesForValues = r2
            r8.separationUnit = r9
            android.content.Context r9 = r8.getContext()
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r8.inactiveTrackPaint = r2
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r2.setStyle(r3)
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.ROUND
            r2.setStrokeCap(r4)
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r8.activeTrackPaint = r2
            r2.setStyle(r3)
            r2.setStrokeCap(r4)
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>(r0)
            r8.thumbPaint = r2
            android.graphics.Paint$Style r5 = android.graphics.Paint.Style.FILL
            r2.setStyle(r5)
            android.graphics.PorterDuffXfermode r6 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r7 = android.graphics.PorterDuff.Mode.CLEAR
            r6.<init>(r7)
            r2.setXfermode(r6)
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>(r0)
            r8.haloPaint = r2
            r2.setStyle(r5)
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r8.inactiveTicksPaint = r2
            r2.setStyle(r3)
            r2.setStrokeCap(r4)
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r8.activeTicksPaint = r2
            r2.setStyle(r3)
            r2.setStrokeCap(r4)
            android.content.res.Resources r2 = r9.getResources()
            r8.loadResources(r2)
            r8.processAttributes(r9, r10, r11)
            r8.setFocusable(r0)
            r8.setClickable(r0)
            r10 = 2
            r1.setShadowCompatibilityMode(r10)
            android.view.ViewConfiguration r9 = android.view.ViewConfiguration.get(r9)
            int r9 = r9.getScaledTouchSlop()
            r8.scaledTouchSlop = r9
            com.google.android.material.slider.BaseSlider$AccessibilityHelper r9 = new com.google.android.material.slider.BaseSlider$AccessibilityHelper
            r9.<init>(r8)
            r8.accessibilityHelper = r9
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r8, r9)
            android.content.Context r9 = r8.getContext()
            java.lang.String r10 = "accessibility"
            java.lang.Object r9 = r9.getSystemService(r10)
            android.view.accessibility.AccessibilityManager r9 = (android.view.accessibility.AccessibilityManager) r9
            r8.accessibilityManager = r9
            return
    }

    static /* synthetic */ java.util.List access$000(com.google.android.material.slider.BaseSlider r0) {
            java.util.List<com.google.android.material.tooltip.TooltipDrawable> r0 = r0.labels
            return r0
    }

    static /* synthetic */ com.google.android.material.slider.BaseSlider.AccessibilityHelper access$200(com.google.android.material.slider.BaseSlider r0) {
            com.google.android.material.slider.BaseSlider$AccessibilityHelper r0 = r0.accessibilityHelper
            return r0
    }

    static /* synthetic */ java.lang.String access$400(com.google.android.material.slider.BaseSlider r0, float r1) {
            java.lang.String r0 = r0.formatValue(r1)
            return r0
    }

    static /* synthetic */ boolean access$500(com.google.android.material.slider.BaseSlider r0, int r1, float r2) {
            boolean r0 = r0.snapThumbToValue(r1, r2)
            return r0
    }

    static /* synthetic */ void access$600(com.google.android.material.slider.BaseSlider r0) {
            r0.updateHaloHotspot()
            return
    }

    static /* synthetic */ float access$700(com.google.android.material.slider.BaseSlider r0, int r1) {
            float r0 = r0.calculateStepIncrement(r1)
            return r0
    }

    private void adjustCustomThumbDrawableBounds(android.graphics.drawable.Drawable r6) {
            r5 = this;
            int r0 = r5.thumbRadius
            int r0 = r0 * 2
            int r1 = r6.getIntrinsicWidth()
            int r2 = r6.getIntrinsicHeight()
            r3 = 0
            r4 = -1
            if (r1 != r4) goto L16
            if (r2 != r4) goto L16
            r6.setBounds(r3, r3, r0, r0)
            return
        L16:
            float r0 = (float) r0
            int r4 = java.lang.Math.max(r1, r2)
            float r4 = (float) r4
            float r0 = r0 / r4
            float r1 = (float) r1
            float r1 = r1 * r0
            int r1 = (int) r1
            float r2 = (float) r2
            float r2 = r2 * r0
            int r0 = (int) r2
            r6.setBounds(r3, r3, r1, r0)
            return
    }

    private void attachLabelToContentView(com.google.android.material.tooltip.TooltipDrawable r2) {
            r1 = this;
            android.view.ViewGroup r0 = com.google.android.material.internal.ViewUtils.getContentView(r1)
            r2.setRelativeToView(r0)
            return
    }

    @androidx.annotation.Nullable
    private java.lang.Float calculateIncrementForKey(int r3) {
            r2 = this;
            boolean r0 = r2.isLongPress
            if (r0 == 0) goto Lb
            r0 = 20
            float r0 = r2.calculateStepIncrement(r0)
            goto Lf
        Lb:
            float r0 = r2.calculateStepIncrement()
        Lf:
            r1 = 21
            if (r3 == r1) goto L3c
            r1 = 22
            if (r3 == r1) goto L30
            r1 = 69
            if (r3 == r1) goto L2a
            r1 = 70
            if (r3 == r1) goto L25
            r1 = 81
            if (r3 == r1) goto L25
            r3 = 0
            return r3
        L25:
            java.lang.Float r3 = java.lang.Float.valueOf(r0)
            return r3
        L2a:
            float r3 = -r0
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            return r3
        L30:
            boolean r3 = r2.isRtl()
            if (r3 == 0) goto L37
            float r0 = -r0
        L37:
            java.lang.Float r3 = java.lang.Float.valueOf(r0)
            return r3
        L3c:
            boolean r3 = r2.isRtl()
            if (r3 == 0) goto L43
            goto L44
        L43:
            float r0 = -r0
        L44:
            java.lang.Float r3 = java.lang.Float.valueOf(r0)
            return r3
    }

    private float calculateStepIncrement() {
            r2 = this;
            float r0 = r2.stepSize
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L9
            r0 = 1065353216(0x3f800000, float:1.0)
        L9:
            return r0
    }

    private float calculateStepIncrement(int r4) {
            r3 = this;
            float r0 = r3.calculateStepIncrement()
            float r1 = r3.valueTo
            float r2 = r3.valueFrom
            float r1 = r1 - r2
            float r1 = r1 / r0
            float r4 = (float) r4
            int r2 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r2 > 0) goto L10
            return r0
        L10:
            float r1 = r1 / r4
            int r4 = java.lang.Math.round(r1)
            float r4 = (float) r4
            float r4 = r4 * r0
            return r4
    }

    private int calculateTrackCenter() {
            r4 = this;
            int r0 = r4.widgetHeight
            int r0 = r0 / 2
            int r1 = r4.labelBehavior
            r2 = 1
            r3 = 0
            if (r1 == r2) goto L10
            boolean r1 = r4.shouldAlwaysShowLabel()
            if (r1 == 0) goto L1c
        L10:
            java.util.List<com.google.android.material.tooltip.TooltipDrawable> r1 = r4.labels
            java.lang.Object r1 = r1.get(r3)
            com.google.android.material.tooltip.TooltipDrawable r1 = (com.google.android.material.tooltip.TooltipDrawable) r1
            int r3 = r1.getIntrinsicHeight()
        L1c:
            int r0 = r0 + r3
            return r0
    }

    private android.animation.ValueAnimator createLabelAnimator(boolean r5) {
            r4 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            if (r5 == 0) goto L7
            r2 = 0
            goto L9
        L7:
            r2 = 1065353216(0x3f800000, float:1.0)
        L9:
            if (r5 == 0) goto Le
            android.animation.ValueAnimator r3 = r4.labelsOutAnimator
            goto L10
        Le:
            android.animation.ValueAnimator r3 = r4.labelsInAnimator
        L10:
            float r2 = getAnimatorCurrentValueOrDefault(r3, r2)
            if (r5 == 0) goto L17
            goto L18
        L17:
            r0 = 0
        L18:
            r1 = 2
            float[] r1 = new float[r1]
            r3 = 0
            r1[r3] = r2
            r2 = 1
            r1[r2] = r0
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r1)
            if (r5 == 0) goto L40
            android.content.Context r5 = r4.getContext()
            int r1 = com.google.android.material.slider.BaseSlider.LABEL_ANIMATION_ENTER_DURATION_ATTR
            r2 = 83
            int r5 = com.google.android.material.motion.MotionUtils.resolveThemeDuration(r5, r1, r2)
            android.content.Context r1 = r4.getContext()
            int r2 = com.google.android.material.slider.BaseSlider.LABEL_ANIMATION_ENTER_EASING_ATTR
            android.animation.TimeInterpolator r3 = com.google.android.material.animation.AnimationUtils.DECELERATE_INTERPOLATOR
            android.animation.TimeInterpolator r1 = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(r1, r2, r3)
            goto L58
        L40:
            android.content.Context r5 = r4.getContext()
            int r1 = com.google.android.material.slider.BaseSlider.LABEL_ANIMATION_EXIT_DURATION_ATTR
            r2 = 117(0x75, float:1.64E-43)
            int r5 = com.google.android.material.motion.MotionUtils.resolveThemeDuration(r5, r1, r2)
            android.content.Context r1 = r4.getContext()
            int r2 = com.google.android.material.slider.BaseSlider.LABEL_ANIMATION_EXIT_EASING_ATTR
            android.animation.TimeInterpolator r3 = com.google.android.material.animation.AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR
            android.animation.TimeInterpolator r1 = com.google.android.material.motion.MotionUtils.resolveThemeInterpolator(r1, r2, r3)
        L58:
            long r2 = (long) r5
            r0.setDuration(r2)
            r0.setInterpolator(r1)
            com.google.android.material.slider.BaseSlider$1 r5 = new com.google.android.material.slider.BaseSlider$1
            r5.<init>(r4)
            r0.addUpdateListener(r5)
            return r0
    }

    private void createLabelPool() {
            r4 = this;
            java.util.List<com.google.android.material.tooltip.TooltipDrawable> r0 = r4.labels
            int r0 = r0.size()
            java.util.ArrayList<java.lang.Float> r1 = r4.values
            int r1 = r1.size()
            if (r0 <= r1) goto L3d
            java.util.List<com.google.android.material.tooltip.TooltipDrawable> r0 = r4.labels
            java.util.ArrayList<java.lang.Float> r1 = r4.values
            int r1 = r1.size()
            java.util.List<com.google.android.material.tooltip.TooltipDrawable> r2 = r4.labels
            int r2 = r2.size()
            java.util.List r0 = r0.subList(r1, r2)
            java.util.Iterator r1 = r0.iterator()
        L24:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r1.next()
            com.google.android.material.tooltip.TooltipDrawable r2 = (com.google.android.material.tooltip.TooltipDrawable) r2
            boolean r3 = androidx.core.view.ViewCompat.isAttachedToWindow(r4)
            if (r3 == 0) goto L24
            r4.detachLabelFromContentView(r2)
            goto L24
        L3a:
            r0.clear()
        L3d:
            java.util.List<com.google.android.material.tooltip.TooltipDrawable> r0 = r4.labels
            int r0 = r0.size()
            java.util.ArrayList<java.lang.Float> r1 = r4.values
            int r1 = r1.size()
            r2 = 0
            if (r0 >= r1) goto L66
            android.content.Context r0 = r4.getContext()
            r1 = 0
            int r3 = r4.labelStyle
            com.google.android.material.tooltip.TooltipDrawable r0 = com.google.android.material.tooltip.TooltipDrawable.createFromAttributes(r0, r1, r2, r3)
            java.util.List<com.google.android.material.tooltip.TooltipDrawable> r1 = r4.labels
            r1.add(r0)
            boolean r1 = androidx.core.view.ViewCompat.isAttachedToWindow(r4)
            if (r1 == 0) goto L3d
            r4.attachLabelToContentView(r0)
            goto L3d
        L66:
            java.util.List<com.google.android.material.tooltip.TooltipDrawable> r0 = r4.labels
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L70
            goto L71
        L70:
            r2 = 1
        L71:
            java.util.List<com.google.android.material.tooltip.TooltipDrawable> r0 = r4.labels
            java.util.Iterator r0 = r0.iterator()
        L77:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L88
            java.lang.Object r1 = r0.next()
            com.google.android.material.tooltip.TooltipDrawable r1 = (com.google.android.material.tooltip.TooltipDrawable) r1
            float r3 = (float) r2
            r1.setStrokeWidth(r3)
            goto L77
        L88:
            return
    }

    private void detachLabelFromContentView(com.google.android.material.tooltip.TooltipDrawable r2) {
            r1 = this;
            com.google.android.material.internal.ViewOverlayImpl r0 = com.google.android.material.internal.ViewUtils.getContentViewOverlay(r1)
            if (r0 == 0) goto L10
            r0.remove(r2)
            android.view.ViewGroup r0 = com.google.android.material.internal.ViewUtils.getContentView(r1)
            r2.detachView(r0)
        L10:
            return
    }

    private float dimenToValue(float r3) {
            r2 = this;
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 != 0) goto L6
            return r0
        L6:
            int r0 = r2.trackSidePadding
            float r0 = (float) r0
            float r3 = r3 - r0
            int r0 = r2.trackWidth
            float r0 = (float) r0
            float r3 = r3 / r0
            float r0 = r2.valueFrom
            float r1 = r2.valueTo
            float r1 = r0 - r1
            float r3 = r3 * r1
            float r3 = r3 + r0
            return r3
    }

    private void dispatchOnChangedFromUser(int r5) {
            r4 = this;
            java.util.List<L extends com.google.android.material.slider.BaseOnChangeListener<S>> r0 = r4.changeListeners
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            com.google.android.material.slider.BaseOnChangeListener r1 = (com.google.android.material.slider.BaseOnChangeListener) r1
            java.util.ArrayList<java.lang.Float> r2 = r4.values
            java.lang.Object r2 = r2.get(r5)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r3 = 1
            r1.onValueChange(r4, r2, r3)
            goto L6
        L23:
            android.view.accessibility.AccessibilityManager r0 = r4.accessibilityManager
            if (r0 == 0) goto L30
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L30
            r4.scheduleAccessibilityEventSender(r5)
        L30:
            return
    }

    private void dispatchOnChangedProgrammatically() {
            r5 = this;
            java.util.List<L extends com.google.android.material.slider.BaseOnChangeListener<S>> r0 = r5.changeListeners
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()
            com.google.android.material.slider.BaseOnChangeListener r1 = (com.google.android.material.slider.BaseOnChangeListener) r1
            java.util.ArrayList<java.lang.Float> r2 = r5.values
            java.util.Iterator r2 = r2.iterator()
        L18:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L6
            java.lang.Object r3 = r2.next()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r4 = 0
            r1.onValueChange(r5, r3, r4)
            goto L18
        L2d:
            return
    }

    private void drawActiveTrack(@androidx.annotation.NonNull android.graphics.Canvas r11, int r12, int r13) {
            r10 = this;
            float[] r0 = r10.getActiveRange()
            int r1 = r10.trackSidePadding
            float r2 = (float) r1
            r3 = 1
            r3 = r0[r3]
            float r12 = (float) r12
            float r3 = r3 * r12
            float r7 = r2 + r3
            float r1 = (float) r1
            r2 = 0
            r0 = r0[r2]
            float r0 = r0 * r12
            float r5 = r1 + r0
            float r6 = (float) r13
            android.graphics.Paint r9 = r10.activeTrackPaint
            r8 = r6
            r4 = r11
            r4.drawLine(r5, r6, r7, r8, r9)
            return
    }

    private void drawInactiveTrack(@androidx.annotation.NonNull android.graphics.Canvas r21, int r22, int r23) {
            r20 = this;
            r0 = r20
            r1 = r22
            r2 = r23
            float[] r3 = r0.getActiveRange()
            int r4 = r0.trackSidePadding
            float r5 = (float) r4
            r6 = 1
            r6 = r3[r6]
            float r7 = (float) r1
            float r6 = r6 * r7
            float r9 = r5 + r6
            int r5 = r4 + r1
            float r5 = (float) r5
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 >= 0) goto L27
            float r10 = (float) r2
            int r4 = r4 + r1
            float r11 = (float) r4
            android.graphics.Paint r13 = r0.inactiveTrackPaint
            r12 = r10
            r8 = r21
            r8.drawLine(r9, r10, r11, r12, r13)
        L27:
            int r1 = r0.trackSidePadding
            float r4 = (float) r1
            r5 = 0
            r3 = r3[r5]
            float r3 = r3 * r7
            float r17 = r4 + r3
            float r3 = (float) r1
            int r3 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1))
            if (r3 <= 0) goto L45
            float r15 = (float) r1
            float r1 = (float) r2
            android.graphics.Paint r2 = r0.inactiveTrackPaint
            r18 = r1
            r14 = r21
            r16 = r1
            r19 = r2
            r14.drawLine(r15, r16, r17, r18, r19)
        L45:
            return
    }

    private void drawThumbDrawable(@androidx.annotation.NonNull android.graphics.Canvas r2, int r3, int r4, float r5, @androidx.annotation.NonNull android.graphics.drawable.Drawable r6) {
            r1 = this;
            r2.save()
            int r0 = r1.trackSidePadding
            float r5 = r1.normalizeValue(r5)
            float r3 = (float) r3
            float r5 = r5 * r3
            int r3 = (int) r5
            int r0 = r0 + r3
            float r3 = (float) r0
            android.graphics.Rect r5 = r6.getBounds()
            int r5 = r5.width()
            float r5 = (float) r5
            r0 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r0
            float r3 = r3 - r5
            float r4 = (float) r4
            android.graphics.Rect r5 = r6.getBounds()
            int r5 = r5.height()
            float r5 = (float) r5
            float r5 = r5 / r0
            float r4 = r4 - r5
            r2.translate(r3, r4)
            r6.draw(r2)
            r2.restore()
            return
    }

    private void drawThumbs(@androidx.annotation.NonNull android.graphics.Canvas r9, int r10, int r11) {
            r8 = this;
            r0 = 0
        L1:
            java.util.ArrayList<java.lang.Float> r1 = r8.values
            int r1 = r1.size()
            if (r0 >= r1) goto L5f
            java.util.ArrayList<java.lang.Float> r1 = r8.values
            java.lang.Object r1 = r1.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            float r6 = r1.floatValue()
            android.graphics.drawable.Drawable r7 = r8.customThumbDrawable
            if (r7 == 0) goto L21
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r2.drawThumbDrawable(r3, r4, r5, r6, r7)
            goto L59
        L21:
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            java.util.List<android.graphics.drawable.Drawable> r9 = r2.customThumbDrawablesForValues
            int r9 = r9.size()
            if (r0 >= r9) goto L3a
            java.util.List<android.graphics.drawable.Drawable> r9 = r2.customThumbDrawablesForValues
            java.lang.Object r9 = r9.get(r0)
            r7 = r9
            android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7
            r2.drawThumbDrawable(r3, r4, r5, r6, r7)
            goto L59
        L3a:
            boolean r9 = r8.isEnabled()
            if (r9 != 0) goto L54
            int r9 = r2.trackSidePadding
            float r9 = (float) r9
            float r10 = r8.normalizeValue(r6)
            float r11 = (float) r4
            float r10 = r10 * r11
            float r9 = r9 + r10
            float r10 = (float) r5
            int r11 = r2.thumbRadius
            float r11 = (float) r11
            android.graphics.Paint r1 = r2.thumbPaint
            r3.drawCircle(r9, r10, r11, r1)
        L54:
            com.google.android.material.shape.MaterialShapeDrawable r7 = r2.defaultThumbDrawable
            r2.drawThumbDrawable(r3, r4, r5, r6, r7)
        L59:
            int r0 = r0 + 1
            r9 = r3
            r10 = r4
            r11 = r5
            goto L1
        L5f:
            return
    }

    private void ensureLabelsAdded() {
            r7 = this;
            int r0 = r7.labelBehavior
            r1 = 2
            if (r0 != r1) goto L6
            return
        L6:
            boolean r0 = r7.labelsAreAnimatedIn
            r2 = 1
            if (r0 != 0) goto L19
            r7.labelsAreAnimatedIn = r2
            android.animation.ValueAnimator r0 = r7.createLabelAnimator(r2)
            r7.labelsInAnimator = r0
            r3 = 0
            r7.labelsOutAnimator = r3
            r0.start()
        L19:
            java.util.List<com.google.android.material.tooltip.TooltipDrawable> r0 = r7.labels
            java.util.Iterator r0 = r0.iterator()
            r3 = 0
            r4 = 0
        L21:
            java.util.ArrayList<java.lang.Float> r5 = r7.values
            int r5 = r5.size()
            if (r4 >= r5) goto L4c
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L4c
            int r5 = r7.focusedThumbIdx
            if (r4 != r5) goto L34
            goto L49
        L34:
            java.lang.Object r5 = r0.next()
            com.google.android.material.tooltip.TooltipDrawable r5 = (com.google.android.material.tooltip.TooltipDrawable) r5
            java.util.ArrayList<java.lang.Float> r6 = r7.values
            java.lang.Object r6 = r6.get(r4)
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            r7.setValueForLabel(r5, r6)
        L49:
            int r4 = r4 + 1
            goto L21
        L4c:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L6a
            java.lang.Object r0 = r0.next()
            com.google.android.material.tooltip.TooltipDrawable r0 = (com.google.android.material.tooltip.TooltipDrawable) r0
            java.util.ArrayList<java.lang.Float> r1 = r7.values
            int r2 = r7.focusedThumbIdx
            java.lang.Object r1 = r1.get(r2)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r7.setValueForLabel(r0, r1)
            return
        L6a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.util.List<com.google.android.material.tooltip.TooltipDrawable> r4 = r7.labels
            int r4 = r4.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.ArrayList<java.lang.Float> r5 = r7.values
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r4
            r1[r2] = r5
            java.lang.String r2 = "Not enough labels(%d) to display all the values(%d)"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
    }

    private void ensureLabelsRemoved() {
            r2 = this;
            boolean r0 = r2.labelsAreAnimatedIn
            if (r0 == 0) goto L1d
            r0 = 0
            r2.labelsAreAnimatedIn = r0
            android.animation.ValueAnimator r0 = r2.createLabelAnimator(r0)
            r2.labelsOutAnimator = r0
            r1 = 0
            r2.labelsInAnimator = r1
            com.google.android.material.slider.BaseSlider$2 r1 = new com.google.android.material.slider.BaseSlider$2
            r1.<init>(r2)
            r0.addListener(r1)
            android.animation.ValueAnimator r0 = r2.labelsOutAnimator
            r0.start()
        L1d:
            return
    }

    private void focusThumbOnFocusGained(int r4) {
            r3 = this;
            r0 = 1
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r0) goto L20
            r0 = 2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r0) goto L1c
            r0 = 17
            if (r4 == r0) goto L18
            r0 = 66
            if (r4 == r0) goto L14
            return
        L14:
            r3.moveFocusInAbsoluteDirection(r2)
            return
        L18:
            r3.moveFocusInAbsoluteDirection(r1)
            return
        L1c:
            r3.moveFocus(r2)
            return
        L20:
            r3.moveFocus(r1)
            return
    }

    private java.lang.String formatValue(float r4) {
            r3 = this;
            boolean r0 = r3.hasLabelFormatter()
            if (r0 == 0) goto Ld
            com.google.android.material.slider.LabelFormatter r0 = r3.formatter
            java.lang.String r4 = r0.getFormattedValue(r4)
            return r4
        Ld:
            int r0 = (int) r4
            float r0 = (float) r0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L16
            java.lang.String r0 = "%.0f"
            goto L18
        L16:
            java.lang.String r0 = "%.2f"
        L18:
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = java.lang.String.format(r0, r1)
            return r4
    }

    private float[] getActiveRange() {
            r6 = this;
            java.util.List r0 = r6.getValues()
            java.lang.Object r0 = java.util.Collections.max(r0)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            java.util.List r1 = r6.getValues()
            java.lang.Object r1 = java.util.Collections.min(r1)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            java.util.ArrayList<java.lang.Float> r2 = r6.values
            int r2 = r2.size()
            r3 = 1
            if (r2 != r3) goto L27
            float r1 = r6.valueFrom
        L27:
            float r1 = r6.normalizeValue(r1)
            float r0 = r6.normalizeValue(r0)
            boolean r2 = r6.isRtl()
            r4 = 0
            r5 = 2
            if (r2 == 0) goto L3e
            float[] r2 = new float[r5]
            r2[r4] = r0
            r2[r3] = r1
            return r2
        L3e:
            float[] r2 = new float[r5]
            r2[r4] = r1
            r2[r3] = r0
            return r2
    }

    private static float getAnimatorCurrentValueOrDefault(android.animation.ValueAnimator r1, float r2) {
            if (r1 == 0) goto L15
            boolean r0 = r1.isRunning()
            if (r0 == 0) goto L15
            java.lang.Object r2 = r1.getAnimatedValue()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r1.cancel()
        L15:
            return r2
    }

    private float getClampedValue(int r4, float r5) {
            r3 = this;
            float r0 = r3.getMinSeparation()
            int r1 = r3.separationUnit
            if (r1 != 0) goto Lc
            float r0 = r3.dimenToValue(r0)
        Lc:
            boolean r1 = r3.isRtl()
            if (r1 == 0) goto L13
            float r0 = -r0
        L13:
            int r1 = r4 + 1
            java.util.ArrayList<java.lang.Float> r2 = r3.values
            int r2 = r2.size()
            if (r1 < r2) goto L20
            float r1 = r3.valueTo
            goto L2d
        L20:
            java.util.ArrayList<java.lang.Float> r2 = r3.values
            java.lang.Object r1 = r2.get(r1)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            float r1 = r1 - r0
        L2d:
            int r4 = r4 + (-1)
            if (r4 >= 0) goto L34
            float r4 = r3.valueFrom
            goto L41
        L34:
            java.util.ArrayList<java.lang.Float> r2 = r3.values
            java.lang.Object r4 = r2.get(r4)
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            float r4 = r4 + r0
        L41:
            float r4 = androidx.core.math.MathUtils.clamp(r5, r4, r1)
            return r4
    }

    @androidx.annotation.ColorInt
    private int getColorForState(@androidx.annotation.NonNull android.content.res.ColorStateList r3) {
            r2 = this;
            int[] r0 = r2.getDrawableState()
            int r1 = r3.getDefaultColor()
            int r3 = r3.getColorForState(r0, r1)
            return r3
    }

    private float getValueOfTouchPosition() {
            r6 = this;
            float r0 = r6.touchPosition
            double r0 = r6.snapPosition(r0)
            boolean r2 = r6.isRtl()
            if (r2 == 0) goto L10
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r2 - r0
        L10:
            float r2 = r6.valueTo
            float r3 = r6.valueFrom
            float r2 = r2 - r3
            double r4 = (double) r2
            double r0 = r0 * r4
            double r2 = (double) r3
            double r0 = r0 + r2
            float r0 = (float) r0
            return r0
    }

    private float getValueOfTouchPositionAbsolute() {
            r3 = this;
            float r0 = r3.touchPosition
            boolean r1 = r3.isRtl()
            if (r1 == 0) goto Lc
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r1 - r0
        Lc:
            float r1 = r3.valueTo
            float r2 = r3.valueFrom
            float r1 = r1 - r2
            float r0 = r0 * r1
            float r0 = r0 + r2
            return r0
    }

    private android.graphics.drawable.Drawable initializeCustomThumbDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            android.graphics.drawable.Drawable r1 = r1.mutate()
            android.graphics.drawable.Drawable$ConstantState r1 = r1.getConstantState()
            android.graphics.drawable.Drawable r1 = r1.newDrawable()
            r0.adjustCustomThumbDrawableBounds(r1)
            return r1
    }

    private void invalidateTrack() {
            r2 = this;
            android.graphics.Paint r0 = r2.inactiveTrackPaint
            int r1 = r2.trackHeight
            float r1 = (float) r1
            r0.setStrokeWidth(r1)
            android.graphics.Paint r0 = r2.activeTrackPaint
            int r1 = r2.trackHeight
            float r1 = (float) r1
            r0.setStrokeWidth(r1)
            return
    }

    private boolean isInVerticalScrollingContainer() {
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
        L4:
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L25
            r1 = r0
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r2 = 1
            boolean r3 = r1.canScrollVertically(r2)
            if (r3 != 0) goto L19
            r3 = -1
            boolean r3 = r1.canScrollVertically(r3)
            if (r3 == 0) goto L20
        L19:
            boolean r1 = r1.shouldDelayChildPressedState()
            if (r1 == 0) goto L20
            return r2
        L20:
            android.view.ViewParent r0 = r0.getParent()
            goto L4
        L25:
            r0 = 0
            return r0
    }

    private static boolean isMouseEvent(android.view.MotionEvent r2) {
            r0 = 0
            int r2 = r2.getToolType(r0)
            r1 = 3
            if (r2 != r1) goto La
            r2 = 1
            return r2
        La:
            return r0
    }

    private boolean isMultipleOfStepSize(float r5) {
            r4 = this;
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r5 = java.lang.Float.toString(r5)
            r0.<init>(r5)
            java.math.BigDecimal r5 = new java.math.BigDecimal
            float r1 = r4.stepSize
            java.lang.String r1 = java.lang.Float.toString(r1)
            r5.<init>(r1)
            java.math.MathContext r1 = java.math.MathContext.DECIMAL64
            java.math.BigDecimal r5 = r0.divide(r5, r1)
            double r0 = r5.doubleValue()
            long r2 = java.lang.Math.round(r0)
            double r2 = (double) r2
            double r2 = r2 - r0
            double r0 = java.lang.Math.abs(r2)
            r2 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L33
            r5 = 1
            return r5
        L33:
            r5 = 0
            return r5
    }

    private boolean isPotentialVerticalScroll(android.view.MotionEvent r1) {
            r0 = this;
            boolean r1 = isMouseEvent(r1)
            if (r1 != 0) goto Le
            boolean r1 = r0.isInVerticalScrollingContainer()
            if (r1 == 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    private void loadResources(@androidx.annotation.NonNull android.content.res.Resources r3) {
            r2 = this;
            int r0 = com.google.android.material.R.dimen.mtrl_slider_widget_height
            int r0 = r3.getDimensionPixelSize(r0)
            r2.minWidgetHeight = r0
            int r0 = com.google.android.material.R.dimen.mtrl_slider_track_side_padding
            int r0 = r3.getDimensionPixelOffset(r0)
            r2.minTrackSidePadding = r0
            r2.trackSidePadding = r0
            int r0 = com.google.android.material.R.dimen.mtrl_slider_thumb_radius
            int r0 = r3.getDimensionPixelSize(r0)
            r2.defaultThumbRadius = r0
            int r0 = com.google.android.material.R.dimen.mtrl_slider_track_height
            int r0 = r3.getDimensionPixelSize(r0)
            r2.defaultTrackHeight = r0
            int r0 = com.google.android.material.R.dimen.mtrl_slider_tick_radius
            int r1 = r3.getDimensionPixelSize(r0)
            r2.defaultTickActiveRadius = r1
            int r0 = r3.getDimensionPixelSize(r0)
            r2.defaultTickInactiveRadius = r0
            int r0 = com.google.android.material.R.dimen.mtrl_slider_label_padding
            int r3 = r3.getDimensionPixelSize(r0)
            r2.labelPadding = r3
            return
    }

    private void maybeCalculateTicksCoordinates() {
            r7 = this;
            float r0 = r7.stepSize
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L8
            goto L59
        L8:
            r7.validateConfigurationIfDirty()
            float r0 = r7.valueTo
            float r1 = r7.valueFrom
            float r0 = r0 - r1
            float r1 = r7.stepSize
            float r0 = r0 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 + r1
            int r0 = (int) r0
            int r1 = r7.trackWidth
            int r2 = r7.trackHeight
            int r2 = r2 * 2
            int r1 = r1 / r2
            int r1 = r1 + 1
            int r0 = java.lang.Math.min(r0, r1)
            float[] r1 = r7.ticksCoordinates
            if (r1 == 0) goto L2d
            int r1 = r1.length
            int r2 = r0 * 2
            if (r1 == r2) goto L33
        L2d:
            int r1 = r0 * 2
            float[] r1 = new float[r1]
            r7.ticksCoordinates = r1
        L33:
            int r1 = r7.trackWidth
            float r1 = (float) r1
            int r2 = r0 + (-1)
            float r2 = (float) r2
            float r1 = r1 / r2
            r2 = 0
        L3b:
            int r3 = r0 * 2
            if (r2 >= r3) goto L59
            float[] r3 = r7.ticksCoordinates
            int r4 = r7.trackSidePadding
            float r4 = (float) r4
            float r5 = (float) r2
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r6
            float r5 = r5 * r1
            float r4 = r4 + r5
            r3[r2] = r4
            int r4 = r2 + 1
            int r5 = r7.calculateTrackCenter()
            float r5 = (float) r5
            r3[r4] = r5
            int r2 = r2 + 2
            goto L3b
        L59:
            return
    }

    private void maybeDrawCompatHalo(@androidx.annotation.NonNull android.graphics.Canvas r9, int r10, int r11) {
            r8 = this;
            boolean r0 = r8.shouldDrawCompatHalo()
            if (r0 == 0) goto L45
            int r0 = r8.trackSidePadding
            float r0 = (float) r0
            java.util.ArrayList<java.lang.Float> r1 = r8.values
            int r2 = r8.focusedThumbIdx
            java.lang.Object r1 = r1.get(r2)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            float r1 = r8.normalizeValue(r1)
            float r10 = (float) r10
            float r1 = r1 * r10
            float r0 = r0 + r1
            int r10 = (int) r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L3a
            int r0 = r8.haloRadius
            int r1 = r10 - r0
            float r3 = (float) r1
            int r1 = r11 - r0
            float r4 = (float) r1
            int r1 = r10 + r0
            float r5 = (float) r1
            int r0 = r0 + r11
            float r6 = (float) r0
            android.graphics.Region$Op r7 = android.graphics.Region.Op.UNION
            r2 = r9
            r2.clipRect(r3, r4, r5, r6, r7)
            goto L3b
        L3a:
            r2 = r9
        L3b:
            float r9 = (float) r10
            float r10 = (float) r11
            int r11 = r8.haloRadius
            float r11 = (float) r11
            android.graphics.Paint r0 = r8.haloPaint
            r2.drawCircle(r9, r10, r11, r0)
        L45:
            return
    }

    private void maybeDrawTicks(@androidx.annotation.NonNull android.graphics.Canvas r6) {
            r5 = this;
            boolean r0 = r5.tickVisible
            if (r0 == 0) goto L3f
            float r0 = r5.stepSize
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto Lc
            goto L3f
        Lc:
            float[] r0 = r5.getActiveRange()
            float[] r1 = r5.ticksCoordinates
            r2 = 0
            r3 = r0[r2]
            int r1 = pivotIndex(r1, r3)
            float[] r3 = r5.ticksCoordinates
            r4 = 1
            r0 = r0[r4]
            int r0 = pivotIndex(r3, r0)
            float[] r3 = r5.ticksCoordinates
            int r1 = r1 * 2
            android.graphics.Paint r4 = r5.inactiveTicksPaint
            r6.drawPoints(r3, r2, r1, r4)
            float[] r2 = r5.ticksCoordinates
            int r0 = r0 * 2
            int r3 = r0 - r1
            android.graphics.Paint r4 = r5.activeTicksPaint
            r6.drawPoints(r2, r1, r3, r4)
            float[] r1 = r5.ticksCoordinates
            int r2 = r1.length
            int r2 = r2 - r0
            android.graphics.Paint r3 = r5.inactiveTicksPaint
            r6.drawPoints(r1, r0, r2, r3)
        L3f:
            return
    }

    private boolean maybeIncreaseTrackSidePadding() {
            r6 = this;
            int r0 = r6.thumbRadius
            int r1 = r6.defaultThumbRadius
            int r0 = r0 - r1
            r1 = 0
            int r0 = java.lang.Math.max(r0, r1)
            int r2 = r6.trackHeight
            int r3 = r6.defaultTrackHeight
            int r2 = r2 - r3
            int r2 = r2 / 2
            int r2 = java.lang.Math.max(r2, r1)
            int r3 = r6.tickActiveRadius
            int r4 = r6.defaultTickActiveRadius
            int r3 = r3 - r4
            int r3 = java.lang.Math.max(r3, r1)
            int r4 = r6.tickInactiveRadius
            int r5 = r6.defaultTickInactiveRadius
            int r4 = r4 - r5
            int r4 = java.lang.Math.max(r4, r1)
            int r5 = r6.minTrackSidePadding
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = java.lang.Math.max(r3, r4)
            int r0 = java.lang.Math.max(r0, r2)
            int r5 = r5 + r0
            int r0 = r6.trackSidePadding
            if (r0 != r5) goto L3b
            return r1
        L3b:
            r6.trackSidePadding = r5
            boolean r0 = androidx.core.view.ViewCompat.isLaidOut(r6)
            if (r0 == 0) goto L4a
            int r0 = r6.getWidth()
            r6.updateTrackWidth(r0)
        L4a:
            r0 = 1
            return r0
    }

    private boolean maybeIncreaseWidgetHeight() {
            r3 = this;
            int r0 = r3.getPaddingTop()
            int r1 = r3.getPaddingBottom()
            int r0 = r0 + r1
            int r1 = r3.trackHeight
            int r1 = r1 + r0
            int r0 = r3.thumbRadius
            int r0 = r0 * 2
            int r2 = r3.getPaddingTop()
            int r0 = r0 + r2
            int r2 = r3.getPaddingBottom()
            int r0 = r0 + r2
            int r2 = r3.minWidgetHeight
            int r0 = java.lang.Math.max(r1, r0)
            int r0 = java.lang.Math.max(r2, r0)
            int r1 = r3.widgetHeight
            if (r0 != r1) goto L2a
            r0 = 0
            return r0
        L2a:
            r3.widgetHeight = r0
            r0 = 1
            return r0
    }

    private boolean moveFocus(int r12) {
            r11 = this;
            int r0 = r11.focusedThumbIdx
            long r1 = (long) r0
            long r3 = (long) r12
            long r5 = r1 + r3
            java.util.ArrayList<java.lang.Float> r12 = r11.values
            int r12 = r12.size()
            r1 = 1
            int r12 = r12 - r1
            long r9 = (long) r12
            r7 = 0
            long r2 = androidx.core.math.MathUtils.clamp(r5, r7, r9)
            int r12 = (int) r2
            r11.focusedThumbIdx = r12
            if (r12 != r0) goto L1c
            r12 = 0
            return r12
        L1c:
            int r0 = r11.activeThumbIdx
            r2 = -1
            if (r0 == r2) goto L23
            r11.activeThumbIdx = r12
        L23:
            r11.updateHaloHotspot()
            r11.postInvalidate()
            return r1
    }

    private boolean moveFocusInAbsoluteDirection(int r2) {
            r1 = this;
            boolean r0 = r1.isRtl()
            if (r0 == 0) goto Lf
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 != r0) goto Le
            r2 = 2147483647(0x7fffffff, float:NaN)
            goto Lf
        Le:
            int r2 = -r2
        Lf:
            boolean r2 = r1.moveFocus(r2)
            return r2
    }

    private float normalizeValue(float r3) {
            r2 = this;
            float r0 = r2.valueFrom
            float r3 = r3 - r0
            float r1 = r2.valueTo
            float r1 = r1 - r0
            float r3 = r3 / r1
            boolean r0 = r2.isRtl()
            if (r0 == 0) goto L11
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r3
            return r0
        L11:
            return r3
    }

    @androidx.annotation.Nullable
    private java.lang.Boolean onKeyDownNoActiveThumb(int r4, @androidx.annotation.NonNull android.view.KeyEvent r5) {
            r3 = this;
            r0 = 61
            r1 = -1
            r2 = 1
            if (r4 == r0) goto L3d
            r5 = 66
            if (r4 == r5) goto L33
            r5 = 81
            if (r4 == r5) goto L2d
            r5 = 69
            if (r4 == r5) goto L27
            r5 = 70
            if (r4 == r5) goto L2d
            switch(r4) {
                case 21: goto L21;
                case 22: goto L1b;
                case 23: goto L33;
                default: goto L19;
            }
        L19:
            r4 = 0
            return r4
        L1b:
            r3.moveFocusInAbsoluteDirection(r2)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L21:
            r3.moveFocusInAbsoluteDirection(r1)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L27:
            r3.moveFocus(r1)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L2d:
            r3.moveFocus(r2)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L33:
            int r4 = r3.focusedThumbIdx
            r3.activeThumbIdx = r4
            r3.postInvalidate()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L3d:
            boolean r4 = r5.hasNoModifiers()
            if (r4 == 0) goto L4c
            boolean r4 = r3.moveFocus(r2)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L4c:
            boolean r4 = r5.isShiftPressed()
            if (r4 == 0) goto L5b
            boolean r4 = r3.moveFocus(r1)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L5b:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
    }

    private void onStartTrackingTouch() {
            r2 = this;
            java.util.List<T extends com.google.android.material.slider.BaseOnSliderTouchListener<S>> r0 = r2.touchListeners
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.google.android.material.slider.BaseOnSliderTouchListener r1 = (com.google.android.material.slider.BaseOnSliderTouchListener) r1
            r1.onStartTrackingTouch(r2)
            goto L6
        L16:
            return
    }

    private void onStopTrackingTouch() {
            r2 = this;
            java.util.List<T extends com.google.android.material.slider.BaseOnSliderTouchListener<S>> r0 = r2.touchListeners
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.google.android.material.slider.BaseOnSliderTouchListener r1 = (com.google.android.material.slider.BaseOnSliderTouchListener) r1
            r1.onStopTrackingTouch(r2)
            goto L6
        L16:
            return
    }

    private static int pivotIndex(float[] r0, float r1) {
            int r0 = r0.length
            int r0 = r0 / 2
            int r0 = r0 + (-1)
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = java.lang.Math.round(r1)
            return r0
    }

    private void processAttributes(android.content.Context r8, android.util.AttributeSet r9, int r10) {
            r7 = this;
            int[] r2 = com.google.android.material.R.styleable.Slider
            int r4 = com.google.android.material.slider.BaseSlider.DEF_STYLE_RES
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r8 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r9 = com.google.android.material.R.styleable.Slider_labelStyle
            int r10 = com.google.android.material.R.style.Widget_MaterialComponents_Tooltip
            int r9 = r8.getResourceId(r9, r10)
            r7.labelStyle = r9
            int r9 = com.google.android.material.R.styleable.Slider_android_valueFrom
            r10 = 0
            float r9 = r8.getFloat(r9, r10)
            r7.valueFrom = r9
            int r9 = com.google.android.material.R.styleable.Slider_android_valueTo
            r1 = 1065353216(0x3f800000, float:1.0)
            float r9 = r8.getFloat(r9, r1)
            r7.valueTo = r9
            float r9 = r7.valueFrom
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            r1 = 1
            java.lang.Float[] r2 = new java.lang.Float[r1]
            r2[r6] = r9
            r7.setValues(r2)
            int r9 = com.google.android.material.R.styleable.Slider_android_stepSize
            float r9 = r8.getFloat(r9, r10)
            r7.stepSize = r9
            android.content.Context r9 = r7.getContext()
            r2 = 48
            float r9 = com.google.android.material.internal.ViewUtils.dpToPx(r9, r2)
            double r2 = (double) r9
            double r2 = java.lang.Math.ceil(r2)
            float r9 = (float) r2
            int r2 = com.google.android.material.R.styleable.Slider_minTouchTargetSize
            float r9 = r8.getDimension(r2, r9)
            double r2 = (double) r9
            double r2 = java.lang.Math.ceil(r2)
            int r9 = (int) r2
            r7.minTouchTargetSize = r9
            int r9 = com.google.android.material.R.styleable.Slider_trackColor
            boolean r2 = r8.hasValue(r9)
            if (r2 == 0) goto L69
            r3 = r9
            goto L6b
        L69:
            int r3 = com.google.android.material.R.styleable.Slider_trackColorInactive
        L6b:
            if (r2 == 0) goto L6e
            goto L70
        L6e:
            int r9 = com.google.android.material.R.styleable.Slider_trackColorActive
        L70:
            android.content.res.ColorStateList r2 = com.google.android.material.resources.MaterialResources.getColorStateList(r0, r8, r3)
            if (r2 == 0) goto L77
            goto L7d
        L77:
            int r2 = com.google.android.material.R.color.material_slider_inactive_track_color
            android.content.res.ColorStateList r2 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r0, r2)
        L7d:
            r7.setTrackInactiveTintList(r2)
            android.content.res.ColorStateList r9 = com.google.android.material.resources.MaterialResources.getColorStateList(r0, r8, r9)
            if (r9 == 0) goto L87
            goto L8d
        L87:
            int r9 = com.google.android.material.R.color.material_slider_active_track_color
            android.content.res.ColorStateList r9 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r0, r9)
        L8d:
            r7.setTrackActiveTintList(r9)
            int r9 = com.google.android.material.R.styleable.Slider_thumbColor
            android.content.res.ColorStateList r9 = com.google.android.material.resources.MaterialResources.getColorStateList(r0, r8, r9)
            com.google.android.material.shape.MaterialShapeDrawable r2 = r7.defaultThumbDrawable
            r2.setFillColor(r9)
            int r9 = com.google.android.material.R.styleable.Slider_thumbStrokeColor
            boolean r2 = r8.hasValue(r9)
            if (r2 == 0) goto Laa
            android.content.res.ColorStateList r9 = com.google.android.material.resources.MaterialResources.getColorStateList(r0, r8, r9)
            r7.setThumbStrokeColor(r9)
        Laa:
            int r9 = com.google.android.material.R.styleable.Slider_thumbStrokeWidth
            float r9 = r8.getDimension(r9, r10)
            r7.setThumbStrokeWidth(r9)
            int r9 = com.google.android.material.R.styleable.Slider_haloColor
            android.content.res.ColorStateList r9 = com.google.android.material.resources.MaterialResources.getColorStateList(r0, r8, r9)
            if (r9 == 0) goto Lbc
            goto Lc2
        Lbc:
            int r9 = com.google.android.material.R.color.material_slider_halo_color
            android.content.res.ColorStateList r9 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r0, r9)
        Lc2:
            r7.setHaloTintList(r9)
            int r9 = com.google.android.material.R.styleable.Slider_tickVisible
            boolean r9 = r8.getBoolean(r9, r1)
            r7.tickVisible = r9
            int r9 = com.google.android.material.R.styleable.Slider_tickColor
            boolean r2 = r8.hasValue(r9)
            if (r2 == 0) goto Ld7
            r3 = r9
            goto Ld9
        Ld7:
            int r3 = com.google.android.material.R.styleable.Slider_tickColorInactive
        Ld9:
            if (r2 == 0) goto Ldc
            goto Lde
        Ldc:
            int r9 = com.google.android.material.R.styleable.Slider_tickColorActive
        Lde:
            android.content.res.ColorStateList r2 = com.google.android.material.resources.MaterialResources.getColorStateList(r0, r8, r3)
            if (r2 == 0) goto Le5
            goto Leb
        Le5:
            int r2 = com.google.android.material.R.color.material_slider_inactive_tick_marks_color
            android.content.res.ColorStateList r2 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r0, r2)
        Leb:
            r7.setTickInactiveTintList(r2)
            android.content.res.ColorStateList r9 = com.google.android.material.resources.MaterialResources.getColorStateList(r0, r8, r9)
            if (r9 == 0) goto Lf5
            goto Lfb
        Lf5:
            int r9 = com.google.android.material.R.color.material_slider_active_tick_marks_color
            android.content.res.ColorStateList r9 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r0, r9)
        Lfb:
            r7.setTickActiveTintList(r9)
            int r9 = com.google.android.material.R.styleable.Slider_thumbRadius
            int r9 = r8.getDimensionPixelSize(r9, r6)
            r7.setThumbRadius(r9)
            int r9 = com.google.android.material.R.styleable.Slider_haloRadius
            int r9 = r8.getDimensionPixelSize(r9, r6)
            r7.setHaloRadius(r9)
            int r9 = com.google.android.material.R.styleable.Slider_thumbElevation
            float r9 = r8.getDimension(r9, r10)
            r7.setThumbElevation(r9)
            int r9 = com.google.android.material.R.styleable.Slider_trackHeight
            int r9 = r8.getDimensionPixelSize(r9, r6)
            r7.setTrackHeight(r9)
            int r9 = com.google.android.material.R.styleable.Slider_tickRadiusActive
            int r9 = r8.getDimensionPixelSize(r9, r6)
            r7.setTickActiveRadius(r9)
            int r9 = com.google.android.material.R.styleable.Slider_tickRadiusInactive
            int r9 = r8.getDimensionPixelSize(r9, r6)
            r7.setTickInactiveRadius(r9)
            int r9 = com.google.android.material.R.styleable.Slider_labelBehavior
            int r9 = r8.getInt(r9, r6)
            r7.setLabelBehavior(r9)
            int r9 = com.google.android.material.R.styleable.Slider_android_enabled
            boolean r9 = r8.getBoolean(r9, r1)
            if (r9 != 0) goto L148
            r7.setEnabled(r6)
        L148:
            r8.recycle()
            return
    }

    private void scheduleAccessibilityEventSender(int r3) {
            r2 = this;
            com.google.android.material.slider.BaseSlider<S, L, T>$AccessibilityEventSender r0 = r2.accessibilityEventSender
            if (r0 != 0) goto Ld
            com.google.android.material.slider.BaseSlider$AccessibilityEventSender r0 = new com.google.android.material.slider.BaseSlider$AccessibilityEventSender
            r1 = 0
            r0.<init>(r2, r1)
            r2.accessibilityEventSender = r0
            goto L10
        Ld:
            r2.removeCallbacks(r0)
        L10:
            com.google.android.material.slider.BaseSlider<S, L, T>$AccessibilityEventSender r0 = r2.accessibilityEventSender
            r0.setVirtualViewId(r3)
            com.google.android.material.slider.BaseSlider<S, L, T>$AccessibilityEventSender r3 = r2.accessibilityEventSender
            r0 = 200(0xc8, double:9.9E-322)
            r2.postDelayed(r3, r0)
            return
    }

    private void setValueForLabel(com.google.android.material.tooltip.TooltipDrawable r4, float r5) {
            r3 = this;
            java.lang.String r0 = r3.formatValue(r5)
            r4.setText(r0)
            int r0 = r3.trackSidePadding
            float r5 = r3.normalizeValue(r5)
            int r1 = r3.trackWidth
            float r1 = (float) r1
            float r5 = r5 * r1
            int r5 = (int) r5
            int r0 = r0 + r5
            int r5 = r4.getIntrinsicWidth()
            int r5 = r5 / 2
            int r0 = r0 - r5
            int r5 = r3.calculateTrackCenter()
            int r1 = r3.labelPadding
            int r2 = r3.thumbRadius
            int r1 = r1 + r2
            int r5 = r5 - r1
            int r1 = r4.getIntrinsicHeight()
            int r1 = r5 - r1
            int r2 = r4.getIntrinsicWidth()
            int r2 = r2 + r0
            r4.setBounds(r0, r1, r2, r5)
            android.graphics.Rect r5 = new android.graphics.Rect
            android.graphics.Rect r0 = r4.getBounds()
            r5.<init>(r0)
            android.view.ViewGroup r0 = com.google.android.material.internal.ViewUtils.getContentView(r3)
            com.google.android.material.internal.DescendantOffsetUtils.offsetDescendantRect(r0, r3, r5)
            r4.setBounds(r5)
            com.google.android.material.internal.ViewOverlayImpl r5 = com.google.android.material.internal.ViewUtils.getContentViewOverlay(r3)
            r5.add(r4)
            return
    }

    private void setValuesInternal(@androidx.annotation.NonNull java.util.ArrayList<java.lang.Float> r3) {
            r2 = this;
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L33
            java.util.Collections.sort(r3)
            java.util.ArrayList<java.lang.Float> r0 = r2.values
            int r0 = r0.size()
            int r1 = r3.size()
            if (r0 != r1) goto L1e
            java.util.ArrayList<java.lang.Float> r0 = r2.values
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L1e
            return
        L1e:
            r2.values = r3
            r3 = 1
            r2.dirtyConfig = r3
            r3 = 0
            r2.focusedThumbIdx = r3
            r2.updateHaloHotspot()
            r2.createLabelPool()
            r2.dispatchOnChangedProgrammatically()
            r2.postInvalidate()
            return
        L33:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "At least one value must be set"
            r3.<init>(r0)
            throw r3
    }

    private boolean shouldAlwaysShowLabel() {
            r2 = this;
            int r0 = r2.labelBehavior
            r1 = 3
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    private boolean shouldDrawCompatHalo() {
            r1 = this;
            boolean r0 = r1.forceDrawCompatHalo
            if (r0 != 0) goto Lf
            android.graphics.drawable.Drawable r0 = r1.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.RippleDrawable
            if (r0 != 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    private boolean snapActiveThumbToValue(float r2) {
            r1 = this;
            int r0 = r1.activeThumbIdx
            boolean r2 = r1.snapThumbToValue(r0, r2)
            return r2
    }

    private double snapPosition(float r6) {
            r5 = this;
            float r0 = r5.stepSize
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L19
            float r1 = r5.valueTo
            float r2 = r5.valueFrom
            float r1 = r1 - r2
            float r1 = r1 / r0
            int r0 = (int) r1
            float r1 = (float) r0
            float r6 = r6 * r1
            int r6 = java.lang.Math.round(r6)
            double r1 = (double) r6
            double r3 = (double) r0
            double r1 = r1 / r3
            return r1
        L19:
            double r0 = (double) r6
            return r0
    }

    private boolean snapThumbToValue(int r6, float r7) {
            r5 = this;
            r5.focusedThumbIdx = r6
            java.util.ArrayList<java.lang.Float> r0 = r5.values
            java.lang.Object r0 = r0.get(r6)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            float r0 = r7 - r0
            float r0 = java.lang.Math.abs(r0)
            double r0 = (double) r0
            r2 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L20
            r6 = 0
            return r6
        L20:
            float r7 = r5.getClampedValue(r6, r7)
            java.util.ArrayList<java.lang.Float> r0 = r5.values
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            r0.set(r6, r7)
            r5.dispatchOnChangedFromUser(r6)
            r6 = 1
            return r6
    }

    private boolean snapTouchPosition() {
            r1 = this;
            float r0 = r1.getValueOfTouchPosition()
            boolean r0 = r1.snapActiveThumbToValue(r0)
            return r0
    }

    private void updateHaloHotspot() {
            r6 = this;
            boolean r0 = r6.shouldDrawCompatHalo()
            if (r0 != 0) goto L3f
            int r0 = r6.getMeasuredWidth()
            if (r0 <= 0) goto L3f
            android.graphics.drawable.Drawable r0 = r6.getBackground()
            boolean r1 = r0 instanceof android.graphics.drawable.RippleDrawable
            if (r1 == 0) goto L3f
            java.util.ArrayList<java.lang.Float> r1 = r6.values
            int r2 = r6.focusedThumbIdx
            java.lang.Object r1 = r1.get(r2)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            float r1 = r6.normalizeValue(r1)
            int r2 = r6.trackWidth
            float r2 = (float) r2
            float r1 = r1 * r2
            int r2 = r6.trackSidePadding
            float r2 = (float) r2
            float r1 = r1 + r2
            int r1 = (int) r1
            int r2 = r6.calculateTrackCenter()
            int r3 = r6.haloRadius
            int r4 = r1 - r3
            int r5 = r2 - r3
            int r1 = r1 + r3
            int r2 = r2 + r3
            androidx.core.graphics.drawable.DrawableCompat.setHotspotBounds(r0, r4, r5, r1, r2)
        L3f:
            return
    }

    private void updateTrackWidth(int r2) {
            r1 = this;
            int r0 = r1.trackSidePadding
            int r0 = r0 * 2
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r2, r0)
            r1.trackWidth = r2
            r1.maybeCalculateTicksCoordinates()
            return
    }

    private void updateWidgetLayout() {
            r2 = this;
            boolean r0 = r2.maybeIncreaseWidgetHeight()
            boolean r1 = r2.maybeIncreaseTrackSidePadding()
            if (r0 == 0) goto Le
            r2.requestLayout()
            return
        Le:
            if (r1 == 0) goto L13
            r2.postInvalidate()
        L13:
            return
    }

    private void validateConfigurationIfDirty() {
            r1 = this;
            boolean r0 = r1.dirtyConfig
            if (r0 == 0) goto L19
            r1.validateValueFrom()
            r1.validateValueTo()
            r1.validateStepSize()
            r1.validateValues()
            r1.validateMinSeparation()
            r1.warnAboutFloatingPointError()
            r0 = 0
            r1.dirtyConfig = r0
        L19:
            return
    }

    private void validateMinSeparation() {
            r8 = this;
            float r0 = r8.getMinSeparation()
            r1 = 0
            r2 = 1
            r3 = 0
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 < 0) goto L67
            float r4 = r8.stepSize
            int r5 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r5 <= 0) goto L66
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 <= 0) goto L66
            int r3 = r8.separationUnit
            r5 = 2
            if (r3 != r2) goto L4a
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 < 0) goto L25
            boolean r3 = r8.isMultipleOfStepSize(r0)
            if (r3 == 0) goto L25
            goto L66
        L25:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            float r4 = r8.stepSize
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            float r6 = r8.stepSize
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r1] = r0
            r7[r2] = r4
            r7[r5] = r6
            java.lang.String r0 = "minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)"
            java.lang.String r0 = java.lang.String.format(r0, r7)
            r3.<init>(r0)
            throw r3
        L4a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            float r4 = r8.stepSize
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r1] = r0
            r5[r2] = r4
            java.lang.String r0 = "minSeparation(%s) cannot be set as a dimension when using stepSize(%s)"
            java.lang.String r0 = java.lang.String.format(r0, r5)
            r3.<init>(r0)
            throw r3
        L66:
            return
        L67:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r0
            java.lang.String r0 = "minSeparation(%s) must be greater or equal to 0"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r3.<init>(r0)
            throw r3
    }

    private void validateStepSize() {
            r6 = this;
            float r0 = r6.stepSize
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L3a
            float r0 = r6.valueTo
            boolean r0 = r6.valueLandsOnTick(r0)
            if (r0 == 0) goto L10
            goto L3a
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            float r1 = r6.stepSize
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            float r2 = r6.valueFrom
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            float r3 = r6.valueTo
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r1
            r1 = 1
            r4[r1] = r2
            r1 = 2
            r4[r1] = r3
            java.lang.String r1 = "The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range"
            java.lang.String r1 = java.lang.String.format(r1, r4)
            r0.<init>(r1)
            throw r0
        L3a:
            return
    }

    private void validateValueFrom() {
            r5 = this;
            float r0 = r5.valueFrom
            float r1 = r5.valueTo
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L9
            return
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            float r1 = r5.valueFrom
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            float r2 = r5.valueTo
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r1
            r1 = 1
            r3[r1] = r2
            java.lang.String r1 = "valueFrom(%s) must be smaller than valueTo(%s)"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            r0.<init>(r1)
            throw r0
    }

    private void validateValueTo() {
            r5 = this;
            float r0 = r5.valueTo
            float r1 = r5.valueFrom
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L9
            return
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            float r1 = r5.valueTo
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            float r2 = r5.valueFrom
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r1
            r1 = 1
            r3[r1] = r2
            java.lang.String r1 = "valueTo(%s) must be greater than valueFrom(%s)"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            r0.<init>(r1)
            throw r0
    }

    private void validateValues() {
            r10 = this;
            java.util.ArrayList<java.lang.Float> r0 = r10.values
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L85
            java.lang.Object r1 = r0.next()
            java.lang.Float r1 = (java.lang.Float) r1
            float r2 = r1.floatValue()
            float r3 = r10.valueFrom
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L65
            float r2 = r1.floatValue()
            float r3 = r10.valueTo
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L65
            float r2 = r10.stepSize
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L6
            float r2 = r1.floatValue()
            boolean r2 = r10.valueLandsOnTick(r2)
            if (r2 == 0) goto L3c
            goto L6
        L3c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            float r2 = r10.valueFrom
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            float r3 = r10.stepSize
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            float r8 = r10.stepSize
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            r9 = 4
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r7] = r1
            r9[r6] = r2
            r9[r5] = r3
            r9[r4] = r8
            java.lang.String r1 = "Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)"
            java.lang.String r1 = java.lang.String.format(r1, r9)
            r0.<init>(r1)
            throw r0
        L65:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            float r2 = r10.valueFrom
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            float r3 = r10.valueTo
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r7] = r1
            r4[r6] = r2
            r4[r5] = r3
            java.lang.String r1 = "Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)"
            java.lang.String r1 = java.lang.String.format(r1, r4)
            r0.<init>(r1)
            throw r0
        L85:
            return
    }

    private boolean valueLandsOnTick(float r2) {
            r1 = this;
            float r0 = r1.valueFrom
            float r2 = r2 - r0
            boolean r2 = r1.isMultipleOfStepSize(r2)
            return r2
    }

    private float valueToX(float r2) {
            r1 = this;
            float r2 = r1.normalizeValue(r2)
            int r0 = r1.trackWidth
            float r0 = (float) r0
            float r2 = r2 * r0
            int r0 = r1.trackSidePadding
            float r0 = (float) r0
            float r2 = r2 + r0
            return r2
    }

    private void warnAboutFloatingPointError() {
            r7 = this;
            float r0 = r7.stepSize
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L8
            goto L50
        L8:
            int r1 = (int) r0
            float r1 = (float) r1
            r2 = 1
            r3 = 0
            r4 = 2
            java.lang.String r5 = "Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly."
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 == 0) goto L22
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r6 = "stepSize"
            r1[r3] = r6
            r1[r2] = r0
            java.lang.String.format(r5, r1)
        L22:
            float r0 = r7.valueFrom
            int r1 = (int) r0
            float r1 = (float) r1
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 == 0) goto L39
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r6 = "valueFrom"
            r1[r3] = r6
            r1[r2] = r0
            java.lang.String.format(r5, r1)
        L39:
            float r0 = r7.valueTo
            int r1 = (int) r0
            float r1 = (float) r1
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 == 0) goto L50
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r4 = "valueTo"
            r1[r3] = r4
            r1[r2] = r0
            java.lang.String.format(r5, r1)
        L50:
            return
    }

    public void addOnChangeListener(@androidx.annotation.NonNull L r2) {
            r1 = this;
            java.util.List<L extends com.google.android.material.slider.BaseOnChangeListener<S>> r0 = r1.changeListeners
            r0.add(r2)
            return
    }

    public void addOnSliderTouchListener(@androidx.annotation.NonNull T r2) {
            r1 = this;
            java.util.List<T extends com.google.android.material.slider.BaseOnSliderTouchListener<S>> r0 = r1.touchListeners
            r0.add(r2)
            return
    }

    public void clearOnChangeListeners() {
            r1 = this;
            java.util.List<L extends com.google.android.material.slider.BaseOnChangeListener<S>> r0 = r1.changeListeners
            r0.clear()
            return
    }

    public void clearOnSliderTouchListeners() {
            r1 = this;
            java.util.List<T extends com.google.android.material.slider.BaseOnSliderTouchListener<S>> r0 = r1.touchListeners
            r0.clear()
            return
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@androidx.annotation.NonNull android.view.MotionEvent r2) {
            r1 = this;
            com.google.android.material.slider.BaseSlider$AccessibilityHelper r0 = r1.accessibilityHelper
            boolean r0 = r0.dispatchHoverEvent(r2)
            if (r0 != 0) goto L11
            boolean r2 = super.dispatchHoverEvent(r2)
            if (r2 == 0) goto Lf
            goto L11
        Lf:
            r2 = 0
            return r2
        L11:
            r2 = 1
            return r2
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(@androidx.annotation.NonNull android.view.KeyEvent r1) {
            r0 = this;
            boolean r1 = super.dispatchKeyEvent(r1)
            return r1
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
            r3 = this;
            super.drawableStateChanged()
            android.graphics.Paint r0 = r3.inactiveTrackPaint
            android.content.res.ColorStateList r1 = r3.trackColorInactive
            int r1 = r3.getColorForState(r1)
            r0.setColor(r1)
            android.graphics.Paint r0 = r3.activeTrackPaint
            android.content.res.ColorStateList r1 = r3.trackColorActive
            int r1 = r3.getColorForState(r1)
            r0.setColor(r1)
            android.graphics.Paint r0 = r3.inactiveTicksPaint
            android.content.res.ColorStateList r1 = r3.tickColorInactive
            int r1 = r3.getColorForState(r1)
            r0.setColor(r1)
            android.graphics.Paint r0 = r3.activeTicksPaint
            android.content.res.ColorStateList r1 = r3.tickColorActive
            int r1 = r3.getColorForState(r1)
            r0.setColor(r1)
            java.util.List<com.google.android.material.tooltip.TooltipDrawable> r0 = r3.labels
            java.util.Iterator r0 = r0.iterator()
        L35:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4f
            java.lang.Object r1 = r0.next()
            com.google.android.material.tooltip.TooltipDrawable r1 = (com.google.android.material.tooltip.TooltipDrawable) r1
            boolean r2 = r1.isStateful()
            if (r2 == 0) goto L35
            int[] r2 = r3.getDrawableState()
            r1.setState(r2)
            goto L35
        L4f:
            com.google.android.material.shape.MaterialShapeDrawable r0 = r3.defaultThumbDrawable
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L60
            com.google.android.material.shape.MaterialShapeDrawable r0 = r3.defaultThumbDrawable
            int[] r1 = r3.getDrawableState()
            r0.setState(r1)
        L60:
            android.graphics.Paint r0 = r3.haloPaint
            android.content.res.ColorStateList r1 = r3.haloColor
            int r1 = r3.getColorForState(r1)
            r0.setColor(r1)
            android.graphics.Paint r0 = r3.haloPaint
            r1 = 63
            r0.setAlpha(r1)
            return
    }

    @androidx.annotation.VisibleForTesting
    void forceDrawCompatHalo(boolean r1) {
            r0 = this;
            r0.forceDrawCompatHalo = r1
            return
    }

    @Override // android.view.View
    @androidx.annotation.NonNull
    public java.lang.CharSequence getAccessibilityClassName() {
            r1 = this;
            java.lang.Class<android.widget.SeekBar> r0 = android.widget.SeekBar.class
            java.lang.String r0 = r0.getName()
            return r0
    }

    @androidx.annotation.VisibleForTesting
    final int getAccessibilityFocusedVirtualViewId() {
            r1 = this;
            com.google.android.material.slider.BaseSlider$AccessibilityHelper r0 = r1.accessibilityHelper
            int r0 = r0.getAccessibilityFocusedVirtualViewId()
            return r0
    }

    public int getActiveThumbIndex() {
            r1 = this;
            int r0 = r1.activeThumbIdx
            return r0
    }

    public int getFocusedThumbIndex() {
            r1 = this;
            int r0 = r1.focusedThumbIdx
            return r0
    }

    @androidx.annotation.Dimension
    public int getHaloRadius() {
            r1 = this;
            int r0 = r1.haloRadius
            return r0
    }

    @androidx.annotation.NonNull
    public android.content.res.ColorStateList getHaloTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.haloColor
            return r0
    }

    public int getLabelBehavior() {
            r1 = this;
            int r0 = r1.labelBehavior
            return r0
    }

    protected float getMinSeparation() {
            r1 = this;
            r0 = 0
            return r0
    }

    public float getStepSize() {
            r1 = this;
            float r0 = r1.stepSize
            return r0
    }

    public float getThumbElevation() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.defaultThumbDrawable
            float r0 = r0.getElevation()
            return r0
    }

    @androidx.annotation.Dimension
    public int getThumbRadius() {
            r1 = this;
            int r0 = r1.thumbRadius
            return r0
    }

    public android.content.res.ColorStateList getThumbStrokeColor() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.defaultThumbDrawable
            android.content.res.ColorStateList r0 = r0.getStrokeColor()
            return r0
    }

    public float getThumbStrokeWidth() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.defaultThumbDrawable
            float r0 = r0.getStrokeWidth()
            return r0
    }

    @androidx.annotation.NonNull
    public android.content.res.ColorStateList getThumbTintList() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.defaultThumbDrawable
            android.content.res.ColorStateList r0 = r0.getFillColor()
            return r0
    }

    @androidx.annotation.Dimension
    public int getTickActiveRadius() {
            r1 = this;
            int r0 = r1.tickActiveRadius
            return r0
    }

    @androidx.annotation.NonNull
    public android.content.res.ColorStateList getTickActiveTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.tickColorActive
            return r0
    }

    @androidx.annotation.Dimension
    public int getTickInactiveRadius() {
            r1 = this;
            int r0 = r1.tickInactiveRadius
            return r0
    }

    @androidx.annotation.NonNull
    public android.content.res.ColorStateList getTickInactiveTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.tickColorInactive
            return r0
    }

    @androidx.annotation.NonNull
    public android.content.res.ColorStateList getTickTintList() {
            r2 = this;
            android.content.res.ColorStateList r0 = r2.tickColorInactive
            android.content.res.ColorStateList r1 = r2.tickColorActive
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Ld
            android.content.res.ColorStateList r0 = r2.tickColorActive
            return r0
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead."
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.NonNull
    public android.content.res.ColorStateList getTrackActiveTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.trackColorActive
            return r0
    }

    @androidx.annotation.Dimension
    public int getTrackHeight() {
            r1 = this;
            int r0 = r1.trackHeight
            return r0
    }

    @androidx.annotation.NonNull
    public android.content.res.ColorStateList getTrackInactiveTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.trackColorInactive
            return r0
    }

    @androidx.annotation.Dimension
    public int getTrackSidePadding() {
            r1 = this;
            int r0 = r1.trackSidePadding
            return r0
    }

    @androidx.annotation.NonNull
    public android.content.res.ColorStateList getTrackTintList() {
            r2 = this;
            android.content.res.ColorStateList r0 = r2.trackColorInactive
            android.content.res.ColorStateList r1 = r2.trackColorActive
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Ld
            android.content.res.ColorStateList r0 = r2.trackColorActive
            return r0
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead."
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.Dimension
    public int getTrackWidth() {
            r1 = this;
            int r0 = r1.trackWidth
            return r0
    }

    public float getValueFrom() {
            r1 = this;
            float r0 = r1.valueFrom
            return r0
    }

    public float getValueTo() {
            r1 = this;
            float r0 = r1.valueTo
            return r0
    }

    @androidx.annotation.NonNull
    java.util.List<java.lang.Float> getValues() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.ArrayList<java.lang.Float> r1 = r2.values
            r0.<init>(r1)
            return r0
    }

    public boolean hasLabelFormatter() {
            r1 = this;
            com.google.android.material.slider.LabelFormatter r0 = r1.formatter
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    final boolean isRtl() {
            r2 = this;
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r2)
            r1 = 1
            if (r0 != r1) goto L8
            return r1
        L8:
            r0 = 0
            return r0
    }

    public boolean isTickVisible() {
            r1 = this;
            boolean r0 = r1.tickVisible
            return r0
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            java.util.List<com.google.android.material.tooltip.TooltipDrawable> r0 = r2.labels
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            com.google.android.material.tooltip.TooltipDrawable r1 = (com.google.android.material.tooltip.TooltipDrawable) r1
            r2.attachLabelToContentView(r1)
            goto L9
        L19:
            return
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
            r2 = this;
            com.google.android.material.slider.BaseSlider<S, L, T>$AccessibilityEventSender r0 = r2.accessibilityEventSender
            if (r0 == 0) goto L7
            r2.removeCallbacks(r0)
        L7:
            r0 = 0
            r2.labelsAreAnimatedIn = r0
            java.util.List<com.google.android.material.tooltip.TooltipDrawable> r0 = r2.labels
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            com.google.android.material.tooltip.TooltipDrawable r1 = (com.google.android.material.tooltip.TooltipDrawable) r1
            r2.detachLabelFromContentView(r1)
            goto L10
        L20:
            super.onDetachedFromWindow()
            return
    }

    @Override // android.view.View
    protected void onDraw(@androidx.annotation.NonNull android.graphics.Canvas r4) {
            r3 = this;
            boolean r0 = r3.dirtyConfig
            if (r0 == 0) goto La
            r3.validateConfigurationIfDirty()
            r3.maybeCalculateTicksCoordinates()
        La:
            super.onDraw(r4)
            int r0 = r3.calculateTrackCenter()
            int r1 = r3.trackWidth
            r3.drawInactiveTrack(r4, r1, r0)
            java.util.List r1 = r3.getValues()
            java.lang.Object r1 = java.util.Collections.max(r1)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            float r2 = r3.valueFrom
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L2f
            int r1 = r3.trackWidth
            r3.drawActiveTrack(r4, r1, r0)
        L2f:
            r3.maybeDrawTicks(r4)
            boolean r1 = r3.thumbIsPressed
            if (r1 != 0) goto L3c
            boolean r1 = r3.isFocused()
            if (r1 == 0) goto L47
        L3c:
            boolean r1 = r3.isEnabled()
            if (r1 == 0) goto L47
            int r1 = r3.trackWidth
            r3.maybeDrawCompatHalo(r4, r1, r0)
        L47:
            int r1 = r3.activeThumbIdx
            r2 = -1
            if (r1 != r2) goto L52
            boolean r1 = r3.shouldAlwaysShowLabel()
            if (r1 == 0) goto L5c
        L52:
            boolean r1 = r3.isEnabled()
            if (r1 == 0) goto L5c
            r3.ensureLabelsAdded()
            goto L5f
        L5c:
            r3.ensureLabelsRemoved()
        L5f:
            int r1 = r3.trackWidth
            r3.drawThumbs(r4, r1, r0)
            return
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean r1, int r2, @androidx.annotation.Nullable android.graphics.Rect r3) {
            r0 = this;
            super.onFocusChanged(r1, r2, r3)
            if (r1 != 0) goto L10
            r1 = -1
            r0.activeThumbIdx = r1
            com.google.android.material.slider.BaseSlider$AccessibilityHelper r1 = r0.accessibilityHelper
            int r2 = r0.focusedThumbIdx
            r1.clearKeyboardFocusForVirtualView(r2)
            return
        L10:
            r0.focusThumbOnFocusGained(r2)
            com.google.android.material.slider.BaseSlider$AccessibilityHelper r1 = r0.accessibilityHelper
            int r2 = r0.focusedThumbIdx
            r1.requestKeyboardFocusForVirtualView(r2)
            return
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r6, @androidx.annotation.NonNull android.view.KeyEvent r7) {
            r5 = this;
            boolean r0 = r5.isEnabled()
            if (r0 != 0) goto Lb
            boolean r6 = super.onKeyDown(r6, r7)
            return r6
        Lb:
            java.util.ArrayList<java.lang.Float> r0 = r5.values
            int r0 = r0.size()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L17
            r5.activeThumbIdx = r1
        L17:
            int r0 = r5.activeThumbIdx
            r3 = -1
            if (r0 != r3) goto L2c
            java.lang.Boolean r0 = r5.onKeyDownNoActiveThumb(r6, r7)
            if (r0 == 0) goto L27
            boolean r6 = r0.booleanValue()
            return r6
        L27:
            boolean r6 = super.onKeyDown(r6, r7)
            return r6
        L2c:
            boolean r0 = r5.isLongPress
            boolean r4 = r7.isLongPress()
            r0 = r0 | r4
            r5.isLongPress = r0
            java.lang.Float r0 = r5.calculateIncrementForKey(r6)
            if (r0 == 0) goto L5b
            java.util.ArrayList<java.lang.Float> r6 = r5.values
            int r7 = r5.activeThumbIdx
            java.lang.Object r6 = r6.get(r7)
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            float r7 = r0.floatValue()
            float r6 = r6 + r7
            boolean r6 = r5.snapActiveThumbToValue(r6)
            if (r6 == 0) goto L5a
            r5.updateHaloHotspot()
            r5.postInvalidate()
        L5a:
            return r2
        L5b:
            r0 = 23
            if (r6 == r0) goto L83
            r0 = 61
            if (r6 == r0) goto L6c
            r0 = 66
            if (r6 == r0) goto L83
            boolean r6 = super.onKeyDown(r6, r7)
            return r6
        L6c:
            boolean r6 = r7.hasNoModifiers()
            if (r6 == 0) goto L77
            boolean r6 = r5.moveFocus(r2)
            return r6
        L77:
            boolean r6 = r7.isShiftPressed()
            if (r6 == 0) goto L82
            boolean r6 = r5.moveFocus(r3)
            return r6
        L82:
            return r1
        L83:
            r5.activeThumbIdx = r3
            r5.postInvalidate()
            return r2
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int r2, @androidx.annotation.NonNull android.view.KeyEvent r3) {
            r1 = this;
            r0 = 0
            r1.isLongPress = r0
            boolean r2 = super.onKeyUp(r2, r3)
            return r2
    }

    @Override // android.view.View
    protected void onMeasure(int r4, int r5) {
            r3 = this;
            int r5 = r3.widgetHeight
            int r0 = r3.labelBehavior
            r1 = 1
            r2 = 0
            if (r0 == r1) goto Le
            boolean r0 = r3.shouldAlwaysShowLabel()
            if (r0 == 0) goto L1a
        Le:
            java.util.List<com.google.android.material.tooltip.TooltipDrawable> r0 = r3.labels
            java.lang.Object r0 = r0.get(r2)
            com.google.android.material.tooltip.TooltipDrawable r0 = (com.google.android.material.tooltip.TooltipDrawable) r0
            int r2 = r0.getIntrinsicHeight()
        L1a:
            int r5 = r5 + r2
            r0 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r0)
            super.onMeasure(r4, r5)
            return
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            com.google.android.material.slider.BaseSlider$SliderState r2 = (com.google.android.material.slider.BaseSlider.SliderState) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            float r0 = r2.valueFrom
            r1.valueFrom = r0
            float r0 = r2.valueTo
            r1.valueTo = r0
            java.util.ArrayList<java.lang.Float> r0 = r2.values
            r1.setValuesInternal(r0)
            float r0 = r2.stepSize
            r1.stepSize = r0
            boolean r2 = r2.hasFocus
            if (r2 == 0) goto L21
            r1.requestFocus()
        L21:
            return
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
            r3 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            com.google.android.material.slider.BaseSlider$SliderState r1 = new com.google.android.material.slider.BaseSlider$SliderState
            r1.<init>(r0)
            float r0 = r3.valueFrom
            r1.valueFrom = r0
            float r0 = r3.valueTo
            r1.valueTo = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.ArrayList<java.lang.Float> r2 = r3.values
            r0.<init>(r2)
            r1.values = r0
            float r0 = r3.stepSize
            r1.stepSize = r0
            boolean r0 = r3.hasFocus()
            r1.hasFocus = r0
            return r1
    }

    @Override // android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.updateTrackWidth(r1)
            r0.updateHaloHotspot()
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(@androidx.annotation.NonNull android.view.MotionEvent r6) {
            r5 = this;
            boolean r0 = r5.isEnabled()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            float r0 = r6.getX()
            int r2 = r5.trackSidePadding
            float r2 = (float) r2
            float r2 = r0 - r2
            int r3 = r5.trackWidth
            float r3 = (float) r3
            float r2 = r2 / r3
            r5.touchPosition = r2
            r3 = 0
            float r2 = java.lang.Math.max(r3, r2)
            r5.touchPosition = r2
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = java.lang.Math.min(r3, r2)
            r5.touchPosition = r2
            int r2 = r6.getActionMasked()
            r3 = 1
            if (r2 == 0) goto Lc4
            if (r2 == r3) goto L6f
            r4 = 2
            if (r2 == r4) goto L37
            r0 = 3
            if (r2 == r0) goto L6f
            goto Lec
        L37:
            boolean r2 = r5.thumbIsPressed
            if (r2 != 0) goto L5a
            boolean r2 = r5.isPotentialVerticalScroll(r6)
            if (r2 == 0) goto L50
            float r2 = r5.touchDownX
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            int r2 = r5.scaledTouchSlop
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L50
            return r1
        L50:
            android.view.ViewParent r0 = r5.getParent()
            r0.requestDisallowInterceptTouchEvent(r3)
            r5.onStartTrackingTouch()
        L5a:
            boolean r0 = r5.pickActiveThumb()
            if (r0 != 0) goto L62
            goto Lec
        L62:
            r5.thumbIsPressed = r3
            r5.snapTouchPosition()
            r5.updateHaloHotspot()
            r5.invalidate()
            goto Lec
        L6f:
            r5.thumbIsPressed = r1
            android.view.MotionEvent r0 = r5.lastEvent
            if (r0 == 0) goto Lb0
            int r0 = r0.getActionMasked()
            if (r0 != 0) goto Lb0
            android.view.MotionEvent r0 = r5.lastEvent
            float r0 = r0.getX()
            float r1 = r6.getX()
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r1 = r5.scaledTouchSlop
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto Lb0
            android.view.MotionEvent r0 = r5.lastEvent
            float r0 = r0.getY()
            float r1 = r6.getY()
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r1 = r5.scaledTouchSlop
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto Lb0
            boolean r0 = r5.pickActiveThumb()
            if (r0 == 0) goto Lb0
            r5.onStartTrackingTouch()
        Lb0:
            int r0 = r5.activeThumbIdx
            r1 = -1
            if (r0 == r1) goto Lc0
            r5.snapTouchPosition()
            r5.updateHaloHotspot()
            r5.activeThumbIdx = r1
            r5.onStopTrackingTouch()
        Lc0:
            r5.invalidate()
            goto Lec
        Lc4:
            r5.touchDownX = r0
            boolean r0 = r5.isPotentialVerticalScroll(r6)
            if (r0 == 0) goto Lcd
            goto Lec
        Lcd:
            android.view.ViewParent r0 = r5.getParent()
            r0.requestDisallowInterceptTouchEvent(r3)
            boolean r0 = r5.pickActiveThumb()
            if (r0 != 0) goto Ldb
            goto Lec
        Ldb:
            r5.requestFocus()
            r5.thumbIsPressed = r3
            r5.snapTouchPosition()
            r5.updateHaloHotspot()
            r5.invalidate()
            r5.onStartTrackingTouch()
        Lec:
            boolean r0 = r5.thumbIsPressed
            r5.setPressed(r0)
            android.view.MotionEvent r6 = android.view.MotionEvent.obtain(r6)
            r5.lastEvent = r6
            return r3
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@androidx.annotation.NonNull android.view.View r2, int r3) {
            r1 = this;
            super.onVisibilityChanged(r2, r3)
            if (r3 == 0) goto L22
            com.google.android.material.internal.ViewOverlayImpl r2 = com.google.android.material.internal.ViewUtils.getContentViewOverlay(r1)
            if (r2 != 0) goto Lc
            goto L22
        Lc:
            java.util.List<com.google.android.material.tooltip.TooltipDrawable> r3 = r1.labels
            java.util.Iterator r3 = r3.iterator()
        L12:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r3.next()
            com.google.android.material.tooltip.TooltipDrawable r0 = (com.google.android.material.tooltip.TooltipDrawable) r0
            r2.remove(r0)
            goto L12
        L22:
            return
    }

    protected boolean pickActiveThumb() {
            r11 = this;
            int r0 = r11.activeThumbIdx
            r1 = 1
            r2 = -1
            if (r0 == r2) goto L7
            return r1
        L7:
            float r0 = r11.getValueOfTouchPositionAbsolute()
            float r3 = r11.valueToX(r0)
            r4 = 0
            r11.activeThumbIdx = r4
            java.util.ArrayList<java.lang.Float> r5 = r11.values
            java.lang.Object r5 = r5.get(r4)
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            float r5 = r5 - r0
            float r5 = java.lang.Math.abs(r5)
            r6 = 1
        L24:
            java.util.ArrayList<java.lang.Float> r7 = r11.values
            int r7 = r7.size()
            if (r6 >= r7) goto L92
            java.util.ArrayList<java.lang.Float> r7 = r11.values
            java.lang.Object r7 = r7.get(r6)
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            float r7 = r7 - r0
            float r7 = java.lang.Math.abs(r7)
            java.util.ArrayList<java.lang.Float> r8 = r11.values
            java.lang.Object r8 = r8.get(r6)
            java.lang.Float r8 = (java.lang.Float) r8
            float r8 = r8.floatValue()
            float r8 = r11.valueToX(r8)
            int r9 = java.lang.Float.compare(r7, r5)
            if (r9 <= r1) goto L54
            goto L92
        L54:
            boolean r9 = r11.isRtl()
            r10 = 0
            if (r9 == 0) goto L65
            float r9 = r8 - r3
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 <= 0) goto L63
        L61:
            r9 = 1
            goto L6c
        L63:
            r9 = 0
            goto L6c
        L65:
            float r9 = r8 - r3
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 >= 0) goto L63
            goto L61
        L6c:
            int r10 = java.lang.Float.compare(r7, r5)
            if (r10 >= 0) goto L75
            r11.activeThumbIdx = r6
            goto L8e
        L75:
            int r10 = java.lang.Float.compare(r7, r5)
            if (r10 != 0) goto L8f
            float r8 = r8 - r3
            float r8 = java.lang.Math.abs(r8)
            int r10 = r11.scaledTouchSlop
            float r10 = (float) r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 >= 0) goto L8a
            r11.activeThumbIdx = r2
            return r4
        L8a:
            if (r9 == 0) goto L8f
            r11.activeThumbIdx = r6
        L8e:
            r5 = r7
        L8f:
            int r6 = r6 + 1
            goto L24
        L92:
            int r0 = r11.activeThumbIdx
            if (r0 == r2) goto L97
            return r1
        L97:
            return r4
    }

    public void removeOnChangeListener(@androidx.annotation.NonNull L r2) {
            r1 = this;
            java.util.List<L extends com.google.android.material.slider.BaseOnChangeListener<S>> r0 = r1.changeListeners
            r0.remove(r2)
            return
    }

    public void removeOnSliderTouchListener(@androidx.annotation.NonNull T r2) {
            r1 = this;
            java.util.List<T extends com.google.android.material.slider.BaseOnSliderTouchListener<S>> r0 = r1.touchListeners
            r0.remove(r2)
            return
    }

    protected void setActiveThumbIndex(int r1) {
            r0 = this;
            r0.activeThumbIdx = r1
            return
    }

    void setCustomThumbDrawable(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r2)
            r1.setCustomThumbDrawable(r2)
            return
    }

    void setCustomThumbDrawable(@androidx.annotation.NonNull android.graphics.drawable.Drawable r1) {
            r0 = this;
            android.graphics.drawable.Drawable r1 = r0.initializeCustomThumbDrawable(r1)
            r0.customThumbDrawable = r1
            java.util.List<android.graphics.drawable.Drawable> r1 = r0.customThumbDrawablesForValues
            r1.clear()
            r0.postInvalidate()
            return
    }

    void setCustomThumbDrawablesForValues(@androidx.annotation.NonNull @androidx.annotation.DrawableRes int... r5) {
            r4 = this;
            int r0 = r5.length
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[r0]
            r1 = 0
        L4:
            int r2 = r5.length
            if (r1 >= r2) goto L16
            android.content.res.Resources r2 = r4.getResources()
            r3 = r5[r1]
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L16:
            r4.setCustomThumbDrawablesForValues(r0)
            return
    }

    void setCustomThumbDrawablesForValues(@androidx.annotation.NonNull android.graphics.drawable.Drawable... r5) {
            r4 = this;
            r0 = 0
            r4.customThumbDrawable = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.customThumbDrawablesForValues = r0
            int r0 = r5.length
            r1 = 0
        Lc:
            if (r1 >= r0) goto L1c
            r2 = r5[r1]
            java.util.List<android.graphics.drawable.Drawable> r3 = r4.customThumbDrawablesForValues
            android.graphics.drawable.Drawable r2 = r4.initializeCustomThumbDrawable(r2)
            r3.add(r2)
            int r1 = r1 + 1
            goto Lc
        L1c:
            r4.postInvalidate()
            return
    }

    @Override // android.view.View
    public void setEnabled(boolean r2) {
            r1 = this;
            super.setEnabled(r2)
            if (r2 == 0) goto L7
            r2 = 0
            goto L8
        L7:
            r2 = 2
        L8:
            r0 = 0
            r1.setLayerType(r2, r0)
            return
    }

    public void setFocusedThumbIndex(int r2) {
            r1 = this;
            if (r2 < 0) goto L15
            java.util.ArrayList<java.lang.Float> r0 = r1.values
            int r0 = r0.size()
            if (r2 >= r0) goto L15
            r1.focusedThumbIdx = r2
            com.google.android.material.slider.BaseSlider$AccessibilityHelper r0 = r1.accessibilityHelper
            r0.requestKeyboardFocusForVirtualView(r2)
            r1.postInvalidate()
            return
        L15:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "index out of range"
            r2.<init>(r0)
            throw r2
    }

    public void setHaloRadius(@androidx.annotation.IntRange(from = 0) @androidx.annotation.Dimension int r2) {
            r1 = this;
            int r0 = r1.haloRadius
            if (r2 != r0) goto L5
            return
        L5:
            r1.haloRadius = r2
            android.graphics.drawable.Drawable r2 = r1.getBackground()
            boolean r0 = r1.shouldDrawCompatHalo()
            if (r0 != 0) goto L1d
            boolean r0 = r2 instanceof android.graphics.drawable.RippleDrawable
            if (r0 == 0) goto L1d
            android.graphics.drawable.RippleDrawable r2 = (android.graphics.drawable.RippleDrawable) r2
            int r0 = r1.haloRadius
            com.google.android.material.drawable.DrawableUtils.setRippleDrawableRadius(r2, r0)
            return
        L1d:
            r1.postInvalidate()
            return
    }

    public void setHaloRadiusResource(@androidx.annotation.DimenRes int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setHaloRadius(r2)
            return
    }

    public void setHaloTintList(@androidx.annotation.NonNull android.content.res.ColorStateList r3) {
            r2 = this;
            android.content.res.ColorStateList r0 = r2.haloColor
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L9
            return
        L9:
            r2.haloColor = r3
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            boolean r1 = r2.shouldDrawCompatHalo()
            if (r1 != 0) goto L1f
            boolean r1 = r0 instanceof android.graphics.drawable.RippleDrawable
            if (r1 == 0) goto L1f
            android.graphics.drawable.RippleDrawable r0 = (android.graphics.drawable.RippleDrawable) r0
            r0.setColor(r3)
            return
        L1f:
            android.graphics.Paint r0 = r2.haloPaint
            int r3 = r2.getColorForState(r3)
            r0.setColor(r3)
            android.graphics.Paint r3 = r2.haloPaint
            r0 = 63
            r3.setAlpha(r0)
            r2.invalidate()
            return
    }

    public void setLabelBehavior(int r2) {
            r1 = this;
            int r0 = r1.labelBehavior
            if (r0 == r2) goto L9
            r1.labelBehavior = r2
            r1.requestLayout()
        L9:
            return
    }

    public void setLabelFormatter(@androidx.annotation.Nullable com.google.android.material.slider.LabelFormatter r1) {
            r0 = this;
            r0.formatter = r1
            return
    }

    protected void setSeparationUnit(int r1) {
            r0 = this;
            r0.separationUnit = r1
            r1 = 1
            r0.dirtyConfig = r1
            r0.postInvalidate()
            return
    }

    public void setStepSize(float r7) {
            r6 = this;
            r0 = 0
            r1 = 1
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 < 0) goto L14
            float r0 = r6.stepSize
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 == 0) goto L13
            r6.stepSize = r7
            r6.dirtyConfig = r1
            r6.postInvalidate()
        L13:
            return
        L14:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            float r2 = r6.valueFrom
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            float r3 = r6.valueTo
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r7
            r4[r1] = r2
            r7 = 2
            r4[r7] = r3
            java.lang.String r7 = "The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range"
            java.lang.String r7 = java.lang.String.format(r7, r4)
            r0.<init>(r7)
            throw r0
    }

    public void setThumbElevation(float r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.defaultThumbDrawable
            r0.setElevation(r2)
            return
    }

    public void setThumbElevationResource(@androidx.annotation.DimenRes int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            float r2 = r0.getDimension(r2)
            r1.setThumbElevation(r2)
            return
    }

    public void setThumbRadius(@androidx.annotation.IntRange(from = 0) @androidx.annotation.Dimension int r4) {
            r3 = this;
            int r0 = r3.thumbRadius
            if (r4 != r0) goto L5
            return
        L5:
            r3.thumbRadius = r4
            com.google.android.material.shape.MaterialShapeDrawable r4 = r3.defaultThumbDrawable
            com.google.android.material.shape.ShapeAppearanceModel$Builder r0 = com.google.android.material.shape.ShapeAppearanceModel.builder()
            int r1 = r3.thumbRadius
            float r1 = (float) r1
            r2 = 0
            com.google.android.material.shape.ShapeAppearanceModel$Builder r0 = r0.setAllCorners(r2, r1)
            com.google.android.material.shape.ShapeAppearanceModel r0 = r0.build()
            r4.setShapeAppearanceModel(r0)
            com.google.android.material.shape.MaterialShapeDrawable r4 = r3.defaultThumbDrawable
            int r0 = r3.thumbRadius
            int r1 = r0 * 2
            int r0 = r0 * 2
            r4.setBounds(r2, r2, r1, r0)
            android.graphics.drawable.Drawable r4 = r3.customThumbDrawable
            if (r4 == 0) goto L2e
            r3.adjustCustomThumbDrawableBounds(r4)
        L2e:
            java.util.List<android.graphics.drawable.Drawable> r4 = r3.customThumbDrawablesForValues
            java.util.Iterator r4 = r4.iterator()
        L34:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L44
            java.lang.Object r0 = r4.next()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r3.adjustCustomThumbDrawableBounds(r0)
            goto L34
        L44:
            r3.updateWidgetLayout()
            return
    }

    public void setThumbRadiusResource(@androidx.annotation.DimenRes int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setThumbRadius(r2)
            return
    }

    public void setThumbStrokeColor(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.defaultThumbDrawable
            r0.setStrokeColor(r2)
            r1.postInvalidate()
            return
    }

    public void setThumbStrokeColorResource(@androidx.annotation.ColorRes int r2) {
            r1 = this;
            if (r2 == 0) goto Ld
            android.content.Context r0 = r1.getContext()
            android.content.res.ColorStateList r2 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r0, r2)
            r1.setThumbStrokeColor(r2)
        Ld:
            return
    }

    public void setThumbStrokeWidth(float r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.defaultThumbDrawable
            r0.setStrokeWidth(r2)
            r1.postInvalidate()
            return
    }

    public void setThumbStrokeWidthResource(@androidx.annotation.DimenRes int r2) {
            r1 = this;
            if (r2 == 0) goto Ld
            android.content.res.Resources r0 = r1.getResources()
            float r2 = r0.getDimension(r2)
            r1.setThumbStrokeWidth(r2)
        Ld:
            return
    }

    public void setThumbTintList(@androidx.annotation.NonNull android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.defaultThumbDrawable
            android.content.res.ColorStateList r0 = r0.getFillColor()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Ld
            return
        Ld:
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.defaultThumbDrawable
            r0.setFillColor(r2)
            r1.invalidate()
            return
    }

    public void setTickActiveRadius(@androidx.annotation.IntRange(from = 0) @androidx.annotation.Dimension int r2) {
            r1 = this;
            int r0 = r1.tickActiveRadius
            if (r0 == r2) goto L11
            r1.tickActiveRadius = r2
            android.graphics.Paint r0 = r1.activeTicksPaint
            int r2 = r2 * 2
            float r2 = (float) r2
            r0.setStrokeWidth(r2)
            r1.updateWidgetLayout()
        L11:
            return
    }

    public void setTickActiveTintList(@androidx.annotation.NonNull android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.tickColorActive
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            return
        L9:
            r1.tickColorActive = r2
            android.graphics.Paint r0 = r1.activeTicksPaint
            int r2 = r1.getColorForState(r2)
            r0.setColor(r2)
            r1.invalidate()
            return
    }

    public void setTickInactiveRadius(@androidx.annotation.IntRange(from = 0) @androidx.annotation.Dimension int r2) {
            r1 = this;
            int r0 = r1.tickInactiveRadius
            if (r0 == r2) goto L11
            r1.tickInactiveRadius = r2
            android.graphics.Paint r0 = r1.inactiveTicksPaint
            int r2 = r2 * 2
            float r2 = (float) r2
            r0.setStrokeWidth(r2)
            r1.updateWidgetLayout()
        L11:
            return
    }

    public void setTickInactiveTintList(@androidx.annotation.NonNull android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.tickColorInactive
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            return
        L9:
            r1.tickColorInactive = r2
            android.graphics.Paint r0 = r1.inactiveTicksPaint
            int r2 = r1.getColorForState(r2)
            r0.setColor(r2)
            r1.invalidate()
            return
    }

    public void setTickTintList(@androidx.annotation.NonNull android.content.res.ColorStateList r1) {
            r0 = this;
            r0.setTickInactiveTintList(r1)
            r0.setTickActiveTintList(r1)
            return
    }

    public void setTickVisible(boolean r2) {
            r1 = this;
            boolean r0 = r1.tickVisible
            if (r0 == r2) goto L9
            r1.tickVisible = r2
            r1.postInvalidate()
        L9:
            return
    }

    public void setTrackActiveTintList(@androidx.annotation.NonNull android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.trackColorActive
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            return
        L9:
            r1.trackColorActive = r2
            android.graphics.Paint r0 = r1.activeTrackPaint
            int r2 = r1.getColorForState(r2)
            r0.setColor(r2)
            r1.invalidate()
            return
    }

    public void setTrackHeight(@androidx.annotation.IntRange(from = 0) @androidx.annotation.Dimension int r2) {
            r1 = this;
            int r0 = r1.trackHeight
            if (r0 == r2) goto Lc
            r1.trackHeight = r2
            r1.invalidateTrack()
            r1.updateWidgetLayout()
        Lc:
            return
    }

    public void setTrackInactiveTintList(@androidx.annotation.NonNull android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.trackColorInactive
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            return
        L9:
            r1.trackColorInactive = r2
            android.graphics.Paint r0 = r1.inactiveTrackPaint
            int r2 = r1.getColorForState(r2)
            r0.setColor(r2)
            r1.invalidate()
            return
    }

    public void setTrackTintList(@androidx.annotation.NonNull android.content.res.ColorStateList r1) {
            r0 = this;
            r0.setTrackInactiveTintList(r1)
            r0.setTrackActiveTintList(r1)
            return
    }

    public void setValueFrom(float r1) {
            r0 = this;
            r0.valueFrom = r1
            r1 = 1
            r0.dirtyConfig = r1
            r0.postInvalidate()
            return
    }

    public void setValueTo(float r1) {
            r0 = this;
            r0.valueTo = r1
            r1 = 1
            r0.dirtyConfig = r1
            r0.postInvalidate()
            return
    }

    void setValues(@androidx.annotation.NonNull java.util.List<java.lang.Float> r2) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.setValuesInternal(r0)
            return
    }

    void setValues(@androidx.annotation.NonNull java.lang.Float... r2) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collections.addAll(r0, r2)
            r1.setValuesInternal(r0)
            return
    }

    void updateBoundsForVirtualViewId(int r5, android.graphics.Rect r6) {
            r4 = this;
            int r0 = r4.trackSidePadding
            java.util.List r1 = r4.getValues()
            java.lang.Object r5 = r1.get(r5)
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            float r5 = r4.normalizeValue(r5)
            int r1 = r4.trackWidth
            float r1 = (float) r1
            float r5 = r5 * r1
            int r5 = (int) r5
            int r0 = r0 + r5
            int r5 = r4.calculateTrackCenter()
            int r1 = r4.thumbRadius
            int r2 = r4.minTouchTargetSize
            if (r1 <= r2) goto L26
            goto L27
        L26:
            r1 = r2
        L27:
            int r1 = r1 / 2
            int r2 = r0 - r1
            int r3 = r5 - r1
            int r0 = r0 + r1
            int r5 = r5 + r1
            r6.set(r2, r3, r0, r5)
            return
    }
}
