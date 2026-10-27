package com.bytedance.android.live.base.api.outer;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface ILivePreviewLayout {

    public static class Builder {
        private final android.os.Bundle arguments;
        private boolean autoEnterEnable;
        private boolean canShowDislike;
        private android.content.Context context;
        private boolean enablePullToRefresh;
        private com.bytedance.android.live.base.api.ILiveBorderAnimController liveBorderAnimController;
        private boolean showTopList;
        private boolean showTopListAtOnce;
        private boolean smoothEnterEnable;

        public Builder() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.liveBorderAnimController = r0
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                r2.arguments = r0
                r0 = 0
                r2.showTopList = r0
                r2.showTopListAtOnce = r0
                r1 = 1
                r2.enablePullToRefresh = r1
                r2.smoothEnterEnable = r0
                r2.autoEnterEnable = r0
                r2.canShowDislike = r1
                return
        }

        public Builder(android.content.Context r3) {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.liveBorderAnimController = r0
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                r2.arguments = r0
                r0 = 0
                r2.showTopList = r0
                r2.showTopListAtOnce = r0
                r1 = 1
                r2.enablePullToRefresh = r1
                r2.smoothEnterEnable = r0
                r2.autoEnterEnable = r0
                r2.canShowDislike = r1
                r2.context = r3
                return
        }

        public android.os.Bundle getArguments() {
                r1 = this;
                android.os.Bundle r0 = r1.arguments
                return r0
        }

        public android.content.Context getContext() {
                r1 = this;
                android.content.Context r0 = r1.context
                return r0
        }

        public com.bytedance.android.live.base.api.ILiveBorderAnimController getLiveBorderAnimController() {
                r1 = this;
                com.bytedance.android.live.base.api.ILiveBorderAnimController r0 = r1.liveBorderAnimController
                return r0
        }

        public boolean isAutoEnterEnable() {
                r1 = this;
                boolean r0 = r1.autoEnterEnable
                return r0
        }

        public boolean isCanShowDislike() {
                r1 = this;
                boolean r0 = r1.canShowDislike
                return r0
        }

        public boolean isEnablePullToRefresh() {
                r1 = this;
                boolean r0 = r1.enablePullToRefresh
                return r0
        }

        public boolean isShowTopList() {
                r1 = this;
                boolean r0 = r1.showTopList
                return r0
        }

        public boolean isShowTopListAtOnce() {
                r1 = this;
                boolean r0 = r1.showTopListAtOnce
                return r0
        }

        public boolean isSmoothEnterEnable() {
                r1 = this;
                boolean r0 = r1.smoothEnterEnable
                return r0
        }

        public com.bytedance.android.live.base.api.outer.ILivePreviewLayout.Builder setArguments(android.os.Bundle r2) {
                r1 = this;
                if (r2 == 0) goto L7
                android.os.Bundle r0 = r1.arguments
                r0.putAll(r2)
            L7:
                return r1
        }

        public com.bytedance.android.live.base.api.outer.ILivePreviewLayout.Builder setAutoEnterEnable(boolean r1) {
                r0 = this;
                r0.autoEnterEnable = r1
                return r0
        }

        public com.bytedance.android.live.base.api.outer.ILivePreviewLayout.Builder setCanShowDislike(boolean r1) {
                r0 = this;
                r0.canShowDislike = r1
                return r0
        }

        public com.bytedance.android.live.base.api.outer.ILivePreviewLayout.Builder setContext(android.content.Context r1) {
                r0 = this;
                r0.context = r1
                return r0
        }

        public com.bytedance.android.live.base.api.outer.ILivePreviewLayout.Builder setEnablePullToRefresh(boolean r1) {
                r0 = this;
                r0.enablePullToRefresh = r1
                return r0
        }

        public com.bytedance.android.live.base.api.outer.ILivePreviewLayout.Builder setLiveBorderAnimController(com.bytedance.android.live.base.api.ILiveBorderAnimController r1) {
                r0 = this;
                r0.liveBorderAnimController = r1
                return r0
        }

        public com.bytedance.android.live.base.api.outer.ILivePreviewLayout.Builder setShowTopList(boolean r1) {
                r0 = this;
                r0.showTopList = r1
                return r0
        }

        public com.bytedance.android.live.base.api.outer.ILivePreviewLayout.Builder setShowTopListAtOnce(boolean r1) {
                r0 = this;
                r0.showTopListAtOnce = r1
                return r0
        }

        public com.bytedance.android.live.base.api.outer.ILivePreviewLayout.Builder setSmoothEnterEnable(boolean r1) {
                r0 = this;
                r0.smoothEnterEnable = r1
                return r0
        }
    }

    public interface OnRefreshListener {
        void onError(java.lang.String r1);

        void onSuccess();
    }

    android.view.View getView();

    void onPlay();

    void onPullRefresh();

    void onRelease();

    void onStop();

    void setRefreshListener(com.bytedance.android.live.base.api.outer.ILivePreviewLayout.OnRefreshListener r1);
}
