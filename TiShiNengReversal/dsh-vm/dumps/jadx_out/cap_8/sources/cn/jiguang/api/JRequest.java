package cn.jiguang.api;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class JRequest extends cn.jiguang.api.JProtocol {
    public JRequest(int r7, int r8, long r9) {
            r6 = this;
            r1 = 1
            r0 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public JRequest(java.lang.Object r2, java.nio.ByteBuffer r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r0, r2, r3)
            return
    }

    public void setJuid(long r2) {
            r1 = this;
            cn.jiguang.at.c r0 = r1.head
            r0.a(r2)
            return
    }

    public void setSid(int r2) {
            r1 = this;
            cn.jiguang.at.c r0 = r1.head
            r0.b(r2)
            return
    }
}
