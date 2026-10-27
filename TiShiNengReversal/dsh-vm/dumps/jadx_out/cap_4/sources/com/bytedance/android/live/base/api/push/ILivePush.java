package com.bytedance.android.live.base.api.push;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface ILivePush {
    public static final java.lang.String TAG = "livePush";

    public static class ClickType {
        public static final java.lang.String CLOSE = "close";
        public static final java.lang.String LIVE = "live";
        private java.lang.String value;

        public ClickType() {
                r0 = this;
                r0.<init>()
                return
        }

        public ClickType(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                return
        }

        public final java.lang.String getValue() {
                r1 = this;
                java.lang.String r0 = r1.value
                return r0
        }
    }

    public static class PushType {
        public static final int CLOD_LAUNCH = 2;
        public static final int SELF_DRIVING = 1;
        public static final int VIDEO = 3;
        private int value;

        public PushType() {
                r0 = this;
                r0.<init>()
                return
        }

        public PushType(int r1) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                return
        }

        public final int getValue() {
                r1 = this;
                int r0 = r1.value
                return r0
        }
    }

    void addPushInterceptor(com.bytedance.android.live.base.api.push.PushInterceptor r1);

    void clickPush(com.bytedance.android.live.base.api.push.model.PushData r1, android.content.Context r2);

    void dismiss();

    void enterRoom(android.content.Context r1, com.bytedance.android.live.base.api.push.model.PushData r2);

    boolean isShowing();

    void removePushInterceptor(com.bytedance.android.live.base.api.push.PushInterceptor r1);

    void reportPushClick(com.bytedance.android.live.base.api.push.model.PushData r1, com.bytedance.android.live.base.api.push.ILivePush.ClickType r2);

    void reportShow(com.bytedance.android.live.base.api.push.model.PushData r1);

    void requestPush(com.bytedance.android.live.base.api.push.PushCallback r1);

    void requestPushAndShow(boolean r1, android.app.Activity r2, com.bytedance.android.live.base.api.push.ILivePush.PushType r3, com.bytedance.android.live.base.api.push.PushCallback r4, com.bytedance.android.live.base.api.push.model.PushUIConfig r5);

    void requestPushAndShow(boolean r1, android.app.Activity r2, com.bytedance.android.live.base.api.push.ILivePush.PushType r3, com.bytedance.android.live.base.api.push.PushCallback r4, com.bytedance.android.live.base.api.push.model.PushUIConfig r5, android.os.Bundle r6);
}
