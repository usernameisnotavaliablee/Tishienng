package com.umeng.socialize.shareboard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ShareBoard extends android.widget.PopupWindow {
    private com.umeng.socialize.shareboard.ShareBoardConfig mShareBoardConfig;




    public ShareBoard(android.content.Context r2, java.util.List<com.umeng.socialize.shareboard.SnsPlatform> r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ShareBoard(android.content.Context r5, java.util.List<com.umeng.socialize.shareboard.SnsPlatform> r6, com.umeng.socialize.shareboard.ShareBoardConfig r7) {
            r4 = this;
            r4.<init>(r5)
            r0 = -1
            r4.setWindowLayoutMode(r0, r0)
            android.content.res.Resources r1 = r5.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.orientation
            r2 = 2
            r3 = 1
            if (r1 != r2) goto L17
            r1 = 1
            goto L18
        L17:
            r1 = 0
        L18:
            if (r7 != 0) goto L1f
            com.umeng.socialize.shareboard.ShareBoardConfig r7 = new com.umeng.socialize.shareboard.ShareBoardConfig
            r7.<init>()
        L1f:
            r4.mShareBoardConfig = r7
            r7.setOrientation(r1)
            com.umeng.socialize.shareboard.UMActionFrame r1 = new com.umeng.socialize.shareboard.UMActionFrame
            r1.<init>(r5)
            r1.setSnsPlatformData(r6, r7)
            android.view.ViewGroup$LayoutParams r6 = new android.view.ViewGroup$LayoutParams
            r6.<init>(r0, r0)
            r1.setLayoutParams(r6)
            com.umeng.socialize.shareboard.ShareBoard$1 r6 = new com.umeng.socialize.shareboard.ShareBoard$1
            r6.<init>(r4)
            r1.setDismissListener(r6)
            com.umeng.socialize.shareboard.ShareBoard$2 r6 = new com.umeng.socialize.shareboard.ShareBoard$2
            r6.<init>(r4)
            r4.setOnDismissListener(r6)
            r4.setContentView(r1)
            r4.setFocusable(r3)
            r4.saveShareboardConfig(r5, r7)
            return
    }

    static /* synthetic */ com.umeng.socialize.shareboard.ShareBoardConfig access$000(com.umeng.socialize.shareboard.ShareBoard r0) {
            com.umeng.socialize.shareboard.ShareBoardConfig r0 = r0.mShareBoardConfig
            return r0
    }

    private void saveShareboardConfig(android.content.Context r6, com.umeng.socialize.shareboard.ShareBoardConfig r7) {
            r5 = this;
            if (r6 == 0) goto L51
            if (r7 != 0) goto L5
            goto L51
        L5:
            int r0 = r7.mShareboardPosition
            int r1 = com.umeng.socialize.shareboard.ShareBoardConfig.SHAREBOARD_POSITION_BOTTOM
            java.lang.String r2 = "1"
            java.lang.String r3 = "0"
            if (r0 != r1) goto L11
            r0 = r3
            goto L12
        L11:
            r0 = r2
        L12:
            int r1 = r7.mMenuBgShape
            int r4 = com.umeng.socialize.shareboard.ShareBoardConfig.BG_SHAPE_NONE
            if (r1 != r4) goto L1a
            r2 = r3
            goto L2e
        L1a:
            int r3 = com.umeng.socialize.shareboard.ShareBoardConfig.BG_SHAPE_CIRCULAR
            if (r1 != r3) goto L1f
            goto L2e
        L1f:
            int r2 = com.umeng.socialize.shareboard.ShareBoardConfig.BG_SHAPE_ROUNDED_SQUARE
            if (r1 != r2) goto L2d
            int r7 = r7.mMenuBgShapeAngle
            if (r7 == 0) goto L2a
            java.lang.String r2 = "2"
            goto L2e
        L2a:
            java.lang.String r2 = "3"
            goto L2e
        L2d:
            r2 = 0
        L2e:
            boolean r7 = android.text.TextUtils.isEmpty(r0)
            if (r7 == 0) goto L3a
            boolean r7 = android.text.TextUtils.isEmpty(r2)
            if (r7 != 0) goto L51
        L3a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r2)
            java.lang.String r1 = ";"
            r7.append(r1)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.umeng.socialize.utils.SocializeSpUtils.putShareBoardConfig(r6, r7)
        L51:
            return
    }

    public void setShareBoardlistener(com.umeng.socialize.utils.ShareBoardlistener r2) {
            r1 = this;
            com.umeng.socialize.shareboard.ShareBoardConfig r0 = r1.mShareBoardConfig
            if (r0 != 0) goto L5
            return
        L5:
            com.umeng.socialize.shareboard.ShareBoard$3 r0 = new com.umeng.socialize.shareboard.ShareBoard$3
            r0.<init>(r1, r2)
            com.umeng.socialize.shareboard.ShareBoardConfig r2 = r1.mShareBoardConfig
            r2.setShareBoardlistener(r0)
            return
    }
}
