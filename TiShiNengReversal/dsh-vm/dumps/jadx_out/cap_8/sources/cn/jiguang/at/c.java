package cn.jiguang.at;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {
    int a;

    /* renamed from: b, reason: collision with root package name */
    int f659b;

    /* renamed from: c, reason: collision with root package name */
    int f660c;

    /* renamed from: d, reason: collision with root package name */
    java.lang.Long f661d;

    /* renamed from: e, reason: collision with root package name */
    int f662e;

    /* renamed from: f, reason: collision with root package name */
    long f663f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f664g;

    public c(boolean r1, int r2, int r3, int r4, long r5, int r7, long r8) {
            r0 = this;
            r0.<init>()
            r0.f664g = r1
            r0.a = r2
            r0.f659b = r3
            r0.f660c = r4
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r0.f661d = r1
            r0.f662e = r7
            r0.f663f = r8
            return
    }

    public c(boolean r11, int r12, int r13, long r14) {
            r10 = this;
            r7 = 0
            r8 = 0
            r2 = 0
            r0 = r10
            r1 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5, r7, r8)
            return
    }

    public c(boolean r5, byte[] r6) {
            r4 = this;
            r4.<init>()
            r4.f664g = r5
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6)
            short r0 = r6.getShort()
            r0 = r0 & 32767(0x7fff, float:4.5916E-41)
            r4.a = r0
            byte r0 = r6.get()
            r4.f659b = r0
            byte r0 = r6.get()
            r4.f660c = r0
            long r0 = r6.getLong()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.f661d = r0
            long r0 = r0.longValue()
            r2 = 65535(0xffff, double:3.23786E-319)
            long r0 = r0 & r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.f661d = r0
            if (r5 == 0) goto L3d
            int r5 = r6.getInt()
            r4.f662e = r5
        L3d:
            long r5 = r6.getLong()
            r4.f663f = r5
            return
    }

    public int a() {
            r1 = this;
            int r0 = r1.f660c
            return r0
    }

    public void a(int r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void a(long r1) {
            r0 = this;
            r0.f663f = r1
            return
    }

    public java.lang.Long b() {
            r1 = this;
            java.lang.Long r0 = r1.f661d
            return r0
    }

    public void b(int r1) {
            r0 = this;
            r0.f662e = r1
            return
    }

    public long c() {
            r2 = this;
            long r0 = r2.f663f
            return r0
    }

    public int d() {
            r1 = this;
            int r0 = r1.f662e
            return r0
    }

    public int e() {
            r1 = this;
            int r0 = r1.f659b
            return r0
    }

    public byte[] f() {
            r3 = this;
            int r0 = r3.a
            if (r0 == 0) goto L3b
            r0 = 24
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            int r1 = r3.a
            short r1 = (short) r1
            r0.putShort(r1)
            int r1 = r3.f659b
            byte r1 = (byte) r1
            r0.put(r1)
            int r1 = r3.f660c
            byte r1 = (byte) r1
            r0.put(r1)
            java.lang.Long r1 = r3.f661d
            long r1 = r1.longValue()
            r0.putLong(r1)
            boolean r1 = r3.f664g
            if (r1 == 0) goto L2e
            int r1 = r3.f662e
            r0.putInt(r1)
        L2e:
            long r1 = r3.f663f
            r0.putLong(r1)
            r0.flip()
            byte[] r0 = cn.jiguang.api.utils.ProtocolUtil.getBytesConsumed(r0)
            return r0
        L3b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The head is not initialized yet."
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[JHead] - len:"
            r0.append(r1)
            int r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", version:"
            r0.append(r1)
            int r1 = r3.f659b
            r0.append(r1)
            java.lang.String r1 = ", command:"
            r0.append(r1)
            int r1 = r3.f660c
            r0.append(r1)
            java.lang.String r1 = ", rid:"
            r0.append(r1)
            java.lang.Long r1 = r3.f661d
            r0.append(r1)
            boolean r1 = r3.f664g
            if (r1 == 0) goto L45
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ", sid:"
            r1.append(r2)
            int r2 = r3.f662e
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L47
        L45:
            java.lang.String r1 = ""
        L47:
            r0.append(r1)
            java.lang.String r1 = ", juid:"
            r0.append(r1)
            long r1 = r3.f663f
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
