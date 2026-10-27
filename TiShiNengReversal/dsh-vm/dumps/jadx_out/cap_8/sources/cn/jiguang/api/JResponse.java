package cn.jiguang.api;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class JResponse extends cn.jiguang.api.JProtocol {
    public int code;

    public JResponse(int r10, int r11, long r12, long r14, int r16, java.lang.String r17) {
            r9 = this;
            r1 = 0
            r6 = -1
            r0 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r6, r7)
            r10 = r16
            r9.code = r10
            return
    }

    public JResponse(java.lang.Object r2, java.nio.ByteBuffer r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2, r3)
            return
    }

    public JResponse(java.nio.ByteBuffer r2, byte[] r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2, r3)
            return
    }

    @Override // cn.jiguang.api.JProtocol
    protected void parseBody() {
            r1 = this;
            boolean r0 = r1.isNeedParseeErrorMsg()
            if (r0 == 0) goto Le
            java.nio.ByteBuffer r0 = r1.body
            short r0 = cn.jiguang.api.utils.ByteBufferUtils.getShort(r0, r1)
            r1.code = r0
        Le:
            return
    }

    @Override // cn.jiguang.api.JProtocol
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "JResponse{code="
            r0.append(r1)
            int r1 = r2.code
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // cn.jiguang.api.JProtocol
    protected void writeBody() {
            r1 = this;
            int r0 = r1.code
            if (r0 < 0) goto L7
            r1.writeInt2(r0)
        L7:
            return
    }
}
