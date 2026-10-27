package cn.jpush.android.z;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c extends cn.jpush.android.local.JPushResponse {
    int a;

    /* renamed from: b, reason: collision with root package name */
    long f2038b;

    /* renamed from: c, reason: collision with root package name */
    java.lang.String f2039c;

    public c(int r1, long r2, long r4, java.nio.ByteBuffer r6) {
            r0 = this;
            r0.<init>(r1, r2, r4, r6)
            r0.parseBody()
            return
    }

    public c(cn.jpush.android.local.JPushResponse r8) {
            r7 = this;
            int r1 = r8.getCmd()
            long r2 = r8.getRid()
            long r4 = r8.rquestId
            java.nio.ByteBuffer r6 = r8.getBody()
            r0 = r7
            r0.<init>(r1, r2, r4, r6)
            return
    }

    public int a() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public long b() {
            r2 = this;
            long r0 = r2.f2038b
            return r0
    }

    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.f2039c
            return r0
    }

    @Override // cn.jpush.android.local.JPushResponse
    protected void parseBody() {
            r3 = this;
            java.nio.ByteBuffer r0 = r3.body     // Catch: java.lang.Throwable -> L29
            byte[] r0 = r0.array()     // Catch: java.lang.Throwable -> L29
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)     // Catch: java.lang.Throwable -> L29
            byte r1 = r0.get()     // Catch: java.lang.Throwable -> L29
            r3.a = r1     // Catch: java.lang.Throwable -> L29
            long r1 = r0.getLong()     // Catch: java.lang.Throwable -> L29
            r3.f2038b = r1     // Catch: java.lang.Throwable -> L29
            short r1 = r0.getShort()     // Catch: java.lang.Throwable -> L29
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L29
            r0.get(r1)     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = "UTF-8"
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L29
            r3.f2039c = r0     // Catch: java.lang.Throwable -> L29
            return
        L29:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "parse msg content failed, e: "
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "MessagePush"
            cn.jpush.android.helper.Logger.ww(r1, r0)
            return
    }

    @Override // cn.jpush.android.local.JPushResponse
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[MessagePush] - msgType:"
            r0.append(r1)
            int r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", msgId:"
            r0.append(r1)
            long r1 = r3.f2038b
            r0.append(r1)
            java.lang.String r1 = ", msgContent:"
            r0.append(r1)
            java.lang.String r1 = r3.f2039c
            r0.append(r1)
            java.lang.String r1 = " - "
            r0.append(r1)
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
