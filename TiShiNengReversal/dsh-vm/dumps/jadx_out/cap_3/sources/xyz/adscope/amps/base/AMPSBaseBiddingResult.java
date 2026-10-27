package xyz.adscope.amps.base;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSBaseBiddingResult {
    private int ecpm;
    private java.lang.String errorCode;
    private java.lang.String errorMsg;
    private boolean isSuccess;

    public AMPSBaseBiddingResult(boolean r1, int r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.isSuccess = r1
            r0.ecpm = r2
            r0.errorCode = r3
            r0.errorMsg = r4
            return
    }

    public static xyz.adscope.amps.base.AMPSBaseBiddingResult biddingFail(java.lang.String r2, java.lang.String r3) {
            xyz.adscope.amps.base.AMPSBaseBiddingResult r0 = new xyz.adscope.amps.base.AMPSBaseBiddingResult
            r1 = 0
            r0.<init>(r1, r1, r2, r3)
            return r0
    }

    public static xyz.adscope.amps.base.AMPSBaseBiddingResult biddingSuccess(int r3) {
            xyz.adscope.amps.base.AMPSBaseBiddingResult r0 = new xyz.adscope.amps.base.AMPSBaseBiddingResult
            r1 = 1
            java.lang.String r2 = ""
            r0.<init>(r1, r3, r2, r2)
            return r0
    }

    public int getEcpm() {
            r1 = this;
            int r0 = r1.ecpm
            return r0
    }

    public java.lang.String getErrorCode() {
            r1 = this;
            java.lang.String r0 = r1.errorCode
            return r0
    }

    public java.lang.String getErrorMsg() {
            r1 = this;
            java.lang.String r0 = r1.errorMsg
            return r0
    }

    public boolean isSuccess() {
            r1 = this;
            boolean r0 = r1.isSuccess
            return r0
    }

    public void setEcpm(int r1) {
            r0 = this;
            r0.ecpm = r1
            return
    }

    public void setErrorCode(java.lang.String r1) {
            r0 = this;
            r0.errorCode = r1
            return
    }

    public void setErrorMsg(java.lang.String r1) {
            r0 = this;
            r0.errorMsg = r1
            return
    }

    public void setSuccess(boolean r1) {
            r0 = this;
            r0.isSuccess = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AMPSBaseBiddingResult{isSuccess="
            r0.append(r1)
            boolean r1 = r3.isSuccess
            r0.append(r1)
            java.lang.String r1 = ", ecpm="
            r0.append(r1)
            int r1 = r3.ecpm
            r0.append(r1)
            java.lang.String r1 = ", errorCode='"
            r0.append(r1)
            java.lang.String r1 = r3.errorCode
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", errorMsg='"
            r0.append(r2)
            java.lang.String r2 = r3.errorMsg
            r0.append(r2)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
