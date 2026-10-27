package cn.jpush.android.ups;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class TokenResult {
    private java.lang.String actionType;
    private int returnCode;
    private java.lang.String token;

    public TokenResult(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.token = r1
            r0.returnCode = r2
            return
    }

    public TokenResult(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.token = r1
            r0.returnCode = r2
            r0.actionType = r3
            return
    }

    public java.lang.String getActionType() {
            r1 = this;
            java.lang.String r0 = r1.actionType
            return r0
    }

    public int getReturnCode() {
            r1 = this;
            int r0 = r1.returnCode
            return r0
    }

    public java.lang.String getToken() {
            r1 = this;
            java.lang.String r0 = r1.token
            return r0
    }

    public void setActionType(java.lang.String r1) {
            r0 = this;
            r0.actionType = r1
            return
    }

    public void setReturnCode(int r1) {
            r0 = this;
            r0.returnCode = r1
            return
    }

    public void setToken(java.lang.String r1) {
            r0 = this;
            r0.token = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "TokenResult{token='"
            r0.append(r1)
            java.lang.String r1 = r3.token
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", returnCode="
            r0.append(r2)
            int r2 = r3.returnCode
            r0.append(r2)
            java.lang.String r2 = ", actionType='"
            r0.append(r2)
            java.lang.String r2 = r3.actionType
            r0.append(r2)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
