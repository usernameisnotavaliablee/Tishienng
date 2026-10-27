package cn.jiguang.api;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class JDispatchAction {
    public static final int SDK_CUSTOM_GOOGLE_TYPE = 4;
    public static final int SDK_CUSTOM_PURE_TYPE = 5;
    public static final int SDK_CUSTOM_TYPE = 1;
    public static final int SDK_NORMAL_GOOGLE_TYPE = 2;
    public static final int SDK_NORMAL_PURE_TYPE = 3;
    public static final int SDK_NORMAL_TYPE = 0;

    public JDispatchAction() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.lang.Object beforLogin(android.content.Context r1, java.lang.String r2, int r3, java.lang.String r4) {
            r0 = this;
            r1 = 0
            return r1
    }

    public java.lang.Object beforRegister(android.content.Context r1, java.lang.String r2, int r3, java.lang.String r4) {
            r0 = this;
            r1 = 0
            return r1
    }

    public boolean checkAction(java.lang.String r1, int r2) {
            r0 = this;
            r1 = 1
            return r1
    }

    public abstract void dispatchMessage(android.content.Context r1, java.lang.String r2, int r3, int r4, long r5, long r7, java.nio.ByteBuffer r9);

    public void dispatchTimeOutMessage(android.content.Context r1, java.lang.String r2, long r3, int r5) {
            r0 = this;
            return
    }

    public java.lang.Object getDataByAction(android.content.Context r1, java.lang.String r2, java.lang.String r3, android.os.Bundle r4, java.lang.Object r5) {
            r0 = this;
            r1 = 0
            return r1
    }

    public java.lang.Object getDataByCmd(android.content.Context r1, int r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    public abstract short getLogPriority(java.lang.String r1);

    public abstract short getLoginFlag(java.lang.String r1);

    public android.os.Bundle getPInfo(java.lang.String r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public abstract short getRegFlag(java.lang.String r1);

    public abstract short getRegPriority(java.lang.String r1);

    public abstract java.lang.String getReportVersionKey(java.lang.String r1);

    public int getSdkType() {
            r1 = this;
            r0 = 0
            return r0
    }

    public abstract java.lang.String getSdkVersion(java.lang.String r1);

    public abstract short getUserCtrlProperty(java.lang.String r1);

    public void handleMessage(android.content.Context r1, java.lang.String r2, java.lang.Object r3) {
            r0 = this;
            return
    }

    public abstract boolean isSupportedCMD(java.lang.String r1, int r2);

    public void onActionRun(android.content.Context r1, java.lang.String r2, java.lang.String r3, android.os.Bundle r4) {
            r0 = this;
            return
    }

    public void onEvent(android.content.Context r1, java.lang.String r2, int r3, int r4, java.lang.String r5) {
            r0 = this;
            return
    }

    public java.lang.Object onSendData(android.content.Context r1, java.lang.String r2, long r3, int r5, int r6) {
            r0 = this;
            r1 = 0
            return r1
    }
}
