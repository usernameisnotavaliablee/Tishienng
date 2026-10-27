package cn.jpush.android.helper;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b extends cn.jiguang.api.JDispatchAction {
    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // cn.jiguang.api.JDispatchAction
    public java.lang.Object beforLogin(android.content.Context r2, java.lang.String r3, int r4, java.lang.String r5) {
            r1 = this;
            cn.jpush.android.local.ActionHelper r0 = cn.jpush.android.local.ActionHelper.getInstance()
            java.lang.Object r2 = r0.beforLogin(r2, r3, r4, r5)
            return r2
    }

    @Override // cn.jiguang.api.JDispatchAction
    public void dispatchMessage(android.content.Context r8, java.lang.String r9, int r10, int r11, long r12, long r14, java.nio.ByteBuffer r16) {
            r7 = this;
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "dispatchMessage command:"
            r9.append(r0)
            r9.append(r10)
            java.lang.String r0 = ",ver:"
            r9.append(r0)
            r9.append(r11)
            java.lang.String r11 = ",rid:"
            r9.append(r11)
            r9.append(r12)
            java.lang.String r11 = ",requestid:"
            r9.append(r11)
            r9.append(r14)
            java.lang.String r9 = r9.toString()
            java.lang.String r11 = "JPushDispacthAction"
            cn.jpush.android.helper.Logger.d(r11, r9)
            cn.jpush.android.local.JPushResponse r0 = new cn.jpush.android.local.JPushResponse
            r1 = r10
            r2 = r12
            r4 = r14
            r6 = r16
            r0.<init>(r1, r2, r4, r6)
            cn.jpush.android.local.ActionHelper r9 = cn.jpush.android.local.ActionHelper.getInstance()
            java.lang.String r10 = "msg"
            r9.doAction(r8, r10, r0)
            return
    }

    @Override // cn.jiguang.api.JDispatchAction
    public void dispatchTimeOutMessage(android.content.Context r2, java.lang.String r3, long r4, int r6) {
            r1 = this;
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r0 = "rid"
            r3.putLong(r0, r4)
            java.lang.String r4 = "cmd"
            r3.putInt(r4, r6)
            cn.jpush.android.local.ActionHelper r4 = cn.jpush.android.local.ActionHelper.getInstance()
            java.lang.String r5 = "msg_time_out"
            r4.doAction(r2, r5, r3)
            return
    }

    @Override // cn.jiguang.api.JDispatchAction
    public java.lang.Object getDataByCmd(android.content.Context r1, int r2) {
            r0 = this;
            r1 = 30001(0x7531, float:4.204E-41)
            if (r1 != r2) goto L7
            java.lang.String r1 = "sdk_ver_local"
            return r1
        L7:
            r1 = 30002(0x7532, float:4.2042E-41)
            if (r1 != r2) goto Le
            java.lang.String r1 = cn.jpush.android.local.JPushConstants.SDK_VERSION_NAME
            return r1
        Le:
            r1 = 0
            return r1
    }

    @Override // cn.jiguang.api.JDispatchAction
    public short getLogPriority(java.lang.String r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // cn.jiguang.api.JDispatchAction
    public short getLoginFlag(java.lang.String r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // cn.jiguang.api.JDispatchAction
    public android.os.Bundle getPInfo(java.lang.String r3) {
            r2 = this;
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r0 = "pid"
            r1 = 2
            r3.putInt(r0, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = cn.jpush.android.local.JPushConstants.SDK_VERSION_CODE
            r0.append(r1)
            java.lang.String r1 = ""
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "code"
            r3.putString(r1, r0)
            return r3
    }

    @Override // cn.jiguang.api.JDispatchAction
    public short getRegFlag(java.lang.String r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // cn.jiguang.api.JDispatchAction
    public short getRegPriority(java.lang.String r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // cn.jiguang.api.JDispatchAction
    public java.lang.String getReportVersionKey(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = "sdk_ver"
            return r1
    }

    @Override // cn.jiguang.api.JDispatchAction
    public int getSdkType() {
            r1 = this;
            int r0 = super.getSdkType()
            return r0
    }

    @Override // cn.jiguang.api.JDispatchAction
    public java.lang.String getSdkVersion(java.lang.String r2) {
            r1 = this;
            cn.jpush.android.local.ActionHelper r0 = cn.jpush.android.local.ActionHelper.getInstance()
            java.lang.String r2 = r0.getSdkVersion(r2)
            return r2
    }

    @Override // cn.jiguang.api.JDispatchAction
    public short getUserCtrlProperty(java.lang.String r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // cn.jiguang.api.JDispatchAction
    public void handleMessage(android.content.Context r2, java.lang.String r3, java.lang.Object r4) {
            r1 = this;
            cn.jpush.android.local.ActionHelper r3 = cn.jpush.android.local.ActionHelper.getInstance()
            java.lang.String r0 = "handle_msg"
            r3.doAction(r2, r0, r4)
            return
    }

    @Override // cn.jiguang.api.JDispatchAction
    public boolean isSupportedCMD(java.lang.String r2, int r3) {
            r1 = this;
            cn.jpush.android.local.ActionHelper r0 = cn.jpush.android.local.ActionHelper.getInstance()
            boolean r2 = r0.isSupportedCMD(r2, r3)
            return r2
    }

    @Override // cn.jiguang.api.JDispatchAction
    public void onActionRun(android.content.Context r1, java.lang.String r2, java.lang.String r3, android.os.Bundle r4) {
            r0 = this;
            cn.jpush.android.local.ActionHelper r2 = cn.jpush.android.local.ActionHelper.getInstance()
            r2.doAction(r1, r3, r4)
            return
    }

    @Override // cn.jiguang.api.JDispatchAction
    public void onEvent(android.content.Context r2, java.lang.String r3, int r4, int r5, java.lang.String r6) {
            r1 = this;
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r0 = "type"
            r3.putInt(r0, r4)
            java.lang.String r4 = "code"
            r3.putInt(r4, r5)
            java.lang.String r4 = "msg"
            r3.putString(r4, r6)
            cn.jpush.android.local.ActionHelper r4 = cn.jpush.android.local.ActionHelper.getInstance()
            java.lang.String r5 = "jcore_on_event"
            r4.doAction(r2, r5, r3)
            return
    }
}
