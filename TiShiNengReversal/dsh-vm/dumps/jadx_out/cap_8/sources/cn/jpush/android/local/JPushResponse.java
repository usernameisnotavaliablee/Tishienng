package cn.jpush.android.local;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class JPushResponse {
    public java.nio.ByteBuffer body;
    public int cmd;
    public long rid;
    public long rquestId;

    public JPushResponse(int r1, long r2, long r4, java.nio.ByteBuffer r6) {
            r0 = this;
            r0.<init>()
            r0.cmd = r1
            r0.rid = r2
            r0.body = r6
            r0.rquestId = r4
            return
    }

    public java.nio.ByteBuffer getBody() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.body
            return r0
    }

    public int getCmd() {
            r1 = this;
            int r0 = r1.cmd
            return r0
    }

    public long getRid() {
            r2 = this;
            long r0 = r2.rid
            return r0
    }

    public long getRquestId() {
            r2 = this;
            long r0 = r2.rquestId
            return r0
    }

    protected void parseBody() {
            r0 = this;
            return
    }

    public void setBody(java.nio.ByteBuffer r1) {
            r0 = this;
            r0.body = r1
            return
    }

    public void setCmd(int r1) {
            r0 = this;
            r0.cmd = r1
            return
    }

    public void setRid(long r1) {
            r0 = this;
            r0.rid = r1
            return
    }

    public void setRquestId(long r1) {
            r0 = this;
            r0.rquestId = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "JPushResponse{cmd="
            r0.append(r1)
            int r1 = r3.cmd
            r0.append(r1)
            java.lang.String r1 = ", rid="
            r0.append(r1)
            long r1 = r3.rid
            r0.append(r1)
            java.lang.String r1 = ", rquestId="
            r0.append(r1)
            long r1 = r3.rquestId
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
