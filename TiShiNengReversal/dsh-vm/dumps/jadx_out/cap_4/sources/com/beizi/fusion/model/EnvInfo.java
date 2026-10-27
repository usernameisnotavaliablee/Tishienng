package com.beizi.fusion.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class EnvInfo {
    private java.lang.String developerMode;
    private java.lang.String isDebugApk;
    private java.lang.String isDebugConnected;
    private java.lang.String isLockScreen;
    private java.lang.String isSimulator;
    private java.lang.String isUsb;
    private java.lang.String isVpn;
    private java.lang.String isWifiProxy;
    private java.lang.String isp;
    private java.lang.String net;
    private java.lang.String userAgent;

    public EnvInfo(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            com.beizi.fusion.tool.x r0 = com.beizi.fusion.tool.x.a()
            java.lang.String r0 = r0.a(r2)
            r1.userAgent = r0
            int r0 = com.beizi.fusion.tool.p.b(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.net = r0
            int r0 = com.beizi.fusion.tool.p.a(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.isp = r0
            boolean r0 = com.beizi.fusion.tool.ap.g(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.developerMode = r0
            boolean r0 = com.beizi.fusion.tool.ap.f(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.isDebugApk = r0
            boolean r0 = android.os.Debug.isDebuggerConnected()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.isDebugConnected = r0
            boolean r0 = com.beizi.fusion.tool.ap.h(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.isWifiProxy = r0
            boolean r0 = com.beizi.fusion.tool.ap.b()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.isVpn = r0
            com.beizi.fusion.tool.q r0 = com.beizi.fusion.tool.q.a()
            boolean r2 = r0.a(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.isSimulator = r2
            return
    }

    public java.lang.String getIsp() {
            r1 = this;
            java.lang.String r0 = r1.isp
            return r0
    }

    public java.lang.String getNet() {
            r1 = this;
            java.lang.String r0 = r1.net
            return r0
    }

    public java.lang.String getUserAgent() {
            r1 = this;
            java.lang.String r0 = r1.userAgent
            return r0
    }

    public java.lang.String isDeveloperMode() {
            r1 = this;
            java.lang.String r0 = r1.developerMode
            return r0
    }

    public java.lang.String isIsDebugApk() {
            r1 = this;
            java.lang.String r0 = r1.isDebugApk
            return r0
    }

    public java.lang.String isIsDebugConnected() {
            r1 = this;
            java.lang.String r0 = r1.isDebugConnected
            return r0
    }

    public java.lang.String isIsLockScreen() {
            r1 = this;
            java.lang.String r0 = r1.isLockScreen
            return r0
    }

    public java.lang.String isIsSimulator() {
            r1 = this;
            java.lang.String r0 = r1.isSimulator
            return r0
    }

    public java.lang.String isIsUsb() {
            r1 = this;
            java.lang.String r0 = r1.isUsb
            return r0
    }

    public java.lang.String isIsVpn() {
            r1 = this;
            java.lang.String r0 = r1.isVpn
            return r0
    }

    public java.lang.String isIsWifiProxy() {
            r1 = this;
            java.lang.String r0 = r1.isWifiProxy
            return r0
    }

    public void setDeveloperMode(java.lang.String r1) {
            r0 = this;
            r0.developerMode = r1
            return
    }

    public void setIsDebugApk(java.lang.String r1) {
            r0 = this;
            r0.isDebugApk = r1
            return
    }

    public void setIsDebugConnected(java.lang.String r1) {
            r0 = this;
            r0.isDebugConnected = r1
            return
    }

    public void setIsLockScreen(java.lang.String r1) {
            r0 = this;
            r0.isLockScreen = r1
            return
    }

    public void setIsSimulator(java.lang.String r1) {
            r0 = this;
            r0.isSimulator = r1
            return
    }

    public void setIsUsb(java.lang.String r1) {
            r0 = this;
            r0.isUsb = r1
            return
    }

    public void setIsVpn(java.lang.String r1) {
            r0 = this;
            r0.isVpn = r1
            return
    }

    public void setIsWifiProxy(java.lang.String r1) {
            r0 = this;
            r0.isWifiProxy = r1
            return
    }

    public void setIsp(java.lang.String r1) {
            r0 = this;
            r0.isp = r1
            return
    }

    public void setNet(java.lang.String r1) {
            r0 = this;
            r0.net = r1
            return
    }

    public void setUserAgent(java.lang.String r1) {
            r0 = this;
            r0.userAgent = r1
            return
    }
}
