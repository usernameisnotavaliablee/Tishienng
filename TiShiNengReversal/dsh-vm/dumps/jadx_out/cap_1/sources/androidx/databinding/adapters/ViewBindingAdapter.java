package androidx.databinding.adapters;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.databinding.BindingMethods({@androidx.databinding.BindingMethod(attribute = "android:backgroundTint", method = "setBackgroundTintList", type = android.view.View.class), @androidx.databinding.BindingMethod(attribute = "android:fadeScrollbars", method = "setScrollbarFadingEnabled", type = android.view.View.class), @androidx.databinding.BindingMethod(attribute = "android:getOutline", method = "setOutlineProvider", type = android.view.View.class), @androidx.databinding.BindingMethod(attribute = "android:nextFocusForward", method = "setNextFocusForwardId", type = android.view.View.class), @androidx.databinding.BindingMethod(attribute = "android:nextFocusLeft", method = "setNextFocusLeftId", type = android.view.View.class), @androidx.databinding.BindingMethod(attribute = "android:nextFocusRight", method = "setNextFocusRightId", type = android.view.View.class), @androidx.databinding.BindingMethod(attribute = "android:nextFocusUp", method = "setNextFocusUpId", type = android.view.View.class), @androidx.databinding.BindingMethod(attribute = "android:nextFocusDown", method = "setNextFocusDownId", type = android.view.View.class), @androidx.databinding.BindingMethod(attribute = "android:requiresFadingEdge", method = "setVerticalFadingEdgeEnabled", type = android.view.View.class), @androidx.databinding.BindingMethod(attribute = "android:scrollbarDefaultDelayBeforeFade", method = "setScrollBarDefaultDelayBeforeFade", type = android.view.View.class), @androidx.databinding.BindingMethod(attribute = "android:scrollbarFadeDuration", method = "setScrollBarFadeDuration", type = android.view.View.class), @androidx.databinding.BindingMethod(attribute = "android:scrollbarSize", method = "setScrollBarSize", type = android.view.View.class), @androidx.databinding.BindingMethod(attribute = "android:scrollbarStyle", method = "setScrollBarStyle", type = android.view.View.class), @androidx.databinding.BindingMethod(attribute = "android:transformPivotX", method = "setPivotX", type = android.view.View.class), @androidx.databinding.BindingMethod(attribute = "android:transformPivotY", method = "setPivotY", type = android.view.View.class), @androidx.databinding.BindingMethod(attribute = "android:onDrag", method = "setOnDragListener", type = android.view.View.class), @androidx.databinding.BindingMethod(attribute = "android:onClick", method = "setOnClickListener", type = android.view.View.class), @androidx.databinding.BindingMethod(attribute = "android:onApplyWindowInsets", method = "setOnApplyWindowInsetsListener", type = android.view.View.class), @androidx.databinding.BindingMethod(attribute = "android:onCreateContextMenu", method = "setOnCreateContextMenuListener", type = android.view.View.class), @androidx.databinding.BindingMethod(attribute = "android:onFocusChange", method = "setOnFocusChangeListener", type = android.view.View.class), @androidx.databinding.BindingMethod(attribute = "android:onGenericMotion", method = "setOnGenericMotionListener", type = android.view.View.class), @androidx.databinding.BindingMethod(attribute = "android:onHover", method = "setOnHoverListener", type = android.view.View.class), @androidx.databinding.BindingMethod(attribute = "android:onKey", method = "setOnKeyListener", type = android.view.View.class), @androidx.databinding.BindingMethod(attribute = "android:onLongClick", method = "setOnLongClickListener", type = android.view.View.class), @androidx.databinding.BindingMethod(attribute = "android:onSystemUiVisibilityChange", method = "setOnSystemUiVisibilityChangeListener", type = android.view.View.class), @androidx.databinding.BindingMethod(attribute = "android:onTouch", method = "setOnTouchListener", type = android.view.View.class)})
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ViewBindingAdapter {
    public static final int FADING_EDGE_HORIZONTAL = 1;
    public static final int FADING_EDGE_NONE = 0;
    public static final int FADING_EDGE_VERTICAL = 2;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @android.annotation.TargetApi(12)
    public interface OnViewAttachedToWindow {
        void onViewAttachedToWindow(android.view.View r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @android.annotation.TargetApi(12)
    public interface OnViewDetachedFromWindow {
        void onViewDetachedFromWindow(android.view.View r1);
    }

    public ViewBindingAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int pixelsToDimensionPixelSize(float r1) {
            r0 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            if (r0 == 0) goto L7
            return r0
        L7:
            r0 = 0
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 != 0) goto Le
            r1 = 0
            return r1
        Le:
            if (r1 <= 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = -1
            return r1
    }

    @androidx.databinding.BindingAdapter({"android:background"})
    public static void setBackground(android.view.View r0, android.graphics.drawable.Drawable r1) {
            r0.setBackground(r1)
            return
    }

    @androidx.databinding.BindingAdapter({"android:onClickListener", "android:clickable"})
    public static void setClickListener(android.view.View r0, android.view.View.OnClickListener r1, boolean r2) {
            r0.setOnClickListener(r1)
            r0.setClickable(r2)
            return
    }

    @androidx.databinding.BindingAdapter(requireAll = false, value = {"android:onViewDetachedFromWindow", "android:onViewAttachedToWindow"})
    public static void setOnAttachStateChangeListener(android.view.View r1, androidx.databinding.adapters.ViewBindingAdapter.OnViewDetachedFromWindow r2, androidx.databinding.adapters.ViewBindingAdapter.OnViewAttachedToWindow r3) {
            if (r2 != 0) goto L6
            if (r3 != 0) goto L6
            r2 = 0
            goto Lc
        L6:
            androidx.databinding.adapters.ViewBindingAdapter$1 r0 = new androidx.databinding.adapters.ViewBindingAdapter$1
            r0.<init>(r3, r2)
            r2 = r0
        Lc:
            int r3 = androidx.databinding.library.baseAdapters.R.id.onAttachStateChangeListener
            java.lang.Object r3 = androidx.databinding.adapters.ListenerUtil.trackListener(r1, r2, r3)
            android.view.View$OnAttachStateChangeListener r3 = (android.view.View.OnAttachStateChangeListener) r3
            if (r3 == 0) goto L19
            r1.removeOnAttachStateChangeListener(r3)
        L19:
            if (r2 == 0) goto L1e
            r1.addOnAttachStateChangeListener(r2)
        L1e:
            return
    }

    @androidx.databinding.BindingAdapter({"android:onClick", "android:clickable"})
    public static void setOnClick(android.view.View r0, android.view.View.OnClickListener r1, boolean r2) {
            r0.setOnClickListener(r1)
            r0.setClickable(r2)
            return
    }

    @androidx.databinding.BindingAdapter({"android:onLayoutChange"})
    public static void setOnLayoutChangeListener(android.view.View r0, android.view.View.OnLayoutChangeListener r1, android.view.View.OnLayoutChangeListener r2) {
            if (r1 == 0) goto L5
            r0.removeOnLayoutChangeListener(r1)
        L5:
            if (r2 == 0) goto La
            r0.addOnLayoutChangeListener(r2)
        La:
            return
    }

    @androidx.databinding.BindingAdapter({"android:onLongClick", "android:longClickable"})
    public static void setOnLongClick(android.view.View r0, android.view.View.OnLongClickListener r1, boolean r2) {
            r0.setOnLongClickListener(r1)
            r0.setLongClickable(r2)
            return
    }

    @androidx.databinding.BindingAdapter({"android:onLongClickListener", "android:longClickable"})
    public static void setOnLongClickListener(android.view.View r0, android.view.View.OnLongClickListener r1, boolean r2) {
            r0.setOnLongClickListener(r1)
            r0.setLongClickable(r2)
            return
    }

    @androidx.databinding.BindingAdapter({"android:padding"})
    public static void setPadding(android.view.View r0, float r1) {
            int r1 = pixelsToDimensionPixelSize(r1)
            r0.setPadding(r1, r1, r1, r1)
            return
    }

    @androidx.databinding.BindingAdapter({"android:paddingBottom"})
    public static void setPaddingBottom(android.view.View r3, float r4) {
            int r4 = pixelsToDimensionPixelSize(r4)
            int r0 = r3.getPaddingLeft()
            int r1 = r3.getPaddingTop()
            int r2 = r3.getPaddingRight()
            r3.setPadding(r0, r1, r2, r4)
            return
    }

    @androidx.databinding.BindingAdapter({"android:paddingEnd"})
    public static void setPaddingEnd(android.view.View r3, float r4) {
            int r4 = pixelsToDimensionPixelSize(r4)
            int r0 = r3.getPaddingStart()
            int r1 = r3.getPaddingTop()
            int r2 = r3.getPaddingBottom()
            r3.setPaddingRelative(r0, r1, r4, r2)
            return
    }

    @androidx.databinding.BindingAdapter({"android:paddingLeft"})
    public static void setPaddingLeft(android.view.View r3, float r4) {
            int r4 = pixelsToDimensionPixelSize(r4)
            int r0 = r3.getPaddingTop()
            int r1 = r3.getPaddingRight()
            int r2 = r3.getPaddingBottom()
            r3.setPadding(r4, r0, r1, r2)
            return
    }

    @androidx.databinding.BindingAdapter({"android:paddingRight"})
    public static void setPaddingRight(android.view.View r3, float r4) {
            int r4 = pixelsToDimensionPixelSize(r4)
            int r0 = r3.getPaddingLeft()
            int r1 = r3.getPaddingTop()
            int r2 = r3.getPaddingBottom()
            r3.setPadding(r0, r1, r4, r2)
            return
    }

    @androidx.databinding.BindingAdapter({"android:paddingStart"})
    public static void setPaddingStart(android.view.View r3, float r4) {
            int r4 = pixelsToDimensionPixelSize(r4)
            int r0 = r3.getPaddingTop()
            int r1 = r3.getPaddingEnd()
            int r2 = r3.getPaddingBottom()
            r3.setPaddingRelative(r4, r0, r1, r2)
            return
    }

    @androidx.databinding.BindingAdapter({"android:paddingTop"})
    public static void setPaddingTop(android.view.View r3, float r4) {
            int r4 = pixelsToDimensionPixelSize(r4)
            int r0 = r3.getPaddingLeft()
            int r1 = r3.getPaddingRight()
            int r2 = r3.getPaddingBottom()
            r3.setPadding(r0, r4, r1, r2)
            return
    }

    @androidx.databinding.BindingAdapter({"android:requiresFadingEdge"})
    public static void setRequiresFadingEdge(android.view.View r3, int r4) {
            r0 = r4 & 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            r4 = r4 & r2
            if (r4 == 0) goto Ld
            r1 = 1
        Ld:
            r3.setVerticalFadingEdgeEnabled(r0)
            r3.setHorizontalFadingEdgeEnabled(r1)
            return
    }
}
