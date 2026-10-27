package com.scwang.smartrefresh.layout.constant;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public enum RefreshState extends java.lang.Enum<com.scwang.smartrefresh.layout.constant.RefreshState> {
    private static final /* synthetic */ com.scwang.smartrefresh.layout.constant.RefreshState[] $VALUES = null;
    public static final com.scwang.smartrefresh.layout.constant.RefreshState LoadFinish = null;
    public static final com.scwang.smartrefresh.layout.constant.RefreshState LoadReleased = null;
    public static final com.scwang.smartrefresh.layout.constant.RefreshState Loading = null;
    public static final com.scwang.smartrefresh.layout.constant.RefreshState None = null;
    public static final com.scwang.smartrefresh.layout.constant.RefreshState PullDownCanceled = null;
    public static final com.scwang.smartrefresh.layout.constant.RefreshState PullDownToRefresh = null;
    public static final com.scwang.smartrefresh.layout.constant.RefreshState PullToUpLoad = null;
    public static final com.scwang.smartrefresh.layout.constant.RefreshState PullUpCanceled = null;
    public static final com.scwang.smartrefresh.layout.constant.RefreshState RefreshFinish = null;
    public static final com.scwang.smartrefresh.layout.constant.RefreshState RefreshReleased = null;
    public static final com.scwang.smartrefresh.layout.constant.RefreshState Refreshing = null;
    public static final com.scwang.smartrefresh.layout.constant.RefreshState ReleaseToLoad = null;
    public static final com.scwang.smartrefresh.layout.constant.RefreshState ReleaseToRefresh = null;
    public static final com.scwang.smartrefresh.layout.constant.RefreshState ReleaseToTwoLevel = null;
    public static final com.scwang.smartrefresh.layout.constant.RefreshState TwoLevel = null;
    public static final com.scwang.smartrefresh.layout.constant.RefreshState TwoLevelFinish = null;
    public static final com.scwang.smartrefresh.layout.constant.RefreshState TwoLevelReleased = null;
    public final boolean draging;
    public final boolean opening;
    private final int role;

    static {
            com.scwang.smartrefresh.layout.constant.RefreshState r0 = new com.scwang.smartrefresh.layout.constant.RefreshState
            java.lang.String r1 = "None"
            r2 = 0
            r0.<init>(r1, r2, r2, r2)
            com.scwang.smartrefresh.layout.constant.RefreshState.None = r0
            com.scwang.smartrefresh.layout.constant.RefreshState r1 = new com.scwang.smartrefresh.layout.constant.RefreshState
            java.lang.String r3 = "PullDownToRefresh"
            r4 = 1
            r1.<init>(r3, r4, r4, r4)
            com.scwang.smartrefresh.layout.constant.RefreshState.PullDownToRefresh = r1
            com.scwang.smartrefresh.layout.constant.RefreshState r3 = new com.scwang.smartrefresh.layout.constant.RefreshState
            java.lang.String r5 = "PullToUpLoad"
            r6 = 2
            r3.<init>(r5, r6, r6, r4)
            com.scwang.smartrefresh.layout.constant.RefreshState.PullToUpLoad = r3
            com.scwang.smartrefresh.layout.constant.RefreshState r5 = new com.scwang.smartrefresh.layout.constant.RefreshState
            java.lang.String r7 = "PullDownCanceled"
            r8 = 3
            r5.<init>(r7, r8, r4, r2)
            com.scwang.smartrefresh.layout.constant.RefreshState.PullDownCanceled = r5
            com.scwang.smartrefresh.layout.constant.RefreshState r7 = new com.scwang.smartrefresh.layout.constant.RefreshState
            java.lang.String r9 = "PullUpCanceled"
            r10 = 4
            r7.<init>(r9, r10, r6, r2)
            com.scwang.smartrefresh.layout.constant.RefreshState.PullUpCanceled = r7
            com.scwang.smartrefresh.layout.constant.RefreshState r9 = new com.scwang.smartrefresh.layout.constant.RefreshState
            java.lang.String r11 = "ReleaseToRefresh"
            r12 = 5
            r9.<init>(r11, r12, r4, r4)
            com.scwang.smartrefresh.layout.constant.RefreshState.ReleaseToRefresh = r9
            com.scwang.smartrefresh.layout.constant.RefreshState r11 = new com.scwang.smartrefresh.layout.constant.RefreshState
            java.lang.String r13 = "ReleaseToLoad"
            r14 = 6
            r11.<init>(r13, r14, r6, r4)
            com.scwang.smartrefresh.layout.constant.RefreshState.ReleaseToLoad = r11
            com.scwang.smartrefresh.layout.constant.RefreshState r13 = new com.scwang.smartrefresh.layout.constant.RefreshState
            java.lang.String r15 = "ReleaseToTwoLevel"
            r16 = 3
            r8 = 7
            r13.<init>(r15, r8, r4, r4)
            com.scwang.smartrefresh.layout.constant.RefreshState.ReleaseToTwoLevel = r13
            com.scwang.smartrefresh.layout.constant.RefreshState r15 = new com.scwang.smartrefresh.layout.constant.RefreshState
            r17 = 7
            java.lang.String r8 = "TwoLevelReleased"
            r18 = 4
            r10 = 8
            r15.<init>(r8, r10, r4, r2)
            com.scwang.smartrefresh.layout.constant.RefreshState.TwoLevelReleased = r15
            com.scwang.smartrefresh.layout.constant.RefreshState r8 = new com.scwang.smartrefresh.layout.constant.RefreshState
            r19 = 8
            java.lang.String r10 = "RefreshReleased"
            r20 = 5
            r12 = 9
            r8.<init>(r10, r12, r4, r2)
            com.scwang.smartrefresh.layout.constant.RefreshState.RefreshReleased = r8
            com.scwang.smartrefresh.layout.constant.RefreshState r10 = new com.scwang.smartrefresh.layout.constant.RefreshState
            r21 = 9
            java.lang.String r12 = "LoadReleased"
            r22 = 6
            r14 = 10
            r10.<init>(r12, r14, r6, r2)
            com.scwang.smartrefresh.layout.constant.RefreshState.LoadReleased = r10
            com.scwang.smartrefresh.layout.constant.RefreshState r23 = new com.scwang.smartrefresh.layout.constant.RefreshState
            r27 = 0
            r28 = 1
            java.lang.String r24 = "Refreshing"
            r25 = 11
            r26 = 1
            r23.<init>(r24, r25, r26, r27, r28)
            com.scwang.smartrefresh.layout.constant.RefreshState.Refreshing = r23
            com.scwang.smartrefresh.layout.constant.RefreshState r24 = new com.scwang.smartrefresh.layout.constant.RefreshState
            r28 = 0
            r29 = 1
            java.lang.String r25 = "Loading"
            r26 = 12
            r27 = 2
            r24.<init>(r25, r26, r27, r28, r29)
            com.scwang.smartrefresh.layout.constant.RefreshState.Loading = r24
            com.scwang.smartrefresh.layout.constant.RefreshState r25 = new com.scwang.smartrefresh.layout.constant.RefreshState
            r29 = 0
            r30 = 1
            java.lang.String r26 = "TwoLevel"
            r27 = 13
            r28 = 1
            r25.<init>(r26, r27, r28, r29, r30)
            com.scwang.smartrefresh.layout.constant.RefreshState.TwoLevel = r25
            com.scwang.smartrefresh.layout.constant.RefreshState r12 = new com.scwang.smartrefresh.layout.constant.RefreshState
            r26 = 10
            java.lang.String r14 = "RefreshFinish"
            r6 = 14
            r12.<init>(r14, r6, r4, r2)
            com.scwang.smartrefresh.layout.constant.RefreshState.RefreshFinish = r12
            com.scwang.smartrefresh.layout.constant.RefreshState r14 = new com.scwang.smartrefresh.layout.constant.RefreshState
            r28 = 14
            java.lang.String r6 = "LoadFinish"
            r4 = 15
            r30 = r0
            r0 = 2
            r14.<init>(r6, r4, r0, r2)
            com.scwang.smartrefresh.layout.constant.RefreshState.LoadFinish = r14
            com.scwang.smartrefresh.layout.constant.RefreshState r6 = new com.scwang.smartrefresh.layout.constant.RefreshState
            r27 = 2
            java.lang.String r0 = "TwoLevelFinish"
            r31 = 15
            r4 = 16
            r32 = r1
            r1 = 1
            r6.<init>(r0, r4, r1, r2)
            com.scwang.smartrefresh.layout.constant.RefreshState.TwoLevelFinish = r6
            r0 = 17
            com.scwang.smartrefresh.layout.constant.RefreshState[] r0 = new com.scwang.smartrefresh.layout.constant.RefreshState[r0]
            r0[r2] = r30
            r0[r1] = r32
            r0[r27] = r3
            r0[r16] = r5
            r0[r18] = r7
            r0[r20] = r9
            r0[r22] = r11
            r0[r17] = r13
            r0[r19] = r15
            r0[r21] = r8
            r0[r26] = r10
            r1 = 11
            r0[r1] = r23
            r1 = 12
            r0[r1] = r24
            r1 = 13
            r0[r1] = r25
            r0[r28] = r12
            r0[r31] = r14
            r0[r4] = r6
            com.scwang.smartrefresh.layout.constant.RefreshState.$VALUES = r0
            return
    }

    RefreshState(java.lang.String r1, int r2, int r3, boolean r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.role = r3
            r0.draging = r4
            r1 = 0
            r0.opening = r1
            return
    }

    RefreshState(java.lang.String r1, int r2, int r3, boolean r4, boolean r5) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.role = r3
            r0.draging = r4
            r0.opening = r5
            return
    }

    public static com.scwang.smartrefresh.layout.constant.RefreshState valueOf(java.lang.String r1) {
            java.lang.Class<com.scwang.smartrefresh.layout.constant.RefreshState> r0 = com.scwang.smartrefresh.layout.constant.RefreshState.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.scwang.smartrefresh.layout.constant.RefreshState r1 = (com.scwang.smartrefresh.layout.constant.RefreshState) r1
            return r1
    }

    public static com.scwang.smartrefresh.layout.constant.RefreshState[] values() {
            com.scwang.smartrefresh.layout.constant.RefreshState[] r0 = com.scwang.smartrefresh.layout.constant.RefreshState.$VALUES
            java.lang.Object r0 = r0.clone()
            com.scwang.smartrefresh.layout.constant.RefreshState[] r0 = (com.scwang.smartrefresh.layout.constant.RefreshState[]) r0
            return r0
    }

    public boolean isFooter() {
            r2 = this;
            int r0 = r2.role
            r1 = 2
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public boolean isHeader() {
            r2 = this;
            int r0 = r2.role
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }
}
