package com.umeng.socialize.shareboard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ShareBoardConfig {
    public static int BG_SHAPE_CIRCULAR = 1;
    public static int BG_SHAPE_NONE = 0;
    public static int BG_SHAPE_ROUNDED_SQUARE = 2;
    static final int CANCEL_BTN_HEIGHT = 50;
    static final int CANCEL_BTN_TEXT_SIZE_IN_SP = 15;
    static final int CENTER_MENU_LEFT_PADDING = 36;
    static final int INDICATOR_BOTTOM_MARGIN = 20;
    static final int INDICATOR_SIZE = 3;
    static final int INDICATOR_SPACE = 5;
    private static final int MENU_COLUMN_NUM = 4;
    private static final int MENU_COLUMN_NUM_CENTER = 3;
    private static final int MENU_COLUMN_NUM_HORIZONTAL = 6;
    private static final int MENU_COLUMN_NUM_HORIZONTAL_CENTER = 5;
    static final int MENU_ROW_MARGIN = 20;
    static final int MENU_ROW_NUM = 2;
    static final int MENU_TOP_MARGIN = 20;
    public static int SHAREBOARD_POSITION_BOTTOM = 3;
    public static int SHAREBOARD_POSITION_CENTER = 2;
    static int SHAREBOARD_POSITION_TOP = 1;
    static final int TITLE_TEXT_SIZE_IN_SP = 16;
    static final int TITLE_TOP_MARGIN = 20;
    static final int VIEW_PAGER_LEFT_MARGIN = 10;
    int mCancelBtnBgColor;
    int mCancelBtnBgPressedColor;
    int mCancelBtnColor;
    java.lang.String mCancelBtnText;
    boolean mCancelBtnVisibility;
    int mIndicatorNormalColor;
    int mIndicatorSelectedColor;
    boolean mIndicatorVisibility;
    int mMenuBgColor;
    int mMenuBgPressedColor;
    int mMenuBgShape;
    int mMenuBgShapeAngle;
    int mMenuColumnNum;
    int mMenuIconPressedColor;
    int mMenuTextColor;
    private android.widget.PopupWindow.OnDismissListener mOnDismissListener;
    private com.umeng.socialize.utils.ShareBoardlistener mShareBoardlistener;
    int mShareboardBgColor;
    int mShareboardPosition;
    java.lang.String mTitleText;
    int mTitleTextColor;
    boolean mTitleVisibility;
    int mTopMargin;

    static {
            return
    }

    public ShareBoardConfig() {
            r0 = this;
            r0.<init>()
            r0.setDefaultValue()
            return
    }

    private void setDefaultValue() {
            r5 = this;
            java.lang.String r0 = "#575A5C"
            int r0 = android.graphics.Color.parseColor(r0)
            java.lang.String r1 = "#E9EFF2"
            int r1 = android.graphics.Color.parseColor(r1)
            r5.setShareboardBackgroundColor(r1)
            int r1 = com.umeng.socialize.shareboard.ShareBoardConfig.SHAREBOARD_POSITION_BOTTOM
            r5.setShareboardPostion(r1)
            java.lang.String r1 = "选择要分享到的平台"
            r5.setTitleText(r1)
            r5.setTitleTextColor(r0)
            r1 = 5
            int r2 = com.umeng.socialize.shareboard.ShareBoardConfig.BG_SHAPE_ROUNDED_SQUARE
            r5.setMenuItemBackgroundShape(r2, r1)
            java.lang.String r1 = "#ffffff"
            int r2 = android.graphics.Color.parseColor(r1)
            java.lang.String r3 = "#22000000"
            int r4 = android.graphics.Color.parseColor(r3)
            r5.setMenuItemBackgroundColor(r2, r4)
            int r2 = android.graphics.Color.parseColor(r3)
            r5.setMenuItemIconPressedColor(r2)
            r5.setMenuItemTextColor(r0)
            java.lang.String r2 = "取消分享"
            r5.setCancelButtonText(r2)
            r5.setCancelButtonTextColor(r0)
            int r0 = android.graphics.Color.parseColor(r1)
            int r1 = android.graphics.Color.parseColor(r3)
            r5.setCancelButtonBackground(r0, r1)
            java.lang.String r0 = "#C2C9CC"
            int r0 = android.graphics.Color.parseColor(r0)
            java.lang.String r1 = "#0086DC"
            int r1 = android.graphics.Color.parseColor(r1)
            r5.setIndicatorColor(r0, r1)
            return
    }

    int calculateMenuHeightInDp(int r3) {
            r2 = this;
            int r0 = r2.mMenuColumnNum
            r1 = 1
            if (r3 > r0) goto L7
            r3 = 1
            goto L8
        L7:
            r3 = 2
        L8:
            int r0 = r3 * 75
            int r3 = r3 - r1
            int r3 = r3 * 20
            int r0 = r0 + r3
            int r0 = r0 + 20
            return r0
    }

    android.widget.PopupWindow.OnDismissListener getOnDismissListener() {
            r1 = this;
            android.widget.PopupWindow$OnDismissListener r0 = r1.mOnDismissListener
            return r0
    }

    com.umeng.socialize.utils.ShareBoardlistener getShareBoardlistener() {
            r1 = this;
            com.umeng.socialize.utils.ShareBoardlistener r0 = r1.mShareBoardlistener
            return r0
    }

    public com.umeng.socialize.shareboard.ShareBoardConfig setCancelButtonBackground(int r2) {
            r1 = this;
            r0 = 0
            r1.setCancelButtonBackground(r2, r0)
            return r1
    }

    public com.umeng.socialize.shareboard.ShareBoardConfig setCancelButtonBackground(int r1, int r2) {
            r0 = this;
            r0.mCancelBtnBgColor = r1
            r0.mCancelBtnBgPressedColor = r2
            return r0
    }

    public com.umeng.socialize.shareboard.ShareBoardConfig setCancelButtonText(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Lb
            r2 = 0
            r1.setCancelButtonVisibility(r2)
            return r1
        Lb:
            r0 = 1
            r1.setCancelButtonVisibility(r0)
            r1.mCancelBtnText = r2
            return r1
    }

    public com.umeng.socialize.shareboard.ShareBoardConfig setCancelButtonTextColor(int r1) {
            r0 = this;
            r0.mCancelBtnColor = r1
            return r0
    }

    public com.umeng.socialize.shareboard.ShareBoardConfig setCancelButtonVisibility(boolean r1) {
            r0 = this;
            r0.mCancelBtnVisibility = r1
            return r0
    }

    public com.umeng.socialize.shareboard.ShareBoardConfig setIndicatorColor(int r2) {
            r1 = this;
            r0 = 0
            r1.setIndicatorColor(r2, r0)
            return r1
    }

    public com.umeng.socialize.shareboard.ShareBoardConfig setIndicatorColor(int r1, int r2) {
            r0 = this;
            if (r1 == 0) goto L4
            r0.mIndicatorNormalColor = r1
        L4:
            if (r2 == 0) goto L8
            r0.mIndicatorSelectedColor = r2
        L8:
            r1 = 1
            r0.setIndicatorVisibility(r1)
            return r0
    }

    public com.umeng.socialize.shareboard.ShareBoardConfig setIndicatorVisibility(boolean r1) {
            r0 = this;
            r0.mIndicatorVisibility = r1
            return r0
    }

    public com.umeng.socialize.shareboard.ShareBoardConfig setMenuItemBackgroundColor(int r2) {
            r1 = this;
            r0 = 0
            r1.setMenuItemBackgroundColor(r2, r0)
            return r1
    }

    public com.umeng.socialize.shareboard.ShareBoardConfig setMenuItemBackgroundColor(int r1, int r2) {
            r0 = this;
            r0.mMenuBgColor = r1
            r0.mMenuBgPressedColor = r2
            return r0
    }

    public com.umeng.socialize.shareboard.ShareBoardConfig setMenuItemBackgroundShape(int r2) {
            r1 = this;
            r0 = 0
            r1.setMenuItemBackgroundShape(r2, r0)
            return r1
    }

    public com.umeng.socialize.shareboard.ShareBoardConfig setMenuItemBackgroundShape(int r2, int r3) {
            r1 = this;
            int r0 = com.umeng.socialize.shareboard.ShareBoardConfig.BG_SHAPE_CIRCULAR
            if (r2 == r0) goto La
            int r0 = com.umeng.socialize.shareboard.ShareBoardConfig.BG_SHAPE_ROUNDED_SQUARE
            if (r2 == r0) goto La
            int r2 = com.umeng.socialize.shareboard.ShareBoardConfig.BG_SHAPE_NONE
        La:
            r1.mMenuBgShape = r2
            r1.mMenuBgShapeAngle = r3
            return r1
    }

    public com.umeng.socialize.shareboard.ShareBoardConfig setMenuItemIconPressedColor(int r1) {
            r0 = this;
            r0.mMenuIconPressedColor = r1
            return r0
    }

    public com.umeng.socialize.shareboard.ShareBoardConfig setMenuItemTextColor(int r1) {
            r0 = this;
            r0.mMenuTextColor = r1
            return r0
    }

    public com.umeng.socialize.shareboard.ShareBoardConfig setOnDismissListener(android.widget.PopupWindow.OnDismissListener r1) {
            r0 = this;
            r0.mOnDismissListener = r1
            return r0
    }

    void setOrientation(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L14
            int r2 = r1.mShareboardPosition
            int r0 = com.umeng.socialize.shareboard.ShareBoardConfig.SHAREBOARD_POSITION_BOTTOM
            if (r2 != r0) goto Lc
            r2 = 6
            r1.mMenuColumnNum = r2
            return
        Lc:
            int r0 = com.umeng.socialize.shareboard.ShareBoardConfig.SHAREBOARD_POSITION_CENTER
            if (r2 != r0) goto L25
            r2 = 5
            r1.mMenuColumnNum = r2
            return
        L14:
            int r2 = r1.mShareboardPosition
            int r0 = com.umeng.socialize.shareboard.ShareBoardConfig.SHAREBOARD_POSITION_BOTTOM
            if (r2 != r0) goto L1e
            r2 = 4
            r1.mMenuColumnNum = r2
            return
        L1e:
            int r0 = com.umeng.socialize.shareboard.ShareBoardConfig.SHAREBOARD_POSITION_CENTER
            if (r2 != r0) goto L25
            r2 = 3
            r1.mMenuColumnNum = r2
        L25:
            return
    }

    void setShareBoardlistener(com.umeng.socialize.utils.ShareBoardlistener r1) {
            r0 = this;
            r0.mShareBoardlistener = r1
            return
    }

    public com.umeng.socialize.shareboard.ShareBoardConfig setShareboardBackgroundColor(int r1) {
            r0 = this;
            r0.mShareboardBgColor = r1
            return r0
    }

    public com.umeng.socialize.shareboard.ShareBoardConfig setShareboardPostion(int r3) {
            r2 = this;
            int r0 = com.umeng.socialize.shareboard.ShareBoardConfig.SHAREBOARD_POSITION_BOTTOM
            if (r3 == r0) goto Ld
            int r1 = com.umeng.socialize.shareboard.ShareBoardConfig.SHAREBOARD_POSITION_CENTER
            if (r3 == r1) goto Ld
            int r1 = com.umeng.socialize.shareboard.ShareBoardConfig.SHAREBOARD_POSITION_TOP
            if (r3 == r1) goto Ld
            r3 = r0
        Ld:
            r2.mShareboardPosition = r3
            return r2
    }

    public com.umeng.socialize.shareboard.ShareBoardConfig setStatusBarHeight(int r1) {
            r0 = this;
            r0.mTopMargin = r1
            return r0
    }

    public com.umeng.socialize.shareboard.ShareBoardConfig setTitleText(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Lb
            r2 = 0
            r1.setTitleVisibility(r2)
            return r1
        Lb:
            r0 = 1
            r1.setTitleVisibility(r0)
            r1.mTitleText = r2
            return r1
    }

    public com.umeng.socialize.shareboard.ShareBoardConfig setTitleTextColor(int r1) {
            r0 = this;
            r0.mTitleTextColor = r1
            return r0
    }

    public com.umeng.socialize.shareboard.ShareBoardConfig setTitleVisibility(boolean r1) {
            r0 = this;
            r0.mTitleVisibility = r1
            return r0
    }
}
