package cn.jpush.android.z;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a extends cn.jpush.android.local.JPushResponse {
    private int a;

    public a(int r1, long r2, long r4, java.nio.ByteBuffer r6) {
            r0 = this;
            r0.<init>(r1, r2, r4, r6)
            r0.parseBody()
            return
    }

    public a(cn.jpush.android.local.JPushResponse r8) {
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

    @Override // cn.jpush.android.local.JPushResponse
    protected void parseBody() {
            r3 = this;
            java.nio.ByteBuffer r0 = r3.body     // Catch: java.lang.Throwable -> L9
            short r0 = r0.getShort()     // Catch: java.lang.Throwable -> L9
            r3.a = r0     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "parse code failed :"
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "CommonResponse"
            cn.jpush.android.helper.Logger.ww(r1, r0)
            return
    }

    @Override // cn.jpush.android.local.JPushResponse
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[CommonResponse] - "
            r0.append(r1)
            int r1 = r2.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
