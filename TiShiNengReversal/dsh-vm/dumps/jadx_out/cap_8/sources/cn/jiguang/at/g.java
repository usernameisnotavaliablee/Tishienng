package cn.jiguang.at;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class g extends cn.jiguang.api.JDispatchAction {
    public g() {
            r0 = this;
            r0.<init>()
            return
    }

    private cn.jiguang.api.JAction a(java.lang.String r2) {
            r1 = this;
            cn.jiguang.at.a r0 = cn.jiguang.at.a.a()
            cn.jiguang.api.JAction r2 = r0.a(r2)
            return r2
    }

    private cn.jiguang.api.JActionExtra b(java.lang.String r2) {
            r1 = this;
            cn.jiguang.at.a r0 = cn.jiguang.at.a.a()
            cn.jiguang.api.JActionExtra r2 = r0.b(r2)
            return r2
    }

    @Override // cn.jiguang.api.JDispatchAction
    public java.lang.Object beforLogin(android.content.Context r1, java.lang.String r2, int r3, java.lang.String r4) {
            r0 = this;
            cn.jiguang.api.JActionExtra r2 = r0.b(r2)
            if (r2 == 0) goto Lb
            java.lang.Object r1 = r2.beforLogin(r1, r3, r4)
            return r1
        Lb:
            r1 = 0
            return r1
    }

    @Override // cn.jiguang.api.JDispatchAction
    public java.lang.Object beforRegister(android.content.Context r1, java.lang.String r2, int r3, java.lang.String r4) {
            r0 = this;
            cn.jiguang.api.JActionExtra r2 = r0.b(r2)
            if (r2 == 0) goto Lb
            java.lang.Object r1 = r2.beforRegister(r1, r3, r4)
            return r1
        Lb:
            r1 = 0
            return r1
    }

    @Override // cn.jiguang.api.JDispatchAction
    public boolean checkAction(java.lang.String r1, int r2) {
            r0 = this;
            cn.jiguang.api.JActionExtra r1 = r0.b(r1)
            if (r1 == 0) goto Lb
            boolean r1 = r1.checkAction(r2)
            return r1
        Lb:
            r1 = 1
            return r1
    }

    @Override // cn.jiguang.api.JDispatchAction
    public void dispatchMessage(android.content.Context r15, java.lang.String r16, int r17, int r18, long r19, long r21, java.nio.ByteBuffer r23) {
            r14 = this;
            r0 = r16
            cn.jiguang.api.JAction r1 = r14.a(r0)
            if (r1 == 0) goto L83
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "dispatchMessage ,command:"
            r2.append(r3)
            r4 = r17
            r2.append(r4)
            java.lang.String r3 = ",ver:"
            r2.append(r3)
            r6 = r18
            r2.append(r6)
            java.lang.String r3 = ",rid:"
            r2.append(r3)
            r9 = r19
            r2.append(r9)
            java.lang.String r3 = ",reuqestId:"
            r2.append(r3)
            r7 = r21
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "SupportDispatchAction"
            cn.jiguang.at.d.b(r3, r2)
            cn.jiguang.api.SdkType r2 = cn.jiguang.api.SdkType.JMESSAGE
            java.lang.String r2 = r2.name()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L70
            int r0 = r23.limit()
            int r0 = r0 + 20
            cn.jiguang.at.c r5 = new cn.jiguang.at.c
            int r11 = cn.jiguang.api.JCoreInterface.getSid()
            long r12 = cn.jiguang.api.JCoreInterface.getUid()
            r4 = r5
            r5 = 0
            r8 = r17
            r7 = r6
            r6 = r0
            r4.<init>(r5, r6, r7, r8, r9, r11, r12)
            r2 = 0
            r6 = r23
            r0 = r1
            r5 = r4
            r1 = r15
        L6a:
            r4 = r17
            r0.dispatchMessage(r1, r2, r4, r5, r6)
            return
        L70:
            r0 = r1
            cn.jiguang.at.c r4 = new cn.jiguang.at.c
            r5 = 0
            r6 = r18
            r8 = r7
            r7 = r17
            r4.<init>(r5, r6, r7, r8)
            r2 = 0
            r1 = r15
            r6 = r23
            r5 = r4
            goto L6a
        L83:
            return
    }

    @Override // cn.jiguang.api.JDispatchAction
    public void dispatchTimeOutMessage(android.content.Context r8, java.lang.String r9, long r10, int r12) {
            r7 = this;
            cn.jiguang.api.JAction r0 = r7.a(r9)
            if (r0 == 0) goto Le
            r2 = 0
            r1 = r8
            r4 = r10
            r6 = r12
            r0.dispatchTimeOutMessage(r1, r2, r4, r6)
        Le:
            return
    }

    @Override // cn.jiguang.api.JDispatchAction
    public short getLogPriority(java.lang.String r2) {
            r1 = this;
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JPUSH
            java.lang.String r0 = r0.name()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Le
            r2 = 1
            return r2
        Le:
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JANALYTICS
            java.lang.String r0 = r0.name()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L1c
            r2 = 2
            return r2
        L1c:
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JSHARE
            java.lang.String r0 = r0.name()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L2a
            r2 = 4
            return r2
        L2a:
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JAD
            java.lang.String r0 = r0.name()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L38
            r2 = 5
            return r2
        L38:
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JVERIFICATION
            java.lang.String r0 = r0.name()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L46
            r2 = 3
            return r2
        L46:
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JMLINK
            java.lang.String r0 = r0.name()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L54
            r2 = 6
            return r2
        L54:
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JUNION
            java.lang.String r0 = r0.name()
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L62
            r2 = 7
            return r2
        L62:
            r2 = 0
            return r2
    }

    @Override // cn.jiguang.api.JDispatchAction
    public short getLoginFlag(java.lang.String r2) {
            r1 = this;
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JPUSH
            java.lang.String r0 = r0.name()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Le
            r2 = 1
            return r2
        Le:
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JANALYTICS
            java.lang.String r0 = r0.name()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L1c
            r2 = 4
            return r2
        L1c:
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JSHARE
            java.lang.String r0 = r0.name()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L2b
            r2 = 8
            return r2
        L2b:
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JAD
            java.lang.String r0 = r0.name()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L3a
            r2 = 128(0x80, float:1.8E-43)
            return r2
        L3a:
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JMESSAGE
            java.lang.String r0 = r0.name()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L49
            r2 = 32
            return r2
        L49:
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JVERIFICATION
            java.lang.String r0 = r0.name()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L58
            r2 = 256(0x100, float:3.59E-43)
            return r2
        L58:
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JMLINK
            java.lang.String r0 = r0.name()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L67
            r2 = 512(0x200, float:7.17E-43)
            return r2
        L67:
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JUNION
            java.lang.String r0 = r0.name()
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L76
            r2 = 1024(0x400, float:1.435E-42)
            return r2
        L76:
            r2 = 0
            return r2
    }

    @Override // cn.jiguang.api.JDispatchAction
    public short getRegFlag(java.lang.String r2) {
            r1 = this;
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JPUSH
            java.lang.String r0 = r0.name()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Le
            r2 = 1
            return r2
        Le:
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JANALYTICS
            java.lang.String r0 = r0.name()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L1c
            r2 = 4
            return r2
        L1c:
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JSHARE
            java.lang.String r0 = r0.name()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L2b
            r2 = 8
            return r2
        L2b:
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JAD
            java.lang.String r0 = r0.name()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L3a
            r2 = 128(0x80, float:1.8E-43)
            return r2
        L3a:
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JMESSAGE
            java.lang.String r0 = r0.name()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L49
            r2 = 32
            return r2
        L49:
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JVERIFICATION
            java.lang.String r0 = r0.name()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L58
            r2 = 256(0x100, float:3.59E-43)
            return r2
        L58:
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JMLINK
            java.lang.String r0 = r0.name()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L67
            r2 = 512(0x200, float:7.17E-43)
            return r2
        L67:
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JUNION
            java.lang.String r0 = r0.name()
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L76
            r2 = 1024(0x400, float:1.435E-42)
            return r2
        L76:
            r2 = 0
            return r2
    }

    @Override // cn.jiguang.api.JDispatchAction
    public short getRegPriority(java.lang.String r2) {
            r1 = this;
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JPUSH
            java.lang.String r0 = r0.name()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Le
            r2 = 0
            return r2
        Le:
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JANALYTICS
            java.lang.String r0 = r0.name()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L1c
            r2 = 1
            return r2
        L1c:
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JSHARE
            java.lang.String r0 = r0.name()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L2a
            r2 = 2
            return r2
        L2a:
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JAD
            java.lang.String r0 = r0.name()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L38
            r2 = 4
            return r2
        L38:
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JVERIFICATION
            java.lang.String r0 = r0.name()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L46
            r2 = 5
            return r2
        L46:
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JMLINK
            java.lang.String r0 = r0.name()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L54
            r2 = 6
            return r2
        L54:
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JUNION
            java.lang.String r0 = r0.name()
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L62
            r2 = 7
            return r2
        L62:
            r2 = 3
            return r2
    }

    @Override // cn.jiguang.api.JDispatchAction
    public java.lang.String getReportVersionKey(java.lang.String r2) {
            r1 = this;
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JPUSH
            java.lang.String r0 = r0.name()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lf
            java.lang.String r2 = "sdk_ver"
            return r2
        Lf:
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JANALYTICS
            java.lang.String r0 = r0.name()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L1e
            java.lang.String r2 = "statistics_sdk_ver"
            return r2
        L1e:
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JSHARE
            java.lang.String r0 = r0.name()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L2d
            java.lang.String r2 = "share_sdk_ver"
            return r2
        L2d:
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JAD
            java.lang.String r0 = r0.name()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L3c
            java.lang.String r2 = "ssp_sdk_ver"
            return r2
        L3c:
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JMESSAGE
            java.lang.String r0 = r0.name()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L4b
            java.lang.String r2 = "im_sdk_ver"
            return r2
        L4b:
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JVERIFICATION
            java.lang.String r0 = r0.name()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L5b
            java.lang.String r2 = "verification_sdk_ver"
            return r2
        L5b:
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JMLINK
            java.lang.String r0 = r0.name()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L6a
            java.lang.String r2 = "mlink_sdk_ver"
            return r2
        L6a:
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JUNION
            java.lang.String r0 = r0.name()
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L79
            java.lang.String r2 = "junion_sdk_ver"
            return r2
        L79:
            r2 = 0
            return r2
    }

    @Override // cn.jiguang.api.JDispatchAction
    public java.lang.String getSdkVersion(java.lang.String r1) {
            r0 = this;
            cn.jiguang.api.JAction r1 = r0.a(r1)
            if (r1 == 0) goto Lb
            java.lang.String r1 = r1.getSdkVersion()
            return r1
        Lb:
            java.lang.String r1 = ""
            return r1
    }

    @Override // cn.jiguang.api.JDispatchAction
    public short getUserCtrlProperty(java.lang.String r2) {
            r1 = this;
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JPUSH
            java.lang.String r0 = r0.name()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Le
            r2 = 1
            return r2
        Le:
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JMESSAGE
            java.lang.String r0 = r0.name()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L1c
            r2 = 2
            return r2
        L1c:
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JANALYTICS
            java.lang.String r0 = r0.name()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L2a
            r2 = 4
            return r2
        L2a:
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JSHARE
            java.lang.String r0 = r0.name()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L38
            r2 = 5
            return r2
        L38:
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JAD
            java.lang.String r0 = r0.name()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L47
            r2 = 9
            return r2
        L47:
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JVERIFICATION
            java.lang.String r0 = r0.name()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L56
            r2 = 10
            return r2
        L56:
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JMLINK
            java.lang.String r0 = r0.name()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L65
            r2 = 11
            return r2
        L65:
            cn.jiguang.api.SdkType r0 = cn.jiguang.api.SdkType.JUNION
            java.lang.String r0 = r0.name()
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L74
            r2 = 12
            return r2
        L74:
            r2 = 6
            return r2
    }

    @Override // cn.jiguang.api.JDispatchAction
    public void handleMessage(android.content.Context r3, java.lang.String r4, java.lang.Object r5) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "handleMessage,sdkType:"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "SupportDispatchAction"
            cn.jiguang.at.d.b(r1, r0)
            cn.jiguang.api.JAction r4 = r2.a(r4)
            if (r4 == 0) goto L21
            r0 = 0
            r4.handleMessage(r3, r0, r5)
        L21:
            return
    }

    @Override // cn.jiguang.api.JDispatchAction
    public boolean isSupportedCMD(java.lang.String r1, int r2) {
            r0 = this;
            cn.jiguang.api.JAction r1 = r0.a(r1)
            if (r1 == 0) goto Lb
            boolean r1 = r1.isSupportedCMD(r2)
            return r1
        Lb:
            r1 = 0
            return r1
    }

    @Override // cn.jiguang.api.JDispatchAction
    public void onActionRun(android.content.Context r7, java.lang.String r8, java.lang.String r9, android.os.Bundle r10) {
            r6 = this;
            cn.jiguang.api.JAction r0 = r6.a(r8)
            if (r0 == 0) goto Le
            r2 = 0
            r5 = 0
            r1 = r7
            r4 = r10
            r0.onActionRun(r1, r2, r4, r5)
        Le:
            return
    }

    @Override // cn.jiguang.api.JDispatchAction
    public void onEvent(android.content.Context r1, java.lang.String r2, int r3, int r4, java.lang.String r5) {
            r0 = this;
            cn.jiguang.api.JAction r2 = r0.a(r2)
            if (r2 == 0) goto Lb
            r4 = 0
            r2.onEvent(r1, r4, r3)
        Lb:
            return
    }

    @Override // cn.jiguang.api.JDispatchAction
    public java.lang.Object onSendData(android.content.Context r9, java.lang.String r10, long r11, int r13, int r14) {
            r8 = this;
            cn.jiguang.api.JActionExtra r0 = r8.b(r10)
            if (r0 == 0) goto L11
            r2 = 0
            r1 = r9
            r4 = r11
            r6 = r13
            r7 = r14
            java.lang.Object r9 = r0.onSendData(r1, r2, r4, r6, r7)
            return r9
        L11:
            r9 = 0
            return r9
    }
}
