package cn.jpush.android.z;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class e extends cn.jpush.android.local.JPushResponse {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    java.lang.String f2043b;

    public e(int r1, long r2, long r4, java.nio.ByteBuffer r6) {
            r0 = this;
            r0.<init>(r1, r2, r4, r6)
            r0.parseBody()
            return
    }

    public e(cn.jpush.android.local.JPushResponse r8) {
            r7 = this;
            int r1 = r8.getCmd()
            long r2 = r8.getRid()
            long r4 = r8.rquestId
            java.nio.ByteBuffer r6 = r8.getBody()
            r0 = r7
            r0.<init>(r1, r2, r4, r6)
            return
    }

    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.f2043b
            return r0
    }

    @Override // cn.jpush.android.local.JPushResponse
    protected void parseBody() {
            r4 = this;
            java.lang.String r0 = "TagaliasResponse"
            int r1 = r4.cmd     // Catch: java.lang.Throwable -> L33
            r2 = 10
            r3 = 38
            if (r1 == r2) goto Lc
            if (r1 != r3) goto L14
        Lc:
            java.nio.ByteBuffer r1 = r4.body     // Catch: java.lang.Throwable -> L33
            short r1 = r1.getShort()     // Catch: java.lang.Throwable -> L33
            r4.a = r1     // Catch: java.lang.Throwable -> L33
        L14:
            int r1 = r4.cmd     // Catch: java.lang.Throwable -> L33
            if (r1 == r3) goto L35
            int r1 = r4.a     // Catch: java.lang.Throwable -> L33
            if (r1 <= 0) goto L35
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33
            r1.<init>()     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = "Response error - code:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L33
            int r2 = r4.a     // Catch: java.lang.Throwable -> L33
            r1.append(r2)     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L33
            cn.jpush.android.helper.Logger.e(r0, r1)     // Catch: java.lang.Throwable -> L33
            return
        L33:
            r1 = move-exception
            goto L4c
        L35:
            java.nio.ByteBuffer r1 = r4.body     // Catch: java.lang.Throwable -> L33
            short r1 = r1.getShort()     // Catch: java.lang.Throwable -> L33
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L33
            java.nio.ByteBuffer r2 = r4.body     // Catch: java.lang.Throwable -> L33
            r2.get(r1)     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L33
            java.lang.String r3 = "UTF-8"
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L33
            r4.f2043b = r2     // Catch: java.lang.Throwable -> L33
            return
        L4c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "parse failed:"
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            cn.jpush.android.helper.Logger.ww(r0, r1)
            return
    }

    @Override // cn.jpush.android.local.JPushResponse
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[TagaliasResponse] - action:"
            r0.append(r1)
            java.lang.String r1 = r2.f2043b
            r0.append(r1)
            java.lang.String r1 = " - "
            r0.append(r1)
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
