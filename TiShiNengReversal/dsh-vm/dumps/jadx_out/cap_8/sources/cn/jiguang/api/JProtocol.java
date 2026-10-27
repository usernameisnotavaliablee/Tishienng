package cn.jiguang.api;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class JProtocol {
    public static final int DEFAULT_RESP_CODE = 0;
    public static final int DEFAULT_RID = 0;
    public static final int DEFAULT_SID = 0;
    public static final int NO_JUID = -1;
    public static final int NO_RESP_CODE = -1;
    public static final int NO_SID = -1;
    private static final int PACKET_SIZE = 7168;
    private static final java.lang.String TAG = "JProtocol";
    protected java.nio.ByteBuffer body;
    protected cn.jiguang.at.c head;
    private boolean isRequest;

    public JProtocol(boolean r7, int r8, int r9, long r10) {
            r6 = this;
            r6.<init>()
            r6.isRequest = r7
            cn.jiguang.at.c r0 = new cn.jiguang.at.c
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4)
            r6.head = r0
            r7 = 7168(0x1c00, float:1.0045E-41)
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r7)
            r6.body = r7
            return
    }

    public JProtocol(boolean r11, int r12, int r13, long r14, int r16, long r17) {
            r10 = this;
            r10.<init>()
            r10.isRequest = r11
            cn.jiguang.at.c r0 = new cn.jiguang.at.c
            r2 = 0
            r1 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r7 = r16
            r8 = r17
            r0.<init>(r1, r2, r3, r4, r5, r7, r8)
            r10.head = r0
            r11 = 7168(0x1c00, float:1.0045E-41)
            java.nio.ByteBuffer r11 = java.nio.ByteBuffer.allocate(r11)
            r10.body = r11
            return
    }

    public JProtocol(boolean r1, java.lang.Object r2, java.nio.ByteBuffer r3) {
            r0 = this;
            r0.<init>()
            r0.isRequest = r1
            cn.jiguang.at.c r2 = (cn.jiguang.at.c) r2
            r0.head = r2
            if (r3 == 0) goto L11
            r0.body = r3
            r0.parseBody()
            return
        L11:
            java.lang.String r1 = "JProtocol"
            java.lang.String r2 = "No body to parse."
            cn.jiguang.at.d.c(r1, r2)
            return
    }

    public JProtocol(boolean r3, java.nio.ByteBuffer r4, byte[] r5) {
            r2 = this;
            java.lang.String r0 = "JProtocol"
            r2.<init>()
            r2.isRequest = r3
            cn.jiguang.at.c r1 = new cn.jiguang.at.c     // Catch: java.lang.Exception -> Lf
            r1.<init>(r3, r5)     // Catch: java.lang.Exception -> Lf
            r2.head = r1     // Catch: java.lang.Exception -> Lf
            goto L28
        Lf:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "create JHead failed:"
            r5.append(r1)
            java.lang.String r3 = r3.getMessage()
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            cn.jiguang.at.d.c(r0, r3)
        L28:
            if (r4 == 0) goto L30
            r2.body = r4
            r2.parseBody()
            goto L35
        L30:
            java.lang.String r3 = "No body to parse."
            cn.jiguang.at.d.c(r0, r3)
        L35:
            return
    }

    public static byte[] parseHead(java.lang.Object r3) {
            r0 = 0
            java.lang.String r1 = "JProtocol"
            if (r3 != 0) goto Lb
            java.lang.String r3 = "object was null"
        L7:
            cn.jiguang.at.d.c(r1, r3)
            return r0
        Lb:
            boolean r2 = r3 instanceof cn.jiguang.at.c
            if (r2 == 0) goto L16
            cn.jiguang.at.c r3 = (cn.jiguang.at.c) r3
            byte[] r3 = r3.f()
            return r3
        L16:
            java.lang.String r3 = "unknow Object"
            goto L7
    }

    private final byte[] toBytes() {
            r6 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.nio.ByteBuffer r1 = r6.body
            byte[] r1 = cn.jiguang.api.utils.ProtocolUtil.getBytes(r1)
            java.lang.String r2 = "JProtocol"
            if (r1 != 0) goto L16
            java.lang.String r0 = "toBytes bodyBytes  is  null"
            cn.jiguang.at.d.c(r2, r0)
            r0 = 0
            return r0
        L16:
            cn.jiguang.at.c r3 = r6.head
            boolean r4 = r6.isRequest
            if (r4 == 0) goto L1f
            r4 = 24
            goto L21
        L1f:
            r4 = 20
        L21:
            int r5 = r1.length
            int r4 = r4 + r5
            r3.a(r4)
            cn.jiguang.at.c r3 = r6.head     // Catch: java.lang.Exception -> L32
            byte[] r3 = r3.f()     // Catch: java.lang.Exception -> L32
            r0.write(r3)     // Catch: java.lang.Exception -> L32
            r0.write(r1)     // Catch: java.lang.Exception -> L32
        L32:
            byte[] r0 = r0.toByteArray()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Final - len:"
            r1.append(r3)
            int r3 = r0.length
            r1.append(r3)
            java.lang.String r3 = ", bytes: "
            r1.append(r3)
            java.lang.String r3 = cn.jiguang.at.f.a(r0)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            cn.jiguang.at.d.b(r2, r1)
            return r0
    }

    public java.nio.ByteBuffer getBody() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.body
            return r0
    }

    public int getCommand() {
            r1 = this;
            cn.jiguang.at.c r0 = r1.head
            int r0 = r0.a()
            return r0
    }

    public cn.jiguang.at.c getHead() {
            r1 = this;
            cn.jiguang.at.c r0 = r1.head
            return r0
    }

    public long getJuid() {
            r2 = this;
            cn.jiguang.at.c r0 = r2.head
            long r0 = r0.c()
            return r0
    }

    public abstract java.lang.String getName();

    public java.lang.Long getRid() {
            r1 = this;
            cn.jiguang.at.c r0 = r1.head
            java.lang.Long r0 = r0.b()
            return r0
    }

    public int getSid() {
            r1 = this;
            cn.jiguang.at.c r0 = r1.head
            int r0 = r0.d()
            return r0
    }

    public int getVersion() {
            r1 = this;
            cn.jiguang.at.c r0 = r1.head
            int r0 = r0.e()
            return r0
    }

    protected abstract boolean isNeedParseeErrorMsg();

    protected abstract void parseBody();

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r2.isRequest
            if (r1 == 0) goto Lc
            java.lang.String r1 = "[Request]"
            goto Le
        Lc:
            java.lang.String r1 = "[Response]"
        Le:
            r0.append(r1)
            java.lang.String r1 = " - "
            r0.append(r1)
            cn.jiguang.at.c r1 = r2.head
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    protected abstract void writeBody();

    public final byte[] writeBodyAndToBytes() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.body
            r0.clear()
            r1.writeBody()
            java.nio.ByteBuffer r0 = r1.body
            r0.flip()
            byte[] r0 = r1.toBytes()
            return r0
    }

    protected void writeBytes(byte[] r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.body
            r0.put(r2)
            return
    }

    protected void writeInt1(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.body
            byte r2 = (byte) r2
            r0.put(r2)
            return
    }

    protected void writeInt2(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.body
            short r2 = (short) r2
            r0.putShort(r2)
            return
    }

    protected void writeInt4(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.body
            r0.putInt(r2)
            return
    }

    protected void writeLong8(long r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.body
            r0.putLong(r2)
            return
    }

    protected void writeTlv2(java.lang.String r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.body
            byte[] r2 = cn.jiguang.api.utils.ProtocolUtil.tlv2ToByteArray(r2)
            r0.put(r2)
            return
    }
}
