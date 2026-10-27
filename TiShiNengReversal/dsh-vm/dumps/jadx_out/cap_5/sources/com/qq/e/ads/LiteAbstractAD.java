package com.qq.e.ads;

import com.qq.e.comm.pi.LADI;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class LiteAbstractAD<T extends com.qq.e.comm.pi.LADI> extends com.qq.e.ads.AbstractAD<T> implements com.qq.e.comm.pi.LADI, com.qq.e.comm.compliance.DownloadConfirmListener {
    private com.qq.e.comm.compliance.DownloadConfirmListener h;

    public LiteAbstractAD() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.qq.e.comm.compliance.ApkDownloadComplianceInterface
    public java.lang.String getApkInfoUrl() {
            r1 = this;
            T r0 = r1.a
            if (r0 == 0) goto Lb
            com.qq.e.comm.pi.LADI r0 = (com.qq.e.comm.pi.LADI) r0
            java.lang.String r0 = r0.getApkInfoUrl()
            return r0
        Lb:
            java.lang.String r0 = "getApkInfoUrl"
            r1.a(r0)
            r0 = 0
            return r0
    }

    @Override // com.qq.e.comm.pi.LADI
    public int getECPM() {
            r1 = this;
            T r0 = r1.a
            if (r0 == 0) goto Lb
            com.qq.e.comm.pi.LADI r0 = (com.qq.e.comm.pi.LADI) r0
            int r0 = r0.getECPM()
            return r0
        Lb:
            java.lang.String r0 = "getECPM"
            r1.a(r0)
            r0 = -1
            return r0
    }

    @Override // com.qq.e.comm.pi.LADI
    public java.lang.String getECPMLevel() {
            r1 = this;
            T r0 = r1.a
            if (r0 == 0) goto Lb
            com.qq.e.comm.pi.LADI r0 = (com.qq.e.comm.pi.LADI) r0
            java.lang.String r0 = r0.getECPMLevel()
            return r0
        Lb:
            java.lang.String r0 = "getECPMLevel"
            r1.a(r0)
            r0 = 0
            return r0
    }

    @Override // com.qq.e.comm.pi.LADI
    public java.util.Map<java.lang.String, java.lang.Object> getExtraInfo() {
            r1 = this;
            T r0 = r1.a
            if (r0 == 0) goto Lb
            com.qq.e.comm.pi.LADI r0 = (com.qq.e.comm.pi.LADI) r0
            java.util.Map r0 = r0.getExtraInfo()
            return r0
        Lb:
            java.lang.String r0 = "getExtraInfo"
            r1.a(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            return r0
    }

    @Override // com.qq.e.comm.pi.LADI
    public boolean isValid() {
            r1 = this;
            T r0 = r1.a
            if (r0 == 0) goto Lb
            com.qq.e.comm.pi.LADI r0 = (com.qq.e.comm.pi.LADI) r0
            boolean r0 = r0.isValid()
            return r0
        Lb:
            java.lang.String r0 = "isValid"
            r1.a(r0)
            r0 = 0
            return r0
    }

    @Override // com.qq.e.comm.compliance.DownloadConfirmListener
    public void onDownloadConfirm(android.app.Activity r2, int r3, java.lang.String r4, com.qq.e.comm.compliance.DownloadConfirmCallBack r5) {
            r1 = this;
            com.qq.e.comm.compliance.DownloadConfirmListener r0 = r1.h
            if (r0 == 0) goto L7
            r0.onDownloadConfirm(r2, r3, r4, r5)
        L7:
            return
    }

    @Override // com.qq.e.comm.pi.IBidding
    public void sendLossNotification(int r2, int r3, java.lang.String r4) {
            r1 = this;
            T r0 = r1.a
            if (r0 == 0) goto La
            com.qq.e.comm.pi.LADI r0 = (com.qq.e.comm.pi.LADI) r0
            r0.sendLossNotification(r2, r3, r4)
            return
        La:
            java.lang.String r2 = "sendLossNotification"
            r1.a(r2)
            return
    }

    @Override // com.qq.e.comm.pi.IBiddingLoss
    public void sendLossNotification(java.util.Map<java.lang.String, java.lang.Object> r2) {
            r1 = this;
            T r0 = r1.a
            if (r0 == 0) goto La
            com.qq.e.comm.pi.LADI r0 = (com.qq.e.comm.pi.LADI) r0
            r0.sendLossNotification(r2)
            return
        La:
            java.lang.String r2 = "sendLossNotification"
            r1.a(r2)
            return
    }

    @Override // com.qq.e.comm.pi.IBidding
    public void sendWinNotification(int r2) {
            r1 = this;
            T r0 = r1.a
            if (r0 == 0) goto La
            com.qq.e.comm.pi.LADI r0 = (com.qq.e.comm.pi.LADI) r0
            r0.sendWinNotification(r2)
            return
        La:
            java.lang.String r2 = "sendWinNotification"
            r1.a(r2)
            return
    }

    @Override // com.qq.e.comm.pi.IBidding
    public void sendWinNotification(java.util.Map<java.lang.String, java.lang.Object> r2) {
            r1 = this;
            T r0 = r1.a
            if (r0 == 0) goto La
            com.qq.e.comm.pi.LADI r0 = (com.qq.e.comm.pi.LADI) r0
            r0.sendWinNotification(r2)
            return
        La:
            java.lang.String r2 = "sendWinNotification"
            r1.a(r2)
            return
    }

    @Override // com.qq.e.comm.pi.IBidding
    public void setBidECPM(int r2) {
            r1 = this;
            T r0 = r1.a
            if (r0 == 0) goto La
            com.qq.e.comm.pi.LADI r0 = (com.qq.e.comm.pi.LADI) r0
            r0.setBidECPM(r2)
            return
        La:
            java.lang.String r2 = "setBidECPM"
            r1.a(r2)
            return
    }

    @Override // com.qq.e.comm.compliance.ApkDownloadComplianceInterface
    public void setDownloadConfirmListener(com.qq.e.comm.compliance.DownloadConfirmListener r1) {
            r0 = this;
            r0.h = r1
            T r1 = r0.a
            if (r1 == 0) goto Lb
            com.qq.e.comm.pi.LADI r1 = (com.qq.e.comm.pi.LADI) r1
            r1.setDownloadConfirmListener(r0)
        Lb:
            return
    }
}
