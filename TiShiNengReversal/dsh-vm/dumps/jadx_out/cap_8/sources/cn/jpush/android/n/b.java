package cn.jpush.android.n;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b extends cn.jpush.android.local.JPushResponse {
    private int a;

    public b(int r1, long r2, long r4, java.nio.ByteBuffer r6) {
            r0 = this;
            r0.<init>(r1, r2, r4, r6)
            r1 = r0
            r2 = 0
            r1.a = r2
            r0.parseBody()
            return
    }

    public b(cn.jpush.android.local.JPushResponse r8) {
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
            java.lang.String r0 = "GeoControl"
            java.nio.ByteBuffer r1 = r3.body     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L22
            byte r1 = r1.get()     // Catch: java.lang.Throwable -> L23
            r3.a = r1     // Catch: java.lang.Throwable -> L23
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            r1.<init>()     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = "control type:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L23
            int r2 = r3.a     // Catch: java.lang.Throwable -> L23
            r1.append(r2)     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L23
            cn.jpush.android.helper.Logger.ww(r0, r1)     // Catch: java.lang.Throwable -> L23
        L22:
            return
        L23:
            java.lang.String r1 = "parse geoContorl failed"
            cn.jpush.android.helper.Logger.ww(r0, r1)
            return
    }

    @Override // cn.jpush.android.local.JPushResponse
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[GeoControl] - type:"
            r0.append(r1)
            int r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = " - "
            r0.append(r1)
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
