package cn.jpush.android.api;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class CmdMessage {
    public int cmd;
    public int errorCode;
    public android.os.Bundle extra;
    public java.lang.String msg;

    public CmdMessage(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.cmd = r1
            r0.errorCode = r2
            return
    }

    public CmdMessage(int r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.cmd = r1
            r0.errorCode = r2
            r0.msg = r3
            return
    }

    public CmdMessage(int r1, int r2, java.lang.String r3, android.os.Bundle r4) {
            r0 = this;
            r0.<init>()
            r0.cmd = r1
            r0.errorCode = r2
            r0.msg = r3
            r0.extra = r4
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "CmdMessage{cmd="
            r0.append(r1)
            int r1 = r2.cmd
            r0.append(r1)
            java.lang.String r1 = ", errorCode="
            r0.append(r1)
            int r1 = r2.errorCode
            r0.append(r1)
            java.lang.String r1 = ", msg='"
            r0.append(r1)
            java.lang.String r1 = r2.msg
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r1 = ", extra="
            r0.append(r1)
            android.os.Bundle r1 = r2.extra
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
