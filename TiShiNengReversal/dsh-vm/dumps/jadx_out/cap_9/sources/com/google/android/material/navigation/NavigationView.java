package com.google.android.material.navigation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class NavigationView extends com.google.android.material.internal.ScrimInsetsFrameLayout implements com.google.android.material.motion.MaterialBackHandler {
    private static final int[] CHECKED_STATE_SET = null;
    private static final int DEF_STYLE_RES = 0;
    private static final int[] DISABLED_STATE_SET = null;
    private static final int PRESENTER_NAVIGATION_VIEW_ID = 1;
    private final androidx.drawerlayout.widget.DrawerLayout.DrawerListener backDrawerListener;
    private final com.google.android.material.motion.MaterialBackOrchestrator backOrchestrator;
    private boolean bottomInsetScrimEnabled;

    @androidx.annotation.Px
    private int drawerLayoutCornerSize;
    com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener listener;
    private final int maxWidth;

    @androidx.annotation.NonNull
    private final com.google.android.material.internal.NavigationMenu menu;
    private android.view.MenuInflater menuInflater;
    private android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    private final com.google.android.material.internal.NavigationMenuPresenter presenter;
    private final com.google.android.material.shape.ShapeableDelegate shapeableDelegate;
    private final com.google.android.material.motion.MaterialSideContainerBackHelper sideContainerBackHelper;
    private final int[] tmpLocation;
    private boolean topInsetScrimEnabled;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(@androidx.annotation.NonNull android.view.MenuItem r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.navigation.NavigationView.SavedState> CREATOR = null;

        @androidx.annotation.Nullable
        public android.os.Bundle menuState;


        static {
                com.google.android.material.navigation.NavigationView$SavedState$1 r0 = new com.google.android.material.navigation.NavigationView$SavedState$1
                r0.<init>()
                com.google.android.material.navigation.NavigationView.SavedState.CREATOR = r0
                return
        }

        public SavedState(@androidx.annotation.NonNull android.os.Parcel r1, @androidx.annotation.Nullable java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                android.os.Bundle r1 = r1.readBundle(r2)
                r0.menuState = r1
                return
        }

        public SavedState(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                android.os.Bundle r2 = r0.menuState
                r1.writeBundle(r2)
                return
        }
    }

    static {
            r0 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r0 = new int[]{r0}
            com.google.android.material.navigation.NavigationView.CHECKED_STATE_SET = r0
            r0 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            int[] r0 = new int[]{r0}
            com.google.android.material.navigation.NavigationView.DISABLED_STATE_SET = r0
            int r0 = com.google.android.material.R.style.Widget_Design_NavigationView
            com.google.android.material.navigation.NavigationView.DEF_STYLE_RES = r0
            return
    }

    public NavigationView(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public NavigationView(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.navigationViewStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public NavigationView(@androidx.annotation.NonNull android.content.Context r17, @androidx.annotation.Nullable android.util.AttributeSet r18, int r19) {
            r16 = this;
            r0 = r16
            r2 = r18
            r4 = r19
            int r5 = com.google.android.material.navigation.NavigationView.DEF_STYLE_RES
            r1 = r17
            android.content.Context r1 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r1, r2, r4, r5)
            r0.<init>(r1, r2, r4)
            com.google.android.material.internal.NavigationMenuPresenter r7 = new com.google.android.material.internal.NavigationMenuPresenter
            r7.<init>()
            r0.presenter = r7
            r1 = 2
            int[] r1 = new int[r1]
            r0.tmpLocation = r1
            r8 = 1
            r0.topInsetScrimEnabled = r8
            r0.bottomInsetScrimEnabled = r8
            r9 = 0
            r0.drawerLayoutCornerSize = r9
            com.google.android.material.shape.ShapeableDelegate r1 = com.google.android.material.shape.ShapeableDelegate.create(r0)
            r0.shapeableDelegate = r1
            com.google.android.material.motion.MaterialSideContainerBackHelper r1 = new com.google.android.material.motion.MaterialSideContainerBackHelper
            r1.<init>(r0)
            r0.sideContainerBackHelper = r1
            com.google.android.material.motion.MaterialBackOrchestrator r1 = new com.google.android.material.motion.MaterialBackOrchestrator
            r1.<init>(r0)
            r0.backOrchestrator = r1
            com.google.android.material.navigation.NavigationView$1 r1 = new com.google.android.material.navigation.NavigationView$1
            r1.<init>(r0)
            r0.backDrawerListener = r1
            android.content.Context r1 = r0.getContext()
            com.google.android.material.internal.NavigationMenu r10 = new com.google.android.material.internal.NavigationMenu
            r10.<init>(r1)
            r0.menu = r10
            int[] r3 = com.google.android.material.R.styleable.NavigationView
            int[] r6 = new int[r9]
            androidx.appcompat.widget.TintTypedArray r3 = com.google.android.material.internal.ThemeEnforcement.obtainTintedStyledAttributes(r1, r2, r3, r4, r5, r6)
            int r6 = com.google.android.material.R.styleable.NavigationView_android_background
            boolean r11 = r3.hasValue(r6)
            if (r11 == 0) goto L62
            android.graphics.drawable.Drawable r6 = r3.getDrawable(r6)
            androidx.core.view.ViewCompat.setBackground(r0, r6)
        L62:
            int r6 = com.google.android.material.R.styleable.NavigationView_drawerLayoutCornerSize
            int r6 = r3.getDimensionPixelSize(r6, r9)
            r0.drawerLayoutCornerSize = r6
            android.graphics.drawable.Drawable r6 = r0.getBackground()
            if (r6 == 0) goto L78
            android.graphics.drawable.Drawable r6 = r0.getBackground()
            boolean r6 = r6 instanceof android.graphics.drawable.ColorDrawable
            if (r6 == 0) goto La0
        L78:
            com.google.android.material.shape.ShapeAppearanceModel$Builder r2 = com.google.android.material.shape.ShapeAppearanceModel.builder(r1, r2, r4, r5)
            com.google.android.material.shape.ShapeAppearanceModel r2 = r2.build()
            android.graphics.drawable.Drawable r4 = r0.getBackground()
            com.google.android.material.shape.MaterialShapeDrawable r5 = new com.google.android.material.shape.MaterialShapeDrawable
            r5.<init>(r2)
            boolean r2 = r4 instanceof android.graphics.drawable.ColorDrawable
            if (r2 == 0) goto L9a
            android.graphics.drawable.ColorDrawable r4 = (android.graphics.drawable.ColorDrawable) r4
            int r2 = r4.getColor()
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r5.setFillColor(r2)
        L9a:
            r5.initializeElevationOverlay(r1)
            androidx.core.view.ViewCompat.setBackground(r0, r5)
        La0:
            int r2 = com.google.android.material.R.styleable.NavigationView_elevation
            boolean r4 = r3.hasValue(r2)
            if (r4 == 0) goto Lb0
            int r2 = r3.getDimensionPixelSize(r2, r9)
            float r2 = (float) r2
            r0.setElevation(r2)
        Lb0:
            int r2 = com.google.android.material.R.styleable.NavigationView_android_fitsSystemWindows
            boolean r2 = r3.getBoolean(r2, r9)
            r0.setFitsSystemWindows(r2)
            int r2 = com.google.android.material.R.styleable.NavigationView_android_maxWidth
            int r2 = r3.getDimensionPixelSize(r2, r9)
            r0.maxWidth = r2
            int r2 = com.google.android.material.R.styleable.NavigationView_subheaderColor
            boolean r4 = r3.hasValue(r2)
            r5 = 0
            if (r4 == 0) goto Lcf
            android.content.res.ColorStateList r2 = r3.getColorStateList(r2)
            goto Ld0
        Lcf:
            r2 = r5
        Ld0:
            int r4 = com.google.android.material.R.styleable.NavigationView_subheaderTextAppearance
            boolean r6 = r3.hasValue(r4)
            if (r6 == 0) goto Ldd
            int r4 = r3.getResourceId(r4, r9)
            goto Lde
        Ldd:
            r4 = 0
        Lde:
            r6 = 16842808(0x1010038, float:2.3693715E-38)
            if (r4 != 0) goto Le9
            if (r2 != 0) goto Le9
            android.content.res.ColorStateList r2 = r0.createDefaultColorStateList(r6)
        Le9:
            int r11 = com.google.android.material.R.styleable.NavigationView_itemIconTint
            boolean r12 = r3.hasValue(r11)
            if (r12 == 0) goto Lf6
            android.content.res.ColorStateList r6 = r3.getColorStateList(r11)
            goto Lfa
        Lf6:
            android.content.res.ColorStateList r6 = r0.createDefaultColorStateList(r6)
        Lfa:
            int r11 = com.google.android.material.R.styleable.NavigationView_itemTextAppearance
            boolean r12 = r3.hasValue(r11)
            if (r12 == 0) goto L107
            int r11 = r3.getResourceId(r11, r9)
            goto L108
        L107:
            r11 = 0
        L108:
            int r12 = com.google.android.material.R.styleable.NavigationView_itemTextAppearanceActiveBoldEnabled
            boolean r12 = r3.getBoolean(r12, r8)
            int r13 = com.google.android.material.R.styleable.NavigationView_itemIconSize
            boolean r14 = r3.hasValue(r13)
            if (r14 == 0) goto L11d
            int r13 = r3.getDimensionPixelSize(r13, r9)
            r0.setItemIconSize(r13)
        L11d:
            int r13 = com.google.android.material.R.styleable.NavigationView_itemTextColor
            boolean r14 = r3.hasValue(r13)
            if (r14 == 0) goto L12a
            android.content.res.ColorStateList r13 = r3.getColorStateList(r13)
            goto L12b
        L12a:
            r13 = r5
        L12b:
            if (r11 != 0) goto L136
            if (r13 != 0) goto L136
            r13 = 16842806(0x1010036, float:2.369371E-38)
            android.content.res.ColorStateList r13 = r0.createDefaultColorStateList(r13)
        L136:
            int r14 = com.google.android.material.R.styleable.NavigationView_itemBackground
            android.graphics.drawable.Drawable r14 = r3.getDrawable(r14)
            if (r14 != 0) goto L160
            boolean r15 = r0.hasShapeAppearance(r3)
            if (r15 == 0) goto L160
            android.graphics.drawable.Drawable r14 = r0.createDefaultItemBackground(r3)
            int r15 = com.google.android.material.R.styleable.NavigationView_itemRippleColor
            android.content.res.ColorStateList r15 = com.google.android.material.resources.MaterialResources.getColorStateList(r1, r3, r15)
            if (r15 == 0) goto L160
            android.graphics.drawable.Drawable r8 = r0.createDefaultItemDrawable(r3, r5)
            android.graphics.drawable.RippleDrawable r9 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r15 = com.google.android.material.ripple.RippleUtils.sanitizeRippleDrawableColor(r15)
            r9.<init>(r15, r5, r8)
            r7.setItemForeground(r9)
        L160:
            int r5 = com.google.android.material.R.styleable.NavigationView_itemHorizontalPadding
            boolean r8 = r3.hasValue(r5)
            if (r8 == 0) goto L171
            r8 = 0
            int r5 = r3.getDimensionPixelSize(r5, r8)
            r0.setItemHorizontalPadding(r5)
            goto L172
        L171:
            r8 = 0
        L172:
            int r5 = com.google.android.material.R.styleable.NavigationView_itemVerticalPadding
            boolean r9 = r3.hasValue(r5)
            if (r9 == 0) goto L181
            int r5 = r3.getDimensionPixelSize(r5, r8)
            r0.setItemVerticalPadding(r5)
        L181:
            int r5 = com.google.android.material.R.styleable.NavigationView_dividerInsetStart
            int r5 = r3.getDimensionPixelSize(r5, r8)
            r0.setDividerInsetStart(r5)
            int r5 = com.google.android.material.R.styleable.NavigationView_dividerInsetEnd
            int r5 = r3.getDimensionPixelSize(r5, r8)
            r0.setDividerInsetEnd(r5)
            int r5 = com.google.android.material.R.styleable.NavigationView_subheaderInsetStart
            int r5 = r3.getDimensionPixelSize(r5, r8)
            r0.setSubheaderInsetStart(r5)
            int r5 = com.google.android.material.R.styleable.NavigationView_subheaderInsetEnd
            int r5 = r3.getDimensionPixelSize(r5, r8)
            r0.setSubheaderInsetEnd(r5)
            int r5 = com.google.android.material.R.styleable.NavigationView_topInsetScrimEnabled
            boolean r9 = r0.topInsetScrimEnabled
            boolean r5 = r3.getBoolean(r5, r9)
            r0.setTopInsetScrimEnabled(r5)
            int r5 = com.google.android.material.R.styleable.NavigationView_bottomInsetScrimEnabled
            boolean r9 = r0.bottomInsetScrimEnabled
            boolean r5 = r3.getBoolean(r5, r9)
            r0.setBottomInsetScrimEnabled(r5)
            int r5 = com.google.android.material.R.styleable.NavigationView_itemIconPadding
            int r5 = r3.getDimensionPixelSize(r5, r8)
            int r8 = com.google.android.material.R.styleable.NavigationView_itemMaxLines
            r9 = 1
            int r8 = r3.getInt(r8, r9)
            r0.setItemMaxLines(r8)
            com.google.android.material.navigation.NavigationView$2 r8 = new com.google.android.material.navigation.NavigationView$2
            r8.<init>(r0)
            r10.setCallback(r8)
            r7.setId(r9)
            r7.initForMenu(r1, r10)
            if (r4 == 0) goto L1de
            r7.setSubheaderTextAppearance(r4)
        L1de:
            r7.setSubheaderColor(r2)
            r7.setItemIconTintList(r6)
            int r1 = r0.getOverScrollMode()
            r7.setOverScrollMode(r1)
            if (r11 == 0) goto L1f0
            r7.setItemTextAppearance(r11)
        L1f0:
            r7.setItemTextAppearanceActiveBoldEnabled(r12)
            r7.setItemTextColor(r13)
            r7.setItemBackground(r14)
            r7.setItemIconPadding(r5)
            r10.addMenuPresenter(r7)
            androidx.appcompat.view.menu.MenuView r1 = r7.getMenuView(r0)
            android.view.View r1 = (android.view.View) r1
            r0.addView(r1)
            int r1 = com.google.android.material.R.styleable.NavigationView_menu
            boolean r2 = r3.hasValue(r1)
            r8 = 0
            if (r2 == 0) goto L218
            int r1 = r3.getResourceId(r1, r8)
            r0.inflateMenu(r1)
        L218:
            int r1 = com.google.android.material.R.styleable.NavigationView_headerLayout
            boolean r2 = r3.hasValue(r1)
            if (r2 == 0) goto L227
            int r1 = r3.getResourceId(r1, r8)
            r0.inflateHeaderView(r1)
        L227:
            r3.recycle()
            r0.setupInsetScrimsListener()
            return
    }

    public static /* synthetic */ void a(com.google.android.material.navigation.NavigationView r0, android.graphics.Canvas r1) {
            super.dispatchDraw(r1)
            return
    }

    static /* synthetic */ com.google.android.material.motion.MaterialBackOrchestrator access$000(com.google.android.material.navigation.NavigationView r0) {
            com.google.android.material.motion.MaterialBackOrchestrator r0 = r0.backOrchestrator
            return r0
    }

    static /* synthetic */ int[] access$100(com.google.android.material.navigation.NavigationView r0) {
            int[] r0 = r0.tmpLocation
            return r0
    }

    static /* synthetic */ com.google.android.material.internal.NavigationMenuPresenter access$200(com.google.android.material.navigation.NavigationView r0) {
            com.google.android.material.internal.NavigationMenuPresenter r0 = r0.presenter
            return r0
    }

    @androidx.annotation.Nullable
    private android.content.res.ColorStateList createDefaultColorStateList(int r8) {
            r7 = this;
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r1 = r7.getContext()
            android.content.res.Resources$Theme r1 = r1.getTheme()
            r2 = 1
            boolean r8 = r1.resolveAttribute(r8, r0, r2)
            r1 = 0
            if (r8 != 0) goto L16
            return r1
        L16:
            android.content.Context r8 = r7.getContext()
            int r3 = r0.resourceId
            android.content.res.ColorStateList r8 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r8, r3)
            android.content.Context r3 = r7.getContext()
            android.content.res.Resources$Theme r3 = r3.getTheme()
            int r4 = androidx.appcompat.R.attr.colorPrimary
            boolean r3 = r3.resolveAttribute(r4, r0, r2)
            if (r3 != 0) goto L31
            return r1
        L31:
            int r0 = r0.data
            int r1 = r8.getDefaultColor()
            android.content.res.ColorStateList r3 = new android.content.res.ColorStateList
            int[] r4 = com.google.android.material.navigation.NavigationView.DISABLED_STATE_SET
            r5 = 3
            int[][] r5 = new int[r5][]
            r6 = 0
            r5[r6] = r4
            int[] r6 = com.google.android.material.navigation.NavigationView.CHECKED_STATE_SET
            r5[r2] = r6
            int[] r2 = android.widget.FrameLayout.EMPTY_STATE_SET
            r6 = 2
            r5[r6] = r2
            int r8 = r8.getColorForState(r4, r1)
            int[] r8 = new int[]{r8, r0, r1}
            r3.<init>(r5, r8)
            return r3
    }

    @androidx.annotation.NonNull
    private android.graphics.drawable.Drawable createDefaultItemBackground(@androidx.annotation.NonNull androidx.appcompat.widget.TintTypedArray r3) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            int r1 = com.google.android.material.R.styleable.NavigationView_itemShapeFillColor
            android.content.res.ColorStateList r0 = com.google.android.material.resources.MaterialResources.getColorStateList(r0, r3, r1)
            android.graphics.drawable.Drawable r3 = r2.createDefaultItemDrawable(r3, r0)
            return r3
    }

    @androidx.annotation.NonNull
    private android.graphics.drawable.Drawable createDefaultItemDrawable(@androidx.annotation.NonNull androidx.appcompat.widget.TintTypedArray r10, @androidx.annotation.Nullable android.content.res.ColorStateList r11) {
            r9 = this;
            int r0 = com.google.android.material.R.styleable.NavigationView_itemShapeAppearance
            r1 = 0
            int r0 = r10.getResourceId(r0, r1)
            int r2 = com.google.android.material.R.styleable.NavigationView_itemShapeAppearanceOverlay
            int r2 = r10.getResourceId(r2, r1)
            com.google.android.material.shape.MaterialShapeDrawable r4 = new com.google.android.material.shape.MaterialShapeDrawable
            android.content.Context r3 = r9.getContext()
            com.google.android.material.shape.ShapeAppearanceModel$Builder r0 = com.google.android.material.shape.ShapeAppearanceModel.builder(r3, r0, r2)
            com.google.android.material.shape.ShapeAppearanceModel r0 = r0.build()
            r4.<init>(r0)
            r4.setFillColor(r11)
            int r11 = com.google.android.material.R.styleable.NavigationView_itemShapeInsetStart
            int r5 = r10.getDimensionPixelSize(r11, r1)
            int r11 = com.google.android.material.R.styleable.NavigationView_itemShapeInsetTop
            int r6 = r10.getDimensionPixelSize(r11, r1)
            int r11 = com.google.android.material.R.styleable.NavigationView_itemShapeInsetEnd
            int r7 = r10.getDimensionPixelSize(r11, r1)
            int r11 = com.google.android.material.R.styleable.NavigationView_itemShapeInsetBottom
            int r8 = r10.getDimensionPixelSize(r11, r1)
            android.graphics.drawable.InsetDrawable r3 = new android.graphics.drawable.InsetDrawable
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
    }

    private android.view.MenuInflater getMenuInflater() {
            r2 = this;
            android.view.MenuInflater r0 = r2.menuInflater
            if (r0 != 0) goto Lf
            androidx.appcompat.view.SupportMenuInflater r0 = new androidx.appcompat.view.SupportMenuInflater
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.menuInflater = r0
        Lf:
            android.view.MenuInflater r0 = r2.menuInflater
            return r0
    }

    private boolean hasShapeAppearance(@androidx.annotation.NonNull androidx.appcompat.widget.TintTypedArray r2) {
            r1 = this;
            int r0 = com.google.android.material.R.styleable.NavigationView_itemShapeAppearance
            boolean r0 = r2.hasValue(r0)
            if (r0 != 0) goto L13
            int r0 = com.google.android.material.R.styleable.NavigationView_itemShapeAppearanceOverlay
            boolean r2 = r2.hasValue(r0)
            if (r2 == 0) goto L11
            goto L13
        L11:
            r2 = 0
            return r2
        L13:
            r2 = 1
            return r2
    }

    private void maybeUpdateCornerSizeForDrawerLayout(@androidx.annotation.Px int r6, @androidx.annotation.Px int r7) {
            r5 = this;
            android.view.ViewParent r0 = r5.getParent()
            boolean r0 = r0 instanceof androidx.drawerlayout.widget.DrawerLayout
            if (r0 == 0) goto L75
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            boolean r0 = r0 instanceof androidx.drawerlayout.widget.DrawerLayout.LayoutParams
            if (r0 == 0) goto L75
            int r0 = r5.drawerLayoutCornerSize
            if (r0 <= 0) goto L75
            android.graphics.drawable.Drawable r0 = r5.getBackground()
            boolean r0 = r0 instanceof com.google.android.material.shape.MaterialShapeDrawable
            if (r0 == 0) goto L75
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r0 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r0
            int r0 = r0.gravity
            int r1 = androidx.core.view.ViewCompat.getLayoutDirection(r5)
            int r0 = androidx.core.view.GravityCompat.getAbsoluteGravity(r0, r1)
            r1 = 3
            r2 = 1
            if (r0 != r1) goto L32
            r0 = 1
            goto L33
        L32:
            r0 = 0
        L33:
            android.graphics.drawable.Drawable r1 = r5.getBackground()
            com.google.android.material.shape.MaterialShapeDrawable r1 = (com.google.android.material.shape.MaterialShapeDrawable) r1
            com.google.android.material.shape.ShapeAppearanceModel r3 = r1.getShapeAppearanceModel()
            com.google.android.material.shape.ShapeAppearanceModel$Builder r3 = r3.toBuilder()
            int r4 = r5.drawerLayoutCornerSize
            float r4 = (float) r4
            com.google.android.material.shape.ShapeAppearanceModel$Builder r3 = r3.setAllCornerSizes(r4)
            r4 = 0
            if (r0 == 0) goto L52
            r3.setTopLeftCornerSize(r4)
            r3.setBottomLeftCornerSize(r4)
            goto L58
        L52:
            r3.setTopRightCornerSize(r4)
            r3.setBottomRightCornerSize(r4)
        L58:
            com.google.android.material.shape.ShapeAppearanceModel r0 = r3.build()
            r1.setShapeAppearanceModel(r0)
            com.google.android.material.shape.ShapeableDelegate r1 = r5.shapeableDelegate
            r1.onShapeAppearanceChanged(r5, r0)
            com.google.android.material.shape.ShapeableDelegate r0 = r5.shapeableDelegate
            android.graphics.RectF r1 = new android.graphics.RectF
            float r6 = (float) r6
            float r7 = (float) r7
            r1.<init>(r4, r4, r6, r7)
            r0.onMaskChanged(r5, r1)
            com.google.android.material.shape.ShapeableDelegate r6 = r5.shapeableDelegate
            r6.setOffsetZeroCornerEdgeBoundsEnabled(r5, r2)
        L75:
            return
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    private android.util.Pair<androidx.drawerlayout.widget.DrawerLayout, androidx.drawerlayout.widget.DrawerLayout.LayoutParams> requireDrawerLayoutParent() {
            r3 = this;
            android.view.ViewParent r0 = r3.getParent()
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            boolean r2 = r0 instanceof androidx.drawerlayout.widget.DrawerLayout
            if (r2 == 0) goto L1a
            boolean r2 = r1 instanceof androidx.drawerlayout.widget.DrawerLayout.LayoutParams
            if (r2 == 0) goto L1a
            android.util.Pair r2 = new android.util.Pair
            androidx.drawerlayout.widget.DrawerLayout r0 = (androidx.drawerlayout.widget.DrawerLayout) r0
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r1 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r1
            r2.<init>(r0, r1)
            return r2
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "NavigationView back progress requires the direct parent view to be a DrawerLayout."
            r0.<init>(r1)
            throw r0
    }

    private void setupInsetScrimsListener() {
            r2 = this;
            com.google.android.material.navigation.NavigationView$3 r0 = new com.google.android.material.navigation.NavigationView$3
            r0.<init>(r2)
            r2.onGlobalLayoutListener = r0
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r2.onGlobalLayoutListener
            r0.addOnGlobalLayoutListener(r1)
            return
    }

    public void addHeaderView(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.addHeaderView(r2)
            return
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
            r1 = this;
            r1.requireDrawerLayoutParent()
            com.google.android.material.motion.MaterialSideContainerBackHelper r0 = r1.sideContainerBackHelper
            r0.cancelBackProgress()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@androidx.annotation.NonNull android.graphics.Canvas r3) {
            r2 = this;
            com.google.android.material.shape.ShapeableDelegate r0 = r2.shapeableDelegate
            com.google.android.material.navigation.c r1 = new com.google.android.material.navigation.c
            r1.<init>(r2)
            r0.maybeClip(r3, r1)
            return
    }

    @androidx.annotation.VisibleForTesting
    com.google.android.material.motion.MaterialSideContainerBackHelper getBackHelper() {
            r1 = this;
            com.google.android.material.motion.MaterialSideContainerBackHelper r0 = r1.sideContainerBackHelper
            return r0
    }

    @androidx.annotation.Nullable
    public android.view.MenuItem getCheckedItem() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            androidx.appcompat.view.menu.MenuItemImpl r0 = r0.getCheckedItem()
            return r0
    }

    @androidx.annotation.Px
    public int getDividerInsetEnd() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            int r0 = r0.getDividerInsetEnd()
            return r0
    }

    @androidx.annotation.Px
    public int getDividerInsetStart() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            int r0 = r0.getDividerInsetStart()
            return r0
    }

    public int getHeaderCount() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            int r0 = r0.getHeaderCount()
            return r0
    }

    public android.view.View getHeaderView(int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            android.view.View r2 = r0.getHeaderView(r2)
            return r2
    }

    @androidx.annotation.Nullable
    public android.graphics.drawable.Drawable getItemBackground() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            android.graphics.drawable.Drawable r0 = r0.getItemBackground()
            return r0
    }

    @androidx.annotation.Dimension
    public int getItemHorizontalPadding() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            int r0 = r0.getItemHorizontalPadding()
            return r0
    }

    @androidx.annotation.Dimension
    public int getItemIconPadding() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            int r0 = r0.getItemIconPadding()
            return r0
    }

    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getItemIconTintList() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            android.content.res.ColorStateList r0 = r0.getItemTintList()
            return r0
    }

    public int getItemMaxLines() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            int r0 = r0.getItemMaxLines()
            return r0
    }

    @androidx.annotation.Nullable
    public android.content.res.ColorStateList getItemTextColor() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            android.content.res.ColorStateList r0 = r0.getItemTextColor()
            return r0
    }

    @androidx.annotation.Px
    public int getItemVerticalPadding() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            int r0 = r0.getItemVerticalPadding()
            return r0
    }

    @androidx.annotation.NonNull
    public android.view.Menu getMenu() {
            r1 = this;
            com.google.android.material.internal.NavigationMenu r0 = r1.menu
            return r0
    }

    @androidx.annotation.Px
    public int getSubheaderInsetEnd() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            int r0 = r0.getSubheaderInsetEnd()
            return r0
    }

    @androidx.annotation.Px
    public int getSubheaderInsetStart() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            int r0 = r0.getSubheaderInsetStart()
            return r0
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
            r5 = this;
            android.util.Pair r0 = r5.requireDrawerLayoutParent()
            java.lang.Object r1 = r0.first
            androidx.drawerlayout.widget.DrawerLayout r1 = (androidx.drawerlayout.widget.DrawerLayout) r1
            com.google.android.material.motion.MaterialSideContainerBackHelper r2 = r5.sideContainerBackHelper
            androidx.activity.BackEventCompat r2 = r2.onHandleBackInvoked()
            if (r2 == 0) goto L2b
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 34
            if (r3 >= r4) goto L17
            goto L2b
        L17:
            java.lang.Object r0 = r0.second
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r0 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r0
            int r0 = r0.gravity
            android.animation.Animator$AnimatorListener r3 = com.google.android.material.navigation.DrawerLayoutUtils.getScrimCloseAnimatorListener(r1, r5)
            android.animation.ValueAnimator$AnimatorUpdateListener r1 = com.google.android.material.navigation.DrawerLayoutUtils.getScrimCloseAnimatorUpdateListener(r1)
            com.google.android.material.motion.MaterialSideContainerBackHelper r4 = r5.sideContainerBackHelper
            r4.finishBackProgress(r2, r0, r3, r1)
            return
        L2b:
            r1.closeDrawer(r5)
            return
    }

    public android.view.View inflateHeaderView(@androidx.annotation.LayoutRes int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            android.view.View r2 = r0.inflateHeaderView(r2)
            return r2
    }

    public void inflateMenu(int r3) {
            r2 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r2.presenter
            r1 = 1
            r0.setUpdateSuspended(r1)
            android.view.MenuInflater r0 = r2.getMenuInflater()
            com.google.android.material.internal.NavigationMenu r1 = r2.menu
            r0.inflate(r3, r1)
            com.google.android.material.internal.NavigationMenuPresenter r3 = r2.presenter
            r0 = 0
            r3.setUpdateSuspended(r0)
            com.google.android.material.internal.NavigationMenuPresenter r3 = r2.presenter
            r3.updateMenuView(r0)
            return
    }

    public boolean isBottomInsetScrimEnabled() {
            r1 = this;
            boolean r0 = r1.bottomInsetScrimEnabled
            return r0
    }

    public boolean isTopInsetScrimEnabled() {
            r1 = this;
            boolean r0 = r1.topInsetScrimEnabled
            return r0
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            com.google.android.material.shape.MaterialShapeUtils.setParentAbsoluteElevation(r2)
            android.view.ViewParent r0 = r2.getParent()
            boolean r1 = r0 instanceof androidx.drawerlayout.widget.DrawerLayout
            if (r1 == 0) goto L22
            com.google.android.material.motion.MaterialBackOrchestrator r1 = r2.backOrchestrator
            boolean r1 = r1.shouldListenForBackCallbacks()
            if (r1 == 0) goto L22
            androidx.drawerlayout.widget.DrawerLayout r0 = (androidx.drawerlayout.widget.DrawerLayout) r0
            androidx.drawerlayout.widget.DrawerLayout$DrawerListener r1 = r2.backDrawerListener
            r0.removeDrawerListener(r1)
            androidx.drawerlayout.widget.DrawerLayout$DrawerListener r1 = r2.backDrawerListener
            r0.addDrawerListener(r1)
        L22:
            return
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r2.onGlobalLayoutListener
            r0.removeOnGlobalLayoutListener(r1)
            android.view.ViewParent r0 = r2.getParent()
            boolean r1 = r0 instanceof androidx.drawerlayout.widget.DrawerLayout
            if (r1 == 0) goto L1b
            androidx.drawerlayout.widget.DrawerLayout r0 = (androidx.drawerlayout.widget.DrawerLayout) r0
            androidx.drawerlayout.widget.DrawerLayout$DrawerListener r1 = r2.backDrawerListener
            r0.removeDrawerListener(r1)
        L1b:
            return
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected void onInsetsChanged(@androidx.annotation.NonNull androidx.core.view.WindowInsetsCompat r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.dispatchApplyWindowInsets(r2)
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int r4, int r5) {
            r3 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L14
            if (r0 == 0) goto Ld
            goto L22
        Ld:
            int r4 = r3.maxWidth
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            goto L22
        L14:
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            int r0 = r3.maxWidth
            int r4 = java.lang.Math.min(r4, r0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
        L22:
            super.onMeasure(r4, r5)
            return
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.material.navigation.NavigationView.SavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            com.google.android.material.navigation.NavigationView$SavedState r2 = (com.google.android.material.navigation.NavigationView.SavedState) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            com.google.android.material.internal.NavigationMenu r0 = r1.menu
            android.os.Bundle r2 = r2.menuState
            r0.restorePresenterStates(r2)
            return
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
            r3 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            com.google.android.material.navigation.NavigationView$SavedState r1 = new com.google.android.material.navigation.NavigationView$SavedState
            r1.<init>(r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.menuState = r0
            com.google.android.material.internal.NavigationMenu r2 = r3.menu
            r2.savePresenterStates(r0)
            return r1
    }

    @Override // android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            r0.maybeUpdateCornerSizeForDrawerLayout(r1, r2)
            return
    }

    public void removeHeaderView(@androidx.annotation.NonNull android.view.View r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.removeHeaderView(r2)
            return
    }

    public void setBottomInsetScrimEnabled(boolean r1) {
            r0 = this;
            r0.bottomInsetScrimEnabled = r1
            return
    }

    public void setCheckedItem(@androidx.annotation.IdRes int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenu r0 = r1.menu
            android.view.MenuItem r2 = r0.findItem(r2)
            if (r2 == 0) goto Lf
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            androidx.appcompat.view.menu.MenuItemImpl r2 = (androidx.appcompat.view.menu.MenuItemImpl) r2
            r0.setCheckedItem(r2)
        Lf:
            return
    }

    public void setCheckedItem(@androidx.annotation.NonNull android.view.MenuItem r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenu r0 = r1.menu
            int r2 = r2.getItemId()
            android.view.MenuItem r2 = r0.findItem(r2)
            if (r2 == 0) goto L14
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            androidx.appcompat.view.menu.MenuItemImpl r2 = (androidx.appcompat.view.menu.MenuItemImpl) r2
            r0.setCheckedItem(r2)
            return
        L14:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Called setCheckedItem(MenuItem) with an item that is not in the current menu."
            r2.<init>(r0)
            throw r2
    }

    public void setDividerInsetEnd(@androidx.annotation.Px int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setDividerInsetEnd(r2)
            return
    }

    public void setDividerInsetStart(@androidx.annotation.Px int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setDividerInsetStart(r2)
            return
    }

    @Override // android.view.View
    public void setElevation(float r1) {
            r0 = this;
            super.setElevation(r1)
            com.google.android.material.shape.MaterialShapeUtils.setElevation(r0, r1)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @androidx.annotation.VisibleForTesting
    public void setForceCompatClippingEnabled(boolean r2) {
            r1 = this;
            com.google.android.material.shape.ShapeableDelegate r0 = r1.shapeableDelegate
            r0.setForceCompatClippingEnabled(r1, r2)
            return
    }

    public void setItemBackground(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setItemBackground(r2)
            return
    }

    public void setItemBackgroundResource(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.core.content.ContextCompat.getDrawable(r0, r2)
            r1.setItemBackground(r2)
            return
    }

    public void setItemHorizontalPadding(@androidx.annotation.Dimension int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setItemHorizontalPadding(r2)
            return
    }

    public void setItemHorizontalPaddingResource(@androidx.annotation.DimenRes int r3) {
            r2 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r2.presenter
            android.content.res.Resources r1 = r2.getResources()
            int r3 = r1.getDimensionPixelSize(r3)
            r0.setItemHorizontalPadding(r3)
            return
    }

    public void setItemIconPadding(@androidx.annotation.Dimension int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setItemIconPadding(r2)
            return
    }

    public void setItemIconPaddingResource(int r3) {
            r2 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r2.presenter
            android.content.res.Resources r1 = r2.getResources()
            int r3 = r1.getDimensionPixelSize(r3)
            r0.setItemIconPadding(r3)
            return
    }

    public void setItemIconSize(@androidx.annotation.Dimension int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setItemIconSize(r2)
            return
    }

    public void setItemIconTintList(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setItemIconTintList(r2)
            return
    }

    public void setItemMaxLines(int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setItemMaxLines(r2)
            return
    }

    public void setItemTextAppearance(@androidx.annotation.StyleRes int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setItemTextAppearance(r2)
            return
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setItemTextAppearanceActiveBoldEnabled(r2)
            return
    }

    public void setItemTextColor(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setItemTextColor(r2)
            return
    }

    public void setItemVerticalPadding(@androidx.annotation.Px int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setItemVerticalPadding(r2)
            return
    }

    public void setItemVerticalPaddingResource(@androidx.annotation.DimenRes int r3) {
            r2 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r2.presenter
            android.content.res.Resources r1 = r2.getResources()
            int r3 = r1.getDimensionPixelSize(r3)
            r0.setItemVerticalPadding(r3)
            return
    }

    public void setNavigationItemSelectedListener(@androidx.annotation.Nullable com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener r1) {
            r0 = this;
            r0.listener = r1
            return
    }

    @Override // android.view.View
    public void setOverScrollMode(int r2) {
            r1 = this;
            super.setOverScrollMode(r2)
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            if (r0 == 0) goto La
            r0.setOverScrollMode(r2)
        La:
            return
    }

    public void setSubheaderInsetEnd(@androidx.annotation.Px int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setSubheaderInsetEnd(r2)
            return
    }

    public void setSubheaderInsetStart(@androidx.annotation.Px int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setSubheaderInsetStart(r2)
            return
    }

    public void setTopInsetScrimEnabled(boolean r1) {
            r0 = this;
            r0.topInsetScrimEnabled = r1
            return
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(@androidx.annotation.NonNull androidx.activity.BackEventCompat r2) {
            r1 = this;
            r1.requireDrawerLayoutParent()
            com.google.android.material.motion.MaterialSideContainerBackHelper r0 = r1.sideContainerBackHelper
            r0.startBackProgress(r2)
            return
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(@androidx.annotation.NonNull androidx.activity.BackEventCompat r3) {
            r2 = this;
            android.util.Pair r0 = r2.requireDrawerLayoutParent()
            com.google.android.material.motion.MaterialSideContainerBackHelper r1 = r2.sideContainerBackHelper
            java.lang.Object r0 = r0.second
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r0 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r0
            int r0 = r0.gravity
            r1.updateBackProgress(r3, r0)
            return
    }
}
